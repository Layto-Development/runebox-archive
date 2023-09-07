public class class538 extends class493 {
    public static class68 field4282;
    // $FF: synthetic field
    final class54 this$0;
    byte field4280;
    int field4279;
    String field4281;

    class538(class54 var1) {
        this.this$0 = var1;
        this.field4281 = null;
    }

    @Override
    void method2244(class78 var1) {
        if (var1.method260() != 255) {
            --var1.field697;
            var1.method265();
        }

        this.field4281 = var1.method319();
        this.field4279 = var1.method309();
        this.field4280 = var1.method261();
        var1.method265();
    }

    @Override
    void method2245(class315 var1) {
        class404 var3 = new class404();
        var3.field2862 = new class358(this.field4281);
        var3.field2864 = this.field4279;
        var3.field2863 = this.field4280;
        var1.method1386(var3);
    }
}
