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

public class class174 {

	static boolean field1723;

	static boolean field1739;

	static boolean field1743;

	static boolean field1746;

	static class214 field1717;

	static class214 field1720;

	static class214 field1721;

	static class214[] field1719;

	static class84 field1722;

	static int field1718;

	static int field1724;

	static int field1725;

	static int field1727;

	static int field1728;

	static int field1729;

	static int field1734;

	static int field1740;

	static int field1744;

	static int field1745;

	static int field1750;

	static String field1726;

	static String field1731;

	static String field1732;

	static String field1733;

	static String field1735;

	static String field1736;

	static String field1741;

	static String field1742;

	static String field1747;

	static String field1751;

	static String[] field1730;

	static String[] field1737;

	static String[] field1749;

	static String[] field1752;

	static long field1738;

	static long field1748;

	static {
		field1718 = 0;
		field1724 = field1718 + 202;
		field1725 = 10;
		field1726 = "";
		field1727 = -1;
		field1728 = 1;
		field1729 = 0;
		field1751 = "";
		field1733 = "";
		field1731 = "";
		field1732 = "";
		field1742 = "";
		field1735 = "";
		field1734 = 0;
		field1737 = new String[8];
		field1736 = "";
		field1723 = false;
		field1746 = false;
		field1739 = true;
		field1740 = 0;
		field1741 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field1747 = "1234567890";
		field1743 = false;
		field1744 = -1;
		field1745 = 0;
		field1750 = 0;
		new DecimalFormat("##0.00");
		new class93();
		field1738 = -1L;
		field1748 = -1L;
		field1730 = new String[] { "title.jpg" };
		field1749 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
		field1752 = new String[] { "logo_speedrunning" };
	}

	class174() throws Throwable {
	}

	static void method1044(class338 var0, class338 var1, boolean var2, int var3) {
		if (class261.field2167) {
			if (var3 == 4) {
				method1030(4);
			}
		} else {
			if (var3 == 0) {
				class498.method2380(var2);
			} else {
				method1030(var3);
			}
			class206.method1233();
			byte[] var5 = var0.method1781("title.jpg", "");
			field1722 = class512.method2461(var5);
			class166.field1680 = field1722.method352();
			int var6 = Client.field899;
			if ((var6 & class351.field2669.method1362()) != 0) {
				class365.field2924 = class494.method2365(var1, "logo_deadman_mode", "");
			} else if ((var6 & class351.field2670.method1362()) != 0) {
				class365.field2924 = class494.method2365(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class351.field2648.method1362()) != 0) {
				class365.field2924 = class494.method2365(var1, "logo_speedrunning", "");
			} else {
				class365.field2924 = class494.method2365(var1, "logo", "");
			}
			field1720 = class494.method2365(var1, "titlebox", "");
			class501.field4024 = class494.method2365(var1, "titlebutton", "");
			field1721 = class494.method2365(var1, "titlebutton_large", "");
			class53.field241 = class494.method2365(var1, "play_now_text", "");
			class494.method2365(var1, "titlebutton_wide42,1", "");
			field1719 = class494.method2367(var1, "runes", "");
			class8.field28 = class494.method2367(var1, "title_mute", "");
			field1717 = class494.method2365(var1, "options_radio_buttons,0", "");
			class329.field2537 = class494.method2365(var1, "options_radio_buttons,4", "");
			class202.field1891 = class494.method2365(var1, "options_radio_buttons,2", "");
			class141.field1540 = class494.method2365(var1, "options_radio_buttons,6", "");
			class459.field3495 = field1717.field1940;
			class194.field1860 = field1717.field1941;
			class225.field1989 = new class178(field1719);
			if (var2) {
				field1742 = "";
				field1735 = "";
				field1737 = new String[8];
				field1734 = 0;
			}
			class327.field2531 = 0;
			class60.field648 = "";
			field1739 = true;
			field1743 = false;
			if (!class83.field841.method1020()) {
				ArrayList var7 = new ArrayList();
				var7.add(new class490(class477.field3744, "scape main", "", 255, false));
				class388.method2015(var7, 0, 0, 0, 100, false);
			} else {
				class436.method2172(0, 0);
			}
			class346.method1810();
			class438.method2189().method21(false);
			class261.field2167 = true;
			field1718 = (class86.field856 - 765) / 2;
			field1724 = 202 + field1718;
			class154.field1598 = 180 + field1724;
			field1722.method360(field1718, 0);
			class166.field1680.method360(382 + field1718, 0);
			class365.field2924.method1292(field1718 + 382 - class365.field2924.field1940 / 2, 18);
		}
	}

	static String method1037() {
		String var1;
		if (class83.field841.method1004()) {
			String var3 = field1742;
			String var2 = class514.method2478('*', var3.length());
			var1 = var2;
		} else {
			var1 = field1742;
		}
		return var1;
	}

	static void method1036() {
		if (Client.field952 && field1742 != null && field1742.length() > 0) {
			field1740 = 1;
		} else {
			field1740 = 0;
		}
	}

	static void method1043(class522 var0, class61 var1, class61 var2) {
		int var6;
		boolean var11;
		int var28;
		int var29;
		boolean var32;
		boolean var33;
		if (field1743) {
			class479 var27 = Client.method551();
			while (true) {
				if (!var27.method2324()) {
					if (class422.field3264 != 1 && (class349.field2637 || class422.field3264 != 4)) {
						break;
					}
					int var5 = field1718 + 280;
					if (class422.field3265 >= var5 && class422.field3265 <= var5 + 14 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(0, 0);
						break;
					}
					if (class422.field3265 >= var5 + 15 && class422.field3265 <= var5 + 80 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(0, 1);
						break;
					}
					var6 = field1718 + 390;
					if (class422.field3265 >= var6 && class422.field3265 <= var6 + 14 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(1, 0);
						break;
					}
					if (class422.field3265 >= var6 + 15 && class422.field3265 <= var6 + 80 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(1, 1);
						break;
					}
					var28 = field1718 + 500;
					if (class422.field3265 >= var28 && class422.field3265 <= var28 + 14 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(2, 0);
						break;
					}
					if (class422.field3265 >= var28 + 15 && class422.field3265 <= var28 + 80 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(2, 1);
						break;
					}
					var29 = 610 + field1718;
					if (class422.field3265 >= var29 && class422.field3265 <= var29 + 14 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(3, 0);
						break;
					}
					if (class422.field3265 >= var29 + 15 && class422.field3265 <= var29 + 80 && class422.field3266 >= 4 && class422.field3266 <= 18) {
						class192.method1190(3, 1);
						break;
					}
					if (class422.field3265 >= 708 + field1718 && class422.field3266 >= 4 && class422.field3265 <= 50 + 708 + field1718 && class422.field3266 <= 20) {
						method1038();
						break;
					}
					if (field1744 != -1) {
						class192 var31 = class253.field2125[field1744];
						if (var31.method1174()) {
							var31.field1851 = "beta";
						}
						var32 = false;
						if (var31.field1840 != Client.field899) {
							var11 = (Client.field899 & class351.field2656.method1362()) != 0;
							var33 = var31.method1174();
							if (var11 && !var33 || !var11 && var33) {
								var32 = true;
							}
						}
						class393.method2032(var31);
						method1038();
						if (var32) {
							Client.method589();
						}
					} else {
						if (field1745 > 0 && null != class240.field2045 && class422.field3265 >= 0 && class422.field3265 <= class240.field2045.field1940 && class422.field3266 >= class271.field2226 / 2 - 50 && class422.field3266 <= class271.field2226 / 2 + 50) {
							--field1745;
						}
						if (field1745 < field1750 && null != class413.field3214 && class422.field3265 >= class86.field856 - class413.field3214.field1940 - 5 && class422.field3265 <= class86.field856 && class422.field3266 >= class271.field2226 / 2 - 50 && class422.field3266 <= class271.field2226 / 2 + 50) {
							++field1745;
						}
					}
					break;
				}
				if (var27.field3761 == 13) {
					method1038();
					break;
				}
				if (var27.field3761 == 96) {
					if (field1745 > 0 && null != class240.field2045) {
						--field1745;
					}
				} else if (var27.field3761 == 97 && field1745 < field1750 && null != class413.field3214) {
					++field1745;
				}
			}
		} else {
			if ((class422.field3264 == 1 || !class349.field2637 && class422.field3264 == 4) && class422.field3265 >= field1718 + 765 - 50 && class422.field3266 >= 453) {
				class83.field841.method1019(!class83.field841.method1020());
				if (!class83.field841.method1020()) {
					ArrayList var4 = new ArrayList();
					var4.add(new class490(class477.field3744, "scape main", "", 255, false));
					class388.method2015(var4, 0, 0, 0, 100, false);
				} else {
					class436.method2172(0, 0);
				}
				class346.method1810();
			}
			if (Client.field982 != 5) {
				if (-1L == field1738) {
					field1738 = class48.method197() + 1000L;
				}
				long var26 = class48.method197();
				if (Client.method476() && -1L == field1748) {
					field1748 = var26;
					if (field1748 > field1738) {
						field1738 = field1748;
					}
				}
				if (Client.field982 == 10 || Client.field982 == 11) {
					if (class162.field1645 == class267.field2194) {
						if (class422.field3264 == 1 || !class349.field2637 && class422.field3264 == 4) {
							var6 = 5 + field1718;
							boolean var7 = true;
							boolean var8 = true;
							boolean var9 = true;
							if (class422.field3265 >= var6 && class422.field3265 <= 100 + var6 && class422.field3266 >= 463 && class422.field3266 <= 498) {
								if (class192.method1187()) {
									field1743 = true;
									field1745 = 0;
									field1750 = 0;
								}
								return;
							}
						}
						if (class532.field4205 != null) {
							method1031();
						}
					}
					var6 = class422.field3264;
					var28 = class422.field3265;
					var29 = class422.field3266;
					if (var6 == 0) {
						var28 = class422.field3270;
						var29 = class422.field3253;
					}
					if (!class349.field2637 && var6 == 4) {
						var6 = 1;
					}
					class479 var30 = Client.method551();
					int var34;
					if (field1729 == 0) {
						var32 = false;
						while (var30.method2324()) {
							if (var30.field3761 == 84) {
								var32 = true;
							}
						}
						var34 = class154.field1598 - 80;
						var33 = true;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 271 && var29 <= 311) {
							class41.method177(Client.method526("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}
						var34 = 80 + class154.field1598;
						if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 271 && var29 <= 311 || var32) {
							if ((Client.field899 & class351.field2665.method1362()) != 0) {
								field1751 = "";
								field1733 = class55.field552;
								field1731 = class55.field543;
								field1732 = class55.field544;
								method1030(1);
								method1036();
							} else if ((Client.field899 & class351.field2650.method1362()) != 0) {
								if ((Client.field899 & class351.field2671.method1362()) != 0) {
									field1733 = class55.field539;
									field1731 = class55.field540;
									field1732 = class55.field541;
								} else {
									field1733 = class55.field533;
									field1731 = class55.field534;
									field1732 = class55.field335;
								}
								field1751 = class55.field348;
								method1030(1);
								method1036();
							} else if ((Client.field899 & class351.field2671.method1362()) != 0) {
								field1733 = class55.field624;
								field1731 = class55.field558;
								field1732 = class55.field618;
								field1751 = class55.field348;
								method1030(1);
								method1036();
							} else {
								class498.method2381(false);
							}
						}
					} else {
						int var10;
						if (field1729 == 1) {
							while (true) {
								if (!var30.method2324()) {
									var10 = class154.field1598 - 80;
									var11 = true;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
										class498.method2381(false);
									}
									var10 = class154.field1598 + 80;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
										method1030(0);
									}
									break;
								}
								if (var30.field3761 == 84) {
									class498.method2381(false);
								} else if (var30.field3761 == 13) {
									method1030(0);
								}
							}
						} else {
							int var15;
							int var16;
							boolean var35;
							if (field1729 == 2) {
								short var49 = 201;
								var10 = var49 + 52;
								if (var6 == 1 && var29 >= 241 && var29 < 255) {
									field1740 = 0;
								}
								var10 += 15;
								if (var6 == 1 && var29 >= 256 && var29 < 270) {
									field1740 = 1;
								}
								var10 += 15;
								var32 = true;
								if (class298.field2345 != null) {
									var34 = class298.field2345.field1678 / 2;
									if (var6 == 1 && var28 >= class298.field2345.field1679 - var34 && var28 <= var34 + class298.field2345.field1679 && var29 >= 346 && var29 < 361) {
										switch(field1728) {
											case 1:
												class41.method177(class55.field513, true, false);
												return;
											case 2:
												class41.method177("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}
								var34 = class154.field1598 - 80;
								var33 = true;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 301 && var29 <= 341) {
									field1742 = field1742.trim();
									if (field1742.length() == 0) {
										method1042(class55.field440, class55.field355, class55.field442);
										return;
									}
									if (field1735.length() == 0) {
										method1042(class55.field443, class55.field444, class55.field368);
										return;
									}
									method1042(class55.field546, class55.field547, class55.field532);
									Client.method482(false);
									Client.method567(20);
									return;
								}
								var34 = 80 + 180 + field1724;
								if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 301 && var29 <= 341) {
									method1030(0);
									field1742 = "";
									field1735 = "";
									class327.field2531 = 0;
									class60.field648 = "";
									field1739 = true;
								}
								var34 = -117 + class154.field1598;
								var33 = true;
								field1723 = var28 >= var34 && var28 < class459.field3495 + var34 && var29 >= 277 && var29 < 277 + class194.field1860;
								if (var6 == 1 && field1723) {
									Client.field952 = !Client.field952;
									if (!Client.field952 && class83.field841.method1012() != null) {
										class83.field841.method1011((String) null);
									}
								}
								var34 = 24 + class154.field1598;
								var33 = true;
								field1746 = var28 >= var34 && var28 < var34 + class459.field3495 && var29 >= 277 && var29 < class194.field1860 + 277;
								if (var6 == 1 && field1746) {
									class83.field841.method1021(!class83.field841.method1004());
									if (!class83.field841.method1004()) {
										field1742 = "";
										class83.field841.method1011((String) null);
										method1036();
									}
								}
								while (true) {
									Transferable var46;
									do {
										while (true) {
											label1169: do {
												while (true) {
													while (var30.method2324()) {
														if (var30.field3761 != 13) {
															if (field1740 != 0) {
																continue label1169;
															}
															method1034(var30.field3748);
															if (var30.field3761 == 85 && field1742.length() > 0) {
																field1742 = field1742.substring(0, field1742.length() - 1);
															}
															if (var30.field3761 == 84 || var30.field3761 == 80) {
																field1740 = 1;
															}
															if (method1035(var30.field3748) && field1742.length() < 320) {
																field1742 = field1742 + var30.field3748;
															}
														} else {
															method1030(0);
															field1742 = "";
															field1735 = "";
															class327.field2531 = 0;
															class60.field648 = "";
															field1739 = true;
														}
													}
													return;
												}
											} while (field1740 != 1);
											if (var30.field3761 == 85 && field1735.length() > 0) {
												field1735 = field1735.substring(0, field1735.length() - 1);
											} else if (var30.field3761 == 84 || var30.field3761 == 80) {
												field1740 = 0;
												if (var30.field3761 == 84) {
													field1742 = field1742.trim();
													if (field1742.length() == 0) {
														method1042(class55.field440, class55.field355, class55.field442);
														return;
													}
													if (field1735.length() == 0) {
														method1042(class55.field443, class55.field444, class55.field368);
														return;
													}
													method1042(class55.field546, class55.field547, class55.field532);
													Client.method482(false);
													Client.method567(20);
													return;
												}
											}
											if ((var30.method2323(82) || var30.method2323(87)) && var30.field3761 == 67) {
												Clipboard var45 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var46 = var45.getContents(class501.field4023);
												var15 = 20 - field1735.length();
												break;
											}
											char var43 = var30.field3748;
											if (var43 >= ' ' && var43 < 127 || var43 > 127 && var43 < 160 || var43 > 160 && var43 <= 255) {
												var35 = true;
											} else {
												label1409: {
													if (var43 != 0) {
														char[] var44 = class111.field1317;
														for (var16 = 0; var16 < var44.length; ++var16) {
															char var17 = var44[var16];
															if (var17 == var43) {
																var35 = true;
																break label1409;
															}
														}
													}
													var35 = false;
												}
											}
											if (var35 && method1035(var30.field3748) && field1735.length() < 20) {
												field1735 = field1735 + var30.field3748;
											}
										}
									} while (var15 <= 0);
									try {
										String var48 = (String) var46.getTransferData(DataFlavor.stringFlavor);
										int var47 = Math.min(var15, var48.length());
										for (int var18 = 0; var18 < var47; ++var18) {
											char var20 = var48.charAt(var18);
											boolean var19;
											if ((var20 < ' ' || var20 >= 127) && (var20 <= 127 || var20 >= 160) && (var20 <= 160 || var20 > 255)) {
												label1390: {
													if (var20 != 0) {
														char[] var21 = class111.field1317;
														for (int var22 = 0; var22 < var21.length; ++var22) {
															char var23 = var21[var22];
															if (var23 == var20) {
																var19 = true;
																break label1390;
															}
														}
													}
													var19 = false;
												}
											} else {
												var19 = true;
											}
											if (!var19 || !method1035(var48.charAt(var18))) {
												method1030(3);
												return;
											}
										}
										field1735 = field1735 + var48.substring(0, var47);
									} catch (UnsupportedFlavorException var24) {
									} catch (IOException var25) {
									}
								}
							} else {
								class166 var12;
								if (field1729 == 3) {
									var10 = field1724 + 180;
									var11 = true;
									var12 = var1.method2390(25, class55.field567.length() - 34, class55.field567, var10, 241);
									if (var6 == 1 && var12.method970(var28, var29, (byte) -32)) {
										class41.method177(class55.field628, true, false);
									}
									var10 = 180 + field1724;
									var11 = true;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 256 && var29 <= 296) {
										class498.method2380(false);
									}
									var10 = 180 + field1724;
									var11 = true;
									if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 306 && var29 <= 346) {
										class41.method177(class55.field513, true, false);
										return;
									}
								} else {
									int var13;
									if (field1729 == 4) {
										var10 = 180 + field1724 - 80;
										var11 = true;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
											class60.field648.trim();
											if (class60.field648.length() != 6) {
												method1042(class55.field476, class55.field360, class55.field439);
												return;
											}
											class327.field2531 = Integer.parseInt(class60.field648);
											class60.field648 = "";
											Client.method482(true);
											method1042(class55.field546, class55.field547, class55.field532);
											Client.method567(20);
											return;
										}
										if (var6 == 1 && var28 >= field1724 + 180 - 9 && var28 <= 130 + 180 + field1724 && var29 >= 263 && var29 <= 296) {
											field1739 = !field1739;
										}
										if (var6 == 1 && var28 >= 180 + field1724 - 34 && var28 <= 34 + 180 + field1724 && var29 >= 351 && var29 <= 363) {
											class41.method177(class55.field513, true, false);
										}
										var10 = 180 + field1724 + 80;
										if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
											method1030(0);
											field1742 = "";
											field1735 = "";
											class327.field2531 = 0;
											class60.field648 = "";
										}
										while (var30.method2324()) {
											var33 = false;
											for (var13 = 0; var13 < field1747.length(); ++var13) {
												if (var30.field3748 == field1747.charAt(var13)) {
													var33 = true;
													break;
												}
											}
											if (var30.field3761 == 13) {
												method1030(0);
												field1742 = "";
												field1735 = "";
												class327.field2531 = 0;
												class60.field648 = "";
											} else {
												if (var30.field3761 == 85 && class60.field648.length() > 0) {
													class60.field648 = class60.field648.substring(0, class60.field648.length() - 1);
												}
												if (var30.field3761 == 84) {
													class60.field648.trim();
													if (class60.field648.length() != 6) {
														method1042(class55.field476, class55.field360, class55.field439);
														return;
													}
													class327.field2531 = Integer.parseInt(class60.field648);
													class60.field648 = "";
													Client.method482(true);
													method1042(class55.field546, class55.field547, class55.field532);
													Client.method567(20);
													return;
												}
												if (var33 && class60.field648.length() < 6) {
													class60.field648 = class60.field648 + var30.field3748;
												}
											}
										}
									} else {
										int var14;
										if (field1729 == 5) {
											var10 = 180 + field1724 - 80;
											var11 = true;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												method1033();
												return;
											}
											var10 = 80 + 180 + field1724;
											if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
												class498.method2381(true);
											}
											var33 = true;
											if (null != class163.field1650) {
												var13 = class163.field1650.field1678 / 2;
												if (var6 == 1 && var28 >= class163.field1650.field1679 - var13 && var28 <= class163.field1650.field1679 + var13 && var29 >= 346 && var29 < 361) {
													class41.method177(Client.method526("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}
											while (var30.method2324()) {
												var35 = false;
												for (var14 = 0; var14 < field1741.length(); ++var14) {
													if (var30.field3748 == field1741.charAt(var14)) {
														var35 = true;
														break;
													}
												}
												if (var30.field3761 == 13) {
													class498.method2381(true);
												} else {
													if (var30.field3761 == 85 && field1742.length() > 0) {
														field1742 = field1742.substring(0, field1742.length() - 1);
													}
													if (var30.field3761 == 84) {
														method1033();
														return;
													}
													if (var35 && field1742.length() < 320) {
														field1742 = field1742 + var30.field3748;
													}
												}
											}
										} else if (field1729 != 6) {
											if (field1729 == 7) {
												if (class393.field3125 && !Client.field1133) {
													var10 = class154.field1598 - 150;
													var34 = var10 + 240 + 25 + 40;
													var33 = true;
													var35 = true;
													if (var6 == 1 && var28 >= var10 && var28 <= var34 && var29 >= 231 && var29 <= 271) {
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
														field1734 = var14;
													}
													var14 = 180 + field1724 - 80;
													boolean var38 = true;
													boolean var42;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= 301 && var29 <= 341) {
														var42 = method1032();
														if (var42) {
															Client.method567(50);
															return;
														}
													}
													var14 = field1724 + 180 + 80;
													if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= 301 && var29 <= 341) {
														field1737 = new String[8];
														class498.method2381(true);
													}
													while (var30.method2324()) {
														if (var30.field3761 == 101) {
															field1737[field1734] = null;
														}
														if (var30.field3761 == 85) {
															if (field1737[field1734] == null && field1734 > 0) {
																--field1734;
															}
															field1737[field1734] = null;
														}
														if (var30.field3748 >= '0' && var30.field3748 <= '9') {
															field1737[field1734] = "" + var30.field3748;
															if (field1734 < 7) {
																++field1734;
															}
														}
														if (var30.field3761 == 84) {
															var42 = method1032();
															if (var42) {
																Client.method567(50);
															}
															return;
														}
													}
												} else {
													var10 = 180 + field1724 - 80;
													var11 = true;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
														class41.method177(Client.method526("secure", true) + "m=dob/set_dob.ws", true, false);
														method1042(class55.field577, class55.field578, class55.field462);
														method1030(6);
														return;
													}
													var10 = 80 + field1724 + 180;
													if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
														class498.method2381(true);
													}
												}
											} else if (field1729 == 8) {
												var10 = 180 + field1724 - 80;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													class41.method177("https://www.jagex.com/terms/privacy", true, false);
													method1042(class55.field577, class55.field578, class55.field462);
													method1030(6);
													return;
												}
												var10 = field1724 + 180 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													class498.method2381(true);
												}
											} else if (field1729 == 9) {
												var10 = 180 + field1724;
												var11 = true;
												if (var30.field3761 == 84 || var30.field3761 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
													class498.method2380(false);
												}
											} else if (field1729 == 10) {
												var10 = 180 + field1724;
												var11 = true;
												if (var30.field3761 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= 209 && var29 <= 277) {
													method1042(class55.field546, class55.field547, class55.field532);
													Client.field943 = class508.field4076;
													Client.method482(false);
													Client.method567(20);
												}
											} else if (field1729 == 12) {
												var10 = class154.field1598;
												short var36 = 233;
												var12 = var2.method2390(0, 30, class55.field609, var10, 233);
												class166 var37 = var2.method2390(32, 32, class55.field609, var10, 233);
												class166 var39 = var2.method2390(70, 34, class55.field609, var10, 233);
												var34 = var36 + 17;
												class166 var40 = var2.method2390(0, 34, class55.field610, var10, 250);
												if (var6 == 1) {
													if (var12.method970(var28, var29, (byte) -43)) {
														class41.method177("https://www.jagex.com/terms", true, false);
													} else if (var37.method970(var28, var29, (byte) -50)) {
														class41.method177("https://www.jagex.com/terms/privacy", true, false);
													} else if (var39.method970(var28, var29, (byte) -15) || var40.method970(var28, var29, (byte) -15)) {
														class41.method177("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}
												var10 = class154.field1598 - 80;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
													Client.method440();
													class498.method2380(true);
												}
												var10 = class154.field1598 + 80;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
													field1729 = 13;
												}
											} else if (field1729 == 13) {
												var10 = class154.field1598;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													class498.method2380(true);
												}
											} else if (field1729 == 14) {
												String var41 = "";
												switch(field1727) {
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
														class498.method2381(false);
												}
												var34 = field1724 + 180;
												var33 = true;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 256 && var29 <= 296) {
													class41.method177(var41, true, false);
													method1042(class55.field577, class55.field578, class55.field462);
													method1030(6);
													return;
												}
												var34 = 180 + field1724;
												var33 = true;
												if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 306 && var29 <= 346) {
													class498.method2381(false);
												}
											} else if (field1729 == 24) {
												var10 = field1724 + 180;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 281 && var29 <= 321) {
													class498.method2380(false);
												}
											} else if (field1729 == 32) {
												var10 = field1724 + 180 - 80;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													class41.method177(Client.method526("secure", true) + "m=dob/set_dob.ws", true, false);
													method1042(class55.field577, class55.field578, class55.field462);
													method1030(6);
													return;
												}
												var10 = 80 + 180 + field1724;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
													class498.method2381(true);
												}
											} else if (field1729 == 33) {
												var10 = field1724 + 180;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 256 && var29 <= 296) {
													class41.method177(class55.field628, true, false);
												}
												var10 = field1724 + 180;
												var11 = true;
												if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 306 && var29 <= 346) {
													class498.method2381(true);
												}
											}
										} else {
											while (true) {
												do {
													if (!var30.method2324()) {
														var32 = true;
														if (var6 == 1 && var29 >= 301 && var29 <= 341) {
															class498.method2381(true);
														}
														return;
													}
												} while (var30.field3761 != 84 && var30.field3761 != 13);
												class498.method2381(true);
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

	static boolean method1032() {
		Date var1;
		try {
			var1 = class138.method871();
		} catch (ParseException var5) {
			method1040("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}
		if (var1 == null) {
			return false;
		} else {
			boolean var2 = method1039(var1);
			Date var4 = method1041();
			boolean var3 = var1.after(var4);
			if (!var3) {
				method1030(7);
				method1042("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var2) {
					class531.field4195 = 8388607;
				} else {
					class531.field4195 = (int) (var1.getTime() / 86400000L - 11745L);
				}
				return true;
			}
		}
	}

	static Date method1041() {
		Calendar var1 = Calendar.getInstance();
		var1.set(2, 0);
		var1.set(5, 1);
		var1.set(1, 1900);
		return var1.getTime();
	}

	static boolean method1039(Date var0) {
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

	static void method1040(String var0, String var1, String var2) {
		method1030(7);
		method1042(var0, var1, var2);
	}

	static boolean method1034(char var0) {
		for (int var2 = 0; var2 < field1741.length(); ++var2) {
			if (var0 == field1741.charAt(var2)) {
				return true;
			}
		}
		return false;
	}

	static boolean method1035(char var0) {
		return field1741.indexOf(var0) != -1;
	}

	static void method1033() {
		field1742 = field1742.trim();
		if (field1742.length() == 0) {
			method1042(class55.field580, class55.field581, class55.field582);
		} else {
			long var2;
			try {
				URL var4 = new URL(Client.method526("services", false) + "m=accountappeal/login.ws");
				URLConnection var5 = var4.openConnection();
				var5.setRequestProperty("connection", "close");
				var5.setDoInput(true);
				var5.setDoOutput(true);
				var5.setConnectTimeout(5000);
				OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
				var6.write("data1=req");
				var6.flush();
				InputStream var7 = var5.getInputStream();
				class187 var8 = new class187(new byte[1000]);
				while (true) {
					int var9 = var7.read(var8.field1830, var8.field1832, 1000 - var8.field1832);
					if (var9 == -1) {
						var8.field1832 = 0;
						long var12 = var8.method1101();
						var2 = var12;
						break;
					}
					var8.field1832 += var9;
					if (var8.field1832 >= 1000) {
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
				var1 = class531.method2577(var2, field1742);
			}
			switch(var1) {
				case 2:
					method1042(class55.field583, class55.field584, class55.field585);
					method1030(6);
					break;
				case 3:
					method1042(class55.field617, class55.field587, class55.field392);
					break;
				case 4:
					method1042(class55.field589, class55.field590, class55.field574);
					break;
				case 5:
					method1042(class55.field592, class55.field593, class55.field586);
					break;
				case 6:
					method1042(class55.field595, class55.field356, class55.field459);
					break;
				case 7:
					method1042(class55.field324, class55.field599, class55.field423);
			}
		}
	}

	static void method1042(String var0, String var1, String var2) {
		field1733 = var0;
		field1731 = var1;
		field1732 = var2;
	}

	static void method1031() {
		if (class192.method1187()) {
			field1743 = true;
			field1745 = 0;
			field1750 = 0;
		}
	}

	static void method1038() {
		field1743 = false;
		field1722.method360(field1718, 0);
		class166.field1680.method360(field1718 + 382, 0);
		class365.field2924.method1292(382 + field1718 - class365.field2924.field1940 / 2, 18);
	}

	static void method1045() {
		method1030(24);
		method1042(class55.field566, class55.field553, class55.field554);
	}

	static void method1030(int var0) {
		if (var0 != field1729) {
			field1729 = var0;
		}
	}

	static void method1046(String var0) {
		field1736 = UsernameTools.method3(var0);
	}
}
