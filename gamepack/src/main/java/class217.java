public class class217 extends class438 {
    // $FF: synthetic field
    final class423 this$0;
    String field1742;
    long field1743;

    class217(class423 var1) {
        this.this$0 = var1;
        this.field1743 = -1L;
        this.field1742 = null;
    }

    @Override
    void method2006(class78 var1) {
        if (var1.method260() != 255) {
            --var1.field697;
            this.field1743 = var1.method265();
        }

        this.field1742 = var1.method319();
    }

    @Override
    void method2005(class133 var1) {
        var1.method599(this.field1743, this.field1742);
    }
}
