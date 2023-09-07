import java.util.Comparator;

class class504 implements Comparator {
    static class68 field3700;
    // $FF: synthetic field
    final class342 this$0;

    class504(class342 var1) {
        this.this$0 = var1;
    }

    int method2276(class328 var1, class328 var2) {
        if (var1.field2391 > var2.field2391) {
            return 1;
        } else {
            return var1.field2391 < var2.field2391 ? -1 : 0;
        }
    }

    @Override
    public int compare(Object var1, Object var2) {
        return this.method2276((class328) var1, (class328) var2);
    }

    @Override
    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
