public class class478 {
	String field4065;
	String field4067;
	public final class522 field4064;
	public final int field4068;
	public final long field4066;

	class478(class42 var1, byte var2, int var3) {
		this.field4067 = var1.method286();
		this.field4065 = var1.method286();
		this.field4068 = var1.method327();
		this.field4066 = var1.method283();
		int var4 = var1.method282();
		int var5 = var1.method282();
		this.field4064 = new class522();
		this.field4064.method2532(2);
		this.field4064.method2536(var2);
		this.field4064.field4233 = var4;
		this.field4064.field4231 = var5;
		this.field4064.field4232 = 0;
		this.field4064.field4228 = 0;
		this.field4064.field4229 = var3;
	}

	public String method2387() {
		return this.field4067;
	}

	public String method2386() {
		return this.field4065;
	}

	static float method2388(float[] var0, int var1, float var2) {
		float var4 = var0[var1];

		for (int var5 = var1 - 1; var5 >= 0; --var5) {
			var4 = var4 * var2 + var0[var5];
		}

		return var4;
	}
}
