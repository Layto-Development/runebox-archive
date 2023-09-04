import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class217 {
   static int field2020;

   class217() throws Throwable {
   }

   static class495 method1313(int var0) {
      class495 var2 = (class495)class157.field1665.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         class298 var4 = class12.field115;
         class298 var5 = class467.field3604;
         boolean var6 = true;
         byte[] var7 = var4.method1637(var0 >> 16 & '\uffff', var0 & '\uffff');
         class495 var3;
         if (var7 == null) {
            var6 = false;
            var3 = null;
         } else {
            int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
            byte[] var9 = var5.method1637(var8, 0);
            if (var9 == null) {
               var6 = false;
            }

            if (!var6) {
               var3 = null;
            } else {
               if (class495.field3921 == null) {
                  class264.field2291 = Runtime.getRuntime().availableProcessors();
                  class495.field3921 = new ThreadPoolExecutor(0, class264.field2291, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class264.field2291 * 100), new class306());
               }

               try {
                  var3 = new class495(var4, var5, var0, false);
               } catch (Exception var11) {
                  var3 = null;
               }
            }
         }

         if (var3 != null) {
            class157.field1665.method1850(var3, (long)var0);
         }

         return var3;
      }
   }
}
