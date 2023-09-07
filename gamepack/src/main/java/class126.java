public class class126 extends class417 {

	static class13 field1456;

	String field1454;

	long field1455;

	// $FF: synthetic field
	final class400 this$0;

	class126(class400 var1) {
		this.this$0 = var1;
		this.field1455 = -1L;
		this.field1454 = null;
	}

	@Override
	void method2095(class187 var1) {
		if (var1.method1096() != 255) {
			--var1.field1832;
			this.field1455 = var1.method1101();
		}
		this.field1454 = var1.method1155();
	}

	@Override
	void method2094(class518 var1) {
		var1.method2513(this.field1455, this.field1454, 0);
	}
}
