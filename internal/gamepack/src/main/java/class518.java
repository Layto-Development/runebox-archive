import java.net.URL;

public class class518 {
   static int field4143 = 0;
   static int field4147 = 0;
   static int[] field4144 = new int[]{1, 1, 1, 1};
   static int[] field4145 = new int[]{0, 1, 2, 3};
   int field4142;
   int field4146;
   int field4148;
   int field4151;
   int field4152;
   String field4149;
   String field4150;
   String field4153;

   class518() {
   }

   boolean method2480() {
      return (class145.field928.method180() & this.field4142) != 0;
   }

   boolean method2481() {
      return (class145.field918.method180() & this.field4142) != 0;
   }

   boolean method2482() {
      return (class145.field903.method180() & this.field4142) != 0;
   }

   boolean method2490() {
      return (class145.field912.method180() & this.field4142) != 0;
   }

   boolean method2488() {
      return (class145.field916.method180() & this.field4142) != 0;
   }

   boolean method2484() {
      return (class145.field931.method180() & this.field4142) != 0;
   }

   boolean method2487() {
      return (class145.field927.method180() & this.field4142) != 0;
   }

   boolean method2485() {
      return (class145.field932.method180() & this.field4142) != 0;
   }

   boolean method2489() {
      return (class145.field910.method180() & this.field4142) != 0;
   }

   boolean method2486() {
      return (class145.field929.method180() & this.field4142) != 0;
   }

   static boolean method2494() {
      try {
         if (class315.field2133 == null) {
            class315.field2133 = class234.field1727.method152(new URL(class52.field429));
         } else if (class315.field2133.method1086()) {
            byte[] var1 = class315.field2133.method1088();
            class366 var2 = new class366(var1);
            var2.method1658();
            field4147 = var2.method1703();
            class27.field263 = new class518[field4147];

            class518 var4;
            for(int var3 = 0; var3 < field4147; var4.field4152 = var3++) {
               var4 = class27.field263[var3] = new class518();
               var4.field4146 = var2.method1703();
               var4.field4142 = var2.method1658();
               var4.field4149 = var2.method1662();
               var4.field4150 = var2.method1662();
               var4.field4151 = var2.method1654();
               var4.field4148 = var2.method1656();
            }

            method2492(class27.field263, 0, class27.field263.length - 1, field4145, field4144);
            class315.field2133 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class315.field2133 = null;
      }

      return false;
   }

   static void method2497(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != field4145[var6]) {
            var3[var5] = field4145[var6];
            var4[var5] = field4144[var6];
            ++var5;
         }
      }

      field4145 = var3;
      field4144 = var4;
      method2492(class27.field263, 0, class27.field263.length - 1, field4145, field4144);
   }

   static void method2492(class518[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var1 + var2) / 2;
         class518 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var7].field4152;
                     var13 = var9.field4152;
                  } else if (1 == var3[var11]) {
                     var12 = var0[var7].field4148;
                     var13 = var9.field4148;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && 1 == var4[var11]) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var7].method2480() ? 1 : 0;
                     var13 = var9.method2480() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field4146;
                     var13 = var9.field4146;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 <= var13) && (0 != var4[var11] || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (var3[var11] == 2) {
                     var12 = var0[var6].field4152;
                     var13 = var9.field4152;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var6].field4148;
                     var13 = var9.field4148;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && 1 == var4[var11]) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var6].method2480() ? 1 : 0;
                     var13 = var9.method2480() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field4146;
                     var13 = var9.field4146;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 >= var13) && (0 != var4[var11] || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class518 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method2492(var0, var1, var7, var3, var4);
         method2492(var0, var7 + 1, var2, var3, var4);
      }

   }

   static void method2496(int var0, boolean var1, int var2, boolean var3) {
      if (null != class27.field263) {
         method2499(0, class27.field263.length - 1, var0, var1, var2, var3);
      }

   }

   static void method2499(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class518 var9 = class27.field263[var7];
         class27.field263[var7] = class27.field263[var1];
         class27.field263[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if (method2493(class27.field263[var10], var9, var2, var3, var4, var5) <= 0) {
               class518 var11 = class27.field263[var10];
               class27.field263[var10] = class27.field263[var8];
               class27.field263[var8++] = var11;
            }
         }

         class27.field263[var1] = class27.field263[var8];
         class27.field263[var8] = var9;
         method2499(var0, var8 - 1, var2, var3, var4, var5);
         method2499(var8 + 1, var1, var2, var3, var4, var5);
      }

   }

   static int method2493(class518 var0, class518 var1, int var2, boolean var3, int var4, boolean var5) {
      int var7 = method2495(var0, var1, var2, var3);
      if (var7 != 0) {
         return var3 ? -var7 : var7;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var8 = method2495(var0, var1, var4, var5);
         return var5 ? -var8 : var8;
      }
   }

   static int method2495(class518 var0, class518 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = var0.field4148;
         int var6 = var1.field4148;
         if (!var3) {
            if (var5 == -1) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (var2 == 2) {
         return var0.field4151 - var1.field4151;
      } else if (var2 == 3) {
         if (var0.field4150.equals("-")) {
            if (var1.field4150.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field4150.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field4150.compareTo(var1.field4150);
         }
      } else if (var2 == 4) {
         return var0.method2488() ? (var1.method2488() ? 0 : 1) : (var1.method2488() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method2482() ? (var1.method2482() ? 0 : 1) : (var1.method2482() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method2490() ? (var1.method2490() ? 0 : 1) : (var1.method2490() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method2480() ? (var1.method2480() ? 0 : 1) : (var1.method2480() ? -1 : 0);
      } else {
         return var0.field4146 - var1.field4146;
      }
   }

   static class518 method2491() {
      field4143 = 0;
      return method2498();
   }

   static class518 method2498() {
      return field4143 < field4147 ? class27.field263[++field4143 - 1] : null;
   }

   static final void method2483(class473 var0) {
      class435 var2 = Client.field1181.field3782;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (class473.field3751 == var0) {
         var3 = var2.method1693();
         var4 = var2.method1694();
         var5 = var2.method1654();
         var6 = (var5 >> 4 & 7) + class307.field2070;
         var7 = class203.field1570 + (var5 & 7);
         var8 = var2.method1682();
         if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
            class429 var40 = Client.field1256[class156.field980][var6][var7];
            if (var40 != null) {
               for(class18 var37 = (class18)var40.method1991(); var37 != null; var37 = (class18)var40.method1993()) {
                  if ((var8 & 32767) == var37.field207 && var37.field208 == var4) {
                     var37.field208 = var3;
                     break;
                  }
               }

               Client.method837(var6, var7);
            }
         }

      } else {
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (class473.field3754 == var0) {
            var3 = var2.method1675();
            var4 = var3 >> 2;
            var5 = var3 & 3;
            var6 = Client.field1301[var4];
            var7 = var2.method1714();
            var8 = class307.field2070 + (var7 >> 4 & 7);
            var9 = (var7 & 7) + class203.field1570;
            var10 = var2.method1683();
            var11 = var2.method1669();
            var12 = var2.method1677();
            var13 = var2.method1681();
            var14 = var2.method1681();
            var15 = var2.method1678();
            var16 = var2.method1655();
            int var17 = var2.method1683();
            class443 var18;
            if (Client.field1244 == var10) {
               var18 = class266.field1874;
            } else {
               var18 = Client.field1289[var10];
            }

            if (var18 != null) {
               class458 var19 = class430.method2004(var14, (byte)-34);
               int var20;
               int var21;
               if (var5 != 1 && var5 != 3) {
                  var20 = var19.field3610;
                  var21 = var19.field3595;
               } else {
                  var20 = var19.field3595;
                  var21 = var19.field3610;
               }

               int var22 = var8 + (var20 >> 1);
               int var23 = var8 + (var20 + 1 >> 1);
               int var24 = var9 + (var21 >> 1);
               int var25 = (var21 + 1 >> 1) + var9;
               int[][] var26 = class513.field4098[class156.field980];
               int var27 = var26[var23][var25] + var26[var22][var25] + var26[var23][var24] + var26[var22][var24] >> 2;
               int var28 = (var8 << 7) + (var20 << 6);
               int var29 = (var21 << 6) + (var9 << 7);
               class485 var30 = var19.method2154(var4, var5, var26, var28, var27, var29);
               if (var30 != null) {
                  Client.method816(class156.field980, var8, var9, var6, -1, 0, 0, 31, var13 + 1, var17 + 1);
                  var18.field3502 = Client.field1419 + var13;
                  var18.field3512 = var17 + Client.field1419;
                  var18.field3506 = var30;
                  var18.field3503 = var8 * 128 + var20 * 64;
                  var18.field3505 = var9 * 128 + var21 * 64;
                  var18.field3504 = var27;
                  byte var31;
                  if (var15 > var11) {
                     var31 = (byte)var15;
                     var15 = var11;
                     var11 = var31;
                  }

                  if (var12 > var16) {
                     var31 = (byte)var12;
                     var12 = var16;
                     var16 = var31;
                  }

                  var18.field3518 = var8 + var15;
                  var18.field3509 = var11 + var8;
                  var18.field3508 = var12 + var9;
                  var18.field3498 = var16 + var9;
               }
            }
         }

         if (var0 == class473.field3747) {
            var3 = var2.method1714();
            var4 = (var3 >> 4 & 7) + class307.field2070;
            var5 = class203.field1570 + (var3 & 7);
            var6 = var2.method1703();
            var7 = var2.method1714();
            var8 = var2.method1682();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               var4 = 64 + var4 * 128;
               var5 = 64 + var5 * 128;
               class149 var39 = new class149(var8, class156.field980, var4, var5, Client.method787(var4, var5, class156.field980) - var7, var6, Client.field1419);
               Client.field1386.method1995(var39);
            }

         } else if (class473.field3755 == var0) {
            var3 = var2.method1675();
            var4 = var2.method1714();
            var5 = var4 >> 2;
            var6 = var4 & 3;
            var7 = Client.field1301[var5];
            var8 = var2.method1683();
            var9 = var2.method1676();
            var10 = class307.field2070 + (var9 >> 4 & 7);
            var11 = class203.field1570 + (var9 & 7);
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
               Client.method816(class156.field980, var10, var11, var7, var8, var5, var6, var3, 0, -1);
            }

         } else if (class473.field3748 == var0) {
            var3 = var2.method1714();
            var4 = var3 >> 2;
            var5 = var3 & 3;
            var6 = Client.field1301[var4];
            var7 = var2.method1681();
            var8 = var2.method1714();
            var9 = (var8 >> 4 & 7) + class307.field2070;
            var10 = (var8 & 7) + class203.field1570;
            if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
               if (var6 == 0) {
                  class71 var41 = class137.field875.method1850(class156.field980, var9, var10);
                  if (var41 != null) {
                     var12 = class463.method2185(var41.field539);
                     if (var4 == 2) {
                        var41.field540 = new class359(var12, 2, var5 + 4, class156.field980, var9, var10, var7, false, var41.field540);
                        var41.field538 = new class359(var12, 2, var5 + 1 & 3, class156.field980, var9, var10, var7, false, var41.field538);
                     } else {
                        var41.field540 = new class359(var12, var4, var5, class156.field980, var9, var10, var7, false, var41.field540);
                     }

                     return;
                  }
               }

               if (var6 == 1) {
                  class385 var42 = class137.field875.method1851(class156.field980, var9, var10);
                  if (null != var42) {
                     var12 = class463.method2185(var42.field2731);
                     if (var4 != 4 && var4 != 5) {
                        if (var4 == 6) {
                           var42.field2728 = new class359(var12, 4, var5 + 4, class156.field980, var9, var10, var7, false, var42.field2728);
                        } else if (var4 == 7) {
                           var42.field2728 = new class359(var12, 4, (var5 + 2 & 3) + 4, class156.field980, var9, var10, var7, false, var42.field2728);
                        } else if (var4 == 8) {
                           var42.field2728 = new class359(var12, 4, var5 + 4, class156.field980, var9, var10, var7, false, var42.field2728);
                           var42.field2729 = new class359(var12, 4, 4 + (var5 + 2 & 3), class156.field980, var9, var10, var7, false, var42.field2729);
                        }
                     } else {
                        var42.field2728 = new class359(var12, 4, var5, class156.field980, var9, var10, var7, false, var42.field2728);
                     }

                     return;
                  }
               }

               if (var6 == 2) {
                  class276 var43 = class137.field875.method1888(class156.field980, var9, var10);
                  if (var4 == 11) {
                     var4 = 10;
                  }

                  if (null != var43) {
                     var43.field1935 = new class359(class463.method2185(var43.field1940), var4, var5, class156.field980, var9, var10, var7, false, var43.field1935);
                     return;
                  }
               }

               if (var6 == 3) {
                  class514 var44 = class137.field875.method1875(class156.field980, var9, var10);
                  if (var44 != null) {
                     var44.field4106 = new class359(class463.method2185(var44.field4105), 22, var5, class156.field980, var9, var10, var7, false, var44.field4106);
                     return;
                  }
               }

               Client.method933(class156.field980, var9, var10, var6, var7);
            }

         } else {
            class18 var36;
            if (class473.field3752 == var0) {
               var2.method1675();
               var3 = var2.method1675();
               var4 = (var3 >> 4 & 7) + class307.field2070;
               var5 = (var3 & 7) + class203.field1570;
               var6 = var2.method1654();
               var7 = var2.method1658();
               var2.method1683();
               var2.method1681();
               var2.method1675();
               var8 = var2.method1703();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  var36 = new class18();
                  var36.field207 = var8;
                  var36.field208 = var7;
                  var36.method105(var6);
                  if (Client.field1256[class156.field980][var4][var5] == null) {
                     Client.field1256[class156.field980][var4][var5] = new class429();
                  }

                  Client.field1256[class156.field980][var4][var5].method1995(var36);
                  Client.method837(var4, var5);
               }

            } else if (class473.field3757 == var0) {
               var3 = var2.method1654();
               var4 = (var3 >> 4 & 7) + class307.field2070;
               var5 = (var3 & 7) + class203.field1570;
               var6 = var2.method1714();
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = Client.field1301[var7];
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  Client.method816(class156.field980, var4, var5, var9, -1, var7, var8, 31, 0, -1);
               }

            } else {
               class429 var34;
               if (class473.field3756 == var0) {
                  var3 = var2.method1683();
                  var4 = var2.method1693();
                  var5 = var2.method1654();
                  var6 = class307.field2070 + (var5 >> 4 & 7);
                  var7 = class203.field1570 + (var5 & 7);
                  if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var34 = Client.field1256[class156.field980][var6][var7];
                     if (var34 != null) {
                        for(var36 = (class18)var34.method1991(); null != var36; var36 = (class18)var34.method1993()) {
                           if ((var3 & 32767) == var36.field207 && var36.field208 == var4) {
                              var36.method295();
                              break;
                           }
                        }

                        if (var34.method1991() == null) {
                           Client.field1256[class156.field980][var6][var7] = null;
                        }

                        Client.method837(var6, var7);
                     }
                  }

               } else {
                  if (var0 == class473.field3753) {
                     var3 = var2.method1675();
                     var4 = class307.field2070 + (var3 >> 4 & 7);
                     var5 = (var3 & 7) + class203.field1570;
                     var6 = var2.method1676();
                     var7 = var6 >> 4 & 15;
                     var8 = var6 & 7;
                     var9 = var2.method1654();
                     var10 = var2.method1683();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var11 = var7 + 1;
                        if (class266.field1874.field3448[0] >= var4 - var11 && class266.field1874.field3448[0] <= var11 + var4 && class266.field1874.field3445[0] >= var5 - var11 && class266.field1874.field3445[0] <= var11 + var5 && class158.field1004.method536() != 0 && var8 > 0 && Client.field1371 < 50) {
                           Client.field1372[Client.field1371] = var10;
                           Client.field1373[Client.field1371] = var8;
                           Client.field1328[Client.field1371] = var9;
                           Client.field1160[Client.field1371] = null;
                           Client.field1123[Client.field1371] = var7 + (var4 << 16) + (var5 << 8);
                           ++Client.field1371;
                        }
                     }
                  }

                  if (class473.field3750 == var0) {
                     var3 = var2.method1682();
                     var4 = var2.method1703();
                     byte var32 = var2.method1678();
                     var6 = var2.method1714();
                     var7 = var2.method1688();
                     byte var35 = var2.method1655();
                     var9 = var2.method1675() * 4;
                     var10 = var2.method1714();
                     var11 = var2.method1676() * 4;
                     var12 = var2.method1689();
                     var13 = var2.method1654();
                     var14 = (var13 >> 4 & 7) + class307.field2070;
                     var15 = (var13 & 7) + class203.field1570;
                     var16 = var2.method1683();
                     var5 = var32 + var14;
                     var8 = var35 + var15;
                     if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var5 >= 0 && var8 >= 0 && var5 < 104 && var8 < 104 && var16 != 65535) {
                        var14 = var14 * 128 + 64;
                        var15 = var15 * 128 + 64;
                        var5 = var5 * 128 + 64;
                        var8 = 64 + var8 * 128;
                        class484 var46 = new class484(var16, class156.field980, var14, var15, Client.method787(var14, var15, class156.field980) - var9, Client.field1419 + var3, var4 + Client.field1419, var6, var10, var12, var7, var11);
                        var46.method2287(var5, var8, Client.method787(var5, var8, class156.field980) - var11, var3 + Client.field1419);
                        Client.field1243.method1995(var46);
                     }

                  } else if (class473.field3746 == var0) {
                     var3 = var2.method1681();
                     var4 = var2.method1675();
                     var5 = (var4 >> 4 & 7) + class307.field2070;
                     var6 = (var4 & 7) + class203.field1570;
                     byte var33 = var2.method1678();
                     var8 = var2.method1689();
                     var9 = var2.method1675();
                     var10 = var2.method1683();
                     byte var38 = var2.method1669();
                     var12 = var2.method1714() * 4;
                     var13 = var2.method1675();
                     var14 = var2.method1675() * 4;
                     var15 = var2.method1703();
                     var11 = var38 + var5;
                     var7 = var33 + var6;
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var11 >= 0 && var7 >= 0 && var11 < 104 && var7 < 104 && var3 != 65535) {
                        var5 = 64 + var5 * 128;
                        var6 = 64 + var6 * 128;
                        var11 = 64 + var11 * 128;
                        var7 = 64 + var7 * 128;
                        class484 var45 = new class484(var3, class156.field980, var5, var6, Client.method787(var5, var6, class156.field980) - var14, Client.field1419 + var15, var10 + Client.field1419, var9, var13, var8, var12);
                        var45.method2287(var11, var7, Client.method787(var11, var7, class156.field980) - var12, var15 + Client.field1419);
                        Client.field1243.method1995(var45);
                     }

                  } else if (var0 == class473.field3749) {
                     var3 = var2.method1654();
                     var4 = (var3 >> 4 & 7) + class307.field2070;
                     var5 = (var3 & 7) + class203.field1570;
                     var6 = var2.method1676();
                     var7 = var2.method1681();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var34 = Client.field1256[class156.field980][var4][var5];
                        if (null != var34) {
                           for(var36 = (class18)var34.method1991(); var36 != null; var36 = (class18)var34.method1993()) {
                              if ((var7 & 32767) == var36.field207) {
                                 var36.method105(var6);
                                 break;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }
}
