import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class class18 {
   static boolean field195 = false;
   static boolean field201 = false;
   static class239[] field190 = new class239[50];
   static int field192 = 0;
   static int field198 = 0;
   static int[] field189 = new int[5];
   static int[] field196;
   static int[] field200 = new int[1000];
   static int[][] field191 = new int[5][5000];
   static String[] field187 = new String[1000];
   static String[] field188;
   static ArrayList field197 = new ArrayList();
   static Calendar field193 = Calendar.getInstance();
   static final double field199 = Math.log(2.0);
   static final String[] field194 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   class18() throws Throwable {
   }

   public static void method216(class208 var0) {
      class433.method2129(var0, 500000, 475000);
   }

   static void method201(class208 var0, class106 var1, int var2, int var3) {
      Object[] var5 = var0.field1954;
      class482.field3830 = 0;
      class495.field3920 = 0;
      int var6 = -1;
      int[] var7 = var1.field1421;
      int[] var8 = var1.field1422;
      int var9 = -1;
      field192 = 0;
      field201 = false;
      boolean var10 = false;
      int var11 = 0;
      boolean var23 = false;

      label860: {
         label861: {
            try {
               int var14;
               try {
                  var23 = true;
                  class10.field108 = new int[var1.field1424];
                  int var12 = 0;
                  field188 = new String[var1.field1428];
                  int var27 = 0;

                  int var15;
                  String var37;
                  for(var14 = 1; var14 < var5.length; ++var14) {
                     if (var5[var14] instanceof Integer) {
                        var15 = (Integer)var5[var14];
                        if (var15 == -2147483647) {
                           var15 = var0.field1952;
                        }

                        if (var15 == -2147483646) {
                           var15 = var0.field1955;
                        }

                        if (var15 == -2147483645) {
                           var15 = var0.field1951 != null ? var0.field1951.field3674 : -1;
                        }

                        if (var15 == -2147483644) {
                           var15 = var0.field1956;
                        }

                        if (var15 == -2147483643) {
                           var15 = var0.field1951 != null ? -1714711969 * var0.field1951.field3793 * 1628260767 : -1;
                        }

                        if (var15 == -2147483642) {
                           var15 = var0.field1957 != null ? var0.field1957.field3674 : -1;
                        }

                        if (var15 == -2147483641) {
                           var15 = null != var0.field1957 ? -1714711969 * var0.field1957.field3793 * 1628260767 : -1;
                        }

                        if (var15 == -2147483640) {
                           var15 = var0.field1953;
                        }

                        if (var15 == -2147483639) {
                           var15 = var0.field1959;
                        }

                        class10.field108[var12++] = var15;
                     } else if (var5[var14] instanceof String) {
                        var37 = (String)var5[var14];
                        if (var37.equals("event_opbase")) {
                           var37 = var0.field1960;
                        }

                        field188[var27++] = var37;
                     }
                  }

                  field198 = var0.field1961;

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
                        if (var1.field1422[var6] == 1) {
                           var36 = true;
                        } else {
                           var36 = false;
                        }

                        var15 = method196(var9, var1, var36);
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
                        field200[++class482.field3830 - 1] = var8[var6];
                     } else if (var9 == 1) {
                        var14 = var8[var6];
                        field200[++class482.field3830 - 1] = class10.field107[var14];
                     } else if (var9 == 2) {
                        var14 = var8[var6];
                        class10.field107[var14] = field200[--class482.field3830];
                        Client.method507(var14);
                     } else if (var9 == 3) {
                        field187[++class495.field3920 - 1] = var1.field1423[var6];
                     } else if (var9 == 6) {
                        var6 += var8[var6];
                     } else if (var9 == 7) {
                        class482.field3830 -= 2;
                        if (field200[class482.field3830] != field200[1 + class482.field3830]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 8) {
                        class482.field3830 -= 2;
                        if (field200[class482.field3830] == field200[class482.field3830 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 9) {
                        class482.field3830 -= 2;
                        if (field200[class482.field3830] < field200[class482.field3830 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 10) {
                        class482.field3830 -= 2;
                        if (field200[class482.field3830] > field200[class482.field3830 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 21) {
                        if (field192 == 0) {
                           var23 = false;
                           break label861;
                        }

                        class239 var35 = field190[--field192];
                        var1 = var35.field2186;
                        var7 = var1.field1421;
                        var8 = var1.field1422;
                        var6 = var35.field2189;
                        class10.field108 = var35.field2187;
                        field188 = var35.field2188;
                     } else if (var9 == 25) {
                        var14 = var8[var6];
                        field200[++class482.field3830 - 1] = class10.method123(var14);
                     } else if (var9 == 27) {
                        var14 = var8[var6];
                        class488.method2380(var14, field200[--class482.field3830]);
                     } else if (var9 == 31) {
                        class482.field3830 -= 2;
                        if (field200[class482.field3830] <= field200[class482.field3830 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 32) {
                        class482.field3830 -= 2;
                        if (field200[class482.field3830] >= field200[class482.field3830 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 33) {
                        field200[++class482.field3830 - 1] = class10.field108[var8[var6]];
                     } else if (var9 == 34) {
                        class10.field108[var8[var6]] = field200[--class482.field3830];
                     } else if (var9 == 35) {
                        field187[++class495.field3920 - 1] = field188[var8[var6]];
                     } else if (var9 == 36) {
                        field188[var8[var6]] = field187[--class495.field3920];
                     } else if (var9 == 37) {
                        var14 = var8[var6];
                        class495.field3920 -= var14;
                        var37 = class330.method1745(field187, class495.field3920, var14);
                        field187[++class495.field3920 - 1] = var37;
                     } else if (var9 == 38) {
                        --class482.field3830;
                     } else if (var9 == 39) {
                        --class495.field3920;
                     } else {
                        int var18;
                        if (var9 != 40) {
                           if (var9 == 42) {
                              field200[++class482.field3830 - 1] = class113.field1463.method1715(var8[var6]);
                           } else if (var9 == 43) {
                              class113.field1463.method1726(var8[var6], field200[--class482.field3830]);
                           } else if (var9 == 44) {
                              var14 = var8[var6] >> 16;
                              var15 = var8[var6] & '\uffff';
                              int var28 = field200[--class482.field3830];
                              if (var28 < 0 || var28 > 5000) {
                                 throw new RuntimeException();
                              }

                              field189[var14] = var28;
                              byte var31 = -1;
                              if (var15 == 105) {
                                 var31 = 0;
                              }

                              for(var18 = 0; var18 < var28; ++var18) {
                                 field191[var14][var18] = var31;
                              }
                           } else if (var9 == 45) {
                              var14 = var8[var6];
                              var15 = field200[--class482.field3830];
                              if (var15 < 0 || var15 >= field189[var14]) {
                                 throw new RuntimeException();
                              }

                              field200[++class482.field3830 - 1] = field191[var14][var15];
                           } else if (var9 == 46) {
                              var14 = var8[var6];
                              class482.field3830 -= 2;
                              var15 = field200[class482.field3830];
                              if (var15 < 0 || var15 >= field189[var14]) {
                                 throw new RuntimeException();
                              }

                              field191[var14][var15] = field200[1 + class482.field3830];
                           } else {
                              String var29;
                              if (var9 == 47) {
                                 var29 = class113.field1463.method1717(var8[var6]);
                                 if (var29 == null) {
                                    var29 = class27.field544;
                                 }

                                 field187[++class495.field3920 - 1] = var29;
                              } else if (var9 == 48) {
                                 class113.field1463.method1722(var8[var6], field187[--class495.field3920]);
                              } else if (var9 == 49) {
                                 var29 = class113.field1463.method1716(var8[var6]);
                                 field187[++class495.field3920 - 1] = var29;
                              } else if (var9 == 50) {
                                 class113.field1463.method1723(var8[var6], field187[--class495.field3920]);
                              } else if (var9 == 60) {
                                 class197 var32 = var1.field1429[var8[var6]];
                                 class118 var40 = (class118)var32.method1222((long)field200[--class482.field3830]);
                                 if (var40 != null) {
                                    var6 += var40.field1481;
                                 }
                              } else {
                                 Integer var33;
                                 if (var9 == 74) {
                                    var33 = class393.field3080.method145(var8[var6]);
                                    if (var33 == null) {
                                       field200[++class482.field3830 - 1] = -1;
                                    } else {
                                       field200[++class482.field3830 - 1] = var33;
                                    }
                                 } else {
                                    if (var9 != 76) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = class158.field1687.method2490(var8[var6]);
                                    if (var33 == null) {
                                       field200[++class482.field3830 - 1] = -1;
                                    } else {
                                       field200[++class482.field3830 - 1] = var33;
                                    }
                                 }
                              }
                           }
                        } else {
                           var14 = var8[var6];
                           class106 var39 = class106.method793(var14);
                           int[] var16 = new int[var39.field1424];
                           String[] var17 = new String[var39.field1428];

                           for(var18 = 0; var18 < var39.field1426; ++var18) {
                              var16[var18] = field200[class482.field3830 - var39.field1426 + var18];
                           }

                           for(var18 = 0; var18 < var39.field1427; ++var18) {
                              var17[var18] = field187[class495.field3920 - var39.field1427 + var18];
                           }

                           class482.field3830 -= var39.field1426;
                           class495.field3920 -= var39.field1427;
                           class239 var34 = new class239();
                           var34.field2186 = var1;
                           var34.field2189 = var6;
                           var34.field2187 = class10.field108;
                           var34.field2188 = field188;
                           field190[++field192 - 1] = var34;
                           var1 = var39;
                           var7 = var39.field1421;
                           var8 = var39.field1422;
                           var6 = -1;
                           class10.field108 = var16;
                           field188 = var17;
                        }
                     }
                  }
               } catch (Exception var24) {
                  var10 = true;
                  StringBuilder var13 = new StringBuilder(30);
                  var13.append("").append(var1.field1078).append(" ");

                  for(var14 = field192 - 1; var14 >= 0; --var14) {
                     var13.append("").append(field190[var14].field2186.field1078).append(" ");
                  }

                  var13.append("").append(var9);
                  class194.method1208(var13.toString(), var24);
                  var23 = false;
                  break label860;
               }
            } finally {
               if (var23) {
                  while(field197.size() > 0) {
                     class291 var20 = (class291)field197.remove(0);
                     Client.method414(var20.method1610(), var20.method1611(), var20.method1609(), var20.method1608(), "");
                  }

                  if (field201) {
                     field201 = false;
                     Client.method502();
                  }

                  if (!var10 && var3 > 0 && var11 >= var3) {
                     class194.method1208("Warning: Script " + var1.field1425 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
                  }

               }
            }

            while(field197.size() > 0) {
               class291 var30 = (class291)field197.remove(0);
               Client.method414(var30.method1610(), var30.method1611(), var30.method1609(), var30.method1608(), "");
            }

            if (field201) {
               field201 = false;
               Client.method502();
            }

            if (!var10 && var3 > 0 && var11 >= var3) {
               class194.method1208("Warning: Script " + var1.field1425 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
            }

            return;
         }

         while(field197.size() > 0) {
            class291 var38 = (class291)field197.remove(0);
            Client.method414(var38.method1610(), var38.method1611(), var38.method1609(), var38.method1608(), "");
         }

         if (field201) {
            field201 = false;
            Client.method502();
         }

         if (!var10 && var3 > 0 && var11 >= var3) {
            class194.method1208("Warning: Script " + var1.field1425 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
         }

         return;
      }

      while(field197.size() > 0) {
         class291 var26 = (class291)field197.remove(0);
         Client.method414(var26.method1610(), var26.method1611(), var26.method1609(), var26.method1608(), "");
      }

      if (field201) {
         field201 = false;
         Client.method502();
      }

      if (!var10 && var3 > 0 && var11 >= var3) {
         class194.method1208("Warning: Script " + var1.field1425 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
      }

   }

   static int method196(int var0, class106 var1, boolean var2) {
      if (var0 < 1000) {
         return method212(var0, var1, var2);
      } else if (var0 < 1100) {
         return method184(var0, var1, var2);
      } else if (var0 < 1200) {
         return method194(var0, var1, var2);
      } else if (var0 < 1300) {
         return method193(var0, var1, var2);
      } else if (var0 < 1400) {
         return method179(var0, var1, var2);
      } else if (var0 < 1500) {
         return method204(var0, var1, var2);
      } else if (var0 < 1600) {
         return method200(var0, var1, var2);
      } else if (var0 < 1700) {
         return method214(var0, var1, var2);
      } else if (var0 < 1800) {
         return class50.method599(var0, var1, var2);
      } else if (var0 < 1900) {
         return method185(var0, var1, var2);
      } else if (var0 < 2000) {
         return method228(var0, var1, var2);
      } else if (var0 < 2100) {
         return method184(var0, var1, var2);
      } else if (var0 < 2200) {
         return method194(var0, var1, var2);
      } else if (var0 < 2300) {
         return method193(var0, var1, var2);
      } else if (var0 < 2400) {
         return method179(var0, var1, var2);
      } else if (var0 < 2500) {
         return method204(var0, var1, var2);
      } else if (var0 < 2600) {
         return method188(var0, var1, var2);
      } else if (var0 < 2700) {
         return method222(var0, var1, var2);
      } else if (var0 < 2800) {
         return method218(var0, var1, var2);
      } else if (var0 < 2900) {
         return method190(var0, var1, var2);
      } else if (var0 < 3000) {
         return method228(var0, var1, var2);
      } else if (var0 < 3200) {
         return method225(var0, var1, var2);
      } else if (var0 < 3300) {
         return method215(var0, var1, var2);
      } else if (var0 < 3400) {
         return class341.method1787(var0, var1, var2, (byte)-1);
      } else if (var0 < 3500) {
         return method224(var0, var1, var2);
      } else if (var0 < 3600) {
         return method211(var0, var1, var2);
      } else if (var0 < 3700) {
         return method178(var0, var1, var2);
      } else if (var0 < 3800) {
         return method181(var0, var1, var2);
      } else if (var0 < 3900) {
         return method183(var0, var1, var2);
      } else if (var0 < 4000) {
         return method219(var0, var1, var2);
      } else if (var0 < 4100) {
         return method220(var0, var1, var2);
      } else if (var0 < 4200) {
         return method187(var0, var1, var2);
      } else if (var0 < 4300) {
         return method189(var0, var1, var2);
      } else if (var0 < 5100) {
         return method221(var0, var1, var2);
      } else if (var0 < 5400) {
         return method205(var0, var1, var2);
      } else if (var0 < 5600) {
         return method226(var0, var1, var2);
      } else if (var0 < 5700) {
         return method176(var0, var1, var2);
      } else if (var0 < 6300) {
         return class492.method2388(var0, var1, var2);
      } else if (var0 < 6600) {
         return method199(var0, var1, var2);
      } else if (var0 < 6700) {
         return method177(var0, var1, var2);
      } else if (var0 < 6800) {
         return method192(var0, var1, var2);
      } else if (var0 < 6900) {
         return method207(var0, var1, var2);
      } else if (var0 < 7000) {
         return method186(var0, var1, var2);
      } else if (var0 < 7100) {
         return method180(var0, var1, var2);
      } else if (var0 < 7200) {
         return method195(var0, var1, var2);
      } else if (var0 < 7300) {
         return method202(var0, var1, var2);
      } else if (var0 < 7500) {
         return class49.method597(var0, var1, var2);
      } else if (var0 < 7600) {
         return method182(var0, var1, var2);
      } else if (var0 < 7700) {
         return method203(var0, var1, var2);
      } else {
         return var0 < 8100 ? method208(var0, var1, var2) : 2;
      }
   }

   static int method212(int var0, class106 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         class482.field3830 -= 3;
         var4 = field200[class482.field3830];
         var5 = field200[class482.field3830 + 1];
         int var12 = field200[2 + class482.field3830];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            class480 var7 = class480.method2355(var4);
            if (null == var7.field3806) {
               var7.field3806 = new class480[var12 + 1];
            }

            if (var7.field3806.length <= var12) {
               class480[] var8 = new class480[var12 + 1];

               for(int var9 = 0; var9 < var7.field3806.length; ++var9) {
                  var8[var9] = var7.field3806[var9];
               }

               var7.field3806 = var8;
            }

            if (var12 > 0 && var7.field3806[var12 - 1] == null) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               class480 var13 = new class480();
               var13.field3676 = var5;
               var13.field3691 = var13.field3674 = var7.field3674;
               var13.field3793 = var12;
               var13.field3754 = true;
               if (var5 == 12) {
                  var13.method2335();
                  var13.method2350().method305(new class178(var13));
                  var13.method2350().method304(new class523(var13));
               }

               var7.field3806[var12] = var13;
               if (var2) {
                  class154.field1646 = var13;
               } else {
                  class273.field2334 = var13;
               }

               Client.method485(var7);
               return 1;
            }
         }
      } else {
         class480 var10;
         if (var0 == 101) {
            var10 = var2 ? class154.field1646 : class273.field2334;
            class480 var11 = class480.method2355(var10.field3674);
            var11.field3806[var10.field3793] = null;
            Client.method485(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class480.method2355(field200[--class482.field3830]);
            var10.field3806 = null;
            Client.method485(var10);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var10 = class480.method2355(field200[--class482.field3830]);
               if (null != var10) {
                  field200[++class482.field3830 - 1] = 1;
                  if (var2) {
                     class154.field1646 = var10;
                  } else {
                     class273.field2334 = var10;
                  }
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class482.field3830 -= 2;
            var4 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            class480 var6 = class480.method2352(var4, var5);
            if (null != var6 && var5 != -1) {
               field200[++class482.field3830 - 1] = 1;
               if (var2) {
                  class154.field1646 = var6;
               } else {
                  class273.field2334 = var6;
               }
            } else {
               field200[++class482.field3830 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method184(int var0, class106 var1, boolean var2) {
      int var4 = -1;
      class480 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = field200[--class482.field3830];
         var5 = class480.method2355(var4);
      } else {
         var5 = var2 ? class154.field1646 : class273.field2334;
      }

      if (var0 == 1000) {
         class482.field3830 -= 4;
         var5.field3683 = field200[class482.field3830];
         var5.field3684 = field200[1 + class482.field3830];
         var5.field3679 = field200[2 + class482.field3830];
         var5.field3680 = field200[3 + class482.field3830];
         Client.method485(var5);
         class191.field1877.method375(var5);
         if (var4 != -1 && var5.field3676 == 0) {
            Client.method424(class335.field2687[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1001) {
         class482.field3830 -= 4;
         var5.field3685 = field200[class482.field3830];
         var5.field3686 = field200[class482.field3830 + 1];
         var5.field3681 = field200[2 + class482.field3830];
         var5.field3682 = field200[class482.field3830 + 3];
         Client.method485(var5);
         class191.field1877.method375(var5);
         if (var4 != -1 && var5.field3676 == 0) {
            Client.method424(class335.field2687[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = field200[--class482.field3830] == 1;
         if (var5.field3692 != var6) {
            var5.field3692 = var6;
            Client.method485(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.field3816 = field200[--class482.field3830] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.field3817 = field200[--class482.field3830] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   static int method194(int var0, class106 var1, boolean var2) {
      int var5 = -1;
      class480 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = field200[--class482.field3830];
         var4 = class480.method2355(var5);
      } else {
         var4 = var2 ? class154.field1646 : class273.field2334;
      }

      int var14;
      if (var0 == 1100) {
         class482.field3830 -= 2;
         var14 = field200[class482.field3830];
         int var11 = field200[1 + class482.field3830];
         if (var4.field3676 == 12) {
            class28 var8 = var4.method2350();
            if (null != var8 && var8.method278(var14, var11)) {
               Client.method485(var4);
            }
         } else {
            var4.field3693 = var14;
            if (var4.field3693 > var4.field3761 - var4.field3689) {
               var4.field3693 = var4.field3761 - var4.field3689;
            }

            if (var4.field3693 < 0) {
               var4.field3693 = 0;
            }

            var4.field3707 = var11;
            if (var4.field3707 > var4.field3696 - var4.field3666) {
               var4.field3707 = var4.field3696 - var4.field3666;
            }

            if (var4.field3707 < 0) {
               var4.field3707 = 0;
            }

            Client.method485(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.field3697 = field200[--class482.field3830];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1102) {
         var4.field3736 = field200[--class482.field3830] == 1;
         Client.method485(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field3695 = field200[--class482.field3830];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.field3705 = field200[--class482.field3830];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1105) {
         var4.field3760 = field200[--class482.field3830];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1106) {
         var4.field3710 = field200[--class482.field3830];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1107) {
         var4.field3711 = field200[--class482.field3830] == 1;
         Client.method485(var4);
         return 1;
      } else if (var0 == 1108) {
         var4.field3716 = 1;
         var4.field3717 = field200[--class482.field3830];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1109) {
         class482.field3830 -= 6;
         var4.field3722 = field200[class482.field3830];
         var4.field3796 = field200[class482.field3830 + 1];
         var4.field3724 = field200[class482.field3830 + 2];
         var4.field3742 = field200[class482.field3830 + 3];
         var4.field3789 = field200[4 + class482.field3830];
         var4.field3727 = field200[class482.field3830 + 5];
         Client.method485(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = field200[--class482.field3830];
         if (var14 != var4.field3720) {
            var4.field3720 = var14;
            var4.field3804 = 0;
            var4.field3805 = 0;
            Client.method485(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.field3747 = field200[--class482.field3830] == 1;
         Client.method485(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = field187[--class495.field3920];
         if (!var15.equals(var4.field3734)) {
            var4.field3734 = var15;
            Client.method485(var4);
         }

         return 1;
      } else {
         class28 var9;
         if (var0 == 1113) {
            var4.field3779 = field200[--class482.field3830];
            if (var4.field3676 == 12) {
               var9 = var4.method2350();
               if (var9 != null) {
                  var9.method282();
               }
            }

            Client.method485(var4);
            return 1;
         } else if (var0 == 1114) {
            class482.field3830 -= 3;
            if (var4.field3676 == 12) {
               var9 = var4.method2350();
               if (null != var9) {
                  var9.method335(field200[class482.field3830], field200[1 + class482.field3830]);
                  var9.method279(field200[2 + class482.field3830]);
               }
            } else {
               var4.field3737 = field200[class482.field3830];
               var4.field3795 = field200[class482.field3830 + 1];
               var4.field3770 = field200[2 + class482.field3830];
            }

            Client.method485(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field3664 = field200[--class482.field3830] == 1;
            Client.method485(var4);
            return 1;
         } else if (var0 == 1116) {
            var4.field3712 = field200[--class482.field3830];
            Client.method485(var4);
            return 1;
         } else if (var0 == 1117) {
            var4.field3713 = field200[--class482.field3830];
            Client.method485(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field3714 = field200[--class482.field3830] == 1;
            Client.method485(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.field3715 = field200[--class482.field3830] == 1;
            Client.method485(var4);
            return 1;
         } else if (var0 == 1120) {
            class482.field3830 -= 2;
            var4.field3761 = field200[class482.field3830];
            var4.field3696 = field200[1 + class482.field3830];
            Client.method485(var4);
            if (var5 != -1 && var4.field3676 == 0) {
               Client.method424(class335.field2687[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            Client.method551(var4.field3674, var4.field3793);
            Client.field753 = var4;
            Client.method485(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field3708 = field200[--class482.field3830];
            Client.method485(var4);
            return 1;
         } else if (var0 == 1123) {
            var4.field3698 = field200[--class482.field3830];
            Client.method485(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field3704 = field200[--class482.field3830];
            Client.method485(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = field200[--class482.field3830];
            class16 var10 = (class16)class341.method1788(class16.method163(), var14);
            if (null != var10) {
               var4.field3702 = var10;
               Client.method485(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = field200[--class482.field3830] == 1;
               var4.field3706 = var12;
               return 1;
            } else if (var0 == 1127) {
               var12 = field200[--class482.field3830] == 1;
               var4.field3732 = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.field3709 = field187[--class495.field3920];
               Client.method485(var4);
               return 1;
            } else if (var0 == 1130) {
               var4.method2348(field187[--class495.field3920], class19.field209, Client.method447());
               return 1;
            } else if (var0 == 1131) {
               class482.field3830 -= 2;
               var4.method2344(field200[class482.field3830], field200[1 + class482.field3830]);
               return 1;
            } else if (var0 == 1132) {
               var4.method2327(field187[--class495.field3920], field200[--class482.field3830]);
               return 1;
            } else {
               class200 var13;
               if (var0 == 1133) {
                  --class482.field3830;
                  var13 = var4.method2336();
                  if (var13 != null) {
                     var13.field1931 = field200[class482.field3830];
                     Client.method485(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --class482.field3830;
                  var13 = var4.method2336();
                  if (var13 != null) {
                     var13.field1932 = field200[class482.field3830];
                     Client.method485(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --class495.field3920;
                  var9 = var4.method2350();
                  if (null != var9) {
                     var4.field3662 = field187[class495.field3920];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --class482.field3830;
                  var13 = var4.method2336();
                  if (null != var13) {
                     var13.field1933 = field200[class482.field3830];
                     Client.method485(var4);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --class482.field3830;
                  var9 = var4.method2350();
                  if (var9 != null && var9.method275(field200[class482.field3830])) {
                     Client.method485(var4);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --class482.field3830;
                  var9 = var4.method2350();
                  if (null != var9 && var9.method276(field200[class482.field3830])) {
                     Client.method485(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --class482.field3830;
                  var9 = var4.method2350();
                  if (null != var9 && var9.method343(field200[class482.field3830])) {
                     Client.method485(var4);
                  }

                  return 1;
               } else {
                  class28 var7;
                  if (var0 == 1140) {
                     var12 = field200[--class482.field3830] == 1;
                     Client.field815.method1307();
                     var7 = var4.method2350();
                     if (null != var7 && var7.method270(var12)) {
                        if (var12) {
                           Client.field815.method1308(var4);
                        }

                        Client.method485(var4);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var12 = field200[--class482.field3830] == 1;
                     if (!var12 && Client.field815.method1305() == var4) {
                        Client.field815.method1307();
                        Client.method485(var4);
                     }

                     var7 = var4.method2350();
                     if (var7 != null) {
                        var7.method300(var12);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class482.field3830 -= 2;
                     var9 = var4.method2350();
                     if (var9 != null && var9.method289(field200[class482.field3830], field200[class482.field3830 + 1])) {
                        Client.method485(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class482.field3830;
                     var9 = var4.method2350();
                     if (null != var9 && var9.method289(field200[class482.field3830], field200[class482.field3830])) {
                        Client.method485(var4);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class482.field3830;
                     var9 = var4.method2350();
                     if (var9 != null) {
                        var9.method349(field200[class482.field3830]);
                        Client.method485(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class482.field3830;
                     var9 = var4.method2350();
                     if (var9 != null) {
                        var9.method280(field200[class482.field3830]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class482.field3830;
                     var9 = var4.method2350();
                     if (null != var9) {
                        var9.method330(field200[class482.field3830]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class482.field3830;
                     var9 = var4.method2350();
                     if (null != var9) {
                        var9.method348(field200[class482.field3830]);
                        Client.method485(var4);
                     }

                     return 1;
                  } else {
                     class297 var6;
                     if (var0 == 1148) {
                        class482.field3830 -= 2;
                        var6 = var4.method2326();
                        if (null != var6) {
                           var6.method1623(field200[class482.field3830], field200[class482.field3830 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class482.field3830 -= 2;
                        var6 = var4.method2326();
                        if (var6 != null) {
                           var6.method1626((char)field200[class482.field3830], field200[class482.field3830 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var4.method2346(field187[--class495.field3920], class19.field209);
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

   static int method193(int var0, class106 var1, boolean var2) {
      class480 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class480.method2355(field200[--class482.field3830]);
      } else {
         var4 = var2 ? class154.field1646 : class273.field2334;
      }

      Client.method485(var4);
      int var5;
      int var6;
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field3716 = 2;
            var4.field3717 = field200[--class482.field3830];
            return 1;
         } else if (var0 == 1202) {
            var4.field3716 = 3;
            var4.field3717 = class259.field2281.field4096.method1392();
            return 1;
         } else if (var0 == 1207) {
            boolean var8 = field200[--class482.field3830] == 1;
            class474.method2289(var4, class259.field2281.field4096, var8);
            return 1;
         } else if (var0 == 1208) {
            var5 = field200[--class482.field3830];
            if (var4.field3730 == null) {
               throw new RuntimeException("");
            } else {
               class480.method2351(var4, var5);
               return 1;
            }
         } else if (var0 == 1209) {
            class482.field3830 -= 2;
            var5 = field200[class482.field3830];
            var6 = field200[class482.field3830 + 1];
            if (null == var4.field3730) {
               throw new RuntimeException("");
            } else {
               class480.method2354(var4, var5, var6);
               return 1;
            }
         } else if (var0 == 1210) {
            var5 = field200[--class482.field3830];
            if (var4.field3730 == null) {
               throw new RuntimeException("");
            } else {
               class480.method2356(var4, class259.field2281.field4096.field2116, var5);
               return 1;
            }
         } else {
            return 2;
         }
      } else {
         class482.field3830 -= 2;
         var5 = field200[class482.field3830];
         var6 = field200[class482.field3830 + 1];
         var4.field3802 = var5;
         var4.field3803 = var6;
         class71 var7 = class71.method682(var5);
         var4.field3724 = var7.field1136;
         var4.field3742 = var7.field1152;
         var4.field3789 = var7.field1138;
         var4.field3722 = var7.field1137;
         var4.field3796 = var7.field1154;
         var4.field3727 = var7.field1159;
         if (var0 == 1205) {
            var4.field3733 = 0;
         } else if (var0 == 1212 | var7.field1155 == 1) {
            var4.field3733 = 1;
         } else {
            var4.field3733 = 2;
         }

         if (var4.field3728 > 0) {
            var4.field3727 = var4.field3727 * 32 / var4.field3728;
         } else if (var4.field3685 > 0) {
            var4.field3727 = var4.field3727 * 32 / var4.field3685;
         }

         return 1;
      }
   }

   static int method179(int var0, class106 var1, boolean var2) {
      boolean var4 = true;
      class480 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class480.method2355(field200[--class482.field3830]);
         var4 = false;
      } else {
         var5 = var2 ? class154.field1646 : class273.field2334;
      }

      int var9;
      if (var0 == 1300) {
         var9 = field200[--class482.field3830] - 1;
         if (var9 >= 0 && var9 <= 9) {
            var5.method2323(var9, field187[--class495.field3920]);
            return 1;
         } else {
            --class495.field3920;
            return 1;
         }
      } else {
         int var11;
         if (var0 == 1301) {
            class482.field3830 -= 2;
            var9 = field200[class482.field3830];
            var11 = field200[class482.field3830 + 1];
            var5.field3773 = class480.method2352(var9, var11);
            return 1;
         } else if (var0 == 1302) {
            var5.field3755 = field200[--class482.field3830] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.field3687 = field200[--class482.field3830];
            return 1;
         } else if (var0 == 1304) {
            var5.field3729 = field200[--class482.field3830];
            return 1;
         } else if (var0 == 1305) {
            var5.field3678 = field187[--class495.field3920];
            return 1;
         } else if (var0 == 1306) {
            var5.field3756 = field187[--class495.field3920];
            return 1;
         } else if (var0 == 1307) {
            var5.field3752 = null;
            return 1;
         } else if (var0 == 1308) {
            var5.field3818 = field200[--class482.field3830] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class482.field3830;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (var0 != 1350) {
               byte var10;
               if (var0 == 1351) {
                  class482.field3830 -= 2;
                  var10 = 10;
                  var7 = new byte[]{(byte)field200[class482.field3830]};
                  byte[] var12 = new byte[]{(byte)field200[1 + class482.field3830]};
                  method227(var5, var10, var7, var12);
                  return 1;
               } else if (var0 == 1352) {
                  class482.field3830 -= 3;
                  var9 = field200[class482.field3830] - 1;
                  var11 = field200[class482.field3830 + 1];
                  var8 = field200[2 + class482.field3830];
                  if (var9 >= 0 && var9 <= 9) {
                     method197(var5, var9, var11, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var10 = 10;
                  var11 = field200[--class482.field3830];
                  var8 = field200[--class482.field3830];
                  method197(var5, var10, var11, var8);
                  return 1;
               } else if (var0 == 1354) {
                  --class482.field3830;
                  var9 = field200[class482.field3830] - 1;
                  if (var9 >= 0 && var9 <= 9) {
                     method191(var5, var9);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var9 = 10;
                  method191(var5, var9);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  class482.field3830 -= 10;

                  for(var8 = 0; var8 < 10 && field200[class482.field3830 + var8] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)field200[class482.field3830 + var8];
                        var7[var8 / 2] = (byte)field200[1 + class482.field3830 + var8];
                     }
                  }
               } else {
                  class482.field3830 -= 2;
                  var6 = new byte[]{(byte)field200[class482.field3830]};
                  var7 = new byte[]{(byte)field200[1 + class482.field3830]};
               }

               var8 = field200[--class482.field3830] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  method227(var5, var8, var6, var7);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   static final void method227(class480 var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field3723 == null) {
         if (var2 == null) {
            return;
         }

         var0.field3723 = new byte[11][];
         var0.field3819 = new byte[11][];
         var0.field3749 = new int[11];
         var0.field3750 = new int[11];
      }

      var0.field3723[var1] = var2;
      if (null != var2) {
         var0.field3746 = true;
      } else {
         var0.field3746 = false;

         for(int var5 = 0; var5 < var0.field3723.length; ++var5) {
            if (var0.field3723[var5] != null) {
               var0.field3746 = true;
               break;
            }
         }
      }

      var0.field3819[var1] = var3;
   }

   static final void method197(class480 var0, int var1, int var2, int var3) {
      if (null == var0.field3749) {
         throw new RuntimeException();
      } else {
         var0.field3749[var1] = var2;
         var0.field3750[var1] = var3;
      }
   }

   static final void method191(class480 var0, int var1) {
      if (null == var0.field3723) {
         throw new RuntimeException();
      } else {
         if (null == var0.field3815) {
            var0.field3815 = new int[var0.field3723.length];
         }

         var0.field3815[var1] = Integer.MAX_VALUE;
      }
   }

   static int method204(int var0, class106 var1, boolean var2) {
      class480 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class480.method2355(field200[--class482.field3830]);
      } else {
         var4 = var2 ? class154.field1646 : class273.field2334;
      }

      String var5 = field187[--class495.field3920];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = field200[--class482.field3830];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = field200[--class482.field3830]) {
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var10 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var10.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var10[var8] = field187[--class495.field3920];
         } else {
            var10[var8] = new Integer(field200[--class482.field3830]);
         }
      }

      var8 = field200[--class482.field3830];
      if (var8 != -1) {
         var10[0] = new Integer(var8);
      } else {
         var10 = null;
      }

      if (var0 == 1400) {
         var4.field3726 = var10;
      } else if (var0 == 1401) {
         var4.field3762 = var10;
      } else if (var0 == 1402) {
         var4.field3759 = var10;
      } else if (var0 == 1403) {
         var4.field3763 = var10;
      } else if (var0 == 1404) {
         var4.field3735 = var10;
      } else if (var0 == 1405) {
         var4.field3766 = var10;
      } else if (var0 == 1406) {
         var4.field3769 = var10;
      } else if (var0 == 1407) {
         var4.field3741 = var10;
         var4.field3771 = var6;
      } else if (var0 == 1408) {
         var4.field3667 = var10;
      } else if (var0 == 1409) {
         var4.field3777 = var10;
      } else if (var0 == 1410) {
         var4.field3767 = var10;
      } else if (var0 == 1411) {
         var4.field3672 = var10;
      } else if (var0 == 1412) {
         var4.field3764 = var10;
      } else if (var0 == 1414) {
         var4.field3772 = var10;
         var4.field3703 = var6;
      } else if (var0 == 1415) {
         var4.field3774 = var10;
         var4.field3775 = var6;
      } else if (var0 == 1416) {
         var4.field3768 = var10;
      } else if (var0 == 1417) {
         var4.field3699 = var10;
      } else if (var0 == 1418) {
         var4.field3665 = var10;
      } else if (var0 == 1419) {
         var4.field3781 = var10;
      } else if (var0 == 1420) {
         var4.field3731 = var10;
      } else if (var0 == 1421) {
         var4.field3785 = var10;
      } else if (var0 == 1422) {
         var4.field3788 = var10;
      } else if (var0 == 1423) {
         var4.field3721 = var10;
      } else if (var0 == 1424) {
         var4.field3753 = var10;
      } else if (var0 == 1425) {
         var4.field3792 = var10;
      } else if (var0 == 1426) {
         var4.field3807 = var10;
      } else if (var0 == 1427) {
         var4.field3668 = var10;
      } else if (var0 == 1428) {
         var4.field3786 = var10;
      } else if (var0 == 1429) {
         var4.field3787 = var10;
      } else if (var0 == 1430) {
         var4.field3791 = var10;
      } else if (var0 == 1431) {
         var4.field3748 = var10;
      } else if (var0 == 1434) {
         var4.field3739 = var10;
      } else if (var0 == 1435) {
         var4.field3778 = var10;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class269 var9 = var4.method2337();
         if (var9 != null) {
            if (var0 == 1436) {
               var9.field2310 = var10;
            } else if (var0 == 1437) {
               var9.field2311 = var10;
            } else if (var0 == 1438) {
               var9.field2306 = var10;
            } else if (var0 == 1439) {
               var9.field2308 = var10;
            }
         }
      }

      var4.field3757 = true;
      return 1;
   }

   static int method200(int var0, class106 var1, boolean var2) {
      class480 var4 = var2 ? class154.field1646 : class273.field2334;
      if (var0 == 1500) {
         field200[++class482.field3830 - 1] = var4.field3675;
         return 1;
      } else if (var0 == 1501) {
         field200[++class482.field3830 - 1] = var4.field3688;
         return 1;
      } else if (var0 == 1502) {
         field200[++class482.field3830 - 1] = var4.field3689;
         return 1;
      } else if (var0 == 1503) {
         field200[++class482.field3830 - 1] = var4.field3666;
         return 1;
      } else if (var0 == 1504) {
         field200[++class482.field3830 - 1] = var4.field3692 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         field200[++class482.field3830 - 1] = var4.field3691;
         return 1;
      } else {
         return 2;
      }
   }

   static int method214(int var0, class106 var1, boolean var2) {
      class480 var4 = var2 ? class154.field1646 : class273.field2334;
      if (var0 == 1600) {
         field200[++class482.field3830 - 1] = var4.field3693;
         return 1;
      } else if (var0 == 1601) {
         field200[++class482.field3830 - 1] = var4.field3707;
         return 1;
      } else {
         class28 var8;
         if (var0 == 1602) {
            if (var4.field3676 == 12) {
               var8 = var4.method2350();
               if (null != var8) {
                  field187[++class495.field3920 - 1] = var8.method332().method79();
                  return 1;
               }
            }

            field187[++class495.field3920 - 1] = var4.field3734;
            return 1;
         } else if (var0 == 1603) {
            field200[++class482.field3830 - 1] = var4.field3761;
            return 1;
         } else if (var0 == 1604) {
            field200[++class482.field3830 - 1] = var4.field3696;
            return 1;
         } else if (var0 == 1605) {
            field200[++class482.field3830 - 1] = var4.field3727;
            return 1;
         } else if (var0 == 1606) {
            field200[++class482.field3830 - 1] = var4.field3724;
            return 1;
         } else if (var0 == 1607) {
            field200[++class482.field3830 - 1] = var4.field3789;
            return 1;
         } else if (var0 == 1608) {
            field200[++class482.field3830 - 1] = var4.field3742;
            return 1;
         } else if (var0 == 1609) {
            field200[++class482.field3830 - 1] = var4.field3695;
            return 1;
         } else if (var0 == 1610) {
            field200[++class482.field3830 - 1] = var4.field3704;
            return 1;
         } else if (var0 == 1611) {
            field200[++class482.field3830 - 1] = var4.field3697;
            return 1;
         } else if (var0 == 1612) {
            field200[++class482.field3830 - 1] = var4.field3698;
            return 1;
         } else if (var0 == 1613) {
            field200[++class482.field3830 - 1] = var4.field3702.method1195();
            return 1;
         } else if (var0 == 1614) {
            field200[++class482.field3830 - 1] = var4.field3732 ? 1 : 0;
            return 1;
         } else {
            class200 var5;
            if (var0 == 1617) {
               var5 = var4.method2336();
               field200[++class482.field3830 - 1] = null != var5 ? var5.field1931 : 0;
            }

            if (var0 == 1618) {
               var5 = var4.method2336();
               field200[++class482.field3830 - 1] = var5 != null ? var5.field1932 : 0;
               return 1;
            } else if (var0 == 1619) {
               var8 = var4.method2350();
               field187[++class495.field3920 - 1] = var8 != null ? var8.method306().method79() : "";
               return 1;
            } else if (var0 == 1620) {
               var5 = var4.method2336();
               field200[++class482.field3830 - 1] = null != var5 ? var5.field1933 : 0;
               return 1;
            } else if (var0 == 1621) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = null != var8 ? var8.method344() : 0;
               return 1;
            } else if (var0 == 1622) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = var8 != null ? var8.method340() : 0;
               return 1;
            } else if (var0 == 1623) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = var8 != null ? var8.method346() : 0;
               return 1;
            } else if (var0 == 1624) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = var8 != null && var8.method308() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var8 = var4.method2350();
                  field187[++class495.field3920 - 1] = var8 != null ? var8.method281().method2142() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var8 = var4.method2350();
                  int var6 = var8 != null ? var8.method311() : 0;
                  int var7 = null != var8 ? var8.method310() : 0;
                  field200[++class482.field3830 - 1] = Math.min(var6, var7);
                  field200[++class482.field3830 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 1628) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method310() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method283() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = null != var8 ? var8.method315() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method334() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method277() : 0;
                  return 1;
               } else {
                  class297 var9;
                  if (var0 == 1633) {
                     var9 = var4.method2326();
                     field200[class482.field3830 - 1] = var9 != null ? var9.method1620(field200[class482.field3830 - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var9 = var4.method2326();
                     field200[class482.field3830 - 1] = null != var9 ? var9.method1624((char)field200[class482.field3830 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = null != var8 && var8.method309() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static int method213(class480 var0) {
      if (var0.field3676 != 11) {
         --class495.field3920;
         field200[++class482.field3830 - 1] = -1;
         return 1;
      } else {
         String var2 = field187[--class495.field3920];
         field200[++class482.field3830 - 1] = var0.method2329(var2);
         return 1;
      }
   }

   static int method223(class480 var0) {
      if (var0.field3676 != 11) {
         field187[class495.field3920 - 1] = "";
         return 1;
      } else {
         String var2 = field187[--class495.field3920];
         field187[++class495.field3920 - 1] = var0.method2330(var2);
         return 1;
      }
   }

   static int method185(int var0, class106 var1, boolean var2) {
      class480 var4 = var2 ? class154.field1646 : class273.field2334;
      if (var0 == 1800) {
         field200[++class482.field3830 - 1] = class392.method1898(Client.method481(var4));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var4.field3678 == null) {
               field187[++class495.field3920 - 1] = "";
            } else {
               field187[++class495.field3920 - 1] = var4.field3678;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = field200[--class482.field3830];
         --var5;
         if (null != var4.field3752 && var5 < var4.field3752.length && null != var4.field3752[var5]) {
            field187[++class495.field3920 - 1] = var4.field3752[var5];
         } else {
            field187[++class495.field3920 - 1] = "";
         }

         return 1;
      }
   }

   static int method228(int var0, class106 var1, boolean var2) {
      class480 var4;
      if (var0 != 1927 && var0 != 2927) {
         int var9;
         if (var0 == 1928) {
            var4 = var2 ? class154.field1646 : class273.field2334;
            var9 = field200[--class482.field3830];
            if (var9 >= 1 && var9 <= 10) {
               class291 var10 = new class291(var9, var4.field3674, var4.field3793, var4.field3802);
               field197.add(var10);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            class482.field3830 -= 3;
            int var8 = field200[class482.field3830];
            var9 = field200[class482.field3830 + 1];
            int var6 = field200[2 + class482.field3830];
            if (var6 >= 1 && var6 <= 10) {
               class291 var7 = new class291(var6, var8, var9, class480.method2355(var8).field3802);
               field197.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (field198 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class480.method2355(field200[--class482.field3830]);
         } else {
            var4 = var2 ? class154.field1646 : class273.field2334;
         }

         if (null == var4.field3668) {
            return 0;
         } else {
            class208 var5 = new class208();
            var5.field1951 = var4;
            var5.field1954 = var4.field3668;
            var5.field1961 = 1 + field198;
            Client.field791.method1240(var5);
            return 1;
         }
      }
   }

   static int method188(int var0, class106 var1, boolean var2) {
      class480 var4 = class480.method2355(field200[--class482.field3830]);
      if (var0 == 2500) {
         field200[++class482.field3830 - 1] = var4.field3675;
         return 1;
      } else if (var0 == 2501) {
         field200[++class482.field3830 - 1] = var4.field3688;
         return 1;
      } else if (var0 == 2502) {
         field200[++class482.field3830 - 1] = var4.field3689;
         return 1;
      } else if (var0 == 2503) {
         field200[++class482.field3830 - 1] = var4.field3666;
         return 1;
      } else if (var0 == 2504) {
         field200[++class482.field3830 - 1] = var4.field3692 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         field200[++class482.field3830 - 1] = var4.field3691;
         return 1;
      } else {
         return 2;
      }
   }

   static int method222(int var0, class106 var1, boolean var2) {
      class480 var4 = class480.method2355(field200[--class482.field3830]);
      if (var0 == 2600) {
         field200[++class482.field3830 - 1] = var4.field3693;
         return 1;
      } else if (var0 == 2601) {
         field200[++class482.field3830 - 1] = var4.field3707;
         return 1;
      } else if (var0 == 2602) {
         field187[++class495.field3920 - 1] = var4.field3734;
         return 1;
      } else if (var0 == 2603) {
         field200[++class482.field3830 - 1] = var4.field3761;
         return 1;
      } else if (var0 == 2604) {
         field200[++class482.field3830 - 1] = var4.field3696;
         return 1;
      } else if (var0 == 2605) {
         field200[++class482.field3830 - 1] = var4.field3727;
         return 1;
      } else if (var0 == 2606) {
         field200[++class482.field3830 - 1] = var4.field3724;
         return 1;
      } else if (var0 == 2607) {
         field200[++class482.field3830 - 1] = var4.field3789;
         return 1;
      } else if (var0 == 2608) {
         field200[++class482.field3830 - 1] = var4.field3742;
         return 1;
      } else if (var0 == 2609) {
         field200[++class482.field3830 - 1] = var4.field3695;
         return 1;
      } else if (var0 == 2610) {
         field200[++class482.field3830 - 1] = var4.field3704;
         return 1;
      } else if (var0 == 2611) {
         field200[++class482.field3830 - 1] = var4.field3697;
         return 1;
      } else if (var0 == 2612) {
         field200[++class482.field3830 - 1] = var4.field3698;
         return 1;
      } else if (var0 == 2613) {
         field200[++class482.field3830 - 1] = var4.field3702.method1195();
         return 1;
      } else if (var0 == 2614) {
         field200[++class482.field3830 - 1] = var4.field3732 ? 1 : 0;
         return 1;
      } else {
         class200 var5;
         if (var0 == 2617) {
            var5 = var4.method2336();
            field200[++class482.field3830 - 1] = var5 != null ? var5.field1931 : 0;
         }

         if (var0 == 2618) {
            var5 = var4.method2336();
            field200[++class482.field3830 - 1] = null != var5 ? var5.field1932 : 0;
            return 1;
         } else {
            class28 var8;
            if (var0 == 2619) {
               var8 = var4.method2350();
               field187[++class495.field3920 - 1] = var8 != null ? var8.method306().method79() : "";
               return 1;
            } else if (var0 == 2620) {
               var5 = var4.method2336();
               field200[++class482.field3830 - 1] = var5 != null ? var5.field1933 : 0;
               return 1;
            } else if (var0 == 2621) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = var8 != null ? var8.method344() : 0;
               return 1;
            } else if (var0 == 2622) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = null != var8 ? var8.method340() : 0;
               return 1;
            } else if (var0 == 2623) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = null != var8 ? var8.method346() : 0;
               return 1;
            } else if (var0 == 2624) {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = null != var8 && var8.method308() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var8 = var4.method2350();
                  field187[++class495.field3920 - 1] = null != var8 ? var8.method281().method2142() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var8 = var4.method2350();
                  int var6 = null != var8 ? var8.method311() : 0;
                  int var7 = null != var8 ? var8.method310() : 0;
                  field200[++class482.field3830 - 1] = Math.min(var6, var7);
                  field200[++class482.field3830 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 2628) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method310() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method283() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = null != var8 ? var8.method315() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method334() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var8 = var4.method2350();
                  field200[++class482.field3830 - 1] = var8 != null ? var8.method277() : 0;
                  return 1;
               } else {
                  class297 var9;
                  if (var0 == 2633) {
                     var9 = var4.method2326();
                     field200[class482.field3830 - 1] = null != var9 ? var9.method1620(field200[class482.field3830 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var9 = var4.method2326();
                     field200[class482.field3830 - 1] = null != var9 ? var9.method1624((char)field200[class482.field3830 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method2350();
               field200[++class482.field3830 - 1] = var8 != null && var8.method309() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static int method218(int var0, class106 var1, boolean var2) {
      class480 var4;
      if (var0 == 2700) {
         var4 = class480.method2355(field200[--class482.field3830]);
         field200[++class482.field3830 - 1] = var4.field3802;
         return 1;
      } else if (var0 == 2701) {
         var4 = class480.method2355(field200[--class482.field3830]);
         if (var4.field3802 != -1) {
            field200[++class482.field3830 - 1] = var4.field3803;
         } else {
            field200[++class482.field3830 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var6 = field200[--class482.field3830];
         class49 var5 = (class49)Client.field597.method709((long)var6);
         if (var5 != null) {
            field200[++class482.field3830 - 1] = 1;
         } else {
            field200[++class482.field3830 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         field200[++class482.field3830 - 1] = Client.field748;
         return 1;
      } else if (var0 == 2707) {
         var4 = class480.method2355(field200[--class482.field3830]);
         field200[++class482.field3830 - 1] = var4.method2347() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var4 = class480.method2355(field200[--class482.field3830]);
         return method213(var4);
      } else if (var0 == 2709) {
         var4 = class480.method2355(field200[--class482.field3830]);
         return method223(var4);
      } else {
         return 2;
      }
   }

   static int method190(int var0, class106 var1, boolean var2) {
      class480 var4 = class480.method2355(field200[--class482.field3830]);
      if (var0 == 2800) {
         field200[++class482.field3830 - 1] = class392.method1898(Client.method481(var4));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (null == var4.field3678) {
               field187[++class495.field3920 - 1] = "";
            } else {
               field187[++class495.field3920 - 1] = var4.field3678;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = field200[--class482.field3830];
         --var5;
         if (var4.field3752 != null && var5 < var4.field3752.length && null != var4.field3752[var5]) {
            field187[++class495.field3920 - 1] = var4.field3752[var5];
         } else {
            field187[++class495.field3920 - 1] = "";
         }

         return 1;
      }
   }

   static int method225(int var0, class106 var1, boolean var2) {
      String var12;
      if (var0 == 3100) {
         var12 = field187[--class495.field3920];
         class194.method1209(0, "", var12);
         return 1;
      } else if (var0 == 3101) {
         class482.field3830 -= 2;
         Client.method554(class259.field2281, field200[class482.field3830], field200[class482.field3830 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!field195) {
            field201 = true;
         }

         return 1;
      } else {
         int var11;
         if (var0 == 3104) {
            var12 = field187[--class495.field3920];
            var11 = 0;
            if (class330.method1742(var12)) {
               var11 = class330.method1736(var12);
            }

            class335 var15 = class335.createPacket(ClientPacket.field1025, Client.field641.field2758);
            var15.buffer.writeInt(var11);
            Client.field641.method1797(var15);
            return 1;
         } else {
            class335 var9;
            if (var0 == 3105) {
               var12 = field187[--class495.field3920];
               var9 = class335.createPacket(ClientPacket.field933, Client.field641.field2758);
               var9.buffer.method1114(var12.length() + 1);
               var9.buffer.method1117(var12);
               Client.field641.method1797(var9);
               return 1;
            } else if (var0 == 3106) {
               var12 = field187[--class495.field3920];
               var9 = class335.createPacket(ClientPacket.field1029, Client.field641.field2758);
               var9.buffer.method1114(var12.length() + 1);
               var9.buffer.method1117(var12);
               Client.field641.method1797(var9);
               return 1;
            } else {
               int var4;
               String var5;
               if (var0 == 3107) {
                  var4 = field200[--class482.field3830];
                  var5 = field187[--class495.field3920];
                  class248.method1454(var4, var5);
                  return 1;
               } else if (var0 == 3108) {
                  class482.field3830 -= 3;
                  var4 = field200[class482.field3830];
                  var11 = field200[1 + class482.field3830];
                  int var14 = field200[2 + class482.field3830];
                  class480 var16 = class480.method2355(var14);
                  Client.method488(var16, var4, var11);
                  return 1;
               } else if (var0 == 3109) {
                  class482.field3830 -= 2;
                  var4 = field200[class482.field3830];
                  var11 = field200[1 + class482.field3830];
                  class480 var13 = var2 ? class154.field1646 : class273.field2334;
                  Client.method488(var13, var4, var11);
                  return 1;
               } else if (var0 == 3110) {
                  class136.field1574 = field200[--class482.field3830] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  field200[++class482.field3830 - 1] = class4.field36.method2405() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class4.field36.method2404(field200[--class482.field3830] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var12 = field187[--class495.field3920];
                  boolean var10 = field200[--class482.field3830] == 1;
                  class352.method1812(var12, var10, false);
                  return 1;
               } else if (var0 == 3115) {
                  var4 = field200[--class482.field3830];
                  var9 = class335.createPacket(ClientPacket.field1022, Client.field641.field2758);
                  var9.buffer.method1155(var4);
                  Client.field641.method1797(var9);
                  return 1;
               } else if (var0 == 3116) {
                  var4 = field200[--class482.field3830];
                  class495.field3920 -= 2;
                  var5 = field187[class495.field3920];
                  String var6 = field187[class495.field3920 + 1];
                  if (var5.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class335 var7 = class335.createPacket(ClientPacket.field953, Client.field641.field2758);
                     var7.buffer.method1155(1 + class184.method1188(var5) + class184.method1188(var6));
                     var7.buffer.method1117(var6);
                     var7.buffer.method1114(var4);
                     var7.buffer.method1117(var5);
                     Client.field641.method1797(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  --class482.field3830;
                  return 1;
               } else if (var0 == 3118) {
                  Client.field736 = field200[--class482.field3830] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  Client.field814 = field200[--class482.field3830] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (field200[--class482.field3830] == 1) {
                     Client.field579 |= 1;
                  } else {
                     Client.field579 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (field200[--class482.field3830] == 1) {
                     Client.field579 |= 2;
                  } else {
                     Client.field579 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (field200[--class482.field3830] == 1) {
                     Client.field579 |= 4;
                  } else {
                     Client.field579 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (field200[--class482.field3830] == 1) {
                     Client.field579 |= 8;
                  } else {
                     Client.field579 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.field579 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  Client.field865 = field200[--class482.field3830] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  Client.field702 = field200[--class482.field3830] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  Client.method399(field200[--class482.field3830] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  field200[++class482.field3830 - 1] = Client.method413() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class482.field3830 -= 2;
                  Client.field674 = field200[class482.field3830];
                  Client.field675 = field200[class482.field3830 + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class482.field3830 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class482.field3830;
                  return 1;
               } else if (var0 == 3132) {
                  field200[++class482.field3830 - 1] = class426.field3228;
                  field200[++class482.field3830 - 1] = class456.field3562;
                  return 1;
               } else if (var0 == 3133) {
                  --class482.field3830;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class482.field3830 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field590 = 3;
                  Client.field751 = field200[--class482.field3830];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field590 = 2;
                  Client.field751 = field200[--class482.field3830];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field590 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field590 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field590 = 3;
                  Client.field751 = var2 ? class154.field1646.field3674 : class273.field2334.field3674;
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3141) {
                     var8 = field200[--class482.field3830] == 1;
                     class4.field36.method2426(var8);
                     return 1;
                  } else if (var0 == 3142) {
                     field200[++class482.field3830 - 1] = class4.field36.method2409() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = field200[--class482.field3830] == 1;
                     Client.field630 = var8;
                     if (!var8) {
                        class4.field36.method2416("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     field200[++class482.field3830 - 1] = Client.field630 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var8 = field200[--class482.field3830] == 1;
                     class4.field36.method2424(!var8);
                     return 1;
                  } else if (var0 == 3147) {
                     field200[++class482.field3830 - 1] = class4.field36.method2425() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     field200[++class482.field3830 - 1] = class534.field4226;
                     return 1;
                  } else if (var0 == 3154) {
                     field200[++class482.field3830 - 1] = Client.method420();
                     return 1;
                  } else if (var0 == 3155) {
                     --class495.field3920;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class482.field3830 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class482.field3830;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class482.field3830;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class495.field3920;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class482.field3830;
                     field187[++class495.field3920 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class482.field3830;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class482.field3830 -= 2;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class482.field3830 -= 2;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class482.field3830 -= 2;
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class482.field3830;
                     return 1;
                  } else if (var0 == 3173) {
                     --class482.field3830;
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class482.field3830;
                     return 1;
                  } else if (var0 == 3175) {
                     field200[++class482.field3830 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class495.field3920;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class495.field3920;
                     return 1;
                  } else if (var0 == 3181) {
                     Client.method401(field200[--class482.field3830]);
                     return 1;
                  } else if (var0 == 3182) {
                     field200[++class482.field3830 - 1] = Client.method526();
                     return 1;
                  } else if (var0 == 3189) {
                     var4 = field200[--class482.field3830];
                     Client.method555(var4);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   static int method215(int var0, class106 var1, boolean var2) {
      if (var0 == 3200) {
         class482.field3830 -= 3;
         Client.method407(field200[class482.field3830], field200[1 + class482.field3830], field200[2 + class482.field3830]);
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         int var13;
         int var16;
         if (var0 == 3201) {
            class482.field3830 -= 5;
            var13 = field200[class482.field3830];
            var16 = field200[class482.field3830 + 1];
            var6 = field200[2 + class482.field3830];
            var7 = field200[class482.field3830 + 3];
            var8 = field200[4 + class482.field3830];
            ArrayList var15 = new ArrayList();
            var15.add(var13);
            class343.method1790(var15, var16, var6, var7, var8);
            return 1;
         } else if (var0 == 3202) {
            class482.field3830 -= 2;
            Client.method423(field200[class482.field3830], field200[1 + class482.field3830]);
            return 1;
         } else {
            class76 var4;
            class342 var5;
            String var12;
            if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
               boolean var11;
               if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
                  if (var0 == 3211) {
                     return 1;
                  } else if (var0 == 3216) {
                     var13 = field200[--class482.field3830];
                     var16 = 0;
                     class76 var20 = (class76)class341.method1788(class76.method697(), var13);
                     if (var20 != null) {
                        var16 = var20 != class76.field1234 ? 1 : 0;
                     }

                     field200[++class482.field3830 - 1] = var16;
                     return 1;
                  } else if (var0 == 3218) {
                     var13 = field200[--class482.field3830];
                     var16 = 0;
                     class342 var19 = (class342)class341.method1788(class342.method1789(), var13);
                     if (var19 != null) {
                        var16 = class342.field2734 != var19 ? 1 : 0;
                     }

                     field200[++class482.field3830 - 1] = var16;
                     return 1;
                  } else if (var0 != 3217 && var0 != 3219) {
                     if (var0 == 3220) {
                        class482.field3830 -= 2;
                        var13 = field200[class482.field3830];
                        var16 = field200[class482.field3830 + 1];
                        class106.method792(var13, var16);
                        return 1;
                     } else if (var0 == 3221) {
                        class482.field3830 -= 6;
                        var13 = field200[class482.field3830];
                        var16 = field200[1 + class482.field3830];
                        var6 = field200[class482.field3830 + 2];
                        var7 = field200[3 + class482.field3830];
                        var8 = field200[class482.field3830 + 4];
                        int var9 = field200[class482.field3830 + 5];
                        ArrayList var10 = new ArrayList();
                        var10.add(var13);
                        var10.add(var16);
                        class343.method1790(var10, var6, var7, var8, var9);
                        return 1;
                     } else if (var0 == 3222) {
                        class482.field3830 -= 4;
                        var13 = field200[class482.field3830];
                        var16 = field200[class482.field3830 + 1];
                        var6 = field200[class482.field3830 + 2];
                        var7 = field200[class482.field3830 + 3];
                        class228.method1378(var13, var16, var6, var7);
                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     var4 = class76.field1234;
                     var5 = class342.field2734;
                     var11 = true;
                     boolean var18 = true;
                     if (var0 == 3217) {
                        var8 = field200[--class482.field3830];
                        var4 = (class76)class341.method1788(class76.method697(), var8);
                        if (var4 == null) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                        }
                     }

                     if (var0 == 3219) {
                        var8 = field200[--class482.field3830];
                        var5 = (class342)class341.method1788(class342.method1789(), var8);
                        if (var5 == null) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                        }
                     }

                     String var14;
                     byte var17;
                     if (class342.field2734 == var5) {
                        switch (var4.field1231) {
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
                        switch (var5.field2733) {
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

                     field200[++class482.field3830 - 1] = var17;
                     field200[++class482.field3830 - 1] = var7;
                     return 1;
                  }
               } else {
                  var4 = class76.field1234;
                  var5 = class342.field2734;
                  var11 = false;
                  if (var0 == 3214) {
                     var7 = field200[--class482.field3830];
                     var4 = (class76)class341.method1788(class76.method697(), var7);
                     if (null == var4) {
                        throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                     }
                  }

                  if (var0 == 3215) {
                     var7 = field200[--class482.field3830];
                     var5 = (class342)class341.method1788(class342.method1789(), var7);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                     }
                  }

                  if (var0 == 3210) {
                     var7 = field200[--class482.field3830];
                     var4 = (class76)class341.method1788(class76.method697(), var7);
                     if (var4 == null) {
                        var5 = (class342)class341.method1788(class342.method1789(), var7);
                        if (var5 == null) {
                           throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                        }
                     }
                  } else if (var0 == 3182) {
                     var4 = class76.field1230;
                  } else if (var0 == 3204) {
                     var5 = class342.field2729;
                  } else if (var0 == 3206) {
                     var5 = class342.field2731;
                  } else if (var0 == 3208) {
                     var5 = class342.field2735;
                  }

                  if (class342.field2734 == var5) {
                     switch (var4.field1231) {
                        case 1:
                           var6 = class4.field36.method2409() ? 1 : 0;
                           break;
                        case 2:
                           var6 = class4.field36.method2425() ? 1 : 0;
                           break;
                        case 3:
                           var6 = class4.field36.method2415() ? 1 : 0;
                           break;
                        case 4:
                           var6 = class4.field36.method2411();
                           break;
                        case 5:
                           var6 = Client.method526();
                           break;
                        default:
                           var12 = String.format("Unkown device option: %s.", var4.toString());
                           throw new RuntimeException(var12);
                     }
                  } else {
                     switch (var5.field2733) {
                        case 1:
                           var6 = class4.field36.method2405() ? 1 : 0;
                           break;
                        case 2:
                           var7 = class4.field36.method2406();
                           var6 = Math.round((float)(var7 * 100) / 255.0F);
                           break;
                        case 3:
                           var7 = class4.field36.method2414();
                           var6 = Math.round((float)(var7 * 100) / 127.0F);
                           break;
                        case 4:
                           var7 = class4.field36.method2432();
                           var6 = Math.round((float)(var7 * 100) / 127.0F);
                           break;
                        default:
                           var12 = String.format("Unkown game option: %s.", var5.toString());
                           throw new RuntimeException(var12);
                     }
                  }

                  field200[++class482.field3830 - 1] = var6;
                  return 1;
               }
            } else {
               var4 = class76.field1234;
               var5 = class342.field2734;
               var6 = field200[--class482.field3830];
               if (var0 == 3212) {
                  var7 = field200[--class482.field3830];
                  var4 = (class76)class341.method1788(class76.method697(), var7);
                  if (null == var4) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (var0 == 3213) {
                  var7 = field200[--class482.field3830];
                  var5 = (class342)class341.method1788(class342.method1789(), var7);
                  if (var5 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (var0 == 3209) {
                  var7 = field200[--class482.field3830];
                  var4 = (class76)class341.method1788(class76.method697(), var7);
                  if (var4 == null) {
                     var5 = (class342)class341.method1788(class342.method1789(), var7);
                     if (null == var5) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (var0 == 3181) {
                  var4 = class76.field1230;
               } else if (var0 == 3203) {
                  var5 = class342.field2729;
               } else if (var0 == 3205) {
                  var5 = class342.field2731;
               } else if (var0 == 3207) {
                  var5 = class342.field2735;
               }

               if (class342.field2734 == var5) {
                  switch (var4.field1231) {
                     case 1:
                        class4.field36.method2426(var6 == 1);
                        break;
                     case 2:
                        class4.field36.method2424(var6 == 1);
                        break;
                     case 3:
                        class4.field36.method2407(var6 == 1);
                        break;
                     case 4:
                        if (var6 < 0) {
                           var6 = 0;
                        }

                        class4.field36.method2410(var6);
                        break;
                     case 5:
                        Client.method401(var6);
                        break;
                     default:
                        var12 = String.format("Unkown device option: %s.", var4.toString());
                        throw new RuntimeException(var12);
                  }
               } else {
                  switch (var5.field2733) {
                     case 1:
                        class4.field36.method2404(var6 == 1);
                        break;
                     case 2:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 255) / 100.0F);
                        Client.method506(var7);
                        break;
                     case 3:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 127) / 100.0F);
                        Client.method536(var7);
                        break;
                     case 4:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 127) / 100.0F);
                        Client.method400(var7);
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

   static int method224(int var0, class106 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         class482.field3830 -= 2;
         var4 = field200[class482.field3830];
         var5 = field200[1 + class482.field3830];
         class101 var11 = class101.method751(var4);
         if (var11.field1331 != 's') {
         }

         for(var7 = 0; var7 < var11.field1334; ++var7) {
            if (var11.field1328[var7] == var5) {
               field187[++class495.field3920 - 1] = var11.field1335[var7];
               var11 = null;
               break;
            }
         }

         if (null != var11) {
            field187[++class495.field3920 - 1] = var11.field1332;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = field200[--class482.field3830];
            class101 var10 = class101.method751(var4);
            field200[++class482.field3830 - 1] = var10.method748();
            return 1;
         } else {
            return 2;
         }
      } else {
         class482.field3830 -= 4;
         var4 = field200[class482.field3830];
         var5 = field200[class482.field3830 + 1];
         int var6 = field200[class482.field3830 + 2];
         var7 = field200[class482.field3830 + 3];
         class101 var8 = class101.method751(var6);
         if (var8.field1330 == var4 && var8.field1331 == var5) {
            for(int var9 = 0; var9 < var8.field1334; ++var9) {
               if (var8.field1328[var9] == var7) {
                  if (var5 == 115) {
                     field187[++class495.field3920 - 1] = var8.field1335[var9];
                  } else {
                     field200[++class482.field3830 - 1] = var8.field1337[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (null != var8) {
               if (var5 == 115) {
                  field187[++class495.field3920 - 1] = var8.field1332;
               } else {
                  field200[++class482.field3830 - 1] = var8.field1329;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               field187[++class495.field3920 - 1] = class27.field544;
            } else {
               field200[++class482.field3830 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method211(int var0, class106 var1, boolean var2) {
      int var4;
      if (var0 == 3500) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field724.method171(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field724.method167(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field724.method164(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static int method178(int var0, class106 var1, boolean var2) {
      if (var0 == 3600) {
         if (class314.field2562.field2271 == 0) {
            field200[++class482.field3830 - 1] = -2;
         } else if (class314.field2562.field2271 == 1) {
            field200[++class482.field3830 - 1] = -1;
         } else {
            field200[++class482.field3830 - 1] = class314.field2562.field2273.method2058();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = field200[--class482.field3830];
            if (class314.field2562.method1477() && var4 >= 0 && var4 < class314.field2562.field2273.method2058()) {
               class446 var9 = (class446)class314.field2562.field2273.method2045(var4);
               field187[++class495.field3920 - 1] = var9.method1766();
               field187[++class495.field3920 - 1] = var9.method1767();
            } else {
               field187[++class495.field3920 - 1] = "";
               field187[++class495.field3920 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = field200[--class482.field3830];
            if (class314.field2562.method1477() && var4 >= 0 && var4 < class314.field2562.field2273.method2058()) {
               field200[++class482.field3830 - 1] = ((class410)class314.field2562.field2273.method2045(var4)).field3157;
            } else {
               field200[++class482.field3830 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var4 = field200[--class482.field3830];
            if (class314.field2562.method1477() && var4 >= 0 && var4 < class314.field2562.field2273.method2058()) {
               field200[++class482.field3830 - 1] = ((class410)class314.field2562.field2273.method2045(var4)).field3158;
            } else {
               field200[++class482.field3830 - 1] = 0;
            }

            return 1;
         } else {
            String var10;
            if (var0 == 3604) {
               var10 = field187[--class495.field3920];
               int var8 = field200[--class482.field3830];
               class258.method1494(var10, var8);
               return 1;
            } else if (var0 == 3605) {
               var10 = field187[--class495.field3920];
               class314.field2562.method1483(var10);
               return 1;
            } else if (var0 == 3606) {
               var10 = field187[--class495.field3920];
               class314.field2562.method1486(var10);
               return 1;
            } else if (var0 == 3607) {
               var10 = field187[--class495.field3920];
               class314.field2562.method1485(var10);
               return 1;
            } else if (var0 == 3608) {
               var10 = field187[--class495.field3920];
               boolean var7 = true;
               class314.field2562.method1487(var10, var7);
               return 1;
            } else if (var0 == 3609) {
               var10 = field187[--class495.field3920];
               var10 = Client.method480(var10);
               field200[++class482.field3830 - 1] = class314.field2562.method1481(new class251(var10, class121.field1501), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class59.field1089 != null) {
                  field187[++class495.field3920 - 1] = class59.field1089.field202;
               } else {
                  field187[++class495.field3920 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class59.field1089 != null) {
                  field200[++class482.field3830 - 1] = class59.field1089.method2058();
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = field200[--class482.field3830];
               if (class59.field1089 != null && var4 < class59.field1089.method2058()) {
                  field187[++class495.field3920 - 1] = class59.field1089.method2045(var4).method1765().method1458();
               } else {
                  field187[++class495.field3920 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = field200[--class482.field3830];
               if (class59.field1089 != null && var4 < class59.field1089.method2058()) {
                  field200[++class482.field3830 - 1] = ((class410)class59.field1089.method2045(var4)).method1984();
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = field200[--class482.field3830];
               if (class59.field1089 != null && var4 < class59.field1089.method2058()) {
                  field200[++class482.field3830 - 1] = ((class410)class59.field1089.method2045(var4)).field3158;
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               field200[++class482.field3830 - 1] = class59.field1089 != null ? class59.field1089.field206 : 0;
               return 1;
            } else if (var0 == 3617) {
               var10 = field187[--class495.field3920];
               Client.method461(var10);
               return 1;
            } else if (var0 == 3618) {
               field200[++class482.field3830 - 1] = class59.field1089 != null ? class59.field1089.field207 : 0;
               return 1;
            } else if (var0 == 3619) {
               var10 = field187[--class495.field3920];
               Client.method449(var10);
               return 1;
            } else if (var0 == 3620) {
               Client.method428();
               return 1;
            } else if (var0 == 3621) {
               if (!class314.field2562.method1477()) {
                  field200[++class482.field3830 - 1] = -1;
               } else {
                  field200[++class482.field3830 - 1] = class314.field2562.field2272.method2058();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = field200[--class482.field3830];
               if (class314.field2562.method1477() && var4 >= 0 && var4 < class314.field2562.field2272.method2058()) {
                  class11 var5 = (class11)class314.field2562.field2272.method2045(var4);
                  field187[++class495.field3920 - 1] = var5.method1766();
                  field187[++class495.field3920 - 1] = var5.method1767();
               } else {
                  field187[++class495.field3920 - 1] = "";
                  field187[++class495.field3920 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var10 = field187[--class495.field3920];
               var10 = Client.method480(var10);
               field200[++class482.field3830 - 1] = class314.field2562.method1482(new class251(var10, class121.field1501)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = field200[--class482.field3830];
               if (null != class59.field1089 && var4 < class59.field1089.method2058() && class59.field1089.method2045(var4).method1765().equals(class259.field2281.field4112)) {
                  field200[++class482.field3830 - 1] = 1;
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (null != class59.field1089 && null != class59.field1089.field205) {
                  field187[++class495.field3920 - 1] = class59.field1089.field205;
               } else {
                  field187[++class495.field3920 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var4 = field200[--class482.field3830];
               if (null != class59.field1089 && var4 < class59.field1089.method2058() && ((class498)class59.field1089.method2045(var4)).method2436()) {
                  field200[++class482.field3830 - 1] = 1;
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class314.field2562.field2273.method2057();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class147(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class346(var6));
                     return 1;
                  } else if (var0 == 3631) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class296(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class502(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class97(var6));
                     return 1;
                  } else if (var0 == 3634) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class537(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class65(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class41(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class35(var6));
                     return 1;
                  } else if (var0 == 3638) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class333(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     class314.field2562.field2273.method2059();
                     return 1;
                  } else if (var0 == 3640) {
                     class314.field2562.field2272.method2057();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2272.method2050(new class147(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2272.method2050(new class346(var6));
                     return 1;
                  } else if (var0 == 3643) {
                     class314.field2562.field2272.method2059();
                     return 1;
                  } else if (var0 == 3644) {
                     if (null != class59.field1089) {
                        class59.field1089.method2057();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var6 = field200[--class482.field3830] == 1;
                     if (null != class59.field1089) {
                        class59.field1089.method2050(new class147(var6));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var6 = field200[--class482.field3830] == 1;
                     if (null != class59.field1089) {
                        class59.field1089.method2050(new class346(var6));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class296(var6));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class502(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class97(var6));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class537(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = field200[--class482.field3830] == 1;
                     if (null != class59.field1089) {
                        class59.field1089.method2050(new class65(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class41(var6));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var6 = field200[--class482.field3830] == 1;
                     if (null != class59.field1089) {
                        class59.field1089.method2050(new class35(var6));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class333(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (null != class59.field1089) {
                        class59.field1089.method2059();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = field200[--class482.field3830] == 1;
                     class314.field2562.field2273.method2050(new class42(var6));
                     return 1;
                  } else if (var0 == 3657) {
                     var6 = field200[--class482.field3830] == 1;
                     if (class59.field1089 != null) {
                        class59.field1089.method2050(new class42(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = field200[--class482.field3830];
               if (class59.field1089 != null && var4 < class59.field1089.method2058() && ((class498)class59.field1089.method2045(var4)).method2437()) {
                  field200[++class482.field3830 - 1] = 1;
               } else {
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   static int method181(int var0, class106 var1, boolean var2) {
      return 2;
   }

   static int method183(int var0, class106 var1, boolean var2) {
      if (var0 == 3800) {
         if (class190.field1876 != null) {
            field200[++class482.field3830 - 1] = 1;
            class393.field3080 = class190.field1876;
         } else {
            field200[++class482.field3830 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = field200[--class482.field3830];
            if (null != Client.field820[var4]) {
               field200[++class482.field3830 - 1] = 1;
               class393.field3080 = Client.field820[var4];
            } else {
               field200[++class482.field3830 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            field187[++class495.field3920 - 1] = class393.field3080.field150;
            return 1;
         } else if (var0 == 3803) {
            field200[++class482.field3830 - 1] = class393.field3080.field149 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            field200[++class482.field3830 - 1] = class393.field3080.field163;
            return 1;
         } else if (var0 == 3805) {
            field200[++class482.field3830 - 1] = class393.field3080.field151;
            return 1;
         } else if (var0 == 3806) {
            field200[++class482.field3830 - 1] = class393.field3080.field152;
            return 1;
         } else if (var0 == 3807) {
            field200[++class482.field3830 - 1] = class393.field3080.field153;
            return 1;
         } else if (var0 == 3809) {
            field200[++class482.field3830 - 1] = class393.field3080.field154;
            return 1;
         } else if (var0 == 3810) {
            var4 = field200[--class482.field3830];
            field187[++class495.field3920 - 1] = class393.field3080.field165[var4];
            return 1;
         } else if (var0 == 3811) {
            var4 = field200[--class482.field3830];
            field200[++class482.field3830 - 1] = class393.field3080.field156[var4];
            return 1;
         } else if (var0 == 3812) {
            field200[++class482.field3830 - 1] = class393.field3080.field147;
            return 1;
         } else if (var0 == 3813) {
            var4 = field200[--class482.field3830];
            field187[++class495.field3920 - 1] = class393.field3080.field166[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               class482.field3830 -= 3;
               var4 = field200[class482.field3830];
               var7 = field200[1 + class482.field3830];
               var6 = field200[class482.field3830 + 2];
               field200[++class482.field3830 - 1] = class393.field3080.method152(var4, var7, var6);
               return 1;
            } else if (var0 == 3815) {
               field200[++class482.field3830 - 1] = class393.field3080.field161;
               return 1;
            } else if (var0 == 3816) {
               field200[++class482.field3830 - 1] = class393.field3080.field146;
               return 1;
            } else if (var0 == 3817) {
               field200[++class482.field3830 - 1] = class393.field3080.method150(field187[--class495.field3920]);
               return 1;
            } else if (var0 == 3818) {
               field200[class482.field3830 - 1] = class393.field3080.method146()[field200[class482.field3830 - 1]];
               return 1;
            } else if (var0 == 3819) {
               class482.field3830 -= 2;
               var4 = field200[class482.field3830];
               var7 = field200[class482.field3830 + 1];
               Client.method533(var7, var4);
               return 1;
            } else if (var0 == 3820) {
               var4 = field200[--class482.field3830];
               field200[++class482.field3830 - 1] = class393.field3080.field159[var4];
               return 1;
            } else {
               if (var0 == 3821) {
                  class482.field3830 -= 3;
                  var4 = field200[class482.field3830];
                  boolean var5 = field200[1 + class482.field3830] == 1;
                  var6 = field200[class482.field3830 + 2];
                  class409.method1982(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = class393.field3080.field160[var4] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (null != class132.field1563) {
                     field200[++class482.field3830 - 1] = 1;
                     class530.field4171 = class132.field1563;
                  } else {
                     field200[++class482.field3830 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = field200[--class482.field3830];
                  if (null != Client.field821[var4]) {
                     field200[++class482.field3830 - 1] = 1;
                     class530.field4171 = Client.field821[var4];
                     class426.field3230 = var4;
                  } else {
                     field200[++class482.field3830 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  field187[++class495.field3920 - 1] = class530.field4171.field2460;
                  return 1;
               } else if (var0 == 3853) {
                  field200[++class482.field3830 - 1] = class530.field4171.field2459;
                  return 1;
               } else if (var0 == 3854) {
                  field200[++class482.field3830 - 1] = class530.field4171.field2455;
                  return 1;
               } else if (var0 == 3855) {
                  field200[++class482.field3830 - 1] = class530.field4171.method1604();
                  return 1;
               } else if (var0 == 3856) {
                  var4 = field200[--class482.field3830];
                  field187[++class495.field3920 - 1] = ((class219)class530.field4171.field2457.get(var4)).field2036.method1458();
                  return 1;
               } else if (var0 == 3857) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = ((class219)class530.field4171.field2457.get(var4)).field2037;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = ((class219)class530.field4171.field2457.get(var4)).field2038;
                  return 1;
               } else if (var0 == 3859) {
                  var4 = field200[--class482.field3830];
                  Client.method441(class426.field3230, var4);
                  return 1;
               } else if (var0 == 3860) {
                  field200[++class482.field3830 - 1] = class530.field4171.method1605(field187[--class495.field3920]);
                  return 1;
               } else if (var0 == 3861) {
                  field200[class482.field3830 - 1] = class530.field4171.method1606()[field200[class482.field3830 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  field200[++class482.field3830 - 1] = null != class158.field1687 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static int method219(int var0, class106 var1, boolean var2) {
      int var4;
      if (var0 == 3903) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field854[var4].method1101();
         return 1;
      } else if (var0 == 3904) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field854[var4].field1794;
         return 1;
      } else if (var0 == 3905) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field854[var4].field1798;
         return 1;
      } else if (var0 == 3906) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field854[var4].field1796;
         return 1;
      } else if (var0 == 3907) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field854[var4].field1797;
         return 1;
      } else if (var0 == 3908) {
         var4 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = Client.field854[var4].field1793;
         return 1;
      } else {
         int var14;
         if (var0 == 3910) {
            var4 = field200[--class482.field3830];
            var14 = Client.field854[var4].method1100();
            field200[++class482.field3830 - 1] = var14 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = field200[--class482.field3830];
            var14 = Client.field854[var4].method1100();
            field200[++class482.field3830 - 1] = var14 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = field200[--class482.field3830];
            var14 = Client.field854[var4].method1100();
            field200[++class482.field3830 - 1] = var14 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = field200[--class482.field3830];
            var14 = Client.field854[var4].method1100();
            field200[++class482.field3830 - 1] = var14 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = field200[--class482.field3830] == 1;
               if (class489.field3859 != null) {
                  class489.field3859.method2446(class504.field3963, var12);
               }

               return 1;
            } else if (var0 == 3915) {
               var12 = field200[--class482.field3830] == 1;
               if (null != class489.field3859) {
                  class489.field3859.method2446(class504.field3965, var12);
               }

               return 1;
            } else if (var0 == 3916) {
               class482.field3830 -= 2;
               var12 = field200[class482.field3830] == 1;
               boolean var13 = field200[1 + class482.field3830] == 1;
               if (null != class489.field3859) {
                  Client.field866.field1524 = var13;
                  class489.field3859.method2446(Client.field866, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = field200[--class482.field3830] == 1;
               if (null != class489.field3859) {
                  class489.field3859.method2446(class504.field3961, var12);
               }

               return 1;
            } else if (var0 == 3918) {
               var12 = field200[--class482.field3830] == 1;
               if (null != class489.field3859) {
                  class489.field3859.method2446(class504.field3964, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               field200[++class482.field3830 - 1] = class489.field3859 == null ? 0 : class489.field3859.field3962.size();
               return 1;
            } else {
               class82 var5;
               if (var0 == 3920) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  field200[++class482.field3830 - 1] = var5.field1257;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  field187[++class495.field3920 - 1] = var5.method715();
                  return 1;
               } else if (var0 == 3922) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  field187[++class495.field3920 - 1] = var5.method714();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  long var6 = class80.method713() - class236.field2168 - var5.field1255;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  field187[++class495.field3920 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  field200[++class482.field3830 - 1] = var5.field1253.field1796;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  field200[++class482.field3830 - 1] = var5.field1253.field1798;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = field200[--class482.field3830];
                  var5 = (class82)class489.field3859.field3962.get(var4);
                  field200[++class482.field3830 - 1] = var5.field1253.field1794;
                  return 1;
               } else if (var0 == 3939) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = class71.method682(var4).field1188 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static int method220(int var0, class106 var1, boolean var2) {
      int var5;
      int var10;
      if (var0 == 4000) {
         class482.field3830 -= 2;
         var10 = field200[class482.field3830];
         var5 = field200[class482.field3830 + 1];
         field200[++class482.field3830 - 1] = var10 + var5;
         return 1;
      } else if (var0 == 4001) {
         class482.field3830 -= 2;
         var10 = field200[class482.field3830];
         var5 = field200[1 + class482.field3830];
         field200[++class482.field3830 - 1] = var10 - var5;
         return 1;
      } else if (var0 == 4002) {
         class482.field3830 -= 2;
         var10 = field200[class482.field3830];
         var5 = field200[1 + class482.field3830];
         field200[++class482.field3830 - 1] = var10 * var5;
         return 1;
      } else if (var0 == 4003) {
         class482.field3830 -= 2;
         var10 = field200[class482.field3830];
         var5 = field200[1 + class482.field3830];
         field200[++class482.field3830 - 1] = var10 / var5;
         return 1;
      } else if (var0 == 4004) {
         var10 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = (int)(Math.random() * (double)var10);
         return 1;
      } else if (var0 == 4005) {
         var10 = field200[--class482.field3830];
         field200[++class482.field3830 - 1] = (int)(Math.random() * (double)(var10 + 1));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (var0 == 4006) {
            class482.field3830 -= 5;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            var6 = field200[2 + class482.field3830];
            var7 = field200[class482.field3830 + 3];
            var8 = field200[class482.field3830 + 4];
            field200[++class482.field3830 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
            return 1;
         } else if (var0 == 4007) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var5 * var10 / 100 + var10;
            return 1;
         } else if (var0 == 4008) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var10 | 1 << var5;
            return 1;
         } else if (var0 == 4009) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var10 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[1 + class482.field3830];
            field200[++class482.field3830 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var10 % var5;
            return 1;
         } else if (var0 == 4012) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[1 + class482.field3830];
            if (var10 == 0) {
               field200[++class482.field3830 - 1] = 0;
            } else {
               field200[++class482.field3830 - 1] = (int)Math.pow((double)var10, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            if (var10 == 0) {
               field200[++class482.field3830 - 1] = 0;
               return 1;
            } else {
               switch (var5) {
                  case 0:
                     field200[++class482.field3830 - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     field200[++class482.field3830 - 1] = var10;
                     break;
                  case 2:
                     field200[++class482.field3830 - 1] = (int)Math.sqrt((double)var10);
                     break;
                  case 3:
                     field200[++class482.field3830 - 1] = (int)Math.cbrt((double)var10);
                     break;
                  case 4:
                     field200[++class482.field3830 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
                     break;
                  default:
                     field200[++class482.field3830 - 1] = (int)Math.pow((double)var10, 1.0 / (double)var5);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var10 & var5;
            return 1;
         } else if (var0 == 4015) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var10 | var5;
            return 1;
         } else if (var0 == 4016) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[1 + class482.field3830];
            field200[++class482.field3830 - 1] = var10 < var5 ? var10 : var5;
            return 1;
         } else if (var0 == 4017) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var10 > var5 ? var10 : var5;
            return 1;
         } else if (var0 == 4018) {
            class482.field3830 -= 3;
            long var11 = (long)field200[class482.field3830];
            long var12 = (long)field200[1 + class482.field3830];
            long var13 = (long)field200[class482.field3830 + 2];
            field200[++class482.field3830 - 1] = (int)(var11 * var13 / var12);
            return 1;
         } else if (var0 == 4025) {
            var10 = class335.method1772(field200[--class482.field3830]);
            field200[++class482.field3830 - 1] = var10;
            return 1;
         } else if (var0 == 4026) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[1 + class482.field3830];
            field200[++class482.field3830 - 1] = var10 ^ 1 << var5;
            return 1;
         } else if (var0 == 4027) {
            class482.field3830 -= 3;
            var10 = field200[class482.field3830];
            var5 = field200[1 + class482.field3830];
            var6 = field200[2 + class482.field3830];
            field200[++class482.field3830 - 1] = class349.method1809(var10, var5, var6);
            return 1;
         } else if (var0 == 4028) {
            class482.field3830 -= 3;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            var6 = field200[2 + class482.field3830];
            field200[++class482.field3830 - 1] = class349.method1807(var10, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            class482.field3830 -= 3;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            var6 = field200[class482.field3830 + 2];
            var7 = 31 - var6;
            field200[++class482.field3830 - 1] = var10 << var7 >>> var7 + var5;
            return 1;
         } else if (var0 == 4030) {
            class482.field3830 -= 4;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            var6 = field200[2 + class482.field3830];
            var7 = field200[3 + class482.field3830];
            var10 = class349.method1807(var10, var6, var7);
            var8 = class349.method1805(1 + (var7 - var6));
            if (var5 > var8) {
               var5 = var8;
            }

            field200[++class482.field3830 - 1] = var10 | var5 << var6;
            return 1;
         } else if (var0 == 4032) {
            field200[class482.field3830 - 1] = class454.method2243(field200[class482.field3830 - 1]);
            return 1;
         } else if (var0 == 4033) {
            field200[class482.field3830 - 1] = class454.method2245(field200[class482.field3830 - 1]);
            return 1;
         } else if (var0 == 4034) {
            class482.field3830 -= 2;
            var10 = field200[class482.field3830];
            var5 = field200[class482.field3830 + 1];
            var6 = class454.method2244(var10, var5);
            field200[++class482.field3830 - 1] = var6;
            return 1;
         } else if (var0 == 4035) {
            field200[class482.field3830 - 1] = Math.abs(field200[class482.field3830 - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var4 = field187[--class495.field3920];
            var5 = -1;
            if (class330.method1742(var4)) {
               var5 = class330.method1736(var4);
            }

            field200[++class482.field3830 - 1] = var5;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static int method187(int var0, class106 var1, boolean var2) {
      String var4;
      int var10;
      if (var0 == 4100) {
         var4 = field187[--class495.field3920];
         var10 = field200[--class482.field3830];
         field187[++class495.field3920 - 1] = var4 + var10;
         return 1;
      } else {
         String var5;
         if (var0 == 4101) {
            class495.field3920 -= 2;
            var4 = field187[class495.field3920];
            var5 = field187[1 + class495.field3920];
            field187[++class495.field3920 - 1] = var4 + var5;
            return 1;
         } else if (var0 == 4102) {
            var4 = field187[--class495.field3920];
            var10 = field200[--class482.field3830];
            field187[++class495.field3920 - 1] = var4 + class330.method1732(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var4 = field187[--class495.field3920];
            field187[++class495.field3920 - 1] = var4.toLowerCase();
            return 1;
         } else {
            int var7;
            int var8;
            int var13;
            if (var0 == 4104) {
               var13 = field200[--class482.field3830];
               long var16 = 86400000L * ((long)var13 + 11745L);
               field193.setTime(new Date(var16));
               var7 = field193.get(5);
               var8 = field193.get(2);
               int var9 = field193.get(1);
               field187[++class495.field3920 - 1] = var7 + "-" + field194[var8] + "-" + var9;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var13 = field200[--class482.field3830];
                  field187[++class495.field3920 - 1] = Integer.toString(var13);
                  return 1;
               } else if (var0 == 4107) {
                  class495.field3920 -= 2;
                  field200[++class482.field3830 - 1] = class330.method1741(class442.method2162(field187[class495.field3920], field187[1 + class495.field3920], class219.field2034));
                  return 1;
               } else {
                  int var12;
                  byte[] var15;
                  class460 var17;
                  if (var0 == 4108) {
                     var4 = field187[--class495.field3920];
                     class482.field3830 -= 2;
                     var10 = field200[class482.field3830];
                     var12 = field200[1 + class482.field3830];
                     var15 = class522.field4124.method1629(var12, 0);
                     var17 = new class460(var15);
                     field200[++class482.field3830 - 1] = var17.method1568(var4, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var4 = field187[--class495.field3920];
                     class482.field3830 -= 2;
                     var10 = field200[class482.field3830];
                     var12 = field200[1 + class482.field3830];
                     var15 = class522.field4124.method1629(var12, 0);
                     var17 = new class460(var15);
                     field200[++class482.field3830 - 1] = var17.method1589(var4, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     class495.field3920 -= 2;
                     var4 = field187[class495.field3920];
                     var5 = field187[class495.field3920 + 1];
                     if (field200[--class482.field3830] == 1) {
                        field187[++class495.field3920 - 1] = var4;
                     } else {
                        field187[++class495.field3920 - 1] = var5;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var4 = field187[--class495.field3920];
                     field187[++class495.field3920 - 1] = class282.method1579(var4);
                     return 1;
                  } else if (var0 == 4112) {
                     var4 = field187[--class495.field3920];
                     var10 = field200[--class482.field3830];
                     field187[++class495.field3920 - 1] = var4 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var13 = field200[--class482.field3830];
                     field200[++class482.field3830 - 1] = class330.method1734((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var13 = field200[--class482.field3830];
                     field200[++class482.field3830 - 1] = class330.method1746((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var13 = field200[--class482.field3830];
                     field200[++class482.field3830 - 1] = class330.method1740((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var13 = field200[--class482.field3830];
                     field200[++class482.field3830 - 1] = class519.method2475((char)var13) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var4 = field187[--class495.field3920];
                     if (null != var4) {
                        field200[++class482.field3830 - 1] = var4.length();
                     } else {
                        field200[++class482.field3830 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var4 = field187[--class495.field3920];
                     class482.field3830 -= 2;
                     var10 = field200[class482.field3830];
                     var12 = field200[1 + class482.field3830];
                     field187[++class495.field3920 - 1] = var4.substring(var10, var12);
                     return 1;
                  } else if (var0 == 4119) {
                     var4 = field187[--class495.field3920];
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

                     field187[++class495.field3920 - 1] = var11.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var4 = field187[--class495.field3920];
                     var10 = field200[--class482.field3830];
                     field200[++class482.field3830 - 1] = var4.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class495.field3920 -= 2;
                     var4 = field187[class495.field3920];
                     var5 = field187[class495.field3920 + 1];
                     var12 = field200[--class482.field3830];
                     field200[++class482.field3830 - 1] = var4.indexOf(var5, var12);
                     return 1;
                  } else if (var0 == 4122) {
                     var4 = field187[--class495.field3920];
                     field187[++class495.field3920 - 1] = var4.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class495.field3920 -= 3;
                     var4 = field187[class495.field3920];
                     var5 = field187[1 + class495.field3920];
                     String var6 = field187[class495.field3920 + 2];
                     if (null == class259.field2281.field4096) {
                        field187[++class495.field3920 - 1] = var6;
                        return 1;
                     } else {
                        switch (class259.field2281.field4096.field2118) {
                           case 0:
                              field187[++class495.field3920 - 1] = var4;
                              break;
                           case 1:
                              field187[++class495.field3920 - 1] = var5;
                              break;
                           case 2:
                           default:
                              field187[++class495.field3920 - 1] = var6;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class495.field3920 -= 2;
               var4 = field187[class495.field3920];
               var5 = field187[class495.field3920 + 1];
               if (null != class259.field2281.field4096 && class259.field2281.field4096.field2116 != 0) {
                  field187[++class495.field3920 - 1] = var5;
               } else {
                  field187[++class495.field3920 - 1] = var4;
               }

               return 1;
            }
         }
      }
   }

   static int method189(int var0, class106 var1, boolean var2) {
      int var4;
      if (var0 == 4200) {
         var4 = field200[--class482.field3830];
         field187[++class495.field3920 - 1] = class71.method682(var4).field1160;
         return 1;
      } else {
         class71 var6;
         int var7;
         if (var0 == 4201) {
            class482.field3830 -= 2;
            var4 = field200[class482.field3830];
            var7 = field200[1 + class482.field3830];
            var6 = class71.method682(var4);
            if (var7 >= 1 && var7 <= 5 && var6.field1161[var7 - 1] != null) {
               field187[++class495.field3920 - 1] = var6.field1161[var7 - 1];
            } else {
               field187[++class495.field3920 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class482.field3830 -= 2;
            var4 = field200[class482.field3830];
            var7 = field200[1 + class482.field3830];
            var6 = class71.method682(var4);
            if (var7 >= 1 && var7 <= 5 && var6.field1162[var7 - 1] != null) {
               field187[++class495.field3920 - 1] = var6.field1162[var7 - 1];
            } else {
               field187[++class495.field3920 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = field200[--class482.field3830];
            field200[++class482.field3830 - 1] = class71.method682(var4).field1156;
            return 1;
         } else if (var0 == 4204) {
            var4 = field200[--class482.field3830];
            field200[++class482.field3830 - 1] = class71.method682(var4).field1155 == 1 ? 1 : 0;
            return 1;
         } else {
            class71 var5;
            if (var0 == 4205) {
               var4 = field200[--class482.field3830];
               var5 = class71.method682(var4);
               if (var5.field1151 == -1 && var5.field1178 >= 0) {
                  field200[++class482.field3830 - 1] = var5.field1178;
               } else {
                  field200[++class482.field3830 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = field200[--class482.field3830];
               var5 = class71.method682(var4);
               if (var5.field1151 >= 0 && var5.field1178 >= 0) {
                  field200[++class482.field3830 - 1] = var5.field1178;
               } else {
                  field200[++class482.field3830 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = field200[--class482.field3830];
               field200[++class482.field3830 - 1] = class71.method682(var4).field1148 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var4 = field200[--class482.field3830];
               var5 = class71.method682(var4);
               if (var5.field1191 == -1 && var5.field1150 >= 0) {
                  field200[++class482.field3830 - 1] = var5.field1150;
               } else {
                  field200[++class482.field3830 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = field200[--class482.field3830];
               var5 = class71.method682(var4);
               if (var5.field1191 >= 0 && var5.field1150 >= 0) {
                  field200[++class482.field3830 - 1] = var5.field1150;
               } else {
                  field200[++class482.field3830 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4210) {
               String var8 = field187[--class495.field3920];
               var7 = field200[--class482.field3830];
               Client.method475(var8, var7 == 1);
               field200[++class482.field3830 - 1] = class57.field1082;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class341.field2728 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = field200[--class482.field3830];
                  var7 = class71.method682(var4).method675();
                  if (var7 == -1) {
                     field200[++class482.field3830 - 1] = var7;
                  } else {
                     field200[++class482.field3830 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = class71.method682(var4).field1157;
                  return 1;
               } else if (var0 == 4215) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = class71.method682(var4).field1142;
                  return 1;
               } else if (var0 == 4216) {
                  var4 = field200[--class482.field3830];
                  field200[++class482.field3830 - 1] = class71.method682(var4).field1158;
                  return 1;
               } else if (var0 == 4217) {
                  var4 = field200[--class482.field3830];
                  var5 = class71.method682(var4);
                  field200[++class482.field3830 - 1] = var5.field1146;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class235.field2147 != null && class341.field2728 < class57.field1082) {
                  field200[++class482.field3830 - 1] = class235.field2147[++class341.field2728 - 1] & '\uffff';
               } else {
                  field200[++class482.field3830 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   static int method221(int var0, class106 var1, boolean var2) {
      if (var0 == 5000) {
         field200[++class482.field3830 - 1] = Client.field809;
         return 1;
      } else if (var0 == 5001) {
         class482.field3830 -= 3;
         Client.field809 = field200[class482.field3830];
         class169.field1723 = class321.method1696(field200[class482.field3830 + 1]);
         if (null == class169.field1723) {
            class169.field1723 = class321.field2592;
         }

         Client.field810 = field200[class482.field3830 + 2];
         class335 var14 = class335.createPacket(ClientPacket.field1011, Client.field641.field2758);
         var14.buffer.method1114(Client.field809);
         var14.buffer.method1114(class169.field1723.field2591);
         var14.buffer.method1114(Client.field810);
         Client.field641.method1797(var14);
         return 1;
      } else {
         String var4;
         class335 var7;
         int var9;
         int var11;
         if (var0 == 5002) {
            var4 = field187[--class495.field3920];
            class482.field3830 -= 2;
            var9 = field200[class482.field3830];
            var11 = field200[class482.field3830 + 1];
            var7 = class335.createPacket(ClientPacket.field1015, Client.field641.field2758);
            var7.buffer.method1114(class184.method1188(var4) + 2);
            var7.buffer.method1117(var4);
            var7.buffer.method1114(var9 - 1);
            var7.buffer.method1114(var11);
            Client.field641.method1797(var7);
            return 1;
         } else {
            class461 var6;
            int var8;
            if (var0 == 5003) {
               class482.field3830 -= 2;
               var8 = field200[class482.field3830];
               var9 = field200[1 + class482.field3830];
               var6 = class194.method1215(var8, var9);
               if (null != var6) {
                  field200[++class482.field3830 - 1] = var6.field3585;
                  field200[++class482.field3830 - 1] = var6.field3581;
                  field187[++class495.field3920 - 1] = null != var6.field3583 ? var6.field3583 : "";
                  field187[++class495.field3920 - 1] = var6.field3587 != null ? var6.field3587 : "";
                  field187[++class495.field3920 - 1] = var6.field3588 != null ? var6.field3588 : "";
                  field200[++class482.field3830 - 1] = var6.method2258() ? 1 : (var6.method2256() ? 2 : 0);
               } else {
                  field200[++class482.field3830 - 1] = -1;
                  field200[++class482.field3830 - 1] = 0;
                  field187[++class495.field3920 - 1] = "";
                  field187[++class495.field3920 - 1] = "";
                  field187[++class495.field3920 - 1] = "";
                  field200[++class482.field3830 - 1] = 0;
               }

               return 1;
            } else {
               class461 var5;
               if (var0 == 5004) {
                  var8 = field200[--class482.field3830];
                  var5 = class194.method1210(var8);
                  if (var5 != null) {
                     field200[++class482.field3830 - 1] = var5.field3582;
                     field200[++class482.field3830 - 1] = var5.field3581;
                     field187[++class495.field3920 - 1] = null != var5.field3583 ? var5.field3583 : "";
                     field187[++class495.field3920 - 1] = null != var5.field3587 ? var5.field3587 : "";
                     field187[++class495.field3920 - 1] = null != var5.field3588 ? var5.field3588 : "";
                     field200[++class482.field3830 - 1] = var5.method2258() ? 1 : (var5.method2256() ? 2 : 0);
                  } else {
                     field200[++class482.field3830 - 1] = -1;
                     field200[++class482.field3830 - 1] = 0;
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field187[++class495.field3920 - 1] = "";
                     field200[++class482.field3830 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (null == class169.field1723) {
                     field200[++class482.field3830 - 1] = -1;
                  } else {
                     field200[++class482.field3830 - 1] = class169.field1723.field2591;
                  }

                  return 1;
               } else {
                  class335 var12;
                  if (var0 == 5008) {
                     var4 = field187[--class495.field3920];
                     var9 = field200[--class482.field3830];
                     var12 = class499.method2442(var9, var4, class219.field2034, -1);
                     Client.field641.method1797(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     class495.field3920 -= 2;
                     var4 = field187[class495.field3920];
                     String var10 = field187[class495.field3920 + 1];
                     var12 = class335.createPacket(ClientPacket.field1016, Client.field641.field2758);
                     var12.buffer.method1155(0);
                     int var13 = var12.buffer.field1818;
                     var12.buffer.method1117(var4);
                     class68.method653(var12.buffer, var10);
                     var12.buffer.method1122(var12.buffer.field1818 - var13);
                     Client.field641.method1797(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = field187[--class495.field3920];
                     class482.field3830 -= 2;
                     var9 = field200[class482.field3830];
                     var11 = field200[class482.field3830 + 1];
                     var7 = class499.method2442(var9, var4, class219.field2034, var11);
                     Client.field641.method1797(var7);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        field200[++class482.field3830 - 1] = Client.field810;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = field200[--class482.field3830];
                        field200[++class482.field3830 - 1] = class194.method1213(var8);
                        return 1;
                     } else if (var0 == 5018) {
                        var8 = field200[--class482.field3830];
                        field200[++class482.field3830 - 1] = class194.method1214(var8);
                        return 1;
                     } else if (var0 == 5019) {
                        var8 = field200[--class482.field3830];
                        field200[++class482.field3830 - 1] = class194.method1212(var8);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = field187[--class495.field3920];
                        class52.method603(var4);
                        return 1;
                     } else if (var0 == 5021) {
                        Client.field604 = field187[--class495.field3920].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        field187[++class495.field3920 - 1] = Client.field604;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = field187[--class495.field3920];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5030) {
                        class482.field3830 -= 2;
                        var8 = field200[class482.field3830];
                        var9 = field200[class482.field3830 + 1];
                        var6 = class194.method1215(var8, var9);
                        if (var6 != null) {
                           field200[++class482.field3830 - 1] = var6.field3585;
                           field200[++class482.field3830 - 1] = var6.field3581;
                           field187[++class495.field3920 - 1] = var6.field3583 != null ? var6.field3583 : "";
                           field187[++class495.field3920 - 1] = var6.field3587 != null ? var6.field3587 : "";
                           field187[++class495.field3920 - 1] = null != var6.field3588 ? var6.field3588 : "";
                           field200[++class482.field3830 - 1] = var6.method2258() ? 1 : (var6.method2256() ? 2 : 0);
                           field187[++class495.field3920 - 1] = "";
                           field200[++class482.field3830 - 1] = 0;
                        } else {
                           field200[++class482.field3830 - 1] = -1;
                           field200[++class482.field3830 - 1] = 0;
                           field187[++class495.field3920 - 1] = "";
                           field187[++class495.field3920 - 1] = "";
                           field187[++class495.field3920 - 1] = "";
                           field200[++class482.field3830 - 1] = 0;
                           field187[++class495.field3920 - 1] = "";
                           field200[++class482.field3830 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var8 = field200[--class482.field3830];
                        var5 = class194.method1210(var8);
                        if (var5 != null) {
                           field200[++class482.field3830 - 1] = var5.field3582;
                           field200[++class482.field3830 - 1] = var5.field3581;
                           field187[++class495.field3920 - 1] = null != var5.field3583 ? var5.field3583 : "";
                           field187[++class495.field3920 - 1] = var5.field3587 != null ? var5.field3587 : "";
                           field187[++class495.field3920 - 1] = null != var5.field3588 ? var5.field3588 : "";
                           field200[++class482.field3830 - 1] = var5.method2258() ? 1 : (var5.method2256() ? 2 : 0);
                           field187[++class495.field3920 - 1] = "";
                           field200[++class482.field3830 - 1] = 0;
                        } else {
                           field200[++class482.field3830 - 1] = -1;
                           field200[++class482.field3830 - 1] = 0;
                           field187[++class495.field3920 - 1] = "";
                           field187[++class495.field3920 - 1] = "";
                           field187[++class495.field3920 - 1] = "";
                           field200[++class482.field3830 - 1] = 0;
                           field187[++class495.field3920 - 1] = "";
                           field200[++class482.field3830 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (null != class259.field2281 && null != class259.field2281.field4112) {
                        var4 = class259.field2281.field4112.method1458();
                     } else {
                        var4 = "";
                     }

                     field187[++class495.field3920 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }

   static int method205(int var0, class106 var1, boolean var2) {
      if (var0 == 5306) {
         field200[++class482.field3830 - 1] = Client.method484();
         return 1;
      } else {
         int var4;
         if (var0 == 5307) {
            var4 = field200[--class482.field3830];
            if (var4 == 1 || var4 == 2) {
               class353.method1816(var4);
            }

            return 1;
         } else if (var0 == 5308) {
            field200[++class482.field3830 - 1] = class4.field36.method2420();
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --class482.field3830;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = field200[--class482.field3830];
            if (var4 == 1 || var4 == 2) {
               class4.field36.method2419(var4);
            }

            return 1;
         }
      }
   }

   static int method226(int var0, class106 var1, boolean var2) {
      int var4;
      if (var0 == 5504) {
         class482.field3830 -= 2;
         var4 = field200[class482.field3830];
         int var5 = field200[class482.field3830 + 1];
         if (!Client.field837) {
            Client.field615 = var4;
            Client.field754 = var5;
         }

         return 1;
      } else if (var0 == 5505) {
         field200[++class482.field3830 - 1] = Client.field615;
         return 1;
      } else if (var0 == 5506) {
         field200[++class482.field3830 - 1] = Client.field754;
         return 1;
      } else if (var0 == 5530) {
         var4 = field200[--class482.field3830];
         if (var4 < 0) {
            var4 = 0;
         }

         Client.field670 = var4;
         return 1;
      } else if (var0 == 5531) {
         field200[++class482.field3830 - 1] = Client.field670;
         return 1;
      } else {
         return 2;
      }
   }

   static int method176(int var0, class106 var1, boolean var2) {
      if (var0 == 5630) {
         Client.field629 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   static int method198(int var0) {
      return (int)Math.pow(2.0, (double)(7.0F + (float)var0 / 256.0F));
   }

   static int method217(int var0) {
      return (int)((Math.log((double)var0) / field199 - 7.0) * 256.0);
   }

   static int method199(int var0, class106 var1, boolean var2) {
      if (var0 == 6500) {
         field200[++class482.field3830 - 1] = class230.method1411() ? 1 : 0;
         return 1;
      } else {
         class230 var9;
         if (var0 == 6501) {
            var9 = class230.method1408();
            if (var9 != null) {
               field200[++class482.field3830 - 1] = var9.field2133;
               field200[++class482.field3830 - 1] = var9.field2129;
               field187[++class495.field3920 - 1] = var9.field2137;
               field200[++class482.field3830 - 1] = var9.field2138;
               field200[++class482.field3830 - 1] = var9.field2135;
               field187[++class495.field3920 - 1] = var9.field2136;
            } else {
               field200[++class482.field3830 - 1] = -1;
               field200[++class482.field3830 - 1] = 0;
               field187[++class495.field3920 - 1] = "";
               field200[++class482.field3830 - 1] = 0;
               field200[++class482.field3830 - 1] = 0;
               field187[++class495.field3920 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var9 = class230.method1415();
            if (var9 != null) {
               field200[++class482.field3830 - 1] = var9.field2133;
               field200[++class482.field3830 - 1] = var9.field2129;
               field187[++class495.field3920 - 1] = var9.field2137;
               field200[++class482.field3830 - 1] = var9.field2138;
               field200[++class482.field3830 - 1] = var9.field2135;
               field187[++class495.field3920 - 1] = var9.field2136;
            } else {
               field200[++class482.field3830 - 1] = -1;
               field200[++class482.field3830 - 1] = 0;
               field187[++class495.field3920 - 1] = "";
               field200[++class482.field3830 - 1] = 0;
               field200[++class482.field3830 - 1] = 0;
               field187[++class495.field3920 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            class230 var5;
            int var11;
            if (var0 == 6506) {
               var4 = field200[--class482.field3830];
               var5 = null;

               for(var11 = 0; var11 < class230.field2134; ++var11) {
                  if (var4 == class263.field2288[var11].field2133) {
                     var5 = class263.field2288[var11];
                     break;
                  }
               }

               if (var5 != null) {
                  field200[++class482.field3830 - 1] = var5.field2133;
                  field200[++class482.field3830 - 1] = var5.field2129;
                  field187[++class495.field3920 - 1] = var5.field2137;
                  field200[++class482.field3830 - 1] = var5.field2138;
                  field200[++class482.field3830 - 1] = var5.field2135;
                  field187[++class495.field3920 - 1] = var5.field2136;
               } else {
                  field200[++class482.field3830 - 1] = -1;
                  field200[++class482.field3830 - 1] = 0;
                  field187[++class495.field3920 - 1] = "";
                  field200[++class482.field3830 - 1] = 0;
                  field200[++class482.field3830 - 1] = 0;
                  field187[++class495.field3920 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class482.field3830 -= 4;
               var4 = field200[class482.field3830];
               boolean var10 = field200[class482.field3830 + 1] == 1;
               var11 = field200[class482.field3830 + 2];
               boolean var7 = field200[class482.field3830 + 3] == 1;
               class230.method1413(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  Client.field734 = field200[--class482.field3830] == 1;
                  return 1;
               } else {
                  class206 var6;
                  int var8;
                  if (var0 == 6513) {
                     class482.field3830 -= 2;
                     var4 = field200[class482.field3830];
                     var8 = field200[1 + class482.field3830];
                     var6 = class206.method1260(var8);
                     if (var6.method1257()) {
                        field187[++class495.field3920 - 1] = class453.method2242(var4).method2239(var8, var6.field1945);
                     } else {
                        field200[++class482.field3830 - 1] = class453.method2242(var4).method2241(var8, var6.field1941);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class482.field3830 -= 2;
                     var4 = field200[class482.field3830];
                     var8 = field200[class482.field3830 + 1];
                     var6 = class206.method1260(var8);
                     if (var6.method1257()) {
                        field187[++class495.field3920 - 1] = class444.method2172(var4, (byte)-25).method2217(var8, var6.field1945);
                     } else {
                        field200[++class482.field3830 - 1] = class444.method2172(var4, (byte)32).method2216(var8, var6.field1941);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class482.field3830 -= 2;
                     var4 = field200[class482.field3830];
                     var8 = field200[1 + class482.field3830];
                     var6 = class206.method1260(var8);
                     if (var6.method1257()) {
                        field187[++class495.field3920 - 1] = class71.method682(var4).method664(var8, var6.field1945);
                     } else {
                        field200[++class482.field3830 - 1] = class71.method682(var4).method673(var8, var6.field1941);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class482.field3830 -= 2;
                     var4 = field200[class482.field3830];
                     var8 = field200[1 + class482.field3830];
                     var6 = class206.method1260(var8);
                     if (var6.method1257()) {
                        field187[++class495.field3920 - 1] = class135.method901(var4).method899(var8, var6.field1945);
                     } else {
                        field200[++class482.field3830 - 1] = class135.method901(var4).method898(var8, var6.field1941);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     field200[++class482.field3830 - 1] = Client.field811 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     field200[++class482.field3830 - 1] = Client.field582;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class495.field3920;
                     --class482.field3830;
                     return 1;
                  } else if (var0 == 6523) {
                     --class495.field3920;
                     --class482.field3830;
                     return 1;
                  } else if (var0 == 6524) {
                     field200[++class482.field3830 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     field200[++class482.field3830 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     field200[++class482.field3830 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     field200[++class482.field3830 - 1] = Client.field594;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = field200[--class482.field3830];
               if (var4 >= 0 && var4 < class230.field2134) {
                  var5 = class263.field2288[var4];
                  field200[++class482.field3830 - 1] = var5.field2133;
                  field200[++class482.field3830 - 1] = var5.field2129;
                  field187[++class495.field3920 - 1] = var5.field2137;
                  field200[++class482.field3830 - 1] = var5.field2138;
                  field200[++class482.field3830 - 1] = var5.field2135;
                  field187[++class495.field3920 - 1] = var5.field2136;
               } else {
                  field200[++class482.field3830 - 1] = -1;
                  field200[++class482.field3830 - 1] = 0;
                  field187[++class495.field3920 - 1] = "";
                  field200[++class482.field3830 - 1] = 0;
                  field200[++class482.field3830 - 1] = 0;
                  field187[++class495.field3920 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   static int method177(int var0, class106 var1, boolean var2) {
      int var4;
      if (var0 == 6600) {
         var4 = class192.field1881;
         int var17 = class69.field1134 + (class259.field2281.field4028 >> 7);
         int var13 = (class259.field2281.field3999 >> 7) + class478.field3659;
         Client.method487().method22(var4, var17, var13, true);
         return 1;
      } else {
         class475 var8;
         if (var0 == 6601) {
            var4 = field200[--class482.field3830];
            String var16 = "";
            var8 = Client.method487().method61(var4);
            if (var8 != null) {
               var16 = var8.method2297();
            }

            field187[++class495.field3920 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var4 = field200[--class482.field3830];
            Client.method487().method26(var4);
            return 1;
         } else if (var0 == 6603) {
            field200[++class482.field3830 - 1] = Client.method487().method37();
            return 1;
         } else if (var0 == 6604) {
            var4 = field200[--class482.field3830];
            Client.method487().method35(var4);
            return 1;
         } else if (var0 == 6605) {
            field200[++class482.field3830 - 1] = Client.method487().method67() ? 1 : 0;
            return 1;
         } else {
            class89 var15;
            if (var0 == 6606) {
               var15 = new class89(field200[--class482.field3830]);
               Client.method487().method39(var15.field1273, var15.field1275);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class89(field200[--class482.field3830]);
               Client.method487().method40(var15.field1273, var15.field1275);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class89(field200[--class482.field3830]);
               Client.method487().method41(var15.field1274, var15.field1273, var15.field1275);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class89(field200[--class482.field3830]);
               Client.method487().method42(var15.field1274, var15.field1273, var15.field1275);
               return 1;
            } else if (var0 == 6610) {
               field200[++class482.field3830 - 1] = Client.method487().method43();
               field200[++class482.field3830 - 1] = Client.method487().method66();
               return 1;
            } else {
               class475 var12;
               if (var0 == 6611) {
                  var4 = field200[--class482.field3830];
                  var12 = Client.method487().method61(var4);
                  if (var12 == null) {
                     field200[++class482.field3830 - 1] = 0;
                  } else {
                     field200[++class482.field3830 - 1] = var12.method2305().method721();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = field200[--class482.field3830];
                  var12 = Client.method487().method61(var4);
                  if (null == var12) {
                     field200[++class482.field3830 - 1] = 0;
                     field200[++class482.field3830 - 1] = 0;
                  } else {
                     field200[++class482.field3830 - 1] = (var12.method2311() - var12.method2300() + 1) * 64;
                     field200[++class482.field3830 - 1] = (var12.method2307() - var12.method2309() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = field200[--class482.field3830];
                  var12 = Client.method487().method61(var4);
                  if (var12 == null) {
                     field200[++class482.field3830 - 1] = 0;
                     field200[++class482.field3830 - 1] = 0;
                     field200[++class482.field3830 - 1] = 0;
                     field200[++class482.field3830 - 1] = 0;
                  } else {
                     field200[++class482.field3830 - 1] = var12.method2300() * 64;
                     field200[++class482.field3830 - 1] = var12.method2309() * 64;
                     field200[++class482.field3830 - 1] = var12.method2311() * 64 + 64 - 1;
                     field200[++class482.field3830 - 1] = var12.method2307() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = field200[--class482.field3830];
                  var12 = Client.method487().method61(var4);
                  if (null == var12) {
                     field200[++class482.field3830 - 1] = -1;
                  } else {
                     field200[++class482.field3830 - 1] = var12.method2299();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = Client.method487().method23();
                  if (null == var15) {
                     field200[++class482.field3830 - 1] = -1;
                     field200[++class482.field3830 - 1] = -1;
                  } else {
                     field200[++class482.field3830 - 1] = var15.field1273;
                     field200[++class482.field3830 - 1] = var15.field1275;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  field200[++class482.field3830 - 1] = Client.method487().method27();
                  return 1;
               } else if (var0 == 6617) {
                  var15 = new class89(field200[--class482.field3830]);
                  var12 = Client.method487().method28();
                  if (null == var12) {
                     field200[++class482.field3830 - 1] = -1;
                     field200[++class482.field3830 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.method2306(var15.field1274, var15.field1273, var15.field1275);
                     if (var11 == null) {
                        field200[++class482.field3830 - 1] = -1;
                        field200[++class482.field3830 - 1] = -1;
                     } else {
                        field200[++class482.field3830 - 1] = var11[0];
                        field200[++class482.field3830 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  class89 var6;
                  if (var0 == 6618) {
                     var15 = new class89(field200[--class482.field3830]);
                     var12 = Client.method487().method28();
                     if (var12 == null) {
                        field200[++class482.field3830 - 1] = -1;
                        field200[++class482.field3830 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.method2294(var15.field1273, var15.field1275);
                        if (var6 == null) {
                           field200[++class482.field3830 - 1] = -1;
                        } else {
                           field200[++class482.field3830 - 1] = var6.method721();
                        }

                        return 1;
                     }
                  } else {
                     class89 var9;
                     if (var0 == 6619) {
                        class482.field3830 -= 2;
                        var4 = field200[class482.field3830];
                        var9 = new class89(field200[1 + class482.field3830]);
                        class514.method2464(var4, var9, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class482.field3830 -= 2;
                        var4 = field200[class482.field3830];
                        var9 = new class89(field200[1 + class482.field3830]);
                        class514.method2464(var4, var9, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class482.field3830 -= 2;
                        var4 = field200[class482.field3830];
                        var9 = new class89(field200[class482.field3830 + 1]);
                        var8 = Client.method487().method61(var4);
                        if (null == var8) {
                           field200[++class482.field3830 - 1] = 0;
                           return 1;
                        } else {
                           field200[++class482.field3830 - 1] = var8.method2293(var9.field1274, var9.field1273, var9.field1275) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        field200[++class482.field3830 - 1] = Client.method487().method45();
                        field200[++class482.field3830 - 1] = Client.method487().method46();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new class89(field200[--class482.field3830]);
                        var12 = Client.method487().method24(var15.field1274, var15.field1273, var15.field1275);
                        if (null == var12) {
                           field200[++class482.field3830 - 1] = -1;
                        } else {
                           field200[++class482.field3830 - 1] = var12.method2302();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        Client.method487().method47(field200[--class482.field3830]);
                        return 1;
                     } else if (var0 == 6625) {
                        Client.method487().method48();
                        return 1;
                     } else if (var0 == 6626) {
                        Client.method487().method49(field200[--class482.field3830]);
                        return 1;
                     } else if (var0 == 6627) {
                        Client.method487().method50();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = field200[--class482.field3830] == 1;
                           Client.method487().method51(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = field200[--class482.field3830];
                           Client.method487().method33(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = field200[--class482.field3830];
                           Client.method487().method52(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           Client.method487().method53();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = field200[--class482.field3830] == 1;
                           Client.method487().method54(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (var0 == 6633) {
                              class482.field3830 -= 2;
                              var4 = field200[class482.field3830];
                              var10 = field200[class482.field3830 + 1] == 1;
                              Client.method487().method62(var4, var10);
                              return 1;
                           } else if (var0 == 6634) {
                              class482.field3830 -= 2;
                              var4 = field200[class482.field3830];
                              var10 = field200[class482.field3830 + 1] == 1;
                              Client.method487().method25(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              field200[++class482.field3830 - 1] = Client.method487().method55() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = field200[--class482.field3830];
                              field200[++class482.field3830 - 1] = Client.method487().method71(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = field200[--class482.field3830];
                              field200[++class482.field3830 - 1] = Client.method487().method56(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class482.field3830 -= 2;
                              var4 = field200[class482.field3830];
                              var9 = new class89(field200[1 + class482.field3830]);
                              var6 = Client.method487().method59(var4, var9);
                              if (null == var6) {
                                 field200[++class482.field3830 - 1] = -1;
                              } else {
                                 field200[++class482.field3830 - 1] = var6.method721();
                              }

                              return 1;
                           } else {
                              class373 var7;
                              if (var0 == 6639) {
                                 var7 = Client.method487().method18();
                                 if (null == var7) {
                                    field200[++class482.field3830 - 1] = -1;
                                    field200[++class482.field3830 - 1] = -1;
                                 } else {
                                    field200[++class482.field3830 - 1] = var7.method1871();
                                    field200[++class482.field3830 - 1] = var7.field2922.method721();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = Client.method487().method60();
                                 if (null == var7) {
                                    field200[++class482.field3830 - 1] = -1;
                                    field200[++class482.field3830 - 1] = -1;
                                 } else {
                                    field200[++class482.field3830 - 1] = var7.method1871();
                                    field200[++class482.field3830 - 1] = var7.field2922.method721();
                                 }

                                 return 1;
                              } else {
                                 class444 var5;
                                 if (var0 == 6693) {
                                    var4 = field200[--class482.field3830];
                                    var5 = class444.method2173(var4);
                                    if (null == var5.field3369) {
                                       field187[++class495.field3920 - 1] = "";
                                    } else {
                                       field187[++class495.field3920 - 1] = var5.field3369;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = field200[--class482.field3830];
                                    var5 = class444.method2173(var4);
                                    field200[++class482.field3830 - 1] = var5.field3371;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = field200[--class482.field3830];
                                    var5 = class444.method2173(var4);
                                    if (var5 == null) {
                                       field200[++class482.field3830 - 1] = -1;
                                    } else {
                                       field200[++class482.field3830 - 1] = var5.field3384;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = field200[--class482.field3830];
                                    var5 = class444.method2173(var4);
                                    if (var5 == null) {
                                       field200[++class482.field3830 - 1] = -1;
                                    } else {
                                       field200[++class482.field3830 - 1] = var5.field3367;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    field200[++class482.field3830 - 1] = class126.field1523.field1121;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    field200[++class482.field3830 - 1] = class126.field1523.field1119.method721();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    field200[++class482.field3830 - 1] = class126.field1523.field1120.method721();
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

   static int method192(int var0, class106 var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = field200[--class482.field3830];
         class453 var7 = class453.method2242(var6);
         field187[++class495.field3920 - 1] = null != var7 ? var7.field3514 : "";
         return 1;
      } else {
         class453 var4;
         if (var0 == 6764) {
            class482.field3830 -= 2;
            var4 = class453.method2242(field200[class482.field3830]);
            int var5 = field200[class482.field3830 + 1];
            field200[++class482.field3830 - 1] = var4.method2233(var5);
            field200[++class482.field3830 - 1] = var4.method2238(var5);
            return 1;
         } else if (var0 == 6765) {
            var4 = class453.method2242(field200[--class482.field3830]);
            field200[++class482.field3830 - 1] = null != var4 ? var4.field3538 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static int method207(int var0, class106 var1, boolean var2) {
      if (var0 == 6809) {
         int var4 = field200[--class482.field3830];
         class449 var5 = class444.method2172(var4, (byte)104);
         field187[++class495.field3920 - 1] = null != var5 ? var5.field3445 : "";
         return 1;
      } else {
         return 2;
      }
   }

   static int method186(int var0, class106 var1, boolean var2) {
      return 2;
   }

   static int method180(int var0, class106 var1, boolean var2) {
      return 2;
   }

   static int method195(int var0, class106 var1, boolean var2) {
      if (var0 == 7108) {
         field200[++class482.field3830 - 1] = Client.method547() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static int method202(int var0, class106 var1, boolean var2) {
      return 2;
   }

   static int method182(int var0, class106 var1, boolean var2) {
      int var4;
      Object var5;
      int var6;
      class270 var7;
      int var8;
      if (var0 != 7500 && var0 != 7508) {
         if (var0 != 7501) {
            int var21;
            int var23;
            if (var0 == 7502) {
               class482.field3830 -= 3;
               var4 = field200[class482.field3830];
               var21 = field200[1 + class482.field3830];
               var6 = field200[class482.field3830 + 2];
               var23 = class463.method2264(var21);
               var8 = class463.method2265(var21);
               int var25 = class463.method2266(var21);
               class116 var26 = class116.method822(var4);
               class150 var27 = class150.method936(var23);
               int[] var28 = var27.field1620[var8];
               int var13 = 0;
               int var14 = var28.length;
               if (var25 >= 0) {
                  if (var25 >= var14) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                  }

                  var13 = var25;
                  var14 = var25 + 1;
               }

               Object[] var15 = var26.method819(var8);
               if (null == var15 && null != var27.field1621) {
                  var15 = var27.field1621[var8];
               }

               int var16;
               int var17;
               if (null == var15) {
                  for(var16 = var13; var16 < var14; ++var16) {
                     var17 = var28[var16];
                     class247 var29 = class302.method1662(var17);
                     if (var29 == class247.field2219) {
                        field187[++class495.field3920 - 1] = "";
                     } else {
                        field200[++class482.field3830 - 1] = class302.method1661(var17);
                     }
                  }

                  return 1;
               } else {
                  var16 = var15.length / var28.length;
                  if (var6 >= 0 && var6 < var16) {
                     for(var17 = var13; var17 < var14; ++var17) {
                        int var18 = var17 + var28.length * var6;
                        class247 var19 = class302.method1662(var28[var17]);
                        if (var19 == class247.field2219) {
                           field187[++class495.field3920 - 1] = (String)var15[var18];
                        } else {
                           field200[++class482.field3830 - 1] = (Integer)var15[var18];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == 7503) {
               class482.field3830 -= 2;
               var4 = field200[class482.field3830];
               var21 = field200[1 + class482.field3830];
               var6 = 0;
               var23 = class463.method2264(var21);
               var8 = class463.method2265(var21);
               class116 var24 = class116.method822(var4);
               class150 var10 = class150.method936(var23);
               int[] var11 = var10.field1620[var8];
               Object[] var12 = var24.method819(var8);
               if (null == var12 && null != var10.field1621) {
                  var12 = var10.field1621[var8];
               }

               if (null != var12) {
                  var6 = var12.length / var11.length;
               }

               field200[++class482.field3830 - 1] = var6;
               return 1;
            } else if (var0 != 7504 && var0 != 7510) {
               if (var0 == 7505) {
                  var4 = field200[--class482.field3830];
                  class116 var22 = class116.method822(var4);
                  field200[++class482.field3830 - 1] = var22.field1477;
                  return 1;
               } else if (var0 == 7506) {
                  var4 = field200[--class482.field3830];
                  var21 = -1;
                  if (null != class395.field3087 && var4 >= 0 && var4 < class395.field3087.size()) {
                     var21 = (Integer)class395.field3087.get(var4);
                  }

                  field200[++class482.field3830 - 1] = var21;
                  return 1;
               } else if (var0 != 7507 && var0 != 7509) {
                  return 2;
               } else {
                  var4 = field200[--class482.field3830];
                  var5 = method210(var4);
                  var6 = field200[--class482.field3830];
                  var7 = Client.method527(var6);
                  if (var7 == null) {
                     throw new RuntimeException();
                  } else if (class463.method2264(var6) != Client.field870) {
                     throw new RuntimeException();
                  } else if (null == class395.field3087 && class395.field3087.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var8 = class463.method2266(var6);
                     List var9 = var7.method1517(var5, var8);
                     class395.field3087 = new LinkedList(class395.field3087);
                     if (var9 != null) {
                        class395.field3087.retainAll(var9);
                     } else {
                        class395.field3087.clear();
                     }

                     class186.field1841 = class395.field3087.iterator();
                     if (var0 == 7507) {
                        field200[++class482.field3830 - 1] = class395.field3087.size();
                     }

                     return 1;
                  }
               }
            } else {
               --class482.field3830;
               var4 = field200[class482.field3830];
               class270 var20 = Client.method546(var4);
               if (var20 == null) {
                  throw new RuntimeException();
               } else {
                  class395.field3087 = var20.method1517(0, 0);
                  var6 = 0;
                  if (class395.field3087 != null) {
                     Client.field870 = var4;
                     class186.field1841 = class395.field3087.iterator();
                     var6 = class395.field3087.size();
                  }

                  if (var0 == 7504) {
                     field200[++class482.field3830 - 1] = var6;
                  }

                  return 1;
               }
            }
         } else {
            if (class186.field1841 != null && class186.field1841.hasNext()) {
               field200[++class482.field3830 - 1] = (Integer)class186.field1841.next();
            } else {
               field200[++class482.field3830 - 1] = -1;
            }

            return 1;
         }
      } else {
         var4 = field200[--class482.field3830];
         var5 = method210(var4);
         var6 = field200[--class482.field3830];
         var7 = Client.method527(var6);
         if (null == var7) {
            throw new RuntimeException();
         } else {
            var8 = class463.method2266(var6);
            class395.field3087 = var7.method1517(var5, var8);
            if (null != class395.field3087) {
               Client.field870 = class463.method2264(var6);
               class186.field1841 = class395.field3087.iterator();
               if (var0 == 7500) {
                  field200[++class482.field3830 - 1] = class395.field3087.size();
               }
            } else {
               Client.field870 = -1;
               class186.field1841 = null;
               if (var0 == 7500) {
                  field200[++class482.field3830 - 1] = 0;
               }
            }

            return 1;
         }
      }
   }

   static int method203(int var0, class106 var1, boolean var2) {
      return 2;
   }

   static int method208(int var0, class106 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 8000) {
         --class482.field3830;
         var4 = field200[class482.field3830];
         var5 = field189[var4];
         class379.method1887(field191[var4], new int[var5], 0, var5 - 1);
         return 1;
      } else if (var0 == 8001) {
         class482.field3830 -= 3;
         var4 = field200[class482.field3830];
         var5 = field200[1 + class482.field3830];
         int var6 = field200[2 + class482.field3830];
         int var7 = field189[var4];
         if (var7 <= 1) {
            return 1;
         } else {
            class324.method1710(field191[var4], var7, var5, var6);
            return 1;
         }
      } else {
         return 2;
      }
   }

   static void method209(int var0) {
      if (var0 != -1) {
         if (class480.method2359(var0)) {
            class480[] var2 = class335.field2687[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class480 var4 = var2[var3];
               if (null != var4.field3758) {
                  class208 var5 = new class208();
                  var5.field1951 = var4;
                  var5.field1954 = var4.field3758;
                  class433.method2129(var5, 5000000, 0);
               }
            }

         }
      }
   }

   static Object method206(class247 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field2220) {
            case 1:
               return field200[--class482.field3830];
            case 2:
               return field187[--class495.field3920];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   static Object method210(int var0) {
      return method206((class247)class341.method1788(class247.method1450(), var0));
   }
}
