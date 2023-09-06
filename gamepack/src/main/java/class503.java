import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class class503 {
	static class342 field4165;
	boolean field4167;
	boolean field4169;
	class305 field4168;
	int field4171;
	final class148 field4172;
	final class321 field4166;
	final HttpsURLConnection field4170;

	public class503(URL var1, class148 var2, boolean var3) throws IOException {
		this(var1, var2, new class321(), var3);
	}

	public class503(URL var1, class148 var2, class321 var3, boolean var4) throws IOException {
		this.field4169 = false;
		this.field4167 = false;
		this.field4171 = 300000;
		if (!var2.method857()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method855());
		} else {
			this.field4170 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field4170.setSSLSocketFactory(class21.method183());
			}

			this.field4172 = var2;
			this.field4166 = null != var3 ? var3 : new class321();
		}
	}

	public class321 method2426() {
		return this.field4166;
	}

	public void method2422(class305 var1) {
		if (!this.field4169) {
			if (var1 == null) {
				this.field4166.method1825("Content-Type");
				this.field4168 = null;
			} else {
				this.field4168 = var1;
				if (this.field4168.method1732() != null) {
					this.field4166.method1820(this.field4168.method1732());
				} else {
					this.field4166.method1818();
				}

			}
		}
	}

	void method2423() throws ProtocolException {
		if (!this.field4169) {
			this.field4170.setRequestMethod(this.field4172.method855());
			this.field4166.method1814(this.field4170);
			if (this.field4172.method856() && this.field4168 != null) {
				this.field4170.setDoOutput(true);
				ByteArrayOutputStream var2 = new ByteArrayOutputStream();

				try {
					var2.write(this.field4168.method1731());
					var2.writeTo(this.field4170.getOutputStream());
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

			this.field4170.setConnectTimeout(this.field4171);
			this.field4170.setInstanceFollowRedirects(this.field4167);
			this.field4169 = true;
		}
	}

	boolean method2425() throws IOException {
		if (!this.field4169) {
			this.method2423();
		}

		this.field4170.connect();
		return this.field4170.getResponseCode() == -1;
	}

	class4 method2424() {
		try {
			if (!this.field4169 || this.field4170.getResponseCode() == -1) {
				return new class4("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field4170.disconnect();
			return new class4("Error decoding REST response code: " + var11.getMessage());
		}

		class4 var4;
		try {
			class4 var2 = new class4(this.field4170);
			return var2;
		} catch (IOException var9) {
			var4 = new class4("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field4170.disconnect();
		}

		return var4;
	}
}
