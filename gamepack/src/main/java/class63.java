import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class class63 {
    static byte[][] field626;
    static byte[][] field627;
    static byte[][] field628;
    static byte[][] field629;
    static int field618;
    static int field619;
    static int field620;
    static int field621;
    static int field622;
    static int field623;
    static int field625;
    static int field630;
    static ArrayList<Integer> field624;

    static {
        field630 = 0;
        field620 = 0;
        field621 = 0;
        field622 = 0;
        field618 = 1000;
        field623 = 250;
        field619 = 100;
        field625 = 50;
        field626 = new byte[1000][];
        field627 = new byte[250][];
        field628 = new byte[100][];
        field629 = new byte[50][];
        field624 = new ArrayList<Integer>();
        method182();
        new HashMap();
    }

    class63() throws Throwable {
    }

    public static void method184(int[] var0, int[] var1) {
        if (null != var0 && var1 != null) {
            class186.field1534 = var0;
            class86.field736 = new int[var0.length];
            class130.field1151 = new byte[var0.length][][];

            for (int var3 = 0; var3 < class186.field1534.length; ++var3) {
                class130.field1151[var3] = new byte[var1[var3]][];
                field624.add(var0[var3]);
            }

            Collections.sort(field624);
        } else {
            class186.field1534 = null;
            class86.field736 = null;
            class130.field1151 = null;
            method182();
        }
    }

    static void method182() {
        field624.clear();
        field624.add(100);
        field624.add(5000);
        field624.add(10000);
        field624.add(30000);
    }

    public static synchronized byte[] method181(int var0, boolean var1) {
        byte[] var5;
        if ((var0 == 100 || var0 < 100 && var1) && field630 > 0) {
            var5 = field626[--field630];
            field626[field630] = null;
            return var5;
        } else if ((var0 == 5000 || var0 < 5000 && var1) && field620 > 0) {
            var5 = field627[--field620];
            field627[field620] = null;
            return var5;
        } else if ((var0 == 10000 || var0 < 10000 && var1) && field621 > 0) {
            var5 = field628[--field621];
            field628[field621] = null;
            return var5;
        } else if ((var0 == 30000 || var0 < 30000 && var1) && field622 > 0) {
            var5 = field629[--field622];
            field629[field622] = null;
            return var5;
        } else {
            int var3;
            if (null != class130.field1151) {
                for (var3 = 0; var3 < class186.field1534.length; ++var3) {
                    if ((var0 == class186.field1534[var3] || var0 < class186.field1534[var3] && var1) && class86.field736[var3] > 0) {
                        byte[] var4 = class130.field1151[var3][--class86.field736[var3]];
                        class130.field1151[var3][class86.field736[var3]] = null;
                        return var4;
                    }
                }
            }

            if (var1 && null != class186.field1534) {
                for (var3 = 0; var3 < class186.field1534.length; ++var3) {
                    if (var0 <= class186.field1534[var3] && class86.field736[var3] < class130.field1151[var3].length) {
                        return new byte[class186.field1534[var3]];
                    }
                }
            }

            return new byte[var0];
        }
    }

    public static synchronized byte[] method183(int var0) {
        return method181(var0, false);
    }

    public static synchronized void method185(byte[] var0) {
        if (var0.length == 100 && field630 < field618) {
            field626[++field630 - 1] = var0;
        } else if (var0.length == 5000 && field620 < field623) {
            field627[++field620 - 1] = var0;
        } else if (var0.length == 10000 && field621 < field619) {
            field628[++field621 - 1] = var0;
        } else if (var0.length == 30000 && field622 < field625) {
            field629[++field622 - 1] = var0;
        } else {
            if (null != class130.field1151) {
                for (int var2 = 0; var2 < class186.field1534.length; ++var2) {
                    if (class186.field1534[var2] == var0.length && class86.field736[var2] < class130.field1151[var2].length) {
                        class130.field1151[var2][class86.field736[var2]++] = var0;
                        return;
                    }
                }
            }

        }
    }
}
