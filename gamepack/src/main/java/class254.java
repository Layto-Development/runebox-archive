public final class class254 {
	class462 field2355;
	class462 field2356;
	class462[] field2354;
	int field2353;
	int field2357;

	public class254(int var1) {
		this.field2353 = 0;
		this.field2357 = var1;
		this.field2354 = new class462[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class462 var3 = this.field2354[var2] = new class462();
			var3.field3986 = var3;
			var3.field3988 = var3;
		}

	}

	public class462 method1492(long var1) {
		class462 var3 = this.field2354[(int)(var1 & (long)(this.field2357 - 1))];

		for (this.field2355 = var3.field3986; this.field2355 != var3; this.field2355 = this.field2355.field3986) {
			if (this.field2355.field3987 == var1) {
				class462 var4 = this.field2355;
				this.field2355 = this.field2355.field3986;
				return var4;
			}
		}

		this.field2355 = null;
		return null;
	}

	public int method1491() {
		int var1 = 0;

		for (int var2 = 0; var2 < this.field2357; ++var2) {
			class462 var3 = this.field2354[var2];

			for (class462 var4 = var3.field3986; var4 != var3; var4 = var4.field3986) {
				++var1;
			}
		}

		return var1;
	}

	public void method1495(class462 var1, long var2) {
		if (var1.field3988 != null) {
			var1.method2269();
		}

		class462 var4 = this.field2354[(int)(var2 & (long)(this.field2357 - 1))];
		var1.field3988 = var4.field3988;
		var1.field3986 = var4;
		var1.field3988.field3986 = var1;
		var1.field3986.field3988 = var1;
		var1.field3987 = var2;
	}

	public class462 method1493() {
		this.field2353 = 0;
		return this.method1494();
	}

	public class462 method1494() {
		class462 var1;
		if (this.field2353 > 0 && this.field2356 != this.field2354[this.field2353 - 1]) {
			var1 = this.field2356;
			this.field2356 = var1.field3986;
			return var1;
		} else {
			do {
				if (this.field2353 >= this.field2357) {
					return null;
				}

				var1 = this.field2354[this.field2353++].field3986;
			} while(var1 == this.field2354[this.field2353 - 1]);

			this.field2356 = var1.field3986;
			return var1;
		}
	}
}
