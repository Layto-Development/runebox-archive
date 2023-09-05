import io.runebox.internal.deobfuscator.includes.ObfInfo;
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

@ObfInfo(name = "ab")
public class class520 extends SSLSocketFactory {
	@ObfInfo(name = "ae", desc = "Lab;")
	static class520 field4158;
	@ObfInfo(name = "au", desc = "Ljava/security/SecureRandom;")
	SecureRandom field4157;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class520() {
		this.field4157 = new SecureRandom();
	}

	@ObfInfo(name = "createSocket", desc = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;")
	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (null == var1) {
			var1 = new Socket();
		}

		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field4157);
		return this.method2549(var2, var5);
	}

	@ObfInfo(name = "getDefaultCipherSuites", desc = "()[Ljava/lang/String;")
	public String[] getDefaultCipherSuites() {
		return null;
	}

	@ObfInfo(name = "getSupportedCipherSuites", desc = "()[Ljava/lang/String;")
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfInfo(name = "createSocket", desc = "(Ljava/lang/String;I)Ljava/net/Socket;")
	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	@ObfInfo(name = "createSocket", desc = "(Ljava/net/InetAddress;I)Ljava/net/Socket;")
	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfInfo(name = "createSocket", desc = "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;")
	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	@ObfInfo(name = "createSocket", desc = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;")
	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;")
	SSLSocket method2549(String var1, TlsClientProtocol var2) {
		return new class304(this, var2, var1);
	}

	@ObfInfo(name = "au", desc = "(I)Lab;")
	public static class520 method2548() {
		if (field4158 == null) {
			field4158 = new class520();
		}

		return field4158;
	}
}
