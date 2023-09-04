public class class470 {
   static byte[] field3735 = new byte[2048];
   static class366 field3725 = new class366(new byte[5000]);
   static class366[] field3736 = new class366[2048];
   static class8 field3738;
   static class82[] field3726 = new class82[2048];
   static int field3724;
   static int field3728 = 0;
   static int field3730 = 0;
   static int field3734 = 0;
   static int[] field3727 = new int[2048];
   static int[] field3729 = new int[2048];
   static int[] field3731 = new int[2048];
   static int[] field3732 = new int[2048];
   static int[] field3733 = new int[2048];
   static int[] field3737 = new int[2048];

   class470() throws Throwable {
   }

   static final void method2216(class435 var0) {
      var0.method2038();
      int var2 = Client.field1244;
      class443 var3 = class266.field1874 = Client.field1289[var2] = new class443();
      var3.field3493 = var2;
      int var4 = var0.method2036(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field3448[0] = var6 - class36.field314;
      var3.field3403 = (var3.field3448[0] << 7) + (var3.method2055() << 6);
      var3.field3445[0] = var7 - class525.field4175;
      var3.field3374 = (var3.field3445[0] << 7) + (var3.method2055() << 6);
      class156.field980 = var3.field3514 = var5;
      if (field3736[var2] != null) {
         var3.method2049(field3736[var2]);
      }

      field3728 = 0;
      field3729[++field3728 - 1] = var2;
      field3735[var2] = 0;
      field3730 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.method2036(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            field3731[var8] = var12 + (var10 << 28) + (var11 << 14);
            field3732[var8] = 0;
            field3733[var8] = -1;
            field3737[++field3730 - 1] = var8;
            field3735[var8] = 0;
         }
      }

      var0.method2039();
   }

   static final void method2217(class435 var0, int var1) {
      int var3 = var0.field2652;
      field3734 = 0;
      int var4 = 0;
      var0.method2038();

      byte[] var10000;
      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 < field3728; ++var5) {
         var6 = field3729[var5];
         if ((field3735[var6] & 1) == 0) {
            if (var4 > 0) {
               --var4;
               var10000 = field3735;
               var10000[var6] = (byte)(var10000[var6] | 2);
            } else {
               var7 = var0.method2036(1);
               if (var7 == 0) {
                  var4 = class406.method1833(var0);
                  var10000 = field3735;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  method2219(var0, var6);
               }
            }
         }
      }

      var0.method2039();
      if (var4 != 0) {
         throw new RuntimeException();
      } else {
         var0.method2038();

         for(var5 = 0; var5 < field3728; ++var5) {
            var6 = field3729[var5];
            if ((field3735[var6] & 1) != 0) {
               if (var4 > 0) {
                  --var4;
                  var10000 = field3735;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  var7 = var0.method2036(1);
                  if (var7 == 0) {
                     var4 = class406.method1833(var0);
                     var10000 = field3735;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     method2219(var0, var6);
                  }
               }
            }
         }

         var0.method2039();
         if (var4 != 0) {
            throw new RuntimeException();
         } else {
            var0.method2038();

            for(var5 = 0; var5 < field3730; ++var5) {
               var6 = field3737[var5];
               if ((field3735[var6] & 1) != 0) {
                  if (var4 > 0) {
                     --var4;
                     var10000 = field3735;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     var7 = var0.method2036(1);
                     if (var7 == 0) {
                        var4 = class406.method1833(var0);
                        var10000 = field3735;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else if (method2218(var0, var6)) {
                        var10000 = field3735;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     }
                  }
               }
            }

            var0.method2039();
            if (var4 != 0) {
               throw new RuntimeException();
            } else {
               var0.method2038();

               for(var5 = 0; var5 < field3730; ++var5) {
                  var6 = field3737[var5];
                  if ((field3735[var6] & 1) == 0) {
                     if (var4 > 0) {
                        --var4;
                        var10000 = field3735;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else {
                        var7 = var0.method2036(1);
                        if (var7 == 0) {
                           var4 = class406.method1833(var0);
                           var10000 = field3735;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        } else if (method2218(var0, var6)) {
                           var10000 = field3735;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        }
                     }
                  }
               }

               var0.method2039();
               if (var4 != 0) {
                  throw new RuntimeException();
               } else {
                  field3728 = 0;
                  field3730 = 0;

                  for(var5 = 1; var5 < 2048; ++var5) {
                     var10000 = field3735;
                     var10000[var5] = (byte)(var10000[var5] >> 1);
                     class443 var8 = Client.field1289[var5];
                     if (var8 != null) {
                        field3729[++field3728 - 1] = var5;
                     } else {
                        field3737[++field3730 - 1] = var5;
                     }
                  }

                  method2215(var0);
                  if (var1 != var0.field2652 - var3) {
                     throw new RuntimeException(var0.field2652 - var3 + " " + var1);
                  }
               }
            }
         }
      }
   }

   static void method2219(class435 var0, int var1) {
      boolean var3 = var0.method2036(1) == 1;
      if (var3) {
         field3727[++field3734 - 1] = var1;
      }

      int var4 = var0.method2036(2);
      class443 var5 = Client.field1289[var1];
      if (var4 == 0) {
         if (var3) {
            var5.field3519 = false;
         } else if (Client.field1244 == var1) {
            throw new RuntimeException();
         } else {
            field3731[var1] = (class36.field314 + var5.field3448[0] >> 13 << 14) + (var5.field3514 << 28) + (class525.field4175 + var5.field3445[0] >> 13);
            if (-1 != var5.field3410) {
               field3732[var1] = var5.field3410;
            } else {
               field3732[var1] = var5.field3414;
            }

            field3733[var1] = var5.field3408;
            Client.field1289[var1] = null;
            if (var0.method2036(1) != 0) {
               method2218(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.method2036(3);
            var7 = var5.field3448[0];
            var8 = var5.field3445[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (var1 != Client.field1244 || var5.field3403 >= 1536 && var5.field3374 >= 1536 && var5.field3403 < 11776 && var5.field3374 < 11776) {
               if (var3) {
                  var5.field3519 = true;
                  var5.field3515 = var7;
                  var5.field3521 = var8;
               } else {
                  var5.field3519 = false;
                  var5.method2061(var7, var8, field3726[var1]);
               }
            } else {
               var5.method2058(var7, var8);
               var5.field3519 = false;
            }

         } else if (var4 == 2) {
            var6 = var0.method2036(4);
            var7 = var5.field3448[0];
            var8 = var5.field3445[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if (var6 == 12) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if (Client.field1244 != var1 || var5.field3403 >= 1536 && var5.field3374 >= 1536 && var5.field3403 < 11776 && var5.field3374 < 11776) {
               if (var3) {
                  var5.field3519 = true;
                  var5.field3515 = var7;
                  var5.field3521 = var8;
               } else {
                  var5.field3519 = false;
                  var5.method2061(var7, var8, field3726[var1]);
               }
            } else {
               var5.method2058(var7, var8);
               var5.field3519 = false;
            }

         } else {
            var6 = var0.method2036(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = var0.method2036(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var5.field3448[0] + var9;
               var12 = var5.field3445[0] + var10;
               if (var1 != Client.field1244 || var5.field3403 >= 1536 && var5.field3374 >= 1536 && var5.field3403 < 11776 && var5.field3374 < 11776) {
                  if (var3) {
                     var5.field3519 = true;
                     var5.field3515 = var11;
                     var5.field3521 = var12;
                  } else {
                     var5.field3519 = false;
                     var5.method2061(var11, var12, field3726[var1]);
                  }
               } else {
                  var5.method2058(var11, var12);
                  var5.field3519 = false;
               }

               var5.field3514 = (byte)(var8 + var5.field3514 & 3);
               if (Client.field1244 == var1) {
                  class156.field980 = var5.field3514;
               }

            } else {
               var7 = var0.method2036(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var9 + class36.field314 + var5.field3448[0] & 16383) - class36.field314;
               var12 = (var10 + var5.field3445[0] + class525.field4175 & 16383) - class525.field4175;
               if (Client.field1244 != var1 || var5.field3403 >= 1536 && var5.field3374 >= 1536 && var5.field3403 < 11776 && var5.field3374 < 11776) {
                  if (var3) {
                     var5.field3519 = true;
                     var5.field3515 = var11;
                     var5.field3521 = var12;
                  } else {
                     var5.field3519 = false;
                     var5.method2061(var11, var12, field3726[var1]);
                  }
               } else {
                  var5.method2058(var11, var12);
                  var5.field3519 = false;
               }

               var5.field3514 = (byte)(var5.field3514 + var8 & 3);
               if (Client.field1244 == var1) {
                  class156.field980 = var5.field3514;
               }

            }
         }
      }
   }

   static boolean method2218(class435 var0, int var1) {
      int var3 = var0.method2036(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.method2036(1) != 0) {
            method2218(var0, var1);
         }

         var4 = var0.method2036(13);
         var5 = var0.method2036(13);
         boolean var12 = var0.method2036(1) == 1;
         if (var12) {
            field3727[++field3734 - 1] = var1;
         }

         if (Client.field1289[var1] != null) {
            throw new RuntimeException();
         } else {
            class443 var13 = Client.field1289[var1] = new class443();
            var13.field3493 = var1;
            if (null != field3736[var1]) {
               var13.method2049(field3736[var1]);
            }

            var13.field3414 = field3732[var1];
            var13.field3408 = field3733[var1];
            var8 = field3731[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.field3446[0] = field3726[var1];
            var13.field3514 = (byte)var9;
            var13.method2058((var10 << 13) + var4 - class36.field314, var5 + (var11 << 13) - class525.field4175);
            var13.field3519 = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.method2036(2);
         var5 = field3731[var1];
         field3731[var1] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
         return false;
      } else {
         int var6;
         int var7;
         if (var3 == 2) {
            var4 = var0.method2036(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = field3731[var1];
            var8 = (var7 >> 28) + var5 & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            field3731[var1] = (var8 << 28) + (var9 << 14) + var10;
            return false;
         } else {
            var4 = var0.method2036(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = field3731[var1];
            var9 = var5 + (var8 >> 28) & 3;
            var10 = (var8 >> 14) + var6 & 255;
            var11 = var8 + var7 & 255;
            field3731[var1] = var11 + (var9 << 28) + (var10 << 14);
            return false;
         }
      }
   }

   static final void method2215(class435 var0) {
      for(int var2 = 0; var2 < field3734; ++var2) {
         int var3 = field3727[var2];
         class443 var4 = Client.field1289[var3];
         int var5 = var0.method1654();
         if (0 != (var5 & 1)) {
            var5 += var0.method1654() << 8;
         }

         if ((var5 & '\u8000') != 0) {
            var5 += var0.method1654() << 16;
         }

         method2214(var0, var3, var4, var5);
      }

   }

   static final void method2214(class435 var0, int var1, class443 var2, int var3) {
      byte var5 = class82.field556.field559;
      int var6;
      if ((var3 & 8) != 0) {
         var6 = var0.method1654();
         byte[] var7 = new byte[var6];
         class366 var8 = new class366(var7);
         var0.method1708(var7, 0, var6);
         field3736[var1] = var8;
         var2.method2049(var8);
      }

      int var9;
      int var10;
      int var17;
      int var19;
      if ((var3 & 65536) != 0) {
         var6 = var0.method1654();

         for(var17 = 0; var17 < var6; ++var17) {
            var19 = var0.method1675();
            var9 = var0.method1683();
            var10 = var0.method1658();
            var2.method2020(var19, var9, var10 >> 16, var10 & '\uffff');
         }
      }

      if (0 != (var3 & 64)) {
         var2.field3410 = var0.method1683();
         if (0 == var2.field3421) {
            var2.field3414 = var2.field3410;
            var2.method2026();
         }
      }

      if (0 != (var3 & 16)) {
         var2.field3408 = var0.method1683();
         var2.field3408 += var0.method1675() << 16;
         var6 = 16777215;
         if (var2.field3408 == var6) {
            var2.field3408 = -1;
         }
      }

      int var11;
      int var12;
      if (0 != (var3 & 4096)) {
         var6 = var0.method1683();
         var17 = var6 >> 8;
         var19 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
         class132 var22 = (class132)class1.method2(class132.method484(), var0.method1675());
         boolean var25 = var0.method1654() == 1;
         var11 = var0.method1714();
         var12 = var0.field2652;
         if (null != var2.field3510 && null != var2.field3494) {
            boolean var13 = false;
            if (var22.field819 && class290.field1979.method546(var2.field3510)) {
               var13 = true;
            }

            if (!var13 && 0 == Client.field1241 && !var2.field3513) {
               field3725.field2652 = 0;
               var0.method1708(field3725.field2650, 0, var11);
               field3725.field2652 = 0;
               String var14 = class419.method1928(class447.method2080(class453.method2111(field3725)));
               var2.field3444 = var14.trim();
               var2.field3398 = var6 >> 8;
               var2.field3399 = var6 & 255;
               var2.field3397 = 150;
               byte[] var15 = null;
               int var16;
               if (var19 > 0 && var19 <= 8) {
                  var15 = new byte[var19];

                  for(var16 = 0; var16 < var19; ++var16) {
                     var15[var16] = var0.method1678();
                  }
               }

               var2.field3440 = class49.method216(var15);
               var2.field3395 = var25;
               var2.field3396 = class266.field1874 != var2 && var22.field819 && !Client.field1144.isEmpty() && var14.toLowerCase().indexOf(Client.field1144) == -1;
               if (var22.field835) {
                  var16 = var25 ? 91 : 1;
               } else {
                  var16 = var25 ? 90 : 2;
               }

               if (var22.field834 != -1) {
                  class431.method2007(var16, class402.method1827(var22.field834) + var2.field3510.method1598(), var14);
               } else {
                  class431.method2007(var16, var2.field3510.method1598(), var14);
               }
            }
         }

         var0.field2652 = var19 + var11 + var12;
      }

      int var29;
      if ((var3 & 32) != 0) {
         var6 = var0.method1682();
         class132 var20 = (class132)class1.method2(class132.method484(), var0.method1714());
         boolean var21 = var0.method1714() == 1;
         var9 = var0.method1654();
         var10 = var0.field2652;
         if (var2.field3510 != null && var2.field3494 != null) {
            boolean var26 = false;
            if (var20.field819 && class290.field1979.method546(var2.field3510)) {
               var26 = true;
            }

            if (!var26 && 0 == Client.field1241 && !var2.field3513) {
               field3725.field2652 = 0;
               var0.method1708(field3725.field2650, 0, var9);
               field3725.field2652 = 0;
               String var28 = class419.method1928(class447.method2080(class453.method2111(field3725)));
               var2.field3444 = var28.trim();
               var2.field3398 = var6 >> 8;
               var2.field3399 = var6 & 255;
               var2.field3397 = 150;
               var2.field3440 = null;
               var2.field3395 = var21;
               var2.field3396 = class266.field1874 != var2 && var20.field819 && !Client.field1144.isEmpty() && var28.toLowerCase().indexOf(Client.field1144) == -1;
               if (var20.field835) {
                  var29 = var21 ? 91 : 1;
               } else {
                  var29 = var21 ? 90 : 2;
               }

               if (-1 != var20.field834) {
                  class431.method2007(var29, class402.method1827(var20.field834) + var2.field3510.method1598(), var28);
               } else {
                  class431.method2007(var29, var2.field3510.method1598(), var28);
               }
            }
         }

         var0.field2652 = var9 + var10;
      }

      if ((var3 & 4) != 0) {
         var6 = var0.method1654();
         if (var6 > 0) {
            for(var17 = 0; var17 < var6; ++var17) {
               var9 = -1;
               var10 = -1;
               var11 = -1;
               var19 = var0.method1701();
               if (var19 == 32767) {
                  var19 = var0.method1701();
                  var10 = var0.method1701();
                  var9 = var0.method1701();
                  var11 = var0.method1701();
               } else if (var19 != 32766) {
                  var10 = var0.method1701();
               } else {
                  var19 = -1;
               }

               var12 = var0.method1701();
               var2.method2023(var19, var10, var9, var11, Client.field1419, var12);
            }
         }

         var17 = var0.method1654();
         if (var17 > 0) {
            for(var19 = 0; var19 < var17; ++var19) {
               var9 = var0.method1701();
               var10 = var0.method1701();
               if (var10 != 32767) {
                  var11 = var0.method1701();
                  var12 = var0.method1675();
                  var29 = var10 > 0 ? var0.method1654() : var12;
                  var2.method2019(var9, Client.field1419, var10, var11, var12, var29);
               } else {
                  var2.method2024(var9);
               }
            }
         }
      }

      if (0 != (var3 & 512)) {
         var2.field3425 = var0.method1678();
         var2.field3427 = var0.method1669();
         var2.field3423 = var0.method1655();
         var2.field3393 = var0.method1655();
         var2.field3429 = var0.method1682() + Client.field1419;
         var2.field3430 = var0.method1682() + Client.field1419;
         var2.field3431 = var0.method1683();
         if (var2.field3519) {
            var2.field3425 += var2.field3515;
            var2.field3427 += var2.field3521;
            var2.field3423 += var2.field3515;
            var2.field3393 += var2.field3521;
            var2.field3421 = 0;
         } else {
            var2.field3425 += var2.field3448[0];
            var2.field3427 += var2.field3445[0];
            var2.field3423 += var2.field3448[0];
            var2.field3393 += var2.field3445[0];
            var2.field3421 = 1;
         }

         var2.field3437 = 0;
      }

      if ((var3 & 2048) != 0) {
         class82[] var18 = field3726;
         class82[] var27 = new class82[]{class82.field556, class82.field557, class82.field558, class82.field561};
         var18[var1] = (class82)class1.method2(var27, var0.method1655());
      }

      if (0 != (var3 & 128)) {
         var2.field3444 = var0.method1662();
         if (var2.field3444.charAt(0) == '~') {
            var2.field3444 = var2.field3444.substring(1);
            class431.method2007(2, var2.field3510.method1598(), var2.field3444);
         } else if (class266.field1874 == var2) {
            class431.method2007(2, var2.field3510.method1598(), var2.field3444);
         }

         var2.field3395 = false;
         var2.field3398 = 0;
         var2.field3399 = 0;
         var2.field3397 = 150;
      }

      if (0 != (var3 & 16384)) {
         var2.field3434 = Client.field1419 + var0.method1681();
         var2.field3376 = Client.field1419 + var0.method1681();
         var2.field3436 = var0.method1678();
         var2.field3394 = var0.method1677();
         var2.field3388 = var0.method1669();
         var2.field3426 = (byte)var0.method1714();
      }

      if ((var3 & 8192) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            var2.field3497[var6] = var0.method1662();
         }
      }

      if (0 != (var3 & 1024)) {
         var5 = var0.method1655();
      }

      if ((var3 & 2) != 0) {
         var6 = var0.method1703();
         if (var6 == 65535) {
            var6 = -1;
         }

         var17 = var0.method1675();
         Client.method938(var2, var6, var17);
      }

      if (var2.field3519) {
         if (var5 == 127) {
            var2.method2058(var2.field3515, var2.field3521);
         } else {
            class82 var23;
            if (class82.field556.field559 != var5) {
               class82[] var24 = new class82[]{class82.field556, class82.field557, class82.field558, class82.field561};
               var23 = (class82)class1.method2(var24, var5);
            } else {
               var23 = field3726[var1];
            }

            var2.method2061(var2.field3515, var2.field3521, var23);
         }
      }

   }
}
