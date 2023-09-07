public class class249 extends class7 {

	static byte[][] field2113;

	final boolean field2112;

	public class249(boolean var1) {
		this.field2112 = var1;
	}

	int method1436(class150 var1, class150 var2) {
		if (var1.field1577 != 0) {
			if (var2.field1577 == 0) {
				return this.field2112 ? -1 : 1;
			}
		} else if (var2.field1577 != 0) {
			return this.field2112 ? 1 : -1;
		}
		return this.method19(var1, var2);
	}

	@Override
	public int compare(Object var1, Object var2) {
		return this.method1436((class150) var1, (class150) var2);
	}

	static final void method1437(class54 var0) {
		var0.field250 = false;
		if (var0.field255 != -1) {
			class67 var2 = class67.method308(var0.field255);
			if (null != var2) {
				if (!var2.method307() && null != var2.field701) {
					++var0.field285;
					if (var0.field242 < var2.field701.length && var0.field285 > var2.field712[var0.field242]) {
						var0.field285 = 1;
						++var0.field242;
						Client.method513(var2, var0.field242, var0.field272, var0.field243);
					}
					if (var0.field242 >= var2.field701.length) {
						if (var2.field705 > 0) {
							var0.field242 -= var2.field705;
							if (var2.field713) {
								++var0.field286;
							}
							if (var0.field242 < 0 || var0.field242 >= var2.field701.length || var2.field713 && var0.field286 >= var2.field694) {
								var0.field285 = 0;
								var0.field242 = 0;
								var0.field286 = 0;
							}
						} else {
							var0.field285 = 0;
							var0.field242 = 0;
						}
						Client.method513(var2, var0.field242, var0.field272, var0.field243);
					}
				} else if (var2.method307()) {
					++var0.field242;
					int var3 = var2.method304();
					if (var0.field242 < var3) {
						Client.method521(var2, var0.field242, var0.field272, var0.field243);
					} else {
						if (var2.field705 > 0) {
							var0.field242 -= var2.field705;
							if (var2.field713) {
								++var0.field286;
							}
							if (var0.field242 < 0 || var0.field242 >= var3 || var2.field713 && var0.field286 >= var2.field694) {
								var0.field242 = 0;
								var0.field285 = 0;
								var0.field286 = 0;
							}
						} else {
							var0.field285 = 0;
							var0.field242 = 0;
						}
						Client.method521(var2, var0.field242, var0.field272, var0.field243);
					}
				} else {
					var0.field255 = -1;
				}
			} else {
				var0.field255 = -1;
			}
		}
		class331 var7 = new class331(var0.method221());
		int var4;
		for (class347 var8 = (class347) var7.method1735(); null != var8; var8 = (class347) var7.next()) {
			if (var8.field2629 != -1 && Client.field1201 >= var8.field2628) {
				var4 = class138.method872(var8.field2629).field1522;
				if (var4 == -1) {
					var8.method318();
					--var0.field293;
				} else {
					var8.field2626 = Math.max(var8.field2626, 0);
					class67 var5 = class67.method308(var4);
					if (null != var5.field701 && !var5.method307()) {
						++var8.field2625;
						if (var8.field2626 < var5.field701.length && var8.field2625 > var5.field712[var8.field2626]) {
							var8.field2625 = 1;
							++var8.field2626;
							Client.method513(var5, var8.field2626, var0.field272, var0.field243);
						}
						if (var8.field2626 >= var5.field701.length) {
							var8.method318();
							--var0.field293;
						}
					} else if (var5.method307()) {
						++var8.field2626;
						int var6 = var5.method304();
						if (var8.field2626 < var6) {
							Client.method521(var5, var8.field2626, var0.field272, var0.field243);
						} else {
							var8.method318();
							--var0.field293;
						}
					} else {
						var8.method318();
						--var0.field293;
					}
				}
			}
		}
		class67 var9;
		if (var0.field287 != -1 && var0.field304 <= 1) {
			var9 = class67.method308(var0.field287);
			if (var9.field714 == 1 && var0.field306 > 0 && var0.field298 <= Client.field1201 && var0.field299 < Client.field1201) {
				var0.field304 = 1;
				return;
			}
		}
		if (var0.field287 != -1 && var0.field304 == 0) {
			var9 = class67.method308(var0.field287);
			if (var9 != null) {
				if (!var9.method307() && var9.field701 != null) {
					++var0.field289;
					if (var0.field288 < var9.field701.length && var0.field289 > var9.field712[var0.field288]) {
						var0.field289 = 1;
						++var0.field288;
						Client.method513(var9, var0.field288, var0.field272, var0.field243);
					}
					if (var0.field288 >= var9.field701.length) {
						var0.field288 -= var9.field705;
						++var0.field269;
						if (var0.field269 >= var9.field694) {
							var0.field287 = -1;
						} else if (var0.field288 >= 0 && var0.field288 < var9.field701.length) {
							Client.method513(var9, var0.field288, var0.field272, var0.field243);
						} else {
							var0.field287 = -1;
						}
					}
					var0.field250 = var9.field708;
				} else if (var9.method307()) {
					++var0.field288;
					var4 = var9.method304();
					if (var0.field288 < var4) {
						Client.method521(var9, var0.field288, var0.field272, var0.field243);
					} else {
						var0.field288 -= var9.field705;
						++var0.field269;
						if (var0.field269 >= var9.field694) {
							var0.field287 = -1;
						} else if (var0.field288 >= 0 && var0.field288 < var4) {
							Client.method521(var9, var0.field288, var0.field272, var0.field243);
						} else {
							var0.field287 = -1;
						}
					}
				} else {
					var0.field287 = -1;
				}
			} else {
				var0.field287 = -1;
			}
		}
		if (var0.field304 > 0) {
			--var0.field304;
		}
	}
}
