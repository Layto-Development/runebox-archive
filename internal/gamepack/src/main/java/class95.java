import java.util.HashMap;

public class class95 {
   static String field666;
   class205 field663 = new class205(0, 0);
   int field665 = 0;
   int[] field661 = new int[2048];
   int[] field662 = new int[2048];
   final HashMap field664 = new HashMap();

   public class95() {
      method371();
   }

   void method369(int var1) {
      int var3 = var1 * 2 + 1;
      double[] var4 = class454.method2114(0.0, (double)((float)var1 / 3.0F), var1);
      double var5 = var4[var1] * var4[var1];
      int[] var7 = new int[var3 * var3];
      boolean var8 = false;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = 0; var10 < var3; ++var10) {
            int var11 = var7[var10 + var9 * var3] = (int)(256.0 * (var4[var9] * var4[var10] / var5));
            if (!var8 && var11 > 0) {
               var8 = true;
            }
         }
      }

      class296 var12 = new class296(var7, var3, var3);
      this.field664.put(var1, var12);
   }

   class296 method365(int var1) {
      if (!this.field664.containsKey(var1)) {
         this.method369(var1);
      }

      return (class296)this.field664.get(var1);
   }

   public final void method366(int var1, int var2) {
      if (this.field665 < this.field661.length) {
         this.field661[this.field665] = var1;
         this.field662[this.field665] = var2;
         ++this.field665;
      }
   }

   public final void method367() {
      this.field665 = 0;
   }

   public final void method368(int var1, int var2, class296 var3, float var4) {
      int var6 = (int)(var4 * 18.0F);
      class296 var7 = this.method365(var6);
      int var8 = var6 * 2 + 1;
      class205 var9 = new class205(0, 0, var3.field2032, var3.field2028);
      class205 var10 = new class205(0, 0);
      this.field663.method1063(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field665; ++var11) {
         var12 = this.field661[var11];
         var13 = this.field662[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field2028 - (float)(var13 - var2) * var4) - var6;
         this.field663.method1062(var14, var15);
         this.field663.method1065(var9, var10);
         this.method370(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field2031.length; ++var11) {
         if (var3.field2031[var11] == 0) {
            var3.field2031[var11] = -16777216;
         } else {
            var12 = (var3.field2031[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field2031[var11] = -16777216;
            } else {
               if (var12 > class47.field412.length) {
                  var12 = class47.field412.length;
               }

               var13 = class47.field412[var12 - 1];
               var3.field2031[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void method370(class296 var1, class296 var2, class205 var3) {
      if (0 != var3.field1577 && var3.field1575 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (var3.field1578 == 0) {
            var5 = var1.field2032 - var3.field1577;
         }

         if (var3.field1576 == 0) {
            var6 = var1.field2028 - var3.field1575;
         }

         int var7 = var6 * var1.field2032 + var5;
         int var8 = var2.field2032 * var3.field1576 + var3.field1578;

         for(int var9 = 0; var9 < var3.field1575; ++var9) {
            for(int var10 = 0; var10 < var3.field1577; ++var10) {
               int[] var10000 = var2.field2031;
               int var10001 = var8++;
               var10000[var10001] += var1.field2031[var7++];
            }

            var7 += var1.field2032 - var3.field1577;
            var8 += var2.field2032 - var3.field1577;
         }

      }
   }

   static void method371() {
      class47.field412 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class309.method1412((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
         class47.field412[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < class47.field412.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = class309.method1412((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < class47.field412.length; ++var1) {
            class47.field412[var1] = var5;
         }
      }

   }
}
