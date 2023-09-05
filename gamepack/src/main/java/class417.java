import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "jz")
public class class417 extends class223 {
	@ObfInfo(name = "at", desc = "Lkq;")
	class465 field3203;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -492354983)
	int field3200;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1339483923)
	int field3204;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 722115699)
	int field3205;
	@ObfInfo(name = "ae", desc = "Ljm;")
	final class116 field3202;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1715668973)
	final int field3201;

	@ObfInfo(name = "<init>", desc = "(Lmc;Lmc;ILjm;)V")
	class417(class50 var1, class50 var2, int var3, class116 var4) {
		super(var1, var2);
		this.field3201 = var3;
		this.field3202 = var4;
		this.method2197();
	}

	@ObfInfo(name = "au", desc = "(B)V", opaqueValue = "48")
	void method2197() {
		this.field3200 = class185.method1043(this.field3201, (byte)-56).method1614().field2358;
		this.field3203 = this.field3202.method664(class185.method1044(this.field3200));
		class185 var2 = class185.method1044(this.method1208());
		class150 var3 = var2.method1040(false);
		if (null != var3) {
			this.field3204 = var3.field1464;
			this.field3205 = var3.field1460;
		} else {
			this.field3204 = 0;
			this.field3205 = 0;
		}

	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method1208() {
		return this.field3200;
	}

	@ObfInfo(name = "ao", desc = "(I)Lkq;")
	class465 method1213() {
		return this.field3203;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	int method1214() {
		return this.field3204;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	int method1209() {
		return this.field3205;
	}
}
