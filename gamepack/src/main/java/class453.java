public class class453 extends class151 {
   public static class298 field3509;
   public static class298 field3510;
   public static class364 field3511 = new class364(64);
   public static class364 field3517 = new class364(50);
   static int field3545;
   class197 field3528;
   int field3531;
   int field3539;
   int field3540;
   int field3543;
   int field3546;
   int field3547;
   int[] field3516;
   int[] field3532;
   int[] field3551;
   short[] field3534;
   short[] field3549;
   short[] field3554;
   public boolean field3508;
   public boolean field3537;
   public boolean field3541;
   public boolean field3548;
   public boolean field3550;
   public int field3513;
   public int field3515;
   public int field3518;
   public int field3519;
   public int field3520;
   public int field3521;
   public int field3522;
   public int field3523;
   public int field3524;
   public int field3525;
   public int field3526;
   public int field3527;
   public int field3530;
   public int field3535;
   public int field3536;
   public int field3538;
   public int field3544;
   public int field3552;
   public int field3553;
   public int[] field3542;
   public String field3514;
   public String[] field3512;
   public short[] field3529;
   public short[] field3533;

   class453() {
      this.field3514 = class27.field544;
      this.field3515 = 1;
      this.field3518 = -1;
      this.field3519 = -1;
      this.field3520 = -1;
      this.field3535 = -1;
      this.field3522 = -1;
      this.field3523 = -1;
      this.field3524 = -1;
      this.field3525 = -1;
      this.field3526 = -1;
      this.field3527 = -1;
      this.field3552 = -1;
      this.field3521 = -1;
      this.field3530 = -1;
      this.field3536 = -1;
      this.field3553 = -1;
      this.field3512 = new String[5];
      this.field3537 = true;
      this.field3538 = -1;
      this.field3539 = 128;
      this.field3531 = 128;
      this.field3541 = false;
      this.field3540 = 0;
      this.field3543 = 0;
      this.field3544 = 32;
      this.field3546 = -1;
      this.field3547 = -1;
      this.field3548 = true;
      this.field3508 = true;
      this.field3550 = false;
      this.field3551 = null;
      this.field3549 = null;
   }

   void method2227() {
   }

   void method2228(class184 var1, byte var2) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            }

            return;
         }

         this.method2229(var1, var3);
      }
   }

   void method2229(class184 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method1125();
         this.field3532 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3532[var5] = var1.method1174();
         }
      } else if (var2 == 2) {
         this.field3514 = var1.method1133();
      } else if (var2 == 12) {
         this.field3515 = var1.method1125();
      } else if (var2 == 13) {
         this.field3518 = var1.method1174();
      } else if (var2 == 14) {
         this.field3535 = var1.method1174();
      } else if (var2 == 15) {
         this.field3519 = var1.method1174();
      } else if (var2 == 16) {
         this.field3520 = var1.method1174();
      } else if (var2 == 17) {
         this.field3535 = var1.method1174();
         this.field3522 = var1.method1174();
         this.field3523 = var1.method1174();
         this.field3524 = var1.method1174();
      } else if (var2 == 18) {
         var1.method1174();
      } else if (var2 >= 30 && var2 < 35) {
         this.field3512[var2 - 30] = var1.method1133();
         if (this.field3512[var2 - 30].equalsIgnoreCase(class27.field486)) {
            this.field3512[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method1125();
         this.field3554 = new short[var4];
         this.field3533 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3554[var5] = (short)var1.method1174();
            this.field3533[var5] = (short)var1.method1174();
         }
      } else if (var2 == 41) {
         var4 = var1.method1125();
         this.field3534 = new short[var4];
         this.field3529 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3534[var5] = (short)var1.method1174();
            this.field3529[var5] = (short)var1.method1174();
         }
      } else if (var2 == 60) {
         var4 = var1.method1125();
         this.field3516 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3516[var5] = var1.method1174();
         }
      } else if (var2 == 93) {
         this.field3537 = false;
      } else if (var2 == 95) {
         this.field3538 = var1.method1174();
      } else if (var2 == 97) {
         this.field3539 = var1.method1174();
      } else if (var2 == 98) {
         this.field3531 = var1.method1174();
      } else if (var2 == 99) {
         this.field3541 = true;
      } else if (var2 == 100) {
         this.field3540 = var1.method1126();
      } else if (var2 == 101) {
         this.field3543 = var1.method1126() * 5;
      } else {
         int var6;
         if (var2 == 102) {
            var4 = var1.method1125();
            var5 = 0;

            for(var6 = var4; var6 != 0; var6 >>= 1) {
               ++var5;
            }

            this.field3551 = new int[var5];
            this.field3549 = new short[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               if ((var4 & 1 << var7) == 0) {
                  this.field3551[var7] = -1;
                  this.field3549[var7] = -1;
               } else {
                  this.field3551[var7] = var1.method1173();
                  this.field3549[var7] = (short)var1.method1137();
               }
            }
         } else if (var2 == 103) {
            this.field3544 = var1.method1174();
         } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
               this.field3548 = false;
            } else if (var2 == 109) {
               this.field3508 = false;
            } else if (var2 == 111) {
               this.field3550 = true;
            } else if (var2 == 114) {
               this.field3525 = var1.method1174();
            } else if (var2 == 115) {
               this.field3525 = var1.method1174();
               this.field3526 = var1.method1174();
               this.field3527 = var1.method1174();
               this.field3552 = var1.method1174();
            } else if (var2 == 116) {
               this.field3521 = var1.method1174();
            } else if (var2 == 117) {
               this.field3521 = var1.method1174();
               this.field3530 = var1.method1174();
               this.field3536 = var1.method1174();
               this.field3553 = var1.method1174();
            } else if (var2 == 249) {
               this.field3528 = class83.method717(var1, this.field3528);
            }
         } else {
            this.field3546 = var1.method1174();
            if (this.field3546 == 65535) {
               this.field3546 = -1;
            }

            this.field3547 = var1.method1174();
            if (this.field3547 == 65535) {
               this.field3547 = -1;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.method1174();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.method1125();
            this.field3542 = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.field3542[var6] = var1.method1174();
               if (this.field3542[var6] == 65535) {
                  this.field3542[var6] = -1;
               }
            }

            this.field3542[var5 + 1] = var4;
         }
      }

   }

   public final class104 method2230(class157 var1, int var2, class157 var3, int var4, class90 var5) {
      if (null != this.field3542) {
         class453 var12 = this.method2232();
         return null == var12 ? null : var12.method2230(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)this.field3513;
         if (var5 != null) {
            var7 |= var5.field1279 << 16;
         }

         class104 var9 = (class104)field3517.method1851(var7);
         if (var9 == null) {
            class533 var10 = this.method2240(this.field3532, var5);
            if (null == var10) {
               return null;
            }

            var9 = var10.method2534(this.field3540 + 64, this.field3543 + 850, -30, -50, -30);
            field3517.method1850(var9, var7);
         }

         class104 var11;
         if (var1 != null && var3 != null) {
            var11 = var1.method977(var9, var2, var3, var4);
         } else if (null != var1) {
            var11 = var1.method975(var9, var2);
         } else if (var3 != null) {
            var11 = var3.method975(var9, var4);
         } else {
            var11 = var9.method757(true);
         }

         if (this.field3539 != 128 || this.field3531 != 128) {
            var11.method771(this.field3539, this.field3531, this.field3539);
         }

         return var11;
      }
   }

   public final class533 method2231(class90 var1) {
      if (null != this.field3542) {
         class453 var3 = this.method2232();
         return null == var3 ? null : var3.method2231(var1);
      } else {
         return this.method2240(this.field3516, var1);
      }
   }

   class533 method2240(int[] var1, class90 var2) {
      int[] var4 = var1;
      if (var2 != null && null != var2.field1277) {
         var4 = var2.field1277;
      }

      if (var4 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (var4[var6] != -1 && !field3510.method1631(var4[var6], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            class533[] var10 = new class533[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var10[var7] = class533.method2538(field3510, var4[var7], 0);
            }

            class533 var11;
            if (var10.length == 1) {
               var11 = var10[0];
               if (var11 == null) {
                  var11 = new class533(var10, var10.length);
               }
            } else {
               var11 = new class533(var10, var10.length);
            }

            short[] var8;
            int var9;
            if (this.field3554 != null) {
               var8 = this.field3533;
               if (var2 != null && null != var2.field1278) {
                  var8 = var2.field1278;
               }

               for(var9 = 0; var9 < this.field3554.length; ++var9) {
                  var11.method2537(this.field3554[var9], var8[var9]);
               }
            }

            if (this.field3534 != null) {
               var8 = this.field3529;
               if (var2 != null && null != var2.field1280) {
                  var8 = var2.field1280;
               }

               for(var9 = 0; var9 < this.field3534.length; ++var9) {
                  var11.method2528(this.field3534[var9], var8[var9]);
               }
            }

            return var11;
         }
      }
   }

   public final class453 method2232() {
      int var2 = -1;
      if (this.field3546 != -1) {
         var2 = class10.method123(this.field3546);
      } else if (this.field3547 != -1) {
         var2 = class10.field107[this.field3547];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3542.length - 1) {
         var3 = this.field3542[var2];
      } else {
         var3 = this.field3542[this.field3542.length - 1];
      }

      return var3 != -1 ? method2242(var3) : null;
   }

   public boolean method2236() {
      if (null == this.field3542) {
         return true;
      } else {
         int var2 = -1;
         if (this.field3546 != -1) {
            var2 = class10.method123(this.field3546);
         } else if (this.field3547 != -1) {
            var2 = class10.field107[this.field3547];
         }

         if (var2 >= 0 && var2 < this.field3542.length) {
            return this.field3542[var2] != -1;
         } else {
            return this.field3542[this.field3542.length - 1] != -1;
         }
      }
   }

   public int method2241(int var1, int var2) {
      class197 var5 = this.field3528;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class118 var6 = (class118)var5.method1222((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field1481;
         }
      }

      return var4;
   }

   public String method2239(int var1, String var2) {
      class197 var5 = this.field3528;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class183 var6 = (class183)var5.method1222((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1815;
         }
      }

      return var4;
   }

   public boolean method2234() {
      return this.field3551 != null && this.field3549 != null;
   }

   public int[] method2235() {
      return this.field3551;
   }

   public int method2233(int var1) {
      return this.field3551 != null && var1 < this.field3551.length ? this.field3551[var1] : -1;
   }

   public short[] method2237() {
      return this.field3549;
   }

   public short method2238(int var1) {
      return null != this.field3549 && var1 < this.field3549.length ? this.field3549[var1] : -1;
   }

   public static class453 method2242(int var0) {
      class453 var2 = (class453)field3511.method1851((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field3509.method1629(9, var0);
         var2 = new class453();
         var2.field3513 = var0;
         if (null != var3) {
            var2.method2228(new class184(var3), (byte)61);
         }

         var2.method2227();
         field3511.method1850(var2, (long)var0);
         return var2;
      }
   }
}
