import java.nio.ByteBuffer;

public class class181 extends class441 {
    ByteBuffer field1529;

    @Override
    byte[] method2010() {
        byte[] var2 = new byte[this.field1529.capacity()];
        this.field1529.position(0);
        this.field1529.get(var2);
        return var2;
    }

    @Override
    public void method2009(byte[] var1) {
        this.field1529 = ByteBuffer.allocateDirect(var1.length);
        this.field1529.position(0);
        this.field1529.put(var1);
    }
}
