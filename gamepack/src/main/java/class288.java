import java.io.IOException;
import java.util.zip.CRC32;

public class class288 {
	boolean field2564;
	byte field2555;
	class254 field2557;
	class254 field2560;
	class254 field2562;
	class254 field2566;
	class342[] field2571;
	class42 field2553;
	class42 field2556;
	class42 field2567;
	class431 field2576;
	class497 field2559;
	class500 field2561;
	int field2558;
	int field2563;
	int field2565;
	int field2568;
	int field2570;
	int field2572;
	int field2573;
	int field2574;
	CRC32 field2569;
	long field2554;
	public int field2552;
	public int field2575;

	public class288() {
		this.field2574 = 0;
		this.field2566 = new class254(4096);
		this.field2565 = 0;
		this.field2557 = new class254(32);
		this.field2558 = 0;
		this.field2559 = new class497();
		this.field2560 = new class254(4096);
		this.field2570 = 0;
		this.field2562 = new class254(4096);
		this.field2563 = 0;
		this.field2553 = new class42(8);
		this.field2568 = 0;
		this.field2569 = new CRC32();
		this.field2571 = new class342[256];
		this.field2572 = -1;
		this.field2573 = 255;
		this.field2555 = 0;
		this.field2552 = 0;
		this.field2575 = 0;
	}

	public boolean method1652() {
		long var2 = class172.method977();
		int var4 = (int)(var2 - this.field2554);
		this.field2554 = var2;
		if (var4 > 200) {
			var4 = 200;
		}

		this.field2574 += var4;
		if (this.field2563 == 0 && this.field2558 == 0 && this.field2570 == 0 && this.field2565 == 0) {
			return true;
		} else if (null == this.field2576) {
			return false;
		} else {
			try {
				if (this.field2574 > 30000) {
					throw new IOException();
				} else {
					class500 var5;
					class42 var6;
					while (this.field2558 < 200 && this.field2565 > 0) {
						var5 = (class500)this.field2566.method1493();
						var6 = new class42(4);
						var6.method267(1);
						var6.method319((int)var5.field3987);
						this.field2576.method2192(var6.field525, 0, 4);
						this.field2557.method1495(var5, var5.field3987);
						--this.field2565;
						++this.field2558;
					}

					while (this.field2563 < 200 && this.field2570 > 0) {
						var5 = (class500)this.field2559.method2413();
						var6 = new class42(4);
						var6.method267(0);
						var6.method319((int)var5.field3987);
						this.field2576.method2192(var6.field525, 0, 4);
						var5.method1252();
						this.field2562.method1495(var5, var5.field3987);
						--this.field2570;
						++this.field2563;
					}

					for (int var20 = 0; var20 < 100; ++var20) {
						int var21 = this.field2576.method2191();
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						this.field2574 = 0;
						byte var7 = 0;
						if (this.field2561 == null) {
							var7 = 8;
						} else if (this.field2568 == 0) {
							var7 = 1;
						}

						int var8;
						int var9;
						int var10;
						byte[] var10000;
						int var10001;
						class42 var23;
						if (var7 > 0) {
							var8 = var7 - this.field2553.field527;
							if (var8 > var21) {
								var8 = var21;
							}

							this.field2576.method2190(this.field2553.field525, this.field2553.field527, var8);
							if (this.field2555 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field2553.field525;
									var10001 = var9 + this.field2553.field527;
									var10000[var10001] ^= this.field2555;
								}
							}

							var23 = this.field2553;
							var23.field527 += var8;
							if (this.field2553.field527 < var7) {
								break;
							}

							if (null == this.field2561) {
								this.field2553.field527 = 0;
								var9 = this.field2553.method278();
								var10 = this.field2553.method327();
								int var11 = this.field2553.method278();
								int var12 = this.field2553.method282();
								long var13 = (long)(var10 + (var9 << 16));
								class500 var15 = (class500)this.field2557.method1492(var13);
								this.field2564 = true;
								if (null == var15) {
									var15 = (class500)this.field2562.method1492(var13);
									this.field2564 = false;
								}

								if (null == var15) {
									throw new IOException();
								}

								int var16 = var11 == 0 ? 5 : 9;
								this.field2561 = var15;
								this.field2567 = new class42(var12 + var16 + this.field2561.field4158);
								this.field2567.method267(var11);
								this.field2567.method333(var12);
								this.field2568 = 8;
								this.field2553.field527 = 0;
							} else if (this.field2568 == 0) {
								if (this.field2553.field525[0] == -1) {
									this.field2568 = 1;
									this.field2553.field527 = 0;
								} else {
									this.field2561 = null;
								}
							}
						} else {
							var8 = this.field2567.field525.length - this.field2561.field4158;
							var9 = 512 - this.field2568;
							if (var9 > var8 - this.field2567.field527) {
								var9 = var8 - this.field2567.field527;
							}

							if (var9 > var21) {
								var9 = var21;
							}

							this.field2576.method2190(this.field2567.field525, this.field2567.field527, var9);
							if (this.field2555 != 0) {
								for (var10 = 0; var10 < var9; ++var10) {
									var10000 = this.field2567.field525;
									var10001 = var10 + this.field2567.field527;
									var10000[var10001] ^= this.field2555;
								}
							}

							var23 = this.field2567;
							var23.field527 += var9;
							this.field2568 += var9;
							if (var8 == this.field2567.field527) {
								if (16711935L == this.field2561.field3987) {
									this.field2556 = this.field2567;

									for (var10 = 0; var10 < 256; ++var10) {
										class342 var22 = this.field2571[var10];
										if (var22 != null) {
											this.method1650(var22, var10);
										}
									}
								} else {
									this.field2569.reset();
									this.field2569.update(this.field2567.field525, 0, var8);
									var10 = (int)this.field2569.getValue();
									if (this.field2561.field4156 != var10) {
										try {
											this.field2576.method2194();
										} catch (Exception var18) {
										}

										++this.field2552;
										this.field2576 = null;
										this.field2555 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field2552 = 0;
									this.field2575 = 0;
									this.field2561.field4157.method1876((int)(this.field2561.field3987 & 65535L), this.field2567.field525, 16711680L == (this.field2561.field3987 & 16711680L), this.field2564);
								}

								this.field2561.method2269();
								if (this.field2564) {
									--this.field2558;
								} else {
									--this.field2563;
								}

								this.field2568 = 0;
								this.field2561 = null;
								this.field2567 = null;
							} else {
								if (this.field2568 != 512) {
									break;
								}

								this.field2568 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					this.field2576.method2194();
				} catch (Exception var17) {
				}

				++this.field2575;
				this.field2576 = null;
				return false;
			}
		}
	}

	public void method1648(boolean var1) {
		if (null != this.field2576) {
			try {
				class42 var3 = new class42(4);
				var3.method267(var1 ? 2 : 3);
				var3.method319(0);
				this.field2576.method2192(var3.field525, 0, 4);
			} catch (IOException var6) {
				try {
					this.field2576.method2194();
				} catch (Exception var5) {
				}

				++this.field2575;
				this.field2576 = null;
			}

		}
	}

	public void method1647(class431 var1, boolean var2) {
		if (null != this.field2576) {
			try {
				this.field2576.method2194();
			} catch (Exception var8) {
			}

			this.field2576 = null;
		}

		this.field2576 = var1;
		this.method1648(var2);
		this.field2553.field527 = 0;
		this.field2561 = null;
		this.field2567 = null;
		this.field2568 = 0;

		while (true) {
			class500 var4 = (class500)this.field2557.method1493();
			if (null == var4) {
				while (true) {
					var4 = (class500)this.field2562.method1493();
					if (var4 == null) {
						if (this.field2555 != 0) {
							try {
								class42 var9 = new class42(4);
								var9.method267(4);
								var9.method267(this.field2555);
								var9.method308(0);
								this.field2576.method2192(var9.field525, 0, 4);
							} catch (IOException var7) {
								try {
									this.field2576.method2194();
								} catch (Exception var6) {
								}

								++this.field2575;
								this.field2576 = null;
							}
						}

						this.field2574 = 0;
						this.field2554 = class172.method977();
						return;
					}

					this.field2559.method2412(var4);
					this.field2560.method1495(var4, var4.field3987);
					++this.field2570;
					--this.field2563;
				}
			}

			this.field2566.method1495(var4, var4.field3987);
			++this.field2565;
			--this.field2558;
		}
	}

	void method1649(class342 var1, int var2) {
		if (var1.field2961) {
			if (var2 <= this.field2572) {
				throw new RuntimeException("");
			}

			if (var2 < this.field2573) {
				this.field2573 = var2;
			}
		} else {
			if (var2 >= this.field2573) {
				throw new RuntimeException("");
			}

			if (var2 > this.field2572) {
				this.field2572 = var2;
			}
		}

		if (null != this.field2556) {
			this.method1650(var1, var2);
		} else {
			this.method1651((class342)null, 255, 255, 0, (byte)0, true);
			this.field2571[var2] = var1;
		}
	}

	void method1650(class342 var1, int var2) {
		this.field2556.field527 = 5 + var2 * 8;
		if (this.field2556.field527 >= this.field2556.field525.length) {
			if (var1.field2961) {
				var1.method1879();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var4 = this.field2556.method282();
			int var5 = this.field2556.method282();
			var1.method1875(var4, var5, (byte)18);
		}
	}

	void method1651(class342 var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var8 = (long)((var2 << 16) + var3);
		class500 var10 = (class500)this.field2566.method1492(var8);
		if (var10 == null) {
			var10 = (class500)this.field2557.method1492(var8);
			if (null == var10) {
				var10 = (class500)this.field2560.method1492(var8);
				if (var10 != null) {
					if (var6) {
						var10.method1252();
						this.field2566.method1495(var10, var8);
						--this.field2570;
						++this.field2565;
					}

				} else {
					if (!var6) {
						var10 = (class500)this.field2562.method1492(var8);
						if (null != var10) {
							return;
						}
					}

					var10 = new class500();
					var10.field4157 = var1;
					var10.field4156 = var4;
					var10.field4158 = var5;
					if (var6) {
						this.field2566.method1495(var10, var8);
						++this.field2565;
					} else {
						this.field2559.method2414(var10);
						this.field2560.method1495(var10, var8);
						++this.field2570;
					}

				}
			}
		}
	}

	void method1654(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		class500 var6 = (class500)this.field2560.method1492(var4);
		if (var6 != null) {
			this.field2559.method2412(var6);
		}
	}

	int method1656(int var1, int var2) {
		long var4 = (long)(var2 + (var1 << 16));
		return this.field2561 != null && var4 == this.field2561.field3987 ? 1 + this.field2567.field527 * 99 / (this.field2567.field525.length - this.field2561.field4158) : 0;
	}

	public int method1655(boolean var1, boolean var2) {
		int var4 = 0;
		if (var1) {
			var4 += this.field2558 + this.field2565;
		}

		if (var2) {
			var4 += this.field2570 + this.field2563;
		}

		return var4;
	}

	public void method1653() {
		if (this.field2576 != null) {
			this.field2576.method2194();
		}

	}

	static char method1657(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	static class94[] method1658() {
		return new class94[]{class94.field936, class94.field938, class94.field934, class94.field933, class94.field935};
	}
}
