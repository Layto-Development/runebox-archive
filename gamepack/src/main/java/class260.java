import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class260 implements Runnable {
	byte[] field2375;
	int field2373;
	int field2374;
	int field2376;
	IOException field2377;
	InputStream field2378;
	Thread field2372;

	class260(InputStream var1, int var2) {
		this.field2376 = 0;
		this.field2373 = 0;
		this.field2378 = var1;
		this.field2374 = var2 + 1;
		this.field2375 = new byte[this.field2374];
		this.field2372 = new Thread(this);
		this.field2372.setDaemon(true);
		this.field2372.start();
	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (null != this.field2377) {
						return;
					}

					if (this.field2376 == 0) {
						var1 = this.field2374 - this.field2373 - 1;
					} else if (this.field2376 <= this.field2373) {
						var1 = this.field2374 - this.field2373;
					} else {
						var1 = this.field2376 - this.field2373 - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var9) {
					}
				}
			}

			int var2;
			try {
				var2 = this.field2378.read(this.field2375, this.field2373, var1);
				if (var2 == -1) {
					throw new EOFException();
				}
			} catch (IOException var10) {
				IOException var3 = var10;
				synchronized(this) {
					this.field2377 = var3;
					return;
				}
			}

			synchronized(this) {
				this.field2373 = (this.field2373 + var2) % this.field2374;
			}
		}
	}

	boolean method1511(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field2374) {
			synchronized(this) {
				int var4;
				if (this.field2376 <= this.field2373) {
					var4 = this.field2373 - this.field2376;
				} else {
					var4 = this.field2374 - this.field2376 + this.field2373;
				}

				if (var4 < var1) {
					if (this.field2377 != null) {
						throw new IOException(this.field2377.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	int method1515() throws IOException {
		synchronized(this) {
			int var3;
			if (this.field2376 <= this.field2373) {
				var3 = this.field2373 - this.field2376;
			} else {
				var3 = this.field2374 - this.field2376 + this.field2373;
			}

			if (var3 <= 0 && this.field2377 != null) {
				throw new IOException(this.field2377.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	int method1512() throws IOException {
		synchronized(this) {
			if (this.field2376 == this.field2373) {
				if (this.field2377 != null) {
					throw new IOException(this.field2377.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field2375[this.field2376] & 255;
				this.field2376 = (this.field2376 + 1) % this.field2374;
				this.notifyAll();
				return var3;
			}
		}
	}

	int method1513(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				int var6;
				if (this.field2376 <= this.field2373) {
					var6 = this.field2373 - this.field2376;
				} else {
					var6 = this.field2373 + (this.field2374 - this.field2376);
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && null != this.field2377) {
					throw new IOException(this.field2377.toString());
				} else {
					if (this.field2376 + var3 <= this.field2374) {
						System.arraycopy(this.field2375, this.field2376, var1, var2, var3);
					} else {
						int var7 = this.field2374 - this.field2376;
						System.arraycopy(this.field2375, this.field2376, var1, var2, var7);
						System.arraycopy(this.field2375, 0, var1, var7 + var2, var3 - var7);
					}

					this.field2376 = (this.field2376 + var3) % this.field2374;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method1514() {
		synchronized(this) {
			if (null == this.field2377) {
				this.field2377 = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.field2372.join();
		} catch (InterruptedException var4) {
		}

	}

	public static void method1510(class215 var0) {
		class101.field1013 = var0;
	}
}
