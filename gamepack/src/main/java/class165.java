import java.util.ArrayList;

public class class165 extends class438 {
    static int field1430;
    static String field1428;
    // $FF: synthetic field
    final class423 this$0;
    int field1429;

    class165(class423 var1) {
        this.this$0 = var1;
        this.field1429 = -1;
    }

    static void method807(ArrayList<Integer> var0, int var1, int var2, int var3, int var4) {
        if (!var0.isEmpty()) {
            int var6 = var0.get(0);
            if (var6 == -1 && !Client.field4047) {
                class443.method2021(0, 0);
            } else if (var6 != -1 && !class141.method650(var6) && class290.field2121.method2529() != 0) {
                ArrayList<class537> var7 = new ArrayList<>();

                for (int var8 = 0; var8 < var0.size(); ++var8) {
                    var7.add(new class537(class34.field491, var0.get(var8), 0, class290.field2121.method2529(), false));
                }

                if (Client.field4047) {
                    class141.field1241.clear();
                    class141.field1241.addAll(var7);
                    class141.method654(var1, var2, var3, var4);
                } else {
                    class141.method648(var7, var1, var2, var3, var4, false);
                }
            }

        }
    }

    @Override
    void method2006(class78 var1) {
        this.field1429 = var1.method309();
    }

    @Override
    void method2005(class133 var1) {
        var1.method600(this.field1429);
    }
}
