public class class180 {
   static int field1807;
   static int field1809;
   int field1808;
   int field1810;

   class180(int var1, int var2) {
      this.field1810 = var1;
      this.field1808 = var2;
   }

   boolean method1109(class203 var1) {
      if (null == var1) {
         return false;
      } else {
         switch (this.field1810) {
            case 1:
               return var1.method1246(this.field1808);
            case 2:
               return var1.method1244(this.field1808);
            case 3:
               return var1.method1245((char)this.field1808);
            case 4:
               return var1.method1247(this.field1808 == 1);
            default:
               return false;
         }
      }
   }
}
