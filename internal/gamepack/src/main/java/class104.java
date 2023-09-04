import java.util.Arrays;
import java.util.HashMap;

public class class104 extends class496 {
   static boolean field1403 = true;
   static boolean[] field1379 = new boolean[6500];
   static boolean[] field1380 = new boolean[6500];
   static byte[] field1345 = new byte[1];
   static byte[] field1409 = new byte[1];
   static char[] field1389 = new char[6000];
   static char[][] field1390 = new char[6000][512];
   static class104 field1344 = new class104();
   static class104 field1383 = new class104();
   static class120 field1346 = new class120();
   static class120 field1347 = new class120();
   static class120 field1348 = new class120();
   static float[] field1387 = new float[6500];
   static float[] field1401 = new float[10];
   static int field1400;
   static int field1402;
   static int field1413;
   static int[] field1349 = new int[2000];
   static int[] field1371;
   static int[] field1381 = new int[6500];
   static int[] field1382 = new int[6500];
   static int[] field1384 = new int[6500];
   static int[] field1385 = new int[6500];
   static int[] field1386 = new int[6500];
   static int[] field1391 = new int[12];
   static int[] field1392 = new int[6500];
   static int[] field1393 = new int[2000];
   static int[] field1395 = new int[12];
   static int[] field1396 = new int[10];
   static int[] field1397 = new int[10];
   static int[] field1398 = new int[10];
   static int[] field1405;
   static int[] field1406;
   static int[] field1407;
   static int[][] field1388 = new int[12][2000];
   static final float field1410;
   byte[] field1360;
   byte[] field1361;
   byte[] field1411;
   int field1372;
   int field1373;
   int field1374;
   int field1375;
   int field1399;
   int[] field1350;
   int[] field1351;
   int[] field1354;
   int[] field1355;
   int[] field1356;
   int[] field1357;
   int[] field1358;
   int[] field1359;
   int[] field1365;
   int[] field1366;
   int[] field1367;
   int[] field1412;
   int[][] field1368;
   int[][] field1369;
   int[][] field1370;
   int[][] field1394;
   HashMap field1377 = new HashMap();
   short[] field1362;
   public boolean field1353 = false;
   public byte field1363 = 0;
   public byte field1376;
   public byte field1378;
   public byte field1408;
   public byte field1414;
   public int field1352 = 0;
   public int field1364 = 0;
   public int field1404 = 0;
   public short field1415;

   static {
      field1405 = class399.field3109;
      field1406 = class399.field3107;
      field1407 = class399.field3106;
      field1371 = class399.field3108;
      field1410 = class243.method1447(50);
   }

   class104() {
   }

   public class104(class104[] var1, int var2) {
      this.field1404 = 0;
      this.field1352 = 0;
      this.field1364 = 0;
      this.field1363 = -1;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         class104 var4 = var1[var3];
         if (var4 != null) {
            this.field1404 += var4.field1404;
            this.field1352 += var4.field1352;
            this.field1364 += var4.field1364;
            if (this.field1363 == -1) {
               this.field1363 = var4.field1363;
            }
         }
      }

      this.method754(this.field1404, this.field1352, this.field1364);
      this.field1404 = 0;
      this.field1352 = 0;
      this.field1364 = 0;

      for(var3 = 0; var3 < var2; ++var3) {
         this.method781(var1[var3]);
      }

   }

   public class104(int var1, int var2, int var3, byte var4) {
      this.method754(var1, var2, var3);
      this.field1363 = var4;
      this.field1404 = 0;
      this.field1352 = 0;
      this.field1364 = 0;
   }

   void method754(int var1, int var2, int var3) {
      this.field1350 = new int[var1];
      this.field1351 = new int[var1];
      this.field1355 = new int[var1];
      this.field1367 = new int[var2];
      this.field1354 = new int[var2];
      this.field1412 = new int[var2];
      this.field1356 = new int[var2];
      this.field1357 = new int[var2];
      this.field1358 = new int[var2];
      if (var3 > 0) {
         this.field1365 = new int[var3];
         this.field1366 = new int[var3];
         this.field1359 = new int[var3];
      }

   }

   void method786(class104 var1) {
      int var2 = this.field1367.length;
      if (this.field1411 == null && (var1.field1411 != null || this.field1363 != var1.field1363)) {
         this.field1411 = new byte[var2];
         Arrays.fill(this.field1411, this.field1363);
      }

      if (this.field1360 == null && var1.field1360 != null) {
         this.field1360 = new byte[var2];
         Arrays.fill(this.field1360, (byte)0);
      }

      if (this.field1362 == null && var1.field1362 != null) {
         this.field1362 = new short[var2];
         Arrays.fill(this.field1362, (short)-1);
      }

      if (this.field1361 == null && var1.field1361 != null) {
         this.field1361 = new byte[var2];
         Arrays.fill(this.field1361, (byte)-1);
      }

   }

   public void method781(class104 var1) {
      if (var1 != null) {
         this.method786(var1);

         int var2;
         for(var2 = 0; var2 < var1.field1352; ++var2) {
            this.field1367[this.field1352] = var1.field1367[var2] + this.field1404;
            this.field1354[this.field1352] = var1.field1354[var2] + this.field1404;
            this.field1412[this.field1352] = var1.field1412[var2] + this.field1404;
            this.field1356[this.field1352] = var1.field1356[var2];
            this.field1357[this.field1352] = var1.field1357[var2];
            this.field1358[this.field1352] = var1.field1358[var2];
            if (this.field1411 != null) {
               this.field1411[this.field1352] = var1.field1411 != null ? var1.field1411[var2] : var1.field1363;
            }

            if (this.field1360 != null && var1.field1360 != null) {
               this.field1360[this.field1352] = var1.field1360[var2];
            }

            if (this.field1362 != null) {
               this.field1362[this.field1352] = var1.field1362 != null ? var1.field1362[var2] : -1;
            }

            if (this.field1361 != null) {
               if (var1.field1361 != null && var1.field1361[var2] != -1) {
                  this.field1361[this.field1352] = (byte)(var1.field1361[var2] + this.field1364);
               } else {
                  this.field1361[this.field1352] = -1;
               }
            }

            ++this.field1352;
         }

         for(var2 = 0; var2 < var1.field1364; ++var2) {
            this.field1365[this.field1364] = var1.field1365[var2] + this.field1404;
            this.field1366[this.field1364] = var1.field1366[var2] + this.field1404;
            this.field1359[this.field1364] = var1.field1359[var2] + this.field1404;
            ++this.field1364;
         }

         for(var2 = 0; var2 < var1.field1404; ++var2) {
            this.field1350[this.field1404] = var1.field1350[var2];
            this.field1351[this.field1404] = var1.field1351[var2];
            this.field1355[this.field1404] = var1.field1355[var2];
            ++this.field1404;
         }

      }
   }

   public class104 method756(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method758();
      int var7 = var2 - this.field1374;
      int var8 = var2 + this.field1374;
      int var9 = var4 - this.field1374;
      int var10 = var4 + this.field1374;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class104 var11;
            if (var5) {
               var11 = new class104();
               var11.field1404 = this.field1404;
               var11.field1352 = this.field1352;
               var11.field1364 = this.field1364;
               var11.field1350 = this.field1350;
               var11.field1355 = this.field1355;
               var11.field1367 = this.field1367;
               var11.field1354 = this.field1354;
               var11.field1412 = this.field1412;
               var11.field1356 = this.field1356;
               var11.field1357 = this.field1357;
               var11.field1358 = this.field1358;
               var11.field1411 = this.field1411;
               var11.field1360 = this.field1360;
               var11.field1361 = this.field1361;
               var11.field1362 = this.field1362;
               var11.field1363 = this.field1363;
               var11.field1365 = this.field1365;
               var11.field1366 = this.field1366;
               var11.field1359 = this.field1359;
               var11.field1368 = this.field1368;
               var11.field1369 = this.field1369;
               var11.field1353 = this.field1353;
               var11.field1351 = new int[var11.field1404];
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
               for(var12 = 0; var12 < var11.field1404; ++var12) {
                  var13 = this.field1350[var12] + var2;
                  var14 = this.field1355[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field1351[var12] = this.field1351[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field1404; ++var12) {
                  var13 = (-this.field1351[var12] << 16) / super.field3926;
                  if (var13 < var6) {
                     var14 = this.field1350[var12] + var2;
                     var15 = this.field1355[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field1351[var12] = this.field1351[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method761();
            return var11;
         }
      } else {
         return this;
      }
   }

   public class104 method757(boolean var1) {
      if (!var1 && field1409.length < this.field1352) {
         field1409 = new byte[this.field1352 + 100];
      }

      return this.method780(var1, field1383, field1409);
   }

   public class104 method784(boolean var1) {
      if (!var1 && field1345.length < this.field1352) {
         field1345 = new byte[this.field1352 + 100];
      }

      return this.method780(var1, field1344, field1345);
   }

   class104 method780(boolean var1, class104 var2, byte[] var3) {
      var2.field1404 = this.field1404;
      var2.field1352 = this.field1352;
      var2.field1364 = this.field1364;
      if (var2.field1350 == null || var2.field1350.length < this.field1404) {
         var2.field1350 = new int[this.field1404 + 100];
         var2.field1351 = new int[this.field1404 + 100];
         var2.field1355 = new int[this.field1404 + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.field1404; ++var4) {
         var2.field1350[var4] = this.field1350[var4];
         var2.field1351[var4] = this.field1351[var4];
         var2.field1355[var4] = this.field1355[var4];
      }

      if (var1) {
         var2.field1360 = this.field1360;
      } else {
         var2.field1360 = var3;
         if (this.field1360 == null) {
            for(var4 = 0; var4 < this.field1352; ++var4) {
               var2.field1360[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.field1352; ++var4) {
               var2.field1360[var4] = this.field1360[var4];
            }
         }
      }

      var2.field1367 = this.field1367;
      var2.field1354 = this.field1354;
      var2.field1412 = this.field1412;
      var2.field1356 = this.field1356;
      var2.field1357 = this.field1357;
      var2.field1358 = this.field1358;
      var2.field1411 = this.field1411;
      var2.field1361 = this.field1361;
      var2.field1362 = this.field1362;
      var2.field1363 = this.field1363;
      var2.field1365 = this.field1365;
      var2.field1366 = this.field1366;
      var2.field1359 = this.field1359;
      var2.field1368 = this.field1368;
      var2.field1369 = this.field1369;
      var2.field1370 = this.field1370;
      var2.field1394 = this.field1394;
      var2.field1353 = this.field1353;
      var2.method761();
      var2.field1414 = 0;
      return var2;
   }

   void method788(int var1) {
      if (!this.field1377.containsKey(var1)) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = field1406[var1];
         int var9 = field1405[var1];

         for(int var10 = 0; var10 < this.field1404; ++var10) {
            int var12 = this.field1350[var10];
            int var13 = this.field1355[var10];
            int var11 = var12 * var8 + var13 * var9 >> 16;
            int var15 = this.field1351[var10];
            int var17 = this.field1350[var10];
            int var18 = this.field1355[var10];
            int var16 = var18 * var8 - var9 * var17 >> 16;
            if (var11 < var2) {
               var2 = var11;
            }

            if (var11 > var5) {
               var5 = var11;
            }

            if (var15 < var3) {
               var3 = var15;
            }

            if (var15 > var6) {
               var6 = var15;
            }

            if (var16 < var4) {
               var4 = var16;
            }

            if (var16 > var7) {
               var7 = var16;
            }
         }

         class111 var20 = new class111((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
         boolean var21 = true;
         if (var20.field1444 < 32) {
            var20.field1444 = 32;
         }

         if (var20.field1446 < 32) {
            var20.field1446 = 32;
         }

         if (this.field1353) {
            boolean var22 = true;
            var20.field1444 += 8;
            var20.field1446 += 8;
         }

         this.field1377.put(var1, var20);
      }
   }

   public void method758() {
      if (this.field1372 != 1) {
         this.field1372 = 1;
         super.field3926 = 0;
         this.field1373 = 0;
         this.field1374 = 0;

         for(int var1 = 0; var1 < this.field1404; ++var1) {
            int var2 = this.field1350[var1];
            int var3 = this.field1351[var1];
            int var4 = this.field1355[var1];
            if (-var3 > super.field3926) {
               super.field3926 = -var3;
            }

            if (var3 > this.field1373) {
               this.field1373 = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1374) {
               this.field1374 = var5;
            }
         }

         this.field1374 = (int)(Math.sqrt((double)this.field1374) + 0.99);
         this.field1399 = (int)(Math.sqrt((double)(this.field1374 * this.field1374 + super.field3926 * super.field3926)) + 0.99);
         this.field1375 = this.field1399 + (int)(Math.sqrt((double)(this.field1374 * this.field1374 + this.field1373 * this.field1373)) + 0.99);
      }
   }

   void method787() {
      if (this.field1372 != 2) {
         this.field1372 = 2;
         this.field1374 = 0;

         for(int var1 = 0; var1 < this.field1404; ++var1) {
            int var2 = this.field1350[var1];
            int var3 = this.field1351[var1];
            int var4 = this.field1355[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > this.field1374) {
               this.field1374 = var5;
            }
         }

         this.field1374 = (int)(Math.sqrt((double)this.field1374) + 0.99);
         this.field1399 = this.field1374;
         this.field1375 = this.field1374 + this.field1374;
      }
   }

   public int method760() {
      this.method758();
      return this.field1374;
   }

   public void method761() {
      this.field1372 = 0;
      this.field1377.clear();
   }

   public void method783(class488 var1, int var2) {
      if (this.field1368 != null) {
         if (var2 != -1) {
            class447 var3 = var1.field3853[var2];
            class370 var4 = var3.field3393;
            field1400 = 0;
            field1413 = 0;
            field1402 = 0;

            for(int var5 = 0; var5 < var3.field3396; ++var5) {
               int var6 = var3.field3395[var5];
               this.method767(var4.field2898[var6], var4.field2899[var6], var3.field3399[var5], var3.field3400[var5], var3.field3401[var5]);
            }

            this.method761();
         }
      }
   }

   public void method762(class495 var1, int var2) {
      class370 var3 = var1.field3918;
      class226 var4 = var3.method1861();
      if (var4 != null) {
         var3.method1861().method1338(var1, var2);
         this.method789(var3.method1861(), var1.method2394());
      }

      if (var1.method2395()) {
         this.method763(var1, var2);
      }

      this.method761();
   }

   void method763(class495 var1, int var2) {
      class370 var3 = var1.field3918;

      for(int var4 = 0; var4 < var3.field2897; ++var4) {
         int var5 = var3.field2898[var4];
         if (var5 == 5 && var1.field3923 != null && var1.field3923[var4] != null && var1.field3923[var4][0] != null && this.field1369 != null && this.field1360 != null) {
            class75 var6 = var1.field3923[var4][0];
            int[] var7 = var3.field2899[var4];
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               int var10 = var7[var9];
               if (var10 < this.field1369.length) {
                  int[] var11 = this.field1369[var10];

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     int var13 = var11[var12];
                     int var14 = (int)((float)(this.field1360[var13] & 255) + var6.method690(var2) * 255.0F);
                     if (var14 < 0) {
                        var14 = 0;
                     } else if (var14 > 255) {
                        var14 = 255;
                     }

                     this.field1360[var13] = (byte)var14;
                  }
               }
            }
         }
      }

   }

   void method789(class226 var1, int var2) {
      this.method782(var1, var2);
   }

   public void method775(class488 var1, int var2, class488 var3, int var4, int[] var5) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            class447 var6 = var1.field3853[var2];
            class447 var7 = var3.field3853[var4];
            class370 var8 = var6.field3393;
            field1400 = 0;
            field1413 = 0;
            field1402 = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.field3396; ++var11) {
               for(var12 = var6.field3395[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 != var10 || var8.field2898[var12] == 0) {
                  this.method767(var8.field2898[var12], var8.field2899[var12], var6.field3399[var11], var6.field3400[var11], var6.field3401[var11]);
               }
            }

            field1400 = 0;
            field1413 = 0;
            field1402 = 0;
            byte var13 = 0;
            var9 = var13 + 1;
            var10 = var5[var13];

            for(var11 = 0; var11 < var7.field3396; ++var11) {
               for(var12 = var7.field3395[var11]; var12 > var10; var10 = var5[var9++]) {
               }

               if (var12 == var10 || var8.field2898[var12] == 0) {
                  this.method767(var8.field2898[var12], var8.field2899[var12], var7.field3399[var11], var7.field3400[var11], var7.field3401[var11]);
               }
            }

            this.method761();
         } else {
            this.method783(var1, var2);
         }
      }
   }

   public void method765(class370 var1, class495 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
      class226 var7 = var1.method1861();
      if (var7 != null) {
         var7.method1339(var2, var3, var4, var5);
         if (var6) {
            this.method789(var7, var2.method2394());
         }
      }

      if (!var5 && var2.method2395()) {
         this.method763(var2, var3);
      }

   }

   public void method766(class488 var1, int var2, int[] var3, boolean var4) {
      if (var3 == null) {
         this.method783(var1, var2);
      } else {
         class447 var5 = var1.field3853[var2];
         class370 var6 = var5.field3393;
         int var7 = 0;
         int var8 = var3[var7++];
         field1400 = 0;
         field1413 = 0;
         field1402 = 0;

         for(int var9 = 0; var9 < var5.field3396; ++var9) {
            int var10;
            for(var10 = var5.field3395[var9]; var10 > var8; var8 = var3[var7++]) {
            }

            if (var4) {
               if (var10 == var8 || var6.field2898[var10] == 0) {
                  this.method767(var6.field2898[var10], var6.field2899[var10], var5.field3399[var9], var5.field3400[var9], var5.field3401[var9]);
               }
            } else if (var10 != var8 || var6.field2898[var10] == 0) {
               this.method767(var6.field2898[var10], var6.field2899[var10], var5.field3399[var9], var5.field3400[var9], var5.field3401[var9]);
            }
         }

      }
   }

   void method767(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if (var1 == 0) {
         var7 = 0;
         field1400 = 0;
         field1413 = 0;
         field1402 = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var18 = var2[var8];
            if (var18 < this.field1368.length) {
               int[] var19 = this.field1368[var18];

               for(var11 = 0; var11 < var19.length; ++var11) {
                  var12 = var19[var11];
                  field1400 += this.field1350[var12];
                  field1413 += this.field1351[var12];
                  field1402 += this.field1355[var12];
                  ++var7;
               }
            }
         }

         if (var7 > 0) {
            field1400 = field1400 / var7 + var3;
            field1413 = field1413 / var7 + var4;
            field1402 = field1402 / var7 + var5;
         } else {
            field1400 = var3;
            field1413 = var4;
            field1402 = var5;
         }

      } else {
         int[] var9;
         int var10;
         int[] var10000;
         if (var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1368.length) {
                  var9 = this.field1368[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field1350;
                     var10000[var11] += var3;
                     var10000 = this.field1351;
                     var10000[var11] += var4;
                     var10000 = this.field1355;
                     var10000[var11] += var5;
                  }
               }
            }

         } else if (var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1368.length) {
                  var9 = this.field1368[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field1350;
                     var10000[var11] -= field1400;
                     var10000 = this.field1351;
                     var10000[var11] -= field1413;
                     var10000 = this.field1355;
                     var10000[var11] -= field1402;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if (var14 != 0) {
                        var15 = field1405[var14];
                        var16 = field1406[var14];
                        var17 = this.field1351[var11] * var15 + this.field1350[var11] * var16 >> 16;
                        this.field1351[var11] = this.field1351[var11] * var16 - this.field1350[var11] * var15 >> 16;
                        this.field1350[var11] = var17;
                     }

                     if (var12 != 0) {
                        var15 = field1405[var12];
                        var16 = field1406[var12];
                        var17 = this.field1351[var11] * var16 - this.field1355[var11] * var15 >> 16;
                        this.field1355[var11] = this.field1351[var11] * var15 + this.field1355[var11] * var16 >> 16;
                        this.field1351[var11] = var17;
                     }

                     if (var13 != 0) {
                        var15 = field1405[var13];
                        var16 = field1406[var13];
                        var17 = this.field1355[var11] * var15 + this.field1350[var11] * var16 >> 16;
                        this.field1355[var11] = this.field1355[var11] * var16 - this.field1350[var11] * var15 >> 16;
                        this.field1350[var11] = var17;
                     }

                     var10000 = this.field1350;
                     var10000[var11] += field1400;
                     var10000 = this.field1351;
                     var10000[var11] += field1413;
                     var10000 = this.field1355;
                     var10000[var11] += field1402;
                  }
               }
            }

         } else if (var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if (var8 < this.field1368.length) {
                  var9 = this.field1368[var8];

                  for(var10 = 0; var10 < var9.length; ++var10) {
                     var11 = var9[var10];
                     var10000 = this.field1350;
                     var10000[var11] -= field1400;
                     var10000 = this.field1351;
                     var10000[var11] -= field1413;
                     var10000 = this.field1355;
                     var10000[var11] -= field1402;
                     this.field1350[var11] = this.field1350[var11] * var3 / 128;
                     this.field1351[var11] = this.field1351[var11] * var4 / 128;
                     this.field1355[var11] = this.field1355[var11] * var5 / 128;
                     var10000 = this.field1350;
                     var10000[var11] += field1400;
                     var10000 = this.field1351;
                     var10000[var11] += field1413;
                     var10000 = this.field1355;
                     var10000[var11] += field1402;
                  }
               }
            }

         } else if (var1 == 5) {
            if (this.field1369 != null && this.field1360 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if (var8 < this.field1369.length) {
                     var9 = this.field1369[var8];

                     for(var10 = 0; var10 < var9.length; ++var10) {
                        var11 = var9[var10];
                        var12 = (this.field1360[var11] & 255) + var3 * 8;
                        if (var12 < 0) {
                           var12 = 0;
                        } else if (var12 > 255) {
                           var12 = 255;
                        }

                        this.field1360[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   public void method768() {
      for(int var1 = 0; var1 < this.field1404; ++var1) {
         int var2 = this.field1350[var1];
         this.field1350[var1] = this.field1355[var1];
         this.field1355[var1] = -var2;
      }

      this.method761();
   }

   public void method769() {
      for(int var1 = 0; var1 < this.field1404; ++var1) {
         this.field1350[var1] = -this.field1350[var1];
         this.field1355[var1] = -this.field1355[var1];
      }

      this.method761();
   }

   public void method770() {
      for(int var1 = 0; var1 < this.field1404; ++var1) {
         int var2 = this.field1355[var1];
         this.field1355[var1] = this.field1350[var1];
         this.field1350[var1] = -var2;
      }

      this.method761();
   }

   public void method779(int var1) {
      int var2 = field1405[var1];
      int var3 = field1406[var1];

      for(int var4 = 0; var4 < this.field1404; ++var4) {
         int var5 = this.field1351[var4] * var3 - this.field1355[var4] * var2 >> 16;
         this.field1355[var4] = this.field1351[var4] * var2 + this.field1355[var4] * var3 >> 16;
         this.field1351[var4] = var5;
      }

      this.method761();
   }

   public void method759(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1404; ++var4) {
         int[] var10000 = this.field1350;
         var10000[var4] += var1;
         var10000 = this.field1351;
         var10000[var4] += var2;
         var10000 = this.field1355;
         var10000[var4] += var3;
      }

      this.method761();
   }

   public void method771(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1404; ++var4) {
         this.field1350[var4] = this.field1350[var4] * var1 / 128;
         this.field1351[var4] = this.field1351[var4] * var2 / 128;
         this.field1355[var4] = this.field1355[var4] * var3 / 128;
      }

      this.method761();
   }

   public final void method764(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (this.field1372 != 2 && this.field1372 != 1) {
         this.method787();
      }

      int var8 = class399.method1936();
      int var9 = class399.method1937();
      int var10 = field1405[var1];
      int var11 = field1406[var1];
      int var12 = field1405[var2];
      int var13 = field1406[var2];
      int var14 = field1405[var3];
      int var15 = field1406[var3];
      int var16 = field1405[var4];
      int var17 = field1406[var4];
      int var18 = var6 * var16 + var7 * var17 >> 16;

      for(int var19 = 0; var19 < this.field1404; ++var19) {
         int var20 = this.field1350[var19];
         int var21 = this.field1351[var19];
         int var22 = this.field1355[var19];
         int var23;
         if (var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field1384[var19] = var22 - var18;
         field1381[var19] = var8 + var20 * class399.method1941() / var22;
         field1382[var19] = var9 + var23 * class399.method1941() / var22;
         field1387[var19] = class243.method1447(var22);
         if (this.field1364 > 0) {
            field1385[var19] = var20;
            field1386[var19] = var23;
            field1392[var19] = var22;
         }
      }

      try {
         this.method774(false, false, false, 0L);
      } catch (Exception var24) {
      }

   }

   public final void method772(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field1372 != 2 && this.field1372 != 1) {
         this.method787();
      }

      int var9 = class399.method1936();
      int var10 = class399.method1937();
      int var11 = field1405[var1];
      int var12 = field1406[var1];
      int var13 = field1405[var2];
      int var14 = field1406[var2];
      int var15 = field1405[var3];
      int var16 = field1406[var3];
      int var17 = field1405[var4];
      int var18 = field1406[var4];
      int var19 = var6 * var17 + var7 * var18 >> 16;

      for(int var20 = 0; var20 < this.field1404; ++var20) {
         int var21 = this.field1350[var20];
         int var22 = this.field1351[var20];
         int var23 = this.field1355[var20];
         int var24;
         if (var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if (var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if (var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field1384[var20] = var23 - var19;
         field1381[var20] = var9 + var21 * class399.method1941() / var8;
         field1382[var20] = var10 + var24 * class399.method1941() / var8;
         field1387[var20] = class243.method1447(var8);
         if (this.field1364 > 0) {
            field1385[var20] = var21;
            field1386[var20] = var24;
            field1392[var20] = var23;
         }
      }

      try {
         this.method774(false, false, false, 0L);
      } catch (Exception var25) {
      }

   }

   void method2400(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (this.field1372 != 1) {
         this.method758();
      }

      this.method788(var1);
      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = this.field1374 * var3 >> 16;
      int var14 = var12 + var13;
      if (var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var6 * var5 >> 16;
         int var16 = (var15 - this.field1374) * class399.method1941();
         if (var16 / var14 < class399.method1935()) {
            int var17 = (var15 + this.field1374) * class399.method1941();
            if (var17 / var14 > class399.method1938()) {
               int var18 = var7 * var3 - var11 * var2 >> 16;
               int var19 = this.field1374 * var2 >> 16;
               int var20 = var19 + (this.field1373 * var3 >> 16);
               int var21 = (var18 + var20) * class399.method1941();
               if (var21 / var14 > class399.method1940()) {
                  int var22 = var19 + (super.field3926 * var3 >> 16);
                  int var23 = (var18 - var22) * class399.method1941();
                  if (var23 / var14 < class399.method1939()) {
                     int var24 = var13 + (super.field3926 * var2 >> 16);
                     boolean var25 = false;
                     boolean var26 = false;
                     if (var12 - var24 <= 50) {
                        var26 = true;
                     }

                     boolean var27 = var26 || this.field1364 > 0;
                     int var28 = class256.field2252;
                     int var30 = class256.field2255;
                     boolean var32 = class256.method1467();
                     boolean var34 = 0L != var9;
                     boolean var35;
                     if (var34) {
                        var35 = (int)(var9 >>> 16 & 1L) == 1;
                        var34 = !var35;
                     }

                     var35 = false;
                     int var38;
                     int var40;
                     int var41;
                     int var42;
                     int var43;
                     int var44;
                     int var51;
                     int var52;
                     if (var34 && var32) {
                        boolean var36 = false;
                        if (field1403) {
                           boolean var37;
                           if (!class256.method1467()) {
                              var37 = false;
                           } else {
                              class256.method1464();
                              class111 var39 = (class111)this.field1377.get(var1);
                              var40 = var6 + var39.field1447;
                              var41 = var39.field1442 + var7;
                              var42 = var39.field1443 + var8;
                              var43 = var39.field1444;
                              var44 = var39.field1445;
                              int var45 = var39.field1446;
                              int var46 = class256.field2251 - var40;
                              int var47 = class256.field2260 - var41;
                              int var48 = class256.field2257 - var42;
                              if (Math.abs(var46) > var43 + class256.field2258) {
                                 var37 = false;
                              } else if (Math.abs(var47) > class403.field3119 + var44) {
                                 var37 = false;
                              } else if (Math.abs(var48) > var45 + class462.field3592) {
                                 var37 = false;
                              } else if (Math.abs(class256.field2253 * var48 - var47 * class488.field3852) > class462.field3592 * var44 + var45 * class403.field3119) {
                                 var37 = false;
                              } else if (Math.abs(var46 * class488.field3852 - var48 * class287.field2444) > var43 * class462.field3592 + var45 * class256.field2258) {
                                 var37 = false;
                              } else if (Math.abs(var47 * class287.field2444 - var46 * class256.field2253) > class403.field3119 * var43 + var44 * class256.field2258) {
                                 var37 = false;
                              } else {
                                 var37 = true;
                              }
                           }

                           var36 = var37;
                        } else {
                           var52 = var12 - var13;
                           if (var52 <= 50) {
                              var52 = 50;
                           }

                           if (var15 > 0) {
                              var16 /= var14;
                              var17 /= var52;
                           } else {
                              var17 /= var14;
                              var16 /= var52;
                           }

                           if (var18 > 0) {
                              var23 /= var14;
                              var21 /= var52;
                           } else {
                              var21 /= var14;
                              var23 /= var52;
                           }

                           var38 = var28 - class399.method1936();
                           var51 = var30 - class399.method1937();
                           if (var38 > var16 && var38 < var17 && var51 > var23 && var51 < var21) {
                              var36 = true;
                           }
                        }

                        if (var36) {
                           if (this.field1353) {
                              class256.field2261[++class256.field2259 - 1] = var9;
                           } else {
                              var35 = true;
                           }
                        }
                     }

                     int var50 = class399.method1936();
                     var52 = class399.method1937();
                     var38 = 0;
                     var51 = 0;
                     if (var1 != 0) {
                        var38 = field1405[var1];
                        var51 = field1406[var1];
                     }

                     for(var40 = 0; var40 < this.field1404; ++var40) {
                        var41 = this.field1350[var40];
                        var42 = this.field1351[var40];
                        var43 = this.field1355[var40];
                        if (var1 != 0) {
                           var44 = var43 * var38 + var41 * var51 >> 16;
                           var43 = var43 * var51 - var41 * var38 >> 16;
                           var41 = var44;
                        }

                        var41 += var6;
                        var42 += var7;
                        var43 += var8;
                        var44 = var43 * var4 + var41 * var5 >> 16;
                        var43 = var43 * var5 - var41 * var4 >> 16;
                        var41 = var44;
                        var44 = var42 * var3 - var43 * var2 >> 16;
                        var43 = var42 * var2 + var43 * var3 >> 16;
                        field1384[var40] = var43 - var12;
                        if (var43 >= 50) {
                           field1381[var40] = var50 + var41 * class399.method1941() / var43;
                           field1382[var40] = var52 + var44 * class399.method1941() / var43;
                           field1387[var40] = class243.method1447(var43);
                        } else {
                           field1381[var40] = -5000;
                           var25 = true;
                        }

                        if (var27) {
                           field1385[var40] = var41;
                           field1386[var40] = var44;
                           field1392[var40] = var43;
                        }
                     }

                     try {
                        this.method774(var25, var35, this.field1353, var9);
                     } catch (Exception var49) {
                     }

                  }
               }
            }
         }
      }
   }

   final void method774(boolean var1, boolean var2, boolean var3, long var4) {
      if (this.field1375 < 6000) {
         int var6;
         for(var6 = 0; var6 < this.field1375; ++var6) {
            field1389[var6] = 0;
         }

         var6 = var3 ? 20 : 5;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         for(var7 = 0; var7 < this.field1352; var7 = (char)(var7 + 1)) {
            if (this.field1358[var7] != -2) {
               var8 = this.field1367[var7];
               var9 = this.field1354[var7];
               var10 = this.field1412[var7];
               var11 = field1381[var8];
               var12 = field1381[var9];
               var13 = field1381[var10];
               int var17;
               int var32;
               if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
                  var32 = field1385[var8];
                  var15 = field1385[var9];
                  var16 = field1385[var10];
                  var17 = field1386[var8];
                  var18 = field1386[var9];
                  int var19 = field1386[var10];
                  int var20 = field1392[var8];
                  int var21 = field1392[var9];
                  int var22 = field1392[var10];
                  var32 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var32 * var22;
                  int var25 = var32 * var19 - var17 * var16;
                  if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field1380[var7] = true;
                     int var26 = (field1384[var8] + field1384[var9] + field1384[var10]) / 3 + this.field1399;
                     field1390[var26][field1389[var26]++] = (char)var7;
                  }
               } else {
                  if (var2) {
                     var15 = field1382[var8];
                     var16 = field1382[var9];
                     var17 = field1382[var10];
                     var18 = class256.field2255 + var6;
                     boolean var14;
                     if (var18 < var15 && var18 < var16 && var18 < var17) {
                        var14 = false;
                     } else {
                        var18 = class256.field2255 - var6;
                        if (var18 > var15 && var18 > var16 && var18 > var17) {
                           var14 = false;
                        } else {
                           var18 = var6 + class256.field2252;
                           if (var18 < var11 && var18 < var12 && var18 < var13) {
                              var14 = false;
                           } else {
                              var18 = class256.field2252 - var6;
                              if (var18 > var11 && var18 > var12 && var18 > var13) {
                                 var14 = false;
                              } else {
                                 var14 = true;
                              }
                           }
                        }
                     }

                     if (var14) {
                        class256.field2261[++class256.field2259 - 1] = var4;
                        var2 = false;
                     }
                  }

                  if ((var11 - var12) * (field1382[var10] - field1382[var9]) - (field1382[var8] - field1382[var9]) * (var13 - var12) > 0) {
                     field1380[var7] = false;
                     var32 = class399.method1942();
                     if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var32 && var12 <= var32 && var13 <= var32) {
                        field1379[var7] = false;
                     } else {
                        field1379[var7] = true;
                     }

                     var15 = (field1384[var8] + field1384[var9] + field1384[var10]) / 3 + this.field1399;
                     field1390[var15][field1389[var15]++] = (char)var7;
                  }
               }
            }
         }

         char var27;
         char[] var28;
         if (this.field1411 == null) {
            for(var7 = this.field1375 - 1; var7 >= 0; --var7) {
               var27 = field1389[var7];
               if (var27 > 0) {
                  var28 = field1390[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     this.method755(var28[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field1391[var7] = 0;
               field1395[var7] = 0;
            }

            for(var7 = this.field1375 - 1; var7 >= 0; --var7) {
               var27 = field1389[var7];
               if (var27 > 0) {
                  var28 = field1390[var7];

                  for(var10 = 0; var10 < var27; ++var10) {
                     char var29 = var28[var10];
                     byte var30 = this.field1411[var29];
                     var13 = field1391[var30]++;
                     field1388[var30][var13] = var29;
                     if (var30 < 10) {
                        int[] var35 = field1395;
                        var35[var30] += var7;
                     } else if (var30 == 10) {
                        field1393[var13] = var7;
                     } else {
                        field1349[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if (field1391[1] > 0 || field1391[2] > 0) {
               var7 = (field1395[1] + field1395[2]) / (field1391[1] + field1391[2]);
            }

            var8 = 0;
            if (field1391[3] > 0 || field1391[4] > 0) {
               var8 = (field1395[3] + field1395[4]) / (field1391[3] + field1391[4]);
            }

            var9 = 0;
            if (field1391[6] > 0 || field1391[8] > 0) {
               var9 = (field1395[6] + field1395[8]) / (field1391[6] + field1391[8]);
            }

            var11 = 0;
            var12 = field1391[10];
            int[] var31 = field1388[10];
            int[] var33 = field1393;
            if (var11 == var12) {
               var11 = 0;
               var12 = field1391[11];
               var31 = field1388[11];
               var33 = field1349;
            }

            if (var11 < var12) {
               var10 = var33[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.method755(var31[var11++]);
                  if (var11 == var12 && var31 != field1388[11]) {
                     var11 = 0;
                     var12 = field1391[11];
                     var31 = field1388[11];
                     var33 = field1349;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.method755(var31[var11++]);
                  if (var11 == var12 && var31 != field1388[11]) {
                     var11 = 0;
                     var12 = field1391[11];
                     var31 = field1388[11];
                     var33 = field1349;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var9) {
                  this.method755(var31[var11++]);
                  if (var11 == var12 && var31 != field1388[11]) {
                     var11 = 0;
                     var12 = field1391[11];
                     var31 = field1388[11];
                     var33 = field1349;
                  }

                  if (var11 < var12) {
                     var10 = var33[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field1391[var15];
               int[] var34 = field1388[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.method755(var34[var18]);
               }
            }

            while(var10 != -1000) {
               this.method755(var31[var11++]);
               if (var11 == var12 && var31 != field1388[11]) {
                  var11 = 0;
                  var31 = field1388[11];
                  var12 = field1391[11];
                  var33 = field1349;
               }

               if (var11 < var12) {
                  var10 = var33[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   final void method755(int var1) {
      if (field1380[var1]) {
         this.method777(var1);
      } else {
         int var2 = this.field1367[var1];
         int var3 = this.field1354[var1];
         int var4 = this.field1412[var1];
         class399.field3111.field2241 = field1379[var1];
         if (this.field1360 == null) {
            class399.field3111.field2244 = 0;
         } else {
            class399.field3111.field2244 = (this.field1360[var1] == -1 ? 253 : this.field1360[var1]) & 255;
         }

         this.method785(var1, field1382[var2], field1382[var3], field1382[var4], field1381[var2], field1381[var3], field1381[var4], field1387[var2], field1387[var3], field1387[var4], this.field1356[var1], this.field1357[var1], this.field1358[var1]);
      }
   }

   boolean method776(int var1) {
      return this.field1414 > 0 && var1 < this.field1415;
   }

   final void method785(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
      if (this.field1362 != null && this.field1362[var1] != -1) {
         int var15;
         int var16;
         int var18;
         if (this.field1361 != null && this.field1361[var1] != -1) {
            int var17 = this.field1361[var1] & 255;
            var18 = this.field1365[var17];
            var15 = this.field1366[var17];
            var16 = this.field1359[var17];
         } else {
            var18 = this.field1367[var1];
            var15 = this.field1354[var1];
            var16 = this.field1412[var1];
         }

         if (this.field1358[var1] == -1) {
            class399.method1948(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field1385[var18], field1385[var15], field1385[var16], field1386[var18], field1386[var15], field1386[var16], field1392[var18], field1392[var15], field1392[var16], this.field1362[var1]);
         } else {
            class399.method1948(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field1385[var18], field1385[var15], field1385[var16], field1386[var18], field1386[var15], field1386[var16], field1392[var18], field1392[var15], field1392[var16], this.field1362[var1]);
         }
      } else {
         boolean var14 = this.method776(var1);
         if (this.field1358[var1] == -1 && var14) {
            class399.method1956(var2, var3, var4, var5, var6, var7, var8, var9, var10, field1407[this.field1356[var1]], this.field1408, this.field1378, this.field1376, this.field1414);
         } else if (this.field1358[var1] == -1) {
            class399.method1957(var2, var3, var4, var5, var6, var7, var8, var9, var10, field1407[this.field1356[var1]]);
         } else if (var14) {
            class399.method1954(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field1408, this.field1378, this.field1376, this.field1414);
         } else {
            class399.method1950(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }
      }

   }

   final void method777(int var1) {
      int var2 = class399.method1936();
      int var3 = class399.method1937();
      int var4 = 0;
      int var5 = this.field1367[var1];
      int var6 = this.field1354[var1];
      int var7 = this.field1412[var1];
      int var8 = field1392[var5];
      int var9 = field1392[var6];
      int var10 = field1392[var7];
      if (this.field1360 == null) {
         class399.field3111.field2244 = 0;
      } else {
         class399.field3111.field2244 = this.field1360[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if (var8 >= 50) {
         field1396[var4] = field1381[var5];
         field1397[var4] = field1382[var5];
         field1401[var4] = field1387[var7];
         field1398[var4++] = this.field1356[var1];
      } else {
         var11 = field1385[var5];
         var12 = field1386[var5];
         var13 = this.field1356[var1];
         if (var10 >= 50) {
            var14 = (50 - var8) * field1371[var10 - var8];
            field1396[var4] = var2 + (var11 + ((field1385[var7] - var11) * var14 >> 16)) * class399.method1941() / 50;
            field1397[var4] = var3 + (var12 + ((field1386[var7] - var12) * var14 >> 16)) * class399.method1941() / 50;
            field1401[var4] = field1410;
            field1398[var4++] = var13 + ((this.field1358[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            var14 = (50 - var8) * field1371[var9 - var8];
            field1396[var4] = var2 + (var11 + ((field1385[var6] - var11) * var14 >> 16)) * class399.method1941() / 50;
            field1397[var4] = var3 + (var12 + ((field1386[var6] - var12) * var14 >> 16)) * class399.method1941() / 50;
            field1401[var4] = field1410;
            field1398[var4++] = var13 + ((this.field1357[var1] - var13) * var14 >> 16);
         }
      }

      if (var9 >= 50) {
         field1396[var4] = field1381[var6];
         field1397[var4] = field1382[var6];
         field1401[var4] = field1387[var7];
         field1398[var4++] = this.field1357[var1];
      } else {
         var11 = field1385[var6];
         var12 = field1386[var6];
         var13 = this.field1357[var1];
         if (var8 >= 50) {
            var14 = (50 - var9) * field1371[var8 - var9];
            field1396[var4] = var2 + (var11 + ((field1385[var5] - var11) * var14 >> 16)) * class399.method1941() / 50;
            field1397[var4] = var3 + (var12 + ((field1386[var5] - var12) * var14 >> 16)) * class399.method1941() / 50;
            field1401[var4] = field1410;
            field1398[var4++] = var13 + ((this.field1356[var1] - var13) * var14 >> 16);
         }

         if (var10 >= 50) {
            var14 = (50 - var9) * field1371[var10 - var9];
            field1396[var4] = var2 + (var11 + ((field1385[var7] - var11) * var14 >> 16)) * class399.method1941() / 50;
            field1397[var4] = var3 + (var12 + ((field1386[var7] - var12) * var14 >> 16)) * class399.method1941() / 50;
            field1398[var4++] = var13 + ((this.field1358[var1] - var13) * var14 >> 16);
         }
      }

      if (var10 >= 50) {
         field1396[var4] = field1381[var7];
         field1397[var4] = field1382[var7];
         field1401[var4] = field1387[var7];
         field1398[var4++] = this.field1358[var1];
      } else {
         var11 = field1385[var7];
         var12 = field1386[var7];
         var13 = this.field1358[var1];
         if (var9 >= 50) {
            var14 = (50 - var10) * field1371[var9 - var10];
            field1396[var4] = var2 + (var11 + ((field1385[var6] - var11) * var14 >> 16)) * class399.method1941() / 50;
            field1397[var4] = var3 + (var12 + ((field1386[var6] - var12) * var14 >> 16)) * class399.method1941() / 50;
            field1401[var4] = field1410;
            field1398[var4++] = var13 + ((this.field1357[var1] - var13) * var14 >> 16);
         }

         if (var8 >= 50) {
            var14 = (50 - var10) * field1371[var8 - var10];
            field1396[var4] = var2 + (var11 + ((field1385[var5] - var11) * var14 >> 16)) * class399.method1941() / 50;
            field1397[var4] = var3 + (var12 + ((field1386[var5] - var12) * var14 >> 16)) * class399.method1941() / 50;
            field1401[var4] = field1410;
            field1398[var4++] = var13 + ((this.field1356[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field1396[0];
      var12 = field1396[1];
      var13 = field1396[2];
      var14 = field1397[0];
      int var15 = field1397[1];
      int var16 = field1397[2];
      float var17 = field1401[0];
      float var18 = field1401[1];
      float var19 = field1401[2];
      class399.field3111.field2241 = false;
      int var20 = class399.method1942();
      if (var4 == 3) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
            class399.field3111.field2241 = true;
         }

         this.method785(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field1398[0], field1398[1], field1398[2]);
      }

      if (var4 == 4) {
         if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field1396[3] < 0 || field1396[3] > var20) {
            class399.field3111.field2241 = true;
         }

         int var22;
         if (this.field1362 != null && this.field1362[var1] != -1) {
            int var23;
            int var25;
            if (this.field1361 != null && this.field1361[var1] != -1) {
               int var24 = this.field1361[var1] & 255;
               var25 = this.field1365[var24];
               var22 = this.field1366[var24];
               var23 = this.field1359[var24];
            } else {
               var25 = var5;
               var22 = var6;
               var23 = var7;
            }

            short var26 = this.field1362[var1];
            if (this.field1358[var1] == -1) {
               class399.method1948(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field1356[var1], this.field1356[var1], this.field1356[var1], field1385[var25], field1385[var22], field1385[var23], field1386[var25], field1386[var22], field1386[var23], field1392[var25], field1392[var22], field1392[var23], var26);
               class399.method1948(var14, var16, field1397[3], var11, var13, field1396[3], var17, var19, field1401[3], this.field1356[var1], this.field1356[var1], this.field1356[var1], field1385[var25], field1385[var22], field1385[var23], field1386[var25], field1386[var22], field1386[var23], field1392[var25], field1392[var22], field1392[var23], var26);
            } else {
               class399.method1948(var14, var15, var16, var11, var12, var13, var17, var18, var19, field1398[0], field1398[1], field1398[2], field1385[var25], field1385[var22], field1385[var23], field1386[var25], field1386[var22], field1386[var23], field1392[var25], field1392[var22], field1392[var23], var26);
               class399.method1948(var14, var16, field1397[3], var11, var13, field1396[3], var17, var19, field1401[3], field1398[0], field1398[2], field1398[3], field1385[var25], field1385[var22], field1385[var23], field1386[var25], field1386[var22], field1386[var23], field1392[var25], field1392[var22], field1392[var23], var26);
            }
         } else {
            boolean var21 = this.method776(var1);
            if (this.field1358[var1] == -1 && var21) {
               var22 = field1407[this.field1356[var1]];
               class399.method1956(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field1408, this.field1378, this.field1376, this.field1414);
               class399.method1956(var14, var16, field1397[3], var11, var13, field1396[3], var17, var19, field1401[3], var22, this.field1408, this.field1378, this.field1376, this.field1414);
            } else if (this.field1358[var1] == -1) {
               var22 = field1407[this.field1356[var1]];
               class399.method1957(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
               class399.method1957(var14, var16, field1397[3], var11, var13, field1396[3], var17, var19, field1401[3], var22);
            } else if (var21) {
               class399.method1954(var14, var15, var16, var11, var12, var13, var17, var18, var19, field1398[0], field1398[1], field1398[2], this.field1408, this.field1376, this.field1378, this.field1414);
               class399.method1954(var14, var16, field1397[3], var11, var13, field1396[3], 0.0F, 0.0F, 0.0F, field1398[0], field1398[2], field1398[3], this.field1408, this.field1376, this.field1378, this.field1414);
            } else {
               class399.method1950(var14, var15, var16, var11, var12, var13, var17, var18, var19, field1398[0], field1398[1], field1398[2]);
               class399.method1950(var14, var16, field1397[3], var11, var13, field1396[3], var17, var19, field1401[3], field1398[0], field1398[2], field1398[3]);
            }
         }
      }

   }

   void method778(int var1, class120 var2) {
      float var3 = (float)this.field1350[var1];
      float var4 = (float)(-this.field1351[var1]);
      float var5 = (float)(-this.field1355[var1]);
      float var6 = 1.0F;
      this.field1350[var1] = (int)(var2.field1488[0] * var3 + var2.field1488[4] * var4 + var2.field1488[8] * var5 + var2.field1488[12] * var6);
      this.field1351[var1] = -((int)(var2.field1488[1] * var3 + var2.field1488[5] * var4 + var2.field1488[9] * var5 + var2.field1488[13] * var6));
      this.field1355[var1] = -((int)(var2.field1488[2] * var3 + var2.field1488[6] * var4 + var2.field1488[10] * var5 + var2.field1488[14] * var6));
   }

   void method782(class226 var1, int var2) {
      if (this.field1370 != null) {
         for(int var3 = 0; var3 < this.field1404; ++var3) {
            int[] var4 = this.field1370[var3];
            if (var4 != null && var4.length != 0) {
               int[] var5 = this.field1394[var3];
               field1346.method838();

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  int var7 = var4[var6];
                  class322 var8 = var1.method1336(var7);
                  if (var8 != null) {
                     field1347.method839((float)var5[var6] / 255.0F);
                     field1348.method844(var8.method1699(var2));
                     field1348.method847(field1347);
                     field1346.method841(field1348);
                  }
               }

               this.method778(var3, field1346);
            }
         }

      }
   }
}
