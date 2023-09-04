public class class63 extends class450 {
   class468 field503 = null;
   int field502 = 0;

   public class63(class450 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field3555 = "FadeOutTask";
      if (var2 >= 0) {
         if (var3 && var2 < class469.field3723.size()) {
            this.field503 = (class468)class469.field3723.get(var2);
         } else if (!var3 && var2 < class469.field3716.size()) {
            this.field503 = (class468)class469.field3716.get(var2);
         }

         this.field502 = var4;
      }
   }

   public boolean method2101() {
      if (this.field503 != null && this.field503.field3705 != null) {
         this.field503.field3710 = true;

         try {
            if (this.field503.field3698 > 0.0F && this.field503.field3705.method42()) {
               float var2 = 0 == this.field502 ? (float)this.field502 : (float)this.field503.field3701 / (float)this.field502;
               class468 var10000 = this.field503;
               var10000.field3698 -= var2 == 0.0F ? (float)this.field503.field3701 : var2;
               if (this.field503.field3698 < 0.0F) {
                  this.field503.field3698 = 0.0F;
               }

               this.field503.field3705.method10((int)this.field503.field3698);
               return false;
            }
         } catch (Exception var3) {
            this.method2104(var3.getMessage());
            return true;
         }

         this.field503.field3710 = false;
         return true;
      } else {
         return true;
      }
   }
}
