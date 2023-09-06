public class class464 {
	static class60 field3990;
	class55 field3992;
	long field3993;
	public int field3991;

	public class464(class42 var1) {
		this.field3991 = -1;
		this.field3992 = new class55();
		this.method2274(var1);
	}

	void method2274(class42 var1) {
		this.field3993 = var1.method283();
		this.field3991 = var1.method282();

		for (int var3 = var1.method278(); var3 != 0; var3 = var1.method278()) {
			Object var4;
			if (var3 == 3) {
				var4 = new class137(this);
			} else if (var3 == 1) {
				var4 = new class371(this);
			} else if (var3 == 13) {
				var4 = new class111(this);
			} else if (var3 == 4) {
				var4 = new class198(this);
			} else if (var3 == 6) {
				var4 = new class248(this);
			} else if (var3 == 5) {
				var4 = new class6(this);
			} else if (var3 == 2) {
				var4 = new class39(this);
			} else if (var3 == 7) {
				var4 = new class131(this);
			} else if (var3 == 14) {
				var4 = new class335(this);
			} else if (var3 == 8) {
				var4 = new class241(this);
			} else if (var3 == 9) {
				var4 = new class527(this);
			} else if (var3 == 10) {
				var4 = new class529(this);
			} else if (var3 == 11) {
				var4 = new class74(this);
			} else if (var3 == 12) {
				var4 = new class517(this);
			} else {
				if (var3 != 15) {
					throw new RuntimeException("");
				}

				var4 = new class539(this);
			}

			((class538)var4).method2583(var1);
			this.field3992.method403((class462)var4);
		}

	}

	public void method2273(class379 var1) {
		if (var1.field3203 == this.field3993 && this.field3991 == var1.field3220) {
			for (class538 var3 = (class538)this.field3992.method409(); null != var3; var3 = (class538)this.field3992.method405()) {
				var3.method2582(var1);
			}

			++var1.field3220;
		} else {
			throw new RuntimeException("");
		}
	}

	public static class160 method2275(byte var0) {
		if (class160.field1482 == 0) {
			if (var0 != -1) {
				throw new IllegalStateException();
			} else {
				return new class160();
			}
		} else {
			return class160.field1481[--class160.field1482];
		}
	}
}
