public class class80 {
	static int[] field844;
	static int[] field846;
	static int[] field849;
	static int[] field850;
	boolean field854;
	class43 field845;
	int field848;
	int[] field847;
	int[] field851;
	int[] field852;
	int[] field853;

	static {
		field850 = new int[500];
		field844 = new int[500];
		field846 = new int[500];
		field849 = new int[500];
	}

	class80(byte[] var1, class43 var2) {
		this.field845 = null;
		this.field848 = -1;
		this.field854 = false;
		this.field845 = var2;
		class42 var3 = new class42(var1);
		class42 var4 = new class42(var1);
		var3.field527 = 2;
		int var5 = var3.method278();
		int var6 = -1;
		int var7 = 0;
		var4.field527 = var3.field527 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method278();
			if (var9 > 0) {
				if (this.field845.field531[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field845.field531[var10] == 0) {
							field850[var7] = var10;
							field844[var7] = 0;
							field846[var7] = 0;
							field849[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field850[var7] = var8;
				short var11 = 0;
				if (this.field845.field531[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field844[var7] = var4.method289();
				} else {
					field844[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field846[var7] = var4.method289();
				} else {
					field846[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field849[var7] = var4.method289();
				} else {
					field849[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field845.field531[var8] == 5) {
					this.field854 = true;
				}
			}
		}

		if (var4.field527 != var1.length) {
		}

		this.field848 = var7;
		this.field847 = new int[var7];
		this.field851 = new int[var7];
		this.field852 = new int[var7];
		this.field853 = new int[var7];

		for (var8 = 0; var8 < var7; ++var8) {
			this.field847[var8] = field850[var8];
			this.field851[var8] = field844[var8];
			this.field852[var8] = field846[var8];
			this.field853[var8] = field849[var8];
		}

	}
}
