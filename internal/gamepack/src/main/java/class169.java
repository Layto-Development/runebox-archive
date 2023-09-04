public class class169 implements class188 {
   static class321 field1723;
   static int[] field1721;
   static final class169 field1716 = new class169(0, 0);
   static final class169 field1717 = new class169(2, 2);
   static final class169 field1718 = new class169(3, 3);
   static final class169 field1719 = new class169(1, 1);
   static final class169 field1722 = new class169(4, 4);
   final int field1715;
   final int field1720;

   class169(int var1, int var2) {
      this.field1715 = var1;
      this.field1720 = var2;
   }

   public int method1195() {
      return this.field1720;
   }

   static class169[] method1021() {
      return new class169[]{field1716, field1719, field1717, field1718, field1722};
   }

   static class169 method1020(int var0) {
      class169 var2 = (class169)class341.method1788(method1021(), var0);
      if (var2 == null) {
         var2 = field1716;
      }

      return var2;
   }

   static final void method1019(int var0, int var1, int var2, int var3, int var4, int var5, class175 var6, class278 var7) {
      if (!Client.field580 || (class526.field4143[0][var1][var2] & 2) != 0 || (class526.field4143[var0][var1][var2] & 16) == 0) {
         if (var0 < class526.field4133) {
            class526.field4133 = var0;
         }

         class449 var9 = class444.method2172(var3, (byte)-23);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.field3450;
            var11 = var9.field3435;
         } else {
            var10 = var9.field3435;
            var11 = var9.field3450;
         }

         int var12;
         int var13;
         if (var1 + var10 <= 104) {
            var12 = var1 + (var10 >> 1);
            var13 = (var10 + 1 >> 1) + var1;
         } else {
            var12 = var1;
            var13 = var1 + 1;
         }

         int var14;
         int var15;
         if (var2 + var11 <= 104) {
            var14 = var2 + (var11 >> 1);
            var15 = (var11 + 1 >> 1) + var2;
         } else {
            var14 = var2;
            var15 = var2 + 1;
         }

         int[][] var16 = class526.field4141[var0];
         int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var11 << 6) + (var2 << 7);
         long var20 = class256.method1473(var1, var2, 2, var9.field3459 == 0, var3);
         int var22 = var5 + (var4 << 6);
         if (var9.field3475 == 1) {
            var22 += 256;
         }

         if (var9.method2220()) {
            class372.method1868(var0, var1, var2, var9, var4);
         }

         Object var23;
         if (var5 == 22) {
            if (!Client.field580 || var9.field3459 != 0 || var9.field3452 == 1 || var9.field3439) {
               if (var9.field3462 == -1 && var9.field3476 == null) {
                  var23 = var9.method2212(22, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class50(var3, 22, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
               }

               var6.method1031(var0, var1, var2, var17, (class496)var23, var20, var22);
               if (var9.field3452 == 1 && null != var7) {
                  var7.method1533(var1, var2);
               }

            }
         } else {
            int var24;
            if (var5 != 10 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var9.field3462 == -1 && null == var9.field3476) {
                     var23 = var9.method2212(var5, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class50(var3, var5, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                  }

                  var6.method1033(var0, var1, var2, var17, 1, 1, (class496)var23, 0, var20, var22);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = class125.field1521[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (var9.field3452 != 0 && null != var7) {
                     var7.method1531(var1, var2, var10, var11, var9.field3453);
                  }

               } else if (var5 == 0) {
                  if (var9.field3462 == -1 && var9.field3476 == null) {
                     var23 = var9.method2212(0, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class50(var3, 0, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                  }

                  var6.method1053(var0, var1, var2, var17, (class496)var23, (class496)null, class526.field4136[var4], 0, var20, var22);
                  if (var4 == 0) {
                     if (var9.field3466) {
                        class423.field3209[var0][var1][var2] = 50;
                        class423.field3209[var0][var1][var2 + 1] = 50;
                     }

                     if (var9.field3461) {
                        var10000 = class125.field1521[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var9.field3466) {
                        class423.field3209[var0][var1][var2 + 1] = 50;
                        class423.field3209[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field3461) {
                        var10000 = class125.field1521[var0][var1];
                        var10000[var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var9.field3466) {
                        class423.field3209[var0][var1 + 1][var2] = 50;
                        class423.field3209[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field3461) {
                        var10000 = class125.field1521[var0][var1 + 1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var9.field3466) {
                        class423.field3209[var0][var1][var2] = 50;
                        class423.field3209[var0][var1 + 1][var2] = 50;
                     }

                     if (var9.field3461) {
                        var10000 = class125.field1521[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (var9.field3452 != 0 && var7 != null) {
                     var7.method1530(var1, var2, var5, var4, var9.field3453);
                  }

                  if (var9.field3456 != 16) {
                     var6.method1036(var0, var1, var2, var9.field3456);
                  }

               } else if (var5 == 1) {
                  if (var9.field3462 == -1 && null == var9.field3476) {
                     var23 = var9.method2212(1, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class50(var3, 1, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                  }

                  var6.method1053(var0, var1, var2, var17, (class496)var23, (class496)null, class526.field4137[var4], 0, var20, var22);
                  if (var9.field3466) {
                     if (var4 == 0) {
                        class423.field3209[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class423.field3209[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class423.field3209[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class423.field3209[var0][var1][var2] = 50;
                     }
                  }

                  if (var9.field3452 != 0 && var7 != null) {
                     var7.method1530(var1, var2, var5, var4, var9.field3453);
                  }

               } else {
                  int var29;
                  if (var5 == 2) {
                     var29 = var4 + 1 & 3;
                     Object var31;
                     Object var32;
                     if (var9.field3462 == -1 && var9.field3476 == null) {
                        var32 = var9.method2212(2, var4 + 4, var16, var18, var17, var19);
                        var31 = var9.method2212(2, var29, var16, var18, var17, var19);
                     } else {
                        var32 = new class50(var3, 2, var4 + 4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                        var31 = new class50(var3, 2, var29, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                     }

                     var6.method1053(var0, var1, var2, var17, (class496)var32, (class496)var31, class526.field4136[var4], class526.field4136[var29], var20, var22);
                     if (var9.field3461) {
                        if (var4 == 0) {
                           var10000 = class125.field1521[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = class125.field1521[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (var4 == 1) {
                           var10000 = class125.field1521[var0][var1];
                           var10000[var2 + 1] |= 1170;
                           var10000 = class125.field1521[var0][var1 + 1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = class125.field1521[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = class125.field1521[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = class125.field1521[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = class125.field1521[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var9.field3452 != 0 && var7 != null) {
                        var7.method1530(var1, var2, var5, var4, var9.field3453);
                     }

                     if (var9.field3456 != 16) {
                        var6.method1036(var0, var1, var2, var9.field3456);
                     }

                  } else if (var5 == 3) {
                     if (var9.field3462 == -1 && null == var9.field3476) {
                        var23 = var9.method2212(3, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class50(var3, 3, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                     }

                     var6.method1053(var0, var1, var2, var17, (class496)var23, (class496)null, class526.field4137[var4], 0, var20, var22);
                     if (var9.field3466) {
                        if (var4 == 0) {
                           class423.field3209[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           class423.field3209[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           class423.field3209[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           class423.field3209[var0][var1][var2] = 50;
                        }
                     }

                     if (var9.field3452 != 0 && null != var7) {
                        var7.method1530(var1, var2, var5, var4, var9.field3453);
                     }

                  } else if (var5 == 9) {
                     if (var9.field3462 == -1 && null == var9.field3476) {
                        var23 = var9.method2212(var5, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class50(var3, var5, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                     }

                     var6.method1033(var0, var1, var2, var17, 1, 1, (class496)var23, 0, var20, var22);
                     if (var9.field3452 != 0 && var7 != null) {
                        var7.method1531(var1, var2, var10, var11, var9.field3453);
                     }

                     if (var9.field3456 != 16) {
                        var6.method1036(var0, var1, var2, var9.field3456);
                     }

                  } else if (var5 == 4) {
                     if (var9.field3462 == -1 && null == var9.field3476) {
                        var23 = var9.method2212(4, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class50(var3, 4, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                     }

                     var6.method1068(var0, var1, var2, var17, (class496)var23, (class496)null, class526.field4136[var4], 0, 0, 0, var20, var22);
                  } else {
                     long var30;
                     Object var33;
                     if (var5 == 5) {
                        var29 = 16;
                        var30 = var6.method1062(var0, var1, var2);
                        if (var30 != 0L) {
                           var29 = class444.method2172(class256.method1471(var30), (byte)104).field3456;
                        }

                        if (var9.field3462 == -1 && null == var9.field3476) {
                           var33 = var9.method2212(4, var4, var16, var18, var17, var19);
                        } else {
                           var33 = new class50(var3, 4, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                        }

                        var6.method1068(var0, var1, var2, var17, (class496)var33, (class496)null, class526.field4136[var4], 0, class526.field4138[var4] * var29, class526.field4139[var4] * var29, var20, var22);
                     } else if (var5 == 6) {
                        var29 = 8;
                        var30 = var6.method1062(var0, var1, var2);
                        if (var30 != 0L) {
                           var29 = class444.method2172(class256.method1471(var30), (byte)-6).field3456 / 2;
                        }

                        if (var9.field3462 == -1 && var9.field3476 == null) {
                           var33 = var9.method2212(4, var4 + 4, var16, var18, var17, var19);
                        } else {
                           var33 = new class50(var3, 4, var4 + 4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                        }

                        var6.method1068(var0, var1, var2, var17, (class496)var33, (class496)null, 256, var4, var29 * class526.field4144[var4], var29 * class526.field4142[var4], var20, var22);
                     } else if (var5 == 7) {
                        var24 = var4 + 2 & 3;
                        if (var9.field3462 == -1 && null == var9.field3476) {
                           var23 = var9.method2212(4, var24 + 4, var16, var18, var17, var19);
                        } else {
                           var23 = new class50(var3, 4, var24 + 4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                        }

                        var6.method1068(var0, var1, var2, var17, (class496)var23, (class496)null, 256, var24, 0, 0, var20, var22);
                     } else if (var5 == 8) {
                        var29 = 8;
                        var30 = var6.method1062(var0, var1, var2);
                        if (0L != var30) {
                           var29 = class444.method2172(class256.method1471(var30), (byte)-21).field3456 / 2;
                        }

                        int var28 = var4 + 2 & 3;
                        Object var27;
                        if (var9.field3462 == -1 && var9.field3476 == null) {
                           var33 = var9.method2212(4, var4 + 4, var16, var18, var17, var19);
                           var27 = var9.method2212(4, var28 + 4, var16, var18, var17, var19);
                        } else {
                           var33 = new class50(var3, 4, var4 + 4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                           var27 = new class50(var3, 4, var28 + 4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
                        }

                        var6.method1068(var0, var1, var2, var17, (class496)var33, (class496)var27, 256, var4, var29 * class526.field4144[var4], class526.field4142[var4] * var29, var20, var22);
                     }
                  }
               }
            } else {
               if (var9.field3462 == -1 && var9.field3476 == null) {
                  var23 = var9.method2212(10, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class50(var3, 10, var4, var0, var1, var2, var9.field3462, var9.field3467, (class496)null);
               }

               if (null != var23 && var6.method1033(var0, var1, var2, var17, var10, var11, (class496)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field3466) {
                  var24 = 15;
                  if (var23 instanceof class104) {
                     var24 = ((class104)var23).method760() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var10; ++var25) {
                     for(int var26 = 0; var26 <= var11; ++var26) {
                        if (var24 > class423.field3209[var0][var1 + var25][var26 + var2]) {
                           class423.field3209[var0][var1 + var25][var2 + var26] = (byte)var24;
                        }
                     }
                  }
               }

               if (var9.field3452 != 0 && var7 != null) {
                  var7.method1531(var1, var2, var10, var11, var9.field3453);
               }

            }
         }
      }
   }
}
