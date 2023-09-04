public class class487 implements class51 {
   int field3910;
   int field3911;
   int field3912;
   int field3913;
   int field3914;
   int field3915;
   int field3916;
   int field3917;
   int field3918;
   int field3919;

   class487() {
   }

   public void method223(class456 var1) {
      if (var1.field3585 > this.field3917) {
         var1.field3585 = this.field3917;
      }

      if (var1.field3579 < this.field3918) {
         var1.field3579 = this.field3918;
      }

      if (var1.field3587 > this.field3911) {
         var1.field3587 = this.field3911;
      }

      if (var1.field3581 < this.field3910) {
         var1.field3581 = this.field3910;
      }

   }

   public boolean method218(int var1, int var2, int var3) {
      if (var1 >= this.field3916 && var1 < this.field3916 + this.field3919) {
         return var2 >> 6 >= this.field3912 && var2 >> 6 <= this.field3914 && var3 >> 6 >= this.field3913 && var3 >> 6 <= this.field3915;
      } else {
         return false;
      }
   }

   public boolean method219(int var1, int var2) {
      return var1 >> 6 >= this.field3917 && var1 >> 6 <= this.field3918 && var2 >> 6 >= this.field3911 && var2 >> 6 <= this.field3910;
   }

   public int[] method221(int var1, int var2, int var3) {
      if (!this.method218(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field3917 * 64 - this.field3912 * 64 + var2, this.field3911 * 64 - this.field3913 * 64 + var3};
         return var5;
      }
   }

   public class113 method222(int var1, int var2) {
      if (!this.method219(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (this.field3912 * 64 - this.field3917 * 64);
         int var5 = var2 + (this.field3913 * 64 - this.field3911 * 64);
         return new class113(this.field3916, var4, var5);
      }
   }

   public void method220(class366 var1) {
      this.field3916 = var1.method1654();
      this.field3919 = var1.method1654();
      this.field3912 = var1.method1703();
      this.field3913 = var1.method1703();
      this.field3914 = var1.method1703();
      this.field3915 = var1.method1703();
      this.field3917 = var1.method1703();
      this.field3911 = var1.method1703();
      this.field3918 = var1.method1703();
      this.field3910 = var1.method1703();
      this.method2325();
   }

   void method2325() {
   }

   static final void method2326() {
      Client.field1324 = Client.field1118;
      class178.field1438 = true;
   }
}
