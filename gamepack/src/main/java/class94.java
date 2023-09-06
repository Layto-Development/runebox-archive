public class class94 implements class367 {
	public static class88 field937;
	static class342 field932;
	static final class94 field933;
	static final class94 field934;
	static final class94 field935;
	static final class94 field936;
	static final class94 field938;
	final int field939;

	static {
		field938 = new class94(0);
		field933 = new class94(1);
		field936 = new class94(2);
		field934 = new class94(3);
		field935 = new class94(4);
	}

	class94(int var1) {
		this.field939 = var1;
	}

	public int method1970() {
		return this.field939;
	}

	static int method621(int var0, class167 var1, boolean var2) {
		int var4;
		if (var0 == 4200) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1331[++class429.field3529 - 1] = class67.method492(var4).field1954;
			return 1;
		} else {
			class210 var6;
			int var7;
			if (var0 == 4201) {
				class203.field1903 -= 2;
				var4 = class139.field1344[class203.field1903];
				var7 = class139.field1344[1 + class203.field1903];
				var6 = class67.method492(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field1955[var7 - 1] != null) {
					class139.field1331[++class429.field3529 - 1] = var6.field1955[var7 - 1];
				} else {
					class139.field1331[++class429.field3529 - 1] = "";
				}

				return 1;
			} else if (var0 == 4202) {
				class203.field1903 -= 2;
				var4 = class139.field1344[class203.field1903];
				var7 = class139.field1344[1 + class203.field1903];
				var6 = class67.method492(var4);
				if (var7 >= 1 && var7 <= 5 && var6.field1956[var7 - 1] != null) {
					class139.field1331[++class429.field3529 - 1] = var6.field1956[var7 - 1];
				} else {
					class139.field1331[++class429.field3529 - 1] = "";
				}

				return 1;
			} else if (var0 == 4203) {
				var4 = class139.field1344[--class203.field1903];
				class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1950;
				return 1;
			} else if (var0 == 4204) {
				var4 = class139.field1344[--class203.field1903];
				class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1949 == 1 ? 1 : 0;
				return 1;
			} else {
				class210 var5;
				if (var0 == 4205) {
					var4 = class139.field1344[--class203.field1903];
					var5 = class67.method492(var4);
					if (var5.field1945 == -1 && var5.field1972 >= 0) {
						class139.field1344[++class203.field1903 - 1] = var5.field1972;
					} else {
						class139.field1344[++class203.field1903 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4206) {
					var4 = class139.field1344[--class203.field1903];
					var5 = class67.method492(var4);
					if (var5.field1945 >= 0 && var5.field1972 >= 0) {
						class139.field1344[++class203.field1903 - 1] = var5.field1972;
					} else {
						class139.field1344[++class203.field1903 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4207) {
					var4 = class139.field1344[--class203.field1903];
					class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1942 ? 1 : 0;
					return 1;
				} else if (var0 == 4208) {
					var4 = class139.field1344[--class203.field1903];
					var5 = class67.method492(var4);
					if (var5.field1985 == -1 && var5.field1944 >= 0) {
						class139.field1344[++class203.field1903 - 1] = var5.field1944;
					} else {
						class139.field1344[++class203.field1903 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4209) {
					var4 = class139.field1344[--class203.field1903];
					var5 = class67.method492(var4);
					if (var5.field1985 >= 0 && var5.field1944 >= 0) {
						class139.field1344[++class203.field1903 - 1] = var5.field1944;
					} else {
						class139.field1344[++class203.field1903 - 1] = var4;
					}

					return 1;
				} else if (var0 == 4210) {
					String var8 = class139.field1331[--class429.field3529];
					var7 = class139.field1344[--class203.field1903];
					class241.method1381(var8, var7 == 1);
					class139.field1344[++class203.field1903 - 1] = class15.field384;
					return 1;
				} else if (var0 != 4211) {
					if (var0 == 4212) {
						class66.field808 = 0;
						return 1;
					} else if (var0 == 4213) {
						var4 = class139.field1344[--class203.field1903];
						var7 = class67.method492(var4).method1193();
						if (var7 == -1) {
							class139.field1344[++class203.field1903 - 1] = var7;
						} else {
							class139.field1344[++class203.field1903 - 1] = var7 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1951;
						return 1;
					} else if (var0 == 4215) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1936;
						return 1;
					} else if (var0 == 4216) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1952;
						return 1;
					} else if (var0 == 4217) {
						var4 = class139.field1344[--class203.field1903];
						var5 = class67.method492(var4);
						class139.field1344[++class203.field1903 - 1] = var5.field1940;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class89.field887 != null && class66.field808 < class15.field384) {
						class139.field1344[++class203.field1903 - 1] = class89.field887[++class66.field808 - 1] & '\uffff';
					} else {
						class139.field1344[++class203.field1903 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
