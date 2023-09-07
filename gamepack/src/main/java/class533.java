public class class533 {
    static int field4244;
    static int field4246;
    int field4245;
    int field4247;

    class533(int var1, int var2) {
        this.field4247 = var1;
        this.field4245 = var2;
    }

    boolean method2558(class200 var1) {
        if (null == var1) {
            return false;
        } else {
            switch (this.field4247) {
                case 1:
                    return var1.method965(this.field4245);
                case 2:
                    return var1.method963(this.field4245);
                case 3:
                    return var1.method964((char) this.field4245);
                case 4:
                    return var1.method966(this.field4245 == 1);
                default:
                    return false;
            }
        }
    }
}
