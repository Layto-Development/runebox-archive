import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class20 {
    final int field70;
    class278[] field68;
    int field71;
    Comparator field73;
    HashMap<class358, class278> field69;
    HashMap<class358, class278> field72;

    class20(int var1) {
        this.field71 = 0;
        this.field73 = null;
        this.field70 = var1;
        this.field68 = this.method60(var1);
        this.field69 = new HashMap<>(var1 / 8);
        this.field72 = new HashMap<>(var1 / 8);
    }

    abstract class278 method66();

    abstract class278[] method60(int var1);

    public void method48() {
        this.field71 = 0;
        Arrays.fill(this.field68, null);
        this.field69.clear();
        this.field72.clear();
    }

    public int method69() {
        return this.field71;
    }

    public boolean method49() {
        return this.field70 == this.field71;
    }

    public boolean method64(class358 var1) {
        if (!var1.method1707()) {
            return false;
        } else {
            return this.field69.containsKey(var1) || this.field72.containsKey(var1);
        }
    }

    public class278 method50(class358 var1) {
        class278 var3 = this.method51(var1);
        return null != var3 ? var3 : this.method65(var1);
    }

    class278 method51(class358 var1) {
        return !var1.method1707() ? null : this.field69.get(var1);
    }

    class278 method65(class358 var1) {
        return !var1.method1707() ? null : this.field72.get(var1);
    }

    public final boolean method67(class358 var1) {
        class278 var3 = this.method51(var1);
        if (null == var3) {
            return false;
        } else {
            this.method52(var3);
            return true;
        }
    }

    final void method52(class278 var1) {
        int var3 = this.method59(var1);
        if (var3 != -1) {
            this.method62(var3);
            this.method57(var1);
        }
    }

    class278 method63(class358 var1) {
        return this.method53(var1, null);
    }

    class278 method53(class358 var1, class358 var2) {
        if (this.method51(var1) != null) {
            throw new IllegalStateException();
        } else {
            class278 var4 = this.method66();
            var4.method1250(var1, var2);
            this.method58(var4);
            this.method54(var4);
            return var4;
        }
    }

    public final class278 method56(int var1) {
        if (var1 >= 0 && var1 < this.field71) {
            return this.field68[var1];
        } else {
            throw new ArrayIndexOutOfBoundsException(var1);
        }
    }

    public final void method70() {
        if (this.field73 == null) {
            Arrays.sort(this.field68, 0, this.field71);
        } else {
            Arrays.sort(this.field68, 0, this.field71, this.field73);
        }

    }

    final void method55(class278 var1, class358 var2, class358 var3) {
        this.method57(var1);
        var1.method1250(var2, var3);
        this.method54(var1);
    }

    final int method59(class278 var1) {
        for (int var3 = 0; var3 < this.field71; ++var3) {
            if (this.field68[var3] == var1) {
                return var3;
            }
        }

        return -1;
    }

    final void method57(class278 var1) {
        if (this.field69.remove(var1.field2028) == null) {
            throw new IllegalStateException();
        } else {
            if (var1.field2029 != null) {
                this.field72.remove(var1.field2029);
            }

        }
    }

    final void method58(class278 var1) {
        this.field68[++this.field71 - 1] = var1;
    }

    final void method54(class278 var1) {
        this.field69.put(var1.field2028, var1);
        if (var1.field2029 != null) {
            class278 var3 = this.field72.put(var1.field2029, var1);
            if (var3 != null && var3 != var1) {
                var3.field2029 = null;
            }
        }

    }

    final void method62(int var1) {
        --this.field71;
        if (var1 < this.field71) {
            System.arraycopy(this.field68, var1 + 1, this.field68, var1, this.field71 - var1);
        }

    }

    public final void method68() {
        this.field73 = null;
    }

    public final void method61(Comparator var1) {
        if (null == this.field73) {
            this.field73 = var1;
        } else if (this.field73 instanceof class156) {
            ((class156) this.field73).method726(var1);
        }

    }
}
