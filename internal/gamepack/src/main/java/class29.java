import java.io.IOException;
import java.util.zip.CRC32;

public class class29 {
   boolean field283;
   byte field274 = 0;
   class131 field280;
   class275 field278 = new class275();
   class313 field276 = new class313(32);
   class313 field279 = new class313(4096);
   class313 field281 = new class313(4096);
   class313 field285 = new class313(4096);
   class331 field295;
   class366 field272 = new class366(8);
   class366 field275;
   class366 field286;
   class534[] field290 = new class534[256];
   int field277 = 0;
   int field282 = 0;
   int field284 = 0;
   int field287 = 0;
   int field289 = 0;
   int field291 = -1;
   int field292 = 255;
   int field293 = 0;
   CRC32 field288 = new CRC32();
   long field273;
   public int field271 = 0;
   public int field294 = 0;

   public boolean method130() {
      long var2 = class123.method471();
      int var4 = (int)(var2 - this.field273);
      this.field273 = var2;
      if (var4 > 200) {
         var4 = 200;
      }

      this.field293 += var4;
      if (0 == this.field282 && this.field277 == 0 && 0 == this.field289 && this.field284 == 0) {
         return true;
      } else if (null == this.field295) {
         return false;
      } else {
         try {
            if (this.field293 > 30000) {
               throw new IOException();
            } else {
               class131 var5;
               class366 var6;
               while(this.field277 < 200 && this.field284 > 0) {
                  var5 = (class131)this.field285.method1432();
                  var6 = new class366(4);
                  var6.method1643(1);
                  var6.method1695((int)var5.field531);
                  this.field295.method1559(var6.field2650, 0, 4);
                  this.field276.method1434(var5, var5.field531);
                  --this.field284;
                  ++this.field277;
               }

               while(this.field282 < 200 && this.field289 > 0) {
                  var5 = (class131)this.field278.method1288();
                  var6 = new class366(4);
                  var6.method1643(0);
                  var6.method1695((int)var5.field531);
                  this.field295.method1559(var6.field2650, 0, 4);
                  var5.method1406();
                  this.field281.method1434(var5, var5.field531);
                  --this.field289;
                  ++this.field282;
               }

               for(int var20 = 0; var20 < 100; ++var20) {
                  int var21 = this.field295.method1558();
                  if (var21 < 0) {
                     throw new IOException();
                  }

                  if (var21 == 0) {
                     break;
                  }

                  this.field293 = 0;
                  byte var7 = 0;
                  if (this.field280 == null) {
                     var7 = 8;
                  } else if (0 == this.field287) {
                     var7 = 1;
                  }

                  int var8;
                  int var9;
                  int var10;
                  byte[] var10000;
                  int var10001;
                  class366 var23;
                  if (var7 > 0) {
                     var8 = var7 - this.field272.field2652;
                     if (var8 > var21) {
                        var8 = var21;
                     }

                     this.field295.method1557(this.field272.field2650, this.field272.field2652, var8);
                     if (this.field274 != 0) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10000 = this.field272.field2650;
                           var10001 = var9 + this.field272.field2652;
                           var10000[var10001] ^= this.field274;
                        }
                     }

                     var23 = this.field272;
                     var23.field2652 += var8;
                     if (this.field272.field2652 < var7) {
                        break;
                     }

                     if (null == this.field280) {
                        this.field272.field2652 = 0;
                        var9 = this.field272.method1654();
                        var10 = this.field272.method1703();
                        int var11 = this.field272.method1654();
                        int var12 = this.field272.method1658();
                        long var13 = (long)(var10 + (var9 << 16));
                        class131 var15 = (class131)this.field276.method1431(var13);
                        this.field283 = true;
                        if (null == var15) {
                           var15 = (class131)this.field281.method1431(var13);
                           this.field283 = false;
                        }

                        if (null == var15) {
                           throw new IOException();
                        }

                        int var16 = var11 == 0 ? 5 : 9;
                        this.field280 = var15;
                        this.field286 = new class366(var12 + var16 + this.field280.field815);
                        this.field286.method1643(var11);
                        this.field286.method1709(var12);
                        this.field287 = 8;
                        this.field272.field2652 = 0;
                     } else if (this.field287 == 0) {
                        if (-1 == this.field272.field2650[0]) {
                           this.field287 = 1;
                           this.field272.field2652 = 0;
                        } else {
                           this.field280 = null;
                        }
                     }
                  } else {
                     var8 = this.field286.field2650.length - this.field280.field815;
                     var9 = 512 - this.field287;
                     if (var9 > var8 - this.field286.field2652) {
                        var9 = var8 - this.field286.field2652;
                     }

                     if (var9 > var21) {
                        var9 = var21;
                     }

                     this.field295.method1557(this.field286.field2650, this.field286.field2652, var9);
                     if (this.field274 != 0) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var10000 = this.field286.field2650;
                           var10001 = var10 + this.field286.field2652;
                           var10000[var10001] ^= this.field274;
                        }
                     }

                     var23 = this.field286;
                     var23.field2652 += var9;
                     this.field287 += var9;
                     if (var8 == this.field286.field2652) {
                        if (16711935L == this.field280.field531) {
                           this.field275 = this.field286;

                           for(var10 = 0; var10 < 256; ++var10) {
                              class534 var22 = this.field290[var10];
                              if (var22 != null) {
                                 this.method128(var22, var10);
                              }
                           }
                        } else {
                           this.field288.reset();
                           this.field288.update(this.field286.field2650, 0, var8);
                           var10 = (int)this.field288.getValue();
                           if (this.field280.field813 != var10) {
                              try {
                                 this.field295.method1561();
                              } catch (Exception var18) {
                              }

                              ++this.field271;
                              this.field295 = null;
                              this.field274 = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           this.field271 = 0;
                           this.field294 = 0;
                           this.field280.field814.method2528((int)(this.field280.field531 & 65535L), this.field286.field2650, 16711680L == (this.field280.field531 & 16711680L), this.field283);
                        }

                        this.field280.method295();
                        if (this.field283) {
                           --this.field277;
                        } else {
                           --this.field282;
                        }

                        this.field287 = 0;
                        this.field280 = null;
                        this.field286 = null;
                     } else {
                        if (512 != this.field287) {
                           break;
                        }

                        this.field287 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var19) {
            try {
               this.field295.method1561();
            } catch (Exception var17) {
            }

            ++this.field294;
            this.field295 = null;
            return false;
         }
      }
   }

   public void method126(boolean var1) {
      if (null != this.field295) {
         try {
            class366 var3 = new class366(4);
            var3.method1643(var1 ? 2 : 3);
            var3.method1695(0);
            this.field295.method1559(var3.field2650, 0, 4);
         } catch (IOException var6) {
            try {
               this.field295.method1561();
            } catch (Exception var5) {
            }

            ++this.field294;
            this.field295 = null;
         }

      }
   }

   public void method125(class331 var1, boolean var2) {
      if (null != this.field295) {
         try {
            this.field295.method1561();
         } catch (Exception var8) {
         }

         this.field295 = null;
      }

      this.field295 = var1;
      this.method126(var2);
      this.field272.field2652 = 0;
      this.field280 = null;
      this.field286 = null;
      this.field287 = 0;

      while(true) {
         class131 var4 = (class131)this.field276.method1432();
         if (null == var4) {
            while(true) {
               var4 = (class131)this.field281.method1432();
               if (var4 == null) {
                  if (this.field274 != 0) {
                     try {
                        class366 var9 = new class366(4);
                        var9.method1643(4);
                        var9.method1643(this.field274);
                        var9.method1684(0);
                        this.field295.method1559(var9.field2650, 0, 4);
                     } catch (IOException var7) {
                        try {
                           this.field295.method1561();
                        } catch (Exception var6) {
                        }

                        ++this.field294;
                        this.field295 = null;
                     }
                  }

                  this.field293 = 0;
                  this.field273 = class123.method471();
                  return;
               }

               this.field278.method1287(var4);
               this.field279.method1434(var4, var4.field531);
               ++this.field289;
               --this.field282;
            }
         }

         this.field285.method1434(var4, var4.field531);
         ++this.field284;
         --this.field277;
      }
   }

   void method127(class534 var1, int var2) {
      if (var1.field4225) {
         if (var2 <= this.field291) {
            throw new RuntimeException("");
         }

         if (var2 < this.field292) {
            this.field292 = var2;
         }
      } else {
         if (var2 >= this.field292) {
            throw new RuntimeException("");
         }

         if (var2 > this.field291) {
            this.field291 = var2;
         }
      }

      if (null != this.field275) {
         this.method128(var1, var2);
      } else {
         this.method129((class534)null, 255, 255, 0, (byte)0, true);
         this.field290[var2] = var1;
      }
   }

   void method128(class534 var1, int var2) {
      this.field275.field2652 = 5 + var2 * 8;
      if (this.field275.field2652 >= this.field275.field2650.length) {
         if (var1.field4225) {
            var1.method2531();
         } else {
            throw new RuntimeException("");
         }
      } else {
         int var4 = this.field275.method1658();
         int var5 = this.field275.method1658();
         var1.method2527(var4, var5, (byte)18);
      }
   }

   void method129(class534 var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var8 = (long)((var2 << 16) + var3);
      class131 var10 = (class131)this.field285.method1431(var8);
      if (var10 == null) {
         var10 = (class131)this.field276.method1431(var8);
         if (null == var10) {
            var10 = (class131)this.field279.method1431(var8);
            if (var10 != null) {
               if (var6) {
                  var10.method1406();
                  this.field285.method1434(var10, var8);
                  --this.field289;
                  ++this.field284;
               }

            } else {
               if (!var6) {
                  var10 = (class131)this.field281.method1431(var8);
                  if (null != var10) {
                     return;
                  }
               }

               var10 = new class131();
               var10.field814 = var1;
               var10.field813 = var4;
               var10.field815 = var5;
               if (var6) {
                  this.field285.method1434(var10, var8);
                  ++this.field284;
               } else {
                  this.field278.method1289(var10);
                  this.field279.method1434(var10, var8);
                  ++this.field289;
               }

            }
         }
      }
   }

   void method132(int var1, int var2) {
      long var4 = (long)(var2 + (var1 << 16));
      class131 var6 = (class131)this.field279.method1431(var4);
      if (var6 != null) {
         this.field278.method1287(var6);
      }
   }

   int method134(int var1, int var2) {
      long var4 = (long)(var2 + (var1 << 16));
      return this.field280 != null && var4 == this.field280.field531 ? 1 + this.field286.field2652 * 99 / (this.field286.field2650.length - this.field280.field815) : 0;
   }

   public int method133(boolean var1, boolean var2) {
      int var4 = 0;
      if (var1) {
         var4 += this.field277 + this.field284;
      }

      if (var2) {
         var4 += this.field289 + this.field282;
      }

      return var4;
   }

   public void method131() {
      if (this.field295 != null) {
         this.field295.method1561();
      }

   }
}
