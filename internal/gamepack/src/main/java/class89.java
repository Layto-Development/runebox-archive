public final class class89 {
   static class212 field609 = new class212();

   class89() throws Throwable {
   }

   public static int method341(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(field609) {
         field609.field1619 = var2;
         field609.field1645 = var4;
         field609.field1631 = var0;
         field609.field1620 = 0;
         field609.field1624 = var1;
         field609.field1629 = 0;
         field609.field1628 = 0;
         field609.field1621 = 0;
         field609.field1623 = 0;
         method338(field609);
         var1 -= field609.field1624;
         field609.field1619 = null;
         field609.field1631 = null;
         return var1;
      }
   }

   static void method337(class212 var0) {
      byte var2 = var0.field1627;
      int var3 = var0.field1614;
      int var4 = var0.field1635;
      int var5 = var0.field1633;
      int[] var6 = class60.field476;
      int var7 = var0.field1632;
      byte[] var8 = var0.field1631;
      int var9 = var0.field1620;
      int var10 = var0.field1624;
      int var12 = var0.field1650 + 1;

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

      int var13 = var0.field1623;
      var0.field1623 += var10 - var10;
      if (var0.field1623 < var13) {
      }

      var0.field1627 = var2;
      var0.field1614 = var3;
      var0.field1635 = var4;
      var0.field1633 = var5;
      class60.field476 = var6;
      var0.field1632 = var7;
      var0.field1631 = var8;
      var0.field1620 = var9;
      var0.field1624 = var10;
   }

   static void method338(class212 var0) {
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
      var0.field1630 = -1562387581;
      if (class60.field476 == null) {
         class60.field476 = new int[var0.field1630 * 731544800];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method343(var0);
            if (var1 == 23) {
               return;
            }

            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method343(var0);
            var1 = method339(var0);
            if (var1 != 0) {
            }

            var0.field1646 = 0;
            var1 = method343(var0);
            var0.field1646 = var0.field1646 << 8 | var1 & 255;
            var1 = method343(var0);
            var0.field1646 = var0.field1646 << 8 | var1 & 255;
            var1 = method343(var0);
            var0.field1646 = var0.field1646 << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = method339(var0);
               if (var1 == 1) {
                  var0.field1639[var35] = true;
               } else {
                  var0.field1639[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.field1618[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.field1639[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = method339(var0);
                     if (var1 == 1) {
                        var0.field1618[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method340(var0);
            int var38 = var0.field1637 + 2;
            int var39 = method336(3, var0);
            int var40 = method336(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = method339(var0);
                  if (var1 == 0) {
                     var0.field1644[var35] = (byte)var36;
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
               var29 = var0.field1644[var35];

               for(var28 = var27[var29]; var29 > 0; var29 = (byte)(var29 - 1)) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = (byte)var28;
               var0.field1643[var35] = (byte)var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var48 = method336(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = method339(var0);
                     if (var1 == 0) {
                        var0.field1625[var37][var35] = (byte)var48;
                        break;
                     }

                     var1 = method339(var0);
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
                  if (var0.field1625[var37][var35] > var3) {
                     var3 = var0.field1625[var37][var35];
                  }

                  if (var0.field1625[var37][var35] < var2) {
                     var2 = var0.field1625[var37][var35];
                  }
               }

               method342(var0.field1638[var37], var0.field1647[var37], var0.field1648[var37], var0.field1625[var37], var2, var3, var38);
               var0.field1649[var37] = var2;
            }

            int var41 = var0.field1637 + 1;
            int var42 = -1;
            int var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.field1634[var35] = 0;
            }

            var29 = 4095;

            int var53;
            for(var53 = 15; var53 >= 0; --var53) {
               for(var28 = 15; var28 >= 0; --var28) {
                  var0.field1636[var29] = (byte)(var53 * 16 + var28);
                  --var29;
               }

               var0.field1626[var53] = var29 + 1;
            }

            int var45 = 0;
            byte var52;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var52 = var0.field1643[var42];
               var22 = var0.field1649[var52];
               var23 = var0.field1638[var52];
               var25 = var0.field1648[var52];
               var24 = var0.field1647[var52];
            }

            --var43;
            int var49 = var22;

            int var50;
            byte var51;
            for(var50 = method336(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
               ++var49;
               var51 = method339(var0);
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
                        var30 = var0.field1626[0];

                        for(var1 = var0.field1636[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field1636[var34] = var0.field1636[var34 - 1];
                           var0.field1636[var34 - 1] = var0.field1636[var34 - 2];
                           var0.field1636[var34 - 2] = var0.field1636[var34 - 3];
                           var0.field1636[var34 - 3] = var0.field1636[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field1636[var30 + var33] = var0.field1636[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field1636[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field1626[var31] + var32;

                        for(var1 = var0.field1636[var30]; var30 > var0.field1626[var31]; --var30) {
                           var0.field1636[var30] = var0.field1636[var30 - 1];
                        }

                        for(var10002 = var0.field1626[var31]++; var31 > 0; --var31) {
                           var10002 = var0.field1626[var31]--;
                           var0.field1636[var0.field1626[var31]] = var0.field1636[var0.field1626[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.field1626[0]--;
                        var0.field1636[var0.field1626[0]] = var1;
                        if (var0.field1626[0] == 0) {
                           var29 = 4095;

                           for(var53 = 15; var53 >= 0; --var53) {
                              for(var28 = 15; var28 >= 0; --var28) {
                                 var0.field1636[var29] = var0.field1636[var0.field1626[var53] + var28];
                                 --var29;
                              }

                              var0.field1626[var53] = var29 + 1;
                           }
                        }
                     }

                     var10002 = var0.field1634[var0.field1640[var1 & 255] & 255]++;
                     class60.field476[var45] = var0.field1640[var1 & 255] & 255;
                     ++var45;
                     if (var43 == 0) {
                        ++var42;
                        var43 = 50;
                        var52 = var0.field1643[var42];
                        var22 = var0.field1649[var52];
                        var23 = var0.field1638[var52];
                        var25 = var0.field1648[var52];
                        var24 = var0.field1647[var52];
                     }

                     --var43;
                     var49 = var22;

                     for(var50 = method336(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                        ++var49;
                        var51 = method339(var0);
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
                           var52 = var0.field1643[var42];
                           var22 = var0.field1649[var52];
                           var23 = var0.field1638[var52];
                           var25 = var0.field1648[var52];
                           var24 = var0.field1647[var52];
                        }

                        --var43;
                        var49 = var22;

                        for(var50 = method336(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                           ++var49;
                           var51 = method339(var0);
                        }

                        var44 = var25[var50 - var24[var49]];
                     } while(var44 == 0 || var44 == 1);

                     ++var46;
                     var1 = var0.field1640[var0.field1636[var0.field1626[0]] & 255];
                     var10000 = var0.field1634;

                     for(var10000[var1 & 255] += var46; var46 > 0; --var46) {
                        class60.field476[var45] = var1 & 255;
                        ++var45;
                     }
                  }
               }

               var0.field1614 = 0;
               var0.field1627 = 0;
               var0.field1642[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field1642[var35] = var0.field1634[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var10000 = var0.field1642;
                  var10000[var35] += var0.field1642[var35 - 1];
               }

               for(var35 = 0; var35 < var45; ++var35) {
                  var1 = (byte)(class60.field476[var35] & 255);
                  var10000 = class60.field476;
                  int var10001 = var0.field1642[var1 & 255];
                  var10000[var10001] |= var35 << 8;
                  var10002 = var0.field1642[var1 & 255]++;
               }

               var0.field1632 = class60.field476[var0.field1646] >> 8;
               var0.field1635 = 0;
               var0.field1632 = class60.field476[var0.field1632];
               var0.field1633 = (byte)(var0.field1632 & 255);
               var0.field1632 >>= 8;
               ++var0.field1635;
               var0.field1650 = var45;
               method337(var0);
               if (var0.field1635 == var0.field1650 + 1 && var0.field1614 == 0) {
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

   static byte method343(class212 var0) {
      return (byte)method336(8, var0);
   }

   static byte method339(class212 var0) {
      return (byte)method336(1, var0);
   }

   static int method336(int var0, class212 var1) {
      while(var1.field1629 < var0) {
         var1.field1628 = var1.field1628 << 8 | var1.field1619[var1.field1645] & 255;
         var1.field1629 += 8;
         ++var1.field1645;
         ++var1.field1621;
         if (var1.field1621 == 0) {
         }
      }

      int var2 = var1.field1628 >> var1.field1629 - var0 & (1 << var0) - 1;
      var1.field1629 -= var0;
      return var2;
   }

   static void method340(class212 var0) {
      var0.field1637 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field1618[var1]) {
            var0.field1640[var0.field1637] = (byte)var1;
            ++var0.field1637;
         }
      }

   }

   static void method342(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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
