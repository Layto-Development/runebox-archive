import java.io.IOException;
import java.net.Socket;

public class class125 extends class168 {
   static int[][][] field1521;
   class145 field1519;
   class257 field1518;
   Socket field1520;

   public class125(Socket var1, int var2, int var3) throws IOException {
      this.field1520 = var1;
      this.field1520.setSoTimeout(30000);
      this.field1520.setTcpNoDelay(true);
      this.field1520.setReceiveBufferSize(65536);
      this.field1520.setSendBufferSize(65536);
      this.field1519 = new class145(this.field1520.getInputStream(), var2);
      this.field1518 = new class257(this.field1520.getOutputStream(), var3);
   }

   public boolean method1012(int var1) throws IOException {
      return this.field1519.method920(var1);
   }

   public int method1014() throws IOException {
      return this.field1519.method924();
   }

   public int method1016() throws IOException {
      return this.field1519.method921();
   }

   public int method1013(byte[] var1, int var2, int var3) throws IOException {
      return this.field1519.method922(var1, var2, var3);
   }

   public void method1015(byte[] var1, int var2, int var3) throws IOException {
      this.field1518.method1475(var1, var2, var3);
   }

   public void method1017() {
      this.field1518.method1474();

      try {
         this.field1520.close();
      } catch (IOException var3) {
      }

      this.field1519.method923();
   }

   protected void finalize() {
      this.method1017();
   }
}
