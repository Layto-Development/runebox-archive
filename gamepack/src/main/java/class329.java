public class class329 {

	public static int[] field2538;

	public static final boolean[] field2536;

	static class214 field2537;

	static {
		field2536 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
		field2538 = new int[99];
		int var0 = 0;
		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
			var0 += var3;
			field2538[var1] = var0 / 4;
		}
	}

	class329() throws Throwable {
	}
}
