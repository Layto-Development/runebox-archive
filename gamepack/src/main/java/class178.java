final class class178 implements class130 {
   // $FF: synthetic field
   final class480 val$cc;

   class178(class480 var1) {
      this.val$cc = var1;
   }

   public void method889() {
      if (null != this.val$cc && this.val$cc.method2337().field2311 != null) {
         class208 var2 = new class208();
         var2.method1262(this.val$cc);
         var2.method1263(this.val$cc.method2337().field2311);
         Client.method412().method1240(var2);
      }

   }

   static void method1103(class460 var0, class460 var1, class460 var2) {
      class534.field4219 = (class426.field3228 - 765) / 2;
      class534.field4225 = class534.field4219 + 202;
      class241.field2193 = class534.field4225 + 180;
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
      if (class534.field4244) {
         if (class374.field2926 == null) {
            class374.field2926 = class398.method1919(class331.field2666, "sl_back", "");
         }

         if (null == class482.field3834) {
            class482.field3834 = class398.method1928(class331.field2666, "sl_flags", "");
         }

         if (null == class267.field2301) {
            class267.field2301 = class398.method1928(class331.field2666, "sl_arrows", "");
         }

         if (class253.field2233 == null) {
            class253.field2233 = class398.method1928(class331.field2666, "sl_stars", "");
         }

         if (class52.field1073 == null) {
            class52.field1073 = class398.method1926(class331.field2666, "leftarrow", "");
         }

         if (null == class370.field2901) {
            class370.field2901 = class398.method1926(class331.field2666, "rightarrow", "");
         }

         class156.method954(class534.field4219, 23, 765, 480, 0);
         class156.method955(class534.field4219, 0, 125, 23, 12425273, 9135624);
         class156.method955(class534.field4219 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method1573(class27.field531, 62 + class534.field4219, 15, 0, -1);
         if (null != class253.field2233) {
            class253.field2233[1].method2000(140 + class534.field4219, 1);
            var1.method1594(class27.field259, 152 + class534.field4219, 10, 16777215, -1);
            class253.field2233[0].method2000(class534.field4219 + 140, 12);
            var1.method1594(class27.field317, class534.field4219 + 152, 21, 16777215, -1);
         }

         if (class267.field2301 != null) {
            var4 = class534.field4219 + 280;
            if (class230.field2132[0] == 0 && class230.field2131[0] == 0) {
               class267.field2301[2].method2000(var4, 4);
            } else {
               class267.field2301[0].method2000(var4, 4);
            }

            if (class230.field2132[0] == 0 && class230.field2131[0] == 1) {
               class267.field2301[3].method2000(var4 + 15, 4);
            } else {
               class267.field2301[1].method2000(var4 + 15, 4);
            }

            var0.method1594(class27.field534, var4 + 32, 17, 16777215, -1);
            var5 = class534.field4219 + 390;
            if (class230.field2132[0] == 1 && class230.field2131[0] == 0) {
               class267.field2301[2].method2000(var5, 4);
            } else {
               class267.field2301[0].method2000(var5, 4);
            }

            if (class230.field2132[0] == 1 && class230.field2131[0] == 1) {
               class267.field2301[3].method2000(var5 + 15, 4);
            } else {
               class267.field2301[1].method2000(var5 + 15, 4);
            }

            var0.method1594(class27.field535, var5 + 32, 17, 16777215, -1);
            var26 = 500 + class534.field4219;
            if (class230.field2132[0] == 2 && class230.field2131[0] == 0) {
               class267.field2301[2].method2000(var26, 4);
            } else {
               class267.field2301[0].method2000(var26, 4);
            }

            if (class230.field2132[0] == 2 && class230.field2131[0] == 1) {
               class267.field2301[3].method2000(var26 + 15, 4);
            } else {
               class267.field2301[1].method2000(var26 + 15, 4);
            }

            var0.method1594(class27.field536, var26 + 32, 17, 16777215, -1);
            var27 = 610 + class534.field4219;
            if (class230.field2132[0] == 3 && class230.field2131[0] == 0) {
               class267.field2301[2].method2000(var27, 4);
            } else {
               class267.field2301[0].method2000(var27, 4);
            }

            if (class230.field2132[0] == 3 && class230.field2131[0] == 1) {
               class267.field2301[3].method2000(var27 + 15, 4);
            } else {
               class267.field2301[1].method2000(var27 + 15, 4);
            }

            var0.method1594(class27.field537, var27 + 32, 17, 16777215, -1);
         }

         class156.method954(708 + class534.field4219, 4, 50, 16, 0);
         var1.method1573(class27.field477, 25 + 708 + class534.field4219, 16, 16777215, -1);
         class534.field4245 = -1;
         if (class374.field2926 != null) {
            byte var46 = 88;
            byte var42 = 19;
            var26 = 765 / (var46 + 1) - 1;
            var27 = 480 / (var42 + 1);

            do {
               var29 = var27;
               var31 = var26;
               if (var27 * (var26 - 1) >= class230.field2134) {
                  --var26;
               }

               if ((var27 - 1) * var26 >= class230.field2134) {
                  --var27;
               }

               if (var26 * (var27 - 1) >= class230.field2134) {
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
            var35 = (class230.field2134 + var27 - 1) / var27;
            class534.field4251 = var35 - var26;
            if (class52.field1073 != null && class534.field4246 > 0) {
               class52.field1073.method2000(8, class456.field3562 / 2 - class52.field1073.field3223 / 2);
            }

            if (null != class370.field2901 && class534.field4246 < class534.field4251) {
               class370.field2901.method2000(class426.field3228 - class370.field2901.field3222 - 8, class456.field3562 / 2 - class370.field2901.field3223 / 2);
            }

            var37 = var36 + 23;
            int var14 = class534.field4219 + var10;
            int var40 = 0;
            var16 = false;
            int var41 = class534.field4246;

            for(var18 = var27 * var41; var18 < class230.field2134 && var41 - class534.field4246 < var26; ++var18) {
               class230 var43 = class263.field2288[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var43.field2135);
               if (var43.field2135 == -1) {
                  var21 = class27.field538;
                  var20 = false;
               } else if (var43.field2135 > 1980) {
                  var21 = class27.field433;
                  var20 = false;
               }

               class275 var22 = null;
               int var23 = 0;
               if (var43.method1404()) {
                  var22 = var43.method1397() ? class275.field2342 : class275.field2352;
               } else if (var43.method1398()) {
                  var22 = var43.method1397() ? class275.field2351 : class275.field2344;
               } else if (var43.method1401()) {
                  var23 = 16711680;
                  var22 = var43.method1397() ? class275.field2341 : class275.field2336;
               } else if (var43.method1402()) {
                  var22 = var43.method1397() ? class275.field2340 : class275.field2345;
               } else if (var43.method1407()) {
                  var22 = var43.method1397() ? class275.field2339 : class275.field2343;
               } else if (var43.method1406()) {
                  var22 = var43.method1397() ? class275.field2347 : class275.field2346;
               } else if (var43.method1403()) {
                  var22 = var43.method1397() ? class275.field2349 : class275.field2348;
               }

               if (var22 == null || var22.field2350 >= class374.field2926.length) {
                  var22 = var43.method1397() ? class275.field2337 : class275.field2338;
               }

               if (class441.field3349 >= var14 && class441.field3332 >= var37 && class441.field3349 < var14 + var46 && class441.field3332 < var37 + var42 && var20) {
                  class534.field4245 = var18;
                  class374.field2926[var22.field2350].method2016(var14, var37, 128, 16777215);
                  var16 = true;
               } else {
                  class374.field2926[var22.field2350].method2012(var14, var37);
               }

               if (class482.field3834 != null) {
                  class482.field3834[(var43.method1397() ? 8 : 0) + var43.field2138].method2000(var14 + 29, var37);
               }

               var0.method1573(Integer.toString(var43.field2133), var14 + 15, 5 + var37 + var42 / 2, var23, -1);
               var1.method1573(var21, var14 + 60, 5 + var42 / 2 + var37, 268435455, -1);
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
               var18 = var1.method1566(class263.field2288[class534.field4245].field2137) + 6;
               var19 = var1.field2423 + 8;
               int var44 = class441.field3332 + 25;
               if (var19 + var44 > 480) {
                  var44 = class441.field3332 - 25 - var19;
               }

               class156.method954(class441.field3349 - var18 / 2, var44, var18, var19, 16777120);
               class156.method957(class441.field3349 - var18 / 2, var44, var18, var19, 0);
               var1.method1573(class263.field2288[class534.field4245].field2137, class441.field3349, var44 + var1.field2423 + 4, 0, -1);
            }
         }

      } else {
         class534.field4223.method2012(class534.field4219, 0);
         class119.field1486.method2012(class534.field4219 + 382, 0);
         class409.field3154.method2000(382 + class534.field4219 - class409.field3154.field3222 / 2, 18);
         if (Client.field660 == 0 || Client.field660 == 5) {
            var4 = 20;
            var0.method1573(class27.field424, class534.field4225 + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class156.method957(180 + class534.field4225 - 152, var5, 304, 34, 9179409);
            class156.method957(180 + class534.field4225 - 151, var5 + 1, 302, 32, 0);
            class156.method954(180 + class534.field4225 - 150, var5 + 2, class534.field4226 * 3, 30, 9179409);
            class156.method954(180 + class534.field4225 - 150 + class534.field4226 * 3, var5 + 2, 300 - class534.field4226 * 3, 30, 0);
            var0.method1573(class534.field4227, 180 + class534.field4225, 276 - var4, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         String var9;
         short var24;
         if (Client.field660 == 20) {
            class534.field4221.method2000(180 + class534.field4225 - class534.field4221.field3222 / 2, 271 - class534.field4221.field3223 / 2);
            var4 = 201;
            var0.method1573(class534.field4234, 180 + class534.field4225, var4, 16776960, 0);
            var4 += 15;
            var0.method1573(class534.field4232, 180 + class534.field4225, var4, 16776960, 0);
            var4 += 15;
            var0.method1573(class534.field4233, 180 + class534.field4225, var4, 16776960, 0);
            var4 += 15;
            var4 += 7;
            if (class534.field4230 != 4 && class534.field4230 != 10) {
               var0.method1594(class27.field470, 180 + class534.field4225 - 110, var4, 16777215, 0);
               var24 = 200;

               for(var6 = class534.method2550(); var0.method1566(var6) > var24; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.method1594(class282.method1579(var6), class534.field4225 + 180 - 70, var4, 16777215, 0);
               var4 += 15;
               var8 = class534.field4236;
               var7 = class330.method1744('*', var8.length());

               for(var9 = var7; var0.method1566(var9) > var24; var9 = var9.substring(1)) {
               }

               var0.method1594(class27.field471 + var9, 180 + class534.field4225 - 108, var4, 16777215, 0);
               var4 += 15;
            }
         }

         if (Client.field660 == 10 || Client.field660 == 11 || Client.field660 == 50) {
            class534.field4221.method2000(class534.field4225, 171);
            short var25;
            if (class534.field4230 == 0) {
               var25 = 251;
               var0.method1573(class27.field515, 180 + class534.field4225, var25, 16776960, 0);
               var4 = var25 + 30;
               var5 = class534.field4225 + 180 - 80;
               var26 = 291;
               class191.field1878.method2000(var5 - 73, var26 - 20);
               var0.method1565(class27.field474, var5 - 73, var26 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = 80 + class534.field4225 + 180;
               class191.field1878.method2000(var5 - 73, var26 - 20);
               var0.method1565(class27.field475, var5 - 73, var26 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class534.field4230 == 1) {
               var0.method1573(class534.field4252, class534.field4225 + 180, 201, 16776960, 0);
               var25 = 236;
               var0.method1573(class534.field4234, 180 + class534.field4225, var25, 16777215, 0);
               var4 = var25 + 15;
               var0.method1573(class534.field4232, 180 + class534.field4225, var4, 16777215, 0);
               var4 += 15;
               var0.method1573(class534.field4233, class534.field4225 + 180, var4, 16777215, 0);
               var4 += 15;
               var5 = class534.field4225 + 180 - 80;
               var26 = 321;
               class191.field1878.method2000(var5 - 73, var26 - 20);
               var0.method1573(class27.field240, var5, var26 + 5, 16777215, 0);
               var5 = 80 + 180 + class534.field4225;
               class191.field1878.method2000(var5 - 73, var26 - 20);
               var0.method1573(class27.field477, var5, var26 + 5, 16777215, 0);
            } else {
               class425 var11;
               if (class534.field4230 == 2) {
                  var25 = 201;
                  var0.method1573(class534.field4234, class241.field2193, var25, 16776960, 0);
                  var4 = var25 + 15;
                  var0.method1573(class534.field4232, class241.field2193, var4, 16776960, 0);
                  var4 += 15;
                  var0.method1573(class534.field4233, class241.field2193, var4, 16776960, 0);
                  var4 += 15;
                  var4 += 7;
                  var0.method1594(class27.field470, class241.field2193 - 110, var4, 16777215, 0);
                  var24 = 200;

                  for(var6 = class534.method2550(); var0.method1566(var6) > var24; var6 = var6.substring(1)) {
                  }

                  var0.method1594(class282.method1579(var6) + (class534.field4241 == 0 & Client.field879 % 40 < 20 ? class357.method1829(16776960) + class357.field2803 : ""), class241.field2193 - 70, var4, 16777215, 0);
                  var4 += 15;
                  var8 = class534.field4236;
                  var7 = class330.method1744('*', var8.length());

                  for(var9 = var7; var0.method1566(var9) > var24; var9 = var9.substring(1)) {
                  }

                  var0.method1594(class27.field471 + var9 + (class534.field4241 == 1 & Client.field879 % 40 < 20 ? class357.method1829(16776960) + class357.field2803 : ""), class241.field2193 - 108, var4, 16777215, 0);
                  var4 += 15;
                  var25 = 277;
                  var10 = -117 + class241.field2193;
                  boolean var12 = Client.field630;
                  boolean var13 = class534.field4224;
                  var11 = var12 ? (var13 ? class132.field1562 : class537.field4256) : (var13 ? class170.field1725 : class534.field4218);
                  var11.method2000(var10, var25);
                  var10 += var11.field3222 + 5;
                  var1.method1594(class27.field478, var10, var25 + 13, 16776960, 0);
                  var10 = 24 + class241.field2193;
                  var16 = class4.field36.method2409();
                  boolean var17 = class534.field4247;
                  class425 var15 = var16 ? (var17 ? class132.field1562 : class537.field4256) : (var17 ? class170.field1725 : class534.field4218);
                  var15.method2000(var10, var25);
                  var10 += var15.field3222 + 5;
                  var1.method1594(class27.field432, var10, var25 + 13, 16776960, 0);
                  var4 = var25 + 15;
                  var18 = class241.field2193 - 80;
                  var19 = 321;
                  class191.field1878.method2000(var18 - 73, var19 - 20);
                  var0.method1573(class27.field431, var18, var19 + 5, 16777215, 0);
                  var18 = 80 + class241.field2193;
                  class191.field1878.method2000(var18 - 73, var19 - 20);
                  var0.method1573(class27.field477, var18, var19 + 5, 16777215, 0);
                  var25 = 357;
                  switch (class534.field4229) {
                     case 2:
                        class37.field888 = class27.field491;
                        break;
                     default:
                        class37.field888 = class27.field442;
                  }

                  class291.field2463 = new class119(class241.field2193, var25, var1.method1566(class37.field888), 11);
                  class76.field1226 = new class119(class241.field2193, var25, var1.method1566(class27.field490), 11);
                  var1.method1573(class37.field888, class241.field2193, var25, 16777215, 0);
               } else if (class534.field4230 == 3) {
                  var25 = 201;
                  var0.method1573(class27.field485, 180 + class534.field4225, var25, 16776960, 0);
                  var4 = var25 + 20;
                  var1.method1573(class27.field297, class534.field4225 + 180, var4, 16776960, 0);
                  var4 += 20;
                  var1.method1573(class27.field482, 180 + class534.field4225, var4, 16776960, 0);
                  var4 += 15;
                  var5 = class534.field4225 + 180;
                  var26 = 276;
                  class191.field1878.method2000(var5 - 73, var26 - 20);
                  var2.method1573(class27.field483, var5, var26 + 5, 16777215, 0);
                  var5 = class534.field4225 + 180;
                  var26 = 326;
                  class191.field1878.method2000(var5 - 73, var26 - 20);
                  var2.method1573(class27.field484, var5, var26 + 5, 16777215, 0);
               } else if (class534.field4230 == 4) {
                  var0.method1573(class27.field460, 180 + class534.field4225, 201, 16776960, 0);
                  var25 = 236;
                  var0.method1573(class534.field4234, 180 + class534.field4225, var25, 16777215, 0);
                  var4 = var25 + 15;
                  var0.method1573(class534.field4232, 180 + class534.field4225, var4, 16777215, 0);
                  var4 += 15;
                  var0.method1573(class534.field4233, class534.field4225 + 180, var4, 16777215, 0);
                  var4 += 15;
                  var6 = class27.field472;
                  var8 = class470.field3619;
                  var7 = class330.method1744('*', var8.length());
                  var0.method1594(var6 + var7 + (Client.field879 % 40 < 20 ? class357.method1829(16776960) + class357.field2803 : ""), class534.field4225 + 180 - 108, var4, 16777215, 0);
                  var4 -= 8;
                  var0.method1594(class27.field243, class534.field4225 + 180 - 9, var4, 16776960, 0);
                  var4 += 15;
                  var0.method1594(class27.field360, 180 + class534.field4225 - 9, var4, 16776960, 0);
                  var31 = class534.field4225 + 180 - 9 + var0.method1566(class27.field360) + 15;
                  var10 = var4 - var0.field2423;
                  if (class534.field4240) {
                     var11 = class537.field4256;
                  } else {
                     var11 = class534.field4218;
                  }

                  var11.method2000(var31, var10);
                  var4 += 15;
                  var35 = class534.field4225 + 180 - 80;
                  var37 = 321;
                  class191.field1878.method2000(var35 - 73, var37 - 20);
                  var0.method1573(class27.field240, var35, var37 + 5, 16777215, 0);
                  var35 = 80 + 180 + class534.field4225;
                  class191.field1878.method2000(var35 - 73, var37 - 20);
                  var0.method1573(class27.field477, var35, var37 + 5, 16777215, 0);
                  var1.method1573(class27.field442, class534.field4225 + 180, var37 + 36, 16777215, 0);
               } else if (class534.field4230 == 5) {
                  var0.method1573(class27.field434, 180 + class534.field4225, 201, 16776960, 0);
                  var25 = 221;
                  var2.method1573(class534.field4234, class534.field4225 + 180, var25, 16776960, 0);
                  var4 = var25 + 15;
                  var2.method1573(class534.field4232, class534.field4225 + 180, var4, 16776960, 0);
                  var4 += 15;
                  var2.method1573(class534.field4233, 180 + class534.field4225, var4, 16776960, 0);
                  var4 += 15;
                  var4 += 14;
                  var0.method1594(class27.field356, class534.field4225 + 180 - 145, var4, 16777215, 0);
                  var24 = 174;

                  for(var6 = class534.method2550(); var0.method1566(var6) > var24; var6 = var6.substring(1)) {
                  }

                  var0.method1594(class282.method1579(var6) + (Client.field879 % 40 < 20 ? class357.method1829(16776960) + class357.field2803 : ""), 180 + class534.field4225 - 34, var4, 16777215, 0);
                  var4 += 15;
                  var27 = 180 + class534.field4225 - 80;
                  var29 = 321;
                  class191.field1878.method2000(var27 - 73, var29 - 20);
                  var0.method1573(class27.field487, var27, var29 + 5, 16777215, 0);
                  var27 = 80 + 180 + class534.field4225;
                  class191.field1878.method2000(var27 - 73, var29 - 20);
                  var0.method1573(class27.field527, var27, var29 + 5, 16777215, 0);
                  var29 = 356;
                  var1.method1573(class27.field490, class241.field2193, var29, 268435455, 0);
               } else if (class534.field4230 == 6) {
                  var25 = 201;
                  var0.method1573(class534.field4234, 180 + class534.field4225, var25, 16776960, 0);
                  var4 = var25 + 15;
                  var0.method1573(class534.field4232, class534.field4225 + 180, var4, 16776960, 0);
                  var4 += 15;
                  var0.method1573(class534.field4233, 180 + class534.field4225, var4, 16776960, 0);
                  var4 += 15;
                  var5 = 180 + class534.field4225;
                  var26 = 321;
                  class191.field1878.method2000(var5 - 73, var26 - 20);
                  var0.method1573(class27.field527, var5, var26 + 5, 16777215, 0);
               } else if (class534.field4230 == 7) {
                  if (class325.field2627 && !Client.field811) {
                     var25 = 201;
                     var0.method1573(class534.field4234, class241.field2193, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var0.method1573(class534.field4232, class241.field2193, var4, 16776960, 0);
                     var4 += 15;
                     var0.method1573(class534.field4233, class241.field2193, var4, 16776960, 0);
                     var5 = class241.field2193 - 150;
                     var4 += 10;

                     for(var26 = 0; var26 < 8; ++var26) {
                        class191.field1878.method1999(var5, var4, 30, 40);
                        boolean var28 = class534.field4235 == var26 & Client.field879 % 40 < 20;
                        var0.method1594((class534.field4238[var26] == null ? "" : class534.field4238[var26]) + (var28 ? class357.method1829(16776960) + class357.field2803 : ""), var5 + 10, var4 + 27, 16777215, 0);
                        if (var26 != 1 && var26 != 3) {
                           var5 += 35;
                        } else {
                           var5 += 50;
                           var0.method1594(class282.method1579("/"), var5 - 13, var4 + 27, 16777215, 0);
                        }
                     }

                     var26 = class241.field2193 - 80;
                     short var30 = 321;
                     class191.field1878.method2000(var26 - 73, var30 - 20);
                     var0.method1573("Submit", var26, var30 + 5, 16777215, 0);
                     var26 = class241.field2193 + 80;
                     class191.field1878.method2000(var26 - 73, var30 - 20);
                     var0.method1573(class27.field477, var26, var30 + 5, 16777215, 0);
                  } else {
                     var25 = 216;
                     var0.method1573(class27.field512, 180 + class534.field4225, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var2.method1573(class27.field517, class534.field4225 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var2.method1573(class27.field518, class534.field4225 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var5 = class534.field4225 + 180 - 80;
                     var26 = 321;
                     class191.field1878.method2000(var5 - 73, var26 - 20);
                     var0.method1573(class27.field519, var5, var26 + 5, 16777215, 0);
                     var5 = 180 + class534.field4225 + 80;
                     class191.field1878.method2000(var5 - 73, var26 - 20);
                     var0.method1573(class27.field527, var5, var26 + 5, 16777215, 0);
                  }
               } else {
                  short var34;
                  if (class534.field4230 == 8) {
                     var25 = 216;
                     var0.method1573(class27.field373, 180 + class534.field4225, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var2.method1573(class27.field415, 180 + class534.field4225, var4, 16776960, 0);
                     var4 += 15;
                     var2.method1573(class27.field384, class534.field4225 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var5 = 180 + class534.field4225 - 80;
                     var34 = 321;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var0.method1573(class27.field488, var5, var34 + 5, 16777215, 0);
                     var5 = 80 + class534.field4225 + 180;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var0.method1573(class27.field527, var5, var34 + 5, 16777215, 0);
                  } else if (class534.field4230 == 9) {
                     var25 = 221;
                     var0.method1573(class534.field4234, class534.field4225 + 180, var25, 16776960, 0);
                     var4 = var25 + 25;
                     var0.method1573(class534.field4232, 180 + class534.field4225, var4, 16776960, 0);
                     var4 += 25;
                     var0.method1573(class534.field4233, 180 + class534.field4225, var4, 16776960, 0);
                     var5 = 180 + class534.field4225;
                     var34 = 311;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var0.method1573(class27.field483, var5, var34 + 5, 16777215, 0);
                  } else if (class534.field4230 == 10) {
                     var4 = class534.field4225 + 180;
                     var24 = 209;
                     var0.method1573(class27.field515, class534.field4225 + 180, var24, 16776960, 0);
                     var5 = var24 + 20;
                     class534.field4222.method2000(var4 - 109, var5);
                     if (class534.field4237.isEmpty()) {
                        class78.field1243.method2000(var4 - 48, var5 + 18);
                     } else {
                        class78.field1243.method2000(var4 - 48, var5 + 5);
                        var0.method1573(class534.field4237, var4, var5 + 68 - 15, 16776960, 0);
                     }
                  } else if (class534.field4230 == 12) {
                     var4 = class241.field2193;
                     var24 = 216;
                     var2.method1573(class27.field523, var4, var24, 16777215, 0);
                     var5 = var24 + 17;
                     var2.method1573(class27.field524, var4, var5, 16777215, 0);
                     var5 += 17;
                     var2.method1573(class27.field525, var4, var5, 16777215, 0);
                     var5 += 17;
                     var2.method1573(class27.field526, var4, var5, 16777215, 0);
                     var4 = class241.field2193 - 80;
                     var24 = 311;
                     class191.field1878.method2000(var4 - 73, var24 - 20);
                     var0.method1573(class27.field345, var4, var24 + 5, 16777215, 0);
                     var4 = class241.field2193 + 80;
                     class191.field1878.method2000(var4 - 73, var24 - 20);
                     var0.method1573(class27.field530, var4, var24 + 5, 16777215, 0);
                  } else if (class534.field4230 == 13) {
                     var25 = 231;
                     var2.method1573(class27.field290, 180 + class534.field4225, var25, 16777215, 0);
                     var4 = var25 + 20;
                     var2.method1573(class27.field528, 180 + class534.field4225, var4, 16777215, 0);
                     var5 = class534.field4225 + 180;
                     var25 = 311;
                     class191.field1878.method2000(var5 - 73, var25 - 20);
                     var0.method1573(class27.field527, var5, var25 + 5, 16777215, 0);
                  } else if (class534.field4230 == 14) {
                     var25 = 201;
                     String var38 = "";
                     var6 = "";
                     var7 = "";
                     switch (class534.field4228) {
                        case 0:
                           var38 = class27.field339;
                           var6 = class27.field279;
                           var7 = class27.field291;
                           break;
                        case 1:
                           var38 = class27.field328;
                           var6 = class27.field329;
                           var7 = class27.field330;
                           break;
                        case 2:
                           var38 = class27.field324;
                           var6 = class27.field332;
                           var7 = class27.field366;
                           break;
                        default:
                           class268.method1515(false);
                     }

                     var0.method1573(var38, 180 + class534.field4225, var25, 16776960, 0);
                     var4 = var25 + 20;
                     var0.method1573(var6, class534.field4225 + 180, var4, 16776960, 0);
                     var4 += 20;
                     var0.method1573(var7, 180 + class534.field4225, var4, 16776960, 0);
                     var29 = class534.field4225 + 180;
                     short var32 = 276;
                     class191.field1878.method2000(var29 - 73, var32 - 20);
                     if (class534.field4228 == 1) {
                        var0.method1573(class27.field273, var29, var32 + 5, 16777215, 0);
                     } else {
                        var0.method1573(class27.field350, var29, var32 + 5, 16777215, 0);
                     }

                     var29 = class534.field4225 + 180;
                     var32 = 326;
                     class191.field1878.method2000(var29 - 73, var32 - 20);
                     var0.method1573(class27.field527, var29, var32 + 5, 16777215, 0);
                  } else if (class534.field4230 == 24) {
                     var25 = 221;
                     var0.method1573(class534.field4234, class534.field4225 + 180, var25, 16777215, 0);
                     var4 = var25 + 15;
                     var0.method1573(class534.field4232, 180 + class534.field4225, var4, 16777215, 0);
                     var4 += 15;
                     var0.method1573(class534.field4233, class534.field4225 + 180, var4, 16777215, 0);
                     var4 += 15;
                     var5 = class534.field4225 + 180;
                     var34 = 301;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var0.method1573(class27.field238, var5, var34 + 5, 16777215, 0);
                  } else if (class534.field4230 == 32) {
                     var25 = 216;
                     var0.method1573(class27.field512, 180 + class534.field4225, var25, 16776960, 0);
                     var4 = var25 + 15;
                     var2.method1573(class27.field517, 180 + class534.field4225, var4, 16776960, 0);
                     var4 += 15;
                     var2.method1573(class27.field518, 180 + class534.field4225, var4, 16776960, 0);
                     var4 += 15;
                     var5 = class534.field4225 + 180 - 80;
                     var34 = 321;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var0.method1573(class27.field519, var5, var34 + 5, 16777215, 0);
                     var5 = 180 + class534.field4225 + 80;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var0.method1573(class27.field527, var5, var34 + 5, 16777215, 0);
                  } else if (class534.field4230 == 33) {
                     var25 = 201;
                     var0.method1573(class534.field4234, 180 + class534.field4225, var25, 16776960, 0);
                     var4 = var25 + 20;
                     var1.method1573(class534.field4232, class534.field4225 + 180, var4, 16776960, 0);
                     var4 += 20;
                     var1.method1573(class534.field4233, class534.field4225 + 180, var4, 16776960, 0);
                     var4 += 15;
                     var5 = class534.field4225 + 180;
                     var34 = 276;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var2.method1573(class27.field542, var5, var34 + 5, 16777215, 0);
                     var5 = class534.field4225 + 180;
                     var34 = 326;
                     class191.field1878.method2000(var5 - 73, var34 - 20);
                     var2.method1573(class27.field527, var5, var34 + 5, 16777215, 0);
                  }
               }
            }
         }

         if (Client.field660 >= 10) {
            int[] var45 = new int[4];
            class156.method950(var45);
            class156.method961(class534.field4219, 0, 765 + class534.field4219, class456.field3562);
            class158.field1682.method2577(class534.field4219 - 22, Client.field879);
            class158.field1682.method2577(22 + 765 + class534.field4219 - 128, Client.field879);
            class156.method970(var45);
         }

         class199.field1930[class4.field36.method2425() ? 1 : 0].method2000(765 + class534.field4219 - 40, 463);
         if (Client.field660 > 5 && class121.field1497 == class219.field2034) {
            if (class395.field3084 != null) {
               var4 = class534.field4219 + 5;
               var24 = 463;
               byte var39 = 100;
               byte var33 = 35;
               class395.field3084.method2000(var4, var24);
               var0.method1573(class27.field413 + " " + Client.field576, var39 / 2 + var4, var33 / 2 + var24 - 2, 16777215, 0);
               if (null != class238.field2184) {
                  var1.method1573(class27.field383, var39 / 2 + var4, var24 + var33 / 2 + 12, 16777215, 0);
               } else {
                  var1.method1573(class27.field541, var39 / 2 + var4, 12 + var33 / 2 + var24, 16777215, 0);
               }
            } else {
               class395.field3084 = class398.method1926(class331.field2666, "sl_button", "");
            }
         }

      }
   }
}
