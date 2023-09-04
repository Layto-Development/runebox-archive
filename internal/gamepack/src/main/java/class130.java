import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class130 {
   static int field812;

   class130() throws Throwable {
   }

   static class272 method483(int var0) {
      class272 var2 = (class272)class464.field3676.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         class509 var4 = class107.field703;
         class509 var5 = class510.field4079;
         boolean var6 = true;
         byte[] var7 = var4.method2430(var0 >> 16 & '\uffff', var0 & '\uffff');
         class272 var3;
         if (var7 == null) {
            var6 = false;
            var3 = null;
         } else {
            int var8 = (var7[1] & 255) << 8 | var7[2] & 255;
            byte[] var9 = var5.method2430(var8, 0);
            if (var9 == null) {
               var6 = false;
            }

            if (!var6) {
               var3 = null;
            } else {
               if (class272.field1913 == null) {
                  class346.field2564 = Runtime.getRuntime().availableProcessors();
                  class272.field1913 = new ThreadPoolExecutor(0, class346.field2564, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + class346.field2564 * 100), new class371());
               }

               try {
                  var3 = new class272(var4, var5, var0, false);
               } catch (Exception var11) {
                  var3 = null;
               }
            }
         }

         if (var3 != null) {
            class464.field3676.method1182(var3, (long)var0);
         }

         return var3;
      }
   }
}
