import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jh")
public class class88 extends class528 {
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -291449039)
	int field884;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 360317377)
	int field885;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1203952317)
	int field886;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -518457143)
	int field887;

	@ObfInfo(name = "<init>", desc = "()V")
	class88() {
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V", opaqueValue = "1")
	void method566(class280 var1) {
		int var3 = var1.method1492();
		if (class513.field4106.field4107 != var3) {
			throw new IllegalStateException("");
		} else {
			super.field4211 = var1.method1492();
			super.field4212 = var1.method1492();
			super.field4216 = var1.method1541();
			super.field4214 = var1.method1541();
			this.field885 = var1.method1492();
			this.field886 = var1.method1492();
			super.field4210 = var1.method1541();
			super.field4217 = var1.method1541();
			this.field884 = var1.method1492();
			this.field887 = var1.method1492();
			super.field4218 = var1.method1540();
			super.field4208 = var1.method1540();
		}
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)V", opaqueValue = "2026509077")
	void method2567(class280 var1) {
		super.field4212 = Math.min(super.field4212, 4);
		super.field4215 = new short[1][64][64];
		super.field4213 = new short[super.field4212][64][64];
		super.field4222 = new byte[super.field4212][64][64];
		super.field4209 = new byte[super.field4212][64][64];
		super.field4219 = new class204[super.field4212][64][64][];
		int var3 = var1.method1492();
		if (class343.field2705.field2704 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method1492();
			int var5 = var1.method1492();
			int var6 = var1.method1492();
			int var7 = var1.method1492();
			if (super.field4210 == var4 && var5 == super.field4217 && var6 == this.field884 && this.field887 == var7) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method2569(var8 + this.field884 * 8, var9 + this.field887 * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class88)) {
			return false;
		} else {
			class88 var2 = (class88)var1;
			if (super.field4210 == var2.field4210 && var2.field4217 == super.field4217) {
				return var2.field884 == this.field884 && this.field887 == var2.field887;
			} else {
				return false;
			}
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return super.field4210 | super.field4217 << 8 | this.field884 << 16 | this.field887 << 24;
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	int method569() {
		return this.field885;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	int method570() {
		return this.field886;
	}

	@ObfInfo(name = "ac", desc = "(B)I")
	int method568() {
		return this.field884;
	}

	@ObfInfo(name = "ai", desc = "(I)I")
	int method567() {
		return this.field887;
	}
}
