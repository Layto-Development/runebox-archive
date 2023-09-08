public class class340 extends class417 {

	String field2595;

	long field2596;

	// $FF: synthetic field
	final class400 this$0;

	class340(class400 var1) {
		this.this$0 = var1;
		this.field2596 = -1L;
		this.field2595 = null;
	}

	@Override
	void method2095(class187 var1) {
		if (var1.method1096() != 255) {
			--var1.field1832;
			this.field2596 = var1.method1101();
		}
		this.field2595 = var1.method1155();
	}

	@Override
	void method2094(class518 var1) {
		var1.method2503(this.field2596, this.field2595);
	}
}
