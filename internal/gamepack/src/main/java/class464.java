import java.util.HashMap;
import java.util.Map;

public class class464 extends class306 {
   public static class245 field3668 = new class245(100);
   public static class245 field3676 = new class245(100);
   public static class245 field3677 = new class245(64);
   static boolean field3666 = false;
   boolean[] field3671;
   int field3672 = 0;
   int field3673 = 0;
   int[] field3675;
   int[] field3680;
   public boolean field3681 = false;
   public boolean field3686 = false;
   public int field3667 = 99;
   public int field3670 = -1;
   public int field3678 = -1;
   public int field3679 = -1;
   public int field3682 = 5;
   public int field3684 = -1;
   public int field3687 = -1;
   public int field3688 = -1;
   public int field3689 = 2;
   public int[] field3669;
   public int[] field3674;
   public int[] field3685;
   public Map field3683;

   class464() {
   }

   void method2188(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method2189(var1, var3);
      }
   }

   void method2189(class366 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method1703();
         this.field3685 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3685[var5] = var1.method1703();
         }

         this.field3674 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3674[var5] = var1.method1703();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3674[var5] += var1.method1703() << 16;
         }
      } else if (var2 == 2) {
         this.field3678 = var1.method1703();
      } else if (var2 == 3) {
         var4 = var1.method1654();
         this.field3680 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3680[var5] = var1.method1654();
         }

         this.field3680[var4] = 9999999;
      } else if (var2 == 4) {
         this.field3681 = true;
      } else if (var2 == 5) {
         this.field3682 = var1.method1654();
      } else if (var2 == 6) {
         this.field3679 = var1.method1703();
      } else if (var2 == 7) {
         this.field3684 = var1.method1703();
      } else if (var2 == 8) {
         this.field3667 = var1.method1654();
         this.field3686 = true;
      } else if (var2 == 9) {
         this.field3687 = var1.method1654();
      } else if (var2 == 10) {
         this.field3688 = var1.method1654();
      } else if (var2 == 11) {
         this.field3689 = var1.method1654();
      } else if (var2 == 12) {
         var4 = var1.method1654();
         this.field3675 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3675[var5] = var1.method1703();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3675[var5] += var1.method1703() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.method1654();
         this.field3669 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3669[var5] = var1.method1710();
         }
      } else if (var2 == 14) {
         this.field3670 = var1.method1658();
      } else if (var2 == 15) {
         var4 = var1.method1703();
         this.field3683 = new HashMap();

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method1703();
            int var7 = var1.method1710();
            this.field3683.put(var6, var7);
         }
      } else if (var2 == 16) {
         this.field3672 = var1.method1703();
         this.field3673 = var1.method1703();
      } else if (var2 == 17) {
         this.field3671 = new boolean[256];

         for(var4 = 0; var4 < this.field3671.length; ++var4) {
            this.field3671[var4] = false;
         }

         var4 = var1.method1654();

         for(var5 = 0; var5 < var4; ++var5) {
            this.field3671[var1.method1654()] = true;
         }
      }

   }

   void method2198() {
      if (this.field3687 == -1) {
         if (this.field3680 == null && null == this.field3671) {
            this.field3687 = 0;
         } else {
            this.field3687 = 2;
         }
      }

      if (-1 == this.field3688) {
         if (null == this.field3680 && this.field3671 == null) {
            this.field3688 = 0;
         } else {
            this.field3688 = 2;
         }
      }

   }

   public class485 method2191(class485 var1, int var2) {
      class485 var5;
      if (!this.method2199()) {
         var2 = this.field3674[var2];
         class492 var6 = method2203(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method2292(true);
         } else {
            var5 = var1.method2292(!var6.method2329(var2));
            var5.method2317(var6, var2);
            return var5;
         }
      } else {
         class272 var4 = method2201(this.field3670);
         if (null == var4) {
            return var1.method2292(true);
         } else {
            var5 = var1.method2292(!var4.method1276());
            var5.method2297(var4, var2);
            return var5;
         }
      }
   }

   class485 method2190(class485 var1, int var2, int var3) {
      class485 var6;
      if (!this.method2199()) {
         var2 = this.field3674[var2];
         class492 var7 = method2203(var2 >> 16);
         var2 &= 65535;
         if (null == var7) {
            return var1.method2292(true);
         } else {
            var6 = var1.method2292(!var7.method2329(var2));
            var3 &= 3;
            if (var3 == 1) {
               var6.method2305();
            } else if (var3 == 2) {
               var6.method2304();
            } else if (var3 == 3) {
               var6.method2303();
            }

            var6.method2317(var7, var2);
            if (var3 == 1) {
               var6.method2303();
            } else if (var3 == 2) {
               var6.method2304();
            } else if (var3 == 3) {
               var6.method2305();
            }

            return var6;
         }
      } else {
         class272 var5 = method2201(this.field3670);
         if (null == var5) {
            return var1.method2292(true);
         } else {
            var6 = var1.method2292(!var5.method1276());
            var3 &= 3;
            if (var3 == 1) {
               var6.method2305();
            } else if (var3 == 2) {
               var6.method2304();
            } else if (var3 == 3) {
               var6.method2303();
            }

            var6.method2297(var5, var2);
            if (var3 == 1) {
               var6.method2303();
            } else if (var3 == 2) {
               var6.method2304();
            } else if (var3 == 3) {
               var6.method2305();
            }

            return var6;
         }
      }
   }

   class485 method2192(class485 var1, int var2) {
      class485 var5;
      if (!this.method2199()) {
         var2 = this.field3674[var2];
         class492 var6 = method2203(var2 >> 16);
         var2 &= 65535;
         if (null == var6) {
            return var1.method2318(true);
         } else {
            var5 = var1.method2318(!var6.method2329(var2));
            var5.method2317(var6, var2);
            return var5;
         }
      } else {
         class272 var4 = method2201(this.field3670);
         if (var4 == null) {
            return var1.method2318(true);
         } else {
            var5 = var1.method2318(!var4.method1276());
            var5.method2297(var4, var2);
            return var5;
         }
      }
   }

   public class485 method2193(class485 var1, int var2, class464 var3, int var4) {
      if (field3666 && !this.method2199() && !var3.method2199()) {
         return this.method2194(var1, var2, var3, var4);
      } else {
         class485 var6 = var1.method2292(false);
         boolean var7 = false;
         class492 var8 = null;
         class344 var9 = null;
         class272 var10;
         if (this.method2199()) {
            var10 = this.method2197();
            if (var10 == null) {
               return var6;
            }

            if (var3.method2199() && null == this.field3671) {
               var6.method2297(var10, var2);
               return var6;
            }

            var9 = var10.field1910;
            var6.method2300(var9, var10, var2, this.field3671, false, !var3.method2199());
         } else {
            var2 = this.field3674[var2];
            var8 = method2203(var2 >> 16);
            var2 &= 65535;
            if (null == var8) {
               return var3.method2191(var1, var4);
            }

            if (!var3.method2199() && (null == this.field3680 || var4 == -1)) {
               var6.method2317(var8, var2);
               return var6;
            }

            if (null == this.field3680 || var4 == -1) {
               var6.method2317(var8, var2);
               return var6;
            }

            var7 = var3.method2199();
            if (!var7) {
               var6.method2301(var8, var2, this.field3680, false);
            }
         }

         if (var3.method2199()) {
            var10 = var3.method2197();
            if (var10 == null) {
               return var6;
            }

            if (null == var9) {
               var9 = var10.field1910;
            }

            var6.method2300(var9, var10, var4, this.field3671, true, true);
         } else {
            var4 = var3.field3674[var4];
            class492 var11 = method2203(var4 >> 16);
            var4 &= 65535;
            if (var11 == null) {
               return this.method2191(var1, var2);
            }

            var6.method2301(var11, var4, this.field3680, true);
         }

         if (var7 && var8 != null) {
            var6.method2301(var8, var2, this.field3680, false);
         }

         var6.method2296();
         return var6;
      }
   }

   class485 method2194(class485 var1, int var2, class464 var3, int var4) {
      var2 = this.field3674[var2];
      class492 var6 = method2203(var2 >> 16);
      var2 &= 65535;
      if (null == var6) {
         return var3.method2191(var1, var4);
      } else {
         var4 = var3.field3674[var4];
         class492 var7 = method2203(var4 >> 16);
         var4 &= 65535;
         class485 var8;
         if (var7 == null) {
            var8 = var1.method2292(!var6.method2329(var2));
            var8.method2317(var6, var2);
            return var8;
         } else {
            var8 = var1.method2292(!var6.method2329(var2) & !var7.method2329(var4));
            var8.method2309(var6, var2, var7, var4, this.field3680);
            return var8;
         }
      }
   }

   public class485 method2195(class485 var1, int var2) {
      if (!this.method2199()) {
         int var4 = this.field3674[var2];
         class492 var5 = method2203(var4 >> 16);
         var4 &= 65535;
         if (null == var5) {
            return var1.method2292(true);
         } else {
            class492 var6 = null;
            int var7 = 0;
            if (this.field3675 != null && var2 < this.field3675.length) {
               var7 = this.field3675[var2];
               var6 = method2203(var7 >> 16);
               var7 &= 65535;
            }

            class485 var8;
            if (null != var6 && var7 != 65535) {
               var8 = var1.method2292(!var5.method2329(var4) & !var6.method2329(var7));
               var8.method2317(var5, var4);
               var8.method2317(var6, var7);
               return var8;
            } else {
               var8 = var1.method2292(!var5.method2329(var4));
               var8.method2317(var5, var4);
               return var8;
            }
         }
      } else {
         return this.method2191(var1, var2);
      }
   }

   public boolean method2199() {
      return this.field3670 >= 0;
   }

   public int method2196() {
      return this.field3673 - this.field3672;
   }

   class272 method2197() {
      return this.method2199() ? method2201(this.field3670) : null;
   }

   public static void method2202(class509 var0, class509 var1, class509 var2) {
      class91.field658 = var0;
      class107.field703 = var1;
      class510.field4079 = var2;
   }

   public static class464 method2200(int var0) {
      class464 var2 = (class464)field3677.method1183((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class91.field658.method2422(12, var0);
         var2 = new class464();
         if (var3 != null) {
            var2.method2188(new class366(var3));
         }

         var2.method2198();
         field3677.method1182(var2, (long)var0);
         return var2;
      }
   }

   static class492 method2203(int var0) {
      class492 var2 = (class492)field3668.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         var2 = class492.method2330(class107.field703, class510.field4079, var0, false);
         if (var2 != null) {
            field3668.method1182(var2, (long)var0);
         }

         return var2;
      }
   }

   static class272 method2201(int var0) {
      return class142.method535(var0, (byte)6) != 0 ? null : class130.method483(var0);
   }
}
