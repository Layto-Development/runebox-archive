public class class30 extends class493 {
    static short[] field169;
    // $FF: synthetic field
    final class54 this$0;
    byte field166;
    int field165;
    int field167;
    String field168;

    class30(class54 var1) {
        this.this$0 = var1;
        this.field167 = -1;
    }

    @Override
    void method2244(class78 var1) {
        var1.method260();
        this.field167 = var1.method309();
        this.field166 = var1.method261();
        this.field165 = var1.method309();
        var1.method265();
        this.field168 = var1.method268();
        var1.method260();
    }

    @Override
    void method2245(class315 var1) {
        class404 var3 = var1.field2263.get(this.field167);
        var3.field2863 = this.field166;
        var3.field2864 = this.field165;
        var3.field2862 = new class358(this.field168);
    }
}
