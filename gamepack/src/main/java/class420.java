public class class420 extends class218 {
	static int[] field3504;
	public final int field3505;
	public final int field3506;
	public final int[] field3507;
	public final int[] field3508;

	class420(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field3506 = var1;
		this.field3505 = var2;
		this.field3507 = var3;
		this.field3508 = var4;
	}

	public boolean method2163(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field3508.length) {
			int var4 = this.field3508[var2];
			if (var1 >= var4 && var1 <= this.field3507[var2] + var4) {
				return true;
			}
		}

		return false;
	}

	public static int method2164(int var0) {
		return var0 >> 17 & 7;
	}
}
