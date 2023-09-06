public class class196 implements class367 {
	public static final class196 field1787;
	public static final class196 field1788;
	public static final class196 field1789;
	public static final class196 field1791;
	public static final class196 field1794;
	static class403 field1795;
	static class95 field1790;
	static int field1796;
	final int field1793;
	public final int field1792;

	static {
		field1791 = new class196(0, 0);
		field1788 = new class196(2, 1);
		field1794 = new class196(3, 2);
		field1787 = new class196(4, 3);
		field1789 = new class196(1, 4);
	}

	class196(int var1, int var2) {
		this.field1792 = var1;
		this.field1793 = var2;
	}

	public int method1970() {
		return this.field1793;
	}

	public static void method1071(class215 var0) {
		class425.field3521 = var0;
	}

	static int method1073(class12 var0, class12 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field370;
			int var6 = var1.field370;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field373 - var1.field373;
		} else if (var2 == 3) {
			if (var0.field372.equals("-")) {
				if (var1.field372.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field372.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field372.compareTo(var1.field372);
			}
		} else if (var2 == 4) {
			return var0.method116() ? (var1.method116() ? 0 : 1) : (var1.method116() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method110() ? (var1.method110() ? 0 : 1) : (var1.method110() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method119() ? (var1.method119() ? 0 : 1) : (var1.method119() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method108() ? (var1.method108() ? 0 : 1) : (var1.method108() ? -1 : 0);
		} else {
			return var0.field368 - var1.field368;
		}
	}

	static int method1072(int var0, class167 var1, boolean var2) {
		if (var0 == 6500) {
			class139.field1344[++class203.field1903 - 1] = class98.method647() ? 1 : 0;
			return 1;
		} else {
			class12 var9;
			if (var0 == 6501) {
				var9 = class454.method2261();
				if (var9 != null) {
					class139.field1344[++class203.field1903 - 1] = var9.field368;
					class139.field1344[++class203.field1903 - 1] = var9.field364;
					class139.field1331[++class429.field3529 - 1] = var9.field372;
					class139.field1344[++class203.field1903 - 1] = var9.field373;
					class139.field1344[++class203.field1903 - 1] = var9.field370;
					class139.field1331[++class429.field3529 - 1] = var9.field371;
				} else {
					class139.field1344[++class203.field1903 - 1] = -1;
					class139.field1344[++class203.field1903 - 1] = 0;
					class139.field1331[++class429.field3529 - 1] = "";
					class139.field1344[++class203.field1903 - 1] = 0;
					class139.field1344[++class203.field1903 - 1] = 0;
					class139.field1331[++class429.field3529 - 1] = "";
				}

				return 1;
			} else if (var0 == 6502) {
				var9 = class285.method1627();
				if (var9 != null) {
					class139.field1344[++class203.field1903 - 1] = var9.field368;
					class139.field1344[++class203.field1903 - 1] = var9.field364;
					class139.field1331[++class429.field3529 - 1] = var9.field372;
					class139.field1344[++class203.field1903 - 1] = var9.field373;
					class139.field1344[++class203.field1903 - 1] = var9.field370;
					class139.field1331[++class429.field3529 - 1] = var9.field371;
				} else {
					class139.field1344[++class203.field1903 - 1] = -1;
					class139.field1344[++class203.field1903 - 1] = 0;
					class139.field1331[++class429.field3529 - 1] = "";
					class139.field1344[++class203.field1903 - 1] = 0;
					class139.field1344[++class203.field1903 - 1] = 0;
					class139.field1331[++class429.field3529 - 1] = "";
				}

				return 1;
			} else {
				int var4;
				class12 var5;
				int var11;
				if (var0 == 6506) {
					var4 = class139.field1344[--class203.field1903];
					var5 = null;

					for (var11 = 0; var11 < class12.field369; ++var11) {
						if (var4 == class225.field2044[var11].field368) {
							var5 = class225.field2044[var11];
							break;
						}
					}

					if (var5 != null) {
						class139.field1344[++class203.field1903 - 1] = var5.field368;
						class139.field1344[++class203.field1903 - 1] = var5.field364;
						class139.field1331[++class429.field3529 - 1] = var5.field372;
						class139.field1344[++class203.field1903 - 1] = var5.field373;
						class139.field1344[++class203.field1903 - 1] = var5.field370;
						class139.field1331[++class429.field3529 - 1] = var5.field371;
					} else {
						class139.field1344[++class203.field1903 - 1] = -1;
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1331[++class429.field3529 - 1] = "";
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1331[++class429.field3529 - 1] = "";
					}

					return 1;
				} else if (var0 == 6507) {
					class203.field1903 -= 4;
					var4 = class139.field1344[class203.field1903];
					boolean var10 = class139.field1344[class203.field1903 + 1] == 1;
					var11 = class139.field1344[class203.field1903 + 2];
					boolean var7 = class139.field1344[class203.field1903 + 3] == 1;
					class109.method686(var4, var10, var11, var7);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == 6512) {
						Client.field161 = class139.field1344[--class203.field1903] == 1;
						return 1;
					} else {
						class425 var6;
						int var8;
						if (var0 == 6513) {
							class203.field1903 -= 2;
							var4 = class139.field1344[class203.field1903];
							var8 = class139.field1344[1 + class203.field1903];
							var6 = class30.method216(var8);
							if (var6.method2175()) {
								class139.field1331[++class429.field3529 - 1] = class150.method861(var4).method2008(var8, var6.field3520);
							} else {
								class139.field1344[++class203.field1903 - 1] = class150.method861(var4).method2010(var8, var6.field3516);
							}

							return 1;
						} else if (var0 == 6514) {
							class203.field1903 -= 2;
							var4 = class139.field1344[class203.field1903];
							var8 = class139.field1344[class203.field1903 + 1];
							var6 = class30.method216(var8);
							if (var6.method2175()) {
								class139.field1331[++class429.field3529 - 1] = class96.method638(var4, (byte)-25).method1352(var8, var6.field3520);
							} else {
								class139.field1344[++class203.field1903 - 1] = class96.method638(var4, (byte)32).method1351(var8, var6.field3516);
							}

							return 1;
						} else if (var0 == 6515) {
							class203.field1903 -= 2;
							var4 = class139.field1344[class203.field1903];
							var8 = class139.field1344[1 + class203.field1903];
							var6 = class30.method216(var8);
							if (var6.method2175()) {
								class139.field1331[++class429.field3529 - 1] = class67.method492(var4).method1182(var8, var6.field3520);
							} else {
								class139.field1344[++class203.field1903 - 1] = class67.method492(var4).method1191(var8, var6.field3516);
							}

							return 1;
						} else if (var0 == 6516) {
							class203.field1903 -= 2;
							var4 = class139.field1344[class203.field1903];
							var8 = class139.field1344[1 + class203.field1903];
							var6 = class30.method216(var8);
							if (var6.method2175()) {
								class139.field1331[++class429.field3529 - 1] = class481.method2396(var4).method479(var8, var6.field3520);
							} else {
								class139.field1344[++class203.field1903 - 1] = class481.method2396(var4).method478(var8, var6.field3516);
							}

							return 1;
						} else if (var0 == 6518) {
							class139.field1344[++class203.field1903 - 1] = Client.field238 ? 1 : 0;
							return 1;
						} else if (var0 == 6519) {
							class139.field1344[++class203.field1903 - 1] = Client.field9;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == 6521) {
							return 1;
						} else if (var0 == 6522) {
							--class429.field3529;
							--class203.field1903;
							return 1;
						} else if (var0 == 6523) {
							--class429.field3529;
							--class203.field1903;
							return 1;
						} else if (var0 == 6524) {
							class139.field1344[++class203.field1903 - 1] = -1;
							return 1;
						} else if (var0 == 6525) {
							class139.field1344[++class203.field1903 - 1] = 1;
							return 1;
						} else if (var0 == 6526) {
							class139.field1344[++class203.field1903 - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							class139.field1344[++class203.field1903 - 1] = Client.field21;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = class139.field1344[--class203.field1903];
					if (var4 >= 0 && var4 < class12.field369) {
						var5 = class225.field2044[var4];
						class139.field1344[++class203.field1903 - 1] = var5.field368;
						class139.field1344[++class203.field1903 - 1] = var5.field364;
						class139.field1331[++class429.field3529 - 1] = var5.field372;
						class139.field1344[++class203.field1903 - 1] = var5.field373;
						class139.field1344[++class203.field1903 - 1] = var5.field370;
						class139.field1331[++class429.field3529 - 1] = var5.field371;
					} else {
						class139.field1344[++class203.field1903 - 1] = -1;
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1331[++class429.field3529 - 1] = "";
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1344[++class203.field1903 - 1] = 0;
						class139.field1331[++class429.field3529 - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
