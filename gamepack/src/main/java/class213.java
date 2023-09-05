import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sc")
public abstract class class213 {
	@ObfInfo(name = "gv", desc = "I", intMultiplier = -1711054295)
	static int field1904;
	@ObfInfo(name = "af", desc = "D")
	double field1900;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1232031963)
	int field1901;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 627724959)
	int field1902;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 2041242771)
	int field1903;

	@ObfInfo(name = "<init>", desc = "(II)V")
	class213(int var1, int var2) {
		this.field1903 = 0;
		this.field1901 = 0;
		this.field1900 = 0.0D;
		this.field1902 = 0;
		this.field1903 = var1;
		this.field1901 = 0;
		this.field1902 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field1900 = method1191(this.field1901, this.field1903, this.field1902);
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	public void method1190() {
		if (this.field1901 < this.field1903) {
			++this.field1901;
			this.field1900 = method1191(this.field1901, this.field1903, this.field1902);
		}

	}

	@ObfInfo(name = "ag", desc = "(I)D")
	double method1189() {
		return this.field1900;
	}

	@ObfInfo(name = "am", desc = "(IIIB)D")
	static double method1191(int var0, int var1, int var2) {
		double var4 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var4 > 0.0D && var4 < 1.0D) {
			double var6;
			double var8;
			switch(var2) {
			case 0:
				return var4;
			case 1:
				return 1.0D - Math.cos(var4 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(var4 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var4 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var4 * var4;
			case 5:
				return 1.0D - (1.0D - var4) * (1.0D - var4);
			case 6:
				return var4 < 0.5D ? var4 * 2.0D * var4 : 1.0D - Math.pow(2.0D + var4 * -2.0D, 2.0D) / 2.0D;
			case 7:
				return var4 * var4 * var4;
			case 8:
				return 1.0D - Math.pow(1.0D - var4, 3.0D);
			case 9:
				return var4 < 0.5D ? var4 * var4 * 4.0D * var4 : 1.0D - Math.pow(2.0D + var4 * -2.0D, 3.0D) / 2.0D;
			case 10:
				return var4 * var4 * var4 * var4;
			case 11:
				return 1.0D - Math.pow(1.0D - var4, 4.0D);
			case 12:
				return var4 < 0.5D ? var4 * var4 * var4 * var4 * 8.0D : 1.0D - Math.pow(2.0D + var4 * -2.0D, 4.0D) / 2.0D;
			case 13:
				return var4 * var4 * var4 * var4 * var4;
			case 14:
				return 1.0D - Math.pow(1.0D - var4, 5.0D);
			case 15:
				return var4 < 0.5D ? var4 * var4 * 8.0D * var4 * var4 * var4 : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, var4 * 10.0D - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, var4 * -10.0D);
			case 18:
				return var4 < 0.5D ? Math.pow(2.0D, 10.0D + var4 * 20.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var4 * -20.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var4, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var4 - 1.0D, 2.0D));
			case 21:
				return var4 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var4 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var4 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var6 = 1.70158D;
				var8 = 2.70158D;
				return var4 * 2.70158D * var4 * var4 - var4 * 1.70158D * var4;
			case 23:
				var6 = 1.70158D;
				var8 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var4 - 1.0D, 3.0D) + 1.70158D * Math.pow(var4 - 1.0D, 2.0D);
			case 24:
				var6 = 1.70158D;
				var8 = 2.5949095D;
				return var4 < 0.5D ? Math.pow(var4 * 2.0D, 2.0D) * (var4 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var4 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (var4 * 2.0D - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
			case 25:
				var6 = 2.0943951023931953D;
				return -Math.pow(2.0D, var4 * 10.0D - 10.0D) * Math.sin((var4 * 10.0D - 10.75D) * 2.0943951023931953D);
			case 26:
				var6 = 2.0943951023931953D;
				return Math.pow(2.0D, var4 * -10.0D) * Math.sin(2.0943951023931953D * (var4 * 10.0D - 0.75D)) + 1.0D;
			case 27:
				var6 = 1.3962634015954636D;
				var8 = Math.sin((var4 * 20.0D - 11.125D) * 1.3962634015954636D);
				return var4 < 0.5D ? -(Math.pow(2.0D, var4 * 20.0D - 10.0D) * var8) / 2.0D : Math.pow(2.0D, 10.0D + var4 * -20.0D) * var8 / 2.0D + 1.0D;
			default:
				return var4;
			}
		} else {
			return var4 <= 0.0D ? 0.0D : 1.0D;
		}
	}
}
