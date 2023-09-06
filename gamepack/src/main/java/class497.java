public final class class497 {
	class218 field4141;

	public class497() {
		this.field4141 = new class218();
		this.field4141.field2029 = this.field4141;
		this.field4141.field2030 = this.field4141;
	}

	public void method2414(class218 var1) {
		if (var1.field2030 != null) {
			var1.method1252();
		}

		var1.field2030 = this.field4141.field2030;
		var1.field2029 = this.field4141;
		var1.field2030.field2029 = var1;
		var1.field2029.field2030 = var1;
	}

	public void method2412(class218 var1) {
		if (var1.field2030 != null) {
			var1.method1252();
		}

		var1.field2030 = this.field4141;
		var1.field2029 = this.field4141.field2029;
		var1.field2030.field2029 = var1;
		var1.field2029.field2030 = var1;
	}

	public class218 method2413() {
		class218 var1 = this.field4141.field2029;
		return var1 == this.field4141 ? null : var1;
	}
}
