public class class431 extends class278 {
    int field2935;

    class431() {
    }

    int method1969(class431 var1) {
        return this.field2935 - var1.field2935;
    }

    @Override
    public int method1251(class278 var1) {
        return this.method1969((class431) var1);
    }

    @Override
    public int compareTo(Object var1) {
        return this.method1969((class431) var1);
    }
}
