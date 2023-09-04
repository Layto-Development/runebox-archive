public class class223 extends class55 {
   static boolean field2075 = false;
   static boolean[] field2057;
   static class224[] field2055;
   static class225 field2050 = new class225();
   static class36[] field2053;
   static class436[] field2054;
   static class500[] field2056;
   static float[] field2060;
   static float[] field2066;
   static float[] field2068;
   static float[] field2069;
   static float[] field2070;
   static float[] field2074;
   static int field2051;
   static int field2052;
   static int[] field2046;
   static int[] field2058;
   static int[] field2071;
   boolean field2049;
   boolean field2064;
   byte[] field2073;
   byte[][] field2063;
   float[] field2065;
   float[] field2067;
   int field2044;
   int field2045;
   int field2047;
   int field2048;
   int field2059;
   int field2061;
   int field2062;
   int field2072;

   class223(byte[] var1) {
      this.method1324(var1);
   }

   void method1324(byte[] var1) {
      class184 var2 = new class184(var1);
      this.field2072 = var2.method1129();
      this.field2045 = var2.method1129();
      this.field2047 = var2.method1129();
      this.field2048 = var2.method1129();
      if (this.field2048 < 0) {
         this.field2048 = ~this.field2048;
         this.field2049 = true;
      }

      int var3 = var2.method1129();
      this.field2063 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method1125();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method1135(var7, 0, var5);
         this.field2063[var4] = var7;
      }

   }

   float[] method1326(int var1) {
      class225 var2 = new class225();
      var2.method1334(this.field2063[var1], 0);
      this.field2067 = new float[field2052];
      var2.method1333();
      int var3 = var2.method1332(class349.method1803(field2058.length - 1));
      boolean var4 = field2057[var3];
      int var5 = var4 ? field2052 : field2051;
      boolean var6 = false;
      boolean var7 = false;
      if (var4) {
         var6 = var2.method1333() != 0;
         var7 = var2.method1333() != 0;
      }

      int var8 = var5 >> 1;
      int var9;
      int var10;
      int var11;
      if (var4 && !var6) {
         var9 = (var5 >> 2) - (field2051 >> 2);
         var10 = (var5 >> 2) + (field2051 >> 2);
         var11 = field2051 >> 1;
      } else {
         var9 = 0;
         var10 = var8;
         var11 = var5 >> 1;
      }

      int var12;
      int var13;
      int var14;
      if (var4 && !var7) {
         var12 = var5 - (var5 >> 2) - (field2051 >> 2);
         var13 = var5 - (var5 >> 2) + (field2051 >> 2);
         var14 = field2051 >> 1;
      } else {
         var12 = var8;
         var13 = var5;
         var14 = var5 >> 1;
      }

      class500 var15 = field2056[field2058[var3]];
      int var16 = var15.field3943;
      int var17 = var15.field3945[var16];
      class112 var18 = field2054[var17].method2140(var2);
      boolean var19 = !var18.method807();

      int var20;
      for(var20 = 0; var20 < var15.field3944; ++var20) {
         class224 var21 = field2055[var15.field3946[var20]];
         float[] var22 = this.field2067;
         var21.method1331(var22, var5 >> 1, var19, var2);
      }

      if (var18.method807()) {
         var16 = var15.field3943;
         int var10000 = var15.field3945[var16];
         var18.method806(this.field2067, var5 >> 1);
      }

      int var43;
      int var46;
      if (!var18.method807()) {
         for(var20 = var5 >> 1; var20 < var5; ++var20) {
            this.field2067[var20] = 0.0F;
         }
      } else {
         var20 = var5 >> 1;
         var43 = var5 >> 2;
         var46 = var5 >> 3;
         float[] var23 = this.field2067;

         int var24;
         for(var24 = 0; var24 < var20; ++var24) {
            var23[var24] *= 0.5F;
         }

         for(var24 = var20; var24 < var5; ++var24) {
            var23[var24] = -var23[var5 - var24 - 1];
         }

         float[] var48 = var4 ? field2068 : field2074;
         float[] var25 = var4 ? field2069 : field2066;
         float[] var26 = var4 ? field2070 : field2060;
         int[] var27 = var4 ? field2046 : field2071;

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

         var28 = class349.method1803(var5 - 1);

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
            var57 = this.field2067;
            var57[var49] *= (float)Math.sin(1.5707963267948966 * (double)var30 * (double)var30);
         }

         for(var49 = var12; var49 < var13; ++var49) {
            var30 = (float)Math.sin(((double)(var49 - var12) + 0.5) / (double)var14 * 0.5 * Math.PI + 1.5707963267948966);
            var57 = this.field2067;
            var57[var49] *= (float)Math.sin(1.5707963267948966 * (double)var30 * (double)var30);
         }
      }

      float[] var44 = null;
      if (this.field2061 > 0) {
         var43 = this.field2061 + var5 >> 2;
         var44 = new float[var43];
         int var47;
         if (!this.field2064) {
            for(var46 = 0; var46 < this.field2062; ++var46) {
               var47 = (this.field2061 >> 1) + var46;
               var44[var46] += this.field2065[var47];
            }
         }

         if (var18.method807()) {
            for(var46 = var9; var46 < var5 >> 1; ++var46) {
               var47 = var44.length - (var5 >> 1) + var46;
               var44[var47] += this.field2067[var46];
            }
         }
      }

      float[] var45 = this.field2065;
      this.field2065 = this.field2067;
      this.field2067 = var45;
      this.field2061 = var5;
      this.field2062 = var13 - (var5 >> 1);
      this.field2064 = !var18.method807();
      return var44;
   }

   class408 method1329(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field2073 == null) {
            this.field2061 = 0;
            this.field2065 = new float[field2052];
            this.field2073 = new byte[this.field2045];
            this.field2044 = 0;
            this.field2059 = 0;
         }

         for(; this.field2059 < this.field2063.length; ++this.field2059) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1326(this.field2059);
            if (var2 != null) {
               int var3 = this.field2044;
               int var4 = var2.length;
               if (var4 > this.field2045 - var3) {
                  var4 = this.field2045 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field2073[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field2044;
               }

               this.field2044 = var3;
            }
         }

         this.field2065 = null;
         byte[] var7 = this.field2073;
         this.field2073 = null;
         return new class408(this.field2072, var7, this.field2047, this.field2048, this.field2049);
      }
   }

   static float method1330(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
   }

   static void method1325(byte[] var0) {
      class225 var1 = field2050;
      var1.method1334(var0, 0);
      field2051 = 1 << var1.method1332(4);
      field2052 = 1 << var1.method1332(4);

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      for(var2 = 0; var2 < 2; ++var2) {
         var3 = var2 != 0 ? field2052 : field2051;
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
         int var11 = class349.method1803(var6 - 1);

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
            field2068 = var7;
            field2069 = var20;
            field2070 = var21;
            field2046 = var22;
         } else {
            field2074 = var7;
            field2066 = var20;
            field2060 = var21;
            field2071 = var22;
         }
      }

      var2 = var1.method1332(8) + 1;
      field2053 = new class36[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field2053[var3] = new class36();
      }

      var3 = var1.method1332(6) + 1;

      for(var4 = 0; var4 < var3; ++var4) {
         var1.method1332(16);
      }

      var3 = var1.method1332(6) + 1;
      field2054 = new class436[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field2054[var4] = new class436();
      }

      var4 = var1.method1332(6) + 1;
      field2055 = new class224[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field2055[var5] = new class224();
      }

      var5 = var1.method1332(6) + 1;
      field2056 = new class500[var5];

      for(var6 = 0; var6 < var5; ++var6) {
         field2056[var6] = new class500();
      }

      var6 = var1.method1332(6) + 1;
      field2057 = new boolean[var6];
      field2058 = new int[var6];

      for(int var19 = 0; var19 < var6; ++var19) {
         field2057[var19] = var1.method1333() != 0;
         var1.method1332(16);
         var1.method1332(16);
         field2058[var19] = var1.method1332(8);
      }

   }

   static boolean method1327(class298 var0) {
      if (!field2075) {
         byte[] var1 = var0.method1629(0, 0);
         if (var1 == null) {
            return false;
         }

         method1325(var1);
         field2075 = true;
      }

      return true;
   }

   static class223 method1328(class298 var0, int var1, int var2) {
      if (!method1327(var0)) {
         var0.method1631(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method1629(var1, var2);
         return var3 == null ? null : new class223(var3);
      }
   }
}
