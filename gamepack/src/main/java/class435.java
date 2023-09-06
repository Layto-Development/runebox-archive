public class class435 {
	class435() throws Throwable {
	}

	public static byte method2206(char var0) {
		byte var2;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var2 = -128;
			} else if (var0 == 8218) {
				var2 = -126;
			} else if (var0 == 402) {
				var2 = -125;
			} else if (var0 == 8222) {
				var2 = -124;
			} else if (var0 == 8230) {
				var2 = -123;
			} else if (var0 == 8224) {
				var2 = -122;
			} else if (var0 == 8225) {
				var2 = -121;
			} else if (var0 == 710) {
				var2 = -120;
			} else if (var0 == 8240) {
				var2 = -119;
			} else if (var0 == 352) {
				var2 = -118;
			} else if (var0 == 8249) {
				var2 = -117;
			} else if (var0 == 338) {
				var2 = -116;
			} else if (var0 == 381) {
				var2 = -114;
			} else if (var0 == 8216) {
				var2 = -111;
			} else if (var0 == 8217) {
				var2 = -110;
			} else if (var0 == 8220) {
				var2 = -109;
			} else if (var0 == 8221) {
				var2 = -108;
			} else if (var0 == 8226) {
				var2 = -107;
			} else if (var0 == 8211) {
				var2 = -106;
			} else if (var0 == 8212) {
				var2 = -105;
			} else if (var0 == 732) {
				var2 = -104;
			} else if (var0 == 8482) {
				var2 = -103;
			} else if (var0 == 353) {
				var2 = -102;
			} else if (var0 == 8250) {
				var2 = -101;
			} else if (var0 == 339) {
				var2 = -100;
			} else if (var0 == 382) {
				var2 = -98;
			} else if (var0 == 376) {
				var2 = -97;
			} else {
				var2 = 63;
			}
		} else {
			var2 = (byte)var0;
		}

		return var2;
	}

	static final void method2207(class60 var0, int var1, int var2) {
		if (Client.field256 == 0 || Client.field256 == 3) {
			if (!Client.field116 && (class184.field1739 == 1 || !class30.field467 && class184.field1739 == 4)) {
				class420 var4 = var0.method444(true);
				if (var4 == null) {
					return;
				}

				int var5 = class184.field1740 - var1;
				int var6 = class184.field1741 - var2;
				if (var4.method2163(var5, var6)) {
					var5 -= var4.field3506 / 2;
					var6 -= var4.field3505 / 2;
					int var7 = Client.field181 & 2047;
					int var8 = class133.field1291[var7];
					int var9 = class133.field1289[var7];
					int var10 = var9 * var5 + var8 * var6 >> 11;
					int var11 = var9 * var6 - var8 * var5 >> 11;
					int var12 = class82.field863.field1555 + var10 >> 7;
					int var13 = class82.field863.field1526 - var11 >> 7;
					class160 var14 = class85.method556(class129.field1217, Client.field68.field2426);
					var14.field1483.method267(18);
					var14.field1483.method303(class296.field2735 + var12);
					var14.field1483.method330(var13 + class164.field1606);
					var14.field1483.method314(Client.field151.method2118(82) ? (Client.field151.method2118(81) ? 2 : 1) : 0);
					var14.field1483.method267(var5);
					var14.field1483.method267(var6);
					var14.field1483.method308(Client.field181);
					var14.field1483.method267(57);
					var14.field1483.method267(0);
					var14.field1483.method267(0);
					var14.field1483.method267(89);
					var14.field1483.method308(class82.field863.field1555);
					var14.field1483.method308(class82.field863.field1526);
					var14.field1483.method267(63);
					Client.field68.method1570(var14);
					Client.field254 = var12;
					Client.field177 = var13;
				}
			}

		}
	}
}
