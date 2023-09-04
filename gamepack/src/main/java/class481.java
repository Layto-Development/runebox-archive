public class class481 {
   int field3824 = 0;
   int field3826 = 0;
   int field3827 = 0;
   int field3828 = 0;
   long field3820 = -1L;
   long field3821 = -1L;
   long field3822 = 0L;
   long field3823 = 0L;
   long field3829 = 0L;
   public boolean field3825 = false;

   public void method2361() {
      this.field3821 = class80.method713();
   }

   public void method2366() {
      if (-1L != this.field3821) {
         this.field3823 = class80.method713() - this.field3821;
         this.field3821 = -1L;
      }

   }

   public void method2362(int var1) {
      this.field3820 = class80.method713();
      this.field3824 = var1;
   }

   public void method2363() {
      if (-1L != this.field3820) {
         this.field3822 = class80.method713() - this.field3820;
         this.field3820 = -1L;
      }

      ++this.field3827;
      this.field3825 = true;
   }

   public void method2364() {
      this.field3825 = false;
      this.field3826 = 0;
   }

   public void method2360() {
      this.method2363();
   }

   public void method2365(class184 var1) {
      method2367(var1, this.field3823);
      method2367(var1, this.field3822);
      method2367(var1, this.field3829);
      var1.method1155(this.field3824);
      var1.method1155(this.field3826);
      var1.method1155(this.field3827);
      var1.method1155(this.field3828);
   }

   static void method2367(class184 var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.method1155((int)var1);
   }
}
