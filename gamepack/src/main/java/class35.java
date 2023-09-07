import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class class35 extends SSLSocketFactory {

	static class35 field184;

	SecureRandom field183;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}
	}

	class35() {
		this.field183 = new SecureRandom();
	}

	@Override
	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (null == var1) {
			var1 = new Socket();
		}
		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}
		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field183);
		return this.method158(var2, var5);
	}

	@Override
	public String[] getDefaultCipherSuites() {
		return null;
	}

	@Override
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@Override
	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	@Override
	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@Override
	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	@Override
	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	SSLSocket method158(String var1, TlsClientProtocol var2) {
		return new class538(this, var2, var1);
	}

	public static class35 method157() {
		if (field184 == null) {
			field184 = new class35();
		}
		return field184;
	}
}
