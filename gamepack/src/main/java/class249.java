import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;

@ObfInfo(name = "gc")
public class class249 extends class313 {
	@ObfInfo(name = "iz", desc = "I", intMultiplier = -1983663825)
	static int field2082;
	@ObfInfo(name = "gt", desc = "Ljava/lang/String;")
	static String field2080;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 2110993829)
	int field2081;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class249(class220 var1) {
		this.this$0 = var1;
		this.field2081 = -1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field2081 = var1.method1541();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1594(this.field2081);
	}

	@ObfInfo(name = "is", desc = "(Ljava/util/ArrayList;IIIIB)V", opaqueValue = "6")
	static void method1341(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var6 = (Integer)var0.get(0);
			if (var6 == -1 && !Client.field299) {
				class333.method1815(0, 0);
			} else if (var6 != -1 && !class303.method1679(var6) && class281.field2262.method1746() != 0) {
				ArrayList var7 = new ArrayList();

				for (int var8 = 0; var8 < var0.size(); ++var8) {
					var7.add(new class503(class323.field2609, (Integer)var0.get(var8), 0, class281.field2262.method1746(), false));
				}

				if (Client.field299) {
					class303.field2448.clear();
					class303.field2448.addAll(var7);
					class303.method1683(var1, var2, var3, var4);
				} else {
					class303.method1677(var7, var1, var2, var3, var4, false);
				}
			}

		}
	}
}
