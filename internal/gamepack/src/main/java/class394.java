public class class394 extends class358 {
   class131 field3083 = null;
   int field3082 = 0;

   public class394(class358 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field2810 = "FadeOutTask";
      if (var2 >= 0) {
         if (var3 && var2 < class228.field2112.size()) {
            this.field3083 = (class131)class228.field2112.get(var2);
         } else if (!var3 && var2 < class228.field2105.size()) {
            this.field3083 = (class131)class228.field2105.get(var2);
         }

         this.field3082 = var4;
      }
   }

   public boolean method1831() {
      if (this.field3083 != null && this.field3083.field1551 != null) {
         this.field3083.field1556 = true;

         try {
            if (this.field3083.field1544 > 0.0F && this.field3083.field1551.method2203()) {
               float var2 = this.field3082 == 0 ? (float)this.field3082 : (float)this.field3083.field1547 / (float)this.field3082;
               class131 var10000 = this.field3083;
               var10000.field1544 -= var2 == 0.0F ? (float)this.field3083.field1547 : var2;
               if (this.field3083.field1544 < 0.0F) {
                  this.field3083.field1544 = 0.0F;
               }

               this.field3083.field1551.method2175((int)this.field3083.field1544);
               return false;
            }
         } catch (Exception var3) {
            this.method1834(var3.getMessage());
            return true;
         }

         this.field3083.field1556 = false;
         return true;
      } else {
         return true;
      }
   }
}
