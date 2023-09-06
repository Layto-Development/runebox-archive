import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class143 extends class8 {
	HashSet field1367;
	HashSet field1368;
	List field1369;

	class143() {
	}

	void method845(class42 var1, class42 var2, int var3, boolean var4) {
		this.method66(var1, var3);
		int var6 = var2.method327();
		this.field1367 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			class152 var8 = new class152();

			try {
				var8.method877(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field1367.add(var8);
		}

		var7 = var2.method327();
		this.field1368 = new HashSet(var7);

		for (int var13 = 0; var13 < var7; ++var13) {
			class418 var9 = new class418();

			try {
				var9.method2147(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field1368.add(var9);
		}

		this.method844(var2, var4);
	}

	void method844(class42 var1, boolean var2) {
		this.field1369 = new LinkedList();
		int var4 = var1.method327();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method326();
			class29 var7 = new class29(var1.method282());
			boolean var8 = var1.method278() == 1;
			if (var2 || !var8) {
				this.field1369.add(new class524((class29)null, var7, var6, (class197)null));
			}
		}

	}

	static void method847(boolean var0) {
		if (!class466.field3999.method7() && !class466.field3999.method8() && !class466.field3999.method30((byte)116)) {
			class116.field1101 = class433.field3750;
			class116.field1099 = class433.field3751;
			class116.field1100 = class433.field3713;
			class337.method1864(2);
			if (var0) {
				class116.field1103 = "";
			}

			if (null == class116.field1110 || class116.field1110.length() <= 0) {
				if (class176.field1701.method2500() != null) {
					class116.field1110 = class176.field1701.method2500();
					Client.field57 = true;
				} else {
					Client.field57 = false;
				}
			}

			class235.method1356();
		} else {
			class337.method1864(10);
		}
	}

	static void method846(boolean var0) {
		byte var2 = 0;
		boolean var3 = class176.field1701.method2501() >= Client.field8;
		if (!var3) {
			var2 = 12;
		} else if (class466.field3999.method7() || class466.field3999.method8() || class466.field3999.method30((byte)106)) {
			var2 = 10;
		}

		class337.method1864(var2);
		if (var0) {
			class116.field1110 = "";
			class116.field1103 = "";
			class242.field2213 = 0;
			class110.field1061 = "";
		}

		if (null == class116.field1110 || class116.field1110.length() <= 0) {
			if (class176.field1701.method2500() != null) {
				class116.field1110 = class176.field1701.method2500();
				Client.field57 = true;
			} else {
				Client.field57 = false;
			}
		}

		if (Client.field57 && class116.field1110 != null && class116.field1110.length() > 0) {
			class116.field1108 = 1;
		} else {
			class116.field1108 = 0;
		}

	}
}
