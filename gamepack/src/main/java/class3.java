public class class3 {

	class374[] field4;

	int field3;

	class3() {
		this.field4 = new class374[100];
	}

	class374 method8(int var1, String var2, String var3, String var4) {
		class374 var6 = this.field4[99];
		for (int var7 = this.field3; var7 > 0; --var7) {
			if (var7 != 100) {
				this.field4[var7] = this.field4[var7 - 1];
			}
		}
		if (null == var6) {
			var6 = new class374(var1, var2, var4, var3);
		} else {
			var6.method318();
			var6.method1674();
			var6.method1990(var1, var2, var4, var3);
		}
		this.field4[0] = var6;
		if (this.field3 < 100) {
			++this.field3;
		}
		return var6;
	}

	class374 method9(int var1) {
		return var1 >= 0 && var1 < this.field3 ? this.field4[var1] : null;
	}

	int method7() {
		return this.field3;
	}
}
