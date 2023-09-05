import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "ka")
public class class343 {
	@ObfInfo(name = "fb", desc = "J", longMultiplier = -8732969090401109105L)
	static long field2706;
	@ObfInfo(name = "au", desc = "Lka;")
	static final class343 field2703;
	@ObfInfo(name = "ae", desc = "Lka;")
	static final class343 field2705;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1287567465)
	final int field2704;

	static {
		field2703 = new class343(0);
		field2705 = new class343(1);
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	class343(int var1) {
		this.field2704 = var1;
	}

	@ObfInfo(name = "aa", desc = "(Ljava/util/ArrayList;ZI)V", opaqueValue = "544527881")
	static void method1880(ArrayList var0, boolean var1) {
		if (!var1) {
			class303.field2448.clear();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			class503 var4 = (class503)var3.next();
			if (var4.field4057 != -1 && var4.field4058 != -1) {
				if (!var1) {
					class303.field2448.add(var4);
				}

				class303.field2454.add(var4);
			}
		}

	}

	@ObfInfo(name = "jt", desc = "(II)V", opaqueValue = "617389636")
	static void method1881(int var0) {
		Client.field257 = 0L;
		if (var0 >= 2) {
			Client.field258 = true;
		} else {
			Client.field258 = false;
		}

		if (Client.method212() == 1) {
			class51.field585.method1883(765, 503);
		} else {
			class51.field585.method1883(7680, 2160);
		}

		if (Client.field111 >= 25) {
			Client.method150();
		}

	}
}
