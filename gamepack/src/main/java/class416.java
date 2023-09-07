public class class416 extends class337 {
    static String[] field2912;
    int field2911;
    long field2910;

    public class416(class337 var1, int var2) {
        super(var1);
        this.field2911 = var2;
        super.field2442 = "DelayFadeTask";
    }

    @Override
    public boolean method1595() {
        if (this.field2910 < (long) this.field2911) {
            ++this.field2910;
            return false;
        } else {
            return true;
        }
    }
}
