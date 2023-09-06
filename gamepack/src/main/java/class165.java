public class class165 extends class480 {
	class393 field1608;
	int field1609;
	int field1610;
	int field1611;
	int field1612;
	int field1613;
	int field1614;
	int field1615;
	int field1616;

	class165(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class480 var9) {
		this.field1611 = var1;
		this.field1609 = var2;
		this.field1610 = var3;
		this.field1614 = var4;
		this.field1612 = var5;
		this.field1613 = var6;
		if (var7 != -1) {
			this.field1608 = class114.method702(var7);
			this.field1615 = 0;
			this.field1616 = Client.field306 - 1;
			if (this.field1608.field3311 == 0 && null != var9 && var9 instanceof class165) {
				class165 var10 = (class165)var9;
				if (this.field1608 == var10.field1608) {
					this.field1615 = var10.field1615;
					this.field1616 = var10.field1616;
					return;
				}
			}

			if (var8 && this.field1608.field3300 != -1) {
				if (!this.field1608.method2062()) {
					this.field1615 = (int)(Math.random() * (double)this.field1608.field3296.length);
					this.field1616 -= (int)(Math.random() * (double)this.field1608.field3307[this.field1615]);
				} else {
					this.field1615 = (int)(Math.random() * (double)this.field1608.method2059());
				}
			}
		}

	}

	protected final class250 method2393() {
		int var3;
		if (null != this.field1608) {
			int var2 = Client.field306 - this.field1616;
			if (var2 > 100 && this.field1608.field3300 > 0) {
				var2 = 100;
			}

			if (this.field1608.method2062()) {
				var3 = this.field1608.method2059();
				this.field1615 += var2;
				var2 = 0;
				if (this.field1615 >= var3) {
					this.field1615 = var3 - this.field1608.field3300;
					if (this.field1615 < 0 || this.field1615 > var3) {
						this.field1608 = null;
					}
				}
			} else {
				label69: {
					do {
						do {
							if (var2 <= this.field1608.field3307[this.field1615]) {
								break label69;
							}

							var2 -= this.field1608.field3307[this.field1615];
							++this.field1615;
						} while(this.field1615 < this.field1608.field3296.length);

						this.field1615 -= this.field1608.field3300;
					} while(this.field1615 >= 0 && this.field1615 < this.field1608.field3296.length);

					this.field1608 = null;
				}
			}

			this.field1616 = Client.field306 - var2;
		}

		class235 var13 = class96.method638(this.field1611, (byte)42);
		if (var13.field2147 != null) {
			var13 = var13.method1350();
		}

		if (null == var13) {
			return null;
		} else {
			int var4;
			if (this.field1610 != 1 && this.field1610 != 3) {
				var3 = var13.field2121;
				var4 = var13.field2106;
			} else {
				var3 = var13.field2106;
				var4 = var13.field2121;
			}

			int var5 = this.field1612 + (var3 >> 1);
			int var6 = (var3 + 1 >> 1) + this.field1612;
			int var7 = this.field1613 + (var4 >> 1);
			int var8 = this.field1613 + (var4 + 1 >> 1);
			int[][] var9 = class38.field511[this.field1614];
			int var10 = var9[var5][var8] + var9[var5][var7] + var9[var6][var7] + var9[var6][var8] >> 2;
			int var11 = (this.field1612 << 7) + (var3 << 6);
			int var12 = (this.field1613 << 7) + (var4 << 6);
			return var13.method1348(this.field1609, this.field1610, var9, var11, var10, var12, this.field1608, this.field1615);
		}
	}

	static int method914(int var0, int var1) {
		class281 var3 = (class281)class281.field2506.method1492((long)var0);
		if (null == var3) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field2504.length ? var3.field2504[var1] : 0;
		}
	}

	static int method915(int var0, class167 var1, boolean var2) {
		class60 var4 = var2 ? class491.field4134 : class52.field599;
		if (var0 == 1700) {
			class139.field1344[++class203.field1903 - 1] = var4.field772;
			return 1;
		} else if (var0 == 1701) {
			if (var4.field772 != -1) {
				class139.field1344[++class203.field1903 - 1] = var4.field773;
			} else {
				class139.field1344[++class203.field1903 - 1] = 0;
			}

			return 1;
		} else if (var0 == 1702) {
			class139.field1344[++class203.field1903 - 1] = var4.field763;
			return 1;
		} else if (var0 == 1707) {
			class139.field1344[++class203.field1903 - 1] = var4.method469() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class359.method1943(var4);
		} else {
			return var0 == 1709 ? class432.method2197(var4) : 2;
		}
	}
}
