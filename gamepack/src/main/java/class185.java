import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hd")
public class class185 extends class180 {
	@ObfInfo(name = "ae", desc = "[Lhd;")
	public static class185[] field1667;
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field1679;
	@ObfInfo(name = "at", desc = "Lle;")
	public static class7 field1669;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 765233789)
	public static int field1668;
	@ObfInfo(name = "gu", desc = "Lnk;")
	static class505 field1690;
	@ObfInfo(name = "uc", desc = "I", intMultiplier = -1416850481)
	static int field1689;
	@ObfInfo(name = "av", desc = "[B")
	byte[] field1687;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1767195037)
	int field1666;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 343394291)
	int field1672;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1237088721)
	int field1681;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 309205389)
	int field1682;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -242464383)
	int field1684;
	@ObfInfo(name = "aj", desc = "[I")
	int[] field1683;
	@ObfInfo(name = "ab", desc = "[I")
	int[] field1685;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field1676;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field1677;
	@ObfInfo(name = "ay", desc = "Lhy;")
	public class263 field1686;
	@ObfInfo(name = "as", desc = "Lhe;")
	public class48 field1691;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -479011781)
	public int field1671;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 103070733)
	public int field1675;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1599883025)
	public int field1680;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 225792989)
	public int field1688;
	@ObfInfo(name = "ar", desc = "Ljava/lang/String;")
	public String field1670;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field1673;
	@ObfInfo(name = "an", desc = "[Ljava/lang/String;")
	public String[] field1678;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1499586763)
	public final int field1674;

	static {
		field1669 = new class7(256);
	}

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class185(int var1) {
		this.field1671 = -1;
		this.field1672 = -1;
		this.field1675 = 0;
		this.field1676 = true;
		this.field1677 = false;
		this.field1678 = new String[5];
		this.field1666 = Integer.MAX_VALUE;
		this.field1682 = Integer.MAX_VALUE;
		this.field1681 = Integer.MIN_VALUE;
		this.field1684 = Integer.MIN_VALUE;
		this.field1691 = class48.field572;
		this.field1686 = class263.field2121;
		this.field1688 = -1;
		this.field1674 = var1;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)V")
	public void method1037(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method1038(var1, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "-1175924766")
	void method1038(class280 var1, int var2) {
		if (var2 == 1) {
			this.field1671 = var1.method1540();
		} else if (var2 == 2) {
			this.field1672 = var1.method1540();
		} else if (var2 == 3) {
			this.field1673 = var1.method1500();
		} else if (var2 == 4) {
			this.field1680 = var1.method1548();
		} else if (var2 == 5) {
			var1.method1548();
		} else if (var2 == 6) {
			this.field1675 = var1.method1492();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method1492();
				if ((var4 & 1) == 0) {
					this.field1676 = false;
				}

				if ((var4 & 2) == 2) {
					this.field1677 = true;
				}
			} else if (var2 == 8) {
				var1.method1492();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field1678[var2 - 10] = var1.method1500();
			} else if (var2 == 15) {
				var4 = var1.method1492();
				this.field1685 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field1685[var5] = var1.method1494();
				}

				var1.method1496();
				var5 = var1.method1492();
				this.field1683 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field1683.length; ++var6) {
					this.field1683[var6] = var1.method1496();
				}

				this.field1687 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field1687[var6] = var1.method1493();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field1670 = var1.method1500();
				} else if (var2 == 18) {
					var1.method1540();
				} else if (var2 == 19) {
					this.field1688 = var1.method1541();
				} else if (var2 == 21) {
					var1.method1496();
				} else if (var2 == 22) {
					var1.method1496();
				} else if (var2 == 23) {
					var1.method1492();
					var1.method1492();
					var1.method1492();
				} else if (var2 == 24) {
					var1.method1494();
					var1.method1494();
				} else if (var2 == 25) {
					var1.method1540();
				} else if (var2 == 28) {
					var1.method1492();
				} else if (var2 == 29) {
					this.field1691 = (class48)class216.method1198(class48.method448(), var1.method1492());
				} else if (var2 == 30) {
					this.field1686 = (class263)class216.method1198(class263.method1372(), var1.method1492());
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "(B)V", opaqueValue = "7")
	public void method1039() {
		if (null != this.field1685) {
			for (int var2 = 0; var2 < this.field1685.length; var2 += 2) {
				if (this.field1685[var2] < this.field1666) {
					this.field1666 = this.field1685[var2];
				} else if (this.field1685[var2] > this.field1681) {
					this.field1681 = this.field1685[var2];
				}

				if (this.field1685[var2 + 1] < this.field1682) {
					this.field1682 = this.field1685[var2 + 1];
				} else if (this.field1685[var2 + 1] > this.field1684) {
					this.field1684 = this.field1685[var2 + 1];
				}
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(ZB)Lui;")
	public class150 method1040(boolean var1) {
		int var3 = var1 ? this.field1672 : this.field1671;
		return this.method1041(var3);
	}

	@ObfInfo(name = "ai", desc = "(IB)Lui;", opaqueValue = "0")
	class150 method1041(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class150 var3 = (class150)field1669.method294((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = class411.method2150(field1679, var1, 0);
				if (null != var3) {
					field1669.method293(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method1042() {
		return this.field1674;
	}

	@ObfInfo(name = "au", desc = "(II)Lhd;")
	public static class185 method1044(int var0) {
		return var0 >= 0 && var0 < field1667.length && field1667[var0] != null ? field1667[var0] : new class185(var0);
	}

	@ObfInfo(name = "au", desc = "(IB)Lhv;")
	public static class292 method1043(int var0, byte var1) {
		class292 var2 = (class292)class292.field2326.method294((long)var0);
		if (null != var2) {
			if (var1 == -1) {
				throw new IllegalStateException();
			} else {
				return var2;
			}
		} else {
			byte[] var3 = class292.field2327.method2267(6, var0);
			var2 = new class292();
			var2.field2331 = var0;
			if (var3 != null) {
				var2.method1617(new class280(var3));
			}

			var2.method1607();
			if (var2.field2363) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				var2.field2341 = 0;
				var2.field2342 = false;
			}

			class292.field2326.method293(var2, (long)var0);
			return var2;
		}
	}
}
