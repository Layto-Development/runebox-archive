public final class class138 {
    class510 field1222;

    public class138() {
        this.field1222 = new class510();
        this.field1222.field3769 = this.field1222;
        this.field1222.field3770 = this.field1222;
    }

    public void method641(class510 var1) {
        if (var1.field3770 != null) {
            var1.method2300();
        }

        var1.field3770 = this.field1222.field3770;
        var1.field3769 = this.field1222;
        var1.field3770.field3769 = var1;
        var1.field3769.field3770 = var1;
    }

    public void method639(class510 var1) {
        if (var1.field3770 != null) {
            var1.method2300();
        }

        var1.field3770 = this.field1222;
        var1.field3769 = this.field1222.field3769;
        var1.field3770.field3769 = var1;
        var1.field3769.field3770 = var1;
    }

    public class510 method640() {
        class510 var1 = this.field1222.field3769;
        return var1 == this.field1222 ? null : var1;
    }
}
