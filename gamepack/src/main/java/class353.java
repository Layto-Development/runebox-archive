public class class353 extends class10 {

	int field2674;

	int field2675;

	public class353(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field2674 = 0;
		this.field2675 = 0;
		this.field2674 = var1;
		this.field2675 = var2;
	}

	public int method1818() {
		double var2 = this.method30();
		return (int) Math.round((double) this.field2674 + var2 * (double) (this.field2675 - this.field2674));
	}
}
