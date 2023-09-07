import java.util.Iterator;

public class class31 extends class35 implements class226 {
    final class250 field172;
    final class68 field171;
    final int field170;

    public class31(class120 var1, int var2, class492 var3, class68 var4) {
        super(var1, var3, var4 != null ? var4.method214(var2) : 0);
        this.field172 = new class250(64);
        this.field171 = var4;
        this.field170 = var2;
    }

    @Override
    protected class72 method103(int var1) {
        synchronized (this.field172) {
            class359 var3 = (class359) this.field172.method1117(var1);
            if (null == var3) {
                var3 = this.method94(var1);
                this.field172.method1119(var3, var1);
            }

            return var3;
        }
    }

    class359 method94(int var1) {
        byte[] var3 = this.field171.method188(this.field170, var1);
        class359 var4 = new class359(var1);
        if (var3 != null) {
            var4.method223(new class78(var3));
        }

        return var4;
    }

    public void method93() {
        synchronized (this.field172) {
            this.field172.method1122();
        }
    }

    @Override
    public Iterator iterator() {
        return new class167(this);
    }
}
