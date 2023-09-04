import java.io.IOException;
import java.util.concurrent.Callable;

public class class461 implements Callable {
   final class133 field3652;
   // $FF: synthetic field
   final class151 this$0;

   class461(class151 var1, class133 var2) {
      this.this$0 = var1;
      this.field3652 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field3652.method488()) {
            class415.method1902(10L);
         }
      } catch (IOException var2) {
         return new class406("Error servicing REST query: " + var2.getMessage());
      }

      return this.field3652.method487();
   }
}
