import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bs")
public class class117 {
	@ObfInfo(name = "um", desc = "I", intMultiplier = 517021039)
	static int field1119;
	@ObfInfo(name = "un", desc = "I", intMultiplier = 1547663815)
	static int field1121;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 685095567)
	int field1120;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 497616693)
	int field1122;

	@ObfInfo(name = "<init>", desc = "(II)V")
	class117(int var1, int var2) {
		this.field1122 = var1;
		this.field1120 = var2;
	}

	@ObfInfo(name = "au", desc = "(Lbv;I)Z", opaqueValue = "1962433132")
	boolean method682(class53 var1) {
		if (null == var1) {
			return false;
		} else {
			switch(this.field1122) {
			case 1:
				return var1.method460(this.field1120);
			case 2:
				return var1.method458(this.field1120);
			case 3:
				return var1.method459((char)this.field1120);
			case 4:
				return var1.method461(this.field1120 == 1);
			default:
				return false;
			}
		}
	}
}
