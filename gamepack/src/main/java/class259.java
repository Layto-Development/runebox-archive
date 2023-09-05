import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "to")
public class class259 extends class280 {
	@ObfInfo(name = "ae", desc = "[I")
	static final int[] field2114;
	@ObfInfo(name = "au", desc = "Lux;")
	class199 field2113;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -151024667)
	int field2115;

	static {
		field2114 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class259(int var1) {
		super(var1);
	}

	@ObfInfo(name = "au", desc = "([IB)V")
	public void method1352(int[] var1) {
		this.field2113 = new class199(var1);
	}

	@ObfInfo(name = "ae", desc = "(Lux;I)V")
	public void method1353(class199 var1) {
		this.field2113 = var1;
	}

	@ObfInfo(name = "ao", desc = "(II)V")
	public void method1355(int var1) {
		super.field2252[++super.field2254 - 1] = (byte)(var1 + this.field2113.method1118());
	}

	@ObfInfo(name = "at", desc = "(I)I")
	public int method1354() {
		return super.field2252[++super.field2254 - 1] - this.field2113.method1118() & 255;
	}

	@ObfInfo(name = "ac", desc = "(B)Z", opaqueValue = "1")
	public boolean method1356() {
		int var2 = super.field2252[super.field2254] - this.field2113.method1119() & 255;
		return var2 >= 128;
	}

	@ObfInfo(name = "ai", desc = "(I)I", opaqueValue = "1037644008")
	public int method1358() {
		int var2 = super.field2252[++super.field2254 - 1] - this.field2113.method1118() & 255;
		return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field2252[++super.field2254 - 1] - this.field2113.method1118() & 255);
	}

	@ObfInfo(name = "az", desc = "([BIII)V", opaqueValue = "-1401941730")
	public void method1357(byte[] var1, int var2, int var3) {
		for (int var5 = 0; var5 < var3; ++var5) {
			var1[var5 + var2] = (byte)(super.field2252[++super.field2254 - 1] - this.field2113.method1118());
		}

	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public void method1361() {
		this.field2115 = super.field2254 * 8;
	}

	@ObfInfo(name = "aa", desc = "(IB)I", opaqueValue = "2")
	public int method1359(int var1) {
		int var3 = this.field2115 >> 3;
		int var4 = 8 - (this.field2115 & 7);
		int var5 = 0;

		for (this.field2115 += var1; var1 > var4; var4 = 8) {
			var5 += (super.field2252[var3++] & field2114[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += super.field2252[var3] & field2114[var4];
		} else {
			var5 += super.field2252[var3] >> var4 - var1 & field2114[var1];
		}

		return var5;
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method1362() {
		super.field2254 = (this.field2115 + 7) / 8;
	}

	@ObfInfo(name = "ad", desc = "(II)I")
	public int method1360(int var1) {
		return var1 * 8 - this.field2115;
	}
}
