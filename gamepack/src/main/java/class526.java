public final class class526 {
   static byte[][][] field4143 = new byte[4][104][104];
   static class22 field4132;
   static int field4131;
   static int field4133 = 99;
   static int field4140 = (int)(Math.random() * 17.0) - 8;
   static int field4145 = (int)(Math.random() * 33.0) - 16;
   static int[] field4135;
   static int[][][] field4141 = new int[4][105][105];
   static short[][][] field4134;
   static final int[] field4136 = new int[]{1, 2, 4, 8};
   static final int[] field4137 = new int[]{16, 32, 64, 128};
   static final int[] field4138 = new int[]{1, 0, -1, 0};
   static final int[] field4139 = new int[]{0, -1, 0, 1};
   static final int[] field4142 = new int[]{-1, -1, 1, 1};
   static final int[] field4144 = new int[]{1, -1, -1, 1};

   class526() throws Throwable {
   }

   public static class427 method2492(class298 var0, int var1, int var2) {
      return !class398.method1922(var0, var1, var2) ? null : class398.method1924();
   }

   static void method2508() {
      field4133 = 99;
      field4134 = new short[4][104][104];
      class226.field2088 = new short[4][104][104];
      class85.field1269 = new byte[4][104][104];
      class141.field1592 = new byte[4][104][104];
      class125.field1521 = new int[4][105][105];
      class423.field3209 = new byte[4][105][105];
      class514.field3986 = new int[105][105];
      class31.field573 = new int[104];
      class393.field3081 = new int[104];
      field4135 = new int[104];
      class169.field1721 = new int[104];
      class18.field196 = new int[104];
   }

   static void method2495() {
      field4134 = (short[][][])null;
      class226.field2088 = (short[][][])null;
      class85.field1269 = (byte[][][])null;
      class141.field1592 = (byte[][][])null;
      class125.field1521 = (int[][][])null;
      class423.field3209 = (byte[][][])null;
      class514.field3986 = (int[][])null;
      class31.field573 = null;
      class393.field3081 = null;
      field4135 = null;
      class169.field1721 = null;
      class18.field196 = null;
   }

   static final void method2494(int var0, int var1, int var2, int var3) {
      for(int var5 = var1; var5 <= var1 + var3; ++var5) {
         for(int var6 = var0; var6 <= var0 + var2; ++var6) {
            if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
               class423.field3209[0][var6][var5] = 127;
               if (var6 == var0 && var6 > 0) {
                  field4141[0][var6][var5] = field4141[0][var6 - 1][var5];
               }

               if (var6 == var2 + var0 && var6 < 103) {
                  field4141[0][var6][var5] = field4141[0][var6 + 1][var5];
               }

               if (var5 == var1 && var5 > 0) {
                  field4141[0][var6][var5] = field4141[0][var6][var5 - 1];
               }

               if (var5 == var3 + var1 && var5 < 103) {
                  field4141[0][var6][var5] = field4141[0][var6][var5 + 1];
               }
            }
         }
      }

   }

   static final void method2504(byte[] var0, int var1, int var2, int var3, int var4, class278[] var5) {
      int var8;
      int var9;
      for(int var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var8 + var1 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var2 + var9 < 103) {
                  int[] var10000 = var5[var7].field2387[var8 + var1];
                  var10000[var2 + var9] &= -16777217;
               }
            }
         }
      }

      class184 var13 = new class184(var0);

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; var9 < 64; ++var9) {
            for(int var10 = 0; var10 < 64; ++var10) {
               int var11 = var1 + var9;
               int var12 = var2 + var10;
               method2496(var13, var8, var11, var12, var3 + var11, var12 + var4, 0);
            }
         }
      }

   }

   static final void method2507(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            field4141[var0][var4 + var1][var5 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            field4141[var0][var1][var2 + var4] = field4141[var0][var1 - 1][var4 + var2];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            field4141[var0][var1 + var4][var2] = field4141[var0][var4 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && field4141[var0][var1 - 1][var2] != 0) {
         field4141[var0][var1][var2] = field4141[var0][var1 - 1][var2];
      } else if (var2 > 0 && field4141[var0][var1][var2 - 1] != 0) {
         field4141[var0][var1][var2] = field4141[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && field4141[var0][var1 - 1][var2 - 1] != 0) {
         field4141[var0][var1][var2] = field4141[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method2496(class184 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8;
      if (class462.method2261(var1, var2, var3)) {
         field4143[var1][var2][var3] = 0;

         while(true) {
            var8 = var0.method1174();
            if (var8 == 0) {
               if (var1 == 0) {
                  int[] var15 = field4141[0][var2];
                  int var12 = var4 + 932731;
                  int var13 = var5 + 556238;
                  int var14 = method2502(var12 + '\ub135', var13 + 91923, 4) - 128 + (method2502(var12 + 10294, var13 + '\u93bd', 2) - 128 >> 1) + (method2502(var12, var13, 1) - 128 >> 2);
                  var14 = (int)((double)var14 * 0.3) + 35;
                  if (var14 < 10) {
                     var14 = 10;
                  } else if (var14 > 60) {
                     var14 = 60;
                  }

                  var15[var3] = -var14 * 8;
               } else {
                  field4141[var1][var2][var3] = field4141[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var8 == 1) {
               int var9 = var0.method1125();
               if (var9 == 1) {
                  var9 = 0;
               }

               if (var1 == 0) {
                  field4141[0][var2][var3] = -var9 * 8;
               } else {
                  field4141[var1][var2][var3] = field4141[var1 - 1][var2][var3] - var9 * 8;
               }
               break;
            }

            if (var8 <= 49) {
               class226.field2088[var1][var2][var3] = (short)var0.method1127();
               class85.field1269[var1][var2][var3] = (byte)((var8 - 2) / 4);
               class141.field1592[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
            } else if (var8 <= 81) {
               field4143[var1][var2][var3] = (byte)(var8 - 49);
            } else {
               field4134[var1][var2][var3] = (short)(var8 - 81);
            }
         }
      } else {
         while(true) {
            var8 = var0.method1174();
            if (var8 == 0) {
               break;
            }

            if (var8 == 1) {
               var0.method1125();
               break;
            }

            if (var8 <= 49) {
               var0.method1127();
            }
         }
      }

   }

   static final boolean method2501(byte[] var0, int var1, int var2) {
      boolean var4 = true;
      class184 var5 = new class184(var0);
      int var6 = -1;

      label57:
      while(true) {
         int var7 = var5.method1138();
         if (var7 == 0) {
            return var4;
         }

         var6 += var7;
         int var8 = 0;
         boolean var9 = false;

         while(true) {
            int var10;
            while(!var9) {
               var10 = var5.method1172();
               if (var10 == 0) {
                  continue label57;
               }

               var8 += var10 - 1;
               int var11 = var8 & 63;
               int var12 = var8 >> 6 & 63;
               int var13 = var5.method1125() >> 2;
               int var14 = var12 + var1;
               int var15 = var11 + var2;
               if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                  class449 var16 = class444.method2172(var6, (byte)-45);
                  if (var13 != 22 || !Client.field580 || var16.field3459 != 0 || var16.field3452 == 1 || var16.field3439) {
                     if (!var16.method2211()) {
                        ++Client.field648;
                        var4 = false;
                     }

                     var9 = true;
                  }
               }
            }

            var10 = var5.method1172();
            if (var10 == 0) {
               break;
            }

            var5.method1125();
         }
      }
   }

   static final void method2509(byte[] var0, int var1, int var2, class175 var3, class278[] var4) {
      class184 var6 = new class184(var0);
      int var7 = -1;

      while(true) {
         int var8 = var6.method1138();
         if (var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.method1172();
            if (var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.method1125();
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var1 + var12;
            int var18 = var11 + var2;
            if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
               int var19 = var13;
               if ((field4143[1][var17][var18] & 2) == 2) {
                  var19 = var13 - 1;
               }

               class278 var20 = null;
               if (var19 >= 0) {
                  var20 = var4[var19];
               }

               class169.method1019(var13, var17, var18, var7, var16, var15, var3, var20);
            }
         }
      }
   }

   static final void method2491(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class175 var8, class278[] var9) {
      class184 var10 = new class184(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method1138();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method1172();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method1125();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               class449 var21 = class444.method2172(var11, (byte)-48);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.field3450;
               int var28 = var21.field3435;
               int var29;
               if ((var20 & 1) == 1) {
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
               int var30 = var3 + class411.method1987(var16 & 7, var15 & 7, var7, var21.field3450, var21.field3435, var20);
               if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                  int var31 = var1;
                  if ((field4143[1][var29][var30] & 2) == 2) {
                     var31 = var1 - 1;
                  }

                  class278 var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  class169.method1019(var1, var29, var30, var11, var7 + var20 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   static final void method2499(class175 var0, class278[] var1) {
      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               if ((field4143[var3][var4][var5] & 1) == 1) {
                  var6 = var3;
                  if ((field4143[1][var4][var5] & 2) == 2) {
                     var6 = var3 - 1;
                  }

                  if (var6 >= 0) {
                     var1[var6].method1532(var4, var5);
                  }
               }
            }
         }
      }

      field4140 += (int)(Math.random() * 5.0) - 2;
      if (field4140 < -8) {
         field4140 = -8;
      }

      if (field4140 > 8) {
         field4140 = 8;
      }

      field4145 += (int)(Math.random() * 5.0) - 2;
      if (field4145 < -16) {
         field4145 = -16;
      }

      if (field4145 > 16) {
         field4145 = 16;
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
         byte[][] var48 = class423.field3209[var3];
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
               var14 = field4141[var3][var13 + 1][var12] - field4141[var3][var13 - 1][var12];
               var15 = field4141[var3][var13][var12 + 1] - field4141[var3][var13][var12 - 1];
               var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
               var17 = (var14 << 8) / var16;
               var18 = 65536 / var16;
               var19 = (var15 << 8) / var16;
               var20 = (var19 * -50 + var18 * -10 + var17 * -50) / var11 + 96;
               var21 = (var48[var13][var12] >> 1) + (var48[var13][var12 + 1] >> 3) + (var48[var13 - 1][var12] >> 2) + (var48[var13 + 1][var12] >> 3) + (var48[var13][var12 - 1] >> 2);
               class514.field3986[var13][var12] = var20 - var21;
            }
         }

         for(var12 = 0; var12 < 104; ++var12) {
            class31.field573[var12] = 0;
            class393.field3081[var12] = 0;
            field4135[var12] = 0;
            class169.field1721[var12] = 0;
            class18.field196[var12] = 0;
         }

         for(var12 = -5; var12 < 109; ++var12) {
            for(var13 = 0; var13 < 104; ++var13) {
               var14 = var12 + 5;
               int var10002;
               if (var14 >= 0 && var14 < 104) {
                  long var54 = (long)Math.pow(2.0, 15.0) - 1L;
                  var17 = (int)var54;
                  var18 = field4134[var3][var14][var13] & var17;
                  if (var18 > 0) {
                     var20 = var18 - 1;
                     class179 var59 = (class179)class179.field1801.method1851((long)var20);
                     class179 var57;
                     if (var59 != null) {
                        var57 = var59;
                     } else {
                        byte[] var22 = class179.field1800.method1629(1, var20);
                        var59 = new class179();
                        if (null != var22) {
                           var59.method1105(new class184(var22), var20);
                        }

                        var59.method1104();
                        class179.field1801.method1850(var59, (long)var20);
                        var57 = var59;
                     }

                     var10000 = class31.field573;
                     var10000[var13] += var57.field1806;
                     var10000 = class393.field3081;
                     var10000[var13] += var57.field1804;
                     var10000 = field4135;
                     var10000[var13] += var57.field1803;
                     var10000 = class169.field1721;
                     var10000[var13] += var57.field1805;
                     var10002 = class18.field196[var13]++;
                  }
               }

               var15 = var12 - 5;
               if (var15 >= 0 && var15 < 104) {
                  long var55 = (long)Math.pow(2.0, 15.0) - 1L;
                  var18 = (int)var55;
                  var19 = field4134[var3][var15][var13] & var18;
                  if (var19 > 0) {
                     var21 = var19 - 1;
                     class179 var60 = (class179)class179.field1801.method1851((long)var21);
                     class179 var58;
                     if (null != var60) {
                        var58 = var60;
                     } else {
                        byte[] var23 = class179.field1800.method1629(1, var21);
                        var60 = new class179();
                        if (null != var23) {
                           var60.method1105(new class184(var23), var21);
                        }

                        var60.method1104();
                        class179.field1801.method1850(var60, (long)var21);
                        var58 = var60;
                     }

                     var10000 = class31.field573;
                     var10000[var13] -= var58.field1806;
                     var10000 = class393.field3081;
                     var10000[var13] -= var58.field1804;
                     var10000 = field4135;
                     var10000[var13] -= var58.field1803;
                     var10000 = class169.field1721;
                     var10000[var13] -= var58.field1805;
                     var10002 = class18.field196[var13]--;
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
                     var13 += class31.field573[var19];
                     var14 += class393.field3081[var19];
                     var15 += field4135[var19];
                     var16 += class169.field1721[var19];
                     var17 += class18.field196[var19];
                  }

                  var20 = var18 - 5;
                  if (var20 >= 0 && var20 < 104) {
                     var13 -= class31.field573[var20];
                     var14 -= class393.field3081[var20];
                     var15 -= field4135[var20];
                     var16 -= class169.field1721[var20];
                     var17 -= class18.field196[var20];
                  }

                  if (var18 >= 1 && var18 < 103 && (!Client.field580 || (field4143[0][var12][var18] & 2) != 0 || (field4143[var3][var12][var18] & 16) == 0)) {
                     if (var3 < field4133) {
                        field4133 = var3;
                     }

                     long var61 = (long)Math.pow(2.0, 15.0) - 1L;
                     int var62 = (int)var61;
                     int var24 = field4134[var3][var12][var18] & var62;
                     int var25 = class226.field2088[var3][var12][var18] & var62;
                     if (var24 > 0 || var25 > 0) {
                        int var26 = field4141[var3][var12][var18];
                        int var27 = field4141[var3][var12 + 1][var18];
                        int var28 = field4141[var3][var12 + 1][var18 + 1];
                        int var29 = field4141[var3][var12][var18 + 1];
                        int var30 = class514.field3986[var12][var18];
                        int var31 = class514.field3986[var12 + 1][var18];
                        int var32 = class514.field3986[var12 + 1][var18 + 1];
                        int var33 = class514.field3986[var12][var18 + 1];
                        int var34 = -1;
                        int var35 = -1;
                        int var36;
                        int var37;
                        int var38;
                        if (var24 > 0) {
                           var36 = var13 * 256 / var16;
                           var37 = var14 / var17;
                           var38 = var15 / var17;
                           var34 = method2500(var36, var37, var38);
                           var36 = var36 + field4140 & 255;
                           var38 += field4145;
                           if (var38 < 0) {
                              var38 = 0;
                           } else if (var38 > 255) {
                              var38 = 255;
                           }

                           var35 = method2500(var36, var37, var38);
                        }

                        class451 var39;
                        if (var3 > 0) {
                           boolean var63 = true;
                           if (var24 == 0 && class85.field1269[var3][var12][var18] != 0) {
                              var63 = false;
                           }

                           if (var25 > 0) {
                              var38 = var25 - 1;
                              var39 = (class451)class451.field3502.method1851((long)var38);
                              class451 var64;
                              if (null != var39) {
                                 var64 = var39;
                              } else {
                                 byte[] var40 = class451.field3507.method1629(4, var38);
                                 var39 = new class451();
                                 if (var40 != null) {
                                    var39.method2223(new class184(var40), var38);
                                 }

                                 var39.method2222();
                                 class451.field3502.method1850(var39, (long)var38);
                                 var64 = var39;
                              }

                              if (!var64.field3498) {
                                 var63 = false;
                              }
                           }

                           if (var63 && var27 == var26 && var28 == var26 && var26 == var29) {
                              var10000 = class125.field1521[var3][var12];
                              var10000[var18] |= 2340;
                           }
                        }

                        var36 = 0;
                        if (var35 != -1) {
                           var36 = class399.field3106[method2498(var35, 96)];
                        }

                        if (var25 == 0) {
                           var0.method1065(var3, var12, var18, 0, 0, -1, var26, var27, var28, var29, method2498(var34, var30), method2498(var34, var31), method2498(var34, var32), method2498(var34, var33), 0, 0, 0, 0, var36, 0);
                        } else {
                           var37 = 1 + class85.field1269[var3][var12][var18];
                           byte var65 = class141.field1592[var3][var12][var18];
                           int var66 = var25 - 1;
                           class451 var41 = (class451)class451.field3502.method1851((long)var66);
                           if (null != var41) {
                              var39 = var41;
                           } else {
                              byte[] var42 = class451.field3507.method1629(4, var66);
                              var41 = new class451();
                              if (var42 != null) {
                                 var41.method2223(new class184(var42), var66);
                              }

                              var41.method2222();
                              class451.field3502.method1850(var41, (long)var66);
                              var39 = var41;
                           }

                           int var67 = var39.field3495;
                           int var43;
                           int var44;
                           int var45;
                           int var46;
                           if (var67 >= 0) {
                              var44 = class399.field3111.field2239.method943(var67);
                              var43 = -1;
                           } else if (var39.field3496 == 16711935) {
                              var43 = -2;
                              var67 = -1;
                              var44 = -2;
                           } else {
                              var43 = method2500(var39.field3500, var39.field3501, var39.field3506);
                              var45 = field4140 + var39.field3500 & 255;
                              var46 = var39.field3506 + field4145;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = method2500(var45, var39.field3501, var46);
                           }

                           var45 = 0;
                           if (var44 != -2) {
                              var45 = class399.field3106[method2497(var44, 96)];
                           }

                           if (var39.field3499 != -1) {
                              var46 = field4140 + var39.field3504 & 255;
                              int var47 = field4145 + var39.field3505;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = 255;
                              }

                              var44 = method2500(var46, var39.field3503, var47);
                              var45 = class399.field3106[method2497(var44, 96)];
                           }

                           var0.method1065(var3, var12, var18, var37, var65, var67, var26, var27, var28, var29, method2498(var34, var30), method2498(var34, var31), method2498(var34, var32), method2498(var34, var33), method2497(var43, var30), method2497(var43, var31), method2497(var43, var32), method2497(var43, var33), var36, var45);
                        }
                     }
                  }
               }
            }
         }

         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var0.method1080(var3, var13, var12, method2503(var3, var13, var12));
            }
         }

         field4134[var3] = (short[][])null;
         class226.field2088[var3] = (short[][])null;
         class85.field1269[var3] = (byte[][])null;
         class141.field1592[var3] = (byte[][])null;
         class423.field3209[var3] = (byte[][])null;
      }

      var0.method1045(-50, -10, -50);

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            if ((field4143[1][var3][var4] & 2) == 2) {
               var0.method1028(var3, var4);
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
                  if ((class125.field1521[var51][var53][var52] & var3) != 0) {
                     var10 = var52;
                     var11 = var52;
                     var12 = var51;

                     for(var13 = var51; var10 > 0 && (class125.field1521[var51][var53][var10 - 1] & var3) != 0; --var10) {
                     }

                     while(var11 < 104 && (class125.field1521[var51][var53][var11 + 1] & var3) != 0) {
                        ++var11;
                     }

                     label367:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class125.field1521[var12 - 1][var53][var14] & var3) == 0) {
                              break label367;
                           }
                        }

                        --var12;
                     }

                     label356:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class125.field1521[var13 + 1][var53][var14] & var3) == 0) {
                              break label356;
                           }
                        }

                        ++var13;
                     }

                     var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
                     if (var14 >= 8) {
                        var56 = 240;
                        var16 = field4141[var13][var53][var10] - var56;
                        var17 = field4141[var12][var53][var10];
                        class175.method1029(var6, 1, var53 * 128, var53 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              var10000 = class125.field1521[var18][var53];
                              var10000[var19] &= ~var3;
                           }
                        }
                     }
                  }

                  if ((class125.field1521[var51][var53][var52] & var4) != 0) {
                     var10 = var53;
                     var11 = var53;
                     var12 = var51;

                     for(var13 = var51; var10 > 0 && (class125.field1521[var51][var10 - 1][var52] & var4) != 0; --var10) {
                     }

                     while(var11 < 104 && (class125.field1521[var51][var11 + 1][var52] & var4) != 0) {
                        ++var11;
                     }

                     label420:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class125.field1521[var12 - 1][var14][var52] & var4) == 0) {
                              break label420;
                           }
                        }

                        --var12;
                     }

                     label409:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class125.field1521[var13 + 1][var14][var52] & var4) == 0) {
                              break label409;
                           }
                        }

                        ++var13;
                     }

                     var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                     if (var14 >= 8) {
                        var56 = 240;
                        var16 = field4141[var13][var10][var52] - var56;
                        var17 = field4141[var12][var10][var52];
                        class175.method1029(var6, 2, var10 * 128, 128 + var11 * 128, var52 * 128, var52 * 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              var10000 = class125.field1521[var18][var19];
                              var10000[var52] &= ~var4;
                           }
                        }
                     }
                  }

                  if ((class125.field1521[var51][var53][var52] & var5) != 0) {
                     var10 = var53;
                     var11 = var53;
                     var12 = var52;

                     for(var13 = var52; var12 > 0 && (class125.field1521[var51][var53][var12 - 1] & var5) != 0; --var12) {
                     }

                     while(var13 < 104 && (class125.field1521[var51][var53][var13 + 1] & var5) != 0) {
                        ++var13;
                     }

                     label473:
                     while(var10 > 0) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if ((class125.field1521[var51][var10 - 1][var14] & var5) == 0) {
                              break label473;
                           }
                        }

                        --var10;
                     }

                     label462:
                     while(var11 < 104) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if ((class125.field1521[var51][var11 + 1][var14] & var5) == 0) {
                              break label462;
                           }
                        }

                        ++var11;
                     }

                     if ((var13 - var12 + 1) * (var11 - var10 + 1) >= 4) {
                        var14 = field4141[var51][var10][var12];
                        class175.method1029(var6, 4, var10 * 128, var11 * 128 + 128, var12 * 128, var13 * 128 + 128, var14, var14);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var16 = var12; var16 <= var13; ++var16) {
                              var10000 = class125.field1521[var51][var15];
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

   static int method2503(int var0, int var1, int var2) {
      if ((field4143[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && (field4143[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }

   static final int method2502(int var0, int var1, int var2) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = method2505(var4, var6);
      int var9 = method2505(var4 + 1, var6);
      int var10 = method2505(var4, var6 + 1);
      int var11 = method2505(var4 + 1, var6 + 1);
      int var12 = method2493(var8, var9, var5, var2);
      int var13 = method2493(var10, var11, var5, var2);
      return method2493(var12, var13, var7, var2);
   }

   static final int method2493(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - class399.field3107[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
   }

   static final int method2505(int var0, int var1) {
      int var3 = method2506(var0 - 1, var1 - 1) + method2506(var0 + 1, var1 - 1) + method2506(var0 - 1, var1 + 1) + method2506(var0 + 1, var1 + 1);
      int var4 = method2506(var0 - 1, var1) + method2506(var0 + 1, var1) + method2506(var0, var1 - 1) + method2506(var0, var1 + 1);
      int var5 = method2506(var0, var1);
      return var3 / 16 + var4 / 8 + var5 / 4;
   }

   static final int method2506(int var0, int var1) {
      int var3 = var1 * 57 + var0;
      var3 ^= var3 << 13;
      int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   static final int method2498(int var0, int var1) {
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

   static final int method2497(int var0, int var1) {
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

   static final int method2500(int var0, int var1, int var2) {
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
