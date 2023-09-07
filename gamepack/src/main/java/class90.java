public class class90 {
    boolean field758;
    class68 field756;
    int field757;
    String field755;

    class90(class68 var1) {
        this.field757 = 0;
        this.field758 = false;
        this.field756 = var1;
    }

    void method351(String var1) {
        if (null != var1 && !var1.isEmpty()) {
            if (this.field755 != var1) {
                this.field755 = var1;
                this.field757 = 0;
                this.field758 = false;
                this.method352();
            }
        }
    }

    int method352() {
        if (this.field755 == null) {
            this.field757 = 100;
            this.field758 = true;
        } else {
            if (this.field757 < 33) {
                if (!this.field756.method208(class263.field1946.field1949, this.field755)) {
                    return this.field757;
                }

                this.field757 = 33;
            }

            if (this.field757 == 33) {
                if (this.field756.method210(class263.field1945.field1949, this.field755) && !this.field756.method208(class263.field1945.field1949, this.field755)) {
                    return this.field757;
                }

                this.field757 = 66;
            }

            if (this.field757 == 66) {
                if (!this.field756.method208(this.field755, class263.field1948.field1949)) {
                    return this.field757;
                }

                this.field757 = 100;
                this.field758 = true;
            }
        }

        return this.field757;
    }

    boolean method353() {
        return this.field758;
    }

    int method354() {
        return this.field757;
    }
}
