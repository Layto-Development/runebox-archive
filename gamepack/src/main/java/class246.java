import java.util.Arrays;

public class class246 {

	public static final class246 field2090;

	static final class246 field2088;

	static final class246 field2089;

	static final class246 field2091;

	static final class246 field2093;

	static final class246 field2094;

	static final class246 field2095;

	static final class246[] field2096;

	final int field2098;

	public final int field2092;

	public final int field2097;

	static {
		field2091 = new class246(6, 8, 8);
		field2089 = new class246(3, 16, 16);
		field2090 = new class246(0, 32, 32);
		field2088 = new class246(2, 48, 48);
		field2095 = new class246(4, 64, 64);
		field2093 = new class246(5, 96, 96);
		field2094 = new class246(1, 128, 128);
		field2096 = method1430();
		Arrays.sort(field2096, new class501());
	}

	class246(int var1, int var2, int var3) {
		this.field2098 = var1;
		this.field2092 = var2;
		this.field2097 = var3;
	}

	int method1429() {
		return this.field2097 * this.field2092;
	}

	static class246[] method1430() {
		return new class246[] { field2090, field2094, field2088, field2089, field2095, field2093, field2091 };
	}
}
