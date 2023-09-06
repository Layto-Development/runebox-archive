public class class190 extends class218 {
	public static class215 field1758;
	public static class344 field1759;
	public static class344 field1760;
	int field1767;
	int field1768;
	public int field1761;
	public int field1762;
	public int field1763;
	public int field1764;
	public int field1765;
	public int field1766;
	public int field1769;
	public int field1770;

	static {
		field1759 = new class344(64);
		field1760 = new class344(64);
	}

	public class190() {
		this.field1764 = 255;
		this.field1763 = 255;
		this.field1766 = -1;
		this.field1765 = 1;
		this.field1762 = 70;
		this.field1767 = -1;
		this.field1768 = -1;
		this.field1769 = 30;
		this.field1770 = 0;
	}

	public void method1043(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method1040(var1, var3);
		}
	}

	void method1040(class42 var1, int var2) {
		if (var2 == 1) {
			var1.method327();
		} else if (var2 == 2) {
			this.field1764 = var1.method278();
		} else if (var2 == 3) {
			this.field1763 = var1.method278();
		} else if (var2 == 4) {
			this.field1766 = 0;
		} else if (var2 == 5) {
			this.field1762 = var1.method327();
		} else if (var2 == 6) {
			var1.method278();
		} else if (var2 == 7) {
			this.field1767 = var1.method326();
		} else if (var2 == 8) {
			this.field1768 = var1.method326();
		} else if (var2 == 11) {
			this.field1766 = var1.method327();
		} else if (var2 == 14) {
			this.field1769 = var1.method278();
		} else if (var2 == 15) {
			this.field1770 = var1.method278();
		}

	}

	public class115 method1041() {
		if (this.field1767 < 0) {
			return null;
		} else {
			class115 var2 = (class115)field1760.method1890((long)this.field1767);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class38.method253(class519.field4225, this.field1767, 0);
				if (null != var2) {
					field1760.method1889(var2, (long)this.field1767);
				}

				return var2;
			}
		}
	}

	public class115 method1042() {
		if (this.field1768 < 0) {
			return null;
		} else {
			class115 var2 = (class115)field1760.method1890((long)this.field1768);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class38.method253(class519.field4225, this.field1768, 0);
				if (null != var2) {
					field1760.method1889(var2, (long)this.field1768);
				}

				return var2;
			}
		}
	}

	public static int method1044(int var0) {
		return var0 >> 11 & 63;
	}

	static class253 method1039(byte[] var0) {
		if (null == var0) {
			return null;
		} else {
			class253 var2 = new class253(var0, class49.field588, class517.field4221, class177.field1707, class420.field3504, class101.field1016, class29.field463);
			class49.field588 = null;
			class517.field4221 = null;
			class177.field1707 = null;
			class420.field3504 = null;
			class101.field1016 = null;
			class29.field463 = (byte[][])null;
			return var2;
		}
	}
}
