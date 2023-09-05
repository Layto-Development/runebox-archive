import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "ad")
public class class540 {
	@ObfInfo(name = "gd", desc = "Lnk;")
	static class505 field4279;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field4281;
	@ObfInfo(name = "ac", desc = "Z")
	boolean field4283;
	@ObfInfo(name = "at", desc = "Lrf;")
	class167 field4282;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1934831509)
	int field4285;
	@ObfInfo(name = "ao", desc = "Laf;")
	final class312 field4286;
	@ObfInfo(name = "ae", desc = "Lqf;")
	final class59 field4280;
	@ObfInfo(name = "au", desc = "Ljavax/net/ssl/HttpsURLConnection;")
	final HttpsURLConnection field4284;

	@ObfInfo(name = "<init>", desc = "(Ljava/net/URL;Laf;Z)V")
	public class540(URL var1, class312 var2, boolean var3) throws IOException {
		this(var1, var2, new class59(), var3);
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/net/URL;Laf;Lqf;Z)V")
	public class540(URL var1, class312 var2, class59 var3, boolean var4) throws IOException {
		this.field4283 = false;
		this.field4281 = false;
		this.field4285 = 300000;
		if (!var2.method1728()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method1726());
		} else {
			this.field4284 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field4284.setSSLSocketFactory(class520.method2548());
			}

			this.field4286 = var2;
			this.field4280 = null != var3 ? var3 : new class59();
		}
	}

	@ObfInfo(name = "au", desc = "(B)Lqf;")
	public class59 method2596() {
		return this.field4280;
	}

	@ObfInfo(name = "ae", desc = "(Lrf;B)V", opaqueValue = "2")
	public void method2592(class167 var1) {
		if (!this.field4283) {
			if (var1 == null) {
				this.field4280.method482("Content-Type");
				this.field4282 = null;
			} else {
				this.field4282 = var1;
				if (this.field4282.method949() != null) {
					this.field4280.method477(this.field4282.method949());
				} else {
					this.field4280.method475();
				}

			}
		}
	}

	@ObfInfo(name = "ao", desc = "(I)V", opaqueValue = "414752321")
	void method2593() throws ProtocolException {
		if (!this.field4283) {
			this.field4284.setRequestMethod(this.field4286.method1726());
			this.field4280.method471(this.field4284);
			if (this.field4286.method1727() && this.field4282 != null) {
				this.field4284.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(this.field4282.method948());
					var2.writeTo(this.field4284.getOutputStream());
				} catch (IOException var12) {
					var12.printStackTrace();
				} finally {
					try {
						var2.close();
					} catch (IOException var11) {
						var11.printStackTrace();
					}

				}
			}

			this.field4284.setConnectTimeout(this.field4285);
			this.field4284.setInstanceFollowRedirects(this.field4281);
			this.field4283 = true;
		}
	}

	@ObfInfo(name = "at", desc = "(I)Z", opaqueValue = "920659858")
	boolean method2595() throws IOException {
		if (!this.field4283) {
			this.method2593();
		}

		this.field4284.connect();
		return this.field4284.getResponseCode() == -1;
	}

	@ObfInfo(name = "ac", desc = "(I)Las;", opaqueValue = "1655457013")
	class403 method2594() {
		try {
			if (!this.field4283 || this.field4284.getResponseCode() == -1) {
				return new class403("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field4284.disconnect();
			return new class403("Error decoding REST response code: " + var11.getMessage());
		}

		class403 var4;
		try {
			class403 var2 = new class403(this.field4284);
			return var2;
		} catch (IOException var9) {
			var4 = new class403("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field4284.disconnect();
		}

		return var4;
	}
}
