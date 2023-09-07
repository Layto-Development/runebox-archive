import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;
import netscape.javascript.JSObject;

public class class41 {

	static int field203;

	static Applet field202;

	static String field201;

	static {
		field202 = null;
		field201 = "";
	}

	class41() throws Throwable {
	}

	public static void method176(Applet var0, String var1) {
		field202 = var0;
		if (null != var1) {
			field201 = var1;
		}
	}

	public static void method177(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}
			if (field201.startsWith("win")) {
				method178(var0, 0);
			} else if (field201.startsWith("mac")) {
				method179(var0, 1, "openjs");
			} else {
				method178(var0, 2);
			}
		} else {
			method178(var0, 3);
		}
	}

	static boolean method178(String var0, int var1) {
		return method179(var0, var1, "openjs");
	}

	static boolean method179(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!field201.startsWith("win")) {
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
				Object var11 = class318.method1698(field202, var2, new Object[] { (new URL(field202.getCodeBase(), var0)).toString() });
				return var11 != null;
			} catch (Throwable var7) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				field202.getAppletContext().showDocument(new URL(field202.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var4 = field202;
				JSObject.getWindow(var4).call("loggedout", (Object[]) null);
			} catch (Throwable var10) {
			}
			try {
				field202.getAppletContext().showDocument(new URL(field202.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var9) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
