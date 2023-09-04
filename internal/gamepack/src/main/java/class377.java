public class class377 implements class42 {
   public static final class377 field2690 = new class377(2, 2, String.class, new class182());
   public static final class377 field2695 = new class377(1, 0, Integer.class, new class258());
   public static final class377 field2696 = new class377(0, 1, Long.class, new class105());
   static class296[] field2689;
   public final class416 field2694;
   public final int field2691;
   public final int field2692;
   public final Class field2693;

   class377(int var1, int var2, Class var3, class416 var4) {
      this.field2691 = var1;
      this.field2692 = var2;
      this.field2693 = var3;
      this.field2694 = var4;
   }

   public int method180() {
      return this.field2692;
   }

   public Object method1744(class366 var1) {
      return this.field2694.method1903(var1);
   }

   public static class377[] method1745() {
      return new class377[]{field2695, field2690, field2696};
   }

   public static class377 method1743(Class var0) {
      class377[] var2 = method1745();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class377 var4 = var2[var3];
         if (var4.field2693 == var0) {
            return var4;
         }
      }

      return null;
   }
}
