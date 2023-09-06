import java.text.ParseException;
import java.util.Date;

public class class73 extends class268 {
	static class25 field821;
	final boolean field820;

	public class73(boolean var1) {
		this.field820 = var1;
	}

	int method515(class304 var1, class304 var2) {
		if (var1.field2769 != 0 && var2.field2769 != 0) {
			return this.field820 ? var1.method508().method2213(var2.method508()) : var2.method508().method2213(var1.method508());
		} else {
			return this.method1568(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method515((class304)var1, (class304)var2);
	}

	static class115 method517() {
		class115 var1 = new class115();
		var1.field1081 = class49.field590;
		var1.field1082 = class340.field2957;
		var1.field1078 = class49.field588[0];
		var1.field1079 = class517.field4221[0];
		var1.field1084 = class177.field1707[0];
		var1.field1080 = class420.field3504[0];
		int var2 = var1.field1080 * var1.field1084;
		byte[] var3 = class29.field463[0];
		var1.field1083 = new int[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var1.field1083[var4] = class101.field1016[var3[var4] & 255];
		}

		class49.field588 = null;
		class517.field4221 = null;
		class177.field1707 = null;
		class420.field3504 = null;
		class101.field1016 = null;
		class29.field463 = (byte[][])null;
		return var1;
	}

	static boolean method518() {
		Date var1;
		try {
			var1 = class409.method2109();
		} catch (ParseException var5) {
			class284.method1624("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var1 == null) {
			return false;
		} else {
			boolean var2 = class417.method2146(var1);
			Date var4 = class64.method485();
			boolean var3 = var1.after(var4);
			if (!var3) {
				class337.method1864(7);
				class174.method993("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var2) {
					class423.field3513 = 8388607;
				} else {
					class423.field3513 = (int)(var1.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	static boolean method516() {
		return (Client.field6 & 4) != 0;
	}
}
