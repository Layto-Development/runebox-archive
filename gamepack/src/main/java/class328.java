public final class class328 implements Comparable {
    Object field2389;
    Object field2390;
    long field2391;
    long field2392;

    class328(Object var1, Object var2) {
        this.field2389 = var1;
        this.field2390 = var2;
    }

    int method1523(class328 var1) {
        if (this.field2392 < var1.field2392) {
            return -1;
        } else {
            return this.field2392 > var1.field2392 ? 1 : 0;
        }
    }

    @Override
    public boolean equals(Object var1) {
        if (var1 instanceof class328) {
            return this.field2390.equals(((class328) var1).field2390);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int hashCode() {
        return this.field2390.hashCode();
    }

    @Override
    public int compareTo(Object var1) {
        return this.method1523((class328) var1);
    }
}
