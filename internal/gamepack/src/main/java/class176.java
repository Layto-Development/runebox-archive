public class class176 extends class397 {
   int field1431 = 1;
   final class516 field1430;
   public class289 field1429 = new class289();

   public class176(class516 var1) {
      super(400);
      this.field1430 = var1;
   }

   class57 method1811() {
      return new class20();
   }

   class57[] method1805(int var1) {
      return new class20[var1];
   }

   public boolean method947(class349 var1, boolean var2) {
      class20 var4 = (class20)this.method1795(var1);
      if (null == var4) {
         return false;
      } else {
         return !var2 || 0 != var4.field4284;
      }
   }

   public void method948(class366 var1, int var2, byte var3) {
      while(var1.field2652 < var2) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         boolean var10000;
         if (var1.method1654() == 1) {
            if (var3 != -1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         class349 var5 = new class349(var1.method1662(), this.field1430);
         class349 var6 = new class349(var1.method1662(), this.field1430);
         int var7 = var1.method1703();
         int var8 = var1.method1654();
         int var9 = var1.method1654();
         if ((var9 & 2) != 0) {
            if (var3 != -1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var10 = var10000;
         if (0 != (var9 & 1)) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var11 = var10000;
         if (var7 > 0) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            var1.method1662();
            var1.method1654();
            var1.method1658();
         }

         var1.method1662();
         if (var5 != null) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            if (var5.method1599()) {
               class20 var12 = (class20)this.method1796(var5);
               if (var4) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  class20 var13 = (class20)this.method1796(var6);
                  if (var13 != null) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     if (var13 != var12) {
                        if (var3 != -1) {
                           throw new IllegalStateException();
                        }

                        if (var12 != null) {
                           this.method1797(var13);
                        } else {
                           var12 = var13;
                        }
                     }
                  }
               }

               if (null != var12) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  this.method1800(var12, var5, var6);
                  if (var12.field4284 != var7) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     boolean var15 = true;

                     for(class278 var14 = (class278)this.field1429.method1314(); null != var14; var14 = (class278)this.field1429.method1313()) {
                        if (var3 != -1) {
                           throw new IllegalStateException();
                        }

                        if (var14.field1945.equals(var5)) {
                           if (var3 != -1) {
                              throw new IllegalStateException();
                           }

                           if (var7 != 0) {
                              if (var3 != -1) {
                                 throw new IllegalStateException();
                              }

                              if (var14.field1946 == 0) {
                                 if (var3 != -1) {
                                    throw new IllegalStateException();
                                 }

                                 var14.method987();
                                 var15 = false;
                                 continue;
                              }
                           }

                           if (var7 == 0) {
                              if (var3 != -1) {
                                 throw new IllegalStateException();
                              }

                              if (var14.field1946 != 0) {
                                 if (var3 != -1) {
                                    throw new IllegalStateException();
                                 }

                                 var14.method987();
                                 var15 = false;
                              }
                           }
                        }
                     }

                     if (var15) {
                        this.field1429.method1312(new class278(var5, var7));
                     }
                  }
               } else {
                  if (this.method1814() >= 400) {
                     continue;
                  }

                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  var12 = (class20)this.method1798(var5, var6);
               }

               if (var7 != var12.field4284) {
                  if (var3 != -1) {
                     return;
                  }

                  var12.field4283 = ++this.field1431 - 1;
                  if (var12.field4284 == -1) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     if (var7 == 0) {
                        if (var3 != -1) {
                           throw new IllegalStateException();
                        }

                        var12.field4283 = -(var12.field4283 * -1297576351) * -585067103;
                     }
                  }

                  var12.field4284 = var7;
               }

               var12.field4285 = var8;
               var12.field213 = var10;
               var12.field214 = var11;
               continue;
            }

            if (var3 != -1) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalStateException();
      }

      this.method1815();
   }
}
