public class class53 extends class438 {
    // $FF: synthetic field
    final class423 this$0;
    boolean field591;
    int field592;

    class53(class423 var1) {
        this.this$0 = var1;
        this.field592 = -1;
    }

    @Override
    void method2006(class78 var1) {
        this.field592 = var1.method309();
        this.field591 = var1.method260() == 1;
    }

    @Override
    void method2005(class133 var1) {
        var1.method611(this.field592, this.field591);
    }
}
