public class class247 implements class188 {
   public static final class247 field2219 = new class247(2, 2, String.class, new class13());
   public static final class247 field2224 = new class247(1, 0, Integer.class, new class9());
   public static final class247 field2225 = new class247(0, 1, Long.class, new class469());
   static class427[] field2218;
   public final class376 field2223;
   public final int field2220;
   public final int field2221;
   public final Class field2222;

   class247(int var1, int var2, Class var3, class376 var4) {
      this.field2220 = var1;
      this.field2221 = var2;
      this.field2222 = var3;
      this.field2223 = var4;
   }

   public int method1195() {
      return this.field2221;
   }

   public Object method1449(class184 var1) {
      return this.field2223.method1879(var1);
   }

   public static class247[] method1450() {
      return new class247[]{field2224, field2219, field2225};
   }

   public static class247 method1448(Class var0) {
      class247[] var2 = method1450();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class247 var4 = var2[var3];
         if (var4.field2222 == var0) {
            return var4;
         }
      }

      return null;
   }
}
