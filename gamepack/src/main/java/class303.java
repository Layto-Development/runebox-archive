import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "lz")
public class class303 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field2442;
	@ObfInfo(name = "ae", desc = "Lnu;")
	public static class437 field2443;
	@ObfInfo(name = "ao", desc = "Lnu;")
	public static class437 field2446;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -2000585249)
	public static int field2444;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1224914915)
	public static int field2451;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1284543169)
	public static int field2452;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 35504833)
	public static int field2453;
	@ObfInfo(name = "at", desc = "Ljava/util/ArrayList;")
	public static ArrayList field2445;
	@ObfInfo(name = "ai", desc = "Ljava/util/ArrayList;")
	public static ArrayList field2447;
	@ObfInfo(name = "az", desc = "Ljava/util/ArrayList;")
	public static ArrayList field2448;
	@ObfInfo(name = "ap", desc = "Ljava/util/ArrayList;")
	public static ArrayList field2449;
	@ObfInfo(name = "ac", desc = "Ljava/util/LinkedList;")
	public static LinkedList field2454;
	@ObfInfo(name = "aa", desc = "Ljava/util/List;")
	public static final List field2450;

	static {
		field2445 = null;
		field2454 = new LinkedList();
		field2447 = new ArrayList(3);
		field2448 = new ArrayList(3);
		field2449 = new ArrayList();
		field2450 = new ArrayList();
		field2451 = 0;
		field2452 = 0;
		field2453 = 0;
		field2444 = 0;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class303() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Llb;I)V")
	public static void method1680(class128 var0) {
		field2450.remove(var0);
	}

	@ObfInfo(name = "ae", desc = "(Ljava/util/ArrayList;IIIIZI)V")
	public static void method1677(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			field2454.clear();
			field2449.clear();
			method1681(var5);
			class343.method1880(var0, var5);
			if (!field2454.isEmpty()) {
				method1683(var1, var2, var3, var4);
				field2449.add(new class115((class236)null));
				field2449.add(new class191((class236)null, field2442, field2443, field2446));
				ArrayList var7 = new ArrayList();
				var7.add(new class404(new class206((class236)null, 0, true, field2444)));
				if (!field2447.isEmpty()) {
					ArrayList var8 = new ArrayList();
					var8.add(new class156(new class57((class236)null, var7), field2453));
					ArrayList var10 = new ArrayList();
					Iterator var11 = field2447.iterator();

					while (var11.hasNext()) {
						class503 var12 = (class503)var11.next();
						var10.add(var12);
					}

					var8.add(new class156(new class375(new class511((class236)null, var10), 0, false, field2452), field2451));
					field2449.add(new class57((class236)null, var8));
				} else {
					field2449.add(new class156((class236)null, field2453));
					field2449.add(new class57((class236)null, var7));
				}

			}
		}
	}

	@ObfInfo(name = "ac", desc = "(IIIIB)V")
	public static void method1678(int var0, int var1, int var2, int var3) {
		if (field2447.size() > 1 && field2447.get(0) != null && ((class503)field2447.get(0)).field4063.method809() && field2447.get(1) != null && ((class503)field2447.get(1)).field4063.method809()) {
			method1683(var0, var1, var2, var3);
			field2449.add(new class33((class236)null));
			ArrayList var5 = new ArrayList();
			var5.add(new class156(new class206((class236)null, 1, false, field2444), field2453));
			var5.add(new class156(new class375((class236)null, 0, false, field2452), field2451));
			field2449.add(new class57((class236)null, var5));
			if (field2448.get(0) != null && field2448.get(1) != null) {
				class503 var6 = (class503)field2448.get(0);
				field2448.set(0, field2447.get(1));
				field2448.set(1, var6);
			}
		}

	}

	@ObfInfo(name = "ai", desc = "(II)Z")
	public static boolean method1679(int var0) {
		if (field2448.isEmpty()) {
			return false;
		} else {
			class503 var2 = (class503)field2448.get(0);
			return var2 != null && var0 == var2.field4057;
		}
	}

	@ObfInfo(name = "ap", desc = "(B)Z")
	public static boolean method1682() {
		boolean var1 = false;
		boolean var2 = false;
		if (!field2449.isEmpty()) {
			class236 var3 = (class236)field2449.get(0);
			if (var3 == null) {
				field2449.remove(0);
			} else if (var3.method1242()) {
				if (var3.method1243()) {
					System.out.println("Error in midimanager.service: " + var3.method1241());
					var1 = true;
				} else {
					if (var3.method1244() != null) {
						field2449.add(1, var3.method1244());
					}

					var2 = var3.method1246();
				}

				field2449.remove(0);
			} else {
				var2 = var3.method1246();
			}
		}

		if (var1) {
			field2449.clear();
			method1684();
		}

		return var2;
	}

	@ObfInfo(name = "af", desc = "(IIIII)V")
	public static void method1683(int var0, int var1, int var2, int var3) {
		field2451 = var0;
		field2452 = var1;
		field2453 = var2;
		field2444 = var3;
	}

	@ObfInfo(name = "ad", desc = "(B)V")
	static void method1684() {
		Iterator var1 = field2447.iterator();

		while (true) {
			class503 var2;
			do {
				if (!var1.hasNext()) {
					field2447.clear();
					return;
				}

				var2 = (class503)var1.next();
			} while(null == var2);

			var2.field4063.method814();
			var2.field4063.method812();
			var2.field4063.method777(0);
			var2.field4063.field1413 = 0;
			int var3 = var2.field4057;
			int var4 = var2.field4058;
			Iterator var5 = field2450.iterator();

			while (var5.hasNext()) {
				class128 var6 = (class128)var5.next();
				var6.method702(var3, var4);
			}
		}
	}

	@ObfInfo(name = "aq", desc = "(ZB)V")
	static void method1681(boolean var0) {
		if (var0) {
			method1684();
		} else {
			for (int var2 = 0; var2 < field2447.size(); ++var2) {
				class503 var3 = (class503)field2447.get(var2);
				if (var3 == null) {
					field2447.remove(var2);
					--var2;
				} else if (var3.field4065) {
					if (var3.field4063.field1413 > 0) {
						--var3.field4063.field1413;
					}

					var3.field4063.method814();
					var3.field4063.method812();
					var3.field4063.method777(0);
					field2447.remove(var2);
					--var2;
				} else {
					var3.field4065 = true;
				}
			}
		}

	}
}
