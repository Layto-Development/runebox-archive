import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sb")
public class class350 {
	@ObfInfo(name = "ap", desc = "Z")
	boolean field2766;
	@ObfInfo(name = "ai", desc = "Lnu;")
	class437 field2764;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1219559555)
	int field2765;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	String field2763;

	@ObfInfo(name = "<init>", desc = "(Lnu;)V")
	class350(class437 var1) {
		this.field2765 = 0;
		this.field2766 = false;
		this.field2764 = var1;
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;I)V", opaqueValue = "-1398397545")
	void method1925(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			if (this.field2763 != var1) {
				this.field2763 = var1;
				this.field2765 = 0;
				this.field2766 = false;
				this.method1926();
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(I)I", opaqueValue = "252910623")
	int method1926() {
		if (this.field2763 == null) {
			this.field2765 = 100;
			this.field2766 = true;
		} else {
			if (this.field2765 < 33) {
				if (!this.field2764.method2287(class506.field4082.field4085, this.field2763)) {
					return this.field2765;
				}

				this.field2765 = 33;
			}

			if (this.field2765 == 33) {
				if (this.field2764.method2289(class506.field4081.field4085, this.field2763) && !this.field2764.method2287(class506.field4081.field4085, this.field2763)) {
					return this.field2765;
				}

				this.field2765 = 66;
			}

			if (this.field2765 == 66) {
				if (!this.field2764.method2287(this.field2763, class506.field4084.field4085)) {
					return this.field2765;
				}

				this.field2765 = 100;
				this.field2766 = true;
			}
		}

		return this.field2765;
	}

	@ObfInfo(name = "ao", desc = "(B)Z")
	boolean method1927() {
		return this.field2766;
	}

	@ObfInfo(name = "at", desc = "(I)I")
	int method1928() {
		return this.field2765;
	}
}
