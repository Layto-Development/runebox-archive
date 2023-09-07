public abstract class class35 extends class354 implements class132 {
    protected class35(class120 var1, class492 var2, int var3) {
        super(var1, var2, var3);
    }

    protected abstract class72 method103(int var1);

    public int method102() {
        return super.field2557;
    }

    @Override
    public Object method592(int var1) {
        class72 var3 = this.method103(var1);
        return null != var3 && var3.method226() ? var3.method225() : null;
    }

    public class2 method101(class78 var1) {
        int var3 = var1.method309();
        class72 var4 = this.method103(var3);
        class2 var5 = new class2(var3);
        Class var6 = var4.field677.field2940;
        if (var6 == Integer.class) {
            var5.field1 = var1.method264();
        } else if (var6 == Long.class) {
            var5.field1 = var1.method265();
        } else if (var6 == String.class) {
            var5.field1 = var1.method310();
        } else {
            if (!class312.class.isAssignableFrom(var6)) {
                throw new IllegalStateException();
            }

            try {
                class312 var7 = (class312) var6.newInstance();
                var7.method1372(var1);
                var5.field1 = var7;
            } catch (InstantiationException var8) {
            } catch (IllegalAccessException var9) {
            }
        }

        return var5;
    }
}
