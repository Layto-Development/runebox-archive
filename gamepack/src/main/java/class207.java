import java.util.Iterator;

public class class207 implements Iterable {
    public class510 field1678;
    class510 field1677;

    public class207() {
        this.field1678 = new class510();
        this.field1678.field3769 = this.field1678;
        this.field1678.field3770 = this.field1678;
    }

    public static void method984(class510 var0, class510 var1) {
        if (var0.field3770 != null) {
            var0.method2300();
        }

        var0.field3770 = var1;
        var0.field3769 = var1.field3769;
        var0.field3770.field3769 = var0;
        var0.field3769.field3770 = var0;
    }

    public void method989() {
        while (this.field1678.field3769 != this.field1678) {
            this.field1678.field3769.method2300();
        }

    }

    public void method983(class510 var1) {
        if (var1.field3770 != null) {
            var1.method2300();
        }

        var1.field3770 = this.field1678.field3770;
        var1.field3769 = this.field1678;
        var1.field3770.field3769 = var1;
        var1.field3769.field3770 = var1;
    }

    public class510 method985() {
        class510 var1 = this.field1678.field3769;
        if (var1 == this.field1678) {
            return null;
        } else {
            var1.method2300();
            return var1;
        }
    }

    public class510 method986() {
        return this.method987(null);
    }

    class510 method987(class510 var1) {
        class510 var2;
        if (var1 == null) {
            var2 = this.field1678.field3769;
        } else {
            var2 = var1;
        }

        if (var2 == this.field1678) {
            this.field1677 = null;
            return null;
        } else {
            this.field1677 = var2.field3769;
            return var2;
        }
    }

    public class510 method988() {
        class510 var1 = this.field1677;
        if (var1 == this.field1678) {
            this.field1677 = null;
            return null;
        } else {
            this.field1677 = var1.field3769;
            return var1;
        }
    }

    @Override
    public Iterator iterator() {
        return new class366(this);
    }
}
