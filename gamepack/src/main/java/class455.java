public class class455 {
	static final class455 field3966;
	static final class455 field3967;
	static final class455 field3968;
	static final class455 field3969;
	public final int field3970;
	public final String field3965;

	static {
		field3968 = new class455("LIVE", 0);
		field3966 = new class455("BUILDLIVE", 3);
		field3967 = new class455("RC", 1);
		field3969 = new class455("WIP", 2);
	}

	class455(String var1, int var2) {
		this.field3965 = var1;
		this.field3970 = var2;
	}

	static int method2264(int var0, class167 var1, boolean var2) {
		int var4;
		if (var0 == 3903) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field281[var4].method2535();
			return 1;
		} else if (var0 == 3904) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field281[var4].field4229;
			return 1;
		} else if (var0 == 3905) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field281[var4].field4233;
			return 1;
		} else if (var0 == 3906) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field281[var4].field4231;
			return 1;
		} else if (var0 == 3907) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field281[var4].field4232;
			return 1;
		} else if (var0 == 3908) {
			var4 = class139.field1344[--class203.field1903];
			class139.field1344[++class203.field1903 - 1] = Client.field281[var4].field4228;
			return 1;
		} else {
			int var14;
			if (var0 == 3910) {
				var4 = class139.field1344[--class203.field1903];
				var14 = Client.field281[var4].method2534();
				class139.field1344[++class203.field1903 - 1] = var14 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == 3911) {
				var4 = class139.field1344[--class203.field1903];
				var14 = Client.field281[var4].method2534();
				class139.field1344[++class203.field1903 - 1] = var14 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == 3912) {
				var4 = class139.field1344[--class203.field1903];
				var14 = Client.field281[var4].method2534();
				class139.field1344[++class203.field1903 - 1] = var14 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == 3913) {
				var4 = class139.field1344[--class203.field1903];
				var14 = Client.field281[var4].method2534();
				class139.field1344[++class203.field1903 - 1] = var14 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == 3914) {
					var12 = class139.field1344[--class203.field1903] == 1;
					if (class2.field312 != null) {
						class2.field312.method1287(class227.field2059, var12);
					}

					return 1;
				} else if (var0 == 3915) {
					var12 = class139.field1344[--class203.field1903] == 1;
					if (null != class2.field312) {
						class2.field312.method1287(class227.field2061, var12);
					}

					return 1;
				} else if (var0 == 3916) {
					class203.field1903 -= 2;
					var12 = class139.field1344[class203.field1903] == 1;
					boolean var13 = class139.field1344[1 + class203.field1903] == 1;
					if (null != class2.field312) {
						Client.field293.field499 = var13;
						class2.field312.method1287(Client.field293, var12);
					}

					return 1;
				} else if (var0 == 3917) {
					var12 = class139.field1344[--class203.field1903] == 1;
					if (null != class2.field312) {
						class2.field312.method1287(class227.field2057, var12);
					}

					return 1;
				} else if (var0 == 3918) {
					var12 = class139.field1344[--class203.field1903] == 1;
					if (null != class2.field312) {
						class2.field312.method1287(class227.field2060, var12);
					}

					return 1;
				} else if (var0 == 3919) {
					class139.field1344[++class203.field1903 - 1] = class2.field312 == null ? 0 : class2.field312.field2058.size();
					return 1;
				} else {
					class478 var5;
					if (var0 == 3920) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						class139.field1344[++class203.field1903 - 1] = var5.field4068;
						return 1;
					} else if (var0 == 3921) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						class139.field1331[++class429.field3529 - 1] = var5.method2387();
						return 1;
					} else if (var0 == 3922) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						class139.field1331[++class429.field3529 - 1] = var5.method2386();
						return 1;
					} else if (var0 == 3923) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						long var6 = class172.method977() - class93.field931 - var5.field4066;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						class139.field1331[++class429.field3529 - 1] = var11;
						return 1;
					} else if (var0 == 3924) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						class139.field1344[++class203.field1903 - 1] = var5.field4064.field4231;
						return 1;
					} else if (var0 == 3925) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						class139.field1344[++class203.field1903 - 1] = var5.field4064.field4233;
						return 1;
					} else if (var0 == 3926) {
						var4 = class139.field1344[--class203.field1903];
						var5 = (class478)class2.field312.field2058.get(var4);
						class139.field1344[++class203.field1903 - 1] = var5.field4064.field4229;
						return 1;
					} else if (var0 == 3939) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class67.method492(var4).field1982 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
