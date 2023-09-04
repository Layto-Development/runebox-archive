public final class class305 extends class496 {
   boolean field2524;
   class157 field2548;
   double field2534;
   double field2539;
   double field2540;
   double field2541;
   double field2542;
   double field2543;
   double field2544;
   double field2546;
   int field2522;
   int field2523;
   int field2525;
   int field2526;
   int field2527;
   int field2528;
   int field2529;
   int field2530;
   int field2531;
   int field2532;
   int field2533;
   int field2535;
   int field2536;
   int field2537;
   int field2538;
   int field2545;
   int field2547;
   int field2549;
   int field2550;

   class305(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field2524 = false;
      this.field2549 = 0;
      this.field2550 = 0;
      this.field2535 = var1;
      this.field2523 = var2;
      this.field2533 = var3;
      this.field2522 = var4;
      this.field2531 = var5;
      this.field2547 = var6;
      this.field2532 = var7;
      this.field2525 = var8;
      this.field2537 = var9;
      this.field2536 = var10;
      this.field2527 = var11;
      this.field2524 = false;
      int var12 = class529.method2515(this.field2535).field4158;
      if (var12 != -1) {
         this.field2548 = class157.method984(var12);
      } else {
         this.field2548 = null;
      }

   }

   class305(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
      this.field2538 = var10;
   }

   final void method1667(int var1, int var2, int var3, int var4) {
      this.field2528 = var1;
      this.field2529 = var2;
      this.field2530 = var3;
      double var6;
      if (!this.field2524) {
         var6 = (double)(this.field2528 - this.field2533);
         double var8 = (double)(this.field2529 - this.field2522);
         double var10 = Math.sqrt(var6 * var6 + var8 * var8);
         this.field2546 = (double)this.field2533 + (double)this.field2537 * var6 / var10;
         this.field2539 = (double)this.field2522 + (double)this.field2537 * var8 / var10;
         this.field2540 = (double)this.field2531;
      }

      var6 = (double)(this.field2532 + 1 - var4);
      this.field2541 = ((double)this.field2528 - this.field2546) / var6;
      this.field2542 = ((double)this.field2529 - this.field2539) / var6;
      this.field2543 = Math.sqrt(this.field2542 * this.field2542 + this.field2541 * this.field2541);
      if (!this.field2524) {
         this.field2544 = -this.field2543 * Math.tan((double)this.field2525 * 0.02454369);
      }

      this.field2534 = ((double)this.field2530 - this.field2540 - this.field2544 * var6) * 2.0 / (var6 * var6);
   }

   final void method1668(int var1) {
      this.field2524 = true;
      this.field2546 += this.field2541 * (double)var1;
      this.field2539 += (double)var1 * this.field2542;
      this.field2540 += this.field2534 * 0.5 * (double)var1 * (double)var1 + (double)var1 * this.field2544;
      this.field2544 += this.field2534 * (double)var1;
      this.field2526 = (int)(Math.atan2(this.field2541, this.field2542) * 325.949) + 1024 & 2047;
      this.field2545 = (int)(Math.atan2(this.field2544, this.field2543) * 325.949) & 2047;
      if (this.field2548 != null) {
         if (!this.field2548.method983()) {
            this.field2550 += var1;

            while(true) {
               do {
                  do {
                     if (this.field2550 <= this.field2548.field1674[this.field2549]) {
                        return;
                     }

                     this.field2550 -= this.field2548.field1674[this.field2549];
                     ++this.field2549;
                  } while(this.field2549 < this.field2548.field1663.length);

                  this.field2549 -= this.field2548.field1667;
               } while(this.field2549 >= 0 && this.field2549 < this.field2548.field1663.length);

               this.field2549 = 0;
            }
         } else {
            this.field2549 += var1;
            int var3 = this.field2548.method980();
            if (this.field2549 >= var3) {
               this.field2549 = var3 - this.field2548.field1667;
            }
         }
      }

   }

   protected final class104 method2401() {
      class529 var2 = class529.method2515(this.field2535);
      class104 var3 = var2.method2511(this.field2549);
      if (null == var3) {
         return null;
      } else {
         var3.method779(this.field2545);
         return var3;
      }
   }
}
