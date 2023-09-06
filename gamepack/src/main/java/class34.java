public class class34 {
	boolean field492;
	boolean field496;
	class264 field483;
	class264 field489;
	class264 field491;
	class264[] field487;
	class264[] field488;
	float[][] field485;
	float[][] field490;
	float[][] field493;
	float[][] field495;
	final class264[] field486;
	public class34 field494;
	public final int field484;

	public class34(int var1, class42 var2, boolean var3) {
		this.field489 = new class264();
		this.field492 = true;
		this.field491 = new class264();
		this.field496 = true;
		this.field483 = new class264();
		this.field484 = var2.method280();
		this.field486 = new class264[var1];
		this.field487 = new class264[this.field486.length];
		this.field488 = new class264[this.field486.length];
		this.field485 = new float[this.field486.length][3];

		for (int var4 = 0; var4 < this.field486.length; ++var4) {
			this.field486[var4] = new class264(var2, var3);
			this.field485[var4][0] = var2.method284();
			this.field485[var4][1] = var2.method284();
			this.field485[var4][2] = var2.method284();
		}

		this.method227();
	}

	void method227() {
		this.field493 = new float[this.field486.length][3];
		this.field490 = new float[this.field486.length][3];
		this.field495 = new float[this.field486.length][3];
		class264 var2;
		synchronized(class264.field2387) {
			if (class514.field4192 == 0) {
				var2 = new class264();
			} else {
				class264.field2387[--class514.field4192].method1523();
				var2 = class264.field2387[class514.field4192];
			}
		}

		class264 var3 = var2;

		for (int var4 = 0; var4 < this.field486.length; ++var4) {
			class264 var5 = this.method237(var4);
			var3.method1530(var5);
			var3.method1535();
			this.field493[var4] = var3.method1522();
			this.field490[var4][0] = var5.field2388[12];
			this.field490[var4][1] = var5.field2388[13];
			this.field490[var4][2] = var5.field2388[14];
			this.field495[var4] = var5.method1529();
		}

		var3.method1532();
	}

	class264 method237(int var1) {
		return this.field486[var1];
	}

	class264 method229(int var1) {
		if (this.field487[var1] == null) {
			this.field487[var1] = new class264(this.method237(var1));
			if (null != this.field494) {
				this.field487[var1].method1533(this.field494.method229(var1));
			} else {
				this.field487[var1].method1533(class264.field2389);
			}
		}

		return this.field487[var1];
	}

	class264 method236(int var1) {
		if (this.field488[var1] == null) {
			this.field488[var1] = new class264(this.method229(var1));
			this.field488[var1].method1535();
		}

		return this.field488[var1];
	}

	void method230(class264 var1) {
		this.field489.method1530(var1);
		this.field492 = true;
		this.field496 = true;
	}

	class264 method231() {
		return this.field489;
	}

	class264 method232() {
		if (this.field492) {
			this.field491.method1530(this.method231());
			if (null != this.field494) {
				this.field491.method1533(this.field494.method232());
			}

			this.field492 = false;
		}

		return this.field491;
	}

	public class264 method228(int var1) {
		if (this.field496) {
			this.field483.method1530(this.method236(var1));
			this.field483.method1533(this.method232());
			this.field496 = false;
		}

		return this.field483;
	}

	float[] method233(int var1) {
		return this.field493[var1];
	}

	float[] method234(int var1) {
		return this.field490[var1];
	}

	float[] method235(int var1) {
		return this.field495[var1];
	}

	public static int method238(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
