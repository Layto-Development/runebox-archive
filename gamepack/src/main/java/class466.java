public class class466 {

	static int[] field3690;

	static int[] field3692;

	static int[] field3695;

	static int[] field3696;

	boolean field3700;

	class413 field3691;

	int field3694;

	int[] field3693;

	int[] field3697;

	int[] field3698;

	int[] field3699;

	static {
		field3696 = new int[500];
		field3690 = new int[500];
		field3692 = new int[500];
		field3695 = new int[500];
	}

	class466(byte[] var1, class413 var2) {
		this.field3691 = null;
		this.field3694 = -1;
		this.field3700 = false;
		this.field3691 = var2;
		class187 var3 = new class187(var1);
		class187 var4 = new class187(var1);
		var3.field1832 = 2;
		int var5 = var3.method1096();
		int var6 = -1;
		int var7 = 0;
		var4.field1832 = var3.field1832 + var5;
		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method1096();
			if (var9 > 0) {
				if (this.field3691.field3211[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field3691.field3211[var10] == 0) {
							field3696[var7] = var10;
							field3690[var7] = 0;
							field3692[var7] = 0;
							field3695[var7] = 0;
							++var7;
							break;
						}
					}
				}
				field3696[var7] = var8;
				short var11 = 0;
				if (this.field3691.field3211[var8] == 3) {
					var11 = 128;
				}
				if ((var9 & 1) != 0) {
					field3690[var7] = var4.method1107();
				} else {
					field3690[var7] = var11;
				}
				if ((var9 & 2) != 0) {
					field3692[var7] = var4.method1107();
				} else {
					field3692[var7] = var11;
				}
				if ((var9 & 4) != 0) {
					field3695[var7] = var4.method1107();
				} else {
					field3695[var7] = var11;
				}
				var6 = var8;
				++var7;
				if (this.field3691.field3211[var8] == 5) {
					this.field3700 = true;
				}
			}
		}
		if (var4.field1832 != var1.length) {
		}
		this.field3694 = var7;
		this.field3693 = new int[var7];
		this.field3697 = new int[var7];
		this.field3698 = new int[var7];
		this.field3699 = new int[var7];
		for (var8 = 0; var8 < var7; ++var8) {
			this.field3693[var8] = field3696[var8];
			this.field3697[var8] = field3690[var8];
			this.field3698[var8] = field3692[var8];
			this.field3699[var8] = field3695[var8];
		}
	}
}
