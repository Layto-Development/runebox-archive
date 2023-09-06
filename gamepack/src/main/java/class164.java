import java.util.concurrent.locks.ReentrantLock;

public class class164 {
	public static class215 field1605;
	static class453 field1604;
	static int field1606;
	class352 field1602;
	class374 field1607;
	ReentrantLock field1603;

	class164(class374 var1, class352 var2) {
		this.field1607 = var1;
		this.field1602 = var2;
		this.field1603 = new ReentrantLock();
	}

	static void method912(int var0, int var1, int var2, int var3, String var4) {
		class60 var6 = class203.method1149(var1, var2);
		if (null != var6) {
			if (var6.field747 != null) {
				class309 var7 = new class309();
				var7.field2791 = var6;
				var7.field2796 = var0;
				var7.field2800 = var4;
				var7.field2794 = var6.field747;
				class186.method1031(var7);
			}

			boolean var12 = true;
			if (var6.field670 > 0) {
				var12 = class169.method938(var6);
			}

			if (var12) {
				int var9 = class447.method2235(var6);
				int var10 = var0 - 1;
				boolean var8 = (var9 >> var10 + 1 & 1) != 0;
				if (var8) {
					class160 var11;
					if (var0 == 1) {
						var11 = class85.method556(class129.field1202, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 2) {
						var11 = class85.method556(class129.field1192, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 3) {
						var11 = class85.method556(class129.field1244, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 4) {
						var11 = class85.method556(class129.field1209, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 5) {
						var11 = class85.method556(class129.field1225, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 6) {
						var11 = class85.method556(class129.field1181, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 7) {
						var11 = class85.method556(class129.field1223, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 8) {
						var11 = class85.method556(class129.field1177, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 9) {
						var11 = class85.method556(class129.field1252, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

					if (var0 == 10) {
						var11 = class85.method556(class129.field1208, Client.field68.field2426);
						var11.field1483.method333(var1);
						var11.field1483.method308(var2);
						var11.field1483.method308(var3);
						Client.field68.method1570(var11);
					}

				}
			}
		}
	}
}
