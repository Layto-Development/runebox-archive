public class class121 extends class77 {

	public static int field1437;

	static int field1436;

	static int field1438;

	class199 field1434;

	class292 field1435;

	class121(class199 var1) {
		this.field1435 = new class292();
		this.field1434 = var1;
	}

	void method837(int var1, int var2, int var3, int var4) {
		class123 var6 = null;
		int var7 = 0;
		for (class123 var8 = (class123) this.field1435.method1585(); var8 != null; var8 = (class123) this.field1435.method1581()) {
			++var7;
			if (var8.field1450 == var1) {
				var8.method845(var1, var2, var3, var4);
				return;
			}
			if (var8.field1450 <= var1) {
				var6 = var8;
			}
		}
		if (null == var6) {
			if (var7 < 4) {
				this.field1435.method1588(new class123(var1, var2, var3, var4));
			}
		} else {
			class292.method1586(new class123(var1, var2, var3, var4), var6);
			if (var7 >= 4) {
				this.field1435.method1585().method318();
			}
		}
	}

	class123 method838(int var1) {
		class123 var3 = (class123) this.field1435.method1585();
		if (null != var3 && var3.field1450 <= var1) {
			for (class123 var4 = (class123) this.field1435.method1581(); null != var4 && var4.field1450 <= var1; var4 = (class123) this.field1435.method1581()) {
				var3.method318();
				var3 = var4;
			}
			if (var3.field1450 + var3.field1448 + this.field1434.field1873 > var1) {
				return var3;
			} else {
				var3.method318();
				return null;
			}
		} else {
			return null;
		}
	}

	boolean method839() {
		return this.field1435.method1583();
	}
}
