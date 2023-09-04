import java.net.MalformedURLException;
import java.net.URL;

public class class259 {
   static int field1855;
   class208 field1854;
   class296 field1853;

   class259(String var1, class36 var2) {
      try {
         this.field1854 = var2.method152(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field1854 = null;
      }

   }

   class259(class208 var1) {
      this.field1854 = var1;
   }

   class296 method1204() {
      if (null == this.field1853 && this.field1854 != null && this.field1854.method1086()) {
         if (this.field1854.method1088() != null) {
            this.field1853 = class298.method1374(this.field1854.method1088());
         }

         this.field1854 = null;
      }

      return this.field1853;
   }
}
