import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class375 extends class218 {
	public static class215 field3144;
	public static class215 field3145;
	public static class344 field3146;
	public static class344 field3152;
	static int field3180;
	class526 field3163;
	int field3166;
	int field3174;
	int field3175;
	int field3178;
	int field3181;
	int field3182;
	int[] field3151;
	int[] field3167;
	int[] field3186;
	short[] field3169;
	short[] field3184;
	short[] field3189;
	public boolean field3143;
	public boolean field3172;
	public boolean field3176;
	public boolean field3183;
	public boolean field3185;
	public int field3148;
	public int field3150;
	public int field3153;
	public int field3154;
	public int field3155;
	public int field3156;
	public int field3157;
	public int field3158;
	public int field3159;
	public int field3160;
	public int field3161;
	public int field3162;
	public int field3165;
	public int field3170;
	public int field3171;
	public int field3173;
	public int field3179;
	public int field3187;
	public int field3188;
	public int[] field3177;
	public String field3149;
	public String[] field3147;
	public short[] field3164;
	public short[] field3168;

	static {
		field3146 = new class344(64);
		field3152 = new class344(50);
	}

	class375() {
		this.field3149 = class433.field3850;
		this.field3150 = 1;
		this.field3153 = -1;
		this.field3154 = -1;
		this.field3155 = -1;
		this.field3170 = -1;
		this.field3157 = -1;
		this.field3158 = -1;
		this.field3159 = -1;
		this.field3160 = -1;
		this.field3161 = -1;
		this.field3162 = -1;
		this.field3187 = -1;
		this.field3156 = -1;
		this.field3165 = -1;
		this.field3171 = -1;
		this.field3188 = -1;
		this.field3147 = new String[5];
		this.field3172 = true;
		this.field3173 = -1;
		this.field3174 = 128;
		this.field3166 = 128;
		this.field3176 = false;
		this.field3175 = 0;
		this.field3178 = 0;
		this.field3179 = 32;
		this.field3181 = -1;
		this.field3182 = -1;
		this.field3183 = true;
		this.field3143 = true;
		this.field3185 = false;
		this.field3186 = null;
		this.field3184 = null;
	}

	void method1996() {
	}

	void method1997(class42 var1, byte var2) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				if (var2 <= -1) {
					throw new IllegalStateException();
				}

				return;
			}

			this.method1998(var1, var3);
		}
	}

	void method1998(class42 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method278();
			this.field3167 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3167[var5] = var1.method327();
			}
		} else if (var2 == 2) {
			this.field3149 = var1.method286();
		} else if (var2 == 12) {
			this.field3150 = var1.method278();
		} else if (var2 == 13) {
			this.field3153 = var1.method327();
		} else if (var2 == 14) {
			this.field3170 = var1.method327();
		} else if (var2 == 15) {
			this.field3154 = var1.method327();
		} else if (var2 == 16) {
			this.field3155 = var1.method327();
		} else if (var2 == 17) {
			this.field3170 = var1.method327();
			this.field3157 = var1.method327();
			this.field3158 = var1.method327();
			this.field3159 = var1.method327();
		} else if (var2 == 18) {
			var1.method327();
		} else if (var2 >= 30 && var2 < 35) {
			this.field3147[var2 - 30] = var1.method286();
			if (this.field3147[var2 - 30].equalsIgnoreCase(class433.field3792)) {
				this.field3147[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method278();
			this.field3189 = new short[var4];
			this.field3168 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3189[var5] = (short)var1.method327();
				this.field3168[var5] = (short)var1.method327();
			}
		} else if (var2 == 41) {
			var4 = var1.method278();
			this.field3169 = new short[var4];
			this.field3164 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3169[var5] = (short)var1.method327();
				this.field3164[var5] = (short)var1.method327();
			}
		} else if (var2 == 60) {
			var4 = var1.method278();
			this.field3151 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field3151[var5] = var1.method327();
			}
		} else if (var2 == 93) {
			this.field3172 = false;
		} else if (var2 == 95) {
			this.field3173 = var1.method327();
		} else if (var2 == 97) {
			this.field3174 = var1.method327();
		} else if (var2 == 98) {
			this.field3166 = var1.method327();
		} else if (var2 == 99) {
			this.field3176 = true;
		} else if (var2 == 100) {
			this.field3175 = var1.method279();
		} else if (var2 == 101) {
			this.field3178 = var1.method279() * 5;
		} else {
			int var6;
			if (var2 == 102) {
				var4 = var1.method278();
				var5 = 0;

				for (var6 = var4; var6 != 0; var6 >>= 1) {
					++var5;
				}

				this.field3186 = new int[var5];
				this.field3184 = new short[var5];

				for (int var7 = 0; var7 < var5; ++var7) {
					if ((var4 & 1 << var7) == 0) {
						this.field3186[var7] = -1;
						this.field3184[var7] = -1;
					} else {
						this.field3186[var7] = var1.method326();
						this.field3184[var7] = (short)var1.method290();
					}
				}
			} else if (var2 == 103) {
				this.field3179 = var1.method327();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.field3183 = false;
				} else if (var2 == 109) {
					this.field3143 = false;
				} else if (var2 == 111) {
					this.field3185 = true;
				} else if (var2 == 114) {
					this.field3160 = var1.method327();
				} else if (var2 == 115) {
					this.field3160 = var1.method327();
					this.field3161 = var1.method327();
					this.field3162 = var1.method327();
					this.field3187 = var1.method327();
				} else if (var2 == 116) {
					this.field3156 = var1.method327();
				} else if (var2 == 117) {
					this.field3156 = var1.method327();
					this.field3165 = var1.method327();
					this.field3171 = var1.method327();
					this.field3188 = var1.method327();
				} else if (var2 == 249) {
					this.field3163 = class475.method2299(var1, this.field3163);
				}
			} else {
				this.field3181 = var1.method327();
				if (this.field3181 == 65535) {
					this.field3181 = -1;
				}

				this.field3182 = var1.method327();
				if (this.field3182 == 65535) {
					this.field3182 = -1;
				}

				var4 = -1;
				if (var2 == 118) {
					var4 = var1.method327();
					if (var4 == 65535) {
						var4 = -1;
					}
				}

				var5 = var1.method278();
				this.field3177 = new int[var5 + 2];

				for (var6 = 0; var6 <= var5; ++var6) {
					this.field3177[var6] = var1.method327();
					if (this.field3177[var6] == 65535) {
						this.field3177[var6] = -1;
					}
				}

				this.field3177[var5 + 1] = var4;
			}
		}

	}

	public final class250 method1999(class393 var1, int var2, class393 var3, int var4, class447 var5) {
		if (null != this.field3177) {
			class375 var12 = this.method2001();
			return null == var12 ? null : var12.method1999(var1, var2, var3, var4, var5);
		} else {
			long var7 = (long)this.field3148;
			if (var5 != null) {
				var7 |= var5.field3934 << 16;
			}

			class250 var9 = (class250)field3152.method1890(var7);
			if (var9 == null) {
				class48 var10 = this.method2009(this.field3167, var5);
				if (null == var10) {
					return null;
				}

				var9 = var10.method369(this.field3175 + 64, this.field3178 + 850, -30, -50, -30);
				field3152.method1889(var9, var7);
			}

			class250 var11;
			if (var1 != null && var3 != null) {
				var11 = var1.method2056(var9, var2, var3, var4);
			} else if (null != var1) {
				var11 = var1.method2054(var9, var2);
			} else if (var3 != null) {
				var11 = var3.method2054(var9, var4);
			} else {
				var11 = var9.method1451(true);
			}

			if (this.field3174 != 128 || this.field3166 != 128) {
				var11.method1465(this.field3174, this.field3166, this.field3174);
			}

			return var11;
		}
	}

	public final class48 method2000(class447 var1) {
		if (null != this.field3177) {
			class375 var3 = this.method2001();
			return null == var3 ? null : var3.method2000(var1);
		} else {
			return this.method2009(this.field3151, var1);
		}
	}

	class48 method2009(int[] var1, class447 var2) {
		int[] var4 = var1;
		if (var2 != null && null != var2.field3932) {
			var4 = var2.field3932;
		}

		if (var4 == null) {
			return null;
		} else {
			boolean var5 = false;

			for (int var6 = 0; var6 < var4.length; ++var6) {
				if (var4[var6] != -1 && !field3145.method1214(var4[var6], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				class48[] var10 = new class48[var4.length];

				for (int var7 = 0; var7 < var4.length; ++var7) {
					var10[var7] = class48.method373(field3145, var4[var7], 0);
				}

				class48 var11;
				if (var10.length == 1) {
					var11 = var10[0];
					if (var11 == null) {
						var11 = new class48(var10, var10.length);
					}
				} else {
					var11 = new class48(var10, var10.length);
				}

				short[] var8;
				int var9;
				if (this.field3189 != null) {
					var8 = this.field3168;
					if (var2 != null && null != var2.field3933) {
						var8 = var2.field3933;
					}

					for (var9 = 0; var9 < this.field3189.length; ++var9) {
						var11.method372(this.field3189[var9], var8[var9]);
					}
				}

				if (this.field3169 != null) {
					var8 = this.field3164;
					if (var2 != null && null != var2.field3935) {
						var8 = var2.field3935;
					}

					for (var9 = 0; var9 < this.field3169.length; ++var9) {
						var11.method363(this.field3169[var9], var8[var9]);
					}
				}

				return var11;
			}
		}
	}

	public final class375 method2001() {
		int var2 = -1;
		if (this.field3181 != -1) {
			var2 = class516.method2516(this.field3181);
		} else if (this.field3182 != -1) {
			var2 = class23.field443[this.field3182];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field3177.length - 1) {
			var3 = this.field3177[var2];
		} else {
			var3 = this.field3177[this.field3177.length - 1];
		}

		return var3 != -1 ? class150.method861(var3) : null;
	}

	public boolean method2005() {
		if (null == this.field3177) {
			return true;
		} else {
			int var2 = -1;
			if (this.field3181 != -1) {
				var2 = class516.method2516(this.field3181);
			} else if (this.field3182 != -1) {
				var2 = class23.field443[this.field3182];
			}

			if (var2 >= 0 && var2 < this.field3177.length) {
				return this.field3177[var2] != -1;
			} else {
				return this.field3177[this.field3177.length - 1] != -1;
			}
		}
	}

	public int method2010(int var1, int var2) {
		class526 var5 = this.field3163;
		int var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class380 var6 = (class380)var5.method2543((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = var6.field3226;
			}
		}

		return var4;
	}

	public String method2008(int var1, String var2) {
		class526 var5 = this.field3163;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class509 var6 = (class509)var5.method2543((long)var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4186;
			}
		}

		return var4;
	}

	public boolean method2003() {
		return this.field3186 != null && this.field3184 != null;
	}

	public int[] method2004() {
		return this.field3186;
	}

	public int method2002(int var1) {
		return this.field3186 != null && var1 < this.field3186.length ? this.field3186[var1] : -1;
	}

	public short[] method2006() {
		return this.field3184;
	}

	public short method2007(int var1) {
		return null != this.field3184 && var1 < this.field3184.length ? this.field3184[var1] : -1;
	}

	public static void method2011(class42 var0, int var1) {
		class141 var3 = new class141();
		var3.field1354 = var0.method278();
		var3.field1355 = var0.method282();
		var3.field1362 = new int[var3.field1354];
		var3.field1357 = new int[var3.field1354];
		var3.field1361 = new Field[var3.field1354];
		var3.field1359 = new int[var3.field1354];
		var3.field1360 = new Method[var3.field1354];
		var3.field1356 = new byte[var3.field1354][][];

		for (int var4 = 0; var4 < var3.field1354; ++var4) {
			try {
				int var5 = var0.method278();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method286();
						var7 = var0.method286();
						var8 = var0.method278();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method286();
						}

						String var26 = var0.method286();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method282();
								var11[var12] = new byte[var13];
								var0.method288(var11[var12], 0, var13);
							}
						}

						var3.field1362[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = class469.method2285(var9[var13]);
						}

						Class var28 = class469.method2285(var26);
						if (class469.method2285(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = class469.method2285(var6).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var18.length == var27.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var28 == var17.getReturnType()) {
										var3.field1360[var4] = var17;
									}
								}
							}
						}

						var3.field1356[var4] = var11;
					}
				} else {
					var6 = var0.method286();
					var7 = var0.method286();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method282();
					}

					var3.field1362[var4] = var5;
					var3.field1359[var4] = var8;
					if (class469.method2285(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field1361[var4] = class469.method2285(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field1357[var4] = -1;
			} catch (SecurityException var22) {
				var3.field1357[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field1357[var4] = -3;
			} catch (Exception var24) {
				var3.field1357[var4] = -4;
			} catch (Throwable var25) {
				var3.field1357[var4] = -5;
			}
		}

		class493.field4136.method403(var3);
	}
}
