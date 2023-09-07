public class class2 {
    public final int field2;
    public Object field1;

    public class2(int var1) {
        this.field2 = var1;
    }

    public class2(int var1, Object var2) {
        this.field2 = var1;
        this.field1 = var2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof class2)) {
            return false;
        } else {
            class2 var2 = (class2) var1;
            if (null == var2.field1 && null != this.field1) {
                return false;
            } else if (null == this.field1 && var2.field1 != null) {
                return false;
            } else {
                return var2.field2 == this.field2 && var2.field1.equals(this.field1);
            }
        }
    }
}
