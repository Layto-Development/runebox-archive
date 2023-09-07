public class class45 extends class108 {

	int field209;

	int field210;

	int field211;

	int field212;

	int field213;

	int field214;

	public class45(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field213 = 0;
		this.field210 = 0;
		this.field211 = 0;
		this.field212 = 0;
		this.field209 = 0;
		this.field214 = 0;
		this.field213 = var1;
		this.field210 = var2;
		this.field211 = var3;
		this.field212 = var4;
		this.field209 = var5;
		this.field214 = var6;
	}

	@Override
	public int method653() {
		double var2 = this.method30();
		return (int) Math.round((double) (this.field212 - this.field213) * var2 + (double) this.field213);
	}

	@Override
	public int method654() {
		double var2 = this.method30();
		return (int) Math.round(var2 * (double) (this.field209 - this.field210) + (double) this.field210);
	}

	@Override
	public int method655() {
		double var2 = this.method30();
		return (int) Math.round((double) this.field211 + (double) (this.field214 - this.field211) * var2);
	}
}
