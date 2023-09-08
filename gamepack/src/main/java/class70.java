public class class70 extends class52 {

	byte field723;

	int field724;

	int field726;

	String field725;

	// $FF: synthetic field
	final class390 this$0;

	class70(class390 var1) {
		this.this$0 = var1;
		this.field726 = -1;
	}

	@Override
	void method207(class187 var1) {
		this.field726 = var1.method1145();
		this.field723 = var1.method1097();
		this.field724 = var1.method1145();
		var1.method1101();
		this.field725 = var1.method1104();
	}

	@Override
	void method208(class345 var1) {
		class162 var3 = (class162) var1.field2614.get(this.field726);
		var3.field1648 = this.field723;
		var3.field1649 = this.field724;
		var3.field1647 = new UsernameDisplayName(this.field725);
	}
}
