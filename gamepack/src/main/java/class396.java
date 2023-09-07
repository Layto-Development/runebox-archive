import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class396 {

	boolean field3133;

	boolean field3142;

	class116[][] field3134;

	class214[] field3136;

	class498 field3130;

	class84 field3132;

	int field3129;

	int field3139;

	int field3140;

	int field3143;

	HashMap field3131;

	HashMap field3141;

	final class338 field3137;

	final class338 field3138;

	final HashMap field3135;

	public int field3144;

	public class396(class214[] var1, HashMap var2, class338 var3, class338 var4) {
		this.field3133 = false;
		this.field3142 = false;
		this.field3141 = new HashMap();
		this.field3144 = 0;
		this.field3136 = var1;
		this.field3135 = var2;
		this.field3137 = var3;
		this.field3138 = var4;
	}

	public void method2036(class338 var1, String var2, boolean var3) {
		if (!this.field3142) {
			this.field3133 = false;
			this.field3142 = true;
			System.nanoTime();
			int var5 = var1.method1787(class68.field722.field721);
			int var6 = var1.method1779(var5, var2);
			class187 var7 = new class187(var1.method1781(class68.field722.field721, var2));
			class187 var8 = new class187(var1.method1781(class68.field718.field721, var2));
			System.nanoTime();
			System.nanoTime();
			this.field3130 = new class498();
			try {
				this.field3130.method2379(var7, var8, var6, var3);
			} catch (IllegalStateException var17) {
				return;
			}
			this.field3130.method1551();
			this.field3130.method1544();
			this.field3130.method1545();
			this.field3140 = this.field3130.method1541() * 64;
			this.field3129 = this.field3130.method1550() * 64;
			this.field3139 = (this.field3130.method1552() - this.field3130.method1541() + 1) * 64;
			this.field3143 = (this.field3130.method1548() - this.field3130.method1550() + 1) * 64;
			int var9 = this.field3130.method1552() - this.field3130.method1541() + 1;
			int var10 = this.field3130.method1548() - this.field3130.method1550() + 1;
			System.nanoTime();
			System.nanoTime();
			class116.field1417.method1171();
			this.field3134 = new class116[var9][var10];
			Iterator var11 = this.field3130.field3995.iterator();
			while (var11.hasNext()) {
				class316 var12 = (class316) var11.next();
				int var13 = var12.field861;
				int var14 = var12.field868;
				int var15 = var13 - this.field3130.method1541();
				int var16 = var14 - this.field3130.method1550();
				this.field3134[var15][var16] = new class116(var13, var14, this.field3130.method1539(), this.field3135);
				this.field3134[var15][var16].method822(var12, this.field3130.field3997);
			}
			for (int var18 = 0; var18 < var9; ++var18) {
				for (int var20 = 0; var20 < var10; ++var20) {
					if (this.field3134[var18][var20] == null) {
						this.field3134[var18][var20] = new class116(this.field3130.method1541() + var18, this.field3130.method1550() + var20, this.field3130.method1539(), this.field3135);
						this.field3134[var18][var20].method793(this.field3130.field3996, this.field3130.field3997);
					}
				}
			}
			System.nanoTime();
			System.nanoTime();
			if (var1.method1784(class68.field717.field721, var2)) {
				byte[] var19 = var1.method1781(class68.field717.field721, var2);
				this.field3132 = class512.method2461(var19);
			}
			System.nanoTime();
			var1.method1775();
			var1.method1777();
			this.field3133 = true;
		}
	}

	public final void method2044() {
		this.field3131 = null;
	}

	public final void method2037(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class206.field1906;
		int var11 = class206.field1904;
		int var12 = class206.field1905;
		float[] var13 = class206.field1907;
		int[] var14 = new int[4];
		class206.method1232(var14);
		class384 var15 = this.method2041(var1, var2, var3, var4);
		float var16 = this.method2045(var7 - var5, var3 - var1);
		int var17 = (int) Math.ceil((double) var16);
		this.field3144 = var17;
		if (!this.field3141.containsKey(var17)) {
			class332 var18 = new class332(var17);
			var18.method1744();
			this.field3141.put(var17, var18);
		}
		int var25 = var15.field3078 + var15.field3079 - 1;
		int var19 = var15.field3080 + var15.field3077 - 1;
		int var20;
		int var21;
		for (var20 = var15.field3078; var20 <= var25; ++var20) {
			for (var21 = var15.field3080; var21 <= var19; ++var21) {
				this.field3134[var20][var21].method823(var17, (class332) this.field3141.get(var17), this.field3136, this.field3137, this.field3138);
			}
		}
		class238.method1396(var10, var11, var12, var13);
		class206.method1252(var14);
		var20 = (int) (var16 * 64.0F);
		var21 = var1 + this.field3140;
		int var22 = this.field3129 + var2;
		for (int var23 = var15.field3078; var23 < var15.field3079 + var15.field3078; ++var23) {
			for (int var24 = var15.field3080; var24 < var15.field3080 + var15.field3077; ++var24) {
				this.field3134[var23][var24].method820((this.field3134[var23][var24].field1422 * 64 - var21) * var20 / 64 + var5, var8 - (64 + (this.field3134[var23][var24].field1413 * 64 - var22)) * var20 / 64, var20);
			}
		}
	}

	public final void method2038(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class384 var15 = this.method2041(var1, var2, var3, var4);
		float var16 = this.method2045(var7 - var5, var3 - var1);
		int var17 = (int) (var16 * 64.0F);
		int var18 = var1 + this.field3140;
		int var19 = this.field3129 + var2;
		int var20;
		int var21;
		for (var20 = var15.field3078; var20 < var15.field3078 + var15.field3079; ++var20) {
			for (var21 = var15.field3080; var21 < var15.field3080 + var15.field3077; ++var21) {
				if (var13) {
					this.field3134[var20][var21].method796();
				}
				this.field3134[var20][var21].method799(var17 * (this.field3134[var20][var21].field1422 * 64 - var18) / 64 + var5, var8 - (this.field3134[var20][var21].field1413 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}
		if (var10 != null && var11 > 0) {
			for (var20 = var15.field3078; var20 < var15.field3079 + var15.field3078; ++var20) {
				for (var21 = var15.field3080; var21 < var15.field3077 + var15.field3080; ++var21) {
					this.field3134[var20][var21].method800(var10, var11, var12);
				}
			}
		}
	}

	public void method2039(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.field3132 != null) {
			this.field3132.method382(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.field3131) {
					this.method2046();
				}
				Iterator var9 = var5.iterator();
				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}
						int var10 = (Integer) var9.next();
						var11 = (List) this.field3131.get(var10);
					} while (var11 == null);
					Iterator var12 = var11.iterator();
					while (var12.hasNext()) {
						class234 var13 = (class234) var12.next();
						int var14 = var3 * (var13.field2023.field3174 - this.field3140) / this.field3139;
						int var15 = var4 - var4 * (var13.field2023.field3176 - this.field3129) / this.field3143;
						class206.method1234(var14 + var1, var15 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	public List method2040(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field3133) {
			return var12;
		} else {
			class384 var13 = this.method2041(var1, var2, var3, var4);
			float var14 = this.method2045(var7, var3 - var1);
			int var15 = (int) (var14 * 64.0F);
			int var16 = var1 + this.field3140;
			int var17 = var2 + this.field3129;
			for (int var18 = var13.field3078; var18 < var13.field3078 + var13.field3079; ++var18) {
				for (int var19 = var13.field3080; var19 < var13.field3080 + var13.field3077; ++var19) {
					List var20 = this.field3134[var18][var19].method812(var5 + (this.field3134[var18][var19].field1422 * 64 - var16) * var15 / 64, var8 + var6 - var15 * (this.field3134[var18][var19].field1413 * 64 - var17 + 64) / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}
			return var12;
		}
	}

	class384 method2041(int var1, int var2, int var3, int var4) {
		class384 var6 = new class384(this);
		int var7 = this.field3140 + var1;
		int var8 = var2 + this.field3129;
		int var9 = this.field3140 + var3;
		int var10 = var4 + this.field3129;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field3079 = var13 - var11 + 1;
		var6.field3077 = var14 - var12 + 1;
		var6.field3078 = var11 - this.field3130.method1541();
		var6.field3080 = var12 - this.field3130.method1550();
		if (var6.field3078 < 0) {
			var6.field3079 += var6.field3078;
			var6.field3078 = 0;
		}
		if (var6.field3078 > this.field3134.length - var6.field3079) {
			var6.field3079 = this.field3134.length - var6.field3078;
		}
		if (var6.field3080 < 0) {
			var6.field3077 += var6.field3080;
			var6.field3080 = 0;
		}
		if (var6.field3080 > this.field3134[0].length - var6.field3077) {
			var6.field3077 = this.field3134[0].length - var6.field3080;
		}
		var6.field3079 = Math.min(var6.field3079, this.field3134.length);
		var6.field3077 = Math.min(var6.field3077, this.field3134[0].length);
		return var6;
	}

	public boolean method2042() {
		return this.field3133;
	}

	public HashMap method2043() {
		this.method2046();
		return this.field3131;
	}

	void method2046() {
		if (this.field3131 == null) {
			this.field3131 = new HashMap();
		}
		this.field3131.clear();
		for (int var2 = 0; var2 < this.field3134.length; ++var2) {
			for (int var3 = 0; var3 < this.field3134[var2].length; ++var3) {
				List var4 = this.field3134[var2][var3].method813();
				Iterator var5 = var4.iterator();
				while (var5.hasNext()) {
					class234 var6 = (class234) var5.next();
					if (var6.method1373()) {
						int var7 = var6.method1371();
						if (!this.field3131.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field3131.put(var7, var8);
						} else {
							List var9 = (List) this.field3131.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}
	}

	float method2045(int var1, int var2) {
		float var4 = (float) var1 / (float) var2;
		if (var4 > 8.0F) {
			return 8.0F;
		} else if (var4 < 1.0F) {
			return 1.0F;
		} else {
			int var5 = Math.round(var4);
			return Math.abs((float) var5 - var4) < 0.05F ? (float) var5 : var4;
		}
	}
}
