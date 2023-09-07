public class class227 extends class108 {

	double field2001;

	double field2002;

	double field2003;

	double field2004;

	double field2005;

	int field1999;

	int field2000;

	public class227(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field1999 = 0;
		this.field2000 = 0;
		this.field2001 = 0.0D;
		this.field2002 = 0.0D;
		this.field2003 = 0.0D;
		this.field2005 = 0.0D;
		this.field2004 = 0.0D;
		this.field1999 = var3;
		this.field2000 = var6;
		if ((var7 - var1) * (var5 - var8) == (var4 - var7) * (var8 - var2)) {
			this.field2001 = (double) var4;
			this.field2002 = (double) var5;
		} else {
			double var11 = (double) (float) (var1 + var7) / 2.0D;
			double var13 = (double) (float) (var2 + var8) / 2.0D;
			double var15 = (double) (float) (var7 + var4) / 2.0D;
			double var17 = (double) (float) (var5 + var8) / 2.0D;
			double var19 = -1.0D * (double) (var7 - var1) / (double) (var8 - var2);
			double var21 = (double) (var4 - var7) * -1.0D / (double) (var5 - var8);
			this.field2001 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.field2002 = var13 + var19 * (this.field2001 - var11);
			this.field2003 = Math.sqrt(Math.pow(this.field2001 - (double) var1, 2.0D) + Math.pow(this.field2002 - (double) var2, 2.0D));
			this.field2005 = Math.atan2((double) var2 - this.field2002, (double) var1 - this.field2001);
			double var23 = Math.atan2((double) var8 - this.field2002, (double) var7 - this.field2001);
			this.field2004 = Math.atan2((double) var5 - this.field2002, (double) var4 - this.field2001);
			boolean var25 = this.field2005 <= var23 && var23 <= this.field2004 || this.field2004 <= var23 && var23 <= this.field2005;
			if (!var25) {
				this.field2004 += (double) (this.field2005 - this.field2004 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}
		}
	}

	@Override
	public int method653() {
		double var2 = this.method30();
		double var4 = this.field2005 + (this.field2004 - this.field2005) * var2;
		return (int) Math.round(this.field2001 + this.field2003 * Math.cos(var4));
	}

	@Override
	public int method654() {
		double var2 = this.method30();
		double var4 = this.field2005 + var2 * (this.field2004 - this.field2005);
		return (int) Math.round(this.field2002 + this.field2003 * Math.sin(var4));
	}

	@Override
	public int method655() {
		double var2 = this.method30();
		return (int) Math.round((double) this.field1999 + var2 * (double) (this.field2000 - this.field1999));
	}
}
