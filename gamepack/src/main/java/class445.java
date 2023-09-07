public class class445 {
    final int field3024;
    final int[] field3020;
    final int[] field3026;
    final int[][] field3021;
    final int[][] field3025;
    int field3022;
    int field3023;

    public class445(int var1, int var2) {
        this.field3025 = new int[var1][var2];
        this.field3021 = new int[var1][var2];
        int var3 = var1 * var2;
        int var4 = class82.method332(var3 / 4);
        this.field3026 = new int[var4];
        this.field3020 = new int[var4];
        this.field3024 = var4 - 1;
    }

    void method2040() {
        for (int var2 = 0; var2 < this.field3025.length; ++var2) {
            for (int var3 = 0; var3 < this.field3025[var2].length; ++var3) {
                this.field3025[var2][var3] = 0;
                this.field3021[var2][var3] = 99999999;
            }
        }

    }

    void method2030(int var1, int var2) {
        this.field3022 = var1;
        this.field3023 = var2;
    }

    int method2031() {
        return this.field3022;
    }

    int method2032() {
        return this.field3023;
    }

    int method2033() {
        return this.field3025.length;
    }

    int method2038() {
        return this.field3025[0].length;
    }

    int[][] method2039() {
        return this.field3025;
    }

    int[][] method2034() {
        return this.field3021;
    }

    int[] method2035() {
        return this.field3026;
    }

    int[] method2036() {
        return this.field3020;
    }

    int method2037() {
        return this.field3024;
    }
}
