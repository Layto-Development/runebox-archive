import java.net.URL;

public class class230 {
   static int field2130 = 0;
   static int field2134 = 0;
   static int[] field2131 = new int[]{1, 1, 1, 1};
   static int[] field2132 = new int[]{0, 1, 2, 3};
   int field2129;
   int field2133;
   int field2135;
   int field2138;
   int field2139;
   String field2136;
   String field2137;
   String field2140;

   class230() {
   }

   boolean method1397() {
      return (class38.field915.method1195() & this.field2129) != 0;
   }

   boolean method1398() {
      return (class38.field905.method1195() & this.field2129) != 0;
   }

   boolean method1399() {
      return (class38.field890.method1195() & this.field2129) != 0;
   }

   boolean method1407() {
      return (class38.field899.method1195() & this.field2129) != 0;
   }

   boolean method1405() {
      return (class38.field903.method1195() & this.field2129) != 0;
   }

   boolean method1401() {
      return (class38.field918.method1195() & this.field2129) != 0;
   }

   boolean method1404() {
      return (class38.field914.method1195() & this.field2129) != 0;
   }

   boolean method1402() {
      return (class38.field919.method1195() & this.field2129) != 0;
   }

   boolean method1406() {
      return (class38.field897.method1195() & this.field2129) != 0;
   }

   boolean method1403() {
      return (class38.field916.method1195() & this.field2129) != 0;
   }

   static boolean method1411() {
      try {
         if (class238.field2184 == null) {
            class238.field2184 = class19.field209.method657(new URL(class220.field2039));
         } else if (class238.field2184.method2563()) {
            byte[] var1 = class238.field2184.method2565();
            class184 var2 = new class184(var1);
            var2.method1129();
            field2134 = var2.method1174();
            class263.field2288 = new class230[field2134];

            class230 var4;
            for(int var3 = 0; var3 < field2134; var4.field2139 = var3++) {
               var4 = class263.field2288[var3] = new class230();
               var4.field2133 = var2.method1174();
               var4.field2129 = var2.method1129();
               var4.field2136 = var2.method1133();
               var4.field2137 = var2.method1133();
               var4.field2138 = var2.method1125();
               var4.field2135 = var2.method1127();
            }

            method1409(class263.field2288, 0, class263.field2288.length - 1, field2132, field2131);
            class238.field2184 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class238.field2184 = null;
      }

      return false;
   }

   static void method1414(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != field2132[var6]) {
            var3[var5] = field2132[var6];
            var4[var5] = field2131[var6];
            ++var5;
         }
      }

      field2132 = var3;
      field2131 = var4;
      method1409(class263.field2288, 0, class263.field2288.length - 1, field2132, field2131);
   }

   static void method1409(class230[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var1 + var2) / 2;
         class230 var9 = var0[var8];
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
                     var12 = var0[var7].field2139;
                     var13 = var9.field2139;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var7].field2135;
                     var13 = var9.field2135;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var7].method1397() ? 1 : 0;
                     var13 = var9.method1397() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field2133;
                     var13 = var9.field2133;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
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
                     var12 = var0[var6].field2139;
                     var13 = var9.field2139;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var6].field2135;
                     var13 = var9.field2135;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var6].method1397() ? 1 : 0;
                     var13 = var9.method1397() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field2133;
                     var13 = var9.field2133;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
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
               class230 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method1409(var0, var1, var7, var3, var4);
         method1409(var0, var7 + 1, var2, var3, var4);
      }

   }

   static void method1413(int var0, boolean var1, int var2, boolean var3) {
      if (null != class263.field2288) {
         method1416(0, class263.field2288.length - 1, var0, var1, var2, var3);
      }

   }

   static void method1416(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class230 var9 = class263.field2288[var7];
         class263.field2288[var7] = class263.field2288[var1];
         class263.field2288[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if (method1410(class263.field2288[var10], var9, var2, var3, var4, var5) <= 0) {
               class230 var11 = class263.field2288[var10];
               class263.field2288[var10] = class263.field2288[var8];
               class263.field2288[var8++] = var11;
            }
         }

         class263.field2288[var1] = class263.field2288[var8];
         class263.field2288[var8] = var9;
         method1416(var0, var8 - 1, var2, var3, var4, var5);
         method1416(var8 + 1, var1, var2, var3, var4, var5);
      }

   }

   static int method1410(class230 var0, class230 var1, int var2, boolean var3, int var4, boolean var5) {
      int var7 = method1412(var0, var1, var2, var3);
      if (var7 != 0) {
         return var3 ? -var7 : var7;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var8 = method1412(var0, var1, var4, var5);
         return var5 ? -var8 : var8;
      }
   }

   static int method1412(class230 var0, class230 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = var0.field2135;
         int var6 = var1.field2135;
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
         return var0.field2138 - var1.field2138;
      } else if (var2 == 3) {
         if (var0.field2137.equals("-")) {
            if (var1.field2137.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field2137.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field2137.compareTo(var1.field2137);
         }
      } else if (var2 == 4) {
         return var0.method1405() ? (var1.method1405() ? 0 : 1) : (var1.method1405() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1399() ? (var1.method1399() ? 0 : 1) : (var1.method1399() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1407() ? (var1.method1407() ? 0 : 1) : (var1.method1407() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1397() ? (var1.method1397() ? 0 : 1) : (var1.method1397() ? -1 : 0);
      } else {
         return var0.field2133 - var1.field2133;
      }
   }

   static class230 method1408() {
      field2130 = 0;
      return method1415();
   }

   static class230 method1415() {
      return field2130 < field2134 ? class263.field2288[++field2130 - 1] : null;
   }

   static final void method1400(class413 var0) {
      class164 var2 = Client.field641.field2759;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (class413.field3167 == var0) {
         var3 = var2.method1164();
         var4 = var2.method1165();
         var5 = var2.method1125();
         var6 = (var5 >> 4 & 7) + class372.field2904;
         var7 = class359.field2820 + (var5 & 7);
         var8 = var2.method1153();
         if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
            class201 var40 = Client.field716[class192.field1881][var6][var7];
            if (var40 != null) {
               for(class443 var37 = (class443)var40.method1236(); var37 != null; var37 = (class443)var40.method1238()) {
                  if ((var8 & 32767) == var37.field3359 && var37.field3360 == var4) {
                     var37.field3360 = var3;
                     break;
                  }
               }

               Client.method453(var6, var7);
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
         if (class413.field3170 == var0) {
            var3 = var2.method1146();
            var4 = var3 >> 2;
            var5 = var3 & 3;
            var6 = Client.field761[var4];
            var7 = var2.method1185();
            var8 = class372.field2904 + (var7 >> 4 & 7);
            var9 = (var7 & 7) + class359.field2820;
            var10 = var2.method1154();
            var11 = var2.method1140();
            var12 = var2.method1148();
            var13 = var2.method1152();
            var14 = var2.method1152();
            var15 = var2.method1149();
            var16 = var2.method1126();
            int var17 = var2.method1154();
            class522 var18;
            if (Client.field704 == var10) {
               var18 = class259.field2281;
            } else {
               var18 = Client.field749[var10];
            }

            if (var18 != null) {
               class449 var19 = class444.method2172(var14, (byte)-34);
               int var20;
               int var21;
               if (var5 != 1 && var5 != 3) {
                  var20 = var19.field3450;
                  var21 = var19.field3435;
               } else {
                  var20 = var19.field3435;
                  var21 = var19.field3450;
               }

               int var22 = var8 + (var20 >> 1);
               int var23 = var8 + (var20 + 1 >> 1);
               int var24 = var9 + (var21 >> 1);
               int var25 = (var21 + 1 >> 1) + var9;
               int[][] var26 = class526.field4141[class192.field1881];
               int var27 = var26[var23][var25] + var26[var22][var25] + var26[var23][var24] + var26[var22][var24] >> 2;
               int var28 = (var8 << 7) + (var20 << 6);
               int var29 = (var21 << 6) + (var9 << 7);
               class104 var30 = var19.method2214(var4, var5, var26, var28, var27, var29);
               if (var30 != null) {
                  Client.method432(class192.field1881, var8, var9, var6, -1, 0, 0, 31, var13 + 1, var17 + 1);
                  var18.field4104 = Client.field879 + var13;
                  var18.field4114 = var17 + Client.field879;
                  var18.field4108 = var30;
                  var18.field4105 = var8 * 128 + var20 * 64;
                  var18.field4107 = var9 * 128 + var21 * 64;
                  var18.field4106 = var27;
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

                  var18.field4120 = var8 + var15;
                  var18.field4111 = var11 + var8;
                  var18.field4110 = var12 + var9;
                  var18.field4100 = var16 + var9;
               }
            }
         }

         if (var0 == class413.field3163) {
            var3 = var2.method1185();
            var4 = (var3 >> 4 & 7) + class372.field2904;
            var5 = class359.field2820 + (var3 & 7);
            var6 = var2.method1174();
            var7 = var2.method1185();
            var8 = var2.method1153();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
               var4 = 64 + var4 * 128;
               var5 = 64 + var5 * 128;
               class493 var39 = new class493(var8, class192.field1881, var4, var5, Client.method403(var4, var5, class192.field1881) - var7, var6, Client.field879);
               Client.field846.method1240(var39);
            }

         } else if (class413.field3171 == var0) {
            var3 = var2.method1146();
            var4 = var2.method1185();
            var5 = var4 >> 2;
            var6 = var4 & 3;
            var7 = Client.field761[var5];
            var8 = var2.method1154();
            var9 = var2.method1147();
            var10 = class372.field2904 + (var9 >> 4 & 7);
            var11 = class359.field2820 + (var9 & 7);
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
               Client.method432(class192.field1881, var10, var11, var7, var8, var5, var6, var3, 0, -1);
            }

         } else if (class413.field3164 == var0) {
            var3 = var2.method1185();
            var4 = var3 >> 2;
            var5 = var3 & 3;
            var6 = Client.field761[var4];
            var7 = var2.method1152();
            var8 = var2.method1185();
            var9 = (var8 >> 4 & 7) + class372.field2904;
            var10 = (var8 & 7) + class359.field2820;
            if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
               if (var6 == 0) {
                  class450 var41 = class75.field1223.method1041(class192.field1881, var9, var10);
                  if (var41 != null) {
                     var12 = class256.method1471(var41.field3492);
                     if (var4 == 2) {
                        var41.field3493 = new class50(var12, 2, var5 + 4, class192.field1881, var9, var10, var7, false, var41.field3493);
                        var41.field3491 = new class50(var12, 2, var5 + 1 & 3, class192.field1881, var9, var10, var7, false, var41.field3491);
                     } else {
                        var41.field3493 = new class50(var12, var4, var5, class192.field1881, var9, var10, var7, false, var41.field3493);
                     }

                     return;
                  }
               }

               if (var6 == 1) {
                  class60 var42 = class75.field1223.method1042(class192.field1881, var9, var10);
                  if (null != var42) {
                     var12 = class256.method1471(var42.field1104);
                     if (var4 != 4 && var4 != 5) {
                        if (var4 == 6) {
                           var42.field1101 = new class50(var12, 4, var5 + 4, class192.field1881, var9, var10, var7, false, var42.field1101);
                        } else if (var4 == 7) {
                           var42.field1101 = new class50(var12, 4, (var5 + 2 & 3) + 4, class192.field1881, var9, var10, var7, false, var42.field1101);
                        } else if (var4 == 8) {
                           var42.field1101 = new class50(var12, 4, var5 + 4, class192.field1881, var9, var10, var7, false, var42.field1101);
                           var42.field1102 = new class50(var12, 4, 4 + (var5 + 2 & 3), class192.field1881, var9, var10, var7, false, var42.field1102);
                        }
                     } else {
                        var42.field1101 = new class50(var12, 4, var5, class192.field1881, var9, var10, var7, false, var42.field1101);
                     }

                     return;
                  }
               }

               if (var6 == 2) {
                  class154 var43 = class75.field1223.method1079(class192.field1881, var9, var10);
                  if (var4 == 11) {
                     var4 = 10;
                  }

                  if (null != var43) {
                     var43.field1639 = new class50(class256.method1471(var43.field1644), var4, var5, class192.field1881, var9, var10, var7, false, var43.field1639);
                     return;
                  }
               }

               if (var6 == 3) {
                  class189 var44 = class75.field1223.method1066(class192.field1881, var9, var10);
                  if (var44 != null) {
                     var44.field1858 = new class50(class256.method1471(var44.field1857), 22, var5, class192.field1881, var9, var10, var7, false, var44.field1858);
                     return;
                  }
               }

               Client.method549(class192.field1881, var9, var10, var6, var7);
            }

         } else {
            class443 var36;
            if (class413.field3168 == var0) {
               var2.method1146();
               var3 = var2.method1146();
               var4 = (var3 >> 4 & 7) + class372.field2904;
               var5 = (var3 & 7) + class359.field2820;
               var6 = var2.method1125();
               var7 = var2.method1129();
               var2.method1154();
               var2.method1152();
               var2.method1146();
               var8 = var2.method1174();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  var36 = new class443();
                  var36.field3359 = var8;
                  var36.field3360 = var7;
                  var36.method2164(var6);
                  if (Client.field716[class192.field1881][var4][var5] == null) {
                     Client.field716[class192.field1881][var4][var5] = new class201();
                  }

                  Client.field716[class192.field1881][var4][var5].method1240(var36);
                  Client.method453(var4, var5);
               }

            } else if (class413.field3173 == var0) {
               var3 = var2.method1125();
               var4 = (var3 >> 4 & 7) + class372.field2904;
               var5 = (var3 & 7) + class359.field2820;
               var6 = var2.method1185();
               var7 = var6 >> 2;
               var8 = var6 & 3;
               var9 = Client.field761[var7];
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  Client.method432(class192.field1881, var4, var5, var9, -1, var7, var8, 31, 0, -1);
               }

            } else {
               class201 var34;
               if (class413.field3172 == var0) {
                  var3 = var2.method1154();
                  var4 = var2.method1164();
                  var5 = var2.method1125();
                  var6 = class372.field2904 + (var5 >> 4 & 7);
                  var7 = class359.field2820 + (var5 & 7);
                  if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var34 = Client.field716[class192.field1881][var6][var7];
                     if (var34 != null) {
                        for(var36 = (class443)var34.method1236(); null != var36; var36 = (class443)var34.method1238()) {
                           if ((var3 & 32767) == var36.field3359 && var36.field3360 == var4) {
                              var36.method605();
                              break;
                           }
                        }

                        if (var34.method1236() == null) {
                           Client.field716[class192.field1881][var6][var7] = null;
                        }

                        Client.method453(var6, var7);
                     }
                  }

               } else {
                  if (var0 == class413.field3169) {
                     var3 = var2.method1146();
                     var4 = class372.field2904 + (var3 >> 4 & 7);
                     var5 = (var3 & 7) + class359.field2820;
                     var6 = var2.method1147();
                     var7 = var6 >> 4 & 15;
                     var8 = var6 & 7;
                     var9 = var2.method1125();
                     var10 = var2.method1154();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var11 = var7 + 1;
                        if (class259.field2281.field4073[0] >= var4 - var11 && class259.field2281.field4073[0] <= var11 + var4 && class259.field2281.field4070[0] >= var5 - var11 && class259.field2281.field4070[0] <= var11 + var5 && class4.field36.method2432() != 0 && var8 > 0 && Client.field831 < 50) {
                           Client.field832[Client.field831] = var10;
                           Client.field833[Client.field831] = var8;
                           Client.field788[Client.field831] = var9;
                           Client.field620[Client.field831] = null;
                           Client.field583[Client.field831] = var7 + (var4 << 16) + (var5 << 8);
                           ++Client.field831;
                        }
                     }
                  }

                  if (class413.field3166 == var0) {
                     var3 = var2.method1153();
                     var4 = var2.method1174();
                     byte var32 = var2.method1149();
                     var6 = var2.method1185();
                     var7 = var2.method1159();
                     byte var35 = var2.method1126();
                     var9 = var2.method1146() * 4;
                     var10 = var2.method1185();
                     var11 = var2.method1147() * 4;
                     var12 = var2.method1160();
                     var13 = var2.method1125();
                     var14 = (var13 >> 4 & 7) + class372.field2904;
                     var15 = (var13 & 7) + class359.field2820;
                     var16 = var2.method1154();
                     var5 = var32 + var14;
                     var8 = var35 + var15;
                     if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var5 >= 0 && var8 >= 0 && var5 < 104 && var8 < 104 && var16 != 65535) {
                        var14 = var14 * 128 + 64;
                        var15 = var15 * 128 + 64;
                        var5 = var5 * 128 + 64;
                        var8 = 64 + var8 * 128;
                        class305 var46 = new class305(var16, class192.field1881, var14, var15, Client.method403(var14, var15, class192.field1881) - var9, Client.field879 + var3, var4 + Client.field879, var6, var10, var12, var7, var11);
                        var46.method1667(var5, var8, Client.method403(var5, var8, class192.field1881) - var11, var3 + Client.field879);
                        Client.field703.method1240(var46);
                     }

                  } else if (class413.field3162 == var0) {
                     var3 = var2.method1152();
                     var4 = var2.method1146();
                     var5 = (var4 >> 4 & 7) + class372.field2904;
                     var6 = (var4 & 7) + class359.field2820;
                     byte var33 = var2.method1149();
                     var8 = var2.method1160();
                     var9 = var2.method1146();
                     var10 = var2.method1154();
                     byte var38 = var2.method1140();
                     var12 = var2.method1185() * 4;
                     var13 = var2.method1146();
                     var14 = var2.method1146() * 4;
                     var15 = var2.method1174();
                     var11 = var38 + var5;
                     var7 = var33 + var6;
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var11 >= 0 && var7 >= 0 && var11 < 104 && var7 < 104 && var3 != 65535) {
                        var5 = 64 + var5 * 128;
                        var6 = 64 + var6 * 128;
                        var11 = 64 + var11 * 128;
                        var7 = 64 + var7 * 128;
                        class305 var45 = new class305(var3, class192.field1881, var5, var6, Client.method403(var5, var6, class192.field1881) - var14, Client.field879 + var15, var10 + Client.field879, var9, var13, var8, var12);
                        var45.method1667(var11, var7, Client.method403(var11, var7, class192.field1881) - var12, var15 + Client.field879);
                        Client.field703.method1240(var45);
                     }

                  } else if (var0 == class413.field3165) {
                     var3 = var2.method1125();
                     var4 = (var3 >> 4 & 7) + class372.field2904;
                     var5 = (var3 & 7) + class359.field2820;
                     var6 = var2.method1147();
                     var7 = var2.method1152();
                     if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                        var34 = Client.field716[class192.field1881][var4][var5];
                        if (null != var34) {
                           for(var36 = (class443)var34.method1236(); var36 != null; var36 = (class443)var34.method1238()) {
                              if ((var7 & 32767) == var36.field3359) {
                                 var36.method2164(var6);
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
