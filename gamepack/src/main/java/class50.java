public abstract class class50 {
	class50() {
	}

	public abstract int method379(int var1, int var2);

	public abstract void method378();

	public static double[] method381(double var0, double var2, int var4) {
		int var6 = var4 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var4;

		for (int var9 = 0; var8 <= var4; ++var9) {
			double var16 = ((double)var8 - var0) / var2;
			double var14 = Math.exp(-var16 * var16 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var12 = var14 / var2;
			var7[var9] = var12;
			++var8;
		}

		return var7;
	}

	static final void method380() {
		class69.method503(class433.field3724);
	}
}
