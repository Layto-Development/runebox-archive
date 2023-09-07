public class class411 extends class417 {

	boolean field3205;

	byte field3201;

	byte field3202;

	byte field3203;

	byte field3204;

	// $FF: synthetic field
	final class400 this$0;

	class411(class400 var1) {
		this.this$0 = var1;
	}

	@Override
	void method2095(class187 var1) {
		this.field3205 = var1.method1096() == 1;
		this.field3202 = var1.method1097();
		this.field3203 = var1.method1097();
		this.field3201 = var1.method1097();
		this.field3204 = var1.method1097();
	}

	@Override
	void method2094(class518 var1) {
		var1.field4106 = this.field3205;
		var1.field4120 = this.field3202;
		var1.field4108 = this.field3203;
		var1.field4109 = this.field3201;
		var1.field4110 = this.field3204;
	}
}
