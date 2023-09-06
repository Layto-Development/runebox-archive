import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class20 {
	static String field437;
	boolean field435;
	boolean[] field433;
	/** @deprecated */
	@Deprecated
	String[] field432;
	Map field436;
	long field434;

	class20() {
		this.field435 = false;
		int var1 = class26.field457.method1238(19);
		this.field436 = new HashMap();
		this.field433 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			class285 var3 = class54.method397(var2);
			this.field433[var2] = var3.field2517;
		}

		var2 = 0;
		if (class26.field457.method1878(15)) {
			var2 = class26.field457.method1238(15);
		}

		this.field432 = new String[var2];
		this.method180();
	}

	void method182(int var1, int var2) {
		this.field436.put(var1, var2);
		if (this.field433[var1]) {
			this.field435 = true;
		}

	}

	int method171(int var1) {
		Object var3 = this.field436.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	void method179(int var1, String var2) {
		this.field436.put(var1, var2);
	}

	String method172(int var1) {
		Object var3 = this.field436.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@Deprecated
	void method178(int var1, String var2) {
		this.field432[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	String method173(int var1) {
		return this.field432[var1];
	}

	void method181() {
		int var2;
		for (var2 = 0; var2 < this.field433.length; ++var2) {
			if (!this.field433[var2]) {
				this.field436.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field432.length; ++var2) {
			this.field432[var2] = null;
		}

	}

	class307 method174(boolean var1) {
		return class475.method2301("2", class498.field4148.field3982, var1);
	}

	void method175() {
		class307 var2 = this.method174(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field436.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.field433[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += class431.method2196((String)var8);
					}

					++var4;
				}
			}

			class42 var24 = new class42(var3);
			var24.method267(2);
			var24.method308(var4);
			Iterator var25 = this.field436.entrySet().iterator();

			while (var25.hasNext()) {
				Entry var26 = (Entry)var25.next();
				int var27 = (Integer)var26.getKey();
				if (this.field433[var27]) {
					var24.method308(var27);
					Object var9 = var26.getValue();
					class140 var10 = class140.method838(var9.getClass());
					var24.method267(var10.field1349);
					Class var12 = var9.getClass();
					class140 var13 = class140.method838(var12);
					if (var13 == null) {
						throw new IllegalArgumentException();
					}

					class187 var11 = var13.field1351;
					var11.method1036(var9, var24);
				}
			}

			var2.method1735(var24.field525, 0, var24.field527);
		} catch (Exception var22) {
		} finally {
			try {
				var2.method1738();
			} catch (Exception var21) {
			}

		}

		this.field435 = false;
		this.field434 = class172.method977();
	}

	void method180() {
		class307 var2 = this.method174(false);

		label234: {
			try {
				byte[] var3 = new byte[(int)var2.method1736()];

				int var5;
				for (int var4 = 0; var4 < var3.length; var4 += var5) {
					var5 = var2.method1737(var3, var4, var3.length - var4);
					if (var5 == -1) {
						throw new EOFException();
					}
				}

				class42 var25 = new class42(var3);
				if (var25.field525.length - var25.field527 >= 1) {
					int var6 = var25.method278();
					if (var6 >= 0 && var6 <= 2) {
						int var7;
						int var8;
						int var9;
						int var10;
						if (var6 >= 2) {
							var7 = var25.method327();
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label234;
								}

								var9 = var25.method327();
								var10 = var25.method278();
								class140 var11 = (class140)class451.method2249(class140.method841(), var10);
								Object var12 = var11.method840(var25);
								if (var9 >= 0 && var9 < this.field433.length && this.field433[var9]) {
									this.field436.put(var9, var12);
								}

								++var8;
							}
						} else {
							var7 = var25.method327();

							for (var8 = 0; var8 < var7; ++var8) {
								var9 = var25.method327();
								var10 = var25.method282();
								if (var9 >= 0 && var9 < this.field433.length && this.field433[var9]) {
									this.field436.put(var9, var10);
								}
							}

							var8 = var25.method327();
							var9 = 0;

							while (true) {
								if (var9 >= var8) {
									break label234;
								}

								var25.method327();
								var25.method286();
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
					var2.method1738();
				} catch (Exception var22) {
				}

			}

			return;
		}

		this.field435 = false;
	}

	void method176() {
		if (this.field435 && this.field434 < class172.method977() - 60000L) {
			this.method175();
		}

	}

	boolean method177() {
		return this.field435;
	}
}
