public class class500 {
   int field3943;
   int field3944;
   int[] field3945;
   int[] field3946;

   class500() {
      class225 var1 = class223.field2050;
      var1.method1332(16);
      this.field3944 = var1.method1333() != 0 ? var1.method1332(4) + 1 : 1;
      if (var1.method1333() != 0) {
         var1.method1332(8);
      }

      var1.method1332(2);
      if (this.field3944 > 1) {
         this.field3943 = var1.method1332(4);
      }

      this.field3945 = new int[this.field3944];
      this.field3946 = new int[this.field3944];

      for(int var2 = 0; var2 < this.field3944; ++var2) {
         var1.method1332(8);
         this.field3945[var2] = var1.method1332(8);
         this.field3946[var2] = var1.method1332(8);
      }

   }
}
