import java.net.MalformedURLException;
import java.net.URL;

public class class388 {
   static int field3074;
   class427 field3072;
   class539 field3073;

   class388(String var1, class69 var2) {
      try {
         this.field3073 = var2.method657(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field3073 = null;
      }

   }

   class388(class539 var1) {
      this.field3073 = var1;
   }

   class427 method1896() {
      if (null == this.field3072 && this.field3073 != null && this.field3073.method2563()) {
         if (this.field3073.method2565() != null) {
            this.field3072 = class462.method2262(this.field3073.method2565());
         }

         this.field3073 = null;
      }

      return this.field3072;
   }
}
