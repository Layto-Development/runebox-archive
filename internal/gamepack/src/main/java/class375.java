public class class375 {
   public static final class375 field2679 = new class375(1);
   static final class375 field2677 = new class375(2);
   static final class375 field2680 = new class375(0);
   public final int field2678;

   class375(int var1) {
      this.field2678 = var1;
   }

   static class375[] method1742() {
      return new class375[]{field2680, field2677, field2679};
   }

   public static class375 method1741(int var0) {
      class375[] var2 = method1742();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class375 var4 = var2[var3];
         if (var4.field2678 == var0) {
            return var4;
         }
      }

      return null;
   }
}
