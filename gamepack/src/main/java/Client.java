import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends class522 implements class297, OAuthApi, class273 {

	public static boolean field925;

	public static class354 field1082;

	public static int field1021;

	public static int field1080;

	public static int field898;

	public static int field986;

	public static final class155 field963;

	static boolean field1001;

	static boolean field1011;

	static boolean field1024;

	static boolean field1031;

	static boolean field1045;

	static boolean field1056;

	static boolean field1058;

	static boolean field1087;

	static boolean field1093;

	static boolean field1129;

	static boolean field1133;

	static boolean field1134;

	static boolean field1136;

	static boolean field1159;

	static boolean field1160;

	static boolean field1161;

	static boolean field1162;

	static boolean field1165;

	static boolean field1170;

	static boolean field1187;

	static boolean field1194;

	static boolean field902;

	static boolean field909;

	static boolean field911;

	static boolean field917;

	static boolean field938;

	static boolean field952;

	static boolean field962;

	static boolean field965;

	static boolean field974;

	static boolean field983;

	static boolean field990;

	static boolean field999;

	static boolean[] field1035;

	static boolean[] field1055;

	static boolean[] field1121;

	static boolean[] field1122;

	static boolean[] field1166;

	static boolean[] field908;

	static byte[] field1181;

	static class106 field1094;

	static class106 field984;

	static class108 field1163;

	static class185 field1189;

	static class204 field1188;

	static class225 field1148;

	static class330 field1137;

	static class345[] field1143;

	static class353 field954;

	static class353 field980;

	static class354 field1075;

	static class354 field1086;

	static class354 field1101;

	static class354 field1191;

	static class373[] field958;

	static class389 field927;

	static class389 field928;

	static class397 field1112;

	static class399 field966;

	static class4 field930;

	static class429 field953;

	static class438[] field973;

	static class449 field1025;

	static class449 field1039;

	static class449 field1099;

	static class449 field1113;

	static class449 field1115;

	static class449 field1152;

	static class449 field1168;

	static class449[][][] field1038;

	static class479 field1046;

	static class487[] field942;

	static class506 field1184;

	static class508 field943;

	static class516[] field1176;

	static class518[] field1142;

	static class521 field1043;

	static class535 field1117;

	static class535 field919;

	static class82[] field1071;

	static class84 field978;

	static class84[] field1156;

	static int field1000;

	static int field1002;

	static int field1003;

	static int field1004;

	static int field1008;

	static int field1012;

	static int field1015;

	static int field1016;

	static int field1017;

	static int field1018;

	static int field1019;

	static int field1023;

	static int field1026;

	static int field1027;

	static int field1029;

	static int field1032;

	static int field1036;

	static int field1037;

	static int field1040;

	static int field1047;

	static int field1054;

	static int field1059;

	static int field1060;

	static int field1061;

	static int field1062;

	static int field1063;

	static int field1065;

	static int field1066;

	static int field1068;

	static int field1069;

	static int field1070;

	static int field1072;

	static int field1073;

	static int field1074;

	static int field1076;

	static int field1077;

	static int field1078;

	static int field1084;

	static int field1085;

	static int field1088;

	static int field1089;

	static int field1090;

	static int field1096;

	static int field1098;

	static int field1100;

	static int field1102;

	static int field1103;

	static int field1104;

	static int field1105;

	static int field1106;

	static int field1107;

	static int field1108;

	static int field1111;

	static int field1114;

	static int field1118;

	static int field1119;

	static int field1127;

	static int field1131;

	static int field1132;

	static int field1135;

	static int field1138;

	static int field1144;

	static int field1145;

	static int field1149;

	static int field1151;

	static int field1153;

	static int field1157;

	static int field1167;

	static int field1169;

	static int field1179;

	static int field1180;

	static int field1183;

	static int field1185;

	static int field1186;

	static int field1192;

	static int field1196;

	static int field1197;

	static int field1201;

	static int field899;

	static int field900;

	static int field901;

	static int field903;

	static int field904;

	static int field906;

	static int field910;

	static int field912;

	static int field913;

	static int field914;

	static int field915;

	static int field916;

	static int field918;

	static int field920;

	static int field922;

	static int field923;

	static int field929;

	static int field931;

	static int field932;

	static int field933;

	static int field934;

	static int field935;

	static int field936;

	static int field937;

	static int field939;

	static int field950;

	static int field951;

	static int field959;

	static int field964;

	static int field968;

	static int field969;

	static int field970;

	static int field971;

	static int field972;

	static int field976;

	static int field977;

	static int field979;

	static int field981;

	static int field982;

	static int field987;

	static int field988;

	static int field989;

	static int field991;

	static int field992;

	static int field993;

	static int field994;

	static int field995;

	static int field996;

	static int field997;

	static int field998;

	static int[] field1005;

	static int[] field1006;

	static int[] field1009;

	static int[] field1010;

	static int[] field1022;

	static int[] field1030;

	static int[] field1042;

	static int[] field1048;

	static int[] field1049;

	static int[] field1051;

	static int[] field1052;

	static int[] field1079;

	static int[] field1091;

	static int[] field1095;

	static int[] field1097;

	static int[] field1109;

	static int[] field1110;

	static int[] field1116;

	static int[] field1120;

	static int[] field1123;

	static int[] field1124;

	static int[] field1125;

	static int[] field1126;

	static int[] field1130;

	static int[] field1139;

	static int[] field1140;

	static int[] field1146;

	static int[] field1147;

	static int[] field1154;

	static int[] field1155;

	static int[] field1158;

	static int[] field1164;

	static int[] field1182;

	static int[] field1190;

	static int[] field1193;

	static int[] field1199;

	static int[] field1200;

	static int[] field897;

	static int[] field905;

	static int[] field924;

	static int[] field957;

	static int[] field960;

	static int[][] field1014;

	static int[][] field907;

	static int[][][] field975;

	static String field1064;

	static String field1081;

	static String field1092;

	static String field926;

	static String[] field1013;

	static String[] field1053;

	static String[] field1172;

	static String[] field921;

	static ArrayList field1195;

	static HashMap field967;

	static List field1067;

	static long field1028;

	static long field1041;

	static long field1128;

	static long field1141;

	static long field961;

	static long[] field1044;

	static short field1007;

	static short field1057;

	static short field1171;

	static short field1173;

	static short field1174;

	static short field1175;

	static short field1177;

	static short field1178;

	static final class469 field1198;

	static final int[] field1033;

	static final int[] field1083;

	static final String field1034;

	static final String field1150;

	boolean field945;

	class171 field941;

	class187 field985;

	class348 field1020;

	class348 field947;

	class520 field955;

	OtlTokenRequester field1050;

	RefreshAccessTokenRequester field948;

	int field946;

	String field940;

	Future field944;

	Future field949;

	long field956;

	static {
		field938 = true;
		field898 = 1;
		field899 = 0;
		field923 = 0;
		field925 = false;
		field902 = false;
		field903 = -1;
		field904 = -1;
		field916 = -1;
		field1133 = false;
		field1080 = 216;
		field982 = 0;
		field909 = false;
		field911 = true;
		field1201 = 0;
		field961 = -1L;
		field914 = -1;
		field915 = -1;
		field1041 = -1L;
		field917 = true;
		field918 = 0;
		field976 = 0;
		field920 = 0;
		field939 = 0;
		field922 = 0;
		field1065 = 0;
		field929 = 0;
		field1085 = 0;
		field1118 = 0;
		field927 = class389.field3100;
		field928 = class389.field3100;
		field962 = false;
		field930 = class4.field15;
		field931 = 0;
		field932 = 0;
		field1078 = 0;
		field934 = 0;
		field913 = 0;
		field964 = 0;
		field1036 = 0;
		field1148 = class225.field1993;
		field943 = class508.field4077;
		int var2 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var3 = new byte[var2];
		int var4;
		char var5;
		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte) var5;
			}
		}
		String var0 = class477.method2317(var3, 0, var3.length);
		field1150 = var0;
		var2 = "com_jagex_auth_desktop_runelite:public".length();
		var3 = new byte[var2];
		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte) var5;
			}
		}
		var0 = class477.method2317(var3, 0, var3.length);
		field1034 = var0;
		field952 = false;
		field953 = new class429();
		field1181 = null;
		field958 = new class373[65536];
		field959 = 0;
		field897 = new int[65536];
		field1012 = 0;
		field1109 = new int[250];
		field963 = new class155();
		field951 = 0;
		field965 = false;
		field966 = new class399();
		field967 = new HashMap();
		field968 = 0;
		field1002 = 1;
		field970 = 0;
		field971 = 1;
		field972 = 0;
		field973 = new class438[4];
		field974 = false;
		field975 = new int[4][13][13];
		field1083 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		field977 = 0;
		field979 = 2301979;
		field1090 = 5063219;
		field981 = 3353893;
		field1169 = 7759444;
		field983 = false;
		field1102 = 0;
		field937 = 128;
		field1076 = 0;
		field987 = 0;
		field988 = 0;
		field910 = 0;
		field1054 = 0;
		field991 = 0;
		field992 = 50;
		field993 = 0;
		field994 = 0;
		field995 = 0;
		field996 = 12;
		field997 = 6;
		field998 = 0;
		field999 = false;
		field1000 = 0;
		field1001 = false;
		field1040 = 0;
		field1003 = 0;
		field935 = 50;
		field1005 = new int[field935];
		field1006 = new int[field935];
		field957 = new int[field935];
		field1182 = new int[field935];
		field1009 = new int[field935];
		field1010 = new int[field935];
		field907 = new int[field935][];
		field1158 = new int[field935];
		field1013 = new String[field935];
		field1014 = new int[104][104];
		field1068 = 0;
		field1016 = -1;
		field1017 = -1;
		field1018 = 0;
		field1019 = 0;
		field1077 = 0;
		field1135 = 0;
		field1187 = true;
		field1023 = 0;
		field1024 = true;
		field1071 = new class82[2048];
		field1026 = -1;
		field1027 = 0;
		field1028 = -1L;
		field1136 = true;
		field901 = 0;
		field1167 = 0;
		field924 = new int[1000];
		field1033 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		field921 = new String[8];
		field1035 = new boolean[8];
		field1079 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		field1037 = -1;
		field1038 = new class449[4][104][104];
		field1039 = new class449();
		field1025 = new class449();
		field1168 = new class449();
		field1042 = new int[25];
		field1190 = new int[25];
		field1193 = new int[25];
		field1045 = false;
		field1011 = false;
		field1047 = 0;
		field1048 = new int[500];
		field1049 = new int[500];
		field1091 = new int[500];
		field1051 = new int[500];
		field1052 = new int[500];
		field1053 = new String[500];
		field1172 = new String[500];
		field1055 = new boolean[500];
		field1056 = false;
		field1031 = false;
		field1058 = true;
		field1059 = -1;
		field1060 = -1;
		field1061 = 0;
		field1062 = 50;
		field1063 = 0;
		field1064 = null;
		field990 = false;
		field1066 = -1;
		field1032 = -1;
		field1081 = null;
		field1092 = null;
		field1070 = -1;
		field919 = new class535(8);
		field912 = 0;
		field1073 = -1;
		field1074 = 0;
		field1075 = null;
		field1015 = 0;
		field1185 = 0;
		field986 = 0;
		field933 = -1;
		field1194 = false;
		field1191 = null;
		field1082 = null;
		field1101 = null;
		field1084 = 0;
		field1157 = 0;
		field1086 = null;
		field1087 = false;
		field1088 = -1;
		field1089 = -1;
		field1134 = false;
		field936 = -1;
		field1008 = -1;
		field1093 = false;
		field900 = 1;
		field1095 = new int[32];
		field1096 = 0;
		field1097 = new int[32];
		field1098 = 0;
		field1022 = new int[32];
		field1100 = 0;
		field1164 = new int[32];
		field1029 = 0;
		field1103 = 0;
		field1104 = 0;
		field1105 = 0;
		field1106 = 0;
		field1107 = 0;
		field1108 = 0;
		field969 = 0;
		field950 = 0;
		field1111 = 0;
		field1112 = new class397();
		field1113 = new class449();
		field1099 = new class449();
		field1115 = new class449();
		field1152 = new class449();
		field1117 = new class535(512);
		field1069 = 0;
		field1119 = -2;
		field908 = new boolean[100];
		field1121 = new boolean[100];
		field1122 = new boolean[100];
		field1123 = new int[100];
		field1124 = new int[100];
		field1125 = new int[100];
		field1126 = new int[100];
		field1127 = 0;
		field1128 = 0L;
		field1129 = true;
		field1130 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		field1131 = 0;
		field1132 = 0;
		field926 = "";
		field1044 = new long[100];
		field906 = 0;
		field1046 = new class479();
		field1137 = new class330();
		field1138 = 0;
		field1139 = new int[128];
		field1140 = new int[128];
		field1141 = -1L;
		field1142 = new class518[4];
		field1143 = new class345[4];
		field1144 = -1;
		field1145 = 0;
		field1146 = new int[1000];
		field1147 = new int[1000];
		field1156 = new class84[1000];
		field1149 = 0;
		field1072 = 0;
		field1151 = 0;
		field1170 = false;
		field1153 = 0;
		field1154 = new int[50];
		field1155 = new int[50];
		field1110 = new int[50];
		field905 = new int[50];
		field942 = new class487[50];
		field1159 = false;
		field1160 = false;
		field1161 = false;
		field1162 = false;
		field1163 = null;
		field954 = null;
		field980 = null;
		field1165 = false;
		field1166 = new boolean[5];
		field960 = new int[5];
		field1120 = new int[5];
		field1030 = new int[5];
		field1116 = new int[5];
		field1171 = 256;
		field1057 = 205;
		field1173 = 256;
		field1174 = 320;
		field1175 = 1;
		field1007 = 32767;
		field1177 = 1;
		field1178 = 32767;
		field1179 = 0;
		field1180 = 0;
		field1114 = 0;
		field989 = 0;
		field1183 = 0;
		field1184 = new class506();
		field1004 = -1;
		field1186 = -1;
		field1043 = new class275();
		field1176 = new class516[8];
		field1188 = new class204();
		field1189 = new class185(8, class499.field3998);
		field1094 = new class106(64);
		field984 = new class106(64);
		field1192 = -1;
		field1021 = -1;
		field1067 = new ArrayList();
		field1195 = new ArrayList(10);
		field1196 = 0;
		field1197 = 0;
		field1198 = new class469();
		field1199 = new int[50];
		field1200 = new int[50];
	}

	public Client() {
		this.field945 = false;
		this.field946 = 0;
		this.field956 = -1L;
	}

	@Override
	protected final void method2546() {
	}

	@Override
	public final void init() {
		if (this.method2549()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (null != var2) {
					switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase(class74.field733)) {
								field925 = true;
							} else {
								field925 = false;
							}
							break;
						case 4:
							if (field904 == -1) {
								field904 = Integer.parseInt(var2);
							}
							break;
						case 5:
							field899 = Integer.parseInt(var2);
							break;
						case 6:
							class162.field1645 = class267.method1468(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							class480[] var5 = class480.method2326();
							int var6 = 0;
							class480 var12;
							while (true) {
								if (var6 >= var5.length) {
									var12 = null;
									break;
								}
								class480 var7 = var5[var6];
								if (var4 == var7.field3767) {
									var12 = var7;
									break;
								}
								++var6;
							}
							class532.field4203 = var12;
							break;
						case 8:
							if (var2.equalsIgnoreCase(class74.field733)) {
							}
							break;
						case 9:
							class101.field1269 = var2;
							break;
						case 10:
							class476[] var11 = new class476[] { class476.field3732, class476.field3739, class476.field3733, class476.field3738, class476.field3734, class476.field3736 };
							class359.field2855 = (class476) class433.method2167(var11, Integer.parseInt(var2));
							if (class476.field3736 == class359.field2855) {
								class267.field2198 = class79.field797;
							} else {
								class267.field2198 = class79.field799;
							}
							break;
						case 11:
							class351.field2673 = var2;
							break;
						case 12:
							field898 = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							class359.field2854 = Integer.parseInt(var2);
							break;
						case 15:
							field923 = Integer.parseInt(var2);
							break;
						case 17:
							class176.field1755 = var2;
							break;
						case 21:
							field903 = Integer.parseInt(var2);
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								field1080 = Integer.parseInt(var2);
							} else {
								field1080 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
					}
				}
			}
			class372.field2993 = false;
			field902 = false;
			class112.field1318 = this.getCodeBase().getHost();
			class401.field3173 = new class9();
			String var9 = class532.field4203.field3762;
			byte var10 = 0;
			if ((field899 & class351.field2656.method1362()) != 0) {
				class512.field4086 = "beta";
			}
			try {
				class89.method403("oldschool", class512.field4086, var9, var10, 22);
			} catch (Exception var8) {
				class156.method917((String) null, var8);
			}
			class501.field4023 = this;
			class472.field3724 = field904;
			method449();
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field945 = true;
			}
			if (field916 == -1) {
				if (!this.method407() && !this.method430((byte) 106)) {
					field916 = 0;
				} else {
					field916 = 5;
				}
			}
			this.method2541(765, 503, 216, 1);
		}
	}

	@Override
	protected void finalize() throws Throwable {
		class388.method2018(this);
		super.finalize();
	}

	boolean method435() {
		return this.field946 == 1;
	}

	@Override
	public void setClient(int var1) {
		this.field946 = var1;
	}

	@Override
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (null != var1) {
			this.field1050 = var1;
			class174.method1030(10);
		}
	}

	@Override
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field948 = var1;
		}
	}

	@Override
	public boolean isOnLoginScreen() {
		return field982 == 10;
	}

	@Override
	public long getAccountHash() {
		return this.field956;
	}

	boolean method407() {
		return null != class530.field4194 && !class530.field4194.trim().isEmpty() && class488.field3918 != null && !class488.field3918.trim().isEmpty();
	}

	boolean method430(byte var1) {
		return null != class81.field802 && !class81.field802.trim().isEmpty() && class241.field2051 != null && !class241.field2051.trim().isEmpty();
	}

	boolean method408() {
		return null != this.field1050;
	}

	void method433(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(class351.field2673 + "shield/oauth/token" + (new class539(var3)).method2604());
		class324 var5 = new class324();
		if (this.method435()) {
			var5.method1715(field1034);
		} else {
			var5.method1715(field1150);
		}
		var5.method1714("Host", (new URL(class351.field2673)).getHost());
		var5.method1717(class533.field4206);
		class488 var6 = class488.field3911;
		RefreshAccessTokenRequester var7 = this.field948;
		if (null != var7) {
			this.field949 = var7.request(var6.method2348(), var4, var5.method1713(), "");
		} else {
			class98 var8 = new class98(var4, var6, var5, this.field945);
			this.field947 = this.field941.method991(var8);
		}
	}

	void method409(String var1) throws IOException {
		URL var3 = new URL(class351.field2673 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class324 var4 = new class324();
		var4.method1724(var1);
		class488 var5 = class488.field3910;
		OtlTokenRequester var6 = this.field1050;
		if (null != var6) {
			this.field944 = var6.request(var5.method2348(), var3, var4.method1713(), "");
		} else {
			class98 var7 = new class98(var3, var5, var4, this.field945);
			this.field1020 = this.field941.method991(var7);
		}
	}

	void method429(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(class351.field2673 + "game-session/v1/tokens");
		class98 var5 = new class98(var4, class488.field3911, this.field945);
		var5.method623().method1724(var1);
		var5.method623().method1717(class533.field4206);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", var2);
		var5.method619(new class217(var6));
		this.field1020 = this.field941.method991(var5);
	}

	@Override
	protected final void method2552() {
		class248.method1434(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
		class10.field58 = field923 == 0 ? 43594 : field898 + 40000;
		class283.field2297 = field923 == 0 ? 443 : field898 + 50000;
		class216.field1946 = class10.field58;
		class64.field686 = class414.field3215;
		class425.field3287 = class414.field3218;
		class506.field4063 = class414.field3216;
		class506.field4070 = class414.field3217;
		class28.field142 = new class86(this.field945, 216);
		this.method2527();
		this.method2529();
		class538.field4240 = this.method2556();
		this.method2554(field1137, 0);
		this.method2554(field1046, 1);
		class294.field2341 = new class27(255, class89.field886, class89.field887, 500000);
		class6 var3 = null;
		class173 var4 = new class173();
		try {
			var3 = class89.method402("", class359.field2855.field3737, false);
			byte[] var5 = new byte[(int) var3.method14()];
			int var7;
			for (int var6 = 0; var6 < var5.length; var6 += var7) {
				var7 = var3.method15(var5, var6, var5.length - var6);
				if (var7 == -1) {
					throw new IOException();
				}
			}
			var4 = new class173(new class187(var5));
		} catch (Exception var9) {
		}
		try {
			if (null != var3) {
				var3.method16();
			}
		} catch (Exception var8) {
		}
		class83.field841 = var4;
		this.method2524();
		class41.method176(this, class348.field2630);
		class328.method1729(class83.field841.method1015());
		class147.field1555 = new class161(class267.field2198);
		this.field941 = new class171("tokenRequest", 1, 1);
		if (!class388.field3093.contains(this)) {
			class388.field3093.add(this);
		}
		class63.field680 = new class370[1];
		class246 var10 = class246.field2090;
		class63.field680[0] = new class370(var10.field2092, var10.field2097);
	}

	@Override
	protected final void method2553() {
		++field1201;
		this.method412();
		while (true) {
			class524 var2;
			synchronized (class195.field1863) {
				var2 = (class524) class195.field1861.method2216();
			}
			if (null == var2) {
				boolean var8 = class388.method2020();
				if (var8 && field1170 && null != class493.field3983) {
					class493.field3983.method2597();
				}
				method561();
				field1046.method2319();
				this.method2528();
				synchronized (class422.field3267) {
					class422.field3260 = class422.field3256;
					class422.field3270 = class422.field3257;
					class422.field3253 = class422.field3258;
					class422.field3261 = class422.field3259;
					class422.field3264 = class422.field3262;
					class422.field3265 = class422.field3271;
					class422.field3266 = class422.field3269;
					class422.field3254 = class422.field3263;
					class422.field3262 = 0;
				}
				if (null != class538.field4240) {
					int var3 = class538.field4240.method2064();
					field1111 = var3;
				}
				if (field982 == 0) {
					method529();
					class522.method2557();
				} else if (field982 == 5) {
					class174.method1043(this, class123.field1449, class281.field2287);
					method529();
					class522.method2557();
				} else if (field982 != 10 && field982 != 11) {
					if (field982 == 20) {
						class174.method1043(this, class123.field1449, class281.field2287);
						this.method413();
					} else if (field982 == 50) {
						class174.method1043(this, class123.field1449, class281.field2287);
						this.method413();
					} else if (field982 == 25) {
						method578();
					}
				} else {
					class174.method1043(this, class123.field1449, class281.field2287);
				}
				if (field982 == 30) {
					this.method432();
				} else if (field982 == 40 || field982 == 45) {
					this.method413();
				}
				return;
			}
			var2.field4171.method46(var2.field4170, (int) var2.field785, var2.field4168, false);
		}
	}

	@Override
	protected final void method2542(boolean var1) {
		if ((field982 == 10 || field982 == 20 || field982 == 30) && 0L != field1128 && class48.method197() > field1128) {
			class328.method1729(method531());
		}
		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field908[var3] = true;
			}
		}
		if (field982 == 0) {
			this.method2539(class174.field1725, class174.field1726, var1);
		} else if (field982 == 5) {
			class301.method1599(class484.field3894, class123.field1449, class281.field2287);
		} else if (field982 != 10 && field982 != 11) {
			if (field982 == 20) {
				class301.method1599(class484.field3894, class123.field1449, class281.field2287);
			} else if (field982 == 50) {
				class301.method1599(class484.field3894, class123.field1449, class281.field2287);
			} else if (field982 == 25) {
				if (field972 == 1) {
					if (field968 > field1002) {
						field1002 = field968;
					}
					var3 = (field1002 * 50 - field968 * 50) / field1002;
					method588(class55.field330 + class74.field738 + class74.field732 + var3 + "%" + class74.field734, false);
				} else if (field972 == 2) {
					if (field970 > field971) {
						field971 = field970;
					}
					var3 = 50 + (field971 * 50 - field970 * 50) / field971;
					method588(class55.field330 + class74.field738 + class74.field732 + var3 + "%" + class74.field734, false);
				} else {
					method588(class55.field330, false);
				}
			} else if (field982 == 30) {
				this.method415();
			} else if (field982 == 40) {
				method588(class55.field331 + class74.field738 + class55.field332, false);
			} else if (field982 == 45) {
				method588(class55.field591, false);
			}
		} else {
			class301.method1599(class484.field3894, class123.field1449, class281.field2287);
		}
		if (field982 == 30 && field1127 == 0 && !var1 && !field1129) {
			for (var3 = 0; var3 < field1069; ++var3) {
				if (field1121[var3]) {
					class389.field3103.method1757(field1123[var3], field1124[var3], field1125[var3], field1126[var3]);
					field1121[var3] = false;
				}
			}
		} else if (field982 > 0) {
			class389.field3103.method1756(0, 0);
			for (var3 = 0; var3 < field1069; ++var3) {
				field1121[var3] = false;
			}
		}
	}

	@Override
	protected final void method2523() {
		if (class471.field3719.method1418()) {
			class471.field3719.method1416();
		}
		if (class467.field3701 != null) {
			class467.field3701.field1485 = false;
		}
		class467.field3701 = null;
		field963.method915();
		if (class422.field3267 != null) {
			synchronized (class422.field3267) {
				class422.field3267 = null;
			}
		}
		class538.field4240 = null;
		if (class493.field3983 != null) {
			class493.field3983.method2589();
		}
		class401.field3173.method26();
		class195.method1201();
		if (class28.field142 != null) {
			class28.field142.method1807();
			class28.field142 = null;
		}
		class89.method405();
		this.field941.method992();
	}

	void method412() {
		if (field982 != 1000) {
			boolean var2 = class401.field3173.method25();
			if (!var2) {
				this.method428();
			}
		}
	}

	void method428() {
		if (class401.field3173.field29 >= 4) {
			this.method2543("js5crc");
			method567(1000);
		} else {
			if (class401.field3173.field52 >= 4) {
				if (field982 <= 5) {
					this.method2543("js5io");
					method567(1000);
					return;
				}
				field932 = 3000;
				class401.field3173.field52 = 3;
			}
			if (--field932 + 1 <= 0) {
				try {
					if (field931 == 0) {
						class467.field3706 = class522.field4135.method2110(class112.field1318, class216.field1946);
						++field931;
					}
					if (field931 == 1) {
						if (class467.field3706.field2114 == 2) {
							this.method427(-1);
							return;
						}
						if (class467.field3706.field2114 == 1) {
							++field931;
						}
					}
					if (field931 == 2) {
						Socket var3 = (Socket) class467.field3706.field2115;
						class119 var2 = new class119(var3, 40000, 5000);
						class484.field3892 = var2;
						class187 var4 = new class187(5);
						var4.method1085(15);
						var4.method1151(216);
						class484.field3892.method2071(var4.field1830, 0, 5);
						++field931;
						class328.field2535 = class48.method197();
					}
					if (field931 == 3) {
						if (class484.field3892.method2070() > 0) {
							int var6 = class484.field3892.method2072();
							if (var6 != 0) {
								this.method427(var6);
								return;
							}
							++field931;
						} else if (class48.method197() - class328.field2535 > 30000L) {
							this.method427(-2);
							return;
						}
					}
					if (field931 == 4) {
						class401.field3173.method20(class484.field3892, field982 > 20);
						class467.field3706 = null;
						class484.field3892 = null;
						field931 = 0;
						field1078 = 0;
					}
				} catch (IOException var5) {
					this.method427(-3);
				}
			}
		}
	}

	void method427(int var1) {
		class467.field3706 = null;
		class484.field3892 = null;
		field931 = 0;
		if (class216.field1946 == class10.field58) {
			class216.field1946 = class283.field2297;
		} else {
			class216.field1946 = class10.field58;
		}
		++field1078;
		if (field1078 < 2 || var1 != 7 && var1 != 9) {
			if (field1078 >= 2 && var1 == 6) {
				this.method2543("js5connect_outofdate");
				method567(1000);
			} else if (field1078 >= 4) {
				if (field982 <= 5) {
					this.method2543("js5connect");
					method567(1000);
				} else {
					field932 = 3000;
				}
			}
		} else if (field982 <= 5) {
			this.method2543("js5connect_full");
			method567(1000);
		} else {
			field932 = 3000;
		}
	}

	final void method413() {
		Object var2 = field963.method914();
		class515 var3 = field963.field1604;
		try {
			if (field934 == 0) {
				if (null == class435.field3420 && (field953.method2157() || field913 > 250)) {
					class435.field3420 = field953.method2158();
					field953.method2159();
					field953 = null;
				}
				if (null != class435.field3420) {
					if (var2 != null) {
						((class406) var2).method2073();
						var2 = null;
					}
					class29.field148 = null;
					field965 = false;
					field913 = 0;
					if (field943.method2456()) {
						if (this.method407()) {
							try {
								this.method433(class488.field3918);
								method565(21);
							} catch (Throwable var21) {
								class156.method917((String) null, var21);
								class58.method229(65);
								return;
							}
						} else {
							if (!this.method430((byte) 6)) {
								class58.method229(65);
								return;
							}
							try {
								this.method429(class81.field802, class241.field2051);
								method565(20);
							} catch (Exception var20) {
								class156.method917((String) null, var20);
								class58.method229(65);
								return;
							}
						}
					} else {
						method565(1);
					}
				}
			}
			class416 var23;
			if (field934 == 21) {
				if (null != this.field949) {
					if (!this.field949.isDone()) {
						return;
					}
					if (this.field949.isCancelled()) {
						class58.method229(65);
						this.field949 = null;
						return;
					}
					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field949.get();
						if (!var4.isSuccess()) {
							class58.method229(65);
							this.field949 = null;
							return;
						}
						class530.field4194 = var4.getAccessToken();
						class488.field3918 = var4.getRefreshToken();
						this.field949 = null;
					} catch (Exception var19) {
						class156.method917((String) null, var19);
						class58.method229(65);
						this.field949 = null;
						return;
					}
				} else {
					if (null == this.field947) {
						class58.method229(65);
						return;
					}
					if (!this.field947.method1812()) {
						return;
					}
					if (this.field947.method1813()) {
						class156.method917(this.field947.method1815(), (Throwable) null);
						class58.method229(65);
						this.field947 = null;
						return;
					}
					var23 = this.field947.method1814();
					if (var23.method2090() != 200) {
						class58.method229(65);
						this.field947 = null;
						return;
					}
					field913 = 0;
					class217 var5 = new class217(var23.method2092());
					try {
						class530.field4194 = var5.method1298().getString("access_token");
						class488.field3918 = var5.method1298().getString("refresh_token");
					} catch (Exception var18) {
						class156.method917("Error parsing tokens", var18);
						class58.method229(65);
						this.field947 = null;
						return;
					}
				}
				this.method409(class530.field4194);
				method565(20);
			}
			if (field934 == 20) {
				if (this.field944 != null) {
					if (!this.field944.isDone()) {
						return;
					}
					if (this.field944.isCancelled()) {
						class58.method229(65);
						this.field944 = null;
						return;
					}
					try {
						OtlTokenResponse var24 = (OtlTokenResponse) this.field944.get();
						if (!var24.isSuccess()) {
							class58.method229(65);
							this.field944 = null;
							return;
						}
						this.field940 = var24.getToken();
						this.field944 = null;
					} catch (Exception var17) {
						class156.method917((String) null, var17);
						class58.method229(65);
						this.field944 = null;
						return;
					}
				} else {
					if (this.field1020 == null) {
						class58.method229(65);
						return;
					}
					if (!this.field1020.method1812()) {
						return;
					}
					if (this.field1020.method1813()) {
						class156.method917(this.field1020.method1815(), (Throwable) null);
						class58.method229(65);
						this.field1020 = null;
						return;
					}
					var23 = this.field1020.method1814();
					if (var23.method2090() != 200) {
						class156.method917("Response code: " + var23.method2090() + "Response body: " + var23.method2092(), (Throwable) null);
						class58.method229(65);
						this.field1020 = null;
						return;
					}
					List var26 = (List) var23.method2091().get("Content-Type");
					if (var26 != null && var26.contains(class533.field4206.method2579())) {
						try {
							JSONObject var6 = new JSONObject(var23.method2092());
							this.field940 = var6.getString("token");
						} catch (JSONException var16) {
							class156.method917((String) null, var16);
							class58.method229(65);
							this.field1020 = null;
							return;
						}
					} else {
						this.field940 = var23.method2092();
					}
					this.field1020 = null;
				}
				field913 = 0;
				method565(1);
			}
			if (field934 == 1) {
				if (class29.field148 == null) {
					class29.field148 = class522.field4135.method2110(class112.field1318, class216.field1946);
				}
				if (class29.field148.field2114 == 2) {
					throw new IOException();
				}
				if (class29.field148.field2114 == 1) {
					Socket var27 = (Socket) class29.field148.field2115;
					class119 var25 = new class119(var27, 40000, 5000);
					var2 = var25;
					field963.method912(var25);
					class29.field148 = null;
					method565(2);
				}
			}
			class457 var29;
			if (field934 == 2) {
				field963.method916();
				var29 = class400.method2060((byte) -1);
				var29.field3482 = null;
				var29.field3483 = 0;
				var29.field3487 = new class515(5000);
				var29.field3487.method1085(class323.field2521.field2519);
				field963.method911(var29);
				field963.method910();
				var3.field1832 = 0;
				method565(3);
			}
			int var28;
			if (field934 == 3) {
				if (class493.field3983 != null) {
					class493.field3983.method2588();
				}
				if (((class406) var2).method2068(1)) {
					var28 = ((class406) var2).method2072();
					if (null != class493.field3983) {
						class493.field3983.method2588();
					}
					if (var28 != 0) {
						class58.method229(var28);
						return;
					}
					var3.field1832 = 0;
					method565(4);
				}
			}
			if (field934 == 4) {
				if (var3.field1832 < 8) {
					var28 = ((class406) var2).method2070();
					if (var28 > 8 - var3.field1832) {
						var28 = 8 - var3.field1832;
					}
					if (var28 > 0) {
						((class406) var2).method2069(var3.field1830, var3.field1832, var28);
						var3.field1832 += var28;
					}
				}
				if (var3.field1832 == 8) {
					var3.field1832 = 0;
					class528.field4185 = var3.method1101();
					method565(5);
				}
			}
			if (field934 == 5) {
				field963.field1604.field1832 = 0;
				field963.method916();
				class515 var34 = new class515(500);
				int[] var30 = new int[] { class435.field3420.nextInt(), class435.field3420.nextInt(), class435.field3420.nextInt(), class435.field3420.nextInt() };
				var34.field1832 = 0;
				var34.method1085(1);
				var34.method1151(var30[0]);
				var34.method1151(var30[1]);
				var34.method1151(var30[2]);
				var34.method1151(var30[3]);
				var34.method1122(class528.field4185);
				if (field982 == 40) {
					var34.method1151(class22.field116[0]);
					var34.method1151(class22.field116[1]);
					var34.method1151(class22.field116[2]);
					var34.method1151(class22.field116[3]);
				} else {
					if (field982 == 50) {
						var34.method1085(class225.field1988.method1362());
						var34.method1151(class531.field4195);
					} else {
						var34.method1085(field1148.method1362());
						switch(field1148.field1991) {
							case 0:
								var34.method1151(class83.field841.method1023(class174.field1742));
							case 1:
							default:
								break;
							case 2:
							case 4:
								var34.method1137(class327.field2531);
								++var34.field1832;
								break;
							case 3:
								var34.field1832 += 4;
						}
					}
					if (field943.method2456()) {
						var34.method1085(class508.field4076.method1362());
						var34.method1088(this.field940);
					} else {
						var34.method1085(class508.field4077.method1362());
						var34.method1088(class174.field1735);
					}
				}
				var34.method1129(class380.field3070, class380.field3071);
				class22.field116 = var30;
				class457 var7 = class400.method2060((byte) -1);
				var7.field3482 = null;
				var7.field3483 = 0;
				var7.field3487 = new class515(5000);
				var7.field3487.field1832 = 0;
				if (field982 == 40) {
					var7.field3487.method1085(class323.field2516.field2519);
				} else {
					var7.field3487.method1085(class323.field2515.field2519);
				}
				var7.field3487.method1126(0);
				int var8 = var7.field3487.field1832;
				var7.field3487.method1151(216);
				var7.field3487.method1151(1);
				var7.field3487.method1085(field904);
				var7.field3487.method1085(field916);
				boolean var9 = false;
				var7.field3487.method1085(0);
				var7.field3487.method1090(var34.field1830, 0, var34.field1832);
				int var10 = var7.field3487.field1832;
				var7.field3487.method1088(class174.field1742);
				var7.field3487.method1085((field1129 ? 1 : 0) << 1 | (field902 ? 1 : 0));
				var7.field3487.method1126(class86.field856);
				var7.field3487.method1126(class271.field2226);
				method520(var7.field3487);
				var7.field3487.method1088(class101.field1269);
				var7.field3487.method1151(class359.field2854);
				if (field1080 > 213) {
					var7.field3487.method1085(0);
				}
				class187 var11 = new class187(class348.field2632.method2165());
				class348.field2632.method2164(var11);
				var7.field3487.method1090(var11.field1830, 0, var11.field1830.length);
				var7.field3487.method1085(field904);
				var7.field3487.method1151(0);
				var7.field3487.method1105(class167.field1681.field2581);
				var7.field3487.method1105(class502.field4026.field2581);
				var7.field3487.method1105(class385.field3082.field2581);
				var7.field3487.method1105(class23.field117.field2581);
				var7.field3487.method1105(class337.field2568.field2581);
				var7.field3487.method1134(class46.field231.field2581);
				var7.field3487.method1151(class357.field2837.field2581);
				var7.field3487.method1133(class73.field730.field2581);
				var7.field3487.method1151(class389.field3098.field2581);
				var7.field3487.method1105(class98.field1257.field2581);
				var7.field3487.method1105(0);
				var7.field3487.method1134(class162.field1646.field2581);
				var7.field3487.method1105(class82.field834.field2581);
				var7.field3487.method1133(class126.field1456.field2581);
				var7.field3487.method1105(class478.field3746.field2581);
				var7.field3487.method1134(class264.field2173.field2581);
				var7.field3487.method1133(class477.field3744.field2581);
				var7.field3487.method1151(class319.field2504.field2581);
				var7.field3487.method1133(class374.field3035.field2581);
				var7.field3487.method1134(class537.field4228.field2581);
				var7.field3487.method1151(class516.field4099.field2581);
				var7.field3487.method1139(var30, var10, var7.field3487.field1832);
				var7.field3487.method1093(var7.field3487.field1832 - var8);
				field963.method911(var7);
				field963.method910();
				field963.field1603 = new class504(var30);
				int[] var12 = new int[4];
				for (int var13 = 0; var13 < 4; ++var13) {
					var12[var13] = var30[var13] + 50;
				}
				var3.method2481(var12);
				method565(6);
			}
			int var32;
			if (field934 == 6 && ((class406) var2).method2070() > 0) {
				var28 = ((class406) var2).method2072();
				if (var28 == 61) {
					var32 = ((class406) var2).method2070();
					class393.field3125 = var32 == 1 && ((class406) var2).method2072() == 1;
					method565(5);
				}
				if (var28 == 21 && field982 == 20) {
					method565(12);
				} else if (var28 == 2) {
					method565(14);
				} else if (var28 == 15 && field982 == 40) {
					field963.field1606 = -1;
					method565(19);
				} else if (var28 == 64) {
					method565(10);
				} else if (var28 == 23 && field964 < 1) {
					++field964;
					method565(0);
				} else if (var28 == 29) {
					method565(17);
				} else {
					if (var28 != 69) {
						class58.method229(var28);
						return;
					}
					method565(7);
				}
			}
			if (field934 == 7 && ((class406) var2).method2070() >= 2) {
				((class406) var2).method2069(var3.field1830, 0, 2);
				var3.field1832 = 0;
				class538.field4238 = var3.method1145();
				method565(8);
			}
			if (field934 == 8 && ((class406) var2).method2070() >= class538.field4238) {
				var3.field1832 = 0;
				((class406) var2).method2069(var3.field1830, var3.field1832, class538.field4238);
				class294 var38 = class294.method1589()[var3.method1096()];
				try {
					switch(var38.field2342) {
						case 0:
							class447 var35 = new class447();
							this.field955 = new class520(var3, var35);
							method565(9);
							break;
						default:
							throw new IllegalArgumentException();
					}
				} catch (Exception var15) {
					class58.method229(22);
					return;
				}
			}
			if (field934 == 9 && this.field955.method2520()) {
				this.field985 = this.field955.method2519();
				this.field955.method2517();
				this.field955 = null;
				if (this.field985 == null) {
					class58.method229(22);
					return;
				}
				field963.method916();
				var29 = class400.method2060((byte) -1);
				var29.field3482 = null;
				var29.field3483 = 0;
				var29.field3487 = new class515(5000);
				var29.field3487.method1085(class323.field2517.field2519);
				var29.field3487.method1126(this.field985.field1832);
				var29.field3487.method1091(this.field985);
				field963.method911(var29);
				field963.method910();
				this.field985 = null;
				method565(6);
			}
			if (field934 == 10 && ((class406) var2).method2070() > 0) {
				class471.field3712 = ((class406) var2).method2072();
				method565(11);
			}
			if (field934 == 11 && ((class406) var2).method2070() >= class471.field3712) {
				((class406) var2).method2069(var3.field1830, 0, class471.field3712);
				var3.field1832 = 0;
				method565(6);
			}
			if (field934 == 12 && ((class406) var2).method2070() > 0) {
				field1036 = (((class406) var2).method2072() + 3) * 60;
				method565(13);
			}
			if (field934 == 13) {
				field913 = 0;
				class174.method1042(class55.field362, class55.field363, field1036 / 60 + class55.field542);
				if (--field1036 <= 0) {
					method565(0);
				}
			} else {
				if (field934 == 14 && ((class406) var2).method2070() >= 1) {
					class200.field1885 = ((class406) var2).method2072();
					method565(15);
				}
				if (field934 == 15 && ((class406) var2).method2070() >= class200.field1885) {
					boolean var40 = ((class406) var2).method2072() == 1;
					((class406) var2).method2069(var3.field1830, 0, 4);
					var3.field1832 = 0;
					boolean var39 = false;
					if (var40) {
						var32 = var3.method2483() << 24;
						var32 |= var3.method2483() << 16;
						var32 |= var3.method2483() << 8;
						var32 |= var3.method2483();
						class83.field841.method1016(class174.field1742, var32);
					}
					if (field952) {
						class83.field841.method1011(class174.field1742);
					} else {
						class83.field841.method1011((String) null);
					}
					class173.method1029();
					field986 = ((class406) var2).method2072();
					field1194 = ((class406) var2).method2072() == 1;
					field1026 = ((class406) var2).method2072();
					field1026 <<= 8;
					field1026 += ((class406) var2).method2072();
					field1027 = ((class406) var2).method2072();
					((class406) var2).method2069(var3.field1830, 0, 8);
					var3.field1832 = 0;
					this.field956 = var3.method1101();
					((class406) var2).method2069(var3.field1830, 0, 8);
					var3.field1832 = 0;
					field1028 = var3.method1101();
					if (field1080 >= 214) {
						((class406) var2).method2069(var3.field1830, 0, 8);
						var3.field1832 = 0;
						var3.method1101();
					}
					((class406) var2).method2069(var3.field1830, 0, 1);
					var3.field1832 = 0;
					class465[] var31 = class465.method2288();
					int var37 = var3.method2487();
					if (var37 < 0 || var37 >= var31.length) {
						throw new IOException(var37 + " " + var3.field1832);
					}
					field963.field1600 = var31[var37];
					field963.field1606 = field963.field1600.field3689;
					((class406) var2).method2069(var3.field1830, 0, 2);
					var3.field1832 = 0;
					field963.field1606 = var3.method1145();
					try {
						Client var41 = class501.field4023;
						JSObject.getWindow(var41).call("zap", (Object[]) null);
					} catch (Throwable var14) {
					}
					method565(16);
				}
				if (field934 != 16) {
					if (field934 == 17 && ((class406) var2).method2070() >= 2) {
						var3.field1832 = 0;
						((class406) var2).method2069(var3.field1830, 0, 2);
						var3.field1832 = 0;
						class134.field1479 = var3.method1145();
						method565(18);
					}
					if (field934 == 18 && ((class406) var2).method2070() >= class134.field1479) {
						var3.field1832 = 0;
						((class406) var2).method2069(var3.field1830, 0, class134.field1479);
						var3.field1832 = 0;
						String var45 = var3.method1104();
						String var43 = var3.method1104();
						String var36 = var3.method1104();
						class174.method1042(var45, var43, var36);
						method567(10);
						if (field943.method2456()) {
							class174.method1030(9);
						}
					}
					if (field934 == 19) {
						if (field963.field1606 == -1) {
							if (((class406) var2).method2070() < 2) {
								return;
							}
							((class406) var2).method2069(var3.field1830, 0, 2);
							var3.field1832 = 0;
							field963.field1606 = var3.method1145();
						}
						if (((class406) var2).method2070() >= field963.field1606) {
							((class406) var2).method2069(var3.field1830, 0, field963.field1606);
							var3.field1832 = 0;
							var28 = field963.field1606;
							field966.method2050();
							method489();
							class274.method1522(var3);
							if (var3.field1832 != var28) {
								throw new RuntimeException();
							}
						}
					} else {
						++field913;
						if (field913 > 2000) {
							if (field964 < 1) {
								if (class10.field58 == class216.field1946) {
									class216.field1946 = class283.field2297;
								} else {
									class216.field1946 = class10.field58;
								}
								++field964;
								method565(0);
							} else {
								class58.method229(-3);
							}
						}
					}
				} else {
					if (((class406) var2).method2070() >= field963.field1606) {
						var3.field1832 = 0;
						((class406) var2).method2069(var3.field1830, 0, field963.field1606);
						field966.method2053();
						field961 = -1L;
						class467.field3701.field1481 = 0;
						class325.field2528 = true;
						field917 = true;
						field1141 = -1L;
						class523.method2562();
						field963.method916();
						field963.field1604.field1832 = 0;
						field963.field1600 = null;
						field963.field1605 = null;
						field963.field1611 = null;
						field963.field1612 = null;
						field963.field1606 = 0;
						field963.field1610 = 0;
						field918 = 0;
						field951 = 0;
						field976 = 0;
						method545();
						class422.method2123(0);
						class156.method920();
						field1063 = 0;
						field990 = false;
						field1153 = 0;
						field1076 = 0;
						field991 = 0;
						class364.field2923 = null;
						field1151 = 0;
						field1144 = -1;
						field1149 = 0;
						field1072 = 0;
						field927 = class389.field3100;
						field928 = class389.field3100;
						field959 = 0;
						class274.field2240 = 0;
						for (var28 = 0; var28 < 2048; ++var28) {
							class274.field2248[var28] = null;
							class274.field2238[var28] = class343.field2607;
						}
						for (var28 = 0; var28 < 2048; ++var28) {
							field1071[var28] = null;
						}
						for (var28 = 0; var28 < 65536; ++var28) {
							field958[var28] = null;
						}
						field1037 = -1;
						field1025.method2214();
						field1168.method2214();
						for (var28 = 0; var28 < 4; ++var28) {
							for (var32 = 0; var32 < 104; ++var32) {
								for (int var33 = 0; var33 < 104; ++var33) {
									field1038[var28][var32][var33] = null;
								}
							}
						}
						field1039 = new class449();
						class147.field1555.method942();
						for (var28 = 0; var28 < class136.field1488; ++var28) {
							class136 var42 = class469.method2292(var28);
							if (null != var42) {
								class410.field3200[var28] = 0;
								class410.field3198[var28] = 0;
							}
						}
						class471.field3719.method1422();
						field933 = -1;
						if (field1070 != -1) {
							class354.method1862(field1070);
						}
						for (class208 var44 = (class208) field919.method2583(); null != var44; var44 = (class208) field919.method2584()) {
							method484(var44, true);
						}
						field1070 = -1;
						field919 = new class535(8);
						field1075 = null;
						method545();
						field1184.method2452((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
						for (var28 = 0; var28 < 8; ++var28) {
							field921[var28] = null;
							field1035[var28] = false;
						}
						class53.method215();
						field911 = true;
						for (var28 = 0; var28 < 100; ++var28) {
							field908[var28] = true;
						}
						method469();
						class366.field2930 = null;
						class274.field2250 = null;
						Arrays.fill(field1142, (Object) null);
						class141.field1541 = null;
						Arrays.fill(field1143, (Object) null);
						for (var28 = 0; var28 < 8; ++var28) {
							field1176[var28] = new class516();
						}
						class505.field4054 = null;
						field909 = false;
						class274.method1522(var3);
						class502.field4025 = -1;
						method552(false, var3);
						field963.field1600 = null;
					}
				}
			}
		} catch (IOException var22) {
			if (field964 < 1) {
				if (class10.field58 == class216.field1946) {
					class216.field1946 = class283.field2297;
				} else {
					class216.field1946 = class10.field58;
				}
				++field964;
				method565(0);
			} else {
				class58.method229(-2);
			}
		}
	}

	final void method432() {
		if (field918 > 1) {
			--field918;
		}
		if (field951 > 0) {
			--field951;
		}
		if (field965) {
			field965 = false;
			method533();
		} else {
			if (!field1011) {
				method572();
			}
			int var2;
			for (var2 = 0; var2 < 100 && this.method417(field963); ++var2) {
			}
			if (field982 == 30) {
				while (true) {
					class366 var3 = (class366) class523.field4167.method1585();
					boolean var17;
					if (null == var3) {
						var17 = false;
					} else {
						var17 = true;
					}
					int var4;
					class457 var18;
					if (!var17) {
						class457 var19;
						int var20;
						if (field966.field3164) {
							var19 = class457.method2237(class483.field3802, field963.field1603);
							var19.field3487.method1085(0);
							var20 = var19.field3487.field1832;
							field966.method2055(var19.field3487);
							var19.field3487.method1094(var19.field3487.field1832 - var20);
							field963.method911(var19);
							field966.method2054();
						}
						int var5;
						int var6;
						synchronized (class467.field3701.field1480) {
							if (!field938) {
								class467.field3701.field1481 = 0;
							} else if (class422.field3264 != 0 || class467.field3701.field1481 >= 40) {
								var18 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								int var7 = 0;
								int var8;
								for (var8 = 0; var8 < class467.field3701.field1481 && (null == var18 || var18.field3487.field1832 - var4 < 246); ++var8) {
									var5 = var8;
									int var9 = class467.field3701.field1483[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}
									int var10 = class467.field3701.field1482[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}
									if (var10 != field914 || field915 != var9) {
										if (null == var18) {
											var18 = class457.method2237(class483.field3862, field963.field1603);
											var18.field3487.method1085(0);
											var4 = var18.field3487.field1832;
											class515 var10000 = var18.field3487;
											var10000.field1832 += 2;
											var6 = 0;
											var7 = 0;
										}
										int var11;
										int var12;
										int var13;
										if (field1041 != -1L) {
											var11 = var10 - field914;
											var12 = var9 - field915;
											var13 = (int) ((class467.field3701.field1484[var8] - field1041) / 20L);
											var6 = (int) ((long) var6 + (class467.field3701.field1484[var8] - field1041) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}
										field914 = var10;
										field915 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var18.field3487.method1126((var13 << 12) + (var11 << 6) + var12);
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var18.field3487.method1085(var13 + 128);
											var18.field3487.method1126(var12 + (var11 << 8));
										} else if (var13 < 32) {
											var18.field3487.method1085(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var18.field3487.method1151(var10 | var9 << 16);
											} else {
												var18.field3487.method1151(Integer.MIN_VALUE);
											}
										} else {
											var18.field3487.method1126(57344 + (var13 & 8191));
											if (var10 != -1 && var9 != -1) {
												var18.field3487.method1151(var10 | var9 << 16);
											} else {
												var18.field3487.method1151(Integer.MIN_VALUE);
											}
										}
										++var7;
										field1041 = class467.field3701.field1484[var8];
									}
								}
								if (null != var18) {
									var18.field3487.method1094(var18.field3487.field1832 - var4);
									var8 = var18.field3487.field1832;
									var18.field3487.field1832 = var4;
									var18.field3487.method1085(var6 / var7);
									var18.field3487.method1085(var6 % var7);
									var18.field3487.field1832 = var8;
									field963.method911(var18);
								}
								if (var5 >= class467.field3701.field1481) {
									class467.field3701.field1481 = 0;
								} else {
									class135 var41 = class467.field3701;
									var41.field1481 -= var5;
									System.arraycopy(class467.field3701.field1482, var5, class467.field3701.field1482, 0, class467.field3701.field1481);
									System.arraycopy(class467.field3701.field1483, var5, class467.field3701.field1483, 0, class467.field3701.field1481);
									System.arraycopy(class467.field3701.field1484, var5, class467.field3701.field1484, 0, class467.field3701.field1481);
								}
							}
						}
						class457 var31;
						if (class422.field3264 == 1 || !class349.field2637 && class422.field3264 == 4 || class422.field3264 == 2) {
							long var21 = class422.field3254 - field961;
							if (var21 > 32767L) {
								var21 = 32767L;
							}
							field961 = class422.field3254;
							var4 = class422.field3266;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class271.field2226) {
								var4 = class271.field2226;
							}
							var5 = class422.field3265;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class86.field856) {
								var5 = class86.field856;
							}
							var6 = (int) var21;
							var31 = class457.method2237(class483.field3828, field963.field1603);
							var31.field3487.method1126((class422.field3264 == 2 ? 1 : 0) + (var6 << 1));
							var31.field3487.method1126(var5);
							var31.field3487.method1126(var4);
							field963.method911(var31);
						}
						if (field1111 != 0) {
							var19 = class457.method2237(class483.field3876, field963.field1603);
							var19.field3487.method1126(field1111);
							field963.method911(var19);
						}
						if (field1046.field3751 > 0) {
							var19 = class457.method2237(class483.field3790, field963.field1603);
							var19.field3487.method1126(0);
							var20 = var19.field3487.field1832;
							long var22 = class48.method197();
							for (var6 = 0; var6 < field1046.field3751; ++var6) {
								long var34 = var22 - field1141;
								if (var34 > 16777215L) {
									var34 = 16777215L;
								}
								field1141 = var22;
								var19.field3487.method1158(field1046.field3750[var6]);
								var19.field3487.method1128((int) var34);
							}
							var19.field3487.method1093(var19.field3487.field1832 - var20);
							field963.method911(var19);
						}
						if (field1000 > 0) {
							--field1000;
						}
						if (field1046.method2323(96) || field1046.method2323(97) || field1046.method2323(98) || field1046.method2323(99)) {
							field1001 = true;
						}
						if (field1001 && field1000 <= 0) {
							field1000 = 20;
							field1001 = false;
							var19 = class457.method2237(class483.field3813, field963.field1603);
							var19.field3487.method1126(field1076);
							var19.field3487.method1121(field937);
							field963.method911(var19);
						}
						if (class325.field2528 && !field917) {
							field917 = true;
							var19 = class457.method2237(class483.field3842, field963.field1603);
							var19.field3487.method1085(1);
							field963.method911(var19);
						}
						if (!class325.field2528 && field917) {
							field917 = false;
							var19 = class457.method2237(class483.field3842, field963.field1603);
							var19.field3487.method1085(0);
							field963.method911(var19);
						}
						if (class26.field125 != null) {
							class26.field125.method1612();
						}
						if (class138.field1523) {
							if (null != class366.field2930) {
								class366.field2930.method2286();
							}
							for (var2 = 0; var2 < class274.field2240; ++var2) {
								class82 var23 = field1071[class274.field2241[var2]];
								var23.method334();
							}
							class138.field1523 = false;
						}
						method584();
						method516();
						if (field982 != 30) {
							return;
						}
						method595();
						class26.method75();
						++field963.field1610;
						if (field963.field1610 > 750) {
							method533();
							return;
						}
						var2 = class274.field2240;
						int[] var24 = class274.field2241;
						for (var4 = 0; var4 < var2; ++var4) {
							class82 var25 = field1071[var24[var4]];
							if (null != var25) {
								method562(var25, 1);
							}
						}
						for (var2 = 0; var2 < field959; ++var2) {
							var20 = field897[var2];
							class373 var26 = field958[var20];
							if (null != var26) {
								method562(var26, var26.field3019.field2440);
							}
						}
						method541();
						++field977;
						if (field1135 != 0) {
							field1077 += 20;
							if (field1077 >= 400) {
								field1135 = 0;
							}
						}
						class354 var32 = class400.field3169;
						class354 var27 = class454.field3476;
						class400.field3169 = null;
						class454.field3476 = null;
						field1086 = null;
						field1134 = false;
						field1087 = false;
						field1138 = 0;
						while (field1046.method2324() && field1138 < 128) {
							if (field986 >= 2 && field1046.method2323(82) && field1046.field3761 == 66) {
								StringBuilder var28 = new StringBuilder();
								class374 var38;
								for (Iterator var33 = class156.field1615.iterator(); var33.hasNext(); var28.append(var38.field3034).append('\n')) {
									var38 = (class374) var33.next();
									if (null != var38.field3029 && !var38.field3029.isEmpty()) {
										var28.append(var38.field3029).append(':');
									}
								}
								String var29 = var28.toString();
								class501.field4023.method2525(var29);
							} else if (field991 != 1 || field1046.field3748 <= 0) {
								field1140[field1138] = field1046.field3761;
								field1139[field1138] = field1046.field3748;
								++field1138;
							}
						}
						boolean var30 = field986 >= 2;
						if (var30 && field1046.method2323(82) && field1046.method2323(81) && field1111 != 0) {
							var5 = class431.field3378.field826 - field1111;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}
							if (var5 != class431.field3378.field826) {
								method483(class346.field2624 + class431.field3378.field317[0], class211.field1922 + class431.field3378.field314[0], var5, false);
							}
							field1111 = 0;
						}
						if (class422.field3264 == 1) {
							field1137.method1732();
						}
						if (field1070 != -1) {
							method472(field1070, 0, 0, class86.field856, class271.field2226, 0, 0);
						}
						++field900;
						while (true) {
							class354 var35;
							class165 var36;
							class354 var39;
							do {
								var36 = (class165) field1099.method2216();
								if (var36 == null) {
									while (true) {
										do {
											var36 = (class165) field1115.method2216();
											if (null == var36) {
												while (true) {
													do {
														var36 = (class165) field1113.method2216();
														if (null == var36) {
															while (true) {
																class24 var40 = (class24) field1152.method2216();
																if (var40 == null) {
																	this.method418();
																	method556();
																	if (field1082 != null) {
																		this.method423();
																	}
																	if (class372.method1942()) {
																		var5 = class372.field2990;
																		var6 = class372.field2991;
																		var31 = class457.method2237(class483.field3796, field963.field1603);
																		var31.field3487.method1085(5);
																		var31.field3487.method1121(var5 + class346.field2624);
																		var31.field3487.method1148(class211.field1922 + var6);
																		var31.field3487.method1132(field1046.method2323(82) ? (field1046.method2323(81) ? 2 : 1) : 0);
																		field963.method911(var31);
																		class372.method1965();
																		field1018 = class422.field3265;
																		field1019 = class422.field3266;
																		field1135 = 1;
																		field1077 = 0;
																		field1149 = var5;
																		field1072 = var6;
																	}
																	if (var32 != class400.field3169) {
																		if (null != var32) {
																			method532(var32);
																		}
																		if (class400.field3169 != null) {
																			method532(class400.field3169);
																		}
																	}
																	if (class454.field3476 != var27 && field1061 == field1062) {
																		if (null != var27) {
																			method532(var27);
																		}
																		if (null != class454.field3476) {
																			method532(class454.field3476);
																		}
																	}
																	if (null != class454.field3476) {
																		if (field1061 < field1062) {
																			++field1061;
																			if (field1061 == field1062) {
																				method532(class454.field3476);
																			}
																		}
																	} else if (field1061 > 0) {
																		--field1061;
																	}
																	method590();
																	if (field1165) {
																		method497(class152.field1585, class471.field3713, class41.field203);
																		class25.method74(class262.field2168, class92.field1210);
																		if (class314.field2470 == class152.field1585 && class93.field1211 == class471.field3713 && class225.field1995 == class41.field203 && class283.field2296 == class262.field2168 && class511.field4085 == class92.field1210) {
																			field1165 = false;
																			field1159 = false;
																			field1160 = false;
																			field1161 = false;
																			class39.field187 = 0;
																			class431.field3375 = 0;
																			class360.field2865 = 0;
																			class474.field3730 = 0;
																			class319.field2503 = 0;
																			class422.field3268 = 0;
																			class120.field1433 = 0;
																			class274.field2236 = 0;
																			class474.field3728 = 0;
																			class136.field1492 = 0;
																			field1163 = null;
																			field980 = null;
																			field954 = null;
																		}
																	} else if (field1159) {
																		method506();
																	}
																	for (var5 = 0; var5 < 5; ++var5) {
																		int var10002 = field1116[var5]++;
																	}
																	class471.field3719.method1417();
																	var5 = class422.method2124();
																	var6 = class522.field4163.method2296();
																	class457 var37;
																	if (var5 > 15000 && var6 > 15000) {
																		field951 = 250;
																		class422.method2123(14500);
																		var37 = class457.method2237(class483.field3814, field963.field1603);
																		field963.method911(var37);
																	}
																	class147.field1555.method941();
																	method514();
																	++field963.field1609;
																	if (field963.field1609 > 50) {
																		var37 = class457.method2237(class483.field3830, field963.field1603);
																		field963.method911(var37);
																	}
																	try {
																		field963.method910();
																	} catch (IOException var15) {
																		method533();
																	}
																	return;
																}
																method519(var40);
															}
														}
														var35 = var36.field1664;
														if (var35.field2807 < 0) {
															break;
														}
														var39 = class354.method1860(var35.field2705);
													} while (null == var39 || var39.field2820 == null || var35.field2807 >= var39.field2820.length || var35 != var39.field2820[var35.field2807]);
													class221.method1344(var36);
												}
											}
											var35 = var36.field1664;
											if (var35.field2807 < 0) {
												break;
											}
											var39 = class354.method1860(var35.field2705);
										} while (null == var39 || var39.field2820 == null || var35.field2807 >= var39.field2820.length || var35 != var39.field2820[var35.field2807]);
										class221.method1344(var36);
									}
								}
								var35 = var36.field1664;
								if (var35.field2807 < 0) {
									break;
								}
								var39 = class354.method1860(var35.field2705);
							} while (null == var39 || null == var39.field2820 || var35.field2807 >= var39.field2820.length || var35 != var39.field2820[var35.field2807]);
							class221.method1344(var36);
						}
					}
					var18 = class457.method2237(class483.field3794, field963.field1603);
					var18.field3487.method1085(0);
					var4 = var18.field3487.field1832;
					class523.method2561(var18.field3487);
					var18.field3487.method1094(var18.field3487.field1832 - var4);
					field963.method911(var18);
				}
			}
		}
	}

	@Override
	public void method1519(int var1, int var2) {
		if (null != field963 && null != field963.field1603) {
			if (var1 > -1 && class83.field841.method1001() > 0 && !field1170) {
				class457 var4 = class457.method2237(class483.field3883, field963.field1603);
				var4.field3487.method1151(var1);
				field963.method911(var4);
			}
		}
	}

	@Override
	protected final void method2531() {
		field1128 = class48.method197() + 500L;
		this.method414();
		if (field1070 != -1) {
			this.method421(true);
		}
	}

	void method414() {
		int var2 = class86.field856;
		int var3 = class271.field2226;
		if (super.field4148 < var2) {
			var2 = super.field4148;
		}
		if (super.field4154 < var3) {
			var3 = super.field4154;
		}
		if (class83.field841 != null) {
			try {
				class318.method1698(class501.field4023, "resize", new Object[] { method531() });
			} catch (Throwable var5) {
			}
		}
	}

	final void method415() {
		if (field1070 != -1) {
			method564(field1070);
		}
		int var2;
		for (var2 = 0; var2 < field1069; ++var2) {
			if (field908[var2]) {
				field1121[var2] = true;
			}
			field1122[var2] = field908[var2];
			field908[var2] = false;
		}
		field1119 = field1201;
		field1059 = -1;
		field1060 = -1;
		if (field1070 != -1) {
			field1069 = 0;
			method458(field1070, 0, 0, class86.field856, class271.field2226, 0, 0, -1);
		}
		class206.method1230();
		if (field1187) {
			if (field1135 == 1) {
				class43.field206[field1077 / 100].method380(field1018 - 8, field1019 - 8);
			}
			if (field1135 == 2) {
				class43.field206[4 + field1077 / 100].method380(field1018 - 8, field1019 - 8);
			}
		}
		int var3;
		int var4;
		if (!field1011) {
			if (field1059 != -1) {
				var2 = field1059;
				var3 = field1060;
				if ((field1047 >= 2 || field1063 != 0 || field990) && field1058) {
					var4 = field1047 - 1;
					String var6;
					if (field1063 == 1 && field1047 < 2) {
						var6 = class55.field483 + class55.field367 + field1064 + " " + class74.field737;
					} else if (field990 && field1047 < 2) {
						var6 = field1081 + class55.field367 + field1092 + " " + class74.field737;
					} else {
						var6 = method518(var4);
					}
					if (field1047 > 2) {
						var6 = var6 + class74.method314(16777215) + " " + '/' + " " + (field1047 - 2) + class55.field350;
					}
					class484.field3894.method2412(var6, var2 + 4, var3 + 15, 16777215, 0, field1201 / 1000);
				}
			}
		} else {
			var2 = class538.field4239;
			var3 = class324.field2525;
			var4 = class350.field2639;
			int var5 = class244.field2068;
			int var14 = 6116423;
			class206.method1236(var2, var3, var4, var5, 6116423);
			class206.method1236(var2 + 1, var3 + 1, var4 - 2, 16, 0);
			class206.method1239(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
			class484.field3894.method2414(class55.field486, var2 + 3, var3 + 14, 6116423, -1);
			int var7 = class422.field3270;
			int var8 = class422.field3253;
			int var9;
			int var10;
			int var11;
			for (var9 = 0; var9 < field1047; ++var9) {
				var10 = 15 * (field1047 - 1 - var9) + var3 + 31;
				var11 = 16777215;
				if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}
				class484.field3894.method2414(method518(var9), var2 + 3, var10, var11, 0);
			}
			var9 = class538.field4239;
			var10 = class324.field2525;
			var11 = class350.field2639;
			int var12 = class244.field2068;
			for (int var13 = 0; var13 < field1069; ++var13) {
				if (field1123[var13] + field1125[var13] > var9 && field1123[var13] < var9 + var11 && field1124[var13] + field1126[var13] > var10 && field1124[var13] < var10 + var12) {
					field1121[var13] = true;
				}
			}
		}
		if (field1127 == 3) {
			for (var2 = 0; var2 < field1069; ++var2) {
				if (field1122[var2]) {
					class206.method1235(field1123[var2], field1124[var2], field1125[var2], field1126[var2], 16711935, 128);
				} else if (field1121[var2]) {
					class206.method1235(field1123[var2], field1124[var2], field1125[var2], field1126[var2], 16711680, 128);
				}
			}
		}
		class46.method194(class121.field1436, class431.field3378.field272, class431.field3378.field243, field977);
		field977 = 0;
	}

	boolean method436(class155 var1, int var2) {
		if (var1.field1606 == 0) {
			class366.field2930 = null;
		} else {
			if (null == class366.field2930) {
				class366.field2930 = new class28(class267.field2198, class501.field4023);
			}
			class366.field2930.method82(var1.field1604, var2);
		}
		field1105 = field900;
		class138.field1523 = true;
		var1.field1600 = null;
		return true;
	}

	boolean method416(class155 var1) {
		if (class366.field2930 != null) {
			class366.field2930.method83(var1.field1604, (byte) -59);
		}
		field1105 = field900;
		class138.field1523 = true;
		var1.field1600 = null;
		return true;
	}

	final boolean method417(class155 var1) {
		class406 var3 = var1.method914();
		class515 var4 = var1.field1604;
		if (null == var3) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int var26;
				if (null == var1.field1600) {
					if (var1.field1607) {
						if (!var3.method2068(1)) {
							return false;
						}
						var3.method2069(var1.field1604.field1830, 0, 1);
						var1.field1610 = 0;
						var1.field1607 = false;
					}
					var4.field1832 = 0;
					if (var4.method2485()) {
						if (!var3.method2068(1)) {
							return false;
						}
						var3.method2069(var1.field1604.field1830, 1, 1);
						var1.field1610 = 0;
					}
					var1.field1607 = true;
					class465[] var5 = class465.method2288();
					var26 = var4.method2487();
					if (var26 < 0 || var26 >= var5.length) {
						throw new IOException(var26 + " " + var4.field1832);
					}
					var1.field1600 = var5[var26];
					var1.field1606 = var1.field1600.field3689;
				}
				if (var1.field1606 == -1) {
					if (!var3.method2068(1)) {
						return false;
					}
					var1.method914().method2069(var4.field1830, 0, 1);
					var1.field1606 = var4.field1830[0] & 255;
				}
				if (var1.field1606 == -2) {
					if (!var3.method2068(2)) {
						return false;
					}
					var1.method914().method2069(var4.field1830, 0, 2);
					var4.field1832 = 0;
					var1.field1606 = var4.method1145();
				}
				if (!var3.method2068(var1.field1606)) {
					return false;
				}
				var4.field1832 = 0;
				var3.method2069(var4.field1830, 0, var1.field1606);
				var1.field1610 = 0;
				field966.method2051();
				var1.field1612 = var1.field1611;
				var1.field1611 = var1.field1605;
				var1.field1605 = var1.field1600;
				if (class465.field3626 == var1.field1600) {
					class339.field2594 = class100.method627(var4.method1096());
					var1.field1600 = null;
					return true;
				}
				int var8;
				int var9;
				int var10;
				int var11;
				int var14;
				int var16;
				int var24;
				int var37;
				int var47;
				if (class465.field3649 == var1.field1600) {
					var7 = var4.method1153();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var26;
					var10 = var4.method1118();
					var11 = var10 >> 2;
					var37 = var10 & 3;
					var47 = field1083[var11];
					var14 = var4.method1145();
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var47 == 0) {
							class19 var82 = class377.field3061.method1931(class121.field1436, var8, var9);
							if (null != var82) {
								var16 = class424.method2132(var82.field100);
								if (var11 == 2) {
									var82.field101 = new class57(var16, 2, var37 + 4, class121.field1436, var8, var9, var14, false, var82.field101);
									var82.field99 = new class57(var16, 2, var37 + 1 & 3, class121.field1436, var8, var9, var14, false, var82.field99);
								} else {
									var82.field101 = new class57(var16, var11, var37, class121.field1436, var8, var9, var14, false, var82.field101);
								}
							}
						} else if (var47 == 1) {
							class12 var81 = class377.field3061.method1932(class121.field1436, var8, var9);
							if (null != var81) {
								var16 = class424.method2132(var81.field69);
								if (var11 != 4 && var11 != 5) {
									if (var11 == 6) {
										var81.field66 = new class57(var16, 4, var37 + 4, class121.field1436, var8, var9, var14, false, var81.field66);
									} else if (var11 == 7) {
										var81.field66 = new class57(var16, 4, (var37 + 2 & 3) + 4, class121.field1436, var8, var9, var14, false, var81.field66);
									} else if (var11 == 8) {
										var81.field66 = new class57(var16, 4, var37 + 4, class121.field1436, var8, var9, var14, false, var81.field66);
										var81.field67 = new class57(var16, 4, 4 + (var37 + 2 & 3), class121.field1436, var8, var9, var14, false, var81.field67);
									}
								} else {
									var81.field66 = new class57(var16, 4, var37, class121.field1436, var8, var9, var14, false, var81.field66);
								}
							}
						} else if (var47 == 2) {
							class430 var78 = class377.field3061.method1969(class121.field1436, var8, var9);
							if (var11 == 11) {
								var11 = 10;
							}
							if (null != var78) {
								var78.field3363 = new class57(class424.method2132(var78.field3368), var11, var37, class121.field1436, var8, var9, var14, false, var78.field3363);
							}
						} else if (var47 == 3) {
							class460 var80 = class377.field3061.method1956(class121.field1436, var8, var9);
							if (null != var80) {
								var80.field3499 = new class57(class424.method2132(var80.field3498), 22, var37, class121.field1436, var8, var9, var14, false, var80.field3499);
							}
						}
					}
					var1.field1600 = null;
					return true;
				}
				class354 var86;
				if (var1.field1600 == class465.field3623) {
					var24 = var4.method1100();
					var86 = class354.method1860(var24);
					var86.field2730 = 3;
					var86.field2731 = class431.field3378.field806.method2450();
					method532(var86);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3685) {
					field1165 = false;
					field1159 = false;
					field1160 = false;
					field1161 = false;
					class39.field187 = 0;
					class431.field3375 = 0;
					class360.field2865 = 0;
					field1162 = false;
					class474.field3730 = 0;
					class319.field2503 = 0;
					class422.field3268 = 0;
					class120.field1433 = 0;
					class274.field2236 = 0;
					class474.field3728 = 0;
					class136.field1492 = 0;
					field1163 = null;
					field980 = null;
					field954 = null;
					for (var24 = 0; var24 < 5; ++var24) {
						field1166[var24] = false;
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3617 == var1.field1600) {
					class225.field1994 = null;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3650) {
					var24 = var4.method1100();
					var26 = var4.method1100();
					var7 = class522.method2558();
					class457 var84 = class457.method2237(class483.field3872, field963.field1603);
					var84.field3487.method1085(class522.field4140);
					var84.field3487.method1105(var24);
					var84.field3487.method1134(var26);
					var84.field3487.method1116(var7);
					field963.method911(var84);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3586) {
					method498();
					field1185 = var4.method1098();
					field950 = field900;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3636 == var1.field1600) {
					class192.method1176(class255.field2129);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3572) {
					var24 = var4.method1123();
					class53.method210(var24);
					field1097[++field1098 - 1 & 31] = var24 & 32767;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3678) {
					class192.method1176(class255.field2133);
					var1.field1600 = null;
					return true;
				}
				boolean var12;
				byte var23;
				long var33;
				long var42;
				long var50;
				String var54;
				int var74;
				if (class465.field3666 == var1.field1600) {
					var23 = var4.method1097();
					var50 = (long) var4.method1145();
					var33 = (long) var4.method1152();
					var42 = (var50 << 32) + var33;
					var12 = false;
					class345 var73 = var23 >= 0 ? field1143[var23] : class141.field1541;
					if (null == var73) {
						var12 = true;
					} else {
						for (var14 = 0; var14 < 100; ++var14) {
							if (field1044[var14] == var42) {
								var12 = true;
								break;
							}
						}
					}
					if (!var12) {
						field1044[field906] = var42;
						field906 = (1 + field906) % 100;
						var54 = class291.method1577(var4);
						var74 = var23 >= 0 ? 43 : 46;
						class156.method925(var74, "", var54, var73.field2617);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3596) {
					class274.method1523(var4, var1.field1606);
					class352.method1817();
					var1.field1600 = null;
					return true;
				}
				if (class465.field3609 == var1.field1600) {
					field1159 = true;
					field1165 = false;
					field1161 = true;
					class39.field187 = var4.method1096();
					class431.field3375 = var4.method1096();
					class360.field2865 = var4.method1145();
					var24 = var4.method1145();
					var26 = var4.method1096();
					var7 = 64 + class39.field187 * 128;
					var8 = 64 + class431.field3375 * 128;
					var9 = method450(var7, var8, class121.field1436) - class360.field2865;
					var10 = var7 - class314.field2470;
					var11 = var9 - class93.field1211;
					var37 = var8 - class225.field1995;
					double var70 = Math.sqrt((double) (var37 * var37 + var10 * var10));
					var74 = method485((int) (Math.atan2((double) var11, var70) * 325.9490051269531D) & 2047);
					var16 = method444((int) (Math.atan2((double) var10, (double) var37) * -325.9490051269531D) & 2047);
					field980 = new class353(class283.field2296, var74, var24, var26);
					field954 = new class353(class511.field4085, var16, var24, var26);
					var1.field1600 = null;
					return true;
				}
				long var53;
				class208 var79;
				if (var1.field1600 == class465.field3658) {
					var24 = var1.field1606 + var4.field1832;
					var26 = var4.method1145();
					if (var26 == 65535) {
						var26 = -1;
					}
					var7 = var4.method1145();
					if (field1070 != var26) {
						field1070 = var26;
						this.method421(false);
						method441(field1070);
						class221.method1337(field1070);
						for (var8 = 0; var8 < 100; ++var8) {
							field908[var8] = true;
						}
					}
					class208 var69;
					for (; var7-- > 0; var69.field1914 = true) {
						var8 = var4.method1100();
						var9 = var4.method1145();
						var10 = var4.method1096();
						var69 = (class208) field919.method2582((long) var8);
						if (null != var69 && var9 != var69.field1915) {
							method484(var69, true);
							var69 = null;
						}
						if (var69 == null) {
							var69 = method569(var8, var9, var10);
						}
					}
					for (var79 = (class208) field919.method2583(); var79 != null; var79 = (class208) field919.method2584()) {
						if (var79.field1914) {
							var79.field1914 = false;
						} else {
							method484(var79, true);
						}
					}
					field1117 = new class535(512);
					while (var4.field1832 < var24) {
						var8 = var4.method1100();
						var9 = var4.method1145();
						var10 = var4.method1145();
						var11 = var4.method1100();
						for (var37 = var9; var37 <= var10; ++var37) {
							var53 = ((long) var8 << 32) + (long) var37;
							field1117.method2585(new class239(var11), var53);
						}
					}
					var1.field1600 = null;
					return true;
				}
				class354 var66;
				if (var1.field1600 == class465.field3675) {
					var24 = var4.method1100();
					var26 = var4.method1141();
					class208 var89 = (class208) field919.method2582((long) var26);
					var79 = (class208) field919.method2582((long) var24);
					if (null != var79) {
						method484(var79, var89 == null || var79.field1915 != var89.field1915);
					}
					if (null != var89) {
						var89.method318();
						field919.method2585(var89, (long) var24);
					}
					var66 = class354.method1860(var26);
					if (var66 != null) {
						method532(var66);
					}
					var66 = class354.method1860(var24);
					if (var66 != null) {
						method532(var66);
						method471(class457.field3488[var66.field2688 >>> 16], var66, true);
					}
					if (field1070 != -1) {
						method582(field1070, 1);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3630) {
					class160.method938();
					var23 = var4.method1097();
					if (var1.field1606 == 1) {
						if (var23 >= 0) {
							field1142[var23] = null;
						} else {
							class274.field2250 = null;
						}
						var1.field1600 = null;
						return true;
					}
					if (var23 >= 0) {
						field1142[var23] = new class518(var4);
					} else {
						class274.field2250 = new class518(var4);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3643) {
					var24 = var4.method1100();
					class208 var91 = (class208) field919.method2582((long) var24);
					if (null != var91) {
						method484(var91, true);
					}
					if (null != field1075) {
						method532(field1075);
						field1075 = null;
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3665) {
					var10 = var4.method1145();
					var7 = var4.method1153();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = var26 + (var7 & 7);
					var11 = var4.method1117();
					var37 = var4.method1124();
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var8 = 64 + var8 * 128;
						var9 = var9 * 128 + 64;
						class435 var62 = new class435(var10, class121.field1436, var8, var9, method450(var8, var9, class121.field1436) - var11, var37, field1201);
						field1168.method2222(var62);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3662 == var1.field1600) {
					field1107 = field900;
					var23 = var4.method1097();
					if (var1.field1606 == 1) {
						if (var23 >= 0) {
							field1143[var23] = null;
						} else {
							class141.field1541 = null;
						}
						var1.field1600 = null;
						return true;
					}
					if (var23 >= 0) {
						field1143[var23] = new class345(var4);
					} else {
						class141.field1541 = new class345(var4);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3577) {
					class192.method1176(class255.field2138);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3673) {
					class192.method1176(class255.field2139);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3681) {
					var24 = var4.method1123();
					var26 = var4.method1118();
					if (var24 == 65535) {
						var24 = -1;
					}
					method601(class431.field3378, var24, var26);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3686 == var1.field1600) {
					method552(true, var1.field1604);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3606 == var1.field1600) {
					if (field1070 != -1) {
						method582(field1070, 0);
					}
					var1.field1600 = null;
					return true;
				}
				class354 var35;
				if (var1.field1600 == class465.field3598) {
					var24 = var4.method1136();
					var26 = var4.method1125();
					var7 = var4.method1124();
					var35 = class354.method1860(var24);
					var35.field2779 = (var26 << 16) + var7;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3655 == var1.field1600) {
					field1151 = var4.method1096();
					var1.field1600 = null;
					return true;
				}
				int var17;
				String var68;
				if (class465.field3667 == var1.field1600) {
					var23 = var4.method1097();
					var6 = var4.method1104();
					long var87 = (long) var4.method1145();
					long var71 = (long) var4.method1152();
					class76 var61 = (class76) class433.method2167(class76.method317(), var4.method1096());
					long var51 = (var87 << 32) + var71;
					boolean var57 = false;
					class345 var76 = null;
					var76 = var23 >= 0 ? field1143[var23] : class141.field1541;
					if (null == var76) {
						var57 = true;
					} else {
						var16 = 0;
						while (true) {
							if (var16 >= 100) {
								if (var61.field766 && class147.field1555.method944(new UsernameDisplayName(var6, class267.field2198))) {
									var57 = true;
								}
								break;
							}
							if (field1044[var16] == var51) {
								var57 = true;
								break;
							}
							++var16;
						}
					}
					if (!var57) {
						field1044[field906] = var51;
						field906 = (1 + field906) % 100;
						var68 = class500.method2399(class291.method1577(var4));
						var17 = var23 >= 0 ? 41 : 44;
						if (var61.field781 != -1) {
							class156.method925(var17, class75.method315(var61.field781) + var6, var68, var76.field2617);
						} else {
							class156.method925(var17, var6, var68, var76.field2617);
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3648 == var1.field1600) {
					var4.field1832 += 28;
					if (var4.method1115()) {
						method456(var4, var4.field1832 - 28);
					}
					var1.field1600 = null;
					return true;
				}
				String var29;
				if (class465.field3661 == var1.field1600) {
					var29 = var4.method1104();
					var26 = var4.method1117();
					var7 = var4.method1118();
					if (var7 >= 1 && var7 <= 8) {
						if (var29.equalsIgnoreCase(class55.field629)) {
							var29 = null;
						}
						field921[var7 - 1] = var29;
						field1035[var7 - 1] = var26 == 0;
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3614) {
					var24 = var4.method1145();
					if (var24 == 65535) {
						var24 = -1;
					}
					method557(var24);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3646 == var1.field1600) {
					var24 = var4.method1125();
					if (var24 == 65535) {
						var24 = -1;
					}
					var26 = var4.method1149();
					method470(var24, var26);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3569) {
					method599();
					var1.field1600 = null;
					return false;
				}
				if (var1.field1600 == class465.field3660) {
					var24 = var4.method1135();
					var26 = var4.method1118();
					var7 = var4.method1125();
					var79 = (class208) field919.method2582((long) var24);
					if (var79 != null) {
						method484(var79, var7 != var79.field1915);
					}
					method569(var24, var7, var26);
					var1.field1600 = null;
					return true;
				}
				class354 var30;
				boolean var58;
				if (class465.field3638 == var1.field1600) {
					var58 = var4.method1156() == 1;
					var26 = var4.method1100();
					var30 = class354.method1860(var26);
					if (var58 != var30.field2706) {
						var30.field2706 = var58;
						method532(var30);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3570) {
					var24 = var4.method1125();
					var26 = var4.method1145();
					var7 = var4.method1136();
					var8 = var4.method1145();
					var66 = class354.method1860(var7);
					if (var8 != var66.field2738 || var66.field2756 != var24 || var26 != var66.field2741) {
						var66.field2738 = var8;
						var66.field2756 = var24;
						var66.field2741 = var26;
						method532(var66);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3571 == var1.field1600) {
					var24 = var4.method1124();
					var26 = var4.method1135();
					var30 = class354.method1860(var26);
					if (var30.field2730 != 1 || var30.field2731 != var24) {
						var30.field2730 = 1;
						var30.field2731 = var24;
						method532(var30);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3566) {
					class192.method1176(class255.field2135);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3611) {
					var9 = var4.method1124();
					var7 = var4.method1123();
					var8 = var4.method1123();
					var24 = var4.method1125();
					var26 = var4.method1125();
					if (var24 == 65535) {
						var24 = -1;
					}
					ArrayList var72 = new ArrayList();
					var72.add(var24);
					class81.method328(var72, var26, var7, var8, var9);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3587 == var1.field1600) {
					class192.method1176(class255.field2128);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3585) {
					class147.field1555.method940();
					field1104 = field900;
					var1.field1600 = null;
					return true;
				}
				String var55;
				if (var1.field1600 == class465.field3616) {
					byte[] var92 = new byte[var1.field1606];
					var4.method2486(var92, 0, var92.length);
					class187 var88 = new class187(var92);
					var55 = var88.method1104();
					class41.method177(var55, true, false);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3645) {
					class192 var90 = new class192();
					var90.field1847 = var4.method1104();
					var90.field1844 = var4.method1145();
					var26 = var4.method1100();
					var90.field1840 = var26;
					if (var90.method1174()) {
						var90.field1851 = "beta";
					}
					method567(45);
					var3.method2073();
					var3 = null;
					class393.method2032(var90);
					var1.field1600 = null;
					return false;
				}
				if (var1.field1600 == class465.field3631) {
					field918 = var4.method1124() * 30;
					field950 = field900;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3573 == var1.field1600) {
					var24 = var4.method1145();
					if (var24 == 65535) {
						var24 = -1;
					}
					field1070 = var24;
					this.method421(false);
					method441(var24);
					class221.method1337(field1070);
					for (var26 = 0; var26 < 100; ++var26) {
						field908[var26] = true;
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3672 == var1.field1600) {
					field1159 = true;
					field1165 = false;
					field1160 = true;
					class274.field2236 = var4.method1096();
					class474.field3728 = var4.method1096();
					var24 = var4.method1145();
					var26 = var4.method1145();
					field1162 = var4.method1103();
					var7 = var4.method1096();
					var8 = class274.field2236 * 128 + 64;
					var9 = 64 + class474.field3728 * 128;
					boolean var59 = false;
					boolean var56 = false;
					if (field1162) {
						var10 = class93.field1211;
						var11 = method450(var8, var9, class121.field1436) - var24;
					} else {
						var10 = method450(class314.field2470, class225.field1995, class121.field1436) - class93.field1211;
						var11 = var24;
					}
					field1163 = new class45(class314.field2470, class225.field1995, var10, var8, var9, var11, var26, var7);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3632) {
					method552(false, var1.field1604);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3671 == var1.field1600) {
					var24 = var4.method1141();
					var86 = class354.method1860(var24);
					for (var7 = 0; var7 < var86.field2814.length; ++var7) {
						var86.field2814[var7] = -1;
						var86.field2814[var7] = 0;
					}
					method532(var86);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3639) {
					var24 = var4.method1123();
					var26 = var4.method1141();
					var30 = class354.method1860(var26);
					if (var30 != null && var30.field2690 == 0) {
						if (var24 > var30.field2710 - var30.field2680) {
							var24 = var30.field2710 - var30.field2680;
						}
						if (var24 < 0) {
							var24 = 0;
						}
						if (var30.field2721 != var24) {
							var30.field2721 = var24;
							method532(var30);
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3659) {
					field1132 = var4.method1096();
					field1131 = var4.method1117();
					var1.field1600 = null;
					return true;
				}
				if (class465.field3653 == var1.field1600) {
					field1159 = true;
					field1165 = false;
					field1161 = false;
					class39.field187 = var4.method1096();
					class431.field3375 = var4.method1096();
					class360.field2865 = var4.method1145();
					class474.field3730 = var4.method1096();
					class319.field2503 = var4.method1096();
					if (class319.field2503 >= 100) {
						var24 = 64 + class39.field187 * 128;
						var26 = 64 + class431.field3375 * 128;
						var7 = method450(var24, var26, class121.field1436) - class360.field2865;
						var8 = var24 - class314.field2470;
						var9 = var7 - class93.field1211;
						var10 = var26 - class225.field1995;
						var11 = (int) Math.sqrt((double) (var10 * var10 + var8 * var8));
						class283.field2296 = (int) (Math.atan2((double) var9, (double) var11) * 325.9490051269531D) & 2047;
						class511.field4085 = (int) (Math.atan2((double) var8, (double) var10) * -325.9490051269531D) & 2047;
						if (class283.field2296 < 128) {
							class283.field2296 = 128;
						}
						if (class283.field2296 > 383) {
							class283.field2296 = 383;
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3615) {
					return this.method436(var1, 1);
				}
				if (var1.field1600 == class465.field3624) {
					field976 = var4.method1096();
					if (field976 == 1) {
						field920 = var4.method1145();
					}
					if (field976 >= 2 && field976 <= 6) {
						if (field976 == 2) {
							field1085 = 64;
							field1118 = 64;
						}
						if (field976 == 3) {
							field1085 = 0;
							field1118 = 64;
						}
						if (field976 == 4) {
							field1085 = 128;
							field1118 = 64;
						}
						if (field976 == 5) {
							field1085 = 64;
							field1118 = 0;
						}
						if (field976 == 6) {
							field1085 = 64;
							field1118 = 128;
						}
						field976 = 2;
						field922 = var4.method1145();
						field1065 = var4.method1145();
						field929 = var4.method1096();
					}
					if (field976 == 10) {
						field939 = var4.method1145();
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3582) {
					class160.method938();
					var23 = var4.method1097();
					class400 var85 = new class400(var4);
					class518 var83;
					if (var23 >= 0) {
						var83 = field1142[var23];
					} else {
						var83 = class274.field2250;
					}
					if (null == var83) {
						this.method426(var23);
						var1.field1600 = null;
						return true;
					}
					if (var85.field3170 > var83.field4119) {
						this.method426(var23);
						var1.field1600 = null;
						return true;
					}
					if (var85.field3170 < var83.field4119) {
						var1.field1600 = null;
						return true;
					}
					var85.method2058(var83);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3677) {
					class192.method1176(class255.field2134);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3601 == var1.field1600) {
					var24 = var4.method1099();
					var26 = var4.method1100();
					var7 = var4.method1098();
					var35 = class354.method1860(var26);
					if (var35.field2697 != var7 || var35.field2698 != var24 || var35.field2693 != 0 || var35.field2694 != 0) {
						var35.field2697 = var7;
						var35.field2698 = var24;
						var35.field2693 = 0;
						var35.field2694 = 0;
						method532(var35);
						this.method422(var35);
						if (var35.field2690 == 0) {
							method471(class457.field3488[var26 >> 16], var35, false);
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3676 == var1.field1600) {
					var24 = var4.method1136();
					var26 = var4.method1135();
					var30 = class354.method1860(var26);
					class354.method1856(var30, var24);
					method532(var30);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3642 == var1.field1600) {
					var24 = var4.method1145();
					var26 = var4.method1141();
					var30 = class354.method1860(var26);
					if (var30.field2730 != 6 || var24 != var30.field2731) {
						var30.field2730 = 6;
						var30.field2731 = var24;
						method532(var30);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3568 == var1.field1600) {
					byte var52 = var4.method1111();
					var74 = var4.method1156() * 4;
					byte var49 = var4.method1111();
					var47 = var4.method1124();
					var37 = var4.method1142();
					var17 = var4.method1123();
					var14 = var4.method1117() * 4;
					var16 = var4.method1125();
					var7 = var4.method1153();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = var26 + (var7 & 7);
					int var19 = var4.method1096();
					int var18 = var4.method1118();
					var10 = var52 + var8;
					var11 = var49 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var47 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = var10 * 128 + 64;
						var11 = 64 + var11 * 128;
						class489 var20 = new class489(var47, class121.field1436, var8, var9, method450(var8, var9, class121.field1436) - var14, var16 + field1201, field1201 + var17, var18, var19, var37, var74);
						var20.method2352(var10, var11, method450(var10, var11, class121.field1436) - var74, var16 + field1201);
						field1025.method2222(var20);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3651) {
					class225.field1994 = new class5(class180.field1776);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3622) {
					class46.field215 = var4.method1156();
					class528.field4184 = var4.method1118();
					var1.field1600 = null;
					return true;
				}
				if (class465.field3684 == var1.field1600) {
					for (var24 = 0; var24 < field1071.length; ++var24) {
						if (field1071[var24] != null) {
							field1071[var24].field287 = -1;
						}
					}
					for (var24 = 0; var24 < field958.length; ++var24) {
						if (field958[var24] != null) {
							field958[var24].field287 = -1;
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3610) {
					method546(false, var4);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3603 == var1.field1600) {
					class523.method2559(var4, var1.field1606);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3578) {
					method546(true, var4);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3604) {
					var24 = var4.method1117();
					var26 = var4.method1117();
					var7 = var4.method1141();
					var35 = class354.method1860(var7);
					class354.method1859(var35, var26, var24);
					method532(var35);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3620 == var1.field1600) {
					var26 = var4.method1145();
					var24 = var4.method1123();
					class436.method2172(var24, var26);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3669) {
					var58 = var4.method1103();
					if (var58) {
						if (null == class364.field2923) {
							class364.field2923 = new class60();
						}
					} else {
						class364.field2923 = null;
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3640) {
					field1159 = true;
					field1165 = false;
					field1161 = true;
					var24 = method444(var4.method1098() & 2027);
					var26 = method485(var4.method1098() & 2027);
					var7 = var4.method1145();
					var8 = var4.method1096();
					field980 = new class353(class283.field2296, var26, var7, var8);
					field954 = new class353(class511.field4085, var24, var7, var8);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3602) {
					return this.method416(var1);
				}
				if (class465.field3581 == var1.field1600) {
					class192.method1176(class255.field2130);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3591 == var1.field1600) {
					var24 = var4.method1135();
					var26 = var4.method1145();
					if (var26 == 65535) {
						var26 = -1;
					}
					var7 = var4.method1136();
					var8 = var4.method1125();
					if (var8 == 65535) {
						var8 = -1;
					}
					for (var9 = var8; var9 <= var26; ++var9) {
						var42 = ((long) var7 << 32) + (long) var9;
						class77 var48 = field1117.method2582(var42);
						if (var48 != null) {
							var48.method318();
						}
						field1117.method2585(new class239(var24), var42);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3607 == var1.field1600) {
					var8 = var4.method1124();
					var26 = var4.method1125();
					if (var26 == 65535) {
						var26 = -1;
					}
					var9 = var4.method1125();
					var7 = var4.method1123();
					var10 = var4.method1123();
					var24 = var4.method1124();
					if (var24 == 65535) {
						var24 = -1;
					}
					ArrayList var43 = new ArrayList();
					var43.add(var24);
					var43.add(var26);
					class81.method328(var43, var7, var8, var9, var10);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3612) {
					method498();
					var24 = var4.method1118();
					var26 = var4.method1117();
					var7 = var4.method1141();
					field1193[var26] = var7;
					field1042[var26] = var24;
					field1190[var26] = 1;
					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= class329.field2538[var8]) {
							field1190[var26] = var8 + 2;
						}
					}
					field1022[++field1100 - 1 & 31] = var26;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3674) {
					var24 = var4.method1145();
					var26 = var4.method1096();
					var7 = var4.method1145();
					method454(var24, var26, var7);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3628 == var1.field1600) {
					var24 = var4.method1096();
					var26 = var4.method1136();
					var30 = class354.method1860(var26);
					class354.method1861(var30, class431.field3378.field806.field4058, var24);
					method532(var30);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3597 == var1.field1600) {
					var24 = var4.method1136();
					var26 = var4.method1145();
					var30 = class354.method1860(var24);
					if (var30.field2730 != 2 || var30.field2731 != var26) {
						var30.field2730 = 2;
						var30.field2731 = var26;
						method532(var30);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3567) {
					var24 = var4.method1096();
					class436.method2171(var24);
					var1.field1600 = null;
					return false;
				}
				if (var1.field1600 == class465.field3583) {
					method498();
					field1015 = var4.method1145();
					field950 = field900;
					var1.field1600 = null;
					return true;
				}
				boolean var60;
				if (var1.field1600 == class465.field3679) {
					var24 = var4.method1136();
					var60 = var4.method1096() == 1;
					var30 = class354.method1860(var24);
					class390.method2026(var30, class431.field3378.field806, var60);
					method532(var30);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3608 == var1.field1600) {
					var23 = var4.method1119();
					var26 = var4.method1124();
					class410.field3200[var26] = var23;
					if (class410.field3198[var26] != var23) {
						class410.field3198[var26] = var23;
					}
					method554(var26);
					field1095[++field1096 - 1 & 31] = var26;
					var1.field1600 = null;
					return true;
				}
				boolean var13;
				if (class465.field3589 == var1.field1600) {
					var29 = var4.method1104();
					var50 = (long) var4.method1145();
					var33 = (long) var4.method1152();
					class76 var44 = (class76) class433.method2167(class76.method317(), var4.method1096());
					long var40 = (var50 << 32) + var33;
					var13 = false;
					for (var14 = 0; var14 < 100; ++var14) {
						if (var40 == field1044[var14]) {
							var13 = true;
							break;
						}
					}
					if (class147.field1555.method944(new UsernameDisplayName(var29, class267.field2198))) {
						var13 = true;
					}
					if (!var13 && field1023 == 0) {
						field1044[field906] = var40;
						field906 = (field906 + 1) % 100;
						var54 = class500.method2399(class514.method2467(class291.method1577(var4)));
						byte var63;
						if (var44.field782) {
							var63 = 7;
						} else {
							var63 = 3;
						}
						if (var44.field781 != -1) {
							class156.method918(var63, class75.method315(var44.field781) + var29, var54);
						} else {
							class156.method918(var63, var29, var54);
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3613 == var1.field1600) {
					if (null == class225.field1994) {
						class225.field1994 = new class5(class180.field1776);
					}
					class456 var77 = class180.field1776.method2229(var4);
					class225.field1994.field21.method5(var77.field3481, var77.field3480);
					field1164[++field1029 - 1 & 31] = var77.field3481;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3627) {
					var1.field1600 = null;
					return true;
				}
				class373 var41;
				if (var1.field1600 == class465.field3592) {
					short var75 = (short) var4.method1099();
					var26 = var4.method1096();
					var7 = var4.method1145();
					var8 = var4.method1135();
					var41 = field958[var7];
					if (null != var41) {
						var41.method1987(var26, var8, var75);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3605 == var1.field1600) {
					var24 = var4.method1100();
					if (field998 != var24) {
						field998 = var24;
						method544();
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3637 == var1.field1600) {
					for (var24 = 0; var24 < class136.field1488; ++var24) {
						class136 var67 = class469.method2292(var24);
						if (var67 != null) {
							class410.field3200[var24] = 0;
							class410.field3198[var24] = 0;
						}
					}
					method498();
					field1096 += 32;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3656) {
					var29 = var4.method1104();
					Object[] var64 = new Object[var29.length() + 1];
					for (var7 = var29.length() - 1; var7 >= 0; --var7) {
						if (var29.charAt(var7) == 's') {
							var64[var7 + 1] = var4.method1104();
						} else {
							var64[var7 + 1] = new Integer(var4.method1100());
						}
					}
					var64[0] = new Integer(var4.method1100());
					class165 var65 = new class165();
					var65.field1667 = var64;
					class221.method1344(var65);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3644 == var1.field1600) {
					var29 = var4.method1104();
					var6 = class500.method2399(class514.method2467(class291.method1577(var4)));
					class156.method918(6, var29, var6);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3565) {
					class147.field1555.field1643.method2226(var4, var1.field1606);
					method591();
					field1104 = field900;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3588) {
					var24 = var4.method1143();
					var60 = var4.method1096() == 1;
					var55 = "";
					boolean var39 = false;
					if (var60) {
						var55 = var4.method1104();
						if (class147.field1555.method944(new UsernameDisplayName(var55, class267.field2198))) {
							var39 = true;
						}
					}
					String var45 = var4.method1104();
					if (!var39) {
						class156.method918(var24, var55, var45);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3647) {
					var58 = var4.method1096() == 1;
					if (var58) {
						class259.field2166 = class48.method197() - var4.method1101();
						class505.field4054 = new class458(var4, true);
					} else {
						class505.field4054 = null;
					}
					field969 = field900;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3625 == var1.field1600) {
					var24 = var4.method1124();
					var41 = field958[var24];
					var8 = var4.method1117();
					var7 = var4.method1124();
					var26 = var4.method1135();
					if (var41 != null) {
						var41.method220(var8, var7, var26 >> 16, var26 & 65535);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3629) {
					var24 = var4.method1123();
					if (var24 == 65535) {
						var24 = -1;
					}
					var26 = var4.method1100();
					var7 = var4.method1136();
					var35 = class354.method1860(var26);
					class426 var36;
					if (!var35.field2768) {
						if (var24 == -1) {
							var35.field2730 = 0;
							var1.field1600 = null;
							return true;
						}
						var36 = class426.method2155(var24).method2141(var7);
						var35.field2730 = 4;
						var35.field2731 = var24;
						var35.field2738 = var36.field3289;
						var35.field2756 = var36.field3305;
						var35.field2741 = var36.field3312 * 100 / var7;
						method532(var35);
					} else {
						var35.field2816 = var24;
						var35.field2817 = var7;
						var36 = class426.method2155(var24).method2141(var7);
						var35.field2738 = var36.field3289;
						var35.field2756 = var36.field3305;
						var35.field2803 = var36.field3291;
						var35.field2736 = var36.field3290;
						var35.field2810 = var36.field3307;
						var35.field2741 = var36.field3312;
						if (var36.field3308 == 1) {
							var35.field2747 = 1;
						} else {
							var35.field2747 = 2;
						}
						if (var35.field2742 > 0) {
							var35.field2741 = var35.field2741 * 32 / var35.field2742;
						} else if (var35.field2699 > 0) {
							var35.field2741 = var35.field2741 * 32 / var35.field2699;
						}
						method532(var35);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3600 == var1.field1600) {
					var26 = var4.method1125();
					var7 = var4.method1117();
					var24 = var4.method1123();
					if (var26 == 65535) {
						var26 = -1;
					}
					class373 var34 = field958[var24];
					if (null != var34) {
						if (var34.field287 == var26 && var26 != -1) {
							var9 = class67.method308(var26).field716;
							if (var9 == 1) {
								var34.field288 = 0;
								var34.field289 = 0;
								var34.field304 = var7;
								var34.field269 = 0;
							} else if (var9 == 2) {
								var34.field269 = 0;
							}
						} else if (var26 == -1 || var34.field287 == -1 || class67.method308(var26).field709 >= class67.method308(var34.field287).field709) {
							var34.field287 = var26;
							var34.field288 = 0;
							var34.field289 = 0;
							var34.field304 = var7;
							var34.field269 = 0;
							var34.field306 = var34.field290;
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3579) {
					var29 = var4.method1104();
					var50 = var4.method1101();
					var33 = (long) var4.method1145();
					var42 = (long) var4.method1152();
					class76 var46 = (class76) class433.method2167(class76.method317(), var4.method1096());
					var53 = var42 + (var33 << 32);
					boolean var15 = false;
					for (var16 = 0; var16 < 100; ++var16) {
						if (field1044[var16] == var53) {
							var15 = true;
							break;
						}
					}
					if (var46.field766 && class147.field1555.method944(new UsernameDisplayName(var29, class267.field2198))) {
						var15 = true;
					}
					if (!var15 && field1023 == 0) {
						field1044[field906] = var53;
						field906 = (1 + field906) % 100;
						var68 = class500.method2399(class514.method2467(class291.method1577(var4)));
						if (var46.field781 != -1) {
							class156.method925(9, class75.method315(var46.field781) + var29, var68, class337.method1760(var50));
						} else {
							class156.method925(9, var29, var68, class337.method1760(var50));
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3634 == var1.field1600) {
					var24 = var4.method1096();
					method559(var24);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3595 == var1.field1600) {
					var24 = var4.method1096();
					var26 = var4.method1096();
					var7 = var4.method1096();
					var8 = var4.method1096();
					field1166[var24] = true;
					field960[var24] = var26;
					field1120[var24] = var7;
					field1030[var24] = var8;
					field1116[var24] = 0;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3618 == var1.field1600) {
					var24 = var4.method1100();
					var26 = var4.method1145();
					if (var24 < -70000) {
						var26 += 32768;
					}
					if (var24 >= 0) {
						var30 = class354.method1860(var24);
					} else {
						var30 = null;
					}
					for (; var4.field1832 < var1.field1606; class53.method216(var26, var8, var9 - 1, var10)) {
						var8 = var4.method1143();
						var9 = var4.method1145();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method1096();
							if (var10 == 255) {
								var10 = var4.method1100();
							}
						}
						if (var30 != null && var8 >= 0 && var8 < var30.field2814.length) {
							var30.field2814[var8] = var9;
							var30.field2815[var8] = var10;
						}
					}
					if (null != var30) {
						method532(var30);
					}
					method498();
					field1097[++field1098 - 1 & 31] = var26 & 32767;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3574 == var1.field1600) {
					field1159 = true;
					field1165 = false;
					field1161 = true;
					var24 = var4.method1098();
					var26 = var4.method1098();
					var7 = method485(class283.field2296 + var26 & 2027);
					var8 = class511.field4085 + var24;
					var9 = var4.method1145();
					var10 = var4.method1096();
					field980 = new class353(class283.field2296, var7, var9, var10);
					field954 = new class353(class511.field4085, var8, var9, var10);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3680) {
					var8 = var4.method1117();
					var7 = var4.method1135();
					var26 = var4.method1145();
					var24 = var4.method1123();
					class82 var31;
					if (var24 == field1026) {
						var31 = class431.field3378;
					} else {
						var31 = field1071[var24];
					}
					if (null != var31) {
						var31.method220(var8, var26, var7 >> 16, var7 & 65535);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3652) {
					for (var24 = 0; var24 < class410.field3198.length; ++var24) {
						if (class410.field3198[var24] != class410.field3200[var24]) {
							class410.field3198[var24] = class410.field3200[var24];
							method554(var24);
							field1095[++field1096 - 1 & 31] = var24;
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3584 == var1.field1600) {
					method463(var4.method1104());
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3664) {
					var24 = var4.method1136();
					var26 = var4.method1127();
					var30 = class354.method1860(var24);
					if (var26 != var30.field2734 || var26 == -1) {
						var30.field2734 = var26;
						var30.field2818 = 0;
						var30.field2819 = 0;
						method532(var30);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3633) {
					class46.field215 = var4.method1096();
					class528.field4184 = var4.method1118();
					while (var4.field1832 < var1.field1606) {
						var24 = var4.method1096();
						class255 var32 = class255.method1452()[var24];
						class192.method1176(var32);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3619) {
					var24 = var4.method1124();
					var26 = var4.method1125();
					var8 = var4.method1125();
					var7 = var4.method1123();
					class388.method2016(var24, var26, var7, var8);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3635) {
					field1159 = true;
					field1165 = false;
					field1160 = true;
					class274.field2236 = var4.method1096();
					class474.field3728 = var4.method1096();
					var24 = var4.method1145();
					var26 = var4.method1096() * 128 + 64;
					var7 = var4.method1096() * 128 + 64;
					var8 = var4.method1145();
					field1162 = var4.method1103();
					var9 = var4.method1096();
					var10 = class274.field2236 * 128 + 64;
					var11 = class474.field3728 * 128 + 64;
					var12 = false;
					var13 = false;
					if (field1162) {
						var37 = class93.field1211;
						var47 = method450(var10, var11, class121.field1436) - var24;
					} else {
						var37 = method450(class314.field2470, class225.field1995, class121.field1436) - class93.field1211;
						var47 = var24;
					}
					field1163 = new class227(class314.field2470, class225.field1995, var37, var10, var11, var47, var26, var7, var8, var9);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3575) {
					class147.field1555.method951(var4, var1.field1606);
					field1104 = field900;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3641 == var1.field1600) {
					field1159 = true;
					field1165 = false;
					field1160 = false;
					class274.field2236 = var4.method1096();
					class474.field3728 = var4.method1096();
					class136.field1492 = var4.method1145();
					class120.field1433 = var4.method1096();
					class422.field3268 = var4.method1096();
					if (class422.field3268 >= 100) {
						class314.field2470 = 64 + class274.field2236 * 128;
						class225.field1995 = class474.field3728 * 128 + 64;
						class93.field1211 = method450(class314.field2470, class225.field1995, class121.field1436) - class136.field1492;
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3657) {
					var24 = var4.method1136();
					var26 = var4.method1124();
					var7 = var26 >> 10 & 31;
					var8 = var26 >> 5 & 31;
					var9 = var26 & 31;
					var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
					class354 var38 = class354.method1860(var24);
					if (var38.field2711 != var10) {
						var38.field2711 = var10;
						method532(var38);
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3621) {
					var29 = var4.method1104();
					var26 = var4.method1141();
					var30 = class354.method1860(var26);
					if (!var29.equals(var30.field2748)) {
						var30.field2748 = var29;
						method532(var30);
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3670 == var1.field1600) {
					var24 = var4.method1100();
					var26 = var4.method1145();
					if (var24 < -70000) {
						var26 += 32768;
					}
					if (var24 >= 0) {
						var30 = class354.method1860(var24);
					} else {
						var30 = null;
					}
					if (null != var30) {
						for (var8 = 0; var8 < var30.field2814.length; ++var8) {
							var30.field2814[var8] = 0;
							var30.field2815[var8] = 0;
						}
					}
					class53.method211(var26);
					var8 = var4.method1145();
					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var4.method1145();
						var11 = var4.method1118();
						if (var11 == 255) {
							var11 = var4.method1141();
						}
						if (null != var30 && var9 < var30.field2814.length) {
							var30.field2814[var9] = var10;
							var30.field2815[var9] = var11;
						}
						class53.method216(var26, var9, var10 - 1, var11);
					}
					if (var30 != null) {
						method532(var30);
					}
					method498();
					field1097[++field1098 - 1 & 31] = var26 & 32767;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3590) {
					var24 = var4.method1123();
					var26 = var4.method1141();
					class410.field3200[var24] = var26;
					if (var26 != class410.field3198[var24]) {
						class410.field3198[var24] = var26;
					}
					method554(var24);
					field1095[++field1096 - 1 & 31] = var24;
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3594) {
					class192.method1176(class255.field2131);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3682 == var1.field1600) {
					class192.method1176(class255.field2137);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3654) {
					class192.method1176(class255.field2136);
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3663) {
					var24 = var4.method1096();
					if (var4.method1096() == 0) {
						field1176[var24] = new class516();
						var4.field1832 += 18;
					} else {
						--var4.field1832;
						field1176[var24] = new class516(var4, false);
					}
					field1108 = field900;
					var1.field1600 = null;
					return true;
				}
				if (class465.field3580 == var1.field1600 && field1159) {
					field1165 = true;
					field1161 = false;
					field1160 = false;
					for (var24 = 0; var24 < 5; ++var24) {
						field1166[var24] = false;
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3576) {
					class46.field215 = var4.method1156();
					class528.field4184 = var4.method1118();
					for (var24 = class46.field215; var24 < class46.field215 + 8; ++var24) {
						for (var26 = class528.field4184; var26 < class528.field4184 + 8; ++var26) {
							if (field1038[class121.field1436][var24][var26] != null) {
								field1038[class121.field1436][var24][var26] = null;
								method500(var24, var26);
							}
						}
					}
					for (class39 var25 = (class39) field1039.method2218(); var25 != null; var25 = (class39) field1039.method2220()) {
						if (var25.field193 >= class46.field215 && var25.field193 < class46.field215 + 8 && var25.field199 >= class528.field4184 && var25.field199 < 8 + class528.field4184 && class121.field1436 == var25.field200) {
							var25.field198 = 0;
						}
					}
					var1.field1600 = null;
					return true;
				}
				if (class465.field3599 == var1.field1600) {
					return this.method436(var1, 2);
				}
				if (var1.field1600 == class465.field3668) {
					field1149 = var4.method1096();
					if (field1149 == 255) {
						field1149 = 0;
					}
					field1072 = var4.method1096();
					if (field1072 == 255) {
						field1072 = 0;
					}
					var1.field1600 = null;
					return true;
				}
				if (var1.field1600 == class465.field3593) {
					field1107 = field900;
					var23 = var4.method1097();
					class390 var27 = new class390(var4);
					class345 var28;
					if (var23 >= 0) {
						var28 = field1143[var23];
					} else {
						var28 = class141.field1541;
					}
					if (var28 == null) {
						this.method434(var23);
						var1.field1600 = null;
						return true;
					}
					if (var27.field3107 > var28.field2619) {
						this.method434(var23);
						var1.field1600 = null;
						return true;
					}
					if (var27.field3107 < var28.field2619) {
						var1.field1600 = null;
						return true;
					}
					var27.method2025(var28);
					var1.field1600 = null;
					return true;
				}
				if (class465.field3687 == var1.field1600) {
					class192.method1176(class255.field2132);
					var1.field1600 = null;
					return true;
				}
				class156.method917("" + (var1.field1600 != null ? -908169793 * var1.field1600.field3688 * 1400406591 : -1) + class74.field736 + (var1.field1611 != null ? var1.field1611.field3688 : -1) + class74.field736 + (null != var1.field1612 ? var1.field1612.field3688 : -1) + class74.field736 + var1.field1606, (Throwable) null);
				method599();
			} catch (IOException var21) {
				method533();
			} catch (Exception var22) {
				var6 = "" + (null != var1.field1600 ? var1.field1600.field3688 : -1) + class74.field736 + (var1.field1611 != null ? var1.field1611.field3688 : -1) + class74.field736 + (null != var1.field1612 ? -908169793 * var1.field1612.field3688 * 1400406591 : -1) + class74.field736 + var1.field1606 + class74.field736 + (class346.field2624 + class431.field3378.field317[0]) + class74.field736 + (class211.field1922 + class431.field3378.field314[0]) + class74.field736;
				for (var7 = 0; var7 < var1.field1606 && var7 < 50; ++var7) {
					var6 = var6 + var4.field1830[var7] + class74.field736;
				}
				class156.method917(var6, var22);
				method599();
			}
			return true;
		}
	}

	final void method418() {
		boolean var2 = false;
		int var3;
		int var6;
		while (!var2) {
			var2 = true;
			for (var3 = 0; var3 < field1047 - 1; ++var3) {
				if (field1091[var3] < 1000 && field1091[var3 + 1] > 1000) {
					String var4 = field1172[var3];
					field1172[var3] = field1172[var3 + 1];
					field1172[var3 + 1] = var4;
					String var5 = field1053[var3];
					field1053[var3] = field1053[var3 + 1];
					field1053[var3 + 1] = var5;
					var6 = field1091[var3];
					field1091[var3] = field1091[var3 + 1];
					field1091[var3 + 1] = var6;
					var6 = field1048[var3];
					field1048[var3] = field1048[var3 + 1];
					field1048[var3 + 1] = var6;
					var6 = field1049[var3];
					field1049[var3] = field1049[var3 + 1];
					field1049[var3 + 1] = var6;
					var6 = field1051[var3];
					field1051[var3] = field1051[var3 + 1];
					field1051[var3 + 1] = var6;
					var6 = field1052[var3];
					field1052[var3] = field1052[var3 + 1];
					field1052[var3 + 1] = var6;
					boolean var7 = field1055[var3];
					field1055[var3] = field1055[var3 + 1];
					field1055[var3 + 1] = var7;
					var2 = false;
				}
			}
		}
		if (null == field1082) {
			int var16 = class422.field3264;
			int var8;
			int var9;
			int var18;
			int var19;
			if (field1011) {
				int var17;
				if (var16 != 1 && (class349.field2637 || var16 != 4)) {
					var3 = class422.field3270;
					var17 = class422.field3253;
					if (var3 < class538.field4239 - 10 || var3 > class538.field4239 + class350.field2639 + 10 || var17 < class324.field2525 - 10 || var17 > class324.field2525 + class244.field2068 + 10) {
						field1011 = false;
						var18 = class538.field4239;
						var6 = class324.field2525;
						var19 = class350.field2639;
						var8 = class244.field2068;
						for (var9 = 0; var9 < field1069; ++var9) {
							if (field1125[var9] + field1123[var9] > var18 && field1123[var9] < var18 + var19 && field1124[var9] + field1126[var9] > var6 && field1124[var9] < var6 + var8) {
								field908[var9] = true;
							}
						}
					}
				}
				if (var16 == 1 || !class349.field2637 && var16 == 4) {
					var3 = class538.field4239;
					var17 = class324.field2525;
					var18 = class350.field2639;
					var6 = class422.field3265;
					var19 = class422.field3266;
					var8 = -1;
					int var10;
					for (var9 = 0; var9 < field1047; ++var9) {
						var10 = var17 + 31 + (field1047 - 1 - var9) * 15;
						if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
							var8 = var9;
						}
					}
					int var11;
					int var12;
					int var13;
					if (var8 != -1 && var8 >= 0) {
						var9 = field1048[var8];
						var10 = field1049[var8];
						var11 = field1091[var8];
						var12 = field1051[var8];
						var13 = field1052[var8];
						String var14 = field1053[var8];
						String var15 = field1172[var8];
						method592(var9, var10, var11, var12, var13, var14, var15, class422.field3265, class422.field3266);
					}
					field1011 = false;
					var9 = class538.field4239;
					var10 = class324.field2525;
					var11 = class350.field2639;
					var12 = class244.field2068;
					for (var13 = 0; var13 < field1069; ++var13) {
						if (field1125[var13] + field1123[var13] > var9 && field1123[var13] < var9 + var11 && field1126[var13] + field1124[var13] > var10 && field1124[var13] < var10 + var12) {
							field908[var13] = true;
						}
					}
				}
			} else {
				var3 = field1047 - 1;
				if ((var16 == 1 || !class349.field2637 && var16 == 4) && this.method419((byte) -84)) {
					var16 = 2;
				}
				if ((var16 == 1 || !class349.field2637 && var16 == 4) && field1047 > 0 && var3 >= 0) {
					var18 = field1048[var3];
					var6 = field1049[var3];
					var19 = field1091[var3];
					var8 = field1051[var3];
					var9 = field1052[var3];
					String var20 = field1053[var3];
					String var21 = field1172[var3];
					method592(var18, var6, var19, var8, var9, var20, var21, class422.field3265, class422.field3266);
				}
				if (var16 == 2 && field1047 > 0) {
					this.method420(class422.field3265, class422.field3266);
				}
			}
		}
	}

	final boolean method419(byte var1) {
		int var2 = field1047 - 1;
		return (field1045 && field1047 > 2 || method466(var2)) && !field1055[var2];
	}

	final void method420(int var1, int var2) {
		class134.method863(var1, var2);
		var1 -= field1179;
		var2 -= field1180;
		class377.field3061.method1941(class121.field1436, var1, var2, false);
		field1011 = true;
	}

	final void method421(boolean var1) {
		int var3 = field1070;
		int var4 = class86.field856;
		int var5 = class271.field2226;
		if (class354.method1864(var3)) {
			method452(class457.field3488[var3], -1, var4, var5, var1);
		}
	}

	void method422(class354 var1) {
		class354 var3 = var1.field2705 == -1 ? null : class354.method1860(var1.field2705);
		int var4;
		int var5;
		if (var3 == null) {
			var4 = class86.field856;
			var5 = class271.field2226;
		} else {
			var4 = var3.field2703;
			var5 = var3.field2680;
		}
		method577(var1, var4, var5, false);
		method542(var1, var4, var5);
	}

	final void method423() {
		method532(field1082);
		++class52.field237;
		int var2;
		int var3;
		if (field1134 && field1087) {
			var2 = class422.field3270;
			var3 = class422.field3253;
			var2 -= field1084;
			var3 -= field1157;
			if (var2 < field1088) {
				var2 = field1088;
			}
			if (var2 + field1082.field2703 > field1101.field2703 + field1088) {
				var2 = field1101.field2703 + field1088 - field1082.field2703;
			}
			if (var3 < field1089) {
				var3 = field1089;
			}
			if (field1082.field2680 + var3 > field1089 + field1101.field2680) {
				var3 = field1089 + field1101.field2680 - field1082.field2680;
			}
			int var10 = var2 - field936;
			int var5 = var3 - field1008;
			int var6 = field1082.field2701;
			if (class52.field237 > field1082.field2743 && (var10 > var6 || var10 < -var6 || var5 > var6 || var5 < -var6)) {
				field1093 = true;
			}
			int var7 = field1101.field2707 + (var2 - field1088);
			int var8 = field1101.field2721 + (var3 - field1089);
			class165 var9;
			if (null != field1082.field2780 && field1093) {
				var9 = new class165();
				var9.field1664 = field1082;
				var9.field1665 = var7;
				var9.field1668 = var8;
				var9.field1667 = field1082.field2780;
				class221.method1344(var9);
			}
			if (class422.field3260 == 0) {
				if (field1093) {
					if (null != field1082.field2781) {
						var9 = new class165();
						var9.field1664 = field1082;
						var9.field1665 = var7;
						var9.field1668 = var8;
						var9.field1670 = field1086;
						var9.field1667 = field1082.field2781;
						class221.method1344(var9);
					}
					if (null != field1086 && method490(field1082) != null) {
						class457 var11 = class457.method2237(class483.field3820, field963.field1603);
						var11.field3487.method1133(field1082.field2688);
						var11.field3487.method1105(field1086.field2688);
						var11.field3487.method1126(field1082.field2807);
						var11.field3487.method1126(field1086.field2816);
						var11.field3487.method1148(field1086.field2807);
						var11.field3487.method1148(field1082.field2816);
						field963.method911(var11);
					}
				} else if (this.method419((byte) -32)) {
					this.method420(field936 + field1084, field1008 + field1157);
				} else if (field1047 > 0) {
					method439(field1084 + field936, field1157 + field1008);
				}
				field1082 = null;
			}
		} else {
			if (class52.field237 > 1) {
				if (!field1093 && field1047 > 0) {
					var2 = field1084 + field936;
					var3 = field1157 + field1008;
					class96 var4 = class488.field3917;
					if (var4 != null) {
						method592(var4.field1219, var4.field1222, var4.field1220, var4.field1221, var4.field1218, var4.field1223, var4.field1224, var2, var3);
					}
					class488.field3917 = null;
				}
				field1082 = null;
			}
		}
	}

	@Override
	public UsernameDisplayName method1594() {
		return null != class431.field3378 ? class431.field3378.field822 : null;
	}

	void method434(int var1) {
		if (field1080 >= 216) {
			class457 var3 = class457.method2237(class483.field3886, field963.field1603);
			var3.field3487.method1085(var1);
			field963.method911(var3);
		}
	}

	void method426(int var1) {
		if (field1080 >= 216) {
			class457 var3 = class457.method2237(class483.field3887, field963.field1603);
			var3.field3487.method1085(var1);
			field963.method911(var3);
		}
	}

	static class308 method534() {
		return class26.field125;
	}

	static void method449() {
		class530.field4194 = System.getenv("JX_ACCESS_TOKEN");
		class488.field3918 = System.getenv("JX_REFRESH_TOKEN");
		class81.field802 = System.getenv("JX_SESSION_ID");
		class241.field2051 = System.getenv("JX_CHARACTER_ID");
		class174.method1046(System.getenv("JX_DISPLAY_NAME"));
	}

	public static class479 method551() {
		return field1046;
	}

	static void method589() {
		if (class471.field3719.method1418()) {
			class471.field3719.method1416();
		}
		if (class467.field3701 != null) {
			class467.field3701.field1485 = false;
		}
		class467.field3701 = null;
		field963.method915();
		if (null != class522.field4135) {
			try {
				class522.field4135.method2113();
			} catch (Exception var3) {
			}
		}
		class522.field4135 = null;
		method481();
		class478.field3746.method1777();
		class82.field834.method1777();
		class385.field3082.method1777();
		class502.field4026.method1777();
		class98.field1257.method1777();
		class319.field2504.method1777();
		class162.field1646.method1777();
		class357.field2837.method1777();
		method468();
		class377.field3061.method1916();
		for (int var1 = 0; var1 < 4; ++var1) {
			field973[var1].method2187();
		}
		class26.field125 = null;
		class436.method2172(0, 0);
		class346.method1810();
		field1170 = false;
		class46.method196();
		if (class493.field3983 != null) {
			class493.field3983.method2589();
		}
		class401.field3173.method26();
		class195.method1201();
		if (null != class28.field142) {
			class28.field142.method1807();
		}
		class89.method405();
		class89.field886 = null;
		class89.field887 = null;
		class12.field68 = null;
		class53.method209();
		class294.field2341 = null;
		field1195.clear();
		field1197 = 0;
		class401.field3173 = new class9();
		class28.field142 = new class86(class501.field4023.field945, 216);
		try {
			class89.method403("oldschool", class512.field4086, class532.field4203.field3762, 0, 22);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}
		class294.field2341 = new class27(255, class89.field886, class89.field887, 500000);
		class522.field4135 = new class420();
		class501.field4023.method2535();
		field930 = class4.field15;
		method567(0);
	}

	static void method468() {
		field978 = null;
		class443.field3443 = null;
		class147.field1556 = null;
		class536.field4216 = null;
		class272.field2228 = null;
		class434.field3409 = null;
		class374.field3036 = null;
		class43.field206 = null;
		class541.field4283 = null;
		class204.field1896 = null;
		class243.field2064 = null;
	}

	static void method567(int var0) {
		if (field982 != var0) {
			if (field982 == 30) {
				field1137.method1732();
			}
			if (field982 == 0) {
				class501.field4023.method2555();
			}
			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				method565(0);
				field913 = 0;
				field964 = 0;
				field966.method2052(var0);
				if (var0 != 20) {
					method482(false);
				}
			}
			if (var0 != 20 && var0 != 40 && null != class406.field3181) {
				class406.field3181.method2073();
				class406.field3181 = null;
			}
			if (field982 == 25) {
				field972 = 0;
				field968 = 0;
				field1002 = 1;
				field970 = 0;
				field971 = 1;
			}
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = field982 == 11 ? 4 : 0;
					class174.method1044(class126.field1456, class537.field4228, false, var4);
				} else if (var0 == 11) {
					class174.method1044(class126.field1456, class537.field4228, false, 4);
				} else if (var0 == 50) {
					class174.method1042("", "Updating date of birth...", "");
					class174.method1044(class126.field1456, class537.field4228, false, 7);
				} else if (class261.field2167) {
					class174.field1720 = null;
					class501.field4024 = null;
					class174.field1719 = null;
					class174.field1722 = null;
					class166.field1680 = null;
					class365.field2924 = null;
					class8.field28 = null;
					class174.field1717 = null;
					class202.field1891 = null;
					class380.field3069 = null;
					class439.field3441 = null;
					class101.field1272 = null;
					class281.field2286 = null;
					class29.field143 = null;
					class225.field1989.method1051();
					class436.method2172(0, 100);
					class438.method2189().method21(true);
					class261.field2167 = false;
				}
			} else {
				boolean var2 = class83.field841.method1013() >= field903;
				int var3 = var2 ? 0 : 12;
				class174.method1044(class126.field1456, class537.field4228, true, var3);
			}
			field982 = var0;
		}
	}

	static void method597(class13 var0, String var1) {
		class434 var3 = new class434(var0, var1);
		field1195.add(var3);
		field1197 += var3.field3407;
	}

	static boolean method476() {
		if (null != field1195 && field1196 < field1195.size()) {
			while (field1196 < field1195.size()) {
				class434 var1 = (class434) field1195.get(field1196);
				if (!var1.method2168()) {
					return false;
				}
				++field1196;
			}
			return true;
		} else {
			return true;
		}
	}

	static int method467() {
		if (null != field1195 && field1196 < field1195.size()) {
			int var1 = 0;
			for (int var2 = 0; var2 <= field1196; ++var2) {
				var1 += ((class434) field1195.get(var2)).field3408;
			}
			return var1 * 10000 / field1197;
		} else {
			return 10000;
		}
	}

	static int method523(int var0) {
		return var0 * 3 + 600;
	}

	static void method529() {
		int var30;
		if (field930 == class4.field15) {
			class377.field3061 = new class372(4, 104, 104, class502.field4035);
			for (var30 = 0; var30 < 4; ++var30) {
				field973[var30] = new class438(104, 104);
			}
			class7.field25 = new class84(512, 512);
			class174.field1726 = class55.field333;
			class174.field1725 = 5;
			field930 = class4.field6;
		} else if (class4.field6 == field930) {
			class174.field1726 = class55.field334;
			class174.field1725 = 10;
			field930 = class4.field14;
		} else if (class4.field14 == field930) {
			class389.field3098 = method503(0, false, true, true, false);
			class264.field2173 = method503(1, false, true, true, false);
			class478.field3746 = method503(2, true, false, true, false);
			class46.field231 = method503(3, false, true, true, false);
			class73.field730 = method503(4, false, true, true, false);
			class167.field1681 = method503(5, true, true, true, false);
			class477.field3744 = method503(6, true, true, true, false);
			class374.field3035 = method503(7, false, true, true, false);
			class537.field4228 = method503(8, false, true, true, false);
			class23.field117 = method503(9, false, true, true, false);
			class126.field1456 = method503(10, false, true, true, false);
			class337.field2568 = method503(11, false, true, true, false);
			class516.field4099 = method503(12, false, true, true, false);
			class82.field834 = method503(13, true, false, true, false);
			class385.field3082 = method503(14, false, true, true, false);
			class502.field4026 = method503(15, false, true, true, false);
			class98.field1257 = method503(17, true, true, true, false);
			class319.field2504 = method503(18, false, true, true, false);
			class162.field1646 = method503(19, false, true, true, false);
			class357.field2837 = method503(20, false, true, true, false);
			class454.field3477 = method503(21, false, true, true, true);
			class174.field1726 = class55.field359;
			class174.field1725 = 20;
			field930 = class4.field8;
		} else if (class4.field8 == field930) {
			boolean var50 = false;
			var30 = 0 + class389.field3098.method34() * 4 / 100;
			var30 += class264.field2173.method34() * 4 / 100;
			var30 += class478.field3746.method34() * 2 / 100;
			var30 += class46.field231.method34() * 2 / 100;
			var30 += class73.field730.method34() * 6 / 100;
			var30 += class167.field1681.method34() * 4 / 100;
			var30 += class477.field3744.method34() * 2 / 100;
			var30 += class374.field3035.method34() * 55 / 100;
			var30 += class537.field4228.method34() * 2 / 100;
			var30 += class23.field117.method34() * 2 / 100;
			var30 += class126.field1456.method34() * 2 / 100;
			var30 += class337.field2568.method34() * 2 / 100;
			var30 += class516.field4099.method34() * 2 / 100;
			var30 += class82.field834.method34() * 2 / 100;
			var30 += class385.field3082.method34() * 2 / 100;
			var30 += class502.field4026.method34() * 2 / 100;
			var30 += class162.field1646.method34() / 100;
			var30 += class319.field2504.method34() / 100;
			var30 += class357.field2837.method34() / 100;
			var30 += class454.field3477.method34() / 100;
			var30 += class98.field1257.method43() && class98.field1257.method1767() ? 1 : 0;
			if (var30 != 100) {
				if (var30 != 0) {
					class174.field1726 = class55.field336 + var30 + "%";
				}
				class174.field1725 = 30;
			} else {
				method597(class389.field3098, "Animations");
				method597(class264.field2173, "Skeletons");
				method597(class73.field730, "Sound FX");
				method597(class167.field1681, "Maps");
				method597(class477.field3744, "Music Tracks");
				method597(class374.field3035, "Models");
				method597(class537.field4228, "Sprites");
				method597(class337.field2568, "Music Jingles");
				method597(class385.field3082, "Music Samples");
				method597(class502.field4026, "Music Patches");
				method597(class162.field1646, "World Map");
				method597(class319.field2504, "World Map Geography");
				method597(class357.field2837, "World Map Ground");
				class58.field639 = new class186();
				class58.field639.method1081(class98.field1257);
				class174.field1726 = class55.field337;
				class174.field1725 = 30;
				field930 = class4.field9;
			}
		} else {
			int var3;
			class13 var33;
			class13 var35;
			if (class4.field9 == field930) {
				class537.method2603(22050, !field902, 2);
				ArrayList var48 = new ArrayList(3);
				class493.field3983 = class537.method2602(class522.field4135, 0, 2048);
				class236.field2028 = new class144();
				class144 var32 = new class144();
				var32.method893(class236.field2028);
				for (var3 = 0; var3 < 3; ++var3) {
					class62 var39 = new class62();
					var39.method265(9, 128);
					var32.method893(var39);
					var48.add(var39);
				}
				class493.field3983.method2586(var32);
				var33 = class502.field4026;
				var35 = class385.field3082;
				class13 var41 = class73.field730;
				class388.field3085 = var33;
				class388.field3086 = var35;
				class388.field3089 = var41;
				class388.field3088 = var48;
				class414.field3219 = new class496(22050, class537.field4217);
				class174.field1726 = class55.field338;
				class174.field1725 = 35;
				field930 = class4.field13;
				class457.field3489 = new class507(class537.field4228, class82.field834);
			} else {
				int var2;
				if (field930 == class4.field13) {
					class152[] var47 = new class152[] { class152.field1586, class152.field1580, class152.field1579, class152.field1584, class152.field1582, class152.field1581 };
					var2 = var47.length;
					class507 var34 = class457.field3489;
					class152[] var38 = new class152[] { class152.field1586, class152.field1580, class152.field1579, class152.field1584, class152.field1582, class152.field1581 };
					field967 = var34.method2455(var38);
					if (field967.size() < var2) {
						class174.field1726 = class55.field531 + field967.size() * 100 / var2 + "%";
						class174.field1725 = 40;
					} else {
						class123.field1449 = (class61) field967.get(class152.field1582);
						class281.field2287 = (class61) field967.get(class152.field1581);
						class484.field3894 = (class61) field967.get(class152.field1584);
						class348.field2632 = field1043.method2521();
						class174.field1726 = class55.field340;
						class174.field1725 = 40;
						field930 = class4.field11;
					}
				} else {
					int var4;
					class13 var6;
					class13 var31;
					if (field930 == class4.field11) {
						var31 = class126.field1456;
						var33 = class537.field4228;
						var4 = 0;
						String[] var37 = class174.field1730;
						int var40;
						String var42;
						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var31.method1782(var42, "")) {
								++var4;
							}
						}
						var37 = class174.field1749;
						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var33.method1782(var42, "")) {
								++var4;
							}
						}
						var37 = class174.field1752;
						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var33.method1787(var42) != -1 && var33.method1782(var42, "")) {
								++var4;
							}
						}
						var6 = class537.field4228;
						int var43 = class174.field1730.length + class174.field1749.length;
						String[] var44 = class174.field1752;
						for (int var45 = 0; var45 < var44.length; ++var45) {
							String var49 = var44[var45];
							if (var6.method1787(var49) != -1) {
								++var43;
							}
						}
						if (var4 < var43) {
							class174.field1726 = class55.field341 + var4 * 100 / var43 + "%";
							class174.field1725 = 50;
						} else {
							class174.field1726 = class55.field342;
							class174.field1725 = 50;
							method567(5);
							field930 = class4.field12;
						}
					} else if (class4.field12 == field930) {
						if (!class478.field3746.method1767()) {
							class174.field1726 = class55.field343 + class478.field3746.method45() + "%";
							class174.field1725 = 60;
						} else if (!class454.field3477.method1767()) {
							class174.field1726 = class55.field343 + (80 + class516.field4099.method45() / 6) + "%";
							class174.field1725 = 60;
						} else {
							class541.method2610(class478.field3746);
							class122.method844(class478.field3746);
							class13 var46 = class478.field3746;
							var31 = class374.field3035;
							class170.field1682 = var46;
							class170.field1683 = var31;
							class170.field1685 = class170.field1682.method1788(3);
							var33 = class478.field3746;
							var35 = class374.field3035;
							boolean var36 = field902;
							class362.field2871 = var33;
							class362.field2869 = var35;
							class362.field2917 = var36;
							var6 = class478.field3746;
							class13 var7 = class374.field3035;
							class314.field2434 = var6;
							class314.field2435 = var7;
							class13 var8 = class478.field3746;
							class91.field1204 = var8;
							class13 var9 = class478.field3746;
							class13 var10 = class374.field3035;
							boolean var11 = field925;
							class61 var12 = class123.field1449;
							class111.field1316 = var9;
							class426.field3292 = var10;
							class426.field3293 = var11;
							class121.field1437 = class111.field1316.method1788(10);
							class154.field1597 = var12;
							class67.method310(class478.field3746, class389.field3098, class264.field2173);
							class13 var13 = class478.field3746;
							class13 var14 = class374.field3035;
							class138.field1530 = var13;
							class138.field1517 = var14;
							class431.method2162(class478.field3746);
							class136.method866(class478.field3746);
							class13 var15 = class46.field231;
							class13 var16 = class374.field3035;
							class13 var17 = class537.field4228;
							class13 var18 = class82.field834;
							int var19 = 0;
							if (null != var15) {
								class496.field3988 = var15;
								class211.field1921 = var16;
								class267.field2189 = var17;
								class527.field4176 = var18;
								var19 = class496.field3988.method1774();
							}
							class457.field3488 = new class354[var19][];
							class350.field2638 = new boolean[var19];
							class207.method1258(class478.field3746);
							class13 var51 = class478.field3746;
							class159.field1629 = var51;
							class13 var20 = class478.field3746;
							class29.field147 = var20;
							class13 var21 = class478.field3746;
							class408.method2080(class478.field3746);
							class148.method898(class478.field3746);
							class289.method1571(class478.field3746);
							class211.field1920 = new class335(class359.field2855, 54, class162.field1645, class478.field3746);
							class180.field1776 = new class335(class359.field2855, 47, class162.field1645, class478.field3746);
							class471.field3719 = new class241();
							class13 var22 = class478.field3746;
							class13 var23 = class537.field4228;
							class13 var24 = class82.field834;
							class110.field1311 = var22;
							class110.field1294 = var23;
							class110.field1296 = var24;
							class199.method1209(class478.field3746, class537.field4228);
							class13 var25 = class478.field3746;
							class13 var26 = class537.field4228;
							class319.field2493 = var26;
							if (var25.method1767()) {
								class319.field2482 = var25.method1788(35);
								class319.field2481 = new class319[class319.field2482];
								for (int var27 = 0; var27 < class319.field2482; ++var27) {
									byte[] var28 = var25.method1762(35, var27);
									class319.field2481[var27] = new class319(var27);
									if (var28 != null) {
										class319.field2481[var27].method1699(new class187(var28));
										class319.field2481[var27].method1701();
									}
								}
							}
							class174.field1726 = class55.field536;
							class174.field1725 = 60;
							field930 = class4.field5;
						}
					} else if (field930 == class4.field5) {
						var30 = 0;
						if (field978 == null) {
							field978 = class502.method2418(class537.field4228, class58.field639.field1829, 0);
						} else {
							++var30;
						}
						if (class443.field3443 == null) {
							class443.field3443 = class502.method2418(class537.field4228, class58.field639.field1819, 0);
						} else {
							++var30;
						}
						if (null == class147.field1556) {
							class147.field1556 = class494.method2359(class537.field4228, class58.field639.field1822, 0);
						} else {
							++var30;
						}
						if (class536.field4216 == null) {
							class536.field4216 = class494.method2370(class537.field4228, class58.field639.field1821, 0);
						} else {
							++var30;
						}
						if (null == class272.field2228) {
							class272.field2228 = class494.method2370(class537.field4228, class58.field639.field1827, 0);
						} else {
							++var30;
						}
						if (class434.field3409 == null) {
							class434.field3409 = class494.method2370(class537.field4228, class58.field639.field1818, 0);
						} else {
							++var30;
						}
						if (class374.field3036 == null) {
							class374.field3036 = class494.method2370(class537.field4228, class58.field639.field1824, 0);
						} else {
							++var30;
						}
						if (null == class43.field206) {
							class43.field206 = class494.method2370(class537.field4228, class58.field639.field1825, 0);
						} else {
							++var30;
						}
						if (null == class541.field4283) {
							class541.field4283 = class494.method2370(class537.field4228, class58.field639.field1826, 0);
						} else {
							++var30;
						}
						if (class204.field1896 == null) {
							class204.field1896 = class494.method2359(class537.field4228, class58.field639.field1823, 0);
						} else {
							++var30;
						}
						if (null == class243.field2064) {
							class243.field2064 = class494.method2359(class537.field4228, class58.field639.field1828, 0);
						} else {
							++var30;
						}
						if (var30 < 11) {
							class174.field1726 = class55.field345 + var30 * 100 / 12 + "%";
							class174.field1725 = 70;
						} else {
							class500.field4001 = class243.field2064;
							class443.field3443.method355();
							var2 = (int) (Math.random() * 21.0D) - 10;
							var3 = (int) (Math.random() * 21.0D) - 10;
							var4 = (int) (Math.random() * 21.0D) - 10;
							int var5 = (int) (Math.random() * 41.0D) - 20;
							class147.field1556[0].method1288(var5 + var2, var3 + var5, var5 + var4);
							class174.field1726 = class55.field346;
							class174.field1725 = 70;
							field930 = class4.field19;
						}
					} else if (field930 == class4.field19) {
						if (!class23.field117.method1767()) {
							class174.field1726 = class55.field347 + "0%";
							class174.field1725 = 90;
						} else {
							class283.field2295 = new class21(class23.field117, class537.field4228, 20, class83.field841.method1022(), field902 ? 64 : 128);
							class238.method1386(class283.field2295);
							class238.method1387(class83.field841.method1022());
							field930 = class4.field20;
						}
					} else if (class4.field20 == field930) {
						var30 = class283.field2295.method65();
						if (var30 < 100) {
							class174.field1726 = class55.field347 + var30 + "%";
							class174.field1725 = 90;
						} else {
							class174.field1726 = class55.field625;
							class174.field1725 = 90;
							field930 = class4.field17;
						}
					} else if (field930 == class4.field17) {
						class467.field3701 = new class135();
						class522.field4135.method2111(class467.field3701, 10);
						class174.field1726 = class55.field453;
						class174.field1725 = 92;
						field930 = class4.field16;
					} else if (class4.field16 == field930) {
						if (!class126.field1456.method1782("huffman", "")) {
							class174.field1726 = class55.field372 + 0 + "%";
							class174.field1725 = 94;
						} else {
							class258 var29 = new class258(class126.field1456.method1781("huffman", ""));
							class291.method1574(var29);
							class174.field1726 = class55.field351;
							class174.field1725 = 94;
							field930 = class4.field10;
						}
					} else if (class4.field10 == field930) {
						if (!class46.field231.method1767()) {
							class174.field1726 = class55.field352 + class46.field231.method45() * 4 / 5 + "%";
							class174.field1725 = 96;
						} else if (!class516.field4099.method1767()) {
							class174.field1726 = class55.field352 + (80 + class516.field4099.method45() / 6) + "%";
							class174.field1725 = 96;
						} else if (!class82.field834.method1767()) {
							class174.field1726 = class55.field352 + (96 + class82.field834.method45() / 50) + "%";
							class174.field1725 = 96;
						} else {
							class174.field1726 = class55.field353;
							class174.field1725 = 98;
							if (class516.field4099.method1784("version.dat", "")) {
								class187 var1 = new class187(class516.field4099.method1781("version.dat", ""));
								var1.method1145();
							}
							field930 = class4.field18;
						}
					} else if (field930 == class4.field18) {
						class174.field1725 = 100;
						if (class162.field1646.method1774() > 0 && !class162.field1646.method1783(class68.field722.field721)) {
							class174.field1726 = class55.field354 + class162.field1646.method1789(class68.field722.field721) / 10 + "%";
						} else {
							if (null == class26.field125) {
								class26.field125 = new class308();
								class26.field125.method1611(class162.field1646, class319.field2504, class357.field2837, class484.field3894, field967, class147.field1556);
							}
							class174.field1726 = class55.field454;
							field930 = class4.field7;
						}
					} else {
						if (class4.field7 == field930) {
							method567(10);
						}
					}
				}
			}
		}
	}

	static class13 method503(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class27 var6 = null;
		if (null != class89.field886) {
			var6 = new class27(var0, class89.field886, class12.field68[var0], 1000000);
		}
		return new class13(var6, class294.field2341, class401.field3173, var0, var1, var2, true, var4);
	}

	static void method489() {
		field963.method916();
		field963.field1604.field1832 = 0;
		field963.field1600 = null;
		field963.field1605 = null;
		field963.field1611 = null;
		field963.field1612 = null;
		field963.field1606 = 0;
		field963.field1610 = 0;
		field918 = 0;
		method545();
		field1151 = 0;
		field1149 = 0;
		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			field1071[var1] = null;
		}
		class431.field3378 = null;
		for (var1 = 0; var1 < field958.length; ++var1) {
			class373 var2 = field958[var1];
			if (var2 != null) {
				var2.field277 = -1;
				var2.field247 = false;
			}
		}
		class53.method215();
		method567(30);
		for (var1 = 0; var1 < 100; ++var1) {
			field908[var1] = true;
		}
		method469();
	}

	static final void method599() {
		field963.method915();
		method481();
		class377.field3061.method1916();
		for (int var1 = 0; var1 < 4; ++var1) {
			field973[var1].method2187();
		}
		field1137.method1732();
		System.gc();
		class436.method2172(0, 0);
		class346.method1810();
		field1170 = false;
		class46.method196();
		method567(10);
	}

	static long method494() {
		return field1028;
	}

	static final void method481() {
		class541.method2609();
		class122.field1440.method645();
		class170.method988();
		class394.method2035();
		class314.field2436.method645();
		class314.field2442.method645();
		class426.field3294.method645();
		class426.field3339.method645();
		class426.field3296.method645();
		class67.field704.method645();
		class67.field695.method645();
		class67.field703.method645();
		class138.field1518.method645();
		class138.field1519.method645();
		class431.field3372.method645();
		class136.field1489.method645();
		class211.field1920.method1754();
		class180.field1776.method1754();
		class110.method668();
		class199.field1870.method645();
		class199.field1871.method645();
		class91.field1205.method645();
		class408.method2079();
		class319.field2483.method645();
		class251.method1442();
		class289.method1569();
		field1094.method645();
		field984.method645();
		class506.field4066.method645();
		class354.method1863();
		((class21) class238.field2039.field2270).method71();
		class436.field3421.method645();
		field1189.method1075();
		class389.field3098.method1777();
		class264.field2173.method1777();
		class46.field231.method1777();
		class73.field730.method1777();
		class167.field1681.method1777();
		class477.field3744.method1777();
		class374.field3035.method1777();
		class537.field4228.method1777();
		class23.field117.method1777();
		class126.field1456.method1777();
		class337.field2568.method1777();
		class516.field4099.method1777();
		class454.field3477.method1777();
	}

	static final void method533() {
		if (field951 > 0) {
			method599();
		} else {
			field966.method2056();
			method567(40);
			class406.field3181 = field963.method914();
			field963.method913();
		}
	}

	static final void method482(boolean var0) {
		if (var0) {
			field1148 = class174.field1739 ? class225.field1987 : class225.field1986;
		} else {
			field1148 = class83.field841.method1017(class174.field1742) ? class225.field1990 : class225.field1993;
		}
	}

	static final void method561() {
		if (class493.field3983 != null) {
			class493.field3983.method2598();
		}
	}

	static void method513(class67 var0, int var1, int var2, int var3) {
		if (field1153 < 50 && class83.field841.method1027() != 0) {
			if (null != var0.field696 && var1 < var0.field696.length) {
				method453(var0.field696[var1], var2, var3);
			}
		}
	}

	static void method521(class67 var0, int var1, int var2, int var3) {
		if (field1153 < 50 && class83.field841.method1027() != 0) {
			if (null != var0.field710 && var0.field710.containsKey(var1)) {
				method453((Integer) var0.field710.get(var1), var2, var3);
			}
		}
	}

	static void method453(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var4 = var0 >> 8;
			int var5 = var0 >> 4 & 7;
			int var6 = var0 & 15;
			field1154[field1153] = var4;
			field1155[field1153] = var5;
			field1110[field1153] = 0;
			field942[field1153] = null;
			int var7 = (var1 - 64) / 128;
			int var8 = (var2 - 64) / 128;
			field905[field1153] = (var7 << 16) + (var8 << 8) + var6;
			++field1153;
		}
	}

	static void method454(int var0, int var1, int var2) {
		if (class83.field841.method1009() != 0 && var1 != 0 && field1153 < 50) {
			field1154[field1153] = var0;
			field1155[field1153] = var1;
			field1110[field1153] = var2;
			field942[field1153] = null;
			field905[field1153] = 0;
			++field1153;
		}
	}

	static void method557(int var0) {
		if (var0 == -1 && !field1170) {
			class436.method2172(0, 0);
		} else if (var0 != -1 && !class388.method2017(var0) && class83.field841.method1001() != 0) {
			ArrayList var2 = new ArrayList();
			var2.add(new class490(class477.field3744, var0, 0, class83.field841.method1001(), false));
			if (field1170) {
				class388.field3091.clear();
				class388.field3091.addAll(var2);
				class388.method2021(0, 100, 100, 0);
			} else {
				class388.method2015(var2, 0, 100, 100, 0, false);
			}
		}
	}

	static void method470(int var0, int var1) {
		if (class83.field841.method1001() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new class490(class337.field2568, var0, 0, class83.field841.method1001(), false));
			class388.method2015(var3, 0, 0, 0, 0, true);
			field1170 = true;
		}
	}

	static final void method584() {
		if (class130.field1474) {
			for (int var1 = 0; var1 < class274.field2240; ++var1) {
				class82 var2 = field1071[class274.field2241[var1]];
				var2.method343();
			}
			class130.field1474 = false;
		}
	}

	static final void method516() {
		if (field1144 != class121.field1436) {
			field1144 = class121.field1436;
			method443(class121.field1436);
		}
	}

	static final void method576(class354 var0, int var1, int var2) {
		if (field1151 == 0 || field1151 == 3) {
			if (!field1011 && (class422.field3264 == 1 || !class349.field2637 && class422.field3264 == 4)) {
				class427 var4 = var0.method1827(true);
				if (var4 == null) {
					return;
				}
				int var5 = class422.field3265 - var1;
				int var6 = class422.field3266 - var2;
				if (var4.method2156(var5, var6)) {
					var5 -= var4.field3348 / 2;
					var6 -= var4.field3347 / 2;
					int var7 = field1076 & 2047;
					int var8 = class238.field2037[var7];
					int var9 = class238.field2035[var7];
					int var10 = var9 * var5 + var8 * var6 >> 11;
					int var11 = var9 * var6 - var8 * var5 >> 11;
					int var12 = class431.field3378.field272 + var10 >> 7;
					int var13 = class431.field3378.field243 - var11 >> 7;
					class457 var14 = class457.method2237(class483.field3831, field963.field1603);
					var14.field3487.method1085(18);
					var14.field3487.method1121(class346.field2624 + var12);
					var14.field3487.method1148(var13 + class211.field1922);
					var14.field3487.method1132(field1046.method2323(82) ? (field1046.method2323(81) ? 2 : 1) : 0);
					var14.field3487.method1085(var5);
					var14.field3487.method1085(var6);
					var14.field3487.method1126(field1076);
					var14.field3487.method1085(57);
					var14.field3487.method1085(0);
					var14.field3487.method1085(0);
					var14.field3487.method1085(89);
					var14.field3487.method1126(class431.field3378.field272);
					var14.field3487.method1126(class431.field3378.field243);
					var14.field3487.method1085(63);
					field963.method911(var14);
					field1149 = var12;
					field1072 = var13;
				}
			}
		}
	}

	static final void method541() {
		int[] var1 = class274.field2241;
		int var2;
		for (var2 = 0; var2 < class274.field2240; ++var2) {
			class82 var3 = field1071[var1[var2]];
			if (var3 != null && var3.field266 > 0) {
				--var3.field266;
				if (var3.field266 == 0) {
					var3.field313 = null;
				}
			}
		}
		for (var2 = 0; var2 < field959; ++var2) {
			int var5 = field897[var2];
			class373 var4 = field958[var5];
			if (var4 != null && var4.field266 > 0) {
				--var4.field266;
				if (var4.field266 == 0) {
					var4.field313 = null;
				}
			}
		}
	}

	static final int method485(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	static final int method444(int var0) {
		return Math.abs(var0 - class511.field4085) > 1024 ? var0 + 2048 * (var0 < class511.field4085 ? 1 : -1) : var0;
	}

	static final void method497(int var0, int var1, int var2) {
		if (class314.field2470 < var0) {
			class314.field2470 += class120.field1433 + class422.field3268 * (var0 - class314.field2470) / 1000;
			if (class314.field2470 > var0) {
				class314.field2470 = var0;
			}
		}
		if (class314.field2470 > var0) {
			class314.field2470 -= class120.field1433 + class422.field3268 * (class314.field2470 - var0) / 1000;
			if (class314.field2470 < var0) {
				class314.field2470 = var0;
			}
		}
		if (class93.field1211 < var1) {
			class93.field1211 += class120.field1433 + (var1 - class93.field1211) * class422.field3268 / 1000;
			if (class93.field1211 > var1) {
				class93.field1211 = var1;
			}
		}
		if (class93.field1211 > var1) {
			class93.field1211 -= (class93.field1211 - var1) * class422.field3268 / 1000 + class120.field1433;
			if (class93.field1211 < var1) {
				class93.field1211 = var1;
			}
		}
		if (class225.field1995 < var2) {
			class225.field1995 += class120.field1433 + (var2 - class225.field1995) * class422.field3268 / 1000;
			if (class225.field1995 > var2) {
				class225.field1995 = var2;
			}
		}
		if (class225.field1995 > var2) {
			class225.field1995 -= (class225.field1995 - var2) * class422.field3268 / 1000 + class120.field1433;
			if (class225.field1995 < var2) {
				class225.field1995 = var2;
			}
		}
	}

	static final void method506() {
		int var1;
		int var2;
		int var3;
		if (!field1160) {
			var1 = 64 + class274.field2236 * 128;
			var2 = class474.field3728 * 128 + 64;
			var3 = method450(var1, var2, class121.field1436) - class136.field1492;
			method497(var1, var3, var2);
		} else if (null != field1163) {
			class314.field2470 = field1163.method653();
			class225.field1995 = field1163.method654();
			if (field1162) {
				class93.field1211 = field1163.method655();
			} else {
				class93.field1211 = method450(class314.field2470, class225.field1995, class121.field1436) - field1163.method655();
			}
			field1163.method31();
		}
		if (!field1161) {
			var1 = 64 + class39.field187 * 128;
			var2 = class431.field3375 * 128 + 64;
			var3 = method450(var1, var2, class121.field1436) - class360.field2865;
			int var4 = var1 - class314.field2470;
			int var5 = var3 - class93.field1211;
			int var6 = var2 - class225.field1995;
			int var7 = (int) Math.sqrt((double) (var6 * var6 + var4 * var4));
			int var8 = (int) (Math.atan2((double) var5, (double) var7) * 325.9490051269531D) & 2047;
			int var9 = (int) (Math.atan2((double) var4, (double) var6) * -325.9490051269531D) & 2047;
			class25.method74(var8, var9);
		} else {
			if (field980 != null) {
				class283.field2296 = field980.method1818();
				class283.field2296 = Math.min(Math.max(class283.field2296, 128), 383);
				field980.method31();
			}
			if (field954 != null) {
				class511.field4085 = field954.method1818() & 2047;
				field954.method31();
			}
		}
	}

	static final void method590() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (field991 == 0) {
			var1 = class431.field3378.field272;
			var2 = class431.field3378.field243;
			if (class280.field2284 - var1 < -500 || class280.field2284 - var1 > 500 || class121.field1438 - var2 < -500 || class121.field1438 - var2 > 500) {
				class280.field2284 = var1;
				class121.field1438 = var2;
			}
			if (class280.field2284 != var1) {
				class280.field2284 += (var1 - class280.field2284) / 16;
			}
			if (class121.field1438 != var2) {
				class121.field1438 += (var2 - class121.field1438) / 16;
			}
			var3 = class280.field2284 >> 7;
			var4 = class121.field1438 >> 7;
			var5 = method450(class280.field2284, class121.field1438, class121.field1436);
			var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = class121.field1436;
						if (var9 < 3 && (class502.field4037[1][var7][var8] & 2) == 2) {
							++var9;
						}
						int var10 = var5 - class502.field4035[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}
			var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}
			if (var7 < 32768) {
				var7 = 32768;
			}
			if (var7 > field1040) {
				field1040 += (var7 - field1040) / 24;
			} else if (var7 < field1040) {
				field1040 += (var7 - field1040) / 80;
			}
			class528.field4179 = method450(class431.field3378.field272, class431.field3378.field243, class121.field1436) - field992;
		} else if (field991 == 1) {
			method457();
			short var11 = -1;
			if (field1046.method2323(33)) {
				var11 = 0;
			} else if (field1046.method2323(49)) {
				var11 = 1024;
			}
			if (field1046.method2323(48)) {
				if (var11 == 0) {
					var11 = 1792;
				} else if (var11 == 1024) {
					var11 = 1280;
				} else {
					var11 = 1536;
				}
			} else if (field1046.method2323(50)) {
				if (var11 == 0) {
					var11 = 256;
				} else if (var11 == 1024) {
					var11 = 768;
				} else {
					var11 = 512;
				}
			}
			byte var12 = 0;
			if (field1046.method2323(35)) {
				var12 = -1;
			} else if (field1046.method2323(51)) {
				var12 = 1;
			}
			var3 = 0;
			if (var11 >= 0 || var12 != 0) {
				var3 = field1046.method2323(81) ? field997 : field996;
				var3 *= 16;
				field994 = var11;
				field995 = var12;
			}
			if (field993 < var3) {
				field993 += var3 / 8;
				if (field993 > var3) {
					field993 = var3;
				}
			} else if (field993 > var3) {
				field993 = field993 * 9 / 10;
			}
			if (field993 > 0) {
				var4 = field993 / 16;
				if (field994 >= 0) {
					var1 = field994 - class511.field4085 & 2047;
					var5 = class238.field2037[var1];
					var6 = class238.field2035[var1];
					class280.field2284 += var5 * var4 / 65536;
					class121.field1438 += var6 * var4 / 65536;
				}
				if (field995 != 0) {
					class528.field4179 += field995 * var4;
					if (class528.field4179 > 0) {
						class528.field4179 = 0;
					}
				}
			} else {
				field994 = -1;
				field995 = -1;
			}
			if (field1046.method2323(13)) {
				method462();
			}
		}
		if (class422.field3260 == 4 && class349.field2637) {
			var1 = class422.field3253 - field1054;
			field988 = var1 * 2;
			field1054 = var1 != -1 && var1 != 1 ? (field1054 + class422.field3253) / 2 : class422.field3253;
			var2 = field910 - class422.field3270;
			field987 = var2 * 2;
			field910 = var2 != -1 && var2 != 1 ? (class422.field3270 + field910) / 2 : class422.field3270;
		} else {
			if (field1046.method2323(96)) {
				field987 += (-24 - field987) / 2;
			} else if (field1046.method2323(97)) {
				field987 += (24 - field987) / 2;
			} else {
				field987 /= 2;
			}
			if (field1046.method2323(98)) {
				field988 += (12 - field988) / 2;
			} else if (field1046.method2323(99)) {
				field988 += (-12 - field988) / 2;
			} else {
				field988 /= 2;
			}
			field1054 = class422.field3253;
			field910 = class422.field3270;
		}
		field1076 = field987 / 2 + field1076 & 2047;
		field937 += field988 / 2;
		if (field937 < 128) {
			field937 = 128;
		}
		if (field937 > 383) {
			field937 = 383;
		}
	}

	static final void method562(class54 var0, int var1) {
		if (var0.field298 >= field1201) {
			method568(var0);
		} else {
			int var5;
			int var6;
			int var8;
			int var9;
			int var13;
			if (var0.field299 >= field1201) {
				boolean var3 = field1201 == var0.field299 || var0.field287 == -1 || var0.field304 != 0;
				if (!var3) {
					class67 var4 = class67.method308(var0.field287);
					if (var4 != null && !var4.method307()) {
						var3 = var0.field289 + 1 > var4.field712[var0.field288];
					} else {
						var3 = true;
					}
				}
				if (var3) {
					var13 = var0.field299 - var0.field298;
					var5 = field1201 - var0.field298;
					var6 = var0.field246 * 64 + var0.field294 * 128;
					int var7 = var0.field246 * 64 + var0.field296 * 128;
					var8 = var0.field292 * 128 + var0.field246 * 64;
					var9 = var0.field246 * 64 + var0.field262 * 128;
					var0.field272 = ((var13 - var5) * var6 + var5 * var8) / var13;
					var0.field243 = (var5 * var9 + var7 * (var13 - var5)) / var13;
				}
				var0.field316 = 0;
				var0.field283 = var0.field300;
				var0.field244 = var0.field283;
			} else {
				var0.field255 = var0.field248;
				if (var0.field290 == 0) {
					var0.field316 = 0;
				} else {
					label297: {
						if (var0.field287 != -1 && var0.field304 == 0) {
							class67 var12 = class67.method308(var0.field287);
							if (var0.field306 > 0 && var12.field714 == 0) {
								++var0.field316;
								break label297;
							}
							if (var0.field306 <= 0 && var12.field715 == 0) {
								++var0.field316;
								break label297;
							}
						}
						int var14 = var0.field272;
						var13 = var0.field243;
						var5 = 128 * var0.field317[var0.field290 - 1] + var0.field246 * 64;
						var6 = var0.field246 * 64 + 128 * var0.field314[var0.field290 - 1];
						if (var14 < var5) {
							if (var13 < var6) {
								var0.field283 = 1280;
							} else if (var13 > var6) {
								var0.field283 = 1792;
							} else {
								var0.field283 = 1536;
							}
						} else if (var14 > var5) {
							if (var13 < var6) {
								var0.field283 = 768;
							} else if (var13 > var6) {
								var0.field283 = 256;
							} else {
								var0.field283 = 512;
							}
						} else if (var13 < var6) {
							var0.field283 = 1024;
						} else if (var13 > var6) {
							var0.field283 = 0;
						}
						class343 var15 = var0.field315[var0.field290 - 1];
						if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
							var8 = var0.field283 - var0.field244 & 2047;
							if (var8 > 1024) {
								var8 -= 2048;
							}
							var9 = var0.field252;
							if (var8 >= -256 && var8 <= 256) {
								var9 = var0.field251;
							} else if (var8 >= 256 && var8 < 768) {
								var9 = var0.field301;
							} else if (var8 >= -768 && var8 <= -256) {
								var9 = var0.field253;
							}
							if (var9 == -1) {
								var9 = var0.field251;
							}
							var0.field255 = var9;
							int var10 = 4;
							boolean var11 = true;
							if (var0 instanceof class373) {
								var11 = ((class373) var0).field3019.field2433;
							}
							if (var11) {
								if (var0.field283 != var0.field244 && var0.field277 == -1 && var0.field311 != 0) {
									var10 = 2;
								}
								if (var0.field290 > 2) {
									var10 = 6;
								}
								if (var0.field290 > 3) {
									var10 = 8;
								}
								if (var0.field316 > 0 && var0.field290 > 1) {
									var10 = 8;
									--var0.field316;
								}
							} else {
								if (var0.field290 > 1) {
									var10 = 6;
								}
								if (var0.field290 > 2) {
									var10 = 8;
								}
								if (var0.field316 > 0 && var0.field290 > 1) {
									var10 = 8;
									--var0.field316;
								}
							}
							if (var15 == class343.field2604) {
								var10 <<= 1;
							} else if (var15 == class343.field2603) {
								var10 >>= 1;
							}
							if (var10 >= 8) {
								if (var0.field255 == var0.field251 && var0.field312 != -1) {
									var0.field255 = var0.field312;
								} else if (var0.field252 == var0.field255 && var0.field256 != -1) {
									var0.field255 = var0.field256;
								} else if (var0.field255 == var0.field253 && var0.field297 != -1) {
									var0.field255 = var0.field297;
								} else if (var0.field301 == var0.field255 && var0.field258 != -1) {
									var0.field255 = var0.field258;
								}
							} else if (var10 <= 2) {
								if (var0.field255 == var0.field251 && var0.field259 != -1) {
									var0.field255 = var0.field259;
								} else if (var0.field255 == var0.field252 && var0.field260 != -1) {
									var0.field255 = var0.field260;
								} else if (var0.field253 == var0.field255 && var0.field261 != -1) {
									var0.field255 = var0.field261;
								} else if (var0.field301 == var0.field255 && var0.field291 != -1) {
									var0.field255 = var0.field291;
								}
							}
							if (var5 != var14 || var6 != var13) {
								if (var14 < var5) {
									var0.field272 += var10;
									if (var0.field272 > var5) {
										var0.field272 = var5;
									}
								} else if (var14 > var5) {
									var0.field272 -= var10;
									if (var0.field272 < var5) {
										var0.field272 = var5;
									}
								}
								if (var13 < var6) {
									var0.field243 += var10;
									if (var0.field243 > var6) {
										var0.field243 = var6;
									}
								} else if (var13 > var6) {
									var0.field243 -= var10;
									if (var0.field243 < var6) {
										var0.field243 = var6;
									}
								}
							}
							if (var5 == var0.field272 && var0.field243 == var6) {
								--var0.field290;
								if (var0.field306 > 0) {
									--var0.field306;
								}
							}
						} else {
							var0.field272 = var5;
							var0.field243 = var6;
							--var0.field290;
							if (var0.field306 > 0) {
								--var0.field306;
							}
						}
					}
				}
			}
		}
		if (var0.field272 < 128 || var0.field243 < 128 || var0.field272 >= 13184 || var0.field243 >= 13184) {
			var0.field287 = -1;
			var0.field298 = 0;
			var0.field299 = 0;
			var0.method225();
			var0.field272 = 128 * var0.field317[0] + var0.field246 * 64;
			var0.field243 = var0.field314[0] * 128 + var0.field246 * 64;
			var0.method218();
		}
		if (var0 == class431.field3378 && (var0.field272 < 1536 || var0.field243 < 1536 || var0.field272 >= 11776 || var0.field243 >= 11776)) {
			var0.field287 = -1;
			var0.field298 = 0;
			var0.field299 = 0;
			var0.method225();
			var0.field272 = 128 * var0.field317[0] + var0.field246 * 64;
			var0.field243 = var0.field314[0] * 128 + var0.field246 * 64;
			var0.method218();
		}
		class162.method960(var0);
		class249.method1437(var0);
	}

	static final void method568(class54 var0) {
		int var2 = Math.max(1, var0.field298 - field1201);
		int var3 = var0.field294 * 128 + var0.field246 * 64;
		int var4 = var0.field246 * 64 + var0.field296 * 128;
		var0.field272 += (var3 - var0.field272) / var2;
		var0.field243 += (var4 - var0.field243) / var2;
		var0.field316 = 0;
		var0.field283 = var0.field300;
	}

	static void method556() {
		if (null != class26.field125) {
			class26.field125.method1617(class121.field1436, class346.field2624 + (class431.field3378.field272 >> 7), class211.field1922 + (class431.field3378.field243 >> 7), false);
			class26.field125.method1633();
		}
	}

	static void method601(class82 var0, int var1, int var2) {
		if (var1 == var0.field287 && var1 != -1) {
			int var4 = class67.method308(var1).field716;
			if (var4 == 1) {
				var0.field288 = 0;
				var0.field289 = 0;
				var0.field304 = var2;
				var0.field269 = 0;
			}
			if (var4 == 2) {
				var0.field269 = 0;
			}
		} else if (var1 == -1 || var0.field287 == -1 || class67.method308(var1).field709 >= class67.method308(var0.field287).field709) {
			var0.field287 = var1;
			var0.field288 = 0;
			var0.field289 = 0;
			var0.field304 = var2;
			var0.field269 = 0;
			var0.field306 = var0.field290;
		}
	}

	static int method531() {
		return field1129 ? 2 : 1;
	}

	static void method469() {
		class457 var1 = class457.method2237(class483.field3880, field963.field1603);
		var1.field3487.method1085(method531());
		var1.field3487.method1126(class86.field856);
		var1.field3487.method1126(class271.field2226);
		field963.method911(var1);
	}

	static final void method588(String var0, boolean var1) {
		if (field1024) {
			boolean var3 = true;
			boolean var4 = true;
			boolean var5 = true;
			int var6 = class281.field2287.method2409(var0, 250);
			int var7 = class281.field2287.method2388(var0, 250) * 13;
			class206.method1236(6, 6, var6 + 4 + 4, var7 + 4 + 4, 0);
			class206.method1239(6, 6, 4 + 4 + var6, 4 + var7 + 4, 16777215);
			class281.field2287.method2385(var0, 10, 10, var6, var7, 16777215, -1, 1, 1, 0);
			boolean var8 = true;
			boolean var9 = true;
			int var10 = 4 + var6 + 4;
			int var11 = 4 + var7 + 4;
			for (int var12 = 0; var12 < field1069; ++var12) {
				if (field1123[var12] + field1125[var12] > 6 && field1123[var12] < var10 + 6 && field1124[var12] + field1126[var12] > 6 && field1124[var12] < var11 + 6) {
					field908[var12] = true;
				}
			}
			if (var1) {
				class389.field3103.method1756(0, 0);
			} else {
				method442(10, 10, var6, var7);
			}
		}
	}

	static final void method507(int var0, int var1, int var2, int var3) {
		++field1068;
		if (field1149 == class431.field3378.field272 >> 7 && field1072 == class431.field3378.field243 >> 7) {
			field1149 = 0;
		}
		method538();
		method480();
		method547(true);
		method511();
		method547(false);
		int var7;
		for (class489 var5 = (class489) field1025.method2218(); null != var5; var5 = (class489) field1025.method2220()) {
			if (var5.field3921 == class121.field1436 && field1201 <= var5.field3930) {
				if (field1201 >= var5.field3945) {
					class373 var6;
					class82 var38;
					if (!var5.field3922 && var5.field3936 != 0) {
						if (var5.field3936 > 0) {
							var6 = field958[var5.field3936 - 1];
							if (null != var6 && var6.field272 >= 0 && var6.field272 < 13312 && var6.field243 >= 0 && var6.field243 < 13312) {
								var5.field3931 = var6.field272;
								var5.field3920 = var6.field243;
								var5.method2352(var5.field3926, var5.field3927, var5.field3928, field1201);
							}
						} else {
							var7 = -var5.field3936 - 1;
							if (field1026 == var7) {
								var38 = class431.field3378;
							} else {
								var38 = field1071[var7];
							}
							if (var38 != null && var38.field272 >= 0 && var38.field272 < 13312 && var38.field243 >= 0 && var38.field243 < 13312) {
								var5.field3931 = var38.field272;
								var5.field3920 = var38.field243;
								var5.method2352(var5.field3926, var5.field3927, var5.field3928, field1201);
							}
						}
					}
					if (var5.field3934 > 0) {
						var6 = field958[var5.field3934 - 1];
						if (var6 != null && var6.field272 >= 0 && var6.field272 < 13312 && var6.field243 >= 0 && var6.field243 < 13312) {
							var5.method2352(var6.field272, var6.field243, method450(var6.field272, var6.field243, var5.field3921) - var5.field3925, field1201);
						}
					}
					if (var5.field3934 < 0) {
						var7 = -var5.field3934 - 1;
						if (var7 == field1026) {
							var38 = class431.field3378;
						} else {
							var38 = field1071[var7];
						}
						if (null != var38 && var38.field272 >= 0 && var38.field272 < 13312 && var38.field243 >= 0 && var38.field243 < 13312) {
							var5.method2352(var38.field272, var38.field243, method450(var38.field272, var38.field243, var5.field3921) - var5.field3925, field1201);
						}
					}
					var5.method2353(field977);
					class377.field3061.method1924(class121.field1436, (int) var5.field3944, (int) var5.field3937, (int) var5.field3938, 60, var5, var5.field3924, -1L, false);
				}
			} else {
				var5.method318();
			}
		}
		class443.method2196();
		class204.method1220(var0, var1, var2, var3, true);
		var0 = field1179;
		var1 = field1180;
		var2 = field1114;
		var3 = field989;
		class206.method1243(var0, var1, var2 + var0, var1 + var3);
		class238.method1397();
		class206.method1245();
		int var37 = field937;
		if (field1040 / 256 > var37) {
			var37 = field1040 / 256;
		}
		if (field1166[4] && field1120[4] + 128 > var37) {
			var37 = field1120[4] + 128;
		}
		int var39 = field1076 & 2047;
		var7 = class280.field2284;
		int var8 = class528.field4179;
		int var9 = class121.field1438;
		int var10 = method523(var37);
		int var12 = var3 - 334;
		if (var12 < 0) {
			var12 = 0;
		} else if (var12 > 100) {
			var12 = 100;
		}
		int var13 = field1173 + (field1174 - field1173) * var12 / 100;
		int var11 = var13 * var10 / 256;
		var12 = 2048 - var37 & 2047;
		var13 = 2048 - var39 & 2047;
		int var14 = 0;
		int var15 = 0;
		int var16 = var11;
		int var17;
		int var18;
		int var19;
		if (var12 != 0) {
			var17 = class238.field2037[var12];
			var18 = class238.field2035[var12];
			var19 = var18 * 0 - var17 * var11 >> 16;
			var16 = var18 * var11 + var17 * 0 >> 16;
			var15 = var19;
		}
		if (var13 != 0) {
			var17 = class238.field2037[var13];
			var18 = class238.field2035[var13];
			var19 = var17 * var16 + 0 * var18 >> 16;
			var16 = var18 * var16 - 0 * var17 >> 16;
			var14 = var19;
		}
		if (field1159) {
			class152.field1585 = var7 - var14;
			class471.field3713 = var8 - var15;
			class41.field203 = var9 - var16;
			class262.field2168 = var37;
			class92.field1210 = var39;
		} else {
			class314.field2470 = var7 - var14;
			class93.field1211 = var8 - var15;
			class225.field1995 = var9 - var16;
			class283.field2296 = var37;
			class511.field4085 = var39;
		}
		if (field991 == 1 && field986 >= 2 && field1201 % 50 == 0 && (class431.field3378.field272 >> 7 != class280.field2284 >> 7 || class121.field1438 >> 7 != class431.field3378.field243 >> 7)) {
			var17 = class431.field3378.field826;
			var18 = (class280.field2284 >> 7) + class346.field2624;
			var19 = class211.field1922 + (class121.field1438 >> 7);
			method483(var18, var19, var17, true);
		}
		int var21;
		if (!field1159) {
			if (class83.field841.method1000()) {
				var12 = class121.field1436;
			} else {
				label554: {
					var13 = 3;
					if (class283.field2296 < 310) {
						label546: {
							if (field991 == 1) {
								var14 = class280.field2284 >> 7;
								var15 = class121.field1438 >> 7;
							} else {
								var14 = class431.field3378.field272 >> 7;
								var15 = class431.field3378.field243 >> 7;
							}
							var16 = class314.field2470 >> 7;
							var17 = class225.field1995 >> 7;
							if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
								if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
									if ((class502.field4037[class121.field1436][var16][var17] & 4) != 0) {
										var13 = class121.field1436;
									}
									if (var14 > var16) {
										var18 = var14 - var16;
									} else {
										var18 = var16 - var14;
									}
									if (var15 > var17) {
										var19 = var15 - var17;
									} else {
										var19 = var17 - var15;
									}
									int var20;
									if (var18 > var19) {
										var20 = var19 * 65536 / var18;
										var21 = 32768;
										while (true) {
											if (var16 == var14) {
												break label546;
											}
											if (var16 < var14) {
												++var16;
											} else if (var16 > var14) {
												--var16;
											}
											if ((class502.field4037[class121.field1436][var16][var17] & 4) != 0) {
												var13 = class121.field1436;
											}
											var21 += var20;
											if (var21 >= 65536) {
												var21 -= 65536;
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}
												if ((class502.field4037[class121.field1436][var16][var17] & 4) != 0) {
													var13 = class121.field1436;
												}
											}
										}
									} else {
										if (var19 > 0) {
											var20 = var18 * 65536 / var19;
											var21 = 32768;
											while (var15 != var17) {
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}
												if ((class502.field4037[class121.field1436][var16][var17] & 4) != 0) {
													var13 = class121.field1436;
												}
												var21 += var20;
												if (var21 >= 65536) {
													var21 -= 65536;
													if (var16 < var14) {
														++var16;
													} else if (var16 > var14) {
														--var16;
													}
													if ((class502.field4037[class121.field1436][var16][var17] & 4) != 0) {
														var13 = class121.field1436;
													}
												}
											}
										}
										break label546;
									}
								}
								var12 = class121.field1436;
								break label554;
							}
							var12 = class121.field1436;
							break label554;
						}
					}
					if (class431.field3378.field272 >= 0 && class431.field3378.field243 >= 0 && class431.field3378.field272 < 13312 && class431.field3378.field243 < 13312) {
						if ((class502.field4037[class121.field1436][class431.field3378.field272 >> 7][class431.field3378.field243 >> 7] & 4) != 0) {
							var13 = class121.field1436;
						}
						var12 = var13;
					} else {
						var12 = class121.field1436;
					}
				}
			}
			var11 = var12;
		} else {
			var11 = method524();
		}
		var12 = class314.field2470;
		var13 = class93.field1211;
		var14 = class225.field1995;
		var15 = class283.field2296;
		var16 = class511.field4085;
		for (var17 = 0; var17 < 5; ++var17) {
			if (field1166[var17]) {
				var18 = (int) (Math.random() * (double) (field960[var17] * 2 + 1) - (double) field960[var17] + Math.sin((double) field1030[var17] / 100.0D * (double) field1116[var17]) * (double) field1120[var17]);
				if (var17 == 0) {
					class314.field2470 += var18;
				}
				if (var17 == 1) {
					class93.field1211 += var18;
				}
				if (var17 == 2) {
					class225.field1995 += var18;
				}
				if (var17 == 3) {
					class511.field4085 = class511.field4085 + var18 & 2047;
				}
				if (var17 == 4) {
					class283.field2296 += var18;
					if (class283.field2296 < 128) {
						class283.field2296 = 128;
					}
					if (class283.field2296 > 383) {
						class283.field2296 = 383;
					}
				}
			}
		}
		var17 = class422.field3270;
		var18 = class422.field3253;
		if (class422.field3264 != 0) {
			var17 = class422.field3265;
			var18 = class422.field3266;
		}
		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
			class424.method2129(var17 - var0, var18 - var1);
		} else {
			class424.method2130();
		}
		method561();
		class206.method1236(var0, var1, var2, var3, 0);
		method561();
		var19 = class238.method1394();
		class238.method1398(class501.field4023.field4150);
		class238.field2039.field2271 = field1183;
		class377.field3061.method1944(class314.field2470, class93.field1211, class225.field1995, class283.field2296, class511.field4085, var11);
		class238.method1398(false);
		if (field962) {
			class206.method1246();
		}
		class238.field2039.field2271 = var19;
		method561();
		class377.field3061.method1963();
		field1003 = 0;
		boolean var40 = false;
		var21 = -1;
		int var22 = -1;
		int var23 = class274.field2240;
		int[] var24 = class274.field2241;
		int var25;
		for (var25 = 0; var25 < field959 + var23; ++var25) {
			Object var26;
			if (var25 < var23) {
				var26 = field1071[var24[var25]];
				if (field1037 == var24[var25]) {
					var40 = true;
					var21 = var25;
					continue;
				}
				if (var26 == class431.field3378) {
					var22 = var25;
					continue;
				}
			} else {
				var26 = field958[field897[var25 - var23]];
			}
			class537.method2600((class54) var26, var25, var0, var1, var2, var3, (byte) -53);
		}
		if (field1136 && var22 != -1) {
			class537.method2600(class431.field3378, var22, var0, var1, var2, var3, (byte) 1);
		}
		if (var40) {
			class537.method2600(field1071[field1037], var21, var0, var1, var2, var3, (byte) 56);
		}
		for (var25 = 0; var25 < field1003; ++var25) {
			int var41 = field1005[var25];
			int var27 = field1006[var25];
			int var28 = field1182[var25];
			int var29 = field957[var25];
			boolean var30 = true;
			while (var30) {
				var30 = false;
				for (int var31 = 0; var31 < var25; ++var31) {
					if (var27 + 2 > field1006[var31] - field957[var31] && var27 - var29 < 2 + field1006[var31] && var41 - var28 < field1182[var31] + field1005[var31] && var41 + var28 > field1005[var31] - field1182[var31] && field1006[var31] - field957[var31] < var27) {
						var27 = field1006[var31] - field957[var31];
						var30 = true;
					}
				}
			}
			field1016 = field1005[var25];
			field1017 = field1006[var25] = var27;
			String var42 = field1013[var25];
			if (field1074 == 0) {
				int var32 = 16776960;
				if (field1009[var25] < 6) {
					var32 = field1130[field1009[var25]];
				}
				if (field1009[var25] == 6) {
					var32 = field1068 % 20 < 10 ? 16711680 : 16776960;
				}
				if (field1009[var25] == 7) {
					var32 = field1068 % 20 < 10 ? 255 : '\uffff';
				}
				if (field1009[var25] == 8) {
					var32 = field1068 % 20 < 10 ? '\ub000' : 8454016;
				}
				int var33;
				if (field1009[var25] == 9) {
					var33 = 150 - field1158[var25];
					if (var33 < 50) {
						var32 = 16711680 + var33 * 1280;
					} else if (var33 < 100) {
						var32 = 16776960 - 327680 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = 65280 + 5 * (var33 - 100);
					}
				}
				if (field1009[var25] == 10) {
					var33 = 150 - field1158[var25];
					if (var33 < 50) {
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) {
						var32 = 16711935 - 327680 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}
				if (field1009[var25] == 11) {
					var33 = 150 - field1158[var25];
					if (var33 < 50) {
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) {
						var32 = 65280 + (var33 - 50) * 327685;
					} else if (var33 < 150) {
						var32 = 16777215 - 327680 * (var33 - 100);
					}
				}
				int var34;
				if (field1009[var25] == 12 && field907[var25] == null) {
					var33 = var42.length();
					field907[var25] = new int[var33];
					for (var34 = 0; var34 < var33; ++var34) {
						int var35 = (int) (64.0F * ((float) var34 / (float) var33));
						int var36 = var35 << 10 | 896 | 64;
						field907[var25][var34] = class320.field2506[var36];
					}
				}
				if (field1010[var25] == 0) {
					class484.field3894.method2397(var42, var0 + field1016, field1017 + var1, var32, 0, field907[var25]);
				}
				if (field1010[var25] == 1) {
					class484.field3894.method2408(var42, field1016 + var0, field1017 + var1, var32, 0, field1068, field907[var25]);
				}
				if (field1010[var25] == 2) {
					class484.field3894.method2396(var42, field1016 + var0, var1 + field1017, var32, 0, field1068, field907[var25]);
				}
				if (field1010[var25] == 3) {
					class484.field3894.method2410(var42, var0 + field1016, field1017 + var1, var32, 0, field1068, 150 - field1158[var25], field907[var25]);
				}
				if (field1010[var25] == 4) {
					var33 = (150 - field1158[var25]) * (class484.field3894.method2386(var42) + 100) / 150;
					class206.method1249(field1016 + var0 - 50, var1, field1016 + var0 + 50, var1 + var3);
					class484.field3894.method2411(var42, 50 + var0 + field1016 - var33, var1 + field1017, var32, 0, field907[var25]);
					class206.method1243(var0, var1, var2 + var0, var1 + var3);
				}
				if (field1010[var25] == 5) {
					var33 = 150 - field1158[var25];
					var34 = 0;
					if (var33 < 25) {
						var34 = var33 - 25;
					} else if (var33 > 125) {
						var34 = var33 - 125;
					}
					class206.method1249(var0, field1017 + var1 - class484.field3894.field4005 - 1, var0 + var2, 5 + field1017 + var1);
					class484.field3894.method2397(var42, var0 + field1016, var1 + field1017 + var34, var32, 0, field907[var25]);
					class206.method1243(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class484.field3894.method2393(var42, var0 + field1016, field1017 + var1, 16776960, 0);
			}
		}
		method473(var0, var1);
		((class21) class238.field2039.field2270).method67(field977);
		method510(var0, var1, var2, var3);
		class314.field2470 = var12;
		class93.field1211 = var13;
		class225.field1995 = var14;
		class283.field2296 = var15;
		class511.field4085 = var16;
		if (field911 && class401.field3173.method28(true, false) == 0) {
			field911 = false;
		}
		if (field911) {
			class206.method1236(var0, var1, var2, var3, 0);
			method588(class55.field330, false);
		}
	}

	static void method538() {
		if (field1136) {
			class4.method10(class431.field3378, false);
		}
	}

	static void method480() {
		if (field1037 >= 0 && null != field1071[field1037]) {
			class4.method10(field1071[field1037], false);
		}
	}

	static void method511() {
		int var1 = class274.field2240;
		int[] var2 = class274.field2241;
		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != field1037 && field1026 != var2[var3]) {
				class4.method10(field1071[var2[var3]], true);
			}
		}
	}

	static final void method547(boolean var0) {
		for (int var2 = 0; var2 < field959; ++var2) {
			class373 var3 = field958[field897[var2]];
			if (null != var3 && var3.method217() && var0 == var3.field3019.field2466 && var3.field3019.method1689()) {
				int var4 = var3.field272 >> 7;
				int var5 = var3.field243 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var3.field246 == 1 && (var3.field272 & 127) == 64 && (var3.field243 & 127) == 64) {
						if (field1014[var4][var5] == field1068) {
							continue;
						}
						field1014[var4][var5] = field1068;
					}
					long var6 = class424.method2134(0, 0, 1, !var3.field3019.field2473, field897[var2]);
					var3.field278 = field1201;
					class377.field3061.method1924(class121.field1436, var3.field272, var3.field243, method450(var3.field246 * 64 - 64 + var3.field272, var3.field246 * 64 - 64 + var3.field243, class121.field1436), var3.field246 * 64 - 64 + 60, var3, var3.field244, var6, var3.field250);
				}
			}
		}
	}

	static final int method524() {
		if (class83.field841.method1000()) {
			return class121.field1436;
		} else {
			int var1 = method450(class314.field2470, class225.field1995, class121.field1436);
			return var1 - class93.field1211 < 800 && (class502.field4037[class121.field1436][class314.field2470 >> 7][class225.field1995 >> 7] & 4) != 0 ? class121.field1436 : 3;
		}
	}

	static final void method473(int var0, int var1) {
		if (field976 == 2) {
			method477(field1085 + (field922 - class346.field2624 << 7), field1118 + (field1065 - class211.field1922 << 7), field929 * 2);
			if (field1016 > -1 && field1201 % 20 < 10) {
				class434.field3409[0].method380(field1016 + var0 - 12, var1 + field1017 - 28);
			}
		}
	}

	public static class449 method459() {
		return field1113;
	}

	static void method603() {
		for (class24 var1 = (class24) field1152.method2218(); var1 != null; var1 = (class24) field1152.method2220()) {
			var1.method318();
		}
	}

	static void method519(class24 var0) {
		if (null != var0 && var0.field123 != null) {
			if (var0.field123.field2807 >= 0) {
				class354 var2 = class354.method1860(var0.field123.field2705);
				if (null == var2 || null == var2.field2820 || var2.field2820.length == 0 || var0.field123.field2807 >= var2.field2820.length || var2.field2820[var0.field123.field2807] != var0.field123) {
					return;
				}
			}
			if (var0.field123.field2690 == 11 && var0.field120 == 0) {
				if (var0.field123.method1833(var0.field121, var0.field122, 0, 0)) {
					switch(var0.field123.method1836()) {
						case 0:
							class41.method177(var0.field123.method1838(), true, false);
							break;
						case 1:
							int var3 = method528(var0.field123);
							boolean var7 = (var3 >> 22 & 1) != 0;
							if (var7) {
								int[] var4 = var0.field123.method1845();
								if (null != var4) {
									class457 var5 = class457.method2237(class483.field3807, field963.field1603);
									var5.field3487.method1133(var4[1]);
									var5.field3487.method1134(var0.field123.field2688);
									var5.field3487.method1154(var0.field123.field2807);
									var5.field3487.method1151(var0.field123.method1837());
									var5.field3487.method1134(var4[2]);
									var5.field3487.method1134(var4[0]);
									field963.method911(var5);
								}
							}
					}
				}
			} else if (var0.field123.field2690 == 12) {
				class114 var6 = var0.field123.method1855();
				if (null != var6 && var6.method751()) {
					switch(var0.field120) {
						case 0:
							field1137.method1733(var0.field123);
							var6.method712(true);
							var6.method787(var0.field121, var0.field122, field1046.method2323(82), field1046.method2323(81));
							break;
						case 1:
							var6.method770(var0.field121, var0.field122);
					}
				}
			}
		}
	}

	static boolean method487() {
		return (field901 & 4) != 0;
	}

	static boolean method495() {
		return (field901 & 2) != 0;
	}

	static boolean method543(class82 var0) {
		if (field901 == 0) {
			return false;
		} else {
			boolean var2;
			if (class431.field3378 == var0) {
				var2 = (field901 & 8) != 0;
				return var2;
			} else {
				var2 = method487();
				if (!var2) {
					boolean var3 = (field901 & 1) != 0;
					var2 = var3 && var0.method330();
				}
				return var2 || method495() && var0.method333();
			}
		}
	}

	static final void method510(int var0, int var1, int var2, int var3) {
		field1023 = 0;
		int var5 = (class431.field3378.field272 >> 7) + class346.field2624;
		int var6 = class211.field1922 + (class431.field3378.field243 >> 7);
		if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
			field1023 = 1;
		}
		if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
			field1023 = 1;
		}
		if (field1023 == 1 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
			field1023 = 0;
		}
	}

	static final void method464(class54 var0, int var1) {
		method477(var0.field272, var0.field243, var1);
	}

	static final void method477(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = method450(var0, var1, class121.field1436) - var2;
			var0 -= class314.field2470;
			var4 -= class93.field1211;
			var1 -= class225.field1995;
			int var5 = class238.field2037[class283.field2296];
			int var6 = class238.field2035[class283.field2296];
			int var7 = class238.field2037[class511.field4085];
			int var8 = class238.field2035[class511.field4085];
			int var9 = var0 * var8 + var1 * var7 >> 16;
			var1 = var1 * var8 - var7 * var0 >> 16;
			var0 = var9;
			var9 = var6 * var4 - var5 * var1 >> 16;
			var1 = var1 * var6 + var4 * var5 >> 16;
			if (var1 >= 50) {
				field1016 = var0 * field1183 / var1 + field1114 / 2;
				field1017 = field1183 * var9 / var1 + field989 / 2;
			} else {
				field1016 = -1;
				field1017 = -1;
			}
		} else {
			field1016 = -1;
			field1017 = -1;
		}
	}

	static final int method450(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (class502.field4037[1][var4][var5] & 2) == 2) {
				var6 = var2 + 1;
			}
			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = class502.field4035[var6][var4 + 1][var5] * var7 + (128 - var7) * class502.field4035[var6][var4][var5] >> 7;
			int var10 = (128 - var7) * class502.field4035[var6][var4][var5 + 1] + class502.field4035[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return var10 * var8 + (128 - var8) * var9 >> 7;
		} else {
			return 0;
		}
	}

	static final void method552(boolean var0, class515 var1) {
		field974 = var0;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!field974) {
			int var3 = var1.method1145();
			var4 = var1.method1125();
			var5 = var1.method1145();
			class472.field3725 = new int[var5][4];
			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class472.field3725[var6][var7] = var1.method1100();
				}
			}
			class437.field3431 = new int[var5];
			class484.field3895 = new int[var5];
			class349.field2634 = new int[var5];
			class249.field2113 = new byte[var5][];
			class127.field1464 = new byte[var5][];
			var5 = 0;
			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					class437.field3431[var5] = var8;
					class484.field3895[var5] = class167.field1681.method1787("m" + var6 + "_" + var7);
					class349.field2634[var5] = class167.field1681.method1787("l" + var6 + "_" + var7);
					++var5;
				}
			}
			method563(var3, var4, true);
		} else {
			boolean var16 = var1.method1096() == 1;
			var4 = var1.method1145();
			var5 = var1.method1145();
			var6 = var1.method1145();
			var1.method2490();
			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method2488(1);
						if (var10 == 1) {
							field975[var7][var8][var9] = var1.method2488(26);
						} else {
							field975[var7][var8][var9] = -1;
						}
					}
				}
			}
			var1.method2491();
			class472.field3725 = new int[var6][4];
			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					class472.field3725[var7][var8] = var1.method1100();
				}
			}
			class437.field3431 = new int[var6];
			class484.field3895 = new int[var6];
			class349.field2634 = new int[var6];
			class249.field2113 = new byte[var6][];
			class127.field1464 = new byte[var6][];
			var6 = 0;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = field975[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;
							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (class437.field3431[var14] == var13) {
									var13 = -1;
									break;
								}
							}
							if (var13 != -1) {
								class437.field3431[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								class484.field3895[var6] = class167.field1681.method1787("m" + var14 + "_" + var15);
								class349.field2634[var6] = class167.field1681.method1787("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}
			method563(var5, var4, !var16);
		}
	}

	static final void method563(int var0, int var1, boolean var2) {
		if (!var2 || class502.field4025 != var0 || class135.field1486 != var1) {
			class502.field4025 = var0;
			class135.field1486 = var1;
			method567(25);
			method588(class55.field330, true);
			int var4 = class346.field2624;
			int var5 = class211.field1922;
			class346.field2624 = (var0 - 6) * 8;
			class211.field1922 = (var1 - 6) * 8;
			int var6 = class346.field2624 - var4;
			int var7 = class211.field1922 - var5;
			var4 = class346.field2624;
			var5 = class211.field1922;
			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class373 var9 = field958[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field317;
						var10000[var10] -= var6;
						var10000 = var9.field314;
						var10000[var10] -= var7;
					}
					var9.field272 -= var6 * 128;
					var9.field243 -= var7 * 128;
				}
			}
			for (var8 = 0; var8 < 2048; ++var8) {
				class82 var20 = field1071[var8];
				if (null != var20) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field317;
						var10000[var10] -= var6;
						var10000 = var20.field314;
						var10000[var10] -= var7;
					}
					var20.field272 -= var6 * 128;
					var20.field243 -= var7 * 128;
				}
			}
			byte var19 = 0;
			byte var21 = 104;
			byte var22 = 1;
			if (var6 < 0) {
				var19 = 103;
				var21 = -1;
				var22 = -1;
			}
			byte var11 = 0;
			byte var12 = 104;
			byte var13 = 1;
			if (var7 < 0) {
				var11 = 103;
				var12 = -1;
				var13 = -1;
			}
			int var15;
			for (int var14 = var19; var14 != var21; var14 += var22) {
				for (var15 = var11; var15 != var12; var15 += var13) {
					int var16 = var6 + var14;
					int var17 = var7 + var15;
					for (int var18 = 0; var18 < 4; ++var18) {
						if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
							field1038[var18][var14][var15] = field1038[var18][var16][var17];
						} else {
							field1038[var18][var14][var15] = null;
						}
					}
				}
			}
			for (class39 var23 = (class39) field1039.method2218(); null != var23; var23 = (class39) field1039.method2220()) {
				var23.field193 -= var6;
				var23.field199 -= var7;
				if (var23.field193 < 0 || var23.field199 < 0 || var23.field193 >= 104 || var23.field199 >= 104) {
					var23.method318();
				}
			}
			if (field1149 != 0) {
				field1149 -= var6;
				field1072 -= var7;
			}
			field1153 = 0;
			field1159 = false;
			class314.field2470 -= var6 << 7;
			class225.field1995 -= var7 << 7;
			class280.field2284 -= var6 << 7;
			class121.field1438 -= var7 << 7;
			field1144 = -1;
			field1168.method2214();
			field1025.method2214();
			for (var15 = 0; var15 < 4; ++var15) {
				field973[var15].method2187();
			}
		}
	}

	static final void method492(boolean var0) {
		method561();
		++field963.field1609;
		if (field963.field1609 >= 50 || var0) {
			field963.field1609 = 0;
			if (!field965 && field963.method914() != null) {
				class457 var2 = class457.method2237(class483.field3830, field963.field1603);
				field963.method911(var2);
				try {
					field963.method910();
				} catch (IOException var4) {
					field965 = true;
				}
			}
		}
	}

	static final void method578() {
		method492(false);
		field968 = 0;
		boolean var1 = true;
		int var2;
		for (var2 = 0; var2 < class249.field2113.length; ++var2) {
			if (class484.field3895[var2] != -1 && class249.field2113[var2] == null) {
				class249.field2113[var2] = class167.field1681.method1762(class484.field3895[var2], 0);
				if (null == class249.field2113[var2]) {
					var1 = false;
					++field968;
				}
			}
			if (class349.field2634[var2] != -1 && class127.field1464[var2] == null) {
				class127.field1464[var2] = class167.field1681.method1763(class349.field2634[var2], 0, class472.field3725[var2]);
				if (null == class127.field1464[var2]) {
					var1 = false;
					++field968;
				}
			}
		}
		if (!var1) {
			field972 = 1;
		} else {
			field970 = 0;
			var1 = true;
			int var4;
			int var5;
			for (var2 = 0; var2 < class249.field2113.length; ++var2) {
				byte[] var3 = class127.field1464[var2];
				if (var3 != null) {
					var4 = (class437.field3431[var2] >> 8) * 64 - class346.field2624;
					var5 = 64 * (class437.field3431[var2] & 255) - class211.field1922;
					if (field974) {
						var4 = 10;
						var5 = 10;
					}
					var1 &= class502.method2427(var3, var4, var5);
				}
			}
			if (!var1) {
				field972 = 2;
			} else {
				if (field972 != 0) {
					method588(class55.field330 + class74.field738 + class74.field732 + 100 + "%" + class74.field734, true);
				}
				method561();
				class377.field3061.method1916();
				for (var2 = 0; var2 < 4; ++var2) {
					field973[var2].method2187();
				}
				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							class502.field4037[var2][var16][var4] = 0;
						}
					}
				}
				method561();
				class502.method2434();
				var2 = class249.field2113.length;
				class46.method196();
				method492(true);
				int var18;
				if (!field974) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (class437.field3431[var16] >> 8) - class346.field2624;
						var5 = 64 * (class437.field3431[var16] & 255) - class211.field1922;
						var6 = class249.field2113[var16];
						if (null != var6) {
							method561();
							class502.method2430(var6, var4, var5, class502.field4025 * 8 - 48, class135.field1486 * 8 - 48, field973);
						}
					}
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (class437.field3431[var16] >> 8) * 64 - class346.field2624;
						var5 = (class437.field3431[var16] & 255) * 64 - class211.field1922;
						var6 = class249.field2113[var16];
						if (null == var6 && class135.field1486 < 800) {
							method561();
							class502.method2420(var4, var5, 64, 64);
						}
					}
					method492(true);
					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = class127.field1464[var16];
						if (var17 != null) {
							var5 = (class437.field3431[var16] >> 8) * 64 - class346.field2624;
							var18 = (class437.field3431[var16] & 255) * 64 - class211.field1922;
							method561();
							class502.method2435(var17, var5, var18, class377.field3061, field973);
						}
					}
				}
				int var7;
				int var8;
				int var9;
				if (field974) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						method561();
						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = field975[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = (var10 / 8 << 8) + var11 / 8;
									for (int var13 = 0; var13 < class437.field3431.length; ++var13) {
										if (var12 == class437.field3431[var13] && class249.field2113[var13] != null) {
											int var14 = 8 * (var10 - var4);
											int var15 = 8 * (var11 - var5);
											class259.method1459(class249.field2113[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, field973);
											var19 = true;
											break;
										}
									}
								}
								if (!var19) {
									class502.method2433(var16, var4 * 8, var5 * 8);
								}
							}
						}
					}
					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = field975[0][var16][var4];
							if (var5 == -1) {
								class502.method2420(var16 * 8, var4 * 8, 8, 8);
							}
						}
					}
					method492(true);
					for (var16 = 0; var16 < 4; ++var16) {
						method561();
						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = field975[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;
									for (var12 = 0; var12 < class437.field3431.length; ++var12) {
										if (var11 == class437.field3431[var12] && class127.field1464[var12] != null) {
											class502.method2417(class127.field1464[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, 8 * (var10 & 7), var8, class377.field3061, field973);
											break;
										}
									}
								}
							}
						}
					}
				}
				method492(true);
				method561();
				class502.method2425(class377.field3061, field973);
				method492(true);
				var16 = class502.field4027;
				if (var16 > class121.field1436) {
					var16 = class121.field1436;
				}
				if (var16 < class121.field1436 - 1) {
					var16 = class121.field1436 - 1;
				}
				if (field902) {
					class377.field3061.method1917(class502.field4027);
				} else {
					class377.field3061.method1917(0);
				}
				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						method500(var4, var5);
					}
				}
				method561();
				method515();
				class362.field2897.method645();
				class457 var20;
				if (class501.field4023.method2547()) {
					var20 = class457.method2237(class483.field3815, field963.field1603);
					var20.field3487.method1151(1057001181);
					field963.method911(var20);
				}
				if (!field974) {
					var4 = (class502.field4025 - 6) / 8;
					var5 = (6 + class502.field4025) / 8;
					var18 = (class135.field1486 - 6) / 8;
					var7 = (class135.field1486 + 6) / 8;
					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								class167.field1681.method1786("m" + var8 + "_" + var9);
								class167.field1681.method1786("l" + var8 + "_" + var9);
							}
						}
					}
				}
				method567(30);
				method561();
				class502.method2421();
				var20 = class457.method2237(class483.field3836, field963.field1603);
				field963.method911(var20);
				class522.method2557();
			}
		}
	}

	static final void method443(int var0) {
		int[] var2 = class7.field25.field847;
		int var3 = var2.length;
		int var4;
		for (var4 = 0; var4 < var3; ++var4) {
			var2[var4] = 0;
		}
		int var5;
		int var6;
		for (var4 = 1; var4 < 103; ++var4) {
			var5 = 2048 * (103 - var4) + 24628;
			for (var6 = 1; var6 < 103; ++var6) {
				if ((class502.field4037[var0][var6][var4] & 24) == 0) {
					class377.field3061.method1939(var2, var5, 512, var0, var6, var4);
				}
				if (var0 < 3 && (class502.field4037[var0 + 1][var6][var4] & 8) != 0) {
					class377.field3061.method1939(var2, var5, 512, var0 + 1, var6, var4);
				}
				var5 += 4;
			}
		}
		var4 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
		var5 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
		class7.field25.method354();
		int var7;
		for (var6 = 1; var6 < 103; ++var6) {
			for (var7 = 1; var7 < 103; ++var7) {
				if ((class502.field4037[var0][var7][var6] & 24) == 0) {
					method474(var0, var7, var6, var4, var5);
				}
				if (var0 < 3 && (class502.field4037[var0 + 1][var7][var6] & 8) != 0) {
					method474(var0 + 1, var7, var6, var4, var5);
				}
			}
		}
		field1145 = 0;
		for (var6 = 0; var6 < 104; ++var6) {
			for (var7 = 0; var7 < 104; ++var7) {
				long var8 = class377.field3061.method1966(class121.field1436, var6, var7);
				if (0L != var8) {
					int var10 = class424.method2132(var8);
					int var11 = class319.method1705(var10, (byte) 46).field2902;
					if (var11 >= 0 && class319.method1706(var11).field2491) {
						field1156[field1145] = class319.method1706(var11).method1702(false);
						field1146[field1145] = var6;
						field1147[field1145] = var7;
						++field1145;
					}
				}
			}
		}
		class389.field3103.method1759();
	}

	static final void method474(int var0, int var1, int var2, int var3, int var4) {
		long var6 = class377.field3061.method1952(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var24;
		if (0L != var6) {
			var8 = class377.field3061.method1934(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = 0L != var6;
			if (var13) {
				boolean var14 = (int) (var6 >>> 16 & 1L) == 1;
				var13 = !var14;
			}
			if (var13) {
				var11 = var4;
			}
			int[] var23 = class7.field25.field847;
			var24 = (103 - var2) * 2048 + 24624 + var1 * 4;
			var15 = class424.method2132(var6);
			class362 var16 = class319.method1705(var15, (byte) 8);
			if (var16.field2901 != -1) {
				class214 var17 = class147.field1556[var16.field2901];
				if (null != var17) {
					int var18 = (var16.field2883 * 4 - var17.field1940) / 2;
					int var19 = (var16.field2868 * 4 - var17.field1941) / 2;
					var17.method1292(var18 + var1 * 4 + 48, var19 + 48 + 4 * (104 - var2 - var16.field2868));
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var23[var24] = var11;
						var23[var24 + 512] = var11;
						var23[var24 + 1024] = var11;
						var23[var24 + 1536] = var11;
					} else if (var9 == 1) {
						var23[var24] = var11;
						var23[var24 + 1] = var11;
						var23[var24 + 2] = var11;
						var23[var24 + 3] = var11;
					} else if (var9 == 2) {
						var23[var24 + 3] = var11;
						var23[var24 + 3 + 512] = var11;
						var23[var24 + 3 + 1024] = var11;
						var23[1536 + var24 + 3] = var11;
					} else if (var9 == 3) {
						var23[var24 + 1536] = var11;
						var23[1 + var24 + 1536] = var11;
						var23[2 + var24 + 1536] = var11;
						var23[3 + var24 + 1536] = var11;
					}
				}
				if (var10 == 3) {
					if (var9 == 0) {
						var23[var24] = var11;
					} else if (var9 == 1) {
						var23[var24 + 3] = var11;
					} else if (var9 == 2) {
						var23[var24 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var23[var24 + 1536] = var11;
					}
				}
				if (var10 == 2) {
					if (var9 == 3) {
						var23[var24] = var11;
						var23[var24 + 512] = var11;
						var23[var24 + 1024] = var11;
						var23[var24 + 1536] = var11;
					} else if (var9 == 0) {
						var23[var24] = var11;
						var23[var24 + 1] = var11;
						var23[var24 + 2] = var11;
						var23[var24 + 3] = var11;
					} else if (var9 == 1) {
						var23[var24 + 3] = var11;
						var23[var24 + 3 + 512] = var11;
						var23[1024 + var24 + 3] = var11;
						var23[var24 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var23[var24 + 1536] = var11;
						var23[1 + var24 + 1536] = var11;
						var23[var24 + 1536 + 2] = var11;
						var23[3 + var24 + 1536] = var11;
					}
				}
			}
		}
		var6 = class377.field3061.method1933(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class377.field3061.method1934(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class424.method2132(var6);
			class362 var12 = class319.method1705(var11, (byte) 17);
			if (var12.field2901 != -1) {
				class214 var25 = class147.field1556[var12.field2901];
				if (null != var25) {
					var24 = (var12.field2883 * 4 - var25.field1940) / 2;
					var15 = (var12.field2868 * 4 - var25.field1941) / 2;
					var25.method1292(var24 + 48 + var1 * 4, var15 + 4 * (104 - var2 - var12.field2868) + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var27 = 0L != var6;
				if (var27) {
					boolean var28 = (int) (var6 >>> 16 & 1L) == 1;
					var27 = !var28;
				}
				if (var27) {
					var26 = 15597568;
				}
				int[] var29 = class7.field25.field847;
				int var30 = 24624 + var1 * 4 + (103 - var2) * 2048;
				if (var9 != 0 && var9 != 2) {
					var29[var30] = var26;
					var29[1 + var30 + 512] = var26;
					var29[2 + var30 + 1024] = var26;
					var29[var30 + 1536 + 3] = var26;
				} else {
					var29[var30 + 1536] = var26;
					var29[1 + var30 + 1024] = var26;
					var29[2 + var30 + 512] = var26;
					var29[var30 + 3] = var26;
				}
			}
		}
		var6 = class377.field3061.method1966(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class424.method2132(var6);
			class362 var20 = class319.method1705(var8, (byte) 35);
			if (var20.field2901 != -1) {
				class214 var21 = class147.field1556[var20.field2901];
				if (var21 != null) {
					var11 = (var20.field2883 * 4 - var21.field1940) / 2;
					int var22 = (var20.field2868 * 4 - var21.field1941) / 2;
					var21.method1292(var11 + var1 * 4 + 48, 4 * (104 - var2 - var20.field2868) + 48 + var22);
				}
			}
		}
	}

	static final void method479(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class39 var11 = null;
		for (class39 var12 = (class39) field1039.method2218(); var12 != null; var12 = (class39) field1039.method2220()) {
			if (var12.field200 == var0 && var12.field193 == var1 && var12.field199 == var2 && var3 == var12.field186) {
				var11 = var12;
				break;
			}
		}
		if (null == var11) {
			var11 = new class39();
			var11.field200 = var0;
			var11.field186 = var3;
			var11.field193 = var1;
			var11.field199 = var2;
			var11.field195 = -1;
			method493(var11);
			field1039.method2222(var11);
		}
		var11.field192 = var4;
		var11.field188 = var5;
		var11.field194 = var6;
		var11.field197 = var8;
		var11.field198 = var9;
		var11.method169(var7);
	}

	static final boolean method596(int var0, int var1, int var2, int var3, int var4) {
		class39 var6 = null;
		for (class39 var7 = (class39) field1039.method2218(); var7 != null; var7 = (class39) field1039.method2220()) {
			if (var0 == var7.field200 && var1 == var7.field193 && var2 == var7.field199 && var3 == var7.field186) {
				var6 = var7;
				break;
			}
		}
		if (null != var6) {
			var6.field195 = var4;
			return true;
		} else {
			return false;
		}
	}

	static final void method515() {
		for (class39 var1 = (class39) field1039.method2218(); null != var1; var1 = (class39) field1039.method2220()) {
			if (var1.field198 == -1) {
				var1.field197 = 0;
				method493(var1);
			} else {
				var1.method318();
			}
		}
	}

	static final void method493(class39 var0) {
		long var2 = 0L;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (var0.field186 == 0) {
			var2 = class377.field3061.method1952(var0.field200, var0.field193, var0.field199);
		}
		if (var0.field186 == 1) {
			var2 = class377.field3061.method1957(var0.field200, var0.field193, var0.field199);
		}
		if (var0.field186 == 2) {
			var2 = class377.field3061.method1933(var0.field200, var0.field193, var0.field199);
		}
		if (var0.field186 == 3) {
			var2 = class377.field3061.method1966(var0.field200, var0.field193, var0.field199);
		}
		if (var2 != 0L) {
			int var7 = class377.field3061.method1934(var0.field200, var0.field193, var0.field199, var2);
			var4 = class424.method2132(var2);
			var5 = var7 & 31;
			var6 = var7 >> 6 & 3;
		}
		var0.field189 = var4;
		var0.field191 = var5;
		var0.field190 = var6;
	}

	static final void method595() {
		for (class39 var1 = (class39) field1039.method2218(); var1 != null; var1 = (class39) field1039.method2220()) {
			if (var1.field198 > 0) {
				--var1.field198;
			}
			boolean var2;
			int var3;
			int var4;
			class362 var5;
			if (var1.field198 == 0) {
				if (var1.field189 >= 0) {
					var3 = var1.field189;
					var4 = var1.field191;
					var5 = class319.method1705(var3, (byte) -69);
					if (var4 == 11) {
						var4 = 10;
					}
					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}
					var2 = var5.method1888(var4);
					if (!var2) {
						continue;
					}
				}
				method600(var1.field200, var1.field186, var1.field193, var1.field199, var1.field189, var1.field190, var1.field191, var1.field195);
				var1.method318();
			} else {
				if (var1.field197 > 0) {
					--var1.field197;
				}
				if (var1.field197 == 0 && var1.field193 >= 1 && var1.field199 >= 1 && var1.field193 <= 102 && var1.field199 <= 102) {
					if (var1.field192 >= 0) {
						var3 = var1.field192;
						var4 = var1.field188;
						var5 = class319.method1705(var3, (byte) -10);
						if (var4 == 11) {
							var4 = 10;
						}
						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}
						var2 = var5.method1888(var4);
						if (!var2) {
							continue;
						}
					}
					method600(var1.field200, var1.field186, var1.field193, var1.field199, var1.field192, var1.field194, var1.field188, var1.field195);
					var1.field197 = -1;
					if (var1.field192 == var1.field189 && var1.field189 == -1) {
						var1.method318();
					} else if (var1.field192 == var1.field189 && var1.field194 == var1.field190 && var1.field191 == var1.field188) {
						var1.method318();
					}
				}
			}
		}
	}

	static final void method600(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (field902 && var0 != class121.field1436) {
				return;
			}
			long var9 = 0L;
			boolean var11 = true;
			boolean var12 = false;
			boolean var13 = false;
			if (var1 == 0) {
				var9 = class377.field3061.method1952(var0, var2, var3);
			}
			if (var1 == 1) {
				var9 = class377.field3061.method1957(var0, var2, var3);
			}
			if (var1 == 2) {
				var9 = class377.field3061.method1933(var0, var2, var3);
			}
			if (var1 == 3) {
				var9 = class377.field3061.method1966(var0, var2, var3);
			}
			int var14;
			if (var9 != 0L) {
				var14 = class377.field3061.method1934(var0, var2, var3, var9);
				int var38 = class424.method2132(var9);
				int var39 = var14 & 31;
				int var40 = var14 >> 6 & 3;
				class362 var15;
				if (var1 == 0) {
					class377.field3061.method1959(var0, var2, var3);
					var15 = class319.method1705(var38, (byte) 10);
					if (var15.field2885 != 0) {
						field973[var0].method2184(var2, var3, var39, var40, var15.field2886);
					}
				}
				if (var1 == 1) {
					class377.field3061.method1927(var0, var2, var3);
				}
				if (var1 == 2) {
					class377.field3061.method1960(var0, var2, var3);
					var15 = class319.method1705(var38, (byte) 26);
					if (var2 + var15.field2883 > 103 || var3 + var15.field2883 > 103 || var15.field2868 + var2 > 103 || var3 + var15.field2868 > 103) {
						return;
					}
					if (var15.field2885 != 0) {
						field973[var0].method2188(var2, var3, var15.field2883, var15.field2868, var40, var15.field2886);
					}
				}
				if (var1 == 3) {
					class377.field3061.method1929(var0, var2, var3);
					var15 = class319.method1705(var38, (byte) 17);
					if (var15.field2885 == 1) {
						field973[var0].method2186(var2, var3);
					}
				}
			}
			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && (class502.field4037[1][var2][var3] & 2) == 2) {
					var14 = var0 + 1;
				}
				class372 var41 = class377.field3061;
				class438 var16 = field973[var0];
				class362 var17 = class319.method1705(var4, (byte) 76);
				int var18 = var7 >= 0 ? var7 : var17.field2895;
				int var19;
				int var20;
				if (var5 != 1 && var5 != 3) {
					var19 = var17.field2883;
					var20 = var17.field2868;
				} else {
					var19 = var17.field2868;
					var20 = var17.field2883;
				}
				int var21;
				int var22;
				if (var19 + var2 <= 104) {
					var21 = (var19 >> 1) + var2;
					var22 = (var19 + 1 >> 1) + var2;
				} else {
					var21 = var2;
					var22 = var2 + 1;
				}
				int var23;
				int var24;
				if (var20 + var3 <= 104) {
					var23 = (var20 >> 1) + var3;
					var24 = var3 + (var20 + 1 >> 1);
				} else {
					var23 = var3;
					var24 = var3 + 1;
				}
				int[][] var25 = class502.field4035[var14];
				int var26 = var25[var22][var23] + var25[var21][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
				int var27 = (var19 << 6) + (var2 << 7);
				int var28 = (var3 << 7) + (var20 << 6);
				long var29 = class424.method2134(var2, var3, 2, var17.field2892 == 0, var4);
				int var31 = (var5 << 6) + var6;
				if (var17.field2908 == 1) {
					var31 += 256;
				}
				Object var32;
				if (var6 == 22) {
					if (var18 == -1 && var17.field2909 == null) {
						var32 = var17.method1892(22, var5, var25, var27, var26, var28);
					} else {
						var32 = new class57(var4, 22, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
					}
					var41.method1921(var0, var2, var3, var26, (class189) var32, var29, var31);
					if (var17.field2885 == 1) {
						var16.method2183(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var18 == -1 && null == var17.field2909) {
							var32 = var17.method1892(var6, var5, var25, var27, var26, var28);
						} else {
							var32 = new class57(var4, var6, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
						}
						var41.method1923(var0, var2, var3, var26, 1, 1, (class189) var32, 0, var29, var31);
						if (var17.field2885 != 0) {
							var16.method2181(var2, var3, var19, var20, var17.field2886);
						}
					} else if (var6 == 0) {
						if (var18 == -1 && null == var17.field2909) {
							var32 = var17.method1892(0, var5, var25, var27, var26, var28);
						} else {
							var32 = new class57(var4, 0, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
						}
						var41.method1943(var0, var2, var3, var26, (class189) var32, (class189) null, class502.field4030[var5], 0, var29, var31);
						if (var17.field2885 != 0) {
							var16.method2180(var2, var3, var6, var5, var17.field2886);
						}
					} else if (var6 == 1) {
						if (var18 == -1 && var17.field2909 == null) {
							var32 = var17.method1892(1, var5, var25, var27, var26, var28);
						} else {
							var32 = new class57(var4, 1, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
						}
						var41.method1943(var0, var2, var3, var26, (class189) var32, (class189) null, class502.field4031[var5], 0, var29, var31);
						if (var17.field2885 != 0) {
							var16.method2180(var2, var3, var6, var5, var17.field2886);
						}
					} else {
						int var44;
						if (var6 == 2) {
							var44 = var5 + 1 & 3;
							Object var33;
							Object var34;
							if (var18 == -1 && var17.field2909 == null) {
								var33 = var17.method1892(2, var5 + 4, var25, var27, var26, var28);
								var34 = var17.method1892(2, var44, var25, var27, var26, var28);
							} else {
								var33 = new class57(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field2900, (class189) null);
								var34 = new class57(var4, 2, var44, var14, var2, var3, var18, var17.field2900, (class189) null);
							}
							var41.method1943(var0, var2, var3, var26, (class189) var33, (class189) var34, class502.field4030[var5], class502.field4030[var44], var29, var31);
							if (var17.field2885 != 0) {
								var16.method2180(var2, var3, var6, var5, var17.field2886);
							}
						} else if (var6 == 3) {
							if (var18 == -1 && null == var17.field2909) {
								var32 = var17.method1892(3, var5, var25, var27, var26, var28);
							} else {
								var32 = new class57(var4, 3, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
							}
							var41.method1943(var0, var2, var3, var26, (class189) var32, (class189) null, class502.field4031[var5], 0, var29, var31);
							if (var17.field2885 != 0) {
								var16.method2180(var2, var3, var6, var5, var17.field2886);
							}
						} else if (var6 == 9) {
							if (var18 == -1 && var17.field2909 == null) {
								var32 = var17.method1892(var6, var5, var25, var27, var26, var28);
							} else {
								var32 = new class57(var4, var6, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
							}
							var41.method1923(var0, var2, var3, var26, 1, 1, (class189) var32, 0, var29, var31);
							if (var17.field2885 != 0) {
								var16.method2181(var2, var3, var19, var20, var17.field2886);
							}
						} else if (var6 == 4) {
							if (var18 == -1 && null == var17.field2909) {
								var32 = var17.method1892(4, var5, var25, var27, var26, var28);
							} else {
								var32 = new class57(var4, 4, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
							}
							var41.method1958(var0, var2, var3, var26, (class189) var32, (class189) null, class502.field4030[var5], 0, 0, 0, var29, var31);
						} else {
							Object var35;
							long var42;
							if (var6 == 5) {
								var44 = 16;
								var42 = var41.method1952(var0, var2, var3);
								if (var42 != 0L) {
									var44 = class319.method1705(class424.method2132(var42), (byte) -62).field2889;
								}
								if (var18 == -1 && null == var17.field2909) {
									var35 = var17.method1892(4, var5, var25, var27, var26, var28);
								} else {
									var35 = new class57(var4, 4, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
								}
								var41.method1958(var0, var2, var3, var26, (class189) var35, (class189) null, class502.field4030[var5], 0, class502.field4032[var5] * var44, var44 * class502.field4033[var5], var29, var31);
							} else if (var6 == 6) {
								var44 = 8;
								var42 = var41.method1952(var0, var2, var3);
								if (var42 != 0L) {
									var44 = class319.method1705(class424.method2132(var42), (byte) -48).field2889 / 2;
								}
								if (var18 == -1 && var17.field2909 == null) {
									var35 = var17.method1892(4, var5 + 4, var25, var27, var26, var28);
								} else {
									var35 = new class57(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2900, (class189) null);
								}
								var41.method1958(var0, var2, var3, var26, (class189) var35, (class189) null, 256, var5, var44 * class502.field4038[var5], class502.field4036[var5] * var44, var29, var31);
							} else if (var6 == 7) {
								int var43 = var5 + 2 & 3;
								if (var18 == -1 && var17.field2909 == null) {
									var32 = var17.method1892(4, var43 + 4, var25, var27, var26, var28);
								} else {
									var32 = new class57(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field2900, (class189) null);
								}
								var41.method1958(var0, var2, var3, var26, (class189) var32, (class189) null, 256, var43, 0, 0, var29, var31);
							} else if (var6 == 8) {
								var44 = 8;
								var42 = var41.method1952(var0, var2, var3);
								if (0L != var42) {
									var44 = class319.method1705(class424.method2132(var42), (byte) -82).field2889 / 2;
								}
								int var37 = var5 + 2 & 3;
								Object var36;
								if (var18 == -1 && var17.field2909 == null) {
									var35 = var17.method1892(4, var5 + 4, var25, var27, var26, var28);
									var36 = var17.method1892(4, var37 + 4, var25, var27, var26, var28);
								} else {
									var35 = new class57(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2900, (class189) null);
									var36 = new class57(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field2900, (class189) null);
								}
								var41.method1958(var0, var2, var3, var26, (class189) var35, (class189) var36, 256, var5, var44 * class502.field4038[var5], var44 * class502.field4036[var5], var29, var31);
							}
						}
					}
				} else {
					if (var18 == -1 && null == var17.field2909) {
						var32 = var17.method1892(10, var5, var25, var27, var26, var28);
					} else {
						var32 = new class57(var4, 10, var5, var14, var2, var3, var18, var17.field2900, (class189) null);
					}
					if (var32 != null) {
						var41.method1923(var0, var2, var3, var26, var19, var20, (class189) var32, var6 == 11 ? 256 : 0, var29, var31);
					}
					if (var17.field2885 != 0) {
						var16.method2181(var2, var3, var19, var20, var17.field2886);
					}
				}
			}
		}
	}

	static final void method500(int var0, int var1) {
		class449 var3 = field1038[class121.field1436][var0][var1];
		if (null == var3) {
			class377.field3061.method1930(class121.field1436, var0, var1);
		} else {
			long var4 = -99999999L;
			class103 var6 = null;
			class103 var7;
			for (var7 = (class103) var3.method2218(); var7 != null; var7 = (class103) var3.method2220()) {
				class426 var8 = class426.method2155(var7.field1275);
				long var9 = (long) var8.field3309;
				if (var8.field3308 == 1) {
					var9 *= var7.field1276 < Integer.MAX_VALUE ? (long) (var7.field1276 + 1) : (long) var7.field1276;
				}
				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}
			if (var6 == null) {
				class377.field3061.method1930(class121.field1436, var0, var1);
			} else {
				var3.method2223(var6);
				class103 var12 = null;
				class103 var13 = null;
				for (var7 = (class103) var3.method2218(); var7 != null; var7 = (class103) var3.method2220()) {
					if (var7.field1275 != var6.field1275) {
						if (var12 == null) {
							var12 = var7;
						}
						if (var7.field1275 != var12.field1275 && null == var13) {
							var13 = var7;
						}
					}
				}
				long var10 = class424.method2134(var0, var1, 3, false, 0);
				class377.field3061.method1922(class121.field1436, var0, var1, method450(var0 * 128 + 64, 64 + var1 * 128, class121.field1436), var6, var10, var12, var13);
			}
		}
	}

	static final void method546(boolean var0, class515 var1) {
		field1167 = 0;
		field1012 = 0;
		var1.method2490();
		int var3 = var1.method2488(8);
		int var4;
		if (var3 < field959) {
			for (var4 = var3; var4 < field959; ++var4) {
				field924[++field1167 - 1] = field897[var4];
			}
		}
		if (var3 > field959) {
			throw new RuntimeException("");
		} else {
			field959 = 0;
			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = field897[var4];
				class373 var6 = field958[var5];
				int var7 = var1.method2488(1);
				if (var7 == 0) {
					field897[++field959 - 1] = var5;
					var6.field307 = field1201;
				} else {
					int var8 = var1.method2488(2);
					if (var8 == 0) {
						field897[++field959 - 1] = var5;
						var6.field307 = field1201;
						field1109[++field1012 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							field897[++field959 - 1] = var5;
							var6.field307 = field1201;
							var9 = var1.method2488(3);
							var6.method1975(var9, class343.field2607);
							var10 = var1.method2488(1);
							if (var10 == 1) {
								field1109[++field1012 - 1] = var5;
							}
						} else if (var8 == 2) {
							field897[++field959 - 1] = var5;
							var6.field307 = field1201;
							if (var1.method2488(1) == 1) {
								var9 = var1.method2488(3);
								var6.method1975(var9, class343.field2604);
								var10 = var1.method2488(3);
								var6.method1975(var10, class343.field2604);
							} else {
								var9 = var1.method2488(3);
								var6.method1975(var9, class343.field2603);
							}
							var9 = var1.method2488(1);
							if (var9 == 1) {
								field1109[++field1012 - 1] = var5;
							}
						} else if (var8 == 3) {
							field924[++field1167 - 1] = var5;
						}
					}
				}
			}
			method571(var0, var1);
			method504(var1);
			for (var3 = 0; var3 < field1167; ++var3) {
				var4 = field924[var3];
				if (field958[var4].field307 != field1201) {
					field958[var4].field3019 = null;
					field958[var4] = null;
				}
			}
			if (var1.field1832 != field963.field1606) {
				throw new RuntimeException(var1.field1832 + class74.field736 + field963.field1606);
			} else {
				for (var3 = 0; var3 < field959; ++var3) {
					if (null == field958[field897[var3]]) {
						throw new RuntimeException(var3 + class74.field736 + field959);
					}
				}
			}
		}
	}

	static final void method571(boolean var0, class515 var1) {
		while (true) {
			boolean var3 = true;
			int var4 = 65536;
			if (var1.method2489(field963.field1606) >= 28) {
				int var5 = var1.method2488(16);
				if (var5 != 65535) {
					boolean var6 = false;
					if (null == field958[var5]) {
						field958[var5] = new class373();
						var6 = true;
					}
					class373 var7 = field958[var5];
					field897[++field959 - 1] = var5;
					var7.field307 = field1201;
					int var9;
					if (var0) {
						var9 = var1.method2488(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method2488(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}
					boolean var11 = var1.method2488(1) == 1;
					if (var11) {
						var1.method2488(32);
					}
					int var8 = var1.method2488(1);
					int var12 = field1079[var1.method2488(3)];
					if (var6) {
						var7.field283 = var7.field244 = var12;
					}
					var7.field3019 = class314.method1695(var1.method2488(14));
					int var13 = var1.method2488(1);
					if (var13 == 1) {
						field1109[++field1012 - 1] = var5;
					}
					int var10;
					if (var0) {
						var10 = var1.method2488(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method2488(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}
					method536(var7);
					if (var7.field311 == 0) {
						var7.field244 = 0;
					}
					var7.method1976(class431.field3378.field317[0] + var9, class431.field3378.field314[0] + var10, var8 == 1);
					continue;
				}
			}
			var1.method2491();
			return;
		}
	}

	static final void method504(class515 var0) {
		for (int var2 = 0; var2 < field1012; ++var2) {
			int var3 = field1109[var2];
			class373 var4 = field958[var3];
			int var5 = var0.method1096();
			int var6;
			if ((var5 & 8) != 0) {
				var6 = var0.method1096();
				var5 += var6 << 8;
			}
			if ((var5 & 2048) != 0) {
				var6 = var0.method1096();
				var5 += var6 << 16;
			}
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			if ((var5 & 128) != 0) {
				var6 = var0.method1156();
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var0.method1143();
						if (var8 == 32767) {
							var8 = var0.method1143();
							var10 = var0.method1143();
							var9 = var0.method1143();
							var11 = var0.method1143();
						} else if (var8 != 32766) {
							var10 = var0.method1143();
						} else {
							var8 = -1;
						}
						var12 = var0.method1143();
						var4.method223(var8, var10, var9, var11, field1201, var12);
					}
				}
				var7 = var0.method1118();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var0.method1143();
						var10 = var0.method1143();
						if (var10 != 32767) {
							var11 = var0.method1143();
							var12 = var0.method1156();
							int var13 = var10 > 0 ? var0.method1156() : var12;
							var4.method219(var9, field1201, var10, var11, var12, var13);
						} else {
							var4.method224(var9);
						}
					}
				}
			}
			int[] var14;
			short[] var15;
			short[] var16;
			long var17;
			boolean var18;
			if ((var5 & 512) != 0) {
				var6 = var0.method1096();
				if ((var6 & 1) == 1) {
					var4.method1980();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method1117();
						var14 = new int[var8];
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method1125();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}
					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (null != var4.field3019.field2458) {
							var9 = var4.field3019.field2458.length;
						}
						var15 = new short[var9];
						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short) var0.method1124();
						}
					}
					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (null != var4.field3019.field2454) {
							var10 = var4.field3019.field2454.length;
						}
						var16 = new short[var10];
						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short) var0.method1124();
						}
					}
					var18 = false;
					if ((var6 & 16) != 0) {
						var18 = var0.method1118() == 1;
					}
					var17 = (long) (++class373.field3025 - 1);
					var4.method1985(new class22(var17, var14, var15, var16, var18));
				}
			}
			if ((var5 & 32) != 0) {
				var6 = var0.method1124();
				var7 = var0.method1145();
				var4.field282 = var0.method1156() == 1;
				if (field1080 >= 212) {
					var4.field280 = var6;
					var4.field281 = var7;
				} else {
					var8 = var4.field272 - 64 * (var6 - class346.field2624 - class346.field2624);
					var9 = var4.field243 - (var7 - class211.field1922 - class211.field1922) * 64;
					if (var8 != 0 || var9 != 0) {
						var11 = (int) (Math.atan2((double) var8, (double) var9) * 325.94932345220167D) & 2047;
						var4.field279 = var11;
					}
				}
			}
			if ((var5 & 64) != 0) {
				var6 = var0.method1145();
				if (var6 == 65535) {
					var6 = -1;
				}
				var7 = var0.method1118();
				if (var4.field287 == var6 && var6 != -1) {
					var8 = class67.method308(var6).field716;
					if (var8 == 1) {
						var4.field288 = 0;
						var4.field289 = 0;
						var4.field304 = var7;
						var4.field269 = 0;
					}
					if (var8 == 2) {
						var4.field269 = 0;
					}
				} else if (var6 == -1 || var4.field287 == -1 || class67.method308(var6).field709 >= class67.method308(var4.field287).field709) {
					var4.field287 = var6;
					var4.field288 = 0;
					var4.field289 = 0;
					var4.field304 = var7;
					var4.field269 = 0;
					var4.field306 = var4.field290;
				}
			}
			if ((var5 & 131072) != 0) {
				var6 = var0.method1156();
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var0.method1118();
					var9 = var0.method1125();
					var10 = var0.method1141();
					var4.method220(var8, var9, var10 >> 16, var10 & 65535);
				}
			}
			if ((var5 & 4) != 0) {
				var4.field3019 = class314.method1695(var0.method1145());
				method536(var4);
				var4.method1979();
			}
			if ((var5 & 16) != 0) {
				var4.field277 = var0.method1123();
				var4.field277 += var0.method1118() << 16;
				var6 = 16777215;
				if (16777215 == var4.field277) {
					var4.field277 = -1;
				}
			}
			if ((var5 & 4096) != 0) {
				var4.field294 = var0.method1120();
				var4.field296 = var0.method1120();
				var4.field292 = var0.method1119();
				var4.field262 = var0.method1111();
				var4.field298 = var0.method1123() + field1201;
				var4.field299 = var0.method1145() + field1201;
				var4.field300 = var0.method1125();
				var4.field290 = 1;
				var4.field306 = 0;
				var4.field294 += var4.field317[0];
				var4.field296 += var4.field314[0];
				var4.field292 += var4.field317[0];
				var4.field262 += var4.field314[0];
			}
			if ((var5 & 65536) != 0) {
				var6 = var0.method1136();
				var4.field249 = (var6 & 1) != 0 ? var0.method1125() : 1686120851 * var4.field3019.field2444 * -1670226789;
				var4.field310 = (var6 & 2) != 0 ? var0.method1124() : 821598169 * var4.field3019.field2445 * -1405323159;
				var4.field251 = (var6 & 4) != 0 ? var0.method1123() : var4.field3019.field2460;
				var4.field252 = (var6 & 8) != 0 ? var0.method1125() : 129510829 * var4.field3019.field2447 * 1271381541;
				var4.field253 = (var6 & 16) != 0 ? var0.method1124() : -1909691015 * var4.field3019.field2448 * 799501513;
				var4.field301 = (var6 & 32) != 0 ? var0.method1124() : var4.field3019.field2449;
				var4.field312 = (var6 & 64) != 0 ? var0.method1125() : -1380991387 * var4.field3019.field2450 * -725499027;
				var4.field256 = (var6 & 128) != 0 ? var0.method1125() : var4.field3019.field2451;
				var4.field297 = (var6 & 256) != 0 ? var0.method1123() : var4.field3019.field2452;
				var4.field258 = (var6 & 512) != 0 ? var0.method1125() : var4.field3019.field2477;
				var4.field259 = (var6 & 1024) != 0 ? var0.method1123() : var4.field3019.field2446;
				var4.field260 = (var6 & 2048) != 0 ? var0.method1125() : -2089336141 * var4.field3019.field2455 * -1708442501;
				var4.field261 = (var6 & 4096) != 0 ? var0.method1123() : 2098030227 * var4.field3019.field2461 * -1815894117;
				var4.field291 = (var6 & 8192) != 0 ? var0.method1124() : var4.field3019.field2478;
				var4.field248 = (var6 & 16384) != 0 ? var0.method1123() : var4.field3019.field2443;
			}
			if ((var5 & 262144) != 0) {
				var6 = var0.method1096();
				var14 = new int[8];
				var15 = new short[8];
				for (var9 = 0; var9 < 8; ++var9) {
					if ((var6 & 1 << var9) != 0) {
						var14[var9] = var0.method1144();
						var15[var9] = (short) var0.method1108();
					} else {
						var14[var9] = -1;
						var15[var9] = -1;
					}
				}
				var4.method1978(var14, var15);
			}
			if ((var5 & 32768) != 0) {
				var4.method1971(var0.method1104());
			}
			if ((var5 & 2) != 0) {
				var0.method1145();
				var0.method1100();
			}
			if ((var5 & 1) != 0) {
				var4.field313 = var0.method1104();
				var4.field266 = 100;
			}
			if ((var5 & 8192) != 0) {
				var4.field303 = field1201 + var0.method1145();
				var4.field245 = field1201 + var0.method1145();
				var4.field305 = var0.method1119();
				var4.field263 = var0.method1119();
				var4.field257 = var0.method1119();
				var4.field295 = (byte) var0.method1096();
			}
			if ((var5 & 256) != 0) {
				var6 = var0.method1117();
				if ((var6 & 1) == 1) {
					var4.method1983();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method1117();
						var14 = new int[var8];
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method1124();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}
					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.field3019.field2458 != null) {
							var9 = var4.field3019.field2458.length;
						}
						var15 = new short[var9];
						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short) var0.method1124();
						}
					}
					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.field3019.field2454 != null) {
							var10 = var4.field3019.field2454.length;
						}
						var16 = new short[var10];
						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short) var0.method1123();
						}
					}
					var18 = false;
					if ((var6 & 16) != 0) {
						var18 = var0.method1118() == 1;
					}
					var17 = (long) (++class373.field3018 - 1);
					var4.method1982(new class22(var17, var14, var15, var16, var18));
				}
			}
			if ((var5 & 16384) != 0) {
				var4.method1972(var0.method1117());
			}
			if ((var5 & 1024) != 0) {
				var4.field318 = var0.method1100();
			}
		}
	}

	static void method536(class373 var0) {
		var0.field246 = var0.field3019.field2440;
		var0.field311 = var0.field3019.field2469;
		var0.field251 = var0.field3019.field2460;
		var0.field252 = var0.field3019.field2447;
		var0.field253 = var0.field3019.field2448;
		var0.field301 = var0.field3019.field2449;
		var0.field248 = var0.field3019.field2443;
		var0.field249 = var0.field3019.field2444;
		var0.field310 = var0.field3019.field2445;
		var0.field312 = var0.field3019.field2450;
		var0.field256 = var0.field3019.field2451;
		var0.field297 = var0.field3019.field2452;
		var0.field258 = var0.field3019.field2477;
		var0.field259 = var0.field3019.field2446;
		var0.field260 = var0.field3019.field2455;
		var0.field261 = var0.field3019.field2461;
		var0.field291 = var0.field3019.field2478;
	}

	static class321 method560(int var0, int var1) {
		field1198.field2511 = var0;
		field1198.field2510 = var1;
		field1198.field2512 = 1;
		field1198.field2513 = 1;
		return field1198;
	}

	static void method545() {
		field1047 = 0;
		field1011 = false;
	}

	static void method572() {
		method545();
		field1053[0] = class55.field562;
		field1172[0] = "";
		field1091[0] = 1006;
		field1055[0] = false;
		field1047 = 1;
	}

	static final boolean method594() {
		return field1011;
	}

	static final void method442(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < field1069; ++var5) {
			if (field1125[var5] + field1123[var5] > 10 && field1123[var5] < var2 + 10 && field1126[var5] + field1124[var5] > 10 && field1124[var5] < var3 + 10) {
				field1121[var5] = true;
			}
		}
	}

	static final boolean method466(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = field1091[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}
			return var2 == 1007;
		}
	}

	static final void method592(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}
		class373 var10;
		class457 var11;
		if (var2 == 9) {
			var10 = field958[var3];
			if (null != var10) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3879, field963.field1603);
				var11.field3487.method1116(field1046.method2323(82) ? 1 : 0);
				var11.field3487.method1148(var3);
				field963.method911(var11);
			}
		}
		if (var2 == 12) {
			var10 = field958[var3];
			if (var10 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3849, field963.field1603);
				var11.field3487.method1116(field1046.method2323(82) ? 1 : 0);
				var11.field3487.method1126(var3);
				field963.method911(var11);
			}
		}
		class82 var13;
		if (var2 == 45) {
			var13 = field1071[var3];
			if (null != var13) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3841, field963.field1603);
				var11.field3487.method1121(var3);
				var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 47) {
			var13 = field1071[var3];
			if (var13 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3856, field963.field1603);
				var11.field3487.method1148(var3);
				var11.field3487.method1158(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		class354 var14;
		if (var2 == 57 || var2 == 1007) {
			var14 = class354.method1857(var1, var0);
			if (null != var14) {
				method461(var3, var1, var0, var4, var6);
			}
		}
		class457 var15;
		if (var2 == 19) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3840, field963.field1603);
			var15.field3487.method1126(var1 + class211.field1922);
			var15.field3487.method1121(class346.field2624 + var0);
			var15.field3487.method1116(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1154(var3);
			field963.method911(var15);
		}
		if (var2 == 1) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3808, field963.field1603);
			var15.field3487.method1148(class81.field804);
			var15.field3487.method1151(class149.field1575);
			var15.field3487.method1126(class277.field2267);
			var15.field3487.method1121(var3);
			var15.field3487.method1148(var1 + class211.field1922);
			var15.field3487.method1148(class346.field2624 + var0);
			var15.field3487.method1085(field1046.method2323(82) ? 1 : 0);
			field963.method911(var15);
		}
		if (var2 == 13) {
			var10 = field958[var3];
			if (var10 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3835, field963.field1603);
				var11.field3487.method1132(field1046.method2323(82) ? 1 : 0);
				var11.field3487.method1154(var3);
				field963.method911(var11);
			}
		}
		if (var2 == 14) {
			var13 = field1071[var3];
			if (var13 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3801, field963.field1603);
				var11.field3487.method1105(class149.field1575);
				var11.field3487.method1148(class81.field804);
				var11.field3487.method1148(class277.field2267);
				var11.field3487.method1148(var3);
				var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 1002) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			var15 = class457.method2237(class483.field3854, field963.field1603);
			var15.field3487.method1121(var3);
			field963.method911(var15);
		}
		if (var2 == 10) {
			var10 = field958[var3];
			if (null != var10) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3843, field963.field1603);
				var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				var11.field3487.method1154(var3);
				field963.method911(var11);
			}
		}
		if (var2 == 1001) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3826, field963.field1603);
			var15.field3487.method1121(class211.field1922 + var1);
			var15.field3487.method1154(class346.field2624 + var0);
			var15.field3487.method1085(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1148(var3);
			field963.method911(var15);
		}
		if (var2 == 26) {
			method549();
		}
		if (var2 == 8) {
			var10 = field958[var3];
			if (null != var10) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3868, field963.field1603);
				var11.field3487.method1132(field1046.method2323(82) ? 1 : 0);
				var11.field3487.method1148(var3);
				var11.field3487.method1154(field1032);
				var11.field3487.method1134(class393.field3126);
				var11.field3487.method1121(field1066);
				field963.method911(var11);
			}
		}
		if (var2 == 18) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3818, field963.field1603);
			var15.field3487.method1148(var3);
			var15.field3487.method1121(class346.field2624 + var0);
			var15.field3487.method1116(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1126(var1 + class211.field1922);
			field963.method911(var15);
		}
		if (var2 == 23) {
			if (field1011) {
				class377.field3061.method1962();
			} else {
				class377.field3061.method1941(class121.field1436, var0, var1, true);
			}
		}
		class457 var12;
		if (var2 == 24) {
			var14 = class354.method1860(var1);
			if (var14 != null) {
				boolean var17 = true;
				if (var14.field2714 > 0) {
					var17 = class166.method975(var14);
				}
				if (var17) {
					var12 = class457.method2237(class483.field3805, field963.field1603);
					var12.field3487.method1151(var1);
					field963.method911(var12);
				}
			}
		}
		if (var2 == 11) {
			var10 = field958[var3];
			if (null != var10) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3871, field963.field1603);
				var11.field3487.method1121(var3);
				var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 49) {
			var13 = field1071[var3];
			if (null != var13) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3838, field963.field1603);
				var11.field3487.method1148(var3);
				var11.field3487.method1132(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 16) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3844, field963.field1603);
			var15.field3487.method1121(class81.field804);
			var15.field3487.method1154(var3);
			var15.field3487.method1085(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1148(class277.field2267);
			var15.field3487.method1154(class346.field2624 + var0);
			var15.field3487.method1148(class211.field1922 + var1);
			var15.field3487.method1133(class149.field1575);
			field963.method911(var15);
		}
		if (var2 == 2) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3852, field963.field1603);
			var15.field3487.method1121(var3);
			var15.field3487.method1148(var0 + class346.field2624);
			var15.field3487.method1126(class211.field1922 + var1);
			var15.field3487.method1121(field1066);
			var15.field3487.method1132(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1121(field1032);
			var15.field3487.method1105(class393.field3126);
			field963.method911(var15);
		}
		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class26.field125.method1669(var2, var3, new class402(var0), new class402(var1));
		}
		if (var2 == 6) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3863, field963.field1603);
			var15.field3487.method1085(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1148(var1 + class211.field1922);
			var15.field3487.method1126(var3);
			var15.field3487.method1154(class346.field2624 + var0);
			field963.method911(var15);
		}
		if (var2 == 21) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3834, field963.field1603);
			var15.field3487.method1085(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1154(class346.field2624 + var0);
			var15.field3487.method1148(class211.field1922 + var1);
			var15.field3487.method1154(var3);
			field963.method911(var15);
		}
		if (var2 == 30 && field1075 == null) {
			method598(var1, var0);
			field1075 = class354.method1857(var1, var0);
			method532(field1075);
		}
		if (var2 == 15) {
			var13 = field1071[var3];
			if (var13 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3848, field963.field1603);
				var11.field3487.method1121(field1066);
				var11.field3487.method1154(field1032);
				var11.field3487.method1134(class393.field3126);
				var11.field3487.method1154(var3);
				var11.field3487.method1116(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		int var16;
		class354 var18;
		if (var2 == 28) {
			var15 = class457.method2237(class483.field3805, field963.field1603);
			var15.field3487.method1151(var1);
			field963.method911(var15);
			var18 = class354.method1860(var1);
			if (null != var18 && null != var18.field2752 && var18.field2752[0][0] == 5) {
				var16 = var18.field2752[0][1];
				class410.field3198[var16] = 1 - class410.field3198[var16];
				method554(var16);
			}
		}
		if (var2 == 48) {
			var13 = field1071[var3];
			if (null != var13) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3803, field963.field1603);
				var11.field3487.method1148(var3);
				var11.field3487.method1132(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 4) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3793, field963.field1603);
			var15.field3487.method1126(class346.field2624 + var0);
			var15.field3487.method1126(class211.field1922 + var1);
			var15.field3487.method1154(var3);
			var15.field3487.method1158(field1046.method2323(82) ? 1 : 0);
			field963.method911(var15);
		}
		if (var2 == 29) {
			var15 = class457.method2237(class483.field3805, field963.field1603);
			var15.field3487.method1151(var1);
			field963.method911(var15);
			var18 = class354.method1860(var1);
			if (null != var18 && var18.field2752 != null && var18.field2752[0][0] == 5) {
				var16 = var18.field2752[0][1];
				if (var18.field2811[0] != class410.field3198[var16]) {
					class410.field3198[var16] = var18.field2811[0];
					method554(var16);
				}
			}
		}
		if (var2 == 1003) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			var10 = field958[var3];
			if (null != var10) {
				class314 var19 = var10.field3019;
				if (null != var19.field2467) {
					var19 = var19.method1685();
				}
				if (null != var19) {
					var12 = class457.method2237(class483.field3855, field963.field1603);
					var12.field3487.method1148(var19.field2438);
					field963.method911(var12);
				}
			}
		}
		if (var2 == 44) {
			var13 = field1071[var3];
			if (null != var13) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3800, field963.field1603);
				var11.field3487.method1121(var3);
				var11.field3487.method1132(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 1004) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			var15 = class457.method2237(class483.field3833, field963.field1603);
			var15.field3487.method1126(class346.field2624 + var0);
			var15.field3487.method1121(var3);
			var15.field3487.method1154(class211.field1922 + var1);
			field963.method911(var15);
		}
		if (var2 == 46) {
			var13 = field1071[var3];
			if (var13 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3853, field963.field1603);
				var11.field3487.method1154(var3);
				var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 22) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3861, field963.field1603);
			var15.field3487.method1121(var0 + class346.field2624);
			var15.field3487.method1126(var1 + class211.field1922);
			var15.field3487.method1116(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1126(var3);
			field963.method911(var15);
		}
		if (var2 == 58) {
			var14 = class354.method1857(var1, var0);
			if (var14 != null) {
				if (null != var14.field2792) {
					class165 var20 = new class165();
					var20.field1664 = var14;
					var20.field1669 = var3;
					var20.field1673 = var6;
					var20.field1667 = var14.field2792;
					class221.method1344(var20);
				}
				var11 = class457.method2237(class483.field3804, field963.field1603);
				var11.field3487.method1148(field1032);
				var11.field3487.method1126(var0);
				var11.field3487.method1121(field1066);
				var11.field3487.method1126(var4);
				var11.field3487.method1134(class393.field3126);
				var11.field3487.method1133(var1);
				field963.method911(var11);
			}
		}
		if (var2 == 5) {
			field1018 = var7;
			field1019 = var8;
			field1135 = 2;
			field1077 = 0;
			field1149 = var0;
			field1072 = var1;
			var15 = class457.method2237(class483.field3829, field963.field1603);
			var15.field3487.method1126(var3);
			var15.field3487.method1121(class346.field2624 + var0);
			var15.field3487.method1116(field1046.method2323(82) ? 1 : 0);
			var15.field3487.method1126(class211.field1922 + var1);
			field963.method911(var15);
		}
		if (var2 == 50) {
			var13 = field1071[var3];
			if (var13 != null) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var11 = class457.method2237(class483.field3889, field963.field1603);
				var11.field3487.method1154(var3);
				var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				field963.method911(var11);
			}
		}
		if (var2 == 25) {
			var14 = class354.method1857(var1, var0);
			if (null != var14) {
				class207.method1256();
				method566(var1, var0, class313.method1677(method528(var14)), var4);
				field1063 = 0;
				field1081 = method558(var14);
				if (null == field1081) {
					field1081 = class55.field629;
				}
				if (var14.field2768) {
					field1092 = var14.field2692 + class74.method314(16777215);
				} else {
					field1092 = class74.method314(65280) + var14.field2796 + class74.method314(16777215);
				}
			}
		} else {
			if (var2 == 17) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var15 = class457.method2237(class483.field3882, field963.field1603);
				var15.field3487.method1154(var0 + class346.field2624);
				var15.field3487.method1116(field1046.method2323(82) ? 1 : 0);
				var15.field3487.method1148(field1032);
				var15.field3487.method1121(field1066);
				var15.field3487.method1134(class393.field3126);
				var15.field3487.method1148(var1 + class211.field1922);
				var15.field3487.method1148(var3);
				field963.method911(var15);
			}
			if (var2 == 20) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var15 = class457.method2237(class483.field3824, field963.field1603);
				var15.field3487.method1154(var1 + class211.field1922);
				var15.field3487.method1116(field1046.method2323(82) ? 1 : 0);
				var15.field3487.method1121(var3);
				var15.field3487.method1154(var0 + class346.field2624);
				field963.method911(var15);
			}
			if (var2 == 3) {
				field1018 = var7;
				field1019 = var8;
				field1135 = 2;
				field1077 = 0;
				field1149 = var0;
				field1072 = var1;
				var15 = class457.method2237(class483.field3869, field963.field1603);
				var15.field3487.method1126(class346.field2624 + var0);
				var15.field3487.method1154(class211.field1922 + var1);
				var15.field3487.method1085(field1046.method2323(82) ? 1 : 0);
				var15.field3487.method1121(var3);
				field963.method911(var15);
			}
			if (var2 == 51) {
				var13 = field1071[var3];
				if (var13 != null) {
					field1018 = var7;
					field1019 = var8;
					field1135 = 2;
					field1077 = 0;
					field1149 = var0;
					field1072 = var1;
					var11 = class457.method2237(class483.field3885, field963.field1603);
					var11.field3487.method1085(field1046.method2323(82) ? 1 : 0);
					var11.field3487.method1148(var3);
					field963.method911(var11);
				}
			}
			if (var2 == 7) {
				var10 = field958[var3];
				if (null != var10) {
					field1018 = var7;
					field1019 = var8;
					field1135 = 2;
					field1077 = 0;
					field1149 = var0;
					field1072 = var1;
					var11 = class457.method2237(class483.field3859, field963.field1603);
					var11.field3487.method1154(class277.field2267);
					var11.field3487.method1154(class81.field804);
					var11.field3487.method1105(class149.field1575);
					var11.field3487.method1154(var3);
					var11.field3487.method1116(field1046.method2323(82) ? 1 : 0);
					field963.method911(var11);
				}
			}
			if (field1063 != 0) {
				field1063 = 0;
				method532(class354.method1860(class149.field1575));
			}
			if (field990) {
				class207.method1256();
			}
		}
	}

	static void method566(int var0, int var1, int var2, int var3) {
		class354 var5 = class354.method1857(var0, var1);
		if (var5 != null && null != var5.field2782) {
			class165 var6 = new class165();
			var6.field1664 = var5;
			var6.field1667 = var5.field2782;
			class221.method1344(var6);
		}
		field1032 = var3;
		field990 = true;
		class393.field3126 = var0;
		field1066 = var1;
		class26.field127 = var2;
		method532(var5);
	}

	static void method598(int var0, int var1) {
		class457 var3 = class457.method2237(class483.field3846, field963.field1603);
		var3.field3487.method1105(var0);
		var3.field3487.method1154(var1);
		field963.method911(var3);
	}

	static void method461(int var0, int var1, int var2, int var3, String var4) {
		class354 var6 = class354.method1857(var1, var2);
		if (null != var6) {
			if (var6.field2791 != null) {
				class165 var7 = new class165();
				var7.field1664 = var6;
				var7.field1669 = var0;
				var7.field1673 = var4;
				var7.field1667 = var6.field2791;
				class221.method1344(var7);
			}
			boolean var12 = true;
			if (var6.field2714 > 0) {
				var12 = class166.method975(var6);
			}
			if (var12) {
				int var9 = method528(var6);
				int var10 = var0 - 1;
				boolean var8 = (var9 >> var10 + 1 & 1) != 0;
				if (var8) {
					class457 var11;
					if (var0 == 1) {
						var11 = class457.method2237(class483.field3816, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 2) {
						var11 = class457.method2237(class483.field3806, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 3) {
						var11 = class457.method2237(class483.field3858, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 4) {
						var11 = class457.method2237(class483.field3823, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 5) {
						var11 = class457.method2237(class483.field3839, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 6) {
						var11 = class457.method2237(class483.field3795, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 7) {
						var11 = class457.method2237(class483.field3837, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 8) {
						var11 = class457.method2237(class483.field3791, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 9) {
						var11 = class457.method2237(class483.field3866, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
					if (var0 == 10) {
						var11 = class457.method2237(class483.field3822, field963.field1603);
						var11.field3487.method1151(var1);
						var11.field3487.method1126(var2);
						var11.field3487.method1126(var3);
						field963.method911(var11);
					}
				}
			}
		}
	}

	public static final void method581(String var0, String var1, int var2, int var3, int var4, int var5) {
		method486(var0, var1, var2, var3, var4, var5, -1, false);
	}

	static final void method486(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!field1011) {
			if (field1047 < 500) {
				field1053[field1047] = var0;
				field1172[field1047] = var1;
				field1091[field1047] = var2;
				field1051[field1047] = var3;
				field1048[field1047] = var4;
				field1049[field1047] = var5;
				field1052[field1047] = var6;
				field1055[field1047] = var7;
				++field1047;
			}
		}
	}

	static String method518(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return field1172[var0].length() > 0 ? field1053[var0] + class55.field367 + field1172[var0] : field1053[var0];
		}
	}

	static final void method502(int var0, int var1, int var2, int var3) {
		if (field1063 == 0 && !field990) {
			method581(class55.field488, "", 23, 0, var0 - var2, var1 - var3);
		}
		long var5 = -1L;
		long var7 = -1L;
		int var9 = 0;
		while (true) {
			int var11 = class424.field3281;
			if (var9 >= var11) {
				if (var5 != -1L) {
					var9 = (int) (var5 >>> 0 & 127L);
					var11 = (int) (var5 >>> 7 & 127L);
					class82 var13 = field1071[field1037];
					method537(var13, field1037, var9, var11);
				}
				return;
			}
			long var12 = class424.method2133(var9);
			if (var7 != var12) {
				label306: {
					var7 = var12;
					int var14 = class424.method2127(var9);
					int var15 = class424.method2126(var9);
					int var16 = class424.method2131(class424.field3283[var9]);
					int var18 = class424.method2132(class424.field3283[var9]);
					int var19 = var18;
					int var23;
					if (var16 == 2 && class377.field3061.method1934(class121.field1436, var14, var15, var12) >= 0) {
						class362 var20 = class319.method1705(var18, (byte) -22);
						if (var20.field2909 != null) {
							var20 = var20.method1893();
						}
						if (var20 == null) {
							break label306;
						}
						class39 var21 = null;
						for (class39 var22 = (class39) field1039.method2218(); null != var22; var22 = (class39) field1039.method2220()) {
							if (class121.field1436 == var22.field200 && var22.field193 == var14 && var22.field199 == var15 && var22.field192 == var19) {
								var21 = var22;
								break;
							}
						}
						if (field1063 == 1) {
							method581(class55.field483, field1064 + " " + class74.field737 + " " + class74.method314(65535) + var20.field2878, 1, var19, var14, var15);
						} else if (field990) {
							if ((class26.field127 & 4) == 4) {
								method581(field1081, field1092 + " " + class74.field737 + " " + class74.method314(65535) + var20.field2878, 2, var19, var14, var15);
							}
						} else {
							String[] var30 = var20.field2887;
							if (null != var30) {
								for (var23 = 4; var23 >= 0; --var23) {
									if ((var21 == null || var21.method170(var23)) && null != var30[var23]) {
										short var24 = 0;
										if (var23 == 0) {
											var24 = 3;
										}
										if (var23 == 1) {
											var24 = 4;
										}
										if (var23 == 2) {
											var24 = 5;
										}
										if (var23 == 3) {
											var24 = 6;
										}
										if (var23 == 4) {
											var24 = 1001;
										}
										method581(var30[var23], class74.method314(65535) + var20.field2878, var24, var19, var14, var15);
									}
								}
							}
							method581(class55.field484, class74.method314(65535) + var20.field2878, 1002, var20.field2875, var14, var15);
						}
					}
					int var29;
					class373 var31;
					int[] var32;
					class82 var36;
					if (var16 == 1) {
						class373 var26 = field958[var19];
						if (var26 == null) {
							break label306;
						}
						if (var26.field3019.field2440 == 1 && (var26.field272 & 127) == 64 && (var26.field243 & 127) == 64) {
							for (var29 = 0; var29 < field959; ++var29) {
								var31 = field958[field897[var29]];
								if (null != var31 && var26 != var31 && var31.field3019.field2440 == 1 && var26.field272 == var31.field272 && var31.field243 == var26.field243) {
									method550(var31, field897[var29], var14, var15);
								}
							}
							var29 = class274.field2240;
							var32 = class274.field2241;
							for (var23 = 0; var23 < var29; ++var23) {
								var36 = field1071[var32[var23]];
								if (var36 != null && var26.field272 == var36.field272 && var36.field243 == var26.field243) {
									method537(var36, var32[var23], var14, var15);
								}
							}
						}
						method550(var26, var19, var14, var15);
					}
					if (var16 == 0) {
						class82 var27 = field1071[var19];
						if (var27 == null) {
							break label306;
						}
						if ((var27.field272 & 127) == 64 && (var27.field243 & 127) == 64) {
							for (var29 = 0; var29 < field959; ++var29) {
								var31 = field958[field897[var29]];
								if (null != var31 && var31.field3019.field2440 == 1 && var31.field272 == var27.field272 && var31.field243 == var27.field243) {
									method550(var31, field897[var29], var14, var15);
								}
							}
							var29 = class274.field2240;
							var32 = class274.field2241;
							for (var23 = 0; var23 < var29; ++var23) {
								var36 = field1071[var32[var23]];
								if (var36 != null && var27 != var36 && var27.field272 == var36.field272 && var36.field243 == var27.field243) {
									method537(var36, var32[var23], var14, var15);
								}
							}
						}
						if (field1037 != var19) {
							method537(var27, var19, var14, var15);
						} else {
							var5 = var12;
						}
					}
					if (var16 == 3) {
						class449 var28 = field1038[class121.field1436][var14][var15];
						if (null != var28) {
							for (class103 var33 = (class103) var28.method2219(); null != var33; var33 = (class103) var28.method2224()) {
								class426 var34 = class426.method2155(var33.field1275);
								if (field1063 == 1) {
									method581(class55.field483, field1064 + " " + class74.field737 + " " + class74.method314(16748608) + var34.field3313, 16, var33.field1275, var14, var15);
								} else if (field990) {
									if ((class26.field127 & 1) == 1) {
										method581(field1081, field1092 + " " + class74.field737 + " " + class74.method314(16748608) + var34.field3313, 17, var33.field1275, var14, var15);
									}
								} else {
									String[] var35 = var34.field3314;
									for (int var37 = 4; var37 >= 0; --var37) {
										if (var33.method637(var37)) {
											if (var35 != null && var35[var37] != null) {
												byte var25 = 0;
												if (var37 == 0) {
													var25 = 18;
												}
												if (var37 == 1) {
													var25 = 19;
												}
												if (var37 == 2) {
													var25 = 20;
												}
												if (var37 == 3) {
													var25 = 21;
												}
												if (var37 == 4) {
													var25 = 22;
												}
												method581(var35[var37], class74.method314(16748608) + var34.field3313, var25, var33.field1275, var14, var15);
											} else if (var37 == 2) {
												method581(class55.field482, class74.method314(16748608) + var34.field3313, 20, var33.field1275, var14, var15);
											}
										}
									}
									method581(class55.field484, class74.method314(16748608) + var34.field3313, 1004, var33.field1275, var14, var15);
								}
							}
						}
					}
				}
			}
			++var9;
		}
	}

	static final void method550(class373 var0, int var1, int var2, int var3) {
		class314 var5 = var0.field3019;
		if (field1047 < 400) {
			if (null != var5.field2467) {
				var5 = var5.method1685();
			}
			if (var5 != null) {
				if (var5.field2473) {
					if (!var5.field2475 || var1 == field933) {
						String var6 = var0.method1974();
						int var7;
						if (var5.field2463 != 0 && var0.field318 != 0) {
							var7 = var0.field318 != -1 ? var0.field318 : var5.field2463;
							var6 = var6 + class171.method994(var7, class431.field3378.field811) + " " + class74.field732 + class55.field329 + var7 + class74.field734;
						}
						if (var5.field2475 && field1056) {
							method581(class55.field484, class74.method314(16776960) + var6, 1003, var1, var2, var3);
						}
						if (field1063 == 1) {
							method581(class55.field483, field1064 + " " + class74.field737 + " " + class74.method314(16776960) + var6, 7, var1, var2, var3);
						} else if (field990) {
							if ((class26.field127 & 2) == 2) {
								method581(field1081, field1092 + " " + class74.field737 + " " + class74.method314(16776960) + var6, 8, var1, var2, var3);
							}
						} else {
							var7 = var5.field2475 && field1056 ? 2000 : 0;
							String[] var8 = var5.field2437;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method1973(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class55.field485)) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}
										if (var9 == 1) {
											var10 = var7 + 10;
										}
										if (var9 == 2) {
											var10 = var7 + 11;
										}
										if (var9 == 3) {
											var10 = var7 + 12;
										}
										if (var9 == 4) {
											var10 = var7 + 13;
										}
										method581(var8[var9], class74.method314(16776960) + var6, var10, var1, var2, var3);
									}
								}
							}
							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method1973(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class55.field485)) {
										short var11 = 0;
										if (class389.field3100 != field928) {
											if (class389.field3099 == field928 || field928 == class389.field3104 && var5.field2463 > class431.field3378.field811) {
												var11 = 2000;
											}
											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}
											if (var9 == 1) {
												var10 = var11 + 10;
											}
											if (var9 == 2) {
												var10 = var11 + 11;
											}
											if (var9 == 3) {
												var10 = var11 + 12;
											}
											if (var9 == 4) {
												var10 = var11 + 13;
											}
											method581(var8[var9], class74.method314(16776960) + var6, var10, var1, var2, var3);
										}
									}
								}
							}
							if (!var5.field2475 || !field1056) {
								method581(class55.field484, class74.method314(16776960) + var6, 1003, var1, var2, var3);
							}
						}
					}
				}
			}
		}
	}

	static final void method537(class82 var0, int var1, int var2, int var3) {
		if (class431.field3378 != var0) {
			if (field1047 < 400) {
				String var5;
				if (var0.field819 == 0) {
					var5 = var0.field809[0] + var0.field822 + var0.field809[1] + class171.method994(var0.field811, class431.field3378.field811) + " " + class74.field732 + class55.field329 + var0.field811 + class74.field734 + var0.field809[2];
				} else {
					var5 = var0.field809[0] + var0.field822 + var0.field809[1] + " " + class74.field732 + class55.field493 + var0.field819 + class74.field734 + var0.field809[2];
				}
				int var6;
				if (field1063 == 1) {
					method581(class55.field483, field1064 + " " + class74.field737 + " " + class74.method314(16777215) + var5, 14, var1, var2, var3);
				} else if (field990) {
					if ((class26.field127 & 8) == 8) {
						method581(field1081, field1092 + " " + class74.field737 + " " + class74.method314(16777215) + var5, 15, var1, var2, var3);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (null != field921[var6]) {
							short var7 = 0;
							if (field921[var6].equalsIgnoreCase(class55.field485)) {
								if (class389.field3100 == field927) {
									continue;
								}
								if (class389.field3099 == field927 || field927 == class389.field3104 && var0.field811 > class431.field3378.field811) {
									var7 = 2000;
								}
								if (class431.field3378.field832 != 0 && var0.field832 != 0) {
									if (class431.field3378.field832 == var0.field832) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (field927 == class389.field3101 && var0.method340()) {
									var7 = 2000;
								}
							} else if (field1035[var6]) {
								var7 = 2000;
							}
							boolean var8 = false;
							int var9 = var7 + field1033[var6];
							method581(field921[var6], class74.method314(16777215) + var5, var9, var1, var2, var3);
						}
					}
				}
				for (var6 = 0; var6 < field1047; ++var6) {
					if (field1091[var6] == 23) {
						field1172[var6] = class74.method314(16777215) + var5;
						break;
					}
				}
			}
		}
	}

	static final void method458(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class354.method1864(var0)) {
			class236.field2030 = null;
			method501(class457.field3488[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (null != class236.field2030) {
				method501(class236.field2030, -1412584499, var1, var2, var3, var4, class16.field86, class286.field2301, var7);
				class236.field2030 = null;
			}
		} else {
			if (var7 != -1) {
				field908[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					field908[var9] = true;
				}
			}
		}
	}

	static final void method501(class354[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class206.method1243(var2, var3, var4, var5);
		class238.method1397();
		for (int var10 = 0; var10 < var0.length; ++var10) {
			class354 var11 = var0[var10];
			if (null != var11 && (var11.field2705 == var1 || var1 == -1412584499 && field1082 == var11)) {
				int var12;
				if (var8 == -1) {
					field1123[field1069] = var11.field2689 + var6;
					field1124[field1069] = var7 + var11.field2702;
					field1125[field1069] = var11.field2703;
					field1126[field1069] = var11.field2680;
					var12 = ++field1069 - 1;
				} else {
					var12 = var8;
				}
				var11.field2827 = var12;
				var11.field2828 = field1201;
				if (!var11.field2768 || !method505(var11)) {
					if (var11.field2714 > 0) {
						method525(var11);
					}
					int var13 = var11.field2689 + var6;
					int var14 = var11.field2702 + var7;
					int var15 = var11.field2709;
					int var16;
					int var17;
					if (var11 == field1082) {
						if (var1 != -1412584499 && !var11.field2769) {
							class236.field2030 = var0;
							class16.field86 = var6;
							class286.field2301 = var7;
							continue;
						}
						if (field1093 && field1087) {
							var16 = class422.field3270;
							var17 = class422.field3253;
							var16 -= field1084;
							var17 -= field1157;
							if (var16 < field1088) {
								var16 = field1088;
							}
							if (var16 + var11.field2703 > field1088 + field1101.field2703) {
								var16 = field1101.field2703 + field1088 - var11.field2703;
							}
							if (var17 < field1089) {
								var17 = field1089;
							}
							if (var17 + var11.field2680 > field1089 + field1101.field2680) {
								var17 = field1089 + field1101.field2680 - var11.field2680;
							}
							var13 = var16;
							var14 = var17;
						}
						if (!var11.field2769) {
							var15 = 128;
						}
					}
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.field2690 == 9) {
						var20 = var13;
						var21 = var14;
						var22 = var11.field2703 + var13;
						var23 = var14 + var11.field2680;
						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}
						if (var23 < var14) {
							var21 = var23;
							var23 = var14;
						}
						++var22;
						++var23;
						var16 = var20 > var2 ? var20 : var2;
						var17 = var21 > var3 ? var21 : var3;
						var18 = var22 < var4 ? var22 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var20 = var13 + var11.field2703;
						var21 = var14 + var11.field2680;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}
					if (!var11.field2768 || var16 < var18 && var17 < var19) {
						if (var11.field2714 != 0) {
							if (var11.field2714 == 1336) {
								if (class83.field841.method1010()) {
									var14 += 15;
									class281.field2287.method2392("Fps:" + class522.field4140, var13 + var11.field2703, var14, 16776960, -1);
									var14 += 15;
									Runtime var45 = Runtime.getRuntime();
									var21 = (int) ((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !field902) {
										var22 = 16711680;
									}
									class281.field2287.method2392("Mem:" + var21 + "k", var11.field2703 + var13, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}
							if (var11.field2714 == 1337) {
								field1059 = var13;
								field1060 = var14;
								method507(var13, var14, var11.field2703, var11.field2680);
								field908[var11.field2827] = true;
								class206.method1243(var2, var3, var4, var5);
								continue;
							}
							if (var11.field2714 == 1338) {
								method451(var11, var13, var14, var12);
								class206.method1243(var2, var3, var4, var5);
								continue;
							}
							if (var11.field2714 == 1339) {
								method445(var11, var13, var14, var12);
								class206.method1243(var2, var3, var4, var5);
								continue;
							}
							if (var11.field2714 == 1400) {
								class26.field125.method1668(var13, var14, var11.field2703, var11.field2680, field1201);
							}
							if (var11.field2714 == 1401) {
								class26.field125.method1658(var13, var14, var11.field2703, var11.field2680);
							}
							if (var11.field2714 == 1402) {
								class225.field1989.method1058(var13, field1201);
							}
						}
						if (var11.field2690 == 0) {
							if (!var11.field2768 && method505(var11) && class400.field3169 != var11) {
								continue;
							}
							if (!var11.field2768) {
								if (var11.field2721 > var11.field2710 - var11.field2680) {
									var11.field2721 = var11.field2710 - var11.field2680;
								}
								if (var11.field2721 < 0) {
									var11.field2721 = 0;
								}
							}
							method501(var0, var11.field2688, var16, var17, var18, var19, var13 - var11.field2707, var14 - var11.field2721, var12);
							if (null != var11.field2820) {
								method501(var11.field2820, var11.field2688, var16, var17, var18, var19, var13 - var11.field2707, var14 - var11.field2721, var12);
							}
							class208 var29 = (class208) field919.method2582((long) var11.field2688);
							if (null != var29) {
								method458(var29.field1915, var16, var17, var18, var19, var13, var14, var12);
							}
							class206.method1243(var2, var3, var4, var5);
							class238.method1397();
						} else if (var11.field2690 == 11) {
							if (method505(var11) && var11 != class400.field3169) {
								continue;
							}
							if (var11.field2820 != null) {
								method501(var11.field2820, var11.field2688, var16, var17, var18, var19, var13 - var11.field2707, var14 - var11.field2721, var12);
							}
							class206.method1243(var2, var3, var4, var5);
							class238.method1397();
						}
						if (field1129 || field1122[var12] || field1127 > 1) {
							if (var11.field2690 == 0 && !var11.field2768 && var11.field2710 > var11.field2680) {
								method517(var13 + var11.field2703, var14, var11.field2721, var11.field2680, var11.field2710);
							}
							if (var11.field2690 != 1) {
								if (var11.field2690 == 3) {
									if (method455(var11)) {
										var20 = var11.field2712;
										if (var11 == class400.field3169 && var11.field2758 != 0) {
											var20 = var11.field2758;
										}
									} else {
										var20 = var11.field2711;
										if (class400.field3169 == var11 && var11.field2715 != 0) {
											var20 = var11.field2715;
										}
									}
									if (var11.field2750) {
										switch(var11.field2716.field1280) {
											case 1:
												class206.method1237(var13, var14, var11.field2703, var11.field2680, var11.field2711, var11.field2712);
												break;
											case 2:
												class206.method1250(var13, var14, var11.field2703, var11.field2680, var11.field2711, var11.field2712, 255 - (var11.field2709 & 255), 255 - (var11.field2718 & 255));
												break;
											default:
												if (var15 == 0) {
													class206.method1236(var13, var14, var11.field2703, var11.field2680, var20);
												} else {
													class206.method1235(var13, var14, var11.field2703, var11.field2680, var20, 256 - (var15 & 255));
												}
										}
									} else if (var15 == 0) {
										class206.method1239(var13, var14, var11.field2703, var11.field2680, var20);
									} else {
										class206.method1240(var13, var14, var11.field2703, var11.field2680, var20, 256 - (var15 & 255));
									}
								} else if (var11.field2690 == 4) {
									class61 var37 = var11.method1825();
									if (var37 == null) {
										if (class354.field2687) {
											method532(var11);
										}
									} else {
										String var44 = var11.field2748;
										if (method455(var11)) {
											var21 = var11.field2712;
											if (var11 == class400.field3169 && var11.field2758 != 0) {
												var21 = var11.field2758;
											}
											if (var11.field2676.length() > 0) {
												var44 = var11.field2676;
											}
										} else {
											var21 = var11.field2711;
											if (class400.field3169 == var11 && var11.field2715 != 0) {
												var21 = var11.field2715;
											}
										}
										if (var11.field2768 && var11.field2816 != -1) {
											class426 var46 = class426.method2155(var11.field2816);
											var44 = var46.field3313;
											if (null == var44) {
												var44 = class55.field629;
											}
											if ((var46.field3308 == 1 || var11.field2817 != 1) && var11.field2817 != -1) {
												var44 = class74.method314(16748608) + var44 + class74.field739 + " " + 'x' + method548(var11.field2817);
											}
										}
										if (field1075 == var11) {
											var44 = class55.field591;
											var21 = var11.field2711;
										}
										if (!var11.field2768) {
											var44 = method555(var44, var11);
										}
										var37.method2394(var44, var13, var14, var11.field2703, var11.field2680, var21, var11.field2678 ? 0 : -1, class320.method1708(var11.field2709), var11.field2751, var11.field2809, var11.field2784);
									}
								} else {
									int var25;
									int var26;
									int var41;
									if (var11.field2690 == 5) {
										class84 var35;
										if (!var11.field2768) {
											var35 = var11.method1846(method455(var11), class28.field142);
											if (null != var35) {
												var35.method380(var13, var14);
											} else if (class354.field2687) {
												method532(var11);
											}
										} else {
											if (var11.field2816 != -1) {
												var35 = class426.method2153(var11.field2816, var11.field2817, var11.field2726, var11.field2727, var11.field2747, false);
											} else {
												var35 = var11.method1846(false, class28.field142);
											}
											if (var35 == null) {
												if (class354.field2687) {
													method532(var11);
												}
											} else {
												var21 = var35.field845;
												var22 = var35.field846;
												if (!var11.field2725) {
													var23 = var11.field2703 * 4096 / var21;
													if (var11.field2724 != 0) {
														var35.method374(var11.field2703 / 2 + var13, var11.field2680 / 2 + var14, var11.field2724, var23);
													} else if (var15 != 0) {
														var35.method368(var13, var14, var11.field2703, var11.field2680, 256 - (var15 & 255));
													} else if (var11.field2703 == var21 && var22 == var11.field2680) {
														var35.method380(var13, var14);
													} else {
														var35.method382(var13, var14, var11.field2703, var11.field2680);
													}
												} else {
													class206.method1249(var13, var14, var11.field2703 + var13, var14 + var11.field2680);
													var23 = (var11.field2703 + (var21 - 1)) / var21;
													var41 = (var22 - 1 + var11.field2680) / var22;
													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var41; ++var26) {
															if (var11.field2724 != 0) {
																var35.method374(var21 * var25 + var13 + var21 / 2, var14 + var22 * var26 + var22 / 2, var11.field2724, 4096);
															} else if (var15 != 0) {
																var35.method378(var21 * var25 + var13, var14 + var22 * var26, 256 - (var15 & 255));
															} else {
																var35.method380(var21 * var25 + var13, var14 + var22 * var26);
															}
														}
													}
													class206.method1243(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (var11.field2690 == 6) {
											boolean var33 = method455(var11);
											if (var33) {
												var21 = var11.field2808;
											} else {
												var21 = var11.field2734;
											}
											class113 var36 = null;
											var23 = 0;
											if (var11.field2816 != -1) {
												class426 var38 = class426.method2155(var11.field2816);
												if (null != var38) {
													var38 = var38.method2141(var11.field2817);
													var36 = var38.method2140(1);
													if (null != var36) {
														var36.method679();
														var23 = var36.field1834 / 2;
													} else {
														method532(var11);
													}
												}
											} else if (var11.field2730 == 5) {
												if (var11.field2731 == 0) {
													var36 = field1184.method2454((class67) null, -1, (class67) null, -1);
												} else {
													var36 = class431.field3378.method1165();
												}
											} else if (var11.field2730 == 7) {
												var36 = var11.field2744.method2454((class67) null, -1, class67.method308(class431.field3378.field248), class431.field3378.field242);
											} else {
												class314 var39 = null;
												class22 var40 = null;
												if (var11.field2730 == 6) {
													var26 = var11.field2731;
													if (var26 >= 0 && var26 < field958.length) {
														class373 var43 = field958[var26];
														if (null != var43) {
															var39 = var43.field3019;
															var40 = var43.method1981();
														}
													}
												}
												class67 var42 = null;
												var27 = -1;
												if (var21 != -1) {
													var42 = class67.method308(var21);
													var27 = var11.field2818;
												}
												var36 = var11.method1826(var42, var27, var33, class431.field3378.field806, var39, var40);
												if (var36 == null && class354.field2687) {
													method532(var11);
												}
											}
											class238.method1408(var11.field2703 / 2 + var13, var11.field2680 / 2 + var14);
											var41 = var11.field2741 * class238.field2037[var11.field2738] >> 16;
											var25 = class238.field2035[var11.field2738] * var11.field2741 >> 16;
											if (null != var36) {
												if (!var11.field2768) {
													var36.method685(0, var11.field2756, 0, var11.field2738, 0, var41, var25);
												} else {
													var36.method679();
													if (var11.field2761) {
														var36.method693(0, var11.field2756, var11.field2803, var11.field2738, var11.field2736, var11.field2810 + var41 + var23, var11.field2810 + var25, var11.field2741);
													} else {
														var36.method685(0, var11.field2756, var11.field2803, var11.field2738, var11.field2736, var11.field2810 + var41 + var23, var25 + var11.field2810);
													}
												}
											}
											class238.method1399();
										} else {
											class61 var31;
											if (var11.field2690 == 8 && class454.field3476 == var11 && field1062 == field1061) {
												var20 = 0;
												var21 = 0;
												var31 = class281.field2287;
												String var34 = var11.field2748;
												String var24;
												for (var34 = method555(var34, var11); var34.length() > 0; var21 += var31.field4005 + 1) {
													var25 = var34.indexOf(class74.field738);
													if (var25 != -1) {
														var24 = var34.substring(0, var25);
														var34 = var34.substring(var25 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}
													var26 = var31.method2386(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}
												var20 += 6;
												var21 += 7;
												var25 = var13 + var11.field2703 - 5 - var20;
												var26 = var14 + var11.field2680 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}
												if (var20 + var25 > var4) {
													var25 = var4 - var20;
												}
												if (var21 + var26 > var5) {
													var26 = var5 - var21;
												}
												class206.method1236(var25, var26, var20, var21, 16777120);
												class206.method1239(var25, var26, var20, var21, 0);
												var34 = var11.field2748;
												var27 = var26 + var31.field4005 + 2;
												for (var34 = method555(var34, var11); var34.length() > 0; var27 += var31.field4005 + 1) {
													int var28 = var34.indexOf(class74.field738);
													if (var28 != -1) {
														var24 = var34.substring(0, var28);
														var34 = var34.substring(var28 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}
													var31.method2414(var24, var25 + 3, var27, 0, -1);
												}
											}
											if (var11.field2690 == 9) {
												if (var11.field2720) {
													var20 = var13;
													var21 = var11.field2680 + var14;
													var22 = var11.field2703 + var13;
													var23 = var14;
												} else {
													var20 = var13;
													var21 = var14;
													var22 = var13 + var11.field2703;
													var23 = var11.field2680 + var14;
												}
												if (var11.field2719 == 1) {
													class206.method1238(var20, var21, var22, var23, var11.field2711);
												} else {
													method579(var20, var21, var22, var23, var11.field2711, var11.field2719);
												}
											} else if (var11.field2690 == 12) {
												class114 var30 = var11.method1855();
												class452 var32 = var11.method1841();
												if (null != var30 && null != var32 && var30.method754()) {
													var31 = var11.method1825();
													if (var31 != null) {
														field1112.method2047(var13, var14, var11.field2703, var11.field2680, var30.method755(), var30.method780(), var30.method752(), var30.method753(), var30.method773());
														var23 = var11.field2678 ? var11.field2727 : -1;
														if (!var30.method750() && var30.method774().method1508()) {
															field1112.method2048(var32.field3475, var23, var32.field3473, var32.field3474);
															field1112.method2049(var30.method748(), var31, (byte) -101);
														} else {
															field1112.method2048(var11.field2711, var23, var32.field3473, var32.field3474);
															field1112.method2049(var30.method774(), var31, (byte) -117);
														}
														class206.method1243(var2, var3, var4, var5);
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
		}
	}

	static final void method579(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var7 = var2 - var0;
		int var8 = var3 - var1;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8 >= 0 ? var8 : -var8;
		int var11 = var9;
		if (var9 < var10) {
			var11 = var10;
		}
		if (var11 != 0) {
			int var12 = (var7 << 16) / var11;
			int var13 = (var8 << 16) / var11;
			if (var13 <= var12) {
				var12 = -var12;
			} else {
				var13 = -var13;
			}
			int var14 = var5 * var13 >> 17;
			int var15 = 1 + var13 * var5 >> 17;
			int var16 = var5 * var12 >> 17;
			int var17 = var12 * var5 + 1 >> 17;
			var0 -= class206.field1909;
			var1 -= class206.field1910;
			int var18 = var0 + var14;
			int var19 = var0 - var15;
			int var20 = var7 + var0 - var15;
			int var21 = var14 + var0 + var7;
			int var22 = var1 + var16;
			int var23 = var1 - var17;
			int var24 = var1 + var8 - var17;
			int var25 = var16 + var8 + var1;
			class238.method1400(var18, var19, var20);
			class238.method1410(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			class238.method1400(var18, var20, var21);
			class238.method1410(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	static String method555(String var0, class354 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}
					var0 = var0.substring(0, var4) + class253.method1445(method491(var1, var3 - 1)) + var0.substring(var4 + 2);
				}
			}
		}
		return var0;
	}

	static final String method548(int var0) {
		String var2 = Integer.toString(var0);
		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + class74.field736 + var2.substring(var3);
		}
		if (var2.length() > 9) {
			return " " + class74.method314(65408) + var2.substring(0, var2.length() - 8) + class55.field388 + " " + class74.field732 + var2 + class74.field734 + class74.field739;
		} else {
			return var2.length() > 6 ? " " + class74.method314(16777215) + var2.substring(0, var2.length() - 4) + class55.field496 + " " + class74.field732 + var2 + class74.field734 + class74.field739 : " " + class74.method314(16776960) + var2 + class74.field739;
		}
	}

	static void method471(class354[] var0, class354 var1, boolean var2) {
		int var4 = var1.field2775 != 0 ? var1.field2775 : var1.field2703;
		int var5 = var1.field2710 != 0 ? var1.field2710 : var1.field2680;
		method452(var0, var1.field2688, var4, var5, var2);
		if (null != var1.field2820) {
			method452(var1.field2820, var1.field2688, var4, var5, var2);
		}
		class208 var6 = (class208) field919.method2582((long) var1.field2688);
		if (var6 != null) {
			int var7 = var6.field1915;
			if (class354.method1864(var7)) {
				method452(class457.field3488[var7], -1, var4, var5, var2);
			}
		}
		if (var1.field2714 == 1337) {
		}
	}

	static void method452(class354[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class354 var7 = var0[var6];
			if (null != var7 && var7.field2705 == var1) {
				method577(var7, var2, var3, var4);
				method542(var7, var2, var3);
				if (var7.field2707 > var7.field2775 - var7.field2703) {
					var7.field2707 = var7.field2775 - var7.field2703;
				}
				if (var7.field2707 < 0) {
					var7.field2707 = 0;
				}
				if (var7.field2721 > var7.field2710 - var7.field2680) {
					var7.field2721 = var7.field2710 - var7.field2680;
				}
				if (var7.field2721 < 0) {
					var7.field2721 = 0;
				}
				if (var7.field2690 == 0) {
					method471(var0, var7, var4);
				}
			}
		}
	}

	static void method577(class354 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field2703;
		int var6 = var0.field2680;
		if (var0.field2695 == 0) {
			var0.field2703 = var0.field2699;
		} else if (var0.field2695 == 1) {
			var0.field2703 = var1 - var0.field2699;
		} else if (var0.field2695 == 2) {
			var0.field2703 = var1 * var0.field2699 >> 14;
		}
		if (var0.field2696 == 0) {
			var0.field2680 = var0.field2700;
		} else if (var0.field2696 == 1) {
			var0.field2680 = var2 - var0.field2700;
		} else if (var0.field2696 == 2) {
			var0.field2680 = var2 * var0.field2700 >> 14;
		}
		if (var0.field2695 == 4) {
			var0.field2703 = var0.field2804 * var0.field2680 / var0.field2704;
		}
		if (var0.field2696 == 4) {
			var0.field2680 = var0.field2703 * var0.field2704 / var0.field2804;
		}
		if (var0.field2714 == 1337) {
			field1191 = var0;
		}
		if (var0.field2690 == 12) {
			var0.method1855().method716(var0.field2703, var0.field2680);
		}
		if (var3 && var0.field2682 != null && (var5 != var0.field2703 || var6 != var0.field2680)) {
			class165 var7 = new class165();
			var7.field1664 = var0;
			var7.field1667 = var0.field2682;
			field1113.method2222(var7);
		}
	}

	static void method542(class354 var0, int var1, int var2) {
		if (var0.field2693 == 0) {
			var0.field2689 = var0.field2697;
		} else if (var0.field2693 == 1) {
			var0.field2689 = (var1 - var0.field2703) / 2 + var0.field2697;
		} else if (var0.field2693 == 2) {
			var0.field2689 = var1 - var0.field2703 - var0.field2697;
		} else if (var0.field2693 == 3) {
			var0.field2689 = var0.field2697 * var1 >> 14;
		} else if (var0.field2693 == 4) {
			var0.field2689 = (var1 * var0.field2697 >> 14) + (var1 - var0.field2703) / 2;
		} else {
			var0.field2689 = var1 - var0.field2703 - (var1 * var0.field2697 >> 14);
		}
		if (var0.field2694 == 0) {
			var0.field2702 = var0.field2698;
		} else if (var0.field2694 == 1) {
			var0.field2702 = var0.field2698 + (var2 - var0.field2680) / 2;
		} else if (var0.field2694 == 2) {
			var0.field2702 = var2 - var0.field2680 - var0.field2698;
		} else if (var0.field2694 == 3) {
			var0.field2702 = var0.field2698 * var2 >> 14;
		} else if (var0.field2694 == 4) {
			var0.field2702 = (var0.field2698 * var2 >> 14) + (var2 - var0.field2680) / 2;
		} else {
			var0.field2702 = var2 - var0.field2680 - (var2 * var0.field2698 >> 14);
		}
	}

	static final void method586(class354 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field983) {
			field1102 = 32;
		} else {
			field1102 = 0;
		}
		field983 = false;
		int var8;
		if (class422.field3260 == 1 || !class349.field2637 && class422.field3260 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field2721 -= 4;
				method532(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
				var0.field2721 += 4;
				method532(var0);
			} else if (var5 >= var1 - field1102 && var5 < field1102 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
				var8 = var3 * (var3 - 32) / var4;
				if (var8 < 8) {
					var8 = 8;
				}
				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field2721 = var9 * (var4 - var3) / var10;
				method532(var0);
				field983 = true;
			}
		}
		if (field1111 != 0) {
			var8 = var0.field2703;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field2721 += field1111 * 45;
				method532(var0);
			}
		}
	}

	static final void method517(int var0, int var1, int var2, int var3, int var4) {
		class204.field1896[0].method1292(var0, var1);
		class204.field1896[1].method1292(var0, var1 + var3 - 16);
		class206.method1236(var0, var1 + 16, 16, var3 - 32, field979);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}
		int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
		class206.method1236(var0, var1 + 16 + var7, 16, var6, field1090);
		class206.method1242(var0, var7 + var1 + 16, var6, field1169);
		class206.method1242(var0 + 1, var1 + 16 + var7, var6, field1169);
		class206.method1247(var0, var1 + 16 + var7, 16, field1169);
		class206.method1247(var0, var1 + 17 + var7, 16, field1169);
		class206.method1242(var0 + 15, var1 + 16 + var7, var6, field981);
		class206.method1242(var0 + 14, var7 + var1 + 17, var6 - 1, field981);
		class206.method1247(var0, var6 + var1 + 15 + var7, 16, field981);
		class206.method1247(var0 + 1, var7 + var1 + 14 + var6, 15, field981);
	}

	static final boolean method455(class354 var0) {
		if (null == var0.field2823) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field2823.length; ++var2) {
				int var3 = method491(var0, var2);
				int var4 = var0.field2811[var2];
				if (var0.field2823[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field2823[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.field2823[var2] == 4) {
					if (var4 == var3) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}
			return true;
		}
	}

	static final int method491(class354 var0, int var1) {
		if (var0.field2752 != null && var1 < var0.field2752.length) {
			try {
				int[] var3 = var0.field2752[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;
				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}
					if (var7 == 1) {
						var8 = field1042[var3[var5++]];
					}
					if (var7 == 2) {
						var8 = field1190[var3[var5++]];
					}
					if (var7 == 3) {
						var8 = field1193[var3[var5++]];
					}
					int var10;
					class354 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class354.method1860(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class426.method2155(var12).field3301 || field925)) {
							for (var13 = 0; var13 < var11.field2814.length; ++var13) {
								if (var11.field2814[var13] == var12 + 1) {
									var8 += var11.field2815[var13];
								}
							}
						}
					}
					if (var7 == 5) {
						var8 = class410.field3198[var3[var5++]];
					}
					if (var7 == 6) {
						var8 = class329.field2538[field1190[var3[var5++]] - 1];
					}
					if (var7 == 7) {
						var8 = class410.field3198[var3[var5++]] * 100 / 46875;
					}
					if (var7 == 8) {
						var8 = class431.field3378.field811;
					}
					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class329.field2536[var10]) {
								var8 += field1190[var10];
							}
						}
					}
					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class354.method1860(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class426.method2155(var12).field3301 || field925)) {
							for (var13 = 0; var13 < var11.field2814.length; ++var13) {
								if (var11.field2814[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}
					if (var7 == 11) {
						var8 = field1015;
					}
					if (var7 == 12) {
						var8 = field1185;
					}
					if (var7 == 13) {
						var10 = class410.field3198[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}
					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class410.method2082(var10);
					}
					if (var7 == 15) {
						var9 = 1;
					}
					if (var7 == 16) {
						var9 = 2;
					}
					if (var7 == 17) {
						var9 = 3;
					}
					if (var7 == 18) {
						var8 = class346.field2624 + (class431.field3378.field272 >> 7);
					}
					if (var7 == 19) {
						var8 = class211.field1922 + (class431.field3378.field243 >> 7);
					}
					if (var7 == 20) {
						var8 = var3[var5++];
					}
					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}
						if (var6 == 1) {
							var4 -= var8;
						}
						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}
						if (var6 == 3) {
							var4 *= var8;
						}
						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	static final void method509(class354 var0) {
		String var2;
		int var3;
		int var4;
		if (var0.field2691 == 1) {
			var2 = var0.field2739;
			var3 = var0.field2688;
			var4 = var0.field2816;
			method486(var2, "", 24, 0, 0, var3, var4, false);
		}
		int var5;
		String var12;
		if (var0.field2691 == 2 && !field990) {
			var2 = method558(var0);
			if (var2 != null) {
				var12 = class74.method314(65280) + var0.field2796;
				var4 = var0.field2688;
				var5 = var0.field2816;
				method486(var2, var12, 25, 0, -1, var4, var5, false);
			}
		}
		if (var0.field2691 == 3) {
			method581(class55.field564, "", 26, 0, 0, var0.field2688);
		}
		if (var0.field2691 == 4) {
			method581(var0.field2739, "", 28, 0, 0, var0.field2688);
		}
		if (var0.field2691 == 5) {
			method581(var0.field2739, "", 29, 0, 0, var0.field2688);
		}
		if (var0.field2691 == 6 && field1075 == null) {
			method581(var0.field2739, "", 30, 0, -1, var0.field2688);
		}
		if (var0.field2768) {
			int var6;
			int var7;
			int var8;
			String var13;
			String var15;
			if (field990) {
				var3 = method528(var0);
				boolean var10 = (var3 >> 21 & 1) != 0;
				if (var10 && (class26.field127 & 32) == 32) {
					var13 = field1081;
					var15 = field1092 + " " + class74.field737 + " " + var0.field2692;
					var6 = var0.field2807;
					var7 = var0.field2688;
					var8 = var0.field2816;
					method486(var13, var15, 58, 0, var6, var7, var8, false);
				}
			} else {
				for (int var11 = 9; var11 >= 5; --var11) {
					var5 = method528(var0);
					boolean var14 = (var5 >> var11 + 1 & 1) != 0;
					if (!var14 && null == var0.field2791) {
						var12 = null;
					} else if (null != var0.field2766 && var0.field2766.length > var11 && null != var0.field2766[var11] && var0.field2766[var11].trim().length() != 0) {
						var12 = var0.field2766[var11];
					} else {
						var12 = null;
					}
					if (null != var12) {
						var15 = var0.field2692;
						var6 = var11 + 1;
						var7 = var0.field2807;
						var8 = var0.field2688;
						int var9 = var0.field2816;
						method486(var12, var15, 1007, var6, var7, var8, var9, false);
					}
				}
				var2 = method558(var0);
				if (var2 != null) {
					var12 = var0.field2692;
					var4 = var0.field2807;
					var5 = var0.field2688;
					var6 = var0.field2816;
					method486(var2, var12, 25, 0, var4, var5, var6, false);
				}
				for (var3 = 4; var3 >= 0; --var3) {
					var6 = method528(var0);
					boolean var17 = (var6 >> var3 + 1 & 1) != 0;
					if (!var17 && var0.field2791 == null) {
						var13 = null;
					} else if (null != var0.field2766 && var0.field2766.length > var3 && null != var0.field2766[var3] && var0.field2766[var3].trim().length() != 0) {
						var13 = var0.field2766[var3];
					} else {
						var13 = null;
					}
					if (var13 != null) {
						method486(var13, var0.field2692, 57, var3 + 1, var0.field2807, var0.field2688, var0.field2816, var0.field2832);
					}
				}
				var4 = method528(var0);
				boolean var16 = (var4 & 1) != 0;
				if (var16) {
					method581(class55.field325, "", 30, 0, var0.field2807, var0.field2688);
				}
			}
		}
	}

	static void method446(boolean var0) {
		field1031 = var0;
	}

	static boolean method460() {
		return field1031;
	}

	static final void method472(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class354.method1864(var0)) {
			class488.method2351(class457.field3488[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	static boolean method585(int var0) {
		for (int var2 = 0; var2 < field1138; ++var2) {
			if (field1140[var2] == var0) {
				return true;
			}
		}
		return false;
	}

	static final void method582(int var0, int var1) {
		if (class354.method1864(var0)) {
			method539(class457.field3488[var0], var1);
		}
	}

	static final void method539(class354[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class354 var4 = var0[var3];
			if (var4 != null) {
				if (var4.field2690 == 0) {
					if (var4.field2820 != null) {
						method539(var4.field2820, var1);
					}
					class208 var5 = (class208) field919.method2582((long) var4.field2688);
					if (var5 != null) {
						method582(var5.field1915, var1);
					}
				}
				class165 var6;
				if (var1 == 0 && null != var4.field2735) {
					var6 = new class165();
					var6.field1664 = var4;
					var6.field1667 = var4.field2735;
					class221.method1344(var6);
				}
				if (var1 == 1 && var4.field2767 != null) {
					if (var4.field2807 >= 0) {
						class354 var7 = class354.method1860(var4.field2688);
						if (var7 == null || var7.field2820 == null || var4.field2807 >= var7.field2820.length || var7.field2820[var4.field2807] != var4) {
							continue;
						}
					}
					var6 = new class165();
					var6.field1664 = var4;
					var6.field1667 = var4.field2767;
					class221.method1344(var6);
				}
			}
		}
	}

	static final void method535(class354 var0, int var1, int var2) {
		if (null == field1082 && !field1011) {
			if (null != var0 && method540(var0) != null) {
				field1082 = var0;
				field1101 = method540(var0);
				field1084 = var1;
				field1157 = var2;
				class52.field237 = 0;
				field1093 = false;
				int var4 = field1047 - 1;
				if (var4 != -1) {
					class488.field3917 = new class96();
					class488.field3917.field1219 = field1048[var4];
					class488.field3917.field1222 = field1049[var4];
					class488.field3917.field1220 = field1091[var4];
					class488.field3917.field1221 = field1051[var4];
					class488.field3917.field1218 = field1052[var4];
					class488.field3917.field1223 = field1053[var4];
					class488.field3917.field1224 = field1172[var4];
				}
			}
		}
	}

	static void method439(int var0, int var1) {
		class96 var3 = class488.field3917;
		if (null != var3) {
			method592(var3.field1219, var3.field1222, var3.field1220, var3.field1221, var3.field1218, var3.field1223, var3.field1224, var0, var1);
		}
		class488.field3917 = null;
	}

	public static void method532(class354 var0) {
		if (null != var0 && field1119 == var0.field2828) {
			field908[var0.field2827] = true;
		}
	}

	static void method498() {
		for (class208 var1 = (class208) field919.method2583(); var1 != null; var1 = (class208) field919.method2584()) {
			int var2 = var1.field1915;
			if (class354.method1864(var2)) {
				boolean var3 = true;
				class354[] var4 = class457.field3488[var2];
				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (null != var4[var5]) {
						var3 = var4[var5].field2768;
						break;
					}
				}
				if (!var3) {
					var5 = (int) var1.field785;
					class354 var6 = class354.method1860(var5);
					if (var6 != null) {
						method532(var6);
					}
				}
			}
		}
	}

	static class354 method540(class354 var0) {
		class354 var2 = method490(var0);
		if (null == var2) {
			var2 = var0.field2787;
		}
		return var2;
	}

	static final void method441(int var0) {
		if (class354.method1864(var0)) {
			class354[] var2 = class457.field3488[var0];
			for (int var3 = 0; var3 < var2.length; ++var3) {
				class354 var4 = var2[var3];
				if (null != var4) {
					var4.field2818 = 0;
					var4.field2819 = 0;
				}
			}
		}
	}

	static final void method564(int var0) {
		if (class354.method1864(var0)) {
			method512(class457.field3488[var0], -1);
		}
	}

	static final void method512(class354[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class354 var4 = var0[var3];
			if (null != var4 && var1 == var4.field2705 && (!var4.field2768 || !method505(var4))) {
				int var6;
				if (var4.field2690 == 0) {
					if (!var4.field2768 && method505(var4) && class400.field3169 != var4) {
						continue;
					}
					method512(var0, var4.field2688);
					if (var4.field2820 != null) {
						method512(var4.field2820, var4.field2688);
					}
					class208 var5 = (class208) field919.method2582((long) var4.field2688);
					if (null != var5) {
						var6 = var5.field1915;
						if (class354.method1864(var6)) {
							method512(class457.field3488[var6], -1);
						}
					}
				}
				if (var4.field2690 == 6) {
					if (var4.field2734 != -1 || var4.field2808 != -1) {
						boolean var9 = method455(var4);
						if (var9) {
							var6 = var4.field2808;
						} else {
							var6 = var4.field2734;
						}
						if (var6 != -1) {
							class67 var7 = class67.method308(var6);
							if (!var7.method307()) {
								for (var4.field2819 += field977; var4.field2819 > var7.field712[var4.field2818]; method532(var4)) {
									var4.field2819 -= var7.field712[var4.field2818];
									++var4.field2818;
									if (var4.field2818 >= var7.field701.length) {
										var4.field2818 -= var7.field705;
										if (var4.field2818 < 0 || var4.field2818 >= var7.field701.length) {
											var4.field2818 = 0;
										}
									}
								}
							} else {
								var4.field2818 += field977;
								int var8 = var7.method304();
								if (var4.field2818 >= var8) {
									var4.field2818 -= var7.field705;
									if (var4.field2818 < 0 || var4.field2818 >= var8) {
										var4.field2818 = 0;
									}
								}
								method532(var4);
							}
						}
					}
					if (var4.field2779 != 0 && !var4.field2768) {
						int var10 = var4.field2779 >> 16;
						var6 = var4.field2779 << 16 >> 16;
						var10 *= field977;
						var6 *= field977;
						var4.field2738 = var4.field2738 + var10 & 2047;
						var4.field2756 = var6 + var4.field2756 & 2047;
						method532(var4);
					}
				}
			}
		}
	}

	static final void method448(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + (float) var0 / 200.0F;
		method478((double) var2);
	}

	static final int method573() {
		float var1 = 200.0F * ((float) class83.field841.method1022() - 0.5F);
		return 100 - Math.round(var1);
	}

	static final void method478(double var0) {
		class238.method1387(var0);
		((class21) class238.field2039.field2270).method66(var0);
		class426.method2154();
		class83.field841.method1024(var0);
	}

	static final void method553(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class83.field841.method1001()) {
			label35: {
				if (class83.field841.method1001() == 0) {
					boolean var2 = !class388.field3091.isEmpty();
					if (var2) {
						class13 var3 = class477.field3744;
						if (!class388.field3091.isEmpty()) {
							ArrayList var4 = new ArrayList();
							Iterator var5 = class388.field3091.iterator();
							while (var5.hasNext()) {
								class490 var6 = (class490) var5.next();
								var6.field3957 = false;
								var6.field3955 = false;
								var6.field3961 = false;
								var6.field3958 = false;
								var6.field3953 = var3;
								var6.field3952 = var0;
								var6.field3949 = 0.0F;
								var4.add(var6);
							}
							class388.method2015(var4, class388.field3094, class388.field3095, class388.field3096, class388.field3087, false);
						}
						field1170 = false;
						break label35;
					}
				}
				if (var0 == 0) {
					class436.method2172(0, 0);
					field1170 = false;
				} else {
					class407.method2074(var0, (byte) 57);
				}
			}
			class83.field841.method1007(var0);
		}
	}

	static final void method583(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class83.field841.method1008(var0);
	}

	static final void method447(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class83.field841.method1028(var0);
	}

	static final void method554(int var0) {
		method498();
		for (class46 var2 = (class46) class46.field218.method2218(); var2 != null; var2 = (class46) class46.field218.method2220()) {
			if (var2.field228 != null) {
				var2.method193();
			}
		}
		int var4 = class469.method2292(var0).field1487;
		if (var4 != 0) {
			int var3 = class410.field3198[var0];
			if (var4 == 1) {
				if (var3 == 1) {
					class238.method1387(0.9D);
					((class21) class238.field2039.field2270).method66(0.9D);
					class426.method2154();
					class83.field841.method1024(0.9D);
				}
				if (var3 == 2) {
					class238.method1387(0.8D);
					((class21) class238.field2039.field2270).method66(0.8D);
					class426.method2154();
					class83.field841.method1024(0.8D);
				}
				if (var3 == 3) {
					method478(0.7D);
				}
				if (var3 == 4) {
					method478(0.6D);
				}
			}
			if (var4 == 3) {
				if (var3 == 0) {
					method553(255);
				}
				if (var3 == 1) {
					method553(192);
				}
				if (var3 == 2) {
					method553(128);
				}
				if (var3 == 3) {
					method553(64);
				}
				if (var3 == 4) {
					method553(0);
				}
			}
			if (var4 == 4) {
				if (var3 == 0) {
					method583(127);
				}
				if (var3 == 1) {
					method583(96);
				}
				if (var3 == 2) {
					method583(64);
				}
				if (var3 == 3) {
					method583(32);
				}
				if (var3 == 4) {
					method583(0);
				}
			}
			if (var4 == 5) {
				field1045 = var3 == 1;
			}
			if (var4 == 6) {
				field1074 = var3;
			}
			if (var4 == 9) {
			}
			if (var4 == 10) {
				if (var3 == 0) {
					method447(127);
				}
				if (var3 == 1) {
					method447(96);
				}
				if (var3 == 2) {
					method447(64);
				}
				if (var3 == 3) {
					method447(32);
				}
				if (var3 == 4) {
					method447(0);
				}
			}
			if (var4 == 17) {
				field933 = var3 & 65535;
			}
			if (var4 == 18) {
				field927 = (class389) class433.method2167(class389.method2023(), var3);
				if (field927 == null) {
					field927 = class389.field3104;
				}
			}
			if (var4 == 19) {
				if (var3 == -1) {
					field1037 = -1;
				} else {
					field1037 = var3 & 2047;
				}
			}
			if (var4 == 22) {
				field928 = (class389) class433.method2167(class389.method2023(), var3);
				if (null == field928) {
					field928 = class389.field3104;
				}
			}
		}
	}

	static final void method525(class354 var0) {
		int var2 = var0.field2714;
		if (var2 == 324) {
			if (field1004 == -1) {
				field1004 = var0.field2774;
				field1186 = var0.field2722;
			}
			if (field1184.field4058 == 1) {
				var0.field2774 = field1004;
			} else {
				var0.field2774 = field1186;
			}
		} else if (var2 == 325) {
			if (field1004 == -1) {
				field1004 = var0.field2774;
				field1186 = var0.field2722;
			}
			if (field1184.field4058 == 1) {
				var0.field2774 = field1186;
			} else {
				var0.field2774 = field1004;
			}
		} else if (var2 == 327) {
			var0.field2738 = 150;
			var0.field2756 = (int) (Math.sin((double) field1201 / 40.0D) * 256.0D) & 2047;
			var0.field2730 = 5;
			var0.field2731 = 0;
		} else if (var2 == 328) {
			var0.field2738 = 150;
			var0.field2756 = (int) (Math.sin((double) field1201 / 40.0D) * 256.0D) & 2047;
			var0.field2730 = 5;
			var0.field2731 = 1;
		}
	}

	static final void method549() {
		class457 var1 = class457.method2237(class483.field3798, field963.field1603);
		field963.method911(var1);
		class221.field1977 = true;
		for (class208 var2 = (class208) field919.method2583(); var2 != null; var2 = (class208) field919.method2584()) {
			if (var2.field1913 == 0 || var2.field1913 == 3) {
				method484(var2, true);
			}
		}
		if (field1075 != null) {
			method532(field1075);
			field1075 = null;
		}
		class221.field1977 = false;
	}

	static final class208 method569(int var0, int var1, int var2) {
		class208 var4 = new class208();
		var4.field1915 = var1;
		var4.field1913 = var2;
		field919.method2585(var4, (long) var0);
		method441(var1);
		class354 var5 = class354.method1860(var0);
		method532(var5);
		if (null != field1075) {
			method532(field1075);
			field1075 = null;
		}
		method471(class457.field3488[var0 >> 16], var5, false);
		class221.method1337(var1);
		if (field1070 != -1) {
			method582(field1070, 1);
		}
		return var4;
	}

	static final void method484(class208 var0, boolean var1) {
		int var3 = var0.field1915;
		int var4 = (int) var0.field785;
		var0.method318();
		if (var1) {
			class354.method1862(var3);
		}
		method570(var3);
		class354 var5 = class354.method1860(var4);
		if (var5 != null) {
			method532(var5);
		}
		if (field1070 != -1) {
			method582(field1070, 1);
		}
	}

	static final void method451(class354 var0, int var1, int var2, int var3) {
		method561();
		class427 var5 = var0.method1827(false);
		if (var5 != null) {
			class206.method1243(var1, var2, var1 + var5.field3348, var2 + var5.field3347);
			if (field1151 != 2 && field1151 != 5) {
				int var6 = field1076 & 2047;
				int var7 = class431.field3378.field272 / 32 + 48;
				int var8 = 464 - class431.field3378.field243 / 32;
				class7.field25.method373(var1, var2, var5.field3348, var5.field3347, var7, var8, var6, 256, var5.field3350, var5.field3349);
				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < field1145; ++var9) {
					var10 = field1146[var9] * 4 + 2 - class431.field3378.field272 / 32;
					var11 = 2 + 4 * field1147[var9] - class431.field3378.field243 / 32;
					method530(var1, var2, var10, var11, field1156[var9], var5);
				}
				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						class449 var17 = field1038[class121.field1436][var9][var10];
						if (var17 != null) {
							var12 = 2 + var9 * 4 - class431.field3378.field272 / 32;
							var13 = 2 + var10 * 4 - class431.field3378.field243 / 32;
							method530(var1, var2, var12, var13, class541.field4283[0], var5);
						}
					}
				}
				for (var9 = 0; var9 < field959; ++var9) {
					class373 var15 = field958[field897[var9]];
					if (var15 != null && var15.method217()) {
						class314 var18 = var15.field3019;
						if (null != var18 && null != var18.field2467) {
							var18 = var18.method1685();
						}
						if (null != var18 && var18.field2462 && var18.field2473) {
							var12 = var15.field272 / 32 - class431.field3378.field272 / 32;
							var13 = var15.field243 / 32 - class431.field3378.field243 / 32;
							method530(var1, var2, var12, var13, class541.field4283[1], var5);
						}
					}
				}
				var9 = class274.field2240;
				int[] var16 = class274.field2241;
				for (var11 = 0; var11 < var9; ++var11) {
					class82 var19 = field1071[var16[var11]];
					if (var19 != null && var19.method217() && !var19.field825 && var19 != class431.field3378) {
						var13 = var19.field272 / 32 - class431.field3378.field272 / 32;
						int var14 = var19.field243 / 32 - class431.field3378.field243 / 32;
						if (var19.method330()) {
							method530(var1, var2, var13, var14, class541.field4283[3], var5);
						} else if (class431.field3378.field832 != 0 && var19.field832 != 0 && var19.field832 == class431.field3378.field832) {
							method530(var1, var2, var13, var14, class541.field4283[4], var5);
						} else if (var19.method333()) {
							method530(var1, var2, var13, var14, class541.field4283[5], var5);
						} else if (var19.method340()) {
							method530(var1, var2, var13, var14, class541.field4283[6], var5);
						} else {
							method530(var1, var2, var13, var14, class541.field4283[2], var5);
						}
					}
				}
				if (field976 != 0 && field1201 % 20 < 10) {
					if (field976 == 1 && field920 >= 0 && field920 < field958.length) {
						class373 var20 = field958[field920];
						if (null != var20) {
							var12 = var20.field272 / 32 - class431.field3378.field272 / 32;
							var13 = var20.field243 / 32 - class431.field3378.field243 / 32;
							method587(var1, var2, var12, var13, class374.field3036[1], var5);
						}
					}
					if (field976 == 2) {
						var11 = field922 * 4 - class346.field2624 * 4 + 2 - class431.field3378.field272 / 32;
						var12 = 2 + (field1065 * 4 - class211.field1922 * 4) - class431.field3378.field243 / 32;
						method587(var1, var2, var11, var12, class374.field3036[1], var5);
					}
					if (field976 == 10 && field939 >= 0 && field939 < field1071.length) {
						class82 var21 = field1071[field939];
						if (null != var21) {
							var12 = var21.field272 / 32 - class431.field3378.field272 / 32;
							var13 = var21.field243 / 32 - class431.field3378.field243 / 32;
							method587(var1, var2, var12, var13, class374.field3036[1], var5);
						}
					}
				}
				if (field1149 != 0) {
					var11 = field1149 * 4 + 2 - class431.field3378.field272 / 32;
					var12 = field1072 * 4 + 2 - class431.field3378.field243 / 32;
					method530(var1, var2, var11, var12, class374.field3036[0], var5);
				}
				if (!class431.field3378.field825) {
					class206.method1236(var1 + var5.field3348 / 2 - 1, var2 + var5.field3347 / 2 - 1, 3, 3, 16777215);
				}
			} else {
				class206.method1244(var1, var2, 0, var5.field3350, var5.field3349);
			}
			field1121[var3] = true;
		}
	}

	static final void method445(class354 var0, int var1, int var2, int var3) {
		class427 var5 = var0.method1827(false);
		if (var5 != null) {
			if (field1151 < 3) {
				field978.method373(var1, var2, var5.field3348, var5.field3347, 25, 25, field1076, 256, var5.field3350, var5.field3349);
			} else {
				class206.method1244(var1, var2, 0, var5.field3350, var5.field3349);
			}
		}
	}

	static final void method587(int var0, int var1, int var2, int var3, class84 var4, class427 var5) {
		int var7 = var2 * var2 + var3 * var3;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = field1076 & 2047;
			int var9 = class238.field2037[var8];
			int var10 = class238.field2035[var8];
			int var11 = var9 * var3 + var2 * var10 >> 16;
			int var12 = var10 * var3 - var2 * var9 >> 16;
			double var13 = Math.atan2((double) var11, (double) var12);
			int var15 = var5.field3348 / 2 - 25;
			int var16 = (int) (Math.sin(var13) * (double) var15);
			int var17 = (int) (Math.cos(var13) * (double) var15);
			boolean var18 = true;
			class443.field3443.method351(var16 + (var5.field3348 / 2 + var0 - 10), var1 + var5.field3347 / 2 - 10 - var17 - 10, 20, 20, 15, 15, var13, 256);
		} else {
			method530(var0, var1, var2, var3, var4, var5);
		}
	}

	static final void method530(int var0, int var1, int var2, int var3, class84 var4, class427 var5) {
		if (null != var4) {
			int var7 = field1076 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = class238.field2037[var7];
				int var10 = class238.field2035[var7];
				int var11 = var2 * var10 + var9 * var3 >> 16;
				int var12 = var3 * var10 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method372(var5.field3348 / 2 + var11 - var4.field845 / 2, var5.field3347 / 2 - var12 - var4.field846 / 2, var0, var1, var5.field3348, var5.field3347, var5.field3350, var5.field3349);
				} else {
					var4.method380(var0 + var5.field3348 / 2 + var11 - var4.field845 / 2, var5.field3347 / 2 + var1 - var12 - var4.field846 / 2);
				}
			}
		}
	}

	static final void method591() {
		Iterator var1 = class156.field1615.iterator();
		while (var1.hasNext()) {
			class374 var2 = (class374) var1.next();
			var2.method1992();
		}
		if (null != class366.field2930) {
			class366.field2930.method79((byte) -1);
		}
	}

	static final void method499() {
		field1104 = field900;
	}

	static final void method508(String var0) {
		if (class366.field2930 != null) {
			class457 var2 = class457.method2237(class483.field3877, field963.field1603);
			var2.field3487.method1085(class187.method1159(var0));
			var2.field3487.method1088(var0);
			field963.method911(var2);
		}
	}

	static final void method496(String var0) {
		if (!var0.equals("")) {
			class457 var2 = class457.method2237(class483.field3857, field963.field1603);
			var2.field3487.method1085(class187.method1159(var0));
			var2.field3487.method1088(var0);
			field963.method911(var2);
		}
	}

	static final void method475() {
		class457 var1 = class457.method2237(class483.field3857, field963.field1603);
		var1.field3487.method1085(0);
		field963.method911(var1);
	}

	static final void method488(int var0, int var1) {
		class345 var3 = var0 >= 0 ? field1143[var0] : class141.field1541;
		if (var3 != null && var1 >= 0 && var1 < var3.method1800()) {
			class162 var4 = (class162) var3.field2614.get(var1);
			if (var4.field1648 == -1) {
				String var5 = var4.field1647.method322();
				class457 var6 = class457.method2237(class483.field3819, field963.field1603);
				var6.field3487.method1085(3 + class187.method1159(var5));
				var6.field3487.method1085(var0);
				var6.field3487.method1126(var1);
				var6.field3487.method1088(var5);
				field963.method911(var6);
			}
		}
	}

	static final void method580(int var0, int var1) {
		if (field1143[var0] != null) {
			if (var1 >= 0 && var1 < field1143[var0].method1800()) {
				class162 var3 = (class162) field1143[var0].field2614.get(var1);
				if (var3.field1648 == -1) {
					class457 var4 = class457.method2237(class483.field3810, field963.field1603);
					var4.field3487.method1085(3 + class187.method1159(var3.field1647.method322()));
					var4.field3487.method1085(var0);
					var4.field3487.method1126(var1);
					var4.field3487.method1088(var3.field1647.method322());
					field963.method911(var4);
				}
			}
		}
	}

	static void method570(int var0) {
		for (class239 var2 = (class239) field1117.method2583(); null != var2; var2 = (class239) field1117.method2584()) {
			if ((var2.field785 >> 48 & 65535L) == (long) var0) {
				var2.method318();
			}
		}
	}

	static int method528(class354 var0) {
		class239 var2 = (class239) field1117.method2582((long) var0.field2807 + ((long) var0.field2688 << 32));
		return var2 != null ? var2.field2043 : var0.field2759;
	}

	static class354 method490(class354 var0) {
		int var2 = class313.method1679(method528(var0));
		if (var2 == 0) {
			return null;
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				var0 = class354.method1860(var0.field2705);
				if (var0 == null) {
					return null;
				}
			}
			return var0;
		}
	}

	static boolean method505(class354 var0) {
		return var0.field2706;
	}

	static String method558(class354 var0) {
		if (class313.method1677(method528(var0)) == 0) {
			return null;
		} else {
			return null != var0.field2770 && var0.field2770.trim().length() != 0 ? var0.field2770 : null;
		}
	}

	static String method526(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (field923 == 1) {
			var0 = var0 + "-wtrc";
		} else if (field923 == 2) {
			var0 = var0 + "-wtqa";
		} else if (field923 == 3) {
			var0 = var0 + "-wtwip";
		} else if (field923 == 5) {
			var0 = var0 + "-wti";
		} else if (field923 == 4) {
			var0 = "local";
		}
		String var4 = "";
		if (null != class101.field1269) {
			var4 = "/p=" + class101.field1269;
		}
		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + class162.field1645 + "/a=" + class359.field2854 + var4 + "/";
	}

	static void method463(String var0) {
		class101.field1269 = var0;
		try {
			String var2 = class501.field4023.getParameter(Integer.toString(18));
			String var3 = class501.field4023.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			String var6;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var5 = var4 + "; Expires=";
				long var7 = class48.method197() + 94608000000L;
				class179.field1774.setTime(new Date(var7));
				int var9 = class179.field1774.get(7);
				int var10 = class179.field1774.get(5);
				int var11 = class179.field1774.get(2);
				int var12 = class179.field1774.get(1);
				int var13 = class179.field1774.get(11);
				int var14 = class179.field1774.get(12);
				int var15 = class179.field1774.get(13);
				var6 = class179.field1773[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class179.field1775[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
				var4 = var5 + var6 + "; Max-Age=" + 94608000L;
			}
			Client var17 = class501.field4023;
			var6 = "document.cookie=\"" + var4 + "\"";
			JSObject.getWindow(var17).eval(var6);
		} catch (Throwable var16) {
		}
	}

	static void method522(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;
		for (int var5 = 0; var5 < class121.field1437; ++var5) {
			class426 var6 = class426.method2155(var5);
			if ((!var1 || var6.field3341) && var6.field3304 == -1 && var6.field3313.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					class73.field731 = -1;
					class379.field3068 = null;
					return;
				}
				if (var4 >= var3.length) {
					short[] var7 = new short[2 * var3.length];
					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}
					var3 = var7;
				}
				var3[var4++] = (short) var5;
			}
		}
		class379.field3068 = var3;
		class433.field3405 = 0;
		class73.field731 = var4;
		String[] var9 = new String[class73.field731];
		for (int var10 = 0; var10 < class73.field731; ++var10) {
			var9[var10] = class426.method2155(var3[var10]).field3313;
		}
		short[] var11 = class379.field3068;
		class295.method1590(var9, var11, 0, var9.length - 1);
	}

	static void method456(class187 var0, int var1) {
		byte[] var3 = var0.field1830;
		if (field1181 == null) {
			field1181 = new byte[24];
		}
		class355.method1865(var3, var1, field1181, 0, 24);
		class89.method400(var0, var1);
	}

	static void method520(class187 var0) {
		if (field1181 != null) {
			var0.method1090(field1181, 0, field1181.length);
		} else {
			byte[] var3 = new byte[24];
			try {
				class89.field885.method1878(0L);
				class89.field885.method1879(var3);
				int var4;
				for (var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
				}
				if (var4 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var5 = 0; var5 < 24; ++var5) {
					var3[var5] = -1;
				}
			}
			var0.method1090(var3, 0, var3.length);
		}
	}

	public static void method483(int var0, int var1, int var2, boolean var3) {
		class457 var5 = class457.method2237(class483.field3817, field963.field1603);
		var5.field3487.method1158(var2);
		var5.field3487.method1126(var1);
		var5.field3487.method1134(var3 ? field998 : 0);
		var5.field3487.method1148(var0);
		field963.method911(var5);
	}

	static void method559(int var0) {
		field991 = var0;
	}

	static void method462() {
		field963.method911(class457.method2237(class483.field3865, field963.field1603));
		field991 = 0;
	}

	static void method544() {
		if (field991 == 1) {
			field999 = true;
		}
	}

	static void method457() {
		if (field999 && null != class431.field3378) {
			int var1 = class431.field3378.field317[0];
			int var2 = class431.field3378.field314[0];
			if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
				return;
			}
			class280.field2284 = class431.field3378.field272;
			int var3 = method450(class431.field3378.field272, class431.field3378.field243, class121.field1436) - field992;
			if (var3 < class528.field4179) {
				class528.field4179 = var3;
			}
			class121.field1438 = class431.field3378.field243;
			field999 = false;
		}
	}

	static String method527(String var0) {
		class76[] var2 = class76.method317();
		for (int var3 = 0; var3 < var2.length; ++var3) {
			class76 var4 = var2[var3];
			if (var4.field781 != -1 && var0.startsWith(class75.method315(var4.field781))) {
				var0 = var0.substring(6 + Integer.toString(var4.field781).length());
				break;
			}
		}
		return var0;
	}

	static void method440() {
		class83.field841.method1025(field903);
	}

	static void method565(int var0) {
		if (var0 != field934) {
			field934 = var0;
		}
	}

	static void method465(boolean var0) {
		field1045 = var0;
	}

	static class80 method574(int var0) {
		class80 var2 = (class80) field1094.method648((long) var0);
		if (null == var2) {
			var2 = new class80(class454.field3477, class128.method853(var0), class128.method854(var0));
			field1094.method647(var2, (long) var0);
		}
		return var2;
	}

	static class80 method593(int var0) {
		class80 var2 = (class80) field984.method648((long) var0);
		if (null == var2) {
			var2 = new class80(class454.field3477, var0);
		}
		return var2;
	}

	public static Clipboard method575() {
		return class501.field4023.method2526();
	}

	static void method602(int var0) {
		class67 var2 = class67.method308(var0);
		if (var2.method307()) {
			if (class173.method1026(var2.field697, (byte) 94) == 2) {
				field1067.add(var2.field697);
			}
		}
	}

	static void method514() {
		for (int var1 = 0; var1 < field1067.size(); ++var1) {
			if (class173.method1026((Integer) field1067.get(var1), (byte) -51) != 2) {
				field1067.remove(var1);
				--var1;
			}
		}
	}
}
