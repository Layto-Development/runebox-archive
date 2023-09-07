import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class308 {

	static final class152 field2375;

	static final class152 field2376;

	static final class152 field2423;

	boolean field2399;

	boolean field2410;

	boolean field2415;

	class214[] field2412;

	class277 field2384;

	class277 field2392;

	class277 field2401;

	class338 field2374;

	class338 field2380;

	class338 field2421;

	class396 field2385;

	class402 field2398;

	class61 field2378;

	class66 field2386;

	class84 field2422;

	float field2379;

	float field2391;

	int field2373;

	int field2382;

	int field2383;

	int field2387;

	int field2388;

	int field2389;

	int field2390;

	int field2393;

	int field2394;

	int field2395;

	int field2396;

	int field2397;

	int field2402;

	int field2403;

	int field2404;

	int field2405;

	int field2406;

	int field2408;

	int field2409;

	int field2419;

	int field2420;

	int field2425;

	int field2426;

	HashMap field2414;

	HashMap field2418;

	HashSet field2371;

	HashSet field2381;

	HashSet field2400;

	HashSet field2411;

	HashSet field2413;

	HashSet field2416;

	Iterator field2377;

	List field2417;

	long field2407;

	final int[] field2424;

	public boolean field2372;

	static {
		field2375 = class152.field1580;
		field2376 = class152.field1586;
		field2423 = class152.field1579;
	}

	public class308() {
		this.field2389 = -1;
		this.field2382 = -1;
		this.field2393 = -1;
		this.field2394 = -1;
		this.field2395 = -1;
		this.field2396 = -1;
		this.field2397 = 3;
		this.field2387 = 50;
		this.field2399 = false;
		this.field2400 = null;
		this.field2390 = -1;
		this.field2402 = -1;
		this.field2403 = -1;
		this.field2404 = -1;
		this.field2405 = -1;
		this.field2406 = -1;
		this.field2410 = true;
		this.field2411 = new HashSet();
		this.field2381 = new HashSet();
		this.field2413 = new HashSet();
		this.field2371 = new HashSet();
		this.field2415 = false;
		this.field2373 = 0;
		this.field2424 = new int[] { 1008, 1009, 1010, 1011, 1012 };
		this.field2416 = new HashSet();
		this.field2398 = null;
		this.field2372 = false;
		this.field2420 = -1;
		this.field2425 = -1;
		this.field2426 = -1;
	}

	public void method1611(class338 var1, class338 var2, class338 var3, class61 var4, HashMap var5, class214[] var6) {
		this.field2412 = var6;
		this.field2421 = var1;
		this.field2380 = var2;
		this.field2374 = var3;
		this.field2378 = var4;
		this.field2418 = new HashMap();
		this.field2418.put(class532.field4204, var5.get(field2375));
		this.field2418.put(class532.field4199, var5.get(field2376));
		this.field2418.put(class532.field4198, var5.get(field2423));
		this.field2386 = new class66(var1);
		int var8 = this.field2421.method1787(class68.field722.field721);
		int[] var9 = this.field2421.method1773(var8);
		int var10 = var9 == null ? 0 : var9.length;
		this.field2414 = new HashMap(var10);
		for (int var11 = 0; var11 < var10; ++var11) {
			class187 var12 = new class187(this.field2421.method1762(var8, var9[var11]));
			class277 var13 = new class277();
			var13.method1533(var12, var9[var11]);
			this.field2414.put(var13.method1542(), var13);
			if (var13.method1536()) {
				this.field2392 = var13;
			}
		}
		this.method1624(this.field2392);
		this.field2384 = null;
	}

	public void method1612() {
		class116.method827();
	}

	public void method1660(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.field2386.method294()) {
			this.method1615();
			this.method1616();
			if (var3) {
				int var9 = (int) Math.ceil((double) ((float) var6 / this.field2391));
				int var10 = (int) Math.ceil((double) ((float) var7 / this.field2391));
				List var11 = this.field2385.method2040(this.field2408 - var9 / 2 - 1, this.field2388 - var10 / 2 - 1, var9 / 2 + this.field2408 + 1, this.field2388 + var10 / 2 + 1, var4, var5, var6, var7, var1, var2);
				HashSet var12 = new HashSet();
				Iterator var13;
				class234 var14;
				class165 var15;
				class142 var16;
				for (var13 = var11.iterator(); var13.hasNext(); class221.method1344(var15)) {
					var14 = (class234) var13.next();
					var12.add(var14);
					var15 = new class165();
					var16 = new class142(var14.method1371(), var14.field2024, var14.field2023);
					var15.method967(new Object[] { var16, var1, var2 });
					if (this.field2416.contains(var14)) {
						var15.method965(17);
					} else {
						var15.method965(15);
					}
				}
				var13 = this.field2416.iterator();
				while (var13.hasNext()) {
					var14 = (class234) var13.next();
					if (!var12.contains(var14)) {
						var15 = new class165();
						var16 = new class142(var14.method1371(), var14.field2024, var14.field2023);
						var15.method967(new Object[] { var16, var1, var2 });
						var15.method965(16);
						class221.method1344(var15);
					}
				}
				this.field2416 = var12;
			}
		}
	}

	public void method1614(int var1, int var2, boolean var3, boolean var4) {
		long var6;
		label33: {
			var6 = class48.method197();
			this.method1667(var1, var2, var4, var6);
			if (!this.method1659() && (var4 || var3)) {
				boolean var8 = Client.field1082 != null;
				if (!var8) {
					if (var4) {
						this.field2405 = var1;
						this.field2406 = var2;
						this.field2403 = this.field2408;
						this.field2404 = this.field2388;
					}
					if (this.field2403 != -1) {
						int var9 = var1 - this.field2405;
						int var10 = var2 - this.field2406;
						this.method1627(this.field2403 - (int) ((float) var9 / this.field2379), this.field2404 + (int) ((float) var10 / this.field2379), false);
					}
					break label33;
				}
			}
			this.method1663();
		}
		if (var4) {
			this.field2407 = var6;
			this.field2419 = var1;
			this.field2383 = var2;
		}
	}

	void method1667(int var1, int var2, boolean var3, long var4) {
		if (this.field2401 != null) {
			int var6 = (int) ((float) this.field2408 + ((float) (var1 - this.field2395) - (float) this.method1640() * this.field2391 / 2.0F) / this.field2391);
			int var7 = (int) ((float) this.field2388 - ((float) (var2 - this.field2396) - (float) this.method1641() * this.field2391 / 2.0F) / this.field2391);
			this.field2398 = this.field2401.method1535(var6 + this.field2401.method1541() * 64, var7 + this.field2401.method1550() * 64);
			if (null != this.field2398 && var3) {
				class479 var8 = Client.method551();
				boolean var9 = Client.field986 >= 2;
				if (var9 && var8.method2323(82) && var8.method2323(81)) {
					Client.method483(this.field2398.field3174, this.field2398.field3176, this.field2398.field3175, false);
				} else {
					boolean var10 = true;
					if (this.field2410) {
						int var11 = var1 - this.field2419;
						int var12 = var2 - this.field2383;
						if (var4 - this.field2407 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}
					if (var10) {
						class457 var13 = class457.method2237(class483.field3867, Client.field963.field1603);
						var13.field3487.method1151(this.field2398.method2063());
						Client.field963.method911(var13);
						this.field2407 = 0L;
					}
				}
			}
		} else {
			this.field2398 = null;
		}
	}

	void method1615() {
		if (null != class364.field2923) {
			this.field2391 = this.field2379;
		} else {
			if (this.field2391 < this.field2379) {
				this.field2391 = Math.min(this.field2379, this.field2391 / 30.0F + this.field2391);
			}
			if (this.field2391 > this.field2379) {
				this.field2391 = Math.max(this.field2379, this.field2391 - this.field2391 / 30.0F);
			}
		}
	}

	void method1616() {
		if (this.method1659()) {
			int var2 = this.field2389 - this.field2408;
			int var3 = this.field2382 - this.field2388;
			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}
			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}
			this.method1627(this.field2408 + var2, var3 + this.field2388, true);
			if (this.field2389 == this.field2408 && this.field2382 == this.field2388) {
				this.field2389 = -1;
				this.field2382 = -1;
			}
		}
	}

	final void method1627(int var1, int var2, boolean var3) {
		this.field2408 = var1;
		this.field2388 = var2;
		class48.method197();
		if (var3) {
			this.method1663();
		}
	}

	final void method1663() {
		this.field2406 = -1;
		this.field2405 = -1;
		this.field2404 = -1;
		this.field2403 = -1;
	}

	boolean method1659() {
		return this.field2389 != -1 && this.field2382 != -1;
	}

	public class277 method1619(int var1, int var2, int var3) {
		Iterator var5 = this.field2414.values().iterator();
		class277 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}
			var6 = (class277) var5.next();
		} while (!var6.method1534(var1, var2, var3));
		return var6;
	}

	public void method1617(int var1, int var2, int var3, boolean var4) {
		class277 var6 = this.method1619(var1, var2, var3);
		if (null == var6) {
			if (!var4) {
				return;
			}
			var6 = this.field2392;
		}
		boolean var7 = false;
		if (this.field2384 != var6 || var4) {
			this.field2384 = var6;
			this.method1624(var6);
			var7 = true;
		}
		if (var7 || var4) {
			this.method1664(var1, var2, var3);
		}
	}

	public void method1621(int var1) {
		class277 var3 = this.method1656(var1);
		if (var3 != null) {
			this.method1624(var3);
		}
	}

	public int method1622() {
		return null == this.field2401 ? -1 : this.field2401.method1543();
	}

	public class277 method1623() {
		return this.field2401;
	}

	void method1624(class277 var1) {
		if (this.field2401 == null || this.field2401 != var1) {
			this.method1625(var1);
			this.method1664(-1, -1, -1);
		}
	}

	void method1625(class277 var1) {
		this.field2401 = var1;
		this.field2385 = new class396(this.field2412, this.field2418, this.field2380, this.field2374);
		this.field2386.method292(this.field2401 == null ? null : this.field2401.method1542());
	}

	public void method1626(class277 var1, class402 var2, class402 var3, boolean var4) {
		if (null != var1) {
			if (null == this.field2401 || var1 != this.field2401) {
				this.method1625(var1);
			}
			if (!var4 && this.field2401.method1534(var2.field3175, var2.field3174, var2.field3176)) {
				this.method1664(var2.field3175, var2.field3174, var2.field3176);
			} else {
				this.method1664(var3.field3175, var3.field3174, var3.field3176);
			}
		}
	}

	void method1664(int var1, int var2, int var3) {
		if (null != this.field2401) {
			int[] var5 = this.field2401.method1547(var1, var2, var3);
			if (null == var5) {
				var5 = this.field2401.method1547(this.field2401.method1544(), this.field2401.method1551(), this.field2401.method1545());
			}
			this.method1627(var5[0] - this.field2401.method1541() * 64, var5[1] - this.field2401.method1550() * 64, true);
			this.field2389 = -1;
			this.field2382 = -1;
			this.field2391 = this.method1631(this.field2401.method1540());
			this.field2379 = this.field2391;
			this.field2417 = null;
			this.field2377 = null;
			this.field2385.method2044();
		}
	}

	public void method1668(int var1, int var2, int var3, int var4, int var5) {
		int[] var7 = new int[4];
		class206.method1232(var7);
		class206.method1243(var1, var2, var3 + var1, var4 + var2);
		class206.method1236(var1, var2, var3, var4, -16777216);
		int var8 = this.field2386.method295();
		if (var8 < 100) {
			this.method1639(var1, var2, var3, var4, var8);
		} else {
			if (!this.field2385.method2042()) {
				this.field2385.method2036(this.field2421, this.field2401.method1542(), Client.field925);
				if (!this.field2385.method2042()) {
					return;
				}
			}
			if (this.field2400 != null) {
				++this.field2402;
				if (this.field2402 % this.field2387 == 0) {
					this.field2402 = 0;
					++this.field2390;
				}
				if (this.field2390 >= this.field2397 && !this.field2399) {
					this.field2400 = null;
				}
			}
			int var9 = (int) Math.ceil((double) ((float) var3 / this.field2391));
			int var10 = (int) Math.ceil((double) ((float) var4 / this.field2391));
			this.field2385.method2037(this.field2408 - var9 / 2, this.field2388 - var10 / 2, this.field2408 + var9 / 2, this.field2388 + var10 / 2, var1, var2, var3 + var1, var2 + var4);
			boolean var11;
			if (!this.field2415) {
				var11 = false;
				if (var5 - this.field2373 > 100) {
					this.field2373 = var5;
					var11 = true;
				}
				this.field2385.method2038(this.field2408 - var9 / 2, this.field2388 - var10 / 2, this.field2408 + var9 / 2, var10 / 2 + this.field2388, var1, var2, var3 + var1, var4 + var2, this.field2371, this.field2400, this.field2402, this.field2387, var11);
			}
			this.method1629(var1, var2, var3, var4, var9, var10);
			var11 = Client.field986 >= 2;
			if (var11 && this.field2372 && null != this.field2398) {
				this.field2378.method2414("Coord: " + this.field2398, class206.field1909 + 10, class206.field1910 + 20, 16776960, -1);
			}
			this.field2393 = var9;
			this.field2394 = var10;
			this.field2395 = var1;
			this.field2396 = var2;
			class206.method1252(var7);
		}
	}

	boolean method1665(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null == this.field2422) {
			return true;
		} else if (var1 == this.field2422.field848 && this.field2422.field844 == var2) {
			if (this.field2409 != this.field2385.field3144) {
				return true;
			} else if (Client.field1021 != this.field2426) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var1 + var3 < var5 || var4 + var2 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	void method1629(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null != class364.field2923) {
			int var8 = 512 / (this.field2385.field3144 * 2);
			int var9 = var3 + 512;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int) ((float) var9 / var11);
			var10 = (int) ((float) var10 / var11);
			int var12 = this.method1638() - var5 / 2 - var8;
			int var13 = this.method1661() - var6 / 2 - var8;
			int var14 = var1 - this.field2385.field3144 * (var12 + var8 - this.field2420);
			int var15 = var2 - (var8 - (var13 - this.field2425)) * this.field2385.field3144;
			if (this.method1665(var9, var10, var14, var15, var3, var4)) {
				if (this.field2422 != null && var9 == this.field2422.field848 && var10 == this.field2422.field844) {
					Arrays.fill(this.field2422.field847, 0);
				} else {
					this.field2422 = new class84(var9, var10);
				}
				this.field2420 = this.method1638() - var5 / 2 - var8;
				this.field2425 = this.method1661() - var6 / 2 - var8;
				this.field2409 = this.field2385.field3144;
				class364.field2923.method236(this.field2420, this.field2425, this.field2422, (float) this.field2409 / var11);
				this.field2426 = Client.field1021;
				var14 = var1 - this.field2385.field3144 * (var8 + var12 - this.field2420);
				var15 = var2 - this.field2385.field3144 * (var8 - (var13 - this.field2425));
			}
			class206.method1235(var1, var2, var3, var4, 0, 128);
			if (var11 == 1.0F) {
				this.field2422.method384(var14, var15, 192);
			} else {
				this.field2422.method370(var14, var15, (int) ((float) var9 * var11), (int) (var11 * (float) var10), 192);
			}
		}
	}

	public void method1658(int var1, int var2, int var3, int var4) {
		if (this.field2386.method294()) {
			if (!this.field2385.method2042()) {
				this.field2385.method2036(this.field2421, this.field2401.method1542(), Client.field925);
				if (!this.field2385.method2042()) {
					return;
				}
			}
			this.field2385.method2039(var1, var2, var3, var4, this.field2400, this.field2402, this.field2387);
		}
	}

	public void method1630(int var1) {
		this.field2379 = this.method1631(var1);
	}

	void method1639(int var1, int var2, int var3, int var4, int var5) {
		boolean var7 = true;
		int var8 = var3 / 2 + var1;
		int var9 = var2 + var4 / 2 - 18 - 20;
		class206.method1236(var1, var2, var3, var4, -16777216);
		class206.method1239(var8 - 152, var9, 304, 34, -65536);
		class206.method1236(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
		this.field2378.method2393(class55.field468, var8, 20 + var9, -1, -1);
	}

	float method1631(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	public int method1632() {
		if ((double) this.field2379 == 1.0D) {
			return 25;
		} else if (1.5D == (double) this.field2379) {
			return 37;
		} else if ((double) this.field2379 == 2.0D) {
			return 50;
		} else if (3.0D == (double) this.field2379) {
			return 75;
		} else {
			return 4.0D == (double) this.field2379 ? 100 : 200;
		}
	}

	public void method1633() {
		this.field2386.method293();
	}

	public boolean method1662() {
		return this.field2386.method294();
	}

	public class277 method1656(int var1) {
		Iterator var3 = this.field2414.values().iterator();
		class277 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}
			var4 = (class277) var3.next();
		} while (var4.method1543() != var1);
		return var4;
	}

	public void method1634(int var1, int var2) {
		if (this.field2401 != null && this.field2401.method1537(var1, var2)) {
			this.field2389 = var1 - this.field2401.method1541() * 64;
			this.field2382 = var2 - this.field2401.method1550() * 64;
		}
	}

	public void method1635(int var1, int var2) {
		if (this.field2401 != null) {
			this.method1627(var1 - this.field2401.method1541() * 64, var2 - this.field2401.method1550() * 64, true);
			this.field2389 = -1;
			this.field2382 = -1;
		}
	}

	public void method1636(int var1, int var2, int var3) {
		if (this.field2401 != null) {
			int[] var5 = this.field2401.method1547(var1, var2, var3);
			if (null != var5) {
				this.method1634(var5[0], var5[1]);
			}
		}
	}

	public void method1637(int var1, int var2, int var3) {
		if (null != this.field2401) {
			int[] var5 = this.field2401.method1547(var1, var2, var3);
			if (null != var5) {
				this.method1635(var5[0], var5[1]);
			}
		}
	}

	public int method1638() {
		return null == this.field2401 ? -1 : this.field2408 + this.field2401.method1541() * 64;
	}

	public int method1661() {
		return this.field2401 == null ? -1 : this.field2388 + this.field2401.method1550() * 64;
	}

	public class402 method1618() {
		return null == this.field2401 ? null : this.field2401.method1535(this.method1638(), this.method1661());
	}

	public int method1640() {
		return this.field2393;
	}

	public int method1641() {
		return this.field2394;
	}

	public void method1642(int var1) {
		if (var1 >= 1) {
			this.field2397 = var1;
		}
	}

	public void method1643() {
		this.field2397 = 3;
	}

	public void method1644(int var1) {
		if (var1 >= 1) {
			this.field2387 = var1;
		}
	}

	public void method1645() {
		this.field2387 = 50;
	}

	public void method1646(boolean var1) {
		this.field2399 = var1;
	}

	public void method1628(int var1) {
		this.field2400 = new HashSet();
		this.field2400.add(var1);
		this.field2390 = 0;
		this.field2402 = 0;
	}

	public void method1647(int var1) {
		this.field2400 = new HashSet();
		this.field2390 = 0;
		this.field2402 = 0;
		for (int var3 = 0; var3 < class319.field2482; ++var3) {
			if (class319.method1706(var3) != null && class319.method1706(var3).field2502 == var1) {
				this.field2400.add(class319.method1706(var3).field2488);
			}
		}
	}

	public void method1648() {
		this.field2400 = null;
	}

	public void method1649(boolean var1) {
		this.field2415 = !var1;
	}

	public void method1657(int var1, boolean var2) {
		if (!var2) {
			this.field2411.add(var1);
		} else {
			this.field2411.remove(var1);
		}
		this.method1652();
	}

	public void method1620(int var1, boolean var2) {
		if (!var2) {
			this.field2381.add(var1);
		} else {
			this.field2381.remove(var1);
		}
		for (int var4 = 0; var4 < class319.field2482; ++var4) {
			if (class319.method1706(var4) != null && class319.method1706(var4).field2502 == var1) {
				int var5 = class319.method1706(var4).field2488;
				if (!var2) {
					this.field2413.add(var5);
				} else {
					this.field2413.remove(var5);
				}
			}
		}
		this.method1652();
	}

	public boolean method1650() {
		return !this.field2415;
	}

	public boolean method1666(int var1) {
		return !this.field2411.contains(var1);
	}

	public boolean method1651(int var1) {
		return !this.field2381.contains(var1);
	}

	void method1652() {
		this.field2371.clear();
		this.field2371.addAll(this.field2411);
		this.field2371.addAll(this.field2413);
	}

	public void method1653(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field2386.method294()) {
			int var8 = (int) Math.ceil((double) ((float) var3 / this.field2391));
			int var9 = (int) Math.ceil((double) ((float) var4 / this.field2391));
			List var10 = this.field2385.method2040(this.field2408 - var8 / 2 - 1, this.field2388 - var9 / 2 - 1, var8 / 2 + this.field2408 + 1, 1 + this.field2388 + var9 / 2, var1, var2, var3, var4, var5, var6);
			if (!var10.isEmpty()) {
				Iterator var11 = var10.iterator();
				boolean var14;
				do {
					if (!var11.hasNext()) {
						return;
					}
					class234 var12 = (class234) var11.next();
					class319 var13 = class319.method1706(var12.method1371());
					var14 = false;
					for (int var15 = this.field2424.length - 1; var15 >= 0; --var15) {
						if (null != var13.field2492[var15]) {
							Client.method581(var13.field2492[var15], var13.field2484, this.field2424[var15], var12.method1371(), var12.field2024.method2063(), var12.field2023.method2063());
							var14 = true;
						}
					}
				} while (!var14);
			}
		}
	}

	public class402 method1654(int var1, class402 var2) {
		if (!this.field2386.method294()) {
			return null;
		} else if (!this.field2385.method2042()) {
			return null;
		} else if (!this.field2401.method1537(var2.field3174, var2.field3176)) {
			return null;
		} else {
			HashMap var4 = this.field2385.method2043();
			List var5 = (List) var4.get(var1);
			if (null != var5 && !var5.isEmpty()) {
				class234 var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();
				while (true) {
					class234 var9;
					int var12;
					do {
						if (!var8.hasNext()) {
							return var6.field2023;
						}
						var9 = (class234) var8.next();
						int var10 = var9.field2023.field3174 - var2.field3174;
						int var11 = var9.field2023.field3176 - var2.field3176;
						var12 = var10 * var10 + var11 * var11;
						if (var12 == 0) {
							return var9.field2023;
						}
					} while (var12 >= var7 && null != var6);
					var6 = var9;
					var7 = var12;
				}
			} else {
				return null;
			}
		}
	}

	public void method1669(int var1, int var2, class402 var3, class402 var4) {
		class165 var6 = new class165();
		class142 var7 = new class142(var2, var3, var4);
		var6.method967(new Object[] { var7 });
		switch(var1) {
			case 1008:
				var6.method965(10);
				break;
			case 1009:
				var6.method965(11);
				break;
			case 1010:
				var6.method965(12);
				break;
			case 1011:
				var6.method965(13);
				break;
			case 1012:
				var6.method965(14);
		}
		class221.method1344(var6);
	}

	public class234 method1613() {
		if (!this.field2386.method294()) {
			return null;
		} else if (!this.field2385.method2042()) {
			return null;
		} else {
			HashMap var2 = this.field2385.method2043();
			this.field2417 = new LinkedList();
			Iterator var3 = var2.values().iterator();
			while (var3.hasNext()) {
				List var4 = (List) var3.next();
				this.field2417.addAll(var4);
			}
			this.field2377 = this.field2417.iterator();
			return this.method1655();
		}
	}

	public class234 method1655() {
		if (null == this.field2377) {
			return null;
		} else {
			class234 var2;
			do {
				if (!this.field2377.hasNext()) {
					return null;
				}
				var2 = (class234) this.field2377.next();
			} while (var2.method1371() == -1);
			return var2;
		}
	}
}
