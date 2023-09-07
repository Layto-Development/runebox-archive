import java.util.Arrays;

public final class class534 {
    public static final class534 field4250;
    public static class534[] field4248;

    static {
        field4248 = new class534[0];
        method2575(100);
        field4250 = new class534();
    }

    public float[] field4249;

    public class534() {
        this.field4249 = new float[16];
        this.method2562();
    }

    public class534(class534 var1) {
        this.field4249 = new float[16];
        this.method2569(var1);
    }

    public class534(class78 var1, boolean var2) {
        this.field4249 = new float[16];
        this.method2570(var1, var2);
    }

    static void method2575(int var0) {
        class29.field161 = 100;
        field4248 = new class534[100];
        class326.field2367 = 0;
    }

    public void method2571() {
        synchronized (field4248) {
            if (class326.field2367 < class29.field161 - 1) {
                field4248[++class326.field2367 - 1] = this;
            }

        }
    }

    void method2570(class78 var1, boolean var2) {
        for (int var4 = 0; var4 < 16; ++var4) {
            this.field4249[var4] = var1.method266();
        }

    }

    float[] method2560() {
        float[] var2 = new float[3];
        if ((double) this.field4249[2] < 0.999D && (double) this.field4249[2] > -0.999D) {
            var2[1] = (float) (-Math.asin(this.field4249[2]));
            double var3 = Math.cos(var2[1]);
            var2[0] = (float) Math.atan2((double) this.field4249[6] / var3, (double) this.field4249[10] / var3);
            var2[2] = (float) Math.atan2((double) this.field4249[1] / var3, (double) this.field4249[0] / var3);
        } else {
            var2[0] = 0.0F;
            var2[1] = (float) Math.atan2(this.field4249[2], 0.0D);
            var2[2] = (float) Math.atan2(-this.field4249[9], this.field4249[5]);
        }

        return var2;
    }

    public float[] method2561() {
        float[] var2 = new float[]{(float) (-Math.asin(this.field4249[6])), 0.0F, 0.0F};
        double var3 = Math.cos(var2[0]);
        double var5;
        double var7;
        if (Math.abs(var3) > 0.005D) {
            var5 = this.field4249[2];
            var7 = this.field4249[10];
            double var9 = this.field4249[4];
            double var11 = this.field4249[5];
            var2[1] = (float) Math.atan2(var5, var7);
            var2[2] = (float) Math.atan2(var9, var11);
        } else {
            var5 = this.field4249[1];
            var7 = this.field4249[0];
            if (this.field4249[6] < 0.0F) {
                var2[1] = (float) Math.atan2(var5, var7);
            } else {
                var2[1] = (float) (-Math.atan2(var5, var7));
            }

            var2[2] = 0.0F;
        }

        return var2;
    }

    public void method2562() {
        this.field4249[0] = 1.0F;
        this.field4249[1] = 0.0F;
        this.field4249[2] = 0.0F;
        this.field4249[3] = 0.0F;
        this.field4249[4] = 0.0F;
        this.field4249[5] = 1.0F;
        this.field4249[6] = 0.0F;
        this.field4249[7] = 0.0F;
        this.field4249[8] = 0.0F;
        this.field4249[9] = 0.0F;
        this.field4249[10] = 1.0F;
        this.field4249[11] = 0.0F;
        this.field4249[12] = 0.0F;
        this.field4249[13] = 0.0F;
        this.field4249[14] = 0.0F;
        this.field4249[15] = 1.0F;
    }

    public void method2563() {
        this.field4249[0] = 0.0F;
        this.field4249[1] = 0.0F;
        this.field4249[2] = 0.0F;
        this.field4249[3] = 0.0F;
        this.field4249[4] = 0.0F;
        this.field4249[5] = 0.0F;
        this.field4249[6] = 0.0F;
        this.field4249[7] = 0.0F;
        this.field4249[8] = 0.0F;
        this.field4249[9] = 0.0F;
        this.field4249[10] = 0.0F;
        this.field4249[11] = 0.0F;
        this.field4249[12] = 0.0F;
        this.field4249[13] = 0.0F;
        this.field4249[14] = 0.0F;
        this.field4249[15] = 0.0F;
    }

    public void method2569(class534 var1) {
        System.arraycopy(var1.field4249, 0, this.field4249, 0, 16);
    }

    public void method2564(float var1) {
        this.method2565(var1, var1, var1);
    }

    public void method2565(float var1, float var2, float var3) {
        this.method2562();
        this.field4249[0] = var1;
        this.field4249[5] = var2;
        this.field4249[10] = var3;
    }

    public void method2566(class534 var1) {
        for (int var3 = 0; var3 < this.field4249.length; ++var3) {
            float[] var10000 = this.field4249;
            var10000[var3] += var1.field4249[var3];
        }

    }

    public void method2572(class534 var1) {
        float var3 = this.field4249[2] * var1.field4249[8] + var1.field4249[0] * this.field4249[0] + var1.field4249[4] * this.field4249[1] + var1.field4249[12] * this.field4249[3];
        float var4 = this.field4249[0] * var1.field4249[1] + var1.field4249[5] * this.field4249[1] + var1.field4249[9] * this.field4249[2] + this.field4249[3] * var1.field4249[13];
        float var5 = var1.field4249[14] * this.field4249[3] + this.field4249[2] * var1.field4249[10] + var1.field4249[6] * this.field4249[1] + var1.field4249[2] * this.field4249[0];
        float var6 = this.field4249[0] * var1.field4249[3] + var1.field4249[7] * this.field4249[1] + this.field4249[2] * var1.field4249[11] + this.field4249[3] * var1.field4249[15];
        float var7 = this.field4249[7] * var1.field4249[12] + this.field4249[4] * var1.field4249[0] + this.field4249[5] * var1.field4249[4] + var1.field4249[8] * this.field4249[6];
        float var8 = this.field4249[6] * var1.field4249[9] + var1.field4249[1] * this.field4249[4] + var1.field4249[5] * this.field4249[5] + this.field4249[7] * var1.field4249[13];
        float var9 = this.field4249[7] * var1.field4249[14] + this.field4249[5] * var1.field4249[6] + this.field4249[4] * var1.field4249[2] + var1.field4249[10] * this.field4249[6];
        float var10 = var1.field4249[15] * this.field4249[7] + this.field4249[6] * var1.field4249[11] + this.field4249[4] * var1.field4249[3] + this.field4249[5] * var1.field4249[7];
        float var11 = var1.field4249[12] * this.field4249[11] + this.field4249[10] * var1.field4249[8] + var1.field4249[4] * this.field4249[9] + this.field4249[8] * var1.field4249[0];
        float var12 = this.field4249[11] * var1.field4249[13] + this.field4249[9] * var1.field4249[5] + var1.field4249[1] * this.field4249[8] + var1.field4249[9] * this.field4249[10];
        float var13 = var1.field4249[14] * this.field4249[11] + this.field4249[9] * var1.field4249[6] + var1.field4249[2] * this.field4249[8] + this.field4249[10] * var1.field4249[10];
        float var14 = var1.field4249[15] * this.field4249[11] + var1.field4249[11] * this.field4249[10] + var1.field4249[7] * this.field4249[9] + this.field4249[8] * var1.field4249[3];
        float var15 = this.field4249[14] * var1.field4249[8] + var1.field4249[0] * this.field4249[12] + this.field4249[13] * var1.field4249[4] + this.field4249[15] * var1.field4249[12];
        float var16 = var1.field4249[13] * this.field4249[15] + var1.field4249[5] * this.field4249[13] + this.field4249[12] * var1.field4249[1] + var1.field4249[9] * this.field4249[14];
        float var17 = this.field4249[14] * var1.field4249[10] + var1.field4249[6] * this.field4249[13] + this.field4249[12] * var1.field4249[2] + var1.field4249[14] * this.field4249[15];
        float var18 = var1.field4249[15] * this.field4249[15] + var1.field4249[3] * this.field4249[12] + this.field4249[13] * var1.field4249[7] + var1.field4249[11] * this.field4249[14];
        this.field4249[0] = var3;
        this.field4249[1] = var4;
        this.field4249[2] = var5;
        this.field4249[3] = var6;
        this.field4249[4] = var7;
        this.field4249[5] = var8;
        this.field4249[6] = var9;
        this.field4249[7] = var10;
        this.field4249[8] = var11;
        this.field4249[9] = var12;
        this.field4249[10] = var13;
        this.field4249[11] = var14;
        this.field4249[12] = var15;
        this.field4249[13] = var16;
        this.field4249[14] = var17;
        this.field4249[15] = var18;
    }

    public void method2573(class290 var1) {
        float var3 = var1.field2115 * var1.field2115;
        float var4 = var1.field2119 * var1.field2115;
        float var5 = var1.field2115 * var1.field2118;
        float var6 = var1.field2120 * var1.field2115;
        float var7 = var1.field2119 * var1.field2119;
        float var8 = var1.field2119 * var1.field2118;
        float var9 = var1.field2120 * var1.field2119;
        float var10 = var1.field2118 * var1.field2118;
        float var11 = var1.field2118 * var1.field2120;
        float var12 = var1.field2120 * var1.field2120;
        this.field4249[0] = var7 + var3 - var12 - var10;
        this.field4249[1] = var8 + var6 + var8 + var6;
        this.field4249[2] = var9 - var5 - var5 + var9;
        this.field4249[4] = var8 - var6 - var6 + var8;
        this.field4249[5] = var3 + var10 - var7 - var12;
        this.field4249[6] = var4 + var11 + var4 + var11;
        this.field4249[8] = var9 + var5 + var9 + var5;
        this.field4249[9] = var11 - var4 - var4 + var11;
        this.field4249[10] = var12 + var3 - var10 - var7;
    }

    void method2559(class154 var1) {
        this.field4249[0] = var1.field1328;
        this.field4249[1] = var1.field1323;
        this.field4249[2] = var1.field1324;
        this.field4249[3] = 0.0F;
        this.field4249[4] = var1.field1325;
        this.field4249[5] = var1.field1327;
        this.field4249[6] = var1.field1322;
        this.field4249[7] = 0.0F;
        this.field4249[8] = var1.field1332;
        this.field4249[9] = var1.field1329;
        this.field4249[10] = var1.field1326;
        this.field4249[11] = 0.0F;
        this.field4249[12] = var1.field1331;
        this.field4249[13] = var1.field1330;
        this.field4249[14] = var1.field1333;
        this.field4249[15] = 1.0F;
    }

    float method2567() {
        return this.field4249[12] * this.field4249[9] * this.field4249[6] * this.field4249[3] + (this.field4249[8] * this.field4249[7] * this.field4249[2] * this.field4249[13] + this.field4249[8] * this.field4249[1] * this.field4249[6] * this.field4249[15] + this.field4249[14] * this.field4249[11] * this.field4249[4] * this.field4249[1] + (this.field4249[0] * this.field4249[7] * this.field4249[9] * this.field4249[14] + this.field4249[15] * this.field4249[5] * this.field4249[0] * this.field4249[10] - this.field4249[0] * this.field4249[5] * this.field4249[11] * this.field4249[14] - this.field4249[15] * this.field4249[0] * this.field4249[6] * this.field4249[9] + this.field4249[13] * this.field4249[0] * this.field4249[6] * this.field4249[11] - this.field4249[10] * this.field4249[0] * this.field4249[7] * this.field4249[13] - this.field4249[15] * this.field4249[4] * this.field4249[1] * this.field4249[10]) - this.field4249[12] * this.field4249[1] * this.field4249[6] * this.field4249[11] - this.field4249[7] * this.field4249[1] * this.field4249[8] * this.field4249[14] + this.field4249[12] * this.field4249[10] * this.field4249[7] * this.field4249[1] + this.field4249[15] * this.field4249[4] * this.field4249[2] * this.field4249[9] - this.field4249[13] * this.field4249[11] * this.field4249[4] * this.field4249[2] - this.field4249[15] * this.field4249[8] * this.field4249[2] * this.field4249[5] + this.field4249[11] * this.field4249[2] * this.field4249[5] * this.field4249[12] - this.field4249[9] * this.field4249[7] * this.field4249[2] * this.field4249[12] - this.field4249[14] * this.field4249[3] * this.field4249[4] * this.field4249[9] + this.field4249[13] * this.field4249[10] * this.field4249[4] * this.field4249[3] + this.field4249[14] * this.field4249[8] * this.field4249[5] * this.field4249[3] - this.field4249[12] * this.field4249[3] * this.field4249[5] * this.field4249[10] - this.field4249[6] * this.field4249[3] * this.field4249[8] * this.field4249[13]);
    }

    public void method2574() {
        float var2 = 1.0F / this.method2567();
        float var3 = (this.field4249[11] * this.field4249[6] * this.field4249[13] + (this.field4249[15] * this.field4249[5] * this.field4249[10] - this.field4249[14] * this.field4249[11] * this.field4249[5] - this.field4249[9] * this.field4249[6] * this.field4249[15]) + this.field4249[14] * this.field4249[7] * this.field4249[9] - this.field4249[7] * this.field4249[10] * this.field4249[13]) * var2;
        float var4 = (this.field4249[13] * this.field4249[3] * this.field4249[10] + (this.field4249[15] * -this.field4249[1] * this.field4249[10] + this.field4249[14] * this.field4249[11] * this.field4249[1] + this.field4249[9] * this.field4249[2] * this.field4249[15] - this.field4249[11] * this.field4249[2] * this.field4249[13] - this.field4249[14] * this.field4249[9] * this.field4249[3])) * var2;
        float var5 = (this.field4249[15] * this.field4249[6] * this.field4249[1] - this.field4249[1] * this.field4249[7] * this.field4249[14] - this.field4249[15] * this.field4249[2] * this.field4249[5] + this.field4249[2] * this.field4249[7] * this.field4249[13] + this.field4249[3] * this.field4249[5] * this.field4249[14] - this.field4249[13] * this.field4249[6] * this.field4249[3]) * var2;
        float var6 = (this.field4249[9] * this.field4249[3] * this.field4249[6] + (this.field4249[7] * this.field4249[1] * this.field4249[10] + this.field4249[11] * -this.field4249[1] * this.field4249[6] + this.field4249[11] * this.field4249[2] * this.field4249[5] - this.field4249[7] * this.field4249[2] * this.field4249[9] - this.field4249[5] * this.field4249[3] * this.field4249[10])) * var2;
        float var7 = (this.field4249[12] * this.field4249[10] * this.field4249[7] + (this.field4249[6] * this.field4249[8] * this.field4249[15] + this.field4249[15] * this.field4249[10] * -this.field4249[4] + this.field4249[4] * this.field4249[11] * this.field4249[14] - this.field4249[11] * this.field4249[6] * this.field4249[12] - this.field4249[14] * this.field4249[8] * this.field4249[7])) * var2;
        float var8 = (this.field4249[2] * this.field4249[11] * this.field4249[12] + (this.field4249[0] * this.field4249[10] * this.field4249[15] - this.field4249[14] * this.field4249[0] * this.field4249[11] - this.field4249[15] * this.field4249[2] * this.field4249[8]) + this.field4249[14] * this.field4249[8] * this.field4249[3] - this.field4249[3] * this.field4249[10] * this.field4249[12]) * var2;
        float var9 = (this.field4249[15] * this.field4249[2] * this.field4249[4] + this.field4249[15] * this.field4249[6] * -this.field4249[0] + this.field4249[0] * this.field4249[7] * this.field4249[14] - this.field4249[7] * this.field4249[2] * this.field4249[12] - this.field4249[3] * this.field4249[4] * this.field4249[14] + this.field4249[12] * this.field4249[3] * this.field4249[6]) * var2;
        float var10 = (this.field4249[10] * this.field4249[4] * this.field4249[3] + this.field4249[0] * this.field4249[6] * this.field4249[11] - this.field4249[10] * this.field4249[0] * this.field4249[7] - this.field4249[2] * this.field4249[4] * this.field4249[11] + this.field4249[7] * this.field4249[2] * this.field4249[8] - this.field4249[8] * this.field4249[6] * this.field4249[3]) * var2;
        float var11 = (this.field4249[15] * this.field4249[4] * this.field4249[9] - this.field4249[13] * this.field4249[4] * this.field4249[11] - this.field4249[15] * this.field4249[5] * this.field4249[8] + this.field4249[11] * this.field4249[5] * this.field4249[12] + this.field4249[13] * this.field4249[8] * this.field4249[7] - this.field4249[12] * this.field4249[9] * this.field4249[7]) * var2;
        float var12 = var2 * (this.field4249[15] * this.field4249[9] * -this.field4249[0] + this.field4249[13] * this.field4249[0] * this.field4249[11] + this.field4249[1] * this.field4249[8] * this.field4249[15] - this.field4249[11] * this.field4249[1] * this.field4249[12] - this.field4249[8] * this.field4249[3] * this.field4249[13] + this.field4249[9] * this.field4249[3] * this.field4249[12]);
        float var13 = (this.field4249[4] * this.field4249[3] * this.field4249[13] + this.field4249[12] * this.field4249[1] * this.field4249[7] + (this.field4249[15] * this.field4249[5] * this.field4249[0] - this.field4249[13] * this.field4249[0] * this.field4249[7] - this.field4249[1] * this.field4249[4] * this.field4249[15]) - this.field4249[12] * this.field4249[3] * this.field4249[5]) * var2;
        float var14 = var2 * (this.field4249[8] * this.field4249[3] * this.field4249[5] + (-this.field4249[0] * this.field4249[5] * this.field4249[11] + this.field4249[9] * this.field4249[7] * this.field4249[0] + this.field4249[4] * this.field4249[1] * this.field4249[11] - this.field4249[8] * this.field4249[1] * this.field4249[7] - this.field4249[3] * this.field4249[4] * this.field4249[9]));
        float var15 = (this.field4249[12] * this.field4249[6] * this.field4249[9] + (this.field4249[14] * this.field4249[9] * -this.field4249[4] + this.field4249[13] * this.field4249[10] * this.field4249[4] + this.field4249[8] * this.field4249[5] * this.field4249[14] - this.field4249[12] * this.field4249[10] * this.field4249[5] - this.field4249[8] * this.field4249[6] * this.field4249[13])) * var2;
        float var16 = (this.field4249[13] * this.field4249[8] * this.field4249[2] + this.field4249[0] * this.field4249[9] * this.field4249[14] - this.field4249[13] * this.field4249[0] * this.field4249[10] - this.field4249[1] * this.field4249[8] * this.field4249[14] + this.field4249[1] * this.field4249[10] * this.field4249[12] - this.field4249[12] * this.field4249[2] * this.field4249[9]) * var2;
        float var17 = var2 * (-this.field4249[0] * this.field4249[5] * this.field4249[14] + this.field4249[6] * this.field4249[0] * this.field4249[13] + this.field4249[14] * this.field4249[1] * this.field4249[4] - this.field4249[6] * this.field4249[1] * this.field4249[12] - this.field4249[4] * this.field4249[2] * this.field4249[13] + this.field4249[2] * this.field4249[5] * this.field4249[12]);
        float var18 = (this.field4249[5] * this.field4249[0] * this.field4249[10] - this.field4249[0] * this.field4249[6] * this.field4249[9] - this.field4249[1] * this.field4249[4] * this.field4249[10] + this.field4249[1] * this.field4249[6] * this.field4249[8] + this.field4249[2] * this.field4249[4] * this.field4249[9] - this.field4249[8] * this.field4249[2] * this.field4249[5]) * var2;
        this.field4249[0] = var3;
        this.field4249[1] = var4;
        this.field4249[2] = var5;
        this.field4249[3] = var6;
        this.field4249[4] = var7;
        this.field4249[5] = var8;
        this.field4249[6] = var9;
        this.field4249[7] = var10;
        this.field4249[8] = var11;
        this.field4249[9] = var12;
        this.field4249[10] = var13;
        this.field4249[11] = var14;
        this.field4249[12] = var15;
        this.field4249[13] = var16;
        this.field4249[14] = var17;
        this.field4249[15] = var18;
    }

    @Override
    public String toString() {
        StringBuilder var1 = new StringBuilder();
        this.method2561();
        this.method2560();

        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; var3 < 4; ++var3) {
                if (var3 > 0) {
                    var1.append("\t");
                }

                float var4 = this.field4249[var2 * 4 + var3];
                if (Math.sqrt(var4 * var4) < 9.999999747378752E-5D) {
                    var4 = 0.0F;
                }

                var1.append(var4);
            }

            var1.append("\n");
        }

        return var1.toString();
    }

    @Override
    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = var2 * 31 + Arrays.hashCode(this.field4249);
        return var3;
    }

    @Override
    public boolean equals(Object var1) {
        if (!(var1 instanceof class534)) {
            return false;
        } else {
            class534 var2 = (class534) var1;

            for (int var3 = 0; var3 < 16; ++var3) {
                if (this.field4249[var3] != var2.field4249[var3]) {
                    return false;
                }
            }

            return true;
        }
    }

    public float[] method2568() {
        float[] var2 = new float[3];
        class351 var3 = new class351(this.field4249[0], this.field4249[1], this.field4249[2]);
        class351 var4 = new class351(this.field4249[4], this.field4249[5], this.field4249[6]);
        class351 var5 = new class351(this.field4249[8], this.field4249[9], this.field4249[10]);
        var2[0] = var3.method1645();
        var2[1] = var4.method1645();
        var2[2] = var5.method1645();
        return var2;
    }
}
