public class class327 extends class165 {
   static int field2455 = 0;
   static int[] field2438;
   static int[] field2457 = new int[10000];
   static int[] field2461;
   static int[] field2475 = new int[10000];
   boolean field2468 = false;
   byte field2452 = 0;
   byte[] field2437;
   byte[] field2447;
   byte[] field2448;
   byte[] field2466;
   byte[] field2469;
   class363[] field2449;
   class363[] field2465;
   class489[] field2463;
   int field2439 = 0;
   int field2446;
   int field2453;
   int field2470;
   int field2471 = 0;
   int field2472;
   int field2473;
   int field2476;
   int[] field2440;
   int[] field2441;
   int[] field2442;
   int[] field2443;
   int[] field2444;
   int[] field2445;
   int[] field2464;
   int[] field2477;
   int[][] field2458;
   int[][] field2459;
   int[][] field2460;
   int[][] field2462;
   short[] field2450;
   short[] field2451;
   short[] field2454;
   short[] field2456;
   short[] field2474;
   public short field2467;
   public short field2478;

   static {
      field2438 = class480.field3795;
      field2461 = class480.field3793;
   }

   class327() {
   }

   class327(byte[] var1) {
      class366 var2 = new class366(10);
      var2.method1684(-2);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.method1516(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method1512(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method1518(var1);
      } else {
         this.method1517(var1);
      }

   }

   public class327(class327[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.field2439 = 0;
      this.field2471 = 0;
      this.field2453 = 0;
      this.field2452 = -1;

      int var10;
      class327 var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.field2439 += var11.field2439;
            this.field2471 += var11.field2471;
            this.field2453 += var11.field2453;
            if (var11.field2447 != null) {
               var4 = true;
            } else {
               if (this.field2452 == -1) {
                  this.field2452 = var11.field2452;
               }

               if (this.field2452 != var11.field2452) {
                  var4 = true;
               }
            }

            var3 |= var11.field2469 != null;
            var5 |= var11.field2448 != null;
            var6 |= var11.field2477 != null;
            var7 |= var11.field2451 != null;
            var8 |= var11.field2437 != null;
            var9 |= var11.field2458 != null;
         }
      }

      this.field2440 = new int[this.field2439];
      this.field2441 = new int[this.field2439];
      this.field2442 = new int[this.field2439];
      this.field2464 = new int[this.field2439];
      this.field2443 = new int[this.field2471];
      this.field2444 = new int[this.field2471];
      this.field2445 = new int[this.field2471];
      if (var3) {
         this.field2469 = new byte[this.field2471];
      }

      if (var4) {
         this.field2447 = new byte[this.field2471];
      }

      if (var5) {
         this.field2448 = new byte[this.field2471];
      }

      if (var6) {
         this.field2477 = new int[this.field2471];
      }

      if (var7) {
         this.field2451 = new short[this.field2471];
      }

      if (var8) {
         this.field2437 = new byte[this.field2471];
      }

      if (var9) {
         this.field2458 = new int[this.field2439][];
         this.field2462 = new int[this.field2439][];
      }

      this.field2450 = new short[this.field2471];
      if (this.field2453 > 0) {
         this.field2466 = new byte[this.field2453];
         this.field2454 = new short[this.field2453];
         this.field2456 = new short[this.field2453];
         this.field2474 = new short[this.field2453];
      }

      this.field2439 = 0;
      this.field2471 = 0;
      this.field2453 = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.field2471; ++var12) {
               if (var3 && var11.field2469 != null) {
                  this.field2469[this.field2471] = var11.field2469[var12];
               }

               if (var4) {
                  if (var11.field2447 != null) {
                     this.field2447[this.field2471] = var11.field2447[var12];
                  } else {
                     this.field2447[this.field2471] = var11.field2452;
                  }
               }

               if (var5 && var11.field2448 != null) {
                  this.field2448[this.field2471] = var11.field2448[var12];
               }

               if (var6 && var11.field2477 != null) {
                  this.field2477[this.field2471] = var11.field2477[var12];
               }

               if (var7) {
                  if (var11.field2451 != null) {
                     this.field2451[this.field2471] = var11.field2451[var12];
                  } else {
                     this.field2451[this.field2471] = -1;
                  }
               }

               if (var8) {
                  if (var11.field2437 != null && var11.field2437[var12] != -1) {
                     this.field2437[this.field2471] = (byte)(var11.field2437[var12] + this.field2453);
                  } else {
                     this.field2437[this.field2471] = -1;
                  }
               }

               this.field2450[this.field2471] = var11.field2450[var12];
               this.field2443[this.field2471] = this.method1494(var11, var11.field2443[var12]);
               this.field2444[this.field2471] = this.method1494(var11, var11.field2444[var12]);
               this.field2445[this.field2471] = this.method1494(var11, var11.field2445[var12]);
               ++this.field2471;
            }

            for(var12 = 0; var12 < var11.field2453; ++var12) {
               byte var13 = this.field2466[this.field2453] = var11.field2466[var12];
               if (var13 == 0) {
                  this.field2454[this.field2453] = (short)this.method1494(var11, var11.field2454[var12]);
                  this.field2456[this.field2453] = (short)this.method1494(var11, var11.field2456[var12]);
                  this.field2474[this.field2453] = (short)this.method1494(var11, var11.field2474[var12]);
               }

               ++this.field2453;
            }
         }
      }

   }

   public class327(class327 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2439 = var1.field2439;
      this.field2471 = var1.field2471;
      this.field2453 = var1.field2453;
      int var6;
      if (var2) {
         this.field2440 = var1.field2440;
         this.field2441 = var1.field2441;
         this.field2442 = var1.field2442;
      } else {
         this.field2440 = new int[this.field2439];
         this.field2441 = new int[this.field2439];
         this.field2442 = new int[this.field2439];

         for(var6 = 0; var6 < this.field2439; ++var6) {
            this.field2440[var6] = var1.field2440[var6];
            this.field2441[var6] = var1.field2441[var6];
            this.field2442[var6] = var1.field2442[var6];
         }
      }

      if (var3) {
         this.field2450 = var1.field2450;
      } else {
         this.field2450 = new short[this.field2471];

         for(var6 = 0; var6 < this.field2471; ++var6) {
            this.field2450[var6] = var1.field2450[var6];
         }
      }

      if (!var4 && var1.field2451 != null) {
         this.field2451 = new short[this.field2471];

         for(var6 = 0; var6 < this.field2471; ++var6) {
            this.field2451[var6] = var1.field2451[var6];
         }
      } else {
         this.field2451 = var1.field2451;
      }

      if (var5) {
         this.field2448 = var1.field2448;
      } else {
         this.field2448 = new byte[this.field2471];
         if (var1.field2448 == null) {
            for(var6 = 0; var6 < this.field2471; ++var6) {
               this.field2448[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.field2471; ++var6) {
               this.field2448[var6] = var1.field2448[var6];
            }
         }
      }

      this.field2443 = var1.field2443;
      this.field2444 = var1.field2444;
      this.field2445 = var1.field2445;
      this.field2469 = var1.field2469;
      this.field2447 = var1.field2447;
      this.field2437 = var1.field2437;
      this.field2452 = var1.field2452;
      this.field2466 = var1.field2466;
      this.field2454 = var1.field2454;
      this.field2456 = var1.field2456;
      this.field2474 = var1.field2474;
      this.field2464 = var1.field2464;
      this.field2477 = var1.field2477;
      this.field2459 = var1.field2459;
      this.field2460 = var1.field2460;
      this.field2449 = var1.field2449;
      this.field2463 = var1.field2463;
      this.field2465 = var1.field2465;
      this.field2458 = var1.field2458;
      this.field2462 = var1.field2462;
      this.field2478 = var1.field2478;
      this.field2467 = var1.field2467;
   }

   void method1516(byte[] var1) {
      class366 var2 = new class366(var1);
      class366 var3 = new class366(var1);
      class366 var4 = new class366(var1);
      class366 var5 = new class366(var1);
      class366 var6 = new class366(var1);
      class366 var7 = new class366(var1);
      class366 var8 = new class366(var1);
      var2.field2652 = var1.length - 26;
      int var9 = var2.method1703();
      int var10 = var2.method1703();
      int var11 = var2.method1654();
      int var12 = var2.method1654();
      int var13 = var2.method1654();
      int var14 = var2.method1654();
      int var15 = var2.method1654();
      int var16 = var2.method1654();
      int var17 = var2.method1654();
      int var18 = var2.method1654();
      int var19 = var2.method1703();
      int var20 = var2.method1703();
      int var21 = var2.method1703();
      int var22 = var2.method1703();
      int var23 = var2.method1703();
      int var24 = var2.method1703();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.field2466 = new byte[var11];
         var2.field2652 = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.field2466[var28] = var2.method1655();
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.field2439 = var9;
      this.field2471 = var10;
      this.field2453 = var11;
      this.field2440 = new int[var9];
      this.field2441 = new int[var9];
      this.field2442 = new int[var9];
      this.field2443 = new int[var10];
      this.field2444 = new int[var10];
      this.field2445 = new int[var10];
      if (var17 == 1) {
         this.field2464 = new int[var9];
      }

      if (var12 == 1) {
         this.field2469 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2447 = new byte[var10];
      } else {
         this.field2452 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2448 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2477 = new int[var10];
      }

      if (var16 == 1) {
         this.field2451 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2437 = new byte[var10];
      }

      if (var18 == 1) {
         this.field2458 = new int[var9][];
         this.field2462 = new int[var9][];
      }

      this.field2450 = new short[var10];
      if (var11 > 0) {
         this.field2454 = new short[var11];
         this.field2456 = new short[var11];
         this.field2474 = new short[var11];
      }

      var2.field2652 = var11;
      var3.field2652 = var40;
      var4.field2652 = var41;
      var5.field2652 = var42;
      var6.field2652 = var34;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.method1654();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method1665();
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method1665();
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method1665();
         }

         this.field2440[var53] = var50 + var55;
         this.field2441[var53] = var51 + var56;
         this.field2442[var53] = var52 + var57;
         var50 = this.field2440[var53];
         var51 = this.field2441[var53];
         var52 = this.field2442[var53];
         if (var17 == 1) {
            this.field2464[var53] = var6.method1654();
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.method1654();
            this.field2458[var53] = new int[var54];
            this.field2462[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.field2458[var53][var55] = var6.method1654();
               this.field2462[var53][var55] = var6.method1654();
            }
         }
      }

      var2.field2652 = var39;
      var3.field2652 = var30;
      var4.field2652 = var32;
      var5.field2652 = var35;
      var6.field2652 = var33;
      var7.field2652 = var37;
      var8.field2652 = var38;

      for(var53 = 0; var53 < var10; ++var53) {
         this.field2450[var53] = (short)var2.method1703();
         if (var12 == 1) {
            this.field2469[var53] = var3.method1655();
         }

         if (var13 == 255) {
            this.field2447[var53] = var4.method1655();
         }

         if (var14 == 1) {
            this.field2448[var53] = var5.method1655();
         }

         if (var15 == 1) {
            this.field2477[var53] = var6.method1654();
         }

         if (var16 == 1) {
            this.field2451[var53] = (short)(var7.method1703() - 1);
         }

         if (this.field2437 != null && this.field2451[var53] != -1) {
            this.field2437[var53] = (byte)(var8.method1654() - 1);
         }
      }

      var2.field2652 = var36;
      var3.field2652 = var31;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.method1654();
         if (var58 == 1) {
            var53 = var2.method1665() + var56;
            var54 = var2.method1665() + var53;
            var55 = var2.method1665() + var54;
            var56 = var55;
            this.field2443[var57] = var53;
            this.field2444[var57] = var54;
            this.field2445[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.method1665() + var56;
            var56 = var55;
            this.field2443[var57] = var53;
            this.field2444[var57] = var54;
            this.field2445[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.method1665() + var56;
            var56 = var55;
            this.field2443[var57] = var53;
            this.field2444[var57] = var54;
            this.field2445[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.method1665() + var56;
            var56 = var55;
            this.field2443[var57] = var53;
            this.field2444[var57] = var59;
            this.field2445[var57] = var55;
         }
      }

      var2.field2652 = var43;
      var3.field2652 = var44;
      var4.field2652 = var45;
      var5.field2652 = var46;
      var6.field2652 = var47;
      var7.field2652 = var48;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.field2466[var57] & 255;
         if (var58 == 0) {
            this.field2454[var57] = (short)var2.method1703();
            this.field2456[var57] = (short)var2.method1703();
            this.field2474[var57] = (short)var2.method1703();
         }
      }

      var2.field2652 = var28;
      var57 = var2.method1654();
      if (var57 != 0) {
         new class111();
         var2.method1703();
         var2.method1703();
         var2.method1703();
         var2.method1658();
      }

   }

   void method1512(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class366 var4 = new class366(var1);
      class366 var5 = new class366(var1);
      class366 var6 = new class366(var1);
      class366 var7 = new class366(var1);
      class366 var8 = new class366(var1);
      var4.field2652 = var1.length - 23;
      int var9 = var4.method1703();
      int var10 = var4.method1703();
      int var11 = var4.method1654();
      int var12 = var4.method1654();
      int var13 = var4.method1654();
      int var14 = var4.method1654();
      int var15 = var4.method1654();
      int var16 = var4.method1654();
      int var17 = var4.method1654();
      int var18 = var4.method1703();
      int var19 = var4.method1703();
      int var20 = var4.method1703();
      int var21 = var4.method1703();
      int var22 = var4.method1703();
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.field2439 = var9;
      this.field2471 = var10;
      this.field2453 = var11;
      this.field2440 = new int[var9];
      this.field2441 = new int[var9];
      this.field2442 = new int[var9];
      this.field2443 = new int[var10];
      this.field2444 = new int[var10];
      this.field2445 = new int[var10];
      if (var11 > 0) {
         this.field2466 = new byte[var11];
         this.field2454 = new short[var11];
         this.field2456 = new short[var11];
         this.field2474 = new short[var11];
      }

      if (var16 == 1) {
         this.field2464 = new int[var9];
      }

      if (var12 == 1) {
         this.field2469 = new byte[var10];
         this.field2437 = new byte[var10];
         this.field2451 = new short[var10];
      }

      if (var13 == 255) {
         this.field2447 = new byte[var10];
      } else {
         this.field2452 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2448 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2477 = new int[var10];
      }

      if (var17 == 1) {
         this.field2458 = new int[var9][];
         this.field2462 = new int[var9][];
      }

      this.field2450 = new short[var10];
      var4.field2652 = var24;
      var5.field2652 = var34;
      var6.field2652 = var35;
      var7.field2652 = var23;
      var8.field2652 = var29;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.method1654();
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.method1665();
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.method1665();
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.method1665();
         }

         this.field2440[var40] = var37 + var42;
         this.field2441[var40] = var38 + var43;
         this.field2442[var40] = var39 + var44;
         var37 = this.field2440[var40];
         var38 = this.field2441[var40];
         var39 = this.field2442[var40];
         if (var16 == 1) {
            this.field2464[var40] = var8.method1654();
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.method1654();
            this.field2458[var40] = new int[var41];
            this.field2462[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.field2458[var40][var42] = var8.method1654();
               this.field2462[var40][var42] = var8.method1654();
            }
         }
      }

      var4.field2652 = var32;
      var5.field2652 = var28;
      var6.field2652 = var26;
      var7.field2652 = var30;
      var8.field2652 = var27;

      for(var40 = 0; var40 < var10; ++var40) {
         this.field2450[var40] = (short)var4.method1703();
         if (var12 == 1) {
            var41 = var5.method1654();
            if ((var41 & 1) == 1) {
               this.field2469[var40] = 1;
               var2 = true;
            } else {
               this.field2469[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.field2437[var40] = (byte)(var41 >> 2);
               this.field2451[var40] = this.field2450[var40];
               this.field2450[var40] = 127;
               if (this.field2451[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.field2437[var40] = -1;
               this.field2451[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.field2447[var40] = var6.method1655();
         }

         if (var14 == 1) {
            this.field2448[var40] = var7.method1655();
         }

         if (var15 == 1) {
            this.field2477[var40] = var8.method1654();
         }
      }

      var4.field2652 = var31;
      var5.field2652 = var25;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.method1654();
         if (var45 == 1) {
            var40 = var4.method1665() + var43;
            var41 = var4.method1665() + var40;
            var42 = var4.method1665() + var41;
            var43 = var42;
            this.field2443[var44] = var40;
            this.field2444[var44] = var41;
            this.field2445[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.method1665() + var43;
            var43 = var42;
            this.field2443[var44] = var40;
            this.field2444[var44] = var41;
            this.field2445[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.method1665() + var43;
            var43 = var42;
            this.field2443[var44] = var40;
            this.field2444[var44] = var41;
            this.field2445[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.method1665() + var43;
            var43 = var42;
            this.field2443[var44] = var40;
            this.field2444[var44] = var46;
            this.field2445[var44] = var42;
         }
      }

      var4.field2652 = var33;

      for(var44 = 0; var44 < var11; ++var44) {
         this.field2466[var44] = 0;
         this.field2454[var44] = (short)var4.method1703();
         this.field2456[var44] = (short)var4.method1703();
         this.field2474[var44] = (short)var4.method1703();
      }

      if (this.field2437 != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.field2437[var45] & 255;
            if (var46 != 255) {
               if ((this.field2454[var46] & '\uffff') == this.field2443[var45] && (this.field2456[var46] & '\uffff') == this.field2444[var45] && (this.field2474[var46] & '\uffff') == this.field2445[var45]) {
                  this.field2437[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.field2437 = null;
         }
      }

      if (!var3) {
         this.field2451 = null;
      }

      if (!var2) {
         this.field2469 = null;
      }

   }

   void method1518(byte[] var1) {
      class366 var2 = new class366(var1);
      class366 var3 = new class366(var1);
      class366 var4 = new class366(var1);
      class366 var5 = new class366(var1);
      class366 var6 = new class366(var1);
      class366 var7 = new class366(var1);
      class366 var8 = new class366(var1);
      var2.field2652 = var1.length - 23;
      int var9 = var2.method1703();
      int var10 = var2.method1703();
      int var11 = var2.method1654();
      int var12 = var2.method1654();
      int var13 = var2.method1654();
      int var14 = var2.method1654();
      int var15 = var2.method1654();
      int var16 = var2.method1654();
      int var17 = var2.method1654();
      int var18 = var2.method1703();
      int var19 = var2.method1703();
      int var20 = var2.method1703();
      int var21 = var2.method1703();
      int var22 = var2.method1703();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field2466 = new byte[var11];
         var2.field2652 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2466[var26] = var2.method1655();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2439 = var9;
      this.field2471 = var10;
      this.field2453 = var11;
      this.field2440 = new int[var9];
      this.field2441 = new int[var9];
      this.field2442 = new int[var9];
      this.field2443 = new int[var10];
      this.field2444 = new int[var10];
      this.field2445 = new int[var10];
      if (var17 == 1) {
         this.field2464 = new int[var9];
      }

      if (var12 == 1) {
         this.field2469 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2447 = new byte[var10];
      } else {
         this.field2452 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2448 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2477 = new int[var10];
      }

      if (var16 == 1) {
         this.field2451 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2437 = new byte[var10];
      }

      this.field2450 = new short[var10];
      if (var11 > 0) {
         this.field2454 = new short[var11];
         this.field2456 = new short[var11];
         this.field2474 = new short[var11];
      }

      var2.field2652 = var11;
      var3.field2652 = var38;
      var4.field2652 = var39;
      var5.field2652 = var40;
      var6.field2652 = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.method1654();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method1665();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method1665();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method1665();
         }

         this.field2440[var51] = var48 + var53;
         this.field2441[var51] = var49 + var54;
         this.field2442[var51] = var50 + var55;
         var48 = this.field2440[var51];
         var49 = this.field2441[var51];
         var50 = this.field2442[var51];
         if (var17 == 1) {
            this.field2464[var51] = var6.method1654();
         }
      }

      var2.field2652 = var37;
      var3.field2652 = var28;
      var4.field2652 = var30;
      var5.field2652 = var33;
      var6.field2652 = var31;
      var7.field2652 = var35;
      var8.field2652 = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2450[var51] = (short)var2.method1703();
         if (var12 == 1) {
            this.field2469[var51] = var3.method1655();
         }

         if (var13 == 255) {
            this.field2447[var51] = var4.method1655();
         }

         if (var14 == 1) {
            this.field2448[var51] = var5.method1655();
         }

         if (var15 == 1) {
            this.field2477[var51] = var6.method1654();
         }

         if (var16 == 1) {
            this.field2451[var51] = (short)(var7.method1703() - 1);
         }

         if (this.field2437 != null && this.field2451[var51] != -1) {
            this.field2437[var51] = (byte)(var8.method1654() - 1);
         }
      }

      var2.field2652 = var34;
      var3.field2652 = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.method1654();
         if (var56 == 1) {
            var51 = var2.method1665() + var54;
            var52 = var2.method1665() + var51;
            var53 = var2.method1665() + var52;
            var54 = var53;
            this.field2443[var55] = var51;
            this.field2444[var55] = var52;
            this.field2445[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.method1665() + var54;
            var54 = var53;
            this.field2443[var55] = var51;
            this.field2444[var55] = var52;
            this.field2445[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.method1665() + var54;
            var54 = var53;
            this.field2443[var55] = var51;
            this.field2444[var55] = var52;
            this.field2445[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method1665() + var54;
            var54 = var53;
            this.field2443[var55] = var51;
            this.field2444[var55] = var57;
            this.field2445[var55] = var53;
         }
      }

      var2.field2652 = var41;
      var3.field2652 = var42;
      var4.field2652 = var43;
      var5.field2652 = var44;
      var6.field2652 = var45;
      var7.field2652 = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2466[var55] & 255;
         if (var56 == 0) {
            this.field2454[var55] = (short)var2.method1703();
            this.field2456[var55] = (short)var2.method1703();
            this.field2474[var55] = (short)var2.method1703();
         }
      }

      var2.field2652 = var26;
      var55 = var2.method1654();
      if (var55 != 0) {
         new class111();
         var2.method1703();
         var2.method1703();
         var2.method1703();
         var2.method1658();
      }

   }

   void method1517(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class366 var4 = new class366(var1);
      class366 var5 = new class366(var1);
      class366 var6 = new class366(var1);
      class366 var7 = new class366(var1);
      class366 var8 = new class366(var1);
      var4.field2652 = var1.length - 18;
      int var9 = var4.method1703();
      int var10 = var4.method1703();
      int var11 = var4.method1654();
      int var12 = var4.method1654();
      int var13 = var4.method1654();
      int var14 = var4.method1654();
      int var15 = var4.method1654();
      int var16 = var4.method1654();
      int var17 = var4.method1703();
      int var18 = var4.method1703();
      int var19 = var4.method1703();
      int var20 = var4.method1703();
      int var21 = 0;
      byte var22 = (byte)var21;
      var21 += var9;
      int var23 = var21;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      int var29 = var21;
      var21 += var20;
      int var30 = var21;
      var21 += var10 * 2;
      int var31 = var21;
      var21 += var11 * 6;
      int var32 = var21;
      var21 += var17;
      int var33 = var21;
      var21 += var18;
      int var10000 = var21 + var19;
      this.field2439 = var9;
      this.field2471 = var10;
      this.field2453 = var11;
      this.field2440 = new int[var9];
      this.field2441 = new int[var9];
      this.field2442 = new int[var9];
      this.field2443 = new int[var10];
      this.field2444 = new int[var10];
      this.field2445 = new int[var10];
      if (var11 > 0) {
         this.field2466 = new byte[var11];
         this.field2454 = new short[var11];
         this.field2456 = new short[var11];
         this.field2474 = new short[var11];
      }

      if (var16 == 1) {
         this.field2464 = new int[var9];
      }

      if (var12 == 1) {
         this.field2469 = new byte[var10];
         this.field2437 = new byte[var10];
         this.field2451 = new short[var10];
      }

      if (var13 == 255) {
         this.field2447 = new byte[var10];
      } else {
         this.field2452 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2448 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2477 = new int[var10];
      }

      this.field2450 = new short[var10];
      var4.field2652 = var22;
      var5.field2652 = var32;
      var6.field2652 = var33;
      var7.field2652 = var21;
      var8.field2652 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method1654();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method1665();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method1665();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method1665();
         }

         this.field2440[var38] = var35 + var40;
         this.field2441[var38] = var36 + var41;
         this.field2442[var38] = var37 + var42;
         var35 = this.field2440[var38];
         var36 = this.field2441[var38];
         var37 = this.field2442[var38];
         if (var16 == 1) {
            this.field2464[var38] = var8.method1654();
         }
      }

      var4.field2652 = var30;
      var5.field2652 = var26;
      var6.field2652 = var24;
      var7.field2652 = var28;
      var8.field2652 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2450[var38] = (short)var4.method1703();
         if (var12 == 1) {
            var39 = var5.method1654();
            if ((var39 & 1) == 1) {
               this.field2469[var38] = 1;
               var2 = true;
            } else {
               this.field2469[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field2437[var38] = (byte)(var39 >> 2);
               this.field2451[var38] = this.field2450[var38];
               this.field2450[var38] = 127;
               if (this.field2451[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2437[var38] = -1;
               this.field2451[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field2447[var38] = var6.method1655();
         }

         if (var14 == 1) {
            this.field2448[var38] = var7.method1655();
         }

         if (var15 == 1) {
            this.field2477[var38] = var8.method1654();
         }
      }

      var4.field2652 = var29;
      var5.field2652 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method1654();
         if (var43 == 1) {
            var38 = var4.method1665() + var41;
            var39 = var4.method1665() + var38;
            var40 = var4.method1665() + var39;
            var41 = var40;
            this.field2443[var42] = var38;
            this.field2444[var42] = var39;
            this.field2445[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.method1665() + var41;
            var41 = var40;
            this.field2443[var42] = var38;
            this.field2444[var42] = var39;
            this.field2445[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.method1665() + var41;
            var41 = var40;
            this.field2443[var42] = var38;
            this.field2444[var42] = var39;
            this.field2445[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method1665() + var41;
            var41 = var40;
            this.field2443[var42] = var38;
            this.field2444[var42] = var44;
            this.field2445[var42] = var40;
         }
      }

      var4.field2652 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2466[var42] = 0;
         this.field2454[var42] = (short)var4.method1703();
         this.field2456[var42] = (short)var4.method1703();
         this.field2474[var42] = (short)var4.method1703();
      }

      if (this.field2437 != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2437[var43] & 255;
            if (var44 != 255) {
               if ((this.field2454[var44] & '\uffff') == this.field2443[var43] && (this.field2456[var44] & '\uffff') == this.field2444[var43] && (this.field2474[var44] & '\uffff') == this.field2445[var43]) {
                  this.field2437[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.field2437 = null;
         }
      }

      if (!var3) {
         this.field2451 = null;
      }

      if (!var2) {
         this.field2469 = null;
      }

   }

   final int method1494(class327 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2440[var2];
      int var5 = var1.field2441[var2];
      int var6 = var1.field2442[var2];

      for(int var7 = 0; var7 < this.field2439; ++var7) {
         if (var4 == this.field2440[var7] && var5 == this.field2441[var7] && var6 == this.field2442[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field2440[this.field2439] = var4;
         this.field2441[this.field2439] = var5;
         this.field2442[this.field2439] = var6;
         if (var1.field2464 != null) {
            this.field2464[this.field2439] = var1.field2464[var2];
         }

         if (var1.field2458 != null) {
            this.field2458[this.field2439] = var1.field2458[var2];
            this.field2462[this.field2439] = var1.field2462[var2];
         }

         var3 = this.field2439++;
      }

      return var3;
   }

   public class327 method1495() {
      class327 var1 = new class327();
      if (this.field2469 != null) {
         var1.field2469 = new byte[this.field2471];

         for(int var2 = 0; var2 < this.field2471; ++var2) {
            var1.field2469[var2] = this.field2469[var2];
         }
      }

      var1.field2439 = this.field2439;
      var1.field2471 = this.field2471;
      var1.field2453 = this.field2453;
      var1.field2440 = this.field2440;
      var1.field2441 = this.field2441;
      var1.field2442 = this.field2442;
      var1.field2443 = this.field2443;
      var1.field2444 = this.field2444;
      var1.field2445 = this.field2445;
      var1.field2447 = this.field2447;
      var1.field2448 = this.field2448;
      var1.field2437 = this.field2437;
      var1.field2450 = this.field2450;
      var1.field2451 = this.field2451;
      var1.field2452 = this.field2452;
      var1.field2466 = this.field2466;
      var1.field2454 = this.field2454;
      var1.field2456 = this.field2456;
      var1.field2474 = this.field2474;
      var1.field2464 = this.field2464;
      var1.field2477 = this.field2477;
      var1.field2459 = this.field2459;
      var1.field2460 = this.field2460;
      var1.field2449 = this.field2449;
      var1.field2463 = this.field2463;
      var1.field2478 = this.field2478;
      var1.field2467 = this.field2467;
      return var1;
   }

   public class327 method1496(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method1508();
      int var7 = var2 + this.field2470;
      int var8 = var2 + this.field2446;
      int var9 = var4 + this.field2473;
      int var10 = var4 + this.field2472;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class327 var11;
            if (var5) {
               var11 = new class327();
               var11.field2439 = this.field2439;
               var11.field2471 = this.field2471;
               var11.field2453 = this.field2453;
               var11.field2440 = this.field2440;
               var11.field2442 = this.field2442;
               var11.field2443 = this.field2443;
               var11.field2444 = this.field2444;
               var11.field2445 = this.field2445;
               var11.field2469 = this.field2469;
               var11.field2447 = this.field2447;
               var11.field2448 = this.field2448;
               var11.field2437 = this.field2437;
               var11.field2450 = this.field2450;
               var11.field2451 = this.field2451;
               var11.field2452 = this.field2452;
               var11.field2466 = this.field2466;
               var11.field2454 = this.field2454;
               var11.field2456 = this.field2456;
               var11.field2474 = this.field2474;
               var11.field2464 = this.field2464;
               var11.field2477 = this.field2477;
               var11.field2459 = this.field2459;
               var11.field2460 = this.field2460;
               var11.field2478 = this.field2478;
               var11.field2467 = this.field2467;
               var11.field2441 = new int[var11.field2439];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2439; ++var12) {
                  var13 = this.field2440[var12] + var2;
                  var14 = this.field2442[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2441[var12] = this.field2441[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2439; ++var12) {
                  var13 = (-this.field2441[var12] << 16) / super.field1058;
                  if (var13 < var6) {
                     var14 = this.field2440[var12] + var2;
                     var15 = this.field2442[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2441[var12] = this.field2441[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method1507();
            return var11;
         }
      } else {
         return this;
      }
   }

   void method1497() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.field2464 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2439; ++var3) {
            var4 = this.field2464[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2459 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2459[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2439; this.field2459[var4][var1[var4]++] = var3++) {
            var4 = this.field2464[var3];
         }

         this.field2464 = null;
      }

      if (this.field2477 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2471; ++var3) {
            var4 = this.field2477[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2460 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2460[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2471; this.field2460[var4][var1[var4]++] = var3++) {
            var4 = this.field2477[var3];
         }

         this.field2477 = null;
      }

   }

   public void method1498() {
      for(int var1 = 0; var1 < this.field2439; ++var1) {
         int var2 = this.field2440[var1];
         this.field2440[var1] = this.field2442[var1];
         this.field2442[var1] = -var2;
      }

      this.method1507();
   }

   public void method1499() {
      for(int var1 = 0; var1 < this.field2439; ++var1) {
         this.field2440[var1] = -this.field2440[var1];
         this.field2442[var1] = -this.field2442[var1];
      }

      this.method1507();
   }

   public void method1500() {
      for(int var1 = 0; var1 < this.field2439; ++var1) {
         int var2 = this.field2442[var1];
         this.field2442[var1] = this.field2440[var1];
         this.field2440[var1] = -var2;
      }

      this.method1507();
   }

   public void method1501(int var1) {
      int var2 = field2438[var1];
      int var3 = field2461[var1];

      for(int var4 = 0; var4 < this.field2439; ++var4) {
         int var5 = this.field2442[var4] * var2 + this.field2440[var4] * var3 >> 16;
         this.field2442[var4] = this.field2442[var4] * var3 - this.field2440[var4] * var2 >> 16;
         this.field2440[var4] = var5;
      }

      this.method1507();
   }

   public void method1502(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2439; ++var4) {
         int[] var10000 = this.field2440;
         var10000[var4] += var1;
         var10000 = this.field2441;
         var10000[var4] += var2;
         var10000 = this.field2442;
         var10000[var4] += var3;
      }

      this.method1507();
   }

   public void method1513(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2471; ++var3) {
         if (this.field2450[var3] == var1) {
            this.field2450[var3] = var2;
         }
      }

   }

   public void method1504(short var1, short var2) {
      if (this.field2451 != null) {
         for(int var3 = 0; var3 < this.field2471; ++var3) {
            if (this.field2451[var3] == var1) {
               this.field2451[var3] = var2;
            }
         }

      }
   }

   public void method1503() {
      int var1;
      for(var1 = 0; var1 < this.field2439; ++var1) {
         this.field2442[var1] = -this.field2442[var1];
      }

      for(var1 = 0; var1 < this.field2471; ++var1) {
         int var2 = this.field2443[var1];
         this.field2443[var1] = this.field2445[var1];
         this.field2445[var1] = var2;
      }

      this.method1507();
   }

   public void method1505(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2439; ++var4) {
         this.field2440[var4] = this.field2440[var4] * var1 / 128;
         this.field2441[var4] = this.field2441[var4] * var2 / 128;
         this.field2442[var4] = this.field2442[var4] * var3 / 128;
      }

      this.method1507();
   }

   public void method1506() {
      if (this.field2449 == null) {
         this.field2449 = new class363[this.field2439];

         int var1;
         for(var1 = 0; var1 < this.field2439; ++var1) {
            this.field2449[var1] = new class363();
         }

         for(var1 = 0; var1 < this.field2471; ++var1) {
            int var2 = this.field2443[var1];
            int var3 = this.field2444[var1];
            int var4 = this.field2445[var1];
            int var5 = this.field2440[var3] - this.field2440[var2];
            int var6 = this.field2441[var3] - this.field2441[var2];
            int var7 = this.field2442[var3] - this.field2442[var2];
            int var8 = this.field2440[var4] - this.field2440[var2];
            int var9 = this.field2441[var4] - this.field2441[var2];
            int var10 = this.field2442[var4] - this.field2442[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field2469 == null) {
               var15 = 0;
            } else {
               var15 = this.field2469[var1];
            }

            if (var15 == 0) {
               class363 var16 = this.field2449[var2];
               var16.field2612 += var11;
               var16.field2611 += var12;
               var16.field2613 += var13;
               ++var16.field2614;
               var16 = this.field2449[var3];
               var16.field2612 += var11;
               var16.field2611 += var12;
               var16.field2613 += var13;
               ++var16.field2614;
               var16 = this.field2449[var4];
               var16.field2612 += var11;
               var16.field2611 += var12;
               var16.field2613 += var13;
               ++var16.field2614;
            } else if (var15 == 1) {
               if (this.field2463 == null) {
                  this.field2463 = new class489[this.field2471];
               }

               class489 var17 = this.field2463[var1] = new class489();
               var17.field3925 = var11;
               var17.field3924 = var12;
               var17.field3926 = var13;
            }
         }

      }
   }

   void method1507() {
      this.field2449 = null;
      this.field2465 = null;
      this.field2463 = null;
      this.field2468 = false;
   }

   void method1508() {
      if (!this.field2468) {
         super.field1058 = 0;
         this.field2476 = 0;
         this.field2470 = 999999;
         this.field2446 = -999999;
         this.field2472 = -99999;
         this.field2473 = 99999;

         for(int var1 = 0; var1 < this.field2439; ++var1) {
            int var2 = this.field2440[var1];
            int var3 = this.field2441[var1];
            int var4 = this.field2442[var1];
            if (var2 < this.field2470) {
               this.field2470 = var2;
            }

            if (var2 > this.field2446) {
               this.field2446 = var2;
            }

            if (var4 < this.field2473) {
               this.field2473 = var4;
            }

            if (var4 > this.field2472) {
               this.field2472 = var4;
            }

            if (-var3 > super.field1058) {
               super.field1058 = -var3;
            }

            if (var3 > this.field2476) {
               this.field2476 = var3;
            }
         }

         this.field2468 = true;
      }
   }

   public final class485 method1510(int var1, int var2, int var3, int var4, int var5) {
      this.method1506();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class485 var8 = new class485();
      var8.field3846 = new int[this.field2471];
      var8.field3847 = new int[this.field2471];
      var8.field3848 = new int[this.field2471];
      if (this.field2453 > 0 && this.field2437 != null) {
         int[] var9 = new int[this.field2453];

         int var10;
         for(var10 = 0; var10 < this.field2471; ++var10) {
            if (this.field2437[var10] != -1) {
               ++var9[this.field2437[var10] & 255];
            }
         }

         var8.field3854 = 0;

         for(var10 = 0; var10 < this.field2453; ++var10) {
            if (var9[var10] > 0 && this.field2466[var10] == 0) {
               ++var8.field3854;
            }
         }

         var8.field3855 = new int[var8.field3854];
         var8.field3856 = new int[var8.field3854];
         var8.field3849 = new int[var8.field3854];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2453; ++var11) {
            if (var9[var11] > 0 && this.field2466[var11] == 0) {
               var8.field3855[var10] = this.field2454[var11] & '\uffff';
               var8.field3856[var10] = this.field2456[var11] & '\uffff';
               var8.field3849[var10] = this.field2474[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field3851 = new byte[this.field2471];

         for(var11 = 0; var11 < this.field2471; ++var11) {
            if (this.field2437[var11] != -1) {
               var8.field3851[var11] = (byte)var9[this.field2437[var11] & 255];
            } else {
               var8.field3851[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2471; ++var16) {
         byte var17;
         if (this.field2469 == null) {
            var17 = 0;
         } else {
            var17 = this.field2469[var16];
         }

         byte var18;
         if (this.field2448 == null) {
            var18 = 0;
         } else {
            var18 = this.field2448[var16];
         }

         short var12;
         if (this.field2451 == null) {
            var12 = -1;
         } else {
            var12 = this.field2451[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class363 var13;
         int var14;
         class489 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field2463[var16];
                  var14 = var1 + (var3 * var19.field3925 + var4 * var19.field3924 + var5 * var19.field3926) / (var7 + var7 / 2);
                  var8.field3846[var16] = method1515(this.field2450[var16] & '\uffff', var14);
                  var8.field3848[var16] = -1;
               } else if (var17 == 3) {
                  var8.field3846[var16] = 128;
                  var8.field3848[var16] = -1;
               } else {
                  var8.field3848[var16] = -2;
               }
            } else {
               int var15 = this.field2450[var16] & '\uffff';
               if (this.field2465 != null && this.field2465[this.field2443[var16]] != null) {
                  var13 = this.field2465[this.field2443[var16]];
               } else {
                  var13 = this.field2449[this.field2443[var16]];
               }

               var14 = var1 + (var3 * var13.field2612 + var4 * var13.field2611 + var5 * var13.field2613) / (var7 * var13.field2614);
               var8.field3846[var16] = method1515(var15, var14);
               if (this.field2465 != null && this.field2465[this.field2444[var16]] != null) {
                  var13 = this.field2465[this.field2444[var16]];
               } else {
                  var13 = this.field2449[this.field2444[var16]];
               }

               var14 = var1 + (var3 * var13.field2612 + var4 * var13.field2611 + var5 * var13.field2613) / (var7 * var13.field2614);
               var8.field3847[var16] = method1515(var15, var14);
               if (this.field2465 != null && this.field2465[this.field2445[var16]] != null) {
                  var13 = this.field2465[this.field2445[var16]];
               } else {
                  var13 = this.field2449[this.field2445[var16]];
               }

               var14 = var1 + (var3 * var13.field2612 + var4 * var13.field2611 + var5 * var13.field2613) / (var7 * var13.field2614);
               var8.field3848[var16] = method1515(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field2463[var16];
               var14 = var1 + (var3 * var19.field3925 + var4 * var19.field3924 + var5 * var19.field3926) / (var7 + var7 / 2);
               var8.field3846[var16] = method1511(var14);
               var8.field3848[var16] = -1;
            } else {
               var8.field3848[var16] = -2;
            }
         } else {
            if (this.field2465 != null && this.field2465[this.field2443[var16]] != null) {
               var13 = this.field2465[this.field2443[var16]];
            } else {
               var13 = this.field2449[this.field2443[var16]];
            }

            var14 = var1 + (var3 * var13.field2612 + var4 * var13.field2611 + var5 * var13.field2613) / (var7 * var13.field2614);
            var8.field3846[var16] = method1511(var14);
            if (this.field2465 != null && this.field2465[this.field2444[var16]] != null) {
               var13 = this.field2465[this.field2444[var16]];
            } else {
               var13 = this.field2449[this.field2444[var16]];
            }

            var14 = var1 + (var3 * var13.field2612 + var4 * var13.field2611 + var5 * var13.field2613) / (var7 * var13.field2614);
            var8.field3847[var16] = method1511(var14);
            if (this.field2465 != null && this.field2465[this.field2445[var16]] != null) {
               var13 = this.field2465[this.field2445[var16]];
            } else {
               var13 = this.field2449[this.field2445[var16]];
            }

            var14 = var1 + (var3 * var13.field2612 + var4 * var13.field2611 + var5 * var13.field2613) / (var7 * var13.field2614);
            var8.field3848[var16] = method1511(var14);
         }
      }

      this.method1497();
      var8.field3894 = this.field2439;
      var8.field3840 = this.field2440;
      var8.field3841 = this.field2441;
      var8.field3845 = this.field2442;
      var8.field3842 = this.field2471;
      var8.field3857 = this.field2443;
      var8.field3844 = this.field2444;
      var8.field3902 = this.field2445;
      var8.field3901 = this.field2447;
      var8.field3850 = this.field2448;
      var8.field3853 = this.field2452;
      var8.field3858 = this.field2459;
      var8.field3859 = this.field2460;
      var8.field3852 = this.field2451;
      var8.field3860 = this.field2458;
      var8.field3884 = this.field2462;
      return var8;
   }

   public static class327 method1514(class509 var0, int var1, int var2) {
      byte[] var3 = var0.method2422(var1, var2);
      return var3 == null ? null : new class327(var3);
   }

   static void method1509(class327 var0, class327 var1, int var2, int var3, int var4, boolean var5) {
      var0.method1508();
      var0.method1506();
      var1.method1508();
      var1.method1506();
      ++field2455;
      int var6 = 0;
      int[] var7 = var1.field2440;
      int var8 = var1.field2439;

      int var9;
      for(var9 = 0; var9 < var0.field2439; ++var9) {
         class363 var10 = var0.field2449[var9];
         if (var10.field2614 != 0) {
            int var11 = var0.field2441[var9] - var3;
            if (var11 <= var1.field2476) {
               int var12 = var0.field2440[var9] - var2;
               if (var12 >= var1.field2470 && var12 <= var1.field2446) {
                  int var13 = var0.field2442[var9] - var4;
                  if (var13 >= var1.field2473 && var13 <= var1.field2472) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class363 var15 = var1.field2449[var14];
                        if (var12 == var7[var14] && var13 == var1.field2442[var14] && var11 == var1.field2441[var14] && var15.field2614 != 0) {
                           if (var0.field2465 == null) {
                              var0.field2465 = new class363[var0.field2439];
                           }

                           if (var1.field2465 == null) {
                              var1.field2465 = new class363[var8];
                           }

                           class363 var16 = var0.field2465[var9];
                           if (var16 == null) {
                              var16 = var0.field2465[var9] = new class363(var10);
                           }

                           class363 var17 = var1.field2465[var14];
                           if (var17 == null) {
                              var17 = var1.field2465[var14] = new class363(var15);
                           }

                           var16.field2612 += var15.field2612;
                           var16.field2611 += var15.field2611;
                           var16.field2613 += var15.field2613;
                           var16.field2614 += var15.field2614;
                           var17.field2612 += var10.field2612;
                           var17.field2611 += var10.field2611;
                           var17.field2613 += var10.field2613;
                           var17.field2614 += var10.field2614;
                           ++var6;
                           field2457[var9] = field2455;
                           field2475[var14] = field2455;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2471; ++var9) {
            if (field2457[var0.field2443[var9]] == field2455 && field2457[var0.field2444[var9]] == field2455 && field2457[var0.field2445[var9]] == field2455) {
               if (var0.field2469 == null) {
                  var0.field2469 = new byte[var0.field2471];
               }

               var0.field2469[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2471; ++var9) {
            if (field2475[var1.field2443[var9]] == field2455 && field2475[var1.field2444[var9]] == field2455 && field2475[var1.field2445[var9]] == field2455) {
               if (var1.field2469 == null) {
                  var1.field2469 = new byte[var1.field2471];
               }

               var1.field2469[var9] = 2;
            }
         }

      }
   }

   static final int method1515(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static final int method1511(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
