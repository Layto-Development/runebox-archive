public class class366 implements class39 {
   int field2856;
   int field2857;
   int field2858;
   int field2859;
   int field2860;
   int field2861;
   int field2862;
   int field2863;
   int field2864;
   int field2865;

   class366() {
   }

   public void method571(class475 var1) {
      if (var1.field3643 > this.field2863) {
         var1.field3643 = this.field2863;
      }

      if (var1.field3637 < this.field2864) {
         var1.field3637 = this.field2864;
      }

      if (var1.field3645 > this.field2857) {
         var1.field3645 = this.field2857;
      }

      if (var1.field3639 < this.field2856) {
         var1.field3639 = this.field2856;
      }

   }

   public boolean method566(int var1, int var2, int var3) {
      if (var1 >= this.field2862 && var1 < this.field2862 + this.field2865) {
         return var2 >> 6 >= this.field2858 && var2 >> 6 <= this.field2860 && var3 >> 6 >= this.field2859 && var3 >> 6 <= this.field2861;
      } else {
         return false;
      }
   }

   public boolean method567(int var1, int var2) {
      return var1 >> 6 >= this.field2863 && var1 >> 6 <= this.field2864 && var2 >> 6 >= this.field2857 && var2 >> 6 <= this.field2856;
   }

   public int[] method569(int var1, int var2, int var3) {
      if (!this.method566(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2863 * 64 - this.field2858 * 64 + var2, this.field2857 * 64 - this.field2859 * 64 + var3};
         return var5;
      }
   }

   public class89 method570(int var1, int var2) {
      if (!this.method567(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (this.field2858 * 64 - this.field2863 * 64);
         int var5 = var2 + (this.field2859 * 64 - this.field2857 * 64);
         return new class89(this.field2862, var4, var5);
      }
   }

   public void method568(class184 var1) {
      this.field2862 = var1.method1125();
      this.field2865 = var1.method1125();
      this.field2858 = var1.method1174();
      this.field2859 = var1.method1174();
      this.field2860 = var1.method1174();
      this.field2861 = var1.method1174();
      this.field2863 = var1.method1174();
      this.field2857 = var1.method1174();
      this.field2864 = var1.method1174();
      this.field2856 = var1.method1174();
      this.method1853();
   }

   void method1853() {
   }

   static final void method1854() {
      Client.field784 = Client.field578;
      class108.field1440 = true;
   }
}
