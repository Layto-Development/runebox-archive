public class class433 extends class261 {
    public boolean field2948;
    public byte[] field2945;
    public int field2946;
    public int field2947;
    int field2944;

    class433(int var1, byte[] var2, int var3, int var4) {
        this.field2947 = var1;
        this.field2945 = var2;
        this.field2946 = var3;
        this.field2944 = var4;
    }

    class433(int var1, byte[] var2, int var3, int var4, boolean var5) {
        this.field2947 = var1;
        this.field2945 = var2;
        this.field2946 = var3;
        this.field2944 = var4;
        this.field2948 = var5;
    }

    public class433 method1973(class107 var1) {
        this.field2945 = var1.method499(this.field2945);
        this.field2947 = var1.method500(this.field2947);
        if (this.field2946 == this.field2944) {
            this.field2946 = this.field2944 = var1.method498(this.field2946);
        } else {
            this.field2946 = var1.method498(this.field2946);
            this.field2944 = var1.method498(this.field2944);
            if (this.field2946 == this.field2944) {
                --this.field2946;
            }
        }

        return this;
    }
}
