public class class42 extends class510 {
    static int[] field527;
    public final int field528;
    public final int field529;
    public final int[] field530;
    public final int[] field531;

    class42(int var1, int var2, int[] var3, int[] var4, int var5) {
        this.field529 = var1;
        this.field528 = var2;
        this.field530 = var3;
        this.field531 = var4;
    }

    public boolean method117(int var1, int var2) {
        if (var2 >= 0 && var2 < this.field531.length) {
            int var4 = this.field531[var2];
            return var1 >= var4 && var1 <= this.field530[var2] + var4;
        }

        return false;
    }
}
