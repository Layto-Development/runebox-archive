import java.util.Comparator;

public abstract class class156 implements Comparator {
    static class331 field1336;
    Comparator field1337;

    protected class156() {
    }

    final void method726(Comparator var1) {
        if (this.field1337 == null) {
            this.field1337 = var1;
        } else if (this.field1337 instanceof class156) {
            ((class156) this.field1337).method726(var1);
        }

    }

    protected final int method727(class278 var1, class278 var2) {
        return this.field1337 == null ? 0 : this.field1337.compare(var1, var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
