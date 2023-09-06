import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class class149 extends DefaultTlsClient {
	static class215 field1400;
	static class25[] field1401;
	// $FF: synthetic field
	final class391 this$1;

	class149(class391 var1) {
		this.this$1 = var1;
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class533(this);
	}

	public static void method860(class42 var0, int var1) {
		if (null != class297.field2738) {
			try {
				class297.field2738.method2126(0L);
				class297.field2738.method2130(var0.field525, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
