import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class class248 {
   final int field2229;
   final String field2226;
   final ThreadFactory field2228;
   final ThreadPoolExecutor field2227;

   public class248(String var1, int var2, int var3) {
      this.field2226 = var1;
      this.field2229 = var2;
      this.field2228 = new class419(this);
      this.field2227 = this.method1451(var3);
   }

   final ThreadPoolExecutor method1451(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field2229), this.field2228);
   }

   public class310 method1452(class383 var1) {
      if (this.field2227.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field2227.getCorePoolSize() + " Queue capacity " + this.field2229);
         return new class310("Queue full");
      } else {
         class310 var3 = new class310(this.field2227.submit(new class528(this, var1)));
         return var3;
      }
   }

   public final void method1453() {
      try {
         this.field2227.shutdown();
      } catch (Exception var3) {
         System.err.println("Error shutting down RestRequestService\r\n" + var3);
      }

   }

   static void method1454(int var0, String var1) {
      int var3 = class190.field1866;
      int[] var4 = class190.field1867;
      boolean var5 = false;
      class251 var6 = new class251(var1, class121.field1501);

      for(int var7 = 0; var7 < var3; ++var7) {
         class522 var8 = Client.field749[var4[var7]];
         if (null != var8 && class259.field2281 != var8 && var8.field4112 != null && var8.field4112.equals(var6)) {
            class335 var9;
            if (var0 == 1) {
               var9 = class335.createPacket(ClientPacket.field941, Client.field641.field2758);
               var9.buffer.method1150(var4[var7]);
               var9.buffer.method1161(0);
               Client.field641.method1797(var9);
            } else if (var0 == 4) {
               var9 = class335.createPacket(ClientPacket.field997, Client.field641.field2758);
               var9.buffer.method1177(var4[var7]);
               var9.buffer.method1187(0);
               Client.field641.method1797(var9);
            } else if (var0 == 6) {
               var9 = class335.createPacket(ClientPacket.field979, Client.field641.field2758);
               var9.buffer.method1177(var4[var7]);
               var9.buffer.method1161(0);
               Client.field641.method1797(var9);
            } else if (var0 == 7) {
               var9 = class335.createPacket(ClientPacket.field1030, Client.field641.field2758);
               var9.buffer.method1183(var4[var7]);
               var9.buffer.method1114(0);
               Client.field641.method1797(var9);
            }

            var5 = true;
            break;
         }
      }

      if (!var5) {
         class194.method1209(4, "", class27.field378 + var1);
      }

   }

   static final String method1455(int var0, int var1) {
      int var3 = var1 - var0;
      if (var3 < -9) {
         return class357.method1829(16711680);
      } else if (var3 < -6) {
         return class357.method1829(16723968);
      } else if (var3 < -3) {
         return class357.method1829(16740352);
      } else if (var3 < 0) {
         return class357.method1829(16756736);
      } else if (var3 > 9) {
         return class357.method1829(65280);
      } else if (var3 > 6) {
         return class357.method1829(4259584);
      } else if (var3 > 3) {
         return class357.method1829(8453888);
      } else {
         return var3 > 0 ? class357.method1829(12648192) : class357.method1829(16776960);
      }
   }
}
