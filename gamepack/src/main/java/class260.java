public class class260 {
    static class68 field1938;
    public final Object field1939;
    public final Object field1940;

    public class260(Object var1, Object var2) {
        this.field1940 = var1;
        this.field1939 = var2;
    }

    @Override
    public String toString() {
        return this.field1940 + ", " + this.field1939;
    }

    @Override
    public boolean equals(Object var1) {
        if (null != var1 && var1 instanceof class260) {
            class260 var2 = (class260) var1;
            if (this.field1940 == null) {
                if (null != var2.field1940) {
                    return false;
                }
            } else if (!this.field1940.equals(var2.field1940)) {
                return false;
            }

            if (null == this.field1939) {
				return var2.field1939 == null;
            } else return this.field1939.equals(var2.field1939);
		} else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int var1 = 0;
        if (null != this.field1940) {
            var1 += this.field1940.hashCode();
        }

        if (this.field1939 != null) {
            var1 += 31 * this.field1939.hashCode();
        }

        return var1;
    }
}
