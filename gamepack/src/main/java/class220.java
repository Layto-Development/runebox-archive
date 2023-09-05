import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fn")
public class class220 {
	@ObfInfo(name = "ol", desc = "Lmi;")
	static class131 field1934;
	@ObfInfo(name = "ao", desc = "Loc;")
	class471 field1936;
	@ObfInfo(name = "au", desc = "J", longMultiplier = 6751235396742420937L)
	long field1937;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 128058307)
	public int field1935;

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	public class220(class280 var1) {
		this.field1935 = -1;
		this.field1936 = new class471();
		this.method1204(var1);
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V", opaqueValue = "7")
	void method1204(class280 var1) {
		this.field1937 = var1.method1497();
		this.field1935 = var1.method1496();

		for (int var3 = var1.method1492(); var3 != 0; var3 = var1.method1492()) {
			Object var4;
			if (var3 == 3) {
				var4 = new class288(this);
			} else if (var3 == 1) {
				var4 = new class237(this);
			} else if (var3 == 13) {
				var4 = new class172(this);
			} else if (var3 == 4) {
				var4 = new class215(this);
			} else if (var3 == 6) {
				var4 = new class249(this);
			} else if (var3 == 5) {
				var4 = new class247(this);
			} else if (var3 == 2) {
				var4 = new class242(this);
			} else if (var3 == 7) {
				var4 = new class142(this);
			} else if (var3 == 14) {
				var4 = new class198(this);
			} else if (var3 == 8) {
				var4 = new class326(this);
			} else if (var3 == 9) {
				var4 = new class427(this);
			} else if (var3 == 10) {
				var4 = new class459(this);
			} else if (var3 == 11) {
				var4 = new class120(this);
			} else if (var3 == 12) {
				var4 = new class136(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new class164(this);
			}

			((class313)var4).method1731(var1);
			this.field1936.method2417((class155)var4);
		}

	}

	@ObfInfo(name = "ae", desc = "(Lfi;I)V", opaqueValue = "192399010")
	public void method1203(class291 var1) {
		if (var1.field2300 == this.field1937 && this.field1935 == var1.field2317) {
			for (class313 var3 = (class313)this.field1936.method2423(); null != var3; var3 = (class313)this.field1936.method2419()) {
				var3.method1730(var1);
			}

			++var1.field2317;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "au", desc = "(B)Lly;")
	public static class121 method1205(byte var0) {
		if (class121.field1140 == 0) {
			if (var0 != -1) {
				throw new IllegalStateException();
			} else {
				return new class121();
			}
		} else {
			return class121.field1139[--class121.field1140];
		}
	}
}
