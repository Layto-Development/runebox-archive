import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfInfo(name = "an")
class class161 extends DefaultTlsClient {
	@ObfInfo(name = "aq", desc = "[Luk;")
	static class398[] field1518;
	@ObfInfo(name = "au", desc = "Lnu;")
	static class437 field1517;
	// $FF: synthetic field
	@ObfInfo(name = "this$1", desc = "Lal;")
	final class304 this$1;

	@ObfInfo(name = "<init>", desc = "(Lal;)V")
	class161(class304 var1) {
		this.this$1 = var1;
	}

	@ObfInfo(name = "getClientExtensions", desc = "()Ljava/util/Hashtable;")
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

	@ObfInfo(name = "getAuthentication", desc = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;")
	public TlsAuthentication getAuthentication() throws IOException {
		return new class321(this);
	}
}
