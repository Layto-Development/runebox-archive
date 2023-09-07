import java.util.zip.Inflater;

public class class116 {
    Inflater field1074;

    public class116() {
        this(-1, 1000000, 1000000);
    }

    class116(int var1, int var2, int var3) {
    }

    public void method526(class78 var1, byte[] var2) {
        if (var1.field695[var1.field697] == 31 && var1.field695[1 + var1.field697] == -117) {
            if (null == this.field1074) {
                this.field1074 = new Inflater(true);
            }

            try {
                this.field1074.setInput(var1.field695, var1.field697 + 10, var1.field695.length - (8 + var1.field697 + 10));
                this.field1074.inflate(var2);
            } catch (Exception var5) {
                this.field1074.reset();
                throw new RuntimeException("");
            }

            this.field1074.reset();
        } else {
            throw new RuntimeException("");
        }
    }
}
