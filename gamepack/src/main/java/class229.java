import java.util.Arrays;

public class class229 {
   public static class364 field2124;
   public static short[] field2121;
   public static short[][] field2128;
   static class354 field2125;
   static int field2126;
   static final int[] field2123;
   boolean field2120 = false;
   class136[] field2122;
   int[] field2114;
   int[] field2115;
   int[] field2127;
   long field2117;
   long field2119;
   public int field2113;
   public int field2116 = 0;
   public int field2118 = -1;

   static {
      field2123 = new int[]{class94.field1306.field1305, class94.field1309.field1305, class94.field1303.field1305, class94.field1299.field1305, class94.field1312.field1305, class94.field1301.field1305, class94.field1308.field1305};
      field2124 = new class364(260);
      field2125 = new class354(16, class260.field2282);
      field2126 = 0;
   }

   public class229() {
   }

   class229(class229 var1) {
      int[] var2 = Arrays.copyOf(var1.field2114, var1.field2114.length);
      int[] var3 = Arrays.copyOf(var1.field2127, var1.field2127.length);
      class136[] var4 = (class136[])(null != var1.field2122 ? (class136[])Arrays.copyOf(var1.field2122, var1.field2122.length) : null);
      int[] var5 = Arrays.copyOf(var1.field2115, var1.field2115.length);
      this.method1385(var3, var2, var4, false, var5, var1.field2116, var1.field2113, var1.field2118);
   }

   public void method1385(int[] var1, int[] var2, class136[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.field2122 = var3;
      this.field2120 = var4;
      this.field2118 = var8;
      this.method1394(var1, var2, var5, var6, var7);
   }

   public void method1394(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.method1386(var4, (byte)67);
      }

      if (null == var2) {
         var2 = this.method1386(var4, (byte)13);
      }

      this.field2127 = var1;
      this.field2114 = var2;
      this.field2115 = var3;
      this.field2116 = var4;
      this.field2113 = var5;
      this.method1390();
   }

   int[] method1386(int var1, byte var2) {
      int[] var3 = new int[12];

      for(int var4 = 0; var4 < 7; ++var4) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         for(int var5 = 0; var5 < class396.field3093; ++var5) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            class396 var6 = class396.method1915(var5);
            if (null != var6) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               if (!var6.field3100) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  byte var10001;
                  if (var1 == 1) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var10001 = 7;
                  } else {
                     var10001 = 0;
                  }

                  if (var4 + var10001 == var6.field3094) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var3[field2123[var4]] = var5 + 256;
                     break;
                  }
               }
            }
         }
      }

      return var3;
   }

   public void method1387(int var1, boolean var2) {
      int var4 = this.field2114[field2123[var1]];
      if (var4 != 0) {
         var4 -= 256;

         class396 var5;
         do {
            if (!var2) {
               --var4;
               if (var4 < 0) {
                  var4 = class396.field3093 - 1;
               }
            } else {
               ++var4;
               if (var4 >= class396.field3093) {
                  var4 = 0;
               }
            }

            var5 = class396.method1915(var4);
         } while(null == var5 || var5.field3100 || (this.field2116 == 1 ? 7 : 0) + var1 != var5.field3094);

         this.field2114[field2123[var1]] = var4 + 256;
         this.method1390();
      }
   }

   public void method1388(int var1, boolean var2) {
      int var4 = this.field2115[var1];
      boolean var5;
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class527.field4149[var1].length - 1;
            }

            if (var1 == 4 && var4 >= 8) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      } else {
         do {
            ++var4;
            if (var4 >= class527.field4149[var1].length) {
               var4 = 0;
            }

            if (var1 == 4 && var4 >= 8) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      }

      this.field2115[var1] = var4;
      this.method1390();
   }

   public void method1395(int var1) {
      if (var1 != this.field2116) {
         this.method1394((int[])null, (int[])null, this.field2115, var1, -1);
      }
   }

   public void method1389(class184 var1) {
      var1.method1114(this.field2116);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field2114[field2123[var3]];
         if (var4 == 0) {
            var1.method1114(-1);
         } else {
            var1.method1114(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.method1114(this.field2115[var3]);
      }

   }

   void method1390() {
      long var2 = this.field2117;
      int var4 = this.field2114[5];
      int var5 = this.field2114[9];
      this.field2114[5] = var5;
      this.field2114[9] = var4;
      this.field2117 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field2117 <<= 4;
         if (this.field2114[var6] >= 256) {
            this.field2117 += (long)(this.field2114[var6] - 256);
         }
      }

      if (this.field2114[0] >= 256) {
         this.field2117 += (long)(this.field2114[0] - 256 >> 4);
      }

      if (this.field2114[1] >= 256) {
         this.field2117 += (long)(this.field2114[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field2117 <<= 3;
         this.field2117 += (long)this.field2115[var6];
      }

      this.field2117 <<= 1;
      this.field2117 += (long)this.field2116;
      this.field2114[5] = var4;
      this.field2114[9] = var5;
      if (var2 != 0L && var2 != this.field2117 || this.field2120) {
         field2124.method1849(var2);
      }

   }

   public class104 method1396(class157 var1, int var2, class157 var3, int var4) {
      if (this.field2113 != -1) {
         return class453.method2242(this.field2113).method2230(var1, var2, var3, var4, (class90)null);
      } else {
         long var6 = this.field2117;
         int[] var8 = this.field2114;
         if (var1 != null && (var1.field1668 >= 0 || var1.field1673 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.field2114[var9];
            }

            if (var1.field1668 >= 0) {
               var6 += (long)(var1.field1668 - this.field2114[5] << 40);
               var8[5] = var1.field1668;
            }

            if (var1.field1673 >= 0) {
               var6 += (long)(var1.field1673 - this.field2114[3] << 48);
               var8[3] = var1.field1673;
            }
         }

         class104 var19 = (class104)field2124.method1851(var6);
         if (var19 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !class396.method1915(var12 - 256).method1908()) {
                  var10 = true;
               }

               if (var12 >= 512 && !class71.method682(var12 - 512).method669(this.field2116)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (-1L != this.field2119) {
                  var19 = (class104)field2124.method1851(this.field2119);
               }

               if (var19 == null) {
                  return null;
               }
            }

            if (null == var19) {
               class533[] var21 = new class533[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     class533 var15 = class396.method1915(var14 - 256).method1909();
                     if (null != var15) {
                        var21[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     class71 var23 = class71.method682(var14 - 512);
                     class533 var16 = var23.method670(this.field2116);
                     if (null != var16) {
                        if (null != this.field2122) {
                           class136 var17 = this.field2122[var13];
                           if (null != var17) {
                              int var18;
                              if (var17.field1572 != null && var23.field1179 != null && var23.field1147.length == var17.field1572.length) {
                                 for(var18 = 0; var18 < var23.field1179.length; ++var18) {
                                    var16.method2537(var23.field1147[var18], var17.field1572[var18]);
                                 }
                              }

                              if (null != var17.field1573 && null != var23.field1173 && var17.field1573.length == var23.field1149.length) {
                                 for(var18 = 0; var18 < var23.field1173.length; ++var18) {
                                    var16.method2528(var23.field1149[var18], var17.field1573[var18]);
                                 }
                              }
                           }
                        }

                        var21[var12++] = var16;
                     }
                  }
               }

               class533 var22 = new class533(var21, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.field2115[var14] < class527.field4149[var14].length) {
                     var22.method2537(class539.field4264[var14], class527.field4149[var14][this.field2115[var14]]);
                  }

                  if (this.field2115[var14] < field2128[var14].length) {
                     var22.method2537(field2121[var14], field2128[var14][this.field2115[var14]]);
                  }
               }

               var19 = var22.method2534(64, 850, -30, -50, -30);
               field2124.method1850(var19, var6);
               this.field2119 = var6;
            }
         }

         class104 var20;
         if (null == var1 && null == var3) {
            var20 = var19.method757(true);
         } else if (null != var1 && null != var3) {
            var20 = var1.method977(var19, var2, var3, var4);
         } else if (null != var1) {
            var20 = var1.method975(var19, var2);
         } else {
            var20 = var3.method975(var19, var4);
         }

         return var20;
      }
   }

   class533 method1391() {
      if (this.field2113 != -1) {
         return class453.method2242(this.field2113).method2231((class90)null);
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field2114[var3];
            if (var4 >= 256 && var4 < 512 && !class396.method1915(var4 - 256).method1913()) {
               var2 = true;
            }

            if (var4 >= 512 && !class71.method682(var4 - 512).method671(this.field2116)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class533[] var8 = new class533[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field2114[var5];
               class533 var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = class396.method1915(var6 - 256).method1912();
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = class71.method682(var6 - 512).method674(this.field2116);
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class533 var9 = new class533(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.field2115[var6] < class527.field4149[var6].length) {
                  var9.method2537(class539.field4264[var6], class527.field4149[var6][this.field2115[var6]]);
               }

               if (this.field2115[var6] < field2128[var6].length) {
                  var9.method2537(field2121[var6], field2128[var6][this.field2115[var6]]);
               }
            }

            return var9;
         }
      }
   }

   public int method1392() {
      long var2 = this.field2117;
      if (this.field2113 != -1) {
         var2 = -65536L | (long)this.field2113;
      }

      Integer var4 = (Integer)field2125.method1819(var2, (byte)-31);
      if (null == var4) {
         var4 = ++field2126 - 1;
         field2125.method1820(var2, var4);
         field2126 %= 65535;
      }

      return var4;
   }

   void method1393() {
      this.method1394(this.field2127, this.field2114, this.field2115, this.field2116, this.field2113);
   }
}
