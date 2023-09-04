import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class371 {
   ExecutorService field2902 = Executors.newSingleThreadExecutor();
   Future field2903;

   class371() {
      this.field2903 = this.field2902.submit(new class253());
   }

   void method1865() {
      this.field2902.shutdown();
      this.field2902 = null;
   }

   boolean method1863() {
      return this.field2903.isDone();
   }

   SecureRandom method1864() {
      try {
         return (SecureRandom)this.field2903.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }
}
