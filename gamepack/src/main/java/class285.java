import java.util.Iterator;

public class class285 implements Iterator {
    class208 field2087;
    class70 field2088;
    class70 field2090;
    int field2089;

    public class285(class208 var1) {
        this.field2090 = null;
        this.field2087 = var1;
        this.method1297();
    }

    void method1297() {
        this.field2088 = this.field2087.field1680[0].field657;
        this.field2089 = 1;
        this.field2090 = null;
    }

    public class70 method1298() {
        this.method1297();
        return (class70) this.next();
    }

    @Override
    public Object next() {
        class70 var1;
        if (this.field2088 != this.field2087.field1680[this.field2089 - 1]) {
            var1 = this.field2088;
            this.field2088 = var1.field657;
            this.field2090 = var1;
            return var1;
        } else {
            do {
                if (this.field2089 >= this.field2087.field1679) {
                    return null;
                }

                var1 = this.field2087.field1680[this.field2089++].field657;
            } while (var1 == this.field2087.field1680[this.field2089 - 1]);

            this.field2088 = var1.field657;
            this.field2090 = var1;
            return var1;
        }
    }

    @Override
    public boolean hasNext() {
        if (this.field2088 != this.field2087.field1680[this.field2089 - 1]) {
            return true;
        } else {
            while (this.field2089 < this.field2087.field1679) {
                if (this.field2087.field1680[this.field2089++].field657 != this.field2087.field1680[this.field2089 - 1]) {
                    this.field2088 = this.field2087.field1680[this.field2089 - 1].field657;
                    return true;
                }

                this.field2088 = this.field2087.field1680[this.field2089 - 1];
            }

            return false;
        }
    }

    @Override
    public void remove() {
        if (this.field2090 == null) {
            throw new IllegalStateException();
        } else {
            this.field2090.method221();
            this.field2090 = null;
        }
    }
}
