import java.util.Iterator;

public class class161 {

	int field1642;

	final class79 field1641;

	public final class107 field1644;

	public final class450 field1643;

	class161(class79 var1) {
		this.field1642 = 0;
		this.field1641 = var1;
		this.field1644 = new class107(var1);
		this.field1643 = new class450(var1);
	}

	boolean method939() {
		return this.field1642 == 2;
	}

	final void method940() {
		this.field1642 = 1;
	}

	final void method951(class187 var1, int var2) {
		this.field1644.method652(var1, var2, (byte) -1);
		this.field1642 = 2;
		for (int var4 = 0; var4 < class274.field2240; ++var4) {
			class82 var5 = Client.field1071[class274.field2241[var4]];
			var5.method331();
		}
		Iterator var7 = class156.field1615.iterator();
		while (var7.hasNext()) {
			class374 var6 = (class374) var7.next();
			var6.method1988();
		}
		if (class366.field2930 != null) {
			class366.field2930.method84();
		}
	}

	final void method941() {
		for (class280 var2 = (class280) this.field1644.field1290.method642(); var2 != null; var2 = (class280) this.field1644.field1290.method641()) {
			if ((long) var2.field2285 < class48.method197() / 1000L - 5L) {
				if (var2.field2283 > 0) {
					class156.method918(5, "", var2.field2282 + class55.field480);
				}
				if (var2.field2283 == 0) {
					class156.method918(5, "", var2.field2282 + class55.field374);
				}
				var2.method926();
			}
		}
	}

	final void method942() {
		this.field1642 = 0;
		this.field1644.method2264();
		this.field1643.method2264();
	}

	final boolean method943(class78 var1, boolean var2) {
		if (null == var1) {
			return false;
		} else if (var1.equals(class431.field3378.field822)) {
			return true;
		} else {
			return this.field1644.method651(var1, false);
		}
	}

	final boolean method944(class78 var1) {
		if (null == var1) {
			return false;
		} else {
			return this.field1643.method2280(var1);
		}
	}

	final void method945(String var1) {
		if (var1 != null) {
			class78 var3 = new class78(var1, this.field1641);
			if (var3.method323()) {
				if (this.method946()) {
					method955(class55.field499);
				} else if (class431.field3378.field822.equals(var3)) {
					method957();
				} else if (this.method943(var3, false)) {
					method958(var1);
				} else if (this.method944(var3)) {
					method955(class55.field505 + var1 + class55.field506);
				} else {
					method954(var1);
				}
			}
		}
	}

	final boolean method946() {
		return this.field1644.method2265() || this.field1644.method2285() >= 200 && Client.field1027 != 1;
	}

	final void method947(String var1) {
		if (null != var1) {
			class78 var3 = new class78(var1, this.field1641);
			if (var3.method323()) {
				if (this.method950()) {
					method955(class55.field501);
				} else if (class431.field3378.field822.equals(var3)) {
					method959();
				} else if (this.method944(var3)) {
					method953(var1);
				} else if (this.method943(var3, false)) {
					method955(class55.field319 + var1 + class55.field478);
				} else {
					class457 var4 = class457.method2237(class483.field3845, Client.field963.field1603);
					var4.field3487.method1085(class187.method1159(var1));
					var4.field3487.method1088(var1);
					Client.field963.method911(var4);
				}
			}
		}
	}

	final boolean method950() {
		return this.field1643.method2265() || this.field1643.method2285() >= 100 && Client.field1027 != 1;
	}

	final void method948(String var1) {
		if (null != var1) {
			class78 var3 = new class78(var1, this.field1641);
			if (var3.method323()) {
				if (this.field1644.method2283(var3)) {
					Client.method499();
					class457 var4 = class457.method2237(class483.field3825, Client.field963.field1603);
					var4.field3487.method1085(class187.method1159(var1));
					var4.field3487.method1088(var1);
					Client.field963.method911(var4);
				}
				for (int var6 = 0; var6 < class274.field2240; ++var6) {
					class82 var5 = Client.field1071[class274.field2241[var6]];
					var5.method331();
				}
				Iterator var7 = class156.field1615.iterator();
				while (var7.hasNext()) {
					class374 var8 = (class374) var7.next();
					var8.method1988();
				}
				if (null != class366.field2930) {
					class366.field2930.method84();
				}
			}
		}
	}

	public final void method949(String var1, boolean var2) {
		if (null != var1) {
			class78 var4 = new class78(var1, this.field1641);
			if (var4.method323()) {
				if (this.field1643.method2283(var4)) {
					Client.method499();
					if (var2) {
						class457 var5 = class457.method2237(class483.field3847, Client.field963.field1603);
						var5.field3487.method1085(class187.method1159(var1));
						var5.field3487.method1088(var1);
						Client.field963.method911(var5);
					}
				}
				Client.method591();
			}
		}
	}

	final boolean method952(class78 var1) {
		class175 var3 = (class175) this.field1644.method2266(var1);
		return null != var3 && var3.method907();
	}

	static final void method955(String var0) {
		class156.method918(30, "", var0);
	}

	static final void method958(String var0) {
		method955(var0 + class55.field321);
	}

	static final void method957() {
		method955(class55.field503);
	}

	static final void method954(String var0) {
		class457 var2 = class457.method2237(class483.field3797, Client.field963.field1603);
		var2.field3487.method1085(class187.method1159(var0));
		var2.field3487.method1088(var0);
		Client.field963.method911(var2);
	}

	static final void method953(String var0) {
		method955(var0 + class55.field502);
	}

	static final void method959() {
		method955(class55.field504);
	}

	static final void method956(String var0, int var1) {
		class457 var3 = class457.method2237(class483.field3864, Client.field963.field1603);
		var3.field3487.method1085(class187.method1159(var0) + 1);
		var3.field3487.method1085(var1);
		var3.field3487.method1088(var0);
		Client.field963.method911(var3);
	}
}
