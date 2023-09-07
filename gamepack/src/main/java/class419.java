import java.util.Iterator;

public final class class419 implements Iterable {

	class77 field3235;

	class77 field3236;

	class77[] field3234;

	int field3233;

	int field3237;

	public class419(int var1) {
		this.field3237 = 0;
		this.field3233 = var1;
		this.field3234 = new class77[var1];
		for (int var2 = 0; var2 < var1; ++var2) {
			class77 var3 = this.field3234[var2] = new class77();
			var3.field784 = var3;
			var3.field786 = var3;
		}
	}

	public class77 method2105(long var1) {
		class77 var3 = this.field3234[(int) (var1 & (long) (this.field3233 - 1))];
		for (this.field3235 = var3.field784; this.field3235 != var3; this.field3235 = this.field3235.field784) {
			if (this.field3235.field785 == var1) {
				class77 var4 = this.field3235;
				this.field3235 = this.field3235.field784;
				return var4;
			}
		}
		this.field3235 = null;
		return null;
	}

	public void method2109(class77 var1, long var2) {
		if (var1.field786 != null) {
			var1.method318();
		}
		class77 var4 = this.field3234[(int) (var2 & (long) (this.field3233 - 1))];
		var1.field786 = var4.field786;
		var1.field784 = var4;
		var1.field786.field784 = var1;
		var1.field784.field786 = var1;
		var1.field785 = var2;
	}

	public void method2106() {
		for (int var1 = 0; var1 < this.field3233; ++var1) {
			class77 var2 = this.field3234[var1];
			while (true) {
				class77 var3 = var2.field784;
				if (var3 == var2) {
					break;
				}
				var3.method318();
			}
		}
		this.field3235 = null;
		this.field3236 = null;
	}

	public class77 method2107() {
		this.field3237 = 0;
		return this.method2108();
	}

	public class77 method2108() {
		class77 var1;
		if (this.field3237 > 0 && this.field3236 != this.field3234[this.field3237 - 1]) {
			var1 = this.field3236;
			this.field3236 = var1.field784;
			return var1;
		} else {
			do {
				if (this.field3237 >= this.field3233) {
					return null;
				}
				var1 = this.field3234[this.field3237++].field784;
			} while (var1 == this.field3234[this.field3237 - 1]);
			this.field3236 = var1.field784;
			return var1;
		}
	}

	@Override
	public Iterator iterator() {
		return new class331(this);
	}
}
