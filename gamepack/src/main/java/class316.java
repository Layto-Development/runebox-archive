import java.applet.Applet;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;
import netscape.javascript.JSObject;

public class class316 {
	public static class208 field2827;
	static class25[] field2828;

	class316() throws Throwable {
	}

	static File method1751(String var0) {
		if (!class209.field1927) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)class209.field1929.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(class209.field1928, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						class209.field1929.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (var4 != null) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	static boolean method1753(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class504.field4173.startsWith("win")) {
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
				Object var11 = class159.method893(class504.field4174, var2, new Object[]{(new URL(class504.field4174.getCodeBase(), var0)).toString()});
				return var11 != null;
			} catch (Throwable var7) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class504.field4174.getAppletContext().showDocument(new URL(class504.field4174.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var4 = class504.field4174;
				JSObject.getWindow(var4).call("loggedout", (Object[])null);
			} catch (Throwable var10) {
			}

			try {
				class504.field4174.getAppletContext().showDocument(new URL(class504.field4174.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var9) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static class502 method1752(int var0, int var1) {
		Client.field303.field4162 = var0;
		Client.field303.field4161 = var1;
		Client.field303.field4163 = 1;
		Client.field303.field4164 = 1;
		return Client.field303;
	}
}
