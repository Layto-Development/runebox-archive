public class class495 extends class232 {
	static String[] field4139;
	int field4138;
	long field4137;

	public class495(class232 var1, int var2) {
		super(var1);
		this.field4138 = var2;
		super.field2101 = "DelayFadeTask";
	}

	public boolean method1330() {
		if (this.field4137 < (long)this.field4138) {
			++this.field4137;
			return false;
		} else {
			return true;
		}
	}
}
