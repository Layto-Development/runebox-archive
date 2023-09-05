import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "di")
public class class39 {
	@ObfInfo(name = "ae", desc = "[Lco;")
	class212[] field508;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1615403795)
	int field507;

	@ObfInfo(name = "<init>", desc = "()V")
	class39() {
		this.field508 = new class212[100];
	}

	@ObfInfo(name = "au", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lco;", opaqueValue = "99")
	class212 method427(int var1, String var2, String var3, String var4) {
		class212 var6 = this.field508[99];

		for (int var7 = this.field507; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field508[var7] = this.field508[var7 - 1];
			}
		}

		if (null == var6) {
			var6 = new class212(var1, var2, var4, var3);
		} else {
			var6.method907();
			var6.method1024();
			var6.method1183(var1, var2, var4, var3);
		}

		this.field508[0] = var6;
		if (this.field507 < 100) {
			++this.field507;
		}

		return var6;
	}

	@ObfInfo(name = "ae", desc = "(II)Lco;", opaqueValue = "1470914474")
	class212 method428(int var1) {
		return var1 >= 0 && var1 < this.field507 ? this.field508[var1] : null;
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	int method426() {
		return this.field507;
	}
}
