public class class412 extends class417 {

	int field3207;

	String field3206;

	long field3208;

	// $FF: synthetic field
	final class400 this$0;

	class412(class400 var1) {
		this.this$0 = var1;
		this.field3208 = -1L;
		this.field3206 = null;
		this.field3207 = 0;
	}

	@Override
	void method2095(class187 var1) {
		if (var1.method1096() != 255) {
			--var1.field1832;
			this.field3208 = var1.method1101();
		}
		this.field3206 = var1.method1155();
		this.field3207 = var1.method1145();
	}

	@Override
	void method2094(class518 var1) {
		var1.method2513(this.field3208, this.field3206, this.field3207);
	}
}
