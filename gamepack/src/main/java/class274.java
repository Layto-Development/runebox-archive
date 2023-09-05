import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uz")
public class class274 {
	@ObfInfo(name = "au", desc = "[I")
	int[] field2228;

	@ObfInfo(name = "<init>", desc = "([I)V")
	public class274(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
		}

		this.field2228 = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.field2228[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.field2228[1 + var4 + var4] = var3++) {
			for (var4 = var1[var3] & var2 - 1; this.field2228[1 + var4 + var4] != -1; var4 = var4 + 1 & var2 - 1) {
			}

			this.field2228[var4 + var4] = var1[var3];
		}

	}

	@ObfInfo(name = "au", desc = "(II)I", opaqueValue = "-1742890609")
	public int method1440(int var1) {
		int var3 = (this.field2228.length >> 1) - 1;
		int var4 = var1 & var3;

		while (true) {
			int var5 = this.field2228[1 + var4 + var4];
			if (var5 == -1) {
				return -1;
			}

			if (this.field2228[var4 + var4] == var1) {
				return var5;
			}

			var4 = var4 + 1 & var3;
		}
	}
}
