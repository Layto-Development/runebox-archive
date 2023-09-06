import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class class442 {
	static final char[] field3871;
	static final char[] field3872;

	static {
		field3872 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
		field3871 = new char[]{'[', ']', '#'};
	}

	class442() throws Throwable {
	}

	static String method2218(Throwable var0) throws IOException {
		String var2;
		if (var0 instanceof class280) {
			class280 var3 = (class280)var0;
			var2 = var3.field2498 + " | ";
			var0 = var3.field2502;
		} else {
			var2 = "";
		}

		StringWriter var13 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var13);
		var0.printStackTrace(var4);
		var4.close();
		String var5 = var13.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();

		while (true) {
			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					var2 = var2 + "| " + var7;
					return var2;
				}

				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 + 1);
				if (var9 >= 0 && var10 >= 0) {
					String var11 = var8.substring(var9 + 1, var10);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var2 = var2 + var11 + ' ';
						continue;
					}

					var8 = var8.substring(0, var9);
				}

				var8 = var8.trim();
				var8 = var8.substring(var8.lastIndexOf(32) + 1);
				var8 = var8.substring(var8.lastIndexOf(9) + 1);
				var2 = var2 + var8 + ' ';
			}
		}
	}

	public static class25 method2217() {
		class25 var1 = new class25();
		var1.field449 = class49.field590;
		var1.field454 = class340.field2957;
		var1.field448 = class49.field588[0];
		var1.field453 = class517.field4221[0];
		var1.field450 = class177.field1707[0];
		var1.field451 = class420.field3504[0];
		var1.field455 = class101.field1016;
		var1.field452 = class29.field463[0];
		class49.field588 = null;
		class517.field4221 = null;
		class177.field1707 = null;
		class420.field3504 = null;
		class101.field1016 = null;
		class29.field463 = (byte[][])null;
		return var1;
	}
}
