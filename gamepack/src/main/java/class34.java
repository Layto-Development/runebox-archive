public final class class34 {

	class310 field182;

	public class34() {
		this.field182 = new class310();
		this.field182.field2427 = this.field182;
		this.field182.field2428 = this.field182;
	}

	public void method156(class310 var1) {
		if (var1.field2428 != null) {
			var1.method1674();
		}
		var1.field2428 = this.field182.field2428;
		var1.field2427 = this.field182;
		var1.field2428.field2427 = var1;
		var1.field2427.field2428 = var1;
	}

	public void method154(class310 var1) {
		if (var1.field2428 != null) {
			var1.method1674();
		}
		var1.field2428 = this.field182;
		var1.field2427 = this.field182.field2427;
		var1.field2428.field2427 = var1;
		var1.field2427.field2428 = var1;
	}

	public class310 method155() {
		class310 var1 = this.field182.field2427;
		return var1 == this.field182 ? null : var1;
	}
}
