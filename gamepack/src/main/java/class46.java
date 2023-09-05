import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.nio.ByteBuffer;

@ObfInfo(name = "ms")
public class class46 extends class315 {
	@ObfInfo(name = "au", desc = "Ljava/nio/ByteBuffer;")
	ByteBuffer field563;

	@ObfInfo(name = "ae", desc = "(I)[B")
	byte[] method1735() {
		byte[] var2 = new byte[this.field563.capacity()];
		this.field563.position(0);
		this.field563.get(var2);
		return var2;
	}

	@ObfInfo(name = "ao", desc = "([BI)V")
	public void method1734(byte[] var1) {
		this.field563 = ByteBuffer.allocateDirect(var1.length);
		this.field563.position(0);
		this.field563.put(var1);
	}
}
