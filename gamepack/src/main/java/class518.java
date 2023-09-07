public class class518 {

	boolean field4101;

	boolean field4121;

	class419 field4124;

	int field4105;

	int[] field4114;

	int[] field4115;

	long field4102;

	long[] field4100;

	long[] field4112;

	public boolean field4106;

	public boolean[] field4117;

	public byte field4108;

	public byte field4109;

	public byte field4110;

	public byte field4120;

	public byte[] field4113;

	public int field4103;

	public int field4104;

	public int field4111;

	public int field4118;

	public int field4119;

	public int[] field4116;

	public String field4107;

	public String[] field4122;

	public String[] field4123;

	public class518(class187 var1) {
		this.field4119 = 0;
		this.field4107 = null;
		this.field4105 = 0;
		this.field4118 = -1;
		this.field4103 = -1;
		this.method2512(var1);
	}

	void method2498(int var1) {
		if (this.field4101) {
			if (null != this.field4100) {
				System.arraycopy(this.field4100, 0, this.field4100 = new long[var1], 0, this.field4111);
			} else {
				this.field4100 = new long[var1];
			}
		}
		if (this.field4121) {
			if (null != this.field4122) {
				System.arraycopy(this.field4122, 0, this.field4122 = new String[var1], 0, this.field4111);
			} else {
				this.field4122 = new String[var1];
			}
		}
		if (null != this.field4113) {
			System.arraycopy(this.field4113, 0, this.field4113 = new byte[var1], 0, this.field4111);
		} else {
			this.field4113 = new byte[var1];
		}
		if (null != this.field4115) {
			System.arraycopy(this.field4115, 0, this.field4115 = new int[var1], 0, this.field4111);
		} else {
			this.field4115 = new int[var1];
		}
		if (this.field4116 != null) {
			System.arraycopy(this.field4116, 0, this.field4116 = new int[var1], 0, this.field4111);
		} else {
			this.field4116 = new int[var1];
		}
		if (null != this.field4117) {
			System.arraycopy(this.field4117, 0, this.field4117 = new boolean[var1], 0, this.field4111);
		} else {
			this.field4117 = new boolean[var1];
		}
	}

	void method2499(int var1) {
		if (this.field4101) {
			if (null != this.field4112) {
				System.arraycopy(this.field4112, 0, this.field4112 = new long[var1], 0, this.field4104);
			} else {
				this.field4112 = new long[var1];
			}
		}
		if (this.field4121) {
			if (null != this.field4123) {
				System.arraycopy(this.field4123, 0, this.field4123 = new String[var1], 0, this.field4104);
			} else {
				this.field4123 = new String[var1];
			}
		}
	}

	public int method2505(String var1) {
		if (null != var1 && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field4111; ++var3) {
				if (this.field4122[var3].equals(var1)) {
					return var3;
				}
			}
			return -1;
		} else {
			return -1;
		}
	}

	public int method2507(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field4115[var1] & var5) >>> var2;
	}

	public Integer method2500(int var1) {
		if (null == this.field4124) {
			return null;
		} else {
			class77 var3 = this.field4124.method2105((long) var1);
			return null != var3 && var3 instanceof class239 ? new Integer(((class239) var3).field2043) : null;
		}
	}

	public int[] method2501() {
		if (null == this.field4114) {
			String[] var2 = new String[this.field4111];
			this.field4114 = new int[this.field4111];
			for (int var3 = 0; var3 < this.field4111; this.field4114[var3] = var3++) {
				var2[var3] = this.field4122[var3];
				if (null != var2[var3]) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}
			int[] var4 = this.field4114;
			class295.method1591(var2, var4, 0, var2.length - 1);
		}
		return this.field4114;
	}

	void method2513(long var1, String var3, int var4) {
		if (null != var3 && var3.length() == 0) {
			var3 = null;
		}
		if (this.field4101 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.field4121 != (null != var3)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field4100 == null || this.field4111 >= this.field4100.length) || null != var3 && (this.field4122 == null || this.field4111 >= this.field4122.length)) {
				this.method2498(this.field4111 + 5);
			}
			if (this.field4100 != null) {
				this.field4100[this.field4111] = var1;
			}
			if (this.field4122 != null) {
				this.field4122[this.field4111] = var3;
			}
			if (this.field4118 == -1) {
				this.field4118 = this.field4111;
				this.field4113[this.field4111] = 126;
			} else {
				this.field4113[this.field4111] = 0;
			}
			this.field4115[this.field4111] = 0;
			this.field4116[this.field4111] = var4;
			this.field4117[this.field4111] = false;
			++this.field4111;
			this.field4114 = null;
		}
	}

	void method2502(int var1) {
		if (var1 >= 0 && var1 < this.field4111) {
			--this.field4111;
			this.field4114 = null;
			if (this.field4111 == 0) {
				this.field4100 = null;
				this.field4122 = null;
				this.field4113 = null;
				this.field4115 = null;
				this.field4116 = null;
				this.field4117 = null;
				this.field4118 = -1;
				this.field4103 = -1;
			} else {
				System.arraycopy(this.field4113, var1 + 1, this.field4113, var1, this.field4111 - var1);
				System.arraycopy(this.field4115, var1 + 1, this.field4115, var1, this.field4111 - var1);
				System.arraycopy(this.field4116, var1 + 1, this.field4116, var1, this.field4111 - var1);
				System.arraycopy(this.field4117, var1 + 1, this.field4117, var1, this.field4111 - var1);
				if (this.field4100 != null) {
					System.arraycopy(this.field4100, var1 + 1, this.field4100, var1, this.field4111 - var1);
				}
				if (this.field4122 != null) {
					System.arraycopy(this.field4122, var1 + 1, this.field4122, var1, this.field4111 - var1);
				}
				this.method2516();
			}
		} else {
			throw new RuntimeException("");
		}
	}

	void method2516() {
		if (this.field4111 == 0) {
			this.field4118 = -1;
			this.field4103 = -1;
		} else {
			this.field4118 = -1;
			this.field4103 = -1;
			int var2 = 0;
			byte var3 = this.field4113[0];
			for (int var4 = 1; var4 < this.field4111; ++var4) {
				if (this.field4113[var4] > var3) {
					if (var3 == 125) {
						this.field4103 = var2;
					}
					var2 = var4;
					var3 = this.field4113[var4];
				} else if (this.field4103 == -1 && this.field4113[var4] == 125) {
					this.field4103 = var4;
				}
			}
			this.field4118 = var2;
			if (this.field4118 != -1) {
				this.field4113[this.field4118] = 126;
			}
		}
	}

	void method2503(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (this.field4101 != var1 > 0L) {
			throw new RuntimeException("");
		} else if ((var3 != null) != this.field4121) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field4112 == null || this.field4104 >= this.field4112.length) || null != var3 && (null == this.field4123 || this.field4104 >= this.field4123.length)) {
				this.method2499(this.field4104 + 5);
			}
			if (null != this.field4112) {
				this.field4112[this.field4104] = var1;
			}
			if (this.field4123 != null) {
				this.field4123[this.field4104] = var3;
			}
			++this.field4104;
		}
	}

	void method2504(int var1) {
		--this.field4104;
		if (this.field4104 == 0) {
			this.field4112 = null;
			this.field4123 = null;
		} else {
			if (null != this.field4112) {
				System.arraycopy(this.field4112, var1 + 1, this.field4112, var1, this.field4104 - var1);
			}
			if (this.field4123 != null) {
				System.arraycopy(this.field4123, var1 + 1, this.field4123, var1, this.field4104 - var1);
			}
		}
	}

	int method2514(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 != this.field4118 || this.field4103 != -1 && this.field4113[this.field4103] >= 125) {
				if (this.field4113[var1] == var2) {
					return -1;
				} else {
					this.field4113[var1] = var2;
					this.method2516();
					return var1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	boolean method2506(int var1) {
		if (var1 != this.field4118 && this.field4113[var1] != 126) {
			this.field4113[this.field4118] = 125;
			this.field4103 = this.field4118;
			this.field4113[var1] = 126;
			this.field4118 = var1;
			return true;
		} else {
			return false;
		}
	}

	int method2515(int var1, boolean var2) {
		if (this.field4117[var1] == var2) {
			return -1;
		} else {
			this.field4117[var1] = var2;
			return var1;
		}
	}

	int method2508(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field4115[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field4115[var1] = var9 | var2;
			return var1;
		}
	}

	boolean method2497(int var1, int var2) {
		if (null != this.field4124) {
			class77 var4 = this.field4124.method2105((long) var1);
			if (null != var4) {
				if (var4 instanceof class239) {
					class239 var5 = (class239) var4;
					if (var5.field2043 == var2) {
						return false;
					}
					var5.field2043 = var2;
					return true;
				}
				var4.method318();
			}
		} else {
			this.field4124 = new class419(4);
		}
		this.field4124.method2109(new class239(var2), (long) var1);
		return true;
	}

	boolean method2509(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (null != this.field4124) {
			class77 var9 = this.field4124.method2105((long) var1);
			if (null != var9) {
				if (var9 instanceof class239) {
					class239 var10 = (class239) var9;
					if (var2 == (var10.field2043 & var8)) {
						return false;
					}
					var10.field2043 &= ~var8;
					var10.field2043 |= var2;
					return true;
				}
				var9.method318();
			}
		} else {
			this.field4124 = new class419(4);
		}
		this.field4124.method2109(new class239(var2), (long) var1);
		return true;
	}

	boolean method2510(int var1, long var2) {
		if (null != this.field4124) {
			class77 var4 = this.field4124.method2105((long) var1);
			if (var4 != null) {
				if (var4 instanceof class125) {
					class125 var5 = (class125) var4;
					if (var5.field1453 == var2) {
						return false;
					}
					var5.field1453 = var2;
					return true;
				}
				var4.method318();
			}
		} else {
			this.field4124 = new class419(4);
		}
		this.field4124.method2109(new class125(var2), (long) var1);
		return true;
	}

	boolean method2511(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}
		if (null != this.field4124) {
			class77 var4 = this.field4124.method2105((long) var1);
			if (null != var4) {
				if (var4 instanceof class47) {
					class47 var5 = (class47) var4;
					if (var5.field233 instanceof String) {
						if (var2.equals(var5.field233)) {
							return false;
						}
						var5.method318();
						this.field4124.method2109(new class47(var2), var5.field785);
						return true;
					}
				}
				var4.method318();
			}
		} else {
			this.field4124 = new class419(4);
		}
		this.field4124.method2109(new class47(var2), (long) var1);
		return true;
	}

	void method2512(class187 var1) {
		int var3 = var1.method1096();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method1096();
			if ((var4 & 1) != 0) {
				this.field4101 = true;
			}
			if ((var4 & 2) != 0) {
				this.field4121 = true;
			}
			if (!this.field4101) {
				this.field4100 = null;
				this.field4112 = null;
			}
			if (!this.field4121) {
				this.field4122 = null;
				this.field4123 = null;
			}
			this.field4119 = var1.method1100();
			this.field4105 = var1.method1100();
			if (var3 <= 3 && this.field4105 != 0) {
				this.field4105 += 16912800;
			}
			this.field4111 = var1.method1145();
			this.field4104 = var1.method1096();
			this.field4107 = var1.method1104();
			if (var3 >= 4) {
				var1.method1100();
			}
			this.field4106 = var1.method1096() == 1;
			this.field4120 = var1.method1097();
			this.field4108 = var1.method1097();
			this.field4109 = var1.method1097();
			this.field4110 = var1.method1097();
			int var5;
			if (this.field4111 > 0) {
				if (this.field4101 && (this.field4100 == null || this.field4100.length < this.field4111)) {
					this.field4100 = new long[this.field4111];
				}
				if (this.field4121 && (this.field4122 == null || this.field4122.length < this.field4111)) {
					this.field4122 = new String[this.field4111];
				}
				if (this.field4113 == null || this.field4113.length < this.field4111) {
					this.field4113 = new byte[this.field4111];
				}
				if (null == this.field4115 || this.field4115.length < this.field4111) {
					this.field4115 = new int[this.field4111];
				}
				if (this.field4116 == null || this.field4116.length < this.field4111) {
					this.field4116 = new int[this.field4111];
				}
				if (null == this.field4117 || this.field4117.length < this.field4111) {
					this.field4117 = new boolean[this.field4111];
				}
				for (var5 = 0; var5 < this.field4111; ++var5) {
					if (this.field4101) {
						this.field4100[var5] = var1.method1101();
					}
					if (this.field4121) {
						this.field4122[var5] = var1.method1155();
					}
					this.field4113[var5] = var1.method1097();
					if (var3 >= 2) {
						this.field4115[var5] = var1.method1100();
					}
					if (var3 >= 5) {
						this.field4116[var5] = var1.method1145();
					} else {
						this.field4116[var5] = 0;
					}
					if (var3 >= 6) {
						this.field4117[var5] = var1.method1096() == 1;
					} else {
						this.field4117[var5] = false;
					}
				}
				this.method2516();
			}
			if (this.field4104 > 0) {
				if (this.field4101 && (this.field4112 == null || this.field4112.length < this.field4104)) {
					this.field4112 = new long[this.field4104];
				}
				if (this.field4121 && (null == this.field4123 || this.field4123.length < this.field4104)) {
					this.field4123 = new String[this.field4104];
				}
				for (var5 = 0; var5 < this.field4104; ++var5) {
					if (this.field4101) {
						this.field4112[var5] = var1.method1101();
					}
					if (this.field4121) {
						this.field4123[var5] = var1.method1155();
					}
				}
			}
			if (var3 >= 3) {
				var5 = var1.method1145();
				if (var5 > 0) {
					this.field4124 = new class419(var5 < 16 ? class50.method204(var5) : 16);
					while (var5-- > 0) {
						int var6 = var1.method1100();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method1100();
							this.field4124.method2109(new class239(var9), (long) var7);
						} else if (var8 == 1) {
							long var11 = var1.method1101();
							this.field4124.method2109(new class125(var11), (long) var7);
						} else if (var8 == 2) {
							String var12 = var1.method1104();
							this.field4124.method2109(new class47(var12), (long) var7);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
