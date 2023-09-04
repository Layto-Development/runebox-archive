public class class160 implements Runnable {
   public static class429 field1018 = new class429();
   public static final class429 field1020 = new class429();
   static boolean field1022 = false;
   static int field1019 = 0;
   static Object field1021 = new Object();

   class160() {
   }

   public void run() {
      try {
         while(true) {
            class437 var1;
            synchronized(field1020) {
               var1 = (class437)field1020.method1991();
            }

            if (var1 != null) {
               if (0 == var1.field3472) {
                  var1.field3473.method1586((int)var1.field531, var1.field3471, var1.field3471.length);
                  synchronized(field1020) {
                     var1.method295();
                  }
               } else if (var1.field3472 == 1) {
                  var1.field3471 = var1.field3473.method1585((int)var1.field531);
                  synchronized(field1020) {
                     field1018.method1995(var1);
                  }
               }

               synchronized(field1021) {
                  if ((field1022 || field1019 <= 1) && field1020.method1994()) {
                     field1019 = 0;
                     field1021.notifyAll();
                     return;
                  }

                  field1019 = 600;
               }
            } else {
               class415.method1902(100L);
               synchronized(field1021) {
                  if ((field1022 || field1019 <= 1) && field1020.method1994()) {
                     field1019 = 0;
                     field1021.notifyAll();
                     return;
                  }

                  --field1019;
               }
            }
         }
      } catch (Exception var13) {
         class431.method2006((String)null, var13);
      }
   }

   static void method615(int var0, class340 var1, class534 var2) {
      class437 var4 = new class437();
      var4.field3472 = 1;
      var4.field531 = (long)var0;
      var4.field3473 = var1;
      var4.field3474 = var2;
      synchronized(field1020) {
         field1020.method1995(var4);
      }

      method613();
   }

   static void method613() {
      synchronized(field1021) {
         if (field1019 == 0) {
            class270.field1892 = new Thread(new class160());
            class270.field1892.setDaemon(true);
            class270.field1892.start();
            class270.field1892.setPriority(5);
         }

         field1019 = 600;
         field1022 = false;
      }
   }

   public static void method614() {
      synchronized(field1021) {
         if (field1019 != 0) {
            field1019 = 1;
            field1022 = true;

            try {
               field1021.wait();
            } catch (InterruptedException var4) {
            }
         }

      }
   }
}
