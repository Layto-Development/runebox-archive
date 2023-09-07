import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class188 {
    public static Comparator field1537;
    public static Comparator field1539;
    public static Comparator field1540;
    public static Comparator field1541;

    static {
        field1537 = new class429();
        new class220();
        field1541 = new class125();
        field1539 = new class526();
        field1540 = new class310();
    }

    public final List field1538;

    public class188(class78 var1, boolean var2) {
        int var3 = var1.method309();
        boolean var4 = var1.method260() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }

        int var6 = var1.method309();
        this.field1538 = new ArrayList(var6);

        for (int var7 = 0; var7 < var6; ++var7) {
            this.field1538.add(new class142(var1, var5, var3));
        }

    }

    public void method874(Comparator var1, boolean var2) {
        if (var2) {
            Collections.sort(this.field1538, var1);
        } else {
            Collections.sort(this.field1538, Collections.reverseOrder(var1));
        }

    }
}
