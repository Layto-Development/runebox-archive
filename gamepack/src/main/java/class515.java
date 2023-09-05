import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashSet;
import java.util.Set;

@ObfInfo(name = "oe")
public class class515 implements class425 {
	@ObfInfo(name = "dc", desc = "Z")
	static boolean field4125;
	@ObfInfo(name = "oo", desc = "I", intMultiplier = 380292501)
	static int field4126;
	@ObfInfo(name = "ae", desc = "Loe;")
	static final class515 field4111;
	@ObfInfo(name = "ao", desc = "Loe;")
	static final class515 field4112;
	@ObfInfo(name = "ad", desc = "Loe;")
	static final class515 field4113;
	@ObfInfo(name = "ac", desc = "Loe;")
	static final class515 field4114;
	@ObfInfo(name = "au", desc = "Loe;")
	static final class515 field4115;
	@ObfInfo(name = "ai", desc = "Loe;")
	static final class515 field4116;
	@ObfInfo(name = "az", desc = "Loe;")
	static final class515 field4117;
	@ObfInfo(name = "aa", desc = "Loe;")
	static final class515 field4118;
	@ObfInfo(name = "af", desc = "Loe;")
	static final class515 field4119;
	@ObfInfo(name = "ap", desc = "Loe;")
	static final class515 field4120;
	@ObfInfo(name = "aq", desc = "Loe;")
	static final class515 field4121;
	@ObfInfo(name = "al", desc = "Loe;")
	static final class515 field4122;
	@ObfInfo(name = "at", desc = "Loe;")
	static final class515 field4127;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -539297047)
	final int field4123;
	@ObfInfo(name = "ar", desc = "Ljava/util/Set;")
	final Set field4124;

	static {
		field4115 = new class515("", 0, new class400[]{class400.field3116, class400.field3114});
		field4111 = new class515("", 1, new class400[]{class400.field3113, class400.field3116, class400.field3114});
		field4112 = new class515("", 2, new class400[]{class400.field3113, class400.field3117, class400.field3116});
		field4127 = new class515("", 3, new class400[]{class400.field3113});
		field4114 = new class515("", 4);
		field4116 = new class515("", 5, new class400[]{class400.field3113, class400.field3116});
		field4117 = new class515("", 6, new class400[]{class400.field3116});
		field4120 = new class515("", 8, new class400[]{class400.field3113, class400.field3116});
		field4118 = new class515("", 9, new class400[]{class400.field3113, class400.field3117});
		field4119 = new class515("", 10, new class400[]{class400.field3113});
		field4113 = new class515("", 11, new class400[]{class400.field3113});
		field4121 = new class515("", 12, new class400[]{class400.field3113, class400.field3116});
		field4122 = new class515("", 13, new class400[]{class400.field3113});
		method2517();
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;I)V")
	class515(String var1, int var2) {
		this.field4124 = new HashSet();
		this.field4123 = var2;
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;I[Log;)V")
	class515(String var1, int var2, class400[] var3) {
		this.field4124 = new HashSet();
		this.field4123 = var2;
		class400[] var4 = var3;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class400 var6 = var4[var5];
			this.field4124.add(var6);
		}

	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field4123;
	}

	@ObfInfo(name = "au", desc = "(I)[Loe;")
	static class515[] method2517() {
		return new class515[]{field4113, field4122, field4114, field4118, field4120, field4127, field4119, field4121, field4116, field4111, field4117, field4112, field4115};
	}

	@ObfInfo(name = "ag", desc = "(Lch;I)V", opaqueValue = "415075444")
	static void method2516(class516 var0) {
		if (var0.method2518() != Client.field54) {
			Client.field54 = var0.method2518();
			boolean var2 = var0.method2518();
			if (class270.field2166 != var2) {
				class270.field2167.method291();
				class270.field2212.method291();
				class270.field2169.method291();
				class270.field2166 = var2;
			}
		}

		if (var0.field4128 != Client.field28) {
			class505 var4 = class429.field3253;
			int var3 = var0.field4128;
			if ((var3 & class82.field864.method2222()) != 0) {
				class279.field2250 = class273.method1433(var4, "logo_deadman_mode", "");
			} else if ((var3 & class82.field865.method2222()) != 0) {
				class279.field2250 = class273.method1433(var4, "logo_seasonal_mode", "");
			} else if ((var3 & class82.field843.method2222()) != 0) {
				class279.field2250 = class273.method1433(var4, "logo_speedrunning", "");
			} else {
				class279.field2250 = class273.method1433(var4, "logo", "");
			}
		}

		class17.field364 = var0.field4135;
		Client.field27 = var0.field4132;
		Client.field28 = var0.field4128;
		class499.field4034 = var0.field4139;
		class213.field1904 = Client.field52 == 0 ? 43594 : 40000 + var0.field4132;
		class91.field927 = Client.field52 == 0 ? 443 : 50000 + var0.field4132;
		class127.field1165 = class213.field1904;
	}
}
