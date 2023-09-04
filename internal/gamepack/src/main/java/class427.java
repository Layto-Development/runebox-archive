public class class427 extends class306 {
   public static float[] field3334;
   public static int field3330 = 0;
   public static int field3331;
   public static int field3332;
   public static int field3335 = 0;
   public static int field3336 = 0;
   public static int field3337 = 0;
   public static int[] field3333;

   protected class427() {
   }

   protected static void method1961(int[] var0, int var1, int var2, float[] var3) {
      field3333 = var0;
      field3331 = var1;
      field3332 = var2;
      field3334 = var3;
      method1975(0, 0, var1, var2);
   }

   public static void method1962() {
      field3336 = 0;
      field3337 = 0;
      field3330 = field3331;
      field3335 = field3332;
   }

   public static void method1975(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field3331) {
         var2 = field3331;
      }

      if (var3 > field3332) {
         var3 = field3332;
      }

      field3336 = var0;
      field3337 = var1;
      field3330 = var2;
      field3335 = var3;
   }

   public static void method1981(int var0, int var1, int var2, int var3) {
      if (field3336 < var0) {
         field3336 = var0;
      }

      if (field3337 < var1) {
         field3337 = var1;
      }

      if (field3330 > var2) {
         field3330 = var2;
      }

      if (field3335 > var3) {
         field3335 = var3;
      }

   }

   public static void method1964(int[] var0) {
      var0[0] = field3336;
      var0[1] = field3337;
      var0[2] = field3330;
      var0[3] = field3335;
   }

   public static void method1984(int[] var0) {
      field3336 = var0[0];
      field3337 = var0[1];
      field3330 = var0[2];
      field3335 = var0[3];
   }

   public static void method1965() {
      int var0 = 0;

      int var1;
      for(var1 = field3331 * field3332 - 7; var0 < var1; field3333[var0++] = 0) {
         field3333[var0++] = 0;
         field3333[var0++] = 0;
         field3333[var0++] = 0;
         field3333[var0++] = 0;
         field3333[var0++] = 0;
         field3333[var0++] = 0;
         field3333[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field3333[var0++] = 0) {
      }

      method1977();
   }

   static void method1980(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method1983(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field3337) {
            var4 = field3337;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > field3335) {
            var5 = field3335;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < field3336) {
               var12 = field3336;
            }

            var13 = var0 + var8;
            if (var13 > field3330) {
               var13 = field3330;
            }

            var14 = var12 + var6 * field3331;

            for(var15 = var12; var15 < var13; ++var15) {
               field3333[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < field3336) {
               var12 = field3336;
            }

            var13 = var0 + var8;
            if (var13 > field3330 - 1) {
               var13 = field3330 - 1;
            }

            var14 = var12 + var6 * field3331;

            for(var15 = var12; var15 <= var13; ++var15) {
               field3333[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   public static void method1966(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method1980(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if (var12 < field3337) {
               var12 = field3337;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > field3335) {
               var13 = field3335;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < field3336) {
                  var20 = field3336;
               }

               var21 = var0 + var16;
               if (var21 > field3330) {
                  var21 = field3330;
               }

               var22 = var20 + var14 * field3331;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (field3333[var22] >> 16 & 255) * var5;
                  var10 = (field3333[var22] >> 8 & 255) * var5;
                  var11 = (field3333[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field3333[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < field3336) {
                  var20 = field3336;
               }

               var21 = var0 + var16;
               if (var21 > field3330 - 1) {
                  var21 = field3330 - 1;
               }

               var22 = var20 + var14 * field3331;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (field3333[var22] >> 16 & 255) * var5;
                  var10 = (field3333[var22] >> 8 & 255) * var5;
                  var11 = (field3333[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field3333[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   public static void method1967(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field3336) {
         var2 -= field3336 - var0;
         var0 = field3336;
      }

      if (var1 < field3337) {
         var3 -= field3337 - var1;
         var1 = field3337;
      }

      if (var0 + var2 > field3330) {
         var2 = field3330 - var0;
      }

      if (var1 + var3 > field3335) {
         var3 = field3335 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field3331 - var2;
      int var8 = var0 + var1 * field3331;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field3333[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            field3333[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   public static void method1968(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field3336) {
         var2 -= field3336 - var0;
         var0 = field3336;
      }

      if (var1 < field3337) {
         var3 -= field3337 - var1;
         var1 = field3337;
      }

      if (var0 + var2 > field3330) {
         var2 = field3330 - var0;
      }

      if (var1 + var3 > field3335) {
         var3 = field3335 - var1;
      }

      int var5 = field3331 - var2;
      int var6 = var0 + var1 * field3331;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field3333[var6++] = var4;
         }

         var6 += var5;
      }

   }

   public static void method1969(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field3336) {
            var2 -= field3336 - var0;
            var0 = field3336;
         }

         if (var1 < field3337) {
            var6 += (field3337 - var1) * var7;
            var3 -= field3337 - var1;
            var1 = field3337;
         }

         if (var0 + var2 > field3330) {
            var2 = field3330 - var0;
         }

         if (var1 + var3 > field3335) {
            var3 = field3335 - var1;
         }

         int var8 = field3331 - var2;
         int var9 = var0 + var1 * field3331;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field3333[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   public static void method1982(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < field3336) {
            var2 -= field3336 - var0;
            var0 = field3336;
         }

         if (var1 < field3337) {
            var8 += (field3337 - var1) * var9;
            var3 -= field3337 - var1;
            var1 = field3337;
         }

         if (var0 + var2 > field3330) {
            var2 = field3330 - var0;
         }

         if (var1 + var3 > field3335) {
            var3 = field3335 - var1;
         }

         int var10 = field3331 - var2;
         int var11 = var0 + var1 * field3331;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += field3331;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field3333[var11];
                  if (var20 == 0) {
                     field3333[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     field3333[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void method1985(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < field3331 && var1 < field3332) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field3331) {
               var2 = field3331 - var0;
            }

            if (var1 + var3 > field3332) {
               var3 = field3332 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field3331 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var8 && (var13 != 255 || var14 != 255)) {
               var15 = (var1 + var10) * field3331 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field3333[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     field3333[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * field3331 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        field3333[var15++] = var5;
                     } else {
                        field3333[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static void method1971(int var0, int var1, int var2, int var3, int var4) {
      method1979(var0, var1, var2, var4);
      method1979(var0, var1 + var3 - 1, var2, var4);
      method1974(var0, var1, var3, var4);
      method1974(var0 + var2 - 1, var1, var3, var4);
   }

   public static void method1972(int var0, int var1, int var2, int var3, int var4, int var5) {
      method1973(var0, var1, var2, var4, var5);
      method1973(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method1963(var0, var1 + 1, var3 - 2, var4, var5);
         method1963(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   public static void method1979(int var0, int var1, int var2, int var3) {
      if (var1 >= field3337 && var1 < field3335) {
         if (var0 < field3336) {
            var2 -= field3336 - var0;
            var0 = field3336;
         }

         if (var0 + var2 > field3330) {
            var2 = field3330 - var0;
         }

         int var4 = var0 + var1 * field3331;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3333[var4 + var5] = var3;
         }

      }
   }

   static void method1973(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field3337 && var1 < field3335) {
         if (var0 < field3336) {
            var2 -= field3336 - var0;
            var0 = field3336;
         }

         if (var0 + var2 > field3330) {
            var2 = field3330 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field3331;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field3333[var12] >> 16 & 255) * var5;
            int var10 = (field3333[var12] >> 8 & 255) * var5;
            int var11 = (field3333[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field3333[var12++] = var14;
         }

      }
   }

   public static void method1974(int var0, int var1, int var2, int var3) {
      if (var0 >= field3336 && var0 < field3330) {
         if (var1 < field3337) {
            var2 -= field3337 - var1;
            var1 = field3337;
         }

         if (var1 + var2 > field3335) {
            var2 = field3335 - var1;
         }

         int var4 = var0 + var1 * field3331;

         for(int var5 = 0; var5 < var2; ++var5) {
            field3333[var4 + var5 * field3331] = var3;
         }

      }
   }

   static void method1963(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field3336 && var0 < field3330) {
         if (var1 < field3337) {
            var2 -= field3337 - var1;
            var1 = field3337;
         }

         if (var1 + var2 > field3335) {
            var2 = field3335 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field3331;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field3333[var12] >> 16 & 255) * var5;
            int var10 = (field3333[var12] >> 8 & 255) * var5;
            int var11 = (field3333[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field3333[var12] = var14;
            var12 += field3331;
         }

      }
   }

   public static void method1970(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method1979(var0, var1, var2 + 1, var4);
         } else {
            method1979(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            method1974(var0, var1, var3 + 1, var4);
         } else {
            method1974(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5);
            var2 += var0;
            if (var0 < field3336) {
               var1 += var5 * (field3336 - var0);
               var0 = field3336;
            }

            if (var2 >= field3330) {
               var2 = field3330 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= field3337 && var6 < field3335) {
                  field3333[var0 + var6 * field3331] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5);
            var3 += var1;
            if (var1 < field3337) {
               var0 += var5 * (field3337 - var1);
               var1 = field3337;
            }

            if (var3 >= field3335) {
               var3 = field3335 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= field3336 && var6 < field3330) {
                  field3333[var6 + var1 * field3331] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   static void method1983(int var0, int var1, int var2) {
      if (var0 >= field3336 && var1 >= field3337 && var0 < field3330 && var1 < field3335) {
         field3333[var0 + var1 * field3331] = var2;
      }
   }

   public static void method1976(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field3331;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field3333[var6++] = var2;
         }

         var5 += field3331;
      }

   }

   public static void method1977() {
      if (field3334 != null) {
         int var0;
         int var1;
         int var2;
         if (field3336 == 0 && field3330 == field3331 && field3337 == 0 && field3335 == field3332) {
            var0 = field3334.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; field3334[var2++] = 0.0F) {
               field3334[var2++] = 0.0F;
               field3334[var2++] = 0.0F;
               field3334[var2++] = 0.0F;
               field3334[var2++] = 0.0F;
               field3334[var2++] = 0.0F;
               field3334[var2++] = 0.0F;
               field3334[var2++] = 0.0F;
            }

            while(var2 < var0) {
               field3334[var2++] = 0.0F;
            }
         } else {
            var0 = field3330 - field3336;
            var1 = field3335 - field3337;
            var2 = field3331 - var0;
            int var3 = field3336 + field3337 * field3331;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     ++var0;
                     field3334[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     field3334[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   public static void method1978() {
      if (field3334 != null) {
         int var0 = field3334.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % field3331 < field3331 / 2 && field3334[var1] > 0.0F) {
               float var3 = field3334[var1];
               float var4 = 75.0F;
               float var5 = 10000.0F;
               float var6 = 750000.0F / (10000.0F - var3 * 9925.0F);
               float var2 = (var6 - 75.0F) / 9925.0F;
               int var7 = (int)(var2 * 255.0F);
               field3333[var1] = var7 << 16 | var7 << 8 | var7;
            }
         }

      }
   }
}
