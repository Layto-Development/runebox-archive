public final class class433 extends class518 {
   static int field3278 = 1;
   static int field3285 = 1;
   class25 field3281;
   class453 field3279;
   class90 field3283;
   class90 field3284;
   int field3280 = 31;
   String field3282 = "";

   class433() {
   }

   void method2112(String var1) {
      this.field3282 = null == var1 ? "" : var1;
   }

   void method2113(int var1) {
      this.field3280 = var1;
   }

   boolean method2114(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field3280 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   final String method2115() {
      if (!this.field3282.isEmpty()) {
         return this.field3282;
      } else {
         class453 var2 = this.field3279;
         if (var2.field3542 != null) {
            var2 = var2.method2232();
            if (null == var2) {
               var2 = this.field3279;
            }
         }

         return var2.field3514;
      }
   }

   final void method2116(int var1, class423 var2) {
      int var4 = super.field4073[0];
      int var5 = super.field4070[0];
      if (var1 == 0) {
         --var4;
         ++var5;
      }

      if (var1 == 1) {
         ++var5;
      }

      if (var1 == 2) {
         ++var4;
         ++var5;
      }

      if (var1 == 3) {
         --var4;
      }

      if (var1 == 4) {
         ++var4;
      }

      if (var1 == 5) {
         --var4;
         --var5;
      }

      if (var1 == 6) {
         --var5;
      }

      if (var1 == 7) {
         ++var4;
         --var5;
      }

      if (super.field4043 != -1 && class157.method984(super.field4043).field1677 == 1) {
         super.field4043 = -1;
      }

      if (super.field4046 < 9) {
         ++super.field4046;
      }

      for(int var6 = super.field4046; var6 > 0; --var6) {
         super.field4073[var6] = super.field4073[var6 - 1];
         super.field4070[var6] = super.field4070[var6 - 1];
         super.field4071[var6] = super.field4071[var6 - 1];
      }

      super.field4073[0] = var4;
      super.field4070[0] = var5;
      super.field4071[0] = var2;
   }

   final void method2117(int var1, int var2, boolean var3) {
      if (super.field4043 != -1 && class157.method984(super.field4043).field1677 == 1) {
         super.field4043 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.field4073[0];
         int var6 = var2 - super.field4070[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field4046 < 9) {
               ++super.field4046;
            }

            for(int var7 = super.field4046; var7 > 0; --var7) {
               super.field4073[var7] = super.field4073[var7 - 1];
               super.field4070[var7] = super.field4070[var7 - 1];
               super.field4071[var7] = super.field4071[var7 - 1];
            }

            super.field4073[0] = var1;
            super.field4070[0] = var2;
            super.field4071[0] = class423.field3210;
            return;
         }
      }

      super.field4046 = 0;
      super.field4062 = 0;
      super.field4072 = 0;
      super.field4073[0] = var1;
      super.field4070[0] = var2;
      super.field4028 = super.field4002 * 64 + 128 * super.field4073[0];
      super.field3999 = super.field4070[0] * 128 + super.field4002 * 64;
   }

   protected final class104 method2401() {
      if (this.field3279 == null) {
         return null;
      } else {
         class157 var2 = super.field4043 != -1 && super.field4060 == 0 ? class157.method984(super.field4043) : null;
         class157 var3 = super.field4011 != -1 && (super.field4004 != super.field4011 || var2 == null) ? class157.method984(super.field4011) : null;
         class104 var4 = null;
         if (this.field3283 != null && this.field3283.field1281) {
            var4 = class259.field2281.field4096.method1396(var2, super.field4044, var3, super.field3998);
         } else {
            var4 = this.field3279.method2230(var2, super.field4044, var3, super.field3998, this.field3283);
         }

         if (null == var4) {
            return null;
         } else {
            var4.method758();
            super.field4058 = var4.field3926;
            int var5 = var4.field1352;
            var4 = this.method2470(var4);
            if (this.field3279.field3515 == 1) {
               var4.field1353 = true;
            }

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

   final boolean method2465() {
      return null != this.field3279;
   }

   int[] method2120() {
      return null != this.field3281 ? this.field3281.method263() : this.field3279.method2235();
   }

   short[] method2127() {
      return this.field3281 != null ? this.field3281.method264() : this.field3279.method2237();
   }

   void method2130(int var1, int var2, short var3) {
      if (this.field3281 == null) {
         this.field3281 = new class25(this.field3279);
      }

      this.field3281.method265(var1, var2, var3);
   }

   void method2121(int[] var1, short[] var2) {
      if (null == this.field3281) {
         this.field3281 = new class25(this.field3279);
      }

      this.field3281.method266(var1, var2);
   }

   void method2122() {
      this.field3281 = null;
   }

   void method2128(class90 var1) {
      this.field3284 = var1;
   }

   class90 method2124() {
      return this.field3284;
   }

   void method2125(class90 var1) {
      this.field3283 = var1;
   }

   void method2123() {
      this.field3284 = null;
   }

   void method2126() {
      this.field3283 = null;
   }

   static void method2129(class208 var0, int var1, int var2) {
      Object[] var4 = var0.field1954;
      class106 var5;
      if (class345.method1791(var0.field1958)) {
         class126.field1523 = (class64)var4[0];
         class444 var6 = class444.method2173(class126.field1523.field1121);
         var5 = class106.method796(var0.field1958, var6.field3370, var6.field3384);
      } else {
         int var7 = (Integer)var4[0];
         var5 = class106.method793(var7);
      }

      if (var5 != null) {
         class18.method201(var0, var5, var1, var2);
      }

   }
}
