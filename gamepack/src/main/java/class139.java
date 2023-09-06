import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import netscape.javascript.JSObject;

public class class139 {
	static boolean field1339;
	static boolean field1345;
	static class161[] field1334;
	static int field1336;
	static int field1342;
	static int[] field1333;
	static int[] field1340;
	static int[] field1344;
	static int[][] field1335;
	static String[] field1331;
	static String[] field1332;
	static ArrayList field1341;
	static Calendar field1337;
	static final double field1343;
	static final String[] field1338;

	static {
		field1333 = new int[5];
		field1335 = new int[5][5000];
		field1344 = new int[1000];
		field1331 = new String[1000];
		field1336 = 0;
		field1334 = new class161[50];
		field1337 = Calendar.getInstance();
		field1338 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field1345 = false;
		field1339 = false;
		field1341 = new ArrayList();
		field1342 = 0;
		field1343 = Math.log(2.0D);
	}

	class139() throws Throwable {
	}

	public static int method836(int var0) {
		long var3 = class277.field2462[var0];
		int var2 = (int)(var3 >>> 0 & 127L);
		return var2;
	}

	static byte[] method833(String var0) {
		boolean var2 = true;
		boolean var3 = true;
		int var4 = class433.field3743.length();
		int var5 = 0;
		byte[] var6 = new byte[8];

		while (true) {
			int var7 = var5 + var4;
			if (var7 >= var0.length()) {
				return null;
			}

			char var8 = var0.charAt(var7);
			if (var8 == ':') {
				if (var5 == 0) {
					return null;
				}

				byte[] var9 = new byte[var5];
				System.arraycopy(var6, 0, var9, 0, var5);
				return var9;
			}

			if (var6.length == var5) {
				return null;
			}

			if (var8 >= '0' && var8 <= '9') {
				var8 = (char)(var8 - '0');
			} else {
				if (var8 < 'a' || var8 > 'z') {
					return null;
				}

				var8 = (char)(var8 - 'W');
			}

			var6[var5++] = (byte)var8;
		}
	}

	static int method834(int var0, class167 var1, boolean var2) {
		if (var0 == 5630) {
			Client.field56 = 250;
			return 1;
		} else {
			return 2;
		}
	}

	static int method835(int var0, class167 var1, boolean var2) {
		int var4;
		if (var0 == 6600) {
			var4 = class358.field3038;
			int var17 = class296.field2735 + (class82.field863.field1555 >> 7);
			int var13 = (class82.field863.field1526 >> 7) + class164.field1606;
			class54.method398().method1085(var4, var17, var13, true);
			return 1;
		} else {
			class8 var8;
			if (var0 == 6601) {
				var4 = field1344[--class203.field1903];
				String var16 = "";
				var8 = class54.method398().method1124(var4);
				if (var8 != null) {
					var16 = var8.method71();
				}

				field1331[++class429.field3529 - 1] = var16;
				return 1;
			} else if (var0 == 6602) {
				var4 = field1344[--class203.field1903];
				class54.method398().method1089(var4);
				return 1;
			} else if (var0 == 6603) {
				field1344[++class203.field1903 - 1] = class54.method398().method1100();
				return 1;
			} else if (var0 == 6604) {
				var4 = field1344[--class203.field1903];
				class54.method398().method1098(var4);
				return 1;
			} else if (var0 == 6605) {
				field1344[++class203.field1903 - 1] = class54.method398().method1130() ? 1 : 0;
				return 1;
			} else {
				class29 var15;
				if (var0 == 6606) {
					var15 = new class29(field1344[--class203.field1903]);
					class54.method398().method1102(var15.field460, var15.field462);
					return 1;
				} else if (var0 == 6607) {
					var15 = new class29(field1344[--class203.field1903]);
					class54.method398().method1103(var15.field460, var15.field462);
					return 1;
				} else if (var0 == 6608) {
					var15 = new class29(field1344[--class203.field1903]);
					class54.method398().method1104(var15.field461, var15.field460, var15.field462);
					return 1;
				} else if (var0 == 6609) {
					var15 = new class29(field1344[--class203.field1903]);
					class54.method398().method1105(var15.field461, var15.field460, var15.field462);
					return 1;
				} else if (var0 == 6610) {
					field1344[++class203.field1903 - 1] = class54.method398().method1106();
					field1344[++class203.field1903 - 1] = class54.method398().method1129();
					return 1;
				} else {
					class8 var12;
					if (var0 == 6611) {
						var4 = field1344[--class203.field1903];
						var12 = class54.method398().method1124(var4);
						if (var12 == null) {
							field1344[++class203.field1903 - 1] = 0;
						} else {
							field1344[++class203.field1903 - 1] = var12.method80().method213();
						}

						return 1;
					} else if (var0 == 6612) {
						var4 = field1344[--class203.field1903];
						var12 = class54.method398().method1124(var4);
						if (null == var12) {
							field1344[++class203.field1903 - 1] = 0;
							field1344[++class203.field1903 - 1] = 0;
						} else {
							field1344[++class203.field1903 - 1] = (var12.method87() - var12.method74() + 1) * 64;
							field1344[++class203.field1903 - 1] = (var12.method82() - var12.method84() + 1) * 64;
						}

						return 1;
					} else if (var0 == 6613) {
						var4 = field1344[--class203.field1903];
						var12 = class54.method398().method1124(var4);
						if (var12 == null) {
							field1344[++class203.field1903 - 1] = 0;
							field1344[++class203.field1903 - 1] = 0;
							field1344[++class203.field1903 - 1] = 0;
							field1344[++class203.field1903 - 1] = 0;
						} else {
							field1344[++class203.field1903 - 1] = var12.method74() * 64;
							field1344[++class203.field1903 - 1] = var12.method84() * 64;
							field1344[++class203.field1903 - 1] = var12.method87() * 64 + 64 - 1;
							field1344[++class203.field1903 - 1] = var12.method82() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == 6614) {
						var4 = field1344[--class203.field1903];
						var12 = class54.method398().method1124(var4);
						if (null == var12) {
							field1344[++class203.field1903 - 1] = -1;
						} else {
							field1344[++class203.field1903 - 1] = var12.method73();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = class54.method398().method1086();
						if (null == var15) {
							field1344[++class203.field1903 - 1] = -1;
							field1344[++class203.field1903 - 1] = -1;
						} else {
							field1344[++class203.field1903 - 1] = var15.field460;
							field1344[++class203.field1903 - 1] = var15.field462;
						}

						return 1;
					} else if (var0 == 6616) {
						field1344[++class203.field1903 - 1] = class54.method398().method1090();
						return 1;
					} else if (var0 == 6617) {
						var15 = new class29(field1344[--class203.field1903]);
						var12 = class54.method398().method1091();
						if (null == var12) {
							field1344[++class203.field1903 - 1] = -1;
							field1344[++class203.field1903 - 1] = -1;
							return 1;
						} else {
							int[] var11 = var12.method81(var15.field461, var15.field460, var15.field462);
							if (var11 == null) {
								field1344[++class203.field1903 - 1] = -1;
								field1344[++class203.field1903 - 1] = -1;
							} else {
								field1344[++class203.field1903 - 1] = var11[0];
								field1344[++class203.field1903 - 1] = var11[1];
							}

							return 1;
						}
					} else {
						class29 var6;
						if (var0 == 6618) {
							var15 = new class29(field1344[--class203.field1903]);
							var12 = class54.method398().method1091();
							if (var12 == null) {
								field1344[++class203.field1903 - 1] = -1;
								field1344[++class203.field1903 - 1] = -1;
								return 1;
							} else {
								var6 = var12.method68(var15.field460, var15.field462);
								if (var6 == null) {
									field1344[++class203.field1903 - 1] = -1;
								} else {
									field1344[++class203.field1903 - 1] = var6.method213();
								}

								return 1;
							}
						} else {
							class29 var9;
							if (var0 == 6619) {
								class203.field1903 -= 2;
								var4 = field1344[class203.field1903];
								var9 = new class29(field1344[1 + class203.field1903]);
								class539.method2585(var4, var9, false);
								return 1;
							} else if (var0 == 6620) {
								class203.field1903 -= 2;
								var4 = field1344[class203.field1903];
								var9 = new class29(field1344[1 + class203.field1903]);
								class539.method2585(var4, var9, true);
								return 1;
							} else if (var0 == 6621) {
								class203.field1903 -= 2;
								var4 = field1344[class203.field1903];
								var9 = new class29(field1344[class203.field1903 + 1]);
								var8 = class54.method398().method1124(var4);
								if (null == var8) {
									field1344[++class203.field1903 - 1] = 0;
									return 1;
								} else {
									field1344[++class203.field1903 - 1] = var8.method67(var9.field461, var9.field460, var9.field462) ? 1 : 0;
									return 1;
								}
							} else if (var0 == 6622) {
								field1344[++class203.field1903 - 1] = class54.method398().method1108();
								field1344[++class203.field1903 - 1] = class54.method398().method1109();
								return 1;
							} else if (var0 == 6623) {
								var15 = new class29(field1344[--class203.field1903]);
								var12 = class54.method398().method1087(var15.field461, var15.field460, var15.field462);
								if (null == var12) {
									field1344[++class203.field1903 - 1] = -1;
								} else {
									field1344[++class203.field1903 - 1] = var12.method77();
								}

								return 1;
							} else if (var0 == 6624) {
								class54.method398().method1110(field1344[--class203.field1903]);
								return 1;
							} else if (var0 == 6625) {
								class54.method398().method1111();
								return 1;
							} else if (var0 == 6626) {
								class54.method398().method1112(field1344[--class203.field1903]);
								return 1;
							} else if (var0 == 6627) {
								class54.method398().method1113();
								return 1;
							} else {
								boolean var14;
								if (var0 == 6628) {
									var14 = field1344[--class203.field1903] == 1;
									class54.method398().method1114(var14);
									return 1;
								} else if (var0 == 6629) {
									var4 = field1344[--class203.field1903];
									class54.method398().method1096(var4);
									return 1;
								} else if (var0 == 6630) {
									var4 = field1344[--class203.field1903];
									class54.method398().method1115(var4);
									return 1;
								} else if (var0 == 6631) {
									class54.method398().method1116();
									return 1;
								} else if (var0 == 6632) {
									var14 = field1344[--class203.field1903] == 1;
									class54.method398().method1117(var14);
									return 1;
								} else {
									boolean var10;
									if (var0 == 6633) {
										class203.field1903 -= 2;
										var4 = field1344[class203.field1903];
										var10 = field1344[class203.field1903 + 1] == 1;
										class54.method398().method1125(var4, var10);
										return 1;
									} else if (var0 == 6634) {
										class203.field1903 -= 2;
										var4 = field1344[class203.field1903];
										var10 = field1344[class203.field1903 + 1] == 1;
										class54.method398().method1088(var4, var10);
										return 1;
									} else if (var0 == 6635) {
										field1344[++class203.field1903 - 1] = class54.method398().method1118() ? 1 : 0;
										return 1;
									} else if (var0 == 6636) {
										var4 = field1344[--class203.field1903];
										field1344[++class203.field1903 - 1] = class54.method398().method1134(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6637) {
										var4 = field1344[--class203.field1903];
										field1344[++class203.field1903 - 1] = class54.method398().method1119(var4) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class203.field1903 -= 2;
										var4 = field1344[class203.field1903];
										var9 = new class29(field1344[1 + class203.field1903]);
										var6 = class54.method398().method1122(var4, var9);
										if (null == var6) {
											field1344[++class203.field1903 - 1] = -1;
										} else {
											field1344[++class203.field1903 - 1] = var6.method213();
										}

										return 1;
									} else {
										class217 var7;
										if (var0 == 6639) {
											var7 = class54.method398().method1081();
											if (null == var7) {
												field1344[++class203.field1903 - 1] = -1;
												field1344[++class203.field1903 - 1] = -1;
											} else {
												field1344[++class203.field1903 - 1] = var7.method1244();
												field1344[++class203.field1903 - 1] = var7.field2025.method213();
											}

											return 1;
										} else if (var0 == 6640) {
											var7 = class54.method398().method1123();
											if (null == var7) {
												field1344[++class203.field1903 - 1] = -1;
												field1344[++class203.field1903 - 1] = -1;
											} else {
												field1344[++class203.field1903 - 1] = var7.method1244();
												field1344[++class203.field1903 - 1] = var7.field2025.method213();
											}

											return 1;
										} else {
											class96 var5;
											if (var0 == 6693) {
												var4 = field1344[--class203.field1903];
												var5 = class158.method892(var4);
												if (null == var5.field963) {
													field1331[++class429.field3529 - 1] = "";
												} else {
													field1331[++class429.field3529 - 1] = var5.field963;
												}

												return 1;
											} else if (var0 == 6694) {
												var4 = field1344[--class203.field1903];
												var5 = class158.method892(var4);
												field1344[++class203.field1903 - 1] = var5.field965;
												return 1;
											} else if (var0 == 6695) {
												var4 = field1344[--class203.field1903];
												var5 = class158.method892(var4);
												if (var5 == null) {
													field1344[++class203.field1903 - 1] = -1;
												} else {
													field1344[++class203.field1903 - 1] = var5.field978;
												}

												return 1;
											} else if (var0 == 6696) {
												var4 = field1344[--class203.field1903];
												var5 = class158.method892(var4);
												if (var5 == null) {
													field1344[++class203.field1903 - 1] = -1;
												} else {
													field1344[++class203.field1903 - 1] = var5.field961;
												}

												return 1;
											} else if (var0 == 6697) {
												field1344[++class203.field1903 - 1] = class35.field498.field1067;
												return 1;
											} else if (var0 == 6698) {
												field1344[++class203.field1903 - 1] = class35.field498.field1065.method213();
												return 1;
											} else if (var0 == 6699) {
												field1344[++class203.field1903 - 1] = class35.field498.field1066.method213();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method837(String var0) {
		class354.field3029 = var0;

		try {
			String var2 = class466.field3999.getParameter(Integer.toString(18));
			String var3 = class466.field3999.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			String var6;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var5 = var4 + "; Expires=";
				long var7 = class172.method977() + 94608000000L;
				class406.field3396.setTime(new Date(var7));
				int var9 = class406.field3396.get(7);
				int var10 = class406.field3396.get(5);
				int var11 = class406.field3396.get(2);
				int var12 = class406.field3396.get(1);
				int var13 = class406.field3396.get(11);
				int var14 = class406.field3396.get(12);
				int var15 = class406.field3396.get(13);
				var6 = class406.field3395[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class406.field3397[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
				var4 = var5 + var6 + "; Max-Age=" + 94608000L;
			}

			Client var17 = class466.field3999;
			var6 = "document.cookie=\"" + var4 + "\"";
			JSObject.getWindow(var17).eval(var6);
		} catch (Throwable var16) {
		}

	}
}
