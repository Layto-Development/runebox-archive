public class class130 extends class234 {

	static boolean field1474;

	final class245 field1473;

	final int field1470;

	final int field1471;

	final int field1472;

	class130(class402 var1, class402 var2, int var3, class245 var4) {
		super(var1, var2);
		this.field1470 = var3;
		this.field1473 = var4;
		class319 var5 = class319.method1706(this.method1371());
		class84 var6 = var5.method1702(false);
		if (null != var6) {
			this.field1472 = var6.field848;
			this.field1471 = var6.field844;
		} else {
			this.field1472 = 0;
			this.field1471 = 0;
		}
	}

	@Override
	public int method1371() {
		return this.field1470;
	}

	@Override
	class245 method1376() {
		return this.field1473;
	}

	@Override
	int method1377() {
		return this.field1472;
	}

	@Override
	int method1372() {
		return this.field1471;
	}
}
