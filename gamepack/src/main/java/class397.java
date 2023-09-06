public class class397 implements class367 {
	static final class397 field3329;
	static final class397 field3330;
	static final class397 field3331;
	static final class397 field3333;
	static final class397 field3334;
	static final class397 field3335;
	static final class397 field3336;
	static final class397 field3337;
	static final class397 field3338;
	static final class397 field3339;
	static final class397 field3340;
	static final class397 field3341;
	static final class397 field3342;
	static final class397 field3343;
	static final class397 field3344;
	static final class397 field3345;
	static final class397 field3349;
	final int field3346;
	public final boolean field3332;
	public final boolean field3348;
	public final int field3347;

	static {
		field3333 = new class397(0, -1, true, false, true);
		field3330 = new class397(1, 0, true, true, true);
		field3331 = new class397(2, 1, true, true, false);
		field3336 = new class397(3, 2, false, false, true);
		field3349 = new class397(4, 3, false, false, true);
		field3334 = new class397(5, 10, false, false, true);
		field3339 = new class397(6, 22, false, false, true);
		field3342 = new class397(7, 41, false, false, true);
		field3337 = new class397(8, 42, false, false, true);
		field3338 = new class397(9, 43, false, false, true);
		field3335 = new class397(10, 44, false, false, true);
		field3340 = new class397(11, 45, false, false, true);
		field3341 = new class397(12, 46, false, false, true);
		field3329 = new class397(13, 47, false, false, true);
		field3343 = new class397(14, 48, false, false, true);
		field3344 = new class397(15, 49, false, false, true);
		field3345 = new class397(16, 52, false, false, true);
	}

	class397(int var1, int var2, boolean var3, boolean var4, boolean var5) {
		this.field3346 = var1;
		this.field3347 = var2;
		this.field3348 = var4;
		this.field3332 = var5;
	}

	public int method1970() {
		return this.field3346;
	}

	public static synchronized void method2074(byte[] var0) {
		if (var0.length == 100 && class312.field2818 < class312.field2806) {
			class312.field2814[++class312.field2818 - 1] = var0;
		} else if (var0.length == 5000 && class312.field2808 < class312.field2811) {
			class312.field2815[++class312.field2808 - 1] = var0;
		} else if (var0.length == 10000 && class312.field2809 < class312.field2807) {
			class312.field2816[++class312.field2809 - 1] = var0;
		} else if (var0.length == 30000 && class312.field2810 < class312.field2813) {
			class312.field2817[++class312.field2810 - 1] = var0;
		} else {
			if (null != class258.field2367) {
				for (int var2 = 0; var2 < class483.field4097.length; ++var2) {
					if (class483.field4097[var2] == var0.length && class63.field804[var2] < class258.field2367[var2].length) {
						class258.field2367[var2][class63.field804[var2]++] = var0;
						return;
					}
				}
			}

		}
	}

	static final int method2073() {
		float var1 = 200.0F * ((float)class176.field1701.method2511() - 0.5F);
		return 100 - Math.round(var1);
	}
}
