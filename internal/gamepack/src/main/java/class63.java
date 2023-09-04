public class class63 {
   byte[][][] field1118;
   int field1117;

   class63(int var1) {
      this.field1117 = var1;
   }

   void method647(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field1117 != 0 && null != this.field1118) {
         var8 = this.method641(var8, var7);
         var7 = this.method636(var7);
         class156.method971(var1, var2, var5, var6, var3, var4, this.field1118[var7 - 1][var8], this.field1117, true);
      }
   }

   int method641(int var1, int var2) {
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

   int method636(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method644() {
      if (this.field1118 == null) {
         this.field1118 = new byte[8][4][];
         this.method637();
         this.method643();
         this.method638();
         this.method645();
         this.method640();
         this.method646();
         this.method642();
         this.method639((byte)-68);
      }
   }

   void method637() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[0][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[0][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[0][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[0][3] = var2;
   }

   void method643() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[1][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
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

      this.field1118[1][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[1][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[1][3] = var2;
   }

   void method638() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[2][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[2][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[2][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[2][3] = var2;
   }

   void method645() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[3][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[3][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[3][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[3][3] = var2;
   }

   void method640() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[4][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[4][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[4][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var3 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field1118[4][3] = var2;
   }

   void method646() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      boolean var3 = false;
      var2 = new byte[this.field1117 * this.field1117];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[5][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var4 <= this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[5][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[5][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var4 >= this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[5][3] = var2;
   }

   void method642() {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      boolean var3 = false;
      var2 = new byte[this.field1117 * this.field1117];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4 - this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[6][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 <= var4 - this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[6][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[6][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[6][3] = var2;
   }

   void method639(byte var1) {
      byte[] var2 = new byte[this.field1117 * this.field1117];
      boolean var3 = false;
      var2 = new byte[this.field1117 * this.field1117];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field1117; ++var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var5 >= var4 - this.field1117 / 2) {
               if (var1 >= -1) {
                  return;
               }

               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[7][0] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field1117; ++var5) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            if (var5 >= var4 - this.field1117 / 2) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[7][1] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = this.field1117 - 1; var4 >= 0; --var4) {
         if (var1 >= -1) {
            throw new IllegalStateException();
         }

         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var1 >= -1) {
               return;
            }

            if (var5 >= var4 - this.field1117 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[7][2] = var2;
      var2 = new byte[this.field1117 * this.field1117];
      var6 = 0;

      for(var4 = 0; var4 < this.field1117; ++var4) {
         if (var1 >= -1) {
            throw new IllegalStateException();
         }

         for(var5 = this.field1117 - 1; var5 >= 0; --var5) {
            if (var1 >= -1) {
               throw new IllegalStateException();
            }

            if (var5 >= var4 - this.field1117 / 2) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field1118[7][3] = var2;
   }
}
