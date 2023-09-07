import java.util.List;

public class class102 extends class510 {
    public static class68 field1005;
    static class289 field1002;
    static class461 field1006;
    static class539 field1001;
    static List<Integer> field1004;

    static {
        field1002 = new class289(64);
    }

    public boolean field1003;

    class102() {
        this.field1003 = false;
    }

    public static class102 method494(int var0) {
        class102 var2 = (class102) field1002.method1307(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field1005.method188(19, var0);
            var2 = new class102();
            if (null != var3) {
                var2.method493(new class78(var3));
            }

            field1002.method1306(var2, var0);
            return var2;
        }
    }

    void method493(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            this.method492(var1, var3);
        }
    }

    void method492(class78 var1, int var2) {
        if (var2 == 2) {
            this.field1003 = true;
        }

    }
}
