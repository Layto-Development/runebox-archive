import java.util.ArrayList;
import java.util.Iterator;

public class class295 {
	static long field2730;
	static final class295 field2727;
	static final class295 field2729;
	final int field2728;

	static {
		field2727 = new class295(0);
		field2729 = new class295(1);
	}

	class295(int var1) {
		this.field2728 = var1;
	}

	static void method1678(ArrayList var0, boolean var1) {
		if (!var1) {
			class92.field904.clear();
		}

		Iterator var3 = var0.iterator();

		while (var3.hasNext()) {
			class104 var4 = (class104)var3.next();
			if (var4.field1026 != -1 && var4.field1027 != -1) {
				if (!var1) {
					class92.field904.add(var4);
				}

				class92.field910.add(var4);
			}
		}

	}

	public static void method1677(int var0, int var1, int var2, int var3) {
		class92.field907 = var0;
		class92.field908 = var1;
		class92.field909 = var2;
		class92.field900 = var3;
	}

	public static String method1679(char var0, int var1) {
		char[] var3 = new char[var1];

		for (int var4 = 0; var4 < var1; ++var4) {
			var3[var4] = var0;
		}

		return new String(var3);
	}

	static void method1680(int var0) {
		Client.field233 = 0L;
		if (var0 >= 2) {
			Client.field234 = true;
		} else {
			Client.field234 = false;
		}

		if (class185.method1022() == 1) {
			class466.field3999.method942(765, 503);
		} else {
			class466.field3999.method942(7680, 2160);
		}

		if (Client.field87 >= 25) {
			class445.method2232();
		}

	}
}
