public class class90 extends class306 {
   public static class245 field613 = new class245(64);
   public static class245 field619 = new class245(50);
   public static class509 field611;
   public static class509 field612;
   static int field647;
   class524 field630;
   int field633;
   int field641;
   int field642;
   int field645;
   int field648;
   int field649;
   int[] field618;
   int[] field634;
   int[] field653;
   short[] field636;
   short[] field651;
   short[] field656;
   public boolean field610;
   public boolean field639;
   public boolean field643;
   public boolean field650;
   public boolean field652;
   public int field615;
   public int field617;
   public int field620;
   public int field621;
   public int field622;
   public int field623;
   public int field624;
   public int field625;
   public int field626;
   public int field627;
   public int field628;
   public int field629;
   public int field632;
   public int field637;
   public int field638;
   public int field640;
   public int field646;
   public int field654;
   public int field655;
   public int[] field644;
   public String field616;
   public String[] field614;
   public short[] field631;
   public short[] field635;

   class90() {
      this.field616 = class424.field3311;
      this.field617 = 1;
      this.field620 = -1;
      this.field621 = -1;
      this.field622 = -1;
      this.field637 = -1;
      this.field624 = -1;
      this.field625 = -1;
      this.field626 = -1;
      this.field627 = -1;
      this.field628 = -1;
      this.field629 = -1;
      this.field654 = -1;
      this.field623 = -1;
      this.field632 = -1;
      this.field638 = -1;
      this.field655 = -1;
      this.field614 = new String[5];
      this.field639 = true;
      this.field640 = -1;
      this.field641 = 128;
      this.field633 = 128;
      this.field643 = false;
      this.field642 = 0;
      this.field645 = 0;
      this.field646 = 32;
      this.field648 = -1;
      this.field649 = -1;
      this.field650 = true;
      this.field610 = true;
      this.field652 = false;
      this.field653 = null;
      this.field651 = null;
   }

   void method344() {
   }

   void method345(class366 var1, byte var2) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            }

            return;
         }

         this.method346(var1, var3);
      }
   }

   void method346(class366 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method1654();
         this.field634 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field634[var5] = var1.method1703();
         }
      } else if (var2 == 2) {
         this.field616 = var1.method1662();
      } else if (var2 == 12) {
         this.field617 = var1.method1654();
      } else if (var2 == 13) {
         this.field620 = var1.method1703();
      } else if (var2 == 14) {
         this.field637 = var1.method1703();
      } else if (var2 == 15) {
         this.field621 = var1.method1703();
      } else if (var2 == 16) {
         this.field622 = var1.method1703();
      } else if (var2 == 17) {
         this.field637 = var1.method1703();
         this.field624 = var1.method1703();
         this.field625 = var1.method1703();
         this.field626 = var1.method1703();
      } else if (var2 == 18) {
         var1.method1703();
      } else if (var2 >= 30 && var2 < 35) {
         this.field614[var2 - 30] = var1.method1662();
         if (this.field614[var2 - 30].equalsIgnoreCase(class424.field3253)) {
            this.field614[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method1654();
         this.field656 = new short[var4];
         this.field635 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field656[var5] = (short)var1.method1703();
            this.field635[var5] = (short)var1.method1703();
         }
      } else if (var2 == 41) {
         var4 = var1.method1654();
         this.field636 = new short[var4];
         this.field631 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field636[var5] = (short)var1.method1703();
            this.field631[var5] = (short)var1.method1703();
         }
      } else if (var2 == 60) {
         var4 = var1.method1654();
         this.field618 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field618[var5] = var1.method1703();
         }
      } else if (var2 == 93) {
         this.field639 = false;
      } else if (var2 == 95) {
         this.field640 = var1.method1703();
      } else if (var2 == 97) {
         this.field641 = var1.method1703();
      } else if (var2 == 98) {
         this.field633 = var1.method1703();
      } else if (var2 == 99) {
         this.field643 = true;
      } else if (var2 == 100) {
         this.field642 = var1.method1655();
      } else if (var2 == 101) {
         this.field645 = var1.method1655() * 5;
      } else {
         int var6;
         if (var2 == 102) {
            var4 = var1.method1654();
            var5 = 0;

            for(var6 = var4; var6 != 0; var6 >>= 1) {
               ++var5;
            }

            this.field653 = new int[var5];
            this.field651 = new short[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               if (0 == (var4 & 1 << var7)) {
                  this.field653[var7] = -1;
                  this.field651[var7] = -1;
               } else {
                  this.field653[var7] = var1.method1702();
                  this.field651[var7] = (short)var1.method1666();
               }
            }
         } else if (var2 == 103) {
            this.field646 = var1.method1703();
         } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
               this.field650 = false;
            } else if (var2 == 109) {
               this.field610 = false;
            } else if (var2 == 111) {
               this.field652 = true;
            } else if (var2 == 114) {
               this.field627 = var1.method1703();
            } else if (var2 == 115) {
               this.field627 = var1.method1703();
               this.field628 = var1.method1703();
               this.field629 = var1.method1703();
               this.field654 = var1.method1703();
            } else if (var2 == 116) {
               this.field623 = var1.method1703();
            } else if (var2 == 117) {
               this.field623 = var1.method1703();
               this.field632 = var1.method1703();
               this.field638 = var1.method1703();
               this.field655 = var1.method1703();
            } else if (var2 == 249) {
               this.field630 = class24.method121(var1, this.field630);
            }
         } else {
            this.field648 = var1.method1703();
            if (65535 == this.field648) {
               this.field648 = -1;
            }

            this.field649 = var1.method1703();
            if (65535 == this.field649) {
               this.field649 = -1;
            }

            var4 = -1;
            if (var2 == 118) {
               var4 = var1.method1703();
               if (var4 == 65535) {
                  var4 = -1;
               }
            }

            var5 = var1.method1654();
            this.field644 = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.field644[var6] = var1.method1703();
               if (this.field644[var6] == 65535) {
                  this.field644[var6] = -1;
               }
            }

            this.field644[var5 + 1] = var4;
         }
      }

   }

   public final class485 method347(class464 var1, int var2, class464 var3, int var4, class350 var5) {
      if (null != this.field644) {
         class90 var12 = this.method349();
         return null == var12 ? null : var12.method347(var1, var2, var3, var4, var5);
      } else {
         long var7 = (long)this.field615;
         if (var5 != null) {
            var7 |= var5.field2572 << 16;
         }

         class485 var9 = (class485)field619.method1183(var7);
         if (var9 == null) {
            class327 var10 = this.method357(this.field634, var5);
            if (null == var10) {
               return null;
            }

            var9 = var10.method1510(this.field642 + 64, this.field645 + 850, -30, -50, -30);
            field619.method1182(var9, var7);
         }

         class485 var11;
         if (var1 != null && var3 != null) {
            var11 = var1.method2193(var9, var2, var3, var4);
         } else if (null != var1) {
            var11 = var1.method2191(var9, var2);
         } else if (var3 != null) {
            var11 = var3.method2191(var9, var4);
         } else {
            var11 = var9.method2292(true);
         }

         if (128 != this.field641 || 128 != this.field633) {
            var11.method2306(this.field641, this.field633, this.field641);
         }

         return var11;
      }
   }

   public final class327 method348(class350 var1) {
      if (null != this.field644) {
         class90 var3 = this.method349();
         return null == var3 ? null : var3.method348(var1);
      } else {
         return this.method357(this.field618, var1);
      }
   }

   class327 method357(int[] var1, class350 var2) {
      int[] var4 = var1;
      if (var2 != null && null != var2.field2570) {
         var4 = var2.field2570;
      }

      if (var4 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (var4[var6] != -1 && !field612.method2424(var4[var6], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            class327[] var10 = new class327[var4.length];

            for(int var7 = 0; var7 < var4.length; ++var7) {
               var10[var7] = class327.method1514(field612, var4[var7], 0);
            }

            class327 var11;
            if (1 == var10.length) {
               var11 = var10[0];
               if (var11 == null) {
                  var11 = new class327(var10, var10.length);
               }
            } else {
               var11 = new class327(var10, var10.length);
            }

            short[] var8;
            int var9;
            if (this.field656 != null) {
               var8 = this.field635;
               if (var2 != null && null != var2.field2571) {
                  var8 = var2.field2571;
               }

               for(var9 = 0; var9 < this.field656.length; ++var9) {
                  var11.method1513(this.field656[var9], var8[var9]);
               }
            }

            if (this.field636 != null) {
               var8 = this.field631;
               if (var2 != null && null != var2.field2573) {
                  var8 = var2.field2573;
               }

               for(var9 = 0; var9 < this.field636.length; ++var9) {
                  var11.method1504(this.field636[var9], var8[var9]);
               }
            }

            return var11;
         }
      }
   }

   public final class90 method349() {
      int var2 = -1;
      if (-1 != this.field648) {
         var2 = class486.method2324(this.field648);
      } else if (this.field649 != -1) {
         var2 = class486.field3907[this.field649];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field644.length - 1) {
         var3 = this.field644[var2];
      } else {
         var3 = this.field644[this.field644.length - 1];
      }

      return var3 != -1 ? method359(var3) : null;
   }

   public boolean method353() {
      if (null == this.field644) {
         return true;
      } else {
         int var2 = -1;
         if (this.field648 != -1) {
            var2 = class486.method2324(this.field648);
         } else if (-1 != this.field649) {
            var2 = class486.field3907[this.field649];
         }

         if (var2 >= 0 && var2 < this.field644.length) {
            return -1 != this.field644[var2];
         } else {
            return -1 != this.field644[this.field644.length - 1];
         }
      }
   }

   public int method358(int var1, int var2) {
      class524 var5 = this.field630;
      int var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class323 var6 = (class323)var5.method2509((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = var6.field2304;
         }
      }

      return var4;
   }

   public String method356(int var1, String var2) {
      class524 var5 = this.field630;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class88 var6 = (class88)var5.method2509((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field608;
         }
      }

      return var4;
   }

   public boolean method351() {
      return this.field653 != null && this.field651 != null;
   }

   public int[] method352() {
      return this.field653;
   }

   public int method350(int var1) {
      return this.field653 != null && var1 < this.field653.length ? this.field653[var1] : -1;
   }

   public short[] method354() {
      return this.field651;
   }

   public short method355(int var1) {
      return null != this.field651 && var1 < this.field651.length ? this.field651[var1] : -1;
   }

   public static class90 method359(int var0) {
      class90 var2 = (class90)field613.method1183((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field611.method2422(9, var0);
         var2 = new class90();
         var2.field615 = var0;
         if (null != var3) {
            var2.method345(new class366(var3), (byte)61);
         }

         var2.method344();
         field613.method1182(var2, (long)var0);
         return var2;
      }
   }
}
