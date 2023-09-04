import java.io.IOException;
import java.util.concurrent.Callable;

public class class528 implements Callable {
   // $FF: synthetic field
   final class248 this$0;
   final class383 field4151;

   class528(class248 var1, class383 var2) {
      this.this$0 = var1;
      this.field4151 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field4151.method1893()) {
            class51.method602(10L);
         }
      } catch (IOException var2) {
         return new class329("Error servicing REST query: " + var2.getMessage());
      }

      return this.field4151.method1892();
   }
}
