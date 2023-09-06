import java.io.IOException;
import java.net.Socket;

public class class244 extends class431 {
	static int[][][] field2223;
	class260 field2221;
	class365 field2220;
	Socket field2222;

	public class244(Socket var1, int var2, int var3) throws IOException {
		this.field2222 = var1;
		this.field2222.setSoTimeout(30000);
		this.field2222.setTcpNoDelay(true);
		this.field2222.setReceiveBufferSize(65536);
		this.field2222.setSendBufferSize(65536);
		this.field2221 = new class260(this.field2222.getInputStream(), var2);
		this.field2220 = new class365(this.field2222.getOutputStream(), var3);
	}

	public boolean method2189(int var1) throws IOException {
		return this.field2221.method1511(var1);
	}

	public int method2191() throws IOException {
		return this.field2221.method1515();
	}

	public int method2193() throws IOException {
		return this.field2221.method1512();
	}

	public int method2190(byte[] var1, int var2, int var3) throws IOException {
		return this.field2221.method1513(var1, var2, var3);
	}

	public void method2192(byte[] var1, int var2, int var3) throws IOException {
		this.field2220.method1965(var1, var2, var3);
	}

	public void method2194() {
		this.field2220.method1964();

		try {
			this.field2222.close();
		} catch (IOException var3) {
		}

		this.field2221.method1514();
	}

	protected void finalize() {
		this.method2194();
	}

	static class459[] method1393() {
		return new class459[]{class459.field3976, class459.field3973, class459.field3975};
	}
}
