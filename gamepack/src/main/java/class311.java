import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class311 extends class387 {
    HashSet<class248> field2257;
    HashSet<class123> field2258;
    List<class405> field2259;

    class311() {
    }

    static void method1371(boolean var0) {
        if (!class268.field1973.method2305() && !class268.field1973.method2306() && !class268.field1973.method2324((byte) 116)) {
            class500.field3669 = class32.field383;
            class500.field3667 = class32.field384;
            class500.field3668 = class32.field346;
            class500.method2256(2);
            if (var0) {
                class500.field3671 = "";
            }

            if (null == class500.field3678 || class500.field3678.length() <= 0) {
                if (class290.field2121.method2540() != null) {
                    class500.field3678 = class290.field2121.method2540();
                    Client.field3829 = true;
                } else {
                    Client.field3829 = false;
                }
            }

            class500.method2262();
        } else {
            class500.method2256(10);
        }
    }

    static void method1370(boolean var0) {
        byte var2 = 0;
        boolean var3 = class290.field2121.method2541() >= Client.field3780;
        if (!var3) {
            var2 = 12;
        } else if (class268.field1973.method2305() || class268.field1973.method2306() || class268.field1973.method2324((byte) 106)) {
            var2 = 10;
        }

        class500.method2256(var2);
        if (var0) {
            class500.field3678 = "";
            class500.field3671 = "";
            class386.field2764 = 0;
            class349.field2533 = "";
        }

        if (null == class500.field3678 || class500.field3678.length() <= 0) {
            if (class290.field2121.method2540() != null) {
                class500.field3678 = class290.field2121.method2540();
                Client.field3829 = true;
            } else {
                Client.field3829 = false;
            }
        }

        if (Client.field3829 && class500.field3678 != null && class500.field3678.length() > 0) {
            class500.field3676 = 1;
        } else {
            class500.field3676 = 0;
        }

    }

    void method1369(class78 var1, class78 var2, int var3, boolean var4) {
        this.method1785(var1, var3);
        int var6 = var2.method309();
        this.field2257 = new HashSet<>(var6);

        int var7;
        for (var7 = 0; var7 < var6; ++var7) {
            class248 var8 = new class248();

            try {
                var8.method1111(var2);
            } catch (IllegalStateException var12) {
                continue;
            }

            this.field2257.add(var8);
        }

        var7 = var2.method309();
        this.field2258 = new HashSet<>(var7);

        for (int var13 = 0; var13 < var7; ++var13) {
            class123 var9 = new class123();

            try {
                var9.method557(var2);
            } catch (IllegalStateException var11) {
                continue;
            }

            this.field2258.add(var9);
        }

        this.method1368(var2, var4);
    }

    void method1368(class78 var1, boolean var2) {
        this.field2259 = new LinkedList<>();
        int var4 = var1.method309();

        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method308();
            class258 var7 = new class258(var1.method264());
            boolean var8 = var1.method260() == 1;
            if (var2 || !var8) {
                this.field2259.add(new class405(null, var7, var6, null));
            }
        }

    }
}
