import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qq")
public class class262 extends class153 {
	@ObfInfo(name = "ac", desc = "Lsl;")
	final class187 field2119;

	@ObfInfo(name = "<init>", desc = "(Lsl;)V")
	public class262(class187 var1) {
		super(400);
		this.field2119 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Lqs;")
	class179 method902() {
		return new class462();
	}

	@ObfInfo(name = "ae", desc = "(IB)[Lqs;")
	class179[] method896(int var1) {
		return new class462[var1];
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "-892330726")
	public void method1370(class280 var1, int var2) {
		while (var1.field2254 < var2) {
			int var4 = var1.method1492();
			if (var4 == 4) {
				class353 var10 = new class353(var1.method1500(), this.field2119);
				if (!var10.method1936()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class331.field2633.method317(var10.method1935(), var11);
			} else {
				boolean var5 = (var4 & 1) != 0;
				class353 var6 = new class353(var1.method1500(), this.field2119);
				class353 var7 = new class353(var1.method1500(), this.field2119);
				var1.method1500();
				if (!var6.method1936()) {
					throw new IllegalStateException();
				}

				class462 var8 = (class462)this.method887(var6);
				if (var5) {
					class462 var9 = (class462)this.method887(var7);
					if (null != var9 && var8 != var9) {
						if (var8 != null) {
							this.method888(var9);
						} else {
							var8 = var9;
						}
					}
				}

				if (null != var8) {
					this.method891(var8, var6, var7);
				} else if (this.method905() < 400) {
					int var12 = this.method905();
					var8 = (class462)this.method889(var6, var7);
					var8.field3755 = var12;
				}
			}
		}

	}
}
