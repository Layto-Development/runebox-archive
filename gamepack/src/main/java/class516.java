import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class516 {
	boolean field4209;
	boolean field4212;
	boolean field4217;
	boolean field4218;
	double field4213;
	int field4208;
	int field4210;
	int field4214;
	int field4215;
	int field4216;
	int field4219;
	String field4211;
	final Map field4220;

	class516() {
		this.field4209 = false;
		this.field4212 = false;
		this.field4213 = 0.8D;
		this.field4208 = 127;
		this.field4215 = 127;
		this.field4216 = 127;
		this.field4214 = -1;
		this.field4211 = null;
		this.field4219 = 1;
		this.field4220 = new LinkedHashMap();
		this.method2484(true);
	}

	class516(class42 var1) {
		this.field4209 = false;
		this.field4212 = false;
		this.field4213 = 0.8D;
		this.field4208 = 127;
		this.field4215 = 127;
		this.field4216 = 127;
		this.field4214 = -1;
		this.field4211 = null;
		this.field4219 = 1;
		this.field4220 = new LinkedHashMap();
		if (var1 != null && var1.field525 != null) {
			int var2 = var1.method278();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.method278() == 1) {
					this.field4218 = true;
				}

				if (var2 > 1) {
					this.field4217 = var1.method278() == 1;
				}

				if (var2 > 3) {
					this.field4219 = var1.method278();
				}

				if (var2 > 2) {
					int var3 = var1.method278();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method282();
						int var6 = var1.method282();
						this.field4220.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field4211 = var1.method337();
				}

				if (var2 > 5) {
					this.field4209 = var1.method285();
				}

				if (var2 > 6) {
					this.field4213 = (double)var1.method278() / 100.0D;
					this.field4208 = var1.method278();
					this.field4215 = var1.method278();
					this.field4216 = var1.method278();
				}

				if (var2 > 7) {
					this.field4214 = var1.method278();
				}

				if (var2 > 8) {
					this.field4212 = var1.method278() == 1;
				}

				if (var2 > 9) {
					this.field4210 = var1.method282();
				}
			} else {
				this.method2484(true);
			}
		} else {
			this.method2484(true);
		}

	}

	void method2484(boolean var1) {
	}

	class42 method2485() {
		class42 var2 = new class42(417, true);
		var2.method267(10);
		var2.method267(this.field4218 ? 1 : 0);
		var2.method267(this.field4217 ? 1 : 0);
		var2.method267(this.field4219);
		var2.method267(this.field4220.size());
		Iterator var3 = this.field4220.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method333((Integer)var4.getKey());
			var2.method333((Integer)var4.getValue());
		}

		var2.method270(null != this.field4211 ? this.field4211 : "");
		var2.method269(this.field4209);
		var2.method267((int)(this.field4213 * 100.0D));
		var2.method267(this.field4208);
		var2.method267(this.field4215);
		var2.method267(this.field4216);
		var2.method267(this.field4214);
		var2.method267(this.field4212 ? 1 : 0);
		var2.method333(this.field4210);
		return var2;
	}

	void method2486(boolean var1) {
		this.field4218 = var1;
		class505.method2431();
	}

	boolean method2487() {
		return this.field4218;
	}

	void method2510(boolean var1) {
		this.field4209 = var1;
		class505.method2431();
	}

	boolean method2491() {
		return this.field4209;
	}

	void method2507(boolean var1) {
		this.field4217 = var1;
		class505.method2431();
	}

	boolean method2509() {
		return this.field4217;
	}

	void method2489(boolean var1) {
		this.field4212 = var1;
		class505.method2431();
	}

	void method2490() {
		this.method2489(!this.field4212);
	}

	boolean method2497() {
		return this.field4212;
	}

	void method2492(int var1) {
		this.field4210 = var1;
		class505.method2431();
	}

	int method2493() {
		return this.field4210;
	}

	void method2513(double var1) {
		this.field4213 = var1;
		class505.method2431();
	}

	double method2511() {
		return this.field4213;
	}

	void method2494(int var1) {
		this.field4208 = var1;
		class505.method2431();
	}

	int method2488() {
		return this.field4208;
	}

	void method2495(int var1) {
		this.field4215 = var1;
		class505.method2431();
	}

	int method2496() {
		return this.field4215;
	}

	void method2519(int var1) {
		this.field4216 = var1;
		class505.method2431();
	}

	int method2517() {
		return this.field4216;
	}

	void method2499(String var1) {
		this.field4211 = var1;
		class505.method2431();
	}

	String method2500() {
		return this.field4211;
	}

	void method2514(int var1) {
		this.field4214 = var1;
		class505.method2431();
	}

	int method2501() {
		return this.field4214;
	}

	void method2502(int var1) {
		this.field4219 = var1;
		class505.method2431();
	}

	int method2503() {
		return this.field4219;
	}

	void method2504(String var1, int var2) {
		int var4 = this.method2506(var1);
		if (this.field4220.size() >= 10 && !this.field4220.containsKey(var4)) {
			Iterator var5 = this.field4220.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field4220.put(var4, var2);
		class505.method2431();
	}

	boolean method2505(String var1) {
		int var3 = this.method2506(var1);
		return this.field4220.containsKey(var3);
	}

	int method2512(String var1) {
		int var3 = this.method2506(var1);
		return !this.field4220.containsKey(var3) ? 0 : (Integer)this.field4220.get(var3);
	}

	int method2506(String var1) {
		return class82.method549(var1.toLowerCase());
	}

	public static final boolean method2518(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class197.method1076(var0)) {
			return true;
		} else {
			char[] var2 = class442.field3872;

			int var3;
			char var4;
			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var0 == var4) {
					return true;
				}
			}

			var2 = class442.field3871;

			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var0 == var4) {
					return true;
				}
			}

			return false;
		}
	}

	public static int method2516(int var0) {
		class82 var2 = class389.method2047(var0);
		int var3 = var2.field858;
		int var4 = var2.field859;
		int var5 = var2.field862;
		int var6 = class23.field442[var5 - var4];
		return class23.field443[var3] >> var4 & var6;
	}

	static void method2498(class42 var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.method308((int)var1);
	}

	public static int method2515(int var0, byte var1) {
		class429 var2 = class505.method2430(var0);
		if (var2 == null) {
			if (var1 == -1) {
				throw new IllegalStateException();
			} else {
				return 2;
			}
		} else {
			byte var10000;
			if (var2.method2188()) {
				if (var1 == -1) {
					throw new IllegalStateException();
				}

				var10000 = 0;
			} else {
				var10000 = 1;
			}

			return var10000;
		}
	}

	static final void method2508(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class353 var11 = null;

		for (class353 var12 = (class353)Client.field144.method563(); var12 != null; var12 = (class353)Client.field144.method565()) {
			if (var12.field3028 == var0 && var12.field3021 == var1 && var12.field3027 == var2 && var3 == var12.field3014) {
				var11 = var12;
				break;
			}
		}

		if (null == var11) {
			var11 = new class353();
			var11.field3028 = var0;
			var11.field3014 = var3;
			var11.field3021 = var1;
			var11.field3027 = var2;
			var11.field3023 = -1;
			class269.method1578(var11);
			Client.field144.method567(var11);
		}

		var11.field3020 = var4;
		var11.field3016 = var5;
		var11.field3022 = var6;
		var11.field3025 = var8;
		var11.field3026 = var9;
		var11.method1923(var7);
	}
}
