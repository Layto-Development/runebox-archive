public class class458 extends class306 {
   public static boolean field3644 = false;
   public static class245 field3624 = new class245(500);
   public static class509 field3596;
   public static class509 field3598;
   static class245 field3597 = new class245(4096);
   static class245 field3600 = new class245(30);
   static class245 field3618 = new class245(30);
   static class327[] field3623 = new class327[4];
   boolean field3601;
   boolean field3625;
   boolean field3634;
   class524 field3645;
   int field3594;
   int field3607;
   int field3611;
   int field3615;
   int field3620;
   int field3630;
   int field3631;
   int field3632;
   int field3637;
   int field3638;
   int field3643;
   int[] field3603;
   int[] field3604;
   short[] field3606;
   short[] field3608;
   short[] field3609;
   short[] field3617;
   public boolean field3599;
   public boolean field3613;
   public boolean field3621;
   public boolean field3626;
   public boolean field3627;
   public int field3595;
   public int field3602;
   public int field3610;
   public int field3612;
   public int field3616;
   public int field3619;
   public int field3622;
   public int field3628;
   public int field3629;
   public int field3635;
   public int field3639;
   public int field3640;
   public int field3641;
   public int field3642;
   public int[] field3633;
   public int[] field3636;
   public String field3605;
   public String[] field3614;

   class458() {
      this.field3605 = class424.field3311;
      this.field3610 = 1;
      this.field3595 = 1;
      this.field3612 = 2;
      this.field3613 = true;
      this.field3619 = -1;
      this.field3615 = -1;
      this.field3601 = false;
      this.field3621 = false;
      this.field3622 = -1;
      this.field3616 = 16;
      this.field3620 = 0;
      this.field3594 = 0;
      this.field3614 = new String[5];
      this.field3629 = -1;
      this.field3628 = -1;
      this.field3625 = false;
      this.field3626 = true;
      this.field3611 = 128;
      this.field3607 = 128;
      this.field3643 = 128;
      this.field3630 = 0;
      this.field3631 = 0;
      this.field3632 = 0;
      this.field3599 = false;
      this.field3634 = false;
      this.field3635 = -1;
      this.field3637 = -1;
      this.field3638 = -1;
      this.field3639 = -1;
      this.field3640 = 0;
      this.field3641 = 0;
      this.field3642 = 0;
      this.field3627 = true;
   }

   void method2148() {
      if (-1 == this.field3619) {
         this.field3619 = 0;
         if (this.field3603 != null && (null == this.field3604 || 10 == this.field3604[0])) {
            this.field3619 = 1;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if (null != this.field3614[var2]) {
               this.field3619 = 1;
            }
         }
      }

      if (-1 == this.field3635) {
         this.field3635 = this.field3612 != 0 ? 1 : 0;
      }

   }

   void method2158(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method2149(var1, var3);
      }
   }

   void method2149(class366 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method1654();
         if (var4 > 0) {
            if (null != this.field3603 && !field3644) {
               var1.field2652 += var4 * 3;
            } else {
               this.field3604 = new int[var4];
               this.field3603 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3603[var5] = var1.method1703();
                  this.field3604[var5] = var1.method1654();
               }
            }
         }
      } else if (var2 == 2) {
         this.field3605 = var1.method1662();
      } else if (var2 == 5) {
         var4 = var1.method1654();
         if (var4 > 0) {
            if (null != this.field3603 && !field3644) {
               var1.field2652 += var4 * 2;
            } else {
               this.field3604 = null;
               this.field3603 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field3603[var5] = var1.method1703();
               }
            }
         }
      } else if (var2 == 14) {
         this.field3610 = var1.method1654();
      } else if (var2 == 15) {
         this.field3595 = var1.method1654();
      } else if (var2 == 17) {
         this.field3612 = 0;
         this.field3613 = false;
      } else if (var2 == 18) {
         this.field3613 = false;
      } else if (var2 == 19) {
         this.field3619 = var1.method1654();
      } else if (var2 == 21) {
         this.field3615 = 0;
      } else if (var2 == 22) {
         this.field3601 = true;
      } else if (var2 == 23) {
         this.field3621 = true;
      } else if (var2 == 24) {
         this.field3622 = var1.method1703();
         if (this.field3622 == 65535) {
            this.field3622 = -1;
         }
      } else if (var2 == 27) {
         this.field3612 = 1;
      } else if (var2 == 28) {
         this.field3616 = var1.method1654();
      } else if (var2 == 29) {
         this.field3620 = var1.method1655();
      } else if (var2 == 39) {
         this.field3594 = var1.method1655() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field3614[var2 - 30] = var1.method1662();
         if (this.field3614[var2 - 30].equalsIgnoreCase(class424.field3253)) {
            this.field3614[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var4 = var1.method1654();
         this.field3606 = new short[var4];
         this.field3617 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3606[var5] = (short)var1.method1703();
            this.field3617[var5] = (short)var1.method1703();
         }
      } else if (var2 == 41) {
         var4 = var1.method1654();
         this.field3608 = new short[var4];
         this.field3609 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3608[var5] = (short)var1.method1703();
            this.field3609[var5] = (short)var1.method1703();
         }
      } else if (var2 == 61) {
         var1.method1703();
      } else if (var2 == 62) {
         this.field3625 = true;
      } else if (var2 == 64) {
         this.field3626 = false;
      } else if (var2 == 65) {
         this.field3611 = var1.method1703();
      } else if (var2 == 66) {
         this.field3607 = var1.method1703();
      } else if (var2 == 67) {
         this.field3643 = var1.method1703();
      } else if (var2 == 68) {
         this.field3628 = var1.method1703();
      } else if (var2 == 69) {
         var1.method1654();
      } else if (var2 == 70) {
         this.field3630 = var1.method1656();
      } else if (var2 == 71) {
         this.field3631 = var1.method1656();
      } else if (var2 == 72) {
         this.field3632 = var1.method1656();
      } else if (var2 == 73) {
         this.field3599 = true;
      } else if (var2 == 74) {
         this.field3634 = true;
      } else if (var2 == 75) {
         this.field3635 = var1.method1654();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field3639 = var1.method1703();
            this.field3640 = var1.method1654();
         } else if (var2 == 79) {
            this.field3641 = var1.method1703();
            this.field3642 = var1.method1703();
            this.field3640 = var1.method1654();
            var4 = var1.method1654();
            this.field3633 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3633[var5] = var1.method1703();
            }
         } else if (var2 == 81) {
            this.field3615 = var1.method1654() * 256;
         } else if (var2 == 82) {
            this.field3629 = var1.method1703();
         } else if (var2 == 89) {
            this.field3627 = false;
         } else if (var2 == 249) {
            this.field3645 = class24.method121(var1, this.field3645);
         }
      } else {
         this.field3637 = var1.method1703();
         if (65535 == this.field3637) {
            this.field3637 = -1;
         }

         this.field3638 = var1.method1703();
         if (this.field3638 == 65535) {
            this.field3638 = -1;
         }

         var4 = -1;
         if (var2 == 92) {
            var4 = var1.method1703();
            if (var4 == 65535) {
               var4 = -1;
            }
         }

         var5 = var1.method1654();
         this.field3636 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            this.field3636[var6] = var1.method1703();
            if (65535 == this.field3636[var6]) {
               this.field3636[var6] = -1;
            }
         }

         this.field3636[var5 + 1] = var4;
      }

   }

   public final boolean method2150(int var1) {
      if (null != this.field3604) {
         for(int var5 = 0; var5 < this.field3604.length; ++var5) {
            if (this.field3604[var5] == var1) {
               return field3596.method2424(this.field3603[var5] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field3603 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.field3603.length; ++var4) {
            var3 &= field3596.method2424(this.field3603[var4] & '\uffff', 0);
         }

         return var3;
      }
   }

   public final boolean method2151() {
      if (this.field3603 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3603.length; ++var3) {
            var2 &= field3596.method2424(this.field3603[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final class165 method2152(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (null == this.field3604) {
         var8 = (long)(var2 + (this.field3602 << 10));
      } else {
         var8 = (long)(var2 + (var1 << 3) + (this.field3602 << 10));
      }

      Object var10 = (class165)field3600.method1183(var8);
      if (null == var10) {
         class327 var11 = this.method2159(var1, var2);
         if (var11 == null) {
            return null;
         }

         if (!this.field3601) {
            var10 = var11.method1510(this.field3620 + 64, this.field3594 + 768, -50, -10, -50);
         } else {
            var11.field2478 = (short)(this.field3620 + 64);
            var11.field2467 = (short)(768 + this.field3594);
            var11.method1506();
            var10 = var11;
         }

         field3600.method1182((class306)var10, var8);
      }

      if (this.field3601) {
         var10 = ((class327)var10).method1495();
      }

      if (this.field3615 >= 0) {
         if (var10 instanceof class485) {
            var10 = ((class485)var10).method2291(var3, var4, var5, var6, true, this.field3615);
         } else if (var10 instanceof class327) {
            var10 = ((class327)var10).method1496(var3, var4, var5, var6, true, this.field3615);
         }
      }

      return (class165)var10;
   }

   public final class485 method2154(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var8;
      if (this.field3604 == null) {
         var8 = (long)(var2 + (this.field3602 << 10));
      } else {
         var8 = (long)(var2 + (this.field3602 << 10) + (var1 << 3));
      }

      class485 var10 = (class485)field3618.method1183(var8);
      if (null == var10) {
         class327 var11 = this.method2159(var1, var2);
         if (var11 == null) {
            return null;
         }

         var10 = var11.method1510(this.field3620 + 64, 768 + this.field3594, -50, -10, -50);
         field3618.method1182(var10, var8);
      }

      if (this.field3615 >= 0) {
         var10 = var10.method2291(var3, var4, var5, var6, true, this.field3615);
      }

      return var10;
   }

   public final class485 method2153(int var1, int var2, int[][] var3, int var4, int var5, int var6, class464 var7, int var8) {
      long var10;
      if (this.field3604 == null) {
         var10 = (long)((this.field3602 << 10) + var2);
      } else {
         var10 = (long)((this.field3602 << 10) + (var1 << 3) + var2);
      }

      class485 var12 = (class485)field3618.method1183(var10);
      if (null == var12) {
         class327 var13 = this.method2159(var1, var2);
         if (var13 == null) {
            return null;
         }

         var12 = var13.method1510(this.field3620 + 64, 768 + this.field3594, -50, -10, -50);
         field3618.method1182(var12, var10);
      }

      if (var7 == null && this.field3615 == -1) {
         return var12;
      } else {
         if (var7 != null) {
            var12 = var7.method2190(var12, var8, var2);
         } else {
            var12 = var12.method2292(true);
         }

         if (this.field3615 >= 0) {
            var12 = var12.method2291(var3, var4, var5, var6, false, this.field3615);
         }

         return var12;
      }
   }

   final class327 method2159(int var1, int var2) {
      class327 var4 = null;
      boolean var5;
      int var6;
      int var8;
      if (this.field3604 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field3603 == null) {
            return null;
         }

         var5 = this.field3625;
         if (var1 == 2 && var2 > 3) {
            var5 = !var5;
         }

         var6 = this.field3603.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            var8 = this.field3603[var7];
            if (var5) {
               var8 += 65536;
            }

            var4 = (class327)field3624.method1183((long)var8);
            if (var4 == null) {
               var4 = class327.method1514(field3596, var8 & '\uffff', 0);
               if (null == var4) {
                  return null;
               }

               if (var5) {
                  var4.method1503();
               }

               field3624.method1182(var4, (long)var8);
            }

            if (var6 > 1) {
               field3623[var7] = var4;
            }
         }

         if (var6 > 1) {
            var4 = new class327(field3623, var6);
         }
      } else {
         int var9 = -1;

         for(var6 = 0; var6 < this.field3604.length; ++var6) {
            if (this.field3604[var6] == var1) {
               var9 = var6;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var6 = this.field3603[var9];
         boolean var10 = this.field3625 ^ var2 > 3;
         if (var10) {
            var6 += 65536;
         }

         var4 = (class327)field3624.method1183((long)var6);
         if (var4 == null) {
            var4 = class327.method1514(field3596, var6 & '\uffff', 0);
            if (null == var4) {
               return null;
            }

            if (var10) {
               var4.method1503();
            }

            field3624.method1182(var4, (long)var6);
         }
      }

      if (128 == this.field3611 && this.field3607 == 128 && 128 == this.field3643) {
         var5 = false;
      } else {
         var5 = true;
      }

      boolean var11;
      if (this.field3630 == 0 && this.field3631 == 0 && this.field3632 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      class327 var12 = new class327(var4, var2 == 0 && !var5 && !var11, this.field3606 == null, null == this.field3608, true);
      if (var1 == 4 && var2 > 3) {
         var12.method1501(256);
         var12.method1502(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var12.method1498();
      } else if (var2 == 2) {
         var12.method1499();
      } else if (var2 == 3) {
         var12.method1500();
      }

      if (null != this.field3606) {
         for(var8 = 0; var8 < this.field3606.length; ++var8) {
            var12.method1513(this.field3606[var8], this.field3617[var8]);
         }
      }

      if (this.field3608 != null) {
         for(var8 = 0; var8 < this.field3608.length; ++var8) {
            var12.method1504(this.field3608[var8], this.field3609[var8]);
         }
      }

      if (var5) {
         var12.method1505(this.field3611, this.field3607, this.field3643);
      }

      if (var11) {
         var12.method1502(this.field3630, this.field3631, this.field3632);
      }

      return var12;
   }

   public final class458 method2155() {
      int var2 = -1;
      if (-1 != this.field3637) {
         var2 = class486.method2324(this.field3637);
      } else if (-1 != this.field3638) {
         var2 = class486.field3907[this.field3638];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field3636.length - 1) {
         var3 = this.field3636[var2];
      } else {
         var3 = this.field3636[this.field3636.length - 1];
      }

      return var3 != -1 ? class430.method2004(var3, (byte)25) : null;
   }

   public int method2156(int var1, int var2) {
      return class24.method120(this.field3645, var1, var2);
   }

   public String method2157(int var1, String var2) {
      class524 var5 = this.field3645;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class88 var6 = (class88)var5.method2509((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field608;
         }
      }

      return var4;
   }

   public boolean method2160() {
      if (this.field3636 == null) {
         return -1 != this.field3639 || this.field3633 != null;
      } else {
         for(int var2 = 0; var2 < this.field3636.length; ++var2) {
            if (this.field3636[var2] != -1) {
               class458 var3 = class430.method2004(this.field3636[var2], (byte)-30);
               if (-1 != var3.field3639 || var3.field3633 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
