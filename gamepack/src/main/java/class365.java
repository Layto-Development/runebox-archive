import java.io.IOException;
import java.io.OutputStream;

public class class365 implements Runnable {
	boolean field3077;
	byte[] field3078;
	int field3075;
	int field3079;
	int field3080;
	IOException field3081;
	OutputStream field3076;
	Thread field3082;

	class365(OutputStream var1, int var2) {
		this.field3079 = 0;
		this.field3080 = 0;
		this.field3076 = var1;
		this.field3075 = var2 + 1;
		this.field3078 = new byte[this.field3075];
		this.field3082 = new Thread(this);
		this.field3082.setDaemon(true);
		this.field3082.start();
	}

	boolean method1966() {
		if (this.field3077) {
			try {
				this.field3076.close();
				if (null == this.field3081) {
					this.field3081 = new IOException("");
				}
			} catch (IOException var3) {
				if (null == this.field3081) {
					this.field3081 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field3081 != null) {
						return;
					}

					if (this.field3079 <= this.field3080) {
						var1 = this.field3080 - this.field3079;
					} else {
						var1 = this.field3080 + (this.field3075 - this.field3079);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field3076.flush();
					} catch (IOException var10) {
						this.field3081 = var10;
						return;
					}

					if (this.method1966()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.field3079 <= this.field3075) {
					this.field3076.write(this.field3078, this.field3079, var1);
				} else {
					int var13 = this.field3075 - this.field3079;
					this.field3076.write(this.field3078, this.field3079, var13);
					this.field3076.write(this.field3078, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized(this) {
					this.field3081 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field3079 = (var1 + this.field3079) % this.field3075;
			}
		} while(!this.method1966());

	}

	void method1965(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				if (this.field3081 != null) {
					throw new IOException(this.field3081.toString());
				} else {
					int var6;
					if (this.field3079 <= this.field3080) {
						var6 = this.field3075 - this.field3080 + this.field3079 - 1;
					} else {
						var6 = this.field3079 - this.field3080 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (this.field3080 + var3 <= this.field3075) {
							System.arraycopy(var1, var2, this.field3078, this.field3080, var3);
						} else {
							int var7 = this.field3075 - this.field3080;
							System.arraycopy(var1, var2, this.field3078, this.field3080, var7);
							System.arraycopy(var1, var7 + var2, this.field3078, 0, var3 - var7);
						}

						this.field3080 = (this.field3080 + var3) % this.field3075;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method1964() {
		synchronized(this) {
			this.field3077 = true;
			this.notifyAll();
		}

		try {
			this.field3082.join();
		} catch (InterruptedException var4) {
		}

	}
}
