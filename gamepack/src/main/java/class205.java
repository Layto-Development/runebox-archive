import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ri")
public class class205 {
	@ObfInfo(name = "ac", desc = "Lri;")
	public class205 field1858;
	@ObfInfo(name = "at", desc = "Lri;")
	public class205 field1859;

	@ObfInfo(name = "au", desc = "()V")
	public void method1153() {
		if (this.field1858 != null) {
			this.field1858.field1859 = this.field1859;
			this.field1859.field1858 = this.field1858;
			this.field1859 = null;
			this.field1858 = null;
		}
	}
}
