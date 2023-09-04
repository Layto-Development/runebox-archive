public class class98 implements class51 {
   int field670;
   int field671;
   int field672;
   int field673;
   int field674;
   int field675;

   class98() {
   }

   public void method223(class456 var1) {
      if (var1.field3585 > this.field675) {
         var1.field3585 = this.field675;
      }

      if (var1.field3579 < this.field675) {
         var1.field3579 = this.field675;
      }

      if (var1.field3587 > this.field670) {
         var1.field3587 = this.field670;
      }

      if (var1.field3581 < this.field670) {
         var1.field3581 = this.field670;
      }

   }

   public boolean method218(int var1, int var2, int var3) {
      if (var1 >= this.field672 && var1 < this.field672 + this.field674) {
         return this.field671 == var2 >> 6 && this.field673 == var3 >> 6;
      } else {
         return false;
      }
   }

   public boolean method219(int var1, int var2) {
      return var1 >> 6 == this.field675 && var2 >> 6 == this.field670;
   }

   public int[] method221(int var1, int var2, int var3) {
      if (!this.method218(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field675 * 64 - this.field671 * 64 + var2, var3 + (this.field670 * 64 - this.field673 * 64)};
         return var5;
      }
   }

   public class113 method222(int var1, int var2) {
      if (!this.method219(var1, var2)) {
         return null;
      } else {
         int var4 = this.field671 * 64 - this.field675 * 64 + var1;
         int var5 = this.field673 * 64 - this.field670 * 64 + var2;
         return new class113(this.field672, var4, var5);
      }
   }

   public void method220(class366 var1) {
      this.field672 = var1.method1654();
      this.field674 = var1.method1654();
      this.field671 = var1.method1703();
      this.field673 = var1.method1703();
      this.field675 = var1.method1703();
      this.field670 = var1.method1703();
      this.method373();
   }

   void method373() {
   }
}
