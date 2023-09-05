import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(name = "fe")
class class441 implements Callable {
	@ObfInfo(name = "qj", desc = "I", intMultiplier = 1753680661)
	static int field3329;
	// $FF: synthetic field
	@ObfInfo(name = "val$p", desc = "Ltm;")
	final class280 val$p;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfv;")
	final class89 this$0;
	// $FF: synthetic field
	@ObfInfo(name = "val$version", desc = "I")
	final int val$version;

	@ObfInfo(name = "<init>", desc = "(Lfv;Ltm;I)V")
	class441(class89 var1, class280 var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	@ObfInfo(name = "call", desc = "()Ljava/lang/Object;")
	public Object call() {
		this.this$0.method573(this.val$p, this.val$version);
		return null;
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/CharSequence;B)J", opaqueValue = "-1")
	static long method2312(CharSequence var0) {
		long var2 = 0L;
		int var4 = var0.length();

		for (int var5 = 0; var5 < var4; ++var5) {
			var2 *= 37L;
			char var6 = var0.charAt(var5);
			if (var6 >= 'A' && var6 <= 'Z') {
				var2 += (long)(var6 + 1 - 65);
			} else if (var6 >= 'a' && var6 <= 'z') {
				var2 += (long)(var6 + 1 - 97);
			} else if (var6 >= '0' && var6 <= '9') {
				var2 += (long)(var6 + 27 - 48);
			}

			if (var2 >= 177917621779460413L) {
				break;
			}
		}

		while (var2 % 37L == 0L && var2 != 0L) {
			var2 /= 37L;
		}

		return var2;
	}
}
