import java.io.IOException;

public class class155 {

	static int field1599;

	boolean field1607;

	class187 field1602;

	class292 field1608;

	class406 field1613;

	class465 field1600;

	class465 field1605;

	class465 field1611;

	class465 field1612;

	class515 field1604;

	int field1601;

	int field1606;

	int field1609;

	int field1610;

	public class504 field1603;

	class155() {
		this.field1608 = new class292();
		this.field1601 = 0;
		this.field1602 = new class187(5000);
		this.field1604 = new class515(40000);
		this.field1600 = null;
		this.field1606 = 0;
		this.field1607 = true;
		this.field1610 = 0;
		this.field1609 = 0;
	}

	final void method916() {
		this.field1608.method1578();
		this.field1601 = 0;
	}

	final void method910() throws IOException {
		if (this.field1613 != null && this.field1601 > 0) {
			this.field1602.field1832 = 0;
			while (true) {
				class457 var2 = (class457) this.field1608.method1585();
				if (null == var2 || var2.field3484 > this.field1602.field1830.length - this.field1602.field1832) {
					this.field1613.method2071(this.field1602.field1830, 0, this.field1602.field1832);
					this.field1609 = 0;
					break;
				}
				this.field1602.method1090(var2.field3487.field1830, 0, var2.field3484);
				this.field1601 -= var2.field3484;
				var2.method318();
				var2.field3487.method1084();
				var2.method2235();
			}
		}
	}

	public final void method911(class457 var1) {
		this.field1608.method1579(var1);
		var1.field3484 = var1.field3487.field1832;
		var1.field3487.field1832 = 0;
		this.field1601 += var1.field3484;
	}

	void method912(class406 var1) {
		this.field1613 = var1;
	}

	void method915() {
		if (this.field1613 != null) {
			this.field1613.method2073();
			this.field1613 = null;
		}
	}

	void method913() {
		this.field1613 = null;
	}

	class406 method914() {
		return this.field1613;
	}
}
