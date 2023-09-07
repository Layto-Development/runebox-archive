public class class88 implements Runnable {
    static int field747;
    boolean field746;
    int field742;
    int[] field743;
    int[] field744;
    Object field741;
    long[] field745;

    class88() {
        this.field746 = true;
        this.field741 = new Object();
        this.field742 = 0;
        this.field743 = new int[500];
        this.field744 = new int[500];
        this.field745 = new long[500];
    }

    @Override
    public void run() {
        for (; this.field746; class316.method1394(50L)) {
            synchronized (this.field741) {
                if (this.field742 < 500) {
                    this.field743[this.field742] = class499.field3651;
                    this.field744[this.field742] = class499.field3634;
                    this.field745[this.field742] = class499.field3642;
                    ++this.field742;
                }
            }
        }

    }
}
