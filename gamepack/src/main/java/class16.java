import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ia")
public class class16 {
	@ObfInfo(name = "ae", desc = "[I")
	static int[] field353;
	@ObfInfo(name = "ao", desc = "[I")
	static int[] field355;
	@ObfInfo(name = "at", desc = "[I")
	static int[] field358;
	@ObfInfo(name = "au", desc = "[I")
	static int[] field359;
	@ObfInfo(name = "ad", desc = "Z")
	boolean field363;
	@ObfInfo(name = "ac", desc = "Liu;")
	class188 field354;
	@ObfInfo(name = "ai", desc = "I")
	int field357;
	@ObfInfo(name = "az", desc = "[I")
	int[] field356;
	@ObfInfo(name = "ap", desc = "[I")
	int[] field360;
	@ObfInfo(name = "aa", desc = "[I")
	int[] field361;
	@ObfInfo(name = "af", desc = "[I")
	int[] field362;

	static {
		field359 = new int[500];
		field353 = new int[500];
		field355 = new int[500];
		field358 = new int[500];
	}

	@ObfInfo(name = "<init>", desc = "([BLiu;)V")
	class16(byte[] var1, class188 var2) {
		this.field354 = null;
		this.field357 = -1;
		this.field363 = false;
		this.field354 = var2;
		class280 var3 = new class280(var1);
		class280 var4 = new class280(var1);
		var3.field2254 = 2;
		int var5 = var3.method1492();
		int var6 = -1;
		int var7 = 0;
		var4.field2254 = var3.field2254 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method1492();
			if (var9 > 0) {
				if (this.field354.field1711[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field354.field1711[var10] == 0) {
							field359[var7] = var10;
							field353[var7] = 0;
							field355[var7] = 0;
							field358[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field359[var7] = var8;
				short var11 = 0;
				if (this.field354.field1711[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field353[var7] = var4.method1503();
				} else {
					field353[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field355[var7] = var4.method1503();
				} else {
					field355[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field358[var7] = var4.method1503();
				} else {
					field358[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field354.field1711[var8] == 5) {
					this.field363 = true;
				}
			}
		}

		if (var4.field2254 != var1.length) {
		}

		this.field357 = var7;
		this.field356 = new int[var7];
		this.field360 = new int[var7];
		this.field361 = new int[var7];
		this.field362 = new int[var7];

		for (var8 = 0; var8 < var7; ++var8) {
			this.field356[var8] = field359[var8];
			this.field360[var8] = field353[var8];
			this.field361[var8] = field355[var8];
			this.field362[var8] = field358[var8];
		}

	}
}
