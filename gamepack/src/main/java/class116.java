import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class116 {

	static class190 field1417;

	class316 field1418;

	int field1413;

	int field1419;

	int field1420;

	int field1422;

	HashMap field1421;

	LinkedList field1415;

	List field1414;

	final HashMap field1416;

	static {
		field1417 = new class190(37748736, 256);
	}

	class116(int var1, int var2, int var3, HashMap var4) {
		this.field1422 = var1;
		this.field1413 = var2;
		this.field1415 = new LinkedList();
		this.field1414 = new LinkedList();
		this.field1421 = new HashMap();
		this.field1419 = var3 | -16777216;
		this.field1416 = var4;
	}

	void method820(int var1, int var2, int var3) {
		class84 var5 = method828(this.field1422, this.field1413, this.field1420);
		if (var5 != null) {
			if (var3 == this.field1420 * 64) {
				var5.method360(var1, var2);
			} else {
				var5.method376(var1, var2, var3, var3);
			}
		}
	}

	void method822(class316 var1, List var2) {
		this.field1421.clear();
		this.field1418 = var1;
		this.method821(var2);
	}

	void method793(HashSet var1, List var2) {
		this.field1421.clear();
		Iterator var4 = var1.iterator();
		while (var4.hasNext()) {
			class381 var5 = (class381) var4.next();
			if (var5.method395() == this.field1422 && var5.method396() == this.field1413) {
				this.field1415.add(var5);
			}
		}
		this.method821(var2);
	}

	void method794(int var1, int var2, int var3, int var4, class87 var5) {
		for (int var7 = var1; var7 < var1 + var3; ++var7) {
			label65: for (int var8 = var2; var8 < var4 + var2; ++var8) {
				for (int var9 = 0; var9 < var5.field863; ++var9) {
					class133[] var10 = var5.field870[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						class133[] var11 = var10;
						for (int var12 = 0; var12 < var11.length; ++var12) {
							class362 var14;
							boolean var15;
							label56: {
								class133 var13 = var11[var12];
								var14 = class319.method1705(var13.field1477, (byte) -78);
								if (var14.field2909 != null) {
									int[] var16 = var14.field2909;
									for (int var17 = 0; var17 < var16.length; ++var17) {
										int var18 = var16[var17];
										class362 var19 = class319.method1705(var18, (byte) -65);
										if (var19.field2902 != -1) {
											var15 = true;
											break label56;
										}
									}
								} else if (var14.field2902 != -1) {
									var15 = true;
									break label56;
								}
								var15 = false;
							}
							if (var15) {
								this.method818(var14, var9, var7, var8, var5);
								continue label65;
							}
						}
					}
				}
			}
		}
	}

	void method818(class362 var1, int var2, int var3, int var4, class87 var5) {
		class402 var7 = new class402(var2, var3 + this.field1422 * 64, var4 + this.field1413 * 64);
		class402 var8 = null;
		if (this.field1418 != null) {
			var8 = new class402(this.field1418.field862 + var2, this.field1418.field867 * 64 + var3, var4 + this.field1418.field865 * 64);
		} else {
			class381 var9 = (class381) var5;
			var8 = new class402(var9.field862 + var2, var3 + var9.field867 * 64 + var9.method2010() * 8, var4 + var9.field865 * 64 + var9.method2011() * 8);
		}
		class319 var10;
		Object var11;
		if (null != var1.field2909) {
			var11 = new class181(var8, var7, var1.field2875, this);
		} else {
			var10 = class319.method1706(var1.field2902);
			var11 = new class130(var8, var7, var10.field2488, this.method811(var10));
		}
		var10 = class319.method1706(((class234) var11).method1371());
		if (var10.field2490) {
			this.field1421.put(new class402(0, var3, var4), var11);
		}
	}

	void method796() {
		Iterator var2 = this.field1421.values().iterator();
		while (var2.hasNext()) {
			class234 var3 = (class234) var2.next();
			if (var3 instanceof class181) {
				((class181) var3).method1063();
			}
		}
	}

	void method821(List var1) {
		Iterator var3 = var1.iterator();
		while (var3.hasNext()) {
			class130 var4 = (class130) var3.next();
			if (class319.method1706(var4.field1470).field2490 && var4.field2023.field3174 >> 6 == this.field1422 && this.field1413 == var4.field2023.field3176 >> 6) {
				class130 var5 = new class130(var4.field2023, var4.field2023, var4.field1470, this.method825(var4.field1470));
				this.field1414.add(var5);
			}
		}
	}

	void method797() {
		if (null != this.field1418) {
			this.field1418.method391();
		} else {
			Iterator var2 = this.field1415.iterator();
			while (var2.hasNext()) {
				class381 var3 = (class381) var2.next();
				var3.method391();
			}
		}
	}

	boolean method819(class338 var1) {
		this.field1421.clear();
		if (null != this.field1418) {
			this.field1418.method390(var1);
			if (this.field1418.method389()) {
				this.method794(0, 0, 64, 64, this.field1418);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;
			Iterator var4;
			class381 var5;
			for (var4 = this.field1415.iterator(); var4.hasNext(); var3 &= var5.method389()) {
				var5 = (class381) var4.next();
				var5.method390(var1);
			}
			if (var3) {
				var4 = this.field1415.iterator();
				while (var4.hasNext()) {
					var5 = (class381) var4.next();
					this.method794(var5.method2009() * 8, var5.method2008() * 8, 8, 8, var5);
				}
			}
			return var3;
		}
	}

	void method823(int var1, class332 var2, class214[] var3, class338 var4, class338 var5) {
		this.field1420 = var1;
		if (this.field1418 != null || !this.field1415.isEmpty()) {
			if (method828(this.field1422, this.field1413, var1) == null) {
				boolean var7 = true;
				var7 = true & this.method819(var4);
				int var9;
				if (null != this.field1418) {
					var9 = this.field1418.field869;
				} else {
					var9 = ((class87) this.field1415.getFirst()).field869;
				}
				var7 &= var5.method1766(var9);
				if (var7) {
					byte[] var8 = var5.method1769(var9);
					class296 var10;
					if (null == var8) {
						var10 = new class296();
					} else {
						var10 = new class296(class512.method2461(var8).field847);
					}
					class84 var12 = new class84(this.field1420 * 64, this.field1420 * 64);
					var12.method354();
					if (this.field1418 != null) {
						this.method801(var2, var3, var10);
					} else {
						this.method802(var2, var3, var10);
					}
					int var13 = this.field1422;
					int var14 = this.field1413;
					int var15 = this.field1420;
					class190 var16 = field1417;
					long var18 = (long) (var15 << 16 | var13 << 8 | var14);
					var16.method1169(var12, var18, 4 * var12.field847.length);
					this.method797();
				}
			}
		}
	}

	void method799(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}
		this.method807(var1, var2, var4, var3);
		this.method815(var1, var2, var4, var3);
	}

	void method800(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field1421.values().iterator();
		while (var5.hasNext()) {
			class234 var6 = (class234) var5.next();
			if (var6.method1373()) {
				int var7 = var6.method1371();
				if (var1.contains(var7)) {
					class319 var8 = class319.method1706(var7);
					this.method817(var8, var6.field2025, var6.field2026, var2, var3);
				}
			}
		}
		this.method816(var1, var2, var3);
	}

	void method801(class332 var1, class214[] var2, class296 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method803(var5, var6, this.field1418, var1, var3);
				this.method804(var5, var6, this.field1418, var1);
			}
		}
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method826(var5, var6, this.field1418, var1, var2);
			}
		}
	}

	void method802(class332 var1, class214[] var2, class296 var3) {
		Iterator var5 = this.field1415.iterator();
		class381 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class381) var5.next();
			for (var7 = var6.method2009() * 8; var7 < var6.method2009() * 8 + 8; ++var7) {
				for (var8 = var6.method2008() * 8; var8 < var6.method2008() * 8 + 8; ++var8) {
					this.method803(var7, var8, var6, var1, var3);
					this.method804(var7, var8, var6, var1);
				}
			}
		}
		var5 = this.field1415.iterator();
		while (var5.hasNext()) {
			var6 = (class381) var5.next();
			for (var7 = var6.method2009() * 8; var7 < var6.method2009() * 8 + 8; ++var7) {
				for (var8 = var6.method2008() * 8; var8 < var6.method2008() * 8 + 8; ++var8) {
					this.method826(var7, var8, var6, var1, var2);
				}
			}
		}
	}

	void method826(int var1, int var2, class87 var3, class332 var4, class214[] var5) {
		this.method824(var1, var2, var3);
		this.method806(var1, var2, var3, var5);
	}

	void method803(int var1, int var2, class87 var3, class332 var4, class296 var5) {
		int var7 = var3.field866[0][var1][var2] - 1;
		int var8 = var3.field864[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class206.method1236(var1 * this.field1420, (63 - var2) * this.field1420, this.field1420, this.field1420, this.field1419);
		}
		int var9 = 16711935;
		int var10;
		if (var8 != -1) {
			int var11 = this.field1419;
			class541 var13 = (class541) class541.field4288.method648((long) var8);
			class541 var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = class541.field4293.method1762(4, var8);
				var13 = new class541();
				if (null != var14) {
					var13.method2607(new class187(var14), var8);
				}
				var13.method2606();
				class541.field4288.method647(var13, (long) var8);
				var12 = var13;
			}
			if (null == var12) {
				var10 = var11;
			} else {
				int var15;
				int var16;
				if (var12.field4285 >= 0) {
					var16 = class260.method1460(var12.field4290, var12.field4289, var12.field4291);
					var15 = class469.method2293(var16, 96);
					var10 = class238.field2034[var15] | -16777216;
				} else if (var12.field4281 >= 0) {
					var16 = class469.method2293(class238.field2039.field2270.method172(var12.field4281), 96);
					var10 = class238.field2034[var16] | -16777216;
				} else if (var12.field4282 == 16711935) {
					var10 = var11;
				} else {
					var16 = class260.method1460(var12.field4286, var12.field4287, var12.field4292);
					var15 = class469.method2293(var16, 96);
					var10 = class238.field2034[var15] | -16777216;
				}
			}
			var9 = var10;
		}
		if (var8 > -1 && var3.field873[0][var1][var2] == 0) {
			class206.method1236(this.field1420 * var1, this.field1420 * (63 - var2), this.field1420, this.field1420, var9);
		} else {
			var10 = this.method805(var1, var2, var3, var5);
			if (var8 == -1) {
				class206.method1236(var1 * this.field1420, (63 - var2) * this.field1420, this.field1420, this.field1420, var10);
			} else {
				var4.method1747(var1 * this.field1420, this.field1420 * (63 - var2), var10, var9, this.field1420, this.field1420, var3.field873[0][var1][var2], var3.field860[0][var1][var2]);
			}
		}
	}

	void method804(int var1, int var2, class87 var3, class332 var4) {
		for (int var6 = 1; var6 < var3.field863; ++var6) {
			int var7 = var3.field864[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var9 = this.field1419;
				class541 var11 = (class541) class541.field4288.method648((long) var7);
				class541 var10;
				if (var11 != null) {
					var10 = var11;
				} else {
					byte[] var12 = class541.field4293.method1762(4, var7);
					var11 = new class541();
					if (var12 != null) {
						var11.method2607(new class187(var12), var7);
					}
					var11.method2606();
					class541.field4288.method647(var11, (long) var7);
					var10 = var11;
				}
				int var8;
				if (var10 == null) {
					var8 = var9;
				} else {
					int var13;
					int var14;
					if (var10.field4285 >= 0) {
						var14 = class260.method1460(var10.field4290, var10.field4289, var10.field4291);
						var13 = class469.method2293(var14, 96);
						var8 = class238.field2034[var13] | -16777216;
					} else if (var10.field4281 >= 0) {
						var14 = class469.method2293(class238.field2039.field2270.method172(var10.field4281), 96);
						var8 = class238.field2034[var14] | -16777216;
					} else if (var10.field4282 == 16711935) {
						var8 = var9;
					} else {
						var14 = class260.method1460(var10.field4286, var10.field4287, var10.field4292);
						var13 = class469.method2293(var14, 96);
						var8 = class238.field2034[var13] | -16777216;
					}
				}
				if (var3.field873[var6][var1][var2] == 0) {
					class206.method1236(var1 * this.field1420, this.field1420 * (63 - var2), this.field1420, this.field1420, var8);
				} else {
					var4.method1747(this.field1420 * var1, this.field1420 * (63 - var2), 0, var8, this.field1420, this.field1420, var3.field873[var6][var1][var2], var3.field860[var6][var1][var2]);
				}
			}
		}
	}

	int method805(int var1, int var2, class87 var3, class296 var4) {
		return var3.field866[0][var1][var2] == 0 ? this.field1419 : var4.method1593(var1, var2);
	}

	void method806(int var1, int var2, class87 var3, class214[] var4) {
		for (int var6 = 0; var6 < var3.field863; ++var6) {
			class133[] var7 = var3.field870[var6][var1][var2];
			if (null != var7 && var7.length != 0) {
				class133[] var8 = var7;
				for (int var9 = 0; var9 < var8.length; ++var9) {
					class133 var10 = var8[var9];
					if (!class184.method1074(var10.field1476)) {
						int var12 = var10.field1476;
						boolean var11 = class184.field1809.field1795 == var12;
						if (!var11) {
							continue;
						}
					}
					class362 var13 = class319.method1705(var10.field1477, (byte) -44);
					if (var13.field2901 != -1) {
						if (var13.field2901 != 46 && var13.field2901 != 52) {
							var4[var13.field2901].method1291(this.field1420 * var1, (63 - var2) * this.field1420, this.field1420 * 2, this.field1420 * 2);
						} else {
							var4[var13.field2901].method1291(var1 * this.field1420, (63 - var2) * this.field1420, this.field1420 * 2 + 1, 1 + this.field1420 * 2);
						}
					}
				}
			}
		}
	}

	void method824(int var1, int var2, class87 var3) {
		for (int var5 = 0; var5 < var3.field863; ++var5) {
			class133[] var6 = var3.field870[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class133[] var7 = var6;
				for (int var8 = 0; var8 < var7.length; ++var8) {
					class133 var9 = var7[var8];
					if (class184.method1073(var9.field1476)) {
						class362 var10 = class319.method1705(var9.field1477, (byte) -62);
						int var11 = var10.field2892 != 0 ? -3407872 : -3355444;
						if (class184.field1792.field1795 == var9.field1476) {
							this.method814(var1, var2, var9.field1478, var11);
						}
						if (var9.field1476 == class184.field1789.field1795) {
							this.method814(var1, var2, var9.field1478, -3355444);
							this.method814(var1, var2, var9.field1478 + 1, var11);
						}
						if (var9.field1476 == class184.field1790.field1795) {
							if (var9.field1478 == 0) {
								class206.method1247(var1 * this.field1420, this.field1420 * (63 - var2), 1, var11);
							}
							if (var9.field1478 == 1) {
								class206.method1247(var1 * this.field1420 + this.field1420 - 1, this.field1420 * (63 - var2), 1, var11);
							}
							if (var9.field1478 == 2) {
								class206.method1247(this.field1420 * var1 + this.field1420 - 1, (63 - var2) * this.field1420 + this.field1420 - 1, 1, var11);
							}
							if (var9.field1478 == 3) {
								class206.method1247(var1 * this.field1420, this.field1420 + this.field1420 * (63 - var2) - 1, 1, var11);
							}
						}
						if (var9.field1476 == class184.field1808.field1795) {
							int var12 = var9.field1478 % 2;
							int var13;
							if (var12 == 0) {
								for (var13 = 0; var13 < this.field1420; ++var13) {
									class206.method1247(var13 + var1 * this.field1420, (64 - var2) * this.field1420 - 1 - var13, 1, var11);
								}
							} else {
								for (var13 = 0; var13 < this.field1420; ++var13) {
									class206.method1247(var13 + var1 * this.field1420, this.field1420 * (63 - var2) + var13, 1, var11);
								}
							}
						}
					}
				}
			}
		}
	}

	void method807(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float) var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field1421.entrySet().iterator();
		while (var8.hasNext()) {
			Entry var9 = (Entry) var8.next();
			class402 var10 = (class402) var9.getKey();
			int var11 = (int) ((float) var1 + var6 * (float) var10.field3174 - var7);
			int var12 = (int) ((float) (var4 + var2) - var6 * (float) var10.field3176 - var7);
			class234 var13 = (class234) var9.getValue();
			if (var13 != null && var13.method1373()) {
				var13.field2025 = var11;
				var13.field2026 = var12;
				class319 var14 = class319.method1706(var13.method1371());
				if (!var3.contains(var14.method1704())) {
					this.method795(var13, var11, var12, var6);
				}
			}
		}
	}

	void method816(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field1414.iterator();
		while (var5.hasNext()) {
			class234 var6 = (class234) var5.next();
			if (var6.method1373()) {
				class319 var7 = class319.method1706(var6.method1371());
				if (var7 != null && var1.contains(var7.method1704())) {
					this.method817(var7, var6.field2025, var6.field2026, var2, var3);
				}
			}
		}
	}

	void method817(class319 var1, int var2, int var3, int var4, int var5) {
		class84 var7 = var1.method1702(false);
		if (null != var7) {
			var7.method380(var2 - var7.field848 / 2, var3 - var7.field844 / 2);
			if (var4 % var5 < var5 / 2) {
				class206.method1234(var2, var3, 15, 16776960, 128);
				class206.method1234(var2, var3, 7, 16777215, 256);
			}
		}
	}

	void method795(class234 var1, int var2, int var3, float var4) {
		class319 var6 = class319.method1706(var1.method1371());
		this.method808(var6, var2, var3);
		this.method809(var1, var6, var2, var3, var4);
	}

	void method808(class319 var1, int var2, int var3) {
		class84 var5 = var1.method1702(false);
		if (null != var5) {
			int var6 = this.method798(var5, var1.field2505);
			int var7 = this.method810(var5, var1.field2500);
			var5.method380(var2 + var6, var3 + var7);
		}
	}

	void method809(class234 var1, class319 var2, int var3, int var4, float var5) {
		class245 var7 = var1.method1376();
		if (null != var7) {
			if (var7.field2086.method2578(var5)) {
				class61 var8 = (class61) this.field1416.get(var7.field2086);
				var8.method2385(var7.field2084, var3 - var7.field2087 / 2, var4, var7.field2087, var7.field2085, -16777216 | var2.field2494, 0, 1, 0, var8.field4005 / 2);
			}
		}
	}

	void method815(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float) var4 / 64.0F;
		Iterator var7 = this.field1414.iterator();
		while (var7.hasNext()) {
			class234 var8 = (class234) var7.next();
			if (var8.method1373()) {
				int var9 = var8.field2023.field3174 % 64;
				int var10 = var8.field2023.field3176 % 64;
				var8.field2025 = (int) ((float) var1 + var6 * (float) var9);
				var8.field2026 = (int) (var6 * (float) (63 - var10) + (float) var2);
				if (!var3.contains(var8.method1371())) {
					this.method795(var8, var8.field2025, var8.field2026, var6);
				}
			}
		}
	}

	int method798(class84 var1, class164 var2) {
		switch(var2.field1661) {
			case 0:
				return 0;
			case 2:
				return -var1.field848 / 2;
			default:
				return -var1.field848;
		}
	}

	int method810(class84 var1, class141 var2) {
		switch(var2.field1535) {
			case 0:
				return -var1.field844 / 2;
			case 1:
				return 0;
			default:
				return -var1.field844;
		}
	}

	class245 method825(int var1) {
		class319 var3 = class319.method1706(var1);
		return this.method811(var3);
	}

	class245 method811(class319 var1) {
		if (null != var1.field2487 && null != this.field1416 && this.field1416.get(class532.field4204) != null) {
			int var4 = var1.field2489;
			class532[] var5 = new class532[] { class532.field4204, class532.field4199, class532.field4198 };
			class532[] var6 = var5;
			int var7 = 0;
			class532 var3;
			while (true) {
				if (var7 >= var6.length) {
					var3 = null;
					break;
				}
				class532 var8 = var6[var7];
				if (var4 == var8.field4201) {
					var3 = var8;
					break;
				}
				++var7;
			}
			if (null == var3) {
				return null;
			} else {
				class61 var15 = (class61) this.field1416.get(var3);
				if (null == var15) {
					return null;
				} else {
					var7 = var15.method2388(var1.field2487, 1000000);
					String[] var16 = new String[var7];
					var15.method2387(var1.field2487, (int[]) null, var16);
					int var9 = var15.field4005 * var16.length / 2;
					int var10 = 0;
					String[] var11 = var16;
					for (int var12 = 0; var12 < var11.length; ++var12) {
						String var13 = var11[var12];
						int var14 = var15.method2386(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}
					return new class245(var1.field2487, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	List method812(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var2 + var3) {
				Iterator var8 = this.field1421.values().iterator();
				class234 var9;
				while (var8.hasNext()) {
					var9 = (class234) var8.next();
					if (var9.method1373() && var9.method1370(var4, var5)) {
						var7.add(var9);
					}
				}
				var8 = this.field1414.iterator();
				while (var8.hasNext()) {
					var9 = (class234) var8.next();
					if (var9.method1373() && var9.method1370(var4, var5)) {
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

	List method813() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field1414);
		var2.addAll(this.field1421.values());
		return var2;
	}

	void method814(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class206.method1242(this.field1420 * var1, this.field1420 * (63 - var2), this.field1420, var4);
		}
		if (var3 == 1) {
			class206.method1247(this.field1420 * var1, (63 - var2) * this.field1420, this.field1420, var4);
		}
		if (var3 == 2) {
			class206.method1242(this.field1420 + var1 * this.field1420 - 1, this.field1420 * (63 - var2), this.field1420, var4);
		}
		if (var3 == 3) {
			class206.method1247(this.field1420 * var1, (63 - var2) * this.field1420 + this.field1420 - 1, this.field1420, var4);
		}
	}

	static class84 method828(int var0, int var1, int var2) {
		class190 var4 = field1417;
		long var5 = (long) (var2 << 16 | var0 << 8 | var1);
		return (class84) var4.method1166(var5);
	}

	public static void method827() {
		field1417.method1170(5);
	}
}
