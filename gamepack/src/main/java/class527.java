public class class527 extends class52 {

	public static class338 field4176;

	byte field4174;

	int field4173;

	String field4175;

	// $FF: synthetic field
	final class390 this$0;

	class527(class390 var1) {
		this.this$0 = var1;
		this.field4175 = null;
	}

	@Override
	void method207(class187 var1) {
		if (var1.method1096() != 255) {
			--var1.field1832;
			var1.method1101();
		}
		this.field4175 = var1.method1155();
		this.field4173 = var1.method1145();
		this.field4174 = var1.method1097();
		var1.method1101();
	}

	@Override
	void method208(class345 var1) {
		class162 var3 = new class162();
		var3.field1647 = new UsernameDisplayName(this.field4175);
		var3.field1649 = this.field4173;
		var3.field1648 = this.field4174;
		var1.method1798(var3);
	}
}
