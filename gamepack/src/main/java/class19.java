import java.util.Comparator;

public class class19 implements Comparator {
    public static boolean[] field66;
    static int field67;

    class19() {
    }

    int method47(class384 var1, class384 var2) {
        return var1.field2761 - var2.field2761;
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method47((class384) var1, (class384) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
