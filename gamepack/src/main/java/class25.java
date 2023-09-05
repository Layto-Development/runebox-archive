import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.EOFException;
import java.io.IOException;

@ObfInfo(name = "td")
public class class25 {
	@ObfInfo(name = "ao", desc = "[B")
	byte[] field412;
	@ObfInfo(name = "ai", desc = "[B")
	byte[] field415;
	@ObfInfo(name = "ae", desc = "Ltu;")
	class408 field419;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 545194329)
	int field411;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -2139219705)
	int field414;
	@ObfInfo(name = "at", desc = "J", longMultiplier = -2904168622143738057L)
	long field410;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = 6767801517363997331L)
	long field413;
	@ObfInfo(name = "az", desc = "J", longMultiplier = -2930988742004504479L)
	long field416;
	@ObfInfo(name = "aa", desc = "J", longMultiplier = -9090564811559186217L)
	long field417;
	@ObfInfo(name = "af", desc = "J", longMultiplier = 1090227964104097363L)
	long field418;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -1391996861482720007L)
	long field420;

	@ObfInfo(name = "<init>", desc = "(Ltu;II)V")
	public class25(class408 var1, int var2, int var3) throws IOException {
		this.field410 = -1L;
		this.field416 = -1L;
		this.field411 = 0;
		this.field419 = var1;
		this.field413 = this.field418 = var1.method2137();
		this.field412 = new byte[var2];
		this.field415 = new byte[var3];
		this.field417 = 0L;
	}

	@ObfInfo(name = "au", desc = "(B)V")
	public void method345() throws IOException {
		this.method351();
		this.field419.method2139();
	}

	@ObfInfo(name = "ae", desc = "(J)V")
	public void method346(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field417 = var1;
		}
	}

	@ObfInfo(name = "ao", desc = "(B)J")
	public long method352() {
		return this.field413;
	}

	@ObfInfo(name = "at", desc = "([BI)V")
	public void method347(byte[] var1) throws IOException {
		this.method348(var1, 0, var1.length);
	}

	@ObfInfo(name = "ac", desc = "([BIII)V", opaqueValue = "574146047")
	public void method348(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (-1L != this.field416 && this.field417 >= this.field416 && this.field417 + (long)var3 <= this.field416 + (long)this.field411) {
				System.arraycopy(this.field415, (int)(this.field417 - this.field416), var1, var2, var3);
				this.field417 += (long)var3;
				return;
			}

			long var5 = this.field417;
			int var8 = var3;
			int var9;
			if (this.field417 >= this.field410 && this.field417 < this.field410 + (long)this.field414) {
				var9 = (int)((long)this.field414 - (this.field417 - this.field410));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field412, (int)(this.field417 - this.field410), var1, var2, var9);
				this.field417 += (long)var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.field412.length) {
				this.field419.method2135(this.field417);

				for (this.field420 = this.field417; var3 > 0; var3 -= var9) {
					var9 = this.field419.method2138(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field420 += (long)var9;
					this.field417 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method349();
				var9 = var3;
				if (var3 > this.field414) {
					var9 = this.field414;
				}

				System.arraycopy(this.field412, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field417 += (long)var9;
			}

			if (-1L != this.field416) {
				if (this.field416 > this.field417 && var3 > 0) {
					var9 = var2 + (int)(this.field416 - this.field417);
					if (var9 > var2 + var3) {
						var9 = var2 + var3;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field417;
					}
				}

				long var15 = -1L;
				long var11 = -1L;
				if (this.field416 >= var5 && this.field416 < (long)var8 + var5) {
					var15 = this.field416;
				} else if (var5 >= this.field416 && var5 < this.field416 + (long)this.field411) {
					var15 = var5;
				}

				if (this.field416 + (long)this.field411 > var5 && (long)this.field411 + this.field416 <= (long)var8 + var5) {
					var11 = this.field416 + (long)this.field411;
				} else if (var5 + (long)var8 > this.field416 && var5 + (long)var8 <= (long)this.field411 + this.field416) {
					var11 = (long)var8 + var5;
				}

				if (var15 > -1L && var11 > var15) {
					int var13 = (int)(var11 - var15);
					System.arraycopy(this.field415, (int)(var15 - this.field416), var1, (int)(var15 - var5) + var2, var13);
					if (var11 > this.field417) {
						var3 = (int)((long)var3 - (var11 - this.field417));
						this.field417 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field420 = -1L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	@ObfInfo(name = "ai", desc = "(I)V", opaqueValue = "-2117714945")
	void method349() throws IOException {
		this.field414 = 0;
		if (this.field417 != this.field420) {
			this.field419.method2135(this.field417);
			this.field420 = this.field417;
		}

		int var3;
		for (this.field410 = this.field417; this.field414 < this.field412.length; this.field414 += var3) {
			int var2 = this.field412.length - this.field414;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field419.method2138(this.field412, this.field414, var2);
			if (var3 == -1) {
				break;
			}

			this.field420 += (long)var3;
		}

	}

	@ObfInfo(name = "az", desc = "([BIII)V", opaqueValue = "429799429")
	public void method350(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.field417 > this.field413) {
				this.field413 = this.field417 + (long)var3;
			}

			if (-1L != this.field416 && (this.field417 < this.field416 || this.field417 > (long)this.field411 + this.field416)) {
				this.method351();
			}

			if (-1L != this.field416 && (long)var3 + this.field417 > (long)this.field415.length + this.field416) {
				int var5 = (int)((long)this.field415.length - (this.field417 - this.field416));
				System.arraycopy(var1, var2, this.field415, (int)(this.field417 - this.field416), var5);
				this.field417 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field411 = this.field415.length;
				this.method351();
			}

			if (var3 <= this.field415.length) {
				if (var3 > 0) {
					if (-1L == this.field416) {
						this.field416 = this.field417;
					}

					System.arraycopy(var1, var2, this.field415, (int)(this.field417 - this.field416), var3);
					this.field417 += (long)var3;
					if (this.field417 - this.field416 > (long)this.field411) {
						this.field411 = (int)(this.field417 - this.field416);
					}

				}
			} else {
				if (this.field417 != this.field420) {
					this.field419.method2135(this.field417);
					this.field420 = this.field417;
				}

				this.field419.method2136(var1, var2, var3);
				this.field420 += (long)var3;
				if (this.field420 > this.field418) {
					this.field418 = this.field420;
				}

				long var11 = -1L;
				long var7 = -1L;
				if (this.field417 >= this.field410 && this.field417 < this.field410 + (long)this.field414) {
					var11 = this.field417;
				} else if (this.field410 >= this.field417 && this.field410 < (long)var3 + this.field417) {
					var11 = this.field410;
				}

				if ((long)var3 + this.field417 > this.field410 && (long)var3 + this.field417 <= this.field410 + (long)this.field414) {
					var7 = this.field417 + (long)var3;
				} else if ((long)this.field414 + this.field410 > this.field417 && this.field410 + (long)this.field414 <= (long)var3 + this.field417) {
					var7 = this.field410 + (long)this.field414;
				}

				if (var11 > -1L && var7 > var11) {
					int var9 = (int)(var7 - var11);
					System.arraycopy(var1, (int)(var11 + (long)var2 - this.field417), this.field412, (int)(var11 - this.field410), var9);
				}

				this.field417 += (long)var3;
			}
		} catch (IOException var10) {
			this.field420 = -1L;
			throw var10;
		}
	}

	@ObfInfo(name = "ap", desc = "(I)V", opaqueValue = "-1104225308")
	void method351() throws IOException {
		if (this.field416 != -1L) {
			if (this.field416 != this.field420) {
				this.field419.method2135(this.field416);
				this.field420 = this.field416;
			}

			this.field419.method2136(this.field415, 0, this.field411);
			this.field420 += (long)this.field411;
			if (this.field420 > this.field418) {
				this.field418 = this.field420;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field416 >= this.field410 && this.field416 < (long)this.field414 + this.field410) {
				var2 = this.field416;
			} else if (this.field410 >= this.field416 && this.field410 < this.field416 + (long)this.field411) {
				var2 = this.field410;
			}

			if (this.field416 + (long)this.field411 > this.field410 && this.field416 + (long)this.field411 <= this.field410 + (long)this.field414) {
				var4 = this.field416 + (long)this.field411;
			} else if (this.field410 + (long)this.field414 > this.field416 && (long)this.field414 + this.field410 <= this.field416 + (long)this.field411) {
				var4 = this.field410 + (long)this.field414;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field415, (int)(var2 - this.field416), this.field412, (int)(var2 - this.field410), var6);
			}

			this.field416 = -1L;
			this.field411 = 0;
		}

	}
}
