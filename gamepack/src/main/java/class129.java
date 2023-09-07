import java.util.HashMap;

public class class129 {
    static int[] field1149;
    class68 field1148;
    class68 field1150;
    HashMap<class24, class413> field1147;

    public class129(class68 var1, class68 var2) {
        this.field1150 = var1;
        this.field1148 = var2;
        this.field1147 = new HashMap<>();
    }

    public HashMap<class24, class413> method587(class24[] var1) {
        HashMap<class24, class413> var3 = new HashMap<>();
        class24[] var4 = var1;

        for (int var5 = 0; var5 < var4.length; ++var5) {
            class24 var6 = var4[var5];
            if (this.field1147.containsKey(var6)) {
                var3.put(var6, this.field1147.get(var6));
            } else {
                class68 var8 = this.field1150;
                class68 var9 = this.field1148;
                String var10 = var6.field128;
                class413 var7;
                if (!var8.method210(var10, "")) {
                    var7 = null;
                } else {
                    int var11 = var8.method213(var10);
                    int var12 = var8.method205(var11, "");
                    var7 = class274.method1229(var8, var9, var11, var12);
                }

                if (null != var7) {
                    this.field1147.put(var6, var7);
                    var3.put(var6, var7);
                }
            }
        }

        return var3;
    }
}
