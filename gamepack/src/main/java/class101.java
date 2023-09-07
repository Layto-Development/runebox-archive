public class class101 extends class438 {
    // $FF: synthetic field
    final class423 this$0;
    int field999;
    String field998;
    long field1000;

    class101(class423 var1) {
        this.this$0 = var1;
        this.field1000 = -1L;
        this.field998 = null;
        this.field999 = 0;
    }

    @Override
    void method2006(class78 var1) {
        if (var1.method260() != 255) {
            --var1.field697;
            this.field1000 = var1.method265();
        }

        this.field998 = var1.method319();
        this.field999 = var1.method309();
    }

    @Override
    void method2005(class133 var1) {
        var1.method609(this.field1000, this.field998, this.field999);
    }
}
