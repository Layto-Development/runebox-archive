import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.DataInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "ea")
public class class159 {
	@ObfInfo(name = "as", desc = "Ljava/lang/String;")
	public static String field1507;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 938382897)
	static int field1506;
	@ObfInfo(name = "ao", desc = "Lou;")
	static final class133 field1505;
	@ObfInfo(name = "ae", desc = "Lsf;")
	static final class525 field1504;
	@ObfInfo(name = "au", desc = "Ljava/util/Map;")
	static final Map field1503;

	static {
		field1503 = new HashMap();
		field1504 = new class525(1024);
		field1505 = new class133();
		field1506 = 0;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class159() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(ILjava/lang/String;Ljava/lang/String;I)V")
	static void method914(int var0, String var1, String var2) {
		method921(var0, var1, var2, (String)null);
	}

	@ObfInfo(name = "ae", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	static void method921(int var0, String var1, String var2, String var3) {
		class39 var5 = (class39)field1503.get(var0);
		if (var5 == null) {
			var5 = new class39();
			field1503.put(var0, var5);
		}

		class212 var6 = var5.method427(var0, var1, var2, var3);
		field1504.method2562(var6, (long)var6.field1894);
		field1505.method761(var6);
		Client.field232 = Client.field29;
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", opaqueValue = "-1588615176")
	public static void method913(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				var3 = class348.method1922(var1);
			}

			if (null != var0) {
				if (var1 != null) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (null == class348.field2755) {
				return;
			}

			URL var4 = new URL(class348.field2755.getCodeBase(), "clienterror.ws?cv=" + class348.field2761 + "&cs=" + class348.field2757 + "&u=" + class348.field2754 + "&v1=" + class502.field4055 + "&v2=" + class376.field2891 + "&ct=" + class348.field2758 + "&e=" + var3);
			DataInputStream var5 = new DataInputStream(var4.openStream());
			var5.read();
			var5.close();
		} catch (Exception var6) {
		}

	}

	@ObfInfo(name = "ao", desc = "(IIB)Lco;")
	static class212 method920(int var0, int var1) {
		class39 var3 = (class39)field1503.get(var0);
		return var3.method428(var1);
	}

	@ObfInfo(name = "at", desc = "(II)Lco;")
	static class212 method915(int var0) {
		return (class212)field1504.method2558((long)var0);
	}

	@ObfInfo(name = "ac", desc = "(IB)I")
	static int method918(int var0) {
		class39 var2 = (class39)field1503.get(var0);
		return null == var2 ? 0 : var2.method426();
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	static void method916() {
		field1503.clear();
		field1504.method2559();
		field1505.method767();
		field1506 = 0;
	}

	@ObfInfo(name = "az", desc = "(IB)I")
	static int method917(int var0) {
		class212 var2 = (class212)field1504.method2558((long)var0);
		if (null == var2) {
			return -1;
		} else {
			return var2.field1633 == field1505.field1369 ? -1 : ((class212)var2.field1633).field1894;
		}
	}

	@ObfInfo(name = "ap", desc = "(II)I")
	static int method919(int var0) {
		class212 var2 = (class212)field1504.method2558((long)var0);
		if (null == var2) {
			return -1;
		} else {
			return var2.field1632 == field1505.field1369 ? -1 : ((class212)var2.field1632).field1894;
		}
	}
}
