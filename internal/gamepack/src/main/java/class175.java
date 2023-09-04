public class class175 {
   public static boolean field1768 = true;
   public static int field1765 = -1;
   public static int field1766 = -1;
   static boolean field1753 = false;
   static boolean field1767 = false;
   static boolean[][] field1761;
   static boolean[][][][] field1785;
   static class154[] field1770 = new class154[100];
   static class185[] field1773;
   static class185[][] field1769;
   static class201 field1774;
   static int field1737;
   static int field1740;
   static int field1746 = 4;
   static int field1747 = 0;
   static int field1748;
   static int field1749;
   static int field1750;
   static int field1751;
   static int field1752;
   static int field1754;
   static int field1755 = 0;
   static int field1756;
   static int field1757;
   static int field1758;
   static int field1759;
   static int field1760;
   static int field1763 = 0;
   static int field1764 = 0;
   static int field1771;
   static int field1772 = 0;
   static int field1782;
   static int field1783;
   static int field1787;
   static int field1788;
   static int field1789;
   static int field1791;
   static int field1792;
   static int[] field1790;
   static final int[] field1745;
   static final int[] field1775;
   static final int[] field1776;
   static final int[] field1778;
   static final int[] field1779;
   static final int[] field1780;
   static final int[] field1781;
   class154[] field1743 = new class154[5000];
   class369[][][] field1777;
   int field1736;
   int field1738;
   int field1741 = 0;
   int field1742 = 0;
   int field1762;
   int[][] field1784 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][] field1786 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][][] field1739;
   int[][][] field1744;

   static {
      field1790 = new int[field1746];
      field1769 = new class185[field1746][500];
      field1789 = 0;
      field1773 = new class185[500];
      field1774 = new class201();
      field1775 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1776 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field1745 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field1778 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field1779 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field1780 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field1781 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field1785 = new boolean[8][32][51][51];
   }

   public class175(int var1, int var2, int var3, int[][][] var4) {
      this.field1736 = var1;
      this.field1762 = var2;
      this.field1738 = var3;
      this.field1777 = new class369[var1][var2][var3];
      this.field1744 = new int[var1][var2 + 1][var3 + 1];
      this.field1739 = var4;
      this.method1026();
   }

   public void method1026() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field1736; ++var1) {
         for(var2 = 0; var2 < this.field1762; ++var2) {
            for(int var3 = 0; var3 < this.field1738; ++var3) {
               this.field1777[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field1746; ++var1) {
         for(var2 = 0; var2 < field1790[var1]; ++var2) {
            field1769[var1][var2] = null;
         }

         field1790[var1] = 0;
      }

      for(var1 = 0; var1 < this.field1742; ++var1) {
         this.field1743[var1] = null;
      }

      this.field1742 = 0;

      for(var1 = 0; var1 < field1770.length; ++var1) {
         field1770[var1] = null;
      }

   }

   public void method1027(int var1) {
      this.field1741 = var1;

      for(int var2 = 0; var2 < this.field1762; ++var2) {
         for(int var3 = 0; var3 < this.field1738; ++var3) {
            if (this.field1777[var1][var2][var3] == null) {
               this.field1777[var1][var2][var3] = new class369(var1, var2, var3);
            }
         }
      }

   }

   public void method1028(int var1, int var2) {
      class369 var3 = this.field1777[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class369 var5 = this.field1777[var4][var1][var2] = this.field1777[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field2892;

            for(int var6 = 0; var6 < var5.field2880; ++var6) {
               class154 var7 = var5.field2891[var6];
               long var9 = var7.field1644;
               boolean var8 = class256.method1470(var9) == 2;
               if (var8 && var7.field1638 == var1 && var7.field1640 == var2) {
                  --var7.field1643;
               }
            }
         }
      }

      if (this.field1777[0][var1][var2] == null) {
         this.field1777[0][var1][var2] = new class369(0, var1, var2);
      }

      this.field1777[0][var1][var2].field2895 = var3;
      this.field1777[3][var1][var2] = null;
   }

   public void method1080(int var1, int var2, int var3, int var4) {
      class369 var5 = this.field1777[var1][var2][var3];
      if (var5 != null) {
         this.field1777[var1][var2][var3].field2887 = var4;
      }
   }

   public void method1065(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class273 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class273(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field1777[var22][var2][var3] == null) {
               this.field1777[var22][var2][var3] = new class369(var22, var2, var3);
            }
         }

         this.field1777[var1][var2][var3].field2877 = var21;
      } else if (var4 != 1) {
         class416 var23 = new class416(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field1777[var22][var2][var3] == null) {
               this.field1777[var22][var2][var3] = new class369(var22, var2, var3);
            }
         }

         this.field1777[var1][var2][var3].field2878 = var23;
      } else {
         var21 = new class273(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field1777[var22][var2][var3] == null) {
               this.field1777[var22][var2][var3] = new class369(var22, var2, var3);
            }
         }

         this.field1777[var1][var2][var3].field2877 = var21;
      }
   }

   public void method1031(int var1, int var2, int var3, int var4, class496 var5, long var6, int var8) {
      if (var5 != null) {
         class189 var9 = new class189();
         var9.field1858 = var5;
         var9.field1859 = var2 * 128 + 64;
         var9.field1861 = var3 * 128 + 64;
         var9.field1856 = var4;
         var9.field1857 = var6;
         var9.field1860 = var8;
         if (this.field1777[var1][var2][var3] == null) {
            this.field1777[var1][var2][var3] = new class369(var1, var2, var3);
         }

         this.field1777[var1][var2][var3].field2881 = var9;
      }
   }

   public void method1032(int var1, int var2, int var3, int var4, class496 var5, long var6, class496 var8, class496 var9) {
      class501 var10 = new class501();
      var10.field3950 = var5;
      var10.field3954 = var2 * 128 + 64;
      var10.field3951 = var3 * 128 + 64;
      var10.field3948 = var4;
      var10.field3953 = var6;
      var10.field3949 = var8;
      var10.field3952 = var9;
      int var11 = 0;
      class369 var12 = this.field1777[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field2880; ++var13) {
            if ((var12.field2891[var13].field1636 & 256) == 256 && var12.field2891[var13].field1639 instanceof class104) {
               class104 var14 = (class104)var12.field2891[var13].field1639;
               var14.method758();
               if (var14.field3926 > var11) {
                  var11 = var14.field3926;
               }
            }
         }
      }

      var10.field3947 = var11;
      if (this.field1777[var1][var2][var3] == null) {
         this.field1777[var1][var2][var3] = new class369(var1, var2, var3);
      }

      this.field1777[var1][var2][var3].field2874 = var10;
   }

   public void method1053(int var1, int var2, int var3, int var4, class496 var5, class496 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class450 var12 = new class450();
         var12.field3492 = var9;
         var12.field3494 = var11;
         var12.field3486 = var2 * 128 + 64;
         var12.field3487 = var3 * 128 + 64;
         var12.field3489 = var4;
         var12.field3493 = var5;
         var12.field3491 = var6;
         var12.field3488 = var7;
         var12.field3490 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field1777[var13][var2][var3] == null) {
               this.field1777[var13][var2][var3] = new class369(var13, var2, var3);
            }
         }

         this.field1777[var1][var2][var3].field2884 = var12;
      }
   }

   public void method1068(int var1, int var2, int var3, int var4, class496 var5, class496 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class60 var14 = new class60();
         var14.field1104 = var11;
         var14.field1105 = var13;
         var14.field1095 = var2 * 128 + 64;
         var14.field1096 = var3 * 128 + 64;
         var14.field1100 = var4;
         var14.field1101 = var5;
         var14.field1102 = var6;
         var14.field1097 = var7;
         var14.field1098 = var8;
         var14.field1099 = var9;
         var14.field1094 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field1777[var15][var2][var3] == null) {
               this.field1777[var15][var2][var3] = new class369(var15, var2, var3);
            }
         }

         this.field1777[var1][var2][var3].field2883 = var14;
      }
   }

   public boolean method1033(int var1, int var2, int var3, int var4, int var5, int var6, class496 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + var5 * 64;
         int var13 = var3 * 128 + var6 * 64;
         return this.method1064(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean method1034(int var1, int var2, int var3, int var4, int var5, class496 var6, int var7, long var8, boolean var10) {
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
         return this.method1064(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method1035(int var1, int var2, int var3, int var4, int var5, class496 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method1064(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean method1064(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class496 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field1762 || var16 >= this.field1738) {
               return false;
            }

            class369 var17 = this.field1777[var1][var15][var16];
            if (var17 != null && var17.field2880 >= 5) {
               return false;
            }
         }
      }

      class154 var21 = new class154();
      var21.field1644 = var12;
      var21.field1636 = var14;
      var21.field1643 = var1;
      var21.field1634 = var6;
      var21.field1645 = var7;
      var21.field1633 = var8;
      var21.field1639 = var9;
      var21.field1632 = var10;
      var21.field1638 = var2;
      var21.field1640 = var3;
      var21.field1635 = var2 + var4 - 1;
      var21.field1641 = var3 + var5 - 1;

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
               if (this.field1777[var19][var16][var22] == null) {
                  this.field1777[var19][var16][var22] = new class369(var19, var16, var22);
               }
            }

            class369 var23 = this.field1777[var1][var16][var22];
            var23.field2891[var23.field2880] = var21;
            var23.field2885[var23.field2880] = var18;
            var23.field2886 |= var18;
            ++var23.field2880;
         }
      }

      if (var11) {
         this.field1743[this.field1742++] = var21;
      }

      return true;
   }

   public void method1073() {
      for(int var1 = 0; var1 < this.field1742; ++var1) {
         class154 var2 = this.field1743[var1];
         this.method1038(var2);
         this.field1743[var1] = null;
      }

      this.field1742 = 0;
   }

   void method1038(class154 var1) {
      for(int var2 = var1.field1638; var2 <= var1.field1635; ++var2) {
         for(int var3 = var1.field1640; var3 <= var1.field1641; ++var3) {
            class369 var4 = this.field1777[var1.field1643][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field2880; ++var5) {
                  if (var4.field2891[var5] == var1) {
                     --var4.field2880;

                     for(int var6 = var5; var6 < var4.field2880; ++var6) {
                        var4.field2891[var6] = var4.field2891[var6 + 1];
                        var4.field2885[var6] = var4.field2885[var6 + 1];
                     }

                     var4.field2891[var4.field2880] = null;
                     break;
                  }
               }

               var4.field2886 = 0;

               for(var5 = 0; var5 < var4.field2880; ++var5) {
                  var4.field2886 |= var4.field2885[var5];
               }
            }
         }
      }

   }

   public void method1036(int var1, int var2, int var3, int var4) {
      class369 var5 = this.field1777[var1][var2][var3];
      if (var5 != null) {
         class60 var6 = var5.field2883;
         if (var6 != null) {
            var6.field1099 = var6.field1099 * var4 / 16;
            var6.field1094 = var6.field1094 * var4 / 16;
         }
      }
   }

   public void method1069(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 != null) {
         var4.field2884 = null;
      }
   }

   public void method1037(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 != null) {
         var4.field2883 = null;
      }
   }

   public void method1070(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field2880; ++var5) {
            class154 var6 = var4.field2891[var5];
            long var8 = var6.field1644;
            boolean var7 = class256.method1470(var8) == 2;
            if (var7 && var6.field1638 == var2 && var6.field1640 == var3) {
               this.method1038(var6);
               return;
            }
         }

      }
   }

   public void method1039(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 != null) {
         var4.field2881 = null;
      }
   }

   public void method1040(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 != null) {
         var4.field2874 = null;
      }
   }

   public class450 method1041(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      return var4 == null ? null : var4.field2884;
   }

   public class60 method1042(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      return var4 == null ? null : var4.field2883;
   }

   public class154 method1079(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field2880; ++var5) {
            class154 var6 = var4.field2891[var5];
            long var8 = var6.field1644;
            boolean var7 = class256.method1470(var8) == 2;
            if (var7 && var6.field1638 == var2 && var6.field1640 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public class189 method1066(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      return var4 != null && var4.field2881 != null ? var4.field2881 : null;
   }

   public long method1062(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      return var4 != null && var4.field2884 != null ? var4.field2884.field3492 : 0L;
   }

   public long method1067(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      return var4 != null && var4.field2883 != null ? var4.field2883.field1104 : 0L;
   }

   public long method1043(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field2880; ++var5) {
            class154 var6 = var4.field2891[var5];
            long var8 = var6.field1644;
            boolean var7 = class256.method1470(var8) == 2;
            if (var7 && var6.field1638 == var2 && var6.field1640 == var3) {
               return var6.field1644;
            }
         }

         return 0L;
      }
   }

   public long method1076(int var1, int var2, int var3) {
      class369 var4 = this.field1777[var1][var2][var3];
      return var4 != null && var4.field2881 != null ? var4.field2881.field1857 : 0L;
   }

   public int method1044(int var1, int var2, int var3, long var4) {
      class369 var6 = this.field1777[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field2884 != null && var6.field2884.field3492 == var4) {
         return var6.field2884.field3494 & 255;
      } else if (var6.field2883 != null && var6.field2883.field1104 == var4) {
         return var6.field2883.field1105 & 255;
      } else if (var6.field2881 != null && var6.field2881.field1857 == var4) {
         return var6.field2881.field1860 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field2880; ++var7) {
            if (var6.field2891[var7].field1644 == var4) {
               return var6.field2891[var7].field1636 & 255;
            }
         }

         return -1;
      }
   }

   public void method1045(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1736; ++var4) {
         for(int var5 = 0; var5 < this.field1762; ++var5) {
            for(int var6 = 0; var6 < this.field1738; ++var6) {
               class369 var7 = this.field1777[var4][var5][var6];
               if (var7 != null) {
                  class450 var8 = var7.field2884;
                  class533 var10;
                  if (var8 != null && var8.field3493 instanceof class533) {
                     class533 var9 = (class533)var8.field3493;
                     this.method1046(var9, var4, var5, var6, 1, 1);
                     if (var8.field3491 instanceof class533) {
                        var10 = (class533)var8.field3491;
                        this.method1046(var10, var4, var5, var6, 1, 1);
                        class533.method2533(var9, var10, 0, 0, 0, false);
                        var8.field3491 = var10.method2534(var10.field4217, var10.field4206, var1, var2, var3);
                     }

                     var8.field3493 = var9.method2534(var9.field4217, var9.field4206, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field2880; ++var12) {
                     class154 var14 = var7.field2891[var12];
                     if (var14 != null && var14.field1639 instanceof class533) {
                        class533 var11 = (class533)var14.field1639;
                        this.method1046(var11, var4, var5, var6, var14.field1635 - var14.field1638 + 1, var14.field1641 - var14.field1640 + 1);
                        var14.field1639 = var11.method2534(var11.field4217, var11.field4206, var1, var2, var3);
                     }
                  }

                  class189 var13 = var7.field2881;
                  if (var13 != null && var13.field1858 instanceof class533) {
                     var10 = (class533)var13.field1858;
                     this.method1077(var10, var4, var5, var6);
                     var13.field1858 = var10.method2534(var10.field4217, var10.field4206, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void method1077(class533 var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.field1762) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.field1738 && (var9 >= var6 || var10 >= var8)) {
                  class369 var11 = this.field1777[var2][var9][var10];
                  if (var11 != null && var11.field2881 != null && var11.field2881.field1858 instanceof class533) {
                     int var12 = this.method1047(var2, var9, var10, var2, var3, var4);
                     class533 var13 = (class533)var11.field2881.field1858;
                     class533.method2533(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   void method1046(class533 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field1736) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field1762) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field1738 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class369 var15 = this.field1777[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.method1047(var12, var13, var14, var2, var3, var4);
                           class450 var17 = var15.field2884;
                           if (var17 != null) {
                              class533 var18;
                              if (var17.field3493 instanceof class533) {
                                 var18 = (class533)var17.field3493;
                                 class533.method2533(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field3491 instanceof class533) {
                                 var18 = (class533)var17.field3491;
                                 class533.method2533(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field2880; ++var23) {
                              class154 var19 = var15.field2891[var23];
                              if (var19 != null && var19.field1639 instanceof class533) {
                                 class533 var20 = (class533)var19.field1639;
                                 int var21 = var19.field1635 - var19.field1638 + 1;
                                 int var22 = var19.field1641 - var19.field1640 + 1;
                                 class533.method2533(var1, var20, (var19.field1638 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field1640 - var4) * 128 + (var22 - var6) * 64, var7);
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

   int method1047(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method1048(var1, var2, var3) - this.method1048(var4, var5, var6);
   }

   int method1048(int var1, int var2, int var3) {
      return (this.field1739[var1][var2][var3] + this.field1739[var1][var2 + 1][var3] + this.field1739[var1][var2][var3 + 1] + this.field1739[var1][var2 + 1][var3 + 1]) / 4;
   }

   public void method1049(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class369 var7 = this.field1777[var4][var5][var6];
      if (var7 != null) {
         class273 var8 = var7.field2877;
         int var10;
         if (var8 != null) {
            int var18 = var8.field2333;
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
            class416 var9 = var7.field2878;
            if (var9 != null) {
               var10 = var9.field3185;
               int var11 = var9.field3194;
               int var12 = var9.field3187;
               int var13 = var9.field3191;
               int[] var14 = this.field1786[var10];
               int[] var15 = this.field1784[var11];
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

   public void method1051(int var1, int var2, int var3, boolean var4) {
      if (!method1052() || var4) {
         field1753 = true;
         field1767 = var4;
         field1763 = var1;
         field1772 = var2;
         field1764 = var3;
         field1765 = -1;
         field1766 = -1;
      }
   }

   public void method1072() {
      field1767 = true;
   }

   public void method1054(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field1762 * 128) {
         var1 = this.field1762 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field1738 * 128) {
         var3 = this.field1738 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field1748;
      field1758 = class399.field3109[var4];
      field1759 = class399.field3107[var4];
      field1792 = class399.field3109[var5];
      field1760 = class399.field3107[var5];
      field1761 = field1785[(var4 - 128) / 32][var5 / 64];
      field1740 = var1;
      field1756 = var2;
      field1757 = var3;
      field1783 = var1 / 128;
      field1754 = var3 / 128;
      field1747 = var6;
      field1782 = field1783 - 25;
      if (field1782 < 0) {
         field1782 = 0;
      }

      field1751 = field1754 - 25;
      if (field1751 < 0) {
         field1751 = 0;
      }

      field1750 = field1783 + 25;
      if (field1750 > this.field1762) {
         field1750 = this.field1762;
      }

      field1752 = field1754 + 25;
      if (field1752 > this.field1738) {
         field1752 = this.field1738;
      }

      this.method1059();
      field1755 = 0;

      int var7;
      class369[][] var8;
      int var9;
      int var10;
      for(var7 = this.field1741; var7 < this.field1736; ++var7) {
         var8 = this.field1777[var7];

         for(var9 = field1782; var9 < field1750; ++var9) {
            for(var10 = field1751; var10 < field1752; ++var10) {
               class369 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field2887 > var6 || !field1761[var9 - field1783 + 25][var10 - field1754 + 25] && this.field1739[var7][var9][var10] - var2 < 2000) {
                     var11.field2888 = false;
                     var11.field2889 = false;
                     var11.field2882 = 0;
                  } else {
                     var11.field2888 = true;
                     var11.field2889 = true;
                     if (var11.field2880 > 0) {
                        var11.field2873 = true;
                     } else {
                        var11.field2873 = false;
                     }

                     ++field1755;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class369 var15;
      int var16;
      for(var7 = this.field1741; var7 < this.field1736; ++var7) {
         var8 = this.field1777[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field1783 + var9;
            var16 = field1783 - var9;
            if (var10 >= field1782 || var16 < field1750) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field1754 + var12;
                  var14 = field1754 - var12;
                  if (var10 >= field1782) {
                     if (var13 >= field1751) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, true);
                        }
                     }

                     if (var14 < field1752) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, true);
                        }
                     }
                  }

                  if (var16 < field1750) {
                     if (var13 >= field1751) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, true);
                        }
                     }

                     if (var14 < field1752) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, true);
                        }
                     }
                  }

                  if (field1755 == 0) {
                     field1753 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field1741; var7 < this.field1736; ++var7) {
         var8 = this.field1777[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field1783 + var9;
            var16 = field1783 - var9;
            if (var10 >= field1782 || var16 < field1750) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field1754 + var12;
                  var14 = field1754 - var12;
                  if (var10 >= field1782) {
                     if (var13 >= field1751) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, false);
                        }
                     }

                     if (var14 < field1752) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, false);
                        }
                     }
                  }

                  if (var16 < field1750) {
                     if (var13 >= field1751) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, false);
                        }
                     }

                     if (var14 < field1752) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field2888) {
                           this.method1055(var15, false);
                        }
                     }
                  }

                  if (field1755 == 0) {
                     field1753 = false;
                     return;
                  }
               }
            }
         }
      }

      field1753 = false;
   }

   void method1055(class369 var1, boolean var2) {
      field1774.method1240(var1);

      while(true) {
         class369 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class369[][] var8;
         class369 var9;
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
                              class450 var10;
                              class154 var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              class369 var33;
                              while(true) {
                                 do {
                                    var3 = (class369)field1774.method1234();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field2889);

                                 var4 = var3.field2879;
                                 var5 = var3.field2875;
                                 var6 = var3.field2892;
                                 var7 = var3.field2876;
                                 var8 = this.field1777[var6];
                                 if (!var3.field2888) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field1777[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field2889) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field1783 && var4 > field1782) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field2889 && (var9.field2888 || (var3.field2886 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field1783 && var4 < field1750 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field2889 && (var9.field2888 || (var3.field2886 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field1754 && var5 > field1751) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field2889 && (var9.field2888 || (var3.field2886 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field1754 && var5 < field1752 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field2889 && (var9.field2888 || (var3.field2886 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field2888 = false;
                                 if (var3.field2895 != null) {
                                    var9 = var3.field2895;
                                    if (var9.field2877 != null) {
                                       if (!this.method1078(0, var4, var5)) {
                                          this.method1056(var9.field2877, 0, field1758, field1759, field1792, field1760, var4, var5);
                                       }
                                    } else if (var9.field2878 != null && !this.method1078(0, var4, var5)) {
                                       this.method1074(var9.field2878, field1758, field1759, field1792, field1760, var4, var5);
                                    }

                                    var10 = var9.field2884;
                                    if (var10 != null) {
                                       var10.field3493.method2400(0, field1758, field1759, field1792, field1760, var10.field3486 - field1740, var10.field3489 - field1756, var10.field3487 - field1757, var10.field3492);
                                    }

                                    for(var11 = 0; var11 < var9.field2880; ++var11) {
                                       var12 = var9.field2891[var11];
                                       if (var12 != null) {
                                          var12.field1639.method2400(var12.field1632, field1758, field1759, field1792, field1760, var12.field1634 - field1740, var12.field1633 - field1756, var12.field1645 - field1757, var12.field1644);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.field2877 != null) {
                                    if (!this.method1078(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.field2877.field2329 != 12345678 || field1753 && var6 <= field1763) {
                                          this.method1056(var3.field2877, var7, field1758, field1759, field1792, field1760, var4, var5);
                                       }
                                    }
                                 } else if (var3.field2878 != null && !this.method1078(var7, var4, var5)) {
                                    var22 = true;
                                    this.method1074(var3.field2878, field1758, field1759, field1792, field1760, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class450 var23 = var3.field2884;
                                 class60 var13 = var3.field2883;
                                 if (var23 != null || var13 != null) {
                                    if (field1783 == var4) {
                                       ++var21;
                                    } else if (field1783 < var4) {
                                       var21 += 2;
                                    }

                                    if (field1754 == var5) {
                                       var21 += 3;
                                    } else if (field1754 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field1775[var21];
                                    var3.field2894 = field1745[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field3488 & field1776[var21]) != 0) {
                                       if (var23.field3488 == 16) {
                                          var3.field2882 = 3;
                                          var3.field2890 = field1778[var21];
                                          var3.field2893 = 3 - var3.field2890;
                                       } else if (var23.field3488 == 32) {
                                          var3.field2882 = 6;
                                          var3.field2890 = field1779[var21];
                                          var3.field2893 = 6 - var3.field2890;
                                       } else if (var23.field3488 == 64) {
                                          var3.field2882 = 12;
                                          var3.field2890 = field1780[var21];
                                          var3.field2893 = 12 - var3.field2890;
                                       } else {
                                          var3.field2882 = 9;
                                          var3.field2890 = field1781[var21];
                                          var3.field2893 = 9 - var3.field2890;
                                       }
                                    } else {
                                       var3.field2882 = 0;
                                    }

                                    if ((var23.field3488 & var11) != 0 && !this.method1060(var7, var4, var5, var23.field3488)) {
                                       var23.field3493.method2400(0, field1758, field1759, field1792, field1760, var23.field3486 - field1740, var23.field3489 - field1756, var23.field3487 - field1757, var23.field3492);
                                    }

                                    if ((var23.field3490 & var11) != 0 && !this.method1060(var7, var4, var5, var23.field3490)) {
                                       var23.field3491.method2400(0, field1758, field1759, field1792, field1760, var23.field3486 - field1740, var23.field3489 - field1756, var23.field3487 - field1757, var23.field3492);
                                    }
                                 }

                                 if (var13 != null && !this.method1061(var7, var4, var5, var13.field1101.field3926)) {
                                    if ((var13.field1097 & var11) != 0) {
                                       var13.field1101.method2400(0, field1758, field1759, field1792, field1760, var13.field1095 - field1740 + var13.field1099, var13.field1100 - field1756, var13.field1096 - field1757 + var13.field1094, var13.field1104);
                                    } else if (var13.field1097 == 256) {
                                       var14 = var13.field1095 - field1740;
                                       var15 = var13.field1100 - field1756;
                                       var16 = var13.field1096 - field1757;
                                       var17 = var13.field1098;
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
                                          var13.field1101.method2400(0, field1758, field1759, field1792, field1760, var14 + var13.field1099, var15, var16 + var13.field1094, var13.field1104);
                                       } else if (var13.field1102 != null) {
                                          var13.field1102.method2400(0, field1758, field1759, field1792, field1760, var14, var15, var16, var13.field1104);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    class189 var27 = var3.field2881;
                                    if (var27 != null) {
                                       var27.field1858.method2400(0, field1758, field1759, field1792, field1760, var27.field1859 - field1740, var27.field1856 - field1756, var27.field1861 - field1757, var27.field1857);
                                    }

                                    class501 var31 = var3.field2874;
                                    if (var31 != null && var31.field3947 == 0) {
                                       if (var31.field3949 != null) {
                                          var31.field3949.method2400(0, field1758, field1759, field1792, field1760, var31.field3954 - field1740, var31.field3948 - field1756, var31.field3951 - field1757, var31.field3953);
                                       }

                                       if (var31.field3952 != null) {
                                          var31.field3952.method2400(0, field1758, field1759, field1792, field1760, var31.field3954 - field1740, var31.field3948 - field1756, var31.field3951 - field1757, var31.field3953);
                                       }

                                       if (var31.field3950 != null) {
                                          var31.field3950.method2400(0, field1758, field1759, field1792, field1760, var31.field3954 - field1740, var31.field3948 - field1756, var31.field3951 - field1757, var31.field3953);
                                       }
                                    }
                                 }

                                 var14 = var3.field2886;
                                 if (var14 != 0) {
                                    if (var4 < field1783 && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.field2889) {
                                          field1774.method1240(var33);
                                       }
                                    }

                                    if (var5 < field1754 && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.field2889) {
                                          field1774.method1240(var33);
                                       }
                                    }

                                    if (var4 > field1783 && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.field2889) {
                                          field1774.method1240(var33);
                                       }
                                    }

                                    if (var5 > field1754 && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.field2889) {
                                          field1774.method1240(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field2882 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.field2880; ++var21) {
                                    if (var3.field2891[var21].field1637 != field1748 && (var3.field2885[var21] & var3.field2882) == var3.field2890) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.field2884;
                                    if (!this.method1060(var7, var4, var5, var10.field3488)) {
                                       var10.field3493.method2400(0, field1758, field1759, field1792, field1760, var10.field3486 - field1740, var10.field3489 - field1756, var10.field3487 - field1757, var10.field3492);
                                    }

                                    var3.field2882 = 0;
                                 }
                              }

                              if (!var3.field2873) {
                                 break;
                              }

                              try {
                                 int var25 = var3.field2880;
                                 var3.field2873 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.field2891[var11];
                                    if (var12.field1637 != field1748) {
                                       for(var26 = var12.field1638; var26 <= var12.field1635; ++var26) {
                                          for(var14 = var12.field1640; var14 <= var12.field1641; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.field2888) {
                                                var3.field2873 = true;
                                                continue label563;
                                             }

                                             if (var33.field2882 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.field1638) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.field1635) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field1640) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field1641) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.field2882) == var3.field2893) {
                                                   var3.field2873 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field1770[var21++] = var12;
                                       var26 = field1783 - var12.field1638;
                                       var14 = var12.field1635 - field1783;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = field1754 - var12.field1640;
                                       var16 = var12.field1641 - field1754;
                                       if (var16 > var15) {
                                          var12.field1642 = var26 + var16;
                                       } else {
                                          var12.field1642 = var26 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       class154 var34 = field1770[var26];
                                       if (var34.field1637 != field1748) {
                                          if (var34.field1642 > var11) {
                                             var11 = var34.field1642;
                                             var24 = var26;
                                          } else if (var34.field1642 == var11) {
                                             var15 = var34.field1634 - field1740;
                                             var16 = var34.field1645 - field1757;
                                             var17 = field1770[var24].field1634 - field1740;
                                             var18 = field1770[var24].field1645 - field1757;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    class154 var35 = field1770[var24];
                                    var35.field1637 = field1748;
                                    if (!this.method1030(var7, var35.field1638, var35.field1635, var35.field1640, var35.field1641, var35.field1639.field3926)) {
                                       var35.field1639.method2400(var35.field1632, field1758, field1759, field1792, field1760, var35.field1634 - field1740, var35.field1633 - field1756, var35.field1645 - field1757, var35.field1644);
                                    }

                                    for(var14 = var35.field1638; var14 <= var35.field1635; ++var14) {
                                       for(var15 = var35.field1640; var15 <= var35.field1641; ++var15) {
                                          class369 var36 = var8[var14][var15];
                                          if (var36.field2882 != 0) {
                                             field1774.method1240(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.field2889) {
                                             field1774.method1240(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field2873) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.field2873 = false;
                                 break;
                              }
                           }
                        } while(!var3.field2889);
                     } while(var3.field2882 != 0);

                     if (var4 > field1783 || var4 <= field1782) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field2889);

                  if (var4 < field1783 || var4 >= field1750 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field2889);

               if (var5 > field1754 || var5 <= field1751) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field2889);

            if (var5 < field1754 || var5 >= field1752 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field2889);

         var3.field2889 = false;
         --field1755;
         class501 var29 = var3.field2874;
         if (var29 != null && var29.field3947 != 0) {
            if (var29.field3949 != null) {
               var29.field3949.method2400(0, field1758, field1759, field1792, field1760, var29.field3954 - field1740, var29.field3948 - field1756 - var29.field3947, var29.field3951 - field1757, var29.field3953);
            }

            if (var29.field3952 != null) {
               var29.field3952.method2400(0, field1758, field1759, field1792, field1760, var29.field3954 - field1740, var29.field3948 - field1756 - var29.field3947, var29.field3951 - field1757, var29.field3953);
            }

            if (var29.field3950 != null) {
               var29.field3950.method2400(0, field1758, field1759, field1792, field1760, var29.field3954 - field1740, var29.field3948 - field1756 - var29.field3947, var29.field3951 - field1757, var29.field3953);
            }
         }

         if (var3.field2894 != 0) {
            class60 var30 = var3.field2883;
            if (var30 != null && !this.method1061(var7, var4, var5, var30.field1101.field3926)) {
               if ((var30.field1097 & var3.field2894) != 0) {
                  var30.field1101.method2400(0, field1758, field1759, field1792, field1760, var30.field1095 - field1740 + var30.field1099, var30.field1100 - field1756, var30.field1096 - field1757 + var30.field1094, var30.field1104);
               } else if (var30.field1097 == 256) {
                  var11 = var30.field1095 - field1740;
                  var24 = var30.field1100 - field1756;
                  var26 = var30.field1096 - field1757;
                  var14 = var30.field1098;
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
                     var30.field1101.method2400(0, field1758, field1759, field1792, field1760, var11 + var30.field1099, var24, var26 + var30.field1094, var30.field1104);
                  } else if (var30.field1102 != null) {
                     var30.field1102.method2400(0, field1758, field1759, field1792, field1760, var11, var24, var26, var30.field1104);
                  }
               }
            }

            class450 var28 = var3.field2884;
            if (var28 != null) {
               if ((var28.field3490 & var3.field2894) != 0 && !this.method1060(var7, var4, var5, var28.field3490)) {
                  var28.field3491.method2400(0, field1758, field1759, field1792, field1760, var28.field3486 - field1740, var28.field3489 - field1756, var28.field3487 - field1757, var28.field3492);
               }

               if ((var28.field3488 & var3.field2894) != 0 && !this.method1060(var7, var4, var5, var28.field3488)) {
                  var28.field3493.method2400(0, field1758, field1759, field1792, field1760, var28.field3486 - field1740, var28.field3489 - field1756, var28.field3487 - field1757, var28.field3492);
               }
            }
         }

         class369 var32;
         if (var6 < this.field1736 - 1) {
            var32 = this.field1777[var6 + 1][var4][var5];
            if (var32 != null && var32.field2889) {
               field1774.method1240(var32);
            }
         }

         if (var4 < field1783) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.field2889) {
               field1774.method1240(var32);
            }
         }

         if (var5 < field1754) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.field2889) {
               field1774.method1240(var32);
            }
         }

         if (var4 > field1783) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.field2889) {
               field1774.method1240(var32);
            }
         }

         if (var5 > field1754) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.field2889) {
               field1774.method1240(var32);
            }
         }
      }
   }

   void method1056(class273 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field1740;
      int var11;
      int var12 = var11 = (var8 << 7) - field1757;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field1739[var2][var7][var8] - field1756;
      int var18 = this.field1739[var2][var7 + 1][var8] - field1756;
      int var19 = this.field1739[var2][var7 + 1][var8 + 1] - field1756;
      int var20 = this.field1739[var2][var7][var8 + 1] - field1756;
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
                  int var22 = class399.method1936() + var10 * class399.method1941() / var12;
                  int var23 = class399.method1937() + var17 * class399.method1941() / var12;
                  int var24 = class399.method1936() + var14 * class399.method1941() / var11;
                  int var25 = class399.method1937() + var18 * class399.method1941() / var11;
                  int var26 = class399.method1936() + var13 * class399.method1941() / var16;
                  int var27 = class399.method1937() + var19 * class399.method1941() / var16;
                  int var28 = class399.method1936() + var9 * class399.method1941() / var15;
                  int var29 = class399.method1937() + var21 * class399.method1941() / var15;
                  float var30 = class243.method1447(var12);
                  float var31 = class243.method1447(var11);
                  float var32 = class243.method1447(var16);
                  float var33 = class243.method1447(var15);
                  class399.field3111.field2244 = 0;
                  int var34;
                  int var35;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class399.field3111.field2241 = false;
                     var34 = class399.method1942();
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) {
                        class399.field3111.field2241 = true;
                     }

                     if (field1753 && method1058(field1772, field1764, var27, var29, var25, var26, var28, var24)) {
                        field1765 = var7;
                        field1766 = var8;
                     }

                     if (var1.field2335 == -1) {
                        if (var1.field2329 != 12345678) {
                           class399.method1950(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2329, var1.field2331, var1.field2328);
                        }
                     } else if (!field1768) {
                        if (var1.field2332) {
                           class399.method1949(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2329, var1.field2331, var1.field2328, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2335);
                        } else {
                           class399.method1949(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.field2329, var1.field2331, var1.field2328, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2335);
                        }
                     } else {
                        var35 = class399.field3111.field2239.method943(var1.field2335);
                        class399.method1950(var27, var29, var25, var26, var28, var24, var32, var33, var31, method1057(var35, var1.field2329), method1057(var35, var1.field2331), method1057(var35, var1.field2328));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class399.field3111.field2241 = false;
                     var34 = class399.method1942();
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) {
                        class399.field3111.field2241 = true;
                     }

                     if (field1753 && method1058(field1772, field1764, var23, var25, var29, var22, var24, var28)) {
                        field1765 = var7;
                        field1766 = var8;
                     }

                     if (var1.field2335 == -1) {
                        if (var1.field2330 != 12345678) {
                           class399.method1950(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field2330, var1.field2328, var1.field2331);
                        }
                     } else if (!field1768) {
                        class399.method1949(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.field2330, var1.field2328, var1.field2331, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2335);
                     } else {
                        var35 = class399.field3111.field2239.method943(var1.field2335);
                        class399.method1950(var23, var25, var29, var22, var24, var28, var30, var31, var33, method1057(var35, var1.field2330), method1057(var35, var1.field2328), method1057(var35, var1.field2331));
                     }
                  }

               }
            }
         }
      }
   }

   void method1074(class416 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field3193.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field3193[var9] - field1740;
         var11 = var1.field3175[var9] - field1756;
         var12 = var1.field3176[var9] - field1757;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field3183 != null) {
            class416.field3192[var9] = var10;
            class416.field3189[var9] = var13;
            class416.field3181[var9] = var12;
         }

         class416.field3178[var9] = class399.method1936() + var10 * class399.method1941() / var12;
         class416.field3190[var9] = class399.method1937() + var13 * class399.method1941() / var12;
         class416.field3186[var9] = class243.method1447(var12);
      }

      class399.field3111.field2244 = 0;
      var8 = var1.field3180.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field3180[var9];
         var11 = var1.field3188[var9];
         var12 = var1.field3195[var9];
         var13 = class416.field3178[var10];
         int var14 = class416.field3178[var11];
         int var15 = class416.field3178[var12];
         int var16 = class416.field3190[var10];
         int var17 = class416.field3190[var11];
         int var18 = class416.field3190[var12];
         float var19 = class416.field3186[var10];
         float var20 = class416.field3186[var11];
         float var21 = class416.field3186[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class399.field3111.field2241 = false;
            int var22 = class399.method1942();
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) {
               class399.field3111.field2241 = true;
            }

            if (field1753 && method1058(field1772, field1764, var16, var17, var18, var13, var14, var15)) {
               field1765 = var6;
               field1766 = var7;
            }

            if (var1.field3183 != null && var1.field3183[var9] != -1) {
               if (!field1768) {
                  if (var1.field3184) {
                     class399.method1949(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field3182[var9], var1.field3177[var9], var1.field3179[var9], class416.field3192[0], class416.field3192[1], class416.field3192[3], class416.field3189[0], class416.field3189[1], class416.field3189[3], class416.field3181[0], class416.field3181[1], class416.field3181[3], var1.field3183[var9]);
                  } else {
                     class399.method1949(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field3182[var9], var1.field3177[var9], var1.field3179[var9], class416.field3192[var10], class416.field3192[var11], class416.field3192[var12], class416.field3189[var10], class416.field3189[var11], class416.field3189[var12], class416.field3181[var10], class416.field3181[var11], class416.field3181[var12], var1.field3183[var9]);
                  }
               } else {
                  int var23 = class399.field3111.field2239.method943(var1.field3183[var9]);
                  class399.method1950(var16, var17, var18, var13, var14, var15, var19, var20, var21, method1057(var23, var1.field3182[var9]), method1057(var23, var1.field3177[var9]), method1057(var23, var1.field3179[var9]));
               }
            } else if (var1.field3182[var9] != 12345678) {
               class399.method1950(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.field3182[var9], var1.field3177[var9], var1.field3179[var9]);
            }
         }
      }

   }

   void method1059() {
      int var1 = field1790[field1747];
      class185[] var2 = field1769[field1747];
      field1789 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class185 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field1824 == 1) {
            var5 = var4.field1836 - field1783 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field1822 - field1754 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1827 - field1754 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field1761[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field1740 - var4.field1825;
                  if (var9 > 32) {
                     var4.field1831 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field1831 = 2;
                     var9 = -var9;
                  }

                  var4.field1834 = (var4.field1837 - field1757 << 8) / var9;
                  var4.field1838 = (var4.field1833 - field1757 << 8) / var9;
                  var4.field1828 = (var4.field1829 - field1756 << 8) / var9;
                  var4.field1820 = (var4.field1830 - field1756 << 8) / var9;
                  field1773[field1789++] = var4;
               }
            }
         } else if (var4.field1824 == 2) {
            var5 = var4.field1822 - field1754 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field1836 - field1783 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1821 - field1783 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field1761[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field1757 - var4.field1837;
                  if (var9 > 32) {
                     var4.field1831 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field1831 = 4;
                     var9 = -var9;
                  }

                  var4.field1832 = (var4.field1825 - field1740 << 8) / var9;
                  var4.field1835 = (var4.field1826 - field1740 << 8) / var9;
                  var4.field1828 = (var4.field1829 - field1756 << 8) / var9;
                  var4.field1820 = (var4.field1830 - field1756 << 8) / var9;
                  field1773[field1789++] = var4;
               }
            }
         } else if (var4.field1824 == 4) {
            var5 = var4.field1829 - field1756;
            if (var5 > 128) {
               var6 = var4.field1822 - field1754 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1827 - field1754 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field1836 - field1783 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field1821 - field1783 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label145:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field1761[var11][var12]) {
                           var10 = true;
                           break label145;
                        }
                     }
                  }

                  if (var10) {
                     var4.field1831 = 5;
                     var4.field1832 = (var4.field1825 - field1740 << 8) / var5;
                     var4.field1835 = (var4.field1826 - field1740 << 8) / var5;
                     var4.field1834 = (var4.field1837 - field1757 << 8) / var5;
                     var4.field1838 = (var4.field1833 - field1757 << 8) / var5;
                     field1773[field1789++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean method1078(int var1, int var2, int var3) {
      int var4 = this.field1744[var1][var2][var3];
      if (var4 == -field1748) {
         return false;
      } else if (var4 == field1748) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method1071(var5 + 1, this.field1739[var1][var2][var3], var6 + 1) && this.method1071(var5 + 128 - 1, this.field1739[var1][var2 + 1][var3], var6 + 1) && this.method1071(var5 + 128 - 1, this.field1739[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1071(var5 + 1, this.field1739[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field1744[var1][var2][var3] = field1748;
            return true;
         } else {
            this.field1744[var1][var2][var3] = -field1748;
            return false;
         }
      }
   }

   boolean method1060(int var1, int var2, int var3, int var4) {
      if (!this.method1078(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field1739[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field1740) {
                  if (!this.method1071(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method1071(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1071(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method1071(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1071(var5, var9, var6)) {
                  return false;
               }

               if (!this.method1071(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field1757) {
                  if (!this.method1071(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method1071(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1071(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method1071(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1071(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method1071(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field1740) {
                  if (!this.method1071(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method1071(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1071(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method1071(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1071(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method1071(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field1757) {
                  if (!this.method1071(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method1071(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1071(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method1071(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method1071(var5, var9, var6)) {
                  return false;
               }

               if (!this.method1071(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method1071(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method1071(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method1071(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method1071(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method1071(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean method1061(int var1, int var2, int var3, int var4) {
      if (!this.method1078(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method1071(var5 + 1, this.field1739[var1][var2][var3] - var4, var6 + 1) && this.method1071(var5 + 128 - 1, this.field1739[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1071(var5 + 128 - 1, this.field1739[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1071(var5 + 1, this.field1739[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method1030(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.method1078(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method1071(var7 + 1, this.field1739[var1][var2][var4] - var6, var8 + 1) && this.method1071(var7 + 128 - 1, this.field1739[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1071(var7 + 128 - 1, this.field1739[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1071(var7 + 1, this.field1739[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field1744[var1][var7][var8] == -field1748) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field1739[var1][var2][var4] - var6;
         if (!this.method1071(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method1071(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method1071(var7, var9, var11)) {
                  return false;
               } else if (!this.method1071(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method1071(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1789; ++var4) {
         class185 var5 = field1773[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field1831 == 1) {
            var6 = var5.field1825 - var1;
            if (var6 > 0) {
               var7 = var5.field1837 + (var5.field1834 * var6 >> 8);
               var8 = var5.field1833 + (var5.field1838 * var6 >> 8);
               var9 = var5.field1829 + (var5.field1828 * var6 >> 8);
               var10 = var5.field1830 + (var5.field1820 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1831 == 2) {
            var6 = var1 - var5.field1825;
            if (var6 > 0) {
               var7 = var5.field1837 + (var5.field1834 * var6 >> 8);
               var8 = var5.field1833 + (var5.field1838 * var6 >> 8);
               var9 = var5.field1829 + (var5.field1828 * var6 >> 8);
               var10 = var5.field1830 + (var5.field1820 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1831 == 3) {
            var6 = var5.field1837 - var3;
            if (var6 > 0) {
               var7 = var5.field1825 + (var5.field1832 * var6 >> 8);
               var8 = var5.field1826 + (var5.field1835 * var6 >> 8);
               var9 = var5.field1829 + (var5.field1828 * var6 >> 8);
               var10 = var5.field1830 + (var5.field1820 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1831 == 4) {
            var6 = var3 - var5.field1837;
            if (var6 > 0) {
               var7 = var5.field1825 + (var5.field1832 * var6 >> 8);
               var8 = var5.field1826 + (var5.field1835 * var6 >> 8);
               var9 = var5.field1829 + (var5.field1828 * var6 >> 8);
               var10 = var5.field1830 + (var5.field1820 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1831 == 5) {
            var6 = var2 - var5.field1829;
            if (var6 > 0) {
               var7 = var5.field1825 + (var5.field1832 * var6 >> 8);
               var8 = var5.field1826 + (var5.field1835 * var6 >> 8);
               var9 = var5.field1837 + (var5.field1834 * var6 >> 8);
               var10 = var5.field1833 + (var5.field1838 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void method1029(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class185 var8 = new class185();
      var8.field1836 = var2 / 128;
      var8.field1821 = var3 / 128;
      var8.field1822 = var4 / 128;
      var8.field1827 = var5 / 128;
      var8.field1824 = var1;
      var8.field1825 = var2;
      var8.field1826 = var3;
      var8.field1837 = var4;
      var8.field1833 = var5;
      var8.field1829 = var6;
      var8.field1830 = var7;
      field1769[var0][field1790[var0]++] = var8;
   }

   public static void method1063(int[] var0, int var1, int var2, int var3, int var4) {
      field1737 = 0;
      field1771 = 0;
      field1791 = var3;
      field1749 = var4;
      field1787 = var3 / 2;
      field1788 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field1758 = class399.field3109[var6];
            field1759 = class399.field3107[var6];
            field1792 = class399.field3109[var7];
            field1760 = class399.field3107[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method1050(var12, var0[var8] + var15, var13)) {
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

                  field1785[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static boolean method1050(int var0, int var1, int var2) {
      int var3 = var2 * field1792 + var0 * field1760 >> 16;
      int var4 = var2 * field1760 - var0 * field1792 >> 16;
      int var5 = var1 * field1758 + var4 * field1759 >> 16;
      int var6 = var1 * field1759 - var4 * field1758 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = field1787 + var3 * 128 / var5;
         int var8 = field1788 + var6 * 128 / var5;
         return var7 >= field1737 && var7 <= field1791 && var8 >= field1771 && var8 <= field1749;
      } else {
         return false;
      }
   }

   public static boolean method1052() {
      return field1767 && field1765 != -1;
   }

   public static void method1075() {
      field1765 = -1;
      field1767 = false;
   }

   static final int method1057(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static boolean method1058(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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
