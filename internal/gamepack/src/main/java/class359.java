public class class359 extends class165 {
   class464 field2599;
   int field2600;
   int field2601;
   int field2602;
   int field2603;
   int field2604;
   int field2605;
   int field2606;
   int field2607;

   class359(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class165 var9) {
      this.field2602 = var1;
      this.field2600 = var2;
      this.field2601 = var3;
      this.field2605 = var4;
      this.field2603 = var5;
      this.field2604 = var6;
      if (var7 != -1) {
         this.field2599 = class464.method2200(var7);
         this.field2606 = 0;
         this.field2607 = Client.field1419 - 1;
         if (this.field2599.field3689 == 0 && null != var9 && var9 instanceof class359) {
            class359 var10 = (class359)var9;
            if (this.field2599 == var10.field2599) {
               this.field2606 = var10.field2606;
               this.field2607 = var10.field2607;
               return;
            }
         }

         if (var8 && -1 != this.field2599.field3678) {
            if (!this.field2599.method2199()) {
               this.field2606 = (int)(Math.random() * (double)this.field2599.field3674.length);
               this.field2607 -= (int)(Math.random() * (double)this.field2599.field3685[this.field2606]);
            } else {
               this.field2606 = (int)(Math.random() * (double)this.field2599.method2196());
            }
         }
      }

   }

   protected final class485 method632() {
      int var3;
      if (null != this.field2599) {
         int var2 = Client.field1419 - this.field2607;
         if (var2 > 100 && this.field2599.field3678 > 0) {
            var2 = 100;
         }

         if (this.field2599.method2199()) {
            var3 = this.field2599.method2196();
            this.field2606 += var2;
            var2 = 0;
            if (this.field2606 >= var3) {
               this.field2606 = var3 - this.field2599.field3678;
               if (this.field2606 < 0 || this.field2606 > var3) {
                  this.field2599 = null;
               }
            }
         } else {
            label69: {
               do {
                  do {
                     if (var2 <= this.field2599.field3685[this.field2606]) {
                        break label69;
                     }

                     var2 -= this.field2599.field3685[this.field2606];
                     ++this.field2606;
                  } while(this.field2606 < this.field2599.field3674.length);

                  this.field2606 -= this.field2599.field3678;
               } while(this.field2606 >= 0 && this.field2606 < this.field2599.field3674.length);

               this.field2599 = null;
            }
         }

         this.field2607 = Client.field1419 - var2;
      }

      class458 var13 = class430.method2004(this.field2602, (byte)42);
      if (var13.field3636 != null) {
         var13 = var13.method2155();
      }

      if (null == var13) {
         return null;
      } else {
         int var4;
         if (1 != this.field2601 && 3 != this.field2601) {
            var3 = var13.field3610;
            var4 = var13.field3595;
         } else {
            var3 = var13.field3595;
            var4 = var13.field3610;
         }

         int var5 = this.field2603 + (var3 >> 1);
         int var6 = (var3 + 1 >> 1) + this.field2603;
         int var7 = this.field2604 + (var4 >> 1);
         int var8 = this.field2604 + (var4 + 1 >> 1);
         int[][] var9 = class513.field4098[this.field2605];
         int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
         int var11 = (this.field2603 << 7) + (var3 << 6);
         int var12 = (this.field2604 << 7) + (var4 << 6);
         return var13.method2153(this.field2600, this.field2601, var9, var11, var10, var12, this.field2599, this.field2606);
      }
   }

   static int method1618(int var0, class283 var1, boolean var2) {
      class322 var4 = var2 ? class276.field1942 : class48.field419;
      if (var0 == 1700) {
         class197.field1537[++class41.field341 - 1] = var4.field2286;
         return 1;
      } else if (var0 == 1701) {
         if (-1 != var4.field2286) {
            class197.field1537[++class41.field341 - 1] = var4.field2287;
         } else {
            class197.field1537[++class41.field341 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class197.field1537[++class41.field341 - 1] = var4.field2277;
         return 1;
      } else if (var0 == 1707) {
         class197.field1537[++class41.field341 - 1] = var4.method1480() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return class197.method1035(var4);
      } else {
         return var0 == 1709 ? class197.method1045(var4) : 2;
      }
   }
}
