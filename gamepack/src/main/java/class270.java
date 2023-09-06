public final class class270 {
	class282 field2440;
	class323 field2438;
	class526 field2439;
	int field2437;
	int field2441;

	public class270(int var1) {
		this(var1, var1);
	}

	public class270(int var1, int var2) {
		this.field2440 = new class282();
		this.field2441 = var1;
		this.field2437 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field2439 = new class526(var3);
	}

	public Object method1580(long var1) {
		class191 var3 = (class191)this.field2439.method2543(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method1046();
			if (var4 == null) {
				var3.method2269();
				var3.method1252();
				this.field2437 += var3.field1771;
				return null;
			} else {
				if (var3.method1045()) {
					class325 var5 = new class325(var4, var3.field1771);
					this.field2439.method2547(var5, var3.field3987);
					this.field2440.method1601(var5);
					var5.field2031 = 0L;
					var3.method2269();
					var3.method1252();
				} else {
					this.field2440.method1601(var3);
					var3.field2031 = 0L;
				}

				return var4;
			}
		}
	}

	void method1586(long var1) {
		class191 var3 = (class191)this.field2439.method2543(var1);
		this.method1581(var3);
	}

	void method1581(class191 var1) {
		if (var1 != null) {
			var1.method2269();
			var1.method1252();
			this.field2437 += var1.field1771;
		}

	}

	public void method1582(Object var1, long var2) {
		this.method1583(var1, var2, 1);
	}

	public void method1583(Object var1, long var2, int var4) {
		if (var4 > this.field2441) {
			throw new IllegalStateException();
		} else {
			this.method1586(var2);
			this.field2437 -= var4;

			while (this.field2437 < 0) {
				class191 var5 = (class191)this.field2440.method1603();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method1045()) {
				}

				this.method1581(var5);
				if (this.field2438 != null) {
					this.field2438.method1827(var5.method1046());
				}
			}

			class325 var6 = new class325(var1, var4);
			this.field2439.method2547(var6, var2);
			this.field2440.method1601(var6);
			var6.field2031 = 0L;
		}
	}

	public void method1584(int var1) {
		for (class191 var2 = (class191)this.field2440.method1604(); var2 != null; var2 = (class191)this.field2440.method1606()) {
			if (var2.method1045()) {
				if (var2.method1046() == null) {
					var2.method2269();
					var2.method1252();
					this.field2437 += var2.field1771;
				}
			} else if (++var2.field2031 > (long)var1) {
				class331 var3 = new class331(var2.method1046(), var2.field1771);
				this.field2439.method2547(var3, var2.field3987);
				class282.method1602(var3, var2);
				var2.method2269();
				var2.method1252();
			}
		}

	}

	public void method1585() {
		this.field2440.method1607();
		this.field2439.method2544();
		this.field2437 = this.field2441;
	}
}
