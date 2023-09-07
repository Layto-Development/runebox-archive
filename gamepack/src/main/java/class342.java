import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class342 {
    final class121 field2461;
    final class252 field2458;
    final class252 field2459;
    final int field2462;
    final Comparator field2463;
    final Map<Object, class328> field2457;
    final long field2460;

    public class342(int var1, class121 var2) {
        this(-1L, var1, var2);
    }

    class342(long var1, int var3, class121 var4) {
        this.field2463 = new class504(this);
        this.field2460 = var1;
        this.field2462 = var3;
        this.field2461 = var4;
        if (this.field2462 == -1) {
            this.field2457 = new HashMap<Object, class328>(64);
            this.field2458 = new class252(64, this.field2463);
            this.field2459 = null;
        } else {
            if (this.field2461 == null) {
                throw new IllegalArgumentException("");
            }

            this.field2457 = new HashMap<Object, class328>(this.field2462);
            this.field2458 = new class252(this.field2462, this.field2463);
            this.field2459 = new class252(this.field2462);
        }

    }

    boolean method1608() {
        return this.field2462 != -1;
    }

    public Object method1609(Object var1, byte var2) {
        synchronized (this) {
            if (this.field2460 != -1L) {
                this.method1611();
            }

            class328 var4 = this.field2457.get(var1);
            if (var4 == null) {
                return null;
            } else {
                this.method1612(var4, false);
                return var4.field2389;
            }
        }
    }

    public Object method1610(Object var1, Object var2) {
        synchronized (this) {
            if (this.field2460 != -1L) {
                this.method1611();
            }

            class328 var5 = this.field2457.get(var1);
            if (null != var5) {
                Object var9 = var5.field2389;
                var5.field2389 = var2;
                this.method1612(var5, false);
                return var9;
            } else {
                class328 var6;
                if (this.method1608() && this.field2457.size() == this.field2462) {
                    var6 = (class328) this.field2459.remove();
                    this.field2457.remove(var6.field2390);
                    this.field2458.remove(var6);
                }

                var6 = new class328(var2, var1);
                this.field2457.put(var1, var6);
                this.method1612(var6, true);
                return null;
            }
        }
    }

    void method1612(class328 var1, boolean var2) {
        if (!var2) {
            this.field2458.remove(var1);
            if (this.method1608() && !this.field2459.remove(var1)) {
                throw new IllegalStateException("");
            }
        }

        var1.field2391 = System.currentTimeMillis();
        if (this.method1608()) {
            switch (this.field2461.field1095) {
                case 0:
                    var1.field2392 = var1.field2391;
                    break;
                case 1:
                    ++var1.field2392;
            }

            this.field2459.add(var1);
        }

        this.field2458.add(var1);
    }

    void method1611() {
        if (this.field2460 == -1L) {
            throw new IllegalStateException("");
        } else {
            long var2 = System.currentTimeMillis() - this.field2460;

            while (!this.field2458.isEmpty()) {
                class328 var4 = (class328) this.field2458.peek();
                if (var4.field2391 >= var2) {
                    return;
                }

                this.field2457.remove(var4.field2390);
                this.field2458.remove(var4);
                if (this.method1608()) {
                    this.field2459.remove(var4);
                }
            }

        }
    }

    public void method1607() {
        synchronized (this) {
            this.field2457.clear();
            this.field2458.clear();
            if (this.method1608()) {
                this.field2459.clear();
            }

        }
    }
}
