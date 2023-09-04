public class class461 extends class151 {
   static class22 field3589;
   static class427[] field3590;
   class251 field3584;
   class412 field3580;
   class412 field3586;
   int field3581;
   int field3582;
   int field3585;
   String field3583;
   String field3587;
   String field3588;

   class461(int var1, String var2, String var3, String var4) {
      this.field3580 = class412.field3161;
      this.field3586 = class412.field3161;
      this.method2255(var1, var2, var3, var4);
   }

   void method2255(int var1, String var2, String var3, String var4) {
      int var6 = ++class194.field1890 - 1;
      this.field3585 = var6;
      this.field3581 = Client.field879;
      this.field3582 = var1;
      this.field3583 = var2;
      this.method2260();
      this.field3587 = var3;
      this.field3588 = var4;
      this.method2253();
      this.method2257();
   }

   void method2253() {
      this.field3580 = class412.field3161;
   }

   final boolean method2258() {
      if (this.field3580 == class412.field3161) {
         this.method2254();
      }

      return this.field3580 == class412.field3160;
   }

   void method2254() {
      this.field3580 = class314.field2562.field2273.method2053(this.field3584) ? class412.field3160 : class412.field3159;
   }

   void method2257() {
      this.field3586 = class412.field3161;
   }

   final boolean method2256() {
      if (class412.field3161 == this.field3586) {
         this.method2259();
      }

      return this.field3586 == class412.field3160;
   }

   void method2259() {
      this.field3586 = class314.field2562.field2272.method2053(this.field3584) ? class412.field3160 : class412.field3159;
   }

   final void method2260() {
      if (this.field3583 != null) {
         this.field3584 = new class251(Client.method480(this.field3583), class121.field1501);
      } else {
         this.field3584 = null;
      }

   }
}
