import java.util.HashMap;

public class class470 {
   static String field3619;
   class119 field3616 = new class119(0, 0);
   int field3618 = 0;
   int[] field3614 = new int[2048];
   int[] field3615 = new int[2048];
   final HashMap field3617 = new HashMap();

   public class470() {
      method2275();
   }

   void method2273(int var1) {
      int var3 = var1 * 2 + 1;
      double[] var4 = class308.method1673(0.0, (double)((float)var1 / 3.0F), var1);
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

      class427 var12 = new class427(var7, var3, var3);
      this.field3617.put(var1, var12);
   }

   class427 method2269(int var1) {
      if (!this.field3617.containsKey(var1)) {
         this.method2273(var1);
      }

      return (class427)this.field3617.get(var1);
   }

   public final void method2270(int var1, int var2) {
      if (this.field3618 < this.field3614.length) {
         this.field3614[this.field3618] = var1;
         this.field3615[this.field3618] = var2;
         ++this.field3618;
      }
   }

   public final void method2271() {
      this.field3618 = 0;
   }

   public final void method2272(int var1, int var2, class427 var3, float var4) {
      int var6 = (int)(var4 * 18.0F);
      class427 var7 = this.method2269(var6);
      int var8 = var6 * 2 + 1;
      class119 var9 = new class119(0, 0, var3.field3237, var3.field3233);
      class119 var10 = new class119(0, 0);
      this.field3616.method826(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field3618; ++var11) {
         var12 = this.field3614[var11];
         var13 = this.field3615[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field3233 - (float)(var13 - var2) * var4) - var6;
         this.field3616.method825(var14, var15);
         this.field3616.method828(var9, var10);
         this.method2274(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field3236.length; ++var11) {
         if (var3.field3236[var11] == 0) {
            var3.field3236[var11] = -16777216;
         } else {
            var12 = (var3.field3236[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field3236[var11] = -16777216;
            } else {
               if (var12 > class71.field1192.length) {
                  var12 = class71.field1192.length;
               }

               var13 = class71.field1192[var12 - 1];
               var3.field3236[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void method2274(class427 var1, class427 var2, class119 var3) {
      if (var3.field1484 != 0 && var3.field1482 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (var3.field1485 == 0) {
            var5 = var1.field3237 - var3.field1484;
         }

         if (var3.field1483 == 0) {
            var6 = var1.field3233 - var3.field1482;
         }

         int var7 = var6 * var1.field3237 + var5;
         int var8 = var2.field3237 * var3.field1483 + var3.field1485;

         for(int var9 = 0; var9 < var3.field1482; ++var9) {
            for(int var10 = 0; var10 < var3.field1484; ++var10) {
               int[] var10000 = var2.field3236;
               int var10001 = var8++;
               var10000[var10001] += var1.field3236[var7++];
            }

            var7 += var1.field3237 - var3.field1484;
            var8 += var2.field3237 - var3.field1484;
         }

      }
   }

   static void method2275() {
      class71.field1192 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class287.method1600((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
         class71.field1192[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < class71.field1192.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = class287.method1600((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < class71.field1192.length; ++var1) {
            class71.field1192[var1] = var5;
         }
      }

   }
}
