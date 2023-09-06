public class class357 {
	static final int[] field3034;
	static final int[] field3035;

	static {
		field3035 = new int[2048];
		field3034 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field3035[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field3034[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}

	class357() throws Throwable {
	}
}
