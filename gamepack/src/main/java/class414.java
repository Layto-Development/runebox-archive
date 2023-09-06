public class class414 implements class405 {
	int field3456;
	int field3457;
	int field3458;
	int field3459;
	int field3460;
	int field3461;
	int field3462;
	int field3463;
	int field3464;
	int field3465;

	class414() {
	}

	public void method2098(class8 var1) {
		if (var1.field341 > this.field3460) {
			var1.field341 = this.field3460;
		}

		if (var1.field335 < this.field3460) {
			var1.field335 = this.field3460;
		}

		if (var1.field343 > this.field3461) {
			var1.field343 = this.field3461;
		}

		if (var1.field337 < this.field3461) {
			var1.field337 = this.field3461;
		}

	}

	public boolean method2093(int var1, int var2, int var3) {
		if (var1 >= this.field3463 && var1 < this.field3463 + this.field3456) {
			return var2 >= (this.field3458 << 3) + (this.field3465 << 6) && var2 <= (this.field3465 << 6) + (this.field3458 << 3) + 7 && var3 >= (this.field3459 << 6) + (this.field3462 << 3) && var3 <= (this.field3459 << 6) + (this.field3462 << 3) + 7;
		} else {
			return false;
		}
	}

	public boolean method2094(int var1, int var2) {
		return var1 >= (this.field3460 << 6) + (this.field3457 << 3) && var1 <= (this.field3457 << 3) + (this.field3460 << 6) + 7 && var2 >= (this.field3461 << 6) + (this.field3464 << 3) && var2 <= (this.field3464 << 3) + (this.field3461 << 6) + 7;
	}

	public int[] method2096(int var1, int var2, int var3) {
		if (!this.method2093(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field3460 * 64 - this.field3465 * 64) + (this.field3457 * 8 - this.field3458 * 8), this.field3464 * 8 - this.field3462 * 8 + this.field3461 * 64 - this.field3459 * 64 + var3};
			return var5;
		}
	}

	public class29 method2097(int var1, int var2) {
		if (!this.method2094(var1, var2)) {
			return null;
		} else {
			int var4 = this.field3465 * 64 - this.field3460 * 64 + var1 + (this.field3458 * 8 - this.field3457 * 8);
			int var5 = this.field3462 * 8 - this.field3464 * 8 + var2 + (this.field3459 * 64 - this.field3461 * 64);
			return new class29(this.field3463, var4, var5);
		}
	}

	public void method2095(class42 var1) {
		this.field3463 = var1.method278();
		this.field3456 = var1.method278();
		this.field3465 = var1.method327();
		this.field3458 = var1.method278();
		this.field3459 = var1.method327();
		this.field3462 = var1.method278();
		this.field3460 = var1.method327();
		this.field3457 = var1.method278();
		this.field3461 = var1.method327();
		this.field3464 = var1.method278();
		this.method2133();
	}

	void method2133() {
	}

	static final void method2134(class102 var0, int var1, int var2, int var3) {
		class375 var5 = var0.field1018;
		if (Client.field152 < 400) {
			if (null != var5.field3177) {
				var5 = var5.method2001();
			}

			if (var5 != null) {
				if (var5.field3183) {
					if (!var5.field3185 || var1 == Client.field38) {
						String var6 = var0.method656();
						int var7;
						if (var5.field3173 != 0 && var0.field1601 != 0) {
							var7 = var0.field1601 != -1 ? var0.field1601 : var5.field3173;
							var6 = var6 + class57.method425(var7, class82.field863.field2528) + " " + class278.field2463 + class433.field3550 + var7 + class278.field2465;
						}

						if (var5.field3185 && Client.field161) {
							class465.method2277(class433.field3705, class394.method2064(16776960) + var6, 1003, var1, var2, var3);
						}

						if (Client.field168 == 1) {
							class465.method2277(class433.field3704, Client.field169 + " " + class278.field2468 + " " + class394.method2064(16776960) + var6, 7, var1, var2, var3);
						} else if (Client.field95) {
							if ((class306.field2773 & 2) == 2) {
								class465.method2277(Client.field186, Client.field197 + " " + class278.field2468 + " " + class394.method2064(16776960) + var6, 8, var1, var2, var3);
							}
						} else {
							var7 = var5.field3185 && Client.field161 ? 2000 : 0;
							String[] var8 = var5.field3147;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method655(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class433.field3706)) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										class465.method2277(var8[var9], class394.method2064(16776960) + var6, var10, var1, var2, var3);
									}
								}
							}

							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method655(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class433.field3706)) {
										short var11 = 0;
										if (class94.field934 != Client.field33) {
											if (class94.field933 == Client.field33 || Client.field33 == class94.field938 && var5.field3173 > class82.field863.field2528) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											class465.method2277(var8[var9], class394.method2064(16776960) + var6, var10, var1, var2, var3);
										}
									}
								}
							}

							if (!var5.field3185 || !Client.field161) {
								class465.method2277(class433.field3705, class394.method2064(16776960) + var6, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
