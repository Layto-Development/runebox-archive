import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class92 {
    static int field763;
    final class38 field760;
    final class78 field762;
    ExecutorService field761;
    Future field764;

    public class92(class78 var1, class38 var2) {
        this.field761 = Executors.newSingleThreadExecutor();
        this.field762 = var1;
        this.field760 = var2;
        this.method358();
    }

    public boolean method360() {
        return this.field764.isDone();
    }

    public void method357() {
        this.field761.shutdown();
        this.field761 = null;
    }

    public class78 method359() {
        try {
            return (class78) this.field764.get();
        } catch (Exception var3) {
            return null;
        }
    }

    void method358() {
        this.field764 = this.field761.submit(new class162(this, this.field762, this.field760));
    }
}
