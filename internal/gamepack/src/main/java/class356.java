public class class356 extends class306 {
   public static class245 field2585 = new class245(64);
   public static class509 field2584;
   int field2586 = 0;
   public int field2587;
   public int field2588;
   public int field2589;
   public int field2590;

   public void method1610() {
      this.method1613(this.field2586);
   }

   public void method1611(class366 var1, int var2) {
      while(true) {
         int var4 = var1.method1654();
         if (var4 == 0) {
            return;
         }

         this.method1612(var1, var4, var2);
      }
   }

   void method1612(class366 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field2586 = var1.method1710();
      }

   }

   void method1613(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0;
      double var5 = (double)(var1 >> 8 & 255) / 256.0;
      double var7 = (double)(var1 & 255) / 256.0;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0;
      double var15 = 0.0;
      double var17 = (var9 + var11) / 2.0;
      if (var11 != var9) {
         if (var17 < 0.5) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5) {
            var15 = (var11 - var9) / (2.0 - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var11 == var5) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0;
         } else if (var11 == var7) {
            var13 = 4.0 + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0;
      this.field2588 = (int)(var15 * 256.0);
      this.field2587 = (int)(var17 * 256.0);
      if (this.field2588 < 0) {
         this.field2588 = 0;
      } else if (this.field2588 > 255) {
         this.field2588 = 255;
      }

      if (this.field2587 < 0) {
         this.field2587 = 0;
      } else if (this.field2587 > 255) {
         this.field2587 = 255;
      }

      if (var17 > 0.5) {
         this.field2589 = (int)((1.0 - var17) * var15 * 512.0);
      } else {
         this.field2589 = (int)(var15 * var17 * 512.0);
      }

      if (this.field2589 < 1) {
         this.field2589 = 1;
      }

      this.field2590 = (int)(var13 * (double)this.field2589);
   }

   public static void method1614(class509 var0) {
      field2584 = var0;
   }
}
