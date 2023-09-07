public class class308 extends class418 {
    long field2255;

    public class308() {
        this.field2255 = System.nanoTime();
    }

    @Override
    public void method1933() {
        this.field2255 = System.nanoTime();
    }

    @Override
    public int method1934(int var1, int var2) {
        long var4 = 1000000L * (long) var2;
        long var6 = this.field2255 - System.nanoTime();
        if (var6 < var4) {
            var6 = var4;
        }

        class316.method1394(var6 / 1000000L);
        long var8 = System.nanoTime();

        int var10;
        for (var10 = 0; var10 < 10 && (var10 < 1 || this.field2255 < var8); this.field2255 += 1000000L * (long) var1) {
            ++var10;
        }

        if (this.field2255 < var8) {
            this.field2255 = var8;
        }

        return var10;
    }
}
