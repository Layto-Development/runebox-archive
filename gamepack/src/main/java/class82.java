public final class class82 extends class54 {

	static class13 field834;

	boolean field823;

	boolean field825;

	boolean field831;

	class113 field818;

	class428 field813;

	class428 field828;

	class428 field829;

	class506 field806;

	class78 field822;

	int field805;

	int field807;

	int field808;

	int field810;

	int field811;

	int field812;

	int field814;

	int field815;

	int field816;

	int field817;

	int field819;

	int field820;

	int field821;

	int field824;

	int field826;

	int field827;

	int field830;

	int field832;

	int field833;

	String[] field809;

	class82() {
		this.field807 = -1;
		this.field808 = -1;
		this.field809 = new String[3];
		for (int var1 = 0; var1 < 3; ++var1) {
			this.field809[var1] = "";
		}
		this.field811 = 0;
		this.field819 = 0;
		this.field814 = 0;
		this.field824 = 0;
		this.field823 = false;
		this.field832 = 0;
		this.field825 = false;
		this.field828 = class428.field3353;
		this.field829 = class428.field3353;
		this.field813 = class428.field3353;
		this.field831 = false;
	}

	final void method329(class187 var1) {
		var1.field1832 = 0;
		int var3 = var1.method1096();
		boolean var4 = true;
		this.field807 = var1.method1097();
		this.field808 = var1.method1097();
		int var5 = -1;
		this.field832 = 0;
		int[] var6 = new int[12];
		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method1096();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method1096();
				var6[var7] = var9 + (var8 << 8);
				if (var7 == 0 && var6[0] == 65535) {
					var5 = var1.method1145();
					break;
				}
				if (var6[var7] >= 512) {
					var10 = class426.method2155(var6[var7] - 512).field3338;
					if (var10 != 0) {
						this.field832 = var10;
					}
				}
			}
		}
		int[] var28 = null;
		if (Client.field1080 >= 213) {
			var28 = new int[12];
			for (var8 = 0; var8 < 12; ++var8) {
				var9 = var1.method1096();
				if (var9 == 0) {
					var28[var8] = 0;
				} else {
					var10 = var1.method1096();
					var28[var8] = var10 + (var9 << 8);
				}
			}
		}
		int[] var29 = new int[5];
		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.method1096();
			if (var10 < 0 || var10 >= class425.field3287[var9].length) {
				var10 = 0;
			}
			var29[var9] = var10;
		}
		super.field248 = var1.method1145();
		if (super.field248 == 65535) {
			super.field248 = -1;
		}
		super.field249 = var1.method1145();
		if (super.field249 == 65535) {
			super.field249 = -1;
		}
		super.field310 = super.field249;
		super.field251 = var1.method1145();
		if (super.field251 == 65535) {
			super.field251 = -1;
		}
		super.field252 = var1.method1145();
		if (super.field252 == 65535) {
			super.field252 = -1;
		}
		super.field253 = var1.method1145();
		if (super.field253 == 65535) {
			super.field253 = -1;
		}
		super.field301 = var1.method1145();
		if (super.field301 == 65535) {
			super.field301 = -1;
		}
		super.field312 = var1.method1145();
		if (super.field312 == 65535) {
			super.field312 = -1;
		}
		this.field822 = new class78(var1.method1104(), class267.field2198);
		this.method331();
		this.method334();
		this.method343();
		if (this == class431.field3378) {
			class472.field3720 = this.field822.method322();
		}
		this.field811 = var1.method1096();
		this.field819 = var1.method1145();
		this.field825 = var1.method1096() == 1;
		if (Client.field923 == 0 && Client.field986 >= 2) {
			this.field825 = false;
		}
		class349[] var30 = null;
		boolean var31 = false;
		int var11 = var1.method1145();
		var31 = (var11 >> 15 & 1) == 1;
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var30 = new class349[12];
			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					int var17 = var6[var12] - 512;
					int var18 = var1.method1096();
					boolean var19 = (var18 & 1) != 0;
					boolean var20 = (var18 & 2) != 0;
					class349 var21 = new class349(var17);
					int var22;
					int[] var23;
					boolean var24;
					int var25;
					short var26;
					if (var19) {
						var22 = var1.method1096();
						var23 = new int[] { var22 & 15, var22 >> 4 & 15 };
						var24 = null != var21.field2635 && var23.length == var21.field2635.length;
						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short) var1.method1145();
								if (var24) {
									var21.field2635[var23[var25]] = var26;
								}
							}
						}
					}
					if (var20) {
						var22 = var1.method1096();
						var23 = new int[] { var22 & 15, var22 >> 4 & 15 };
						var24 = var21.field2636 != null && var21.field2636.length == var23.length;
						for (var25 = 0; var25 < 2; ++var25) {
							if (var23[var25] != 15) {
								var26 = (short) var1.method1145();
								if (var24) {
									var21.field2636[var23[var25]] = var26;
								}
							}
						}
					}
					var30[var12] = var21;
				}
			}
		}
		for (var12 = 0; var12 < 3; ++var12) {
			this.field809[var12] = var1.method1104();
		}
		int var27 = var1.method1096();
		if (this.field806 == null) {
			this.field806 = new class506();
		}
		this.field806.method2443(var28, var6, var30, var31, var29, var3, var5, var27);
	}

	boolean method330() {
		if (class428.field3353 == this.field828) {
			this.method332();
		}
		return this.field828 == class428.field3352;
	}

	void method331() {
		this.field828 = class428.field3353;
	}

	void method332() {
		this.field828 = class147.field1555.method952(this.field822) ? class428.field3352 : class428.field3351;
	}

	boolean method333() {
		if (class428.field3353 == this.field829) {
			this.method337();
		}
		return class428.field3352 == this.field829;
	}

	void method334() {
		this.field829 = class428.field3353;
	}

	void method337() {
		this.field829 = null != class366.field2930 && class366.field2930.method2280(this.field822) ? class428.field3352 : class428.field3351;
	}

	void method336() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (Client.field1142[var2] != null && Client.field1142[var2].method2505(this.field822.method322()) != -1 && var2 != 2) {
				this.field813 = class428.field3352;
				return;
			}
		}
		this.field813 = class428.field3351;
	}

	void method343() {
		this.field813 = class428.field3353;
	}

	boolean method340() {
		if (this.field813 == class428.field3353) {
			this.method336();
		}
		return this.field813 == class428.field3352;
	}

	int method335() {
		return null != this.field806 && this.field806.field4055 != -1 ? class314.method1695(this.field806.field4055).field2440 : 1;
	}

	@Override
	protected final class113 method1165() {
		if (null == this.field806) {
			return null;
		} else {
			class67 var2 = super.field287 != -1 && super.field304 == 0 ? class67.method308(super.field287) : null;
			class67 var3 = super.field255 != -1 && !this.field823 && (super.field248 != super.field255 || var2 == null) ? class67.method308(super.field255) : null;
			class113 var4 = this.field806.method2454(var2, super.field288, var3, super.field242);
			if (null == var4) {
				return null;
			} else {
				var4.method679();
				super.field302 = var4.field1834;
				int var5 = var4.field1327;
				if (!this.field823) {
					var4 = this.method222(var4);
				}
				if (!this.field823 && this.field818 != null) {
					if (Client.field1201 >= this.field824) {
						this.field818 = null;
					}
					if (Client.field1201 >= this.field814 && Client.field1201 < this.field824) {
						class113 var6 = this.field818;
						var6.method680(this.field815 - super.field272, this.field816 - this.field812, this.field817 - super.field243);
						if (super.field283 == 512) {
							var6.method689();
							var6.method689();
							var6.method689();
						} else if (super.field283 == 1024) {
							var6.method689();
							var6.method689();
						} else if (super.field283 == 1536) {
							var6.method689();
						}
						class113[] var7 = new class113[] { var4, var6 };
						var4 = new class113(var7, 2);
						if (super.field283 == 512) {
							var6.method689();
						} else if (super.field283 == 1024) {
							var6.method689();
							var6.method689();
						} else if (super.field283 == 1536) {
							var6.method689();
							var6.method689();
							var6.method689();
						}
						var6.method680(super.field272 - this.field815, this.field812 - this.field816, super.field243 - this.field817);
					}
				}
				var4.field1328 = true;
				if (super.field295 != 0 && Client.field1201 >= super.field303 && Client.field1201 < super.field245) {
					var4.field1383 = super.field305;
					var4.field1353 = super.field263;
					var4.field1351 = super.field257;
					var4.field1389 = super.field295;
					var4.field1390 = (short) var5;
				} else {
					var4.field1389 = 0;
				}
				return var4;
			}
		}
	}

	final void method342(int var1, int var2, class343 var3) {
		if (super.field287 != -1 && class67.method308(super.field287).field715 == 1) {
			super.field287 = -1;
		}
		this.method226();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.field317[0] >= 0 && super.field317[0] < 104 && super.field314[0] >= 0 && super.field314[0] < 104) {
				if (class343.field2604 == var3) {
					class82 var5 = this;
					class343 var6 = class343.field2604;
					int var7 = super.field317[0];
					int var8 = super.field314[0];
					int var9 = this.method335();
					if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
						int var11 = this.method335();
						class321 var12 = Client.method560(var1, var2);
						class438 var13 = Client.field973[this.field826];
						int[] var14 = Client.field1199;
						int[] var15 = Client.field1200;
						int var10 = class63.method280(var7, var8, var11, var12, var13, true, var14, var15, class63.field680[0]);
						int var16 = var10;
						if (var10 >= 1) {
							for (int var17 = 0; var17 < var16 - 1; ++var17) {
								var5.method341(Client.field1199[var17], Client.field1200[var17], var6);
							}
						}
					}
				}
				this.method341(var1, var2, var3);
			} else {
				this.method339(var1, var2);
			}
		} else {
			this.method339(var1, var2);
		}
	}

	void method339(int var1, int var2) {
		super.field290 = 0;
		super.field306 = 0;
		super.field316 = 0;
		super.field317[0] = var1;
		super.field314[0] = var2;
		int var4 = this.method335();
		super.field272 = 128 * super.field317[0] + var4 * 64;
		super.field243 = 128 * super.field314[0] + var4 * 64;
	}

	final void method341(int var1, int var2, class343 var3) {
		if (super.field290 < 9) {
			++super.field290;
		}
		for (int var5 = super.field290; var5 > 0; --var5) {
			super.field317[var5] = super.field317[var5 - 1];
			super.field314[var5] = super.field314[var5 - 1];
			super.field315[var5] = super.field315[var5 - 1];
		}
		super.field317[0] = var1;
		super.field314[0] = var2;
		super.field315[0] = var3;
	}

	@Override
	final boolean method217() {
		return null != this.field806;
	}
}
