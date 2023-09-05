import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfInfo(name = "cy")
public class class162 {
	@ObfInfo(name = "cz", desc = "Z")
	static boolean field1525;
	@ObfInfo(name = "cc", desc = "Z")
	static boolean field1541;
	@ObfInfo(name = "dn", desc = "Z")
	static boolean field1545;
	@ObfInfo(name = "ct", desc = "Z")
	static boolean field1548;
	@ObfInfo(name = "aa", desc = "Lui;")
	static class150 field1524;
	@ObfInfo(name = "al", desc = "Luk;")
	static class398 field1519;
	@ObfInfo(name = "ac", desc = "Luk;")
	static class398 field1522;
	@ObfInfo(name = "az", desc = "Luk;")
	static class398 field1523;
	@ObfInfo(name = "at", desc = "[Luk;")
	static class398[] field1521;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 657439907)
	static int field1520;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -390756021)
	static int field1526;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -427966603)
	static int field1527;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = -1116009889)
	static int field1529;
	@ObfInfo(name = "bn", desc = "I", intMultiplier = -522212335)
	static int field1530;
	@ObfInfo(name = "cw", desc = "I", intMultiplier = 1467944731)
	static int field1531;
	@ObfInfo(name = "ce", desc = "I", intMultiplier = 931290101)
	static int field1536;
	@ObfInfo(name = "dh", desc = "I", intMultiplier = -1433824975)
	static int field1542;
	@ObfInfo(name = "dk", desc = "I", intMultiplier = 1255060069)
	static int field1546;
	@ObfInfo(name = "df", desc = "I", intMultiplier = -1818453167)
	static int field1547;
	@ObfInfo(name = "dz", desc = "I", intMultiplier = -1041331769)
	static int field1552;
	@ObfInfo(name = "aw", desc = "Ljava/lang/String;")
	static String field1528;
	@ObfInfo(name = "cn", desc = "Ljava/lang/String;")
	static String field1533;
	@ObfInfo(name = "cs", desc = "Ljava/lang/String;")
	static String field1534;
	@ObfInfo(name = "cm", desc = "Ljava/lang/String;")
	static String field1535;
	@ObfInfo(name = "cr", desc = "Ljava/lang/String;")
	static String field1537;
	@ObfInfo(name = "cu", desc = "Ljava/lang/String;")
	static String field1538;
	@ObfInfo(name = "dj", desc = "Ljava/lang/String;")
	static String field1543;
	@ObfInfo(name = "cx", desc = "Ljava/lang/String;")
	static String field1544;
	@ObfInfo(name = "di", desc = "Ljava/lang/String;")
	static String field1549;
	@ObfInfo(name = "cf", desc = "Ljava/lang/String;")
	static String field1553;
	@ObfInfo(name = "do", desc = "[Ljava/lang/String;")
	static String[] field1532;
	@ObfInfo(name = "cq", desc = "[Ljava/lang/String;")
	static String[] field1539;
	@ObfInfo(name = "db", desc = "[Ljava/lang/String;")
	static String[] field1551;
	@ObfInfo(name = "dp", desc = "[Ljava/lang/String;")
	static String[] field1554;
	@ObfInfo(name = "dv", desc = "J", longMultiplier = 5645912346148903893L)
	static long field1540;
	@ObfInfo(name = "dr", desc = "J", longMultiplier = 1131909237383043171L)
	static long field1550;

	static {
		field1520 = 0;
		field1526 = field1520 + 202;
		field1527 = 10;
		field1528 = "";
		field1529 = -1;
		field1530 = 1;
		field1531 = 0;
		field1553 = "";
		field1535 = "";
		field1533 = "";
		field1534 = "";
		field1544 = "";
		field1537 = "";
		field1536 = 0;
		field1539 = new String[8];
		field1538 = "";
		field1525 = false;
		field1548 = false;
		field1541 = true;
		field1542 = 0;
		field1543 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field1549 = "1234567890";
		field1545 = false;
		field1546 = -1;
		field1547 = 0;
		field1552 = 0;
		new DecimalFormat("##0.00");
		new class374();
		field1540 = -1L;
		field1550 = -1L;
		field1532 = new String[]{"title.jpg"};
		field1551 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field1554 = new String[]{"logo_speedrunning"};
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class162() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Lnu;Lnu;ZII)V")
	static void method938(class437 var0, class437 var1, boolean var2, int var3) {
		if (class404.field3128) {
			if (var3 == 4) {
				method924(4);
			}

		} else {
			if (var3 == 0) {
				class85.method563(var2);
			} else {
				method924(var3);
			}

			class83.method539();
			byte[] var5 = var0.method2286("title.jpg", "");
			field1524 = class499.method2495(var5);
			class238.field1988 = field1524.method849();
			int var6 = Client.field28;
			if ((var6 & class82.field864.method2222()) != 0) {
				class279.field2250 = class273.method1433(var1, "logo_deadman_mode", "");
			} else if ((var6 & class82.field865.method2222()) != 0) {
				class279.field2250 = class273.method1433(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class82.field843.method2222()) != 0) {
				class279.field2250 = class273.method1433(var1, "logo_speedrunning", "");
			} else {
				class279.field2250 = class273.method1433(var1, "logo", "");
			}

			field1522 = class273.method1433(var1, "titlebox", "");
			class51.field586 = class273.method1433(var1, "titlebutton", "");
			field1523 = class273.method1433(var1, "titlebutton_large", "");
			class23.field408 = class273.method1433(var1, "play_now_text", "");
			class273.method1433(var1, "titlebutton_wide42,1", "");
			field1521 = class273.method1435(var1, "runes", "");
			class161.field1518 = class273.method1435(var1, "title_mute", "");
			field1519 = class273.method1433(var1, "options_radio_buttons,0", "");
			class79.field833 = class273.method1433(var1, "options_radio_buttons,4", "");
			class107.field1020 = class273.method1433(var1, "options_radio_buttons,2", "");
			class263.field2125 = class273.method1433(var1, "options_radio_buttons,6", "");
			class61.field736 = field1519.field3105;
			class179.field1631 = field1519.field3106;
			class365.field2837 = new class264(field1521);
			if (var2) {
				field1544 = "";
				field1537 = "";
				field1539 = new String[8];
				field1536 = 0;
			}

			class473.field3808 = 0;
			class379.field2919 = "";
			field1541 = true;
			field1545 = false;
			if (!class281.field2262.method1765()) {
				ArrayList var7 = new ArrayList();
				var7.add(new class503(class323.field2609, "scape main", "", 255, false));
				class303.method1677(var7, 0, 0, 0, 100, false);
			} else {
				class333.method1815(0, 0);
			}

			class265.method1388();
			class77.method528().method430(false);
			class404.field3128 = true;
			field1520 = (class537.field4270 - 765) / 2;
			field1526 = 202 + field1520;
			class254.field2110 = 180 + field1526;
			field1524.method857(field1520, 0);
			class238.field1988.method857(382 + field1520, 0);
			class279.field2250.method2115(field1520 + 382 - class279.field2250.field3105 / 2, 18);
		}
	}

	@ObfInfo(name = "ae", desc = "(B)Ljava/lang/String;")
	static String method931() {
		String var1;
		if (class281.field2262.method1749()) {
			String var3 = field1544;
			String var2 = class455.method2380('*', var3.length());
			var1 = var2;
		} else {
			var1 = field1544;
		}

		return var1;
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	static void method930() {
		if (Client.field81 && field1544 != null && field1544.length() > 0) {
			field1542 = 1;
		} else {
			field1542 = 0;
		}

	}

	@ObfInfo(name = "at", desc = "(Lbm;Lpi;Lpi;I)V")
	static void method937(class346 var0, class258 var1, class258 var2) {
		int var6;
		int var28;
		int var29;
		boolean var33;
		boolean var50;
		if (field1545) {
			class320 var27 = Client.method232();

			while (true) {
				if (!var27.method1784()) {
					if (class166.field1574 != 1 && (class146.field1455 || class166.field1574 != 4)) {
						break;
					}

					int var5 = field1520 + 280;
					if (class166.field1575 >= var5 && class166.field1575 <= var5 + 14 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(0, 0);
						break;
					}

					if (class166.field1575 >= var5 + 15 && class166.field1575 <= var5 + 80 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(0, 1);
						break;
					}

					var6 = field1520 + 390;
					if (class166.field1575 >= var6 && class166.field1575 <= var6 + 14 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(1, 0);
						break;
					}

					if (class166.field1575 >= var6 + 15 && class166.field1575 <= var6 + 80 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(1, 1);
						break;
					}

					var28 = field1520 + 500;
					if (class166.field1575 >= var28 && class166.field1575 <= var28 + 14 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(2, 0);
						break;
					}

					if (class166.field1575 >= var28 + 15 && class166.field1575 <= var28 + 80 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(2, 1);
						break;
					}

					var29 = 610 + field1520;
					if (class166.field1575 >= var29 && class166.field1575 <= var29 + 14 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(3, 0);
						break;
					}

					if (class166.field1575 >= var29 + 15 && class166.field1575 <= var29 + 80 && class166.field1576 >= 4 && class166.field1576 <= 18) {
						class516.method2535(3, 1);
						break;
					}

					if (class166.field1575 >= 708 + field1520 && class166.field1576 >= 4 && class166.field1575 <= 50 + 708 + field1520 && class166.field1576 <= 20) {
						method932();
						break;
					}

					if (field1546 != -1) {
						class516 var31 = class69.field774[field1546];
						if (var31.method2519()) {
							var31.field4139 = "beta";
						}

						var50 = false;
						if (var31.field4128 != Client.field28) {
							boolean var49 = (Client.field28 & class82.field851.method2222()) != 0;
							var33 = var31.method2519();
							if (var49 && !var33 || !var49 && var33) {
								var50 = true;
							}
						}

						class515.method2516(var31);
						method932();
						if (var50) {
							Client.method270();
						}
					} else {
						if (field1547 > 0 && null != class447.field3385 && class166.field1575 >= 0 && class166.field1575 <= class447.field3385.field3105 && class166.field1576 >= class396.field3101 / 2 - 50 && class166.field1576 <= class396.field3101 / 2 + 50) {
							--field1547;
						}

						if (field1547 < field1552 && null != class188.field1714 && class166.field1575 >= class537.field4270 - class188.field1714.field3105 - 5 && class166.field1575 <= class537.field4270 && class166.field1576 >= class396.field3101 / 2 - 50 && class166.field1576 <= class396.field3101 / 2 + 50) {
							++field1547;
						}
					}
					break;
				}

				if (var27.field2601 == 13) {
					method932();
					break;
				}

				if (var27.field2601 == 96) {
					if (field1547 > 0 && null != class447.field3385) {
						--field1547;
					}
				} else if (var27.field2601 == 97 && field1547 < field1552 && null != class188.field1714) {
					++field1547;
				}
			}

		} else {
			if ((class166.field1574 == 1 || !class146.field1455 && class166.field1574 == 4) && class166.field1575 >= field1520 + 765 - 50 && class166.field1576 >= 453) {
				class281.field2262.method1764(!class281.field2262.method1765());
				if (!class281.field2262.method1765()) {
					ArrayList var4 = new ArrayList();
					var4.add(new class503(class323.field2609, "scape main", "", 255, false));
					class303.method1677(var4, 0, 0, 0, 100, false);
				} else {
					class333.method1815(0, 0);
				}

				class265.method1388();
			}

			if (Client.field111 != 5) {
				if (-1L == field1540) {
					field1540 = class43.method443() + 1000L;
				}

				long var26 = class43.method443();
				if (Client.method157() && -1L == field1550) {
					field1550 = var26;
					if (field1550 > field1540) {
						field1540 = field1550;
					}
				}

				if (Client.field111 == 10 || Client.field111 == 11) {
					if (class524.field4196 == class67.field765) {
						if (class166.field1574 == 1 || !class146.field1455 && class166.field1574 == 4) {
							var6 = 5 + field1520;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (class166.field1575 >= var6 && class166.field1575 <= var8 + var6 && class166.field1576 >= var7 && class166.field1576 <= var9 + var7) {
								if (class516.method2532()) {
									field1545 = true;
									field1547 = 0;
									field1552 = 0;
								}

								return;
							}
						}

						if (class383.field2948 != null) {
							method925();
						}
					}

					var6 = class166.field1574;
					var28 = class166.field1575;
					var29 = class166.field1576;
					if (var6 == 0) {
						var28 = class166.field1580;
						var29 = class166.field1563;
					}

					if (!class146.field1455 && var6 == 4) {
						var6 = 1;
					}

					class320 var30 = Client.method232();
					int var34;
					short var35;
					if (field1531 == 0) {
						var50 = false;

						while (var30.method1784()) {
							if (var30.field2601 == 84) {
								var50 = true;
							}
						}

						var34 = class254.field2110 - 80;
						var35 = 291;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
							class341.method1876(Client.method207("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var34 = 80 + class254.field2110;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20 || var50) {
							if ((Client.field28 & class82.field860.method2222()) != 0) {
								field1553 = "";
								field1535 = class453.field3630;
								field1533 = class453.field3621;
								field1534 = class453.field3622;
								method924(1);
								method930();
							} else if ((Client.field28 & class82.field845.method2222()) != 0) {
								if ((Client.field28 & class82.field866.method2222()) != 0) {
									field1535 = class453.field3617;
									field1533 = class453.field3618;
									field1534 = class453.field3619;
								} else {
									field1535 = class453.field3611;
									field1533 = class453.field3612;
									field1534 = class453.field3413;
								}

								field1553 = class453.field3426;
								method924(1);
								method930();
							} else if ((Client.field28 & class82.field866.method2222()) != 0) {
								field1535 = class453.field3702;
								field1533 = class453.field3636;
								field1534 = class453.field3696;
								field1553 = class453.field3426;
								method924(1);
								method930();
							} else {
								class85.method564(false);
							}
						}
					} else {
						int var10;
						short var11;
						if (field1531 == 1) {
							while (true) {
								if (!var30.method1784()) {
									var10 = class254.field2110 - 80;
									var11 = 321;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class85.method564(false);
									}

									var10 = class254.field2110 + 80;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										method924(0);
									}
									break;
								}

								if (var30.field2601 == 84) {
									class85.method564(false);
								} else if (var30.field2601 == 13) {
									method924(0);
								}
							}
						} else {
							int var15;
							int var16;
							short var32;
							boolean var36;
							if (field1531 == 2) {
								var32 = 201;
								var10 = var32 + 52;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									field1542 = 0;
								}

								var10 += 15;
								if (var6 == 1 && var29 >= var10 - 12 && var29 < var10 + 2) {
									field1542 = 1;
								}

								var10 += 15;
								var32 = 361;
								if (class522.field4185 != null) {
									var34 = class522.field4185.field1986 / 2;
									if (var6 == 1 && var28 >= class522.field4185.field1987 - var34 && var28 <= var34 + class522.field4185.field1987 && var29 >= var32 - 15 && var29 < var32) {
										switch(field1530) {
										case 1:
											class341.method1876(class453.field3591, true, false);
											return;
										case 2:
											class341.method1876("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var34 = class254.field2110 - 80;
								var35 = 321;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
									field1544 = field1544.trim();
									if (field1544.length() == 0) {
										method936(class453.field3518, class453.field3433, class453.field3520);
										return;
									}

									if (field1537.length() == 0) {
										method936(class453.field3521, class453.field3522, class453.field3446);
										return;
									}

									method936(class453.field3624, class453.field3625, class453.field3610);
									Client.method163(false);
									Client.method248(20);
									return;
								}

								var34 = 80 + 180 + field1526;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
									method924(0);
									field1544 = "";
									field1537 = "";
									class473.field3808 = 0;
									class379.field2919 = "";
									field1541 = true;
								}

								var34 = -117 + class254.field2110;
								var35 = 277;
								field1525 = var28 >= var34 && var28 < class61.field736 + var34 && var29 >= var35 && var29 < var35 + class179.field1631;
								if (var6 == 1 && field1525) {
									Client.field81 = !Client.field81;
									if (!Client.field81 && class281.field2262.method1757() != null) {
										class281.field2262.method1756((String)null);
									}
								}

								var34 = 24 + class254.field2110;
								var35 = 277;
								field1548 = var28 >= var34 && var28 < var34 + class61.field736 && var29 >= var35 && var29 < class179.field1631 + var35;
								if (var6 == 1 && field1548) {
									class281.field2262.method1766(!class281.field2262.method1749());
									if (!class281.field2262.method1749()) {
										field1544 = "";
										class281.field2262.method1756((String)null);
										method930();
									}
								}

								while (true) {
									Transferable var46;
									do {
										while (true) {
											label1169:
											do {
												while (true) {
													while (var30.method1784()) {
														if (var30.field2601 != 13) {
															if (field1542 != 0) {
																continue label1169;
															}

															method928(var30.field2588);
															if (var30.field2601 == 85 && field1544.length() > 0) {
																field1544 = field1544.substring(0, field1544.length() - 1);
															}

															if (var30.field2601 == 84 || var30.field2601 == 80) {
																field1542 = 1;
															}

															if (method929(var30.field2588) && field1544.length() < 320) {
																field1544 = field1544 + var30.field2588;
															}
														} else {
															method924(0);
															field1544 = "";
															field1537 = "";
															class473.field3808 = 0;
															class379.field2919 = "";
															field1541 = true;
														}
													}

													return;
												}
											} while(field1542 != 1);

											if (var30.field2601 == 85 && field1537.length() > 0) {
												field1537 = field1537.substring(0, field1537.length() - 1);
											} else if (var30.field2601 == 84 || var30.field2601 == 80) {
												field1542 = 0;
												if (var30.field2601 == 84) {
													field1544 = field1544.trim();
													if (field1544.length() == 0) {
														method936(class453.field3518, class453.field3433, class453.field3520);
														return;
													}

													if (field1537.length() == 0) {
														method936(class453.field3521, class453.field3522, class453.field3446);
														return;
													}

													method936(class453.field3624, class453.field3625, class453.field3610);
													Client.method163(false);
													Client.method248(20);
													return;
												}
											}

											if ((var30.method1783(82) || var30.method1783(87)) && var30.field2601 == 67) {
												Clipboard var45 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var46 = var45.getContents(class51.field585);
												var15 = 20 - field1537.length();
												break;
											}

											char var43 = var30.field2588;
											if (var43 >= ' ' && var43 < 127 || var43 > 127 && var43 < 160 || var43 > 160 && var43 <= 255) {
												var36 = true;
											} else {
												label1408: {
													if (var43 != 0) {
														char[] var44 = class244.field2013;

														for (var16 = 0; var16 < var44.length; ++var16) {
															char var17 = var44[var16];
															if (var17 == var43) {
																var36 = true;
																break label1408;
															}
														}
													}

													var36 = false;
												}
											}

											if (var36 && method929(var30.field2588) && field1537.length() < 20) {
												field1537 = field1537 + var30.field2588;
											}
										}
									} while(var15 <= 0);

									try {
										String var48 = (String)var46.getTransferData(DataFlavor.stringFlavor);
										int var47 = Math.min(var15, var48.length());

										for (int var18 = 0; var18 < var47; ++var18) {
											char var20 = var48.charAt(var18);
											boolean var19;
											if ((var20 < ' ' || var20 >= 127) && (var20 <= 127 || var20 >= 160) && (var20 <= 160 || var20 > 255)) {
												label1388: {
													if (var20 != 0) {
														char[] var21 = class244.field2013;

														for (int var22 = 0; var22 < var21.length; ++var22) {
															char var23 = var21[var22];
															if (var23 == var20) {
																var19 = true;
																break label1388;
															}
														}
													}

													var19 = false;
												}
											} else {
												var19 = true;
											}

											if (!var19 || !method929(var48.charAt(var18))) {
												method924(3);
												return;
											}
										}

										field1537 = field1537 + var48.substring(0, var47);
									} catch (UnsupportedFlavorException var24) {
									} catch (IOException var25) {
									}
								}
							} else {
								class238 var12;
								if (field1531 == 3) {
									var10 = field1526 + 180;
									var11 = 241;
									var12 = var1.method1650(25, class453.field3645.length() - 34, class453.field3645, var10, var11);
									if (var6 == 1 && var12.method1251(var28, var29, (byte)-32)) {
										class341.method1876(class453.field3706, true, false);
									}

									var10 = 180 + field1526;
									var11 = 276;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class85.method563(false);
									}

									var10 = 180 + field1526;
									var11 = 326;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
										class341.method1876(class453.field3591, true, false);
										return;
									}
								} else {
									int var13;
									if (field1531 == 4) {
										var10 = 180 + field1526 - 80;
										var11 = 321;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											class379.field2919.trim();
											if (class379.field2919.length() != 6) {
												method936(class453.field3554, class453.field3438, class453.field3517);
												return;
											}

											class473.field3808 = Integer.parseInt(class379.field2919);
											class379.field2919 = "";
											Client.method163(true);
											method936(class453.field3624, class453.field3625, class453.field3610);
											Client.method248(20);
											return;
										}

										if (var6 == 1 && var28 >= field1526 + 180 - 9 && var28 <= 130 + 180 + field1526 && var29 >= 263 && var29 <= 296) {
											field1541 = !field1541;
										}

										if (var6 == 1 && var28 >= 180 + field1526 - 34 && var28 <= 34 + 180 + field1526 && var29 >= 351 && var29 <= 363) {
											class341.method1876(class453.field3591, true, false);
										}

										var10 = 180 + field1526 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
											method924(0);
											field1544 = "";
											field1537 = "";
											class473.field3808 = 0;
											class379.field2919 = "";
										}

										while (var30.method1784()) {
											var33 = false;

											for (var13 = 0; var13 < field1549.length(); ++var13) {
												if (var30.field2588 == field1549.charAt(var13)) {
													var33 = true;
													break;
												}
											}

											if (var30.field2601 == 13) {
												method924(0);
												field1544 = "";
												field1537 = "";
												class473.field3808 = 0;
												class379.field2919 = "";
											} else {
												if (var30.field2601 == 85 && class379.field2919.length() > 0) {
													class379.field2919 = class379.field2919.substring(0, class379.field2919.length() - 1);
												}

												if (var30.field2601 == 84) {
													class379.field2919.trim();
													if (class379.field2919.length() != 6) {
														method936(class453.field3554, class453.field3438, class453.field3517);
														return;
													}

													class473.field3808 = Integer.parseInt(class379.field2919);
													class379.field2919 = "";
													Client.method163(true);
													method936(class453.field3624, class453.field3625, class453.field3610);
													Client.method248(20);
													return;
												}

												if (var33 && class379.field2919.length() < 6) {
													class379.field2919 = class379.field2919 + var30.field2588;
												}
											}
										}
									} else {
										int var14;
										if (field1531 == 5) {
											var10 = 180 + field1526 - 80;
											var11 = 321;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												method927();
												return;
											}

											var10 = 80 + 180 + field1526;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
												class85.method564(true);
											}

											var35 = 361;
											if (null != class534.field4252) {
												var13 = class534.field4252.field1986 / 2;
												if (var6 == 1 && var28 >= class534.field4252.field1987 - var13 && var28 <= class534.field4252.field1987 + var13 && var29 >= var35 - 15 && var29 < var35) {
													class341.method1876(Client.method207("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var30.method1784()) {
												var36 = false;

												for (var14 = 0; var14 < field1543.length(); ++var14) {
													if (var30.field2588 == field1543.charAt(var14)) {
														var36 = true;
														break;
													}
												}

												if (var30.field2601 == 13) {
													class85.method564(true);
												} else {
													if (var30.field2601 == 85 && field1544.length() > 0) {
														field1544 = field1544.substring(0, field1544.length() - 1);
													}

													if (var30.field2601 == 84) {
														method927();
														return;
													}

													if (var36 && field1544.length() < 320) {
														field1544 = field1544 + var30.field2588;
													}
												}
											}
										} else if (field1531 != 6) {
											if (field1531 == 7) {
												if (class515.field4125 && !Client.field262) {
													var10 = class254.field2110 - 150;
													var34 = var10 + 240 + 25 + 40;
													var35 = 231;
													var13 = var35 + 40;
													if (var6 == 1 && var28 >= var10 && var28 <= var34 && var29 >= var35 && var29 <= var13) {
														var15 = var10;
														var16 = 0;

														while (true) {
															if (var16 >= 8) {
																var14 = 0;
																break;
															}

															if (var28 <= var15 + 30) {
																var14 = var16;
																break;
															}

															var15 += 30;
															var15 += var16 != 1 && var16 != 3 ? 5 : 20;
															++var16;
														}

														field1536 = var14;
													}

													var14 = 180 + field1526 - 80;
													short var38 = 321;
													boolean var42;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var38 - 20 && var29 <= var38 + 20) {
														var42 = method926();
														if (var42) {
															Client.method248(50);
															return;
														}
													}

													var14 = field1526 + 180 + 80;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= var38 - 20 && var29 <= var38 + 20) {
														field1539 = new String[8];
														class85.method564(true);
													}

													while (var30.method1784()) {
														if (var30.field2601 == 101) {
															field1539[field1536] = null;
														}

														if (var30.field2601 == 85) {
															if (field1539[field1536] == null && field1536 > 0) {
																--field1536;
															}

															field1539[field1536] = null;
														}

														if (var30.field2588 >= '0' && var30.field2588 <= '9') {
															field1539[field1536] = "" + var30.field2588;
															if (field1536 < 7) {
																++field1536;
															}
														}

														if (var30.field2601 == 84) {
															var42 = method926();
															if (var42) {
																Client.method248(50);
															}

															return;
														}
													}
												} else {
													var10 = 180 + field1526 - 80;
													var11 = 321;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
														class341.method1876(Client.method207("secure", true) + "m=dob/set_dob.ws", true, false);
														method936(class453.field3655, class453.field3656, class453.field3540);
														method924(6);
														return;
													}

													var10 = 80 + field1526 + 180;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
														class85.method564(true);
													}
												}
											} else if (field1531 == 8) {
												var10 = 180 + field1526 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class341.method1876("https://www.jagex.com/terms/privacy", true, false);
													method936(class453.field3655, class453.field3656, class453.field3540);
													method924(6);
													return;
												}

												var10 = field1526 + 180 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class85.method564(true);
												}
											} else if (field1531 == 9) {
												var10 = 180 + field1526;
												var11 = 311;
												if (var30.field2601 == 84 || var30.field2601 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class85.method563(false);
												}
											} else if (field1531 == 10) {
												var10 = 180 + field1526;
												var11 = 209;
												if (var30.field2601 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= var11 && var29 <= var11 + 68) {
													method936(class453.field3624, class453.field3625, class453.field3610);
													Client.field72 = class347.field2747;
													Client.method163(false);
													Client.method248(20);
												}
											} else if (field1531 == 12) {
												var10 = class254.field2110;
												var11 = 233;
												var12 = var2.method1650(0, 30, class453.field3687, var10, var11);
												class238 var37 = var2.method1650(32, 32, class453.field3687, var10, var11);
												class238 var39 = var2.method1650(70, 34, class453.field3687, var10, var11);
												var34 = var11 + 17;
												class238 var40 = var2.method1650(0, 34, class453.field3688, var10, var34);
												if (var6 == 1) {
													if (var12.method1251(var28, var29, (byte)-43)) {
														class341.method1876("https://www.jagex.com/terms", true, false);
													} else if (var37.method1251(var28, var29, (byte)-50)) {
														class341.method1876("https://www.jagex.com/terms/privacy", true, false);
													} else if (var39.method1251(var28, var29, (byte)-15) || var40.method1251(var28, var29, (byte)-15)) {
														class341.method1876("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var10 = class254.field2110 - 80;
												var11 = 311;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													Client.method121();
													class85.method563(true);
												}

												var10 = class254.field2110 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													field1531 = 13;
												}
											} else if (field1531 == 13) {
												var10 = class254.field2110;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class85.method563(true);
												}
											} else if (field1531 == 14) {
												String var41 = "";
												switch(field1529) {
												case 0:
													var41 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var41 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var41 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													class85.method564(false);
												}

												var34 = field1526 + 180;
												var35 = 276;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
													class341.method1876(var41, true, false);
													method936(class453.field3655, class453.field3656, class453.field3540);
													method924(6);
													return;
												}

												var34 = 180 + field1526;
												var35 = 326;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= var35 - 20 && var29 <= var35 + 20) {
													class85.method564(false);
												}
											} else if (field1531 == 24) {
												var10 = field1526 + 180;
												var11 = 301;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class85.method563(false);
												}
											} else if (field1531 == 32) {
												var10 = field1526 + 180 - 80;
												var11 = 321;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class341.method1876(Client.method207("secure", true) + "m=dob/set_dob.ws", true, false);
													method936(class453.field3655, class453.field3656, class453.field3540);
													method924(6);
													return;
												}

												var10 = 80 + 180 + field1526;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class85.method564(true);
												}
											} else if (field1531 == 33) {
												var10 = field1526 + 180;
												var11 = 276;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class341.method1876(class453.field3706, true, false);
												}

												var10 = field1526 + 180;
												var11 = 326;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= var11 - 20 && var29 <= var11 + 20) {
													class85.method564(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var30.method1784()) {
														var32 = 321;
														if (var6 == 1 && var29 >= var32 - 20 && var29 <= var32 + 20) {
															class85.method564(true);
														}

														return;
													}
												} while(var30.field2601 != 84 && var30.field2601 != 13);

												class85.method564(true);
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

	@ObfInfo(name = "ac", desc = "(I)Z")
	static boolean method926() {
		Date var1;
		try {
			var1 = class460.method2392();
		} catch (ParseException var5) {
			method934("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var1 == null) {
			return false;
		} else {
			boolean var2 = method933(var1);
			Date var4 = method935();
			boolean var3 = var1.after(var4);
			if (!var3) {
				method924(7);
				method936("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var2) {
					class478.field3816 = 8388607;
				} else {
					class478.field3816 = (int)(var1.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "ai", desc = "(I)Ljava/util/Date;")
	static Date method935() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	@ObfInfo(name = "az", desc = "(Ljava/util/Date;I)Z")
	static boolean method933(Date var0) {
		Calendar var2 = Calendar.getInstance();
		var2.set(1, var2.get(1) - 13);
		var2.set(5, var2.get(5) + 1);
		var2.set(11, 0);
		var2.set(12, 0);
		var2.set(13, 0);
		var2.set(14, 0);
		Date var3 = var2.getTime();
		return var0.before(var3);
	}

	@ObfInfo(name = "ap", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	static void method934(String var0, String var1, String var2) {
		method924(7);
		method936(var0, var1, var2);
	}

	@ObfInfo(name = "af", desc = "(CI)Z")
	static boolean method928(char var0) {
		for (int var2 = 0; var2 < field1543.length(); ++var2) {
			if (var0 == field1543.charAt(var2)) {
				return true;
			}
		}

		return false;
	}

	@ObfInfo(name = "ad", desc = "(CS)Z")
	static boolean method929(char var0) {
		return field1543.indexOf(var0) != -1;
	}

	@ObfInfo(name = "an", desc = "(B)V")
	static void method927() {
		field1544 = field1544.trim();
		if (field1544.length() == 0) {
			method936(class453.field3658, class453.field3659, class453.field3660);
		} else {
			long var2;
			try {
				URL var4 = new URL(Client.method207("services", false) + "m=accountappeal/login.ws");
				URLConnection var5 = var4.openConnection();
				var5.setRequestProperty("connection", "close");
				var5.setDoInput(true);
				var5.setDoOutput(true);
				var5.setConnectTimeout(5000);
				OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
				var6.write("data1=req");
				var6.flush();
				InputStream var7 = var5.getInputStream();
				class280 var8 = new class280(new byte[1000]);

				while (true) {
					int var9 = var7.read(var8.field2252, var8.field2254, 1000 - var8.field2254);
					if (var9 == -1) {
						var8.field2254 = 0;
						long var12 = var8.method1497();
						var2 = var12;
						break;
					}

					var8.field2254 += var9;
					if (var8.field2254 >= 1000) {
						var2 = 0L;
						break;
					}
				}
			} catch (Exception var11) {
				var2 = 0L;
			}

			int var1;
			if (var2 == 0L) {
				var1 = 5;
			} else {
				var1 = class478.method2442(var2, field1544);
			}

			switch(var1) {
			case 2:
				method936(class453.field3661, class453.field3662, class453.field3663);
				method924(6);
				break;
			case 3:
				method936(class453.field3695, class453.field3665, class453.field3470);
				break;
			case 4:
				method936(class453.field3667, class453.field3668, class453.field3652);
				break;
			case 5:
				method936(class453.field3670, class453.field3671, class453.field3664);
				break;
			case 6:
				method936(class453.field3673, class453.field3434, class453.field3537);
				break;
			case 7:
				method936(class453.field3402, class453.field3677, class453.field3501);
			}

		}
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	static void method936(String var0, String var1, String var2) {
		field1535 = var0;
		field1533 = var1;
		field1534 = var2;
	}

	@ObfInfo(name = "am", desc = "(B)V")
	static void method925() {
		if (class516.method2532()) {
			field1545 = true;
			field1547 = 0;
			field1552 = 0;
		}

	}

	@ObfInfo(name = "ax", desc = "(I)V")
	static void method932() {
		field1545 = false;
		field1524.method857(field1520, 0);
		class238.field1988.method857(field1520 + 382, 0);
		class279.field2250.method2115(382 + field1520 - class279.field2250.field3105 / 2, 18);
	}

	@ObfInfo(name = "ah", desc = "(B)V")
	static void method939() {
		method924(24);
		method936(class453.field3644, class453.field3631, class453.field3632);
	}

	@ObfInfo(name = "as", desc = "(II)V")
	static void method924(int var0) {
		if (var0 != field1531) {
			field1531 = var0;
		}
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;I)V")
	static void method940(String var0) {
		field1538 = class477.method2439(var0);
	}
}
