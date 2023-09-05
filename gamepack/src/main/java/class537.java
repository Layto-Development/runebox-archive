import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "ez")
public class class537 extends class265 {
	@ObfInfo(name = "as", desc = "I", intMultiplier = -674991707)
	public static int field4270;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 2047133239)
	static int field4272;
	@ObfInfo(name = "ac", desc = "Z")
	final boolean field4271;

	@ObfInfo(name = "<init>", desc = "(ZI)V")
	public class537(boolean var1, int var2) {
		super(var2);
		this.field4271 = var1;
	}

	@ObfInfo(name = "au", desc = "(Let;B)V", opaqueValue = "3")
	void method1382(class22 var1) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false;

		label124: {
			HttpURLConnection var13;
			label125: {
				try {
					var10 = true;
					String var4 = var1.field399.getProtocol();
					if (var4.equals("http")) {
						var3 = this.method2586(var1);
					} else {
						if (!var4.equals("https")) {
							var1.field402 = class22.field401;
							var10 = false;
							break label124;
						}

						var3 = this.method2587(var1);
					}

					this.method1383(var3, var1);
					var10 = false;
					break label125;
				} catch (IOException var11) {
					var1.field402 = class22.field401;
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

	@ObfInfo(name = "ah", desc = "(Let;B)Ljava/net/URLConnection;")
	URLConnection method2586(class22 var1) throws IOException {
		URLConnection var3 = var1.field399.openConnection();
		this.method1387(var3);
		return var3;
	}

	@ObfInfo(name = "as", desc = "(Let;B)Ljava/net/URLConnection;", opaqueValue = "6")
	URLConnection method2587(class22 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field399.openConnection();
		if (!this.field4271) {
			var3.setSSLSocketFactory(class520.method2548());
		}

		this.method1387(var3);
		return var3;
	}
}
