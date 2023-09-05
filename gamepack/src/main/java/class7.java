import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "le")
public final class class7 {
	@ObfInfo(name = "ac", desc = "Lou;")
	class133 field333;
	@ObfInfo(name = "au", desc = "Lsq;")
	class180 field336;
	@ObfInfo(name = "at", desc = "Lsf;")
	class525 field335;
	@ObfInfo(name = "ae", desc = "I")
	int field332;
	@ObfInfo(name = "ao", desc = "I")
	int field334;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class7(int var1) {
		this.field336 = new class180();
		this.field333 = new class133();
		this.field332 = var1;
		this.field334 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field335 = new class525(var2);
	}

	@ObfInfo(name = "au", desc = "(J)Lsq;")
	public class180 method294(long var1) {
		class180 var3 = (class180)this.field335.method2558(var1);
		if (var3 != null) {
			this.field333.method761(var3);
		}

		return var3;
	}

	@ObfInfo(name = "ae", desc = "(J)V")
	public void method292(long var1) {
		class180 var3 = (class180)this.field335.method2558(var1);
		if (var3 != null) {
			var3.method907();
			var3.method1024();
			++this.field334;
		}

	}

	@ObfInfo(name = "ao", desc = "(Lsq;J)V")
	public void method293(class180 var1, long var2) {
		if (this.field334 == 0) {
			class180 var4 = this.field333.method763();
			var4.method907();
			var4.method1024();
			if (var4 == this.field336) {
				var4 = this.field333.method763();
				var4.method907();
				var4.method1024();
			}
		} else {
			--this.field334;
		}

		this.field335.method2562(var1, var2);
		this.field333.method761(var1);
	}

	@ObfInfo(name = "at", desc = "()V")
	public void method291() {
		this.field333.method767();
		this.field335.method2559();
		this.field336 = new class180();
		this.field334 = this.field332;
	}
}
