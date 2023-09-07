import org.bouncycastle.crypto.tls.TlsClientProtocol;

import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;

class class264 extends SSLSocket {
    static class420 field1953;
    static int field1951;
    static int field1952;
    // $FF: synthetic field
    final class408 this$0;
    // $FF: synthetic field
    final String val$host;
    // $FF: synthetic field
    final TlsClientProtocol val$tlsClientProtocol;
    Certificate[] field1954;

    class264(class408 var1, TlsClientProtocol var2, String var3) {
        this.this$0 = var1;
        this.val$tlsClientProtocol = var2;
        this.val$host = var3;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.val$tlsClientProtocol.getOutputStream();
    }

    @Override
    public synchronized void close() throws IOException {
        this.val$tlsClientProtocol.close();
    }

    @Override
    public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
    }

    @Override
    public boolean getEnableSessionCreation() {
        return false;
    }

    @Override
    public void setEnableSessionCreation(boolean var1) {
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return null;
    }

    @Override
    public void setEnabledCipherSuites(String[] var1) {
    }

    @Override
    public String[] getEnabledProtocols() {
        return null;
    }

    @Override
    public void setEnabledProtocols(String[] var1) {
    }

    @Override
    public boolean getNeedClientAuth() {
        return false;
    }

    @Override
    public void setNeedClientAuth(boolean var1) {
    }

    @Override
    public SSLSession getSession() {
        return new class388(this);
    }

    @Override
    public String[] getSupportedProtocols() {
        return null;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return null;
    }

    @Override
    public boolean getUseClientMode() {
        return false;
    }

    @Override
    public void setUseClientMode(boolean var1) {
    }

    @Override
    public boolean getWantClientAuth() {
        return false;
    }

    @Override
    public void setWantClientAuth(boolean var1) {
    }

    @Override
    public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
    }

    @Override
    public void startHandshake() throws IOException {
        this.val$tlsClientProtocol.connect(new class179(this));
    }
}
