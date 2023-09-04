public class class430 extends class306 {
   public static class245 field3344 = new class245(256);
   public static class430[] field3342;
   public static class509 field3354;
   public static int field3343;
   static class534 field3365;
   static int field3364;
   byte[] field3362;
   int field3341 = Integer.MAX_VALUE;
   int field3347 = -1;
   int field3356 = Integer.MIN_VALUE;
   int field3357 = Integer.MAX_VALUE;
   int field3359 = Integer.MIN_VALUE;
   int[] field3358;
   int[] field3360;
   public boolean field3351 = true;
   public boolean field3352 = false;
   public class422 field3361;
   public class504 field3366;
   public int field3346 = -1;
   public int field3350 = 0;
   public int field3355;
   public int field3363;
   public String field3345;
   public String field3348;
   public String[] field3353 = new String[5];
   public final int field3349;

   public class430(int var1) {
      this.field3366 = class504.field4042;
      this.field3361 = class422.field2974;
      this.field3363 = -1;
      this.field3349 = var1;
   }

   public void method1998(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method1999(var1, var3);
      }
   }

   void method1999(class366 var1, int var2) {
      if (var2 == 1) {
         this.field3346 = var1.method1702();
      } else if (var2 == 2) {
         this.field3347 = var1.method1702();
      } else if (var2 == 3) {
         this.field3348 = var1.method1662();
      } else if (var2 == 4) {
         this.field3355 = var1.method1710();
      } else if (var2 == 5) {
         var1.method1710();
      } else if (var2 == 6) {
         this.field3350 = var1.method1654();
      } else {
         int var4;
         if (var2 == 7) {
            var4 = var1.method1654();
            if (0 == (var4 & 1)) {
               this.field3351 = false;
            }

            if (2 == (var4 & 2)) {
               this.field3352 = true;
            }
         } else if (var2 == 8) {
            var1.method1654();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field3353[var2 - 10] = var1.method1662();
         } else if (var2 == 15) {
            var4 = var1.method1654();
            this.field3360 = new int[var4 * 2];

            int var5;
            for(var5 = 0; var5 < var4 * 2; ++var5) {
               this.field3360[var5] = var1.method1656();
            }

            var1.method1658();
            var5 = var1.method1654();
            this.field3358 = new int[var5];

            int var6;
            for(var6 = 0; var6 < this.field3358.length; ++var6) {
               this.field3358[var6] = var1.method1658();
            }

            this.field3362 = new byte[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               this.field3362[var6] = var1.method1655();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field3345 = var1.method1662();
            } else if (var2 == 18) {
               var1.method1702();
            } else if (var2 == 19) {
               this.field3363 = var1.method1703();
            } else if (var2 == 21) {
               var1.method1658();
            } else if (var2 == 22) {
               var1.method1658();
            } else if (var2 == 23) {
               var1.method1654();
               var1.method1654();
               var1.method1654();
            } else if (var2 == 24) {
               var1.method1656();
               var1.method1656();
            } else if (var2 == 25) {
               var1.method1702();
            } else if (var2 == 28) {
               var1.method1654();
            } else if (var2 == 29) {
               this.field3366 = (class504)class1.method2(class504.method2398(), var1.method1654());
            } else if (var2 == 30) {
               this.field3361 = (class422)class1.method2(class422.method1949(), var1.method1654());
            }
         }
      }

   }

   public void method2000() {
      if (null != this.field3360) {
         for(int var2 = 0; var2 < this.field3360.length; var2 += 2) {
            if (this.field3360[var2] < this.field3341) {
               this.field3341 = this.field3360[var2];
            } else if (this.field3360[var2] > this.field3356) {
               this.field3356 = this.field3360[var2];
            }

            if (this.field3360[var2 + 1] < this.field3357) {
               this.field3357 = this.field3360[var2 + 1];
            } else if (this.field3360[var2 + 1] > this.field3359) {
               this.field3359 = this.field3360[var2 + 1];
            }
         }
      }

   }

   public class296 method2001(boolean var1) {
      int var3 = var1 ? this.field3347 : this.field3346;
      return this.method2002(var3);
   }

   class296 method2002(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class296 var3 = (class296)field3344.method1183((long)var1);
         if (var3 != null) {
            return var3;
         } else {
            var3 = class513.method2454(field3354, var1, 0);
            if (null != var3) {
               field3344.method1182(var3, (long)var1);
            }

            return var3;
         }
      }
   }

   public int method2003() {
      return this.field3349;
   }

   public static class430 method2005(int var0) {
      return var0 >= 0 && var0 < field3342.length && field3342[var0] != null ? field3342[var0] : new class430(var0);
   }

   public static class458 method2004(int var0, byte var1) {
      class458 var2 = (class458)class458.field3597.method1183((long)var0);
      if (null != var2) {
         if (var1 == -1) {
            throw new IllegalStateException();
         } else {
            return var2;
         }
      } else {
         byte[] var3 = class458.field3598.method2422(6, var0);
         var2 = new class458();
         var2.field3602 = var0;
         if (var3 != null) {
            var2.method2158(new class366(var3));
         }

         var2.method2148();
         if (var2.field3634) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            var2.field3612 = 0;
            var2.field3613 = false;
         }

         class458.field3597.method1182(var2, (long)var0);
         return var2;
      }
   }
}
