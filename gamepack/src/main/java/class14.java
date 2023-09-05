import java.io.IOException;
import java.util.zip.CRC32;

public class class14 {
   boolean field130;
   byte field121 = 0;
   class133 field127;
   class168 field142;
   class184 field119 = new class184(8);
   class184 field122;
   class184 field133;
   class22[] field137 = new class22[256];
   class304 field125 = new class304();
   class79 field123 = new class79(32);
   class79 field126 = new class79(4096);
   class79 field128 = new class79(4096);
   class79 field132 = new class79(4096);
   int field124 = 0;
   int field129 = 0;
   int field131 = 0;
   int field134 = 0;
   int field136 = 0;
   int field138 = -1;
   int field139 = 255;
   int field140 = 0;
   CRC32 field135 = new CRC32();
   long field120;
   public int field118 = 0;
   public int field141 = 0;

   public boolean method137() {
      long var2 = class80.method713();
      int var4 = (int)(var2 - this.field120);
      this.field120 = var2;
      if (var4 > 200) {
         var4 = 200;
      }

      this.field140 += var4;
      if (this.field129 == 0 && this.field124 == 0 && this.field136 == 0 && this.field131 == 0) {
         return true;
      } else if (null == this.field142) {
         return false;
      } else {
         try {
            if (this.field140 > 30000) {
               throw new IOException();
            } else {
               class133 var5;
               class184 var6;
               while(this.field124 < 200 && this.field131 > 0) {
                  var5 = (class133)this.field132.method710();
                  var6 = new class184(4);
                  var6.method1114(1);
                  var6.method1166((int)var5.field1078);
                  this.field142.method1015(var6.field1816, 0, 4);
                  this.field123.method712(var5, var5.field1078);
                  --this.field131;
                  ++this.field124;
               }

               while(this.field129 < 200 && this.field136 > 0) {
                  var5 = (class133)this.field125.method1665();
                  var6 = new class184(4);
                  var6.method1114(0);
                  var6.method1166((int)var5.field1078);
                  this.field142.method1015(var6.field1816, 0, 4);
                  var5.method938();
                  this.field128.method712(var5, var5.field1078);
                  --this.field136;
                  ++this.field129;
               }

               for(int var20 = 0; var20 < 100; ++var20) {
                  int var21 = this.field142.method1014();
                  if (var21 < 0) {
                     throw new IOException();
                  }

                  if (var21 == 0) {
                     break;
                  }

                  this.field140 = 0;
                  byte var7 = 0;
                  if (this.field127 == null) {
                     var7 = 8;
                  } else if (this.field134 == 0) {
                     var7 = 1;
                  }

                  int var8;
                  int var9;
                  int var10;
                  byte[] var10000;
                  int var10001;
                  class184 var23;
                  if (var7 > 0) {
                     var8 = var7 - this.field119.field1818;
                     if (var8 > var21) {
                        var8 = var21;
                     }

                     this.field142.method1013(this.field119.field1816, this.field119.field1818, var8);
                     if (this.field121 != 0) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10000 = this.field119.field1816;
                           var10001 = var9 + this.field119.field1818;
                           var10000[var10001] ^= this.field121;
                        }
                     }

                     var23 = this.field119;
                     var23.field1818 += var8;
                     if (this.field119.field1818 < var7) {
                        break;
                     }

                     if (null == this.field127) {
                        this.field119.field1818 = 0;
                        var9 = this.field119.method1125();
                        var10 = this.field119.method1174();
                        int var11 = this.field119.method1125();
                        int var12 = this.field119.method1129();
                        long var13 = (long)(var10 + (var9 << 16));
                        class133 var15 = (class133)this.field123.method709(var13);
                        this.field130 = true;
                        if (null == var15) {
                           var15 = (class133)this.field128.method709(var13);
                           this.field130 = false;
                        }

                        if (null == var15) {
                           throw new IOException();
                        }

                        int var16 = var11 == 0 ? 5 : 9;
                        this.field127 = var15;
                        this.field133 = new class184(var12 + var16 + this.field127.field1566);
                        this.field133.method1114(var11);
                        this.field133.writeInt(var12);
                        this.field134 = 8;
                        this.field119.field1818 = 0;
                     } else if (this.field134 == 0) {
                        if (this.field119.field1816[0] == -1) {
                           this.field134 = 1;
                           this.field119.field1818 = 0;
                        } else {
                           this.field127 = null;
                        }
                     }
                  } else {
                     var8 = this.field133.field1816.length - this.field127.field1566;
                     var9 = 512 - this.field134;
                     if (var9 > var8 - this.field133.field1818) {
                        var9 = var8 - this.field133.field1818;
                     }

                     if (var9 > var21) {
                        var9 = var21;
                     }

                     this.field142.method1013(this.field133.field1816, this.field133.field1818, var9);
                     if (this.field121 != 0) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var10000 = this.field133.field1816;
                           var10001 = var10 + this.field133.field1818;
                           var10000[var10001] ^= this.field121;
                        }
                     }

                     var23 = this.field133;
                     var23.field1818 += var9;
                     this.field134 += var9;
                     if (var8 == this.field133.field1818) {
                        if (16711935L == this.field127.field1078) {
                           this.field122 = this.field133;

                           for(var10 = 0; var10 < 256; ++var10) {
                              class22 var22 = this.field137[var10];
                              if (var22 != null) {
                                 this.method135(var22, var10);
                              }
                           }
                        } else {
                           this.field135.reset();
                           this.field135.update(this.field133.field1816, 0, var8);
                           var10 = (int)this.field135.getValue();
                           if (this.field127.field1564 != var10) {
                              try {
                                 this.field142.method1017();
                              } catch (Exception var18) {
                              }

                              ++this.field118;
                              this.field142 = null;
                              this.field121 = (byte)((int)(Math.random() * 255.0 + 1.0));
                              return false;
                           }

                           this.field118 = 0;
                           this.field141 = 0;
                           this.field127.field1565.method246((int)(this.field127.field1078 & 65535L), this.field133.field1816, 16711680L == (this.field127.field1078 & 16711680L), this.field130);
                        }

                        this.field127.method605();
                        if (this.field130) {
                           --this.field124;
                        } else {
                           --this.field129;
                        }

                        this.field134 = 0;
                        this.field127 = null;
                        this.field133 = null;
                     } else {
                        if (this.field134 != 512) {
                           break;
                        }

                        this.field134 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var19) {
            try {
               this.field142.method1017();
            } catch (Exception var17) {
            }

            ++this.field141;
            this.field142 = null;
            return false;
         }
      }
   }

   public void method133(boolean var1) {
      if (null != this.field142) {
         try {
            class184 var3 = new class184(4);
            var3.method1114(var1 ? 2 : 3);
            var3.method1166(0);
            this.field142.method1015(var3.field1816, 0, 4);
         } catch (IOException var6) {
            try {
               this.field142.method1017();
            } catch (Exception var5) {
            }

            ++this.field141;
            this.field142 = null;
         }

      }
   }

   public void method132(class168 var1, boolean var2) {
      if (null != this.field142) {
         try {
            this.field142.method1017();
         } catch (Exception var8) {
         }

         this.field142 = null;
      }

      this.field142 = var1;
      this.method133(var2);
      this.field119.field1818 = 0;
      this.field127 = null;
      this.field133 = null;
      this.field134 = 0;

      while(true) {
         class133 var4 = (class133)this.field123.method710();
         if (null == var4) {
            while(true) {
               var4 = (class133)this.field128.method710();
               if (var4 == null) {
                  if (this.field121 != 0) {
                     try {
                        class184 var9 = new class184(4);
                        var9.method1114(4);
                        var9.method1114(this.field121);
                        var9.method1155(0);
                        this.field142.method1015(var9.field1816, 0, 4);
                     } catch (IOException var7) {
                        try {
                           this.field142.method1017();
                        } catch (Exception var6) {
                        }

                        ++this.field141;
                        this.field142 = null;
                     }
                  }

                  this.field140 = 0;
                  this.field120 = class80.method713();
                  return;
               }

               this.field125.method1664(var4);
               this.field126.method712(var4, var4.field1078);
               ++this.field136;
               --this.field129;
            }
         }

         this.field132.method712(var4, var4.field1078);
         ++this.field131;
         --this.field124;
      }
   }

   void method134(class22 var1, int var2) {
      if (var1.field212) {
         if (var2 <= this.field138) {
            throw new RuntimeException("");
         }

         if (var2 < this.field139) {
            this.field139 = var2;
         }
      } else {
         if (var2 >= this.field139) {
            throw new RuntimeException("");
         }

         if (var2 > this.field138) {
            this.field138 = var2;
         }
      }

      if (null != this.field122) {
         this.method135(var1, var2);
      } else {
         this.method136((class22)null, 255, 255, 0, (byte)0, true);
         this.field137[var2] = var1;
      }
   }

   void method135(class22 var1, int var2) {
      this.field122.field1818 = 5 + var2 * 8;
      if (this.field122.field1818 >= this.field122.field1816.length) {
         if (var1.field212) {
            var1.method250();
         } else {
            throw new RuntimeException("");
         }
      } else {
         int var4 = this.field122.method1129();
         int var5 = this.field122.method1129();
         var1.method245(var4, var5, (byte)18);
      }
   }

   void method136(class22 var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var8 = (long)((var2 << 16) + var3);
      class133 var10 = (class133)this.field132.method709(var8);
      if (var10 == null) {
         var10 = (class133)this.field123.method709(var8);
         if (null == var10) {
            var10 = (class133)this.field126.method709(var8);
            if (var10 != null) {
               if (var6) {
                  var10.method938();
                  this.field132.method712(var10, var8);
                  --this.field136;
                  ++this.field131;
               }

            } else {
               if (!var6) {
                  var10 = (class133)this.field128.method709(var8);
                  if (null != var10) {
                     return;
                  }
               }

               var10 = new class133();
               var10.field1565 = var1;
               var10.field1564 = var4;
               var10.field1566 = var5;
               if (var6) {
                  this.field132.method712(var10, var8);
                  ++this.field131;
               } else {
                  this.field125.method1666(var10);
                  this.field126.method712(var10, var8);
                  ++this.field136;
               }

            }
         }
      }
   }

   void method139(int var1, int var2) {
      long var4 = (long)(var2 + (var1 << 16));
      class133 var6 = (class133)this.field126.method709(var4);
      if (var6 != null) {
         this.field125.method1664(var6);
      }
   }

   int method141(int var1, int var2) {
      long var4 = (long)(var2 + (var1 << 16));
      return this.field127 != null && var4 == this.field127.field1078 ? 1 + this.field133.field1818 * 99 / (this.field133.field1816.length - this.field127.field1566) : 0;
   }

   public int method140(boolean var1, boolean var2) {
      int var4 = 0;
      if (var1) {
         var4 += this.field124 + this.field131;
      }

      if (var2) {
         var4 += this.field136 + this.field129;
      }

      return var4;
   }

   public void method138() {
      if (this.field142 != null) {
         this.field142.method1017();
      }

   }
}
