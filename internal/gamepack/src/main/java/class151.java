import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class151 {
   final int field965;
   final String field962;
   final ThreadFactory field964;
   final ThreadPoolExecutor field963;

   public class151(String var1, int var2, int var3) {
      this.field962 = var1;
      this.field965 = var2;
      this.field964 = new class528(this);
      this.field963 = this.method571(var3);
   }

   final ThreadPoolExecutor method571(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field965), this.field964);
   }

   public class446 method572(class133 var1) {
      if (this.field963.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field963.getCorePoolSize() + " Queue capacity " + this.field965);
         return new class446("Queue full");
      } else {
         class446 var3 = new class446(this.field963.submit(new class461(this, var1)));
         return var3;
      }
   }

   public final void method573() {
      try {
         this.field963.shutdown();
      } catch (Exception var3) {
         System.err.println("Error shutting down RestRequestService\r\n" + var3);
      }

   }

   static void method574(int var0, String var1) {
      int var3 = class470.field3728;
      int[] var4 = class470.field3729;
      boolean var5 = false;
      class349 var6 = new class349(var1, class103.field694);

      for(int var7 = 0; var7 < var3; ++var7) {
         class443 var8 = Client.field1289[var4[var7]];
         if (null != var8 && class266.field1874 != var8 && var8.field3510 != null && var8.field3510.equals(var6)) {
            class53 var9;
            if (var0 == 1) {
               var9 = class53.method226(class10.field89, Client.field1181.field3781);
               var9.field435.method1679(var4[var7]);
               var9.field435.method1690(0);
               Client.field1181.method2254(var9);
            } else if (var0 == 4) {
               var9 = class53.method226(class10.field145, Client.field1181.field3781);
               var9.field435.method1706(var4[var7]);
               var9.field435.method1716(0);
               Client.field1181.method2254(var9);
            } else if (var0 == 6) {
               var9 = class53.method226(class10.field127, Client.field1181.field3781);
               var9.field435.method1706(var4[var7]);
               var9.field435.method1690(0);
               Client.field1181.method2254(var9);
            } else if (var0 == 7) {
               var9 = class53.method226(class10.field178, Client.field1181.field3781);
               var9.field435.method1712(var4[var7]);
               var9.field435.method1643(0);
               Client.field1181.method2254(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class431.method2007(4, "", class424.field3145 + var1);
      }

   }

   static final String method575(int var0, int var1) {
      int var3 = var1 - var0;
      if (var3 < -9) {
         return class389.method1778(16711680);
      } else if (var3 < -6) {
         return class389.method1778(16723968);
      } else if (var3 < -3) {
         return class389.method1778(16740352);
      } else if (var3 < 0) {
         return class389.method1778(16756736);
      } else if (var3 > 9) {
         return class389.method1778(65280);
      } else if (var3 > 6) {
         return class389.method1778(4259584);
      } else if (var3 > 3) {
         return class389.method1778(8453888);
      } else {
         return var3 > 0 ? class389.method1778(12648192) : class389.method1778(16776960);
      }
   }
}
