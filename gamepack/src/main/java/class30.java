import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tw")
public class class30 {
	@ObfInfo(name = "au", desc = "[I")
	int[] field472;
	@ObfInfo(name = "ae", desc = "[S")
	short[] field473;

	@ObfInfo(name = "<init>", desc = "(Lhw;)V")
	public class30(class395 var1) {
		this.field472 = new int[8];
		this.field473 = new short[8];
		int var2 = 0;
		if (var1.method2101()) {
			var2 = var1.method2102().length;
			System.arraycopy(var1.method2102(), 0, this.field472, 0, var2);
			System.arraycopy(var1.method2104(), 0, this.field473, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field472[var3] = -1;
			this.field473[var3] = -1;
		}

	}

	@ObfInfo(name = "au", desc = "(B)[I")
	public int[] method414() {
		return this.field472;
	}

	@ObfInfo(name = "ae", desc = "(B)[S")
	public short[] method415() {
		return this.field473;
	}

	@ObfInfo(name = "ao", desc = "(IISI)V")
	public void method416(int var1, int var2, short var3) {
		this.field472[var1] = var2;
		this.field473[var1] = var3;
	}

	@ObfInfo(name = "at", desc = "([I[SB)V")
	public void method417(int[] var1, short[] var2) {
		this.field472 = var1;
		this.field473 = var2;
	}
}
