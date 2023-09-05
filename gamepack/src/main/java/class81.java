import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jx")
public class class81 extends class528 {
	@ObfInfo(name = "<init>", desc = "()V")
	class81() {
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V", opaqueValue = "0")
	void method533(class280 var1) {
		int var3 = var1.method1492();
		if (var3 != class513.field4105.field4107) {
			throw new IllegalStateException("");
		} else {
			super.field4211 = var1.method1492();
			super.field4212 = var1.method1492();
			super.field4216 = var1.method1541();
			super.field4214 = var1.method1541();
			super.field4210 = var1.method1541();
			super.field4217 = var1.method1541();
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
		if (class343.field2703.field2704 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method1492();
			int var5 = var1.method1492();
			if (var4 == super.field4210 && var5 == super.field4217) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method2569(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class81)) {
			return false;
		} else {
			class81 var2 = (class81)var1;
			return super.field4210 == var2.field4210 && super.field4217 == var2.field4217;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return super.field4210 | super.field4217 << 8;
	}
}
