import java.nio.ByteBuffer;

public class class26 extends class68 {
   ByteBuffer field262;

   byte[] method291() {
      byte[] var2 = new byte[this.field262.capacity()];
      this.field262.position(0);
      this.field262.get(var2);
      return var2;
   }

   public void method290(byte[] var1) {
      this.field262 = ByteBuffer.allocateDirect(var1.length);
      this.field262.position(0);
      this.field262.put(var1);
   }
}
