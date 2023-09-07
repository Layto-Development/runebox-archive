import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class388 {

	public static class338 field3085;

	public static class338 field3086;

	public static class338 field3089;

	public static int field3087;

	public static int field3094;

	public static int field3095;

	public static int field3096;

	public static ArrayList field3088;

	public static ArrayList field3090;

	public static ArrayList field3091;

	public static ArrayList field3092;

	public static LinkedList field3097;

	public static final List field3093;

	static {
		field3088 = null;
		field3097 = new LinkedList();
		field3090 = new ArrayList(3);
		field3091 = new ArrayList(3);
		field3092 = new ArrayList();
		field3093 = new ArrayList();
		field3094 = 0;
		field3095 = 0;
		field3096 = 0;
		field3087 = 0;
	}

	class388() throws Throwable {
	}

	public static void method2018(class273 var0) {
		field3093.remove(var0);
	}

	public static void method2015(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			field3097.clear();
			field3092.clear();
			method2019(var5);
			class328.method1728(var0, var5);
			if (!field3097.isEmpty()) {
				method2021(var1, var2, var3, var4);
				field3092.add(new class493((class17) null));
				field3092.add(new class503((class17) null, field3085, field3086, field3089));
				ArrayList var7 = new ArrayList();
				var7.add(new class261(new class371((class17) null, 0, true, field3087)));
				if (!field3090.isEmpty()) {
					ArrayList var8 = new ArrayList();
					var8.add(new class293(new class442((class17) null, var7), field3096));
					ArrayList var10 = new ArrayList();
					Iterator var11 = field3090.iterator();
					while (var11.hasNext()) {
						class490 var12 = (class490) var11.next();
						var10.add(var12);
					}
					var8.add(new class293(new class72(new class398((class17) null, var10), 0, false, field3095), field3094));
					field3092.add(new class442((class17) null, var8));
				} else {
					field3092.add(new class293((class17) null, field3096));
					field3092.add(new class442((class17) null, var7));
				}
			}
		}
	}

	public static void method2016(int var0, int var1, int var2, int var3) {
		if (field3090.size() > 1 && field3090.get(0) != null && ((class490) field3090.get(0)).field3956.method274() && field3090.get(1) != null && ((class490) field3090.get(1)).field3956.method274()) {
			method2021(var0, var1, var2, var3);
			field3092.add(new class180((class17) null));
			ArrayList var5 = new ArrayList();
			var5.add(new class293(new class371((class17) null, 1, false, field3087), field3096));
			var5.add(new class293(new class72((class17) null, 0, false, field3095), field3094));
			field3092.add(new class442((class17) null, var5));
			if (field3091.get(0) != null && field3091.get(1) != null) {
				class490 var6 = (class490) field3091.get(0);
				field3091.set(0, field3090.get(1));
				field3091.set(1, var6);
			}
		}
	}

	public static boolean method2017(int var0) {
		if (field3091.isEmpty()) {
			return false;
		} else {
			class490 var2 = (class490) field3091.get(0);
			return var2 != null && var0 == var2.field3950;
		}
	}

	public static boolean method2020() {
		boolean var1 = false;
		boolean var2 = false;
		if (!field3092.isEmpty()) {
			class17 var3 = (class17) field3092.get(0);
			if (var3 == null) {
				field3092.remove(0);
			} else if (var3.method51()) {
				if (var3.method52()) {
					System.out.println("Error in midimanager.service: " + var3.method50());
					var1 = true;
				} else {
					if (var3.method53() != null) {
						field3092.add(1, var3.method53());
					}
					var2 = var3.method55();
				}
				field3092.remove(0);
			} else {
				var2 = var3.method55();
			}
		}
		if (var1) {
			field3092.clear();
			method2022();
		}
		return var2;
	}

	public static void method2021(int var0, int var1, int var2, int var3) {
		field3094 = var0;
		field3095 = var1;
		field3096 = var2;
		field3087 = var3;
	}

	static void method2022() {
		Iterator var1 = field3090.iterator();
		while (true) {
			class490 var2;
			do {
				if (!var1.hasNext()) {
					field3090.clear();
					return;
				}
				var2 = (class490) var1.next();
			} while (null == var2);
			var2.field3956.method279();
			var2.field3956.method277();
			var2.field3956.method242(0);
			var2.field3956.field679 = 0;
			int var3 = var2.field3950;
			int var4 = var2.field3951;
			Iterator var5 = field3093.iterator();
			while (var5.hasNext()) {
				class273 var6 = (class273) var5.next();
				var6.method1519(var3, var4);
			}
		}
	}

	static void method2019(boolean var0) {
		if (var0) {
			method2022();
		} else {
			for (int var2 = 0; var2 < field3090.size(); ++var2) {
				class490 var3 = (class490) field3090.get(var2);
				if (var3 == null) {
					field3090.remove(var2);
					--var2;
				} else if (var3.field3958) {
					if (var3.field3956.field679 > 0) {
						--var3.field3956.field679;
					}
					var3.field3956.method279();
					var3.field3956.method277();
					var3.field3956.method242(0);
					field3090.remove(var2);
					--var2;
				} else {
					var3.field3958 = true;
				}
			}
		}
	}
}
