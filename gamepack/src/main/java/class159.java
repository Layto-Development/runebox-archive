import java.util.Arrays;

public class class159 {
    public static final class159 field1402;
    static final class159 field1400;
    static final class159 field1401;
    static final class159 field1403;
    static final class159 field1405;
    static final class159 field1406;
    static final class159 field1407;
    static final class159[] field1408;

    static {
        field1403 = new class159(6, 8, 8);
        field1401 = new class159(3, 16, 16);
        field1402 = new class159(0, 32, 32);
        field1400 = new class159(2, 48, 48);
        field1407 = new class159(4, 64, 64);
        field1405 = new class159(5, 96, 96);
        field1406 = new class159(1, 128, 128);
        field1408 = method793();
        Arrays.sort(field1408, new class268());
    }

    public final int field1404;
    public final int field1409;
    final int field1410;

    class159(int var1, int var2, int var3) {
        this.field1410 = var1;
        this.field1404 = var2;
        this.field1409 = var3;
    }

    static class159[] method793() {
        return new class159[]{field1402, field1406, field1400, field1401, field1407, field1405, field1403};
    }

    int method792() {
        return this.field1409 * this.field1404;
    }
}
