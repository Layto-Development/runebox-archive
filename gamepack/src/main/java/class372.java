public abstract class class372 extends class462 {
	class372 field3107;
	class428 field3110;
	int field3108;
	volatile boolean field3109;

	protected class372() {
		this.field3109 = true;
	}

	protected abstract class372 method1980();

	protected abstract class372 method1981();

	protected abstract int method1978();

	protected abstract void method1982(int var1);

	protected abstract void method1983(int[] var1, int var2, int var3);

	int method1979() {
		return 255;
	}

	final void method1984(int[] var1, int var2, int var3) {
		if (this.field3109) {
			this.method1983(var1, var2, var3);
		} else {
			this.method1982(var3);
		}

	}
}
