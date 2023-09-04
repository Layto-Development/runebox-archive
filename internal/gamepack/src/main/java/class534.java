import java.util.zip.CRC32;

public class class534 extends class509 {
   static CRC32 field4232 = new CRC32();
   boolean field4225 = false;
   boolean field4229 = false;
   class29 field4236;
   class340 field4227;
   class340 field4235;
   int field4226;
   int field4228;
   int field4233;
   int field4234 = -1;
   volatile boolean[] field4230;
   volatile int field4231 = 0;

   public class534(class340 var1, class340 var2, class29 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      super(var5, var6);
      this.field4227 = var1;
      this.field4235 = var2;
      this.field4228 = var4;
      this.field4229 = var7;
      this.field4225 = var8;
      this.field4236 = var3;
      this.field4236.method127(this, this.field4228);
   }

   public boolean method2532() {
      return this.field4231 == 1;
   }

   public int method2526() {
      if (1 == this.field4231 || this.field4225 && 2 == this.field4231) {
         return 100;
      } else if (super.field4070 != null) {
         return 99;
      } else {
         int var2 = this.field4236.method134(255, this.field4228);
         if (var2 >= 100) {
            var2 = 99;
         }

         return var2;
      }
   }

   void method2440(int var1) {
      this.field4236.method132(this.field4228, var1);
   }

   void method2432(int var1) {
      if (null != this.field4227 && null != this.field4230 && this.field4230[var1]) {
         class340 var3 = this.field4227;
         byte[] var5 = null;
         synchronized(class160.field1020) {
            for(class437 var7 = (class437)class160.field1020.method1991(); null != var7; var7 = (class437)class160.field1020.method1993()) {
               if ((long)var1 == var7.field531 && var7.field3473 == var3 && 0 == var7.field3472) {
                  var5 = var7.field3471;
                  break;
               }
            }
         }

         if (var5 != null) {
            this.method2535(var3, var1, var5, true);
         } else {
            byte[] var6 = var3.method1585(var1);
            this.method2535(var3, var1, var6, true);
         }
      } else {
         this.field4236.method129(this, this.field4228, var1, super.field4065[var1], (byte)2, true);
      }

   }

   void method2531() {
      this.field4231 = 2;
      super.field4076 = new int[0];
      super.field4065 = new int[0];
      super.field4066 = new int[0];
      super.field4067 = new int[0];
      super.field4063 = new int[0][];
      super.field4070 = new Object[0];
      super.field4072 = new Object[0][];
   }

   void method2527(int var1, int var2, byte var3) {
      this.field4226 = var1;
      this.field4233 = var2;
      if (this.field4235 != null) {
         if (var3 == -1) {
            throw new IllegalStateException();
         }

         int var4 = this.field4228;
         class340 var5 = this.field4235;
         byte[] var7 = null;
         synchronized(class160.field1020) {
            for(class437 var9 = (class437)class160.field1020.method1991(); null != var9; var9 = (class437)class160.field1020.method1993()) {
               if (var9.field531 == (long)var4) {
                  if (var3 == -1) {
                     throw new IllegalStateException();
                  }

                  if (var5 == var9.field3473) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var9.field3472 == 0) {
                        if (var3 == -1) {
                           throw new IllegalStateException();
                        }

                        var7 = var9.field3471;
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

            this.method2535(var5, var4, var7, true);
         } else {
            byte[] var8 = var5.method1585(var4);
            this.method2535(var5, var4, var8, true);
         }
      } else {
         this.field4236.method129(this, 255, this.field4228, this.field4226, (byte)0, true);
      }

   }

   void method2528(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (1 == this.field4231) {
            throw new RuntimeException();
         }

         if (null != this.field4235) {
            int var6 = this.field4228;
            class340 var7 = this.field4235;
            class437 var8 = new class437();
            var8.field3472 = 0;
            var8.field531 = (long)var6;
            var8.field3471 = var2;
            var8.field3473 = var7;
            synchronized(class160.field1020) {
               class160.field1020.method1995(var8);
            }

            class160.method613();
         }

         this.method2445(var2);
         this.method2533();
      } else {
         var2[var2.length - 2] = (byte)(super.field4066[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field4066[var1];
         if (null != this.field4227) {
            class340 var14 = this.field4227;
            class437 var16 = new class437();
            var16.field3472 = 0;
            var16.field531 = (long)var1;
            var16.field3471 = var2;
            var16.field3473 = var14;
            synchronized(class160.field1020) {
               class160.field1020.method1995(var16);
            }

            class160.method613();
            this.field4230[var1] = true;
         }

         if (var4) {
            Object[] var15 = super.field4070;
            Object var17;
            if (var2 == null) {
               var17 = null;
            } else if (var2.length > 136) {
               class26 var9 = new class26();
               var9.method290(var2);
               var17 = var9;
            } else {
               var17 = var2;
            }

            var15[var1] = var17;
         }
      }

   }

   public void method2535(class340 var1, int var2, byte[] var3, boolean var4) {
      int var6;
      if (var1 == this.field4235) {
         if (1 == this.field4231) {
            throw new RuntimeException();
         } else if (null == var3) {
            this.field4236.method129(this, 255, this.field4228, this.field4226, (byte)0, true);
         } else {
            field4232.reset();
            field4232.update(var3, 0, var3.length);
            var6 = (int)field4232.getValue();
            if (var6 != this.field4226) {
               this.field4236.method129(this, 255, this.field4228, this.field4226, (byte)0, true);
            } else {
               class366 var12 = new class366(class509.method2450(var3));
               int var13 = var12.method1654();
               if (var13 != 5 && var13 != 6) {
                  throw new RuntimeException(var13 + "," + this.field4228 + "," + var2);
               } else {
                  int var9 = 0;
                  if (var13 >= 6) {
                     var9 = var12.method1658();
                  }

                  if (this.field4233 != var9) {
                     this.field4236.method129(this, 255, this.field4228, this.field4226, (byte)0, true);
                  } else {
                     this.method2445(var3);
                     this.method2533();
                  }
               }
            }
         }
      } else {
         if (!var4 && this.field4234 == var2) {
            this.field4231 = 1;
         }

         if (null != var3 && var3.length > 2) {
            field4232.reset();
            field4232.update(var3, 0, var3.length - 2);
            var6 = (int)field4232.getValue();
            int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var6 == super.field4065[var2] && super.field4066[var2] == var7) {
               this.field4230[var2] = true;
               if (var4) {
                  Object[] var8 = super.field4070;
                  Object var10;
                  if (var3 == null) {
                     var10 = null;
                  } else if (var3.length > 136) {
                     class26 var11 = new class26();
                     var11.method290(var3);
                     var10 = var11;
                  } else {
                     var10 = var3;
                  }

                  var8[var2] = var10;
               }

            } else {
               this.field4230[var2] = false;
               if (this.field4229 || var4) {
                  this.field4236.method129(this, this.field4228, var2, super.field4065[var2], (byte)2, var4);
               }

            }
         } else {
            this.field4230[var2] = false;
            if (this.field4229 || var4) {
               this.field4236.method129(this, this.field4228, var2, super.field4065[var2], (byte)2, var4);
            }

         }
      }
   }

   void method2533() {
      this.field4230 = new boolean[super.field4070.length];

      int var2;
      for(var2 = 0; var2 < this.field4230.length; ++var2) {
         this.field4230[var2] = false;
      }

      if (null == this.field4227) {
         this.field4231 = 1;
      } else {
         this.field4234 = -1;

         for(var2 = 0; var2 < this.field4230.length; ++var2) {
            if (super.field4067[var2] > 0) {
               class160.method615(var2, this.field4227, this);
               this.field4234 = var2;
            }
         }

         if (-1 == this.field4234) {
            this.field4231 = 1;
         }

      }
   }

   int method2428(int var1) {
      if (null != super.field4070[var1]) {
         return 100;
      } else {
         return this.field4230[var1] ? 100 : this.field4236.method134(this.field4228, var1);
      }
   }

   public boolean method2529(int var1) {
      return this.field4230[var1];
   }

   public boolean method2530(int var1) {
      return this.method2433(var1) != null;
   }

   public int method2534() {
      int var2 = 0;
      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < super.field4070.length; ++var4) {
         if (super.field4067[var4] > 0) {
            var2 += 100;
            var3 += this.method2428(var4);
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
