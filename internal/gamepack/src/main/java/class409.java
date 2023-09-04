public class class409 extends class70 {
   static int[] field2887;
   boolean field2878;
   boolean field2884 = false;
   int field2877;
   int field2883;
   int field2886;
   int[] field2879;
   int[] field2880;
   int[] field2881;
   int[] field2882;
   int[] field2885;

   class409(class366 var1) {
      this.field2877 = var1.method1703();
      this.field2878 = var1.method1654() == 1;
      int var2 = var1.method1654();
      if (var2 >= 1 && var2 > 4) {
      }

      this.field2879 = new int[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         this.field2879[var3] = var1.method1703();
      }

      if (var2 > 1) {
         this.field2880 = new int[var2 - 1];

         for(var3 = 0; var3 < var2 - 1; ++var3) {
            this.field2880[var3] = var1.method1654();
         }
      }

      if (var2 > 1) {
         this.field2881 = new int[var2 - 1];

         for(var3 = 0; var3 < var2 - 1; ++var3) {
            this.field2881[var3] = var1.method1654();
         }
      }

      this.field2882 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2882[var3] = var1.method1658();
      }

      this.field2883 = var1.method1654();
      this.field2886 = var1.method1654();
      this.field2885 = null;
   }

   boolean method1892(double var1, int var3, class509 var4) {
      int var5;
      for(var5 = 0; var5 < this.field2879.length; ++var5) {
         if (var4.method2431(this.field2879[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field2885 = new int[var5];

      for(int var6 = 0; var6 < this.field2879.length; ++var6) {
         int var8 = this.field2879[var6];
         class501 var7;
         if (!class382.method1763(var4, var8)) {
            var7 = null;
         } else {
            var7 = class382.method1772();
         }

         var7.method2389();
         byte[] var10 = var7.field4007;
         int[] var11 = var7.field4010;
         int var12 = this.field2882[var6];
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
            var11[var13] = class480.method2278(var11[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.field2880[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.field4005 == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.field2885[var14] = var11[var10[var14] & 255];
               }
            } else if (var7.field4005 == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field2885[var14++] = var11[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.field4005 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field2885[var14++] = var11[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

   void method1890() {
      this.field2885 = null;
   }

   void method1891(int var1) {
      if (this.field2885 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field2883 == 1 || this.field2883 == 3) {
            if (field2887 == null || field2887.length < this.field2885.length) {
               field2887 = new int[this.field2885.length];
            }

            if (this.field2885.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field2885.length;
            var4 = var2 * var1 * this.field2886;
            var5 = var3 - 1;
            if (this.field2883 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field2887[var6] = this.field2885[var7];
            }

            var10 = this.field2885;
            this.field2885 = field2887;
            field2887 = var10;
         }

         if (this.field2883 == 2 || this.field2883 == 4) {
            if (field2887 == null || field2887.length < this.field2885.length) {
               field2887 = new int[this.field2885.length];
            }

            if (this.field2885.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field2885.length;
            var4 = var1 * this.field2886;
            var5 = var2 - 1;
            if (this.field2883 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field2887[var8] = this.field2885[var9];
               }
            }

            var10 = this.field2885;
            this.field2885 = field2887;
            field2887 = var10;
         }

      }
   }
}
