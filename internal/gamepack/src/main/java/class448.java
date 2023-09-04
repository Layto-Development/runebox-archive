import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class448 extends class124 {
   static ThreadPoolExecutor field3428 = null;
   static AtomicBoolean field3431 = null;
   boolean field3424;
   class267 field3429 = new class267(this);
   class280[][] field3418 = new class280[16][128];
   class280[][] field3422 = new class280[16][128];
   class61 field3423 = new class61();
   class79 field3432 = new class79(128);
   int field3404 = 256;
   int field3412 = 1000000;
   int field3425;
   int field3426;
   int[] field3403 = new int[16];
   int[] field3405 = new int[16];
   int[] field3406 = new int[16];
   int[] field3407 = new int[16];
   int[] field3408 = new int[16];
   int[] field3409 = new int[16];
   int[] field3410 = new int[16];
   int[] field3411 = new int[16];
   int[] field3414 = new int[16];
   int[] field3415 = new int[16];
   int[] field3416 = new int[16];
   int[] field3417 = new int[16];
   int[] field3419 = new int[16];
   int[] field3421 = new int[16];
   int[] field3430 = new int[16];
   PriorityQueue field3413 = new PriorityQueue(5, new class484());
   long field3420;
   long field3427;
   public int field3433 = 0;

   public class448() {
      this.method2190();
   }

   public synchronized void method2175(int var1) {
      this.field3404 = var1;
   }

   public int method2198() {
      return this.field3404;
   }

   public synchronized boolean method2176(class362 var1, class298 var2, class482 var3) {
      boolean var5 = true;
      synchronized(this.field3413) {
         this.field3413.clear();
      }

      for(class81 var6 = (class81)var1.field2829.method710(); var6 != null; var6 = (class81)var1.field2829.method711()) {
         int var7 = (int)var6.field1078;
         class271 var8 = (class271)this.field3432.method709((long)var7);
         if (null == var8) {
            byte[] var10 = var2.method1636(var7);
            class271 var9;
            if (var10 == null) {
               var9 = null;
            } else {
               var9 = new class271(var10);
            }

            var8 = var9;
            if (null == var9) {
               var5 = false;
               continue;
            }

            this.field3432.method712(var9, (long)var7);
         }

         if (!var8.method1518(var3, var6.field1251)) {
            var5 = false;
         } else if (null != this.field3413) {
            synchronized(this.field3413) {
               Iterator var15 = var8.field2323.iterator();

               while(var15.hasNext()) {
                  class139 var11 = (class139)var15.next();
                  this.field3413.add(new class172(var6.field1252, var11));
               }
            }
         }
      }

      return var5;
   }

   public void method2177() {
      if (null != this.field3413) {
         if (field3431 != null) {
            field3431.set(true);
         }

         field3431 = new AtomicBoolean(false);
         AtomicBoolean var2 = field3431;
         if (field3428 == null) {
            int var3 = Runtime.getRuntime().availableProcessors();
            field3428 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class40(this));
         }

         field3428.submit(new class274(this, var2));
      }
   }

   public synchronized void method2178() {
      for(class271 var2 = (class271)this.field3432.method710(); null != var2; var2 = (class271)this.field3432.method711()) {
         var2.method1519();
      }

   }

   public synchronized void method2205() {
      for(class271 var2 = (class271)this.field3432.method710(); var2 != null; var2 = (class271)this.field3432.method711()) {
         var2.method605();
      }

   }

   public synchronized void method2179(class362 var1, boolean var2) {
      this.method2207();
      this.field3423.method629(var1.field2828);
      this.field3424 = var2;
      this.field3427 = 0L;
      int var4 = this.field3423.method617();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field3423.method618(var5);
         this.field3423.method621(var5);
         this.field3423.method619(var5);
      }

      this.field3425 = this.field3423.method625();
      this.field3426 = this.field3423.field1110[this.field3425];
      this.field3420 = this.field3423.method628(this.field3426);
   }

   public synchronized void method2207() {
      this.field3423.method616();
      this.method2190();
   }

   public synchronized boolean method2203() {
      return this.field3423.method630();
   }

   public synchronized boolean method2180() {
      return this.field3432.method708() > 0;
   }

   public synchronized void method2195(int var1, int var2) {
      this.method2199(var1, var2);
   }

   void method2199(int var1, int var2) {
      this.field3409[var1] = var2;
      this.field3415[var1] = var2 & -128;
      this.method2181(var1, var2);
   }

   void method2181(int var1, int var2) {
      if (var2 != this.field3410[var1]) {
         this.field3410[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field3422[var1][var4] = null;
         }
      }

   }

   void method2182(int var1, int var2, int var3) {
      this.method2183(var1, var2, 64);
      if ((this.field3403[var1] & 2) != 0) {
         for(class280 var5 = (class280)this.field3429.field2302.method1237(); var5 != null; var5 = (class280)this.field3429.field2302.method1242()) {
            if (var5.field2398 == var1 && var5.field2402 < 0) {
               this.field3418[var1][var5.field2393] = null;
               this.field3418[var1][var2] = var5;
               int var6 = var5.field2392 + (var5.field2397 * var5.field2400 >> 12);
               var5.field2392 += var2 - var5.field2393 << 8;
               var5.field2397 = var6 - var5.field2392;
               var5.field2400 = 4096;
               var5.field2393 = var2;
               return;
            }
         }
      }

      class271 var9 = (class271)this.field3432.method709((long)this.field3410[var1]);
      if (null != var9) {
         if (null != var9.field2316[var2]) {
            class408 var10 = var9.field2316[var2].method909();
            if (var10 != null) {
               class280 var7 = new class280();
               var7.field2398 = var1;
               var7.field2389 = var9;
               var7.field2390 = var10;
               var7.field2391 = var9.field2320[var2];
               var7.field2404 = var9.field2321[var2];
               var7.field2393 = var2;
               var7.field2394 = var9.field2318[var2] * var9.field2322 * var3 * var3 + 1024 >> 11;
               var7.field2395 = var9.field2319[var2] & 255;
               var7.field2392 = (var2 << 8) - (var9.field2317[var2] & 32767);
               var7.field2399 = 0;
               var7.field2406 = 0;
               var7.field2401 = 0;
               var7.field2402 = -1;
               var7.field2403 = 0;
               if (this.field3405[var1] == 0) {
                  var7.field2396 = class432.method2074(var10, this.method2201(var7), this.method2202(var7), this.method2194(var7));
               } else {
                  var7.field2396 = class432.method2074(var10, this.method2201(var7), 0, this.method2194(var7));
                  this.method2193(var7, var9.field2317[var2] < 0);
               }

               if (var9.field2317[var2] < 0) {
                  var7.field2396.method2075(-1);
               }

               if (var7.field2404 >= 0) {
                  class280 var8 = this.field3422[var1][var7.field2404];
                  if (null != var8 && var8.field2402 < 0) {
                     this.field3418[var1][var8.field2393] = null;
                     var8.field2402 = 0;
                  }

                  this.field3422[var1][var7.field2404] = var7;
               }

               this.field3429.field2302.method1240(var7);
               this.field3418[var1][var2] = var7;
            }
         }
      }
   }

   void method2193(class280 var1, boolean var2) {
      int var4 = var1.field2390.field3150.length;
      int var5;
      if (var2 && var1.field2390.field3153) {
         int var6 = var4 + var4 - var1.field2390.field3151;
         var5 = (int)((long)var6 * (long)this.field3405[var1.field2398] >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field2396.method2104(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field3405[var1.field2398] >> 6);
      }

      var1.field2396.method2080(var5);
   }

   void method2183(int var1, int var2, int var3) {
      class280 var5 = this.field3418[var1][var2];
      if (var5 != null) {
         this.field3418[var1][var2] = null;
         if ((this.field3403[var1] & 2) != 0) {
            for(class280 var6 = (class280)this.field3429.field2302.method1236(); var6 != null; var6 = (class280)this.field3429.field2302.method1238()) {
               if (var6.field2398 == var5.field2398 && var6.field2402 < 0 && var5 != var6) {
                  var5.field2402 = 0;
                  break;
               }
            }
         } else {
            var5.field2402 = 0;
         }

      }
   }

   void method2184(int var1, int var2, int var3) {
   }

   void method2185(int var1, int var2) {
   }

   void method2186(int var1, int var2) {
      this.field3421[var1] = var2;
   }

   void method2204(int var1) {
      for(class280 var3 = (class280)this.field3429.field2302.method1236(); var3 != null; var3 = (class280)this.field3429.field2302.method1238()) {
         if (var1 < 0 || var1 == var3.field2398) {
            if (null != var3.field2396) {
               var3.field2396.method2082(class331.field2655 / 100);
               if (var3.field2396.method2086()) {
                  this.field3429.field2300.method1525(var3.field2396);
               }

               var3.method1541();
            }

            if (var3.field2402 < 0) {
               this.field3418[var3.field2398][var3.field2393] = null;
            }

            var3.method605();
         }
      }

   }

   void method2187(int var1) {
      if (var1 >= 0) {
         this.field3406[var1] = 12800;
         this.field3407[var1] = 8192;
         this.field3408[var1] = 16383;
         this.field3421[var1] = 8192;
         this.field3411[var1] = 0;
         this.field3414[var1] = 8192;
         this.method2189(var1);
         this.method2200(var1);
         this.field3403[var1] = 0;
         this.field3416[var1] = 32767;
         this.field3417[var1] = 256;
         this.field3405[var1] = 0;
         this.method2191(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method2187(var1);
         }

      }
   }

   void method2188(int var1) {
      for(class280 var3 = (class280)this.field3429.field2302.method1236(); null != var3; var3 = (class280)this.field3429.field2302.method1238()) {
         if ((var1 < 0 || var3.field2398 == var1) && var3.field2402 < 0) {
            this.field3418[var3.field2398][var3.field2393] = null;
            var3.field2402 = 0;
         }
      }

   }

   void method2190() {
      this.method2204(-1);
      this.method2187(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field3410[var2] = this.field3409[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field3415[var2] = this.field3409[var2] & -128;
      }

   }

   void method2189(int var1) {
      if ((this.field3403[var1] & 2) != 0) {
         for(class280 var3 = (class280)this.field3429.field2302.method1236(); var3 != null; var3 = (class280)this.field3429.field2302.method1238()) {
            if (var3.field2398 == var1 && null == this.field3418[var1][var3.field2393] && var3.field2402 < 0) {
               var3.field2402 = 0;
            }
         }
      }

   }

   void method2200(int var1) {
      if ((this.field3403[var1] & 4) != 0) {
         for(class280 var3 = (class280)this.field3429.field2302.method1236(); var3 != null; var3 = (class280)this.field3429.field2302.method1238()) {
            if (var1 == var3.field2398) {
               var3.field2408 = 0;
            }
         }
      }

   }

   void method2192(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2183(var4, var5, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method2182(var4, var5, var6);
         } else {
            this.method2183(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2184(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field3415[var4] = (this.field3415[var4] & -2080769) + (var6 << 14);
         }

         if (var5 == 32) {
            this.field3415[var4] = (var6 << 7) + (this.field3415[var4] & -16257);
         }

         if (var5 == 1) {
            this.field3411[var4] = (var6 << 7) + (this.field3411[var4] & -16257);
         }

         if (var5 == 33) {
            this.field3411[var4] = var6 + (this.field3411[var4] & -128);
         }

         if (var5 == 5) {
            this.field3414[var4] = (var6 << 7) + (this.field3414[var4] & -16257);
         }

         if (var5 == 37) {
            this.field3414[var4] = var6 + (this.field3414[var4] & -128);
         }

         if (var5 == 7) {
            this.field3406[var4] = (this.field3406[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 39) {
            this.field3406[var4] = (this.field3406[var4] & -128) + var6;
         }

         if (var5 == 10) {
            this.field3407[var4] = (this.field3407[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 42) {
            this.field3407[var4] = var6 + (this.field3407[var4] & -128);
         }

         if (var5 == 11) {
            this.field3408[var4] = (this.field3408[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 43) {
            this.field3408[var4] = var6 + (this.field3408[var4] & -128);
         }

         int[] var10000;
         if (var5 == 64) {
            if (var6 >= 64) {
               var10000 = this.field3403;
               var10000[var4] |= 1;
            } else {
               var10000 = this.field3403;
               var10000[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               var10000 = this.field3403;
               var10000[var4] |= 2;
            } else {
               this.method2189(var4);
               var10000 = this.field3403;
               var10000[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field3416[var4] = (var6 << 7) + (this.field3416[var4] & 127);
         }

         if (var5 == 98) {
            this.field3416[var4] = var6 + (this.field3416[var4] & 16256);
         }

         if (var5 == 101) {
            this.field3416[var4] = (var6 << 7) + (this.field3416[var4] & 127) + 16384;
         }

         if (var5 == 100) {
            this.field3416[var4] = 16384 + (this.field3416[var4] & 16256) + var6;
         }

         if (var5 == 120) {
            this.method2204(var4);
         }

         if (var5 == 121) {
            this.method2187(var4);
         }

         if (var5 == 123) {
            this.method2188(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field3416[var4];
            if (var7 == 16384) {
               this.field3417[var4] = (var6 << 7) + (this.field3417[var4] & -16257);
            }
         }

         if (var5 == 38) {
            var7 = this.field3416[var4];
            if (var7 == 16384) {
               this.field3417[var4] = (this.field3417[var4] & -128) + var6;
            }
         }

         if (var5 == 16) {
            this.field3405[var4] = (var6 << 7) + (this.field3405[var4] & -16257);
         }

         if (var5 == 48) {
            this.field3405[var4] = (this.field3405[var4] & -128) + var6;
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               var10000 = this.field3403;
               var10000[var4] |= 4;
            } else {
               this.method2200(var4);
               var10000 = this.field3403;
               var10000[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method2191(var4, (this.field3419[var4] & -16257) + (var6 << 7));
         }

         if (var5 == 49) {
            this.method2191(var4, (this.field3419[var4] & -128) + var6);
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2181(var4, this.field3415[var4] + var5);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2185(var4, var5);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
         this.method2186(var4, var5);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method2190();
         }
      }
   }

   void method2191(int var1, int var2) {
      this.field3419[var1] = var2;
      this.field3430[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   int method2201(class280 var1) {
      int var3 = var1.field2392 + (var1.field2400 * var1.field2397 >> 12);
      var3 += (this.field3421[var1.field2398] - 8192) * this.field3417[var1.field2398] >> 12;
      class84 var4 = var1.field2391;
      int var5;
      if (var4.field1265 > 0 && (var4.field1264 > 0 || this.field3411[var1.field2398] > 0)) {
         var5 = var4.field1264 << 2;
         int var6 = var4.field1266 << 1;
         if (var1.field2388 < var6) {
            var5 = var5 * var1.field2388 / var6;
         }

         var5 += this.field3411[var1.field2398] >> 7;
         double var7 = Math.sin(0.01227184630308513 * (double)(var1.field2405 & 511));
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)((double)(var1.field2390.field3152 * 256) * Math.pow(2.0, (double)var3 * 3.255208333333333E-4) / (double)class331.field2655 + 0.5);
      return var5 < 1 ? 1 : var5;
   }

   int method2202(class280 var1) {
      class84 var3 = var1.field2391;
      int var4 = 4096 + this.field3406[var1.field2398] * this.field3408[var1.field2398] >> 13;
      var4 = 16384 + var4 * var4 >> 15;
      var4 = var4 * var1.field2394 + 16384 >> 15;
      var4 = var4 * this.field3404 + 128 >> 8;
      if (var3.field1261 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5, 1.953125E-5 * (double)var1.field2399 * (double)var3.field1261) + 0.5);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (var3.field1263 != null) {
         var5 = var1.field2406;
         var6 = var3.field1263[var1.field2401 + 1];
         if (var1.field2401 < var3.field1263.length - 2) {
            var7 = (var3.field1263[var1.field2401] & 255) << 8;
            var8 = (var3.field1263[var1.field2401 + 2] & 255) << 8;
            var6 += (var3.field1263[3 + var1.field2401] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      if (var1.field2402 > 0 && null != var3.field1268) {
         var5 = var1.field2402;
         var6 = var3.field1268[var1.field2403 + 1];
         if (var1.field2403 < var3.field1268.length - 2) {
            var7 = (var3.field1268[var1.field2403] & 255) << 8;
            var8 = (var3.field1268[var1.field2403 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field1268[3 + var1.field2403] - var6) / (var8 - var7);
         }

         var4 = 32 + var4 * var6 >> 6;
      }

      return var4;
   }

   int method2194(class280 var1) {
      int var3 = this.field3407[var1.field2398];
      return var3 < 8192 ? var1.field2395 * var3 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field2395) >> 6);
   }

   protected synchronized class124 method866() {
      return this.field3429;
   }

   protected synchronized class124 method867() {
      return null;
   }

   protected synchronized int method864() {
      return 0;
   }

   protected synchronized void method869(int[] var1, int var2, int var3) {
      if (this.field3423.method630()) {
         int var4 = this.field3423.field1107 * this.field3412 / class331.field2655;

         do {
            long var5 = (long)var4 * (long)var3 + this.field3427;
            if (this.field3420 - var5 >= 0L) {
               this.field3427 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field3420 - this.field3427) - 1L) / (long)var4);
            this.field3427 += (long)var4 * (long)var7;
            this.field3429.method869(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method2196();
         } while(this.field3423.method630());
      }

      this.field3429.method869(var1, var2, var3);
   }

   protected synchronized void method868(int var1) {
      if (this.field3423.method630()) {
         int var2 = this.field3412 * this.field3423.field1107 / class331.field2655;

         do {
            long var3 = this.field3427 + (long)var1 * (long)var2;
            if (this.field3420 - var3 >= 0L) {
               this.field3427 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field3420 - this.field3427) - 1L) / (long)var2);
            this.field3427 += (long)var2 * (long)var5;
            this.field3429.method868(var5);
            var1 -= var5;
            this.method2196();
         } while(this.field3423.method630());
      }

      this.field3429.method868(var1);
   }

   void method2196() {
      int var2 = this.field3425;
      int var3 = this.field3426;

      long var4;
      for(var4 = this.field3420; this.field3426 == var3; var4 = this.field3423.method628(var3)) {
         while(this.field3423.field1110[var2] == var3) {
            this.field3423.method618(var2);
            int var6 = this.field3423.method622(var2);
            if (var6 == 1) {
               this.field3423.method620();
               this.field3423.method619(var2);
               if (this.field3423.method626()) {
                  if (!this.field3424 || var3 == 0) {
                     this.method2190();
                     this.field3423.method616();
                     return;
                  }

                  this.field3423.method627(var4);
               }
               break;
            }

            if ((var6 & 128) != 0) {
               this.method2192(var6);
            }

            this.field3423.method621(var2);
            this.field3423.method619(var2);
         }

         var2 = this.field3423.method625();
         var3 = this.field3423.field1110[var2];
      }

      this.field3425 = var2;
      this.field3426 = var3;
      this.field3420 = var4;
   }

   boolean method2206(class280 var1) {
      if (null == var1.field2396) {
         if (var1.field2402 >= 0) {
            var1.method605();
            if (var1.field2404 > 0 && this.field3422[var1.field2398][var1.field2404] == var1) {
               this.field3422[var1.field2398][var1.field2404] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method2197(class280 var1, int[] var2, int var3, int var4) {
      var1.field2407 = class331.field2655 / 100;
      if (var1.field2402 < 0 || null != var1.field2396 && !var1.field2396.method2085()) {
         int var6 = var1.field2400;
         if (var6 > 0) {
            var6 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * (double)this.field3414[var1.field2398]) + 0.5);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field2400 = var6;
         }

         var1.field2396.method2083(this.method2201(var1));
         class84 var7 = var1.field2391;
         boolean var8 = false;
         ++var1.field2388;
         var1.field2405 += var7.field1265;
         double var9 = 5.086263020833333E-6 * (double)((var1.field2397 * var1.field2400 >> 12) + (var1.field2393 - 60 << 8));
         if (var7.field1261 > 0) {
            if (var7.field1259 > 0) {
               var1.field2399 += (int)(128.0 * Math.pow(2.0, (double)var7.field1259 * var9) + 0.5);
            } else {
               var1.field2399 += 128;
            }
         }

         if (var7.field1263 != null) {
            if (var7.field1260 > 0) {
               var1.field2406 += (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field1260) + 0.5);
            } else {
               var1.field2406 += 128;
            }

            while(var1.field2401 < var7.field1263.length - 2 && var1.field2406 > (var7.field1263[var1.field2401 + 2] & 255) << 8) {
               var1.field2401 += 2;
            }

            if (var1.field2401 == var7.field1263.length - 2 && var7.field1263[var1.field2401 + 1] == 0) {
               var8 = true;
            }
         }

         if (var1.field2402 >= 0 && var7.field1268 != null && (this.field3403[var1.field2398] & 1) == 0 && (var1.field2404 < 0 || var1 != this.field3422[var1.field2398][var1.field2404])) {
            if (var7.field1262 > 0) {
               var1.field2402 += (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field1262) + 0.5);
            } else {
               var1.field2402 += 128;
            }

            while(var1.field2403 < var7.field1268.length - 2 && var1.field2402 > (var7.field1268[2 + var1.field2403] & 255) << 8) {
               var1.field2403 += 2;
            }

            if (var1.field2403 == var7.field1268.length - 2) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field2396.method2082(var1.field2407);
            if (null != var2) {
               var1.field2396.method869(var2, var3, var4);
            } else {
               var1.field2396.method868(var4);
            }

            if (var1.field2396.method2086()) {
               this.field3429.field2300.method1525(var1.field2396);
            }

            var1.method1541();
            if (var1.field2402 >= 0) {
               var1.method605();
               if (var1.field2404 > 0 && this.field3422[var1.field2398][var1.field2404] == var1) {
                  this.field3422[var1.field2398][var1.field2404] = null;
               }
            }

            return true;
         } else {
            var1.field2396.method2087(var1.field2407, this.method2202(var1), this.method2194(var1));
            return false;
         }
      } else {
         var1.method1541();
         var1.method605();
         if (var1.field2404 > 0 && this.field3422[var1.field2398][var1.field2404] == var1) {
            this.field3422[var1.field2398][var1.field2404] = null;
         }

         return true;
      }
   }
}
