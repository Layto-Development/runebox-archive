public class class402 {

	static byte[][] field3177;

	public int field3174;

	public int field3175;

	public int field3176;

	public class402(int var1, int var2, int var3) {
		this.field3175 = var1;
		this.field3174 = var2;
		this.field3176 = var3;
	}

	public class402(class402 var1) {
		this.field3175 = var1.field3175;
		this.field3174 = var1.field3174;
		this.field3176 = var1.field3176;
	}

	public class402(int var1) {
		if (var1 == -1) {
			this.field3175 = -1;
		} else {
			this.field3175 = var1 >> 28 & 3;
			this.field3174 = var1 >> 14 & 16383;
			this.field3176 = var1 & 16383;
		}
	}

	public int method2063() {
		int var3 = this.field3175;
		int var4 = this.field3174;
		int var5 = this.field3176;
		int var2 = var3 << 28 | var4 << 14 | var5;
		return var2;
	}

	@Override
	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof class402) ? false : this.method2061((class402) var1);
		}
	}

	boolean method2061(class402 var1) {
		if (var1.field3175 != this.field3175) {
			return false;
		} else if (this.field3174 != var1.field3174) {
			return false;
		} else {
			return var1.field3176 == this.field3176;
		}
	}

	@Override
	public int hashCode() {
		return this.method2063();
	}

	@Override
	public String toString() {
		return this.method2062(",");
	}

	String method2062(String var1) {
		return this.field3175 + var1 + (this.field3174 >> 6) + var1 + (this.field3176 >> 6) + var1 + (this.field3174 & 63) + var1 + (this.field3176 & 63);
	}
}
