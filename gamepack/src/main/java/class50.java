public class class50 extends class496 {
   class157 field1048;
   int field1049;
   int field1050;
   int field1051;
   int field1052;
   int field1053;
   int field1054;
   int field1055;
   int field1056;

   class50(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class496 var9) {
      this.field1051 = var1;
      this.field1049 = var2;
      this.field1050 = var3;
      this.field1054 = var4;
      this.field1052 = var5;
      this.field1053 = var6;
      if (var7 != -1) {
         this.field1048 = class157.method984(var7);
         this.field1055 = 0;
         this.field1056 = Client.field879 - 1;
         if (this.field1048.field1678 == 0 && null != var9 && var9 instanceof class50) {
            class50 var10 = (class50)var9;
            if (this.field1048 == var10.field1048) {
               this.field1055 = var10.field1055;
               this.field1056 = var10.field1056;
               return;
            }
         }

         if (var8 && this.field1048.field1667 != -1) {
            if (!this.field1048.method983()) {
               this.field1055 = (int)(Math.random() * (double)this.field1048.field1663.length);
               this.field1056 -= (int)(Math.random() * (double)this.field1048.field1674[this.field1055]);
            } else {
               this.field1055 = (int)(Math.random() * (double)this.field1048.method980());
            }
         }
      }

   }

   protected final class104 method2401() {
      int var3;
      if (null != this.field1048) {
         int var2 = Client.field879 - this.field1056;
         if (var2 > 100 && this.field1048.field1667 > 0) {
            var2 = 100;
         }

         if (this.field1048.method983()) {
            var3 = this.field1048.method980();
            this.field1055 += var2;
            var2 = 0;
            if (this.field1055 >= var3) {
               this.field1055 = var3 - this.field1048.field1667;
               if (this.field1055 < 0 || this.field1055 > var3) {
                  this.field1048 = null;
               }
            }
         } else {
            label69: {
               do {
                  do {
                     if (var2 <= this.field1048.field1674[this.field1055]) {
                        break label69;
                     }

                     var2 -= this.field1048.field1674[this.field1055];
                     ++this.field1055;
                  } while(this.field1055 < this.field1048.field1663.length);

                  this.field1055 -= this.field1048.field1667;
               } while(this.field1055 >= 0 && this.field1055 < this.field1048.field1663.length);

               this.field1048 = null;
            }
         }

         this.field1056 = Client.field879 - var2;
      }

      class449 var13 = class444.method2172(this.field1051, (byte)42);
      if (var13.field3476 != null) {
         var13 = var13.method2215();
      }

      if (null == var13) {
         return null;
      } else {
         int var4;
         if (this.field1050 != 1 && this.field1050 != 3) {
            var3 = var13.field3450;
            var4 = var13.field3435;
         } else {
            var3 = var13.field3435;
            var4 = var13.field3450;
         }

         int var5 = this.field1052 + (var3 >> 1);
         int var6 = (var3 + 1 >> 1) + this.field1052;
         int var7 = this.field1053 + (var4 >> 1);
         int var8 = this.field1053 + (var4 + 1 >> 1);
         int[][] var9 = class526.field4141[this.field1054];
         int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
         int var11 = (this.field1052 << 7) + (var3 << 6);
         int var12 = (this.field1053 << 7) + (var4 << 6);
         return var13.method2213(this.field1049, this.field1050, var9, var11, var10, var12, this.field1048, this.field1055);
      }
   }

   static int method599(int var0, class106 var1, boolean var2) {
      class480 var4 = var2 ? class154.field1646 : class273.field2334;
      if (var0 == 1700) {
         class18.field200[++class482.field3830 - 1] = var4.field3802;
         return 1;
      } else if (var0 == 1701) {
         if (var4.field3802 != -1) {
            class18.field200[++class482.field3830 - 1] = var4.field3803;
         } else {
            class18.field200[++class482.field3830 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class18.field200[++class482.field3830 - 1] = var4.field3793;
         return 1;
      } else if (var0 == 1707) {
         class18.field200[++class482.field3830 - 1] = var4.method2347() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return class18.method213(var4);
      } else {
         return var0 == 1709 ? class18.method223(var4) : 2;
      }
   }
}
