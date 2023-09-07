import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class498 extends class277 {

	HashSet field3995;

	HashSet field3996;

	List field3997;

	class498() {
	}

	void method2379(class187 var1, class187 var2, int var3, boolean var4) {
		this.method1533(var1, var3);
		int var6 = var2.method1145();
		this.field3995 = new HashSet(var6);
		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			class316 var8 = new class316();
			try {
				var8.method1696(var2);
			} catch (IllegalStateException var12) {
				continue;
			}
			this.field3995.add(var8);
		}
		var7 = var2.method1145();
		this.field3996 = new HashSet(var7);
		for (int var13 = 0; var13 < var7; ++var13) {
			class381 var9 = new class381();
			try {
				var9.method2007(var2);
			} catch (IllegalStateException var11) {
				continue;
			}
			this.field3996.add(var9);
		}
		this.method2378(var2, var4);
	}

	void method2378(class187 var1, boolean var2) {
		this.field3997 = new LinkedList();
		int var4 = var1.method1145();
		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method1144();
			class402 var7 = new class402(var1.method1100());
			boolean var8 = var1.method1096() == 1;
			if (var2 || !var8) {
				this.field3997.add(new class130((class402) null, var7, var6, (class245) null));
			}
		}
	}

	static void method2381(boolean var0) {
		if (!class501.field4023.method407() && !class501.field4023.method408() && !class501.field4023.method430((byte) 116)) {
			class174.field1733 = class55.field529;
			class174.field1731 = class55.field530;
			class174.field1732 = class55.field492;
			class174.method1030(2);
			if (var0) {
				class174.field1735 = "";
			}
			if (null == class174.field1742 || class174.field1742.length() <= 0) {
				if (class83.field841.method1012() != null) {
					class174.field1742 = class83.field841.method1012();
					Client.field952 = true;
				} else {
					Client.field952 = false;
				}
			}
			class174.method1036();
		} else {
			class174.method1030(10);
		}
	}

	static void method2380(boolean var0) {
		byte var2 = 0;
		boolean var3 = class83.field841.method1013() >= Client.field903;
		if (!var3) {
			var2 = 12;
		} else if (class501.field4023.method407() || class501.field4023.method408() || class501.field4023.method430((byte) 106)) {
			var2 = 10;
		}
		class174.method1030(var2);
		if (var0) {
			class174.field1742 = "";
			class174.field1735 = "";
			class327.field2531 = 0;
			class60.field648 = "";
		}
		if (null == class174.field1742 || class174.field1742.length() <= 0) {
			if (class83.field841.method1012() != null) {
				class174.field1742 = class83.field841.method1012();
				Client.field952 = true;
			} else {
				Client.field952 = false;
			}
		}
		if (Client.field952 && class174.field1742 != null && class174.field1742.length() > 0) {
			class174.field1740 = 1;
		} else {
			class174.field1740 = 0;
		}
	}
}
