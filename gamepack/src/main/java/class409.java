import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hx")
public class class409 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	static class437 field3159;
	@ObfInfo(name = "ae", desc = "Lle;")
	static class7 field3157;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -284568135)
	static int field3160;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field3155;
	@ObfInfo(name = "ao", desc = "C")
	char field3156;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -490553151)
	public int field3154;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public String field3158;

	static {
		field3157 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class409() {
		this.field3155 = true;
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	void method2141() {
	}

	@ObfInfo(name = "at", desc = "(Ltm;B)V", opaqueValue = "-1")
	void method2142(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method2143(var1, var3);
		}
	}

	@ObfInfo(name = "ac", desc = "(Ltm;II)V", opaqueValue = "1794498871")
	void method2143(class280 var1, int var2) {
		if (var2 == 1) {
			this.field3156 = class244.method1265(var1.method1493());
		} else if (var2 == 2) {
			this.field3154 = var1.method1496();
		} else if (var2 == 4) {
			this.field3155 = false;
		} else if (var2 == 5) {
			this.field3158 = var1.method1500();
		}

	}

	@ObfInfo(name = "ai", desc = "(I)Z", opaqueValue = "-1752255872")
	public boolean method2144() {
		return this.field3156 == 's';
	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V")
	public static void method2146(class437 var0) {
		field3159 = var0;
	}

	@ObfInfo(name = "ae", desc = "(II)Lhx;")
	public static class409 method2147(int var0) {
		class409 var2 = (class409)field3157.method294((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field3159.method2267(11, var0);
			var2 = new class409();
			if (var3 != null) {
				var2.method2142(new class280(var3));
			}

			var2.method2141();
			field3157.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "az", desc = "(I)V")
	public static void method2145() {
		field3157.method291();
	}
}
