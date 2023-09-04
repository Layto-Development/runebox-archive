public abstract class class450 {
   boolean field3556;
   boolean field3557;
   class450 field3553;
   String field3554;
   String field3555;

   class450(class450 var1) {
      this.field3553 = var1;
   }

   public abstract boolean method2101();

   public boolean method2102() {
      return this.field3556;
   }

   public boolean method2105() {
      return this.field3557;
   }

   public String method2100() {
      return "Error in task: " + this.field3555 + ", Error message: " + this.field3554;
   }

   public class450 method2103() {
      return this.field3553;
   }

   void method2104(String var1) {
      this.field3556 = true;
      this.field3554 = var1;
   }
}
