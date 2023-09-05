import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfInfo(name = "al")
class class304 extends SSLSocket {
	@ObfInfo(name = "ro", desc = "Lgk;")
	static class359 field2457;
	@ObfInfo(name = "ga", desc = "I", intMultiplier = 301817627)
	static int field2455;
	@ObfInfo(name = "no", desc = "I", intMultiplier = 457066205)
	static int field2456;
	@ObfInfo(name = "au", desc = "[Ljava/security/cert/Certificate;")
	Certificate[] field2458;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lab;")
	final class520 this$0;
	// $FF: synthetic field
	@ObfInfo(name = "val$host", desc = "Ljava/lang/String;")
	final String val$host;
	// $FF: synthetic field
	@ObfInfo(name = "val$tlsClientProtocol", desc = "Lorg/bouncycastle/crypto/tls/TlsClientProtocol;")
	final TlsClientProtocol val$tlsClientProtocol;

	@ObfInfo(name = "<init>", desc = "(Lab;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")
	class304(class520 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	@ObfInfo(name = "getInputStream", desc = "()Ljava/io/InputStream;")
	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfInfo(name = "getOutputStream", desc = "()Ljava/io/OutputStream;")
	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfInfo(name = "close", desc = "()V")
	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	@ObfInfo(name = "addHandshakeCompletedListener", desc = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfInfo(name = "getEnableSessionCreation", desc = "()Z")
	public boolean getEnableSessionCreation() {
		return false;
	}

	@ObfInfo(name = "getEnabledCipherSuites", desc = "()[Ljava/lang/String;")
	public String[] getEnabledCipherSuites() {
		return null;
	}

	@ObfInfo(name = "getEnabledProtocols", desc = "()[Ljava/lang/String;")
	public String[] getEnabledProtocols() {
		return null;
	}

	@ObfInfo(name = "getNeedClientAuth", desc = "()Z")
	public boolean getNeedClientAuth() {
		return false;
	}

	@ObfInfo(name = "getSession", desc = "()Ljavax/net/ssl/SSLSession;")
	public SSLSession getSession() {
		return new class450(this);
	}

	@ObfInfo(name = "getSupportedProtocols", desc = "()[Ljava/lang/String;")
	public String[] getSupportedProtocols() {
		return null;
	}

	@ObfInfo(name = "getSupportedCipherSuites", desc = "()[Ljava/lang/String;")
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfInfo(name = "getUseClientMode", desc = "()Z")
	public boolean getUseClientMode() {
		return false;
	}

	@ObfInfo(name = "getWantClientAuth", desc = "()Z")
	public boolean getWantClientAuth() {
		return false;
	}

	@ObfInfo(name = "removeHandshakeCompletedListener", desc = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfInfo(name = "setEnableSessionCreation", desc = "(Z)V")
	public void setEnableSessionCreation(boolean var1) {
	}

	@ObfInfo(name = "setEnabledCipherSuites", desc = "([Ljava/lang/String;)V")
	public void setEnabledCipherSuites(String[] var1) {
	}

	@ObfInfo(name = "setEnabledProtocols", desc = "([Ljava/lang/String;)V")
	public void setEnabledProtocols(String[] var1) {
	}

	@ObfInfo(name = "setNeedClientAuth", desc = "(Z)V")
	public void setNeedClientAuth(boolean var1) {
	}

	@ObfInfo(name = "setUseClientMode", desc = "(Z)V")
	public void setUseClientMode(boolean var1) {
	}

	@ObfInfo(name = "setWantClientAuth", desc = "(Z)V")
	public void setWantClientAuth(boolean var1) {
	}

	@ObfInfo(name = "startHandshake", desc = "()V")
	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class161(this));
	}
}
