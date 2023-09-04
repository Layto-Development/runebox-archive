public class class7 {
   int field42;
   int field45;
   int field46;
   int field47 = 2;
   int field48;
   int field49;
   int field50;
   int field51;
   int field52;
   int[] field43 = new int[2];
   int[] field44 = new int[2];

   class7() {
      this.field43[0] = 0;
      this.field43[1] = 65535;
      this.field44[0] = 0;
      this.field44[1] = 65535;
   }

   final void method53(class366 var1) {
      this.field46 = var1.method1654();
      this.field45 = var1.method1658();
      this.field42 = var1.method1658();
      this.method54(var1);
   }

   final void method54(class366 var1) {
      this.field47 = var1.method1654();
      this.field43 = new int[this.field47];
      this.field44 = new int[this.field47];

      for(int var2 = 0; var2 < this.field47; ++var2) {
         this.field43[var2] = var1.method1703();
         this.field44[var2] = var1.method1703();
      }

   }

   final void method52() {
      this.field49 = 0;
      this.field51 = 0;
      this.field50 = 0;
      this.field48 = 0;
      this.field52 = 0;
   }

   final int method51(int var1) {
      if (this.field52 >= this.field49) {
         this.field48 = this.field44[this.field51++] << 15;
         if (this.field51 >= this.field47) {
            this.field51 = this.field47 - 1;
         }

         this.field49 = (int)((double)this.field43[this.field51] / 65536.0 * (double)var1);
         if (this.field49 > this.field52) {
            this.field50 = ((this.field44[this.field51] << 15) - this.field48) / (this.field49 - this.field52);
         }
      }

      this.field48 += this.field50;
      ++this.field52;
      return this.field48 - this.field50 >> 15;
   }
}
