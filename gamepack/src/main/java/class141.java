import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class141 {
    public static final List<Client> field1243;
    public static class68 field1235;
    public static class68 field1236;
    public static class68 field1239;
    public static int field1237;
    public static int field1244;
    public static int field1245;
    public static int field1246;
    public static ArrayList<class468> field1238;
    public static ArrayList<class537> field1240;
    public static ArrayList<class537> field1241;
    public static ArrayList<class337> field1242;
    public static LinkedList<class537> field1247;

    static {
        field1238 = null;
        field1247 = new LinkedList<>();
        field1240 = new ArrayList<>(3);
        field1241 = new ArrayList<>(3);
        field1242 = new ArrayList<>();
        field1243 = new ArrayList<>();
        field1244 = 0;
        field1245 = 0;
        field1246 = 0;
        field1237 = 0;
    }

    class141() throws Throwable {
    }

    public static void method651(class541 var0) {
        field1243.remove(var0);
    }

    public static void method648(ArrayList<class537> var0, int var1, int var2, int var3, int var4, boolean var5) {
        if (!var0.isEmpty()) {
            field1247.clear();
            field1242.clear();
            method652(var5);
            class288.method1302(var0, var5);
            if (!field1247.isEmpty()) {
                method654(var1, var2, var3, var4);
                field1242.add(new class392(null));
                field1242.add(new class298(null, field1235, field1236, field1239));
                ArrayList<class337> var7 = new ArrayList<class337>();
                var7.add(new class394(new class517(null, 0, true, field1237)));
                if (!field1240.isEmpty()) {
                    ArrayList<class337> var8 = new ArrayList<class337>();
                    var8.add(new class416(new class487(null, var7), field1246));
                    ArrayList<class537> var10 = new ArrayList<class537>();
                    Iterator<class537> var11 = field1240.iterator();

                    while (var11.hasNext()) {
                        class537 var12 = var11.next();
                        var10.add(var12);
                    }

                    var8.add(new class416(new class473(new class184(null, var10), 0, false, field1245), field1244));
                    field1242.add(new class487(null, var8));
                } else {
                    field1242.add(new class416(null, field1246));
                    field1242.add(new class487(null, var7));
                }

            }
        }
    }

    public static void method649(int var0, int var1, int var2, int var3) {
        if (field1240.size() > 1 && field1240.get(0) != null && field1240.get(0).field4273.method2162() && field1240.get(1) != null && field1240.get(1).field4273.method2162()) {
            method654(var0, var1, var2, var3);
            field1242.add(new class238(null));
            ArrayList<class337> var5 = new ArrayList<class337>();
            var5.add(new class416(new class517(null, 1, false, field1237), field1246));
            var5.add(new class416(new class473(null, 0, false, field1245), field1244));
            field1242.add(new class487(null, var5));
            if (field1241.get(0) != null && field1241.get(1) != null) {
                class537 var6 = field1241.get(0);
                field1241.set(0, field1240.get(1));
                field1241.set(1, var6);
            }
        }

    }

    public static boolean method650(int var0) {
        if (field1241.isEmpty()) {
            return false;
        } else {
            class537 var2 = field1241.get(0);
            return var2 != null && var0 == var2.field4267;
        }
    }

    public static boolean method653() {
        boolean var1 = false;
        boolean var2 = false;
        if (!field1242.isEmpty()) {
            class337 var3 = field1242.get(0);
            if (var3 == null) {
                field1242.remove(0);
            } else if (var3.method1595()) {
                if (var3.method1596()) {
                    System.out.println("Error in midimanager.service: " + var3.method1594());
                    var1 = true;
                } else {
                    if (var3.method1597() != null) {
                        field1242.add(1, var3.method1597());
                    }

                    var2 = var3.method1599();
                }

                field1242.remove(0);
            } else {
                var2 = var3.method1599();
            }
        }

        if (var1) {
            field1242.clear();
            method655();
        }

        return var2;
    }

    public static void method654(int var0, int var1, int var2, int var3) {
        field1244 = var0;
        field1245 = var1;
        field1246 = var2;
        field1237 = var3;
    }

    static void method655() {
        Iterator<class537> var1 = field1240.iterator();

        while (true) {
            class537 var2;
            do {
                if (!var1.hasNext()) {
                    field1240.clear();
                    return;
                }

                var2 = var1.next();
            } while (null == var2);

            var2.field4273.method2166();
            var2.field4273.method2164();
            var2.field4273.method2134(0);
            var2.field4273.field3347 = 0;
            int var3 = var2.field4267;
            int var4 = var2.field4268;
            Iterator<Client> var5 = field1243.iterator();

            while (var5.hasNext()) {
                class541 var6 = var5.next();
                var6.method2591(var3, var4);
            }
        }
    }

    static void method652(boolean var0) {
        if (var0) {
            method655();
        } else {
            for (int var2 = 0; var2 < field1240.size(); ++var2) {
                class537 var3 = field1240.get(var2);
                if (var3 == null) {
                    field1240.remove(var2);
                    --var2;
                } else if (var3.field4275) {
                    if (var3.field4273.field3347 > 0) {
                        --var3.field4273.field3347;
                    }

                    var3.field4273.method2166();
                    var3.field4273.method2164();
                    var3.field4273.method2134(0);
                    field1240.remove(var2);
                    --var2;
                } else {
                    var3.field4275 = true;
                }
            }
        }

    }
}
