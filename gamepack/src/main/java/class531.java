import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class class531 {

	static int field4195;

	static final BigInteger field4196;

	static final BigInteger field4197;

	static {
		field4196 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field4197 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	class531() throws Throwable {
	}

	static final int method2577(long var0, String var2) {
		Random var4 = new Random();
		class187 var5 = new class187(128);
		class187 var6 = new class187(128);
		int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
		var5.method1085(10);
		int var8;
		for (var8 = 0; var8 < 4; ++var8) {
			var5.method1151(var4.nextInt());
		}
		var5.method1151(var7[0]);
		var5.method1151(var7[1]);
		var5.method1122(var0);
		var5.method1122(0L);
		for (var8 = 0; var8 < 4; ++var8) {
			var5.method1151(var4.nextInt());
		}
		var5.method1129(field4196, field4197);
		var6.method1085(10);
		for (var8 = 0; var8 < 3; ++var8) {
			var6.method1151(var4.nextInt());
		}
		var6.method1122(var4.nextLong());
		var6.method1086(var4.nextLong());
		Client.method520(var6);
		var6.method1122(var4.nextLong());
		var6.method1129(field4196, field4197);
		var8 = class187.method1159(var2);
		if (var8 % 8 != 0) {
			var8 += 8 - var8 % 8;
		}
		class187 var9 = new class187(var8);
		var9.method1088(var2);
		var9.field1832 = var8;
		var9.method1113(var7);
		class187 var10 = new class187(var9.field1832 + var6.field1832 + var5.field1832 + 5);
		var10.method1085(2);
		var10.method1085(var5.field1832);
		var10.method1090(var5.field1830, 0, var5.field1832);
		var10.method1085(var6.field1832);
		var10.method1090(var6.field1830, 0, var6.field1832);
		var10.method1126(var9.field1832);
		var10.method1090(var9.field1830, 0, var9.field1832);
		byte[] var12 = var10.field1830;
		String var11 = class477.method2317(var12, 0, var12.length);
		String var13 = var11;
		try {
			URL var14 = new URL(Client.method526("services", false) + "m=accountappeal/login.ws");
			URLConnection var15 = var14.openConnection();
			var15.setDoInput(true);
			var15.setDoOutput(true);
			var15.setConnectTimeout(5000);
			OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
			String var18 = "data2=" + class317.method1697(var13) + "&dest=";
			int var20 = "passwordchoice.ws".length();
			StringBuilder var21 = new StringBuilder(var20);
			for (int var22 = 0; var22 < var20; ++var22) {
				char var23 = "passwordchoice.ws".charAt(var22);
				if ((var23 < 'a' || var23 > 'z') && (var23 < 'A' || var23 > 'Z') && (var23 < '0' || var23 > '9') && var23 != '.' && var23 != '-' && var23 != '*' && var23 != '_') {
					if (var23 == ' ') {
						var21.append('+');
					} else {
						byte var24 = class111.method674(var23);
						var21.append('%');
						int var25 = var24 >> 4 & 15;
						if (var25 >= 10) {
							var21.append((char) (var25 + 55));
						} else {
							var21.append((char) (var25 + 48));
						}
						var25 = var24 & 15;
						if (var25 >= 10) {
							var21.append((char) (var25 + 55));
						} else {
							var21.append((char) (var25 + 48));
						}
					}
				} else {
					var21.append(var23);
				}
			}
			String var19 = var21.toString();
			var16.write(var18 + var19);
			var16.flush();
			InputStream var27 = var15.getInputStream();
			var10 = new class187(new byte[1000]);
			do {
				int var28 = var27.read(var10.field1830, var10.field1832, 1000 - var10.field1832);
				if (var28 == -1) {
					var16.close();
					var27.close();
					String var29 = new String(var10.field1830);
					if (var29.startsWith("OFFLINE")) {
						return 4;
					} else if (var29.startsWith("WRONG")) {
						return 7;
					} else if (var29.startsWith("RELOAD")) {
						return 3;
					} else if (var29.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var10.method1157(var7);
						while (var10.field1832 > 0 && var10.field1830[var10.field1832 - 1] == 0) {
							--var10.field1832;
						}
						var29 = new String(var10.field1830, 0, var10.field1832);
						if (method2576(var29)) {
							class41.method177(var29, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}
				var10.field1832 += var28;
			} while (var10.field1832 < 1000);
			return 5;
		} catch (Throwable var26) {
			var26.printStackTrace();
			return 5;
		}
	}

	static boolean method2576(String var0) {
		if (null == var0) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var3) {
				return false;
			}
		}
	}
}
