import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ki")
public class class169 extends class223 {
	@ObfInfo(name = "th", desc = "Z")
	static boolean field1587;
	@ObfInfo(name = "ae", desc = "Lkq;")
	final class465 field1586;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1647673333)
	final int field1583;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 469171059)
	final int field1584;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1382976537)
	final int field1585;

	@ObfInfo(name = "<init>", desc = "(Lmc;Lmc;ILkq;)V")
	class169(class50 var1, class50 var2, int var3, class465 var4) {
		super(var1, var2);
		this.field1583 = var3;
		this.field1586 = var4;
		class185 var5 = class185.method1044(this.method1208());
		class150 var6 = var5.method1040(false);
		if (null != var6) {
			this.field1585 = var6.field1464;
			this.field1584 = var6.field1460;
		} else {
			this.field1585 = 0;
			this.field1584 = 0;
		}

	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method1208() {
		return this.field1583;
	}

	@ObfInfo(name = "ao", desc = "(I)Lkq;")
	class465 method1213() {
		return this.field1586;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	int method1214() {
		return this.field1585;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	int method1209() {
		return this.field1584;
	}
}
