public abstract class class358 {
   boolean field2811;
   boolean field2812;
   class358 field2808;
   String field2809;
   String field2810;

   class358(class358 var1) {
      this.field2808 = var1;
   }

   public abstract boolean method1831();

   public boolean method1832() {
      return this.field2811;
   }

   public boolean method1835() {
      return this.field2812;
   }

   public String method1830() {
      return "Error in task: " + this.field2810 + ", Error message: " + this.field2809;
   }

   public class358 method1833() {
      return this.field2808;
   }

   void method1834(String var1) {
      this.field2811 = true;
      this.field2809 = var1;
   }
}
