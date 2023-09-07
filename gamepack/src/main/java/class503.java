public class class503 extends class490 {
    class124 field3691;
    int field3692;
    int field3693;
    int field3694;
    int field3695;
    int field3696;
    int field3697;
    int field3698;
    int field3699;

    class503(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class490 var9) {
        this.field3694 = var1;
        this.field3692 = var2;
        this.field3693 = var3;
        this.field3697 = var4;
        this.field3695 = var5;
        this.field3696 = var6;
        if (var7 != -1) {
            this.field3691 = class124.method575(var7);
            this.field3698 = 0;
            this.field3699 = Client.field4078 - 1;
            if (this.field3691.field1139 == 0 && null != var9 && var9 instanceof class503) {
                class503 var10 = (class503) var9;
                if (this.field3691 == var10.field3691) {
                    this.field3698 = var10.field3698;
                    this.field3699 = var10.field3699;
                    return;
                }
            }

            if (var8 && this.field3691.field1128 != -1) {
                if (!this.field3691.method574()) {
                    this.field3698 = (int) (Math.random() * (double) this.field3691.field1124.length);
                    this.field3699 -= (int) (Math.random() * (double) this.field3691.field1135[this.field3698]);
                } else {
                    this.field3698 = (int) (Math.random() * (double) this.field3691.method571());
                }
            }
        }

    }

    static int method2275(int var0, class443 var1, boolean var2) {
        class97 var4 = var2 ? class325.field2365 : class140.field1233;
        if (var0 == 1700) {
            class269.field1988[++class56.field597 - 1] = var4.field919;
            return 1;
        } else if (var0 == 1701) {
            if (var4.field919 != -1) {
                class269.field1988[++class56.field597 - 1] = var4.field920;
            } else {
                class269.field1988[++class56.field597 - 1] = 0;
            }

            return 1;
        } else if (var0 == 1702) {
            class269.field1988[++class56.field597 - 1] = var4.field910;
            return 1;
        } else if (var0 == 1707) {
            class269.field1988[++class56.field597 - 1] = var4.method416() ? 1 : 0;
            return 1;
        } else if (var0 == 1708) {
            return class269.method1197(var4);
        } else {
            return var0 == 1709 ? class269.method1207(var4) : 2;
        }
    }

    @Override
    protected final class448 method2238() {
        int var3;
        if (null != this.field3691) {
            int var2 = Client.field4078 - this.field3699;
            if (var2 > 100 && this.field3691.field1128 > 0) {
                var2 = 100;
            }

            if (this.field3691.method574()) {
                var3 = this.field3691.method571();
                this.field3698 += var2;
                var2 = 0;
                if (this.field3698 >= var3) {
                    this.field3698 = var3 - this.field3691.field1128;
                    if (this.field3698 < 0 || this.field3698 > var3) {
                        this.field3691 = null;
                    }
                }
            } else {
                label69:
                {
                    do {
                        do {
                            if (var2 <= this.field3691.field1135[this.field3698]) {
                                break label69;
                            }

                            var2 -= this.field3691.field1135[this.field3698];
                            ++this.field3698;
                        } while (this.field3698 < this.field3691.field1124.length);

                        this.field3698 -= this.field3691.field1128;
                    } while (this.field3698 >= 0 && this.field3698 < this.field3691.field1124.length);

                    this.field3691 = null;
                }
            }

            this.field3699 = Client.field4078 - var2;
        }

        class304 var13 = class192.method892(this.field3694, (byte) 42);
        if (var13.field2216 != null) {
            var13 = var13.method1346();
        }

        if (null == var13) {
            return null;
        } else {
            int var4;
            if (this.field3693 != 1 && this.field3693 != 3) {
                var3 = var13.field2190;
                var4 = var13.field2175;
            } else {
                var3 = var13.field2175;
                var4 = var13.field2190;
            }

            int var5 = this.field3695 + (var3 >> 1);
            int var6 = (var3 + 1 >> 1) + this.field3695;
            int var7 = this.field3696 + (var4 >> 1);
            int var8 = this.field3696 + (var4 + 1 >> 1);
            int[][] var9 = class122.field1107[this.field3697];
            int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
            int var11 = (this.field3695 << 7) + (var3 << 6);
            int var12 = (this.field3696 << 7) + (var4 << 6);
            return var13.method1344(this.field3692, this.field3693, var9, var11, var10, var12, this.field3691, this.field3698);
        }
    }
}
