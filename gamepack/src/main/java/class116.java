import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfInfo(name = "jm")
public class class116 {
	@ObfInfo(name = "ac", desc = "Lkg;")
	static class227 field1113;
	@ObfInfo(name = "ap", desc = "Ljx;")
	class81 field1114;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 469172561)
	int field1109;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 932214009)
	int field1115;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1812215657)
	int field1116;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -349145457)
	int field1118;
	@ObfInfo(name = "al", desc = "Ljava/util/HashMap;")
	HashMap field1117;
	@ObfInfo(name = "aa", desc = "Ljava/util/LinkedList;")
	LinkedList field1111;
	@ObfInfo(name = "aq", desc = "Ljava/util/List;")
	List field1110;
	@ObfInfo(name = "an", desc = "Ljava/util/HashMap;")
	final HashMap field1112;

	static {
		field1113 = new class227(37748736, 256);
	}

	@ObfInfo(name = "<init>", desc = "(IIILjava/util/HashMap;)V")
	class116(int var1, int var2, int var3, HashMap var4) {
		this.field1118 = var1;
		this.field1109 = var2;
		this.field1111 = new LinkedList();
		this.field1110 = new LinkedList();
		this.field1117 = new HashMap();
		this.field1115 = var3 | -16777216;
		this.field1112 = var4;
	}

	@ObfInfo(name = "ao", desc = "(IIII)V", opaqueValue = "1724776825")
	void method673(int var1, int var2, int var3) {
		class150 var5 = method681(this.field1118, this.field1109, this.field1116);
		if (var5 != null) {
			if (var3 == this.field1116 * 64) {
				var5.method857(var1, var2);
			} else {
				var5.method873(var1, var2, var3, var3);
			}

		}
	}

	@ObfInfo(name = "at", desc = "(Ljx;Ljava/util/List;I)V")
	void method675(class81 var1, List var2) {
		this.field1117.clear();
		this.field1114 = var1;
		this.method674(var2);
	}

	@ObfInfo(name = "ac", desc = "(Ljava/util/HashSet;Ljava/util/List;I)V", opaqueValue = "597913141")
	void method646(HashSet var1, List var2) {
		this.field1117.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			class88 var5 = (class88)var4.next();
			if (var5.method2570() == this.field1118 && var5.method2571() == this.field1109) {
				this.field1111.add(var5);
			}
		}

		this.method674(var2);
	}

	@ObfInfo(name = "ai", desc = "(IIIILke;I)V", opaqueValue = "602399468")
	void method647(int var1, int var2, int var3, int var4, class528 var5) {
		for (int var7 = var1; var7 < var1 + var3; ++var7) {
			label65:
			for (int var8 = var2; var8 < var4 + var2; ++var8) {
				for (int var9 = 0; var9 < var5.field4212; ++var9) {
					class204[] var10 = var5.field4219[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						class204[] var11 = var10;

						for (int var12 = 0; var12 < var11.length; ++var12) {
							class292 var14;
							boolean var15;
							label56: {
								class204 var13 = var11[var12];
								var14 = class185.method1043(var13.field1856, (byte)-78);
								if (var14.field2365 != null) {
									int[] var16 = var14.field2365;

									for (int var17 = 0; var17 < var16.length; ++var17) {
										int var18 = var16[var17];
										class292 var19 = class185.method1043(var18, (byte)-65);
										if (var19.field2358 != -1) {
											var15 = true;
											break label56;
										}
									}
								} else if (var14.field2358 != -1) {
									var15 = true;
									break label56;
								}

								var15 = false;
							}

							if (var15) {
								this.method671(var14, var9, var7, var8, var5);
								continue label65;
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "az", desc = "(Lhv;IIILke;I)V", opaqueValue = "-948262298")
	void method671(class292 var1, int var2, int var3, int var4, class528 var5) {
		class50 var7 = new class50(var2, var3 + this.field1118 * 64, var4 + this.field1109 * 64);
		class50 var8 = null;
		if (this.field1114 != null) {
			var8 = new class50(this.field1114.field4211 + var2, this.field1114.field4216 * 64 + var3, var4 + this.field1114.field4214 * 64);
		} else {
			class88 var9 = (class88)var5;
			var8 = new class50(var9.field4211 + var2, var3 + var9.field4216 * 64 + var9.method569() * 8, var4 + var9.field4214 * 64 + var9.method570() * 8);
		}

		class185 var10;
		Object var11;
		if (null != var1.field2365) {
			var11 = new class417(var8, var7, var1.field2331, this);
		} else {
			var10 = class185.method1044(var1.field2358);
			var11 = new class169(var8, var7, var10.field1674, this.method664(var10));
		}

		var10 = class185.method1044(((class223)var11).method1208());
		if (var10.field1676) {
			this.field1117.put(new class50(0, var3, var4), var11);
		}

	}

	@ObfInfo(name = "ap", desc = "(I)V", opaqueValue = "-1774548488")
	void method649() {
		Iterator var2 = this.field1117.values().iterator();

		while (var2.hasNext()) {
			class223 var3 = (class223)var2.next();
			if (var3 instanceof class417) {
				((class417)var3).method2197();
			}
		}

	}

	@ObfInfo(name = "aa", desc = "(Ljava/util/List;B)V", opaqueValue = "67")
	void method674(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			class169 var4 = (class169)var3.next();
			if (class185.method1044(var4.field1583).field1676 && var4.field1939.field581 >> 6 == this.field1118 && this.field1109 == var4.field1939.field583 >> 6) {
				class169 var5 = new class169(var4.field1939, var4.field1939, var4.field1583, this.method678(var4.field1583));
				this.field1110.add(var5);
			}
		}

	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "-1894007589")
	void method650() {
		if (null != this.field1114) {
			this.field1114.method2566();
		} else {
			Iterator var2 = this.field1111.iterator();

			while (var2.hasNext()) {
				class88 var3 = (class88)var2.next();
				var3.method2566();
			}
		}

	}

	@ObfInfo(name = "ad", desc = "(Lnu;B)Z", opaqueValue = "0")
	boolean method672(class437 var1) {
		this.field1117.clear();
		if (null != this.field1114) {
			this.field1114.method2565(var1);
			if (this.field1114.method2564()) {
				this.method647(0, 0, 64, 64, this.field1114);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			class88 var5;
			for (var4 = this.field1111.iterator(); var4.hasNext(); var3 &= var5.method2564()) {
				var5 = (class88)var4.next();
				var5.method2565(var1);
			}

			if (var3) {
				var4 = this.field1111.iterator();

				while (var4.hasNext()) {
					var5 = (class88)var4.next();
					this.method647(var5.method568() * 8, var5.method567() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	@ObfInfo(name = "aq", desc = "(ILku;[Luk;Lnu;Lnu;I)V", opaqueValue = "-2013967337")
	void method676(int var1, class268 var2, class398[] var3, class437 var4, class437 var5) {
		this.field1116 = var1;
		if (this.field1114 != null || !this.field1111.isEmpty()) {
			if (method681(this.field1118, this.field1109, var1) == null) {
				boolean var7 = true;
				var7 &= this.method672(var4);
				int var9;
				if (null != this.field1114) {
					var9 = this.field1114.field4218;
				} else {
					var9 = ((class528)this.field1111.getFirst()).field4218;
				}

				var7 &= var5.method2271(var9);
				if (var7) {
					byte[] var8 = var5.method2274(var9);
					class147 var10;
					if (null == var8) {
						var10 = new class147();
					} else {
						var10 = new class147(class499.method2495(var8).field1463);
					}

					class150 var12 = new class150(this.field1116 * 64, this.field1116 * 64);
					var12.method851();
					if (this.field1114 != null) {
						this.method654(var2, var3, var10);
					} else {
						this.method655(var2, var3, var10);
					}

					int var13 = this.field1118;
					int var14 = this.field1109;
					int var15 = this.field1116;
					class227 var16 = field1113;
					long var18 = (long)(var15 << 16 | var13 << 8 | var14);
					var16.method1222(var12, var18, 4 * var12.field1463.length);
					this.method650();
				}
			}
		}
	}

	@ObfInfo(name = "al", desc = "(IIILjava/util/HashSet;I)V", opaqueValue = "1193379897")
	void method652(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method660(var1, var2, var4, var3);
		this.method668(var1, var2, var4, var3);
	}

	@ObfInfo(name = "an", desc = "(Ljava/util/HashSet;III)V", opaqueValue = "-1725395948")
	void method653(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field1117.values().iterator();

		while (var5.hasNext()) {
			class223 var6 = (class223)var5.next();
			if (var6.method1210()) {
				int var7 = var6.method1208();
				if (var1.contains(var7)) {
					class185 var8 = class185.method1044(var7);
					this.method670(var8, var6.field1941, var6.field1942, var2, var3);
				}
			}
		}

		this.method669(var1, var2, var3);
	}

	@ObfInfo(name = "ar", desc = "(Lku;[Luk;Lkd;B)V", opaqueValue = "27")
	void method654(class268 var1, class398[] var2, class147 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method656(var5, var6, this.field1114, var1, var3);
				this.method657(var5, var6, this.field1114, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method679(var5, var6, this.field1114, var1, var2);
			}
		}

	}

	@ObfInfo(name = "ab", desc = "(Lku;[Luk;Lkd;I)V", opaqueValue = "-2041624736")
	void method655(class268 var1, class398[] var2, class147 var3) {
		Iterator var5 = this.field1111.iterator();

		class88 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class88)var5.next();

			for (var7 = var6.method568() * 8; var7 < var6.method568() * 8 + 8; ++var7) {
				for (var8 = var6.method567() * 8; var8 < var6.method567() * 8 + 8; ++var8) {
					this.method656(var7, var8, var6, var1, var3);
					this.method657(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field1111.iterator();

		while (var5.hasNext()) {
			var6 = (class88)var5.next();

			for (var7 = var6.method568() * 8; var7 < var6.method568() * 8 + 8; ++var7) {
				for (var8 = var6.method567() * 8; var8 < var6.method567() * 8 + 8; ++var8) {
					this.method679(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	@ObfInfo(name = "ag", desc = "(IILke;Lku;[Luk;B)V")
	void method679(int var1, int var2, class528 var3, class268 var4, class398[] var5) {
		this.method677(var1, var2, var3);
		this.method659(var1, var2, var3, var5);
	}

	@ObfInfo(name = "am", desc = "(IILke;Lku;Lkd;I)V", opaqueValue = "-1187094622")
	void method656(int var1, int var2, class528 var3, class268 var4, class147 var5) {
		int var7 = var3.field4215[0][var1][var2] - 1;
		int var8 = var3.field4213[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class83.method542(var1 * this.field1116, (63 - var2) * this.field1116, this.field1116, this.field1116, this.field1115);
		}

		int var9 = 16711935;
		int var10;
		if (var8 != -1) {
			int var11 = this.field1115;
			class102 var13 = (class102)class102.field994.method294((long)var8);
			class102 var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = class102.field999.method2267(4, var8);
				var13 = new class102();
				if (null != var14) {
					var13.method604(new class280(var14), var8);
				}

				var13.method603();
				class102.field994.method293(var13, (long)var8);
				var12 = var13;
			}

			if (null == var12) {
				var10 = var11;
			} else {
				int var15;
				int var16;
				if (var12.field991 >= 0) {
					var16 = class232.method1230(var12.field996, var12.field995, var12.field997);
					var15 = class135.method774(var16, 96);
					var10 = class276.field2233[var15] | -16777216;
				} else if (var12.field987 >= 0) {
					var16 = class135.method774(class276.field2238.field4225.method492(var12.field987), 96);
					var10 = class276.field2233[var16] | -16777216;
				} else if (var12.field988 == 16711935) {
					var10 = var11;
				} else {
					var16 = class232.method1230(var12.field992, var12.field993, var12.field998);
					var15 = class135.method774(var16, 96);
					var10 = class276.field2233[var15] | -16777216;
				}
			}

			var9 = var10;
		}

		if (var8 > -1 && var3.field4222[0][var1][var2] == 0) {
			class83.method542(this.field1116 * var1, this.field1116 * (63 - var2), this.field1116, this.field1116, var9);
		} else {
			var10 = this.method658(var1, var2, var3, var5);
			if (var8 == -1) {
				class83.method542(var1 * this.field1116, (63 - var2) * this.field1116, this.field1116, this.field1116, var10);
			} else {
				var4.method1403(var1 * this.field1116, this.field1116 * (63 - var2), var10, var9, this.field1116, this.field1116, var3.field4222[0][var1][var2], var3.field4209[0][var1][var2]);
			}
		}
	}

	@ObfInfo(name = "ax", desc = "(IILke;Lku;I)V", opaqueValue = "-1187093526")
	void method657(int var1, int var2, class528 var3, class268 var4) {
		for (int var6 = 1; var6 < var3.field4212; ++var6) {
			int var7 = var3.field4213[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var9 = this.field1115;
				class102 var11 = (class102)class102.field994.method294((long)var7);
				class102 var10;
				if (var11 != null) {
					var10 = var11;
				} else {
					byte[] var12 = class102.field999.method2267(4, var7);
					var11 = new class102();
					if (var12 != null) {
						var11.method604(new class280(var12), var7);
					}

					var11.method603();
					class102.field994.method293(var11, (long)var7);
					var10 = var11;
				}

				int var8;
				if (var10 == null) {
					var8 = var9;
				} else {
					int var13;
					int var14;
					if (var10.field991 >= 0) {
						var14 = class232.method1230(var10.field996, var10.field995, var10.field997);
						var13 = class135.method774(var14, 96);
						var8 = class276.field2233[var13] | -16777216;
					} else if (var10.field987 >= 0) {
						var14 = class135.method774(class276.field2238.field4225.method492(var10.field987), 96);
						var8 = class276.field2233[var14] | -16777216;
					} else if (var10.field988 == 16711935) {
						var8 = var9;
					} else {
						var14 = class232.method1230(var10.field992, var10.field993, var10.field998);
						var13 = class135.method774(var14, 96);
						var8 = class276.field2233[var13] | -16777216;
					}
				}

				if (var3.field4222[var6][var1][var2] == 0) {
					class83.method542(var1 * this.field1116, this.field1116 * (63 - var2), this.field1116, this.field1116, var8);
				} else {
					var4.method1403(this.field1116 * var1, this.field1116 * (63 - var2), 0, var8, this.field1116, this.field1116, var3.field4222[var6][var1][var2], var3.field4209[var6][var1][var2]);
				}
			}
		}

	}

	@ObfInfo(name = "ah", desc = "(IILke;Lkd;I)I")
	int method658(int var1, int var2, class528 var3, class147 var4) {
		return var3.field4215[0][var1][var2] == 0 ? this.field1115 : var4.method846(var1, var2);
	}

	@ObfInfo(name = "as", desc = "(IILke;[Luk;I)V", opaqueValue = "-462268706")
	void method659(int var1, int var2, class528 var3, class398[] var4) {
		for (int var6 = 0; var6 < var3.field4212; ++var6) {
			class204[] var7 = var3.field4219[var6][var1][var2];
			if (null != var7 && var7.length != 0) {
				class204[] var8 = var7;

				for (int var9 = 0; var9 < var8.length; ++var9) {
					class204 var10 = var8[var9];
					if (!class92.method583(var10.field1855)) {
						int var12 = var10.field1855;
						boolean var11 = class92.field950.field936 == var12;
						if (!var11) {
							continue;
						}
					}

					class292 var13 = class185.method1043(var10.field1856, (byte)-44);
					if (var13.field2357 != -1) {
						if (var13.field2357 != 46 && var13.field2357 != 52) {
							var4[var13.field2357].method2114(this.field1116 * var1, (63 - var2) * this.field1116, this.field1116 * 2, this.field1116 * 2);
						} else {
							var4[var13.field2357].method2114(var1 * this.field1116, (63 - var2) * this.field1116, this.field1116 * 2 + 1, 1 + this.field1116 * 2);
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "ay", desc = "(IILke;I)V", opaqueValue = "-836761217")
	void method677(int var1, int var2, class528 var3) {
		for (int var5 = 0; var5 < var3.field4212; ++var5) {
			class204[] var6 = var3.field4219[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class204[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					class204 var9 = var7[var8];
					if (class92.method582(var9.field1855)) {
						class292 var10 = class185.method1043(var9.field1856, (byte)-62);
						int var11 = var10.field2348 != 0 ? -3407872 : -3355444;
						if (class92.field933.field936 == var9.field1855) {
							this.method667(var1, var2, var9.field1857, var11);
						}

						if (var9.field1855 == class92.field930.field936) {
							this.method667(var1, var2, var9.field1857, -3355444);
							this.method667(var1, var2, var9.field1857 + 1, var11);
						}

						if (var9.field1855 == class92.field931.field936) {
							if (var9.field1857 == 0) {
								class83.method553(var1 * this.field1116, this.field1116 * (63 - var2), 1, var11);
							}

							if (var9.field1857 == 1) {
								class83.method553(var1 * this.field1116 + this.field1116 - 1, this.field1116 * (63 - var2), 1, var11);
							}

							if (var9.field1857 == 2) {
								class83.method553(this.field1116 * var1 + this.field1116 - 1, (63 - var2) * this.field1116 + this.field1116 - 1, 1, var11);
							}

							if (var9.field1857 == 3) {
								class83.method553(var1 * this.field1116, this.field1116 + this.field1116 * (63 - var2) - 1, 1, var11);
							}
						}

						if (var9.field1855 == class92.field949.field936) {
							int var12 = var9.field1857 % 2;
							int var13;
							if (var12 == 0) {
								for (var13 = 0; var13 < this.field1116; ++var13) {
									class83.method553(var13 + var1 * this.field1116, (64 - var2) * this.field1116 - 1 - var13, 1, var11);
								}
							} else {
								for (var13 = 0; var13 < this.field1116; ++var13) {
									class83.method553(var13 + var1 * this.field1116, this.field1116 * (63 - var2) + var13, 1, var11);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "aj", desc = "(IILjava/util/HashSet;IB)V", opaqueValue = "-1")
	void method660(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field1117.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			class50 var10 = (class50)var9.getKey();
			int var11 = (int)((float)var1 + var6 * (float)var10.field581 - var7);
			int var12 = (int)((float)(var4 + var2) - var6 * (float)var10.field583 - var7);
			class223 var13 = (class223)var9.getValue();
			if (var13 != null && var13.method1210()) {
				var13.field1941 = var11;
				var13.field1942 = var12;
				class185 var14 = class185.method1044(var13.method1208());
				if (!var3.contains(var14.method1042())) {
					this.method648(var13, var11, var12, var6);
				}
			}
		}

	}

	@ObfInfo(name = "av", desc = "(Ljava/util/HashSet;III)V", opaqueValue = "1406161234")
	void method669(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field1110.iterator();

		while (var5.hasNext()) {
			class223 var6 = (class223)var5.next();
			if (var6.method1210()) {
				class185 var7 = class185.method1044(var6.method1208());
				if (var7 != null && var1.contains(var7.method1042())) {
					this.method670(var7, var6.field1941, var6.field1942, var2, var3);
				}
			}
		}

	}

	@ObfInfo(name = "aw", desc = "(Lhd;IIIII)V")
	void method670(class185 var1, int var2, int var3, int var4, int var5) {
		class150 var7 = var1.method1040(false);
		if (null != var7) {
			var7.method877(var2 - var7.field1464 / 2, var3 - var7.field1460 / 2);
			if (var4 % var5 < var5 / 2) {
				class83.method540(var2, var3, 15, 16776960, 128);
				class83.method540(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfInfo(name = "ak", desc = "(Lkp;IIFB)V")
	void method648(class223 var1, int var2, int var3, float var4) {
		class185 var6 = class185.method1044(var1.method1208());
		this.method661(var6, var2, var3);
		this.method662(var1, var6, var2, var3, var4);
	}

	@ObfInfo(name = "bh", desc = "(Lhd;III)V", opaqueValue = "-715486258")
	void method661(class185 var1, int var2, int var3) {
		class150 var5 = var1.method1040(false);
		if (null != var5) {
			int var6 = this.method651(var5, var1.field1691);
			int var7 = this.method663(var5, var1.field1686);
			var5.method877(var2 + var6, var3 + var7);
		}

	}

	@ObfInfo(name = "bj", desc = "(Lkp;Lhd;IIFI)V", opaqueValue = "939287333")
	void method662(class223 var1, class185 var2, int var3, int var4, float var5) {
		class465 var7 = var1.method1213();
		if (null != var7) {
			if (var7.field3764.method2040(var5)) {
				class258 var8 = (class258)this.field1112.get(var7.field3764);
				var8.method1645(var7.field3762, var3 - var7.field3765 / 2, var4, var7.field3765, var7.field3763, -16777216 | var2.field1680, 0, 1, 0, var8.field2414 / 2);
			}
		}
	}

	@ObfInfo(name = "bk", desc = "(IILjava/util/HashSet;IB)V", opaqueValue = "45")
	void method668(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field1110.iterator();

		while (var7.hasNext()) {
			class223 var8 = (class223)var7.next();
			if (var8.method1210()) {
				int var9 = var8.field1939.field581 % 64;
				int var10 = var8.field1939.field583 % 64;
				var8.field1941 = (int)((float)var1 + var6 * (float)var9);
				var8.field1942 = (int)(var6 * (float)(63 - var10) + (float)var2);
				if (!var3.contains(var8.method1208())) {
					this.method648(var8, var8.field1941, var8.field1942, var6);
				}
			}
		}

	}

	@ObfInfo(name = "bv", desc = "(Lui;Lhe;I)I")
	int method651(class150 var1, class48 var2) {
		switch(var2.field570) {
		case 0:
			return 0;
		case 2:
			return -var1.field1464 / 2;
		default:
			return -var1.field1464;
		}
	}

	@ObfInfo(name = "bt", desc = "(Lui;Lhy;I)I")
	int method663(class150 var1, class263 var2) {
		switch(var2.field2120) {
		case 0:
			return -var1.field1460 / 2;
		case 1:
			return 0;
		default:
			return -var1.field1460;
		}
	}

	@ObfInfo(name = "bd", desc = "(IB)Lkq;")
	class465 method678(int var1) {
		class185 var3 = class185.method1044(var1);
		return this.method664(var3);
	}

	@ObfInfo(name = "by", desc = "(Lhd;I)Lkq;", opaqueValue = "1166317334")
	class465 method664(class185 var1) {
		if (null != var1.field1673 && null != this.field1112 && this.field1112.get(class383.field2947) != null) {
			int var4 = var1.field1675;
			class383[] var5 = new class383[]{class383.field2947, class383.field2942, class383.field2941};
			class383[] var6 = var5;
			int var7 = 0;

			class383 var3;
			while (true) {
				if (var7 >= var6.length) {
					var3 = null;
					break;
				}

				class383 var8 = var6[var7];
				if (var4 == var8.field2944) {
					var3 = var8;
					break;
				}

				++var7;
			}

			if (null == var3) {
				return null;
			} else {
				class258 var15 = (class258)this.field1112.get(var3);
				if (null == var15) {
					return null;
				} else {
					var7 = var15.method1648(var1.field1673, 1000000);
					String[] var16 = new String[var7];
					var15.method1647(var1.field1673, (int[])null, var16);
					int var9 = var15.field2414 * var16.length / 2;
					int var10 = 0;
					String[] var11 = var16;

					for (int var12 = 0; var12 < var11.length; ++var12) {
						String var13 = var11[var12];
						int var14 = var15.method1646(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}

					return new class465(var1.field1673, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	@ObfInfo(name = "bs", desc = "(IIIIIB)Ljava/util/List;", opaqueValue = "4")
	List method665(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var2 + var3) {
				Iterator var8 = this.field1117.values().iterator();

				class223 var9;
				while (var8.hasNext()) {
					var9 = (class223)var8.next();
					if (var9.method1210() && var9.method1207(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field1110.iterator();

				while (var8.hasNext()) {
					var9 = (class223)var8.next();
					if (var9.method1210() && var9.method1207(var4, var5)) {
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

	@ObfInfo(name = "bm", desc = "(B)Ljava/util/List;")
	List method666() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field1110);
		var2.addAll(this.field1117.values());
		return var2;
	}

	@ObfInfo(name = "bf", desc = "(IIIIB)V", opaqueValue = "11")
	void method667(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class83.method548(this.field1116 * var1, this.field1116 * (63 - var2), this.field1116, var4);
		}

		if (var3 == 1) {
			class83.method553(this.field1116 * var1, (63 - var2) * this.field1116, this.field1116, var4);
		}

		if (var3 == 2) {
			class83.method548(this.field1116 + var1 * this.field1116 - 1, this.field1116 * (63 - var2), this.field1116, var4);
		}

		if (var3 == 3) {
			class83.method553(this.field1116 * var1, (63 - var2) * this.field1116 + this.field1116 - 1, this.field1116, var4);
		}

	}

	@ObfInfo(name = "au", desc = "(IIIB)Lui;")
	static class150 method681(int var0, int var1, int var2) {
		class227 var4 = field1113;
		long var5 = (long)(var2 << 16 | var0 << 8 | var1);
		return (class150)var4.method1219(var5);
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public static void method680() {
		field1113.method1223(5);
	}
}
