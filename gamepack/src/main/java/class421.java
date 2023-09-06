public class class421 extends class40 {
	byte field3509;
	int field3510;
	int field3512;
	String field3511;
	// $FF: synthetic field
	final class90 this$0;

	class421(class90 var1) {
		this.this$0 = var1;
		this.field3512 = -1;
	}

	void method258(class42 var1) {
		this.field3512 = var1.method327();
		this.field3509 = var1.method279();
		this.field3510 = var1.method327();
		var1.method283();
		this.field3511 = var1.method286();
	}

	void method259(class419 var1) {
		class395 var3 = (class395)var1.field3498.get(this.field3512);
		var3.field3321 = this.field3509;
		var3.field3322 = this.field3510;
		var3.field3320 = new class440(this.field3511);
	}
}
