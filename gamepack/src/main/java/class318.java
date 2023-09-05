import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "dp")
public class class318 {
	@ObfInfo(name = "ai", desc = "Z")
	boolean field2568;
	@ObfInfo(name = "ap", desc = "Z")
	boolean field2571;
	@ObfInfo(name = "az", desc = "Z")
	boolean field2576;
	@ObfInfo(name = "ac", desc = "Z")
	boolean field2577;
	@ObfInfo(name = "af", desc = "D")
	double field2572;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -2121204659)
	int field2567;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -2033437103)
	int field2569;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -451342601)
	int field2573;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 148824169)
	int field2574;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1998848961)
	int field2575;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 321590221)
	int field2578;
	@ObfInfo(name = "ar", desc = "Ljava/lang/String;")
	String field2570;
	@ObfInfo(name = "ag", desc = "Ljava/util/Map;")
	final Map field2579;

	@ObfInfo(name = "<init>", desc = "()V")
	class318() {
		this.field2568 = false;
		this.field2571 = false;
		this.field2572 = 0.8D;
		this.field2567 = 127;
		this.field2574 = 127;
		this.field2575 = 127;
		this.field2573 = -1;
		this.field2570 = null;
		this.field2578 = 1;
		this.field2579 = new LinkedHashMap();
		this.method1742(true);
	}

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	class318(class280 var1) {
		this.field2568 = false;
		this.field2571 = false;
		this.field2572 = 0.8D;
		this.field2567 = 127;
		this.field2574 = 127;
		this.field2575 = 127;
		this.field2573 = -1;
		this.field2570 = null;
		this.field2578 = 1;
		this.field2579 = new LinkedHashMap();
		if (var1 != null && var1.field2252 != null) {
			int var2 = var1.method1492();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.method1492() == 1) {
					this.field2577 = true;
				}

				if (var2 > 1) {
					this.field2576 = var1.method1492() == 1;
				}

				if (var2 > 3) {
					this.field2578 = var1.method1492();
				}

				if (var2 > 2) {
					int var3 = var1.method1492();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method1496();
						int var6 = var1.method1496();
						this.field2579.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field2570 = var1.method1551();
				}

				if (var2 > 5) {
					this.field2568 = var1.method1499();
				}

				if (var2 > 6) {
					this.field2572 = (double)var1.method1492() / 100.0D;
					this.field2567 = var1.method1492();
					this.field2574 = var1.method1492();
					this.field2575 = var1.method1492();
				}

				if (var2 > 7) {
					this.field2573 = var1.method1492();
				}

				if (var2 > 8) {
					this.field2571 = var1.method1492() == 1;
				}

				if (var2 > 9) {
					this.field2569 = var1.method1496();
				}
			} else {
				this.method1742(true);
			}
		} else {
			this.method1742(true);
		}

	}

	@ObfInfo(name = "au", desc = "(ZB)V")
	void method1742(boolean var1) {
	}

	@ObfInfo(name = "ae", desc = "(I)Ltm;", opaqueValue = "1870695178")
	class280 method1743() {
		class280 var2 = new class280(417, true);
		var2.method1481(10);
		var2.method1481(this.field2577 ? 1 : 0);
		var2.method1481(this.field2576 ? 1 : 0);
		var2.method1481(this.field2578);
		var2.method1481(this.field2579.size());
		Iterator var3 = this.field2579.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method1547((Integer)var4.getKey());
			var2.method1547((Integer)var4.getValue());
		}

		var2.method1484(null != this.field2570 ? this.field2570 : "");
		var2.method1483(this.field2568);
		var2.method1481((int)(this.field2572 * 100.0D));
		var2.method1481(this.field2567);
		var2.method1481(this.field2574);
		var2.method1481(this.field2575);
		var2.method1481(this.field2573);
		var2.method1481(this.field2571 ? 1 : 0);
		var2.method1547(this.field2569);
		return var2;
	}

	@ObfInfo(name = "at", desc = "(ZI)V")
	void method1744(boolean var1) {
		this.field2577 = var1;
		method1774();
	}

	@ObfInfo(name = "ac", desc = "(I)Z")
	boolean method1745() {
		return this.field2577;
	}

	@ObfInfo(name = "ai", desc = "(ZI)V")
	void method1766(boolean var1) {
		this.field2568 = var1;
		method1774();
	}

	@ObfInfo(name = "az", desc = "(I)Z")
	boolean method1749() {
		return this.field2568;
	}

	@ObfInfo(name = "ap", desc = "(ZI)V")
	void method1764(boolean var1) {
		this.field2576 = var1;
		method1774();
	}

	@ObfInfo(name = "aa", desc = "(B)Z")
	boolean method1765() {
		return this.field2576;
	}

	@ObfInfo(name = "af", desc = "(ZI)V")
	void method1747(boolean var1) {
		this.field2571 = var1;
		method1774();
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaqueValue = "-1847880996")
	void method1748() {
		this.method1747(!this.field2571);
	}

	@ObfInfo(name = "aq", desc = "(I)Z")
	boolean method1755() {
		return this.field2571;
	}

	@ObfInfo(name = "al", desc = "(IB)V")
	void method1750(int var1) {
		this.field2569 = var1;
		method1774();
	}

	@ObfInfo(name = "an", desc = "(I)I")
	int method1751() {
		return this.field2569;
	}

	@ObfInfo(name = "ar", desc = "(D)V")
	void method1769(double var1) {
		this.field2572 = var1;
		method1774();
	}

	@ObfInfo(name = "ab", desc = "(I)D")
	double method1767() {
		return this.field2572;
	}

	@ObfInfo(name = "ag", desc = "(II)V")
	void method1752(int var1) {
		this.field2567 = var1;
		method1774();
	}

	@ObfInfo(name = "am", desc = "(B)I")
	int method1746() {
		return this.field2567;
	}

	@ObfInfo(name = "ax", desc = "(IB)V")
	void method1753(int var1) {
		this.field2574 = var1;
		method1774();
	}

	@ObfInfo(name = "ah", desc = "(I)I")
	int method1754() {
		return this.field2574;
	}

	@ObfInfo(name = "as", desc = "(II)V")
	void method1773(int var1) {
		this.field2575 = var1;
		method1774();
	}

	@ObfInfo(name = "ay", desc = "(B)I")
	int method1772() {
		return this.field2575;
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;I)V")
	void method1756(String var1) {
		this.field2570 = var1;
		method1774();
	}

	@ObfInfo(name = "av", desc = "(B)Ljava/lang/String;")
	String method1757() {
		return this.field2570;
	}

	@ObfInfo(name = "aw", desc = "(II)V")
	void method1770(int var1) {
		this.field2573 = var1;
		method1774();
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	int method1758() {
		return this.field2573;
	}

	@ObfInfo(name = "bh", desc = "(IB)V")
	void method1759(int var1) {
		this.field2578 = var1;
		method1774();
	}

	@ObfInfo(name = "bj", desc = "(I)I")
	int method1760() {
		return this.field2578;
	}

	@ObfInfo(name = "bk", desc = "(Ljava/lang/String;II)V", opaqueValue = "594839469")
	void method1761(String var1, int var2) {
		int var4 = this.method1763(var1);
		if (this.field2579.size() >= 10 && !this.field2579.containsKey(var4)) {
			Iterator var5 = this.field2579.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field2579.put(var4, var2);
		method1774();
	}

	@ObfInfo(name = "bv", desc = "(Ljava/lang/String;I)Z")
	boolean method1762(String var1) {
		int var3 = this.method1763(var1);
		return this.field2579.containsKey(var3);
	}

	@ObfInfo(name = "bt", desc = "(Ljava/lang/String;S)I")
	int method1768(String var1) {
		int var3 = this.method1763(var1);
		return !this.field2579.containsKey(var3) ? 0 : (Integer)this.field2579.get(var3);
	}

	@ObfInfo(name = "bd", desc = "(Ljava/lang/String;B)I")
	int method1763(String var1) {
		return class455.method2374(var1.toLowerCase());
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	static void method1774() {
		class408 var1 = null;

		try {
			var1 = class519.method2544("", class512.field4103.field1605, true);
			class280 var2 = class281.field2262.method1743();
			var1.method2136(var2.field2252, 0, var2.field2254);
		} catch (Exception var4) {
		}

		try {
			if (var1 != null) {
				var1.method2140(true);
			}
		} catch (Exception var3) {
		}

	}

	@ObfInfo(name = "ar", desc = "(IB)I")
	public static int method1771(int var0, byte var1) {
		class89 var2 = class19.method330(var0);
		if (var2 == null) {
			if (var1 == -1) {
				throw new IllegalStateException();
			} else {
				return 2;
			}
		} else {
			byte var10000;
			if (var2.method579()) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				var10000 = 0;
			} else {
				var10000 = 1;
			}

			return var10000;
		}
	}
}
