import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ge")
public class class427 extends class313 {
	@ObfInfo(name = "ki", desc = "Lui;")
	static class150 field3237;
	@ObfInfo(name = "ai", desc = "Ljava/lang/Thread;")
	static Thread field3240;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -739944557)
	int field3239;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = -609205745967376381L)
	long field3238;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lfn;")
	final class220 this$0;

	@ObfInfo(name = "<init>", desc = "(Lfn;)V")
	class427(class220 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V")
	void method1731(class280 var1) {
		this.field3239 = var1.method1496();
		this.field3238 = var1.method1497();
	}

	@ObfInfo(name = "ae", desc = "(Lfi;B)V")
	void method1730(class291 var1) {
		var1.method1600(this.field3239, this.field3238);
	}

	@ObfInfo(name = "jq", desc = "(I)V", opaqueValue = "1240684649")
	static final void method2224() {
		for (class18 var1 = (class18)Client.field297.method627(); var1 != null; var1 = (class18)Client.field297.method629()) {
			if (var1.field367 == class401.field3120 && !var1.field373) {
				if (Client.field330 >= var1.field366) {
					var1.method328(Client.field106);
					if (var1.field373) {
						var1.method907();
					} else {
						class27.field448.method1064(var1.field367, var1.field368, var1.field369, var1.field365, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.method907();
			}
		}

	}
}
