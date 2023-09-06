public class class96 extends class218 {
	public static class215 field969;
	public static class344 field959;
	public static class96[] field957;
	public static int field958;
	static class342 field980;
	static int field979;
	byte[] field977;
	int field956;
	int field962;
	int field971;
	int field972;
	int field974;
	int[] field973;
	int[] field975;
	public boolean field966;
	public boolean field967;
	public class230 field981;
	public class334 field976;
	public int field961;
	public int field965;
	public int field970;
	public int field978;
	public String field960;
	public String field963;
	public String[] field968;
	public final int field964;

	static {
		field959 = new class344(256);
	}

	public class96(int var1) {
		this.field961 = -1;
		this.field962 = -1;
		this.field965 = 0;
		this.field966 = true;
		this.field967 = false;
		this.field968 = new String[5];
		this.field956 = Integer.MAX_VALUE;
		this.field972 = Integer.MAX_VALUE;
		this.field971 = Integer.MIN_VALUE;
		this.field974 = Integer.MIN_VALUE;
		this.field981 = class230.field2093;
		this.field976 = class334.field2925;
		this.field978 = -1;
		this.field964 = var1;
	}

	public void method632(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method633(var1, var3);
		}
	}

	void method633(class42 var1, int var2) {
		if (var2 == 1) {
			this.field961 = var1.method326();
		} else if (var2 == 2) {
			this.field962 = var1.method326();
		} else if (var2 == 3) {
			this.field963 = var1.method286();
		} else if (var2 == 4) {
			this.field970 = var1.method334();
		} else if (var2 == 5) {
			var1.method334();
		} else if (var2 == 6) {
			this.field965 = var1.method278();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method278();
				if ((var4 & 1) == 0) {
					this.field966 = false;
				}

				if ((var4 & 2) == 2) {
					this.field967 = true;
				}
			} else if (var2 == 8) {
				var1.method278();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field968[var2 - 10] = var1.method286();
			} else if (var2 == 15) {
				var4 = var1.method278();
				this.field975 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field975[var5] = var1.method280();
				}

				var1.method282();
				var5 = var1.method278();
				this.field973 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field973.length; ++var6) {
					this.field973[var6] = var1.method282();
				}

				this.field977 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field977[var6] = var1.method279();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field960 = var1.method286();
				} else if (var2 == 18) {
					var1.method326();
				} else if (var2 == 19) {
					this.field978 = var1.method327();
				} else if (var2 == 21) {
					var1.method282();
				} else if (var2 == 22) {
					var1.method282();
				} else if (var2 == 23) {
					var1.method278();
					var1.method278();
					var1.method278();
				} else if (var2 == 24) {
					var1.method280();
					var1.method280();
				} else if (var2 == 25) {
					var1.method326();
				} else if (var2 == 28) {
					var1.method278();
				} else if (var2 == 29) {
					this.field981 = (class230)class451.method2249(class237.method1362(), var1.method278());
				} else if (var2 == 30) {
					this.field976 = (class334)class451.method2249(class38.method252(), var1.method278());
				}
			}
		}

	}

	public void method634() {
		if (null != this.field975) {
			for (int var2 = 0; var2 < this.field975.length; var2 += 2) {
				if (this.field975[var2] < this.field956) {
					this.field956 = this.field975[var2];
				} else if (this.field975[var2] > this.field971) {
					this.field971 = this.field975[var2];
				}

				if (this.field975[var2 + 1] < this.field972) {
					this.field972 = this.field975[var2 + 1];
				} else if (this.field975[var2 + 1] > this.field974) {
					this.field974 = this.field975[var2 + 1];
				}
			}
		}

	}

	public class115 method635(boolean var1) {
		int var3 = var1 ? this.field962 : this.field961;
		return this.method636(var3);
	}

	class115 method636(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class115 var3 = (class115)field959.method1890((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = class38.method253(field969, var1, 0);
				if (null != var3) {
					field959.method1889(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	public int method637() {
		return this.field964;
	}

	public static class235 method638(int var0, byte var1) {
		class235 var2 = (class235)class235.field2108.method1890((long)var0);
		if (null != var2) {
			if (var1 == -1) {
				throw new IllegalStateException();
			} else {
				return var2;
			}
		} else {
			byte[] var3 = class235.field2109.method1212(6, var0);
			var2 = new class235();
			var2.field2113 = var0;
			if (var3 != null) {
				var2.method1353(new class42(var3));
			}

			var2.method1343();
			if (var2.field2145) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				var2.field2123 = 0;
				var2.field2124 = false;
			}

			class235.field2108.method1889(var2, (long)var0);
			return var2;
		}
	}

	public static int method639(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 = (var3 << 5) - var3 + class435.method2206(var0.charAt(var4));
		}

		return var3;
	}
}
