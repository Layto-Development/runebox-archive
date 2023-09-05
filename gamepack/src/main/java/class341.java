import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

@ObfInfo(name = "bd")
public class class341 {
	@ObfInfo(name = "ug", desc = "I", intMultiplier = -2034353787)
	static int field2698;
	@ObfInfo(name = "au", desc = "Ljava/applet/Applet;")
	static Applet field2697;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	static String field2696;

	static {
		field2697 = null;
		field2696 = "";
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class341() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method1875(Applet var0, String var1) {
		field2697 = var0;
		if (null != var1) {
			field2696 = var1;
		}

	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/String;ZZB)V")
	public static void method1876(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (field2696.startsWith("win") && !var2) {
				method1877(var0, 0);
			} else if (field2696.startsWith("mac")) {
				method1878(var0, 1, "openjs");
			} else {
				method1877(var0, 2);
			}
		} else {
			method1877(var0, 3);
		}

	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;II)Z")
	static boolean method1877(String var0, int var1) {
		return method1878(var0, var1, "openjs");
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;ILjava/lang/String;I)Z")
	static boolean method1878(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!field2696.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var5 = 0; var5 < var0.length(); ++var5) {
						if (var12.indexOf(var0.charAt(var5)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var11 = class530.method2576(field2697, var2, new Object[]{(new URL(field2697.getCodeBase(), var0)).toString()});
				return var11 != null;
			} catch (Throwable var7) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				field2697.getAppletContext().showDocument(new URL(field2697.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var4 = field2697;
				JSObject.getWindow(var4).call("loggedout", (Object[])null);
			} catch (Throwable var10) {
			}

			try {
				field2697.getAppletContext().showDocument(new URL(field2697.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var9) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
