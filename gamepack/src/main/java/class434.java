public class class434 extends class510 {
    static class331[] field2959;
    static class372 field2958;
    class358 field2953;
    class540 field2949;
    class540 field2955;
    int field2950;
    int field2951;
    int field2954;
    String field2952;
    String field2956;
    String field2957;

    class434(int var1, String var2, String var3, String var4) {
        this.field2949 = class540.field4293;
        this.field2955 = class540.field4293;
        this.method1976(var1, var2, var3, var4);
    }

    void method1976(int var1, String var2, String var3, String var4) {
        int var6 = ++class157.field1341 - 1;
        this.field2954 = var6;
        this.field2950 = Client.field4078;
        this.field2951 = var1;
        this.field2952 = var2;
        this.method1981();
        this.field2956 = var3;
        this.field2957 = var4;
        this.method1974();
        this.method1978();
    }

    void method1974() {
        this.field2949 = class540.field4293;
    }

    final boolean method1979() {
        if (this.field2949 == class540.field4293) {
            this.method1975();
        }

        return this.field2949 == class540.field4292;
    }

    void method1975() {
        this.field2949 = class153.field1320.field2963.method64(this.field2953) ? class540.field4292 : class540.field4291;
    }

    void method1978() {
        this.field2955 = class540.field4293;
    }

    final boolean method1977() {
        if (class540.field4293 == this.field2955) {
            this.method1980();
        }

        return this.field2955 == class540.field4292;
    }

    void method1980() {
        this.field2955 = class153.field1320.field2962.method64(this.field2953) ? class540.field4292 : class540.field4291;
    }

    final void method1981() {
        if (this.field2952 != null) {
            this.field2953 = new class358(Client.method2419(this.field2952), class492.field3622);
        } else {
            this.field2953 = null;
        }

    }
}
