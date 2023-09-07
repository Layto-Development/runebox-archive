public class class439 {

	static class214[] field3441;

	static int field3437;

	class338 field3438;

	class338 field3440;

	class535 field3439;

	public class439(class338 var1, class338 var2) {
		new class535(256);
		this.field3439 = new class535(256);
		this.field3440 = var1;
		this.field3438 = var2;
	}

	class529 method2191(int var1, int var2, int[] var3) {
		long var5 = this.method2195(var1, var2, false);
		class124 var7 = (class124) this.field3439.method2582(var5);
		if (null != var7) {
			return var7.method848();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			class487 var8 = class487.method2346(this.field3440, var1, var2);
			if (null == var8) {
				return null;
			} else {
				class529 var9 = var8.method2344();
				this.field3439.method2585(new class124(var9), var5);
				if (var3 != null) {
					var3[0] -= var9.field4188.length;
				}
				return var9;
			}
		}
	}

	class124 method2190(int var1, int var2) {
		long var4 = this.method2195(var1, var2, true);
		class124 var6 = (class124) this.field3439.method2582(var4);
		if (var6 != null) {
			return var6;
		} else {
			class97 var7 = class97.method616(this.field3438, var1, var2);
			if (var7 == null) {
				return new class124();
			} else {
				class124 var8 = new class124(var7);
				this.field3439.method2585(var8, var4);
				return var8;
			}
		}
	}

	class529 method2192(int var1, int[] var2) {
		if (this.field3440.method1774() == 1) {
			return this.method2191(0, var1, var2);
		} else if (this.field3440.method1788(var1) == 1) {
			return this.method2191(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public class124 method2193(int var1) {
		if (this.field3438.method1774() == 1) {
			return this.method2190(0, var1);
		} else if (this.field3438.method1788(var1) == 1) {
			return this.method2190(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public class529 method2194(int var1) {
		return this.method2192(var1, (int[]) null);
	}

	long method2195(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? (long) var5 ^ 4294967296L : (long) var5;
	}
}
