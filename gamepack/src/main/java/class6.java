import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@ObfInfo(name = "ai")
public class class6 implements class192 {
	@ObfInfo(name = "au", desc = "Ljava/security/MessageDigest;")
	final MessageDigest field331;

	@ObfInfo(name = "<init>", desc = "(Laa;)V")
	class6(class184 var1) {
		this.field331 = this.method288();
	}

	@ObfInfo(name = "au", desc = "(ILjava/lang/String;J)Z")
	boolean method290(int var1, String var2, long var3) {
		byte[] var5 = this.method287(var2, var3);
		return method286(var5) >= var1;
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;J)[B")
	byte[] method287(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.field331.reset();

		try {
			this.field331.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}

		return this.field331.digest();
	}

	@ObfInfo(name = "ac", desc = "()Ljava/security/MessageDigest;")
	MessageDigest method288() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	@ObfInfo(name = "ae", desc = "([B)I")
	static int method286(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			byte var4 = var2[var3];
			int var5 = method289(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}

		return var1;
	}

	@ObfInfo(name = "ao", desc = "(B)I")
	static int method289(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
				++var1;
			}
		}

		return var1;
	}
}
