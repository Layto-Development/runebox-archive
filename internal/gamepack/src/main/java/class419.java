import java.util.Random;

public abstract class class419 extends class427 {
   public static class501[] field2942;
   static int field2943 = -1;
   static int field2944 = 0;
   static int field2954 = -1;
   static int field2955 = -1;
   static int field2956 = -1;
   static int field2957 = 0;
   static int field2958 = 0;
   static int field2959 = 256;
   static int field2960 = 0;
   static String[] field2952 = new String[100];
   static Random field2962 = new Random();
   byte[] field2953;
   byte[][] field2961 = new byte[256][];
   int[] field2945;
   int[] field2947;
   int[] field2948;
   int[] field2949;
   int[] field2963;
   public int field2946 = 0;
   public int field2950;
   public int field2951;

   class419(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.field2947 = var2;
      this.field2948 = var3;
      this.field2945 = var4;
      this.field2963 = var5;
      this.method1918(var1);
      this.field2961 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.field2948[var10] < var8 && this.field2963[var10] != 0) {
            var8 = this.field2948[var10];
         }

         if (this.field2948[var10] + this.field2963[var10] > var9) {
            var9 = this.field2948[var10] + this.field2963[var10];
         }
      }

      this.field2950 = this.field2946 - var8;
      this.field2951 = var9 - this.field2946;
   }

   class419(byte[] var1) {
      this.method1918(var1);
   }

   abstract void method1912(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void method1932(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   void method1918(byte[] var1) {
      this.field2949 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field2949.length; ++var2) {
            this.field2949[var2] = var1[var2] & 255;
         }

         this.field2946 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field2949[var3] = var1[var2++] & 255;
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

         this.field2953 = new byte[65536];

         for(var7 = 0; var7 < 256; ++var7) {
            if (var7 != 32 && var7 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.field2953[(var7 << 8) + var8] = (byte)method1913(var11, var12, var4, this.field2949, var10, var7, var8);
                  }
               }
            }
         }

         this.field2946 = var4[32] + var10[32];
      }

   }

   public int method1944(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field2949[class459.method2166(var1) & 255];
   }

   public int method1915(String var1) {
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
                              int var8 = class447.method2083(var7.substring(4));
                              var4 += field2942[var8].field4004;
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
                  var4 += this.field2949[(char)(class459.method2166(var6) & 255)];
                  if (this.field2953 != null && var3 != -1) {
                     var4 += this.field2953[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int method1916(String var1, int[] var2, String[] var3) {
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
                     var4 += this.method1944('<');
                     if (this.field2953 != null && var11 != -1) {
                        var4 += this.field2953[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method1944('>');
                     if (this.field2953 != null && var11 != -1) {
                        var4 += this.field2953[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = class447.method2083(var16.substring(4));
                        var4 += field2942[var17].field4004;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method1944(var15);
                     if (this.field2953 != null && var11 != -1) {
                        var4 += this.field2953[(var11 << 8) + var15];
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

   public int method1938(String var1, int var2) {
      int var3 = this.method1916(var1, new int[]{var2}, field2952);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method1915(field2952[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int method1917(String var1, int var2) {
      return this.method1916(var1, new int[]{var2}, field2952);
   }

   public class205 method1919(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method1915(var3) / 2;
         var6 += this.method1915(var3.substring(0, var1));
         int var7 = var5 - this.field2950;
         int var8 = this.method1915(var3.substring(var1, var1 + var2));
         int var9 = this.field2950 + this.field2951;
         return new class205(var6, var7, var8, var9);
      } else {
         return new class205(var4, var5, 0, 0);
      }
   }

   public void method1943(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method1936(var4, var5);
         this.method1931(var1, var2, var3);
      }
   }

   public void method1920(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method1936(var4, var5);
         field2959 = var6;
         this.method1931(var1, var2, var3);
      }
   }

   public void method1921(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method1936(var4, var5);
         this.method1931(var1, var2 - this.method1915(var1), var3);
      }
   }

   public void method1922(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method1936(var4, var5);
         this.method1931(var1, var2 - this.method1915(var1) / 2, var3);
      }
   }

   public int method1914(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.method1923(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int method1923(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.method1936(var6, var7);
         field2959 = var8;
         if (var11 == 0) {
            var11 = this.field2946;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.field2950 + this.field2951 + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.method1916(var1, var12, field2952);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.field2950;
         } else if (var10 == 1) {
            var14 = var3 + this.field2950 + (var5 - this.field2950 - this.field2951 - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.field2951 - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.field2950 - this.field2951 - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.field2950 + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.method1931(field2952[var15], var2, var14);
            } else if (var9 == 1) {
               this.method1931(field2952[var15], var2 + (var4 - this.method1915(field2952[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.method1931(field2952[var15], var2 + var4 - this.method1915(field2952[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.method1931(field2952[var15], var2, var14);
            } else {
               this.method1930(field2952[var15], var4);
               this.method1931(field2952[var15], var2, var14);
               field2960 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public class510 method1924(class61 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.method257()) {
         this.method1936(var4, var5);
         var3 -= this.field2946;

         for(int var7 = 0; var7 < var1.method258(); ++var7) {
            class325 var8 = var1.method260(var7);
            if (var6 != -1 && var8.field2433 > var6) {
               return new class510(var8.field2430, var8.field2433);
            }

            char var9 = var8.field2431;
            if (var9 != '\n') {
               if (var1.method263(var7)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field2430;
                  int var11 = var3 + var8.field2433;
                  int var12 = this.field2945[var9];
                  int var13 = this.field2963[var9];
                  if (field2956 != -1) {
                     this.method1912(this.field2961[var9], var10 + this.field2947[var9] + 1, var11 + this.field2948[var9] + 1, var12, var13, field2956);
                  }

                  this.method1912(this.field2961[var9], var10 + this.field2947[var9], var11 + this.field2948[var9], var12, var13, field2958);
               }
            }
         }
      }

      return var1.method262();
   }

   public void method1937(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.method1936(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method1927(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0 + (double)var6 / 5.0) * 5.0);
         }

         this.method1911(var1, var2 - this.method1915(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   public void method1925(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.method1936(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method1927(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0 + (double)var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0 + (double)var6 / 5.0) * 5.0);
         }

         this.method1911(var1, var2 - this.method1915(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void method1939(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.method1936(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method1927(var8, var1.length());
         }

         double var10 = 7.0 - (double)var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5 + (double)var6 / 1.0) * var10);
         }

         this.method1911(var1, var2 - this.method1915(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   public void method1926(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.method1936(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method1927(var6, var1.length());
         }

         this.method1911(var1, var2 - this.method1915(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void method1940(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.method1936(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method1927(var6, var1.length());
         }

         this.method1911(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   int[] method1927(int[] var1, int var2) {
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

   public void method1941(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method1936(var4, var5);
         field2962.setSeed((long)var6);
         field2959 = 192 + (field2962.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field2962.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method1911(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   void method1936(int var1, int var2) {
      field2943 = -1;
      field2954 = -1;
      field2955 = var2;
      field2956 = var2;
      field2957 = var1;
      field2958 = var1;
      field2959 = 256;
      field2960 = 0;
      field2944 = 0;
   }

   void method1929(String var1) {
      try {
         int var2;
         String var3;
         if (var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = class447.method2078(var3, 16, true);
            field2958 = var2;
         } else if (var1.equals("/col")) {
            field2958 = field2957;
         } else if (var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = class447.method2078(var3, 16, true);
            field2943 = var2;
         } else if (var1.equals("str")) {
            field2943 = 8388608;
         } else if (var1.equals("/str")) {
            field2943 = -1;
         } else if (var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = class447.method2078(var3, 16, true);
            field2954 = var2;
         } else if (var1.equals("u")) {
            field2954 = 0;
         } else if (var1.equals("/u")) {
            field2954 = -1;
         } else if (var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = class447.method2078(var3, 16, true);
            field2956 = var2;
         } else if (var1.equals("shad")) {
            field2956 = 0;
         } else if (var1.equals("/shad")) {
            field2956 = field2955;
         } else if (var1.equals("br")) {
            this.method1936(field2957, field2955);
         }
      } catch (Exception var4) {
      }

   }

   void method1930(String var1, int var2) {
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
         field2960 = (var2 - this.method1915(var1) << 8) / var3;
      }

   }

   void method1931(String var1, int var2, int var3) {
      var3 -= this.field2946;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class459.method2166(var1.charAt(var6)) & 255);
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
                              var9 = class447.method2083(var8.substring(4));
                              class501 var13 = field2942[var9];
                              var13.method2394(var2, var3 + this.field2946 - var13.field4009);
                              var2 += var13.field4004;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.method1929(var8);
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
                  if (this.field2953 != null && var5 != -1) {
                     var2 += this.field2953[(var5 << 8) + var7];
                  }

                  int var12 = this.field2945[var7];
                  var9 = this.field2963[var7];
                  if (var7 != ' ') {
                     if (field2959 == 256) {
                        if (field2956 != -1) {
                           method1942(this.field2961[var7], var2 + this.field2947[var7] + 1, var3 + this.field2948[var7] + 1, var12, var9, field2956);
                        }

                        this.method1912(this.field2961[var7], var2 + this.field2947[var7], var3 + this.field2948[var7], var12, var9, field2958);
                     } else {
                        if (field2956 != -1) {
                           method1934(this.field2961[var7], var2 + this.field2947[var7] + 1, var3 + this.field2948[var7] + 1, var12, var9, field2956, field2959);
                        }

                        this.method1932(this.field2961[var7], var2 + this.field2947[var7], var3 + this.field2948[var7], var12, var9, field2958, field2959);
                     }
                  } else if (field2960 > 0) {
                     field2944 += field2960;
                     var2 += field2944 >> 8;
                     field2944 &= 255;
                  }

                  int var10 = this.field2949[var7];
                  if (field2943 != -1) {
                     method1979(var2, var3 + (int)((double)this.field2946 * 0.7), var10, field2943);
                  }

                  if (field2954 != -1) {
                     method1979(var2, var3 + this.field2946 + 1, var10, field2954);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void method1911(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.field2946;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(class459.method2166(var1.charAt(var10)) & 255);
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
                              var15 = class447.method2083(var12.substring(4));
                              class501 var20 = field2942[var15];
                              var20.method2394(var2 + var13, var3 + this.field2946 - var20.field4009 + var14);
                              var2 += var20.field4004;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.method1929(var12);
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
                  if (this.field2953 != null && var8 != -1) {
                     var2 += this.field2953[(var8 << 8) + var11];
                  }

                  int var19 = this.field2945[var11];
                  var13 = this.field2963[var11];
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
                     var16 = field2958;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (field2959 == 256) {
                        if (field2956 != -1) {
                           method1942(this.field2961[var11], var2 + this.field2947[var11] + 1 + var14, var3 + this.field2948[var11] + 1 + var15, var19, var13, field2956);
                        }

                        this.method1912(this.field2961[var11], var2 + this.field2947[var11] + var14, var3 + this.field2948[var11] + var15, var19, var13, var16);
                     } else {
                        if (field2956 != -1) {
                           method1934(this.field2961[var11], var2 + this.field2947[var11] + 1 + var14, var3 + this.field2948[var11] + 1 + var15, var19, var13, field2956, field2959);
                        }

                        this.method1932(this.field2961[var11], var2 + this.field2947[var11] + var14, var3 + this.field2948[var11] + var15, var19, var13, var16, field2959);
                     }
                  } else if (field2960 > 0) {
                     field2944 += field2960;
                     var2 += field2944 >> 8;
                     field2944 &= 255;
                  }

                  int var17 = this.field2949[var11];
                  if (field2943 != -1) {
                     method1979(var2, var3 + (int)((double)this.field2946 * 0.7), var17, field2943);
                  }

                  if (field2954 != -1) {
                     method1979(var2, var3 + this.field2946, var17, field2954);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   static int method1913(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

   public static String method1928(String var0) {
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

   static void method1942(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class427.field3331;
      int var7 = class427.field3331 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class427.field3337) {
         var10 = class427.field3337 - var2;
         var4 -= var10;
         var2 = class427.field3337;
         var9 += var10 * var3;
         var6 += var10 * class427.field3331;
      }

      if (var2 + var4 > class427.field3335) {
         var4 -= var2 + var4 - class427.field3335;
      }

      if (var1 < class427.field3336) {
         var10 = class427.field3336 - var1;
         var3 -= var10;
         var1 = class427.field3336;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > class427.field3330) {
         var10 = var1 + var3 - class427.field3330;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method1933(class427.field3333, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void method1933(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void method1934(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class427.field3331;
      int var8 = class427.field3331 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class427.field3337) {
         var11 = class427.field3337 - var2;
         var4 -= var11;
         var2 = class427.field3337;
         var10 += var11 * var3;
         var7 += var11 * class427.field3331;
      }

      if (var2 + var4 > class427.field3335) {
         var4 -= var2 + var4 - class427.field3335;
      }

      if (var1 < class427.field3336) {
         var11 = class427.field3336 - var1;
         var3 -= var11;
         var1 = class427.field3336;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > class427.field3330) {
         var11 = var1 + var3 - class427.field3330;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method1935(class427.field3333, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void method1935(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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
