import java.lang.ref.SoftReference;

public class class79 extends class191 {
    SoftReference field699;

    class79(Object var1, int var2) {
        super(var2);
        this.field699 = new SoftReference(var1);
    }

    @Override
    Object method885() {
        return this.field699.get();
    }

    @Override
    boolean method884() {
        return true;
    }
}
