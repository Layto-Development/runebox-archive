import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "pt")
public class class206 extends class236 {
	@ObfInfo(name = "au", desc = "Lmu;")
	class503 field1861;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1861839197)
	int field1860;

	@ObfInfo(name = "<init>", desc = "(Lpm;IZI)V")
	public class206(class236 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field1861 = null;
		this.field1860 = 0;
		super.field1978 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class303.field2454.size()) {
				this.field1861 = (class503)class303.field2454.get(var2);
			} else if (!var3 && var2 < class303.field2447.size()) {
				this.field1861 = (class503)class303.field2447.get(var2);
			}

			this.field1860 = var4;
		}
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		if (this.field1861 != null && null != this.field1861.field4063) {
			this.field1861.field4068 = true;

			try {
				if (this.field1861.field4056 < (float)this.field1861.field4059 && this.field1861.field4063.method809()) {
					float var2 = this.field1860 == 0 ? (float)this.field1860 : (float)this.field1861.field4059 / (float)this.field1860;
					class503 var10000 = this.field1861;
					var10000.field4056 += 0.0F == var2 ? (float)this.field1861.field4059 : var2;
					if (this.field1861.field4056 > (float)this.field1861.field4059) {
						this.field1861.field4056 = (float)this.field1861.field4059;
					}

					this.field1861.field4063.method777((int)this.field1861.field4056);
					return false;
				}
			} catch (Exception var3) {
				this.method1245(var3.getMessage());
				return true;
			}

			this.field1861.field4068 = false;
			return true;
		} else {
			return true;
		}
	}
}
