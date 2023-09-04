public final class class80 {
   static long field1249;

   class80() throws Throwable {
   }

   public static final synchronized long method713() {
      long var1 = System.currentTimeMillis();
      if (var1 < field1249) {
         class477.field3651 += field1249 - var1;
      }

      field1249 = var1;
      return var1 + class477.field3651;
   }
}
