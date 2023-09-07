import java.util.ArrayList;
import java.util.Iterator;

public class class436 extends class310 {

	static class106 field3421;

	class419[] field3430;

	int field3425;

	int field3427;

	int field3428;

	int field3429;

	int[] field3422;

	int[] field3423;

	String field3426;

	String[] field3424;

	static {
		field3421 = new class106(128);
	}

	class436() {
	}

	class419[] method2170(int var1) {
		return new class419[var1];
	}

	static class436 method2173(int var0) {
		class436 var2 = (class436) field3421.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class516.field4099.method1762(var0, 0);
			if (null == var3) {
				return null;
			} else {
				var2 = method2174(var3);
				field3421.method647(var2, (long) var0);
				return var2;
			}
		}
	}

	static class436 method2176(int var0, int var1, int var2) {
		int var4 = (var1 << 8) + var0;
		class436 var6 = method2175(var4, var0);
		if (null != var6) {
			return var6;
		} else {
			int var7 = (-3 - var2 << 8) + var0;
			var6 = method2175(var7, var0);
			if (null != var6) {
				return var6;
			} else {
				int var8 = var0 + -512;
				var6 = method2175(var8, var0);
				return null != var6 ? var6 : null;
			}
		}
	}

	static class436 method2175(int var0, int var1) {
		class436 var3 = (class436) field3421.method648((long) (var0 << 16));
		if (null != var3) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = class516.field4099.method1787(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = class516.field4099.method1769(var5);
				if (null != var6) {
					if (var6.length <= 1) {
						return null;
					}
					var3 = method2174(var6);
					if (var3 != null) {
						field3421.method647(var3, (long) (var0 << 16));
						return var3;
					}
				}
				return null;
			}
		}
	}

	public static void method2172(int var0, int var1) {
		class388.method2021(var0, var1, 0, 0);
		class388.field3091.clear();
		class388.field3092.clear();
		if (class388.field3090.isEmpty() || var0 == 0 && var1 == 0) {
			class388.method2022();
		} else {
			class388.field3092.add(new class293((class17) null, class388.field3094));
			class388.field3092.add(new class72((class17) null, 0, false, class388.field3095));
			ArrayList var4 = new ArrayList();
			Iterator var5 = class388.field3090.iterator();
			while (var5.hasNext()) {
				class490 var6 = (class490) var5.next();
				var4.add(var6);
			}
			class388.field3092.add(new class398((class17) null, var4));
		}
	}

	static class436 method2174(byte[] var0) {
		class436 var2 = new class436();
		class187 var3 = new class187(var0);
		var3.field1832 = var3.field1830.length - 2;
		int var4 = var3.method1145();
		int var5 = var3.field1830.length - 2 - var4 - 12;
		var3.field1832 = var5;
		int var6 = var3.method1100();
		var2.field3425 = var3.method1145();
		var2.field3429 = var3.method1145();
		var2.field3427 = var3.method1145();
		var2.field3428 = var3.method1145();
		int var7 = var3.method1096();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field3430 = var2.method2170(var7);
			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method1145();
				class419 var10 = new class419(var9 > 0 ? class50.method204(var9) : 1);
				var2.field3430[var8] = var10;
				while (var9-- > 0) {
					int var11 = var3.method1100();
					int var12 = var3.method1100();
					var10.method2109(new class239(var12), (long) var11);
				}
			}
		}
		var3.field1832 = 0;
		var2.field3426 = var3.method1155();
		var2.field3422 = new int[var6];
		var2.field3423 = new int[var6];
		var2.field3424 = new String[var6];
		for (var8 = 0; var3.field1832 < var5; var2.field3422[var8++] = var9) {
			var9 = var3.method1145();
			if (var9 == 3) {
				var2.field3424[var8] = var3.method1104();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field3423[var8] = var3.method1100();
			} else {
				var2.field3423[var8] = var3.method1096();
			}
		}
		return var2;
	}

	static final void method2171(int var0) {
		Client.method599();
		switch(var0) {
			case 1:
				class174.method1045();
				break;
			case 2:
				class174.method1030(24);
				class174.method1042(class55.field549, class55.field550, class55.field551);
		}
	}
}
