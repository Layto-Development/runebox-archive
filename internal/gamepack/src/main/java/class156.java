public class class156 extends class70 {
   public static int field981;
   static int field980;
   static int field982;
   class225 field978;
   class457 field979 = new class457();

   class156(class225 var1) {
      this.field978 = var1;
   }

   void method589(int var1, int var2, int var3, int var4) {
      class174 var6 = null;
      int var7 = 0;

      for(class174 var8 = (class174)this.field979.method2144(); var8 != null; var8 = (class174)this.field979.method2140()) {
         ++var7;
         if (var8.field1424 == var1) {
            var8.method941(var1, var2, var3, var4);
            return;
         }

         if (var8.field1424 <= var1) {
            var6 = var8;
         }
      }

      if (null == var6) {
         if (var7 < 4) {
            this.field979.method2147(new class174(var1, var2, var3, var4));
         }

      } else {
         class457.method2145(new class174(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field979.method2144().method295();
         }

      }
   }

   class174 method590(int var1) {
      class174 var3 = (class174)this.field979.method2144();
      if (null != var3 && var3.field1424 <= var1) {
         for(class174 var4 = (class174)this.field979.method2140(); null != var4 && var4.field1424 <= var1; var4 = (class174)this.field979.method2140()) {
            var3.method295();
            var3 = var4;
         }

         if (var3.field1424 + var3.field1422 + this.field978.field1683 > var1) {
            return var3;
         } else {
            var3.method295();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method591() {
      return this.field979.method2142();
   }
}
