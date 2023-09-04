public class class524 extends class358 {
   static String[] field4129;
   int field4128;
   long field4127;

   public class524(class358 var1, int var2) {
      super(var1);
      this.field4128 = var2;
      super.field2810 = "DelayFadeTask";
   }

   public boolean method1831() {
      if (this.field4127 < (long)this.field4128) {
         ++this.field4127;
         return false;
      } else {
         return true;
      }
   }
}
