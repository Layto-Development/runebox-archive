public final class class513 {
   static byte[][][] field4100 = new byte[4][104][104];
   static class534 field4089;
   static int field4088;
   static int field4090 = 99;
   static int field4097 = (int)(Math.random() * 17.0) - 8;
   static int field4102 = (int)(Math.random() * 33.0) - 16;
   static int[] field4092;
   static int[][][] field4098 = new int[4][105][105];
   static short[][][] field4091;
   static final int[] field4093 = new int[]{1, 2, 4, 8};
   static final int[] field4094 = new int[]{16, 32, 64, 128};
   static final int[] field4095 = new int[]{1, 0, -1, 0};
   static final int[] field4096 = new int[]{0, -1, 0, 1};
   static final int[] field4099 = new int[]{-1, -1, 1, 1};
   static final int[] field4101 = new int[]{1, -1, -1, 1};

   class513() throws Throwable {
   }

   public static class296 method2454(class509 var0, int var1, int var2) {
      return !class382.method1762(var0, var1, var2) ? null : class382.method1764();
   }

   static void method2470() {
      field4090 = 99;
      field4091 = new short[4][104][104];
      class242.field1766 = new short[4][104][104];
      class438.field3475 = new byte[4][104][104];
      class111.field718 = new byte[4][104][104];
      class490.field3930 = new int[4][105][105];
      class82.field560 = new byte[4][105][105];
      class262.field1861 = new int[105][105];
      class488.field3922 = new int[104];
      class56.field459 = new int[104];
      field4092 = new int[104];
      class108.field711 = new int[104];
      class197.field1533 = new int[104];
   }

   static void method2457() {
      field4091 = (short[][][])null;
      class242.field1766 = (short[][][])null;
      class438.field3475 = (byte[][][])null;
      class111.field718 = (byte[][][])null;
      class490.field3930 = (int[][][])null;
      class82.field560 = (byte[][][])null;
      class262.field1861 = (int[][])null;
      class488.field3922 = null;
      class56.field459 = null;
      field4092 = null;
      class108.field711 = null;
      class197.field1533 = null;
   }

   static final void method2456(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var1 + var3; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class82.field560[0][var6][var5] = 127;
               if (var6 == var0 && var6 > 0) {
                  field4098[0][var6][var5] = field4098[0][var6 - 1][var5];
               }

               if (var6 == var2 + var0 && var6 < 103) {
                  field4098[0][var6][var5] = field4098[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  field4098[0][var6][var5] = field4098[0][var6][var5 - 1];
               }

               if (var5 == var3 + var1 && var5 < 103) {
                  field4098[0][var6][var5] = field4098[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   static final void method2466(byte[] var0, int var1, int var2, int var3, int var4, class378[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var8 + var1 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
                  int[] var10000 = var5[var7].field2701[var8 + var1];
                  var10000[var2 + var9] &= -16777217;
               }
            }
         }
      }

      class366 var13 = new class366(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               int var11 = var1 + var9;
               int var12 = var2 + var10;
               method2458(var13, var8, var11, var12, var3 + var11, var12 + var4, 0);
            }
         }
      }

   }

   static final void method2469(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            field4098[var0][var4 + var1][var5 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            field4098[var0][var1][var2 + var4] = field4098[var0][var1 - 1][var4 + var2];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            field4098[var0][var1 + var4][var2] = field4098[var0][var4 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && field4098[var0][var1 - 1][var2] != 0) {
         field4098[var0][var1][var2] = field4098[var0][var1 - 1][var2];
      } else if (var2 > 0 && 0 != field4098[var0][var1][var2 - 1]) {
         field4098[var0][var1][var2] = field4098[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && field4098[var0][var1 - 1][var2 - 1] != 0) {
         field4098[var0][var1][var2] = field4098[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method2458(class366 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8;
      if (class298.method1373(var1, var2, var3)) {
         field4100[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.method1703();
            if (var8 == 0) {
               if (var1 == 0) {
                  int[] var15 = field4098[0][var2];
                  int var12 = var4 + 932731;
                  int var13 = var5 + 556238;
                  int var14 = method2464(var12 + '\ub135', var13 + 91923, 4) - 128 + (method2464(var12 + 10294, var13 + '\u93bd', 2) - 128 >> 1) + (method2464(var12, var13, 1) - 128 >> 2);
                  var14 = (int)((double)var14 * 0.3) + 35;
                  if (var14 < 10) {
                     var14 = 10;
                  } else if (var14 > 60) {
                     var14 = 60;
                  }

                  var15[var3] = -var14 * 8;
               } else {
                  field4098[var1][var2][var3] = field4098[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var8 == 1) {
               int var9 = var0.method1654();
               if (var9 == 1) {
                  var9 = 0;
               }

               if (var1 == 0) {
                  field4098[0][var2][var3] = -var9 * 8;
               } else {
                  field4098[var1][var2][var3] = field4098[var1 - 1][var2][var3] - var9 * 8;
               }
               break;
            }

            if (var8 <= 49) {
               class242.field1766[var1][var2][var3] = (short)var0.method1656();
               class438.field3475[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class111.field718[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               field4100[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               field4091[var1][var2][var3] = (short)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.method1703();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var0.method1654();
               break;
            }

            if (var8 <= 49) {
               var0.method1656();
            }
         }
      }

   }

   static final boolean method2463(byte[] var0, int var1, int var2) {
      boolean var4 = true;
      class366 var5 = new class366(var0);
      int var6 = -1;

      label57:
      while(true) {
         int var7 = var5.method1667();
         if (var7 == 0) {
            return var4;
         }

         var6 += var7;
         int var8 = 0;
         boolean var9 = false;

         while(true) {
            int var10;
            while(!var9) {
               var10 = var5.method1701();
               if (var10 == 0) {
                  continue label57;
               }

               var8 += var10 - 1;
               int var11 = var8 & 63;
               int var12 = var8 >> 6 & 63;
               int var13 = var5.method1654() >> 2;
               int var14 = var12 + var1;
               int var15 = var11 + var2;
               if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                  class458 var16 = class430.method2004(var6, (byte)-45);
                  if (var13 != 22 || !Client.field1120 || 0 != var16.field3619 || 1 == var16.field3612 || var16.field3599) {
                     if (!var16.method2151()) {
                        ++Client.field1188;
                        var4 = false;
                     }

                     var9 = true;
                  }
               }
            }

            var10 = var5.method1701();
            if (var10 == 0) {
               break;
            }

            var5.method1654();
         }
      }
   }

   static final void method2471(byte[] var0, int var1, int var2, class408 var3, class378[] var4) {
      class366 var6 = new class366(var0);
      int var7 = -1;

      while(true) {
         int var8 = var6.method1667();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.method1701();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method1654();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var1 + var12;
            int var18 = var11 + var2;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if ((field4100[1][var17][var18] & 2) == 2) {
                  var19 = var13 - 1;
               }

               class378 var20 = null;
               if (var19 >= 0) {
                  var20 = var4[var19];
               }

               class108.method392(var13, var17, var18, var7, var16, var15, var3, var20);
            }
         }
      }
   }

   static final void method2453(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class408 var8, class378[] var9) {
      class366 var10 = new class366(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method1667();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method1701();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method1654();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               class458 var21 = class430.method2004(var11, (byte)-48);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.field3610;
               int var28 = var21.field3595;
               int var29;
               if (1 == (var20 & 1)) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (var26 == 2) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var30 = var3 + class352.method1604(var16 & 7, var15 & 7, var7, var21.field3610, var21.field3595, var20);
               if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                  int var31 = var1;
                  if (2 == (field4100[1][var29][var30] & 2)) {
                     var31 = var1 - 1;
                  }

                  class378 var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  class108.method392(var1, var29, var30, var11, var7 + var20 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   static final void method2461(class408 var0, class378[] var1) {
      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               if ((field4100[var3][var4][var5] & 1) == 1) {
                  var6 = var3;
                  if ((field4100[1][var4][var5] & 2) == 2) {
                     var6 = var3 - 1;
                  }

                  if (var6 >= 0) {
                     var1[var6].method1749(var4, var5);
                  }
               }
            }
         }
      }

      field4097 += (int)(Math.random() * 5.0) - 2;
      if (field4097 < -8) {
         field4097 = -8;
      }

      if (field4097 > 8) {
         field4097 = 8;
      }

      field4102 += (int)(Math.random() * 5.0) - 2;
      if (field4102 < -16) {
         field4102 = -16;
      }

      if (field4102 > 16) {
         field4102 = 16;
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int[] var10000;
      int var17;
      int var18;
      int var19;
      for(var3 = 0; var3 < 4; ++var3) {
         byte[][] var48 = class82.field560[var3];
         boolean var49 = true;
         boolean var50 = true;
         boolean var7 = true;
         boolean var8 = true;
         boolean var9 = true;
         var10 = (int)Math.sqrt(5100.0);
         var11 = var10 * 768 >> 8;

         int var20;
         int var21;
         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var14 = field4098[var3][var13 + 1][var12] - field4098[var3][var13 - 1][var12];
               var15 = field4098[var3][var13][var12 + 1] - field4098[var3][var13][var12 - 1];
               var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
               var17 = (var14 << 8) / var16;
               var18 = 65536 / var16;
               var19 = (var15 << 8) / var16;
               var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
               var21 = (var48[var13][var12] >> 1) + (var48[var13][var12 + 1] >> 3) + (var48[var13 - 1][var12] >> 2) + (var48[var13 + 1][var12] >> 3) + (var48[var13][var12 - 1] >> 2);
               class262.field1861[var13][var12] = var20 - var21;
            }
         }

         for(var12 = 0; var12 < 104; ++var12) {
            class488.field3922[var12] = 0;
            class56.field459[var12] = 0;
            field4092[var12] = 0;
            class108.field711[var12] = 0;
            class197.field1533[var12] = 0;
         }

         for(var12 = -5; var12 < 109; ++var12) {
            for(var13 = 0; var13 < 104; ++var13) {
               var14 = var12 + 5;
               int var10002;
               if (var14 >= 0 && var14 < 104) {
                  long var54 = (long)Math.pow(2.0, 15.0) - 1L;
                  var17 = (int)var54;
                  var18 = field4091[var3][var14][var13] & var17;
                  if (var18 > 0) {
                     var20 = var18 - 1;
                     class356 var59 = (class356)class356.field2585.method1183((long)var20);
                     class356 var57;
                     if (var59 != null) {
                        var57 = var59;
                     } else {
                        byte[] var22 = class356.field2584.method2422(1, var20);
                        var59 = new class356();
                        if (null != var22) {
                           var59.method1611(new class366(var22), var20);
                        }

                        var59.method1610();
                        class356.field2585.method1182(var59, (long)var20);
                        var57 = var59;
                     }

                     var10000 = class488.field3922;
                     var10000[var13] += var57.field2590;
                     var10000 = class56.field459;
                     var10000[var13] += var57.field2588;
                     var10000 = field4092;
                     var10000[var13] += var57.field2587;
                     var10000 = class108.field711;
                     var10000[var13] += var57.field2589;
                     var10002 = class197.field1533[var13]++;
                  }
               }

               var15 = var12 - 5;
               if (var15 >= 0 && var15 < 104) {
                  long var55 = (long)Math.pow(2.0, 15.0) - 1L;
                  var18 = (int)var55;
                  var19 = field4091[var3][var15][var13] & var18;
                  if (var19 > 0) {
                     var21 = var19 - 1;
                     class356 var60 = (class356)class356.field2585.method1183((long)var21);
                     class356 var58;
                     if (null != var60) {
                        var58 = var60;
                     } else {
                        byte[] var23 = class356.field2584.method2422(1, var21);
                        var60 = new class356();
                        if (null != var23) {
                           var60.method1611(new class366(var23), var21);
                        }

                        var60.method1610();
                        class356.field2585.method1182(var60, (long)var21);
                        var58 = var60;
                     }

                     var10000 = class488.field3922;
                     var10000[var13] -= var58.field2590;
                     var10000 = class56.field459;
                     var10000[var13] -= var58.field2588;
                     var10000 = field4092;
                     var10000[var13] -= var58.field2587;
                     var10000 = class108.field711;
                     var10000[var13] -= var58.field2589;
                     var10002 = class197.field1533[var13]--;
                  }
               }
            }

            if (var12 >= 1 && var12 < 103) {
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;
               var17 = 0;

               for(var18 = -5; var18 < 109; ++var18) {
                  var19 = var18 + 5;
                  if (var19 >= 0 && var19 < 104) {
                     var13 += class488.field3922[var19];
                     var14 += class56.field459[var19];
                     var15 += field4092[var19];
                     var16 += class108.field711[var19];
                     var17 += class197.field1533[var19];
                  }

                  var20 = var18 - 5;
                  if (var20 >= 0 && var20 < 104) {
                     var13 -= class488.field3922[var20];
                     var14 -= class56.field459[var20];
                     var15 -= field4092[var20];
                     var16 -= class108.field711[var20];
                     var17 -= class197.field1533[var20];
                  }

                  if (var18 >= 1 && var18 < 103 && (!Client.field1120 || 0 != (field4100[0][var12][var18] & 2) || (field4100[var3][var12][var18] & 16) == 0)) {
                     if (var3 < field4090) {
                        field4090 = var3;
                     }

                     long var61 = (long)Math.pow(2.0, 15.0) - 1L;
                     int var62 = (int)var61;
                     int var24 = field4091[var3][var12][var18] & var62;
                     int var25 = class242.field1766[var3][var12][var18] & var62;
                     if (var24 > 0 || var25 > 0) {
                        int var26 = field4098[var3][var12][var18];
                        int var27 = field4098[var3][var12 + 1][var18];
                        int var28 = field4098[var3][var12 + 1][var18 + 1];
                        int var29 = field4098[var3][var12][var18 + 1];
                        int var30 = class262.field1861[var12][var18];
                        int var31 = class262.field1861[var12 + 1][var18];
                        int var32 = class262.field1861[var12 + 1][var18 + 1];
                        int var33 = class262.field1861[var12][var18 + 1];
                        int var34 = -1;
                        int var35 = -1;
                        int var36;
                        int var37;
                        int var38;
                        if (var24 > 0) {
                           var36 = var13 * 256 / var16;
                           var37 = var14 / var17;
                           var38 = var15 / var17;
                           var34 = method2462(var36, var37, var38);
                           var36 = var36 + field4097 & 255;
                           var38 += field4102;
                           if (var38 < 0) {
                              var38 = 0;
                           } else if (var38 > 255) {
                              var38 = 255;
                           }

                           var35 = method2462(var36, var37, var38);
                        }

                        class223 var39;
                        if (var3 > 0) {
                           boolean var63 = true;
                           if (var24 == 0 && 0 != class438.field3475[var3][var12][var18]) {
                              var63 = false;
                           }

                           if (var25 > 0) {
                              var38 = var25 - 1;
                              var39 = (class223)class223.field1673.method1183((long)var38);
                              class223 var64;
                              if (null != var39) {
                                 var64 = var39;
                              } else {
                                 byte[] var40 = class223.field1678.method2422(4, var38);
                                 var39 = new class223();
                                 if (var40 != null) {
                                    var39.method1114(new class366(var40), var38);
                                 }

                                 var39.method1113();
                                 class223.field1673.method1182(var39, (long)var38);
                                 var64 = var39;
                              }

                              if (!var64.field1669) {
                                 var63 = false;
                              }
                           }

                           if (var63 && var27 == var26 && var28 == var26 && var26 == var29) {
                              var10000 = class490.field3930[var3][var12];
                              var10000[var18] |= 2340;
                           }
                        }

                        var36 = 0;
                        if (var35 != -1) {
                           var36 = class480.field3792[method2460(var35, 96)];
                        }

                        if (var25 == 0) {
                           var0.method1874(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, method2460(var34, var30), method2460(var34, var31), method2460(var34, var32), method2460(var34, var33), 0, 0, 0, 0, var36, 0);
                        } else {
                           var37 = 1 + class438.field3475[var3][var12][var18];
                           byte var65 = class111.field718[var3][var12][var18];
                           int var66 = var25 - 1;
                           class223 var41 = (class223)class223.field1673.method1183((long)var66);
                           if (null != var41) {
                              var39 = var41;
                           } else {
                              byte[] var42 = class223.field1678.method2422(4, var66);
                              var41 = new class223();
                              if (var42 != null) {
                                 var41.method1114(new class366(var42), var66);
                              }

                              var41.method1113();
                              class223.field1673.method1182(var41, (long)var66);
                              var39 = var41;
                           }

                           int var67 = var39.field1666;
                           int var43;
                           int var44;
                           int var45;
                           int var46;
                           if (var67 >= 0) {
                              var44 = class480.field3797.field4112.method1096(var67);
                              var43 = -1;
                           } else if (var39.field1667 == 16711935) {
                              var43 = -2;
                              var67 = -1;
                              var44 = -2;
                           } else {
                              var43 = method2462(var39.field1671, var39.field1672, var39.field1677);
                              var45 = field4097 + var39.field1671 & 255;
                              var46 = var39.field1677 + field4102;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = method2462(var45, var39.field1672, var46);
                           }

                           var45 = 0;
                           if (var44 != -2) {
                              var45 = class480.field3792[method2459(var44, 96)];
                           }

                           if (var39.field1670 != -1) {
                              var46 = field4097 + var39.field1675 & 255;
                              int var47 = field4102 + var39.field1676;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = 255;
                              }

                              var44 = method2462(var46, var39.field1674, var47);
                              var45 = class480.field3792[method2459(var44, 96)];
                           }

                           var0.method1874(var3, var12, var18, var37, var65, var67, var26, var27, var28, var29, method2460(var34, var30), method2460(var34, var31), method2460(var34, var32), method2460(var34, var33), method2459(var43, var30), method2459(var43, var31), method2459(var43, var32), method2459(var43, var33), var36, var45);
                        }
                     }
                  }
               }
            }
         }

         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var0.method1889(var3, var13, var12, method2465(var3, var13, var12));
            }
         }

         field4091[var3] = (short[][])null;
         class242.field1766[var3] = (short[][])null;
         class438.field3475[var3] = (byte[][])null;
         class111.field718[var3] = (byte[][])null;
         class82.field560[var3] = (byte[][])null;
      }

      var0.method1854(-50, -10, -50);

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            if ((field4100[1][var3][var4] & 2) == 2) {
               var0.method1837(var3, var4);
            }
         }
      }

      var3 = 1;
      var4 = 2;
      var5 = 4;

      for(var6 = 0; var6 < 4; ++var6) {
         if (var6 > 0) {
            var3 <<= 3;
            var4 <<= 3;
            var5 <<= 3;
         }

         for(int var51 = 0; var51 <= var6; ++var51) {
            for(int var52 = 0; var52 <= 104; ++var52) {
               for(int var53 = 0; var53 <= 104; ++var53) {
                  short var56;
                  if (0 != (class490.field3930[var51][var53][var52] & var3)) {
                     var10 = var52;
                     var11 = var52;
                     var12 = var51;

                     for(var13 = var51; var10 > 0 && 0 != (class490.field3930[var51][var53][var10 - 1] & var3); --var10) {
                     }

                     while(var11 < 104 && (class490.field3930[var51][var53][var11 + 1] & var3) != 0) {
                        ++var11;
                     }

                     label367:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class490.field3930[var12 - 1][var53][var14] & var3) == 0) {
                              break label367;
                           }
                        }

                        --var12;
                     }

                     label356:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class490.field3930[var13 + 1][var53][var14] & var3) == 0) {
                              break label356;
                           }
                        }

                        ++var13;
                     }

                     var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
                     if (var14 >= 8) {
                        var56 = 240;
                        var16 = field4098[var13][var53][var10] - var56;
                        var17 = field4098[var12][var53][var10];
                        class408.method1838(var6, 1, var53 * 128, var53 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              var10000 = class490.field3930[var18][var53];
                              var10000[var19] &= ~var3;
                           }
                        }
                     }
                  }

                  if (0 != (class490.field3930[var51][var53][var52] & var4)) {
                     var10 = var53;
                     var11 = var53;
                     var12 = var51;

                     for(var13 = var51; var10 > 0 && 0 != (class490.field3930[var51][var10 - 1][var52] & var4); --var10) {
                     }

                     while(var11 < 104 && (class490.field3930[var51][var11 + 1][var52] & var4) != 0) {
                        ++var11;
                     }

                     label420:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (class490.field3930[var12 - 1][var14][var52] & var4)) {
                              break label420;
                           }
                        }

                        --var12;
                     }

                     label409:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (class490.field3930[var13 + 1][var14][var52] & var4)) {
                              break label409;
                           }
                        }

                        ++var13;
                     }

                     var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                     if (var14 >= 8) {
                        var56 = 240;
                        var16 = field4098[var13][var10][var52] - var56;
                        var17 = field4098[var12][var10][var52];
                        class408.method1838(var6, 2, var10 * 128, 128 + var11 * 128, var52 * 128, var52 * 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              var10000 = class490.field3930[var18][var19];
                              var10000[var52] &= ~var4;
                           }
                        }
                     }
                  }

                  if (0 != (class490.field3930[var51][var53][var52] & var5)) {
                     var10 = var53;
                     var11 = var53;
                     var12 = var52;

                     for(var13 = var52; var12 > 0 && (class490.field3930[var51][var53][var12 - 1] & var5) != 0; --var12) {
                     }

                     while(var13 < 104 && (class490.field3930[var51][var53][var13 + 1] & var5) != 0) {
                        ++var13;
                     }

                     label473:
                     while(var10 > 0) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if ((class490.field3930[var51][var10 - 1][var14] & var5) == 0) {
                              break label473;
                           }
                        }

                        --var10;
                     }

                     label462:
                     while(var11 < 104) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if (0 == (class490.field3930[var51][var11 + 1][var14] & var5)) {
                              break label462;
                           }
                        }

                        ++var11;
                     }

                     if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
                        var14 = field4098[var51][var10][var12];
                        class408.method1838(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var16 = var12; var16 <= var13; ++var16) {
                              var10000 = class490.field3930[var51][var15];
                              var10000[var16] &= ~var5;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static int method2465(int var0, int var1, int var2) {
      if (0 != (field4100[var0][var1][var2] & 8)) {
         return 0;
      } else {
         return var0 > 0 && (field4100[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }

   static final int method2464(int var0, int var1, int var2) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = method2467(var4, var6);
      int var9 = method2467(var4 + 1, var6);
      int var10 = method2467(var4, var6 + 1);
      int var11 = method2467(var4 + 1, var6 + 1);
      int var12 = method2455(var8, var9, var5, var2);
      int var13 = method2455(var10, var11, var5, var2);
      return method2455(var12, var13, var7, var2);
   }

   static final int method2455(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - class480.field3793[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
   }

   static final int method2467(int var0, int var1) {
      int var3 = method2468(var0 - 1, var1 - 1) + method2468(var0 + 1, var1 - 1) + method2468(var0 - 1, var1 + 1) + method2468(var0 + 1, var1 + 1);
      int var4 = method2468(var0 - 1, var1) + method2468(var0 + 1, var1) + method2468(var0, var1 - 1) + method2468(var0, var1 + 1);
      int var5 = method2468(var0, var1);
      return var3 / 16 + var4 / 8 + var5 / 4;
   }

   static final int method2468(int var0, int var1) {
      int var3 = var1 * 57 + var0;
      var3 ^= var3 << 13;
      int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   static final int method2460(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final int method2459(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final int method2462(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var4;
   }
}
