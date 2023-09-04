public class class108 implements class42 {
   static class375 field713;
   static int[] field711;
   static final class108 field706 = new class108(0, 0);
   static final class108 field707 = new class108(2, 2);
   static final class108 field708 = new class108(3, 3);
   static final class108 field709 = new class108(1, 1);
   static final class108 field712 = new class108(4, 4);
   final int field705;
   final int field710;

   class108(int var1, int var2) {
      this.field705 = var1;
      this.field710 = var2;
   }

   public int method180() {
      return this.field710;
   }

   static class108[] method394() {
      return new class108[]{field706, field709, field707, field708, field712};
   }

   static class108 method393(int var0) {
      class108 var2 = (class108)class1.method2(method394(), var0);
      if (var2 == null) {
         var2 = field706;
      }

      return var2;
   }

   static final void method392(int var0, int var1, int var2, int var3, int var4, int var5, class408 var6, class378 var7) {
      if (!Client.field1120 || (class513.field4100[0][var1][var2] & 2) != 0 || (class513.field4100[var0][var1][var2] & 16) == 0) {
         if (var0 < class513.field4090) {
            class513.field4090 = var0;
         }

         class458 var9 = class430.method2004(var3, (byte)-23);
         int var10;
         int var11;
         if (var4 != 1 && var4 != 3) {
            var10 = var9.field3610;
            var11 = var9.field3595;
         } else {
            var10 = var9.field3595;
            var11 = var9.field3610;
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

         int[][] var16 = class513.field4098[var0];
         int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
         int var18 = (var1 << 7) + (var10 << 6);
         int var19 = (var11 << 6) + (var2 << 7);
         long var20 = class463.method2187(var1, var2, 2, var9.field3619 == 0, var3);
         int var22 = var5 + (var4 << 6);
         if (1 == var9.field3635) {
            var22 += 256;
         }

         if (var9.method2160()) {
            class307.method1409(var0, var1, var2, var9, var4);
         }

         Object var23;
         if (var5 == 22) {
            if (!Client.field1120 || var9.field3619 != 0 || 1 == var9.field3612 || var9.field3599) {
               if (var9.field3622 == -1 && var9.field3636 == null) {
                  var23 = var9.method2152(22, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class359(var3, 22, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
               }

               var6.method1840(var0, var1, var2, var17, (class165)var23, var20, var22);
               if (var9.field3612 == 1 && null != var7) {
                  var7.method1750(var1, var2);
               }

            }
         } else {
            int var24;
            if (var5 != 10 && var5 != 11) {
               int[] var10000;
               if (var5 >= 12) {
                  if (var9.field3622 == -1 && null == var9.field3636) {
                     var23 = var9.method2152(var5, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class359(var3, var5, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                  }

                  var6.method1842(var0, var1, var2, var17, 1, 1, (class165)var23, 0, var20, var22);
                  if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     var10000 = class490.field3930[var0][var1];
                     var10000[var2] |= 2340;
                  }

                  if (0 != var9.field3612 && null != var7) {
                     var7.method1748(var1, var2, var10, var11, var9.field3613);
                  }

               } else if (var5 == 0) {
                  if (-1 == var9.field3622 && var9.field3636 == null) {
                     var23 = var9.method2152(0, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class359(var3, 0, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                  }

                  var6.method1862(var0, var1, var2, var17, (class165)var23, (class165)null, class513.field4093[var4], 0, var20, var22);
                  if (var4 == 0) {
                     if (var9.field3626) {
                        class82.field560[var0][var1][var2] = 50;
                        class82.field560[var0][var1][var2 + 1] = 50;
                     }

                     if (var9.field3621) {
                        var10000 = class490.field3930[var0][var1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 1) {
                     if (var9.field3626) {
                        class82.field560[var0][var1][var2 + 1] = 50;
                        class82.field560[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field3621) {
                        var10000 = class490.field3930[var0][var1];
                        var10000[var2 + 1] |= 1170;
                     }
                  } else if (var4 == 2) {
                     if (var9.field3626) {
                        class82.field560[var0][var1 + 1][var2] = 50;
                        class82.field560[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if (var9.field3621) {
                        var10000 = class490.field3930[var0][var1 + 1];
                        var10000[var2] |= 585;
                     }
                  } else if (var4 == 3) {
                     if (var9.field3626) {
                        class82.field560[var0][var1][var2] = 50;
                        class82.field560[var0][var1 + 1][var2] = 50;
                     }

                     if (var9.field3621) {
                        var10000 = class490.field3930[var0][var1];
                        var10000[var2] |= 1170;
                     }
                  }

                  if (0 != var9.field3612 && var7 != null) {
                     var7.method1747(var1, var2, var5, var4, var9.field3613);
                  }

                  if (16 != var9.field3616) {
                     var6.method1845(var0, var1, var2, var9.field3616);
                  }

               } else if (var5 == 1) {
                  if (-1 == var9.field3622 && null == var9.field3636) {
                     var23 = var9.method2152(1, var4, var16, var18, var17, var19);
                  } else {
                     var23 = new class359(var3, 1, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                  }

                  var6.method1862(var0, var1, var2, var17, (class165)var23, (class165)null, class513.field4094[var4], 0, var20, var22);
                  if (var9.field3626) {
                     if (var4 == 0) {
                        class82.field560[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class82.field560[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class82.field560[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class82.field560[var0][var1][var2] = 50;
                     }
                  }

                  if (0 != var9.field3612 && var7 != null) {
                     var7.method1747(var1, var2, var5, var4, var9.field3613);
                  }

               } else {
                  int var29;
                  if (var5 == 2) {
                     var29 = var4 + 1 & 3;
                     Object var31;
                     Object var32;
                     if (var9.field3622 == -1 && var9.field3636 == null) {
                        var32 = var9.method2152(2, var4 + 4, var16, var18, var17, var19);
                        var31 = var9.method2152(2, var29, var16, var18, var17, var19);
                     } else {
                        var32 = new class359(var3, 2, var4 + 4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                        var31 = new class359(var3, 2, var29, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                     }

                     var6.method1862(var0, var1, var2, var17, (class165)var32, (class165)var31, class513.field4093[var4], class513.field4093[var29], var20, var22);
                     if (var9.field3621) {
                        if (var4 == 0) {
                           var10000 = class490.field3930[var0][var1];
                           var10000[var2] |= 585;
                           var10000 = class490.field3930[var0][var1];
                           var10000[var2 + 1] |= 1170;
                        } else if (var4 == 1) {
                           var10000 = class490.field3930[var0][var1];
                           var10000[var2 + 1] |= 1170;
                           var10000 = class490.field3930[var0][var1 + 1];
                           var10000[var2] |= 585;
                        } else if (var4 == 2) {
                           var10000 = class490.field3930[var0][var1 + 1];
                           var10000[var2] |= 585;
                           var10000 = class490.field3930[var0][var1];
                           var10000[var2] |= 1170;
                        } else if (var4 == 3) {
                           var10000 = class490.field3930[var0][var1];
                           var10000[var2] |= 1170;
                           var10000 = class490.field3930[var0][var1];
                           var10000[var2] |= 585;
                        }
                     }

                     if (var9.field3612 != 0 && var7 != null) {
                        var7.method1747(var1, var2, var5, var4, var9.field3613);
                     }

                     if (var9.field3616 != 16) {
                        var6.method1845(var0, var1, var2, var9.field3616);
                     }

                  } else if (var5 == 3) {
                     if (var9.field3622 == -1 && null == var9.field3636) {
                        var23 = var9.method2152(3, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class359(var3, 3, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                     }

                     var6.method1862(var0, var1, var2, var17, (class165)var23, (class165)null, class513.field4094[var4], 0, var20, var22);
                     if (var9.field3626) {
                        if (var4 == 0) {
                           class82.field560[var0][var1][var2 + 1] = 50;
                        } else if (var4 == 1) {
                           class82.field560[var0][var1 + 1][var2 + 1] = 50;
                        } else if (var4 == 2) {
                           class82.field560[var0][var1 + 1][var2] = 50;
                        } else if (var4 == 3) {
                           class82.field560[var0][var1][var2] = 50;
                        }
                     }

                     if (0 != var9.field3612 && null != var7) {
                        var7.method1747(var1, var2, var5, var4, var9.field3613);
                     }

                  } else if (var5 == 9) {
                     if (var9.field3622 == -1 && null == var9.field3636) {
                        var23 = var9.method2152(var5, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class359(var3, var5, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                     }

                     var6.method1842(var0, var1, var2, var17, 1, 1, (class165)var23, 0, var20, var22);
                     if (0 != var9.field3612 && var7 != null) {
                        var7.method1748(var1, var2, var10, var11, var9.field3613);
                     }

                     if (16 != var9.field3616) {
                        var6.method1845(var0, var1, var2, var9.field3616);
                     }

                  } else if (var5 == 4) {
                     if (-1 == var9.field3622 && null == var9.field3636) {
                        var23 = var9.method2152(4, var4, var16, var18, var17, var19);
                     } else {
                        var23 = new class359(var3, 4, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                     }

                     var6.method1877(var0, var1, var2, var17, (class165)var23, (class165)null, class513.field4093[var4], 0, 0, 0, var20, var22);
                  } else {
                     long var30;
                     Object var33;
                     if (var5 == 5) {
                        var29 = 16;
                        var30 = var6.method1871(var0, var1, var2);
                        if (var30 != 0L) {
                           var29 = class430.method2004(class463.method2185(var30), (byte)104).field3616;
                        }

                        if (-1 == var9.field3622 && null == var9.field3636) {
                           var33 = var9.method2152(4, var4, var16, var18, var17, var19);
                        } else {
                           var33 = new class359(var3, 4, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                        }

                        var6.method1877(var0, var1, var2, var17, (class165)var33, (class165)null, class513.field4093[var4], 0, class513.field4095[var4] * var29, class513.field4096[var4] * var29, var20, var22);
                     } else if (var5 == 6) {
                        var29 = 8;
                        var30 = var6.method1871(var0, var1, var2);
                        if (var30 != 0L) {
                           var29 = class430.method2004(class463.method2185(var30), (byte)-6).field3616 / 2;
                        }

                        if (var9.field3622 == -1 && var9.field3636 == null) {
                           var33 = var9.method2152(4, var4 + 4, var16, var18, var17, var19);
                        } else {
                           var33 = new class359(var3, 4, var4 + 4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                        }

                        var6.method1877(var0, var1, var2, var17, (class165)var33, (class165)null, 256, var4, var29 * class513.field4101[var4], var29 * class513.field4099[var4], var20, var22);
                     } else if (var5 == 7) {
                        var24 = var4 + 2 & 3;
                        if (-1 == var9.field3622 && null == var9.field3636) {
                           var23 = var9.method2152(4, var24 + 4, var16, var18, var17, var19);
                        } else {
                           var23 = new class359(var3, 4, var24 + 4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                        }

                        var6.method1877(var0, var1, var2, var17, (class165)var23, (class165)null, 256, var24, 0, 0, var20, var22);
                     } else if (var5 == 8) {
                        var29 = 8;
                        var30 = var6.method1871(var0, var1, var2);
                        if (0L != var30) {
                           var29 = class430.method2004(class463.method2185(var30), (byte)-21).field3616 / 2;
                        }

                        int var28 = var4 + 2 & 3;
                        Object var27;
                        if (-1 == var9.field3622 && var9.field3636 == null) {
                           var33 = var9.method2152(4, var4 + 4, var16, var18, var17, var19);
                           var27 = var9.method2152(4, var28 + 4, var16, var18, var17, var19);
                        } else {
                           var33 = new class359(var3, 4, var4 + 4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                           var27 = new class359(var3, 4, var28 + 4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
                        }

                        var6.method1877(var0, var1, var2, var17, (class165)var33, (class165)var27, 256, var4, var29 * class513.field4101[var4], class513.field4099[var4] * var29, var20, var22);
                     }
                  }
               }
            } else {
               if (-1 == var9.field3622 && var9.field3636 == null) {
                  var23 = var9.method2152(10, var4, var16, var18, var17, var19);
               } else {
                  var23 = new class359(var3, 10, var4, var0, var1, var2, var9.field3622, var9.field3627, (class165)null);
               }

               if (null != var23 && var6.method1842(var0, var1, var2, var17, var10, var11, (class165)var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field3626) {
                  var24 = 15;
                  if (var23 instanceof class485) {
                     var24 = ((class485)var23).method2295() / 4;
                     if (var24 > 30) {
                        var24 = 30;
                     }
                  }

                  for(int var25 = 0; var25 <= var10; ++var25) {
                     for(int var26 = 0; var26 <= var11; ++var26) {
                        if (var24 > class82.field560[var0][var1 + var25][var26 + var2]) {
                           class82.field560[var0][var1 + var25][var2 + var26] = (byte)var24;
                        }
                     }
                  }
               }

               if (var9.field3612 != 0 && var7 != null) {
                  var7.method1748(var1, var2, var10, var11, var9.field3613);
               }

            }
         }
      }
   }
}
