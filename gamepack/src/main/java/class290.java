public final class class290 {
    static class290[] field2117;
    static class532 field2121;
    static int field2116;

    static {
        field2117 = new class290[0];
        method1314(100);
        new class290();
    }

    float field2115;
    float field2118;
    float field2119;
    float field2120;

    class290() {
        this.method1310();
    }

    static void method1314(int var0) {
        field2116 = 100;
        field2117 = new class290[100];
        class182.field1530 = 0;
    }

    public static class290 method1313() {
        synchronized (field2117) {
            if (class182.field1530 == 0) {
                return new class290();
            } else {
                field2117[--class182.field1530].method1310();
                return field2117[class182.field1530];
            }
        }
    }

    public void method1312() {
        synchronized (field2117) {
            if (class182.field1530 < field2116 - 1) {
                field2117[++class182.field1530 - 1] = this;
            }

        }
    }

    void method1308(float var1, float var2, float var3, float var4) {
        this.field2119 = var1;
        this.field2118 = var2;
        this.field2120 = var3;
        this.field2115 = var4;
    }

    public void method1309(float var1, float var2, float var3, float var4) {
        float var6 = (float) Math.sin(var4 * 0.5F);
        float var7 = (float) Math.cos(var4 * 0.5F);
        this.field2119 = var6 * var1;
        this.field2118 = var2 * var6;
        this.field2120 = var6 * var3;
        this.field2115 = var7;
    }

    void method1310() {
        this.field2120 = 0.0F;
        this.field2118 = 0.0F;
        this.field2119 = 0.0F;
        this.field2115 = 1.0F;
    }

    public void method1311(class290 var1) {
        this.method1308(this.field2119 * var1.field2115 + this.field2115 * var1.field2119 + this.field2120 * var1.field2118 - this.field2118 * var1.field2120, var1.field2120 * this.field2119 + this.field2115 * var1.field2118 + (var1.field2115 * this.field2118 - this.field2120 * var1.field2119), var1.field2120 * this.field2115 + (this.field2120 * var1.field2115 + this.field2118 * var1.field2119 - var1.field2118 * this.field2119), this.field2115 * var1.field2115 - this.field2119 * var1.field2119 - this.field2118 * var1.field2118 - var1.field2120 * this.field2120);
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof class290)) {
            return false;
        } else {
            class290 var2 = (class290) var1;
            return var2.field2119 == this.field2119 && var2.field2118 == this.field2118 && var2.field2120 == this.field2120 && this.field2115 == var2.field2115;
        }
    }

    @Override
    public int hashCode() {
        boolean var1 = true;
        float var2 = 1.0F;
        var2 = this.field2119 + var2 * 31.0F;
        var2 = this.field2118 + var2 * 31.0F;
        var2 = this.field2120 + var2 * 31.0F;
        var2 = this.field2115 + var2 * 31.0F;
        return (int) var2;
    }

    @Override
    public String toString() {
        return this.field2119 + "," + this.field2118 + "," + this.field2120 + "," + this.field2115;
    }
}
