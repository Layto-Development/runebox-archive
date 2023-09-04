public class class155 extends class450 {
   class468 field977 = null;
   int field976 = 0;

   public class155(class450 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field3555 = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < class469.field3723.size()) {
            this.field977 = (class468)class469.field3723.get(var2);
         } else if (!var3 && var2 < class469.field3716.size()) {
            this.field977 = (class468)class469.field3716.get(var2);
         }

         this.field976 = var4;
      }
   }

   public boolean method2101() {
      if (this.field977 != null && null != this.field977.field3705) {
         this.field977.field3710 = true;

         try {
            if (this.field977.field3698 < (float)this.field977.field3701 && this.field977.field3705.method42()) {
               float var2 = this.field976 == 0 ? (float)this.field976 : (float)this.field977.field3701 / (float)this.field976;
               class468 var10000 = this.field977;
               var10000.field3698 += 0.0F == var2 ? (float)this.field977.field3701 : var2;
               if (this.field977.field3698 > (float)this.field977.field3701) {
                  this.field977.field3698 = (float)this.field977.field3701;
               }

               this.field977.field3705.method10((int)this.field977.field3698);
               return false;
            }
         } catch (Exception var3) {
            this.method2104(var3.getMessage());
            return true;
         }

         this.field977.field3710 = false;
         return true;
      } else {
         return true;
      }
   }
}
