import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class472 {
   RandomAccessFile field3631;
   long field3633;
   final long field3632;

   public class472(File var1, String var2, long var3) throws IOException {
      if (var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field3631 = new RandomAccessFile(var1, var2);
      this.field3632 = var3;
      this.field3633 = 0L;
      int var5 = this.field3631.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field3631.seek(0L);
         this.field3631.write(var5);
      }

      this.field3631.seek(0L);
   }

   final void method2280(long var1) throws IOException {
      this.field3631.seek(var1);
      this.field3633 = var1;
   }

   public final void method2281(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field3633 > this.field3632) {
         this.field3631.seek(this.field3632);
         this.field3631.write(1);
         throw new EOFException();
      } else {
         this.field3631.write(var1, var2, var3);
         this.field3633 += (long)var3;
      }
   }

   public final void method2284() throws IOException {
      this.method2285(false);
   }

   public final void method2285(boolean var1) throws IOException {
      if (null != this.field3631) {
         if (var1) {
            try {
               this.field3631.getFD().sync();
            } catch (SyncFailedException var4) {
            }
         }

         this.field3631.close();
         this.field3631 = null;
      }

   }

   public final long method2282() throws IOException {
      return this.field3631.length();
   }

   public final int method2283(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.field3631.read(var1, var2, var3);
      if (var5 > 0) {
         this.field3633 += (long)var5;
      }

      return var5;
   }

   protected void finalize() throws Throwable {
      if (this.field3631 != null) {
         System.out.println("");
         this.method2284();
      }

   }
}
