public class class316 extends class87 {

	class316() {
	}

	void method1696(class187 var1) {
		int var3 = var1.method1096();
		if (var3 != class282.field2288.field2290) {
			throw new IllegalStateException("");
		} else {
			super.field862 = var1.method1096();
			super.field863 = var1.method1096();
			super.field867 = var1.method1145();
			super.field865 = var1.method1145();
			super.field861 = var1.method1145();
			super.field868 = var1.method1145();
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
		if (class328.field2532.field2533 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method1096();
			int var5 = var1.method1096();
			if (var4 == super.field861 && var5 == super.field868) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method394(var6, var7, var1);
					}
				}
			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class316)) {
			return false;
		} else {
			class316 var2 = (class316) var1;
			return super.field861 == var2.field861 && super.field868 == var2.field868;
		}
	}

	@Override
	public int hashCode() {
		return super.field861 | super.field868 << 8;
	}
}
