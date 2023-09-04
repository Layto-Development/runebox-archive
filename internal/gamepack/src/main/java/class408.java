public class class408 {
   public static boolean field2852 = true;
   public static int field2849 = -1;
   public static int field2850 = -1;
   static boolean field2837 = false;
   static boolean field2851 = false;
   static boolean[][] field2845;
   static boolean[][][][] field2869;
   static class276[] field2854 = new class276[100];
   static class414[] field2857;
   static class414[][] field2853;
   static class429 field2858;
   static int field2821;
   static int field2824;
   static int field2830 = 4;
   static int field2831 = 0;
   static int field2832;
   static int field2833;
   static int field2834;
   static int field2835;
   static int field2836;
   static int field2838;
   static int field2839 = 0;
   static int field2840;
   static int field2841;
   static int field2842;
   static int field2843;
   static int field2844;
   static int field2847 = 0;
   static int field2848 = 0;
   static int field2855;
   static int field2856 = 0;
   static int field2866;
   static int field2867;
   static int field2871;
   static int field2872;
   static int field2873;
   static int field2875;
   static int field2876;
   static int[] field2874;
   static final int[] field2829;
   static final int[] field2859;
   static final int[] field2860;
   static final int[] field2862;
   static final int[] field2863;
   static final int[] field2864;
   static final int[] field2865;
   class276[] field2827 = new class276[5000];
   class402[][][] field2861;
   int field2820;
   int field2822;
   int field2825 = 0;
   int field2826 = 0;
   int field2846;
   int[][] field2868 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][] field2870 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][][] field2823;
   int[][][] field2828;

   static {
      field2874 = new int[field2830];
      field2853 = new class414[field2830][500];
      field2873 = 0;
      field2857 = new class414[500];
      field2858 = new class429();
      field2859 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field2860 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field2829 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field2862 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field2863 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field2864 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field2865 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field2869 = new boolean[8][32][51][51];
   }

   public class408(int var1, int var2, int var3, int[][][] var4) {
      this.field2820 = var1;
      this.field2846 = var2;
      this.field2822 = var3;
      this.field2861 = new class402[var1][var2][var3];
      this.field2828 = new int[var1][var2 + 1][var3 + 1];
      this.field2823 = var4;
      this.method1835();
   }

   public void method1835() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field2820; ++var1) {
         for(var2 = 0; var2 < this.field2846; ++var2) {
            for(int var3 = 0; var3 < this.field2822; ++var3) {
               this.field2861[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field2830; ++var1) {
         for(var2 = 0; var2 < field2874[var1]; ++var2) {
            field2853[var1][var2] = null;
         }

         field2874[var1] = 0;
      }

      for(var1 = 0; var1 < this.field2826; ++var1) {
         this.field2827[var1] = null;
      }

      this.field2826 = 0;

      for(var1 = 0; var1 < field2854.length; ++var1) {
         field2854[var1] = null;
      }

   }

   public void method1836(int var1) {
      this.field2825 = var1;

      for(int var2 = 0; var2 < this.field2846; ++var2) {
         for(int var3 = 0; var3 < this.field2822; ++var3) {
            if (this.field2861[var1][var2][var3] == null) {
               this.field2861[var1][var2][var3] = new class402(var1, var2, var3);
            }
         }
      }

   }

   public void method1837(int var1, int var2) {
      class402 var3 = this.field2861[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class402 var5 = this.field2861[var4][var1][var2] = this.field2861[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field2802;

            for(int var6 = 0; var6 < var5.field2790; ++var6) {
               class276 var7 = var5.field2801[var6];
               long var9 = var7.field1940;
               boolean var8 = class463.method2184(var9) == 2;
               if (var8 && var7.field1934 == var1 && var7.field1936 == var2) {
                  --var7.field1939;
               }
            }
         }
      }

      if (this.field2861[0][var1][var2] == null) {
         this.field2861[0][var1][var2] = new class402(0, var1, var2);
      }

      this.field2861[0][var1][var2].field2805 = var3;
      this.field2861[3][var1][var2] = null;
   }

   public void method1889(int var1, int var2, int var3, int var4) {
      class402 var5 = this.field2861[var1][var2][var3];
      if (var5 != null) {
         this.field2861[var1][var2][var3].field2797 = var4;
      }
   }

   public void method1874(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class48 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class48(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2861[var22][var2][var3] == null) {
               this.field2861[var22][var2][var3] = new class402(var22, var2, var3);
            }
         }

         this.field2861[var1][var2][var3].field2787 = var21;
      } else if (var4 != 1) {
         class23 var23 = new class23(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2861[var22][var2][var3] == null) {
               this.field2861[var22][var2][var3] = new class402(var22, var2, var3);
            }
         }

         this.field2861[var1][var2][var3].field2788 = var23;
      } else {
         var21 = new class48(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2861[var22][var2][var3] == null) {
               this.field2861[var22][var2][var3] = new class402(var22, var2, var3);
            }
         }

         this.field2861[var1][var2][var3].field2787 = var21;
      }
   }

   public void method1840(int var1, int var2, int var3, int var4, class165 var5, long var6, int var8) {
      if (var5 != null) {
         class514 var9 = new class514();
         var9.field4106 = var5;
         var9.field4107 = var2 * 128 + 64;
         var9.field4109 = var3 * 128 + 64;
         var9.field4104 = var4;
         var9.field4105 = var6;
         var9.field4108 = var8;
         if (this.field2861[var1][var2][var3] == null) {
            this.field2861[var1][var2][var3] = new class402(var1, var2, var3);
         }

         this.field2861[var1][var2][var3].field2791 = var9;
      }
   }

   public void method1841(int var1, int var2, int var3, int var4, class165 var5, long var6, class165 var8, class165 var9) {
      class495 var10 = new class495();
      var10.field3955 = var5;
      var10.field3959 = var2 * 128 + 64;
      var10.field3956 = var3 * 128 + 64;
      var10.field3953 = var4;
      var10.field3958 = var6;
      var10.field3954 = var8;
      var10.field3957 = var9;
      int var11 = 0;
      class402 var12 = this.field2861[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field2790; ++var13) {
            if ((var12.field2801[var13].field1932 & 256) == 256 && var12.field2801[var13].field1935 instanceof class485) {
               class485 var14 = (class485)var12.field2801[var13].field1935;
               var14.method2293();
               if (var14.field1058 > var11) {
                  var11 = var14.field1058;
               }
            }
         }
      }

      var10.field3952 = var11;
      if (this.field2861[var1][var2][var3] == null) {
         this.field2861[var1][var2][var3] = new class402(var1, var2, var3);
      }

      this.field2861[var1][var2][var3].field2784 = var10;
   }

   public void method1862(int var1, int var2, int var3, int var4, class165 var5, class165 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class71 var12 = new class71();
         var12.field539 = var9;
         var12.field541 = var11;
         var12.field533 = var2 * 128 + 64;
         var12.field534 = var3 * 128 + 64;
         var12.field536 = var4;
         var12.field540 = var5;
         var12.field538 = var6;
         var12.field535 = var7;
         var12.field537 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field2861[var13][var2][var3] == null) {
               this.field2861[var13][var2][var3] = new class402(var13, var2, var3);
            }
         }

         this.field2861[var1][var2][var3].field2794 = var12;
      }
   }

   public void method1877(int var1, int var2, int var3, int var4, class165 var5, class165 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class385 var14 = new class385();
         var14.field2731 = var11;
         var14.field2732 = var13;
         var14.field2722 = var2 * 128 + 64;
         var14.field2723 = var3 * 128 + 64;
         var14.field2727 = var4;
         var14.field2728 = var5;
         var14.field2729 = var6;
         var14.field2724 = var7;
         var14.field2725 = var8;
         var14.field2726 = var9;
         var14.field2721 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field2861[var15][var2][var3] == null) {
               this.field2861[var15][var2][var3] = new class402(var15, var2, var3);
            }
         }

         this.field2861[var1][var2][var3].field2793 = var14;
      }
   }

   public boolean method1842(int var1, int var2, int var3, int var4, int var5, int var6, class165 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + var5 * 64;
         int var13 = var3 * 128 + var6 * 64;
         return this.method1873(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean method1843(int var1, int var2, int var3, int var4, int var5, class165 var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method1873(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method1844(int var1, int var2, int var3, int var4, int var5, class165 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method1873(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean method1873(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class165 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2846 || var16 >= this.field2822) {
               return false;
            }

            class402 var17 = this.field2861[var1][var15][var16];
            if (var17 != null && var17.field2790 >= 5) {
               return false;
            }
         }
      }

      class276 var21 = new class276();
      var21.field1940 = var12;
      var21.field1932 = var14;
      var21.field1939 = var1;
      var21.field1930 = var6;
      var21.field1941 = var7;
      var21.field1929 = var8;
      var21.field1935 = var9;
      var21.field1928 = var10;
      var21.field1934 = var2;
      var21.field1936 = var3;
      var21.field1931 = var2 + var4 - 1;
      var21.field1937 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.field2861[var19][var16][var22] == null) {
                  this.field2861[var19][var16][var22] = new class402(var19, var16, var22);
               }
            }

            class402 var23 = this.field2861[var1][var16][var22];
            var23.field2801[var23.field2790] = var21;
            var23.field2795[var23.field2790] = var18;
            var23.field2796 |= var18;
            ++var23.field2790;
         }
      }

      if (var11) {
         this.field2827[this.field2826++] = var21;
      }

      return true;
   }

   public void method1882() {
      for(int var1 = 0; var1 < this.field2826; ++var1) {
         class276 var2 = this.field2827[var1];
         this.method1847(var2);
         this.field2827[var1] = null;
      }

      this.field2826 = 0;
   }

   void method1847(class276 var1) {
      for(int var2 = var1.field1934; var2 <= var1.field1931; ++var2) {
         for(int var3 = var1.field1936; var3 <= var1.field1937; ++var3) {
            class402 var4 = this.field2861[var1.field1939][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field2790; ++var5) {
                  if (var4.field2801[var5] == var1) {
                     --var4.field2790;

                     for(int var6 = var5; var6 < var4.field2790; ++var6) {
                        var4.field2801[var6] = var4.field2801[var6 + 1];
                        var4.field2795[var6] = var4.field2795[var6 + 1];
                     }

                     var4.field2801[var4.field2790] = null;
                     break;
                  }
               }

               var4.field2796 = 0;

               for(var5 = 0; var5 < var4.field2790; ++var5) {
                  var4.field2796 |= var4.field2795[var5];
               }
            }
         }
      }

   }

   public void method1845(int var1, int var2, int var3, int var4) {
      class402 var5 = this.field2861[var1][var2][var3];
      if (var5 != null) {
         class385 var6 = var5.field2793;
         if (var6 != null) {
            var6.field2726 = var6.field2726 * var4 / 16;
            var6.field2721 = var6.field2721 * var4 / 16;
         }
      }
   }

   public void method1878(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 != null) {
         var4.field2794 = null;
      }
   }

   public void method1846(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 != null) {
         var4.field2793 = null;
      }
   }

   public void method1879(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field2790; ++var5) {
            class276 var6 = var4.field2801[var5];
            long var8 = var6.field1940;
            boolean var7 = class463.method2184(var8) == 2;
            if (var7 && var6.field1934 == var2 && var6.field1936 == var3) {
               this.method1847(var6);
               return;
            }
         }

      }
   }

   public void method1848(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 != null) {
         var4.field2791 = null;
      }
   }

   public void method1849(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 != null) {
         var4.field2784 = null;
      }
   }

   public class71 method1850(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      return var4 == null ? null : var4.field2794;
   }

   public class385 method1851(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      return var4 == null ? null : var4.field2793;
   }

   public class276 method1888(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field2790; ++var5) {
            class276 var6 = var4.field2801[var5];
            long var8 = var6.field1940;
            boolean var7 = class463.method2184(var8) == 2;
            if (var7 && var6.field1934 == var2 && var6.field1936 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public class514 method1875(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      return var4 != null && var4.field2791 != null ? var4.field2791 : null;
   }

   public long method1871(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      return var4 != null && var4.field2794 != null ? var4.field2794.field539 : 0L;
   }

   public long method1876(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      return var4 != null && var4.field2793 != null ? var4.field2793.field2731 : 0L;
   }

   public long method1852(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field2790; ++var5) {
            class276 var6 = var4.field2801[var5];
            long var8 = var6.field1940;
            boolean var7 = class463.method2184(var8) == 2;
            if (var7 && var6.field1934 == var2 && var6.field1936 == var3) {
               return var6.field1940;
            }
         }

         return 0L;
      }
   }

   public long method1885(int var1, int var2, int var3) {
      class402 var4 = this.field2861[var1][var2][var3];
      return var4 != null && var4.field2791 != null ? var4.field2791.field4105 : 0L;
   }

   public int method1853(int var1, int var2, int var3, long var4) {
      class402 var6 = this.field2861[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field2794 != null && var6.field2794.field539 == var4) {
         return var6.field2794.field541 & 255;
      } else if (var6.field2793 != null && var6.field2793.field2731 == var4) {
         return var6.field2793.field2732 & 255;
      } else if (var6.field2791 != null && var6.field2791.field4105 == var4) {
         return var6.field2791.field4108 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field2790; ++var7) {
            if (var6.field2801[var7].field1940 == var4) {
               return var6.field2801[var7].field1932 & 255;
            }
         }

         return -1;
      }
   }

   public void method1854(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2820; ++var4) {
         for(int var5 = 0; var5 < this.field2846; ++var5) {
            for(int var6 = 0; var6 < this.field2822; ++var6) {
               class402 var7 = this.field2861[var4][var5][var6];
               if (var7 != null) {
                  class71 var8 = var7.field2794;
                  class327 var10;
                  if (var8 != null && var8.field540 instanceof class327) {
                     class327 var9 = (class327)var8.field540;
                     this.method1855(var9, var4, var5, var6, 1, 1);
                     if (var8.field538 instanceof class327) {
                        var10 = (class327)var8.field538;
                        this.method1855(var10, var4, var5, var6, 1, 1);
                        class327.method1509(var9, var10, 0, 0, 0, false);
                        var8.field538 = var10.method1510(var10.field2478, var10.field2467, var1, var2, var3);
                     }

                     var8.field540 = var9.method1510(var9.field2478, var9.field2467, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field2790; ++var12) {
                     class276 var14 = var7.field2801[var12];
                     if (var14 != null && var14.field1935 instanceof class327) {
                        class327 var11 = (class327)var14.field1935;
                        this.method1855(var11, var4, var5, var6, var14.field1931 - var14.field1934 + 1, var14.field1937 - var14.field1936 + 1);
                        var14.field1935 = var11.method1510(var11.field2478, var11.field2467, var1, var2, var3);
                     }
                  }

                  class514 var13 = var7.field2791;
                  if (var13 != null && var13.field4106 instanceof class327) {
                     var10 = (class327)var13.field4106;
                     this.method1886(var10, var4, var5, var6);
                     var13.field4106 = var10.method1510(var10.field2478, var10.field2467, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void method1886(class327 var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.field2846) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.field2822 && (var9 >= var6 || var10 >= var8)) {
                  class402 var11 = this.field2861[var2][var9][var10];
                  if (var11 != null && var11.field2791 != null && var11.field2791.field4106 instanceof class327) {
                     int var12 = this.method1856(var2, var9, var10, var2, var3, var4);
                     class327 var13 = (class327)var11.field2791.field4106;
                     class327.method1509(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   void method1855(class327 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field2820) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field2846) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field2822 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class402 var15 = this.field2861[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.method1856(var12, var13, var14, var2, var3, var4);
                           class71 var17 = var15.field2794;
                           if (var17 != null) {
                              class327 var18;
                              if (var17.field540 instanceof class327) {
                                 var18 = (class327)var17.field540;
                                 class327.method1509(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field538 instanceof class327) {
                                 var18 = (class327)var17.field538;
                                 class327.method1509(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field2790; ++var23) {
                              class276 var19 = var15.field2801[var23];
                              if (var19 != null && var19.field1935 instanceof class327) {
                                 class327 var20 = (class327)var19.field1935;
                                 int var21 = var19.field1931 - var19.field1934 + 1;
                                 int var22 = var19.field1937 - var19.field1936 + 1;
                                 class327.method1509(var1, var20, (var19.field1934 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field1936 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   int method1856(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method1857(var1, var2, var3) - this.method1857(var4, var5, var6);
   }

   int method1857(int var1, int var2, int var3) {
      return (this.field2823[var1][var2][var3] + this.field2823[var1][var2 + 1][var3] + this.field2823[var1][var2][var3 + 1] + this.field2823[var1][var2 + 1][var3 + 1]) / 4;
   }

   public void method1858(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class402 var7 = this.field2861[var4][var5][var6];
      if (var7 != null) {
         class48 var8 = var7.field2787;
         int var10;
         if (var8 != null) {
            int var18 = var8.field418;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class23 var9 = var7.field2788;
            if (var9 != null) {
               var10 = var9.field241;
               int var11 = var9.field250;
               int var12 = var9.field243;
               int var13 = var9.field247;
               int[] var14 = this.field2870[var10];
               int[] var15 = this.field2868[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public void method1860(int var1, int var2, int var3, boolean var4) {
      if (!method1861() || var4) {
         field2837 = true;
         field2851 = var4;
         field2847 = var1;
         field2856 = var2;
         field2848 = var3;
         field2849 = -1;
         field2850 = -1;
      }
   }

   public void method1881() {
      field2851 = true;
   }

   public void method1863(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2846 * 128) {
         var1 = this.field2846 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2822 * 128) {
         var3 = this.field2822 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field2832;
      field2842 = class480.field3795[var4];
      field2843 = class480.field3793[var4];
      field2876 = class480.field3795[var5];
      field2844 = class480.field3793[var5];
      field2845 = field2869[(var4 - 128) / 32][var5 / 64];
      field2824 = var1;
      field2840 = var2;
      field2841 = var3;
      field2867 = var1 / 128;
      field2838 = var3 / 128;
      field2831 = var6;
      field2866 = field2867 - 25;
      if (field2866 < 0) {
         field2866 = 0;
      }

      field2835 = field2838 - 25;
      if (field2835 < 0) {
         field2835 = 0;
      }

      field2834 = field2867 + 25;
      if (field2834 > this.field2846) {
         field2834 = this.field2846;
      }

      field2836 = field2838 + 25;
      if (field2836 > this.field2822) {
         field2836 = this.field2822;
      }

      this.method1868();
      field2839 = 0;

      int var7;
      class402[][] var8;
      int var9;
      int var10;
      for(var7 = this.field2825; var7 < this.field2820; ++var7) {
         var8 = this.field2861[var7];

         for(var9 = field2866; var9 < field2834; ++var9) {
            for(var10 = field2835; var10 < field2836; ++var10) {
               class402 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field2797 > var6 || !field2845[var9 - field2867 + 25][var10 - field2838 + 25] && this.field2823[var7][var9][var10] - var2 < 2000) {
                     var11.field2798 = false;
                     var11.field2799 = false;
                     var11.field2792 = 0;
                  } else {
                     var11.field2798 = true;
                     var11.field2799 = true;
                     if (var11.field2790 > 0) {
                        var11.field2783 = true;
                     } else {
                        var11.field2783 = false;
                     }

                     ++field2839;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class402 var15;
      int var16;
      for(var7 = this.field2825; var7 < this.field2820; ++var7) {
         var8 = this.field2861[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2867 + var9;
            var16 = field2867 - var9;
            if (var10 >= field2866 || var16 < field2834) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2838 + var12;
                  var14 = field2838 - var12;
                  if (var10 >= field2866) {
                     if (var13 >= field2835) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, true);
                        }
                     }

                     if (var14 < field2836) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, true);
                        }
                     }
                  }

                  if (var16 < field2834) {
                     if (var13 >= field2835) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, true);
                        }
                     }

                     if (var14 < field2836) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, true);
                        }
                     }
                  }

                  if (field2839 == 0) {
                     field2837 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field2825; var7 < this.field2820; ++var7) {
         var8 = this.field2861[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2867 + var9;
            var16 = field2867 - var9;
            if (var10 >= field2866 || var16 < field2834) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2838 + var12;
                  var14 = field2838 - var12;
                  if (var10 >= field2866) {
                     if (var13 >= field2835) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, false);
                        }
                     }

                     if (var14 < field2836) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, false);
                        }
                     }
                  }

                  if (var16 < field2834) {
                     if (var13 >= field2835) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, false);
                        }
                     }

                     if (var14 < field2836) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2798) {
                           this.method1864(var15, false);
                        }
                     }
                  }

                  if (field2839 == 0) {
                     field2837 = false;
                     return;
                  }
               }
            }
         }
      }

      field2837 = false;
   }

   void method1864(class402 var1, boolean var2) {
      field2858.method1995(var1);

      while(true) {
         class402 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class402[][] var8;
         class402 var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class71 var10;
                              class276 var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              class402 var33;
                              while(true) {
                                 do {
                                    var3 = (class402)field2858.method1989();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field2799);

                                 var4 = var3.field2789;
                                 var5 = var3.field2785;
                                 var6 = var3.field2802;
                                 var7 = var3.field2786;
                                 var8 = this.field2861[var6];
                                 if (!var3.field2798) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field2861[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field2799) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field2867 && var4 > field2866) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field2799 && (var9.field2798 || (var3.field2796 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field2867 && var4 < field2834 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field2799 && (var9.field2798 || (var3.field2796 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field2838 && var5 > field2835) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field2799 && (var9.field2798 || (var3.field2796 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field2838 && var5 < field2836 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field2799 && (var9.field2798 || (var3.field2796 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field2798 = false;
                                 if (var3.field2805 != null) {
                                    var9 = var3.field2805;
                                    if (var9.field2787 != null) {
                                       if (!this.method1887(0, var4, var5)) {
                                          this.method1865(var9.field2787, 0, field2842, field2843, field2876, field2844, var4, var5);
                                       }
                                    } else if (var9.field2788 != null && !this.method1887(0, var4, var5)) {
                                       this.method1883(var9.field2788, field2842, field2843, field2876, field2844, var4, var5);
                                    }

                                    var10 = var9.field2794;
                                    if (var10 != null) {
                                       var10.field540.method631(0, field2842, field2843, field2876, field2844, var10.field533 - field2824, var10.field536 - field2840, var10.field534 - field2841, var10.field539);
                                    }

                                    for(var11 = 0; var11 < var9.field2790; ++var11) {
                                       var12 = var9.field2801[var11];
                                       if (var12 != null) {
                                          var12.field1935.method631(var12.field1928, field2842, field2843, field2876, field2844, var12.field1930 - field2824, var12.field1929 - field2840, var12.field1941 - field2841, var12.field1940);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.field2787 != null) {
                                    if (!this.method1887(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.field2787.field414 != 12345678 || field2837 && var6 <= field2847) {
                                          this.method1865(var3.field2787, var7, field2842, field2843, field2876, field2844, var4, var5);
                                       }
                                    }
                                 } else if (var3.field2788 != null && !this.method1887(var7, var4, var5)) {
                                    var22 = true;
                                    this.method1883(var3.field2788, field2842, field2843, field2876, field2844, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class71 var23 = var3.field2794;
                                 class385 var13 = var3.field2793;
                                 if (var23 != null || var13 != null) {
                                    if (field2867 == var4) {
                                       ++var21;
                                    } else if (field2867 < var4) {
                                       var21 += 2;
                                    }

                                    if (field2838 == var5) {
                                       var21 += 3;
                                    } else if (field2838 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field2859[var21];
                                    var3.field2804 = field2829[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field535 & field2860[var21]) != 0) {
                                       if (var23.field535 == 16) {
                                          var3.field2792 = 3;
                                          var3.field2800 = field2862[var21];
                                          var3.field2803 = 3 - var3.field2800;
                                       } else if (var23.field535 == 32) {
                                          var3.field2792 = 6;
                                          var3.field2800 = field2863[var21];
                                          var3.field2803 = 6 - var3.field2800;
                                       } else if (var23.field535 == 64) {
                                          var3.field2792 = 12;
                                          var3.field2800 = field2864[var21];
                                          var3.field2803 = 12 - var3.field2800;
                                       } else {
                                          var3.field2792 = 9;
                                          var3.field2800 = field2865[var21];
                                          var3.field2803 = 9 - var3.field2800;
                                       }
                                    } else {
                                       var3.field2792 = 0;
                                    }

                                    if ((var23.field535 & var11) != 0 && !this.method1869(var7, var4, var5, var23.field535)) {
                                       var23.field540.method631(0, field2842, field2843, field2876, field2844, var23.field533 - field2824, var23.field536 - field2840, var23.field534 - field2841, var23.field539);
                                    }

                                    if ((var23.field537 & var11) != 0 && !this.method1869(var7, var4, var5, var23.field537)) {
                                       var23.field538.method631(0, field2842, field2843, field2876, field2844, var23.field533 - field2824, var23.field536 - field2840, var23.field534 - field2841, var23.field539);
                                    }
                                 }

                                 if (var13 != null && !this.method1870(var7, var4, var5, var13.field2728.field1058)) {
                                    if ((var13.field2724 & var11) != 0) {
                                       var13.field2728.method631(0, field2842, field2843, field2876, field2844, var13.field2722 - field2824 + var13.field2726, var13.field2727 - field2840, var13.field2723 - field2841 + var13.field2721, var13.field2731);
                                    } else if (var13.field2724 == 256) {
                                       var14 = var13.field2722 - field2824;
                                       var15 = var13.field2727 - field2840;
                                       var16 = var13.field2723 - field2841;
                                       var17 = var13.field2725;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.field2728.method631(0, field2842, field2843, field2876, field2844, var14 + var13.field2726, var15, var16 + var13.field2721, var13.field2731);
                                       } else if (var13.field2729 != null) {
                                          var13.field2729.method631(0, field2842, field2843, field2876, field2844, var14, var15, var16, var13.field2731);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    class514 var27 = var3.field2791;
                                    if (var27 != null) {
                                       var27.field4106.method631(0, field2842, field2843, field2876, field2844, var27.field4107 - field2824, var27.field4104 - field2840, var27.field4109 - field2841, var27.field4105);
                                    }

                                    class495 var31 = var3.field2784;
                                    if (var31 != null && var31.field3952 == 0) {
                                       if (var31.field3954 != null) {
                                          var31.field3954.method631(0, field2842, field2843, field2876, field2844, var31.field3959 - field2824, var31.field3953 - field2840, var31.field3956 - field2841, var31.field3958);
                                       }

                                       if (var31.field3957 != null) {
                                          var31.field3957.method631(0, field2842, field2843, field2876, field2844, var31.field3959 - field2824, var31.field3953 - field2840, var31.field3956 - field2841, var31.field3958);
                                       }

                                       if (var31.field3955 != null) {
                                          var31.field3955.method631(0, field2842, field2843, field2876, field2844, var31.field3959 - field2824, var31.field3953 - field2840, var31.field3956 - field2841, var31.field3958);
                                       }
                                    }
                                 }

                                 var14 = var3.field2796;
                                 if (var14 != 0) {
                                    if (var4 < field2867 && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.field2799) {
                                          field2858.method1995(var33);
                                       }
                                    }

                                    if (var5 < field2838 && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.field2799) {
                                          field2858.method1995(var33);
                                       }
                                    }

                                    if (var4 > field2867 && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.field2799) {
                                          field2858.method1995(var33);
                                       }
                                    }

                                    if (var5 > field2838 && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.field2799) {
                                          field2858.method1995(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field2792 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.field2790; ++var21) {
                                    if (var3.field2801[var21].field1933 != field2832 && (var3.field2795[var21] & var3.field2792) == var3.field2800) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.field2794;
                                    if (!this.method1869(var7, var4, var5, var10.field535)) {
                                       var10.field540.method631(0, field2842, field2843, field2876, field2844, var10.field533 - field2824, var10.field536 - field2840, var10.field534 - field2841, var10.field539);
                                    }

                                    var3.field2792 = 0;
                                 }
                              }

                              if (!var3.field2783) {
                                 break;
                              }

                              try {
                                 int var25 = var3.field2790;
                                 var3.field2783 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.field2801[var11];
                                    if (var12.field1933 != field2832) {
                                       for(var26 = var12.field1934; var26 <= var12.field1931; ++var26) {
                                          for(var14 = var12.field1936; var14 <= var12.field1937; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.field2798) {
                                                var3.field2783 = true;
                                                continue label563;
                                             }

                                             if (var33.field2792 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.field1934) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.field1931) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field1936) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field1937) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.field2792) == var3.field2803) {
                                                   var3.field2783 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field2854[var21++] = var12;
                                       var26 = field2867 - var12.field1934;
                                       var14 = var12.field1931 - field2867;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = field2838 - var12.field1936;
                                       var16 = var12.field1937 - field2838;
                                       if (var16 > var15) {
                                          var12.field1938 = var26 + var16;
                                       } else {
                                          var12.field1938 = var26 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       class276 var34 = field2854[var26];
                                       if (var34.field1933 != field2832) {
                                          if (var34.field1938 > var11) {
                                             var11 = var34.field1938;
                                             var24 = var26;
                                          } else if (var34.field1938 == var11) {
                                             var15 = var34.field1930 - field2824;
                                             var16 = var34.field1941 - field2841;
                                             var17 = field2854[var24].field1930 - field2824;
                                             var18 = field2854[var24].field1941 - field2841;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    class276 var35 = field2854[var24];
                                    var35.field1933 = field2832;
                                    if (!this.method1839(var7, var35.field1934, var35.field1931, var35.field1936, var35.field1937, var35.field1935.field1058)) {
                                       var35.field1935.method631(var35.field1928, field2842, field2843, field2876, field2844, var35.field1930 - field2824, var35.field1929 - field2840, var35.field1941 - field2841, var35.field1940);
                                    }

                                    for(var14 = var35.field1934; var14 <= var35.field1931; ++var14) {
                                       for(var15 = var35.field1936; var15 <= var35.field1937; ++var15) {
                                          class402 var36 = var8[var14][var15];
                                          if (var36.field2792 != 0) {
                                             field2858.method1995(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.field2799) {
                                             field2858.method1995(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field2783) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.field2783 = false;
                                 break;
                              }
                           }
                        } while(!var3.field2799);
                     } while(var3.field2792 != 0);

                     if (var4 > field2867 || var4 <= field2866) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field2799);

                  if (var4 < field2867 || var4 >= field2834 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field2799);

               if (var5 > field2838 || var5 <= field2835) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field2799);

            if (var5 < field2838 || var5 >= field2836 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field2799);

         var3.field2799 = false;
         --field2839;
         class495 var29 = var3.field2784;
         if (var29 != null && var29.field3952 != 0) {
            if (var29.field3954 != null) {
               var29.field3954.method631(0, field2842, field2843, field2876, field2844, var29.field3959 - field2824, var29.field3953 - field2840 - var29.field3952, var29.field3956 - field2841, var29.field3958);
            }

            if (var29.field3957 != null) {
               var29.field3957.method631(0, field2842, field2843, field2876, field2844, var29.field3959 - field2824, var29.field3953 - field2840 - var29.field3952, var29.field3956 - field2841, var29.field3958);
            }

            if (var29.field3955 != null) {
               var29.field3955.method631(0, field2842, field2843, field2876, field2844, var29.field3959 - field2824, var29.field3953 - field2840 - var29.field3952, var29.field3956 - field2841, var29.field3958);
            }
         }

         if (var3.field2804 != 0) {
            class385 var30 = var3.field2793;
            if (var30 != null && !this.method1870(var7, var4, var5, var30.field2728.field1058)) {
               if ((var30.field2724 & var3.field2804) != 0) {
                  var30.field2728.method631(0, field2842, field2843, field2876, field2844, var30.field2722 - field2824 + var30.field2726, var30.field2727 - field2840, var30.field2723 - field2841 + var30.field2721, var30.field2731);
               } else if (var30.field2724 == 256) {
                  var11 = var30.field2722 - field2824;
                  var24 = var30.field2727 - field2840;
                  var26 = var30.field2723 - field2841;
                  var14 = var30.field2725;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.field2728.method631(0, field2842, field2843, field2876, field2844, var11 + var30.field2726, var24, var26 + var30.field2721, var30.field2731);
                  } else if (var30.field2729 != null) {
                     var30.field2729.method631(0, field2842, field2843, field2876, field2844, var11, var24, var26, var30.field2731);
                  }
               }
            }

            class71 var28 = var3.field2794;
            if (var28 != null) {
               if ((var28.field537 & var3.field2804) != 0 && !this.method1869(var7, var4, var5, var28.field537)) {
                  var28.field538.method631(0, field2842, field2843, field2876, field2844, var28.field533 - field2824, var28.field536 - field2840, var28.field534 - field2841, var28.field539);
               }

               if ((var28.field535 & var3.field2804) != 0 && !this.method1869(var7, var4, var5, var28.field535)) {
                  var28.field540.method631(0, field2842, field2843, field2876, field2844, var28.field533 - field2824, var28.field536 - field2840, var28.field534 - field2841, var28.field539);
               }
            }
         }

         class402 var32;
         if (var6 < this.field2820 - 1) {
            var32 = this.field2861[var6 + 1][var4][var5];
            if (var32 != null && var32.field2799) {
               field2858.method1995(var32);
            }
         }

         if (var4 < field2867) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.field2799) {
               field2858.method1995(var32);
            }
         }

         if (var5 < field2838) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.field2799) {
               field2858.method1995(var32);
            }
         }

         if (var4 > field2867) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.field2799) {
               field2858.method1995(var32);
            }
         }

         if (var5 > field2838) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.field2799) {
               field2858.method1995(var32);
            }
         }
      }
   }

   void method1865(class48 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field2824;
      int var11;
      int var12 = var11 = (var8 << 7) - field2841;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field2823[var2][var7][var8] - field2840;
      int var18 = this.field2823[var2][var7 + 1][var8] - field2840;
      int var19 = this.field2823[var2][var7 + 1][var8 + 1] - field2840;
      int var20 = this.field2823[var2][var7][var8 + 1] - field2840;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = class480.method2263() + var10 * class480.method2268() / var12;
                  int var23 = class480.method2264() + var17 * class480.method2268() / var12;
                  int var24 = class480.method2263() + var14 * class480.method2268() / var11;
                  int var25 = class480.method2264() + var18 * class480.method2268() / var11;
                  int var26 = class480.method2263() + var13 * class480.method2268() / var16;
                  int var27 = class480.method2264() + var19 * class480.method2268() / var16;
                  int var28 = class480.method2263() + var9 * class480.method2268() / var15;
                  int var29 = class480.method2264() + var21 * class480.method2268() / var15;
                  float var30 = class370.method1734(var12);
                  float var31 = class370.method1734(var11);
                  float var32 = class370.method1734(var16);
                  float var33 = class370.method1734(var15);
                  class480.field3797.field4117 = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class480.field3797.field4114 = false;
                     var34 = class480.method2269();
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        class480.field3797.field4114 = true;
                     }

                     if (field2837 && method1867(field2856, field2848, var27, var29, var25, var26, var28, var24)) {
                        field2849 = var7;
                        field2850 = var8;
                     }

                     if (var1.field420 == -1) {
                        if (var1.field414 != 12345678) {
                           class480.method2277(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field414, var1.field416, var1.field413);
                        }
                     } else if (!field2852) {
                        if (var1.field417) {
                           class480.method2276(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field414, var1.field416, var1.field413, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field420);
                        } else {
                           class480.method2276(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field414, var1.field416, var1.field413, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field420);
                        }
                     } else {
                        var35 = class480.field3797.field4112.method1096(var1.field420);
                        class480.method2277(var27, var29, var25, var26, var28, var24, var32, var33, var31, method1866(var35, var1.field414), method1866(var35, var1.field416), method1866(var35, var1.field413));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class480.field3797.field4114 = false;
                     var34 = class480.method2269();
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        class480.field3797.field4114 = true;
                     }

                     if (field2837 && method1867(field2856, field2848, var23, var25, var29, var22, var24, var28)) {
                        field2849 = var7;
                        field2850 = var8;
                     }

                     if (var1.field420 == -1) {
                        if (var1.field415 != 12345678) {
                           class480.method2277(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field415, var1.field413, var1.field416);
                        }
                     } else if (!field2852) {
                        class480.method2276(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field415, var1.field413, var1.field416, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field420);
                     } else {
                        var35 = class480.field3797.field4112.method1096(var1.field420);
                        class480.method2277(var23, var25, var29, var22, var24, var28, var30, var31, var33, method1866(var35, var1.field415), method1866(var35, var1.field413), method1866(var35, var1.field416));
                     }
                  }

               }
            }
         }
      }
   }

   void method1883(class23 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field249.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field249[var9] - field2824;
         var11 = var1.field231[var9] - field2840;
         var12 = var1.field232[var9] - field2841;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field239 != null) {
            class23.field248[var9] = var10;
            class23.field245[var9] = var13;
            class23.field237[var9] = var12;
         }

         class23.field234[var9] = class480.method2263() + var10 * class480.method2268() / var12;
         class23.field246[var9] = class480.method2264() + var13 * class480.method2268() / var12;
         class23.field242[var9] = class370.method1734(var12);
      }

      class480.field3797.field4117 = 0;
      var8 = var1.field236.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field236[var9];
         var11 = var1.field244[var9];
         var12 = var1.field251[var9];
         var13 = class23.field234[var10];
         int var14 = class23.field234[var11];
         int var15 = class23.field234[var12];
         int var16 = class23.field246[var10];
         int var17 = class23.field246[var11];
         int var18 = class23.field246[var12];
         float var19 = class23.field242[var10];
         float var20 = class23.field242[var11];
         float var21 = class23.field242[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class480.field3797.field4114 = false;
            int var22 = class480.method2269();
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               class480.field3797.field4114 = true;
            }

            if (field2837 && method1867(field2856, field2848, var16, var17, var18, var13, var14, var15)) {
               field2849 = var6;
               field2850 = var7;
            }

            if (var1.field239 != null && var1.field239[var9] != -1) {
               if (!field2852) {
                  if (var1.field240) {
                     class480.method2276(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field238[var9], var1.field233[var9], var1.field235[var9], class23.field248[0], class23.field248[1], class23.field248[3], class23.field245[0], class23.field245[1], class23.field245[3], class23.field237[0], class23.field237[1], class23.field237[3], var1.field239[var9]);
                  } else {
                     class480.method2276(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field238[var9], var1.field233[var9], var1.field235[var9], class23.field248[var10], class23.field248[var11], class23.field248[var12], class23.field245[var10], class23.field245[var11], class23.field245[var12], class23.field237[var10], class23.field237[var11], class23.field237[var12], var1.field239[var9]);
                  }
               } else {
                  int var23 = class480.field3797.field4112.method1096(var1.field239[var9]);
                  class480.method2277(var16, var17, var18, var13, var14, var15, var19, var20, var21, method1866(var23, var1.field238[var9]), method1866(var23, var1.field233[var9]), method1866(var23, var1.field235[var9]));
               }
            } else if (var1.field238[var9] != 12345678) {
               class480.method2277(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field238[var9], var1.field233[var9], var1.field235[var9]);
            }
         }
      }

   }

   void method1868() {
      int var1 = field2874[field2831];
      class414[] var2 = field2853[field2831];
      field2873 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class414 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field2901 == 1) {
            var5 = var4.field2913 - field2867 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2899 - field2838 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2904 - field2838 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2845[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2824 - var4.field2902;
                  if (var9 > 32) {
                     var4.field2908 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2908 = 2;
                     var9 = -var9;
                  }

                  var4.field2911 = (var4.field2914 - field2841 << 8) / var9;
                  var4.field2915 = (var4.field2910 - field2841 << 8) / var9;
                  var4.field2905 = (var4.field2906 - field2840 << 8) / var9;
                  var4.field2897 = (var4.field2907 - field2840 << 8) / var9;
                  field2857[field2873++] = var4;
               }
            }
         } else if (var4.field2901 == 2) {
            var5 = var4.field2899 - field2838 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field2913 - field2867 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2898 - field2867 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2845[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2841 - var4.field2914;
                  if (var9 > 32) {
                     var4.field2908 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2908 = 4;
                     var9 = -var9;
                  }

                  var4.field2909 = (var4.field2902 - field2824 << 8) / var9;
                  var4.field2912 = (var4.field2903 - field2824 << 8) / var9;
                  var4.field2905 = (var4.field2906 - field2840 << 8) / var9;
                  var4.field2897 = (var4.field2907 - field2840 << 8) / var9;
                  field2857[field2873++] = var4;
               }
            }
         } else if (var4.field2901 == 4) {
            var5 = var4.field2906 - field2840;
            if (var5 > 128) {
               var6 = var4.field2899 - field2838 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2904 - field2838 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field2913 - field2867 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field2898 - field2867 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label145:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field2845[var11][var12]) {
                           var10 = true;
                           break label145;
                        }
                     }
                  }

                  if (var10) {
                     var4.field2908 = 5;
                     var4.field2909 = (var4.field2902 - field2824 << 8) / var5;
                     var4.field2912 = (var4.field2903 - field2824 << 8) / var5;
                     var4.field2911 = (var4.field2914 - field2841 << 8) / var5;
                     var4.field2915 = (var4.field2910 - field2841 << 8) / var5;
                     field2857[field2873++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean method1887(int var1, int var2, int var3) {
      int var4 = this.field2828[var1][var2][var3];
      if (var4 == -field2832) {
         return false;
      } else if (var4 == field2832) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method1880(var5 + 1, this.field2823[var1][var2][var3], var6 + 1) && this.method1880(var5 + 128 - 1, this.field2823[var1][var2 + 1][var3], var6 + 1) && this.method1880(var5 + 128 - 1, this.field2823[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1880(var5 + 1, this.field2823[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2828[var1][var2][var3] = field2832;
            return true;
         } else {
            this.field2828[var1][var2][var3] = -field2832;
            return false;
         }
      }
   }

   boolean method1869(int var1, int var2, int var3, int var4) {
      if (!this.method1887(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2823[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field2824) {
                  if (!this.method1880(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method1880(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1880(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method1880(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1880(var5, var9, var6)) {
                  return false;
               }

               if (!this.method1880(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field2841) {
                  if (!this.method1880(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method1880(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1880(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method1880(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1880(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method1880(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field2824) {
                  if (!this.method1880(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method1880(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1880(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method1880(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1880(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method1880(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field2841) {
                  if (!this.method1880(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method1880(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1880(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method1880(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method1880(var5, var9, var6)) {
                  return false;
               }

               if (!this.method1880(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method1880(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method1880(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method1880(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method1880(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method1880(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean method1870(int var1, int var2, int var3, int var4) {
      if (!this.method1887(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method1880(var5 + 1, this.field2823[var1][var2][var3] - var4, var6 + 1) && this.method1880(var5 + 128 - 1, this.field2823[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1880(var5 + 128 - 1, this.field2823[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1880(var5 + 1, this.field2823[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method1839(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.method1887(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method1880(var7 + 1, this.field2823[var1][var2][var4] - var6, var8 + 1) && this.method1880(var7 + 128 - 1, this.field2823[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1880(var7 + 128 - 1, this.field2823[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1880(var7 + 1, this.field2823[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field2828[var1][var7][var8] == -field2832) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field2823[var1][var2][var4] - var6;
         if (!this.method1880(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method1880(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method1880(var7, var9, var11)) {
                  return false;
               } else if (!this.method1880(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method1880(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field2873; ++var4) {
         class414 var5 = field2857[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field2908 == 1) {
            var6 = var5.field2902 - var1;
            if (var6 > 0) {
               var7 = var5.field2914 + (var5.field2911 * var6 >> 8);
               var8 = var5.field2910 + (var5.field2915 * var6 >> 8);
               var9 = var5.field2906 + (var5.field2905 * var6 >> 8);
               var10 = var5.field2907 + (var5.field2897 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2908 == 2) {
            var6 = var1 - var5.field2902;
            if (var6 > 0) {
               var7 = var5.field2914 + (var5.field2911 * var6 >> 8);
               var8 = var5.field2910 + (var5.field2915 * var6 >> 8);
               var9 = var5.field2906 + (var5.field2905 * var6 >> 8);
               var10 = var5.field2907 + (var5.field2897 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2908 == 3) {
            var6 = var5.field2914 - var3;
            if (var6 > 0) {
               var7 = var5.field2902 + (var5.field2909 * var6 >> 8);
               var8 = var5.field2903 + (var5.field2912 * var6 >> 8);
               var9 = var5.field2906 + (var5.field2905 * var6 >> 8);
               var10 = var5.field2907 + (var5.field2897 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2908 == 4) {
            var6 = var3 - var5.field2914;
            if (var6 > 0) {
               var7 = var5.field2902 + (var5.field2909 * var6 >> 8);
               var8 = var5.field2903 + (var5.field2912 * var6 >> 8);
               var9 = var5.field2906 + (var5.field2905 * var6 >> 8);
               var10 = var5.field2907 + (var5.field2897 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2908 == 5) {
            var6 = var2 - var5.field2906;
            if (var6 > 0) {
               var7 = var5.field2902 + (var5.field2909 * var6 >> 8);
               var8 = var5.field2903 + (var5.field2912 * var6 >> 8);
               var9 = var5.field2914 + (var5.field2911 * var6 >> 8);
               var10 = var5.field2910 + (var5.field2915 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void method1838(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class414 var8 = new class414();
      var8.field2913 = var2 / 128;
      var8.field2898 = var3 / 128;
      var8.field2899 = var4 / 128;
      var8.field2904 = var5 / 128;
      var8.field2901 = var1;
      var8.field2902 = var2;
      var8.field2903 = var3;
      var8.field2914 = var4;
      var8.field2910 = var5;
      var8.field2906 = var6;
      var8.field2907 = var7;
      field2853[var0][field2874[var0]++] = var8;
   }

   public static void method1872(int[] var0, int var1, int var2, int var3, int var4) {
      field2821 = 0;
      field2855 = 0;
      field2875 = var3;
      field2833 = var4;
      field2871 = var3 / 2;
      field2872 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field2842 = class480.field3795[var6];
            field2843 = class480.field3793[var6];
            field2876 = class480.field3795[var7];
            field2844 = class480.field3793[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method1859(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field2869[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static boolean method1859(int var0, int var1, int var2) {
      int var3 = var2 * field2876 + var0 * field2844 >> 16;
      int var4 = var2 * field2844 - var0 * field2876 >> 16;
      int var5 = var1 * field2842 + var4 * field2843 >> 16;
      int var6 = var1 * field2843 - var4 * field2842 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = field2871 + var3 * 128 / var5;
         int var8 = field2872 + var6 * 128 / var5;
         return var7 >= field2821 && var7 <= field2875 && var8 >= field2855 && var8 <= field2833;
      } else {
         return false;
      }
   }

   public static boolean method1861() {
      return field2851 && field2849 != -1;
   }

   public static void method1884() {
      field2849 = -1;
      field2851 = false;
   }

   static final int method1866(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static boolean method1867(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }
}
