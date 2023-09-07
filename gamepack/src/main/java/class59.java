public class class59 extends class493 {
    // $FF: synthetic field
    final class54 this$0;
    byte field608;
    int field609;
    int field611;
    String field610;

    class59(class54 var1) {
        this.this$0 = var1;
        this.field611 = -1;
    }

    @Override
    void method2244(class78 var1) {
        this.field611 = var1.method309();
        this.field608 = var1.method261();
        this.field609 = var1.method309();
        var1.method265();
        this.field610 = var1.method268();
    }

    @Override
    void method2245(class315 var1) {
        class404 var3 = var1.field2263.get(this.field611);
        var3.field2863 = this.field608;
        var3.field2864 = this.field609;
        var3.field2862 = new class358(this.field610);
    }
}
