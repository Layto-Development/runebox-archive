import java.text.DecimalFormat;
import java.util.ArrayList;

public class class116 {
	static boolean field1091;
	static boolean field1107;
	static boolean field1111;
	static boolean field1114;
	static class115 field1090;
	static class25 field1085;
	static class25 field1088;
	static class25 field1089;
	static class25[] field1087;
	static int field1086;
	static int field1092;
	static int field1093;
	static int field1095;
	static int field1096;
	static int field1097;
	static int field1102;
	static int field1108;
	static int field1112;
	static int field1113;
	static int field1118;
	static String field1094;
	static String field1099;
	static String field1100;
	static String field1101;
	static String field1103;
	static String field1104;
	static String field1109;
	static String field1110;
	static String field1115;
	static String field1119;
	static String[] field1098;
	static String[] field1105;
	static String[] field1117;
	static String[] field1120;
	static long field1106;
	static long field1116;

	static {
		field1086 = 0;
		field1092 = field1086 + 202;
		field1093 = 10;
		field1094 = "";
		field1095 = -1;
		field1096 = 1;
		field1097 = 0;
		field1119 = "";
		field1101 = "";
		field1099 = "";
		field1100 = "";
		field1110 = "";
		field1103 = "";
		field1102 = 0;
		field1105 = new String[8];
		field1104 = "";
		field1091 = false;
		field1114 = false;
		field1107 = true;
		field1108 = 0;
		field1109 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		field1115 = "1234567890";
		field1111 = false;
		field1112 = -1;
		field1113 = 0;
		field1118 = 0;
		new DecimalFormat("##0.00");
		new class463();
		field1106 = -1L;
		field1116 = -1L;
		field1098 = new String[]{"title.jpg"};
		field1117 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field1120 = new String[]{"logo_speedrunning"};
	}

	class116() throws Throwable {
	}

	public static class176 method737() {
		synchronized(class176.field1697) {
			if (class505.field4176 == 0) {
				return new class176();
			} else {
				class176.field1697[--class505.field4176].method999();
				return class176.field1697[class505.field4176];
			}
		}
	}

	static void method739(int var0, int var1) {
		if (class176.field1701.method2488() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new class104(class79.field843, var0, 0, class176.field1701.method2488(), false));
			class81.method545(var3, 0, 0, 0, 0, true);
			Client.field275 = true;
		}

	}

	static void method738(class60[] var0, class60 var1, boolean var2) {
		int var4 = var1.field731 != 0 ? var1.field731 : var1.field659;
		int var5 = var1.field666 != 0 ? var1.field666 : var1.field636;
		class337.method1867(var0, var1.field644, var4, var5, var2);
		if (null != var1.field776) {
			class337.method1867(var1.field776, var1.field644, var4, var5, var2);
		}

		class534 var6 = (class534)Client.field24.method1492((long)var1.field644);
		if (var6 != null) {
			int var7 = var6.field4270;
			if (class292.method1669(var7)) {
				class337.method1867(class160.field1484[var7], -1, var4, var5, var2);
			}
		}

		if (var1.field670 == 1337) {
		}

	}
}
