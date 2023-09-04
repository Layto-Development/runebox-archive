public final class class507 {
   static class494 field3971 = new class494();

   class507() throws Throwable {
   }

   public static int method2455(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(field3971) {
         field3971.field3884 = var2;
         field3971.field3910 = var4;
         field3971.field3896 = var0;
         field3971.field3885 = 0;
         field3971.field3889 = var1;
         field3971.field3894 = 0;
         field3971.field3893 = 0;
         field3971.field3886 = 0;
         field3971.field3888 = 0;
         method2452(field3971);
         var1 -= field3971.field3889;
         field3971.field3884 = null;
         field3971.field3896 = null;
         return var1;
      }
   }

   static void method2451(class494 var0) {
      byte var2 = var0.field3892;
      int var3 = var0.field3879;
      int var4 = var0.field3900;
      int var5 = var0.field3898;
      int[] var6 = class289.field2454;
      int var7 = var0.field3897;
      byte[] var8 = var0.field3896;
      int var9 = var0.field3885;
      int var10 = var0.field3889;
      int var12 = var0.field3915 + 1;

      label61:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label61;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label61;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label61;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if (var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label61;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label61;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field3888;
      var0.field3888 += var10 - var10;
      if (var0.field3888 < var13) {
      }

      var0.field3892 = var2;
      var0.field3879 = var3;
      var0.field3900 = var4;
      var0.field3898 = var5;
      class289.field2454 = var6;
      var0.field3897 = var7;
      var0.field3896 = var8;
      var0.field3885 = var9;
      var0.field3889 = var10;
   }

   static void method2452(class494 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field3895 = -1562387581;
      if (class289.field2454 == null) {
         class289.field2454 = new int[var0.field3895 * 731544800];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method2457(var0);
            if (var1 == 23) {
               return;
            }

            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2457(var0);
            var1 = method2453(var0);
            if (var1 != 0) {
            }

            var0.field3911 = 0;
            var1 = method2457(var0);
            var0.field3911 = var0.field3911 << 8 | var1 & 255;
            var1 = method2457(var0);
            var0.field3911 = var0.field3911 << 8 | var1 & 255;
            var1 = method2457(var0);
            var0.field3911 = var0.field3911 << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = method2453(var0);
               if (var1 == 1) {
                  var0.field3904[var35] = true;
               } else {
                  var0.field3904[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.field3883[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.field3904[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = method2453(var0);
                     if (var1 == 1) {
                        var0.field3883[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method2454(var0);
            int var38 = var0.field3902 + 2;
            int var39 = method2450(3, var0);
            int var40 = method2450(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = method2453(var0);
                  if (var1 == 0) {
                     var0.field3909[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            int var29;
            for(var29 = 0; var29 < var39; var29 = (byte)(var29 + 1)) {
               var27[var29] = (byte)var29;
            }

            int var28;
            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0.field3909[var35];

               for(var28 = var27[var29]; var29 > 0; var29 = (byte)(var29 - 1)) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = (byte)var28;
               var0.field3908[var35] = (byte)var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var48 = method2450(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = method2453(var0);
                     if (var1 == 0) {
                        var0.field3890[var37][var35] = (byte)var48;
                        break;
                     }

                     var1 = method2453(var0);
                     if (var1 == 0) {
                        ++var48;
                     } else {
                        --var48;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0.field3890[var37][var35] > var3) {
                     var3 = var0.field3890[var37][var35];
                  }

                  if (var0.field3890[var37][var35] < var2) {
                     var2 = var0.field3890[var37][var35];
                  }
               }

               method2456(var0.field3903[var37], var0.field3912[var37], var0.field3913[var37], var0.field3890[var37], var2, var3, var38);
               var0.field3914[var37] = var2;
            }

            int var41 = var0.field3902 + 1;
            int var42 = -1;
            int var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.field3899[var35] = 0;
            }

            var29 = 4095;

            int var53;
            for(var53 = 15; var53 >= 0; --var53) {
               for(var28 = 15; var28 >= 0; --var28) {
                  var0.field3901[var29] = (byte)(var53 * 16 + var28);
                  --var29;
               }

               var0.field3891[var53] = var29 + 1;
            }

            int var45 = 0;
            byte var52;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var52 = var0.field3908[var42];
               var22 = var0.field3914[var52];
               var23 = var0.field3903[var52];
               var25 = var0.field3913[var52];
               var24 = var0.field3912[var52];
            }

            --var43;
            int var49 = var22;

            int var50;
            byte var51;
            for(var50 = method2450(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
               ++var49;
               var51 = method2453(var0);
            }

            int var44 = var25[var50 - var24[var49]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var44 != var41) {
                  if (var44 != 0 && var44 != 1) {
                     int var33 = var44 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.field3891[0];

                        for(var1 = var0.field3901[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field3901[var34] = var0.field3901[var34 - 1];
                           var0.field3901[var34 - 1] = var0.field3901[var34 - 2];
                           var0.field3901[var34 - 2] = var0.field3901[var34 - 3];
                           var0.field3901[var34 - 3] = var0.field3901[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field3901[var30 + var33] = var0.field3901[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field3901[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field3891[var31] + var32;

                        for(var1 = var0.field3901[var30]; var30 > var0.field3891[var31]; --var30) {
                           var0.field3901[var30] = var0.field3901[var30 - 1];
                        }

                        for(var10002 = var0.field3891[var31]++; var31 > 0; --var31) {
                           var10002 = var0.field3891[var31]--;
                           var0.field3901[var0.field3891[var31]] = var0.field3901[var0.field3891[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.field3891[0]--;
                        var0.field3901[var0.field3891[0]] = var1;
                        if (var0.field3891[0] == 0) {
                           var29 = 4095;

                           for(var53 = 15; var53 >= 0; --var53) {
                              for(var28 = 15; var28 >= 0; --var28) {
                                 var0.field3901[var29] = var0.field3901[var0.field3891[var53] + var28];
                                 --var29;
                              }

                              var0.field3891[var53] = var29 + 1;
                           }
                        }
                     }

                     var10002 = var0.field3899[var0.field3905[var1 & 255] & 255]++;
                     class289.field2454[var45] = var0.field3905[var1 & 255] & 255;
                     ++var45;
                     if (var43 == 0) {
                        ++var42;
                        var43 = 50;
                        var52 = var0.field3908[var42];
                        var22 = var0.field3914[var52];
                        var23 = var0.field3903[var52];
                        var25 = var0.field3913[var52];
                        var24 = var0.field3912[var52];
                     }

                     --var43;
                     var49 = var22;

                     for(var50 = method2450(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                        ++var49;
                        var51 = method2453(var0);
                     }

                     var44 = var25[var50 - var24[var49]];
                  } else {
                     int var46 = -1;
                     int var47 = 1;

                     do {
                        if (var44 == 0) {
                           var46 += var47;
                        } else if (var44 == 1) {
                           var46 += var47 * 2;
                        }

                        var47 *= 2;
                        if (var43 == 0) {
                           ++var42;
                           var43 = 50;
                           var52 = var0.field3908[var42];
                           var22 = var0.field3914[var52];
                           var23 = var0.field3903[var52];
                           var25 = var0.field3913[var52];
                           var24 = var0.field3912[var52];
                        }

                        --var43;
                        var49 = var22;

                        for(var50 = method2450(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                           ++var49;
                           var51 = method2453(var0);
                        }

                        var44 = var25[var50 - var24[var49]];
                     } while(var44 == 0 || var44 == 1);

                     ++var46;
                     var1 = var0.field3905[var0.field3901[var0.field3891[0]] & 255];
                     var10000 = var0.field3899;

                     for(var10000[var1 & 255] += var46; var46 > 0; --var46) {
                        class289.field2454[var45] = var1 & 255;
                        ++var45;
                     }
                  }
               }

               var0.field3879 = 0;
               var0.field3892 = 0;
               var0.field3907[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field3907[var35] = var0.field3899[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.field3907;
                  var10000[var35] += var0.field3907[var35 - 1];
               }

               for(var35 = 0; var35 < var45; ++var35) {
                  var1 = (byte)(class289.field2454[var35] & 255);
                  var10000 = class289.field2454;
                  int var10001 = var0.field3907[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.field3907[var1 & 255]++;
               }

               var0.field3897 = class289.field2454[var0.field3911] >> 8;
               var0.field3900 = 0;
               var0.field3897 = class289.field2454[var0.field3897];
               var0.field3898 = (byte)(var0.field3897 & 255);
               var0.field3897 >>= 8;
               ++var0.field3900;
               var0.field3915 = var45;
               method2451(var0);
               if (var0.field3900 == var0.field3915 + 1 && var0.field3879 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   static byte method2457(class494 var0) {
      return (byte)method2450(8, var0);
   }

   static byte method2453(class494 var0) {
      return (byte)method2450(1, var0);
   }

   static int method2450(int var0, class494 var1) {
      while(var1.field3894 < var0) {
         var1.field3893 = var1.field3893 << 8 | var1.field3884[var1.field3910] & 255;
         var1.field3894 += 8;
         ++var1.field3910;
         ++var1.field3886;
         if (var1.field3886 == 0) {
         }
      }

      int var2 = var1.field3893 >> var1.field3894 - var0 & (1 << var0) - 1;
      var1.field3894 -= var0;
      return var2;
   }

   static void method2454(class494 var0) {
      var0.field3902 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field3883[var1]) {
            var0.field3905[var0.field3902] = (byte)var1;
            ++var0.field3902;
         }
      }

   }

   static void method2456(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }
}
