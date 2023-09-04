public final class class123 {
   static long field796;

   class123() throws Throwable {
   }

   public static final synchronized long method471() {
      long var1 = System.currentTimeMillis();
      if (var1 < field796) {
         class512.field4084 += field796 - var1;
      }

      field796 = var1;
      return var1 + class512.field4084;
   }
}
