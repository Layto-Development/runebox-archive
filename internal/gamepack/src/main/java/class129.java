public class class129 {
   public static final float field807 = Math.ulp(1.0F);
   public static final float field808;
   static class112 field806;
   static class388 field811;
   static float[] field809;
   static float[] field810;

   static {
      field808 = field807 * 2.0F;
      field809 = new float[4];
      field810 = new float[5];
   }

   class129() throws Throwable {
   }

   static float method481(class137 var0, float var1) {
      if (var0 != null && var0.method499() != 0) {
         if (var1 < (float)var0.field858[0].field1563) {
            return class108.field706 == var0.field856 ? var0.field858[0].field1566 : method480(var0, var1, true);
         } else if (var1 > (float)var0.field858[var0.method499() - 1].field1563) {
            return class108.field706 == var0.field876 ? var0.field858[var0.method499() - 1].field1566 : method480(var0, var1, false);
         } else if (var0.field855) {
            return var0.field858[0].field1566;
         } else {
            class203 var3 = var0.method498(var1);
            boolean var4 = false;
            boolean var5 = false;
            if (null == var3) {
               return 0.0F;
            } else {
               float var6;
               float var7;
               if (0.0 == (double)var3.field1567 && (double)var3.field1568 == 0.0) {
                  var4 = true;
               } else if (Float.MAX_VALUE == var3.field1567 && Float.MAX_VALUE == var3.field1568) {
                  var5 = true;
               } else if (null != var3.field1569) {
                  if (var0.field870) {
                     var6 = (float)var3.field1563;
                     float var10 = var3.field1566;
                     var7 = var3.field1567 * 0.33333334F + var6;
                     float var11 = var3.field1568 * 0.33333334F + var10;
                     float var9 = (float)var3.field1569.field1563;
                     float var13 = var3.field1569.field1566;
                     float var8 = var9 - var3.field1569.field1572 * 0.33333334F;
                     float var12 = var13 - var3.field1569.field1564 * 0.33333334F;
                     float var16;
                     float var17;
                     float var18;
                     float var19;
                     float var20;
                     if (var0.field869) {
                        var16 = var11;
                        var17 = var12;
                        if (null != var0) {
                           var18 = var9 - var6;
                           if ((double)var18 != 0.0) {
                              var19 = var7 - var6;
                              var20 = var8 - var6;
                              float[] var30 = new float[]{var19 / var18, var20 / var18};
                              var0.field857 = 0.33333334F == var30[0] && var30[1] == 0.6666667F;
                              float var22 = var30[0];
                              float var23 = var30[1];
                              if ((double)var30[0] < 0.0) {
                                 var30[0] = 0.0F;
                              }

                              if ((double)var30[1] > 1.0) {
                                 var30[1] = 1.0F;
                              }

                              if ((double)var30[0] > 1.0 || var30[1] < -1.0F) {
                                 class398.method1819(var30);
                              }

                              float var10000;
                              if (var30[0] != var22) {
                                 var10000 = var6 + var18 * var30[0];
                                 if (0.0 != (double)var22) {
                                    var16 = (var11 - var10) * var30[0] / var22 + var10;
                                 }
                              }

                              if (var23 != var30[1]) {
                                 var10000 = var6 + var18 * var30[1];
                                 if (1.0 != (double)var23) {
                                    var17 = (float)((double)var13 - (1.0 - (double)var30[1]) * (double)(var13 - var12) / (1.0 - (double)var23));
                                 }
                              }

                              var0.field860 = var6;
                              var0.field861 = var9;
                              float var24 = var30[0];
                              float var25 = var30[1];
                              float var26 = var24 - 0.0F;
                              float var27 = var25 - var24;
                              float var28 = 1.0F - var25;
                              float var29 = var27 - var26;
                              var0.field859 = var28 - var27 - var29;
                              var0.field864 = var29 + var29 + var29;
                              var0.field863 = var26 + var26 + var26;
                              var0.field862 = 0.0F;
                              var26 = var16 - var10;
                              var27 = var17 - var16;
                              var28 = var13 - var17;
                              var29 = var27 - var26;
                              var0.field854 = var28 - var27 - var29;
                              var0.field867 = var29 + var29 + var29;
                              var0.field866 = var26 + var26 + var26;
                              var0.field877 = var10;
                           }
                        }
                     } else if (var0 != null) {
                        var0.field860 = var6;
                        float var14 = var9 - var6;
                        float var15 = var13 - var10;
                        var16 = var7 - var6;
                        var17 = 0.0F;
                        var18 = 0.0F;
                        if ((double)var16 != 0.0) {
                           var17 = (var11 - var10) / var16;
                        }

                        var16 = var9 - var8;
                        if ((double)var16 != 0.0) {
                           var18 = (var13 - var12) / var16;
                        }

                        var19 = 1.0F / (var14 * var14);
                        var20 = var17 * var14;
                        float var21 = var18 * var14;
                        var0.field862 = var19 * (var20 + var21 - var15 - var15) / var14;
                        var0.field863 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
                        var0.field864 = var17;
                        var0.field859 = var10;
                     }

                     var0.field870 = false;
                  }
               } else {
                  var4 = true;
               }

               if (var4) {
                  return var3.field1566;
               } else if (var5) {
                  return (float)var3.field1563 != var1 && null != var3.field1569 ? var3.field1569.field1566 : var3.field1566;
               } else if (var0.field869) {
                  return method482(var0, var1);
               } else {
                  if (var0 == null) {
                     var6 = 0.0F;
                  } else {
                     var7 = var1 - var0.field860;
                     var6 = var0.field859 + var7 * ((var7 * var0.field862 + var0.field863) * var7 + var0.field864);
                  }

                  return var6;
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   static float method482(class137 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var3;
         if (var0.field860 == var1) {
            var3 = 0.0F;
         } else if (var1 == var0.field861) {
            var3 = 1.0F;
         } else {
            var3 = (var1 - var0.field860) / (var0.field861 - var0.field860);
         }

         float var4;
         if (var0.field857) {
            var4 = var3;
         } else {
            field809[3] = var0.field859;
            field809[2] = var0.field864;
            field809[1] = var0.field863;
            field809[0] = var0.field862 - var3;
            field810[0] = 0.0F;
            field810[1] = 0.0F;
            field810[2] = 0.0F;
            field810[3] = 0.0F;
            field810[4] = 0.0F;
            int var5 = class439.method2041(field809, 3, 0.0F, true, 1.0F, true, field810);
            if (var5 == 1) {
               var4 = field810[0];
            } else {
               var4 = 0.0F;
            }
         }

         return var4 * (var0.field866 + var4 * (var4 * var0.field854 + var0.field867)) + var0.field877;
      }
   }

   static float method480(class137 var0, float var1, boolean var2) {
      float var4 = 0.0F;
      if (null != var0 && var0.method499() != 0) {
         float var5 = (float)var0.field858[0].field1563;
         float var6 = (float)var0.field858[var0.method499() - 1].field1563;
         float var7 = var6 - var5;
         if ((double)var7 == 0.0) {
            return var0.field858[0].field1566;
         } else {
            float var8 = 0.0F;
            if (var1 > var6) {
               var8 = (var1 - var6) / var7;
            } else {
               var8 = (var1 - var5) / var7;
            }

            double var9 = (double)((int)var8);
            float var11 = Math.abs((float)((double)var8 - var9));
            float var12 = var11 * var7;
            var9 = Math.abs(var9 + 1.0);
            double var13 = var9 / 2.0;
            double var15 = (double)((int)var13);
            var11 = (float)(var13 - var15);
            float var17;
            float var18;
            if (var2) {
               if (class108.field712 == var0.field856) {
                  if ((double)var11 != 0.0) {
                     var12 += var5;
                  } else {
                     var12 = var6 - var12;
                  }
               } else if (var0.field856 != class108.field707 && var0.field856 != class108.field708) {
                  if (class108.field709 == var0.field856) {
                     var12 = var5 - var1;
                     var17 = var0.field858[0].field1572;
                     var18 = var0.field858[0].field1564;
                     var4 = var0.field858[0].field1566;
                     if (0.0 != (double)var17) {
                        var4 -= var12 * var18 / var17;
                     }

                     return var4;
                  }
               } else {
                  var12 = var6 - var12;
               }
            } else if (class108.field712 == var0.field876) {
               if ((double)var11 != 0.0) {
                  var12 = var6 - var12;
               } else {
                  var12 += var5;
               }
            } else if (class108.field707 != var0.field876 && var0.field876 != class108.field708) {
               if (var0.field876 == class108.field709) {
                  var12 = var1 - var6;
                  var17 = var0.field858[var0.method499() - 1].field1567;
                  var18 = var0.field858[var0.method499() - 1].field1568;
                  var4 = var0.field858[var0.method499() - 1].field1566;
                  if (0.0 != (double)var17) {
                     var4 += var18 * var12 / var17;
                  }

                  return var4;
               }
            } else {
               var12 += var5;
            }

            var4 = method481(var0, var12);
            float var19;
            if (var2 && class108.field708 == var0.field856) {
               var19 = var0.field858[var0.method499() - 1].field1566 - var0.field858[0].field1566;
               var4 = (float)((double)var4 - (double)var19 * var9);
            } else if (!var2 && var0.field876 == class108.field708) {
               var19 = var0.field858[var0.method499() - 1].field1566 - var0.field858[0].field1566;
               var4 = (float)((double)var4 + (double)var19 * var9);
            }

            return var4;
         }
      } else {
         return var4;
      }
   }
}
