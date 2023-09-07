public final class class190 {

	class11 field1836;

	class139 field1838;

	class419 field1837;

	int field1835;

	int field1839;

	public class190(int var1) {
		this(var1, var1);
	}

	public class190(int var1, int var2) {
		this.field1838 = new class139();
		this.field1839 = var1;
		this.field1835 = var1;
		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}
		this.field1837 = new class419(var3);
	}

	public Object method1166(long var1) {
		class290 var3 = (class290) this.field1837.method2105(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method1573();
			if (var4 == null) {
				var3.method318();
				var3.method1674();
				this.field1835 += var3.field2333;
				return null;
			} else {
				if (var3.method1572()) {
					class299 var5 = new class299(var4, var3.field2333);
					this.field1837.method2109(var5, var3.field785);
					this.field1838.method873(var5);
					var5.field2429 = 0L;
					var3.method318();
					var3.method1674();
				} else {
					this.field1838.method873(var3);
					var3.field2429 = 0L;
				}
				return var4;
			}
		}
	}

	void method1172(long var1) {
		class290 var3 = (class290) this.field1837.method2105(var1);
		this.method1167(var3);
	}

	void method1167(class290 var1) {
		if (var1 != null) {
			var1.method318();
			var1.method1674();
			this.field1835 += var1.field2333;
		}
	}

	public void method1168(Object var1, long var2) {
		this.method1169(var1, var2, 1);
	}

	public void method1169(Object var1, long var2, int var4) {
		if (var4 > this.field1839) {
			throw new IllegalStateException();
		} else {
			this.method1172(var2);
			this.field1835 -= var4;
			while (this.field1835 < 0) {
				class290 var5 = (class290) this.field1838.method875();
				if (var5 == null) {
					throw new RuntimeException("");
				}
				if (!var5.method1572()) {
				}
				this.method1167(var5);
				if (this.field1836 != null) {
					this.field1836.method33(var5.method1573());
				}
			}
			class299 var6 = new class299(var1, var4);
			this.field1837.method2109(var6, var2);
			this.field1838.method873(var6);
			var6.field2429 = 0L;
		}
	}

	public void method1170(int var1) {
		for (class290 var2 = (class290) this.field1838.method876(); var2 != null; var2 = (class290) this.field1838.method878()) {
			if (var2.method1572()) {
				if (var2.method1573() == null) {
					var2.method318();
					var2.method1674();
					this.field1835 += var2.field2333;
				}
			} else if (++var2.field2429 > (long) 5) {
				class276 var3 = new class276(var2.method1573(), var2.field2333);
				this.field1837.method2109(var3, var2.field785);
				class139.method874(var3, var2);
				var2.method318();
				var2.method1674();
			}
		}
	}

	public void method1171() {
		this.field1838.method879();
		this.field1837.method2106();
		this.field1835 = this.field1839;
	}
}
