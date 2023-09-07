public class class43 {
    public class70 field533;
    class70 field532;

    public class43() {
        this.field533 = new class70();
        this.field533.field657 = this.field533;
        this.field533.field659 = this.field533;
    }

    public static void method119(class70 var0, class70 var1) {
        if (var0.field659 != null) {
            var0.method221();
        }

        var0.field659 = var1.field659;
        var0.field657 = var1;
        var0.field659.field657 = var0;
        var0.field657.field659 = var0;
    }

    public void method118() {
        while (true) {
            class70 var1 = this.field533.field657;
            if (var1 == this.field533) {
                this.field532 = null;
                return;
            }

            var1.method221();
        }
    }

    public void method126(class70 var1) {
        if (var1.field659 != null) {
            var1.method221();
        }

        var1.field659 = this.field533.field659;
        var1.field657 = this.field533;
        var1.field659.field657 = var1;
        var1.field657.field659 = var1;
    }

    public void method127(class70 var1) {
        if (var1.field659 != null) {
            var1.method221();
        }

        var1.field659 = this.field533;
        var1.field657 = this.field533.field657;
        var1.field659.field657 = var1;
        var1.field657.field659 = var1;
    }

    public class70 method120() {
        class70 var1 = this.field533.field657;
        if (var1 == this.field533) {
            return null;
        } else {
            var1.method221();
            return var1;
        }
    }

    public class70 method121() {
        class70 var1 = this.field533.field659;
        if (var1 == this.field533) {
            return null;
        } else {
            var1.method221();
            return var1;
        }
    }

    public class70 method122() {
        class70 var1 = this.field533.field657;
        if (var1 == this.field533) {
            this.field532 = null;
            return null;
        } else {
            this.field532 = var1.field657;
            return var1;
        }
    }

    public class70 method123() {
        class70 var1 = this.field533.field659;
        if (var1 == this.field533) {
            this.field532 = null;
            return null;
        } else {
            this.field532 = var1.field659;
            return var1;
        }
    }

    public class70 method124() {
        class70 var1 = this.field532;
        if (var1 == this.field533) {
            this.field532 = null;
            return null;
        } else {
            this.field532 = var1.field657;
            return var1;
        }
    }

    public class70 method128() {
        class70 var1 = this.field532;
        if (var1 == this.field533) {
            this.field532 = null;
            return null;
        } else {
            this.field532 = var1.field659;
            return var1;
        }
    }

    public boolean method125() {
        return this.field533.field657 == this.field533;
    }
}
