public class class181 extends class234 {

	class245 field1780;

	int field1777;

	int field1781;

	int field1782;

	final class116 field1779;

	final int field1778;

	class181(class402 var1, class402 var2, int var3, class116 var4) {
		super(var1, var2);
		this.field1778 = var3;
		this.field1779 = var4;
		this.method1063();
	}

	void method1063() {
		this.field1777 = class319.method1705(this.field1778, (byte) -56).method1893().field2902;
		this.field1780 = this.field1779.method811(class319.method1706(this.field1777));
		class319 var2 = class319.method1706(this.method1371());
		class84 var3 = var2.method1702(false);
		if (null != var3) {
			this.field1781 = var3.field848;
			this.field1782 = var3.field844;
		} else {
			this.field1781 = 0;
			this.field1782 = 0;
		}
	}

	@Override
	public int method1371() {
		return this.field1777;
	}

	@Override
	class245 method1376() {
		return this.field1780;
	}

	@Override
	int method1377() {
		return this.field1781;
	}

	@Override
	int method1372() {
		return this.field1782;
	}
}
