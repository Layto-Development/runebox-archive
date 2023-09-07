public class class169 extends class438 {
    static class331 field1433;
    static Thread field1436;
    // $FF: synthetic field
    final class423 this$0;
    int field1435;
    long field1434;

    class169(class423 var1) {
        this.this$0 = var1;
    }

    static final void method811() {
        for (class83 var1 = (class83) Client.field4045.method122(); var1 != null; var1 = (class83) Client.field4045.method124()) {
            if (var1.field715 == class201.field1651 && !var1.field721) {
                if (Client.field4078 >= var1.field714) {
                    var1.method334(Client.field3854);
                    if (var1.field721) {
                        var1.method221();
                    } else {
                        class329.field2414.method745(var1.field715, var1.field716, var1.field717, var1.field713, 60, var1, 0, -1L, false);
                    }
                }
            } else {
                var1.method221();
            }
        }

    }

    @Override
    void method2006(class78 var1) {
        this.field1435 = var1.method264();
        this.field1434 = var1.method265();
    }

    @Override
    void method2005(class133 var1) {
        var1.method606(this.field1435, this.field1434);
    }
}
