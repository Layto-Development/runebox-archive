public final class class344 {
	class218 field2979;
	class282 field2976;
	class526 field2978;
	int field2975;
	int field2977;

	public class344(int var1) {
		this.field2979 = new class218();
		this.field2976 = new class282();
		this.field2975 = var1;
		this.field2977 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}

		this.field2978 = new class526(var2);
	}

	public class218 method1890(long var1) {
		class218 var3 = (class218)this.field2978.method2543(var1);
		if (var3 != null) {
			this.field2976.method1601(var3);
		}

		return var3;
	}

	public void method1888(long var1) {
		class218 var3 = (class218)this.field2978.method2543(var1);
		if (var3 != null) {
			var3.method2269();
			var3.method1252();
			++this.field2977;
		}

	}

	public void method1889(class218 var1, long var2) {
		if (this.field2977 == 0) {
			class218 var4 = this.field2976.method1603();
			var4.method2269();
			var4.method1252();
			if (var4 == this.field2979) {
				var4 = this.field2976.method1603();
				var4.method2269();
				var4.method1252();
			}
		} else {
			--this.field2977;
		}

		this.field2978.method2547(var1, var2);
		this.field2976.method1601(var1);
	}

	public void method1887() {
		this.field2976.method1607();
		this.field2978.method2544();
		this.field2979 = new class218();
		this.field2977 = this.field2975;
	}
}
