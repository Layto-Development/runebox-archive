public class class154 {
    static class539[] field1334;

    static {
        new class154();
    }

    float field1322;
    float field1323;
    float field1324;
    float field1325;
    float field1326;
    float field1327;
    float field1328;
    float field1329;
    float field1330;
    float field1331;
    float field1332;
    float field1333;

    class154() {
        this.method721();
    }

    void method721() {
        this.field1333 = 0.0F;
        this.field1330 = 0.0F;
        this.field1331 = 0.0F;
        this.field1329 = 0.0F;
        this.field1332 = 0.0F;
        this.field1322 = 0.0F;
        this.field1325 = 0.0F;
        this.field1324 = 0.0F;
        this.field1323 = 0.0F;
        this.field1326 = 1.0F;
        this.field1327 = 1.0F;
        this.field1328 = 1.0F;
    }

    void method722(float var1) {
        float var3 = (float) Math.cos(var1);
        float var4 = (float) Math.sin(var1);
        float var5 = this.field1323;
        float var6 = this.field1327;
        float var7 = this.field1329;
        float var8 = this.field1330;
        this.field1323 = var5 * var3 - var4 * this.field1324;
        this.field1324 = var3 * this.field1324 + var5 * var4;
        this.field1327 = var6 * var3 - this.field1322 * var4;
        this.field1322 = var6 * var4 + this.field1322 * var3;
        this.field1329 = var3 * var7 - var4 * this.field1326;
        this.field1326 = var7 * var4 + this.field1326 * var3;
        this.field1330 = var3 * var8 - var4 * this.field1333;
        this.field1333 = var8 * var4 + this.field1333 * var3;
    }

    void method725(float var1) {
        float var3 = (float) Math.cos(var1);
        float var4 = (float) Math.sin(var1);
        float var5 = this.field1328;
        float var6 = this.field1325;
        float var7 = this.field1332;
        float var8 = this.field1331;
        this.field1328 = var4 * this.field1324 + var3 * var5;
        this.field1324 = this.field1324 * var3 - var5 * var4;
        this.field1325 = var4 * this.field1322 + var3 * var6;
        this.field1322 = this.field1322 * var3 - var4 * var6;
        this.field1332 = var7 * var3 + this.field1326 * var4;
        this.field1326 = this.field1326 * var3 - var4 * var7;
        this.field1331 = var3 * var8 + this.field1333 * var4;
        this.field1333 = this.field1333 * var3 - var8 * var4;
    }

    void method723(float var1) {
        float var3 = (float) Math.cos(var1);
        float var4 = (float) Math.sin(var1);
        float var5 = this.field1328;
        float var6 = this.field1325;
        float var7 = this.field1332;
        float var8 = this.field1331;
        this.field1328 = var3 * var5 - var4 * this.field1323;
        this.field1323 = var3 * this.field1323 + var4 * var5;
        this.field1325 = var6 * var3 - var4 * this.field1327;
        this.field1327 = var4 * var6 + var3 * this.field1327;
        this.field1332 = var3 * var7 - var4 * this.field1329;
        this.field1329 = this.field1329 * var3 + var4 * var7;
        this.field1331 = var3 * var8 - this.field1330 * var4;
        this.field1330 = this.field1330 * var3 + var8 * var4;
    }

    void method724(float var1, float var2, float var3) {
        this.field1331 += var1;
        this.field1330 += var2;
        this.field1333 += var3;
    }

    @Override
    public String toString() {
        return this.field1328 + "," + this.field1325 + "," + this.field1332 + "," + this.field1331 + "\n" + this.field1323 + "," + this.field1327 + "," + this.field1329 + "," + this.field1330 + "\n" + this.field1324 + "," + this.field1322 + "," + this.field1326 + "," + this.field1333;
    }
}
