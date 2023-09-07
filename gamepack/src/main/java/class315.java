import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class315 extends class70 {
    static {
        new BitSet(65536);
    }

    public byte field2261;
    public byte field2265;
    public String field2266;
    public List<class404> field2263;
    public long field2268;
    boolean field2262;
    boolean field2267;
    int[] field2264;

    public class315(class78 var1) {
        this.field2262 = true;
        this.field2266 = null;
        this.method1391(var1);
    }

    public int[] method1390() {
        if (null == this.field2264) {
            String[] var2 = new String[this.field2263.size()];
            this.field2264 = new int[this.field2263.size()];

            for (int var3 = 0; var3 < this.field2263.size(); this.field2264[var3] = var3++) {
                var2[var3] = this.field2263.get(var3).field2862.method1704();
            }

            int[] var4 = this.field2264;
            class240.method1073(var2, var4, 0, var2.length - 1);
        }

        return this.field2264;
    }

    void method1386(class404 var1) {
        this.field2263.add(var1);
        this.field2264 = null;
    }

    void method1387(int var1) {
        this.field2263.remove(var1);
        this.field2264 = null;
    }

    public int method1388() {
        return this.field2263.size();
    }

    public int method1389(String var1) {
        if (!this.field2262) {
            throw new RuntimeException("Displaynames not available");
        } else {
            for (int var3 = 0; var3 < this.field2263.size(); ++var3) {
                if (this.field2263.get(var3).field2862.method1706().equalsIgnoreCase(var1)) {
                    return var3;
                }
            }

            return -1;
        }
    }

    void method1391(class78 var1) {
        int var3 = var1.method260();
        if ((var3 & 1) != 0) {
            this.field2267 = true;
        }

        if ((var3 & 2) != 0) {
            this.field2262 = true;
        }

        int var4 = 2;
        if ((var3 & 4) != 0) {
            var4 = var1.method260();
        }

        super.field658 = var1.method265();
        this.field2268 = var1.method265();
        this.field2266 = var1.method268();
        var1.method267();
        this.field2265 = var1.method261();
        this.field2261 = var1.method261();
        int var5 = var1.method309();
        if (var5 > 0) {
            this.field2263 = new ArrayList<>(var5);

            for (int var6 = 0; var6 < var5; ++var6) {
                class404 var7 = new class404();
                if (this.field2267) {
                    var1.method265();
                }

                if (this.field2262) {
                    var7.field2862 = new class358(var1.method268());
                }

                var7.field2863 = var1.method261();
                var7.field2864 = var1.method309();
                if (var4 >= 3) {
                    var1.method267();
                }

                this.field2263.add(var6, var7);
            }
        }

    }
}
