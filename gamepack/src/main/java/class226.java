import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ce")
public class class226 {
	@ObfInfo(name = "au", desc = "[B")
	byte[] field1947;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 352482533)
	int field1946;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1727037637)
	int field1948;

	@ObfInfo(name = "<init>", desc = "()V")
	class226() {
		this.field1947 = null;
		this.field1946 = 0;
		this.field1948 = 0;
	}

	@ObfInfo(name = "au", desc = "(IB)I", opaqueValue = "7")
	int method1216(int var1) {
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var1 >= 8 - this.field1948; var1 -= var5) {
			var5 = 8 - this.field1948;
			int var6 = (1 << var5) - 1;
			var3 += (this.field1947[this.field1946] >> this.field1948 & var6) << var4;
			this.field1948 = 0;
			++this.field1946;
			var4 += var5;
		}

		if (var1 > 0) {
			var5 = (1 << var1) - 1;
			var3 += (this.field1947[this.field1946] >> this.field1948 & var5) << var4;
			this.field1948 += var1;
		}

		return var3;
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	int method1217() {
		int var2 = this.field1947[this.field1946] >> this.field1948 & 1;
		++this.field1948;
		this.field1946 += this.field1948 >> 3;
		this.field1948 &= 7;
		return var2;
	}

	@ObfInfo(name = "ao", desc = "([BII)V")
	void method1218(byte[] var1, int var2) {
		this.field1947 = var1;
		this.field1946 = var2;
		this.field1948 = 0;
	}
}
