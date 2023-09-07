public class class4 {

	static final class4 field10;

	static final class4 field11;

	static final class4 field12;

	static final class4 field13;

	static final class4 field14;

	static final class4 field15;

	static final class4 field16;

	static final class4 field17;

	static final class4 field18;

	static final class4 field19;

	static final class4 field20;

	static final class4 field5;

	static final class4 field6;

	static final class4 field7;

	static final class4 field8;

	static final class4 field9;

	static {
		field15 = new class4();
		field6 = new class4();
		field14 = new class4();
		field8 = new class4();
		field9 = new class4();
		field13 = new class4();
		field11 = new class4();
		field12 = new class4();
		field5 = new class4();
		field19 = new class4();
		field20 = new class4();
		field17 = new class4();
		field16 = new class4();
		field10 = new class4();
		field18 = new class4();
		field7 = new class4();
	}

	class4() {
	}

	static void method10(class82 var0, boolean var1) {
		if (null != var0 && var0.method217() && !var0.field825) {
			var0.field823 = false;
			if ((Client.field902 && class274.field2240 > 50 || class274.field2240 > 200) && var1 && var0.field248 == var0.field255) {
				var0.field823 = true;
			}
			int var3 = var0.field272 >> 7;
			int var4 = var0.field243 >> 7;
			if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
				long var5 = class424.method2134(0, 0, 0, false, var0.field805);
				if (null != var0.field818 && Client.field1201 >= var0.field814 && Client.field1201 < var0.field824) {
					var0.field823 = false;
					var0.field812 = Client.method450(var0.field272, var0.field243, class121.field1436);
					var0.field278 = Client.field1201;
					class377.field3061.method1925(class121.field1436, var0.field272, var0.field243, var0.field812, 60, var0, var0.field244, var5, var0.field830, var0.field820, var0.field821, var0.field810);
				} else {
					if ((var0.field272 & 127) == 64 && (var0.field243 & 127) == 64) {
						if (Client.field1068 == Client.field1014[var3][var4]) {
							return;
						}
						Client.field1014[var3][var4] = Client.field1068;
					}
					var0.field812 = Client.method450(var0.field272, var0.field243, class121.field1436);
					var0.field278 = Client.field1201;
					class377.field3061.method1924(class121.field1436, var0.field272, var0.field243, var0.field812, 60, var0, var0.field244, var5, var0.field250);
				}
			}
		}
	}
}
