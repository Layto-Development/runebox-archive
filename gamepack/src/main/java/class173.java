import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class173 {

	boolean field1705;

	boolean field1708;

	boolean field1713;

	boolean field1714;

	double field1709;

	int field1704;

	int field1706;

	int field1710;

	int field1711;

	int field1712;

	int field1715;

	String field1707;

	final Map field1716;

	class173() {
		this.field1705 = false;
		this.field1708 = false;
		this.field1709 = 0.8D;
		this.field1704 = 127;
		this.field1711 = 127;
		this.field1712 = 127;
		this.field1710 = -1;
		this.field1707 = null;
		this.field1715 = 1;
		this.field1716 = new LinkedHashMap();
		this.method997(true);
	}

	class173(class187 var1) {
		this.field1705 = false;
		this.field1708 = false;
		this.field1709 = 0.8D;
		this.field1704 = 127;
		this.field1711 = 127;
		this.field1712 = 127;
		this.field1710 = -1;
		this.field1707 = null;
		this.field1715 = 1;
		this.field1716 = new LinkedHashMap();
		if (var1 != null && var1.field1830 != null) {
			int var2 = var1.method1096();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.method1096() == 1) {
					this.field1714 = true;
				}
				if (var2 > 1) {
					this.field1713 = var1.method1096() == 1;
				}
				if (var2 > 3) {
					this.field1715 = var1.method1096();
				}
				if (var2 > 2) {
					int var3 = var1.method1096();
					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method1100();
						int var6 = var1.method1100();
						this.field1716.put(var5, var6);
					}
				}
				if (var2 > 4) {
					this.field1707 = var1.method1155();
				}
				if (var2 > 5) {
					this.field1705 = var1.method1103();
				}
				if (var2 > 6) {
					this.field1709 = (double) var1.method1096() / 100.0D;
					this.field1704 = var1.method1096();
					this.field1711 = var1.method1096();
					this.field1712 = var1.method1096();
				}
				if (var2 > 7) {
					this.field1710 = var1.method1096();
				}
				if (var2 > 8) {
					this.field1708 = var1.method1096() == 1;
				}
				if (var2 > 9) {
					this.field1706 = var1.method1100();
				}
			} else {
				this.method997(true);
			}
		} else {
			this.method997(true);
		}
	}

	void method997(boolean var1) {
	}

	class187 method998() {
		class187 var2 = new class187(417, true);
		var2.method1085(10);
		var2.method1085(this.field1714 ? 1 : 0);
		var2.method1085(this.field1713 ? 1 : 0);
		var2.method1085(this.field1715);
		var2.method1085(this.field1716.size());
		Iterator var3 = this.field1716.entrySet().iterator();
		while (var3.hasNext()) {
			Entry var4 = (Entry) var3.next();
			var2.method1151((Integer) var4.getKey());
			var2.method1151((Integer) var4.getValue());
		}
		var2.method1088(null != this.field1707 ? this.field1707 : "");
		var2.method1087(this.field1705);
		var2.method1085((int) (this.field1709 * 100.0D));
		var2.method1085(this.field1704);
		var2.method1085(this.field1711);
		var2.method1085(this.field1712);
		var2.method1085(this.field1710);
		var2.method1085(this.field1708 ? 1 : 0);
		var2.method1151(this.field1706);
		return var2;
	}

	void method999(boolean var1) {
		this.field1714 = var1;
		method1029();
	}

	boolean method1000() {
		return this.field1714;
	}

	void method1021(boolean var1) {
		this.field1705 = var1;
		method1029();
	}

	boolean method1004() {
		return this.field1705;
	}

	void method1019(boolean var1) {
		this.field1713 = var1;
		method1029();
	}

	boolean method1020() {
		return this.field1713;
	}

	void method1002(boolean var1) {
		this.field1708 = var1;
		method1029();
	}

	void method1003() {
		this.method1002(!this.field1708);
	}

	boolean method1010() {
		return this.field1708;
	}

	void method1005(int var1) {
		this.field1706 = var1;
		method1029();
	}

	int method1006() {
		return this.field1706;
	}

	void method1024(double var1) {
		this.field1709 = var1;
		method1029();
	}

	double method1022() {
		return this.field1709;
	}

	void method1007(int var1) {
		this.field1704 = var1;
		method1029();
	}

	int method1001() {
		return this.field1704;
	}

	void method1008(int var1) {
		this.field1711 = var1;
		method1029();
	}

	int method1009() {
		return this.field1711;
	}

	void method1028(int var1) {
		this.field1712 = var1;
		method1029();
	}

	int method1027() {
		return this.field1712;
	}

	void method1011(String var1) {
		this.field1707 = var1;
		method1029();
	}

	String method1012() {
		return this.field1707;
	}

	void method1025(int var1) {
		this.field1710 = var1;
		method1029();
	}

	int method1013() {
		return this.field1710;
	}

	void method1014(int var1) {
		this.field1715 = var1;
		method1029();
	}

	int method1015() {
		return this.field1715;
	}

	void method1016(String var1, int var2) {
		int var4 = this.method1018(var1);
		if (this.field1716.size() >= 10 && !this.field1716.containsKey(var4)) {
			Iterator var5 = this.field1716.entrySet().iterator();
			var5.next();
			var5.remove();
		}
		this.field1716.put(var4, var2);
		method1029();
	}

	boolean method1017(String var1) {
		int var3 = this.method1018(var1);
		return this.field1716.containsKey(var3);
	}

	int method1023(String var1) {
		int var3 = this.method1018(var1);
		return !this.field1716.containsKey(var3) ? 0 : (Integer) this.field1716.get(var3);
	}

	int method1018(String var1) {
		return class514.method2472(var1.toLowerCase());
	}

	static void method1029() {
		class6 var1 = null;
		try {
			var1 = class89.method402("", class359.field2855.field3737, true);
			class187 var2 = class83.field841.method998();
			var1.method13(var2.field1830, 0, var2.field1832);
		} catch (Exception var4) {
		}
		try {
			if (var1 != null) {
				var1.method17(true);
			}
		} catch (Exception var3) {
		}
	}

	public static int method1026(int var0, byte var1) {
		class421 var2 = class392.method2031(var0);
		if (var2 == null) {
			return 2;
		} else {
			return var2.method2121() ? 0 : 1;
		}
	}
}
