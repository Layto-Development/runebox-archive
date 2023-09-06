public class class47 {
	static int field542;
	static int field544;
	int field543;
	int field545;

	class47(int var1, int var2) {
		this.field545 = var1;
		this.field543 = var2;
	}

	boolean method351(class68 var1) {
		if (null == var1) {
			return false;
		} else {
			switch(this.field545) {
			case 1:
				return var1.method498(this.field543);
			case 2:
				return var1.method496(this.field543);
			case 3:
				return var1.method497((char)this.field543);
			case 4:
				return var1.method499(this.field543 == 1);
			default:
				return false;
			}
		}
	}

	static final int method352(int var0, int var1, int var2, int var3) {
		return var2 * var0 + var1 * var3 >> 16;
	}

	static class445 method350(int var0) {
		return (class445)class41.field521.method2543((long)var0);
	}
}
