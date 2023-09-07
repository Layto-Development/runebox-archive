import java.security.SecureRandom;

public final class class435 extends class189 {

	static SecureRandom field3420;

	boolean field3418;

	class67 field3415;

	int field3410;

	int field3411;

	int field3412;

	int field3413;

	int field3414;

	int field3416;

	int field3417;

	int field3419;

	class435(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field3416 = 0;
		this.field3417 = 0;
		this.field3418 = false;
		this.field3419 = var1;
		this.field3412 = var2;
		this.field3413 = var3;
		this.field3414 = var4;
		this.field3410 = var5;
		this.field3411 = var7 + var6;
		int var8 = class138.method872(this.field3419).field1522;
		if (var8 != -1) {
			this.field3418 = false;
			this.field3415 = class67.method308(var8);
		} else {
			this.field3418 = true;
		}
	}

	final void method2169(int var1) {
		if (!this.field3418) {
			this.field3417 += var1;
			if (!this.field3415.method307()) {
				while (this.field3417 > this.field3415.field712[this.field3416]) {
					this.field3417 -= this.field3415.field712[this.field3416];
					++this.field3416;
					if (this.field3416 >= this.field3415.field701.length) {
						this.field3418 = true;
						break;
					}
				}
			} else {
				this.field3416 += var1;
				if (this.field3416 >= this.field3415.method304()) {
					this.field3418 = true;
				}
			}
		}
	}

	@Override
	protected final class113 method1165() {
		class138 var2 = class138.method872(this.field3419);
		class113 var3;
		if (!this.field3418) {
			var3 = var2.method868(this.field3416);
		} else {
			var3 = var2.method868(-1);
		}
		return var3 == null ? null : var3;
	}
}
