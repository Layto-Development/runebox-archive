public class class144 extends class182 {

	class449 field1548;

	class449 field1551;

	int field1549;

	int field1550;

	public class144() {
		this.field1551 = new class449();
		this.field1548 = new class449();
		this.field1550 = 0;
		this.field1549 = -1;
	}

	public final synchronized void method893(class182 var1) {
		this.field1551.method2223(var1);
	}

	public final synchronized void method883(class182 var1) {
		var1.method318();
	}

	void method884() {
		if (this.field1550 > 0) {
			for (class495 var1 = (class495) this.field1548.method2218(); var1 != null; var1 = (class495) this.field1548.method2220()) {
				var1.field3987 -= this.field1550;
			}
			this.field1549 -= this.field1550;
			this.field1550 = 0;
		}
	}

	void method885(class77 var1, class495 var2) {
		while (var1 != this.field1548.field3468 && ((class495) var1).field3987 <= var2.field3987) {
			var1 = var1.field784;
		}
		class449.method2215(var2, var1);
		this.field1549 = ((class495) this.field1548.field3468.field784).field3987;
	}

	void method886(class495 var1) {
		var1.method318();
		var1.method2372();
		class77 var2 = this.field1548.field3468.field784;
		if (var2 == this.field1548.field3468) {
			this.field1549 = -1;
		} else {
			this.field1549 = ((class495) var2).field3987;
		}
	}

	@Override
	protected class182 method1066() {
		return (class182) this.field1551.method2218();
	}

	@Override
	protected class182 method1067() {
		return (class182) this.field1551.method2220();
	}

	@Override
	protected int method1064() {
		return 0;
	}

	@Override
	public final synchronized void method1069(int[] var1, int var2, int var3) {
		do {
			if (this.field1549 < 0) {
				this.method890(var1, var2, var3);
				return;
			}
			if (this.field1550 + var3 < this.field1549) {
				this.field1550 += var3;
				this.method890(var1, var2, var3);
				return;
			}
			int var4 = this.field1549 - this.field1550;
			this.method890(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1550 += var4;
			this.method884();
			class495 var5 = (class495) this.field1548.method2218();
			synchronized (var5) {
				int var7 = var5.method2373(this);
				if (var7 < 0) {
					var5.field3987 = 0;
					this.method886(var5);
				} else {
					var5.field3987 = var7;
					this.method885(var5.field784, var5);
				}
			}
		} while (var3 != 0);
	}

	void method890(int[] var1, int var2, int var3) {
		for (class182 var4 = (class182) this.field1551.method2218(); var4 != null; var4 = (class182) this.field1551.method2220()) {
			var4.method1070(var1, var2, var3);
		}
	}

	@Override
	public final synchronized void method1068(int var1) {
		do {
			if (this.field1549 < 0) {
				this.method894(var1);
				return;
			}
			if (this.field1550 + var1 < this.field1549) {
				this.field1550 += var1;
				this.method894(var1);
				return;
			}
			int var2 = this.field1549 - this.field1550;
			this.method894(var2);
			var1 -= var2;
			this.field1550 += var2;
			this.method884();
			class495 var3 = (class495) this.field1548.method2218();
			synchronized (var3) {
				int var5 = var3.method2373(this);
				if (var5 < 0) {
					var3.field3987 = 0;
					this.method886(var3);
				} else {
					var3.field3987 = var5;
					this.method885(var3.field784, var3);
				}
			}
		} while (var1 != 0);
	}

	void method894(int var1) {
		for (class182 var2 = (class182) this.field1551.method2218(); var2 != null; var2 = (class182) this.field1551.method2220()) {
			var2.method1068(var1);
		}
	}
}
