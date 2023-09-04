public class class426 {
   int field3324 = 0;
   int field3326 = 0;
   int field3327 = 0;
   int field3328 = 0;
   long field3320 = -1L;
   long field3321 = -1L;
   long field3322 = 0L;
   long field3323 = 0L;
   long field3329 = 0L;
   public boolean field3325 = false;

   public void method1954() {
      this.field3321 = class123.method471();
   }

   public void method1959() {
      if (-1L != this.field3321) {
         this.field3323 = class123.method471() - this.field3321;
         this.field3321 = -1L;
      }

   }

   public void method1955(int var1) {
      this.field3320 = class123.method471();
      this.field3324 = var1;
   }

   public void method1956() {
      if (-1L != this.field3320) {
         this.field3322 = class123.method471() - this.field3320;
         this.field3320 = -1L;
      }

      ++this.field3327;
      this.field3325 = true;
   }

   public void method1957() {
      this.field3325 = false;
      this.field3326 = 0;
   }

   public void method1953() {
      this.method1956();
   }

   public void method1958(class366 var1) {
      method1960(var1, this.field3323);
      method1960(var1, this.field3322);
      method1960(var1, this.field3329);
      var1.method1684(this.field3324);
      var1.method1684(this.field3326);
      var1.method1684(this.field3327);
      var1.method1684(this.field3328);
   }

   static void method1960(class366 var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.method1684((int)var1);
   }
}
