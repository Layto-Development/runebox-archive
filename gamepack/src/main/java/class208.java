import java.util.Iterator;

public final class class208 implements Iterable {
    class70 field1681;
    class70 field1682;
    class70[] field1680;
    int field1679;
    int field1683;

    public class208(int var1) {
        this.field1683 = 0;
        this.field1679 = var1;
        this.field1680 = new class70[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            class70 var3 = this.field1680[var2] = new class70();
            var3.field657 = var3;
            var3.field659 = var3;
        }

    }

    public class70 method990(long var1) {
        class70 var3 = this.field1680[(int) (var1 & (long) (this.field1679 - 1))];

        for (this.field1681 = var3.field657; this.field1681 != var3; this.field1681 = this.field1681.field657) {
            if (this.field1681.field658 == var1) {
                class70 var4 = this.field1681;
                this.field1681 = this.field1681.field657;
                return var4;
            }
        }

        this.field1681 = null;
        return null;
    }

    public void method994(class70 var1, long var2) {
        if (var1.field659 != null) {
            var1.method221();
        }

        class70 var4 = this.field1680[(int) (var2 & (long) (this.field1679 - 1))];
        var1.field659 = var4.field659;
        var1.field657 = var4;
        var1.field659.field657 = var1;
        var1.field657.field659 = var1;
        var1.field658 = var2;
    }

    public void method991() {
        for (int var1 = 0; var1 < this.field1679; ++var1) {
            class70 var2 = this.field1680[var1];

            while (true) {
                class70 var3 = var2.field657;
                if (var3 == var2) {
                    break;
                }

                var3.method221();
            }
        }

        this.field1681 = null;
        this.field1682 = null;
    }

    public class70 method992() {
        this.field1683 = 0;
        return this.method993();
    }

    public class70 method993() {
        class70 var1;
        if (this.field1683 > 0 && this.field1682 != this.field1680[this.field1683 - 1]) {
            var1 = this.field1682;
            this.field1682 = var1.field657;
            return var1;
        } else {
            do {
                if (this.field1683 >= this.field1679) {
                    return null;
                }

                var1 = this.field1680[this.field1683++].field657;
            } while (var1 == this.field1680[this.field1683 - 1]);

            this.field1682 = var1.field657;
            return var1;
        }
    }

    @Override
    public Iterator iterator() {
        return new class285(this);
    }
}
