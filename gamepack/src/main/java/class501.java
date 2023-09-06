import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class class501 implements ThreadFactory {
	// $FF: synthetic field
	final class57 this$0;
	final ThreadGroup field4160;
	final AtomicInteger field4159;

	class501(class57 var1) {
		this.this$0 = var1;
		this.field4159 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field4160 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field4160, var1, this.this$0.field613 + "-rest-request-" + this.field4159.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	public static int method2419(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var2 + var0;
	}

	static int method2418(int var0, class167 var1, boolean var2) {
		if (var0 == 3600) {
			if (class316.field2827.field1924 == 0) {
				class139.field1344[++class203.field1903 - 1] = -2;
			} else if (class316.field2827.field1924 == 1) {
				class139.field1344[++class203.field1903 - 1] = -1;
			} else {
				class139.field1344[++class203.field1903 - 1] = class316.field2827.field1926.method1724();
			}

			return 1;
		} else {
			int var4;
			if (var0 == 3601) {
				var4 = class139.field1344[--class203.field1903];
				if (class316.field2827.method1159() && var4 >= 0 && var4 < class316.field2827.field1926.method1724()) {
					class9 var9 = (class9)class316.field2827.field1926.method1711(var4);
					class139.field1331[++class429.field3529 - 1] = var9.method509();
					class139.field1331[++class429.field3529 - 1] = var9.method510();
				} else {
					class139.field1331[++class429.field3529 - 1] = "";
					class139.field1331[++class429.field3529 - 1] = "";
				}

				return 1;
			} else if (var0 == 3602) {
				var4 = class139.field1344[--class203.field1903];
				if (class316.field2827.method1159() && var4 >= 0 && var4 < class316.field2827.field1926.method1724()) {
					class139.field1344[++class203.field1903 - 1] = ((class304)class316.field2827.field1926.method1711(var4)).field2769;
				} else {
					class139.field1344[++class203.field1903 - 1] = 0;
				}

				return 1;
			} else if (var0 == 3603) {
				var4 = class139.field1344[--class203.field1903];
				if (class316.field2827.method1159() && var4 >= 0 && var4 < class316.field2827.field1926.method1724()) {
					class139.field1344[++class203.field1903 - 1] = ((class304)class316.field2827.field1926.method1711(var4)).field2770;
				} else {
					class139.field1344[++class203.field1903 - 1] = 0;
				}

				return 1;
			} else {
				String var10;
				if (var0 == 3604) {
					var10 = class139.field1331[--class429.field3529];
					int var8 = class139.field1344[--class203.field1903];
					class241.method1383(var10, var8);
					return 1;
				} else if (var0 == 3605) {
					var10 = class139.field1331[--class429.field3529];
					class316.field2827.method1165(var10);
					return 1;
				} else if (var0 == 3606) {
					var10 = class139.field1331[--class429.field3529];
					class316.field2827.method1168(var10);
					return 1;
				} else if (var0 == 3607) {
					var10 = class139.field1331[--class429.field3529];
					class316.field2827.method1167(var10);
					return 1;
				} else if (var0 == 3608) {
					var10 = class139.field1331[--class429.field3529];
					boolean var7 = true;
					class316.field2827.method1169(var10, var7);
					return 1;
				} else if (var0 == 3609) {
					var10 = class139.field1331[--class429.field3529];
					var10 = class30.method214(var10);
					class139.field1344[++class203.field1903 - 1] = class316.field2827.method1163(new class440(var10, class168.field1640), false) ? 1 : 0;
					return 1;
				} else if (var0 == 3611) {
					if (class141.field1358 != null) {
						class139.field1331[++class429.field3529 - 1] = class141.field1358.field1319;
					} else {
						class139.field1331[++class429.field3529 - 1] = "";
					}

					return 1;
				} else if (var0 == 3612) {
					if (class141.field1358 != null) {
						class139.field1344[++class203.field1903 - 1] = class141.field1358.method1724();
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3613) {
					var4 = class139.field1344[--class203.field1903];
					if (class141.field1358 != null && var4 < class141.field1358.method1724()) {
						class139.field1331[++class429.field3529 - 1] = class141.field1358.method1711(var4).method508().method2214();
					} else {
						class139.field1331[++class429.field3529 - 1] = "";
					}

					return 1;
				} else if (var0 == 3614) {
					var4 = class139.field1344[--class203.field1903];
					if (class141.field1358 != null && var4 < class141.field1358.method1724()) {
						class139.field1344[++class203.field1903 - 1] = ((class304)class141.field1358.method1711(var4)).method1729();
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3615) {
					var4 = class139.field1344[--class203.field1903];
					if (class141.field1358 != null && var4 < class141.field1358.method1724()) {
						class139.field1344[++class203.field1903 - 1] = ((class304)class141.field1358.method1711(var4)).field2770;
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3616) {
					class139.field1344[++class203.field1903 - 1] = class141.field1358 != null ? class141.field1358.field1323 : 0;
					return 1;
				} else if (var0 == 3617) {
					var10 = class139.field1331[--class429.field3529];
					class109.method685(var10);
					return 1;
				} else if (var0 == 3618) {
					class139.field1344[++class203.field1903 - 1] = class141.field1358 != null ? class141.field1358.field1324 : 0;
					return 1;
				} else if (var0 == 3619) {
					var10 = class139.field1331[--class429.field3529];
					class296.method1688(var10);
					return 1;
				} else if (var0 == 3620) {
					class287.method1630();
					return 1;
				} else if (var0 == 3621) {
					if (!class316.field2827.method1159()) {
						class139.field1344[++class203.field1903 - 1] = -1;
					} else {
						class139.field1344[++class203.field1903 - 1] = class316.field2827.field1925.method1724();
					}

					return 1;
				} else if (var0 == 3622) {
					var4 = class139.field1344[--class203.field1903];
					if (class316.field2827.method1159() && var4 >= 0 && var4 < class316.field2827.field1925.method1724()) {
						class350 var5 = (class350)class316.field2827.field1925.method1711(var4);
						class139.field1331[++class429.field3529 - 1] = var5.method509();
						class139.field1331[++class429.field3529 - 1] = var5.method510();
					} else {
						class139.field1331[++class429.field3529 - 1] = "";
						class139.field1331[++class429.field3529 - 1] = "";
					}

					return 1;
				} else if (var0 == 3623) {
					var10 = class139.field1331[--class429.field3529];
					var10 = class30.method214(var10);
					class139.field1344[++class203.field1903 - 1] = class316.field2827.method1164(new class440(var10, class168.field1640)) ? 1 : 0;
					return 1;
				} else if (var0 == 3624) {
					var4 = class139.field1344[--class203.field1903];
					if (null != class141.field1358 && var4 < class141.field1358.method1724() && class141.field1358.method1711(var4).method508().equals(class82.field863.field2539)) {
						class139.field1344[++class203.field1903 - 1] = 1;
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else if (var0 == 3625) {
					if (null != class141.field1358 && null != class141.field1358.field1322) {
						class139.field1331[++class429.field3529 - 1] = class141.field1358.field1322;
					} else {
						class139.field1331[++class429.field3529 - 1] = "";
					}

					return 1;
				} else if (var0 == 3626) {
					var4 = class139.field1344[--class203.field1903];
					if (null != class141.field1358 && var4 < class141.field1358.method1724() && ((class166)class141.field1358.method1711(var4)).method917()) {
						class139.field1344[++class203.field1903 - 1] = 1;
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				} else if (var0 != 3627) {
					if (var0 == 3628) {
						class316.field2827.field1926.method1723();
						return 1;
					} else {
						boolean var6;
						if (var0 == 3629) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class204(var6));
							return 1;
						} else if (var0 == 3630) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class3(var6));
							return 1;
						} else if (var0 == 3631) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class456(var6));
							return 1;
						} else if (var0 == 3632) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class293(var6));
							return 1;
						} else if (var0 == 3633) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class51(var6));
							return 1;
						} else if (var0 == 3634) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class73(var6));
							return 1;
						} else if (var0 == 3635) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class261(var6));
							return 1;
						} else if (var0 == 3636) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class69(var6));
							return 1;
						} else if (var0 == 3637) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class521(var6));
							return 1;
						} else if (var0 == 3638) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class175(var6));
							return 1;
						} else if (var0 == 3639) {
							class316.field2827.field1926.method1725();
							return 1;
						} else if (var0 == 3640) {
							class316.field2827.field1925.method1723();
							return 1;
						} else if (var0 == 3641) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1925.method1716(new class204(var6));
							return 1;
						} else if (var0 == 3642) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1925.method1716(new class3(var6));
							return 1;
						} else if (var0 == 3643) {
							class316.field2827.field1925.method1725();
							return 1;
						} else if (var0 == 3644) {
							if (null != class141.field1358) {
								class141.field1358.method1723();
							}

							return 1;
						} else if (var0 == 3645) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (null != class141.field1358) {
								class141.field1358.method1716(new class204(var6));
							}

							return 1;
						} else if (var0 == 3646) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (null != class141.field1358) {
								class141.field1358.method1716(new class3(var6));
							}

							return 1;
						} else if (var0 == 3647) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class456(var6));
							}

							return 1;
						} else if (var0 == 3648) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class293(var6));
							}

							return 1;
						} else if (var0 == 3649) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class51(var6));
							}

							return 1;
						} else if (var0 == 3650) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class73(var6));
							}

							return 1;
						} else if (var0 == 3651) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (null != class141.field1358) {
								class141.field1358.method1716(new class261(var6));
							}

							return 1;
						} else if (var0 == 3652) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class69(var6));
							}

							return 1;
						} else if (var0 == 3653) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (null != class141.field1358) {
								class141.field1358.method1716(new class521(var6));
							}

							return 1;
						} else if (var0 == 3654) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class175(var6));
							}

							return 1;
						} else if (var0 == 3655) {
							if (null != class141.field1358) {
								class141.field1358.method1725();
							}

							return 1;
						} else if (var0 == 3656) {
							var6 = class139.field1344[--class203.field1903] == 1;
							class316.field2827.field1926.method1716(new class219(var6));
							return 1;
						} else if (var0 == 3657) {
							var6 = class139.field1344[--class203.field1903] == 1;
							if (class141.field1358 != null) {
								class141.field1358.method1716(new class219(var6));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = class139.field1344[--class203.field1903];
					if (class141.field1358 != null && var4 < class141.field1358.method1724() && ((class166)class141.field1358.method1711(var4)).method918()) {
						class139.field1344[++class203.field1903 - 1] = 1;
					} else {
						class139.field1344[++class203.field1903 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
