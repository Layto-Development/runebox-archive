public class class257 implements class68 {
	boolean field2364;
	boolean field2366;
	class60 field2365;

	public class257() {
		this.field2365 = null;
		this.field2364 = false;
		this.field2366 = false;
	}

	public void method1508(class60 var1) {
		this.method1507();
		if (var1 != null) {
			this.field2365 = var1;
			class108 var3 = var1.method459();
			if (null != var3) {
				var3.field1043.method2306(true);
				if (var3.field1044 != null) {
					class309 var4 = new class309();
					var4.method1742(var1);
					var4.method1743(var3.field1044);
					class289.method1659().method567(var4);
				}
			}
		}

	}

	public class60 method1505() {
		return this.field2365;
	}

	public void method1507() {
		if (this.field2365 != null) {
			class108 var2 = this.field2365.method459();
			class60 var3 = this.field2365;
			this.field2365 = null;
			if (var2 != null) {
				var2.field1043.method2306(false);
				if (null != var2.field1044) {
					class309 var4 = new class309();
					var4.method1742(var3);
					var4.method1743(var2.field1044);
					class289.method1659().method567(var4);
				}

			}
		}
	}

	public boolean method498(int var1) {
		if (this.field2365 == null) {
			return false;
		} else {
			class240 var3 = this.field2365.method448();
			if (null == var3) {
				return false;
			} else {
				if (var3.method1376(var1)) {
					switch(var1) {
					case 81:
						this.field2366 = true;
						break;
					case 82:
						this.field2364 = true;
						break;
					default:
						if (this.method1506(var1)) {
							class185.method1024(this.field2365);
						}
					}
				}

				return var3.method1366(var1);
			}
		}
	}

	public boolean method496(int var1) {
		switch(var1) {
		case 81:
			this.field2366 = false;
			return false;
		case 82:
			this.field2364 = false;
			return false;
		default:
			return false;
		}
	}

	public boolean method497(char var1) {
		if (this.field2365 == null) {
			return false;
		} else {
			boolean var3;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
				var3 = true;
			} else {
				label80: {
					if (var1 != 0) {
						char[] var4 = class389.field3272;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var1 == var6) {
								var3 = true;
								break label80;
							}
						}
					}

					var3 = false;
				}
			}

			if (!var3) {
				return false;
			} else {
				class477 var7 = this.field2365.method472();
				if (null != var7 && var7.method2348()) {
					class240 var8 = this.field2365.method448();
					if (null == var8) {
						return false;
					} else {
						if (var8.method1368(var1) && var7.method2365(var1)) {
							class185.method1024(this.field2365);
						}

						return var8.method1371(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	public boolean method499(boolean var1) {
		return false;
	}

	boolean method1506(int var1) {
		if (null == this.field2365) {
			return false;
		} else {
			class477 var3 = this.field2365.method472();
			if (null != var3 && var3.method2348()) {
				switch(var1) {
				case 13:
					this.method1507();
					return true;
				case 48:
					if (this.field2364) {
						var3.method2383();
					}

					return true;
				case 65:
					if (this.field2364) {
						var3.method2307(class355.method1938());
					}

					return true;
				case 66:
					if (this.field2364) {
						var3.method2337(class355.method1938());
					}

					return true;
				case 67:
					if (this.field2364) {
						var3.method2338(class355.method1938());
					}

					return true;
				case 84:
					if (var3.method2351() == 0) {
						var3.method2365(10);
					} else if (this.field2366 && var3.method2369()) {
						var3.method2365(10);
					} else {
						class108 var4 = this.field2365.method459();
						class309 var5 = new class309();
						var5.method1742(this.field2365);
						var5.method1743(var4.field1040);
						class289.method1659().method567(var5);
						this.method1507();
					}

					return true;
				case 85:
					if (this.field2364) {
						var3.method2322();
					} else {
						var3.method2320();
					}

					return true;
				case 96:
					if (this.field2364) {
						var3.method2331(this.field2366);
					} else {
						var3.method2377(this.field2366);
					}

					return true;
				case 97:
					if (this.field2364) {
						var3.method2332(this.field2366);
					} else {
						var3.method2330(this.field2366);
					}

					return true;
				case 98:
					if (this.field2364) {
						var3.method2378();
					} else {
						var3.method2333(this.field2366);
					}

					return true;
				case 99:
					if (this.field2364) {
						var3.method2339();
					} else {
						var3.method2334(this.field2366);
					}

					return true;
				case 101:
					if (this.field2364) {
						var3.method2343();
					} else {
						var3.method2321();
					}

					return true;
				case 102:
					if (this.field2364) {
						var3.method2328(this.field2366);
					} else {
						var3.method2326(this.field2366);
					}

					return true;
				case 103:
					if (this.field2364) {
						var3.method2329(this.field2366);
					} else {
						var3.method2327(this.field2366);
					}

					return true;
				case 104:
					if (this.field2364) {
						var3.method2373(this.field2366);
					} else {
						var3.method2335(this.field2366);
					}

					return true;
				case 105:
					if (this.field2364) {
						var3.method2372(this.field2366);
					} else {
						var3.method2323(this.field2366);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	static final void method1509(int var0, int var1, int var2, int var3, class115 var4, class420 var5) {
		if (null != var4) {
			int var7 = Client.field181 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = class133.field1291[var7];
				int var10 = class133.field1289[var7];
				int var11 = var2 * var10 + var9 * var3 >> 16;
				int var12 = var3 * var10 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method724(var5.field3506 / 2 + var11 - var4.field1081 / 2, var5.field3505 / 2 - var12 - var4.field1082 / 2, var0, var1, var5.field3506, var5.field3505, var5.field3508, var5.field3507);
				} else {
					var4.method732(var0 + var5.field3506 / 2 + var11 - var4.field1081 / 2, var5.field3505 / 2 + var1 - var12 - var4.field1082 / 2);
				}

			}
		}
	}
}
