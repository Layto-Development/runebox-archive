import java.net.MalformedURLException;
import java.net.URL;

public final class class353 extends class462 {
	static int field3015;
	int field3014;
	int field3016;
	int field3017;
	int field3018;
	int field3019;
	int field3020;
	int field3021;
	int field3022;
	int field3023;
	int field3024;
	int field3025;
	int field3026;
	int field3027;
	int field3028;

	class353() {
		this.field3024 = 31;
		this.field3025 = 0;
		this.field3026 = -1;
	}

	void method1923(int var1) {
		this.field3024 = var1;
	}

	boolean method1924(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field3024 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	public static final void method1925(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				class152.method875(var0 - 1L);
				class152.method875(1L);
			} else {
				class152.method875(var0);
			}

		}
	}

	static boolean method1927(String var0) {
		if (null == var0) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var3) {
				return false;
			}
		}
	}

	static final void method1926(boolean var0) {
		if (var0) {
			Client.field253 = class116.field1107 ? class196.field1788 : class196.field1787;
		} else {
			Client.field253 = class176.field1701.method2505(class116.field1110) ? class196.field1791 : class196.field1794;
		}

	}
}
