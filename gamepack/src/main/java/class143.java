public final class class143 extends class490 {
    boolean field1255;
    class124 field1279;
    double field1265;
    double field1270;
    double field1271;
    double field1272;
    double field1273;
    double field1274;
    double field1275;
    double field1277;
    int field1253;
    int field1254;
    int field1256;
    int field1257;
    int field1258;
    int field1259;
    int field1260;
    int field1261;
    int field1262;
    int field1263;
    int field1264;
    int field1266;
    int field1267;
    int field1268;
    int field1269;
    int field1276;
    int field1278;
    int field1280;
    int field1281;

    class143(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        this.field1255 = false;
        this.field1280 = 0;
        this.field1281 = 0;
        this.field1266 = var1;
        this.field1254 = var2;
        this.field1264 = var3;
        this.field1253 = var4;
        this.field1262 = var5;
        this.field1278 = var6;
        this.field1263 = var7;
        this.field1256 = var8;
        this.field1268 = var9;
        this.field1267 = var10;
        this.field1258 = var11;
        this.field1255 = false;
        int var12 = class115.method525(this.field1266).field1063;
        if (var12 != -1) {
            this.field1279 = class124.method575(var12);
        } else {
            this.field1279 = null;
        }

    }

    class143(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
        this.field1269 = var10;
    }

    void method658(int var1, int var2, int var3, int var4) {
        this.field1259 = var1;
        this.field1260 = var2;
        this.field1261 = var3;
        double var6;
        if (!this.field1255) {
            var6 = this.field1259 - this.field1264;
            double var8 = this.field1260 - this.field1253;
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1277 = (double) this.field1264 + (double) this.field1268 * var6 / var10;
            this.field1270 = (double) this.field1253 + (double) this.field1268 * var8 / var10;
            this.field1271 = this.field1262;
        }

        var6 = this.field1263 + 1 - var4;
        this.field1272 = ((double) this.field1259 - this.field1277) / var6;
        this.field1273 = ((double) this.field1260 - this.field1270) / var6;
        this.field1274 = Math.sqrt(this.field1273 * this.field1273 + this.field1272 * this.field1272);
        if (!this.field1255) {
            this.field1275 = -this.field1274 * Math.tan((double) this.field1256 * 0.02454369D);
        }

        this.field1265 = ((double) this.field1261 - this.field1271 - this.field1275 * var6) * 2.0D / (var6 * var6);
    }

    void method659(int var1) {
        this.field1255 = true;
        this.field1277 += this.field1272 * (double) var1;
        this.field1270 += (double) var1 * this.field1273;
        this.field1271 += this.field1265 * 0.5D * (double) var1 * (double) var1 + (double) var1 * this.field1275;
        this.field1275 += this.field1265 * (double) var1;
        this.field1257 = (int) (Math.atan2(this.field1272, this.field1273) * 325.949D) + 1024 & 2047;
        this.field1276 = (int) (Math.atan2(this.field1275, this.field1274) * 325.949D) & 2047;
        if (this.field1279 != null) {
            if (!this.field1279.method574()) {
                this.field1281 += var1;

                while (true) {
                    do {
                        do {
                            if (this.field1281 <= this.field1279.field1135[this.field1280]) {
                                return;
                            }

                            this.field1281 -= this.field1279.field1135[this.field1280];
                            ++this.field1280;
                        } while (this.field1280 < this.field1279.field1124.length);

                        this.field1280 -= this.field1279.field1128;
                    } while (this.field1280 >= 0 && this.field1280 < this.field1279.field1124.length);

                    this.field1280 = 0;
                }
            } else {
                this.field1280 += var1;
                int var3 = this.field1279.method571();
                if (this.field1280 >= var3) {
                    this.field1280 = var3 - this.field1279.field1128;
                }
            }
        }

    }

    @Override
    protected class448 method2238() {
        class115 var2 = class115.method525(this.field1266);
        class448 var3 = var2.method521(this.field1280);
        if (null == var3) {
            return null;
        } else {
            var3.method2066(this.field1276);
            return var3;
        }
    }
}
