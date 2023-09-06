public class class283 extends class303 {
	int field2512;
	final class392 field2511;
	public class473 field2510;

	public class283(class392 var1) {
		super(400);
		this.field2512 = 1;
		this.field2510 = new class473();
		this.field2511 = var1;
	}

	class71 method1721() {
		return new class9();
	}

	class71[] method1715(int var1) {
		return new class9[var1];
	}

	public boolean method1610(class440 var1, boolean var2) {
		class9 var4 = (class9)this.method1705(var1);
		if (null == var4) {
			return false;
		} else {
			return !var2 || var4.field2769 != 0;
		}
	}

	public void method1611(class42 var1, int var2, byte var3) {
		while (var1.field527 < var2) {
			if (var3 != -1) {
				throw new IllegalStateException();
			}

			boolean var10000;
			if (var1.method278() == 1) {
				if (var3 != -1) {
					return;
				}

				var10000 = true;
			} else {
				var10000 = false;
			}

			boolean var4 = var10000;
			class440 var5 = new class440(var1.method286(), this.field2511);
			class440 var6 = new class440(var1.method286(), this.field2511);
			int var7 = var1.method327();
			int var8 = var1.method278();
			int var9 = var1.method278();
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

				var1.method286();
				var1.method278();
				var1.method282();
			}

			var1.method286();
			if (var5 != null) {
				if (var3 != -1) {
					throw new IllegalStateException();
				}

				if (var5.method2215()) {
					class9 var12 = (class9)this.method1706(var5);
					if (var4) {
						if (var3 != -1) {
							throw new IllegalStateException();
						}

						class9 var13 = (class9)this.method1706(var6);
						if (var13 != null) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							if (var13 != var12) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								if (var12 != null) {
									this.method1707(var13);
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

						this.method1710(var12, var5, var6);
						if (var12.field2769 != var7) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							boolean var15 = true;

							for (class314 var14 = (class314)this.field2510.method2292(); null != var14; var14 = (class314)this.field2510.method2291()) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								if (var14.field2819.equals(var5)) {
									if (var3 != -1) {
										throw new IllegalStateException();
									}

									if (var7 != 0) {
										if (var3 != -1) {
											throw new IllegalStateException();
										}

										if (var14.field2820 == 0) {
											if (var3 != -1) {
												throw new IllegalStateException();
											}

											var14.method2560();
											var15 = false;
											continue;
										}
									}

									if (var7 == 0) {
										if (var3 != -1) {
											throw new IllegalStateException();
										}

										if (var14.field2820 != 0) {
											if (var3 != -1) {
												throw new IllegalStateException();
											}

											var14.method2560();
											var15 = false;
										}
									}
								}
							}

							if (var15) {
								this.field2510.method2290(new class314(var5, var7));
							}
						}
					} else {
						if (this.method1724() >= 400) {
							continue;
						}

						if (var3 != -1) {
							throw new IllegalStateException();
						}

						var12 = (class9)this.method1708(var5, var6);
					}

					if (var7 != var12.field2769) {
						if (var3 != -1) {
							return;
						}

						var12.field2768 = ++this.field2512 - 1;
						if (var12.field2769 == -1) {
							if (var3 != -1) {
								throw new IllegalStateException();
							}

							if (var7 == 0) {
								if (var3 != -1) {
									throw new IllegalStateException();
								}

								var12.field2768 = -(var12.field2768 * -1297576351) * -585067103;
							}
						}

						var12.field2769 = var7;
					}

					var12.field2770 = var8;
					var12.field348 = var10;
					var12.field349 = var11;
					continue;
				}

				if (var3 != -1) {
					throw new IllegalStateException();
				}
			}

			throw new IllegalStateException();
		}

		this.method1725();
	}
}
