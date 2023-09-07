import java.util.ArrayList;

public class class81 extends class417 {

	static int field804;

	static String field802;

	int field803;

	// $FF: synthetic field
	final class400 this$0;

	class81(class400 var1) {
		this.this$0 = var1;
		this.field803 = -1;
	}

	@Override
	void method2095(class187 var1) {
		this.field803 = var1.method1145();
	}

	@Override
	void method2094(class518 var1) {
		var1.method2504(this.field803);
	}

	static void method328(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var6 = (Integer) var0.get(0);
			if (var6 == -1 && !Client.field1170) {
				class436.method2172(0, 0);
			} else if (var6 != -1 && !class388.method2017(var6) && class83.field841.method1001() != 0) {
				ArrayList var7 = new ArrayList();
				for (int var8 = 0; var8 < var0.size(); ++var8) {
					var7.add(new class490(class477.field3744, (Integer) var0.get(var8), 0, class83.field841.method1001(), false));
				}
				if (Client.field1170) {
					class388.field3091.clear();
					class388.field3091.addAll(var7);
					class388.method2021(var1, var2, var3, var4);
				} else {
					class388.method2015(var7, var1, var2, var3, var4, false);
				}
			}
		}
	}
}
