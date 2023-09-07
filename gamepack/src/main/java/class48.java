public final class class48 {

	static long field234;

	class48() throws Throwable {
	}

	public static final synchronized long method197() {
		long var1 = System.currentTimeMillis();
		if (var1 < field234) {
			class26.field126 += field234 - var1;
		}
		field234 = var1;
		return var1 + class26.field126;
	}
}
