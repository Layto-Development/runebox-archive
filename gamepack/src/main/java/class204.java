import java.util.Comparator;

public class class204 implements Comparator {

	static class142 field1894;

	static class214[] field1896;

	static int field1893;

	boolean field1895;

	class204() {
	}

	int method1221(class342 var1, class342 var2) {
		if (var2.field2601 == var1.field2601) {
			return 0;
		} else {
			if (this.field1895) {
				if (var1.field2601 == Client.field898) {
					return -1;
				}
				if (var2.field2601 == Client.field898) {
					return 1;
				}
			}
			return var1.field2601 < var2.field2601 ? -1 : 1;
		}
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1221((class342) var1, (class342) var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static final void method1220(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}
		if (var3 < 1) {
			var3 = 1;
		}
		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = Client.field1171;
		} else if (var6 >= 100) {
			var7 = Client.field1057;
		} else {
			var7 = Client.field1171 + var6 * (Client.field1057 - Client.field1171) / 100;
		}
		int var8 = 512 * var3 * var7 / (var2 * 334);
		int var9;
		int var10;
		short var17;
		if (var8 < Client.field1177) {
			var17 = Client.field1177;
			var7 = var2 * var17 * 334 / (var3 * 512);
			if (var7 > Client.field1007) {
				var7 = Client.field1007;
				var9 = var3 * var7 * 512 / (var17 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					class206.method1230();
					class206.method1236(var0, var1, var10, var3, -16777216);
					class206.method1236(var0 + var2 - var10, var1, var10, var3, -16777216);
				}
				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > Client.field1178) {
			var17 = Client.field1178;
			var7 = var17 * var2 * 334 / (var3 * 512);
			if (var7 < Client.field1175) {
				var7 = Client.field1175;
				var9 = var17 * var2 * 334 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					class206.method1230();
					class206.method1236(var0, var1, var2, var10, -16777216);
					class206.method1236(var0, var3 + var1 - var10, var2, var10, -16777216);
				}
				var1 += var10;
				var3 -= var10 * 2;
			}
		}
		Client.field1183 = var7 * var3 / 334;
		if (var2 != Client.field1114 || Client.field989 != var3) {
			int[] var18 = new int[9];
			for (var10 = 0; var10 < var18.length; ++var10) {
				int var11 = var10 * 32 + 128 + 15;
				int var12 = Client.method523(var11);
				int var13 = class238.field2037[var11];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}
				int var16 = Client.field1173 + var15 * (Client.field1174 - Client.field1173) / 100;
				int var14 = var16 * var12 / 256;
				var18[var10] = var14 * var13 >> 16;
			}
			class372.method1953(var18, 500, 800, var2 * 334 / var3, 334);
		}
		Client.field1179 = var0;
		Client.field1180 = var1;
		Client.field1114 = var2;
		Client.field989 = var3;
	}
}
