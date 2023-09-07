import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class86 extends class346 {

	public static int field856;

	static int field858;

	final boolean field857;

	public class86(boolean var1, int var2) {
		super(var2);
		this.field857 = var1;
	}

	@Override
	void method1804(class64 var1) throws IOException {
		URLConnection var3 = null;
		boolean var10 = false;
		label124: {
			HttpURLConnection var13;
			label125: {
				try {
					var10 = true;
					String var4 = var1.field681.getProtocol();
					if (var4.equals("http")) {
						var3 = this.method386(var1);
					} else {
						if (!var4.equals("https")) {
							var1.field684 = class64.field683;
							var10 = false;
							break label124;
						}
						var3 = this.method387(var1);
					}
					this.method1805(var3, var1);
					var10 = false;
					break label125;
				} catch (IOException var11) {
					var1.field684 = class64.field683;
					var10 = false;
				} finally {
					if (var10) {
						if (null != var3 && var3 instanceof HttpURLConnection) {
							HttpURLConnection var7 = (HttpURLConnection) var3;
							var7.disconnect();
						}
					}
				}
				if (null != var3 && var3 instanceof HttpURLConnection) {
					var13 = (HttpURLConnection) var3;
					var13.disconnect();
				}
				return;
			}
			if (null != var3 && var3 instanceof HttpURLConnection) {
				var13 = (HttpURLConnection) var3;
				var13.disconnect();
			}
			return;
		}
		if (null != var3 && var3 instanceof HttpURLConnection) {
			HttpURLConnection var5 = (HttpURLConnection) var3;
			var5.disconnect();
		}
	}

	URLConnection method386(class64 var1) throws IOException {
		URLConnection var3 = var1.field681.openConnection();
		this.method1809(var3);
		return var3;
	}

	URLConnection method387(class64 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection) var1.field681.openConnection();
		if (!this.field857) {
			var3.setSSLSocketFactory(class35.method157());
		}
		this.method1809(var3);
		return var3;
	}
}
