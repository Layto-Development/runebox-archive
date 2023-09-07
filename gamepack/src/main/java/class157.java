import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

class class157 implements TlsAuthentication {

	// $FF: synthetic field
	final class8 this$2;

	class157(class8 var1) {
		this.this$2 = var1;
	}

	@Override
	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();
			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}
			this.this$2.this$1.field4241 = (java.security.cert.Certificate[]) (java.security.cert.Certificate[]) var3.toArray(new java.security.cert.Certificate[0]);
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@Override
	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}
}
