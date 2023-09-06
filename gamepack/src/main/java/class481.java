public class class481 {
	static byte[] field4092;
	static class379 field4095;
	static class394[] field4083;
	static class42 field4082;
	static class42[] field4093;
	static int field4081;
	static int field4085;
	static int field4087;
	static int field4091;
	static int[] field4084;
	static int[] field4086;
	static int[] field4088;
	static int[] field4089;
	static int[] field4090;
	static int[] field4094;

	static {
		field4092 = new byte[2048];
		field4083 = new class394[2048];
		field4093 = new class42[2048];
		field4085 = 0;
		field4086 = new int[2048];
		field4087 = 0;
		field4094 = new int[2048];
		field4088 = new int[2048];
		field4089 = new int[2048];
		field4090 = new int[2048];
		field4091 = 0;
		field4084 = new int[2048];
		field4082 = new class42(new byte[5000]);
	}

	class481() throws Throwable {
	}

	public static class63 method2396(int var0) {
		class63 var2 = (class63)class63.field807.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class63.field806.method1212(34, var0);
			var2 = new class63();
			if (var3 != null) {
				var2.method477(new class42(var3));
			}

			var2.method476();
			class63.field807.method1889(var2, (long)var0);
			return var2;
		}
	}

	public static final void method2397() {
		class277.field2457 = false;
		class277.field2460 = 0;
	}
}
