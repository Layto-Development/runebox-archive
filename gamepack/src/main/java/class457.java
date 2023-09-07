public class class457 extends class77 {

	public static class354[][] field3488;

	static class457[] field3485;

	static class507 field3489;

	static int field3486;

	public class483 field3482;

	public class515 field3487;

	public int field3483;

	public int field3484;

	static {
		field3485 = new class457[300];
		field3486 = 0;
	}

	class457() {
	}

	public void method2235() {
		if (field3486 < field3485.length) {
			field3485[++field3486 - 1] = this;
		}
	}

	public static class457 method2237(class483 var0, class504 var1) {
		class457 var3 = class400.method2060((byte) -1);
		var3.field3482 = var0;
		var3.field3483 = var0.field3860;
		if (var3.field3483 == -1) {
			var3.field3487 = new class515(260);
		} else if (var3.field3483 == -2) {
			var3.field3487 = new class515(10000);
		} else if (var3.field3483 <= 18) {
			var3.field3487 = new class515(20);
		} else if (var3.field3483 <= 98) {
			var3.field3487 = new class515(100);
		} else {
			var3.field3487 = new class515(260);
		}
		var3.field3487.method2482(var1);
		var3.field3487.method2484(var3.field3482.field3809);
		var3.field3484 = 0;
		return var3;
	}

	public static int method2236(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
