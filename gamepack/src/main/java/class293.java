import java.util.Comparator;

public class class293 implements Comparator {
	static int field2725;
	final boolean field2726;

	public class293(boolean var1) {
		this.field2726 = var1;
	}

	int method1674(class304 var1, class304 var2) {
		return this.field2726 ? var1.field2768 - var2.field2768 : var2.field2768 - var1.field2768;
	}

	public int compare(Object var1, Object var2) {
		return this.method1674((class304)var1, (class304)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static float method1675(class415 var0, float var1, boolean var2) {
		float var4 = 0.0F;
		if (null != var0 && var0.method2141() != 0) {
			float var5 = (float)var0.field3470[0].field986;
			float var6 = (float)var0.field3470[var0.method2141() - 1].field986;
			float var7 = var6 - var5;
			if ((double)var7 == 0.0D) {
				return var0.field3470[0].field989;
			} else {
				float var8 = 0.0F;
				if (var1 > var6) {
					var8 = (var1 - var6) / var7;
				} else {
					var8 = (var1 - var5) / var7;
				}

				double var9 = (double)((int)var8);
				float var11 = Math.abs((float)((double)var8 - var9));
				float var12 = var11 * var7;
				var9 = Math.abs(var9 + 1.0D);
				double var13 = var9 / 2.0D;
				double var15 = (double)((int)var13);
				var11 = (float)(var13 - var15);
				float var17;
				float var18;
				if (var2) {
					if (class224.field2042 == var0.field3468) {
						if ((double)var11 != 0.0D) {
							var12 += var5;
						} else {
							var12 = var6 - var12;
						}
					} else if (var0.field3468 != class224.field2037 && var0.field3468 != class224.field2038) {
						if (class224.field2039 == var0.field3468) {
							var12 = var5 - var1;
							var17 = var0.field3470[0].field995;
							var18 = var0.field3470[0].field987;
							var4 = var0.field3470[0].field989;
							if (0.0D != (double)var17) {
								var4 -= var12 * var18 / var17;
							}

							return var4;
						}
					} else {
						var12 = var6 - var12;
					}
				} else if (class224.field2042 == var0.field3488) {
					if ((double)var11 != 0.0D) {
						var12 = var6 - var12;
					} else {
						var12 += var5;
					}
				} else if (class224.field2037 != var0.field3488 && var0.field3488 != class224.field2038) {
					if (var0.field3488 == class224.field2039) {
						var12 = var1 - var6;
						var17 = var0.field3470[var0.method2141() - 1].field990;
						var18 = var0.field3470[var0.method2141() - 1].field991;
						var4 = var0.field3470[var0.method2141() - 1].field989;
						if (0.0D != (double)var17) {
							var4 += var18 * var12 / var17;
						}

						return var4;
					}
				} else {
					var12 += var5;
				}

				var4 = class43.method341(var0, var12);
				float var19;
				if (var2 && class224.field2038 == var0.field3468) {
					var19 = var0.field3470[var0.method2141() - 1].field989 - var0.field3470[0].field989;
					var4 = (float)((double)var4 - (double)var19 * var9);
				} else if (!var2 && var0.field3488 == class224.field2038) {
					var19 = var0.field3470[var0.method2141() - 1].field989 - var0.field3470[0].field989;
					var4 = (float)((double)var4 + (double)var19 * var9);
				}

				return var4;
			}
		} else {
			return var4;
		}
	}
}
