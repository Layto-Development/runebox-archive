public class class222 extends class70 {
    static class539 field1762;
    class139 field1761;
    int field1757;
    int field1758;
    int[] field1759;
    int[][] field1760;

    public class222(int var1, byte[] var2) {
        this.field1757 = var1;
        class78 var3 = new class78(var2);
        this.field1758 = var3.method260();
        this.field1759 = new int[this.field1758];
        this.field1760 = new int[this.field1758][];

        int var4;
        for (var4 = 0; var4 < this.field1758; ++var4) {
            this.field1759[var4] = var3.method260();
        }

        for (var4 = 0; var4 < this.field1758; ++var4) {
            this.field1760[var4] = new int[var3.method260()];
        }

        for (var4 = 0; var4 < this.field1758; ++var4) {
            for (int var5 = 0; var5 < this.field1760[var4].length; ++var5) {
                this.field1760[var4][var5] = var3.method260();
            }
        }

        if (var3.field697 < var3.field695.length) {
            var4 = var3.method309();
            if (var4 > 0) {
                this.field1761 = new class139(var3, var4);
            }
        }

    }

    public int method1032() {
        return this.field1758;
    }

    public class139 method1031() {
        return this.field1761;
    }
}
