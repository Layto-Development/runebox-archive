import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tb")
public class class49 implements class425 {
	@ObfInfo(name = "ao", desc = "Ltb;")
	public static final class49 field574;
	@ObfInfo(name = "au", desc = "Ltb;")
	public static final class49 field579;
	@ObfInfo(name = "ae", desc = "Ltb;")
	public static final class49 field580;
	@ObfInfo(name = "ke", desc = "[Lui;")
	static class150[] field573;
	@ObfInfo(name = "az", desc = "Ltj;")
	public final class422 field578;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 784477885)
	public final int field575;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1507631009)
	public final int field576;
	@ObfInfo(name = "ai", desc = "Ljava/lang/Class;")
	public final Class field577;

	static {
		field579 = new class49(1, 0, Integer.class, new class464());
		field580 = new class49(0, 1, Long.class, new class72());
		field574 = new class49(2, 2, String.class, new class473());
	}

	@ObfInfo(name = "<init>", desc = "(IILjava/lang/Class;Ltj;)V")
	class49(int var1, int var2, Class var3, class422 var4) {
		this.field575 = var1;
		this.field576 = var2;
		this.field577 = var3;
		this.field578 = var4;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2222() {
		return this.field576;
	}

	@ObfInfo(name = "at", desc = "(Ltm;S)Ljava/lang/Object;")
	public Object method451(class280 var1) {
		return this.field578.method2209(var1);
	}

	@ObfInfo(name = "au", desc = "(B)[Ltb;")
	public static class49[] method452() {
		return new class49[]{field579, field574, field580};
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/Class;B)Ltb;", opaqueValue = "99")
	public static class49 method449(Class var0) {
		class49[] var2 = method452();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class49 var4 = var2[var3];
			if (var4.field577 == var0) {
				return var4;
			}
		}

		return null;
	}
}
