public class class321 {
    public final int field2317;
    final class534[] field2319;
    public class321 field2327;
    boolean field2325;
    boolean field2329;
    class534 field2316;
    class534 field2322;
    class534 field2324;
    class534[] field2320;
    class534[] field2321;
    float[][] field2318;
    float[][] field2323;
    float[][] field2326;
    float[][] field2328;

    public class321(int var1, class78 var2, boolean var3) {
        this.field2322 = new class534();
        this.field2325 = true;
        this.field2324 = new class534();
        this.field2329 = true;
        this.field2316 = new class534();
        this.field2317 = var2.method262();
        this.field2319 = new class534[var1];
        this.field2320 = new class534[this.field2319.length];
        this.field2321 = new class534[this.field2319.length];
        this.field2318 = new float[this.field2319.length][3];

        for (int var4 = 0; var4 < this.field2319.length; ++var4) {
            this.field2319[var4] = new class534(var2, var3);
            this.field2318[var4][0] = var2.method266();
            this.field2318[var4][1] = var2.method266();
            this.field2318[var4][2] = var2.method266();
        }

        this.method1412();
    }

    void method1412() {
        this.field2326 = new float[this.field2319.length][3];
        this.field2323 = new float[this.field2319.length][3];
        this.field2328 = new float[this.field2319.length][3];
        class534 var2;
        synchronized (class534.field4248) {
            if (class326.field2367 == 0) {
                var2 = new class534();
            } else {
                class534.field4248[--class326.field2367].method2562();
                var2 = class534.field4248[class326.field2367];
            }
        }

        class534 var3 = var2;

        for (int var4 = 0; var4 < this.field2319.length; ++var4) {
            class534 var5 = this.method1422(var4);
            var3.method2569(var5);
            var3.method2574();
            this.field2326[var4] = var3.method2561();
            this.field2323[var4][0] = var5.field4249[12];
            this.field2323[var4][1] = var5.field4249[13];
            this.field2323[var4][2] = var5.field4249[14];
            this.field2328[var4] = var5.method2568();
        }

        var3.method2571();
    }

    class534 method1422(int var1) {
        return this.field2319[var1];
    }

    class534 method1414(int var1) {
        if (this.field2320[var1] == null) {
            this.field2320[var1] = new class534(this.method1422(var1));
            if (null != this.field2327) {
                this.field2320[var1].method2572(this.field2327.method1414(var1));
            } else {
                this.field2320[var1].method2572(class534.field4250);
            }
        }

        return this.field2320[var1];
    }

    class534 method1421(int var1) {
        if (this.field2321[var1] == null) {
            this.field2321[var1] = new class534(this.method1414(var1));
            this.field2321[var1].method2574();
        }

        return this.field2321[var1];
    }

    void method1415(class534 var1) {
        this.field2322.method2569(var1);
        this.field2325 = true;
        this.field2329 = true;
    }

    class534 method1416() {
        return this.field2322;
    }

    class534 method1417() {
        if (this.field2325) {
            this.field2324.method2569(this.method1416());
            if (null != this.field2327) {
                this.field2324.method2572(this.field2327.method1417());
            }

            this.field2325 = false;
        }

        return this.field2324;
    }

    public class534 method1413(int var1) {
        if (this.field2329) {
            this.field2316.method2569(this.method1421(var1));
            this.field2316.method2572(this.method1417());
            this.field2329 = false;
        }

        return this.field2316;
    }

    float[] method1418(int var1) {
        return this.field2326[var1];
    }

    float[] method1419(int var1) {
        return this.field2323[var1];
    }

    float[] method1420(int var1) {
        return this.field2328[var1];
    }
}
