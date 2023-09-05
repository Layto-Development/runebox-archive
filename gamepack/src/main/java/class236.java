import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "pm")
public abstract class class236 {
	@ObfInfo(name = "ai", desc = "Z")
	boolean field1979;
	@ObfInfo(name = "az", desc = "Z")
	boolean field1980;
	@ObfInfo(name = "ao", desc = "Lpm;")
	class236 field1976;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	String field1977;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	String field1978;

	@ObfInfo(name = "<init>", desc = "(Lpm;)V")
	class236(class236 var1) {
		this.field1976 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Z")
	public abstract boolean method1242();

	@ObfInfo(name = "ai", desc = "(B)Z")
	public boolean method1243() {
		return this.field1979;
	}

	@ObfInfo(name = "az", desc = "(I)Z")
	public boolean method1246() {
		return this.field1980;
	}

	@ObfInfo(name = "ap", desc = "(I)Ljava/lang/String;")
	public String method1241() {
		return "Error in task: " + this.field1978 + ", Error message: " + this.field1977;
	}

	@ObfInfo(name = "aa", desc = "(S)Lpm;")
	public class236 method1244() {
		return this.field1976;
	}

	@ObfInfo(name = "af", desc = "(Ljava/lang/String;B)V")
	void method1245(String var1) {
		this.field1979 = true;
		this.field1977 = var1;
	}
}
