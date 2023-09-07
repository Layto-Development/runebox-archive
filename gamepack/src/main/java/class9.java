import java.io.IOException;
import java.util.zip.CRC32;

public class class9 {

	boolean field41;

	byte field32;

	class13[] field48;

	class187 field30;

	class187 field33;

	class187 field44;

	class226 field38;

	class34 field36;

	class406 field53;

	class535 field34;

	class535 field37;

	class535 field39;

	class535 field43;

	int field35;

	int field40;

	int field42;

	int field45;

	int field47;

	int field49;

	int field50;

	int field51;

	CRC32 field46;

	long field31;

	public int field29;

	public int field52;

	public class9() {
		this.field51 = 0;
		this.field43 = new class535(4096);
		this.field42 = 0;
		this.field34 = new class535(32);
		this.field35 = 0;
		this.field36 = new class34();
		this.field37 = new class535(4096);
		this.field47 = 0;
		this.field39 = new class535(4096);
		this.field40 = 0;
		this.field30 = new class187(8);
		this.field45 = 0;
		this.field46 = new CRC32();
		this.field48 = new class13[256];
		this.field49 = -1;
		this.field50 = 255;
		this.field32 = 0;
		this.field29 = 0;
		this.field52 = 0;
	}

	public boolean method25() {
		long var2 = class48.method197();
		int var4 = (int) (var2 - this.field31);
		this.field31 = var2;
		if (var4 > 200) {
			var4 = 200;
		}
		this.field51 += var4;
		if (this.field40 == 0 && this.field35 == 0 && this.field47 == 0 && this.field42 == 0) {
			return true;
		} else if (null == this.field53) {
			return false;
		} else {
			try {
				if (this.field51 > 30000) {
					throw new IOException();
				} else {
					class226 var5;
					class187 var6;
					while (this.field35 < 200 && this.field42 > 0) {
						var5 = (class226) this.field43.method2583();
						var6 = new class187(4);
						var6.method1085(1);
						var6.method1137((int) var5.field785);
						this.field53.method2071(var6.field1830, 0, 4);
						this.field34.method2585(var5, var5.field785);
						--this.field42;
						++this.field35;
					}
					while (this.field40 < 200 && this.field47 > 0) {
						var5 = (class226) this.field36.method155();
						var6 = new class187(4);
						var6.method1085(0);
						var6.method1137((int) var5.field785);
						this.field53.method2071(var6.field1830, 0, 4);
						var5.method1674();
						this.field39.method2585(var5, var5.field785);
						--this.field47;
						++this.field40;
					}
					for (int var20 = 0; var20 < 100; ++var20) {
						int var21 = this.field53.method2070();
						if (var21 < 0) {
							throw new IOException();
						}
						if (var21 == 0) {
							break;
						}
						this.field51 = 0;
						byte var7 = 0;
						if (this.field38 == null) {
							var7 = 8;
						} else if (this.field45 == 0) {
							var7 = 1;
						}
						int var8;
						int var9;
						int var10;
						byte[] var10000;
						int var10001;
						class187 var23;
						if (var7 > 0) {
							var8 = var7 - this.field30.field1832;
							if (var8 > var21) {
								var8 = var21;
							}
							this.field53.method2069(this.field30.field1830, this.field30.field1832, var8);
							if (this.field32 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field30.field1830;
									var10001 = var9 + this.field30.field1832;
									var10000[var10001] ^= this.field32;
								}
							}
							var23 = this.field30;
							var23.field1832 += var8;
							if (this.field30.field1832 < var7) {
								break;
							}
							if (null == this.field38) {
								this.field30.field1832 = 0;
								var9 = this.field30.method1096();
								var10 = this.field30.method1145();
								int var11 = this.field30.method1096();
								int var12 = this.field30.method1100();
								long var13 = (long) (var10 + (var9 << 16));
								class226 var15 = (class226) this.field34.method2582(var13);
								this.field41 = true;
								if (null == var15) {
									var15 = (class226) this.field39.method2582(var13);
									this.field41 = false;
								}
								if (null == var15) {
									throw new IOException();
								}
								int var16 = var11 == 0 ? 5 : 9;
								this.field38 = var15;
								this.field44 = new class187(var12 + var16 + this.field38.field1998);
								this.field44.method1085(var11);
								this.field44.method1151(var12);
								this.field45 = 8;
								this.field30.field1832 = 0;
							} else if (this.field45 == 0) {
								if (this.field30.field1830[0] == -1) {
									this.field45 = 1;
									this.field30.field1832 = 0;
								} else {
									this.field38 = null;
								}
							}
						} else {
							var8 = this.field44.field1830.length - this.field38.field1998;
							var9 = 512 - this.field45;
							if (var9 > var8 - this.field44.field1832) {
								var9 = var8 - this.field44.field1832;
							}
							if (var9 > var21) {
								var9 = var21;
							}
							this.field53.method2069(this.field44.field1830, this.field44.field1832, var9);
							if (this.field32 != 0) {
								for (var10 = 0; var10 < var9; ++var10) {
									var10000 = this.field44.field1830;
									var10001 = var10 + this.field44.field1832;
									var10000[var10001] ^= this.field32;
								}
							}
							var23 = this.field44;
							var23.field1832 += var9;
							this.field45 += var9;
							if (var8 == this.field44.field1832) {
								if (16711935L == this.field38.field785) {
									this.field33 = this.field44;
									for (var10 = 0; var10 < 256; ++var10) {
										class13 var22 = this.field48[var10];
										if (var22 != null) {
											this.method23(var22, var10);
										}
									}
								} else {
									this.field46.reset();
									this.field46.update(this.field44.field1830, 0, var8);
									var10 = (int) this.field46.getValue();
									if (this.field38.field1996 != var10) {
										try {
											this.field53.method2073();
										} catch (Exception var18) {
										}
										++this.field29;
										this.field53 = null;
										this.field32 = (byte) (int) (Math.random() * 255.0D + 1.0D);
										return false;
									}
									this.field29 = 0;
									this.field52 = 0;
									this.field38.field1997.method38((int) (this.field38.field785 & 65535L), this.field44.field1830, 16711680L == (this.field38.field785 & 16711680L), this.field41);
								}
								this.field38.method318();
								if (this.field41) {
									--this.field35;
								} else {
									--this.field40;
								}
								this.field45 = 0;
								this.field38 = null;
								this.field44 = null;
							} else {
								if (this.field45 != 512) {
									break;
								}
								this.field45 = 0;
							}
						}
					}
					return true;
				}
			} catch (IOException var19) {
				try {
					this.field53.method2073();
				} catch (Exception var17) {
				}
				++this.field52;
				this.field53 = null;
				return false;
			}
		}
	}

	public void method21(boolean var1) {
		if (null != this.field53) {
			try {
				class187 var3 = new class187(4);
				var3.method1085(var1 ? 2 : 3);
				var3.method1137(0);
				this.field53.method2071(var3.field1830, 0, 4);
			} catch (IOException var6) {
				try {
					this.field53.method2073();
				} catch (Exception var5) {
				}
				++this.field52;
				this.field53 = null;
			}
		}
	}

	public void method20(class406 var1, boolean var2) {
		if (null != this.field53) {
			try {
				this.field53.method2073();
			} catch (Exception var8) {
			}
			this.field53 = null;
		}
		this.field53 = var1;
		this.method21(var2);
		this.field30.field1832 = 0;
		this.field38 = null;
		this.field44 = null;
		this.field45 = 0;
		while (true) {
			class226 var4 = (class226) this.field34.method2583();
			if (null == var4) {
				while (true) {
					var4 = (class226) this.field39.method2583();
					if (var4 == null) {
						if (this.field32 != 0) {
							try {
								class187 var9 = new class187(4);
								var9.method1085(4);
								var9.method1085(this.field32);
								var9.method1126(0);
								this.field53.method2071(var9.field1830, 0, 4);
							} catch (IOException var7) {
								try {
									this.field53.method2073();
								} catch (Exception var6) {
								}
								++this.field52;
								this.field53 = null;
							}
						}
						this.field51 = 0;
						this.field31 = class48.method197();
						return;
					}
					this.field36.method154(var4);
					this.field37.method2585(var4, var4.field785);
					++this.field47;
					--this.field40;
				}
			}
			this.field43.method2585(var4, var4.field785);
			++this.field42;
			--this.field35;
		}
	}

	void method22(class13 var1, int var2) {
		if (var1.field71) {
			if (var2 <= this.field49) {
				throw new RuntimeException("");
			}
			if (var2 < this.field50) {
				this.field50 = var2;
			}
		} else {
			if (var2 >= this.field50) {
				throw new RuntimeException("");
			}
			if (var2 > this.field49) {
				this.field49 = var2;
			}
		}
		if (null != this.field33) {
			this.method23(var1, var2);
		} else {
			this.method24((class13) null, 255, 255, 0, (byte) 0, true);
			this.field48[var2] = var1;
		}
	}

	void method23(class13 var1, int var2) {
		this.field33.field1832 = 5 + var2 * 8;
		if (this.field33.field1832 >= this.field33.field1830.length) {
			if (var1.field71) {
				var1.method42();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var4 = this.field33.method1100();
			int var5 = this.field33.method1100();
			var1.method37(var4, var5, (byte) 18);
		}
	}

	void method24(class13 var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var8 = (long) ((var2 << 16) + var3);
		class226 var10 = (class226) this.field43.method2582(var8);
		if (var10 == null) {
			var10 = (class226) this.field34.method2582(var8);
			if (null == var10) {
				var10 = (class226) this.field37.method2582(var8);
				if (var10 != null) {
					if (var6) {
						var10.method1674();
						this.field43.method2585(var10, var8);
						--this.field47;
						++this.field42;
					}
				} else {
					if (!var6) {
						var10 = (class226) this.field39.method2582(var8);
						if (null != var10) {
							return;
						}
					}
					var10 = new class226();
					var10.field1997 = var1;
					var10.field1996 = var4;
					var10.field1998 = var5;
					if (var6) {
						this.field43.method2585(var10, var8);
						++this.field42;
					} else {
						this.field36.method156(var10);
						this.field37.method2585(var10, var8);
						++this.field47;
					}
				}
			}
		}
	}

	void method27(int var1, int var2) {
		long var4 = (long) (var2 + (var1 << 16));
		class226 var6 = (class226) this.field37.method2582(var4);
		if (var6 != null) {
			this.field36.method154(var6);
		}
	}

	int method29(int var1, int var2) {
		long var4 = (long) (var2 + (var1 << 16));
		return this.field38 != null && var4 == this.field38.field785 ? 1 + this.field44.field1832 * 99 / (this.field44.field1830.length - this.field38.field1998) : 0;
	}

	public int method28(boolean var1, boolean var2) {
		boolean var4 = false;
		int var5 = 0 + this.field35 + this.field42;
		return var5;
	}

	public void method26() {
		if (this.field53 != null) {
			this.field53.method2073();
		}
	}
}
