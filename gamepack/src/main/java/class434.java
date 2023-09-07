public class class434 {

	static class84[] field3409;

	int field3408;

	final class13 field3406;

	final int field3407;

	class434(class13 var1, String var2) {
		this.field3408 = 0;
		this.field3406 = var1;
		this.field3407 = var1.method1774();
	}

	boolean method2168() {
		this.field3408 = 0;
		for (int var2 = 0; var2 < this.field3407; ++var2) {
			if (!this.field3406.method40(var2) || this.field3406.method39(var2)) {
				++this.field3408;
			}
		}
		return this.field3408 >= this.field3407;
	}
}
