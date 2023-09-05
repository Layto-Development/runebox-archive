import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qk")
public class class467 extends class153 {
	@ObfInfo(name = "at", desc = "I", intMultiplier = -39906851)
	int field3772;
	@ObfInfo(name = "ao", desc = "Lsl;")
	final class187 field3771;
	@ObfInfo(name = "ac", desc = "Lox;")
	public class430 field3770;

	@ObfInfo(name = "<init>", desc = "(Lsl;)V")
	public class467(class187 var1) {
		super(400);
		this.field3772 = 1;
		this.field3770 = new class430();
		this.field3771 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Lqs;")
	class179 method902() {
		return new class317();
	}

	@ObfInfo(name = "ae", desc = "(IB)[Lqs;")
	class179[] method896(int var1) {
		return new class317[var1];
	}

	@ObfInfo(name = "ao", desc = "(Luc;ZI)Z", opaqueValue = "-1577740414")
	public boolean method2402(class353 var1, boolean var2) {
		class317 var4 = (class317)this.method886(var1);
		if (null == var4) {
			return false;
		} else {
			return !var2 || var4.field3235 != 0;
		}
	}

	@ObfInfo(name = "az", desc = "(Ltm;IB)V")
	public void method2403(class280 var1, int var2, byte var3) {
		while (var1.field2254 < var2) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			boolean var10000;
			if (var1.method1492() == 1) {
				if (var3 != -1) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var4 = var10000;
			class353 var5 = new class353(var1.method1500(), this.field3771);
			class353 var6 = new class353(var1.method1500(), this.field3771);
			int var7 = var1.method1541();
			int var8 = var1.method1492();
			int var9 = var1.method1492();
			if ((var9 & 2) != 0) {
				if (var3 != -1) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var10 = var10000;
			if ((var9 & 1) != 0) {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var11 = var10000;
			if (var7 > 0) {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				var1.method1500();
				var1.method1492();
				var1.method1496();
			}

			var1.method1500();
			if (var5 != null) {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				if (var5.method1936()) {
					class317 var12 = (class317)this.method887(var5);
					if (var4) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}

						class317 var13 = (class317)this.method887(var6);
						if (var13 != null) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							if (var13 != var12) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								if (var12 != null) {
									this.method888(var13);
								} else {
									var12 = var13;
								}
							}
						}
					}

					if (null != var12) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}

						this.method891(var12, var5, var6);
						if (var12.field3235 != var7) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							boolean var15 = true;

							for (class47 var14 = (class47)this.field3770.method2249(); null != var14; var14 = (class47)this.field3770.method2248()) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								if (var14.field564.equals(var5)) {
									if (var3 != -1) {
										throw new IllegalStateException();
									}

									if (var7 != 0) {
										if (var3 != -1) {
											throw new IllegalStateException();
										}

										if (var14.field565 == 0) {
											if (var3 != -1) {
												throw new IllegalStateException();
											}

											var14.method1153();
											var15 = false;
											continue;
										}
									}

									if (var7 == 0) {
										if (var3 != -1) {
											throw new IllegalStateException();
										}

										if (var14.field565 != 0) {
											if (var3 != -1) {
												throw new IllegalStateException();
											}

											var14.method1153();
											var15 = false;
										}
									}
								}
							}

							if (var15) {
								this.field3770.method2247(new class47(var5, var7));
							}
						}
					} else {
						if (this.method905() >= 400) {
							continue;
						}

						if (var3 != -1) {
							throw new IllegalStateException();
						}

						var12 = (class317)this.method889(var5, var6);
					}

					if (var7 != var12.field3235) {
						if (var3 != -1) {
							return;
						}

						var12.field3234 = ++this.field3772 - 1;
						if (var12.field3235 == -1) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							if (var7 == 0) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								var12.field3234 = -(var12.field3234 * -1297576351) * -585067103;
							}
						}

						var12.field3235 = var7;
					}

					var12.field3236 = var8;
					var12.field2565 = var10;
					var12.field2566 = var11;
					continue;
				}

				if (var3 != -1) {
					throw new IllegalStateException();
				}
			}

			throw new IllegalStateException();
		}

		this.method906();
	}
}
