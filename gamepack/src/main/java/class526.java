import java.util.Iterator;

public final class class526 implements Iterable {
	class462 field4248;
	class462 field4249;
	class462[] field4247;
	int field4246;
	int field4250;

	public class526(int var1) {
		this.field4250 = 0;
		this.field4246 = var1;
		this.field4247 = new class462[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class462 var3 = this.field4247[var2] = new class462();
			var3.field3986 = var3;
			var3.field3988 = var3;
		}

	}

	public class462 method2543(long var1) {
		class462 var3 = this.field4247[(int)(var1 & (long)(this.field4246 - 1))];

		for (this.field4248 = var3.field3986; this.field4248 != var3; this.field4248 = this.field4248.field3986) {
			if (this.field4248.field3987 == var1) {
				class462 var4 = this.field4248;
				this.field4248 = this.field4248.field3986;
				return var4;
			}
		}

		this.field4248 = null;
		return null;
	}

	public void method2547(class462 var1, long var2) {
		if (var1.field3988 != null) {
			var1.method2269();
		}

		class462 var4 = this.field4247[(int)(var2 & (long)(this.field4246 - 1))];
		var1.field3988 = var4.field3988;
		var1.field3986 = var4;
		var1.field3988.field3986 = var1;
		var1.field3986.field3988 = var1;
		var1.field3987 = var2;
	}

	public void method2544() {
		for (int var1 = 0; var1 < this.field4246; ++var1) {
			class462 var2 = this.field4247[var1];

			while (true) {
				class462 var3 = var2.field3986;
				if (var3 == var2) {
					break;
				}

				var3.method2269();
			}
		}

		this.field4248 = null;
		this.field4249 = null;
	}

	public class462 method2545() {
		this.field4250 = 0;
		return this.method2546();
	}

	public class462 method2546() {
		class462 var1;
		if (this.field4250 > 0 && this.field4249 != this.field4247[this.field4250 - 1]) {
			var1 = this.field4249;
			this.field4249 = var1.field3986;
			return var1;
		} else {
			do {
				if (this.field4250 >= this.field4246) {
					return null;
				}

				var1 = this.field4247[this.field4250++].field3986;
			} while(var1 == this.field4247[this.field4250 - 1]);

			this.field4249 = var1.field3986;
			return var1;
		}
	}

	public Iterator iterator() {
		return new class301(this);
	}
}
