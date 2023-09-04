public class class299 implements class42 {
   public static final class299 field2036 = new class299(1, "GET", true, false);
   public static final class299 field2037 = new class299(0, "POST", true, true);
   static class474 field2043;
   static String field2044;
   static final class299 field2038 = new class299(3, "PATCH", false, true);
   static final class299 field2039 = new class299(4, "DELETE", false, true);
   static final class299 field2040 = new class299(2, "PUT", false, true);
   boolean field2042;
   boolean field2045;
   int field2035;
   String field2041;

   class299(int var1, String var2, boolean var3, boolean var4) {
      this.field2035 = var1;
      this.field2041 = var2;
      this.field2045 = var3;
      this.field2042 = var4;
   }

   boolean method1377() {
      return this.field2045;
   }

   public String method1375() {
      return this.field2041;
   }

   boolean method1376() {
      return this.field2042;
   }

   public int method180() {
      return this.field2035;
   }

   static final void method1378(class322[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         class322 var10 = var0[var9];
         if (null != var10 && var1 == var10.field2175 && (var10.method1457() || Client.method865(var10) != 0 || var10 == Client.field1319)) {
            if (var10.field2238) {
               if (Client.method842(var10)) {
                  continue;
               }
            } else if (var10.field2160 == 0 && class207.field1596 != var10 && Client.method842(var10)) {
               continue;
            }

            if (var10.field2160 == 11) {
               if (var10.method1478(class234.field1727)) {
                  if (var10.method1480()) {
                     Client.method869(var10);
                     Client.method808(var10.field2290, var10, true);
                  }

                  if (var10.field2223 != null) {
                     class64 var11 = new class64();
                     var11.field504 = var10;
                     var11.field507 = var10.field2223;
                     Client.field1331.method1995(var11);
                  }
               }
            } else if (var10.field2160 == 12 && var10.method1472()) {
               Client.method869(var10);
            }

            int var27 = var10.field2159 + var6;
            int var12 = var7 + var10.field2172;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (9 == var10.field2160) {
               var17 = var27;
               var18 = var12;
               var19 = var27 + var10.field2173;
               int var20 = var10.field2150 + var12;
               if (var19 < var27) {
                  var17 = var19;
                  var19 = var27;
               }

               if (var20 < var12) {
                  var18 = var20;
                  var20 = var12;
               }

               ++var19;
               ++var20;
               var13 = var17 > var2 ? var17 : var2;
               var14 = var18 > var3 ? var18 : var3;
               var15 = var19 < var4 ? var19 : var4;
               var16 = var20 < var5 ? var20 : var5;
            } else {
               var17 = var27 + var10.field2173;
               var18 = var10.field2150 + var12;
               var13 = var27 > var2 ? var27 : var2;
               var14 = var12 > var3 ? var12 : var3;
               var15 = var17 < var4 ? var17 : var4;
               var16 = var18 < var5 ? var18 : var5;
            }

            if (Client.field1300 == var10) {
               Client.field1352 = true;
               Client.field1154 = var27;
               Client.field1226 = var12;
            }

            boolean var28 = false;
            if (var10.field2230) {
               switch (Client.field1130) {
                  case 0:
                     var28 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (var10.field2158 >>> 16 == Client.field1291) {
                        var28 = true;
                     }
                     break;
                  case 3:
                     if (Client.field1291 == var10.field2158) {
                        var28 = true;
                     }
               }
            }

            if (var28 || !var10.field2238 || var13 < var15 && var14 < var16) {
               if (var10.field2238) {
                  class64 var29;
                  if (var10.field2300) {
                     if (class496.field3977 >= var13 && class496.field3960 >= var14 && class496.field3977 < var15 && class496.field3960 < var16) {
                        for(var29 = (class64)Client.field1331.method1991(); var29 != null; var29 = (class64)Client.field1331.method1993()) {
                           if (var29.field515) {
                              var29.method295();
                              var29.field504.field2178 = false;
                           }
                        }

                        Client.method940();
                        if (class124.field797 == 0) {
                           Client.field1300 = null;
                           Client.field1319 = null;
                        }

                        if (!Client.field1229) {
                           Client.method909();
                        }
                     }
                  } else if (var10.field2301 && class496.field3977 >= var13 && class496.field3960 >= var14 && class496.field3977 < var15 && class496.field3960 < var16) {
                     for(var29 = (class64)Client.field1331.method1991(); null != var29; var29 = (class64)Client.field1331.method1993()) {
                        if (var29.field515 && var29.field504.field2183 == var29.field507) {
                           var29.method295();
                        }
                     }
                  }
               }

               var18 = class496.field3977;
               var19 = class496.field3960;
               if (0 != class496.field3971) {
                  var18 = class496.field3972;
                  var19 = class496.field3973;
               }

               boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (1337 == var10.field2184) {
                  if (!Client.field1129 && !Client.field1229 && var30) {
                     Client.method839(var18, var19, var13, var14);
                  }
               } else if (var10.field2184 == 1338) {
                  Client.method913(var10, var27, var12);
               } else {
                  if (var10.field2184 == 1400) {
                     class512.field4083.method460(class496.field3977, class496.field3960, var30, var27, var12, var10.field2173, var10.field2150);
                  }

                  if (!Client.field1229 && var30) {
                     if (var10.field2184 == 1400) {
                        class512.field4083.method453(var27, var12, var10.field2173, var10.field2150, var18, var19);
                     } else {
                        Client.method846(var10);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var28) {
                     for(int var21 = 0; var21 < var10.field2207.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && null != var10.field2207[var21]) {
                           for(var24 = 0; var24 < var10.field2207[var21].length; ++var24) {
                              boolean var25 = false;
                              if (null != var10.field2299) {
                                 var25 = Client.field1264.method1385(var10.field2207[var21][var24]);
                              }

                              if (Client.method922(var10.field2207[var21][var24]) || var25) {
                                 var22 = true;
                                 if (var10.field2299 != null && var10.field2299[var21] > Client.field1419) {
                                    break;
                                 }

                                 byte var26 = var10.field2303[var21][var24];
                                 if (var26 == 0 || (0 == (var26 & 8) || !Client.field1264.method1385(86) && !Client.field1264.method1385(82) && !Client.field1264.method1385(81)) && (0 == (var26 & 2) || Client.field1264.method1385(86)) && (0 == (var26 & 1) || Client.field1264.method1385(82)) && ((var26 & 4) == 0 || Client.field1264.method1385(81))) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              Client.method798(var21 + 1, var10.field2158, var10.field2277, var10.field2286, "");
                           } else if (var21 == 10) {
                              class519.method2502();
                              Client.method903(var10.field2158, var10.field2277, class125.method474(Client.method865(var10)), var10.field2286);
                              Client.field1299 = Client.method895(var10);
                              if (null == Client.field1299) {
                                 Client.field1299 = class424.field3311;
                              }

                              Client.field1310 = var10.field2162 + class389.method1778(16777215);
                           }

                           var24 = var10.field2233[var21];
                           if (var10.field2299 == null) {
                              var10.field2299 = new int[var10.field2207.length];
                           }

                           if (var10.field2234 == null) {
                              var10.field2234 = new int[var10.field2207.length];
                           }

                           if (var24 != 0) {
                              if (var10.field2299[var21] == 0) {
                                 var10.field2299[var21] = var10.field2234[var21] + var24 + Client.field1419;
                              } else {
                                 var10.field2299[var21] = Client.field1419 + var24;
                              }
                           } else {
                              var10.field2299[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && null != var10.field2299) {
                           var10.field2299[var21] = 0;
                        }
                     }
                  }

                  if (var10.field2238) {
                     if (class496.field3977 >= var13 && class496.field3960 >= var14 && class496.field3977 < var15 && class496.field3960 < var16) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     boolean var31 = false;
                     if ((class496.field3967 == 1 || !class301.field2050 && 4 == class496.field3967) && var30) {
                        var31 = true;
                     }

                     var22 = false;
                     if ((class496.field3971 == 1 || !class301.field2050 && 4 == class496.field3971) && class496.field3972 >= var13 && class496.field3973 >= var14 && class496.field3972 < var15 && class496.field3973 < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        Client.method872(var10, class496.field3972 - var27, class496.field3973 - var12);
                     }

                     if (var10.method1458()) {
                        if (var22) {
                           Client.field1370.method1995(new class55(0, class496.field3977 - var27, class496.field3960 - var12, var10));
                        }

                        if (var31) {
                           Client.field1370.method1995(new class55(1, class496.field3977 - var27, class496.field3960 - var12, var10));
                        }
                     }

                     if (1400 == var10.field2184) {
                        class512.field4083.method414(var18, var19, var30 & var31, var30 & var22);
                     }

                     if (null != Client.field1300 && Client.field1300 != var10 && var30 && class125.method475(Client.method865(var10))) {
                        Client.field1304 = var10;
                     }

                     if (Client.field1319 == var10) {
                        Client.field1305 = true;
                        Client.field1306 = var27;
                        Client.field1307 = var12;
                     }

                     if (var10.field2241) {
                        class64 var32;
                        if (var30 && Client.field1329 != 0 && var10.field2183 != null) {
                           var32 = new class64();
                           var32.field515 = true;
                           var32.field504 = var10;
                           var32.field508 = Client.field1329;
                           var32.field507 = var10.field2183;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1300 != null || Client.field1229) {
                           var22 = false;
                           var31 = false;
                           var30 = false;
                        }

                        if (!var10.field2292 && var22) {
                           var10.field2292 = true;
                           if (var10.field2210 != null) {
                              var32 = new class64();
                              var32.field515 = true;
                              var32.field504 = var10;
                              var32.field505 = class496.field3972 - var27;
                              var32.field508 = class496.field3973 - var12;
                              var32.field507 = var10.field2210;
                              Client.field1331.method1995(var32);
                           }
                        }

                        if (var10.field2292 && var31 && var10.field2156 != null) {
                           var32 = new class64();
                           var32.field515 = true;
                           var32.field504 = var10;
                           var32.field505 = class496.field3977 - var27;
                           var32.field508 = class496.field3960 - var12;
                           var32.field507 = var10.field2156;
                           Client.field1331.method1995(var32);
                        }

                        if (var10.field2292 && !var31) {
                           var10.field2292 = false;
                           if (var10.field2243 != null) {
                              var32 = new class64();
                              var32.field515 = true;
                              var32.field504 = var10;
                              var32.field505 = class496.field3977 - var27;
                              var32.field508 = class496.field3960 - var12;
                              var32.field507 = var10.field2243;
                              Client.field1333.method1995(var32);
                           }
                        }

                        if (var31 && null != var10.field2246) {
                           var32 = new class64();
                           var32.field515 = true;
                           var32.field504 = var10;
                           var32.field505 = class496.field3977 - var27;
                           var32.field508 = class496.field3960 - var12;
                           var32.field507 = var10.field2246;
                           Client.field1331.method1995(var32);
                        }

                        if (!var10.field2178 && var30) {
                           var10.field2178 = true;
                           if (null != var10.field2247) {
                              var32 = new class64();
                              var32.field515 = true;
                              var32.field504 = var10;
                              var32.field505 = class496.field3977 - var27;
                              var32.field508 = class496.field3960 - var12;
                              var32.field507 = var10.field2247;
                              Client.field1331.method1995(var32);
                           }
                        }

                        if (var10.field2178 && var30 && null != var10.field2248) {
                           var32 = new class64();
                           var32.field515 = true;
                           var32.field504 = var10;
                           var32.field505 = class496.field3977 - var27;
                           var32.field508 = class496.field3960 - var12;
                           var32.field507 = var10.field2248;
                           Client.field1331.method1995(var32);
                        }

                        if (var10.field2178 && !var30) {
                           var10.field2178 = false;
                           if (null != var10.field2219) {
                              var32 = new class64();
                              var32.field515 = true;
                              var32.field504 = var10;
                              var32.field505 = class496.field3977 - var27;
                              var32.field508 = class496.field3960 - var12;
                              var32.field507 = var10.field2219;
                              Client.field1333.method1995(var32);
                           }
                        }

                        if (var10.field2151 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2151;
                           Client.field1317.method1995(var32);
                        }

                        int var35;
                        class64 var37;
                        int var38;
                        if (var10.field2225 != null && Client.field1314 > var10.field2294) {
                           if (var10.field2255 != null && Client.field1314 - var10.field2294 <= 32) {
                              label643:
                              for(var38 = var10.field2294; var38 < Client.field1314; ++var38) {
                                 var24 = Client.field1313[var38 & 31];

                                 for(var35 = 0; var35 < var10.field2255.length; ++var35) {
                                    if (var10.field2255[var35] == var24) {
                                       var37 = new class64();
                                       var37.field504 = var10;
                                       var37.field507 = var10.field2225;
                                       Client.field1331.method1995(var37);
                                       break label643;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class64();
                              var32.field504 = var10;
                              var32.field507 = var10.field2225;
                              Client.field1331.method1995(var32);
                           }

                           var10.field2294 = Client.field1314;
                        }

                        if (null != var10.field2256 && Client.field1316 > var10.field2295) {
                           if (null != var10.field2187 && Client.field1316 - var10.field2295 <= 32) {
                              label619:
                              for(var38 = var10.field2295; var38 < Client.field1316; ++var38) {
                                 var24 = Client.field1315[var38 & 31];

                                 for(var35 = 0; var35 < var10.field2187.length; ++var35) {
                                    if (var24 == var10.field2187[var35]) {
                                       var37 = new class64();
                                       var37.field504 = var10;
                                       var37.field507 = var10.field2256;
                                       Client.field1331.method1995(var37);
                                       break label619;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class64();
                              var32.field504 = var10;
                              var32.field507 = var10.field2256;
                              Client.field1331.method1995(var32);
                           }

                           var10.field2295 = Client.field1316;
                        }

                        if (null != var10.field2258 && Client.field1318 > var10.field2296) {
                           if (null != var10.field2259 && Client.field1318 - var10.field2296 <= 32) {
                              label595:
                              for(var38 = var10.field2296; var38 < Client.field1318; ++var38) {
                                 var24 = Client.field1240[var38 & 31];

                                 for(var35 = 0; var35 < var10.field2259.length; ++var35) {
                                    if (var24 == var10.field2259[var35]) {
                                       var37 = new class64();
                                       var37.field504 = var10;
                                       var37.field507 = var10.field2258;
                                       Client.field1331.method1995(var37);
                                       break label595;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class64();
                              var32.field504 = var10;
                              var32.field507 = var10.field2258;
                              Client.field1331.method1995(var32);
                           }

                           var10.field2296 = Client.field1318;
                        }

                        if (Client.field1321 > var10.field2227 && null != var10.field2149) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2149;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1322 > var10.field2227 && var10.field2215 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2215;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1323 > var10.field2227 && var10.field2269 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2269;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1324 > var10.field2227 && var10.field2270 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2270;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1325 > var10.field2227 && var10.field2271 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2271;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1326 > var10.field2227 && var10.field2276 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2276;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1187 > var10.field2227 && var10.field2291 != null) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2291;
                           Client.field1331.method1995(var32);
                        }

                        if (Client.field1168 > var10.field2227 && null != var10.field2272) {
                           var32 = new class64();
                           var32.field504 = var10;
                           var32.field507 = var10.field2272;
                           Client.field1331.method1995(var32);
                        }

                        var10.field2227 = Client.field1118;
                        if (var10.field2265 != null) {
                           for(var38 = 0; var38 < Client.field1356; ++var38) {
                              class64 var36 = new class64();
                              var36.field504 = var10;
                              var36.field506 = Client.field1358[var38];
                              var36.field512 = Client.field1357[var38];
                              var36.field507 = var10.field2265;
                              Client.field1331.method1995(var36);
                           }
                        }

                        class64 var39;
                        int[] var40;
                        if (null != var10.field2275) {
                           var40 = Client.field1264.method1383();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class64();
                              var39.field504 = var10;
                              var39.field506 = var40[var24];
                              var39.field507 = var10.field2275;
                              Client.field1331.method1995(var39);
                           }
                        }

                        if (var10.field2232 != null) {
                           var40 = Client.field1264.method1384();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class64();
                              var39.field504 = var10;
                              var39.field506 = var40[var24];
                              var39.field507 = var10.field2232;
                              Client.field1331.method1995(var39);
                           }
                        }
                     }
                  }

                  if (!var10.field2238) {
                     if (null != Client.field1300 || Client.field1229) {
                        continue;
                     }

                     if ((var10.field2282 >= 0 || var10.field2185 != 0) && class496.field3977 >= var13 && class496.field3960 >= var14 && class496.field3977 < var15 && class496.field3960 < var16) {
                        if (var10.field2282 >= 0) {
                           class207.field1596 = var0[var10.field2282];
                        } else {
                           class207.field1596 = var10;
                        }
                     }

                     if (8 == var10.field2160 && class496.field3977 >= var13 && class496.field3960 >= var14 && class496.field3977 < var15 && class496.field3960 < var16) {
                        class405.field2812 = var10;
                     }

                     if (var10.field2180 > var10.field2150) {
                        Client.method923(var10, var10.field2173 + var27, var12, var10.field2150, var10.field2180, class496.field3977, class496.field3960);
                     }
                  }

                  if (0 == var10.field2160) {
                     method1378(var0, var10.field2158, var13, var14, var15, var16, var27 - var10.field2177, var12 - var10.field2191);
                     if (var10.field2290 != null) {
                        method1378(var10.field2290, var10.field2158, var13, var14, var15, var16, var27 - var10.field2177, var12 - var10.field2191);
                     }

                     class127 var33 = (class127)Client.field1137.method1431((long)var10.field2158);
                     if (null != var33) {
                        if (0 == var33.field801 && class496.field3977 >= var13 && class496.field3960 >= var14 && class496.field3977 < var15 && class496.field3960 < var16 && !Client.field1229) {
                           for(class64 var34 = (class64)Client.field1331.method1991(); var34 != null; var34 = (class64)Client.field1331.method1993()) {
                              if (var34.field515) {
                                 var34.method295();
                                 var34.field504.field2178 = false;
                              }
                           }

                           if (class124.field797 == 0) {
                              Client.field1300 = null;
                              Client.field1319 = null;
                           }

                           if (!Client.field1229) {
                              Client.method909();
                           }
                        }

                        Client.method809(var33.field803, var13, var14, var15, var16, var27, var12);
                     }
                  }
               }
            }
         }
      }

   }
}
