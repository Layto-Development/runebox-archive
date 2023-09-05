import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "mc")
public class class50 {
	@ObfInfo(name = "aa", desc = "[[B")
	static byte[][] field584;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1225451183)
	public int field581;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 963031109)
	public int field582;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1843528111)
	public int field583;

	@ObfInfo(name = "<init>", desc = "(III)V")
	public class50(int var1, int var2, int var3) {
		this.field582 = var1;
		this.field581 = var2;
		this.field583 = var3;
	}

	@ObfInfo(name = "<init>", desc = "(Lmc;)V")
	public class50(class50 var1) {
		this.field582 = var1.field582;
		this.field581 = var1.field581;
		this.field583 = var1.field583;
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class50(int var1) {
		if (var1 == -1) {
			this.field582 = -1;
		} else {
			this.field582 = var1 >> 28 & 3;
			this.field581 = var1 >> 14 & 16383;
			this.field583 = var1 & 16383;
		}

	}

	@ObfInfo(name = "au", desc = "(I)I")
	public int method455() {
		int var3 = this.field582;
		int var4 = this.field581;
		int var5 = this.field583;
		int var2 = var3 << 28 | var4 << 14 | var5;
		return var2;
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof class50) ? false : this.method453((class50)var1);
		}
	}

	@ObfInfo(name = "ae", desc = "(Lmc;B)Z", opaqueValue = "0")
	boolean method453(class50 var1) {
		if (var1.field582 != this.field582) {
			return false;
		} else if (this.field581 != var1.field581) {
			return false;
		} else {
			return var1.field583 == this.field583;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return this.method455();
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.method454(",");
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;I)Ljava/lang/String;")
	String method454(String var1) {
		return this.field582 + var1 + (this.field581 >> 6) + var1 + (this.field583 >> 6) + var1 + (this.field581 & 63) + var1 + (this.field583 & 63);
	}
}
