public class class427 extends class310 {

	static int[] field3346;

	public final int field3347;

	public final int field3348;

	public final int[] field3349;

	public final int[] field3350;

	class427(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field3348 = var1;
		this.field3347 = var2;
		this.field3349 = var3;
		this.field3350 = var4;
	}

	public boolean method2156(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field3350.length) {
			int var4 = this.field3350[var2];
			if (var1 >= var4 && var1 <= this.field3349[var2] + var4) {
				return true;
			}
		}
		return false;
	}
}
