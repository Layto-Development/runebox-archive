import java.util.Random;

public class class503 {
   static int[] field4024;
   static int[] field4030 = new int['\u8000'];
   static int[] field4031;
   static int[] field4032;
   static int[] field4034;
   static int[] field4035;
   static int[] field4036;
   static int[] field4037;
   class164 field4025;
   class7 field4014;
   class7 field4015;
   class7 field4017;
   class7 field4018;
   class7 field4019;
   class7 field4021;
   class7 field4022;
   class7 field4026;
   class7 field4033;
   int field4020 = 500;
   int field4023 = 0;
   int field4027 = 100;
   int field4028 = 0;
   int[] field4013 = new int[]{0, 0, 0, 0, 0};
   int[] field4016 = new int[]{0, 0, 0, 0, 0};
   int[] field4029 = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field4030[var1] = (var0.nextInt() & 2) - 1;
      }

      field4031 = new int['\u8000'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field4031[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      field4035 = new int[220500];
      field4032 = new int[5];
      field4034 = new int[5];
      field4037 = new int[5];
      field4036 = new int[5];
      field4024 = new int[5];
   }

   class503() {
   }

   final int[] method2395(int var1, int var2) {
      class6.method50(field4035, 0, var1);
      if (var2 < 10) {
         return field4035;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0);
         this.field4022.method52();
         this.field4033.method52();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field4014 != null) {
            this.field4014.method52();
            this.field4015.method52();
            var5 = (int)((double)(this.field4014.field42 - this.field4014.field45) * 32.768 / var3);
            var6 = (int)((double)this.field4014.field45 * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field4021 != null) {
            this.field4021.method52();
            this.field4017.method52();
            var8 = (int)((double)(this.field4021.field42 - this.field4021.field45) * 32.768 / var3);
            var9 = (int)((double)this.field4021.field45 * 32.768 / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field4016[var11] != 0) {
               field4032[var11] = 0;
               field4034[var11] = (int)((double)this.field4029[var11] * var3);
               field4037[var11] = (this.field4016[var11] << 14) / 100;
               field4036[var11] = (int)((double)(this.field4022.field42 - this.field4022.field45) * 32.768 * Math.pow(1.0057929410678534, (double)this.field4013[var11]) / var3);
               field4024[var11] = (int)((double)this.field4022.field45 * 32.768 / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field4022.method51(var1);
            var13 = this.field4033.method51(var1);
            if (this.field4014 != null) {
               var14 = this.field4014.method51(var1);
               var15 = this.field4015.method51(var1);
               var12 += this.method2397(var7, var15, this.field4014.field46) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field4021 != null) {
               var14 = this.field4021.method51(var1);
               var15 = this.field4017.method51(var1);
               var13 = var13 * ((this.method2397(var10, var15, this.field4021.field46) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field4016[var14] != 0) {
                  var15 = var11 + field4034[var14];
                  if (var15 < var1) {
                     var10000 = field4035;
                     var10000[var15] += this.method2397(field4032[var14], var13 * field4037[var14] >> 15, this.field4022.field46);
                     var10000 = field4032;
                     var10000[var14] += (var12 * field4036[var14] >> 16) + field4024[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field4018 != null) {
            this.field4018.method52();
            this.field4019.method52();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field4018.method51(var1);
               var16 = this.field4019.method51(var1);
               if (var20) {
                  var12 = this.field4018.field45 + ((this.field4018.field42 - this.field4018.field45) * var15 >> 8);
               } else {
                  var12 = this.field4018.field45 + ((this.field4018.field42 - this.field4018.field45) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field4035[var14] = 0;
               }
            }
         }

         if (this.field4023 > 0 && this.field4027 > 0) {
            var11 = (int)((double)this.field4023 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = field4035;
               var10000[var12] += field4035[var12 - var11] * this.field4027 / 100;
            }
         }

         if (this.field4025.field1053[0] > 0 || this.field4025.field1053[1] > 0) {
            this.field4026.method52();
            var11 = this.field4026.method51(var1 + 1);
            var12 = this.field4025.method630(0, (float)var11 / 65536.0F);
            var13 = this.field4025.method630(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field4035[var14 + var12] * (long)class164.field1056 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field4035[var14 + var12 - 1 - var17] * (long)class164.field1050[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field4035[var14 - 1 - var17] * (long)class164.field1050[1][var17] >> 16);
                  }

                  field4035[var14] = var16;
                  var11 = this.field4026.method51(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field4035[var14 + var12] * (long)class164.field1056 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field4035[var14 + var12 - 1 - var18] * (long)class164.field1050[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field4035[var14 - 1 - var18] * (long)class164.field1050[1][var18] >> 16);
                     }

                     field4035[var14] = var17;
                     var11 = this.field4026.method51(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field4035[var14 + var12 - 1 - var18] * (long)class164.field1050[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field4035[var14 - 1 - var18] * (long)class164.field1050[1][var18] >> 16);
                        }

                        field4035[var14] = var17;
                        this.field4026.method51(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field4025.method630(0, (float)var11 / 65536.0F);
                  var13 = this.field4025.method630(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field4035[var11] < -32768) {
               field4035[var11] = -32768;
            }

            if (field4035[var11] > 32767) {
               field4035[var11] = 32767;
            }
         }

         return field4035;
      }
   }

   final int method2397(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field4031[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field4030[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method2396(class366 var1) {
      this.field4022 = new class7();
      this.field4022.method53(var1);
      this.field4033 = new class7();
      this.field4033.method53(var1);
      int var2 = var1.method1654();
      if (var2 != 0) {
         --var1.field2652;
         this.field4014 = new class7();
         this.field4014.method53(var1);
         this.field4015 = new class7();
         this.field4015.method53(var1);
      }

      var2 = var1.method1654();
      if (var2 != 0) {
         --var1.field2652;
         this.field4021 = new class7();
         this.field4021.method53(var1);
         this.field4017 = new class7();
         this.field4017.method53(var1);
      }

      var2 = var1.method1654();
      if (var2 != 0) {
         --var1.field2652;
         this.field4018 = new class7();
         this.field4018.method53(var1);
         this.field4019 = new class7();
         this.field4019.method53(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method1701();
         if (var4 == 0) {
            break;
         }

         this.field4016[var3] = var4;
         this.field4013[var3] = var1.method1665();
         this.field4029[var3] = var1.method1701();
      }

      this.field4023 = var1.method1701();
      this.field4027 = var1.method1701();
      this.field4020 = var1.method1703();
      this.field4028 = var1.method1703();
      this.field4025 = new class164();
      this.field4026 = new class7();
      this.field4025.method626(var1, this.field4026);
   }
}
