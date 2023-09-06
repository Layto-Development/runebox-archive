public class class97 {
	boolean field985;
	class215 field983;
	int field984;
	String field982;

	class97(class215 var1) {
		this.field984 = 0;
		this.field985 = false;
		this.field983 = var1;
	}

	void method640(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			if (this.field982 != var1) {
				this.field982 = var1;
				this.field984 = 0;
				this.field985 = false;
				this.method641();
			}
		}
	}

	int method641() {
		if (this.field982 == null) {
			this.field984 = 100;
			this.field985 = true;
		} else {
			if (this.field984 < 33) {
				if (!this.field983.method1232(class499.field4151.field4154, this.field982)) {
					return this.field984;
				}

				this.field984 = 33;
			}

			if (this.field984 == 33) {
				if (this.field983.method1234(class499.field4150.field4154, this.field982) && !this.field983.method1232(class499.field4150.field4154, this.field982)) {
					return this.field984;
				}

				this.field984 = 66;
			}

			if (this.field984 == 66) {
				if (!this.field983.method1232(this.field982, class499.field4153.field4154)) {
					return this.field984;
				}

				this.field984 = 100;
				this.field985 = true;
			}
		}

		return this.field984;
	}

	boolean method642() {
		return this.field985;
	}

	int method643() {
		return this.field984;
	}

	public static class115[] method644(class215 var0, int var1, int var2) {
		return !class85.method558(var0, var1, var2) ? null : class129.method773();
	}
}
