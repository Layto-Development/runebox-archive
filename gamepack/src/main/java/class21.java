public class class21 implements class40 {

	class270[] field108;

	class338 field106;

	class449 field109;

	double field107;

	int field104;

	int field105;

	int field110;

	public class21(class338 var1, class338 var2, int var3, double var4, int var6) {
		this.field109 = new class449();
		this.field105 = 0;
		this.field107 = 1.0D;
		this.field110 = 128;
		this.field106 = var2;
		this.field104 = var3;
		this.field105 = this.field104;
		this.field107 = var4;
		this.field110 = var6;
		int[] var7 = var1.method1773(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.field108 = new class270[var1.method1788(0)];
			for (int var9 = 0; var9 < var8; ++var9) {
				class187 var10 = new class187(var1.method1762(0, var7[var9]));
				this.field108[var7[var9]] = new class270(var10);
			}
		} else {
			this.field108 = new class270[0];
		}
	}

	public int method65() {
		if (this.field108.length == 0) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			class270[] var4 = this.field108;
			for (int var5 = 0; var5 < var4.length; ++var5) {
				class270 var6 = var4[var5];
				if (var6 != null && var6.field2213 != null) {
					var2 += var6.field2213.length;
					int[] var7 = var6.field2213;
					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field106.method1765(var9)) {
							++var3;
						}
					}
				}
			}
			if (var2 == 0) {
				return 0;
			} else {
				return var3 * 100 / var2;
			}
		}
	}

	public void method66(double var1) {
		this.field107 = var1;
		this.method71();
	}

	@Override
	public int[] method175(int var1) {
		class270 var3 = this.field108[var1];
		if (null != var3) {
			if (var3.field2219 != null) {
				this.field109.method2223(var3);
				var3.field2218 = true;
				return var3.field2219;
			}
			boolean var4 = var3.method1515(this.field107, this.field110, this.field106);
			if (var4) {
				if (this.field105 == 0) {
					class270 var5 = (class270) this.field109.method2217();
					var5.method1513();
				} else {
					--this.field105;
				}
				this.field109.method2223(var3);
				var3.field2218 = true;
				return var3.field2219;
			}
		}
		return null;
	}

	@Override
	public int method172(int var1) {
		return this.field108[var1] != null ? this.field108[var1].field2211 : 0;
	}

	@Override
	public boolean method174(int var1) {
		return this.field108[var1].field2212;
	}

	@Override
	public boolean method173(int var1) {
		return this.field110 == 64;
	}

	public void method71() {
		for (int var2 = 0; var2 < this.field108.length; ++var2) {
			if (null != this.field108[var2]) {
				this.field108[var2].method1513();
			}
		}
		this.field109 = new class449();
		this.field105 = this.field104;
	}

	public void method67(int var1) {
		for (int var3 = 0; var3 < this.field108.length; ++var3) {
			class270 var4 = this.field108[var3];
			if (null != var4 && var4.field2217 != 0 && var4.field2218) {
				var4.method1514(var1);
				var4.field2218 = false;
			}
		}
	}
}
