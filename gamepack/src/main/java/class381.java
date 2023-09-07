public class class381 extends class87 {

	int field3072;

	int field3073;

	int field3074;

	int field3075;

	class381() {
	}

	void method2007(class187 var1) {
		int var3 = var1.method1096();
		if (class282.field2289.field2290 != var3) {
			throw new IllegalStateException("");
		} else {
			super.field862 = var1.method1096();
			super.field863 = var1.method1096();
			super.field867 = var1.method1145();
			super.field865 = var1.method1145();
			this.field3073 = var1.method1096();
			this.field3074 = var1.method1096();
			super.field861 = var1.method1145();
			super.field868 = var1.method1145();
			this.field3072 = var1.method1096();
			this.field3075 = var1.method1096();
			super.field869 = var1.method1144();
			super.field859 = var1.method1144();
		}
	}

	@Override
	void method392(class187 var1) {
		super.field863 = Math.min(super.field863, 4);
		super.field866 = new short[1][64][64];
		super.field864 = new short[super.field863][64][64];
		super.field873 = new byte[super.field863][64][64];
		super.field860 = new byte[super.field863][64][64];
		super.field870 = new class133[super.field863][64][64][];
		int var3 = var1.method1096();
		if (class328.field2534.field2533 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method1096();
			int var5 = var1.method1096();
			int var6 = var1.method1096();
			int var7 = var1.method1096();
			if (super.field861 == var4 && var5 == super.field868 && var6 == this.field3072 && this.field3075 == var7) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method394(var8 + this.field3072 * 8, var9 + this.field3075 * 8, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class381)) {
			return false;
		} else {
			class381 var2 = (class381) var1;
			if (super.field861 == var2.field861 && var2.field868 == super.field868) {
				return var2.field3072 == this.field3072 && this.field3075 == var2.field3075;
			} else {
				return false;
			}
		}
	}

	@Override
	public int hashCode() {
		return super.field861 | super.field868 << 8 | this.field3072 << 16 | this.field3075 << 24;
	}

	int method2010() {
		return this.field3073;
	}

	int method2011() {
		return this.field3074;
	}

	int method2009() {
		return this.field3072;
	}

	int method2008() {
		return this.field3075;
	}
}
