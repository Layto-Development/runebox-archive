public final class class522 extends class518 {
   static class22 field4124;
   boolean field4113;
   boolean field4115;
   boolean field4121;
   class104 field4108;
   class229 field4096;
   class251 field4112;
   class412 field4103;
   class412 field4118;
   class412 field4119;
   int field4095;
   int field4097 = -1;
   int field4098 = -1;
   int field4100;
   int field4101;
   int field4102;
   int field4104;
   int field4105;
   int field4106;
   int field4107;
   int field4109;
   int field4110;
   int field4111;
   int field4114;
   int field4116;
   int field4117;
   int field4120;
   int field4122;
   int field4123;
   String[] field4099 = new String[3];

   class522() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field4099[var1] = "";
      }

      this.field4101 = 0;
      this.field4109 = 0;
      this.field4104 = 0;
      this.field4114 = 0;
      this.field4113 = false;
      this.field4122 = 0;
      this.field4115 = false;
      this.field4118 = class412.field3161;
      this.field4119 = class412.field3161;
      this.field4103 = class412.field3161;
      this.field4121 = false;
   }

   final void method2476(class184 var1) {
      var1.field1818 = 0;
      int var3 = var1.method1125();
      boolean var4 = true;
      this.field4097 = var1.method1126();
      this.field4098 = var1.method1126();
      int var5 = -1;
      this.field4122 = 0;
      int[] var6 = new int[12];

      int var8;
      int var9;
      int var10;
      for(int var7 = 0; var7 < 12; ++var7) {
         var8 = var1.method1125();
         if (var8 == 0) {
            var6[var7] = 0;
         } else {
            var9 = var1.method1125();
            var6[var7] = var9 + (var8 << 8);
            if (var7 == 0 && var6[0] == 65535) {
               var5 = var1.method1174();
               break;
            }

            if (var6[var7] >= 512) {
               var10 = class71.method682(var6[var7] - 512).field1185;
               if (var10 != 0) {
                  this.field4122 = var10;
               }
            }
         }
      }

      int[] var28 = null;
      if (Client.field758 >= 213) {
         var28 = new int[12];

         for(var8 = 0; var8 < 12; ++var8) {
            var9 = var1.method1125();
            if (var9 == 0) {
               var28[var8] = 0;
            } else {
               var10 = var1.method1125();
               var28[var8] = var10 + (var9 << 8);
            }
         }
      }

      int[] var29 = new int[5];

      for(var9 = 0; var9 < 5; ++var9) {
         var10 = var1.method1125();
         if (var10 < 0 || var10 >= class527.field4149[var9].length) {
            var10 = 0;
         }

         var29[var9] = var10;
      }

      super.field4004 = var1.method1174();
      if (super.field4004 == 65535) {
         super.field4004 = -1;
      }

      super.field4005 = var1.method1174();
      if (super.field4005 == 65535) {
         super.field4005 = -1;
      }

      super.field4066 = super.field4005;
      super.field4007 = var1.method1174();
      if (super.field4007 == 65535) {
         super.field4007 = -1;
      }

      super.field4008 = var1.method1174();
      if (super.field4008 == 65535) {
         super.field4008 = -1;
      }

      super.field4009 = var1.method1174();
      if (super.field4009 == 65535) {
         super.field4009 = -1;
      }

      super.field4057 = var1.method1174();
      if (super.field4057 == 65535) {
         super.field4057 = -1;
      }

      super.field4068 = var1.method1174();
      if (super.field4068 == 65535) {
         super.field4068 = -1;
      }

      this.field4112 = new class251(var1.method1133(), class121.field1501);
      this.method2478();
      this.method2481();
      this.method2489();
      if (this == class259.field2281) {
         class340.field2720 = this.field4112.method1458();
      }

      this.field4101 = var1.method1125();
      this.field4109 = var1.method1174();
      this.field4115 = var1.method1125() == 1;
      if (Client.field601 == 0 && Client.field664 >= 2) {
         this.field4115 = false;
      }

      class136[] var30 = null;
      boolean var31 = false;
      int var11 = var1.method1174();
      var31 = (var11 >> 15 & 1) == 1;
      int var12;
      if (var11 > 0 && var11 != 32768) {
         var30 = new class136[12];

         for(var12 = 0; var12 < 12; ++var12) {
            int var13 = var11 >> 12 - var12 & 1;
            if (var13 == 1) {
               int var17 = var6[var12] - 512;
               int var18 = var1.method1125();
               boolean var19 = (var18 & 1) != 0;
               boolean var20 = (var18 & 2) != 0;
               class136 var21 = new class136(var17);
               int var22;
               int[] var23;
               boolean var24;
               int var25;
               short var26;
               if (var19) {
                  var22 = var1.method1125();
                  var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                  var24 = null != var21.field1572 && var23.length == var21.field1572.length;

                  for(var25 = 0; var25 < 2; ++var25) {
                     if (var23[var25] != 15) {
                        var26 = (short)var1.method1174();
                        if (var24) {
                           var21.field1572[var23[var25]] = var26;
                        }
                     }
                  }
               }

               if (var20) {
                  var22 = var1.method1125();
                  var23 = new int[]{var22 & 15, var22 >> 4 & 15};
                  var24 = var21.field1573 != null && var21.field1573.length == var23.length;

                  for(var25 = 0; var25 < 2; ++var25) {
                     if (var23[var25] != 15) {
                        var26 = (short)var1.method1174();
                        if (var24) {
                           var21.field1573[var23[var25]] = var26;
                        }
                     }
                  }
               }

               var30[var12] = var21;
            }
         }
      }

      for(var12 = 0; var12 < 3; ++var12) {
         this.field4099[var12] = var1.method1133();
      }

      int var27 = var1.method1125();
      if (this.field4096 == null) {
         this.field4096 = new class229();
      }

      this.field4096.method1385(var28, var6, var30, var31, var29, var3, var5, var27);
   }

   boolean method2477() {
      if (class412.field3161 == this.field4118) {
         this.method2479();
      }

      return this.field4118 == class412.field3160;
   }

   void method2478() {
      this.field4118 = class412.field3161;
   }

   void method2479() {
      this.field4118 = class314.field2562.method1490(this.field4112) ? class412.field3160 : class412.field3159;
   }

   boolean method2480() {
      if (class412.field3161 == this.field4119) {
         this.method2484();
      }

      return class412.field3160 == this.field4119;
   }

   void method2481() {
      this.field4119 = class412.field3161;
   }

   void method2484() {
      this.field4119 = null != class59.field1089 && class59.field1089.method2053(this.field4112) ? class412.field3160 : class412.field3159;
   }

   void method2483() {
      for(int var2 = 0; var2 < 4; ++var2) {
         if (Client.field820[var2] != null && Client.field820[var2].method150(this.field4112.method1458()) != -1 && var2 != 2) {
            this.field4103 = class412.field3160;
            return;
         }
      }

      this.field4103 = class412.field3159;
   }

   void method2489() {
      this.field4103 = class412.field3161;
   }

   boolean method2486() {
      if (this.field4103 == class412.field3161) {
         this.method2483();
      }

      return this.field4103 == class412.field3160;
   }

   int method2482() {
      return null != this.field4096 && this.field4096.field2113 != -1 ? class453.method2242(this.field4096.field2113).field3515 : 1;
   }

   protected final class104 method2401() {
      if (null == this.field4096) {
         return null;
      } else {
         class157 var2 = super.field4043 != -1 && super.field4060 == 0 ? class157.method984(super.field4043) : null;
         class157 var3 = super.field4011 != -1 && !this.field4113 && (super.field4004 != super.field4011 || var2 == null) ? class157.method984(super.field4011) : null;
         class104 var4 = this.field4096.method1396(var2, super.field4044, var3, super.field3998);
         if (null == var4) {
            return null;
         } else {
            var4.method758();
            super.field4058 = var4.field3926;
            int var5 = var4.field1352;
            if (!this.field4113) {
               var4 = this.method2470(var4);
            }

            if (!this.field4113 && this.field4108 != null) {
               if (Client.field879 >= this.field4114) {
                  this.field4108 = null;
               }

               if (Client.field879 >= this.field4104 && Client.field879 < this.field4114) {
                  class104 var6 = this.field4108;
                  var6.method759(this.field4105 - super.field4028, this.field4106 - this.field4102, this.field4107 - super.field3999);
                  if (super.field4039 == 512) {
                     var6.method768();
                     var6.method768();
                     var6.method768();
                  } else if (super.field4039 == 1024) {
                     var6.method768();
                     var6.method768();
                  } else if (super.field4039 == 1536) {
                     var6.method768();
                  }

                  class104[] var7 = new class104[]{var4, var6};
                  var4 = new class104(var7, 2);
                  if (super.field4039 == 512) {
                     var6.method768();
                  } else if (super.field4039 == 1024) {
                     var6.method768();
                     var6.method768();
                  } else if (super.field4039 == 1536) {
                     var6.method768();
                     var6.method768();
                     var6.method768();
                  }

                  var6.method759(super.field4028 - this.field4105, this.field4102 - this.field4106, super.field3999 - this.field4107);
               }
            }

            var4.field1353 = true;
            if (super.field4051 != 0 && Client.field879 >= super.field4059 && Client.field879 < super.field4001) {
               var4.field1408 = super.field4061;
               var4.field1378 = super.field4019;
               var4.field1376 = super.field4013;
               var4.field1414 = super.field4051;
               var4.field1415 = (short)var5;
            } else {
               var4.field1414 = 0;
            }

            return var4;
         }
      }
   }

   final void method2488(int var1, int var2, class423 var3) {
      if (super.field4043 != -1 && class157.method984(super.field4043).field1677 == 1) {
         super.field4043 = -1;
      }

      this.method2474();
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field4073[0] >= 0 && super.field4073[0] < 104 && super.field4070[0] >= 0 && super.field4070[0] < 104) {
            if (class423.field3207 == var3) {
               class522 var5 = this;
               class423 var6 = class423.field3207;
               int var7 = super.field4073[0];
               int var8 = super.field4070[0];
               int var9 = this.method2482();
               if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
                  int var11 = this.method2482();
                  class326 var12 = Client.method513(var1, var2);
                  class278 var13 = Client.field651[this.field4116];
                  int[] var14 = Client.field877;
                  int[] var15 = Client.field878;
                  int var10 = class377.method1881(var7, var8, var11, var12, var13, true, var14, var15, class377.field3054[0]);
                  int var16 = var10;
                  if (var10 >= 1) {
                     for(int var17 = 0; var17 < var16 - 1; ++var17) {
                        var5.method2487(Client.field877[var17], Client.field878[var17], var6);
                     }
                  }
               }
            }

            this.method2487(var1, var2, var3);
         } else {
            this.method2485(var1, var2);
         }
      } else {
         this.method2485(var1, var2);
      }

   }

   void method2485(int var1, int var2) {
      super.field4046 = 0;
      super.field4062 = 0;
      super.field4072 = 0;
      super.field4073[0] = var1;
      super.field4070[0] = var2;
      int var4 = this.method2482();
      super.field4028 = 128 * super.field4073[0] + var4 * 64;
      super.field3999 = 128 * super.field4070[0] + var4 * 64;
   }

   final void method2487(int var1, int var2, class423 var3) {
      if (super.field4046 < 9) {
         ++super.field4046;
      }

      for(int var5 = super.field4046; var5 > 0; --var5) {
         super.field4073[var5] = super.field4073[var5 - 1];
         super.field4070[var5] = super.field4070[var5 - 1];
         super.field4071[var5] = super.field4071[var5 - 1];
      }

      super.field4073[0] = var1;
      super.field4070[0] = var2;
      super.field4071[0] = var3;
   }

   final boolean method2465() {
      return null != this.field4096;
   }
}
