import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class class134 {
	boolean field1301;
	boolean field1310;
	class115 field1300;
	class143 field1298;
	class25[] field1304;
	class87[][] field1302;
	int field1297;
	int field1307;
	int field1308;
	int field1311;
	HashMap field1299;
	HashMap field1309;
	final class215 field1305;
	final class215 field1306;
	final HashMap field1303;
	public int field1312;

	public class134(class25[] var1, HashMap var2, class215 var3, class215 var4) {
		this.field1301 = false;
		this.field1310 = false;
		this.field1309 = new HashMap();
		this.field1312 = 0;
		this.field1304 = var1;
		this.field1303 = var2;
		this.field1305 = var3;
		this.field1306 = var4;
	}

	public void method805(class215 var1, String var2, boolean var3) {
		if (!this.field1310) {
			this.field1301 = false;
			this.field1310 = true;
			System.nanoTime();
			int var5 = var1.method1237(class499.field4155.field4154);
			int var6 = var1.method1229(var5, var2);
			class42 var7 = new class42(var1.method1231(class499.field4155.field4154, var2));
			class42 var8 = new class42(var1.method1231(class499.field4151.field4154, var2));
			System.nanoTime();
			System.nanoTime();
			this.field1298 = new class143();

			try {
				this.field1298.method845(var7, var8, var6, var3);
			} catch (IllegalStateException var17) {
				return;
			}

			this.field1298.method86();
			this.field1298.method78();
			this.field1298.method79();
			this.field1308 = this.field1298.method74() * 64;
			this.field1297 = this.field1298.method84() * 64;
			this.field1307 = (this.field1298.method87() - this.field1298.method74() + 1) * 64;
			this.field1311 = (this.field1298.method82() - this.field1298.method84() + 1) * 64;
			int var9 = this.field1298.method87() - this.field1298.method74() + 1;
			int var10 = this.field1298.method82() - this.field1298.method84() + 1;
			System.nanoTime();
			System.nanoTime();
			class87.field873.method1585();
			this.field1302 = new class87[var9][var10];
			Iterator var11 = this.field1298.field1367.iterator();

			while (var11.hasNext()) {
				class152 var12 = (class152)var11.next();
				int var13 = var12.field1990;
				int var14 = var12.field1997;
				int var15 = var13 - this.field1298.method74();
				int var16 = var14 - this.field1298.method84();
				this.field1302[var15][var16] = new class87(var13, var14, this.field1298.method72(), this.field1303);
				this.field1302[var15][var16].method599(var12, this.field1298.field1369);
			}

			for (int var18 = 0; var18 < var9; ++var18) {
				for (int var20 = 0; var20 < var10; ++var20) {
					if (this.field1302[var18][var20] == null) {
						this.field1302[var18][var20] = new class87(this.field1298.method74() + var18, this.field1298.method84() + var20, this.field1298.method72(), this.field1303);
						this.field1302[var18][var20].method570(this.field1298.field1368, this.field1298.field1369);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method1234(class499.field4150.field4154, var2)) {
				byte[] var19 = var1.method1231(class499.field4150.field4154, var2);
				this.field1300 = class418.method2149(var19);
			}

			System.nanoTime();
			var1.method1225();
			var1.method1227();
			this.field1301 = true;
		}
	}

	public final void method813() {
		this.field1299 = null;
	}

	public final void method806(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = class266.field2406;
		int var11 = class266.field2404;
		int var12 = class266.field2405;
		float[] var13 = class266.field2407;
		int[] var14 = new int[4];
		class266.method1544(var14);
		class70 var15 = this.method810(var1, var2, var3, var4);
		float var16 = this.method814(var7 - var5, var3 - var1);
		int var17 = (int)Math.ceil((double)var16);
		this.field1312 = var17;
		if (!this.field1309.containsKey(var17)) {
			class284 var18 = new class284(var17);
			var18.method1620();
			this.field1309.put(var17, var18);
		}

		int var25 = var15.field813 + var15.field814 - 1;
		int var19 = var15.field815 + var15.field812 - 1;

		int var20;
		int var21;
		for (var20 = var15.field813; var20 <= var25; ++var20) {
			for (var21 = var15.field815; var21 <= var19; ++var21) {
				this.field1302[var20][var21].method600(var17, (class284)this.field1309.get(var17), this.field1304, this.field1305, this.field1306);
			}
		}

		class133.method790(var10, var11, var12, var13);
		class266.method1564(var14);
		var20 = (int)(var16 * 64.0F);
		var21 = var1 + this.field1308;
		int var22 = this.field1297 + var2;

		for (int var23 = var15.field813; var23 < var15.field814 + var15.field813; ++var23) {
			for (int var24 = var15.field815; var24 < var15.field815 + var15.field812; ++var24) {
				this.field1302[var23][var24].method597((this.field1302[var23][var24].field878 * 64 - var21) * var20 / 64 + var5, var8 - (64 + (this.field1302[var23][var24].field869 * 64 - var22)) * var20 / 64, var20);
			}
		}

	}

	public final void method807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		class70 var15 = this.method810(var1, var2, var3, var4);
		float var16 = this.method814(var7 - var5, var3 - var1);
		int var17 = (int)(var16 * 64.0F);
		int var18 = var1 + this.field1308;
		int var19 = this.field1297 + var2;

		int var20;
		int var21;
		for (var20 = var15.field813; var20 < var15.field813 + var15.field814; ++var20) {
			for (var21 = var15.field815; var21 < var15.field815 + var15.field812; ++var21) {
				if (var13) {
					this.field1302[var20][var21].method573();
				}

				this.field1302[var20][var21].method576(var17 * (this.field1302[var20][var21].field878 * 64 - var18) / 64 + var5, var8 - (this.field1302[var20][var21].field869 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var20 = var15.field813; var20 < var15.field814 + var15.field813; ++var20) {
				for (var21 = var15.field815; var21 < var15.field812 + var15.field815; ++var21) {
					this.field1302[var20][var21].method577(var10, var11, var12);
				}
			}
		}

	}

	public void method808(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.field1300 != null) {
			this.field1300.method734(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (null == this.field1299) {
					this.method816();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field1299.get(var10);
					} while(var11 == null);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						class217 var13 = (class217)var12.next();
						int var14 = var3 * (var13.field2025.field460 - this.field1308) / this.field1307;
						int var15 = var4 - var4 * (var13.field2025.field462 - this.field1297) / this.field1311;
						class266.method1546(var14 + var1, var15 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	public List method809(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field1301) {
			return var12;
		} else {
			class70 var13 = this.method810(var1, var2, var3, var4);
			float var14 = this.method814(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = var1 + this.field1308;
			int var17 = var2 + this.field1297;

			for (int var18 = var13.field813; var18 < var13.field813 + var13.field814; ++var18) {
				for (int var19 = var13.field815; var19 < var13.field815 + var13.field812; ++var19) {
					List var20 = this.field1302[var18][var19].method589(var5 + (this.field1302[var18][var19].field878 * 64 - var16) * var15 / 64, var8 + var6 - var15 * (this.field1302[var18][var19].field869 * 64 - var17 + 64) / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	class70 method810(int var1, int var2, int var3, int var4) {
		class70 var6 = new class70(this);
		int var7 = this.field1308 + var1;
		int var8 = var2 + this.field1297;
		int var9 = this.field1308 + var3;
		int var10 = var4 + this.field1297;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field814 = var13 - var11 + 1;
		var6.field812 = var14 - var12 + 1;
		var6.field813 = var11 - this.field1298.method74();
		var6.field815 = var12 - this.field1298.method84();
		if (var6.field813 < 0) {
			var6.field814 += var6.field813;
			var6.field813 = 0;
		}

		if (var6.field813 > this.field1302.length - var6.field814) {
			var6.field814 = this.field1302.length - var6.field813;
		}

		if (var6.field815 < 0) {
			var6.field812 += var6.field815;
			var6.field815 = 0;
		}

		if (var6.field815 > this.field1302[0].length - var6.field812) {
			var6.field812 = this.field1302[0].length - var6.field815;
		}

		var6.field814 = Math.min(var6.field814, this.field1302.length);
		var6.field812 = Math.min(var6.field812, this.field1302[0].length);
		return var6;
	}

	public boolean method811() {
		return this.field1301;
	}

	public HashMap method812() {
		this.method816();
		return this.field1299;
	}

	void method816() {
		if (this.field1299 == null) {
			this.field1299 = new HashMap();
		}

		this.field1299.clear();

		for (int var2 = 0; var2 < this.field1302.length; ++var2) {
			for (int var3 = 0; var3 < this.field1302[var2].length; ++var3) {
				List var4 = this.field1302[var2][var3].method590();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					class217 var6 = (class217)var5.next();
					if (var6.method1246()) {
						int var7 = var6.method1244();
						if (!this.field1299.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field1299.put(var7, var8);
						} else {
							List var9 = (List)this.field1299.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	float method814(int var1, int var2) {
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

	protected static int method815() {
		int var1 = 0;
		if (class308.field2781 == null || !class308.field2781.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						class308.field2781 = var3;
						class172.field1682 = -1L;
						class172.field1651 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (class308.field2781 != null) {
			long var11 = class172.method977();
			long var4 = class308.field2781.getCollectionTime();
			if (class172.field1651 != -1L) {
				long var6 = var4 - class172.field1651;
				long var8 = var11 - class172.field1682;
				if (var8 != 0L) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			class172.field1651 = var4;
			class172.field1682 = var11;
		}

		return var1;
	}

	static final void method817() {
		int[] var1 = class481.field4086;

		int var2;
		for (var2 = 0; var2 < class481.field4085; ++var2) {
			class287 var3 = Client.field176[var1[var2]];
			if (var3 != null && var3.field1549 > 0) {
				--var3.field1549;
				if (var3.field1549 == 0) {
					var3.field1596 = null;
				}
			}
		}

		for (var2 = 0; var2 < Client.field64; ++var2) {
			int var5 = Client.field2[var2];
			class102 var4 = Client.field63[var5];
			if (var4 != null && var4.field1549 > 0) {
				--var4.field1549;
				if (var4.field1549 == 0) {
					var4.field1596 = null;
				}
			}
		}

	}
}
