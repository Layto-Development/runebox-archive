public class class57 extends class189 {

	class67 field630;

	int field631;

	int field632;

	int field633;

	int field634;

	int field635;

	int field636;

	int field637;

	int field638;

	class57(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class189 var9) {
		this.field633 = var1;
		this.field631 = var2;
		this.field632 = var3;
		this.field636 = var4;
		this.field634 = var5;
		this.field635 = var6;
		if (var7 != -1) {
			this.field630 = class67.method308(var7);
			this.field637 = 0;
			this.field638 = Client.field1201 - 1;
			if (this.field630.field716 == 0 && null != var9 && var9 instanceof class57) {
				class57 var10 = (class57) var9;
				if (this.field630 == var10.field630) {
					this.field637 = var10.field637;
					this.field638 = var10.field638;
					return;
				}
			}
			if (var8 && this.field630.field705 != -1) {
				if (!this.field630.method307()) {
					this.field637 = (int) (Math.random() * (double) this.field630.field701.length);
					this.field638 -= (int) (Math.random() * (double) this.field630.field712[this.field637]);
				} else {
					this.field637 = (int) (Math.random() * (double) this.field630.method304());
				}
			}
		}
	}

	@Override
	protected final class113 method1165() {
		int var3;
		if (null != this.field630) {
			int var2 = Client.field1201 - this.field638;
			if (var2 > 100 && this.field630.field705 > 0) {
				var2 = 100;
			}
			if (this.field630.method307()) {
				var3 = this.field630.method304();
				this.field637 += var2;
				var2 = 0;
				if (this.field637 >= var3) {
					this.field637 = var3 - this.field630.field705;
					if (this.field637 < 0 || this.field637 > var3) {
						this.field630 = null;
					}
				}
			} else {
				label69: {
					do {
						do {
							if (var2 <= this.field630.field712[this.field637]) {
								break label69;
							}
							var2 -= this.field630.field712[this.field637];
							++this.field637;
						} while (this.field637 < this.field630.field701.length);
						this.field637 -= this.field630.field705;
					} while (this.field637 >= 0 && this.field637 < this.field630.field701.length);
					this.field630 = null;
				}
			}
			this.field638 = Client.field1201 - var2;
		}
		class362 var13 = class319.method1705(this.field633, (byte) 42);
		if (var13.field2909 != null) {
			var13 = var13.method1893();
		}
		if (null == var13) {
			return null;
		} else {
			int var4;
			if (this.field632 != 1 && this.field632 != 3) {
				var3 = var13.field2883;
				var4 = var13.field2868;
			} else {
				var3 = var13.field2868;
				var4 = var13.field2883;
			}
			int var5 = this.field634 + (var3 >> 1);
			int var6 = (var3 + 1 >> 1) + this.field634;
			int var7 = this.field635 + (var4 >> 1);
			int var8 = this.field635 + (var4 + 1 >> 1);
			int[][] var9 = class502.field4035[this.field636];
			int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
			int var11 = (this.field634 << 7) + (var3 << 6);
			int var12 = (this.field635 << 7) + (var4 << 6);
			return var13.method1891(this.field631, this.field632, var9, var11, var10, var12, this.field630, this.field637);
		}
	}

	static int method228(int var0, class436 var1, boolean var2) {
		class354 var4 = var2 ? class430.field3370 : class153.field1593;
		if (var0 == 1700) {
			class221.field1982[++class439.field3437 - 1] = var4.field2816;
			return 1;
		} else if (var0 == 1701) {
			if (var4.field2816 != -1) {
				class221.field1982[++class439.field3437 - 1] = var4.field2817;
			} else {
				class221.field1982[++class439.field3437 - 1] = 0;
			}
			return 1;
		} else if (var0 == 1702) {
			class221.field1982[++class439.field3437 - 1] = var4.field2807;
			return 1;
		} else if (var0 == 1707) {
			class221.field1982[++class439.field3437 - 1] = var4.method1852() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class221.method1341(var4);
		} else {
			return var0 == 1709 ? class221.method1351(var4) : 2;
		}
	}
}
