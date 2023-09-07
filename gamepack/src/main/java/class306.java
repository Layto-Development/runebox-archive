public class class306 extends class52 {

	static String field2369;

	int field2368;

	// $FF: synthetic field
	final class390 this$0;

	class306(class390 var1) {
		this.this$0 = var1;
		this.field2368 = -1;
	}

	@Override
	void method207(class187 var1) {
		this.field2368 = var1.method1145();
		var1.method1096();
		if (var1.method1096() != 255) {
			--var1.field1832;
			var1.method1101();
		}
	}

	@Override
	void method208(class345 var1) {
		var1.method1799(this.field2368);
	}
}
