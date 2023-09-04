import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class class197 {
   static boolean field1532 = false;
   static boolean field1538 = false;
   static class198[] field1527 = new class198[50];
   static int field1529 = 0;
   static int field1535 = 0;
   static int[] field1526 = new int[5];
   static int[] field1533;
   static int[] field1537 = new int[1000];
   static int[][] field1528 = new int[5][5000];
   static String[] field1524 = new String[1000];
   static String[] field1525;
   static ArrayList field1534 = new ArrayList();
   static Calendar field1530 = Calendar.getInstance();
   static final double field1536 = Math.log(2.0);
   static final String[] field1531 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   class197() throws Throwable {
   }

   public static void method1038(class64 var0) {
      class86.method332(var0, 500000, 475000);
   }

   static void method1023(class64 var0, class283 var1, int var2, int var3) {
      Object[] var5 = var0.field507;
      class41.field341 = 0;
      class272.field1912 = 0;
      int var6 = -1;
      int[] var7 = var1.field1956;
      int[] var8 = var1.field1957;
      int var9 = -1;
      field1529 = 0;
      field1538 = false;
      boolean var10 = false;
      int var11 = 0;
      boolean var23 = false;

      label860: {
         label861: {
            try {
               int var14;
               try {
                  var23 = true;
                  class486.field3908 = new int[var1.field1959];
                  int var12 = 0;
                  field1525 = new String[var1.field1963];
                  int var27 = 0;

                  int var15;
                  String var37;
                  for(var14 = 1; var14 < var5.length; ++var14) {
                     if (var5[var14] instanceof Integer) {
                        var15 = (Integer)var5[var14];
                        if (var15 == -2147483647) {
                           var15 = var0.field505;
                        }

                        if (var15 == -2147483646) {
                           var15 = var0.field508;
                        }

                        if (var15 == -2147483645) {
                           var15 = var0.field504 != null ? var0.field504.field2158 : -1;
                        }

                        if (var15 == -2147483644) {
                           var15 = var0.field509;
                        }

                        if (var15 == -2147483643) {
                           var15 = var0.field504 != null ? -1714711969 * var0.field504.field2277 * 1628260767 : -1;
                        }

                        if (var15 == -2147483642) {
                           var15 = var0.field510 != null ? var0.field510.field2158 : -1;
                        }

                        if (var15 == -2147483641) {
                           var15 = null != var0.field510 ? -1714711969 * var0.field510.field2277 * 1628260767 : -1;
                        }

                        if (var15 == -2147483640) {
                           var15 = var0.field506;
                        }

                        if (var15 == -2147483639) {
                           var15 = var0.field512;
                        }

                        class486.field3908[var12++] = var15;
                     } else if (var5[var14] instanceof String) {
                        var37 = (String)var5[var14];
                        if (var37.equals("event_opbase")) {
                           var37 = var0.field513;
                        }

                        field1525[var27++] = var37;
                     }
                  }

                  field1535 = var0.field514;

                  label841:
                  while(true) {
                     ++var11;
                     if (var11 > var2) {
                        throw new RuntimeException();
                     }

                     ++var6;
                     var9 = var7[var6];
                     if (var9 >= 100) {
                        boolean var36;
                        if (var1.field1957[var6] == 1) {
                           var36 = true;
                        } else {
                           var36 = false;
                        }

                        var15 = method1018(var9, var1, var36);
                        switch (var15) {
                           case 0:
                              var23 = false;
                              break label841;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                        }
                     } else if (var9 == 0) {
                        field1537[++class41.field341 - 1] = var8[var6];
                     } else if (var9 == 1) {
                        var14 = var8[var6];
                        field1537[++class41.field341 - 1] = class486.field3907[var14];
                     } else if (var9 == 2) {
                        var14 = var8[var6];
                        class486.field3907[var14] = field1537[--class41.field341];
                        Client.method891(var14);
                     } else if (var9 == 3) {
                        field1524[++class272.field1912 - 1] = var1.field1958[var6];
                     } else if (var9 == 6) {
                        var6 += var8[var6];
                     } else if (var9 == 7) {
                        class41.field341 -= 2;
                        if (field1537[class41.field341] != field1537[1 + class41.field341]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 8) {
                        class41.field341 -= 2;
                        if (field1537[class41.field341] == field1537[class41.field341 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 9) {
                        class41.field341 -= 2;
                        if (field1537[class41.field341] < field1537[class41.field341 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 10) {
                        class41.field341 -= 2;
                        if (field1537[class41.field341] > field1537[class41.field341 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 21) {
                        if (0 == field1529) {
                           var23 = false;
                           break label861;
                        }

                        class198 var35 = field1527[--field1529];
                        var1 = var35.field1540;
                        var7 = var1.field1956;
                        var8 = var1.field1957;
                        var6 = var35.field1543;
                        class486.field3908 = var35.field1541;
                        field1525 = var35.field1542;
                     } else if (var9 == 25) {
                        var14 = var8[var6];
                        field1537[++class41.field341 - 1] = class486.method2324(var14);
                     } else if (var9 == 27) {
                        var14 = var8[var6];
                        class492.method2328(var14, field1537[--class41.field341]);
                     } else if (var9 == 31) {
                        class41.field341 -= 2;
                        if (field1537[class41.field341] <= field1537[class41.field341 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 32) {
                        class41.field341 -= 2;
                        if (field1537[class41.field341] >= field1537[class41.field341 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 33) {
                        field1537[++class41.field341 - 1] = class486.field3908[var8[var6]];
                     } else if (var9 == 34) {
                        class486.field3908[var8[var6]] = field1537[--class41.field341];
                     } else if (var9 == 35) {
                        field1524[++class272.field1912 - 1] = field1525[var8[var6]];
                     } else if (var9 == 36) {
                        field1525[var8[var6]] = field1524[--class272.field1912];
                     } else if (var9 == 37) {
                        var14 = var8[var6];
                        class272.field1912 -= var14;
                        var37 = class447.method2092(field1524, class272.field1912, var14);
                        field1524[++class272.field1912 - 1] = var37;
                     } else if (var9 == 38) {
                        --class41.field341;
                     } else if (var9 == 39) {
                        --class272.field1912;
                     } else {
                        int var18;
                        if (var9 != 40) {
                           if (var9 == 42) {
                              field1537[++class41.field341 - 1] = class238.field1742.method1572(var8[var6]);
                           } else if (var9 == 43) {
                              class238.field1742.method1583(var8[var6], field1537[--class41.field341]);
                           } else if (var9 == 44) {
                              var14 = var8[var6] >> 16;
                              var15 = var8[var6] & '\uffff';
                              int var28 = field1537[--class41.field341];
                              if (var28 < 0 || var28 > 5000) {
                                 throw new RuntimeException();
                              }

                              field1526[var14] = var28;
                              byte var31 = -1;
                              if (var15 == 105) {
                                 var31 = 0;
                              }

                              for(var18 = 0; var18 < var28; ++var18) {
                                 field1528[var14][var18] = var31;
                              }
                           } else if (var9 == 45) {
                              var14 = var8[var6];
                              var15 = field1537[--class41.field341];
                              if (var15 < 0 || var15 >= field1526[var14]) {
                                 throw new RuntimeException();
                              }

                              field1537[++class41.field341 - 1] = field1528[var14][var15];
                           } else if (var9 == 46) {
                              var14 = var8[var6];
                              class41.field341 -= 2;
                              var15 = field1537[class41.field341];
                              if (var15 < 0 || var15 >= field1526[var14]) {
                                 throw new RuntimeException();
                              }

                              field1528[var14][var15] = field1537[1 + class41.field341];
                           } else {
                              String var29;
                              if (var9 == 47) {
                                 var29 = class238.field1742.method1574(var8[var6]);
                                 if (var29 == null) {
                                    var29 = class424.field3311;
                                 }

                                 field1524[++class272.field1912 - 1] = var29;
                              } else if (var9 == 48) {
                                 class238.field1742.method1579(var8[var6], field1524[--class272.field1912]);
                              } else if (var9 == 49) {
                                 var29 = class238.field1742.method1573(var8[var6]);
                                 field1524[++class272.field1912 - 1] = var29;
                              } else if (var9 == 50) {
                                 class238.field1742.method1580(var8[var6], field1524[--class272.field1912]);
                              } else if (var9 == 60) {
                                 class524 var32 = var1.field1964[var8[var6]];
                                 class323 var40 = (class323)var32.method2509((long)field1537[--class41.field341]);
                                 if (var40 != null) {
                                    var6 += var40.field2304;
                                 }
                              } else {
                                 Integer var33;
                                 if (var9 == 74) {
                                    var33 = class56.field458.method58(var8[var6]);
                                    if (var33 == null) {
                                       field1537[++class41.field341 - 1] = -1;
                                    } else {
                                       field1537[++class41.field341 - 1] = var33;
                                    }
                                 } else {
                                    if (var9 != 76) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = class84.field571.method286(var8[var6]);
                                    if (var33 == null) {
                                       field1537[++class41.field341 - 1] = -1;
                                    } else {
                                       field1537[++class41.field341 - 1] = var33;
                                    }
                                 }
                              }
                           }
                        } else {
                           var14 = var8[var6];
                           class283 var39 = class283.method1300(var14);
                           int[] var16 = new int[var39.field1959];
                           String[] var17 = new String[var39.field1963];

                           for(var18 = 0; var18 < var39.field1961; ++var18) {
                              var16[var18] = field1537[class41.field341 - var39.field1961 + var18];
                           }

                           for(var18 = 0; var18 < var39.field1962; ++var18) {
                              var17[var18] = field1524[class272.field1912 - var39.field1962 + var18];
                           }

                           class41.field341 -= var39.field1961;
                           class272.field1912 -= var39.field1962;
                           class198 var34 = new class198();
                           var34.field1540 = var1;
                           var34.field1543 = var6;
                           var34.field1541 = class486.field3908;
                           var34.field1542 = field1525;
                           field1527[++field1529 - 1] = var34;
                           var1 = var39;
                           var7 = var39.field1956;
                           var8 = var39.field1957;
                           var6 = -1;
                           class486.field3908 = var16;
                           field1525 = var17;
                        }
                     }
                  }
               } catch (Exception var24) {
                  var10 = true;
                  StringBuilder var13 = new StringBuilder(30);
                  var13.append("").append(var1.field531).append(" ");

                  for(var14 = field1529 - 1; var14 >= 0; --var14) {
                     var13.append("").append(field1527[var14].field1540.field531).append(" ");
                  }

                  var13.append("").append(var9);
                  class431.method2006(var13.toString(), var24);
                  var23 = false;
                  break label860;
               }
            } finally {
               if (var23) {
                  while(field1534.size() > 0) {
                     class194 var20 = (class194)field1534.remove(0);
                     Client.method798(var20.method994(), var20.method995(), var20.method993(), var20.method992(), "");
                  }

                  if (field1538) {
                     field1538 = false;
                     Client.method886();
                  }

                  if (!var10 && var3 > 0 && var11 >= var3) {
                     class431.method2006("Warning: Script " + var1.field1960 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
                  }

               }
            }

            while(field1534.size() > 0) {
               class194 var30 = (class194)field1534.remove(0);
               Client.method798(var30.method994(), var30.method995(), var30.method993(), var30.method992(), "");
            }

            if (field1538) {
               field1538 = false;
               Client.method886();
            }

            if (!var10 && var3 > 0 && var11 >= var3) {
               class431.method2006("Warning: Script " + var1.field1960 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
            }

            return;
         }

         while(field1534.size() > 0) {
            class194 var38 = (class194)field1534.remove(0);
            Client.method798(var38.method994(), var38.method995(), var38.method993(), var38.method992(), "");
         }

         if (field1538) {
            field1538 = false;
            Client.method886();
         }

         if (!var10 && var3 > 0 && var11 >= var3) {
            class431.method2006("Warning: Script " + var1.field1960 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
         }

         return;
      }

      while(field1534.size() > 0) {
         class194 var26 = (class194)field1534.remove(0);
         Client.method798(var26.method994(), var26.method995(), var26.method993(), var26.method992(), "");
      }

      if (field1538) {
         field1538 = false;
         Client.method886();
      }

      if (!var10 && var3 > 0 && var11 >= var3) {
         class431.method2006("Warning: Script " + var1.field1960 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
      }

   }

   static int method1018(int var0, class283 var1, boolean var2) {
      if (var0 < 1000) {
         return method1034(var0, var1, var2);
      } else if (var0 < 1100) {
         return method1006(var0, var1, var2);
      } else if (var0 < 1200) {
         return method1016(var0, var1, var2);
      } else if (var0 < 1300) {
         return method1015(var0, var1, var2);
      } else if (var0 < 1400) {
         return method1001(var0, var1, var2);
      } else if (var0 < 1500) {
         return method1026(var0, var1, var2);
      } else if (var0 < 1600) {
         return method1022(var0, var1, var2);
      } else if (var0 < 1700) {
         return method1036(var0, var1, var2);
      } else if (var0 < 1800) {
         return class359.method1618(var0, var1, var2);
      } else if (var0 < 1900) {
         return method1007(var0, var1, var2);
      } else if (var0 < 2000) {
         return method1050(var0, var1, var2);
      } else if (var0 < 2100) {
         return method1006(var0, var1, var2);
      } else if (var0 < 2200) {
         return method1016(var0, var1, var2);
      } else if (var0 < 2300) {
         return method1015(var0, var1, var2);
      } else if (var0 < 2400) {
         return method1001(var0, var1, var2);
      } else if (var0 < 2500) {
         return method1026(var0, var1, var2);
      } else if (var0 < 2600) {
         return method1010(var0, var1, var2);
      } else if (var0 < 2700) {
         return method1044(var0, var1, var2);
      } else if (var0 < 2800) {
         return method1040(var0, var1, var2);
      } else if (var0 < 2900) {
         return method1012(var0, var1, var2);
      } else if (var0 < 3000) {
         return method1050(var0, var1, var2);
      } else if (var0 < 3200) {
         return method1047(var0, var1, var2);
      } else if (var0 < 3300) {
         return method1037(var0, var1, var2);
      } else if (var0 < 3400) {
         return class1.method1(var0, var1, var2, (byte)-1);
      } else if (var0 < 3500) {
         return method1046(var0, var1, var2);
      } else if (var0 < 3600) {
         return method1033(var0, var1, var2);
      } else if (var0 < 3700) {
         return method1000(var0, var1, var2);
      } else if (var0 < 3800) {
         return method1003(var0, var1, var2);
      } else if (var0 < 3900) {
         return method1005(var0, var1, var2);
      } else if (var0 < 4000) {
         return method1041(var0, var1, var2);
      } else if (var0 < 4100) {
         return method1042(var0, var1, var2);
      } else if (var0 < 4200) {
         return method1009(var0, var1, var2);
      } else if (var0 < 4300) {
         return method1011(var0, var1, var2);
      } else if (var0 < 5100) {
         return method1043(var0, var1, var2);
      } else if (var0 < 5400) {
         return method1027(var0, var1, var2);
      } else if (var0 < 5600) {
         return method1048(var0, var1, var2);
      } else if (var0 < 5700) {
         return method998(var0, var1, var2);
      } else if (var0 < 6300) {
         return class3.method6(var0, var1, var2);
      } else if (var0 < 6600) {
         return method1021(var0, var1, var2);
      } else if (var0 < 6700) {
         return method999(var0, var1, var2);
      } else if (var0 < 6800) {
         return method1014(var0, var1, var2);
      } else if (var0 < 6900) {
         return method1029(var0, var1, var2);
      } else if (var0 < 7000) {
         return method1008(var0, var1, var2);
      } else if (var0 < 7100) {
         return method1002(var0, var1, var2);
      } else if (var0 < 7200) {
         return method1017(var0, var1, var2);
      } else if (var0 < 7300) {
         return method1024(var0, var1, var2);
      } else if (var0 < 7500) {
         return class127.method479(var0, var1, var2);
      } else if (var0 < 7600) {
         return method1004(var0, var1, var2);
      } else if (var0 < 7700) {
         return method1025(var0, var1, var2);
      } else {
         return var0 < 8100 ? method1030(var0, var1, var2) : 2;
      }
   }

   static int method1034(int var0, class283 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         class41.field341 -= 3;
         var4 = field1537[class41.field341];
         var5 = field1537[class41.field341 + 1];
         int var12 = field1537[2 + class41.field341];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            class322 var7 = class322.method1488(var4);
            if (null == var7.field2290) {
               var7.field2290 = new class322[var12 + 1];
            }

            if (var7.field2290.length <= var12) {
               class322[] var8 = new class322[var12 + 1];

               for(int var9 = 0; var9 < var7.field2290.length; ++var9) {
                  var8[var9] = var7.field2290[var9];
               }

               var7.field2290 = var8;
            }

            if (var12 > 0 && var7.field2290[var12 - 1] == null) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               class322 var13 = new class322();
               var13.field2160 = var5;
               var13.field2175 = var13.field2158 = var7.field2158;
               var13.field2277 = var12;
               var13.field2238 = true;
               if (var5 == 12) {
                  var13.method1468();
                  var13.method1483().method699(new class440(var13));
                  var13.method1483().method698(new class529(var13));
               }

               var7.field2290[var12] = var13;
               if (var2) {
                  class276.field1942 = var13;
               } else {
                  class48.field419 = var13;
               }

               Client.method869(var7);
               return 1;
            }
         }
      } else {
         class322 var10;
         if (var0 == 101) {
            var10 = var2 ? class276.field1942 : class48.field419;
            class322 var11 = class322.method1488(var10.field2158);
            var11.field2290[var10.field2277] = null;
            Client.method869(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class322.method1488(field1537[--class41.field341]);
            var10.field2290 = null;
            Client.method869(var10);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var10 = class322.method1488(field1537[--class41.field341]);
               if (null != var10) {
                  field1537[++class41.field341 - 1] = 1;
                  if (var2) {
                     class276.field1942 = var10;
                  } else {
                     class48.field419 = var10;
                  }
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class41.field341 -= 2;
            var4 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            class322 var6 = class322.method1485(var4, var5);
            if (null != var6 && var5 != -1) {
               field1537[++class41.field341 - 1] = 1;
               if (var2) {
                  class276.field1942 = var6;
               } else {
                  class48.field419 = var6;
               }
            } else {
               field1537[++class41.field341 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method1006(int var0, class283 var1, boolean var2) {
      int var4 = -1;
      class322 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = field1537[--class41.field341];
         var5 = class322.method1488(var4);
      } else {
         var5 = var2 ? class276.field1942 : class48.field419;
      }

      if (var0 == 1000) {
         class41.field341 -= 4;
         var5.field2167 = field1537[class41.field341];
         var5.field2168 = field1537[1 + class41.field341];
         var5.field2163 = field1537[2 + class41.field341];
         var5.field2164 = field1537[3 + class41.field341];
         Client.method869(var5);
         class530.field4182.method760(var5);
         if (var4 != -1 && var5.field2160 == 0) {
            Client.method808(class53.field436[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1001) {
         class41.field341 -= 4;
         var5.field2169 = field1537[class41.field341];
         var5.field2170 = field1537[class41.field341 + 1];
         var5.field2165 = field1537[2 + class41.field341];
         var5.field2166 = field1537[class41.field341 + 3];
         Client.method869(var5);
         class530.field4182.method760(var5);
         if (var4 != -1 && var5.field2160 == 0) {
            Client.method808(class53.field436[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = field1537[--class41.field341] == 1;
         if (var5.field2176 != var6) {
            var5.field2176 = var6;
            Client.method869(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.field2300 = field1537[--class41.field341] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.field2301 = field1537[--class41.field341] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1016(int var0, class283 var1, boolean var2) {
      int var5 = -1;
      class322 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = field1537[--class41.field341];
         var4 = class322.method1488(var5);
      } else {
         var4 = var2 ? class276.field1942 : class48.field419;
      }

      int var14;
      if (var0 == 1100) {
         class41.field341 -= 2;
         var14 = field1537[class41.field341];
         int var11 = field1537[1 + class41.field341];
         if (var4.field2160 == 12) {
            class173 var8 = var4.method1483();
            if (null != var8 && var8.method672(var14, var11)) {
               Client.method869(var4);
            }
         } else {
            var4.field2177 = var14;
            if (var4.field2177 > var4.field2245 - var4.field2173) {
               var4.field2177 = var4.field2245 - var4.field2173;
            }

            if (var4.field2177 < 0) {
               var4.field2177 = 0;
            }

            var4.field2191 = var11;
            if (var4.field2191 > var4.field2180 - var4.field2150) {
               var4.field2191 = var4.field2180 - var4.field2150;
            }

            if (var4.field2191 < 0) {
               var4.field2191 = 0;
            }

            Client.method869(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.field2181 = field1537[--class41.field341];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1102) {
         var4.field2220 = field1537[--class41.field341] == 1;
         Client.method869(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field2179 = field1537[--class41.field341];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.field2189 = field1537[--class41.field341];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1105) {
         var4.field2244 = field1537[--class41.field341];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1106) {
         var4.field2194 = field1537[--class41.field341];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1107) {
         var4.field2195 = field1537[--class41.field341] == 1;
         Client.method869(var4);
         return 1;
      } else if (var0 == 1108) {
         var4.field2200 = 1;
         var4.field2201 = field1537[--class41.field341];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1109) {
         class41.field341 -= 6;
         var4.field2206 = field1537[class41.field341];
         var4.field2280 = field1537[class41.field341 + 1];
         var4.field2208 = field1537[class41.field341 + 2];
         var4.field2226 = field1537[class41.field341 + 3];
         var4.field2273 = field1537[4 + class41.field341];
         var4.field2211 = field1537[class41.field341 + 5];
         Client.method869(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = field1537[--class41.field341];
         if (var14 != var4.field2204) {
            var4.field2204 = var14;
            var4.field2288 = 0;
            var4.field2289 = 0;
            Client.method869(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.field2231 = field1537[--class41.field341] == 1;
         Client.method869(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = field1524[--class272.field1912];
         if (!var15.equals(var4.field2218)) {
            var4.field2218 = var15;
            Client.method869(var4);
         }

         return 1;
      } else {
         class173 var9;
         if (var0 == 1113) {
            var4.field2263 = field1537[--class41.field341];
            if (var4.field2160 == 12) {
               var9 = var4.method1483();
               if (var9 != null) {
                  var9.method676();
               }
            }

            Client.method869(var4);
            return 1;
         } else if (var0 == 1114) {
            class41.field341 -= 3;
            if (var4.field2160 == 12) {
               var9 = var4.method1483();
               if (null != var9) {
                  var9.method729(field1537[class41.field341], field1537[1 + class41.field341]);
                  var9.method673(field1537[2 + class41.field341]);
               }
            } else {
               var4.field2221 = field1537[class41.field341];
               var4.field2279 = field1537[class41.field341 + 1];
               var4.field2254 = field1537[2 + class41.field341];
            }

            Client.method869(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field2148 = field1537[--class41.field341] == 1;
            Client.method869(var4);
            return 1;
         } else if (var0 == 1116) {
            var4.field2196 = field1537[--class41.field341];
            Client.method869(var4);
            return 1;
         } else if (var0 == 1117) {
            var4.field2197 = field1537[--class41.field341];
            Client.method869(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field2198 = field1537[--class41.field341] == 1;
            Client.method869(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.field2199 = field1537[--class41.field341] == 1;
            Client.method869(var4);
            return 1;
         } else if (var0 == 1120) {
            class41.field341 -= 2;
            var4.field2245 = field1537[class41.field341];
            var4.field2180 = field1537[1 + class41.field341];
            Client.method869(var4);
            if (var5 != -1 && 0 == var4.field2160) {
               Client.method808(class53.field436[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            Client.method935(var4.field2158, var4.field2277);
            Client.field1293 = var4;
            Client.method869(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field2192 = field1537[--class41.field341];
            Client.method869(var4);
            return 1;
         } else if (var0 == 1123) {
            var4.field2182 = field1537[--class41.field341];
            Client.method869(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field2188 = field1537[--class41.field341];
            Client.method869(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = field1537[--class41.field341];
            class448 var10 = (class448)class1.method2(class448.method2094(), var14);
            if (null != var10) {
               var4.field2186 = var10;
               Client.method869(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = field1537[--class41.field341] == 1;
               var4.field2190 = var12;
               return 1;
            } else if (var0 == 1127) {
               var12 = field1537[--class41.field341] == 1;
               var4.field2216 = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.field2193 = field1524[--class272.field1912];
               Client.method869(var4);
               return 1;
            } else if (var0 == 1130) {
               var4.method1481(field1524[--class272.field1912], class234.field1727, Client.method831());
               return 1;
            } else if (var0 == 1131) {
               class41.field341 -= 2;
               var4.method1477(field1537[class41.field341], field1537[1 + class41.field341]);
               return 1;
            } else if (var0 == 1132) {
               var4.method1460(field1524[--class272.field1912], field1537[--class41.field341]);
               return 1;
            } else {
               class326 var13;
               if (var0 == 1133) {
                  --class41.field341;
                  var13 = var4.method1469();
                  if (var13 != null) {
                     var13.field2434 = field1537[class41.field341];
                     Client.method869(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class41.field341;
                  var13 = var4.method1469();
                  if (var13 != null) {
                     var13.field2435 = field1537[class41.field341];
                     Client.method869(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class272.field1912;
                  var9 = var4.method1483();
                  if (null != var9) {
                     var4.field2146 = field1524[class272.field1912];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class41.field341;
                  var13 = var4.method1469();
                  if (null != var13) {
                     var13.field2436 = field1537[class41.field341];
                     Client.method869(var4);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class41.field341;
                  var9 = var4.method1483();
                  if (var9 != null && var9.method669(field1537[class41.field341])) {
                     Client.method869(var4);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class41.field341;
                  var9 = var4.method1483();
                  if (null != var9 && var9.method670(field1537[class41.field341])) {
                     Client.method869(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class41.field341;
                  var9 = var4.method1483();
                  if (null != var9 && var9.method737(field1537[class41.field341])) {
                     Client.method869(var4);
                  }

                  return 1;
               } else {
                  class173 var7;
                  if (var0 == 1140) {
                     var12 = field1537[--class41.field341] == 1;
                     Client.field1355.method1825();
                     var7 = var4.method1483();
                     if (null != var7 && var7.method664(var12)) {
                        if (var12) {
                           Client.field1355.method1826(var4);
                        }

                        Client.method869(var4);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var12 = field1537[--class41.field341] == 1;
                     if (!var12 && Client.field1355.method1823() == var4) {
                        Client.field1355.method1825();
                        Client.method869(var4);
                     }

                     var7 = var4.method1483();
                     if (var7 != null) {
                        var7.method694(var12);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class41.field341 -= 2;
                     var9 = var4.method1483();
                     if (var9 != null && var9.method683(field1537[class41.field341], field1537[class41.field341 + 1])) {
                        Client.method869(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class41.field341;
                     var9 = var4.method1483();
                     if (null != var9 && var9.method683(field1537[class41.field341], field1537[class41.field341])) {
                        Client.method869(var4);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class41.field341;
                     var9 = var4.method1483();
                     if (var9 != null) {
                        var9.method743(field1537[class41.field341]);
                        Client.method869(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class41.field341;
                     var9 = var4.method1483();
                     if (var9 != null) {
                        var9.method674(field1537[class41.field341]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class41.field341;
                     var9 = var4.method1483();
                     if (null != var9) {
                        var9.method724(field1537[class41.field341]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class41.field341;
                     var9 = var4.method1483();
                     if (null != var9) {
                        var9.method742(field1537[class41.field341]);
                        Client.method869(var4);
                     }

                     return 1;
                  } else {
                     class166 var6;
                     if (var0 == 1148) {
                        class41.field341 -= 2;
                        var6 = var4.method1459();
                        if (null != var6) {
                           var6.method638(field1537[class41.field341], field1537[class41.field341 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class41.field341 -= 2;
                        var6 = var4.method1459();
                        if (var6 != null) {
                           var6.method641((char)field1537[class41.field341], field1537[class41.field341 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var4.method1479(field1524[--class272.field1912], class234.field1727);
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }

   static int method1015(int var0, class283 var1, boolean var2) {
      class322 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class322.method1488(field1537[--class41.field341]);
      } else {
         var4 = var2 ? class276.field1942 : class48.field419;
      }

      Client.method869(var4);
      int var5;
      int var6;
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field2200 = 2;
            var4.field2201 = field1537[--class41.field341];
            return 1;
         } else if (var0 == 1202) {
            var4.field2200 = 3;
            var4.field2201 = class266.field1874.field3494.method1078();
            return 1;
         } else if (var0 == 1207) {
            boolean var8 = field1537[--class41.field341] == 1;
            class398.method1818(var4, class266.field1874.field3494, var8);
            return 1;
         } else if (var0 == 1208) {
            var5 = field1537[--class41.field341];
            if (var4.field2214 == null) {
               throw new RuntimeException("");
            } else {
               class322.method1484(var4, var5);
               return 1;
            }
         } else if (var0 == 1209) {
            class41.field341 -= 2;
            var5 = field1537[class41.field341];
            var6 = field1537[class41.field341 + 1];
            if (null == var4.field2214) {
               throw new RuntimeException("");
            } else {
               class322.method1487(var4, var5, var6);
               return 1;
            }
         } else if (var0 == 1210) {
            var5 = field1537[--class41.field341];
            if (var4.field2214 == null) {
               throw new RuntimeException("");
            } else {
               class322.method1489(var4, class266.field1874.field3494.field1583, var5);
               return 1;
            }
         } else {
            return 2;
         }
      } else {
         class41.field341 -= 2;
         var5 = field1537[class41.field341];
         var6 = field1537[class41.field341 + 1];
         var4.field2286 = var5;
         var4.field2287 = var6;
         class47 var7 = class47.method213(var5);
         var4.field2208 = var7.field356;
         var4.field2226 = var7.field372;
         var4.field2273 = var7.field358;
         var4.field2206 = var7.field357;
         var4.field2280 = var7.field374;
         var4.field2211 = var7.field379;
         if (var0 == 1205) {
            var4.field2217 = 0;
         } else if (var0 == 1212 | var7.field375 == 1) {
            var4.field2217 = 1;
         } else {
            var4.field2217 = 2;
         }

         if (var4.field2212 > 0) {
            var4.field2211 = var4.field2211 * 32 / var4.field2212;
         } else if (var4.field2169 > 0) {
            var4.field2211 = var4.field2211 * 32 / var4.field2169;
         }

         return 1;
      }
   }

   static int method1001(int var0, class283 var1, boolean var2) {
      boolean var4 = true;
      class322 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class322.method1488(field1537[--class41.field341]);
         var4 = false;
      } else {
         var5 = var2 ? class276.field1942 : class48.field419;
      }

      int var9;
      if (var0 == 1300) {
         var9 = field1537[--class41.field341] - 1;
         if (var9 >= 0 && var9 <= 9) {
            var5.method1456(var9, field1524[--class272.field1912]);
            return 1;
         } else {
            --class272.field1912;
            return 1;
         }
      } else {
         int var11;
         if (var0 == 1301) {
            class41.field341 -= 2;
            var9 = field1537[class41.field341];
            var11 = field1537[class41.field341 + 1];
            var5.field2257 = class322.method1485(var9, var11);
            return 1;
         } else if (var0 == 1302) {
            var5.field2239 = field1537[--class41.field341] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.field2171 = field1537[--class41.field341];
            return 1;
         } else if (var0 == 1304) {
            var5.field2213 = field1537[--class41.field341];
            return 1;
         } else if (var0 == 1305) {
            var5.field2162 = field1524[--class272.field1912];
            return 1;
         } else if (var0 == 1306) {
            var5.field2240 = field1524[--class272.field1912];
            return 1;
         } else if (var0 == 1307) {
            var5.field2236 = null;
            return 1;
         } else if (var0 == 1308) {
            var5.field2302 = field1537[--class41.field341] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class41.field341;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (var0 != 1350) {
               byte var10;
               if (var0 == 1351) {
                  class41.field341 -= 2;
                  var10 = 10;
                  var7 = new byte[]{(byte)field1537[class41.field341]};
                  byte[] var12 = new byte[]{(byte)field1537[1 + class41.field341]};
                  method1049(var5, var10, var7, var12);
                  return 1;
               } else if (var0 == 1352) {
                  class41.field341 -= 3;
                  var9 = field1537[class41.field341] - 1;
                  var11 = field1537[class41.field341 + 1];
                  var8 = field1537[2 + class41.field341];
                  if (var9 >= 0 && var9 <= 9) {
                     method1019(var5, var9, var11, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var10 = 10;
                  var11 = field1537[--class41.field341];
                  var8 = field1537[--class41.field341];
                  method1019(var5, var10, var11, var8);
                  return 1;
               } else if (var0 == 1354) {
                  --class41.field341;
                  var9 = field1537[class41.field341] - 1;
                  if (var9 >= 0 && var9 <= 9) {
                     method1013(var5, var9);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var9 = 10;
                  method1013(var5, var9);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  class41.field341 -= 10;

                  for(var8 = 0; var8 < 10 && field1537[class41.field341 + var8] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)field1537[class41.field341 + var8];
                        var7[var8 / 2] = (byte)field1537[1 + class41.field341 + var8];
                     }
                  }
               } else {
                  class41.field341 -= 2;
                  var6 = new byte[]{(byte)field1537[class41.field341]};
                  var7 = new byte[]{(byte)field1537[1 + class41.field341]};
               }

               var8 = field1537[--class41.field341] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  method1049(var5, var8, var6, var7);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   static final void method1049(class322 var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field2207 == null) {
         if (var2 == null) {
            return;
         }

         var0.field2207 = new byte[11][];
         var0.field2303 = new byte[11][];
         var0.field2233 = new int[11];
         var0.field2234 = new int[11];
      }

      var0.field2207[var1] = var2;
      if (null != var2) {
         var0.field2230 = true;
      } else {
         var0.field2230 = false;

         for(int var5 = 0; var5 < var0.field2207.length; ++var5) {
            if (var0.field2207[var5] != null) {
               var0.field2230 = true;
               break;
            }
         }
      }

      var0.field2303[var1] = var3;
   }

   static final void method1019(class322 var0, int var1, int var2, int var3) {
      if (null == var0.field2233) {
         throw new RuntimeException();
      } else {
         var0.field2233[var1] = var2;
         var0.field2234[var1] = var3;
      }
   }

   static final void method1013(class322 var0, int var1) {
      if (null == var0.field2207) {
         throw new RuntimeException();
      } else {
         if (null == var0.field2299) {
            var0.field2299 = new int[var0.field2207.length];
         }

         var0.field2299[var1] = Integer.MAX_VALUE;
      }
   }

   static int method1026(int var0, class283 var1, boolean var2) {
      class322 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class322.method1488(field1537[--class41.field341]);
      } else {
         var4 = var2 ? class276.field1942 : class48.field419;
      }

      String var5 = field1524[--class272.field1912];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = field1537[--class41.field341];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = field1537[--class41.field341]) {
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var10 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var10.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var10[var8] = field1524[--class272.field1912];
         } else {
            var10[var8] = new Integer(field1537[--class41.field341]);
         }
      }

      var8 = field1537[--class41.field341];
      if (var8 != -1) {
         var10[0] = new Integer(var8);
      } else {
         var10 = null;
      }

      if (var0 == 1400) {
         var4.field2210 = var10;
      } else if (var0 == 1401) {
         var4.field2246 = var10;
      } else if (var0 == 1402) {
         var4.field2243 = var10;
      } else if (var0 == 1403) {
         var4.field2247 = var10;
      } else if (var0 == 1404) {
         var4.field2219 = var10;
      } else if (var0 == 1405) {
         var4.field2250 = var10;
      } else if (var0 == 1406) {
         var4.field2253 = var10;
      } else if (var0 == 1407) {
         var4.field2225 = var10;
         var4.field2255 = var6;
      } else if (var0 == 1408) {
         var4.field2151 = var10;
      } else if (var0 == 1409) {
         var4.field2261 = var10;
      } else if (var0 == 1410) {
         var4.field2251 = var10;
      } else if (var0 == 1411) {
         var4.field2156 = var10;
      } else if (var0 == 1412) {
         var4.field2248 = var10;
      } else if (var0 == 1414) {
         var4.field2256 = var10;
         var4.field2187 = var6;
      } else if (var0 == 1415) {
         var4.field2258 = var10;
         var4.field2259 = var6;
      } else if (var0 == 1416) {
         var4.field2252 = var10;
      } else if (var0 == 1417) {
         var4.field2183 = var10;
      } else if (var0 == 1418) {
         var4.field2149 = var10;
      } else if (var0 == 1419) {
         var4.field2265 = var10;
      } else if (var0 == 1420) {
         var4.field2215 = var10;
      } else if (var0 == 1421) {
         var4.field2269 = var10;
      } else if (var0 == 1422) {
         var4.field2272 = var10;
      } else if (var0 == 1423) {
         var4.field2205 = var10;
      } else if (var0 == 1424) {
         var4.field2237 = var10;
      } else if (var0 == 1425) {
         var4.field2276 = var10;
      } else if (var0 == 1426) {
         var4.field2291 = var10;
      } else if (var0 == 1427) {
         var4.field2152 = var10;
      } else if (var0 == 1428) {
         var4.field2270 = var10;
      } else if (var0 == 1429) {
         var4.field2271 = var10;
      } else if (var0 == 1430) {
         var4.field2275 = var10;
      } else if (var0 == 1431) {
         var4.field2232 = var10;
      } else if (var0 == 1434) {
         var4.field2223 = var10;
      } else if (var0 == 1435) {
         var4.field2262 = var10;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class200 var9 = var4.method1470();
         if (var9 != null) {
            if (var0 == 1436) {
               var9.field1553 = var10;
            } else if (var0 == 1437) {
               var9.field1554 = var10;
            } else if (var0 == 1438) {
               var9.field1549 = var10;
            } else if (var0 == 1439) {
               var9.field1551 = var10;
            }
         }
      }

      var4.field2241 = true;
      return 1;
   }

   static int method1022(int var0, class283 var1, boolean var2) {
      class322 var4 = var2 ? class276.field1942 : class48.field419;
      if (var0 == 1500) {
         field1537[++class41.field341 - 1] = var4.field2159;
         return 1;
      } else if (var0 == 1501) {
         field1537[++class41.field341 - 1] = var4.field2172;
         return 1;
      } else if (var0 == 1502) {
         field1537[++class41.field341 - 1] = var4.field2173;
         return 1;
      } else if (var0 == 1503) {
         field1537[++class41.field341 - 1] = var4.field2150;
         return 1;
      } else if (var0 == 1504) {
         field1537[++class41.field341 - 1] = var4.field2176 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         field1537[++class41.field341 - 1] = var4.field2175;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1036(int var0, class283 var1, boolean var2) {
      class322 var4 = var2 ? class276.field1942 : class48.field419;
      if (var0 == 1600) {
         field1537[++class41.field341 - 1] = var4.field2177;
         return 1;
      } else if (var0 == 1601) {
         field1537[++class41.field341 - 1] = var4.field2191;
         return 1;
      } else {
         class173 var8;
         if (var0 == 1602) {
            if (var4.field2160 == 12) {
               var8 = var4.method1483();
               if (null != var8) {
                  field1524[++class272.field1912 - 1] = var8.method726().method2350();
                  return 1;
               }
            }

            field1524[++class272.field1912 - 1] = var4.field2218;
            return 1;
         } else if (var0 == 1603) {
            field1537[++class41.field341 - 1] = var4.field2245;
            return 1;
         } else if (var0 == 1604) {
            field1537[++class41.field341 - 1] = var4.field2180;
            return 1;
         } else if (var0 == 1605) {
            field1537[++class41.field341 - 1] = var4.field2211;
            return 1;
         } else if (var0 == 1606) {
            field1537[++class41.field341 - 1] = var4.field2208;
            return 1;
         } else if (var0 == 1607) {
            field1537[++class41.field341 - 1] = var4.field2273;
            return 1;
         } else if (var0 == 1608) {
            field1537[++class41.field341 - 1] = var4.field2226;
            return 1;
         } else if (var0 == 1609) {
            field1537[++class41.field341 - 1] = var4.field2179;
            return 1;
         } else if (var0 == 1610) {
            field1537[++class41.field341 - 1] = var4.field2188;
            return 1;
         } else if (var0 == 1611) {
            field1537[++class41.field341 - 1] = var4.field2181;
            return 1;
         } else if (var0 == 1612) {
            field1537[++class41.field341 - 1] = var4.field2182;
            return 1;
         } else if (var0 == 1613) {
            field1537[++class41.field341 - 1] = var4.field2186.method180();
            return 1;
         } else if (var0 == 1614) {
            field1537[++class41.field341 - 1] = var4.field2216 ? 1 : 0;
            return 1;
         } else {
            class326 var5;
            if (var0 == 1617) {
               var5 = var4.method1469();
               field1537[++class41.field341 - 1] = null != var5 ? var5.field2434 : 0;
            }

            if (var0 == 1618) {
               var5 = var4.method1469();
               field1537[++class41.field341 - 1] = var5 != null ? var5.field2435 : 0;
               return 1;
            } else if (var0 == 1619) {
               var8 = var4.method1483();
               field1524[++class272.field1912 - 1] = var8 != null ? var8.method700().method2350() : "";
               return 1;
            } else if (var0 == 1620) {
               var5 = var4.method1469();
               field1537[++class41.field341 - 1] = null != var5 ? var5.field2436 : 0;
               return 1;
            } else if (var0 == 1621) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = null != var8 ? var8.method738() : 0;
               return 1;
            } else if (var0 == 1622) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = var8 != null ? var8.method734() : 0;
               return 1;
            } else if (var0 == 1623) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = var8 != null ? var8.method740() : 0;
               return 1;
            } else if (var0 == 1624) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = var8 != null && var8.method702() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var8 = var4.method1483();
                  field1524[++class272.field1912 - 1] = var8 != null ? var8.method675().method256() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var8 = var4.method1483();
                  int var6 = var8 != null ? var8.method705() : 0;
                  int var7 = null != var8 ? var8.method704() : 0;
                  field1537[++class41.field341 - 1] = Math.min(var6, var7);
                  field1537[++class41.field341 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 1628) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method704() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method677() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = null != var8 ? var8.method709() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method728() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method671() : 0;
                  return 1;
               } else {
                  class166 var9;
                  if (var0 == 1633) {
                     var9 = var4.method1459();
                     field1537[class41.field341 - 1] = var9 != null ? var9.method635(field1537[class41.field341 - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var9 = var4.method1459();
                     field1537[class41.field341 - 1] = null != var9 ? var9.method639((char)field1537[class41.field341 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = null != var8 && var8.method703() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static int method1035(class322 var0) {
      if (11 != var0.field2160) {
         --class272.field1912;
         field1537[++class41.field341 - 1] = -1;
         return 1;
      } else {
         String var2 = field1524[--class272.field1912];
         field1537[++class41.field341 - 1] = var0.method1462(var2);
         return 1;
      }
   }

   static int method1045(class322 var0) {
      if (11 != var0.field2160) {
         field1524[class272.field1912 - 1] = "";
         return 1;
      } else {
         String var2 = field1524[--class272.field1912];
         field1524[++class272.field1912 - 1] = var0.method1463(var2);
         return 1;
      }
   }

   static int method1007(int var0, class283 var1, boolean var2) {
      class322 var4 = var2 ? class276.field1942 : class48.field419;
      if (var0 == 1800) {
         field1537[++class41.field341 - 1] = class125.method474(Client.method865(var4));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var4.field2162 == null) {
               field1524[++class272.field1912 - 1] = "";
            } else {
               field1524[++class272.field1912 - 1] = var4.field2162;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = field1537[--class41.field341];
         --var5;
         if (null != var4.field2236 && var5 < var4.field2236.length && null != var4.field2236[var5]) {
            field1524[++class272.field1912 - 1] = var4.field2236[var5];
         } else {
            field1524[++class272.field1912 - 1] = "";
         }

         return 1;
      }
   }

   static int method1050(int var0, class283 var1, boolean var2) {
      class322 var4;
      if (var0 != 1927 && var0 != 2927) {
         int var9;
         if (var0 == 1928) {
            var4 = var2 ? class276.field1942 : class48.field419;
            var9 = field1537[--class41.field341];
            if (var9 >= 1 && var9 <= 10) {
               class194 var10 = new class194(var9, var4.field2158, var4.field2277, var4.field2286);
               field1534.add(var10);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            class41.field341 -= 3;
            int var8 = field1537[class41.field341];
            var9 = field1537[class41.field341 + 1];
            int var6 = field1537[2 + class41.field341];
            if (var6 >= 1 && var6 <= 10) {
               class194 var7 = new class194(var6, var8, var9, class322.method1488(var8).field2286);
               field1534.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (field1535 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class322.method1488(field1537[--class41.field341]);
         } else {
            var4 = var2 ? class276.field1942 : class48.field419;
         }

         if (null == var4.field2152) {
            return 0;
         } else {
            class64 var5 = new class64();
            var5.field504 = var4;
            var5.field507 = var4.field2152;
            var5.field514 = 1 + field1535;
            Client.field1331.method1995(var5);
            return 1;
         }
      }
   }

   static int method1010(int var0, class283 var1, boolean var2) {
      class322 var4 = class322.method1488(field1537[--class41.field341]);
      if (var0 == 2500) {
         field1537[++class41.field341 - 1] = var4.field2159;
         return 1;
      } else if (var0 == 2501) {
         field1537[++class41.field341 - 1] = var4.field2172;
         return 1;
      } else if (var0 == 2502) {
         field1537[++class41.field341 - 1] = var4.field2173;
         return 1;
      } else if (var0 == 2503) {
         field1537[++class41.field341 - 1] = var4.field2150;
         return 1;
      } else if (var0 == 2504) {
         field1537[++class41.field341 - 1] = var4.field2176 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         field1537[++class41.field341 - 1] = var4.field2175;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1044(int var0, class283 var1, boolean var2) {
      class322 var4 = class322.method1488(field1537[--class41.field341]);
      if (var0 == 2600) {
         field1537[++class41.field341 - 1] = var4.field2177;
         return 1;
      } else if (var0 == 2601) {
         field1537[++class41.field341 - 1] = var4.field2191;
         return 1;
      } else if (var0 == 2602) {
         field1524[++class272.field1912 - 1] = var4.field2218;
         return 1;
      } else if (var0 == 2603) {
         field1537[++class41.field341 - 1] = var4.field2245;
         return 1;
      } else if (var0 == 2604) {
         field1537[++class41.field341 - 1] = var4.field2180;
         return 1;
      } else if (var0 == 2605) {
         field1537[++class41.field341 - 1] = var4.field2211;
         return 1;
      } else if (var0 == 2606) {
         field1537[++class41.field341 - 1] = var4.field2208;
         return 1;
      } else if (var0 == 2607) {
         field1537[++class41.field341 - 1] = var4.field2273;
         return 1;
      } else if (var0 == 2608) {
         field1537[++class41.field341 - 1] = var4.field2226;
         return 1;
      } else if (var0 == 2609) {
         field1537[++class41.field341 - 1] = var4.field2179;
         return 1;
      } else if (var0 == 2610) {
         field1537[++class41.field341 - 1] = var4.field2188;
         return 1;
      } else if (var0 == 2611) {
         field1537[++class41.field341 - 1] = var4.field2181;
         return 1;
      } else if (var0 == 2612) {
         field1537[++class41.field341 - 1] = var4.field2182;
         return 1;
      } else if (var0 == 2613) {
         field1537[++class41.field341 - 1] = var4.field2186.method180();
         return 1;
      } else if (var0 == 2614) {
         field1537[++class41.field341 - 1] = var4.field2216 ? 1 : 0;
         return 1;
      } else {
         class326 var5;
         if (var0 == 2617) {
            var5 = var4.method1469();
            field1537[++class41.field341 - 1] = var5 != null ? var5.field2434 : 0;
         }

         if (var0 == 2618) {
            var5 = var4.method1469();
            field1537[++class41.field341 - 1] = null != var5 ? var5.field2435 : 0;
            return 1;
         } else {
            class173 var8;
            if (var0 == 2619) {
               var8 = var4.method1483();
               field1524[++class272.field1912 - 1] = var8 != null ? var8.method700().method2350() : "";
               return 1;
            } else if (var0 == 2620) {
               var5 = var4.method1469();
               field1537[++class41.field341 - 1] = var5 != null ? var5.field2436 : 0;
               return 1;
            } else if (var0 == 2621) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = var8 != null ? var8.method738() : 0;
               return 1;
            } else if (var0 == 2622) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = null != var8 ? var8.method734() : 0;
               return 1;
            } else if (var0 == 2623) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = null != var8 ? var8.method740() : 0;
               return 1;
            } else if (var0 == 2624) {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = null != var8 && var8.method702() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var8 = var4.method1483();
                  field1524[++class272.field1912 - 1] = null != var8 ? var8.method675().method256() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var8 = var4.method1483();
                  int var6 = null != var8 ? var8.method705() : 0;
                  int var7 = null != var8 ? var8.method704() : 0;
                  field1537[++class41.field341 - 1] = Math.min(var6, var7);
                  field1537[++class41.field341 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 2628) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method704() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method677() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = null != var8 ? var8.method709() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method728() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var8 = var4.method1483();
                  field1537[++class41.field341 - 1] = var8 != null ? var8.method671() : 0;
                  return 1;
               } else {
                  class166 var9;
                  if (var0 == 2633) {
                     var9 = var4.method1459();
                     field1537[class41.field341 - 1] = null != var9 ? var9.method635(field1537[class41.field341 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var9 = var4.method1459();
                     field1537[class41.field341 - 1] = null != var9 ? var9.method639((char)field1537[class41.field341 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method1483();
               field1537[++class41.field341 - 1] = var8 != null && var8.method703() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static int method1040(int var0, class283 var1, boolean var2) {
      class322 var4;
      if (var0 == 2700) {
         var4 = class322.method1488(field1537[--class41.field341]);
         field1537[++class41.field341 - 1] = var4.field2286;
         return 1;
      } else if (var0 == 2701) {
         var4 = class322.method1488(field1537[--class41.field341]);
         if (-1 != var4.field2286) {
            field1537[++class41.field341 - 1] = var4.field2287;
         } else {
            field1537[++class41.field341 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var6 = field1537[--class41.field341];
         class127 var5 = (class127)Client.field1137.method1431((long)var6);
         if (var5 != null) {
            field1537[++class41.field341 - 1] = 1;
         } else {
            field1537[++class41.field341 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         field1537[++class41.field341 - 1] = Client.field1288;
         return 1;
      } else if (var0 == 2707) {
         var4 = class322.method1488(field1537[--class41.field341]);
         field1537[++class41.field341 - 1] = var4.method1480() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var4 = class322.method1488(field1537[--class41.field341]);
         return method1035(var4);
      } else if (var0 == 2709) {
         var4 = class322.method1488(field1537[--class41.field341]);
         return method1045(var4);
      } else {
         return 2;
      }
   }

   static int method1012(int var0, class283 var1, boolean var2) {
      class322 var4 = class322.method1488(field1537[--class41.field341]);
      if (var0 == 2800) {
         field1537[++class41.field341 - 1] = class125.method474(Client.method865(var4));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (null == var4.field2162) {
               field1524[++class272.field1912 - 1] = "";
            } else {
               field1524[++class272.field1912 - 1] = var4.field2162;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = field1537[--class41.field341];
         --var5;
         if (var4.field2236 != null && var5 < var4.field2236.length && null != var4.field2236[var5]) {
            field1524[++class272.field1912 - 1] = var4.field2236[var5];
         } else {
            field1524[++class272.field1912 - 1] = "";
         }

         return 1;
      }
   }

   static int method1047(int var0, class283 var1, boolean var2) {
      String var12;
      if (var0 == 3100) {
         var12 = field1524[--class272.field1912];
         class431.method2007(0, "", var12);
         return 1;
      } else if (var0 == 3101) {
         class41.field341 -= 2;
         Client.method938(class266.field1874, field1537[class41.field341], field1537[class41.field341 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!field1532) {
            field1538 = true;
         }

         return 1;
      } else {
         int var11;
         if (var0 == 3104) {
            var12 = field1524[--class272.field1912];
            var11 = 0;
            if (class447.method2089(var12)) {
               var11 = class447.method2083(var12);
            }

            class53 var15 = class53.method226(class10.field173, Client.field1181.field3781);
            var15.field435.method1709(var11);
            Client.field1181.method2254(var15);
            return 1;
         } else {
            class53 var9;
            if (var0 == 3105) {
               var12 = field1524[--class272.field1912];
               var9 = class53.method226(class10.field81, Client.field1181.field3781);
               var9.field435.method1643(var12.length() + 1);
               var9.field435.method1646(var12);
               Client.field1181.method2254(var9);
               return 1;
            } else if (var0 == 3106) {
               var12 = field1524[--class272.field1912];
               var9 = class53.method226(class10.field177, Client.field1181.field3781);
               var9.field435.method1643(var12.length() + 1);
               var9.field435.method1646(var12);
               Client.field1181.method2254(var9);
               return 1;
            } else {
               int var4;
               String var5;
               if (var0 == 3107) {
                  var4 = field1537[--class41.field341];
                  var5 = field1524[--class272.field1912];
                  class151.method574(var4, var5);
                  return 1;
               } else if (var0 == 3108) {
                  class41.field341 -= 3;
                  var4 = field1537[class41.field341];
                  var11 = field1537[1 + class41.field341];
                  int var14 = field1537[2 + class41.field341];
                  class322 var16 = class322.method1488(var14);
                  Client.method872(var16, var4, var11);
                  return 1;
               } else if (var0 == 3109) {
                  class41.field341 -= 2;
                  var4 = field1537[class41.field341];
                  var11 = field1537[1 + class41.field341];
                  class322 var13 = var2 ? class276.field1942 : class48.field419;
                  Client.method872(var13, var4, var11);
                  return 1;
               } else if (var0 == 3110) {
                  class301.field2050 = field1537[--class41.field341] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  field1537[++class41.field341 - 1] = class158.field1004.method509() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class158.field1004.method508(field1537[--class41.field341] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var12 = field1524[--class272.field1912];
                  boolean var10 = field1537[--class41.field341] == 1;
                  class410.method1894(var12, var10, false);
                  return 1;
               } else if (var0 == 3115) {
                  var4 = field1537[--class41.field341];
                  var9 = class53.method226(class10.field170, Client.field1181.field3781);
                  var9.field435.method1684(var4);
                  Client.field1181.method2254(var9);
                  return 1;
               } else if (var0 == 3116) {
                  var4 = field1537[--class41.field341];
                  class272.field1912 -= 2;
                  var5 = field1524[class272.field1912];
                  String var6 = field1524[class272.field1912 + 1];
                  if (var5.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class53 var7 = class53.method226(class10.field101, Client.field1181.field3781);
                     var7.field435.method1684(1 + class366.method1717(var5) + class366.method1717(var6));
                     var7.field435.method1646(var6);
                     var7.field435.method1643(var4);
                     var7.field435.method1646(var5);
                     Client.field1181.method2254(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  --class41.field341;
                  return 1;
               } else if (var0 == 3118) {
                  Client.field1276 = field1537[--class41.field341] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  Client.field1354 = field1537[--class41.field341] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (field1537[--class41.field341] == 1) {
                     Client.field1119 |= 1;
                  } else {
                     Client.field1119 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (field1537[--class41.field341] == 1) {
                     Client.field1119 |= 2;
                  } else {
                     Client.field1119 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (field1537[--class41.field341] == 1) {
                     Client.field1119 |= 4;
                  } else {
                     Client.field1119 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (field1537[--class41.field341] == 1) {
                     Client.field1119 |= 8;
                  } else {
                     Client.field1119 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.field1119 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  Client.field1405 = field1537[--class41.field341] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  Client.field1242 = field1537[--class41.field341] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  Client.method783(field1537[--class41.field341] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  field1537[++class41.field341 - 1] = Client.method797() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class41.field341 -= 2;
                  Client.field1214 = field1537[class41.field341];
                  Client.field1215 = field1537[class41.field341 + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class41.field341 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class41.field341;
                  return 1;
               } else if (var0 == 3132) {
                  field1537[++class41.field341 - 1] = class114.field730;
                  field1537[++class41.field341 - 1] = class394.field2761;
                  return 1;
               } else if (var0 == 3133) {
                  --class41.field341;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class41.field341 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field1130 = 3;
                  Client.field1291 = field1537[--class41.field341];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field1130 = 2;
                  Client.field1291 = field1537[--class41.field341];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field1130 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field1130 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field1130 = 3;
                  Client.field1291 = var2 ? class276.field1942.field2158 : class48.field419.field2158;
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3141) {
                     var8 = field1537[--class41.field341] == 1;
                     class158.field1004.method530(var8);
                     return 1;
                  } else if (var0 == 3142) {
                     field1537[++class41.field341 - 1] = class158.field1004.method513() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = field1537[--class41.field341] == 1;
                     Client.field1170 = var8;
                     if (!var8) {
                        class158.field1004.method520("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     field1537[++class41.field341 - 1] = Client.field1170 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var8 = field1537[--class41.field341] == 1;
                     class158.field1004.method528(!var8);
                     return 1;
                  } else if (var0 == 3147) {
                     field1537[++class41.field341 - 1] = class158.field1004.method529() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     field1537[++class41.field341 - 1] = class292.field1990;
                     return 1;
                  } else if (var0 == 3154) {
                     field1537[++class41.field341 - 1] = Client.method804();
                     return 1;
                  } else if (var0 == 3155) {
                     --class272.field1912;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class41.field341 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class41.field341;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class41.field341;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class272.field1912;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class41.field341;
                     field1524[++class272.field1912 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class41.field341;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class41.field341 -= 2;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class41.field341 -= 2;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class41.field341 -= 2;
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class41.field341;
                     return 1;
                  } else if (var0 == 3173) {
                     --class41.field341;
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class41.field341;
                     return 1;
                  } else if (var0 == 3175) {
                     field1537[++class41.field341 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class272.field1912;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class272.field1912;
                     return 1;
                  } else if (var0 == 3181) {
                     Client.method785(field1537[--class41.field341]);
                     return 1;
                  } else if (var0 == 3182) {
                     field1537[++class41.field341 - 1] = Client.method910();
                     return 1;
                  } else if (var0 == 3189) {
                     var4 = field1537[--class41.field341];
                     Client.method939(var4);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   static int method1037(int var0, class283 var1, boolean var2) {
      if (var0 == 3200) {
         class41.field341 -= 3;
         Client.method791(field1537[class41.field341], field1537[1 + class41.field341], field1537[2 + class41.field341]);
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         int var13;
         int var16;
         if (var0 == 3201) {
            class41.field341 -= 5;
            var13 = field1537[class41.field341];
            var16 = field1537[class41.field341 + 1];
            var6 = field1537[2 + class41.field341];
            var7 = field1537[class41.field341 + 3];
            var8 = field1537[4 + class41.field341];
            ArrayList var15 = new ArrayList();
            var15.add(var13);
            class175.method944(var15, var16, var6, var7, var8);
            return 1;
         } else if (var0 == 3202) {
            class41.field341 -= 2;
            Client.method807(field1537[class41.field341], field1537[1 + class41.field341]);
            return 1;
         } else {
            class67 var4;
            class384 var5;
            String var12;
            if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
               boolean var11;
               if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
                  if (var0 == 3211) {
                     return 1;
                  } else if (var0 == 3216) {
                     var13 = field1537[--class41.field341];
                     var16 = 0;
                     class67 var20 = (class67)class1.method2(class67.method289(), var13);
                     if (var20 != null) {
                        var16 = var20 != class67.field528 ? 1 : 0;
                     }

                     field1537[++class41.field341 - 1] = var16;
                     return 1;
                  } else if (var0 == 3218) {
                     var13 = field1537[--class41.field341];
                     var16 = 0;
                     class384 var19 = (class384)class1.method2(class384.method1774(), var13);
                     if (var19 != null) {
                        var16 = class384.field2719 != var19 ? 1 : 0;
                     }

                     field1537[++class41.field341 - 1] = var16;
                     return 1;
                  } else if (var0 != 3217 && var0 != 3219) {
                     if (var0 == 3220) {
                        class41.field341 -= 2;
                        var13 = field1537[class41.field341];
                        var16 = field1537[class41.field341 + 1];
                        class283.method1299(var13, var16);
                        return 1;
                     } else if (var0 == 3221) {
                        class41.field341 -= 6;
                        var13 = field1537[class41.field341];
                        var16 = field1537[1 + class41.field341];
                        var6 = field1537[class41.field341 + 2];
                        var7 = field1537[3 + class41.field341];
                        var8 = field1537[class41.field341 + 4];
                        int var9 = field1537[class41.field341 + 5];
                        ArrayList var10 = new ArrayList();
                        var10.add(var13);
                        var10.add(var16);
                        class175.method944(var10, var6, var7, var8, var9);
                        return 1;
                     } else if (var0 == 3222) {
                        class41.field341 -= 4;
                        var13 = field1537[class41.field341];
                        var16 = field1537[class41.field341 + 1];
                        var6 = field1537[class41.field341 + 2];
                        var7 = field1537[class41.field341 + 3];
                        class469.method2207(var13, var16, var6, var7);
                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     var4 = class67.field528;
                     var5 = class384.field2719;
                     var11 = true;
                     boolean var18 = true;
                     if (var0 == 3217) {
                        var8 = field1537[--class41.field341];
                        var4 = (class67)class1.method2(class67.method289(), var8);
                        if (var4 == null) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                        }
                     }

                     if (var0 == 3219) {
                        var8 = field1537[--class41.field341];
                        var5 = (class384)class1.method2(class384.method1774(), var8);
                        if (var5 == null) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                        }
                     }

                     String var14;
                     byte var17;
                     if (class384.field2719 == var5) {
                        switch (var4.field525) {
                           case 1:
                           case 2:
                           case 3:
                              var17 = 0;
                              var7 = 1;
                              break;
                           case 4:
                              var17 = 0;
                              var7 = Integer.MAX_VALUE;
                              break;
                           case 5:
                              var17 = 0;
                              var7 = 100;
                              break;
                           default:
                              var14 = String.format("Unkown device option: %s.", var4.toString());
                              throw new RuntimeException(var14);
                        }
                     } else {
                        switch (var5.field2718) {
                           case 1:
                              var17 = 0;
                              var7 = 1;
                              break;
                           case 2:
                           case 3:
                           case 4:
                              var17 = 0;
                              var7 = 100;
                              break;
                           default:
                              var14 = String.format("Unkown game option: %s.", var5.toString());
                              throw new RuntimeException(var14);
                        }
                     }

                     field1537[++class41.field341 - 1] = var17;
                     field1537[++class41.field341 - 1] = var7;
                     return 1;
                  }
               } else {
                  var4 = class67.field528;
                  var5 = class384.field2719;
                  var11 = false;
                  if (var0 == 3214) {
                     var7 = field1537[--class41.field341];
                     var4 = (class67)class1.method2(class67.method289(), var7);
                     if (null == var4) {
                        throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                     }
                  }

                  if (var0 == 3215) {
                     var7 = field1537[--class41.field341];
                     var5 = (class384)class1.method2(class384.method1774(), var7);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                     }
                  }

                  if (var0 == 3210) {
                     var7 = field1537[--class41.field341];
                     var4 = (class67)class1.method2(class67.method289(), var7);
                     if (var4 == null) {
                        var5 = (class384)class1.method2(class384.method1774(), var7);
                        if (var5 == null) {
                           throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                        }
                     }
                  } else if (var0 == 3182) {
                     var4 = class67.field524;
                  } else if (var0 == 3204) {
                     var5 = class384.field2714;
                  } else if (var0 == 3206) {
                     var5 = class384.field2716;
                  } else if (var0 == 3208) {
                     var5 = class384.field2720;
                  }

                  if (class384.field2719 == var5) {
                     switch (var4.field525) {
                        case 1:
                           var6 = class158.field1004.method513() ? 1 : 0;
                           break;
                        case 2:
                           var6 = class158.field1004.method529() ? 1 : 0;
                           break;
                        case 3:
                           var6 = class158.field1004.method519() ? 1 : 0;
                           break;
                        case 4:
                           var6 = class158.field1004.method515();
                           break;
                        case 5:
                           var6 = Client.method910();
                           break;
                        default:
                           var12 = String.format("Unkown device option: %s.", var4.toString());
                           throw new RuntimeException(var12);
                     }
                  } else {
                     switch (var5.field2718) {
                        case 1:
                           var6 = class158.field1004.method509() ? 1 : 0;
                           break;
                        case 2:
                           var7 = class158.field1004.method510();
                           var6 = Math.round((float)(var7 * 100) / 255.0F);
                           break;
                        case 3:
                           var7 = class158.field1004.method518();
                           var6 = Math.round((float)(var7 * 100) / 127.0F);
                           break;
                        case 4:
                           var7 = class158.field1004.method536();
                           var6 = Math.round((float)(var7 * 100) / 127.0F);
                           break;
                        default:
                           var12 = String.format("Unkown game option: %s.", var5.toString());
                           throw new RuntimeException(var12);
                     }
                  }

                  field1537[++class41.field341 - 1] = var6;
                  return 1;
               }
            } else {
               var4 = class67.field528;
               var5 = class384.field2719;
               var6 = field1537[--class41.field341];
               if (var0 == 3212) {
                  var7 = field1537[--class41.field341];
                  var4 = (class67)class1.method2(class67.method289(), var7);
                  if (null == var4) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (var0 == 3213) {
                  var7 = field1537[--class41.field341];
                  var5 = (class384)class1.method2(class384.method1774(), var7);
                  if (var5 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (var0 == 3209) {
                  var7 = field1537[--class41.field341];
                  var4 = (class67)class1.method2(class67.method289(), var7);
                  if (var4 == null) {
                     var5 = (class384)class1.method2(class384.method1774(), var7);
                     if (null == var5) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (var0 == 3181) {
                  var4 = class67.field524;
               } else if (var0 == 3203) {
                  var5 = class384.field2714;
               } else if (var0 == 3205) {
                  var5 = class384.field2716;
               } else if (var0 == 3207) {
                  var5 = class384.field2720;
               }

               if (class384.field2719 == var5) {
                  switch (var4.field525) {
                     case 1:
                        class158.field1004.method530(var6 == 1);
                        break;
                     case 2:
                        class158.field1004.method528(var6 == 1);
                        break;
                     case 3:
                        class158.field1004.method511(var6 == 1);
                        break;
                     case 4:
                        if (var6 < 0) {
                           var6 = 0;
                        }

                        class158.field1004.method514(var6);
                        break;
                     case 5:
                        Client.method785(var6);
                        break;
                     default:
                        var12 = String.format("Unkown device option: %s.", var4.toString());
                        throw new RuntimeException(var12);
                  }
               } else {
                  switch (var5.field2718) {
                     case 1:
                        class158.field1004.method508(var6 == 1);
                        break;
                     case 2:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 255) / 100.0F);
                        Client.method890(var7);
                        break;
                     case 3:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 127) / 100.0F);
                        Client.method920(var7);
                        break;
                     case 4:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 127) / 100.0F);
                        Client.method784(var7);
                        break;
                     default:
                        var12 = String.format("Unkown game option: %s.", var5.toString());
                        throw new RuntimeException(var12);
                  }
               }

               return 1;
            }
         }
      }
   }

   static int method1046(int var0, class283 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         class41.field341 -= 2;
         var4 = field1537[class41.field341];
         var5 = field1537[1 + class41.field341];
         class342 var11 = class342.method1591(var4);
         if (var11.field2546 != 's') {
         }

         for(var7 = 0; var7 < var11.field2549; ++var7) {
            if (var11.field2543[var7] == var5) {
               field1524[++class272.field1912 - 1] = var11.field2550[var7];
               var11 = null;
               break;
            }
         }

         if (null != var11) {
            field1524[++class272.field1912 - 1] = var11.field2547;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = field1537[--class41.field341];
            class342 var10 = class342.method1591(var4);
            field1537[++class41.field341 - 1] = var10.method1588();
            return 1;
         } else {
            return 2;
         }
      } else {
         class41.field341 -= 4;
         var4 = field1537[class41.field341];
         var5 = field1537[class41.field341 + 1];
         int var6 = field1537[class41.field341 + 2];
         var7 = field1537[class41.field341 + 3];
         class342 var8 = class342.method1591(var6);
         if (var8.field2545 == var4 && var8.field2546 == var5) {
            for(int var9 = 0; var9 < var8.field2549; ++var9) {
               if (var8.field2543[var9] == var7) {
                  if (var5 == 115) {
                     field1524[++class272.field1912 - 1] = var8.field2550[var9];
                  } else {
                     field1537[++class41.field341 - 1] = var8.field2552[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (null != var8) {
               if (var5 == 115) {
                  field1524[++class272.field1912 - 1] = var8.field2547;
               } else {
                  field1537[++class41.field341 - 1] = var8.field2544;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               field1524[++class272.field1912 - 1] = class424.field3311;
            } else {
               field1537[++class41.field341 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method1033(int var0, class283 var1, boolean var2) {
      int var4;
      if (var0 == 3500) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1264.method1385(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1264.method1382(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1264.method1380(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1000(int var0, class283 var1, boolean var2) {
      if (var0 == 3600) {
         if (0 == class290.field1979.field937) {
            field1537[++class41.field341 - 1] = -2;
         } else if (class290.field1979.field937 == 1) {
            field1537[++class41.field341 - 1] = -1;
         } else {
            field1537[++class41.field341 - 1] = class290.field1979.field939.method1814();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = field1537[--class41.field341];
            if (class290.field1979.method541() && var4 >= 0 && var4 < class290.field1979.field939.method1814()) {
               class20 var9 = (class20)class290.field1979.field939.method1801(var4);
               field1524[++class272.field1912 - 1] = var9.method243();
               field1524[++class272.field1912 - 1] = var9.method244();
            } else {
               field1524[++class272.field1912 - 1] = "";
               field1524[++class272.field1912 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = field1537[--class41.field341];
            if (class290.field1979.method541() && var4 >= 0 && var4 < class290.field1979.field939.method1814()) {
               field1537[++class41.field341 - 1] = ((class538)class290.field1979.field939.method1801(var4)).field4284;
            } else {
               field1537[++class41.field341 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var4 = field1537[--class41.field341];
            if (class290.field1979.method541() && var4 >= 0 && var4 < class290.field1979.field939.method1814()) {
               field1537[++class41.field341 - 1] = ((class538)class290.field1979.field939.method1801(var4)).field4285;
            } else {
               field1537[++class41.field341 - 1] = 0;
            }

            return 1;
         } else {
            String var10;
            if (var0 == 3604) {
               var10 = field1524[--class272.field1912];
               int var8 = field1537[--class41.field341];
               class146.method558(var10, var8);
               return 1;
            } else if (var0 == 3605) {
               var10 = field1524[--class272.field1912];
               class290.field1979.method547(var10);
               return 1;
            } else if (var0 == 3606) {
               var10 = field1524[--class272.field1912];
               class290.field1979.method550(var10);
               return 1;
            } else if (var0 == 3607) {
               var10 = field1524[--class272.field1912];
               class290.field1979.method549(var10);
               return 1;
            } else if (var0 == 3608) {
               var10 = field1524[--class272.field1912];
               boolean var7 = true;
               class290.field1979.method551(var10, var7);
               return 1;
            } else if (var0 == 3609) {
               var10 = field1524[--class272.field1912];
               var10 = Client.method864(var10);
               field1537[++class41.field341 - 1] = class290.field1979.method545(new class349(var10, class103.field694), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class498.field3983 != null) {
                  field1524[++class272.field1912 - 1] = class498.field3983.field1720;
               } else {
                  field1524[++class272.field1912 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class498.field3983 != null) {
                  field1537[++class41.field341 - 1] = class498.field3983.method1814();
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = field1537[--class41.field341];
               if (class498.field3983 != null && var4 < class498.field3983.method1814()) {
                  field1524[++class272.field1912 - 1] = class498.field3983.method1801(var4).method242().method1598();
               } else {
                  field1524[++class272.field1912 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = field1537[--class41.field341];
               if (class498.field3983 != null && var4 < class498.field3983.method1814()) {
                  field1537[++class41.field341 - 1] = ((class538)class498.field3983.method1801(var4)).method2582();
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = field1537[--class41.field341];
               if (class498.field3983 != null && var4 < class498.field3983.method1814()) {
                  field1537[++class41.field341 - 1] = ((class538)class498.field3983.method1801(var4)).field4285;
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               field1537[++class41.field341 - 1] = class498.field3983 != null ? class498.field3983.field1724 : 0;
               return 1;
            } else if (var0 == 3617) {
               var10 = field1524[--class272.field1912];
               Client.method845(var10);
               return 1;
            } else if (var0 == 3618) {
               field1537[++class41.field341 - 1] = class498.field3983 != null ? class498.field3983.field1725 : 0;
               return 1;
            } else if (var0 == 3619) {
               var10 = field1524[--class272.field1912];
               Client.method833(var10);
               return 1;
            } else if (var0 == 3620) {
               Client.method812();
               return 1;
            } else if (var0 == 3621) {
               if (!class290.field1979.method541()) {
                  field1537[++class41.field341 - 1] = -1;
               } else {
                  field1537[++class41.field341 - 1] = class290.field1979.field938.method1814();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = field1537[--class41.field341];
               if (class290.field1979.method541() && var4 >= 0 && var4 < class290.field1979.field938.method1814()) {
                  class92 var5 = (class92)class290.field1979.field938.method1801(var4);
                  field1524[++class272.field1912 - 1] = var5.method243();
                  field1524[++class272.field1912 - 1] = var5.method244();
               } else {
                  field1524[++class272.field1912 - 1] = "";
                  field1524[++class272.field1912 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var10 = field1524[--class272.field1912];
               var10 = Client.method864(var10);
               field1537[++class41.field341 - 1] = class290.field1979.method546(new class349(var10, class103.field694)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = field1537[--class41.field341];
               if (null != class498.field3983 && var4 < class498.field3983.method1814() && class498.field3983.method1801(var4).method242().equals(class266.field1874.field3510)) {
                  field1537[++class41.field341 - 1] = 1;
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (null != class498.field3983 && null != class498.field3983.field1723) {
                  field1524[++class272.field1912 - 1] = class498.field3983.field1723;
               } else {
                  field1524[++class272.field1912 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var4 = field1537[--class41.field341];
               if (null != class498.field3983 && var4 < class498.field3983.method1814() && ((class246)class498.field3983.method1801(var4)).method1185()) {
                  field1537[++class41.field341 - 1] = 1;
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class290.field1979.field939.method1813();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class284(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class91(var6));
                     return 1;
                  } else if (var0 == 3631) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class304(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class16(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class476(var6));
                     return 1;
                  } else if (var0 == 3634) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class413(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class254(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class93(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class280(var6));
                     return 1;
                  } else if (var0 == 3638) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class455(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     class290.field1979.field939.method1815();
                     return 1;
                  } else if (var0 == 3640) {
                     class290.field1979.field938.method1813();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field938.method1806(new class284(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field938.method1806(new class91(var6));
                     return 1;
                  } else if (var0 == 3643) {
                     class290.field1979.field938.method1815();
                     return 1;
                  } else if (var0 == 3644) {
                     if (null != class498.field3983) {
                        class498.field3983.method1813();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var6 = field1537[--class41.field341] == 1;
                     if (null != class498.field3983) {
                        class498.field3983.method1806(new class284(var6));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var6 = field1537[--class41.field341] == 1;
                     if (null != class498.field3983) {
                        class498.field3983.method1806(new class91(var6));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class304(var6));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class16(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class476(var6));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class413(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = field1537[--class41.field341] == 1;
                     if (null != class498.field3983) {
                        class498.field3983.method1806(new class254(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class93(var6));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var6 = field1537[--class41.field341] == 1;
                     if (null != class498.field3983) {
                        class498.field3983.method1806(new class280(var6));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class455(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (null != class498.field3983) {
                        class498.field3983.method1815();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = field1537[--class41.field341] == 1;
                     class290.field1979.field939.method1806(new class403(var6));
                     return 1;
                  } else if (var0 == 3657) {
                     var6 = field1537[--class41.field341] == 1;
                     if (class498.field3983 != null) {
                        class498.field3983.method1806(new class403(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = field1537[--class41.field341];
               if (class498.field3983 != null && var4 < class498.field3983.method1814() && ((class246)class498.field3983.method1801(var4)).method1186()) {
                  field1537[++class41.field341 - 1] = 1;
               } else {
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   static int method1003(int var0, class283 var1, boolean var2) {
      return 2;
   }

   static int method1005(int var0, class283 var1, boolean var2) {
      if (var0 == 3800) {
         if (class470.field3738 != null) {
            field1537[++class41.field341 - 1] = 1;
            class56.field458 = class470.field3738;
         } else {
            field1537[++class41.field341 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = field1537[--class41.field341];
            if (null != Client.field1360[var4]) {
               field1537[++class41.field341 - 1] = 1;
               class56.field458 = Client.field1360[var4];
            } else {
               field1537[++class41.field341 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            field1524[++class272.field1912 - 1] = class56.field458.field60;
            return 1;
         } else if (var0 == 3803) {
            field1537[++class41.field341 - 1] = class56.field458.field59 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            field1537[++class41.field341 - 1] = class56.field458.field73;
            return 1;
         } else if (var0 == 3805) {
            field1537[++class41.field341 - 1] = class56.field458.field61;
            return 1;
         } else if (var0 == 3806) {
            field1537[++class41.field341 - 1] = class56.field458.field62;
            return 1;
         } else if (var0 == 3807) {
            field1537[++class41.field341 - 1] = class56.field458.field63;
            return 1;
         } else if (var0 == 3809) {
            field1537[++class41.field341 - 1] = class56.field458.field64;
            return 1;
         } else if (var0 == 3810) {
            var4 = field1537[--class41.field341];
            field1524[++class272.field1912 - 1] = class56.field458.field75[var4];
            return 1;
         } else if (var0 == 3811) {
            var4 = field1537[--class41.field341];
            field1537[++class41.field341 - 1] = class56.field458.field66[var4];
            return 1;
         } else if (var0 == 3812) {
            field1537[++class41.field341 - 1] = class56.field458.field57;
            return 1;
         } else if (var0 == 3813) {
            var4 = field1537[--class41.field341];
            field1524[++class272.field1912 - 1] = class56.field458.field76[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               class41.field341 -= 3;
               var4 = field1537[class41.field341];
               var7 = field1537[1 + class41.field341];
               var6 = field1537[class41.field341 + 2];
               field1537[++class41.field341 - 1] = class56.field458.method65(var4, var7, var6);
               return 1;
            } else if (var0 == 3815) {
               field1537[++class41.field341 - 1] = class56.field458.field71;
               return 1;
            } else if (var0 == 3816) {
               field1537[++class41.field341 - 1] = class56.field458.field56;
               return 1;
            } else if (var0 == 3817) {
               field1537[++class41.field341 - 1] = class56.field458.method63(field1524[--class272.field1912]);
               return 1;
            } else if (var0 == 3818) {
               field1537[class41.field341 - 1] = class56.field458.method59()[field1537[class41.field341 - 1]];
               return 1;
            } else if (var0 == 3819) {
               class41.field341 -= 2;
               var4 = field1537[class41.field341];
               var7 = field1537[class41.field341 + 1];
               Client.method917(var7, var4);
               return 1;
            } else if (var0 == 3820) {
               var4 = field1537[--class41.field341];
               field1537[++class41.field341 - 1] = class56.field458.field69[var4];
               return 1;
            } else {
               if (var0 == 3821) {
                  class41.field341 -= 3;
                  var4 = field1537[class41.field341];
                  boolean var5 = field1537[1 + class41.field341] == 1;
                  var6 = field1537[class41.field341 + 2];
                  class35.method149(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = class56.field458.field70[var4] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (null != class422.field2979) {
                     field1537[++class41.field341 - 1] = 1;
                     class325.field2432 = class422.field2979;
                  } else {
                     field1537[++class41.field341 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = field1537[--class41.field341];
                  if (null != Client.field1361[var4]) {
                     field1537[++class41.field341 - 1] = 1;
                     class325.field2432 = Client.field1361[var4];
                     class114.field732 = var4;
                  } else {
                     field1537[++class41.field341 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  field1524[++class272.field1912 - 1] = class325.field2432.field2936;
                  return 1;
               } else if (var0 == 3853) {
                  field1537[++class41.field341 - 1] = class325.field2432.field2935;
                  return 1;
               } else if (var0 == 3854) {
                  field1537[++class41.field341 - 1] = class325.field2432.field2931;
                  return 1;
               } else if (var0 == 3855) {
                  field1537[++class41.field341 - 1] = class325.field2432.method1907();
                  return 1;
               } else if (var0 == 3856) {
                  var4 = field1537[--class41.field341];
                  field1524[++class272.field1912 - 1] = ((class367)class325.field2432.field2933.get(var4)).field2656.method1598();
                  return 1;
               } else if (var0 == 3857) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = ((class367)class325.field2432.field2933.get(var4)).field2657;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = ((class367)class325.field2432.field2933.get(var4)).field2658;
                  return 1;
               } else if (var0 == 3859) {
                  var4 = field1537[--class41.field341];
                  Client.method825(class114.field732, var4);
                  return 1;
               } else if (var0 == 3860) {
                  field1537[++class41.field341 - 1] = class325.field2432.method1908(field1524[--class272.field1912]);
                  return 1;
               } else if (var0 == 3861) {
                  field1537[class41.field341 - 1] = class325.field2432.method1909()[field1537[class41.field341 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  field1537[++class41.field341 - 1] = null != class84.field571 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static int method1041(int var0, class283 var1, boolean var2) {
      int var4;
      if (var0 == 3903) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1394[var4].method2478();
         return 1;
      } else if (var0 == 3904) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1394[var4].field4136;
         return 1;
      } else if (var0 == 3905) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1394[var4].field4140;
         return 1;
      } else if (var0 == 3906) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1394[var4].field4138;
         return 1;
      } else if (var0 == 3907) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1394[var4].field4139;
         return 1;
      } else if (var0 == 3908) {
         var4 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = Client.field1394[var4].field4135;
         return 1;
      } else {
         int var14;
         if (var0 == 3910) {
            var4 = field1537[--class41.field341];
            var14 = Client.field1394[var4].method2477();
            field1537[++class41.field341 - 1] = var14 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = field1537[--class41.field341];
            var14 = Client.field1394[var4].method2477();
            field1537[++class41.field341 - 1] = var14 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = field1537[--class41.field341];
            var14 = Client.field1394[var4].method2477();
            field1537[++class41.field341 - 1] = var14 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = field1537[--class41.field341];
            var14 = Client.field1394[var4].method2477();
            field1537[++class41.field341 - 1] = var14 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = field1537[--class41.field341] == 1;
               if (class351.field2581 != null) {
                  class351.field2581.method1571(class337.field2518, var12);
               }

               return 1;
            } else if (var0 == 3915) {
               var12 = field1537[--class41.field341] == 1;
               if (null != class351.field2581) {
                  class351.field2581.method1571(class337.field2520, var12);
               }

               return 1;
            } else if (var0 == 3916) {
               class41.field341 -= 2;
               var12 = field1537[class41.field341] == 1;
               boolean var13 = 1 == field1537[1 + class41.field341];
               if (null != class351.field2581) {
                  Client.field1406.field1762 = var13;
                  class351.field2581.method1571(Client.field1406, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = field1537[--class41.field341] == 1;
               if (null != class351.field2581) {
                  class351.field2581.method1571(class337.field2516, var12);
               }

               return 1;
            } else if (var0 == 3918) {
               var12 = field1537[--class41.field341] == 1;
               if (null != class351.field2581) {
                  class351.field2581.method1571(class337.field2519, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               field1537[++class41.field341 - 1] = class351.field2581 == null ? 0 : class351.field2581.field2517.size();
               return 1;
            } else {
               class199 var5;
               if (var0 == 3920) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  field1537[++class41.field341 - 1] = var5.field1548;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  field1524[++class272.field1912 - 1] = var5.method1052();
                  return 1;
               } else if (var0 == 3922) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  field1524[++class272.field1912 - 1] = var5.method1051();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  long var6 = class123.method471() - class423.field3000 - var5.field1546;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  field1524[++class272.field1912 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  field1537[++class41.field341 - 1] = var5.field1544.field4138;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  field1537[++class41.field341 - 1] = var5.field1544.field4140;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = field1537[--class41.field341];
                  var5 = (class199)class351.field2581.field2517.get(var4);
                  field1537[++class41.field341 - 1] = var5.field1544.field4136;
                  return 1;
               } else if (var0 == 3939) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = class47.method213(var4).field408 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static int method1042(int var0, class283 var1, boolean var2) {
      int var5;
      int var10;
      if (var0 == 4000) {
         class41.field341 -= 2;
         var10 = field1537[class41.field341];
         var5 = field1537[class41.field341 + 1];
         field1537[++class41.field341 - 1] = var10 + var5;
         return 1;
      } else if (var0 == 4001) {
         class41.field341 -= 2;
         var10 = field1537[class41.field341];
         var5 = field1537[1 + class41.field341];
         field1537[++class41.field341 - 1] = var10 - var5;
         return 1;
      } else if (var0 == 4002) {
         class41.field341 -= 2;
         var10 = field1537[class41.field341];
         var5 = field1537[1 + class41.field341];
         field1537[++class41.field341 - 1] = var10 * var5;
         return 1;
      } else if (var0 == 4003) {
         class41.field341 -= 2;
         var10 = field1537[class41.field341];
         var5 = field1537[1 + class41.field341];
         field1537[++class41.field341 - 1] = var10 / var5;
         return 1;
      } else if (var0 == 4004) {
         var10 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = (int)(Math.random() * (double)var10);
         return 1;
      } else if (var0 == 4005) {
         var10 = field1537[--class41.field341];
         field1537[++class41.field341 - 1] = (int)(Math.random() * (double)(var10 + 1));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (var0 == 4006) {
            class41.field341 -= 5;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            var6 = field1537[2 + class41.field341];
            var7 = field1537[class41.field341 + 3];
            var8 = field1537[class41.field341 + 4];
            field1537[++class41.field341 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
            return 1;
         } else if (var0 == 4007) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var5 * var10 / 100 + var10;
            return 1;
         } else if (var0 == 4008) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var10 | 1 << var5;
            return 1;
         } else if (var0 == 4009) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var10 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[1 + class41.field341];
            field1537[++class41.field341 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var10 % var5;
            return 1;
         } else if (var0 == 4012) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[1 + class41.field341];
            if (var10 == 0) {
               field1537[++class41.field341 - 1] = 0;
            } else {
               field1537[++class41.field341 - 1] = (int)Math.pow((double)var10, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            if (var10 == 0) {
               field1537[++class41.field341 - 1] = 0;
               return 1;
            } else {
               switch (var5) {
                  case 0:
                     field1537[++class41.field341 - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     field1537[++class41.field341 - 1] = var10;
                     break;
                  case 2:
                     field1537[++class41.field341 - 1] = (int)Math.sqrt((double)var10);
                     break;
                  case 3:
                     field1537[++class41.field341 - 1] = (int)Math.cbrt((double)var10);
                     break;
                  case 4:
                     field1537[++class41.field341 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
                     break;
                  default:
                     field1537[++class41.field341 - 1] = (int)Math.pow((double)var10, 1.0 / (double)var5);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var10 & var5;
            return 1;
         } else if (var0 == 4015) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var10 | var5;
            return 1;
         } else if (var0 == 4016) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[1 + class41.field341];
            field1537[++class41.field341 - 1] = var10 < var5 ? var10 : var5;
            return 1;
         } else if (var0 == 4017) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var10 > var5 ? var10 : var5;
            return 1;
         } else if (var0 == 4018) {
            class41.field341 -= 3;
            long var11 = (long)field1537[class41.field341];
            long var12 = (long)field1537[1 + class41.field341];
            long var13 = (long)field1537[class41.field341 + 2];
            field1537[++class41.field341 - 1] = (int)(var11 * var13 / var12);
            return 1;
         } else if (var0 == 4025) {
            var10 = class53.method225(field1537[--class41.field341]);
            field1537[++class41.field341 - 1] = var10;
            return 1;
         } else if (var0 == 4026) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[1 + class41.field341];
            field1537[++class41.field341 - 1] = var10 ^ 1 << var5;
            return 1;
         } else if (var0 == 4027) {
            class41.field341 -= 3;
            var10 = field1537[class41.field341];
            var5 = field1537[1 + class41.field341];
            var6 = field1537[2 + class41.field341];
            field1537[++class41.field341 - 1] = class32.method144(var10, var5, var6);
            return 1;
         } else if (var0 == 4028) {
            class41.field341 -= 3;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            var6 = field1537[2 + class41.field341];
            field1537[++class41.field341 - 1] = class32.method142(var10, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            class41.field341 -= 3;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            var6 = field1537[class41.field341 + 2];
            var7 = 31 - var6;
            field1537[++class41.field341 - 1] = var10 << var7 >>> var7 + var5;
            return 1;
         } else if (var0 == 4030) {
            class41.field341 -= 4;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            var6 = field1537[2 + class41.field341];
            var7 = field1537[3 + class41.field341];
            var10 = class32.method142(var10, var6, var7);
            var8 = class32.method140(1 + (var7 - var6));
            if (var5 > var8) {
               var5 = var8;
            }

            field1537[++class41.field341 - 1] = var10 | var5 << var6;
            return 1;
         } else if (var0 == 4032) {
            field1537[class41.field341 - 1] = class34.method146(field1537[class41.field341 - 1]);
            return 1;
         } else if (var0 == 4033) {
            field1537[class41.field341 - 1] = class34.method148(field1537[class41.field341 - 1]);
            return 1;
         } else if (var0 == 4034) {
            class41.field341 -= 2;
            var10 = field1537[class41.field341];
            var5 = field1537[class41.field341 + 1];
            var6 = class34.method147(var10, var5);
            field1537[++class41.field341 - 1] = var6;
            return 1;
         } else if (var0 == 4035) {
            field1537[class41.field341 - 1] = Math.abs(field1537[class41.field341 - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var4 = field1524[--class272.field1912];
            var5 = -1;
            if (class447.method2089(var4)) {
               var5 = class447.method2083(var4);
            }

            field1537[++class41.field341 - 1] = var5;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static int method1009(int var0, class283 var1, boolean var2) {
      String var4;
      int var10;
      if (var0 == 4100) {
         var4 = field1524[--class272.field1912];
         var10 = field1537[--class41.field341];
         field1524[++class272.field1912 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class272.field1912 -= 2;
            var4 = field1524[class272.field1912];
            var5 = field1524[1 + class272.field1912];
            field1524[++class272.field1912 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = field1524[--class272.field1912];
            var10 = field1537[--class41.field341];
            field1524[++class272.field1912 - 1] = var4 + class447.method2079(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = field1524[--class272.field1912];
            field1524[++class272.field1912 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var8;
            int var13;
            if (var0 == 4104) {
               var13 = field1537[--class41.field341];
               long var16 = 86400000L * ((long)var13 + 11745L);
               field1530.setTime(new Date(var16));
               var7 = field1530.get(5);
               var8 = field1530.get(2);
               int var9 = field1530.get(1);
               field1524[++class272.field1912 - 1] = var7 + "-" + field1531[var8] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var13 = field1537[--class41.field341];
                  field1524[++class272.field1912 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  class272.field1912 -= 2;
                  field1537[++class41.field341 - 1] = class447.method2088(class31.method136(field1524[class272.field1912], field1524[1 + class272.field1912], class367.field2654));
                  return 1;
               } else {
                  int var12;
                  byte[] var15;
                  class396 var17;
                  if (var0 == 4108) {
                     var4 = field1524[--class272.field1912];
                     class41.field341 -= 2;
                     var10 = field1537[class41.field341];
                     var12 = field1537[1 + class41.field341];
                     var15 = class443.field3522.method2422(var12, 0);
                     var17 = new class396(var15);
                     field1537[++class41.field341 - 1] = var17.method1917(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = field1524[--class272.field1912];
                     class41.field341 -= 2;
                     var10 = field1537[class41.field341];
                     var12 = field1537[1 + class41.field341];
                     var15 = class443.field3522.method2422(var12, 0);
                     var17 = new class396(var15);
                     field1537[++class41.field341 - 1] = var17.method1938(var4, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     class272.field1912 -= 2;
                     var4 = field1524[class272.field1912];
                     var5 = field1524[class272.field1912 + 1];
                     if (field1537[--class41.field341] == 1) {
                        field1524[++class272.field1912 - 1] = var4;
                     } else {
                        field1524[++class272.field1912 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = field1524[--class272.field1912];
                     field1524[++class272.field1912 - 1] = class419.method1928(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = field1524[--class272.field1912];
                     var10 = field1537[--class41.field341];
                     field1524[++class272.field1912 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var13 = field1537[--class41.field341];
                     field1537[++class41.field341 - 1] = class447.method2081((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var13 = field1537[--class41.field341];
                     field1537[++class41.field341 - 1] = class447.method2093((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var13 = field1537[--class41.field341];
                     field1537[++class41.field341 - 1] = class447.method2087((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var13 = field1537[--class41.field341];
                     field1537[++class41.field341 - 1] = class193.method991((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = field1524[--class272.field1912];
                     if (null != var4) {
                        field1537[++class41.field341 - 1] = var4.length();
                     } else {
                        field1537[++class41.field341 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var4 = field1524[--class272.field1912];
                     class41.field341 -= 2;
                     var10 = field1537[class41.field341];
                     var12 = field1537[1 + class41.field341];
                     field1524[++class272.field1912 - 1] = var4.substring(var10, var12);
                     return 1;
                  } else if (var0 == 4119) {
                     var4 = field1524[--class272.field1912];
                     StringBuilder var11 = new StringBuilder(var4.length());
                     boolean var14 = false;

                     for(var7 = 0; var7 < var4.length(); ++var7) {
                        var8 = var4.charAt(var7);
                        if (var8 == 60) {
                           var14 = true;
                        } else if (var8 == 62) {
                           var14 = false;
                        } else if (!var14) {
                           var11.append((char)var8);
                        }
                     }

                     field1524[++class272.field1912 - 1] = var11.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var4 = field1524[--class272.field1912];
                     var10 = field1537[--class41.field341];
                     field1537[++class41.field341 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class272.field1912 -= 2;
                     var4 = field1524[class272.field1912];
                     var5 = field1524[class272.field1912 + 1];
                     var12 = field1537[--class41.field341];
                     field1537[++class41.field341 - 1] = var4.indexOf(var5, var12);
                     return 1;
                  } else if (var0 == 4122) {
                     var4 = field1524[--class272.field1912];
                     field1524[++class272.field1912 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class272.field1912 -= 3;
                     var4 = field1524[class272.field1912];
                     var5 = field1524[1 + class272.field1912];
                     String var6 = field1524[class272.field1912 + 2];
                     if (null == class266.field1874.field3494) {
                        field1524[++class272.field1912 - 1] = var6;
                        return 1;
                     } else {
                        switch (class266.field1874.field3494.field1585) {
                           case 0:
                              field1524[++class272.field1912 - 1] = var4;
                              break;
                           case 1:
                              field1524[++class272.field1912 - 1] = var5;
                              break;
                           case 2:
                           default:
                              field1524[++class272.field1912 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class272.field1912 -= 2;
               var4 = field1524[class272.field1912];
               var5 = field1524[class272.field1912 + 1];
               if (null != class266.field1874.field3494 && 0 != class266.field1874.field3494.field1583) {
                  field1524[++class272.field1912 - 1] = var5;
               } else {
                  field1524[++class272.field1912 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   static int method1011(int var0, class283 var1, boolean var2) {
      int var4;
      if (var0 == 4200) {
         var4 = field1537[--class41.field341];
         field1524[++class272.field1912 - 1] = class47.method213(var4).field380;
         return 1;
      } else {
         class47 var6;
         int var7;
         if (var0 == 4201) {
            class41.field341 -= 2;
            var4 = field1537[class41.field341];
            var7 = field1537[1 + class41.field341];
            var6 = class47.method213(var4);
            if (var7 >= 1 && var7 <= 5 && var6.field381[var7 - 1] != null) {
               field1524[++class272.field1912 - 1] = var6.field381[var7 - 1];
            } else {
               field1524[++class272.field1912 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class41.field341 -= 2;
            var4 = field1537[class41.field341];
            var7 = field1537[1 + class41.field341];
            var6 = class47.method213(var4);
            if (var7 >= 1 && var7 <= 5 && var6.field382[var7 - 1] != null) {
               field1524[++class272.field1912 - 1] = var6.field382[var7 - 1];
            } else {
               field1524[++class272.field1912 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = field1537[--class41.field341];
            field1537[++class41.field341 - 1] = class47.method213(var4).field376;
            return 1;
         } else if (var0 == 4204) {
            var4 = field1537[--class41.field341];
            field1537[++class41.field341 - 1] = class47.method213(var4).field375 == 1 ? 1 : 0;
            return 1;
         } else {
            class47 var5;
            if (var0 == 4205) {
               var4 = field1537[--class41.field341];
               var5 = class47.method213(var4);
               if (var5.field371 == -1 && var5.field398 >= 0) {
                  field1537[++class41.field341 - 1] = var5.field398;
               } else {
                  field1537[++class41.field341 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = field1537[--class41.field341];
               var5 = class47.method213(var4);
               if (var5.field371 >= 0 && var5.field398 >= 0) {
                  field1537[++class41.field341 - 1] = var5.field398;
               } else {
                  field1537[++class41.field341 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = field1537[--class41.field341];
               field1537[++class41.field341 - 1] = class47.method213(var4).field368 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var4 = field1537[--class41.field341];
               var5 = class47.method213(var4);
               if (-1 == var5.field411 && var5.field370 >= 0) {
                  field1537[++class41.field341 - 1] = var5.field370;
               } else {
                  field1537[++class41.field341 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = field1537[--class41.field341];
               var5 = class47.method213(var4);
               if (var5.field411 >= 0 && var5.field370 >= 0) {
                  field1537[++class41.field341 - 1] = var5.field370;
               } else {
                  field1537[++class41.field341 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4210) {
               String var8 = field1524[--class272.field1912];
               var7 = field1537[--class41.field341];
               Client.method859(var8, var7 == 1);
               field1537[++class41.field341 - 1] = class150.field961;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class1.field1 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = field1537[--class41.field341];
                  var7 = class47.method213(var4).method206();
                  if (var7 == -1) {
                     field1537[++class41.field341 - 1] = var7;
                  } else {
                     field1537[++class41.field341 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = class47.method213(var4).field377;
                  return 1;
               } else if (var0 == 4215) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = class47.method213(var4).field362;
                  return 1;
               } else if (var0 == 4216) {
                  var4 = field1537[--class41.field341];
                  field1537[++class41.field341 - 1] = class47.method213(var4).field378;
                  return 1;
               } else if (var0 == 4217) {
                  var4 = field1537[--class41.field341];
                  var5 = class47.method213(var4);
                  field1537[++class41.field341 - 1] = var5.field366;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class539.field4290 != null && class1.field1 < class150.field961) {
                  field1537[++class41.field341 - 1] = class539.field4290[++class1.field1 - 1] & '\uffff';
               } else {
                  field1537[++class41.field341 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   static int method1043(int var0, class283 var1, boolean var2) {
      if (var0 == 5000) {
         field1537[++class41.field341 - 1] = Client.field1349;
         return 1;
      } else if (var0 == 5001) {
         class41.field341 -= 3;
         Client.field1349 = field1537[class41.field341];
         class108.field713 = class375.method1741(field1537[class41.field341 + 1]);
         if (null == class108.field713) {
            class108.field713 = class375.field2679;
         }

         Client.field1350 = field1537[class41.field341 + 2];
         class53 var14 = class53.method226(class10.field159, Client.field1181.field3781);
         var14.field435.method1643(Client.field1349);
         var14.field435.method1643(class108.field713.field2678);
         var14.field435.method1643(Client.field1350);
         Client.field1181.method2254(var14);
         return 1;
      } else {
         String var4;
         class53 var7;
         int var9;
         int var11;
         if (var0 == 5002) {
            var4 = field1524[--class272.field1912];
            class41.field341 -= 2;
            var9 = field1537[class41.field341];
            var11 = field1537[class41.field341 + 1];
            var7 = class53.method226(class10.field163, Client.field1181.field3781);
            var7.field435.method1643(class366.method1717(var4) + 2);
            var7.field435.method1646(var4);
            var7.field435.method1643(var9 - 1);
            var7.field435.method1643(var11);
            Client.field1181.method2254(var7);
            return 1;
         } else {
            class243 var6;
            int var8;
            if (var0 == 5003) {
               class41.field341 -= 2;
               var8 = field1537[class41.field341];
               var9 = field1537[1 + class41.field341];
               var6 = class431.method2013(var8, var9);
               if (null != var6) {
                  field1537[++class41.field341 - 1] = var6.field1773;
                  field1537[++class41.field341 - 1] = var6.field1769;
                  field1524[++class272.field1912 - 1] = null != var6.field1771 ? var6.field1771 : "";
                  field1524[++class272.field1912 - 1] = var6.field1775 != null ? var6.field1775 : "";
                  field1524[++class272.field1912 - 1] = var6.field1776 != null ? var6.field1776 : "";
                  field1537[++class41.field341 - 1] = var6.method1177() ? 1 : (var6.method1175() ? 2 : 0);
               } else {
                  field1537[++class41.field341 - 1] = -1;
                  field1537[++class41.field341 - 1] = 0;
                  field1524[++class272.field1912 - 1] = "";
                  field1524[++class272.field1912 - 1] = "";
                  field1524[++class272.field1912 - 1] = "";
                  field1537[++class41.field341 - 1] = 0;
               }

               return 1;
            } else {
               class243 var5;
               if (var0 == 5004) {
                  var8 = field1537[--class41.field341];
                  var5 = class431.method2008(var8);
                  if (var5 != null) {
                     field1537[++class41.field341 - 1] = var5.field1770;
                     field1537[++class41.field341 - 1] = var5.field1769;
                     field1524[++class272.field1912 - 1] = null != var5.field1771 ? var5.field1771 : "";
                     field1524[++class272.field1912 - 1] = null != var5.field1775 ? var5.field1775 : "";
                     field1524[++class272.field1912 - 1] = null != var5.field1776 ? var5.field1776 : "";
                     field1537[++class41.field341 - 1] = var5.method1177() ? 1 : (var5.method1175() ? 2 : 0);
                  } else {
                     field1537[++class41.field341 - 1] = -1;
                     field1537[++class41.field341 - 1] = 0;
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1524[++class272.field1912 - 1] = "";
                     field1537[++class41.field341 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (null == class108.field713) {
                     field1537[++class41.field341 - 1] = -1;
                  } else {
                     field1537[++class41.field341 - 1] = class108.field713.field2678;
                  }

                  return 1;
               } else {
                  class53 var12;
                  if (var0 == 5008) {
                     var4 = field1524[--class272.field1912];
                     var9 = field1537[--class41.field341];
                     var12 = class49.method215(var9, var4, class367.field2654, -1);
                     Client.field1181.method2254(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     class272.field1912 -= 2;
                     var4 = field1524[class272.field1912];
                     String var10 = field1524[class272.field1912 + 1];
                     var12 = class53.method226(class10.field164, Client.field1181.field3781);
                     var12.field435.method1684(0);
                     int var13 = var12.field435.field2652;
                     var12.field435.method1646(var4);
                     class453.method2110(var12.field435, var10);
                     var12.field435.method1651(var12.field435.field2652 - var13);
                     Client.field1181.method2254(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = field1524[--class272.field1912];
                     class41.field341 -= 2;
                     var9 = field1537[class41.field341];
                     var11 = field1537[class41.field341 + 1];
                     var7 = class49.method215(var9, var4, class367.field2654, var11);
                     Client.field1181.method2254(var7);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        field1537[++class41.field341 - 1] = Client.field1350;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = field1537[--class41.field341];
                        field1537[++class41.field341 - 1] = class431.method2011(var8);
                        return 1;
                     } else if (var0 == 5018) {
                        var8 = field1537[--class41.field341];
                        field1537[++class41.field341 - 1] = class431.method2012(var8);
                        return 1;
                     } else if (var0 == 5019) {
                        var8 = field1537[--class41.field341];
                        field1537[++class41.field341 - 1] = class431.method2010(var8);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = field1524[--class272.field1912];
                        class204.method1061(var4);
                        return 1;
                     } else if (var0 == 5021) {
                        Client.field1144 = field1524[--class272.field1912].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        field1524[++class272.field1912 - 1] = Client.field1144;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = field1524[--class272.field1912];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5030) {
                        class41.field341 -= 2;
                        var8 = field1537[class41.field341];
                        var9 = field1537[class41.field341 + 1];
                        var6 = class431.method2013(var8, var9);
                        if (var6 != null) {
                           field1537[++class41.field341 - 1] = var6.field1773;
                           field1537[++class41.field341 - 1] = var6.field1769;
                           field1524[++class272.field1912 - 1] = var6.field1771 != null ? var6.field1771 : "";
                           field1524[++class272.field1912 - 1] = var6.field1775 != null ? var6.field1775 : "";
                           field1524[++class272.field1912 - 1] = null != var6.field1776 ? var6.field1776 : "";
                           field1537[++class41.field341 - 1] = var6.method1177() ? 1 : (var6.method1175() ? 2 : 0);
                           field1524[++class272.field1912 - 1] = "";
                           field1537[++class41.field341 - 1] = 0;
                        } else {
                           field1537[++class41.field341 - 1] = -1;
                           field1537[++class41.field341 - 1] = 0;
                           field1524[++class272.field1912 - 1] = "";
                           field1524[++class272.field1912 - 1] = "";
                           field1524[++class272.field1912 - 1] = "";
                           field1537[++class41.field341 - 1] = 0;
                           field1524[++class272.field1912 - 1] = "";
                           field1537[++class41.field341 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var8 = field1537[--class41.field341];
                        var5 = class431.method2008(var8);
                        if (var5 != null) {
                           field1537[++class41.field341 - 1] = var5.field1770;
                           field1537[++class41.field341 - 1] = var5.field1769;
                           field1524[++class272.field1912 - 1] = null != var5.field1771 ? var5.field1771 : "";
                           field1524[++class272.field1912 - 1] = var5.field1775 != null ? var5.field1775 : "";
                           field1524[++class272.field1912 - 1] = null != var5.field1776 ? var5.field1776 : "";
                           field1537[++class41.field341 - 1] = var5.method1177() ? 1 : (var5.method1175() ? 2 : 0);
                           field1524[++class272.field1912 - 1] = "";
                           field1537[++class41.field341 - 1] = 0;
                        } else {
                           field1537[++class41.field341 - 1] = -1;
                           field1537[++class41.field341 - 1] = 0;
                           field1524[++class272.field1912 - 1] = "";
                           field1524[++class272.field1912 - 1] = "";
                           field1524[++class272.field1912 - 1] = "";
                           field1537[++class41.field341 - 1] = 0;
                           field1524[++class272.field1912 - 1] = "";
                           field1537[++class41.field341 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (null != class266.field1874 && null != class266.field1874.field3510) {
                        var4 = class266.field1874.field3510.method1598();
                     } else {
                        var4 = "";
                     }

                     field1524[++class272.field1912 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }

   static int method1027(int var0, class283 var1, boolean var2) {
      if (var0 == 5306) {
         field1537[++class41.field341 - 1] = Client.method868();
         return 1;
      } else {
         int var4;
         if (var0 == 5307) {
            var4 = field1537[--class41.field341];
            if (var4 == 1 || var4 == 2) {
               class37.method158(var4);
            }

            return 1;
         } else if (var0 == 5308) {
            field1537[++class41.field341 - 1] = class158.field1004.method524();
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --class41.field341;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = field1537[--class41.field341];
            if (var4 == 1 || var4 == 2) {
               class158.field1004.method523(var4);
            }

            return 1;
         }
      }
   }

   static int method1048(int var0, class283 var1, boolean var2) {
      int var4;
      if (var0 == 5504) {
         class41.field341 -= 2;
         var4 = field1537[class41.field341];
         int var5 = field1537[class41.field341 + 1];
         if (!Client.field1377) {
            Client.field1155 = var4;
            Client.field1294 = var5;
         }

         return 1;
      } else if (var0 == 5505) {
         field1537[++class41.field341 - 1] = Client.field1155;
         return 1;
      } else if (var0 == 5506) {
         field1537[++class41.field341 - 1] = Client.field1294;
         return 1;
      } else if (var0 == 5530) {
         var4 = field1537[--class41.field341];
         if (var4 < 0) {
            var4 = 0;
         }

         Client.field1210 = var4;
         return 1;
      } else if (var0 == 5531) {
         field1537[++class41.field341 - 1] = Client.field1210;
         return 1;
      } else {
         return 2;
      }
   }

   static int method998(int var0, class283 var1, boolean var2) {
      if (var0 == 5630) {
         Client.field1169 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1020(int var0) {
      return (int)Math.pow(2.0, (double)(7.0F + (float)var0 / 256.0F));
   }

   static int method1039(int var0) {
      return (int)((Math.log((double)var0) / field1536 - 7.0) * 256.0);
   }

   static int method1021(int var0, class283 var1, boolean var2) {
      if (var0 == 6500) {
         field1537[++class41.field341 - 1] = class518.method2494() ? 1 : 0;
         return 1;
      } else {
         class518 var9;
         if (var0 == 6501) {
            var9 = class518.method2491();
            if (var9 != null) {
               field1537[++class41.field341 - 1] = var9.field4146;
               field1537[++class41.field341 - 1] = var9.field4142;
               field1524[++class272.field1912 - 1] = var9.field4150;
               field1537[++class41.field341 - 1] = var9.field4151;
               field1537[++class41.field341 - 1] = var9.field4148;
               field1524[++class272.field1912 - 1] = var9.field4149;
            } else {
               field1537[++class41.field341 - 1] = -1;
               field1537[++class41.field341 - 1] = 0;
               field1524[++class272.field1912 - 1] = "";
               field1537[++class41.field341 - 1] = 0;
               field1537[++class41.field341 - 1] = 0;
               field1524[++class272.field1912 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var9 = class518.method2498();
            if (var9 != null) {
               field1537[++class41.field341 - 1] = var9.field4146;
               field1537[++class41.field341 - 1] = var9.field4142;
               field1524[++class272.field1912 - 1] = var9.field4150;
               field1537[++class41.field341 - 1] = var9.field4151;
               field1537[++class41.field341 - 1] = var9.field4148;
               field1524[++class272.field1912 - 1] = var9.field4149;
            } else {
               field1537[++class41.field341 - 1] = -1;
               field1537[++class41.field341 - 1] = 0;
               field1524[++class272.field1912 - 1] = "";
               field1537[++class41.field341 - 1] = 0;
               field1537[++class41.field341 - 1] = 0;
               field1524[++class272.field1912 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            class518 var5;
            int var11;
            if (var0 == 6506) {
               var4 = field1537[--class41.field341];
               var5 = null;

               for(var11 = 0; var11 < class518.field4147; ++var11) {
                  if (var4 == class27.field263[var11].field4146) {
                     var5 = class27.field263[var11];
                     break;
                  }
               }

               if (var5 != null) {
                  field1537[++class41.field341 - 1] = var5.field4146;
                  field1537[++class41.field341 - 1] = var5.field4142;
                  field1524[++class272.field1912 - 1] = var5.field4150;
                  field1537[++class41.field341 - 1] = var5.field4151;
                  field1537[++class41.field341 - 1] = var5.field4148;
                  field1524[++class272.field1912 - 1] = var5.field4149;
               } else {
                  field1537[++class41.field341 - 1] = -1;
                  field1537[++class41.field341 - 1] = 0;
                  field1524[++class272.field1912 - 1] = "";
                  field1537[++class41.field341 - 1] = 0;
                  field1537[++class41.field341 - 1] = 0;
                  field1524[++class272.field1912 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class41.field341 -= 4;
               var4 = field1537[class41.field341];
               boolean var10 = 1 == field1537[class41.field341 + 1];
               var11 = field1537[class41.field341 + 2];
               boolean var7 = 1 == field1537[class41.field341 + 3];
               class518.method2496(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  Client.field1274 = field1537[--class41.field341] == 1;
                  return 1;
               } else {
                  class58 var6;
                  int var8;
                  if (var0 == 6513) {
                     class41.field341 -= 2;
                     var4 = field1537[class41.field341];
                     var8 = field1537[1 + class41.field341];
                     var6 = class58.method253(var8);
                     if (var6.method250()) {
                        field1524[++class272.field1912 - 1] = class90.method359(var4).method356(var8, var6.field467);
                     } else {
                        field1537[++class41.field341 - 1] = class90.method359(var4).method358(var8, var6.field463);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class41.field341 -= 2;
                     var4 = field1537[class41.field341];
                     var8 = field1537[class41.field341 + 1];
                     var6 = class58.method253(var8);
                     if (var6.method250()) {
                        field1524[++class272.field1912 - 1] = class430.method2004(var4, (byte)-25).method2157(var8, var6.field467);
                     } else {
                        field1537[++class41.field341 - 1] = class430.method2004(var4, (byte)32).method2156(var8, var6.field463);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class41.field341 -= 2;
                     var4 = field1537[class41.field341];
                     var8 = field1537[1 + class41.field341];
                     var6 = class58.method253(var8);
                     if (var6.method250()) {
                        field1524[++class272.field1912 - 1] = class47.method213(var4).method195(var8, var6.field467);
                     } else {
                        field1537[++class41.field341 - 1] = class47.method213(var4).method204(var8, var6.field463);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class41.field341 -= 2;
                     var4 = field1537[class41.field341];
                     var8 = field1537[1 + class41.field341];
                     var6 = class58.method253(var8);
                     if (var6.method250()) {
                        field1524[++class272.field1912 - 1] = class235.method1155(var4).method1153(var8, var6.field467);
                     } else {
                        field1537[++class41.field341 - 1] = class235.method1155(var4).method1152(var8, var6.field463);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     field1537[++class41.field341 - 1] = Client.field1351 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     field1537[++class41.field341 - 1] = Client.field1122;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class272.field1912;
                     --class41.field341;
                     return 1;
                  } else if (var0 == 6523) {
                     --class272.field1912;
                     --class41.field341;
                     return 1;
                  } else if (var0 == 6524) {
                     field1537[++class41.field341 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     field1537[++class41.field341 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     field1537[++class41.field341 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     field1537[++class41.field341 - 1] = Client.field1134;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = field1537[--class41.field341];
               if (var4 >= 0 && var4 < class518.field4147) {
                  var5 = class27.field263[var4];
                  field1537[++class41.field341 - 1] = var5.field4146;
                  field1537[++class41.field341 - 1] = var5.field4142;
                  field1524[++class272.field1912 - 1] = var5.field4150;
                  field1537[++class41.field341 - 1] = var5.field4151;
                  field1537[++class41.field341 - 1] = var5.field4148;
                  field1524[++class272.field1912 - 1] = var5.field4149;
               } else {
                  field1537[++class41.field341 - 1] = -1;
                  field1537[++class41.field341 - 1] = 0;
                  field1524[++class272.field1912 - 1] = "";
                  field1537[++class41.field341 - 1] = 0;
                  field1537[++class41.field341 - 1] = 0;
                  field1524[++class272.field1912 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   static int method999(int var0, class283 var1, boolean var2) {
      int var4;
      if (var0 == 6600) {
         var4 = class156.field980;
         int var17 = class36.field314 + (class266.field1874.field3403 >> 7);
         int var13 = (class266.field1874.field3374 >> 7) + class525.field4175;
         Client.method871().method417(var4, var17, var13, true);
         return 1;
      } else {
         class456 var8;
         if (var0 == 6601) {
            var4 = field1537[--class41.field341];
            String var16 = "";
            var8 = Client.method871().method456(var4);
            if (var8 != null) {
               var16 = var8.method2122();
            }

            field1524[++class272.field1912 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var4 = field1537[--class41.field341];
            Client.method871().method421(var4);
            return 1;
         } else if (var0 == 6603) {
            field1537[++class41.field341 - 1] = Client.method871().method432();
            return 1;
         } else if (var0 == 6604) {
            var4 = field1537[--class41.field341];
            Client.method871().method430(var4);
            return 1;
         } else if (var0 == 6605) {
            field1537[++class41.field341 - 1] = Client.method871().method462() ? 1 : 0;
            return 1;
         } else {
            class113 var15;
            if (var0 == 6606) {
               var15 = new class113(field1537[--class41.field341]);
               Client.method871().method434(var15.field726, var15.field728);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class113(field1537[--class41.field341]);
               Client.method871().method435(var15.field726, var15.field728);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class113(field1537[--class41.field341]);
               Client.method871().method436(var15.field727, var15.field726, var15.field728);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class113(field1537[--class41.field341]);
               Client.method871().method437(var15.field727, var15.field726, var15.field728);
               return 1;
            } else if (var0 == 6610) {
               field1537[++class41.field341 - 1] = Client.method871().method438();
               field1537[++class41.field341 - 1] = Client.method871().method461();
               return 1;
            } else {
               class456 var12;
               if (var0 == 6611) {
                  var4 = field1537[--class41.field341];
                  var12 = Client.method871().method456(var4);
                  if (var12 == null) {
                     field1537[++class41.field341 - 1] = 0;
                  } else {
                     field1537[++class41.field341 - 1] = var12.method2130().method403();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = field1537[--class41.field341];
                  var12 = Client.method871().method456(var4);
                  if (null == var12) {
                     field1537[++class41.field341 - 1] = 0;
                     field1537[++class41.field341 - 1] = 0;
                  } else {
                     field1537[++class41.field341 - 1] = (var12.method2136() - var12.method2125() + 1) * 64;
                     field1537[++class41.field341 - 1] = (var12.method2132() - var12.method2134() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = field1537[--class41.field341];
                  var12 = Client.method871().method456(var4);
                  if (var12 == null) {
                     field1537[++class41.field341 - 1] = 0;
                     field1537[++class41.field341 - 1] = 0;
                     field1537[++class41.field341 - 1] = 0;
                     field1537[++class41.field341 - 1] = 0;
                  } else {
                     field1537[++class41.field341 - 1] = var12.method2125() * 64;
                     field1537[++class41.field341 - 1] = var12.method2134() * 64;
                     field1537[++class41.field341 - 1] = var12.method2136() * 64 + 64 - 1;
                     field1537[++class41.field341 - 1] = var12.method2132() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = field1537[--class41.field341];
                  var12 = Client.method871().method456(var4);
                  if (null == var12) {
                     field1537[++class41.field341 - 1] = -1;
                  } else {
                     field1537[++class41.field341 - 1] = var12.method2124();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = Client.method871().method418();
                  if (null == var15) {
                     field1537[++class41.field341 - 1] = -1;
                     field1537[++class41.field341 - 1] = -1;
                  } else {
                     field1537[++class41.field341 - 1] = var15.field726;
                     field1537[++class41.field341 - 1] = var15.field728;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  field1537[++class41.field341 - 1] = Client.method871().method422();
                  return 1;
               } else if (var0 == 6617) {
                  var15 = new class113(field1537[--class41.field341]);
                  var12 = Client.method871().method423();
                  if (null == var12) {
                     field1537[++class41.field341 - 1] = -1;
                     field1537[++class41.field341 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.method2131(var15.field727, var15.field726, var15.field728);
                     if (var11 == null) {
                        field1537[++class41.field341 - 1] = -1;
                        field1537[++class41.field341 - 1] = -1;
                     } else {
                        field1537[++class41.field341 - 1] = var11[0];
                        field1537[++class41.field341 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  class113 var6;
                  if (var0 == 6618) {
                     var15 = new class113(field1537[--class41.field341]);
                     var12 = Client.method871().method423();
                     if (var12 == null) {
                        field1537[++class41.field341 - 1] = -1;
                        field1537[++class41.field341 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.method2119(var15.field726, var15.field728);
                        if (var6 == null) {
                           field1537[++class41.field341 - 1] = -1;
                        } else {
                           field1537[++class41.field341 - 1] = var6.method403();
                        }

                        return 1;
                     }
                  } else {
                     class113 var9;
                     if (var0 == 6619) {
                        class41.field341 -= 2;
                        var4 = field1537[class41.field341];
                        var9 = new class113(field1537[1 + class41.field341]);
                        class262.method1208(var4, var9, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class41.field341 -= 2;
                        var4 = field1537[class41.field341];
                        var9 = new class113(field1537[1 + class41.field341]);
                        class262.method1208(var4, var9, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class41.field341 -= 2;
                        var4 = field1537[class41.field341];
                        var9 = new class113(field1537[class41.field341 + 1]);
                        var8 = Client.method871().method456(var4);
                        if (null == var8) {
                           field1537[++class41.field341 - 1] = 0;
                           return 1;
                        } else {
                           field1537[++class41.field341 - 1] = var8.method2118(var9.field727, var9.field726, var9.field728) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        field1537[++class41.field341 - 1] = Client.method871().method440();
                        field1537[++class41.field341 - 1] = Client.method871().method441();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new class113(field1537[--class41.field341]);
                        var12 = Client.method871().method419(var15.field727, var15.field726, var15.field728);
                        if (null == var12) {
                           field1537[++class41.field341 - 1] = -1;
                        } else {
                           field1537[++class41.field341 - 1] = var12.method2127();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        Client.method871().method442(field1537[--class41.field341]);
                        return 1;
                     } else if (var0 == 6625) {
                        Client.method871().method443();
                        return 1;
                     } else if (var0 == 6626) {
                        Client.method871().method444(field1537[--class41.field341]);
                        return 1;
                     } else if (var0 == 6627) {
                        Client.method871().method445();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = field1537[--class41.field341] == 1;
                           Client.method871().method446(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = field1537[--class41.field341];
                           Client.method871().method428(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = field1537[--class41.field341];
                           Client.method871().method447(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           Client.method871().method448();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = field1537[--class41.field341] == 1;
                           Client.method871().method449(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (var0 == 6633) {
                              class41.field341 -= 2;
                              var4 = field1537[class41.field341];
                              var10 = 1 == field1537[class41.field341 + 1];
                              Client.method871().method457(var4, var10);
                              return 1;
                           } else if (var0 == 6634) {
                              class41.field341 -= 2;
                              var4 = field1537[class41.field341];
                              var10 = field1537[class41.field341 + 1] == 1;
                              Client.method871().method420(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              field1537[++class41.field341 - 1] = Client.method871().method450() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = field1537[--class41.field341];
                              field1537[++class41.field341 - 1] = Client.method871().method466(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = field1537[--class41.field341];
                              field1537[++class41.field341 - 1] = Client.method871().method451(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class41.field341 -= 2;
                              var4 = field1537[class41.field341];
                              var9 = new class113(field1537[1 + class41.field341]);
                              var6 = Client.method871().method454(var4, var9);
                              if (null == var6) {
                                 field1537[++class41.field341 - 1] = -1;
                              } else {
                                 field1537[++class41.field341 - 1] = var6.method403();
                              }

                              return 1;
                           } else {
                              class368 var7;
                              if (var0 == 6639) {
                                 var7 = Client.method871().method413();
                                 if (null == var7) {
                                    field1537[++class41.field341 - 1] = -1;
                                    field1537[++class41.field341 - 1] = -1;
                                 } else {
                                    field1537[++class41.field341 - 1] = var7.method1720();
                                    field1537[++class41.field341 - 1] = var7.field2659.method403();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = Client.method871().method455();
                                 if (null == var7) {
                                    field1537[++class41.field341 - 1] = -1;
                                    field1537[++class41.field341 - 1] = -1;
                                 } else {
                                    field1537[++class41.field341 - 1] = var7.method1720();
                                    field1537[++class41.field341 - 1] = var7.field2659.method403();
                                 }

                                 return 1;
                              } else {
                                 class430 var5;
                                 if (var0 == 6693) {
                                    var4 = field1537[--class41.field341];
                                    var5 = class430.method2005(var4);
                                    if (null == var5.field3348) {
                                       field1524[++class272.field1912 - 1] = "";
                                    } else {
                                       field1524[++class272.field1912 - 1] = var5.field3348;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = field1537[--class41.field341];
                                    var5 = class430.method2005(var4);
                                    field1537[++class41.field341 - 1] = var5.field3350;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = field1537[--class41.field341];
                                    var5 = class430.method2005(var4);
                                    if (var5 == null) {
                                       field1537[++class41.field341 - 1] = -1;
                                    } else {
                                       field1537[++class41.field341 - 1] = var5.field3363;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = field1537[--class41.field341];
                                    var5 = class430.method2005(var4);
                                    if (var5 == null) {
                                       field1537[++class41.field341 - 1] = -1;
                                    } else {
                                       field1537[++class41.field341 - 1] = var5.field3346;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    field1537[++class41.field341 - 1] = class241.field1761.field1511;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    field1537[++class41.field341 - 1] = class241.field1761.field1509.method403();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    field1537[++class41.field341 - 1] = class241.field1761.field1510.method403();
                                    return 1;
                                 } else {
                                    return 2;
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

   static int method1014(int var0, class283 var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = field1537[--class41.field341];
         class90 var7 = class90.method359(var6);
         field1524[++class272.field1912 - 1] = null != var7 ? var7.field616 : "";
         return 1;
      } else {
         class90 var4;
         if (var0 == 6764) {
            class41.field341 -= 2;
            var4 = class90.method359(field1537[class41.field341]);
            int var5 = field1537[class41.field341 + 1];
            field1537[++class41.field341 - 1] = var4.method350(var5);
            field1537[++class41.field341 - 1] = var4.method355(var5);
            return 1;
         } else if (var0 == 6765) {
            var4 = class90.method359(field1537[--class41.field341]);
            field1537[++class41.field341 - 1] = null != var4 ? var4.field640 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static int method1029(int var0, class283 var1, boolean var2) {
      if (var0 == 6809) {
         int var4 = field1537[--class41.field341];
         class458 var5 = class430.method2004(var4, (byte)104);
         field1524[++class272.field1912 - 1] = null != var5 ? var5.field3605 : "";
         return 1;
      } else {
         return 2;
      }
   }

   static int method1008(int var0, class283 var1, boolean var2) {
      return 2;
   }

   static int method1002(int var0, class283 var1, boolean var2) {
      return 2;
   }

   static int method1017(int var0, class283 var1, boolean var2) {
      if (var0 == 7108) {
         field1537[++class41.field341 - 1] = Client.method931() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1024(int var0, class283 var1, boolean var2) {
      return 2;
   }

   static int method1004(int var0, class283 var1, boolean var2) {
      int var4;
      Object var5;
      int var6;
      class522 var7;
      int var8;
      if (var0 != 7500 && var0 != 7508) {
         if (var0 != 7501) {
            int var21;
            int var23;
            if (var0 == 7502) {
               class41.field341 -= 3;
               var4 = field1537[class41.field341];
               var21 = field1537[1 + class41.field341];
               var6 = field1537[class41.field341 + 2];
               var23 = class211.method1092(var21);
               var8 = class211.method1093(var21);
               int var25 = class211.method1094(var21);
               class537 var26 = class537.method2579(var4);
               class449 var27 = class449.method2098(var23);
               int[] var28 = var27.field3550[var8];
               int var13 = 0;
               int var14 = var28.length;
               if (var25 >= 0) {
                  if (var25 >= var14) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                  }

                  var13 = var25;
                  var14 = var25 + 1;
               }

               Object[] var15 = var26.method2576(var8);
               if (null == var15 && null != var27.field3551) {
                  var15 = var27.field3551[var8];
               }

               int var16;
               int var17;
               if (null == var15) {
                  for(var16 = var13; var16 < var14; ++var16) {
                     var17 = var28[var16];
                     class377 var29 = class381.method1758(var17);
                     if (var29 == class377.field2690) {
                        field1524[++class272.field1912 - 1] = "";
                     } else {
                        field1537[++class41.field341 - 1] = class381.method1757(var17);
                     }
                  }

                  return 1;
               } else {
                  var16 = var15.length / var28.length;
                  if (var6 >= 0 && var6 < var16) {
                     for(var17 = var13; var17 < var14; ++var17) {
                        int var18 = var17 + var28.length * var6;
                        class377 var19 = class381.method1758(var28[var17]);
                        if (var19 == class377.field2690) {
                           field1524[++class272.field1912 - 1] = (String)var15[var18];
                        } else {
                           field1537[++class41.field341 - 1] = (Integer)var15[var18];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == 7503) {
               class41.field341 -= 2;
               var4 = field1537[class41.field341];
               var21 = field1537[1 + class41.field341];
               var6 = 0;
               var23 = class211.method1092(var21);
               var8 = class211.method1093(var21);
               class537 var24 = class537.method2579(var4);
               class449 var10 = class449.method2098(var23);
               int[] var11 = var10.field3550[var8];
               Object[] var12 = var24.method2576(var8);
               if (null == var12 && null != var10.field3551) {
                  var12 = var10.field3551[var8];
               }

               if (null != var12) {
                  var6 = var12.length / var11.length;
               }

               field1537[++class41.field341 - 1] = var6;
               return 1;
            } else if (var0 != 7504 && var0 != 7510) {
               if (var0 == 7505) {
                  var4 = field1537[--class41.field341];
                  class537 var22 = class537.method2579(var4);
                  field1537[++class41.field341 - 1] = var22.field4281;
                  return 1;
               } else if (var0 == 7506) {
                  var4 = field1537[--class41.field341];
                  var21 = -1;
                  if (null != class333.field2505 && var4 >= 0 && var4 < class333.field2505.size()) {
                     var21 = (Integer)class333.field2505.get(var4);
                  }

                  field1537[++class41.field341 - 1] = var21;
                  return 1;
               } else if (var0 != 7507 && var0 != 7509) {
                  return 2;
               } else {
                  var4 = field1537[--class41.field341];
                  var5 = method1032(var4);
                  var6 = field1537[--class41.field341];
                  var7 = Client.method911(var6);
                  if (var7 == null) {
                     throw new RuntimeException();
                  } else if (class211.method1092(var6) != Client.field1410) {
                     throw new RuntimeException();
                  } else if (null == class333.field2505 && class333.field2505.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var8 = class211.method1094(var6);
                     List var9 = var7.method2508(var5, var8);
                     class333.field2505 = new LinkedList(class333.field2505);
                     if (var9 != null) {
                        class333.field2505.retainAll(var9);
                     } else {
                        class333.field2505.clear();
                     }

                     class399.field2776 = class333.field2505.iterator();
                     if (var0 == 7507) {
                        field1537[++class41.field341 - 1] = class333.field2505.size();
                     }

                     return 1;
                  }
               }
            } else {
               --class41.field341;
               var4 = field1537[class41.field341];
               class522 var20 = Client.method930(var4);
               if (var20 == null) {
                  throw new RuntimeException();
               } else {
                  class333.field2505 = var20.method2508(0, 0);
                  var6 = 0;
                  if (class333.field2505 != null) {
                     Client.field1410 = var4;
                     class399.field2776 = class333.field2505.iterator();
                     var6 = class333.field2505.size();
                  }

                  if (var0 == 7504) {
                     field1537[++class41.field341 - 1] = var6;
                  }

                  return 1;
               }
            }
         } else {
            if (class399.field2776 != null && class399.field2776.hasNext()) {
               field1537[++class41.field341 - 1] = (Integer)class399.field2776.next();
            } else {
               field1537[++class41.field341 - 1] = -1;
            }

            return 1;
         }
      } else {
         var4 = field1537[--class41.field341];
         var5 = method1032(var4);
         var6 = field1537[--class41.field341];
         var7 = Client.method911(var6);
         if (null == var7) {
            throw new RuntimeException();
         } else {
            var8 = class211.method1094(var6);
            class333.field2505 = var7.method2508(var5, var8);
            if (null != class333.field2505) {
               Client.field1410 = class211.method1092(var6);
               class399.field2776 = class333.field2505.iterator();
               if (var0 == 7500) {
                  field1537[++class41.field341 - 1] = class333.field2505.size();
               }
            } else {
               Client.field1410 = -1;
               class399.field2776 = null;
               if (var0 == 7500) {
                  field1537[++class41.field341 - 1] = 0;
               }
            }

            return 1;
         }
      }
   }

   static int method1025(int var0, class283 var1, boolean var2) {
      return 2;
   }

   static int method1030(int var0, class283 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 8000) {
         --class41.field341;
         var4 = field1537[class41.field341];
         var5 = field1526[var4];
         class134.method492(field1528[var4], new int[var5], 0, var5 - 1);
         return 1;
      } else if (var0 == 8001) {
         class41.field341 -= 3;
         var4 = field1537[class41.field341];
         var5 = field1537[1 + class41.field341];
         int var6 = field1537[2 + class41.field341];
         int var7 = field1526[var4];
         if (var7 <= 1) {
            return 1;
         } else {
            class6.method49(field1528[var4], var7, var5, var6);
            return 1;
         }
      } else {
         return 2;
      }
   }

   static void method1031(int var0) {
      if (var0 != -1) {
         if (class322.method1492(var0)) {
            class322[] var2 = class53.field436[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class322 var4 = var2[var3];
               if (null != var4.field2242) {
                  class64 var5 = new class64();
                  var5.field504 = var4;
                  var5.field507 = var4.field2242;
                  class86.method332(var5, 5000000, 0);
               }
            }

         }
      }
   }

   static Object method1028(class377 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field2691) {
            case 1:
               return field1537[--class41.field341];
            case 2:
               return field1524[--class272.field1912];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   static Object method1032(int var0) {
      return method1028((class377)class1.method2(class377.method1745(), var0));
   }
}
