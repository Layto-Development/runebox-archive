public abstract class class518 extends class496 {
   boolean field4003 = false;
   boolean field4006 = false;
   boolean field4020;
   boolean field4021 = false;
   boolean field4038;
   byte field4013;
   byte field4019;
   byte field4026 = 0;
   byte field4051;
   byte field4061;
   class197 field4064 = new class197(4);
   class423[] field4071 = new class423[10];
   class45 field4032 = new class45();
   int field3998 = 0;
   int field3999;
   int field4000;
   int field4001 = -1;
   int field4002 = 1;
   int field4004 = -1;
   int field4005 = -1;
   int field4007 = -1;
   int field4008 = -1;
   int field4009 = -1;
   int field4011 = -1;
   int field4012 = -1;
   int field4014 = -1;
   int field4015 = -1;
   int field4016 = -1;
   int field4017 = -1;
   int field4018;
   int field4022 = 100;
   int field4023 = 0;
   int field4024 = 0;
   int field4025 = 0;
   int field4028;
   int field4033 = -1;
   int field4034;
   int field4035 = -1;
   int field4036 = -1;
   int field4037 = -1;
   int field4039;
   int field4040 = 0;
   int field4041 = 0;
   int field4042 = 0;
   int field4043 = -1;
   int field4044 = 0;
   int field4045 = 0;
   int field4046 = 0;
   int field4047 = -1;
   int field4048;
   int field4049 = 0;
   int field4050;
   int field4052;
   int field4053 = -1;
   int field4054;
   int field4055;
   int field4056;
   int field4057 = -1;
   int field4058 = 200;
   int field4059 = -1;
   int field4060 = 0;
   int field4062 = 0;
   int field4063 = 0;
   int field4066 = -1;
   int field4067 = 32;
   int field4068 = -1;
   int field4072 = 0;
   int field4074 = -1;
   int[] field4010 = new int[4];
   int[] field4027 = new int[4];
   int[] field4029 = new int[4];
   int[] field4030 = new int[4];
   int[] field4031 = new int[4];
   int[] field4065 = null;
   int[] field4070 = new int[10];
   int[] field4073 = new int[10];
   String field4069 = null;

   class518() {
   }

   final void method2466() {
      this.field4046 = 0;
      this.field4062 = 0;
   }

   boolean method2465() {
      return false;
   }

   final void method2471(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field4029[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class337 var13 = class337.method1784(var1);
         var11 = var13.field2700;
         var12 = var13.field2707;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (var11 == 0) {
            var15 = this.field4029[0];
         } else if (var11 == 1) {
            var15 = this.field4010[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (var11 == 0) {
               if (this.field4029[var14] < var15) {
                  var10 = var14;
                  var15 = this.field4029[var14];
               }
            } else if (var11 == 1 && this.field4010[var14] < var15) {
               var10 = var14;
               var15 = this.field4010[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field4026 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field4026;
            this.field4026 = (byte)((this.field4026 + 1) % 4);
            if (this.field4029[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field4027[var10] = var1;
         this.field4010[var10] = var2;
         this.field4030[var10] = var3;
         this.field4031[var10] = var4;
         this.field4029[var10] = var6 + var5 + var12;
      }
   }

   final void method2467(int var1, int var2, int var3, int var4, int var5, int var6) {
      class316 var9 = (class316)class316.field2569.method1851((long)var1);
      class316 var8;
      if (null != var9) {
         var8 = var9;
      } else {
         byte[] var10 = class316.field2568.method1629(33, var1);
         var9 = new class316();
         var9.field2571 = var1;
         if (null != var10) {
            var9.method1691(new class184(var10));
         }

         class316.field2569.method1850(var9, (long)var1);
         var8 = var9;
      }

      var9 = var8;
      class192 var15 = null;
      class192 var11 = null;
      int var12 = var8.field2573;
      int var13 = 0;

      class192 var14;
      for(var14 = (class192)this.field4032.method583(); null != var14; var14 = (class192)this.field4032.method579()) {
         ++var13;
         if (var9.field2571 == var14.field1879.field2571) {
            var14.method1203(var2 + var4, var5, var6, var3);
            return;
         }

         if (var14.field1879.field2574 <= var9.field2574) {
            var15 = var14;
         }

         if (var14.field1879.field2573 > var12) {
            var11 = var14;
            var12 = var14.field1879.field2573;
         }
      }

      if (var11 != null || var13 < 4) {
         var14 = new class192(var9);
         if (var15 == null) {
            this.field4032.method586(var14);
         } else {
            class45.method584(var14, var15);
         }

         var14.method1203(var2 + var4, var5, var6, var3);
         if (var13 >= 4) {
            var11.method605();
         }

      }
   }

   final void method2472(int var1) {
      class316 var4 = (class316)class316.field2569.method1851((long)var1);
      class316 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class316.field2568.method1629(33, var1);
         var4 = new class316();
         var4.field2571 = var1;
         if (null != var5) {
            var4.method1691(new class184(var5));
         }

         class316.field2569.method1850(var4, (long)var1);
         var3 = var4;
      }

      var4 = var3;

      for(class192 var6 = (class192)this.field4032.method583(); var6 != null; var6 = (class192)this.field4032.method579()) {
         if (var6.field1879 == var4) {
            var6.method605();
            return;
         }
      }

   }

   void method2468(int var1, int var2, int var3, int var4) {
      int var6 = var4 + Client.field879;
      class515 var7 = (class515)this.field4064.method1222((long)var1);
      if (null != var7) {
         var7.method605();
         --this.field4049;
      }

      if (var2 != 65535 && var2 != -1) {
         byte var8 = 0;
         if (var4 > 0) {
            var8 = -1;
         }

         this.field4064.method1226(new class515(var2, var3, var6, var8), (long)var1);
         ++this.field4049;
      }
   }

   class197 method2469() {
      return this.field4064;
   }

   void method2473() {
      class356 var2 = new class356(this.field4064);

      for(class515 var3 = (class515)var2.method1828(); null != var3; var3 = (class515)var2.next()) {
         var3.method605();
      }

      this.field4049 = 0;
   }

   class104 method2470(class104 var1) {
      if (this.field4049 == 0) {
         return var1;
      } else {
         class356 var3 = new class356(this.field4064);
         int var4 = var1.field1404;
         int var5 = var1.field1352;
         int var6 = var1.field1364;
         byte var7 = var1.field1363;

         for(class515 var8 = (class515)var3.method1828(); var8 != null; var8 = (class515)var3.next()) {
            if (var8.field3990 != -1) {
               class104 var9 = class529.method2515(var8.field3993).method2512();
               if (null != var9) {
                  var4 += var9.field1404;
                  var5 += var9.field1352;
                  var6 += var9.field1364;
               }
            }
         }

         class104 var11 = new class104(var4, var5, var6, var7);
         var11.method781(var1);

         for(class515 var12 = (class515)var3.method1828(); var12 != null; var12 = (class515)var3.next()) {
            if (var12.field3990 != -1) {
               class104 var10 = class529.method2515(var12.field3993).method2511(var12.field3990);
               if (var10 != null) {
                  var10.method759(0, -var12.field3991, 0);
                  var11.method781(var10);
               }
            }
         }

         return var11;
      }
   }

   void method2474() {
      this.field4038 = false;
      this.field4035 = -1;
      this.field4036 = -1;
      this.field4037 = -1;
   }
}
