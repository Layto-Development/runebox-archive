public class class540 {
   boolean field4273;
   int field4265;
   int field4266 = 0;
   int field4267;
   int field4268;
   int field4269;
   int field4270;
   int field4271;
   int field4272 = 0;
   int field4274;
   int field4275;
   int field4276;
   int field4277;

   public void method2566(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field4277 = var1;
      this.field4265 = var2;
      this.field4267 = var3;
      this.field4268 = var4;
      this.field4269 = var5;
      this.field4270 = var6;
      this.field4266 = var7;
      this.field4272 = var8;
      this.field4273 = var9;
   }

   public void method2567(int var1, int var2, int var3, int var4) {
      this.field4274 = var1;
      this.field4275 = var2;
      this.field4276 = var3;
      this.field4271 = var4;
   }

   public void method2568(class7 var1, class460 var2, byte var3) {
      if (var2 == null) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }
      } else {
         int var4 = var2.field2423;
         int var5 = Math.min(this.field4268, (int)((float)var4 * 0.9F));
         int var6 = var1.method97(this.field4267);
         int var7 = var1.method98(this.field4268);
         int var8 = this.field4277 - this.field4269 + var6;
         int var9 = this.field4265 - this.field4270 + var7 + var4;
         class156.method961(this.field4277, this.field4265, this.field4277 + this.field4267, this.field4268 + this.field4265);
         int var10 = this.field4272;
         int var11 = this.field4266;
         if (var10 > var11) {
            int var12 = var10;
            var10 = var11;
            var11 = var12;
         }

         class437 var22 = var1.method84(0, var10);
         class437 var13 = var1.method84(var10, var11);
         class437 var14 = var1.method84(var11, var1.method78());
         class437 var15 = var1.method84(0, this.field4266);
         int var17;
         int var19;
         if (!var13.method2143()) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            int var16 = var2.field2427 + var2.field2428;

            for(var17 = 0; var17 < var13.method2144(); ++var17) {
               if (var3 >= -1) {
                  throw new IllegalStateException();
               }

               class530 var18 = var13.method2146(var17);
               var19 = var8 + var18.field4169;
               int var20 = var2.method1595(var18.field4170);
               int var21 = var9 + var18.field4172 - var4;
               class156.method954(var19, var21, var20, var16, this.field4271);
            }
         }

         if (!var22.method2143()) {
            if (var3 >= -1) {
               return;
            }

            var2.method1575(var22, var8, var9, this.field4274, this.field4275, -1);
         }

         if (!var13.method2143()) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            var2.method1575(var13, var8, var9, this.field4276, this.field4275, -1);
         }

         if (!var14.method2143()) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            var2.method1575(var14, var8, var9, this.field4274, this.field4275, -1);
         }

         if (this.field4273) {
            class467 var23 = var15.method2148();
            var17 = var8 + (Integer)var23.field3606;
            int var24 = var9 + (Integer)var23.field3605;
            var19 = var24 - var5;
            class156.method956(var17, var24, var17, var19, this.field4274);
            if (this.field4275 != -1) {
               if (var3 >= -1) {
                  return;
               }

               class156.method956(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field4275);
            }
         }

      }
   }
}
