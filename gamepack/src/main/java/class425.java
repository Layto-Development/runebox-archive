import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class425 implements Iterator {
    class252 field2927;
    int field2928;
    int field2929;

    class425(class252 var1) {
        this.field2928 = 0;
        this.field2929 = this.field2927.field1909;
        this.field2927 = var1;
    }

    @Override
    public boolean hasNext() {
        return this.field2928 < this.field2927.field1913;
    }

    @Override
    public Object next() {
        if (this.field2929 != this.field2927.field1909) {
            throw new ConcurrentModificationException();
        } else if (this.field2928 < this.field2927.field1913) {
            Object var1 = this.field2927.field1911[this.field2928].field616;
            ++this.field2928;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
