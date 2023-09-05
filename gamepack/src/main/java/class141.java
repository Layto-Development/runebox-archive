import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "gg")
public class class141 {
	@ObfInfo(name = "ao", desc = "Loc;")
	class471 field1424;
	@ObfInfo(name = "au", desc = "J", longMultiplier = -244276762934367085L)
	long field1426;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = 4534125073915190119L)
	public long field1425;

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	public class141(class280 var1) {
		this.field1425 = -1L;
		this.field1424 = new class471();
		this.method826(var1);
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V", opaqueValue = "-861523091")
	void method826(class280 var1) {
		this.field1426 = var1.method1497();
		this.field1425 = var1.method1497();

		for (int var3 = var1.method1492(); var3 != 0; var3 = var1.method1492()) {
			Object var4;
			if (var3 == 1) {
				var4 = new class466(this);
			} else if (var3 == 4) {
				var4 = new class322(this);
			} else if (var3 == 3) {
				var4 = new class111(this);
			} else if (var3 == 2) {
				var4 = new class250(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new class500(this);
			}

			((class362)var4).method1978(var1);
			this.field1424.method2417((class155)var4);
		}

	}

	@ObfInfo(name = "ae", desc = "(Lgo;B)V", opaqueValue = "8")
	public void method827(class143 var1) {
		if (var1.field1483 == this.field1426 && var1.field1439 == this.field1425) {
			for (class362 var3 = (class362)this.field1424.method2423(); null != var3; var3 = (class362)this.field1424.method2419()) {
				var3.method1979(var1);
			}

			++var1.field1439;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "at", desc = "([FI)V", opaqueValue = "-523632006")
	static void method829(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var2 = (float)(1.0D + (double)(var0[0] * (var0[0] - 2.0F + var0[1])) + ((double)var0[1] - 2.0D) * (double)var0[1]);
			if (var2 + class306.field2473 > 0.0F) {
				if (class306.field2473 + var0[0] < 1.3333334F) {
					float var3 = var0[0] - 2.0F;
					float var4 = var0[0] - 1.0F;
					float var5 = (float)Math.sqrt((double)(var3 * var3 - var4 * 4.0F * var4));
					float var6 = 0.5F * (var5 + -var3);
					if (var0[1] + class306.field2473 > var6) {
						var0[1] = var6 - class306.field2473;
					} else {
						var6 = (-var3 - var5) * 0.5F;
						if (var0[1] < var6 + class306.field2473) {
							var0[1] = class306.field2473 + var6;
						}
					}
				} else {
					var0[0] = 1.3333334F - class306.field2473;
					var0[1] = 0.33333334F - class306.field2473;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfInfo(name = "bz", desc = "(Lmi;Lmt;ZB)V", opaqueValue = "0")
	public static void method828(class131 var0, class201 var1, boolean var2) {
		var0.field1256 = 7;
		var0.field1270 = new class201(var1);
		if (!var2) {
			var0.field1270.field1816 = Arrays.copyOf(var0.field1270.field1829, var0.field1270.field1829.length);
			var0.field1270.method1133();
		}

	}
}
