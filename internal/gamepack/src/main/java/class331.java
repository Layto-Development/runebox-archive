import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class class331 {
   protected static boolean field2670;
   public static int field2655;
   static class22 field2666;
   static int field2658;
   static ScheduledExecutorService field2657;
   boolean field2672 = true;
   class124 field2661;
   class124[] field2674 = new class124[8];
   class124[] field2675 = new class124[8];
   int field2656 = 0;
   int field2662 = 32;
   int field2664;
   int field2665;
   int field2668 = 0;
   int field2669 = 0;
   int field2671 = 0;
   int field2673;
   long field2659 = 0L;
   long field2663 = class80.method713();
   long field2667 = 0L;
   protected int[] field2660;

   protected class331() {
   }

   public final synchronized void method1747(class124 var1) {
      this.field2661 = var1;
   }

   public final synchronized void method1759() {
      if (this.field2660 != null) {
         long var2 = class80.method713();

         try {
            if (0L != this.field2667) {
               if (var2 < this.field2667) {
                  return;
               }

               this.method1754(this.field2664);
               this.field2667 = 0L;
               this.field2672 = true;
            }

            int var4 = this.method1755();
            if (this.field2671 - var4 > this.field2668) {
               this.field2668 = this.field2671 - var4;
            }

            int var5 = this.field2673 + this.field2665;
            if (var5 + 256 > 16384) {
               var5 = 16128;
            }

            if (var5 + 256 > this.field2664) {
               this.field2664 += 1024;
               if (this.field2664 > 16384) {
                  this.field2664 = 16384;
               }

               this.method1756();
               this.method1754(this.field2664);
               var4 = 0;
               this.field2672 = true;
               if (var5 + 256 > this.field2664) {
                  var5 = this.field2664 - 256;
                  this.field2673 = var5 - this.field2665;
               }
            }

            while(var4 < var5) {
               this.method1752(this.field2660, 256);
               this.method1748();
               var4 += 256;
            }

            if (var2 > this.field2659) {
               if (!this.field2672) {
                  if (this.field2668 == 0 && this.field2669 == 0) {
                     this.method1756();
                     this.field2667 = var2 + 2000L;
                     return;
                  }

                  this.field2673 = Math.min(this.field2669, this.field2668);
                  this.field2669 = this.field2668;
               } else {
                  this.field2672 = false;
               }

               this.field2668 = 0;
               this.field2659 = var2 + 2000L;
            }

            this.field2671 = var4;
         } catch (Exception var7) {
            this.method1756();
            this.field2667 = var2 + 2000L;
         }

         try {
            if (var2 > 500000L + this.field2663) {
               var2 = this.field2663;
            }

            while(var2 > this.field2663 + 5000L) {
               this.method1751(256);
               this.field2663 += (long)(256000 / field2655);
            }
         } catch (Exception var6) {
            this.field2663 = var2;
         }

      }
   }

   public final void method1749() {
      this.field2672 = true;
   }

   public final synchronized void method1758() {
      this.field2672 = true;

      try {
         this.method1757();
      } catch (Exception var3) {
         this.method1756();
         this.field2667 = class80.method713() + 2000L;
      }

   }

   public final synchronized void method1750() {
      if (class477.field3653 != null) {
         boolean var2 = true;

         for(int var3 = 0; var3 < 2; ++var3) {
            if (class477.field3653.field3155[var3] == this) {
               class477.field3653.field3155[var3] = null;
            }

            if (null != class477.field3653.field3155[var3]) {
               var2 = false;
            }
         }

         if (var2) {
            field2657.shutdownNow();
            field2657 = null;
            class477.field3653 = null;
         }
      }

      this.method1756();
      this.field2660 = null;
   }

   final void method1751(int var1) {
      this.field2656 -= var1;
      if (this.field2656 < 0) {
         this.field2656 = 0;
      }

      if (this.field2661 != null) {
         this.field2661.method868(var1);
      }

   }

   final void method1752(int[] var1, int var2) {
      int var3 = var2;
      if (field2670) {
         var3 = var2 << 1;
      }

      class324.method1711(var1, 0, var3);
      this.field2656 -= var2;
      if (null != this.field2661 && this.field2656 <= 0) {
         this.field2656 += field2655 >> 4;
         method1762(this.field2661);
         this.method1753(this.field2661, this.field2661.method865());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class124 var10;
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
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class124 var11 = this.field2674[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if (null == var11) {
                           break label98;
                        }

                        class367 var12 = var11.field1517;
                        if (null != var12 && var12.field2866 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field1514;
                        } else {
                           var11.field1516 = true;
                           int var13 = var11.method864();
                           var4 += var13;
                           if (null != var12) {
                              var12.field2866 += var13;
                           }

                           if (var4 >= this.field2662) {
                              break label104;
                           }

                           class124 var14 = var11.method866();
                           if (null != var14) {
                              for(int var15 = var11.field1515; var14 != null; var14 = var11.method867()) {
                                 this.method1753(var14, var15 * var14.method865() >> 8);
                              }
                           }

                           class124 var18 = var11.field1514;
                           var11.field1514 = null;
                           if (var10 == null) {
                              this.field2674[var7] = var18;
                           } else {
                              var10.field1514 = var18;
                           }

                           if (var18 == null) {
                              this.field2675[var7] = var10;
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
            class124 var16 = this.field2674[var6];
            class124[] var17 = this.field2674;
            this.field2675[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1514;
               var16.field1514 = null;
            }
         }
      }

      if (this.field2656 < 0) {
         this.field2656 = 0;
      }

      if (this.field2661 != null) {
         this.field2661.method869(var1, 0, var2);
      }

      this.field2663 = class80.method713();
   }

   final void method1753(class124 var1, int var2) {
      int var4 = var2 >> 5;
      class124 var5 = this.field2675[var4];
      if (var5 == null) {
         this.field2674[var4] = var1;
      } else {
         var5.field1514 = var1;
      }

      this.field2675[var4] = var1;
      var1.field1515 = var2;
   }

   protected void method1760() throws Exception {
   }

   protected void method1754(int var1) throws Exception {
   }

   protected int method1755() throws Exception {
      return this.field2664;
   }

   protected void method1748() throws Exception {
   }

   protected void method1756() {
   }

   protected void method1757() throws Exception {
   }

   public static final void method1764(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         field2655 = var0;
         field2670 = var1;
         field2658 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static final class331 method1763(class93 var0, int var1, int var2) {
      if (field2655 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class331 var4 = class189.field1855.method1852();
            var4.field2660 = new int[256 * (field2670 ? 2 : 1)];
            var4.field2665 = var2;
            var4.method1760();
            var4.field2664 = 1024 + (var2 & -1024);
            if (var4.field2664 > 16384) {
               var4.field2664 = 16384;
            }

            var4.method1754(var4.field2664);
            if (field2658 > 0 && null == class477.field3653) {
               class477.field3653 = new class409();
               field2657 = Executors.newScheduledThreadPool(1);
               field2657.scheduleAtFixedRate(class477.field3653, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class477.field3653 != null) {
               if (null != class477.field3653.field3155[var1]) {
                  throw new IllegalArgumentException();
               }

               class477.field3653.field3155[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class331();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method1762(class124 var0) {
      var0.field1516 = false;
      if (var0.field1517 != null) {
         var0.field1517.field2866 = 0;
      }

      for(class124 var2 = var0.method866(); null != var2; var2 = var0.method867()) {
         method1762(var2);
      }

   }

   static final void method1761(class518 var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if (null != var0) {
         if (var6 == -1) {
            throw new IllegalStateException();
         }

         if (var0.method2465()) {
            if (var0 instanceof class433) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               class453 var7 = ((class433)var0).field3279;
               if (var7.field3542 != null) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  var7 = var7.method2232();
               }

               if (null == var7) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            int var76 = class190.field1866;
            int[] var8 = class190.field1867;
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
            if (var0.field4069 != null) {
               label1019: {
                  if (var9) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var0.field4021) {
                        break label1019;
                     }

                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (Client.field809 != 4) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (var0.field4020) {
                           break label1019;
                        }

                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (Client.field809 != 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (Client.field809 != 3) {
                              if (Client.field809 != 1) {
                                 break label1019;
                              }

                              if (var6 == -1) {
                                 return;
                              }

                              if (!((class522)var0).method2477()) {
                                 break label1019;
                              }
                           }
                        }
                     }
                  }

                  Client.method417(var0, var0.field4058);
                  if (Client.field694 > -1) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (Client.field681 < Client.field613) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.field860[Client.field681] = class112.field1452.method1566(var0.field4069) / 2;
                        Client.field635[Client.field681] = class112.field1452.field2423;
                        Client.field683[Client.field681] = Client.field694;
                        Client.field684[Client.field681] = Client.field695 - var10;
                        Client.field687[Client.field681] = var0.field4023;
                        Client.field688[Client.field681] = var0.field4024;
                        Client.field836[Client.field681] = var0.field4022;
                        Client.field585[Client.field681] = var0.field4065;
                        Client.field691[Client.field681] = var0.field4069;
                        ++Client.field681;
                        var10 += 12;
                     }
                  }
               }
            }

            int var16;
            int var23;
            int var24;
            if (!var0.field4032.method581()) {
               Client.method417(var0, 15 + var0.field4058);

               for(class192 var11 = (class192)var0.field4032.method583(); null != var11; var11 = (class192)var0.field4032.method579()) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  class103 var12 = var11.method1204(Client.field879);
                  if (null != var12) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     class316 var13;
                     class427 var14;
                     class427 var15;
                     int var17;
                     label991: {
                        var13 = var11.field1879;
                        var14 = var13.method1690();
                        var15 = var13.method1689();
                        var17 = 0;
                        if (null != var14) {
                           if (var6 == -1) {
                              return;
                           }

                           if (null != var15) {
                              if (var13.field2580 * 2 < var15.field3237) {
                                 if (var6 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = var13.field2580;
                              }

                              var16 = var15.field3237 - var17 * 2;
                              break label991;
                           }
                        }

                        var16 = var13.field2579;
                     }

                     int var18 = 255;
                     boolean var19 = true;
                     int var20 = Client.field879 - var12.field1342;
                     int var21 = var12.field1339 * var16 / var13.field2579;
                     int var22;
                     int var91;
                     if (var12.field1340 > var20) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        int var100;
                        if (var13.field2575 == 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var100 = 0;
                        } else {
                           var100 = var13.field2575 * (var20 / var13.field2575);
                        }

                        var22 = var100;
                        var23 = var16 * var12.field1338 / var13.field2579;
                        var91 = (var21 - var23) * var22 / var12.field1340 + var23;
                     } else {
                        var91 = var21;
                        var22 = var12.field1340 + var13.field2572 - var20;
                        if (var13.field2576 >= 0) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var18 = (var22 << 8) / (var13.field2572 - var13.field2576);
                        }
                     }

                     if (var12.field1339 > 0) {
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
                              var22 = var14.field3233;
                              var10 += var22;
                              var23 = var2 + Client.field694 - (var16 >> 1);
                              var24 = var3 + Client.field695 - var10;
                              var23 -= var17;
                              if (var18 >= 0) {
                                 if (var6 == -1) {
                                    return;
                                 }

                                 if (var18 < 255) {
                                    if (var6 == -1) {
                                       throw new IllegalStateException();
                                    }

                                    var14.method2030(var23, var24, var18);
                                    class156.method967(var23, var24, var23 + var91, var24 + var22);
                                    var15.method2030(var23, var24, var18);
                                    break label978;
                                 }
                              }

                              var14.method2032(var23, var24);
                              class156.method967(var23, var24, var23 + var91, var22 + var24);
                              var15.method2032(var23, var24);
                           }

                           class156.method961(var2, var3, var2 + var4, var3 + var5);
                           var10 += 2;
                           continue;
                        }
                     }

                     var10 += 5;
                     if (Client.field694 > -1) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var22 = var2 + Client.field694 - (var16 >> 1);
                        var23 = var3 + Client.field695 - var10;
                        class156.method954(var22, var23, var91, 5, 65280);
                        class156.method954(var91 + var22, var23, var16 - var91, 5, 16711680);
                     }

                     var10 += 2;
                  } else if (var11.method1205()) {
                     var11.method605();
                  }
               }
            }

            if (var10 == -2) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               var10 += 7;
            }

            class522 var77;
            if (var9) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               if (Client.field879 == var0.field4034) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (Client.method496((class522)var0)) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     var77 = (class522)var0;
                     if (var9) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.method417(var0, 15 + var0.field4058);
                        class282 var79 = (class282)Client.field645.get(class344.field2741);
                        var10 += 4;
                        var79.method1573(var77.field4112.method1458(), Client.field694 + var2, var3 + Client.field695 - var10, 16777215, 0);
                        var10 += 18;
                     }
                  }
               }
            }

            if (var9) {
               if (var6 == -1) {
                  throw new IllegalStateException();
               }

               var77 = (class522)var0;
               if (var77.field4115) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               label944: {
                  if (var77.field4097 == -1) {
                     if (var6 == -1) {
                        return;
                     }

                     if (var77.field4098 == -1) {
                        break label944;
                     }

                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }
                  }

                  Client.method417(var0, 15 + var0.field4058);
                  if (Client.field694 > -1) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var77.field4097 != -1) {
                        if (var6 == -1) {
                           return;
                        }

                        var10 += 25;
                        class26.field233[var77.field4097].method2032(var2 + Client.field694 - 12, var3 + Client.field695 - var10);
                     }

                     if (var77.field4098 != -1) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var10 += 25;
                        class247.field2218[var77.field4098].method2032(var2 + Client.field694 - 12, Client.field695 + var3 - var10);
                     }
                  }
               }

               if (var1 >= 0) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (Client.field654 == 10) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var8[var1] == Client.field617) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.method417(var0, var0.field4058 + 15);
                        if (Client.field694 > -1) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var10 += class181.field1814[1].field3233;
                           class181.field1814[1].method2032(Client.field694 + var2 - 12, Client.field695 + var3 - var10);
                        }
                     }
                  }
               }
            } else {
               class433 var78 = (class433)var0;
               int[] var80 = var78.method2120();
               short[] var83 = var78.method2127();
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
                              class427 var89 = (class427)Client.field867.method1819(var87, (byte)48);
                              if (var89 == null) {
                                 class427[] var90 = class398.method1931(field2666, var80[var85], 0);
                                 if (var90 != null) {
                                    if (var6 == -1) {
                                       throw new IllegalStateException();
                                    }

                                    if (var83[var85] < var90.length) {
                                       if (var6 == -1) {
                                          return;
                                       }

                                       var89 = var90[var83[var85]];
                                       Client.field867.method1820(var87, var89);
                                    }
                                 }
                              }

                              if (var89 != null) {
                                 Client.method417(var0, 15 + var0.field4058);
                                 if (Client.field694 > -1) {
                                    if (var6 == -1) {
                                       throw new IllegalStateException();
                                    }

                                    var89.method2032(Client.field694 + var2 - (var89.field3237 >> 1), Client.field695 + (var3 - var89.field3233) - 4);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (Client.field654 == 1) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (Client.field575[var1 - var76] == Client.field598) {
                     if (var6 == -1) {
                        return;
                     }

                     if (Client.field879 % 20 < 10) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.method417(var0, 15 + var0.field4058);
                        if (Client.field694 > -1) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           class181.field1814[0].method2032(Client.field694 + var2 - 12, Client.field695 + var3 - 28);
                        }
                     }
                  }
               }
            }

            for(int var81 = 0; var81 < 4; ++var81) {
               if (var6 == -1) {
                  return;
               }

               int var82 = var0.field4029[var81];
               int var84 = var0.field4027[var81];
               class337 var86 = null;
               int var88 = 0;
               if (var84 >= 0) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  if (var82 <= Client.field879) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }

                  var86 = class337.method1784(var0.field4027[var81]);
                  var88 = var86.field2707;
                  if (var86 != null) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (null != var86.field2711) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var86 = var86.method1777();
                        if (null == var86) {
                           if (var6 == -1) {
                              return;
                           }

                           var0.field4029[var81] = -1;
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

               var16 = var0.field4030[var81];
               class337 var93 = null;
               if (var16 >= 0) {
                  var93 = class337.method1784(var16);
                  if (var93 != null) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var93.field2711 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var93 = var93.method1777();
                     }
                  }
               }

               if (var82 - var88 > Client.field879) {
                  if (var6 == -1) {
                     return;
                  }
               } else if (var86 == null) {
                  if (var6 == -1) {
                     throw new IllegalStateException();
                  }

                  var0.field4029[var81] = -1;
               } else {
                  Client.method417(var0, var0.field4058 / 2);
                  if (Client.field694 > -1) {
                     if (var6 == -1) {
                        throw new IllegalStateException();
                     }

                     boolean var92 = true;
                     if (var81 == 1) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.field695 -= 20;
                     }

                     if (var81 == 2) {
                        Client.field694 -= 15;
                        Client.field695 -= 10;
                     }

                     if (var81 == 3) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        Client.field694 += 15;
                        Client.field695 -= 10;
                     }

                     class427 var96 = null;
                     class427 var94 = null;
                     class427 var95 = null;
                     class427 var97 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class427 var31 = null;
                     class427 var32 = null;
                     class427 var33 = null;
                     class427 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var96 = var86.method1778();
                     int var44;
                     if (var96 != null) {
                        var23 = var96.field3237;
                        var44 = var96.field3233;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              return;
                           }

                           var43 = var44;
                        }

                        var27 = var96.field3231;
                     }

                     var94 = var86.method1775();
                     if (null != var94) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var24 = var94.field3237;
                        var44 = var94.field3233;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var43 = var44;
                        }

                        var28 = var94.field3231;
                     }

                     var95 = var86.method1779();
                     if (var95 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var25 = var95.field3237;
                        var44 = var95.field3233;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var43 = var44;
                        }

                        var29 = var95.field3231;
                     }

                     var97 = var86.method1780();
                     if (null != var97) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var26 = var97.field3237;
                        var44 = var97.field3233;
                        if (var44 > var43) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var43 = var44;
                        }

                        var30 = var97.field3231;
                     }

                     if (var93 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var31 = var93.method1778();
                        if (null != var31) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var35 = var31.field3237;
                           var44 = var31.field3233;
                           if (var44 > var43) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var43 = var44;
                           }

                           var39 = var31.field3231;
                        }

                        var32 = var93.method1775();
                        if (null != var32) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var36 = var32.field3237;
                           var44 = var32.field3233;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field3231;
                        }

                        var33 = var93.method1779();
                        if (var33 != null) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var37 = var33.field3237;
                           var44 = var33.field3233;
                           if (var44 > var43) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var43 = var44;
                           }

                           var41 = var33.field3231;
                        }

                        var34 = var93.method1780();
                        if (null != var34) {
                           var38 = var34.field3237;
                           var44 = var34.field3233;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field3231;
                        }
                     }

                     class460 var98 = var86.method1783();
                     if (var98 == null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var98 = class103.field1341;
                     }

                     class460 var45;
                     if (var93 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var45 = var93.method1783();
                        if (var45 == null) {
                           if (var6 == -1) {
                              return;
                           }

                           var45 = class103.field1341;
                        }
                     } else {
                        var45 = class103.field1341;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var86.method1781(var0.field4010[var81]);
                     int var99 = var98.method1566(var46);
                     if (null != var93) {
                        if (var6 == -1) {
                           return;
                        }

                        var47 = var93.method1781(var0.field4031[var81]);
                        var49 = var45.method1566(var47);
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

                     var63 = var0.field4029[var81] - Client.field879;
                     int var64 = var86.field2705 - var86.field2705 * var63 / var86.field2707;
                     int var65 = var63 * var86.field2699 / var86.field2707 + -var86.field2699;
                     int var66 = var2 + Client.field694 - (var52 >> 1) + var64;
                     int var67 = Client.field695 + var3 - 12 + var65;
                     int var68 = var67;
                     int var69 = var43 + var67;
                     int var70 = var86.field2709 + var67 + 15;
                     int var71 = var70 - var98.field2427;
                     int var72 = var70 + var98.field2428;
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

                        var73 = var93.field2709 + var67 + 15;
                        var74 = var73 - var45.field2427;
                        var75 = var73 + var45.field2428;
                        if (var74 < var68 && var6 == -1) {
                           return;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var86.field2694 >= 0) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var74 = (var63 << 8) / (var86.field2707 - var86.field2694);
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

                              var96.method2030(var66 + var53 - var27, var67, var74);
                           }

                           if (var95 != null) {
                              if (var6 == -1) {
                                 return;
                              }

                              var95.method2030(var66 + var54 - var29, var67, var74);
                           }

                           if (var94 != null) {
                              for(var75 = 0; var75 < var50; ++var75) {
                                 if (var6 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 var94.method2030(var75 * var24 + (var55 + var66 - var28), var67, var74);
                              }
                           }

                           if (null != var97) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var97.method2030(var66 + var57 - var30, var67, var74);
                           }

                           var98.method1571(var46, var66 + var56, var70, var86.field2697, 0, var74);
                           if (var93 == null) {
                              continue;
                           }

                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           if (null != var31) {
                              var31.method2030(var58 + var66 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.method2030(var59 + var66 - var41, var67, var74);
                           }

                           if (null != var32) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              for(var75 = 0; var75 < var51; ++var75) {
                                 if (var6 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 var32.method2030(var75 * var36 + (var60 + var66 - var40), var67, var74);
                              }
                           }

                           if (null != var34) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var34.method2030(var66 + var61 - var42, var67, var74);
                           }

                           var45.method1571(var47, var62 + var66, var73, var93.field2697, 0, var74);
                           continue;
                        }
                     }

                     if (var96 != null) {
                        var96.method2032(var66 + var53 - var27, var67);
                     }

                     if (var95 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var95.method2032(var66 + var54 - var29, var67);
                     }

                     if (null != var94) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        for(var75 = 0; var75 < var50; ++var75) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var94.method2032(var24 * var75 + (var66 + var55 - var28), var67);
                        }
                     }

                     if (var97 != null) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        var97.method2032(var57 + var66 - var30, var67);
                     }

                     var98.method1594(var46, var66 + var56, var70, var86.field2697 | -16777216, 0);
                     if (null != var93) {
                        if (var6 == -1) {
                           throw new IllegalStateException();
                        }

                        if (null != var31) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var31.method2032(var58 + var66 - var39, var67);
                        }

                        if (var33 != null) {
                           var33.method2032(var59 + var66 - var41, var67);
                        }

                        if (null != var32) {
                           if (var6 == -1) {
                              return;
                           }

                           for(var75 = 0; var75 < var51; ++var75) {
                              if (var6 == -1) {
                                 throw new IllegalStateException();
                              }

                              var32.method2032(var66 + var60 - var40 + var75 * var36, var67);
                           }
                        }

                        if (null != var34) {
                           if (var6 == -1) {
                              throw new IllegalStateException();
                           }

                           var34.method2032(var66 + var61 - var42, var67);
                        }

                        var45.method1594(var47, var66 + var62, var73, var93.field2697 | -16777216, 0);
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
