import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;
import java.io.OutputStream;

@ObfInfo(name = "qh")
public class class364 implements Runnable {
	@ObfInfo(name = "ap", desc = "Z")
	boolean field2828;
	@ObfInfo(name = "at", desc = "[B")
	byte[] field2829;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1807946919)
	int field2826;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 168230827)
	int field2830;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 220465503)
	int field2831;
	@ObfInfo(name = "az", desc = "Ljava/io/IOException;")
	IOException field2832;
	@ObfInfo(name = "ae", desc = "Ljava/io/OutputStream;")
	OutputStream field2827;
	@ObfInfo(name = "au", desc = "Ljava/lang/Thread;")
	Thread field2833;

	@ObfInfo(name = "<init>", desc = "(Ljava/io/OutputStream;I)V")
	class364(OutputStream var1, int var2) {
		this.field2830 = 0;
		this.field2831 = 0;
		this.field2827 = var1;
		this.field2826 = var2 + 1;
		this.field2829 = new byte[this.field2826];
		this.field2833 = new Thread(this);
		this.field2833.setDaemon(true);
		this.field2833.start();
	}

	@ObfInfo(name = "au", desc = "(S)Z", opaqueValue = "7464")
	boolean method1994() {
		if (this.field2828) {
			try {
				this.field2827.close();
				if (null == this.field2832) {
					this.field2832 = new IOException("");
				}
			} catch (IOException var3) {
				if (null == this.field2832) {
					this.field2832 = new IOException(var3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.field2832 != null) {
						return;
					}

					if (this.field2830 <= this.field2831) {
						var1 = this.field2831 - this.field2830;
					} else {
						var1 = this.field2831 + (this.field2826 - this.field2830);
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.field2827.flush();
					} catch (IOException var10) {
						this.field2832 = var10;
						return;
					}

					if (this.method1994()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}

			try {
				if (var1 + this.field2830 <= this.field2826) {
					this.field2827.write(this.field2829, this.field2830, var1);
				} else {
					int var13 = this.field2826 - this.field2830;
					this.field2827.write(this.field2829, this.field2830, var13);
					this.field2827.write(this.field2829, 0, var1 - var13);
				}
			} catch (IOException var9) {
				IOException var2 = var9;
				synchronized(this) {
					this.field2832 = var2;
					return;
				}
			}

			synchronized(this) {
				this.field2830 = (var1 + this.field2830) % this.field2826;
			}
		} while(!this.method1994());

	}

	@ObfInfo(name = "ae", desc = "([BIIB)V", opaqueValue = "1")
	void method1993(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				if (this.field2832 != null) {
					throw new IOException(this.field2832.toString());
				} else {
					int var6;
					if (this.field2830 <= this.field2831) {
						var6 = this.field2826 - this.field2831 + this.field2830 - 1;
					} else {
						var6 = this.field2830 - this.field2831 - 1;
					}

					if (var6 < var3) {
						throw new IOException("");
					} else {
						if (this.field2831 + var3 <= this.field2826) {
							System.arraycopy(var1, var2, this.field2829, this.field2831, var3);
						} else {
							int var7 = this.field2826 - this.field2831;
							System.arraycopy(var1, var2, this.field2829, this.field2831, var7);
							System.arraycopy(var1, var7 + var2, this.field2829, 0, var3 - var7);
						}

						this.field2831 = (this.field2831 + var3) % this.field2826;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	void method1992() {
		synchronized(this) {
			this.field2828 = true;
			this.notifyAll();
		}

		try {
			this.field2833.join();
		} catch (InterruptedException var4) {
		}

	}
}
