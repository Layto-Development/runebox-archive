public class class316 extends class151 {
   public static class298 field2568;
   public static class364 field2569 = new class364(64);
   public static class364 field2570 = new class364(64);
   int field2577 = -1;
   int field2578 = -1;
   public int field2571;
   public int field2572 = 70;
   public int field2573 = 255;
   public int field2574 = 255;
   public int field2575 = 1;
   public int field2576 = -1;
   public int field2579 = 30;
   public int field2580 = 0;

   public void method1691(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         this.method1688(var1, var3);
      }
   }

   void method1688(class184 var1, int var2) {
      if (var2 == 1) {
         var1.method1174();
      } else if (var2 == 2) {
         this.field2574 = var1.method1125();
      } else if (var2 == 3) {
         this.field2573 = var1.method1125();
      } else if (var2 == 4) {
         this.field2576 = 0;
      } else if (var2 == 5) {
         this.field2572 = var1.method1174();
      } else if (var2 == 6) {
         var1.method1125();
      } else if (var2 == 7) {
         this.field2577 = var1.method1173();
      } else if (var2 == 8) {
         this.field2578 = var1.method1173();
      } else if (var2 == 11) {
         this.field2576 = var1.method1174();
      } else if (var2 == 14) {
         this.field2579 = var1.method1125();
      } else if (var2 == 15) {
         this.field2580 = var1.method1125();
      }

   }

   public class427 method1689() {
      if (this.field2577 < 0) {
         return null;
      } else {
         class427 var2 = (class427)field2570.method1851((long)this.field2577);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class526.method2492(class490.field3860, this.field2577, 0);
            if (null != var2) {
               field2570.method1850(var2, (long)this.field2577);
            }

            return var2;
         }
      }
   }

   public class427 method1690() {
      if (this.field2578 < 0) {
         return null;
      } else {
         class427 var2 = (class427)field2570.method1851((long)this.field2578);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class526.method2492(class490.field3860, this.field2578, 0);
            if (null != var2) {
               field2570.method1850(var2, (long)this.field2578);
            }

            return var2;
         }
      }
   }

   public static void method1692(class298 var0, class298 var1) {
      field2568 = var0;
      class490.field3860 = var1;
   }
}
