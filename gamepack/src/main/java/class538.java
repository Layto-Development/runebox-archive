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

public class class538 extends SSLSocketFactory {
   static class538 field4258;
   SecureRandom field4257 = new SecureRandom();

   static {
      if (Security.getProvider("BC") == null) {
         Security.addProvider(new BouncyCastleProvider());
      }

   }

   class538() {
   }

   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field4257);
      return this.method2562(var2, var5);
   }

   public String[] getDefaultCipherSuites() {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   SSLSocket method2562(String var1, TlsClientProtocol var2) {
      return new class317(this, var2, var1);
   }

   public static class538 method2561() {
      if (field4258 == null) {
         field4258 = new class538();
      }

      return field4258;
   }
}