import java.util.Iterator;

public class class366 implements Iterator {
    class207 field2619;
    class510 field2620;
    class510 field2621;

    class366(class207 var1) {
        this.field2621 = null;
        this.field2619 = var1;
        this.field2620 = this.field2619.field1678.field3769;
        this.field2621 = null;
    }

    @Override
    public Object next() {
        class510 var1 = this.field2620;
        if (var1 == this.field2619.field1678) {
            var1 = null;
            this.field2620 = null;
        } else {
            this.field2620 = var1.field3769;
        }

        this.field2621 = var1;
        return var1;
    }

    @Override
    public boolean hasNext() {
        return this.field2620 != this.field2619.field1678;
    }

    @Override
    public void remove() {
        if (this.field2621 == null) {
            throw new IllegalStateException();
        } else {
            this.field2621.method2300();
            this.field2621 = null;
        }
    }
}
