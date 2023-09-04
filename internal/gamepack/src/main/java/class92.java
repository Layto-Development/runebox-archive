public class class92 implements class39 {
   int field1288;
   int field1289;
   int field1290;
   int field1291;
   int field1292;
   int field1293;

   class92() {
   }

   public void method571(class475 var1) {
      if (var1.field3643 > this.field1293) {
         var1.field3643 = this.field1293;
      }

      if (var1.field3637 < this.field1293) {
         var1.field3637 = this.field1293;
      }

      if (var1.field3645 > this.field1288) {
         var1.field3645 = this.field1288;
      }

      if (var1.field3639 < this.field1288) {
         var1.field3639 = this.field1288;
      }

   }

   public boolean method566(int var1, int var2, int var3) {
      if (var1 >= this.field1290 && var1 < this.field1290 + this.field1292) {
         return this.field1289 == var2 >> 6 && this.field1291 == var3 >> 6;
      } else {
         return false;
      }
   }

   public boolean method567(int var1, int var2) {
      return var1 >> 6 == this.field1293 && var2 >> 6 == this.field1288;
   }

   public int[] method569(int var1, int var2, int var3) {
      if (!this.method566(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field1293 * 64 - this.field1289 * 64 + var2, var3 + (this.field1288 * 64 - this.field1291 * 64)};
         return var5;
      }
   }

   public class89 method570(int var1, int var2) {
      if (!this.method567(var1, var2)) {
         return null;
      } else {
         int var4 = this.field1289 * 64 - this.field1293 * 64 + var1;
         int var5 = this.field1291 * 64 - this.field1288 * 64 + var2;
         return new class89(this.field1290, var4, var5);
      }
   }

   public void method568(class184 var1) {
      this.field1290 = var1.method1125();
      this.field1292 = var1.method1125();
      this.field1289 = var1.method1174();
      this.field1291 = var1.method1174();
      this.field1293 = var1.method1174();
      this.field1288 = var1.method1174();
      this.method725();
   }

   void method725() {
   }
}
