public class class202 extends class438 {
    static class372 field1656;
    // $FF: synthetic field
    final class423 this$0;
    String field1654;
    long field1655;

    class202(class423 var1) {
        this.this$0 = var1;
        this.field1655 = -1L;
        this.field1654 = null;
    }

    @Override
    void method2006(class78 var1) {
        if (var1.method260() != 255) {
            --var1.field697;
            this.field1655 = var1.method265();
        }

        this.field1654 = var1.method319();
    }

    @Override
    void method2005(class133 var1) {
        var1.method609(this.field1655, this.field1654, 0);
    }
}
