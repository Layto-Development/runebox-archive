import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "kv")
public class class85 extends class305 {
	@ObfInfo(name = "al", desc = "Ljava/util/HashSet;")
	HashSet field877;
	@ObfInfo(name = "an", desc = "Ljava/util/HashSet;")
	HashSet field878;
	@ObfInfo(name = "ar", desc = "Ljava/util/List;")
	List field879;

	@ObfInfo(name = "<init>", desc = "()V")
	class85() {
	}

	@ObfInfo(name = "cu", desc = "(Ltm;Ltm;IZI)V", opaqueValue = "-469426427")
	void method562(class280 var1, class280 var2, int var3, boolean var4) {
		this.method1686(var1, var3);
		int var6 = var2.method1541();
		this.field877 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			class81 var8 = new class81();

			try {
				var8.method533(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field877.add(var8);
		}

		var7 = var2.method1541();
		this.field878 = new HashSet(var7);

		for (int var13 = 0; var13 < var7; ++var13) {
			class88 var9 = new class88();

			try {
				var9.method566(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field878.add(var9);
		}

		this.method561(var2, var4);
	}

	@ObfInfo(name = "ch", desc = "(Ltm;ZB)V", opaqueValue = "3")
	void method561(class280 var1, boolean var2) {
		this.field879 = new LinkedList();
		int var4 = var1.method1541();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method1540();
			class50 var7 = new class50(var1.method1496());
			boolean var8 = var1.method1492() == 1;
			if (var2 || !var8) {
				this.field879.add(new class169((class50)null, var7, var6, (class465)null));
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(ZI)V", opaqueValue = "1987249140")
	static void method564(boolean var0) {
		if (!class51.field585.method88() && !class51.field585.method89() && !class51.field585.method111((byte)116)) {
			class162.field1535 = class453.field3607;
			class162.field1533 = class453.field3608;
			class162.field1534 = class453.field3570;
			class162.method924(2);
			if (var0) {
				class162.field1537 = "";
			}

			if (null == class162.field1544 || class162.field1544.length() <= 0) {
				if (class281.field2262.method1757() != null) {
					class162.field1544 = class281.field2262.method1757();
					Client.field81 = true;
				} else {
					Client.field81 = false;
				}
			}

			class162.method930();
		} else {
			class162.method924(10);
		}
	}

	@ObfInfo(name = "al", desc = "(ZB)V", opaqueValue = "79")
	static void method563(boolean var0) {
		byte var2 = 0;
		boolean var3 = class281.field2262.method1758() >= Client.field32;
		if (!var3) {
			var2 = 12;
		} else if (class51.field585.method88() || class51.field585.method89() || class51.field585.method111((byte)106)) {
			var2 = 10;
		}

		class162.method924(var2);
		if (var0) {
			class162.field1544 = "";
			class162.field1537 = "";
			class473.field3808 = 0;
			class379.field2919 = "";
		}

		if (null == class162.field1544 || class162.field1544.length() <= 0) {
			if (class281.field2262.method1757() != null) {
				class162.field1544 = class281.field2262.method1757();
				Client.field81 = true;
			} else {
				Client.field81 = false;
			}
		}

		if (Client.field81 && class162.field1544 != null && class162.field1544.length() > 0) {
			class162.field1542 = 1;
		} else {
			class162.field1542 = 0;
		}

	}
}
