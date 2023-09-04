public class class477 implements class214 {
   class409[] field3774;
   class429 field3775 = new class429();
   class509 field3772;
   double field3773 = 1.0;
   int field3770;
   int field3771 = 0;
   int field3776 = 128;

   public class477(class509 var1, class509 var2, int var3, double var4, int var6) {
      this.field3772 = var2;
      this.field3770 = var3;
      this.field3771 = this.field3770;
      this.field3773 = var4;
      this.field3776 = var6;
      int[] var7 = var1.method2433(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.field3774 = new class409[var1.method2448(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            class366 var10 = new class366(var1.method2422(0, var7[var9]));
            this.field3774[var7[var9]] = new class409(var10);
         }
      } else {
         this.field3774 = new class409[0];
      }

   }

   public int method2249() {
      if (this.field3774.length == 0) {
         return 100;
      } else {
         int var2 = 0;
         int var3 = 0;
         class409[] var4 = this.field3774;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class409 var6 = var4[var5];
            if (var6 != null && var6.field2879 != null) {
               var2 += var6.field2879.length;
               int[] var7 = var6.field2879;

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  int var9 = var7[var8];
                  if (this.field3772.method2425(var9)) {
                     ++var3;
                  }
               }
            }
         }

         if (var2 == 0) {
            return 0;
         } else {
            return var3 * 100 / var2;
         }
      }
   }

   public void method2250(double var1) {
      this.field3773 = var1;
      this.method2252();
   }

   public int[] method1099(int var1) {
      class409 var3 = this.field3774[var1];
      if (null != var3) {
         if (var3.field2885 != null) {
            this.field3775.method1996(var3);
            var3.field2884 = true;
            return var3.field2885;
         }

         boolean var4 = var3.method1892(this.field3773, this.field3776, this.field3772);
         if (var4) {
            if (this.field3771 == 0) {
               class409 var5 = (class409)this.field3775.method1990();
               var5.method1890();
            } else {
               --this.field3771;
            }

            this.field3775.method1996(var3);
            var3.field2884 = true;
            return var3.field2885;
         }
      }

      return null;
   }

   public int method1096(int var1) {
      return this.field3774[var1] != null ? this.field3774[var1].field2877 : 0;
   }

   public boolean method1098(int var1) {
      return this.field3774[var1].field2878;
   }

   public boolean method1097(int var1) {
      return 64 == this.field3776;
   }

   public void method2252() {
      for(int var2 = 0; var2 < this.field3774.length; ++var2) {
         if (null != this.field3774[var2]) {
            this.field3774[var2].method1890();
         }
      }

      this.field3775 = new class429();
      this.field3771 = this.field3770;
   }

   public void method2251(int var1) {
      for(int var3 = 0; var3 < this.field3774.length; ++var3) {
         class409 var4 = this.field3774[var3];
         if (null != var4 && var4.field2883 != 0 && var4.field2884) {
            var4.method1891(var1);
            var4.field2884 = false;
         }
      }

   }
}
