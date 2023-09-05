import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "px")
public class class375 extends class236 {
	@ObfInfo(name = "au", desc = "Lmu;")
	class503 field2890;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1221336075)
	int field2889;

	@ObfInfo(name = "<init>", desc = "(Lpm;IZI)V")
	public class375(class236 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field2890 = null;
		this.field2889 = 0;
		super.field1978 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class303.field2454.size()) {
				this.field2890 = (class503)class303.field2454.get(var2);
			} else if (!var3 && var2 < class303.field2447.size()) {
				this.field2890 = (class503)class303.field2447.get(var2);
			}

			this.field2889 = var4;
		}
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		if (this.field2890 != null && this.field2890.field4063 != null) {
			this.field2890.field4068 = true;

			try {
				if (this.field2890.field4056 > 0.0F && this.field2890.field4063.method809()) {
					float var2 = this.field2889 == 0 ? (float)this.field2889 : (float)this.field2890.field4059 / (float)this.field2889;
					class503 var10000 = this.field2890;
					var10000.field4056 -= var2 == 0.0F ? (float)this.field2890.field4059 : var2;
					if (this.field2890.field4056 < 0.0F) {
						this.field2890.field4056 = 0.0F;
					}

					this.field2890.field4063.method777((int)this.field2890.field4056);
					return false;
				}
			} catch (Exception var3) {
				this.method1245(var3.getMessage());
				return true;
			}

			this.field2890.field4068 = false;
			return true;
		} else {
			return true;
		}
	}
}
