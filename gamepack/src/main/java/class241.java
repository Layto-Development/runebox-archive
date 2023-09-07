import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class241 {

	static String field2051;

	boolean field2049;

	boolean[] field2047;

	/**
	 * @deprecated
	 */
	@Deprecated
	String[] field2046;

	Map field2050;

	long field2048;

	class241() {
		this.field2049 = false;
		int var1 = class478.field3746.method1788(19);
		this.field2050 = new HashMap();
		this.field2047 = new boolean[var1];
		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			class29 var3 = class29.method90(var2);
			this.field2047[var2] = var3.field145;
		}
		var2 = 0;
		if (class478.field3746.method40(15)) {
			var2 = class478.field3746.method1788(15);
		}
		this.field2046 = new String[var2];
		this.method1421();
	}

	void method1423(int var1, int var2) {
		this.field2050.put(var1, var2);
		if (this.field2047[var1]) {
			this.field2049 = true;
		}
	}

	int method1412(int var1) {
		Object var3 = this.field2050.get(var1);
		return var3 instanceof Integer ? (Integer) var3 : -1;
	}

	void method1420(int var1, String var2) {
		this.field2050.put(var1, var2);
	}

	String method1413(int var1) {
		Object var3 = this.field2050.get(var1);
		return var3 instanceof String ? (String) var3 : "";
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	void method1419(int var1, String var2) {
		this.field2046[var1] = var2;
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	String method1414(int var1) {
		return this.field2046[var1];
	}

	void method1422() {
		int var2;
		for (var2 = 0; var2 < this.field2047.length; ++var2) {
			if (!this.field2047[var2]) {
				this.field2050.remove(var2);
			}
		}
		for (var2 = 0; var2 < this.field2046.length; ++var2) {
			this.field2046[var2] = null;
		}
	}

	class6 method1415(boolean var1) {
		return class89.method402("2", class359.field2855.field3737, var1);
	}

	void method1416() {
		class6 var2 = this.method1415(true);
		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field2050.entrySet().iterator();
			while (var5.hasNext()) {
				Entry var6 = (Entry) var5.next();
				int var7 = (Integer) var6.getKey();
				if (this.field2047[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += class187.method1159((String) var8);
					}
					++var4;
				}
			}
			class187 var24 = new class187(var3);
			var24.method1085(2);
			var24.method1126(var4);
			Iterator var25 = this.field2050.entrySet().iterator();
			while (var25.hasNext()) {
				Entry var26 = (Entry) var25.next();
				int var27 = (Integer) var26.getKey();
				if (this.field2047[var27]) {
					var24.method1126(var27);
					Object var9 = var26.getValue();
					class272 var10 = class272.method1516(var9.getClass());
					var24.method1085(var10.field2231);
					Class var12 = var9.getClass();
					class272 var13 = class272.method1516(var12);
					if (var13 == null) {
						throw new IllegalArgumentException();
					}
					class378 var11 = var13.field2233;
					var11.method2006(var9, var24);
				}
			}
			var2.method13(var24.field1830, 0, var24.field1832);
		} catch (Exception var22) {
		} finally {
			try {
				var2.method16();
			} catch (Exception var21) {
			}
		}
		this.field2049 = false;
		this.field2048 = class48.method197();
	}

	void method1421() {
		class6 var2 = this.method1415(false);
		label234: {
			try {
				byte[] var3 = new byte[(int) var2.method14()];
				int var5;
				for (int var4 = 0; var4 < var3.length; var4 += var5) {
					var5 = var2.method15(var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}
				}
				class187 var25 = new class187(var3);
				if (var25.field1830.length - var25.field1832 >= 1) {
					int var6 = var25.method1096();
					if (var6 >= 0 && var6 <= 2) {
						int var7;
						int var8;
						int var9;
						int var10;
						if (var6 >= 2) {
							var7 = var25.method1145();
							var8 = 0;
							while (true) {
								if (var8 >= var7) {
									break label234;
								}
								var9 = var25.method1145();
								var10 = var25.method1096();
								class272 var11 = (class272) class433.method2167(class272.method1518(), var10);
								Object var12 = var11.method1517(var25);
								if (var9 >= 0 && var9 < this.field2047.length && this.field2047[var9]) {
									this.field2050.put(var9, var12);
								}
								++var8;
							}
						} else {
							var7 = var25.method1145();
							for (var8 = 0; var8 < var7; ++var8) {
								var9 = var25.method1145();
								var10 = var25.method1100();
								if (var9 >= 0 && var9 < this.field2047.length && this.field2047[var9]) {
									this.field2050.put(var9, var10);
								}
							}
							var8 = var25.method1145();
							var9 = 0;
							while (true) {
								if (var9 >= var8) {
									break label234;
								}
								var25.method1145();
								var25.method1104();
								++var9;
							}
						}
					}
					return;
				}
			} catch (Exception var23) {
				break label234;
			} finally {
				try {
					var2.method16();
				} catch (Exception var22) {
				}
			}
			return;
		}
		this.field2049 = false;
	}

	void method1417() {
		if (this.field2049 && this.field2048 < class48.method197() - 60000L) {
			this.method1416();
		}
	}

	boolean method1418() {
		return this.field2049;
	}
}
