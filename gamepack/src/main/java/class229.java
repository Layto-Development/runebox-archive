import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bc")
public class class229 {
	@ObfInfo(name = "ae", desc = "I")
	int field1957;
	@ObfInfo(name = "au", desc = "I")
	int field1958;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field1959;
	@ObfInfo(name = "at", desc = "[I")
	int[] field1960;

	@ObfInfo(name = "<init>", desc = "()V")
	class229() {
		class226 var1 = class130.field1176;
		var1.method1216(16);
		this.field1958 = var1.method1217() != 0 ? var1.method1216(4) + 1 : 1;
		if (var1.method1217() != 0) {
			var1.method1216(8);
		}

		var1.method1216(2);
		if (this.field1958 > 1) {
			this.field1957 = var1.method1216(4);
		}

		this.field1959 = new int[this.field1958];
		this.field1960 = new int[this.field1958];

		for (int var2 = 0; var2 < this.field1958; ++var2) {
			var1.method1216(8);
			this.field1959[var2] = var1.method1216(8);
			this.field1960[var2] = var1.method1216(8);
		}

	}
}
