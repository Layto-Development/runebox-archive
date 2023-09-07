public class class60 {
    class187 field612;
    class187 field613;

    public class60() {
        this.field613 = new class187();
        this.field613.field1536 = this.field613;
        this.field613.field1535 = this.field613;
    }

    public void method176(class187 var1) {
        if (var1.field1535 != null) {
            var1.method873();
        }

        var1.field1535 = this.field613.field1535;
        var1.field1536 = this.field613;
        var1.field1535.field1536 = var1;
        var1.field1536.field1535 = var1;
    }

    public class187 method178() {
        class187 var1 = this.field613.field1536;
        if (var1 == this.field613) {
            this.field612 = null;
            return null;
        } else {
            this.field612 = var1.field1536;
            return var1;
        }
    }

    public class187 method177() {
        class187 var1 = this.field612;
        if (var1 == this.field613) {
            this.field612 = null;
            return null;
        } else {
            this.field612 = var1.field1536;
            return var1;
        }
    }
}
