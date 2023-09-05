import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfInfo(name = "lf")
public class class137 extends class449 {
	@ObfInfo(name = "bq", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	static ThreadPoolExecutor field1408;
	@ObfInfo(name = "bf", desc = "Ljava/util/concurrent/atomic/AtomicBoolean;")
	static AtomicBoolean field1411;
	@ObfInfo(name = "bk", desc = "Z")
	boolean field1404;
	@ObfInfo(name = "bj", desc = "Llq;")
	class211 field1403;
	@ObfInfo(name = "bs", desc = "Lmh;")
	class277 field1409;
	@ObfInfo(name = "ak", desc = "[[Lmg;")
	class378[][] field1398;
	@ObfInfo(name = "bh", desc = "[[Lmg;")
	class378[][] field1402;
	@ObfInfo(name = "au", desc = "Lso;")
	class405 field1412;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1749604367)
	int field1384;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1096208917)
	int field1392;
	@ObfInfo(name = "bv", desc = "I", intMultiplier = -716283687)
	int field1405;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = -699922429)
	int field1406;
	@ObfInfo(name = "ah", desc = "[I")
	int[] field1383;
	@ObfInfo(name = "aj", desc = "[I")
	int[] field1385;
	@ObfInfo(name = "at", desc = "[I")
	int[] field1386;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field1387;
	@ObfInfo(name = "ai", desc = "[I")
	int[] field1388;
	@ObfInfo(name = "az", desc = "[I")
	int[] field1389;
	@ObfInfo(name = "ap", desc = "[I")
	int[] field1390;
	@ObfInfo(name = "ad", desc = "[I")
	int[] field1391;
	@ObfInfo(name = "aq", desc = "[I")
	int[] field1394;
	@ObfInfo(name = "aa", desc = "[I")
	int[] field1395;
	@ObfInfo(name = "as", desc = "[I")
	int[] field1396;
	@ObfInfo(name = "ay", desc = "[I")
	int[] field1397;
	@ObfInfo(name = "av", desc = "[I")
	int[] field1399;
	@ObfInfo(name = "af", desc = "[I")
	int[] field1401;
	@ObfInfo(name = "aw", desc = "[I")
	int[] field1410;
	@ObfInfo(name = "bm", desc = "Ljava/util/PriorityQueue;")
	PriorityQueue field1393;
	@ObfInfo(name = "by", desc = "J", longMultiplier = 6809306897544537L)
	long field1400;
	@ObfInfo(name = "bd", desc = "J", longMultiplier = -7285986816161155915L)
	long field1407;
	@ObfInfo(name = "ba", desc = "I", intMultiplier = 1591268569)
	public int field1413;

	static {
		field1411 = null;
		field1408 = null;
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public class137() {
		this.field1384 = 256;
		this.field1392 = 1000000;
		this.field1386 = new int[16];
		this.field1387 = new int[16];
		this.field1388 = new int[16];
		this.field1389 = new int[16];
		this.field1390 = new int[16];
		this.field1395 = new int[16];
		this.field1401 = new int[16];
		this.field1391 = new int[16];
		this.field1394 = new int[16];
		this.field1383 = new int[16];
		this.field1396 = new int[16];
		this.field1397 = new int[16];
		this.field1385 = new int[16];
		this.field1399 = new int[16];
		this.field1410 = new int[16];
		this.field1398 = new class378[16][128];
		this.field1402 = new class378[16][128];
		this.field1403 = new class211();
		this.field1409 = new class277(this);
		this.field1393 = new PriorityQueue(5, new class302());
		this.field1413 = 0;
		this.field1412 = new class405(128);
		this.method793();
	}

	@ObfInfo(name = "au", desc = "(II)V")
	public synchronized void method777(int var1) {
		this.field1384 = var1;
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method804() {
		return this.field1384;
	}

	@ObfInfo(name = "ao", desc = "(Lmv;Lnu;Lbi;I)Z", opaqueValue = "2143794388")
	public synchronized boolean method778(class352 var1, class437 var2, class293 var3) {
		boolean var5 = true;
		synchronized(this.field1393) {
			this.field1393.clear();
		}

		for (class514 var6 = (class514)var1.field2797.method2130(); var6 != null; var6 = (class514)var1.field2797.method2131()) {
			int var7 = (int)var6.field1483;
			class160 var8 = (class160)this.field1412.method2129((long)var7);
			if (null == var8) {
				byte[] var10 = var2.method2274(var7);
				class160 var9;
				if (var10 == null) {
					var9 = null;
				} else {
					var9 = new class160(var10);
				}

				var8 = var9;
				if (null == var9) {
					var5 = false;
					continue;
				}

				this.field1412.method2132(var9, (long)var7);
			}

			if (!var8.method922(var3, var6.field4109)) {
				var5 = false;
			} else if (null != this.field1393) {
				synchronized(this.field1393) {
					Iterator var15 = var8.field1516.iterator();

					while (var15.hasNext()) {
						class428 var11 = (class428)var15.next();
						this.field1393.add(new class252(var6.field4110, var11));
					}
				}
			}
		}

		return var5;
	}

	@ObfInfo(name = "at", desc = "(I)V", opaqueValue = "543863054")
	public void method779() {
		if (null != this.field1393) {
			if (field1411 != null) {
				field1411.set(true);
			}

			field1411 = new AtomicBoolean(false);
			AtomicBoolean var2 = field1411;
			if (field1408 == null) {
				int var3 = Runtime.getRuntime().availableProcessors();
				field1408 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class176(this));
			}

			field1408.submit(new class448(this, var2));
		}
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaqueValue = "-32745561")
	public synchronized void method780() {
		for (class160 var2 = (class160)this.field1412.method2130(); null != var2; var2 = (class160)this.field1412.method2131()) {
			var2.method923();
		}

	}

	@ObfInfo(name = "af", desc = "(I)V")
	public synchronized void method812() {
		for (class160 var2 = (class160)this.field1412.method2130(); var2 != null; var2 = (class160)this.field1412.method2131()) {
			var2.method907();
		}

	}

	@ObfInfo(name = "aq", desc = "(Lmv;ZI)V", opaqueValue = "-1524429485")
	public synchronized void method782(class352 var1, boolean var2) {
		this.method814();
		this.field1403.method1179(var1.field2796);
		this.field1404 = var2;
		this.field1407 = 0L;
		int var4 = this.field1403.method1167();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field1403.method1168(var5);
			this.field1403.method1171(var5);
			this.field1403.method1169(var5);
		}

		this.field1405 = this.field1403.method1175();
		this.field1406 = this.field1403.field1884[this.field1405];
		this.field1400 = this.field1403.method1178(this.field1406);
	}

	@ObfInfo(name = "al", desc = "(I)V")
	public synchronized void method814() {
		this.field1403.method1166();
		this.method793();
	}

	@ObfInfo(name = "an", desc = "(B)Z")
	public synchronized boolean method809() {
		return this.field1403.method1180();
	}

	@ObfInfo(name = "ar", desc = "(B)Z", opaqueValue = "8")
	public synchronized boolean method783() {
		return this.field1412.method2128() > 0;
	}

	@ObfInfo(name = "ab", desc = "(III)V")
	public synchronized void method800(int var1, int var2) {
		this.method805(var1, var2);
	}

	@ObfInfo(name = "ag", desc = "(IIB)V")
	void method805(int var1, int var2) {
		this.field1389[var1] = var2;
		this.field1395[var1] = var2 & -128;
		this.method784(var1, var2);
	}

	@ObfInfo(name = "am", desc = "(IIB)V", opaqueValue = "5")
	void method784(int var1, int var2) {
		if (var2 != this.field1390[var1]) {
			this.field1390[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field1402[var1][var4] = null;
			}
		}

	}

	@ObfInfo(name = "ax", desc = "(IIII)V", opaqueValue = "-1131047942")
	void method785(int var1, int var2, int var3) {
		this.method786(var1, var2, 64);
		if ((this.field1383[var1] & 2) != 0) {
			for (class378 var5 = (class378)this.field1409.field2246.method628(); var5 != null; var5 = (class378)this.field1409.field2246.method633()) {
				if (var5.field2903 == var1 && var5.field2907 < 0) {
					this.field1398[var1][var5.field2898] = null;
					this.field1398[var1][var2] = var5;
					int var6 = var5.field2897 + (var5.field2902 * var5.field2905 >> 12);
					var5.field2897 += var2 - var5.field2898 << 8;
					var5.field2902 = var6 - var5.field2897;
					var5.field2905 = 4096;
					var5.field2898 = var2;
					return;
				}
			}
		}

		class160 var9 = (class160)this.field1412.method2129((long)this.field1390[var1]);
		if (null != var9) {
			if (null != var9.field1509[var2]) {
				class62 var10 = var9.field1509[var2].method2227();
				if (var10 != null) {
					class378 var7 = new class378();
					var7.field2903 = var1;
					var7.field2894 = var9;
					var7.field2895 = var10;
					var7.field2896 = var9.field1513[var2];
					var7.field2909 = var9.field1514[var2];
					var7.field2898 = var2;
					var7.field2899 = var9.field1511[var2] * var9.field1515 * var3 * var3 + 1024 >> 11;
					var7.field2900 = var9.field1512[var2] & 255;
					var7.field2897 = (var2 << 8) - (var9.field1510[var2] & 32767);
					var7.field2904 = 0;
					var7.field2911 = 0;
					var7.field2906 = 0;
					var7.field2907 = -1;
					var7.field2908 = 0;
					if (this.field1385[var1] == 0) {
						var7.field2901 = class28.method369(var10, this.method807(var7), this.method808(var7), this.method797(var7));
					} else {
						var7.field2901 = class28.method369(var10, this.method807(var7), 0, this.method797(var7));
						this.method796(var7, var9.field1510[var2] < 0);
					}

					if (var9.field1510[var2] < 0) {
						var7.field2901.method370(-1);
					}

					if (var7.field2909 >= 0) {
						class378 var8 = this.field1402[var1][var7.field2909];
						if (null != var8 && var8.field2907 < 0) {
							this.field1398[var1][var8.field2898] = null;
							var8.field2907 = 0;
						}

						this.field1402[var1][var7.field2909] = var7;
					}

					this.field1409.field2246.method631(var7);
					this.field1398[var1][var2] = var7;
				}
			}
		}
	}

	@ObfInfo(name = "ah", desc = "(Lmg;ZS)V", opaqueValue = "3658")
	void method796(class378 var1, boolean var2) {
		int var4 = var1.field2895.field738.length;
		int var5;
		if (var2 && var1.field2895.field741) {
			int var6 = var4 + var4 - var1.field2895.field739;
			var5 = (int)((long)var6 * (long)this.field1385[var1.field2903] >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field2901.method403(true);
			}
		} else {
			var5 = (int)((long)var4 * (long)this.field1385[var1.field2903] >> 6);
		}

		var1.field2901.method375(var5);
	}

	@ObfInfo(name = "as", desc = "(IIII)V", opaqueValue = "1002745448")
	void method786(int var1, int var2, int var3) {
		class378 var5 = this.field1398[var1][var2];
		if (var5 != null) {
			this.field1398[var1][var2] = null;
			if ((this.field1383[var1] & 2) != 0) {
				for (class378 var6 = (class378)this.field1409.field2246.method627(); var6 != null; var6 = (class378)this.field1409.field2246.method629()) {
					if (var6.field2903 == var5.field2903 && var6.field2907 < 0 && var5 != var6) {
						var5.field2907 = 0;
						break;
					}
				}
			} else {
				var5.field2907 = 0;
			}

		}
	}

	@ObfInfo(name = "ay", desc = "(IIII)V")
	void method787(int var1, int var2, int var3) {
	}

	@ObfInfo(name = "aj", desc = "(III)V")
	void method788(int var1, int var2) {
	}

	@ObfInfo(name = "av", desc = "(III)V")
	void method789(int var1, int var2) {
		this.field1401[var1] = var2;
	}

	@ObfInfo(name = "aw", desc = "(II)V", opaqueValue = "16781569")
	void method811(int var1) {
		for (class378 var3 = (class378)this.field1409.field2246.method627(); var3 != null; var3 = (class378)this.field1409.field2246.method629()) {
			if (var1 < 0 || var1 == var3.field2903) {
				if (null != var3.field2901) {
					var3.field2901.method377(class429.field3242 / 100);
					if (var3.field2901.method381()) {
						this.field1409.field2244.method1990(var3.field2901);
					}

					var3.method2020();
				}

				if (var3.field2907 < 0) {
					this.field1398[var3.field2903][var3.field2898] = null;
				}

				var3.method907();
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(IB)V", opaqueValue = "11")
	void method790(int var1) {
		if (var1 >= 0) {
			this.field1386[var1] = 12800;
			this.field1387[var1] = 8192;
			this.field1388[var1] = 16383;
			this.field1401[var1] = 8192;
			this.field1391[var1] = 0;
			this.field1394[var1] = 8192;
			this.method792(var1);
			this.method806(var1);
			this.field1383[var1] = 0;
			this.field1396[var1] = 32767;
			this.field1397[var1] = 256;
			this.field1385[var1] = 0;
			this.method794(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method790(var1);
			}

		}
	}

	@ObfInfo(name = "bh", desc = "(IB)V", opaqueValue = "2")
	void method791(int var1) {
		for (class378 var3 = (class378)this.field1409.field2246.method627(); null != var3; var3 = (class378)this.field1409.field2246.method629()) {
			if ((var1 < 0 || var3.field2903 == var1) && var3.field2907 < 0) {
				this.field1398[var3.field2903][var3.field2898] = null;
				var3.field2907 = 0;
			}
		}

	}

	@ObfInfo(name = "bm", desc = "(I)V", opaqueValue = "1873768041")
	void method793() {
		this.method811(-1);
		this.method790(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field1390[var2] = this.field1389[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field1395[var2] = this.field1389[var2] & -128;
		}

	}

	@ObfInfo(name = "bf", desc = "(II)V", opaqueValue = "-1481774365")
	void method792(int var1) {
		if ((this.field1383[var1] & 2) != 0) {
			for (class378 var3 = (class378)this.field1409.field2246.method627(); var3 != null; var3 = (class378)this.field1409.field2246.method629()) {
				if (var3.field2903 == var1 && null == this.field1398[var1][var3.field2898] && var3.field2907 < 0) {
					var3.field2907 = 0;
				}
			}
		}

	}

	@ObfInfo(name = "bq", desc = "(II)V")
	void method806(int var1) {
		if ((this.field1383[var1] & 4) != 0) {
			for (class378 var3 = (class378)this.field1409.field2246.method627(); var3 != null; var3 = (class378)this.field1409.field2246.method629()) {
				if (var1 == var3.field2903) {
					var3.field2913 = 0;
				}
			}
		}

	}

	@ObfInfo(name = "ba", desc = "(IB)V", opaqueValue = "3")
	void method795(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method786(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method785(var4, var5, var6);
			} else {
				this.method786(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method787(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field1395[var4] = (this.field1395[var4] & -2080769) + (var6 << 14);
			}

			if (var5 == 32) {
				this.field1395[var4] = (var6 << 7) + (this.field1395[var4] & -16257);
			}

			if (var5 == 1) {
				this.field1391[var4] = (var6 << 7) + (this.field1391[var4] & -16257);
			}

			if (var5 == 33) {
				this.field1391[var4] = var6 + (this.field1391[var4] & -128);
			}

			if (var5 == 5) {
				this.field1394[var4] = (var6 << 7) + (this.field1394[var4] & -16257);
			}

			if (var5 == 37) {
				this.field1394[var4] = var6 + (this.field1394[var4] & -128);
			}

			if (var5 == 7) {
				this.field1386[var4] = (this.field1386[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 39) {
				this.field1386[var4] = (this.field1386[var4] & -128) + var6;
			}

			if (var5 == 10) {
				this.field1387[var4] = (this.field1387[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 42) {
				this.field1387[var4] = var6 + (this.field1387[var4] & -128);
			}

			if (var5 == 11) {
				this.field1388[var4] = (this.field1388[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 43) {
				this.field1388[var4] = var6 + (this.field1388[var4] & -128);
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field1383;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field1383;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field1383;
					var10000[var4] |= 2;
				} else {
					this.method792(var4);
					var10000 = this.field1383;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field1396[var4] = (var6 << 7) + (this.field1396[var4] & 127);
			}

			if (var5 == 98) {
				this.field1396[var4] = var6 + (this.field1396[var4] & 16256);
			}

			if (var5 == 101) {
				this.field1396[var4] = (var6 << 7) + (this.field1396[var4] & 127) + 16384;
			}

			if (var5 == 100) {
				this.field1396[var4] = 16384 + (this.field1396[var4] & 16256) + var6;
			}

			if (var5 == 120) {
				this.method811(var4);
			}

			if (var5 == 121) {
				this.method790(var4);
			}

			if (var5 == 123) {
				this.method791(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field1396[var4];
				if (var7 == 16384) {
					this.field1397[var4] = (var6 << 7) + (this.field1397[var4] & -16257);
				}
			}

			if (var5 == 38) {
				var7 = this.field1396[var4];
				if (var7 == 16384) {
					this.field1397[var4] = (this.field1397[var4] & -128) + var6;
				}
			}

			if (var5 == 16) {
				this.field1385[var4] = (var6 << 7) + (this.field1385[var4] & -16257);
			}

			if (var5 == 48) {
				this.field1385[var4] = (this.field1385[var4] & -128) + var6;
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field1383;
					var10000[var4] |= 4;
				} else {
					this.method806(var4);
					var10000 = this.field1383;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method794(var4, (this.field1399[var4] & -16257) + (var6 << 7));
			}

			if (var5 == 49) {
				this.method794(var4, (this.field1399[var4] & -128) + var6);
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method784(var4, this.field1395[var4] + var5);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method788(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
			this.method789(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method793();
			}
		}
	}

	@ObfInfo(name = "bl", desc = "(III)V")
	void method794(int var1, int var2) {
		this.field1399[var1] = var2;
		this.field1410[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfInfo(name = "be", desc = "(Lmg;B)I", opaqueValue = "6")
	int method807(class378 var1) {
		int var3 = var1.field2897 + (var1.field2905 * var1.field2902 >> 12);
		var3 += (this.field1401[var1.field2903] - 8192) * this.field1397[var1.field2903] >> 12;
		class21 var4 = var1.field2896;
		int var5;
		if (var4.field395 > 0 && (var4.field394 > 0 || this.field1391[var1.field2903] > 0)) {
			var5 = var4.field394 << 2;
			int var6 = var4.field396 << 1;
			if (var1.field2893 < var6) {
				var5 = var5 * var1.field2893 / var6;
			}

			var5 += this.field1391[var1.field2903] >> 7;
			double var7 = Math.sin(0.01227184630308513D * (double)(var1.field2910 & 511));
			var3 += (int)((double)var5 * var7);
		}

		var5 = (int)((double)(var1.field2895.field740 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)class429.field3242 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	@ObfInfo(name = "bi", desc = "(Lmg;I)I", opaqueValue = "-1224155709")
	int method808(class378 var1) {
		class21 var3 = var1.field2896;
		int var4 = 4096 + this.field1386[var1.field2903] * this.field1388[var1.field2903] >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = var4 * var1.field2899 + 16384 >> 15;
		var4 = var4 * this.field1384 + 128 >> 8;
		if (var3.field391 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2904 * (double)var3.field391) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (var3.field393 != null) {
			var5 = var1.field2911;
			var6 = var3.field393[var1.field2906 + 1];
			if (var1.field2906 < var3.field393.length - 2) {
				var7 = (var3.field393[var1.field2906] & 255) << 8;
				var8 = (var3.field393[var1.field2906 + 2] & 255) << 8;
				var6 += (var3.field393[3 + var1.field2906] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var6 * var4 + 32 >> 6;
		}

		if (var1.field2907 > 0 && null != var3.field398) {
			var5 = var1.field2907;
			var6 = var3.field398[var1.field2908 + 1];
			if (var1.field2908 < var3.field398.length - 2) {
				var7 = (var3.field398[var1.field2908] & 255) << 8;
				var8 = (var3.field398[var1.field2908 + 2] & 255) << 8;
				var6 += (var5 - var7) * (var3.field398[3 + var1.field2908] - var6) / (var8 - var7);
			}

			var4 = 32 + var4 * var6 >> 6;
		}

		return var4;
	}

	@ObfInfo(name = "bz", desc = "(Lmg;I)I", opaqueValue = "1099110373")
	int method797(class378 var1) {
		int var3 = this.field1387[var1.field2903];
		return var3 < 8192 ? var1.field2900 * var3 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field2900) >> 6);
	}

	@ObfInfo(name = "ai", desc = "()Lbw;")
	protected synchronized class449 method2354() {
		return this.field1409;
	}

	@ObfInfo(name = "az", desc = "()Lbw;")
	protected synchronized class449 method2355() {
		return null;
	}

	@ObfInfo(name = "ap", desc = "()I")
	protected synchronized int method2352() {
		return 0;
	}

	@ObfInfo(name = "aa", desc = "([III)V")
	protected synchronized void method2357(int[] var1, int var2, int var3) {
		if (this.field1403.method1180()) {
			int var4 = this.field1403.field1881 * this.field1392 / class429.field3242;

			do {
				long var5 = (long)var4 * (long)var3 + this.field1407;
				if (this.field1400 - var5 >= 0L) {
					this.field1407 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field1400 - this.field1407) - 1L) / (long)var4);
				this.field1407 += (long)var4 * (long)var7;
				this.field1409.method2357(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method802();
			} while(this.field1403.method1180());
		}

		this.field1409.method2357(var1, var2, var3);
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	protected synchronized void method2356(int var1) {
		if (this.field1403.method1180()) {
			int var2 = this.field1392 * this.field1403.field1881 / class429.field3242;

			do {
				long var3 = this.field1407 + (long)var1 * (long)var2;
				if (this.field1400 - var3 >= 0L) {
					this.field1407 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field1400 - this.field1407) - 1L) / (long)var2);
				this.field1407 += (long)var2 * (long)var5;
				this.field1409.method2356(var5);
				var1 -= var5;
				this.method802();
			} while(this.field1403.method1180());
		}

		this.field1409.method2356(var1);
	}

	@ObfInfo(name = "bx", desc = "(B)V", opaqueValue = "-1")
	void method802() {
		int var2 = this.field1405;
		int var3 = this.field1406;

		long var4;
		for (var4 = this.field1400; this.field1406 == var3; var4 = this.field1403.method1178(var3)) {
			while (this.field1403.field1884[var2] == var3) {
				this.field1403.method1168(var2);
				int var6 = this.field1403.method1172(var2);
				if (var6 == 1) {
					this.field1403.method1170();
					this.field1403.method1169(var2);
					if (this.field1403.method1176()) {
						if (!this.field1404 || var3 == 0) {
							this.method793();
							this.field1403.method1166();
							return;
						}

						this.field1403.method1177(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					this.method795(var6);
				}

				this.field1403.method1171(var2);
				this.field1403.method1169(var2);
			}

			var2 = this.field1403.method1175();
			var3 = this.field1403.field1884[var2];
		}

		this.field1405 = var2;
		this.field1406 = var3;
		this.field1400 = var4;
	}

	@ObfInfo(name = "bn", desc = "(Lmg;I)Z", opaqueValue = "1276015995")
	boolean method813(class378 var1) {
		if (null == var1.field2901) {
			if (var1.field2907 >= 0) {
				var1.method907();
				if (var1.field2909 > 0 && this.field1402[var1.field2903][var1.field2909] == var1) {
					this.field1402[var1.field2903][var1.field2909] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "bw", desc = "(Lmg;[IIII)Z", opaqueValue = "609179502")
	boolean method803(class378 var1, int[] var2, int var3, int var4) {
		var1.field2912 = class429.field3242 / 100;
		if (var1.field2907 < 0 || null != var1.field2901 && !var1.field2901.method380()) {
			int var6 = var1.field2905;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field1394[var1.field2903]) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field2905 = var6;
			}

			var1.field2901.method378(this.method807(var1));
			class21 var7 = var1.field2896;
			boolean var8 = false;
			++var1.field2893;
			var1.field2910 += var7.field395;
			double var9 = 5.086263020833333E-6D * (double)((var1.field2902 * var1.field2905 >> 12) + (var1.field2898 - 60 << 8));
			if (var7.field391 > 0) {
				if (var7.field389 > 0) {
					var1.field2904 += (int)(128.0D * Math.pow(2.0D, (double)var7.field389 * var9) + 0.5D);
				} else {
					var1.field2904 += 128;
				}
			}

			if (var7.field393 != null) {
				if (var7.field390 > 0) {
					var1.field2911 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field390) + 0.5D);
				} else {
					var1.field2911 += 128;
				}

				while (var1.field2906 < var7.field393.length - 2 && var1.field2911 > (var7.field393[var1.field2906 + 2] & 255) << 8) {
					var1.field2906 += 2;
				}

				if (var1.field2906 == var7.field393.length - 2 && var7.field393[var1.field2906 + 1] == 0) {
					var8 = true;
				}
			}

			if (var1.field2907 >= 0 && var7.field398 != null && (this.field1383[var1.field2903] & 1) == 0 && (var1.field2909 < 0 || var1 != this.field1402[var1.field2903][var1.field2909])) {
				if (var7.field392 > 0) {
					var1.field2907 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field392) + 0.5D);
				} else {
					var1.field2907 += 128;
				}

				while (var1.field2908 < var7.field398.length - 2 && var1.field2907 > (var7.field398[2 + var1.field2908] & 255) << 8) {
					var1.field2908 += 2;
				}

				if (var1.field2908 == var7.field398.length - 2) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field2901.method377(var1.field2912);
				if (null != var2) {
					var1.field2901.method2357(var2, var3, var4);
				} else {
					var1.field2901.method2356(var4);
				}

				if (var1.field2901.method381()) {
					this.field1409.field2244.method1990(var1.field2901);
				}

				var1.method2020();
				if (var1.field2907 >= 0) {
					var1.method907();
					if (var1.field2909 > 0 && this.field1402[var1.field2903][var1.field2909] == var1) {
						this.field1402[var1.field2903][var1.field2909] = null;
					}
				}

				return true;
			} else {
				var1.field2901.method385(var1.field2912, this.method808(var1), this.method797(var1));
				return false;
			}
		} else {
			var1.method2020();
			var1.method907();
			if (var1.field2909 > 0 && this.field1402[var1.field2903][var1.field2909] == var1) {
				this.field1402[var1.field2903][var1.field2909] = null;
			}

			return true;
		}
	}
}
