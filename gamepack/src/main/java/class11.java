public class class11 implements class367 {
	public static final class11 field359;
	public static final class11 field360;
	public static final class11 field361;
	public static final class11 field363;
	final int field362;

	static {
		field363 = new class11(-1);
		field361 = new class11(0);
		field360 = new class11(1);
		field359 = new class11(2);
	}

	class11(int var1) {
		this.field362 = var1;
	}

	public int method1970() {
		return this.field362;
	}

	static int method106(int var0, class167 var1, boolean var2) {
		int var5;
		int var10;
		if (var0 == 4000) {
			class203.field1903 -= 2;
			var10 = class139.field1344[class203.field1903];
			var5 = class139.field1344[class203.field1903 + 1];
			class139.field1344[++class203.field1903 - 1] = var10 + var5;
			return 1;
		} else if (var0 == 4001) {
			class203.field1903 -= 2;
			var10 = class139.field1344[class203.field1903];
			var5 = class139.field1344[1 + class203.field1903];
			class139.field1344[++class203.field1903 - 1] = var10 - var5;
			return 1;
		} else if (var0 == 4002) {
			class203.field1903 -= 2;
			var10 = class139.field1344[class203.field1903];
			var5 = class139.field1344[1 + class203.field1903];
			class139.field1344[++class203.field1903 - 1] = var10 * var5;
			return 1;
		} else if (var0 == 4003) {
			class203.field1903 -= 2;
			var10 = class139.field1344[class203.field1903];
			var5 = class139.field1344[1 + class203.field1903];
			class139.field1344[++class203.field1903 - 1] = var10 / var5;
			return 1;
		} else if (var0 == 4004) {
			var10 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = (int)(Math.random() * (double)var10);
			return 1;
		} else if (var0 == 4005) {
			var10 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = (int)(Math.random() * (double)(var10 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == 4006) {
				class203.field1903 -= 5;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				var6 = class139.field1344[2 + class203.field1903];
				var7 = class139.field1344[class203.field1903 + 3];
				var8 = class139.field1344[class203.field1903 + 4];
				class139.field1344[++class203.field1903 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
				return 1;
			} else if (var0 == 4007) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var5 * var10 / 100 + var10;
				return 1;
			} else if (var0 == 4008) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var10 | 1 << var5;
				return 1;
			} else if (var0 == 4009) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var10 & -1 - (1 << var5);
				return 1;
			} else if (var0 == 4010) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[1 + class203.field1903];
				class139.field1344[++class203.field1903 - 1] = (var10 & 1 << var5) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var10 % var5;
				return 1;
			} else if (var0 == 4012) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[1 + class203.field1903];
				if (var10 == 0) {
					class139.field1344[++class203.field1903 - 1] = 0;
				} else {
					class139.field1344[++class203.field1903 - 1] = (int)Math.pow((double)var10, (double)var5);
				}

				return 1;
			} else if (var0 == 4013) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				if (var10 == 0) {
					class139.field1344[++class203.field1903 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						class139.field1344[++class203.field1903 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						class139.field1344[++class203.field1903 - 1] = var10;
						break;
					case 2:
						class139.field1344[++class203.field1903 - 1] = (int)Math.sqrt((double)var10);
						break;
					case 3:
						class139.field1344[++class203.field1903 - 1] = (int)Math.cbrt((double)var10);
						break;
					case 4:
						class139.field1344[++class203.field1903 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
						break;
					default:
						class139.field1344[++class203.field1903 - 1] = (int)Math.pow((double)var10, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var10 & var5;
				return 1;
			} else if (var0 == 4015) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var10 | var5;
				return 1;
			} else if (var0 == 4016) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[1 + class203.field1903];
				class139.field1344[++class203.field1903 - 1] = var10 < var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4017) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				class139.field1344[++class203.field1903 - 1] = var10 > var5 ? var10 : var5;
				return 1;
			} else if (var0 == 4018) {
				class203.field1903 -= 3;
				long var11 = (long)class139.field1344[class203.field1903];
				long var12 = (long)class139.field1344[1 + class203.field1903];
				long var13 = (long)class139.field1344[class203.field1903 + 2];
				class139.field1344[++class203.field1903 - 1] = (int)(var11 * var13 / var12);
				return 1;
			} else if (var0 == 4025) {
				var10 = class160.method895(class139.field1344[--class203.field1903]);
				class139.field1344[++class203.field1903 - 1] = var10;
				return 1;
			} else if (var0 == 4026) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[1 + class203.field1903];
				class139.field1344[++class203.field1903 - 1] = var10 ^ 1 << var5;
				return 1;
			} else if (var0 == 4027) {
				class203.field1903 -= 3;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[1 + class203.field1903];
				var6 = class139.field1344[2 + class203.field1903];
				class139.field1344[++class203.field1903 - 1] = class60.method473(var10, var5, var6);
				return 1;
			} else if (var0 == 4028) {
				class203.field1903 -= 3;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				var6 = class139.field1344[2 + class203.field1903];
				class139.field1344[++class203.field1903 - 1] = class67.method493(var10, var5, var6);
				return 1;
			} else if (var0 == 4029) {
				class203.field1903 -= 3;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				var6 = class139.field1344[class203.field1903 + 2];
				var7 = 31 - var6;
				class139.field1344[++class203.field1903 - 1] = var10 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == 4030) {
				class203.field1903 -= 4;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				var6 = class139.field1344[2 + class203.field1903];
				var7 = class139.field1344[3 + class203.field1903];
				var10 = class67.method493(var10, var6, var7);
				var8 = class443.method2222(1 + (var7 - var6));
				if (var5 > var8) {
					var5 = var8;
				}

				class139.field1344[++class203.field1903 - 1] = var10 | var5 << var6;
				return 1;
			} else if (var0 == 4032) {
				class139.field1344[class203.field1903 - 1] = class22.method188(class139.field1344[class203.field1903 - 1]);
				return 1;
			} else if (var0 == 4033) {
				class139.field1344[class203.field1903 - 1] = class232.method1337(class139.field1344[class203.field1903 - 1]);
				return 1;
			} else if (var0 == 4034) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var5 = class139.field1344[class203.field1903 + 1];
				var6 = class471.method2289(var10, var5);
				class139.field1344[++class203.field1903 - 1] = var6;
				return 1;
			} else if (var0 == 4035) {
				class139.field1344[class203.field1903 - 1] = Math.abs(class139.field1344[class203.field1903 - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var4 = class139.field1331[--class429.field3529];
				var5 = -1;
				if (class185.method1023(var4)) {
					var5 = class177.method1005(var4);
				}

				class139.field1344[++class203.field1903 - 1] = var5;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
