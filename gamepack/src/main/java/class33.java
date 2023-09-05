import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "po")
public class class33 extends class236 {
	@ObfInfo(name = "rd", desc = "Lth;")
	static class267 field482;

	@ObfInfo(name = "<init>", desc = "(Lpm;)V")
	public class33(class236 var1) {
		super(var1);
		super.field1978 = "SwapSongTask";
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		if (class303.field2447.size() > 1 && class303.field2447.get(0) != null && ((class503)class303.field2447.get(0)).field4063.method809() && class303.field2447.get(1) != null && ((class503)class303.field2447.get(1)).field4063.method809()) {
			class503 var2 = (class503)class303.field2447.get(0);
			class303.field2447.set(0, class303.field2447.get(1));
			class303.field2447.set(1, var2);
		}

		return true;
	}
}
