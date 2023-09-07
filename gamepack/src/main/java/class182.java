public abstract class class182 extends class77 {

	class182 field1783;

	class423 field1786;

	int field1784;

	volatile boolean field1785;

	protected class182() {
		this.field1785 = true;
	}

	protected abstract class182 method1066();

	protected abstract class182 method1067();

	protected abstract int method1064();

	protected abstract void method1068(int var1);

	protected abstract void method1069(int[] var1, int var2, int var3);

	int method1065() {
		return 255;
	}

	final void method1070(int[] var1, int var2, int var3) {
		if (this.field1785) {
			this.method1069(var1, var2, var3);
		} else {
			this.method1068(var3);
		}
	}
}
