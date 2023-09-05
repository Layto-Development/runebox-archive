import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "so")
public final class class405 {
	@ObfInfo(name = "ao", desc = "Lsj;")
	class155 field3131;
	@ObfInfo(name = "at", desc = "Lsj;")
	class155 field3132;
	@ObfInfo(name = "ae", desc = "[Lsj;")
	class155[] field3130;
	@ObfInfo(name = "ac", desc = "I")
	int field3129;
	@ObfInfo(name = "au", desc = "I")
	int field3133;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class405(int var1) {
		this.field3129 = 0;
		this.field3133 = var1;
		this.field3130 = new class155[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class155 var3 = this.field3130[var2] = new class155();
			var3.field1482 = var3;
			var3.field1484 = var3;
		}

	}

	@ObfInfo(name = "au", desc = "(J)Lsj;")
	public class155 method2129(long var1) {
		class155 var3 = this.field3130[(int)(var1 & (long)(this.field3133 - 1))];

		for (this.field3131 = var3.field1482; this.field3131 != var3; this.field3131 = this.field3131.field1482) {
			if (this.field3131.field1483 == var1) {
				class155 var4 = this.field3131;
				this.field3131 = this.field3131.field1482;
				return var4;
			}
		}

		this.field3131 = null;
		return null;
	}

	@ObfInfo(name = "ae", desc = "()I")
	public int method2128() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.field3133; ++var2) {
			class155 var3 = this.field3130[var2];

			for (class155 var4 = var3.field1482; var4 != var3; var4 = var4.field1482) {
				++var1;
			}
		}

		return var1;
	}

	@ObfInfo(name = "ao", desc = "(Lsj;J)V")
	public void method2132(class155 var1, long var2) {
		if (var1.field1484 != null) {
			var1.method907();
		}

		class155 var4 = this.field3130[(int)(var2 & (long)(this.field3133 - 1))];
		var1.field1484 = var4.field1484;
		var1.field1482 = var4;
		var1.field1484.field1482 = var1;
		var1.field1482.field1484 = var1;
		var1.field1483 = var2;
	}

	@ObfInfo(name = "at", desc = "()Lsj;")
	public class155 method2130() {
		this.field3129 = 0;
		return this.method2131();
	}

	@ObfInfo(name = "ac", desc = "()Lsj;")
	public class155 method2131() {
		class155 var1;
		if (this.field3129 > 0 && this.field3132 != this.field3130[this.field3129 - 1]) {
			var1 = this.field3132;
			this.field3132 = var1.field1482;
			return var1;
		} else {
			do {
				if (this.field3129 >= this.field3133) {
					return null;
				}

				var1 = this.field3130[this.field3129++].field1482;
			} while(var1 == this.field3130[this.field3129 - 1]);

			this.field3132 = var1.field1482;
			return var1;
		}
	}
}
