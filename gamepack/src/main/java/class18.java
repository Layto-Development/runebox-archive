import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class18 extends class372 {
	static ThreadPoolExecutor field426;
	static AtomicBoolean field429;
	boolean field422;
	class10 field421;
	class254 field430;
	class354 field427;
	class386[][] field416;
	class386[][] field420;
	int field402;
	int field410;
	int field423;
	int field424;
	int[] field401;
	int[] field403;
	int[] field404;
	int[] field405;
	int[] field406;
	int[] field407;
	int[] field408;
	int[] field409;
	int[] field412;
	int[] field413;
	int[] field414;
	int[] field415;
	int[] field417;
	int[] field419;
	int[] field428;
	PriorityQueue field411;
	long field418;
	long field425;
	public int field431;

	static {
		field429 = null;
		field426 = null;
	}

	public class18() {
		this.field402 = 256;
		this.field410 = 1000000;
		this.field404 = new int[16];
		this.field405 = new int[16];
		this.field406 = new int[16];
		this.field407 = new int[16];
		this.field408 = new int[16];
		this.field413 = new int[16];
		this.field419 = new int[16];
		this.field409 = new int[16];
		this.field412 = new int[16];
		this.field401 = new int[16];
		this.field414 = new int[16];
		this.field415 = new int[16];
		this.field403 = new int[16];
		this.field417 = new int[16];
		this.field428 = new int[16];
		this.field416 = new class386[16][128];
		this.field420 = new class386[16][128];
		this.field421 = new class10();
		this.field427 = new class354(this);
		this.field411 = new PriorityQueue(5, new class105());
		this.field431 = 0;
		this.field430 = new class254(128);
		this.method146();
	}

	public synchronized void method130(int var1) {
		this.field402 = var1;
	}

	public int method158() {
		return this.field402;
	}

	public synchronized boolean method131(class179 var1, class215 var2, class203 var3) {
		boolean var5 = true;
		synchronized(this.field411) {
			this.field411.clear();
		}

		for (class174 var6 = (class174)var1.field1709.method1493(); var6 != null; var6 = (class174)var1.field1709.method1494()) {
			int var7 = (int)var6.field3987;
			class157 var8 = (class157)this.field430.method1492((long)var7);
			if (null == var8) {
				byte[] var10 = var2.method1219(var7);
				class157 var9;
				if (var10 == null) {
					var9 = null;
				} else {
					var9 = new class157(var10);
				}

				var8 = var9;
				if (null == var9) {
					var5 = false;
					continue;
				}

				this.field430.method1495(var9, (long)var7);
			}

			if (!var8.method889(var3, var6.field1691)) {
				var5 = false;
			} else if (null != this.field411) {
				synchronized(this.field411) {
					Iterator var15 = var8.field1465.iterator();

					while (var15.hasNext()) {
						class81 var11 = (class81)var15.next();
						this.field411.add(new class351(var6.field1692, var11));
					}
				}
			}
		}

		return var5;
	}

	public void method132() {
		if (null != this.field411) {
			if (field429 != null) {
				field429.set(true);
			}

			field429 = new AtomicBoolean(false);
			AtomicBoolean var2 = field429;
			if (field426 == null) {
				int var3 = Runtime.getRuntime().availableProcessors();
				field426 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class336(this));
			}

			field426.submit(new class64(this, var2));
		}
	}

	public synchronized void method133() {
		for (class157 var2 = (class157)this.field430.method1493(); null != var2; var2 = (class157)this.field430.method1494()) {
			var2.method890();
		}

	}

	public synchronized void method166() {
		for (class157 var2 = (class157)this.field430.method1493(); var2 != null; var2 = (class157)this.field430.method1494()) {
			var2.method2269();
		}

	}

	public synchronized void method135(class179 var1, boolean var2) {
		this.method168();
		this.field421.method104(var1.field1708);
		this.field422 = var2;
		this.field425 = 0L;
		int var4 = this.field421.method92();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field421.method93(var5);
			this.field421.method96(var5);
			this.field421.method94(var5);
		}

		this.field423 = this.field421.method100();
		this.field424 = this.field421.field354[this.field423];
		this.field418 = this.field421.method103(this.field424);
	}

	public synchronized void method168() {
		this.field421.method91();
		this.method146();
	}

	public synchronized boolean method163() {
		return this.field421.method105();
	}

	public synchronized boolean method136() {
		return this.field430.method1491() > 0;
	}

	public synchronized void method153(int var1, int var2) {
		this.method159(var1, var2);
	}

	void method159(int var1, int var2) {
		this.field407[var1] = var2;
		this.field413[var1] = var2 & -128;
		this.method137(var1, var2);
	}

	void method137(int var1, int var2) {
		if (var2 != this.field408[var1]) {
			this.field408[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field420[var1][var4] = null;
			}
		}

	}

	void method138(int var1, int var2, int var3) {
		this.method139(var1, var2, 64);
		if ((this.field401[var1] & 2) != 0) {
			for (class386 var5 = (class386)this.field427.field3033.method564(); var5 != null; var5 = (class386)this.field427.field3033.method569()) {
				if (var5.field3253 == var1 && var5.field3257 < 0) {
					this.field416[var1][var5.field3248] = null;
					this.field416[var1][var2] = var5;
					int var6 = var5.field3247 + (var5.field3252 * var5.field3255 >> 12);
					var5.field3247 += var2 - var5.field3248 << 8;
					var5.field3252 = var6 - var5.field3247;
					var5.field3255 = 4096;
					var5.field3248 = var2;
					return;
				}
			}
		}

		class157 var9 = (class157)this.field430.method1492((long)this.field408[var1]);
		if (null != var9) {
			if (null != var9.field1458[var2]) {
				class352 var10 = var9.field1458[var2].method541();
				if (var10 != null) {
					class386 var7 = new class386();
					var7.field3253 = var1;
					var7.field3244 = var9;
					var7.field3245 = var10;
					var7.field3246 = var9.field1462[var2];
					var7.field3259 = var9.field1463[var2];
					var7.field3248 = var2;
					var7.field3249 = var9.field1460[var2] * var9.field1464 * var3 * var3 + 1024 >> 11;
					var7.field3250 = var9.field1461[var2] & 255;
					var7.field3247 = (var2 << 8) - (var9.field1459[var2] & 32767);
					var7.field3254 = 0;
					var7.field3261 = 0;
					var7.field3256 = 0;
					var7.field3257 = -1;
					var7.field3258 = 0;
					if (this.field403[var1] == 0) {
						var7.field3251 = class515.method2446(var10, this.method161(var7), this.method162(var7), this.method150(var7));
					} else {
						var7.field3251 = class515.method2446(var10, this.method161(var7), 0, this.method150(var7));
						this.method149(var7, var9.field1459[var2] < 0);
					}

					if (var9.field1459[var2] < 0) {
						var7.field3251.method2447(-1);
					}

					if (var7.field3259 >= 0) {
						class386 var8 = this.field420[var1][var7.field3259];
						if (null != var8 && var8.field3257 < 0) {
							this.field416[var1][var8.field3248] = null;
							var8.field3257 = 0;
						}

						this.field420[var1][var7.field3259] = var7;
					}

					this.field427.field3033.method567(var7);
					this.field416[var1][var2] = var7;
				}
			}
		}
	}

	void method149(class386 var1, boolean var2) {
		int var4 = var1.field3245.field3010.length;
		int var5;
		if (var2 && var1.field3245.field3013) {
			int var6 = var4 + var4 - var1.field3245.field3011;
			var5 = (int)((long)var6 * (long)this.field403[var1.field3253] >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field3251.method2476(true);
			}
		} else {
			var5 = (int)((long)var4 * (long)this.field403[var1.field3253] >> 6);
		}

		var1.field3251.method2452(var5);
	}

	void method139(int var1, int var2, int var3) {
		class386 var5 = this.field416[var1][var2];
		if (var5 != null) {
			this.field416[var1][var2] = null;
			if ((this.field401[var1] & 2) != 0) {
				for (class386 var6 = (class386)this.field427.field3033.method563(); var6 != null; var6 = (class386)this.field427.field3033.method565()) {
					if (var6.field3253 == var5.field3253 && var6.field3257 < 0 && var5 != var6) {
						var5.field3257 = 0;
						break;
					}
				}
			} else {
				var5.field3257 = 0;
			}

		}
	}

	void method140(int var1, int var2, int var3) {
	}

	void method141(int var1, int var2) {
	}

	void method142(int var1, int var2) {
		this.field419[var1] = var2;
	}

	void method165(int var1) {
		for (class386 var3 = (class386)this.field427.field3033.method563(); var3 != null; var3 = (class386)this.field427.field3033.method565()) {
			if (var1 < 0 || var1 == var3.field3253) {
				if (null != var3.field3251) {
					var3.field3251.method2454(class337.field2934 / 100);
					if (var3.field3251.method2458()) {
						this.field427.field3031.method2045(var3.field3251);
					}

					var3.method2039();
				}

				if (var3.field3257 < 0) {
					this.field416[var3.field3253][var3.field3248] = null;
				}

				var3.method2269();
			}
		}

	}

	void method143(int var1) {
		if (var1 >= 0) {
			this.field404[var1] = 12800;
			this.field405[var1] = 8192;
			this.field406[var1] = 16383;
			this.field419[var1] = 8192;
			this.field409[var1] = 0;
			this.field412[var1] = 8192;
			this.method145(var1);
			this.method160(var1);
			this.field401[var1] = 0;
			this.field414[var1] = 32767;
			this.field415[var1] = 256;
			this.field403[var1] = 0;
			this.method147(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method143(var1);
			}

		}
	}

	void method144(int var1) {
		for (class386 var3 = (class386)this.field427.field3033.method563(); null != var3; var3 = (class386)this.field427.field3033.method565()) {
			if ((var1 < 0 || var3.field3253 == var1) && var3.field3257 < 0) {
				this.field416[var3.field3253][var3.field3248] = null;
				var3.field3257 = 0;
			}
		}

	}

	void method146() {
		this.method165(-1);
		this.method143(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field408[var2] = this.field407[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field413[var2] = this.field407[var2] & -128;
		}

	}

	void method145(int var1) {
		if ((this.field401[var1] & 2) != 0) {
			for (class386 var3 = (class386)this.field427.field3033.method563(); var3 != null; var3 = (class386)this.field427.field3033.method565()) {
				if (var3.field3253 == var1 && null == this.field416[var1][var3.field3248] && var3.field3257 < 0) {
					var3.field3257 = 0;
				}
			}
		}

	}

	void method160(int var1) {
		if ((this.field401[var1] & 4) != 0) {
			for (class386 var3 = (class386)this.field427.field3033.method563(); var3 != null; var3 = (class386)this.field427.field3033.method565()) {
				if (var1 == var3.field3253) {
					var3.field3263 = 0;
				}
			}
		}

	}

	void method148(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method139(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method138(var4, var5, var6);
			} else {
				this.method139(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method140(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field413[var4] = (this.field413[var4] & -2080769) + (var6 << 14);
			}

			if (var5 == 32) {
				this.field413[var4] = (var6 << 7) + (this.field413[var4] & -16257);
			}

			if (var5 == 1) {
				this.field409[var4] = (var6 << 7) + (this.field409[var4] & -16257);
			}

			if (var5 == 33) {
				this.field409[var4] = var6 + (this.field409[var4] & -128);
			}

			if (var5 == 5) {
				this.field412[var4] = (var6 << 7) + (this.field412[var4] & -16257);
			}

			if (var5 == 37) {
				this.field412[var4] = var6 + (this.field412[var4] & -128);
			}

			if (var5 == 7) {
				this.field404[var4] = (this.field404[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 39) {
				this.field404[var4] = (this.field404[var4] & -128) + var6;
			}

			if (var5 == 10) {
				this.field405[var4] = (this.field405[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 42) {
				this.field405[var4] = var6 + (this.field405[var4] & -128);
			}

			if (var5 == 11) {
				this.field406[var4] = (this.field406[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 43) {
				this.field406[var4] = var6 + (this.field406[var4] & -128);
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field401;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field401;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field401;
					var10000[var4] |= 2;
				} else {
					this.method145(var4);
					var10000 = this.field401;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field414[var4] = (var6 << 7) + (this.field414[var4] & 127);
			}

			if (var5 == 98) {
				this.field414[var4] = var6 + (this.field414[var4] & 16256);
			}

			if (var5 == 101) {
				this.field414[var4] = (var6 << 7) + (this.field414[var4] & 127) + 16384;
			}

			if (var5 == 100) {
				this.field414[var4] = 16384 + (this.field414[var4] & 16256) + var6;
			}

			if (var5 == 120) {
				this.method165(var4);
			}

			if (var5 == 121) {
				this.method143(var4);
			}

			if (var5 == 123) {
				this.method144(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field414[var4];
				if (var7 == 16384) {
					this.field415[var4] = (var6 << 7) + (this.field415[var4] & -16257);
				}
			}

			if (var5 == 38) {
				var7 = this.field414[var4];
				if (var7 == 16384) {
					this.field415[var4] = (this.field415[var4] & -128) + var6;
				}
			}

			if (var5 == 16) {
				this.field403[var4] = (var6 << 7) + (this.field403[var4] & -16257);
			}

			if (var5 == 48) {
				this.field403[var4] = (this.field403[var4] & -128) + var6;
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field401;
					var10000[var4] |= 4;
				} else {
					this.method160(var4);
					var10000 = this.field401;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method147(var4, (this.field417[var4] & -16257) + (var6 << 7));
			}

			if (var5 == 49) {
				this.method147(var4, (this.field417[var4] & -128) + var6);
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method137(var4, this.field413[var4] + var5);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method141(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
			this.method142(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method146();
			}
		}
	}

	void method147(int var1, int var2) {
		this.field417[var1] = var2;
		this.field428[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	int method161(class386 var1) {
		int var3 = var1.field3247 + (var1.field3255 * var1.field3252 >> 12);
		var3 += (this.field419[var1.field3253] - 8192) * this.field415[var1.field3253] >> 12;
		class401 var4 = var1.field3246;
		int var5;
		if (var4.field3367 > 0 && (var4.field3366 > 0 || this.field409[var1.field3253] > 0)) {
			var5 = var4.field3366 << 2;
			int var6 = var4.field3368 << 1;
			if (var1.field3243 < var6) {
				var5 = var5 * var1.field3243 / var6;
			}

			var5 += this.field409[var1.field3253] >> 7;
			double var7 = Math.sin(0.01227184630308513D * (double)(var1.field3260 & 511));
			var3 += (int)((double)var5 * var7);
		}

		var5 = (int)((double)(var1.field3245.field3012 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)class337.field2934 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	int method162(class386 var1) {
		class401 var3 = var1.field3246;
		int var4 = 4096 + this.field404[var1.field3253] * this.field406[var1.field3253] >> 13;
		var4 = 16384 + var4 * var4 >> 15;
		var4 = var4 * var1.field3249 + 16384 >> 15;
		var4 = var4 * this.field402 + 128 >> 8;
		if (var3.field3363 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3254 * (double)var3.field3363) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (var3.field3365 != null) {
			var5 = var1.field3261;
			var6 = var3.field3365[var1.field3256 + 1];
			if (var1.field3256 < var3.field3365.length - 2) {
				var7 = (var3.field3365[var1.field3256] & 255) << 8;
				var8 = (var3.field3365[var1.field3256 + 2] & 255) << 8;
				var6 += (var3.field3365[3 + var1.field3256] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var6 * var4 + 32 >> 6;
		}

		if (var1.field3257 > 0 && null != var3.field3370) {
			var5 = var1.field3257;
			var6 = var3.field3370[var1.field3258 + 1];
			if (var1.field3258 < var3.field3370.length - 2) {
				var7 = (var3.field3370[var1.field3258] & 255) << 8;
				var8 = (var3.field3370[var1.field3258 + 2] & 255) << 8;
				var6 += (var5 - var7) * (var3.field3370[3 + var1.field3258] - var6) / (var8 - var7);
			}

			var4 = 32 + var4 * var6 >> 6;
		}

		return var4;
	}

	int method150(class386 var1) {
		int var3 = this.field405[var1.field3253];
		return var3 < 8192 ? var1.field3250 * var3 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field3250) >> 6);
	}

	protected synchronized class372 method1980() {
		return this.field427;
	}

	protected synchronized class372 method1981() {
		return null;
	}

	protected synchronized int method1978() {
		return 0;
	}

	protected synchronized void method1983(int[] var1, int var2, int var3) {
		if (this.field421.method105()) {
			int var4 = this.field421.field351 * this.field410 / class337.field2934;

			do {
				long var5 = (long)var4 * (long)var3 + this.field425;
				if (this.field418 - var5 >= 0L) {
					this.field425 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field418 - this.field425) - 1L) / (long)var4);
				this.field425 += (long)var4 * (long)var7;
				this.field427.method1983(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method156();
			} while(this.field421.method105());
		}

		this.field427.method1983(var1, var2, var3);
	}

	protected synchronized void method1982(int var1) {
		if (this.field421.method105()) {
			int var2 = this.field410 * this.field421.field351 / class337.field2934;

			do {
				long var3 = this.field425 + (long)var1 * (long)var2;
				if (this.field418 - var3 >= 0L) {
					this.field425 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field418 - this.field425) - 1L) / (long)var2);
				this.field425 += (long)var2 * (long)var5;
				this.field427.method1982(var5);
				var1 -= var5;
				this.method156();
			} while(this.field421.method105());
		}

		this.field427.method1982(var1);
	}

	void method156() {
		int var2 = this.field423;
		int var3 = this.field424;

		long var4;
		for (var4 = this.field418; this.field424 == var3; var4 = this.field421.method103(var3)) {
			while (this.field421.field354[var2] == var3) {
				this.field421.method93(var2);
				int var6 = this.field421.method97(var2);
				if (var6 == 1) {
					this.field421.method95();
					this.field421.method94(var2);
					if (this.field421.method101()) {
						if (!this.field422 || var3 == 0) {
							this.method146();
							this.field421.method91();
							return;
						}

						this.field421.method102(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					this.method148(var6);
				}

				this.field421.method96(var2);
				this.field421.method94(var2);
			}

			var2 = this.field421.method100();
			var3 = this.field421.field354[var2];
		}

		this.field423 = var2;
		this.field424 = var3;
		this.field418 = var4;
	}

	boolean method167(class386 var1) {
		if (null == var1.field3251) {
			if (var1.field3257 >= 0) {
				var1.method2269();
				if (var1.field3259 > 0 && this.field420[var1.field3253][var1.field3259] == var1) {
					this.field420[var1.field3253][var1.field3259] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	boolean method157(class386 var1, int[] var2, int var3, int var4) {
		var1.field3262 = class337.field2934 / 100;
		if (var1.field3257 < 0 || null != var1.field3251 && !var1.field3251.method2457()) {
			int var6 = var1.field3255;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field412[var1.field3253]) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field3255 = var6;
			}

			var1.field3251.method2455(this.method161(var1));
			class401 var7 = var1.field3246;
			boolean var8 = false;
			++var1.field3243;
			var1.field3260 += var7.field3367;
			double var9 = 5.086263020833333E-6D * (double)((var1.field3252 * var1.field3255 >> 12) + (var1.field3248 - 60 << 8));
			if (var7.field3363 > 0) {
				if (var7.field3361 > 0) {
					var1.field3254 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3361 * var9) + 0.5D);
				} else {
					var1.field3254 += 128;
				}
			}

			if (var7.field3365 != null) {
				if (var7.field3362 > 0) {
					var1.field3261 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field3362) + 0.5D);
				} else {
					var1.field3261 += 128;
				}

				while (var1.field3256 < var7.field3365.length - 2 && var1.field3261 > (var7.field3365[var1.field3256 + 2] & 255) << 8) {
					var1.field3256 += 2;
				}

				if (var1.field3256 == var7.field3365.length - 2 && var7.field3365[var1.field3256 + 1] == 0) {
					var8 = true;
				}
			}

			if (var1.field3257 >= 0 && var7.field3370 != null && (this.field401[var1.field3253] & 1) == 0 && (var1.field3259 < 0 || var1 != this.field420[var1.field3253][var1.field3259])) {
				if (var7.field3364 > 0) {
					var1.field3257 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field3364) + 0.5D);
				} else {
					var1.field3257 += 128;
				}

				while (var1.field3258 < var7.field3370.length - 2 && var1.field3257 > (var7.field3370[2 + var1.field3258] & 255) << 8) {
					var1.field3258 += 2;
				}

				if (var1.field3258 == var7.field3370.length - 2) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field3251.method2454(var1.field3262);
				if (null != var2) {
					var1.field3251.method1983(var2, var3, var4);
				} else {
					var1.field3251.method1982(var4);
				}

				if (var1.field3251.method2458()) {
					this.field427.field3031.method2045(var1.field3251);
				}

				var1.method2039();
				if (var1.field3257 >= 0) {
					var1.method2269();
					if (var1.field3259 > 0 && this.field420[var1.field3253][var1.field3259] == var1) {
						this.field420[var1.field3253][var1.field3259] = null;
					}
				}

				return true;
			} else {
				var1.field3251.method2459(var1.field3262, this.method162(var1), this.method150(var1));
				return false;
			}
		} else {
			var1.method2039();
			var1.method2269();
			if (var1.field3259 > 0 && this.field420[var1.field3253][var1.field3259] == var1) {
				this.field420[var1.field3253][var1.field3259] = null;
			}

			return true;
		}
	}

	public static class385[] method170() {
		return new class385[]{class385.field3239, class385.field3242, class385.field3241};
	}

	public static class397[] method154() {
		return new class397[]{class397.field3335, class397.field3349, class397.field3329, class397.field3331, class397.field3330, class397.field3340, class397.field3338, class397.field3336, class397.field3333, class397.field3345, class397.field3344, class397.field3343, class397.field3334, class397.field3341, class397.field3339, class397.field3342, class397.field3337};
	}

	static class22 method169(int var0) {
		class22 var2 = (class22)class393.field3290.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			var2 = class398.method2078(class243.field2218, class180.field1710, var0, false);
			if (var2 != null) {
				class393.field3290.method1889(var2, (long)var0);
			}

			return var2;
		}
	}
}
