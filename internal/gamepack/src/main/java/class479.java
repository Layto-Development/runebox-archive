import java.io.IOException;

public class class479 {
   static int field3777;
   boolean field3785 = true;
   class324 field3778 = null;
   class324 field3783;
   class324 field3789;
   class324 field3790;
   class331 field3791;
   class366 field3780 = new class366(5000);
   class435 field3782 = new class435(40000);
   class457 field3786 = new class457();
   int field3779 = 0;
   int field3784 = 0;
   int field3787 = 0;
   int field3788 = 0;
   public class421 field3781;

   class479() {
   }

   final void method2259() {
      this.field3786.method2137();
      this.field3779 = 0;
   }

   final void method2253() throws IOException {
      if (this.field3791 != null && this.field3779 > 0) {
         this.field3780.field2652 = 0;

         while(true) {
            class53 var2 = (class53)this.field3786.method2144();
            if (null == var2 || var2.field432 > this.field3780.field2650.length - this.field3780.field2652) {
               this.field3791.method1559(this.field3780.field2650, 0, this.field3780.field2652);
               this.field3787 = 0;
               break;
            }

            this.field3780.method1648(var2.field435.field2650, 0, var2.field432);
            this.field3779 -= var2.field432;
            var2.method295();
            var2.field435.method1642();
            var2.method224();
         }
      }

   }

   public final void method2254(class53 var1) {
      this.field3786.method2138(var1);
      var1.field432 = var1.field435.field2652;
      var1.field435.field2652 = 0;
      this.field3779 += var1.field432;
   }

   void method2255(class331 var1) {
      this.field3791 = var1;
   }

   void method2258() {
      if (this.field3791 != null) {
         this.field3791.method1561();
         this.field3791 = null;
      }

   }

   void method2256() {
      this.field3791 = null;
   }

   class331 method2257() {
      return this.field3791;
   }
}
