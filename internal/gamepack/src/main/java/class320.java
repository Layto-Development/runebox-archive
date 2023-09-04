public class class320 extends class450 {
   static class483 field2144;

   public class320(class450 var1) {
      super(var1);
      super.field3555 = "SwapSongTask";
   }

   public boolean method2101() {
      if (class469.field3716.size() > 1 && class469.field3716.get(0) != null && ((class468)class469.field3716.get(0)).field3705.method42() && class469.field3716.get(1) != null && ((class468)class469.field3716.get(1)).field3705.method42()) {
         class468 var2 = (class468)class469.field3716.get(0);
         class469.field3716.set(0, class469.field3716.get(1));
         class469.field3716.set(1, var2);
      }

      return true;
   }
}
