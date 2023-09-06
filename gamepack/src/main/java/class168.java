import java.util.Locale;

@class457
@class490
public class class168 implements class367 {
	public static class215 field1631;
	public static final class168 field1630;
	public static final class168 field1633;
	public static final class168 field1636;
	static class392 field1640;
	static final class168 field1629;
	static final class168 field1634;
	static final class168 field1639;
	static final class168 field1641;
	static final class168[] field1638;
	final int field1637;
	final String field1632;
	final String field1635;

	static {
		field1636 = new class168("EN", "en", "English", class292.field2712, 0, "GB");
		field1641 = new class168("DE", "de", "German", class292.field2712, 1, "DE");
		field1630 = new class168("FR", "fr", "French", class292.field2712, 2, "FR");
		field1639 = new class168("PT", "pt", "Portuguese", class292.field2712, 3, "BR");
		field1629 = new class168("NL", "nl", "Dutch", class292.field2724, 4, "NL");
		field1633 = new class168("ES", "es", "Spanish", class292.field2724, 5, "ES");
		field1634 = new class168("ES_MX", "es-mx", "Spanish (Latin American)", class292.field2712, 6, "MX");
		class168[] var0 = method926();
		field1638 = new class168[var0.length];
		class168[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class168 var3 = var1[var2];
			if (field1638[var3.field1637] != null) {
				throw new IllegalStateException();
			}

			field1638[var3.field1637] = var3;
		}

	}

	class168(String var1, String var2, String var3, class292 var4, int var5, String var6) {
		this.field1635 = var1;
		this.field1632 = var2;
		this.field1637 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	String method928() {
		return this.field1632;
	}

	public int method1970() {
		return this.field1637;
	}

	public String toString() {
		return this.method928().toLowerCase(Locale.ENGLISH);
	}

	static class168[] method926() {
		return new class168[]{field1633, field1641, field1630, field1634, field1629, field1636, field1639};
	}

	static void method929() {
		class38.field503 = 99;
		class38.field504 = new short[4][104][104];
		class54.field604 = new short[4][104][104];
		class439.field3868 = new byte[4][104][104];
		class417.field3491 = new byte[4][104][104];
		class244.field2223 = new int[4][105][105];
		class394.field3316 = new byte[4][105][105];
		class539.field4278 = new int[105][105];
		class155.field1455 = new int[104];
		class255.field2361 = new int[104];
		class38.field505 = new int[104];
		class224.field2041 = new int[104];
		class139.field1340 = new int[104];
	}

	public static class168 method925(int var0) {
		return var0 >= 0 && var0 < field1638.length ? field1638[var0] : null;
	}

	static final void method930(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = var2 - var0;
		int var8 = var3 - var1;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8 >= 0 ? var8 : -var8;
		int var11 = var9;
		if (var9 < var10) {
			var11 = var10;
		}

		if (var11 != 0) {
			int var12 = (var7 << 16) / var11;
			int var13 = (var8 << 16) / var11;
			if (var13 <= var12) {
				var12 = -var12;
			} else {
				var13 = -var13;
			}

			int var14 = var5 * var13 >> 17;
			int var15 = 1 + var13 * var5 >> 17;
			int var16 = var5 * var12 >> 17;
			int var17 = var12 * var5 + 1 >> 17;
			var0 -= class266.field2409;
			var1 -= class266.field2410;
			int var18 = var0 + var14;
			int var19 = var0 - var15;
			int var20 = var7 + var0 - var15;
			int var21 = var14 + var0 + var7;
			int var22 = var1 + var16;
			int var23 = var1 - var17;
			int var24 = var1 + var8 - var17;
			int var25 = var16 + var8 + var1;
			class133.method794(var18, var19, var20);
			class133.method804(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			class133.method794(var18, var20, var21);
			class133.method804(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
