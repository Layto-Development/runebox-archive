public class class104 {
	public boolean field1030;
	public boolean field1031;
	public boolean field1033;
	public boolean field1034;
	public boolean field1037;
	public class179 field1036;
	public class18 field1032;
	public class203 field1035;
	public class215 field1029;
	public float field1025;
	public int field1026;
	public int field1027;
	public int field1028;

	public class104(class215 var1, String var2, String var3, int var4, boolean var5) {
		this.field1026 = -1;
		this.field1027 = -1;
		this.field1028 = 0;
		this.field1025 = 0.0F;
		this.field1030 = false;
		this.field1037 = false;
		this.field1034 = false;
		this.field1026 = var1.method1237(var2);
		this.field1027 = var1.method1229(this.field1026, var3);
		this.method676(var1, this.field1026, this.field1027, var4, var5);
	}

	public class104(class215 var1, int var2, int var3, int var4, boolean var5) {
		this.field1026 = -1;
		this.field1027 = -1;
		this.field1028 = 0;
		this.field1025 = 0.0F;
		this.field1030 = false;
		this.field1037 = false;
		this.field1034 = false;
		this.method676(var1, var2, var3, var4, var5);
	}

	void method676(class215 var1, int var2, int var3, int var4, boolean var5) {
		this.field1029 = var1;
		this.field1026 = var2;
		this.field1027 = var3;
		this.field1028 = var4;
		this.field1030 = var5;
	}

	static void method675(int var0) {
		if (Client.field87 != var0) {
			if (Client.field87 == 30) {
				Client.field242.method1507();
			}

			if (Client.field87 == 0) {
				class466.field3999.method975();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class105.method679(0);
				Client.field18 = 0;
				Client.field69 = 0;
				Client.field71.method59(var0);
				if (var0 != 20) {
					class353.method1926(false);
				}
			}

			if (var0 != 20 && var0 != 40 && null != class431.field3536) {
				class431.field3536.method2194();
				class431.field3536 = null;
			}

			if (Client.field87 == 25) {
				Client.field77 = 0;
				Client.field73 = 0;
				Client.field107 = 1;
				Client.field75 = 0;
				Client.field76 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = Client.field87 == 11 ? 4 : 0;
					class7.method62(class371.field3106, class337.field2945, false, var4);
				} else if (var0 == 11) {
					class7.method62(class371.field3106, class337.field2945, false, 4);
				} else if (var0 == 50) {
					class174.method993("", "Updating date of birth...", "");
					class7.method62(class371.field3106, class337.field2945, false, 7);
				} else if (class216.field2024) {
					class116.field1088 = null;
					class466.field4000 = null;
					class116.field1087 = null;
					class116.field1090 = null;
					class169.field1646 = null;
					class474.field4030 = null;
					class149.field1401 = null;
					class116.field1085 = null;
					class73.field821 = null;
					class487.field4107 = null;
					class203.field1907 = null;
					class354.field3032 = null;
					class324.field2899 = null;
					class285.field2515 = null;
					class196.field1790.method624();
					class167.method924(0, 100);
					class76.method534().method1648(true);
					class216.field2024 = false;
				}
			} else {
				boolean var2 = class176.field1701.method2501() >= Client.field8;
				int var3 = var2 ? 0 : 12;
				class7.method62(class371.field3106, class337.field2945, true, var3);
			}

			Client.field87 = var0;
		}
	}
}
