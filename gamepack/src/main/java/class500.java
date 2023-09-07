import java.awt.*;
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

public class class500 {
    static boolean field3659;
    static boolean field3675;
    static boolean field3679;
    static boolean field3682;
    static class331 field3658;
    static class539 field3653;
    static class539 field3656;
    static class539 field3657;
    static class539[] field3655;
    static int field3654;
    static int field3660;
    static int field3661;
    static int field3663;
    static int field3664;
    static int field3665;
    static int field3670;
    static int field3676;
    static int field3680;
    static int field3681;
    static int field3686;
    static String field3662;
    static String field3667;
    static String field3668;
    static String field3669;
    static String field3671;
    static String field3672;
    static String field3677;
    static String field3678;
    static String field3683;
    static String field3687;
    static String[] field3666;
    static String[] field3673;
    static String[] field3685;
    static String[] field3688;
    static long field3674;
    static long field3684;

    static {
        field3654 = 0;
        field3660 = field3654 + 202;
        field3661 = 10;
        field3662 = "";
        field3663 = -1;
        field3664 = 1;
        field3665 = 0;
        field3687 = "";
        field3669 = "";
        field3667 = "";
        field3668 = "";
        field3678 = "";
        field3671 = "";
        field3670 = 0;
        field3673 = new String[8];
        field3672 = "";
        field3659 = false;
        field3682 = false;
        field3675 = true;
        field3676 = 0;
        field3677 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field3683 = "1234567890";
        field3679 = false;
        field3680 = -1;
        field3681 = 0;
        field3686 = 0;
        new DecimalFormat("##0.00");
        new class446();
        field3674 = -1L;
        field3684 = -1L;
        field3666 = new String[]{"title.jpg"};
        field3685 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
        field3688 = new String[]{"logo_speedrunning"};
    }

    class500() throws Throwable {
    }

    static void method2270(class68 var0, class68 var1, boolean var2, int var3) {
        if (class394.field2787) {
            if (var3 == 4) {
                method2256(4);
            }

        } else {
            if (var3 == 0) {
                class311.method1370(var2);
            } else {
                method2256(var3);
            }

            class415.method1911();
            byte[] var5 = var0.method207("title.jpg", "");
            field3658 = class458.method2117(var5);
            class8.field44 = field3658.method1535();
            int var6 = Client.field3776;
            if ((var6 & class373.field2688.method1533()) != 0) {
                class352.field2545 = class274.method1226(var1, "logo_deadman_mode", "");
            } else if ((var6 & class373.field2689.method1533()) != 0) {
                class352.field2545 = class274.method1226(var1, "logo_seasonal_mode", "");
            } else if ((var6 & class373.field2667.method1533()) != 0) {
                class352.field2545 = class274.method1226(var1, "logo_speedrunning", "");
            } else {
                class352.field2545 = class274.method1226(var1, "logo", "");
            }

            field3656 = class274.method1226(var1, "titlebox", "");
            class268.field1974 = class274.method1226(var1, "titlebutton", "");
            field3657 = class274.method1226(var1, "titlebutton_large", "");
            class163.field1424 = class274.method1226(var1, "play_now_text", "");
            class274.method1226(var1, "titlebutton_wide42,1", "");
            field3655 = class274.method1228(var1, "runes", "");
            class179.field1520 = class274.method1228(var1, "title_mute", "");
            field3653 = class274.method1226(var1, "options_radio_buttons,0", "");
            class339.field2451 = class274.method1226(var1, "options_radio_buttons,4", "");
            class335.field2436 = class274.method1226(var1, "options_radio_buttons,2", "");
            class375.field2723 = class274.method1226(var1, "options_radio_buttons,6", "");
            class472.field3389 = field3653.field4285;
            class278.field2030 = field3653.field4286;
            class360.field2579 = new class204(field3655);
            if (var2) {
                field3678 = "";
                field3671 = "";
                field3673 = new String[8];
                field3670 = 0;
            }

            class386.field2764 = 0;
            class349.field2533 = "";
            field3675 = true;
            field3679 = false;
            if (!class290.field2121.method2548()) {
                ArrayList<class537> var7 = new ArrayList<class537>();
                var7.add(new class537(class34.field491, "scape main", "", 255, false));
                class141.method648(var7, 0, 0, 0, 100, false);
            } else {
                class443.method2021(0, 0);
            }

            class357.method1703();
            class11.method31().method2084(false);
            class394.field2787 = true;
            field3654 = (class223.field1763 - 765) / 2;
            field3660 = 202 + field3654;
            class317.field2287 = 180 + field3660;
            field3658.method1543(field3654, 0);
            class8.field44.method1543(382 + field3654, 0);
            class352.field2545.method2590(field3654 + 382 - class352.field2545.field4285 / 2, 18);
        }
    }

    static String method2263() {
        String var1;
        if (class290.field2121.method2532()) {
            String var3 = field3678;
            String var2 = class95.method376('*', var3.length());
            var1 = var2;
        } else {
            var1 = field3678;
        }

        return var1;
    }

    static void method2262() {
        if (Client.field3829 && field3678 != null && field3678.length() > 0) {
            field3676 = 1;
        } else {
            field3676 = 0;
        }

    }

    static void method2269(class479 var0, class413 var1, class413 var2) {
        int var6;
        boolean var11;
        int var28;
        int var29;
        boolean var32;
        boolean var33;
        if (field3679) {
            class199 var27 = Client.method2443();

            while (true) {
                if (!var27.method959()) {
                    if (class499.field3645 != 1 && (class218.field1747 || class499.field3645 != 4)) {
                        break;
                    }

                    int var5 = field3654 + 280;
                    if (class499.field3646 >= var5 && class499.field3646 <= var5 + 14 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(0, 0);
                        break;
                    }

                    if (class499.field3646 >= var5 + 15 && class499.field3646 <= var5 + 80 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(0, 1);
                        break;
                    }

                    var6 = field3654 + 390;
                    if (class499.field3646 >= var6 && class499.field3646 <= var6 + 14 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(1, 0);
                        break;
                    }

                    if (class499.field3646 >= var6 + 15 && class499.field3646 <= var6 + 80 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(1, 1);
                        break;
                    }

                    var28 = field3654 + 500;
                    if (class499.field3646 >= var28 && class499.field3646 <= var28 + 14 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(2, 0);
                        break;
                    }

                    if (class499.field3646 >= var28 + 15 && class499.field3646 <= var28 + 80 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(2, 1);
                        break;
                    }

                    var29 = 610 + field3654;
                    if (class499.field3646 >= var29 && class499.field3646 <= var29 + 14 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(3, 0);
                        break;
                    }

                    if (class499.field3646 >= var29 + 15 && class499.field3646 <= var29 + 80 && class499.field3647 >= 4 && class499.field3647 <= 18) {
                        class137.method636(3, 1);
                        break;
                    }

                    if (class499.field3646 >= 708 + field3654 && class499.field3647 >= 4 && class499.field3646 <= 50 + 708 + field3654 && class499.field3647 <= 20) {
                        method2264();
                        break;
                    }

                    if (field3680 != -1) {
                        class137 var31 = class521.field4197[field3680];
                        if (var31.method620()) {
                            var31.field1221 = "beta";
                        }

                        var32 = false;
                        if (var31.field1210 != Client.field3776) {
                            var11 = (Client.field3776 & class373.field2675.method1533()) != 0;
                            var33 = var31.method620();
                            if (var11 && !var33 || !var11 && var33) {
                                var32 = true;
                            }
                        }

                        class4.method3(var31);
                        method2264();
                        if (var32) {
                            Client.method2481();
                        }
                    } else {
                        if (field3681 > 0 && null != class496.field3631 && class499.field3646 >= 0 && class499.field3646 <= class496.field3631.field4285 && class499.field3647 >= class519.field4188 / 2 - 50 && class499.field3647 <= class519.field4188 / 2 + 50) {
                            --field3681;
                        }

                        if (field3681 < field3686 && null != class222.field1762 && class499.field3646 >= class223.field1763 - class222.field1762.field4285 - 5 && class499.field3646 <= class223.field1763 && class499.field3647 >= class519.field4188 / 2 - 50 && class499.field3647 <= class519.field4188 / 2 + 50) {
                            ++field3681;
                        }
                    }
                    break;
                }

                if (var27.field1648 == 13) {
                    method2264();
                    break;
                }

                if (var27.field1648 == 96) {
                    if (field3681 > 0 && null != class496.field3631) {
                        --field3681;
                    }
                } else if (var27.field1648 == 97 && field3681 < field3686 && null != class222.field1762) {
                    ++field3681;
                }
            }

        } else {
            if ((class499.field3645 == 1 || !class218.field1747 && class499.field3645 == 4) && class499.field3646 >= field3654 + 765 - 50 && class499.field3647 >= 453) {
                class290.field2121.method2547(!class290.field2121.method2548());
                if (!class290.field2121.method2548()) {
                    ArrayList<class537> var4 = new ArrayList<class537>();
                    var4.add(new class537(class34.field491, "scape main", "", 255, false));
                    class141.method648(var4, 0, 0, 0, 100, false);
                } else {
                    class443.method2021(0, 0);
                }

                class357.method1703();
            }

            if (Client.field3859 != 5) {
                if (-1L == field3674) {
                    field3674 = class206.method982() + 1000L;
                }

                long var26 = class206.method982();
                if (Client.method2368() && -1L == field3684) {
                    field3684 = var26;
                    if (field3684 > field3674) {
                        field3674 = field3684;
                    }
                }

                if (Client.field3859 == 10 || Client.field3859 == 11) {
                    if (class404.field2860 == class492.field3618) {
                        if (class499.field3645 == 1 || !class218.field1747 && class499.field3645 == 4) {
                            var6 = 5 + field3654;
                            boolean var7 = true;
                            boolean var8 = true;
                            boolean var9 = true;
                            if (class499.field3646 >= var6 && class499.field3646 <= 100 + var6 && class499.field3647 >= 463 && class499.field3647 <= 498) {
                                if (class137.method633()) {
                                    field3679 = true;
                                    field3681 = 0;
                                    field3686 = 0;
                                }

                                return;
                            }
                        }

                        if (class529.field4221 != null) {
                            method2257();
                        }
                    }

                    var6 = class499.field3645;
                    var28 = class499.field3646;
                    var29 = class499.field3647;
                    if (var6 == 0) {
                        var28 = class499.field3651;
                        var29 = class499.field3634;
                    }

                    if (!class218.field1747 && var6 == 4) {
                        var6 = 1;
                    }

                    class199 var30 = Client.method2443();
                    int var34;
                    if (field3665 == 0) {
                        var32 = false;

                        while (var30.method959()) {
                            if (var30.field1648 == 84) {
                                var32 = true;
                            }
                        }

                        var34 = class317.field2287 - 80;
                        var33 = true;
                        if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 271 && var29 <= 311) {
                            class33.method96(Client.method2418("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }

                        var34 = 80 + class317.field2287;
                        if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 271 && var29 <= 311 || var32) {
                            if ((Client.field3776 & class373.field2684.method1533()) != 0) {
                                field3687 = "";
                                field3669 = class32.field406;
                                field3667 = class32.field397;
                                field3668 = class32.field398;
                                method2256(1);
                                method2262();
                            } else if ((Client.field3776 & class373.field2669.method1533()) != 0) {
                                if ((Client.field3776 & class373.field2690.method1533()) != 0) {
                                    field3669 = class32.field393;
                                    field3667 = class32.field394;
                                    field3668 = class32.field395;
                                } else {
                                    field3669 = class32.field387;
                                    field3667 = class32.field388;
                                    field3668 = class32.field189;
                                }

                                field3687 = class32.field202;
                                method2256(1);
                                method2262();
                            } else if ((Client.field3776 & class373.field2690.method1533()) != 0) {
                                field3669 = class32.field478;
                                field3667 = class32.field412;
                                field3668 = class32.field472;
                                field3687 = class32.field202;
                                method2256(1);
                                method2262();
                            } else {
                                class311.method1371(false);
                            }
                        }
                    } else {
                        int var10;
                        if (field3665 == 1) {
                            while (true) {
                                if (!var30.method959()) {
                                    var10 = class317.field2287 - 80;
                                    var11 = true;
                                    if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                        class311.method1371(false);
                                    }

                                    var10 = class317.field2287 + 80;
                                    if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                        method2256(0);
                                    }
                                    break;
                                }

                                if (var30.field1648 == 84) {
                                    class311.method1371(false);
                                } else if (var30.field1648 == 13) {
                                    method2256(0);
                                }
                            }
                        } else {
                            int var15;
                            int var16;
                            boolean var35;
                            if (field3665 == 2) {
                                short var49 = 201;
                                var10 = var49 + 52;
                                if (var6 == 1 && var29 >= 241 && var29 < 255) {
                                    field3676 = 0;
                                }

                                var10 += 15;
                                if (var6 == 1 && var29 >= 256 && var29 < 270) {
                                    field3676 = 1;
                                }

                                var10 += 15;
                                var32 = true;
                                if (class259.field1933 != null) {
                                    var34 = class259.field1933.field42 / 2;
                                    if (var6 == 1 && var28 >= class259.field1933.field43 - var34 && var28 <= var34 + class259.field1933.field43 && var29 >= 346 && var29 < 361) {
                                        switch (field3664) {
                                            case 1:
                                                class33.method96(class32.field367, true, false);
                                                return;
                                            case 2:
                                                class33.method96("https://support.runescape.com/hc/en-gb", true, false);
                                        }
                                    }
                                }

                                var34 = class317.field2287 - 80;
                                var33 = true;
                                if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 301 && var29 <= 341) {
                                    field3678 = field3678.trim();
                                    if (field3678.length() == 0) {
                                        method2268(class32.field294, class32.field209, class32.field296);
                                        return;
                                    }

                                    if (field3671.length() == 0) {
                                        method2268(class32.field297, class32.field298, class32.field222);
                                        return;
                                    }

                                    method2268(class32.field400, class32.field401, class32.field386);
                                    Client.method2374(false);
                                    Client.method2459(20);
                                    return;
                                }

                                var34 = 80 + 180 + field3660;
                                if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 301 && var29 <= 341) {
                                    method2256(0);
                                    field3678 = "";
                                    field3671 = "";
                                    class386.field2764 = 0;
                                    class349.field2533 = "";
                                    field3675 = true;
                                }

                                var34 = -117 + class317.field2287;
                                var33 = true;
                                field3659 = var28 >= var34 && var28 < class472.field3389 + var34 && var29 >= 277 && var29 < 277 + class278.field2030;
                                if (var6 == 1 && field3659) {
                                    Client.field3829 = !Client.field3829;
                                    if (!Client.field3829 && class290.field2121.method2540() != null) {
                                        class290.field2121.method2539(null);
                                    }
                                }

                                var34 = 24 + class317.field2287;
                                var33 = true;
                                field3682 = var28 >= var34 && var28 < var34 + class472.field3389 && var29 >= 277 && var29 < class278.field2030 + 277;
                                if (var6 == 1 && field3682) {
                                    class290.field2121.method2549(!class290.field2121.method2532());
                                    if (!class290.field2121.method2532()) {
                                        field3678 = "";
                                        class290.field2121.method2539(null);
                                        method2262();
                                    }
                                }

                                while (true) {
                                    Transferable var46;
                                    do {
                                        while (true) {
                                            label1169:
                                            do {
                                                while (true) {
                                                    while (var30.method959()) {
                                                        if (var30.field1648 != 13) {
                                                            if (field3676 != 0) {
                                                                continue label1169;
                                                            }

                                                            method2260(var30.field1635);
                                                            if (var30.field1648 == 85 && field3678.length() > 0) {
                                                                field3678 = field3678.substring(0, field3678.length() - 1);
                                                            }

                                                            if (var30.field1648 == 84 || var30.field1648 == 80) {
                                                                field3676 = 1;
                                                            }

                                                            if (method2261(var30.field1635) && field3678.length() < 320) {
                                                                field3678 = field3678 + var30.field1635;
                                                            }
                                                        } else {
                                                            method2256(0);
                                                            field3678 = "";
                                                            field3671 = "";
                                                            class386.field2764 = 0;
                                                            class349.field2533 = "";
                                                            field3675 = true;
                                                        }
                                                    }

                                                    return;
                                                }
                                            } while (field3676 != 1);

                                            if (var30.field1648 == 85 && field3671.length() > 0) {
                                                field3671 = field3671.substring(0, field3671.length() - 1);
                                            } else if (var30.field1648 == 84 || var30.field1648 == 80) {
                                                field3676 = 0;
                                                if (var30.field1648 == 84) {
                                                    field3678 = field3678.trim();
                                                    if (field3678.length() == 0) {
                                                        method2268(class32.field294, class32.field209, class32.field296);
                                                        return;
                                                    }

                                                    if (field3671.length() == 0) {
                                                        method2268(class32.field297, class32.field298, class32.field222);
                                                        return;
                                                    }

                                                    method2268(class32.field400, class32.field401, class32.field386);
                                                    Client.method2374(false);
                                                    Client.method2459(20);
                                                    return;
                                                }
                                            }

                                            if ((var30.method958(82) || var30.method958(87)) && var30.field1648 == 67) {
                                                Clipboard var45 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                                var46 = var45.getContents(class268.field1973);
                                                var15 = 20 - field3671.length();
                                                break;
                                            }

                                            char var43 = var30.field1635;
                                            if (var43 >= ' ' && var43 < 127 || var43 > 127 && var43 < 160 || var43 > 160 && var43 <= 255) {
                                                var35 = true;
                                            } else {
                                                label1409:
                                                {
                                                    if (var43 != 0) {
                                                        char[] var44 = class209.field1685;

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

                                            if (var35 && method2261(var30.field1635) && field3671.length() < 20) {
                                                field3671 = field3671 + var30.field1635;
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
                                                label1390:
                                                {
                                                    if (var20 != 0) {
                                                        char[] var21 = class209.field1685;

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

                                            if (!var19 || !method2261(var48.charAt(var18))) {
                                                method2256(3);
                                                return;
                                            }
                                        }

                                        field3671 = field3671 + var48.substring(0, var47);
                                    } catch (UnsupportedFlavorException var24) {
                                    } catch (IOException var25) {
                                    }
                                }
                            } else {
                                class8 var12;
                                if (field3665 == 3) {
                                    var10 = field3660 + 180;
                                    var11 = true;
                                    var12 = var1.method925(25, class32.field421.length() - 34, class32.field421, var10, 241);
                                    if (var6 == 1 && var12.method13(var28, var29, (byte) -32)) {
                                        class33.method96(class32.field482, true, false);
                                    }

                                    var10 = 180 + field3660;
                                    var11 = true;
                                    if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 256 && var29 <= 296) {
                                        class311.method1370(false);
                                    }

                                    var10 = 180 + field3660;
                                    var11 = true;
                                    if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 306 && var29 <= 346) {
                                        class33.method96(class32.field367, true, false);
									}
                                } else {
                                    int var13;
                                    if (field3665 == 4) {
                                        var10 = 180 + field3660 - 80;
                                        var11 = true;
                                        if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                            class349.field2533.trim();
                                            if (class349.field2533.length() != 6) {
                                                method2268(class32.field330, class32.field214, class32.field293);
                                                return;
                                            }

                                            class386.field2764 = Integer.parseInt(class349.field2533);
                                            class349.field2533 = "";
                                            Client.method2374(true);
                                            method2268(class32.field400, class32.field401, class32.field386);
                                            Client.method2459(20);
                                            return;
                                        }

                                        if (var6 == 1 && var28 >= field3660 + 180 - 9 && var28 <= 130 + 180 + field3660 && var29 >= 263 && var29 <= 296) {
                                            field3675 = !field3675;
                                        }

                                        if (var6 == 1 && var28 >= 180 + field3660 - 34 && var28 <= 34 + 180 + field3660 && var29 >= 351 && var29 <= 363) {
                                            class33.method96(class32.field367, true, false);
                                        }

                                        var10 = 180 + field3660 + 80;
                                        if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                            method2256(0);
                                            field3678 = "";
                                            field3671 = "";
                                            class386.field2764 = 0;
                                            class349.field2533 = "";
                                        }

                                        while (var30.method959()) {
                                            var33 = false;

                                            for (var13 = 0; var13 < field3683.length(); ++var13) {
                                                if (var30.field1635 == field3683.charAt(var13)) {
                                                    var33 = true;
                                                    break;
                                                }
                                            }

                                            if (var30.field1648 == 13) {
                                                method2256(0);
                                                field3678 = "";
                                                field3671 = "";
                                                class386.field2764 = 0;
                                                class349.field2533 = "";
                                            } else {
                                                if (var30.field1648 == 85 && class349.field2533.length() > 0) {
                                                    class349.field2533 = class349.field2533.substring(0, class349.field2533.length() - 1);
                                                }

                                                if (var30.field1648 == 84) {
                                                    class349.field2533.trim();
                                                    if (class349.field2533.length() != 6) {
                                                        method2268(class32.field330, class32.field214, class32.field293);
                                                        return;
                                                    }

                                                    class386.field2764 = Integer.parseInt(class349.field2533);
                                                    class349.field2533 = "";
                                                    Client.method2374(true);
                                                    method2268(class32.field400, class32.field401, class32.field386);
                                                    Client.method2459(20);
                                                    return;
                                                }

                                                if (var33 && class349.field2533.length() < 6) {
                                                    class349.field2533 = class349.field2533 + var30.field1635;
                                                }
                                            }
                                        }
                                    } else {
                                        int var14;
                                        if (field3665 == 5) {
                                            var10 = 180 + field3660 - 80;
                                            var11 = true;
                                            if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                method2259();
                                                return;
                                            }

                                            var10 = 80 + 180 + field3660;
                                            if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                class311.method1371(true);
                                            }

                                            var33 = true;
                                            if (null != class399.field2821) {
                                                var13 = class399.field2821.field42 / 2;
                                                if (var6 == 1 && var28 >= class399.field2821.field43 - var13 && var28 <= class399.field2821.field43 + var13 && var29 >= 346 && var29 < 361) {
                                                    class33.method96(Client.method2418("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                                }
                                            }

                                            while (var30.method959()) {
                                                var35 = false;

                                                for (var14 = 0; var14 < field3677.length(); ++var14) {
                                                    if (var30.field1635 == field3677.charAt(var14)) {
                                                        var35 = true;
                                                        break;
                                                    }
                                                }

                                                if (var30.field1648 == 13) {
                                                    class311.method1371(true);
                                                } else {
                                                    if (var30.field1648 == 85 && field3678.length() > 0) {
                                                        field3678 = field3678.substring(0, field3678.length() - 1);
                                                    }

                                                    if (var30.field1648 == 84) {
                                                        method2259();
                                                        return;
                                                    }

                                                    if (var35 && field3678.length() < 320) {
                                                        field3678 = field3678 + var30.field1635;
                                                    }
                                                }
                                            }
                                        } else if (field3665 != 6) {
                                            if (field3665 == 7) {
                                                if (class4.field21 && !Client.field4010) {
                                                    var10 = class317.field2287 - 150;
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

                                                        field3670 = var14;
                                                    }

                                                    var14 = 180 + field3660 - 80;
                                                    boolean var38 = true;
                                                    boolean var42;
                                                    if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= 301 && var29 <= 341) {
                                                        var42 = method2258();
                                                        if (var42) {
                                                            Client.method2459(50);
                                                            return;
                                                        }
                                                    }

                                                    var14 = field3660 + 180 + 80;
                                                    if (var6 == 1 && var28 >= var14 - 75 && var28 <= var14 + 75 && var29 >= 301 && var29 <= 341) {
                                                        field3673 = new String[8];
                                                        class311.method1371(true);
                                                    }

                                                    while (var30.method959()) {
                                                        if (var30.field1648 == 101) {
                                                            field3673[field3670] = null;
                                                        }

                                                        if (var30.field1648 == 85) {
                                                            if (field3673[field3670] == null && field3670 > 0) {
                                                                --field3670;
                                                            }

                                                            field3673[field3670] = null;
                                                        }

                                                        if (var30.field1635 >= '0' && var30.field1635 <= '9') {
                                                            field3673[field3670] = String.valueOf(var30.field1635);
                                                            if (field3670 < 7) {
                                                                ++field3670;
                                                            }
                                                        }

                                                        if (var30.field1648 == 84) {
                                                            var42 = method2258();
                                                            if (var42) {
                                                                Client.method2459(50);
                                                            }

                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    var10 = 180 + field3660 - 80;
                                                    var11 = true;
                                                    if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                        class33.method96(Client.method2418("secure", true) + "m=dob/set_dob.ws", true, false);
                                                        method2268(class32.field431, class32.field432, class32.field316);
                                                        method2256(6);
                                                        return;
                                                    }

                                                    var10 = 80 + field3660 + 180;
                                                    if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                        class311.method1371(true);
                                                    }
                                                }
                                            } else if (field3665 == 8) {
                                                var10 = 180 + field3660 - 80;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                    class33.method96("https://www.jagex.com/terms/privacy", true, false);
                                                    method2268(class32.field431, class32.field432, class32.field316);
                                                    method2256(6);
                                                    return;
                                                }

                                                var10 = field3660 + 180 + 80;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                    class311.method1371(true);
                                                }
                                            } else if (field3665 == 9) {
                                                var10 = 180 + field3660;
                                                var11 = true;
                                                if (var30.field1648 == 84 || var30.field1648 == 13 || var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
                                                    class311.method1370(false);
                                                }
                                            } else if (field3665 == 10) {
                                                var10 = 180 + field3660;
                                                var11 = true;
                                                if (var30.field1648 == 84 || var6 == 1 && var28 >= var10 - 109 && var28 <= var10 + 109 && var29 >= 209 && var29 <= 277) {
                                                    method2268(class32.field400, class32.field401, class32.field386);
                                                    Client.field3820 = class241.field1841;
                                                    Client.method2374(false);
                                                    Client.method2459(20);
                                                }
                                            } else if (field3665 == 12) {
                                                var10 = class317.field2287;
                                                short var36 = 233;
                                                var12 = var2.method925(0, 30, class32.field463, var10, 233);
                                                class8 var37 = var2.method925(32, 32, class32.field463, var10, 233);
                                                class8 var39 = var2.method925(70, 34, class32.field463, var10, 233);
                                                var34 = var36 + 17;
                                                class8 var40 = var2.method925(0, 34, class32.field464, var10, 250);
                                                if (var6 == 1) {
                                                    if (var12.method13(var28, var29, (byte) -43)) {
                                                        class33.method96("https://www.jagex.com/terms", true, false);
                                                    } else if (var37.method13(var28, var29, (byte) -50)) {
                                                        class33.method96("https://www.jagex.com/terms/privacy", true, false);
                                                    } else if (var39.method13(var28, var29, (byte) -15) || var40.method13(var28, var29, (byte) -15)) {
                                                        class33.method96("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                                    }
                                                }

                                                var10 = class317.field2287 - 80;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
                                                    Client.method2332();
                                                    class311.method1370(true);
                                                }

                                                var10 = class317.field2287 + 80;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 291 && var29 <= 331) {
                                                    field3665 = 13;
                                                }
                                            } else if (field3665 == 13) {
                                                var10 = class317.field2287;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                    class311.method1370(true);
                                                }
                                            } else if (field3665 == 14) {
                                                String var41 = "";
                                                switch (field3663) {
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
                                                        class311.method1371(false);
                                                }

                                                var34 = field3660 + 180;
                                                var33 = true;
                                                if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 256 && var29 <= 296) {
                                                    class33.method96(var41, true, false);
                                                    method2268(class32.field431, class32.field432, class32.field316);
                                                    method2256(6);
                                                    return;
                                                }

                                                var34 = 180 + field3660;
                                                var33 = true;
                                                if (var6 == 1 && var28 >= var34 - 75 && var28 <= var34 + 75 && var29 >= 306 && var29 <= 346) {
                                                    class311.method1371(false);
                                                }
                                            } else if (field3665 == 24) {
                                                var10 = field3660 + 180;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 281 && var29 <= 321) {
                                                    class311.method1370(false);
                                                }
                                            } else if (field3665 == 32) {
                                                var10 = field3660 + 180 - 80;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                    class33.method96(Client.method2418("secure", true) + "m=dob/set_dob.ws", true, false);
                                                    method2268(class32.field431, class32.field432, class32.field316);
                                                    method2256(6);
                                                    return;
                                                }

                                                var10 = 80 + 180 + field3660;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 301 && var29 <= 341) {
                                                    class311.method1371(true);
                                                }
                                            } else if (field3665 == 33) {
                                                var10 = field3660 + 180;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 256 && var29 <= 296) {
                                                    class33.method96(class32.field482, true, false);
                                                }

                                                var10 = field3660 + 180;
                                                var11 = true;
                                                if (var6 == 1 && var28 >= var10 - 75 && var28 <= var10 + 75 && var29 >= 306 && var29 <= 346) {
                                                    class311.method1371(true);
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                do {
                                                    if (!var30.method959()) {
                                                        var32 = true;
                                                        if (var6 == 1 && var29 >= 301 && var29 <= 341) {
                                                            class311.method1371(true);
                                                        }

                                                        return;
                                                    }
                                                } while (var30.field1648 != 84 && var30.field1648 != 13);

                                                class311.method1371(true);
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

    static boolean method2258() {
        Date var1;
        try {
            var1 = class115.method524();
        } catch (ParseException var5) {
            method2266("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }

        if (var1 == null) {
            return false;
        } else {
            boolean var2 = method2265(var1);
            Date var4 = method2267();
            boolean var3 = var1.after(var4);
            if (!var3) {
                method2256(7);
                method2268("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                return false;
            } else {
                if (!var2) {
                    class343.field2464 = 8388607;
                } else {
                    class343.field2464 = (int) (var1.getTime() / 86400000L - 11745L);
                }

                return true;
            }
        }
    }

    static Date method2267() {
        Calendar var1 = Calendar.getInstance();
        var1.set(2, 0);
        var1.set(5, 1);
        var1.set(1, 1900);
        return var1.getTime();
    }

    static boolean method2265(Date var0) {
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

    static void method2266(String var0, String var1, String var2) {
        method2256(7);
        method2268(var0, var1, var2);
    }

    static boolean method2260(char var0) {
        for (int var2 = 0; var2 < field3677.length(); ++var2) {
            if (var0 == field3677.charAt(var2)) {
                return true;
            }
        }

        return false;
    }

    static boolean method2261(char var0) {
        return field3677.indexOf(var0) != -1;
    }

    static void method2259() {
        field3678 = field3678.trim();
        if (field3678.length() == 0) {
            method2268(class32.field434, class32.field435, class32.field436);
        } else {
            long var2;
            try {
                URL var4 = new URL(Client.method2418("services", false) + "m=accountappeal/login.ws");
                URLConnection var5 = var4.openConnection();
                var5.setRequestProperty("connection", "close");
                var5.setDoInput(true);
                var5.setDoOutput(true);
                var5.setConnectTimeout(5000);
                OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
                var6.write("data1=req");
                var6.flush();
                InputStream var7 = var5.getInputStream();
                class78 var8 = new class78(new byte[1000]);

                while (true) {
                    int var9 = var7.read(var8.field695, var8.field697, 1000 - var8.field697);
                    if (var9 == -1) {
                        var8.field697 = 0;
                        long var12 = var8.method265();
                        var2 = var12;
                        break;
                    }

                    var8.field697 += var9;
                    if (var8.field697 >= 1000) {
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
                var1 = class343.method1614(var2, field3678);
            }

            switch (var1) {
                case 2:
                    method2268(class32.field437, class32.field438, class32.field439);
                    method2256(6);
                    break;
                case 3:
                    method2268(class32.field471, class32.field441, class32.field246);
                    break;
                case 4:
                    method2268(class32.field443, class32.field444, class32.field428);
                    break;
                case 5:
                    method2268(class32.field446, class32.field447, class32.field440);
                    break;
                case 6:
                    method2268(class32.field449, class32.field210, class32.field313);
                    break;
                case 7:
                    method2268(class32.field178, class32.field453, class32.field277);
            }

        }
    }

    static void method2268(String var0, String var1, String var2) {
        field3669 = var0;
        field3667 = var1;
        field3668 = var2;
    }

    static void method2257() {
        if (class137.method633()) {
            field3679 = true;
            field3681 = 0;
            field3686 = 0;
        }

    }

    static void method2264() {
        field3679 = false;
        field3658.method1543(field3654, 0);
        class8.field44.method1543(field3654 + 382, 0);
        class352.field2545.method2590(382 + field3654 - class352.field2545.field4285 / 2, 18);
    }

    static void method2271() {
        method2256(24);
        method2268(class32.field420, class32.field407, class32.field408);
    }

    static void method2256(int var0) {
        if (var0 != field3665) {
            field3665 = var0;
        }
    }

    static void method2272(String var0) {
        field3672 = class483.method2231(var0);
    }
}
