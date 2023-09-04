public final class class245 {
   class306 field1783 = new class306();
   class524 field1782;
   class72 field1780 = new class72();
   int field1779;
   int field1781;

   public class245(int var1) {
      this.field1779 = var1;
      this.field1781 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.field1782 = new class524(var2);
   }

   public class306 method1183(long var1) {
      class306 var3 = (class306)this.field1782.method2509(var1);
      if (var3 != null) {
         this.field1780.method297(var3);
      }

      return var3;
   }

   public void method1181(long var1) {
      class306 var3 = (class306)this.field1782.method2509(var1);
      if (var3 != null) {
         var3.method295();
         var3.method1406();
         ++this.field1781;
      }

   }

   public void method1182(class306 var1, long var2) {
      if (this.field1781 == 0) {
         class306 var4 = this.field1780.method299();
         var4.method295();
         var4.method1406();
         if (var4 == this.field1783) {
            var4 = this.field1780.method299();
            var4.method295();
            var4.method1406();
         }
      } else {
         --this.field1781;
      }

      this.field1782.method2513(var1, var2);
      this.field1780.method297(var1);
   }

   public void method1180() {
      this.field1780.method303();
      this.field1782.method2510();
      this.field1783 = new class306();
      this.field1781 = this.field1779;
   }
}
