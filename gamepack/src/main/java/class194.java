public class class194 implements Comparable {

	static int field1860;

	class78 field1858;

	class78 field1859;

	class194() {
	}

	public class78 method1195() {
		return this.field1858;
	}

	public String method1196() {
		return this.field1858 == null ? "" : this.field1858.method322();
	}

	public String method1197() {
		return this.field1859 == null ? "" : this.field1859.method322();
	}

	void method1198(class78 var1, class78 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field1858 = var1;
			this.field1859 = var2;
		}
	}

	public int method1199(class194 var1) {
		return this.field1858.method321(var1.field1858);
	}

	@Override
	public int compareTo(Object var1) {
		return this.method1199((class194) var1);
	}
}
