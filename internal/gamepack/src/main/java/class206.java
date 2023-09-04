import java.util.Arrays;

public class class206 {
   public static class245 field1591;
   public static short[] field1588;
   public static short[][] field1595;
   static class172 field1592;
   static int field1593;
   static final int[] field1590;
   boolean field1587 = false;
   class301[] field1589;
   int[] field1581;
   int[] field1582;
   int[] field1594;
   long field1584;
   long field1586;
   public int field1580;
   public int field1583 = 0;
   public int field1585 = -1;

   static {
      field1590 = new int[]{class252.field1831.field1830, class252.field1834.field1830, class252.field1828.field1830, class252.field1824.field1830, class252.field1837.field1830, class252.field1826.field1830, class252.field1833.field1830};
      field1591 = new class245(260);
      field1592 = new class172(16, class418.field2939);
      field1593 = 0;
   }

   public class206() {
   }

   class206(class206 var1) {
      int[] var2 = Arrays.copyOf(var1.field1581, var1.field1581.length);
      int[] var3 = Arrays.copyOf(var1.field1594, var1.field1594.length);
      class301[] var4 = (class301[])(null != var1.field1589 ? (class301[])Arrays.copyOf(var1.field1589, var1.field1589.length) : null);
      int[] var5 = Arrays.copyOf(var1.field1582, var1.field1582.length);
      this.method1071(var3, var2, var4, false, var5, var1.field1583, var1.field1580, var1.field1585);
   }

   public void method1071(int[] var1, int[] var2, class301[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.field1589 = var3;
      this.field1587 = var4;
      this.field1585 = var8;
      this.method1080(var1, var2, var5, var6, var7);
   }

   public void method1080(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.method1072(var4, (byte)67);
      }

      if (null == var2) {
         var2 = this.method1072(var4, (byte)13);
      }

      this.field1594 = var1;
      this.field1581 = var2;
      this.field1582 = var3;
      this.field1583 = var4;
      this.field1580 = var5;
      this.method1076();
   }

   int[] method1072(int var1, byte var2) {
      int[] var3 = new int[12];

      for(int var4 = 0; var4 < 7; ++var4) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         for(int var5 = 0; var5 < class21.field218; ++var5) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            class21 var6 = class21.method117(var5);
            if (null != var6) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               if (!var6.field225) {
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

                  if (var4 + var10001 == var6.field219) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var3[field1590[var4]] = var5 + 256;
                     break;
                  }
               }
            }
         }
      }

      return var3;
   }

   public void method1073(int var1, boolean var2) {
      int var4 = this.field1581[field1590[var1]];
      if (var4 != 0) {
         var4 -= 256;

         class21 var5;
         do {
            if (!var2) {
               --var4;
               if (var4 < 0) {
                  var4 = class21.field218 - 1;
               }
            } else {
               ++var4;
               if (var4 >= class21.field218) {
                  var4 = 0;
               }
            }

            var5 = class21.method117(var4);
         } while(null == var5 || var5.field225 || (this.field1583 == 1 ? 7 : 0) + var1 != var5.field219);

         this.field1581[field1590[var1]] = var4 + 256;
         this.method1076();
      }
   }

   public void method1074(int var1, boolean var2) {
      int var4 = this.field1582[var1];
      boolean var5;
      if (!var2) {
         do {
            --var4;
            if (var4 < 0) {
               var4 = class343.field2556[var1].length - 1;
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
            if (var4 >= class343.field2556[var1].length) {
               var4 = 0;
            }

            if (var1 == 4 && var4 >= 8) {
               var5 = false;
            } else {
               var5 = true;
            }
         } while(!var5);
      }

      this.field1582[var1] = var4;
      this.method1076();
   }

   public void method1081(int var1) {
      if (var1 != this.field1583) {
         this.method1080((int[])null, (int[])null, this.field1582, var1, -1);
      }
   }

   public void method1075(class366 var1) {
      var1.method1643(this.field1583);

      int var3;
      for(var3 = 0; var3 < 7; ++var3) {
         int var4 = this.field1581[field1590[var3]];
         if (var4 == 0) {
            var1.method1643(-1);
         } else {
            var1.method1643(var4 - 256);
         }
      }

      for(var3 = 0; var3 < 5; ++var3) {
         var1.method1643(this.field1582[var3]);
      }

   }

   void method1076() {
      long var2 = this.field1584;
      int var4 = this.field1581[5];
      int var5 = this.field1581[9];
      this.field1581[5] = var5;
      this.field1581[9] = var4;
      this.field1584 = 0L;

      int var6;
      for(var6 = 0; var6 < 12; ++var6) {
         this.field1584 <<= 4;
         if (this.field1581[var6] >= 256) {
            this.field1584 += (long)(this.field1581[var6] - 256);
         }
      }

      if (this.field1581[0] >= 256) {
         this.field1584 += (long)(this.field1581[0] - 256 >> 4);
      }

      if (this.field1581[1] >= 256) {
         this.field1584 += (long)(this.field1581[1] - 256 >> 8);
      }

      for(var6 = 0; var6 < 5; ++var6) {
         this.field1584 <<= 3;
         this.field1584 += (long)this.field1582[var6];
      }

      this.field1584 <<= 1;
      this.field1584 += (long)this.field1583;
      this.field1581[5] = var4;
      this.field1581[9] = var5;
      if (var2 != 0L && var2 != this.field1584 || this.field1587) {
         field1591.method1181(var2);
      }

   }

   public class485 method1082(class464 var1, int var2, class464 var3, int var4) {
      if (-1 != this.field1580) {
         return class90.method359(this.field1580).method347(var1, var2, var3, var4, (class350)null);
      } else {
         long var6 = this.field1584;
         int[] var8 = this.field1581;
         if (var1 != null && (var1.field3679 >= 0 || var1.field3684 >= 0)) {
            var8 = new int[12];

            for(int var9 = 0; var9 < 12; ++var9) {
               var8[var9] = this.field1581[var9];
            }

            if (var1.field3679 >= 0) {
               var6 += (long)(var1.field3679 - this.field1581[5] << 40);
               var8[5] = var1.field3679;
            }

            if (var1.field3684 >= 0) {
               var6 += (long)(var1.field3684 - this.field1581[3] << 48);
               var8[3] = var1.field3684;
            }
         }

         class485 var19 = (class485)field1591.method1183(var6);
         if (var19 == null) {
            boolean var10 = false;

            int var12;
            for(int var11 = 0; var11 < 12; ++var11) {
               var12 = var8[var11];
               if (var12 >= 256 && var12 < 512 && !class21.method117(var12 - 256).method110()) {
                  var10 = true;
               }

               if (var12 >= 512 && !class47.method213(var12 - 512).method200(this.field1583)) {
                  var10 = true;
               }
            }

            if (var10) {
               if (-1L != this.field1586) {
                  var19 = (class485)field1591.method1183(this.field1586);
               }

               if (var19 == null) {
                  return null;
               }
            }

            if (null == var19) {
               class327[] var21 = new class327[12];
               var12 = 0;

               int var14;
               for(int var13 = 0; var13 < 12; ++var13) {
                  var14 = var8[var13];
                  if (var14 >= 256 && var14 < 512) {
                     class327 var15 = class21.method117(var14 - 256).method111();
                     if (null != var15) {
                        var21[var12++] = var15;
                     }
                  }

                  if (var14 >= 512) {
                     class47 var23 = class47.method213(var14 - 512);
                     class327 var16 = var23.method201(this.field1583);
                     if (null != var16) {
                        if (null != this.field1589) {
                           class301 var17 = this.field1589[var13];
                           if (null != var17) {
                              int var18;
                              if (var17.field2048 != null && var23.field399 != null && var23.field367.length == var17.field2048.length) {
                                 for(var18 = 0; var18 < var23.field399.length; ++var18) {
                                    var16.method1513(var23.field367[var18], var17.field2048[var18]);
                                 }
                              }

                              if (null != var17.field2049 && null != var23.field393 && var17.field2049.length == var23.field369.length) {
                                 for(var18 = 0; var18 < var23.field393.length; ++var18) {
                                    var16.method1504(var23.field369[var18], var17.field2049[var18]);
                                 }
                              }
                           }
                        }

                        var21[var12++] = var16;
                     }
                  }
               }

               class327 var22 = new class327(var21, var12);

               for(var14 = 0; var14 < 5; ++var14) {
                  if (this.field1582[var14] < class343.field2556[var14].length) {
                     var22.method1513(class208.field1605[var14], class343.field2556[var14][this.field1582[var14]]);
                  }

                  if (this.field1582[var14] < field1595[var14].length) {
                     var22.method1513(field1588[var14], field1595[var14][this.field1582[var14]]);
                  }
               }

               var19 = var22.method1510(64, 850, -30, -50, -30);
               field1591.method1182(var19, var6);
               this.field1586 = var6;
            }
         }

         class485 var20;
         if (null == var1 && null == var3) {
            var20 = var19.method2292(true);
         } else if (null != var1 && null != var3) {
            var20 = var1.method2193(var19, var2, var3, var4);
         } else if (null != var1) {
            var20 = var1.method2191(var19, var2);
         } else {
            var20 = var3.method2191(var19, var4);
         }

         return var20;
      }
   }

   class327 method1077() {
      if (this.field1580 != -1) {
         return class90.method359(this.field1580).method348((class350)null);
      } else {
         boolean var2 = false;

         int var4;
         for(int var3 = 0; var3 < 12; ++var3) {
            var4 = this.field1581[var3];
            if (var4 >= 256 && var4 < 512 && !class21.method117(var4 - 256).method115()) {
               var2 = true;
            }

            if (var4 >= 512 && !class47.method213(var4 - 512).method202(this.field1583)) {
               var2 = true;
            }
         }

         if (var2) {
            return null;
         } else {
            class327[] var8 = new class327[12];
            var4 = 0;

            int var6;
            for(int var5 = 0; var5 < 12; ++var5) {
               var6 = this.field1581[var5];
               class327 var7;
               if (var6 >= 256 && var6 < 512) {
                  var7 = class21.method117(var6 - 256).method114();
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }

               if (var6 >= 512) {
                  var7 = class47.method213(var6 - 512).method205(this.field1583);
                  if (var7 != null) {
                     var8[var4++] = var7;
                  }
               }
            }

            class327 var9 = new class327(var8, var4);

            for(var6 = 0; var6 < 5; ++var6) {
               if (this.field1582[var6] < class343.field2556[var6].length) {
                  var9.method1513(class208.field1605[var6], class343.field2556[var6][this.field1582[var6]]);
               }

               if (this.field1582[var6] < field1595[var6].length) {
                  var9.method1513(field1588[var6], field1595[var6][this.field1582[var6]]);
               }
            }

            return var9;
         }
      }
   }

   public int method1078() {
      long var2 = this.field1584;
      if (this.field1580 != -1) {
         var2 = -65536L | (long)this.field1580;
      }

      Integer var4 = (Integer)field1592.method659(var2, (byte)-31);
      if (null == var4) {
         var4 = ++field1593 - 1;
         field1592.method660(var2, var4);
         field1593 %= 65535;
      }

      return var4;
   }

   void method1079() {
      this.method1080(this.field1594, this.field1581, this.field1582, this.field1583, this.field1580);
   }
}
