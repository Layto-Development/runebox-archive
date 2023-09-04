public abstract class class509 {
   static class428 field4078 = new class428();
   static int field4077 = 0;
   boolean field4062;
   boolean field4075;
   class140 field4064;
   class140[] field4073;
   int field4068;
   int[] field4065;
   int[] field4066;
   int[] field4067;
   int[] field4071;
   int[] field4076;
   int[][] field4063;
   int[][] field4069;
   Object[] field4070;
   Object[][] field4072;
   public int field4074;

   class509(boolean var1, boolean var2) {
      this.field4075 = var1;
      this.field4062 = var2;
   }

   void method2445(byte[] var1) {
      int var4 = var1.length;
      int var6 = -1;

      int var7;
      for(var7 = 0; var7 < var4; ++var7) {
         var6 = var6 >>> 8 ^ class366.field2651[(var6 ^ var1[var7]) & 255];
      }

      var6 = ~var6;
      this.field4074 = var6;
      class366 var5 = new class366(method2450(var1));
      var6 = var5.method1654();
      if (var6 >= 5 && var6 <= 7) {
         if (var6 >= 6) {
            var5.method1658();
         }

         var7 = var5.method1654();
         if (var6 >= 7) {
            this.field4068 = var5.method1668();
         } else {
            this.field4068 = var5.method1703();
         }

         int var8 = 0;
         int var9 = -1;
         this.field4076 = new int[this.field4068];
         int var10;
         if (var6 >= 7) {
            for(var10 = 0; var10 < this.field4068; ++var10) {
               this.field4076[var10] = var8 += var5.method1668();
               if (this.field4076[var10] > var9) {
                  var9 = this.field4076[var10];
               }
            }
         } else {
            for(var10 = 0; var10 < this.field4068; ++var10) {
               this.field4076[var10] = var8 += var5.method1703();
               if (this.field4076[var10] > var9) {
                  var9 = this.field4076[var10];
               }
            }
         }

         this.field4065 = new int[var9 + 1];
         this.field4066 = new int[var9 + 1];
         this.field4067 = new int[var9 + 1];
         this.field4063 = new int[var9 + 1][];
         this.field4070 = new Object[var9 + 1];
         this.field4072 = new Object[var9 + 1][];
         if (var7 != 0) {
            this.field4071 = new int[var9 + 1];

            for(var10 = 0; var10 < this.field4068; ++var10) {
               this.field4071[this.field4076[var10]] = var5.method1658();
            }

            this.field4064 = new class140(this.field4071);
         }

         for(var10 = 0; var10 < this.field4068; ++var10) {
            this.field4065[this.field4076[var10]] = var5.method1658();
         }

         for(var10 = 0; var10 < this.field4068; ++var10) {
            this.field4066[this.field4076[var10]] = var5.method1658();
         }

         for(var10 = 0; var10 < this.field4068; ++var10) {
            this.field4067[this.field4076[var10]] = var5.method1703();
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         if (var6 >= 7) {
            for(var10 = 0; var10 < this.field4068; ++var10) {
               var11 = this.field4076[var10];
               var12 = this.field4067[var11];
               var8 = 0;
               var13 = -1;
               this.field4063[var11] = new int[var12];

               for(var14 = 0; var14 < var12; ++var14) {
                  var15 = this.field4063[var11][var14] = var8 += var5.method1668();
                  if (var15 > var13) {
                     var13 = var15;
                  }
               }

               this.field4072[var11] = new Object[var13 + 1];
            }
         } else {
            for(var10 = 0; var10 < this.field4068; ++var10) {
               var11 = this.field4076[var10];
               var12 = this.field4067[var11];
               var8 = 0;
               var13 = -1;
               this.field4063[var11] = new int[var12];

               for(var14 = 0; var14 < var12; ++var14) {
                  var15 = this.field4063[var11][var14] = var8 += var5.method1703();
                  if (var15 > var13) {
                     var13 = var15;
                  }
               }

               this.field4072[var11] = new Object[var13 + 1];
            }
         }

         if (var7 != 0) {
            this.field4069 = new int[var9 + 1][];
            this.field4073 = new class140[var9 + 1];

            for(var10 = 0; var10 < this.field4068; ++var10) {
               var11 = this.field4076[var10];
               var12 = this.field4067[var11];
               this.field4069[var11] = new int[this.field4072[var11].length];

               for(var13 = 0; var13 < var12; ++var13) {
                  this.field4069[var11][this.field4063[var11][var13]] = var5.method1658();
               }

               this.field4073[var11] = new class140(this.field4069[var11]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method2440(int var1) {
   }

   public byte[] method2422(int var1, int var2) {
      return this.method2423(var1, var2, (int[])null);
   }

   public byte[] method2423(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field4072.length && null != this.field4072[var1] && var2 >= 0 && var2 < this.field4072[var1].length) {
         if (null == this.field4072[var1][var2]) {
            boolean var5 = this.method2438(var1, var3);
            if (!var5) {
               this.method2432(var1);
               var5 = this.method2438(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class68.method292(this.field4072[var1][var2], false);
         if (this.field4062) {
            this.field4072[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean method2424(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field4072.length && this.field4072[var1] != null && var2 >= 0 && var2 < this.field4072[var1].length) {
         if (this.field4072[var1][var2] != null) {
            return true;
         } else if (null != this.field4070[var1]) {
            return true;
         } else {
            this.method2432(var1);
            return null != this.field4070[var1];
         }
      } else {
         return false;
      }
   }

   public boolean method2425(int var1) {
      if (1 == this.field4072.length) {
         return this.method2424(0, var1);
      } else if (1 == this.field4072[var1].length) {
         return this.method2424(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method2426(int var1) {
      if (this.field4070[var1] != null) {
         return true;
      } else {
         this.method2432(var1);
         return null != this.field4070[var1];
      }
   }

   public boolean method2427() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field4076.length; ++var3) {
         int var4 = this.field4076[var3];
         if (this.field4070[var4] == null) {
            this.method2432(var4);
            if (this.field4070[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   int method2428(int var1) {
      return null != this.field4070[var1] ? 100 : 0;
   }

   public byte[] method2429(int var1) {
      if (1 == this.field4072.length) {
         return this.method2422(0, var1);
      } else if (1 == this.field4072[var1].length) {
         return this.method2422(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method2430(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field4072.length && this.field4072[var1] != null && var2 >= 0 && var2 < this.field4072[var1].length) {
         if (null == this.field4072[var1][var2]) {
            boolean var4 = this.method2438(var1, (int[])null);
            if (!var4) {
               this.method2432(var1);
               var4 = this.method2438(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class68.method292(this.field4072[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] method2431(int var1) {
      if (this.field4072.length == 1) {
         return this.method2430(0, var1);
      } else if (this.field4072[var1].length == 1) {
         return this.method2430(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void method2432(int var1) {
   }

   public int[] method2433(int var1) {
      return var1 >= 0 && var1 < this.field4063.length ? this.field4063[var1] : null;
   }

   public int method2448(int var1) {
      return null != this.field4072 && var1 < this.field4072.length && this.field4072[var1] != null ? this.field4072[var1].length : 0;
   }

   public int method2434() {
      return this.field4072.length;
   }

   public void method2435() {
      for(int var2 = 0; var2 < this.field4070.length; ++var2) {
         this.field4070[var2] = null;
      }

   }

   public void method2436(int var1) {
      for(int var3 = 0; var3 < this.field4072[var1].length; ++var3) {
         this.field4072[var1][var3] = null;
      }

   }

   public void method2437() {
      for(int var2 = 0; var2 < this.field4072.length; ++var2) {
         if (this.field4072[var2] != null) {
            for(int var3 = 0; var3 < this.field4072[var2].length; ++var3) {
               this.field4072[var2][var3] = null;
            }
         }
      }

   }

   boolean method2438(int var1, int[] var2) {
      if (this.field4070[var1] == null) {
         return false;
      } else {
         int var4 = this.field4067[var1];
         int[] var5 = this.field4063[var1];
         Object[] var6 = this.field4072[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (null == var6[var5[var8]]) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var22;
            if (var2 == null || var2[0] == 0 && 0 == var2[1] && 0 == var2[2] && 0 == var2[3]) {
               var22 = class68.method292(this.field4070[var1], false);
            } else {
               var22 = class68.method292(this.field4070[var1], true);
               class366 var9 = new class366(var22);
               var9.method1705(var2, 5, var9.field2650.length);
            }

            byte[] var23 = method2450(var22);
            if (this.field4075) {
               this.field4070[var1] = null;
            }

            int var11;
            if (var4 > 1) {
               int var10 = var23.length;
               --var10;
               var11 = var23[var10] & 255;
               var10 -= var11 * var4 * 4;
               class366 var12 = new class366(var23);
               int[] var13 = new int[var4];
               var12.field2652 = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.method1658();
                     var13[var16] += var15;
                  }
               }

               byte[][] var26 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var26[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.field2652 = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.method1658();
                     System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field4062) {
                     var18 = var5[var16];
                     byte[] var20 = var26[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class26 var21 = new class26();
                        var21.method290(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var26[var16];
                  }
               }
            } else if (!this.field4062) {
               var11 = var5[0];
               Object var24;
               if (var23 == null) {
                  var24 = null;
               } else if (var23.length > 136) {
                  class26 var25 = new class26();
                  var25.method290(var23);
                  var24 = var25;
               } else {
                  var24 = var23;
               }

               var6[var11] = var24;
            } else {
               var6[var5[0]] = var23;
            }

            return true;
         }
      }
   }

   public int method2447(String var1) {
      var1 = var1.toLowerCase();
      return this.field4064.method503(class447.method2086(var1));
   }

   public int method2439(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field4073[var1].method503(class447.method2086(var2));
   }

   public boolean method2444(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field4064.method503(class447.method2086(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field4073[var4].method503(class447.method2086(var2));
         return var5 >= 0;
      }
   }

   public byte[] method2441(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field4064.method503(class447.method2086(var1));
      int var5 = this.field4073[var4].method503(class447.method2086(var2));
      return this.method2422(var4, var5);
   }

   public boolean method2442(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field4064.method503(class447.method2086(var1));
      int var5 = this.field4073[var4].method503(class447.method2086(var2));
      return this.method2424(var4, var5);
   }

   public boolean method2443(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field4064.method503(class447.method2086(var1));
      return this.method2426(var3);
   }

   public void method2446(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field4064.method503(class447.method2086(var1));
      if (var3 >= 0) {
         this.method2440(var3);
      }
   }

   public int method2449(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field4064.method503(class447.method2086(var1));
      return this.method2428(var3);
   }

   static final byte[] method2450(byte[] var0) {
      class366 var2 = new class366(var0);
      int var3 = var2.method1654();
      int var4 = var2.method1658();
      if (var4 >= 0 && (field4077 == 0 || var4 <= field4077)) {
         if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1664(var7, 0, var4);
            return var7;
         } else {
            int var5 = var2.method1658();
            if (var5 < 0 || field4077 != 0 && var5 > field4077) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class89.method341(var6, var5, var0, var4, 9);
               } else {
                  field4078.method1986(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }
}
