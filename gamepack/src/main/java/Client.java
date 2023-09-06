import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends class172 implements class262, OAuthApi, class382 {
	public static boolean field30;
	public static class60 field187;
	public static int field126;
	public static int field185;
	public static int field3;
	public static int field91;
	public static final class269 field68;
	static boolean field104;
	static boolean field106;
	static boolean field116;
	static boolean field129;
	static boolean field136;
	static boolean field14;
	static boolean field150;
	static boolean field16;
	static boolean field161;
	static boolean field163;
	static boolean field192;
	static boolean field198;
	static boolean field22;
	static boolean field234;
	static boolean field238;
	static boolean field239;
	static boolean field241;
	static boolean field264;
	static boolean field265;
	static boolean field266;
	static boolean field267;
	static boolean field270;
	static boolean field275;
	static boolean field292;
	static boolean field299;
	static boolean field43;
	static boolean field57;
	static boolean field67;
	static boolean field7;
	static boolean field70;
	static boolean field79;
	static boolean field88;
	static boolean field95;
	static boolean[] field13;
	static boolean[] field140;
	static boolean[] field160;
	static boolean[] field226;
	static boolean[] field227;
	static boolean[] field271;
	static byte[] field286;
	static class102[] field63;
	static class115 field83;
	static class115[] field261;
	static class196 field253;
	static class205 field148;
	static class234 field268;
	static class24 field58;
	static class247 field59;
	static class247 field85;
	static class254 field222;
	static class254 field24;
	static class257 field242;
	static class287[] field176;
	static class344 field199;
	static class344 field89;
	static class35 field293;
	static class363 field289;
	static class366 field35;
	static class379[] field247;
	static class407 field294;
	static class411 field151;
	static class419[] field248;
	static class522[] field281;
	static class541 field217;
	static class60 field180;
	static class60 field191;
	static class60 field206;
	static class60 field296;
	static class7 field71;
	static class75 field48;
	static class76[] field78;
	static class84[] field47;
	static class86 field130;
	static class86 field144;
	static class86 field204;
	static class86 field218;
	static class86 field220;
	static class86 field257;
	static class86 field273;
	static class86[][][] field143;
	static class94 field32;
	static class94 field33;
	static int field100;
	static int field101;
	static int field102;
	static int field103;
	static int field105;
	static int field107;
	static int field108;
	static int field109;
	static int field11;
	static int field113;
	static int field117;
	static int field120;
	static int field121;
	static int field122;
	static int field123;
	static int field124;
	static int field128;
	static int field131;
	static int field132;
	static int field134;
	static int field137;
	static int field141;
	static int field142;
	static int field145;
	static int field15;
	static int field152;
	static int field159;
	static int field164;
	static int field165;
	static int field166;
	static int field167;
	static int field168;
	static int field17;
	static int field170;
	static int field171;
	static int field173;
	static int field174;
	static int field175;
	static int field177;
	static int field178;
	static int field179;
	static int field18;
	static int field181;
	static int field182;
	static int field183;
	static int field189;
	static int field19;
	static int field190;
	static int field193;
	static int field194;
	static int field195;
	static int field20;
	static int field201;
	static int field203;
	static int field205;
	static int field207;
	static int field208;
	static int field209;
	static int field21;
	static int field210;
	static int field211;
	static int field212;
	static int field213;
	static int field216;
	static int field219;
	static int field223;
	static int field224;
	static int field23;
	static int field232;
	static int field236;
	static int field237;
	static int field240;
	static int field243;
	static int field249;
	static int field25;
	static int field250;
	static int field254;
	static int field256;
	static int field258;
	static int field262;
	static int field27;
	static int field272;
	static int field274;
	static int field28;
	static int field284;
	static int field285;
	static int field288;
	static int field290;
	static int field291;
	static int field297;
	static int field301;
	static int field302;
	static int field306;
	static int field34;
	static int field36;
	static int field37;
	static int field38;
	static int field39;
	static int field4;
	static int field40;
	static int field41;
	static int field42;
	static int field44;
	static int field5;
	static int field55;
	static int field56;
	static int field6;
	static int field64;
	static int field69;
	static int field73;
	static int field74;
	static int field75;
	static int field76;
	static int field77;
	static int field8;
	static int field81;
	static int field82;
	static int field84;
	static int field86;
	static int field87;
	static int field9;
	static int field92;
	static int field93;
	static int field94;
	static int field96;
	static int field97;
	static int field98;
	static int field99;
	static int[] field10;
	static int[] field110;
	static int[] field111;
	static int[] field114;
	static int[] field115;
	static int[] field127;
	static int[] field135;
	static int[] field147;
	static int[] field153;
	static int[] field154;
	static int[] field156;
	static int[] field157;
	static int[] field184;
	static int[] field196;
	static int[] field2;
	static int[] field200;
	static int[] field202;
	static int[] field214;
	static int[] field215;
	static int[] field221;
	static int[] field225;
	static int[] field228;
	static int[] field229;
	static int[] field230;
	static int[] field231;
	static int[] field235;
	static int[] field244;
	static int[] field245;
	static int[] field251;
	static int[] field252;
	static int[] field259;
	static int[] field260;
	static int[] field263;
	static int[] field269;
	static int[] field287;
	static int[] field29;
	static int[] field295;
	static int[] field298;
	static int[] field304;
	static int[] field305;
	static int[] field62;
	static int[] field65;
	static int[][] field119;
	static int[][] field12;
	static int[][][] field80;
	static String field169;
	static String field186;
	static String field197;
	static String field31;
	static String[] field118;
	static String[] field158;
	static String[] field26;
	static String[] field277;
	static ArrayList field300;
	static HashMap field72;
	static List field172;
	static long field133;
	static long field146;
	static long field233;
	static long field246;
	static long field66;
	static long[] field149;
	static short field112;
	static short field162;
	static short field276;
	static short field278;
	static short field279;
	static short field280;
	static short field282;
	static short field283;
	static final class85 field303;
	static final int[] field138;
	static final int[] field188;
	static final String field139;
	static final String field255;
	boolean field50;
	class42 field90;
	class454 field125;
	class454 field52;
	class56 field60;
	class57 field46;
	OtlTokenRequester field155;
	RefreshAccessTokenRequester field53;
	int field51;
	String field45;
	Future field49;
	Future field54;
	long field61;

	static {
		field43 = true;
		field3 = 1;
		field4 = 0;
		field28 = 0;
		field30 = false;
		field7 = false;
		field8 = -1;
		field9 = -1;
		field21 = -1;
		field238 = false;
		field185 = 216;
		field87 = 0;
		field14 = false;
		field16 = true;
		field306 = 0;
		field66 = -1L;
		field19 = -1;
		field20 = -1;
		field146 = -1L;
		field22 = true;
		field23 = 0;
		field81 = 0;
		field25 = 0;
		field44 = 0;
		field27 = 0;
		field170 = 0;
		field34 = 0;
		field190 = 0;
		field223 = 0;
		field32 = class94.field934;
		field33 = class94.field934;
		field67 = false;
		field35 = class366.field3093;
		field36 = 0;
		field37 = 0;
		field183 = 0;
		field39 = 0;
		field18 = 0;
		field69 = 0;
		field141 = 0;
		field253 = class196.field1794;
		field48 = class75.field829;
		int var2 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var3 = new byte[var2];

		int var4;
		char var5;
		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		String var0 = class533.method2569(var3, 0, var3.length);
		field255 = var0;
		var2 = "com_jagex_auth_desktop_runelite:public".length();
		var3 = new byte[var2];

		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		var0 = class533.method2569(var3, 0, var3.length);
		field139 = var0;
		field57 = false;
		field58 = new class24();
		field286 = null;
		field63 = new class102[65536];
		field64 = 0;
		field2 = new int[65536];
		field117 = 0;
		field214 = new int[250];
		field68 = new class269();
		field56 = 0;
		field70 = false;
		field71 = new class7();
		field72 = new HashMap();
		field73 = 0;
		field107 = 1;
		field75 = 0;
		field76 = 1;
		field77 = 0;
		field78 = new class76[4];
		field79 = false;
		field80 = new int[4][13][13];
		field188 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field82 = 0;
		field84 = 2301979;
		field195 = 5063219;
		field86 = 3353893;
		field274 = 7759444;
		field88 = false;
		field207 = 0;
		field42 = 128;
		field181 = 0;
		field92 = 0;
		field93 = 0;
		field15 = 0;
		field159 = 0;
		field96 = 0;
		field97 = 50;
		field98 = 0;
		field99 = 0;
		field100 = 0;
		field101 = 12;
		field102 = 6;
		field103 = 0;
		field104 = false;
		field105 = 0;
		field106 = false;
		field145 = 0;
		field108 = 0;
		field40 = 50;
		field110 = new int[field40];
		field111 = new int[field40];
		field62 = new int[field40];
		field287 = new int[field40];
		field114 = new int[field40];
		field115 = new int[field40];
		field12 = new int[field40][];
		field263 = new int[field40];
		field118 = new String[field40];
		field119 = new int[104][104];
		field173 = 0;
		field121 = -1;
		field122 = -1;
		field123 = 0;
		field124 = 0;
		field182 = 0;
		field240 = 0;
		field292 = true;
		field128 = 0;
		field129 = true;
		field176 = new class287[2048];
		field131 = -1;
		field132 = 0;
		field133 = -1L;
		field241 = true;
		field6 = 0;
		field272 = 0;
		field29 = new int[1000];
		field138 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field26 = new String[8];
		field140 = new boolean[8];
		field184 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field142 = -1;
		field143 = new class86[4][104][104];
		field144 = new class86();
		field130 = new class86();
		field273 = new class86();
		field147 = new int[25];
		field295 = new int[25];
		field298 = new int[25];
		field150 = false;
		field116 = false;
		field152 = 0;
		field153 = new int[500];
		field154 = new int[500];
		field196 = new int[500];
		field156 = new int[500];
		field157 = new int[500];
		field158 = new String[500];
		field277 = new String[500];
		field160 = new boolean[500];
		field161 = false;
		field136 = false;
		field163 = true;
		field164 = -1;
		field165 = -1;
		field166 = 0;
		field167 = 50;
		field168 = 0;
		field169 = null;
		field95 = false;
		field171 = -1;
		field137 = -1;
		field186 = null;
		field197 = null;
		field175 = -1;
		field24 = new class254(8);
		field17 = 0;
		field178 = -1;
		field179 = 0;
		field180 = null;
		field120 = 0;
		field290 = 0;
		field91 = 0;
		field38 = -1;
		field299 = false;
		field296 = null;
		field187 = null;
		field206 = null;
		field189 = 0;
		field262 = 0;
		field191 = null;
		field192 = false;
		field193 = -1;
		field194 = -1;
		field239 = false;
		field41 = -1;
		field113 = -1;
		field198 = false;
		field5 = 1;
		field200 = new int[32];
		field201 = 0;
		field202 = new int[32];
		field203 = 0;
		field127 = new int[32];
		field205 = 0;
		field269 = new int[32];
		field134 = 0;
		field208 = 0;
		field209 = 0;
		field210 = 0;
		field211 = 0;
		field212 = 0;
		field213 = 0;
		field74 = 0;
		field55 = 0;
		field216 = 0;
		field217 = new class541();
		field218 = new class86();
		field204 = new class86();
		field220 = new class86();
		field257 = new class86();
		field222 = new class254(512);
		field174 = 0;
		field224 = -2;
		field13 = new boolean[100];
		field226 = new boolean[100];
		field227 = new boolean[100];
		field228 = new int[100];
		field229 = new int[100];
		field230 = new int[100];
		field231 = new int[100];
		field232 = 0;
		field233 = 0L;
		field234 = true;
		field235 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field236 = 0;
		field237 = 0;
		field31 = "";
		field149 = new long[100];
		field11 = 0;
		field151 = new class411();
		field242 = new class257();
		field243 = 0;
		field244 = new int[128];
		field245 = new int[128];
		field246 = -1L;
		field247 = new class379[4];
		field248 = new class419[4];
		field249 = -1;
		field250 = 0;
		field251 = new int[1000];
		field252 = new int[1000];
		field261 = new class115[1000];
		field254 = 0;
		field177 = 0;
		field256 = 0;
		field275 = false;
		field258 = 0;
		field259 = new int[50];
		field260 = new int[50];
		field215 = new int[50];
		field10 = new int[50];
		field47 = new class84[50];
		field264 = false;
		field265 = false;
		field266 = false;
		field267 = false;
		field268 = null;
		field59 = null;
		field85 = null;
		field270 = false;
		field271 = new boolean[5];
		field65 = new int[5];
		field225 = new int[5];
		field135 = new int[5];
		field221 = new int[5];
		field276 = 256;
		field162 = 205;
		field278 = 256;
		field279 = 320;
		field280 = 1;
		field112 = 32767;
		field282 = 1;
		field283 = 32767;
		field284 = 0;
		field285 = 0;
		field219 = 0;
		field94 = 0;
		field288 = 0;
		field289 = new class363();
		field109 = -1;
		field291 = -1;
		field148 = new class536();
		field281 = new class522[8];
		field293 = new class35();
		field294 = new class407(8, class14.field379);
		field199 = new class344(64);
		field89 = new class344(64);
		field297 = -1;
		field126 = -1;
		field172 = new ArrayList();
		field300 = new ArrayList(10);
		field301 = 0;
		field302 = 0;
		field303 = new class85();
		field304 = new int[50];
		field305 = new int[50];
	}

	public Client() {
		this.field50 = false;
		this.field51 = 0;
		this.field61 = -1L;
	}

	protected final void method966() {
	}

	public final void init() {
		if (this.method969()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (null != var2) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class278.field2464)) {
							field30 = true;
						} else {
							field30 = false;
						}
						break;
					case 4:
						if (field9 == -1) {
							field9 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field4 = Integer.parseInt(var2);
						break;
					case 6:
						class395.field3318 = class168.method925(Integer.parseInt(var2));
						break;
					case 7:
						int var4 = Integer.parseInt(var2);
						class455[] var5 = class349.method1919();
						int var6 = 0;

						class455 var12;
						while (true) {
							if (var6 >= var5.length) {
								var12 = null;
								break;
							}

							class455 var7 = var5[var6];
							if (var4 == var7.field3970) {
								var12 = var7;
								break;
							}

							++var6;
						}

						class467.field4006 = var12;
						break;
					case 8:
						if (var2.equalsIgnoreCase(class278.field2464)) {
						}
						break;
					case 9:
						class354.field3029 = var2;
						break;
					case 10:
						class460[] var11 = new class460[]{class460.field3977, class460.field3984, class460.field3978, class460.field3983, class460.field3979, class460.field3981};
						class498.field4148 = (class460)class451.method2249(var11, Integer.parseInt(var2));
						if (class460.field3981 == class498.field4148) {
							class168.field1640 = class392.field3285;
						} else {
							class168.field1640 = class392.field3287;
						}
						break;
					case 11:
						class162.field1524 = var2;
						break;
					case 12:
						field3 = Integer.parseInt(var2);
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
						class498.field4147 = Integer.parseInt(var2);
						break;
					case 15:
						field28 = Integer.parseInt(var2);
						break;
					case 17:
						class518.field4224 = var2;
						break;
					case 21:
						field8 = Integer.parseInt(var2);
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							field185 = Integer.parseInt(var2);
						} else {
							field185 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			class317.field2861 = false;
			field7 = false;
			class275.field2448 = this.getCodeBase().getHost();
			class336.field2933 = new class288();
			String var9 = class467.field4006.field3965;
			byte var10 = 0;
			if ((field4 & class162.field1507.method1970()) != 0) {
				class289.field2577 = "beta";
			}

			try {
				class324.method1828("oldschool", class289.field2577, var9, var10, 22);
			} catch (Exception var8) {
				class41.method263((String)null, var8);
			}

			class466.field3999 = this;
			class280.field2500 = field9;
			class454.method2260();
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field50 = true;
			}

			if (field21 == -1) {
				if (!this.method7() && !this.method30((byte)106)) {
					field21 = 0;
				} else {
					field21 = 5;
				}
			}

			this.method961(765, 503, 216, 1);
		}
	}

	protected void finalize() throws Throwable {
		class230.method1324(this);
		super.finalize();
	}

	boolean method35() {
		return this.field51 == 1;
	}

	public void setClient(int var1) {
		this.field51 = var1;
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (null != var1) {
			this.field155 = var1;
			class337.method1864(10);
		}
	}

	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field53 = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return field87 == 10;
	}

	public long getAccountHash() {
		return this.field61;
	}

	boolean method7() {
		return null != class240.field2210 && !class240.field2210.trim().isEmpty() && class148.field1398 != null && !class148.field1398.trim().isEmpty();
	}

	boolean method30(byte var1) {
		boolean var10000;
		if (null != class248.field2237) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			if (!class248.field2237.trim().isEmpty()) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				if (class20.field437 != null) {
					if (var1 <= -1) {
						throw new IllegalStateException();
					}

					if (!class20.field437.trim().isEmpty()) {
						if (var1 <= -1) {
							throw new IllegalStateException();
						}

						var10000 = true;
						return var10000;
					}
				}
			}
		}

		var10000 = false;
		return var10000;
	}

	boolean method8() {
		return null != this.field155;
	}

	void method33(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(class162.field1524 + "shield/oauth/token" + (new class327(var3)).method1834());
		class321 var5 = new class321();
		if (this.method35()) {
			var5.method1817(field139);
		} else {
			var5.method1817(field255);
		}

		var5.method1816("Host", (new URL(class162.field1524)).getHost());
		var5.method1819(class272.field2445);
		class148 var6 = class148.field1391;
		RefreshAccessTokenRequester var7 = this.field53;
		if (null != var7) {
			this.field54 = var7.request(var6.method855(), var4, var5.method1815(), "");
		} else {
			class503 var8 = new class503(var4, var6, var5, this.field50);
			this.field52 = this.field46.method421(var8);
		}
	}

	void method9(String var1) throws IOException {
		URL var3 = new URL(class162.field1524 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class321 var4 = new class321();
		var4.method1826(var1);
		class148 var5 = class148.field1390;
		OtlTokenRequester var6 = this.field155;
		if (null != var6) {
			this.field49 = var6.request(var5.method855(), var3, var4.method1815(), "");
		} else {
			class503 var7 = new class503(var3, var5, var4, this.field50);
			this.field125 = this.field46.method421(var7);
		}
	}

	void method29(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(class162.field1524 + "game-session/v1/tokens");
		class503 var5 = new class503(var4, class148.field1391, this.field50);
		var5.method2426().method1826(var1);
		var5.method2426().method1819(class272.field2445);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", var2);
		var5.method2422(new class514(var6));
		this.field125 = this.field46.method421(var5);
	}

	protected final void method972() {
		class160.method896(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class192.field1776 = field28 == 0 ? 43594 : field3 + 40000;
		class452.field3957 = field28 == 0 ? 443 : field3 + 50000;
		class239.field2207 = class192.field1776;
		class349.field3005 = class231.field2094;
		class131.field1279 = class231.field2097;
		class363.field3059 = class231.field2095;
		class363.field3066 = class231.field2096;
		class136.field1326 = new class237(this.field50, 216);
		this.method947();
		this.method949();
		class391.field3275 = this.method976();
		this.method974(field242, 0);
		this.method974(field151, 1);
		class290.field2580 = new class124(255, class297.field2739, class297.field2740, 500000);
		class307 var3 = null;
		class516 var4 = new class516();

		try {
			var3 = class475.method2301("", class498.field4148.field3982, false);
			byte[] var5 = new byte[(int)var3.method1736()];

			int var7;
			for (int var6 = 0; var6 < var5.length; var6 += var7) {
				var7 = var3.method1737(var5, var6, var5.length - var6);
				if (var7 == -1) {
					throw new IOException();
				}
			}

			var4 = new class516(new class42(var5));
		} catch (Exception var9) {
		}

		try {
			if (null != var3) {
				var3.method1738();
			}
		} catch (Exception var8) {
		}

		class176.field1701 = var4;
		this.method944();
		class451.method2247(this, class454.field3961);
		class295.method1680(class176.field1701.method2503());
		class316.field2827 = new class208(class168.field1640);
		this.field46 = new class57("tokenRequest", 1, 1);
		if (!class92.field906.contains(this)) {
			class92.field906.add(this);
		}

		class185.field1747 = new class173[1];
		class61 var10 = class61.field792;
		class185.field1747[0] = new class173(var10.field794, var10.field799);
	}

	protected final void method973() {
		++field306;
		this.method12();

		while (true) {
			class329 var2;
			synchronized(class146.field1385) {
				var2 = (class329)class146.field1383.method561();
			}

			if (null == var2) {
				boolean var8 = class8.method85();
				if (var8 && field275 && null != class233.field2104) {
					class233.field2104.method1862();
				}

				class77.method535();
				field151.method2114();
				this.method948();
				synchronized(class184.field1742) {
					class184.field1735 = class184.field1731;
					class184.field1745 = class184.field1732;
					class184.field1728 = class184.field1733;
					class184.field1736 = class184.field1734;
					class184.field1739 = class184.field1737;
					class184.field1740 = class184.field1746;
					class184.field1741 = class184.field1744;
					class184.field1729 = class184.field1738;
					class184.field1737 = 0;
				}

				if (null != class391.field3275) {
					int var3 = class391.field3275.method1676();
					field216 = var3;
				}

				if (field87 == 0) {
					class425.method2176();
					class269.method1575();
				} else if (field87 == 5) {
					class410.method2111(this, class177.field1705, class324.field2900);
					class425.method2176();
					class269.method1575();
				} else if (field87 != 10 && field87 != 11) {
					if (field87 == 20) {
						class410.method2111(this, class177.field1705, class324.field2900);
						this.method13();
					} else if (field87 == 50) {
						class410.method2111(this, class177.field1705, class324.field2900);
						this.method13();
					} else if (field87 == 25) {
						class229.method1322();
					}
				} else {
					class410.method2111(this, class177.field1705, class324.field2900);
				}

				if (field87 == 30) {
					this.method32();
				} else if (field87 == 40 || field87 == 45) {
					this.method13();
				}

				return;
			}

			var2.field2910.method1883(var2.field2909, (int)var2.field3987, var2.field2907, false);
		}
	}

	protected final void method962(boolean var1) {
		if ((field87 == 10 || field87 == 20 || field87 == 30) && 0L != field233 && class172.method977() > field233) {
			class295.method1680(class185.method1022());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field13[var3] = true;
			}
		}

		if (field87 == 0) {
			this.method959(class116.field1093, class116.field1094, var1);
		} else if (field87 == 5) {
			class535.method2574(class488.field4114, class177.field1705, class324.field2900);
		} else if (field87 != 10 && field87 != 11) {
			if (field87 == 20) {
				class535.method2574(class488.field4114, class177.field1705, class324.field2900);
			} else if (field87 == 50) {
				class535.method2574(class488.field4114, class177.field1705, class324.field2900);
			} else if (field87 == 25) {
				if (field77 == 1) {
					if (field73 > field107) {
						field107 = field73;
					}

					var3 = (field107 * 50 - field73 * 50) / field107;
					class200.method1140(class433.field3551 + class278.field2469 + class278.field2463 + var3 + "%" + class278.field2465, false);
				} else if (field77 == 2) {
					if (field75 > field76) {
						field76 = field75;
					}

					var3 = 50 + (field76 * 50 - field75 * 50) / field76;
					class200.method1140(class433.field3551 + class278.field2469 + class278.field2463 + var3 + "%" + class278.field2465, false);
				} else {
					class200.method1140(class433.field3551, false);
				}
			} else if (field87 == 30) {
				this.method15();
			} else if (field87 == 40) {
				class200.method1140(class433.field3552 + class278.field2469 + class433.field3553, false);
			} else if (field87 == 45) {
				class200.method1140(class433.field3812, false);
			}
		} else {
			class535.method2574(class488.field4114, class177.field1705, class324.field2900);
		}

		if (field87 == 30 && field232 == 0 && !var1 && !field234) {
			for (var3 = 0; var3 < field174; ++var3) {
				if (field226[var3]) {
					class94.field937.method605(field228[var3], field229[var3], field230[var3], field231[var3]);
					field226[var3] = false;
				}
			}
		} else if (field87 > 0) {
			class94.field937.method604(0, 0);

			for (var3 = 0; var3 < field174; ++var3) {
				field226[var3] = false;
			}
		}

	}

	protected final void method943() {
		if (class451.field3950.method177()) {
			class451.field3950.method175();
		}

		if (class525.field4240 != null) {
			class525.field4240.field3236 = false;
		}

		class525.field4240 = null;
		field68.method1574();
		if (class184.field1742 != null) {
			synchronized(class184.field1742) {
				class184.field1742 = null;
			}
		}

		class391.field3275 = null;
		if (class233.field2104 != null) {
			class233.field2104.method1854();
		}

		class336.field2933.method1653();
		class61.method475();
		if (class136.field1326 != null) {
			class136.field1326.method1685();
			class136.field1326 = null;
		}

		class162.method898();
		this.field46.method422();
	}

	void method12() {
		if (field87 != 1000) {
			boolean var2 = class336.field2933.method1652();
			if (!var2) {
				this.method28();
			}

		}
	}

	void method28() {
		if (class336.field2933.field2552 >= 4) {
			this.method963("js5crc");
			class104.method675(1000);
		} else {
			if (class336.field2933.field2575 >= 4) {
				if (field87 <= 5) {
					this.method963("js5io");
					class104.method675(1000);
					return;
				}

				field37 = 3000;
				class336.field2933.field2575 = 3;
			}

			if (--field37 + 1 <= 0) {
				try {
					if (field36 == 0) {
						class525.field4245 = class172.field1652.method1699(class275.field2448, class239.field2207);
						++field36;
					}

					if (field36 == 1) {
						if (class525.field4245.field1313 == 2) {
							this.method27(-1);
							return;
						}

						if (class525.field4245.field1313 == 1) {
							++field36;
						}
					}

					if (field36 == 2) {
						Socket var3 = (Socket)class525.field4245.field1314;
						class244 var2 = new class244(var3, 40000, 5000);
						class488.field4112 = var2;
						class42 var4 = new class42(5);
						var4.method267(15);
						var4.method333(216);
						class488.field4112.method2192(var4.field525, 0, 5);
						++field36;
						class295.field2730 = class172.method977();
					}

					if (field36 == 3) {
						if (class488.field4112.method2191() > 0) {
							int var6 = class488.field4112.method2193();
							if (var6 != 0) {
								this.method27(var6);
								return;
							}

							++field36;
						} else if (class172.method977() - class295.field2730 > 30000L) {
							this.method27(-2);
							return;
						}
					}

					if (field36 == 4) {
						class336.field2933.method1647(class488.field4112, field87 > 20);
						class525.field4245 = null;
						class488.field4112 = null;
						field36 = 0;
						field183 = 0;
					}
				} catch (IOException var5) {
					this.method27(-3);
				}

			}
		}
	}

	void method27(int var1) {
		class525.field4245 = null;
		class488.field4112 = null;
		field36 = 0;
		if (class239.field2207 == class192.field1776) {
			class239.field2207 = class452.field3957;
		} else {
			class239.field2207 = class192.field1776;
		}

		++field183;
		if (field183 < 2 || var1 != 7 && var1 != 9) {
			if (field183 >= 2 && var1 == 6) {
				this.method963("js5connect_outofdate");
				class104.method675(1000);
			} else if (field183 >= 4) {
				if (field87 <= 5) {
					this.method963("js5connect");
					class104.method675(1000);
				} else {
					field37 = 3000;
				}
			}
		} else if (field87 <= 5) {
			this.method963("js5connect_full");
			class104.method675(1000);
		} else {
			field37 = 3000;
		}

	}

	final void method13() {
		Object var2 = field68.method1573();
		class347 var3 = field68.field2427;

		try {
			if (field39 == 0) {
				if (null == class402.field3381 && (field58.method192() || field18 > 250)) {
					class402.field3381 = field58.method193();
					field58.method197();
					field58 = null;
				}

				if (null != class402.field3381) {
					if (var2 != null) {
						((class431)var2).method2194();
						var2 = null;
					}

					class285.field2520 = null;
					field70 = false;
					field18 = 0;
					if (field48.method523()) {
						if (this.method7()) {
							try {
								this.method33(class148.field1398);
								class105.method679(21);
							} catch (Throwable var21) {
								class41.method263((String)null, var21);
								class484.method2401(65);
								return;
							}
						} else {
							if (!this.method30((byte)6)) {
								class484.method2401(65);
								return;
							}

							try {
								this.method29(class248.field2237, class20.field437);
								class105.method679(20);
							} catch (Exception var20) {
								class41.method263((String)null, var20);
								class484.method2401(65);
								return;
							}
						}
					} else {
						class105.method679(1);
					}
				}
			}

			class4 var23;
			if (field39 == 21) {
				if (null != this.field54) {
					if (!this.field54.isDone()) {
						return;
					}

					if (this.field54.isCancelled()) {
						class484.method2401(65);
						this.field54 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field54.get();
						if (!var4.isSuccess()) {
							class484.method2401(65);
							this.field54 = null;
							return;
						}

						class240.field2210 = var4.getAccessToken();
						class148.field1398 = var4.getRefreshToken();
						this.field54 = null;
					} catch (Exception var19) {
						class41.method263((String)null, var19);
						class484.method2401(65);
						this.field54 = null;
						return;
					}
				} else {
					if (null == this.field52) {
						class484.method2401(65);
						return;
					}

					if (!this.field52.method2256()) {
						return;
					}

					if (this.field52.method2257()) {
						class41.method263(this.field52.method2259(), (Throwable)null);
						class484.method2401(65);
						this.field52 = null;
						return;
					}

					var23 = this.field52.method2258();
					if (var23.method45() != 200) {
						class484.method2401(65);
						this.field52 = null;
						return;
					}

					field18 = 0;
					class514 var5 = new class514(var23.method47());

					try {
						class240.field2210 = var5.method2442().getString("access_token");
						class148.field1398 = var5.method2442().getString("refresh_token");
					} catch (Exception var18) {
						class41.method263("Error parsing tokens", var18);
						class484.method2401(65);
						this.field52 = null;
						return;
					}
				}

				this.method9(class240.field2210);
				class105.method679(20);
			}

			if (field39 == 20) {
				if (this.field49 != null) {
					if (!this.field49.isDone()) {
						return;
					}

					if (this.field49.isCancelled()) {
						class484.method2401(65);
						this.field49 = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.field49.get();
						if (!var24.isSuccess()) {
							class484.method2401(65);
							this.field49 = null;
							return;
						}

						this.field45 = var24.getToken();
						this.field49 = null;
					} catch (Exception var17) {
						class41.method263((String)null, var17);
						class484.method2401(65);
						this.field49 = null;
						return;
					}
				} else {
					if (this.field125 == null) {
						class484.method2401(65);
						return;
					}

					if (!this.field125.method2256()) {
						return;
					}

					if (this.field125.method2257()) {
						class41.method263(this.field125.method2259(), (Throwable)null);
						class484.method2401(65);
						this.field125 = null;
						return;
					}

					var23 = this.field125.method2258();
					if (var23.method45() != 200) {
						class41.method263("Response code: " + var23.method45() + "Response body: " + var23.method47(), (Throwable)null);
						class484.method2401(65);
						this.field125 = null;
						return;
					}

					List var26 = (List)var23.method46().get("Content-Type");
					if (var26 != null && var26.contains(class272.field2445.method1588())) {
						try {
							JSONObject var6 = new JSONObject(var23.method47());
							this.field45 = var6.getString("token");
						} catch (JSONException var16) {
							class41.method263((String)null, var16);
							class484.method2401(65);
							this.field125 = null;
							return;
						}
					} else {
						this.field45 = var23.method47();
					}

					this.field125 = null;
				}

				field18 = 0;
				class105.method679(1);
			}

			if (field39 == 1) {
				if (class285.field2520 == null) {
					class285.field2520 = class172.field1652.method1699(class275.field2448, class239.field2207);
				}

				if (class285.field2520.field1313 == 2) {
					throw new IOException();
				}

				if (class285.field2520.field1313 == 1) {
					Socket var27 = (Socket)class285.field2520.field1314;
					class244 var25 = new class244(var27, 40000, 5000);
					var2 = var25;
					field68.method1571(var25);
					class285.field2520 = null;
					class105.method679(2);
				}
			}

			class160 var29;
			if (field39 == 2) {
				field68.method1576();
				var29 = class464.method2275((byte)-1);
				var29.field1478 = null;
				var29.field1479 = 0;
				var29.field1483 = new class347(5000);
				var29.field1483.method267(class528.field4262.field4260);
				field68.method1570(var29);
				field68.method1569();
				var3.field527 = 0;
				class105.method679(3);
			}

			int var28;
			if (field39 == 3) {
				if (class233.field2104 != null) {
					class233.field2104.method1853();
				}

				if (((class431)var2).method2189(1)) {
					var28 = ((class431)var2).method2193();
					if (null != class233.field2104) {
						class233.field2104.method1853();
					}

					if (var28 != 0) {
						class484.method2401(var28);
						return;
					}

					var3.field527 = 0;
					class105.method679(4);
				}
			}

			if (field39 == 4) {
				if (var3.field527 < 8) {
					var28 = ((class431)var2).method2191();
					if (var28 > 8 - var3.field527) {
						var28 = 8 - var3.field527;
					}

					if (var28 > 0) {
						((class431)var2).method2190(var3.field525, var3.field527, var28);
						var3.field527 += var28;
					}
				}

				if (var3.field527 == 8) {
					var3.field527 = 0;
					class98.field994 = var3.method283();
					class105.method679(5);
				}
			}

			if (field39 == 5) {
				field68.field2427.field527 = 0;
				field68.method1576();
				class347 var34 = new class347(500);
				int[] var30 = new int[]{class402.field3381.nextInt(), class402.field3381.nextInt(), class402.field3381.nextInt(), class402.field3381.nextInt()};
				var34.field527 = 0;
				var34.method267(1);
				var34.method333(var30[0]);
				var34.method333(var30[1]);
				var34.method333(var30[2]);
				var34.method333(var30[3]);
				var34.method304(class98.field994);
				if (field87 == 40) {
					var34.method333(class447.field3937[0]);
					var34.method333(class447.field3937[1]);
					var34.method333(class447.field3937[2]);
					var34.method333(class447.field3937[3]);
				} else {
					if (field87 == 50) {
						var34.method267(class196.field1789.method1970());
						var34.method333(class423.field3513);
					} else {
						var34.method267(field253.method1970());
						switch(field253.field1792) {
						case 0:
							var34.method333(class176.field1701.method2512(class116.field1110));
						case 1:
						default:
							break;
						case 2:
						case 4:
							var34.method319(class242.field2213);
							++var34.field527;
							break;
						case 3:
							var34.field527 += 4;
						}
					}

					if (field48.method523()) {
						var34.method267(class75.field828.method1970());
						var34.method270(this.field45);
					} else {
						var34.method267(class75.field829.method1970());
						var34.method270(class116.field1103);
					}
				}

				var34.method311(class487.field4108, class487.field4109);
				class447.field3937 = var30;
				class160 var7 = class464.method2275((byte)-1);
				var7.field1478 = null;
				var7.field1479 = 0;
				var7.field1483 = new class347(5000);
				var7.field1483.field527 = 0;
				if (field87 == 40) {
					var7.field1483.method267(class528.field4257.field4260);
				} else {
					var7.field1483.method267(class528.field4256.field4260);
				}

				var7.field1483.method308(0);
				int var8 = var7.field1483.field527;
				var7.field1483.method333(216);
				var7.field1483.method333(1);
				var7.field1483.method267(field9);
				var7.field1483.method267(field21);
				byte var9 = 0;
				var7.field1483.method267(var9);
				var7.field1483.method272(var34.field525, 0, var34.field527);
				int var10 = var7.field1483.field527;
				var7.field1483.method270(class116.field1110);
				var7.field1483.method267((field234 ? 1 : 0) << 1 | (field7 ? 1 : 0));
				var7.field1483.method308(class237.field2181);
				var7.field1483.method308(class5.field322);
				class5.method53(var7.field1483);
				var7.field1483.method270(class354.field3029);
				var7.field1483.method333(class498.field4147);
				if (field185 > 213) {
					var7.field1483.method267(0);
				}

				class42 var11 = new class42(class454.field3963.method759());
				class454.field3963.method758(var11);
				var7.field1483.method272(var11.field525, 0, var11.field525.length);
				var7.field1483.method267(field9);
				var7.field1483.method333(0);
				var7.field1483.method287(class286.field2521.field2019);
				var7.field1483.method287(class38.field502.field2019);
				var7.field1483.method287(class188.field1755.field2019);
				var7.field1483.method287(class39.field516.field2019);
				var7.field1483.method287(class79.field843.field2019);
				var7.field1483.method316(class154.field1451.field2019);
				var7.field1483.method333(class54.field605.field2019);
				var7.field1483.method315(class15.field383.field2019);
				var7.field1483.method333(class94.field932.field2019);
				var7.field1483.method287(class503.field4165.field2019);
				var7.field1483.method287(0);
				var7.field1483.method316(class395.field3319.field2019);
				var7.field1483.method287(class287.field2551.field2019);
				var7.field1483.method315(class371.field3106.field2019);
				var7.field1483.method287(class26.field457.field2019);
				var7.field1483.method316(class174.field1690.field2019);
				var7.field1483.method315(class465.field3998.field2019);
				var7.field1483.method333(class96.field980.field2019);
				var7.field1483.method315(class445.field3911.field2019);
				var7.field1483.method316(class337.field2945.field2019);
				var7.field1483.method333(class522.field4234.field2019);
				var7.field1483.method321(var30, var10, var7.field1483.field527);
				var7.field1483.method275(var7.field1483.field527 - var8);
				field68.method1570(var7);
				field68.method1569();
				field68.field2426 = new class126(var30);
				int[] var12 = new int[4];

				for (int var13 = 0; var13 < 4; ++var13) {
					var12[var13] = var30[var13] + 50;
				}

				var3.method1896(var12);
				class105.method679(6);
			}

			int var32;
			if (field39 == 6 && ((class431)var2).method2191() > 0) {
				var28 = ((class431)var2).method2193();
				if (var28 == 61) {
					var32 = ((class431)var2).method2191();
					class292.field2722 = var32 == 1 && ((class431)var2).method2193() == 1;
					class105.method679(5);
				}

				if (var28 == 21 && field87 == 20) {
					class105.method679(12);
				} else if (var28 == 2) {
					class105.method679(14);
				} else if (var28 == 15 && field87 == 40) {
					field68.field2429 = -1;
					class105.method679(19);
				} else if (var28 == 64) {
					class105.method679(10);
				} else if (var28 == 23 && field69 < 1) {
					++field69;
					class105.method679(0);
				} else if (var28 == 29) {
					class105.method679(17);
				} else {
					if (var28 != 69) {
						class484.method2401(var28);
						return;
					}

					class105.method679(7);
				}
			}

			if (field39 == 7 && ((class431)var2).method2191() >= 2) {
				((class431)var2).method2190(var3.field525, 0, 2);
				var3.field527 = 0;
				class391.field3273 = var3.method327();
				class105.method679(8);
			}

			if (field39 == 8 && ((class431)var2).method2191() >= class391.field3273) {
				var3.field527 = 0;
				((class431)var2).method2190(var3.field525, var3.field527, class391.field3273);
				class290 var38 = class482.method2398()[var3.method278()];

				try {
					switch(var38.field2581) {
					case 0:
						class127 var35 = new class127();
						this.field60 = new class56(var3, var35);
						class105.method679(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var15) {
					class484.method2401(22);
					return;
				}
			}

			if (field39 == 9 && this.field60.method416()) {
				this.field90 = this.field60.method415();
				this.field60.method413();
				this.field60 = null;
				if (this.field90 == null) {
					class484.method2401(22);
					return;
				}

				field68.method1576();
				var29 = class464.method2275((byte)-1);
				var29.field1478 = null;
				var29.field1479 = 0;
				var29.field1483 = new class347(5000);
				var29.field1483.method267(class528.field4258.field4260);
				var29.field1483.method308(this.field90.field527);
				var29.field1483.method273(this.field90);
				field68.method1570(var29);
				field68.method1569();
				this.field90 = null;
				class105.method679(6);
			}

			if (field39 == 10 && ((class431)var2).method2191() > 0) {
				class451.field3943 = ((class431)var2).method2193();
				class105.method679(11);
			}

			if (field39 == 11 && ((class431)var2).method2191() >= class451.field3943) {
				((class431)var2).method2190(var3.field525, 0, class451.field3943);
				var3.field527 = 0;
				class105.method679(6);
			}

			if (field39 == 12 && ((class431)var2).method2191() > 0) {
				field141 = (((class431)var2).method2193() + 3) * 60;
				class105.method679(13);
			}

			if (field39 == 13) {
				field18 = 0;
				class174.method993(class433.field3583, class433.field3584, field141 / 60 + class433.field3763);
				if (--field141 <= 0) {
					class105.method679(0);
				}

			} else {
				if (field39 == 14 && ((class431)var2).method2191() >= 1) {
					class506.field4180 = ((class431)var2).method2193();
					class105.method679(15);
				}

				if (field39 == 15 && ((class431)var2).method2191() >= class506.field4180) {
					boolean var40 = ((class431)var2).method2193() == 1;
					((class431)var2).method2190(var3.field525, 0, 4);
					var3.field527 = 0;
					boolean var39 = false;
					if (var40) {
						var32 = var3.method1898() << 24;
						var32 |= var3.method1898() << 16;
						var32 |= var3.method1898() << 8;
						var32 |= var3.method1898();
						class176.field1701.method2504(class116.field1110, var32);
					}

					if (field57) {
						class176.field1701.method2499(class116.field1110);
					} else {
						class176.field1701.method2499((String)null);
					}

					class505.method2431();
					field91 = ((class431)var2).method2193();
					field299 = ((class431)var2).method2193() == 1;
					field131 = ((class431)var2).method2193();
					field131 <<= 8;
					field131 += ((class431)var2).method2193();
					field132 = ((class431)var2).method2193();
					((class431)var2).method2190(var3.field525, 0, 8);
					var3.field527 = 0;
					this.field61 = var3.method283();
					((class431)var2).method2190(var3.field525, 0, 8);
					var3.field527 = 0;
					field133 = var3.method283();
					if (field185 >= 214) {
						((class431)var2).method2190(var3.field525, 0, 8);
						var3.field527 = 0;
						var3.method283();
					}

					((class431)var2).method2190(var3.field525, 0, 1);
					var3.field527 = 0;
					class291[] var31 = class225.method1265();
					int var37 = var3.method1902();
					if (var37 < 0 || var37 >= var31.length) {
						throw new IOException(var37 + " " + var3.field527);
					}

					field68.field2423 = var31[var37];
					field68.field2429 = field68.field2423.field2707;
					((class431)var2).method2190(var3.field525, 0, 2);
					var3.field527 = 0;
					field68.field2429 = var3.method327();

					try {
						Client var41 = class466.field3999;
						JSObject.getWindow(var41).call("zap", (Object[])null);
					} catch (Throwable var14) {
					}

					class105.method679(16);
				}

				if (field39 != 16) {
					if (field39 == 17 && ((class431)var2).method2191() >= 2) {
						var3.field527 = 0;
						((class431)var2).method2190(var3.field525, 0, 2);
						var3.field527 = 0;
						class461.field3985 = var3.method327();
						class105.method679(18);
					}

					if (field39 == 18 && ((class431)var2).method2191() >= class461.field3985) {
						var3.field527 = 0;
						((class431)var2).method2190(var3.field525, 0, class461.field3985);
						var3.field527 = 0;
						String var45 = var3.method286();
						String var43 = var3.method286();
						String var36 = var3.method286();
						class174.method993(var45, var43, var36);
						class104.method675(10);
						if (field48.method523()) {
							class337.method1864(9);
						}
					}

					if (field39 == 19) {
						if (field68.field2429 == -1) {
							if (((class431)var2).method2191() < 2) {
								return;
							}

							((class431)var2).method2190(var3.field525, 0, 2);
							var3.field527 = 0;
							field68.field2429 = var3.method327();
						}

						if (((class431)var2).method2191() >= field68.field2429) {
							((class431)var2).method2190(var3.field525, 0, field68.field2429);
							var3.field527 = 0;
							var28 = field68.field2429;
							field71.method57();
							class535.method2575();
							class163.method909(var3);
							if (var3.field527 != var28) {
								throw new RuntimeException();
							}
						}
					} else {
						++field18;
						if (field18 > 2000) {
							if (field69 < 1) {
								if (class192.field1776 == class239.field2207) {
									class239.field2207 = class452.field3957;
								} else {
									class239.field2207 = class192.field1776;
								}

								++field69;
								class105.method679(0);
							} else {
								class484.method2401(-3);
							}
						}
					}
				} else {
					if (((class431)var2).method2191() >= field68.field2429) {
						var3.field527 = 0;
						((class431)var2).method2190(var3.field525, 0, field68.field2429);
						field71.method60();
						field66 = -1L;
						class525.field4240.field3232 = 0;
						class229.field2086 = true;
						field22 = true;
						field246 = -1L;
						class355.method1937();
						field68.method1576();
						field68.field2427.field527 = 0;
						field68.field2423 = null;
						field68.field2428 = null;
						field68.field2434 = null;
						field68.field2435 = null;
						field68.field2429 = 0;
						field68.field2433 = 0;
						field23 = 0;
						field56 = 0;
						field81 = 0;
						class22.method185();
						class4.method48(0);
						class121.method754();
						field168 = 0;
						field95 = false;
						field258 = 0;
						field181 = 0;
						field96 = 0;
						class432.field3539 = null;
						field256 = 0;
						field249 = -1;
						field254 = 0;
						field177 = 0;
						field32 = class94.field934;
						field33 = class94.field934;
						field64 = 0;
						class481.field4085 = 0;

						for (var28 = 0; var28 < 2048; ++var28) {
							class481.field4093[var28] = null;
							class481.field4083[var28] = class394.field3317;
						}

						for (var28 = 0; var28 < 2048; ++var28) {
							field176[var28] = null;
						}

						for (var28 = 0; var28 < 65536; ++var28) {
							field63[var28] = null;
						}

						field142 = -1;
						field130.method559();
						field273.method559();

						for (var28 = 0; var28 < 4; ++var28) {
							for (var32 = 0; var32 < 104; ++var32) {
								for (int var33 = 0; var33 < 104; ++var33) {
									field143[var28][var32][var33] = null;
								}
							}
						}

						field144 = new class86();
						class316.field2827.method1162();

						for (var28 = 0; var28 < class243.field2215; ++var28) {
							class243 var42 = class85.method555(var28);
							if (null != var42) {
								class23.field445[var28] = 0;
								class23.field443[var28] = 0;
							}
						}

						class451.field3950.method181();
						field38 = -1;
						if (field175 != -1) {
							class43.method344(field175);
						}

						for (class534 var44 = (class534)field24.method1493(); null != var44; var44 = (class534)field24.method1494()) {
							class366.method1969(var44, true);
						}

						field175 = -1;
						field24 = new class254(8);
						field180 = null;
						class22.method185();
						field289.method1960((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

						for (var28 = 0; var28 < 8; ++var28) {
							field26[var28] = null;
							field140[var28] = false;
						}

						class528.method2551();
						field16 = true;

						for (var28 = 0; var28 < 100; ++var28) {
							field13[var28] = true;
						}

						class445.method2232();
						class141.field1358 = null;
						class481.field4095 = null;
						Arrays.fill(field247, (Object)null);
						class334.field2930 = null;
						Arrays.fill(field248, (Object)null);

						for (var28 = 0; var28 < 8; ++var28) {
							field281[var28] = new class522();
						}

						class2.field312 = null;
						field14 = false;
						class163.method909(var3);
						class38.field501 = -1;
						class368.method1974(false, var3);
						field68.field2423 = null;
					}

				}
			}
		} catch (IOException var22) {
			if (field69 < 1) {
				if (class192.field1776 == class239.field2207) {
					class239.field2207 = class452.field3957;
				} else {
					class239.field2207 = class192.field1776;
				}

				++field69;
				class105.method679(0);
			} else {
				class484.method2401(-2);
			}
		}
	}

	final void method32() {
		if (field23 > 1) {
			--field23;
		}

		if (field56 > 0) {
			--field56;
		}

		if (field70) {
			field70 = false;
			class480.method2394();
		} else {
			if (!field116) {
				class449.method2239();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method17(field68); ++var2) {
			}

			if (field87 == 30) {
				while (true) {
					class141 var3 = (class141)class493.field4136.method409();
					boolean var17;
					if (null == var3) {
						var17 = false;
					} else {
						var17 = true;
					}

					int var4;
					class160 var18;
					if (!var17) {
						class160 var19;
						int var20;
						if (field71.field330) {
							var19 = class85.method556(class129.field1188, field68.field2426);
							var19.field1483.method267(0);
							var20 = var19.field1483.field527;
							field71.method63(var19.field1483);
							var19.field1483.method276(var19.field1483.field527 - var20);
							field68.method1570(var19);
							field71.method61();
						}

						int var5;
						int var6;
						synchronized(class525.field4240.field3231) {
							if (!field43) {
								class525.field4240.field3232 = 0;
							} else if (class184.field1739 != 0 || class525.field4240.field3232 >= 40) {
								var18 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								int var7 = 0;

								int var8;
								for (var8 = 0; var8 < class525.field4240.field3232 && (null == var18 || var18.field1483.field527 - var4 < 246); ++var8) {
									var5 = var8;
									int var9 = class525.field4240.field3234[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									int var10 = class525.field4240.field3233[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (var10 != field19 || field20 != var9) {
										if (null == var18) {
											var18 = class85.method556(class129.field1248, field68.field2426);
											var18.field1483.method267(0);
											var4 = var18.field1483.field527;
											class347 var10000 = var18.field1483;
											var10000.field527 += 2;
											var6 = 0;
											var7 = 0;
										}

										int var11;
										int var12;
										int var13;
										if (field146 != -1L) {
											var11 = var10 - field19;
											var12 = var9 - field20;
											var13 = (int)((class525.field4240.field3235[var8] - field146) / 20L);
											var6 = (int)((long)var6 + (class525.field4240.field3235[var8] - field146) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field19 = var10;
										field20 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var18.field1483.method308((var13 << 12) + (var11 << 6) + var12);
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var18.field1483.method267(var13 + 128);
											var18.field1483.method308(var12 + (var11 << 8));
										} else if (var13 < 32) {
											var18.field1483.method267(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var18.field1483.method333(var10 | var9 << 16);
											} else {
												var18.field1483.method333(Integer.MIN_VALUE);
											}
										} else {
											var18.field1483.method308(57344 + (var13 & 8191));
											if (var10 != -1 && var9 != -1) {
												var18.field1483.method333(var10 | var9 << 16);
											} else {
												var18.field1483.method333(Integer.MIN_VALUE);
											}
										}

										++var7;
										field146 = class525.field4240.field3235[var8];
									}
								}

								if (null != var18) {
									var18.field1483.method276(var18.field1483.field527 - var4);
									var8 = var18.field1483.field527;
									var18.field1483.field527 = var4;
									var18.field1483.method267(var6 / var7);
									var18.field1483.method267(var6 % var7);
									var18.field1483.field527 = var8;
									field68.method1570(var18);
								}

								if (var5 >= class525.field4240.field3232) {
									class525.field4240.field3232 = 0;
								} else {
									class384 var41 = class525.field4240;
									var41.field3232 -= var5;
									System.arraycopy(class525.field4240.field3233, var5, class525.field4240.field3233, 0, class525.field4240.field3232);
									System.arraycopy(class525.field4240.field3234, var5, class525.field4240.field3234, 0, class525.field4240.field3232);
									System.arraycopy(class525.field4240.field3235, var5, class525.field4240.field3235, 0, class525.field4240.field3232);
								}
							}
						}

						class160 var31;
						if (class184.field1739 == 1 || !class30.field467 && class184.field1739 == 4 || class184.field1739 == 2) {
							long var21 = class184.field1729 - field66;
							if (var21 > 32767L) {
								var21 = 32767L;
							}

							field66 = class184.field1729;
							var4 = class184.field1741;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class5.field322) {
								var4 = class5.field322;
							}

							var5 = class184.field1740;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class237.field2181) {
								var5 = class237.field2181;
							}

							var6 = (int)var21;
							var31 = class85.method556(class129.field1214, field68.field2426);
							var31.field1483.method308((class184.field1739 == 2 ? 1 : 0) + (var6 << 1));
							var31.field1483.method308(var5);
							var31.field1483.method308(var4);
							field68.method1570(var31);
						}

						if (field216 != 0) {
							var19 = class85.method556(class129.field1262, field68.field2426);
							var19.field1483.method308(field216);
							field68.method1570(var19);
						}

						if (field151.field3431 > 0) {
							var19 = class85.method556(class129.field1176, field68.field2426);
							var19.field1483.method308(0);
							var20 = var19.field1483.field527;
							long var22 = class172.method977();

							for (var6 = 0; var6 < field151.field3431; ++var6) {
								long var34 = var22 - field246;
								if (var34 > 16777215L) {
									var34 = 16777215L;
								}

								field246 = var22;
								var19.field1483.method340(field151.field3430[var6]);
								var19.field1483.method310((int)var34);
							}

							var19.field1483.method275(var19.field1483.field527 - var20);
							field68.method1570(var19);
						}

						if (field105 > 0) {
							--field105;
						}

						if (field151.method2118(96) || field151.method2118(97) || field151.method2118(98) || field151.method2118(99)) {
							field106 = true;
						}

						if (field106 && field105 <= 0) {
							field105 = 20;
							field106 = false;
							var19 = class85.method556(class129.field1199, field68.field2426);
							var19.field1483.method308(field181);
							var19.field1483.method303(field42);
							field68.method1570(var19);
						}

						if (class229.field2086 && !field22) {
							field22 = true;
							var19 = class85.method556(class129.field1228, field68.field2426);
							var19.field1483.method267(1);
							field68.method1570(var19);
						}

						if (!class229.field2086 && field22) {
							field22 = false;
							var19 = class85.method556(class129.field1228, field68.field2426);
							var19.field1483.method267(0);
							field68.method1570(var19);
						}

						if (class306.field2771 != null) {
							class306.field2771.method1080();
						}

						if (class409.field3418) {
							if (null != class141.field1358) {
								class141.field1358.method1725();
							}

							for (var2 = 0; var2 < class481.field4085; ++var2) {
								class287 var23 = field176[class481.field4086[var2]];
								var23.method1636();
							}

							class409.field3418 = false;
						}

						class233.method1339();
						class36.method244();
						if (field87 != 30) {
							return;
						}

						class350.method1920();
						class306.method1733();
						++field68.field2433;
						if (field68.field2433 > 750) {
							class480.method2394();
							return;
						}

						var2 = class481.field4085;
						int[] var24 = class481.field4086;

						for (var4 = 0; var4 < var2; ++var4) {
							class287 var25 = field176[var24[var4]];
							if (null != var25) {
								class174.method991(var25, 1);
							}
						}

						for (var2 = 0; var2 < field64; ++var2) {
							var20 = field2[var2];
							class102 var26 = field63[var20];
							if (null != var26) {
								class174.method991(var26, var26.field1018.field3150);
							}
						}

						class134.method817();
						++field82;
						if (field240 != 0) {
							field182 += 20;
							if (field182 >= 400) {
								field240 = 0;
							}
						}

						class60 var32 = class464.field3990;
						class60 var27 = class138.field1329;
						class464.field3990 = null;
						class138.field1329 = null;
						field191 = null;
						field239 = false;
						field192 = false;
						field243 = 0;

						while (field151.method2119() && field243 < 128) {
							if (field91 >= 2 && field151.method2118(82) && field151.field3441 == 66) {
								StringBuilder var28 = new StringBuilder();

								class445 var38;
								for (Iterator var33 = class41.field521.iterator(); var33.hasNext(); var28.append(var38.field3910).append('\n')) {
									var38 = (class445)var33.next();
									if (null != var38.field3905 && !var38.field3905.isEmpty()) {
										var28.append(var38.field3905).append(':');
									}
								}

								String var29 = var28.toString();
								class466.field3999.method945(var29);
							} else if (field96 != 1 || field151.field3428 <= 0) {
								field245[field243] = field151.field3441;
								field244[field243] = field151.field3428;
								++field243;
							}
						}

						boolean var30 = field91 >= 2;
						if (var30 && field151.method2118(82) && field151.method2118(81) && field216 != 0) {
							var5 = class82.field863.field2543 - field216;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (var5 != class82.field863.field2543) {
								class102.method673(class296.field2735 + class82.field863.field1600[0], class164.field1606 + class82.field863.field1597[0], var5, false);
							}

							field216 = 0;
						}

						if (class184.field1739 == 1) {
							field242.method1507();
						}

						if (field175 != -1) {
							class95.method623(field175, 0, 0, class237.field2181, class5.field322, 0, 0);
						}

						++field5;

						while (true) {
							class60 var35;
							class309 var36;
							class60 var39;
							do {
								var36 = (class309)field204.method561();
								if (var36 == null) {
									while (true) {
										do {
											var36 = (class309)field220.method561();
											if (null == var36) {
												while (true) {
													do {
														var36 = (class309)field218.method561();
														if (null == var36) {
															while (true) {
																class333 var40 = (class333)field257.method561();
																if (var40 == null) {
																	this.method18();
																	class70.method506();
																	if (field187 != null) {
																		this.method23();
																	}

																	if (class317.method1780()) {
																		var5 = class317.field2858;
																		var6 = class317.field2859;
																		var31 = class85.method556(class129.field1182, field68.field2426);
																		var31.field1483.method267(5);
																		var31.field1483.method303(var5 + class296.field2735);
																		var31.field1483.method330(class164.field1606 + var6);
																		var31.field1483.method314(field151.method2118(82) ? (field151.method2118(81) ? 2 : 1) : 0);
																		field68.method1570(var31);
																		class317.method1803();
																		field123 = class184.field1740;
																		field124 = class184.field1741;
																		field240 = 1;
																		field182 = 0;
																		field254 = var5;
																		field177 = var6;
																	}

																	if (var32 != class464.field3990) {
																		if (null != var32) {
																			class185.method1024(var32);
																		}

																		if (class464.field3990 != null) {
																			class185.method1024(class464.field3990);
																		}
																	}

																	if (class138.field1329 != var27 && field166 == field167) {
																		if (null != var27) {
																			class185.method1024(var27);
																		}

																		if (null != class138.field1329) {
																			class185.method1024(class138.field1329);
																		}
																	}

																	if (null != class138.field1329) {
																		if (field166 < field167) {
																			++field166;
																			if (field166 == field167) {
																				class185.method1024(class138.field1329);
																			}
																		}
																	} else if (field166 > 0) {
																		--field166;
																	}

																	class338.method1870();
																	if (field270) {
																		class525.method2542(class182.field1720, class451.field3944, class504.field4175);
																		class483.method2400(class293.field2725, class332.field2919);
																		if (class375.field3180 == class182.field1720 && class463.field3989 == class451.field3944 && class196.field1796 == class504.field4175 && class452.field3956 == class293.field2725 && class175.field1694 == class332.field2919) {
																			field270 = false;
																			field264 = false;
																			field265 = false;
																			field266 = false;
																			class353.field3015 = 0;
																			class82.field860 = 0;
																			class401.field3369 = 0;
																			class47.field544 = 0;
																			class96.field979 = 0;
																			class184.field1743 = 0;
																			class120.field1131 = 0;
																			class481.field4081 = 0;
																			class47.field542 = 0;
																			class243.field2219 = 0;
																			field268 = null;
																			field85 = null;
																			field59 = null;
																		}
																	} else if (field264) {
																		class131.method777();
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		int var10002 = field221[var5]++;
																	}

																	class451.field3950.method176();
																	var5 = class354.method1935();
																	var6 = class172.field1680.method2243();
																	class160 var37;
																	if (var5 > 15000 && var6 > 15000) {
																		field56 = 250;
																		class4.method48(14500);
																		var37 = class85.method556(class129.field1200, field68.field2426);
																		field68.method1570(var37);
																	}

																	class316.field2827.method1161();
																	class209.method1179();
																	++field68.field2432;
																	if (field68.field2432 > 50) {
																		var37 = class85.method556(class129.field1216, field68.field2426);
																		field68.method1570(var37);
																	}

																	try {
																		field68.method1569();
																	} catch (IOException var15) {
																		class480.method2394();
																	}

																	return;
																}

																class419.method2162(var40);
															}
														}

														var35 = var36.field2791;
														if (var35.field763 < 0) {
															break;
														}

														var39 = class366.method1967(var35.field661);
													} while(null == var39 || var39.field776 == null || var35.field763 >= var39.field776.length || var35 != var39.field776[var35.field763]);

													class186.method1031(var36);
												}
											}

											var35 = var36.field2791;
											if (var35.field763 < 0) {
												break;
											}

											var39 = class366.method1967(var35.field661);
										} while(null == var39 || var39.field776 == null || var35.field763 >= var39.field776.length || var35 != var39.field776[var35.field763]);

										class186.method1031(var36);
									}
								}

								var35 = var36.field2791;
								if (var35.field763 < 0) {
									break;
								}

								var39 = class366.method1967(var35.field661);
							} while(null == var39 || null == var39.field776 || var35.field763 >= var39.field776.length || var35 != var39.field776[var35.field763]);

							class186.method1031(var36);
						}
					}

					var18 = class85.method556(class129.field1180, field68.field2426);
					var18.field1483.method267(0);
					var4 = var18.field1483.field527;
					class52.method385(var18.field1483);
					var18.field1483.method276(var18.field1483.field527 - var4);
					field68.method1570(var18);
				}
			}
		}
	}

	public void method2038(int var1, int var2) {
		if (null != field68 && null != field68.field2426) {
			if (var1 > -1 && class176.field1701.method2488() > 0 && !field275) {
				class160 var4 = class85.method556(class129.field1269, field68.field2426);
				var4.field1483.method333(var1);
				field68.method1570(var4);
			}

		}
	}

	protected final void method951() {
		field233 = class172.method977() + 500L;
		this.method14();
		if (field175 != -1) {
			this.method21(true);
		}

	}

	void method14() {
		int var2 = class237.field2181;
		int var3 = class5.field322;
		if (super.field1665 < var2) {
			var2 = super.field1665;
		}

		if (super.field1671 < var3) {
			var3 = super.field1671;
		}

		if (class176.field1701 != null) {
			try {
				class159.method893(class466.field3999, "resize", new Object[]{class185.method1022()});
			} catch (Throwable var5) {
			}
		}

	}

	final void method15() {
		if (field175 != -1) {
			class105.method678(field175);
		}

		int var2;
		for (var2 = 0; var2 < field174; ++var2) {
			if (field13[var2]) {
				field226[var2] = true;
			}

			field227[var2] = field13[var2];
			field13[var2] = false;
		}

		field224 = field306;
		field164 = -1;
		field165 = -1;
		if (field175 != -1) {
			field174 = 0;
			class493.method2411(field175, 0, 0, class237.field2181, class5.field322, 0, 0, -1);
		}

		class266.method1542();
		if (field292) {
			if (field240 == 1) {
				class517.field4223[field182 / 100].method732(field123 - 8, field124 - 8);
			}

			if (field240 == 2) {
				class517.field4223[4 + field182 / 100].method732(field123 - 8, field124 - 8);
			}
		}

		int var3;
		int var4;
		if (!field116) {
			if (field164 != -1) {
				var2 = field164;
				var3 = field165;
				if ((field152 >= 2 || field168 != 0 || field95) && field163) {
					var4 = field152 - 1;
					String var6;
					if (field168 == 1 && field152 < 2) {
						var6 = class433.field3704 + class433.field3588 + field169 + " " + class278.field2468;
					} else if (field95 && field152 < 2) {
						var6 = field186 + class433.field3588 + field197 + " " + class278.field2468;
					} else {
						var6 = class1.method5(var4);
					}

					if (field152 > 2) {
						var6 = var6 + class394.method2064(16777215) + " " + '/' + " " + (field152 - 2) + class433.field3571;
					}

					class488.field4114.method1318(var6, var2 + 4, var3 + 15, 16777215, 0, field306 / 1000);
				}
			}
		} else {
			var2 = class391.field3274;
			var3 = class321.field2896;
			var4 = class105.field1039;
			int var5 = class446.field3916;
			int var14 = 6116423;
			class266.method1548(var2, var3, var4, var5, var14);
			class266.method1548(var2 + 1, var3 + 1, var4 - 2, 16, 0);
			class266.method1551(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
			class488.field4114.method1320(class433.field3707, var2 + 3, var3 + 14, var14, -1);
			int var7 = class184.field1745;
			int var8 = class184.field1728;

			int var9;
			int var10;
			int var11;
			for (var9 = 0; var9 < field152; ++var9) {
				var10 = 15 * (field152 - 1 - var9) + var3 + 31;
				var11 = 16777215;
				if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}

				class488.field4114.method1320(class1.method5(var9), var2 + 3, var10, var11, 0);
			}

			var9 = class391.field3274;
			var10 = class321.field2896;
			var11 = class105.field1039;
			int var12 = class446.field3916;

			for (int var13 = 0; var13 < field174; ++var13) {
				if (field228[var13] + field230[var13] > var9 && field228[var13] < var9 + var11 && field229[var13] + field231[var13] > var10 && field229[var13] < var10 + var12) {
					field226[var13] = true;
				}
			}
		}

		if (field232 == 3) {
			for (var2 = 0; var2 < field174; ++var2) {
				if (field227[var2]) {
					class266.method1547(field228[var2], field229[var2], field230[var2], field231[var2], 16711935, 128);
				} else if (field226[var2]) {
					class266.method1547(field228[var2], field229[var2], field230[var2], field231[var2], 16711680, 128);
				}
			}
		}

		class109.method684(class358.field3038, class82.field863.field1555, class82.field863.field1526, field82);
		field82 = 0;
	}

	boolean method36(class269 var1, int var2) {
		if (var1.field2429 == 0) {
			class141.field1358 = null;
		} else {
			if (null == class141.field1358) {
				class141.field1358 = new class136(class168.field1640, class466.field3999);
			}

			class141.field1358.method821(var1.field2427, var2);
		}

		field210 = field5;
		class409.field3418 = true;
		var1.field2423 = null;
		return true;
	}

	boolean method16(class269 var1) {
		if (class141.field1358 != null) {
			class141.field1358.method822(var1.field2427, (byte)-59);
		}

		field210 = field5;
		class409.field3418 = true;
		var1.field2423 = null;
		return true;
	}

	final boolean method17(class269 var1) {
		class431 var3 = var1.method1573();
		class347 var4 = var1.field2427;
		if (null == var3) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int var26;
				if (null == var1.field2423) {
					if (var1.field2430) {
						if (!var3.method2189(1)) {
							return false;
						}

						var3.method2190(var1.field2427.field525, 0, 1);
						var1.field2433 = 0;
						var1.field2430 = false;
					}

					var4.field527 = 0;
					if (var4.method1900()) {
						if (!var3.method2189(1)) {
							return false;
						}

						var3.method2190(var1.field2427.field525, 1, 1);
						var1.field2433 = 0;
					}

					var1.field2430 = true;
					class291[] var5 = class225.method1265();
					var26 = var4.method1902();
					if (var26 < 0 || var26 >= var5.length) {
						throw new IOException(var26 + " " + var4.field527);
					}

					var1.field2423 = var5[var26];
					var1.field2429 = var1.field2423.field2707;
				}

				if (var1.field2429 == -1) {
					if (!var3.method2189(1)) {
						return false;
					}

					var1.method1573().method2190(var4.field525, 0, 1);
					var1.field2429 = var4.field525[0] & 255;
				}

				if (var1.field2429 == -2) {
					if (!var3.method2189(2)) {
						return false;
					}

					var1.method1573().method2190(var4.field525, 0, 2);
					var4.field527 = 0;
					var1.field2429 = var4.method327();
				}

				if (!var3.method2189(var1.field2429)) {
					return false;
				}

				var4.field527 = 0;
				var3.method2190(var4.field525, 0, var1.field2429);
				var1.field2433 = 0;
				field71.method58();
				var1.field2435 = var1.field2434;
				var1.field2434 = var1.field2428;
				var1.field2428 = var1.field2423;
				if (class291.field2644 == var1.field2423) {
					class224.field2043 = class492.method2409(var4.method278());
					var1.field2423 = null;
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
				if (class291.field2667 == var1.field2423) {
					var7 = var4.method335();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var26;
					var10 = var4.method300();
					var11 = var10 >> 2;
					var37 = var10 & 3;
					var47 = field188[var11];
					var14 = var4.method327();
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var47 == 0) {
							class267 var82 = class415.field3487.method1769(class358.field3038, var8, var9);
							if (null != var82) {
								var16 = class67.method491(var82.field2417);
								if (var11 == 2) {
									var82.field2418 = new class165(var16, 2, var37 + 4, class358.field3038, var8, var9, var14, false, var82.field2418);
									var82.field2416 = new class165(var16, 2, var37 + 1 & 3, class358.field3038, var8, var9, var14, false, var82.field2416);
								} else {
									var82.field2418 = new class165(var16, var11, var37, class358.field3038, var8, var9, var14, false, var82.field2418);
								}
							}
						} else if (var47 == 1) {
							class436 var81 = class415.field3487.method1770(class358.field3038, var8, var9);
							if (null != var81) {
								var16 = class67.method491(var81.field3866);
								if (var11 != 4 && var11 != 5) {
									if (var11 == 6) {
										var81.field3863 = new class165(var16, 4, var37 + 4, class358.field3038, var8, var9, var14, false, var81.field3863);
									} else if (var11 == 7) {
										var81.field3863 = new class165(var16, 4, (var37 + 2 & 3) + 4, class358.field3038, var8, var9, var14, false, var81.field3863);
									} else if (var11 == 8) {
										var81.field3863 = new class165(var16, 4, var37 + 4, class358.field3038, var8, var9, var14, false, var81.field3863);
										var81.field3864 = new class165(var16, 4, 4 + (var37 + 2 & 3), class358.field3038, var8, var9, var14, false, var81.field3864);
									}
								} else {
									var81.field3863 = new class165(var16, 4, var37, class358.field3038, var8, var9, var14, false, var81.field3863);
								}
							}
						} else if (var47 == 2) {
							class491 var78 = class415.field3487.method1807(class358.field3038, var8, var9);
							if (var11 == 11) {
								var11 = 10;
							}

							if (null != var78) {
								var78.field4127 = new class165(class67.method491(var78.field4132), var11, var37, class358.field3038, var8, var9, var14, false, var78.field4127);
							}
						} else if (var47 == 3) {
							class400 var80 = class415.field3487.method1794(class358.field3038, var8, var9);
							if (null != var80) {
								var80.field3357 = new class165(class67.method491(var80.field3356), 22, var37, class358.field3038, var8, var9, var14, false, var80.field3357);
							}
						}
					}

					var1.field2423 = null;
					return true;
				}

				class60 var86;
				if (var1.field2423 == class291.field2641) {
					var24 = var4.method282();
					var86 = class366.method1967(var24);
					var86.field686 = 3;
					var86.field687 = class82.field863.field2523.method1958();
					class185.method1024(var86);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2703) {
					field270 = false;
					field264 = false;
					field265 = false;
					field266 = false;
					class353.field3015 = 0;
					class82.field860 = 0;
					class401.field3369 = 0;
					field267 = false;
					class47.field544 = 0;
					class96.field979 = 0;
					class184.field1743 = 0;
					class120.field1131 = 0;
					class481.field4081 = 0;
					class47.field542 = 0;
					class243.field2219 = 0;
					field268 = null;
					field85 = null;
					field59 = null;

					for (var24 = 0; var24 < 5; ++var24) {
						field271[var24] = false;
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2635 == var1.field2423) {
					class196.field1795 = null;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2668) {
					var24 = var4.method282();
					var26 = var4.method282();
					var7 = class134.method815();
					class160 var84 = class85.method556(class129.field1258, field68.field2426);
					var84.field1483.method267(class172.field1657);
					var84.field1483.method287(var24);
					var84.field1483.method316(var26);
					var84.field1483.method298(var7);
					field68.method1570(var84);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2604) {
					class237.method1361();
					field290 = var4.method280();
					field55 = field5;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2654 == var1.field2423) {
					class12.method111(class144.field1371);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2590) {
					var24 = var4.method305();
					class451.method2248(var24);
					field202[++field203 - 1 & 31] = var24 & 32767;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2696) {
					class12.method111(class144.field1375);
					var1.field2423 = null;
					return true;
				}

				boolean var12;
				byte var23;
				long var33;
				long var42;
				long var50;
				String var54;
				int var75;
				if (class291.field2684 == var1.field2423) {
					var23 = var4.method279();
					var50 = (long)var4.method327();
					var33 = (long)var4.method334();
					var42 = (var50 << 32) + var33;
					var12 = false;
					class419 var73 = var23 >= 0 ? field248[var23] : class334.field2930;
					if (null == var73) {
						var12 = true;
					} else {
						for (var14 = 0; var14 < 100; ++var14) {
							if (field149[var14] == var42) {
								var12 = true;
								break;
							}
						}
					}

					if (!var12) {
						field149[field11] = var42;
						field11 = (1 + field11) % 100;
						var54 = class53.method388(var4);
						var75 = var23 >= 0 ? 43 : 46;
						class483.method2399(var75, "", var54, var73.field3501);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2614) {
					class69.method502(var4, var1.field2429);
					class441.method2216();
					var1.field2423 = null;
					return true;
				}

				if (class291.field2627 == var1.field2423) {
					field264 = true;
					field270 = false;
					field266 = true;
					class353.field3015 = var4.method278();
					class82.field860 = var4.method278();
					class401.field3369 = var4.method327();
					var24 = var4.method327();
					var26 = var4.method278();
					var7 = 64 + class353.field3015 * 128;
					var8 = 64 + class82.field860 * 128;
					var9 = class454.method2262(var7, var8, class358.field3038) - class401.field3369;
					var10 = var7 - class375.field3180;
					var11 = var9 - class463.field3989;
					var37 = var8 - class196.field1796;
					double var69 = Math.sqrt((double)(var37 * var37 + var10 * var10));
					var75 = class69.method505((int)(Math.atan2((double)var11, var69) * 325.9490051269531D) & 2047);
					var16 = class56.method417((int)(Math.atan2((double)var10, (double)var37) * -325.9490051269531D) & 2047);
					field85 = new class247(class452.field3956, var75, var24, var26);
					field59 = new class247(class175.field1694, var16, var24, var26);
					var1.field2423 = null;
					return true;
				}

				long var53;
				class534 var79;
				if (var1.field2423 == class291.field2676) {
					var24 = var1.field2429 + var4.field527;
					var26 = var4.method327();
					if (var26 == 65535) {
						var26 = -1;
					}

					var7 = var4.method327();
					if (field175 != var26) {
						field175 = var26;
						this.method21(false);
						class426.method2177(field175);
						class394.method2066(field175);

						for (var8 = 0; var8 < 100; ++var8) {
							field13[var8] = true;
						}
					}

					class534 var70;
					for (; var7-- > 0; var70.field4269 = true) {
						var8 = var4.method282();
						var9 = var4.method327();
						var10 = var4.method278();
						var70 = (class534)field24.method1492((long)var8);
						if (null != var70 && var9 != var70.field4270) {
							class366.method1969(var70, true);
							var70 = null;
						}

						if (var70 == null) {
							var70 = class183.method1014(var8, var9, var10);
						}
					}

					for (var79 = (class534)field24.method1493(); var79 != null; var79 = (class534)field24.method1494()) {
						if (var79.field4269) {
							var79.field4269 = false;
						} else {
							class366.method1969(var79, true);
						}
					}

					field222 = new class254(512);

					while (var4.field527 < var24) {
						var8 = var4.method282();
						var9 = var4.method327();
						var10 = var4.method327();
						var11 = var4.method282();

						for (var37 = var9; var37 <= var10; ++var37) {
							var53 = ((long)var8 << 32) + (long)var37;
							field222.method1495(new class380(var11), var53);
						}
					}

					var1.field2423 = null;
					return true;
				}

				class60 var66;
				if (var1.field2423 == class291.field2693) {
					var24 = var4.method282();
					var26 = var4.method323();
					class534 var89 = (class534)field24.method1492((long)var26);
					var79 = (class534)field24.method1492((long)var24);
					if (null != var79) {
						class366.method1969(var79, var89 == null || var79.field4270 != var89.field4270);
					}

					if (null != var89) {
						var89.method2269();
						field24.method1495(var89, (long)var24);
					}

					var66 = class366.method1967(var26);
					if (var66 != null) {
						class185.method1024(var66);
					}

					var66 = class366.method1967(var24);
					if (var66 != null) {
						class185.method1024(var66);
						class116.method738(class160.field1484[var66.field644 >>> 16], var66, true);
					}

					if (field175 != -1) {
						class465.method2276(field175, 1);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2648) {
					class117.method747();
					var23 = var4.method279();
					if (var1.field2429 == 1) {
						if (var23 >= 0) {
							field247[var23] = null;
						} else {
							class481.field4095 = null;
						}

						var1.field2423 = null;
						return true;
					}

					if (var23 >= 0) {
						field247[var23] = new class379(var4);
					} else {
						class481.field4095 = new class379(var4);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2661) {
					var24 = var4.method282();
					class534 var91 = (class534)field24.method1492((long)var24);
					if (null != var91) {
						class366.method1969(var91, true);
					}

					if (null != field180) {
						class185.method1024(field180);
						field180 = null;
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2683) {
					var10 = var4.method327();
					var7 = var4.method335();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = var26 + (var7 & 7);
					var11 = var4.method299();
					var37 = var4.method306();
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var8 = 64 + var8 * 128;
						var9 = var9 * 128 + 64;
						class402 var62 = new class402(var10, class358.field3038, var8, var9, class454.method2262(var8, var9, class358.field3038) - var11, var37, field306);
						field273.method567(var62);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2680 == var1.field2423) {
					field212 = field5;
					var23 = var4.method279();
					if (var1.field2429 == 1) {
						if (var23 >= 0) {
							field248[var23] = null;
						} else {
							class334.field2930 = null;
						}

						var1.field2423 = null;
						return true;
					}

					if (var23 >= 0) {
						field248[var23] = new class419(var4);
					} else {
						class334.field2930 = new class419(var4);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2595) {
					class12.method111(class144.field1380);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2691) {
					class12.method111(class144.field1381);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2699) {
					var24 = var4.method305();
					var26 = var4.method300();
					if (var24 == 65535) {
						var24 = -1;
					}

					class392.method2050(class82.field863, var24, var26);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2704 == var1.field2423) {
					class368.method1974(true, var1.field2427);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2624 == var1.field2423) {
					if (field175 != -1) {
						class465.method2276(field175, 0);
					}

					var1.field2423 = null;
					return true;
				}

				class60 var35;
				if (var1.field2423 == class291.field2616) {
					var24 = var4.method318();
					var26 = var4.method307();
					var7 = var4.method306();
					var35 = class366.method1967(var24);
					var35.field735 = (var26 << 16) + var7;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2673 == var1.field2423) {
					field256 = var4.method278();
					var1.field2423 = null;
					return true;
				}

				int var17;
				String var68;
				if (class291.field2685 == var1.field2423) {
					var23 = var4.method279();
					var6 = var4.method286();
					long var87 = (long)var4.method327();
					long var71 = (long)var4.method334();
					class397 var61 = (class397)class451.method2249(class18.method154(), var4.method278());
					long var51 = (var87 << 32) + var71;
					boolean var57 = false;
					class419 var76 = null;
					var76 = var23 >= 0 ? field248[var23] : class334.field2930;
					if (null == var76) {
						var57 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var61.field3332 && class316.field2827.method1164(new class440(var6, class168.field1640))) {
									var57 = true;
								}
								break;
							}

							if (field149[var16] == var51) {
								var57 = true;
								break;
							}

							++var16;
						}
					}

					if (!var57) {
						field149[field11] = var51;
						field11 = (1 + field11) % 100;
						var68 = class228.method1305(class53.method388(var4));
						var17 = var23 >= 0 ? 41 : 44;
						if (var61.field3347 != -1) {
							class483.method2399(var17, class249.method1447(var61.field3347) + var6, var68, var76.field3501);
						} else {
							class483.method2399(var17, var6, var68, var76.field3501);
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2666 == var1.field2423) {
					var4.field527 += 28;
					if (var4.method297()) {
						class240.method1379(var4, var4.field527 - 28);
					}

					var1.field2423 = null;
					return true;
				}

				String var29;
				if (class291.field2679 == var1.field2423) {
					var29 = var4.method286();
					var26 = var4.method299();
					var7 = var4.method300();
					if (var7 >= 1 && var7 <= 8) {
						if (var29.equalsIgnoreCase(class433.field3850)) {
							var29 = null;
						}

						field26[var7 - 1] = var29;
						field140[var7 - 1] = var26 == 0;
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2632) {
					var24 = var4.method327();
					if (var24 == 65535) {
						var24 = -1;
					}

					class186.method1034(var24);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2664 == var1.field2423) {
					var24 = var4.method307();
					if (var24 == 65535) {
						var24 = -1;
					}

					var26 = var4.method331();
					class116.method739(var24, var26);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2587) {
					class124.method763();
					var1.field2423 = null;
					return false;
				}

				if (var1.field2423 == class291.field2678) {
					var24 = var4.method317();
					var26 = var4.method300();
					var7 = var4.method307();
					var79 = (class534)field24.method1492((long)var24);
					if (var79 != null) {
						class366.method1969(var79, var7 != var79.field4270);
					}

					class183.method1014(var24, var7, var26);
					var1.field2423 = null;
					return true;
				}

				class60 var30;
				boolean var58;
				if (class291.field2656 == var1.field2423) {
					var58 = var4.method338() == 1;
					var26 = var4.method282();
					var30 = class366.method1967(var26);
					if (var58 != var30.field662) {
						var30.field662 = var58;
						class185.method1024(var30);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2588) {
					var24 = var4.method307();
					var26 = var4.method327();
					var7 = var4.method318();
					var8 = var4.method327();
					var66 = class366.method1967(var7);
					if (var8 != var66.field694 || var66.field712 != var24 || var26 != var66.field697) {
						var66.field694 = var8;
						var66.field712 = var24;
						var66.field697 = var26;
						class185.method1024(var66);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2589 == var1.field2423) {
					var24 = var4.method306();
					var26 = var4.method317();
					var30 = class366.method1967(var26);
					if (var30.field686 != 1 || var30.field687 != var24) {
						var30.field686 = 1;
						var30.field687 = var24;
						class185.method1024(var30);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2584) {
					class12.method111(class144.field1377);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2629) {
					var9 = var4.method306();
					var7 = var4.method305();
					var8 = var4.method305();
					var24 = var4.method307();
					var26 = var4.method307();
					if (var24 == 65535) {
						var24 = -1;
					}

					ArrayList var72 = new ArrayList();
					var72.add(var24);
					class248.method1445(var72, var26, var7, var8, var9);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2605 == var1.field2423) {
					class12.method111(class144.field1370);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2603) {
					class316.field2827.method1160();
					field209 = field5;
					var1.field2423 = null;
					return true;
				}

				String var55;
				if (var1.field2423 == class291.field2634) {
					byte[] var92 = new byte[var1.field2429];
					var4.method1901(var92, 0, var92.length);
					class42 var88 = new class42(var92);
					var55 = var88.method286();
					class289.method1661(var55, true, false);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2663) {
					class12 var90 = new class12();
					var90.field371 = var4.method286();
					var90.field368 = var4.method327();
					var26 = var4.method282();
					var90.field364 = var26;
					if (var90.method109()) {
						var90.field375 = "beta";
					}

					class104.method675(45);
					var3.method2194();
					var3 = null;
					class292.method1671(var90);
					var1.field2423 = null;
					return false;
				}

				if (var1.field2423 == class291.field2649) {
					field23 = var4.method306() * 30;
					field55 = field5;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2591 == var1.field2423) {
					var24 = var4.method327();
					if (var24 == 65535) {
						var24 = -1;
					}

					field175 = var24;
					this.method21(false);
					class426.method2177(var24);
					class394.method2066(field175);

					for (var26 = 0; var26 < 100; ++var26) {
						field13[var26] = true;
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2690 == var1.field2423) {
					field264 = true;
					field270 = false;
					field265 = true;
					class481.field4081 = var4.method278();
					class47.field542 = var4.method278();
					var24 = var4.method327();
					var26 = var4.method327();
					field267 = var4.method285();
					var7 = var4.method278();
					var8 = class481.field4081 * 128 + 64;
					var9 = 64 + class47.field542 * 128;
					boolean var59 = false;
					boolean var56 = false;
					if (field267) {
						var10 = class463.field3989;
						var11 = class454.method2262(var8, var9, class358.field3038) - var24;
					} else {
						var10 = class454.method2262(class375.field3180, class196.field1796, class358.field3038) - class463.field3989;
						var11 = var24;
					}

					field268 = new class396(class375.field3180, class196.field1796, var10, var8, var9, var11, var26, var7);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2650) {
					class368.method1974(false, var1.field2427);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2689 == var1.field2423) {
					var24 = var4.method323();
					var86 = class366.method1967(var24);

					for (var7 = 0; var7 < var86.field770.length; ++var7) {
						var86.field770[var7] = -1;
						var86.field770[var7] = 0;
					}

					class185.method1024(var86);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2657) {
					var24 = var4.method305();
					var26 = var4.method323();
					var30 = class366.method1967(var26);
					if (var30 != null && var30.field646 == 0) {
						if (var24 > var30.field666 - var30.field636) {
							var24 = var30.field666 - var30.field636;
						}

						if (var24 < 0) {
							var24 = 0;
						}

						if (var30.field677 != var24) {
							var30.field677 = var24;
							class185.method1024(var30);
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2677) {
					field237 = var4.method278();
					field236 = var4.method299();
					var1.field2423 = null;
					return true;
				}

				if (class291.field2671 == var1.field2423) {
					field264 = true;
					field270 = false;
					field266 = false;
					class353.field3015 = var4.method278();
					class82.field860 = var4.method278();
					class401.field3369 = var4.method327();
					class47.field544 = var4.method278();
					class96.field979 = var4.method278();
					if (class96.field979 >= 100) {
						var24 = 64 + class353.field3015 * 128;
						var26 = 64 + class82.field860 * 128;
						var7 = class454.method2262(var24, var26, class358.field3038) - class401.field3369;
						var8 = var24 - class375.field3180;
						var9 = var7 - class463.field3989;
						var10 = var26 - class196.field1796;
						var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
						class452.field3956 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
						class175.field1694 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
						if (class452.field3956 < 128) {
							class452.field3956 = 128;
						}

						if (class452.field3956 > 383) {
							class452.field3956 = 383;
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2633) {
					return this.method36(var1, 1);
				}

				if (var1.field2423 == class291.field2642) {
					field81 = var4.method278();
					if (field81 == 1) {
						field25 = var4.method327();
					}

					if (field81 >= 2 && field81 <= 6) {
						if (field81 == 2) {
							field190 = 64;
							field223 = 64;
						}

						if (field81 == 3) {
							field190 = 0;
							field223 = 64;
						}

						if (field81 == 4) {
							field190 = 128;
							field223 = 64;
						}

						if (field81 == 5) {
							field190 = 64;
							field223 = 0;
						}

						if (field81 == 6) {
							field190 = 64;
							field223 = 128;
						}

						field81 = 2;
						field27 = var4.method327();
						field170 = var4.method327();
						field34 = var4.method278();
					}

					if (field81 == 10) {
						field44 = var4.method327();
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2600) {
					class117.method747();
					var23 = var4.method279();
					class464 var85 = new class464(var4);
					class379 var83;
					if (var23 >= 0) {
						var83 = field247[var23];
					} else {
						var83 = class481.field4095;
					}

					if (null == var83) {
						this.method26(var23);
						var1.field2423 = null;
						return true;
					}

					if (var85.field3991 > var83.field3220) {
						this.method26(var23);
						var1.field2423 = null;
						return true;
					}

					if (var85.field3991 < var83.field3220) {
						var1.field2423 = null;
						return true;
					}

					var85.method2273(var83);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2695) {
					class12.method111(class144.field1376);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2619 == var1.field2423) {
					var24 = var4.method281();
					var26 = var4.method282();
					var7 = var4.method280();
					var35 = class366.method1967(var26);
					if (var35.field653 != var7 || var35.field654 != var24 || var35.field649 != 0 || var35.field650 != 0) {
						var35.field653 = var7;
						var35.field654 = var24;
						var35.field649 = 0;
						var35.field650 = 0;
						class185.method1024(var35);
						this.method22(var35);
						if (var35.field646 == 0) {
							class116.method738(class160.field1484[var26 >> 16], var35, false);
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2694 == var1.field2423) {
					var24 = var4.method318();
					var26 = var4.method317();
					var30 = class366.method1967(var26);
					class141.method842(var30, var24);
					class185.method1024(var30);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2660 == var1.field2423) {
					var24 = var4.method327();
					var26 = var4.method323();
					var30 = class366.method1967(var26);
					if (var30.field686 != 6 || var24 != var30.field687) {
						var30.field686 = 6;
						var30.field687 = var24;
						class185.method1024(var30);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2586 == var1.field2423) {
					byte var52 = var4.method293();
					var75 = var4.method338() * 4;
					byte var48 = var4.method293();
					var47 = var4.method306();
					var37 = var4.method324();
					var17 = var4.method305();
					var14 = var4.method299() * 4;
					var16 = var4.method307();
					var7 = var4.method335();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = var26 + (var7 & 7);
					int var19 = var4.method278();
					int var18 = var4.method300();
					var10 = var52 + var8;
					var11 = var48 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var47 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = var10 * 128 + 64;
						var11 = 64 + var11 * 128;
						class443 var20 = new class443(var47, class358.field3038, var8, var9, class454.method2262(var8, var9, class358.field3038) - var14, var16 + field306, field306 + var17, var18, var19, var37, var75);
						var20.method2219(var10, var11, class454.method2262(var10, var11, class358.field3038) - var75, var16 + field306);
						field130.method567(var20);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2669) {
					class196.field1795 = new class403(class430.field3535);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2640) {
					class154.field1435 = var4.method338();
					class98.field993 = var4.method300();
					var1.field2423 = null;
					return true;
				}

				if (class291.field2702 == var1.field2423) {
					for (var24 = 0; var24 < field176.length; ++var24) {
						if (field176[var24] != null) {
							field176[var24].field1570 = -1;
						}
					}

					for (var24 = 0; var24 < field63.length; ++var24) {
						if (field63[var24] != null) {
							field63[var24].field1570 = -1;
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2628) {
					class22.method187(false, var4);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2621 == var1.field2423) {
					class375.method2011(var4, var1.field2429);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2596) {
					class22.method187(true, var4);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2622) {
					var24 = var4.method299();
					var26 = var4.method299();
					var7 = var4.method323();
					var35 = class366.method1967(var7);
					class38.method251(var35, var26, var24);
					class185.method1024(var35);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2638 == var1.field2423) {
					var26 = var4.method327();
					var24 = var4.method305();
					class167.method924(var24, var26);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2687) {
					var58 = var4.method285();
					if (var58) {
						if (null == class432.field3539) {
							class432.field3539 = new class110();
						}
					} else {
						class432.field3539 = null;
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2658) {
					field264 = true;
					field270 = false;
					field266 = true;
					var24 = class56.method417(var4.method280() & 2027);
					var26 = class69.method505(var4.method280() & 2027);
					var7 = var4.method327();
					var8 = var4.method278();
					field85 = new class247(class452.field3956, var26, var7, var8);
					field59 = new class247(class175.field1694, var24, var7, var8);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2620) {
					return this.method16(var1);
				}

				if (class291.field2599 == var1.field2423) {
					class12.method111(class144.field1372);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2609 == var1.field2423) {
					var24 = var4.method317();
					var26 = var4.method327();
					if (var26 == 65535) {
						var26 = -1;
					}

					var7 = var4.method318();
					var8 = var4.method307();
					if (var8 == 65535) {
						var8 = -1;
					}

					for (var9 = var8; var9 <= var26; ++var9) {
						var42 = ((long)var7 << 32) + (long)var9;
						class462 var49 = field222.method1492(var42);
						if (var49 != null) {
							var49.method2269();
						}

						field222.method1495(new class380(var24), var42);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2625 == var1.field2423) {
					var8 = var4.method306();
					var26 = var4.method307();
					if (var26 == 65535) {
						var26 = -1;
					}

					var9 = var4.method307();
					var7 = var4.method305();
					var10 = var4.method305();
					var24 = var4.method306();
					if (var24 == 65535) {
						var24 = -1;
					}

					ArrayList var44 = new ArrayList();
					var44.add(var24);
					var44.add(var26);
					class248.method1445(var44, var7, var8, var9, var10);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2630) {
					class237.method1361();
					var24 = var4.method300();
					var26 = var4.method299();
					var7 = var4.method323();
					field298[var26] = var7;
					field147[var26] = var24;
					field295[var26] = 1;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= class341.field2960[var8]) {
							field295[var26] = var8 + 2;
						}
					}

					field127[++field205 - 1 & 31] = var26;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2692) {
					var24 = var4.method327();
					var26 = var4.method278();
					var7 = var4.method327();
					class240.method1367(var24, var26, var7);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2646 == var1.field2423) {
					var24 = var4.method278();
					var26 = var4.method318();
					var30 = class366.method1967(var26);
					class540.method2587(var30, class82.field863.field2523.field3054, var24);
					class185.method1024(var30);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2615 == var1.field2423) {
					var24 = var4.method318();
					var26 = var4.method327();
					var30 = class366.method1967(var24);
					if (var30.field686 != 2 || var30.field687 != var26) {
						var30.field686 = 2;
						var30.field687 = var26;
						class185.method1024(var30);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2585) {
					var24 = var4.method278();
					class167.method923(var24);
					var1.field2423 = null;
					return false;
				}

				if (var1.field2423 == class291.field2601) {
					class237.method1361();
					field120 = var4.method327();
					field55 = field5;
					var1.field2423 = null;
					return true;
				}

				boolean var60;
				if (var1.field2423 == class291.field2697) {
					var24 = var4.method318();
					var60 = var4.method278() == 1;
					var30 = class366.method1967(var24);
					class90.method610(var30, class82.field863.field2523, var60);
					class185.method1024(var30);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2626 == var1.field2423) {
					var23 = var4.method301();
					var26 = var4.method306();
					class23.field445[var26] = var23;
					if (class23.field443[var26] != var23) {
						class23.field443[var26] = var23;
					}

					class359.method1944(var26);
					field200[++field201 - 1 & 31] = var26;
					var1.field2423 = null;
					return true;
				}

				boolean var13;
				if (class291.field2607 == var1.field2423) {
					var29 = var4.method286();
					var50 = (long)var4.method327();
					var33 = (long)var4.method334();
					class397 var43 = (class397)class451.method2249(class18.method154(), var4.method278());
					long var40 = (var50 << 32) + var33;
					var13 = false;

					for (var14 = 0; var14 < 100; ++var14) {
						if (var40 == field149[var14]) {
							var13 = true;
							break;
						}
					}

					if (class316.field2827.method1164(new class440(var29, class168.field1640))) {
						var13 = true;
					}

					if (!var13 && field128 == 0) {
						field149[field11] = var40;
						field11 = (field11 + 1) % 100;
						var54 = class228.method1305(class12.method117(class53.method388(var4)));
						byte var63;
						if (var43.field3348) {
							var63 = 7;
						} else {
							var63 = 3;
						}

						if (var43.field3347 != -1) {
							class184.method1019(var63, class249.method1447(var43.field3347) + var29, var54);
						} else {
							class184.method1019(var63, var29, var54);
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2631 == var1.field2423) {
					if (null == class196.field1795) {
						class196.field1795 = new class403(class430.field3535);
					}

					class322 var77 = class430.field3535.method2169(var4);
					class196.field1795.field3382.method2565(var77.field2898, var77.field2897);
					field269[++field134 - 1 & 31] = var77.field2898;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2645) {
					var1.field2423 = null;
					return true;
				}

				class102 var41;
				if (var1.field2423 == class291.field2610) {
					short var74 = (short)var4.method281();
					var26 = var4.method278();
					var7 = var4.method327();
					var8 = var4.method317();
					var41 = field63[var7];
					if (null != var41) {
						var41.method671(var26, var8, var74);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2623 == var1.field2423) {
					var24 = var4.method282();
					if (field103 != var24) {
						field103 = var24;
						class117.method748();
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2655 == var1.field2423) {
					for (var24 = 0; var24 < class243.field2215; ++var24) {
						class243 var67 = class85.method555(var24);
						if (var67 != null) {
							class23.field445[var24] = 0;
							class23.field443[var24] = 0;
						}
					}

					class237.method1361();
					field201 += 32;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2674) {
					var29 = var4.method286();
					Object[] var64 = new Object[var29.length() + 1];

					for (var7 = var29.length() - 1; var7 >= 0; --var7) {
						if (var29.charAt(var7) == 's') {
							var64[var7 + 1] = var4.method286();
						} else {
							var64[var7 + 1] = new Integer(var4.method282());
						}
					}

					var64[0] = new Integer(var4.method282());
					class309 var65 = new class309();
					var65.field2794 = var64;
					class186.method1031(var65);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2662 == var1.field2423) {
					var29 = var4.method286();
					var6 = class228.method1305(class12.method117(class53.method388(var4)));
					class184.method1019(6, var29, var6);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2583) {
					class316.field2827.field1925.method1256(var4, var1.field2429);
					class431.method2195();
					field209 = field5;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2606) {
					var24 = var4.method325();
					var60 = var4.method278() == 1;
					var55 = "";
					boolean var39 = false;
					if (var60) {
						var55 = var4.method286();
						if (class316.field2827.method1164(new class440(var55, class168.field1640))) {
							var39 = true;
						}
					}

					String var45 = var4.method286();
					if (!var39) {
						class184.method1019(var24, var55, var45);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2665) {
					var58 = var4.method278() == 1;
					if (var58) {
						class93.field931 = class172.method977() - var4.method283();
						class2.field312 = new class227(var4, true);
					} else {
						class2.field312 = null;
					}

					field74 = field5;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2643 == var1.field2423) {
					var24 = var4.method306();
					var41 = field63[var24];
					var8 = var4.method299();
					var7 = var4.method306();
					var26 = var4.method317();
					if (var41 != null) {
						var41.method902(var8, var7, var26 >> 16, var26 & 65535);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2647) {
					var24 = var4.method305();
					if (var24 == 65535) {
						var24 = -1;
					}

					var26 = var4.method282();
					var7 = var4.method318();
					var35 = class366.method1967(var26);
					class210 var36;
					if (!var35.field724) {
						if (var24 == -1) {
							var35.field686 = 0;
							var1.field2423 = null;
							return true;
						}

						var36 = class67.method492(var24).method1186(var7);
						var35.field686 = 4;
						var35.field687 = var24;
						var35.field694 = var36.field1930;
						var35.field712 = var36.field1946;
						var35.field697 = var36.field1953 * 100 / var7;
						class185.method1024(var35);
					} else {
						var35.field772 = var24;
						var35.field773 = var7;
						var36 = class67.method492(var24).method1186(var7);
						var35.field694 = var36.field1930;
						var35.field712 = var36.field1946;
						var35.field759 = var36.field1932;
						var35.field692 = var36.field1931;
						var35.field766 = var36.field1948;
						var35.field697 = var36.field1953;
						if (var36.field1949 == 1) {
							var35.field703 = 1;
						} else {
							var35.field703 = 2;
						}

						if (var35.field698 > 0) {
							var35.field697 = var35.field697 * 32 / var35.field698;
						} else if (var35.field655 > 0) {
							var35.field697 = var35.field697 * 32 / var35.field655;
						}

						class185.method1024(var35);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2618 == var1.field2423) {
					var26 = var4.method307();
					var7 = var4.method299();
					var24 = var4.method305();
					if (var26 == 65535) {
						var26 = -1;
					}

					class102 var34 = field63[var24];
					if (null != var34) {
						if (var34.field1570 == var26 && var26 != -1) {
							var9 = class114.method702(var26).field3311;
							if (var9 == 1) {
								var34.field1571 = 0;
								var34.field1572 = 0;
								var34.field1587 = var7;
								var34.field1552 = 0;
							} else if (var9 == 2) {
								var34.field1552 = 0;
							}
						} else if (var26 == -1 || var34.field1570 == -1 || class114.method702(var26).field3304 >= class114.method702(var34.field1570).field3304) {
							var34.field1570 = var26;
							var34.field1571 = 0;
							var34.field1572 = 0;
							var34.field1587 = var7;
							var34.field1552 = 0;
							var34.field1589 = var34.field1573;
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2597) {
					var29 = var4.method286();
					var50 = var4.method283();
					var33 = (long)var4.method327();
					var42 = (long)var4.method334();
					class397 var46 = (class397)class451.method2249(class18.method154(), var4.method278());
					var53 = var42 + (var33 << 32);
					boolean var15 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (field149[var16] == var53) {
							var15 = true;
							break;
						}
					}

					if (var46.field3332 && class316.field2827.method1164(new class440(var29, class168.field1640))) {
						var15 = true;
					}

					if (!var15 && field128 == 0) {
						field149[field11] = var53;
						field11 = (1 + field11) % 100;
						var68 = class228.method1305(class12.method117(class53.method388(var4)));
						if (var46.field3347 != -1) {
							class483.method2399(9, class249.method1447(var46.field3347) + var29, var68, class333.method1845(var50));
						} else {
							class483.method2399(9, var29, var68, class333.method1845(var50));
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2652 == var1.field2423) {
					var24 = var4.method278();
					class401.method2081(var24);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2613 == var1.field2423) {
					var24 = var4.method278();
					var26 = var4.method278();
					var7 = var4.method278();
					var8 = var4.method278();
					field271[var24] = true;
					field65[var24] = var26;
					field225[var24] = var7;
					field135[var24] = var8;
					field221[var24] = 0;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2636 == var1.field2423) {
					var24 = var4.method282();
					var26 = var4.method327();
					if (var24 < -70000) {
						var26 += 32768;
					}

					if (var24 >= 0) {
						var30 = class366.method1967(var24);
					} else {
						var30 = null;
					}

					for (; var4.field527 < var1.field2429; class136.method827(var26, var8, var9 - 1, var10)) {
						var8 = var4.method325();
						var9 = var4.method327();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method278();
							if (var10 == 255) {
								var10 = var4.method282();
							}
						}

						if (var30 != null && var8 >= 0 && var8 < var30.field770.length) {
							var30.field770[var8] = var9;
							var30.field771[var8] = var10;
						}
					}

					if (null != var30) {
						class185.method1024(var30);
					}

					class237.method1361();
					field202[++field203 - 1 & 31] = var26 & 32767;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2592 == var1.field2423) {
					field264 = true;
					field270 = false;
					field266 = true;
					var24 = var4.method280();
					var26 = var4.method280();
					var7 = class69.method505(class452.field3956 + var26 & 2027);
					var8 = class175.field1694 + var24;
					var9 = var4.method327();
					var10 = var4.method278();
					field85 = new class247(class452.field3956, var7, var9, var10);
					field59 = new class247(class175.field1694, var8, var9, var10);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2698) {
					var8 = var4.method299();
					var7 = var4.method317();
					var26 = var4.method327();
					var24 = var4.method305();
					class287 var31;
					if (var24 == field131) {
						var31 = class82.field863;
					} else {
						var31 = field176[var24];
					}

					if (null != var31) {
						var31.method902(var8, var26, var7 >> 16, var7 & 65535);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2670) {
					for (var24 = 0; var24 < class23.field443.length; ++var24) {
						if (class23.field443[var24] != class23.field445[var24]) {
							class23.field443[var24] = class23.field445[var24];
							class359.method1944(var24);
							field200[++field201 - 1 & 31] = var24;
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2602 == var1.field2423) {
					class139.method837(var4.method286());
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2682) {
					var24 = var4.method318();
					var26 = var4.method309();
					var30 = class366.method1967(var24);
					if (var26 != var30.field690 || var26 == -1) {
						var30.field690 = var26;
						var30.field774 = 0;
						var30.field775 = 0;
						class185.method1024(var30);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2651) {
					class154.field1435 = var4.method278();
					class98.field993 = var4.method300();

					while (var4.field527 < var1.field2429) {
						var24 = var4.method278();
						class144 var32 = class59.method430()[var24];
						class12.method111(var32);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2637) {
					var24 = var4.method306();
					var26 = var4.method307();
					var8 = var4.method307();
					var7 = var4.method305();
					class269.method1579(var24, var26, var7, var8);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2653) {
					field264 = true;
					field270 = false;
					field265 = true;
					class481.field4081 = var4.method278();
					class47.field542 = var4.method278();
					var24 = var4.method327();
					var26 = var4.method278() * 128 + 64;
					var7 = var4.method278() * 128 + 64;
					var8 = var4.method327();
					field267 = var4.method285();
					var9 = var4.method278();
					var10 = class481.field4081 * 128 + 64;
					var11 = class47.field542 * 128 + 64;
					var12 = false;
					var13 = false;
					if (field267) {
						var37 = class463.field3989;
						var47 = class454.method2262(var10, var11, class358.field3038) - var24;
					} else {
						var37 = class454.method2262(class375.field3180, class196.field1796, class358.field3038) - class463.field3989;
						var47 = var24;
					}

					field268 = new class91(class375.field3180, class196.field1796, var37, var10, var11, var47, var26, var7, var8, var9);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2593) {
					class316.field2827.method1171(var4, var1.field2429);
					field209 = field5;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2659 == var1.field2423) {
					field264 = true;
					field270 = false;
					field265 = false;
					class481.field4081 = var4.method278();
					class47.field542 = var4.method278();
					class243.field2219 = var4.method327();
					class120.field1131 = var4.method278();
					class184.field1743 = var4.method278();
					if (class184.field1743 >= 100) {
						class375.field3180 = 64 + class481.field4081 * 128;
						class196.field1796 = class47.field542 * 128 + 64;
						class463.field3989 = class454.method2262(class375.field3180, class196.field1796, class358.field3038) - class243.field2219;
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2675) {
					var24 = var4.method318();
					var26 = var4.method306();
					var7 = var26 >> 10 & 31;
					var8 = var26 >> 5 & 31;
					var9 = var26 & 31;
					var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
					class60 var38 = class366.method1967(var24);
					if (var38.field667 != var10) {
						var38.field667 = var10;
						class185.method1024(var38);
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2639) {
					var29 = var4.method286();
					var26 = var4.method323();
					var30 = class366.method1967(var26);
					if (!var29.equals(var30.field704)) {
						var30.field704 = var29;
						class185.method1024(var30);
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2688 == var1.field2423) {
					var24 = var4.method282();
					var26 = var4.method327();
					if (var24 < -70000) {
						var26 += 32768;
					}

					if (var24 >= 0) {
						var30 = class366.method1967(var24);
					} else {
						var30 = null;
					}

					if (null != var30) {
						for (var8 = 0; var8 < var30.field770.length; ++var8) {
							var30.field770[var8] = 0;
							var30.field771[var8] = 0;
						}
					}

					class203.method1150(var26);
					var8 = var4.method327();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var4.method327();
						var11 = var4.method300();
						if (var11 == 255) {
							var11 = var4.method323();
						}

						if (null != var30 && var9 < var30.field770.length) {
							var30.field770[var9] = var10;
							var30.field771[var9] = var11;
						}

						class136.method827(var26, var9, var10 - 1, var11);
					}

					if (var30 != null) {
						class185.method1024(var30);
					}

					class237.method1361();
					field202[++field203 - 1 & 31] = var26 & 32767;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2608) {
					var24 = var4.method305();
					var26 = var4.method323();
					class23.field445[var24] = var26;
					if (var26 != class23.field443[var24]) {
						class23.field443[var24] = var26;
					}

					class359.method1944(var24);
					field200[++field201 - 1 & 31] = var24;
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2612) {
					class12.method111(class144.field1373);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2700 == var1.field2423) {
					class12.method111(class144.field1379);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2672) {
					class12.method111(class144.field1378);
					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2681) {
					var24 = var4.method278();
					if (var4.method278() == 0) {
						field281[var24] = new class522();
						var4.field527 += 18;
					} else {
						--var4.field527;
						field281[var24] = new class522(var4, false);
					}

					field213 = field5;
					var1.field2423 = null;
					return true;
				}

				if (class291.field2598 == var1.field2423 && field264) {
					field270 = true;
					field266 = false;
					field265 = false;

					for (var24 = 0; var24 < 5; ++var24) {
						field271[var24] = false;
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2594) {
					class154.field1435 = var4.method338();
					class98.field993 = var4.method300();

					for (var24 = class154.field1435; var24 < class154.field1435 + 8; ++var24) {
						for (var26 = class98.field993; var26 < class98.field993 + 8; ++var26) {
							if (field143[class358.field3038][var24][var26] != null) {
								field143[class358.field3038][var24][var26] = null;
								class540.method2589(var24, var26);
							}
						}
					}

					for (class353 var25 = (class353)field144.method563(); var25 != null; var25 = (class353)field144.method565()) {
						if (var25.field3021 >= class154.field1435 && var25.field3021 < class154.field1435 + 8 && var25.field3027 >= class98.field993 && var25.field3027 < 8 + class98.field993 && class358.field3038 == var25.field3028) {
							var25.field3026 = 0;
						}
					}

					var1.field2423 = null;
					return true;
				}

				if (class291.field2617 == var1.field2423) {
					return this.method36(var1, 2);
				}

				if (var1.field2423 == class291.field2686) {
					field254 = var4.method278();
					if (field254 == 255) {
						field254 = 0;
					}

					field177 = var4.method278();
					if (field177 == 255) {
						field177 = 0;
					}

					var1.field2423 = null;
					return true;
				}

				if (var1.field2423 == class291.field2611) {
					field212 = field5;
					var23 = var4.method279();
					class90 var27 = new class90(var4);
					class419 var28;
					if (var23 >= 0) {
						var28 = field248[var23];
					} else {
						var28 = class334.field2930;
					}

					if (var28 == null) {
						this.method34(var23);
						var1.field2423 = null;
						return true;
					}

					if (var27.field889 > var28.field3503) {
						this.method34(var23);
						var1.field2423 = null;
						return true;
					}

					if (var27.field889 < var28.field3503) {
						var1.field2423 = null;
						return true;
					}

					var27.method609(var28);
					var1.field2423 = null;
					return true;
				}

				if (class291.field2705 == var1.field2423) {
					class12.method111(class144.field1374);
					var1.field2423 = null;
					return true;
				}

				class41.method263("" + (var1.field2423 != null ? -908169793 * var1.field2423.field2706 * 1400406591 : -1) + class278.field2467 + (var1.field2434 != null ? var1.field2434.field2706 : -1) + class278.field2467 + (null != var1.field2435 ? var1.field2435.field2706 : -1) + class278.field2467 + var1.field2429, (Throwable)null);
				class124.method763();
			} catch (IOException var21) {
				class480.method2394();
			} catch (Exception var22) {
				var6 = "" + (null != var1.field2423 ? var1.field2423.field2706 : -1) + class278.field2467 + (var1.field2434 != null ? var1.field2434.field2706 : -1) + class278.field2467 + (null != var1.field2435 ? -908169793 * var1.field2435.field2706 * 1400406591 : -1) + class278.field2467 + var1.field2429 + class278.field2467 + (class296.field2735 + class82.field863.field1600[0]) + class278.field2467 + (class164.field1606 + class82.field863.field1597[0]) + class278.field2467;

				for (var7 = 0; var7 < var1.field2429 && var7 < 50; ++var7) {
					var6 = var6 + var4.field525[var7] + class278.field2467;
				}

				class41.method263(var6, var22);
				class124.method763();
			}

			return true;
		}
	}

	final void method18() {
		boolean var2 = false;

		int var3;
		int var6;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < field152 - 1; ++var3) {
				if (field196[var3] < 1000 && field196[var3 + 1] > 1000) {
					String var4 = field277[var3];
					field277[var3] = field277[var3 + 1];
					field277[var3 + 1] = var4;
					String var5 = field158[var3];
					field158[var3] = field158[var3 + 1];
					field158[var3 + 1] = var5;
					var6 = field196[var3];
					field196[var3] = field196[var3 + 1];
					field196[var3 + 1] = var6;
					var6 = field153[var3];
					field153[var3] = field153[var3 + 1];
					field153[var3 + 1] = var6;
					var6 = field154[var3];
					field154[var3] = field154[var3 + 1];
					field154[var3 + 1] = var6;
					var6 = field156[var3];
					field156[var3] = field156[var3 + 1];
					field156[var3 + 1] = var6;
					var6 = field157[var3];
					field157[var3] = field157[var3 + 1];
					field157[var3 + 1] = var6;
					boolean var7 = field160[var3];
					field160[var3] = field160[var3 + 1];
					field160[var3 + 1] = var7;
					var2 = false;
				}
			}
		}

		if (null == field187) {
			int var16 = class184.field1739;
			int var8;
			int var9;
			int var18;
			int var19;
			if (field116) {
				int var17;
				if (var16 != 1 && (class30.field467 || var16 != 4)) {
					var3 = class184.field1745;
					var17 = class184.field1728;
					if (var3 < class391.field3274 - 10 || var3 > class391.field3274 + class105.field1039 + 10 || var17 < class321.field2896 - 10 || var17 > class321.field2896 + class446.field3916 + 10) {
						field116 = false;
						var18 = class391.field3274;
						var6 = class321.field2896;
						var19 = class105.field1039;
						var8 = class446.field3916;

						for (var9 = 0; var9 < field174; ++var9) {
							if (field230[var9] + field228[var9] > var18 && field228[var9] < var18 + var19 && field229[var9] + field231[var9] > var6 && field229[var9] < var6 + var8) {
								field13[var9] = true;
							}
						}
					}
				}

				if (var16 == 1 || !class30.field467 && var16 == 4) {
					var3 = class391.field3274;
					var17 = class321.field2896;
					var18 = class105.field1039;
					var6 = class184.field1740;
					var19 = class184.field1741;
					var8 = -1;

					int var10;
					for (var9 = 0; var9 < field152; ++var9) {
						var10 = var17 + 31 + (field152 - 1 - var9) * 15;
						if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
							var8 = var9;
						}
					}

					int var11;
					int var12;
					int var13;
					if (var8 != -1 && var8 >= 0) {
						var9 = field153[var8];
						var10 = field154[var8];
						var11 = field196[var8];
						var12 = field156[var8];
						var13 = field157[var8];
						String var14 = field158[var8];
						String var15 = field277[var8];
						class220.method1258(var9, var10, var11, var12, var13, var14, var15, class184.field1740, class184.field1741);
					}

					field116 = false;
					var9 = class391.field3274;
					var10 = class321.field2896;
					var11 = class105.field1039;
					var12 = class446.field3916;

					for (var13 = 0; var13 < field174; ++var13) {
						if (field230[var13] + field228[var13] > var9 && field228[var13] < var9 + var11 && field231[var13] + field229[var13] > var10 && field229[var13] < var10 + var12) {
							field13[var13] = true;
						}
					}
				}
			} else {
				var3 = field152 - 1;
				if ((var16 == 1 || !class30.field467 && var16 == 4) && this.method19((byte)-84)) {
					var16 = 2;
				}

				if ((var16 == 1 || !class30.field467 && var16 == 4) && field152 > 0 && var3 >= 0) {
					var18 = field153[var3];
					var6 = field154[var3];
					var19 = field196[var3];
					var8 = field156[var3];
					var9 = field157[var3];
					String var20 = field158[var3];
					String var21 = field277[var3];
					class220.method1258(var18, var6, var19, var8, var9, var20, var21, class184.field1740, class184.field1741);
				}

				if (var16 == 2 && field152 > 0) {
					this.method20(class184.field1740, class184.field1741);
				}
			}

		}
	}

	final boolean method19(byte var1) {
		boolean var10000;
		label31: {
			int var2;
			label34: {
				var2 = field152 - 1;
				if (field150) {
					if (var1 >= -1) {
						throw new IllegalStateException();
					}

					if (field152 > 2) {
						break label34;
					}
				}

				if (!class81.method542(var2)) {
					break label31;
				}

				if (var1 >= -1) {
					throw new IllegalStateException();
				}
			}

			if (!field160[var2]) {
				if (var1 >= -1) {
					throw new IllegalStateException();
				}

				var10000 = true;
				return var10000;
			}
		}

		var10000 = false;
		return var10000;
	}

	final void method20(int var1, int var2) {
		class461.method2268(var1, var2);
		var1 -= field284;
		var2 -= field285;
		class415.field3487.method1779(class358.field3038, var1, var2, false);
		field116 = true;
	}

	final void method21(boolean var1) {
		int var3 = field175;
		int var4 = class237.field2181;
		int var5 = class5.field322;
		if (class292.method1669(var3)) {
			class337.method1867(class160.field1484[var3], -1, var4, var5, var1);
		}

	}

	void method22(class60 var1) {
		class60 var3 = var1.field661 == -1 ? null : class366.method1967(var1.field661);
		int var4;
		int var5;
		if (var3 == null) {
			var4 = class237.field2181;
			var5 = class5.field322;
		} else {
			var4 = var3.field659;
			var5 = var3.field636;
		}

		class110.method693(var1, var4, var5, false);
		class8.method75(var1, var4, var5);
	}

	final void method23() {
		class185.method1024(field187);
		++class40.field519;
		int var2;
		int var3;
		if (field239 && field192) {
			var2 = class184.field1745;
			var3 = class184.field1728;
			var2 -= field189;
			var3 -= field262;
			if (var2 < field193) {
				var2 = field193;
			}

			if (var2 + field187.field659 > field206.field659 + field193) {
				var2 = field206.field659 + field193 - field187.field659;
			}

			if (var3 < field194) {
				var3 = field194;
			}

			if (field187.field636 + var3 > field194 + field206.field636) {
				var3 = field194 + field206.field636 - field187.field636;
			}

			int var10 = var2 - field41;
			int var5 = var3 - field113;
			int var6 = field187.field657;
			if (class40.field519 > field187.field699 && (var10 > var6 || var10 < -var6 || var5 > var6 || var5 < -var6)) {
				field198 = true;
			}

			int var7 = field206.field663 + (var2 - field193);
			int var8 = field206.field677 + (var3 - field194);
			class309 var9;
			if (null != field187.field736 && field198) {
				var9 = new class309();
				var9.field2791 = field187;
				var9.field2792 = var7;
				var9.field2795 = var8;
				var9.field2794 = field187.field736;
				class186.method1031(var9);
			}

			if (class184.field1735 == 0) {
				if (field198) {
					if (null != field187.field737) {
						var9 = new class309();
						var9.field2791 = field187;
						var9.field2792 = var7;
						var9.field2795 = var8;
						var9.field2797 = field191;
						var9.field2794 = field187.field737;
						class186.method1031(var9);
					}

					if (null != field191 && class219.method1254(field187) != null) {
						class160 var11 = class85.method556(class129.field1206, field68.field2426);
						var11.field1483.method315(field187.field644);
						var11.field1483.method287(field191.field644);
						var11.field1483.method308(field187.field763);
						var11.field1483.method308(field191.field772);
						var11.field1483.method330(field191.field763);
						var11.field1483.method330(field187.field772);
						field68.method1570(var11);
					}
				} else if (this.method19((byte)-32)) {
					this.method20(field41 + field189, field113 + field262);
				} else if (field152 > 0) {
					method40(field189 + field41, field262 + field113);
				}

				field187 = null;
			}

		} else {
			if (class40.field519 > 1) {
				if (!field198 && field152 > 0) {
					var2 = field189 + field41;
					var3 = field262 + field113;
					class132 var4 = class148.field1397;
					if (var4 != null) {
						class220.method1258(var4.field1282, var4.field1285, var4.field1283, var4.field1284, var4.field1281, var4.field1286, var4.field1287, var2, var3);
					}

					class148.field1397 = null;
				}

				field187 = null;
			}

		}
	}

	public class440 method1518() {
		return null != class82.field863 ? class82.field863.field2539 : null;
	}

	void method34(int var1) {
		if (field185 >= 216) {
			class160 var3 = class85.method556(class129.field1272, field68.field2426);
			var3.field1483.method267(var1);
			field68.method1570(var3);
		}

	}

	void method26(int var1) {
		if (field185 >= 216) {
			class160 var3 = class85.method556(class129.field1273, field68.field2426);
			var3.field1483.method267(var1);
			field68.method1570(var3);
		}

	}

	static final int method39(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	static void method40(int var0, int var1) {
		class132 var3 = class148.field1397;
		if (null != var3) {
			class220.method1258(var3.field1282, var3.field1285, var3.field1283, var3.field1284, var3.field1281, var3.field1286, var3.field1287, var0, var1);
		}

		class148.field1397 = null;
	}
}
