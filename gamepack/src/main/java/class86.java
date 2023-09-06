public class class86 {
	class462 field867;
	public class462 field868;

	public class86() {
		this.field868 = new class462();
		this.field868.field3986 = this.field868;
		this.field868.field3988 = this.field868;
	}

	public void method559() {
		while (true) {
			class462 var1 = this.field868.field3986;
			if (var1 == this.field868) {
				this.field867 = null;
				return;
			}

			var1.method2269();
		}
	}

	public void method567(class462 var1) {
		if (var1.field3988 != null) {
			var1.method2269();
		}

		var1.field3988 = this.field868.field3988;
		var1.field3986 = this.field868;
		var1.field3988.field3986 = var1;
		var1.field3986.field3988 = var1;
	}

	public void method568(class462 var1) {
		if (var1.field3988 != null) {
			var1.method2269();
		}

		var1.field3988 = this.field868;
		var1.field3986 = this.field868.field3986;
		var1.field3988.field3986 = var1;
		var1.field3986.field3988 = var1;
	}

	public class462 method561() {
		class462 var1 = this.field868.field3986;
		if (var1 == this.field868) {
			return null;
		} else {
			var1.method2269();
			return var1;
		}
	}

	public class462 method562() {
		class462 var1 = this.field868.field3988;
		if (var1 == this.field868) {
			return null;
		} else {
			var1.method2269();
			return var1;
		}
	}

	public class462 method563() {
		class462 var1 = this.field868.field3986;
		if (var1 == this.field868) {
			this.field867 = null;
			return null;
		} else {
			this.field867 = var1.field3986;
			return var1;
		}
	}

	public class462 method564() {
		class462 var1 = this.field868.field3988;
		if (var1 == this.field868) {
			this.field867 = null;
			return null;
		} else {
			this.field867 = var1.field3988;
			return var1;
		}
	}

	public class462 method565() {
		class462 var1 = this.field867;
		if (var1 == this.field868) {
			this.field867 = null;
			return null;
		} else {
			this.field867 = var1.field3986;
			return var1;
		}
	}

	public class462 method569() {
		class462 var1 = this.field867;
		if (var1 == this.field868) {
			this.field867 = null;
			return null;
		} else {
			this.field867 = var1.field3988;
			return var1;
		}
	}

	public boolean method566() {
		return this.field868.field3986 == this.field868;
	}

	public static void method560(class462 var0, class462 var1) {
		if (var0.field3988 != null) {
			var0.method2269();
		}

		var0.field3988 = var1.field3988;
		var0.field3986 = var1;
		var0.field3988.field3986 = var0;
		var0.field3986.field3988 = var0;
	}
}
