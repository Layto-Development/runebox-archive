public class class47 extends class306 {
   public static boolean field360;
   public static class245 field361 = new class245(64);
   public static class245 field363 = new class245(200);
   public static class245 field406 = new class245(50);
   public static class509 field359;
   static int[] field412;
   class524 field407;
   int field364;
   int field365;
   int field373;
   int field383;
   int field384;
   int field385;
   int field386;
   int field387;
   int field388;
   int field389;
   int field390;
   int field391;
   int field392;
   int field394;
   int field395;
   int field400;
   int field401;
   int field402;
   int field409;
   int field410;
   int[] field396;
   int[] field397;
   public boolean field368;
   public boolean field408;
   public int field356;
   public int field357;
   public int field358;
   public int field362;
   public int field366;
   public int field370;
   public int field371;
   public int field372;
   public int field374;
   public int field375;
   public int field376;
   public int field377;
   public int field378;
   public int field379;
   public int field398;
   public int field403;
   public int field404;
   public int field405;
   public int field411;
   public String field380;
   public String[] field381;
   public String[] field382;
   public short[] field367;
   public short[] field369;
   public short[] field393;
   public short[] field399;

   class47() {
      this.field380 = class424.field3311;
      this.field379 = 2000;
      this.field356 = 0;
      this.field372 = 0;
      this.field358 = 0;
      this.field357 = 0;
      this.field374 = 0;
      this.field375 = 0;
      this.field376 = 1;
      this.field377 = -1;
      this.field362 = -1;
      this.field378 = -1;
      this.field368 = false;
      this.field381 = new String[]{null, null, class424.field3164, null, null};
      this.field382 = new String[]{null, null, null, null, class424.field3173};
      this.field383 = -2;
      this.field410 = -1;
      this.field385 = -1;
      this.field386 = 0;
      this.field387 = -1;
      this.field388 = -1;
      this.field389 = 0;
      this.field409 = -1;
      this.field391 = -1;
      this.field390 = -1;
      this.field394 = -1;
      this.field373 = -1;
      this.field395 = -1;
      this.field398 = -1;
      this.field371 = -1;
      this.field400 = 128;
      this.field401 = 128;
      this.field402 = 128;
      this.field403 = 0;
      this.field404 = 0;
      this.field405 = 0;
      this.field366 = 0;
      this.field408 = false;
      this.field384 = -1;
      this.field392 = -1;
      this.field370 = -1;
      this.field411 = -1;
   }

   void method209() {
      if (this.field375 == 1) {
         this.field366 = 0;
      }

   }

   void method197(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method193(var1, var3);
      }
   }

   void method193(class366 var1, int var2) {
      if (var2 == 1) {
         this.field365 = var1.method1703();
      } else if (var2 == 2) {
         this.field380 = var1.method1662();
      } else if (var2 == 4) {
         this.field379 = var1.method1703();
      } else if (var2 == 5) {
         this.field356 = var1.method1703();
      } else if (var2 == 6) {
         this.field372 = var1.method1703();
      } else if (var2 == 7) {
         this.field357 = var1.method1703();
         if (this.field357 > 32767) {
            this.field357 -= 65536;
         }
      } else if (var2 == 8) {
         this.field374 = var1.method1703();
         if (this.field374 > 32767) {
            this.field374 -= 65536;
         }
      } else if (var2 == 9) {
         var1.method1662();
      } else if (var2 == 11) {
         this.field375 = 1;
      } else if (var2 == 12) {
         this.field376 = var1.method1658();
      } else if (var2 == 13) {
         this.field377 = var1.method1654();
      } else if (var2 == 14) {
         this.field362 = var1.method1654();
      } else if (var2 == 16) {
         this.field368 = true;
      } else if (var2 == 23) {
         this.field410 = var1.method1703();
         this.field386 = var1.method1654();
      } else if (var2 == 24) {
         this.field385 = var1.method1703();
      } else if (var2 == 25) {
         this.field387 = var1.method1703();
         this.field389 = var1.method1654();
      } else if (var2 == 26) {
         this.field388 = var1.method1703();
      } else if (var2 == 27) {
         this.field378 = var1.method1654();
      } else if (var2 >= 30 && var2 < 35) {
         this.field381[var2 - 30] = var1.method1662();
         if (this.field381[var2 - 30].equalsIgnoreCase(class424.field3253)) {
            this.field381[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field382[var2 - 35] = var1.method1662();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method1654();
            this.field399 = new short[var4];
            this.field367 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field399[var5] = (short)var1.method1703();
               this.field367[var5] = (short)var1.method1703();
            }
         } else if (var2 == 41) {
            var4 = var1.method1654();
            this.field393 = new short[var4];
            this.field369 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field393[var5] = (short)var1.method1703();
               this.field369[var5] = (short)var1.method1703();
            }
         } else if (var2 == 42) {
            this.field383 = var1.method1655();
         } else if (var2 == 65) {
            this.field408 = true;
         } else if (var2 == 75) {
            this.field366 = var1.method1656();
         } else if (var2 == 78) {
            this.field409 = var1.method1703();
         } else if (var2 == 79) {
            this.field391 = var1.method1703();
         } else if (var2 == 90) {
            this.field390 = var1.method1703();
         } else if (var2 == 91) {
            this.field373 = var1.method1703();
         } else if (var2 == 92) {
            this.field394 = var1.method1703();
         } else if (var2 == 93) {
            this.field395 = var1.method1703();
         } else if (var2 == 94) {
            var1.method1703();
         } else if (var2 == 95) {
            this.field358 = var1.method1703();
         } else if (var2 == 97) {
            this.field398 = var1.method1703();
         } else if (var2 == 98) {
            this.field371 = var1.method1703();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field396 == null) {
               this.field396 = new int[10];
               this.field397 = new int[10];
            }

            this.field396[var2 - 100] = var1.method1703();
            this.field397[var2 - 100] = var1.method1703();
         } else if (var2 == 110) {
            this.field400 = var1.method1703();
         } else if (var2 == 111) {
            this.field401 = var1.method1703();
         } else if (var2 == 112) {
            this.field402 = var1.method1703();
         } else if (var2 == 113) {
            this.field403 = var1.method1655();
         } else if (var2 == 114) {
            this.field404 = var1.method1655() * 5;
         } else if (var2 == 115) {
            this.field405 = var1.method1654();
         } else if (var2 == 139) {
            this.field384 = var1.method1703();
         } else if (var2 == 140) {
            this.field392 = var1.method1703();
         } else if (var2 == 148) {
            this.field370 = var1.method1703();
         } else if (var2 == 149) {
            this.field411 = var1.method1703();
         } else if (var2 == 249) {
            this.field407 = class24.method121(var1, this.field407);
         }
      }

   }

   void method194(class47 var1, class47 var2) {
      this.field365 = var1.field365;
      this.field379 = var1.field379;
      this.field356 = var1.field356;
      this.field372 = var1.field372;
      this.field358 = var1.field358;
      this.field357 = var1.field357;
      this.field374 = var1.field374;
      this.field399 = var1.field399;
      this.field367 = var1.field367;
      this.field393 = var1.field393;
      this.field369 = var1.field369;
      this.field380 = var2.field380;
      this.field368 = var2.field368;
      this.field376 = var2.field376;
      this.field375 = 1;
   }

   void method208(class47 var1, class47 var2) {
      this.field365 = var1.field365;
      this.field379 = var1.field379;
      this.field356 = var1.field356;
      this.field372 = var1.field372;
      this.field358 = var1.field358;
      this.field357 = var1.field357;
      this.field374 = var1.field374;
      this.field399 = var2.field399;
      this.field367 = var2.field367;
      this.field393 = var2.field393;
      this.field369 = var2.field369;
      this.field380 = var2.field380;
      this.field368 = var2.field368;
      this.field375 = var2.field375;
      this.field377 = var2.field377;
      this.field362 = var2.field362;
      this.field378 = var2.field378;
      this.field410 = var2.field410;
      this.field385 = var2.field385;
      this.field409 = var2.field409;
      this.field387 = var2.field387;
      this.field388 = var2.field388;
      this.field391 = var2.field391;
      this.field390 = var2.field390;
      this.field394 = var2.field394;
      this.field373 = var2.field373;
      this.field395 = var2.field395;
      this.field405 = var2.field405;
      this.field381 = var2.field381;
      this.field366 = var2.field366;
      this.field382 = new String[5];
      if (null != var2.field382) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field382[var4] = var2.field382[var4];
         }
      }

      this.field382[4] = class424.field3039;
      this.field376 = 0;
   }

   void method196(class47 var1, class47 var2) {
      this.field365 = var1.field365;
      this.field379 = var1.field379;
      this.field356 = var1.field356;
      this.field372 = var1.field372;
      this.field358 = var1.field358;
      this.field357 = var1.field357;
      this.field374 = var1.field374;
      this.field399 = var1.field399;
      this.field367 = var1.field367;
      this.field393 = var1.field393;
      this.field369 = var1.field369;
      this.field375 = var1.field375;
      this.field380 = var2.field380;
      this.field376 = 0;
      this.field368 = false;
      this.field408 = false;
   }

   public final class327 method203(int var1) {
      int var4;
      if (null != this.field396 && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field397[var4] && 0 != this.field397[var4]) {
               var3 = this.field396[var4];
            }
         }

         if (var3 != -1) {
            return method213(var3).method203(1);
         }
      }

      class327 var5 = class327.method1514(field359, this.field365, 0);
      if (null == var5) {
         return null;
      } else {
         if (128 != this.field400 || 128 != this.field401 || this.field402 != 128) {
            var5.method1505(this.field400, this.field401, this.field402);
         }

         if (this.field399 != null) {
            for(var4 = 0; var4 < this.field399.length; ++var4) {
               var5.method1513(this.field399[var4], this.field367[var4]);
            }
         }

         if (null != this.field393) {
            for(var4 = 0; var4 < this.field393.length; ++var4) {
               var5.method1504(this.field393[var4], this.field369[var4]);
            }
         }

         return var5;
      }
   }

   public final class485 method198(int var1) {
      if (null != this.field396 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field397[var4] && this.field397[var4] != 0) {
               var3 = this.field396[var4];
            }
         }

         if (var3 != -1) {
            return method213(var3).method198(1);
         }
      }

      class485 var6 = (class485)field406.method1183((long)this.field364);
      if (var6 != null) {
         return var6;
      } else {
         class327 var7 = class327.method1514(field359, this.field365, 0);
         if (var7 == null) {
            return null;
         } else {
            if (this.field400 != 128 || 128 != this.field401 || 128 != this.field402) {
               var7.method1505(this.field400, this.field401, this.field402);
            }

            int var5;
            if (null != this.field399) {
               for(var5 = 0; var5 < this.field399.length; ++var5) {
                  var7.method1513(this.field399[var5], this.field367[var5]);
               }
            }

            if (null != this.field393) {
               for(var5 = 0; var5 < this.field393.length; ++var5) {
                  var7.method1504(this.field393[var5], this.field369[var5]);
               }
            }

            var6 = var7.method1510(this.field403 + 64, this.field404 + 768, -50, -10, -50);
            var6.field3843 = true;
            field406.method1182(var6, (long)this.field364);
            return var6;
         }
      }
   }

   public class47 method199(int var1) {
      if (null != this.field396 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field397[var4] && this.field397[var4] != 0) {
               var3 = this.field396[var4];
            }
         }

         if (var3 != -1) {
            return method213(var3);
         }
      }

      return this;
   }

   public final boolean method200(int var1) {
      int var3 = this.field410;
      int var4 = this.field385;
      int var5 = this.field409;
      if (var1 == 1) {
         var3 = this.field387;
         var4 = this.field388;
         var5 = this.field391;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!field359.method2424(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !field359.method2424(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !field359.method2424(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class327 method201(int var1) {
      int var3 = this.field410;
      int var4 = this.field385;
      int var5 = this.field409;
      if (var1 == 1) {
         var3 = this.field387;
         var4 = this.field388;
         var5 = this.field391;
      }

      if (var3 == -1) {
         return null;
      } else {
         class327 var6 = class327.method1514(field359, var3, 0);
         if (var4 != -1) {
            class327 var7 = class327.method1514(field359, var4, 0);
            if (var5 != -1) {
               class327 var8 = class327.method1514(field359, var5, 0);
               class327[] var9 = new class327[]{var6, var7, var8};
               var6 = new class327(var9, 3);
            } else {
               class327[] var11 = new class327[]{var6, var7};
               var6 = new class327(var11, 2);
            }
         }

         if (var1 == 0 && this.field386 != 0) {
            var6.method1502(0, this.field386, 0);
         }

         if (var1 == 1 && this.field389 != 0) {
            var6.method1502(0, this.field389, 0);
         }

         int var10;
         if (this.field399 != null) {
            for(var10 = 0; var10 < this.field399.length; ++var10) {
               var6.method1513(this.field399[var10], this.field367[var10]);
            }
         }

         if (this.field393 != null) {
            for(var10 = 0; var10 < this.field393.length; ++var10) {
               var6.method1504(this.field393[var10], this.field369[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean method202(int var1) {
      int var3 = this.field390;
      int var4 = this.field394;
      if (var1 == 1) {
         var3 = this.field373;
         var4 = this.field395;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!field359.method2424(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !field359.method2424(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class327 method205(int var1) {
      int var3 = this.field390;
      int var4 = this.field394;
      if (var1 == 1) {
         var3 = this.field373;
         var4 = this.field395;
      }

      if (var3 == -1) {
         return null;
      } else {
         class327 var5 = class327.method1514(field359, var3, 0);
         if (var4 != -1) {
            class327 var6 = class327.method1514(field359, var4, 0);
            class327[] var7 = new class327[]{var5, var6};
            var5 = new class327(var7, 2);
         }

         int var8;
         if (this.field399 != null) {
            for(var8 = 0; var8 < this.field399.length; ++var8) {
               var5.method1513(this.field399[var8], this.field367[var8]);
            }
         }

         if (null != this.field393) {
            for(var8 = 0; var8 < this.field393.length; ++var8) {
               var5.method1504(this.field393[var8], this.field369[var8]);
            }
         }

         return var5;
      }
   }

   public int method204(int var1, int var2) {
      return class24.method120(this.field407, var1, var2);
   }

   public String method195(int var1, String var2) {
      class524 var5 = this.field407;
      String var4;
      if (null == var5) {
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

   public int method206() {
      if (-1 != this.field383 && null != this.field382) {
         if (this.field383 >= 0) {
            return this.field382[this.field383] != null ? this.field383 : -1;
         } else {
            return class424.field3173.equalsIgnoreCase(this.field382[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean method210() {
      return this.field367 != null;
   }

   boolean method207() {
      return this.field369 != null;
   }

   public static class47 method213(int var0) {
      class47 var2 = (class47)field361.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class459.field3646.method2422(10, var0);
         var2 = new class47();
         var2.field364 = var0;
         if (null != var3) {
            var2.method197(new class366(var3));
         }

         var2.method209();
         if (var2.field371 != -1) {
            var2.method194(method213(var2.field371), method213(var2.field398));
         }

         if (-1 != var2.field392) {
            var2.method208(method213(var2.field392), method213(var2.field384));
         }

         if (var2.field411 != -1) {
            var2.method196(method213(var2.field411), method213(var2.field370));
         }

         if (!field360 && var2.field368) {
            if (-1 == var2.field371 && var2.field392 == -1 && var2.field411 == -1) {
               var2.field380 = var2.field380 + class424.field3230;
            }

            var2.field408 = false;

            int var4;
            for(var4 = 0; var4 < var2.field381.length; ++var4) {
               var2.field381[var4] = null;
            }

            for(var4 = 0; var4 < var2.field382.length; ++var4) {
               if (var4 != 4) {
                  var2.field382[var4] = null;
               }
            }

            var2.field383 = -2;
            var2.field405 = 0;
            if (null != var2.field407) {
               boolean var7 = false;

               for(class70 var5 = var2.field407.method2511(); var5 != null; var5 = var2.field407.method2512()) {
                  class58 var6 = class58.method253((int)var5.field531);
                  if (var6.field464) {
                     var5.method295();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field407 = null;
               }
            }
         }

         field361.method1182(var2, (long)var0);
         return var2;
      }
   }

   public static final class296 method211(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
      class296 var9;
      if (!var5) {
         var9 = (class296)field363.method1183(var7);
         if (var9 != null) {
            return var9;
         }
      }

      class47 var10 = method213(var0);
      if (var1 > 1 && null != var10.field396) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field397[var12] && var10.field397[var12] != 0) {
               var11 = var10.field396[var12];
            }
         }

         if (var11 != -1) {
            var10 = method213(var11);
         }
      }

      class485 var23 = var10.method198(1);
      if (var23 == null) {
         return null;
      } else {
         class296 var24 = null;
         if (var10.field371 != -1) {
            var24 = method211(var10.field398, 10, 1, 0, 0, true);
            if (null == var24) {
               return null;
            }
         } else if (var10.field392 != -1) {
            var24 = method211(var10.field384, var1, var2, var3, 0, false);
            if (var24 == null) {
               return null;
            }
         } else if (var10.field411 != -1) {
            var24 = method211(var10.field370, var1, 0, 0, 0, false);
            if (null == var24) {
               return null;
            }
         }

         int[] var13 = class427.field3333;
         int var14 = class427.field3331;
         int var15 = class427.field3332;
         float[] var16 = class427.field3334;
         int[] var17 = new int[4];
         class427.method1964(var17);
         var9 = new class296(36, 32);
         class480.method2270(var9.field2031, 36, 32, (float[])null);
         class427.method1965();
         class480.method2271();
         class480.method2282(16, 16);
         class480.field3797.field4111 = false;
         if (-1 != var10.field411) {
            var24.method1366(0, 0);
         }

         int var18 = var10.field379;
         if (var5) {
            var18 = (int)((double)var18 * 1.5);
         } else if (var2 == 2) {
            var18 = (int)((double)var18 * 1.04);
         }

         int var19 = class480.field3795[var10.field356] * var18 >> 16;
         int var20 = class480.field3793[var10.field356] * var18 >> 16;
         var23.method2293();
         var23.method2299(0, var10.field372, var10.field358, var10.field356, var10.field357, var19 + var23.field1058 / 2 + var10.field374, var10.field374 + var20);
         if (-1 != var10.field392) {
            var24.method1366(0, 0);
         }

         if (var2 >= 1) {
            var9.method1344(1);
         }

         if (var2 >= 2) {
            var9.method1344(16777215);
         }

         if (var3 != 0) {
            var9.method1345(var3);
         }

         class480.method2270(var9.field2031, 36, 32, (float[])null);
         if (-1 != var10.field371) {
            var24.method1366(0, 0);
         }

         if (var4 == 1 || var4 == 2 && 1 == var10.field375) {
            class396 var21 = class439.field3478;
            String var22;
            if (var1 < 100000) {
               var22 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var22 = "<col=ffffff>" + var1 / 1000 + class424.field3179 + "</col>";
            } else {
               var22 = "<col=00ff80>" + var1 / 1000000 + class424.field3177 + "</col>";
            }

            var21.method1943(var22, 0, 9, 16776960, 1);
         }

         if (!var5) {
            field363.method1182(var9, var7);
         }

         class480.method2270(var13, var14, var15, var16);
         class427.method1984(var17);
         class480.method2271();
         class480.field3797.field4111 = true;
         return var9;
      }
   }

   public static void method212() {
      field363.method1180();
   }
}
