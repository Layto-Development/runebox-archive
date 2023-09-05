public class class449 extends class151 {
   public static boolean field3484 = false;
   public static class298 field3436;
   public static class298 field3438;
   public static class364 field3464 = new class364(500);
   static class364 field3437 = new class364(4096);
   static class364 field3440 = new class364(30);
   static class364 field3458 = new class364(30);
   static class533[] field3463 = new class533[4];
   boolean field3441;
   boolean field3465;
   boolean field3474;
   class197 field3485;
   int field3434;
   int field3447;
   int field3451;
   int field3455;
   int field3460;
   int field3470;
   int field3471;
   int field3472;
   int field3477;
   int field3478;
   int field3483;
   int[] field3443;
   int[] field3444;
   short[] field3446;
   short[] field3448;
   short[] field3449;
   short[] field3457;
   public boolean field3439;
   public boolean field3453;
   public boolean field3461;
   public boolean field3466;
   public boolean field3467;
   public int field3435;
   public int field3442;
   public int field3450;
   public int field3452;
   public int field3456;
   public int field3459;
   public int field3462;
   public int field3468;
   public int field3469;
   public int field3475;
   public int field3479;
   public int field3480;
   public int field3481;
   public int field3482;
   public int[] field3473;
   public int[] field3476;
   public String field3445;
   public String[] field3454;

   class449() {
      this.field3445 = class27.field544;
      this.field3450 = 1;
      this.field3435 = 1;
      this.field3452 = 2;
      this.field3453 = true;
      this.field3459 = -1;
      this.field3455 = -1;
      this.field3441 = false;
      this.field3461 = false;
      this.field3462 = -1;
      this.field3456 = 16;
      this.field3460 = 0;
      this.field3434 = 0;
      this.field3454 = new String[5];
      this.field3469 = -1;
      this.field3468 = -1;
      this.field3465 = false;
      this.field3466 = true;
      this.field3451 = 128;
      this.field3447 = 128;
      this.field3483 = 128;
      this.field3470 = 0;
      this.field3471 = 0;
      this.field3472 = 0;
      this.field3439 = false;
      this.field3474 = false;
      this.field3475 = -1;
      this.field3477 = -1;
      this.field3478 = -1;
      this.field3479 = -1;
      this.field3480 = 0;
      this.field3481 = 0;
      this.field3482 = 0;
      this.field3467 = true;
   }

   void method2208() {
      if (this.field3459 == -1) {
         this.field3459 = 0;
         if (this.field3443 != null && (null == this.field3444 || this.field3444[0] == 10)) {
            this.field3459 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (null != this.field3454[var2]) {
               this.field3459 = 1;
            }
         }
      }

      if (this.field3475 == -1) {
         this.field3475 = this.field3452 != 0 ? 1 : 0;
      }

   }

   void method2218(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2209(var1, var3);
      }
   }

   void method2209(class184 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.readUnsignedByte();
         if (var4 > 0) {
            if (null != this.field3443 && !field3484) {
               var1.field1818 += var4 * 3;
            } else {
               this.field3444 = new int[var4];
               this.field3443 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3443[var5] = var1.method1174();
                  this.field3444[var5] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.field3445 = var1.readString();
      } else if (var2 == 5) {
         var4 = var1.readUnsignedByte();
         if (var4 > 0) {
            if (null != this.field3443 && !field3484) {
               var1.field1818 += var4 * 2;
            } else {
               this.field3444 = null;
               this.field3443 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3443[var5] = var1.method1174();
               }
            }
         }
      } else if (var2 == 14) {
         this.field3450 = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.field3435 = var1.readUnsignedByte();
      } else if (var2 == 17) {
         this.field3452 = 0;
         this.field3453 = false;
      } else if (var2 == 18) {
         this.field3453 = false;
      } else if (var2 == 19) {
         this.field3459 = var1.readUnsignedByte();
      } else if (var2 == 21) {
         this.field3455 = 0;
      } else if (var2 == 22) {
         this.field3441 = true;
      } else if (var2 == 23) {
         this.field3461 = true;
      } else if (var2 == 24) {
         this.field3462 = var1.method1174();
         if (this.field3462 == 65535) {
            this.field3462 = -1;
         }
      } else if (var2 == 27) {
         this.field3452 = 1;
      } else if (var2 == 28) {
         this.field3456 = var1.readUnsignedByte();
      } else if (var2 == 29) {
         this.field3460 = var1.method1126();
      } else if (var2 == 39) {
         this.field3434 = var1.method1126() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field3454[var2 - 30] = var1.readString();
         if (this.field3454[var2 - 30].equalsIgnoreCase(class27.field486)) {
            this.field3454[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.readUnsignedByte();
         this.field3446 = new short[var4];
         this.field3457 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3446[var5] = (short)var1.method1174();
            this.field3457[var5] = (short)var1.method1174();
         }
      } else if (var2 == 41) {
         var4 = var1.readUnsignedByte();
         this.field3448 = new short[var4];
         this.field3449 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3448[var5] = (short)var1.method1174();
            this.field3449[var5] = (short)var1.method1174();
         }
      } else if (var2 == 61) {
         var1.method1174();
      } else if (var2 == 62) {
         this.field3465 = true;
      } else if (var2 == 64) {
         this.field3466 = false;
      } else if (var2 == 65) {
         this.field3451 = var1.method1174();
      } else if (var2 == 66) {
         this.field3447 = var1.method1174();
      } else if (var2 == 67) {
         this.field3483 = var1.method1174();
      } else if (var2 == 68) {
         this.field3468 = var1.method1174();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (var2 == 70) {
         this.field3470 = var1.method1127();
      } else if (var2 == 71) {
         this.field3471 = var1.method1127();
      } else if (var2 == 72) {
         this.field3472 = var1.method1127();
      } else if (var2 == 73) {
         this.field3439 = true;
      } else if (var2 == 74) {
         this.field3474 = true;
      } else if (var2 == 75) {
         this.field3475 = var1.readUnsignedByte();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field3479 = var1.method1174();
            this.field3480 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.field3481 = var1.method1174();
            this.field3482 = var1.method1174();
            this.field3480 = var1.readUnsignedByte();
            var4 = var1.readUnsignedByte();
            this.field3473 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3473[var5] = var1.method1174();
            }
         } else if (var2 == 81) {
            this.field3455 = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.field3469 = var1.method1174();
         } else if (var2 == 89) {
            this.field3467 = false;
         } else if (var2 == 249) {
            this.field3485 = class83.method717(var1, this.field3485);
         }
      } else {
         this.field3477 = var1.method1174();
         if (this.field3477 == 65535) {
            this.field3477 = -1;
         }

         this.field3478 = var1.method1174();
         if (this.field3478 == 65535) {
            this.field3478 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.method1174();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.readUnsignedByte();
         this.field3476 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3476[var6] = var1.method1174();
            if (this.field3476[var6] == 65535) {
               this.field3476[var6] = -1;
            }
         }

         this.field3476[var5 + 1] = var4;
      }

   }

   public final boolean method2210(int var1) {
      if (null != this.field3444) {
         for(int var5 = 0; var5 < this.field3444.length; ++var5) {
            if (this.field3444[var5] == var1) {
               return field3436.method1631(this.field3443[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field3443 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field3443.length; ++var4) {
            var3 &= field3436.method1631(this.field3443[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean method2211() {
      if (this.field3443 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3443.length; ++var3) {
            var2 &= field3436.method1631(this.field3443[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final class496 method2212(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.field3444) {
         var8 = (long)(var2 + (this.field3442 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field3442 << 10));
      }

      Object var10 = (class496)field3440.method1851(var8);
      if (null == var10) {
         class533 var11 = this.method2219(var1, var2);
         if (var11 == null) {
            return null;
         }

         if (!this.field3441) {
            var10 = var11.method2534(this.field3460 + 64, this.field3434 + 768, -50, -10, -50);
         } else {
            var11.field4217 = (short)(this.field3460 + 64);
            var11.field4206 = (short)(768 + this.field3434);
            var11.method2530();
            var10 = var11;
         }

         field3440.method1850((class151)var10, var8);
      }

      if (this.field3441) {
         var10 = ((class533)var10).method2519();
      }

      if (this.field3455 >= 0) {
         if (var10 instanceof class104) {
            var10 = ((class104)var10).method756(var3, var4, var5, var6, true, this.field3455);
         } else if (var10 instanceof class533) {
            var10 = ((class533)var10).method2520(var3, var4, var5, var6, true, this.field3455);
         }
      }

      return (class496)var10;
   }

   public final class104 method2214(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field3444 == null) {
         var8 = (long)(var2 + (this.field3442 << 10));
      } else {
         var8 = (long)(var2 + (this.field3442 << 10) + (var1 << 3));
      }

      class104 var10 = (class104)field3458.method1851(var8);
      if (null == var10) {
         class533 var11 = this.method2219(var1, var2);
         if (var11 == null) {
            return null;
         }

         var10 = var11.method2534(this.field3460 + 64, 768 + this.field3434, -50, -10, -50);
         field3458.method1850(var10, var8);
      }

      if (this.field3455 >= 0) {
         var10 = var10.method756(var3, var4, var5, var6, true, this.field3455);
      }

      return var10;
   }

   public final class104 method2213(int var1, int var2, int[][] var3, int var4, int var5, int var6, class157 var7, int var8) {
      long var10;
      if (this.field3444 == null) {
         var10 = (long)((this.field3442 << 10) + var2);
      } else {
         var10 = (long)((this.field3442 << 10) + (var1 << 3) + var2);
      }

      class104 var12 = (class104)field3458.method1851(var10);
      if (null == var12) {
         class533 var13 = this.method2219(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.method2534(this.field3460 + 64, 768 + this.field3434, -50, -10, -50);
         field3458.method1850(var12, var10);
      }

      if (var7 == null && this.field3455 == -1) {
         return var12;
      } else {
         if (var7 != null) {
            var12 = var7.method974(var12, var8, var2);
         } else {
            var12 = var12.method757(true);
         }

         if (this.field3455 >= 0) {
            var12 = var12.method756(var3, var4, var5, var6, false, this.field3455);
         }

         return var12;
      }
   }

   final class533 method2219(int var1, int var2) {
      class533 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.field3444 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field3443 == null) {
            return null;
         }

         var5 = this.field3465;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field3443.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field3443[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (class533)field3464.method1851((long)var8);
            if (var4 == null) {
               var4 = class533.method2538(field3436, var8 & '\uffff', 0);
               if (null == var4) {
                  return null;
               }

               if (var5) {
                  var4.method2527();
               }

               field3464.method1850(var4, (long)var8);
            }

            if (var6 > 1) {
               field3463[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class533(field3463, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.field3444.length; ++var6) {
            if (this.field3444[var6] == var1) {
               var9 = var6;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var6 = this.field3443[var9];
         boolean var10 = this.field3465 ^ var2 > 3;
         if (var10) {
            var6 += 65536;
         }

         var4 = (class533)field3464.method1851((long)var6);
         if (var4 == null) {
            var4 = class533.method2538(field3436, var6 & '\uffff', 0);
            if (null == var4) {
               return null;
            }

            if (var10) {
               var4.method2527();
            }

            field3464.method1850(var4, (long)var6);
         }
      }

      if (this.field3451 == 128 && this.field3447 == 128 && this.field3483 == 128) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (this.field3470 == 0 && this.field3471 == 0 && this.field3472 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      class533 var12 = new class533(var4, var2 == 0 && !var5 && !var11, this.field3446 == null, null == this.field3448, true);
      if (var1 == 4 && var2 > 3) {
         var12.method2525(256);
         var12.method2526(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var12.method2522();
      } else if (var2 == 2) {
         var12.method2523();
      } else if (var2 == 3) {
         var12.method2524();
      }

      if (null != this.field3446) {
         for(var8 = 0; var8 < this.field3446.length; ++var8) {
            var12.method2537(this.field3446[var8], this.field3457[var8]);
         }
      }

      if (this.field3448 != null) {
         for(var8 = 0; var8 < this.field3448.length; ++var8) {
            var12.method2528(this.field3448[var8], this.field3449[var8]);
         }
      }

      if (var5) {
         var12.method2529(this.field3451, this.field3447, this.field3483);
      }

      if (var11) {
         var12.method2526(this.field3470, this.field3471, this.field3472);
      }

      return var12;
   }

   public final class449 method2215() {
      int var2 = -1;
      if (this.field3477 != -1) {
         var2 = class10.method123(this.field3477);
      } else if (this.field3478 != -1) {
         var2 = class10.field107[this.field3478];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3476.length - 1) {
         var3 = this.field3476[var2];
      } else {
         var3 = this.field3476[this.field3476.length - 1];
      }

      return var3 != -1 ? class444.method2172(var3, (byte)25) : null;
   }

   public int method2216(int var1, int var2) {
      return class83.method716(this.field3485, var1, var2);
   }

   public String method2217(int var1, String var2) {
      class197 var5 = this.field3485;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class183 var6 = (class183)var5.method1222((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1815;
         }
      }

      return var4;
   }

   public boolean method2220() {
      if (this.field3476 == null) {
         return this.field3479 != -1 || this.field3473 != null;
      } else {
         for(int var2 = 0; var2 < this.field3476.length; ++var2) {
            if (this.field3476[var2] != -1) {
               class449 var3 = class444.method2172(this.field3476[var2], (byte)-30);
               if (var3.field3479 != -1 || var3.field3473 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
