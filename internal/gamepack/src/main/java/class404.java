public class class404 extends class321 {
   int field2807;
   public boolean field2811;
   public byte[] field2808;
   public int field2809;
   public int field2810;

   class404(int var1, byte[] var2, int var3, int var4) {
      this.field2810 = var1;
      this.field2808 = var2;
      this.field2809 = var3;
      this.field2807 = var4;
   }

   class404(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field2810 = var1;
      this.field2808 = var2;
      this.field2809 = var3;
      this.field2807 = var4;
      this.field2811 = var5;
   }

   public class404 method1829(class399 var1) {
      this.field2808 = var1.method1821(this.field2808);
      this.field2810 = var1.method1822(this.field2810);
      if (this.field2809 == this.field2807) {
         this.field2809 = this.field2807 = var1.method1820(this.field2809);
      } else {
         this.field2809 = var1.method1820(this.field2809);
         this.field2807 = var1.method1820(this.field2807);
         if (this.field2809 == this.field2807) {
            --this.field2809;
         }
      }

      return this;
   }
}
