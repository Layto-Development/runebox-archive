import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "hm")
public class class490 extends class180 {
	@ObfInfo(name = "ae", desc = "Lnu;")
	public static class437 field3970;
	@ObfInfo(name = "ao", desc = "Lnu;")
	public static class437 field3972;
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field3987;
	@ObfInfo(name = "ac", desc = "Lle;")
	static class7 field3973;
	@ObfInfo(name = "ai", desc = "Lle;")
	static class7 field3983;
	@ObfInfo(name = "at", desc = "Lle;")
	static class7 field3991;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1641369831)
	int field3975;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -939008145)
	int field3978;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1847013657)
	int field3979;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 469843281)
	int field3980;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 2023924639)
	int field3981;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1813030183)
	int field3989;
	@ObfInfo(name = "bh", desc = "I", intMultiplier = 1293075215)
	int field3990;
	@ObfInfo(name = "ay", desc = "Ljava/lang/String;")
	String field3985;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 814951375)
	public int field3971;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -353032379)
	public int field3974;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1267425507)
	public int field3976;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1072885703)
	public int field3977;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -1524117065)
	public int field3982;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1107259027)
	public int field3984;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1421046467)
	public int field3986;
	@ObfInfo(name = "aw", desc = "[I")
	public int[] field3988;

	static {
		field3991 = new class7(64);
		field3973 = new class7(64);
		field3983 = new class7(20);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class490() {
		this.field3975 = -1;
		this.field3974 = 16777215;
		this.field3984 = 70;
		this.field3978 = -1;
		this.field3979 = -1;
		this.field3980 = -1;
		this.field3981 = -1;
		this.field3982 = 0;
		this.field3976 = 0;
		this.field3971 = -1;
		this.field3985 = "";
		this.field3977 = -1;
		this.field3986 = 0;
		this.field3989 = -1;
		this.field3990 = -1;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;B)V", opaqueValue = "-1")
	void method2469(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method2475(var1, var3, (byte)-17);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;IB)V")
	void method2475(class280 var1, int var2, byte var3) {
		if (var2 == 1) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3975 = var1.method1540();
		} else if (var2 == 2) {
			this.field3974 = var1.method1548();
		} else if (var2 == 3) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3978 = var1.method1540();
		} else if (var2 == 4) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3980 = var1.method1540();
		} else if (var2 == 5) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3979 = var1.method1540();
		} else if (var2 == 6) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3981 = var1.method1540();
		} else if (var2 == 7) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3982 = var1.method1494();
		} else if (var2 == 8) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3985 = var1.method1542();
		} else if (var2 == 9) {
			if (var3 >= -1) {
				return;
			}

			this.field3984 = var1.method1541();
		} else if (var2 == 10) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3976 = var1.method1494();
		} else if (var2 == 11) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3971 = 0;
		} else if (var2 == 12) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field3977 = var1.method1492();
		} else if (var2 == 13) {
			if (var3 >= -1) {
				return;
			}

			this.field3986 = var1.method1494();
		} else if (var2 == 14) {
			this.field3971 = var1.method1541();
		} else {
			if (var2 != 17) {
				if (var3 >= -1) {
					return;
				}

				if (var2 != 18) {
					return;
				}
			}

			this.field3989 = var1.method1541();
			if (this.field3989 == 65535) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				this.field3989 = -1;
			}

			this.field3990 = var1.method1541();
			if (this.field3990 == 65535) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				this.field3990 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				if (var3 >= -1) {
					return;
				}

				var4 = var1.method1541();
				if (var4 == 65535) {
					if (var3 >= -1) {
						throw new IllegalStateException();
					}

					var4 = -1;
				}
			}

			int var5 = var1.method1492();
			this.field3988 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				this.field3988[var6] = var1.method1541();
				if (this.field3988[var6] == 65535) {
					this.field3988[var6] = -1;
				}
			}

			this.field3988[var5 + 1] = var4;
		}

	}

	@ObfInfo(name = "at", desc = "(I)Lhm;", opaqueValue = "-62940287")
	public final class490 method2470() {
		int var2 = -1;
		if (this.field3989 != -1) {
			var2 = class44.method444(this.field3989);
		} else if (this.field3990 != -1) {
			var2 = class44.field559[this.field3990];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field3988.length - 1) {
			var3 = this.field3988[var2];
		} else {
			var3 = this.field3988[this.field3988.length - 1];
		}

		return var3 != -1 ? method2477(var3) : null;
	}

	@ObfInfo(name = "ac", desc = "(IB)Ljava/lang/String;", opaqueValue = "1")
	public String method2474(int var1) {
		String var3 = this.field3985;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + class455.method2368(var1, false) + var3.substring(var4 + 2);
		}
	}

	@ObfInfo(name = "ai", desc = "(I)Lui;", opaqueValue = "1778361620")
	public class150 method2471() {
		if (this.field3978 < 0) {
			return null;
		} else {
			class150 var2 = (class150)field3973.method294((long)this.field3978);
			if (null != var2) {
				return var2;
			} else {
				var2 = class411.method2150(field3970, this.field3978, 0);
				if (var2 != null) {
					field3973.method293(var2, (long)this.field3978);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(I)Lui;", opaqueValue = "276381491")
	public class150 method2468() {
		if (this.field3979 < 0) {
			return null;
		} else {
			class150 var2 = (class150)field3973.method294((long)this.field3979);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class411.method2150(field3970, this.field3979, 0);
				if (var2 != null) {
					field3973.method293(var2, (long)this.field3979);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "ap", desc = "(I)Lui;", opaqueValue = "1776715833")
	public class150 method2472() {
		if (this.field3980 < 0) {
			return null;
		} else {
			class150 var2 = (class150)field3973.method294((long)this.field3980);
			if (null != var2) {
				return var2;
			} else {
				var2 = class411.method2150(field3970, this.field3980, 0);
				if (var2 != null) {
					field3973.method293(var2, (long)this.field3980);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "aa", desc = "(B)Lui;", opaqueValue = "3")
	public class150 method2473() {
		if (this.field3981 < 0) {
			return null;
		} else {
			class150 var2 = (class150)field3973.method294((long)this.field3981);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class411.method2150(field3970, this.field3981, 0);
				if (null != var2) {
					field3973.method293(var2, (long)this.field3981);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "af", desc = "(I)Lpi;", opaqueValue = "1940229821")
	public class258 method2476() {
		if (this.field3975 == -1) {
			return null;
		} else {
			class258 var2 = (class258)field3983.method294((long)this.field3975);
			if (null != var2) {
				return var2;
			} else {
				var2 = class273.method1436(field3970, field3972, this.field3975, 0);
				if (var2 != null) {
					field3983.method293(var2, (long)this.field3975);
				}

				return var2;
			}
		}
	}

	@ObfInfo(name = "au", desc = "(IB)Lhm;")
	public static class490 method2477(int var0) {
		class490 var2 = (class490)field3991.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field3987.method2267(32, var0);
			var2 = new class490();
			if (var3 != null) {
				var2.method2469(new class280(var3));
			}

			field3991.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public static void method2478() {
		field3991.method291();
		field3973.method291();
		field3983.method291();
	}
}
