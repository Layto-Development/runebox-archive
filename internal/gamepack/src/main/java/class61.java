public class class61 {
   static int field480;
   class499 field477;
   int field478 = 0;
   int field479 = 0;

   class61(class499 var1, int var2, int var3) {
      this.field477 = var1;
      this.field478 = var2;
      this.field479 = var3;
   }

   public String method256() {
      if (this.method257()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method258());

         for(int var3 = this.field478; var3 < this.field479; ++var3) {
            class325 var4 = this.field477.method2364(var3);
            var2.append(var4.field2431);
         }

         return var2.toString();
      }
   }

   boolean method263(int var1) {
      return this.field477.method2367() == 2 || this.field477.method2367() == 1 && (!this.field477.field3995 || var1 != this.field479 - 1);
   }

   public boolean method257() {
      return this.field478 == this.field479;
   }

   public int method258() {
      return this.field479 - this.field478;
   }

   boolean method259(class325 var1) {
      if (2 == this.field477.field3997) {
         return true;
      } else if (this.field477.field3997 == 0) {
         return false;
      } else {
         return this.field477.method2346() != var1;
      }
   }

   int method261() {
      if (this.method257()) {
         return 0;
      } else {
         class325 var2 = this.field477.method2364(this.field479 - 1);
         if (var2.field2431 == '\n') {
            return 0;
         } else if (this.method259(var2)) {
            return this.field477.field3994.field2949[42];
         } else {
            int var3 = this.field477.field3994.field2949[var2.field2431];
            if (var3 == 0) {
               return var2.field2431 == '\t' ? 3 * this.field477.field3994.field2949[32] : this.field477.field3994.field2949[32];
            } else {
               return var3;
            }
         }
      }
   }

   public class510 method262() {
      if (this.method257()) {
         return new class510(0, 0);
      } else {
         class325 var2 = this.field477.method2364(this.field479 - 1);
         return new class510(var2.field2430 + this.method261(), var2.field2433);
      }
   }

   public class325 method260(int var1) {
      return var1 >= 0 && var1 < this.method258() ? this.field477.method2364(this.field478 + var1) : null;
   }
}
