public class class71 implements Comparable {
	static int field818;
	class440 field816;
	class440 field817;

	class71() {
	}

	public class440 method508() {
		return this.field816;
	}

	public String method509() {
		return this.field816 == null ? "" : this.field816.method2214();
	}

	public String method510() {
		return this.field817 == null ? "" : this.field817.method2214();
	}

	void method511(class440 var1, class440 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field816 = var1;
			this.field817 = var2;
		}
	}

	public int method512(class71 var1) {
		return this.field816.method2213(var1.field816);
	}

	public int compareTo(Object var1) {
		return this.method512((class71)var1);
	}
}
