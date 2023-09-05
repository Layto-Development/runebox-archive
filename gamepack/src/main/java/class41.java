import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;
import java.util.zip.CRC32;

@ObfInfo(name = "nf")
public class class41 {
	@ObfInfo(name = "al", desc = "Z")
	boolean field538;
	@ObfInfo(name = "av", desc = "B")
	byte field529;
	@ObfInfo(name = "au", desc = "Lqi;")
	class112 field550;
	@ObfInfo(name = "an", desc = "Lnj;")
	class228 field535;
	@ObfInfo(name = "ar", desc = "Ltm;")
	class280 field527;
	@ObfInfo(name = "ah", desc = "Ltm;")
	class280 field530;
	@ObfInfo(name = "ab", desc = "Ltm;")
	class280 field541;
	@ObfInfo(name = "ai", desc = "Lso;")
	class405 field531;
	@ObfInfo(name = "aa", desc = "Lso;")
	class405 field534;
	@ObfInfo(name = "ad", desc = "Lso;")
	class405 field536;
	@ObfInfo(name = "at", desc = "Lso;")
	class405 field540;
	@ObfInfo(name = "ap", desc = "Los;")
	class442 field533;
	@ObfInfo(name = "as", desc = "[Lnk;")
	class505[] field545;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 986152519)
	int field532;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1738247723)
	int field537;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 278498079)
	int field539;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1397653743)
	int field542;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1119998937)
	int field544;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 1707785745)
	int field546;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1369154899)
	int field547;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 593542457)
	int field548;
	@ObfInfo(name = "ax", desc = "Ljava/util/zip/CRC32;")
	CRC32 field543;
	@ObfInfo(name = "ao", desc = "J", longMultiplier = 8908412595310329561L)
	long field528;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1933667131)
	public int field526;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -322958283)
	public int field549;

	@ObfInfo(name = "<init>", desc = "()V")
	public class41() {
		this.field548 = 0;
		this.field540 = new class405(4096);
		this.field539 = 0;
		this.field531 = new class405(32);
		this.field532 = 0;
		this.field533 = new class442();
		this.field534 = new class405(4096);
		this.field544 = 0;
		this.field536 = new class405(4096);
		this.field537 = 0;
		this.field527 = new class280(8);
		this.field542 = 0;
		this.field543 = new CRC32();
		this.field545 = new class505[256];
		this.field546 = -1;
		this.field547 = 255;
		this.field529 = 0;
		this.field526 = 0;
		this.field549 = 0;
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "-948886865")
	public boolean method434() {
		long var2 = class43.method443();
		int var4 = (int)(var2 - this.field528);
		this.field528 = var2;
		if (var4 > 200) {
			var4 = 200;
		}

		this.field548 += var4;
		if (this.field537 == 0 && this.field532 == 0 && this.field544 == 0 && this.field539 == 0) {
			return true;
		} else if (null == this.field550) {
			return false;
		} else {
			try {
				if (this.field548 > 30000) {
					throw new IOException();
				} else {
					class228 var5;
					class280 var6;
					while (this.field532 < 200 && this.field539 > 0) {
						var5 = (class228)this.field540.method2130();
						var6 = new class280(4);
						var6.method1481(1);
						var6.method1533((int)var5.field1483);
						this.field550.method620(var6.field2252, 0, 4);
						this.field531.method2132(var5, var5.field1483);
						--this.field539;
						++this.field532;
					}

					while (this.field537 < 200 && this.field544 > 0) {
						var5 = (class228)this.field533.method2314();
						var6 = new class280(4);
						var6.method1481(0);
						var6.method1533((int)var5.field1483);
						this.field550.method620(var6.field2252, 0, 4);
						var5.method1024();
						this.field536.method2132(var5, var5.field1483);
						--this.field544;
						++this.field537;
					}

					for (int var20 = 0; var20 < 100; ++var20) {
						int var21 = this.field550.method619();
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						this.field548 = 0;
						byte var7 = 0;
						if (this.field535 == null) {
							var7 = 8;
						} else if (this.field542 == 0) {
							var7 = 1;
						}

						int var8;
						int var9;
						int var10;
						byte[] var10000;
						int var10001;
						class280 var23;
						if (var7 > 0) {
							var8 = var7 - this.field527.field2254;
							if (var8 > var21) {
								var8 = var21;
							}

							this.field550.method618(this.field527.field2252, this.field527.field2254, var8);
							if (this.field529 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field527.field2252;
									var10001 = var9 + this.field527.field2254;
									var10000[var10001] ^= this.field529;
								}
							}

							var23 = this.field527;
							var23.field2254 += var8;
							if (this.field527.field2254 < var7) {
								break;
							}

							if (null == this.field535) {
								this.field527.field2254 = 0;
								var9 = this.field527.method1492();
								var10 = this.field527.method1541();
								int var11 = this.field527.method1492();
								int var12 = this.field527.method1496();
								long var13 = (long)(var10 + (var9 << 16));
								class228 var15 = (class228)this.field531.method2129(var13);
								this.field538 = true;
								if (null == var15) {
									var15 = (class228)this.field536.method2129(var13);
									this.field538 = false;
								}

								if (null == var15) {
									throw new IOException();
								}

								int var16 = var11 == 0 ? 5 : 9;
								this.field535 = var15;
								this.field541 = new class280(var12 + var16 + this.field535.field1956);
								this.field541.method1481(var11);
								this.field541.method1547(var12);
								this.field542 = 8;
								this.field527.field2254 = 0;
							} else if (this.field542 == 0) {
								if (this.field527.field2252[0] == -1) {
									this.field542 = 1;
									this.field527.field2254 = 0;
								} else {
									this.field535 = null;
								}
							}
						} else {
							var8 = this.field541.field2252.length - this.field535.field1956;
							var9 = 512 - this.field542;
							if (var9 > var8 - this.field541.field2254) {
								var9 = var8 - this.field541.field2254;
							}

							if (var9 > var21) {
								var9 = var21;
							}

							this.field550.method618(this.field541.field2252, this.field541.field2254, var9);
							if (this.field529 != 0) {
								for (var10 = 0; var10 < var9; ++var10) {
									var10000 = this.field541.field2252;
									var10001 = var10 + this.field541.field2254;
									var10000[var10001] ^= this.field529;
								}
							}

							var23 = this.field541;
							var23.field2254 += var9;
							this.field542 += var9;
							if (var8 == this.field541.field2254) {
								if (16711935L == this.field535.field1483) {
									this.field530 = this.field541;

									for (var10 = 0; var10 < 256; ++var10) {
										class505 var22 = this.field545[var10];
										if (var22 != null) {
											this.method432(var22, var10);
										}
									}
								} else {
									this.field543.reset();
									this.field543.update(this.field541.field2252, 0, var8);
									var10 = (int)this.field543.getValue();
									if (this.field535.field1954 != var10) {
										try {
											this.field550.method622();
										} catch (Exception var18) {
										}

										++this.field526;
										this.field550 = null;
										this.field529 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field526 = 0;
									this.field549 = 0;
									this.field535.field1955.method2504((int)(this.field535.field1483 & 65535L), this.field541.field2252, 16711680L == (this.field535.field1483 & 16711680L), this.field538);
								}

								this.field535.method907();
								if (this.field538) {
									--this.field532;
								} else {
									--this.field537;
								}

								this.field542 = 0;
								this.field535 = null;
								this.field541 = null;
							} else {
								if (this.field542 != 512) {
									break;
								}

								this.field542 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					this.field550.method622();
				} catch (Exception var17) {
				}

				++this.field549;
				this.field550 = null;
				return false;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(ZI)V", opaqueValue = "-2146321126")
	public void method430(boolean var1) {
		if (null != this.field550) {
			try {
				class280 var3 = new class280(4);
				var3.method1481(var1 ? 2 : 3);
				var3.method1533(0);
				this.field550.method620(var3.field2252, 0, 4);
			} catch (IOException var6) {
				try {
					this.field550.method622();
				} catch (Exception var5) {
				}

				++this.field549;
				this.field550 = null;
			}

		}
	}

	@ObfInfo(name = "ao", desc = "(Lqi;ZI)V", opaqueValue = "193261013")
	public void method429(class112 var1, boolean var2) {
		if (null != this.field550) {
			try {
				this.field550.method622();
			} catch (Exception var8) {
			}

			this.field550 = null;
		}

		this.field550 = var1;
		this.method430(var2);
		this.field527.field2254 = 0;
		this.field535 = null;
		this.field541 = null;
		this.field542 = 0;

		while (true) {
			class228 var4 = (class228)this.field531.method2130();
			if (null == var4) {
				while (true) {
					var4 = (class228)this.field536.method2130();
					if (var4 == null) {
						if (this.field529 != 0) {
							try {
								class280 var9 = new class280(4);
								var9.method1481(4);
								var9.method1481(this.field529);
								var9.method1522(0);
								this.field550.method620(var9.field2252, 0, 4);
							} catch (IOException var7) {
								try {
									this.field550.method622();
								} catch (Exception var6) {
								}

								++this.field549;
								this.field550 = null;
							}
						}

						this.field548 = 0;
						this.field528 = class43.method443();
						return;
					}

					this.field533.method2313(var4);
					this.field534.method2132(var4, var4.field1483);
					++this.field544;
					--this.field537;
				}
			}

			this.field540.method2132(var4, var4.field1483);
			++this.field539;
			--this.field532;
		}
	}

	@ObfInfo(name = "at", desc = "(Lnk;II)V", opaqueValue = "1652729134")
	void method431(class505 var1, int var2) {
		if (var1.field4069) {
			if (var2 <= this.field546) {
				throw new RuntimeException("");
			}

			if (var2 < this.field547) {
				this.field547 = var2;
			}
		} else {
			if (var2 >= this.field547) {
				throw new RuntimeException("");
			}

			if (var2 > this.field546) {
				this.field546 = var2;
			}
		}

		if (null != this.field530) {
			this.method432(var1, var2);
		} else {
			this.method433((class505)null, 255, 255, 0, (byte)0, true);
			this.field545[var2] = var1;
		}
	}

	@ObfInfo(name = "ac", desc = "(Lnk;II)V", opaqueValue = "-1458477850")
	void method432(class505 var1, int var2) {
		this.field530.field2254 = 5 + var2 * 8;
		if (this.field530.field2254 >= this.field530.field2252.length) {
			if (var1.field4069) {
				var1.method2507();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var4 = this.field530.method1496();
			int var5 = this.field530.method1496();
			var1.method2503(var4, var5, (byte)18);
		}
	}

	@ObfInfo(name = "ai", desc = "(Lnk;IIIBZB)V", opaqueValue = "0")
	void method433(class505 var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var8 = (long)((var2 << 16) + var3);
		class228 var10 = (class228)this.field540.method2129(var8);
		if (var10 == null) {
			var10 = (class228)this.field531.method2129(var8);
			if (null == var10) {
				var10 = (class228)this.field534.method2129(var8);
				if (var10 != null) {
					if (var6) {
						var10.method1024();
						this.field540.method2132(var10, var8);
						--this.field544;
						++this.field539;
					}

				} else {
					if (!var6) {
						var10 = (class228)this.field536.method2129(var8);
						if (null != var10) {
							return;
						}
					}

					var10 = new class228();
					var10.field1955 = var1;
					var10.field1954 = var4;
					var10.field1956 = var5;
					if (var6) {
						this.field540.method2132(var10, var8);
						++this.field539;
					} else {
						this.field533.method2315(var10);
						this.field534.method2132(var10, var8);
						++this.field544;
					}

				}
			}
		}
	}

	@ObfInfo(name = "az", desc = "(III)V")
	void method436(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		class228 var6 = (class228)this.field534.method2129(var4);
		if (var6 != null) {
			this.field533.method2313(var6);
		}
	}

	@ObfInfo(name = "ap", desc = "(III)I", opaqueValue = "-1437295059")
	int method438(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		return this.field535 != null && var4 == this.field535.field1483 ? 1 + this.field541.field2254 * 99 / (this.field541.field2252.length - this.field535.field1956) : 0;
	}

	@ObfInfo(name = "aa", desc = "(ZZS)I", opaqueValue = "255")
	public int method437(boolean var1, boolean var2) {
		int var4 = 0;
		if (var1) {
			var4 += this.field532 + this.field539;
		}

		if (var2) {
			var4 += this.field544 + this.field537;
		}

		return var4;
	}

	@ObfInfo(name = "af", desc = "(I)V", opaqueValue = "-2098760222")
	public void method435() {
		if (this.field550 != null) {
			this.field550.method622();
		}

	}
}
