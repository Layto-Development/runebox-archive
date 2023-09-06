import java.util.Iterator;

public class class282 implements Iterable {
	class218 field2508;
	public class218 field2509;

	public class282() {
		this.field2509 = new class218();
		this.field2509.field2029 = this.field2509;
		this.field2509.field2030 = this.field2509;
	}

	public void method1607() {
		while (this.field2509.field2029 != this.field2509) {
			this.field2509.field2029.method1252();
		}

	}

	public void method1601(class218 var1) {
		if (var1.field2030 != null) {
			var1.method1252();
		}

		var1.field2030 = this.field2509.field2030;
		var1.field2029 = this.field2509;
		var1.field2030.field2029 = var1;
		var1.field2029.field2030 = var1;
	}

	public class218 method1603() {
		class218 var1 = this.field2509.field2029;
		if (var1 == this.field2509) {
			return null;
		} else {
			var1.method1252();
			return var1;
		}
	}

	public class218 method1604() {
		return this.method1605((class218)null);
	}

	class218 method1605(class218 var1) {
		class218 var2;
		if (var1 == null) {
			var2 = this.field2509.field2029;
		} else {
			var2 = var1;
		}

		if (var2 == this.field2509) {
			this.field2508 = null;
			return null;
		} else {
			this.field2508 = var2.field2029;
			return var2;
		}
	}

	public class218 method1606() {
		class218 var1 = this.field2508;
		if (var1 == this.field2509) {
			this.field2508 = null;
			return null;
		} else {
			this.field2508 = var1.field2029;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class276(this);
	}

	public static void method1602(class218 var0, class218 var1) {
		if (var0.field2030 != null) {
			var0.method1252();
		}

		var0.field2030 = var1;
		var0.field2029 = var1.field2029;
		var0.field2030.field2029 = var0;
		var0.field2029.field2030 = var0;
	}
}
