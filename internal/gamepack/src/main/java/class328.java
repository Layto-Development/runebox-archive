import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class class328 {
   static class17 field2483 = new class17(37748736, 256);
   class282 field2484;
   int field2479;
   int field2485;
   int field2486;
   int field2488;
   HashMap field2487;
   LinkedList field2481;
   List field2480;
   final HashMap field2482;

   class328(int var1, int var2, int var3, HashMap var4) {
      this.field2488 = var1;
      this.field2479 = var2;
      this.field2481 = new LinkedList();
      this.field2480 = new LinkedList();
      this.field2487 = new HashMap();
      this.field2485 = var3 | -16777216;
      this.field2482 = var4;
   }

   void method1546(int var1, int var2, int var3) {
      class296 var5 = method1554(this.field2488, this.field2479, this.field2486);
      if (var5 != null) {
         if (var3 == this.field2486 * 64) {
            var5.method1346(var1, var2);
         } else {
            var5.method1362(var1, var2, var3, var3);
         }

      }
   }

   void method1548(class282 var1, List var2) {
      this.field2487.clear();
      this.field2484 = var1;
      this.method1547(var2);
   }

   void method1519(HashSet var1, List var2) {
      this.field2487.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class110 var5 = (class110)var4.next();
         if (var5.method598() == this.field2488 && var5.method599() == this.field2479) {
            this.field2481.add(var5);
         }
      }

      this.method1547(var2);
   }

   void method1520(int var1, int var2, int var3, int var4, class157 var5) {
      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         label65:
         for(int var8 = var2; var8 < var4 + var2; ++var8) {
            for(int var9 = 0; var9 < var5.field987; ++var9) {
               class152[] var10 = var5.field994[var9][var7][var8];
               if (var10 != null && 0 != var10.length) {
                  class152[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class458 var14;
                     boolean var15;
                     label56: {
                        class152 var13 = var11[var12];
                        var14 = class430.method2004(var13.field967, (byte)-78);
                        if (var14.field3636 != null) {
                           int[] var16 = var14.field3636;

                           for(int var17 = 0; var17 < var16.length; ++var17) {
                              int var18 = var16[var17];
                              class458 var19 = class430.method2004(var18, (byte)-65);
                              if (-1 != var19.field3629) {
                                 var15 = true;
                                 break label56;
                              }
                           }
                        } else if (-1 != var14.field3629) {
                           var15 = true;
                           break label56;
                        }

                        var15 = false;
                     }

                     if (var15) {
                        this.method1544(var14, var9, var7, var8, var5);
                        continue label65;
                     }
                  }
               }
            }
         }
      }

   }

   void method1544(class458 var1, int var2, int var3, int var4, class157 var5) {
      class113 var7 = new class113(var2, var3 + this.field2488 * 64, var4 + this.field2479 * 64);
      class113 var8 = null;
      if (this.field2484 != null) {
         var8 = new class113(this.field2484.field986 + var2, this.field2484.field991 * 64 + var3, var4 + this.field2484.field989 * 64);
      } else {
         class110 var9 = (class110)var5;
         var8 = new class113(var9.field986 + var2, var3 + var9.field991 * 64 + var9.method398() * 8, var4 + var9.field989 * 64 + var9.method399() * 8);
      }

      class430 var10;
      Object var11;
      if (null != var1.field3636) {
         var11 = new class217(var8, var7, var1.field3602, this);
      } else {
         var10 = class430.method2005(var1.field3629);
         var11 = new class178(var8, var7, var10.field3349, this.method1537(var10));
      }

      var10 = class430.method2005(((class368)var11).method1720());
      if (var10.field3351) {
         this.field2487.put(new class113(0, var3, var4), var11);
      }

   }

   void method1522() {
      Iterator var2 = this.field2487.values().iterator();

      while(var2.hasNext()) {
         class368 var3 = (class368)var2.next();
         if (var3 instanceof class217) {
            ((class217)var3).method1107();
         }
      }

   }

   void method1547(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class178 var4 = (class178)var3.next();
         if (class430.method2005(var4.field1434).field3351 && var4.field2659.field726 >> 6 == this.field2488 && this.field2479 == var4.field2659.field728 >> 6) {
            class178 var5 = new class178(var4.field2659, var4.field2659, var4.field1434, this.method1551(var4.field1434));
            this.field2480.add(var5);
         }
      }

   }

   void method1523() {
      if (null != this.field2484) {
         this.field2484.method594();
      } else {
         Iterator var2 = this.field2481.iterator();

         while(var2.hasNext()) {
            class110 var3 = (class110)var2.next();
            var3.method594();
         }
      }

   }

   boolean method1545(class509 var1) {
      this.field2487.clear();
      if (null != this.field2484) {
         this.field2484.method593(var1);
         if (this.field2484.method592()) {
            this.method1520(0, 0, 64, 64, this.field2484);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         class110 var5;
         for(var4 = this.field2481.iterator(); var4.hasNext(); var3 &= var5.method592()) {
            var5 = (class110)var4.next();
            var5.method593(var1);
         }

         if (var3) {
            var4 = this.field2481.iterator();

            while(var4.hasNext()) {
               var5 = (class110)var4.next();
               this.method1520(var5.method397() * 8, var5.method396() * 8, 8, 8, var5);
            }
         }

         return var3;
      }
   }

   void method1549(int var1, class14 var2, class501[] var3, class509 var4, class509 var5) {
      this.field2486 = var1;
      if (this.field2484 != null || !this.field2481.isEmpty()) {
         if (method1554(this.field2488, this.field2479, var1) == null) {
            boolean var7 = true;
            var7 &= this.method1545(var4);
            int var9;
            if (null != this.field2484) {
               var9 = this.field2484.field993;
            } else {
               var9 = ((class157)this.field2481.getFirst()).field993;
            }

            var7 &= var5.method2426(var9);
            if (var7) {
               byte[] var8 = var5.method2429(var9);
               class361 var10;
               if (null == var8) {
                  var10 = new class361();
               } else {
                  var10 = new class361(class298.method1374(var8).field2031);
               }

               class296 var12 = new class296(this.field2486 * 64, this.field2486 * 64);
               var12.method1340();
               if (this.field2484 != null) {
                  this.method1527(var2, var3, var10);
               } else {
                  this.method1528(var2, var3, var10);
               }

               int var13 = this.field2488;
               int var14 = this.field2479;
               int var15 = this.field2486;
               class17 var16 = field2483;
               long var18 = (long)(var15 << 16 | var13 << 8 | var14);
               var16.method100(var12, var18, 4 * var12.field2031.length);
               this.method1523();
            }
         }
      }
   }

   void method1525(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method1533(var1, var2, var4, var3);
      this.method1541(var1, var2, var4, var3);
   }

   void method1526(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field2487.values().iterator();

      while(var5.hasNext()) {
         class368 var6 = (class368)var5.next();
         if (var6.method1722()) {
            int var7 = var6.method1720();
            if (var1.contains(var7)) {
               class430 var8 = class430.method2005(var7);
               this.method1543(var8, var6.field2661, var6.field2662, var2, var3);
            }
         }
      }

      this.method1542(var1, var2, var3);
   }

   void method1527(class14 var1, class501[] var2, class361 var3) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method1529(var5, var6, this.field2484, var1, var3);
            this.method1530(var5, var6, this.field2484, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method1552(var5, var6, this.field2484, var1, var2);
         }
      }

   }

   void method1528(class14 var1, class501[] var2, class361 var3) {
      Iterator var5 = this.field2481.iterator();

      class110 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class110)var5.next();

         for(var7 = var6.method397() * 8; var7 < var6.method397() * 8 + 8; ++var7) {
            for(var8 = var6.method396() * 8; var8 < var6.method396() * 8 + 8; ++var8) {
               this.method1529(var7, var8, var6, var1, var3);
               this.method1530(var7, var8, var6, var1);
            }
         }
      }

      var5 = this.field2481.iterator();

      while(var5.hasNext()) {
         var6 = (class110)var5.next();

         for(var7 = var6.method397() * 8; var7 < var6.method397() * 8 + 8; ++var7) {
            for(var8 = var6.method396() * 8; var8 < var6.method396() * 8 + 8; ++var8) {
               this.method1552(var7, var8, var6, var1, var2);
            }
         }
      }

   }

   void method1552(int var1, int var2, class157 var3, class14 var4, class501[] var5) {
      this.method1550(var1, var2, var3);
      this.method1532(var1, var2, var3, var5);
   }

   void method1529(int var1, int var2, class157 var3, class14 var4, class361 var5) {
      int var7 = var3.field990[0][var1][var2] - 1;
      int var8 = var3.field988[0][var1][var2] - 1;
      if (var7 == -1 && var8 == -1) {
         class427.method1968(var1 * this.field2486, (63 - var2) * this.field2486, this.field2486, this.field2486, this.field2485);
      }

      int var9 = 16711935;
      int var10;
      if (var8 != -1) {
         int var11 = this.field2485;
         class223 var13 = (class223)class223.field1673.method1183((long)var8);
         class223 var12;
         if (var13 != null) {
            var12 = var13;
         } else {
            byte[] var14 = class223.field1678.method2422(4, var8);
            var13 = new class223();
            if (null != var14) {
               var13.method1114(new class366(var14), var8);
            }

            var13.method1113();
            class223.field1673.method1182(var13, (long)var8);
            var12 = var13;
         }

         if (null == var12) {
            var10 = var11;
         } else {
            int var15;
            int var16;
            if (var12.field1670 >= 0) {
               var16 = class311.method1418(var12.field1675, var12.field1674, var12.field1676);
               var15 = class412.method1898(var16, 96);
               var10 = class480.field3792[var15] | -16777216;
            } else if (var12.field1666 >= 0) {
               var16 = class412.method1898(class480.field3797.field4112.method1096(var12.field1666), 96);
               var10 = class480.field3792[var16] | -16777216;
            } else if (16711935 == var12.field1667) {
               var10 = var11;
            } else {
               var16 = class311.method1418(var12.field1671, var12.field1672, var12.field1677);
               var15 = class412.method1898(var16, 96);
               var10 = class480.field3792[var15] | -16777216;
            }
         }

         var9 = var10;
      }

      if (var8 > -1 && 0 == var3.field997[0][var1][var2]) {
         class427.method1968(this.field2486 * var1, this.field2486 * (63 - var2), this.field2486, this.field2486, var9);
      } else {
         var10 = this.method1531(var1, var2, var3, var5);
         if (var8 == -1) {
            class427.method1968(var1 * this.field2486, (63 - var2) * this.field2486, this.field2486, this.field2486, var10);
         } else {
            var4.method94(var1 * this.field2486, this.field2486 * (63 - var2), var10, var9, this.field2486, this.field2486, var3.field997[0][var1][var2], var3.field984[0][var1][var2]);
         }
      }
   }

   void method1530(int var1, int var2, class157 var3, class14 var4) {
      for(int var6 = 1; var6 < var3.field987; ++var6) {
         int var7 = var3.field988[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var9 = this.field2485;
            class223 var11 = (class223)class223.field1673.method1183((long)var7);
            class223 var10;
            if (var11 != null) {
               var10 = var11;
            } else {
               byte[] var12 = class223.field1678.method2422(4, var7);
               var11 = new class223();
               if (var12 != null) {
                  var11.method1114(new class366(var12), var7);
               }

               var11.method1113();
               class223.field1673.method1182(var11, (long)var7);
               var10 = var11;
            }

            int var8;
            if (var10 == null) {
               var8 = var9;
            } else {
               int var13;
               int var14;
               if (var10.field1670 >= 0) {
                  var14 = class311.method1418(var10.field1675, var10.field1674, var10.field1676);
                  var13 = class412.method1898(var14, 96);
                  var8 = class480.field3792[var13] | -16777216;
               } else if (var10.field1666 >= 0) {
                  var14 = class412.method1898(class480.field3797.field4112.method1096(var10.field1666), 96);
                  var8 = class480.field3792[var14] | -16777216;
               } else if (var10.field1667 == 16711935) {
                  var8 = var9;
               } else {
                  var14 = class311.method1418(var10.field1671, var10.field1672, var10.field1677);
                  var13 = class412.method1898(var14, 96);
                  var8 = class480.field3792[var13] | -16777216;
               }
            }

            if (0 == var3.field997[var6][var1][var2]) {
               class427.method1968(var1 * this.field2486, this.field2486 * (63 - var2), this.field2486, this.field2486, var8);
            } else {
               var4.method94(this.field2486 * var1, this.field2486 * (63 - var2), 0, var8, this.field2486, this.field2486, var3.field997[var6][var1][var2], var3.field984[var6][var1][var2]);
            }
         }
      }

   }

   int method1531(int var1, int var2, class157 var3, class361 var4) {
      return var3.field990[0][var1][var2] == 0 ? this.field2485 : var4.method1623(var1, var2);
   }

   void method1532(int var1, int var2, class157 var3, class501[] var4) {
      for(int var6 = 0; var6 < var3.field987; ++var6) {
         class152[] var7 = var3.field994[var6][var1][var2];
         if (null != var7 && 0 != var7.length) {
            class152[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class152 var10 = var8[var9];
               if (!class87.method335(var10.field966)) {
                  int var12 = var10.field966;
                  boolean var11 = class87.field606.field592 == var12;
                  if (!var11) {
                     continue;
                  }
               }

               class458 var13 = class430.method2004(var10.field967, (byte)-44);
               if (-1 != var13.field3628) {
                  if (var13.field3628 != 46 && 52 != var13.field3628) {
                     var4[var13.field3628].method2393(this.field2486 * var1, (63 - var2) * this.field2486, this.field2486 * 2, this.field2486 * 2);
                  } else {
                     var4[var13.field3628].method2393(var1 * this.field2486, (63 - var2) * this.field2486, this.field2486 * 2 + 1, 1 + this.field2486 * 2);
                  }
               }
            }
         }
      }

   }

   void method1550(int var1, int var2, class157 var3) {
      for(int var5 = 0; var5 < var3.field987; ++var5) {
         class152[] var6 = var3.field994[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class152[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class152 var9 = var7[var8];
               if (class87.method334(var9.field966)) {
                  class458 var10 = class430.method2004(var9.field967, (byte)-62);
                  int var11 = 0 != var10.field3619 ? -3407872 : -3355444;
                  if (class87.field589.field592 == var9.field966) {
                     this.method1540(var1, var2, var9.field968, var11);
                  }

                  if (var9.field966 == class87.field586.field592) {
                     this.method1540(var1, var2, var9.field968, -3355444);
                     this.method1540(var1, var2, var9.field968 + 1, var11);
                  }

                  if (var9.field966 == class87.field587.field592) {
                     if (0 == var9.field968) {
                        class427.method1979(var1 * this.field2486, this.field2486 * (63 - var2), 1, var11);
                     }

                     if (var9.field968 == 1) {
                        class427.method1979(var1 * this.field2486 + this.field2486 - 1, this.field2486 * (63 - var2), 1, var11);
                     }

                     if (2 == var9.field968) {
                        class427.method1979(this.field2486 * var1 + this.field2486 - 1, (63 - var2) * this.field2486 + this.field2486 - 1, 1, var11);
                     }

                     if (var9.field968 == 3) {
                        class427.method1979(var1 * this.field2486, this.field2486 + this.field2486 * (63 - var2) - 1, 1, var11);
                     }
                  }

                  if (var9.field966 == class87.field605.field592) {
                     int var12 = var9.field968 % 2;
                     int var13;
                     if (var12 == 0) {
                        for(var13 = 0; var13 < this.field2486; ++var13) {
                           class427.method1979(var13 + var1 * this.field2486, (64 - var2) * this.field2486 - 1 - var13, 1, var11);
                        }
                     } else {
                        for(var13 = 0; var13 < this.field2486; ++var13) {
                           class427.method1979(var13 + var1 * this.field2486, this.field2486 * (63 - var2) + var13, 1, var11);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method1533(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field2487.entrySet().iterator();

      while(var8.hasNext()) {
         Map.Entry var9 = (Map.Entry)var8.next();
         class113 var10 = (class113)var9.getKey();
         int var11 = (int)((float)var1 + var6 * (float)var10.field726 - var7);
         int var12 = (int)((float)(var4 + var2) - var6 * (float)var10.field728 - var7);
         class368 var13 = (class368)var9.getValue();
         if (var13 != null && var13.method1722()) {
            var13.field2661 = var11;
            var13.field2662 = var12;
            class430 var14 = class430.method2005(var13.method1720());
            if (!var3.contains(var14.method2003())) {
               this.method1521(var13, var11, var12, var6);
            }
         }
      }

   }

   void method1542(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field2480.iterator();

      while(var5.hasNext()) {
         class368 var6 = (class368)var5.next();
         if (var6.method1722()) {
            class430 var7 = class430.method2005(var6.method1720());
            if (var7 != null && var1.contains(var7.method2003())) {
               this.method1543(var7, var6.field2661, var6.field2662, var2, var3);
            }
         }
      }

   }

   void method1543(class430 var1, int var2, int var3, int var4, int var5) {
      class296 var7 = var1.method2001(false);
      if (null != var7) {
         var7.method1366(var2 - var7.field2032 / 2, var3 - var7.field2028 / 2);
         if (var4 % var5 < var5 / 2) {
            class427.method1966(var2, var3, 15, 16776960, 128);
            class427.method1966(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method1521(class368 var1, int var2, int var3, float var4) {
      class430 var6 = class430.method2005(var1.method1720());
      this.method1534(var6, var2, var3);
      this.method1535(var1, var6, var2, var3, var4);
   }

   void method1534(class430 var1, int var2, int var3) {
      class296 var5 = var1.method2001(false);
      if (null != var5) {
         int var6 = this.method1524(var5, var1.field3366);
         int var7 = this.method1536(var5, var1.field3361);
         var5.method1366(var2 + var6, var3 + var7);
      }

   }

   void method1535(class368 var1, class430 var2, int var3, int var4, float var5) {
      class260 var7 = var1.method1725();
      if (null != var7) {
         if (var7.field1858.method1439(var5)) {
            class396 var8 = (class396)this.field2482.get(var7.field1858);
            var8.method1914(var7.field1856, var3 - var7.field1859 / 2, var4, var7.field1859, var7.field1857, -16777216 | var2.field3355, 0, 1, 0, var8.field2946 / 2);
         }
      }
   }

   void method1541(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field2480.iterator();

      while(var7.hasNext()) {
         class368 var8 = (class368)var7.next();
         if (var8.method1722()) {
            int var9 = var8.field2659.field726 % 64;
            int var10 = var8.field2659.field728 % 64;
            var8.field2661 = (int)((float)var1 + var6 * (float)var9);
            var8.field2662 = (int)(var6 * (float)(63 - var10) + (float)var2);
            if (!var3.contains(var8.method1720())) {
               this.method1521(var8, var8.field2661, var8.field2662, var6);
            }
         }
      }

   }

   int method1524(class296 var1, class504 var2) {
      switch (var2.field4040) {
         case 0:
            return 0;
         case 2:
            return -var1.field2032 / 2;
         default:
            return -var1.field2032;
      }
   }

   int method1536(class296 var1, class422 var2) {
      switch (var2.field2973) {
         case 0:
            return -var1.field2028 / 2;
         case 1:
            return 0;
         default:
            return -var1.field2028;
      }
   }

   class260 method1551(int var1) {
      class430 var3 = class430.method2005(var1);
      return this.method1537(var3);
   }

   class260 method1537(class430 var1) {
      if (null != var1.field3348 && null != this.field2482 && this.field2482.get(class315.field2132) != null) {
         int var4 = var1.field3350;
         class315[] var5 = new class315[]{class315.field2132, class315.field2127, class315.field2126};
         class315[] var6 = var5;
         int var7 = 0;

         class315 var3;
         while(true) {
            if (var7 >= var6.length) {
               var3 = null;
               break;
            }

            class315 var8 = var6[var7];
            if (var4 == var8.field2129) {
               var3 = var8;
               break;
            }

            ++var7;
         }

         if (null == var3) {
            return null;
         } else {
            class396 var15 = (class396)this.field2482.get(var3);
            if (null == var15) {
               return null;
            } else {
               var7 = var15.method1917(var1.field3348, 1000000);
               String[] var16 = new String[var7];
               var15.method1916(var1.field3348, (int[])null, var16);
               int var9 = var15.field2946 * var16.length / 2;
               int var10 = 0;
               String[] var11 = var16;

               for(int var12 = 0; var12 < var11.length; ++var12) {
                  String var13 = var11[var12];
                  int var14 = var15.method1915(var13);
                  if (var14 > var10) {
                     var10 = var14;
                  }
               }

               return new class260(var1.field3348, var10, var9, var3);
            }
         }
      } else {
         return null;
      }
   }

   List method1538(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var2 + var3) {
            Iterator var8 = this.field2487.values().iterator();

            class368 var9;
            while(var8.hasNext()) {
               var9 = (class368)var8.next();
               if (var9.method1722() && var9.method1719(var4, var5)) {
                  var7.add(var9);
               }
            }

            var8 = this.field2480.iterator();

            while(var8.hasNext()) {
               var9 = (class368)var8.next();
               if (var9.method1722() && var9.method1719(var4, var5)) {
                  var7.add(var9);
               }
            }

            return var7;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   List method1539() {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field2480);
      var2.addAll(this.field2487.values());
      return var2;
   }

   void method1540(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class427.method1974(this.field2486 * var1, this.field2486 * (63 - var2), this.field2486, var4);
      }

      if (var3 == 1) {
         class427.method1979(this.field2486 * var1, (63 - var2) * this.field2486, this.field2486, var4);
      }

      if (var3 == 2) {
         class427.method1974(this.field2486 + var1 * this.field2486 - 1, this.field2486 * (63 - var2), this.field2486, var4);
      }

      if (var3 == 3) {
         class427.method1979(this.field2486 * var1, (63 - var2) * this.field2486 + this.field2486 - 1, this.field2486, var4);
      }

   }

   static class296 method1554(int var0, int var1, int var2) {
      class17 var4 = field2483;
      long var5 = (long)(var2 << 16 | var0 << 8 | var1);
      return (class296)var4.method97(var5);
   }

   public static void method1553() {
      field2483.method101(5);
   }
}
