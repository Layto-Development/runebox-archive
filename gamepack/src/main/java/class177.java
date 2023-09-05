import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;
import java.net.Socket;

@ObfInfo(name = "qy")
public class class177 extends class112 {
	@ObfInfo(name = "ar", desc = "[[[I")
	static int[][][] field1627;
	@ObfInfo(name = "ae", desc = "Lqa;")
	class210 field1625;
	@ObfInfo(name = "ao", desc = "Lqh;")
	class364 field1624;
	@ObfInfo(name = "au", desc = "Ljava/net/Socket;")
	Socket field1626;

	@ObfInfo(name = "<init>", desc = "(Ljava/net/Socket;II)V")
	public class177(Socket var1, int var2, int var3) throws IOException {
		this.field1626 = var1;
		this.field1626.setSoTimeout(30000);
		this.field1626.setTcpNoDelay(true);
		this.field1626.setReceiveBufferSize(65536);
		this.field1626.setSendBufferSize(65536);
		this.field1625 = new class210(this.field1626.getInputStream(), var2);
		this.field1624 = new class364(this.field1626.getOutputStream(), var3);
	}

	@ObfInfo(name = "au", desc = "(IB)Z")
	public boolean method617(int var1) throws IOException {
		return this.field1625.method1161(var1);
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method619() throws IOException {
		return this.field1625.method1165();
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method621() throws IOException {
		return this.field1625.method1162();
	}

	@ObfInfo(name = "at", desc = "([BIIS)I")
	public int method618(byte[] var1, int var2, int var3) throws IOException {
		return this.field1625.method1163(var1, var2, var3);
	}

	@ObfInfo(name = "ac", desc = "([BIII)V")
	public void method620(byte[] var1, int var2, int var3) throws IOException {
		this.field1624.method1993(var1, var2, var3);
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method622() {
		this.field1624.method1992();

		try {
			this.field1626.close();
		} catch (IOException var3) {
		}

		this.field1625.method1164();
	}

	@ObfInfo(name = "finalize", desc = "()V")
	protected void finalize() {
		this.method622();
	}
}
