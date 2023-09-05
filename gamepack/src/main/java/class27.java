import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "fh")
public class class27 {
	@ObfInfo(name = "jb", desc = "Liv;")
	static class194 field448;
	@ObfInfo(name = "ae", desc = "Z")
	boolean field428;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field430;
	@ObfInfo(name = "au", desc = "Z")
	boolean field442;
	@ObfInfo(name = "ag", desc = "Z")
	boolean field443;
	@ObfInfo(name = "ac", desc = "[Leg;")
	class157[] field431;
	@ObfInfo(name = "ao", desc = "Lew;")
	class532 field429;
	@ObfInfo(name = "at", desc = "Lew;")
	class532 field449;
	@ObfInfo(name = "ab", desc = "F")
	float field427;
	@ObfInfo(name = "aq", desc = "F")
	float field432;
	@ObfInfo(name = "az", desc = "F")
	float field433;
	@ObfInfo(name = "ap", desc = "F")
	float field434;
	@ObfInfo(name = "aa", desc = "F")
	float field435;
	@ObfInfo(name = "af", desc = "F")
	float field436;
	@ObfInfo(name = "ad", desc = "F")
	float field437;
	@ObfInfo(name = "aj", desc = "F")
	float field438;
	@ObfInfo(name = "an", desc = "F")
	float field439;
	@ObfInfo(name = "ar", desc = "F")
	float field440;
	@ObfInfo(name = "ay", desc = "F")
	float field447;
	@ObfInfo(name = "al", desc = "F")
	float field450;
	@ObfInfo(name = "ax", desc = "[F")
	float[] field444;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -284538355)
	int field441;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 616833209)
	int field445;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 1839145601)
	int field446;

	@ObfInfo(name = "<init>", desc = "()V")
	class27() {
		this.field443 = true;
		this.field441 = 0;
	}

	@ObfInfo(name = "au", desc = "(Ltm;IB)I")
	int method357(class280 var1, int var2, byte var3) {
		int var4 = var1.method1541();
		int var5 = var1.method1492();
		class98[] var6 = new class98[]{class98.field971, class98.field969, class98.field970, class98.field974, class98.field972, class98.field973, class98.field968, class98.field975, class98.field976};
		class98 var7 = (class98)class216.method1198(var6, var5);
		if (null == var7) {
			var7 = class98.field976;
		}

		this.field429 = class532.method2581(var1.method1492());
		this.field449 = class532.method2581(var1.method1492());
		boolean var10001;
		if (var1.method1492() != 0) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			var10001 = true;
		} else {
			var10001 = false;
		}

		this.field442 = var10001;
		this.field431 = new class157[var4];
		class157 var9 = null;

		for (int var10 = 0; var10 < var4; ++var10) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			class157 var8 = new class157();
			var8.method910(var1, var2);
			this.field431[var10] = var8;
			if (null != var9) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				var9.field1494 = var8;
			}

			var9 = var8;
		}

		return var4;
	}

	@ObfInfo(name = "ae", desc = "(S)V")
	void method358() {
		this.field445 = this.field431[0].field1488;
		this.field446 = this.field431[this.method362() - 1].field1488;
		this.field444 = new float[this.method364() + 1];

		for (int var2 = this.method360(); var2 <= this.method356(); ++var2) {
			this.field444[var2 - this.method360()] = class306.method1707(this, (float)var2);
		}

		this.field431 = null;
		this.field447 = class306.method1707(this, (float)(this.method360() - 1));
		this.field438 = class306.method1707(this, (float)(this.method356() + 1));
	}

	@ObfInfo(name = "ao", desc = "(IB)F", opaqueValue = "11")
	public float method359(int var1) {
		if (var1 < this.method360()) {
			return this.field447;
		} else {
			return var1 > this.method356() ? this.field438 : this.field444[var1 - this.method360()];
		}
	}

	@ObfInfo(name = "at", desc = "(I)I")
	int method360() {
		return this.field445;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	int method356() {
		return this.field446;
	}

	@ObfInfo(name = "ai", desc = "(I)I")
	int method364() {
		return this.method356() - this.method360();
	}

	@ObfInfo(name = "az", desc = "(FB)I", opaqueValue = "2")
	int method363(float var1) {
		if (this.field441 < 0 || (float)this.field431[this.field441].field1488 > var1 || this.field431[this.field441].field1494 != null && (float)this.field431[this.field441].field1494.field1488 <= var1) {
			if (var1 >= (float)this.method360() && var1 <= (float)this.method356()) {
				int var3 = this.method362();
				int var4 = this.field441;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;

					do {
						int var7 = var6 + var5 >> 1;
						if (var1 < (float)this.field431[var7].field1488) {
							if (var1 > (float)this.field431[var7 - 1].field1488) {
								var4 = var7 - 1;
								break;
							}

							var6 = var7 - 1;
						} else {
							if (var1 <= (float)this.field431[var7].field1488) {
								var4 = var7;
								break;
							}

							if (var1 < (float)this.field431[var7 + 1].field1488) {
								var4 = var7;
								break;
							}

							var5 = var7 + 1;
						}
					} while(var5 <= var6);
				}

				if (this.field441 != var4) {
					this.field441 = var4;
					this.field443 = true;
				}

				return this.field441;
			} else {
				return -1;
			}
		} else {
			return this.field441;
		}
	}

	@ObfInfo(name = "ap", desc = "(FI)Leg;", opaqueValue = "1882980652")
	class157 method361(float var1) {
		int var3 = this.method363(var1);
		return var3 >= 0 && var3 < this.field431.length ? this.field431[var3] : null;
	}

	@ObfInfo(name = "aa", desc = "(I)I", opaqueValue = "1529858788")
	int method362() {
		return null == this.field431 ? 0 : this.field431.length;
	}
}
