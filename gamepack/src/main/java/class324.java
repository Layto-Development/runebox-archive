import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "jd")
public final class class324 {
	@ObfInfo(name = "au", desc = "Z")
	boolean field2614;
	@ObfInfo(name = "ae", desc = "Z")
	boolean field2623;
	@ObfInfo(name = "ai", desc = "[[Ljm;")
	class116[][] field2615;
	@ObfInfo(name = "at", desc = "Lui;")
	class150 field2613;
	@ObfInfo(name = "ap", desc = "[Luk;")
	class398[] field2617;
	@ObfInfo(name = "ao", desc = "Lkv;")
	class85 field2611;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 779801411)
	int field2610;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1949825781)
	int field2620;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 156772433)
	int field2621;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 387573503)
	int field2624;
	@ObfInfo(name = "ac", desc = "Ljava/util/HashMap;")
	HashMap field2612;
	@ObfInfo(name = "az", desc = "Ljava/util/HashMap;")
	HashMap field2622;
	@ObfInfo(name = "aa", desc = "Lnu;")
	final class437 field2618;
	@ObfInfo(name = "af", desc = "Lnu;")
	final class437 field2619;
	@ObfInfo(name = "ad", desc = "Ljava/util/HashMap;")
	final HashMap field2616;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1645382275)
	public int field2625;

	@ObfInfo(name = "<init>", desc = "([Luk;Ljava/util/HashMap;Lnu;Lnu;)V")
	public class324(class398[] var1, HashMap var2, class437 var3, class437 var4) {
		this.field2614 = false;
		this.field2623 = false;
		this.field2622 = new HashMap();
		this.field2625 = 0;
		this.field2617 = var1;
		this.field2616 = var2;
		this.field2618 = var3;
		this.field2619 = var4;
	}

	@ObfInfo(name = "au", desc = "(Lnu;Ljava/lang/String;ZI)V", opaqueValue = "948733359")
	public void method1789(class437 var1, String var2, boolean var3) {
		if (!this.field2623) {
			this.field2614 = false;
			this.field2623 = true;
			System.nanoTime();
			int var5 = var1.method2292(class506.field4086.field4085);
			int var6 = var1.method2284(var5, var2);
			class280 var7 = new class280(var1.method2286(class506.field4086.field4085, var2));
			class280 var8 = new class280(var1.method2286(class506.field4082.field4085, var2));
			System.nanoTime();
			System.nanoTime();
			this.field2611 = new class85();

			try {
				this.field2611.method562(var7, var8, var6, var3);
			} catch (IllegalStateException var17) {
				return;
			}

			this.field2611.method1704();
			this.field2611.method1697();
			this.field2611.method1698();
			this.field2621 = this.field2611.method1694() * 64;
			this.field2610 = this.field2611.method1703() * 64;
			this.field2620 = (this.field2611.method1705() - this.field2611.method1694() + 1) * 64;
			this.field2624 = (this.field2611.method1701() - this.field2611.method1703() + 1) * 64;
			int var9 = this.field2611.method1705() - this.field2611.method1694() + 1;
			int var10 = this.field2611.method1701() - this.field2611.method1703() + 1;
			System.nanoTime();
			System.nanoTime();
			class116.field1113.method1224();
			this.field2615 = new class116[var9][var10];
			Iterator var11 = this.field2611.field877.iterator();

			while (var11.hasNext()) {
				class81 var12 = (class81)var11.next();
				int var13 = var12.field4210;
				int var14 = var12.field4217;
				int var15 = var13 - this.field2611.method1694();
				int var16 = var14 - this.field2611.method1703();
				this.field2615[var15][var16] = new class116(var13, var14, this.field2611.method1692(), this.field2616);
				this.field2615[var15][var16].method675(var12, this.field2611.field879);
			}

			for (int var18 = 0; var18 < var9; ++var18) {
				for (int var20 = 0; var20 < var10; ++var20) {
					if (this.field2615[var18][var20] == null) {
						this.field2615[var18][var20] = new class116(this.field2611.method1694() + var18, this.field2611.method1703() + var20, this.field2611.method1692(), this.field2616);
						this.field2615[var18][var20].method646(this.field2611.field878, this.field2611.field879);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method2289(class506.field4081.field4085, var2)) {
				byte[] var19 = var1.method2286(class506.field4081.field4085, var2);
				this.field2613 = class499.method2495(var19);
			}

			System.nanoTime();
			var1.method2280();
			var1.method2282();
			this.field2614 = true;
		}
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public final void method1797() {
		this.field2612 = null;
	}

	@ObfInfo(name = "ao", desc = "(IIIIIIIIB)V", opaqueValue = "1")
	public final void method1790(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class83.field872;
		int var11 = class83.field870;
		int var12 = class83.field871;
		float[] var13 = class83.field873;
		int[] var14 = new int[4];
		class83.method538(var14);
		class420 var15 = this.method1794(var1, var2, var3, var4);
		float var16 = this.method1798(var7 - var5, var3 - var1);
		int var17 = (int)Math.ceil((double)var16);
		this.field2625 = var17;
		if (!this.field2622.containsKey(var17)) {
			class268 var18 = new class268(var17);
			var18.method1400();
			this.field2622.put(var17, var18);
		}

		int var25 = var15.field3227 + var15.field3228 - 1;
		int var19 = var15.field3229 + var15.field3226 - 1;

		int var20;
		int var21;
		for (var20 = var15.field3227; var20 <= var25; ++var20) {
			for (var21 = var15.field3229; var21 <= var19; ++var21) {
				this.field2615[var20][var21].method676(var17, (class268)this.field2622.get(var17), this.field2617, this.field2618, this.field2619);
			}
		}

		class276.method1452(var10, var11, var12, var13);
		class83.method558(var14);
		var20 = (int)(var16 * 64.0F);
		var21 = var1 + this.field2621;
		int var22 = this.field2610 + var2;

		for (int var23 = var15.field3227; var23 < var15.field3228 + var15.field3227; ++var23) {
			for (int var24 = var15.field3229; var24 < var15.field3229 + var15.field3226; ++var24) {
				this.field2615[var23][var24].method673((this.field2615[var23][var24].field1118 * 64 - var21) * var20 / 64 + var5, var8 - (64 + (this.field2615[var23][var24].field1109 * 64 - var22)) * var20 / 64, var20);
			}
		}

	}

	@ObfInfo(name = "at", desc = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V", opaqueValue = "-841850050")
	public final void method1791(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class420 var15 = this.method1794(var1, var2, var3, var4);
		float var16 = this.method1798(var7 - var5, var3 - var1);
		int var17 = (int)(var16 * 64.0F);
		int var18 = var1 + this.field2621;
		int var19 = this.field2610 + var2;

		int var20;
		int var21;
		for (var20 = var15.field3227; var20 < var15.field3227 + var15.field3228; ++var20) {
			for (var21 = var15.field3229; var21 < var15.field3229 + var15.field3226; ++var21) {
				if (var13) {
					this.field2615[var20][var21].method649();
				}

				this.field2615[var20][var21].method652(var17 * (this.field2615[var20][var21].field1118 * 64 - var18) / 64 + var5, var8 - (this.field2615[var20][var21].field1109 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var20 = var15.field3227; var20 < var15.field3228 + var15.field3227; ++var20) {
				for (var21 = var15.field3229; var21 < var15.field3226 + var15.field3229; ++var21) {
					this.field2615[var20][var21].method653(var10, var11, var12);
				}
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(IIIILjava/util/HashSet;IIB)V", opaqueValue = "1")
	public void method1792(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.field2613 != null) {
			this.field2613.method879(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.field2612) {
					this.method1799();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field2612.get(var10);
					} while(var11 == null);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						class223 var13 = (class223)var12.next();
						int var14 = var3 * (var13.field1939.field581 - this.field2621) / this.field2620;
						int var15 = var4 - var4 * (var13.field1939.field583 - this.field2610) / this.field2624;
						class83.method540(var14 + var1, var15 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfInfo(name = "ai", desc = "(IIIIIIIIIII)Ljava/util/List;", opaqueValue = "327055662")
	public List method1793(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field2614) {
			return var12;
		} else {
			class420 var13 = this.method1794(var1, var2, var3, var4);
			float var14 = this.method1798(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = var1 + this.field2621;
			int var17 = var2 + this.field2610;

			for (int var18 = var13.field3227; var18 < var13.field3227 + var13.field3228; ++var18) {
				for (int var19 = var13.field3229; var19 < var13.field3229 + var13.field3226; ++var19) {
					List var20 = this.field2615[var18][var19].method665(var5 + (this.field2615[var18][var19].field1118 * 64 - var16) * var15 / 64, var8 + var6 - var15 * (this.field2615[var18][var19].field1109 * 64 - var17 + 64) / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	@ObfInfo(name = "az", desc = "(IIIIB)Lks;", opaqueValue = "2")
	class420 method1794(int var1, int var2, int var3, int var4) {
		class420 var6 = new class420(this);
		int var7 = this.field2621 + var1;
		int var8 = var2 + this.field2610;
		int var9 = this.field2621 + var3;
		int var10 = var4 + this.field2610;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field3228 = var13 - var11 + 1;
		var6.field3226 = var14 - var12 + 1;
		var6.field3227 = var11 - this.field2611.method1694();
		var6.field3229 = var12 - this.field2611.method1703();
		if (var6.field3227 < 0) {
			var6.field3228 += var6.field3227;
			var6.field3227 = 0;
		}

		if (var6.field3227 > this.field2615.length - var6.field3228) {
			var6.field3228 = this.field2615.length - var6.field3227;
		}

		if (var6.field3229 < 0) {
			var6.field3226 += var6.field3229;
			var6.field3229 = 0;
		}

		if (var6.field3229 > this.field2615[0].length - var6.field3226) {
			var6.field3226 = this.field2615[0].length - var6.field3229;
		}

		var6.field3228 = Math.min(var6.field3228, this.field2615.length);
		var6.field3226 = Math.min(var6.field3226, this.field2615[0].length);
		return var6;
	}

	@ObfInfo(name = "ap", desc = "(B)Z")
	public boolean method1795() {
		return this.field2614;
	}

	@ObfInfo(name = "aa", desc = "(I)Ljava/util/HashMap;")
	public HashMap method1796() {
		this.method1799();
		return this.field2612;
	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "61078949")
	void method1799() {
		if (this.field2612 == null) {
			this.field2612 = new HashMap();
		}

		this.field2612.clear();

		for (int var2 = 0; var2 < this.field2615.length; ++var2) {
			for (int var3 = 0; var3 < this.field2615[var2].length; ++var3) {
				List var4 = this.field2615[var2][var3].method666();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					class223 var6 = (class223)var5.next();
					if (var6.method1210()) {
						int var7 = var6.method1208();
						if (!this.field2612.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field2612.put(var7, var8);
						} else {
							List var9 = (List)this.field2612.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(IIB)F", opaqueValue = "0")
	float method1798(int var1, int var2) {
		float var4 = (float)var1 / (float)var2;
		if (var4 > 8.0F) {
			return 8.0F;
		} else if (var4 < 1.0F) {
			return 1.0F;
		} else {
			int var5 = Math.round(var4);
			return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
		}
	}
}
