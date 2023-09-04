import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class354 {
   ExecutorService field2582 = Executors.newSingleThreadExecutor();
   Future field2583;

   class354() {
      this.field2583 = this.field2582.submit(new class502());
   }

   void method1608() {
      this.field2582.shutdown();
      this.field2582 = null;
   }

   boolean method1606() {
      return this.field2583.isDone();
   }

   SecureRandom method1607() {
      try {
         return (SecureRandom)this.field2583.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }
}
