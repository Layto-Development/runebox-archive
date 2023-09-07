import java.util.concurrent.Callable;

class class472 implements Callable {
    static int field3389;
    // $FF: synthetic field
    final class214[] val$curveLoadJobs;
    // $FF: synthetic field
    final class228 this$0;
    // $FF: synthetic field
    final int val$workEnd;
    // $FF: synthetic field
    final int val$workStart;

    class472(class228 var1, int var2, int var3, class214[] var4) {
        this.this$0 = var1;
        this.val$workStart = var2;
        this.val$workEnd = var3;
        this.val$curveLoadJobs = var4;
    }

    @Override
    public Object call() {
        for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
            this.val$curveLoadJobs[var1].call();
        }

        return null;
    }
}
