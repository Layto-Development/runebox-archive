public class class111 extends class538 {
	int field1063;
	String field1062;
	long field1064;
	// $FF: synthetic field
	final class464 this$0;

	class111(class464 var1) {
		this.this$0 = var1;
		this.field1064 = -1L;
		this.field1062 = null;
		this.field1063 = 0;
	}

	void method2583(class42 var1) {
		if (var1.method278() != 255) {
			--var1.field527;
			this.field1064 = var1.method283();
		}

		this.field1062 = var1.method337();
		this.field1063 = var1.method327();
	}

	void method2582(class379 var1) {
		var1.method2033(this.field1064, this.field1062, this.field1063);
	}
}
