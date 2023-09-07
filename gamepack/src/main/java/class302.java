public class class302 extends class52 {

	byte field2351;

	byte field2352;

	String field2353;

	// $FF: synthetic field
	final class390 this$0;

	class302(class390 var1) {
		this.this$0 = var1;
	}

	@Override
	void method207(class187 var1) {
		this.field2353 = var1.method1155();
		if (null != this.field2353) {
			var1.method1096();
			this.field2351 = var1.method1097();
			this.field2352 = var1.method1097();
		}
	}

	@Override
	void method208(class345 var1) {
		var1.field2617 = this.field2353;
		if (null != this.field2353) {
			var1.field2612 = this.field2351;
			var1.field2616 = this.field2352;
		}
	}
}
