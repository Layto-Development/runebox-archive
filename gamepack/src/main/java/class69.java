public class class69 extends class268 {
	final boolean field811;

	public class69(boolean var1) {
		this.field811 = var1;
	}

	int method500(class304 var1, class304 var2) {
		if (var1.field2769 == Client.field3) {
			if (Client.field3 != var2.field2769) {
				return this.field811 ? -1 : 1;
			}
		} else if (Client.field3 == var2.field2769) {
			return this.field811 ? 1 : -1;
		}

		return this.method1568(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method500((class304)var1, (class304)var2);
	}

	static void method501() {
		synchronized(class146.field1386) {
			if (class146.field1384 == 0) {
				class527.field4254 = new Thread(new class146());
				class527.field4254.setDaemon(true);
				class527.field4254.start();
				class527.field4254.setPriority(5);
			}

			class146.field1384 = 600;
			class146.field1387 = false;
		}
	}

	static final void method502(class347 var0, int var1) {
		int var3 = var0.field527;
		class481.field4091 = 0;
		int var4 = 0;
		var0.method1905();

		byte[] var10000;
		int var5;
		int var6;
		int var7;
		for (var5 = 0; var5 < class481.field4085; ++var5) {
			var6 = class481.field4086[var5];
			if ((class481.field4092[var6] & 1) == 0) {
				if (var4 > 0) {
					--var4;
					var10000 = class481.field4092;
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var7 = var0.method1903(1);
					if (var7 == 0) {
						var4 = class4.method51(var0);
						var10000 = class481.field4092;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						class215.method1240(var0, var6);
					}
				}
			}
		}

		var0.method1906();
		if (var4 != 0) {
			throw new RuntimeException();
		} else {
			var0.method1905();

			for (var5 = 0; var5 < class481.field4085; ++var5) {
				var6 = class481.field4086[var5];
				if ((class481.field4092[var6] & 1) != 0) {
					if (var4 > 0) {
						--var4;
						var10000 = class481.field4092;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var7 = var0.method1903(1);
						if (var7 == 0) {
							var4 = class4.method51(var0);
							var10000 = class481.field4092;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							class215.method1240(var0, var6);
						}
					}
				}
			}

			var0.method1906();
			if (var4 != 0) {
				throw new RuntimeException();
			} else {
				var0.method1905();

				for (var5 = 0; var5 < class481.field4087; ++var5) {
					var6 = class481.field4094[var5];
					if ((class481.field4092[var6] & 1) != 0) {
						if (var4 > 0) {
							--var4;
							var10000 = class481.field4092;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var7 = var0.method1903(1);
							if (var7 == 0) {
								var4 = class4.method51(var0);
								var10000 = class481.field4092;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (class404.method2092(var0, var6)) {
								var10000 = class481.field4092;
								var10000[var6] = (byte)(var10000[var6] | 2);
							}
						}
					}
				}

				var0.method1906();
				if (var4 != 0) {
					throw new RuntimeException();
				} else {
					var0.method1905();

					for (var5 = 0; var5 < class481.field4087; ++var5) {
						var6 = class481.field4094[var5];
						if ((class481.field4092[var6] & 1) == 0) {
							if (var4 > 0) {
								--var4;
								var10000 = class481.field4092;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var7 = var0.method1903(1);
								if (var7 == 0) {
									var4 = class4.method51(var0);
									var10000 = class481.field4092;
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (class404.method2092(var0, var6)) {
									var10000 = class481.field4092;
									var10000[var6] = (byte)(var10000[var6] | 2);
								}
							}
						}
					}

					var0.method1906();
					if (var4 != 0) {
						throw new RuntimeException();
					} else {
						class481.field4085 = 0;
						class481.field4087 = 0;

						for (var5 = 1; var5 < 2048; ++var5) {
							var10000 = class481.field4092;
							var10000[var5] = (byte)(var10000[var5] >> 1);
							class287 var8 = Client.field176[var5];
							if (var8 != null) {
								class481.field4086[++class481.field4085 - 1] = var5;
							} else {
								class481.field4094[++class481.field4087 - 1] = var5;
							}
						}

						class122.method757(var0);
						if (var1 != var0.field527 - var3) {
							throw new RuntimeException(var0.field527 - var3 + " " + var1);
						}
					}
				}
			}
		}
	}

	static final void method503(String var0) {
		class184.method1019(30, "", var0);
	}

	static final int method505(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	static final void method504(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.field116) {
			if (Client.field152 < 500) {
				Client.field158[Client.field152] = var0;
				Client.field277[Client.field152] = var1;
				Client.field196[Client.field152] = var2;
				Client.field156[Client.field152] = var3;
				Client.field153[Client.field152] = var4;
				Client.field154[Client.field152] = var5;
				Client.field157[Client.field152] = var6;
				Client.field160[Client.field152] = var7;
				++Client.field152;
			}

		}
	}
}
