public final class class427 extends class156 {
   int field3232;
   public int field3231;
   public int field3233;
   public int field3234;
   public int field3235;
   public int field3237;
   public int[] field3236;

   class427() {
   }

   public class427(int var1, int var2) {
      this(new int[var1 * var2], var1, var2);
   }

   public class427(int[] var1, int var2, int var3) {
      this.field3236 = var1;
      this.field3237 = this.field3234 = var2;
      this.field3233 = this.field3235 = var3;
      this.field3232 = 0;
      this.field3231 = 0;
   }

   public class427 method2004() {
      class427 var1 = new class427(this.field3237, this.field3233);
      var1.field3234 = this.field3234;
      var1.field3235 = this.field3235;
      var1.field3231 = this.field3234 - this.field3237 - this.field3231;
      var1.field3232 = this.field3232;

      for(int var2 = 0; var2 < this.field3233; ++var2) {
         for(int var3 = 0; var3 < this.field3237; ++var3) {
            var1.field3236[var2 * this.field3237 + var3] = this.field3236[var2 * this.field3237 + this.field3237 - 1 - var3];
         }
      }

      return var1;
   }

   public class427 method2005() {
      class427 var1 = new class427(this.field3237, this.field3233);
      var1.field3234 = this.field3234;
      var1.field3235 = this.field3235;
      var1.field3231 = this.field3231;
      var1.field3232 = this.field3232;
      int var2 = this.field3236.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.field3236[var3] = this.field3236[var3];
      }

      return var1;
   }

   public class427 method2021() {
      class427 var1 = new class427(this.field3234, this.field3235);

      for(int var2 = 0; var2 < this.field3233; ++var2) {
         for(int var3 = 0; var3 < this.field3237; ++var3) {
            var1.field3236[(var2 + this.field3232) * this.field3234 + var3 + this.field3231] = this.field3236[var2 * this.field3237 + var3];
         }
      }

      return var1;
   }

   public void method2006() {
      method947(this.field3236, this.field3237, this.field3233, (float[])null);
   }

   public void method2007() {
      if (this.field3237 != this.field3234 || this.field3233 != this.field3235) {
         int[] var1 = new int[this.field3234 * this.field3235];

         for(int var2 = 0; var2 < this.field3233; ++var2) {
            for(int var3 = 0; var3 < this.field3237; ++var3) {
               var1[(var2 + this.field3232) * this.field3234 + var3 + this.field3231] = this.field3236[var2 * this.field3237 + var3];
            }
         }

         this.field3236 = var1;
         this.field3237 = this.field3234;
         this.field3233 = this.field3235;
         this.field3231 = 0;
         this.field3232 = 0;
      }
   }

   public void method2008(int var1) {
      if (this.field3237 != this.field3234 || this.field3233 != this.field3235) {
         int var2 = var1;
         if (var1 > this.field3231) {
            var2 = this.field3231;
         }

         int var3 = var1;
         if (var1 + this.field3231 + this.field3237 > this.field3234) {
            var3 = this.field3234 - this.field3231 - this.field3237;
         }

         int var4 = var1;
         if (var1 > this.field3232) {
            var4 = this.field3232;
         }

         int var5 = var1;
         if (var1 + this.field3232 + this.field3233 > this.field3235) {
            var5 = this.field3235 - this.field3232 - this.field3233;
         }

         int var6 = this.field3237 + var2 + var3;
         int var7 = this.field3233 + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for(int var9 = 0; var9 < this.field3233; ++var9) {
            for(int var10 = 0; var10 < this.field3237; ++var10) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.field3236[var9 * this.field3237 + var10];
            }
         }

         this.field3236 = var8;
         this.field3237 = var6;
         this.field3233 = var7;
         this.field3231 -= var2;
         this.field3232 -= var4;
      }
   }

   public void method2009() {
      int[] var1 = new int[this.field3237 * this.field3233];
      int var2 = 0;

      for(int var3 = 0; var3 < this.field3233; ++var3) {
         for(int var4 = this.field3237 - 1; var4 >= 0; --var4) {
            var1[var2++] = this.field3236[var4 + var3 * this.field3237];
         }
      }

      this.field3236 = var1;
      this.field3231 = this.field3234 - this.field3237 - this.field3231;
   }

   public void method2033() {
      int[] var1 = new int[this.field3237 * this.field3233];
      int var2 = 0;

      for(int var3 = this.field3233 - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.field3237; ++var4) {
            var1[var2++] = this.field3236[var4 + var3 * this.field3237];
         }
      }

      this.field3236 = var1;
      this.field3232 = this.field3235 - this.field3233 - this.field3232;
   }

   public void method2010(int var1) {
      int[] var2 = new int[this.field3237 * this.field3233];
      int var3 = 0;

      for(int var4 = 0; var4 < this.field3233; ++var4) {
         for(int var5 = 0; var5 < this.field3237; ++var5) {
            int var6 = this.field3236[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.field3236[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.field3236[var3 - this.field3237] != 0) {
                  var6 = var1;
               } else if (var5 < this.field3237 - 1 && this.field3236[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < this.field3233 - 1 && this.field3236[var3 + this.field3237] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.field3236 = var2;
   }

   public void method2011(int var1) {
      for(int var2 = this.field3233 - 1; var2 > 0; --var2) {
         int var3 = var2 * this.field3237;

         for(int var4 = this.field3237 - 1; var4 > 0; --var4) {
            if (this.field3236[var4 + var3] == 0 && this.field3236[var4 + var3 - 1 - this.field3237] != 0) {
               this.field3236[var4 + var3] = var1;
            }
         }
      }

   }

   public void method2012(int var1, int var2) {
      var1 += this.field3231;
      var2 += this.field3232;
      int var3 = var1 + var2 * class156.field1648;
      int var4 = 0;
      int var5 = this.field3233;
      int var6 = this.field3237;
      int var7 = class156.field1648 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class156.field1654) {
         var9 = class156.field1654 - var2;
         var5 -= var9;
         var2 = class156.field1654;
         var4 += var9 * var6;
         var3 += var9 * class156.field1648;
      }

      if (var2 + var5 > class156.field1652) {
         var5 -= var2 + var5 - class156.field1652;
      }

      if (var1 < class156.field1653) {
         var9 = class156.field1653 - var1;
         var6 -= var9;
         var1 = class156.field1653;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > class156.field1647) {
         var9 = var1 + var6 - class156.field1647;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method2013(class156.field1650, this.field3236, var4, var3, var6, var5, var7, var8);
      }
   }

   public void method2032(int var1, int var2) {
      var1 += this.field3231;
      var2 += this.field3232;
      int var3 = var1 + var2 * class156.field1648;
      int var4 = 0;
      int var5 = this.field3233;
      int var6 = this.field3237;
      int var7 = class156.field1648 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class156.field1654) {
         var9 = class156.field1654 - var2;
         var5 -= var9;
         var2 = class156.field1654;
         var4 += var9 * var6;
         var3 += var9 * class156.field1648;
      }

      if (var2 + var5 > class156.field1652) {
         var5 -= var2 + var5 - class156.field1652;
      }

      if (var1 < class156.field1653) {
         var9 = class156.field1653 - var1;
         var6 -= var9;
         var1 = class156.field1653;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > class156.field1647) {
         var9 = var1 + var6 - class156.field1647;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method2014(class156.field1650, this.field3236, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   public void method2034(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.field3237;
         int var6 = this.field3233;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.field3234;
         int var10 = this.field3235;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.field3231 > 0) {
            var13 = ((this.field3231 << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (this.field3231 << 16);
         }

         if (this.field3232 > 0) {
            var13 = ((this.field3232 << 16) + var12 - 1) / var12;
            var2 += var13;
            var8 += var13 * var12 - (this.field3232 << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         var13 = var1 + var2 * class156.field1648;
         int var14 = class156.field1648 - var3;
         if (var2 + var4 > class156.field1652) {
            var4 -= var2 + var4 - class156.field1652;
         }

         int var15;
         if (var2 < class156.field1654) {
            var15 = class156.field1654 - var2;
            var4 -= var15;
            var13 += var15 * class156.field1648;
            var8 += var12 * var15;
         }

         if (var1 + var3 > class156.field1647) {
            var15 = var1 + var3 - class156.field1647;
            var3 -= var15;
            var14 += var15;
         }

         if (var1 < class156.field1653) {
            var15 = class156.field1653 - var1;
            var3 -= var15;
            var13 += var15;
            var7 += var11 * var15;
            var14 += var15;
         }

         method2015(class156.field1650, this.field3236, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
      }
   }

   public void method2016(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.method2032(var1, var2);
      } else {
         var1 += this.field3231;
         var2 += this.field3232;
         int var5 = var1 + var2 * class156.field1648;
         int var6 = 0;
         int var7 = this.field3233;
         int var8 = this.field3237;
         int var9 = class156.field1648 - var8;
         int var10 = 0;
         int var11;
         if (var2 < class156.field1654) {
            var11 = class156.field1654 - var2;
            var7 -= var11;
            var2 = class156.field1654;
            var6 += var11 * var8;
            var5 += var11 * class156.field1648;
         }

         if (var2 + var7 > class156.field1652) {
            var7 -= var2 + var7 - class156.field1652;
         }

         if (var1 < class156.field1653) {
            var11 = class156.field1653 - var1;
            var8 -= var11;
            var1 = class156.field1653;
            var6 += var11;
            var5 += var11;
            var10 += var11;
            var9 += var11;
         }

         if (var1 + var8 > class156.field1647) {
            var11 = var1 + var8 - class156.field1647;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
         }

         if (var8 > 0 && var7 > 0) {
            method2017(class156.field1650, this.field3236, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   public void method2030(int var1, int var2, int var3) {
      var1 += this.field3231;
      var2 += this.field3232;
      int var4 = var1 + var2 * class156.field1648;
      int var5 = 0;
      int var6 = this.field3233;
      int var7 = this.field3237;
      int var8 = class156.field1648 - var7;
      int var9 = 0;
      int var10;
      if (var2 < class156.field1654) {
         var10 = class156.field1654 - var2;
         var6 -= var10;
         var2 = class156.field1654;
         var5 += var10 * var7;
         var4 += var10 * class156.field1648;
      }

      if (var2 + var6 > class156.field1652) {
         var6 -= var2 + var6 - class156.field1652;
      }

      if (var1 < class156.field1653) {
         var10 = class156.field1653 - var1;
         var7 -= var10;
         var1 = class156.field1653;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > class156.field1647) {
         var10 = var1 + var7 - class156.field1647;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         method2019(class156.field1650, this.field3236, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   public void method2020(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field3237;
         int var7 = this.field3233;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3234;
         int var11 = this.field3235;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.field3231 > 0) {
            var14 = ((this.field3231 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3231 << 16);
         }

         if (this.field3232 > 0) {
            var14 = ((this.field3232 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3232 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * class156.field1648;
         int var15 = class156.field1648 - var3;
         if (var2 + var4 > class156.field1652) {
            var4 -= var2 + var4 - class156.field1652;
         }

         int var16;
         if (var2 < class156.field1654) {
            var16 = class156.field1654 - var2;
            var4 -= var16;
            var14 += var16 * class156.field1648;
            var9 += var13 * var16;
         }

         if (var1 + var3 > class156.field1647) {
            var16 = var1 + var3 - class156.field1647;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < class156.field1653) {
            var16 = class156.field1653 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         method2018(class156.field1650, this.field3236, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   public void method2036(int var1, int var2, int var3) {
      var1 += this.field3231;
      var2 += this.field3232;
      int var4 = var1 + var2 * class156.field1648;
      int var5 = 0;
      int var6 = this.field3233;
      int var7 = this.field3237;
      int var8 = class156.field1648 - var7;
      int var9 = 0;
      int var10;
      if (var2 < class156.field1654) {
         var10 = class156.field1654 - var2;
         var6 -= var10;
         var2 = class156.field1654;
         var5 += var10 * var7;
         var4 += var10 * class156.field1648;
      }

      if (var2 + var6 > class156.field1652) {
         var6 -= var2 + var6 - class156.field1652;
      }

      if (var1 < class156.field1653) {
         var10 = class156.field1653 - var1;
         var7 -= var10;
         var1 = class156.field1653;
         var5 += var10;
         var4 += var10;
         var9 += var10;
         var8 += var10;
      }

      if (var1 + var7 > class156.field1647) {
         var10 = var1 + var7 - class156.field1647;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         if (var3 == 256) {
            method2031(0, 0, 0, class156.field1650, this.field3236, var5, 0, var4, 0, var7, var6, var8, var9);
         } else {
            method2029(0, 0, 0, class156.field1650, this.field3236, var5, 0, var4, 0, var7, var6, var8, var9, var3);
         }

      }
   }

   public void method2022(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = this.field3237;
         int var7 = this.field3233;
         int var8 = 0;
         int var9 = 0;
         int var10 = this.field3234;
         int var11 = this.field3235;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         int var14;
         if (this.field3231 > 0) {
            var14 = ((this.field3231 << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (this.field3231 << 16);
         }

         if (this.field3232 > 0) {
            var14 = ((this.field3232 << 16) + var13 - 1) / var13;
            var2 += var14;
            var9 += var14 * var13 - (this.field3232 << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         var14 = var1 + var2 * class156.field1648;
         int var15 = class156.field1648 - var3;
         if (var2 + var4 > class156.field1652) {
            var4 -= var2 + var4 - class156.field1652;
         }

         int var16;
         if (var2 < class156.field1654) {
            var16 = class156.field1654 - var2;
            var4 -= var16;
            var14 += var16 * class156.field1648;
            var9 += var13 * var16;
         }

         if (var1 + var3 > class156.field1647) {
            var16 = var1 + var3 - class156.field1647;
            var3 -= var16;
            var15 += var16;
         }

         if (var1 < class156.field1653) {
            var16 = class156.field1653 - var1;
            var3 -= var16;
            var14 += var16;
            var8 += var12 * var16;
            var15 += var16;
         }

         if (var5 == 256) {
            method2023(0, 0, 0, var8, this.field3236, class156.field1650, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
         } else {
            method2035(0, 0, 0, var8, this.field3236, class156.field1650, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
         }

      }
   }

   public void method2024(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      int var10 = var2 + this.field3233 <= var6 ? this.field3233 : var6 - var2;
      int var11 = var1 < 0 ? -var1 : 0;
      int var10000;
      if (var1 + this.field3237 <= var5) {
         var10000 = this.field3237;
      } else {
         var10000 = var5 - var1;
      }

      int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * class156.field1648;
      int var14 = var2 + var9;

      for(int var15 = var9; var15 < var10; ++var15) {
         int var16 = var7[var14];
         int var17 = var8[var14++];
         int var18 = var13;
         int var19;
         if (var1 < var16) {
            var19 = var16 - var1;
            var18 = var13 + (var19 - var11);
         } else {
            var19 = var11;
         }

         int var12;
         if (var1 + this.field3237 <= var16 + var17) {
            var12 = this.field3237;
         } else {
            var12 = var16 + var17 - var1;
         }

         for(int var20 = var19; var20 < var12; ++var20) {
            int var21 = this.field3236[var20 + var15 * this.field3237];
            if (var21 != 0) {
               class156.field1650[var18++] = var21;
            } else {
               ++var18;
            }
         }

         var13 += class156.field1648;
      }

   }

   public void method2025(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin((double)var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos((double)var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * class156.field1648;

         for(var2 = 0; var2 < var4; ++var2) {
            int var18 = var9[var2];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               class156.field1650[var19++] = this.field3236[(var20 >> 16) + (var21 >> 16) * this.field3237];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += class156.field1648;
         }
      } catch (Exception var22) {
      }

   }

   public void method2003(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * class156.field1648;

         for(var2 = 0; var2 < var4; ++var2) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var20 = this.field3236[(var18 >> 16) + (var19 >> 16) * this.field3237];
               if (var20 != 0) {
                  class156.field1650[var17++] = var20;
               } else {
                  ++var17;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += class156.field1648;
         }
      } catch (Exception var21) {
      }

   }

   public void method2026(int var1, int var2, int var3, int var4) {
      this.method2027(this.field3234 << 3, this.field3235 << 3, var1 << 4, var2 << 4, var3, var4);
   }

   void method2027(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= this.field3231 << 4;
         var2 -= this.field3232 << 4;
         double var7 = (double)(var5 & '\uffff') * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = -(-var1) * var9 + -var2 * var10;
         int var13 = ((this.field3237 << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((this.field3237 << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((this.field3233 << 4) - var2) * var9;
         int var16 = -(-var1) * var9 + ((this.field3233 << 4) - var2) * var10;
         int var17 = ((this.field3237 << 4) - var1) * var10 + ((this.field3233 << 4) - var2) * var9;
         int var18 = -((this.field3237 << 4) - var1) * var9 + ((this.field3233 << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < class156.field1653) {
            var19 = class156.field1653;
         }

         if (var20 > class156.field1647) {
            var20 = class156.field1647;
         }

         if (var21 < class156.field1654) {
            var21 = class156.field1654;
         }

         if (var22 > class156.field1652) {
            var22 = class156.field1652;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * class156.field1648 + var19;
               double var24 = 1.6777216E7 / (double)var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               int var37;
               int var38;
               if (var27 == 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (this.field3237 << 12) < 0 && var31 - (this.field3233 << 12) < 0) {
                           for(; var37 < 0; ++var37) {
                              var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                              if (var38 != 0) {
                                 class156.field1650[var34++] = var38;
                              } else {
                                 ++var34;
                              }
                           }
                        }

                        ++var33;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.field3237 << 12) < 0) {
                           if ((var32 = var36 - (this.field3233 << 12)) >= 0) {
                              var32 = (var26 - var32) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                              if (var38 != 0) {
                                 class156.field1650[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if (var30 >= 0 && var30 - (this.field3237 << 12) < 0) {
                           if (var36 < 0) {
                              var32 = (var26 - 1 - var36) / var26;
                              var37 = var20 + var32;
                              var36 += var26 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var36 + 1 - (this.field3233 << 12) - var26) / var26) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                              if (var38 != 0) {
                                 class156.field1650[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var36 += var26;
                              ++var37;
                           }
                        }

                        ++var33;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31;
                        var37 = var20;
                        if (var31 >= 0 && var31 - (this.field3233 << 12) < 0) {
                           if ((var32 = var35 - (this.field3237 << 12)) >= 0) {
                              var32 = (var27 - var32) / var27;
                              var37 = var20 + var32;
                              var35 += var27 * var32;
                              var34 = var23 + var32;
                           }

                           if ((var32 = (var35 - var27) / var27) > var37) {
                              var37 = var32;
                           }

                           while(var37 < 0) {
                              var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                              if (var38 != 0) {
                                 class156.field1650[var34++] = var38;
                              } else {
                                 ++var34;
                              }

                              var35 += var27;
                              ++var37;
                           }
                        }

                        ++var33;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.field3237 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if ((var32 = var36 - (this.field3233 << 12)) >= 0) {
                           var32 = (var26 - var32) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                           if (var38 != 0) {
                              class156.field1650[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                        var34 = var23;
                        var35 = var30 + (var28 * var27 >> 4);
                        var36 = var31 + (var28 * var26 >> 4);
                        var37 = var20;
                        if ((var32 = var35 - (this.field3237 << 12)) >= 0) {
                           var32 = (var27 - var32) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        if (var36 < 0) {
                           var32 = (var26 - 1 - var36) / var26;
                           var37 += var32;
                           var35 += var27 * var32;
                           var36 += var26 * var32;
                           var34 += var32;
                        }

                        if ((var32 = (var36 + 1 - (this.field3233 << 12) - var26) / var26) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                           if (var38 != 0) {
                              class156.field1650[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           var36 += var26;
                           ++var37;
                        }

                        ++var33;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31;
                     var37 = var20;
                     if (var31 >= 0 && var31 - (this.field3233 << 12) < 0) {
                        if (var35 < 0) {
                           var32 = (var27 - 1 - var35) / var27;
                           var37 = var20 + var32;
                           var35 += var27 * var32;
                           var34 = var23 + var32;
                        }

                        if ((var32 = (var35 + 1 - (this.field3237 << 12) - var27) / var27) > var37) {
                           var37 = var32;
                        }

                        while(var37 < 0) {
                           var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                           if (var38 != 0) {
                              class156.field1650[var34++] = var38;
                           } else {
                              ++var34;
                           }

                           var35 += var27;
                           ++var37;
                        }
                     }

                     ++var33;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (var35 + 1 - (this.field3237 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if ((var32 = var36 - (this.field3233 << 12)) >= 0) {
                        var32 = (var26 - var32) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                        if (var38 != 0) {
                           class156.field1650[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for(var33 = var22; var33 < 0; var23 += class156.field1648) {
                     var34 = var23;
                     var35 = var30 + (var28 * var27 >> 4);
                     var36 = var31 + (var28 * var26 >> 4);
                     var37 = var20;
                     if (var35 < 0) {
                        var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     if ((var32 = (var35 + 1 - (this.field3237 << 12) - var27) / var27) > var37) {
                        var37 = var32;
                     }

                     if (var36 < 0) {
                        var32 = (var26 - 1 - var36) / var26;
                        var37 += var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 += var32;
                     }

                     if ((var32 = (var36 + 1 - (this.field3233 << 12) - var26) / var26) > var37) {
                        var37 = var32;
                     }

                     while(var37 < 0) {
                        var38 = this.field3236[(var36 >> 12) * this.field3237 + (var35 >> 12)];
                        if (var38 != 0) {
                           class156.field1650[var34++] = var38;
                        } else {
                           ++var34;
                        }

                        var35 += var27;
                        var36 += var26;
                        ++var37;
                     }

                     ++var33;
                     var30 -= var26;
                     var31 += var27;
                  }
               }

            }
         }
      }
   }

   public void method2028(int var1, int var2, int var3, int var4) {
      if (var3 <= this.field3234 && var4 <= this.field3235) {
         int var5 = var1 + this.field3231 * var3 / this.field3234;
         int var6 = var1 + ((this.field3231 + this.field3237) * var3 + this.field3234 - 1) / this.field3234;
         int var7 = var2 + this.field3232 * var4 / this.field3235;
         int var8 = var2 + ((this.field3232 + this.field3233) * var4 + this.field3235 - 1) / this.field3235;
         if (var5 < class156.field1653) {
            var5 = class156.field1653;
         }

         if (var6 > class156.field1647) {
            var6 = class156.field1647;
         }

         if (var7 < class156.field1654) {
            var7 = class156.field1654;
         }

         if (var8 > class156.field1652) {
            var8 = class156.field1652;
         }

         if (var5 < var6 && var7 < var8) {
            int var9 = var7 * class156.field1648 + var5;
            int var10 = class156.field1648 - (var6 - var5);
            if (var9 < class156.field1650.length) {
               for(int var11 = var7; var11 < var8; ++var11) {
                  for(int var12 = var5; var12 < var6; ++var12) {
                     int var13 = var12 - var1 << 4;
                     int var14 = var11 - var2 << 4;
                     int var15 = var13 * this.field3234 / var3 - (this.field3231 << 4);
                     int var16 = (var13 + 16) * this.field3234 / var3 - (this.field3231 << 4);
                     int var17 = var14 * this.field3235 / var4 - (this.field3232 << 4);
                     int var18 = (var14 + 16) * this.field3235 / var4 - (this.field3232 << 4);
                     int var19 = (var16 - var15) * (var18 - var17) >> 1;
                     if (var19 != 0) {
                        if (var15 < 0) {
                           var15 = 0;
                        }

                        if (var16 >= this.field3237 << 4) {
                           var16 = this.field3237 << 4;
                        }

                        if (var17 < 0) {
                           var17 = 0;
                        }

                        if (var18 >= this.field3233 << 4) {
                           var18 = this.field3233 << 4;
                        }

                        --var16;
                        --var18;
                        int var20 = 16 - (var15 & 15);
                        int var21 = (var16 & 15) + 1;
                        int var22 = 16 - (var17 & 15);
                        int var23 = (var18 & 15) + 1;
                        var15 >>= 4;
                        var16 >>= 4;
                        var17 >>= 4;
                        var18 >>= 4;
                        int var24 = 0;
                        int var25 = 0;
                        int var26 = 0;
                        int var27 = 0;

                        int var28;
                        for(var28 = var17; var28 <= var18; ++var28) {
                           int var29 = 16;
                           if (var28 == var17) {
                              var29 = var22;
                           }

                           if (var28 == var18) {
                              var29 = var23;
                           }

                           for(int var30 = var15; var30 <= var16; ++var30) {
                              int var31 = this.field3236[var28 * this.field3237 + var30];
                              if (var31 != 0) {
                                 int var32;
                                 if (var30 == var15) {
                                    var32 = var29 * var20;
                                 } else if (var30 == var16) {
                                    var32 = var29 * var21;
                                 } else {
                                    var32 = var29 << 4;
                                 }

                                 var27 += var32;
                                 var24 += (var31 >> 16 & 255) * var32;
                                 var25 += (var31 >> 8 & 255) * var32;
                                 var26 += (var31 & 255) * var32;
                              }
                           }
                        }

                        if (var27 >= var19) {
                           var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                           if (var28 == 0) {
                              var28 = 1;
                           }

                           class156.field1650[var9] = var28;
                        }

                        ++var9;
                     }
                  }

                  var9 += var10;
               }

            }
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method2013(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = -var5; var8 < 0; ++var8) {
         int var9;
         for(var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         for(var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static void method2014(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method2015(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   static void method2017(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & '\uff00') * var11 & 16711680;
      var10 = (var12 | var13) >>> 8;

      for(int var14 = -var6; var14 < 0; ++var14) {
         for(int var15 = -var5; var15 < 0; ++var15) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & '\uff00') * var9 & 16711680;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method2019(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for(int var11 = -var6; var11 < 0; ++var11) {
         for(int var12 = -var5; var12 < 0; ++var12) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method2018(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = 256 - var12;
      int var14 = var3;

      for(int var15 = -var8; var15 < 0; ++var15) {
         int var16 = (var4 >> 16) * var11;

         for(int var17 = -var7; var17 < 0; ++var17) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }

   }

   static void method2031(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void method2029(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      for(var8 = -var10; var8 < 0; ++var8) {
         for(var6 = -var9; var6 < 0; ++var6) {
            var0 = var4[var5++];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var13;
               var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
               var1 = var3[var7];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var7;
            }
         }

         var7 += var11;
         var5 += var12;
      }

   }

   static void method2023(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      for(int var16 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var16;
         var10 += var11;
      }

   }

   static void method2035(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      for(int var17 = var3; var8 < 0; ++var8) {
         var7 = (var9 >> 16) * var15;

         for(var6 = -var12; var6 < 0; ++var6) {
            var0 = var4[(var3 >> 16) + var7];
            if (var0 != 0) {
               var1 = (var0 & 16711935) * var16;
               var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
               var1 = var5[var10];
               var2 = var0 + var1;
               var0 = (var0 & 16711935) + (var1 & 16711935);
               var1 = (var0 & 16777472) + (var2 - var0 & 65536);
               var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
            } else {
               ++var10;
            }

            var3 += var13;
         }

         var9 += var14;
         var3 = var17;
         var10 += var11;
      }

   }
}
