public class class321 {
   public static final class321 field2592 = new class321(1);
   static final class321 field2590 = new class321(2);
   static final class321 field2593 = new class321(0);
   public final int field2591;

   class321(int var1) {
      this.field2591 = var1;
   }

   static class321[] method1697() {
      return new class321[]{field2593, field2590, field2592};
   }

   public static class321 method1696(int var0) {
      class321[] var2 = method1697();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class321 var4 = var2[var3];
         if (var4.field2591 == var0) {
            return var4;
         }
      }

      return null;
   }
}
