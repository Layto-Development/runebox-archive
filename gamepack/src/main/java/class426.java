import java.io.IOException;
import java.util.concurrent.Callable;

public class class426 implements Callable {
	final class503 field3523;
	// $FF: synthetic field
	final class57 this$0;

	class426(class57 var1, class503 var2) {
		this.this$0 = var1;
		this.field3523 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field3523.method2425()) {
				class353.method1925(10L);
			}
		} catch (IOException var2) {
			return new class4("Error servicing REST query: " + var2.getMessage());
		}

		return this.field3523.method2424();
	}

	public static void method2179() {
		class300.field2748.method1887();
	}

	static final int method2178(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - class133.field1289[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
	}

	static final void method2177(int var0) {
		if (class292.method1669(var0)) {
			class60[] var2 = class160.field1484[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				class60 var4 = var2[var3];
				if (null != var4) {
					var4.field774 = 0;
					var4.field775 = 0;
				}
			}

		}
	}
}
