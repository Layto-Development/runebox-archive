public class class389 extends class70 {
    class5 field2778;

    public class389() {
        this.field2778 = null;
    }

    class389(class442 var1) {
        if (var1 != null) {
            this.field2778 = new class5(var1, null);
        }
    }

    public class389(class433 var1) {
        this.field2778 = new class5(null, var1);
    }

    public boolean method1806(byte var1) {
        return null == this.field2778;
    }

    public class433 method1808() {
        if (null != this.field2778 && this.field2778.field25.tryLock()) {
            class433 var2;
            try {
                var2 = this.method1805();
            } finally {
                this.field2778.field25.unlock();
            }

            return var2;
        } else {
            return null;
        }
    }

    public class433 method1807() {
        if (this.field2778 != null) {
            this.field2778.field25.lock();

            class433 var2;
            try {
                var2 = this.method1805();
            } finally {
                this.field2778.field25.unlock();
            }

            return var2;
        } else {
            return null;
        }
    }

    class433 method1805() {
        if (this.field2778.field24 == null) {
            this.field2778.field24 = this.field2778.field29.method2017(null);
            this.field2778.field29 = null;
        }

        return this.field2778.field24;
    }
}
