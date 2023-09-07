import java.util.Comparator;
import java.util.Map.Entry;

class class168 implements Comparator {
    static int field1432;
    // $FF: synthetic field
    final class255 this$0;

    class168(class255 var1) {
        this.this$0 = var1;
    }

    int method808(Entry var1, Entry var2) {
        return ((Float) var2.getValue()).compareTo((Float) var1.getValue());
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method808((Entry) var1, (Entry) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
