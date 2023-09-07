public final class class103 extends class189 {

	int field1275;

	int field1276;

	int field1277;

	class103() {
		this.field1277 = 31;
	}

	void method638(int var1) {
		this.field1277 = var1;
	}

	boolean method637(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1277 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@Override
	protected final class113 method1165() {
		return class426.method2155(this.field1275).method2140(this.field1276);
	}
}
