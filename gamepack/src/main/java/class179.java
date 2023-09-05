import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qs")
public class class179 implements Comparable {
	@ObfInfo(name = "cj", desc = "I", intMultiplier = -1400140503)
	static int field1631;
	@ObfInfo(name = "ao", desc = "Luc;")
	class353 field1629;
	@ObfInfo(name = "at", desc = "Luc;")
	class353 field1630;

	@ObfInfo(name = "<init>", desc = "()V")
	class179() {
	}

	@ObfInfo(name = "as", desc = "(I)Luc;")
	public class353 method1019() {
		return this.field1629;
	}

	@ObfInfo(name = "ay", desc = "(I)Ljava/lang/String;", opaqueValue = "-1667677195")
	public String method1020() {
		return this.field1629 == null ? "" : this.field1629.method1935();
	}

	@ObfInfo(name = "aj", desc = "(I)Ljava/lang/String;", opaqueValue = "1645382276")
	public String method1021() {
		return this.field1630 == null ? "" : this.field1630.method1935();
	}

	@ObfInfo(name = "av", desc = "(Luc;Luc;I)V", opaqueValue = "-733820505")
	void method1022(class353 var1, class353 var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.field1629 = var1;
			this.field1630 = var2;
		}
	}

	@ObfInfo(name = "ae", desc = "(Lqs;I)I")
	public int method1023(class179 var1) {
		return this.field1629.method1934(var1.field1629);
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method1023((class179)var1);
	}
}
