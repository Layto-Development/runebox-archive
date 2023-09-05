import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;
import java.util.LinkedList;

@ObfInfo(name = "jf")
public class class305 {
	@ObfInfo(name = "op", desc = "I", intMultiplier = -1500772979)
	static int field2471;
	@ObfInfo(name = "ad", desc = "Z")
	boolean field2469;
	@ObfInfo(name = "ai", desc = "Lmc;")
	class50 field2464;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1612980305)
	int field2459;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1385317393)
	int field2461;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -57065415)
	int field2463;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -970396571)
	int field2465;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1879737221)
	int field2466;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1545324723)
	int field2467;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 318342769)
	int field2468;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field2460;
	@ObfInfo(name = "ao", desc = "Ljava/lang/String;")
	String field2462;
	@ObfInfo(name = "aq", desc = "Ljava/util/LinkedList;")
	LinkedList field2470;

	@ObfInfo(name = "<init>", desc = "()V")
	public class305() {
		this.field2468 = -1;
		this.field2466 = -1;
		this.field2463 = -1;
		this.field2464 = null;
		this.field2465 = Integer.MAX_VALUE;
		this.field2459 = 0;
		this.field2467 = Integer.MAX_VALUE;
		this.field2461 = 0;
		this.field2469 = false;
	}

	@ObfInfo(name = "au", desc = "(Ltm;IB)V", opaqueValue = "-1")
	public void method1686(class280 var1, int var2) {
		this.field2468 = var2;
		this.field2460 = var1.method1500();
		this.field2462 = var1.method1500();
		this.field2464 = new class50(var1.method1496());
		this.field2466 = var1.method1496();
		var1.method1492();
		this.field2469 = var1.method1492() == 1;
		this.field2463 = var1.method1492();
		int var4 = var1.method1492();
		this.field2470 = new LinkedList();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field2470.add(this.method1702(var1));
		}

		this.method1685();
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)Lkw;")
	class415 method1702(class280 var1) {
		int var3 = var1.method1492();
		class512[] var4 = new class512[]{class512.field4097, class512.field4099, class512.field4098, class512.field4104};
		class512 var5 = (class512)class216.method1198(var4, var3);
		Object var6 = null;
		switch(var5.field4100) {
		case 0:
			var6 = new class501();
			break;
		case 1:
			var6 = new class193();
			break;
		case 2:
			var6 = new class461();
			break;
		case 3:
			var6 = new class235();
			break;
		default:
			throw new IllegalStateException("");
		}

		((class415)var6).method2190(var1);
		return (class415)var6;
	}

	@ObfInfo(name = "ao", desc = "(IIII)Z", opaqueValue = "367578160")
	public boolean method1687(int var1, int var2, int var3) {
		Iterator var5 = this.field2470.iterator();

		class415 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (class415)var5.next();
		} while(!var6.method2188(var1, var2, var3));

		return true;
	}

	@ObfInfo(name = "at", desc = "(III)Z", opaqueValue = "770144654")
	public boolean method1690(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field2465 && var4 <= this.field2459) {
			if (var5 >= this.field2467 && var5 <= this.field2461) {
				Iterator var6 = this.field2470.iterator();

				class415 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (class415)var6.next();
				} while(!var7.method2189(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ac", desc = "(IIII)[I", opaqueValue = "1529858788")
	public int[] method1700(int var1, int var2, int var3) {
		Iterator var5 = this.field2470.iterator();

		class415 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class415)var5.next();
		} while(!var6.method2188(var1, var2, var3));

		return var6.method2191(var1, var2, var3);
	}

	@ObfInfo(name = "ai", desc = "(III)Lmc;", opaqueValue = "1667154997")
	public class50 method1688(int var1, int var2) {
		Iterator var4 = this.field2470.iterator();

		class415 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (class415)var4.next();
		} while(!var5.method2189(var1, var2));

		return var5.method2192(var1, var2);
	}

	@ObfInfo(name = "az", desc = "(I)V")
	void method1685() {
		Iterator var2 = this.field2470.iterator();

		while (var2.hasNext()) {
			class415 var3 = (class415)var2.next();
			var3.method2193(this);
		}

	}

	@ObfInfo(name = "ap", desc = "(I)I")
	public int method1696() {
		return this.field2468;
	}

	@ObfInfo(name = "aa", desc = "(I)Z")
	public boolean method1689() {
		return this.field2469;
	}

	@ObfInfo(name = "af", desc = "(B)Ljava/lang/String;")
	public String method1695() {
		return this.field2460;
	}

	@ObfInfo(name = "ad", desc = "(I)Ljava/lang/String;")
	public String method1691() {
		return this.field2462;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	int method1692() {
		return this.field2466;
	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method1693() {
		return this.field2463;
	}

	@ObfInfo(name = "an", desc = "(I)I")
	public int method1694() {
		return this.field2465;
	}

	@ObfInfo(name = "ar", desc = "(B)I")
	public int method1705() {
		return this.field2459;
	}

	@ObfInfo(name = "ab", desc = "(B)I")
	public int method1703() {
		return this.field2467;
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method1701() {
		return this.field2461;
	}

	@ObfInfo(name = "am", desc = "(I)I")
	public int method1704() {
		return this.field2464.field581;
	}

	@ObfInfo(name = "ax", desc = "(B)I")
	public int method1697() {
		return this.field2464.field582;
	}

	@ObfInfo(name = "ah", desc = "(B)I")
	public int method1698() {
		return this.field2464.field583;
	}

	@ObfInfo(name = "as", desc = "(I)Lmc;")
	public class50 method1699() {
		return new class50(this.field2464);
	}
}
