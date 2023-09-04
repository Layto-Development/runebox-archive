public class class46 implements class51 {
   int field346;
   int field347;
   int field348;
   int field349;
   int field350;
   int field351;
   int field352;
   int field353;
   int field354;
   int field355;

   class46() {
   }

   public void method223(class456 var1) {
      if (var1.field3585 > this.field350) {
         var1.field3585 = this.field350;
      }

      if (var1.field3579 < this.field350) {
         var1.field3579 = this.field350;
      }

      if (var1.field3587 > this.field351) {
         var1.field3587 = this.field351;
      }

      if (var1.field3581 < this.field351) {
         var1.field3581 = this.field351;
      }

   }

   public boolean method218(int var1, int var2, int var3) {
      if (var1 >= this.field353 && var1 < this.field353 + this.field346) {
         return var2 >= (this.field348 << 3) + (this.field355 << 6) && var2 <= (this.field355 << 6) + (this.field348 << 3) + 7 && var3 >= (this.field349 << 6) + (this.field352 << 3) && var3 <= (this.field349 << 6) + (this.field352 << 3) + 7;
      } else {
         return false;
      }
   }

   public boolean method219(int var1, int var2) {
      return var1 >= (this.field350 << 6) + (this.field347 << 3) && var1 <= (this.field347 << 3) + (this.field350 << 6) + 7 && var2 >= (this.field351 << 6) + (this.field354 << 3) && var2 <= (this.field354 << 3) + (this.field351 << 6) + 7;
   }

   public int[] method221(int var1, int var2, int var3) {
      if (!this.method218(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field350 * 64 - this.field355 * 64) + (this.field347 * 8 - this.field348 * 8), this.field354 * 8 - this.field352 * 8 + this.field351 * 64 - this.field349 * 64 + var3};
         return var5;
      }
   }

   public class113 method222(int var1, int var2) {
      if (!this.method219(var1, var2)) {
         return null;
      } else {
         int var4 = this.field355 * 64 - this.field350 * 64 + var1 + (this.field348 * 8 - this.field347 * 8);
         int var5 = this.field352 * 8 - this.field354 * 8 + var2 + (this.field349 * 64 - this.field351 * 64);
         return new class113(this.field353, var4, var5);
      }
   }

   public void method220(class366 var1) {
      this.field353 = var1.method1654();
      this.field346 = var1.method1654();
      this.field355 = var1.method1703();
      this.field348 = var1.method1654();
      this.field349 = var1.method1703();
      this.field352 = var1.method1654();
      this.field350 = var1.method1703();
      this.field347 = var1.method1654();
      this.field351 = var1.method1703();
      this.field354 = var1.method1654();
      this.method190();
   }

   void method190() {
   }
}
