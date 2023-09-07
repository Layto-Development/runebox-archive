import java.io.IOException;

public class class306 {
    static int field2234;
    public class299 field2238;
    boolean field2242;
    class247 field2243;
    class320 field2239;
    class464 field2235;
    class464 field2240;
    class464 field2246;
    class464 field2247;
    class75 field2248;
    class78 field2237;
    int field2236;
    int field2241;
    int field2244;
    int field2245;

    class306() {
        this.field2243 = new class247();
        this.field2236 = 0;
        this.field2237 = new class78(5000);
        this.field2239 = new class320(40000);
        this.field2235 = null;
        this.field2241 = 0;
        this.field2242 = true;
        this.field2245 = 0;
        this.field2244 = 0;
    }

    final void method1364() {
        this.field2243.method1099();
        this.field2236 = 0;
    }

    final void method1358() throws IOException {
        if (this.field2248 != null && this.field2236 > 0) {
            this.field2237.field697 = 0;

            while (true) {
                class46 var2 = (class46) this.field2243.method1106();
                if (null == var2 || var2.field538 > this.field2237.field695.length - this.field2237.field697) {
                    this.field2248.method230(this.field2237.field695, 0, this.field2237.field697);
                    this.field2244 = 0;
                    break;
                }

                this.field2237.method254(var2.field541.field695, 0, var2.field538);
                this.field2236 -= var2.field538;
                var2.method221();
                var2.field541.method248();
                var2.method132();
            }
        }

    }

    public final void method1359(class46 var1) {
        this.field2243.method1100(var1);
        var1.field538 = var1.field541.field697;
        var1.field541.field697 = 0;
        this.field2236 += var1.field538;
    }

    void method1360(class75 var1) {
        this.field2248 = var1;
    }

    void method1363() {
        if (this.field2248 != null) {
            this.field2248.method232();
            this.field2248 = null;
        }

    }

    void method1361() {
        this.field2248 = null;
    }

    class75 method1362() {
        return this.field2248;
    }
}
