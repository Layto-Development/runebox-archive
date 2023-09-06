public class class74 extends class538 {
	static int[] field826;
	int field822;
	int field823;
	int field824;
	int field825;
	// $FF: synthetic field
	final class464 this$0;

	class74(class464 var1) {
		this.this$0 = var1;
	}

	void method2583(class42 var1) {
		this.field822 = var1.method282();
		this.field825 = var1.method282();
		this.field823 = var1.method278();
		this.field824 = var1.method278();
	}

	void method2582(class379 var1) {
		var1.method2029(this.field822, this.field825, this.field823, this.field824);
	}

	static boolean method521(char var0) {
		for (int var2 = 0; var2 < class116.field1109.length(); ++var2) {
			if (var0 == class116.field1109.charAt(var2)) {
				return true;
			}
		}

		return false;
	}
}
