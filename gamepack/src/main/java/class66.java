import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rx")
public class class66 {
	@ObfInfo(name = "ac", desc = "[I")
	static final int[] field756;
	@ObfInfo(name = "ai", desc = "[I")
	static final int[] field757;

	static {
		field756 = new int[16384];
		field757 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field756[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field757[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfInfo(name = "<init>", desc = "()V")
	class66() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(III)I")
	public static int method497(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfInfo(name = "ae", desc = "(II)I")
	public static int method496(int var0) {
		return field756[var0 & 16383];
	}

	@ObfInfo(name = "ao", desc = "(II)I")
	public static int method498(int var0) {
		return field757[var0 & 16383];
	}
}
