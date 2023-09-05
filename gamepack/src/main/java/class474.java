import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "pl")
public class class474 {
	@ObfInfo(name = "gy", desc = "I", intMultiplier = 1494034165)
	static int field3812;
	@ObfInfo(name = "au", desc = "Lpj;")
	class338 field3809;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 751881255)
	int field3810;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1020129413)
	int field3811;

	@ObfInfo(name = "<init>", desc = "(Lpj;II)V")
	class474(class338 var1, int var2, int var3) {
		this.field3810 = 0;
		this.field3811 = 0;
		this.field3809 = var1;
		this.field3810 = var2;
		this.field3811 = var3;
	}

	@ObfInfo(name = "au", desc = "(B)Ljava/lang/String;")
	public String method2429() {
		if (this.method2430()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method2431());

			for (int var3 = this.field3810; var3 < this.field3811; ++var3) {
				class457 var4 = this.field3809.method1845(var3);
				var2.append(var4.field3716);
			}

			return var2.toString();
		}
	}

	@ObfInfo(name = "ae", desc = "(IB)Z", opaqueValue = "0")
	boolean method2436(int var1) {
		return this.field3809.method1848() == 2 || this.field3809.method1848() == 1 && (!this.field3809.field2686 || var1 != this.field3811 - 1);
	}

	@ObfInfo(name = "ao", desc = "(I)Z", opaqueValue = "359488159")
	public boolean method2430() {
		return this.field3810 == this.field3811;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	public int method2431() {
		return this.field3811 - this.field3810;
	}

	@ObfInfo(name = "ac", desc = "(Lpz;I)Z", opaqueValue = "-1359499749")
	boolean method2432(class457 var1) {
		if (this.field3809.field2688 == 2) {
			return true;
		} else if (this.field3809.field2688 == 0) {
			return false;
		} else {
			return this.field3809.method1827() != var1;
		}
	}

	@ObfInfo(name = "ai", desc = "(I)I", opaqueValue = "1557481646")
	int method2434() {
		if (this.method2430()) {
			return 0;
		} else {
			class457 var2 = this.field3809.method1845(this.field3811 - 1);
			if (var2.field3716 == '\n') {
				return 0;
			} else if (this.method2432(var2)) {
				return this.field3809.field2685.field2417[42];
			} else {
				int var3 = this.field3809.field2685.field2417[var2.field3716];
				if (var3 == 0) {
					return var2.field3716 == '\t' ? 3 * this.field3809.field2685.field2417[32] : this.field3809.field2685.field2417[32];
				} else {
					return var3;
				}
			}
		}
	}

	@ObfInfo(name = "az", desc = "(I)Lss;")
	public class165 method2435() {
		if (this.method2430()) {
			return new class165(0, 0);
		} else {
			class457 var2 = this.field3809.method1845(this.field3811 - 1);
			return new class165(var2.field3715 + this.method2434(), var2.field3718);
		}
	}

	@ObfInfo(name = "ap", desc = "(II)Lpz;", opaqueValue = "602399469")
	public class457 method2433(int var1) {
		return var1 >= 0 && var1 < this.method2431() ? this.field3809.method1845(this.field3810 + var1) : null;
	}
}
