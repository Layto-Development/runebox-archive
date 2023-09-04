public final class class86 extends class433 {
   static int field576 = 1;
   static int field583 = 1;
   class350 field581;
   class350 field582;
   class360 field579;
   class90 field577;
   int field578 = 31;
   String field580 = "";

   class86() {
   }

   void method315(String var1) {
      this.field580 = null == var1 ? "" : var1;
   }

   void method316(int var1) {
      this.field578 = var1;
   }

   boolean method317(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field578 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   final String method318() {
      if (!this.field580.isEmpty()) {
         return this.field580;
      } else {
         class90 var2 = this.field577;
         if (var2.field644 != null) {
            var2 = var2.method349();
            if (null == var2) {
               var2 = this.field577;
            }
         }

         return var2.field616;
      }
   }

   final void method319(int var1, class82 var2) {
      int var4 = super.field3448[0];
      int var5 = super.field3445[0];
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

      if (super.field3418 != -1 && class464.method2200(super.field3418).field3688 == 1) {
         super.field3418 = -1;
      }

      if (super.field3421 < 9) {
         ++super.field3421;
      }

      for(int var6 = super.field3421; var6 > 0; --var6) {
         super.field3448[var6] = super.field3448[var6 - 1];
         super.field3445[var6] = super.field3445[var6 - 1];
         super.field3446[var6] = super.field3446[var6 - 1];
      }

      super.field3448[0] = var4;
      super.field3445[0] = var5;
      super.field3446[0] = var2;
   }

   final void method320(int var1, int var2, boolean var3) {
      if (super.field3418 != -1 && class464.method2200(super.field3418).field3688 == 1) {
         super.field3418 = -1;
      }

      if (!var3) {
         int var5 = var1 - super.field3448[0];
         int var6 = var2 - super.field3445[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            if (super.field3421 < 9) {
               ++super.field3421;
            }

            for(int var7 = super.field3421; var7 > 0; --var7) {
               super.field3448[var7] = super.field3448[var7 - 1];
               super.field3445[var7] = super.field3445[var7 - 1];
               super.field3446[var7] = super.field3446[var7 - 1];
            }

            super.field3448[0] = var1;
            super.field3445[0] = var2;
            super.field3446[0] = class82.field561;
            return;
         }
      }

      super.field3421 = 0;
      super.field3437 = 0;
      super.field3447 = 0;
      super.field3448[0] = var1;
      super.field3445[0] = var2;
      super.field3403 = super.field3377 * 64 + 128 * super.field3448[0];
      super.field3374 = super.field3445[0] * 128 + super.field3377 * 64;
   }

   protected final class485 method632() {
      if (this.field577 == null) {
         return null;
      } else {
         class464 var2 = super.field3418 != -1 && 0 == super.field3435 ? class464.method2200(super.field3418) : null;
         class464 var3 = super.field3386 != -1 && (super.field3379 != super.field3386 || var2 == null) ? class464.method2200(super.field3386) : null;
         class485 var4 = null;
         if (this.field581 != null && this.field581.field2574) {
            var4 = class266.field1874.field3494.method1082(var2, super.field3419, var3, super.field3373);
         } else {
            var4 = this.field577.method347(var2, super.field3419, var3, super.field3373, this.field581);
         }

         if (null == var4) {
            return null;
         } else {
            var4.method2293();
            super.field3433 = var4.field1058;
            int var5 = var4.field3842;
            var4 = this.method2022(var4);
            if (1 == this.field577.field617) {
               var4.field3843 = true;
            }

            if (super.field3426 != 0 && Client.field1419 >= super.field3434 && Client.field1419 < super.field3376) {
               var4.field3898 = super.field3436;
               var4.field3868 = super.field3394;
               var4.field3866 = super.field3388;
               var4.field3904 = super.field3426;
               var4.field3905 = (short)var5;
            } else {
               var4.field3904 = 0;
            }

            return var4;
         }
      }
   }

   final boolean method2017() {
      return null != this.field577;
   }

   int[] method323() {
      return null != this.field579 ? this.field579.method1619() : this.field577.method352();
   }

   short[] method330() {
      return this.field579 != null ? this.field579.method1620() : this.field577.method354();
   }

   void method333(int var1, int var2, short var3) {
      if (this.field579 == null) {
         this.field579 = new class360(this.field577);
      }

      this.field579.method1621(var1, var2, var3);
   }

   void method324(int[] var1, short[] var2) {
      if (null == this.field579) {
         this.field579 = new class360(this.field577);
      }

      this.field579.method1622(var1, var2);
   }

   void method325() {
      this.field579 = null;
   }

   void method331(class350 var1) {
      this.field582 = var1;
   }

   class350 method327() {
      return this.field582;
   }

   void method328(class350 var1) {
      this.field581 = var1;
   }

   void method326() {
      this.field582 = null;
   }

   void method329() {
      this.field581 = null;
   }

   static void method332(class64 var0, int var1, int var2) {
      Object[] var4 = var0.field507;
      class283 var5;
      if (class221.method1109(var0.field511)) {
         class241.field1761 = (class192)var4[0];
         class430 var6 = class430.method2005(class241.field1761.field1511);
         var5 = class283.method1303(var0.field511, var6.field3349, var6.field3363);
      } else {
         int var7 = (Integer)var4[0];
         var5 = class283.method1300(var7);
      }

      if (var5 != null) {
         class197.method1023(var0, var5, var1, var2);
      }

   }
}
