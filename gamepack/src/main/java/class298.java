public abstract class class298 {
   static class479 field2499 = new class479();
   static int field2498 = 0;
   boolean field2483;
   boolean field2496;
   class128 field2485;
   class128[] field2494;
   int field2489;
   int[] field2486;
   int[] field2487;
   int[] field2488;
   int[] field2492;
   int[] field2497;
   int[][] field2484;
   int[][] field2490;
   Object[] field2491;
   Object[][] field2493;
   public int field2495;

   class298(boolean var1, boolean var2) {
      this.field2496 = var1;
      this.field2483 = var2;
   }

   void method1652(byte[] var1) {
      int var4 = var1.length;
      int var6 = -1;

      int var7;
      for(var7 = 0; var7 < var4; ++var7) {
         var6 = var6 >>> 8 ^ class184.field1817[(var6 ^ var1[var7]) & 255];
      }

      var6 = ~var6;
      this.field2495 = var6;
      class184 var5 = new class184(method1657(var1));
      var6 = var5.method1125();
      if (var6 >= 5 && var6 <= 7) {
         if (var6 >= 6) {
            var5.method1129();
         }

         var7 = var5.method1125();
         if (var6 >= 7) {
            this.field2489 = var5.method1139();
         } else {
            this.field2489 = var5.method1174();
         }

         int var8 = 0;
         int var9 = -1;
         this.field2497 = new int[this.field2489];
         int var10;
         if (var6 >= 7) {
            for(var10 = 0; var10 < this.field2489; ++var10) {
               this.field2497[var10] = var8 += var5.method1139();
               if (this.field2497[var10] > var9) {
                  var9 = this.field2497[var10];
               }
            }
         } else {
            for(var10 = 0; var10 < this.field2489; ++var10) {
               this.field2497[var10] = var8 += var5.method1174();
               if (this.field2497[var10] > var9) {
                  var9 = this.field2497[var10];
               }
            }
         }

         this.field2486 = new int[var9 + 1];
         this.field2487 = new int[var9 + 1];
         this.field2488 = new int[var9 + 1];
         this.field2484 = new int[var9 + 1][];
         this.field2491 = new Object[var9 + 1];
         this.field2493 = new Object[var9 + 1][];
         if (var7 != 0) {
            this.field2492 = new int[var9 + 1];

            for(var10 = 0; var10 < this.field2489; ++var10) {
               this.field2492[this.field2497[var10]] = var5.method1129();
            }

            this.field2485 = new class128(this.field2492);
         }

         for(var10 = 0; var10 < this.field2489; ++var10) {
            this.field2486[this.field2497[var10]] = var5.method1129();
         }

         for(var10 = 0; var10 < this.field2489; ++var10) {
            this.field2487[this.field2497[var10]] = var5.method1129();
         }

         for(var10 = 0; var10 < this.field2489; ++var10) {
            this.field2488[this.field2497[var10]] = var5.method1174();
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         if (var6 >= 7) {
            for(var10 = 0; var10 < this.field2489; ++var10) {
               var11 = this.field2497[var10];
               var12 = this.field2488[var11];
               var8 = 0;
               var13 = -1;
               this.field2484[var11] = new int[var12];

               for(var14 = 0; var14 < var12; ++var14) {
                  var15 = this.field2484[var11][var14] = var8 += var5.method1139();
                  if (var15 > var13) {
                     var13 = var15;
                  }
               }

               this.field2493[var11] = new Object[var13 + 1];
            }
         } else {
            for(var10 = 0; var10 < this.field2489; ++var10) {
               var11 = this.field2497[var10];
               var12 = this.field2488[var11];
               var8 = 0;
               var13 = -1;
               this.field2484[var11] = new int[var12];

               for(var14 = 0; var14 < var12; ++var14) {
                  var15 = this.field2484[var11][var14] = var8 += var5.method1174();
                  if (var15 > var13) {
                     var13 = var15;
                  }
               }

               this.field2493[var11] = new Object[var13 + 1];
            }
         }

         if (var7 != 0) {
            this.field2490 = new int[var9 + 1][];
            this.field2494 = new class128[var9 + 1];

            for(var10 = 0; var10 < this.field2489; ++var10) {
               var11 = this.field2497[var10];
               var12 = this.field2488[var11];
               this.field2490[var11] = new int[this.field2493[var11].length];

               for(var13 = 0; var13 < var12; ++var13) {
                  this.field2490[var11][this.field2484[var11][var13]] = var5.method1129();
               }

               this.field2494[var11] = new class128(this.field2490[var11]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method1647(int var1) {
   }

   public byte[] method1629(int var1, int var2) {
      return this.method1630(var1, var2, (int[])null);
   }

   public byte[] method1630(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field2493.length && null != this.field2493[var1] && var2 >= 0 && var2 < this.field2493[var1].length) {
         if (null == this.field2493[var1][var2]) {
            boolean var5 = this.method1645(var1, var3);
            if (!var5) {
               this.method1639(var1);
               var5 = this.method1645(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class134.method895(this.field2493[var1][var2], false);
         if (this.field2483) {
            this.field2493[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean method1631(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field2493.length && this.field2493[var1] != null && var2 >= 0 && var2 < this.field2493[var1].length) {
         if (this.field2493[var1][var2] != null) {
            return true;
         } else if (null != this.field2491[var1]) {
            return true;
         } else {
            this.method1639(var1);
            return null != this.field2491[var1];
         }
      } else {
         return false;
      }
   }

   public boolean method1632(int var1) {
      if (this.field2493.length == 1) {
         return this.method1631(0, var1);
      } else if (this.field2493[var1].length == 1) {
         return this.method1631(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method1633(int var1) {
      if (this.field2491[var1] != null) {
         return true;
      } else {
         this.method1639(var1);
         return null != this.field2491[var1];
      }
   }

   public boolean method1634() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field2497.length; ++var3) {
         int var4 = this.field2497[var3];
         if (this.field2491[var4] == null) {
            this.method1639(var4);
            if (this.field2491[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   int method1635(int var1) {
      return null != this.field2491[var1] ? 100 : 0;
   }

   public byte[] method1636(int var1) {
      if (this.field2493.length == 1) {
         return this.method1629(0, var1);
      } else if (this.field2493[var1].length == 1) {
         return this.method1629(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method1637(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field2493.length && this.field2493[var1] != null && var2 >= 0 && var2 < this.field2493[var1].length) {
         if (null == this.field2493[var1][var2]) {
            boolean var4 = this.method1645(var1, (int[])null);
            if (!var4) {
               this.method1639(var1);
               var4 = this.method1645(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class134.method895(this.field2493[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] method1638(int var1) {
      if (this.field2493.length == 1) {
         return this.method1637(0, var1);
      } else if (this.field2493[var1].length == 1) {
         return this.method1637(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void method1639(int var1) {
   }

   public int[] method1640(int var1) {
      return var1 >= 0 && var1 < this.field2484.length ? this.field2484[var1] : null;
   }

   public int method1655(int var1) {
      return null != this.field2493 && var1 < this.field2493.length && this.field2493[var1] != null ? this.field2493[var1].length : 0;
   }

   public int method1641() {
      return this.field2493.length;
   }

   public void method1642() {
      for(int var2 = 0; var2 < this.field2491.length; ++var2) {
         this.field2491[var2] = null;
      }

   }

   public void method1643(int var1) {
      for(int var3 = 0; var3 < this.field2493[var1].length; ++var3) {
         this.field2493[var1][var3] = null;
      }

   }

   public void method1644() {
      for(int var2 = 0; var2 < this.field2493.length; ++var2) {
         if (this.field2493[var2] != null) {
            for(int var3 = 0; var3 < this.field2493[var2].length; ++var3) {
               this.field2493[var2][var3] = null;
            }
         }
      }

   }

   boolean method1645(int var1, int[] var2) {
      if (this.field2491[var1] == null) {
         return false;
      } else {
         int var4 = this.field2488[var1];
         int[] var5 = this.field2484[var1];
         Object[] var6 = this.field2493[var1];
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
            if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
               var22 = class134.method895(this.field2491[var1], false);
            } else {
               var22 = class134.method895(this.field2491[var1], true);
               class184 var9 = new class184(var22);
               var9.method1176(var2, 5, var9.field1816.length);
            }

            byte[] var23 = method1657(var22);
            if (this.field2496) {
               this.field2491[var1] = null;
            }

            int var11;
            if (var4 > 1) {
               int var10 = var23.length;
               --var10;
               var11 = var23[var10] & 255;
               var10 -= var11 * var4 * 4;
               class184 var12 = new class184(var23);
               int[] var13 = new int[var4];
               var12.field1818 = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.method1129();
                     var13[var16] += var15;
                  }
               }

               byte[][] var26 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var26[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.field1818 = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.method1129();
                     System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field2483) {
                     var18 = var5[var16];
                     byte[] var20 = var26[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class309 var21 = new class309();
                        var21.method893(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var26[var16];
                  }
               }
            } else if (!this.field2483) {
               var11 = var5[0];
               Object var24;
               if (var23 == null) {
                  var24 = null;
               } else if (var23.length > 136) {
                  class309 var25 = new class309();
                  var25.method893(var23);
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

   public int method1654(String var1) {
      var1 = var1.toLowerCase();
      return this.field2485.method879(class330.method1739(var1));
   }

   public int method1646(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field2494[var1].method879(class330.method1739(var2));
   }

   public boolean method1651(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field2485.method879(class330.method1739(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field2494[var4].method879(class330.method1739(var2));
         return var5 >= 0;
      }
   }

   public byte[] method1648(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field2485.method879(class330.method1739(var1));
      int var5 = this.field2494[var4].method879(class330.method1739(var2));
      return this.method1629(var4, var5);
   }

   public boolean method1649(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field2485.method879(class330.method1739(var1));
      int var5 = this.field2494[var4].method879(class330.method1739(var2));
      return this.method1631(var4, var5);
   }

   public boolean method1650(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field2485.method879(class330.method1739(var1));
      return this.method1633(var3);
   }

   public void method1653(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field2485.method879(class330.method1739(var1));
      if (var3 >= 0) {
         this.method1647(var3);
      }
   }

   public int method1656(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field2485.method879(class330.method1739(var1));
      return this.method1635(var3);
   }

   static final byte[] method1657(byte[] var0) {
      class184 var2 = new class184(var0);
      int var3 = var2.method1125();
      int var4 = var2.method1129();
      if (var4 >= 0 && (field2498 == 0 || var4 <= field2498)) {
         if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1135(var7, 0, var4);
            return var7;
         } else {
            int var5 = var2.method1129();
            if (var5 < 0 || field2498 != 0 && var5 > field2498) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class507.method2455(var6, var5, var0, var4, 9);
               } else {
                  field2499.method2313(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }
}
