import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qo")
public class class317 extends class424 {
	@ObfInfo(name = "au", desc = "Z")
	boolean field2565;
	@ObfInfo(name = "ae", desc = "Z")
	boolean field2566;

	@ObfInfo(name = "<init>", desc = "()V")
	class317() {
	}

	@ObfInfo(name = "au", desc = "(Lqo;I)I", opaqueValue = "12632255")
	int method1741(class317 var1) {
		if (super.field3235 == Client.field27 && var1.field3235 != Client.field27) {
			return -1;
		} else if (var1.field3235 == Client.field27 && Client.field27 != super.field3235) {
			return 1;
		} else if (super.field3235 != 0 && var1.field3235 == 0) {
			return -1;
		} else if (var1.field3235 != 0 && super.field3235 == 0) {
			return 1;
		} else if (this.field2565 && !var1.field2565) {
			return -1;
		} else if (!this.field2565 && var1.field2565) {
			return 1;
		} else if (this.field2566 && !var1.field2566) {
			return -1;
		} else if (!this.field2566 && var1.field2566) {
			return 1;
		} else {
			return super.field3235 != 0 ? super.field3234 - var1.field3234 : var1.field3234 - super.field3234;
		}
	}

	@ObfInfo(name = "ae", desc = "(Lqs;I)I")
	public int method1023(class179 var1) {
		return this.method1741((class317)var1);
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method1741((class317)var1);
	}
}
