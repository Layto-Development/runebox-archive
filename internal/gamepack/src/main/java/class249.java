import java.util.concurrent.Callable;

public class class249 implements Callable {
   static class477 field1795;
   static int field1796;
   static int field1797;
   final class137 field1794;
   // $FF: synthetic field
   final class272 this$0;
   final class423 field1792;
   final class506 field1791;
   final int field1793;

   class249(class272 var1, class137 var2, class506 var3, class423 var4, int var5) {
      this.this$0 = var1;
      this.field1794 = var2;
      this.field1791 = var3;
      this.field1792 = var4;
      this.field1793 = var5;
   }

   public Object call() {
      this.field1794.method495();
      class137[][] var1;
      if (class506.field4061 == this.field1791) {
         var1 = this.this$0.field1909;
      } else {
         var1 = this.this$0.field1915;
      }

      var1[this.field1793][this.field1792.method1950()] = this.field1794;
      return null;
   }
}
