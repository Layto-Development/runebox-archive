import java.util.Arrays;

public class class398 {
   class457 field2771 = new class457();
   long field2773;
   public long field2772 = -1L;

   public class398(class366 var1) {
      this.method1816(var1);
   }

   void method1816(class366 var1) {
      this.field2773 = var1.method1659();
      this.field2772 = var1.method1659();

      for(int var3 = var1.method1654(); var3 != 0; var3 = var1.method1654()) {
         Object var4;
         if (var3 == 1) {
            var4 = new class279(this);
         } else if (var3 == 4) {
            var4 = new class420(this);
         } else if (var3 == 3) {
            var4 = new class380(this);
         } else if (var3 == 2) {
            var4 = new class319(this);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new class539(this);
         }

         ((class124)var4).method472(var1);
         this.field2771.method2138((class70)var4);
      }

   }

   public void method1817(class417 var1) {
      if (var1.field531 == this.field2773 && var1.field2938 == this.field2772) {
         for(class124 var3 = (class124)this.field2771.method2144(); null != var3; var3 = (class124)this.field2771.method2140()) {
            var3.method473(var1);
         }

         ++var1.field2938;
      } else {
         throw new RuntimeException("");
      }
   }

   static void method1819(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var2 = (float)(1.0 + (double)(var0[0] * (var0[0] - 2.0F + var0[1])) + ((double)var0[1] - 2.0) * (double)var0[1]);
         if (var2 + class129.field807 > 0.0F) {
            if (class129.field807 + var0[0] < 1.3333334F) {
               float var3 = var0[0] - 2.0F;
               float var4 = var0[0] - 1.0F;
               float var5 = (float)Math.sqrt((double)(var3 * var3 - var4 * 4.0F * var4));
               float var6 = 0.5F * (var5 + -var3);
               if (var0[1] + class129.field807 > var6) {
                  var0[1] = var6 - class129.field807;
               } else {
                  var6 = (-var3 - var5) * 0.5F;
                  if (var0[1] < var6 + class129.field807) {
                     var0[1] = class129.field807 + var6;
                  }
               }
            } else {
               var0[0] = 1.3333334F - class129.field807;
               var0[1] = 0.33333334F - class129.field807;
            }
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   public static void method1818(class322 var0, class206 var1, boolean var2) {
      var0.field2200 = 7;
      var0.field2214 = new class206(var1);
      if (!var2) {
         var0.field2214.field1581 = Arrays.copyOf(var0.field2214.field1594, var0.field2214.field1594.length);
         var0.field2214.method1079();
      }

   }
}
