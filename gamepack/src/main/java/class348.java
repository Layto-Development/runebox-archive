import java.io.IOException;

public class class348 {
   static int field2754;
   boolean field2762 = true;
   class164 field2759 = new class164(40000);
   class168 field2768;
   class184 field2757 = new class184(5000);
   class375 field2755 = null;
   class375 field2760;
   class375 field2766;
   class375 field2767;
   class45 field2763 = new class45();
   int field2756 = 0;
   int field2761 = 0;
   int field2764 = 0;
   int field2765 = 0;
   public class152 field2758;

   class348() {
   }

   final void method1802() {
      this.field2763.method576();
      this.field2756 = 0;
   }

   final void method1796() throws IOException {
      if (this.field2768 != null && this.field2756 > 0) {
         this.field2757.field1818 = 0;

         while(true) {
            class335 var2 = (class335)this.field2763.method583();
            if (null == var2 || var2.field2683 > this.field2757.field1816.length - this.field2757.field1818) {
               this.field2768.method1015(this.field2757.field1816, 0, this.field2757.field1818);
               this.field2764 = 0;
               break;
            }

            this.field2757.method1119(var2.buffer.field1816, 0, var2.field2683);
            this.field2756 -= var2.field2683;
            var2.method605();
            var2.buffer.method1113();
            var2.method1771();
         }
      }

   }

   public final void method1797(class335 var1) {
      this.field2763.method577(var1);
      var1.field2683 = var1.buffer.field1818;
      var1.buffer.field1818 = 0;
      this.field2756 += var1.field2683;
   }

   void method1798(class168 var1) {
      this.field2768 = var1;
   }

   void method1801() {
      if (this.field2768 != null) {
         this.field2768.method1017();
         this.field2768 = null;
      }

   }

   void method1799() {
      this.field2768 = null;
   }

   class168 method1800() {
      return this.field2768;
   }
}
