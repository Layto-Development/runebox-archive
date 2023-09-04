import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class403 {
   static int field3119;
   ExecutorService field3117 = Executors.newSingleThreadExecutor();
   Future field3120;
   final class184 field3118;
   final class390 field3116;

   public class403(class184 var1, class390 var2) {
      this.field3118 = var1;
      this.field3116 = var2;
      this.method1970();
   }

   public boolean method1972() {
      return this.field3120.isDone();
   }

   public void method1969() {
      this.field3117.shutdown();
      this.field3117 = null;
   }

   public class184 method1971() {
      try {
         return (class184)this.field3120.get();
      } catch (Exception var3) {
         return null;
      }
   }

   void method1970() {
      this.field3120 = this.field3117.submit(new class54(this, this.field3118, this.field3116));
   }
}
