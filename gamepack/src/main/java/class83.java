import java.security.SecureRandom;

public final class class83 extends class490 {
    static SecureRandom field723;
    boolean field721;
    class124 field718;
    int field713;
    int field714;
    int field715;
    int field716;
    int field717;
    int field719;
    int field720;
    int field722;

    class83(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.field719 = 0;
        this.field720 = 0;
        this.field721 = false;
        this.field722 = var1;
        this.field715 = var2;
        this.field716 = var3;
        this.field717 = var4;
        this.field713 = var5;
        this.field714 = var7 + var6;
        int var8 = class115.method525(this.field722).field1063;
        if (var8 != -1) {
            this.field721 = false;
            this.field718 = class124.method575(var8);
        } else {
            this.field721 = true;
        }

    }

    void method334(int var1) {
        if (!this.field721) {
            this.field720 += var1;
            if (!this.field718.method574()) {
                while (this.field720 > this.field718.field1135[this.field719]) {
                    this.field720 -= this.field718.field1135[this.field719];
                    ++this.field719;
                    if (this.field719 >= this.field718.field1124.length) {
                        this.field721 = true;
                        break;
                    }
                }
            } else {
                this.field719 += var1;
                if (this.field719 >= this.field718.method571()) {
                    this.field721 = true;
                }
            }

        }
    }

    @Override
    protected class448 method2238() {
        class115 var2 = class115.method525(this.field722);
        class448 var3;
        if (!this.field721) {
            var3 = var2.method521(this.field719);
        } else {
            var3 = var2.method521(-1);
        }

        return var3;
    }
}
