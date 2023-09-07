public class class209 {

	static final int[] field1916;

	static final int[] field1917;

	static {
		field1916 = new int[16384];
		field1917 = new int[16384];
		double var0 = 3.834951969714103E-4D;
		for (int var2 = 0; var2 < 16384; ++var2) {
			field1916[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
			field1917[var2] = (int) (16384.0D * Math.cos(var0 * (double) var2));
		}
	}

	class209() throws Throwable {
	}

	public static int method1261(int var0, int var1) {
		return (int) Math.round(Math.atan2((double) var0, (double) var1) * 2607.5945876176133D) & 16383;
	}

	public static int method1260(int var0) {
		return field1916[var0 & 16383];
	}

	public static int method1262(int var0) {
		return field1917[var0 & 16383];
	}
}
