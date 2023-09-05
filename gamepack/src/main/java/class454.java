import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "oh")
public class class454 {
	@ObfInfo(name = "fm", desc = "Lnk;")
	static class505 field3714;
	@ObfInfo(name = "au", desc = "B")
	byte field3710;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1815027607)
	public int field3708;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1950661591)
	public int field3709;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 602808251)
	public int field3711;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -662672265)
	public int field3712;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1417966657)
	public int field3713;

	@ObfInfo(name = "<init>", desc = "()V")
	public class454() {
	}

	@ObfInfo(name = "<init>", desc = "(Ltm;Z)V")
	public class454(class280 var1, boolean var2) {
		this.field3710 = var1.method1493();
		this.field3709 = var1.method1541();
		this.field3713 = var1.method1496();
		this.field3711 = var1.method1496();
		this.field3712 = var1.method1496();
		this.field3708 = var1.method1496();
		if (var2) {
			int var4 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.method1492();
				if (var6 == 255) {
					Integer var3 = var5 ? var4 : null;
					this.method2363(var3);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.method1492();
					if (var7 == 255) {
						break;
					}

					--var1.field2254;
					if (var1.method1541() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var4 = var1.method1496();
					var5 = true;
				}
			}
		}

	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/Integer;I)V")
	void method2363(Integer var1) {
	}

	@ObfInfo(name = "ae", desc = "(B)I")
	public int method2364() {
		return this.field3710 & 7;
	}

	@ObfInfo(name = "ao", desc = "(I)I", opaqueValue = "-776513846")
	public int method2365() {
		return (this.field3710 & 8) == 8 ? 1 : 0;
	}

	@ObfInfo(name = "at", desc = "(II)V")
	void method2362(int var1) {
		this.field3710 &= -8;
		this.field3710 = (byte)(this.field3710 | var1 & 7);
	}

	@ObfInfo(name = "ac", desc = "(IB)V", opaqueValue = "76")
	void method2366(int var1) {
		this.field3710 &= -9;
		if (var1 == 1) {
			this.field3710 = (byte)(this.field3710 | 8);
		}

	}
}
