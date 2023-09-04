public final class class364 {
   class151 field2855 = new class151();
   class197 field2854;
   class361 field2852 = new class361();
   int field2851;
   int field2853;

   public class364(int var1) {
      this.field2851 = var1;
      this.field2853 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.field2854 = new class197(var2);
   }

   public class151 method1851(long var1) {
      class151 var3 = (class151)this.field2854.method1222(var1);
      if (var3 != null) {
         this.field2852.method1839(var3);
      }

      return var3;
   }

   public void method1849(long var1) {
      class151 var3 = (class151)this.field2854.method1222(var1);
      if (var3 != null) {
         var3.method605();
         var3.method938();
         ++this.field2853;
      }

   }

   public void method1850(class151 var1, long var2) {
      if (this.field2853 == 0) {
         class151 var4 = this.field2852.method1841();
         var4.method605();
         var4.method938();
         if (var4 == this.field2855) {
            var4 = this.field2852.method1841();
            var4.method605();
            var4.method938();
         }
      } else {
         --this.field2853;
      }

      this.field2854.method1226(var1, var2);
      this.field2852.method1839(var1);
   }

   public void method1848() {
      this.field2852.method1845();
      this.field2854.method1223();
      this.field2855 = new class151();
      this.field2853 = this.field2851;
   }
}
