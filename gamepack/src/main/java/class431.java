import java.io.IOException;
import java.util.Iterator;

public abstract class class431 {
	static class431 field3536;

	class431() {
	}

	public abstract boolean method2189(int var1) throws IOException;

	public abstract int method2190(byte[] var1, int var2, int var3) throws IOException;

	public abstract int method2191() throws IOException;

	public abstract int method2193() throws IOException;

	public abstract void method2192(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method2194();

	public static int method2196(String var0) {
		return var0.length() + 1;
	}

	static final void method2195() {
		Iterator var1 = class41.field521.iterator();

		while (var1.hasNext()) {
			class445 var2 = (class445)var1.next();
			var2.method2228();
		}

		if (null != class141.field1358) {
			class141.field1358.method818((byte)-1);
		}

	}
}
