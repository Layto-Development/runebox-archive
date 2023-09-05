import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "br")
public class class485 {
	@ObfInfo(name = "ac", desc = "I")
	int field3945;
	@ObfInfo(name = "at", desc = "I")
	int field3948;
	@ObfInfo(name = "ai", desc = "I")
	int field3949;
	@ObfInfo(name = "au", desc = "I")
	int field3950;
	@ObfInfo(name = "af", desc = "I")
	int field3951;
	@ObfInfo(name = "az", desc = "I")
	int field3952;
	@ObfInfo(name = "aa", desc = "I")
	int field3953;
	@ObfInfo(name = "ap", desc = "I")
	int field3954;
	@ObfInfo(name = "ad", desc = "I")
	int field3955;
	@ObfInfo(name = "ae", desc = "[I")
	int[] field3946;
	@ObfInfo(name = "ao", desc = "[I")
	int[] field3947;

	@ObfInfo(name = "<init>", desc = "()V")
	class485() {
		this.field3950 = 2;
		this.field3946 = new int[2];
		this.field3947 = new int[2];
		this.field3946[0] = 0;
		this.field3946[1] = 65535;
		this.field3947[0] = 0;
		this.field3947[1] = 65535;
	}

	@ObfInfo(name = "au", desc = "(Ltm;)V")
	final void method2456(class280 var1) {
		this.field3949 = var1.method1492();
		this.field3948 = var1.method1496();
		this.field3945 = var1.method1496();
		this.method2457(var1);
	}

	@ObfInfo(name = "ae", desc = "(Ltm;)V")
	final void method2457(class280 var1) {
		this.field3950 = var1.method1492();
		this.field3946 = new int[this.field3950];
		this.field3947 = new int[this.field3950];

		for (int var2 = 0; var2 < this.field3950; ++var2) {
			this.field3946[var2] = var1.method1541();
			this.field3947[var2] = var1.method1541();
		}

	}

	@ObfInfo(name = "ao", desc = "()V")
	final void method2455() {
		this.field3952 = 0;
		this.field3954 = 0;
		this.field3953 = 0;
		this.field3951 = 0;
		this.field3955 = 0;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	final int method2454(int var1) {
		if (this.field3955 >= this.field3952) {
			this.field3951 = this.field3947[this.field3954++] << 15;
			if (this.field3954 >= this.field3950) {
				this.field3954 = this.field3950 - 1;
			}

			this.field3952 = (int)((double)this.field3946[this.field3954] / 65536.0D * (double)var1);
			if (this.field3952 > this.field3955) {
				this.field3953 = ((this.field3947[this.field3954] << 15) - this.field3951) / (this.field3952 - this.field3955);
			}
		}

		this.field3951 += this.field3953;
		++this.field3955;
		return this.field3951 - this.field3953 >> 15;
	}
}
