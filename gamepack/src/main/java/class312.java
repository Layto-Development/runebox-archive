import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class class312 {
	static byte[][] field2814;
	static byte[][] field2815;
	static byte[][] field2816;
	static byte[][] field2817;
	static int field2806;
	static int field2807;
	static int field2808;
	static int field2809;
	static int field2810;
	static int field2811;
	static int field2813;
	static int field2818;
	static ArrayList field2812;

	static {
		field2818 = 0;
		field2808 = 0;
		field2809 = 0;
		field2810 = 0;
		field2806 = 1000;
		field2811 = 250;
		field2807 = 100;
		field2813 = 50;
		field2814 = new byte[1000][];
		field2815 = new byte[250][];
		field2816 = new byte[100][];
		field2817 = new byte[50][];
		field2812 = new ArrayList();
		class278.method1594();
		new HashMap();
	}

	class312() throws Throwable {
	}

	public static synchronized byte[] method1748(int var0, boolean var1) {
		byte[] var5;
		if ((var0 == 100 || var0 < 100 && var1) && field2818 > 0) {
			var5 = field2814[--field2818];
			field2814[field2818] = null;
			return var5;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && field2808 > 0) {
			var5 = field2815[--field2808];
			field2815[field2808] = null;
			return var5;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && field2809 > 0) {
			var5 = field2816[--field2809];
			field2816[field2809] = null;
			return var5;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field2810 > 0) {
			var5 = field2817[--field2810];
			field2817[field2810] = null;
			return var5;
		} else {
			int var3;
			if (null != class258.field2367) {
				for (var3 = 0; var3 < class483.field4097.length; ++var3) {
					if ((var0 == class483.field4097[var3] || var0 < class483.field4097[var3] && var1) && class63.field804[var3] > 0) {
						byte[] var4 = class258.field2367[var3][--class63.field804[var3]];
						class258.field2367[var3][class63.field804[var3]] = null;
						return var4;
					}
				}
			}

			if (var1 && null != class483.field4097) {
				for (var3 = 0; var3 < class483.field4097.length; ++var3) {
					if (var0 <= class483.field4097[var3] && class63.field804[var3] < class258.field2367[var3].length) {
						return new byte[class483.field4097[var3]];
					}
				}
			}

			return new byte[var0];
		}
	}

	static void method1747() {
		Iterator var1 = class92.field903.iterator();

		while (true) {
			class104 var2;
			do {
				if (!var1.hasNext()) {
					class92.field903.clear();
					return;
				}

				var2 = (class104)var1.next();
			} while(null == var2);

			var2.field1032.method168();
			var2.field1032.method166();
			var2.field1032.method130(0);
			var2.field1032.field431 = 0;
			int var3 = var2.field1026;
			int var4 = var2.field1027;
			Iterator var5 = class92.field906.iterator();

			while (var5.hasNext()) {
				class382 var6 = (class382)var5.next();
				var6.method2038(var3, var4);
			}
		}
	}

	static int method1749(int var0, class167 var1, boolean var2) {
		class60 var4 = class366.method1967(class139.field1344[--class203.field1903]);
		if (var0 == 2600) {
			class139.field1344[++class203.field1903 - 1] = var4.field663;
			return 1;
		} else if (var0 == 2601) {
			class139.field1344[++class203.field1903 - 1] = var4.field677;
			return 1;
		} else if (var0 == 2602) {
			class139.field1331[++class429.field3529 - 1] = var4.field704;
			return 1;
		} else if (var0 == 2603) {
			class139.field1344[++class203.field1903 - 1] = var4.field731;
			return 1;
		} else if (var0 == 2604) {
			class139.field1344[++class203.field1903 - 1] = var4.field666;
			return 1;
		} else if (var0 == 2605) {
			class139.field1344[++class203.field1903 - 1] = var4.field697;
			return 1;
		} else if (var0 == 2606) {
			class139.field1344[++class203.field1903 - 1] = var4.field694;
			return 1;
		} else if (var0 == 2607) {
			class139.field1344[++class203.field1903 - 1] = var4.field759;
			return 1;
		} else if (var0 == 2608) {
			class139.field1344[++class203.field1903 - 1] = var4.field712;
			return 1;
		} else if (var0 == 2609) {
			class139.field1344[++class203.field1903 - 1] = var4.field665;
			return 1;
		} else if (var0 == 2610) {
			class139.field1344[++class203.field1903 - 1] = var4.field674;
			return 1;
		} else if (var0 == 2611) {
			class139.field1344[++class203.field1903 - 1] = var4.field667;
			return 1;
		} else if (var0 == 2612) {
			class139.field1344[++class203.field1903 - 1] = var4.field668;
			return 1;
		} else if (var0 == 2613) {
			class139.field1344[++class203.field1903 - 1] = var4.field672.method1970();
			return 1;
		} else if (var0 == 2614) {
			class139.field1344[++class203.field1903 - 1] = var4.field702 ? 1 : 0;
			return 1;
		} else {
			class62 var5;
			if (var0 == 2617) {
				var5 = var4.method458();
				class139.field1344[++class203.field1903 - 1] = var5 != null ? var5.field801 : 0;
			}

			if (var0 == 2618) {
				var5 = var4.method458();
				class139.field1344[++class203.field1903 - 1] = null != var5 ? var5.field802 : 0;
				return 1;
			} else {
				class477 var8;
				if (var0 == 2619) {
					var8 = var4.method472();
					class139.field1331[++class429.field3529 - 1] = var8 != null ? var8.method2342().method1401() : "";
					return 1;
				} else if (var0 == 2620) {
					var5 = var4.method458();
					class139.field1344[++class203.field1903 - 1] = var5 != null ? var5.field803 : 0;
					return 1;
				} else if (var0 == 2621) {
					var8 = var4.method472();
					class139.field1344[++class203.field1903 - 1] = var8 != null ? var8.method2380() : 0;
					return 1;
				} else if (var0 == 2622) {
					var8 = var4.method472();
					class139.field1344[++class203.field1903 - 1] = null != var8 ? var8.method2376() : 0;
					return 1;
				} else if (var0 == 2623) {
					var8 = var4.method472();
					class139.field1344[++class203.field1903 - 1] = null != var8 ? var8.method2382() : 0;
					return 1;
				} else if (var0 == 2624) {
					var8 = var4.method472();
					class139.field1344[++class203.field1903 - 1] = null != var8 && var8.method2344() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var8 = var4.method472();
						class139.field1331[++class429.field3529 - 1] = null != var8 ? var8.method2317().method2432() : "";
						return 1;
					} else if (var0 == 2627) {
						var8 = var4.method472();
						int var6 = null != var8 ? var8.method2347() : 0;
						int var7 = null != var8 ? var8.method2346() : 0;
						class139.field1344[++class203.field1903 - 1] = Math.min(var6, var7);
						class139.field1344[++class203.field1903 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == 2628) {
						var8 = var4.method472();
						class139.field1344[++class203.field1903 - 1] = var8 != null ? var8.method2346() : 0;
						return 1;
					} else if (var0 == 2629) {
						var8 = var4.method472();
						class139.field1344[++class203.field1903 - 1] = var8 != null ? var8.method2319() : 0;
						return 1;
					} else if (var0 == 2630) {
						var8 = var4.method472();
						class139.field1344[++class203.field1903 - 1] = null != var8 ? var8.method2351() : 0;
						return 1;
					} else if (var0 == 2631) {
						var8 = var4.method472();
						class139.field1344[++class203.field1903 - 1] = var8 != null ? var8.method2370() : 0;
						return 1;
					} else if (var0 == 2632) {
						var8 = var4.method472();
						class139.field1344[++class203.field1903 - 1] = var8 != null ? var8.method2313() : 0;
						return 1;
					} else {
						class240 var9;
						if (var0 == 2633) {
							var9 = var4.method448();
							class139.field1344[class203.field1903 - 1] = null != var9 ? var9.method1369(class139.field1344[class203.field1903 - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var9 = var4.method448();
							class139.field1344[class203.field1903 - 1] = null != var9 ? var9.method1373((char)class139.field1344[class203.field1903 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method472();
					class139.field1344[++class203.field1903 - 1] = var8 != null && var8.method2345() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
