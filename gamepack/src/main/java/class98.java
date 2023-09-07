import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class class98 {

	static class13 field1257;

	boolean field1259;

	boolean field1261;

	class252 field1260;

	int field1263;

	final class324 field1258;

	final class488 field1264;

	final HttpsURLConnection field1262;

	public class98(URL var1, class488 var2, boolean var3) throws IOException {
		this(var1, var2, new class324(), var3);
	}

	public class98(URL var1, class488 var2, class324 var3, boolean var4) throws IOException {
		this.field1261 = false;
		this.field1259 = false;
		this.field1263 = 300000;
		if (!var2.method2350()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method2348());
		} else {
			this.field1262 = (HttpsURLConnection) var1.openConnection();
			if (!var4) {
				this.field1262.setSSLSocketFactory(class35.method157());
			}
			this.field1264 = var2;
			this.field1258 = null != var3 ? var3 : new class324();
		}
	}

	public class324 method623() {
		return this.field1258;
	}

	public void method619(class252 var1) {
		if (!this.field1261) {
			if (var1 == null) {
				this.field1258.method1723("Content-Type");
				this.field1260 = null;
			} else {
				this.field1260 = var1;
				if (this.field1260.method1444() != null) {
					this.field1258.method1718(this.field1260.method1444());
				} else {
					this.field1258.method1716();
				}
			}
		}
	}

	void method620() throws ProtocolException {
		if (!this.field1261) {
			this.field1262.setRequestMethod(this.field1264.method2348());
			this.field1258.method1712(this.field1262);
			if (this.field1264.method2349() && this.field1260 != null) {
				this.field1262.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();
				try {
					var2.write(this.field1260.method1443());
					var2.writeTo(this.field1262.getOutputStream());
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
			this.field1262.setConnectTimeout(this.field1263);
			this.field1262.setInstanceFollowRedirects(this.field1259);
			this.field1261 = true;
		}
	}

	boolean method622() throws IOException {
		if (!this.field1261) {
			this.method620();
		}
		this.field1262.connect();
		return this.field1262.getResponseCode() == -1;
	}

	class416 method621() {
		try {
			if (!this.field1261 || this.field1262.getResponseCode() == -1) {
				return new class416("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field1262.disconnect();
			return new class416("Error decoding REST response code: " + var11.getMessage());
		}
		class416 var4;
		try {
			class416 var2 = new class416(this.field1262);
			return var2;
		} catch (IOException var9) {
			var4 = new class416("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field1262.disconnect();
		}
		return var4;
	}
}
