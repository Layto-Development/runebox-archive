import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "ej")
public class class308 {
	@ObfInfo(name = "gr", desc = "Ljava/lang/String;")
	static String field2521;
	@ObfInfo(name = "ai", desc = "Z")
	boolean field2519;
	@ObfInfo(name = "ao", desc = "[Z")
	boolean[] field2517;
	/** @deprecated */
	@ObfInfo(name = "ac", desc = "[Ljava/lang/String;")
	String[] field2516;
	@ObfInfo(name = "at", desc = "Ljava/util/Map;")
	Map field2520;
	@ObfInfo(name = "az", desc = "J", longMultiplier = -8695581576756728231L)
	long field2518;

	@ObfInfo(name = "<init>", desc = "()V")
	class308() {
		this.field2519 = false;
		int var1 = class345.field2708.method2293(19);
		this.field2520 = new HashMap();
		this.field2517 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			class26 var3 = class26.method355(var2);
			this.field2517[var2] = var3.field423;
		}

		var2 = 0;
		if (class345.field2708.method2506(15)) {
			var2 = class345.field2708.method2293(15);
		}

		this.field2516 = new String[var2];
		this.method1718();
	}

	@ObfInfo(name = "au", desc = "(III)V", opaqueValue = "857106234")
	void method1720(int var1, int var2) {
		this.field2520.put(var1, var2);
		if (this.field2517[var1]) {
			this.field2519 = true;
		}

	}

	@ObfInfo(name = "ae", desc = "(IB)I", opaqueValue = "2")
	int method1709(int var1) {
		Object var3 = this.field2520.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	@ObfInfo(name = "ao", desc = "(ILjava/lang/String;I)V")
	void method1717(int var1, String var2) {
		this.field2520.put(var1, var2);
	}

	@ObfInfo(name = "at", desc = "(IB)Ljava/lang/String;", opaqueValue = "2")
	String method1710(int var1) {
		Object var3 = this.field2520.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@ObfInfo(name = "ac", desc = "(ILjava/lang/String;I)V")
	void method1716(int var1, String var2) {
		this.field2516[var1] = var2;
	}

	/** @deprecated */
	@ObfInfo(name = "ai", desc = "(IB)Ljava/lang/String;")
	String method1711(int var1) {
		return this.field2516[var1];
	}

	@ObfInfo(name = "az", desc = "(B)V", opaqueValue = "-1")
	void method1719() {
		int var2;
		for (var2 = 0; var2 < this.field2517.length; ++var2) {
			if (!this.field2517[var2]) {
				this.field2520.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field2516.length; ++var2) {
			this.field2516[var2] = null;
		}

	}

	@ObfInfo(name = "ap", desc = "(ZI)Ltu;")
	class408 method1712(boolean var1) {
		return class519.method2544("2", class512.field4103.field1605, var1);
	}

	@ObfInfo(name = "aa", desc = "(B)V", opaqueValue = "1")
	void method1713() {
		class408 var2 = this.method1712(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field2520.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.field2517[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += class280.method1555((String)var8);
					}

					++var4;
				}
			}

			class280 var24 = new class280(var3);
			var24.method1481(2);
			var24.method1522(var4);
			Iterator var25 = this.field2520.entrySet().iterator();

			while (var25.hasNext()) {
				Entry var26 = (Entry)var25.next();
				int var27 = (Integer)var26.getKey();
				if (this.field2517[var27]) {
					var24.method1522(var27);
					Object var9 = var26.getValue();
					class49 var10 = class49.method449(var9.getClass());
					var24.method1481(var10.field576);
					Class var12 = var9.getClass();
					class49 var13 = class49.method449(var12);
					if (var13 == null) {
						throw new IllegalArgumentException();
					}

					class422 var11 = var13.field578;
					var11.method2210(var9, var24);
				}
			}

			var2.method2136(var24.field2252, 0, var24.field2254);
		} catch (Exception var22) {
		} finally {
			try {
				var2.method2139();
			} catch (Exception var21) {
			}

		}

		this.field2519 = false;
		this.field2518 = class43.method443();
	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "-1271363363")
	void method1718() {
		class408 var2 = this.method1712(false);

		try {
			byte[] var3 = new byte[(int)var2.method2137()];

			int var5;
			for (int var4 = 0; var4 < var3.length; var4 += var5) {
				var5 = var2.method2138(var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new EOFException();
				}
			}

			class280 var25 = new class280(var3);
			if (var25.field2252.length - var25.field2254 < 1) {
				return;
			}

			int var6 = var25.method1492();
			if (var6 < 0 || var6 > 2) {
				return;
			}

			int var7;
			int var8;
			int var9;
			int var10;
			if (var6 >= 2) {
				var7 = var25.method1541();

				for (var8 = 0; var8 < var7; ++var8) {
					var9 = var25.method1541();
					var10 = var25.method1492();
					class49 var11 = (class49)class216.method1198(class49.method452(), var10);
					Object var12 = var11.method451(var25);
					if (var9 >= 0 && var9 < this.field2517.length && this.field2517[var9]) {
						this.field2520.put(var9, var12);
					}
				}
			} else {
				var7 = var25.method1541();

				for (var8 = 0; var8 < var7; ++var8) {
					var9 = var25.method1541();
					var10 = var25.method1496();
					if (var9 >= 0 && var9 < this.field2517.length && this.field2517[var9]) {
						this.field2520.put(var9, var10);
					}
				}

				var8 = var25.method1541();

				for (var9 = 0; var9 < var8; ++var9) {
					var25.method1541();
					var25.method1500();
				}
			}
		} catch (Exception var23) {
		} finally {
			try {
				var2.method2139();
			} catch (Exception var22) {
			}

		}

		this.field2519 = false;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaqueValue = "296985236")
	void method1714() {
		if (this.field2519 && this.field2518 < class43.method443() - 60000L) {
			this.method1713();
		}

	}

	@ObfInfo(name = "aq", desc = "(B)Z")
	boolean method1715() {
		return this.field2519;
	}
}
