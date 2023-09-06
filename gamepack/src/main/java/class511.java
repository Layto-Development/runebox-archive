public class class511 {
	int field4187;
	int field4188;
	int[] field4189;
	int[] field4190;

	class511() {
		class326 var1 = class374.field3117;
		var1.method1829(16);
		this.field4188 = var1.method1830() != 0 ? var1.method1829(4) + 1 : 1;
		if (var1.method1830() != 0) {
			var1.method1829(8);
		}

		var1.method1829(2);
		if (this.field4188 > 1) {
			this.field4187 = var1.method1829(4);
		}

		this.field4189 = new int[this.field4188];
		this.field4190 = new int[this.field4188];

		for (int var2 = 0; var2 < this.field4188; ++var2) {
			var1.method1829(8);
			this.field4189[var2] = var1.method1829(8);
			this.field4190[var2] = var1.method1829(8);
		}

	}
}
