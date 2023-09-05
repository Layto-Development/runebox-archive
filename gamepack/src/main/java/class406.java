import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "io")
public class class406 {
	@ObfInfo(name = "ao", desc = "Lio;")
	public static final class406 field3136;
	@ObfInfo(name = "at", desc = "Lio;")
	static final class406 field3134;
	@ObfInfo(name = "ae", desc = "Lio;")
	static final class406 field3135;
	@ObfInfo(name = "au", desc = "Lio;")
	static final class406 field3137;
	@ObfInfo(name = "ai", desc = "Lio;")
	static final class406 field3139;
	@ObfInfo(name = "az", desc = "Lio;")
	static final class406 field3140;
	@ObfInfo(name = "ac", desc = "Lio;")
	static final class406 field3141;
	@ObfInfo(name = "ad", desc = "[Lio;")
	static final class406[] field3142;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 408466643)
	final int field3144;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -2057229633)
	public final int field3138;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 357508901)
	public final int field3143;

	static {
		field3137 = new class406(6, 8, 8);
		field3135 = new class406(3, 16, 16);
		field3136 = new class406(0, 32, 32);
		field3134 = new class406(2, 48, 48);
		field3141 = new class406(4, 64, 64);
		field3139 = new class406(5, 96, 96);
		field3140 = new class406(1, 128, 128);
		field3142 = method2134();
		Arrays.sort(field3142, new class51());
	}

	@ObfInfo(name = "<init>", desc = "(III)V")
	class406(int var1, int var2, int var3) {
		this.field3144 = var1;
		this.field3138 = var2;
		this.field3143 = var3;
	}

	@ObfInfo(name = "ae", desc = "(S)I")
	int method2133() {
		return this.field3143 * this.field3138;
	}

	@ObfInfo(name = "au", desc = "(I)[Lio;")
	static class406[] method2134() {
		return new class406[]{field3136, field3140, field3134, field3135, field3141, field3139, field3137};
	}
}
