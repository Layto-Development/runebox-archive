import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class class4 implements class330 {
    static final class4 field10;
    static final class4 field11;
    static final class4 field12;
    static final class4 field13;
    static final class4 field14;
    static final class4 field15;
    static final class4 field16;
    static final class4 field17;
    static final class4 field18;
    static final class4 field23;
    static final class4 field7;
    static final class4 field8;
    static final class4 field9;
    static boolean field21;
    static int field22;

    static {
        field11 = new class4("", 0, new class370[]{class370.field2644, class370.field2642});
        field7 = new class4("", 1, new class370[]{class370.field2641, class370.field2644, class370.field2642});
        field8 = new class4("", 2, new class370[]{class370.field2641, class370.field2645, class370.field2644});
        field23 = new class4("", 3, new class370[]{class370.field2641});
        field10 = new class4("", 4);
        field12 = new class4("", 5, new class370[]{class370.field2641, class370.field2644});
        field13 = new class4("", 6, new class370[]{class370.field2644});
        field16 = new class4("", 8, new class370[]{class370.field2641, class370.field2644});
        field14 = new class4("", 9, new class370[]{class370.field2641, class370.field2645});
        field15 = new class4("", 10, new class370[]{class370.field2641});
        field9 = new class4("", 11, new class370[]{class370.field2641});
        field17 = new class4("", 12, new class370[]{class370.field2641, class370.field2644});
        field18 = new class4("", 13, new class370[]{class370.field2641});
        method4();
    }

    final int field19;
    final Set<class370> field20;

    class4(String var1, int var2) {
        this.field20 = new HashSet<>();
        this.field19 = var2;
    }

    class4(String var1, int var2, class370[] var3) {
        this.field20 = new HashSet<>();
        this.field19 = var2;
        class370[] var4 = var3;

		Collections.addAll(this.field20, var4);

    }

    static class4[] method4() {
        return new class4[]{field9, field18, field10, field14, field16, field23, field15, field17, field12, field7, field13, field8, field11};
    }

    static void method3(class137 var0) {
        if (var0.method619() != Client.field3802) {
            Client.field3802 = var0.method619();
            boolean var2 = var0.method619();
            if (class508.field3716 != var2) {
                class508.field3717.method1304();
                class508.field3762.method1304();
                class508.field3719.method1304();
                class508.field3716 = var2;
            }
        }

        if (var0.field1210 != Client.field3776) {
            class372 var4 = class398.field2811;
            int var3 = var0.field1210;
            if ((var3 & class373.field2688.method1533()) != 0) {
                class352.field2545 = class274.method1226(var4, "logo_deadman_mode", "");
            } else if ((var3 & class373.field2689.method1533()) != 0) {
                class352.field2545 = class274.method1226(var4, "logo_seasonal_mode", "");
            } else if ((var3 & class373.field2667.method1533()) != 0) {
                class352.field2545 = class274.method1226(var4, "logo_speedrunning", "");
            } else {
                class352.field2545 = class274.method1226(var4, "logo", "");
            }
        }

        class111.field1050 = var0.field1217;
        Client.field3775 = var0.field1214;
        Client.field3776 = var0.field1210;
        class458.field3150 = var0.field1221;
        class459.field3156 = Client.field3800 == 0 ? 43594 : 40000 + var0.field1214;
        class214.field1737 = Client.field3800 == 0 ? 443 : 50000 + var0.field1214;
        class155.field1335 = class459.field3156;
    }

    @Override
    public int method1533() {
        return this.field19;
    }
}
