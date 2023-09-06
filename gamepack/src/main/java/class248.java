import java.util.ArrayList;

public class class248 extends class538 {
	static int field2239;
	static String field2237;
	int field2238;
	// $FF: synthetic field
	final class464 this$0;

	class248(class464 var1) {
		this.this$0 = var1;
		this.field2238 = -1;
	}

	void method2583(class42 var1) {
		this.field2238 = var1.method327();
	}

	void method2582(class379 var1) {
		var1.method2024(this.field2238);
	}

	public static String method1444(String var0) {
		StringBuilder var2 = new StringBuilder(var0.length());
		int var3 = 0;
		int var4 = -1;

		for (int var5 = 0; var5 < var0.length(); ++var5) {
			char var6 = var0.charAt(var5);
			if (var6 == '<') {
				var2.append(var0.substring(var3, var5));
				var4 = var5;
			} else if (var6 == '>' && var4 != -1) {
				String var7 = var0.substring(var4 + 1, var5);
				var4 = -1;
				if (var7.equals("lt")) {
					var2.append("<");
				} else if (var7.equals("gt")) {
					var2.append(">");
				} else if (var7.equals("br")) {
					var2.append("\n");
				}

				var3 = var5 + 1;
			}
		}

		if (var3 < var0.length()) {
			var2.append(var0.substring(var3, var0.length()));
		}

		return var2.toString();
	}

	static boolean method1443(char var0) {
		return class116.field1109.indexOf(var0) != -1;
	}

	static void method1445(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var6 = (Integer)var0.get(0);
			if (var6 == -1 && !Client.field275) {
				class167.method924(0, 0);
			} else if (var6 != -1 && !class439.method2209(var6) && class176.field1701.method2488() != 0) {
				ArrayList var7 = new ArrayList();

				for (int var8 = 0; var8 < var0.size(); ++var8) {
					var7.add(new class104(class465.field3998, (Integer)var0.get(var8), 0, class176.field1701.method2488(), false));
				}

				if (Client.field275) {
					class92.field904.clear();
					class92.field904.addAll(var7);
					class295.method1677(var1, var2, var3, var4);
				} else {
					class81.method545(var7, var1, var2, var3, var4, false);
				}
			}

		}
	}
}
