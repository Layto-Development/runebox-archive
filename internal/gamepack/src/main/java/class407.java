public class class407 extends class450 {
   static String[] field2819;
   int field2818;
   long field2817;

   public class407(class450 var1, int var2) {
      super(var1);
      this.field2818 = var2;
      super.field3555 = "DelayFadeTask";
   }

   public boolean method2101() {
      if (this.field2817 < (long)this.field2818) {
         ++this.field2817;
         return false;
      } else {
         return true;
      }
   }
}
