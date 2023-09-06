import java.io.EOFException;
import java.io.IOException;

public class class413 {
	byte[] field3447;
	byte[] field3450;
	class307 field3454;
	int field3446;
	int field3449;
	long field3445;
	long field3448;
	long field3451;
	long field3452;
	long field3453;
	long field3455;

	public class413(class307 var1, int var2, int var3) throws IOException {
		this.field3445 = -1L;
		this.field3451 = -1L;
		this.field3446 = 0;
		this.field3454 = var1;
		this.field3448 = this.field3453 = var1.method1736();
		this.field3447 = new byte[var2];
		this.field3450 = new byte[var3];
		this.field3452 = 0L;
	}

	public void method2125() throws IOException {
		this.method2131();
		this.field3454.method1738();
	}

	public void method2126(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field3452 = var1;
		}
	}

	public long method2132() {
		return this.field3448;
	}

	public void method2127(byte[] var1) throws IOException {
		this.method2128(var1, 0, var1.length);
	}

	public void method2128(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var2 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (-1L != this.field3451 && this.field3452 >= this.field3451 && this.field3452 + (long)var3 <= this.field3451 + (long)this.field3446) {
				System.arraycopy(this.field3450, (int)(this.field3452 - this.field3451), var1, var2, var3);
				this.field3452 += (long)var3;
				return;
			}

			long var5 = this.field3452;
			int var8 = var3;
			int var9;
			if (this.field3452 >= this.field3445 && this.field3452 < this.field3445 + (long)this.field3449) {
				var9 = (int)((long)this.field3449 - (this.field3452 - this.field3445));
				if (var9 > var3) {
					var9 = var3;
				}

				System.arraycopy(this.field3447, (int)(this.field3452 - this.field3445), var1, var2, var9);
				this.field3452 += (long)var9;
				var2 += var9;
				var3 -= var9;
			}

			if (var3 > this.field3447.length) {
				this.field3454.method1734(this.field3452);

				for (this.field3455 = this.field3452; var3 > 0; var3 -= var9) {
					var9 = this.field3454.method1737(var1, var2, var3);
					if (var9 == -1) {
						break;
					}

					this.field3455 += (long)var9;
					this.field3452 += (long)var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method2129();
				var9 = var3;
				if (var3 > this.field3449) {
					var9 = this.field3449;
				}

				System.arraycopy(this.field3447, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field3452 += (long)var9;
			}

			if (-1L != this.field3451) {
				if (this.field3451 > this.field3452 && var3 > 0) {
					var9 = var2 + (int)(this.field3451 - this.field3452);
					if (var9 > var2 + var3) {
						var9 = var2 + var3;
					}

					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field3452;
					}
				}

				long var15 = -1L;
				long var11 = -1L;
				if (this.field3451 >= var5 && this.field3451 < (long)var8 + var5) {
					var15 = this.field3451;
				} else if (var5 >= this.field3451 && var5 < this.field3451 + (long)this.field3446) {
					var15 = var5;
				}

				if (this.field3451 + (long)this.field3446 > var5 && (long)this.field3446 + this.field3451 <= (long)var8 + var5) {
					var11 = this.field3451 + (long)this.field3446;
				} else if (var5 + (long)var8 > this.field3451 && var5 + (long)var8 <= (long)this.field3446 + this.field3451) {
					var11 = (long)var8 + var5;
				}

				if (var15 > -1L && var11 > var15) {
					int var13 = (int)(var11 - var15);
					System.arraycopy(this.field3450, (int)(var15 - this.field3451), var1, (int)(var15 - var5) + var2, var13);
					if (var11 > this.field3452) {
						var3 = (int)((long)var3 - (var11 - this.field3452));
						this.field3452 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field3455 = -1L;
			throw var14;
		}

		if (var3 > 0) {
			throw new EOFException();
		}
	}

	void method2129() throws IOException {
		this.field3449 = 0;
		if (this.field3452 != this.field3455) {
			this.field3454.method1734(this.field3452);
			this.field3455 = this.field3452;
		}

		int var3;
		for (this.field3445 = this.field3452; this.field3449 < this.field3447.length; this.field3449 += var3) {
			int var2 = this.field3447.length - this.field3449;
			if (var2 > 200000000) {
				var2 = 200000000;
			}

			var3 = this.field3454.method1737(this.field3447, this.field3449, var2);
			if (var3 == -1) {
				break;
			}

			this.field3455 += (long)var3;
		}

	}

	public void method2130(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.field3452 > this.field3448) {
				this.field3448 = this.field3452 + (long)var3;
			}

			if (-1L != this.field3451 && (this.field3452 < this.field3451 || this.field3452 > (long)this.field3446 + this.field3451)) {
				this.method2131();
			}

			if (-1L != this.field3451 && (long)var3 + this.field3452 > (long)this.field3450.length + this.field3451) {
				int var5 = (int)((long)this.field3450.length - (this.field3452 - this.field3451));
				System.arraycopy(var1, var2, this.field3450, (int)(this.field3452 - this.field3451), var5);
				this.field3452 += (long)var5;
				var2 += var5;
				var3 -= var5;
				this.field3446 = this.field3450.length;
				this.method2131();
			}

			if (var3 <= this.field3450.length) {
				if (var3 > 0) {
					if (-1L == this.field3451) {
						this.field3451 = this.field3452;
					}

					System.arraycopy(var1, var2, this.field3450, (int)(this.field3452 - this.field3451), var3);
					this.field3452 += (long)var3;
					if (this.field3452 - this.field3451 > (long)this.field3446) {
						this.field3446 = (int)(this.field3452 - this.field3451);
					}

				}
			} else {
				if (this.field3452 != this.field3455) {
					this.field3454.method1734(this.field3452);
					this.field3455 = this.field3452;
				}

				this.field3454.method1735(var1, var2, var3);
				this.field3455 += (long)var3;
				if (this.field3455 > this.field3453) {
					this.field3453 = this.field3455;
				}

				long var11 = -1L;
				long var7 = -1L;
				if (this.field3452 >= this.field3445 && this.field3452 < this.field3445 + (long)this.field3449) {
					var11 = this.field3452;
				} else if (this.field3445 >= this.field3452 && this.field3445 < (long)var3 + this.field3452) {
					var11 = this.field3445;
				}

				if ((long)var3 + this.field3452 > this.field3445 && (long)var3 + this.field3452 <= this.field3445 + (long)this.field3449) {
					var7 = this.field3452 + (long)var3;
				} else if ((long)this.field3449 + this.field3445 > this.field3452 && this.field3445 + (long)this.field3449 <= (long)var3 + this.field3452) {
					var7 = this.field3445 + (long)this.field3449;
				}

				if (var11 > -1L && var7 > var11) {
					int var9 = (int)(var7 - var11);
					System.arraycopy(var1, (int)(var11 + (long)var2 - this.field3452), this.field3447, (int)(var11 - this.field3445), var9);
				}

				this.field3452 += (long)var3;
			}
		} catch (IOException var10) {
			this.field3455 = -1L;
			throw var10;
		}
	}

	void method2131() throws IOException {
		if (this.field3451 != -1L) {
			if (this.field3451 != this.field3455) {
				this.field3454.method1734(this.field3451);
				this.field3455 = this.field3451;
			}

			this.field3454.method1735(this.field3450, 0, this.field3446);
			this.field3455 += (long)this.field3446;
			if (this.field3455 > this.field3453) {
				this.field3453 = this.field3455;
			}

			long var2 = -1L;
			long var4 = -1L;
			if (this.field3451 >= this.field3445 && this.field3451 < (long)this.field3449 + this.field3445) {
				var2 = this.field3451;
			} else if (this.field3445 >= this.field3451 && this.field3445 < this.field3451 + (long)this.field3446) {
				var2 = this.field3445;
			}

			if (this.field3451 + (long)this.field3446 > this.field3445 && this.field3451 + (long)this.field3446 <= this.field3445 + (long)this.field3449) {
				var4 = this.field3451 + (long)this.field3446;
			} else if (this.field3445 + (long)this.field3449 > this.field3451 && (long)this.field3449 + this.field3445 <= this.field3451 + (long)this.field3446) {
				var4 = this.field3445 + (long)this.field3449;
			}

			if (var2 > -1L && var4 > var2) {
				int var6 = (int)(var4 - var2);
				System.arraycopy(this.field3450, (int)(var2 - this.field3451), this.field3447, (int)(var2 - this.field3445), var6);
			}

			this.field3451 = -1L;
			this.field3446 = 0;
		}

	}
}
