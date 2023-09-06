import java.awt.Font;

public final class class154 extends class462 {
	static class342 field1451;
	static class86 field1438;
	static int field1435;
	static Font field1450;
	class235 field1448;
	class515 field1443;
	class515 field1447;
	int field1436;
	int field1437;
	int field1439;
	int field1440;
	int field1441;
	int field1442;
	int field1444;
	int field1446;
	int field1449;
	int field1452;
	int[] field1445;

	static {
		field1438 = new class86();
	}

	class154() {
	}

	void method883() {
		int var2 = this.field1442;
		class235 var3 = this.field1448.method1350();
		if (var3 != null) {
			this.field1442 = var3.field2150;
			this.field1441 = var3.field2151 * 128;
			this.field1446 = var3.field2152;
			this.field1444 = var3.field2153;
			this.field1445 = var3.field2144;
		} else {
			this.field1442 = -1;
			this.field1441 = 0;
			this.field1446 = 0;
			this.field1444 = 0;
			this.field1445 = null;
		}

		if (var2 != this.field1442 && this.field1447 != null) {
			class539.field4277.method2040(this.field1447);
			this.field1447 = null;
		}

	}

	static void method884() {
		class38.field504 = (short[][][])null;
		class54.field604 = (short[][][])null;
		class439.field3868 = (byte[][][])null;
		class417.field3491 = (byte[][][])null;
		class244.field2223 = (int[][][])null;
		class394.field3316 = (byte[][][])null;
		class539.field4278 = (int[][])null;
		class155.field1455 = null;
		class255.field2361 = null;
		class38.field505 = null;
		class224.field2041 = null;
		class139.field1340 = null;
	}

	static int method885(int var0, class167 var1, boolean var2) {
		if (var0 == 3800) {
			if (class481.field4095 != null) {
				class139.field1344[++class203.field1903 - 1] = 1;
				class255.field2360 = class481.field4095;
			} else {
				class139.field1344[++class203.field1903 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3801) {
				var4 = class139.field1344[--class203.field1903];
				if (null != Client.field247[var4]) {
					class139.field1344[++class203.field1903 - 1] = 1;
					class255.field2360 = Client.field247[var4];
				} else {
					class139.field1344[++class203.field1903 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3802) {
				class139.field1331[++class429.field3529 - 1] = class255.field2360.field3208;
				return 1;
			} else if (var0 == 3803) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3207 ? 1 : 0;
				return 1;
			} else if (var0 == 3804) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3221;
				return 1;
			} else if (var0 == 3805) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3209;
				return 1;
			} else if (var0 == 3806) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3210;
				return 1;
			} else if (var0 == 3807) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3211;
				return 1;
			} else if (var0 == 3809) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3212;
				return 1;
			} else if (var0 == 3810) {
				var4 = class139.field1344[--class203.field1903];
				class139.field1331[++class429.field3529 - 1] = class255.field2360.field3223[var4];
				return 1;
			} else if (var0 == 3811) {
				var4 = class139.field1344[--class203.field1903];
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3214[var4];
				return 1;
			} else if (var0 == 3812) {
				class139.field1344[++class203.field1903 - 1] = class255.field2360.field3205;
				return 1;
			} else if (var0 == 3813) {
				var4 = class139.field1344[--class203.field1903];
				class139.field1331[++class429.field3529 - 1] = class255.field2360.field3224[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == 3814) {
					class203.field1903 -= 3;
					var4 = class139.field1344[class203.field1903];
					var7 = class139.field1344[1 + class203.field1903];
					var6 = class139.field1344[class203.field1903 + 2];
					class139.field1344[++class203.field1903 - 1] = class255.field2360.method2027(var4, var7, var6);
					return 1;
				} else if (var0 == 3815) {
					class139.field1344[++class203.field1903 - 1] = class255.field2360.field3219;
					return 1;
				} else if (var0 == 3816) {
					class139.field1344[++class203.field1903 - 1] = class255.field2360.field3204;
					return 1;
				} else if (var0 == 3817) {
					class139.field1344[++class203.field1903 - 1] = class255.field2360.method2025(class139.field1331[--class429.field3529]);
					return 1;
				} else if (var0 == 3818) {
					class139.field1344[class203.field1903 - 1] = class255.field2360.method2021()[class139.field1344[class203.field1903 - 1]];
					return 1;
				} else if (var0 == 3819) {
					class203.field1903 -= 2;
					var4 = class139.field1344[class203.field1903];
					var7 = class139.field1344[class203.field1903 + 1];
					class170.method940(var7, var4);
					return 1;
				} else if (var0 == 3820) {
					var4 = class139.field1344[--class203.field1903];
					class139.field1344[++class203.field1903 - 1] = class255.field2360.field3217[var4];
					return 1;
				} else {
					if (var0 == 3821) {
						class203.field1903 -= 3;
						var4 = class139.field1344[class203.field1903];
						boolean var5 = class139.field1344[1 + class203.field1903] == 1;
						var6 = class139.field1344[class203.field1903 + 2];
						class474.method2293(var6, var4, var5);
					}

					if (var0 == 3822) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = class255.field2360.field3218[var4] ? 1 : 0;
						return 1;
					} else if (var0 == 3850) {
						if (null != class334.field2930) {
							class139.field1344[++class203.field1903 - 1] = 1;
							class472.field4026 = class334.field2930;
						} else {
							class139.field1344[++class203.field1903 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3851) {
						var4 = class139.field1344[--class203.field1903];
						if (null != Client.field248[var4]) {
							class139.field1344[++class203.field1903 - 1] = 1;
							class472.field4026 = Client.field248[var4];
							class237.field2183 = var4;
						} else {
							class139.field1344[++class203.field1903 - 1] = 0;
						}

						return 1;
					} else if (var0 == 3852) {
						class139.field1331[++class429.field3529 - 1] = class472.field4026.field3501;
						return 1;
					} else if (var0 == 3853) {
						class139.field1344[++class203.field1903 - 1] = class472.field4026.field3500;
						return 1;
					} else if (var0 == 3854) {
						class139.field1344[++class203.field1903 - 1] = class472.field4026.field3496;
						return 1;
					} else if (var0 == 3855) {
						class139.field1344[++class203.field1903 - 1] = class472.field4026.method2157();
						return 1;
					} else if (var0 == 3856) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1331[++class429.field3529 - 1] = ((class395)class472.field4026.field3498.get(var4)).field3320.method2214();
						return 1;
					} else if (var0 == 3857) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = ((class395)class472.field4026.field3498.get(var4)).field3321;
						return 1;
					} else if (var0 == 3858) {
						var4 = class139.field1344[--class203.field1903];
						class139.field1344[++class203.field1903 - 1] = ((class395)class472.field4026.field3498.get(var4)).field3322;
						return 1;
					} else if (var0 == 3859) {
						var4 = class139.field1344[--class203.field1903];
						class175.method995(class237.field2183, var4);
						return 1;
					} else if (var0 == 3860) {
						class139.field1344[++class203.field1903 - 1] = class472.field4026.method2158(class139.field1331[--class429.field3529]);
						return 1;
					} else if (var0 == 3861) {
						class139.field1344[class203.field1903 - 1] = class472.field4026.method2159()[class139.field1344[class203.field1903 - 1]];
						return 1;
					} else if (var0 == 3890) {
						class139.field1344[++class203.field1903 - 1] = null != class196.field1795 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static void method886() {
		Client.field68.method1570(class85.method556(class129.field1251, Client.field68.field2426));
		Client.field96 = 0;
	}
}
