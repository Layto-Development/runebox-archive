import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class87 {
	static class270 field873;
	class152 field874;
	int field869;
	int field875;
	int field876;
	int field878;
	HashMap field877;
	LinkedList field871;
	List field870;
	final HashMap field872;

	static {
		field873 = new class270(37748736, 256);
	}

	class87(int var1, int var2, int var3, HashMap var4) {
		this.field878 = var1;
		this.field869 = var2;
		this.field871 = new LinkedList();
		this.field870 = new LinkedList();
		this.field877 = new HashMap();
		this.field875 = var3 | -16777216;
		this.field872 = var4;
	}

	void method597(int var1, int var2, int var3) {
		class115 var5 = class540.method2586(this.field878, this.field869, this.field876);
		if (var5 != null) {
			if (var3 == this.field876 * 64) {
				var5.method712(var1, var2);
			} else {
				var5.method728(var1, var2, var3, var3);
			}

		}
	}

	void method599(class152 var1, List var2) {
		this.field877.clear();
		this.field874 = var1;
		this.method598(var2);
	}

	void method570(HashSet var1, List var2) {
		this.field877.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			class418 var5 = (class418)var4.next();
			if (var5.method1205() == this.field878 && var5.method1207() == this.field869) {
				this.field871.add(var5);
			}
		}

		this.method598(var2);
	}

	void method571(int var1, int var2, int var3, int var4, class212 var5) {
		for (int var7 = var1; var7 < var1 + var3; ++var7) {
			label65:
			for (int var8 = var2; var8 < var4 + var2; ++var8) {
				for (int var9 = 0; var9 < var5.field1992; ++var9) {
					class359[] var10 = var5.field1999[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						class359[] var11 = var10;

						for (int var12 = 0; var12 < var11.length; ++var12) {
							class235 var14;
							boolean var15;
							label56: {
								class359 var13 = var11[var12];
								var14 = class96.method638(var13.field3042, (byte)-78);
								if (var14.field2147 != null) {
									int[] var16 = var14.field2147;

									for (int var17 = 0; var17 < var16.length; ++var17) {
										int var18 = var16[var17];
										class235 var19 = class96.method638(var18, (byte)-65);
										if (var19.field2140 != -1) {
											var15 = true;
											break label56;
										}
									}
								} else if (var14.field2140 != -1) {
									var15 = true;
									break label56;
								}

								var15 = false;
							}

							if (var15) {
								this.method595(var14, var9, var7, var8, var5);
								continue label65;
							}
						}
					}
				}
			}
		}

	}

	void method595(class235 var1, int var2, int var3, int var4, class212 var5) {
		class29 var7 = new class29(var2, var3 + this.field878 * 64, var4 + this.field869 * 64);
		class29 var8 = null;
		if (this.field874 != null) {
			var8 = new class29(this.field874.field1991 + var2, this.field874.field1996 * 64 + var3, var4 + this.field874.field1994 * 64);
		} else {
			class418 var9 = (class418)var5;
			var8 = new class29(var9.field1991 + var2, var3 + var9.field1996 * 64 + var9.method2152() * 8, var4 + var9.field1994 * 64 + var9.method2153() * 8);
		}

		class96 var10;
		Object var11;
		if (null != var1.field2147) {
			var11 = new class476(var8, var7, var1.field2113, this);
		} else {
			var10 = class158.method892(var1.field2140);
			var11 = new class524(var8, var7, var10.field964, this.method588(var10));
		}

		var10 = class158.method892(((class217)var11).method1244());
		if (var10.field966) {
			this.field877.put(new class29(0, var3, var4), var11);
		}

	}

	void method573() {
		Iterator var2 = this.field877.values().iterator();

		while (var2.hasNext()) {
			class217 var3 = (class217)var2.next();
			if (var3 instanceof class476) {
				((class476)var3).method2303();
			}
		}

	}

	void method598(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			class524 var4 = (class524)var3.next();
			if (class158.method892(var4.field4235).field966 && var4.field2025.field460 >> 6 == this.field878 && this.field869 == var4.field2025.field462 >> 6) {
				class524 var5 = new class524(var4.field2025, var4.field2025, var4.field4235, this.method602(var4.field4235));
				this.field870.add(var5);
			}
		}

	}

	void method574() {
		if (null != this.field874) {
			this.field874.method1201();
		} else {
			Iterator var2 = this.field871.iterator();

			while (var2.hasNext()) {
				class418 var3 = (class418)var2.next();
				var3.method1201();
			}
		}

	}

	boolean method596(class215 var1) {
		this.field877.clear();
		if (null != this.field874) {
			this.field874.method1200(var1);
			if (this.field874.method1199()) {
				this.method571(0, 0, 64, 64, this.field874);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			class418 var5;
			for (var4 = this.field871.iterator(); var4.hasNext(); var3 &= var5.method1199()) {
				var5 = (class418)var4.next();
				var5.method1200(var1);
			}

			if (var3) {
				var4 = this.field871.iterator();

				while (var4.hasNext()) {
					var5 = (class418)var4.next();
					this.method571(var5.method2151() * 8, var5.method2150() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	void method600(int var1, class284 var2, class25[] var3, class215 var4, class215 var5) {
		this.field876 = var1;
		if (this.field874 != null || !this.field871.isEmpty()) {
			if (class540.method2586(this.field878, this.field869, var1) == null) {
				boolean var7 = true;
				var7 &= this.method596(var4);
				int var9;
				if (null != this.field874) {
					var9 = this.field874.field1998;
				} else {
					var9 = ((class212)this.field871.getFirst()).field1998;
				}

				var7 &= var5.method1216(var9);
				if (var7) {
					byte[] var8 = var5.method1219(var9);
					class223 var10;
					if (null == var8) {
						var10 = new class223();
					} else {
						var10 = new class223(class418.method2149(var8).field1083);
					}

					class115 var12 = new class115(this.field876 * 64, this.field876 * 64);
					var12.method706();
					if (this.field874 != null) {
						this.method578(var2, var3, var10);
					} else {
						this.method579(var2, var3, var10);
					}

					int var13 = this.field878;
					int var14 = this.field869;
					int var15 = this.field876;
					class270 var16 = field873;
					long var18 = (long)(var15 << 16 | var13 << 8 | var14);
					var16.method1583(var12, var18, 4 * var12.field1083.length);
					this.method574();
				}
			}
		}
	}

	void method576(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method584(var1, var2, var4, var3);
		this.method592(var1, var2, var4, var3);
	}

	void method577(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field877.values().iterator();

		while (var5.hasNext()) {
			class217 var6 = (class217)var5.next();
			if (var6.method1246()) {
				int var7 = var6.method1244();
				if (var1.contains(var7)) {
					class96 var8 = class158.method892(var7);
					this.method594(var8, var6.field2027, var6.field2028, var2, var3);
				}
			}
		}

		this.method593(var1, var2, var3);
	}

	void method578(class284 var1, class25[] var2, class223 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method580(var5, var6, this.field874, var1, var3);
				this.method581(var5, var6, this.field874, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method603(var5, var6, this.field874, var1, var2);
			}
		}

	}

	void method579(class284 var1, class25[] var2, class223 var3) {
		Iterator var5 = this.field871.iterator();

		class418 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class418)var5.next();

			for (var7 = var6.method2151() * 8; var7 < var6.method2151() * 8 + 8; ++var7) {
				for (var8 = var6.method2150() * 8; var8 < var6.method2150() * 8 + 8; ++var8) {
					this.method580(var7, var8, var6, var1, var3);
					this.method581(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field871.iterator();

		while (var5.hasNext()) {
			var6 = (class418)var5.next();

			for (var7 = var6.method2151() * 8; var7 < var6.method2151() * 8 + 8; ++var7) {
				for (var8 = var6.method2150() * 8; var8 < var6.method2150() * 8 + 8; ++var8) {
					this.method603(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	void method603(int var1, int var2, class212 var3, class284 var4, class25[] var5) {
		this.method601(var1, var2, var3);
		this.method583(var1, var2, var3, var5);
	}

	void method580(int var1, int var2, class212 var3, class284 var4, class223 var5) {
		int var7 = var3.field1995[0][var1][var2] - 1;
		int var8 = var3.field1993[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class266.method1548(var1 * this.field876, (63 - var2) * this.field876, this.field876, this.field876, this.field875);
		}

		int var9 = 16711935;
		int var10;
		if (var8 != -1) {
			int var11 = this.field875;
			class207 var13 = (class207)class207.field1917.method1890((long)var8);
			class207 var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = class207.field1922.method1212(4, var8);
				var13 = new class207();
				if (null != var14) {
					var13.method1157(new class42(var14), var8);
				}

				var13.method1156();
				class207.field1917.method1889(var13, (long)var8);
				var12 = var13;
			}

			if (null == var12) {
				var10 = var11;
			} else {
				int var15;
				int var16;
				if (var12.field1914 >= 0) {
					var16 = class151.method873(var12.field1919, var12.field1918, var12.field1920);
					var15 = class85.method557(var16, 96);
					var10 = class133.field1288[var15] | -16777216;
				} else if (var12.field1910 >= 0) {
					var16 = class85.method557(class133.field1293.field389.method1945(var12.field1910), 96);
					var10 = class133.field1288[var16] | -16777216;
				} else if (var12.field1911 == 16711935) {
					var10 = var11;
				} else {
					var16 = class151.method873(var12.field1915, var12.field1916, var12.field1921);
					var15 = class85.method557(var16, 96);
					var10 = class133.field1288[var15] | -16777216;
				}
			}

			var9 = var10;
		}

		if (var8 > -1 && var3.field2002[0][var1][var2] == 0) {
			class266.method1548(this.field876 * var1, this.field876 * (63 - var2), this.field876, this.field876, var9);
		} else {
			var10 = this.method582(var1, var2, var3, var5);
			if (var8 == -1) {
				class266.method1548(var1 * this.field876, (63 - var2) * this.field876, this.field876, this.field876, var10);
			} else {
				var4.method1623(var1 * this.field876, this.field876 * (63 - var2), var10, var9, this.field876, this.field876, var3.field2002[0][var1][var2], var3.field1989[0][var1][var2]);
			}
		}
	}

	void method581(int var1, int var2, class212 var3, class284 var4) {
		for (int var6 = 1; var6 < var3.field1992; ++var6) {
			int var7 = var3.field1993[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var9 = this.field875;
				class207 var11 = (class207)class207.field1917.method1890((long)var7);
				class207 var10;
				if (var11 != null) {
					var10 = var11;
				} else {
					byte[] var12 = class207.field1922.method1212(4, var7);
					var11 = new class207();
					if (var12 != null) {
						var11.method1157(new class42(var12), var7);
					}

					var11.method1156();
					class207.field1917.method1889(var11, (long)var7);
					var10 = var11;
				}

				int var8;
				if (var10 == null) {
					var8 = var9;
				} else {
					int var13;
					int var14;
					if (var10.field1914 >= 0) {
						var14 = class151.method873(var10.field1919, var10.field1918, var10.field1920);
						var13 = class85.method557(var14, 96);
						var8 = class133.field1288[var13] | -16777216;
					} else if (var10.field1910 >= 0) {
						var14 = class85.method557(class133.field1293.field389.method1945(var10.field1910), 96);
						var8 = class133.field1288[var14] | -16777216;
					} else if (var10.field1911 == 16711935) {
						var8 = var9;
					} else {
						var14 = class151.method873(var10.field1915, var10.field1916, var10.field1921);
						var13 = class85.method557(var14, 96);
						var8 = class133.field1288[var13] | -16777216;
					}
				}

				if (var3.field2002[var6][var1][var2] == 0) {
					class266.method1548(var1 * this.field876, this.field876 * (63 - var2), this.field876, this.field876, var8);
				} else {
					var4.method1623(this.field876 * var1, this.field876 * (63 - var2), 0, var8, this.field876, this.field876, var3.field2002[var6][var1][var2], var3.field1989[var6][var1][var2]);
				}
			}
		}

	}

	int method582(int var1, int var2, class212 var3, class223 var4) {
		return var3.field1995[0][var1][var2] == 0 ? this.field875 : var4.method1262(var1, var2);
	}

	void method583(int var1, int var2, class212 var3, class25[] var4) {
		for (int var6 = 0; var6 < var3.field1992; ++var6) {
			class359[] var7 = var3.field1999[var6][var1][var2];
			if (null != var7 && var7.length != 0) {
				class359[] var8 = var7;

				for (int var9 = 0; var9 < var8.length; ++var9) {
					class359 var10 = var8[var9];
					if (!class197.method1075(var10.field3041)) {
						int var12 = var10.field3041;
						boolean var11 = class236.field2179.field2165 == var12;
						if (!var11) {
							continue;
						}
					}

					class235 var13 = class96.method638(var10.field3042, (byte)-44);
					if (var13.field2139 != -1) {
						if (var13.field2139 != 46 && var13.field2139 != 52) {
							var4[var13.field2139].method206(this.field876 * var1, (63 - var2) * this.field876, this.field876 * 2, this.field876 * 2);
						} else {
							var4[var13.field2139].method206(var1 * this.field876, (63 - var2) * this.field876, this.field876 * 2 + 1, 1 + this.field876 * 2);
						}
					}
				}
			}
		}

	}

	void method601(int var1, int var2, class212 var3) {
		for (int var5 = 0; var5 < var3.field1992; ++var5) {
			class359[] var6 = var3.field1999[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class359[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					class359 var9 = var7[var8];
					if (class278.method1593(var9.field3041)) {
						class235 var10 = class96.method638(var9.field3042, (byte)-62);
						int var11 = var10.field2130 != 0 ? -3407872 : -3355444;
						if (class236.field2162.field2165 == var9.field3041) {
							this.method591(var1, var2, var9.field3043, var11);
						}

						if (var9.field3041 == class236.field2159.field2165) {
							this.method591(var1, var2, var9.field3043, -3355444);
							this.method591(var1, var2, var9.field3043 + 1, var11);
						}

						if (var9.field3041 == class236.field2160.field2165) {
							if (var9.field3043 == 0) {
								class266.method1559(var1 * this.field876, this.field876 * (63 - var2), 1, var11);
							}

							if (var9.field3043 == 1) {
								class266.method1559(var1 * this.field876 + this.field876 - 1, this.field876 * (63 - var2), 1, var11);
							}

							if (var9.field3043 == 2) {
								class266.method1559(this.field876 * var1 + this.field876 - 1, (63 - var2) * this.field876 + this.field876 - 1, 1, var11);
							}

							if (var9.field3043 == 3) {
								class266.method1559(var1 * this.field876, this.field876 + this.field876 * (63 - var2) - 1, 1, var11);
							}
						}

						if (var9.field3041 == class236.field2178.field2165) {
							int var12 = var9.field3043 % 2;
							int var13;
							if (var12 == 0) {
								for (var13 = 0; var13 < this.field876; ++var13) {
									class266.method1559(var13 + var1 * this.field876, (64 - var2) * this.field876 - 1 - var13, 1, var11);
								}
							} else {
								for (var13 = 0; var13 < this.field876; ++var13) {
									class266.method1559(var13 + var1 * this.field876, this.field876 * (63 - var2) + var13, 1, var11);
								}
							}
						}
					}
				}
			}
		}

	}

	void method584(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field877.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			class29 var10 = (class29)var9.getKey();
			int var11 = (int)((float)var1 + var6 * (float)var10.field460 - var7);
			int var12 = (int)((float)(var4 + var2) - var6 * (float)var10.field462 - var7);
			class217 var13 = (class217)var9.getValue();
			if (var13 != null && var13.method1246()) {
				var13.field2027 = var11;
				var13.field2028 = var12;
				class96 var14 = class158.method892(var13.method1244());
				if (!var3.contains(var14.method637())) {
					this.method572(var13, var11, var12, var6);
				}
			}
		}

	}

	void method593(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field870.iterator();

		while (var5.hasNext()) {
			class217 var6 = (class217)var5.next();
			if (var6.method1246()) {
				class96 var7 = class158.method892(var6.method1244());
				if (var7 != null && var1.contains(var7.method637())) {
					this.method594(var7, var6.field2027, var6.field2028, var2, var3);
				}
			}
		}

	}

	void method594(class96 var1, int var2, int var3, int var4, int var5) {
		class115 var7 = var1.method635(false);
		if (null != var7) {
			var7.method732(var2 - var7.field1084 / 2, var3 - var7.field1080 / 2);
			if (var4 % var5 < var5 / 2) {
				class266.method1546(var2, var3, 15, 16776960, 128);
				class266.method1546(var2, var3, 7, 16777215, 256);
			}

		}
	}

	void method572(class217 var1, int var2, int var3, float var4) {
		class96 var6 = class158.method892(var1.method1244());
		this.method585(var6, var2, var3);
		this.method586(var1, var6, var2, var3, var4);
	}

	void method585(class96 var1, int var2, int var3) {
		class115 var5 = var1.method635(false);
		if (null != var5) {
			int var6 = this.method575(var5, var1.field981);
			int var7 = this.method587(var5, var1.field976);
			var5.method732(var2 + var6, var3 + var7);
		}

	}

	void method586(class217 var1, class96 var2, int var3, int var4, float var5) {
		class197 var7 = var1.method1250();
		if (null != var7) {
			if (var7.field1799.method2283(var5)) {
				class253 var8 = (class253)this.field872.get(var7.field1799);
				var8.method1291(var7.field1797, var3 - var7.field1800 / 2, var4, var7.field1800, var7.field1798, -16777216 | var2.field970, 0, 1, 0, var8.field2066 / 2);
			}
		}
	}

	void method592(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field870.iterator();

		while (var7.hasNext()) {
			class217 var8 = (class217)var7.next();
			if (var8.method1246()) {
				int var9 = var8.field2025.field460 % 64;
				int var10 = var8.field2025.field462 % 64;
				var8.field2027 = (int)((float)var1 + var6 * (float)var9);
				var8.field2028 = (int)(var6 * (float)(63 - var10) + (float)var2);
				if (!var3.contains(var8.method1244())) {
					this.method572(var8, var8.field2027, var8.field2028, var6);
				}
			}
		}

	}

	int method575(class115 var1, class230 var2) {
		switch(var2.field2091) {
		case 0:
			return 0;
		case 2:
			return -var1.field1084 / 2;
		default:
			return -var1.field1084;
		}
	}

	int method587(class115 var1, class334 var2) {
		switch(var2.field2924) {
		case 0:
			return -var1.field1080 / 2;
		case 1:
			return 0;
		default:
			return -var1.field1080;
		}
	}

	class197 method602(int var1) {
		class96 var3 = class158.method892(var1);
		return this.method588(var3);
	}

	class197 method588(class96 var1) {
		if (null != var1.field963 && null != this.field872 && this.field872.get(class467.field4007) != null) {
			int var4 = var1.field965;
			class467[] var5 = new class467[]{class467.field4007, class467.field4002, class467.field4001};
			class467[] var6 = var5;
			int var7 = 0;

			class467 var3;
			while (true) {
				if (var7 >= var6.length) {
					var3 = null;
					break;
				}

				class467 var8 = var6[var7];
				if (var4 == var8.field4004) {
					var3 = var8;
					break;
				}

				++var7;
			}

			if (null == var3) {
				return null;
			} else {
				class253 var15 = (class253)this.field872.get(var3);
				if (null == var15) {
					return null;
				} else {
					var7 = var15.method1294(var1.field963, 1000000);
					String[] var16 = new String[var7];
					var15.method1293(var1.field963, (int[])null, var16);
					int var9 = var15.field2066 * var16.length / 2;
					int var10 = 0;
					String[] var11 = var16;

					for (int var12 = 0; var12 < var11.length; ++var12) {
						String var13 = var11[var12];
						int var14 = var15.method1292(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}

					return new class197(var1.field963, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	List method589(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var2 + var3) {
				Iterator var8 = this.field877.values().iterator();

				class217 var9;
				while (var8.hasNext()) {
					var9 = (class217)var8.next();
					if (var9.method1246() && var9.method1243(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field870.iterator();

				while (var8.hasNext()) {
					var9 = (class217)var8.next();
					if (var9.method1246() && var9.method1243(var4, var5)) {
						var7.add(var9);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	List method590() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field870);
		var2.addAll(this.field877.values());
		return var2;
	}

	void method591(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class266.method1554(this.field876 * var1, this.field876 * (63 - var2), this.field876, var4);
		}

		if (var3 == 1) {
			class266.method1559(this.field876 * var1, (63 - var2) * this.field876, this.field876, var4);
		}

		if (var3 == 2) {
			class266.method1554(this.field876 + var1 * this.field876 - 1, this.field876 * (63 - var2), this.field876, var4);
		}

		if (var3 == 3) {
			class266.method1559(this.field876 * var1, (63 - var2) * this.field876 + this.field876 - 1, this.field876, var4);
		}

	}
}
