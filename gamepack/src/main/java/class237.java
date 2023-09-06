import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class237 extends class296 {
	public static int field2181;
	static int field2183;
	final boolean field2182;

	public class237(boolean var1, int var2) {
		super(var2);
		this.field2182 = var1;
	}

	void method1681(class349 var1) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false;

		label124: {
			HttpURLConnection var13;
			label125: {
				try {
					var10 = true;
					String var4 = var1.field3000.getProtocol();
					if (var4.equals("http")) {
						var3 = this.method1358(var1);
					} else {
						if (!var4.equals("https")) {
							var1.field3003 = class349.field3002;
							var10 = false;
							break label124;
						}

						var3 = this.method1359(var1);
					}

					this.method1683(var3, var1);
					var10 = false;
					break label125;
				} catch (IOException var11) {
					var1.field3003 = class349.field3002;
					var10 = false;
				} finally {
					if (var10) {
						if (null != var3 && var3 instanceof HttpURLConnection) {
							HttpURLConnection var7 = (HttpURLConnection)var3;
							var7.disconnect();
						}

					}
				}

				if (null != var3 && var3 instanceof HttpURLConnection) {
					var13 = (HttpURLConnection)var3;
					var13.disconnect();
				}

				return;
			}

			if (null != var3 && var3 instanceof HttpURLConnection) {
				var13 = (HttpURLConnection)var3;
				var13.disconnect();
			}

			return;
		}

		if (null != var3 && var3 instanceof HttpURLConnection) {
			HttpURLConnection var5 = (HttpURLConnection)var3;
			var5.disconnect();
		}

	}

	URLConnection method1358(class349 var1) throws IOException {
		URLConnection var3 = var1.field3000.openConnection();
		this.method1687(var3);
		return var3;
	}

	URLConnection method1359(class349 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field3000.openConnection();
		if (!this.field2182) {
			var3.setSSLSocketFactory(class21.method183());
		}

		this.method1687(var3);
		return var3;
	}

	static class230[] method1362() {
		return new class230[]{class230.field2090, class230.field2089, class230.field2093};
	}

	static void method1361() {
		for (class534 var1 = (class534)Client.field24.method1493(); var1 != null; var1 = (class534)Client.field24.method1494()) {
			int var2 = var1.field4270;
			if (class292.method1669(var2)) {
				boolean var3 = true;
				class60[] var4 = class160.field1484[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (null != var4[var5]) {
						var3 = var4[var5].field724;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field3987;
					class60 var6 = class366.method1967(var5);
					if (var6 != null) {
						class185.method1024(var6);
					}
				}
			}
		}

	}

	static final void method1363() {
		Client.field209 = Client.field5;
	}
}
