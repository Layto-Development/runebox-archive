public class class410 {

	public static int[] field3198;

	public static int[] field3200;

	static int[] field3197;

	static int[] field3199;

	static {
		field3197 = new int[32];
		int var0 = 2;
		for (int var1 = 0; var1 < 32; ++var1) {
			field3197[var1] = var0 - 1;
			var0 += var0;
		}
		field3200 = new int[4000];
		field3198 = new int[4000];
	}

	class410() throws Throwable {
	}

	public static int method2082(int var0) {
		class431 var2 = class431.method2163(var0);
		int var3 = var2.field3373;
		int var4 = var2.field3374;
		int var5 = var2.field3377;
		int var6 = field3197[var5 - var4];
		return field3198[var3] >> var4 & var6;
	}
}
