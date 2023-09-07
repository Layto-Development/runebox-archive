import java.lang.management.GarbageCollectorMXBean;

public class class481 {
    static GarbageCollectorMXBean field3462;
    public int field3460;
    public int field3461;
    public int field3463;
    public int field3464;
    public int field3465;
    public int field3466;
    public int field3467;
    public int field3468;
    public int field3469;
    public int field3470;
    public int field3471;

    public class481() {
        this.field3471 = -1;
        this.field3461 = -1;
        this.field3464 = -1;
        this.field3463 = -1;
        this.field3469 = -1;
        this.field3460 = -1;
        this.field3466 = -1;
        this.field3467 = -1;
        this.field3468 = -1;
        this.field3465 = -1;
        this.field3470 = -1;
    }

    public void method2228(class68 var1) {
        byte[] var3 = var1.method195(class7.field39.field38);
        class78 var4 = new class78(var3);

        while (true) {
            int var5 = var4.method260();
            if (var5 == 0) {
                return;
            }

            switch (var5) {
                case 1:
                    var4.method316();
                    break;
                case 2:
                    this.field3471 = var4.method308();
                    this.field3461 = var4.method308();
                    this.field3464 = var4.method308();
                    this.field3463 = var4.method308();
                    this.field3469 = var4.method308();
                    this.field3460 = var4.method308();
                    this.field3466 = var4.method308();
                    this.field3467 = var4.method308();
                    this.field3468 = var4.method308();
                    this.field3465 = var4.method308();
                    this.field3470 = var4.method308();
            }
        }
    }
}
