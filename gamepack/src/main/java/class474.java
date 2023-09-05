import java.util.Arrays;

public class class474 {
   class45 field3634 = new class45();
   long field3636;
   public long field3635 = -1L;

   public class474(class184 var1) {
      this.method2287(var1);
   }

   void method2287(class184 var1) {
      this.field3636 = var1.method1130();
      this.field3635 = var1.method1130();

      for(int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
         Object var4;
         if (var3 == 1) {
            var4 = new class212(this);
         } else if (var3 == 4) {
            var4 = new class193(this);
         } else if (var3 == 3) {
            var4 = new class37(this);
         } else if (var3 == 2) {
            var4 = new class422(this);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new class235(this);
         }

         ((class531)var4).method2516(var1);
         this.field3634.method577((class55)var4);
      }

   }

   public void method2288(class290 var1) {
      if (var1.field1078 == this.field3636 && var1.field2462 == this.field3635) {
         for(class531 var3 = (class531)this.field3634.method583(); null != var3; var3 = (class531)this.field3634.method579()) {
            var3.method2517(var1);
         }

         ++var1.field2462;
      } else {
         throw new RuntimeException("");
      }
   }

   static void method2290(float[] var0) {
      var0[1] = 1.0F - var0[1];
      if (var0[0] < 0.0F) {
         var0[0] = 0.0F;
      }

      if (var0[1] < 0.0F) {
         var0[1] = 0.0F;
      }

      if (var0[0] > 1.0F || var0[1] > 1.0F) {
         float var2 = (float)(1.0 + (double)(var0[0] * (var0[0] - 2.0F + var0[1])) + ((double)var0[1] - 2.0) * (double)var0[1]);
         if (var2 + class146.field1608 > 0.0F) {
            if (class146.field1608 + var0[0] < 1.3333334F) {
               float var3 = var0[0] - 2.0F;
               float var4 = var0[0] - 1.0F;
               float var5 = (float)Math.sqrt((double)(var3 * var3 - var4 * 4.0F * var4));
               float var6 = 0.5F * (var5 + -var3);
               if (var0[1] + class146.field1608 > var6) {
                  var0[1] = var6 - class146.field1608;
               } else {
                  var6 = (-var3 - var5) * 0.5F;
                  if (var0[1] < var6 + class146.field1608) {
                     var0[1] = class146.field1608 + var6;
                  }
               }
            } else {
               var0[0] = 1.3333334F - class146.field1608;
               var0[1] = 0.33333334F - class146.field1608;
            }
         }
      }

      var0[1] = 1.0F - var0[1];
   }

   public static void method2289(class480 var0, class229 var1, boolean var2) {
      var0.field3716 = 7;
      var0.field3730 = new class229(var1);
      if (!var2) {
         var0.field3730.field2114 = Arrays.copyOf(var0.field3730.field2127, var0.field3730.field2127.length);
         var0.field3730.method1393();
      }

   }
}
