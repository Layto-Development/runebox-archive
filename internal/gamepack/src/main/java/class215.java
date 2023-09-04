public class class215 extends class428 {
   int field2017 = 1;
   final class246 field2016;
   public class292 field2015 = new class292();

   public class215(class246 var1) {
      super(400);
      this.field2016 = var1;
   }

   class332 method2055() {
      return new class446();
   }

   class332[] method2049(int var1) {
      return new class446[var1];
   }

   public boolean method1311(class251 var1, boolean var2) {
      class446 var4 = (class446)this.method2039(var1);
      if (null == var4) {
         return false;
      } else {
         return !var2 || var4.field3157 != 0;
      }
   }

   public void method1312(class184 var1, int var2, byte var3) {
      while(var1.field1818 < var2) {
         if (var3 != -1) {
            throw new IllegalStateException();
         }

         boolean var10000;
         if (var1.method1125() == 1) {
            if (var3 != -1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         class251 var5 = new class251(var1.method1133(), this.field2016);
         class251 var6 = new class251(var1.method1133(), this.field2016);
         int var7 = var1.method1174();
         int var8 = var1.method1125();
         int var9 = var1.method1125();
         if ((var9 & 2) != 0) {
            if (var3 != -1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var10 = var10000;
         if ((var9 & 1) != 0) {
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

            var1.method1133();
            var1.method1125();
            var1.method1129();
         }

         var1.method1133();
         if (var5 != null) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            if (var5.method1459()) {
               class446 var12 = (class446)this.method2040(var5);
               if (var4) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  class446 var13 = (class446)this.method2040(var6);
                  if (var13 != null) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     if (var13 != var12) {
                        if (var3 != -1) {
                           throw new IllegalStateException();
                        }

                        if (var12 != null) {
                           this.method2041(var13);
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

                  this.method2044(var12, var5, var6);
                  if (var12.field3157 != var7) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     boolean var15 = true;

                     for(class105 var14 = (class105)this.field2015.method1614(); null != var14; var14 = (class105)this.field2015.method1613()) {
                        if (var3 != -1) {
                           throw new IllegalStateException();
                        }

                        if (var14.field1416.equals(var5)) {
                           if (var3 != -1) {
                              throw new IllegalStateException();
                           }

                           if (var7 != 0) {
                              if (var3 != -1) {
                                 throw new IllegalStateException();
                              }

                              if (var14.field1417 == 0) {
                                 if (var3 != -1) {
                                    throw new IllegalStateException();
                                 }

                                 var14.method824();
                                 var15 = false;
                                 continue;
                              }
                           }

                           if (var7 == 0) {
                              if (var3 != -1) {
                                 throw new IllegalStateException();
                              }

                              if (var14.field1417 != 0) {
                                 if (var3 != -1) {
                                    throw new IllegalStateException();
                                 }

                                 var14.method824();
                                 var15 = false;
                              }
                           }
                        }
                     }

                     if (var15) {
                        this.field2015.method1612(new class105(var5, var7));
                     }
                  }
               } else {
                  if (this.method2058() >= 400) {
                     continue;
                  }

                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  var12 = (class446)this.method2042(var5, var6);
               }

               if (var7 != var12.field3157) {
                  if (var3 != -1) {
                     return;
                  }

                  var12.field3156 = ++this.field2017 - 1;
                  if (var12.field3157 == -1) {
                     if (var3 != -1) {
                        throw new IllegalStateException();
                     }

                     if (var7 == 0) {
                        if (var3 != -1) {
                           throw new IllegalStateException();
                        }

                        var12.field3156 = -(var12.field3156 * -1297576351) * -585067103;
                     }
                  }

                  var12.field3157 = var7;
               }

               var12.field3158 = var8;
               var12.field3390 = var10;
               var12.field3391 = var11;
               continue;
            }

            if (var3 != -1) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalStateException();
      }

      this.method2059();
   }
}
