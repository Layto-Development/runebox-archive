public class class411 {
   int field2891;
   int field2892;
   int[] field2893;
   int[] field2894;

   class411() {
      class216 var1 = class365.field2624;
      var1.method1100(16);
      this.field2892 = var1.method1101() != 0 ? var1.method1100(4) + 1 : 1;
      if (var1.method1101() != 0) {
         var1.method1100(8);
      }

      var1.method1100(2);
      if (this.field2892 > 1) {
         this.field2891 = var1.method1100(4);
      }

      this.field2893 = new int[this.field2892];
      this.field2894 = new int[this.field2892];

      for(int var2 = 0; var2 < this.field2892; ++var2) {
         var1.method1100(8);
         this.field2893[var2] = var1.method1100(8);
         this.field2894[var2] = var1.method1100(8);
      }

   }
}
