import java.security.SecureRandom;

public final class class402 extends class480 {
	static SecureRandom field3381;
	boolean field3379;
	class393 field3376;
	int field3371;
	int field3372;
	int field3373;
	int field3374;
	int field3375;
	int field3377;
	int field3378;
	int field3380;

	class402(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field3377 = 0;
		this.field3378 = 0;
		this.field3379 = false;
		this.field3380 = var1;
		this.field3373 = var2;
		this.field3374 = var3;
		this.field3375 = var4;
		this.field3371 = var5;
		this.field3372 = var7 + var6;
		int var8 = class63.method481(this.field3380).field3417;
		if (var8 != -1) {
			this.field3379 = false;
			this.field3376 = class114.method702(var8);
		} else {
			this.field3379 = true;
		}

	}

	final void method2082(int var1) {
		if (!this.field3379) {
			this.field3378 += var1;
			if (!this.field3376.method2062()) {
				while (this.field3378 > this.field3376.field3307[this.field3377]) {
					this.field3378 -= this.field3376.field3307[this.field3377];
					++this.field3377;
					if (this.field3377 >= this.field3376.field3296.length) {
						this.field3379 = true;
						break;
					}
				}
			} else {
				this.field3377 += var1;
				if (this.field3377 >= this.field3376.method2059()) {
					this.field3379 = true;
				}
			}

		}
	}

	protected final class250 method2393() {
		class409 var2 = class63.method481(this.field3380);
		class250 var3;
		if (!this.field3379) {
			var3 = var2.method2106(this.field3377);
		} else {
			var3 = var2.method2106(-1);
		}

		return var3 == null ? null : var3;
	}
}
