public class class320 extends class358 {
   class131 field2589 = null;
   int field2588 = 0;

   public class320(class358 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field2810 = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < class228.field2112.size()) {
            this.field2589 = (class131)class228.field2112.get(var2);
         } else if (!var3 && var2 < class228.field2105.size()) {
            this.field2589 = (class131)class228.field2105.get(var2);
         }

         this.field2588 = var4;
      }
   }

   public boolean method1831() {
      if (this.field2589 != null && null != this.field2589.field1551) {
         this.field2589.field1556 = true;

         try {
            if (this.field2589.field1544 < (float)this.field2589.field1547 && this.field2589.field1551.method2203()) {
               float var2 = this.field2588 == 0 ? (float)this.field2588 : (float)this.field2589.field1547 / (float)this.field2588;
               class131 var10000 = this.field2589;
               var10000.field1544 += 0.0F == var2 ? (float)this.field2589.field1547 : var2;
               if (this.field2589.field1544 > (float)this.field2589.field1547) {
                  this.field2589.field1544 = (float)this.field2589.field1547;
               }

               this.field2589.field1551.method2175((int)this.field2589.field1544);
               return false;
            }
         } catch (Exception var3) {
            this.method1834(var3.getMessage());
            return true;
         }

         this.field2589.field1556 = false;
         return true;
      } else {
         return true;
      }
   }
}
