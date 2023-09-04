public final class class425 extends class156 {
   public byte[] field3224;
   public int field3220;
   public int field3221;
   public int field3222;
   public int field3223;
   public int field3225;
   public int field3226;
   public int[] field3227;

   class425() {
   }

   public void method1995() {
      if (this.field3222 != this.field3221 || this.field3223 != this.field3226) {
         byte[] var1 = new byte[this.field3221 * this.field3226];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field3223; ++var3) {
            for(int var4 = 0; var4 < this.field3222; ++var4) {
               var1[var4 + this.field3220 + (var3 + this.field3225) * this.field3221] = this.field3224[var2++];
            }
         }

         this.field3224 = var1;
         this.field3222 = this.field3221;
         this.field3223 = this.field3226;
         this.field3220 = 0;
         this.field3225 = 0;
      }
   }

   public void method1996(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3227.length; ++var4) {
         int var5 = this.field3227[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field3227[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field3227[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field3227[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void method2000(int var1, int var2) {
      var1 += this.field3220;
      var2 += this.field3225;
      int var3 = var1 + var2 * class156.field1648;
      int var4 = 0;
      int var5 = this.field3223;
      int var6 = this.field3222;
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
         method1997(class156.field1650, this.field3224, this.field3227, var4, var3, var6, var5, var7, var8);
      }
   }

   public void method1999(int var1, int var2, int var3, int var4) {
      int var5 = this.field3222;
      int var6 = this.field3223;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field3221;
      int var10 = this.field3226;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field3220 > 0) {
         var13 = ((this.field3220 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field3220 << 16);
      }

      if (this.field3225 > 0) {
         var13 = ((this.field3225 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field3225 << 16);
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

      method1998(class156.field1650, this.field3224, this.field3227, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   static void method1997(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method1998(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
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
}
