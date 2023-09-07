import netscape.javascript.JSObject;

import java.applet.Applet;
import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

public class class33 {
    static int field486;
    static Applet field485;
    static String field484;

    static {
        field485 = null;
        field484 = "";
    }

    class33() throws Throwable {
    }

    public static void method95(Applet var0, String var1) {
        field485 = var0;
        if (null != var1) {
            field484 = var1;
        }

    }

    public static void method96(String var0, boolean var1, boolean var2) {
        if (var1) {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(var0));
                    return;
                } catch (Exception var5) {
                }
            }

            if (field484.startsWith("win")) {
                method97(var0, 0);
            } else if (field484.startsWith("mac")) {
                method98(var0, 1, "openjs");
            } else {
                method97(var0, 2);
            }
        } else {
            method97(var0, 3);
        }

    }

    static boolean method97(String var0, int var1) {
        return method98(var0, var1, "openjs");
    }

    static boolean method98(String var0, int var1, String var2) {
        if (var1 == 0) {
            try {
                if (!field484.startsWith("win")) {
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
                Object var11 = class271.method1215(field485, var2, new Object[]{(new URL(field485.getCodeBase(), var0)).toString()});
                return var11 != null;
            } catch (Throwable var7) {
                return false;
            }
        } else if (var1 == 2) {
            try {
                field485.getAppletContext().showDocument(new URL(field485.getCodeBase(), var0), "_blank");
                return true;
            } catch (Exception var8) {
                return false;
            }
        } else if (var1 == 3) {
            try {
                Applet var4 = field485;
                JSObject.getWindow(var4).call("loggedout", (Object[]) null);
            } catch (Throwable var10) {
            }

            try {
                field485.getAppletContext().showDocument(new URL(field485.getCodeBase(), var0), "_top");
                return true;
            } catch (Exception var9) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
