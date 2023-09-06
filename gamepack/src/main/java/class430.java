public class class430 extends class232 {
	static class453 field3535;

	public class430(class232 var1) {
		super(var1);
		super.field2101 = "SwapSongTask";
	}

	public boolean method1330() {
		if (class92.field903.size() > 1 && class92.field903.get(0) != null && ((class104)class92.field903.get(0)).field1032.method163() && class92.field903.get(1) != null && ((class104)class92.field903.get(1)).field1032.method163()) {
			class104 var2 = (class104)class92.field903.get(0);
			class92.field903.set(0, class92.field903.get(1));
			class92.field903.set(1, var2);
		}

		return true;
	}
}
