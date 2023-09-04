public class class377 {
   public static class242[] field3054;

   class377() throws Throwable {
   }

   public static int method1881(int var0, int var1, int var2, class326 var3, class278 var4, boolean var5, int[] var6, int[] var7, class242 var8) {
      var8.method1443();
      int var10 = var8.method1436();
      int var11 = var8.method1441();
      int[][] var12 = var8.method1437();
      int[][] var13 = var8.method1442();
      int[] var14 = var8.method1438();
      int[] var15 = var8.method1439();
      boolean var16;
      int var18;
      int var19;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      int var29;
      int var30;
      int var31;
      int var32;
      int var34;
      if (var2 == 1) {
         var18 = var8.method1436();
         var19 = var8.method1441();
         int[][] var20 = var8.method1437();
         int[][] var21 = var8.method1442();
         int[] var22 = var8.method1438();
         int[] var23 = var8.method1439();
         var24 = var8.method1440();
         var25 = var0;
         var26 = var1;
         var27 = var18 >> 1;
         var28 = var19 >> 1;
         var29 = var0 - var27;
         var30 = var1 - var28;
         var21[var27][var28] = 99;
         var20[var27][var28] = 0;
         var31 = 0;
         var32 = 0;
         var22[var31] = var0;
         var23[var31++] = var1;
         int[][] var33 = var4.field2387;

         boolean var17;
         while(true) {
            if (var31 == var32) {
               var8.method1433(var25, var26);
               var17 = false;
               break;
            }

            var25 = var22[var32];
            var26 = var23[var32];
            var32 = var32 + 1 & var24;
            var27 = var25 - var29;
            var28 = var26 - var30;
            var34 = var25 - var4.field2384;
            int var35 = var26 - var4.field2385;
            if (var3.method1714(1, var25, var26, var4)) {
               var8.method1433(var25, var26);
               var17 = true;
               break;
            }

            int var36 = 1 + var20[var27][var28];
            if (var27 > 0 && var21[var27 - 1][var28] == 0 && (var33[var34 - 1][var35] & 19136776) == 0) {
               var22[var31] = var25 - 1;
               var23[var31] = var26;
               var31 = var31 + 1 & var24;
               var21[var27 - 1][var28] = 2;
               var20[var27 - 1][var28] = var36;
            }

            if (var27 < var18 - 1 && var21[var27 + 1][var28] == 0 && (var33[var34 + 1][var35] & 19136896) == 0) {
               var22[var31] = var25 + 1;
               var23[var31] = var26;
               var31 = var31 + 1 & var24;
               var21[var27 + 1][var28] = 8;
               var20[var27 + 1][var28] = var36;
            }

            if (var28 > 0 && var21[var27][var28 - 1] == 0 && (var33[var34][var35 - 1] & 19136770) == 0) {
               var22[var31] = var25;
               var23[var31] = var26 - 1;
               var31 = var31 + 1 & var24;
               var21[var27][var28 - 1] = 1;
               var20[var27][var28 - 1] = var36;
            }

            if (var28 < var19 - 1 && var21[var27][var28 + 1] == 0 && (var33[var34][var35 + 1] & 19136800) == 0) {
               var22[var31] = var25;
               var23[var31] = var26 + 1;
               var31 = var31 + 1 & var24;
               var21[var27][var28 + 1] = 4;
               var20[var27][var28 + 1] = var36;
            }

            if (var27 > 0 && var28 > 0 && var21[var27 - 1][var28 - 1] == 0 && (var33[var34 - 1][var35 - 1] & 19136782) == 0 && (var33[var34 - 1][var35] & 19136776) == 0 && (var33[var34][var35 - 1] & 19136770) == 0) {
               var22[var31] = var25 - 1;
               var23[var31] = var26 - 1;
               var31 = var31 + 1 & var24;
               var21[var27 - 1][var28 - 1] = 3;
               var20[var27 - 1][var28 - 1] = var36;
            }

            if (var27 < var18 - 1 && var28 > 0 && var21[var27 + 1][var28 - 1] == 0 && (var33[var34 + 1][var35 - 1] & 19136899) == 0 && (var33[var34 + 1][var35] & 19136896) == 0 && (var33[var34][var35 - 1] & 19136770) == 0) {
               var22[var31] = var25 + 1;
               var23[var31] = var26 - 1;
               var31 = var31 + 1 & var24;
               var21[var27 + 1][var28 - 1] = 9;
               var20[var27 + 1][var28 - 1] = var36;
            }

            if (var27 > 0 && var28 < var19 - 1 && var21[var27 - 1][var28 + 1] == 0 && (var33[var34 - 1][var35 + 1] & 19136824) == 0 && (var33[var34 - 1][var35] & 19136776) == 0 && (var33[var34][var35 + 1] & 19136800) == 0) {
               var22[var31] = var25 - 1;
               var23[var31] = var26 + 1;
               var31 = var31 + 1 & var24;
               var21[var27 - 1][var28 + 1] = 6;
               var20[var27 - 1][var28 + 1] = var36;
            }

            if (var27 < var18 - 1 && var28 < var19 - 1 && var21[var27 + 1][var28 + 1] == 0 && (var33[var34 + 1][var35 + 1] & 19136992) == 0 && (var33[var34 + 1][var35] & 19136896) == 0 && (var33[var34][var35 + 1] & 19136800) == 0) {
               var22[var31] = var25 + 1;
               var23[var31] = var26 + 1;
               var31 = var31 + 1 & var24;
               var21[var27 + 1][var28 + 1] = 12;
               var20[var27 + 1][var28 + 1] = var36;
            }
         }

         var16 = var17;
      } else if (var2 == 2) {
         var16 = method1882(var0, var1, var3, var4, var8);
      } else {
         var16 = method1883(var0, var1, var2, var3, var4, var8);
      }

      int var37 = var0 - (var10 >> 1);
      var18 = var1 - (var11 >> 1);
      var19 = var8.method1434();
      int var38 = var8.method1435();
      int var39;
      int var41;
      int var42;
      if (!var16) {
         if (!var5) {
            return -1;
         }

         var39 = Integer.MAX_VALUE;
         var41 = Integer.MAX_VALUE;
         var42 = 10;
         var24 = var3.field2631;
         var25 = var3.field2630;
         var26 = var3.field2632;
         var27 = var3.field2633;

         for(var28 = var24 - var42; var28 <= var42 + var24; ++var28) {
            for(var29 = var25 - var42; var29 <= var25 + var42; ++var29) {
               var30 = var28 - var37;
               var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
                  var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var24 + var26 - 1) {
                     var32 = var28 - (var26 + var24 - 1);
                  }

                  int var43 = 0;
                  if (var29 < var25) {
                     var43 = var25 - var29;
                  } else if (var29 > var27 + var25 - 1) {
                     var43 = var29 - (var27 + var25 - 1);
                  }

                  var34 = var43 * var43 + var32 * var32;
                  if (var34 < var39 || var34 == var39 && var12[var30][var31] < var41) {
                     var39 = var34;
                     var41 = var12[var30][var31];
                     var19 = var28;
                     var38 = var29;
                  }
               }
            }
         }

         if (var39 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var19 && var1 == var38) {
         var6[0] = var19;
         var7[0] = var38;
         return 0;
      } else {
         byte var40 = 0;
         var14[var40] = var19;
         var39 = var40 + 1;
         var15[var40] = var38;

         for(var41 = var42 = var13[var19 - var37][var38 - var18]; var19 != var0 || var1 != var38; var41 = var13[var19 - var37][var38 - var18]) {
            if (var41 != var42) {
               var42 = var41;
               var14[var39] = var19;
               var15[var39++] = var38;
            }

            if ((var41 & 2) != 0) {
               ++var19;
            } else if ((var41 & 8) != 0) {
               --var19;
            }

            if ((var41 & 1) != 0) {
               ++var38;
            } else if ((var41 & 4) != 0) {
               --var38;
            }
         }

         var24 = 0;

         while(var39-- > 0) {
            var6[var24] = var14[var39];
            var7[var24++] = var15[var39];
            if (var24 >= var6.length) {
               break;
            }
         }

         return var24;
      }
   }

   static final boolean method1882(int var0, int var1, class326 var2, class278 var3, class242 var4) {
      int var6 = var4.method1436();
      int var7 = var4.method1441();
      int[][] var8 = var4.method1437();
      int[][] var9 = var4.method1442();
      int[] var10 = var4.method1438();
      int[] var11 = var4.method1439();
      int var12 = var4.method1440();
      int var13 = var0;
      int var14 = var1;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var0 - var15;
      int var18 = var1 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var0;
      var11[var19++] = var1;
      int[][] var21 = var3.field2387;

      while(var20 != var19) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = var20 + 1 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - var3.field2384;
         int var23 = var14 - var3.field2385;
         if (var2.method1714(2, var13, var14, var3)) {
            var4.method1433(var13, var14);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 19136782) == 0 && (var21[var22 - 1][var23 + 1] & 19136824) == 0) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = var19 + 1 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 19136899) == 0 && (var21[var22 + 2][var23 + 1] & 19136992) == 0) {
            var10[var19] = var13 + 1;
            var11[var19] = var14;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 19136782) == 0 && (var21[var22 + 1][var23 - 1] & 19136899) == 0) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 19136824) == 0 && (var21[var22 + 1][var23 + 2] & 19136992) == 0) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][var16 + 1] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 19136830) == 0 && (var21[var22 - 1][var23 - 1] & 19136782) == 0 && (var21[var22][var23 - 1] & 19136911) == 0) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 19136911) == 0 && (var21[var22 + 2][var23 - 1] & 19136899) == 0 && (var21[var22 + 2][var23] & 19136995) == 0) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 19136830) == 0 && (var21[var22 - 1][var23 + 2] & 19136824) == 0 && (var21[var22][var23 + 2] & 19137016) == 0) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 2] & 19137016) == 0 && (var21[var22 + 2][var23 + 2] & 19136992) == 0 && (var21[var22 + 2][var23 + 1] & 19136995) == 0) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16 + 1] = 12;
            var8[var15 + 1][var16 + 1] = var24;
         }
      }

      var4.method1433(var13, var14);
      return false;
   }

   static final boolean method1883(int var0, int var1, int var2, class326 var3, class278 var4, class242 var5) {
      int var7 = var5.method1436();
      int var8 = var5.method1441();
      int[][] var9 = var5.method1437();
      int[][] var10 = var5.method1442();
      int[] var11 = var5.method1438();
      int[] var12 = var5.method1439();
      int var13 = var5.method1440();
      int var14 = var0;
      int var15 = var1;
      int var16 = var7 >> 1;
      int var17 = var8 >> 1;
      int var18 = var0 - var16;
      int var19 = var1 - var17;
      var10[var16][var17] = 99;
      var9[var16][var17] = 0;
      int var20 = 0;
      int var21 = 0;
      var11[var20] = var0;
      var12[var20++] = var1;
      int[][] var22 = var4.field2387;

      while(true) {
         label264:
         while(true) {
            int var23;
            int var24;
            int var25;
            int var26;
            do {
               do {
                  do {
                     label241:
                     do {
                        if (var21 == var20) {
                           var5.method1433(var14, var15);
                           return false;
                        }

                        var14 = var11[var21];
                        var15 = var12[var21];
                        var21 = var21 + 1 & var13;
                        var16 = var14 - var18;
                        var17 = var15 - var19;
                        var23 = var14 - var4.field2384;
                        var24 = var15 - var4.field2385;
                        if (var3.method1714(var2, var14, var15, var4)) {
                           var5.method1433(var14, var15);
                           return true;
                        }

                        var25 = 1 + var9[var16][var17];
                        if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 19136782) == 0 && (var22[var23 - 1][var2 + var24 - 1] & 19136824) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var2 - 1) {
                                 var11[var20] = var14 - 1;
                                 var12[var20] = var15;
                                 var20 = var20 + 1 & var13;
                                 var10[var16 - 1][var17] = 2;
                                 var9[var16 - 1][var17] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var26 + var24] & 19136830) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var2 && var10[var16 + 1][var17] == 0 && (var22[var23 + var2][var24] & 19136899) == 0 && (var22[var23 + var2][var2 + var24 - 1] & 19136992) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var2 - 1) {
                                 var11[var20] = var14 + 1;
                                 var12[var20] = var15;
                                 var20 = var20 + 1 & var13;
                                 var10[var16 + 1][var17] = 8;
                                 var9[var16 + 1][var17] = var25;
                                 break;
                              }

                              if ((var22[var23 + var2][var26 + var24] & 19136995) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 19136782) == 0 && (var22[var23 + var2 - 1][var24 - 1] & 19136899) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var2 - 1) {
                                 var11[var20] = var14;
                                 var12[var20] = var15 - 1;
                                 var20 = var20 + 1 & var13;
                                 var10[var16][var17 - 1] = 1;
                                 var9[var16][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var23 + var26][var24 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 < var8 - var2 && var10[var16][var17 + 1] == 0 && (var22[var23][var24 + var2] & 19136824) == 0 && (var22[var23 + var2 - 1][var2 + var24] & 19136992) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var2 - 1) {
                                 var11[var20] = var14;
                                 var12[var20] = var15 + 1;
                                 var20 = var20 + 1 & var13;
                                 var10[var16][var17 + 1] = 4;
                                 var9[var16][var17 + 1] = var25;
                                 break;
                              }

                              if ((var22[var26 + var23][var2 + var24] & 19137016) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 19136782) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var2) {
                                 var11[var20] = var14 - 1;
                                 var12[var20] = var15 - 1;
                                 var20 = var20 + 1 & var13;
                                 var10[var16 - 1][var17 - 1] = 3;
                                 var9[var16 - 1][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var26 + (var24 - 1)] & 19136830) != 0 || (var22[var23 - 1 + var26][var24 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var2 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var23 + var2][var24 - 1] & 19136899) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var2) {
                                 var11[var20] = var14 + 1;
                                 var12[var20] = var15 - 1;
                                 var20 = var20 + 1 & var13;
                                 var10[var16 + 1][var17 - 1] = 9;
                                 var9[var16 + 1][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var23 + var2][var24 - 1 + var26] & 19136995) != 0 || (var22[var23 + var26][var24 - 1] & 19136911) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 < var8 - var2 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var24 + var2] & 19136824) == 0) {
                           for(var26 = 1; var26 < var2; ++var26) {
                              if ((var22[var23 - 1][var24 + var26] & 19136830) != 0 || (var22[var23 - 1 + var26][var2 + var24] & 19137016) != 0) {
                                 continue label241;
                              }
                           }

                           var11[var20] = var14 - 1;
                           var12[var20] = var15 + 1;
                           var20 = var20 + 1 & var13;
                           var10[var16 - 1][var17 + 1] = 6;
                           var9[var16 - 1][var17 + 1] = var25;
                        }
                     } while(var16 >= var7 - var2);
                  } while(var17 >= var8 - var2);
               } while(var10[var16 + 1][var17 + 1] != 0);
            } while((var22[var23 + var2][var2 + var24] & 19136992) != 0);

            for(var26 = 1; var26 < var2; ++var26) {
               if ((var22[var23 + var26][var24 + var2] & 19137016) != 0 || (var22[var2 + var23][var24 + var26] & 19136995) != 0) {
                  continue label264;
               }
            }

            var11[var20] = var14 + 1;
            var12[var20] = var15 + 1;
            var20 = var20 + 1 & var13;
            var10[var16 + 1][var17 + 1] = 12;
            var9[var16 + 1][var17 + 1] = var25;
         }
      }
   }
}
