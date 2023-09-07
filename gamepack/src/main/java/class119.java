import java.io.IOException;
import java.net.Socket;

public class class119 extends class406 {

	static int[][][] field1432;

	class148 field1430;

	class486 field1429;

	Socket field1431;

	public class119(Socket var1, int var2, int var3) throws IOException {
		this.field1431 = var1;
		this.field1431.setSoTimeout(30000);
		this.field1431.setTcpNoDelay(true);
		this.field1431.setReceiveBufferSize(65536);
		this.field1431.setSendBufferSize(65536);
		this.field1430 = new class148(this.field1431.getInputStream(), var2);
		this.field1429 = new class486(this.field1431.getOutputStream(), var3);
	}

	@Override
	public boolean method2068(int var1) throws IOException {
		return this.field1430.method899(var1);
	}

	@Override
	public int method2070() throws IOException {
		return this.field1430.method903();
	}

	@Override
	public int method2072() throws IOException {
		return this.field1430.method900();
	}

	@Override
	public int method2069(byte[] var1, int var2, int var3) throws IOException {
		return this.field1430.method901(var1, var2, var3);
	}

	@Override
	public void method2071(byte[] var1, int var2, int var3) throws IOException {
		this.field1429.method2342(var1, 0, var3);
	}

	@Override
	public void method2073() {
		this.field1429.method2341();
		try {
			this.field1431.close();
		} catch (IOException var3) {
		}
		this.field1430.method902();
	}

	@Override
	protected void finalize() {
		this.method2073();
	}
}
