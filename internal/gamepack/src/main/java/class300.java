import java.util.concurrent.Callable;

class class300 implements Callable {
   static int field2046;
   // $FF: synthetic field
   final class249[] val$curveLoadJobs;
   // $FF: synthetic field
   final class272 this$0;
   // $FF: synthetic field
   final int val$workEnd;
   // $FF: synthetic field
   final int val$workStart;

   class300(class272 var1, int var2, int var3, class249[] var4) {
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
