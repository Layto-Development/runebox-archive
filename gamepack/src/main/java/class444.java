public class class444 extends class151 {
   public static class298 field3375;
   public static class364 field3365 = new class364(256);
   public static class444[] field3363;
   public static int field3364;
   static class22 field3386;
   static int field3385;
   byte[] field3383;
   int field3362 = Integer.MAX_VALUE;
   int field3368 = -1;
   int field3377 = Integer.MIN_VALUE;
   int field3378 = Integer.MAX_VALUE;
   int field3380 = Integer.MIN_VALUE;
   int[] field3379;
   int[] field3381;
   public boolean field3372 = true;
   public boolean field3373 = false;
   public class132 field3382;
   public class77 field3387;
   public int field3367 = -1;
   public int field3371 = 0;
   public int field3376;
   public int field3384;
   public String field3366;
   public String field3369;
   public String[] field3374 = new String[5];
   public final int field3370;

   public class444(int var1) {
      this.field3387 = class77.field1239;
      this.field3382 = class132.field1558;
      this.field3384 = -1;
      this.field3370 = var1;
   }

   public void method2166(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         this.method2167(var1, var3);
      }
   }

   void method2167(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3367 = var1.method1173();
      } else if (var2 == 2) {
         this.field3368 = var1.method1173();
      } else if (var2 == 3) {
         this.field3369 = var1.method1133();
      } else if (var2 == 4) {
         this.field3376 = var1.method1181();
      } else if (var2 == 5) {
         var1.method1181();
      } else if (var2 == 6) {
         this.field3371 = var1.method1125();
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.method1125();
            if ((var4 & 1) == 0) {
               this.field3372 = false;
            }

            if ((var4 & 2) == 2) {
               this.field3373 = true;
            }
         } else if (var2 == 8) {
            var1.method1125();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field3374[var2 - 10] = var1.method1133();
         } else if (var2 == 15) {
            var4 = var1.method1125();
            this.field3381 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field3381[var5] = var1.method1127();
            }

            var1.method1129();
            var5 = var1.method1125();
            this.field3379 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field3379.length; ++var6) {
               this.field3379[var6] = var1.method1129();
            }

            this.field3383 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field3383[var6] = var1.method1126();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field3366 = var1.method1133();
            } else if (var2 == 18) {
               var1.method1173();
            } else if (var2 == 19) {
               this.field3384 = var1.method1174();
            } else if (var2 == 21) {
               var1.method1129();
            } else if (var2 == 22) {
               var1.method1129();
            } else if (var2 == 23) {
               var1.method1125();
               var1.method1125();
               var1.method1125();
            } else if (var2 == 24) {
               var1.method1127();
               var1.method1127();
            } else if (var2 == 25) {
               var1.method1173();
            } else if (var2 == 28) {
               var1.method1125();
            } else if (var2 == 29) {
               this.field3387 = (class77)class341.method1788(class77.method699(), var1.method1125());
            } else if (var2 == 30) {
               this.field3382 = (class132)class341.method1788(class132.method892(), var1.method1125());
            }
         }
      }

   }

   public void method2168() {
      if (null != this.field3381) {
         for(int var2 = 0; var2 < this.field3381.length; var2 += 2) {
            if (this.field3381[var2] < this.field3362) {
               this.field3362 = this.field3381[var2];
            } else if (this.field3381[var2] > this.field3377) {
               this.field3377 = this.field3381[var2];
            }

            if (this.field3381[var2 + 1] < this.field3378) {
               this.field3378 = this.field3381[var2 + 1];
            } else if (this.field3381[var2 + 1] > this.field3380) {
               this.field3380 = this.field3381[var2 + 1];
            }
         }
      }

   }

   public class427 method2169(boolean var1) {
      int var3 = var1 ? this.field3368 : this.field3367;
      return this.method2170(var3);
   }

   class427 method2170(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class427 var3 = (class427)field3365.method1851((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class526.method2492(field3375, var1, 0);
            if (null != var3) {
               field3365.method1850(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   public int method2171() {
      return this.field3370;
   }

   public static class444 method2173(int var0) {
      return var0 >= 0 && var0 < field3363.length && field3363[var0] != null ? field3363[var0] : new class444(var0);
   }

   public static class449 method2172(int var0, byte var1) {
      class449 var2 = (class449)class449.field3437.method1851((long)var0);
      if (null != var2) {
         if (var1 == -1) {
            throw new IllegalStateException();
         } else {
            return var2;
         }
      } else {
         byte[] var3 = class449.field3438.method1629(6, var0);
         var2 = new class449();
         var2.field3442 = var0;
         if (var3 != null) {
            var2.method2218(new class184(var3));
         }

         var2.method2208();
         if (var2.field3474) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            var2.field3452 = 0;
            var2.field3453 = false;
         }

         class449.field3437.method1850(var2, (long)var0);
         return var2;
      }
   }
}
