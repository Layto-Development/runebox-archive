import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ox")
public class class430 {
	@ObfInfo(name = "ae", desc = "Lri;")
	class205 field3263;
	@ObfInfo(name = "au", desc = "Lri;")
	class205 field3264;

	@ObfInfo(name = "<init>", desc = "()V")
	public class430() {
		this.field3264 = new class205();
		this.field3264.field1859 = this.field3264;
		this.field3264.field1858 = this.field3264;
	}

	@ObfInfo(name = "au", desc = "(Lri;)V")
	public void method2247(class205 var1) {
		if (var1.field1858 != null) {
			var1.method1153();
		}

		var1.field1858 = this.field3264.field1858;
		var1.field1859 = this.field3264;
		var1.field1858.field1859 = var1;
		var1.field1859.field1858 = var1;
	}

	@ObfInfo(name = "ae", desc = "()Lri;")
	public class205 method2249() {
		class205 var1 = this.field3264.field1859;
		if (var1 == this.field3264) {
			this.field3263 = null;
			return null;
		} else {
			this.field3263 = var1.field1859;
			return var1;
		}
	}

	@ObfInfo(name = "ao", desc = "()Lri;")
	public class205 method2248() {
		class205 var1 = this.field3263;
		if (var1 == this.field3264) {
			this.field3263 = null;
			return null;
		} else {
			this.field3263 = var1.field1859;
			return var1;
		}
	}
}
