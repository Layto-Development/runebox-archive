public class class378 {
   int field2697;
   int field2698 = 0;
   int field2699 = 0;
   int field2700;
   public int[][] field2701;

   public class378(int var1, int var2) {
      this.field2700 = var1;
      this.field2697 = var2;
      this.field2701 = new int[this.field2700][this.field2697];
      this.method1754();
   }

   public void method1754() {
      for(int var2 = 0; var2 < this.field2700; ++var2) {
         for(int var3 = 0; var3 < this.field2697; ++var3) {
            if (var2 != 0 && var3 != 0 && var2 < this.field2700 - 5 && var3 < this.field2697 - 5) {
               this.field2701[var2][var3] = 16777216;
            } else {
               this.field2701[var2][var3] = 16777215;
            }
         }
      }

   }

   public void method1747(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2698;
      var2 -= this.field2699;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method1746(var1, var2, 128);
            this.method1746(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method1746(var1, var2, 2);
            this.method1746(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method1746(var1, var2, 8);
            this.method1746(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method1746(var1, var2, 32);
            this.method1746(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method1746(var1, var2, 1);
            this.method1746(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method1746(var1, var2, 4);
            this.method1746(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method1746(var1, var2, 16);
            this.method1746(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method1746(var1, var2, 64);
            this.method1746(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method1746(var1, var2, 130);
            this.method1746(var1 - 1, var2, 8);
            this.method1746(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method1746(var1, var2, 10);
            this.method1746(var1, var2 + 1, 32);
            this.method1746(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method1746(var1, var2, 40);
            this.method1746(var1 + 1, var2, 128);
            this.method1746(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method1746(var1, var2, 160);
            this.method1746(var1, var2 - 1, 2);
            this.method1746(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method1746(var1, var2, 65536);
               this.method1746(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method1746(var1, var2, 1024);
               this.method1746(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method1746(var1, var2, 4096);
               this.method1746(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method1746(var1, var2, 16384);
               this.method1746(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method1746(var1, var2, 512);
               this.method1746(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method1746(var1, var2, 2048);
               this.method1746(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method1746(var1, var2, 8192);
               this.method1746(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method1746(var1, var2, 32768);
               this.method1746(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method1746(var1, var2, 66560);
               this.method1746(var1 - 1, var2, 4096);
               this.method1746(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method1746(var1, var2, 5120);
               this.method1746(var1, var2 + 1, 16384);
               this.method1746(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method1746(var1, var2, 20480);
               this.method1746(var1 + 1, var2, 65536);
               this.method1746(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method1746(var1, var2, 81920);
               this.method1746(var1, var2 - 1, 1024);
               this.method1746(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method1748(int var1, int var2, int var3, int var4, boolean var5) {
      int var7 = 256;
      if (var5) {
         var7 += 131072;
      }

      var1 -= this.field2698;
      var2 -= this.field2699;

      for(int var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < this.field2700) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field2697) {
                  this.method1746(var8, var9, var7);
               }
            }
         }
      }

   }

   public void method1749(int var1, int var2) {
      var1 -= this.field2698;
      var2 -= this.field2699;
      int[] var10000 = this.field2701[var1];
      var10000[var2] |= 2097152;
   }

   public void method1750(int var1, int var2) {
      var1 -= this.field2698;
      var2 -= this.field2699;
      int[] var10000 = this.field2701[var1];
      var10000[var2] |= 262144;
   }

   void method1746(int var1, int var2, int var3) {
      int[] var10000 = this.field2701[var1];
      var10000[var2] |= var3;
   }

   public void method1751(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2698;
      var2 -= this.field2699;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method1752(var1, var2, 128);
            this.method1752(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method1752(var1, var2, 2);
            this.method1752(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method1752(var1, var2, 8);
            this.method1752(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method1752(var1, var2, 32);
            this.method1752(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method1752(var1, var2, 1);
            this.method1752(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method1752(var1, var2, 4);
            this.method1752(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method1752(var1, var2, 16);
            this.method1752(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method1752(var1, var2, 64);
            this.method1752(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method1752(var1, var2, 130);
            this.method1752(var1 - 1, var2, 8);
            this.method1752(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method1752(var1, var2, 10);
            this.method1752(var1, var2 + 1, 32);
            this.method1752(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method1752(var1, var2, 40);
            this.method1752(var1 + 1, var2, 128);
            this.method1752(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method1752(var1, var2, 160);
            this.method1752(var1, var2 - 1, 2);
            this.method1752(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method1752(var1, var2, 65536);
               this.method1752(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method1752(var1, var2, 1024);
               this.method1752(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method1752(var1, var2, 4096);
               this.method1752(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method1752(var1, var2, 16384);
               this.method1752(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method1752(var1, var2, 512);
               this.method1752(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method1752(var1, var2, 2048);
               this.method1752(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method1752(var1, var2, 8192);
               this.method1752(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method1752(var1, var2, 32768);
               this.method1752(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method1752(var1, var2, 66560);
               this.method1752(var1 - 1, var2, 4096);
               this.method1752(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method1752(var1, var2, 5120);
               this.method1752(var1, var2 + 1, 16384);
               this.method1752(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method1752(var1, var2, 20480);
               this.method1752(var1 + 1, var2, 65536);
               this.method1752(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method1752(var1, var2, 81920);
               this.method1752(var1, var2 - 1, 1024);
               this.method1752(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method1755(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var8 = 256;
      if (var6) {
         var8 += 131072;
      }

      var1 -= this.field2698;
      var2 -= this.field2699;
      int var9;
      if (var5 == 1 || var5 == 3) {
         var9 = var3;
         var3 = var4;
         var4 = var9;
      }

      for(var9 = var1; var9 < var1 + var3; ++var9) {
         if (var9 >= 0 && var9 < this.field2700) {
            for(int var10 = var2; var10 < var2 + var4; ++var10) {
               if (var10 >= 0 && var10 < this.field2697) {
                  this.method1752(var9, var10, var8);
               }
            }
         }
      }

   }

   void method1752(int var1, int var2, int var3) {
      int[] var10000 = this.field2701[var1];
      var10000[var2] &= ~var3;
   }

   public void method1753(int var1, int var2) {
      var1 -= this.field2698;
      var2 -= this.field2699;
      int[] var10000 = this.field2701[var1];
      var10000[var2] &= -262145;
   }

   static class29 method1756() {
      return class215.field1651;
   }
}
