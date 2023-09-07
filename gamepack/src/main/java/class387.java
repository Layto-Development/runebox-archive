import java.util.Iterator;
import java.util.LinkedList;

public class class387 {
    static int field2777;
    boolean field2775;
    class258 field2770;
    int field2765;
    int field2767;
    int field2769;
    int field2771;
    int field2772;
    int field2773;
    int field2774;
    String field2766;
    String field2768;
    LinkedList<class465> field2776;

    public class387() {
        this.field2774 = -1;
        this.field2772 = -1;
        this.field2769 = -1;
        this.field2770 = null;
        this.field2771 = Integer.MAX_VALUE;
        this.field2765 = 0;
        this.field2773 = Integer.MAX_VALUE;
        this.field2767 = 0;
        this.field2775 = false;
    }

    public void method1785(class78 var1, int var2) {
        this.field2774 = var2;
        this.field2766 = var1.method268();
        this.field2768 = var1.method268();
        this.field2770 = new class258(var1.method264());
        this.field2772 = var1.method264();
        var1.method260();
        this.field2775 = var1.method260() == 1;
        this.field2769 = var1.method260();
        int var4 = var1.method260();
        this.field2776 = new LinkedList<>();

        for (int var5 = 0; var5 < var4; ++var5) {
            this.field2776.add(this.method1801(var1));
        }

        this.method1784();
    }

    class465 method1801(class78 var1) {
        int var3 = var1.method260();
        class350[] var4 = new class350[]{class350.field2534, class350.field2536, class350.field2535, class350.field2541};
        class350 var5 = (class350) class27.method80(var4, var3);
        Object var6 = null;
        switch (var5.field2537) {
            case 0:
                var6 = new class28();
                break;
            case 1:
                var6 = new class212();
                break;
            case 2:
                var6 = new class486();
                break;
            case 3:
                var6 = new class242();
                break;
            default:
                throw new IllegalStateException("");
        }

        ((class465) var6).method2128(var1);
        return (class465) var6;
    }

    public boolean method1786(int var1, int var2, int var3) {
        Iterator<class465> var5 = this.field2776.iterator();

        class465 var6;
        do {
            if (!var5.hasNext()) {
                return false;
            }

            var6 = var5.next();
        } while (!var6.method2126(var1, var2, var3));

        return true;
    }

    public boolean method1789(int var1, int var2) {
        int var4 = var1 / 64;
        int var5 = var2 / 64;
        if (var4 >= this.field2771 && var4 <= this.field2765) {
            if (var5 >= this.field2773 && var5 <= this.field2767) {
                Iterator<class465> var6 = this.field2776.iterator();

                class465 var7;
                do {
                    if (!var6.hasNext()) {
                        return false;
                    }

                    var7 = var6.next();
                } while (!var7.method2127(var1, var2));

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int[] method1799(int var1, int var2, int var3) {
        Iterator<class465> var5 = this.field2776.iterator();

        class465 var6;
        do {
            if (!var5.hasNext()) {
                return null;
            }

            var6 = var5.next();
        } while (!var6.method2126(var1, var2, var3));

        return var6.method2129(var1, var2, var3);
    }

    public class258 method1787(int var1, int var2) {
        Iterator<class465> var4 = this.field2776.iterator();

        class465 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            var5 = var4.next();
        } while (!var5.method2127(var1, var2));

        return var5.method2130(var1, var2);
    }

    void method1784() {
        Iterator<class465> var2 = this.field2776.iterator();

        while (var2.hasNext()) {
            class465 var3 = var2.next();
            var3.method2131(this);
        }

    }

    public int method1795() {
        return this.field2774;
    }

    public boolean method1788() {
        return this.field2775;
    }

    public String method1794() {
        return this.field2766;
    }

    public String method1790() {
        return this.field2768;
    }

    int method1791() {
        return this.field2772;
    }

    public int method1792() {
        return this.field2769;
    }

    public int method1793() {
        return this.field2771;
    }

    public int method1804() {
        return this.field2765;
    }

    public int method1802() {
        return this.field2773;
    }

    public int method1800() {
        return this.field2767;
    }

    public int method1803() {
        return this.field2770.field1929;
    }

    public int method1796() {
        return this.field2770.field1930;
    }

    public int method1797() {
        return this.field2770.field1931;
    }

    public class258 method1798() {
        return new class258(this.field2770);
    }
}
