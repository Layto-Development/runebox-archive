public class class46 extends class70 {
    public static class97[][] field542;
    static class129 field543;
    static class46[] field539;
    static int field540;

    static {
        field539 = new class46[300];
        field540 = 0;
    }

    public class320 field541;
    public class488 field536;
    public int field537;
    public int field538;

    class46() {
    }

    public static class46 method134(class488 var0, class299 var1) {
        class46 var3 = class423.method1945((byte) -1);
        var3.field536 = var0;
        var3.field537 = var0.field3567;
        if (var3.field537 == -1) {
            var3.field541 = new class320(260);
        } else if (var3.field537 == -2) {
            var3.field541 = new class320(10000);
        } else if (var3.field537 <= 18) {
            var3.field541 = new class320(20);
        } else if (var3.field537 <= 98) {
            var3.field541 = new class320(100);
        } else {
            var3.field541 = new class320(260);
        }

        var3.field541.method1402(var1);
        var3.field541.method1404(var3.field536.field3516);
        var3.field538 = 0;
        return var3;
    }

    public static int method133(int var0) {
        var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
        var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
        var0 = (var0 >>> 4) + var0 & 252645135;
        var0 += var0 >>> 8;
        var0 += var0 >>> 16;
        return var0 & 255;
    }

    public void method132() {
        if (field540 < field539.length) {
            field539[++field540 - 1] = this;
        }
    }
}
