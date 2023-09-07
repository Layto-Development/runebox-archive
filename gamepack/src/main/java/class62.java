import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class62 extends class182 {

	static ThreadPoolExecutor field674;

	static AtomicBoolean field677;

	boolean field670;

	class101 field675;

	class445 field669;

	class491[][] field664;

	class491[][] field668;

	class535 field678;

	int field650;

	int field658;

	int field671;

	int field672;

	int[] field649;

	int[] field651;

	int[] field652;

	int[] field653;

	int[] field654;

	int[] field655;

	int[] field656;

	int[] field657;

	int[] field660;

	int[] field661;

	int[] field662;

	int[] field663;

	int[] field665;

	int[] field667;

	int[] field676;

	PriorityQueue field659;

	long field666;

	long field673;

	public int field679;

	static {
		field677 = null;
		field674 = null;
	}

	public class62() {
		this.field650 = 256;
		this.field658 = 1000000;
		this.field652 = new int[16];
		this.field653 = new int[16];
		this.field654 = new int[16];
		this.field655 = new int[16];
		this.field656 = new int[16];
		this.field661 = new int[16];
		this.field667 = new int[16];
		this.field657 = new int[16];
		this.field660 = new int[16];
		this.field649 = new int[16];
		this.field662 = new int[16];
		this.field663 = new int[16];
		this.field651 = new int[16];
		this.field665 = new int[16];
		this.field676 = new int[16];
		this.field664 = new class491[16][128];
		this.field668 = new class491[16][128];
		this.field669 = new class445();
		this.field675 = new class101(this);
		this.field659 = new PriorityQueue(5, new class350());
		this.field679 = 0;
		this.field678 = new class535(128);
		this.method258();
	}

	public synchronized void method242(int var1) {
		this.field650 = var1;
	}

	public int method269() {
		return this.field650;
	}

	public synchronized boolean method243(class219 var1, class338 var2, class439 var3) {
		boolean var5 = true;
		synchronized (this.field659) {
			this.field659.clear();
		}
		for (class264 var6 = (class264) var1.field1951.method2583(); var6 != null; var6 = (class264) var1.field1951.method2584()) {
			int var7 = (int) var6.field785;
			class88 var8 = (class88) this.field678.method2582((long) var7);
			if (null == var8) {
				byte[] var10 = var2.method1769(var7);
				class88 var9;
				if (var10 == null) {
					var9 = null;
				} else {
					var9 = new class88(var10);
				}
				var8 = var9;
				if (null == var9) {
					var5 = false;
					continue;
				}
				this.field678.method2585(var9, (long) var7);
			}
			if (!var8.method398(var3, var6.field2174)) {
				var5 = false;
			} else if (null != this.field659) {
				synchronized (this.field659) {
					Iterator var15 = var8.field882.iterator();
					while (var15.hasNext()) {
						class124 var11 = (class124) var15.next();
						this.field659.add(new class363(var6.field2175, var11));
					}
				}
			}
		}
		return var5;
	}

	public void method244() {
		if (null != this.field659) {
			if (field677 != null) {
				field677.set(true);
			}
			field677 = new AtomicBoolean(false);
			AtomicBoolean var2 = field677;
			if (field674 == null) {
				int var3 = Runtime.getRuntime().availableProcessors();
				field674 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class401(this));
			}
			field674.submit(new class222(this, var2));
		}
	}

	public synchronized void method245() {
		for (class88 var2 = (class88) this.field678.method2583(); null != var2; var2 = (class88) this.field678.method2584()) {
			var2.method399();
		}
	}

	public synchronized void method277() {
		for (class88 var2 = (class88) this.field678.method2583(); var2 != null; var2 = (class88) this.field678.method2584()) {
			var2.method318();
		}
	}

	public synchronized void method247(class219 var1, boolean var2) {
		this.method279();
		this.field669.method2211(var1.field1950);
		this.field670 = var2;
		this.field673 = 0L;
		int var4 = this.field669.method2199();
		for (int var5 = 0; var5 < var4; ++var5) {
			this.field669.method2200(var5);
			this.field669.method2203(var5);
			this.field669.method2201(var5);
		}
		this.field671 = this.field669.method2207();
		this.field672 = this.field669.field3461[this.field671];
		this.field666 = this.field669.method2210(this.field672);
	}

	public synchronized void method279() {
		this.field669.method2198();
		this.method258();
	}

	public synchronized boolean method274() {
		return this.field669.method2212();
	}

	public synchronized boolean method248() {
		return this.field678.method2581() > 0;
	}

	public synchronized void method265(int var1, int var2) {
		this.method270(9, 128);
	}

	void method270(int var1, int var2) {
		this.field655[9] = 128;
		this.field661[9] = 128;
		this.method249(9, 128);
	}

	void method249(int var1, int var2) {
		if (var2 != this.field656[var1]) {
			this.field656[var1] = var2;
			for (int var4 = 0; var4 < 128; ++var4) {
				this.field668[var1][var4] = null;
			}
		}
	}

	void method250(int var1, int var2, int var3) {
		this.method251(var1, var2, 64);
		if ((this.field649[var1] & 2) != 0) {
			for (class491 var5 = (class491) this.field675.field1273.method2219(); var5 != null; var5 = (class491) this.field675.field1273.method2224()) {
				if (var5.field3972 == var1 && var5.field3976 < 0) {
					this.field664[var1][var5.field3967] = null;
					this.field664[var1][var2] = var5;
					int var6 = var5.field3966 + (var5.field3971 * var5.field3974 >> 12);
					var5.field3966 += var2 - var5.field3967 << 8;
					var5.field3971 = var6 - var5.field3966;
					var5.field3974 = 4096;
					var5.field3967 = var2;
					return;
				}
			}
		}
		class88 var9 = (class88) this.field678.method2582((long) this.field656[var1]);
		if (null != var9) {
			if (null != var9.field875[var2]) {
				class529 var10 = var9.field875[var2].method848();
				if (var10 != null) {
					class491 var7 = new class491();
					var7.field3972 = var1;
					var7.field3963 = var9;
					var7.field3964 = var10;
					var7.field3965 = var9.field879[var2];
					var7.field3978 = var9.field880[var2];
					var7.field3967 = var2;
					var7.field3968 = var9.field877[var2] * var9.field881 * var3 * var3 + 1024 >> 11;
					var7.field3969 = var9.field878[var2] & 255;
					var7.field3966 = (var2 << 8) - (var9.field876[var2] & 32767);
					var7.field3973 = 0;
					var7.field3980 = 0;
					var7.field3975 = 0;
					var7.field3976 = -1;
					var7.field3977 = 0;
					if (this.field651[var1] == 0) {
						var7.field3970 = class32.method112(var10, this.method272(var7), this.method273(var7), this.method262(var7));
					} else {
						var7.field3970 = class32.method112(var10, this.method272(var7), 0, this.method262(var7));
						this.method261(var7, var9.field876[var2] < 0);
					}
					if (var9.field876[var2] < 0) {
						var7.field3970.method113(-1);
					}
					if (var7.field3978 >= 0) {
						class491 var8 = this.field668[var1][var7.field3978];
						if (null != var8 && var8.field3976 < 0) {
							this.field664[var1][var8.field3967] = null;
							var8.field3976 = 0;
						}
						this.field668[var1][var7.field3978] = var7;
					}
					this.field675.field1273.method2222(var7);
					this.field664[var1][var2] = var7;
				}
			}
		}
	}

	void method261(class491 var1, boolean var2) {
		int var4 = var1.field3964.field4188.length;
		int var5;
		if (var2 && var1.field3964.field4191) {
			int var6 = var4 + var4 - var1.field3964.field4189;
			var5 = (int) ((long) var6 * (long) this.field651[var1.field3972] >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field3970.method146(true);
			}
		} else {
			var5 = (int) ((long) var4 * (long) this.field651[var1.field3972] >> 6);
		}
		var1.field3970.method118(var5);
	}

	void method251(int var1, int var2, int var3) {
		class491 var5 = this.field664[var1][var2];
		if (var5 != null) {
			this.field664[var1][var2] = null;
			if ((this.field649[var1] & 2) != 0) {
				for (class491 var6 = (class491) this.field675.field1273.method2218(); var6 != null; var6 = (class491) this.field675.field1273.method2220()) {
					if (var6.field3972 == var5.field3972 && var6.field3976 < 0 && var5 != var6) {
						var5.field3976 = 0;
						break;
					}
				}
			} else {
				var5.field3976 = 0;
			}
		}
	}

	void method252(int var1, int var2, int var3) {
	}

	void method253(int var1, int var2) {
	}

	void method254(int var1, int var2) {
		this.field667[var1] = var2;
	}

	void method276(int var1) {
		for (class491 var3 = (class491) this.field675.field1273.method2218(); var3 != null; var3 = (class491) this.field675.field1273.method2220()) {
			if (var1 < 0 || var1 == var3.field3972) {
				if (null != var3.field3970) {
					var3.field3970.method120(class537.field4217 / 100);
					if (var3.field3970.method124()) {
						this.field675.field1271.method893(var3.field3970);
					}
					var3.method2355();
				}
				if (var3.field3976 < 0) {
					this.field664[var3.field3972][var3.field3967] = null;
				}
				var3.method318();
			}
		}
	}

	void method255(int var1) {
		if (var1 >= 0) {
			this.field652[var1] = 12800;
			this.field653[var1] = 8192;
			this.field654[var1] = 16383;
			this.field667[var1] = 8192;
			this.field657[var1] = 0;
			this.field660[var1] = 8192;
			this.method257(var1);
			this.method271(var1);
			this.field649[var1] = 0;
			this.field662[var1] = 32767;
			this.field663[var1] = 256;
			this.field651[var1] = 0;
			this.method259(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method255(var1);
			}
		}
	}

	void method256(int var1) {
		for (class491 var3 = (class491) this.field675.field1273.method2218(); null != var3; var3 = (class491) this.field675.field1273.method2220()) {
			if ((var1 < 0 || var3.field3972 == var1) && var3.field3976 < 0) {
				this.field664[var3.field3972][var3.field3967] = null;
				var3.field3976 = 0;
			}
		}
	}

	void method258() {
		this.method276(-1);
		this.method255(-1);
		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field656[var2] = this.field655[var2];
		}
		for (var2 = 0; var2 < 16; ++var2) {
			this.field661[var2] = this.field655[var2] & -128;
		}
	}

	void method257(int var1) {
		if ((this.field649[var1] & 2) != 0) {
			for (class491 var3 = (class491) this.field675.field1273.method2218(); var3 != null; var3 = (class491) this.field675.field1273.method2220()) {
				if (var3.field3972 == var1 && null == this.field664[var1][var3.field3967] && var3.field3976 < 0) {
					var3.field3976 = 0;
				}
			}
		}
	}

	void method271(int var1) {
		if ((this.field649[var1] & 4) != 0) {
			for (class491 var3 = (class491) this.field675.field1273.method2218(); var3 != null; var3 = (class491) this.field675.field1273.method2220()) {
				if (var1 == var3.field3972) {
					var3.field3982 = 0;
				}
			}
		}
	}

	void method260(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method251(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method250(var4, var5, var6);
			} else {
				this.method251(var4, var5, 64);
			}
		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method252(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field661[var4] = (this.field661[var4] & -2080769) + (var6 << 14);
			}
			if (var5 == 32) {
				this.field661[var4] = (var6 << 7) + (this.field661[var4] & -16257);
			}
			if (var5 == 1) {
				this.field657[var4] = (var6 << 7) + (this.field657[var4] & -16257);
			}
			if (var5 == 33) {
				this.field657[var4] = var6 + (this.field657[var4] & -128);
			}
			if (var5 == 5) {
				this.field660[var4] = (var6 << 7) + (this.field660[var4] & -16257);
			}
			if (var5 == 37) {
				this.field660[var4] = var6 + (this.field660[var4] & -128);
			}
			if (var5 == 7) {
				this.field652[var4] = (this.field652[var4] & -16257) + (var6 << 7);
			}
			if (var5 == 39) {
				this.field652[var4] = (this.field652[var4] & -128) + var6;
			}
			if (var5 == 10) {
				this.field653[var4] = (this.field653[var4] & -16257) + (var6 << 7);
			}
			if (var5 == 42) {
				this.field653[var4] = var6 + (this.field653[var4] & -128);
			}
			if (var5 == 11) {
				this.field654[var4] = (this.field654[var4] & -16257) + (var6 << 7);
			}
			if (var5 == 43) {
				this.field654[var4] = var6 + (this.field654[var4] & -128);
			}
			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field649;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field649;
					var10000[var4] &= -2;
				}
			}
			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field649;
					var10000[var4] |= 2;
				} else {
					this.method257(var4);
					var10000 = this.field649;
					var10000[var4] &= -3;
				}
			}
			if (var5 == 99) {
				this.field662[var4] = (var6 << 7) + (this.field662[var4] & 127);
			}
			if (var5 == 98) {
				this.field662[var4] = var6 + (this.field662[var4] & 16256);
			}
			if (var5 == 101) {
				this.field662[var4] = (var6 << 7) + (this.field662[var4] & 127) + 16384;
			}
			if (var5 == 100) {
				this.field662[var4] = 16384 + (this.field662[var4] & 16256) + var6;
			}
			if (var5 == 120) {
				this.method276(var4);
			}
			if (var5 == 121) {
				this.method255(var4);
			}
			if (var5 == 123) {
				this.method256(var4);
			}
			int var7;
			if (var5 == 6) {
				var7 = this.field662[var4];
				if (var7 == 16384) {
					this.field663[var4] = (var6 << 7) + (this.field663[var4] & -16257);
				}
			}
			if (var5 == 38) {
				var7 = this.field662[var4];
				if (var7 == 16384) {
					this.field663[var4] = (this.field663[var4] & -128) + var6;
				}
			}
			if (var5 == 16) {
				this.field651[var4] = (var6 << 7) + (this.field651[var4] & -16257);
			}
			if (var5 == 48) {
				this.field651[var4] = (this.field651[var4] & -128) + var6;
			}
			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field649;
					var10000[var4] |= 4;
				} else {
					this.method271(var4);
					var10000 = this.field649;
					var10000[var4] &= -5;
				}
			}
			if (var5 == 17) {
				this.method259(var4, (this.field665[var4] & -16257) + (var6 << 7));
			}
			if (var5 == 49) {
				this.method259(var4, (this.field665[var4] & -128) + var6);
			}
		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method249(var4, this.field661[var4] + var5);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method253(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
			this.method254(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method258();
			}
		}
	}

	void method259(int var1, int var2) {
		this.field665[var1] = var2;
		this.field676[var1] = (int) (2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double) var2) + 0.5D);
	}

	int method272(class491 var1) {
		int var3 = var1.field3966 + (var1.field3974 * var1.field3971 >> 12);
		var3 += (this.field667[var1.field3972] - 8192) * this.field663[var1.field3972] >> 12;
		class360 var4 = var1.field3965;
		int var5;
		if (var4.field2863 > 0 && (var4.field2862 > 0 || this.field657[var1.field3972] > 0)) {
			var5 = var4.field2862 << 2;
			int var6 = var4.field2864 << 1;
			if (var1.field3962 < var6) {
				var5 = var5 * var1.field3962 / var6;
			}
			var5 += this.field657[var1.field3972] >> 7;
			double var7 = Math.sin(0.01227184630308513D * (double) (var1.field3979 & 511));
			var3 += (int) ((double) var5 * var7);
		}
		var5 = (int) ((double) (var1.field3964.field4190 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) class537.field4217 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	int method273(class491 var1) {
		class360 var3 = var1.field3965;
		int var4 = 4096 + this.field652[var1.field3972] * this.field654[var1.field3972] >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = var4 * var1.field3968 + 16384 >> 15;
		var4 = var4 * this.field650 + 128 >> 8;
		if (var3.field2859 > 0) {
			var4 = (int) ((double) var4 * Math.pow(0.5D, 1.953125E-5D * (double) var1.field3973 * (double) var3.field2859) + 0.5D);
		}
		int var5;
		int var6;
		int var7;
		int var8;
		if (var3.field2861 != null) {
			var5 = var1.field3980;
			var6 = var3.field2861[var1.field3975 + 1];
			if (var1.field3975 < var3.field2861.length - 2) {
				var7 = (var3.field2861[var1.field3975] & 255) << 8;
				var8 = (var3.field2861[var1.field3975 + 2] & 255) << 8;
				var6 += (var3.field2861[3 + var1.field3975] - var6) * (var5 - var7) / (var8 - var7);
			}
			var4 = var6 * var4 + 32 >> 6;
		}
		if (var1.field3976 > 0 && null != var3.field2866) {
			var5 = var1.field3976;
			var6 = var3.field2866[var1.field3977 + 1];
			if (var1.field3977 < var3.field2866.length - 2) {
				var7 = (var3.field2866[var1.field3977] & 255) << 8;
				var8 = (var3.field2866[var1.field3977 + 2] & 255) << 8;
				var6 += (var5 - var7) * (var3.field2866[3 + var1.field3977] - var6) / (var8 - var7);
			}
			var4 = 32 + var4 * var6 >> 6;
		}
		return var4;
	}

	int method262(class491 var1) {
		int var3 = this.field653[var1.field3972];
		return var3 < 8192 ? var1.field3969 * var3 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field3969) >> 6);
	}

	@Override
	protected synchronized class182 method1066() {
		return this.field675;
	}

	@Override
	protected synchronized class182 method1067() {
		return null;
	}

	@Override
	protected synchronized int method1064() {
		return 0;
	}

	@Override
	protected synchronized void method1069(int[] var1, int var2, int var3) {
		if (this.field669.method2212()) {
			int var4 = this.field669.field3458 * this.field658 / class537.field4217;
			do {
				long var5 = (long) var4 * (long) var3 + this.field673;
				if (this.field666 - var5 >= 0L) {
					this.field673 = var5;
					break;
				}
				int var7 = (int) (((long) var4 + (this.field666 - this.field673) - 1L) / (long) var4);
				this.field673 += (long) var4 * (long) var7;
				this.field675.method1069(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method267();
			} while (this.field669.method2212());
		}
		this.field675.method1069(var1, var2, var3);
	}

	@Override
	protected synchronized void method1068(int var1) {
		if (this.field669.method2212()) {
			int var2 = this.field658 * this.field669.field3458 / class537.field4217;
			do {
				long var3 = this.field673 + (long) var1 * (long) var2;
				if (this.field666 - var3 >= 0L) {
					this.field673 = var3;
					break;
				}
				int var5 = (int) (((long) var2 + (this.field666 - this.field673) - 1L) / (long) var2);
				this.field673 += (long) var2 * (long) var5;
				this.field675.method1068(var5);
				var1 -= var5;
				this.method267();
			} while (this.field669.method2212());
		}
		this.field675.method1068(var1);
	}

	void method267() {
		int var2 = this.field671;
		int var3 = this.field672;
		long var4;
		for (var4 = this.field666; this.field672 == var3; var4 = this.field669.method2210(var3)) {
			while (this.field669.field3461[var2] == var3) {
				this.field669.method2200(var2);
				int var6 = this.field669.method2204(var2);
				if (var6 == 1) {
					this.field669.method2202();
					this.field669.method2201(var2);
					if (this.field669.method2208()) {
						if (!this.field670 || var3 == 0) {
							this.method258();
							this.field669.method2198();
							return;
						}
						this.field669.method2209(var4);
					}
					break;
				}
				if ((var6 & 128) != 0) {
					this.method260(var6);
				}
				this.field669.method2203(var2);
				this.field669.method2201(var2);
			}
			var2 = this.field669.method2207();
			var3 = this.field669.field3461[var2];
		}
		this.field671 = var2;
		this.field672 = var3;
		this.field666 = var4;
	}

	boolean method278(class491 var1) {
		if (null == var1.field3970) {
			if (var1.field3976 >= 0) {
				var1.method318();
				if (var1.field3978 > 0 && this.field668[var1.field3972][var1.field3978] == var1) {
					this.field668[var1.field3972][var1.field3978] = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	boolean method268(class491 var1, int[] var2, int var3, int var4) {
		var1.field3981 = class537.field4217 / 100;
		if (var1.field3976 < 0 || null != var1.field3970 && !var1.field3970.method123()) {
			int var6 = var1.field3974;
			if (var6 > 0) {
				var6 -= (int) (16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double) this.field660[var1.field3972]) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}
				var1.field3974 = var6;
			}
			var1.field3970.method121(this.method272(var1));
			class360 var7 = var1.field3965;
			boolean var8 = false;
			++var1.field3962;
			var1.field3979 += var7.field2863;
			double var9 = 5.086263020833333E-6D * (double) ((var1.field3971 * var1.field3974 >> 12) + (var1.field3967 - 60 << 8));
			if (var7.field2859 > 0) {
				if (var7.field2857 > 0) {
					var1.field3973 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2857 * var9) + 0.5D);
				} else {
					var1.field3973 += 128;
				}
			}
			if (var7.field2861 != null) {
				if (var7.field2858 > 0) {
					var1.field3980 += (int) (128.0D * Math.pow(2.0D, var9 * (double) var7.field2858) + 0.5D);
				} else {
					var1.field3980 += 128;
				}
				while (var1.field3975 < var7.field2861.length - 2 && var1.field3980 > (var7.field2861[var1.field3975 + 2] & 255) << 8) {
					var1.field3975 += 2;
				}
				if (var1.field3975 == var7.field2861.length - 2 && var7.field2861[var1.field3975 + 1] == 0) {
					var8 = true;
				}
			}
			if (var1.field3976 >= 0 && var7.field2866 != null && (this.field649[var1.field3972] & 1) == 0 && (var1.field3978 < 0 || var1 != this.field668[var1.field3972][var1.field3978])) {
				if (var7.field2860 > 0) {
					var1.field3976 += (int) (128.0D * Math.pow(2.0D, var9 * (double) var7.field2860) + 0.5D);
				} else {
					var1.field3976 += 128;
				}
				while (var1.field3977 < var7.field2866.length - 2 && var1.field3976 > (var7.field2866[2 + var1.field3977] & 255) << 8) {
					var1.field3977 += 2;
				}
				if (var1.field3977 == var7.field2866.length - 2) {
					var8 = true;
				}
			}
			if (var8) {
				var1.field3970.method120(var1.field3981);
				if (null != var2) {
					var1.field3970.method1069(var2, var3, var4);
				} else {
					var1.field3970.method1068(var4);
				}
				if (var1.field3970.method124()) {
					this.field675.field1271.method893(var1.field3970);
				}
				var1.method2355();
				if (var1.field3976 >= 0) {
					var1.method318();
					if (var1.field3978 > 0 && this.field668[var1.field3972][var1.field3978] == var1) {
						this.field668[var1.field3972][var1.field3978] = null;
					}
				}
				return true;
			} else {
				var1.field3970.method128(var1.field3981, this.method273(var1), this.method262(var1));
				return false;
			}
		} else {
			var1.method2355();
			var1.method318();
			if (var1.field3978 > 0 && this.field668[var1.field3972][var1.field3978] == var1) {
				this.field668[var1.field3972][var1.field3978] = null;
			}
			return true;
		}
	}
}
