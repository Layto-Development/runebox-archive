public class class342 extends class306 {
   public static class509 field2551;
   static class245 field2548 = new class245(64);
   public char field2545;
   public char field2546;
   public int field2544;
   public int field2549;
   public int[] field2543;
   public int[] field2552;
   public String field2547;
   public String[] field2550;

   class342() {
      this.field2547 = class424.field3311;
      this.field2549 = 0;
   }

   void method1589(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method1590(var1, var3);
      }
   }

   void method1590(class366 var1, int var2) {
      if (var2 == 1) {
         this.field2545 = (char)var1.method1654();
      } else if (var2 == 2) {
         this.field2546 = (char)var1.method1654();
      } else if (var2 == 3) {
         this.field2547 = var1.method1662();
      } else if (var2 == 4) {
         this.field2544 = var1.method1658();
      } else {
         int var4;
         if (var2 == 5) {
            this.field2549 = var1.method1703();
            this.field2543 = new int[this.field2549];
            this.field2550 = new String[this.field2549];

            for(var4 = 0; var4 < this.field2549; ++var4) {
               this.field2543[var4] = var1.method1658();
               this.field2550[var4] = var1.method1662();
            }
         } else if (var2 == 6) {
            this.field2549 = var1.method1703();
            this.field2543 = new int[this.field2549];
            this.field2552 = new int[this.field2549];

            for(var4 = 0; var4 < this.field2549; ++var4) {
               this.field2543[var4] = var1.method1658();
               this.field2552[var4] = var1.method1658();
            }
         }
      }

   }

   public int method1588() {
      return this.field2549;
   }

   public static class342 method1591(int var0) {
      class342 var2 = (class342)field2548.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field2551.method2422(8, var0);
         var2 = new class342();
         if (null != var3) {
            var2.method1589(new class366(var3));
         }

         field2548.method1182(var2, (long)var0);
         return var2;
      }
   }
}
