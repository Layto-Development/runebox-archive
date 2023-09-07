public class class293 extends class17 {

	static String[] field2339;

	int field2338;

	long field2337;

	public class293(class17 var1, int var2) {
		super(var1);
		this.field2338 = var2;
		super.field89 = "DelayFadeTask";
	}

	@Override
	public boolean method51() {
		if (this.field2337 < (long) this.field2338) {
			++this.field2337;
			return false;
		} else {
			return true;
		}
	}
}
