import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class286 implements class150 {
    final class132 field2091;
    Map field2092;

    public class286(class132 var1) {
        this.field2091 = var1;
    }

    @Override
    public int method716(int var1) {
        if (null != this.field2092) {
            class2 var3 = (class2) this.field2092.get(var1);
            if (var3 != null) {
                return (Integer) var3.field1;
            }
        }

        return (Integer) this.field2091.method592(var1);
    }

    @Override
    public void method715(int var1, Object var2) {
        if (null == this.field2092) {
            this.field2092 = new HashMap();
            this.field2092.put(var1, new class2(var1, var2));
        } else {
            class2 var4 = (class2) this.field2092.get(var1);
            if (null == var4) {
                this.field2092.put(var1, new class2(var1, var2));
            } else {
                var4.field1 = var2;
            }
        }

    }

    @Override
    public Iterator iterator() {
        return this.field2092 == null ? Collections.emptyIterator() : this.field2092.values().iterator();
    }
}
