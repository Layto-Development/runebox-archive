public class class95 extends class194 {

	int field1217;

	class95() {
	}

	int method611(class95 var1) {
		return this.field1217 - var1.field1217;
	}

	@Override
	public int method1199(class194 var1) {
		return this.method611((class95) var1);
	}

	@Override
	public int compareTo(Object var1) {
		return this.method611((class95) var1);
	}
}
