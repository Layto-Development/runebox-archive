public class class192 extends class55 {
   public static int field1882;
   static int field1881;
   static int field1883;
   class316 field1879;
   class45 field1880 = new class45();

   class192(class316 var1) {
      this.field1879 = var1;
   }

   void method1203(int var1, int var2, int var3, int var4) {
      class103 var6 = null;
      int var7 = 0;

      for(class103 var8 = (class103)this.field1880.method583(); var8 != null; var8 = (class103)this.field1880.method579()) {
         ++var7;
         if (var8.field1342 == var1) {
            var8.method753(var1, var2, var3, var4);
            return;
         }

         if (var8.field1342 <= var1) {
            var6 = var8;
         }
      }

      if (null == var6) {
         if (var7 < 4) {
            this.field1880.method586(new class103(var1, var2, var3, var4));
         }

      } else {
         class45.method584(new class103(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field1880.method583().method605();
         }

      }
   }

   class103 method1204(int var1) {
      class103 var3 = (class103)this.field1880.method583();
      if (null != var3 && var3.field1342 <= var1) {
         for(class103 var4 = (class103)this.field1880.method579(); null != var4 && var4.field1342 <= var1; var4 = (class103)this.field1880.method579()) {
            var3.method605();
            var3 = var4;
         }

         if (var3.field1342 + var3.field1340 + this.field1879.field2572 > var1) {
            return var3;
         } else {
            var3.method605();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method1205() {
      return this.field1880.method581();
   }
}
