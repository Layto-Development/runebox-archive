import java.util.Locale;

@class526
@class71
public class class267 implements class228 {

	public static class338 field2189;

	public static final class267 field2188;

	public static final class267 field2191;

	public static final class267 field2194;

	static class79 field2198;

	static final class267 field2187;

	static final class267 field2192;

	static final class267 field2197;

	static final class267 field2199;

	static final class267[] field2196;

	final int field2195;

	final String field2190;

	final String field2193;

	static {
		field2194 = new class267("EN", "en", "English", class393.field3115, 0, "GB");
		field2199 = new class267("DE", "de", "German", class393.field3115, 1, "DE");
		field2188 = new class267("FR", "fr", "French", class393.field3115, 2, "FR");
		field2197 = new class267("PT", "pt", "Portuguese", class393.field3115, 3, "BR");
		field2187 = new class267("NL", "nl", "Dutch", class393.field3127, 4, "NL");
		field2191 = new class267("ES", "es", "Spanish", class393.field3127, 5, "ES");
		field2192 = new class267("ES_MX", "es-mx", "Spanish (Latin American)", class393.field3115, 6, "MX");
		class267[] var0 = method1469();
		field2196 = new class267[var0.length];
		class267[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; ++var2) {
			class267 var3 = var1[var2];
			if (field2196[var3.field2195] != null) {
				throw new IllegalStateException();
			}
			field2196[var3.field2195] = var3;
		}
	}

	class267(String var1, String var2, String var3, class393 var4, int var5, String var6) {
		this.field2193 = var1;
		this.field2190 = var2;
		this.field2195 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}
	}

	String method1470() {
		return this.field2190;
	}

	@Override
	public int method1362() {
		return this.field2195;
	}

	@Override
	public String toString() {
		return this.method1470().toLowerCase(Locale.ENGLISH);
	}

	static class267[] method1469() {
		return new class267[] { field2191, field2199, field2188, field2192, field2187, field2194, field2197 };
	}

	public static class267 method1468(int var0) {
		return var0 >= 0 && var0 < field2196.length ? field2196[var0] : null;
	}
}
