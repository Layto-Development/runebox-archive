import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class148 implements Runnable {

	byte[] field1560;

	int field1558;

	int field1559;

	int field1561;

	IOException field1562;

	InputStream field1563;

	Thread field1557;

	class148(InputStream var1, int var2) {
		this.field1561 = 0;
		this.field1558 = 0;
		this.field1563 = var1;
		this.field1559 = var2 + 1;
		this.field1560 = new byte[this.field1559];
		this.field1557 = new Thread(this);
		this.field1557.setDaemon(true);
		this.field1557.start();
	}

	@Override
	public void run() {
		while (true) {
			int var1;
			synchronized (this) {
				while (true) {
					if (null != this.field1562) {
						return;
					}
					if (this.field1561 == 0) {
						var1 = this.field1559 - this.field1558 - 1;
					} else if (this.field1561 <= this.field1558) {
						var1 = this.field1559 - this.field1558;
					} else {
						var1 = this.field1561 - this.field1558 - 1;
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
				var2 = this.field1563.read(this.field1560, this.field1558, var1);
				if (var2 == -1) {
					throw new EOFException();
				}
			} catch (IOException var10) {
				IOException var3 = var10;
				synchronized (this) {
					this.field1562 = var3;
					return;
				}
			}
			synchronized (this) {
				this.field1558 = (this.field1558 + var2) % this.field1559;
			}
		}
	}

	boolean method899(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field1559) {
			synchronized (this) {
				int var4;
				if (this.field1561 <= this.field1558) {
					var4 = this.field1558 - this.field1561;
				} else {
					var4 = this.field1559 - this.field1561 + this.field1558;
				}
				if (var4 < var1) {
					if (this.field1562 != null) {
						throw new IOException(this.field1562.toString());
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

	int method903() throws IOException {
		synchronized (this) {
			int var3;
			if (this.field1561 <= this.field1558) {
				var3 = this.field1558 - this.field1561;
			} else {
				var3 = this.field1559 - this.field1561 + this.field1558;
			}
			if (var3 <= 0 && this.field1562 != null) {
				throw new IOException(this.field1562.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	int method900() throws IOException {
		synchronized (this) {
			if (this.field1561 == this.field1558) {
				if (this.field1562 != null) {
					throw new IOException(this.field1562.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field1560[this.field1561] & 255;
				this.field1561 = (this.field1561 + 1) % this.field1559;
				this.notifyAll();
				return var3;
			}
		}
	}

	int method901(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized (this) {
				int var6;
				if (this.field1561 <= this.field1558) {
					var6 = this.field1558 - this.field1561;
				} else {
					var6 = this.field1558 + (this.field1559 - this.field1561);
				}
				if (var3 > var6) {
					var3 = var6;
				}
				if (var3 == 0 && null != this.field1562) {
					throw new IOException(this.field1562.toString());
				} else {
					if (this.field1561 + var3 <= this.field1559) {
						System.arraycopy(this.field1560, this.field1561, var1, var2, var3);
					} else {
						int var7 = this.field1559 - this.field1561;
						System.arraycopy(this.field1560, this.field1561, var1, var2, var7);
						System.arraycopy(this.field1560, 0, var1, var7 + var2, var3 - var7);
					}
					this.field1561 = (this.field1561 + var3) % this.field1559;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method902() {
		synchronized (this) {
			if (null == this.field1562) {
				this.field1562 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.field1557.join();
		} catch (InterruptedException var4) {
		}
	}

	public static void method898(class338 var0) {
		class251.field2121 = var0;
	}
}
