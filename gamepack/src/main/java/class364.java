public class class364 {
    public boolean field2605;
    public class302 field2606;
    public int field2607;
    boolean field2608;
    int field2604;
    int field2609;
    int field2610;
    int field2611;
    int field2612;
    int field2613;
    int field2615;
    int field2616;
    int field2617;
    int[] field2614;

    class364() {
        this.field2608 = false;
        this.field2605 = true;
        this.field2611 = 0;
        this.field2607 = 512;
        this.field2614 = new int[1024];
    }

    void method1717() {
        this.field2604 = this.field2612 / 2;
        this.field2613 = this.field2610 / 2;
        this.field2609 = -this.field2604;
        this.field2615 = this.field2612 - this.field2604;
        this.field2616 = -this.field2613;
        this.field2617 = this.field2610 - this.field2613;
    }

    void method1719(int var1, int var2, int var3, int var4) {
        this.field2604 = var1 - var2;
        this.field2613 = var3 - var4;
        this.field2609 = -this.field2604;
        this.field2615 = this.field2612 - this.field2604;
        this.field2616 = -this.field2613;
        this.field2617 = this.field2610 - this.field2613;
    }

    void method1718(int var1, int var2, int var3) {
        this.field2608 = var1 < 0 || var1 > this.field2612 || var2 < 0 || var2 > this.field2612 || var3 < 0 || var3 > this.field2612;
    }
}
