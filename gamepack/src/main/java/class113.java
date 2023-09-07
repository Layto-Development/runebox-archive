import java.util.Arrays;
import java.util.HashMap;

public class class113 extends class189 {

	static boolean field1378;

	static boolean[] field1354;

	static boolean[] field1355;

	static byte[] field1320;

	static byte[] field1384;

	static char[] field1364;

	static char[][] field1365;

	static class113 field1319;

	static class113 field1358;

	static class31 field1321;

	static class31 field1322;

	static class31 field1323;

	static float[] field1362;

	static float[] field1376;

	static int field1375;

	static int field1377;

	static int field1388;

	static int[] field1324;

	static int[] field1346;

	static int[] field1356;

	static int[] field1357;

	static int[] field1359;

	static int[] field1360;

	static int[] field1361;

	static int[] field1366;

	static int[] field1367;

	static int[] field1368;

	static int[] field1370;

	static int[] field1371;

	static int[] field1372;

	static int[] field1373;

	static int[] field1380;

	static int[] field1381;

	static int[] field1382;

	static int[][] field1363;

	static final float field1385;

	byte[] field1335;

	byte[] field1336;

	byte[] field1386;

	int field1347;

	int field1348;

	int field1349;

	int field1350;

	int field1374;

	int[] field1325;

	int[] field1326;

	int[] field1329;

	int[] field1330;

	int[] field1331;

	int[] field1332;

	int[] field1333;

	int[] field1334;

	int[] field1340;

	int[] field1341;

	int[] field1342;

	int[] field1387;

	int[][] field1343;

	int[][] field1344;

	int[][] field1345;

	int[][] field1369;

	HashMap field1352;

	short[] field1337;

	public boolean field1328;

	public byte field1338;

	public byte field1351;

	public byte field1353;

	public byte field1383;

	public byte field1389;

	public int field1327;

	public int field1339;

	public int field1379;

	public short field1390;

	static {
		field1358 = new class113();
		field1384 = new byte[1];
		field1319 = new class113();
		field1320 = new byte[1];
		field1321 = new class31();
		field1322 = new class31();
		field1323 = new class31();
		field1354 = new boolean[6500];
		field1355 = new boolean[6500];
		field1356 = new int[6500];
		field1357 = new int[6500];
		field1362 = new float[6500];
		field1359 = new int[6500];
		field1360 = new int[6500];
		field1361 = new int[6500];
		field1367 = new int[6500];
		field1364 = new char[6000];
		field1365 = new char[6000][512];
		field1366 = new int[12];
		field1363 = new int[12][2000];
		field1368 = new int[2000];
		field1324 = new int[2000];
		field1370 = new int[12];
		field1371 = new int[10];
		field1372 = new int[10];
		field1373 = new int[10];
		field1376 = new float[10];
		field1378 = true;
		field1380 = class238.field2037;
		field1381 = class238.field2035;
		field1382 = class238.field2034;
		field1346 = class238.field2036;
		field1385 = class309.method1673(50);
	}

	class113() {
		this.field1379 = 0;
		this.field1327 = 0;
		this.field1338 = 0;
		this.field1339 = 0;
		this.field1328 = false;
		this.field1352 = new HashMap();
	}

	public class113(class113[] var1, int var2) {
		this.field1379 = 0;
		this.field1327 = 0;
		this.field1338 = 0;
		this.field1339 = 0;
		this.field1328 = false;
		this.field1352 = new HashMap();
		this.field1379 = 0;
		this.field1327 = 0;
		this.field1339 = 0;
		this.field1338 = -1;
		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			class113 var4 = var1[var3];
			if (var4 != null) {
				this.field1379 += var4.field1379;
				this.field1327 += var4.field1327;
				this.field1339 += var4.field1339;
				if (this.field1338 == -1) {
					this.field1338 = var4.field1338;
				}
			}
		}
		this.method675(this.field1379, this.field1327, this.field1339);
		this.field1379 = 0;
		this.field1327 = 0;
		this.field1339 = 0;
		for (var3 = 0; var3 < var2; ++var3) {
			this.method702(var1[var3]);
		}
	}

	public class113(int var1, int var2, int var3, byte var4) {
		this.field1379 = 0;
		this.field1327 = 0;
		this.field1338 = 0;
		this.field1339 = 0;
		this.field1328 = false;
		this.field1352 = new HashMap();
		this.method675(var1, var2, var3);
		this.field1338 = var4;
		this.field1379 = 0;
		this.field1327 = 0;
		this.field1339 = 0;
	}

	void method675(int var1, int var2, int var3) {
		this.field1325 = new int[var1];
		this.field1326 = new int[var1];
		this.field1330 = new int[var1];
		this.field1342 = new int[var2];
		this.field1329 = new int[var2];
		this.field1387 = new int[var2];
		this.field1331 = new int[var2];
		this.field1332 = new int[var2];
		this.field1333 = new int[var2];
		if (var3 > 0) {
			this.field1340 = new int[var3];
			this.field1341 = new int[var3];
			this.field1334 = new int[var3];
		}
	}

	void method707(class113 var1) {
		int var2 = this.field1342.length;
		if (this.field1386 == null && (var1.field1386 != null || this.field1338 != var1.field1338)) {
			this.field1386 = new byte[var2];
			Arrays.fill(this.field1386, this.field1338);
		}
		if (this.field1335 == null && var1.field1335 != null) {
			this.field1335 = new byte[var2];
			Arrays.fill(this.field1335, (byte) 0);
		}
		if (this.field1337 == null && var1.field1337 != null) {
			this.field1337 = new short[var2];
			Arrays.fill(this.field1337, (short) -1);
		}
		if (this.field1336 == null && var1.field1336 != null) {
			this.field1336 = new byte[var2];
			Arrays.fill(this.field1336, (byte) -1);
		}
	}

	public void method702(class113 var1) {
		if (var1 != null) {
			this.method707(var1);
			int var2;
			for (var2 = 0; var2 < var1.field1327; ++var2) {
				this.field1342[this.field1327] = var1.field1342[var2] + this.field1379;
				this.field1329[this.field1327] = var1.field1329[var2] + this.field1379;
				this.field1387[this.field1327] = var1.field1387[var2] + this.field1379;
				this.field1331[this.field1327] = var1.field1331[var2];
				this.field1332[this.field1327] = var1.field1332[var2];
				this.field1333[this.field1327] = var1.field1333[var2];
				if (this.field1386 != null) {
					this.field1386[this.field1327] = var1.field1386 != null ? var1.field1386[var2] : var1.field1338;
				}
				if (this.field1335 != null && var1.field1335 != null) {
					this.field1335[this.field1327] = var1.field1335[var2];
				}
				if (this.field1337 != null) {
					this.field1337[this.field1327] = var1.field1337 != null ? var1.field1337[var2] : -1;
				}
				if (this.field1336 != null) {
					if (var1.field1336 != null && var1.field1336[var2] != -1) {
						this.field1336[this.field1327] = (byte) (var1.field1336[var2] + this.field1339);
					} else {
						this.field1336[this.field1327] = -1;
					}
				}
				++this.field1327;
			}
			for (var2 = 0; var2 < var1.field1339; ++var2) {
				this.field1340[this.field1339] = var1.field1340[var2] + this.field1379;
				this.field1341[this.field1339] = var1.field1341[var2] + this.field1379;
				this.field1334[this.field1339] = var1.field1334[var2] + this.field1379;
				++this.field1339;
			}
			for (var2 = 0; var2 < var1.field1379; ++var2) {
				this.field1325[this.field1379] = var1.field1325[var2];
				this.field1326[this.field1379] = var1.field1326[var2];
				this.field1330[this.field1379] = var1.field1330[var2];
				++this.field1379;
			}
		}
	}

	public class113 method677(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method679();
		int var7 = var2 - this.field1349;
		int var8 = var2 + this.field1349;
		int var9 = var4 - this.field1349;
		int var10 = var4 + this.field1349;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class113 var11;
				if (var5) {
					var11 = new class113();
					var11.field1379 = this.field1379;
					var11.field1327 = this.field1327;
					var11.field1339 = this.field1339;
					var11.field1325 = this.field1325;
					var11.field1330 = this.field1330;
					var11.field1342 = this.field1342;
					var11.field1329 = this.field1329;
					var11.field1387 = this.field1387;
					var11.field1331 = this.field1331;
					var11.field1332 = this.field1332;
					var11.field1333 = this.field1333;
					var11.field1386 = this.field1386;
					var11.field1335 = this.field1335;
					var11.field1336 = this.field1336;
					var11.field1337 = this.field1337;
					var11.field1338 = this.field1338;
					var11.field1340 = this.field1340;
					var11.field1341 = this.field1341;
					var11.field1334 = this.field1334;
					var11.field1343 = this.field1343;
					var11.field1344 = this.field1344;
					var11.field1328 = this.field1328;
					var11.field1326 = new int[var11.field1379];
				} else {
					var11 = this;
				}
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field1379; ++var12) {
						var13 = this.field1325[var12] + var2;
						var14 = this.field1330[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field1326[var12] = this.field1326[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field1379; ++var12) {
						var13 = (-this.field1326[var12] << 16) / super.field1834;
						if (var13 < var6) {
							var14 = this.field1325[var12] + var2;
							var15 = this.field1330[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field1326[var12] = this.field1326[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}
				var11.method682();
				return var11;
			}
		} else {
			return this;
		}
	}

	public class113 method678(boolean var1) {
		if (!var1 && field1384.length < this.field1327) {
			field1384 = new byte[this.field1327 + 100];
		}
		return this.method701(var1, field1358, field1384);
	}

	public class113 method705(boolean var1) {
		if (!var1 && field1320.length < this.field1327) {
			field1320 = new byte[this.field1327 + 100];
		}
		return this.method701(var1, field1319, field1320);
	}

	class113 method701(boolean var1, class113 var2, byte[] var3) {
		var2.field1379 = this.field1379;
		var2.field1327 = this.field1327;
		var2.field1339 = this.field1339;
		if (var2.field1325 == null || var2.field1325.length < this.field1379) {
			var2.field1325 = new int[this.field1379 + 100];
			var2.field1326 = new int[this.field1379 + 100];
			var2.field1330 = new int[this.field1379 + 100];
		}
		int var4;
		for (var4 = 0; var4 < this.field1379; ++var4) {
			var2.field1325[var4] = this.field1325[var4];
			var2.field1326[var4] = this.field1326[var4];
			var2.field1330[var4] = this.field1330[var4];
		}
		if (var1) {
			var2.field1335 = this.field1335;
		} else {
			var2.field1335 = var3;
			if (this.field1335 == null) {
				for (var4 = 0; var4 < this.field1327; ++var4) {
					var2.field1335[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field1327; ++var4) {
					var2.field1335[var4] = this.field1335[var4];
				}
			}
		}
		var2.field1342 = this.field1342;
		var2.field1329 = this.field1329;
		var2.field1387 = this.field1387;
		var2.field1331 = this.field1331;
		var2.field1332 = this.field1332;
		var2.field1333 = this.field1333;
		var2.field1386 = this.field1386;
		var2.field1336 = this.field1336;
		var2.field1337 = this.field1337;
		var2.field1338 = this.field1338;
		var2.field1340 = this.field1340;
		var2.field1341 = this.field1341;
		var2.field1334 = this.field1334;
		var2.field1343 = this.field1343;
		var2.field1344 = this.field1344;
		var2.field1345 = this.field1345;
		var2.field1369 = this.field1369;
		var2.field1328 = this.field1328;
		var2.method682();
		var2.field1389 = 0;
		return var2;
	}

	void method709(int var1) {
		if (!this.field1352.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field1381[var1];
			int var9 = field1380[var1];
			for (int var10 = 0; var10 < this.field1379; ++var10) {
				int var12 = this.field1325[var10];
				int var13 = this.field1330[var10];
				int var11 = var12 * var8 + var13 * var9 >> 16;
				int var15 = this.field1326[var10];
				int var17 = this.field1325[var10];
				int var18 = this.field1330[var10];
				int var16 = var18 * var8 - var9 * var17 >> 16;
				if (var11 < var2) {
					var2 = var11;
				}
				if (var11 > var5) {
					var5 = var11;
				}
				if (var15 < var3) {
					var3 = var15;
				}
				if (var15 > var6) {
					var6 = var15;
				}
				if (var16 < var4) {
					var4 = var16;
				}
				if (var16 > var7) {
					var7 = var16;
				}
			}
			class90 var20 = new class90((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var21 = true;
			if (var20.field893 < 32) {
				var20.field893 = 32;
			}
			if (var20.field895 < 32) {
				var20.field895 = 32;
			}
			if (this.field1328) {
				boolean var22 = true;
				var20.field893 += 8;
				var20.field895 += 8;
			}
			this.field1352.put(var1, var20);
		}
	}

	public void method679() {
		if (this.field1347 != 1) {
			this.field1347 = 1;
			super.field1834 = 0;
			this.field1348 = 0;
			this.field1349 = 0;
			for (int var1 = 0; var1 < this.field1379; ++var1) {
				int var2 = this.field1325[var1];
				int var3 = this.field1326[var1];
				int var4 = this.field1330[var1];
				if (-var3 > super.field1834) {
					super.field1834 = -var3;
				}
				if (var3 > this.field1348) {
					this.field1348 = var3;
				}
				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.field1349) {
					this.field1349 = var5;
				}
			}
			this.field1349 = (int) (Math.sqrt((double) this.field1349) + 0.99D);
			this.field1374 = (int) (Math.sqrt((double) (this.field1349 * this.field1349 + super.field1834 * super.field1834)) + 0.99D);
			this.field1350 = this.field1374 + (int) (Math.sqrt((double) (this.field1349 * this.field1349 + this.field1348 * this.field1348)) + 0.99D);
		}
	}

	void method708() {
		if (this.field1347 != 2) {
			this.field1347 = 2;
			this.field1349 = 0;
			for (int var1 = 0; var1 < this.field1379; ++var1) {
				int var2 = this.field1325[var1];
				int var3 = this.field1326[var1];
				int var4 = this.field1330[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.field1349) {
					this.field1349 = var5;
				}
			}
			this.field1349 = (int) (Math.sqrt((double) this.field1349) + 0.99D);
			this.field1374 = this.field1349;
			this.field1350 = this.field1349 + this.field1349;
		}
	}

	public int method681() {
		this.method679();
		return this.field1349;
	}

	public void method682() {
		this.field1347 = 0;
		this.field1352.clear();
	}

	public void method704(class513 var1, int var2) {
		if (this.field1343 != null) {
			if (var2 != -1) {
				class466 var3 = var1.field4089[var2];
				class413 var4 = var3.field3691;
				field1375 = 0;
				field1388 = 0;
				field1377 = 0;
				for (int var5 = 0; var5 < var3.field3694; ++var5) {
					int var6 = var3.field3693[var5];
					this.method688(var4.field3211[var6], var4.field3212[var6], var3.field3697[var5], var3.field3698[var5], var3.field3699[var5]);
				}
				this.method682();
			}
		}
	}

	public void method683(class421 var1, int var2) {
		class413 var3 = var1.field3245;
		class357 var4 = var3.method2087();
		if (var4 != null) {
			var3.method2087().method1874(var1, var2);
			this.method710(var3.method2087(), var1.method2116());
		}
		if (var1.method2117()) {
			this.method684(var1, var2);
		}
		this.method682();
	}

	void method684(class421 var1, int var2) {
		class413 var3 = var1.field3245;
		for (int var4 = 0; var4 < var3.field3210; ++var4) {
			int var5 = var3.field3211[var4];
			if (var5 == 5 && var1.field3250 != null && var1.field3250[var4] != null && var1.field3250[var4][0] != null && this.field1344 != null && this.field1335 != null) {
				class377 var6 = var1.field3250[var4][0];
				int[] var7 = var3.field3212[var4];
				int var8 = var7.length;
				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.field1344.length) {
						int[] var11 = this.field1344[var10];
						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int) ((float) (this.field1335[var13] & 255) + var6.method1999(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}
							this.field1335[var13] = (byte) var14;
						}
					}
				}
			}
		}
	}

	void method710(class357 var1, int var2) {
		this.method703(var1, var2);
	}

	public void method696(class513 var1, int var2, class513 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				class466 var6 = var1.field4089[var2];
				class466 var7 = var3.field4089[var4];
				class413 var8 = var6.field3691;
				field1375 = 0;
				field1388 = 0;
				field1377 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[0];
				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field3694; ++var11) {
					for (var12 = var6.field3693[var11]; var12 > var10; var10 = var5[var13++]) {
					}
					if (var12 != var10 || var8.field3211[var12] == 0) {
						this.method688(var8.field3211[var12], var8.field3212[var12], var6.field3697[var11], var6.field3698[var11], var6.field3699[var11]);
					}
				}
				field1375 = 0;
				field1388 = 0;
				field1377 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[0];
				for (var11 = 0; var11 < var7.field3694; ++var11) {
					for (var12 = var7.field3693[var11]; var12 > var10; var10 = var5[var13++]) {
					}
					if (var12 == var10 || var8.field3211[var12] == 0) {
						this.method688(var8.field3211[var12], var8.field3212[var12], var7.field3697[var11], var7.field3698[var11], var7.field3699[var11]);
					}
				}
				this.method682();
			} else {
				this.method704(var1, var2);
			}
		}
	}

	public void method686(class413 var1, class421 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class357 var7 = var1.method2087();
		if (var7 != null) {
			var7.method1875(var2, var3, var4, var5);
			if (var6) {
				this.method710(var7, var2.method2116());
			}
		}
		if (!var5 && var2.method2117()) {
			this.method684(var2, var3);
		}
	}

	public void method687(class513 var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.method704(var1, var2);
		} else {
			class466 var5 = var1.field4089[var2];
			class413 var6 = var5.field3691;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[0];
			field1375 = 0;
			field1388 = 0;
			field1377 = 0;
			for (int var9 = 0; var9 < var5.field3694; ++var9) {
				int var10;
				for (var10 = var5.field3693[var9]; var10 > var8; var8 = var3[var11++]) {
				}
				if (var4) {
					if (var10 == var8 || var6.field3211[var10] == 0) {
						this.method688(var6.field3211[var10], var6.field3212[var10], var5.field3697[var9], var5.field3698[var9], var5.field3699[var9]);
					}
				} else if (var10 != var8 || var6.field3211[var10] == 0) {
					this.method688(var6.field3211[var10], var6.field3212[var10], var5.field3697[var9], var5.field3698[var9], var5.field3699[var9]);
				}
			}
		}
	}

	void method688(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field1375 = 0;
			field1388 = 0;
			field1377 = 0;
			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.field1343.length) {
					int[] var19 = this.field1343[var18];
					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						field1375 += this.field1325[var12];
						field1388 += this.field1326[var12];
						field1377 += this.field1330[var12];
						++var7;
					}
				}
			}
			if (var7 > 0) {
				field1375 = field1375 / var7 + var3;
				field1388 = field1388 / var7 + var4;
				field1377 = field1377 / var7 + var5;
			} else {
				field1375 = var3;
				field1388 = var4;
				field1377 = var5;
			}
		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field1343.length) {
						var9 = this.field1343[var8];
						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field1325;
							var10000[var11] += var3;
							var10000 = this.field1326;
							var10000[var11] += var4;
							var10000 = this.field1330;
							var10000[var11] += var5;
						}
					}
				}
			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field1343.length) {
						var9 = this.field1343[var8];
						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field1325;
							var10000[var11] -= field1375;
							var10000 = this.field1326;
							var10000[var11] -= field1388;
							var10000 = this.field1330;
							var10000[var11] -= field1377;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field1380[var14];
								var16 = field1381[var14];
								var17 = this.field1326[var11] * var15 + this.field1325[var11] * var16 >> 16;
								this.field1326[var11] = this.field1326[var11] * var16 - this.field1325[var11] * var15 >> 16;
								this.field1325[var11] = var17;
							}
							if (var12 != 0) {
								var15 = field1380[var12];
								var16 = field1381[var12];
								var17 = this.field1326[var11] * var16 - this.field1330[var11] * var15 >> 16;
								this.field1330[var11] = this.field1326[var11] * var15 + this.field1330[var11] * var16 >> 16;
								this.field1326[var11] = var17;
							}
							if (var13 != 0) {
								var15 = field1380[var13];
								var16 = field1381[var13];
								var17 = this.field1330[var11] * var15 + this.field1325[var11] * var16 >> 16;
								this.field1330[var11] = this.field1330[var11] * var16 - this.field1325[var11] * var15 >> 16;
								this.field1325[var11] = var17;
							}
							var10000 = this.field1325;
							var10000[var11] += field1375;
							var10000 = this.field1326;
							var10000[var11] += field1388;
							var10000 = this.field1330;
							var10000[var11] += field1377;
						}
					}
				}
			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field1343.length) {
						var9 = this.field1343[var8];
						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.field1325;
							var10000[var11] -= field1375;
							var10000 = this.field1326;
							var10000[var11] -= field1388;
							var10000 = this.field1330;
							var10000[var11] -= field1377;
							this.field1325[var11] = this.field1325[var11] * var3 / 128;
							this.field1326[var11] = this.field1326[var11] * var4 / 128;
							this.field1330[var11] = this.field1330[var11] * var5 / 128;
							var10000 = this.field1325;
							var10000[var11] += field1375;
							var10000 = this.field1326;
							var10000[var11] += field1388;
							var10000 = this.field1330;
							var10000[var11] += field1377;
						}
					}
				}
			} else if (var1 == 5) {
				if (this.field1344 != null && this.field1335 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field1344.length) {
							var9 = this.field1344[var8];
							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.field1335[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}
								this.field1335[var11] = (byte) var12;
							}
						}
					}
				}
			}
		}
	}

	public void method689() {
		for (int var1 = 0; var1 < this.field1379; ++var1) {
			int var2 = this.field1325[var1];
			this.field1325[var1] = this.field1330[var1];
			this.field1330[var1] = -var2;
		}
		this.method682();
	}

	public void method690() {
		for (int var1 = 0; var1 < this.field1379; ++var1) {
			this.field1325[var1] = -this.field1325[var1];
			this.field1330[var1] = -this.field1330[var1];
		}
		this.method682();
	}

	public void method691() {
		for (int var1 = 0; var1 < this.field1379; ++var1) {
			int var2 = this.field1330[var1];
			this.field1330[var1] = this.field1325[var1];
			this.field1325[var1] = -var2;
		}
		this.method682();
	}

	public void method700(int var1) {
		int var2 = field1380[var1];
		int var3 = field1381[var1];
		for (int var4 = 0; var4 < this.field1379; ++var4) {
			int var5 = this.field1326[var4] * var3 - this.field1330[var4] * var2 >> 16;
			this.field1330[var4] = this.field1326[var4] * var2 + this.field1330[var4] * var3 >> 16;
			this.field1326[var4] = var5;
		}
		this.method682();
	}

	public void method680(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1379; ++var4) {
			int[] var10000 = this.field1325;
			var10000[var4] += var1;
			var10000 = this.field1326;
			var10000[var4] += var2;
			var10000 = this.field1330;
			var10000[var4] += var3;
		}
		this.method682();
	}

	public void method692(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1379; ++var4) {
			this.field1325[var4] = this.field1325[var4] * var1 / 128;
			this.field1326[var4] = this.field1326[var4] * var2 / 128;
			this.field1330[var4] = this.field1330[var4] * var3 / 128;
		}
		this.method682();
	}

	public final void method685(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.field1347 != 2 && this.field1347 != 1) {
			this.method708();
		}
		int var8 = class238.method1389();
		int var9 = class238.method1390();
		int var10 = field1380[0];
		int var11 = field1381[0];
		int var12 = field1380[var2];
		int var13 = field1381[var2];
		int var14 = field1380[var3];
		int var15 = field1381[var3];
		int var16 = field1380[var4];
		int var17 = field1381[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;
		for (int var19 = 0; var19 < this.field1379; ++var19) {
			int var20 = this.field1325[var19];
			int var21 = this.field1326[var19];
			int var22 = this.field1330[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}
			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}
			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field1359[var19] = var22 - var18;
			field1356[var19] = var8 + var20 * class238.method1394() / var22;
			field1357[var19] = var9 + var23 * class238.method1394() / var22;
			field1362[var19] = class309.method1673(var22);
			if (this.field1339 > 0) {
				field1360[var19] = var20;
				field1361[var19] = var23;
				field1367[var19] = var22;
			}
		}
		try {
			this.method695(false, false, false, 0L);
		} catch (Exception var24) {
		}
	}

	public final void method693(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.field1347 != 2 && this.field1347 != 1) {
			this.method708();
		}
		int var9 = class238.method1389();
		int var10 = class238.method1390();
		int var11 = field1380[0];
		int var12 = field1381[0];
		int var13 = field1380[var2];
		int var14 = field1381[var2];
		int var15 = field1380[var3];
		int var16 = field1381[var3];
		int var17 = field1380[var4];
		int var18 = field1381[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;
		for (int var20 = 0; var20 < this.field1379; ++var20) {
			int var21 = this.field1325[var20];
			int var22 = this.field1326[var20];
			int var23 = this.field1330[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}
			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}
			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field1359[var20] = var23 - var19;
			field1356[var20] = var9 + var21 * class238.method1394() / var8;
			field1357[var20] = var10 + var24 * class238.method1394() / var8;
			field1362[var20] = class309.method1673(var8);
			if (this.field1339 > 0) {
				field1360[var20] = var21;
				field1361[var20] = var24;
				field1367[var20] = var23;
			}
		}
		try {
			this.method695(false, false, false, 0L);
		} catch (Exception var25) {
		}
	}

	@Override
	void method1164(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.field1347 != 1) {
			this.method679();
		}
		this.method709(var1);
		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = this.field1349 * var3 >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var6 * var5 >> 16;
			int var16 = (var15 - this.field1349) * class238.method1394();
			if (var16 / var14 < class238.method1388()) {
				int var17 = (var15 + this.field1349) * class238.method1394();
				if (var17 / var14 > class238.method1391()) {
					int var18 = var7 * var3 - var11 * var2 >> 16;
					int var19 = this.field1349 * var2 >> 16;
					int var20 = var19 + (this.field1348 * var3 >> 16);
					int var21 = (var18 + var20) * class238.method1394();
					if (var21 / var14 > class238.method1393()) {
						int var22 = var19 + (super.field1834 * var3 >> 16);
						int var23 = (var18 - var22) * class238.method1394();
						if (var23 / var14 < class238.method1392()) {
							int var24 = var13 + (super.field1834 * var2 >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}
							boolean var27 = var26 || this.field1339 > 0;
							int var28 = class424.field3274;
							int var30 = class424.field3277;
							boolean var32 = class424.method2128();
							boolean var34 = 0L != var9;
							boolean var35;
							if (var34) {
								var35 = (int) (var9 >>> 16 & 1L) == 1;
								var34 = !var35;
							}
							var35 = false;
							int var38;
							int var40;
							int var41;
							int var42;
							int var43;
							int var44;
							int var51;
							int var52;
							if (var34 && var32) {
								boolean var36 = false;
								if (field1378) {
									boolean var37;
									if (!class424.method2128()) {
										var37 = false;
									} else {
										class424.method2125();
										class90 var39 = (class90) this.field1352.get(var1);
										var40 = var6 + var39.field896;
										var41 = var39.field891 + var7;
										var42 = var39.field892 + var8;
										var43 = var39.field893;
										var44 = var39.field894;
										int var45 = var39.field895;
										int var46 = class424.field3273 - var40;
										int var47 = class424.field3282 - var41;
										int var48 = class424.field3279 - var42;
										if (Math.abs(var46) > var43 + class424.field3280) {
											var37 = false;
										} else if (Math.abs(var47) > class520.field4128 + var44) {
											var37 = false;
										} else if (Math.abs(var48) > var45 + class512.field4087) {
											var37 = false;
										} else if (Math.abs(class424.field3275 * var48 - var47 * class513.field4088) > class512.field4087 * var44 + var45 * class520.field4128) {
											var37 = false;
										} else if (Math.abs(var46 * class513.field4088 - var48 * class534.field4209) > var43 * class512.field4087 + var45 * class424.field3280) {
											var37 = false;
										} else if (Math.abs(var47 * class534.field4209 - var46 * class424.field3275) > class520.field4128 * var43 + var44 * class424.field3280) {
											var37 = false;
										} else {
											var37 = true;
										}
									}
									var36 = var37;
								} else {
									var52 = var12 - var13;
									if (var52 <= 50) {
										var52 = 50;
									}
									if (var15 > 0) {
										var16 /= var14;
										var17 /= var52;
									} else {
										var17 /= var14;
										var16 /= var52;
									}
									if (var18 > 0) {
										var23 /= var14;
										var21 /= var52;
									} else {
										var21 /= var14;
										var23 /= var52;
									}
									var38 = var28 - class238.method1389();
									var51 = var30 - class238.method1390();
									if (var38 > var16 && var38 < var17 && var51 > var23 && var51 < var21) {
										var36 = true;
									}
								}
								if (var36) {
									if (this.field1328) {
										class424.field3283[++class424.field3281 - 1] = var9;
									} else {
										var35 = true;
									}
								}
							}
							int var50 = class238.method1389();
							var52 = class238.method1390();
							var38 = 0;
							var51 = 0;
							if (var1 != 0) {
								var38 = field1380[var1];
								var51 = field1381[var1];
							}
							for (var40 = 0; var40 < this.field1379; ++var40) {
								var41 = this.field1325[var40];
								var42 = this.field1326[var40];
								var43 = this.field1330[var40];
								if (var1 != 0) {
									var44 = var43 * var38 + var41 * var51 >> 16;
									var43 = var43 * var51 - var41 * var38 >> 16;
									var41 = var44;
								}
								var41 += var6;
								var42 += var7;
								var43 += var8;
								var44 = var43 * var4 + var41 * var5 >> 16;
								var43 = var43 * var5 - var41 * var4 >> 16;
								var41 = var44;
								var44 = var42 * var3 - var43 * var2 >> 16;
								var43 = var42 * var2 + var43 * var3 >> 16;
								field1359[var40] = var43 - var12;
								if (var43 >= 50) {
									field1356[var40] = var50 + var41 * class238.method1394() / var43;
									field1357[var40] = var52 + var44 * class238.method1394() / var43;
									field1362[var40] = class309.method1673(var43);
								} else {
									field1356[var40] = -5000;
									var25 = true;
								}
								if (var27) {
									field1360[var40] = var41;
									field1361[var40] = var44;
									field1367[var40] = var43;
								}
							}
							try {
								this.method695(var25, var35, this.field1328, var9);
							} catch (Exception var49) {
							}
						}
					}
				}
			}
		}
	}

	final void method695(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.field1350 < 6000) {
			int var6;
			for (var6 = 0; var6 < this.field1350; ++var6) {
				field1364[var6] = 0;
			}
			var6 = var3 ? 20 : 5;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.field1327; ++var7) {
				if (this.field1333[var7] != -2) {
					var8 = this.field1342[var7];
					var9 = this.field1329[var7];
					var10 = this.field1387[var7];
					var11 = field1356[var8];
					var12 = field1356[var9];
					var13 = field1356[var10];
					int var17;
					int var33;
					if (var1 && (var11 == -5000 || var12 == -5000 || var13 == -5000)) {
						var33 = field1360[var8];
						var15 = field1360[var9];
						var16 = field1360[var10];
						var17 = field1361[var8];
						var18 = field1361[var9];
						int var19 = field1361[var10];
						int var20 = field1367[var8];
						int var21 = field1367[var9];
						int var22 = field1367[var10];
						var33 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var19;
						int var24 = var20 * var16 - var33 * var22;
						int var25 = var33 * var19 - var17 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field1355[var7] = true;
							int var26 = (field1359[var8] + field1359[var9] + field1359[var10]) / 3 + this.field1374;
							field1365[var26][field1364[var26]++] = var7;
						}
					} else {
						if (var2) {
							var15 = field1357[var8];
							var16 = field1357[var9];
							var17 = field1357[var10];
							var18 = class424.field3277 + var6;
							boolean var14;
							if (var18 < var15 && var18 < var16 && var18 < var17) {
								var14 = false;
							} else {
								var18 = class424.field3277 - var6;
								if (var18 > var15 && var18 > var16 && var18 > var17) {
									var14 = false;
								} else {
									var18 = var6 + class424.field3274;
									if (var18 < var11 && var18 < var12 && var18 < var13) {
										var14 = false;
									} else {
										var18 = class424.field3274 - var6;
										if (var18 > var11 && var18 > var12 && var18 > var13) {
											var14 = false;
										} else {
											var14 = true;
										}
									}
								}
							}
							if (var14) {
								class424.field3283[++class424.field3281 - 1] = var4;
								var2 = false;
							}
						}
						if ((var11 - var12) * (field1357[var10] - field1357[var9]) - (field1357[var8] - field1357[var9]) * (var13 - var12) > 0) {
							field1355[var7] = false;
							var33 = class238.method1395();
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= var33 && var12 <= var33 && var13 <= var33) {
								field1354[var7] = false;
							} else {
								field1354[var7] = true;
							}
							var15 = (field1359[var8] + field1359[var9] + field1359[var10]) / 3 + this.field1374;
							field1365[var15][field1364[var15]++] = var7;
						}
					}
				}
			}
			int var27;
			char var28;
			char[] var29;
			if (this.field1386 == null) {
				for (var27 = this.field1350 - 1; var27 >= 0; --var27) {
					var28 = field1364[var27];
					if (var28 > 0) {
						var29 = field1365[var27];
						for (var10 = 0; var10 < var28; ++var10) {
							this.method676(var29[var10]);
						}
					}
				}
			} else {
				for (var27 = 0; var27 < 12; ++var27) {
					field1366[var27] = 0;
					field1370[var27] = 0;
				}
				for (var27 = this.field1350 - 1; var27 >= 0; --var27) {
					var28 = field1364[var27];
					if (var28 > 0) {
						var29 = field1365[var27];
						for (var10 = 0; var10 < var28; ++var10) {
							char var30 = var29[var10];
							byte var31 = this.field1386[var30];
							var13 = field1366[var31]++;
							field1363[var31][var13] = var30;
							if (var31 < 10) {
								int[] var36 = field1370;
								var36[var31] += var27;
							} else if (var31 == 10) {
								field1368[var13] = var27;
							} else {
								field1324[var13] = var27;
							}
						}
					}
				}
				var27 = 0;
				if (field1366[1] > 0 || field1366[2] > 0) {
					var27 = (field1370[1] + field1370[2]) / (field1366[1] + field1366[2]);
				}
				var8 = 0;
				if (field1366[3] > 0 || field1366[4] > 0) {
					var8 = (field1370[3] + field1370[4]) / (field1366[3] + field1366[4]);
				}
				var9 = 0;
				if (field1366[6] > 0 || field1366[8] > 0) {
					var9 = (field1370[6] + field1370[8]) / (field1366[6] + field1366[8]);
				}
				var11 = 0;
				var12 = field1366[10];
				int[] var32 = field1363[10];
				int[] var34 = field1368;
				if (0 == var12) {
					var11 = 0;
					var12 = field1366[11];
					var32 = field1363[11];
					var34 = field1324;
				}
				if (0 < var12) {
					var10 = var34[0];
				} else {
					var10 = -1000;
				}
				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var27) {
						this.method676(var32[var11++]);
						if (var11 == var12 && var32 != field1363[11]) {
							var11 = 0;
							var12 = field1366[11];
							var32 = field1363[11];
							var34 = field1324;
						}
						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}
					while (var15 == 3 && var10 > var8) {
						this.method676(var32[var11++]);
						if (var11 == var12 && var32 != field1363[11]) {
							var11 = 0;
							var12 = field1366[11];
							var32 = field1363[11];
							var34 = field1324;
						}
						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}
					while (var15 == 5 && var10 > var9) {
						this.method676(var32[var11++]);
						if (var11 == var12 && var32 != field1363[11]) {
							var11 = 0;
							var12 = field1366[11];
							var32 = field1363[11];
							var34 = field1324;
						}
						if (var11 < var12) {
							var10 = var34[var11];
						} else {
							var10 = -1000;
						}
					}
					var16 = field1366[var15];
					int[] var35 = field1363[var15];
					for (var18 = 0; var18 < var16; ++var18) {
						this.method676(var35[var18]);
					}
				}
				while (var10 != -1000) {
					this.method676(var32[var11++]);
					if (var11 == var12 && var32 != field1363[11]) {
						var11 = 0;
						var32 = field1363[11];
						var12 = field1366[11];
						var34 = field1324;
					}
					if (var11 < var12) {
						var10 = var34[var11];
					} else {
						var10 = -1000;
					}
				}
			}
		}
	}

	final void method676(int var1) {
		if (field1355[var1]) {
			this.method698(var1);
		} else {
			int var2 = this.field1342[var1];
			int var3 = this.field1329[var1];
			int var4 = this.field1387[var1];
			class238.field2039.field2272 = field1354[var1];
			if (this.field1335 == null) {
				class238.field2039.field2275 = 0;
			} else {
				class238.field2039.field2275 = (this.field1335[var1] == -1 ? 253 : this.field1335[var1]) & 255;
			}
			this.method706(var1, field1357[var2], field1357[var3], field1357[var4], field1356[var2], field1356[var3], field1356[var4], field1362[var2], field1362[var3], field1362[var4], this.field1331[var1], this.field1332[var1], this.field1333[var1]);
		}
	}

	boolean method697(int var1) {
		return this.field1389 > 0 && var1 < this.field1390;
	}

	final void method706(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.field1337 != null && this.field1337[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.field1336 != null && this.field1336[var1] != -1) {
				int var17 = this.field1336[var1] & 255;
				var18 = this.field1340[var17];
				var15 = this.field1341[var17];
				var16 = this.field1334[var17];
			} else {
				var18 = this.field1342[var1];
				var15 = this.field1329[var1];
				var16 = this.field1387[var1];
			}
			if (this.field1333[var1] == -1) {
				class238.method1401(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field1360[var18], field1360[var15], field1360[var16], field1361[var18], field1361[var15], field1361[var16], field1367[var18], field1367[var15], field1367[var16], this.field1337[var1]);
			} else {
				class238.method1401(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field1360[var18], field1360[var15], field1360[var16], field1361[var18], field1361[var15], field1361[var16], field1367[var18], field1367[var15], field1367[var16], this.field1337[var1]);
			}
		} else {
			boolean var14 = this.method697(var1);
			if (this.field1333[var1] == -1 && var14) {
				class238.method1409(var2, var3, var4, var5, var6, var7, var8, var9, var10, field1382[this.field1331[var1]], this.field1383, this.field1353, this.field1351, this.field1389);
			} else if (this.field1333[var1] == -1) {
				class238.method1410(var2, var3, var4, var5, var6, var7, var8, var9, var10, field1382[this.field1331[var1]]);
			} else if (var14) {
				class238.method1407(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field1383, this.field1353, this.field1351, this.field1389);
			} else {
				class238.method1403(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}
	}

	final void method698(int var1) {
		int var2 = class238.method1389();
		int var3 = class238.method1390();
		int var4 = 0;
		int var5 = this.field1342[var1];
		int var6 = this.field1329[var1];
		int var7 = this.field1387[var1];
		int var8 = field1367[var5];
		int var9 = field1367[var6];
		int var10 = field1367[var7];
		if (this.field1335 == null) {
			class238.field2039.field2275 = 0;
		} else {
			class238.field2039.field2275 = this.field1335[var1] & 255;
		}
		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field1371[0] = field1356[var5];
			field1372[0] = field1357[var5];
			field1376[0] = field1362[var7];
			++var4;
			field1373[0] = this.field1331[var1];
		} else {
			var11 = field1360[var5];
			var12 = field1361[var5];
			var13 = this.field1331[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * field1346[var10 - var8];
				field1371[0] = var2 + (var11 + ((field1360[var7] - var11) * var14 >> 16)) * class238.method1394() / 50;
				field1372[0] = var3 + (var12 + ((field1361[var7] - var12) * var14 >> 16)) * class238.method1394() / 50;
				field1376[0] = field1385;
				++var4;
				field1373[0] = var13 + ((this.field1333[var1] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				var14 = (50 - var8) * field1346[var9 - var8];
				field1371[var4] = var2 + (var11 + ((field1360[var6] - var11) * var14 >> 16)) * class238.method1394() / 50;
				field1372[var4] = var3 + (var12 + ((field1361[var6] - var12) * var14 >> 16)) * class238.method1394() / 50;
				field1376[var4] = field1385;
				field1373[var4++] = var13 + ((this.field1332[var1] - var13) * var14 >> 16);
			}
		}
		if (var9 >= 50) {
			field1371[var4] = field1356[var6];
			field1372[var4] = field1357[var6];
			field1376[var4] = field1362[var7];
			field1373[var4++] = this.field1332[var1];
		} else {
			var11 = field1360[var6];
			var12 = field1361[var6];
			var13 = this.field1332[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * field1346[var8 - var9];
				field1371[var4] = var2 + (var11 + ((field1360[var5] - var11) * var14 >> 16)) * class238.method1394() / 50;
				field1372[var4] = var3 + (var12 + ((field1361[var5] - var12) * var14 >> 16)) * class238.method1394() / 50;
				field1376[var4] = field1385;
				field1373[var4++] = var13 + ((this.field1331[var1] - var13) * var14 >> 16);
			}
			if (var10 >= 50) {
				var14 = (50 - var9) * field1346[var10 - var9];
				field1371[var4] = var2 + (var11 + ((field1360[var7] - var11) * var14 >> 16)) * class238.method1394() / 50;
				field1372[var4] = var3 + (var12 + ((field1361[var7] - var12) * var14 >> 16)) * class238.method1394() / 50;
				field1373[var4++] = var13 + ((this.field1333[var1] - var13) * var14 >> 16);
			}
		}
		if (var10 >= 50) {
			field1371[var4] = field1356[var7];
			field1372[var4] = field1357[var7];
			field1376[var4] = field1362[var7];
			field1373[var4++] = this.field1333[var1];
		} else {
			var11 = field1360[var7];
			var12 = field1361[var7];
			var13 = this.field1333[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * field1346[var9 - var10];
				field1371[var4] = var2 + (var11 + ((field1360[var6] - var11) * var14 >> 16)) * class238.method1394() / 50;
				field1372[var4] = var3 + (var12 + ((field1361[var6] - var12) * var14 >> 16)) * class238.method1394() / 50;
				field1376[var4] = field1385;
				field1373[var4++] = var13 + ((this.field1332[var1] - var13) * var14 >> 16);
			}
			if (var8 >= 50) {
				var14 = (50 - var10) * field1346[var8 - var10];
				field1371[var4] = var2 + (var11 + ((field1360[var5] - var11) * var14 >> 16)) * class238.method1394() / 50;
				field1372[var4] = var3 + (var12 + ((field1361[var5] - var12) * var14 >> 16)) * class238.method1394() / 50;
				field1376[var4] = field1385;
				field1373[var4++] = var13 + ((this.field1331[var1] - var13) * var14 >> 16);
			}
		}
		var11 = field1371[0];
		var12 = field1371[1];
		var13 = field1371[2];
		var14 = field1372[0];
		int var15 = field1372[1];
		int var16 = field1372[2];
		float var17 = field1376[0];
		float var18 = field1376[1];
		float var19 = field1376[2];
		class238.field2039.field2272 = false;
		int var20 = class238.method1395();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				class238.field2039.field2272 = true;
			}
			this.method706(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field1373[0], field1373[1], field1373[2]);
		}
		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field1371[3] < 0 || field1371[3] > var20) {
				class238.field2039.field2272 = true;
			}
			int var22;
			if (this.field1337 != null && this.field1337[var1] != -1) {
				int var23;
				int var25;
				if (this.field1336 != null && this.field1336[var1] != -1) {
					int var24 = this.field1336[var1] & 255;
					var25 = this.field1340[var24];
					var22 = this.field1341[var24];
					var23 = this.field1334[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}
				short var26 = this.field1337[var1];
				if (this.field1333[var1] == -1) {
					class238.method1401(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.field1331[var1], this.field1331[var1], this.field1331[var1], field1360[var25], field1360[var22], field1360[var23], field1361[var25], field1361[var22], field1361[var23], field1367[var25], field1367[var22], field1367[var23], var26);
					class238.method1401(var14, var16, field1372[3], var11, var13, field1371[3], var17, var19, field1376[3], this.field1331[var1], this.field1331[var1], this.field1331[var1], field1360[var25], field1360[var22], field1360[var23], field1361[var25], field1361[var22], field1361[var23], field1367[var25], field1367[var22], field1367[var23], var26);
				} else {
					class238.method1401(var14, var15, var16, var11, var12, var13, var17, var18, var19, field1373[0], field1373[1], field1373[2], field1360[var25], field1360[var22], field1360[var23], field1361[var25], field1361[var22], field1361[var23], field1367[var25], field1367[var22], field1367[var23], var26);
					class238.method1401(var14, var16, field1372[3], var11, var13, field1371[3], var17, var19, field1376[3], field1373[0], field1373[2], field1373[3], field1360[var25], field1360[var22], field1360[var23], field1361[var25], field1361[var22], field1361[var23], field1367[var25], field1367[var22], field1367[var23], var26);
				}
			} else {
				boolean var21 = this.method697(var1);
				if (this.field1333[var1] == -1 && var21) {
					var22 = field1382[this.field1331[var1]];
					class238.method1409(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field1383, this.field1353, this.field1351, this.field1389);
					class238.method1409(var14, var16, field1372[3], var11, var13, field1371[3], var17, var19, field1376[3], var22, this.field1383, this.field1353, this.field1351, this.field1389);
				} else if (this.field1333[var1] == -1) {
					var22 = field1382[this.field1331[var1]];
					class238.method1410(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					class238.method1410(var14, var16, field1372[3], var11, var13, field1371[3], var17, var19, field1376[3], var22);
				} else if (var21) {
					class238.method1407(var14, var15, var16, var11, var12, var13, var17, var18, var19, field1373[0], field1373[1], field1373[2], this.field1383, this.field1351, this.field1353, this.field1389);
					class238.method1407(var14, var16, field1372[3], var11, var13, field1371[3], 0.0F, 0.0F, 0.0F, field1373[0], field1373[2], field1373[3], this.field1383, this.field1351, this.field1353, this.field1389);
				} else {
					class238.method1403(var14, var15, var16, var11, var12, var13, var17, var18, var19, field1373[0], field1373[1], field1373[2]);
					class238.method1403(var14, var16, field1372[3], var11, var13, field1371[3], var17, var19, field1376[3], field1373[0], field1373[2], field1373[3]);
				}
			}
		}
	}

	void method699(int var1, class31 var2) {
		float var3 = (float) this.field1325[var1];
		float var4 = (float) -this.field1326[var1];
		float var5 = (float) -this.field1330[var1];
		float var6 = 1.0F;
		this.field1325[var1] = (int) (var2.field150[0] * var3 + var2.field150[4] * var4 + var2.field150[8] * var5 + var2.field150[12] * var6);
		this.field1326[var1] = -((int) (var2.field150[1] * var3 + var2.field150[5] * var4 + var2.field150[9] * var5 + var2.field150[13] * var6));
		this.field1330[var1] = -((int) (var2.field150[2] * var3 + var2.field150[6] * var4 + var2.field150[10] * var5 + var2.field150[14] * var6));
	}

	void method703(class357 var1, int var2) {
		if (this.field1345 != null) {
			for (int var3 = 0; var3 < this.field1379; ++var3) {
				int[] var4 = this.field1345[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field1369[var3];
					field1321.method95();
					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class481 var8 = var1.method1872(var7);
						if (var8 != null) {
							field1322.method96((float) var5[var6] / 255.0F);
							field1323.method101(var8.method2328(var2));
							field1323.method104(field1322);
							field1321.method98(field1323);
						}
					}
					this.method699(var3, field1321);
				}
			}
		}
	}
}
