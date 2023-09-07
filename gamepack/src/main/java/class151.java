public class class151 {
    public static final float field1307;
    public static final float field1308;
    static class461 field1311;
    static class88 field1306;
    static float[] field1309;
    static float[] field1310;

    static {
        field1307 = Math.ulp(1.0F);
        field1308 = field1307 * 2.0F;
        field1309 = new float[4];
        field1310 = new float[5];
    }

    class151() throws Throwable {
    }

    static float method718(class329 var0, float var1) {
        if (var0 != null && var0.method1530() != 0) {
            if (var1 < (float) var0.field2397[0].field4174) {
                return class410.field2889 == var0.field2395 ? var0.field2397[0].field4177 : method717(var0, var1, true);
            } else if (var1 > (float) var0.field2397[var0.method1530() - 1].field4174) {
                return class410.field2889 == var0.field2415 ? var0.field2397[var0.method1530() - 1].field4177 : method717(var0, var1, false);
            } else if (var0.field2394) {
                return var0.field2397[0].field4177;
            } else {
                class518 var3 = var0.method1529(var1);
                boolean var4 = false;
                boolean var5 = false;
                if (null == var3) {
                    return 0.0F;
                } else {
                    float var6;
                    float var7;
                    if (0.0D == (double) var3.field4178 && (double) var3.field4179 == 0.0D) {
                        var4 = true;
                    } else if (Float.MAX_VALUE == var3.field4178 && Float.MAX_VALUE == var3.field4179) {
                        var5 = true;
                    } else if (null != var3.field4180) {
                        if (var0.field2409) {
                            var6 = (float) var3.field4174;
                            float var10 = var3.field4177;
                            var7 = var3.field4178 * 0.33333334F + var6;
                            float var11 = var3.field4179 * 0.33333334F + var10;
                            float var9 = (float) var3.field4180.field4174;
                            float var13 = var3.field4180.field4177;
                            float var8 = var9 - var3.field4180.field4183 * 0.33333334F;
                            float var12 = var13 - var3.field4180.field4175 * 0.33333334F;
                            float var16;
                            float var17;
                            float var18;
                            float var19;
                            float var20;
                            if (var0.field2408) {
                                var16 = var11;
                                var17 = var12;
                                if (null != var0) {
                                    var18 = var9 - var6;
                                    if ((double) var18 != 0.0D) {
                                        var19 = var7 - var6;
                                        var20 = var8 - var6;
                                        float[] var30 = new float[]{var19 / var18, var20 / var18};
                                        var0.field2396 = 0.33333334F == var30[0] && var30[1] == 0.6666667F;
                                        float var22 = var30[0];
                                        float var23 = var30[1];
                                        if ((double) var30[0] < 0.0D) {
                                            var30[0] = 0.0F;
                                        }

                                        if ((double) var30[1] > 1.0D) {
                                            var30[1] = 1.0F;
                                        }

                                        if ((double) var30[0] > 1.0D || var30[1] < -1.0F) {
                                            class54.method162(var30);
                                        }

                                        float var10000;
                                        if (var30[0] != var22) {
                                            var10000 = var6 + var18 * var30[0];
                                            if (0.0D != (double) var22) {
                                                var16 = (var11 - var10) * var30[0] / var22 + var10;
                                            }
                                        }

                                        if (var23 != var30[1]) {
                                            var10000 = var6 + var18 * var30[1];
                                            if (1.0D != (double) var23) {
                                                var17 = (float) ((double) var13 - (1.0D - (double) var30[1]) * (double) (var13 - var12) / (1.0D - (double) var23));
                                            }
                                        }

                                        var0.field2399 = var6;
                                        var0.field2400 = var9;
                                        float var24 = var30[0];
                                        float var25 = var30[1];
                                        float var26 = var24 - 0.0F;
                                        float var27 = var25 - var24;
                                        float var28 = 1.0F - var25;
                                        float var29 = var27 - var26;
                                        var0.field2398 = var28 - var27 - var29;
                                        var0.field2403 = var29 + var29 + var29;
                                        var0.field2402 = var26 + var26 + var26;
                                        var0.field2401 = 0.0F;
                                        var26 = var16 - var10;
                                        var27 = var17 - var16;
                                        var28 = var13 - var17;
                                        var29 = var27 - var26;
                                        var0.field2393 = var28 - var27 - var29;
                                        var0.field2406 = var29 + var29 + var29;
                                        var0.field2405 = var26 + var26 + var26;
                                        var0.field2416 = var10;
                                    }
                                }
                            } else if (var0 != null) {
                                var0.field2399 = var6;
                                float var14 = var9 - var6;
                                float var15 = var13 - var10;
                                var16 = var7 - var6;
                                var17 = 0.0F;
                                var18 = 0.0F;
                                if ((double) var16 != 0.0D) {
                                    var17 = (var11 - var10) / var16;
                                }

                                var16 = var9 - var8;
                                if ((double) var16 != 0.0D) {
                                    var18 = (var13 - var12) / var16;
                                }

                                var19 = 1.0F / (var14 * var14);
                                var20 = var17 * var14;
                                float var21 = var18 * var14;
                                var0.field2401 = var19 * (var20 + var21 - var15 - var15) / var14;
                                var0.field2402 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
                                var0.field2403 = var17;
                                var0.field2398 = var10;
                            }

                            var0.field2409 = false;
                        }
                    } else {
                        var4 = true;
                    }

                    if (var4) {
                        return var3.field4177;
                    } else if (var5) {
                        return (float) var3.field4174 != var1 && null != var3.field4180 ? var3.field4180.field4177 : var3.field4177;
                    } else if (var0.field2408) {
                        return method719(var0, var1);
                    } else {
                        if (var0 == null) {
                            var6 = 0.0F;
                        } else {
                            var7 = var1 - var0.field2399;
                            var6 = var0.field2398 + var7 * ((var7 * var0.field2401 + var0.field2402) * var7 + var0.field2403);
                        }

                        return var6;
                    }
                }
            }
        } else {
            return 0.0F;
        }
    }

    static float method719(class329 var0, float var1) {
        if (var0 == null) {
            return 0.0F;
        } else {
            float var3;
            if (var0.field2399 == var1) {
                var3 = 0.0F;
            } else if (var1 == var0.field2400) {
                var3 = 1.0F;
            } else {
                var3 = (var1 - var0.field2399) / (var0.field2400 - var0.field2399);
            }

            float var4;
            if (var0.field2396) {
                var4 = var3;
            } else {
                field1309[3] = var0.field2398;
                field1309[2] = var0.field2403;
                field1309[1] = var0.field2402;
                field1309[0] = var0.field2401 - var3;
                field1310[0] = 0.0F;
                field1310[1] = 0.0F;
                field1310[2] = 0.0F;
                field1310[3] = 0.0F;
                field1310[4] = 0.0F;
                int var5 = class317.method1395(field1309, 3, 0.0F, true, 1.0F, true, field1310);
                if (var5 == 1) {
                    var4 = field1310[0];
                } else {
                    var4 = 0.0F;
                }
            }

            return var4 * (var0.field2405 + var4 * (var4 * var0.field2393 + var0.field2406)) + var0.field2416;
        }
    }

    static float method717(class329 var0, float var1, boolean var2) {
        float var4 = 0.0F;
        if (null != var0 && var0.method1530() != 0) {
            float var5 = (float) var0.field2397[0].field4174;
            float var6 = (float) var0.field2397[var0.method1530() - 1].field4174;
            float var7 = var6 - var5;
            if ((double) var7 == 0.0D) {
                return var0.field2397[0].field4177;
            } else {
                float var8 = 0.0F;
                if (var1 > var6) {
                    var8 = (var1 - var6) / var7;
                } else {
                    var8 = (var1 - var5) / var7;
                }

                double var9 = (int) var8;
                float var11 = Math.abs((float) ((double) var8 - var9));
                float var12 = var11 * var7;
                var9 = Math.abs(var9 + 1.0D);
                double var13 = var9 / 2.0D;
                double var15 = (int) var13;
                var11 = (float) (var13 - var15);
                float var17;
                float var18;
                if (var2) {
                    if (class410.field2895 == var0.field2395) {
                        if ((double) var11 != 0.0D) {
                            var12 += var5;
                        } else {
                            var12 = var6 - var12;
                        }
                    } else if (var0.field2395 != class410.field2890 && var0.field2395 != class410.field2891) {
                        if (class410.field2892 == var0.field2395) {
                            var12 = var5 - var1;
                            var17 = var0.field2397[0].field4183;
                            var18 = var0.field2397[0].field4175;
                            var4 = var0.field2397[0].field4177;
                            if (0.0D != (double) var17) {
                                var4 -= var12 * var18 / var17;
                            }

                            return var4;
                        }
                    } else {
                        var12 = var6 - var12;
                    }
                } else if (class410.field2895 == var0.field2415) {
                    if ((double) var11 != 0.0D) {
                        var12 = var6 - var12;
                    } else {
                        var12 += var5;
                    }
                } else if (class410.field2890 != var0.field2415 && var0.field2415 != class410.field2891) {
                    if (var0.field2415 == class410.field2892) {
                        var12 = var1 - var6;
                        var17 = var0.field2397[var0.method1530() - 1].field4178;
                        var18 = var0.field2397[var0.method1530() - 1].field4179;
                        var4 = var0.field2397[var0.method1530() - 1].field4177;
                        if (0.0D != (double) var17) {
                            var4 += var18 * var12 / var17;
                        }

                        return var4;
                    }
                } else {
                    var12 += var5;
                }

                var4 = method718(var0, var12);
                float var19;
                if (var2 && class410.field2891 == var0.field2395) {
                    var19 = var0.field2397[var0.method1530() - 1].field4177 - var0.field2397[0].field4177;
                    var4 = (float) ((double) var4 - (double) var19 * var9);
                } else if (!var2 && var0.field2415 == class410.field2891) {
                    var19 = var0.field2397[var0.method1530() - 1].field4177 - var0.field2397[0].field4177;
                    var4 = (float) ((double) var4 + (double) var19 * var9);
                }

                return var4;
            }
        } else {
            return var4;
        }
    }
}
