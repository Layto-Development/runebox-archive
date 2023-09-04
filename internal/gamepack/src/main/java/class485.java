import java.util.Arrays;
import java.util.HashMap;

public class class485 extends class165 {
   static boolean field3893 = true;
   static boolean[] field3869 = new boolean[6500];
   static boolean[] field3870 = new boolean[6500];
   static byte[] field3835 = new byte[1];
   static byte[] field3899 = new byte[1];
   static char[] field3879 = new char[6000];
   static char[][] field3880 = new char[6000][512];
   static class475 field3836 = new class475();
   static class475 field3837 = new class475();
   static class475 field3838 = new class475();
   static class485 field3834 = new class485();
   static class485 field3873 = new class485();
   static float[] field3877 = new float[6500];
   static float[] field3891 = new float[10];
   static int field3890;
   static int field3892;
   static int field3903;
   static int[] field3839 = new int[2000];
   static int[] field3861;
   static int[] field3871 = new int[6500];
   static int[] field3872 = new int[6500];
   static int[] field3874 = new int[6500];
   static int[] field3875 = new int[6500];
   static int[] field3876 = new int[6500];
   static int[] field3881 = new int[12];
   static int[] field3882 = new int[6500];
   static int[] field3883 = new int[2000];
   static int[] field3885 = new int[12];
   static int[] field3886 = new int[10];
   static int[] field3887 = new int[10];
   static int[] field3888 = new int[10];
   static int[] field3895;
   static int[] field3896;
   static int[] field3897;
   static int[][] field3878 = new int[12][2000];
   static final float field3900;
   byte[] field3850;
   byte[] field3851;
   byte[] field3901;
   int field3862;
   int field3863;
   int field3864;
   int field3865;
   int field3889;
   int[] field3840;
   int[] field3841;
   int[] field3844;
   int[] field3845;
   int[] field3846;
   int[] field3847;
   int[] field3848;
   int[] field3849;
   int[] field3855;
   int[] field3856;
   int[] field3857;
   int[] field3902;
   int[][] field3858;
   int[][] field3859;
   int[][] field3860;
   int[][] field3884;
   HashMap field3867 = new HashMap();
   short[] field3852;
   public boolean field3843 = false;
   public byte field3853 = 0;
   public byte field3866;
   public byte field3868;
   public byte field3898;
   public byte field3904;
   public int field3842 = 0;
   public int field3854 = 0;
   public int field3894 = 0;
   public short field3905;

   static {
      field3895 = class480.field3795;
      field3896 = class480.field3793;
      field3897 = class480.field3792;
      field3861 = class480.field3794;
      field3900 = class370.method1734(50);
   }

   class485() {
   }

   public class485(class485[] var1, int var2) {
      this.field3894 = 0;
      this.field3842 = 0;
      this.field3854 = 0;
      this.field3853 = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         class485 var4 = var1[var3];
         if (var4 != null) {
            this.field3894 += var4.field3894;
            this.field3842 += var4.field3842;
            this.field3854 += var4.field3854;
            if (this.field3853 == -1) {
               this.field3853 = var4.field3853;
            }
         }
      }

      this.method2289(this.field3894, this.field3842, this.field3854);
      this.field3894 = 0;
      this.field3842 = 0;
      this.field3854 = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.method2315(var1[var3]);
      }

   }

   public class485(int var1, int var2, int var3, byte var4) {
      this.method2289(var1, var2, var3);
      this.field3853 = var4;
      this.field3894 = 0;
      this.field3842 = 0;
      this.field3854 = 0;
   }

   void method2289(int var1, int var2, int var3) {
      this.field3840 = new int[var1];
      this.field3841 = new int[var1];
      this.field3845 = new int[var1];
      this.field3857 = new int[var2];
      this.field3844 = new int[var2];
      this.field3902 = new int[var2];
      this.field3846 = new int[var2];
      this.field3847 = new int[var2];
      this.field3848 = new int[var2];
      if (var3 > 0) {
         this.field3855 = new int[var3];
         this.field3856 = new int[var3];
         this.field3849 = new int[var3];
      }

   }

   void method2320(class485 var1) {
      int var2 = this.field3857.length;
      if (this.field3901 == null && (var1.field3901 != null || this.field3853 != var1.field3853)) {
         this.field3901 = new byte[var2];
         Arrays.fill(this.field3901, this.field3853);
      }

      if (this.field3850 == null && var1.field3850 != null) {
         this.field3850 = new byte[var2];
         Arrays.fill(this.field3850, (byte)0);
      }

      if (this.field3852 == null && var1.field3852 != null) {
         this.field3852 = new short[var2];
         Arrays.fill(this.field3852, (short)-1);
      }

      if (this.field3851 == null && var1.field3851 != null) {
         this.field3851 = new byte[var2];
         Arrays.fill(this.field3851, (byte)-1);
      }

   }

   public void method2315(class485 var1) {
      if (var1 != null) {
         this.method2320(var1);

         int var2;
         for(var2 = 0; var2 < var1.field3842; ++var2) {
            this.field3857[this.field3842] = var1.field3857[var2] + this.field3894;
            this.field3844[this.field3842] = var1.field3844[var2] + this.field3894;
            this.field3902[this.field3842] = var1.field3902[var2] + this.field3894;
            this.field3846[this.field3842] = var1.field3846[var2];
            this.field3847[this.field3842] = var1.field3847[var2];
            this.field3848[this.field3842] = var1.field3848[var2];
            if (this.field3901 != null) {
               this.field3901[this.field3842] = var1.field3901 != null ? var1.field3901[var2] : var1.field3853;
            }

            if (this.field3850 != null && var1.field3850 != null) {
               this.field3850[this.field3842] = var1.field3850[var2];
            }

            if (this.field3852 != null) {
               this.field3852[this.field3842] = var1.field3852 != null ? var1.field3852[var2] : -1;
            }

            if (this.field3851 != null) {
               if (var1.field3851 != null && var1.field3851[var2] != -1) {
                  this.field3851[this.field3842] = (byte)(var1.field3851[var2] + this.field3854);
               } else {
                  this.field3851[this.field3842] = -1;
               }
            }

            ++this.field3842;
         }

         for(var2 = 0; var2 < var1.field3854; ++var2) {
            this.field3855[this.field3854] = var1.field3855[var2] + this.field3894;
            this.field3856[this.field3854] = var1.field3856[var2] + this.field3894;
            this.field3849[this.field3854] = var1.field3849[var2] + this.field3894;
            ++this.field3854;
         }

         for(var2 = 0; var2 < var1.field3894; ++var2) {
            this.field3840[this.field3894] = var1.field3840[var2];
            this.field3841[this.field3894] = var1.field3841[var2];
            this.field3845[this.field3894] = var1.field3845[var2];
            ++this.field3894;
         }

      }
   }

   public class485 method2291(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2293();
      int var7 = var2 - this.field3864;
      int var8 = var2 + this.field3864;
      int var9 = var4 - this.field3864;
      int var10 = var4 + this.field3864;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class485 var11;
            if (var5) {
               var11 = new class485();
               var11.field3894 = this.field3894;
               var11.field3842 = this.field3842;
               var11.field3854 = this.field3854;
               var11.field3840 = this.field3840;
               var11.field3845 = this.field3845;
               var11.field3857 = this.field3857;
               var11.field3844 = this.field3844;
               var11.field3902 = this.field3902;
               var11.field3846 = this.field3846;
               var11.field3847 = this.field3847;
               var11.field3848 = this.field3848;
               var11.field3901 = this.field3901;
               var11.field3850 = this.field3850;
               var11.field3851 = this.field3851;
               var11.field3852 = this.field3852;
               var11.field3853 = this.field3853;
               var11.field3855 = this.field3855;
               var11.field3856 = this.field3856;
               var11.field3849 = this.field3849;
               var11.field3858 = this.field3858;
               var11.field3859 = this.field3859;
               var11.field3843 = this.field3843;
               var11.field3841 = new int[var11.field3894];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field3894; ++var12) {
                  var13 = this.field3840[var12] + var2;
                  var14 = this.field3845[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field3841[var12] = this.field3841[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field3894; ++var12) {
                  var13 = (-this.field3841[var12] << 16) / super.field1058;
                  if (var13 < var6) {
                     var14 = this.field3840[var12] + var2;
                     var15 = this.field3845[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field3841[var12] = this.field3841[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method2296();
            return var11;
         }
      } else {
         return this;
      }
   }

   public class485 method2292(boolean var1) {
      if (!var1 && field3899.length < this.field3842) {
         field3899 = new byte[this.field3842 + 100];
      }

      return this.method2314(var1, field3873, field3899);
   }

   public class485 method2318(boolean var1) {
      if (!var1 && field3835.length < this.field3842) {
         field3835 = new byte[this.field3842 + 100];
      }

      return this.method2314(var1, field3834, field3835);
   }

   class485 method2314(boolean var1, class485 var2, byte[] var3) {
      var2.field3894 = this.field3894;
      var2.field3842 = this.field3842;
      var2.field3854 = this.field3854;
      if (var2.field3840 == null || var2.field3840.length < this.field3894) {
         var2.field3840 = new int[this.field3894 + 100];
         var2.field3841 = new int[this.field3894 + 100];
         var2.field3845 = new int[this.field3894 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field3894; ++var4) {
         var2.field3840[var4] = this.field3840[var4];
         var2.field3841[var4] = this.field3841[var4];
         var2.field3845[var4] = this.field3845[var4];
      }

      if (var1) {
         var2.field3850 = this.field3850;
      } else {
         var2.field3850 = var3;
         if (this.field3850 == null) {
            for(var4 = 0; var4 < this.field3842; ++var4) {
               var2.field3850[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field3842; ++var4) {
               var2.field3850[var4] = this.field3850[var4];
            }
         }
      }

      var2.field3857 = this.field3857;
      var2.field3844 = this.field3844;
      var2.field3902 = this.field3902;
      var2.field3846 = this.field3846;
      var2.field3847 = this.field3847;
      var2.field3848 = this.field3848;
      var2.field3901 = this.field3901;
      var2.field3851 = this.field3851;
      var2.field3852 = this.field3852;
      var2.field3853 = this.field3853;
      var2.field3855 = this.field3855;
      var2.field3856 = this.field3856;
      var2.field3849 = this.field3849;
      var2.field3858 = this.field3858;
      var2.field3859 = this.field3859;
      var2.field3860 = this.field3860;
      var2.field3884 = this.field3884;
      var2.field3843 = this.field3843;
      var2.method2296();
      var2.field3904 = 0;
      return var2;
   }

   void method2322(int var1) {
      if (!this.field3867.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field3896[var1];
         int var9 = field3895[var1];

         for(int var10 = 0; var10 < this.field3894; ++var10) {
            int var12 = this.field3840[var10];
            int var13 = this.field3845[var10];
            int var11 = var12 * var8 + var13 * var9 >> 16;
            int var15 = this.field3841[var10];
            int var17 = this.field3840[var10];
            int var18 = this.field3845[var10];
            int var16 = var18 * var8 - var9 * var17 >> 16;
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var15 < var3) {
               var3 = var15;
            }

            if (var15 > var6) {
               var6 = var15;
            }

            if (var16 < var4) {
               var4 = var16;
            }

            if (var16 > var7) {
               var7 = var16;
            }
         }

         class334 var20 = new class334((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var21 = true;
         if (var20.field2510 < 32) {
            var20.field2510 = 32;
         }

         if (var20.field2512 < 32) {
            var20.field2512 = 32;
         }

         if (this.field3843) {
            boolean var22 = true;
            var20.field2510 += 8;
            var20.field2512 += 8;
         }

         this.field3867.put(var1, var20);
      }
   }

   public void method2293() {
      if (this.field3862 != 1) {
         this.field3862 = 1;
         super.field1058 = 0;
         this.field3863 = 0;
         this.field3864 = 0;

         for(int var1 = 0; var1 < this.field3894; ++var1) {
            int var2 = this.field3840[var1];
            int var3 = this.field3841[var1];
            int var4 = this.field3845[var1];
            if (-var3 > super.field1058) {
               super.field1058 = -var3;
            }

            if (var3 > this.field3863) {
               this.field3863 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field3864) {
               this.field3864 = var5;
            }
         }

         this.field3864 = (int)(Math.sqrt((double)this.field3864) + 0.99);
         this.field3889 = (int)(Math.sqrt((double)(this.field3864 * this.field3864 + super.field1058 * super.field1058)) + 0.99);
         this.field3865 = this.field3889 + (int)(Math.sqrt((double)(this.field3864 * this.field3864 + this.field3863 * this.field3863)) + 0.99);
      }
   }

   void method2321() {
      if (this.field3862 != 2) {
         this.field3862 = 2;
         this.field3864 = 0;

         for(int var1 = 0; var1 < this.field3894; ++var1) {
            int var2 = this.field3840[var1];
            int var3 = this.field3841[var1];
            int var4 = this.field3845[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field3864) {
               this.field3864 = var5;
            }
         }

         this.field3864 = (int)(Math.sqrt((double)this.field3864) + 0.99);
         this.field3889 = this.field3864;
         this.field3865 = this.field3864 + this.field3864;
      }
   }

   public int method2295() {
      this.method2293();
      return this.field3864;
   }

   public void method2296() {
      this.field3862 = 0;
      this.field3867.clear();
   }

   public void method2317(class492 var1, int var2) {
      if (this.field3858 != null) {
         if (var2 != -1) {
            class533 var3 = var1.field3937[var2];
            class344 var4 = var3.field4215;
            field3890 = 0;
            field3903 = 0;
            field3892 = 0;

            for(int var5 = 0; var5 < var3.field4218; ++var5) {
               int var6 = var3.field4217[var5];
               this.method2302(var4.field2560[var6], var4.field2561[var6], var3.field4221[var5], var3.field4222[var5], var3.field4223[var5]);
            }

            this.method2296();
         }
      }
   }

   public void method2297(class272 var1, int var2) {
      class344 var3 = var1.field1910;
      class242 var4 = var3.method1592();
      if (var4 != null) {
         var3.method1592().method1169(var1, var2);
         this.method2323(var3.method1592(), var1.method1275());
      }

      if (var1.method1276()) {
         this.method2298(var1, var2);
      }

      this.method2296();
   }

   void method2298(class272 var1, int var2) {
      class344 var3 = var1.field1910;

      for(int var4 = 0; var4 < var3.field2559; ++var4) {
         int var5 = var3.field2560[var4];
         if (var5 == 5 && var1.field1915 != null && var1.field1915[var4] != null && var1.field1915[var4][0] != null && this.field3859 != null && this.field3850 != null) {
            class137 var6 = var1.field1915[var4][0];
            int[] var7 = var3.field2561[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.field3859.length) {
                  int[] var11 = this.field3859[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.field3850[var13] & 255) + var6.method496(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.field3850[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void method2323(class242 var1, int var2) {
      this.method2316(var1, var2);
   }

   public void method2309(class492 var1, int var2, class492 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class533 var6 = var1.field3937[var2];
            class533 var7 = var3.field3937[var4];
            class344 var8 = var6.field4215;
            field3890 = 0;
            field3903 = 0;
            field3892 = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field4218; ++var11) {
               for(var12 = var6.field4217[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.field2560[var12] == 0) {
                  this.method2302(var8.field2560[var12], var8.field2561[var12], var6.field4221[var11], var6.field4222[var11], var6.field4223[var11]);
               }
            }

            field3890 = 0;
            field3903 = 0;
            field3892 = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.field4218; ++var11) {
               for(var12 = var7.field4217[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.field2560[var12] == 0) {
                  this.method2302(var8.field2560[var12], var8.field2561[var12], var7.field4221[var11], var7.field4222[var11], var7.field4223[var11]);
               }
            }

            this.method2296();
         } else {
            this.method2317(var1, var2);
         }
      }
   }

   public void method2300(class344 var1, class272 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class242 var7 = var1.method1592();
      if (var7 != null) {
         var7.method1170(var2, var3, var4, var5);
         if (var6) {
            this.method2323(var7, var2.method1275());
         }
      }

      if (!var5 && var2.method1276()) {
         this.method2298(var2, var3);
      }

   }

   public void method2301(class492 var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.method2317(var1, var2);
      } else {
         class533 var5 = var1.field3937[var2];
         class344 var6 = var5.field4215;
         int var7 = 0;
         int var8 = var3[var7++];
         field3890 = 0;
         field3903 = 0;
         field3892 = 0;

         for(int var9 = 0; var9 < var5.field4218; ++var9) {
            int var10;
            for(var10 = var5.field4217[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.field2560[var10] == 0) {
                  this.method2302(var6.field2560[var10], var6.field2561[var10], var5.field4221[var9], var5.field4222[var9], var5.field4223[var9]);
               }
            } else if (var10 != var8 || var6.field2560[var10] == 0) {
               this.method2302(var6.field2560[var10], var6.field2561[var10], var5.field4221[var9], var5.field4222[var9], var5.field4223[var9]);
            }
         }

      }
   }

   void method2302(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         field3890 = 0;
         field3903 = 0;
         field3892 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.field3858.length) {
               int[] var19 = this.field3858[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field3890 += this.field3840[var12];
                  field3903 += this.field3841[var12];
                  field3892 += this.field3845[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field3890 = field3890 / var7 + var3;
            field3903 = field3903 / var7 + var4;
            field3892 = field3892 / var7 + var5;
         } else {
            field3890 = var3;
            field3903 = var4;
            field3892 = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field3858.length) {
                  var9 = this.field3858[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field3840;
                     var10000[var11] += var3;
                     var10000 = this.field3841;
                     var10000[var11] += var4;
                     var10000 = this.field3845;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field3858.length) {
                  var9 = this.field3858[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field3840;
                     var10000[var11] -= field3890;
                     var10000 = this.field3841;
                     var10000[var11] -= field3903;
                     var10000 = this.field3845;
                     var10000[var11] -= field3892;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field3895[var14];
                        var16 = field3896[var14];
                        var17 = this.field3841[var11] * var15 + this.field3840[var11] * var16 >> 16;
                        this.field3841[var11] = this.field3841[var11] * var16 - this.field3840[var11] * var15 >> 16;
                        this.field3840[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field3895[var12];
                        var16 = field3896[var12];
                        var17 = this.field3841[var11] * var16 - this.field3845[var11] * var15 >> 16;
                        this.field3845[var11] = this.field3841[var11] * var15 + this.field3845[var11] * var16 >> 16;
                        this.field3841[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field3895[var13];
                        var16 = field3896[var13];
                        var17 = this.field3845[var11] * var15 + this.field3840[var11] * var16 >> 16;
                        this.field3845[var11] = this.field3845[var11] * var16 - this.field3840[var11] * var15 >> 16;
                        this.field3840[var11] = var17;
                     }

                     var10000 = this.field3840;
                     var10000[var11] += field3890;
                     var10000 = this.field3841;
                     var10000[var11] += field3903;
                     var10000 = this.field3845;
                     var10000[var11] += field3892;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field3858.length) {
                  var9 = this.field3858[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field3840;
                     var10000[var11] -= field3890;
                     var10000 = this.field3841;
                     var10000[var11] -= field3903;
                     var10000 = this.field3845;
                     var10000[var11] -= field3892;
                     this.field3840[var11] = this.field3840[var11] * var3 / 128;
                     this.field3841[var11] = this.field3841[var11] * var4 / 128;
                     this.field3845[var11] = this.field3845[var11] * var5 / 128;
                     var10000 = this.field3840;
                     var10000[var11] += field3890;
                     var10000 = this.field3841;
                     var10000[var11] += field3903;
                     var10000 = this.field3845;
                     var10000[var11] += field3892;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.field3859 != null && this.field3850 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.field3859.length) {
                     var9 = this.field3859[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field3850[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.field3850[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void method2303() {
      for(int var1 = 0; var1 < this.field3894; ++var1) {
         int var2 = this.field3840[var1];
         this.field3840[var1] = this.field3845[var1];
         this.field3845[var1] = -var2;
      }

      this.method2296();
   }

   public void method2304() {
      for(int var1 = 0; var1 < this.field3894; ++var1) {
         this.field3840[var1] = -this.field3840[var1];
         this.field3845[var1] = -this.field3845[var1];
      }

      this.method2296();
   }

   public void method2305() {
      for(int var1 = 0; var1 < this.field3894; ++var1) {
         int var2 = this.field3845[var1];
         this.field3845[var1] = this.field3840[var1];
         this.field3840[var1] = -var2;
      }

      this.method2296();
   }

   public void method2313(int var1) {
      int var2 = field3895[var1];
      int var3 = field3896[var1];

      for(int var4 = 0; var4 < this.field3894; ++var4) {
         int var5 = this.field3841[var4] * var3 - this.field3845[var4] * var2 >> 16;
         this.field3845[var4] = this.field3841[var4] * var2 + this.field3845[var4] * var3 >> 16;
         this.field3841[var4] = var5;
      }

      this.method2296();
   }

   public void method2294(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3894; ++var4) {
         int[] var10000 = this.field3840;
         var10000[var4] += var1;
         var10000 = this.field3841;
         var10000[var4] += var2;
         var10000 = this.field3845;
         var10000[var4] += var3;
      }

      this.method2296();
   }

   public void method2306(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field3894; ++var4) {
         this.field3840[var4] = this.field3840[var4] * var1 / 128;
         this.field3841[var4] = this.field3841[var4] * var2 / 128;
         this.field3845[var4] = this.field3845[var4] * var3 / 128;
      }

      this.method2296();
   }

   public final void method2299(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.field3862 != 2 && this.field3862 != 1) {
         this.method2321();
      }

      int var8 = class480.method2263();
      int var9 = class480.method2264();
      int var10 = field3895[var1];
      int var11 = field3896[var1];
      int var12 = field3895[var2];
      int var13 = field3896[var2];
      int var14 = field3895[var3];
      int var15 = field3896[var3];
      int var16 = field3895[var4];
      int var17 = field3896[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field3894; ++var19) {
         int var20 = this.field3840[var19];
         int var21 = this.field3841[var19];
         int var22 = this.field3845[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field3874[var19] = var22 - var18;
         field3871[var19] = var8 + var20 * class480.method2268() / var22;
         field3872[var19] = var9 + var23 * class480.method2268() / var22;
         field3877[var19] = class370.method1734(var22);
         if (this.field3854 > 0) {
            field3875[var19] = var20;
            field3876[var19] = var23;
            field3882[var19] = var22;
         }
      }

      try {
         this.method2308(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void method2307(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field3862 != 2 && this.field3862 != 1) {
         this.method2321();
      }

      int var9 = class480.method2263();
      int var10 = class480.method2264();
      int var11 = field3895[var1];
      int var12 = field3896[var1];
      int var13 = field3895[var2];
      int var14 = field3896[var2];
      int var15 = field3895[var3];
      int var16 = field3896[var3];
      int var17 = field3895[var4];
      int var18 = field3896[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field3894; ++var20) {
         int var21 = this.field3840[var20];
         int var22 = this.field3841[var20];
         int var23 = this.field3845[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field3874[var20] = var23 - var19;
         field3871[var20] = var9 + var21 * class480.method2268() / var8;
         field3872[var20] = var10 + var24 * class480.method2268() / var8;
         field3877[var20] = class370.method1734(var8);
         if (this.field3854 > 0) {
            field3875[var20] = var21;
            field3876[var20] = var24;
            field3882[var20] = var23;
         }
      }

      try {
         this.method2308(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void method631(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.field3862 != 1) {
         this.method2293();
      }

      this.method2322(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field3864 * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field3864) * class480.method2268();
         if (var16 / var14 < class480.method2262()) {
            int var17 = (var15 + this.field3864) * class480.method2268();
            if (var17 / var14 > class480.method2265()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field3864 * var2 >> 16;
               int var20 = var19 + (this.field3863 * var3 >> 16);
               int var21 = (var18 + var20) * class480.method2268();
               if (var21 / var14 > class480.method2267()) {
                  int var22 = var19 + (super.field1058 * var3 >> 16);
                  int var23 = (var18 - var22) * class480.method2268();
                  if (var23 / var14 < class480.method2266()) {
                     int var24 = var13 + (super.field1058 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.field3854 > 0;
                     int var28 = class463.field3656;
                     int var30 = class463.field3659;
                     boolean var32 = class463.method2181();
                     boolean var34 = 0L != var9;
                     boolean var35;
                     if (var34) {
                        var35 = (int)(var9 >>> 16 & 1L) == 1;
                        var34 = !var35;
                     }

                     var35 = false;
                     int var38;
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     int var44;
                     int var51;
                     int var52;
                     if (var34 && var32) {
                        boolean var36 = false;
                        if (field3893) {
                           boolean var37;
                           if (!class463.method2181()) {
                              var37 = false;
                           } else {
                              class463.method2178();
                              class334 var39 = (class334)this.field3867.get(var1);
                              var40 = var6 + var39.field2513;
                              var41 = var39.field2508 + var7;
                              var42 = var39.field2509 + var8;
                              var43 = var39.field2510;
                              var44 = var39.field2511;
                              int var45 = var39.field2512;
                              int var46 = class463.field3655 - var40;
                              int var47 = class463.field3664 - var41;
                              int var48 = class463.field3661 - var42;
                              if (Math.abs(var46) > var43 + class463.field3662) {
                                 var37 = false;
                              } else if (Math.abs(var47) > class295.field2024 + var44) {
                                 var37 = false;
                              } else if (Math.abs(var48) > var45 + class298.field2034) {
                                 var37 = false;
                              } else if (Math.abs(class463.field3657 * var48 - var47 * class492.field3936) > class298.field2034 * var44 + var45 * class295.field2024) {
                                 var37 = false;
                              } else if (Math.abs(var46 * class492.field3936 - var48 * class309.field2092) > var43 * class298.field2034 + var45 * class463.field3662) {
                                 var37 = false;
                              } else if (Math.abs(var47 * class309.field2092 - var46 * class463.field3657) > class295.field2024 * var43 + var44 * class463.field3662) {
                                 var37 = false;
                              } else {
                                 var37 = true;
                              }
                           }

                           var36 = var37;
                        } else {
                           var52 = var12 - var13;
                           if (var52 <= 50) {
                              var52 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var52;
                           } else {
                              var17 /= var14;
                              var16 /= var52;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var52;
                           } else {
                              var21 /= var14;
                              var23 /= var52;
                           }

                           var38 = var28 - class480.method2263();
                           var51 = var30 - class480.method2264();
                           if (var38 > var16 && var38 < var17 && var51 > var23 && var51 < var21) {
                              var36 = true;
                           }
                        }

                        if (var36) {
                           if (this.field3843) {
                              class463.field3665[++class463.field3663 - 1] = var9;
                           } else {
                              var35 = true;
                           }
                        }
                     }

                     int var50 = class480.method2263();
                     var52 = class480.method2264();
                     var38 = 0;
                     var51 = 0;
                     if (var1 != 0) {
                        var38 = field3895[var1];
                        var51 = field3896[var1];
                     }

                     for(var40 = 0; var40 < this.field3894; ++var40) {
                        var41 = this.field3840[var40];
                        var42 = this.field3841[var40];
                        var43 = this.field3845[var40];
                        if (var1 != 0) {
                           var44 = var43 * var38 + var41 * var51 >> 16;
                           var43 = var43 * var51 - var41 * var38 >> 16;
                           var41 = var44;
                        }

                        var41 += var6;
                        var42 += var7;
                        var43 += var8;
                        var44 = var43 * var4 + var41 * var5 >> 16;
                        var43 = var43 * var5 - var41 * var4 >> 16;
                        var41 = var44;
                        var44 = var42 * var3 - var43 * var2 >> 16;
                        var43 = var42 * var2 + var43 * var3 >> 16;
                        field3874[var40] = var43 - var12;
                        if (var43 >= 50) {
                           field3871[var40] = var50 + var41 * class480.method2268() / var43;
                           field3872[var40] = var52 + var44 * class480.method2268() / var43;
                           field3877[var40] = class370.method1734(var43);
                        } else {
                           field3871[var40] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field3875[var40] = var41;
                           field3876[var40] = var44;
                           field3882[var40] = var43;
                        }
                     }

                     try {
                        this.method2308(var25, var35, this.field3843, var9);
                     } catch (Exception var49) {
                     }

                  }
               }
            }
         }
      }
   }

   final void method2308(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field3865 < 6000) {
         int var6;
         for(var6 = 0; var6 < this.field3865; ++var6) {
            field3879[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field3842; var7 = (char)(var7 + 1)) {
            if (this.field3848[var7] != -2) {
               var8 = this.field3857[var7];
               var9 = this.field3844[var7];
               var10 = this.field3902[var7];
               var11 = field3871[var8];
               var12 = field3871[var9];
               var13 = field3871[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var32 = field3875[var8];
                  var15 = field3875[var9];
                  var16 = field3875[var10];
                  var17 = field3876[var8];
                  var18 = field3876[var9];
                  int var19 = field3876[var10];
                  int var20 = field3882[var8];
                  int var21 = field3882[var9];
                  int var22 = field3882[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field3870[var7] = true;
                     int var26 = (field3874[var8] + field3874[var9] + field3874[var10]) / 3 + this.field3889;
                     field3880[var26][field3879[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = field3872[var8];
                     var16 = field3872[var9];
                     var17 = field3872[var10];
                     var18 = class463.field3659 + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = class463.field3659 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + class463.field3656;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = class463.field3656 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        class463.field3665[++class463.field3663 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (field3872[var10] - field3872[var9]) - (field3872[var8] - field3872[var9]) * (var13 - var12) > 0) {
                     field3870[var7] = false;
                     var32 = class480.method2269();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        field3869[var7] = false;
                     } else {
                        field3869[var7] = true;
                     }

                     var15 = (field3874[var8] + field3874[var9] + field3874[var10]) / 3 + this.field3889;
                     field3880[var15][field3879[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.field3901 == null) {
            for(var7 = this.field3865 - 1; var7 >= 0; --var7) {
               var27 = field3879[var7];
               if (var27 > 0) {
                  var28 = field3880[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.method2290(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field3881[var7] = 0;
               field3885[var7] = 0;
            }

            for(var7 = this.field3865 - 1; var7 >= 0; --var7) {
               var27 = field3879[var7];
               if (var27 > 0) {
                  var28 = field3880[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.field3901[var29];
                     var13 = field3881[var30]++;
                     field3878[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = field3885;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        field3883[var13] = var7;
                     } else {
                        field3839[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field3881[1] > 0 || field3881[2] > 0) {
               var7 = (field3885[1] + field3885[2]) / (field3881[1] + field3881[2]);
            }

            var8 = 0;
            if (field3881[3] > 0 || field3881[4] > 0) {
               var8 = (field3885[3] + field3885[4]) / (field3881[3] + field3881[4]);
            }

            var9 = 0;
            if (field3881[6] > 0 || field3881[8] > 0) {
               var9 = (field3885[6] + field3885[8]) / (field3881[6] + field3881[8]);
            }

            var11 = 0;
            var12 = field3881[10];
            int[] var31 = field3878[10];
            int[] var33 = field3883;
            if (var11 == var12) {
               var11 = 0;
               var12 = field3881[11];
               var31 = field3878[11];
               var33 = field3839;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method2290(var31[var11++]);
                  if (var11 == var12 && var31 != field3878[11]) {
                     var11 = 0;
                     var12 = field3881[11];
                     var31 = field3878[11];
                     var33 = field3839;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method2290(var31[var11++]);
                  if (var11 == var12 && var31 != field3878[11]) {
                     var11 = 0;
                     var12 = field3881[11];
                     var31 = field3878[11];
                     var33 = field3839;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method2290(var31[var11++]);
                  if (var11 == var12 && var31 != field3878[11]) {
                     var11 = 0;
                     var12 = field3881[11];
                     var31 = field3878[11];
                     var33 = field3839;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field3881[var15];
               int[] var34 = field3878[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method2290(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.method2290(var31[var11++]);
               if (var11 == var12 && var31 != field3878[11]) {
                  var11 = 0;
                  var31 = field3878[11];
                  var12 = field3881[11];
                  var33 = field3839;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void method2290(int var1) {
      if (field3870[var1]) {
         this.method2311(var1);
      } else {
         int var2 = this.field3857[var1];
         int var3 = this.field3844[var1];
         int var4 = this.field3902[var1];
         class480.field3797.field4114 = field3869[var1];
         if (this.field3850 == null) {
            class480.field3797.field4117 = 0;
         } else {
            class480.field3797.field4117 = (this.field3850[var1] == -1 ? 253 : this.field3850[var1]) & 255;
         }

         this.method2319(var1, field3872[var2], field3872[var3], field3872[var4], field3871[var2], field3871[var3], field3871[var4], field3877[var2], field3877[var3], field3877[var4], this.field3846[var1], this.field3847[var1], this.field3848[var1]);
      }
   }

   boolean method2310(int var1) {
      return this.field3904 > 0 && var1 < this.field3905;
   }

   final void method2319(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.field3852 != null && this.field3852[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.field3851 != null && this.field3851[var1] != -1) {
            int var17 = this.field3851[var1] & 255;
            var18 = this.field3855[var17];
            var15 = this.field3856[var17];
            var16 = this.field3849[var17];
         } else {
            var18 = this.field3857[var1];
            var15 = this.field3844[var1];
            var16 = this.field3902[var1];
         }

         if (this.field3848[var1] == -1) {
            class480.method2275(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3875[var18], field3875[var15], field3875[var16], field3876[var18], field3876[var15], field3876[var16], field3882[var18], field3882[var15], field3882[var16], this.field3852[var1]);
         } else {
            class480.method2275(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3875[var18], field3875[var15], field3875[var16], field3876[var18], field3876[var15], field3876[var16], field3882[var18], field3882[var15], field3882[var16], this.field3852[var1]);
         }
      } else {
         boolean var14 = this.method2310(var1);
         if (this.field3848[var1] == -1 && var14) {
            class480.method2283(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3897[this.field3846[var1]], this.field3898, this.field3868, this.field3866, this.field3904);
         } else if (this.field3848[var1] == -1) {
            class480.method2284(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3897[this.field3846[var1]]);
         } else if (var14) {
            class480.method2281(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field3898, this.field3868, this.field3866, this.field3904);
         } else {
            class480.method2277(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   final void method2311(int var1) {
      int var2 = class480.method2263();
      int var3 = class480.method2264();
      int var4 = 0;
      int var5 = this.field3857[var1];
      int var6 = this.field3844[var1];
      int var7 = this.field3902[var1];
      int var8 = field3882[var5];
      int var9 = field3882[var6];
      int var10 = field3882[var7];
      if (this.field3850 == null) {
         class480.field3797.field4117 = 0;
      } else {
         class480.field3797.field4117 = this.field3850[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field3886[var4] = field3871[var5];
         field3887[var4] = field3872[var5];
         field3891[var4] = field3877[var7];
         field3888[var4++] = this.field3846[var1];
      } else {
         var11 = field3875[var5];
         var12 = field3876[var5];
         var13 = this.field3846[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * field3861[var10 - var8];
            field3886[var4] = var2 + (var11 + ((field3875[var7] - var11) * var14 >> 16)) * class480.method2268() / 50;
            field3887[var4] = var3 + (var12 + ((field3876[var7] - var12) * var14 >> 16)) * class480.method2268() / 50;
            field3891[var4] = field3900;
            field3888[var4++] = var13 + ((this.field3848[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * field3861[var9 - var8];
            field3886[var4] = var2 + (var11 + ((field3875[var6] - var11) * var14 >> 16)) * class480.method2268() / 50;
            field3887[var4] = var3 + (var12 + ((field3876[var6] - var12) * var14 >> 16)) * class480.method2268() / 50;
            field3891[var4] = field3900;
            field3888[var4++] = var13 + ((this.field3847[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field3886[var4] = field3871[var6];
         field3887[var4] = field3872[var6];
         field3891[var4] = field3877[var7];
         field3888[var4++] = this.field3847[var1];
      } else {
         var11 = field3875[var6];
         var12 = field3876[var6];
         var13 = this.field3847[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * field3861[var8 - var9];
            field3886[var4] = var2 + (var11 + ((field3875[var5] - var11) * var14 >> 16)) * class480.method2268() / 50;
            field3887[var4] = var3 + (var12 + ((field3876[var5] - var12) * var14 >> 16)) * class480.method2268() / 50;
            field3891[var4] = field3900;
            field3888[var4++] = var13 + ((this.field3846[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * field3861[var10 - var9];
            field3886[var4] = var2 + (var11 + ((field3875[var7] - var11) * var14 >> 16)) * class480.method2268() / 50;
            field3887[var4] = var3 + (var12 + ((field3876[var7] - var12) * var14 >> 16)) * class480.method2268() / 50;
            field3888[var4++] = var13 + ((this.field3848[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field3886[var4] = field3871[var7];
         field3887[var4] = field3872[var7];
         field3891[var4] = field3877[var7];
         field3888[var4++] = this.field3848[var1];
      } else {
         var11 = field3875[var7];
         var12 = field3876[var7];
         var13 = this.field3848[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * field3861[var9 - var10];
            field3886[var4] = var2 + (var11 + ((field3875[var6] - var11) * var14 >> 16)) * class480.method2268() / 50;
            field3887[var4] = var3 + (var12 + ((field3876[var6] - var12) * var14 >> 16)) * class480.method2268() / 50;
            field3891[var4] = field3900;
            field3888[var4++] = var13 + ((this.field3847[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * field3861[var8 - var10];
            field3886[var4] = var2 + (var11 + ((field3875[var5] - var11) * var14 >> 16)) * class480.method2268() / 50;
            field3887[var4] = var3 + (var12 + ((field3876[var5] - var12) * var14 >> 16)) * class480.method2268() / 50;
            field3891[var4] = field3900;
            field3888[var4++] = var13 + ((this.field3846[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field3886[0];
      var12 = field3886[1];
      var13 = field3886[2];
      var14 = field3887[0];
      int var15 = field3887[1];
      int var16 = field3887[2];
      float var17 = field3891[0];
      float var18 = field3891[1];
      float var19 = field3891[2];
      class480.field3797.field4114 = false;
      int var20 = class480.method2269();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            class480.field3797.field4114 = true;
         }

         this.method2319(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3888[0], field3888[1], field3888[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3886[3] < 0 || field3886[3] > var20) {
            class480.field3797.field4114 = true;
         }

         int var22;
         if (this.field3852 != null && this.field3852[var1] != -1) {
            int var23;
            int var25;
            if (this.field3851 != null && this.field3851[var1] != -1) {
               int var24 = this.field3851[var1] & 255;
               var25 = this.field3855[var24];
               var22 = this.field3856[var24];
               var23 = this.field3849[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.field3852[var1];
            if (this.field3848[var1] == -1) {
               class480.method2275(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field3846[var1], this.field3846[var1], this.field3846[var1], field3875[var25], field3875[var22], field3875[var23], field3876[var25], field3876[var22], field3876[var23], field3882[var25], field3882[var22], field3882[var23], var26);
               class480.method2275(var14, var16, field3887[3], var11, var13, field3886[3], var17, var19, field3891[3], this.field3846[var1], this.field3846[var1], this.field3846[var1], field3875[var25], field3875[var22], field3875[var23], field3876[var25], field3876[var22], field3876[var23], field3882[var25], field3882[var22], field3882[var23], var26);
            } else {
               class480.method2275(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3888[0], field3888[1], field3888[2], field3875[var25], field3875[var22], field3875[var23], field3876[var25], field3876[var22], field3876[var23], field3882[var25], field3882[var22], field3882[var23], var26);
               class480.method2275(var14, var16, field3887[3], var11, var13, field3886[3], var17, var19, field3891[3], field3888[0], field3888[2], field3888[3], field3875[var25], field3875[var22], field3875[var23], field3876[var25], field3876[var22], field3876[var23], field3882[var25], field3882[var22], field3882[var23], var26);
            }
         } else {
            boolean var21 = this.method2310(var1);
            if (this.field3848[var1] == -1 && var21) {
               var22 = field3897[this.field3846[var1]];
               class480.method2283(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field3898, this.field3868, this.field3866, this.field3904);
               class480.method2283(var14, var16, field3887[3], var11, var13, field3886[3], var17, var19, field3891[3], var22, this.field3898, this.field3868, this.field3866, this.field3904);
            } else if (this.field3848[var1] == -1) {
               var22 = field3897[this.field3846[var1]];
               class480.method2284(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               class480.method2284(var14, var16, field3887[3], var11, var13, field3886[3], var17, var19, field3891[3], var22);
            } else if (var21) {
               class480.method2281(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3888[0], field3888[1], field3888[2], this.field3898, this.field3866, this.field3868, this.field3904);
               class480.method2281(var14, var16, field3887[3], var11, var13, field3886[3], 0.0F, 0.0F, 0.0F, field3888[0], field3888[2], field3888[3], this.field3898, this.field3866, this.field3868, this.field3904);
            } else {
               class480.method2277(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3888[0], field3888[1], field3888[2]);
               class480.method2277(var14, var16, field3887[3], var11, var13, field3886[3], var17, var19, field3891[3], field3888[0], field3888[2], field3888[3]);
            }
         }
      }

   }

   void method2312(int var1, class475 var2) {
      float var3 = (float)this.field3840[var1];
      float var4 = (float)(-this.field3841[var1]);
      float var5 = (float)(-this.field3845[var1]);
      float var6 = 1.0F;
      this.field3840[var1] = (int)(var2.field3766[0] * var3 + var2.field3766[4] * var4 + var2.field3766[8] * var5 + var2.field3766[12] * var6);
      this.field3841[var1] = -((int)(var2.field3766[1] * var3 + var2.field3766[5] * var4 + var2.field3766[9] * var5 + var2.field3766[13] * var6));
      this.field3845[var1] = -((int)(var2.field3766[2] * var3 + var2.field3766[6] * var4 + var2.field3766[10] * var5 + var2.field3766[14] * var6));
   }

   void method2316(class242 var1, int var2) {
      if (this.field3860 != null) {
         for(int var3 = 0; var3 < this.field3894; ++var3) {
            int[] var4 = this.field3860[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field3884[var3];
               field3836.method2234();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class54 var8 = var1.method1167(var7);
                  if (var8 != null) {
                     field3837.method2235((float)var5[var6] / 255.0F);
                     field3838.method2240(var8.method228(var2));
                     field3838.method2243(field3837);
                     field3836.method2237(field3838);
                  }
               }

               this.method2312(var3, field3836);
            }
         }

      }
   }
}
