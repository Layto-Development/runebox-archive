import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bl")
public class class363 extends class449 {
	@ObfInfo(name = "ae", desc = "Low;")
	class113 field2822;
	@ObfInfo(name = "au", desc = "Low;")
	class113 field2825;
	@ObfInfo(name = "at", desc = "I")
	int field2823;
	@ObfInfo(name = "ao", desc = "I")
	int field2824;

	@ObfInfo(name = "<init>", desc = "()V")
	public class363() {
		this.field2825 = new class113();
		this.field2822 = new class113();
		this.field2824 = 0;
		this.field2823 = -1;
	}

	@ObfInfo(name = "au", desc = "(Lbw;)V")
	public final synchronized void method1990(class449 var1) {
		this.field2825.method632(var1);
	}

	@ObfInfo(name = "ae", desc = "(Lbw;)V")
	public final synchronized void method1980(class449 var1) {
		var1.method907();
	}

	@ObfInfo(name = "ao", desc = "()V")
	void method1981() {
		if (this.field2824 > 0) {
			for (class138 var1 = (class138)this.field2822.method627(); var1 != null; var1 = (class138)this.field2822.method629()) {
				var1.field1414 -= this.field2824;
			}

			this.field2823 -= this.field2824;
			this.field2824 = 0;
		}

	}

	@ObfInfo(name = "at", desc = "(Lsj;Lcs;)V")
	void method1982(class155 var1, class138 var2) {
		while (var1 != this.field2822.field1030 && ((class138)var1).field1414 <= var2.field1414) {
			var1 = var1.field1482;
		}

		class113.method624(var2, var1);
		this.field2823 = ((class138)this.field2822.field1030.field1482).field1414;
	}

	@ObfInfo(name = "ac", desc = "(Lcs;)V")
	void method1983(class138 var1) {
		var1.method907();
		var1.method815();
		class155 var2 = this.field2822.field1030.field1482;
		if (var2 == this.field2822.field1030) {
			this.field2823 = -1;
		} else {
			this.field2823 = ((class138)var2).field1414;
		}

	}

	@ObfInfo(name = "ai", desc = "()Lbw;")
	protected class449 method2354() {
		return (class449)this.field2825.method627();
	}

	@ObfInfo(name = "az", desc = "()Lbw;")
	protected class449 method2355() {
		return (class449)this.field2825.method629();
	}

	@ObfInfo(name = "ap", desc = "()I")
	protected int method2352() {
		return 0;
	}

	@ObfInfo(name = "aa", desc = "([III)V")
	public final synchronized void method2357(int[] var1, int var2, int var3) {
		do {
			if (this.field2823 < 0) {
				this.method1987(var1, var2, var3);
				return;
			}

			if (this.field2824 + var3 < this.field2823) {
				this.field2824 += var3;
				this.method1987(var1, var2, var3);
				return;
			}

			int var4 = this.field2823 - this.field2824;
			this.method1987(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field2824 += var4;
			this.method1981();
			class138 var5 = (class138)this.field2822.method627();
			synchronized(var5) {
				int var7 = var5.method816(this);
				if (var7 < 0) {
					var5.field1414 = 0;
					this.method1983(var5);
				} else {
					var5.field1414 = var7;
					this.method1982(var5.field1482, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfInfo(name = "af", desc = "([III)V")
	void method1987(int[] var1, int var2, int var3) {
		for (class449 var4 = (class449)this.field2825.method627(); var4 != null; var4 = (class449)this.field2825.method629()) {
			var4.method2358(var1, var2, var3);
		}

	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public final synchronized void method2356(int var1) {
		do {
			if (this.field2823 < 0) {
				this.method1991(var1);
				return;
			}

			if (this.field2824 + var1 < this.field2823) {
				this.field2824 += var1;
				this.method1991(var1);
				return;
			}

			int var2 = this.field2823 - this.field2824;
			this.method1991(var2);
			var1 -= var2;
			this.field2824 += var2;
			this.method1981();
			class138 var3 = (class138)this.field2822.method627();
			synchronized(var3) {
				int var5 = var3.method816(this);
				if (var5 < 0) {
					var3.field1414 = 0;
					this.method1983(var3);
				} else {
					var3.field1414 = var5;
					this.method1982(var3.field1482, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfInfo(name = "aq", desc = "(I)V")
	void method1991(int var1) {
		for (class449 var2 = (class449)this.field2825.method627(); var2 != null; var2 = (class449)this.field2825.method629()) {
			var2.method2356(var1);
		}

	}
}
