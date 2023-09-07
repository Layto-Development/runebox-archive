import java.io.EOFException;
import java.io.IOException;

public class class358 {

	byte[] field2840;

	byte[] field2843;

	class6 field2847;

	int field2839;

	int field2842;

	long field2838;

	long field2841;

	long field2844;

	long field2845;

	long field2846;

	long field2848;

	public class358(class6 var1, int var2, int var3) throws IOException {
		this.field2838 = -1L;
		this.field2844 = -1L;
		this.field2839 = 0;
		this.field2847 = var1;
		this.field2841 = this.field2846 = var1.method14();
		this.field2840 = new byte[var2];
		this.field2843 = new byte[var3];
		this.field2845 = 0L;
	}

	public void method1877() throws IOException {
		this.method1883();
		this.field2847.method16();
	}

	public void method1878(long var1) throws IOException {
		if (var1 < 0L) {
			throw new IOException("");
		} else {
			this.field2845 = var1;
		}
	}

	public long method1884() {
		return this.field2841;
	}

	public void method1879(byte[] var1) throws IOException {
		this.method1880(var1, 0, var1.length);
	}

	public void method1880(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (0 + var3 > var1.length) {
				throw new ArrayIndexOutOfBoundsException(var3 + 0 - var1.length);
			}
			if (-1L != this.field2844 && this.field2845 >= this.field2844 && this.field2845 + (long) var3 <= this.field2844 + (long) this.field2839) {
				System.arraycopy(this.field2843, (int) (this.field2845 - this.field2844), var1, 0, var3);
				this.field2845 += (long) var3;
				return;
			}
			long var5 = this.field2845;
			boolean var7 = false;
			int var8 = var3;
			int var9;
			if (this.field2845 >= this.field2838 && this.field2845 < this.field2838 + (long) this.field2842) {
				var9 = (int) ((long) this.field2842 - (this.field2845 - this.field2838));
				if (var9 > var3) {
					var9 = var3;
				}
				System.arraycopy(this.field2840, (int) (this.field2845 - this.field2838), var1, 0, var9);
				this.field2845 += (long) var9;
				var2 = 0 + var9;
				var3 -= var9;
			}
			if (var3 > this.field2840.length) {
				this.field2847.method12(this.field2845);
				for (this.field2848 = this.field2845; var3 > 0; var3 -= var9) {
					var9 = this.field2847.method15(var1, var2, var3);
					if (var9 == -1) {
						break;
					}
					this.field2848 += (long) var9;
					this.field2845 += (long) var9;
					var2 += var9;
				}
			} else if (var3 > 0) {
				this.method1881();
				var9 = var3;
				if (var3 > this.field2842) {
					var9 = this.field2842;
				}
				System.arraycopy(this.field2840, 0, var1, var2, var9);
				var2 += var9;
				var3 -= var9;
				this.field2845 += (long) var9;
			}
			if (-1L != this.field2844) {
				if (this.field2844 > this.field2845 && var3 > 0) {
					var9 = var2 + (int) (this.field2844 - this.field2845);
					if (var9 > var2 + var3) {
						var9 = var2 + var3;
					}
					while (var2 < var9) {
						var1[var2++] = 0;
						--var3;
						++this.field2845;
					}
				}
				long var15 = -1L;
				long var11 = -1L;
				if (this.field2844 >= var5 && this.field2844 < (long) var8 + var5) {
					var15 = this.field2844;
				} else if (var5 >= this.field2844 && var5 < this.field2844 + (long) this.field2839) {
					var15 = var5;
				}
				if (this.field2844 + (long) this.field2839 > var5 && (long) this.field2839 + this.field2844 <= (long) var8 + var5) {
					var11 = this.field2844 + (long) this.field2839;
				} else if (var5 + (long) var8 > this.field2844 && var5 + (long) var8 <= (long) this.field2839 + this.field2844) {
					var11 = (long) var8 + var5;
				}
				if (var15 > -1L && var11 > var15) {
					int var13 = (int) (var11 - var15);
					System.arraycopy(this.field2843, (int) (var15 - this.field2844), var1, (int) (var15 - var5) + 0, var13);
					if (var11 > this.field2845) {
						var3 = (int) ((long) var3 - (var11 - this.field2845));
						this.field2845 = var11;
					}
				}
			}
		} catch (IOException var14) {
			this.field2848 = -1L;
			throw var14;
		}
		if (var3 > 0) {
			throw new EOFException();
		}
	}

	void method1881() throws IOException {
		this.field2842 = 0;
		if (this.field2845 != this.field2848) {
			this.field2847.method12(this.field2845);
			this.field2848 = this.field2845;
		}
		int var3;
		for (this.field2838 = this.field2845; this.field2842 < this.field2840.length; this.field2842 += var3) {
			int var2 = this.field2840.length - this.field2842;
			if (var2 > 200000000) {
				var2 = 200000000;
			}
			var3 = this.field2847.method15(this.field2840, this.field2842, var2);
			if (var3 == -1) {
				break;
			}
			this.field2848 += (long) var3;
		}
	}

	public void method1882(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long) var3 + this.field2845 > this.field2841) {
				this.field2841 = this.field2845 + (long) var3;
			}
			if (-1L != this.field2844 && (this.field2845 < this.field2844 || this.field2845 > (long) this.field2839 + this.field2844)) {
				this.method1883();
			}
			if (-1L != this.field2844 && (long) var3 + this.field2845 > (long) this.field2843.length + this.field2844) {
				int var5 = (int) ((long) this.field2843.length - (this.field2845 - this.field2844));
				System.arraycopy(var1, var2, this.field2843, (int) (this.field2845 - this.field2844), var5);
				this.field2845 += (long) var5;
				var2 += var5;
				var3 -= var5;
				this.field2839 = this.field2843.length;
				this.method1883();
			}
			if (var3 <= this.field2843.length) {
				if (var3 > 0) {
					if (-1L == this.field2844) {
						this.field2844 = this.field2845;
					}
					System.arraycopy(var1, var2, this.field2843, (int) (this.field2845 - this.field2844), var3);
					this.field2845 += (long) var3;
					if (this.field2845 - this.field2844 > (long) this.field2839) {
						this.field2839 = (int) (this.field2845 - this.field2844);
					}
				}
			} else {
				if (this.field2845 != this.field2848) {
					this.field2847.method12(this.field2845);
					this.field2848 = this.field2845;
				}
				this.field2847.method13(var1, var2, var3);
				this.field2848 += (long) var3;
				if (this.field2848 > this.field2846) {
					this.field2846 = this.field2848;
				}
				long var11 = -1L;
				long var7 = -1L;
				if (this.field2845 >= this.field2838 && this.field2845 < this.field2838 + (long) this.field2842) {
					var11 = this.field2845;
				} else if (this.field2838 >= this.field2845 && this.field2838 < (long) var3 + this.field2845) {
					var11 = this.field2838;
				}
				if ((long) var3 + this.field2845 > this.field2838 && (long) var3 + this.field2845 <= this.field2838 + (long) this.field2842) {
					var7 = this.field2845 + (long) var3;
				} else if ((long) this.field2842 + this.field2838 > this.field2845 && this.field2838 + (long) this.field2842 <= (long) var3 + this.field2845) {
					var7 = this.field2838 + (long) this.field2842;
				}
				if (var11 > -1L && var7 > var11) {
					int var9 = (int) (var7 - var11);
					System.arraycopy(var1, (int) (var11 + (long) var2 - this.field2845), this.field2840, (int) (var11 - this.field2838), var9);
				}
				this.field2845 += (long) var3;
			}
		} catch (IOException var10) {
			this.field2848 = -1L;
			throw var10;
		}
	}

	void method1883() throws IOException {
		if (this.field2844 != -1L) {
			if (this.field2844 != this.field2848) {
				this.field2847.method12(this.field2844);
				this.field2848 = this.field2844;
			}
			this.field2847.method13(this.field2843, 0, this.field2839);
			this.field2848 += (long) this.field2839;
			if (this.field2848 > this.field2846) {
				this.field2846 = this.field2848;
			}
			long var2 = -1L;
			long var4 = -1L;
			if (this.field2844 >= this.field2838 && this.field2844 < (long) this.field2842 + this.field2838) {
				var2 = this.field2844;
			} else if (this.field2838 >= this.field2844 && this.field2838 < this.field2844 + (long) this.field2839) {
				var2 = this.field2838;
			}
			if (this.field2844 + (long) this.field2839 > this.field2838 && this.field2844 + (long) this.field2839 <= this.field2838 + (long) this.field2842) {
				var4 = this.field2844 + (long) this.field2839;
			} else if (this.field2838 + (long) this.field2842 > this.field2844 && (long) this.field2842 + this.field2838 <= this.field2844 + (long) this.field2839) {
				var4 = this.field2838 + (long) this.field2842;
			}
			if (var2 > -1L && var4 > var2) {
				int var6 = (int) (var4 - var2);
				System.arraycopy(this.field2843, (int) (var2 - this.field2844), this.field2840, (int) (var2 - this.field2838), var6);
			}
			this.field2844 = -1L;
			this.field2839 = 0;
		}
	}
}
