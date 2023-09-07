import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class45 {
    ExecutorService field534;
    Future field535;

    class45() {
        this.field534 = Executors.newSingleThreadExecutor();
        this.field535 = this.field534.submit(new class21());
    }

    void method131() {
        this.field534.shutdown();
        this.field534 = null;
    }

    boolean method129() {
        return this.field535.isDone();
    }

    SecureRandom method130() {
        try {
            return (SecureRandom) this.field535.get();
        } catch (Exception var5) {
            SecureRandom var4 = new SecureRandom();
            var4.nextInt();
            return var4;
        }
    }
}
