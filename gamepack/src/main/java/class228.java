import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class class228 extends class510 {
    public static ThreadPoolExecutor field1788;
    static int field1787;
    public class222 field1785;
    public class329[][] field1790;
    boolean field1792;
    class329[][] field1784;
    int field1786;
    int field1791;
    List<Future<Object>> field1783;
    Future field1789;

    public class228(class68 var1, class68 var2, int var3, boolean var4) {
        this.field1790 = null;
        this.field1784 = null;
        this.field1786 = 0;
        this.field1791 = var3;
        byte[] var5 = var1.method188(this.field1791 >> 16 & 65535, this.field1791 & 65535);
        class78 var6 = new class78(var5);
        int var7 = var6.method260();
        int var8 = var6.method309();
        byte[] var9 = var2.method196(var8, 0);
        this.field1785 = new class222(var8, var9);
        this.field1783 = new ArrayList<>();
        this.field1789 = field1788.submit(new class528(this, var6, var7));
    }

    void method1040(class78 var1, int var2) {
        var1.method309();
        var1.method309();
        this.field1786 = var1.method260();
        int var4 = var1.method309();
        this.field1784 = new class329[this.field1785.method1031().method642()][];
        this.field1790 = new class329[this.field1785.method1032()][];
        class214[] var5 = new class214[var4];

        int var6;
        int var8;
        int var10;
        for (var6 = 0; var6 < var4; ++var6) {
            var8 = var1.method260();
            class478 var9 = (class478) class27.method80(class478.method2187(), var8);
            if (var9 == null) {
                var9 = class478.field3417;
            }

            var10 = var1.method271();
            int var12 = var1.method260();
            class245[] var13 = new class245[]{class245.field1872, class245.field1868, class245.field1869, class245.field1870, class245.field1876, class245.field1886, class245.field1873, class245.field1874, class245.field1884, class245.field1878, class245.field1877, class245.field1875, class245.field1879, class245.field1871, class245.field1880, class245.field1881, class245.field1882};
            class245 var14 = (class245) class27.method80(var13, var12);
            if (var14 == null) {
                var14 = class245.field1872;
            }

            class329 var19 = new class329();
            var19.method1525(var1, var2, (byte) -47);
            var5[var6] = new class214(this, var19, var9, var14, var10);
            int var15 = var9.method2186();
            class329[][] var16;
            if (class478.field3420 == var9) {
                var16 = this.field1784;
            } else {
                var16 = this.field1790;
            }

            if (null == var16[var10]) {
                var16[var10] = new class329[var15];
            }

            if (var9 == class478.field3416) {
                this.field1792 = true;
            }
        }

        var6 = var4 / class309.field2256;
        int var7 = var4 % class309.field2256;
        int var17 = 0;

        for (var10 = 0; var10 < class309.field2256; ++var10) {
            var8 = var17;
            var17 += var6;
            if (var7 > 0) {
                ++var17;
                --var7;
            }

            if (var17 == var8) {
                break;
            }

            this.field1783.add(field1788.submit(new class472(this, var8, var17, var5)));
        }

    }

    public boolean method1046() {
        if (null == this.field1789 && null == this.field1783) {
            return true;
        } else {
            if (this.field1789 != null) {
                if (!this.field1789.isDone()) {
                    return false;
                }

                this.field1789 = null;
            }

            boolean var2 = true;

            for (int var3 = 0; var3 < this.field1783.size(); ++var3) {
                if (!this.field1783.get(var3).isDone()) {
                    var2 = false;
                } else {
                    this.field1783.remove(var3);
                    --var3;
                }
            }

            if (!var2) {
                return false;
            } else {
                this.field1783 = null;
                return true;
            }
        }
    }

    public int method1041() {
        return this.field1786;
    }

    public boolean method1042() {
        return this.field1792;
    }

    public void method1043(int var1, class321 var2, int var3, int var4) {
        class534 var6;
        synchronized (class534.field4248) {
            if (class326.field2367 == 0) {
                var6 = new class534();
            } else {
                class534.field4248[--class326.field2367].method2562();
                var6 = class534.field4248[class326.field2367];
            }
        }

        this.method1039(var6, var3, var2, var1);
        this.method1045(var6, var3, var2, var1);
        this.method1044(var6, var3, var2, var1);
        var2.method1415(var6);
        var6.method2571();
    }

    void method1039(class534 var1, int var2, class321 var3, int var4) {
        float[] var6 = var3.method1418(this.field1786);
        float var7 = var6[0];
        float var8 = var6[1];
        float var9 = var6[2];
        if (this.field1784[var2] != null) {
            class329 var10 = this.field1784[var2][0];
            class329 var11 = this.field1784[var2][1];
            class329 var12 = this.field1784[var2][2];
            if (null != var10) {
                var7 = var10.method1527(var4);
            }

            if (var11 != null) {
                var8 = var11.method1527(var4);
            }

            if (null != var12) {
                var9 = var12.method1527(var4);
            }
        }

        class290 var18 = class290.method1313();
        var18.method1309(1.0F, 0.0F, 0.0F, var7);
        class290 var19 = class290.method1313();
        var19.method1309(0.0F, 1.0F, 0.0F, var8);
        class290 var20 = class290.method1313();
        var20.method1309(0.0F, 0.0F, 1.0F, var9);
        class290 var13 = class290.method1313();
        var13.method1311(var20);
        var13.method1311(var18);
        var13.method1311(var19);
        class534 var14;
        synchronized (class534.field4248) {
            if (class326.field2367 == 0) {
                var14 = new class534();
            } else {
                class534.field4248[--class326.field2367].method2562();
                var14 = class534.field4248[class326.field2367];
            }
        }

        var14.method2573(var13);
        var1.method2572(var14);
        var18.method1312();
        var19.method1312();
        var20.method1312();
        var13.method1312();
        var14.method2571();
    }

    void method1044(class534 var1, int var2, class321 var3, int var4) {
        float[] var6 = var3.method1419(this.field1786);
        float var7 = var6[0];
        float var8 = var6[1];
        float var9 = var6[2];
        if (this.field1784[var2] != null) {
            class329 var10 = this.field1784[var2][3];
            class329 var11 = this.field1784[var2][4];
            class329 var12 = this.field1784[var2][5];
            if (var10 != null) {
                var7 = var10.method1527(var4);
            }

            if (null != var11) {
                var8 = var11.method1527(var4);
            }

            if (null != var12) {
                var9 = var12.method1527(var4);
            }
        }

        var1.field4249[12] = var7;
        var1.field4249[13] = var8;
        var1.field4249[14] = var9;
    }

    void method1045(class534 var1, int var2, class321 var3, int var4) {
        float[] var6 = var3.method1420(this.field1786);
        float var7 = var6[0];
        float var8 = var6[1];
        float var9 = var6[2];
        if (this.field1784[var2] != null) {
            class329 var10 = this.field1784[var2][6];
            class329 var11 = this.field1784[var2][7];
            class329 var12 = this.field1784[var2][8];
            if (var10 != null) {
                var7 = var10.method1527(var4);
            }

            if (var11 != null) {
                var8 = var11.method1527(var4);
            }

            if (var12 != null) {
                var9 = var12.method1527(var4);
            }
        }

        class534 var15;
        synchronized (class534.field4248) {
            if (class326.field2367 == 0) {
                var15 = new class534();
            } else {
                class534.field4248[--class326.field2367].method2562();
                var15 = class534.field4248[class326.field2367];
            }
        }

        var15.method2565(var7, var8, var9);
        var1.method2572(var15);
        var15.method2571();
    }
}
