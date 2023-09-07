import java.util.HashSet;
import java.util.Set;

public class class393 implements class228 {

	static boolean field3125;

	static int field3126;

	static final class393 field3111;

	static final class393 field3112;

	static final class393 field3113;

	static final class393 field3114;

	static final class393 field3115;

	static final class393 field3116;

	static final class393 field3117;

	static final class393 field3118;

	static final class393 field3119;

	static final class393 field3120;

	static final class393 field3121;

	static final class393 field3122;

	static final class393 field3127;

	final int field3123;

	final Set field3124;

	static {
		field3115 = new class393("", 0, new class325[] { class325.field2529, class325.field2527 });
		field3111 = new class393("", 1, new class325[] { class325.field2526, class325.field2529, class325.field2527 });
		field3112 = new class393("", 2, new class325[] { class325.field2526, class325.field2530, class325.field2529 });
		field3127 = new class393("", 3, new class325[] { class325.field2526 });
		field3114 = new class393("", 4);
		field3116 = new class393("", 5, new class325[] { class325.field2526, class325.field2529 });
		field3117 = new class393("", 6, new class325[] { class325.field2529 });
		field3120 = new class393("", 8, new class325[] { class325.field2526, class325.field2529 });
		field3118 = new class393("", 9, new class325[] { class325.field2526, class325.field2530 });
		field3119 = new class393("", 10, new class325[] { class325.field2526 });
		field3113 = new class393("", 11, new class325[] { class325.field2526 });
		field3121 = new class393("", 12, new class325[] { class325.field2526, class325.field2529 });
		field3122 = new class393("", 13, new class325[] { class325.field2526 });
		method2033();
	}

	class393(String var1, int var2) {
		this.field3124 = new HashSet();
		this.field3123 = var2;
	}

	class393(String var1, int var2, class325[] var3) {
		this.field3124 = new HashSet();
		this.field3123 = var2;
		class325[] var4 = var3;
		for (int var5 = 0; var5 < var4.length; ++var5) {
			class325 var6 = var4[var5];
			this.field3124.add(var6);
		}
	}

	@Override
	public int method1362() {
		return this.field3123;
	}

	static class393[] method2033() {
		return new class393[] { field3113, field3122, field3114, field3118, field3120, field3127, field3119, field3121, field3116, field3111, field3117, field3112, field3115 };
	}

	static void method2032(class192 var0) {
		if (var0.method1173() != Client.field925) {
			Client.field925 = var0.method1173();
			boolean var2 = var0.method1173();
			if (class426.field3293 != var2) {
				class426.field3294.method645();
				class426.field3339.method645();
				class426.field3296.method645();
				class426.field3293 = var2;
			}
		}
		if (var0.field1840 != Client.field899) {
			class13 var4 = class537.field4228;
			int var3 = var0.field1840;
			if ((var3 & class351.field2669.method1362()) != 0) {
				class365.field2924 = class494.method2365(var4, "logo_deadman_mode", "");
			} else if ((var3 & class351.field2670.method1362()) != 0) {
				class365.field2924 = class494.method2365(var4, "logo_seasonal_mode", "");
			} else if ((var3 & class351.field2648.method1362()) != 0) {
				class365.field2924 = class494.method2365(var4, "logo_speedrunning", "");
			} else {
				class365.field2924 = class494.method2365(var4, "logo", "");
			}
		}
		class112.field1318 = var0.field1847;
		Client.field898 = var0.field1844;
		Client.field899 = var0.field1840;
		class512.field4086 = var0.field1851;
		class10.field58 = Client.field923 == 0 ? 43594 : 40000 + var0.field1844;
		class283.field2297 = Client.field923 == 0 ? 443 : 50000 + var0.field1844;
		class216.field1946 = class10.field58;
	}
}
