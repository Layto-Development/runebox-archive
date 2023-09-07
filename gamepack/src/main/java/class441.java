public abstract class class441 {
    class441() {
    }

    public static byte[] method2011(Object var0, boolean var1) {
        if (var0 == null) {
            return null;
        } else if (var0 instanceof byte[]) {
            byte[] var7 = (byte[]) var0;
            if (var1) {
                int var5 = var7.length;
                byte[] var6 = new byte[var5];
                System.arraycopy(var7, 0, var6, 0, var5);
                return var6;
            } else {
                return var7;
            }
        } else if (var0 instanceof class441) {
            class441 var3 = (class441) var0;
            return var3.method2010();
        } else {
            throw new IllegalArgumentException();
        }
    }

    abstract byte[] method2010();

    public abstract void method2009(byte[] var1);
}
