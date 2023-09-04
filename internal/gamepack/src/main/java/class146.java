public class class146 {
   public static final float field1608 = Math.ulp(1.0F);
   public static final float field1609;
   static class294 field1612;
   static class520 field1607;
   static float[] field1610;
   static float[] field1611;

   static {
      field1609 = field1608 * 2.0F;
      field1610 = new float[4];
      field1611 = new float[5];
   }

   class146() throws Throwable {
   }

   static float method926(class75 var0, float var1) {
      if (var0 != null && var0.method693() != 0) {
         if (var1 < (float)var0.field1206[0].field2813) {
            return class169.field1716 == var0.field1204 ? var0.field1206[0].field2816 : method925(var0, var1, true);
         } else if (var1 > (float)var0.field1206[var0.method693() - 1].field2813) {
            return class169.field1716 == var0.field1224 ? var0.field1206[var0.method693() - 1].field2816 : method925(var0, var1, false);
         } else if (var0.field1203) {
            return var0.field1206[0].field2816;
         } else {
            class359 var3 = var0.method692(var1);
            boolean var4 = false;
            boolean var5 = false;
            if (null == var3) {
               return 0.0F;
            } else {
               float var6;
               float var7;
               if (0.0 == (double)var3.field2817 && (double)var3.field2818 == 0.0) {
                  var4 = true;
               } else if (Float.MAX_VALUE == var3.field2817 && Float.MAX_VALUE == var3.field2818) {
                  var5 = true;
               } else if (null != var3.field2819) {
                  if (var0.field1218) {
                     var6 = (float)var3.field2813;
                     float var10 = var3.field2816;
                     var7 = var3.field2817 * 0.33333334F + var6;
                     float var11 = var3.field2818 * 0.33333334F + var10;
                     float var9 = (float)var3.field2819.field2813;
                     float var13 = var3.field2819.field2816;
                     float var8 = var9 - var3.field2819.field2822 * 0.33333334F;
                     float var12 = var13 - var3.field2819.field2814 * 0.33333334F;
                     float var16;
                     float var17;
                     float var18;
                     float var19;
                     float var20;
                     if (var0.field1217) {
                        var16 = var11;
                        var17 = var12;
                        if (null != var0) {
                           var18 = var9 - var6;
                           if ((double)var18 != 0.0) {
                              var19 = var7 - var6;
                              var20 = var8 - var6;
                              float[] var30 = new float[]{var19 / var18, var20 / var18};
                              var0.field1205 = 0.33333334F == var30[0] && var30[1] == 0.6666667F;
                              float var22 = var30[0];
                              float var23 = var30[1];
                              if ((double)var30[0] < 0.0) {
                                 var30[0] = 0.0F;
                              }

                              if ((double)var30[1] > 1.0) {
                                 var30[1] = 1.0F;
                              }

                              if ((double)var30[0] > 1.0 || var30[1] < -1.0F) {
                                 class474.method2290(var30);
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

                              var0.field1208 = var6;
                              var0.field1209 = var9;
                              float var24 = var30[0];
                              float var25 = var30[1];
                              float var26 = var24 - 0.0F;
                              float var27 = var25 - var24;
                              float var28 = 1.0F - var25;
                              float var29 = var27 - var26;
                              var0.field1207 = var28 - var27 - var29;
                              var0.field1212 = var29 + var29 + var29;
                              var0.field1211 = var26 + var26 + var26;
                              var0.field1210 = 0.0F;
                              var26 = var16 - var10;
                              var27 = var17 - var16;
                              var28 = var13 - var17;
                              var29 = var27 - var26;
                              var0.field1202 = var28 - var27 - var29;
                              var0.field1215 = var29 + var29 + var29;
                              var0.field1214 = var26 + var26 + var26;
                              var0.field1225 = var10;
                           }
                        }
                     } else if (var0 != null) {
                        var0.field1208 = var6;
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
                        var0.field1210 = var19 * (var20 + var21 - var15 - var15) / var14;
                        var0.field1211 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
                        var0.field1212 = var17;
                        var0.field1207 = var10;
                     }

                     var0.field1218 = false;
                  }
               } else {
                  var4 = true;
               }

               if (var4) {
                  return var3.field2816;
               } else if (var5) {
                  return (float)var3.field2813 != var1 && null != var3.field2819 ? var3.field2819.field2816 : var3.field2816;
               } else if (var0.field1217) {
                  return method927(var0, var1);
               } else {
                  if (var0 == null) {
                     var6 = 0.0F;
                  } else {
                     var7 = var1 - var0.field1208;
                     var6 = var0.field1207 + var7 * ((var7 * var0.field1210 + var0.field1211) * var7 + var0.field1212);
                  }

                  return var6;
               }
            }
         }
      } else {
         return 0.0F;
      }
   }

   static float method927(class75 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var3;
         if (var0.field1208 == var1) {
            var3 = 0.0F;
         } else if (var1 == var0.field1209) {
            var3 = 1.0F;
         } else {
            var3 = (var1 - var0.field1208) / (var0.field1209 - var0.field1208);
         }

         float var4;
         if (var0.field1205) {
            var4 = var3;
         } else {
            field1610[3] = var0.field1207;
            field1610[2] = var0.field1212;
            field1610[1] = var0.field1211;
            field1610[0] = var0.field1210 - var3;
            field1611[0] = 0.0F;
            field1611[1] = 0.0F;
            field1611[2] = 0.0F;
            field1611[3] = 0.0F;
            field1611[4] = 0.0F;
            int var5 = class241.method1431(field1610, 3, 0.0F, true, 1.0F, true, field1611);
            if (var5 == 1) {
               var4 = field1611[0];
            } else {
               var4 = 0.0F;
            }
         }

         return var4 * (var0.field1214 + var4 * (var4 * var0.field1202 + var0.field1215)) + var0.field1225;
      }
   }

   static float method925(class75 var0, float var1, boolean var2) {
      float var4 = 0.0F;
      if (null != var0 && var0.method693() != 0) {
         float var5 = (float)var0.field1206[0].field2813;
         float var6 = (float)var0.field1206[var0.method693() - 1].field2813;
         float var7 = var6 - var5;
         if ((double)var7 == 0.0) {
            return var0.field1206[0].field2816;
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
               if (class169.field1722 == var0.field1204) {
                  if ((double)var11 != 0.0) {
                     var12 += var5;
                  } else {
                     var12 = var6 - var12;
                  }
               } else if (var0.field1204 != class169.field1717 && var0.field1204 != class169.field1718) {
                  if (class169.field1719 == var0.field1204) {
                     var12 = var5 - var1;
                     var17 = var0.field1206[0].field2822;
                     var18 = var0.field1206[0].field2814;
                     var4 = var0.field1206[0].field2816;
                     if (0.0 != (double)var17) {
                        var4 -= var12 * var18 / var17;
                     }

                     return var4;
                  }
               } else {
                  var12 = var6 - var12;
               }
            } else if (class169.field1722 == var0.field1224) {
               if ((double)var11 != 0.0) {
                  var12 = var6 - var12;
               } else {
                  var12 += var5;
               }
            } else if (class169.field1717 != var0.field1224 && var0.field1224 != class169.field1718) {
               if (var0.field1224 == class169.field1719) {
                  var12 = var1 - var6;
                  var17 = var0.field1206[var0.method693() - 1].field2817;
                  var18 = var0.field1206[var0.method693() - 1].field2818;
                  var4 = var0.field1206[var0.method693() - 1].field2816;
                  if (0.0 != (double)var17) {
                     var4 += var18 * var12 / var17;
                  }

                  return var4;
               }
            } else {
               var12 += var5;
            }

            var4 = method926(var0, var12);
            float var19;
            if (var2 && class169.field1718 == var0.field1204) {
               var19 = var0.field1206[var0.method693() - 1].field2816 - var0.field1206[0].field2816;
               var4 = (float)((double)var4 - (double)var19 * var9);
            } else if (!var2 && var0.field1224 == class169.field1718) {
               var19 = var0.field1206[var0.method693() - 1].field2816 - var0.field1206[0].field2816;
               var4 = (float)((double)var4 + (double)var19 * var9);
            }

            return var4;
         }
      } else {
         return var4;
      }
   }
}
