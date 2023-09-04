public class class13 {
   boolean field192;
   int field184;
   int field185 = 0;
   int field186;
   int field187;
   int field188;
   int field189;
   int field190;
   int field191 = 0;
   int field193;
   int field194;
   int field195;
   int field196;

   public void method80(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.field196 = var1;
      this.field184 = var2;
      this.field186 = var3;
      this.field187 = var4;
      this.field188 = var5;
      this.field189 = var6;
      this.field185 = var7;
      this.field191 = var8;
      this.field192 = var9;
   }

   public void method81(int var1, int var2, int var3, int var4) {
      this.field193 = var1;
      this.field194 = var2;
      this.field195 = var3;
      this.field190 = var4;
   }

   public void method82(class499 var1, class396 var2, byte var3) {
      if (var2 == null) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }
      } else {
         int var4 = var2.field2946;
         int var5 = Math.min(this.field187, (int)((float)var4 * 0.9F));
         int var6 = var1.method2368(this.field186);
         int var7 = var1.method2369(this.field187);
         int var8 = this.field196 - this.field188 + var6;
         int var9 = this.field184 - this.field189 + var7 + var4;
         class427.method1975(this.field196, this.field184, this.field196 + this.field186, this.field187 + this.field184);
         int var10 = this.field191;
         int var11 = this.field185;
         if (var10 > var11) {
            int var12 = var10;
            var10 = var11;
            var11 = var12;
         }

         class61 var22 = var1.method2355(0, var10);
         class61 var13 = var1.method2355(var10, var11);
         class61 var14 = var1.method2355(var11, var1.method2349());
         class61 var15 = var1.method2355(0, this.field185);
         int var17;
         int var19;
         if (!var13.method257()) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            int var16 = var2.field2950 + var2.field2951;

            for(var17 = 0; var17 < var13.method258(); ++var17) {
               if (var3 >= -1) {
                  throw new IllegalStateException();
               }

               class325 var18 = var13.method260(var17);
               var19 = var8 + var18.field2430;
               int var20 = var2.method1944(var18.field2431);
               int var21 = var9 + var18.field2433 - var4;
               class427.method1968(var19, var21, var20, var16, this.field190);
            }
         }

         if (!var22.method257()) {
            if (var3 >= -1) {
               return;
            }

            var2.method1924(var22, var8, var9, this.field193, this.field194, -1);
         }

         if (!var13.method257()) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            var2.method1924(var13, var8, var9, this.field195, this.field194, -1);
         }

         if (!var14.method257()) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            var2.method1924(var14, var8, var9, this.field193, this.field194, -1);
         }

         if (this.field192) {
            class510 var23 = var15.method262();
            var17 = var8 + (Integer)var23.field4081;
            int var24 = var9 + (Integer)var23.field4080;
            var19 = var24 - var5;
            class427.method1970(var17, var24, var17, var19, this.field193);
            if (-1 != this.field194) {
               if (var3 >= -1) {
                  return;
               }

               class427.method1970(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field194);
            }
         }

      }
   }
}
