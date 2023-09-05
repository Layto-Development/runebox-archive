import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "es")
public class class402 extends class381 {
	@ObfInfo(name = "jx", desc = "[[B")
	static byte[][] field3124;
	@ObfInfo(name = "au", desc = "Z")
	final boolean field3123;

	@ObfInfo(name = "<init>", desc = "(Z)V")
	public class402(boolean var1) {
		this.field3123 = var1;
	}

	@ObfInfo(name = "au", desc = "(Lqb;Lqb;B)I", opaqueValue = "-1")
	int method2122(class424 var1, class424 var2) {
		if (var1.field3235 != 0) {
			if (var2.field3235 == 0) {
				return this.field3123 ? -1 : 1;
			}
		} else if (var2.field3235 != 0) {
			return this.field3123 ? 1 : -1;
		}

		return this.method2031(var1, var2);
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2122((class424)var1, (class424)var2);
	}

	@ObfInfo(name = "iv", desc = "(Ldr;I)V", opaqueValue = "-316834748")
	static final void method2123(class114 var0) {
		var0.field1039 = false;
		if (var0.field1044 != -1) {
			class202 var2 = class202.method1149(var0.field1044);
			if (null != var2) {
				if (!var2.method1148() && null != var2.field1839) {
					++var0.field1074;
					if (var0.field1031 < var2.field1839.length && var0.field1074 > var2.field1850[var0.field1031]) {
						var0.field1074 = 1;
						++var0.field1031;
						Client.method194(var2, var0.field1031, var0.field1061, var0.field1032);
					}

					if (var0.field1031 >= var2.field1839.length) {
						if (var2.field1843 > 0) {
							var0.field1031 -= var2.field1843;
							if (var2.field1851) {
								++var0.field1075;
							}

							if (var0.field1031 < 0 || var0.field1031 >= var2.field1839.length || var2.field1851 && var0.field1075 >= var2.field1832) {
								var0.field1074 = 0;
								var0.field1031 = 0;
								var0.field1075 = 0;
							}
						} else {
							var0.field1074 = 0;
							var0.field1031 = 0;
						}

						Client.method194(var2, var0.field1031, var0.field1061, var0.field1032);
					}
				} else if (var2.method1148()) {
					++var0.field1031;
					int var3 = var2.method1145();
					if (var0.field1031 < var3) {
						Client.method202(var2, var0.field1031, var0.field1061, var0.field1032);
					} else {
						if (var2.field1843 > 0) {
							var0.field1031 -= var2.field1843;
							if (var2.field1851) {
								++var0.field1075;
							}

							if (var0.field1031 < 0 || var0.field1031 >= var3 || var2.field1851 && var0.field1075 >= var2.field1832) {
								var0.field1031 = 0;
								var0.field1074 = 0;
								var0.field1075 = 0;
							}
						} else {
							var0.field1074 = 0;
							var0.field1031 = 0;
						}

						Client.method202(var2, var0.field1031, var0.field1061, var0.field1032);
					}
				} else {
					var0.field1044 = -1;
				}
			} else {
				var0.field1044 = -1;
			}
		}

		class234 var7 = new class234(var0.method638());

		int var4;
		for (class493 var8 = (class493)var7.method1233(); null != var8; var8 = (class493)var7.next()) {
			if (var8.field4009 != -1 && Client.field330 >= var8.field4008) {
				var4 = class460.method2393(var8.field4009).field3734;
				if (var4 == -1) {
					var8.method907();
					--var0.field1082;
				} else {
					var8.field4006 = Math.max(var8.field4006, 0);
					class202 var5 = class202.method1149(var4);
					if (null != var5.field1839 && !var5.method1148()) {
						++var8.field4005;
						if (var8.field4006 < var5.field1839.length && var8.field4005 > var5.field1850[var8.field4006]) {
							var8.field4005 = 1;
							++var8.field4006;
							Client.method194(var5, var8.field4006, var0.field1061, var0.field1032);
						}

						if (var8.field4006 >= var5.field1839.length) {
							var8.method907();
							--var0.field1082;
						}
					} else if (var5.method1148()) {
						++var8.field4006;
						int var6 = var5.method1145();
						if (var8.field4006 < var6) {
							Client.method202(var5, var8.field4006, var0.field1061, var0.field1032);
						} else {
							var8.method907();
							--var0.field1082;
						}
					} else {
						var8.method907();
						--var0.field1082;
					}
				}
			}
		}

		class202 var9;
		if (var0.field1076 != -1 && var0.field1093 <= 1) {
			var9 = class202.method1149(var0.field1076);
			if (var9.field1852 == 1 && var0.field1095 > 0 && var0.field1087 <= Client.field330 && var0.field1088 < Client.field330) {
				var0.field1093 = 1;
				return;
			}
		}

		if (var0.field1076 != -1 && var0.field1093 == 0) {
			var9 = class202.method1149(var0.field1076);
			if (var9 != null) {
				if (!var9.method1148() && var9.field1839 != null) {
					++var0.field1078;
					if (var0.field1077 < var9.field1839.length && var0.field1078 > var9.field1850[var0.field1077]) {
						var0.field1078 = 1;
						++var0.field1077;
						Client.method194(var9, var0.field1077, var0.field1061, var0.field1032);
					}

					if (var0.field1077 >= var9.field1839.length) {
						var0.field1077 -= var9.field1843;
						++var0.field1058;
						if (var0.field1058 >= var9.field1832) {
							var0.field1076 = -1;
						} else if (var0.field1077 >= 0 && var0.field1077 < var9.field1839.length) {
							Client.method194(var9, var0.field1077, var0.field1061, var0.field1032);
						} else {
							var0.field1076 = -1;
						}
					}

					var0.field1039 = var9.field1846;
				} else if (var9.method1148()) {
					++var0.field1077;
					var4 = var9.method1145();
					if (var0.field1077 < var4) {
						Client.method202(var9, var0.field1077, var0.field1061, var0.field1032);
					} else {
						var0.field1077 -= var9.field1843;
						++var0.field1058;
						if (var0.field1058 >= var9.field1832) {
							var0.field1076 = -1;
						} else if (var0.field1077 >= 0 && var0.field1077 < var4) {
							Client.method202(var9, var0.field1077, var0.field1061, var0.field1032);
						} else {
							var0.field1076 = -1;
						}
					}
				} else {
					var0.field1076 = -1;
				}
			} else {
				var0.field1076 = -1;
			}
		}

		if (var0.field1093 > 0) {
			--var0.field1093;
		}

	}
}
