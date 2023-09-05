import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;

@ObfInfo(name = "pj")
public class class338 {
	@ObfInfo(name = "as", desc = "Z")
	boolean field2686;
	@ObfInfo(name = "ay", desc = "Lpk;")
	class300 field2685;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 633771027)
	int field2680;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 2089434589)
	int field2681;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1258596067)
	int field2682;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1403151291)
	int field2683;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1719851919)
	int field2684;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1637064671)
	int field2687;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 884828437)
	int field2688;
	@ObfInfo(name = "aj", desc = "Ljava/util/ArrayList;")
	ArrayList field2679;

	@ObfInfo(name = "<init>", desc = "()V")
	public class338() {
		this.field2682 = Integer.MAX_VALUE;
		this.field2681 = Integer.MAX_VALUE;
		this.field2680 = 0;
		this.field2683 = 0;
		this.field2684 = 0;
		this.field2686 = true;
		this.field2679 = new ArrayList();
		this.field2687 = 0;
		this.field2688 = 0;
	}

	@ObfInfo(name = "au", desc = "(II)Lpz;")
	public class457 method1845(int var1) {
		return (class457)this.field2679.get(var1);
	}

	@ObfInfo(name = "ae", desc = "(I)Lpz;", opaqueValue = "1525097793")
	class457 method1827() {
		return this.field2679.size() == 0 ? null : (class457)this.field2679.get(this.field2679.size() - 1);
	}

	@ObfInfo(name = "ao", desc = "(I)Z")
	public boolean method1864() {
		return this.field2679.size() == 0;
	}

	@ObfInfo(name = "at", desc = "(I)Z", opaqueValue = "-364966225")
	boolean method1866() {
		return this.field2681 > 1;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	public int method1830() {
		return this.field2679.size();
	}

	@ObfInfo(name = "ai", desc = "(I)Ljava/lang/String;")
	public String method1831() {
		if (this.method1864()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method1830());

			for (int var3 = 0; var3 < this.method1830(); ++var3) {
				class457 var4 = this.method1845(var3);
				var2.append(var4.field3716);
			}

			return var2.toString();
		}
	}

	@ObfInfo(name = "az", desc = "(IB)V", opaqueValue = "0")
	public void method1858(int var1) {
		if (this.field2685 != null && var1 < 2 * this.field2685.field2414) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field2682 != var1) {
			this.field2682 = var1;
			this.method1865();
		}

	}

	@ObfInfo(name = "ap", desc = "(II)V", opaqueValue = "982713611")
	public void method1829(int var1) {
		if (var1 != this.field2681) {
			this.field2681 = var1;
			this.method1865();
		}

	}

	@ObfInfo(name = "aa", desc = "(IB)V", opaqueValue = "-1")
	public void method1832(int var1) {
		if (var1 != this.field2688) {
			this.field2688 = var1;
			this.method1865();
		}

	}

	@ObfInfo(name = "af", desc = "(Lpk;I)V", opaqueValue = "-1257893174")
	public void method1833(class300 var1) {
		if (var1 != this.field2685) {
			this.field2685 = var1;
			if (null != this.field2685) {
				if (this.field2684 == 0) {
					this.field2684 = this.field2685.field2414;
				}

				if (!this.method1864()) {
					this.method1865();
				}
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(II)V")
	public void method1862(int var1) {
		if (this.field2687 != var1) {
			this.field2687 = var1;
			this.method1865();
		}

	}

	@ObfInfo(name = "aq", desc = "(III)Z", opaqueValue = "-1954689868")
	public boolean method1834(int var1, int var2) {
		if (var1 != this.field2680 || this.field2683 != var2) {
			this.field2680 = var1;
			this.field2683 = var2;
			this.method1865();
		}

		return true;
	}

	@ObfInfo(name = "al", desc = "(II)V", opaqueValue = "1080029038")
	public void method1835(int var1) {
		if (var1 != this.field2684) {
			this.field2684 = var1;
			this.method1865();
		}

	}

	@ObfInfo(name = "an", desc = "(III)Lpl;", opaqueValue = "-1102763630")
	public class474 method1836(int var1, int var2) {
		if (var2 == var1) {
			return new class474(this, 0, 0);
		} else if (var1 <= this.field2679.size() && var2 <= this.field2679.size()) {
			return var2 < var1 ? new class474(this, var2, var1) : new class474(this, var1, var2);
		} else {
			return new class474(this, 0, 0);
		}
	}

	@ObfInfo(name = "ar", desc = "(CIII)Lpu;")
	public class472 method1861(char var1, int var2, int var3) {
		return this.method1837(Character.toString(var1), var2, var3);
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/String;III)Lpu;", opaqueValue = "-1123779825")
	public class472 method1837(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.field2679.size() >= var3) {
			this.method1828(var2, var2);
			return new class472(var2, true);
		} else {
			this.field2679.ensureCapacity(this.field2679.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.field2679.size() < var3; ++var6) {
				class457 var7 = new class457();
				var7.field3716 = var1.charAt(var6);
				this.field2679.add(var5, var7);
				++var5;
			}

			this.method1828(var2, var5);
			if (this.field2681 != 0 && this.method1860() > this.field2681) {
				while (var5 != var2) {
					--var5;
					this.method1839(var5);
					if (this.method1860() <= this.field2681) {
						break;
					}
				}

				return new class472(var5, true);
			} else {
				return new class472(var5, false);
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;II)Lpu;")
	class472 method1859(String var1, int var2) {
		return this.method1837(var1, this.field2679.size(), var2);
	}

	@ObfInfo(name = "am", desc = "(Ljava/lang/String;B)Lpu;")
	public class472 method1863(String var1) {
		this.method1838();
		return this.method1859(var1, 0);
	}

	@ObfInfo(name = "ax", desc = "(I)V")
	void method1838() {
		this.field2679.clear();
	}

	@ObfInfo(name = "ah", desc = "(IB)I")
	public int method1839(int var1) {
		return this.method1840(var1, var1 + 1);
	}

	@ObfInfo(name = "as", desc = "(III)I", opaqueValue = "488053523")
	public int method1840(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field2679.subList(var1, var2).clear();
		var4 = var1;
		if (this.method1866() && this.field2687 == 1) {
			while (var4 > 0) {
				--var4;
				char var5 = ((class457)this.field2679.get(var4)).field3716;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}

		this.method1828(var4, var2);
		return var1;
	}

	@ObfInfo(name = "ay", desc = "(IIS)I", opaqueValue = "194")
	public int method1857(int var1, int var2) {
		if (null == this.field2685) {
			return 0;
		} else if (this.method1866() && var1 > this.field2682) {
			return this.field2679.size();
		} else {
			if (!this.field2679.isEmpty()) {
				for (int var4 = 0; var4 < this.field2679.size(); ++var4) {
					class457 var5 = (class457)this.field2679.get(var4);
					if (var2 <= var5.field3718 + this.method1844()) {
						if (var2 < var5.field3718) {
							break;
						}

						if (var1 < var5.field3715) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.field2679.size() && ((class457)this.field2679.get(var4 + 1)).field3718 != var5.field3718) {
							int var6 = this.method1854((class457)this.field2679.get(var4), false);
							if (var1 < var6 + var5.field3715) {
								return var4;
							}

							if (var2 <= var5.field3718 + this.method1844()) {
								return var4 + 1;
							}
						}
					}
				}

				class457 var7 = (class457)this.field2679.get(this.field2679.size() - 1);
				if (var1 >= var7.field3715 && var1 <= var7.field3715 + this.method1846() && var2 >= var7.field3718 && var2 <= var7.field3718 + this.method1844()) {
					return this.field2679.size() - 1;
				}
			}

			return this.field2679.size();
		}
	}

	@ObfInfo(name = "aj", desc = "(IIS)I", opaqueValue = "139")
	public int method1841(int var1, int var2) {
		if (this.field2685 != null && !this.method1864() && var1 <= this.field2679.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				class457 var7 = (class457)this.field2679.get(var1 - 1);
				var5 = var7.field3715 + this.method1851(var1 - 1);
				var6 = var7.field3718;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field2679.size() + 1 : 0;

			for (int var12 = var4 + var1; var11 != var12; var12 += var4) {
				class457 var13 = (class457)this.field2679.get(var12 - 1);
				if (var6 != var13.field3718) {
					++var8;
					var6 = var13.field3718;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var2 == var8) {
					int var14 = Math.abs(var13.field3715 + this.method1851(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field2679.size();
			} else {
				if (var6 != 0) {
					++var8;
				}

				return var10 != 16777215 && (var2 != var8 || var5 >= var10) ? var9 : 0;
			}
		} else {
			return 0;
		}
	}

	@ObfInfo(name = "av", desc = "(I)I", opaqueValue = "-990297120")
	public int method1842() {
		if (!this.field2679.isEmpty() && this.method1860() == 1) {
			return this.field2679.isEmpty() ? 0 : ((class457)this.field2679.get(this.field2679.size() - 1)).field3715 + this.method1846();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field2679.size() - 1; var4 >= 0; --var4) {
				class457 var5 = (class457)this.field2679.get(var4);
				if (var2 != var5.field3718) {
					int var6 = this.method1854(var5, false) + var5.field3715;
					var3 = Math.max(var6, var3);
					var2 = var5.field3718;
				}
			}

			return var3;
		}
	}

	@ObfInfo(name = "aw", desc = "(I)I", opaqueValue = "1416660626")
	public int method1843() {
		return this.method1864() ? 0 : this.field2685.field2414 + ((class457)this.field2679.get(this.field2679.size() - 1)).field3718;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method1844() {
		return this.field2684;
	}

	@ObfInfo(name = "bh", desc = "(B)I")
	public int method1860() {
		return this.method1843() / this.field2685.field2414;
	}

	@ObfInfo(name = "bj", desc = "(I)I", opaqueValue = "1742890610")
	int method1846() {
		return this.method1864() ? 0 : this.method1854((class457)this.field2679.get(this.field2679.size() - 1), false);
	}

	@ObfInfo(name = "bk", desc = "(B)I")
	public int method1867() {
		return this.field2682;
	}

	@ObfInfo(name = "bv", desc = "(I)I")
	public int method1847() {
		return this.field2681;
	}

	@ObfInfo(name = "bt", desc = "(B)I")
	public int method1855() {
		return this.field2687;
	}

	@ObfInfo(name = "bd", desc = "(I)I")
	public int method1848() {
		return this.field2688;
	}

	@ObfInfo(name = "by", desc = "(IB)I")
	public int method1849(int var1) {
		switch(this.field2680) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfInfo(name = "bs", desc = "(IB)I")
	public int method1850(int var1) {
		switch(this.field2683) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfInfo(name = "bm", desc = "(I)V")
	void method1865() {
		this.method1828(0, this.field2679.size());
	}

	@ObfInfo(name = "bf", desc = "(III)V", opaqueValue = "2018336016")
	void method1828(int var1, int var2) {
		if (!this.method1864() && null != this.field2685) {
			class165 var4 = this.method1852(var1, var2);
			boolean var5 = (Integer)var4.field1562 == 0 && (Integer)var4.field1561 == this.field2679.size();
			int var6 = (Integer)var4.field1562;
			int var7 = 0;
			int var8 = var5 ? 0 : ((class457)this.field2679.get((Integer)var4.field1562)).field3718;
			int var9 = 0;

			int var10;
			for (var10 = (Integer)var4.field1562; var10 <= (Integer)var4.field1561; ++var10) {
				boolean var11 = var10 >= this.field2679.size();
				class457 var12 = (class457)this.field2679.get(!var11 ? var10 : this.field2679.size() - 1);
				int var13 = !var11 ? this.method1854(var12, false) : 0;
				boolean var14 = !var11 && var12.field3716 == '\n';
				boolean var15 = !var11 && this.method1866() && var13 + var7 > this.field2682;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					class457 var20;
					if (var15) {
						var18 = 0;
						if (this.field2687 == 1) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (class457)this.field2679.get(var19);
								var18 += var19 < var16 ? this.method1854(var20, false) : 0;
								if (var20.field3716 == ' ' || var20.field3716 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}

					var18 = -this.method1849(var7);

					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (class457)this.field2679.get(var19);
						int var21 = this.method1854(var20, false);
						var20.field3715 = var18;
						var20.field3718 = var8;
						var18 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += this.method1844();
					++var9;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.field2683 != 0 && var5) {
				var10 = var9 * this.method1844();
				int var22 = this.method1850(var10);

				for (int var23 = 0; var23 < this.field2679.size(); ++var23) {
					class457 var24 = (class457)this.field2679.get(var23);
					var24.field3718 -= var22;
				}
			}

		}
	}

	@ObfInfo(name = "bq", desc = "(II)I", opaqueValue = "1035628642")
	int method1851(int var1) {
		return var1 < this.field2679.size() ? this.method1854((class457)this.field2679.get(var1), false) : 0;
	}

	@ObfInfo(name = "ba", desc = "(Lpz;ZI)I", opaqueValue = "-36644198")
	int method1854(class457 var1, boolean var2) {
		if (var1.field3716 == '\n') {
			return 0;
		} else if (!var2 && this.field2688 != 0) {
			return this.field2685.field2417[42];
		} else {
			int var4 = this.field2685.field2417[var1.field3716];
			if (var4 == 0) {
				return var1.field3716 == '\t' ? this.field2685.field2417[32] * 3 : this.field2685.field2417[32];
			} else {
				return var4;
			}
		}
	}

	@ObfInfo(name = "bl", desc = "(IIB)Lss;", opaqueValue = "0")
	class165 method1852(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field2679.size();
		if (var4 == 0 && var5 == var6) {
			return new class165(0, var6);
		} else {
			int var7 = this.method1853(var4, false);
			int var8 = this.method1856(var5, false);
			int var9;
			switch(this.field2683) {
			case 0:
				if (this.field2680 == 0) {
					return new class165(var7, var6);
				}

				var9 = this.method1853(var4, true);
				return new class165(var9, var6);
			case 1:
				return new class165(0, var6);
			case 2:
				if (this.field2680 == 2) {
					return new class165(0, var8);
				}

				var9 = this.method1856(var5, true);
				return new class165(0, var9);
			default:
				return new class165(0, var6);
			}
		}
	}

	@ObfInfo(name = "bp", desc = "(IZI)I", opaqueValue = "-971358437")
	int method1853(int var1, boolean var2) {
		if (var1 < this.field2679.size()) {
			int var4 = ((class457)this.field2679.get(var1)).field3718;

			for (int var5 = var1; var5 > 0; --var5) {
				if (((class457)this.field2679.get(var5 - 1)).field3718 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class457)this.field2679.get(var5 - 1)).field3718;
				}
			}
		}

		return 0;
	}

	@ObfInfo(name = "bu", desc = "(IZI)I", opaqueValue = "1638537920")
	int method1856(int var1, boolean var2) {
		if (var1 < this.field2679.size()) {
			int var4 = ((class457)this.field2679.get(var1)).field3718;

			for (int var5 = var1; var5 < this.field2679.size() - 1; ++var5) {
				if (((class457)this.field2679.get(var5 + 1)).field3718 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class457)this.field2679.get(var5 + 1)).field3718;
				}
			}
		}

		return this.field2679.size();
	}
}
