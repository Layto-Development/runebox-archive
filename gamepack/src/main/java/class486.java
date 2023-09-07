import java.io.IOException;
import java.io.OutputStream;

public class class486 implements Runnable {

	boolean field3900;

	byte[] field3901;

	int field3898;

	int field3902;

	int field3903;

	IOException field3904;

	OutputStream field3899;

	Thread field3905;

	class486(OutputStream var1, int var2) {
		this.field3902 = 0;
		this.field3903 = 0;
		this.field3899 = var1;
		this.field3898 = var2 + 1;
		this.field3901 = new byte[this.field3898];
		this.field3905 = new Thread(this);
		this.field3905.setDaemon(true);
		this.field3905.start();
	}

	boolean method2343() {
		if (this.field3900) {
			try {
				this.field3899.close();
				if (null == this.field3904) {
					this.field3904 = new IOException("");
				}
			} catch (IOException var3) {
				if (null == this.field3904) {
					this.field3904 = new IOException(var3);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void run() {
		do {
			int var1;
			synchronized (this) {
				while (true) {
					if (this.field3904 != null) {
						return;
					}
					if (this.field3902 <= this.field3903) {
						var1 = this.field3903 - this.field3902;
					} else {
						var1 = this.field3903 + (this.field3898 - this.field3902);
					}
					if (var1 > 0) {
						break;
					}
					try {
						this.field3899.flush();
					} catch (IOException var10) {
						this.field3904 = var10;
						return;
					}
					if (this.method2343()) {
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}
			try {
				if (var1 + this.field3902 <= this.field3898) {
					this.field3899.write(this.field3901, this.field3902, var1);
				} else {
					int var13 = this.field3898 - this.field3902;
					this.field3899.write(this.field3901, this.field3902, var13);
					this.field3899.write(this.field3901, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized (this) {
					this.field3904 = var2;
					return;
				}
			}
			synchronized (this) {
				this.field3902 = (var1 + this.field3902) % this.field3898;
			}
		} while (!this.method2343());
	}

	void method2342(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && 0 + var3 <= var1.length) {
			synchronized (this) {
				if (this.field3904 != null) {
					throw new IOException(this.field3904.toString());
				} else {
					int var6;
					if (this.field3902 <= this.field3903) {
						var6 = this.field3898 - this.field3903 + this.field3902 - 1;
					} else {
						var6 = this.field3902 - this.field3903 - 1;
					}
					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (this.field3903 + var3 <= this.field3898) {
							System.arraycopy(var1, 0, this.field3901, this.field3903, var3);
						} else {
							int var7 = this.field3898 - this.field3903;
							System.arraycopy(var1, 0, this.field3901, this.field3903, var7);
							System.arraycopy(var1, var7 + 0, this.field3901, 0, var3 - var7);
						}
						this.field3903 = (this.field3903 + var3) % this.field3898;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method2341() {
		synchronized (this) {
			this.field3900 = true;
			this.notifyAll();
		}
		try {
			this.field3905.join();
		} catch (InterruptedException var4) {
		}
	}
}
