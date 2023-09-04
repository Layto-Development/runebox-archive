public class class14 {
   byte[][][] field198;
   int field197;

   class14(int var1) {
      this.field197 = var1;
   }

   void method94(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field197 != 0 && null != this.field198) {
         var8 = this.method88(var8, var7);
         var7 = this.method83(var7);
         class427.method1985(var1, var2, var5, var6, var3, var4, this.field198[var7 - 1][var8], this.field197, true);
      }
   }

   int method88(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   int method83(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method91() {
      if (this.field198 == null) {
         this.field198 = new byte[8][4][];
         this.method84();
         this.method90();
         this.method85();
         this.method92();
         this.method87();
         this.method93();
         this.method89();
         this.method86((byte)-68);
      }
   }

   void method84() {
      byte[] var2 = new byte[this.field197 * this.field197];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[0][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[0][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[0][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[0][3] = var2;
   }

   void method90() {
      byte[] var2 = new byte[this.field197 * this.field197];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[1][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field198[1][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[1][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[1][3] = var2;
   }

   void method85() {
      byte[] var2 = new byte[this.field197 * this.field197];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[2][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[2][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[2][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[2][3] = var2;
   }

   void method92() {
      byte[] var2 = new byte[this.field197 * this.field197];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[3][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[3][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[3][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[3][3] = var2;
   }

   void method87() {
      byte[] var2 = new byte[this.field197 * this.field197];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[4][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[4][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[4][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var3 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field198[4][3] = var2;
   }

   void method93() {
      byte[] var2 = new byte[this.field197 * this.field197];
      boolean var3 = false;
      var2 = new byte[this.field197 * this.field197];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[5][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var4 <= this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[5][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[5][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var4 >= this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[5][3] = var2;
   }

   void method89() {
      byte[] var2 = new byte[this.field197 * this.field197];
      boolean var3 = false;
      var2 = new byte[this.field197 * this.field197];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4 - this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[6][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 <= var4 - this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[6][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[6][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[6][3] = var2;
   }

   void method86(byte var1) {
      byte[] var2 = new byte[this.field197 * this.field197];
      boolean var3 = false;
      var2 = new byte[this.field197 * this.field197];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field197; ++var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var5 >= var4 - this.field197 / 2) {
               if (var1 >= -1) {
                  return;
               }

               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[7][0] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field197; ++var5) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            if (var5 >= var4 - this.field197 / 2) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[7][1] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = this.field197 - 1; var4 >= 0; --var4) {
         if (var1 >= -1) {
            throw new IllegalStateException();
         }

         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var1 >= -1) {
               return;
            }

            if (var5 >= var4 - this.field197 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[7][2] = var2;
      var2 = new byte[this.field197 * this.field197];
      var6 = 0;

      for(var4 = 0; var4 < this.field197; ++var4) {
         if (var1 >= -1) {
            throw new IllegalStateException();
         }

         for(var5 = this.field197 - 1; var5 >= 0; --var5) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            if (var5 >= var4 - this.field197 / 2) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field198[7][3] = var2;
   }
}
