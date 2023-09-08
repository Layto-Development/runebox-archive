public class class44 {

	static final int[] field207;

	static final int[] field208;

	static {
		field208 = new int[2048];
		field207 = new int[2048];
		double var0 = 0.0030679615757712823D;
		for (int var2 = 0; var2 < 2048; ++var2) {
			field208[var2] = (int) (65536.0D * Math.sin(var0 * (double) var2));
			field207[var2] = (int) (65536.0D * Math.cos((double) var2 * var0));
		}
	}

	class44() throws Throwable {
	}
}
