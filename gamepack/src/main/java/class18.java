import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.security.SecureRandom;

@ObfInfo(name = "cg")
public final class class18 extends class510 {
	@ObfInfo(name = "hn", desc = "Ljava/security/SecureRandom;")
	static SecureRandom field375;
	@ObfInfo(name = "af", desc = "Z")
	boolean field373;
	@ObfInfo(name = "az", desc = "Lib;")
	class202 field370;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 284515791)
	int field365;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 794022017)
	int field366;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -49690437)
	int field367;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 540026663)
	int field368;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -37149761)
	int field369;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -956501499)
	int field371;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1971256985)
	int field372;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 539793439)
	int field374;

	@ObfInfo(name = "<init>", desc = "(IIIIIII)V")
	class18(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field371 = 0;
		this.field372 = 0;
		this.field373 = false;
		this.field374 = var1;
		this.field367 = var2;
		this.field368 = var3;
		this.field369 = var4;
		this.field365 = var5;
		this.field366 = var7 + var6;
		int var8 = class460.method2393(this.field374).field3734;
		if (var8 != -1) {
			this.field373 = false;
			this.field370 = class202.method1149(var8);
		} else {
			this.field373 = true;
		}

	}

	@ObfInfo(name = "au", desc = "(IB)V", opaqueValue = "0")
	final void method328(int var1) {
		if (!this.field373) {
			this.field372 += var1;
			if (!this.field370.method1148()) {
				while (this.field372 > this.field370.field1850[this.field371]) {
					this.field372 -= this.field370.field1850[this.field371];
					++this.field371;
					if (this.field371 >= this.field370.field1839.length) {
						this.field373 = true;
						break;
					}
				}
			} else {
				this.field371 += var1;
				if (this.field371 >= this.field370.method1145()) {
					this.field373 = true;
				}
			}

		}
	}

	@ObfInfo(name = "ae", desc = "(I)Ljr;", opaqueValue = "-425402190")
	protected final class384 method2515() {
		class460 var2 = class460.method2393(this.field374);
		class384 var3;
		if (!this.field373) {
			var3 = var2.method2389(this.field371);
		} else {
			var3 = var2.method2389(-1);
		}

		return var3 == null ? null : var3;
	}
}
