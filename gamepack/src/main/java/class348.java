import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

@ObfInfo(name = "uy")
public class class348 extends RuntimeException {
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1869469455)
	public static int field2757;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -522148493)
	public static int field2758;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -671342643)
	public static int field2761;
	@ObfInfo(name = "au", desc = "Ljava/applet/Applet;")
	public static Applet field2755;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	public static String field2754;
	@ObfInfo(name = "jy", desc = "[[I")
	static int[][] field2759;
	@ObfInfo(name = "ai", desc = "Ljava/lang/String;")
	String field2756;
	@ObfInfo(name = "az", desc = "Ljava/lang/Throwable;")
	Throwable field2760;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	class348(Throwable var1, String var2) {
		this.field2756 = var2;
		this.field2760 = var1;
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	static String method1922(Throwable var0) throws IOException {
		String var2;
		if (var0 instanceof class348) {
			class348 var3 = (class348)var0;
			var2 = var3.field2756 + " | ";
			var0 = var3.field2760;
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
}
