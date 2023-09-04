public class class190 implements class51 {
   int field1495;
   int field1496;
   int field1497;
   int field1498;
   int field1499;
   int field1500;
   int field1501;
   int field1502;
   int field1503;
   int field1504;
   int field1505;
   int field1506;
   int field1507;
   int field1508;

   class190() {
   }

   public void method223(class456 var1) {
      if (var1.field3585 > this.field1499) {
         var1.field3585 = this.field1499;
      }

      if (var1.field3579 < this.field1499) {
         var1.field3579 = this.field1499;
      }

      if (var1.field3587 > this.field1507) {
         var1.field3587 = this.field1507;
      }

      if (var1.field3581 < this.field1507) {
         var1.field3581 = this.field1507;
      }

   }

   public boolean method218(int var1, int var2, int var3) {
      if (var1 >= this.field1495 && var1 < this.field1497 + this.field1495) {
         return var2 >= (this.field1501 << 6) + (this.field1496 << 3) && var2 <= (this.field1503 << 3) + (this.field1501 << 6) + 7 && var3 >= (this.field1502 << 3) + (this.field1505 << 6) && var3 <= (this.field1505 << 6) + (this.field1504 << 3) + 7;
      } else {
         return false;
      }
   }

   public boolean method219(int var1, int var2) {
      return var1 >= (this.field1500 << 3) + (this.field1499 << 6) && var1 <= 7 + (this.field1499 << 6) + (this.field1498 << 3) && var2 >= (this.field1506 << 3) + (this.field1507 << 6) && var2 <= (this.field1507 << 6) + (this.field1508 << 3) + 7;
   }

   public int[] method221(int var1, int var2, int var3) {
      if (!this.method218(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field1500 * 8 - this.field1496 * 8 + this.field1499 * 64 - this.field1501 * 64 + var2, var3 + (this.field1507 * 64 - this.field1505 * 64) + (this.field1506 * 8 - this.field1502 * 8)};
         return var5;
      }
   }

   public class113 method222(int var1, int var2) {
      if (!this.method219(var1, var2)) {
         return null;
      } else {
         int var4 = this.field1501 * 64 - this.field1499 * 64 + var1 + (this.field1496 * 8 - this.field1500 * 8);
         int var5 = this.field1505 * 64 - this.field1507 * 64 + var2 + (this.field1502 * 8 - this.field1506 * 8);
         return new class113(this.field1495, var4, var5);
      }
   }

   public void method220(class366 var1) {
      this.field1495 = var1.method1654();
      this.field1497 = var1.method1654();
      this.field1501 = var1.method1703();
      this.field1496 = var1.method1654();
      this.field1503 = var1.method1654();
      this.field1505 = var1.method1703();
      this.field1502 = var1.method1654();
      this.field1504 = var1.method1654();
      this.field1499 = var1.method1703();
      this.field1500 = var1.method1654();
      this.field1498 = var1.method1654();
      this.field1507 = var1.method1703();
      this.field1506 = var1.method1654();
      this.field1508 = var1.method1654();
      this.method990();
   }

   void method990() {
   }
}
