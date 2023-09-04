import java.nio.ByteBuffer;

public class class309 extends class134 {
   ByteBuffer field2551;

   byte[] method894() {
      byte[] var2 = new byte[this.field2551.capacity()];
      this.field2551.position(0);
      this.field2551.get(var2);
      return var2;
   }

   public void method893(byte[] var1) {
      this.field2551 = ByteBuffer.allocateDirect(var1.length);
      this.field2551.position(0);
      this.field2551.put(var1);
   }
}
