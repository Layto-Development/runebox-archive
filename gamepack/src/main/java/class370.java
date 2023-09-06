public class class370 {
	static final int[] field3102;
	static final int[] field3103;

	static {
		field3102 = new int[16384];
		field3103 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field3102[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field3103[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	class370() throws Throwable {
	}
}
