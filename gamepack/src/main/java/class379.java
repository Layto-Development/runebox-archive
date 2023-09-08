public class class379 extends class52 {

	static short[] field3068;

	byte field3065;

	int field3064;

	int field3066;

	String field3067;

	// $FF: synthetic field
	final class390 this$0;

	class379(class390 var1) {
		this.this$0 = var1;
		this.field3066 = -1;
	}

	@Override
	void method207(class187 var1) {
		var1.method1096();
		this.field3066 = var1.method1145();
		this.field3065 = var1.method1097();
		this.field3064 = var1.method1145();
		var1.method1101();
		this.field3067 = var1.method1104();
		var1.method1096();
	}

	@Override
	void method208(class345 var1) {
		class162 var3 = (class162) var1.field2614.get(this.field3066);
		var3.field1648 = this.field3065;
		var3.field1649 = this.field3064;
		var3.field1647 = new UsernameDisplayName(this.field3067);
	}
}
