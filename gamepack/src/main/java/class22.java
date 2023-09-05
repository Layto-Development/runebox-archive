import java.util.zip.CRC32;

public class class22 extends class298 {
   static CRC32 field219 = new CRC32();
   boolean field212 = false;
   boolean field216 = false;
   class14 field223;
   class347 field214;
   class347 field222;
   int field213;
   int field215;
   int field220;
   int field221 = -1;
   volatile boolean[] field217;
   volatile int field218 = 0;

   public class22(class347 var1, class347 var2, class14 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      super(var5, var6);
      this.field214 = var1;
      this.field222 = var2;
      this.field215 = var4;
      this.field216 = var7;
      this.field212 = var8;
      this.field223 = var3;
      this.field223.method134(this, this.field215);
   }

   public boolean method251() {
      return this.field218 == 1;
   }

   public int method242() {
      if (this.field218 == 1 || this.field212 && this.field218 == 2) {
         return 100;
      } else if (super.field2491 != null) {
         return 99;
      } else {
         int var2 = this.field223.method141(255, this.field215);
         if (var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   void method1647(int var1) {
      this.field223.method139(this.field215, var1);
   }

   void method1639(int var1) {
      if (null != this.field214 && null != this.field217 && this.field217[var1]) {
         class347 var3 = this.field214;
         byte[] var5 = null;
         synchronized(class407.field3146) {
            for(class301 var7 = (class301)class407.field3146.method1236(); null != var7; var7 = (class301)class407.field3146.method1238()) {
               if ((long)var1 == var7.field1078 && var7.field2513 == var3 && var7.field2512 == 0) {
                  var5 = var7.field2511;
                  break;
               }
            }
         }

         if (var5 != null) {
            this.method254(var3, var1, var5, true);
         } else {
            byte[] var6 = var3.method1793(var1);
            this.method254(var3, var1, var6, true);
         }
      } else {
         this.field223.method136(this, this.field215, var1, super.field2486[var1], (byte)2, true);
      }

   }

   void method250() {
      this.field218 = 2;
      super.field2497 = new int[0];
      super.field2486 = new int[0];
      super.field2487 = new int[0];
      super.field2488 = new int[0];
      super.field2484 = new int[0][];
      super.field2491 = new Object[0];
      super.field2493 = new Object[0][];
   }

   void method245(int var1, int var2, byte var3) {
      this.field213 = var1;
      this.field220 = var2;
      if (this.field222 != null) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         int var4 = this.field215;
         class347 var5 = this.field222;
         byte[] var7 = null;
         synchronized(class407.field3146) {
            for(class301 var9 = (class301)class407.field3146.method1236(); null != var9; var9 = (class301)class407.field3146.method1238()) {
               if (var9.field1078 == (long)var4) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  if (var5 == var9.field2513) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var9.field2512 == 0) {
                        if (var3 == -1) {
                           throw new IllegalStateException();
                        }

                        var7 = var9.field2511;
                        break;
                     }
                  }
               }
            }
         }

         if (null != var7) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            this.method254(var5, var4, var7, true);
         } else {
            byte[] var8 = var5.method1793(var4);
            this.method254(var5, var4, var8, true);
         }
      } else {
         this.field223.method136(this, 255, this.field215, this.field213, (byte)0, true);
      }

   }

   void method246(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field218 == 1) {
            throw new RuntimeException();
         }

         if (null != this.field222) {
            int var6 = this.field215;
            class347 var7 = this.field222;
            class301 var8 = new class301();
            var8.field2512 = 0;
            var8.field1078 = (long)var6;
            var8.field2511 = var2;
            var8.field2513 = var7;
            synchronized(class407.field3146) {
               class407.field3146.method1240(var8);
            }

            class407.method1978();
         }

         this.method1652(var2);
         this.method252();
      } else {
         var2[var2.length - 2] = (byte)(super.field2487[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field2487[var1];
         if (null != this.field214) {
            class347 var14 = this.field214;
            class301 var16 = new class301();
            var16.field2512 = 0;
            var16.field1078 = (long)var1;
            var16.field2511 = var2;
            var16.field2513 = var14;
            synchronized(class407.field3146) {
               class407.field3146.method1240(var16);
            }

            class407.method1978();
            this.field217[var1] = true;
         }

         if (var4) {
            Object[] var15 = super.field2491;
            Object var17;
            if (var2 == null) {
               var17 = null;
            } else if (var2.length > 136) {
               class309 var9 = new class309();
               var9.method893(var2);
               var17 = var9;
            } else {
               var17 = var2;
            }

            var15[var1] = var17;
         }
      }

   }

   public void method254(class347 var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if (var1 == this.field222) {
         if (this.field218 == 1) {
            throw new RuntimeException();
         } else if (null == var3) {
            this.field223.method136(this, 255, this.field215, this.field213, (byte)0, true);
         } else {
            field219.reset();
            field219.update(var3, 0, var3.length);
            var6 = (int)field219.getValue();
            if (var6 != this.field213) {
               this.field223.method136(this, 255, this.field215, this.field213, (byte)0, true);
            } else {
               class184 var12 = new class184(class298.method1657(var3));
               int var13 = var12.readUnsignedByte();
               if (var13 != 5 && var13 != 6) {
                  throw new RuntimeException(var13 + "," + this.field215 + "," + var2);
               } else {
                  int var9 = 0;
                  if (var13 >= 6) {
                     var9 = var12.readInt();
                  }

                  if (this.field220 != var9) {
                     this.field223.method136(this, 255, this.field215, this.field213, (byte)0, true);
                  } else {
                     this.method1652(var3);
                     this.method252();
                  }
               }
            }
         }
      } else {
         if (!var4 && this.field221 == var2) {
            this.field218 = 1;
         }

         if (null != var3 && var3.length > 2) {
            field219.reset();
            field219.update(var3, 0, var3.length - 2);
            var6 = (int)field219.getValue();
            int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var6 == super.field2486[var2] && super.field2487[var2] == var7) {
               this.field217[var2] = true;
               if (var4) {
                  Object[] var8 = super.field2491;
                  Object var10;
                  if (var3 == null) {
                     var10 = null;
                  } else if (var3.length > 136) {
                     class309 var11 = new class309();
                     var11.method893(var3);
                     var10 = var11;
                  } else {
                     var10 = var3;
                  }

                  var8[var2] = var10;
               }

            } else {
               this.field217[var2] = false;
               if (this.field216 || var4) {
                  this.field223.method136(this, this.field215, var2, super.field2486[var2], (byte)2, var4);
               }

            }
         } else {
            this.field217[var2] = false;
            if (this.field216 || var4) {
               this.field223.method136(this, this.field215, var2, super.field2486[var2], (byte)2, var4);
            }

         }
      }
   }

   void method252() {
      this.field217 = new boolean[super.field2491.length];

      int var2;
      for(var2 = 0; var2 < this.field217.length; ++var2) {
         this.field217[var2] = false;
      }

      if (null == this.field214) {
         this.field218 = 1;
      } else {
         this.field221 = -1;

         for(var2 = 0; var2 < this.field217.length; ++var2) {
            if (super.field2488[var2] > 0) {
               class407.method1980(var2, this.field214, this);
               this.field221 = var2;
            }
         }

         if (this.field221 == -1) {
            this.field218 = 1;
         }

      }
   }

   int method1635(int var1) {
      if (null != super.field2491[var1]) {
         return 100;
      } else {
         return this.field217[var1] ? 100 : this.field223.method141(this.field215, var1);
      }
   }

   public boolean method247(int var1) {
      return this.field217[var1];
   }

   public boolean method248(int var1) {
      return this.method1640(var1) != null;
   }

   public int method253() {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field2491.length; ++var4) {
         if (super.field2488[var4] > 0) {
            var2 += 100;
            var3 += this.method1635(var4);
         }
      }

      if (var2 == 0) {
         return 100;
      } else {
         var4 = var3 * 100 / var2;
         return var4;
      }
   }
}
