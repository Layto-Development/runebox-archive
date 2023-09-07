import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.security.Security;

public class class408 extends SSLSocketFactory {
    static class408 field2872;

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }

    }

    SecureRandom field2871;

    class408() {
        this.field2871 = new SecureRandom();
    }

    public static class408 method1857() {
        if (field2872 == null) {
            field2872 = new class408();
        }

        return field2872;
    }

    @Override
    public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
        if (null == var1) {
            var1 = new Socket();
        }

        if (!var1.isConnected()) {
            var1.connect(new InetSocketAddress(var2, var3));
        }

        TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field2871);
        return this.method1858(var2, var5);
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
    public Socket createSocket(String var1, int var2) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress var1, int var2) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
        return null;
    }

    SSLSocket method1858(String var1, TlsClientProtocol var2) {
        return new class264(this, var2, var1);
    }
}
