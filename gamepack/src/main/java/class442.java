import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "os")
public final class class442 {
	@ObfInfo(name = "au", desc = "Lsq;")
	class180 field3330;

	@ObfInfo(name = "<init>", desc = "()V")
	public class442() {
		this.field3330 = new class180();
		this.field3330.field1632 = this.field3330;
		this.field3330.field1633 = this.field3330;
	}

	@ObfInfo(name = "au", desc = "(Lsq;)V")
	public void method2315(class180 var1) {
		if (var1.field1633 != null) {
			var1.method1024();
		}

		var1.field1633 = this.field3330.field1633;
		var1.field1632 = this.field3330;
		var1.field1633.field1632 = var1;
		var1.field1632.field1633 = var1;
	}

	@ObfInfo(name = "ae", desc = "(Lsq;)V")
	public void method2313(class180 var1) {
		if (var1.field1633 != null) {
			var1.method1024();
		}

		var1.field1633 = this.field3330;
		var1.field1632 = this.field3330.field1632;
		var1.field1633.field1632 = var1;
		var1.field1632.field1633 = var1;
	}

	@ObfInfo(name = "ao", desc = "()Lsq;")
	public class180 method2314() {
		class180 var1 = this.field3330.field1632;
		return var1 == this.field3330 ? null : var1;
	}
}
