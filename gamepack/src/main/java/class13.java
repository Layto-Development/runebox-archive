import java.util.concurrent.Future;

public class class13 {
    protected static String field55;
    static class135 field57;
    String field56;
    Future field58;

    class13(Future var1) {
        this.field58 = var1;
    }

    class13(String var1) {
        this.method33(var1);
    }

    void method33(String var1) {
        if (null == var1) {
            var1 = "";
        }

        this.field56 = var1;
        if (null != this.field58) {
            this.field58.cancel(true);
            this.field58 = null;
        }

    }

    public final String method37() {
        return this.field56;
    }

    public boolean method35() {
        return null != this.field56 || this.field58 == null;
    }

    public final boolean method34() {
        return this.method35() || this.field58.isDone();
    }

    public final class69 method36() {
        if (this.method35()) {
            return new class69(this.field56);
        } else if (!this.method34()) {
            return null;
        } else {
            try {
                return (class69) this.field58.get();
            } catch (Exception var4) {
                String var3 = "Error retrieving REST request reply";
                System.err.println(var3 + "\r\n" + var4);
                this.method33(var3);
                return new class69(var3);
            }
        }
    }
}
