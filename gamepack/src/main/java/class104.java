public class class104 {

	class158 field1278;

	class158 field1279;

	public class104() {
		this.field1279 = new class158();
		this.field1279.field1620 = this.field1279;
		this.field1279.field1619 = this.field1279;
	}

	public void method640(class158 var1) {
		if (var1.field1619 != null) {
			var1.method926();
		}
		var1.field1619 = this.field1279.field1619;
		var1.field1620 = this.field1279;
		var1.field1619.field1620 = var1;
		var1.field1620.field1619 = var1;
	}

	public class158 method642() {
		class158 var1 = this.field1279.field1620;
		if (var1 == this.field1279) {
			this.field1278 = null;
			return null;
		} else {
			this.field1278 = var1.field1620;
			return var1;
		}
	}

	public class158 method641() {
		class158 var1 = this.field1278;
		if (var1 == this.field1279) {
			this.field1278 = null;
			return null;
		} else {
			this.field1278 = var1.field1620;
			return var1;
		}
	}
}
