import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sq")
public class class180 extends class155 {
	@ObfInfo(name = "ea", desc = "Lsq;")
	public class180 field1632;
	@ObfInfo(name = "er", desc = "Lsq;")
	public class180 field1633;
	@ObfInfo(name = "ej", desc = "J")
	public long field1634;

	@ObfInfo(name = "ex", desc = "()V")
	public void method1024() {
		if (this.field1633 != null) {
			this.field1633.field1632 = this.field1632;
			this.field1632.field1633 = this.field1633;
			this.field1632 = null;
			this.field1633 = null;
		}
	}
}
