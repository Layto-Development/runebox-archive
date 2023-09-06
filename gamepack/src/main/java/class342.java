import java.util.zip.CRC32;

public class class342 extends class215 {
	static CRC32 field2968;
	boolean field2961;
	boolean field2965;
	class124 field2963;
	class124 field2971;
	class288 field2972;
	int field2962;
	int field2964;
	int field2969;
	int field2970;
	volatile boolean[] field2966;
	volatile int field2967;

	static {
		field2968 = new CRC32();
	}

	public class342(class124 var1, class124 var2, class288 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
		super(var5, var6);
		this.field2967 = 0;
		this.field2965 = false;
		this.field2970 = -1;
		this.field2961 = false;
		this.field2963 = var1;
		this.field2971 = var2;
		this.field2964 = var4;
		this.field2965 = var7;
		this.field2961 = var8;
		this.field2972 = var3;
		this.field2972.method1649(this, this.field2964);
	}

	public boolean method1880() {
		return this.field2967 == 1;
	}

	public int method1874() {
		if (this.field2967 == 1 || this.field2961 && this.field2967 == 2) {
			return 100;
		} else if (super.field2015 != null) {
			return 99;
		} else {
			int var2 = this.field2972.method1656(255, this.field2964);
			if (var2 >= 100) {
				var2 = 99;
			}

			return var2;
		}
	}

	void method1230(int var1) {
		this.field2972.method1654(this.field2964, var1);
	}

	void method1222(int var1) {
		if (null != this.field2963 && null != this.field2966 && this.field2966[var1]) {
			class124 var3 = this.field2963;
			byte[] var5 = null;
			synchronized(class146.field1385) {
				for (class329 var7 = (class329)class146.field1385.method563(); null != var7; var7 = (class329)class146.field1385.method565()) {
					if ((long)var1 == var7.field3987 && var7.field2909 == var3 && var7.field2908 == 0) {
						var5 = var7.field2907;
						break;
					}
				}
			}

			if (var5 != null) {
				this.method1883(var3, var1, var5, true);
			} else {
				byte[] var6 = var3.method760(var1);
				this.method1883(var3, var1, var6, true);
			}
		} else {
			this.field2972.method1651(this, this.field2964, var1, super.field2010[var1], (byte)2, true);
		}

	}

	void method1879() {
		this.field2967 = 2;
		super.field2021 = new int[0];
		super.field2010 = new int[0];
		super.field2011 = new int[0];
		super.field2012 = new int[0];
		super.field2008 = new int[0][];
		super.field2015 = new Object[0];
		super.field2017 = new Object[0][];
	}

	void method1875(int var1, int var2, byte var3) {
		this.field2962 = var1;
		this.field2969 = var2;
		if (this.field2971 != null) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			int var4 = this.field2964;
			class124 var5 = this.field2971;
			byte[] var7 = null;
			synchronized(class146.field1385) {
				for (class329 var9 = (class329)class146.field1385.method563(); null != var9; var9 = (class329)class146.field1385.method565()) {
					if (var9.field3987 == (long)var4) {
						if (var3 == -1) {
							throw new IllegalStateException();
						}

						if (var5 == var9.field2909) {
							if (var3 == -1) {
								throw new IllegalStateException();
							}

							if (var9.field2908 == 0) {
								if (var3 == -1) {
									throw new IllegalStateException();
								}

								var7 = var9.field2907;
								break;
							}
						}
					}
				}
			}

			if (null != var7) {
				if (var3 == -1) {
					throw new IllegalStateException();
				}

				this.method1883(var5, var4, var7, true);
			} else {
				byte[] var8 = var5.method760(var4);
				this.method1883(var5, var4, var8, true);
			}
		} else {
			this.field2972.method1651(this, 255, this.field2964, this.field2962, (byte)0, true);
		}

	}

	void method1876(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field2967 == 1) {
				throw new RuntimeException();
			}

			if (null != this.field2971) {
				int var6 = this.field2964;
				class124 var7 = this.field2971;
				class329 var8 = new class329();
				var8.field2908 = 0;
				var8.field3987 = (long)var6;
				var8.field2907 = var2;
				var8.field2909 = var7;
				synchronized(class146.field1385) {
					class146.field1385.method567(var8);
				}

				class69.method501();
			}

			this.method1235(var2);
			this.method1881();
		} else {
			var2[var2.length - 2] = (byte)(super.field2011[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field2011[var1];
			if (null != this.field2963) {
				class124 var14 = this.field2963;
				class329 var16 = new class329();
				var16.field2908 = 0;
				var16.field3987 = (long)var1;
				var16.field2907 = var2;
				var16.field2909 = var14;
				synchronized(class146.field1385) {
					class146.field1385.method567(var16);
				}

				class69.method501();
				this.field2966[var1] = true;
			}

			if (var4) {
				Object[] var15 = super.field2015;
				Object var17;
				if (var2 == null) {
					var17 = null;
				} else if (var2.length > 136) {
					class53 var9 = new class53();
					var9.method1007(var2);
					var17 = var9;
				} else {
					var17 = var2;
				}

				var15[var1] = var17;
			}
		}

	}

	public void method1883(class124 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (var1 == this.field2971) {
			if (this.field2967 == 1) {
				throw new RuntimeException();
			} else if (null == var3) {
				this.field2972.method1651(this, 255, this.field2964, this.field2962, (byte)0, true);
			} else {
				field2968.reset();
				field2968.update(var3, 0, var3.length);
				var6 = (int)field2968.getValue();
				if (var6 != this.field2962) {
					this.field2972.method1651(this, 255, this.field2964, this.field2962, (byte)0, true);
				} else {
					class42 var12 = new class42(class81.method538(var3));
					int var13 = var12.method278();
					if (var13 != 5 && var13 != 6) {
						throw new RuntimeException(var13 + "," + this.field2964 + "," + var2);
					} else {
						int var9 = 0;
						if (var13 >= 6) {
							var9 = var12.method282();
						}

						if (this.field2969 != var9) {
							this.field2972.method1651(this, 255, this.field2964, this.field2962, (byte)0, true);
						} else {
							this.method1235(var3);
							this.method1881();
						}
					}
				}
			}
		} else {
			if (!var4 && this.field2970 == var2) {
				this.field2967 = 1;
			}

			if (null != var3 && var3.length > 2) {
				field2968.reset();
				field2968.update(var3, 0, var3.length - 2);
				var6 = (int)field2968.getValue();
				int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (var6 == super.field2010[var2] && super.field2011[var2] == var7) {
					this.field2966[var2] = true;
					if (var4) {
						Object[] var8 = super.field2015;
						Object var10;
						if (var3 == null) {
							var10 = null;
						} else if (var3.length > 136) {
							class53 var11 = new class53();
							var11.method1007(var3);
							var10 = var11;
						} else {
							var10 = var3;
						}

						var8[var2] = var10;
					}

				} else {
					this.field2966[var2] = false;
					if (this.field2965 || var4) {
						this.field2972.method1651(this, this.field2964, var2, super.field2010[var2], (byte)2, var4);
					}

				}
			} else {
				this.field2966[var2] = false;
				if (this.field2965 || var4) {
					this.field2972.method1651(this, this.field2964, var2, super.field2010[var2], (byte)2, var4);
				}

			}
		}
	}

	void method1881() {
		this.field2966 = new boolean[super.field2015.length];

		int var2;
		for (var2 = 0; var2 < this.field2966.length; ++var2) {
			this.field2966[var2] = false;
		}

		if (null == this.field2963) {
			this.field2967 = 1;
		} else {
			this.field2970 = -1;

			for (var2 = 0; var2 < this.field2966.length; ++var2) {
				if (super.field2012[var2] > 0) {
					class52.method387(var2, this.field2963, this);
					this.field2970 = var2;
				}
			}

			if (this.field2970 == -1) {
				this.field2967 = 1;
			}

		}
	}

	int method1218(int var1) {
		if (null != super.field2015[var1]) {
			return 100;
		} else {
			return this.field2966[var1] ? 100 : this.field2972.method1656(this.field2964, var1);
		}
	}

	public boolean method1877(int var1) {
		return this.field2966[var1];
	}

	public boolean method1878(int var1) {
		return this.method1223(var1) != null;
	}

	public int method1882() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field2015.length; ++var4) {
			if (super.field2012[var4] > 0) {
				var2 += 100;
				var3 += this.method1218(var4);
			}
		}

		if (var2 == 0) {
			return 100;
		} else {
			var4 = var3 * 100 / var2;
			return var4;
		}
	}
}
