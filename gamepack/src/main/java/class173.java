public class class173 extends class438 {
    static class367 field1454;
    static class97[] field1456;
    static int[][] field1455;
    // $FF: synthetic field
    final class423 this$0;
    int field1457;

    class173(class423 var1) {
        this.this$0 = var1;
        this.field1457 = -1;
    }

    static void method822(int var0, class258 var1, boolean var2) {
        class387 var4 = Client.method2426().method476(var0);
        int var5 = class180.field1528.field2074;
        int var6 = class357.field2573 + (class180.field1528.field4121 >> 7);
        int var7 = (class180.field1528.field4092 >> 7) + class5.field28;
        class258 var8 = new class258(var5, var6, var7);
        Client.method2426().method446(var4, var8, var1, var2);
    }

    @Override
    void method2006(class78 var1) {
        this.field1457 = var1.method309();
    }

    @Override
    void method2005(class133 var1) {
        var1.method602(this.field1457);
    }
}
