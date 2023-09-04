import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class429 {
   boolean field3248 = false;
   boolean field3257 = false;
   class227[][] field3249;
   class268 field3245;
   class425[] field3251;
   class427 field3247;
   int field3244;
   int field3254;
   int field3255;
   int field3258;
   HashMap field3246;
   HashMap field3256 = new HashMap();
   final class298 field3252;
   final class298 field3253;
   final HashMap field3250;
   public int field3259 = 0;

   public class429(class425[] var1, HashMap var2, class298 var3, class298 var4) {
      this.field3251 = var1;
      this.field3250 = var2;
      this.field3252 = var3;
      this.field3253 = var4;
   }

   public void method2060(class298 var1, String var2, boolean var3) {
      if (!this.field3257) {
         this.field3248 = false;
         this.field3257 = true;
         System.nanoTime();
         int var5 = var1.method1654(class511.field3982.field3981);
         int var6 = var1.method1646(var5, var2);
         class184 var7 = new class184(var1.method1648(class511.field3982.field3981, var2));
         class184 var8 = new class184(var1.method1648(class511.field3978.field3981, var2));
         System.nanoTime();
         System.nanoTime();
         this.field3245 = new class268();

         try {
            this.field3245.method1513(var7, var8, var6, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.field3245.method2310();
         this.field3245.method2303();
         this.field3245.method2304();
         this.field3255 = this.field3245.method2300() * 64;
         this.field3244 = this.field3245.method2309() * 64;
         this.field3254 = (this.field3245.method2311() - this.field3245.method2300() + 1) * 64;
         this.field3258 = (this.field3245.method2307() - this.field3245.method2309() + 1) * 64;
         int var9 = this.field3245.method2311() - this.field3245.method2300() + 1;
         int var10 = this.field3245.method2307() - this.field3245.method2309() + 1;
         System.nanoTime();
         System.nanoTime();
         class227.field2094.method260();
         this.field3249 = new class227[var9][var10];
         Iterator var11 = this.field3245.field2303.iterator();

         while(var11.hasNext()) {
            class430 var12 = (class430)var11.next();
            int var13 = var12.field1531;
            int var14 = var12.field1538;
            int var15 = var13 - this.field3245.method2300();
            int var16 = var14 - this.field3245.method2309();
            this.field3249[var15][var16] = new class227(var13, var14, this.field3245.method2298(), this.field3250);
            this.field3249[var15][var16].method1370(var12, this.field3245.field2305);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(int var20 = 0; var20 < var10; ++var20) {
               if (this.field3249[var18][var20] == null) {
                  this.field3249[var18][var20] = new class227(this.field3245.method2300() + var18, this.field3245.method2309() + var20, this.field3245.method2298(), this.field3250);
                  this.field3249[var18][var20].method1341(this.field3245.field2304, this.field3245.field2305);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method1651(class511.field3977.field3981, var2)) {
            byte[] var19 = var1.method1648(class511.field3977.field3981, var2);
            this.field3247 = class462.method2262(var19);
         }

         System.nanoTime();
         var1.method1642();
         var1.method1644();
         this.field3248 = true;
      }
   }

   public final void method2068() {
      this.field3246 = null;
   }

   public final void method2061(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = class156.field1650;
      int var11 = class156.field1648;
      int var12 = class156.field1649;
      float[] var13 = class156.field1651;
      int[] var14 = new int[4];
      class156.method950(var14);
      class99 var15 = this.method2065(var1, var2, var3, var4);
      float var16 = this.method2069(var7 - var5, var3 - var1);
      int var17 = (int)Math.ceil((double)var16);
      this.field3259 = var17;
      if (!this.field3256.containsKey(var17)) {
         class63 var18 = new class63(var17);
         var18.method644();
         this.field3256.put(var17, var18);
      }

      int var25 = var15.field1322 + var15.field1323 - 1;
      int var19 = var15.field1324 + var15.field1321 - 1;

      int var20;
      int var21;
      for(var20 = var15.field1322; var20 <= var25; ++var20) {
         for(var21 = var15.field1324; var21 <= var19; ++var21) {
            this.field3249[var20][var21].method1371(var17, (class63)this.field3256.get(var17), this.field3251, this.field3252, this.field3253);
         }
      }

      class399.method1943(var10, var11, var12, var13);
      class156.method970(var14);
      var20 = (int)(var16 * 64.0F);
      var21 = var1 + this.field3255;
      int var22 = this.field3244 + var2;

      for(int var23 = var15.field1322; var23 < var15.field1323 + var15.field1322; ++var23) {
         for(int var24 = var15.field1324; var24 < var15.field1324 + var15.field1321; ++var24) {
            this.field3249[var23][var24].method1368((this.field3249[var23][var24].field2099 * 64 - var21) * var20 / 64 + var5, var8 - (64 + (this.field3249[var23][var24].field2090 * 64 - var22)) * var20 / 64, var20);
         }
      }

   }

   public final void method2062(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class99 var15 = this.method2065(var1, var2, var3, var4);
      float var16 = this.method2069(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = var1 + this.field3255;
      int var19 = this.field3244 + var2;

      int var20;
      int var21;
      for(var20 = var15.field1322; var20 < var15.field1322 + var15.field1323; ++var20) {
         for(var21 = var15.field1324; var21 < var15.field1324 + var15.field1321; ++var21) {
            if (var13) {
               this.field3249[var20][var21].method1344();
            }

            this.field3249[var20][var21].method1347(var17 * (this.field3249[var20][var21].field2099 * 64 - var18) / 64 + var5, var8 - (this.field3249[var20][var21].field2090 * 64 - var19 + 64) * var17 / 64, var17, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var20 = var15.field1322; var20 < var15.field1323 + var15.field1322; ++var20) {
            for(var21 = var15.field1324; var21 < var15.field1321 + var15.field1324; ++var21) {
               this.field3249[var20][var21].method1348(var10, var11, var12);
            }
         }
      }

   }

   public void method2063(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.field3247 != null) {
         this.field3247.method2034(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (null == this.field3246) {
               this.method2070();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = (Integer)var9.next();
                  var11 = (List)this.field3246.get(var10);
               } while(var11 == null);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  class373 var13 = (class373)var12.next();
                  int var14 = var3 * (var13.field2922.field1273 - this.field3255) / this.field3254;
                  int var15 = var4 - var4 * (var13.field2922.field1275 - this.field3244) / this.field3258;
                  class156.method952(var14 + var1, var15 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List method2064(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.field3248) {
         return var12;
      } else {
         class99 var13 = this.method2065(var1, var2, var3, var4);
         float var14 = this.method2069(var7, var3 - var1);
         int var15 = (int)(var14 * 64.0F);
         int var16 = var1 + this.field3255;
         int var17 = var2 + this.field3244;

         for(int var18 = var13.field1322; var18 < var13.field1322 + var13.field1323; ++var18) {
            for(int var19 = var13.field1324; var19 < var13.field1324 + var13.field1321; ++var19) {
               List var20 = this.field3249[var18][var19].method1360(var5 + (this.field3249[var18][var19].field2099 * 64 - var16) * var15 / 64, var8 + var6 - var15 * (this.field3249[var18][var19].field2090 * 64 - var17 + 64) / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   class99 method2065(int var1, int var2, int var3, int var4) {
      class99 var6 = new class99(this);
      int var7 = this.field3255 + var1;
      int var8 = var2 + this.field3244;
      int var9 = this.field3255 + var3;
      int var10 = var4 + this.field3244;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field1323 = var13 - var11 + 1;
      var6.field1321 = var14 - var12 + 1;
      var6.field1322 = var11 - this.field3245.method2300();
      var6.field1324 = var12 - this.field3245.method2309();
      if (var6.field1322 < 0) {
         var6.field1323 += var6.field1322;
         var6.field1322 = 0;
      }

      if (var6.field1322 > this.field3249.length - var6.field1323) {
         var6.field1323 = this.field3249.length - var6.field1322;
      }

      if (var6.field1324 < 0) {
         var6.field1321 += var6.field1324;
         var6.field1324 = 0;
      }

      if (var6.field1324 > this.field3249[0].length - var6.field1321) {
         var6.field1321 = this.field3249[0].length - var6.field1324;
      }

      var6.field1323 = Math.min(var6.field1323, this.field3249.length);
      var6.field1321 = Math.min(var6.field1321, this.field3249[0].length);
      return var6;
   }

   public boolean method2066() {
      return this.field3248;
   }

   public HashMap method2067() {
      this.method2070();
      return this.field3246;
   }

   void method2070() {
      if (this.field3246 == null) {
         this.field3246 = new HashMap();
      }

      this.field3246.clear();

      for(int var2 = 0; var2 < this.field3249.length; ++var2) {
         for(int var3 = 0; var3 < this.field3249[var2].length; ++var3) {
            List var4 = this.field3249[var2][var3].method1361();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class373 var6 = (class373)var5.next();
               if (var6.method1873()) {
                  int var7 = var6.method1871();
                  if (!this.field3246.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field3246.put(var7, var8);
                  } else {
                     List var9 = (List)this.field3246.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   float method2069(int var1, int var2) {
      float var4 = (float)var1 / (float)var2;
      if (var4 > 8.0F) {
         return 8.0F;
      } else if (var4 < 1.0F) {
         return 1.0F;
      } else {
         int var5 = Math.round(var4);
         return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
      }
   }
}
