public class class195 {
   class461[] field1893 = new class461[100];
   int field1892;

   class195() {
   }

   class461 method1218(int var1, String var2, String var3, String var4) {
      class461 var6 = this.field1893[99];

      for(int var7 = this.field1892; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field1893[var7] = this.field1893[var7 - 1];
         }
      }

      if (null == var6) {
         var6 = new class461(var1, var2, var4, var3);
      } else {
         var6.method605();
         var6.method938();
         var6.method2255(var1, var2, var4, var3);
      }

      this.field1893[0] = var6;
      if (this.field1892 < 100) {
         ++this.field1892;
      }

      return var6;
   }

   class461 method1219(int var1) {
      return var1 >= 0 && var1 < this.field1892 ? this.field1893[var1] : null;
   }

   int method1217() {
      return this.field1892;
   }
}
