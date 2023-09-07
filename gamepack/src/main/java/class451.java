import java.util.Iterator;

public class class451 implements Iterator {
    class247 field3108;
    class70 field3109;
    class70 field3110;

    class451(class247 var1) {
        this.field3110 = null;
        this.method2081(var1);
    }

    void method2081(class247 var1) {
        this.field3108 = var1;
        this.method2080();
    }

    void method2080() {
        this.field3109 = this.field3108 != null ? this.field3108.field1894.field657 : null;
        this.field3110 = null;
    }

    @Override
    public Object next() {
        class70 var1 = this.field3109;
        if (var1 == this.field3108.field1894) {
            var1 = null;
            this.field3109 = null;
        } else {
            this.field3109 = var1.field657;
        }

        this.field3110 = var1;
        return var1;
    }

    @Override
    public boolean hasNext() {
        return this.field3109 != this.field3108.field1894 && this.field3109 != null;
    }

    @Override
    public void remove() {
        if (this.field3110 == null) {
            throw new IllegalStateException();
        } else {
            this.field3110.method221();
            this.field3110 = null;
        }
    }
}
