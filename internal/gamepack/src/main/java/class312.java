import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class312 {
   boolean field2106 = false;
   boolean field2115 = false;
   class296 field2105;
   class328[][] field2107;
   class494 field2103;
   class501[] field2109;
   int field2102;
   int field2112;
   int field2113;
   int field2116;
   HashMap field2104;
   HashMap field2114 = new HashMap();
   final class509 field2110;
   final class509 field2111;
   final HashMap field2108;
   public int field2117 = 0;

   public class312(class501[] var1, HashMap var2, class509 var3, class509 var4) {
      this.field2109 = var1;
      this.field2108 = var2;
      this.field2110 = var3;
      this.field2111 = var4;
   }

   public void method1419(class509 var1, String var2, boolean var3) {
      if (!this.field2115) {
         this.field2106 = false;
         this.field2115 = true;
         System.nanoTime();
         int var5 = var1.method2447(class75.field550.field549);
         int var6 = var1.method2439(var5, var2);
         class366 var7 = new class366(var1.method2441(class75.field550.field549, var2));
         class366 var8 = new class366(var1.method2441(class75.field546.field549, var2));
         System.nanoTime();
         System.nanoTime();
         this.field2103 = new class494();

         try {
            this.field2103.method2340(var7, var8, var6, var3);
         } catch (IllegalStateException var17) {
            return;
         }

         this.field2103.method2135();
         this.field2103.method2128();
         this.field2103.method2129();
         this.field2113 = this.field2103.method2125() * 64;
         this.field2102 = this.field2103.method2134() * 64;
         this.field2112 = (this.field2103.method2136() - this.field2103.method2125() + 1) * 64;
         this.field2116 = (this.field2103.method2132() - this.field2103.method2134() + 1) * 64;
         int var9 = this.field2103.method2136() - this.field2103.method2125() + 1;
         int var10 = this.field2103.method2132() - this.field2103.method2134() + 1;
         System.nanoTime();
         System.nanoTime();
         class328.field2483.method102();
         this.field2107 = new class328[var9][var10];
         Iterator var11 = this.field2103.field3949.iterator();

         while(var11.hasNext()) {
            class282 var12 = (class282)var11.next();
            int var13 = var12.field985;
            int var14 = var12.field992;
            int var15 = var13 - this.field2103.method2125();
            int var16 = var14 - this.field2103.method2134();
            this.field2107[var15][var16] = new class328(var13, var14, this.field2103.method2123(), this.field2108);
            this.field2107[var15][var16].method1548(var12, this.field2103.field3951);
         }

         for(int var18 = 0; var18 < var9; ++var18) {
            for(int var20 = 0; var20 < var10; ++var20) {
               if (this.field2107[var18][var20] == null) {
                  this.field2107[var18][var20] = new class328(this.field2103.method2125() + var18, this.field2103.method2134() + var20, this.field2103.method2123(), this.field2108);
                  this.field2107[var18][var20].method1519(this.field2103.field3950, this.field2103.field3951);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method2444(class75.field545.field549, var2)) {
            byte[] var19 = var1.method2441(class75.field545.field549, var2);
            this.field2105 = class298.method1374(var19);
         }

         System.nanoTime();
         var1.method2435();
         var1.method2437();
         this.field2106 = true;
      }
   }

   public final void method1427() {
      this.field2104 = null;
   }

   public final void method1420(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var10 = class427.field3333;
      int var11 = class427.field3331;
      int var12 = class427.field3332;
      float[] var13 = class427.field3334;
      int[] var14 = new int[4];
      class427.method1964(var14);
      class372 var15 = this.method1424(var1, var2, var3, var4);
      float var16 = this.method1428(var7 - var5, var3 - var1);
      int var17 = (int)Math.ceil((double)var16);
      this.field2117 = var17;
      if (!this.field2114.containsKey(var17)) {
         class14 var18 = new class14(var17);
         var18.method91();
         this.field2114.put(var17, var18);
      }

      int var25 = var15.field2665 + var15.field2666 - 1;
      int var19 = var15.field2667 + var15.field2664 - 1;

      int var20;
      int var21;
      for(var20 = var15.field2665; var20 <= var25; ++var20) {
         for(var21 = var15.field2667; var21 <= var19; ++var21) {
            this.field2107[var20][var21].method1549(var17, (class14)this.field2114.get(var17), this.field2109, this.field2110, this.field2111);
         }
      }

      class480.method2270(var10, var11, var12, var13);
      class427.method1984(var14);
      var20 = (int)(var16 * 64.0F);
      var21 = var1 + this.field2113;
      int var22 = this.field2102 + var2;

      for(int var23 = var15.field2665; var23 < var15.field2666 + var15.field2665; ++var23) {
         for(int var24 = var15.field2667; var24 < var15.field2667 + var15.field2664; ++var24) {
            this.field2107[var23][var24].method1546((this.field2107[var23][var24].field2488 * 64 - var21) * var20 / 64 + var5, var8 - (64 + (this.field2107[var23][var24].field2479 * 64 - var22)) * var20 / 64, var20);
         }
      }

   }

   public final void method1421(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class372 var15 = this.method1424(var1, var2, var3, var4);
      float var16 = this.method1428(var7 - var5, var3 - var1);
      int var17 = (int)(var16 * 64.0F);
      int var18 = var1 + this.field2113;
      int var19 = this.field2102 + var2;

      int var20;
      int var21;
      for(var20 = var15.field2665; var20 < var15.field2665 + var15.field2666; ++var20) {
         for(var21 = var15.field2667; var21 < var15.field2667 + var15.field2664; ++var21) {
            if (var13) {
               this.field2107[var20][var21].method1522();
            }

            this.field2107[var20][var21].method1525(var17 * (this.field2107[var20][var21].field2488 * 64 - var18) / 64 + var5, var8 - (this.field2107[var20][var21].field2479 * 64 - var19 + 64) * var17 / 64, var17, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var20 = var15.field2665; var20 < var15.field2666 + var15.field2665; ++var20) {
            for(var21 = var15.field2667; var21 < var15.field2664 + var15.field2667; ++var21) {
               this.field2107[var20][var21].method1526(var10, var11, var12);
            }
         }
      }

   }

   public void method1422(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.field2105 != null) {
         this.field2105.method1368(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (null == this.field2104) {
               this.method1429();
            }

            Iterator var9 = var5.iterator();

            while(true) {
               List var11;
               do {
                  if (!var9.hasNext()) {
                     return;
                  }

                  int var10 = (Integer)var9.next();
                  var11 = (List)this.field2104.get(var10);
               } while(var11 == null);

               Iterator var12 = var11.iterator();

               while(var12.hasNext()) {
                  class368 var13 = (class368)var12.next();
                  int var14 = var3 * (var13.field2659.field726 - this.field2113) / this.field2112;
                  int var15 = var4 - var4 * (var13.field2659.field728 - this.field2102) / this.field2116;
                  class427.method1966(var14 + var1, var15 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List method1423(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var12 = new LinkedList();
      if (!this.field2106) {
         return var12;
      } else {
         class372 var13 = this.method1424(var1, var2, var3, var4);
         float var14 = this.method1428(var7, var3 - var1);
         int var15 = (int)(var14 * 64.0F);
         int var16 = var1 + this.field2113;
         int var17 = var2 + this.field2102;

         for(int var18 = var13.field2665; var18 < var13.field2665 + var13.field2666; ++var18) {
            for(int var19 = var13.field2667; var19 < var13.field2667 + var13.field2664; ++var19) {
               List var20 = this.field2107[var18][var19].method1538(var5 + (this.field2107[var18][var19].field2488 * 64 - var16) * var15 / 64, var8 + var6 - var15 * (this.field2107[var18][var19].field2479 * 64 - var17 + 64) / 64, var15, var9, var10);
               if (!var20.isEmpty()) {
                  var12.addAll(var20);
               }
            }
         }

         return var12;
      }
   }

   class372 method1424(int var1, int var2, int var3, int var4) {
      class372 var6 = new class372(this);
      int var7 = this.field2113 + var1;
      int var8 = var2 + this.field2102;
      int var9 = this.field2113 + var3;
      int var10 = var4 + this.field2102;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      int var14 = var10 / 64;
      var6.field2666 = var13 - var11 + 1;
      var6.field2664 = var14 - var12 + 1;
      var6.field2665 = var11 - this.field2103.method2125();
      var6.field2667 = var12 - this.field2103.method2134();
      if (var6.field2665 < 0) {
         var6.field2666 += var6.field2665;
         var6.field2665 = 0;
      }

      if (var6.field2665 > this.field2107.length - var6.field2666) {
         var6.field2666 = this.field2107.length - var6.field2665;
      }

      if (var6.field2667 < 0) {
         var6.field2664 += var6.field2667;
         var6.field2667 = 0;
      }

      if (var6.field2667 > this.field2107[0].length - var6.field2664) {
         var6.field2664 = this.field2107[0].length - var6.field2667;
      }

      var6.field2666 = Math.min(var6.field2666, this.field2107.length);
      var6.field2664 = Math.min(var6.field2664, this.field2107[0].length);
      return var6;
   }

   public boolean method1425() {
      return this.field2106;
   }

   public HashMap method1426() {
      this.method1429();
      return this.field2104;
   }

   void method1429() {
      if (this.field2104 == null) {
         this.field2104 = new HashMap();
      }

      this.field2104.clear();

      for(int var2 = 0; var2 < this.field2107.length; ++var2) {
         for(int var3 = 0; var3 < this.field2107[var2].length; ++var3) {
            List var4 = this.field2107[var2][var3].method1539();
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               class368 var6 = (class368)var5.next();
               if (var6.method1722()) {
                  int var7 = var6.method1720();
                  if (!this.field2104.containsKey(var7)) {
                     LinkedList var8 = new LinkedList();
                     var8.add(var6);
                     this.field2104.put(var7, var8);
                  } else {
                     List var9 = (List)this.field2104.get(var7);
                     var9.add(var6);
                  }
               }
            }
         }
      }

   }

   float method1428(int var1, int var2) {
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
