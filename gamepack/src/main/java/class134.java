import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hu")
public class class134 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field1378;
	@ObfInfo(name = "ae", desc = "Lle;")
	static class7 field1375;
	@ObfInfo(name = "ao", desc = "C")
	public char field1372;
	@ObfInfo(name = "at", desc = "C")
	public char field1373;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -46079051)
	public int field1371;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1933948465)
	public int field1376;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field1370;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field1379;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public String field1374;
	@ObfInfo(name = "af", desc = "[Ljava/lang/String;")
	public String[] field1377;

	static {
		field1375 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class134() {
		this.field1374 = class453.field3707;
		this.field1376 = 0;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)V", opaqueValue = "-1416552290")
	void method769(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method770(var1, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "54028768")
	void method770(class280 var1, int var2) {
		if (var2 == 1) {
			this.field1372 = (char)var1.method1492();
		} else if (var2 == 2) {
			this.field1373 = (char)var1.method1492();
		} else if (var2 == 3) {
			this.field1374 = var1.method1500();
		} else if (var2 == 4) {
			this.field1371 = var1.method1496();
		} else {
			int var4;
			if (var2 == 5) {
				this.field1376 = var1.method1541();
				this.field1370 = new int[this.field1376];
				this.field1377 = new String[this.field1376];

				for (var4 = 0; var4 < this.field1376; ++var4) {
					this.field1370[var4] = var1.method1496();
					this.field1377[var4] = var1.method1500();
				}
			} else if (var2 == 6) {
				this.field1376 = var1.method1541();
				this.field1370 = new int[this.field1376];
				this.field1379 = new int[this.field1376];

				for (var4 = 0; var4 < this.field1376; ++var4) {
					this.field1370[var4] = var1.method1496();
					this.field1379[var4] = var1.method1496();
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "(B)I")
	public int method768() {
		return this.field1376;
	}

	@ObfInfo(name = "au", desc = "(II)Lhu;")
	public static class134 method771(int var0) {
		class134 var2 = (class134)field1375.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1378.method2267(8, var0);
			var2 = new class134();
			if (null != var3) {
				var2.method769(new class280(var3));
			}

			field1375.method293(var2, (long)var0);
			return var2;
		}
	}
}
