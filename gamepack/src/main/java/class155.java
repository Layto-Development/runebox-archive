import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sj")
public class class155 {
	@ObfInfo(name = "hw", desc = "Lsj;")
	public class155 field1482;
	@ObfInfo(name = "hy", desc = "Lsj;")
	public class155 field1484;
	@ObfInfo(name = "hq", desc = "J")
	public long field1483;

	@ObfInfo(name = "gg", desc = "()V")
	public void method907() {
		if (this.field1484 != null) {
			this.field1484.field1482 = this.field1482;
			this.field1482.field1484 = this.field1484;
			this.field1482 = null;
			this.field1484 = null;
		}
	}

	@ObfInfo(name = "gw", desc = "()Z")
	public boolean method908() {
		return this.field1484 != null;
	}
}
