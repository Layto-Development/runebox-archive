import java.util.concurrent.Future;

public class class310 {
   protected static String field2552;
   static class196 field2554;
   String field2553;
   Future field2555;

   class310(Future var1) {
      this.field2555 = var1;
   }

   class310(String var1) {
      this.method1674(var1);
   }

   void method1674(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field2553 = var1;
      if (null != this.field2555) {
         this.field2555.cancel(true);
         this.field2555 = null;
      }

   }

   public final String method1678() {
      return this.field2553;
   }

   public boolean method1676() {
      return null != this.field2553 || this.field2555 == null;
   }

   public final boolean method1675() {
      return this.method1676() ? true : this.field2555.isDone();
   }

   public final class329 method1677() {
      if (this.method1676()) {
         return new class329(this.field2553);
      } else if (!this.method1675()) {
         return null;
      } else {
         try {
            return (class329)this.field2555.get();
         } catch (Exception var4) {
            String var3 = "Error retrieving REST request reply";
            System.err.println(var3 + "\r\n" + var4);
            this.method1674(var3);
            return new class329(var3);
         }
      }
   }
}
