public class class276 implements class39 {
   int field2353;
   int field2354;
   int field2355;
   int field2356;
   int field2357;
   int field2358;
   int field2359;
   int field2360;
   int field2361;
   int field2362;
   int field2363;
   int field2364;
   int field2365;
   int field2366;

   class276() {
   }

   public void method571(class475 var1) {
      if (var1.field3643 > this.field2357) {
         var1.field3643 = this.field2357;
      }

      if (var1.field3637 < this.field2357) {
         var1.field3637 = this.field2357;
      }

      if (var1.field3645 > this.field2365) {
         var1.field3645 = this.field2365;
      }

      if (var1.field3639 < this.field2365) {
         var1.field3639 = this.field2365;
      }

   }

   public boolean method566(int var1, int var2, int var3) {
      if (var1 >= this.field2353 && var1 < this.field2355 + this.field2353) {
         return var2 >= (this.field2359 << 6) + (this.field2354 << 3) && var2 <= (this.field2361 << 3) + (this.field2359 << 6) + 7 && var3 >= (this.field2360 << 3) + (this.field2363 << 6) && var3 <= (this.field2363 << 6) + (this.field2362 << 3) + 7;
      } else {
         return false;
      }
   }

   public boolean method567(int var1, int var2) {
      return var1 >= (this.field2358 << 3) + (this.field2357 << 6) && var1 <= 7 + (this.field2357 << 6) + (this.field2356 << 3) && var2 >= (this.field2364 << 3) + (this.field2365 << 6) && var2 <= (this.field2365 << 6) + (this.field2366 << 3) + 7;
   }

   public int[] method569(int var1, int var2, int var3) {
      if (!this.method566(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2358 * 8 - this.field2354 * 8 + this.field2357 * 64 - this.field2359 * 64 + var2, var3 + (this.field2365 * 64 - this.field2363 * 64) + (this.field2364 * 8 - this.field2360 * 8)};
         return var5;
      }
   }

   public class89 method570(int var1, int var2) {
      if (!this.method567(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2359 * 64 - this.field2357 * 64 + var1 + (this.field2354 * 8 - this.field2358 * 8);
         int var5 = this.field2363 * 64 - this.field2365 * 64 + var2 + (this.field2360 * 8 - this.field2364 * 8);
         return new class89(this.field2353, var4, var5);
      }
   }

   public void method568(class184 var1) {
      this.field2353 = var1.method1125();
      this.field2355 = var1.method1125();
      this.field2359 = var1.method1174();
      this.field2354 = var1.method1125();
      this.field2361 = var1.method1125();
      this.field2363 = var1.method1174();
      this.field2360 = var1.method1125();
      this.field2362 = var1.method1125();
      this.field2357 = var1.method1174();
      this.field2358 = var1.method1125();
      this.field2356 = var1.method1125();
      this.field2365 = var1.method1174();
      this.field2364 = var1.method1125();
      this.field2366 = var1.method1125();
      this.method1527();
   }

   void method1527() {
   }
}
