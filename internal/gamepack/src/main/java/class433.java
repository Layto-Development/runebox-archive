public abstract class class433 extends class165 {
   boolean field3378 = false;
   boolean field3381 = false;
   boolean field3395;
   boolean field3396 = false;
   boolean field3413;
   byte field3388;
   byte field3394;
   byte field3401 = 0;
   byte field3426;
   byte field3436;
   class457 field3407 = new class457();
   class524 field3439 = new class524(4);
   class82[] field3446 = new class82[10];
   int field3373 = 0;
   int field3374;
   int field3375;
   int field3376 = -1;
   int field3377 = 1;
   int field3379 = -1;
   int field3380 = -1;
   int field3382 = -1;
   int field3383 = -1;
   int field3384 = -1;
   int field3386 = -1;
   int field3387 = -1;
   int field3389 = -1;
   int field3390 = -1;
   int field3391 = -1;
   int field3392 = -1;
   int field3393;
   int field3397 = 100;
   int field3398 = 0;
   int field3399 = 0;
   int field3400 = 0;
   int field3403;
   int field3408 = -1;
   int field3409;
   int field3410 = -1;
   int field3411 = -1;
   int field3412 = -1;
   int field3414;
   int field3415 = 0;
   int field3416 = 0;
   int field3417 = 0;
   int field3418 = -1;
   int field3419 = 0;
   int field3420 = 0;
   int field3421 = 0;
   int field3422 = -1;
   int field3423;
   int field3424 = 0;
   int field3425;
   int field3427;
   int field3428 = -1;
   int field3429;
   int field3430;
   int field3431;
   int field3432 = -1;
   int field3433 = 200;
   int field3434 = -1;
   int field3435 = 0;
   int field3437 = 0;
   int field3438 = 0;
   int field3441 = -1;
   int field3442 = 32;
   int field3443 = -1;
   int field3447 = 0;
   int field3449 = -1;
   int[] field3385 = new int[4];
   int[] field3402 = new int[4];
   int[] field3404 = new int[4];
   int[] field3405 = new int[4];
   int[] field3406 = new int[4];
   int[] field3440 = null;
   int[] field3445 = new int[10];
   int[] field3448 = new int[10];
   String field3444 = null;

   class433() {
   }

   final void method2018() {
      this.field3421 = 0;
      this.field3437 = 0;
   }

   boolean method2017() {
      return false;
   }

   final void method2023(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field3404[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class183 var13 = class183.method978(var1);
         var11 = var13.field1465;
         var12 = var13.field1472;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (var11 == 0) {
            var15 = this.field3404[0];
         } else if (var11 == 1) {
            var15 = this.field3385[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (var11 == 0) {
               if (this.field3404[var14] < var15) {
                  var10 = var14;
                  var15 = this.field3404[var14];
               }
            } else if (var11 == 1 && this.field3385[var14] < var15) {
               var10 = var14;
               var15 = this.field3385[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field3401 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field3401;
            this.field3401 = (byte)((this.field3401 + 1) % 4);
            if (this.field3404[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field3402[var10] = var1;
         this.field3385[var10] = var2;
         this.field3405[var10] = var3;
         this.field3406[var10] = var4;
         this.field3404[var10] = var6 + var5 + var12;
      }
   }

   final void method2019(int var1, int var2, int var3, int var4, int var5, int var6) {
      class225 var9 = (class225)class225.field1680.method1183((long)var1);
      class225 var8;
      if (null != var9) {
         var8 = var9;
      } else {
         byte[] var10 = class225.field1679.method2422(33, var1);
         var9 = new class225();
         var9.field1682 = var1;
         if (null != var10) {
            var9.method1121(new class366(var10));
         }

         class225.field1680.method1182(var9, (long)var1);
         var8 = var9;
      }

      var9 = var8;
      class156 var15 = null;
      class156 var11 = null;
      int var12 = var8.field1684;
      int var13 = 0;

      class156 var14;
      for(var14 = (class156)this.field3407.method2144(); null != var14; var14 = (class156)this.field3407.method2140()) {
         ++var13;
         if (var9.field1682 == var14.field978.field1682) {
            var14.method589(var2 + var4, var5, var6, var3);
            return;
         }

         if (var14.field978.field1685 <= var9.field1685) {
            var15 = var14;
         }

         if (var14.field978.field1684 > var12) {
            var11 = var14;
            var12 = var14.field978.field1684;
         }
      }

      if (var11 != null || var13 < 4) {
         var14 = new class156(var9);
         if (var15 == null) {
            this.field3407.method2147(var14);
         } else {
            class457.method2145(var14, var15);
         }

         var14.method589(var2 + var4, var5, var6, var3);
         if (var13 >= 4) {
            var11.method295();
         }

      }
   }

   final void method2024(int var1) {
      class225 var4 = (class225)class225.field1680.method1183((long)var1);
      class225 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class225.field1679.method2422(33, var1);
         var4 = new class225();
         var4.field1682 = var1;
         if (null != var5) {
            var4.method1121(new class366(var5));
         }

         class225.field1680.method1182(var4, (long)var1);
         var3 = var4;
      }

      var4 = var3;

      for(class156 var6 = (class156)this.field3407.method2144(); var6 != null; var6 = (class156)this.field3407.method2140()) {
         if (var6.field978 == var4) {
            var6.method295();
            return;
         }
      }

   }

   void method2020(int var1, int var2, int var3, int var4) {
      int var6 = var4 + Client.field1419;
      class248 var7 = (class248)this.field3439.method2509((long)var1);
      if (null != var7) {
         var7.method295();
         --this.field3424;
      }

      if (var2 != 65535 && var2 != -1) {
         byte var8 = 0;
         if (var4 > 0) {
            var8 = -1;
         }

         this.field3439.method2513(new class248(var2, var3, var6, var8), (long)var1);
         ++this.field3424;
      }
   }

   class524 method2021() {
      return this.field3439;
   }

   void method2025() {
      class231 var2 = new class231(this.field3439);

      for(class248 var3 = (class248)var2.method1127(); null != var3; var3 = (class248)var2.next()) {
         var3.method295();
      }

      this.field3424 = 0;
   }

   class485 method2022(class485 var1) {
      if (0 == this.field3424) {
         return var1;
      } else {
         class231 var3 = new class231(this.field3439);
         int var4 = var1.field3894;
         int var5 = var1.field3842;
         int var6 = var1.field3854;
         byte var7 = var1.field3853;

         for(class248 var8 = (class248)var3.method1127(); var8 != null; var8 = (class248)var3.next()) {
            if (var8.field1787 != -1) {
               class485 var9 = class163.method625(var8.field1790).method622();
               if (null != var9) {
                  var4 += var9.field3894;
                  var5 += var9.field3842;
                  var6 += var9.field3854;
               }
            }
         }

         class485 var11 = new class485(var4, var5, var6, var7);
         var11.method2315(var1);

         for(class248 var12 = (class248)var3.method1127(); var12 != null; var12 = (class248)var3.next()) {
            if (var12.field1787 != -1) {
               class485 var10 = class163.method625(var12.field1790).method621(var12.field1787);
               if (var10 != null) {
                  var10.method2294(0, -var12.field1788, 0);
                  var11.method2315(var10);
               }
            }
         }

         return var11;
      }
   }

   void method2026() {
      this.field3413 = false;
      this.field3410 = -1;
      this.field3411 = -1;
      this.field3412 = -1;
   }
}
