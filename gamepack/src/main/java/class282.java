import java.util.Random;

public abstract class class282 extends class156 {
   public static class425[] field2419;
   static int field2420 = -1;
   static int field2421 = 0;
   static int field2431 = -1;
   static int field2432 = -1;
   static int field2433 = -1;
   static int field2434 = 0;
   static int field2435 = 0;
   static int field2436 = 256;
   static int field2437 = 0;
   static String[] field2429 = new String[100];
   static Random field2439 = new Random();
   byte[] field2430;
   byte[][] field2438 = new byte[256][];
   int[] field2422;
   int[] field2424;
   int[] field2425;
   int[] field2426;
   int[] field2440;
   public int field2423 = 0;
   public int field2427;
   public int field2428;

   class282(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field2424 = var2;
      this.field2425 = var3;
      this.field2422 = var4;
      this.field2440 = var5;
      this.method1569(var1);
      this.field2438 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.field2425[var10] < var8 && this.field2440[var10] != 0) {
            var8 = this.field2425[var10];
         }

         if (this.field2425[var10] + this.field2440[var10] > var9) {
            var9 = this.field2425[var10] + this.field2440[var10];
         }
      }

      this.field2427 = this.field2423 - var8;
      this.field2428 = var9 - this.field2423;
   }

   class282(byte[] var1) {
      this.method1569(var1);
   }

   abstract void method1563(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void method1583(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   void method1569(byte[] var1) {
      this.field2426 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field2426.length; ++var2) {
            this.field2426[var2] = var1[var2] & 255;
         }

         this.field2423 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field2426[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var7;
         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = (byte)var7;
            }
         }

         byte[][] var12 = new byte[256][];

         for(var7 = 0; var7 < 256; ++var7) {
            var12[var7] = new byte[var10[var7]];
            byte var13 = 0;

            for(int var9 = 0; var9 < var12[var7].length; ++var9) {
               var13 += var1[var2++];
               var12[var7][var9] = var13;
            }
         }

         this.field2430 = new byte[65536];

         for(var7 = 0; var7 < 256; ++var7) {
            if (var7 != 32 && var7 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.field2430[(var7 << 8) + var8] = (byte)method1564(var11, var12, var4, this.field2426, var10, var7, var8);
                  }
               }
            }
         }

         this.field2423 = var4[32] + var10[32];
      }

   }

   public int method1595(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field2426[class162.method996(var1) & 255];
   }

   public int method1566(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = class330.method1736(var7.substring(4));
                              var4 += field2419[var8].field3221;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.field2426[(char)(class162.method996(var6) & 255)];
                  if (this.field2430 != null && var3 != -1) {
                     var4 += this.field2430[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method1567(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.method1595('<');
                     if (this.field2430 != null && var11 != -1) {
                        var4 += this.field2430[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method1595('>');
                     if (this.field2430 != null && var11 != -1) {
                        var4 += this.field2430[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = class330.method1736(var16.substring(4));
                        var4 += field2419[var17].field3221;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method1595(var15);
                     if (this.field2430 != null && var11 != -1) {
                        var4 += this.field2430[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   public int method1589(String var1, int var2) {
      int var3 = this.method1567(var1, new int[]{var2}, field2429);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method1566(field2429[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int method1568(String var1, int var2) {
      return this.method1567(var1, new int[]{var2}, field2429);
   }

   public class119 method1570(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method1566(var3) / 2;
         var6 += this.method1566(var3.substring(0, var1));
         int var7 = var5 - this.field2427;
         int var8 = this.method1566(var3.substring(var1, var1 + var2));
         int var9 = this.field2427 + this.field2428;
         return new class119(var6, var7, var8, var9);
      } else {
         return new class119(var4, var5, 0, 0);
      }
   }

   public void method1594(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method1587(var4, var5);
         this.method1582(var1, var2, var3);
      }
   }

   public void method1571(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method1587(var4, var5);
         field2436 = var6;
         this.method1582(var1, var2, var3);
      }
   }

   public void method1572(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method1587(var4, var5);
         this.method1582(var1, var2 - this.method1566(var1), var3);
      }
   }

   public void method1573(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method1587(var4, var5);
         this.method1582(var1, var2 - this.method1566(var1) / 2, var3);
      }
   }

   public int method1565(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.method1574(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int method1574(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.method1587(var6, var7);
         field2436 = var8;
         if (var11 == 0) {
            var11 = this.field2423;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.field2427 + this.field2428 + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.method1567(var1, var12, field2429);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.field2427;
         } else if (var10 == 1) {
            var14 = var3 + this.field2427 + (var5 - this.field2427 - this.field2428 - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.field2428 - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.field2427 - this.field2428 - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.field2427 + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.method1582(field2429[var15], var2, var14);
            } else if (var9 == 1) {
               this.method1582(field2429[var15], var2 + (var4 - this.method1566(field2429[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.method1582(field2429[var15], var2 + var4 - this.method1566(field2429[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.method1582(field2429[var15], var2, var14);
            } else {
               this.method1581(field2429[var15], var4);
               this.method1582(field2429[var15], var2, var14);
               field2437 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public class467 method1575(class437 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.method2143()) {
         this.method1587(var4, var5);
         var3 -= this.field2423;

         for(int var7 = 0; var7 < var1.method2144(); ++var7) {
            class530 var8 = var1.method2146(var7);
            if (var6 != -1 && var8.field4172 > var6) {
               return new class467(var8.field4169, var8.field4172);
            }

            char var9 = var8.field4170;
            if (var9 != '\n') {
               if (var1.method2149(var7)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field4169;
                  int var11 = var3 + var8.field4172;
                  int var12 = this.field2422[var9];
                  int var13 = this.field2440[var9];
                  if (field2433 != -1) {
                     this.method1563(this.field2438[var9], var10 + this.field2424[var9] + 1, var11 + this.field2425[var9] + 1, var12, var13, field2433);
                  }

                  this.method1563(this.field2438[var9], var10 + this.field2424[var9], var11 + this.field2425[var9], var12, var13, field2435);
               }
            }
         }
      }

      return var1.method2148();
   }

   public void method1588(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.method1587(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method1578(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0 + (double)var6 / 5.0) * 5.0);
         }

         this.method1562(var1, var2 - this.method1566(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   public void method1576(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.method1587(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method1578(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0 + (double)var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.method1562(var1, var2 - this.method1566(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void method1590(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.method1587(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method1578(var8, var1.length());
         }

         double var10 = 7.0 - (double)var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5 + (double)var6 / 1.0) * var10);
         }

         this.method1562(var1, var2 - this.method1566(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   public void method1577(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.method1587(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method1578(var6, var1.length());
         }

         this.method1562(var1, var2 - this.method1566(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void method1591(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.method1587(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method1578(var6, var1.length());
         }

         this.method1562(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   int[] method1578(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / (float)var2;

         for(int var5 = 0; var5 < var2; ++var5) {
            var3[var5] = var1[(int)((float)var5 * var4)];
         }

         return var3;
      }
   }

   public void method1592(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method1587(var4, var5);
         field2439.setSeed((long)var6);
         field2436 = 192 + (field2439.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field2439.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method1562(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   void method1587(int var1, int var2) {
      field2420 = -1;
      field2431 = -1;
      field2432 = var2;
      field2433 = var2;
      field2434 = var1;
      field2435 = var1;
      field2436 = 256;
      field2437 = 0;
      field2421 = 0;
   }

   void method1580(String var1) {
      try {
         int var2;
         String var3;
         if (var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = class330.method1731(var3, 16, true);
            field2435 = var2;
         } else if (var1.equals("/col")) {
            field2435 = field2434;
         } else if (var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = class330.method1731(var3, 16, true);
            field2420 = var2;
         } else if (var1.equals("str")) {
            field2420 = 8388608;
         } else if (var1.equals("/str")) {
            field2420 = -1;
         } else if (var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = class330.method1731(var3, 16, true);
            field2431 = var2;
         } else if (var1.equals("u")) {
            field2431 = 0;
         } else if (var1.equals("/u")) {
            field2431 = -1;
         } else if (var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = class330.method1731(var3, 16, true);
            field2433 = var2;
         } else if (var1.equals("shad")) {
            field2433 = 0;
         } else if (var1.equals("/shad")) {
            field2433 = field2432;
         } else if (var1.equals("br")) {
            this.method1587(field2434, field2432);
         }
      } catch (Exception var4) {
      }

   }

   void method1581(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field2437 = (var2 - this.method1566(var1) << 8) / var3;
      }

   }

   void method1582(String var1, int var2, int var3) {
      var3 -= this.field2423;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class162.method996(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = class330.method1736(var8.substring(4));
                              class425 var13 = field2419[var9];
                              var13.method2000(var2, var3 + this.field2423 - var13.field3226);
                              var2 += var13.field3221;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.method1580(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field2430 != null && var5 != -1) {
                     var2 += this.field2430[(var5 << 8) + var7];
                  }

                  int var12 = this.field2422[var7];
                  var9 = this.field2440[var7];
                  if (var7 != ' ') {
                     if (field2436 == 256) {
                        if (field2433 != -1) {
                           method1593(this.field2438[var7], var2 + this.field2424[var7] + 1, var3 + this.field2425[var7] + 1, var12, var9, field2433);
                        }

                        this.method1563(this.field2438[var7], var2 + this.field2424[var7], var3 + this.field2425[var7], var12, var9, field2435);
                     } else {
                        if (field2433 != -1) {
                           method1585(this.field2438[var7], var2 + this.field2424[var7] + 1, var3 + this.field2425[var7] + 1, var12, var9, field2433, field2436);
                        }

                        this.method1583(this.field2438[var7], var2 + this.field2424[var7], var3 + this.field2425[var7], var12, var9, field2435, field2436);
                     }
                  } else if (field2437 > 0) {
                     field2421 += field2437;
                     var2 += field2421 >> 8;
                     field2421 &= 255;
                  }

                  int var10 = this.field2426[var7];
                  if (field2420 != -1) {
                     method965(var2, var3 + (int)((double)this.field2423 * 0.7), var10, field2420);
                  }

                  if (field2431 != -1) {
                     method965(var2, var3 + this.field2423 + 1, var10, field2431);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method1562(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.field2423;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(class162.method996(var1.charAt(var10)) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              if (var5 != null) {
                                 var13 = var5[var9];
                              } else {
                                 var13 = 0;
                              }

                              if (var6 != null) {
                                 var14 = var6[var9];
                              } else {
                                 var14 = 0;
                              }

                              ++var9;
                              var15 = class330.method1736(var12.substring(4));
                              class425 var20 = field2419[var15];
                              var20.method2000(var2 + var13, var3 + this.field2423 - var20.field3226 + var14);
                              var2 += var20.field3221;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.method1580(var12);
                        }
                        continue;
                     }

                     var11 = '>';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var7 == -1) {
                  if (this.field2430 != null && var8 != -1) {
                     var2 += this.field2430[(var8 << 8) + var11];
                  }

                  int var19 = this.field2422[var11];
                  var13 = this.field2440[var11];
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = field2435;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (field2436 == 256) {
                        if (field2433 != -1) {
                           method1593(this.field2438[var11], var2 + this.field2424[var11] + 1 + var14, var3 + this.field2425[var11] + 1 + var15, var19, var13, field2433);
                        }

                        this.method1563(this.field2438[var11], var2 + this.field2424[var11] + var14, var3 + this.field2425[var11] + var15, var19, var13, var16);
                     } else {
                        if (field2433 != -1) {
                           method1585(this.field2438[var11], var2 + this.field2424[var11] + 1 + var14, var3 + this.field2425[var11] + 1 + var15, var19, var13, field2433, field2436);
                        }

                        this.method1583(this.field2438[var11], var2 + this.field2424[var11] + var14, var3 + this.field2425[var11] + var15, var19, var13, var16, field2436);
                     }
                  } else if (field2437 > 0) {
                     field2421 += field2437;
                     var2 += field2421 >> 8;
                     field2421 &= 255;
                  }

                  int var17 = this.field2426[var11];
                  if (field2420 != -1) {
                     method965(var2, var3 + (int)((double)this.field2423 * 0.7), var17, field2420);
                  }

                  if (field2431 != -1) {
                     method965(var2, var3 + this.field2423, var17, field2431);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   static int method1564(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   public static String method1579(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var1; ++var3) {
         var4 = var0.charAt(var3);
         if (var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   static void method1593(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class156.field1648;
      int var7 = class156.field1648 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class156.field1654) {
         var10 = class156.field1654 - var2;
         var4 -= var10;
         var2 = class156.field1654;
         var9 += var10 * var3;
         var6 += var10 * class156.field1648;
      }

      if (var2 + var4 > class156.field1652) {
         var4 -= var2 + var4 - class156.field1652;
      }

      if (var1 < class156.field1653) {
         var10 = class156.field1653 - var1;
         var3 -= var10;
         var1 = class156.field1653;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > class156.field1647) {
         var10 = var1 + var3 - class156.field1647;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method1584(class156.field1650, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void method1584(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method1585(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class156.field1648;
      int var8 = class156.field1648 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class156.field1654) {
         var11 = class156.field1654 - var2;
         var4 -= var11;
         var2 = class156.field1654;
         var10 += var11 * var3;
         var7 += var11 * class156.field1648;
      }

      if (var2 + var4 > class156.field1652) {
         var4 -= var2 + var4 - class156.field1652;
      }

      if (var1 < class156.field1653) {
         var11 = class156.field1653 - var1;
         var3 -= var11;
         var1 = class156.field1653;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > class156.field1647) {
         var11 = var1 + var3 - class156.field1647;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method1586(class156.field1650, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void method1586(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
