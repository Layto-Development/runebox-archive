import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class class62 {
   protected static boolean field496;
   public static int field481;
   static class534 field492;
   static int field484;
   static ScheduledExecutorService field483;
   boolean field498 = true;
   class460 field487;
   class460[] field500 = new class460[8];
   class460[] field501 = new class460[8];
   int field482 = 0;
   int field488 = 32;
   int field490;
   int field491;
   int field494 = 0;
   int field495 = 0;
   int field497 = 0;
   int field499;
   long field485 = 0L;
   long field489 = class123.method471();
   long field493 = 0L;
   protected int[] field486;

   protected class62() {
   }

   public final synchronized void method264(class460 var1) {
      this.field487 = var1;
   }

   public final synchronized void method276() {
      if (this.field486 != null) {
         long var2 = class123.method471();

         try {
            if (0L != this.field493) {
               if (var2 < this.field493) {
                  return;
               }

               this.method271(this.field490);
               this.field493 = 0L;
               this.field498 = true;
            }

            int var4 = this.method272();
            if (this.field497 - var4 > this.field494) {
               this.field494 = this.field497 - var4;
            }

            int var5 = this.field499 + this.field491;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field490) {
               this.field490 += 1024;
               if (this.field490 > 16384) {
                  this.field490 = 16384;
               }

               this.method273();
               this.method271(this.field490);
               var4 = 0;
               this.field498 = true;
               if (var5 + 256 > this.field490) {
                  var5 = this.field490 - 256;
                  this.field499 = var5 - this.field491;
               }
            }

            while(var4 < var5) {
               this.method269(this.field486, 256);
               this.method265();
               var4 += 256;
            }

            if (var2 > this.field485) {
               if (!this.field498) {
                  if (0 == this.field494 && this.field495 == 0) {
                     this.method273();
                     this.field493 = var2 + 2000L;
                     return;
                  }

                  this.field499 = Math.min(this.field495, this.field494);
                  this.field495 = this.field494;
               } else {
                  this.field498 = false;
               }

               this.field494 = 0;
               this.field485 = var2 + 2000L;
            }

            this.field497 = var4;
         } catch (Exception var7) {
            this.method273();
            this.field493 = var2 + 2000L;
         }

         try {
            if (var2 > 500000L + this.field489) {
               var2 = this.field489;
            }

            while(var2 > this.field489 + 5000L) {
               this.method268(256);
               this.field489 += (long)(256000 / field481);
            }
         } catch (Exception var6) {
            this.field489 = var2;
         }

      }
   }

   public final void method266() {
      this.field498 = true;
   }

   public final synchronized void method275() {
      this.field498 = true;

      try {
         this.method274();
      } catch (Exception var3) {
         this.method273();
         this.field493 = class123.method471() + 2000L;
      }

   }

   public final synchronized void method267() {
      if (class512.field4086 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (class512.field4086.field309[var3] == this) {
               class512.field4086.field309[var3] = null;
            }

            if (null != class512.field4086.field309[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            field483.shutdownNow();
            field483 = null;
            class512.field4086 = null;
         }
      }

      this.method273();
      this.field486 = null;
   }

   final void method268(int var1) {
      this.field482 -= var1;
      if (this.field482 < 0) {
         this.field482 = 0;
      }

      if (this.field487 != null) {
         this.field487.method2171(var1);
      }

   }

   final void method269(int[] var1, int var2) {
      int var3 = var2;
      if (field496) {
         var3 = var2 << 1;
      }

      class6.method50(var1, 0, var3);
      this.field482 -= var2;
      if (null != this.field487 && this.field482 <= 0) {
         this.field482 += field481 >> 4;
         method279(this.field487);
         this.method270(this.field487, this.field487.method2168());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class460 var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class460 var11 = this.field500[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if (null == var11) {
                           break label98;
                        }

                        class321 var12 = var11.field3651;
                        if (null != var12 && var12.field2145 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field3648;
                        } else {
                           var11.field3650 = true;
                           int var13 = var11.method2167();
                           var4 += var13;
                           if (null != var12) {
                              var12.field2145 += var13;
                           }

                           if (var4 >= this.field488) {
                              break label104;
                           }

                           class460 var14 = var11.method2169();
                           if (null != var14) {
                              for(int var15 = var11.field3649; var14 != null; var14 = var11.method2170()) {
                                 this.method270(var14, var15 * var14.method2168() >> 8);
                              }
                           }

                           class460 var18 = var11.field3648;
                           var11.field3648 = null;
                           if (var10 == null) {
                              this.field500[var7] = var18;
                           } else {
                              var10.field3648 = var18;
                           }

                           if (var18 == null) {
                              this.field501[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class460 var16 = this.field500[var6];
            class460[] var17 = this.field500;
            this.field501[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field3648;
               var16.field3648 = null;
            }
         }
      }

      if (this.field482 < 0) {
         this.field482 = 0;
      }

      if (this.field487 != null) {
         this.field487.method2172(var1, 0, var2);
      }

      this.field489 = class123.method471();
   }

   final void method270(class460 var1, int var2) {
      int var4 = var2 >> 5;
      class460 var5 = this.field501[var4];
      if (var5 == null) {
         this.field500[var4] = var1;
      } else {
         var5.field3648 = var1;
      }

      this.field501[var4] = var1;
      var1.field3649 = var2;
   }

   protected void method277() throws Exception {
   }

   protected void method271(int var1) throws Exception {
   }

   protected int method272() throws Exception {
      return this.field490;
   }

   protected void method265() throws Exception {
   }

   protected void method273() {
   }

   protected void method274() throws Exception {
   }

   public static final void method281(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         field481 = var0;
         field496 = var1;
         field484 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static final class62 method280(class250 var0, int var1, int var2) {
      if (field481 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class62 var4 = class514.field4103.method2204();
            var4.field486 = new int[256 * (field496 ? 2 : 1)];
            var4.field491 = var2;
            var4.method277();
            var4.field490 = 1024 + (var2 & -1024);
            if (var4.field490 > 16384) {
               var4.field490 = 16384;
            }

            var4.method271(var4.field490);
            if (field484 > 0 && null == class512.field4086) {
               class512.field4086 = new class35();
               field483 = Executors.newScheduledThreadPool(1);
               field483.scheduleAtFixedRate(class512.field4086, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class512.field4086 != null) {
               if (null != class512.field4086.field309[var1]) {
                  throw new IllegalArgumentException();
               }

               class512.field4086.field309[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class62();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method279(class460 var0) {
      var0.field3650 = false;
      if (var0.field3651 != null) {
         var0.field3651.field2145 = 0;
      }

      for(class460 var2 = var0.method2169(); null != var2; var2 = var0.method2170()) {
         method279(var2);
      }

   }

   static final void method278(class433 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if (null != var0) {
         if (var6 == -1) {
            throw new IllegalStateException();
         }

         if (var0.method2017()) {
            if (var0 instanceof class86) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               class90 var7 = ((class86)var0).field577;
               if (var7.field644 != null) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  var7 = var7.method349();
               }

               if (null == var7) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            int var76 = class470.field3728;
            int[] var8 = class470.field3729;
            boolean var10000;
            if (var1 < var76) {
               if (var6 == -1) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var9 = var10000;
            int var10 = -2;
            if (var0.field3444 != null) {
               label1019: {
                  if (var9) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var0.field3396) {
                        break label1019;
                     }

                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (4 != Client.field1349) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (var0.field3395) {
                           break label1019;
                        }

                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (0 != Client.field1349) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (Client.field1349 != 3) {
                              if (1 != Client.field1349) {
                                 break label1019;
                              }

                              if (var6 == -1) {
                                 return;
                              }

                              if (!((class443)var0).method2050()) {
                                 break label1019;
                              }
                           }
                        }
                     }
                  }

                  Client.method801(var0, var0.field3433);
                  if (Client.field1234 > -1) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (Client.field1221 < Client.field1153) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.field1400[Client.field1221] = class274.field1923.method1915(var0.field3444) / 2;
                        Client.field1175[Client.field1221] = class274.field1923.field2946;
                        Client.field1223[Client.field1221] = Client.field1234;
                        Client.field1224[Client.field1221] = Client.field1235 - var10;
                        Client.field1227[Client.field1221] = var0.field3398;
                        Client.field1228[Client.field1221] = var0.field3399;
                        Client.field1376[Client.field1221] = var0.field3397;
                        Client.field1125[Client.field1221] = var0.field3440;
                        Client.field1231[Client.field1221] = var0.field3444;
                        ++Client.field1221;
                        var10 += 12;
                     }
                  }
               }
            }

            int var16;
            int var23;
            int var24;
            if (!var0.field3407.method2142()) {
               Client.method801(var0, 15 + var0.field3433);

               for(class156 var11 = (class156)var0.field3407.method2144(); null != var11; var11 = (class156)var0.field3407.method2140()) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  class174 var12 = var11.method590(Client.field1419);
                  if (null != var12) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     class225 var13;
                     class296 var14;
                     class296 var15;
                     int var17;
                     label991: {
                        var13 = var11.field978;
                        var14 = var13.method1120();
                        var15 = var13.method1119();
                        var17 = 0;
                        if (null != var14) {
                           if (var6 == -1) {
                              return;
                           }

                           if (null != var15) {
                              if (var13.field1691 * 2 < var15.field2032) {
                                 if (var6 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = var13.field1691;
                              }

                              var16 = var15.field2032 - var17 * 2;
                              break label991;
                           }
                        }

                        var16 = var13.field1690;
                     }

                     int var18 = 255;
                     boolean var19 = true;
                     int var20 = Client.field1419 - var12.field1424;
                     int var21 = var12.field1421 * var16 / var13.field1690;
                     int var22;
                     int var91;
                     if (var12.field1422 > var20) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        int var100;
                        if (var13.field1686 == 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var100 = 0;
                        } else {
                           var100 = var13.field1686 * (var20 / var13.field1686);
                        }

                        var22 = var100;
                        var23 = var16 * var12.field1420 / var13.field1690;
                        var91 = (var21 - var23) * var22 / var12.field1422 + var23;
                     } else {
                        var91 = var21;
                        var22 = var12.field1422 + var13.field1683 - var20;
                        if (var13.field1687 >= 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var18 = (var22 << 8) / (var13.field1683 - var13.field1687);
                        }
                     }

                     if (var12.field1421 > 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (var91 < 1) {
                           var91 = 1;
                        }
                     }

                     if (null != var14) {
                        if (var6 == -1) {
                           return;
                        }

                        if (var15 != null) {
                           if (var6 == -1) {
                              return;
                           }

                           if (var16 == var91) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var91 += var17 * 2;
                           } else {
                              var91 += var17;
                           }

                           label978: {
                              var22 = var14.field2028;
                              var10 += var22;
                              var23 = var2 + Client.field1234 - (var16 >> 1);
                              var24 = var3 + Client.field1235 - var10;
                              var23 -= var17;
                              if (var18 >= 0) {
                                 if (var6 == -1) {
                                    return;
                                 }

                                 if (var18 < 255) {
                                    if (var6 == -1) {
                                       throw new IllegalStateException();
                                    }

                                    var14.method1364(var23, var24, var18);
                                    class427.method1981(var23, var24, var23 + var91, var24 + var22);
                                    var15.method1364(var23, var24, var18);
                                    break label978;
                                 }
                              }

                              var14.method1366(var23, var24);
                              class427.method1981(var23, var24, var23 + var91, var22 + var24);
                              var15.method1366(var23, var24);
                           }

                           class427.method1975(var2, var3, var2 + var4, var3 + var5);
                           var10 += 2;
                           continue;
                        }
                     }

                     var10 += 5;
                     if (Client.field1234 > -1) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var22 = var2 + Client.field1234 - (var16 >> 1);
                        var23 = var3 + Client.field1235 - var10;
                        class427.method1968(var22, var23, var91, 5, 65280);
                        class427.method1968(var91 + var22, var23, var16 - var91, 5, 16711680);
                     }

                     var10 += 2;
                  } else if (var11.method591()) {
                     var11.method295();
                  }
               }
            }

            if (var10 == -2) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               var10 += 7;
            }

            class443 var77;
            if (var9) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               if (Client.field1419 == var0.field3409) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (Client.method880((class443)var0)) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     var77 = (class443)var0;
                     if (var9) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.method801(var0, 15 + var0.field3433);
                        class419 var79 = (class419)Client.field1185.get(class467.field3692);
                        var10 += 4;
                        var79.method1922(var77.field3510.method1598(), Client.field1234 + var2, var3 + Client.field1235 - var10, 16777215, 0);
                        var10 += 18;
                     }
                  }
               }
            }

            if (var9) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               var77 = (class443)var0;
               if (var77.field3513) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               label944: {
                  if (-1 == var77.field3495) {
                     if (var6 == -1) {
                        return;
                     }

                     if (var77.field3496 == -1) {
                        break label944;
                     }

                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }
                  }

                  Client.method801(var0, 15 + var0.field3433);
                  if (Client.field1234 > -1) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var77.field3495 != -1) {
                        if (var6 == -1) {
                           return;
                        }

                        var10 += 25;
                        class267.field1876[var77.field3495].method1366(var2 + Client.field1234 - 12, var3 + Client.field1235 - var10);
                     }

                     if (-1 != var77.field3496) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var10 += 25;
                        class377.field2689[var77.field3496].method1366(var2 + Client.field1234 - 12, Client.field1235 + var3 - var10);
                     }
                  }
               }

               if (var1 >= 0) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (10 == Client.field1194) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var8[var1] == Client.field1157) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.method801(var0, var0.field3433 + 15);
                        if (Client.field1234 > -1) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var10 += class184.field1483[1].field2028;
                           class184.field1483[1].method1366(Client.field1234 + var2 - 12, Client.field1235 + var3 - var10);
                        }
                     }
                  }
               }
            } else {
               class86 var78 = (class86)var0;
               int[] var80 = var78.method323();
               short[] var83 = var78.method330();
               if (null != var83) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (null != var80) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     for(int var85 = 0; var85 < var83.length; ++var85) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (var83[var85] >= 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (var80[var85] < 0) {
                              if (var6 == -1) {
                                 return;
                              }
                           } else {
                              long var87 = (long)var80[var85] << 8 | (long)var83[var85];
                              class296 var89 = (class296)Client.field1407.method659(var87, (byte)48);
                              if (var89 == null) {
                                 class296[] var90 = class382.method1771(field492, var80[var85], 0);
                                 if (var90 != null) {
                                    if (var6 == -1) {
                                       throw new IllegalStateException();
                                    }

                                    if (var83[var85] < var90.length) {
                                       if (var6 == -1) {
                                          return;
                                       }

                                       var89 = var90[var83[var85]];
                                       Client.field1407.method660(var87, var89);
                                    }
                                 }
                              }

                              if (var89 != null) {
                                 Client.method801(var0, 15 + var0.field3433);
                                 if (Client.field1234 > -1) {
                                    if (var6 == -1) {
                                       throw new IllegalStateException();
                                    }

                                    var89.method1366(Client.field1234 + var2 - (var89.field2032 >> 1), Client.field1235 + (var3 - var89.field2028) - 4);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (Client.field1194 == 1) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (Client.field1115[var1 - var76] == Client.field1138) {
                     if (var6 == -1) {
                        return;
                     }

                     if (Client.field1419 % 20 < 10) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.method801(var0, 15 + var0.field3433);
                        if (Client.field1234 > -1) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           class184.field1483[0].method1366(Client.field1234 + var2 - 12, Client.field1235 + var3 - 28);
                        }
                     }
                  }
               }
            }

            for(int var81 = 0; var81 < 4; ++var81) {
               if (var6 == -1) {
                  return;
               }

               int var82 = var0.field3404[var81];
               int var84 = var0.field3402[var81];
               class183 var86 = null;
               int var88 = 0;
               if (var84 >= 0) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (var82 <= Client.field1419) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }

                  var86 = class183.method978(var0.field3402[var81]);
                  var88 = var86.field1472;
                  if (var86 != null) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (null != var86.field1476) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var86 = var86.method971();
                        if (null == var86) {
                           if (var6 == -1) {
                              return;
                           }

                           var0.field3404[var81] = -1;
                           continue;
                        }
                     }
                  }
               } else if (var82 < 0) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }
                  continue;
               }

               var16 = var0.field3405[var81];
               class183 var93 = null;
               if (var16 >= 0) {
                  var93 = class183.method978(var16);
                  if (var93 != null) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var93.field1476 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var93 = var93.method971();
                     }
                  }
               }

               if (var82 - var88 > Client.field1419) {
                  if (var6 == -1) {
                     return;
                  }
               } else if (var86 == null) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  var0.field3404[var81] = -1;
               } else {
                  Client.method801(var0, var0.field3433 / 2);
                  if (Client.field1234 > -1) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     boolean var92 = true;
                     if (var81 == 1) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.field1235 -= 20;
                     }

                     if (var81 == 2) {
                        Client.field1234 -= 15;
                        Client.field1235 -= 10;
                     }

                     if (var81 == 3) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.field1234 += 15;
                        Client.field1235 -= 10;
                     }

                     class296 var96 = null;
                     class296 var94 = null;
                     class296 var95 = null;
                     class296 var97 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class296 var31 = null;
                     class296 var32 = null;
                     class296 var33 = null;
                     class296 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var96 = var86.method972();
                     int var44;
                     if (var96 != null) {
                        var23 = var96.field2032;
                        var44 = var96.field2028;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              return;
                           }

                           var43 = var44;
                        }

                        var27 = var96.field2026;
                     }

                     var94 = var86.method969();
                     if (null != var94) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var24 = var94.field2032;
                        var44 = var94.field2028;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var43 = var44;
                        }

                        var28 = var94.field2026;
                     }

                     var95 = var86.method973();
                     if (var95 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var25 = var95.field2032;
                        var44 = var95.field2028;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var43 = var44;
                        }

                        var29 = var95.field2026;
                     }

                     var97 = var86.method974();
                     if (null != var97) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var26 = var97.field2032;
                        var44 = var97.field2028;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var43 = var44;
                        }

                        var30 = var97.field2026;
                     }

                     if (var93 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var31 = var93.method972();
                        if (null != var31) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var35 = var31.field2032;
                           var44 = var31.field2028;
                           if (var44 > var43) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var43 = var44;
                           }

                           var39 = var31.field2026;
                        }

                        var32 = var93.method969();
                        if (null != var32) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var36 = var32.field2032;
                           var44 = var32.field2028;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field2026;
                        }

                        var33 = var93.method973();
                        if (var33 != null) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var37 = var33.field2032;
                           var44 = var33.field2028;
                           if (var44 > var43) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var43 = var44;
                           }

                           var41 = var33.field2026;
                        }

                        var34 = var93.method974();
                        if (null != var34) {
                           var38 = var34.field2032;
                           var44 = var34.field2028;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field2026;
                        }
                     }

                     class396 var98 = var86.method977();
                     if (var98 == null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var98 = class174.field1423;
                     }

                     class396 var45;
                     if (var93 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var45 = var93.method977();
                        if (var45 == null) {
                           if (var6 == -1) {
                              return;
                           }

                           var45 = class174.field1423;
                        }
                     } else {
                        var45 = class174.field1423;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var86.method975(var0.field3385[var81]);
                     int var99 = var98.method1915(var46);
                     if (null != var93) {
                        if (var6 == -1) {
                           return;
                        }

                        var47 = var93.method975(var0.field3406[var81]);
                        var49 = var45.method1915(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        label1055: {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (null == var95) {
                              if (var6 == -1) {
                                 return;
                              }

                              if (var97 == null) {
                                 var50 = 1;
                                 break label1055;
                              }

                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }
                           }

                           var50 = var99 / var24 + 1;
                        }
                     }

                     if (null != var93 && var36 > 0) {
                        label1057: {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (var33 == null) {
                              if (var34 == null) {
                                 var51 = 1;
                                 break label1057;
                              }

                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }
                           }

                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var24 * var50;
                        var52 += var57;
                        var56 += (var57 - var99) / 2;
                     } else {
                        var52 += var99;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (var93 != null) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var63 = var51 * var36;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var52 += var38;
                        }
                     }

                     var63 = var0.field3404[var81] - Client.field1419;
                     int var64 = var86.field1470 - var86.field1470 * var63 / var86.field1472;
                     int var65 = var63 * var86.field1464 / var86.field1472 + -var86.field1464;
                     int var66 = var2 + Client.field1234 - (var52 >> 1) + var64;
                     int var67 = Client.field1235 + var3 - 12 + var65;
                     int var68 = var67;
                     int var69 = var43 + var67;
                     int var70 = var86.field1474 + var67 + 15;
                     int var71 = var70 - var98.field2950;
                     int var72 = var70 + var98.field2951;
                     if (var71 < var67) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var68 = var71;
                     }

                     if (var72 > var69) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (var93 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var73 = var93.field1474 + var67 + 15;
                        var74 = var73 - var45.field2950;
                        var75 = var73 + var45.field2951;
                        if (var74 < var68 && var6 == -1) {
                           return;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var86.field1459 >= 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var74 = (var63 << 8) / (var86.field1472 - var86.field1459);
                     }

                     if (var74 >= 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (var74 < 255) {
                           if (var96 != null) {
                              if (var6 == -1) {
                                 return;
                              }

                              var96.method1364(var66 + var53 - var27, var67, var74);
                           }

                           if (var95 != null) {
                              if (var6 == -1) {
                                 return;
                              }

                              var95.method1364(var66 + var54 - var29, var67, var74);
                           }

                           if (var94 != null) {
                              for(var75 = 0; var75 < var50; ++var75) {
                                 if (var6 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 var94.method1364(var75 * var24 + (var55 + var66 - var28), var67, var74);
                              }
                           }

                           if (null != var97) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var97.method1364(var66 + var57 - var30, var67, var74);
                           }

                           var98.method1920(var46, var66 + var56, var70, var86.field1462, 0, var74);
                           if (var93 == null) {
                              continue;
                           }

                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (null != var31) {
                              var31.method1364(var58 + var66 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.method1364(var59 + var66 - var41, var67, var74);
                           }

                           if (null != var32) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              for(var75 = 0; var75 < var51; ++var75) {
                                 if (var6 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 var32.method1364(var75 * var36 + (var60 + var66 - var40), var67, var74);
                              }
                           }

                           if (null != var34) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var34.method1364(var66 + var61 - var42, var67, var74);
                           }

                           var45.method1920(var47, var62 + var66, var73, var93.field1462, 0, var74);
                           continue;
                        }
                     }

                     if (var96 != null) {
                        var96.method1366(var66 + var53 - var27, var67);
                     }

                     if (var95 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var95.method1366(var66 + var54 - var29, var67);
                     }

                     if (null != var94) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        for(var75 = 0; var75 < var50; ++var75) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var94.method1366(var24 * var75 + (var66 + var55 - var28), var67);
                        }
                     }

                     if (var97 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var97.method1366(var57 + var66 - var30, var67);
                     }

                     var98.method1943(var46, var66 + var56, var70, var86.field1462 | -16777216, 0);
                     if (null != var93) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (null != var31) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var31.method1366(var58 + var66 - var39, var67);
                        }

                        if (var33 != null) {
                           var33.method1366(var59 + var66 - var41, var67);
                        }

                        if (null != var32) {
                           if (var6 == -1) {
                              return;
                           }

                           for(var75 = 0; var75 < var51; ++var75) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var32.method1366(var66 + var60 - var40 + var75 * var36, var67);
                           }
                        }

                        if (null != var34) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var34.method1366(var66 + var61 - var42, var67);
                        }

                        var45.method1943(var47, var66 + var62, var73, var93.field1462 | -16777216, 0);
                     }
                  }
               }
            }

            return;
         }

         if (var6 == -1) {
            return;
         }
      }

   }
}
