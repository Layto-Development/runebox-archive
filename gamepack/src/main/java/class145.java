public class class145 {
    static int field1285;
    class353 field1282;
    int field1283;
    int field1284;

    class145(class353 var1, int var2, int var3) {
        this.field1283 = 0;
        this.field1284 = 0;
        this.field1282 = var1;
        this.field1283 = var2;
        this.field1284 = var3;
    }

    public String method664() {
        if (this.method665()) {
            return "";
        } else {
            StringBuilder var2 = new StringBuilder(this.method666());

            for (int var3 = this.field1283; var3 < this.field1284; ++var3) {
                class284 var4 = this.field1282.method1667(var3);
                var2.append(var4.field2084);
            }

            return var2.toString();
        }
    }

    boolean method671(int var1) {
        return this.field1282.method1670() == 2 || this.field1282.method1670() == 1 && (!this.field1282.field2554 || var1 != this.field1284 - 1);
    }

    public boolean method665() {
        return this.field1283 == this.field1284;
    }

    public int method666() {
        return this.field1284 - this.field1283;
    }

    boolean method667(class284 var1) {
        if (this.field1282.field2556 == 2) {
            return true;
        } else if (this.field1282.field2556 == 0) {
            return false;
        } else {
            return this.field1282.method1649() != var1;
        }
    }

    int method669() {
        if (this.method665()) {
            return 0;
        } else {
            class284 var2 = this.field1282.method1667(this.field1284 - 1);
            if (var2.field2084 == '\n') {
                return 0;
            } else if (this.method667(var2)) {
                return this.field1282.field2553.field1620[42];
            } else {
                int var3 = this.field1282.field2553.field1620[var2.field2084];
                if (var3 == 0) {
                    return var2.field2084 == '\t' ? 3 * this.field1282.field2553.field1620[32] : this.field1282.field2553.field1620[32];
                } else {
                    return var3;
                }
            }
        }
    }

    public class260 method670() {
        if (this.method665()) {
            return new class260(0, 0);
        } else {
            class284 var2 = this.field1282.method1667(this.field1284 - 1);
            return new class260(var2.field2083 + this.method669(), var2.field2086);
        }
    }

    public class284 method668(int var1) {
        return var1 >= 0 && var1 < this.method666() ? this.field1282.method1667(this.field1283 + var1) : null;
    }
}
