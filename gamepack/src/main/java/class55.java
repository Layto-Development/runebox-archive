import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qx")
public class class55 extends class424 {
	@ObfInfo(name = "au", desc = "Lqp;")
	class486 field721;
	@ObfInfo(name = "ae", desc = "Lqp;")
	class486 field722;

	@ObfInfo(name = "<init>", desc = "()V")
	class55() {
		this.field721 = class486.field3958;
		this.field722 = class486.field3958;
	}

	@ObfInfo(name = "au", desc = "(I)V")
	void method462() {
		this.field721 = class486.field3958;
	}

	@ObfInfo(name = "ao", desc = "(I)Z", opaqueValue = "1171292064")
	public final boolean method463() {
		if (this.field721 == class486.field3958) {
			this.method466();
		}

		return this.field721 == class486.field3957;
	}

	@ObfInfo(name = "at", desc = "(B)V", opaqueValue = "9")
	void method466() {
		this.field721 = class331.field2633.field351.method900(super.field1629) ? class486.field3957 : class486.field3956;
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	void method467() {
		this.field722 = class486.field3958;
	}

	@ObfInfo(name = "ap", desc = "(B)Z", opaqueValue = "1")
	public final boolean method464() {
		if (class486.field3958 == this.field722) {
			this.method465();
		}

		return this.field722 == class486.field3957;
	}

	@ObfInfo(name = "aa", desc = "(B)V")
	void method465() {
		this.field722 = class331.field2633.field350.method900(super.field1629) ? class486.field3957 : class486.field3956;
	}
}
