public class class187 extends class55 {
   static int[] field1854;
   boolean field1845;
   boolean field1851 = false;
   int field1844;
   int field1850;
   int field1853;
   int[] field1846;
   int[] field1847;
   int[] field1848;
   int[] field1849;
   int[] field1852;

   class187(class184 var1) {
      this.field1844 = var1.method1174();
      this.field1845 = var1.method1125() == 1;
      int var2 = var1.method1125();
      if (var2 >= 1 && var2 > 4) {
      }

      this.field1846 = new int[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.field1846[var3] = var1.method1174();
      }

      if (var2 > 1) {
         this.field1847 = new int[var2 - 1];

         for(var3 = 0; var3 < var2 - 1; ++var3) {
            this.field1847[var3] = var1.method1125();
         }
      }

      if (var2 > 1) {
         this.field1848 = new int[var2 - 1];

         for(var3 = 0; var3 < var2 - 1; ++var3) {
            this.field1848[var3] = var1.method1125();
         }
      }

      this.field1849 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field1849[var3] = var1.method1129();
      }

      this.field1850 = var1.method1125();
      this.field1853 = var1.method1125();
      this.field1852 = null;
   }

   boolean method1194(double var1, int var3, class298 var4) {
      int var5;
      for(var5 = 0; var5 < this.field1846.length; ++var5) {
         if (var4.method1638(this.field1846[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field1852 = new int[var5];

      for(int var6 = 0; var6 < this.field1846.length; ++var6) {
         int var8 = this.field1846[var6];
         class425 var7;
         if (!class398.method1923(var4, var8)) {
            var7 = null;
         } else {
            var7 = class398.method1932();
         }

         var7.method1995();
         byte[] var10 = var7.field3224;
         int[] var11 = var7.field3227;
         int var12 = this.field1849[var6];
         if ((var12 & -16777216) == 16777216) {
         }

         if ((var12 & -16777216) == 33554432) {
         }

         int var13;
         int var14;
         int var15;
         int var16;
         if ((var12 & -16777216) == 50331648) {
            var13 = var12 & 16711935;
            var14 = var12 >> 8 & 255;

            for(var15 = 0; var15 < var11.length; ++var15) {
               var16 = var11[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var11.length; ++var13) {
            var11[var13] = class399.method1951(var11[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.field1847[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.field3222 == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.field1852[var14] = var11[var10[var14] & 255];
               }
            } else if (var7.field3222 == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field1852[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.field3222 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field1852[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var13 == 1) {
         }

         if (var13 == 2) {
         }

         if (var13 == 3) {
         }
      }

      return true;
   }

   void method1192() {
      this.field1852 = null;
   }

   void method1193(int var1) {
      if (this.field1852 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field1850 == 1 || this.field1850 == 3) {
            if (field1854 == null || field1854.length < this.field1852.length) {
               field1854 = new int[this.field1852.length];
            }

            if (this.field1852.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1852.length;
            var4 = var2 * var1 * this.field1853;
            var5 = var3 - 1;
            if (this.field1850 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field1854[var6] = this.field1852[var7];
            }

            var10 = this.field1852;
            this.field1852 = field1854;
            field1854 = var10;
         }

         if (this.field1850 == 2 || this.field1850 == 4) {
            if (field1854 == null || field1854.length < this.field1852.length) {
               field1854 = new int[this.field1852.length];
            }

            if (this.field1852.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field1852.length;
            var4 = var1 * this.field1853;
            var5 = var2 - 1;
            if (this.field1850 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field1854[var8] = this.field1852[var9];
               }
            }

            var10 = this.field1852;
            this.field1852 = field1854;
            field1854 = var10;
         }

      }
   }
}
