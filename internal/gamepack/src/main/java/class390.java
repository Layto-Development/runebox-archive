import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class390 {
   RandomAccessFile field2753;
   long field2755;
   final long field2754;

   public class390(File var1, String var2, long var3) throws IOException {
      if (var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field2753 = new RandomAccessFile(var1, var2);
      this.field2754 = var3;
      this.field2755 = 0L;
      int var5 = this.field2753.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field2753.seek(0L);
         this.field2753.write(var5);
      }

      this.field2753.seek(0L);
   }

   final void method1779(long var1) throws IOException {
      this.field2753.seek(var1);
      this.field2755 = var1;
   }

   public final void method1780(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field2755 > this.field2754) {
         this.field2753.seek(this.field2754);
         this.field2753.write(1);
         throw new EOFException();
      } else {
         this.field2753.write(var1, var2, var3);
         this.field2755 += (long)var3;
      }
   }

   public final void method1783() throws IOException {
      this.method1784(false);
   }

   public final void method1784(boolean var1) throws IOException {
      if (null != this.field2753) {
         if (var1) {
            try {
               this.field2753.getFD().sync();
            } catch (SyncFailedException var4) {
            }
         }

         this.field2753.close();
         this.field2753 = null;
      }

   }

   public final long method1781() throws IOException {
      return this.field2753.length();
   }

   public final int method1782(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.field2753.read(var1, var2, var3);
      if (var5 > 0) {
         this.field2755 += (long)var5;
      }

      return var5;
   }

   protected void finalize() throws Throwable {
      if (this.field2753 != null) {
         System.out.println("");
         this.method1783();
      }

   }
}
