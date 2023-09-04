public final class class484 extends class165 {
   boolean field3807;
   class464 field3831;
   double field3817;
   double field3822;
   double field3823;
   double field3824;
   double field3825;
   double field3826;
   double field3827;
   double field3829;
   int field3805;
   int field3806;
   int field3808;
   int field3809;
   int field3810;
   int field3811;
   int field3812;
   int field3813;
   int field3814;
   int field3815;
   int field3816;
   int field3818;
   int field3819;
   int field3820;
   int field3821;
   int field3828;
   int field3830;
   int field3832;
   int field3833;

   class484(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field3807 = false;
      this.field3832 = 0;
      this.field3833 = 0;
      this.field3818 = var1;
      this.field3806 = var2;
      this.field3816 = var3;
      this.field3805 = var4;
      this.field3814 = var5;
      this.field3830 = var6;
      this.field3815 = var7;
      this.field3808 = var8;
      this.field3820 = var9;
      this.field3819 = var10;
      this.field3810 = var11;
      this.field3807 = false;
      int var12 = class163.method625(this.field3818).field1039;
      if (var12 != -1) {
         this.field3831 = class464.method2200(var12);
      } else {
         this.field3831 = null;
      }

   }

   class484(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
      this.field3821 = var10;
   }

   final void method2287(int var1, int var2, int var3, int var4) {
      this.field3811 = var1;
      this.field3812 = var2;
      this.field3813 = var3;
      double var6;
      if (!this.field3807) {
         var6 = (double)(this.field3811 - this.field3816);
         double var8 = (double)(this.field3812 - this.field3805);
         double var10 = Math.sqrt(var6 * var6 + var8 * var8);
         this.field3829 = (double)this.field3816 + (double)this.field3820 * var6 / var10;
         this.field3822 = (double)this.field3805 + (double)this.field3820 * var8 / var10;
         this.field3823 = (double)this.field3814;
      }

      var6 = (double)(this.field3815 + 1 - var4);
      this.field3824 = ((double)this.field3811 - this.field3829) / var6;
      this.field3825 = ((double)this.field3812 - this.field3822) / var6;
      this.field3826 = Math.sqrt(this.field3825 * this.field3825 + this.field3824 * this.field3824);
      if (!this.field3807) {
         this.field3827 = -this.field3826 * Math.tan((double)this.field3808 * 0.02454369);
      }

      this.field3817 = ((double)this.field3813 - this.field3823 - this.field3827 * var6) * 2.0 / (var6 * var6);
   }

   final void method2288(int var1) {
      this.field3807 = true;
      this.field3829 += this.field3824 * (double)var1;
      this.field3822 += (double)var1 * this.field3825;
      this.field3823 += this.field3817 * 0.5 * (double)var1 * (double)var1 + (double)var1 * this.field3827;
      this.field3827 += this.field3817 * (double)var1;
      this.field3809 = (int)(Math.atan2(this.field3824, this.field3825) * 325.949) + 1024 & 2047;
      this.field3828 = (int)(Math.atan2(this.field3827, this.field3826) * 325.949) & 2047;
      if (this.field3831 != null) {
         if (!this.field3831.method2199()) {
            this.field3833 += var1;

            while(true) {
               do {
                  do {
                     if (this.field3833 <= this.field3831.field3685[this.field3832]) {
                        return;
                     }

                     this.field3833 -= this.field3831.field3685[this.field3832];
                     ++this.field3832;
                  } while(this.field3832 < this.field3831.field3674.length);

                  this.field3832 -= this.field3831.field3678;
               } while(this.field3832 >= 0 && this.field3832 < this.field3831.field3674.length);

               this.field3832 = 0;
            }
         } else {
            this.field3832 += var1;
            int var3 = this.field3831.method2196();
            if (this.field3832 >= var3) {
               this.field3832 = var3 - this.field3831.field3678;
            }
         }
      }

   }

   protected final class485 method632() {
      class163 var2 = class163.method625(this.field3818);
      class485 var3 = var2.method621(this.field3832);
      if (null == var3) {
         return null;
      } else {
         var3.method2313(this.field3828);
         return var3;
      }
   }
}
