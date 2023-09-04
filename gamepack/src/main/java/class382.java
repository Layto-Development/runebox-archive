import java.util.concurrent.Callable;

public class class382 implements Callable {
   static class167 field3060;
   static int field3061;
   static int field3062;
   final class236 field3057;
   final class424 field3056;
   // $FF: synthetic field
   final class495 this$0;
   final class75 field3059;
   final int field3058;

   class382(class495 var1, class75 var2, class424 var3, class236 var4, int var5) {
      this.this$0 = var1;
      this.field3059 = var2;
      this.field3056 = var3;
      this.field3057 = var4;
      this.field3058 = var5;
   }

   public Object call() {
      this.field3059.method689();
      class75[][] var1;
      if (class424.field3219 == this.field3056) {
         var1 = this.this$0.field3917;
      } else {
         var1 = this.this$0.field3923;
      }

      var1[this.field3058][this.field3057.method1422()] = this.field3059;
      return null;
   }
}
