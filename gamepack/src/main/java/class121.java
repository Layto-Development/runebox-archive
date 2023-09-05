import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ly")
public class class121 extends class155 {
	@ObfInfo(name = "ak", desc = "[[Lmi;")
	public static class131[][] field1142;
	@ObfInfo(name = "ac", desc = "[Lly;")
	static class121[] field1139;
	@ObfInfo(name = "ip", desc = "Lsr;")
	static class389 field1143;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 612768397)
	static int field1140;
	@ObfInfo(name = "ao", desc = "Lto;")
	public class259 field1141;
	@ObfInfo(name = "au", desc = "Llw;")
	public class480 field1136;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -491908089)
	public int field1137;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1067890615)
	public int field1138;

	static {
		field1139 = new class121[300];
		field1140 = 0;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class121() {
	}

	@ObfInfo(name = "ao", desc = "(I)V", opaqueValue = "45081734")
	public void method687() {
		if (field1140 < field1139.length) {
			field1139[++field1140 - 1] = this;
		}
	}

	@ObfInfo(name = "ae", desc = "(Llw;Lux;I)Lly;")
	public static class121 method689(class480 var0, class199 var1) {
		class121 var3 = class220.method1205((byte)-1);
		var3.field1136 = var0;
		var3.field1137 = var0.field3897;
		if (var3.field1137 == -1) {
			var3.field1141 = new class259(260);
		} else if (var3.field1137 == -2) {
			var3.field1141 = new class259(10000);
		} else if (var3.field1137 <= 18) {
			var3.field1141 = new class259(20);
		} else if (var3.field1137 <= 98) {
			var3.field1141 = new class259(100);
		} else {
			var3.field1141 = new class259(260);
		}

		var3.field1141.method1353(var1);
		var3.field1141.method1355(var3.field1136.field3846);
		var3.field1138 = 0;
		return var3;
	}

	@ObfInfo(name = "ao", desc = "(II)I")
	public static int method688(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
