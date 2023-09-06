import java.util.Arrays;

public class class411 implements class68 {
	boolean[] field3429;
	boolean[] field3437;
	boolean[] field3438;
	char[] field3435;
	int field3433;
	int field3434;
	int field3436;
	int field3440;
	int[] field3432;
	int[] field3439;
	public char field3428;
	public int field3431;
	public int field3441;
	public int[] field3430;

	public class411() {
		this.field3435 = new char[128];
		this.field3439 = new int[128];
		this.field3430 = new int[128];
		this.field3431 = 0;
		this.field3432 = new int[128];
		this.field3433 = 0;
		this.field3440 = 0;
		this.field3434 = 0;
		this.field3436 = 0;
		this.field3437 = new boolean[112];
		this.field3438 = new boolean[112];
		this.field3429 = new boolean[112];
	}

	public boolean method498(int var1) {
		this.method2120(var1);
		this.field3437[var1] = true;
		this.field3438[var1] = true;
		this.field3429[var1] = false;
		this.field3430[++this.field3431 - 1] = var1;
		return true;
	}

	public boolean method496(int var1) {
		this.field3437[var1] = false;
		this.field3438[var1] = false;
		this.field3429[var1] = true;
		this.field3432[++this.field3433 - 1] = var1;
		return true;
	}

	public boolean method497(char var1) {
		int var3 = 1 + this.field3434 & 127;
		if (this.field3440 != var3) {
			this.field3439[this.field3434] = -1;
			this.field3435[this.field3434] = var1;
			this.field3434 = var3;
		}

		return false;
	}

	void method2120(int var1) {
		int var3 = this.field3434 + 1 & 127;
		if (this.field3440 != var3) {
			this.field3439[this.field3434] = var1;
			this.field3435[this.field3434] = 0;
			this.field3434 = var3;
		}

	}

	public boolean method499(boolean var1) {
		return false;
	}

	public void method2114() {
		this.field3440 = this.field3436;
		this.field3436 = this.field3434;
		this.field3431 = 0;
		this.field3433 = 0;
		Arrays.fill(this.field3438, false);
		Arrays.fill(this.field3429, false);
	}

	public final boolean method2119() {
		if (this.field3440 == this.field3436) {
			return false;
		} else {
			this.field3441 = this.field3439[this.field3440];
			this.field3428 = this.field3435[this.field3440];
			this.field3440 = 1 + this.field3440 & 127;
			return true;
		}
	}

	public boolean method2115(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3438[var1] : false;
	}

	public boolean method2118(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3437[var1] : false;
	}

	public boolean method2113(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3429[var1] : false;
	}

	public int[] method2116() {
		int[] var2 = new int[this.field3431];

		for (int var3 = 0; var3 < this.field3431; ++var3) {
			var2[var3] = this.field3430[var3];
		}

		return var2;
	}

	public int[] method2117() {
		int[] var2 = new int[this.field3433];

		for (int var3 = 0; var3 < this.field3433; ++var3) {
			var2[var3] = this.field3432[var3];
		}

		return var2;
	}

	static int method2122(int var0, int var1) {
		class281 var3 = (class281)class281.field2506.method1492((long)var0);
		if (null == var3) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field2504.length; ++var5) {
				if (var1 == var3.field2505[var5]) {
					var4 += var3.field2504[var5];
				}
			}

			return var4;
		}
	}

	static final void method2121(class60[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class60 var4 = var0[var3];
			if (var4 != null) {
				if (var4.field646 == 0) {
					if (var4.field776 != null) {
						method2121(var4.field776, var1);
					}

					class534 var5 = (class534)Client.field24.method1492((long)var4.field644);
					if (var5 != null) {
						class465.method2276(var5.field4270, var1);
					}
				}

				class309 var6;
				if (var1 == 0 && null != var4.field691) {
					var6 = new class309();
					var6.field2791 = var4;
					var6.field2794 = var4.field691;
					class186.method1031(var6);
				}

				if (var1 == 1 && var4.field723 != null) {
					if (var4.field763 >= 0) {
						class60 var7 = class366.method1967(var4.field644);
						if (var7 == null || var7.field776 == null || var4.field763 >= var7.field776.length || var7.field776[var4.field763] != var4) {
							continue;
						}
					}

					var6 = new class309();
					var6.field2791 = var4;
					var6.field2794 = var4.field723;
					class186.method1031(var6);
				}
			}
		}

	}
}
