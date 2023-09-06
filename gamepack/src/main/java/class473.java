public class class473 {
	class530 field4028;
	class530 field4029;

	public class473() {
		this.field4029 = new class530();
		this.field4029.field4266 = this.field4029;
		this.field4029.field4265 = this.field4029;
	}

	public void method2290(class530 var1) {
		if (var1.field4265 != null) {
			var1.method2560();
		}

		var1.field4265 = this.field4029.field4265;
		var1.field4266 = this.field4029;
		var1.field4265.field4266 = var1;
		var1.field4266.field4265 = var1;
	}

	public class530 method2292() {
		class530 var1 = this.field4029.field4266;
		if (var1 == this.field4029) {
			this.field4028 = null;
			return null;
		} else {
			this.field4028 = var1.field4266;
			return var1;
		}
	}

	public class530 method2291() {
		class530 var1 = this.field4028;
		if (var1 == this.field4029) {
			this.field4028 = null;
			return null;
		} else {
			this.field4028 = var1.field4266;
			return var1;
		}
	}
}
