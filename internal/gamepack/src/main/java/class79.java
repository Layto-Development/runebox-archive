public class class79 {
   static int field551;
   static int field553;
   int field552;
   int field554;

   class79(int var1, int var2) {
      this.field554 = var1;
      this.field552 = var2;
   }

   boolean method314(class44 var1) {
      if (null == var1) {
         return false;
      } else {
         switch (this.field554) {
            case 1:
               return var1.method183(this.field552);
            case 2:
               return var1.method181(this.field552);
            case 3:
               return var1.method182((char)this.field552);
            case 4:
               return var1.method184(1 == this.field552);
            default:
               return false;
         }
      }
   }
}
