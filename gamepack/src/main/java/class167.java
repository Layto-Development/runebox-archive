import java.util.ArrayList;
import java.util.Iterator;

public class class167 extends class218 {
	static class344 field1619;
	class526[] field1628;
	int field1623;
	int field1625;
	int field1626;
	int field1627;
	int[] field1620;
	int[] field1621;
	String field1624;
	String[] field1622;

	static {
		field1619 = new class344(128);
	}

	class167() {
	}

	class526[] method922(int var1) {
		return new class526[var1];
	}

	public static void method924(int var0, int var1) {
		class295.method1677(var0, var1, 0, 0);
		class92.field904.clear();
		class92.field905.clear();
		if (class92.field903.isEmpty() || var0 == 0 && var1 == 0) {
			class312.method1747();
		} else {
			class92.field905.add(new class495((class232)null, class92.field907));
			class92.field905.add(new class16((class232)null, 0, false, class92.field908));
			ArrayList var4 = new ArrayList();
			Iterator var5 = class92.field903.iterator();

			while (var5.hasNext()) {
				class104 var6 = (class104)var5.next();
				var4.add(var6);
			}

			class92.field905.add(new class99((class232)null, var4));
		}

	}

	static final void method923(int var0) {
		class124.method763();
		switch(var0) {
		case 1:
			class327.method1833();
			break;
		case 2:
			class337.method1864(24);
			class174.method993(class433.field3770, class433.field3771, class433.field3772);
		}

	}
}
