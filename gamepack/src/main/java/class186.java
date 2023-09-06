import java.util.ArrayList;

public class class186 implements class405 {
	int field1748;
	int field1749;
	int field1750;
	int field1751;
	int field1752;
	int field1753;

	class186() {
	}

	public void method2098(class8 var1) {
		if (var1.field341 > this.field1753) {
			var1.field341 = this.field1753;
		}

		if (var1.field335 < this.field1753) {
			var1.field335 = this.field1753;
		}

		if (var1.field343 > this.field1748) {
			var1.field343 = this.field1748;
		}

		if (var1.field337 < this.field1748) {
			var1.field337 = this.field1748;
		}

	}

	public boolean method2093(int var1, int var2, int var3) {
		if (var1 >= this.field1750 && var1 < this.field1750 + this.field1752) {
			return this.field1749 == var2 >> 6 && this.field1751 == var3 >> 6;
		} else {
			return false;
		}
	}

	public boolean method2094(int var1, int var2) {
		return var1 >> 6 == this.field1753 && var2 >> 6 == this.field1748;
	}

	public int[] method2096(int var1, int var2, int var3) {
		if (!this.method2093(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{this.field1753 * 64 - this.field1749 * 64 + var2, var3 + (this.field1748 * 64 - this.field1751 * 64)};
			return var5;
		}
	}

	public class29 method2097(int var1, int var2) {
		if (!this.method2094(var1, var2)) {
			return null;
		} else {
			int var4 = this.field1749 * 64 - this.field1753 * 64 + var1;
			int var5 = this.field1751 * 64 - this.field1748 * 64 + var2;
			return new class29(this.field1750, var4, var5);
		}
	}

	public void method2095(class42 var1) {
		this.field1750 = var1.method278();
		this.field1752 = var1.method278();
		this.field1749 = var1.method327();
		this.field1751 = var1.method327();
		this.field1753 = var1.method327();
		this.field1748 = var1.method327();
		this.method1029();
	}

	void method1029() {
	}

	public static void method1031(class309 var0) {
		class102.method670(var0, 500000, 475000);
	}

	static int method1033(int var0, class167 var1, boolean var2) {
		if (var0 == 3200) {
			class203.field1903 -= 3;
			class240.method1367(class139.field1344[class203.field1903], class139.field1344[1 + class203.field1903], class139.field1344[2 + class203.field1903]);
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			int var13;
			int var16;
			if (var0 == 3201) {
				class203.field1903 -= 5;
				var13 = class139.field1344[class203.field1903];
				var16 = class139.field1344[class203.field1903 + 1];
				var6 = class139.field1344[2 + class203.field1903];
				var7 = class139.field1344[class203.field1903 + 3];
				var8 = class139.field1344[4 + class203.field1903];
				ArrayList var15 = new ArrayList();
				var15.add(var13);
				class248.method1445(var15, var16, var6, var7, var8);
				return 1;
			} else if (var0 == 3202) {
				class203.field1903 -= 2;
				class116.method739(class139.field1344[class203.field1903], class139.field1344[1 + class203.field1903]);
				return 1;
			} else {
				class150 var4;
				class485 var5;
				String var12;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var11;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var13 = class139.field1344[--class203.field1903];
							var16 = 0;
							class150 var20 = (class150)class451.method2249(class212.method1206(), var13);
							if (var20 != null) {
								var16 = var20 != class150.field1410 ? 1 : 0;
							}

							class139.field1344[++class203.field1903 - 1] = var16;
							return 1;
						} else if (var0 == 3218) {
							var13 = class139.field1344[--class203.field1903];
							var16 = 0;
							class485 var19 = (class485)class451.method2249(class23.method191(), var13);
							if (var19 != null) {
								var16 = class485.field4104 != var19 ? 1 : 0;
							}

							class139.field1344[++class203.field1903 - 1] = var16;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								class203.field1903 -= 2;
								var13 = class139.field1344[class203.field1903];
								var16 = class139.field1344[class203.field1903 + 1];
								class167.method924(var13, var16);
								return 1;
							} else if (var0 == 3221) {
								class203.field1903 -= 6;
								var13 = class139.field1344[class203.field1903];
								var16 = class139.field1344[1 + class203.field1903];
								var6 = class139.field1344[class203.field1903 + 2];
								var7 = class139.field1344[3 + class203.field1903];
								var8 = class139.field1344[class203.field1903 + 4];
								int var9 = class139.field1344[class203.field1903 + 5];
								ArrayList var10 = new ArrayList();
								var10.add(var13);
								var10.add(var16);
								class248.method1445(var10, var6, var7, var8, var9);
								return 1;
							} else if (var0 == 3222) {
								class203.field1903 -= 4;
								var13 = class139.field1344[class203.field1903];
								var16 = class139.field1344[class203.field1903 + 1];
								var6 = class139.field1344[class203.field1903 + 2];
								var7 = class139.field1344[class203.field1903 + 3];
								class269.method1579(var13, var16, var6, var7);
								return 1;
							} else {
								return 2;
							}
						} else {
							var4 = class150.field1410;
							var5 = class485.field4104;
							var11 = true;
							boolean var18 = true;
							if (var0 == 3217) {
								var8 = class139.field1344[--class203.field1903];
								var4 = (class150)class451.method2249(class212.method1206(), var8);
								if (var4 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var8));
								}
							}

							if (var0 == 3219) {
								var8 = class139.field1344[--class203.field1903];
								var5 = (class485)class451.method2249(class23.method191(), var8);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var8));
								}
							}

							String var14;
							byte var17;
							if (class485.field4104 == var5) {
								switch(var4.field1407) {
								case 1:
								case 2:
								case 3:
									var17 = 0;
									var7 = 1;
									break;
								case 4:
									var17 = 0;
									var7 = Integer.MAX_VALUE;
									break;
								case 5:
									var17 = 0;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown device option: %s.", var4.toString());
									throw new RuntimeException(var14);
								}
							} else {
								switch(var5.field4103) {
								case 1:
									var17 = 0;
									var7 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var17 = 0;
									var7 = 100;
									break;
								default:
									var14 = String.format("Unkown game option: %s.", var5.toString());
									throw new RuntimeException(var14);
								}
							}

							class139.field1344[++class203.field1903 - 1] = var17;
							class139.field1344[++class203.field1903 - 1] = var7;
							return 1;
						}
					} else {
						var4 = class150.field1410;
						var5 = class485.field4104;
						var11 = false;
						if (var0 == 3214) {
							var7 = class139.field1344[--class203.field1903];
							var4 = (class150)class451.method2249(class212.method1206(), var7);
							if (null == var4) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var7));
							}
						}

						if (var0 == 3215) {
							var7 = class139.field1344[--class203.field1903];
							var5 = (class485)class451.method2249(class23.method191(), var7);
							if (var5 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var7));
							}
						}

						if (var0 == 3210) {
							var7 = class139.field1344[--class203.field1903];
							var4 = (class150)class451.method2249(class212.method1206(), var7);
							if (var4 == null) {
								var5 = (class485)class451.method2249(class23.method191(), var7);
								if (var5 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var7));
								}
							}
						} else if (var0 == 3182) {
							var4 = class150.field1406;
						} else if (var0 == 3204) {
							var5 = class485.field4099;
						} else if (var0 == 3206) {
							var5 = class485.field4101;
						} else if (var0 == 3208) {
							var5 = class485.field4105;
						}

						if (class485.field4104 == var5) {
							switch(var4.field1407) {
							case 1:
								var6 = class176.field1701.method2491() ? 1 : 0;
								break;
							case 2:
								var6 = class176.field1701.method2509() ? 1 : 0;
								break;
							case 3:
								var6 = class176.field1701.method2497() ? 1 : 0;
								break;
							case 4:
								var6 = class176.field1701.method2493();
								break;
							case 5:
								var6 = class397.method2073();
								break;
							default:
								var12 = String.format("Unkown device option: %s.", var4.toString());
								throw new RuntimeException(var12);
							}
						} else {
							switch(var5.field4103) {
							case 1:
								var6 = class176.field1701.method2487() ? 1 : 0;
								break;
							case 2:
								var7 = class176.field1701.method2488();
								var6 = Math.round((float)(var7 * 100) / 255.0F);
								break;
							case 3:
								var7 = class176.field1701.method2496();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							case 4:
								var7 = class176.field1701.method2517();
								var6 = Math.round((float)(var7 * 100) / 127.0F);
								break;
							default:
								var12 = String.format("Unkown game option: %s.", var5.toString());
								throw new RuntimeException(var12);
							}
						}

						class139.field1344[++class203.field1903 - 1] = var6;
						return 1;
					}
				} else {
					var4 = class150.field1410;
					var5 = class485.field4104;
					var6 = class139.field1344[--class203.field1903];
					if (var0 == 3212) {
						var7 = class139.field1344[--class203.field1903];
						var4 = (class150)class451.method2249(class212.method1206(), var7);
						if (null == var4) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var7));
						}
					}

					if (var0 == 3213) {
						var7 = class139.field1344[--class203.field1903];
						var5 = (class485)class451.method2249(class23.method191(), var7);
						if (var5 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var7));
						}
					}

					if (var0 == 3209) {
						var7 = class139.field1344[--class203.field1903];
						var4 = (class150)class451.method2249(class212.method1206(), var7);
						if (var4 == null) {
							var5 = (class485)class451.method2249(class23.method191(), var7);
							if (null == var5) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var7));
							}
						}
					} else if (var0 == 3181) {
						var4 = class150.field1406;
					} else if (var0 == 3203) {
						var5 = class485.field4099;
					} else if (var0 == 3205) {
						var5 = class485.field4101;
					} else if (var0 == 3207) {
						var5 = class485.field4105;
					}

					if (class485.field4104 == var5) {
						switch(var4.field1407) {
						case 1:
							class176.field1701.method2510(var6 == 1);
							break;
						case 2:
							class176.field1701.method2507(var6 == 1);
							break;
						case 3:
							class176.field1701.method2489(var6 == 1);
							break;
						case 4:
							if (var6 < 0) {
								var6 = 0;
							}

							class176.field1701.method2492(var6);
							break;
						case 5:
							class4.method50(var6);
							break;
						default:
							var12 = String.format("Unkown device option: %s.", var4.toString());
							throw new RuntimeException(var12);
						}
					} else {
						switch(var5.field4103) {
						case 1:
							class176.field1701.method2486(var6 == 1);
							break;
						case 2:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 255) / 100.0F);
							class113.method698(var7);
							break;
						case 3:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							class465.method2278(var7);
							break;
						case 4:
							var6 = Math.min(Math.max(var6, 0), 100);
							var7 = Math.round((float)(var6 * 127) / 100.0F);
							class57.method418(var7);
							break;
						default:
							var12 = String.format("Unkown game option: %s.", var5.toString());
							throw new RuntimeException(var12);
						}
					}

					return 1;
				}
			}
		}
	}

	static void method1034(int var0) {
		if (var0 == -1 && !Client.field275) {
			class167.method924(0, 0);
		} else if (var0 != -1 && !class439.method2209(var0) && class176.field1701.method2488() != 0) {
			ArrayList var2 = new ArrayList();
			var2.add(new class104(class465.field3998, var0, 0, class176.field1701.method2488(), false));
			if (Client.field275) {
				class92.field904.clear();
				class92.field904.addAll(var2);
				class295.method1677(0, 100, 100, 0);
			} else {
				class81.method545(var2, 0, 100, 100, 0, false);
			}
		}

	}
}
