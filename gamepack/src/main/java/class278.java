public class class278 implements Comparable {
    static int field2030;
    class358 field2028;
    class358 field2029;

    class278() {
    }

    public class358 method1247() {
        return this.field2028;
    }

    public String method1248() {
        return this.field2028 == null ? "" : this.field2028.method1706();
    }

    public String method1249() {
        return this.field2029 == null ? "" : this.field2029.method1706();
    }

    void method1250(class358 var1, class358 var2) {
        if (var1 == null) {
            throw new NullPointerException();
        } else {
            this.field2028 = var1;
            this.field2029 = var2;
        }
    }

    public int method1251(class278 var1) {
        return this.field2028.method1705(var1.field2028);
    }

    @Override
    public int compareTo(Object var1) {
        return this.method1251((class278) var1);
    }
}
