import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Locale;

@ObfInfo(name = "on")
@class103
public class class67 implements class425 {
	@ObfInfo(name = "bv", desc = "Lnu;")
	public static class437 field760;
	@ObfInfo(name = "ao", desc = "Lon;")
	public static final class67 field759;
	@ObfInfo(name = "ai", desc = "Lon;")
	public static final class67 field762;
	@ObfInfo(name = "au", desc = "Lon;")
	public static final class67 field765;
	@ObfInfo(name = "cs", desc = "Lsl;")
	static class187 field769;
	@ObfInfo(name = "ac", desc = "Lon;")
	static final class67 field758;
	@ObfInfo(name = "az", desc = "Lon;")
	static final class67 field763;
	@ObfInfo(name = "at", desc = "Lon;")
	static final class67 field768;
	@ObfInfo(name = "ae", desc = "Lon;")
	static final class67 field770;
	@ObfInfo(name = "ad", desc = "[Lon;")
	static final class67[] field767;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 459816573)
	final int field766;
	@ObfInfo(name = "aa", desc = "Ljava/lang/String;")
	final String field761;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	final String field764;

	static {
		field765 = new class67("EN", "en", "English", class515.field4115, 0, "GB");
		field770 = new class67("DE", "de", "German", class515.field4115, 1, "DE");
		field759 = new class67("FR", "fr", "French", class515.field4115, 2, "FR");
		field768 = new class67("PT", "pt", "Portuguese", class515.field4115, 3, "BR");
		field758 = new class67("NL", "nl", "Dutch", class515.field4127, 4, "NL");
		field762 = new class67("ES", "es", "Spanish", class515.field4127, 5, "ES");
		field763 = new class67("ES_MX", "es-mx", "Spanish (Latin American)", class515.field4115, 6, "MX");
		class67[] var0 = method500();
		field767 = new class67[var0.length];
		class67[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class67 var3 = var1[var2];
			if (field767[var3.field766] != null) {
				throw new IllegalStateException();
			}

			field767[var3.field766] = var3;
		}

	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loe;ILjava/lang/String;)V")
	class67(String var1, String var2, String var3, class515 var4, int var5, String var6) {
		this.field764 = var1;
		this.field761 = var2;
		this.field766 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfInfo(name = "ao", desc = "(B)Ljava/lang/String;")
	String method502() {
		return this.field761;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field766;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.method502().toLowerCase(Locale.ENGLISH);
	}

	@ObfInfo(name = "au", desc = "(I)[Lon;")
	static class67[] method500() {
		return new class67[]{field762, field770, field759, field763, field758, field765, field768};
	}

	@ObfInfo(name = "at", desc = "(II)Lon;", opaqueValue = "-1520674516")
	public static class67 method499(int var0) {
		return var0 >= 0 && var0 < field767.length ? field767[var0] : null;
	}
}
