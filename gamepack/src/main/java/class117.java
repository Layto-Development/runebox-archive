public class class117 implements class405 {
	int field1121;
	int field1122;
	int field1123;
	int field1124;
	int field1125;
	int field1126;
	int field1127;
	int field1128;
	int field1129;
	int field1130;

	class117() {
	}

	public void method2098(class8 var1) {
		if (var1.field341 > this.field1128) {
			var1.field341 = this.field1128;
		}

		if (var1.field335 < this.field1129) {
			var1.field335 = this.field1129;
		}

		if (var1.field343 > this.field1122) {
			var1.field343 = this.field1122;
		}

		if (var1.field337 < this.field1121) {
			var1.field337 = this.field1121;
		}

	}

	public boolean method2093(int var1, int var2, int var3) {
		if (var1 >= this.field1127 && var1 < this.field1127 + this.field1130) {
			return var2 >> 6 >= this.field1123 && var2 >> 6 <= this.field1125 && var3 >> 6 >= this.field1124 && var3 >> 6 <= this.field1126;
		} else {
			return false;
		}
	}

	public boolean method2094(int var1, int var2) {
		return var1 >> 6 >= this.field1128 && var1 >> 6 <= this.field1129 && var2 >> 6 >= this.field1122 && var2 >> 6 <= this.field1121;
	}

	public int[] method2096(int var1, int var2, int var3) {
		if (!this.method2093(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field1128 * 64 - this.field1123 * 64 + var2, this.field1122 * 64 - this.field1124 * 64 + var3};
			return var5;
		}
	}

	public class29 method2097(int var1, int var2) {
		if (!this.method2094(var1, var2)) {
			return null;
		} else {
			int var4 = var1 + (this.field1123 * 64 - this.field1128 * 64);
			int var5 = var2 + (this.field1124 * 64 - this.field1122 * 64);
			return new class29(this.field1127, var4, var5);
		}
	}

	public void method2095(class42 var1) {
		this.field1127 = var1.method278();
		this.field1130 = var1.method278();
		this.field1123 = var1.method327();
		this.field1124 = var1.method327();
		this.field1125 = var1.method327();
		this.field1126 = var1.method327();
		this.field1128 = var1.method327();
		this.field1122 = var1.method327();
		this.field1129 = var1.method327();
		this.field1121 = var1.method327();
		this.method745();
	}

	void method745() {
	}

	static final void method747() {
		Client.field211 = Client.field5;
		class524.field4239 = true;
	}

	static void method748() {
		if (Client.field96 == 1) {
			Client.field104 = true;
		}

	}
}
