import java.io.IOException;
import java.util.ArrayList;

public class class269 {
	static int field2422;
	boolean field2430;
	class291 field2423;
	class291 field2428;
	class291 field2434;
	class291 field2435;
	class347 field2427;
	class42 field2425;
	class431 field2436;
	class55 field2431;
	int field2424;
	int field2429;
	int field2432;
	int field2433;
	public class126 field2426;

	class269() {
		this.field2431 = new class55();
		this.field2424 = 0;
		this.field2425 = new class42(5000);
		this.field2427 = new class347(40000);
		this.field2423 = null;
		this.field2429 = 0;
		this.field2430 = true;
		this.field2433 = 0;
		this.field2432 = 0;
	}

	final void method1576() {
		this.field2431.method402();
		this.field2424 = 0;
	}

	final void method1569() throws IOException {
		if (this.field2436 != null && this.field2424 > 0) {
			this.field2425.field527 = 0;

			while (true) {
				class160 var2 = (class160)this.field2431.method409();
				if (null == var2 || var2.field1480 > this.field2425.field525.length - this.field2425.field527) {
					this.field2436.method2192(this.field2425.field525, 0, this.field2425.field527);
					this.field2432 = 0;
					break;
				}

				this.field2425.method272(var2.field1483.field525, 0, var2.field1480);
				this.field2424 -= var2.field1480;
				var2.method2269();
				var2.field1483.method266();
				var2.method894();
			}
		}

	}

	public final void method1570(class160 var1) {
		this.field2431.method403(var1);
		var1.field1480 = var1.field1483.field527;
		var1.field1483.field527 = 0;
		this.field2424 += var1.field1480;
	}

	void method1571(class431 var1) {
		this.field2436 = var1;
	}

	void method1574() {
		if (this.field2436 != null) {
			this.field2436.method2194();
			this.field2436 = null;
		}

	}

	void method1572() {
		this.field2436 = null;
	}

	class431 method1573() {
		return this.field2436;
	}

	public static void method1579(int var0, int var1, int var2, int var3) {
		if (class92.field903.size() > 1 && class92.field903.get(0) != null && ((class104)class92.field903.get(0)).field1032.method163() && class92.field903.get(1) != null && ((class104)class92.field903.get(1)).field1032.method163()) {
			class295.method1677(var0, var1, var2, var3);
			class92.field905.add(new class430((class232)null));
			ArrayList var5 = new ArrayList();
			var5.add(new class495(new class200((class232)null, 1, false, class92.field900), class92.field909));
			var5.add(new class495(new class16((class232)null, 0, false, class92.field908), class92.field907));
			class92.field905.add(new class181((class232)null, var5));
			if (class92.field904.get(0) != null && class92.field904.get(1) != null) {
				class104 var6 = (class104)class92.field904.get(0);
				class92.field904.set(0, class92.field903.get(1));
				class92.field904.set(1, var6);
			}
		}

	}

	static int method1577(int var0, class167 var1, boolean var2) {
		if (var0 < 1000) {
			return class22.method186(var0, var1, var2);
		} else if (var0 < 1100) {
			return class24.method198(var0, var1, var2);
		} else if (var0 < 1200) {
			return class156.method888(var0, var1, var2);
		} else if (var0 < 1300) {
			return class534.method2571(var0, var1, var2);
		} else if (var0 < 1400) {
			return class391.method2049(var0, var1, var2);
		} else if (var0 < 1500) {
			return class206.method1154(var0, var1, var2);
		} else if (var0 < 1600) {
			return class93.method619(var0, var1, var2);
		} else if (var0 < 1700) {
			return class70.method507(var0, var1, var2);
		} else if (var0 < 1800) {
			return class165.method915(var0, var1, var2);
		} else if (var0 < 1900) {
			return class24.method201(var0, var1, var2);
		} else if (var0 < 2000) {
			return class286.method1629(var0, var1, var2);
		} else if (var0 < 2100) {
			return class24.method198(var0, var1, var2);
		} else if (var0 < 2200) {
			return class156.method888(var0, var1, var2);
		} else if (var0 < 2300) {
			return class534.method2571(var0, var1, var2);
		} else if (var0 < 2400) {
			return class391.method2049(var0, var1, var2);
		} else if (var0 < 2500) {
			return class206.method1154(var0, var1, var2);
		} else if (var0 < 2600) {
			return class132.method779(var0, var1, var2);
		} else if (var0 < 2700) {
			return class312.method1749(var0, var1, var2);
		} else if (var0 < 2800) {
			return class44.method347(var0, var1, var2);
		} else if (var0 < 2900) {
			return class287.method1646(var0, var1, var2);
		} else if (var0 < 3000) {
			return class286.method1629(var0, var1, var2);
		} else if (var0 < 3200) {
			return class255.method1500(var0, var1, var2);
		} else if (var0 < 3300) {
			return class186.method1033(var0, var1, var2);
		} else if (var0 < 3400) {
			return class66.method487(var0, var1, var2, (byte)-1);
		} else if (var0 < 3500) {
			return class303.method1726(var0, var1, var2);
		} else if (var0 < 3600) {
			return class37.method246(var0, var1, var2);
		} else if (var0 < 3700) {
			return class501.method2418(var0, var1, var2);
		} else if (var0 < 3800) {
			return class504.method2427(var0, var1, var2);
		} else if (var0 < 3900) {
			return class154.method885(var0, var1, var2);
		} else if (var0 < 4000) {
			return class455.method2264(var0, var1, var2);
		} else if (var0 < 4100) {
			return class11.method106(var0, var1, var2);
		} else if (var0 < 4200) {
			return class475.method2298(var0, var1, var2);
		} else if (var0 < 4300) {
			return class94.method621(var0, var1, var2);
		} else if (var0 < 5100) {
			return class146.method852(var0, var1, var2);
		} else if (var0 < 5400) {
			return class241.method1382(var0, var1, var2);
		} else if (var0 < 5600) {
			return class255.method1503(var0, var1, var2);
		} else if (var0 < 5700) {
			return class139.method834(var0, var1, var2);
		} else if (var0 < 6300) {
			return class310.method1745(var0, var1, var2);
		} else if (var0 < 6600) {
			return class196.method1072(var0, var1, var2);
		} else if (var0 < 6700) {
			return class139.method835(var0, var1, var2);
		} else if (var0 < 6800) {
			return class278.method1595(var0, var1, var2);
		} else if (var0 < 6900) {
			return class30.method215(var0, var1, var2);
		} else if (var0 < 7000) {
			return class81.method546(var0, var1, var2);
		} else if (var0 < 7100) {
			return class290.method1666(var0, var1, var2);
		} else if (var0 < 7200) {
			return class41.method262(var0, var1, var2);
		} else if (var0 < 7300) {
			return class226.method1286(var0, var1, var2);
		} else if (var0 < 7500) {
			return class534.method2570(var0, var1, var2);
		} else if (var0 < 7600) {
			return class203.method1148(var0, var1, var2);
		} else if (var0 < 7700) {
			return class189.method1038(var0, var1, var2);
		} else {
			return var0 < 8100 ? class185.method1021(var0, var1, var2) : 2;
		}
	}

	protected static final void method1575() {
		class245.field2224.method378();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			class172.field1650[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			class172.field1658[var1] = 0L;
		}

		class172.field1653 = 0;
	}

	static final void method1578(class353 var0) {
		long var2 = 0L;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (var0.field3014 == 0) {
			var2 = class415.field3487.method1790(var0.field3028, var0.field3021, var0.field3027);
		}

		if (var0.field3014 == 1) {
			var2 = class415.field3487.method1795(var0.field3028, var0.field3021, var0.field3027);
		}

		if (var0.field3014 == 2) {
			var2 = class415.field3487.method1771(var0.field3028, var0.field3021, var0.field3027);
		}

		if (var0.field3014 == 3) {
			var2 = class415.field3487.method1804(var0.field3028, var0.field3021, var0.field3027);
		}

		if (var2 != 0L) {
			int var7 = class415.field3487.method1772(var0.field3028, var0.field3021, var0.field3027, var2);
			var4 = class67.method491(var2);
			var5 = var7 & 31;
			var6 = var7 >> 6 & 3;
		}

		var0.field3017 = var4;
		var0.field3019 = var5;
		var0.field3018 = var6;
	}
}
