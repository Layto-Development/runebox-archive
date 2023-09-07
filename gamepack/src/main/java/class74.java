public class class74 {
    static int[] field681;
    static int[] field683;
    static int[] field686;
    static int[] field687;

    static {
        field687 = new int[500];
        field681 = new int[500];
        field683 = new int[500];
        field686 = new int[500];
    }

    boolean field691;
    class222 field682;
    int field685;
    int[] field684;
    int[] field688;
    int[] field689;
    int[] field690;

    class74(byte[] var1, class222 var2) {
        this.field682 = null;
        this.field685 = -1;
        this.field691 = false;
        this.field682 = var2;
        class78 var3 = new class78(var1);
        class78 var4 = new class78(var1);
        var3.field697 = 2;
        int var5 = var3.method260();
        int var6 = -1;
        int var7 = 0;
        var4.field697 = var3.field697 + var5;

        int var8;
        for (var8 = 0; var8 < var5; ++var8) {
            int var9 = var3.method260();
            if (var9 > 0) {
                if (this.field682.field1759[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; --var10) {
                        if (this.field682.field1759[var10] == 0) {
                            field687[var7] = var10;
                            field681[var7] = 0;
                            field683[var7] = 0;
                            field686[var7] = 0;
                            ++var7;
                            break;
                        }
                    }
                }

                field687[var7] = var8;
                short var11 = 0;
                if (this.field682.field1759[var8] == 3) {
                    var11 = 128;
                }

                if ((var9 & 1) != 0) {
                    field681[var7] = var4.method271();
                } else {
                    field681[var7] = var11;
                }

                if ((var9 & 2) != 0) {
                    field683[var7] = var4.method271();
                } else {
                    field683[var7] = var11;
                }

                if ((var9 & 4) != 0) {
                    field686[var7] = var4.method271();
                } else {
                    field686[var7] = var11;
                }

                var6 = var8;
                ++var7;
                if (this.field682.field1759[var8] == 5) {
                    this.field691 = true;
                }
            }
        }

        if (var4.field697 != var1.length) {
        }

        this.field685 = var7;
        this.field684 = new int[var7];
        this.field688 = new int[var7];
        this.field689 = new int[var7];
        this.field690 = new int[var7];

        for (var8 = 0; var8 < var7; ++var8) {
            this.field684[var8] = field687[var8];
            this.field688[var8] = field681[var8];
            this.field689[var8] = field683[var8];
            this.field690[var8] = field686[var8];
        }

    }
}
