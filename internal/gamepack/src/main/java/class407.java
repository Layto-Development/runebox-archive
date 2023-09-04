public class class407 implements Runnable {
   public static class201 field3144 = new class201();
   public static final class201 field3146 = new class201();
   static boolean field3148 = false;
   static int field3145 = 0;
   static Object field3147 = new Object();

   class407() {
   }

   public void run() {
      try {
         while(true) {
            class301 var1;
            synchronized(field3146) {
               var1 = (class301)field3146.method1236();
            }

            if (var1 != null) {
               if (var1.field2512 == 0) {
                  var1.field2513.method1794((int)var1.field1078, var1.field2511, var1.field2511.length);
                  synchronized(field3146) {
                     var1.method605();
                  }
               } else if (var1.field2512 == 1) {
                  var1.field2511 = var1.field2513.method1793((int)var1.field1078);
                  synchronized(field3146) {
                     field3144.method1240(var1);
                  }
               }

               synchronized(field3147) {
                  if ((field3148 || field3145 <= 1) && field3146.method1239()) {
                     field3145 = 0;
                     field3147.notifyAll();
                     return;
                  }

                  field3145 = 600;
               }
            } else {
               class51.method602(100L);
               synchronized(field3147) {
                  if ((field3148 || field3145 <= 1) && field3146.method1239()) {
                     field3145 = 0;
                     field3147.notifyAll();
                     return;
                  }

                  --field3145;
               }
            }
         }
      } catch (Exception var13) {
         class194.method1208((String)null, var13);
      }
   }

   static void method1980(int var0, class347 var1, class22 var2) {
      class301 var4 = new class301();
      var4.field2512 = 1;
      var4.field1078 = (long)var0;
      var4.field2513 = var1;
      var4.field2514 = var2;
      synchronized(field3146) {
         field3146.method1240(var4);
      }

      method1978();
   }

   static void method1978() {
      synchronized(field3147) {
         if (field3145 == 0) {
            class336.field2692 = new Thread(new class407());
            class336.field2692.setDaemon(true);
            class336.field2692.start();
            class336.field2692.setPriority(5);
         }

         field3145 = 600;
         field3148 = false;
      }
   }

   public static void method1979() {
      synchronized(field3147) {
         if (field3145 != 0) {
            field3145 = 1;
            field3148 = true;

            try {
               field3147.wait();
            } catch (InterruptedException var4) {
            }
         }

      }
   }
}
