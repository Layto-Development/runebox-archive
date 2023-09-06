public abstract class class215 {
	static class381 field2023;
	static int field2022;
	boolean field2007;
	boolean field2020;
	class320 field2009;
	class320[] field2018;
	int field2013;
	int[] field2010;
	int[] field2011;
	int[] field2012;
	int[] field2016;
	int[] field2021;
	int[][] field2008;
	int[][] field2014;
	Object[] field2015;
	Object[][] field2017;
	public int field2019;

	static {
		field2023 = new class381();
		field2022 = 0;
	}

	class215(boolean var1, boolean var2) {
		this.field2020 = var1;
		this.field2007 = var2;
	}

	void method1235(byte[] var1) {
		int var4 = var1.length;
		int var6 = -1;

		int var7;
		for (var7 = 0; var7 < var4; ++var7) {
			var6 = var6 >>> 8 ^ class42.field526[(var6 ^ var1[var7]) & 255];
		}

		var6 = ~var6;
		this.field2019 = var6;
		class42 var5 = new class42(class81.method538(var1));
		var6 = var5.method278();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.method282();
			}

			var7 = var5.method278();
			if (var6 >= 7) {
				this.field2013 = var5.method292();
			} else {
				this.field2013 = var5.method327();
			}

			int var8 = 0;
			int var9 = -1;
			this.field2021 = new int[this.field2013];
			int var10;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field2013; ++var10) {
					this.field2021[var10] = var8 += var5.method292();
					if (this.field2021[var10] > var9) {
						var9 = this.field2021[var10];
					}
				}
			} else {
				for (var10 = 0; var10 < this.field2013; ++var10) {
					this.field2021[var10] = var8 += var5.method327();
					if (this.field2021[var10] > var9) {
						var9 = this.field2021[var10];
					}
				}
			}

			this.field2010 = new int[var9 + 1];
			this.field2011 = new int[var9 + 1];
			this.field2012 = new int[var9 + 1];
			this.field2008 = new int[var9 + 1][];
			this.field2015 = new Object[var9 + 1];
			this.field2017 = new Object[var9 + 1][];
			if (var7 != 0) {
				this.field2016 = new int[var9 + 1];

				for (var10 = 0; var10 < this.field2013; ++var10) {
					this.field2016[this.field2021[var10]] = var5.method282();
				}

				this.field2009 = new class320(this.field2016);
			}

			for (var10 = 0; var10 < this.field2013; ++var10) {
				this.field2010[this.field2021[var10]] = var5.method282();
			}

			for (var10 = 0; var10 < this.field2013; ++var10) {
				this.field2011[this.field2021[var10]] = var5.method282();
			}

			for (var10 = 0; var10 < this.field2013; ++var10) {
				this.field2012[this.field2021[var10]] = var5.method327();
			}

			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field2013; ++var10) {
					var11 = this.field2021[var10];
					var12 = this.field2012[var11];
					var8 = 0;
					var13 = -1;
					this.field2008[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field2008[var11][var14] = var8 += var5.method292();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field2017[var11] = new Object[var13 + 1];
				}
			} else {
				for (var10 = 0; var10 < this.field2013; ++var10) {
					var11 = this.field2021[var10];
					var12 = this.field2012[var11];
					var8 = 0;
					var13 = -1;
					this.field2008[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field2008[var11][var14] = var8 += var5.method327();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field2017[var11] = new Object[var13 + 1];
				}
			}

			if (var7 != 0) {
				this.field2014 = new int[var9 + 1][];
				this.field2018 = new class320[var9 + 1];

				for (var10 = 0; var10 < this.field2013; ++var10) {
					var11 = this.field2021[var10];
					var12 = this.field2012[var11];
					this.field2014[var11] = new int[this.field2017[var11].length];

					for (var13 = 0; var13 < var12; ++var13) {
						this.field2014[var11][this.field2008[var11][var13]] = var5.method282();
					}

					this.field2018[var11] = new class320(this.field2014[var11]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method1230(int var1) {
	}

	public byte[] method1212(int var1, int var2) {
		return this.method1213(var1, var2, (int[])null);
	}

	public byte[] method1213(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field2017.length && null != this.field2017[var1] && var2 >= 0 && var2 < this.field2017[var1].length) {
			if (null == this.field2017[var1][var2]) {
				boolean var5 = this.method1228(var1, var3);
				if (!var5) {
					this.method1222(var1);
					var5 = this.method1228(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = class525.method2540(this.field2017[var1][var2], false);
			if (this.field2007) {
				this.field2017[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	public boolean method1214(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field2017.length && this.field2017[var1] != null && var2 >= 0 && var2 < this.field2017[var1].length) {
			if (this.field2017[var1][var2] != null) {
				return true;
			} else if (null != this.field2015[var1]) {
				return true;
			} else {
				this.method1222(var1);
				return null != this.field2015[var1];
			}
		} else {
			return false;
		}
	}

	public boolean method1215(int var1) {
		if (this.field2017.length == 1) {
			return this.method1214(0, var1);
		} else if (this.field2017[var1].length == 1) {
			return this.method1214(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method1216(int var1) {
		if (this.field2015[var1] != null) {
			return true;
		} else {
			this.method1222(var1);
			return null != this.field2015[var1];
		}
	}

	public boolean method1217() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field2021.length; ++var3) {
			int var4 = this.field2021[var3];
			if (this.field2015[var4] == null) {
				this.method1222(var4);
				if (this.field2015[var4] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	int method1218(int var1) {
		return null != this.field2015[var1] ? 100 : 0;
	}

	public byte[] method1219(int var1) {
		if (this.field2017.length == 1) {
			return this.method1212(0, var1);
		} else if (this.field2017[var1].length == 1) {
			return this.method1212(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public byte[] method1220(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field2017.length && this.field2017[var1] != null && var2 >= 0 && var2 < this.field2017[var1].length) {
			if (null == this.field2017[var1][var2]) {
				boolean var4 = this.method1228(var1, (int[])null);
				if (!var4) {
					this.method1222(var1);
					var4 = this.method1228(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class525.method2540(this.field2017[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	public byte[] method1221(int var1) {
		if (this.field2017.length == 1) {
			return this.method1220(0, var1);
		} else if (this.field2017[var1].length == 1) {
			return this.method1220(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	void method1222(int var1) {
	}

	public int[] method1223(int var1) {
		return var1 >= 0 && var1 < this.field2008.length ? this.field2008[var1] : null;
	}

	public int method1238(int var1) {
		return null != this.field2017 && var1 < this.field2017.length && this.field2017[var1] != null ? this.field2017[var1].length : 0;
	}

	public int method1224() {
		return this.field2017.length;
	}

	public void method1225() {
		for (int var2 = 0; var2 < this.field2015.length; ++var2) {
			this.field2015[var2] = null;
		}

	}

	public void method1226(int var1) {
		for (int var3 = 0; var3 < this.field2017[var1].length; ++var3) {
			this.field2017[var1][var3] = null;
		}

	}

	public void method1227() {
		for (int var2 = 0; var2 < this.field2017.length; ++var2) {
			if (this.field2017[var2] != null) {
				for (int var3 = 0; var3 < this.field2017[var2].length; ++var3) {
					this.field2017[var2][var3] = null;
				}
			}
		}

	}

	boolean method1228(int var1, int[] var2) {
		if (this.field2015[var1] == null) {
			return false;
		} else {
			int var4 = this.field2012[var1];
			int[] var5 = this.field2008[var1];
			Object[] var6 = this.field2017[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; ++var8) {
				if (null == var6[var5[var8]]) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var22;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var22 = class525.method2540(this.field2015[var1], false);
				} else {
					var22 = class525.method2540(this.field2015[var1], true);
					class42 var9 = new class42(var22);
					var9.method329(var2, 5, var9.field525.length);
				}

				byte[] var23 = class81.method538(var22);
				if (this.field2020) {
					this.field2015[var1] = null;
				}

				int var11;
				if (var4 > 1) {
					int var10 = var23.length;
					--var10;
					var11 = var23[var10] & 255;
					var10 -= var11 * var4 * 4;
					class42 var12 = new class42(var23);
					int[] var13 = new int[var4];
					var12.field527 = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method282();
							var13[var16] += var15;
						}
					}

					byte[][] var26 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var26[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.field527 = var10;
					var15 = 0;

					int var18;
					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method282();
							System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field2007) {
							var18 = var5[var16];
							byte[] var20 = var26[var16];
							Object var19;
							if (var20 == null) {
								var19 = null;
							} else if (var20.length > 136) {
								class53 var21 = new class53();
								var21.method1007(var20);
								var19 = var21;
							} else {
								var19 = var20;
							}

							var6[var18] = var19;
						} else {
							var6[var5[var16]] = var26[var16];
						}
					}
				} else if (!this.field2007) {
					var11 = var5[0];
					Object var24;
					if (var23 == null) {
						var24 = null;
					} else if (var23.length > 136) {
						class53 var25 = new class53();
						var25.method1007(var23);
						var24 = var25;
					} else {
						var24 = var23;
					}

					var6[var11] = var24;
				} else {
					var6[var5[0]] = var23;
				}

				return true;
			}
		}
	}

	public int method1237(String var1) {
		var1 = var1.toLowerCase();
		return this.field2009.method1813(class96.method639(var1));
	}

	public int method1229(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field2018[var1].method1813(class96.method639(var2));
	}

	public boolean method1234(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field2009.method1813(class96.method639(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field2018[var4].method1813(class96.method639(var2));
			return var5 >= 0;
		}
	}

	public byte[] method1231(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field2009.method1813(class96.method639(var1));
		int var5 = this.field2018[var4].method1813(class96.method639(var2));
		return this.method1212(var4, var5);
	}

	public boolean method1232(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field2009.method1813(class96.method639(var1));
		int var5 = this.field2018[var4].method1813(class96.method639(var2));
		return this.method1214(var4, var5);
	}

	public boolean method1233(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field2009.method1813(class96.method639(var1));
		return this.method1216(var3);
	}

	public void method1236(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field2009.method1813(class96.method639(var1));
		if (var3 >= 0) {
			this.method1230(var3);
		}
	}

	public int method1239(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field2009.method1813(class96.method639(var1));
		return this.method1218(var3);
	}

	public static class67 method1241(int var0) {
		class67 var2 = (class67)class67.field810.method1890((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class149.field1400.method1212(5, var0);
			var2 = new class67();
			if (var3 != null) {
				var2.method489(new class42(var3));
			}

			class67.field810.method1889(var2, (long)var0);
			return var2;
		}
	}

	static void method1240(class347 var0, int var1) {
		boolean var3 = var0.method1903(1) == 1;
		if (var3) {
			class481.field4084[++class481.field4091 - 1] = var1;
		}

		int var4 = var0.method1903(2);
		class287 var5 = Client.field176[var1];
		if (var4 == 0) {
			if (var3) {
				var5.field2548 = false;
			} else if (Client.field131 == var1) {
				throw new RuntimeException();
			} else {
				class481.field4088[var1] = (class296.field2735 + var5.field1600[0] >> 13 << 14) + (var5.field2543 << 28) + (class164.field1606 + var5.field1597[0] >> 13);
				if (var5.field1562 != -1) {
					class481.field4089[var1] = var5.field1562;
				} else {
					class481.field4089[var1] = var5.field1566;
				}

				class481.field4090[var1] = var5.field1560;
				Client.field176[var1] = null;
				if (var0.method1903(1) != 0) {
					class404.method2092(var0, var1);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var0.method1903(3);
				var7 = var5.field1600[0];
				var8 = var5.field1597[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (var1 != Client.field131 || var5.field1555 >= 1536 && var5.field1526 >= 1536 && var5.field1555 < 11776 && var5.field1526 < 11776) {
					if (var3) {
						var5.field2548 = true;
						var5.field2544 = var7;
						var5.field2550 = var8;
					} else {
						var5.field2548 = false;
						var5.method1644(var7, var8, class481.field4083[var1]);
					}
				} else {
					var5.method1641(var7, var8);
					var5.field2548 = false;
				}

			} else if (var4 == 2) {
				var6 = var0.method1903(4);
				var7 = var5.field1600[0];
				var8 = var5.field1597[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (Client.field131 != var1 || var5.field1555 >= 1536 && var5.field1526 >= 1536 && var5.field1555 < 11776 && var5.field1526 < 11776) {
					if (var3) {
						var5.field2548 = true;
						var5.field2544 = var7;
						var5.field2550 = var8;
					} else {
						var5.field2548 = false;
						var5.method1644(var7, var8, class481.field4083[var1]);
					}
				} else {
					var5.method1641(var7, var8);
					var5.field2548 = false;
				}

			} else {
				var6 = var0.method1903(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var0.method1903(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var5.field1600[0] + var9;
					var12 = var5.field1597[0] + var10;
					if (var1 != Client.field131 || var5.field1555 >= 1536 && var5.field1526 >= 1536 && var5.field1555 < 11776 && var5.field1526 < 11776) {
						if (var3) {
							var5.field2548 = true;
							var5.field2544 = var11;
							var5.field2550 = var12;
						} else {
							var5.field2548 = false;
							var5.method1644(var11, var12, class481.field4083[var1]);
						}
					} else {
						var5.method1641(var11, var12);
						var5.field2548 = false;
					}

					var5.field2543 = (byte)(var8 + var5.field2543 & 3);
					if (Client.field131 == var1) {
						class358.field3038 = var5.field2543;
					}

				} else {
					var7 = var0.method1903(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (var9 + class296.field2735 + var5.field1600[0] & 16383) - class296.field2735;
					var12 = (var10 + var5.field1597[0] + class164.field1606 & 16383) - class164.field1606;
					if (Client.field131 != var1 || var5.field1555 >= 1536 && var5.field1526 >= 1536 && var5.field1555 < 11776 && var5.field1526 < 11776) {
						if (var3) {
							var5.field2548 = true;
							var5.field2544 = var11;
							var5.field2550 = var12;
						} else {
							var5.field2548 = false;
							var5.method1644(var11, var12, class481.field4083[var1]);
						}
					} else {
						var5.method1641(var11, var12);
						var5.field2548 = false;
					}

					var5.field2543 = (byte)(var5.field2543 + var8 & 3);
					if (Client.field131 == var1) {
						class358.field3038 = var5.field2543;
					}

				}
			}
		}
	}
}
