import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.net.URL;

@ObfInfo(name = "et")
public class class22 {
	@ObfInfo(name = "ad", desc = "[S")
	public static short[] field404;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 513778063)
	static int field400;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -2063335977)
	static int field401;
	@ObfInfo(name = "au", desc = "Ljava/net/URL;")
	final URL field399;
	@ObfInfo(name = "ac", desc = "[B")
	volatile byte[] field403;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 2063603547)
	volatile int field402;

	static {
		field400 = -1;
		field401 = -2;
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/net/URL;)V")
	class22(URL var1) {
		this.field402 = field400;
		this.field399 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	public boolean method334() {
		return field400 != this.field402;
	}

	@ObfInfo(name = "ae", desc = "(I)[B")
	public byte[] method336() {
		return this.field403;
	}

	@ObfInfo(name = "ao", desc = "(I)Ljava/lang/String;")
	public String method335() {
		return this.field399.toString();
	}
}
