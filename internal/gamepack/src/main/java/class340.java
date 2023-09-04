import java.io.EOFException;
import java.io.IOException;

public final class class340 {
   static byte[] field2534 = new byte[520];
   class493 field2532 = null;
   class493 field2533 = null;
   int field2535 = 65000;
   int field2536;

   public class340(int var1, class493 var2, class493 var3, int var4) {
      this.field2536 = var1;
      this.field2532 = var2;
      this.field2533 = var3;
      this.field2535 = var4;
   }

   public byte[] method1585(int var1) {
      synchronized(this.field2532) {
         Object var10000;
         try {
            if (this.field2533.method2338() < (long)(6 + var1 * 6)) {
               var10000 = null;
               return (byte[])var10000;
            }

            this.field2533.method2332((long)(var1 * 6));
            this.field2533.method2334(field2534, 0, 6);
            int var4 = (field2534[2] & 255) + ((field2534[1] & 255) << 8) + ((field2534[0] & 255) << 16);
            int var5 = ((field2534[4] & 255) << 8) + ((field2534[3] & 255) << 16) + (field2534[5] & 255);
            if (var4 < 0 || var4 > this.field2535) {
               var10000 = null;
               return (byte[])var10000;
            }

            if (var5 > 0 && (long)var5 <= this.field2532.method2338() / 520L) {
               byte[] var6 = new byte[var4];
               int var7 = 0;
               int var8 = 0;

               while(var7 < var4) {
                  if (var5 == 0) {
                     var10000 = null;
                     return (byte[])var10000;
                  }

                  this.field2532.method2332(520L * (long)var5);
                  int var9 = var4 - var7;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  byte var14;
                  if (var1 > 65535) {
                     if (var9 > 510) {
                        var9 = 510;
                     }

                     var14 = 10;
                     this.field2532.method2334(field2534, 0, var9 + var14);
                     var10 = ((field2534[2] & 255) << 8) + ((field2534[1] & 255) << 16) + ((field2534[0] & 255) << 24) + (field2534[3] & 255);
                     var11 = ((field2534[4] & 255) << 8) + (field2534[5] & 255);
                     var12 = (field2534[8] & 255) + ((field2534[6] & 255) << 16) + ((field2534[7] & 255) << 8);
                     var13 = field2534[9] & 255;
                  } else {
                     if (var9 > 512) {
                        var9 = 512;
                     }

                     var14 = 8;
                     this.field2532.method2334(field2534, 0, var14 + var9);
                     var10 = ((field2534[0] & 255) << 8) + (field2534[1] & 255);
                     var11 = (field2534[3] & 255) + ((field2534[2] & 255) << 8);
                     var12 = (field2534[6] & 255) + ((field2534[5] & 255) << 8) + ((field2534[4] & 255) << 16);
                     var13 = field2534[7] & 255;
                  }

                  if (var10 == var1 && var8 == var11 && var13 == this.field2536) {
                     if (var12 >= 0 && (long)var12 <= this.field2532.method2338() / 520L) {
                        int var15 = var9 + var14;

                        for(int var16 = var14; var16 < var15; ++var16) {
                           var6[var7++] = field2534[var16];
                        }

                        var5 = var12;
                        ++var8;
                        continue;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }

               byte[] var20 = var6;
               return var20;
            }

            var10000 = null;
         } catch (IOException var18) {
            return null;
         }

         return (byte[])var10000;
      }
   }

   public boolean method1586(int var1, byte[] var2, int var3) {
      synchronized(this.field2532) {
         if (var3 >= 0 && var3 <= this.field2535) {
            boolean var6 = this.method1587(var1, var2, var3, true);
            if (!var6) {
               var6 = this.method1587(var1, var2, var3, false);
            }

            return var6;
         } else {
            throw new IllegalArgumentException("" + this.field2536 + ',' + var1 + ',' + var3);
         }
      }
   }

   boolean method1587(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.field2532) {
         try {
            int var7;
            boolean var10000;
            if (var4) {
               if (this.field2533.method2338() < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field2533.method2332((long)(var1 * 6));
               this.field2533.method2334(field2534, 0, 6);
               var7 = (field2534[5] & 255) + ((field2534[3] & 255) << 16) + ((field2534[4] & 255) << 8);
               if (var7 <= 0 || (long)var7 > this.field2532.method2338() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var7 = (int)((this.field2532.method2338() + 519L) / 520L);
               if (var7 == 0) {
                  var7 = 1;
               }
            }

            field2534[0] = (byte)(var3 >> 16);
            field2534[1] = (byte)(var3 >> 8);
            field2534[2] = (byte)var3;
            field2534[3] = (byte)(var7 >> 16);
            field2534[4] = (byte)(var7 >> 8);
            field2534[5] = (byte)var7;
            this.field2533.method2332((long)(var1 * 6));
            this.field2533.method2336(field2534, 0, 6);
            int var8 = 0;
            int var9 = 0;

            while(true) {
               if (var8 < var3) {
                  label154: {
                     int var10 = 0;
                     int var11;
                     if (var4) {
                        this.field2532.method2332((long)var7 * 520L);
                        int var12;
                        int var13;
                        if (var1 > 65535) {
                           try {
                              this.field2532.method2334(field2534, 0, 10);
                           } catch (EOFException var17) {
                              break label154;
                           }

                           var11 = ((field2534[1] & 255) << 16) + ((field2534[0] & 255) << 24) + ((field2534[2] & 255) << 8) + (field2534[3] & 255);
                           var12 = (field2534[5] & 255) + ((field2534[4] & 255) << 8);
                           var10 = ((field2534[6] & 255) << 16) + ((field2534[7] & 255) << 8) + (field2534[8] & 255);
                           var13 = field2534[9] & 255;
                        } else {
                           try {
                              this.field2532.method2334(field2534, 0, 8);
                           } catch (EOFException var16) {
                              break label154;
                           }

                           var11 = ((field2534[0] & 255) << 8) + (field2534[1] & 255);
                           var12 = ((field2534[2] & 255) << 8) + (field2534[3] & 255);
                           var10 = (field2534[6] & 255) + ((field2534[5] & 255) << 8) + ((field2534[4] & 255) << 16);
                           var13 = field2534[7] & 255;
                        }

                        if (var1 != var11 || var12 != var9 || this.field2536 != var13) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var10 < 0 || (long)var10 > this.field2532.method2338() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var10 == 0) {
                        var4 = false;
                        var10 = (int)((this.field2532.method2338() + 519L) / 520L);
                        if (var10 == 0) {
                           ++var10;
                        }

                        if (var10 == var7) {
                           ++var10;
                        }
                     }

                     if (var1 > 65535) {
                        if (var3 - var8 <= 510) {
                           var10 = 0;
                        }

                        field2534[0] = (byte)(var1 >> 24);
                        field2534[1] = (byte)(var1 >> 16);
                        field2534[2] = (byte)(var1 >> 8);
                        field2534[3] = (byte)var1;
                        field2534[4] = (byte)(var9 >> 8);
                        field2534[5] = (byte)var9;
                        field2534[6] = (byte)(var10 >> 16);
                        field2534[7] = (byte)(var10 >> 8);
                        field2534[8] = (byte)var10;
                        field2534[9] = (byte)this.field2536;
                        this.field2532.method2332((long)var7 * 520L);
                        this.field2532.method2336(field2534, 0, 10);
                        var11 = var3 - var8;
                        if (var11 > 510) {
                           var11 = 510;
                        }

                        this.field2532.method2336(var2, var8, var11);
                        var8 += var11;
                     } else {
                        if (var3 - var8 <= 512) {
                           var10 = 0;
                        }

                        field2534[0] = (byte)(var1 >> 8);
                        field2534[1] = (byte)var1;
                        field2534[2] = (byte)(var9 >> 8);
                        field2534[3] = (byte)var9;
                        field2534[4] = (byte)(var10 >> 16);
                        field2534[5] = (byte)(var10 >> 8);
                        field2534[6] = (byte)var10;
                        field2534[7] = (byte)this.field2536;
                        this.field2532.method2332(520L * (long)var7);
                        this.field2532.method2336(field2534, 0, 8);
                        var11 = var3 - var8;
                        if (var11 > 512) {
                           var11 = 512;
                        }

                        this.field2532.method2336(var2, var8, var11);
                        var8 += var11;
                     }

                     var7 = var10;
                     ++var9;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var18) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.field2536;
   }
}
