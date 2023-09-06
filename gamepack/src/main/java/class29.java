public class class29 {
	static byte[][] field463;
	public int field460;
	public int field461;
	public int field462;

	public class29(int var1, int var2, int var3) {
		this.field461 = var1;
		this.field460 = var2;
		this.field462 = var3;
	}

	public class29(class29 var1) {
		this.field461 = var1.field461;
		this.field460 = var1.field460;
		this.field462 = var1.field462;
	}

	public class29(int var1) {
		if (var1 == -1) {
			this.field461 = -1;
		} else {
			this.field461 = var1 >> 28 & 3;
			this.field460 = var1 >> 14 & 16383;
			this.field462 = var1 & 16383;
		}

	}

	public int method213() {
		int var3 = this.field461;
		int var4 = this.field460;
		int var5 = this.field462;
		int var2 = var3 << 28 | var4 << 14 | var5;
		return var2;
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof class29) ? false : this.method211((class29)var1);
		}
	}

	boolean method211(class29 var1) {
		if (var1.field461 != this.field461) {
			return false;
		} else if (this.field460 != var1.field460) {
			return false;
		} else {
			return var1.field462 == this.field462;
		}
	}

	public int hashCode() {
		return this.method213();
	}

	public String toString() {
		return this.method212(",");
	}

	String method212(String var1) {
		return this.field461 + var1 + (this.field460 >> 6) + var1 + (this.field462 >> 6) + var1 + (this.field460 & 63) + var1 + (this.field462 & 63);
	}
}
