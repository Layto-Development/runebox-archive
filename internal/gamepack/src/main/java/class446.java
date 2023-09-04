import java.util.concurrent.Future;

public class class446 {
   protected static String field3539;
   static class531 field3541;
   String field3540;
   Future field3542;

   class446(Future var1) {
      this.field3542 = var1;
   }

   class446(String var1) {
      this.method2073(var1);
   }

   void method2073(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.field3540 = var1;
      if (null != this.field3542) {
         this.field3542.cancel(true);
         this.field3542 = null;
      }

   }

   public final String method2077() {
      return this.field3540;
   }

   public boolean method2075() {
      return null != this.field3540 || this.field3542 == null;
   }

   public final boolean method2074() {
      return this.method2075() ? true : this.field3542.isDone();
   }

   public final class406 method2076() {
      if (this.method2075()) {
         return new class406(this.field3540);
      } else if (!this.method2074()) {
         return null;
      } else {
         try {
            return (class406)this.field3542.get();
         } catch (Exception var4) {
            String var3 = "Error retrieving REST request reply";
            System.err.println(var3 + "\r\n" + var4);
            this.method2073(var3);
            return new class406(var3);
         }
      }
   }
}
