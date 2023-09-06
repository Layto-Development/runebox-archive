import java.util.HashSet;
import java.util.Set;

public class class292 implements class367 {
	static boolean field2722;
	static int field2723;
	static final class292 field2708;
	static final class292 field2709;
	static final class292 field2710;
	static final class292 field2711;
	static final class292 field2712;
	static final class292 field2713;
	static final class292 field2714;
	static final class292 field2715;
	static final class292 field2716;
	static final class292 field2717;
	static final class292 field2718;
	static final class292 field2719;
	static final class292 field2724;
	final int field2720;
	final Set field2721;

	static {
		field2712 = new class292("", 0, new class229[]{class229.field2087, class229.field2085});
		field2708 = new class292("", 1, new class229[]{class229.field2084, class229.field2087, class229.field2085});
		field2709 = new class292("", 2, new class229[]{class229.field2084, class229.field2088, class229.field2087});
		field2724 = new class292("", 3, new class229[]{class229.field2084});
		field2711 = new class292("", 4);
		field2713 = new class292("", 5, new class229[]{class229.field2084, class229.field2087});
		field2714 = new class292("", 6, new class229[]{class229.field2087});
		field2717 = new class292("", 8, new class229[]{class229.field2084, class229.field2087});
		field2715 = new class292("", 9, new class229[]{class229.field2084, class229.field2088});
		field2716 = new class292("", 10, new class229[]{class229.field2084});
		field2710 = new class292("", 11, new class229[]{class229.field2084});
		field2718 = new class292("", 12, new class229[]{class229.field2084, class229.field2087});
		field2719 = new class292("", 13, new class229[]{class229.field2084});
		method1673();
	}

	class292(String var1, int var2) {
		this.field2721 = new HashSet();
		this.field2720 = var2;
	}

	class292(String var1, int var2, class229[] var3) {
		this.field2721 = new HashSet();
		this.field2720 = var2;
		class229[] var4 = var3;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class229 var6 = var4[var5];
			this.field2721.add(var6);
		}

	}

	public int method1970() {
		return this.field2720;
	}

	public static void method1668(class215 var0) {
		class149.field1400 = var0;
	}

	static class292[] method1673() {
		return new class292[]{field2710, field2719, field2711, field2715, field2717, field2724, field2716, field2718, field2713, field2708, field2714, field2709, field2712};
	}

	static class167 method1672(int var0, int var1) {
		class167 var3 = (class167)class167.field1619.method1890((long)(var0 << 16));
		if (null != var3) {
			return var3;
		} else {
			String var4 = String.valueOf(var0);
			int var5 = class522.field4234.method1237(var4);
			if (var5 == -1) {
				return null;
			} else {
				byte[] var6 = class522.field4234.method1219(var5);
				if (null != var6) {
					if (var6.length <= 1) {
						return null;
					}

					var3 = class151.method869(var6);
					if (var3 != null) {
						class167.field1619.method1889(var3, (long)(var0 << 16));
						return var3;
					}
				}

				return null;
			}
		}
	}

	public static boolean method1669(int var0) {
		if (class105.field1038[var0]) {
			return true;
		} else if (!class475.field4032.method1216(var0)) {
			return false;
		} else {
			int var2 = class475.field4032.method1238(var0);
			if (var2 == 0) {
				class105.field1038[var0] = true;
				return true;
			} else {
				if (null == class160.field1484[var0]) {
					class160.field1484[var0] = new class60[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) {
					if (null == class160.field1484[var0][var3]) {
						byte[] var4 = class475.field4032.method1212(var0, var3);
						if (null != var4) {
							class160.field1484[var0][var3] = new class60();
							class160.field1484[var0][var3].field644 = var3 + (var0 << 16);
							if (var4[0] == -1) {
								class160.field1484[var0][var3].method437(new class42(var4));
							} else {
								class160.field1484[var0][var3].method436(new class42(var4));
							}
						}
					}
				}

				class105.field1038[var0] = true;
				return true;
			}
		}
	}

	static void method1671(class12 var0) {
		if (var0.method108() != Client.field30) {
			Client.field30 = var0.method108();
			boolean var2 = var0.method108();
			if (class210.field1934 != var2) {
				class210.field1935.method1887();
				class210.field1980.method1887();
				class210.field1937.method1887();
				class210.field1934 = var2;
			}
		}

		if (var0.field364 != Client.field4) {
			class342 var4 = class337.field2945;
			int var3 = var0.field364;
			if ((var3 & class162.field1520.method1970()) != 0) {
				class474.field4030 = class439.method2208(var4, "logo_deadman_mode", "");
			} else if ((var3 & class162.field1521.method1970()) != 0) {
				class474.field4030 = class439.method2208(var4, "logo_seasonal_mode", "");
			} else if ((var3 & class162.field1499.method1970()) != 0) {
				class474.field4030 = class439.method2208(var4, "logo_speedrunning", "");
			} else {
				class474.field4030 = class439.method2208(var4, "logo", "");
			}
		}

		class275.field2448 = var0.field371;
		Client.field3 = var0.field368;
		Client.field4 = var0.field364;
		class289.field2577 = var0.field375;
		class192.field1776 = Client.field28 == 0 ? 43594 : 40000 + var0.field368;
		class452.field3957 = Client.field28 == 0 ? 443 : 50000 + var0.field368;
		class239.field2207 = class192.field1776;
	}
}
