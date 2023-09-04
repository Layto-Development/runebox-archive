public class class437 {
   static int field3324;
   class7 field3321;
   int field3322 = 0;
   int field3323 = 0;

   class437(class7 var1, int var2, int var3) {
      this.field3321 = var1;
      this.field3322 = var2;
      this.field3323 = var3;
   }

   public String method2142() {
      if (this.method2143()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method2144());

         for(int var3 = this.field3322; var3 < this.field3323; ++var3) {
            class530 var4 = this.field3321.method93(var3);
            var2.append(var4.field4170);
         }

         return var2.toString();
      }
   }

   boolean method2149(int var1) {
      return this.field3321.method96() == 2 || this.field3321.method96() == 1 && (!this.field3321.field102 || var1 != this.field3323 - 1);
   }

   public boolean method2143() {
      return this.field3322 == this.field3323;
   }

   public int method2144() {
      return this.field3323 - this.field3322;
   }

   boolean method2145(class530 var1) {
      if (this.field3321.field104 == 2) {
         return true;
      } else if (this.field3321.field104 == 0) {
         return false;
      } else {
         return this.field3321.method75() != var1;
      }
   }

   int method2147() {
      if (this.method2143()) {
         return 0;
      } else {
         class530 var2 = this.field3321.method93(this.field3323 - 1);
         if (var2.field4170 == '\n') {
            return 0;
         } else if (this.method2145(var2)) {
            return this.field3321.field101.field2426[42];
         } else {
            int var3 = this.field3321.field101.field2426[var2.field4170];
            if (var3 == 0) {
               return var2.field4170 == '\t' ? 3 * this.field3321.field101.field2426[32] : this.field3321.field101.field2426[32];
            } else {
               return var3;
            }
         }
      }
   }

   public class467 method2148() {
      if (this.method2143()) {
         return new class467(0, 0);
      } else {
         class530 var2 = this.field3321.method93(this.field3323 - 1);
         return new class467(var2.field4169 + this.method2147(), var2.field4172);
      }
   }

   public class530 method2146(int var1) {
      return var1 >= 0 && var1 < this.method2144() ? this.field3321.method93(this.field3322 + var1) : null;
   }
}
