import java.util.Collections;

public class class160 extends class462 {
	public static class60[][] field1484;
	static class155 field1485;
	static class160[] field1481;
	static int field1482;
	public class129 field1478;
	public class347 field1483;
	public int field1479;
	public int field1480;

	static {
		field1481 = new class160[300];
		field1482 = 0;
	}

	class160() {
	}

	public void method894() {
		if (field1482 < field1481.length) {
			field1481[++field1482 - 1] = this;
		}
	}

	public static int method895(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	public static void method896(int[] var0, int[] var1) {
		if (null != var0 && var1 != null) {
			class483.field4097 = var0;
			class63.field804 = new int[var0.length];
			class258.field2367 = new byte[var0.length][][];

			for (int var3 = 0; var3 < class483.field4097.length; ++var3) {
				class258.field2367[var3] = new byte[var1[var3]][];
				class312.field2812.add(var0[var3]);
			}

			Collections.sort(class312.field2812);
		} else {
			class483.field4097 = null;
			class63.field804 = null;
			class258.field2367 = (byte[][][])null;
			class278.method1594();
		}
	}
}
