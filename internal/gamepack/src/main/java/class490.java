import java.io.IOException;
import java.net.Socket;

public class class490 extends class331 {
   static int[][][] field3930;
   class358 field3927;
   class373 field3928;
   Socket field3929;

   public class490(Socket var1, int var2, int var3) throws IOException {
      this.field3929 = var1;
      this.field3929.setSoTimeout(30000);
      this.field3929.setTcpNoDelay(true);
      this.field3929.setReceiveBufferSize(65536);
      this.field3929.setSendBufferSize(65536);
      this.field3928 = new class373(this.field3929.getInputStream(), var2);
      this.field3927 = new class358(this.field3929.getOutputStream(), var3);
   }

   public boolean method1556(int var1) throws IOException {
      return this.field3928.method1736(var1);
   }

   public int method1558() throws IOException {
      return this.field3928.method1740();
   }

   public int method1560() throws IOException {
      return this.field3928.method1737();
   }

   public int method1557(byte[] var1, int var2, int var3) throws IOException {
      return this.field3928.method1738(var1, var2, var3);
   }

   public void method1559(byte[] var1, int var2, int var3) throws IOException {
      this.field3927.method1616(var1, var2, var3);
   }

   public void method1561() {
      this.field3927.method1615();

      try {
         this.field3929.close();
      } catch (IOException var3) {
      }

      this.field3928.method1739();
   }

   protected void finalize() {
      this.method1561();
   }
}
