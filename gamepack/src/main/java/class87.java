import java.io.IOException;
import java.util.concurrent.Callable;

public class class87 implements Callable {
    // $FF: synthetic field
    final class127 this$0;
    final class189 field740;

    class87(class127 var1, class189 var2) {
        this.this$0 = var1;
        this.field740 = var2;
    }

    @Override
    public Object call() throws Exception {
        try {
            while (this.field740.method878()) {
                class316.method1394(10L);
            }
        } catch (IOException var2) {
            return new class69("Error servicing REST query: " + var2.getMessage());
        }

        return this.field740.method877();
    }
}
