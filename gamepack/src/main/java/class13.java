import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class class13 extends class480 {
	int field376;
	int field377;
	int field378;

	class13() {
		this.field378 = 31;
	}

	void method121(int var1) {
		this.field378 = var1;
	}

	boolean method120(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field378 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	protected final class250 method2393() {
		return class67.method492(this.field376).method1185(this.field377);
	}

	public static final class337 method123(class302 var0, int var1, int var2) {
		if (class337.field2934 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				class337 var4 = class400.field3354.method1746();
				var4.field2939 = new int[256 * (class337.field2949 ? 2 : 1)];
				var4.field2944 = var2;
				var4.method1865();
				var4.field2943 = 1024 + (var2 & -1024);
				if (var4.field2943 > 16384) {
					var4.field2943 = 16384;
				}

				var4.method1858(var4.field2943);
				if (class337.field2937 > 0 && null == class306.field2774) {
					class306.field2774 = new class474();
					class337.field2936 = Executors.newScheduledThreadPool(1);
					class337.field2936.scheduleAtFixedRate(class306.field2774, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class306.field2774 != null) {
					if (null != class306.field2774.field4031[var1]) {
						throw new IllegalArgumentException();
					}

					class306.field2774.field4031[var1] = var4;
				}

				return var4;
			} catch (Throwable var5) {
				return new class337();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
