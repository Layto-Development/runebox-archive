import java.nio.ByteBuffer;

public class class382 extends class99 {

	ByteBuffer field3076;

	@Override
	byte[] method625() {
		byte[] var2 = new byte[this.field3076.capacity()];
		this.field3076.position(0);
		this.field3076.get(var2);
		return var2;
	}

	@Override
	public void method624(byte[] var1) {
		this.field3076 = ByteBuffer.allocateDirect(var1.length);
		this.field3076.position(0);
		this.field3076.put(var1);
	}
}
