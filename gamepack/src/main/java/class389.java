import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "sr")
public class class389 {
	@ObfInfo(name = "af", desc = "[I")
	static int[] field3039;
	@ObfInfo(name = "ae", desc = "Lnu;")
	class437 field3038;
	@ObfInfo(name = "au", desc = "Lnu;")
	class437 field3040;
	@ObfInfo(name = "ao", desc = "Ljava/util/HashMap;")
	HashMap field3037;

	@ObfInfo(name = "<init>", desc = "(Lnu;Lnu;)V")
	public class389(class437 var1, class437 var2) {
		this.field3040 = var1;
		this.field3038 = var2;
		this.field3037 = new HashMap();
	}

	@ObfInfo(name = "au", desc = "([Lsp;I)Ljava/util/HashMap;", opaqueValue = "1965736718")
	public HashMap method2084(class517[] var1) {
		HashMap var3 = new HashMap();
		class517[] var4 = var1;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class517 var6 = var4[var5];
			if (this.field3037.containsKey(var6)) {
				var3.put(var6, this.field3037.get(var6));
			} else {
				class437 var8 = this.field3040;
				class437 var9 = this.field3038;
				String var10 = var6.field4144;
				class258 var7;
				if (!var8.method2289(var10, "")) {
					var7 = null;
				} else {
					int var11 = var8.method2292(var10);
					int var12 = var8.method2284(var11, "");
					var7 = class273.method1436(var8, var9, var11, var12);
				}

				if (null != var7) {
					this.field3037.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
