import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class class227 {
   static class23 field2094 = new class23(37748736, 256);
   class430 field2095;
   int field2090;
   int field2096;
   int field2097;
   int field2099;
   HashMap field2098;
   LinkedList field2092;
   List field2091;
   final HashMap field2093;

   class227(int var1, int var2, int var3, HashMap var4) {
      this.field2099 = var1;
      this.field2090 = var2;
      this.field2092 = new LinkedList();
      this.field2091 = new LinkedList();
      this.field2098 = new HashMap();
      this.field2096 = var3 | -16777216;
      this.field2093 = var4;
   }

   void method1368(int var1, int var2, int var3) {
      class427 var5 = method1376(this.field2099, this.field2090, this.field2097);
      if (var5 != null) {
         if (var3 == this.field2097 * 64) {
            var5.method2012(var1, var2);
         } else {
            var5.method2028(var1, var2, var3, var3);
         }

      }
   }

   void method1370(class430 var1, List var2) {
      this.field2098.clear();
      this.field2095 = var1;
      this.method1369(var2);
   }

   void method1341(HashSet var1, List var2) {
      this.field2098.clear();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         class198 var5 = (class198)var4.next();
         if (var5.method886() == this.field2099 && var5.method887() == this.field2090) {
            this.field2092.add(var5);
         }
      }

      this.method1369(var2);
   }

   void method1342(int var1, int var2, int var3, int var4, class129 var5) {
      for(int var7 = var1; var7 < var1 + var3; ++var7) {
         label65:
         for(int var8 = var2; var8 < var4 + var2; ++var8) {
            for(int var9 = 0; var9 < var5.field1533; ++var9) {
               class207[] var10 = var5.field1540[var9][var7][var8];
               if (var10 != null && var10.length != 0) {
                  class207[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class449 var14;
                     boolean var15;
                     label56: {
                        class207 var13 = var11[var12];
                        var14 = class444.method2172(var13.field1949, (byte)-78);
                        if (var14.field3476 != null) {
                           int[] var16 = var14.field3476;

                           for(int var17 = 0; var17 < var16.length; ++var17) {
                              int var18 = var16[var17];
                              class449 var19 = class444.method2172(var18, (byte)-65);
                              if (var19.field3469 != -1) {
                                 var15 = true;
                                 break label56;
                              }
                           }
                        } else if (var14.field3469 != -1) {
                           var15 = true;
                           break label56;
                        }

                        var15 = false;
                     }

                     if (var15) {
                        this.method1366(var14, var9, var7, var8, var5);
                        continue label65;
                     }
                  }
               }
            }
         }
      }

   }

   void method1366(class449 var1, int var2, int var3, int var4, class129 var5) {
      class89 var7 = new class89(var2, var3 + this.field2099 * 64, var4 + this.field2090 * 64);
      class89 var8 = null;
      if (this.field2095 != null) {
         var8 = new class89(this.field2095.field1532 + var2, this.field2095.field1537 * 64 + var3, var4 + this.field2095.field1535 * 64);
      } else {
         class198 var9 = (class198)var5;
         var8 = new class89(var9.field1532 + var2, var3 + var9.field1537 * 64 + var9.method1230() * 8, var4 + var9.field1535 * 64 + var9.method1231() * 8);
      }

      class444 var10;
      Object var11;
      if (null != var1.field3476) {
         var11 = new class368(var8, var7, var1.field3442, this);
      } else {
         var10 = class444.method2173(var1.field3469);
         var11 = new class108(var8, var7, var10.field3370, this.method1359(var10));
      }

      var10 = class444.method2173(((class373)var11).method1871());
      if (var10.field3372) {
         this.field2098.put(new class89(0, var3, var4), var11);
      }

   }

   void method1344() {
      Iterator var2 = this.field2098.values().iterator();

      while(var2.hasNext()) {
         class373 var3 = (class373)var2.next();
         if (var3 instanceof class368) {
            ((class368)var3).method1859();
         }
      }

   }

   void method1369(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class108 var4 = (class108)var3.next();
         if (class444.method2173(var4.field1436).field3372 && var4.field2922.field1273 >> 6 == this.field2099 && this.field2090 == var4.field2922.field1275 >> 6) {
            class108 var5 = new class108(var4.field2922, var4.field2922, var4.field1436, this.method1373(var4.field1436));
            this.field2091.add(var5);
         }
      }

   }

   void method1345() {
      if (null != this.field2095) {
         this.field2095.method882();
      } else {
         Iterator var2 = this.field2092.iterator();

         while(var2.hasNext()) {
            class198 var3 = (class198)var2.next();
            var3.method882();
         }
      }

   }

   boolean method1367(class298 var1) {
      this.field2098.clear();
      if (null != this.field2095) {
         this.field2095.method881(var1);
         if (this.field2095.method880()) {
            this.method1342(0, 0, 64, 64, this.field2095);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var3 = true;

         Iterator var4;
         class198 var5;
         for(var4 = this.field2092.iterator(); var4.hasNext(); var3 &= var5.method880()) {
            var5 = (class198)var4.next();
            var5.method881(var1);
         }

         if (var3) {
            var4 = this.field2092.iterator();

            while(var4.hasNext()) {
               var5 = (class198)var4.next();
               this.method1342(var5.method1229() * 8, var5.method1228() * 8, 8, 8, var5);
            }
         }

         return var3;
      }
   }

   void method1371(int var1, class63 var2, class425[] var3, class298 var4, class298 var5) {
      this.field2097 = var1;
      if (this.field2095 != null || !this.field2092.isEmpty()) {
         if (method1376(this.field2099, this.field2090, var1) == null) {
            boolean var7 = true;
            var7 &= this.method1367(var4);
            int var9;
            if (null != this.field2095) {
               var9 = this.field2095.field1539;
            } else {
               var9 = ((class129)this.field2092.getFirst()).field1539;
            }

            var7 &= var5.method1633(var9);
            if (var7) {
               byte[] var8 = var5.method1636(var9);
               class233 var10;
               if (null == var8) {
                  var10 = new class233();
               } else {
                  var10 = new class233(class462.method2262(var8).field3236);
               }

               class427 var12 = new class427(this.field2097 * 64, this.field2097 * 64);
               var12.method2006();
               if (this.field2095 != null) {
                  this.method1349(var2, var3, var10);
               } else {
                  this.method1350(var2, var3, var10);
               }

               int var13 = this.field2099;
               int var14 = this.field2090;
               int var15 = this.field2097;
               class23 var16 = field2094;
               long var18 = (long)(var15 << 16 | var13 << 8 | var14);
               var16.method258(var12, var18, 4 * var12.field3236.length);
               this.method1345();
            }
         }
      }
   }

   void method1347(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method1355(var1, var2, var4, var3);
      this.method1363(var1, var2, var4, var3);
   }

   void method1348(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field2098.values().iterator();

      while(var5.hasNext()) {
         class373 var6 = (class373)var5.next();
         if (var6.method1873()) {
            int var7 = var6.method1871();
            if (var1.contains(var7)) {
               class444 var8 = class444.method2173(var7);
               this.method1365(var8, var6.field2924, var6.field2925, var2, var3);
            }
         }
      }

      this.method1364(var1, var2, var3);
   }

   void method1349(class63 var1, class425[] var2, class233 var3) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method1351(var5, var6, this.field2095, var1, var3);
            this.method1352(var5, var6, this.field2095, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method1374(var5, var6, this.field2095, var1, var2);
         }
      }

   }

   void method1350(class63 var1, class425[] var2, class233 var3) {
      Iterator var5 = this.field2092.iterator();

      class198 var6;
      int var7;
      int var8;
      while(var5.hasNext()) {
         var6 = (class198)var5.next();

         for(var7 = var6.method1229() * 8; var7 < var6.method1229() * 8 + 8; ++var7) {
            for(var8 = var6.method1228() * 8; var8 < var6.method1228() * 8 + 8; ++var8) {
               this.method1351(var7, var8, var6, var1, var3);
               this.method1352(var7, var8, var6, var1);
            }
         }
      }

      var5 = this.field2092.iterator();

      while(var5.hasNext()) {
         var6 = (class198)var5.next();

         for(var7 = var6.method1229() * 8; var7 < var6.method1229() * 8 + 8; ++var7) {
            for(var8 = var6.method1228() * 8; var8 < var6.method1228() * 8 + 8; ++var8) {
               this.method1374(var7, var8, var6, var1, var2);
            }
         }
      }

   }

   void method1374(int var1, int var2, class129 var3, class63 var4, class425[] var5) {
      this.method1372(var1, var2, var3);
      this.method1354(var1, var2, var3, var5);
   }

   void method1351(int var1, int var2, class129 var3, class63 var4, class233 var5) {
      int var7 = var3.field1536[0][var1][var2] - 1;
      int var8 = var3.field1534[0][var1][var2] - 1;
      if (var7 == -1 && var8 == -1) {
         class156.method954(var1 * this.field2097, (63 - var2) * this.field2097, this.field2097, this.field2097, this.field2096);
      }

      int var9 = 16711935;
      int var10;
      if (var8 != -1) {
         int var11 = this.field2096;
         class451 var13 = (class451)class451.field3502.method1851((long)var8);
         class451 var12;
         if (var13 != null) {
            var12 = var13;
         } else {
            byte[] var14 = class451.field3507.method1629(4, var8);
            var13 = new class451();
            if (null != var14) {
               var13.method2223(new class184(var14), var8);
            }

            var13.method2222();
            class451.field3502.method1850(var13, (long)var8);
            var12 = var13;
         }

         if (null == var12) {
            var10 = var11;
         } else {
            int var15;
            int var16;
            if (var12.field3499 >= 0) {
               var16 = class384.method1895(var12.field3504, var12.field3503, var12.field3505);
               var15 = class402.method1968(var16, 96);
               var10 = class399.field3106[var15] | -16777216;
            } else if (var12.field3495 >= 0) {
               var16 = class402.method1968(class399.field3111.field2239.method943(var12.field3495), 96);
               var10 = class399.field3106[var16] | -16777216;
            } else if (var12.field3496 == 16711935) {
               var10 = var11;
            } else {
               var16 = class384.method1895(var12.field3500, var12.field3501, var12.field3506);
               var15 = class402.method1968(var16, 96);
               var10 = class399.field3106[var15] | -16777216;
            }
         }

         var9 = var10;
      }

      if (var8 > -1 && var3.field1543[0][var1][var2] == 0) {
         class156.method954(this.field2097 * var1, this.field2097 * (63 - var2), this.field2097, this.field2097, var9);
      } else {
         var10 = this.method1353(var1, var2, var3, var5);
         if (var8 == -1) {
            class156.method954(var1 * this.field2097, (63 - var2) * this.field2097, this.field2097, this.field2097, var10);
         } else {
            var4.method647(var1 * this.field2097, this.field2097 * (63 - var2), var10, var9, this.field2097, this.field2097, var3.field1543[0][var1][var2], var3.field1530[0][var1][var2]);
         }
      }
   }

   void method1352(int var1, int var2, class129 var3, class63 var4) {
      for(int var6 = 1; var6 < var3.field1533; ++var6) {
         int var7 = var3.field1534[var6][var1][var2] - 1;
         if (var7 > -1) {
            int var9 = this.field2096;
            class451 var11 = (class451)class451.field3502.method1851((long)var7);
            class451 var10;
            if (var11 != null) {
               var10 = var11;
            } else {
               byte[] var12 = class451.field3507.method1629(4, var7);
               var11 = new class451();
               if (var12 != null) {
                  var11.method2223(new class184(var12), var7);
               }

               var11.method2222();
               class451.field3502.method1850(var11, (long)var7);
               var10 = var11;
            }

            int var8;
            if (var10 == null) {
               var8 = var9;
            } else {
               int var13;
               int var14;
               if (var10.field3499 >= 0) {
                  var14 = class384.method1895(var10.field3504, var10.field3503, var10.field3505);
                  var13 = class402.method1968(var14, 96);
                  var8 = class399.field3106[var13] | -16777216;
               } else if (var10.field3495 >= 0) {
                  var14 = class402.method1968(class399.field3111.field2239.method943(var10.field3495), 96);
                  var8 = class399.field3106[var14] | -16777216;
               } else if (var10.field3496 == 16711935) {
                  var8 = var9;
               } else {
                  var14 = class384.method1895(var10.field3500, var10.field3501, var10.field3506);
                  var13 = class402.method1968(var14, 96);
                  var8 = class399.field3106[var13] | -16777216;
               }
            }

            if (var3.field1543[var6][var1][var2] == 0) {
               class156.method954(var1 * this.field2097, this.field2097 * (63 - var2), this.field2097, this.field2097, var8);
            } else {
               var4.method647(this.field2097 * var1, this.field2097 * (63 - var2), 0, var8, this.field2097, this.field2097, var3.field1543[var6][var1][var2], var3.field1530[var6][var1][var2]);
            }
         }
      }

   }

   int method1353(int var1, int var2, class129 var3, class233 var4) {
      return var3.field1536[0][var1][var2] == 0 ? this.field2096 : var4.method1419(var1, var2);
   }

   void method1354(int var1, int var2, class129 var3, class425[] var4) {
      for(int var6 = 0; var6 < var3.field1533; ++var6) {
         class207[] var7 = var3.field1540[var6][var1][var2];
         if (null != var7 && var7.length != 0) {
            class207[] var8 = var7;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class207 var10 = var8[var9];
               if (!class2.method4(var10.field1948)) {
                  int var12 = var10.field1948;
                  boolean var11 = class2.field26.field12 == var12;
                  if (!var11) {
                     continue;
                  }
               }

               class449 var13 = class444.method2172(var10.field1949, (byte)-44);
               if (var13.field3468 != -1) {
                  if (var13.field3468 != 46 && var13.field3468 != 52) {
                     var4[var13.field3468].method1999(this.field2097 * var1, (63 - var2) * this.field2097, this.field2097 * 2, this.field2097 * 2);
                  } else {
                     var4[var13.field3468].method1999(var1 * this.field2097, (63 - var2) * this.field2097, this.field2097 * 2 + 1, 1 + this.field2097 * 2);
                  }
               }
            }
         }
      }

   }

   void method1372(int var1, int var2, class129 var3) {
      for(int var5 = 0; var5 < var3.field1533; ++var5) {
         class207[] var6 = var3.field1540[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class207[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class207 var9 = var7[var8];
               if (class2.method3(var9.field1948)) {
                  class449 var10 = class444.method2172(var9.field1949, (byte)-62);
                  int var11 = var10.field3459 != 0 ? -3407872 : -3355444;
                  if (class2.field9.field12 == var9.field1948) {
                     this.method1362(var1, var2, var9.field1950, var11);
                  }

                  if (var9.field1948 == class2.field6.field12) {
                     this.method1362(var1, var2, var9.field1950, -3355444);
                     this.method1362(var1, var2, var9.field1950 + 1, var11);
                  }

                  if (var9.field1948 == class2.field7.field12) {
                     if (var9.field1950 == 0) {
                        class156.method965(var1 * this.field2097, this.field2097 * (63 - var2), 1, var11);
                     }

                     if (var9.field1950 == 1) {
                        class156.method965(var1 * this.field2097 + this.field2097 - 1, this.field2097 * (63 - var2), 1, var11);
                     }

                     if (var9.field1950 == 2) {
                        class156.method965(this.field2097 * var1 + this.field2097 - 1, (63 - var2) * this.field2097 + this.field2097 - 1, 1, var11);
                     }

                     if (var9.field1950 == 3) {
                        class156.method965(var1 * this.field2097, this.field2097 + this.field2097 * (63 - var2) - 1, 1, var11);
                     }
                  }

                  if (var9.field1948 == class2.field25.field12) {
                     int var12 = var9.field1950 % 2;
                     int var13;
                     if (var12 == 0) {
                        for(var13 = 0; var13 < this.field2097; ++var13) {
                           class156.method965(var13 + var1 * this.field2097, (64 - var2) * this.field2097 - 1 - var13, 1, var11);
                        }
                     } else {
                        for(var13 = 0; var13 < this.field2097; ++var13) {
                           class156.method965(var13 + var1 * this.field2097, this.field2097 * (63 - var2) + var13, 1, var11);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method1355(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      float var7 = var6 / 2.0F;
      Iterator var8 = this.field2098.entrySet().iterator();

      while(var8.hasNext()) {
         Map.Entry var9 = (Map.Entry)var8.next();
         class89 var10 = (class89)var9.getKey();
         int var11 = (int)((float)var1 + var6 * (float)var10.field1273 - var7);
         int var12 = (int)((float)(var4 + var2) - var6 * (float)var10.field1275 - var7);
         class373 var13 = (class373)var9.getValue();
         if (var13 != null && var13.method1873()) {
            var13.field2924 = var11;
            var13.field2925 = var12;
            class444 var14 = class444.method2173(var13.method1871());
            if (!var3.contains(var14.method2171())) {
               this.method1343(var13, var11, var12, var6);
            }
         }
      }

   }

   void method1364(HashSet var1, int var2, int var3) {
      Iterator var5 = this.field2091.iterator();

      while(var5.hasNext()) {
         class373 var6 = (class373)var5.next();
         if (var6.method1873()) {
            class444 var7 = class444.method2173(var6.method1871());
            if (var7 != null && var1.contains(var7.method2171())) {
               this.method1365(var7, var6.field2924, var6.field2925, var2, var3);
            }
         }
      }

   }

   void method1365(class444 var1, int var2, int var3, int var4, int var5) {
      class427 var7 = var1.method2169(false);
      if (null != var7) {
         var7.method2032(var2 - var7.field3237 / 2, var3 - var7.field3233 / 2);
         if (var4 % var5 < var5 / 2) {
            class156.method952(var2, var3, 15, 16776960, 128);
            class156.method952(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method1343(class373 var1, int var2, int var3, float var4) {
      class444 var6 = class444.method2173(var1.method1871());
      this.method1356(var6, var2, var3);
      this.method1357(var1, var6, var2, var3, var4);
   }

   void method1356(class444 var1, int var2, int var3) {
      class427 var5 = var1.method2169(false);
      if (null != var5) {
         int var6 = this.method1346(var5, var1.field3387);
         int var7 = this.method1358(var5, var1.field3382);
         var5.method2032(var2 + var6, var3 + var7);
      }

   }

   void method1357(class373 var1, class444 var2, int var3, int var4, float var5) {
      class174 var7 = var1.method1876();
      if (null != var7) {
         if (var7.field1734.method1430(var5)) {
            class460 var8 = (class460)this.field2093.get(var7.field1734);
            var8.method1565(var7.field1732, var3 - var7.field1735 / 2, var4, var7.field1735, var7.field1733, -16777216 | var2.field3376, 0, 1, 0, var8.field2423 / 2);
         }
      }
   }

   void method1363(int var1, int var2, HashSet var3, int var4) {
      float var6 = (float)var4 / 64.0F;
      Iterator var7 = this.field2091.iterator();

      while(var7.hasNext()) {
         class373 var8 = (class373)var7.next();
         if (var8.method1873()) {
            int var9 = var8.field2922.field1273 % 64;
            int var10 = var8.field2922.field1275 % 64;
            var8.field2924 = (int)((float)var1 + var6 * (float)var9);
            var8.field2925 = (int)(var6 * (float)(63 - var10) + (float)var2);
            if (!var3.contains(var8.method1871())) {
               this.method1343(var8, var8.field2924, var8.field2925, var6);
            }
         }
      }

   }

   int method1346(class427 var1, class77 var2) {
      switch (var2.field1237) {
         case 0:
            return 0;
         case 2:
            return -var1.field3237 / 2;
         default:
            return -var1.field3237;
      }
   }

   int method1358(class427 var1, class132 var2) {
      switch (var2.field1557) {
         case 0:
            return -var1.field3233 / 2;
         case 1:
            return 0;
         default:
            return -var1.field3233;
      }
   }

   class174 method1373(int var1) {
      class444 var3 = class444.method2173(var1);
      return this.method1359(var3);
   }

   class174 method1359(class444 var1) {
      if (null != var1.field3369 && null != this.field2093 && this.field2093.get(class238.field2183) != null) {
         int var4 = var1.field3371;
         class238[] var5 = new class238[]{class238.field2183, class238.field2178, class238.field2177};
         class238[] var6 = var5;
         int var7 = 0;

         class238 var3;
         while(true) {
            if (var7 >= var6.length) {
               var3 = null;
               break;
            }

            class238 var8 = var6[var7];
            if (var4 == var8.field2180) {
               var3 = var8;
               break;
            }

            ++var7;
         }

         if (null == var3) {
            return null;
         } else {
            class460 var15 = (class460)this.field2093.get(var3);
            if (null == var15) {
               return null;
            } else {
               var7 = var15.method1568(var1.field3369, 1000000);
               String[] var16 = new String[var7];
               var15.method1567(var1.field3369, (int[])null, var16);
               int var9 = var15.field2423 * var16.length / 2;
               int var10 = 0;
               String[] var11 = var16;

               for(int var12 = 0; var12 < var11.length; ++var12) {
                  String var13 = var11[var12];
                  int var14 = var15.method1566(var13);
                  if (var14 > var10) {
                     var10 = var14;
                  }
               }

               return new class174(var1.field3369, var10, var9, var3);
            }
         }
      } else {
         return null;
      }
   }

   List method1360(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var7 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var2 + var3) {
            Iterator var8 = this.field2098.values().iterator();

            class373 var9;
            while(var8.hasNext()) {
               var9 = (class373)var8.next();
               if (var9.method1873() && var9.method1870(var4, var5)) {
                  var7.add(var9);
               }
            }

            var8 = this.field2091.iterator();

            while(var8.hasNext()) {
               var9 = (class373)var8.next();
               if (var9.method1873() && var9.method1870(var4, var5)) {
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

   List method1361() {
      LinkedList var2 = new LinkedList();
      var2.addAll(this.field2091);
      var2.addAll(this.field2098.values());
      return var2;
   }

   void method1362(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class156.method960(this.field2097 * var1, this.field2097 * (63 - var2), this.field2097, var4);
      }

      if (var3 == 1) {
         class156.method965(this.field2097 * var1, (63 - var2) * this.field2097, this.field2097, var4);
      }

      if (var3 == 2) {
         class156.method960(this.field2097 + var1 * this.field2097 - 1, this.field2097 * (63 - var2), this.field2097, var4);
      }

      if (var3 == 3) {
         class156.method965(this.field2097 * var1, (63 - var2) * this.field2097 + this.field2097 - 1, this.field2097, var4);
      }

   }

   static class427 method1376(int var0, int var1, int var2) {
      class23 var4 = field2094;
      long var5 = (long)(var2 << 16 | var0 << 8 | var1);
      return (class427)var4.method255(var5);
   }

   public static void method1375() {
      field2094.method259(5);
   }
}
