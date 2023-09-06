import java.util.concurrent.Future;

public class class454 {
	protected static String field3961;
	static class123 field3963;
	String field3962;
	Future field3964;

	class454(Future var1) {
		this.field3964 = var1;
	}

	class454(String var1) {
		this.method2255(var1);
	}

	void method2255(String var1) {
		if (null == var1) {
			var1 = "";
		}

		this.field3962 = var1;
		if (null != this.field3964) {
			this.field3964.cancel(true);
			this.field3964 = null;
		}

	}

	public final String method2259() {
		return this.field3962;
	}

	public boolean method2257() {
		return null != this.field3962 || this.field3964 == null;
	}

	public final boolean method2256() {
		return this.method2257() ? true : this.field3964.isDone();
	}

	public final class4 method2258() {
		if (this.method2257()) {
			return new class4(this.field3962);
		} else if (!this.method2256()) {
			return null;
		} else {
			try {
				return (class4)this.field3964.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method2255(var3);
				return new class4(var3);
			}
		}
	}

	public static void method2263() {
		class87.field873.method1584(5);
	}

	static class12 method2261() {
		class12.field365 = 0;
		return class285.method1627();
	}

	static void method2260() {
		class240.field2210 = System.getenv("JX_ACCESS_TOKEN");
		class148.field1398 = System.getenv("JX_REFRESH_TOKEN");
		class248.field2237 = System.getenv("JX_SESSION_ID");
		class20.field437 = System.getenv("JX_CHARACTER_ID");
		class247.method1440(System.getenv("JX_DISPLAY_NAME"));
	}

	static final int method2262(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (class38.field513[1][var4][var5] & 2) == 2) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = class38.field511[var6][var4 + 1][var5] * var7 + (128 - var7) * class38.field511[var6][var4][var5] >> 7;
			int var10 = (128 - var7) * class38.field511[var6][var4][var5 + 1] + class38.field511[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return var10 * var8 + (128 - var8) * var9 >> 7;
		} else {
			return 0;
		}
	}
}
