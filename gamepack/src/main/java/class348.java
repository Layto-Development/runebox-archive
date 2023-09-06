public class class348 implements class360 {
	class215 field2995;
	class479[] field2997;
	class86 field2998;
	double field2996;
	int field2993;
	int field2994;
	int field2999;

	public class348(class215 var1, class215 var2, int var3, double var4, int var6) {
		this.field2998 = new class86();
		this.field2994 = 0;
		this.field2996 = 1.0D;
		this.field2999 = 128;
		this.field2995 = var2;
		this.field2993 = var3;
		this.field2994 = this.field2993;
		this.field2996 = var4;
		this.field2999 = var6;
		int[] var7 = var1.method1223(0);
		if (var7 != null) {
			int var8 = var7.length;
			this.field2997 = new class479[var1.method1238(0)];

			for (int var9 = 0; var9 < var8; ++var9) {
				class42 var10 = new class42(var1.method1212(0, var7[var9]));
				this.field2997[var7[var9]] = new class479(var10);
			}
		} else {
			this.field2997 = new class479[0];
		}

	}

	public int method1908() {
		if (this.field2997.length == 0) {
			return 100;
		} else {
			int var2 = 0;
			int var3 = 0;
			class479[] var4 = this.field2997;

			for (int var5 = 0; var5 < var4.length; ++var5) {
				class479 var6 = var4[var5];
				if (var6 != null && var6.field4071 != null) {
					var2 += var6.field4071.length;
					int[] var7 = var6.field4071;

					for (int var8 = 0; var8 < var7.length; ++var8) {
						int var9 = var7[var8];
						if (this.field2995.method1215(var9)) {
							++var3;
						}
					}
				}
			}

			if (var2 == 0) {
				return 0;
			} else {
				return var3 * 100 / var2;
			}
		}
	}

	public void method1909(double var1) {
		this.field2996 = var1;
		this.method1914();
	}

	public int[] method1948(int var1) {
		class479 var3 = this.field2997[var1];
		if (null != var3) {
			if (var3.field4077 != null) {
				this.field2998.method568(var3);
				var3.field4076 = true;
				return var3.field4077;
			}

			boolean var4 = var3.method2391(this.field2996, this.field2999, this.field2995);
			if (var4) {
				if (this.field2994 == 0) {
					class479 var5 = (class479)this.field2998.method562();
					var5.method2389();
				} else {
					--this.field2994;
				}

				this.field2998.method568(var3);
				var3.field4076 = true;
				return var3.field4077;
			}
		}

		return null;
	}

	public int method1945(int var1) {
		return this.field2997[var1] != null ? this.field2997[var1].field4069 : 0;
	}

	public boolean method1947(int var1) {
		return this.field2997[var1].field4070;
	}

	public boolean method1946(int var1) {
		return this.field2999 == 64;
	}

	public void method1914() {
		for (int var2 = 0; var2 < this.field2997.length; ++var2) {
			if (null != this.field2997[var2]) {
				this.field2997[var2].method2389();
			}
		}

		this.field2998 = new class86();
		this.field2994 = this.field2993;
	}

	public void method1910(int var1) {
		for (int var3 = 0; var3 < this.field2997.length; ++var3) {
			class479 var4 = this.field2997[var3];
			if (null != var4 && var4.field4075 != 0 && var4.field4076) {
				var4.method2390(var1);
				var4.field4076 = false;
			}
		}

	}

	public static byte[] method1915(CharSequence var0) {
		int var2 = var0.length();
		byte[] var3 = new byte[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
				if (var5 == 8364) {
					var3[var4] = -128;
				} else if (var5 == 8218) {
					var3[var4] = -126;
				} else if (var5 == 402) {
					var3[var4] = -125;
				} else if (var5 == 8222) {
					var3[var4] = -124;
				} else if (var5 == 8230) {
					var3[var4] = -123;
				} else if (var5 == 8224) {
					var3[var4] = -122;
				} else if (var5 == 8225) {
					var3[var4] = -121;
				} else if (var5 == 710) {
					var3[var4] = -120;
				} else if (var5 == 8240) {
					var3[var4] = -119;
				} else if (var5 == 352) {
					var3[var4] = -118;
				} else if (var5 == 8249) {
					var3[var4] = -117;
				} else if (var5 == 338) {
					var3[var4] = -116;
				} else if (var5 == 381) {
					var3[var4] = -114;
				} else if (var5 == 8216) {
					var3[var4] = -111;
				} else if (var5 == 8217) {
					var3[var4] = -110;
				} else if (var5 == 8220) {
					var3[var4] = -109;
				} else if (var5 == 8221) {
					var3[var4] = -108;
				} else if (var5 == 8226) {
					var3[var4] = -107;
				} else if (var5 == 8211) {
					var3[var4] = -106;
				} else if (var5 == 8212) {
					var3[var4] = -105;
				} else if (var5 == 732) {
					var3[var4] = -104;
				} else if (var5 == 8482) {
					var3[var4] = -103;
				} else if (var5 == 353) {
					var3[var4] = -102;
				} else if (var5 == 8250) {
					var3[var4] = -101;
				} else if (var5 == 339) {
					var3[var4] = -100;
				} else if (var5 == 382) {
					var3[var4] = -98;
				} else if (var5 == 376) {
					var3[var4] = -97;
				} else {
					var3[var4] = 63;
				}
			} else {
				var3[var4] = (byte)var5;
			}
		}

		return var3;
	}
}
