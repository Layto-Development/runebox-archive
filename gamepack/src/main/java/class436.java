import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class436 extends class510 {
    class432[] field2964;
    List<HashMap<Object, Cloneable>> field2965;

    public class436(class68 var1, int var2, int var3) {
        byte[] var4 = var1.method188(var2, var3 + 1);
        this.method2003(new class78(var4));
    }

    public class436(class68 var1, int var2) {
        byte[] var3 = var1.method188(var2, 0);
        this.method2003(new class78(var3));
    }

    void method2003(class78 var1) {
        int var3 = var1.method276();
        this.field2964 = new class432[var3];
        this.field2965 = new ArrayList<>(var3);

        for (int var4 = 0; var4 < var3; ++var4) {
            this.field2964[var4] = (class432) class27.method80(class432.method1972(), var1.method260());
            int var5 = var1.method276();
            HashMap<Object, Cloneable> var6 = new HashMap<>(var5);

            while (var5-- > 0) {
                Object var7 = this.field2964[var4].method1971(var1);
                int var8 = var1.method276();
                ArrayList<Integer> var9 = new ArrayList<>();

                while (var8-- > 0) {
                    int var10 = var1.method276();
                    var9.add(var10);
                }

                var6.put(var7, var9);
            }

            this.field2965.add(var4, var6);
        }

    }

    public List<Integer> method2004(Object var1, int var2) {
        if (var2 < 0) {
            var2 = 0;
        }

        Map<Object, Cloneable> var4 = this.field2965.get(var2);
        return (List<Integer>) var4.get(var1);
    }
}
