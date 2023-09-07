import java.util.ArrayList;
import java.util.Iterator;

public class class328 {

	static long field2535;

	static final class328 field2532;

	static final class328 field2534;

	final int field2533;

	static {
		field2532 = new class328(0);
		field2534 = new class328(1);
	}

	class328(int var1) {
		this.field2533 = var1;
	}

	static void method1728(ArrayList var0, boolean var1) {
		if (!var1) {
			class388.field3091.clear();
		}
		Iterator var3 = var0.iterator();
		while (var3.hasNext()) {
			class490 var4 = (class490) var3.next();
			if (var4.field3950 != -1 && var4.field3951 != -1) {
				if (!var1) {
					class388.field3091.add(var4);
				}
				class388.field3097.add(var4);
			}
		}
	}

	static void method1729(int var0) {
		Client.field1128 = 0L;
		if (var0 >= 2) {
			Client.field1129 = true;
		} else {
			Client.field1129 = false;
		}
		if (Client.method531() == 1) {
			class501.field4023.method2522(765, 503);
		} else {
			class501.field4023.method2522(7680, 2160);
		}
		if (Client.field982 >= 25) {
			Client.method469();
		}
	}
}
