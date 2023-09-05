import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.zip.CRC32;

@ObfInfo(name = "nk")
public class class505 extends class437 {
	@ObfInfo(name = "aq", desc = "Ljava/util/zip/CRC32;")
	static CRC32 field4076;
	@ObfInfo(name = "ab", desc = "Z")
	boolean field4069;
	@ObfInfo(name = "af", desc = "Z")
	boolean field4073;
	@ObfInfo(name = "ai", desc = "Lru;")
	class387 field4071;
	@ObfInfo(name = "az", desc = "Lru;")
	class387 field4079;
	@ObfInfo(name = "ag", desc = "Lnf;")
	class41 field4080;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -522011567)
	int field4070;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 2102326873)
	int field4072;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 813927447)
	int field4077;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -1263705211)
	int field4078;
	@ObfInfo(name = "ad", desc = "[Z")
	volatile boolean[] field4074;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1071552705)
	volatile int field4075;

	static {
		field4076 = new CRC32();
	}

	@ObfInfo(name = "<init>", desc = "(Lru;Lru;Lnf;IZZZZ)V")
	public class505(class387 var1, class387 var2, class41 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
		super(var5, var6);
		this.field4075 = 0;
		this.field4073 = false;
		this.field4078 = -1;
		this.field4069 = false;
		this.field4071 = var1;
		this.field4079 = var2;
		this.field4072 = var4;
		this.field4073 = var7;
		this.field4069 = var8;
		this.field4080 = var3;
		this.field4080.method431(this, this.field4072);
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "-432364648")
	public boolean method2508() {
		return this.field4075 == 1;
	}

	@ObfInfo(name = "ae", desc = "(B)I", opaqueValue = "1")
	public int method2502() {
		if (this.field4075 == 1 || this.field4069 && this.field4075 == 2) {
			return 100;
		} else if (super.field3289 != null) {
			return 99;
		} else {
			int var2 = this.field4080.method438(255, this.field4072);
			if (var2 >= 100) {
				var2 = 99;
			}

			return var2;
		}
	}

	@ObfInfo(name = "ao", desc = "(II)V")
	void method2285(int var1) {
		this.field4080.method436(this.field4072, var1);
	}

	@ObfInfo(name = "at", desc = "(II)V", opaqueValue = "402130956")
	void method2277(int var1) {
		if (null != this.field4071 && null != this.field4074 && this.field4074[var1]) {
			class387 var3 = this.field4071;
			byte[] var5 = null;
			synchronized(class208.field1864) {
				for (class231 var7 = (class231)class208.field1864.method627(); null != var7; var7 = (class231)class208.field1864.method629()) {
					if ((long)var1 == var7.field1483 && var7.field1964 == var3 && var7.field1963 == 0) {
						var5 = var7.field1962;
						break;
					}
				}
			}

			if (var5 != null) {
				this.method2511(var3, var1, var5, true);
			} else {
				byte[] var6 = var3.method2081(var1);
				this.method2511(var3, var1, var6, true);
			}
		} else {
			this.field4080.method433(this, this.field4072, var1, super.field3284[var1], (byte)2, true);
		}

	}

	@ObfInfo(name = "ac", desc = "(B)V")
	void method2507() {
		this.field4075 = 2;
		super.field3295 = new int[0];
		super.field3284 = new int[0];
		super.field3285 = new int[0];
		super.field3286 = new int[0];
		super.field3282 = new int[0][];
		super.field3289 = new Object[0];
		super.field3291 = new Object[0][];
	}

	@ObfInfo(name = "ai", desc = "(IIB)V")
	void method2503(int var1, int var2, byte var3) {
		this.field4070 = var1;
		this.field4077 = var2;
		if (this.field4079 != null) {
			if (var3 == -1) {
				throw new IllegalStateException();
			}

			int var4 = this.field4072;
			class387 var5 = this.field4079;
			byte[] var7 = null;
			synchronized(class208.field1864) {
				for (class231 var9 = (class231)class208.field1864.method627(); null != var9; var9 = (class231)class208.field1864.method629()) {
					if (var9.field1483 == (long)var4) {
						if (var3 == -1) {
							throw new IllegalStateException();
						}

						if (var5 == var9.field1964) {
							if (var3 == -1) {
								throw new IllegalStateException();
							}

							if (var9.field1963 == 0) {
								if (var3 == -1) {
									throw new IllegalStateException();
								}

								var7 = var9.field1962;
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

				this.method2511(var5, var4, var7, true);
			} else {
				byte[] var8 = var5.method2081(var4);
				this.method2511(var5, var4, var8, true);
			}
		} else {
			this.field4080.method433(this, 255, this.field4072, this.field4070, (byte)0, true);
		}

	}

	@ObfInfo(name = "az", desc = "(I[BZZI)V", opaqueValue = "-441275408")
	void method2504(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4075 == 1) {
				throw new RuntimeException();
			}

			if (null != this.field4079) {
				int var6 = this.field4072;
				class387 var7 = this.field4079;
				class231 var8 = new class231();
				var8.field1963 = 0;
				var8.field1483 = (long)var6;
				var8.field1962 = var2;
				var8.field1964 = var7;
				synchronized(class208.field1864) {
					class208.field1864.method631(var8);
				}

				class208.method1156();
			}

			this.method2290(var2);
			this.method2509();
		} else {
			var2[var2.length - 2] = (byte)(super.field3285[var1] >> 8);
			var2[var2.length - 1] = (byte)super.field3285[var1];
			if (null != this.field4071) {
				class387 var14 = this.field4071;
				class231 var16 = new class231();
				var16.field1963 = 0;
				var16.field1483 = (long)var1;
				var16.field1962 = var2;
				var16.field1964 = var14;
				synchronized(class208.field1864) {
					class208.field1864.method631(var16);
				}

				class208.method1156();
				this.field4074[var1] = true;
			}

			if (var4) {
				Object[] var15 = super.field3289;
				Object var17;
				if (var2 == null) {
					var17 = null;
				} else if (var2.length > 136) {
					class46 var9 = new class46();
					var9.method1734(var2);
					var17 = var9;
				} else {
					var17 = var2;
				}

				var15[var1] = var17;
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(Lru;I[BZI)V", opaqueValue = "10000535")
	public void method2511(class387 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (var1 == this.field4079) {
			if (this.field4075 == 1) {
				throw new RuntimeException();
			} else if (null == var3) {
				this.field4080.method433(this, 255, this.field4072, this.field4070, (byte)0, true);
			} else {
				field4076.reset();
				field4076.update(var3, 0, var3.length);
				var6 = (int)field4076.getValue();
				if (var6 != this.field4070) {
					this.field4080.method433(this, 255, this.field4072, this.field4070, (byte)0, true);
				} else {
					class280 var12 = new class280(class437.method2295(var3));
					int var13 = var12.method1492();
					if (var13 != 5 && var13 != 6) {
						throw new RuntimeException(var13 + "," + this.field4072 + "," + var2);
					} else {
						int var9 = 0;
						if (var13 >= 6) {
							var9 = var12.method1496();
						}

						if (this.field4077 != var9) {
							this.field4080.method433(this, 255, this.field4072, this.field4070, (byte)0, true);
						} else {
							this.method2290(var3);
							this.method2509();
						}
					}
				}
			}
		} else {
			if (!var4 && this.field4078 == var2) {
				this.field4075 = 1;
			}

			if (null != var3 && var3.length > 2) {
				field4076.reset();
				field4076.update(var3, 0, var3.length - 2);
				var6 = (int)field4076.getValue();
				int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (var6 == super.field3284[var2] && super.field3285[var2] == var7) {
					this.field4074[var2] = true;
					if (var4) {
						Object[] var8 = super.field3289;
						Object var10;
						if (var3 == null) {
							var10 = null;
						} else if (var3.length > 136) {
							class46 var11 = new class46();
							var11.method1734(var3);
							var10 = var11;
						} else {
							var10 = var3;
						}

						var8[var2] = var10;
					}

				} else {
					this.field4074[var2] = false;
					if (this.field4073 || var4) {
						this.field4080.method433(this, this.field4072, var2, super.field3284[var2], (byte)2, var4);
					}

				}
			} else {
				this.field4074[var2] = false;
				if (this.field4073 || var4) {
					this.field4080.method433(this, this.field4072, var2, super.field3284[var2], (byte)2, var4);
				}

			}
		}
	}

	@ObfInfo(name = "aa", desc = "(I)V", opaqueValue = "-1649092785")
	void method2509() {
		this.field4074 = new boolean[super.field3289.length];

		int var2;
		for (var2 = 0; var2 < this.field4074.length; ++var2) {
			this.field4074[var2] = false;
		}

		if (null == this.field4071) {
			this.field4075 = 1;
		} else {
			this.field4078 = -1;

			for (var2 = 0; var2 < this.field4074.length; ++var2) {
				if (super.field3286[var2] > 0) {
					class208.method1158(var2, this.field4071, this);
					this.field4078 = var2;
				}
			}

			if (this.field4078 == -1) {
				this.field4075 = 1;
			}

		}
	}

	@ObfInfo(name = "af", desc = "(II)I", opaqueValue = "-1845624060")
	int method2273(int var1) {
		if (null != super.field3289[var1]) {
			return 100;
		} else {
			return this.field4074[var1] ? 100 : this.field4080.method438(this.field4072, var1);
		}
	}

	@ObfInfo(name = "ad", desc = "(II)Z")
	public boolean method2505(int var1) {
		return this.field4074[var1];
	}

	@ObfInfo(name = "aq", desc = "(II)Z", opaqueValue = "-156665198")
	public boolean method2506(int var1) {
		return this.method2278(var1) != null;
	}

	@ObfInfo(name = "al", desc = "(I)I", opaqueValue = "-360728191")
	public int method2510() {
		int var2 = 0;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < super.field3289.length; ++var4) {
			if (super.field3286[var4] > 0) {
				var2 += 100;
				var3 += this.method2273(var4);
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
