public class class341 {
	public static int[] field2960;
	public static final boolean[] field2958;
	static class25 field2959;

	static {
		field2958 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		field2960 = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			field2960[var1] = var0 / 4;
		}

	}

	class341() throws Throwable {
	}
}
