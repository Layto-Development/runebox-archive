public final class class106 {

	class139 field1286;

	class310 field1289;

	class419 field1288;

	int field1285;

	int field1287;

	public class106(int var1) {
		this.field1289 = new class310();
		this.field1286 = new class139();
		this.field1285 = var1;
		this.field1287 = var1;
		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}
		this.field1288 = new class419(var2);
	}

	public class310 method648(long var1) {
		class310 var3 = (class310) this.field1288.method2105(var1);
		if (var3 != null) {
			this.field1286.method873(var3);
		}
		return var3;
	}

	public void method646(long var1) {
		class310 var3 = (class310) this.field1288.method2105(var1);
		if (var3 != null) {
			var3.method318();
			var3.method1674();
			++this.field1287;
		}
	}

	public void method647(class310 var1, long var2) {
		if (this.field1287 == 0) {
			class310 var4 = this.field1286.method875();
			var4.method318();
			var4.method1674();
			if (var4 == this.field1289) {
				var4 = this.field1286.method875();
				var4.method318();
				var4.method1674();
			}
		} else {
			--this.field1287;
		}
		this.field1288.method2109(var1, var2);
		this.field1286.method873(var1);
	}

	public void method645() {
		this.field1286.method879();
		this.field1288.method2106();
		this.field1289 = new class310();
		this.field1287 = this.field1285;
	}
}
