public class class99 {
    static class331[] field941;
    final class372 field938;
    final int field939;
    int field940;

    class99(class372 var1, String var2) {
        this.field940 = 0;
        this.field938 = var1;
        this.field939 = var1.method200();
    }

    boolean method430() {
        this.field940 = 0;

        for (int var2 = 0; var2 < this.field939; ++var2) {
            if (!this.field938.method1754(var2) || this.field938.method1753(var2)) {
                ++this.field940;
            }
        }

        return this.field940 >= this.field939;
    }
}
