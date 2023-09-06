import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

class class533 implements TlsAuthentication {
	// $FF: synthetic field
	final class149 this$2;

	class533(class149 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field3276 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	public static String method2569(byte[] var0, int var1, int var2) {
		StringBuilder var4 = new StringBuilder();

		for (int var5 = var1; var5 < var1 + var2; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(class465.field3996[var6 >>> 2]);
			if (var5 < var2 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(class465.field3996[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var2 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(class465.field3996[(var7 & 15) << 2 | var8 >>> 6]).append(class465.field3996[var8 & 63]);
				} else {
					var4.append(class465.field3996[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class465.field3996[(var6 & 3) << 4]).append("==");
			}
		}

		return var4.toString();
	}

	static final void method2568() {
		if (!class277.field2455) {
			int var1 = class317.field2851;
			int var2 = class317.field2852;
			int var3 = class317.field2885;
			int var4 = class317.field2853;
			byte var5 = 50;
			short var6 = 3500;
			int var7 = (class277.field2453 - class133.method783()) * var5 / class133.method788();
			int var8 = (class277.field2456 - class133.method784()) * var5 / class133.method788();
			int var9 = (class277.field2453 - class133.method783()) * var6 / class133.method788();
			int var10 = (class277.field2456 - class133.method784()) * var6 / class133.method788();
			int var11 = class47.method352(var8, var5, var2, var1);
			int var12 = var5 * var2 - var1 * var8 >> 16;
			var8 = var11;
			var11 = class47.method352(var10, var6, var2, var1);
			int var13 = var6 * var2 - var1 * var10 >> 16;
			var10 = var11;
			var11 = class38.method250(var7, var12, var4, var3);
			int var14 = class395.method2070(var7, var12, var4, var3);
			var7 = var11;
			var11 = class38.method250(var9, var13, var4, var3);
			int var15 = class395.method2070(var9, var13, var4, var3);
			class277.field2452 = (var11 + var7) / 2;
			class277.field2461 = (var8 + var10) / 2;
			class277.field2458 = (var14 + var15) / 2;
			class72.field819 = (var11 - var7) / 2;
			class277.field2454 = (var10 - var8) / 2;
			class22.field440 = (var15 - var14) / 2;
			class277.field2459 = Math.abs(class72.field819);
			class56.field611 = Math.abs(class277.field2454);
			class289.field2578 = Math.abs(class22.field440);
		}
	}

	static final void method2567(class60 var0, int var1, int var2, int var3) {
		class420 var5 = var0.method444(false);
		if (var5 != null) {
			if (Client.field256 < 3) {
				Client.field83.method725(var1, var2, var5.field3506, var5.field3505, 25, 25, Client.field181, 256, var5.field3508, var5.field3507);
			} else {
				class266.method1556(var1, var2, 0, var5.field3508, var5.field3507);
			}

		}
	}
}
