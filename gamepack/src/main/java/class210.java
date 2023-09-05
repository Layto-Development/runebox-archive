import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfInfo(name = "qa")
public class class210 implements Runnable {
	@ObfInfo(name = "at", desc = "[B")
	byte[] field1876;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1238626583)
	int field1874;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1284050803)
	int field1875;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -153905879)
	int field1877;
	@ObfInfo(name = "az", desc = "Ljava/io/IOException;")
	IOException field1878;
	@ObfInfo(name = "ae", desc = "Ljava/io/InputStream;")
	InputStream field1879;
	@ObfInfo(name = "au", desc = "Ljava/lang/Thread;")
	Thread field1873;

	@ObfInfo(name = "<init>", desc = "(Ljava/io/InputStream;I)V")
	class210(InputStream var1, int var2) {
		this.field1877 = 0;
		this.field1874 = 0;
		this.field1879 = var1;
		this.field1875 = var2 + 1;
		this.field1876 = new byte[this.field1875];
		this.field1873 = new Thread(this);
		this.field1873.setDaemon(true);
		this.field1873.start();
	}

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (null != this.field1878) {
						return;
					}

					if (this.field1877 == 0) {
						var1 = this.field1875 - this.field1874 - 1;
					} else if (this.field1877 <= this.field1874) {
						var1 = this.field1875 - this.field1874;
					} else {
						var1 = this.field1877 - this.field1874 - 1;
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
				var2 = this.field1879.read(this.field1876, this.field1874, var1);
				if (var2 == -1) {
					throw new EOFException();
				}
			} catch (IOException var10) {
				IOException var3 = var10;
				synchronized(this) {
					this.field1878 = var3;
					return;
				}
			}

			synchronized(this) {
				this.field1874 = (this.field1874 + var2) % this.field1875;
			}
		}
	}

	@ObfInfo(name = "au", desc = "(IB)Z", opaqueValue = "-1")
	boolean method1161(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.field1875) {
			synchronized(this) {
				int var4;
				if (this.field1877 <= this.field1874) {
					var4 = this.field1874 - this.field1877;
				} else {
					var4 = this.field1875 - this.field1877 + this.field1874;
				}

				if (var4 < var1) {
					if (this.field1878 != null) {
						throw new IOException(this.field1878.toString());
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

	@ObfInfo(name = "ae", desc = "(I)I", opaqueValue = "-1797112286")
	int method1165() throws IOException {
		synchronized(this) {
			int var3;
			if (this.field1877 <= this.field1874) {
				var3 = this.field1874 - this.field1877;
			} else {
				var3 = this.field1875 - this.field1877 + this.field1874;
			}

			if (var3 <= 0 && this.field1878 != null) {
				throw new IOException(this.field1878.toString());
			} else {
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(B)I", opaqueValue = "2")
	int method1162() throws IOException {
		synchronized(this) {
			if (this.field1877 == this.field1874) {
				if (this.field1878 != null) {
					throw new IOException(this.field1878.toString());
				} else {
					return -1;
				}
			} else {
				int var3 = this.field1876[this.field1877] & 255;
				this.field1877 = (this.field1877 + 1) % this.field1875;
				this.notifyAll();
				return var3;
			}
		}
	}

	@ObfInfo(name = "at", desc = "([BIII)I", opaqueValue = "360959196")
	int method1163(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
			synchronized(this) {
				int var6;
				if (this.field1877 <= this.field1874) {
					var6 = this.field1874 - this.field1877;
				} else {
					var6 = this.field1874 + (this.field1875 - this.field1877);
				}

				if (var3 > var6) {
					var3 = var6;
				}

				if (var3 == 0 && null != this.field1878) {
					throw new IOException(this.field1878.toString());
				} else {
					if (this.field1877 + var3 <= this.field1875) {
						System.arraycopy(this.field1876, this.field1877, var1, var2, var3);
					} else {
						int var7 = this.field1875 - this.field1877;
						System.arraycopy(this.field1876, this.field1877, var1, var2, var7);
						System.arraycopy(this.field1876, 0, var1, var7 + var2, var3 - var7);
					}

					this.field1877 = (this.field1877 + var3) % this.field1875;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfInfo(name = "ac", desc = "(S)V", opaqueValue = "6525")
	void method1164() {
		synchronized(this) {
			if (null == this.field1878) {
				this.field1878 = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.field1873.join();
		} catch (InterruptedException var4) {
		}

	}

	@ObfInfo(name = "au", desc = "(Lnu;B)V")
	public static void method1160(class437 var0) {
		class96.field962 = var0;
	}
}
