public final class class535 {

	class77 field4212;

	class77 field4213;

	class77[] field4211;

	int field4210;

	int field4214;

	public class535(int var1) {
		this.field4210 = 0;
		this.field4214 = var1;
		this.field4211 = new class77[var1];
		for (int var2 = 0; var2 < var1; ++var2) {
			class77 var3 = this.field4211[var2] = new class77();
			var3.field784 = var3;
			var3.field786 = var3;
		}
	}

	public class77 method2582(long var1) {
		class77 var3 = this.field4211[(int) (var1 & (long) (this.field4214 - 1))];
		for (this.field4212 = var3.field784; this.field4212 != var3; this.field4212 = this.field4212.field784) {
			if (this.field4212.field785 == var1) {
				class77 var4 = this.field4212;
				this.field4212 = this.field4212.field784;
				return var4;
			}
		}
		this.field4212 = null;
		return null;
	}

	public int method2581() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field4214; ++var2) {
			class77 var3 = this.field4211[var2];
			for (class77 var4 = var3.field784; var4 != var3; var4 = var4.field784) {
				++var1;
			}
		}
		return var1;
	}

	public void method2585(class77 var1, long var2) {
		if (var1.field786 != null) {
			var1.method318();
		}
		class77 var4 = this.field4211[(int) (var2 & (long) (this.field4214 - 1))];
		var1.field786 = var4.field786;
		var1.field784 = var4;
		var1.field786.field784 = var1;
		var1.field784.field786 = var1;
		var1.field785 = var2;
	}

	public class77 method2583() {
		this.field4210 = 0;
		return this.method2584();
	}

	public class77 method2584() {
		class77 var1;
		if (this.field4210 > 0 && this.field4213 != this.field4211[this.field4210 - 1]) {
			var1 = this.field4213;
			this.field4213 = var1.field784;
			return var1;
		} else {
			do {
				if (this.field4210 >= this.field4214) {
					return null;
				}
				var1 = this.field4211[this.field4210++].field784;
			} while (var1 == this.field4211[this.field4210 - 1]);
			this.field4213 = var1.field784;
			return var1;
		}
	}
}
