public final class class501 extends class427 {
   public byte[] field4007;
   public int field4003;
   public int field4004;
   public int field4005;
   public int field4006;
   public int field4008;
   public int field4009;
   public int[] field4010;

   class501() {
   }

   public void method2389() {
      if (this.field4005 != this.field4004 || this.field4006 != this.field4009) {
         byte[] var1 = new byte[this.field4004 * this.field4009];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field4006; ++var3) {
            for(int var4 = 0; var4 < this.field4005; ++var4) {
               var1[var4 + this.field4003 + (var3 + this.field4008) * this.field4004] = this.field4007[var2++];
            }
         }

         this.field4007 = var1;
         this.field4005 = this.field4004;
         this.field4006 = this.field4009;
         this.field4003 = 0;
         this.field4008 = 0;
      }
   }

   public void method2390(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field4010.length; ++var4) {
         int var5 = this.field4010[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field4010[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field4010[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field4010[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void method2394(int var1, int var2) {
      var1 += this.field4003;
      var2 += this.field4008;
      int var3 = var1 + var2 * class427.field3331;
      int var4 = 0;
      int var5 = this.field4006;
      int var6 = this.field4005;
      int var7 = class427.field3331 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class427.field3337) {
         var9 = class427.field3337 - var2;
         var5 -= var9;
         var2 = class427.field3337;
         var4 += var9 * var6;
         var3 += var9 * class427.field3331;
      }

      if (var2 + var5 > class427.field3335) {
         var5 -= var2 + var5 - class427.field3335;
      }

      if (var1 < class427.field3336) {
         var9 = class427.field3336 - var1;
         var6 -= var9;
         var1 = class427.field3336;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > class427.field3330) {
         var9 = var1 + var6 - class427.field3330;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method2391(class427.field3333, this.field4007, this.field4010, var4, var3, var6, var5, var7, var8);
      }
   }

   public void method2393(int var1, int var2, int var3, int var4) {
      int var5 = this.field4005;
      int var6 = this.field4006;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field4004;
      int var10 = this.field4009;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field4003 > 0) {
         var13 = ((this.field4003 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field4003 << 16);
      }

      if (this.field4008 > 0) {
         var13 = ((this.field4008 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field4008 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * class427.field3331;
      int var14 = class427.field3331 - var3;
      if (var2 + var4 > class427.field3335) {
         var4 -= var2 + var4 - class427.field3335;
      }

      int var15;
      if (var2 < class427.field3337) {
         var15 = class427.field3337 - var2;
         var4 -= var15;
         var13 += var15 * class427.field3331;
         var8 += var12 * var15;
      }

      if (var1 + var3 > class427.field3330) {
         var15 = var1 + var3 - class427.field3330;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < class427.field3336) {
         var15 = class427.field3336 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method2392(class427.field3333, this.field4007, this.field4010, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   static void method2391(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void method2392(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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
