import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.LinkedList;

@ObfInfo(name = "ke")
public abstract class class528 {
	@ObfInfo(name = "am", desc = "Z")
	boolean field4220;
	@ObfInfo(name = "ax", desc = "Z")
	boolean field4221;
	@ObfInfo(name = "ab", desc = "[[[B")
	byte[][][] field4209;
	@ObfInfo(name = "ar", desc = "[[[B")
	byte[][][] field4222;
	@ObfInfo(name = "ag", desc = "[[[[Lkn;")
	class204[][][][] field4219;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -916737637)
	int field4208;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1778940411)
	int field4210;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -412057709)
	int field4211;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1663287037)
	int field4212;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1049856677)
	int field4214;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 662312589)
	int field4216;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1733973673)
	int field4217;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1937460859)
	int field4218;
	@ObfInfo(name = "an", desc = "[[[S")
	short[][][] field4213;
	@ObfInfo(name = "al", desc = "[[[S")
	short[][][] field4215;

	@ObfInfo(name = "<init>", desc = "()V")
	class528() {
		this.field4218 = -1;
		this.field4208 = -1;
		new LinkedList();
		this.field4220 = false;
		this.field4221 = false;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)V")
	abstract void method2567(class280 var1);

	@ObfInfo(name = "aw", desc = "(I)Z", opaqueValue = "1993834972")
	boolean method2564() {
		return this.field4220 && this.field4221;
	}

	@ObfInfo(name = "ak", desc = "(Lnu;I)V", opaqueValue = "-916288041")
	void method2565(class437 var1) {
		if (!this.method2564()) {
			byte[] var3 = var1.method2267(this.field4218, this.field4208);
			if (var3 != null) {
				this.method2567(new class280(var3));
				this.field4220 = true;
				this.field4221 = true;
			}

		}
	}

	@ObfInfo(name = "bh", desc = "(I)V")
	void method2566() {
		this.field4215 = (short[][][])null;
		this.field4213 = (short[][][])null;
		this.field4222 = (byte[][][])null;
		this.field4209 = (byte[][][])null;
		this.field4219 = (class204[][][][])null;
		this.field4220 = false;
		this.field4221 = false;
	}

	@ObfInfo(name = "bj", desc = "(IILtm;I)V", opaqueValue = "-938397050")
	void method2569(int var1, int var2, class280 var3) {
		int var5 = var3.method1492();
		if (var5 != 0) {
			if ((var5 & 1) != 0) {
				this.method2568(var1, var2, var3, var5);
			} else {
				this.method2572(var1, var2, var3, var5);
			}

		}
	}

	@ObfInfo(name = "bk", desc = "(IILtm;IS)V")
	void method2568(int var1, int var2, class280 var3, int var4) {
		boolean var6 = (var4 & 2) != 0;
		if (var6) {
			this.field4213[0][var1][var2] = (short)var3.method1541();
		}

		this.field4215[0][var1][var2] = (short)var3.method1541();
	}

	@ObfInfo(name = "bv", desc = "(IILtm;II)V", opaqueValue = "-139737172")
	void method2572(int var1, int var2, class280 var3, int var4) {
		int var6 = ((var4 & 24) >> 3) + 1;
		boolean var7 = (var4 & 2) != 0;
		boolean var8 = (var4 & 4) != 0;
		this.field4215[0][var1][var2] = (short)var3.method1541();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method1492();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.method1541();
				if (var11 != 0) {
					this.field4213[var10][var1][var2] = (short)var11;
					var12 = var3.method1492();
					this.field4222[var10][var1][var2] = (byte)(var12 >> 2);
					this.field4209[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method1492();
				if (var10 != 0) {
					class204[] var15 = this.field4219[var9][var1][var2] = new class204[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method1540();
						int var14 = var3.method1492();
						var15[var12] = new class204(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	@ObfInfo(name = "bt", desc = "(I)I")
	int method2570() {
		return this.field4210;
	}

	@ObfInfo(name = "bd", desc = "(I)I")
	int method2571() {
		return this.field4217;
	}
}
