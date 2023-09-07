import java.util.concurrent.Callable;

public class class214 implements Callable {
    static class444 field1735;
    static int field1736;
    static int field1737;
    // $FF: synthetic field
    final class228 this$0;
    final class245 field1732;
    final class329 field1734;
    final class478 field1731;
    final int field1733;

    class214(class228 var1, class329 var2, class478 var3, class245 var4, int var5) {
        this.this$0 = var1;
        this.field1734 = var2;
        this.field1731 = var3;
        this.field1732 = var4;
        this.field1733 = var5;
    }

    @Override
    public Object call() {
        this.field1734.method1526();
        class329[][] var1;
        if (class478.field3420 == this.field1731) {
            var1 = this.this$0.field1784;
        } else {
            var1 = this.this$0.field1790;
        }

        var1[this.field1733][this.field1732.method1094()] = this.field1734;
        return null;
    }
}
