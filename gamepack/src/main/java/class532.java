import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class532 {
    final Map<Integer, Integer> field4243;
    boolean field4232;
    boolean field4235;
    boolean field4240;
    boolean field4241;
    double field4236;
    int field4231;
    int field4233;
    int field4237;
    int field4238;
    int field4239;
    int field4242;
    String field4234;

    class532() {
        this.field4232 = false;
        this.field4235 = false;
        this.field4236 = 0.8D;
        this.field4231 = 127;
        this.field4238 = 127;
        this.field4239 = 127;
        this.field4237 = -1;
        this.field4234 = null;
        this.field4242 = 1;
        this.field4243 = new LinkedHashMap<>();
        this.method2525(true);
    }

    class532(class78 var1) {
        this.field4232 = false;
        this.field4235 = false;
        this.field4236 = 0.8D;
        this.field4231 = 127;
        this.field4238 = 127;
        this.field4239 = 127;
        this.field4237 = -1;
        this.field4234 = null;
        this.field4242 = 1;
        this.field4243 = new LinkedHashMap<>();
        if (var1 != null && var1.field695 != null) {
            int var2 = var1.method260();
            if (var2 >= 0 && var2 <= 10) {
                if (var1.method260() == 1) {
                    this.field4241 = true;
                }

                if (var2 > 1) {
                    this.field4240 = var1.method260() == 1;
                }

                if (var2 > 3) {
                    this.field4242 = var1.method260();
                }

                if (var2 > 2) {
                    int var3 = var1.method260();

                    for (int var4 = 0; var4 < var3; ++var4) {
                        int var5 = var1.method264();
                        int var6 = var1.method264();
                        this.field4243.put(var5, var6);
                    }
                }

                if (var2 > 4) {
                    this.field4234 = var1.method319();
                }

                if (var2 > 5) {
                    this.field4232 = var1.method267();
                }

                if (var2 > 6) {
                    this.field4236 = (double) var1.method260() / 100.0D;
                    this.field4231 = var1.method260();
                    this.field4238 = var1.method260();
                    this.field4239 = var1.method260();
                }

                if (var2 > 7) {
                    this.field4237 = var1.method260();
                }

                if (var2 > 8) {
                    this.field4235 = var1.method260() == 1;
                }

                if (var2 > 9) {
                    this.field4233 = var1.method264();
                }
            } else {
                this.method2525(true);
            }
        } else {
            this.method2525(true);
        }

    }

    static void method2557() {
        class119 var1 = null;

        try {
            var1 = class6.method7("", class350.field2540.field1091, true);
            class78 var2 = class290.field2121.method2526();
            var1.method531(var2.field695, 0, var2.field697);
        } catch (Exception var4) {
        }

        try {
            if (var1 != null) {
                var1.method535(true);
            }
        } catch (Exception var3) {
        }

    }

    public static int method2554(int var0, byte var1) {
        class228 var2 = class182.method867(var0);
        if (var2 == null) {
            return 2;
        } else {
            return var2.method1046() ? 0 : 1;
        }
    }

    void method2525(boolean var1) {
    }

    class78 method2526() {
        class78 var2 = new class78(417, true);
        var2.method249(10);
        var2.method249(this.field4241 ? 1 : 0);
        var2.method249(this.field4240 ? 1 : 0);
        var2.method249(this.field4242);
        var2.method249(this.field4243.size());
        Iterator<Entry<Integer, Integer>> var3 = this.field4243.entrySet().iterator();

        while (var3.hasNext()) {
            Entry<Integer, Integer> var4 = var3.next();
            var2.method315(var4.getKey());
            var2.method315(var4.getValue());
        }

        var2.method252(null != this.field4234 ? this.field4234 : "");
        var2.method251(this.field4232);
        var2.method249((int) (this.field4236 * 100.0D));
        var2.method249(this.field4231);
        var2.method249(this.field4238);
        var2.method249(this.field4239);
        var2.method249(this.field4237);
        var2.method249(this.field4235 ? 1 : 0);
        var2.method315(this.field4233);
        return var2;
    }

    void method2527(boolean var1) {
        this.field4241 = var1;
        method2557();
    }

    boolean method2528() {
        return this.field4241;
    }

    void method2549(boolean var1) {
        this.field4232 = var1;
        method2557();
    }

    boolean method2532() {
        return this.field4232;
    }

    void method2547(boolean var1) {
        this.field4240 = var1;
        method2557();
    }

    boolean method2548() {
        return this.field4240;
    }

    void method2530(boolean var1) {
        this.field4235 = var1;
        method2557();
    }

    void method2531() {
        this.method2530(!this.field4235);
    }

    boolean method2538() {
        return this.field4235;
    }

    void method2533(int var1) {
        this.field4233 = var1;
        method2557();
    }

    int method2534() {
        return this.field4233;
    }

    void method2552(double var1) {
        this.field4236 = var1;
        method2557();
    }

    double method2550() {
        return this.field4236;
    }

    void method2535(int var1) {
        this.field4231 = var1;
        method2557();
    }

    int method2529() {
        return this.field4231;
    }

    void method2536(int var1) {
        this.field4238 = var1;
        method2557();
    }

    int method2537() {
        return this.field4238;
    }

    void method2556(int var1) {
        this.field4239 = var1;
        method2557();
    }

    int method2555() {
        return this.field4239;
    }

    void method2539(String var1) {
        this.field4234 = var1;
        method2557();
    }

    String method2540() {
        return this.field4234;
    }

    void method2553(int var1) {
        this.field4237 = var1;
        method2557();
    }

    int method2541() {
        return this.field4237;
    }

    void method2542(int var1) {
        this.field4242 = var1;
        method2557();
    }

    int method2543() {
        return this.field4242;
    }

    void method2544(String var1, int var2) {
        int var4 = this.method2546(var1);
        if (this.field4243.size() >= 10 && !this.field4243.containsKey(var4)) {
            Iterator<Entry<Integer, Integer>> var5 = this.field4243.entrySet().iterator();
            var5.next();
            var5.remove();
        }

        this.field4243.put(var4, var2);
        method2557();
    }

    boolean method2545(String var1) {
        int var3 = this.method2546(var1);
        return this.field4243.containsKey(var3);
    }

    int method2551(String var1) {
        int var3 = this.method2546(var1);
        return !this.field4243.containsKey(var3) ? 0 : this.field4243.get(var3);
    }

    int method2546(String var1) {
        return class95.method370(var1.toLowerCase());
    }
}
