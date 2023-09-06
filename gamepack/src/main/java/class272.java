public class class272 {
	public static final class272 field2445;
	static final class272 field2446;
	String field2447;

	static {
		field2445 = new class272("application/json");
		field2446 = new class272("text/plain");
	}

	class272(String var1) {
		this.field2447 = var1;
	}

	public String method1588() {
		return this.field2447;
	}

	static final boolean method1587(int var0, int var1, int var2, int var3, int var4) {
		class353 var6 = null;

		for (class353 var7 = (class353)Client.field144.method563(); var7 != null; var7 = (class353)Client.field144.method565()) {
			if (var0 == var7.field3028 && var1 == var7.field3021 && var2 == var7.field3027 && var3 == var7.field3014) {
				var6 = var7;
				break;
			}
		}

		if (null != var6) {
			var6.field3023 = var4;
			return true;
		} else {
			return false;
		}
	}
}
