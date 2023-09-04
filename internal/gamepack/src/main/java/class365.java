public class class365 extends class70 {
   static boolean field2649 = false;
   static boolean[] field2631;
   static class148[] field2627;
   static class216 field2624 = new class216();
   static class310[] field2628;
   static class411[] field2630;
   static class50[] field2629;
   static float[] field2634;
   static float[] field2640;
   static float[] field2642;
   static float[] field2643;
   static float[] field2644;
   static float[] field2648;
   static int field2625;
   static int field2626;
   static int[] field2620;
   static int[] field2632;
   static int[] field2645;
   boolean field2623;
   boolean field2638;
   byte[] field2647;
   byte[][] field2637;
   float[] field2639;
   float[] field2641;
   int field2618;
   int field2619;
   int field2621;
   int field2622;
   int field2633;
   int field2635;
   int field2636;
   int field2646;

   class365(byte[] var1) {
      this.method1633(var1);
   }

   void method1633(byte[] var1) {
      class366 var2 = new class366(var1);
      this.field2646 = var2.method1658();
      this.field2619 = var2.method1658();
      this.field2621 = var2.method1658();
      this.field2622 = var2.method1658();
      if (this.field2622 < 0) {
         this.field2622 = ~this.field2622;
         this.field2623 = true;
      }

      int var3 = var2.method1658();
      this.field2637 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method1654();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method1664(var7, 0, var5);
         this.field2637[var4] = var7;
      }

   }

   float[] method1635(int var1) {
      class216 var2 = new class216();
      var2.method1102(this.field2637[var1], 0);
      this.field2641 = new float[field2626];
      var2.method1101();
      int var3 = var2.method1100(class32.method138(field2632.length - 1));
      boolean var4 = field2631[var3];
      int var5 = var4 ? field2626 : field2625;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.method1101() != 0;
         var7 = var2.method1101() != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (field2625 >> 2);
         var10 = (var5 >> 2) + (field2625 >> 2);
         var11 = field2625 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field2625 >> 2);
         var13 = var5 - (var5 >> 2) + (field2625 >> 2);
         var14 = field2625 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      class411 var15 = field2630[field2632[var3]];
      int var16 = var15.field2891;
      int var17 = var15.field2893[var16];
      class274 var18 = field2628[var17].method1416(var2);
      boolean var19 = !var18.method1285();

      int var20;
      for(var20 = 0; var20 < var15.field2892; ++var20) {
         class50 var21 = field2629[var15.field2894[var20]];
         float[] var22 = this.field2641;
         var21.method217(var22, var5 >> 1, var19, var2);
      }

      if (var18.method1285()) {
         var16 = var15.field2891;
         int var10000 = var15.field2893[var16];
         var18.method1284(this.field2641, var5 >> 1);
      }

      int var43;
      int var46;
      if (!var18.method1285()) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.field2641[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.field2641;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? field2642 : field2648;
         float[] var25 = var4 ? field2643 : field2640;
         float[] var26 = var4 ? field2644 : field2634;
         int[] var27 = var4 ? field2620 : field2645;

         int var28;
         float var29;
         float var30;
         float var31;
         float var32;
         for(var28 = 0; var28 < var43; ++var28) {
            var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
            var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
            var31 = var48[var28 * 2];
            var32 = var48[var28 * 2 + 1];
            var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
            var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
         }

         float var33;
         float var34;
         for(var28 = 0; var28 < var46; ++var28) {
            var29 = var23[var20 + 3 + var28 * 4];
            var30 = var23[var20 + 1 + var28 * 4];
            var31 = var23[var28 * 4 + 3];
            var32 = var23[var28 * 4 + 1];
            var23[var20 + 3 + var28 * 4] = var29 + var31;
            var23[var20 + 1 + var28 * 4] = var30 + var32;
            var33 = var48[var20 - 4 - var28 * 4];
            var34 = var48[var20 - 3 - var28 * 4];
            var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
            var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
         }

         var28 = class32.method138(var5 - 1);

         int var49;
         int var50;
         int var51;
         int var52;
         for(var49 = 0; var49 < var28 - 3; ++var49) {
            var50 = var5 >> var49 + 2;
            var51 = 8 << var49;

            for(var52 = 0; var52 < 2 << var49; ++var52) {
               int var53 = var5 - var50 * 2 * var52;
               int var54 = var5 - var50 * (var52 * 2 + 1);

               for(int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
                  int var36 = var35 * 4;
                  float var37 = var23[var53 - 1 - var36];
                  float var38 = var23[var53 - 3 - var36];
                  float var39 = var23[var54 - 1 - var36];
                  float var40 = var23[var54 - 3 - var36];
                  var23[var53 - 1 - var36] = var37 + var39;
                  var23[var53 - 3 - var36] = var38 + var40;
                  float var41 = var48[var35 * var51];
                  float var42 = var48[var35 * var51 + 1];
                  var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                  var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
               }
            }
         }

         for(var49 = 1; var49 < var46 - 1; ++var49) {
            var50 = var27[var49];
            if (var49 < var50) {
               var51 = var49 * 8;
               var52 = var50 * 8;
               var33 = var23[var51 + 1];
               var23[var51 + 1] = var23[var52 + 1];
               var23[var52 + 1] = var33;
               var33 = var23[var51 + 3];
               var23[var51 + 3] = var23[var52 + 3];
               var23[var52 + 3] = var33;
               var33 = var23[var51 + 5];
               var23[var51 + 5] = var23[var52 + 5];
               var23[var52 + 5] = var33;
               var33 = var23[var51 + 7];
               var23[var51 + 7] = var23[var52 + 7];
               var23[var52 + 7] = var33;
            }
         }

         for(var49 = 0; var49 < var20; ++var49) {
            var23[var49] = var23[var49 * 2 + 1];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
            var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
            var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
            var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
         }

         for(var49 = 0; var49 < var46; ++var49) {
            var30 = var26[var49 * 2];
            var31 = var26[var49 * 2 + 1];
            var32 = var23[var20 + var49 * 2];
            var33 = var23[var20 + var49 * 2 + 1];
            var34 = var23[var5 - 2 - var49 * 2];
            float var55 = var23[var5 - 1 - var49 * 2];
            float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
            var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
            var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
            var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
            var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
            var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[var49 * 2 + var20] * var25[var49 * 2] + var23[var49 * 2 + 1 + var20] * var25[var49 * 2 + 1];
            var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var23[var49 * 2 + 1 + var20] * var25[var49 * 2];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var5 - var43 + var49] = -var23[var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var49] = var23[var43 + var49];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var43 + var49] = -var23[var43 - var49 - 1];
         }

         for(var49 = 0; var49 < var43; ++var49) {
            var23[var20 + var49] = var23[var5 - var49 - 1];
         }

         float[] var57;
         for(var49 = var9; var49 < var10; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var9) + 0.5) / (double)var11 * 0.5 * Math.PI);
            var57 = this.field2641;
            var57[var49] *= (float)Math.sin(1.5707963267948966 * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5) / (double)var14 * 0.5 * Math.PI + 1.5707963267948966);
            var57 = this.field2641;
            var57[var49] *= (float)Math.sin(1.5707963267948966 * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.field2635 > 0) {
         var43 = this.field2635 + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.field2638) {
            for(var46 = 0; var46 < this.field2636; ++var46) {
               var47 = (this.field2635 >> 1) + var46;
               var44[var46] += this.field2639[var47];
            }
         }

         if (var18.method1285()) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.field2641[var46];
            }
         }
      }

      float[] var45 = this.field2639;
      this.field2639 = this.field2641;
      this.field2641 = var45;
      this.field2635 = var5;
      this.field2636 = var13 - (var5 >> 1);
      this.field2638 = !var18.method1285();
      return var44;
   }

   class404 method1638(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field2647 == null) {
            this.field2635 = 0;
            this.field2639 = new float[field2626];
            this.field2647 = new byte[this.field2619];
            this.field2618 = 0;
            this.field2633 = 0;
         }

         for(; this.field2633 < this.field2637.length; ++this.field2633) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1635(this.field2633);
            if (var2 != null) {
               int var3 = this.field2618;
               int var4 = var2.length;
               if (var4 > this.field2619 - var3) {
                  var4 = this.field2619 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field2647[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field2618;
               }

               this.field2618 = var3;
            }
         }

         this.field2639 = null;
         byte[] var7 = this.field2647;
         this.field2647 = null;
         return new class404(this.field2646, var7, this.field2621, this.field2622, this.field2623);
      }
   }

   static float method1639(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   static void method1634(byte[] var0) {
      class216 var1 = field2624;
      var1.method1102(var0, 0);
      field2625 = 1 << var1.method1100(4);
      field2626 = 1 << var1.method1100(4);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? field2626 : field2625;
         var4 = var3 >> 1;
         var5 = var3 >> 2;
         var6 = var3 >> 3;
         float[] var7 = new float[var4];

         for(int var8 = 0; var8 < var5; ++var8) {
            var7[var8 * 2] = (float)Math.cos((double)(var8 * 4) * Math.PI / (double)var3);
            var7[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * Math.PI / (double)var3));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * Math.PI / (double)(var3 * 2));
            var20[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * Math.PI / (double)(var3 * 2));
         }

         float[] var21 = new float[var5];

         for(int var10 = 0; var10 < var6; ++var10) {
            var21[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * Math.PI / (double)var3);
            var21[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * Math.PI / (double)var3));
         }

         int[] var22 = new int[var6];
         int var11 = class32.method138(var6 - 1);

         for(int var12 = 0; var12 < var6; ++var12) {
            int var16 = var12;
            int var17 = var11;

            int var18;
            for(var18 = 0; var17 > 0; --var17) {
               var18 = var18 << 1 | var16 & 1;
               var16 >>>= 1;
            }

            var22[var12] = var18;
         }

         if (var2 != 0) {
            field2642 = var7;
            field2643 = var20;
            field2644 = var21;
            field2620 = var22;
         } else {
            field2648 = var7;
            field2640 = var20;
            field2634 = var21;
            field2645 = var22;
         }
      }

      var2 = var1.method1100(8) + 1;
      field2627 = new class148[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field2627[var3] = new class148();
      }

      var3 = var1.method1100(6) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.method1100(16);
      }

      var3 = var1.method1100(6) + 1;
      field2628 = new class310[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field2628[var4] = new class310();
      }

      var4 = var1.method1100(6) + 1;
      field2629 = new class50[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field2629[var5] = new class50();
      }

      var5 = var1.method1100(6) + 1;
      field2630 = new class411[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         field2630[var6] = new class411();
      }

      var6 = var1.method1100(6) + 1;
      field2631 = new boolean[var6];
      field2632 = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         field2631[var19] = var1.method1101() != 0;
         var1.method1100(16);
         var1.method1100(16);
         field2632[var19] = var1.method1100(8);
      }

   }

   static boolean method1636(class509 var0) {
      if (!field2649) {
         byte[] var1 = var0.method2422(0, 0);
         if (var1 == null) {
            return false;
         }

         method1634(var1);
         field2649 = true;
      }

      return true;
   }

   static class365 method1637(class509 var0, int var1, int var2) {
      if (!method1636(var0)) {
         var0.method2424(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method2422(var1, var2);
         return var3 == null ? null : new class365(var3);
      }
   }
}
