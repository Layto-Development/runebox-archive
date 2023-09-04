public final class class443 extends class433 {
   static class534 field3522;
   boolean field3511;
   boolean field3513;
   boolean field3519;
   class206 field3494;
   class349 field3510;
   class485 field3506;
   class97 field3501;
   class97 field3516;
   class97 field3517;
   int field3493;
   int field3495 = -1;
   int field3496 = -1;
   int field3498;
   int field3499;
   int field3500;
   int field3502;
   int field3503;
   int field3504;
   int field3505;
   int field3507;
   int field3508;
   int field3509;
   int field3512;
   int field3514;
   int field3515;
   int field3518;
   int field3520;
   int field3521;
   String[] field3497 = new String[3];

   class443() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field3497[var1] = "";
      }

      this.field3499 = 0;
      this.field3507 = 0;
      this.field3502 = 0;
      this.field3512 = 0;
      this.field3511 = false;
      this.field3520 = 0;
      this.field3513 = false;
      this.field3516 = class97.field669;
      this.field3517 = class97.field669;
      this.field3501 = class97.field669;
      this.field3519 = false;
   }

   final void method2049(class366 var1) {
      var1.field2652 = 0;
      int var3 = var1.method1654();
      boolean var4 = true;
      this.field3495 = var1.method1655();
      this.field3496 = var1.method1655();
      int var5 = -1;
      this.field3520 = 0;
      int[] var6 = new int[12];

      int var8;
      int var9;
      int var10;
      for(int var7 = 0; var7 < 12; ++var7) {
         var8 = var1.method1654();
         if (var8 == 0) {
            var6[var7] = 0;
         } else {
            var9 = var1.method1654();
            var6[var7] = var9 + (var8 << 8);
            if (var7 == 0 && 65535 == var6[0]) {
               var5 = var1.method1703();
               break;
            }

            if (var6[var7] >= 512) {
               var10 = class47.method213(var6[var7] - 512).field405;
               if (var10 != 0) {
                  this.field3520 = var10;
               }
            }
         }
      }

      int[] var28 = null;
      if (Client.field1298 >= 213) {
         var28 = new int[12];

         for(var8 = 0; var8 < 12; ++var8) {
            var9 = var1.method1654();
            if (var9 == 0) {
               var28[var8] = 0;
            } else {
               var10 = var1.method1654();
               var28[var8] = var10 + (var9 << 8);
            }
         }
      }

      int[] var29 = new int[5];

      for(var9 = 0; var9 < 5; ++var9) {
         var10 = var1.method1654();
         if (var10 < 0 || var10 >= class343.field2556[var9].length) {
            var10 = 0;
         }

         var29[var9] = var10;
      }

      super.field3379 = var1.method1703();
      if (65535 == super.field3379) {
         super.field3379 = -1;
      }

      super.field3380 = var1.method1703();
      if (super.field3380 == 65535) {
         super.field3380 = -1;
      }

      super.field3441 = super.field3380;
      super.field3382 = var1.method1703();
      if (65535 == super.field3382) {
         super.field3382 = -1;
      }

      super.field3383 = var1.method1703();
      if (65535 == super.field3383) {
         super.field3383 = -1;
      }

      super.field3384 = var1.method1703();
      if (super.field3384 == 65535) {
         super.field3384 = -1;
      }

      super.field3432 = var1.method1703();
      if (super.field3432 == 65535) {
         super.field3432 = -1;
      }

      super.field3443 = var1.method1703();
      if (65535 == super.field3443) {
         super.field3443 = -1;
      }

      this.field3510 = new class349(var1.method1662(), class103.field694);
      this.method2051();
      this.method2054();
      this.method2062();
      if (this == class266.field1874) {
         class425.field3312 = this.field3510.method1598();
      }

      this.field3499 = var1.method1654();
      this.field3507 = var1.method1703();
      this.field3513 = var1.method1654() == 1;
      if (0 == Client.field1141 && Client.field1204 >= 2) {
         this.field3513 = false;
      }

      class301[] var30 = null;
      boolean var31 = false;
      int var11 = var1.method1703();
      var31 = (var11 >> 15 & 1) == 1;
      int var12;
      if (var11 > 0 && var11 != 32768) {
         var30 = new class301[12];

         for(var12 = 0; var12 < 12; ++var12) {
            int var13 = var11 >> 12 - var12 & 1;
            if (var13 == 1) {
               int var17 = var6[var12] - 512;
               int var18 = var1.method1654();
               boolean var19 = (var18 & 1) != 0;
               boolean var20 = 0 != (var18 & 2);
               class301 var21 = new class301(var17);
               int var22;
               int[] var23;
               boolean var24;
               int var25;
               short var26;
               if (var19) {
                  var22 = var1.method1654();
                  var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                  var24 = null != var21.field2048 && var23.length == var21.field2048.length;

                  for(var25 = 0; var25 < 2; ++var25) {
                     if (15 != var23[var25]) {
                        var26 = (short)var1.method1703();
                        if (var24) {
                           var21.field2048[var23[var25]] = var26;
                        }
                     }
                  }
               }

               if (var20) {
                  var22 = var1.method1654();
                  var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                  var24 = var21.field2049 != null && var21.field2049.length == var23.length;

                  for(var25 = 0; var25 < 2; ++var25) {
                     if (var23[var25] != 15) {
                        var26 = (short)var1.method1703();
                        if (var24) {
                           var21.field2049[var23[var25]] = var26;
                        }
                     }
                  }
               }

               var30[var12] = var21;
            }
         }
      }

      for(var12 = 0; var12 < 3; ++var12) {
         this.field3497[var12] = var1.method1662();
      }

      int var27 = var1.method1654();
      if (this.field3494 == null) {
         this.field3494 = new class206();
      }

      this.field3494.method1071(var28, var6, var30, var31, var29, var3, var5, var27);
   }

   boolean method2050() {
      if (class97.field669 == this.field3516) {
         this.method2052();
      }

      return this.field3516 == class97.field668;
   }

   void method2051() {
      this.field3516 = class97.field669;
   }

   void method2052() {
      this.field3516 = class290.field1979.method554(this.field3510) ? class97.field668 : class97.field667;
   }

   boolean method2053() {
      if (class97.field669 == this.field3517) {
         this.method2057();
      }

      return class97.field668 == this.field3517;
   }

   void method2054() {
      this.field3517 = class97.field669;
   }

   void method2057() {
      this.field3517 = null != class498.field3983 && class498.field3983.method1809(this.field3510) ? class97.field668 : class97.field667;
   }

   void method2056() {
      for(int var2 = 0; var2 < 4; ++var2) {
         if (Client.field1360[var2] != null && Client.field1360[var2].method63(this.field3510.method1598()) != -1 && var2 != 2) {
            this.field3501 = class97.field668;
            return;
         }
      }

      this.field3501 = class97.field667;
   }

   void method2062() {
      this.field3501 = class97.field669;
   }

   boolean method2059() {
      if (this.field3501 == class97.field669) {
         this.method2056();
      }

      return this.field3501 == class97.field668;
   }

   int method2055() {
      return null != this.field3494 && this.field3494.field1580 != -1 ? class90.method359(this.field3494.field1580).field617 : 1;
   }

   protected final class485 method632() {
      if (null == this.field3494) {
         return null;
      } else {
         class464 var2 = -1 != super.field3418 && 0 == super.field3435 ? class464.method2200(super.field3418) : null;
         class464 var3 = -1 != super.field3386 && !this.field3511 && (super.field3379 != super.field3386 || var2 == null) ? class464.method2200(super.field3386) : null;
         class485 var4 = this.field3494.method1082(var2, super.field3419, var3, super.field3373);
         if (null == var4) {
            return null;
         } else {
            var4.method2293();
            super.field3433 = var4.field1058;
            int var5 = var4.field3842;
            if (!this.field3511) {
               var4 = this.method2022(var4);
            }

            if (!this.field3511 && this.field3506 != null) {
               if (Client.field1419 >= this.field3512) {
                  this.field3506 = null;
               }

               if (Client.field1419 >= this.field3502 && Client.field1419 < this.field3512) {
                  class485 var6 = this.field3506;
                  var6.method2294(this.field3503 - super.field3403, this.field3504 - this.field3500, this.field3505 - super.field3374);
                  if (super.field3414 == 512) {
                     var6.method2303();
                     var6.method2303();
                     var6.method2303();
                  } else if (1024 == super.field3414) {
                     var6.method2303();
                     var6.method2303();
                  } else if (1536 == super.field3414) {
                     var6.method2303();
                  }

                  class485[] var7 = new class485[]{var4, var6};
                  var4 = new class485(var7, 2);
                  if (512 == super.field3414) {
                     var6.method2303();
                  } else if (1024 == super.field3414) {
                     var6.method2303();
                     var6.method2303();
                  } else if (super.field3414 == 1536) {
                     var6.method2303();
                     var6.method2303();
                     var6.method2303();
                  }

                  var6.method2294(super.field3403 - this.field3503, this.field3500 - this.field3504, super.field3374 - this.field3505);
               }
            }

            var4.field3843 = true;
            if (super.field3426 != 0 && Client.field1419 >= super.field3434 && Client.field1419 < super.field3376) {
               var4.field3898 = super.field3436;
               var4.field3868 = super.field3394;
               var4.field3866 = super.field3388;
               var4.field3904 = super.field3426;
               var4.field3905 = (short)var5;
            } else {
               var4.field3904 = 0;
            }

            return var4;
         }
      }
   }

   final void method2061(int var1, int var2, class82 var3) {
      if (super.field3418 != -1 && class464.method2200(super.field3418).field3688 == 1) {
         super.field3418 = -1;
      }

      this.method2026();
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field3448[0] >= 0 && super.field3448[0] < 104 && super.field3445[0] >= 0 && super.field3445[0] < 104) {
            if (class82.field558 == var3) {
               class443 var5 = this;
               class82 var6 = class82.field558;
               int var7 = super.field3448[0];
               int var8 = super.field3445[0];
               int var9 = this.method2055();
               if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
                  int var11 = this.method2055();
                  class308 var12 = Client.method897(var1, var2);
                  class378 var13 = Client.field1191[this.field3514];
                  int[] var14 = Client.field1417;
                  int[] var15 = Client.field1418;
                  int var10 = class391.method1785(var7, var8, var11, var12, var13, true, var14, var15, class391.field2756[0]);
                  int var16 = var10;
                  if (var10 >= 1) {
                     for(int var17 = 0; var17 < var16 - 1; ++var17) {
                        var5.method2060(Client.field1417[var17], Client.field1418[var17], var6);
                     }
                  }
               }
            }

            this.method2060(var1, var2, var3);
         } else {
            this.method2058(var1, var2);
         }
      } else {
         this.method2058(var1, var2);
      }

   }

   void method2058(int var1, int var2) {
      super.field3421 = 0;
      super.field3437 = 0;
      super.field3447 = 0;
      super.field3448[0] = var1;
      super.field3445[0] = var2;
      int var4 = this.method2055();
      super.field3403 = 128 * super.field3448[0] + var4 * 64;
      super.field3374 = 128 * super.field3445[0] + var4 * 64;
   }

   final void method2060(int var1, int var2, class82 var3) {
      if (super.field3421 < 9) {
         ++super.field3421;
      }

      for(int var5 = super.field3421; var5 > 0; --var5) {
         super.field3448[var5] = super.field3448[var5 - 1];
         super.field3445[var5] = super.field3445[var5 - 1];
         super.field3446[var5] = super.field3446[var5 - 1];
      }

      super.field3448[0] = var1;
      super.field3445[0] = var2;
      super.field3446[0] = var3;
   }

   final boolean method2017() {
      return null != this.field3494;
   }
}
