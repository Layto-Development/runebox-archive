import java.util.concurrent.Callable;

class class70 implements Callable {
   static int field1135;
   // $FF: synthetic field
   final class382[] val$curveLoadJobs;
   // $FF: synthetic field
   final class495 this$0;
   // $FF: synthetic field
   final int val$workEnd;
   // $FF: synthetic field
   final int val$workStart;

   class70(class495 var1, int var2, int var3, class382[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   public Object call() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }
}
