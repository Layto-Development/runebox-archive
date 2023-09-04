final class class440 implements class139 {
   // $FF: synthetic field
   final class322 val$cc;

   class440(class322 var1) {
      this.val$cc = var1;
   }

   public void method502() {
      if (null != this.val$cc && this.val$cc.method1470().field1554 != null) {
         class64 var2 = new class64();
         var2.method284(this.val$cc);
         var2.method285(this.val$cc.method1470().field1554);
         Client.method796().method1995(var2);
      }

   }

   static void method2043(class396 var0, class396 var1, class396 var2) {
      class292.field1983 = (class114.field730 - 765) / 2;
      class292.field1989 = class292.field1983 + 202;
      class439.field3479 = class292.field1989 + 180;
      int var4;
      int var5;
      int var10;
      boolean var16;
      int var18;
      int var19;
      int var26;
      int var27;
      int var29;
      int var31;
      int var35;
      int var37;
      if (class292.field2008) {
         if (class154.field973 == null) {
            class154.field973 = class382.method1759(class62.field492, "sl_back", "");
         }

         if (null == class41.field345) {
            class41.field345 = class382.method1768(class62.field492, "sl_flags", "");
         }

         if (null == class500.field4001) {
            class500.field4001 = class382.method1768(class62.field492, "sl_arrows", "");
         }

         if (class502.field4011 == null) {
            class502.field4011 = class382.method1768(class62.field492, "sl_stars", "");
         }

         if (class204.field1574 == null) {
            class204.field1574 = class382.method1766(class62.field492, "leftarrow", "");
         }

         if (null == class344.field2563) {
            class344.field2563 = class382.method1766(class62.field492, "rightarrow", "");
         }

         class427.method1968(class292.field1983, 23, 765, 480, 0);
         class427.method1969(class292.field1983, 0, 125, 23, 12425273, 9135624);
         class427.method1969(class292.field1983 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method1922(class424.field3298, 62 + class292.field1983, 15, 0, -1);
         if (null != class502.field4011) {
            class502.field4011[1].method2394(140 + class292.field1983, 1);
            var1.method1943(class424.field3026, 152 + class292.field1983, 10, 16777215, -1);
            class502.field4011[0].method2394(class292.field1983 + 140, 12);
            var1.method1943(class424.field3084, class292.field1983 + 152, 21, 16777215, -1);
         }

         if (class500.field4001 != null) {
            var4 = class292.field1983 + 280;
            if (0 == class518.field4145[0] && class518.field4144[0] == 0) {
               class500.field4001[2].method2394(var4, 4);
            } else {
               class500.field4001[0].method2394(var4, 4);
            }

            if (class518.field4145[0] == 0 && 1 == class518.field4144[0]) {
               class500.field4001[3].method2394(var4 + 15, 4);
            } else {
               class500.field4001[1].method2394(var4 + 15, 4);
            }

            var0.method1943(class424.field3301, var4 + 32, 17, 16777215, -1);
            var5 = class292.field1983 + 390;
            if (class518.field4145[0] == 1 && 0 == class518.field4144[0]) {
               class500.field4001[2].method2394(var5, 4);
            } else {
               class500.field4001[0].method2394(var5, 4);
            }

            if (class518.field4145[0] == 1 && class518.field4144[0] == 1) {
               class500.field4001[3].method2394(var5 + 15, 4);
            } else {
               class500.field4001[1].method2394(var5 + 15, 4);
            }

            var0.method1943(class424.field3302, var5 + 32, 17, 16777215, -1);
            var26 = 500 + class292.field1983;
            if (class518.field4145[0] == 2 && class518.field4144[0] == 0) {
               class500.field4001[2].method2394(var26, 4);
            } else {
               class500.field4001[0].method2394(var26, 4);
            }

            if (2 == class518.field4145[0] && class518.field4144[0] == 1) {
               class500.field4001[3].method2394(var26 + 15, 4);
            } else {
               class500.field4001[1].method2394(var26 + 15, 4);
            }

            var0.method1943(class424.field3303, var26 + 32, 17, 16777215, -1);
            var27 = 610 + class292.field1983;
            if (class518.field4145[0] == 3 && 0 == class518.field4144[0]) {
               class500.field4001[2].method2394(var27, 4);
            } else {
               class500.field4001[0].method2394(var27, 4);
            }

            if (3 == class518.field4145[0] && class518.field4144[0] == 1) {
               class500.field4001[3].method2394(var27 + 15, 4);
            } else {
               class500.field4001[1].method2394(var27 + 15, 4);
            }

            var0.method1943(class424.field3304, var27 + 32, 17, 16777215, -1);
         }

         class427.method1968(708 + class292.field1983, 4, 50, 16, 0);
         var1.method1922(class424.field3244, 25 + 708 + class292.field1983, 16, 16777215, -1);
         class292.field2009 = -1;
         if (class154.field973 != null) {
            byte var46 = 88;
            byte var42 = 19;
            var26 = 765 / (var46 + 1) - 1;
            var27 = 480 / (var42 + 1);

            do {
               var29 = var27;
               var31 = var26;
               if (var27 * (var26 - 1) >= class518.field4147) {
                  --var26;
               }

               if ((var27 - 1) * var26 >= class518.field4147) {
                  --var27;
               }

               if (var26 * (var27 - 1) >= class518.field4147) {
                  --var27;
               }
            } while(var29 != var27 || var31 != var26);

            var29 = (765 - var46 * var26) / (var26 + 1);
            if (var29 > 5) {
               var29 = 5;
            }

            var31 = (480 - var42 * var27) / (var27 + 1);
            if (var31 > 5) {
               var31 = 5;
            }

            var10 = (765 - var26 * var46 - (var26 - 1) * var29) / 2;
            int var36 = (480 - var27 * var42 - (var27 - 1) * var31) / 2;
            var35 = (class518.field4147 + var27 - 1) / var27;
            class292.field2015 = var35 - var26;
            if (class204.field1574 != null && class292.field2010 > 0) {
               class204.field1574.method2394(8, class394.field2761 / 2 - class204.field1574.field4006 / 2);
            }

            if (null != class344.field2563 && class292.field2010 < class292.field2015) {
               class344.field2563.method2394(class114.field730 - class344.field2563.field4005 - 8, class394.field2761 / 2 - class344.field2563.field4006 / 2);
            }

            var37 = var36 + 23;
            int var14 = class292.field1983 + var10;
            int var40 = 0;
            var16 = false;
            int var41 = class292.field2010;

            for(var18 = var27 * var41; var18 < class518.field4147 && var41 - class292.field2010 < var26; ++var18) {
               class518 var43 = class27.field263[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var43.field4148);
               if (-1 == var43.field4148) {
                  var21 = class424.field3305;
                  var20 = false;
               } else if (var43.field4148 > 1980) {
                  var21 = class424.field3200;
                  var20 = false;
               }

               class239 var22 = null;
               int var23 = 0;
               if (var43.method2487()) {
                  var22 = var43.method2480() ? class239.field1749 : class239.field1759;
               } else if (var43.method2481()) {
                  var22 = var43.method2480() ? class239.field1758 : class239.field1751;
               } else if (var43.method2484()) {
                  var23 = 16711680;
                  var22 = var43.method2480() ? class239.field1748 : class239.field1743;
               } else if (var43.method2485()) {
                  var22 = var43.method2480() ? class239.field1747 : class239.field1752;
               } else if (var43.method2490()) {
                  var22 = var43.method2480() ? class239.field1746 : class239.field1750;
               } else if (var43.method2489()) {
                  var22 = var43.method2480() ? class239.field1754 : class239.field1753;
               } else if (var43.method2486()) {
                  var22 = var43.method2480() ? class239.field1756 : class239.field1755;
               }

               if (var22 == null || var22.field1757 >= class154.field973.length) {
                  var22 = var43.method2480() ? class239.field1744 : class239.field1745;
               }

               if (class496.field3977 >= var14 && class496.field3960 >= var37 && class496.field3977 < var14 + var46 && class496.field3960 < var37 + var42 && var20) {
                  class292.field2009 = var18;
                  class154.field973[var22.field1757].method1350(var14, var37, 128, 16777215);
                  var16 = true;
               } else {
                  class154.field973[var22.field1757].method1346(var14, var37);
               }

               if (class41.field345 != null) {
                  class41.field345[(var43.method2480() ? 8 : 0) + var43.field4151].method2394(var14 + 29, var37);
               }

               var0.method1922(Integer.toString(var43.field4146), var14 + 15, 5 + var37 + var42 / 2, var23, -1);
               var1.method1922(var21, var14 + 60, 5 + var42 / 2 + var37, 268435455, -1);
               var37 += var42 + var31;
               ++var40;
               if (var40 >= var27) {
                  var37 = var36 + 23;
                  var14 += var46 + var29;
                  var40 = 0;
                  ++var41;
               }
            }

            if (var16) {
               var18 = var1.method1915(class27.field263[class292.field2009].field4150) + 6;
               var19 = var1.field2946 + 8;
               int var44 = class496.field3960 + 25;
               if (var19 + var44 > 480) {
                  var44 = class496.field3960 - 25 - var19;
               }

               class427.method1968(class496.field3977 - var18 / 2, var44, var18, var19, 16777120);
               class427.method1971(class496.field3977 - var18 / 2, var44, var18, var19, 0);
               var1.method1922(class27.field263[class292.field2009].field4150, class496.field3977, var44 + var1.field2946 + 4, 0, -1);
            }
         }

      } else {
         class292.field1987.method1346(class292.field1983, 0);
         class205.field1579.method1346(class292.field1983 + 382, 0);
         class35.field308.method2394(382 + class292.field1983 - class35.field308.field4005 / 2, 18);
         if (Client.field1200 == 0 || Client.field1200 == 5) {
            var4 = 20;
            var0.method1922(class424.field3191, class292.field1989 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class427.method1971(180 + class292.field1989 - 152, var5, 304, 34, 9179409);
            class427.method1971(180 + class292.field1989 - 151, var5 + 1, 302, 32, 0);
            class427.method1968(180 + class292.field1989 - 150, var5 + 2, class292.field1990 * 3, 30, 9179409);
            class427.method1968(180 + class292.field1989 - 150 + class292.field1990 * 3, var5 + 2, 300 - class292.field1990 * 3, 30, 0);
            var0.method1922(class292.field1991, 180 + class292.field1989, 276 - var4, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         String var9;
         short var24;
         if (20 == Client.field1200) {
            class292.field1985.method2394(180 + class292.field1989 - class292.field1985.field4005 / 2, 271 - class292.field1985.field4006 / 2);
            var4 = 201;
            var0.method1922(class292.field1998, 180 + class292.field1989, var4, 16776960, 0);
            var4 += 15;
            var0.method1922(class292.field1996, 180 + class292.field1989, var4, 16776960, 0);
            var4 += 15;
            var0.method1922(class292.field1997, 180 + class292.field1989, var4, 16776960, 0);
            var4 += 15;
            var4 += 7;
            if (class292.field1994 != 4 && 10 != class292.field1994) {
               var0.method1943(class424.field3237, 180 + class292.field1989 - 110, var4, 16777215, 0);
               var24 = 200;

               for(var6 = class292.method1323(); var0.method1915(var6) > var24; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.method1943(class419.method1928(var6), class292.field1989 + 180 - 70, var4, 16777215, 0);
               var4 += 15;
               var8 = class292.field2000;
               var7 = class447.method2091('*', var8.length());

               for(var9 = var7; var0.method1915(var9) > var24; var9 = var9.substring(1)) {
               }

               var0.method1943(class424.field3238 + var9, 180 + class292.field1989 - 108, var4, 16777215, 0);
               var4 += 15;
            }
         }

         if (Client.field1200 == 10 || Client.field1200 == 11 || 50 == Client.field1200) {
            class292.field1985.method2394(class292.field1989, 171);
            short var25;
            if (0 == class292.field1994) {
               var25 = 251;
               var0.method1922(class424.field3282, 180 + class292.field1989, var25, 16776960, 0);
               var4 = var25 + 30;
               var5 = class292.field1989 + 180 - 80;
               var26 = 291;
               class530.field4183.method2394(var5 - 73, var26 - 20);
               var0.method1914(class424.field3241, var5 - 73, var26 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = 80 + class292.field1989 + 180;
               class530.field4183.method2394(var5 - 73, var26 - 20);
               var0.method1914(class424.field3242, var5 - 73, var26 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class292.field1994 == 1) {
               var0.method1922(class292.field2016, class292.field1989 + 180, 201, 16776960, 0);
               var25 = 236;
               var0.method1922(class292.field1998, 180 + class292.field1989, var25, 16777215, 0);
               var4 = var25 + 15;
               var0.method1922(class292.field1996, 180 + class292.field1989, var4, 16777215, 0);
               var4 += 15;
               var0.method1922(class292.field1997, class292.field1989 + 180, var4, 16777215, 0);
               var4 += 15;
               var5 = class292.field1989 + 180 - 80;
               var26 = 321;
               class530.field4183.method2394(var5 - 73, var26 - 20);
               var0.method1922(class424.field3007, var5, var26 + 5, 16777215, 0);
               var5 = 80 + 180 + class292.field1989;
               class530.field4183.method2394(var5 - 73, var26 - 20);
               var0.method1922(class424.field3244, var5, var26 + 5, 16777215, 0);
            } else {
               class501 var11;
               if (class292.field1994 == 2) {
                  var25 = 201;
                  var0.method1922(class292.field1998, class439.field3479, var25, 16776960, 0);
                  var4 = var25 + 15;
                  var0.method1922(class292.field1996, class439.field3479, var4, 16776960, 0);
                  var4 += 15;
                  var0.method1922(class292.field1997, class439.field3479, var4, 16776960, 0);
                  var4 += 15;
                  var4 += 7;
                  var0.method1943(class424.field3237, class439.field3479 - 110, var4, 16777215, 0);
                  var24 = 200;

                  for(var6 = class292.method1323(); var0.method1915(var6) > var24; var6 = var6.substring(1)) {
                  }

                  var0.method1943(class419.method1928(var6) + (0 == class292.field2005 & Client.field1419 % 40 < 20 ? class389.method1778(16776960) + class389.field2748 : ""), class439.field3479 - 70, var4, 16777215, 0);
                  var4 += 15;
                  var8 = class292.field2000;
                  var7 = class447.method2091('*', var8.length());

                  for(var9 = var7; var0.method1915(var9) > var24; var9 = var9.substring(1)) {
                  }

                  var0.method1943(class424.field3238 + var9 + (class292.field2005 == 1 & Client.field1419 % 40 < 20 ? class389.method1778(16776960) + class389.field2748 : ""), class439.field3479 - 108, var4, 16777215, 0);
                  var4 += 15;
                  var25 = 277;
                  var10 = -117 + class439.field3479;
                  boolean var12 = Client.field1170;
                  boolean var13 = class292.field1988;
                  var11 = var12 ? (var13 ? class422.field2978 : class413.field2896) : (var13 ? class472.field3744 : class292.field1982);
                  var11.method2394(var10, var25);
                  var10 += var11.field4005 + 5;
                  var1.method1943(class424.field3245, var10, var25 + 13, 16776960, 0);
                  var10 = 24 + class439.field3479;
                  var16 = class158.field1004.method513();
                  boolean var17 = class292.field2011;
                  class501 var15 = var16 ? (var17 ? class422.field2978 : class413.field2896) : (var17 ? class472.field3744 : class292.field1982);
                  var15.method2394(var10, var25);
                  var10 += var15.field4005 + 5;
                  var1.method1943(class424.field3199, var10, var25 + 13, 16776960, 0);
                  var4 = var25 + 15;
                  var18 = class439.field3479 - 80;
                  var19 = 321;
                  class530.field4183.method2394(var18 - 73, var19 - 20);
                  var0.method1922(class424.field3198, var18, var19 + 5, 16777215, 0);
                  var18 = 80 + class439.field3479;
                  class530.field4183.method2394(var18 - 73, var19 - 20);
                  var0.method1922(class424.field3244, var18, var19 + 5, 16777215, 0);
                  var25 = 357;
                  switch (class292.field1993) {
                     case 2:
                        class380.field2703 = class424.field3258;
                        break;
                     default:
                        class380.field2703 = class424.field3209;
                  }

                  class194.field1517 = new class205(class439.field3479, var25, var1.method1915(class380.field2703), 11);
                  class67.field520 = new class205(class439.field3479, var25, var1.method1915(class424.field3257), 11);
                  var1.method1922(class380.field2703, class439.field3479, var25, 16777215, 0);
               } else if (class292.field1994 == 3) {
                  var25 = 201;
                  var0.method1922(class424.field3252, 180 + class292.field1989, var25, 16776960, 0);
                  var4 = var25 + 20;
                  var1.method1922(class424.field3064, class292.field1989 + 180, var4, 16776960, 0);
                  var4 += 20;
                  var1.method1922(class424.field3249, 180 + class292.field1989, var4, 16776960, 0);
                  var4 += 15;
                  var5 = class292.field1989 + 180;
                  var26 = 276;
                  class530.field4183.method2394(var5 - 73, var26 - 20);
                  var2.method1922(class424.field3250, var5, var26 + 5, 16777215, 0);
                  var5 = class292.field1989 + 180;
                  var26 = 326;
                  class530.field4183.method2394(var5 - 73, var26 - 20);
                  var2.method1922(class424.field3251, var5, var26 + 5, 16777215, 0);
               } else if (class292.field1994 == 4) {
                  var0.method1922(class424.field3227, 180 + class292.field1989, 201, 16776960, 0);
                  var25 = 236;
                  var0.method1922(class292.field1998, 180 + class292.field1989, var25, 16777215, 0);
                  var4 = var25 + 15;
                  var0.method1922(class292.field1996, 180 + class292.field1989, var4, 16777215, 0);
                  var4 += 15;
                  var0.method1922(class292.field1997, class292.field1989 + 180, var4, 16777215, 0);
                  var4 += 15;
                  var6 = class424.field3239;
                  var8 = class95.field666;
                  var7 = class447.method2091('*', var8.length());
                  var0.method1943(var6 + var7 + (Client.field1419 % 40 < 20 ? class389.method1778(16776960) + class389.field2748 : ""), class292.field1989 + 180 - 108, var4, 16777215, 0);
                  var4 -= 8;
                  var0.method1943(class424.field3010, class292.field1989 + 180 - 9, var4, 16776960, 0);
                  var4 += 15;
                  var0.method1943(class424.field3127, 180 + class292.field1989 - 9, var4, 16776960, 0);
                  var31 = class292.field1989 + 180 - 9 + var0.method1915(class424.field3127) + 15;
                  var10 = var4 - var0.field2946;
                  if (class292.field2004) {
                     var11 = class413.field2896;
                  } else {
                     var11 = class292.field1982;
                  }

                  var11.method2394(var31, var10);
                  var4 += 15;
                  var35 = class292.field1989 + 180 - 80;
                  var37 = 321;
                  class530.field4183.method2394(var35 - 73, var37 - 20);
                  var0.method1922(class424.field3007, var35, var37 + 5, 16777215, 0);
                  var35 = 80 + 180 + class292.field1989;
                  class530.field4183.method2394(var35 - 73, var37 - 20);
                  var0.method1922(class424.field3244, var35, var37 + 5, 16777215, 0);
                  var1.method1922(class424.field3209, class292.field1989 + 180, var37 + 36, 16777215, 0);
               } else if (class292.field1994 == 5) {
                  var0.method1922(class424.field3201, 180 + class292.field1989, 201, 16776960, 0);
                  var25 = 221;
                  var2.method1922(class292.field1998, class292.field1989 + 180, var25, 16776960, 0);
                  var4 = var25 + 15;
                  var2.method1922(class292.field1996, class292.field1989 + 180, var4, 16776960, 0);
                  var4 += 15;
                  var2.method1922(class292.field1997, 180 + class292.field1989, var4, 16776960, 0);
                  var4 += 15;
                  var4 += 14;
                  var0.method1943(class424.field3123, class292.field1989 + 180 - 145, var4, 16777215, 0);
                  var24 = 174;

                  for(var6 = class292.method1323(); var0.method1915(var6) > var24; var6 = var6.substring(1)) {
                  }

                  var0.method1943(class419.method1928(var6) + (Client.field1419 % 40 < 20 ? class389.method1778(16776960) + class389.field2748 : ""), 180 + class292.field1989 - 34, var4, 16777215, 0);
                  var4 += 15;
                  var27 = 180 + class292.field1989 - 80;
                  var29 = 321;
                  class530.field4183.method2394(var27 - 73, var29 - 20);
                  var0.method1922(class424.field3254, var27, var29 + 5, 16777215, 0);
                  var27 = 80 + 180 + class292.field1989;
                  class530.field4183.method2394(var27 - 73, var29 - 20);
                  var0.method1922(class424.field3294, var27, var29 + 5, 16777215, 0);
                  var29 = 356;
                  var1.method1922(class424.field3257, class439.field3479, var29, 268435455, 0);
               } else if (6 == class292.field1994) {
                  var25 = 201;
                  var0.method1922(class292.field1998, 180 + class292.field1989, var25, 16776960, 0);
                  var4 = var25 + 15;
                  var0.method1922(class292.field1996, class292.field1989 + 180, var4, 16776960, 0);
                  var4 += 15;
                  var0.method1922(class292.field1997, 180 + class292.field1989, var4, 16776960, 0);
                  var4 += 15;
                  var5 = 180 + class292.field1989;
                  var26 = 321;
                  class530.field4183.method2394(var5 - 73, var26 - 20);
                  var0.method1922(class424.field3294, var5, var26 + 5, 16777215, 0);
               } else if (7 == class292.field1994) {
                  if (class451.field3572 && !Client.field1351) {
                     var25 = 201;
                     var0.method1922(class292.field1998, class439.field3479, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var0.method1922(class292.field1996, class439.field3479, var4, 16776960, 0);
                     var4 += 15;
                     var0.method1922(class292.field1997, class439.field3479, var4, 16776960, 0);
                     var5 = class439.field3479 - 150;
                     var4 += 10;

                     for(var26 = 0; var26 < 8; ++var26) {
                        class530.field4183.method2393(var5, var4, 30, 40);
                        boolean var28 = class292.field1999 == var26 & Client.field1419 % 40 < 20;
                        var0.method1943((class292.field2002[var26] == null ? "" : class292.field2002[var26]) + (var28 ? class389.method1778(16776960) + class389.field2748 : ""), var5 + 10, var4 + 27, 16777215, 0);
                        if (var26 != 1 && var26 != 3) {
                           var5 += 35;
                        } else {
                           var5 += 50;
                           var0.method1943(class419.method1928("/"), var5 - 13, var4 + 27, 16777215, 0);
                        }
                     }

                     var26 = class439.field3479 - 80;
                     short var30 = 321;
                     class530.field4183.method2394(var26 - 73, var30 - 20);
                     var0.method1922("Submit", var26, var30 + 5, 16777215, 0);
                     var26 = class439.field3479 + 80;
                     class530.field4183.method2394(var26 - 73, var30 - 20);
                     var0.method1922(class424.field3244, var26, var30 + 5, 16777215, 0);
                  } else {
                     var25 = 216;
                     var0.method1922(class424.field3279, 180 + class292.field1989, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var2.method1922(class424.field3284, class292.field1989 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var2.method1922(class424.field3285, class292.field1989 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var5 = class292.field1989 + 180 - 80;
                     var26 = 321;
                     class530.field4183.method2394(var5 - 73, var26 - 20);
                     var0.method1922(class424.field3286, var5, var26 + 5, 16777215, 0);
                     var5 = 180 + class292.field1989 + 80;
                     class530.field4183.method2394(var5 - 73, var26 - 20);
                     var0.method1922(class424.field3294, var5, var26 + 5, 16777215, 0);
                  }
               } else {
                  short var34;
                  if (class292.field1994 == 8) {
                     var25 = 216;
                     var0.method1922(class424.field3140, 180 + class292.field1989, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var2.method1922(class424.field3182, 180 + class292.field1989, var4, 16776960, 0);
                     var4 += 15;
                     var2.method1922(class424.field3151, class292.field1989 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var5 = 180 + class292.field1989 - 80;
                     var34 = 321;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var0.method1922(class424.field3255, var5, var34 + 5, 16777215, 0);
                     var5 = 80 + class292.field1989 + 180;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var0.method1922(class424.field3294, var5, var34 + 5, 16777215, 0);
                  } else if (class292.field1994 == 9) {
                     var25 = 221;
                     var0.method1922(class292.field1998, class292.field1989 + 180, var25, 16776960, 0);
                     var4 = var25 + 25;
                     var0.method1922(class292.field1996, 180 + class292.field1989, var4, 16776960, 0);
                     var4 += 25;
                     var0.method1922(class292.field1997, 180 + class292.field1989, var4, 16776960, 0);
                     var5 = 180 + class292.field1989;
                     var34 = 311;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var0.method1922(class424.field3250, var5, var34 + 5, 16777215, 0);
                  } else if (class292.field1994 == 10) {
                     var4 = class292.field1989 + 180;
                     var24 = 209;
                     var0.method1922(class424.field3282, class292.field1989 + 180, var24, 16776960, 0);
                     var5 = var24 + 20;
                     class292.field1986.method2394(var4 - 109, var5);
                     if (class292.field2001.isEmpty()) {
                        class532.field4213.method2394(var4 - 48, var5 + 18);
                     } else {
                        class532.field4213.method2394(var4 - 48, var5 + 5);
                        var0.method1922(class292.field2001, var4, var5 + 68 - 15, 16776960, 0);
                     }
                  } else if (12 == class292.field1994) {
                     var4 = class439.field3479;
                     var24 = 216;
                     var2.method1922(class424.field3290, var4, var24, 16777215, 0);
                     var5 = var24 + 17;
                     var2.method1922(class424.field3291, var4, var5, 16777215, 0);
                     var5 += 17;
                     var2.method1922(class424.field3292, var4, var5, 16777215, 0);
                     var5 += 17;
                     var2.method1922(class424.field3293, var4, var5, 16777215, 0);
                     var4 = class439.field3479 - 80;
                     var24 = 311;
                     class530.field4183.method2394(var4 - 73, var24 - 20);
                     var0.method1922(class424.field3112, var4, var24 + 5, 16777215, 0);
                     var4 = class439.field3479 + 80;
                     class530.field4183.method2394(var4 - 73, var24 - 20);
                     var0.method1922(class424.field3297, var4, var24 + 5, 16777215, 0);
                  } else if (13 == class292.field1994) {
                     var25 = 231;
                     var2.method1922(class424.field3057, 180 + class292.field1989, var25, 16777215, 0);
                     var4 = var25 + 20;
                     var2.method1922(class424.field3295, 180 + class292.field1989, var4, 16777215, 0);
                     var5 = class292.field1989 + 180;
                     var25 = 311;
                     class530.field4183.method2394(var5 - 73, var25 - 20);
                     var0.method1922(class424.field3294, var5, var25 + 5, 16777215, 0);
                  } else if (14 == class292.field1994) {
                     var25 = 201;
                     String var38 = "";
                     var6 = "";
                     var7 = "";
                     switch (class292.field1992) {
                        case 0:
                           var38 = class424.field3106;
                           var6 = class424.field3046;
                           var7 = class424.field3058;
                           break;
                        case 1:
                           var38 = class424.field3095;
                           var6 = class424.field3096;
                           var7 = class424.field3097;
                           break;
                        case 2:
                           var38 = class424.field3091;
                           var6 = class424.field3099;
                           var7 = class424.field3133;
                           break;
                        default:
                           class494.method2342(false);
                     }

                     var0.method1922(var38, 180 + class292.field1989, var25, 16776960, 0);
                     var4 = var25 + 20;
                     var0.method1922(var6, class292.field1989 + 180, var4, 16776960, 0);
                     var4 += 20;
                     var0.method1922(var7, 180 + class292.field1989, var4, 16776960, 0);
                     var29 = class292.field1989 + 180;
                     short var32 = 276;
                     class530.field4183.method2394(var29 - 73, var32 - 20);
                     if (1 == class292.field1992) {
                        var0.method1922(class424.field3040, var29, var32 + 5, 16777215, 0);
                     } else {
                        var0.method1922(class424.field3117, var29, var32 + 5, 16777215, 0);
                     }

                     var29 = class292.field1989 + 180;
                     var32 = 326;
                     class530.field4183.method2394(var29 - 73, var32 - 20);
                     var0.method1922(class424.field3294, var29, var32 + 5, 16777215, 0);
                  } else if (class292.field1994 == 24) {
                     var25 = 221;
                     var0.method1922(class292.field1998, class292.field1989 + 180, var25, 16777215, 0);
                     var4 = var25 + 15;
                     var0.method1922(class292.field1996, 180 + class292.field1989, var4, 16777215, 0);
                     var4 += 15;
                     var0.method1922(class292.field1997, class292.field1989 + 180, var4, 16777215, 0);
                     var4 += 15;
                     var5 = class292.field1989 + 180;
                     var34 = 301;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var0.method1922(class424.field3005, var5, var34 + 5, 16777215, 0);
                  } else if (32 == class292.field1994) {
                     var25 = 216;
                     var0.method1922(class424.field3279, 180 + class292.field1989, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var2.method1922(class424.field3284, 180 + class292.field1989, var4, 16776960, 0);
                     var4 += 15;
                     var2.method1922(class424.field3285, 180 + class292.field1989, var4, 16776960, 0);
                     var4 += 15;
                     var5 = class292.field1989 + 180 - 80;
                     var34 = 321;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var0.method1922(class424.field3286, var5, var34 + 5, 16777215, 0);
                     var5 = 180 + class292.field1989 + 80;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var0.method1922(class424.field3294, var5, var34 + 5, 16777215, 0);
                  } else if (class292.field1994 == 33) {
                     var25 = 201;
                     var0.method1922(class292.field1998, 180 + class292.field1989, var25, 16776960, 0);
                     var4 = var25 + 20;
                     var1.method1922(class292.field1996, class292.field1989 + 180, var4, 16776960, 0);
                     var4 += 20;
                     var1.method1922(class292.field1997, class292.field1989 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var5 = class292.field1989 + 180;
                     var34 = 276;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var2.method1922(class424.field3309, var5, var34 + 5, 16777215, 0);
                     var5 = class292.field1989 + 180;
                     var34 = 326;
                     class530.field4183.method2394(var5 - 73, var34 - 20);
                     var2.method1922(class424.field3294, var5, var34 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.field1200 >= 10) {
            int[] var45 = new int[4];
            class427.method1964(var45);
            class427.method1975(class292.field1983, 0, 765 + class292.field1983, class394.field2761);
            class84.field566.method2072(class292.field1983 - 22, Client.field1419);
            class84.field566.method2072(22 + 765 + class292.field1983 - 128, Client.field1419);
            class427.method1984(var45);
         }

         class128.field805[class158.field1004.method529() ? 1 : 0].method2394(765 + class292.field1983 - 40, 463);
         if (Client.field1200 > 5 && class103.field690 == class367.field2654) {
            if (class333.field2502 != null) {
               var4 = class292.field1983 + 5;
               var24 = 463;
               byte var39 = 100;
               byte var33 = 35;
               class333.field2502.method2394(var4, var24);
               var0.method1922(class424.field3180 + " " + Client.field1116, var39 / 2 + var4, var33 / 2 + var24 - 2, 16777215, 0);
               if (null != class315.field2133) {
                  var1.method1922(class424.field3150, var39 / 2 + var4, var24 + var33 / 2 + 12, 16777215, 0);
               } else {
                  var1.method1922(class424.field3308, var39 / 2 + var4, 12 + var33 / 2 + var24, 16777215, 0);
               }
            } else {
               class333.field2502 = class382.method1766(class62.field492, "sl_button", "");
            }
         }

      }
   }
}
