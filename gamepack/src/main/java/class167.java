import java.util.Iterator;

class class167 implements Iterator {
    // $FF: synthetic field
    final class31 this$0;
    int field1431;

    class167(class31 var1) {
        this.this$0 = var1;
    }

    @Override
    public boolean hasNext() {
        return this.field1431 < this.this$0.method102();
    }

    @Override
    public Object next() {
        int var1 = ++this.field1431 - 1;
        class359 var2 = (class359) this.this$0.field172.method1117(var1);
        return null != var2 ? var2 : this.this$0.method94(var1);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
