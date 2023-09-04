public class class114 implements class39 {
   int field1464;
   int field1465;
   int field1466;
   int field1467;
   int field1468;
   int field1469;
   int field1470;
   int field1471;
   int field1472;
   int field1473;

   class114() {
   }

   public void method571(class475 var1) {
      if (var1.field3643 > this.field1468) {
         var1.field3643 = this.field1468;
      }

      if (var1.field3637 < this.field1468) {
         var1.field3637 = this.field1468;
      }

      if (var1.field3645 > this.field1469) {
         var1.field3645 = this.field1469;
      }

      if (var1.field3639 < this.field1469) {
         var1.field3639 = this.field1469;
      }

   }

   public boolean method566(int var1, int var2, int var3) {
      if (var1 >= this.field1471 && var1 < this.field1471 + this.field1464) {
         return var2 >= (this.field1466 << 3) + (this.field1473 << 6) && var2 <= (this.field1473 << 6) + (this.field1466 << 3) + 7 && var3 >= (this.field1467 << 6) + (this.field1470 << 3) && var3 <= (this.field1467 << 6) + (this.field1470 << 3) + 7;
      } else {
         return false;
      }
   }

   public boolean method567(int var1, int var2) {
      return var1 >= (this.field1468 << 6) + (this.field1465 << 3) && var1 <= (this.field1465 << 3) + (this.field1468 << 6) + 7 && var2 >= (this.field1469 << 6) + (this.field1472 << 3) && var2 <= (this.field1472 << 3) + (this.field1469 << 6) + 7;
   }

   public int[] method569(int var1, int var2, int var3) {
      if (!this.method566(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field1468 * 64 - this.field1473 * 64) + (this.field1465 * 8 - this.field1466 * 8), this.field1472 * 8 - this.field1470 * 8 + this.field1469 * 64 - this.field1467 * 64 + var3};
         return var5;
      }
   }

   public class89 method570(int var1, int var2) {
      if (!this.method567(var1, var2)) {
         return null;
      } else {
         int var4 = this.field1473 * 64 - this.field1468 * 64 + var1 + (this.field1466 * 8 - this.field1465 * 8);
         int var5 = this.field1470 * 8 - this.field1472 * 8 + var2 + (this.field1467 * 64 - this.field1469 * 64);
         return new class89(this.field1471, var4, var5);
      }
   }

   public void method568(class184 var1) {
      this.field1471 = var1.method1125();
      this.field1464 = var1.method1125();
      this.field1473 = var1.method1174();
      this.field1466 = var1.method1125();
      this.field1467 = var1.method1174();
      this.field1470 = var1.method1125();
      this.field1468 = var1.method1174();
      this.field1465 = var1.method1125();
      this.field1469 = var1.method1174();
      this.field1472 = var1.method1125();
      this.method815();
   }

   void method815() {
   }
}
