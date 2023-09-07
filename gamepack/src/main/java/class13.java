import java.util.zip.CRC32;

public class class13 extends class338 {

	static CRC32 field78;

	boolean field71;

	boolean field75;

	class27 field73;

	class27 field81;

	class9 field82;

	int field72;

	int field74;

	int field79;

	int field80;

	volatile boolean[] field76;

	volatile int field77;

	static {
		field78 = new CRC32();
	}

	public class13(class27 var1, class27 var2, class9 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
		super(var5, var6);
		this.field77 = 0;
		this.field75 = false;
		this.field80 = -1;
		this.field71 = false;
		this.field73 = var1;
		this.field81 = var2;
		this.field74 = var4;
		this.field75 = var7;
		this.field71 = var8;
		this.field82 = var3;
		this.field82.method22(this, this.field74);
	}

	public boolean method43() {
		return this.field77 == 1;
	}

	public int method34() {
		if (this.field77 == 1 || this.field71 && this.field77 == 2) {
			return 100;
		} else if (super.field2577 != null) {
			return 99;
		} else {
			int var2 = this.field82.method29(255, this.field74);
			if (var2 >= 100) {
				var2 = 99;
			}
			return var2;
		}
	}

	@Override
	void method1780(int var1) {
		this.field82.method27(this.field74, var1);
	}

	@Override
	void method1772(int var1) {
		if (null != this.field73 && null != this.field76 && this.field76[var1]) {
			class27 var3 = this.field73;
			byte[] var5 = null;
			synchronized (class195.field1863) {
				for (class524 var7 = (class524) class195.field1863.method2218(); null != var7; var7 = (class524) class195.field1863.method2220()) {
					if ((long) var1 == var7.field785 && var7.field4170 == var3 && var7.field4169 == 0) {
						var5 = var7.field4168;
						break;
					}
				}
			}
			if (var5 != null) {
				this.method46(var3, var1, var5, true);
			} else {
				byte[] var6 = var3.method76(var1);
				this.method46(var3, var1, var6, true);
			}
		} else {
			this.field82.method24(this, this.field74, var1, super.field2572[var1], (byte) 2, true);
		}
	}

	void method42() {
		this.field77 = 2;
		super.field2583 = new int[0];
		super.field2572 = new int[0];
		super.field2573 = new int[0];
		super.field2574 = new int[0];
		super.field2570 = new int[0][];
		super.field2577 = new Object[0];
		super.field2579 = new Object[0][];
	}

	void method37(int var1, int var2, byte var3) {
		this.field72 = var1;
		this.field79 = var2;
		if (this.field81 != null) {
			int var4 = this.field74;
			class27 var5 = this.field81;
			byte[] var7 = null;
			synchronized (class195.field1863) {
				for (class524 var9 = (class524) class195.field1863.method2218(); null != var9; var9 = (class524) class195.field1863.method2220()) {
					if (var9.field785 == (long) var4 && var5 == var9.field4170 && var9.field4169 == 0) {
						var7 = var9.field4168;
						break;
					}
				}
			}
			if (null != var7) {
				this.method46(var5, var4, var7, true);
			} else {
				byte[] var8 = var5.method76(var4);
				this.method46(var5, var4, var8, true);
			}
		} else {
			this.field82.method24(this, 255, this.field74, this.field72, (byte) 0, true);
		}
	}

	void method38(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field77 == 1) {
				throw new RuntimeException();
			}
			if (null != this.field81) {
				int var6 = this.field74;
				class27 var7 = this.field81;
				class524 var8 = new class524();
				var8.field4169 = 0;
				var8.field785 = (long) var6;
				var8.field4168 = var2;
				var8.field4170 = var7;
				synchronized (class195.field1863) {
					class195.field1863.method2222(var8);
				}
				class195.method1200();
			}
			this.method1785(var2);
			this.method44();
		} else {
			var2[var2.length - 2] = (byte) (super.field2573[var1] >> 8);
			var2[var2.length - 1] = (byte) super.field2573[var1];
			if (null != this.field73) {
				class27 var14 = this.field73;
				class524 var16 = new class524();
				var16.field4169 = 0;
				var16.field785 = (long) var1;
				var16.field4168 = var2;
				var16.field4170 = var14;
				synchronized (class195.field1863) {
					class195.field1863.method2222(var16);
				}
				class195.method1200();
				this.field76[var1] = true;
			}
			if (var4) {
				Object[] var15 = super.field2577;
				Object var17;
				if (var2 == null) {
					var17 = null;
				} else if (var2.length > 136) {
					class382 var9 = new class382();
					var9.method624(var2);
					var17 = var9;
				} else {
					var17 = var2;
				}
				var15[var1] = var17;
			}
		}
	}

	public void method46(class27 var1, int var2, byte[] var3, boolean var4) {
		int var6;
		if (var1 == this.field81) {
			if (this.field77 == 1) {
				throw new RuntimeException();
			} else if (null == var3) {
				this.field82.method24(this, 255, this.field74, this.field72, (byte) 0, true);
			} else {
				field78.reset();
				field78.update(var3, 0, var3.length);
				var6 = (int) field78.getValue();
				if (var6 != this.field72) {
					this.field82.method24(this, 255, this.field74, this.field72, (byte) 0, true);
				} else {
					class187 var12 = new class187(class338.method1790(var3));
					int var13 = var12.method1096();
					if (var13 != 5 && var13 != 6) {
						throw new RuntimeException(var13 + "," + this.field74 + "," + var2);
					} else {
						int var9 = 0;
						if (var13 >= 6) {
							var9 = var12.method1100();
						}
						if (this.field79 != var9) {
							this.field82.method24(this, 255, this.field74, this.field72, (byte) 0, true);
						} else {
							this.method1785(var3);
							this.method44();
						}
					}
				}
			}
		} else {
			if (!var4 && this.field80 == var2) {
				this.field77 = 1;
			}
			if (null != var3 && var3.length > 2) {
				field78.reset();
				field78.update(var3, 0, var3.length - 2);
				var6 = (int) field78.getValue();
				int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (var6 == super.field2572[var2] && super.field2573[var2] == var7) {
					this.field76[var2] = true;
					if (var4) {
						Object[] var8 = super.field2577;
						Object var10;
						if (var3 == null) {
							var10 = null;
						} else if (var3.length > 136) {
							class382 var11 = new class382();
							var11.method624(var3);
							var10 = var11;
						} else {
							var10 = var3;
						}
						var8[var2] = var10;
					}
				} else {
					this.field76[var2] = false;
					if (this.field75 || var4) {
						this.field82.method24(this, this.field74, var2, super.field2572[var2], (byte) 2, var4);
					}
				}
			} else {
				this.field76[var2] = false;
				if (this.field75 || var4) {
					this.field82.method24(this, this.field74, var2, super.field2572[var2], (byte) 2, var4);
				}
			}
		}
	}

	void method44() {
		this.field76 = new boolean[super.field2577.length];
		int var2;
		for (var2 = 0; var2 < this.field76.length; ++var2) {
			this.field76[var2] = false;
		}
		if (null == this.field73) {
			this.field77 = 1;
		} else {
			this.field80 = -1;
			for (var2 = 0; var2 < this.field76.length; ++var2) {
				if (super.field2574[var2] > 0) {
					class195.method1202(var2, this.field73, this);
					this.field80 = var2;
				}
			}
			if (this.field80 == -1) {
				this.field77 = 1;
			}
		}
	}

	@Override
	int method1768(int var1) {
		if (null != super.field2577[var1]) {
			return 100;
		} else {
			return this.field76[var1] ? 100 : this.field82.method29(this.field74, var1);
		}
	}

	public boolean method39(int var1) {
		return this.field76[var1];
	}

	public boolean method40(int var1) {
		return this.method1773(var1) != null;
	}

	public int method45() {
		int var2 = 0;
		int var3 = 0;
		int var4;
		for (var4 = 0; var4 < super.field2577.length; ++var4) {
			if (super.field2574[var4] > 0) {
				var2 += 100;
				var3 += this.method1768(var4);
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
