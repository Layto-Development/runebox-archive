import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import io.runebox.internal.deobfuscator.includes.ObfInfo;
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

@ObfInfo(name = "client")
public final class Client extends class346 implements class207, OAuthApi, class128 {
	@ObfInfo(name = "cx", desc = "Z")
	public static boolean field54;
	@ObfInfo(name = "ph", desc = "Lmi;")
	public static class131 field211;
	@ObfInfo(name = "pm", desc = "I", intMultiplier = 697939723)
	public static int field115;
	@ObfInfo(name = "wd", desc = "I", intMultiplier = 1721185941)
	public static int field150;
	@ObfInfo(name = "ch", desc = "I", intMultiplier = -331110037)
	public static int field209;
	@ObfInfo(name = "bg", desc = "I", intMultiplier = -831561099)
	public static int field27;
	@ObfInfo(name = "ia", desc = "Ler;")
	public static final class336 field92;
	@ObfInfo(name = "jp", desc = "Z")
	static boolean field103;
	@ObfInfo(name = "kw", desc = "Z")
	static boolean field112;
	@ObfInfo(name = "or", desc = "Z")
	static boolean field119;
	@ObfInfo(name = "lt", desc = "Z")
	static boolean field128;
	@ObfInfo(name = "lz", desc = "Z")
	static boolean field130;
	@ObfInfo(name = "nf", desc = "Z")
	static boolean field140;
	@ObfInfo(name = "mb", desc = "Z")
	static boolean field153;
	@ObfInfo(name = "os", desc = "Z")
	static boolean field160;
	@ObfInfo(name = "nu", desc = "Z")
	static boolean field174;
	@ObfInfo(name = "oe", desc = "Z")
	static boolean field185;
	@ObfInfo(name = "ow", desc = "Z")
	static boolean field187;
	@ObfInfo(name = "pw", desc = "Z")
	static boolean field216;
	@ObfInfo(name = "qm", desc = "Z")
	static boolean field222;
	@ObfInfo(name = "sd", desc = "Z")
	static boolean field258;
	@ObfInfo(name = "cu", desc = "Z")
	static boolean field262;
	@ObfInfo(name = "qn", desc = "Z")
	static boolean field263;
	@ObfInfo(name = "ms", desc = "Z")
	static boolean field265;
	@ObfInfo(name = "ut", desc = "Z")
	static boolean field288;
	@ObfInfo(name = "ur", desc = "Z")
	static boolean field289;
	@ObfInfo(name = "ux", desc = "Z")
	static boolean field290;
	@ObfInfo(name = "uo", desc = "Z")
	static boolean field291;
	@ObfInfo(name = "uh", desc = "Z")
	static boolean field294;
	@ObfInfo(name = "tp", desc = "Z")
	static boolean field299;
	@ObfInfo(name = "cr", desc = "Z")
	static boolean field31;
	@ObfInfo(name = "mw", desc = "Z")
	static boolean field316;
	@ObfInfo(name = "pp", desc = "Z")
	static boolean field323;
	@ObfInfo(name = "di", desc = "Z")
	static boolean field38;
	@ObfInfo(name = "ed", desc = "Z")
	static boolean field40;
	@ObfInfo(name = "er", desc = "Z")
	static boolean field46;
	@ObfInfo(name = "bc", desc = "Z")
	static boolean field67;
	@ObfInfo(name = "hm", desc = "Z")
	static boolean field81;
	@ObfInfo(name = "eu", desc = "Z")
	static boolean field91;
	@ObfInfo(name = "id", desc = "Z")
	static boolean field94;
	@ObfInfo(name = "nz", desc = "[Z")
	static boolean[] field164;
	@ObfInfo(name = "on", desc = "[Z")
	static boolean[] field184;
	@ObfInfo(name = "rf", desc = "[Z")
	static boolean[] field250;
	@ObfInfo(name = "rl", desc = "[Z")
	static boolean[] field251;
	@ObfInfo(name = "vw", desc = "[Z")
	static boolean[] field295;
	@ObfInfo(name = "re", desc = "[Z")
	static boolean[] field37;
	@ObfInfo(name = "ie", desc = "[B")
	static byte[] field310;
	@ObfInfo(name = "uy", desc = "Lsy;")
	static class101 field109;
	@ObfInfo(name = "ue", desc = "Lsy;")
	static class101 field83;
	@ObfInfo(name = "nn", desc = "Low;")
	static class113 field154;
	@ObfInfo(name = "np", desc = "Low;")
	static class113 field168;
	@ObfInfo(name = "rq", desc = "Low;")
	static class113 field228;
	@ObfInfo(name = "rc", desc = "Low;")
	static class113 field242;
	@ObfInfo(name = "rs", desc = "Low;")
	static class113 field244;
	@ObfInfo(name = "rp", desc = "Low;")
	static class113 field281;
	@ObfInfo(name = "nw", desc = "Low;")
	static class113 field297;
	@ObfInfo(name = "nr", desc = "[[[Low;")
	static class113[][][] field167;
	@ObfInfo(name = "uv", desc = "Lsn;")
	static class13 field292;
	@ObfInfo(name = "pd", desc = "Lmi;")
	static class131 field204;
	@ObfInfo(name = "pq", desc = "Lmi;")
	static class131 field215;
	@ObfInfo(name = "pb", desc = "Lmi;")
	static class131 field230;
	@ObfInfo(name = "pg", desc = "Lmi;")
	static class131 field320;
	@ObfInfo(name = "tn", desc = "[Lgo;")
	static class143[] field272;
	@ObfInfo(name = "kt", desc = "Lui;")
	static class150 field107;
	@ObfInfo(name = "tb", desc = "[Lui;")
	static class150[] field285;
	@ObfInfo(name = "wy", desc = "Lcu;")
	static class151 field317;
	@ObfInfo(name = "vy", desc = "Lmt;")
	static class201 field313;
	@ObfInfo(name = "wo", desc = "Lsv;")
	static class224 field172;
	@ObfInfo(name = "fl", desc = "Ldz;")
	static class253 field59;
	@ObfInfo(name = "hv", desc = "Lcc;")
	static class260 field82;
	@ObfInfo(name = "tu", desc = "[Lfi;")
	static class291[] field271;
	@ObfInfo(name = "ss", desc = "Lig;")
	static class294 field266;
	@ObfInfo(name = "sp", desc = "Liz;")
	static class320 field175;
	@ObfInfo(name = "ws", desc = "Lqv;")
	static class339 field318;
	@ObfInfo(name = "ge", desc = "Ltv;")
	static class347 field72;
	@ObfInfo(name = "gj", desc = "Lfr;")
	static class365 field277;
	@ObfInfo(name = "iu", desc = "Lpy;")
	static class382 field95;
	@ObfInfo(name = "rg", desc = "Lso;")
	static class405 field246;
	@ObfInfo(name = "pu", desc = "Lso;")
	static class405 field48;
	@ObfInfo(name = "ij", desc = "[Ldx;")
	static class412[] field87;
	@ObfInfo(name = "mi", desc = "[Ldf;")
	static class439[] field200;
	@ObfInfo(name = "wf", desc = "[Loh;")
	static class454[] field305;
	@ObfInfo(name = "rm", desc = "Luo;")
	static class491 field241;
	@ObfInfo(name = "ek", desc = "Ldc;")
	static class535 field56;
	@ObfInfo(name = "ec", desc = "Ldc;")
	static class535 field57;
	@ObfInfo(name = "uu", desc = "[Lbp;")
	static class538[] field71;
	@ObfInfo(name = "wj", desc = "Lle;")
	static class7 field113;
	@ObfInfo(name = "wx", desc = "Lle;")
	static class7 field223;
	@ObfInfo(name = "jz", desc = "[Lis;")
	static class77[] field102;
	@ObfInfo(name = "jj", desc = "I", intMultiplier = -8326345)
	static int field100;
	@ObfInfo(name = "jq", desc = "I", intMultiplier = -1422375547)
	static int field101;
	@ObfInfo(name = "ez", desc = "I", intMultiplier = 1514019037)
	static int field105;
	@ObfInfo(name = "kb", desc = "I", intMultiplier = -1566404371)
	static int field106;
	@ObfInfo(name = "kx", desc = "I", intMultiplier = 302083915)
	static int field108;
	@ObfInfo(name = "kp", desc = "I", intMultiplier = 312756687)
	static int field110;
	@ObfInfo(name = "dj", desc = "I", intMultiplier = -667400491)
	static int field111;
	@ObfInfo(name = "le", desc = "I", intMultiplier = 603979869)
	static int field116;
	@ObfInfo(name = "lu", desc = "I", intMultiplier = -1883228053)
	static int field117;
	@ObfInfo(name = "vn", desc = "I", intMultiplier = -212965565)
	static int field118;
	@ObfInfo(name = "lm", desc = "I", intMultiplier = 453449917)
	static int field120;
	@ObfInfo(name = "lp", desc = "I", intMultiplier = 1252802435)
	static int field121;
	@ObfInfo(name = "ly", desc = "I", intMultiplier = -295239457)
	static int field122;
	@ObfInfo(name = "lg", desc = "I", intMultiplier = 575673155)
	static int field123;
	@ObfInfo(name = "lk", desc = "I", intMultiplier = 5882375)
	static int field124;
	@ObfInfo(name = "lc", desc = "I", intMultiplier = 623963831)
	static int field125;
	@ObfInfo(name = "lv", desc = "I", intMultiplier = -557098467)
	static int field126;
	@ObfInfo(name = "lr", desc = "I", intMultiplier = -1700661189)
	static int field127;
	@ObfInfo(name = "lj", desc = "I", intMultiplier = -1087269561)
	static int field129;
	@ObfInfo(name = "ji", desc = "I", intMultiplier = 2065503827)
	static int field131;
	@ObfInfo(name = "lq", desc = "I", intMultiplier = 1918268123)
	static int field132;
	@ObfInfo(name = "vb", desc = "I", intMultiplier = 2122687767)
	static int field133;
	@ObfInfo(name = "qr", desc = "I", intMultiplier = -391941313)
	static int field137;
	@ObfInfo(name = "ir", desc = "I", intMultiplier = 543863055)
	static int field141;
	@ObfInfo(name = "px", desc = "I", intMultiplier = 2106479597)
	static int field144;
	@ObfInfo(name = "me", desc = "I", intMultiplier = -829592937)
	static int field145;
	@ObfInfo(name = "mz", desc = "I", intMultiplier = -1703548153)
	static int field146;
	@ObfInfo(name = "mc", desc = "I", intMultiplier = 1726753241)
	static int field147;
	@ObfInfo(name = "mf", desc = "I", intMultiplier = 15985943)
	static int field148;
	@ObfInfo(name = "mp", desc = "I", intMultiplier = 1454203771)
	static int field152;
	@ObfInfo(name = "mx", desc = "I", intMultiplier = 530420265)
	static int field155;
	@ObfInfo(name = "my", desc = "I", intMultiplier = 1997408031)
	static int field156;
	@ObfInfo(name = "qb", desc = "I", intMultiplier = 220177805)
	static int field158;
	@ObfInfo(name = "ps", desc = "I", intMultiplier = 1365611331)
	static int field161;
	@ObfInfo(name = "gb", desc = "I", intMultiplier = -441683383)
	static int field165;
	@ObfInfo(name = "ni", desc = "I", intMultiplier = 1574957247)
	static int field166;
	@ObfInfo(name = "lf", desc = "I", intMultiplier = 393692699)
	static int field169;
	@ObfInfo(name = "om", desc = "I", intMultiplier = 1676985473)
	static int field176;
	@ObfInfo(name = "ld", desc = "I", intMultiplier = 1544467501)
	static int field183;
	@ObfInfo(name = "ot", desc = "I", intMultiplier = -473784219)
	static int field188;
	@ObfInfo(name = "oc", desc = "I", intMultiplier = 369924789)
	static int field189;
	@ObfInfo(name = "oi", desc = "I", intMultiplier = -1357245691)
	static int field190;
	@ObfInfo(name = "oq", desc = "I", intMultiplier = 2098316339)
	static int field191;
	@ObfInfo(name = "ov", desc = "I", intMultiplier = 61632949)
	static int field192;
	@ObfInfo(name = "ei", desc = "I", intMultiplier = 714789379)
	static int field194;
	@ObfInfo(name = "of", desc = "I", intMultiplier = 757890481)
	static int field195;
	@ObfInfo(name = "mr", desc = "I", intMultiplier = -1271442429)
	static int field197;
	@ObfInfo(name = "ry", desc = "I", intMultiplier = 525652161)
	static int field198;
	@ObfInfo(name = "pj", desc = "I", intMultiplier = 1642683045)
	static int field199;
	@ObfInfo(name = "ti", desc = "I", intMultiplier = -214324647)
	static int field201;
	@ObfInfo(name = "pv", desc = "I", intMultiplier = 2109391005)
	static int field202;
	@ObfInfo(name = "pn", desc = "I", intMultiplier = 246939975)
	static int field203;
	@ObfInfo(name = "lx", desc = "I", intMultiplier = -817936455)
	static int field205;
	@ObfInfo(name = "ml", desc = "I", intMultiplier = 798221835)
	static int field206;
	@ObfInfo(name = "gg", desc = "I", intMultiplier = -961634761)
	static int field207;
	@ObfInfo(name = "pc", desc = "I", intMultiplier = -1550111259)
	static int field213;
	@ObfInfo(name = "el", desc = "I", intMultiplier = -485020789)
	static int field214;
	@ObfInfo(name = "qe", desc = "I", intMultiplier = 1055651323)
	static int field217;
	@ObfInfo(name = "qd", desc = "I", intMultiplier = 16018961)
	static int field218;
	@ObfInfo(name = "ky", desc = "I", intMultiplier = 205680803)
	static int field219;
	@ObfInfo(name = "qg", desc = "I", intMultiplier = -1139085369)
	static int field225;
	@ObfInfo(name = "qs", desc = "I", intMultiplier = 311981329)
	static int field227;
	@ObfInfo(name = "qt", desc = "I", intMultiplier = -85127843)
	static int field229;
	@ObfInfo(name = "kv", desc = "I", intMultiplier = -1757343563)
	static int field231;
	@ObfInfo(name = "qp", desc = "I", intMultiplier = -898905347)
	static int field232;
	@ObfInfo(name = "qi", desc = "I", intMultiplier = -1991914345)
	static int field233;
	@ObfInfo(name = "qy", desc = "I", intMultiplier = 307590481)
	static int field234;
	@ObfInfo(name = "qa", desc = "I", intMultiplier = -926799759)
	static int field235;
	@ObfInfo(name = "qh", desc = "I", intMultiplier = -1052818097)
	static int field236;
	@ObfInfo(name = "ru", desc = "I", intMultiplier = -637792155)
	static int field237;
	@ObfInfo(name = "rz", desc = "I", intMultiplier = 1827467907)
	static int field240;
	@ObfInfo(name = "vo", desc = "I", intMultiplier = -685574095)
	static int field243;
	@ObfInfo(name = "em", desc = "I", intMultiplier = -1940797745)
	static int field247;
	@ObfInfo(name = "rk", desc = "I", intMultiplier = -2058470363)
	static int field248;
	@ObfInfo(name = "ri", desc = "I", intMultiplier = 874164869)
	static int field256;
	@ObfInfo(name = "sk", desc = "I", intMultiplier = 1986660135)
	static int field260;
	@ObfInfo(name = "sn", desc = "I", intMultiplier = -2127681993)
	static int field261;
	@ObfInfo(name = "mj", desc = "I", intMultiplier = 1950062223)
	static int field264;
	@ObfInfo(name = "sf", desc = "I", intMultiplier = 1915135663)
	static int field267;
	@ObfInfo(name = "tj", desc = "I", intMultiplier = 713564975)
	static int field273;
	@ObfInfo(name = "tl", desc = "I", intMultiplier = 741539585)
	static int field274;
	@ObfInfo(name = "tz", desc = "I", intMultiplier = 850793817)
	static int field278;
	@ObfInfo(name = "cw", desc = "I", intMultiplier = -1264215911)
	static int field28;
	@ObfInfo(name = "ta", desc = "I", intMultiplier = 35990849)
	static int field280;
	@ObfInfo(name = "tt", desc = "I", intMultiplier = -1939358919)
	static int field282;
	@ObfInfo(name = "py", desc = "I", intMultiplier = -866831459)
	static int field286;
	@ObfInfo(name = "ql", desc = "I", intMultiplier = -1028226557)
	static int field29;
	@ObfInfo(name = "ng", desc = "I", intMultiplier = 218131503)
	static int field296;
	@ObfInfo(name = "kr", desc = "I", intMultiplier = 1345195633)
	static int field298;
	@ObfInfo(name = "nd", desc = "I", intMultiplier = 2086333427)
	static int field30;
	@ObfInfo(name = "vd", desc = "I", intMultiplier = -496070959)
	static int field308;
	@ObfInfo(name = "vc", desc = "I", intMultiplier = -957988005)
	static int field309;
	@ObfInfo(name = "vx", desc = "I", intMultiplier = -544120667)
	static int field312;
	@ObfInfo(name = "pt", desc = "I", intMultiplier = 679999119)
	static int field314;
	@ObfInfo(name = "vs", desc = "I", intMultiplier = -606789725)
	static int field315;
	@ObfInfo(name = "cv", desc = "I", intMultiplier = -254020809)
	static int field32;
	@ObfInfo(name = "wa", desc = "I", intMultiplier = -1467424607)
	static int field321;
	@ObfInfo(name = "wk", desc = "I", intMultiplier = -170542827)
	static int field325;
	@ObfInfo(name = "we", desc = "I", intMultiplier = -1074907455)
	static int field326;
	@ObfInfo(name = "co", desc = "I", intMultiplier = -647533501)
	static int field33;
	@ObfInfo(name = "eh", desc = "I", intMultiplier = 522278027)
	static int field330;
	@ObfInfo(name = "sr", desc = "I", intMultiplier = -765244531)
	static int field35;
	@ObfInfo(name = "lo", desc = "I", intMultiplier = 1169837641)
	static int field39;
	@ObfInfo(name = "po", desc = "I", intMultiplier = -1685145543)
	static int field41;
	@ObfInfo(name = "go", desc = "I", intMultiplier = -772517067)
	static int field42;
	@ObfInfo(name = "eq", desc = "I", intMultiplier = 874241351)
	static int field43;
	@ObfInfo(name = "ej", desc = "I", intMultiplier = 139028677)
	static int field44;
	@ObfInfo(name = "cl", desc = "I", intMultiplier = -260341301)
	static int field45;
	@ObfInfo(name = "ev", desc = "I", intMultiplier = 275758355)
	static int field47;
	@ObfInfo(name = "et", desc = "I", intMultiplier = -709660557)
	static int field49;
	@ObfInfo(name = "eb", desc = "I", intMultiplier = 1664778039)
	static int field51;
	@ObfInfo(name = "cm", desc = "I", intMultiplier = -472947525)
	static int field52;
	@ObfInfo(name = "es", desc = "I", intMultiplier = 1905761173)
	static int field58;
	@ObfInfo(name = "fj", desc = "I", intMultiplier = 1824417205)
	static int field60;
	@ObfInfo(name = "fv", desc = "I", intMultiplier = -285158529)
	static int field61;
	@ObfInfo(name = "pe", desc = "I", intMultiplier = -1773996711)
	static int field62;
	@ObfInfo(name = "gi", desc = "I", intMultiplier = 1808720373)
	static int field63;
	@ObfInfo(name = "lh", desc = "I", intMultiplier = 563286433)
	static int field64;
	@ObfInfo(name = "qf", desc = "I", intMultiplier = 2053842635)
	static int field65;
	@ObfInfo(name = "kg", desc = "I", intMultiplier = 348196035)
	static int field66;
	@ObfInfo(name = "en", desc = "I", intMultiplier = -1792372927)
	static int field68;
	@ObfInfo(name = "rr", desc = "I", intMultiplier = -1436575603)
	static int field79;
	@ObfInfo(name = "im", desc = "I", intMultiplier = 895819663)
	static int field80;
	@ObfInfo(name = "in", desc = "I", intMultiplier = 641541081)
	static int field88;
	@ObfInfo(name = "gl", desc = "I", intMultiplier = -830204195)
	static int field93;
	@ObfInfo(name = "jg", desc = "I", intMultiplier = 1461936041)
	static int field97;
	@ObfInfo(name = "rh", desc = "I", intMultiplier = 1955656231)
	static int field98;
	@ObfInfo(name = "jl", desc = "I", intMultiplier = 1509888147)
	static int field99;
	@ObfInfo(name = "li", desc = "[I")
	static int[] field134;
	@ObfInfo(name = "ll", desc = "[I")
	static int[] field135;
	@ObfInfo(name = "mh", desc = "[I")
	static int[] field138;
	@ObfInfo(name = "mv", desc = "[I")
	static int[] field139;
	@ObfInfo(name = "qz", desc = "[I")
	static int[] field151;
	@ObfInfo(name = "vk", desc = "[I")
	static int[] field159;
	@ObfInfo(name = "ny", desc = "[I")
	static int[] field171;
	@ObfInfo(name = "oz", desc = "[I")
	static int[] field177;
	@ObfInfo(name = "oh", desc = "[I")
	static int[] field178;
	@ObfInfo(name = "od", desc = "[I")
	static int[] field180;
	@ObfInfo(name = "og", desc = "[I")
	static int[] field181;
	@ObfInfo(name = "ne", desc = "[I")
	static int[] field208;
	@ObfInfo(name = "oy", desc = "[I")
	static int[] field220;
	@ObfInfo(name = "qo", desc = "[I")
	static int[] field224;
	@ObfInfo(name = "qx", desc = "[I")
	static int[] field226;
	@ObfInfo(name = "ic", desc = "[I")
	static int[] field238;
	@ObfInfo(name = "ua", desc = "[I")
	static int[] field239;
	@ObfInfo(name = "vz", desc = "[I")
	static int[] field245;
	@ObfInfo(name = "vq", desc = "[I")
	static int[] field249;
	@ObfInfo(name = "rt", desc = "[I")
	static int[] field252;
	@ObfInfo(name = "rx", desc = "[I")
	static int[] field253;
	@ObfInfo(name = "rw", desc = "[I")
	static int[] field254;
	@ObfInfo(name = "rn", desc = "[I")
	static int[] field255;
	@ObfInfo(name = "se", desc = "[I")
	static int[] field259;
	@ObfInfo(name = "ih", desc = "[I")
	static int[] field26;
	@ObfInfo(name = "so", desc = "[I")
	static int[] field268;
	@ObfInfo(name = "su", desc = "[I")
	static int[] field269;
	@ObfInfo(name = "tq", desc = "[I")
	static int[] field275;
	@ObfInfo(name = "tg", desc = "[I")
	static int[] field276;
	@ObfInfo(name = "tf", desc = "[I")
	static int[] field283;
	@ObfInfo(name = "tv", desc = "[I")
	static int[] field284;
	@ObfInfo(name = "mq", desc = "[I")
	static int[] field287;
	@ObfInfo(name = "qu", desc = "[I")
	static int[] field293;
	@ObfInfo(name = "md", desc = "[I")
	static int[] field311;
	@ObfInfo(name = "nk", desc = "[I")
	static int[] field319;
	@ObfInfo(name = "nj", desc = "[I")
	static int[] field322;
	@ObfInfo(name = "xy", desc = "[I")
	static int[] field328;
	@ObfInfo(name = "xf", desc = "[I")
	static int[] field329;
	@ObfInfo(name = "uj", desc = "[I")
	static int[] field34;
	@ObfInfo(name = "nt", desc = "[I")
	static int[] field53;
	@ObfInfo(name = "lb", desc = "[I")
	static int[] field86;
	@ObfInfo(name = "vh", desc = "[I")
	static int[] field89;
	@ObfInfo(name = "mk", desc = "[[I")
	static int[][] field143;
	@ObfInfo(name = "mg", desc = "[[I")
	static int[][] field36;
	@ObfInfo(name = "jf", desc = "[[[I")
	static int[][][] field104;
	@ObfInfo(name = "it", desc = "Ljava/lang/String;")
	static String field193;
	@ObfInfo(name = "pa", desc = "Ljava/lang/String;")
	static String field210;
	@ObfInfo(name = "pi", desc = "Ljava/lang/String;")
	static String field221;
	@ObfInfo(name = "sc", desc = "Ljava/lang/String;")
	static String field55;
	@ObfInfo(name = "mu", desc = "[Ljava/lang/String;")
	static String[] field142;
	@ObfInfo(name = "ob", desc = "[Ljava/lang/String;")
	static String[] field182;
	@ObfInfo(name = "ok", desc = "[Ljava/lang/String;")
	static String[] field301;
	@ObfInfo(name = "ns", desc = "[Ljava/lang/String;")
	static String[] field50;
	@ObfInfo(name = "wv", desc = "Ljava/util/ArrayList;")
	static ArrayList field324;
	@ObfInfo(name = "jn", desc = "Ljava/util/HashMap;")
	static HashMap field96;
	@ObfInfo(name = "wt", desc = "Ljava/util/List;")
	static List field196;
	@ObfInfo(name = "ma", desc = "J", longMultiplier = -367930453646370059L)
	static long field157;
	@ObfInfo(name = "ea", desc = "J", longMultiplier = -152133301902653265L)
	static long field170;
	@ObfInfo(name = "sq", desc = "J", longMultiplier = 7924104649919695757L)
	static long field257;
	@ObfInfo(name = "sx", desc = "J", longMultiplier = 7846728172107190483L)
	static long field270;
	@ObfInfo(name = "ey", desc = "J", longMultiplier = 3989900610207861207L)
	static long field90;
	@ObfInfo(name = "si", desc = "[J")
	static long[] field173;
	@ObfInfo(name = "ve", desc = "S")
	static short field136;
	@ObfInfo(name = "vp", desc = "S")
	static short field186;
	@ObfInfo(name = "vl", desc = "S")
	static short field300;
	@ObfInfo(name = "vm", desc = "S")
	static short field302;
	@ObfInfo(name = "vi", desc = "S")
	static short field303;
	@ObfInfo(name = "vf", desc = "S")
	static short field304;
	@ObfInfo(name = "vu", desc = "S")
	static short field306;
	@ObfInfo(name = "vj", desc = "S")
	static short field307;
	@ObfInfo(name = "xm", desc = "Lcl;")
	static final class135 field327;
	@ObfInfo(name = "nb", desc = "[I")
	static final int[] field162;
	@ObfInfo(name = "jm", desc = "[I")
	static final int[] field212;
	@ObfInfo(name = "hg", desc = "Ljava/lang/String;")
	static final String field163;
	@ObfInfo(name = "hl", desc = "Ljava/lang/String;")
	static final String field279;
	@ObfInfo(name = "hh", desc = "Z")
	boolean field74;
	@ObfInfo(name = "gn", desc = "Lar;")
	class129 field70;
	@ObfInfo(name = "ib", desc = "Ltm;")
	class280 field114;
	@ObfInfo(name = "ht", desc = "Lax;")
	class282 field149;
	@ObfInfo(name = "hd", desc = "Lax;")
	class282 field76;
	@ObfInfo(name = "il", desc = "Lap;")
	class463 field84;
	@ObfInfo(name = "ho", desc = "Lcom/jagex/oldscape/pub/OtlTokenRequester;")
	OtlTokenRequester field179;
	@ObfInfo(name = "hk", desc = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;")
	RefreshAccessTokenRequester field77;
	@ObfInfo(name = "hi", desc = "I", intMultiplier = 255508409)
	int field75;
	@ObfInfo(name = "gz", desc = "Ljava/lang/String;")
	String field69;
	@ObfInfo(name = "hj", desc = "Ljava/util/concurrent/Future;")
	Future field73;
	@ObfInfo(name = "hz", desc = "Ljava/util/concurrent/Future;")
	Future field78;
	@ObfInfo(name = "ig", desc = "J", longMultiplier = 7631410939937701965L)
	long field85;

	static {
		field67 = true;
		field27 = 1;
		field28 = 0;
		field52 = 0;
		field54 = false;
		field31 = false;
		field32 = -1;
		field33 = -1;
		field45 = -1;
		field262 = false;
		field209 = 216;
		field111 = 0;
		field38 = false;
		field40 = true;
		field330 = 0;
		field90 = -1L;
		field43 = -1;
		field44 = -1;
		field170 = -1L;
		field46 = true;
		field47 = 0;
		field105 = 0;
		field49 = 0;
		field68 = 0;
		field51 = 0;
		field194 = 0;
		field58 = 0;
		field214 = 0;
		field247 = 0;
		field56 = class535.field4263;
		field57 = class535.field4263;
		field91 = false;
		field59 = class253.field2101;
		field60 = 0;
		field61 = 0;
		field207 = 0;
		field63 = 0;
		field42 = 0;
		field93 = 0;
		field165 = 0;
		field277 = class365.field2841;
		field72 = class347.field2748;
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

		String var0 = class323.method1788(var3, 0, var3.length);
		field279 = var0;
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

		var0 = class323.method1788(var3, 0, var3.length);
		field163 = var0;
		field81 = false;
		field82 = new class260();
		field310 = null;
		field87 = new class412[65536];
		field88 = 0;
		field26 = new int[65536];
		field141 = 0;
		field238 = new int[250];
		field92 = new class336();
		field80 = 0;
		field94 = false;
		field95 = new class382();
		field96 = new HashMap();
		field97 = 0;
		field131 = 1;
		field99 = 0;
		field100 = 1;
		field101 = 0;
		field102 = new class77[4];
		field103 = false;
		field104 = new int[4][13][13];
		field212 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field106 = 0;
		field108 = 2301979;
		field219 = 5063219;
		field110 = 3353893;
		field298 = 7759444;
		field112 = false;
		field231 = 0;
		field66 = 128;
		field205 = 0;
		field116 = 0;
		field117 = 0;
		field39 = 0;
		field183 = 0;
		field120 = 0;
		field121 = 50;
		field122 = 0;
		field123 = 0;
		field124 = 0;
		field125 = 12;
		field126 = 6;
		field127 = 0;
		field128 = false;
		field129 = 0;
		field130 = false;
		field169 = 0;
		field132 = 0;
		field64 = 50;
		field134 = new int[field64];
		field135 = new int[field64];
		field86 = new int[field64];
		field311 = new int[field64];
		field138 = new int[field64];
		field139 = new int[field64];
		field36 = new int[field64][];
		field287 = new int[field64];
		field142 = new String[field64];
		field143 = new int[104][104];
		field197 = 0;
		field145 = -1;
		field146 = -1;
		field147 = 0;
		field148 = 0;
		field206 = 0;
		field264 = 0;
		field316 = true;
		field152 = 0;
		field153 = true;
		field200 = new class439[2048];
		field155 = -1;
		field156 = 0;
		field157 = -1L;
		field265 = true;
		field30 = 0;
		field296 = 0;
		field53 = new int[1000];
		field162 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field50 = new String[8];
		field164 = new boolean[8];
		field208 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field166 = -1;
		field167 = new class113[4][104][104];
		field168 = new class113();
		field154 = new class113();
		field297 = new class113();
		field171 = new int[25];
		field319 = new int[25];
		field322 = new int[25];
		field174 = false;
		field140 = false;
		field176 = 0;
		field177 = new int[500];
		field178 = new int[500];
		field220 = new int[500];
		field180 = new int[500];
		field181 = new int[500];
		field182 = new String[500];
		field301 = new String[500];
		field184 = new boolean[500];
		field185 = false;
		field160 = false;
		field187 = true;
		field188 = -1;
		field189 = -1;
		field190 = 0;
		field191 = 50;
		field192 = 0;
		field193 = null;
		field119 = false;
		field195 = -1;
		field161 = -1;
		field210 = null;
		field221 = null;
		field199 = -1;
		field48 = new class405(8);
		field41 = 0;
		field202 = -1;
		field203 = 0;
		field204 = null;
		field144 = 0;
		field314 = 0;
		field115 = 0;
		field62 = -1;
		field323 = false;
		field320 = null;
		field211 = null;
		field230 = null;
		field213 = 0;
		field286 = 0;
		field215 = null;
		field216 = false;
		field217 = -1;
		field218 = -1;
		field263 = false;
		field65 = -1;
		field137 = -1;
		field222 = false;
		field29 = 1;
		field224 = new int[32];
		field225 = 0;
		field226 = new int[32];
		field227 = 0;
		field151 = new int[32];
		field229 = 0;
		field293 = new int[32];
		field158 = 0;
		field232 = 0;
		field233 = 0;
		field234 = 0;
		field235 = 0;
		field236 = 0;
		field237 = 0;
		field98 = 0;
		field79 = 0;
		field240 = 0;
		field241 = new class491();
		field242 = new class113();
		field228 = new class113();
		field244 = new class113();
		field281 = new class113();
		field246 = new class405(512);
		field198 = 0;
		field248 = -2;
		field37 = new boolean[100];
		field250 = new boolean[100];
		field251 = new boolean[100];
		field252 = new int[100];
		field253 = new int[100];
		field254 = new int[100];
		field255 = new int[100];
		field256 = 0;
		field257 = 0L;
		field258 = true;
		field259 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field260 = 0;
		field261 = 0;
		field55 = "";
		field173 = new long[100];
		field35 = 0;
		field175 = new class320();
		field266 = new class294();
		field267 = 0;
		field268 = new int[128];
		field269 = new int[128];
		field270 = -1L;
		field271 = new class291[4];
		field272 = new class143[4];
		field273 = -1;
		field274 = 0;
		field275 = new int[1000];
		field276 = new int[1000];
		field285 = new class150[1000];
		field278 = 0;
		field201 = 0;
		field280 = 0;
		field299 = false;
		field282 = 0;
		field283 = new int[50];
		field284 = new int[50];
		field239 = new int[50];
		field34 = new int[50];
		field71 = new class538[50];
		field288 = false;
		field289 = false;
		field290 = false;
		field291 = false;
		field292 = null;
		field83 = null;
		field109 = null;
		field294 = false;
		field295 = new boolean[5];
		field89 = new int[5];
		field249 = new int[5];
		field159 = new int[5];
		field245 = new int[5];
		field300 = 256;
		field186 = 205;
		field302 = 256;
		field303 = 320;
		field304 = 1;
		field136 = 32767;
		field306 = 1;
		field307 = 32767;
		field308 = 0;
		field309 = 0;
		field243 = 0;
		field118 = 0;
		field312 = 0;
		field313 = new class201();
		field133 = -1;
		field315 = -1;
		field172 = new class385();
		field305 = new class454[8];
		field317 = new class151();
		field318 = new class339(8, class337.field2676);
		field223 = new class7(64);
		field113 = new class7(64);
		field321 = -1;
		field150 = -1;
		field196 = new ArrayList();
		field324 = new ArrayList(10);
		field325 = 0;
		field326 = 0;
		field327 = new class135();
		field328 = new int[50];
		field329 = new int[50];
	}

	@ObfInfo(name = "<init>", desc = "()V")
	public Client() {
		this.field74 = false;
		this.field75 = 0;
		this.field85 = -1L;
	}

	@ObfInfo(name = "br", desc = "(I)V")
	protected final void method1907() {
	}

	@ObfInfo(name = "init", desc = "()V")
	public final void init() {
		if (this.method1910()) {
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (null != var2) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class479.field3820)) {
							field54 = true;
						} else {
							field54 = false;
						}
						break;
					case 4:
						if (field33 == -1) {
							field33 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field28 = Integer.parseInt(var2);
						break;
					case 6:
						class524.field4196 = class67.method499(Integer.parseInt(var2));
						break;
					case 7:
						int var4 = Integer.parseInt(var2);
						class523[] var5 = class523.method2556();
						int var6 = 0;

						class523 var12;
						while (true) {
							if (var6 >= var5.length) {
								var12 = null;
								break;
							}

							class523 var7 = var5[var6];
							if (var4 == var7.field4195) {
								var12 = var7;
								break;
							}

							++var6;
						}

						class383.field2946 = var12;
						break;
					case 8:
						if (var2.equalsIgnoreCase(class479.field3820)) {
						}
						break;
					case 9:
						class277.field2242 = var2;
						break;
					case 10:
						class174[] var11 = new class174[]{class174.field1600, class174.field1607, class174.field1601, class174.field1606, class174.field1602, class174.field1604};
						class512.field4103 = (class174)class216.method1198(var11, Integer.parseInt(var2));
						if (class174.field1604 == class512.field4103) {
							class67.field769 = class187.field1706;
						} else {
							class67.field769 = class187.field1708;
						}
						break;
					case 11:
						class82.field868 = var2;
						break;
					case 12:
						field27 = Integer.parseInt(var2);
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
						class512.field4102 = Integer.parseInt(var2);
						break;
					case 15:
						field52 = Integer.parseInt(var2);
						break;
					case 17:
						class290.field2297 = var2;
						break;
					case 21:
						field32 = Integer.parseInt(var2);
						break;
					case 25:
						int var3 = var2.indexOf(".");
						if (var3 == -1) {
							field209 = Integer.parseInt(var2);
						} else {
							field209 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			class194.field1766 = false;
			field31 = false;
			class17.field364 = this.getCodeBase().getHost();
			class176.field1623 = new class41();
			String var9 = class383.field2946.field4190;
			byte var10 = 0;
			if ((field28 & class82.field851.method2222()) != 0) {
				class499.field4034 = "beta";
			}

			try {
				class519.method2545("oldschool", class499.field4034, var9, var10, 22);
			} catch (Exception var8) {
				class159.method913((String)null, var8);
			}

			class51.field585 = this;
			class348.field2758 = field33;
			method130();
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field74 = true;
			}

			if (field45 == -1) {
				if (!this.method88() && !this.method111((byte)106)) {
					field45 = 0;
				} else {
					field45 = 5;
				}
			}

			this.method1902(765, 503, 216, 1);
		}
	}

	@ObfInfo(name = "finalize", desc = "()V")
	protected void finalize() throws Throwable {
		class303.method1680(this);
		super.finalize();
	}

	@ObfInfo(name = "gx", desc = "(I)Z")
	boolean method116() {
		return this.field75 == 1;
	}

	@ObfInfo(name = "setClient", desc = "(I)V")
	public void setClient(int var1) {
		this.field75 = var1;
	}

	@ObfInfo(name = "setOtlTokenRequester", desc = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (null != var1) {
			this.field179 = var1;
			class162.method924(10);
		}
	}

	@ObfInfo(name = "setRefreshTokenRequester", desc = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field77 = var1;
		}
	}

	@ObfInfo(name = "isOnLoginScreen", desc = "()Z")
	public boolean isOnLoginScreen() {
		return field111 == 10;
	}

	@ObfInfo(name = "getAccountHash", desc = "()J")
	public long getAccountHash() {
		return this.field85;
	}

	@ObfInfo(name = "gq", desc = "(I)Z", opaqueValue = "-1897329401")
	boolean method88() {
		return null != class435.field3280 && !class435.field3280.trim().isEmpty() && class312.field2540 != null && !class312.field2540.trim().isEmpty();
	}

	@ObfInfo(name = "gt", desc = "(B)Z")
	boolean method111(byte var1) {
		boolean var10000;
		if (null != class249.field2080) {
			if (var1 <= -1) {
				throw new IllegalStateException();
			}

			if (!class249.field2080.trim().isEmpty()) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				if (class308.field2521 != null) {
					if (var1 <= -1) {
						throw new IllegalStateException();
					}

					if (!class308.field2521.trim().isEmpty()) {
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

	@ObfInfo(name = "gr", desc = "(B)Z")
	boolean method89() {
		return null != this.field179;
	}

	@ObfInfo(name = "gz", desc = "(Ljava/lang/String;I)V", opaqueValue = "-1932583265")
	void method114(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(class82.field868 + "shield/oauth/token" + (new class168(var3)).method950());
		class59 var5 = new class59();
		if (this.method116()) {
			var5.method474(field163);
		} else {
			var5.method474(field279);
		}

		var5.method473("Host", (new URL(class82.field868)).getHost());
		var5.method476(class329.field2630);
		class312 var6 = class312.field2533;
		RefreshAccessTokenRequester var7 = this.field77;
		if (null != var7) {
			this.field78 = var7.request(var6.method1726(), var4, var5.method472(), "");
		} else {
			class540 var8 = new class540(var4, var6, var5, this.field74);
			this.field76 = this.field70.method704(var8);
		}
	}

	@ObfInfo(name = "gn", desc = "(Ljava/lang/String;B)V", opaqueValue = "1")
	void method90(String var1) throws IOException {
		URL var3 = new URL(class82.field868 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class59 var4 = new class59();
		var4.method483(var1);
		class312 var5 = class312.field2532;
		OtlTokenRequester var6 = this.field179;
		if (null != var6) {
			this.field73 = var6.request(var5.method1726(), var3, var4.method472(), "");
		} else {
			class540 var7 = new class540(var3, var5, var4, this.field74);
			this.field149 = this.field70.method704(var7);
		}
	}

	@ObfInfo(name = "ht", desc = "(Ljava/lang/String;Ljava/lang/String;I)V")
	void method110(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(class82.field868 + "game-session/v1/tokens");
		class540 var5 = new class540(var4, class312.field2533, this.field74);
		var5.method2596().method483(var1);
		var5.method2596().method476(class329.field2630);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", var2);
		var5.method2592(new class531(var6));
		this.field149 = this.field70.method704(var5);
	}

	@ObfInfo(name = "by", desc = "(I)V", opaqueValue = "-1920432585")
	protected final void method1913() {
		class481.method2447(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class213.field1904 = field52 == 0 ? 43594 : field27 + 40000;
		class91.field927 = field52 == 0 ? 443 : field27 + 50000;
		class127.field1165 = class213.field1904;
		class22.field404 = class105.field1012;
		class142.field1430 = class105.field1015;
		class201.field1823 = class105.field1013;
		class201.field1830 = class105.field1014;
		class248.field2079 = new class537(this.field74, 216);
		this.method1888();
		this.method1890();
		class304.field2457 = this.method1917();
		this.method1915(field266, 0);
		this.method1915(field175, 1);
		class60.field733 = new class387(255, class519.field4152, class519.field4153, 500000);
		class408 var3 = null;
		class318 var4 = new class318();

		try {
			var3 = class519.method2544("", class512.field4103.field1605, false);
			byte[] var5 = new byte[(int)var3.method2137()];

			int var7;
			for (int var6 = 0; var6 < var5.length; var6 += var7) {
				var7 = var3.method2138(var5, var6, var5.length - var6);
				if (var7 == -1) {
					throw new IOException();
				}
			}

			var4 = new class318(new class280(var5));
		} catch (Exception var9) {
		}

		try {
			if (null != var3) {
				var3.method2139();
			}
		} catch (Exception var8) {
		}

		class281.field2262 = var4;
		this.method1885();
		class341.method1875(this, class282.field2263);
		class343.method1881(class281.field2262.method1760());
		class331.field2633 = new class14(class67.field769);
		this.field70 = new class129("tokenRequest", 1, 1);
		if (!class303.field2450.contains(this)) {
			class303.field2450.add(this);
		}

		class469.field3786 = new class286[1];
		class406 var10 = class406.field3136;
		class469.field3786[0] = new class286(var10.field3138, var10.field3143);
	}

	@ObfInfo(name = "bs", desc = "(I)V", opaqueValue = "1753601126")
	protected final void method1914() {
		++field330;
		this.method93();

		while (true) {
			class231 var2;
			synchronized(class208.field1864) {
				var2 = (class231)class208.field1862.method625();
			}

			if (null == var2) {
				boolean var8 = class303.method1682();
				if (var8 && field299 && null != class115.field1108) {
					class115.field1108.method2240();
				}

				method242();
				field175.method1779();
				this.method1889();
				synchronized(class166.field1577) {
					class166.field1570 = class166.field1566;
					class166.field1580 = class166.field1567;
					class166.field1563 = class166.field1568;
					class166.field1571 = class166.field1569;
					class166.field1574 = class166.field1572;
					class166.field1575 = class166.field1581;
					class166.field1576 = class166.field1579;
					class166.field1564 = class166.field1573;
					class166.field1572 = 0;
				}

				if (null != class304.field2457) {
					int var3 = class304.field2457.method1969();
					field240 = var3;
				}

				if (field111 == 0) {
					method210();
					class346.method1918();
				} else if (field111 == 5) {
					class162.method937(this, class209.field1870, class256.field2112);
					method210();
					class346.method1918();
				} else if (field111 != 10 && field111 != 11) {
					if (field111 == 20) {
						class162.method937(this, class209.field1870, class256.field2112);
						this.method94();
					} else if (field111 == 50) {
						class162.method937(this, class209.field1870, class256.field2112);
						this.method94();
					} else if (field111 == 25) {
						method259();
					}
				} else {
					class162.method937(this, class209.field1870, class256.field2112);
				}

				if (field111 == 30) {
					this.method113();
				} else if (field111 == 40 || field111 == 45) {
					this.method94();
				}

				return;
			}

			var2.field1965.method2511(var2.field1964, (int)var2.field1483, var2.field1962, false);
		}
	}

	@ObfInfo(name = "bm", desc = "(ZI)V", opaqueValue = "-200110216")
	protected final void method1903(boolean var1) {
		if ((field111 == 10 || field111 == 20 || field111 == 30) && 0L != field257 && class43.method443() > field257) {
			class343.method1881(method212());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field37[var3] = true;
			}
		}

		if (field111 == 0) {
			this.method1900(class162.field1527, class162.field1528, var1);
		} else if (field111 == 5) {
			class496.method2486(class319.field2584, class209.field1870, class256.field2112);
		} else if (field111 != 10 && field111 != 11) {
			if (field111 == 20) {
				class496.method2486(class319.field2584, class209.field1870, class256.field2112);
			} else if (field111 == 50) {
				class496.method2486(class319.field2584, class209.field1870, class256.field2112);
			} else if (field111 == 25) {
				if (field101 == 1) {
					if (field97 > field131) {
						field131 = field97;
					}

					var3 = (field131 * 50 - field97 * 50) / field131;
					method269(class453.field3408 + class479.field3825 + class479.field3819 + var3 + "%" + class479.field3821, false);
				} else if (field101 == 2) {
					if (field99 > field100) {
						field100 = field99;
					}

					var3 = 50 + (field100 * 50 - field99 * 50) / field100;
					method269(class453.field3408 + class479.field3825 + class479.field3819 + var3 + "%" + class479.field3821, false);
				} else {
					method269(class453.field3408, false);
				}
			} else if (field111 == 30) {
				this.method96();
			} else if (field111 == 40) {
				method269(class453.field3409 + class479.field3825 + class453.field3410, false);
			} else if (field111 == 45) {
				method269(class453.field3669, false);
			}
		} else {
			class496.method2486(class319.field2584, class209.field1870, class256.field2112);
		}

		if (field111 == 30 && field256 == 0 && !var1 && !field258) {
			for (var3 = 0; var3 < field198; ++var3) {
				if (field250[var3]) {
					class535.field4266.method2450(field252[var3], field253[var3], field254[var3], field255[var3]);
					field250[var3] = false;
				}
			}
		} else if (field111 > 0) {
			class535.field4266.method2449(0, 0);

			for (var3 = 0; var3 < field198; ++var3) {
				field250[var3] = false;
			}
		}

	}

	@ObfInfo(name = "bf", desc = "(I)V", opaqueValue = "-1298916795")
	protected final void method1884() {
		if (class171.field1595.method1715()) {
			class171.field1595.method1713();
		}

		if (class306.field2472 != null) {
			class306.field2472.field2656 = false;
		}

		class306.field2472 = null;
		field92.method1825();
		if (class166.field1577 != null) {
			synchronized(class166.field1577) {
				class166.field1577 = null;
			}
		}

		class304.field2457 = null;
		if (class115.field1108 != null) {
			class115.field1108.method2232();
		}

		class176.field1623.method435();
		class208.method1157();
		if (class248.field2079 != null) {
			class248.field2079.method1385();
			class248.field2079 = null;
		}

		class519.method2547();
		this.field70.method705();
	}

	@ObfInfo(name = "hd", desc = "(I)V", opaqueValue = "-1893781545")
	void method93() {
		if (field111 != 1000) {
			boolean var2 = class176.field1623.method434();
			if (!var2) {
				this.method109();
			}

		}
	}

	@ObfInfo(name = "hk", desc = "(I)V", opaqueValue = "-1688469353")
	void method109() {
		if (class176.field1623.field526 >= 4) {
			this.method1904("js5crc");
			method248(1000);
		} else {
			if (class176.field1623.field549 >= 4) {
				if (field111 <= 5) {
					this.method1904("js5io");
					method248(1000);
					return;
				}

				field61 = 3000;
				class176.field1623.field549 = 3;
			}

			if (--field61 + 1 <= 0) {
				try {
					if (field60 == 0) {
						class306.field2477 = class346.field2715.method2497(class17.field364, class127.field1165);
						++field60;
					}

					if (field60 == 1) {
						if (class306.field2477.field3145 == 2) {
							this.method108(-1);
							return;
						}

						if (class306.field2477.field3145 == 1) {
							++field60;
						}
					}

					if (field60 == 2) {
						Socket var3 = (Socket)class306.field2477.field3146;
						class177 var2 = new class177(var3, 40000, 5000);
						class319.field2582 = var2;
						class280 var4 = new class280(5);
						var4.method1481(15);
						var4.method1547(216);
						class319.field2582.method620(var4.field2252, 0, 5);
						++field60;
						class343.field2706 = class43.method443();
					}

					if (field60 == 3) {
						if (class319.field2582.method619() > 0) {
							int var6 = class319.field2582.method621();
							if (var6 != 0) {
								this.method108(var6);
								return;
							}

							++field60;
						} else if (class43.method443() - class343.field2706 > 30000L) {
							this.method108(-2);
							return;
						}
					}

					if (field60 == 4) {
						class176.field1623.method429(class319.field2582, field111 > 20);
						class306.field2477 = null;
						class319.field2582 = null;
						field60 = 0;
						field207 = 0;
					}
				} catch (IOException var5) {
					this.method108(-3);
				}

			}
		}
	}

	@ObfInfo(name = "hz", desc = "(IB)V", opaqueValue = "-1")
	void method108(int var1) {
		class306.field2477 = null;
		class319.field2582 = null;
		field60 = 0;
		if (class127.field1165 == class213.field1904) {
			class127.field1165 = class91.field927;
		} else {
			class127.field1165 = class213.field1904;
		}

		++field207;
		if (field207 < 2 || var1 != 7 && var1 != 9) {
			if (field207 >= 2 && var1 == 6) {
				this.method1904("js5connect_outofdate");
				method248(1000);
			} else if (field207 >= 4) {
				if (field111 <= 5) {
					this.method1904("js5connect");
					method248(1000);
				} else {
					field61 = 3000;
				}
			}
		} else if (field111 <= 5) {
			this.method1904("js5connect_full");
			method248(1000);
		} else {
			field61 = 3000;
		}

	}

	@ObfInfo(name = "hy", desc = "(B)V", opaqueValue = "1")
	final void method94() {
		Object var2 = field92.method1824();
		class259 var3 = field92.field2666;

		try {
			if (field63 == 0) {
				if (null == class18.field375 && (field82.method1363() || field42 > 250)) {
					class18.field375 = field82.method1364();
					field82.method1365();
					field82 = null;
				}

				if (null != class18.field375) {
					if (var2 != null) {
						((class112)var2).method622();
						var2 = null;
					}

					class26.field426 = null;
					field94 = false;
					field42 = 0;
					if (field72.method1921()) {
						if (this.method88()) {
							try {
								this.method114(class312.field2540);
								method246(21);
							} catch (Throwable var21) {
								class159.method913((String)null, var21);
								class261.method1366(65);
								return;
							}
						} else {
							if (!this.method111((byte)6)) {
								class261.method1366(65);
								return;
							}

							try {
								this.method110(class249.field2080, class308.field2521);
								method246(20);
							} catch (Exception var20) {
								class159.method913((String)null, var20);
								class261.method1366(65);
								return;
							}
						}
					} else {
						method246(1);
					}
				}
			}

			class403 var23;
			if (field63 == 21) {
				if (null != this.field78) {
					if (!this.field78.isDone()) {
						return;
					}

					if (this.field78.isCancelled()) {
						class261.method1366(65);
						this.field78 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field78.get();
						if (!var4.isSuccess()) {
							class261.method1366(65);
							this.field78 = null;
							return;
						}

						class435.field3280 = var4.getAccessToken();
						class312.field2540 = var4.getRefreshToken();
						this.field78 = null;
					} catch (Exception var19) {
						class159.method913((String)null, var19);
						class261.method1366(65);
						this.field78 = null;
						return;
					}
				} else {
					if (null == this.field76) {
						class261.method1366(65);
						return;
					}

					if (!this.field76.method1564()) {
						return;
					}

					if (this.field76.method1565()) {
						class159.method913(this.field76.method1567(), (Throwable)null);
						class261.method1366(65);
						this.field76 = null;
						return;
					}

					var23 = this.field76.method1566();
					if (var23.method2124() != 200) {
						class261.method1366(65);
						this.field76 = null;
						return;
					}

					field42 = 0;
					class531 var5 = new class531(var23.method2126());

					try {
						class435.field3280 = var5.method2578().getString("access_token");
						class312.field2540 = var5.method2578().getString("refresh_token");
					} catch (Exception var18) {
						class159.method913("Error parsing tokens", var18);
						class261.method1366(65);
						this.field76 = null;
						return;
					}
				}

				this.method90(class435.field3280);
				method246(20);
			}

			if (field63 == 20) {
				if (this.field73 != null) {
					if (!this.field73.isDone()) {
						return;
					}

					if (this.field73.isCancelled()) {
						class261.method1366(65);
						this.field73 = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.field73.get();
						if (!var24.isSuccess()) {
							class261.method1366(65);
							this.field73 = null;
							return;
						}

						this.field69 = var24.getToken();
						this.field73 = null;
					} catch (Exception var17) {
						class159.method913((String)null, var17);
						class261.method1366(65);
						this.field73 = null;
						return;
					}
				} else {
					if (this.field149 == null) {
						class261.method1366(65);
						return;
					}

					if (!this.field149.method1564()) {
						return;
					}

					if (this.field149.method1565()) {
						class159.method913(this.field149.method1567(), (Throwable)null);
						class261.method1366(65);
						this.field149 = null;
						return;
					}

					var23 = this.field149.method1566();
					if (var23.method2124() != 200) {
						class159.method913("Response code: " + var23.method2124() + "Response body: " + var23.method2126(), (Throwable)null);
						class261.method1366(65);
						this.field149 = null;
						return;
					}

					List var26 = (List)var23.method2125().get("Content-Type");
					if (var26 != null && var26.contains(class329.field2630.method1805())) {
						try {
							JSONObject var6 = new JSONObject(var23.method2126());
							this.field69 = var6.getString("token");
						} catch (JSONException var16) {
							class159.method913((String)null, var16);
							class261.method1366(65);
							this.field149 = null;
							return;
						}
					} else {
						this.field69 = var23.method2126();
					}

					this.field149 = null;
				}

				field42 = 0;
				method246(1);
			}

			if (field63 == 1) {
				if (class26.field426 == null) {
					class26.field426 = class346.field2715.method2497(class17.field364, class127.field1165);
				}

				if (class26.field426.field3145 == 2) {
					throw new IOException();
				}

				if (class26.field426.field3145 == 1) {
					Socket var27 = (Socket)class26.field426.field3146;
					class177 var25 = new class177(var27, 40000, 5000);
					var2 = var25;
					field92.method1822(var25);
					class26.field426 = null;
					method246(2);
				}
			}

			class121 var29;
			if (field63 == 2) {
				field92.method1826();
				var29 = class220.method1205((byte)-1);
				var29.field1136 = null;
				var29.field1137 = 0;
				var29.field1141 = new class259(5000);
				var29.field1141.method1481(class32.field481.field479);
				field92.method1821(var29);
				field92.method1820();
				var3.field2254 = 0;
				method246(3);
			}

			int var28;
			if (field63 == 3) {
				if (class115.field1108 != null) {
					class115.field1108.method2231();
				}

				if (((class112)var2).method617(1)) {
					var28 = ((class112)var2).method621();
					if (null != class115.field1108) {
						class115.field1108.method2231();
					}

					if (var28 != 0) {
						class261.method1366(var28);
						return;
					}

					var3.field2254 = 0;
					method246(4);
				}
			}

			if (field63 == 4) {
				if (var3.field2254 < 8) {
					var28 = ((class112)var2).method619();
					if (var28 > 8 - var3.field2254) {
						var28 = 8 - var3.field2254;
					}

					if (var28 > 0) {
						((class112)var2).method618(var3.field2252, var3.field2254, var28);
						var3.field2254 += var28;
					}
				}

				if (var3.field2254 == 8) {
					var3.field2254 = 0;
					class157.field1496 = var3.method1497();
					method246(5);
				}
			}

			if (field63 == 5) {
				field92.field2666.field2254 = 0;
				field92.method1826();
				class259 var34 = new class259(500);
				int[] var30 = new int[]{class18.field375.nextInt(), class18.field375.nextInt(), class18.field375.nextInt(), class18.field375.nextInt()};
				var34.field2254 = 0;
				var34.method1481(1);
				var34.method1547(var30[0]);
				var34.method1547(var30[1]);
				var34.method1547(var30[2]);
				var34.method1547(var30[3]);
				var34.method1518(class157.field1496);
				if (field111 == 40) {
					var34.method1547(class451.field3395[0]);
					var34.method1547(class451.field3395[1]);
					var34.method1547(class451.field3395[2]);
					var34.method1547(class451.field3395[3]);
				} else {
					if (field111 == 50) {
						var34.method1481(class365.field2836.method2222());
						var34.method1547(class478.field3816);
					} else {
						var34.method1481(field277.method2222());
						switch(field277.field2839) {
						case 0:
							var34.method1547(class281.field2262.method1768(class162.field1544));
						case 1:
						default:
							break;
						case 2:
						case 4:
							var34.method1533(class473.field3808);
							++var34.field2254;
							break;
						case 3:
							var34.field2254 += 4;
						}
					}

					if (field72.method1921()) {
						var34.method1481(class347.field2747.method2222());
						var34.method1484(this.field69);
					} else {
						var34.method1481(class347.field2748.method2222());
						var34.method1484(class162.field1537);
					}
				}

				var34.method1525(class109.field1022, class109.field1023);
				class451.field3395 = var30;
				class121 var7 = class220.method1205((byte)-1);
				var7.field1136 = null;
				var7.field1137 = 0;
				var7.field1141 = new class259(5000);
				var7.field1141.field2254 = 0;
				if (field111 == 40) {
					var7.field1141.method1481(class32.field476.field479);
				} else {
					var7.field1141.method1481(class32.field475.field479);
				}

				var7.field1141.method1522(0);
				int var8 = var7.field1141.field2254;
				var7.field1141.method1547(216);
				var7.field1141.method1547(1);
				var7.field1141.method1481(field33);
				var7.field1141.method1481(field45);
				byte var9 = 0;
				var7.field1141.method1481(var9);
				var7.field1141.method1486(var34.field2252, 0, var34.field2254);
				int var10 = var7.field1141.field2254;
				var7.field1141.method1484(class162.field1544);
				var7.field1141.method1481((field258 ? 1 : 0) << 1 | (field31 ? 1 : 0));
				var7.field1141.method1522(class537.field4270);
				var7.field1141.method1522(class396.field3101);
				method201(var7.field1141);
				var7.field1141.method1484(class277.field2242);
				var7.field1141.method1547(class512.field4102);
				if (field209 > 213) {
					var7.field1141.method1481(0);
				}

				class280 var11 = new class280(class282.field2265.method2551());
				class282.field2265.method2550(var11);
				var7.field1141.method1486(var11.field2252, 0, var11.field2252.length);
				var7.field1141.method1481(field33);
				var7.field1141.method1547(0);
				var7.field1141.method1501(class464.field3761.field3293);
				var7.field1141.method1501(class411.field3163.field3293);
				var7.field1141.method1501(class376.field2892.field3293);
				var7.field1141.method1501(class242.field2008.field3293);
				var7.field1141.method1501(class299.field2409.field3293);
				var7.field1141.method1530(class470.field3803.field3293);
				var7.field1141.method1547(class38.field506.field3293);
				var7.field1141.method1529(class310.field2523.field3293);
				var7.field1141.method1547(class535.field4261.field3293);
				var7.field1141.method1501(class540.field4279.field3293);
				var7.field1141.method1501(0);
				var7.field1141.method1530(class524.field4197.field3293);
				var7.field1141.method1501(class439.field3327.field3293);
				var7.field1141.method1529(class237.field1983.field3293);
				var7.field1141.method1501(class345.field2708.field3293);
				var7.field1141.method1530(class514.field4108.field3293);
				var7.field1141.method1529(class323.field2609.field3293);
				var7.field1141.method1547(class185.field1690.field3293);
				var7.field1141.method1529(class212.field1898.field3293);
				var7.field1141.method1530(class429.field3253.field3293);
				var7.field1141.method1547(class454.field3714.field3293);
				var7.field1141.method1535(var30, var10, var7.field1141.field2254);
				var7.field1141.method1489(var7.field1141.field2254 - var8);
				field92.method1821(var7);
				field92.method1820();
				field92.field2665 = new class199(var30);
				int[] var12 = new int[4];

				for (int var13 = 0; var13 < 4; ++var13) {
					var12[var13] = var30[var13] + 50;
				}

				var3.method1352(var12);
				method246(6);
			}

			int var32;
			if (field63 == 6 && ((class112)var2).method619() > 0) {
				var28 = ((class112)var2).method621();
				if (var28 == 61) {
					var32 = ((class112)var2).method619();
					class515.field4125 = var32 == 1 && ((class112)var2).method621() == 1;
					method246(5);
				}

				if (var28 == 21 && field111 == 20) {
					method246(12);
				} else if (var28 == 2) {
					method246(14);
				} else if (var28 == 15 && field111 == 40) {
					field92.field2668 = -1;
					method246(19);
				} else if (var28 == 64) {
					method246(10);
				} else if (var28 == 23 && field93 < 1) {
					++field93;
					method246(0);
				} else if (var28 == 29) {
					method246(17);
				} else {
					if (var28 != 69) {
						class261.method1366(var28);
						return;
					}

					method246(7);
				}
			}

			if (field63 == 7 && ((class112)var2).method619() >= 2) {
				((class112)var2).method618(var3.field2252, 0, 2);
				var3.field2254 = 0;
				class304.field2455 = var3.method1541();
				method246(8);
			}

			if (field63 == 8 && ((class112)var2).method619() >= class304.field2455) {
				var3.field2254 = 0;
				((class112)var2).method618(var3.field2252, var3.field2254, class304.field2455);
				class60 var38 = class60.method485()[var3.method1492()];

				try {
					switch(var38.field734) {
					case 0:
						class71 var35 = new class71();
						this.field84 = new class463(var3, var35);
						method246(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var15) {
					class261.method1366(22);
					return;
				}
			}

			if (field63 == 9 && this.field84.method2400()) {
				this.field114 = this.field84.method2399();
				this.field84.method2397();
				this.field84 = null;
				if (this.field114 == null) {
					class261.method1366(22);
					return;
				}

				field92.method1826();
				var29 = class220.method1205((byte)-1);
				var29.field1136 = null;
				var29.field1137 = 0;
				var29.field1141 = new class259(5000);
				var29.field1141.method1481(class32.field477.field479);
				var29.field1141.method1522(this.field114.field2254);
				var29.field1141.method1487(this.field114);
				field92.method1821(var29);
				field92.method1820();
				this.field114 = null;
				method246(6);
			}

			if (field63 == 10 && ((class112)var2).method619() > 0) {
				class171.field1588 = ((class112)var2).method621();
				method246(11);
			}

			if (field63 == 11 && ((class112)var2).method619() >= class171.field1588) {
				((class112)var2).method618(var3.field2252, 0, class171.field1588);
				var3.field2254 = 0;
				method246(6);
			}

			if (field63 == 12 && ((class112)var2).method619() > 0) {
				field165 = (((class112)var2).method621() + 3) * 60;
				method246(13);
			}

			if (field63 == 13) {
				field42 = 0;
				class162.method936(class453.field3440, class453.field3441, field165 / 60 + class453.field3620);
				if (--field165 <= 0) {
					method246(0);
				}

			} else {
				if (field63 == 14 && ((class112)var2).method619() >= 1) {
					class474.field3812 = ((class112)var2).method621();
					method246(15);
				}

				if (field63 == 15 && ((class112)var2).method619() >= class474.field3812) {
					boolean var40 = ((class112)var2).method621() == 1;
					((class112)var2).method618(var3.field2252, 0, 4);
					var3.field2254 = 0;
					boolean var39 = false;
					if (var40) {
						var32 = var3.method1354() << 24;
						var32 |= var3.method1354() << 16;
						var32 |= var3.method1354() << 8;
						var32 |= var3.method1354();
						class281.field2262.method1761(class162.field1544, var32);
					}

					if (field81) {
						class281.field2262.method1756(class162.field1544);
					} else {
						class281.field2262.method1756((String)null);
					}

					class318.method1774();
					field115 = ((class112)var2).method621();
					field323 = ((class112)var2).method621() == 1;
					field155 = ((class112)var2).method621();
					field155 <<= 8;
					field155 += ((class112)var2).method621();
					field156 = ((class112)var2).method621();
					((class112)var2).method618(var3.field2252, 0, 8);
					var3.field2254 = 0;
					this.field85 = var3.method1497();
					((class112)var2).method618(var3.field2252, 0, 8);
					var3.field2254 = 0;
					field157 = var3.method1497();
					if (field209 >= 214) {
						((class112)var2).method618(var3.field2252, 0, 8);
						var3.field2254 = 0;
						var3.method1497();
					}

					((class112)var2).method618(var3.field2252, 0, 1);
					var3.field2254 = 0;
					class52[] var31 = class52.method457();
					int var37 = var3.method1358();
					if (var37 < 0 || var37 >= var31.length) {
						throw new IOException(var37 + " " + var3.field2254);
					}

					field92.field2662 = var31[var37];
					field92.field2668 = field92.field2662.field711;
					((class112)var2).method618(var3.field2252, 0, 2);
					var3.field2254 = 0;
					field92.field2668 = var3.method1541();

					try {
						Client var41 = class51.field585;
						JSObject.getWindow(var41).call("zap", (Object[])null);
					} catch (Throwable var14) {
					}

					method246(16);
				}

				if (field63 != 16) {
					if (field63 == 17 && ((class112)var2).method619() >= 2) {
						var3.field2254 = 0;
						((class112)var2).method618(var3.field2252, 0, 2);
						var3.field2254 = 0;
						class189.field1715 = var3.method1541();
						method246(18);
					}

					if (field63 == 18 && ((class112)var2).method619() >= class189.field1715) {
						var3.field2254 = 0;
						((class112)var2).method618(var3.field2252, 0, class189.field1715);
						var3.field2254 = 0;
						String var45 = var3.method1500();
						String var43 = var3.method1500();
						String var36 = var3.method1500();
						class162.method936(var45, var43, var36);
						method248(10);
						if (field72.method1921()) {
							class162.method924(9);
						}
					}

					if (field63 == 19) {
						if (field92.field2668 == -1) {
							if (((class112)var2).method619() < 2) {
								return;
							}

							((class112)var2).method618(var3.field2252, 0, 2);
							var3.field2254 = 0;
							field92.field2668 = var3.method1541();
						}

						if (((class112)var2).method619() >= field92.field2668) {
							((class112)var2).method618(var3.field2252, 0, field92.field2668);
							var3.field2254 = 0;
							var28 = field92.field2668;
							field95.method2032();
							method170();
							class183.method1031(var3);
							if (var3.field2254 != var28) {
								throw new RuntimeException();
							}
						}
					} else {
						++field42;
						if (field42 > 2000) {
							if (field93 < 1) {
								if (class213.field1904 == class127.field1165) {
									class127.field1165 = class91.field927;
								} else {
									class127.field1165 = class213.field1904;
								}

								++field93;
								method246(0);
							} else {
								class261.method1366(-3);
							}
						}
					}
				} else {
					if (((class112)var2).method619() >= field92.field2668) {
						var3.field2254 = 0;
						((class112)var2).method618(var3.field2252, 0, field92.field2668);
						field95.method2035();
						field90 = -1L;
						class306.field2472.field2652 = 0;
						class400.field3115 = true;
						field46 = true;
						field270 = -1L;
						class64.method491();
						field92.method1826();
						field92.field2666.field2254 = 0;
						field92.field2662 = null;
						field92.field2667 = null;
						field92.field2673 = null;
						field92.field2674 = null;
						field92.field2668 = 0;
						field92.field2672 = 0;
						field47 = 0;
						field80 = 0;
						field105 = 0;
						method226();
						class166.method946(0);
						class159.method916();
						field192 = 0;
						field119 = false;
						field282 = 0;
						field205 = 0;
						field120 = 0;
						class272.field2224 = null;
						field280 = 0;
						field273 = -1;
						field278 = 0;
						field201 = 0;
						field56 = class535.field4263;
						field57 = class535.field4263;
						field88 = 0;
						class183.field1652 = 0;

						for (var28 = 0; var28 < 2048; ++var28) {
							class183.field1660[var28] = null;
							class183.field1650[var28] = class386.field3029;
						}

						for (var28 = 0; var28 < 2048; ++var28) {
							field200[var28] = null;
						}

						for (var28 = 0; var28 < 65536; ++var28) {
							field87[var28] = null;
						}

						field166 = -1;
						field154.method623();
						field297.method623();

						for (var28 = 0; var28 < 4; ++var28) {
							for (var32 = 0; var32 < 104; ++var32) {
								for (int var33 = 0; var33 < 104; ++var33) {
									field167[var28][var32][var33] = null;
								}
							}
						}

						field168 = new class113();
						class331.field2633.method310();

						for (var28 = 0; var28 < class29.field467; ++var28) {
							class29 var42 = class135.method773(var28);
							if (null != var42) {
								class44.field561[var28] = 0;
								class44.field559[var28] = 0;
							}
						}

						class171.field1595.method1719();
						field62 = -1;
						if (field199 != -1) {
							class131.method758(field199);
						}

						for (class58 var44 = (class58)field48.method2130(); null != var44; var44 = (class58)field48.method2131()) {
							method165(var44, true);
						}

						field199 = -1;
						field48 = new class405(8);
						field204 = null;
						method226();
						field313.method1134((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

						for (var28 = 0; var28 < 8; ++var28) {
							field50[var28] = null;
							field164[var28] = false;
						}

						class23.method343();
						field40 = true;

						for (var28 = 0; var28 < 100; ++var28) {
							field37[var28] = true;
						}

						method150();
						class54.field716 = null;
						class183.field1662 = null;
						Arrays.fill(field271, (Object)null);
						class263.field2126 = null;
						Arrays.fill(field272, (Object)null);

						for (var28 = 0; var28 < 8; ++var28) {
							field305[var28] = new class454();
						}

						class332.field2640 = null;
						field38 = false;
						class183.method1031(var3);
						class411.field3162 = -1;
						method233(false, var3);
						field92.field2662 = null;
					}

				}
			}
		} catch (IOException var22) {
			if (field93 < 1) {
				if (class213.field1904 == class127.field1165) {
					class127.field1165 = class91.field927;
				} else {
					class127.field1165 = class213.field1904;
				}

				++field93;
				method246(0);
			} else {
				class261.method1366(-2);
			}
		}
	}

	@ObfInfo(name = "hv", desc = "(I)V", opaqueValue = "1251956548")
	final void method113() {
		if (field47 > 1) {
			--field47;
		}

		if (field80 > 0) {
			--field80;
		}

		if (field94) {
			field94 = false;
			method214();
		} else {
			if (!field140) {
				method253();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method98(field92); ++var2) {
			}

			if (field111 == 30) {
				while (true) {
					class54 var3 = (class54)class64.field755.method2423();
					boolean var17;
					if (null == var3) {
						var17 = false;
					} else {
						var17 = true;
					}

					int var4;
					class121 var18;
					if (!var17) {
						class121 var19;
						int var20;
						if (field95.field2936) {
							var19 = class121.method689(class480.field3839, field92.field2665);
							var19.field1141.method1481(0);
							var20 = var19.field1141.field2254;
							field95.method2037(var19.field1141);
							var19.field1141.method1490(var19.field1141.field2254 - var20);
							field92.method1821(var19);
							field95.method2036();
						}

						int var5;
						int var6;
						synchronized(class306.field2472.field2651) {
							if (!field67) {
								class306.field2472.field2652 = 0;
							} else if (class166.field1574 != 0 || class306.field2472.field2652 >= 40) {
								var18 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								int var7 = 0;

								int var8;
								for (var8 = 0; var8 < class306.field2472.field2652 && (null == var18 || var18.field1141.field2254 - var4 < 246); ++var8) {
									var5 = var8;
									int var9 = class306.field2472.field2654[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									int var10 = class306.field2472.field2653[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (var10 != field43 || field44 != var9) {
										if (null == var18) {
											var18 = class121.method689(class480.field3899, field92.field2665);
											var18.field1141.method1481(0);
											var4 = var18.field1141.field2254;
											class259 var10000 = var18.field1141;
											var10000.field2254 += 2;
											var6 = 0;
											var7 = 0;
										}

										int var11;
										int var12;
										int var13;
										if (field170 != -1L) {
											var11 = var10 - field43;
											var12 = var9 - field44;
											var13 = (int)((class306.field2472.field2655[var8] - field170) / 20L);
											var6 = (int)((long)var6 + (class306.field2472.field2655[var8] - field170) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field43 = var10;
										field44 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var18.field1141.method1522((var13 << 12) + (var11 << 6) + var12);
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var18.field1141.method1481(var13 + 128);
											var18.field1141.method1522(var12 + (var11 << 8));
										} else if (var13 < 32) {
											var18.field1141.method1481(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var18.field1141.method1547(var10 | var9 << 16);
											} else {
												var18.field1141.method1547(Integer.MIN_VALUE);
											}
										} else {
											var18.field1141.method1522(57344 + (var13 & 8191));
											if (var10 != -1 && var9 != -1) {
												var18.field1141.method1547(var10 | var9 << 16);
											} else {
												var18.field1141.method1547(Integer.MIN_VALUE);
											}
										}

										++var7;
										field170 = class306.field2472.field2655[var8];
									}
								}

								if (null != var18) {
									var18.field1141.method1490(var18.field1141.field2254 - var4);
									var8 = var18.field1141.field2254;
									var18.field1141.field2254 = var4;
									var18.field1141.method1481(var6 / var7);
									var18.field1141.method1481(var6 % var7);
									var18.field1141.field2254 = var8;
									field92.method1821(var18);
								}

								if (var5 >= class306.field2472.field2652) {
									class306.field2472.field2652 = 0;
								} else {
									class334 var41 = class306.field2472;
									var41.field2652 -= var5;
									System.arraycopy(class306.field2472.field2653, var5, class306.field2472.field2653, 0, class306.field2472.field2652);
									System.arraycopy(class306.field2472.field2654, var5, class306.field2472.field2654, 0, class306.field2472.field2652);
									System.arraycopy(class306.field2472.field2655, var5, class306.field2472.field2655, 0, class306.field2472.field2652);
								}
							}
						}

						class121 var31;
						if (class166.field1574 == 1 || !class146.field1455 && class166.field1574 == 4 || class166.field1574 == 2) {
							long var21 = class166.field1564 - field90;
							if (var21 > 32767L) {
								var21 = 32767L;
							}

							field90 = class166.field1564;
							var4 = class166.field1576;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class396.field3101) {
								var4 = class396.field3101;
							}

							var5 = class166.field1575;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class537.field4270) {
								var5 = class537.field4270;
							}

							var6 = (int)var21;
							var31 = class121.method689(class480.field3865, field92.field2665);
							var31.field1141.method1522((class166.field1574 == 2 ? 1 : 0) + (var6 << 1));
							var31.field1141.method1522(var5);
							var31.field1141.method1522(var4);
							field92.method1821(var31);
						}

						if (field240 != 0) {
							var19 = class121.method689(class480.field3913, field92.field2665);
							var19.field1141.method1522(field240);
							field92.method1821(var19);
						}

						if (field175.field2591 > 0) {
							var19 = class121.method689(class480.field3827, field92.field2665);
							var19.field1141.method1522(0);
							var20 = var19.field1141.field2254;
							long var22 = class43.method443();

							for (var6 = 0; var6 < field175.field2591; ++var6) {
								long var34 = var22 - field270;
								if (var34 > 16777215L) {
									var34 = 16777215L;
								}

								field270 = var22;
								var19.field1141.method1554(field175.field2590[var6]);
								var19.field1141.method1524((int)var34);
							}

							var19.field1141.method1489(var19.field1141.field2254 - var20);
							field92.method1821(var19);
						}

						if (field129 > 0) {
							--field129;
						}

						if (field175.method1783(96) || field175.method1783(97) || field175.method1783(98) || field175.method1783(99)) {
							field130 = true;
						}

						if (field130 && field129 <= 0) {
							field129 = 20;
							field130 = false;
							var19 = class121.method689(class480.field3850, field92.field2665);
							var19.field1141.method1522(field205);
							var19.field1141.method1517(field66);
							field92.method1821(var19);
						}

						if (class400.field3115 && !field46) {
							field46 = true;
							var19 = class121.method689(class480.field3879, field92.field2665);
							var19.field1141.method1481(1);
							field92.method1821(var19);
						}

						if (!class400.field3115 && field46) {
							field46 = false;
							var19 = class121.method689(class480.field3879, field92.field2665);
							var19.field1141.method1481(0);
							field92.method1821(var19);
						}

						if (class34.field483 != null) {
							class34.field483.method1272();
						}

						if (class460.field3735) {
							if (null != class54.field716) {
								class54.field716.method906();
							}

							for (var2 = 0; var2 < class183.field1652; ++var2) {
								class439 var23 = field200[class183.field1653[var2]];
								var23.method2302();
							}

							class460.field3735 = false;
						}

						method265();
						method197();
						if (field111 != 30) {
							return;
						}

						method276();
						class34.method419();
						++field92.field2672;
						if (field92.field2672 > 750) {
							method214();
							return;
						}

						var2 = class183.field1652;
						int[] var24 = class183.field1653;

						for (var4 = 0; var4 < var2; ++var4) {
							class439 var25 = field200[var24[var4]];
							if (null != var25) {
								method243(var25, 1);
							}
						}

						for (var2 = 0; var2 < field88; ++var2) {
							var20 = field26[var2];
							class412 var26 = field87[var20];
							if (null != var26) {
								method243(var26, var26.field3178.field3057);
							}
						}

						method222();
						++field106;
						if (field264 != 0) {
							field206 += 20;
							if (field206 >= 400) {
								field264 = 0;
							}
						}

						class131 var32 = class220.field1934;
						class131 var27 = class106.field1017;
						class220.field1934 = null;
						class106.field1017 = null;
						field215 = null;
						field263 = false;
						field216 = false;
						field267 = 0;

						while (field175.method1784() && field267 < 128) {
							if (field115 >= 2 && field175.method1783(82) && field175.field2601 == 66) {
								StringBuilder var28 = new StringBuilder();

								class212 var38;
								for (Iterator var33 = class159.field1504.iterator(); var33.hasNext(); var28.append(var38.field1897).append('\n')) {
									var38 = (class212)var33.next();
									if (null != var38.field1892 && !var38.field1892.isEmpty()) {
										var28.append(var38.field1892).append(':');
									}
								}

								String var29 = var28.toString();
								class51.field585.method1886(var29);
							} else if (field120 != 1 || field175.field2588 <= 0) {
								field269[field267] = field175.field2601;
								field268[field267] = field175.field2588;
								++field267;
							}
						}

						boolean var30 = field115 >= 2;
						if (var30 && field175.method1783(82) && field175.method1783(81) && field240 != 0) {
							var5 = class126.field1164.field3319 - field240;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (var5 != class126.field1164.field3319) {
								method164(class265.field2147 + class126.field1164.field1106[0], class508.field4092 + class126.field1164.field1103[0], var5, false);
							}

							field240 = 0;
						}

						if (class166.field1574 == 1) {
							field266.method1628();
						}

						if (field199 != -1) {
							method153(field199, 0, 0, class537.field4270, class396.field3101, 0, 0);
						}

						++field29;

						while (true) {
							class131 var35;
							class20 var36;
							class131 var39;
							do {
								var36 = (class20)field228.method625();
								if (var36 == null) {
									while (true) {
										do {
											var36 = (class20)field244.method625();
											if (null == var36) {
												while (true) {
													do {
														var36 = (class20)field242.method625();
														if (null == var36) {
															while (true) {
																class498 var40 = (class498)field281.method625();
																if (var40 == null) {
																	this.method99();
																	method237();
																	if (field211 != null) {
																		this.method104();
																	}

																	if (class194.method1082()) {
																		var5 = class194.field1763;
																		var6 = class194.field1764;
																		var31 = class121.method689(class480.field3833, field92.field2665);
																		var31.field1141.method1481(5);
																		var31.field1141.method1517(var5 + class265.field2147);
																		var31.field1141.method1544(class508.field4092 + var6);
																		var31.field1141.method1528(field175.method1783(82) ? (field175.method1783(81) ? 2 : 1) : 0);
																		field92.method1821(var31);
																		class194.method1105();
																		field147 = class166.field1575;
																		field148 = class166.field1576;
																		field264 = 1;
																		field206 = 0;
																		field278 = var5;
																		field201 = var6;
																	}

																	if (var32 != class220.field1934) {
																		if (null != var32) {
																			method213(var32);
																		}

																		if (class220.field1934 != null) {
																			method213(class220.field1934);
																		}
																	}

																	if (class106.field1017 != var27 && field190 == field191) {
																		if (null != var27) {
																			method213(var27);
																		}

																		if (null != class106.field1017) {
																			method213(class106.field1017);
																		}
																	}

																	if (null != class106.field1017) {
																		if (field190 < field191) {
																			++field190;
																			if (field190 == field191) {
																				method213(class106.field1017);
																			}
																		}
																	} else if (field190 > 0) {
																		--field190;
																	}

																	method271();
																	if (field294) {
																		method178(class517.field4146, class171.field1589, class341.field2698);
																		class484.method2453(class110.field1024, class139.field1419);
																		if (class395.field3087 == class517.field4146 && class374.field2888 == class171.field1589 && class365.field2843 == class341.field2698 && class91.field926 == class110.field1024 && class181.field1636 == class139.field1419) {
																			field294 = false;
																			field288 = false;
																			field289 = false;
																			field290 = false;
																			class296.field2388 = 0;
																			class126.field1161 = 0;
																			class21.field397 = 0;
																			class117.field1121 = 0;
																			class185.field1689 = 0;
																			class166.field1578 = 0;
																			class507.field4087 = 0;
																			class183.field1648 = 0;
																			class117.field1119 = 0;
																			class29.field471 = 0;
																			field292 = null;
																			field109 = null;
																			field83 = null;
																		}
																	} else if (field288) {
																		method187();
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		int var10002 = field245[var5]++;
																	}

																	class171.field1595.method1714();
																	var5 = class166.method947();
																	var6 = class346.field2743.method957();
																	class121 var37;
																	if (var5 > 15000 && var6 > 15000) {
																		field80 = 250;
																		class166.method946(14500);
																		var37 = class121.method689(class480.field3851, field92.field2665);
																		field92.method1821(var37);
																	}

																	class331.field2633.method309();
																	method195();
																	++field92.field2671;
																	if (field92.field2671 > 50) {
																		var37 = class121.method689(class480.field3867, field92.field2665);
																		field92.method1821(var37);
																	}

																	try {
																		field92.method1820();
																	} catch (IOException var15) {
																		method214();
																	}

																	return;
																}

																method200(var40);
															}
														}

														var35 = var36.field377;
														if (var35.field1333 < 0) {
															break;
														}

														var39 = class131.method756(var35.field1231);
													} while(null == var39 || var39.field1346 == null || var35.field1333 >= var39.field1346.length || var35 != var39.field1346[var35.field1333]);

													class175.method1006(var36);
												}
											}

											var35 = var36.field377;
											if (var35.field1333 < 0) {
												break;
											}

											var39 = class131.method756(var35.field1231);
										} while(null == var39 || var39.field1346 == null || var35.field1333 >= var39.field1346.length || var35 != var39.field1346[var35.field1333]);

										class175.method1006(var36);
									}
								}

								var35 = var36.field377;
								if (var35.field1333 < 0) {
									break;
								}

								var39 = class131.method756(var35.field1231);
							} while(null == var39 || null == var39.field1346 || var35.field1333 >= var39.field1346.length || var35 != var39.field1346[var35.field1333]);

							class175.method1006(var36);
						}
					}

					var18 = class121.method689(class480.field3831, field92.field2665);
					var18.field1141.method1481(0);
					var4 = var18.field1141.field2254;
					class64.method490(var18.field1141);
					var18.field1141.method1490(var18.field1141.field2254 - var4);
					field92.method1821(var18);
				}
			}
		}
	}

	@ObfInfo(name = "iw", desc = "(IIS)V", opaqueValue = "127")
	public void method702(int var1, int var2) {
		if (null != field92 && null != field92.field2665) {
			if (var1 > -1 && class281.field2262.method1746() > 0 && !field299) {
				class121 var4 = class121.method689(class480.field3920, field92.field2665);
				var4.field1141.method1547(var1);
				field92.method1821(var4);
			}

		}
	}

	@ObfInfo(name = "ar", desc = "(B)V")
	protected final void method1892() {
		field257 = class43.method443() + 500L;
		this.method95();
		if (field199 != -1) {
			this.method102(true);
		}

	}

	@ObfInfo(name = "jk", desc = "(I)V", opaqueValue = "1226462949")
	void method95() {
		int var2 = class537.field4270;
		int var3 = class396.field3101;
		if (super.field2728 < var2) {
			var2 = super.field2728;
		}

		if (super.field2734 < var3) {
			var3 = super.field2734;
		}

		if (class281.field2262 != null) {
			try {
				class530.method2576(class51.field585, "resize", new Object[]{method212()});
			} catch (Throwable var5) {
			}
		}

	}

	@ObfInfo(name = "jv", desc = "(B)V", opaqueValue = "1")
	final void method96() {
		if (field199 != -1) {
			method245(field199);
		}

		int var2;
		for (var2 = 0; var2 < field198; ++var2) {
			if (field37[var2]) {
				field250[var2] = true;
			}

			field251[var2] = field37[var2];
			field37[var2] = false;
		}

		field248 = field330;
		field188 = -1;
		field189 = -1;
		if (field199 != -1) {
			field198 = 0;
			method139(field199, 0, 0, class537.field4270, class396.field3101, 0, 0, -1);
		}

		class83.method536();
		if (field316) {
			if (field264 == 1) {
				class136.field1382[field206 / 100].method877(field147 - 8, field148 - 8);
			}

			if (field264 == 2) {
				class136.field1382[4 + field206 / 100].method877(field147 - 8, field148 - 8);
			}
		}

		int var3;
		int var4;
		if (!field140) {
			if (field188 != -1) {
				var2 = field188;
				var3 = field189;
				if ((field176 >= 2 || field192 != 0 || field119) && field187) {
					var4 = field176 - 1;
					String var6;
					if (field192 == 1 && field176 < 2) {
						var6 = class453.field3561 + class453.field3445 + field193 + " " + class479.field3824;
					} else if (field119 && field176 < 2) {
						var6 = field210 + class453.field3445 + field221 + " " + class479.field3824;
					} else {
						var6 = method199(var4);
					}

					if (field176 > 2) {
						var6 = var6 + class479.method2443(16777215) + " " + '/' + " " + (field176 - 2) + class453.field3428;
					}

					class319.field2584.method1672(var6, var2 + 4, var3 + 15, 16777215, 0, field330 / 1000);
				}
			}
		} else {
			var2 = class304.field2456;
			var3 = class59.field731;
			var4 = class302.field2441;
			int var5 = class494.field4013;
			int var14 = 6116423;
			class83.method542(var2, var3, var4, var5, var14);
			class83.method542(var2 + 1, var3 + 1, var4 - 2, 16, 0);
			class83.method545(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
			class319.field2584.method1674(class453.field3564, var2 + 3, var3 + 14, var14, -1);
			int var7 = class166.field1580;
			int var8 = class166.field1563;

			int var9;
			int var10;
			int var11;
			for (var9 = 0; var9 < field176; ++var9) {
				var10 = 15 * (field176 - 1 - var9) + var3 + 31;
				var11 = 16777215;
				if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}

				class319.field2584.method1674(method199(var9), var2 + 3, var10, var11, 0);
			}

			var9 = class304.field2456;
			var10 = class59.field731;
			var11 = class302.field2441;
			int var12 = class494.field4013;

			for (int var13 = 0; var13 < field198; ++var13) {
				if (field252[var13] + field254[var13] > var9 && field252[var13] < var9 + var11 && field253[var13] + field255[var13] > var10 && field253[var13] < var10 + var12) {
					field250[var13] = true;
				}
			}
		}

		if (field256 == 3) {
			for (var2 = 0; var2 < field198; ++var2) {
				if (field251[var2]) {
					class83.method541(field252[var2], field253[var2], field254[var2], field255[var2], 16711935, 128);
				} else if (field250[var2]) {
					class83.method541(field252[var2], field253[var2], field254[var2], field255[var2], 16711680, 128);
				}
			}
		}

		class470.method2413(class401.field3120, class126.field1164.field1061, class126.field1164.field1032, field106);
		field106 = 0;
	}

	@ObfInfo(name = "ks", desc = "(Ler;II)Z", opaqueValue = "1476147863")
	boolean method117(class336 var1, int var2) {
		if (var1.field2668 == 0) {
			class54.field716 = null;
		} else {
			if (null == class54.field716) {
				class54.field716 = new class248(class67.field769, class51.field585);
			}

			class54.field716.method1335(var1.field2666, var2);
		}

		field234 = field29;
		class460.field3735 = true;
		var1.field2662 = null;
		return true;
	}

	@ObfInfo(name = "kn", desc = "(Ler;I)Z")
	boolean method97(class336 var1) {
		if (class54.field716 != null) {
			class54.field716.method1336(var1.field2666, (byte)-59);
		}

		field234 = field29;
		class460.field3735 = true;
		var1.field2662 = null;
		return true;
	}

	@ObfInfo(name = "kd", desc = "(Ler;I)Z", opaqueValue = "151691558")
	final boolean method98(class336 var1) {
		class112 var3 = var1.method1824();
		class259 var4 = var1.field2666;
		if (null == var3) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int var26;
				if (null == var1.field2662) {
					if (var1.field2669) {
						if (!var3.method617(1)) {
							return false;
						}

						var3.method618(var1.field2666.field2252, 0, 1);
						var1.field2672 = 0;
						var1.field2669 = false;
					}

					var4.field2254 = 0;
					if (var4.method1356()) {
						if (!var3.method617(1)) {
							return false;
						}

						var3.method618(var1.field2666.field2252, 1, 1);
						var1.field2672 = 0;
					}

					var1.field2669 = true;
					class52[] var5 = class52.method457();
					var26 = var4.method1358();
					if (var26 < 0 || var26 >= var5.length) {
						throw new IOException(var26 + " " + var4.field2254);
					}

					var1.field2662 = var5[var26];
					var1.field2668 = var1.field2662.field711;
				}

				if (var1.field2668 == -1) {
					if (!var3.method617(1)) {
						return false;
					}

					var1.method1824().method618(var4.field2252, 0, 1);
					var1.field2668 = var4.field2252[0] & 255;
				}

				if (var1.field2668 == -2) {
					if (!var3.method617(2)) {
						return false;
					}

					var1.method1824().method618(var4.field2252, 0, 2);
					var4.field2254 = 0;
					var1.field2668 = var4.method1541();
				}

				if (!var3.method617(var1.field2668)) {
					return false;
				}

				var4.field2254 = 0;
				var3.method618(var4.field2252, 0, var1.field2668);
				var1.field2672 = 0;
				field95.method2033();
				var1.field2674 = var1.field2673;
				var1.field2673 = var1.field2667;
				var1.field2667 = var1.field2662;
				if (class52.field648 == var1.field2662) {
					class532.field4247 = class239.method1258(var4.method1492());
					var1.field2662 = null;
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
				if (class52.field671 == var1.field2662) {
					var7 = var4.method1549();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var26;
					var10 = var4.method1514();
					var11 = var10 >> 2;
					var37 = var10 & 3;
					var47 = field212[var11];
					var14 = var4.method1541();
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var47 == 0) {
							class266 var82 = class27.field448.method1071(class401.field3120, var8, var9);
							if (null != var82) {
								var16 = class487.method2465(var82.field2154);
								if (var11 == 2) {
									var82.field2155 = new class380(var16, 2, var37 + 4, class401.field3120, var8, var9, var14, false, var82.field2155);
									var82.field2153 = new class380(var16, 2, var37 + 1 & 3, class401.field3120, var8, var9, var14, false, var82.field2153);
								} else {
									var82.field2155 = new class380(var16, var11, var37, class401.field3120, var8, var9, var14, false, var82.field2155);
								}
							}
						} else if (var47 == 1) {
							class104 var81 = class27.field448.method1072(class401.field3120, var8, var9);
							if (null != var81) {
								var16 = class487.method2465(var81.field1010);
								if (var11 != 4 && var11 != 5) {
									if (var11 == 6) {
										var81.field1007 = new class380(var16, 4, var37 + 4, class401.field3120, var8, var9, var14, false, var81.field1007);
									} else if (var11 == 7) {
										var81.field1007 = new class380(var16, 4, (var37 + 2 & 3) + 4, class401.field3120, var8, var9, var14, false, var81.field1007);
									} else if (var11 == 8) {
										var81.field1007 = new class380(var16, 4, var37 + 4, class401.field3120, var8, var9, var14, false, var81.field1007);
										var81.field1008 = new class380(var16, 4, 4 + (var37 + 2 & 3), class401.field3120, var8, var9, var14, false, var81.field1008);
									}
								} else {
									var81.field1007 = new class380(var16, 4, var37, class401.field3120, var8, var9, var14, false, var81.field1007);
								}
							}
						} else if (var47 == 2) {
							class241 var78 = class27.field448.method1109(class401.field3120, var8, var9);
							if (var11 == 11) {
								var11 = 10;
							}

							if (null != var78) {
								var78.field2000 = new class380(class487.method2465(var78.field2005), var11, var37, class401.field3120, var8, var9, var14, false, var78.field2000);
							}
						} else if (var47 == 3) {
							class355 var80 = class27.field448.method1096(class401.field3120, var8, var9);
							if (null != var80) {
								var80.field2804 = new class380(class487.method2465(var80.field2803), 22, var37, class401.field3120, var8, var9, var14, false, var80.field2804);
							}
						}
					}

					var1.field2662 = null;
					return true;
				}

				class131 var86;
				if (var1.field2662 == class52.field645) {
					var24 = var4.method1496();
					var86 = class131.method756(var24);
					var86.field1256 = 3;
					var86.field1257 = class126.field1164.field3299.method1132();
					method213(var86);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field707) {
					field294 = false;
					field288 = false;
					field289 = false;
					field290 = false;
					class296.field2388 = 0;
					class126.field1161 = 0;
					class21.field397 = 0;
					field291 = false;
					class117.field1121 = 0;
					class185.field1689 = 0;
					class166.field1578 = 0;
					class507.field4087 = 0;
					class183.field1648 = 0;
					class117.field1119 = 0;
					class29.field471 = 0;
					field292 = null;
					field109 = null;
					field83 = null;

					for (var24 = 0; var24 < 5; ++var24) {
						field295[var24] = false;
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field639 == var1.field2662) {
					class365.field2842 = null;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field672) {
					var24 = var4.method1496();
					var26 = var4.method1496();
					var7 = class346.method1919();
					class121 var84 = class121.method689(class480.field3909, field92.field2665);
					var84.field1141.method1481(class346.field2720);
					var84.field1141.method1501(var24);
					var84.field1141.method1530(var26);
					var84.field1141.method1512(var7);
					field92.method1821(var84);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field608) {
					method179();
					field314 = var4.method1494();
					field79 = field29;
					var1.field2662 = null;
					return true;
				}

				if (class52.field658 == var1.field2662) {
					class516.method2521(class63.field743);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field594) {
					var24 = var4.method1519();
					class23.method338(var24);
					field226[++field227 - 1 & 31] = var24 & 32767;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field700) {
					class516.method2521(class63.field747);
					var1.field2662 = null;
					return true;
				}

				boolean var12;
				byte var23;
				long var33;
				long var42;
				long var50;
				String var54;
				int var75;
				if (class52.field688 == var1.field2662) {
					var23 = var4.method1493();
					var50 = (long)var4.method1541();
					var33 = (long)var4.method1548();
					var42 = (var50 << 32) + var33;
					var12 = false;
					class143 var73 = var23 >= 0 ? field272[var23] : class263.field2126;
					if (null == var73) {
						var12 = true;
					} else {
						for (var14 = 0; var14 < 100; ++var14) {
							if (field173[var14] == var42) {
								var12 = true;
								break;
							}
						}
					}

					if (!var12) {
						field173[field35] = var42;
						field35 = (1 + field35) % 100;
						var54 = class217.method1202(var4);
						var75 = var23 >= 0 ? 43 : 46;
						class159.method921(var75, "", var54, var73.field1437);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field618) {
					class183.method1032(var4, var1.field2668);
					class438.method2296();
					var1.field2662 = null;
					return true;
				}

				if (class52.field631 == var1.field2662) {
					field288 = true;
					field294 = false;
					field290 = true;
					class296.field2388 = var4.method1492();
					class126.field1161 = var4.method1492();
					class21.field397 = var4.method1541();
					var24 = var4.method1541();
					var26 = var4.method1492();
					var7 = 64 + class296.field2388 * 128;
					var8 = 64 + class126.field1161 * 128;
					var9 = method131(var7, var8, class401.field3120) - class21.field397;
					var10 = var7 - class395.field3087;
					var11 = var9 - class374.field2888;
					var37 = var8 - class365.field2843;
					double var70 = Math.sqrt((double)(var37 * var37 + var10 * var10));
					var75 = method166((int)(Math.atan2((double)var11, var70) * 325.9490051269531D) & 2047);
					var16 = method125((int)(Math.atan2((double)var10, (double)var37) * -325.9490051269531D) & 2047);
					field109 = new class101(class91.field926, var75, var24, var26);
					field83 = new class101(class181.field1636, var16, var24, var26);
					var1.field2662 = null;
					return true;
				}

				long var53;
				class58 var79;
				if (var1.field2662 == class52.field680) {
					var24 = var1.field2668 + var4.field2254;
					var26 = var4.method1541();
					if (var26 == 65535) {
						var26 = -1;
					}

					var7 = var4.method1541();
					if (field199 != var26) {
						field199 = var26;
						this.method102(false);
						method122(field199);
						class175.method999(field199);

						for (var8 = 0; var8 < 100; ++var8) {
							field37[var8] = true;
						}
					}

					class58 var71;
					for (; var7-- > 0; var71.field726 = true) {
						var8 = var4.method1496();
						var9 = var4.method1541();
						var10 = var4.method1492();
						var71 = (class58)field48.method2129((long)var8);
						if (null != var71 && var9 != var71.field727) {
							method165(var71, true);
							var71 = null;
						}

						if (var71 == null) {
							var71 = method250(var8, var9, var10);
						}
					}

					for (var79 = (class58)field48.method2130(); var79 != null; var79 = (class58)field48.method2131()) {
						if (var79.field726) {
							var79.field726 = false;
						} else {
							method165(var79, true);
						}
					}

					field246 = new class405(512);

					while (var4.field2254 < var24) {
						var8 = var4.method1496();
						var9 = var4.method1541();
						var10 = var4.method1541();
						var11 = var4.method1496();

						for (var37 = var9; var37 <= var10; ++var37) {
							var53 = ((long)var8 << 32) + (long)var37;
							field246.method2132(new class149(var11), var53);
						}
					}

					var1.field2662 = null;
					return true;
				}

				class131 var66;
				if (var1.field2662 == class52.field697) {
					var24 = var4.method1496();
					var26 = var4.method1537();
					class58 var89 = (class58)field48.method2129((long)var26);
					var79 = (class58)field48.method2129((long)var24);
					if (null != var79) {
						method165(var79, var89 == null || var79.field727 != var89.field727);
					}

					if (null != var89) {
						var89.method907();
						field48.method2132(var89, (long)var24);
					}

					var66 = class131.method756(var26);
					if (var66 != null) {
						method213(var66);
					}

					var66 = class131.method756(var24);
					if (var66 != null) {
						method213(var66);
						method152(class121.field1142[var66.field1214 >>> 16], var66, true);
					}

					if (field199 != -1) {
						method263(field199, 1);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field652) {
					class461.method2395();
					var23 = var4.method1493();
					if (var1.field2668 == 1) {
						if (var23 >= 0) {
							field271[var23] = null;
						} else {
							class183.field1662 = null;
						}

						var1.field2662 = null;
						return true;
					}

					if (var23 >= 0) {
						field271[var23] = new class291(var4);
					} else {
						class183.field1662 = new class291(var4);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field665) {
					var24 = var4.method1496();
					class58 var91 = (class58)field48.method2129((long)var24);
					if (null != var91) {
						method165(var91, true);
					}

					if (null != field204) {
						method213(field204);
						field204 = null;
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field687) {
					var10 = var4.method1541();
					var7 = var4.method1549();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = var26 + (var7 & 7);
					var11 = var4.method1513();
					var37 = var4.method1520();
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var8 = 64 + var8 * 128;
						var9 = var9 * 128 + 64;
						class18 var61 = new class18(var10, class401.field3120, var8, var9, method131(var8, var9, class401.field3120) - var11, var37, field330);
						field297.method631(var61);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field684 == var1.field2662) {
					field236 = field29;
					var23 = var4.method1493();
					if (var1.field2668 == 1) {
						if (var23 >= 0) {
							field272[var23] = null;
						} else {
							class263.field2126 = null;
						}

						var1.field2662 = null;
						return true;
					}

					if (var23 >= 0) {
						field272[var23] = new class143(var4);
					} else {
						class263.field2126 = new class143(var4);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field599) {
					class516.method2521(class63.field752);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field695) {
					class516.method2521(class63.field753);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field703) {
					var24 = var4.method1519();
					var26 = var4.method1514();
					if (var24 == 65535) {
						var24 = -1;
					}

					method282(class126.field1164, var24, var26);
					var1.field2662 = null;
					return true;
				}

				if (class52.field708 == var1.field2662) {
					method233(true, var1.field2666);
					var1.field2662 = null;
					return true;
				}

				if (class52.field628 == var1.field2662) {
					if (field199 != -1) {
						method263(field199, 0);
					}

					var1.field2662 = null;
					return true;
				}

				class131 var35;
				if (var1.field2662 == class52.field620) {
					var24 = var4.method1532();
					var26 = var4.method1521();
					var7 = var4.method1520();
					var35 = class131.method756(var24);
					var35.field1305 = (var26 << 16) + var7;
					var1.field2662 = null;
					return true;
				}

				if (class52.field677 == var1.field2662) {
					field280 = var4.method1492();
					var1.field2662 = null;
					return true;
				}

				int var17;
				String var68;
				if (class52.field689 == var1.field2662) {
					var23 = var4.method1493();
					var6 = var4.method1500();
					long var87 = (long)var4.method1541();
					long var69 = (long)var4.method1548();
					class314 var62 = (class314)class216.method1198(class314.method1733(), var4.method1492());
					long var51 = (var87 << 32) + var69;
					boolean var57 = false;
					class143 var76 = null;
					var76 = var23 >= 0 ? field272[var23] : class263.field2126;
					if (null == var76) {
						var57 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var62.field2545 && class331.field2633.method312(new class353(var6, class67.field769))) {
									var57 = true;
								}
								break;
							}

							if (field173[var16] == var51) {
								var57 = true;
								break;
							}

							++var16;
						}
					}

					if (!var57) {
						field173[field35] = var51;
						field35 = (1 + field35) % 100;
						var68 = class300.method1659(class217.method1202(var4));
						var17 = var23 >= 0 ? 41 : 44;
						if (var62.field2560 != -1) {
							class159.method921(var17, class90.method580(var62.field2560) + var6, var68, var76.field1437);
						} else {
							class159.method921(var17, var6, var68, var76.field1437);
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field670 == var1.field2662) {
					var4.field2254 += 28;
					if (var4.method1511()) {
						method137(var4, var4.field2254 - 28);
					}

					var1.field2662 = null;
					return true;
				}

				String var29;
				if (class52.field683 == var1.field2662) {
					var29 = var4.method1500();
					var26 = var4.method1513();
					var7 = var4.method1514();
					if (var7 >= 1 && var7 <= 8) {
						if (var29.equalsIgnoreCase(class453.field3707)) {
							var29 = null;
						}

						field50[var7 - 1] = var29;
						field164[var7 - 1] = var26 == 0;
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field636) {
					var24 = var4.method1541();
					if (var24 == 65535) {
						var24 = -1;
					}

					method238(var24);
					var1.field2662 = null;
					return true;
				}

				if (class52.field668 == var1.field2662) {
					var24 = var4.method1521();
					if (var24 == 65535) {
						var24 = -1;
					}

					var26 = var4.method1545();
					method151(var24, var26);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field591) {
					method280();
					var1.field2662 = null;
					return false;
				}

				if (var1.field2662 == class52.field682) {
					var24 = var4.method1531();
					var26 = var4.method1514();
					var7 = var4.method1521();
					var79 = (class58)field48.method2129((long)var24);
					if (var79 != null) {
						method165(var79, var7 != var79.field727);
					}

					method250(var24, var7, var26);
					var1.field2662 = null;
					return true;
				}

				class131 var30;
				boolean var58;
				if (class52.field660 == var1.field2662) {
					var58 = var4.method1552() == 1;
					var26 = var4.method1496();
					var30 = class131.method756(var26);
					if (var58 != var30.field1232) {
						var30.field1232 = var58;
						method213(var30);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field592) {
					var24 = var4.method1521();
					var26 = var4.method1541();
					var7 = var4.method1532();
					var8 = var4.method1541();
					var66 = class131.method756(var7);
					if (var8 != var66.field1264 || var66.field1282 != var24 || var26 != var66.field1267) {
						var66.field1264 = var8;
						var66.field1282 = var24;
						var66.field1267 = var26;
						method213(var66);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field593 == var1.field2662) {
					var24 = var4.method1520();
					var26 = var4.method1531();
					var30 = class131.method756(var26);
					if (var30.field1256 != 1 || var30.field1257 != var24) {
						var30.field1256 = 1;
						var30.field1257 = var24;
						method213(var30);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field588) {
					class516.method2521(class63.field749);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field633) {
					var9 = var4.method1520();
					var7 = var4.method1519();
					var8 = var4.method1519();
					var24 = var4.method1521();
					var26 = var4.method1521();
					if (var24 == 65535) {
						var24 = -1;
					}

					ArrayList var72 = new ArrayList();
					var72.add(var24);
					class249.method1341(var72, var26, var7, var8, var9);
					var1.field2662 = null;
					return true;
				}

				if (class52.field609 == var1.field2662) {
					class516.method2521(class63.field742);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field607) {
					class331.field2633.method308();
					field233 = field29;
					var1.field2662 = null;
					return true;
				}

				String var55;
				if (var1.field2662 == class52.field638) {
					byte[] var92 = new byte[var1.field2668];
					var4.method1357(var92, 0, var92.length);
					class280 var88 = new class280(var92);
					var55 = var88.method1500();
					class341.method1876(var55, true, false);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field667) {
					class516 var90 = new class516();
					var90.field4135 = var4.method1500();
					var90.field4132 = var4.method1541();
					var26 = var4.method1496();
					var90.field4128 = var26;
					if (var90.method2519()) {
						var90.field4139 = "beta";
					}

					method248(45);
					var3.method622();
					var3 = null;
					class515.method2516(var90);
					var1.field2662 = null;
					return false;
				}

				if (var1.field2662 == class52.field653) {
					field47 = var4.method1520() * 30;
					field79 = field29;
					var1.field2662 = null;
					return true;
				}

				if (class52.field595 == var1.field2662) {
					var24 = var4.method1541();
					if (var24 == 65535) {
						var24 = -1;
					}

					field199 = var24;
					this.method102(false);
					method122(var24);
					class175.method999(field199);

					for (var26 = 0; var26 < 100; ++var26) {
						field37[var26] = true;
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field694 == var1.field2662) {
					field288 = true;
					field294 = false;
					field289 = true;
					class183.field1648 = var4.method1492();
					class117.field1119 = var4.method1492();
					var24 = var4.method1541();
					var26 = var4.method1541();
					field291 = var4.method1499();
					var7 = var4.method1492();
					var8 = class183.field1648 * 128 + 64;
					var9 = 64 + class117.field1119 * 128;
					boolean var59 = false;
					boolean var56 = false;
					if (field291) {
						var10 = class374.field2888;
						var11 = method131(var8, var9, class401.field3120) - var24;
					} else {
						var10 = method131(class395.field3087, class365.field2843, class401.field3120) - class374.field2888;
						var11 = var24;
					}

					field292 = new class289(class395.field3087, class365.field2843, var10, var8, var9, var11, var26, var7);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field654) {
					method233(false, var1.field2666);
					var1.field2662 = null;
					return true;
				}

				if (class52.field693 == var1.field2662) {
					var24 = var4.method1537();
					var86 = class131.method756(var24);

					for (var7 = 0; var7 < var86.field1340.length; ++var7) {
						var86.field1340[var7] = -1;
						var86.field1340[var7] = 0;
					}

					method213(var86);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field661) {
					var24 = var4.method1519();
					var26 = var4.method1537();
					var30 = class131.method756(var26);
					if (var30 != null && var30.field1216 == 0) {
						if (var24 > var30.field1236 - var30.field1206) {
							var24 = var30.field1236 - var30.field1206;
						}

						if (var24 < 0) {
							var24 = 0;
						}

						if (var30.field1247 != var24) {
							var30.field1247 = var24;
							method213(var30);
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field681) {
					field261 = var4.method1492();
					field260 = var4.method1513();
					var1.field2662 = null;
					return true;
				}

				if (class52.field675 == var1.field2662) {
					field288 = true;
					field294 = false;
					field290 = false;
					class296.field2388 = var4.method1492();
					class126.field1161 = var4.method1492();
					class21.field397 = var4.method1541();
					class117.field1121 = var4.method1492();
					class185.field1689 = var4.method1492();
					if (class185.field1689 >= 100) {
						var24 = 64 + class296.field2388 * 128;
						var26 = 64 + class126.field1161 * 128;
						var7 = method131(var24, var26, class401.field3120) - class21.field397;
						var8 = var24 - class395.field3087;
						var9 = var7 - class374.field2888;
						var10 = var26 - class365.field2843;
						var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
						class91.field926 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
						class181.field1636 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
						if (class91.field926 < 128) {
							class91.field926 = 128;
						}

						if (class91.field926 > 383) {
							class91.field926 = 383;
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field637) {
					return this.method117(var1, 1);
				}

				if (var1.field2662 == class52.field646) {
					field105 = var4.method1492();
					if (field105 == 1) {
						field49 = var4.method1541();
					}

					if (field105 >= 2 && field105 <= 6) {
						if (field105 == 2) {
							field214 = 64;
							field247 = 64;
						}

						if (field105 == 3) {
							field214 = 0;
							field247 = 64;
						}

						if (field105 == 4) {
							field214 = 128;
							field247 = 64;
						}

						if (field105 == 5) {
							field214 = 64;
							field247 = 0;
						}

						if (field105 == 6) {
							field214 = 64;
							field247 = 128;
						}

						field105 = 2;
						field51 = var4.method1541();
						field194 = var4.method1541();
						field58 = var4.method1492();
					}

					if (field105 == 10) {
						field68 = var4.method1541();
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field604) {
					class461.method2395();
					var23 = var4.method1493();
					class220 var85 = new class220(var4);
					class291 var83;
					if (var23 >= 0) {
						var83 = field271[var23];
					} else {
						var83 = class183.field1662;
					}

					if (null == var83) {
						this.method107(var23);
						var1.field2662 = null;
						return true;
					}

					if (var85.field1935 > var83.field2317) {
						this.method107(var23);
						var1.field2662 = null;
						return true;
					}

					if (var85.field1935 < var83.field2317) {
						var1.field2662 = null;
						return true;
					}

					var85.method1203(var83);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field699) {
					class516.method2521(class63.field748);
					var1.field2662 = null;
					return true;
				}

				if (class52.field623 == var1.field2662) {
					var24 = var4.method1495();
					var26 = var4.method1496();
					var7 = var4.method1494();
					var35 = class131.method756(var26);
					if (var35.field1223 != var7 || var35.field1224 != var24 || var35.field1219 != 0 || var35.field1220 != 0) {
						var35.field1223 = var7;
						var35.field1224 = var24;
						var35.field1219 = 0;
						var35.field1220 = 0;
						method213(var35);
						this.method103(var35);
						if (var35.field1216 == 0) {
							method152(class121.field1142[var26 >> 16], var35, false);
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field698 == var1.field2662) {
					var24 = var4.method1532();
					var26 = var4.method1531();
					var30 = class131.method756(var26);
					class131.method752(var30, var24);
					method213(var30);
					var1.field2662 = null;
					return true;
				}

				if (class52.field664 == var1.field2662) {
					var24 = var4.method1541();
					var26 = var4.method1537();
					var30 = class131.method756(var26);
					if (var30.field1256 != 6 || var24 != var30.field1257) {
						var30.field1256 = 6;
						var30.field1257 = var24;
						method213(var30);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field590 == var1.field2662) {
					byte var52 = var4.method1507();
					var75 = var4.method1552() * 4;
					byte var48 = var4.method1507();
					var47 = var4.method1520();
					var37 = var4.method1538();
					var17 = var4.method1519();
					var14 = var4.method1513() * 4;
					var16 = var4.method1521();
					var7 = var4.method1549();
					var24 = var7 >> 16;
					var26 = var7 >> 8 & 255;
					var8 = var24 + (var7 >> 4 & 7);
					var9 = var26 + (var7 & 7);
					int var19 = var4.method1492();
					int var18 = var4.method1514();
					var10 = var52 + var8;
					var11 = var48 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var47 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = 64 + var9 * 128;
						var10 = var10 * 128 + 64;
						var11 = 64 + var11 * 128;
						class351 var20 = new class351(var47, class401.field3120, var8, var9, method131(var8, var9, class401.field3120) - var14, var16 + field330, field330 + var17, var18, var19, var37, var75);
						var20.method1929(var10, var11, method131(var10, var11, class401.field3120) - var75, var16 + field330);
						field154.method631(var20);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field673) {
					class365.field2842 = new class173(class33.field482);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field644) {
					class470.field3787 = var4.method1552();
					class157.field1495 = var4.method1514();
					var1.field2662 = null;
					return true;
				}

				if (class52.field706 == var1.field2662) {
					for (var24 = 0; var24 < field200.length; ++var24) {
						if (field200[var24] != null) {
							field200[var24].field1076 = -1;
						}
					}

					for (var24 = 0; var24 < field87.length; ++var24) {
						if (field87[var24] != null) {
							field87[var24].field1076 = -1;
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field632) {
					method227(false, var4);
					var1.field2662 = null;
					return true;
				}

				if (class52.field625 == var1.field2662) {
					class64.method488(var4, var1.field2668);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field600) {
					method227(true, var4);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field626) {
					var24 = var4.method1513();
					var26 = var4.method1513();
					var7 = var4.method1537();
					var35 = class131.method756(var7);
					class131.method755(var35, var26, var24);
					method213(var35);
					var1.field2662 = null;
					return true;
				}

				if (class52.field642 == var1.field2662) {
					var26 = var4.method1541();
					var24 = var4.method1519();
					class333.method1815(var24, var26);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field691) {
					var58 = var4.method1499();
					if (var58) {
						if (null == class272.field2224) {
							class272.field2224 = new class379();
						}
					} else {
						class272.field2224 = null;
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field662) {
					field288 = true;
					field294 = false;
					field290 = true;
					var24 = method125(var4.method1494() & 2027);
					var26 = method166(var4.method1494() & 2027);
					var7 = var4.method1541();
					var8 = var4.method1492();
					field109 = new class101(class91.field926, var26, var7, var8);
					field83 = new class101(class181.field1636, var24, var7, var8);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field624) {
					return this.method97(var1);
				}

				if (class52.field603 == var1.field2662) {
					class516.method2521(class63.field744);
					var1.field2662 = null;
					return true;
				}

				if (class52.field613 == var1.field2662) {
					var24 = var4.method1531();
					var26 = var4.method1541();
					if (var26 == 65535) {
						var26 = -1;
					}

					var7 = var4.method1532();
					var8 = var4.method1521();
					if (var8 == 65535) {
						var8 = -1;
					}

					for (var9 = var8; var9 <= var26; ++var9) {
						var42 = ((long)var7 << 32) + (long)var9;
						class155 var49 = field246.method2129(var42);
						if (var49 != null) {
							var49.method907();
						}

						field246.method2132(new class149(var24), var42);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field629 == var1.field2662) {
					var8 = var4.method1520();
					var26 = var4.method1521();
					if (var26 == 65535) {
						var26 = -1;
					}

					var9 = var4.method1521();
					var7 = var4.method1519();
					var10 = var4.method1519();
					var24 = var4.method1520();
					if (var24 == 65535) {
						var24 = -1;
					}

					ArrayList var44 = new ArrayList();
					var44.add(var24);
					var44.add(var26);
					class249.method1341(var44, var7, var8, var9, var10);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field634) {
					method179();
					var24 = var4.method1514();
					var26 = var4.method1513();
					var7 = var4.method1537();
					field322[var26] = var7;
					field171[var26] = var24;
					field319[var26] = 1;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= class79.field834[var8]) {
							field319[var26] = var8 + 2;
						}
					}

					field151[++field229 - 1 & 31] = var26;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field696) {
					var24 = var4.method1541();
					var26 = var4.method1492();
					var7 = var4.method1541();
					method135(var24, var26, var7);
					var1.field2662 = null;
					return true;
				}

				if (class52.field650 == var1.field2662) {
					var24 = var4.method1492();
					var26 = var4.method1532();
					var30 = class131.method756(var26);
					class131.method757(var30, class126.field1164.field3299.field1818, var24);
					method213(var30);
					var1.field2662 = null;
					return true;
				}

				if (class52.field619 == var1.field2662) {
					var24 = var4.method1532();
					var26 = var4.method1541();
					var30 = class131.method756(var24);
					if (var30.field1256 != 2 || var30.field1257 != var26) {
						var30.field1256 = 2;
						var30.field1257 = var26;
						method213(var30);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field589) {
					var24 = var4.method1492();
					class333.method1814(var24);
					var1.field2662 = null;
					return false;
				}

				if (var1.field2662 == class52.field605) {
					method179();
					field144 = var4.method1541();
					field79 = field29;
					var1.field2662 = null;
					return true;
				}

				boolean var60;
				if (var1.field2662 == class52.field701) {
					var24 = var4.method1532();
					var60 = var4.method1492() == 1;
					var30 = class131.method756(var24);
					class141.method828(var30, class126.field1164.field3299, var60);
					method213(var30);
					var1.field2662 = null;
					return true;
				}

				if (class52.field630 == var1.field2662) {
					var23 = var4.method1515();
					var26 = var4.method1520();
					class44.field561[var26] = var23;
					if (class44.field559[var26] != var23) {
						class44.field559[var26] = var23;
					}

					method235(var26);
					field224[++field225 - 1 & 31] = var26;
					var1.field2662 = null;
					return true;
				}

				boolean var13;
				if (class52.field611 == var1.field2662) {
					var29 = var4.method1500();
					var50 = (long)var4.method1541();
					var33 = (long)var4.method1548();
					class314 var45 = (class314)class216.method1198(class314.method1733(), var4.method1492());
					long var40 = (var50 << 32) + var33;
					var13 = false;

					for (var14 = 0; var14 < 100; ++var14) {
						if (var40 == field173[var14]) {
							var13 = true;
							break;
						}
					}

					if (class331.field2633.method312(new class353(var29, class67.field769))) {
						var13 = true;
					}

					if (!var13 && field152 == 0) {
						field173[field35] = var40;
						field35 = (field35 + 1) % 100;
						var54 = class300.method1659(class455.method2369(class217.method1202(var4)));
						byte var63;
						if (var45.field2561) {
							var63 = 7;
						} else {
							var63 = 3;
						}

						if (var45.field2560 != -1) {
							class159.method914(var63, class90.method580(var45.field2560) + var29, var54);
						} else {
							class159.method914(var63, var29, var54);
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field635 == var1.field2662) {
					if (null == class365.field2842) {
						class365.field2842 = new class173(class33.field482);
					}

					class10 var77 = class33.field482.method2087(var4);
					class365.field2842.field1599.method4(var77.field341, var77.field340);
					field293[++field158 - 1 & 31] = var77.field341;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field649) {
					var1.field2662 = null;
					return true;
				}

				class412 var41;
				if (var1.field2662 == class52.field614) {
					short var74 = (short)var4.method1495();
					var26 = var4.method1492();
					var7 = var4.method1541();
					var8 = var4.method1531();
					var41 = field87[var7];
					if (null != var41) {
						var41.method2185(var26, var8, var74);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field627 == var1.field2662) {
					var24 = var4.method1496();
					if (field127 != var24) {
						field127 = var24;
						method225();
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field659 == var1.field2662) {
					for (var24 = 0; var24 < class29.field467; ++var24) {
						class29 var67 = class135.method773(var24);
						if (var67 != null) {
							class44.field561[var24] = 0;
							class44.field559[var24] = 0;
						}
					}

					method179();
					field225 += 32;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field678) {
					var29 = var4.method1500();
					Object[] var64 = new Object[var29.length() + 1];

					for (var7 = var29.length() - 1; var7 >= 0; --var7) {
						if (var29.charAt(var7) == 's') {
							var64[var7 + 1] = var4.method1500();
						} else {
							var64[var7 + 1] = new Integer(var4.method1496());
						}
					}

					var64[0] = new Integer(var4.method1496());
					class20 var65 = new class20();
					var65.field380 = var64;
					class175.method1006(var65);
					var1.field2662 = null;
					return true;
				}

				if (class52.field666 == var1.field2662) {
					var29 = var4.method1500();
					var6 = class300.method1659(class455.method2369(class217.method1202(var4)));
					class159.method914(6, var29, var6);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field587) {
					class331.field2633.field350.method1370(var4, var1.field2668);
					method272();
					field233 = field29;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field610) {
					var24 = var4.method1539();
					var60 = var4.method1492() == 1;
					var55 = "";
					boolean var39 = false;
					if (var60) {
						var55 = var4.method1500();
						if (class331.field2633.method312(new class353(var55, class67.field769))) {
							var39 = true;
						}
					}

					String var43 = var4.method1500();
					if (!var39) {
						class159.method914(var24, var55, var43);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field669) {
					var58 = var4.method1492() == 1;
					if (var58) {
						class214.field1925 = class43.method443() - var4.method1497();
						class332.field2640 = new class414(var4, true);
					} else {
						class332.field2640 = null;
					}

					field98 = field29;
					var1.field2662 = null;
					return true;
				}

				if (class52.field647 == var1.field2662) {
					var24 = var4.method1520();
					var41 = field87[var24];
					var8 = var4.method1513();
					var7 = var4.method1520();
					var26 = var4.method1531();
					if (var41 != null) {
						var41.method637(var8, var7, var26 >> 16, var26 & 65535);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field651) {
					var24 = var4.method1519();
					if (var24 == 65535) {
						var24 = -1;
					}

					var26 = var4.method1496();
					var7 = var4.method1532();
					var35 = class131.method756(var26);
					class270 var36;
					if (!var35.field1294) {
						if (var24 == -1) {
							var35.field1256 = 0;
							var1.field2662 = null;
							return true;
						}

						var36 = class270.method1424(var24).method1410(var7);
						var35.field1256 = 4;
						var35.field1257 = var24;
						var35.field1264 = var36.field2162;
						var35.field1282 = var36.field2178;
						var35.field1267 = var36.field2185 * 100 / var7;
						method213(var35);
					} else {
						var35.field1342 = var24;
						var35.field1343 = var7;
						var36 = class270.method1424(var24).method1410(var7);
						var35.field1264 = var36.field2162;
						var35.field1282 = var36.field2178;
						var35.field1329 = var36.field2164;
						var35.field1262 = var36.field2163;
						var35.field1336 = var36.field2180;
						var35.field1267 = var36.field2185;
						if (var36.field2181 == 1) {
							var35.field1273 = 1;
						} else {
							var35.field1273 = 2;
						}

						if (var35.field1268 > 0) {
							var35.field1267 = var35.field1267 * 32 / var35.field1268;
						} else if (var35.field1225 > 0) {
							var35.field1267 = var35.field1267 * 32 / var35.field1225;
						}

						method213(var35);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field622 == var1.field2662) {
					var26 = var4.method1521();
					var7 = var4.method1513();
					var24 = var4.method1519();
					if (var26 == 65535) {
						var26 = -1;
					}

					class412 var34 = field87[var24];
					if (null != var34) {
						if (var34.field1076 == var26 && var26 != -1) {
							var9 = class202.method1149(var26).field1854;
							if (var9 == 1) {
								var34.field1077 = 0;
								var34.field1078 = 0;
								var34.field1093 = var7;
								var34.field1058 = 0;
							} else if (var9 == 2) {
								var34.field1058 = 0;
							}
						} else if (var26 == -1 || var34.field1076 == -1 || class202.method1149(var26).field1847 >= class202.method1149(var34.field1076).field1847) {
							var34.field1076 = var26;
							var34.field1077 = 0;
							var34.field1078 = 0;
							var34.field1093 = var7;
							var34.field1058 = 0;
							var34.field1095 = var34.field1079;
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field601) {
					var29 = var4.method1500();
					var50 = var4.method1497();
					var33 = (long)var4.method1541();
					var42 = (long)var4.method1548();
					class314 var46 = (class314)class216.method1198(class314.method1733(), var4.method1492());
					var53 = var42 + (var33 << 32);
					boolean var15 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (field173[var16] == var53) {
							var15 = true;
							break;
						}
					}

					if (var46.field2545 && class331.field2633.method312(new class353(var29, class67.field769))) {
						var15 = true;
					}

					if (!var15 && field152 == 0) {
						field173[field35] = var53;
						field35 = (1 + field35) % 100;
						var68 = class300.method1659(class455.method2369(class217.method1202(var4)));
						if (var46.field2560 != -1) {
							class159.method921(9, class90.method580(var46.field2560) + var29, var68, class299.method1640(var50));
						} else {
							class159.method921(9, var29, var68, class299.method1640(var50));
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field656 == var1.field2662) {
					var24 = var4.method1492();
					method240(var24);
					var1.field2662 = null;
					return true;
				}

				if (class52.field617 == var1.field2662) {
					var24 = var4.method1492();
					var26 = var4.method1492();
					var7 = var4.method1492();
					var8 = var4.method1492();
					field295[var24] = true;
					field89[var24] = var26;
					field249[var24] = var7;
					field159[var24] = var8;
					field245[var24] = 0;
					var1.field2662 = null;
					return true;
				}

				if (class52.field640 == var1.field2662) {
					var24 = var4.method1496();
					var26 = var4.method1541();
					if (var24 < -70000) {
						var26 += 32768;
					}

					if (var24 >= 0) {
						var30 = class131.method756(var24);
					} else {
						var30 = null;
					}

					for (; var4.field2254 < var1.field2668; class23.method344(var26, var8, var9 - 1, var10)) {
						var8 = var4.method1539();
						var9 = var4.method1541();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method1492();
							if (var10 == 255) {
								var10 = var4.method1496();
							}
						}

						if (var30 != null && var8 >= 0 && var8 < var30.field1340.length) {
							var30.field1340[var8] = var9;
							var30.field1341[var8] = var10;
						}
					}

					if (null != var30) {
						method213(var30);
					}

					method179();
					field226[++field227 - 1 & 31] = var26 & 32767;
					var1.field2662 = null;
					return true;
				}

				if (class52.field596 == var1.field2662) {
					field288 = true;
					field294 = false;
					field290 = true;
					var24 = var4.method1494();
					var26 = var4.method1494();
					var7 = method166(class91.field926 + var26 & 2027);
					var8 = class181.field1636 + var24;
					var9 = var4.method1541();
					var10 = var4.method1492();
					field109 = new class101(class91.field926, var7, var9, var10);
					field83 = new class101(class181.field1636, var8, var9, var10);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field702) {
					var8 = var4.method1513();
					var7 = var4.method1531();
					var26 = var4.method1541();
					var24 = var4.method1519();
					class439 var31;
					if (var24 == field155) {
						var31 = class126.field1164;
					} else {
						var31 = field200[var24];
					}

					if (null != var31) {
						var31.method637(var8, var26, var7 >> 16, var7 & 65535);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field674) {
					for (var24 = 0; var24 < class44.field559.length; ++var24) {
						if (class44.field559[var24] != class44.field561[var24]) {
							class44.field559[var24] = class44.field561[var24];
							method235(var24);
							field224[++field225 - 1 & 31] = var24;
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field606 == var1.field2662) {
					method144(var4.method1500());
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field686) {
					var24 = var4.method1532();
					var26 = var4.method1523();
					var30 = class131.method756(var24);
					if (var26 != var30.field1260 || var26 == -1) {
						var30.field1260 = var26;
						var30.field1344 = 0;
						var30.field1345 = 0;
						method213(var30);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field655) {
					class470.field3787 = var4.method1492();
					class157.field1495 = var4.method1514();

					while (var4.field2254 < var1.field2668) {
						var24 = var4.method1492();
						class63 var32 = class63.method487()[var24];
						class516.method2521(var32);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field641) {
					var24 = var4.method1520();
					var26 = var4.method1521();
					var8 = var4.method1521();
					var7 = var4.method1519();
					class303.method1678(var24, var26, var7, var8);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field657) {
					field288 = true;
					field294 = false;
					field289 = true;
					class183.field1648 = var4.method1492();
					class117.field1119 = var4.method1492();
					var24 = var4.method1541();
					var26 = var4.method1492() * 128 + 64;
					var7 = var4.method1492() * 128 + 64;
					var8 = var4.method1541();
					field291 = var4.method1499();
					var9 = var4.method1492();
					var10 = class183.field1648 * 128 + 64;
					var11 = class117.field1119 * 128 + 64;
					var12 = false;
					var13 = false;
					if (field291) {
						var37 = class374.field2888;
						var47 = method131(var10, var11, class401.field3120) - var24;
					} else {
						var37 = method131(class395.field3087, class365.field2843, class401.field3120) - class374.field2888;
						var47 = var24;
					}

					field292 = new class372(class395.field3087, class365.field2843, var37, var10, var11, var47, var26, var7, var8, var9);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field597) {
					class331.field2633.method319(var4, var1.field2668);
					field233 = field29;
					var1.field2662 = null;
					return true;
				}

				if (class52.field663 == var1.field2662) {
					field288 = true;
					field294 = false;
					field289 = false;
					class183.field1648 = var4.method1492();
					class117.field1119 = var4.method1492();
					class29.field471 = var4.method1541();
					class507.field4087 = var4.method1492();
					class166.field1578 = var4.method1492();
					if (class166.field1578 >= 100) {
						class395.field3087 = 64 + class183.field1648 * 128;
						class365.field2843 = class117.field1119 * 128 + 64;
						class374.field2888 = method131(class395.field3087, class365.field2843, class401.field3120) - class29.field471;
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field679) {
					var24 = var4.method1532();
					var26 = var4.method1520();
					var7 = var26 >> 10 & 31;
					var8 = var26 >> 5 & 31;
					var9 = var26 & 31;
					var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
					class131 var38 = class131.method756(var24);
					if (var38.field1237 != var10) {
						var38.field1237 = var10;
						method213(var38);
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field643) {
					var29 = var4.method1500();
					var26 = var4.method1537();
					var30 = class131.method756(var26);
					if (!var29.equals(var30.field1274)) {
						var30.field1274 = var29;
						method213(var30);
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field692 == var1.field2662) {
					var24 = var4.method1496();
					var26 = var4.method1541();
					if (var24 < -70000) {
						var26 += 32768;
					}

					if (var24 >= 0) {
						var30 = class131.method756(var24);
					} else {
						var30 = null;
					}

					if (null != var30) {
						for (var8 = 0; var8 < var30.field1340.length; ++var8) {
							var30.field1340[var8] = 0;
							var30.field1341[var8] = 0;
						}
					}

					class23.method339(var26);
					var8 = var4.method1541();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var4.method1541();
						var11 = var4.method1514();
						if (var11 == 255) {
							var11 = var4.method1537();
						}

						if (null != var30 && var9 < var30.field1340.length) {
							var30.field1340[var9] = var10;
							var30.field1341[var9] = var11;
						}

						class23.method344(var26, var9, var10 - 1, var11);
					}

					if (var30 != null) {
						method213(var30);
					}

					method179();
					field226[++field227 - 1 & 31] = var26 & 32767;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field612) {
					var24 = var4.method1519();
					var26 = var4.method1537();
					class44.field561[var24] = var26;
					if (var26 != class44.field559[var24]) {
						class44.field559[var24] = var26;
					}

					method235(var24);
					field224[++field225 - 1 & 31] = var24;
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field616) {
					class516.method2521(class63.field745);
					var1.field2662 = null;
					return true;
				}

				if (class52.field704 == var1.field2662) {
					class516.method2521(class63.field751);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field676) {
					class516.method2521(class63.field750);
					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field685) {
					var24 = var4.method1492();
					if (var4.method1492() == 0) {
						field305[var24] = new class454();
						var4.field2254 += 18;
					} else {
						--var4.field2254;
						field305[var24] = new class454(var4, false);
					}

					field237 = field29;
					var1.field2662 = null;
					return true;
				}

				if (class52.field602 == var1.field2662 && field288) {
					field294 = true;
					field290 = false;
					field289 = false;

					for (var24 = 0; var24 < 5; ++var24) {
						field295[var24] = false;
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field598) {
					class470.field3787 = var4.method1552();
					class157.field1495 = var4.method1514();

					for (var24 = class470.field3787; var24 < class470.field3787 + 8; ++var24) {
						for (var26 = class157.field1495; var26 < class157.field1495 + 8; ++var26) {
							if (field167[class401.field3120][var24][var26] != null) {
								field167[class401.field3120][var24][var26] = null;
								method181(var24, var26);
							}
						}
					}

					for (class296 var25 = (class296)field168.method627(); var25 != null; var25 = (class296)field168.method629()) {
						if (var25.field2394 >= class470.field3787 && var25.field2394 < class470.field3787 + 8 && var25.field2400 >= class157.field1495 && var25.field2400 < 8 + class157.field1495 && class401.field3120 == var25.field2401) {
							var25.field2399 = 0;
						}
					}

					var1.field2662 = null;
					return true;
				}

				if (class52.field621 == var1.field2662) {
					return this.method117(var1, 2);
				}

				if (var1.field2662 == class52.field690) {
					field278 = var4.method1492();
					if (field278 == 255) {
						field278 = 0;
					}

					field201 = var4.method1492();
					if (field201 == 255) {
						field201 = 0;
					}

					var1.field2662 = null;
					return true;
				}

				if (var1.field2662 == class52.field615) {
					field236 = field29;
					var23 = var4.method1493();
					class141 var27 = new class141(var4);
					class143 var28;
					if (var23 >= 0) {
						var28 = field272[var23];
					} else {
						var28 = class263.field2126;
					}

					if (var28 == null) {
						this.method115(var23);
						var1.field2662 = null;
						return true;
					}

					if (var27.field1425 > var28.field1439) {
						this.method115(var23);
						var1.field2662 = null;
						return true;
					}

					if (var27.field1425 < var28.field1439) {
						var1.field2662 = null;
						return true;
					}

					var27.method827(var28);
					var1.field2662 = null;
					return true;
				}

				if (class52.field709 == var1.field2662) {
					class516.method2521(class63.field746);
					var1.field2662 = null;
					return true;
				}

				class159.method913("" + (var1.field2662 != null ? -908169793 * var1.field2662.field710 * 1400406591 : -1) + class479.field3823 + (var1.field2673 != null ? var1.field2673.field710 : -1) + class479.field3823 + (null != var1.field2674 ? var1.field2674.field710 : -1) + class479.field3823 + var1.field2668, (Throwable)null);
				method280();
			} catch (IOException var21) {
				method214();
			} catch (Exception var22) {
				var6 = "" + (null != var1.field2662 ? var1.field2662.field710 : -1) + class479.field3823 + (var1.field2673 != null ? var1.field2673.field710 : -1) + class479.field3823 + (null != var1.field2674 ? -908169793 * var1.field2674.field710 * 1400406591 : -1) + class479.field3823 + var1.field2668 + class479.field3823 + (class265.field2147 + class126.field1164.field1106[0]) + class479.field3823 + (class508.field4092 + class126.field1164.field1103[0]) + class479.field3823;

				for (var7 = 0; var7 < var1.field2668 && var7 < 50; ++var7) {
					var6 = var6 + var4.field2252[var7] + class479.field3823;
				}

				class159.method913(var6, var22);
				method280();
			}

			return true;
		}
	}

	@ObfInfo(name = "lx", desc = "(B)V", opaqueValue = "0")
	final void method99() {
		boolean var2 = false;

		int var3;
		int var6;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < field176 - 1; ++var3) {
				if (field220[var3] < 1000 && field220[var3 + 1] > 1000) {
					String var4 = field301[var3];
					field301[var3] = field301[var3 + 1];
					field301[var3 + 1] = var4;
					String var5 = field182[var3];
					field182[var3] = field182[var3 + 1];
					field182[var3 + 1] = var5;
					var6 = field220[var3];
					field220[var3] = field220[var3 + 1];
					field220[var3 + 1] = var6;
					var6 = field177[var3];
					field177[var3] = field177[var3 + 1];
					field177[var3 + 1] = var6;
					var6 = field178[var3];
					field178[var3] = field178[var3 + 1];
					field178[var3 + 1] = var6;
					var6 = field180[var3];
					field180[var3] = field180[var3 + 1];
					field180[var3 + 1] = var6;
					var6 = field181[var3];
					field181[var3] = field181[var3 + 1];
					field181[var3 + 1] = var6;
					boolean var7 = field184[var3];
					field184[var3] = field184[var3 + 1];
					field184[var3 + 1] = var7;
					var2 = false;
				}
			}
		}

		if (null == field211) {
			int var16 = class166.field1574;
			int var8;
			int var9;
			int var18;
			int var19;
			if (field140) {
				int var17;
				if (var16 != 1 && (class146.field1455 || var16 != 4)) {
					var3 = class166.field1580;
					var17 = class166.field1563;
					if (var3 < class304.field2456 - 10 || var3 > class304.field2456 + class302.field2441 + 10 || var17 < class59.field731 - 10 || var17 > class59.field731 + class494.field4013 + 10) {
						field140 = false;
						var18 = class304.field2456;
						var6 = class59.field731;
						var19 = class302.field2441;
						var8 = class494.field4013;

						for (var9 = 0; var9 < field198; ++var9) {
							if (field254[var9] + field252[var9] > var18 && field252[var9] < var18 + var19 && field253[var9] + field255[var9] > var6 && field253[var9] < var6 + var8) {
								field37[var9] = true;
							}
						}
					}
				}

				if (var16 == 1 || !class146.field1455 && var16 == 4) {
					var3 = class304.field2456;
					var17 = class59.field731;
					var18 = class302.field2441;
					var6 = class166.field1575;
					var19 = class166.field1576;
					var8 = -1;

					int var10;
					for (var9 = 0; var9 < field176; ++var9) {
						var10 = var17 + 31 + (field176 - 1 - var9) * 15;
						if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
							var8 = var9;
						}
					}

					int var11;
					int var12;
					int var13;
					if (var8 != -1 && var8 >= 0) {
						var9 = field177[var8];
						var10 = field178[var8];
						var11 = field220[var8];
						var12 = field180[var8];
						var13 = field181[var8];
						String var14 = field182[var8];
						String var15 = field301[var8];
						method273(var9, var10, var11, var12, var13, var14, var15, class166.field1575, class166.field1576);
					}

					field140 = false;
					var9 = class304.field2456;
					var10 = class59.field731;
					var11 = class302.field2441;
					var12 = class494.field4013;

					for (var13 = 0; var13 < field198; ++var13) {
						if (field254[var13] + field252[var13] > var9 && field252[var13] < var9 + var11 && field255[var13] + field253[var13] > var10 && field253[var13] < var10 + var12) {
							field37[var13] = true;
						}
					}
				}
			} else {
				var3 = field176 - 1;
				if ((var16 == 1 || !class146.field1455 && var16 == 4) && this.method100((byte)-84)) {
					var16 = 2;
				}

				if ((var16 == 1 || !class146.field1455 && var16 == 4) && field176 > 0 && var3 >= 0) {
					var18 = field177[var3];
					var6 = field178[var3];
					var19 = field220[var3];
					var8 = field180[var3];
					var9 = field181[var3];
					String var20 = field182[var3];
					String var21 = field301[var3];
					method273(var18, var6, var19, var8, var9, var20, var21, class166.field1575, class166.field1576);
				}

				if (var16 == 2 && field176 > 0) {
					this.method101(class166.field1575, class166.field1576);
				}
			}

		}
	}

	@ObfInfo(name = "le", desc = "(B)Z")
	final boolean method100(byte var1) {
		boolean var10000;
		label31: {
			int var2;
			label34: {
				var2 = field176 - 1;
				if (field174) {
					if (var1 >= -1) {
						throw new IllegalStateException();
					}

					if (field176 > 2) {
						break label34;
					}
				}

				if (!method147(var2)) {
					break label31;
				}

				if (var1 >= -1) {
					throw new IllegalStateException();
				}
			}

			if (!field184[var2]) {
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

	@ObfInfo(name = "lu", desc = "(III)V")
	final void method101(int var1, int var2) {
		class189.method1047(var1, var2);
		var1 -= field308;
		var2 -= field309;
		class27.field448.method1081(class401.field3120, var1, var2, false);
		field140 = true;
	}

	@ObfInfo(name = "li", desc = "(ZI)V", opaqueValue = "233993047")
	final void method102(boolean var1) {
		int var3 = field199;
		int var4 = class537.field4270;
		int var5 = class396.field3101;
		if (class131.method760(var3)) {
			method133(class121.field1142[var3], -1, var4, var5, var1);
		}

	}

	@ObfInfo(name = "ll", desc = "(Lmi;I)V", opaqueValue = "649704501")
	void method103(class131 var1) {
		class131 var3 = var1.field1231 == -1 ? null : class131.method756(var1.field1231);
		int var4;
		int var5;
		if (var3 == null) {
			var4 = class537.field4270;
			var5 = class396.field3101;
		} else {
			var4 = var3.field1229;
			var5 = var3.field1206;
		}

		method258(var1, var4, var5, false);
		method223(var1, var4, var5);
	}

	@ObfInfo(name = "mb", desc = "(I)V", opaqueValue = "602399468")
	final void method104() {
		method213(field211);
		++class362.field2821;
		int var2;
		int var3;
		if (field263 && field216) {
			var2 = class166.field1580;
			var3 = class166.field1563;
			var2 -= field213;
			var3 -= field286;
			if (var2 < field217) {
				var2 = field217;
			}

			if (var2 + field211.field1229 > field230.field1229 + field217) {
				var2 = field230.field1229 + field217 - field211.field1229;
			}

			if (var3 < field218) {
				var3 = field218;
			}

			if (field211.field1206 + var3 > field218 + field230.field1206) {
				var3 = field218 + field230.field1206 - field211.field1206;
			}

			int var10 = var2 - field65;
			int var5 = var3 - field137;
			int var6 = field211.field1227;
			if (class362.field2821 > field211.field1269 && (var10 > var6 || var10 < -var6 || var5 > var6 || var5 < -var6)) {
				field222 = true;
			}

			int var7 = field230.field1233 + (var2 - field217);
			int var8 = field230.field1247 + (var3 - field218);
			class20 var9;
			if (null != field211.field1306 && field222) {
				var9 = new class20();
				var9.field377 = field211;
				var9.field378 = var7;
				var9.field381 = var8;
				var9.field380 = field211.field1306;
				class175.method1006(var9);
			}

			if (class166.field1570 == 0) {
				if (field222) {
					if (null != field211.field1307) {
						var9 = new class20();
						var9.field377 = field211;
						var9.field378 = var7;
						var9.field381 = var8;
						var9.field383 = field215;
						var9.field380 = field211.field1307;
						class175.method1006(var9);
					}

					if (null != field215 && method171(field211) != null) {
						class121 var11 = class121.method689(class480.field3857, field92.field2665);
						var11.field1141.method1529(field211.field1214);
						var11.field1141.method1501(field215.field1214);
						var11.field1141.method1522(field211.field1333);
						var11.field1141.method1522(field215.field1342);
						var11.field1141.method1544(field215.field1333);
						var11.field1141.method1544(field211.field1342);
						field92.method1821(var11);
					}
				} else if (this.method100((byte)-32)) {
					this.method101(field65 + field213, field137 + field286);
				} else if (field176 > 0) {
					method120(field213 + field65, field286 + field137);
				}

				field211 = null;
			}

		} else {
			if (class362.field2821 > 1) {
				if (!field222 && field176 > 0) {
					var2 = field213 + field65;
					var3 = field286 + field137;
					class152 var4 = class312.field2539;
					if (var4 != null) {
						method273(var4.field1470, var4.field1473, var4.field1471, var4.field1472, var4.field1469, var4.field1474, var4.field1475, var2, var3);
					}

					class312.field2539 = null;
				}

				field211 = null;
			}

		}
	}

	@ObfInfo(name = "ok", desc = "(S)Luc;", opaqueValue = "235")
	public class353 method1155() {
		return null != class126.field1164 ? class126.field1164.field3315 : null;
	}

	@ObfInfo(name = "of", desc = "(IS)V", opaqueValue = "254")
	void method115(int var1) {
		if (field209 >= 216) {
			class121 var3 = class121.method689(class480.field3923, field92.field2665);
			var3.field1141.method1481(var1);
			field92.method1821(var3);
		}

	}

	@ObfInfo(name = "ps", desc = "(II)V", opaqueValue = "-848725813")
	void method107(int var1) {
		if (field209 >= 216) {
			class121 var3 = class121.method689(class480.field3924, field92.field2665);
			var3.field1141.method1481(var1);
			field92.method1821(var3);
		}

	}

	@ObfInfo(name = "gp", desc = "(B)Lsi;")
	static class245 method215() {
		return class34.field483;
	}

	@ObfInfo(name = "ga", desc = "(B)V")
	static void method130() {
		class435.field3280 = System.getenv("JX_ACCESS_TOKEN");
		class312.field2540 = System.getenv("JX_REFRESH_TOKEN");
		class249.field2080 = System.getenv("JX_SESSION_ID");
		class308.field2521 = System.getenv("JX_CHARACTER_ID");
		class162.method940(System.getenv("JX_DISPLAY_NAME"));
	}

	@ObfInfo(name = "ho", desc = "(B)Liz;")
	public static class320 method232() {
		return field175;
	}

	@ObfInfo(name = "hj", desc = "(B)V")
	static void method270() {
		if (class171.field1595.method1715()) {
			class171.field1595.method1713();
		}

		if (class306.field2472 != null) {
			class306.field2472.field2656 = false;
		}

		class306.field2472 = null;
		field92.method1825();
		if (null != class346.field2715) {
			try {
				class346.field2715.method2500();
			} catch (Exception var3) {
			}
		}

		class346.field2715 = null;
		method162();
		class345.field2708.method2282();
		class439.field3327.method2282();
		class376.field2892.method2282();
		class411.field3163.method2282();
		class540.field4279.method2282();
		class185.field1690.method2282();
		class524.field4197.method2282();
		class38.field506.method2282();
		method149();
		class27.field448.method1056();

		for (int var1 = 0; var1 < 4; ++var1) {
			field102[var1].method526();
		}

		class34.field483 = null;
		class333.method1815(0, 0);
		class265.method1388();
		field299 = false;
		class470.method2415();
		if (class115.field1108 != null) {
			class115.field1108.method2232();
		}

		class176.field1623.method435();
		class208.method1157();
		if (null != class248.field2079) {
			class248.field2079.method1385();
		}

		class519.method2547();
		class519.field4152 = null;
		class519.field4153 = null;
		class104.field1009 = null;
		class23.method337();
		class60.field733 = null;
		field324.clear();
		field326 = 0;
		class176.field1623 = new class41();
		class248.field2079 = new class537(class51.field585.field74, 216);

		try {
			class519.method2545("oldschool", class499.field4034, class383.field2946.field4190, 0, 22);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class60.field733 = new class387(255, class519.field4152, class519.field4153, 500000);
		class346.field2715 = new class502();
		class51.field585.method1896();
		field59 = class253.field2101;
		method248(0);
	}

	@ObfInfo(name = "hh", desc = "(I)V")
	static void method149() {
		field107 = null;
		class427.field3237 = null;
		class331.field2634 = null;
		class11.field343 = null;
		class49.field573 = null;
		class74.field799 = null;
		class212.field1899 = null;
		class136.field1382 = null;
		class102.field989 = null;
		class151.field1468 = null;
		class197.field1805 = null;
	}

	@ObfInfo(name = "hi", desc = "(IB)V")
	static void method248(int var0) {
		if (field111 != var0) {
			if (field111 == 30) {
				field266.method1628();
			}

			if (field111 == 0) {
				class51.field585.method1916();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				method246(0);
				field42 = 0;
				field93 = 0;
				field95.method2034(var0);
				if (var0 != 20) {
					method163(false);
				}
			}

			if (var0 != 20 && var0 != 40 && null != class112.field1028) {
				class112.field1028.method622();
				class112.field1028 = null;
			}

			if (field111 == 25) {
				field101 = 0;
				field97 = 0;
				field131 = 1;
				field99 = 0;
				field100 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = field111 == 11 ? 4 : 0;
					class162.method938(class237.field1983, class429.field3253, false, var4);
				} else if (var0 == 11) {
					class162.method938(class237.field1983, class429.field3253, false, 4);
				} else if (var0 == 50) {
					class162.method936("", "Updating date of birth...", "");
					class162.method938(class237.field1983, class429.field3253, false, 7);
				} else if (class404.field3128) {
					class162.field1522 = null;
					class51.field586 = null;
					class162.field1521 = null;
					class162.field1524 = null;
					class238.field1988 = null;
					class279.field2250 = null;
					class161.field1518 = null;
					class162.field1519 = null;
					class107.field1020 = null;
					class109.field1021 = null;
					class293.field2379 = null;
					class277.field2245 = null;
					class256.field2111 = null;
					class26.field421 = null;
					class365.field2837.method1374();
					class333.method1815(0, 100);
					class77.method528().method430(true);
					class404.field3128 = false;
				}
			} else {
				boolean var2 = class281.field2262.method1758() >= field32;
				int var3 = var2 ? 0 : 12;
				class162.method938(class237.field1983, class429.field3253, true, var3);
			}

			field111 = var0;
		}
	}

	@ObfInfo(name = "hl", desc = "(Lnk;Ljava/lang/String;I)V")
	static void method278(class505 var0, String var1) {
		class74 var3 = new class74(var0, var1);
		field324.add(var3);
		field326 += var3.field797;
	}

	@ObfInfo(name = "hg", desc = "(I)Z")
	static boolean method157() {
		if (null != field324 && field325 < field324.size()) {
			while (field325 < field324.size()) {
				class74 var1 = (class74)field324.get(field325);
				if (!var1.method512()) {
					return false;
				}

				++field325;
			}

			return true;
		} else {
			return true;
		}
	}

	@ObfInfo(name = "hu", desc = "(I)I")
	static int method148() {
		if (null != field324 && field325 < field324.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= field325; ++var2) {
				var1 += ((class74)field324.get(var2)).field798;
			}

			return var1 * 10000 / field326;
		} else {
			return 10000;
		}
	}

	@ObfInfo(name = "he", desc = "(IB)I")
	static int method204(int var0) {
		return var0 * 3 + 600;
	}

	@ObfInfo(name = "hq", desc = "(B)V")
	static void method210() {
		int var30;
		if (field59 == class253.field2101) {
			class27.field448 = new class194(4, 104, 104, class411.field3172);

			for (var30 = 0; var30 < 4; ++var30) {
				field102[var30] = new class77(104, 104);
			}

			class381.field2929 = new class150(512, 512);
			class162.field1528 = class453.field3411;
			class162.field1527 = 5;
			field59 = class253.field2092;
		} else if (class253.field2092 == field59) {
			class162.field1528 = class453.field3412;
			class162.field1527 = 10;
			field59 = class253.field2100;
		} else if (class253.field2100 == field59) {
			class535.field4261 = method184(0, false, true, true, false);
			class514.field4108 = method184(1, false, true, true, false);
			class345.field2708 = method184(2, true, false, true, false);
			class470.field3803 = method184(3, false, true, true, false);
			class310.field2523 = method184(4, false, true, true, false);
			class464.field3761 = method184(5, true, true, true, false);
			class323.field2609 = method184(6, true, true, true, false);
			class212.field1898 = method184(7, false, true, true, false);
			class429.field3253 = method184(8, false, true, true, false);
			class242.field2008 = method184(9, false, true, true, false);
			class237.field1983 = method184(10, false, true, true, false);
			class299.field2409 = method184(11, false, true, true, false);
			class454.field3714 = method184(12, false, true, true, false);
			class439.field3327 = method184(13, true, false, true, false);
			class376.field2892 = method184(14, false, true, true, false);
			class411.field3163 = method184(15, false, true, true, false);
			class540.field4279 = method184(17, true, true, true, false);
			class185.field1690 = method184(18, false, true, true, false);
			class524.field4197 = method184(19, false, true, true, false);
			class38.field506 = method184(20, false, true, true, false);
			class106.field1018 = method184(21, false, true, true, true);
			class162.field1528 = class453.field3437;
			class162.field1527 = 20;
			field59 = class253.field2094;
		} else if (class253.field2094 == field59) {
			byte var50 = 0;
			var30 = var50 + class535.field4261.method2502() * 4 / 100;
			var30 += class514.field4108.method2502() * 4 / 100;
			var30 += class345.field2708.method2502() * 2 / 100;
			var30 += class470.field3803.method2502() * 2 / 100;
			var30 += class310.field2523.method2502() * 6 / 100;
			var30 += class464.field3761.method2502() * 4 / 100;
			var30 += class323.field2609.method2502() * 2 / 100;
			var30 += class212.field1898.method2502() * 55 / 100;
			var30 += class429.field3253.method2502() * 2 / 100;
			var30 += class242.field2008.method2502() * 2 / 100;
			var30 += class237.field1983.method2502() * 2 / 100;
			var30 += class299.field2409.method2502() * 2 / 100;
			var30 += class454.field3714.method2502() * 2 / 100;
			var30 += class439.field3327.method2502() * 2 / 100;
			var30 += class376.field2892.method2502() * 2 / 100;
			var30 += class411.field3163.method2502() * 2 / 100;
			var30 += class524.field4197.method2502() / 100;
			var30 += class185.field1690.method2502() / 100;
			var30 += class38.field506.method2502() / 100;
			var30 += class106.field1018.method2502() / 100;
			var30 += class540.field4279.method2508() && class540.field4279.method2272() ? 1 : 0;
			if (var30 != 100) {
				if (var30 != 0) {
					class162.field1528 = class453.field3414 + var30 + "%";
				}

				class162.field1527 = 30;
			} else {
				method278(class535.field4261, "Animations");
				method278(class514.field4108, "Skeletons");
				method278(class310.field2523, "Sound FX");
				method278(class464.field3761, "Maps");
				method278(class323.field2609, "Music Tracks");
				method278(class212.field1898, "Models");
				method278(class429.field3253, "Sprites");
				method278(class299.field2409, "Music Jingles");
				method278(class376.field2892, "Music Samples");
				method278(class411.field3163, "Music Patches");
				method278(class524.field4197, "World Map");
				method278(class185.field1690, "World Map Geography");
				method278(class38.field506, "World Map Ground");
				class261.field2118 = new class70();
				class261.field2118.method504(class540.field4279);
				class162.field1528 = class453.field3415;
				class162.field1527 = 30;
				field59 = class253.field2095;
			}
		} else {
			int var3;
			class505 var33;
			class505 var35;
			if (class253.field2095 == field59) {
				class429.method2246(22050, !field31, 2);
				ArrayList var48 = new ArrayList(3);
				class115.field1108 = class429.method2245(class346.field2715, 0, 2048);
				class164.field1556 = new class363();
				class363 var32 = new class363();
				var32.method1990(class164.field1556);

				for (var3 = 0; var3 < 3; ++var3) {
					class137 var39 = new class137();
					var39.method800(9, 128);
					var32.method1990(var39);
					var48.add(var39);
				}

				class115.field1108.method2229(var32);
				var33 = class411.field3163;
				var35 = class376.field2892;
				class505 var41 = class310.field2523;
				class303.field2442 = var33;
				class303.field2443 = var35;
				class303.field2446 = var41;
				class303.field2445 = var48;
				class105.field1016 = new class124(22050, class429.field3242);
				class162.field1528 = class453.field3416;
				class162.field1527 = 35;
				field59 = class253.field2099;
				class121.field1143 = new class389(class429.field3253, class439.field3327);
			} else {
				int var2;
				if (field59 == class253.field2099) {
					class517[] var47 = new class517[]{class517.field4147, class517.field4141, class517.field4140, class517.field4145, class517.field4143, class517.field4142};
					var2 = var47.length;
					class389 var34 = class121.field1143;
					class517[] var38 = new class517[]{class517.field4147, class517.field4141, class517.field4140, class517.field4145, class517.field4143, class517.field4142};
					field96 = var34.method2084(var38);
					if (field96.size() < var2) {
						class162.field1528 = class453.field3609 + field96.size() * 100 / var2 + "%";
						class162.field1527 = 40;
					} else {
						class209.field1870 = (class258)field96.get(class517.field4143);
						class256.field2112 = (class258)field96.get(class517.field4142);
						class319.field2584 = (class258)field96.get(class517.field4145);
						class282.field2265 = field172.method1215();
						class162.field1528 = class453.field3418;
						class162.field1527 = 40;
						field59 = class253.field2097;
					}
				} else {
					int var4;
					class505 var6;
					class505 var31;
					if (field59 == class253.field2097) {
						var31 = class237.field1983;
						var33 = class429.field3253;
						var4 = 0;
						String[] var37 = class162.field1532;

						int var40;
						String var42;
						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var31.method2287(var42, "")) {
								++var4;
							}
						}

						var37 = class162.field1551;

						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var33.method2287(var42, "")) {
								++var4;
							}
						}

						var37 = class162.field1554;

						for (var40 = 0; var40 < var37.length; ++var40) {
							var42 = var37[var40];
							if (var33.method2292(var42) != -1 && var33.method2287(var42, "")) {
								++var4;
							}
						}

						var6 = class429.field3253;
						int var43 = class162.field1532.length + class162.field1551.length;
						String[] var44 = class162.field1554;

						for (int var45 = 0; var45 < var44.length; ++var45) {
							String var49 = var44[var45];
							if (var6.method2292(var49) != -1) {
								++var43;
							}
						}

						if (var4 < var43) {
							class162.field1528 = class453.field3419 + var4 * 100 / var43 + "%";
							class162.field1527 = 50;
						} else {
							class162.field1528 = class453.field3420;
							class162.field1527 = 50;
							method248(5);
							field59 = class253.field2098;
						}
					} else if (class253.field2098 == field59) {
						if (!class345.field2708.method2272()) {
							class162.field1528 = class453.field3421 + class345.field2708.method2510() + "%";
							class162.field1527 = 60;
						} else if (!class106.field1018.method2272()) {
							class162.field1528 = class453.field3421 + (80 + class454.field3714.method2510() / 6) + "%";
							class162.field1527 = 60;
						} else {
							class102.method607(class345.field2708);
							class541.method2601(class345.field2708);
							class505 var46 = class345.field2708;
							var31 = class212.field1898;
							class145.field1440 = var46;
							class145.field1441 = var31;
							class145.field1443 = class145.field1440.method2293(3);
							var33 = class345.field2708;
							var35 = class212.field1898;
							boolean var36 = field31;
							class292.field2327 = var33;
							class292.field2325 = var35;
							class292.field2373 = var36;
							var6 = class345.field2708;
							class505 var7 = class212.field1898;
							class395.field3051 = var6;
							class395.field3052 = var7;
							class505 var8 = class345.field2708;
							class12.field346 = var8;
							class505 var9 = class345.field2708;
							class505 var10 = class212.field1898;
							boolean var11 = field54;
							class258 var12 = class209.field1870;
							class244.field2012 = var9;
							class270.field2165 = var10;
							class270.field2166 = var11;
							class401.field3121 = class244.field2012.method2293(10);
							class254.field2109 = var12;
							class202.method1151(class345.field2708, class535.field4261, class514.field4108);
							class505 var13 = class345.field2708;
							class505 var14 = class212.field1898;
							class460.field3742 = var13;
							class460.field3729 = var14;
							class126.method700(class345.field2708);
							class29.method413(class345.field2708);
							class505 var15 = class470.field3803;
							class505 var16 = class212.field1898;
							class505 var17 = class429.field3253;
							class505 var18 = class439.field3327;
							int var19 = 0;
							if (null != var15) {
								class124.field1152 = var15;
								class508.field4091 = var16;
								class67.field760 = var17;
								class466.field3769 = var18;
								var19 = class124.field1152.method2279();
							}

							class121.field1142 = new class131[var19][];
							class302.field2440 = new boolean[var19];
							class446.method2350(class345.field2708);
							class505 var51 = class345.field2708;
							class134.field1378 = var51;
							class505 var20 = class345.field2708;
							class26.field425 = var20;
							class505 var21 = class345.field2708;
							class409.method2146(class345.field2708);
							class210.method1160(class345.field2708);
							class360.method1976(class345.field2708);
							class508.field4090 = new class267(class512.field4103, 54, class524.field4196, class345.field2708);
							class33.field482 = new class267(class512.field4103, 47, class524.field4196, class345.field2708);
							class171.field1595 = new class308();
							class505 var22 = class345.field2708;
							class505 var23 = class429.field3253;
							class505 var24 = class439.field3327;
							class490.field3987 = var22;
							class490.field3970 = var23;
							class490.field3972 = var24;
							class468.method2408(class345.field2708, class429.field3253);
							class505 var25 = class345.field2708;
							class505 var26 = class429.field3253;
							class185.field1679 = var26;
							if (var25.method2272()) {
								class185.field1668 = var25.method2293(35);
								class185.field1667 = new class185[class185.field1668];

								for (int var27 = 0; var27 < class185.field1668; ++var27) {
									byte[] var28 = var25.method2267(35, var27);
									class185.field1667[var27] = new class185(var27);
									if (var28 != null) {
										class185.field1667[var27].method1037(new class280(var28));
										class185.field1667[var27].method1039();
									}
								}
							}

							class162.field1528 = class453.field3614;
							class162.field1527 = 60;
							field59 = class253.field2091;
						}
					} else if (field59 == class253.field2091) {
						var30 = 0;
						if (field107 == null) {
							field107 = class411.method2150(class429.field3253, class261.field2118.field788, 0);
						} else {
							++var30;
						}

						if (class427.field3237 == null) {
							class427.field3237 = class411.method2150(class429.field3253, class261.field2118.field778, 0);
						} else {
							++var30;
						}

						if (null == class331.field2634) {
							class331.field2634 = class273.method1427(class429.field3253, class261.field2118.field781, 0);
						} else {
							++var30;
						}

						if (class11.field343 == null) {
							class11.field343 = class273.method1438(class429.field3253, class261.field2118.field780, 0);
						} else {
							++var30;
						}

						if (null == class49.field573) {
							class49.field573 = class273.method1438(class429.field3253, class261.field2118.field786, 0);
						} else {
							++var30;
						}

						if (class74.field799 == null) {
							class74.field799 = class273.method1438(class429.field3253, class261.field2118.field777, 0);
						} else {
							++var30;
						}

						if (class212.field1899 == null) {
							class212.field1899 = class273.method1438(class429.field3253, class261.field2118.field783, 0);
						} else {
							++var30;
						}

						if (null == class136.field1382) {
							class136.field1382 = class273.method1438(class429.field3253, class261.field2118.field784, 0);
						} else {
							++var30;
						}

						if (null == class102.field989) {
							class102.field989 = class273.method1438(class429.field3253, class261.field2118.field785, 0);
						} else {
							++var30;
						}

						if (class151.field1468 == null) {
							class151.field1468 = class273.method1427(class429.field3253, class261.field2118.field782, 0);
						} else {
							++var30;
						}

						if (null == class197.field1805) {
							class197.field1805 = class273.method1427(class429.field3253, class261.field2118.field787, 0);
						} else {
							++var30;
						}

						if (var30 < 11) {
							class162.field1528 = class453.field3423 + var30 * 100 / 12 + "%";
							class162.field1527 = 70;
						} else {
							class300.field2410 = class197.field1805;
							class427.field3237.method852();
							var2 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var4 = (int)(Math.random() * 21.0D) - 10;
							int var5 = (int)(Math.random() * 41.0D) - 20;
							class331.field2634[0].method2111(var5 + var2, var3 + var5, var5 + var4);
							class162.field1528 = class453.field3424;
							class162.field1527 = 70;
							field59 = class253.field2105;
						}
					} else if (field59 == class253.field2105) {
						if (!class242.field2008.method2272()) {
							class162.field1528 = class453.field3425 + "0%";
							class162.field1527 = 90;
						} else {
							class91.field925 = new class458(class242.field2008, class429.field3253, 20, class281.field2262.method1767(), field31 ? 64 : 128);
							class276.method1442(class91.field925);
							class276.method1443(class281.field2262.method1767());
							field59 = class253.field2106;
						}
					} else if (class253.field2106 == field59) {
						var30 = class91.field925.method2384();
						if (var30 < 100) {
							class162.field1528 = class453.field3425 + var30 + "%";
							class162.field1527 = 90;
						} else {
							class162.field1528 = class453.field3703;
							class162.field1527 = 90;
							field59 = class253.field2103;
						}
					} else if (field59 == class253.field2103) {
						class306.field2472 = new class334();
						class346.field2715.method2498(class306.field2472, 10);
						class162.field1528 = class453.field3531;
						class162.field1527 = 92;
						field59 = class253.field2102;
					} else if (class253.field2102 == field59) {
						if (!class237.field1983.method2287("huffman", "")) {
							class162.field1528 = class453.field3450 + 0 + "%";
							class162.field1527 = 94;
						} else {
							class393 var29 = new class393(class237.field1983.method2286("huffman", ""));
							class217.method1199(var29);
							class162.field1528 = class453.field3429;
							class162.field1527 = 94;
							field59 = class253.field2096;
						}
					} else if (class253.field2096 == field59) {
						if (!class470.field3803.method2272()) {
							class162.field1528 = class453.field3430 + class470.field3803.method2510() * 4 / 5 + "%";
							class162.field1527 = 96;
						} else if (!class454.field3714.method2272()) {
							class162.field1528 = class453.field3430 + (80 + class454.field3714.method2510() / 6) + "%";
							class162.field1527 = 96;
						} else if (!class439.field3327.method2272()) {
							class162.field1528 = class453.field3430 + (96 + class439.field3327.method2510() / 50) + "%";
							class162.field1527 = 96;
						} else {
							class162.field1528 = class453.field3431;
							class162.field1527 = 98;
							if (class454.field3714.method2289("version.dat", "")) {
								class280 var1 = new class280(class454.field3714.method2286("version.dat", ""));
								var1.method1541();
							}

							field59 = class253.field2104;
						}
					} else if (field59 == class253.field2104) {
						class162.field1527 = 100;
						if (class524.field4197.method2279() > 0 && !class524.field4197.method2288(class506.field4086.field4085)) {
							class162.field1528 = class453.field3432 + class524.field4197.method2294(class506.field4086.field4085) / 10 + "%";
						} else {
							if (null == class34.field483) {
								class34.field483 = new class245();
								class34.field483.method1271(class524.field4197, class185.field1690, class38.field506, class319.field2584, field96, class331.field2634);
							}

							class162.field1528 = class453.field3532;
							field59 = class253.field2093;
						}
					} else {
						if (class253.field2093 == field59) {
							method248(10);
						}

					}
				}
			}
		}
	}

	@ObfInfo(name = "hw", desc = "(IZZZZI)Lnk;")
	static class505 method184(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class387 var6 = null;
		if (null != class519.field4152) {
			var6 = new class387(var0, class519.field4152, class104.field1009[var0], 1000000);
		}

		return new class505(var6, class60.field733, class176.field1623, var0, var1, var2, var3, var4);
	}

	@ObfInfo(name = "hp", desc = "(I)V")
	static void method170() {
		field92.method1826();
		field92.field2666.field2254 = 0;
		field92.field2662 = null;
		field92.field2667 = null;
		field92.field2673 = null;
		field92.field2674 = null;
		field92.field2668 = 0;
		field92.field2672 = 0;
		field47 = 0;
		method226();
		field280 = 0;
		field278 = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			field200[var1] = null;
		}

		class126.field1164 = null;

		for (var1 = 0; var1 < field87.length; ++var1) {
			class412 var2 = field87[var1];
			if (var2 != null) {
				var2.field1066 = -1;
				var2.field1036 = false;
			}
		}

		class23.method343();
		method248(30);

		for (var1 = 0; var1 < 100; ++var1) {
			field37[var1] = true;
		}

		method150();
	}

	@ObfInfo(name = "hs", desc = "(I)V")
	static final void method280() {
		field92.method1825();
		method162();
		class27.field448.method1056();

		for (int var1 = 0; var1 < 4; ++var1) {
			field102[var1].method526();
		}

		field266.method1628();
		System.gc();
		class333.method1815(0, 0);
		class265.method1388();
		field299 = false;
		class470.method2415();
		method248(10);
	}

	@ObfInfo(name = "hb", desc = "(I)J")
	static long method175() {
		return field157;
	}

	@ObfInfo(name = "hx", desc = "(I)V")
	static final void method162() {
		class102.method606();
		class541.field4288.method291();
		class145.method844();
		class243.method1264();
		class395.field3053.method291();
		class395.field3059.method291();
		class270.field2167.method291();
		class270.field2212.method291();
		class270.field2169.method291();
		class202.field1842.method291();
		class202.field1833.method291();
		class202.field1841.method291();
		class460.field3730.method291();
		class460.field3731.method291();
		class126.field1158.method291();
		class29.field468.method291();
		class508.field4090.method1390();
		class33.field482.method1390();
		class490.method2478();
		class468.field3774.method291();
		class468.field3775.method291();
		class12.field347.method291();
		class409.method2145();
		class185.field1669.method291();
		class96.method593();
		class360.method1974();
		field223.method291();
		field113.method291();
		class201.field1826.method291();
		class131.method759();
		((class458)class276.field2238.field4225).method2387();
		class333.field2641.method291();
		field318.method1868();
		class535.field4261.method2282();
		class514.field4108.method2282();
		class470.field3803.method2282();
		class310.field2523.method2282();
		class464.field3761.method2282();
		class323.field2609.method2282();
		class212.field1898.method2282();
		class429.field3253.method2282();
		class242.field2008.method2282();
		class237.field1983.method2282();
		class299.field2409.method2282();
		class454.field3714.method2282();
		class106.field1018.method2282();
	}

	@ObfInfo(name = "hc", desc = "(I)V")
	static final void method214() {
		if (field80 > 0) {
			method280();
		} else {
			field95.method2038();
			method248(40);
			class112.field1028 = field92.method1824();
			field92.method1823();
		}
	}

	@ObfInfo(name = "hm", desc = "(ZI)V")
	static final void method163(boolean var0) {
		if (var0) {
			field277 = class162.field1541 ? class365.field2835 : class365.field2834;
		} else {
			field277 = class281.field2262.method1762(class162.field1544) ? class365.field2838 : class365.field2841;
		}

	}

	@ObfInfo(name = "hn", desc = "(I)V")
	static final void method242() {
		if (class115.field1108 != null) {
			class115.field1108.method2241();
		}

	}

	@ObfInfo(name = "ib", desc = "(Lib;IIII)V")
	static void method194(class202 var0, int var1, int var2, int var3) {
		if (field282 < 50 && class281.field2262.method1772() != 0) {
			if (null != var0.field1834 && var1 < var0.field1834.length) {
				method134(var0.field1834[var1], var2, var3);
			}
		}
	}

	@ObfInfo(name = "il", desc = "(Lib;IIII)V")
	static void method202(class202 var0, int var1, int var2, int var3) {
		if (field282 < 50 && class281.field2262.method1772() != 0) {
			if (null != var0.field1848 && var0.field1848.containsKey(var1)) {
				method134((Integer)var0.field1848.get(var1), var2, var3);
			}
		}
	}

	@ObfInfo(name = "ig", desc = "(IIII)V")
	static void method134(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var4 = var0 >> 8;
			int var5 = var0 >> 4 & 7;
			int var6 = var0 & 15;
			field283[field282] = var4;
			field284[field282] = var5;
			field239[field282] = 0;
			field71[field282] = null;
			int var7 = (var1 - 64) / 128;
			int var8 = (var2 - 64) / 128;
			field34[field282] = (var7 << 16) + (var8 << 8) + var6;
			++field282;
		}
	}

	@ObfInfo(name = "ie", desc = "(IIII)V")
	static void method135(int var0, int var1, int var2) {
		if (class281.field2262.method1754() != 0 && var1 != 0 && field282 < 50) {
			field283[field282] = var0;
			field284[field282] = var1;
			field239[field282] = var2;
			field71[field282] = null;
			field34[field282] = 0;
			++field282;
		}

	}

	@ObfInfo(name = "iz", desc = "(II)V")
	static void method238(int var0) {
		if (var0 == -1 && !field299) {
			class333.method1815(0, 0);
		} else if (var0 != -1 && !class303.method1679(var0) && class281.field2262.method1746() != 0) {
			ArrayList var2 = new ArrayList();
			var2.add(new class503(class323.field2609, var0, 0, class281.field2262.method1746(), false));
			if (field299) {
				class303.field2448.clear();
				class303.field2448.addAll(var2);
				class303.method1683(0, 100, 100, 0);
			} else {
				class303.method1677(var2, 0, 100, 100, 0, false);
			}
		}

	}

	@ObfInfo(name = "io", desc = "(III)V")
	static void method151(int var0, int var1) {
		if (class281.field2262.method1746() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new class503(class299.field2409, var0, 0, class281.field2262.method1746(), false));
			class303.method1677(var3, 0, 0, 0, 0, true);
			field299 = true;
		}

	}

	@ObfInfo(name = "ij", desc = "(B)V")
	static final void method265() {
		if (class169.field1587) {
			for (int var1 = 0; var1 < class183.field1652; ++var1) {
				class439 var2 = field200[class183.field1653[var1]];
				var2.method2311();
			}

			class169.field1587 = false;
		}

	}

	@ObfInfo(name = "in", desc = "(I)V")
	static final void method197() {
		if (field273 != class401.field3120) {
			field273 = class401.field3120;
			method124(class401.field3120);
		}

	}

	@ObfInfo(name = "ih", desc = "(Lmi;III)V")
	static final void method257(class131 var0, int var1, int var2) {
		if (field280 == 0 || field280 == 3) {
			if (!field140 && (class166.field1574 == 1 || !class146.field1455 && class166.field1574 == 4)) {
				class356 var4 = var0.method723(true);
				if (var4 == null) {
					return;
				}

				int var5 = class166.field1575 - var1;
				int var6 = class166.field1576 - var2;
				if (var4.method1938(var5, var6)) {
					var5 -= var4.field2810 / 2;
					var6 -= var4.field2809 / 2;
					int var7 = field205 & 2047;
					int var8 = class276.field2236[var7];
					int var9 = class276.field2234[var7];
					int var10 = var9 * var5 + var8 * var6 >> 11;
					int var11 = var9 * var6 - var8 * var5 >> 11;
					int var12 = class126.field1164.field1061 + var10 >> 7;
					int var13 = class126.field1164.field1032 - var11 >> 7;
					class121 var14 = class121.method689(class480.field3868, field92.field2665);
					var14.field1141.method1481(18);
					var14.field1141.method1517(class265.field2147 + var12);
					var14.field1141.method1544(var13 + class508.field4092);
					var14.field1141.method1528(field175.method1783(82) ? (field175.method1783(81) ? 2 : 1) : 0);
					var14.field1141.method1481(var5);
					var14.field1141.method1481(var6);
					var14.field1141.method1522(field205);
					var14.field1141.method1481(57);
					var14.field1141.method1481(0);
					var14.field1141.method1481(0);
					var14.field1141.method1481(89);
					var14.field1141.method1522(class126.field1164.field1061);
					var14.field1141.method1522(class126.field1164.field1032);
					var14.field1141.method1481(63);
					field92.method1821(var14);
					field278 = var12;
					field201 = var13;
				}
			}

		}
	}

	@ObfInfo(name = "it", desc = "(I)V")
	static final void method222() {
		int[] var1 = class183.field1653;

		int var2;
		for (var2 = 0; var2 < class183.field1652; ++var2) {
			class439 var3 = field200[var1[var2]];
			if (var3 != null && var3.field1055 > 0) {
				--var3.field1055;
				if (var3.field1055 == 0) {
					var3.field1102 = null;
				}
			}
		}

		for (var2 = 0; var2 < field88; ++var2) {
			int var5 = field26[var2];
			class412 var4 = field87[var5];
			if (var4 != null && var4.field1055 > 0) {
				--var4.field1055;
				if (var4.field1055 == 0) {
					var4.field1102 = null;
				}
			}
		}

	}

	@ObfInfo(name = "ic", desc = "(IB)I")
	static final int method166(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfInfo(name = "iy", desc = "(IB)I")
	static final int method125(int var0) {
		return Math.abs(var0 - class181.field1636) > 1024 ? var0 + 2048 * (var0 < class181.field1636 ? 1 : -1) : var0;
	}

	@ObfInfo(name = "if", desc = "(IIIS)V")
	static final void method178(int var0, int var1, int var2) {
		if (class395.field3087 < var0) {
			class395.field3087 += class507.field4087 + class166.field1578 * (var0 - class395.field3087) / 1000;
			if (class395.field3087 > var0) {
				class395.field3087 = var0;
			}
		}

		if (class395.field3087 > var0) {
			class395.field3087 -= class507.field4087 + class166.field1578 * (class395.field3087 - var0) / 1000;
			if (class395.field3087 < var0) {
				class395.field3087 = var0;
			}
		}

		if (class374.field2888 < var1) {
			class374.field2888 += class507.field4087 + (var1 - class374.field2888) * class166.field1578 / 1000;
			if (class374.field2888 > var1) {
				class374.field2888 = var1;
			}
		}

		if (class374.field2888 > var1) {
			class374.field2888 -= (class374.field2888 - var1) * class166.field1578 / 1000 + class507.field4087;
			if (class374.field2888 < var1) {
				class374.field2888 = var1;
			}
		}

		if (class365.field2843 < var2) {
			class365.field2843 += class507.field4087 + (var2 - class365.field2843) * class166.field1578 / 1000;
			if (class365.field2843 > var2) {
				class365.field2843 = var2;
			}
		}

		if (class365.field2843 > var2) {
			class365.field2843 -= (class365.field2843 - var2) * class166.field1578 / 1000 + class507.field4087;
			if (class365.field2843 < var2) {
				class365.field2843 = var2;
			}
		}

	}

	@ObfInfo(name = "ii", desc = "(B)V")
	static final void method187() {
		int var1;
		int var2;
		int var3;
		if (!field289) {
			var1 = 64 + class183.field1648 * 128;
			var2 = class117.field1119 * 128 + 64;
			var3 = method131(var1, var2, class401.field3120) - class29.field471;
			method178(var1, var3, var2);
		} else if (null != field292) {
			class395.field3087 = field292.method304();
			class365.field2843 = field292.method305();
			if (field291) {
				class374.field2888 = field292.method306();
			} else {
				class374.field2888 = method131(class395.field3087, class365.field2843, class401.field3120) - field292.method306();
			}

			field292.method1190();
		}

		if (!field290) {
			var1 = 64 + class296.field2388 * 128;
			var2 = class126.field1161 * 128 + 64;
			var3 = method131(var1, var2, class401.field3120) - class21.field397;
			int var4 = var1 - class395.field3087;
			int var5 = var3 - class374.field2888;
			int var6 = var2 - class365.field2843;
			int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
			int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.9490051269531D) & 2047;
			int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.9490051269531D) & 2047;
			class484.method2453(var8, var9);
		} else {
			if (field109 != null) {
				class91.field926 = field109.method601();
				class91.field926 = Math.min(Math.max(class91.field926, 128), 383);
				field109.method1190();
			}

			if (field83 != null) {
				class181.field1636 = field83.method601() & 2047;
				field83.method1190();
			}
		}

	}

	@ObfInfo(name = "ix", desc = "(I)V")
	static final void method271() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (field120 == 0) {
			var1 = class126.field1164.field1061;
			var2 = class126.field1164.field1032;
			if (class47.field566 - var1 < -500 || class47.field566 - var1 > 500 || class401.field3122 - var2 < -500 || class401.field3122 - var2 > 500) {
				class47.field566 = var1;
				class401.field3122 = var2;
			}

			if (class47.field566 != var1) {
				class47.field566 += (var1 - class47.field566) / 16;
			}

			if (class401.field3122 != var2) {
				class401.field3122 += (var2 - class401.field3122) / 16;
			}

			var3 = class47.field566 >> 7;
			var4 = class401.field3122 >> 7;
			var5 = method131(class47.field566, class401.field3122, class401.field3120);
			var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = class401.field3120;
						if (var9 < 3 && (class411.field3174[1][var7][var8] & 2) == 2) {
							++var9;
						}

						int var10 = var5 - class411.field3172[var9][var7][var8];
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

			if (var7 > field169) {
				field169 += (var7 - field169) / 24;
			} else if (var7 < field169) {
				field169 += (var7 - field169) / 80;
			}

			class157.field1490 = method131(class126.field1164.field1061, class126.field1164.field1032, class401.field3120) - field121;
		} else if (field120 == 1) {
			method138();
			short var11 = -1;
			if (field175.method1783(33)) {
				var11 = 0;
			} else if (field175.method1783(49)) {
				var11 = 1024;
			}

			if (field175.method1783(48)) {
				if (var11 == 0) {
					var11 = 1792;
				} else if (var11 == 1024) {
					var11 = 1280;
				} else {
					var11 = 1536;
				}
			} else if (field175.method1783(50)) {
				if (var11 == 0) {
					var11 = 256;
				} else if (var11 == 1024) {
					var11 = 768;
				} else {
					var11 = 512;
				}
			}

			byte var12 = 0;
			if (field175.method1783(35)) {
				var12 = -1;
			} else if (field175.method1783(51)) {
				var12 = 1;
			}

			var3 = 0;
			if (var11 >= 0 || var12 != 0) {
				var3 = field175.method1783(81) ? field126 : field125;
				var3 *= 16;
				field123 = var11;
				field124 = var12;
			}

			if (field122 < var3) {
				field122 += var3 / 8;
				if (field122 > var3) {
					field122 = var3;
				}
			} else if (field122 > var3) {
				field122 = field122 * 9 / 10;
			}

			if (field122 > 0) {
				var4 = field122 / 16;
				if (field123 >= 0) {
					var1 = field123 - class181.field1636 & 2047;
					var5 = class276.field2236[var1];
					var6 = class276.field2234[var1];
					class47.field566 += var5 * var4 / 65536;
					class401.field3122 += var6 * var4 / 65536;
				}

				if (field124 != 0) {
					class157.field1490 += field124 * var4;
					if (class157.field1490 > 0) {
						class157.field1490 = 0;
					}
				}
			} else {
				field123 = -1;
				field124 = -1;
			}

			if (field175.method1783(13)) {
				method143();
			}
		}

		if (class166.field1570 == 4 && class146.field1455) {
			var1 = class166.field1563 - field183;
			field117 = var1 * 2;
			field183 = var1 != -1 && var1 != 1 ? (field183 + class166.field1563) / 2 : class166.field1563;
			var2 = field39 - class166.field1580;
			field116 = var2 * 2;
			field39 = var2 != -1 && var2 != 1 ? (class166.field1580 + field39) / 2 : class166.field1580;
		} else {
			if (field175.method1783(96)) {
				field116 += (-24 - field116) / 2;
			} else if (field175.method1783(97)) {
				field116 += (24 - field116) / 2;
			} else {
				field116 /= 2;
			}

			if (field175.method1783(98)) {
				field117 += (12 - field117) / 2;
			} else if (field175.method1783(99)) {
				field117 += (-12 - field117) / 2;
			} else {
				field117 /= 2;
			}

			field183 = class166.field1563;
			field39 = class166.field1580;
		}

		field205 = field116 / 2 + field205 & 2047;
		field66 += field117 / 2;
		if (field66 < 128) {
			field66 = 128;
		}

		if (field66 > 383) {
			field66 = 383;
		}

	}

	@ObfInfo(name = "im", desc = "(Ldr;II)V")
	static final void method243(class114 var0, int var1) {
		if (var0.field1087 >= field330) {
			method249(var0);
		} else {
			int var5;
			int var6;
			int var8;
			int var9;
			int var13;
			if (var0.field1088 >= field330) {
				boolean var3 = field330 == var0.field1088 || var0.field1076 == -1 || var0.field1093 != 0;
				if (!var3) {
					class202 var4 = class202.method1149(var0.field1076);
					if (var4 != null && !var4.method1148()) {
						var3 = var0.field1078 + 1 > var4.field1850[var0.field1077];
					} else {
						var3 = true;
					}
				}

				if (var3) {
					var13 = var0.field1088 - var0.field1087;
					var5 = field330 - var0.field1087;
					var6 = var0.field1035 * 64 + var0.field1083 * 128;
					int var7 = var0.field1035 * 64 + var0.field1085 * 128;
					var8 = var0.field1081 * 128 + var0.field1035 * 64;
					var9 = var0.field1035 * 64 + var0.field1051 * 128;
					var0.field1061 = ((var13 - var5) * var6 + var5 * var8) / var13;
					var0.field1032 = (var5 * var9 + var7 * (var13 - var5)) / var13;
				}

				var0.field1105 = 0;
				var0.field1072 = var0.field1089;
				var0.field1033 = var0.field1072;
			} else {
				var0.field1044 = var0.field1037;
				if (var0.field1079 == 0) {
					var0.field1105 = 0;
				} else {
					label297: {
						if (var0.field1076 != -1 && var0.field1093 == 0) {
							class202 var12 = class202.method1149(var0.field1076);
							if (var0.field1095 > 0 && var12.field1852 == 0) {
								++var0.field1105;
								break label297;
							}

							if (var0.field1095 <= 0 && var12.field1853 == 0) {
								++var0.field1105;
								break label297;
							}
						}

						int var14 = var0.field1061;
						var13 = var0.field1032;
						var5 = 128 * var0.field1106[var0.field1079 - 1] + var0.field1035 * 64;
						var6 = var0.field1035 * 64 + 128 * var0.field1103[var0.field1079 - 1];
						if (var14 < var5) {
							if (var13 < var6) {
								var0.field1072 = 1280;
							} else if (var13 > var6) {
								var0.field1072 = 1792;
							} else {
								var0.field1072 = 1536;
							}
						} else if (var14 > var5) {
							if (var13 < var6) {
								var0.field1072 = 768;
							} else if (var13 > var6) {
								var0.field1072 = 256;
							} else {
								var0.field1072 = 512;
							}
						} else if (var13 < var6) {
							var0.field1072 = 1024;
						} else if (var13 > var6) {
							var0.field1072 = 0;
						}

						class386 var15 = var0.field1104[var0.field1079 - 1];
						if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
							var8 = var0.field1072 - var0.field1033 & 2047;
							if (var8 > 1024) {
								var8 -= 2048;
							}

							var9 = var0.field1041;
							if (var8 >= -256 && var8 <= 256) {
								var9 = var0.field1040;
							} else if (var8 >= 256 && var8 < 768) {
								var9 = var0.field1090;
							} else if (var8 >= -768 && var8 <= -256) {
								var9 = var0.field1042;
							}

							if (var9 == -1) {
								var9 = var0.field1040;
							}

							var0.field1044 = var9;
							int var10 = 4;
							boolean var11 = true;
							if (var0 instanceof class412) {
								var11 = ((class412)var0).field3178.field3050;
							}

							if (var11) {
								if (var0.field1072 != var0.field1033 && var0.field1066 == -1 && var0.field1100 != 0) {
									var10 = 2;
								}

								if (var0.field1079 > 2) {
									var10 = 6;
								}

								if (var0.field1079 > 3) {
									var10 = 8;
								}

								if (var0.field1105 > 0 && var0.field1079 > 1) {
									var10 = 8;
									--var0.field1105;
								}
							} else {
								if (var0.field1079 > 1) {
									var10 = 6;
								}

								if (var0.field1079 > 2) {
									var10 = 8;
								}

								if (var0.field1105 > 0 && var0.field1079 > 1) {
									var10 = 8;
									--var0.field1105;
								}
							}

							if (var15 == class386.field3026) {
								var10 <<= 1;
							} else if (var15 == class386.field3025) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var0.field1044 == var0.field1040 && var0.field1101 != -1) {
									var0.field1044 = var0.field1101;
								} else if (var0.field1041 == var0.field1044 && var0.field1045 != -1) {
									var0.field1044 = var0.field1045;
								} else if (var0.field1044 == var0.field1042 && var0.field1086 != -1) {
									var0.field1044 = var0.field1086;
								} else if (var0.field1090 == var0.field1044 && var0.field1047 != -1) {
									var0.field1044 = var0.field1047;
								}
							} else if (var10 <= 2) {
								if (var0.field1044 == var0.field1040 && var0.field1048 != -1) {
									var0.field1044 = var0.field1048;
								} else if (var0.field1044 == var0.field1041 && var0.field1049 != -1) {
									var0.field1044 = var0.field1049;
								} else if (var0.field1042 == var0.field1044 && var0.field1050 != -1) {
									var0.field1044 = var0.field1050;
								} else if (var0.field1090 == var0.field1044 && var0.field1080 != -1) {
									var0.field1044 = var0.field1080;
								}
							}

							if (var5 != var14 || var6 != var13) {
								if (var14 < var5) {
									var0.field1061 += var10;
									if (var0.field1061 > var5) {
										var0.field1061 = var5;
									}
								} else if (var14 > var5) {
									var0.field1061 -= var10;
									if (var0.field1061 < var5) {
										var0.field1061 = var5;
									}
								}

								if (var13 < var6) {
									var0.field1032 += var10;
									if (var0.field1032 > var6) {
										var0.field1032 = var6;
									}
								} else if (var13 > var6) {
									var0.field1032 -= var10;
									if (var0.field1032 < var6) {
										var0.field1032 = var6;
									}
								}
							}

							if (var5 == var0.field1061 && var0.field1032 == var6) {
								--var0.field1079;
								if (var0.field1095 > 0) {
									--var0.field1095;
								}
							}
						} else {
							var0.field1061 = var5;
							var0.field1032 = var6;
							--var0.field1079;
							if (var0.field1095 > 0) {
								--var0.field1095;
							}
						}
					}
				}
			}
		}

		if (var0.field1061 < 128 || var0.field1032 < 128 || var0.field1061 >= 13184 || var0.field1032 >= 13184) {
			var0.field1076 = -1;
			var0.field1087 = 0;
			var0.field1088 = 0;
			var0.method642();
			var0.field1061 = 128 * var0.field1106[0] + var0.field1035 * 64;
			var0.field1032 = var0.field1103[0] * 128 + var0.field1035 * 64;
			var0.method635();
		}

		if (var0 == class126.field1164 && (var0.field1061 < 1536 || var0.field1032 < 1536 || var0.field1061 >= 11776 || var0.field1032 >= 11776)) {
			var0.field1076 = -1;
			var0.field1087 = 0;
			var0.field1088 = 0;
			var0.method642();
			var0.field1061 = 128 * var0.field1106[0] + var0.field1035 * 64;
			var0.field1032 = var0.field1103[0] * 128 + var0.field1035 * 64;
			var0.method635();
		}

		class524.method2557(var0);
		class402.method2123(var0);
	}

	@ObfInfo(name = "id", desc = "(Ldr;I)V")
	static final void method249(class114 var0) {
		int var2 = Math.max(1, var0.field1087 - field330);
		int var3 = var0.field1083 * 128 + var0.field1035 * 64;
		int var4 = var0.field1035 * 64 + var0.field1085 * 128;
		var0.field1061 += (var3 - var0.field1061) / var2;
		var0.field1032 += (var4 - var0.field1032) / var2;
		var0.field1105 = 0;
		var0.field1072 = var0.field1089;
	}

	@ObfInfo(name = "ip", desc = "(I)V")
	static void method237() {
		if (null != class34.field483) {
			class34.field483.method1277(class401.field3120, class265.field2147 + (class126.field1164.field1061 >> 7), class508.field4092 + (class126.field1164.field1032 >> 7), false);
			class34.field483.method1293();
		}

	}

	@ObfInfo(name = "ik", desc = "(Ldf;III)V")
	static void method282(class439 var0, int var1, int var2) {
		if (var1 == var0.field1076 && var1 != -1) {
			int var4 = class202.method1149(var1).field1854;
			if (var4 == 1) {
				var0.field1077 = 0;
				var0.field1078 = 0;
				var0.field1093 = var2;
				var0.field1058 = 0;
			}

			if (var4 == 2) {
				var0.field1058 = 0;
			}
		} else if (var1 == -1 || var0.field1076 == -1 || class202.method1149(var1).field1847 >= class202.method1149(var0.field1076).field1847) {
			var0.field1076 = var1;
			var0.field1077 = 0;
			var0.field1078 = 0;
			var0.field1093 = var2;
			var0.field1058 = 0;
			var0.field1095 = var0.field1079;
		}

	}

	@ObfInfo(name = "iq", desc = "(I)I")
	static int method212() {
		return field258 ? 2 : 1;
	}

	@ObfInfo(name = "jn", desc = "(B)V")
	static void method150() {
		class121 var1 = class121.method689(class480.field3917, field92.field2665);
		var1.field1141.method1481(method212());
		var1.field1141.method1522(class537.field4270);
		var1.field1141.method1522(class396.field3101);
		field92.method1821(var1);
	}

	@ObfInfo(name = "je", desc = "(Ljava/lang/String;ZB)V")
	static final void method269(String var0, boolean var1) {
		if (field153) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = class256.field2112.method1669(var0, 250);
			int var7 = class256.field2112.method1648(var0, 250) * 13;
			class83.method542(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
			class83.method545(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
			class256.field2112.method1645(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			int var8 = var4 - var3;
			int var9 = var5 - var3;
			int var10 = var3 + var6 + var3;
			int var11 = var3 + var7 + var3;

			for (int var12 = 0; var12 < field198; ++var12) {
				if (field252[var12] + field254[var12] > var8 && field252[var12] < var10 + var8 && field253[var12] + field255[var12] > var9 && field253[var12] < var11 + var9) {
					field37[var12] = true;
				}
			}

			if (var1) {
				class535.field4266.method2449(0, 0);
			} else {
				method123(var4, var5, var6, var7);
			}

		}
	}

	@ObfInfo(name = "jr", desc = "(IIIII)V")
	static final void method188(int var0, int var1, int var2, int var3) {
		++field197;
		if (field278 == class126.field1164.field1061 >> 7 && field201 == class126.field1164.field1032 >> 7) {
			field278 = 0;
		}

		method219();
		method161();
		method228(true);
		method192();
		method228(false);

		int var7;
		for (class351 var5 = (class351)field154.method627(); null != var5; var5 = (class351)field154.method629()) {
			if (var5.field2768 == class401.field3120 && field330 <= var5.field2777) {
				if (field330 >= var5.field2792) {
					class412 var6;
					class439 var38;
					if (!var5.field2769 && var5.field2783 != 0) {
						if (var5.field2783 > 0) {
							var6 = field87[var5.field2783 - 1];
							if (null != var6 && var6.field1061 >= 0 && var6.field1061 < 13312 && var6.field1032 >= 0 && var6.field1032 < 13312) {
								var5.field2778 = var6.field1061;
								var5.field2767 = var6.field1032;
								var5.method1929(var5.field2773, var5.field2774, var5.field2775, field330);
							}
						} else {
							var7 = -var5.field2783 - 1;
							if (field155 == var7) {
								var38 = class126.field1164;
							} else {
								var38 = field200[var7];
							}

							if (var38 != null && var38.field1061 >= 0 && var38.field1061 < 13312 && var38.field1032 >= 0 && var38.field1032 < 13312) {
								var5.field2778 = var38.field1061;
								var5.field2767 = var38.field1032;
								var5.method1929(var5.field2773, var5.field2774, var5.field2775, field330);
							}
						}
					}

					if (var5.field2781 > 0) {
						var6 = field87[var5.field2781 - 1];
						if (var6 != null && var6.field1061 >= 0 && var6.field1061 < 13312 && var6.field1032 >= 0 && var6.field1032 < 13312) {
							var5.method1929(var6.field1061, var6.field1032, method131(var6.field1061, var6.field1032, var5.field2768) - var5.field2772, field330);
						}
					}

					if (var5.field2781 < 0) {
						var7 = -var5.field2781 - 1;
						if (var7 == field155) {
							var38 = class126.field1164;
						} else {
							var38 = field200[var7];
						}

						if (null != var38 && var38.field1061 >= 0 && var38.field1061 < 13312 && var38.field1032 >= 0 && var38.field1032 < 13312) {
							var5.method1929(var38.field1061, var38.field1032, method131(var38.field1061, var38.field1032, var5.field2768) - var5.field2772, field330);
						}
					}

					var5.method1930(field106);
					class27.field448.method1064(class401.field3120, (int)var5.field2791, (int)var5.field2784, (int)var5.field2785, 60, var5, var5.field2771, -1L, false);
				}
			} else {
				var5.method907();
			}
		}

		class427.method2224();
		class151.method882(var0, var1, var2, var3, true);
		var0 = field308;
		var1 = field309;
		var2 = field243;
		var3 = field118;
		class83.method549(var0, var1, var2 + var0, var1 + var3);
		class276.method1453();
		class83.method551();
		int var37 = field66;
		if (field169 / 256 > var37) {
			var37 = field169 / 256;
		}

		if (field295[4] && field249[4] + 128 > var37) {
			var37 = field249[4] + 128;
		}

		int var39 = field205 & 2047;
		var7 = class47.field566;
		int var8 = class157.field1490;
		int var9 = class401.field3122;
		int var10 = method204(var37);
		int var12 = var3 - 334;
		if (var12 < 0) {
			var12 = 0;
		} else if (var12 > 100) {
			var12 = 100;
		}

		int var13 = field302 + (field303 - field302) * var12 / 100;
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
			var17 = class276.field2236[var12];
			var18 = class276.field2234[var12];
			var19 = var18 * var15 - var17 * var11 >> 16;
			var16 = var18 * var11 + var17 * var15 >> 16;
			var15 = var19;
		}

		if (var13 != 0) {
			var17 = class276.field2236[var13];
			var18 = class276.field2234[var13];
			var19 = var17 * var16 + var14 * var18 >> 16;
			var16 = var18 * var16 - var14 * var17 >> 16;
			var14 = var19;
		}

		if (field288) {
			class517.field4146 = var7 - var14;
			class171.field1589 = var8 - var15;
			class341.field2698 = var9 - var16;
			class110.field1024 = var37;
			class139.field1419 = var39;
		} else {
			class395.field3087 = var7 - var14;
			class374.field2888 = var8 - var15;
			class365.field2843 = var9 - var16;
			class91.field926 = var37;
			class181.field1636 = var39;
		}

		if (field120 == 1 && field115 >= 2 && field330 % 50 == 0 && (class126.field1164.field1061 >> 7 != class47.field566 >> 7 || class401.field3122 >> 7 != class126.field1164.field1032 >> 7)) {
			var17 = class126.field1164.field3319;
			var18 = (class47.field566 >> 7) + class265.field2147;
			var19 = class508.field4092 + (class401.field3122 >> 7);
			method164(var18, var19, var17, true);
		}

		int var21;
		if (!field288) {
			if (class281.field2262.method1745()) {
				var12 = class401.field3120;
			} else {
				label554: {
					var13 = 3;
					if (class91.field926 < 310) {
						label546: {
							if (field120 == 1) {
								var14 = class47.field566 >> 7;
								var15 = class401.field3122 >> 7;
							} else {
								var14 = class126.field1164.field1061 >> 7;
								var15 = class126.field1164.field1032 >> 7;
							}

							var16 = class395.field3087 >> 7;
							var17 = class365.field2843 >> 7;
							if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
								if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
									if ((class411.field3174[class401.field3120][var16][var17] & 4) != 0) {
										var13 = class401.field3120;
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

											if ((class411.field3174[class401.field3120][var16][var17] & 4) != 0) {
												var13 = class401.field3120;
											}

											var21 += var20;
											if (var21 >= 65536) {
												var21 -= 65536;
												if (var17 < var15) {
													++var17;
												} else if (var17 > var15) {
													--var17;
												}

												if ((class411.field3174[class401.field3120][var16][var17] & 4) != 0) {
													var13 = class401.field3120;
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

												if ((class411.field3174[class401.field3120][var16][var17] & 4) != 0) {
													var13 = class401.field3120;
												}

												var21 += var20;
												if (var21 >= 65536) {
													var21 -= 65536;
													if (var16 < var14) {
														++var16;
													} else if (var16 > var14) {
														--var16;
													}

													if ((class411.field3174[class401.field3120][var16][var17] & 4) != 0) {
														var13 = class401.field3120;
													}
												}
											}
										}
										break label546;
									}
								}

								var12 = class401.field3120;
								break label554;
							}

							var12 = class401.field3120;
							break label554;
						}
					}

					if (class126.field1164.field1061 >= 0 && class126.field1164.field1032 >= 0 && class126.field1164.field1061 < 13312 && class126.field1164.field1032 < 13312) {
						if ((class411.field3174[class401.field3120][class126.field1164.field1061 >> 7][class126.field1164.field1032 >> 7] & 4) != 0) {
							var13 = class401.field3120;
						}

						var12 = var13;
					} else {
						var12 = class401.field3120;
					}
				}
			}

			var11 = var12;
		} else {
			var11 = method205();
		}

		var12 = class395.field3087;
		var13 = class374.field2888;
		var14 = class365.field2843;
		var15 = class91.field926;
		var16 = class181.field1636;

		for (var17 = 0; var17 < 5; ++var17) {
			if (field295[var17]) {
				var18 = (int)(Math.random() * (double)(field89[var17] * 2 + 1) - (double)field89[var17] + Math.sin((double)field159[var17] / 100.0D * (double)field245[var17]) * (double)field249[var17]);
				if (var17 == 0) {
					class395.field3087 += var18;
				}

				if (var17 == 1) {
					class374.field2888 += var18;
				}

				if (var17 == 2) {
					class365.field2843 += var18;
				}

				if (var17 == 3) {
					class181.field1636 = class181.field1636 + var18 & 2047;
				}

				if (var17 == 4) {
					class91.field926 += var18;
					if (class91.field926 < 128) {
						class91.field926 = 128;
					}

					if (class91.field926 > 383) {
						class91.field926 = 383;
					}
				}
			}
		}

		var17 = class166.field1580;
		var18 = class166.field1563;
		if (class166.field1574 != 0) {
			var17 = class166.field1575;
			var18 = class166.field1576;
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
			class487.method2462(var17 - var0, var18 - var1);
		} else {
			class487.method2463();
		}

		method242();
		class83.method542(var0, var1, var2, var3, 0);
		method242();
		var19 = class276.method1450();
		class276.method1454(class51.field585.field2730);
		class276.field2238.field4226 = field312;
		class27.field448.method1084(class395.field3087, class374.field2888, class365.field2843, class91.field926, class181.field1636, var11);
		class276.method1454(false);
		if (field91) {
			class83.method552();
		}

		class276.field2238.field4226 = var19;
		method242();
		class27.field448.method1103();
		field132 = 0;
		boolean var40 = false;
		var21 = -1;
		int var22 = -1;
		int var23 = class183.field1652;
		int[] var24 = class183.field1653;

		int var25;
		for (var25 = 0; var25 < field88 + var23; ++var25) {
			Object var26;
			if (var25 < var23) {
				var26 = field200[var24[var25]];
				if (field166 == var24[var25]) {
					var40 = true;
					var21 = var25;
					continue;
				}

				if (var26 == class126.field1164) {
					var22 = var25;
					continue;
				}
			} else {
				var26 = field87[field26[var25 - var23]];
			}

			class429.method2243((class114)var26, var25, var0, var1, var2, var3, (byte)-53);
		}

		if (field265 && var22 != -1) {
			class429.method2243(class126.field1164, var22, var0, var1, var2, var3, (byte)1);
		}

		if (var40) {
			class429.method2243(field200[field166], var21, var0, var1, var2, var3, (byte)56);
		}

		for (var25 = 0; var25 < field132; ++var25) {
			int var41 = field134[var25];
			int var27 = field135[var25];
			int var28 = field311[var25];
			int var29 = field86[var25];
			boolean var30 = true;

			while (var30) {
				var30 = false;

				for (int var31 = 0; var31 < var25; ++var31) {
					if (var27 + 2 > field135[var31] - field86[var31] && var27 - var29 < 2 + field135[var31] && var41 - var28 < field311[var31] + field134[var31] && var41 + var28 > field134[var31] - field311[var31] && field135[var31] - field86[var31] < var27) {
						var27 = field135[var31] - field86[var31];
						var30 = true;
					}
				}
			}

			field145 = field134[var25];
			field146 = field135[var25] = var27;
			String var42 = field142[var25];
			if (field203 == 0) {
				int var32 = 16776960;
				if (field138[var25] < 6) {
					var32 = field259[field138[var25]];
				}

				if (field138[var25] == 6) {
					var32 = field197 % 20 < 10 ? 16711680 : 16776960;
				}

				if (field138[var25] == 7) {
					var32 = field197 % 20 < 10 ? 255 : '\uffff';
				}

				if (field138[var25] == 8) {
					var32 = field197 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var33;
				if (field138[var25] == 9) {
					var33 = 150 - field287[var25];
					if (var33 < 50) {
						var32 = 16711680 + var33 * 1280;
					} else if (var33 < 100) {
						var32 = 16776960 - 327680 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = 65280 + 5 * (var33 - 100);
					}
				}

				if (field138[var25] == 10) {
					var33 = 150 - field287[var25];
					if (var33 < 50) {
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) {
						var32 = 16711935 - 327680 * (var33 - 50);
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}

				if (field138[var25] == 11) {
					var33 = 150 - field287[var25];
					if (var33 < 50) {
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) {
						var32 = 65280 + (var33 - 50) * 327685;
					} else if (var33 < 150) {
						var32 = 16777215 - 327680 * (var33 - 100);
					}
				}

				int var34;
				if (field138[var25] == 12 && field36[var25] == null) {
					var33 = var42.length();
					field36[var25] = new int[var33];

					for (var34 = 0; var34 < var33; ++var34) {
						int var35 = (int)(64.0F * ((float)var34 / (float)var33));
						int var36 = var35 << 10 | 896 | 64;
						field36[var25][var34] = class285.field2273[var36];
					}
				}

				if (field139[var25] == 0) {
					class319.field2584.method1657(var42, var0 + field145, field146 + var1, var32, 0, field36[var25]);
				}

				if (field139[var25] == 1) {
					class319.field2584.method1668(var42, field145 + var0, field146 + var1, var32, 0, field197, field36[var25]);
				}

				if (field139[var25] == 2) {
					class319.field2584.method1656(var42, field145 + var0, var1 + field146, var32, 0, field197, field36[var25]);
				}

				if (field139[var25] == 3) {
					class319.field2584.method1670(var42, var0 + field145, field146 + var1, var32, 0, field197, 150 - field287[var25], field36[var25]);
				}

				if (field139[var25] == 4) {
					var33 = (150 - field287[var25]) * (class319.field2584.method1646(var42) + 100) / 150;
					class83.method555(field145 + var0 - 50, var1, field145 + var0 + 50, var1 + var3);
					class319.field2584.method1671(var42, 50 + var0 + field145 - var33, var1 + field146, var32, 0, field36[var25]);
					class83.method549(var0, var1, var2 + var0, var1 + var3);
				}

				if (field139[var25] == 5) {
					var33 = 150 - field287[var25];
					var34 = 0;
					if (var33 < 25) {
						var34 = var33 - 25;
					} else if (var33 > 125) {
						var34 = var33 - 125;
					}

					class83.method555(var0, field146 + var1 - class319.field2584.field2414 - 1, var0 + var2, 5 + field146 + var1);
					class319.field2584.method1657(var42, var0 + field145, var1 + field146 + var34, var32, 0, field36[var25]);
					class83.method549(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class319.field2584.method1653(var42, var0 + field145, field146 + var1, 16776960, 0);
			}
		}

		method154(var0, var1);
		((class458)class276.field2238.field4225).method2386(field106);
		method191(var0, var1, var2, var3);
		class395.field3087 = var12;
		class374.field2888 = var13;
		class365.field2843 = var14;
		class91.field926 = var15;
		class181.field1636 = var16;
		if (field40 && class176.field1623.method437(true, false) == 0) {
			field40 = false;
		}

		if (field40) {
			class83.method542(var0, var1, var2, var3, 0);
			method269(class453.field3408, false);
		}

	}

	@ObfInfo(name = "ja", desc = "(I)V")
	static void method219() {
		if (field265) {
			class253.method1345(class126.field1164, false);
		}

	}

	@ObfInfo(name = "jg", desc = "(B)V")
	static void method161() {
		if (field166 >= 0 && null != field200[field166]) {
			class253.method1345(field200[field166], false);
		}

	}

	@ObfInfo(name = "ji", desc = "(I)V")
	static void method192() {
		int var1 = class183.field1652;
		int[] var2 = class183.field1653;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != field166 && field155 != var2[var3]) {
				class253.method1345(field200[var2[var3]], true);
			}
		}

	}

	@ObfInfo(name = "jj", desc = "(ZB)V")
	static final void method228(boolean var0) {
		for (int var2 = 0; var2 < field88; ++var2) {
			class412 var3 = field87[field26[var2]];
			if (null != var3 && var3.method634() && var0 == var3.field3178.field3083 && var3.field3178.method2103()) {
				int var4 = var3.field1061 >> 7;
				int var5 = var3.field1032 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var3.field1035 == 1 && (var3.field1061 & 127) == 64 && (var3.field1032 & 127) == 64) {
						if (field143[var4][var5] == field197) {
							continue;
						}

						field143[var4][var5] = field197;
					}

					long var6 = class487.method2467(0, 0, 1, !var3.field3178.field3090, field26[var2]);
					var3.field1067 = field330;
					class27.field448.method1064(class401.field3120, var3.field1061, var3.field1032, method131(var3.field1035 * 64 - 64 + var3.field1061, var3.field1035 * 64 - 64 + var3.field1032, class401.field3120), var3.field1035 * 64 - 64 + 60, var3, var3.field1033, var6, var3.field1039);
				}
			}
		}

	}

	@ObfInfo(name = "jo", desc = "(I)I")
	static final int method205() {
		if (class281.field2262.method1745()) {
			return class401.field3120;
		} else {
			int var1 = method131(class395.field3087, class365.field2843, class401.field3120);
			return var1 - class374.field2888 < 800 && (class411.field3174[class401.field3120][class395.field3087 >> 7][class365.field2843 >> 7] & 4) != 0 ? class401.field3120 : 3;
		}
	}

	@ObfInfo(name = "js", desc = "(III)V")
	static final void method154(int var0, int var1) {
		if (field105 == 2) {
			method158(field214 + (field51 - class265.field2147 << 7), field247 + (field194 - class508.field4092 << 7), field58 * 2);
			if (field145 > -1 && field330 % 20 < 10) {
				class74.field799[0].method877(field145 + var0 - 12, var1 + field146 - 28);
			}

		}
	}

	@ObfInfo(name = "jw", desc = "(I)Low;")
	public static class113 method140() {
		return field242;
	}

	@ObfInfo(name = "jy", desc = "(B)V")
	static void method284() {
		for (class498 var1 = (class498)field281.method627(); var1 != null; var1 = (class498)field281.method629()) {
			var1.method907();
		}

	}

	@ObfInfo(name = "jx", desc = "(Lie;S)V")
	static void method200(class498 var0) {
		if (null != var0 && var0.field4033 != null) {
			if (var0.field4033.field1333 >= 0) {
				class131 var2 = class131.method756(var0.field4033.field1231);
				if (null == var2 || null == var2.field1346 || var2.field1346.length == 0 || var0.field4033.field1333 >= var2.field1346.length || var2.field1346[var0.field4033.field1333] != var0.field4033) {
					return;
				}
			}

			if (var0.field4033.field1216 == 11 && var0.field4030 == 0) {
				if (var0.field4033.method729(var0.field4031, var0.field4032, 0, 0)) {
					switch(var0.field4033.method732()) {
					case 0:
						class341.method1876(var0.field4033.method734(), true, false);
						break;
					case 1:
						int var3 = method209(var0.field4033);
						boolean var7 = (var3 >> 22 & 1) != 0;
						if (var7) {
							int[] var4 = var0.field4033.method741();
							if (null != var4) {
								class121 var5 = class121.method689(class480.field3844, field92.field2665);
								var5.field1141.method1529(var4[1]);
								var5.field1141.method1530(var0.field4033.field1214);
								var5.field1141.method1550(var0.field4033.field1333);
								var5.field1141.method1547(var0.field4033.method733());
								var5.field1141.method1530(var4[2]);
								var5.field1141.method1530(var4[0]);
								field92.method1821(var5);
							}
						}
					}
				}
			} else if (var0.field4033.field1216 == 12) {
				class4 var6 = var0.field4033.method751();
				if (null != var6 && var6.method46()) {
					switch(var0.field4030) {
					case 0:
						field266.method1629(var0.field4033);
						var6.method7(true);
						var6.method82(var0.field4031, var0.field4032, field175.method1783(82), field175.method1783(81));
						break;
					case 1:
						var6.method65(var0.field4031, var0.field4032);
					}
				}
			}

		}
	}

	@ObfInfo(name = "ju", desc = "(B)Z")
	static boolean method168() {
		return (field30 & 4) != 0;
	}

	@ObfInfo(name = "jb", desc = "(I)Z")
	static boolean method176() {
		return (field30 & 2) != 0;
	}

	@ObfInfo(name = "jz", desc = "(Ldf;I)Z")
	static boolean method224(class439 var0) {
		if (field30 == 0) {
			return false;
		} else {
			boolean var2;
			if (class126.field1164 == var0) {
				var2 = (field30 & 8) != 0;
				return var2;
			} else {
				var2 = method168();
				if (!var2) {
					boolean var3 = (field30 & 1) != 0;
					var2 = var3 && var0.method2298();
				}

				return var2 || method176() && var0.method2301();
			}
		}
	}

	@ObfInfo(name = "jf", desc = "(IIIII)V")
	static final void method191(int var0, int var1, int var2, int var3) {
		field152 = 0;
		int var5 = (class126.field1164.field1061 >> 7) + class265.field2147;
		int var6 = class508.field4092 + (class126.field1164.field1032 >> 7);
		if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
			field152 = 1;
		}

		if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
			field152 = 1;
		}

		if (field152 == 1 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
			field152 = 0;
		}

	}

	@ObfInfo(name = "jm", desc = "(Ldr;II)V")
	static final void method145(class114 var0, int var1) {
		method158(var0.field1061, var0.field1032, var1);
	}

	@ObfInfo(name = "jd", desc = "(IIII)V")
	static final void method158(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = method131(var0, var1, class401.field3120) - var2;
			var0 -= class395.field3087;
			var4 -= class374.field2888;
			var1 -= class365.field2843;
			int var5 = class276.field2236[class91.field926];
			int var6 = class276.field2234[class91.field926];
			int var7 = class276.field2236[class181.field1636];
			int var8 = class276.field2234[class181.field1636];
			int var9 = var0 * var8 + var1 * var7 >> 16;
			var1 = var1 * var8 - var7 * var0 >> 16;
			var0 = var9;
			var9 = var6 * var4 - var5 * var1 >> 16;
			var1 = var1 * var6 + var4 * var5 >> 16;
			if (var1 >= 50) {
				field145 = var0 * field312 / var1 + field243 / 2;
				field146 = field312 * var9 / var1 + field118 / 2;
			} else {
				field145 = -1;
				field146 = -1;
			}

		} else {
			field145 = -1;
			field146 = -1;
		}
	}

	@ObfInfo(name = "jh", desc = "(IIII)I")
	static final int method131(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && (class411.field3174[1][var4][var5] & 2) == 2) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = class411.field3172[var6][var4 + 1][var5] * var7 + (128 - var7) * class411.field3172[var6][var4][var5] >> 7;
			int var10 = (128 - var7) * class411.field3172[var6][var4][var5 + 1] + class411.field3172[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return var10 * var8 + (128 - var8) * var9 >> 7;
		} else {
			return 0;
		}
	}

	@ObfInfo(name = "kb", desc = "(ZLto;I)V")
	static final void method233(boolean var0, class259 var1) {
		field103 = var0;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!field103) {
			int var3 = var1.method1541();
			var4 = var1.method1521();
			var5 = var1.method1541();
			class348.field2759 = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class348.field2759[var6][var7] = var1.method1496();
				}
			}

			class2.field4 = new int[var5];
			class319.field2585 = new int[var5];
			class146.field1452 = new int[var5];
			class402.field3124 = new byte[var5][];
			class132.field1367 = new byte[var5][];
			var5 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					class2.field4[var5] = var8;
					class319.field2585[var5] = class464.field3761.method2292("m" + var6 + "_" + var7);
					class146.field1452[var5] = class464.field3761.method2292("l" + var6 + "_" + var7);
					++var5;
				}
			}

			method244(var3, var4, true);
		} else {
			boolean var16 = var1.method1492() == 1;
			var4 = var1.method1541();
			var5 = var1.method1541();
			var6 = var1.method1541();
			var1.method1361();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method1359(1);
						if (var10 == 1) {
							field104[var7][var8][var9] = var1.method1359(26);
						} else {
							field104[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.method1362();
			class348.field2759 = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					class348.field2759[var7][var8] = var1.method1496();
				}
			}

			class2.field4 = new int[var6];
			class319.field2585 = new int[var6];
			class146.field1452 = new int[var6];
			class402.field3124 = new byte[var6][];
			class132.field1367 = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = field104[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (class2.field4[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								class2.field4[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								class319.field2585[var6] = class464.field3761.method2292("m" + var14 + "_" + var15);
								class146.field1452[var6] = class464.field3761.method2292("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			method244(var5, var4, !var16);
		}

	}

	@ObfInfo(name = "kt", desc = "(IIZB)V")
	static final void method244(int var0, int var1, boolean var2) {
		if (!var2 || class411.field3162 != var0 || class334.field2657 != var1) {
			class411.field3162 = var0;
			class334.field2657 = var1;
			method248(25);
			method269(class453.field3408, true);
			int var4 = class265.field2147;
			int var5 = class508.field4092;
			class265.field2147 = (var0 - 6) * 8;
			class508.field4092 = (var1 - 6) * 8;
			int var6 = class265.field2147 - var4;
			int var7 = class508.field4092 - var5;
			var4 = class265.field2147;
			var5 = class508.field4092;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class412 var9 = field87[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field1106;
						var10000[var10] -= var6;
						var10000 = var9.field1103;
						var10000[var10] -= var7;
					}

					var9.field1061 -= var6 * 128;
					var9.field1032 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				class439 var20 = field200[var8];
				if (null != var20) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var20.field1106;
						var10000[var10] -= var6;
						var10000 = var20.field1103;
						var10000[var10] -= var7;
					}

					var20.field1061 -= var6 * 128;
					var20.field1032 -= var7 * 128;
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
							field167[var18][var14][var15] = field167[var18][var16][var17];
						} else {
							field167[var18][var14][var15] = null;
						}
					}
				}
			}

			for (class296 var23 = (class296)field168.method627(); null != var23; var23 = (class296)field168.method629()) {
				var23.field2394 -= var6;
				var23.field2400 -= var7;
				if (var23.field2394 < 0 || var23.field2400 < 0 || var23.field2394 >= 104 || var23.field2400 >= 104) {
					var23.method907();
				}
			}

			if (field278 != 0) {
				field278 -= var6;
				field201 -= var7;
			}

			field282 = 0;
			field288 = false;
			class395.field3087 -= var6 << 7;
			class365.field2843 -= var7 << 7;
			class47.field566 -= var6 << 7;
			class401.field3122 -= var7 << 7;
			field273 = -1;
			field297.method623();
			field154.method623();

			for (var15 = 0; var15 < 4; ++var15) {
				field102[var15].method526();
			}

		}
	}

	@ObfInfo(name = "ki", desc = "(ZI)V")
	static final void method173(boolean var0) {
		method242();
		++field92.field2671;
		if (field92.field2671 >= 50 || var0) {
			field92.field2671 = 0;
			if (!field94 && field92.method1824() != null) {
				class121 var2 = class121.method689(class480.field3867, field92.field2665);
				field92.method1821(var2);

				try {
					field92.method1820();
				} catch (IOException var4) {
					field94 = true;
				}
			}

		}
	}

	@ObfInfo(name = "kj", desc = "(I)V")
	static final void method259() {
		method173(false);
		field97 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < class402.field3124.length; ++var2) {
			if (class319.field2585[var2] != -1 && class402.field3124[var2] == null) {
				class402.field3124[var2] = class464.field3761.method2267(class319.field2585[var2], 0);
				if (null == class402.field3124[var2]) {
					var1 = false;
					++field97;
				}
			}

			if (class146.field1452[var2] != -1 && class132.field1367[var2] == null) {
				class132.field1367[var2] = class464.field3761.method2268(class146.field1452[var2], 0, class348.field2759[var2]);
				if (null == class132.field1367[var2]) {
					var1 = false;
					++field97;
				}
			}
		}

		if (!var1) {
			field101 = 1;
		} else {
			field99 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < class402.field3124.length; ++var2) {
				byte[] var3 = class132.field1367[var2];
				if (var3 != null) {
					var4 = (class2.field4[var2] >> 8) * 64 - class265.field2147;
					var5 = 64 * (class2.field4[var2] & 255) - class508.field4092;
					if (field103) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= class411.method2159(var3, var4, var5);
				}
			}

			if (!var1) {
				field101 = 2;
			} else {
				if (field101 != 0) {
					method269(class453.field3408 + class479.field3825 + class479.field3819 + 100 + "%" + class479.field3821, true);
				}

				method242();
				class27.field448.method1056();

				for (var2 = 0; var2 < 4; ++var2) {
					field102[var2].method526();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							class411.field3174[var2][var16][var4] = 0;
						}
					}
				}

				method242();
				class411.method2166();
				var2 = class402.field3124.length;
				class470.method2415();
				method173(true);
				int var18;
				if (!field103) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (class2.field4[var16] >> 8) - class265.field2147;
						var5 = 64 * (class2.field4[var16] & 255) - class508.field4092;
						var6 = class402.field3124[var16];
						if (null != var6) {
							method242();
							class411.method2162(var6, var4, var5, class411.field3162 * 8 - 48, class334.field2657 * 8 - 48, field102);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = (class2.field4[var16] >> 8) * 64 - class265.field2147;
						var5 = (class2.field4[var16] & 255) * 64 - class508.field4092;
						var6 = class402.field3124[var16];
						if (null == var6 && class334.field2657 < 800) {
							method242();
							class411.method2152(var4, var5, 64, 64);
						}
					}

					method173(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = class132.field1367[var16];
						if (var17 != null) {
							var5 = (class2.field4[var16] >> 8) * 64 - class265.field2147;
							var18 = (class2.field4[var16] & 255) * 64 - class508.field4092;
							method242();
							class411.method2167(var17, var5, var18, class27.field448, field102);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (field103) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						method242();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var19 = false;
								var7 = field104[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = (var10 / 8 << 8) + var11 / 8;

									for (int var13 = 0; var13 < class2.field4.length; ++var13) {
										if (var12 == class2.field4[var13] && class402.field3124[var13] != null) {
											int var14 = 8 * (var10 - var4);
											int var15 = 8 * (var11 - var5);
											class214.method1193(class402.field3124[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, field102);
											var19 = true;
											break;
										}
									}
								}

								if (!var19) {
									class411.method2165(var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = field104[0][var16][var4];
							if (var5 == -1) {
								class411.method2152(var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					method173(true);

					for (var16 = 0; var16 < 4; ++var16) {
						method242();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = field104[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < class2.field4.length; ++var12) {
										if (var11 == class2.field4[var12] && class132.field1367[var12] != null) {
											class411.method2149(class132.field1367[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, 8 * (var10 & 7), var8, class27.field448, field102);
											break;
										}
									}
								}
							}
						}
					}
				}

				method173(true);
				method242();
				class411.method2157(class27.field448, field102);
				method173(true);
				var16 = class411.field3164;
				if (var16 > class401.field3120) {
					var16 = class401.field3120;
				}

				if (var16 < class401.field3120 - 1) {
					var16 = class401.field3120 - 1;
				}

				if (field31) {
					class27.field448.method1057(class411.field3164);
				} else {
					class27.field448.method1057(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						method181(var4, var5);
					}
				}

				method242();
				method196();
				class292.field2353.method291();
				class121 var20;
				if (class51.field585.method1908()) {
					var20 = class121.method689(class480.field3852, field92.field2665);
					var20.field1141.method1547(1057001181);
					field92.method1821(var20);
				}

				if (!field103) {
					var4 = (class411.field3162 - 6) / 8;
					var5 = (6 + class411.field3162) / 8;
					var18 = (class334.field2657 - 6) / 8;
					var7 = (class334.field2657 + 6) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								class464.field3761.method2291("m" + var8 + "_" + var9);
								class464.field3761.method2291("l" + var8 + "_" + var9);
							}
						}
					}
				}

				method248(30);
				method242();
				class411.method2153();
				var20 = class121.method689(class480.field3873, field92.field2665);
				field92.method1821(var20);
				class346.method1918();
			}
		}
	}

	@ObfInfo(name = "ko", desc = "(II)V")
	static final void method124(int var0) {
		int[] var2 = class381.field2929.field1463;
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
				if ((class411.field3174[var0][var6][var4] & 24) == 0) {
					class27.field448.method1079(var2, var5, 512, var0, var6, var4);
				}

				if (var0 < 3 && (class411.field3174[var0 + 1][var6][var4] & 8) != 0) {
					class27.field448.method1079(var2, var5, 512, var0 + 1, var6, var4);
				}

				var5 += 4;
			}
		}

		var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class381.field2929.method851();

		int var7;
		for (var6 = 1; var6 < 103; ++var6) {
			for (var7 = 1; var7 < 103; ++var7) {
				if ((class411.field3174[var0][var7][var6] & 24) == 0) {
					method155(var0, var7, var6, var4, var5);
				}

				if (var0 < 3 && (class411.field3174[var0 + 1][var7][var6] & 8) != 0) {
					method155(var0 + 1, var7, var6, var4, var5);
				}
			}
		}

		field274 = 0;

		for (var6 = 0; var6 < 104; ++var6) {
			for (var7 = 0; var7 < 104; ++var7) {
				long var8 = class27.field448.method1106(class401.field3120, var6, var7);
				if (0L != var8) {
					int var10 = class487.method2465(var8);
					int var11 = class185.method1043(var10, (byte)46).field2358;
					if (var11 >= 0 && class185.method1044(var11).field1677) {
						field285[field274] = class185.method1044(var11).method1040(false);
						field275[field274] = var6;
						field276[field274] = var7;
						++field274;
					}
				}
			}
		}

		class535.field4266.method2452();
	}

	@ObfInfo(name = "ke", desc = "(IIIIII)V")
	static final void method155(int var0, int var1, int var2, int var3, int var4) {
		long var6 = class27.field448.method1092(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var24;
		if (0L != var6) {
			var8 = class27.field448.method1074(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = 0L != var6;
			if (var13) {
				boolean var14 = (int)(var6 >>> 16 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var23 = class381.field2929.field1463;
			var24 = (103 - var2) * 2048 + 24624 + var1 * 4;
			var15 = class487.method2465(var6);
			class292 var16 = class185.method1043(var15, (byte)8);
			if (var16.field2357 != -1) {
				class398 var17 = class331.field2634[var16.field2357];
				if (null != var17) {
					int var18 = (var16.field2339 * 4 - var17.field3105) / 2;
					int var19 = (var16.field2324 * 4 - var17.field3106) / 2;
					var17.method2115(var18 + var1 * 4 + 48, var19 + 48 + 4 * (104 - var2 - var16.field2324));
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

		var6 = class27.field448.method1073(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class27.field448.method1074(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class487.method2465(var6);
			class292 var12 = class185.method1043(var11, (byte)17);
			if (var12.field2357 != -1) {
				class398 var25 = class331.field2634[var12.field2357];
				if (null != var25) {
					var24 = (var12.field2339 * 4 - var25.field3105) / 2;
					var15 = (var12.field2324 * 4 - var25.field3106) / 2;
					var25.method2115(var24 + 48 + var1 * 4, var15 + 4 * (104 - var2 - var12.field2324) + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var27 = 0L != var6;
				if (var27) {
					boolean var28 = (int)(var6 >>> 16 & 1L) == 1;
					var27 = !var28;
				}

				if (var27) {
					var26 = 15597568;
				}

				int[] var29 = class381.field2929.field1463;
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

		var6 = class27.field448.method1106(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class487.method2465(var6);
			class292 var20 = class185.method1043(var8, (byte)35);
			if (var20.field2357 != -1) {
				class398 var21 = class331.field2634[var20.field2357];
				if (var21 != null) {
					var11 = (var20.field2339 * 4 - var21.field3105) / 2;
					int var22 = (var20.field2324 * 4 - var21.field3106) / 2;
					var21.method2115(var11 + var1 * 4 + 48, 4 * (104 - var2 - var20.field2324) + 48 + var22);
				}
			}
		}

	}

	@ObfInfo(name = "ka", desc = "(IIIIIIIIIIS)V")
	static final void method160(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class296 var11 = null;

		for (class296 var12 = (class296)field168.method627(); var12 != null; var12 = (class296)field168.method629()) {
			if (var12.field2401 == var0 && var12.field2394 == var1 && var12.field2400 == var2 && var3 == var12.field2387) {
				var11 = var12;
				break;
			}
		}

		if (null == var11) {
			var11 = new class296();
			var11.field2401 = var0;
			var11.field2387 = var3;
			var11.field2394 = var1;
			var11.field2400 = var2;
			var11.field2396 = -1;
			method174(var11);
			field168.method631(var11);
		}

		var11.field2393 = var4;
		var11.field2389 = var5;
		var11.field2395 = var6;
		var11.field2398 = var8;
		var11.field2399 = var9;
		var11.method1636(var7);
	}

	@ObfInfo(name = "kf", desc = "(IIIIII)Z")
	static final boolean method277(int var0, int var1, int var2, int var3, int var4) {
		class296 var6 = null;

		for (class296 var7 = (class296)field168.method627(); var7 != null; var7 = (class296)field168.method629()) {
			if (var0 == var7.field2401 && var1 == var7.field2394 && var2 == var7.field2400 && var3 == var7.field2387) {
				var6 = var7;
				break;
			}
		}

		if (null != var6) {
			var6.field2396 = var4;
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "kx", desc = "(B)V")
	static final void method196() {
		for (class296 var1 = (class296)field168.method627(); null != var1; var1 = (class296)field168.method629()) {
			if (var1.field2399 == -1) {
				var1.field2398 = 0;
				method174(var1);
			} else {
				var1.method907();
			}
		}

	}

	@ObfInfo(name = "ky", desc = "(Ldv;I)V")
	static final void method174(class296 var0) {
		long var2 = 0L;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (var0.field2387 == 0) {
			var2 = class27.field448.method1092(var0.field2401, var0.field2394, var0.field2400);
		}

		if (var0.field2387 == 1) {
			var2 = class27.field448.method1097(var0.field2401, var0.field2394, var0.field2400);
		}

		if (var0.field2387 == 2) {
			var2 = class27.field448.method1073(var0.field2401, var0.field2394, var0.field2400);
		}

		if (var0.field2387 == 3) {
			var2 = class27.field448.method1106(var0.field2401, var0.field2394, var0.field2400);
		}

		if (var2 != 0L) {
			int var7 = class27.field448.method1074(var0.field2401, var0.field2394, var0.field2400, var2);
			var4 = class487.method2465(var2);
			var5 = var7 & 31;
			var6 = var7 >> 6 & 3;
		}

		var0.field2390 = var4;
		var0.field2392 = var5;
		var0.field2391 = var6;
	}

	@ObfInfo(name = "kp", desc = "(B)V")
	static final void method276() {
		for (class296 var1 = (class296)field168.method627(); var1 != null; var1 = (class296)field168.method629()) {
			if (var1.field2399 > 0) {
				--var1.field2399;
			}

			boolean var2;
			int var3;
			int var4;
			class292 var5;
			if (var1.field2399 == 0) {
				if (var1.field2390 >= 0) {
					var3 = var1.field2390;
					var4 = var1.field2392;
					var5 = class185.method1043(var3, (byte)-69);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method1609(var4);
					if (!var2) {
						continue;
					}
				}

				method281(var1.field2401, var1.field2387, var1.field2394, var1.field2400, var1.field2390, var1.field2391, var1.field2392, var1.field2396);
				var1.method907();
			} else {
				if (var1.field2398 > 0) {
					--var1.field2398;
				}

				if (var1.field2398 == 0 && var1.field2394 >= 1 && var1.field2400 >= 1 && var1.field2394 <= 102 && var1.field2400 <= 102) {
					if (var1.field2393 >= 0) {
						var3 = var1.field2393;
						var4 = var1.field2389;
						var5 = class185.method1043(var3, (byte)-10);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method1609(var4);
						if (!var2) {
							continue;
						}
					}

					method281(var1.field2401, var1.field2387, var1.field2394, var1.field2400, var1.field2393, var1.field2395, var1.field2389, var1.field2396);
					var1.field2398 = -1;
					if (var1.field2393 == var1.field2390 && var1.field2390 == -1) {
						var1.method907();
					} else if (var1.field2393 == var1.field2390 && var1.field2395 == var1.field2391 && var1.field2392 == var1.field2389) {
						var1.method907();
					}
				}
			}
		}

	}

	@ObfInfo(name = "kr", desc = "(IIIIIIIII)V")
	static final void method281(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (field31 && var0 != class401.field3120) {
				return;
			}

			long var9 = 0L;
			boolean var11 = true;
			boolean var12 = false;
			boolean var13 = false;
			if (var1 == 0) {
				var9 = class27.field448.method1092(var0, var2, var3);
			}

			if (var1 == 1) {
				var9 = class27.field448.method1097(var0, var2, var3);
			}

			if (var1 == 2) {
				var9 = class27.field448.method1073(var0, var2, var3);
			}

			if (var1 == 3) {
				var9 = class27.field448.method1106(var0, var2, var3);
			}

			int var14;
			if (var9 != 0L) {
				var14 = class27.field448.method1074(var0, var2, var3, var9);
				int var38 = class487.method2465(var9);
				int var39 = var14 & 31;
				int var40 = var14 >> 6 & 3;
				class292 var15;
				if (var1 == 0) {
					class27.field448.method1099(var0, var2, var3);
					var15 = class185.method1043(var38, (byte)10);
					if (var15.field2341 != 0) {
						field102[var0].method523(var2, var3, var39, var40, var15.field2342);
					}
				}

				if (var1 == 1) {
					class27.field448.method1067(var0, var2, var3);
				}

				if (var1 == 2) {
					class27.field448.method1100(var0, var2, var3);
					var15 = class185.method1043(var38, (byte)26);
					if (var2 + var15.field2339 > 103 || var3 + var15.field2339 > 103 || var15.field2324 + var2 > 103 || var3 + var15.field2324 > 103) {
						return;
					}

					if (var15.field2341 != 0) {
						field102[var0].method527(var2, var3, var15.field2339, var15.field2324, var40, var15.field2342);
					}
				}

				if (var1 == 3) {
					class27.field448.method1069(var0, var2, var3);
					var15 = class185.method1043(var38, (byte)17);
					if (var15.field2341 == 1) {
						field102[var0].method525(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && (class411.field3174[1][var2][var3] & 2) == 2) {
					var14 = var0 + 1;
				}

				class194 var41 = class27.field448;
				class77 var16 = field102[var0];
				class292 var17 = class185.method1043(var4, (byte)76);
				int var18 = var7 >= 0 ? var7 : var17.field2351;
				int var19;
				int var20;
				if (var5 != 1 && var5 != 3) {
					var19 = var17.field2339;
					var20 = var17.field2324;
				} else {
					var19 = var17.field2324;
					var20 = var17.field2339;
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

				int[][] var25 = class411.field3172[var14];
				int var26 = var25[var22][var23] + var25[var21][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
				int var27 = (var19 << 6) + (var2 << 7);
				int var28 = (var3 << 7) + (var20 << 6);
				long var29 = class487.method2467(var2, var3, 2, var17.field2348 == 0, var4);
				int var31 = (var5 << 6) + var6;
				if (var17.field2364 == 1) {
					var31 += 256;
				}

				Object var32;
				if (var6 == 22) {
					if (var18 == -1 && var17.field2365 == null) {
						var32 = var17.method1613(22, var5, var25, var27, var26, var28);
					} else {
						var32 = new class380(var4, 22, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
					}

					var41.method1061(var0, var2, var3, var26, (class510)var32, var29, var31);
					if (var17.field2341 == 1) {
						var16.method522(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var18 == -1 && null == var17.field2365) {
							var32 = var17.method1613(var6, var5, var25, var27, var26, var28);
						} else {
							var32 = new class380(var4, var6, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
						}

						var41.method1063(var0, var2, var3, var26, 1, 1, (class510)var32, 0, var29, var31);
						if (var17.field2341 != 0) {
							var16.method520(var2, var3, var19, var20, var17.field2342);
						}
					} else if (var6 == 0) {
						if (var18 == -1 && null == var17.field2365) {
							var32 = var17.method1613(0, var5, var25, var27, var26, var28);
						} else {
							var32 = new class380(var4, 0, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
						}

						var41.method1083(var0, var2, var3, var26, (class510)var32, (class510)null, class411.field3167[var5], 0, var29, var31);
						if (var17.field2341 != 0) {
							var16.method519(var2, var3, var6, var5, var17.field2342);
						}
					} else if (var6 == 1) {
						if (var18 == -1 && var17.field2365 == null) {
							var32 = var17.method1613(1, var5, var25, var27, var26, var28);
						} else {
							var32 = new class380(var4, 1, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
						}

						var41.method1083(var0, var2, var3, var26, (class510)var32, (class510)null, class411.field3168[var5], 0, var29, var31);
						if (var17.field2341 != 0) {
							var16.method519(var2, var3, var6, var5, var17.field2342);
						}
					} else {
						int var44;
						if (var6 == 2) {
							var44 = var5 + 1 & 3;
							Object var33;
							Object var34;
							if (var18 == -1 && var17.field2365 == null) {
								var33 = var17.method1613(2, var5 + 4, var25, var27, var26, var28);
								var34 = var17.method1613(2, var44, var25, var27, var26, var28);
							} else {
								var33 = new class380(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field2356, (class510)null);
								var34 = new class380(var4, 2, var44, var14, var2, var3, var18, var17.field2356, (class510)null);
							}

							var41.method1083(var0, var2, var3, var26, (class510)var33, (class510)var34, class411.field3167[var5], class411.field3167[var44], var29, var31);
							if (var17.field2341 != 0) {
								var16.method519(var2, var3, var6, var5, var17.field2342);
							}
						} else if (var6 == 3) {
							if (var18 == -1 && null == var17.field2365) {
								var32 = var17.method1613(3, var5, var25, var27, var26, var28);
							} else {
								var32 = new class380(var4, 3, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
							}

							var41.method1083(var0, var2, var3, var26, (class510)var32, (class510)null, class411.field3168[var5], 0, var29, var31);
							if (var17.field2341 != 0) {
								var16.method519(var2, var3, var6, var5, var17.field2342);
							}
						} else if (var6 == 9) {
							if (var18 == -1 && var17.field2365 == null) {
								var32 = var17.method1613(var6, var5, var25, var27, var26, var28);
							} else {
								var32 = new class380(var4, var6, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
							}

							var41.method1063(var0, var2, var3, var26, 1, 1, (class510)var32, 0, var29, var31);
							if (var17.field2341 != 0) {
								var16.method520(var2, var3, var19, var20, var17.field2342);
							}
						} else if (var6 == 4) {
							if (var18 == -1 && null == var17.field2365) {
								var32 = var17.method1613(4, var5, var25, var27, var26, var28);
							} else {
								var32 = new class380(var4, 4, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
							}

							var41.method1098(var0, var2, var3, var26, (class510)var32, (class510)null, class411.field3167[var5], 0, 0, 0, var29, var31);
						} else {
							Object var35;
							long var42;
							if (var6 == 5) {
								var44 = 16;
								var42 = var41.method1092(var0, var2, var3);
								if (var42 != 0L) {
									var44 = class185.method1043(class487.method2465(var42), (byte)-62).field2345;
								}

								if (var18 == -1 && null == var17.field2365) {
									var35 = var17.method1613(4, var5, var25, var27, var26, var28);
								} else {
									var35 = new class380(var4, 4, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
								}

								var41.method1098(var0, var2, var3, var26, (class510)var35, (class510)null, class411.field3167[var5], 0, class411.field3169[var5] * var44, var44 * class411.field3170[var5], var29, var31);
							} else if (var6 == 6) {
								var44 = 8;
								var42 = var41.method1092(var0, var2, var3);
								if (var42 != 0L) {
									var44 = class185.method1043(class487.method2465(var42), (byte)-48).field2345 / 2;
								}

								if (var18 == -1 && var17.field2365 == null) {
									var35 = var17.method1613(4, var5 + 4, var25, var27, var26, var28);
								} else {
									var35 = new class380(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2356, (class510)null);
								}

								var41.method1098(var0, var2, var3, var26, (class510)var35, (class510)null, 256, var5, var44 * class411.field3175[var5], class411.field3173[var5] * var44, var29, var31);
							} else if (var6 == 7) {
								int var43 = var5 + 2 & 3;
								if (var18 == -1 && var17.field2365 == null) {
									var32 = var17.method1613(4, var43 + 4, var25, var27, var26, var28);
								} else {
									var32 = new class380(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field2356, (class510)null);
								}

								var41.method1098(var0, var2, var3, var26, (class510)var32, (class510)null, 256, var43, 0, 0, var29, var31);
							} else if (var6 == 8) {
								var44 = 8;
								var42 = var41.method1092(var0, var2, var3);
								if (0L != var42) {
									var44 = class185.method1043(class487.method2465(var42), (byte)-82).field2345 / 2;
								}

								int var37 = var5 + 2 & 3;
								Object var36;
								if (var18 == -1 && var17.field2365 == null) {
									var35 = var17.method1613(4, var5 + 4, var25, var27, var26, var28);
									var36 = var17.method1613(4, var37 + 4, var25, var27, var26, var28);
								} else {
									var35 = new class380(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2356, (class510)null);
									var36 = new class380(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field2356, (class510)null);
								}

								var41.method1098(var0, var2, var3, var26, (class510)var35, (class510)var36, 256, var5, var44 * class411.field3175[var5], var44 * class411.field3173[var5], var29, var31);
							}
						}
					}
				} else {
					if (var18 == -1 && null == var17.field2365) {
						var32 = var17.method1613(10, var5, var25, var27, var26, var28);
					} else {
						var32 = new class380(var4, 10, var5, var14, var2, var3, var18, var17.field2356, (class510)null);
					}

					if (var32 != null) {
						var41.method1063(var0, var2, var3, var26, var19, var20, (class510)var32, var6 == 11 ? 256 : 0, var29, var31);
					}

					if (var17.field2341 != 0) {
						var16.method520(var2, var3, var19, var20, var17.field2342);
					}
				}
			}
		}

	}

	@ObfInfo(name = "kw", desc = "(III)V")
	static final void method181(int var0, int var1) {
		class113 var3 = field167[class401.field3120][var0][var1];
		if (null == var3) {
			class27.field448.method1070(class401.field3120, var0, var1);
		} else {
			long var4 = -99999999L;
			class432 var6 = null;

			class432 var7;
			for (var7 = (class432)var3.method627(); var7 != null; var7 = (class432)var3.method629()) {
				class270 var8 = class270.method1424(var7.field3272);
				long var9 = (long)var8.field2182;
				if (var8.field2181 == 1) {
					var9 *= var7.field3273 < Integer.MAX_VALUE ? (long)(var7.field3273 + 1) : (long)var7.field3273;
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (var6 == null) {
				class27.field448.method1070(class401.field3120, var0, var1);
			} else {
				var3.method632(var6);
				class432 var12 = null;
				class432 var13 = null;

				for (var7 = (class432)var3.method627(); var7 != null; var7 = (class432)var3.method629()) {
					if (var7.field3272 != var6.field3272) {
						if (var12 == null) {
							var12 = var7;
						}

						if (var7.field3272 != var12.field3272 && null == var13) {
							var13 = var7;
						}
					}
				}

				long var10 = class487.method2467(var0, var1, 3, false, 0);
				class27.field448.method1062(class401.field3120, var0, var1, method131(var0 * 128 + 64, 64 + var1 * 128, class401.field3120), var6, var10, var12, var13);
			}
		}
	}

	@ObfInfo(name = "kv", desc = "(ZLto;I)V")
	static final void method227(boolean var0, class259 var1) {
		field296 = 0;
		field141 = 0;
		var1.method1361();
		int var3 = var1.method1359(8);
		int var4;
		if (var3 < field88) {
			for (var4 = var3; var4 < field88; ++var4) {
				field53[++field296 - 1] = field26[var4];
			}
		}

		if (var3 > field88) {
			throw new RuntimeException("");
		} else {
			field88 = 0;

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = field26[var4];
				class412 var6 = field87[var5];
				int var7 = var1.method1359(1);
				if (var7 == 0) {
					field26[++field88 - 1] = var5;
					var6.field1096 = field330;
				} else {
					int var8 = var1.method1359(2);
					if (var8 == 0) {
						field26[++field88 - 1] = var5;
						var6.field1096 = field330;
						field238[++field141 - 1] = var5;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							field26[++field88 - 1] = var5;
							var6.field1096 = field330;
							var9 = var1.method1359(3);
							var6.method2172(var9, class386.field3029);
							var10 = var1.method1359(1);
							if (var10 == 1) {
								field238[++field141 - 1] = var5;
							}
						} else if (var8 == 2) {
							field26[++field88 - 1] = var5;
							var6.field1096 = field330;
							if (var1.method1359(1) == 1) {
								var9 = var1.method1359(3);
								var6.method2172(var9, class386.field3026);
								var10 = var1.method1359(3);
								var6.method2172(var10, class386.field3026);
							} else {
								var9 = var1.method1359(3);
								var6.method2172(var9, class386.field3025);
							}

							var9 = var1.method1359(1);
							if (var9 == 1) {
								field238[++field141 - 1] = var5;
							}
						} else if (var8 == 3) {
							field53[++field296 - 1] = var5;
						}
					}
				}
			}

			method252(var0, var1);
			method185(var1);

			for (var3 = 0; var3 < field296; ++var3) {
				var4 = field53[var3];
				if (field87[var4].field1096 != field330) {
					field87[var4].field3178 = null;
					field87[var4] = null;
				}
			}

			if (var1.field2254 != field92.field2668) {
				throw new RuntimeException(var1.field2254 + class479.field3823 + field92.field2668);
			} else {
				for (var3 = 0; var3 < field88; ++var3) {
					if (null == field87[field26[var3]]) {
						throw new RuntimeException(var3 + class479.field3823 + field88);
					}
				}

			}
		}
	}

	@ObfInfo(name = "ku", desc = "(ZLto;B)V")
	static final void method252(boolean var0, class259 var1) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var1.method1360(field92.field2668) >= var3 + 12) {
				int var5 = var1.method1359(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					if (null == field87[var5]) {
						field87[var5] = new class412();
						var6 = true;
					}

					class412 var7 = field87[var5];
					field26[++field88 - 1] = var5;
					var7.field1096 = field330;
					int var9;
					if (var0) {
						var9 = var1.method1359(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var1.method1359(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					boolean var11 = var1.method1359(1) == 1;
					if (var11) {
						var1.method1359(32);
					}

					int var8 = var1.method1359(1);
					int var12 = field208[var1.method1359(3)];
					if (var6) {
						var7.field1072 = var7.field1033 = var12;
					}

					var7.field3178 = class395.method2109(var1.method1359(14));
					int var13 = var1.method1359(1);
					if (var13 == 1) {
						field238[++field141 - 1] = var5;
					}

					int var10;
					if (var0) {
						var10 = var1.method1359(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var1.method1359(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					method217(var7);
					if (var7.field1100 == 0) {
						var7.field1033 = 0;
					}

					var7.method2173(class126.field1164.field1106[0] + var9, class126.field1164.field1103[0] + var10, var8 == 1);
					continue;
				}
			}

			var1.method1362();
			return;
		}
	}

	@ObfInfo(name = "kl", desc = "(Lto;I)V")
	static final void method185(class259 var0) {
		for (int var2 = 0; var2 < field141; ++var2) {
			int var3 = field238[var2];
			class412 var4 = field87[var3];
			int var5 = var0.method1492();
			int var6;
			if ((var5 & 8) != 0) {
				var6 = var0.method1492();
				var5 += var6 << 8;
			}

			if ((var5 & 2048) != 0) {
				var6 = var0.method1492();
				var5 += var6 << 16;
			}

			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			if ((var5 & 128) != 0) {
				var6 = var0.method1552();
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var0.method1539();
						if (var8 == 32767) {
							var8 = var0.method1539();
							var10 = var0.method1539();
							var9 = var0.method1539();
							var11 = var0.method1539();
						} else if (var8 != 32766) {
							var10 = var0.method1539();
						} else {
							var8 = -1;
						}

						var12 = var0.method1539();
						var4.method640(var8, var10, var9, var11, field330, var12);
					}
				}

				var7 = var0.method1514();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var0.method1539();
						var10 = var0.method1539();
						if (var10 != 32767) {
							var11 = var0.method1539();
							var12 = var0.method1552();
							int var13 = var10 > 0 ? var0.method1552() : var12;
							var4.method636(var9, field330, var10, var11, var12, var13);
						} else {
							var4.method641(var9);
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
				var6 = var0.method1492();
				if ((var6 & 1) == 1) {
					var4.method2178();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method1513();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method1521();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (null != var4.field3178.field3075) {
							var9 = var4.field3178.field3075.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.method1520();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (null != var4.field3178.field3071) {
							var10 = var4.field3178.field3071.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var0.method1520();
						}
					}

					var18 = false;
					if ((var6 & 16) != 0) {
						var18 = var0.method1514() == 1;
					}

					var17 = (long)(++class412.field3184 - 1);
					var4.method2183(new class451(var17, var14, var15, var16, var18));
				}
			}

			if ((var5 & 32) != 0) {
				var6 = var0.method1520();
				var7 = var0.method1541();
				var4.field1071 = var0.method1552() == 1;
				if (field209 >= 212) {
					var4.field1069 = var6;
					var4.field1070 = var7;
				} else {
					var8 = var4.field1061 - 64 * (var6 - class265.field2147 - class265.field2147);
					var9 = var4.field1032 - (var7 - class508.field4092 - class508.field4092) * 64;
					if (var8 != 0 || var9 != 0) {
						var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047;
						var4.field1068 = var11;
					}
				}
			}

			if ((var5 & 64) != 0) {
				var6 = var0.method1541();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var0.method1514();
				if (var4.field1076 == var6 && var6 != -1) {
					var8 = class202.method1149(var6).field1854;
					if (var8 == 1) {
						var4.field1077 = 0;
						var4.field1078 = 0;
						var4.field1093 = var7;
						var4.field1058 = 0;
					}

					if (var8 == 2) {
						var4.field1058 = 0;
					}
				} else if (var6 == -1 || var4.field1076 == -1 || class202.method1149(var6).field1847 >= class202.method1149(var4.field1076).field1847) {
					var4.field1076 = var6;
					var4.field1077 = 0;
					var4.field1078 = 0;
					var4.field1093 = var7;
					var4.field1058 = 0;
					var4.field1095 = var4.field1079;
				}
			}

			if ((var5 & 131072) != 0) {
				var6 = var0.method1552();

				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var0.method1514();
					var9 = var0.method1521();
					var10 = var0.method1537();
					var4.method637(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 4) != 0) {
				var4.field3178 = class395.method2109(var0.method1541());
				method217(var4);
				var4.method2177();
			}

			if ((var5 & 16) != 0) {
				var4.field1066 = var0.method1519();
				var4.field1066 += var0.method1514() << 16;
				var6 = 16777215;
				if (var6 == var4.field1066) {
					var4.field1066 = -1;
				}
			}

			if ((var5 & 4096) != 0) {
				var4.field1083 = var0.method1516();
				var4.field1085 = var0.method1516();
				var4.field1081 = var0.method1515();
				var4.field1051 = var0.method1507();
				var4.field1087 = var0.method1519() + field330;
				var4.field1088 = var0.method1541() + field330;
				var4.field1089 = var0.method1521();
				var4.field1079 = 1;
				var4.field1095 = 0;
				var4.field1083 += var4.field1106[0];
				var4.field1085 += var4.field1103[0];
				var4.field1081 += var4.field1106[0];
				var4.field1051 += var4.field1103[0];
			}

			if ((var5 & 65536) != 0) {
				var6 = var0.method1532();
				var4.field1038 = (var6 & 1) != 0 ? var0.method1521() : 1686120851 * var4.field3178.field3061 * -1670226789;
				var4.field1099 = (var6 & 2) != 0 ? var0.method1520() : 821598169 * var4.field3178.field3062 * -1405323159;
				var4.field1040 = (var6 & 4) != 0 ? var0.method1519() : var4.field3178.field3077;
				var4.field1041 = (var6 & 8) != 0 ? var0.method1521() : 129510829 * var4.field3178.field3064 * 1271381541;
				var4.field1042 = (var6 & 16) != 0 ? var0.method1520() : -1909691015 * var4.field3178.field3065 * 799501513;
				var4.field1090 = (var6 & 32) != 0 ? var0.method1520() : var4.field3178.field3066;
				var4.field1101 = (var6 & 64) != 0 ? var0.method1521() : -1380991387 * var4.field3178.field3067 * -725499027;
				var4.field1045 = (var6 & 128) != 0 ? var0.method1521() : var4.field3178.field3068;
				var4.field1086 = (var6 & 256) != 0 ? var0.method1519() : var4.field3178.field3069;
				var4.field1047 = (var6 & 512) != 0 ? var0.method1521() : var4.field3178.field3094;
				var4.field1048 = (var6 & 1024) != 0 ? var0.method1519() : var4.field3178.field3063;
				var4.field1049 = (var6 & 2048) != 0 ? var0.method1521() : -2089336141 * var4.field3178.field3072 * -1708442501;
				var4.field1050 = (var6 & 4096) != 0 ? var0.method1519() : 2098030227 * var4.field3178.field3078 * -1815894117;
				var4.field1080 = (var6 & 8192) != 0 ? var0.method1520() : var4.field3178.field3095;
				var4.field1037 = (var6 & 16384) != 0 ? var0.method1519() : var4.field3178.field3060;
			}

			if ((var5 & 262144) != 0) {
				var6 = var0.method1492();
				var14 = new int[8];
				var15 = new short[8];

				for (var9 = 0; var9 < 8; ++var9) {
					if ((var6 & 1 << var9) != 0) {
						var14[var9] = var0.method1540();
						var15[var9] = (short)var0.method1504();
					} else {
						var14[var9] = -1;
						var15[var9] = -1;
					}
				}

				var4.method2176(var14, var15);
			}

			if ((var5 & 32768) != 0) {
				var4.method2168(var0.method1500());
			}

			if ((var5 & 2) != 0) {
				var0.method1541();
				var0.method1496();
			}

			if ((var5 & 1) != 0) {
				var4.field1102 = var0.method1500();
				var4.field1055 = 100;
			}

			if ((var5 & 8192) != 0) {
				var4.field1092 = field330 + var0.method1541();
				var4.field1034 = field330 + var0.method1541();
				var4.field1094 = var0.method1515();
				var4.field1052 = var0.method1515();
				var4.field1046 = var0.method1515();
				var4.field1084 = (byte)var0.method1492();
			}

			if ((var5 & 256) != 0) {
				var6 = var0.method1513();
				if ((var6 & 1) == 1) {
					var4.method2181();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var0.method1513();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var0.method1520();
							var10 = var10 == 65535 ? -1 : var10;
							var14[var9] = var10;
						}
					}

					var15 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var4.field3178.field3075 != null) {
							var9 = var4.field3178.field3075.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.method1520();
						}
					}

					var16 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var4.field3178.field3071 != null) {
							var10 = var4.field3178.field3071.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var0.method1519();
						}
					}

					var18 = false;
					if ((var6 & 16) != 0) {
						var18 = var0.method1514() == 1;
					}

					var17 = (long)(++class412.field3177 - 1);
					var4.method2180(new class451(var17, var14, var15, var16, var18));
				}
			}

			if ((var5 & 16384) != 0) {
				var4.method2169(var0.method1513());
			}

			if ((var5 & 1024) != 0) {
				var4.field1107 = var0.method1496();
			}
		}

	}

	@ObfInfo(name = "kk", desc = "(Ldx;B)V")
	static void method217(class412 var0) {
		var0.field1035 = var0.field3178.field3057;
		var0.field1100 = var0.field3178.field3086;
		var0.field1040 = var0.field3178.field3077;
		var0.field1041 = var0.field3178.field3064;
		var0.field1042 = var0.field3178.field3065;
		var0.field1090 = var0.field3178.field3066;
		var0.field1037 = var0.field3178.field3060;
		var0.field1038 = var0.field3178.field3061;
		var0.field1099 = var0.field3178.field3062;
		var0.field1101 = var0.field3178.field3067;
		var0.field1045 = var0.field3178.field3068;
		var0.field1086 = var0.field3178.field3069;
		var0.field1047 = var0.field3178.field3094;
		var0.field1048 = var0.field3178.field3063;
		var0.field1049 = var0.field3178.field3072;
		var0.field1050 = var0.field3178.field3078;
		var0.field1080 = var0.field3178.field3095;
	}

	@ObfInfo(name = "kc", desc = "(IIB)Liw;")
	static class342 method241(int var0, int var1) {
		field327.field2700 = var0;
		field327.field2699 = var1;
		field327.field2701 = 1;
		field327.field2702 = 1;
		return field327;
	}

	@ObfInfo(name = "km", desc = "(I)V")
	static void method226() {
		field176 = 0;
		field140 = false;
	}

	@ObfInfo(name = "kz", desc = "(I)V")
	static void method253() {
		method226();
		field182[0] = class453.field3640;
		field301[0] = "";
		field220[0] = 1006;
		field184[0] = false;
		field176 = 1;
	}

	@ObfInfo(name = "kh", desc = "(I)Z")
	static final boolean method275() {
		return field140;
	}

	@ObfInfo(name = "kg", desc = "(IIIIB)V")
	static final void method123(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < field198; ++var5) {
			if (field254[var5] + field252[var5] > var0 && field252[var5] < var2 + var0 && field255[var5] + field253[var5] > var1 && field253[var5] < var3 + var1) {
				field250[var5] = true;
			}
		}

	}

	@ObfInfo(name = "ld", desc = "(II)Z")
	static final boolean method147(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = field220[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	@ObfInfo(name = "lm", desc = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
	static final void method273(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		class412 var10;
		class121 var11;
		if (var2 == 9) {
			var10 = field87[var3];
			if (null != var10) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3916, field92.field2665);
				var11.field1141.method1512(field175.method1783(82) ? 1 : 0);
				var11.field1141.method1544(var3);
				field92.method1821(var11);
			}
		}

		if (var2 == 12) {
			var10 = field87[var3];
			if (var10 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3886, field92.field2665);
				var11.field1141.method1512(field175.method1783(82) ? 1 : 0);
				var11.field1141.method1522(var3);
				field92.method1821(var11);
			}
		}

		class439 var13;
		if (var2 == 45) {
			var13 = field200[var3];
			if (null != var13) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3878, field92.field2665);
				var11.field1141.method1517(var3);
				var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 47) {
			var13 = field200[var3];
			if (var13 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3893, field92.field2665);
				var11.field1141.method1544(var3);
				var11.field1141.method1554(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		class131 var14;
		if (var2 == 57 || var2 == 1007) {
			var14 = class131.method753(var1, var0);
			if (null != var14) {
				method142(var3, var1, var0, var4, var6);
			}
		}

		class121 var15;
		if (var2 == 19) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3877, field92.field2665);
			var15.field1141.method1522(var1 + class508.field4092);
			var15.field1141.method1517(class265.field2147 + var0);
			var15.field1141.method1512(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1550(var3);
			field92.method1821(var15);
		}

		if (var2 == 1) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3845, field92.field2665);
			var15.field1141.method1544(class249.field2082);
			var15.field1141.method1547(class98.field979);
			var15.field1141.method1522(class305.field2471);
			var15.field1141.method1517(var3);
			var15.field1141.method1544(var1 + class508.field4092);
			var15.field1141.method1544(class265.field2147 + var0);
			var15.field1141.method1481(field175.method1783(82) ? 1 : 0);
			field92.method1821(var15);
		}

		if (var2 == 13) {
			var10 = field87[var3];
			if (var10 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3872, field92.field2665);
				var11.field1141.method1528(field175.method1783(82) ? 1 : 0);
				var11.field1141.method1550(var3);
				field92.method1821(var11);
			}
		}

		if (var2 == 14) {
			var13 = field200[var3];
			if (var13 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3838, field92.field2665);
				var11.field1141.method1501(class98.field979);
				var11.field1141.method1544(class249.field2082);
				var11.field1141.method1544(class305.field2471);
				var11.field1141.method1544(var3);
				var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 1002) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			var15 = class121.method689(class480.field3891, field92.field2665);
			var15.field1141.method1517(var3);
			field92.method1821(var15);
		}

		if (var2 == 10) {
			var10 = field87[var3];
			if (null != var10) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3880, field92.field2665);
				var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
				var11.field1141.method1550(var3);
				field92.method1821(var11);
			}
		}

		if (var2 == 1001) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3863, field92.field2665);
			var15.field1141.method1517(class508.field4092 + var1);
			var15.field1141.method1550(class265.field2147 + var0);
			var15.field1141.method1481(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1544(var3);
			field92.method1821(var15);
		}

		if (var2 == 26) {
			method230();
		}

		if (var2 == 8) {
			var10 = field87[var3];
			if (null != var10) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3905, field92.field2665);
				var11.field1141.method1528(field175.method1783(82) ? 1 : 0);
				var11.field1141.method1544(var3);
				var11.field1141.method1550(field161);
				var11.field1141.method1530(class515.field4126);
				var11.field1141.method1517(field195);
				field92.method1821(var11);
			}
		}

		if (var2 == 18) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3855, field92.field2665);
			var15.field1141.method1544(var3);
			var15.field1141.method1517(class265.field2147 + var0);
			var15.field1141.method1512(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1522(var1 + class508.field4092);
			field92.method1821(var15);
		}

		if (var2 == 23) {
			if (field140) {
				class27.field448.method1102();
			} else {
				class27.field448.method1081(class401.field3120, var0, var1, true);
			}
		}

		class121 var12;
		if (var2 == 24) {
			var14 = class131.method756(var1);
			if (var14 != null) {
				boolean var17 = true;
				if (var14.field1240 > 0) {
					var17 = class238.method1256(var14);
				}

				if (var17) {
					var12 = class121.method689(class480.field3842, field92.field2665);
					var12.field1141.method1547(var1);
					field92.method1821(var12);
				}
			}
		}

		if (var2 == 11) {
			var10 = field87[var3];
			if (null != var10) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3908, field92.field2665);
				var11.field1141.method1517(var3);
				var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 49) {
			var13 = field200[var3];
			if (null != var13) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3875, field92.field2665);
				var11.field1141.method1544(var3);
				var11.field1141.method1528(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 16) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3881, field92.field2665);
			var15.field1141.method1517(class249.field2082);
			var15.field1141.method1550(var3);
			var15.field1141.method1481(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1544(class305.field2471);
			var15.field1141.method1550(class265.field2147 + var0);
			var15.field1141.method1544(class508.field4092 + var1);
			var15.field1141.method1529(class98.field979);
			field92.method1821(var15);
		}

		if (var2 == 2) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3889, field92.field2665);
			var15.field1141.method1517(var3);
			var15.field1141.method1544(var0 + class265.field2147);
			var15.field1141.method1522(class508.field4092 + var1);
			var15.field1141.method1517(field195);
			var15.field1141.method1528(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1517(field161);
			var15.field1141.method1501(class515.field4126);
			field92.method1821(var15);
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class34.field483.method1329(var2, var3, new class50(var0), new class50(var1));
		}

		if (var2 == 6) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3900, field92.field2665);
			var15.field1141.method1481(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1544(var1 + class508.field4092);
			var15.field1141.method1522(var3);
			var15.field1141.method1550(class265.field2147 + var0);
			field92.method1821(var15);
		}

		if (var2 == 21) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3871, field92.field2665);
			var15.field1141.method1481(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1550(class265.field2147 + var0);
			var15.field1141.method1544(class508.field4092 + var1);
			var15.field1141.method1550(var3);
			field92.method1821(var15);
		}

		if (var2 == 30 && field204 == null) {
			method279(var1, var0);
			field204 = class131.method753(var1, var0);
			method213(field204);
		}

		if (var2 == 15) {
			var13 = field200[var3];
			if (var13 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3885, field92.field2665);
				var11.field1141.method1517(field195);
				var11.field1141.method1550(field161);
				var11.field1141.method1530(class515.field4126);
				var11.field1141.method1550(var3);
				var11.field1141.method1512(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		int var16;
		class131 var18;
		if (var2 == 28) {
			var15 = class121.method689(class480.field3842, field92.field2665);
			var15.field1141.method1547(var1);
			field92.method1821(var15);
			var18 = class131.method756(var1);
			if (null != var18 && null != var18.field1278 && var18.field1278[0][0] == 5) {
				var16 = var18.field1278[0][1];
				class44.field559[var16] = 1 - class44.field559[var16];
				method235(var16);
			}
		}

		if (var2 == 48) {
			var13 = field200[var3];
			if (null != var13) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3840, field92.field2665);
				var11.field1141.method1544(var3);
				var11.field1141.method1528(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 4) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3830, field92.field2665);
			var15.field1141.method1522(class265.field2147 + var0);
			var15.field1141.method1522(class508.field4092 + var1);
			var15.field1141.method1550(var3);
			var15.field1141.method1554(field175.method1783(82) ? 1 : 0);
			field92.method1821(var15);
		}

		if (var2 == 29) {
			var15 = class121.method689(class480.field3842, field92.field2665);
			var15.field1141.method1547(var1);
			field92.method1821(var15);
			var18 = class131.method756(var1);
			if (null != var18 && var18.field1278 != null && var18.field1278[0][0] == 5) {
				var16 = var18.field1278[0][1];
				if (var18.field1337[0] != class44.field559[var16]) {
					class44.field559[var16] = var18.field1337[0];
					method235(var16);
				}
			}
		}

		if (var2 == 1003) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			var10 = field87[var3];
			if (null != var10) {
				class395 var19 = var10.field3178;
				if (null != var19.field3084) {
					var19 = var19.method2099();
				}

				if (null != var19) {
					var12 = class121.method689(class480.field3892, field92.field2665);
					var12.field1141.method1544(var19.field3055);
					field92.method1821(var12);
				}
			}
		}

		if (var2 == 44) {
			var13 = field200[var3];
			if (null != var13) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3837, field92.field2665);
				var11.field1141.method1517(var3);
				var11.field1141.method1528(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 1004) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			var15 = class121.method689(class480.field3870, field92.field2665);
			var15.field1141.method1522(class265.field2147 + var0);
			var15.field1141.method1517(var3);
			var15.field1141.method1550(class508.field4092 + var1);
			field92.method1821(var15);
		}

		if (var2 == 46) {
			var13 = field200[var3];
			if (var13 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3890, field92.field2665);
				var11.field1141.method1550(var3);
				var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 22) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3898, field92.field2665);
			var15.field1141.method1517(var0 + class265.field2147);
			var15.field1141.method1522(var1 + class508.field4092);
			var15.field1141.method1512(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1522(var3);
			field92.method1821(var15);
		}

		if (var2 == 58) {
			var14 = class131.method753(var1, var0);
			if (var14 != null) {
				if (null != var14.field1318) {
					class20 var20 = new class20();
					var20.field377 = var14;
					var20.field382 = var3;
					var20.field386 = var6;
					var20.field380 = var14.field1318;
					class175.method1006(var20);
				}

				var11 = class121.method689(class480.field3841, field92.field2665);
				var11.field1141.method1544(field161);
				var11.field1141.method1522(var0);
				var11.field1141.method1517(field195);
				var11.field1141.method1522(var4);
				var11.field1141.method1530(class515.field4126);
				var11.field1141.method1529(var1);
				field92.method1821(var11);
			}
		}

		if (var2 == 5) {
			field147 = var7;
			field148 = var8;
			field264 = 2;
			field206 = 0;
			field278 = var0;
			field201 = var1;
			var15 = class121.method689(class480.field3866, field92.field2665);
			var15.field1141.method1522(var3);
			var15.field1141.method1517(class265.field2147 + var0);
			var15.field1141.method1512(field175.method1783(82) ? 1 : 0);
			var15.field1141.method1522(class508.field4092 + var1);
			field92.method1821(var15);
		}

		if (var2 == 50) {
			var13 = field200[var3];
			if (var13 != null) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var11 = class121.method689(class480.field3926, field92.field2665);
				var11.field1141.method1550(var3);
				var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
				field92.method1821(var11);
			}
		}

		if (var2 == 25) {
			var14 = class131.method753(var1, var0);
			if (null != var14) {
				class446.method2348();
				method247(var1, var0, class200.method1122(method209(var14)), var4);
				field192 = 0;
				field210 = method239(var14);
				if (null == field210) {
					field210 = class453.field3707;
				}

				if (var14.field1294) {
					field221 = var14.field1218 + class479.method2443(16777215);
				} else {
					field221 = class479.method2443(65280) + var14.field1322 + class479.method2443(16777215);
				}
			}

		} else {
			if (var2 == 17) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var15 = class121.method689(class480.field3919, field92.field2665);
				var15.field1141.method1550(var0 + class265.field2147);
				var15.field1141.method1512(field175.method1783(82) ? 1 : 0);
				var15.field1141.method1544(field161);
				var15.field1141.method1517(field195);
				var15.field1141.method1530(class515.field4126);
				var15.field1141.method1544(var1 + class508.field4092);
				var15.field1141.method1544(var3);
				field92.method1821(var15);
			}

			if (var2 == 20) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var15 = class121.method689(class480.field3861, field92.field2665);
				var15.field1141.method1550(var1 + class508.field4092);
				var15.field1141.method1512(field175.method1783(82) ? 1 : 0);
				var15.field1141.method1517(var3);
				var15.field1141.method1550(var0 + class265.field2147);
				field92.method1821(var15);
			}

			if (var2 == 3) {
				field147 = var7;
				field148 = var8;
				field264 = 2;
				field206 = 0;
				field278 = var0;
				field201 = var1;
				var15 = class121.method689(class480.field3906, field92.field2665);
				var15.field1141.method1522(class265.field2147 + var0);
				var15.field1141.method1550(class508.field4092 + var1);
				var15.field1141.method1481(field175.method1783(82) ? 1 : 0);
				var15.field1141.method1517(var3);
				field92.method1821(var15);
			}

			if (var2 == 51) {
				var13 = field200[var3];
				if (var13 != null) {
					field147 = var7;
					field148 = var8;
					field264 = 2;
					field206 = 0;
					field278 = var0;
					field201 = var1;
					var11 = class121.method689(class480.field3922, field92.field2665);
					var11.field1141.method1481(field175.method1783(82) ? 1 : 0);
					var11.field1141.method1544(var3);
					field92.method1821(var11);
				}
			}

			if (var2 == 7) {
				var10 = field87[var3];
				if (null != var10) {
					field147 = var7;
					field148 = var8;
					field264 = 2;
					field206 = 0;
					field278 = var0;
					field201 = var1;
					var11 = class121.method689(class480.field3896, field92.field2665);
					var11.field1141.method1550(class305.field2471);
					var11.field1141.method1550(class249.field2082);
					var11.field1141.method1501(class98.field979);
					var11.field1141.method1550(var3);
					var11.field1141.method1512(field175.method1783(82) ? 1 : 0);
					field92.method1821(var11);
				}
			}

			if (field192 != 0) {
				field192 = 0;
				method213(class131.method756(class98.field979));
			}

			if (field119) {
				class446.method2348();
			}

		}
	}

	@ObfInfo(name = "la", desc = "(IIIII)V")
	static void method247(int var0, int var1, int var2, int var3) {
		class131 var5 = class131.method753(var0, var1);
		if (var5 != null && null != var5.field1308) {
			class20 var6 = new class20();
			var6.field377 = var5;
			var6.field380 = var5.field1308;
			class175.method1006(var6);
		}

		field161 = var3;
		field119 = true;
		class515.field4126 = var0;
		field195 = var1;
		class34.field485 = var2;
		method213(var5);
	}

	@ObfInfo(name = "ls", desc = "(IIS)V")
	static void method279(int var0, int var1) {
		class121 var3 = class121.method689(class480.field3883, field92.field2665);
		var3.field1141.method1501(var0);
		var3.field1141.method1550(var1);
		field92.method1821(var3);
	}

	@ObfInfo(name = "ly", desc = "(IIIILjava/lang/String;I)V")
	static void method142(int var0, int var1, int var2, int var3, String var4) {
		class131 var6 = class131.method753(var1, var2);
		if (null != var6) {
			if (var6.field1317 != null) {
				class20 var7 = new class20();
				var7.field377 = var6;
				var7.field382 = var0;
				var7.field386 = var4;
				var7.field380 = var6.field1317;
				class175.method1006(var7);
			}

			boolean var12 = true;
			if (var6.field1240 > 0) {
				var12 = class238.method1256(var6);
			}

			if (var12) {
				int var9 = method209(var6);
				int var10 = var0 - 1;
				boolean var8 = (var9 >> var10 + 1 & 1) != 0;
				if (var8) {
					class121 var11;
					if (var0 == 1) {
						var11 = class121.method689(class480.field3853, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 2) {
						var11 = class121.method689(class480.field3843, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 3) {
						var11 = class121.method689(class480.field3895, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 4) {
						var11 = class121.method689(class480.field3860, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 5) {
						var11 = class121.method689(class480.field3876, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 6) {
						var11 = class121.method689(class480.field3832, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 7) {
						var11 = class121.method689(class480.field3874, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 8) {
						var11 = class121.method689(class480.field3828, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 9) {
						var11 = class121.method689(class480.field3903, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

					if (var0 == 10) {
						var11 = class121.method689(class480.field3859, field92.field2665);
						var11.field1141.method1547(var1);
						var11.field1141.method1522(var2);
						var11.field1141.method1522(var3);
						field92.method1821(var11);
					}

				}
			}
		}
	}

	@ObfInfo(name = "lg", desc = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
	public static final void method262(String var0, String var1, int var2, int var3, int var4, int var5) {
		method167(var0, var1, var2, var3, var4, var5, -1, false);
	}

	@ObfInfo(name = "lk", desc = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
	static final void method167(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!field140) {
			if (field176 < 500) {
				field182[field176] = var0;
				field301[field176] = var1;
				field220[field176] = var2;
				field180[field176] = var3;
				field177[field176] = var4;
				field178[field176] = var5;
				field181[field176] = var6;
				field184[field176] = var7;
				++field176;
			}

		}
	}

	@ObfInfo(name = "ln", desc = "(IB)Ljava/lang/String;")
	static String method199(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return field301[var0].length() > 0 ? field182[var0] + class453.field3445 + field301[var0] : field182[var0];
		}
	}

	@ObfInfo(name = "lc", desc = "(IIIIB)V")
	static final void method183(int var0, int var1, int var2, int var3) {
		if (field192 == 0 && !field119) {
			method262(class453.field3566, "", 23, 0, var0 - var2, var1 - var3);
		}

		long var5 = -1L;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = class487.field3967;
			if (var9 >= var11) {
				if (var5 != -1L) {
					var9 = (int)(var5 >>> 0 & 127L);
					var11 = (int)(var5 >>> 7 & 127L);
					class439 var13 = field200[field166];
					method218(var13, field166, var9, var11);
				}

				return;
			}

			long var12 = class487.method2466(var9);
			if (var7 != var12) {
				label306: {
					var7 = var12;
					int var14 = class487.method2460(var9);
					int var15 = class487.method2459(var9);
					int var16 = class487.method2464(class487.field3969[var9]);
					int var18 = class487.method2465(class487.field3969[var9]);
					int var19 = var18;
					int var23;
					if (var16 == 2 && class27.field448.method1074(class401.field3120, var14, var15, var12) >= 0) {
						class292 var20 = class185.method1043(var18, (byte)-22);
						if (var20.field2365 != null) {
							var20 = var20.method1614();
						}

						if (var20 == null) {
							break label306;
						}

						class296 var21 = null;

						for (class296 var22 = (class296)field168.method627(); null != var22; var22 = (class296)field168.method629()) {
							if (class401.field3120 == var22.field2401 && var22.field2394 == var14 && var22.field2400 == var15 && var22.field2393 == var19) {
								var21 = var22;
								break;
							}
						}

						if (field192 == 1) {
							method262(class453.field3561, field193 + " " + class479.field3824 + " " + class479.method2443(65535) + var20.field2334, 1, var19, var14, var15);
						} else if (field119) {
							if ((class34.field485 & 4) == 4) {
								method262(field210, field221 + " " + class479.field3824 + " " + class479.method2443(65535) + var20.field2334, 2, var19, var14, var15);
							}
						} else {
							String[] var30 = var20.field2343;
							if (null != var30) {
								for (var23 = 4; var23 >= 0; --var23) {
									if ((var21 == null || var21.method1637(var23)) && null != var30[var23]) {
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

										method262(var30[var23], class479.method2443(65535) + var20.field2334, var24, var19, var14, var15);
									}
								}
							}

							method262(class453.field3562, class479.method2443(65535) + var20.field2334, 1002, var20.field2331, var14, var15);
						}
					}

					int var29;
					class412 var31;
					int[] var32;
					class439 var36;
					if (var16 == 1) {
						class412 var26 = field87[var19];
						if (var26 == null) {
							break label306;
						}

						if (var26.field3178.field3057 == 1 && (var26.field1061 & 127) == 64 && (var26.field1032 & 127) == 64) {
							for (var29 = 0; var29 < field88; ++var29) {
								var31 = field87[field26[var29]];
								if (null != var31 && var26 != var31 && var31.field3178.field3057 == 1 && var26.field1061 == var31.field1061 && var31.field1032 == var26.field1032) {
									method231(var31, field26[var29], var14, var15);
								}
							}

							var29 = class183.field1652;
							var32 = class183.field1653;

							for (var23 = 0; var23 < var29; ++var23) {
								var36 = field200[var32[var23]];
								if (var36 != null && var26.field1061 == var36.field1061 && var36.field1032 == var26.field1032) {
									method218(var36, var32[var23], var14, var15);
								}
							}
						}

						method231(var26, var19, var14, var15);
					}

					if (var16 == 0) {
						class439 var27 = field200[var19];
						if (var27 == null) {
							break label306;
						}

						if ((var27.field1061 & 127) == 64 && (var27.field1032 & 127) == 64) {
							for (var29 = 0; var29 < field88; ++var29) {
								var31 = field87[field26[var29]];
								if (null != var31 && var31.field3178.field3057 == 1 && var31.field1061 == var27.field1061 && var31.field1032 == var27.field1032) {
									method231(var31, field26[var29], var14, var15);
								}
							}

							var29 = class183.field1652;
							var32 = class183.field1653;

							for (var23 = 0; var23 < var29; ++var23) {
								var36 = field200[var32[var23]];
								if (var36 != null && var27 != var36 && var27.field1061 == var36.field1061 && var36.field1032 == var27.field1032) {
									method218(var36, var32[var23], var14, var15);
								}
							}
						}

						if (field166 != var19) {
							method218(var27, var19, var14, var15);
						} else {
							var5 = var12;
						}
					}

					if (var16 == 3) {
						class113 var28 = field167[class401.field3120][var14][var15];
						if (null != var28) {
							for (class432 var33 = (class432)var28.method628(); null != var33; var33 = (class432)var28.method633()) {
								class270 var34 = class270.method1424(var33.field3272);
								if (field192 == 1) {
									method262(class453.field3561, field193 + " " + class479.field3824 + " " + class479.method2443(16748608) + var34.field2186, 16, var33.field3272, var14, var15);
								} else if (field119) {
									if ((class34.field485 & 1) == 1) {
										method262(field210, field221 + " " + class479.field3824 + " " + class479.method2443(16748608) + var34.field2186, 17, var33.field3272, var14, var15);
									}
								} else {
									String[] var35 = var34.field2187;

									for (int var37 = 4; var37 >= 0; --var37) {
										if (var33.method2250(var37)) {
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

												method262(var35[var37], class479.method2443(16748608) + var34.field2186, var25, var33.field3272, var14, var15);
											} else if (var37 == 2) {
												method262(class453.field3560, class479.method2443(16748608) + var34.field2186, 20, var33.field3272, var14, var15);
											}
										}
									}

									method262(class453.field3562, class479.method2443(16748608) + var34.field2186, 1004, var33.field3272, var14, var15);
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}

	@ObfInfo(name = "lv", desc = "(Ldx;IIIB)V")
	static final void method231(class412 var0, int var1, int var2, int var3) {
		class395 var5 = var0.field3178;
		if (field176 < 400) {
			if (null != var5.field3084) {
				var5 = var5.method2099();
			}

			if (var5 != null) {
				if (var5.field3090) {
					if (!var5.field3092 || var1 == field62) {
						String var6 = var0.method2171();
						int var7;
						if (var5.field3080 != 0 && var0.field1107 != 0) {
							var7 = var0.field1107 != -1 ? var0.field1107 : var5.field3080;
							var6 = var6 + class129.method707(var7, class126.field1164.field3304) + " " + class479.field3819 + class453.field3407 + var7 + class479.field3821;
						}

						if (var5.field3092 && field185) {
							method262(class453.field3562, class479.method2443(16776960) + var6, 1003, var1, var2, var3);
						}

						if (field192 == 1) {
							method262(class453.field3561, field193 + " " + class479.field3824 + " " + class479.method2443(16776960) + var6, 7, var1, var2, var3);
						} else if (field119) {
							if ((class34.field485 & 2) == 2) {
								method262(field210, field221 + " " + class479.field3824 + " " + class479.method2443(16776960) + var6, 8, var1, var2, var3);
							}
						} else {
							var7 = var5.field3092 && field185 ? 2000 : 0;
							String[] var8 = var5.field3054;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method2170(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class453.field3563)) {
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

										method262(var8[var9], class479.method2443(16776960) + var6, var10, var1, var2, var3);
									}
								}
							}

							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method2170(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class453.field3563)) {
										short var11 = 0;
										if (class535.field4263 != field57) {
											if (class535.field4262 == field57 || field57 == class535.field4267 && var5.field3080 > class126.field1164.field3304) {
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

											method262(var8[var9], class479.method2443(16776960) + var6, var10, var1, var2, var3);
										}
									}
								}
							}

							if (!var5.field3092 || !field185) {
								method262(class453.field3562, class479.method2443(16776960) + var6, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}

	@ObfInfo(name = "lr", desc = "(Ldf;IIII)V")
	static final void method218(class439 var0, int var1, int var2, int var3) {
		if (class126.field1164 != var0) {
			if (field176 < 400) {
				String var5;
				if (var0.field3312 == 0) {
					var5 = var0.field3302[0] + var0.field3315 + var0.field3302[1] + class129.method707(var0.field3304, class126.field1164.field3304) + " " + class479.field3819 + class453.field3407 + var0.field3304 + class479.field3821 + var0.field3302[2];
				} else {
					var5 = var0.field3302[0] + var0.field3315 + var0.field3302[1] + " " + class479.field3819 + class453.field3571 + var0.field3312 + class479.field3821 + var0.field3302[2];
				}

				int var6;
				if (field192 == 1) {
					method262(class453.field3561, field193 + " " + class479.field3824 + " " + class479.method2443(16777215) + var5, 14, var1, var2, var3);
				} else if (field119) {
					if ((class34.field485 & 8) == 8) {
						method262(field210, field221 + " " + class479.field3824 + " " + class479.method2443(16777215) + var5, 15, var1, var2, var3);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (null != field50[var6]) {
							short var7 = 0;
							if (field50[var6].equalsIgnoreCase(class453.field3563)) {
								if (class535.field4263 == field56) {
									continue;
								}

								if (class535.field4262 == field56 || field56 == class535.field4267 && var0.field3304 > class126.field1164.field3304) {
									var7 = 2000;
								}

								if (class126.field1164.field3325 != 0 && var0.field3325 != 0) {
									if (class126.field1164.field3325 == var0.field3325) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (field56 == class535.field4264 && var0.method2308()) {
									var7 = 2000;
								}
							} else if (field164[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = var7 + field162[var6];
							method262(field50[var6], class479.method2443(16777215) + var5, var9, var1, var2, var3);
						}
					}
				}

				for (var6 = 0; var6 < field176; ++var6) {
					if (field220[var6] == 23) {
						field301[var6] = class479.method2443(16777215) + var5;
						break;
					}
				}

			}
		}
	}

	@ObfInfo(name = "lj", desc = "(IIIIIIIIB)V")
	static final void method139(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class131.method760(var0)) {
			class164.field1558 = null;
			method182(class121.field1142[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (null != class164.field1558) {
				method182(class164.field1558, -1412584499, var1, var2, var3, var4, class441.field3329, class369.field2869, var7);
				class164.field1558 = null;
			}

		} else {
			if (var7 != -1) {
				field37[var7] = true;
			} else {
				for (int var9 = 0; var9 < 100; ++var9) {
					field37[var9] = true;
				}
			}

		}
	}

	@ObfInfo(name = "lz", desc = "([Lmi;IIIIIIIII)V")
	static final void method182(class131[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class83.method549(var2, var3, var4, var5);
		class276.method1453();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			class131 var11 = var0[var10];
			if (null != var11 && (var11.field1231 == var1 || var1 == -1412584499 && field211 == var11)) {
				int var12;
				if (var8 == -1) {
					field252[field198] = var11.field1215 + var6;
					field253[field198] = var7 + var11.field1228;
					field254[field198] = var11.field1229;
					field255[field198] = var11.field1206;
					var12 = ++field198 - 1;
				} else {
					var12 = var8;
				}

				var11.field1353 = var12;
				var11.field1354 = field330;
				if (!var11.field1294 || !method186(var11)) {
					if (var11.field1240 > 0) {
						method206(var11);
					}

					int var13 = var11.field1215 + var6;
					int var14 = var11.field1228 + var7;
					int var15 = var11.field1235;
					int var16;
					int var17;
					if (var11 == field211) {
						if (var1 != -1412584499 && !var11.field1295) {
							class164.field1558 = var0;
							class441.field3329 = var6;
							class369.field2869 = var7;
							continue;
						}

						if (field222 && field216) {
							var16 = class166.field1580;
							var17 = class166.field1563;
							var16 -= field213;
							var17 -= field286;
							if (var16 < field217) {
								var16 = field217;
							}

							if (var16 + var11.field1229 > field217 + field230.field1229) {
								var16 = field230.field1229 + field217 - var11.field1229;
							}

							if (var17 < field218) {
								var17 = field218;
							}

							if (var17 + var11.field1206 > field218 + field230.field1206) {
								var17 = field218 + field230.field1206 - var11.field1206;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field1295) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					int var23;
					if (var11.field1216 == 9) {
						var20 = var13;
						var21 = var14;
						var22 = var11.field1229 + var13;
						var23 = var14 + var11.field1206;
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
						var20 = var13 + var11.field1229;
						var21 = var14 + var11.field1206;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var20 < var4 ? var20 : var4;
						var19 = var21 < var5 ? var21 : var5;
					}

					if (!var11.field1294 || var16 < var18 && var17 < var19) {
						if (var11.field1240 != 0) {
							if (var11.field1240 == 1336) {
								if (class281.field2262.method1755()) {
									var14 += 15;
									class256.field2112.method1652("Fps:" + class346.field2720, var13 + var11.field1229, var14, 16776960, -1);
									var14 += 15;
									Runtime var45 = Runtime.getRuntime();
									var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var22 = 16776960;
									if (var21 > 327680 && !field31) {
										var22 = 16711680;
									}

									class256.field2112.method1652("Mem:" + var21 + "k", var11.field1229 + var13, var14, var22, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field1240 == 1337) {
								field188 = var13;
								field189 = var14;
								method188(var13, var14, var11.field1229, var11.field1206);
								field37[var11.field1353] = true;
								class83.method549(var2, var3, var4, var5);
								continue;
							}

							if (var11.field1240 == 1338) {
								method132(var11, var13, var14, var12);
								class83.method549(var2, var3, var4, var5);
								continue;
							}

							if (var11.field1240 == 1339) {
								method126(var11, var13, var14, var12);
								class83.method549(var2, var3, var4, var5);
								continue;
							}

							if (var11.field1240 == 1400) {
								class34.field483.method1328(var13, var14, var11.field1229, var11.field1206, field330);
							}

							if (var11.field1240 == 1401) {
								class34.field483.method1318(var13, var14, var11.field1229, var11.field1206);
							}

							if (var11.field1240 == 1402) {
								class365.field2837.method1381(var13, field330);
							}
						}

						if (var11.field1216 == 0) {
							if (!var11.field1294 && method186(var11) && class220.field1934 != var11) {
								continue;
							}

							if (!var11.field1294) {
								if (var11.field1247 > var11.field1236 - var11.field1206) {
									var11.field1247 = var11.field1236 - var11.field1206;
								}

								if (var11.field1247 < 0) {
									var11.field1247 = 0;
								}
							}

							method182(var0, var11.field1214, var16, var17, var18, var19, var13 - var11.field1233, var14 - var11.field1247, var12);
							if (null != var11.field1346) {
								method182(var11.field1346, var11.field1214, var16, var17, var18, var19, var13 - var11.field1233, var14 - var11.field1247, var12);
							}

							class58 var29 = (class58)field48.method2129((long)var11.field1214);
							if (null != var29) {
								method139(var29.field727, var16, var17, var18, var19, var13, var14, var12);
							}

							class83.method549(var2, var3, var4, var5);
							class276.method1453();
						} else if (var11.field1216 == 11) {
							if (method186(var11) && var11 != class220.field1934) {
								continue;
							}

							if (var11.field1346 != null) {
								method182(var11.field1346, var11.field1214, var16, var17, var18, var19, var13 - var11.field1233, var14 - var11.field1247, var12);
							}

							class83.method549(var2, var3, var4, var5);
							class276.method1453();
						}

						if (field258 || field251[var12] || field256 > 1) {
							if (var11.field1216 == 0 && !var11.field1294 && var11.field1236 > var11.field1206) {
								method198(var13 + var11.field1229, var14, var11.field1247, var11.field1206, var11.field1236);
							}

							if (var11.field1216 != 1) {
								if (var11.field1216 == 3) {
									if (method136(var11)) {
										var20 = var11.field1238;
										if (var11 == class220.field1934 && var11.field1284 != 0) {
											var20 = var11.field1284;
										}
									} else {
										var20 = var11.field1237;
										if (class220.field1934 == var11 && var11.field1241 != 0) {
											var20 = var11.field1241;
										}
									}

									if (var11.field1276) {
										switch(var11.field1242.field3045) {
										case 1:
											class83.method543(var13, var14, var11.field1229, var11.field1206, var11.field1237, var11.field1238);
											break;
										case 2:
											class83.method556(var13, var14, var11.field1229, var11.field1206, var11.field1237, var11.field1238, 255 - (var11.field1235 & 255), 255 - (var11.field1244 & 255));
											break;
										default:
											if (var15 == 0) {
												class83.method542(var13, var14, var11.field1229, var11.field1206, var20);
											} else {
												class83.method541(var13, var14, var11.field1229, var11.field1206, var20, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										class83.method545(var13, var14, var11.field1229, var11.field1206, var20);
									} else {
										class83.method546(var13, var14, var11.field1229, var11.field1206, var20, 256 - (var15 & 255));
									}
								} else if (var11.field1216 == 4) {
									class258 var37 = var11.method721();
									if (var37 == null) {
										if (class131.field1213) {
											method213(var11);
										}
									} else {
										String var44 = var11.field1274;
										if (method136(var11)) {
											var21 = var11.field1238;
											if (var11 == class220.field1934 && var11.field1284 != 0) {
												var21 = var11.field1284;
											}

											if (var11.field1202.length() > 0) {
												var44 = var11.field1202;
											}
										} else {
											var21 = var11.field1237;
											if (class220.field1934 == var11 && var11.field1241 != 0) {
												var21 = var11.field1241;
											}
										}

										if (var11.field1294 && var11.field1342 != -1) {
											class270 var46 = class270.method1424(var11.field1342);
											var44 = var46.field2186;
											if (null == var44) {
												var44 = class453.field3707;
											}

											if ((var46.field2181 == 1 || var11.field1343 != 1) && var11.field1343 != -1) {
												var44 = class479.method2443(16748608) + var44 + class479.field3826 + " " + 'x' + method229(var11.field1343);
											}
										}

										if (field204 == var11) {
											var44 = class453.field3669;
											var21 = var11.field1237;
										}

										if (!var11.field1294) {
											var44 = method236(var44, var11);
										}

										var37.method1654(var44, var13, var14, var11.field1229, var11.field1206, var21, var11.field1204 ? 0 : -1, class285.method1571(var11.field1235), var11.field1277, var11.field1335, var11.field1310);
									}
								} else {
									int var25;
									int var26;
									int var41;
									if (var11.field1216 == 5) {
										class150 var35;
										if (!var11.field1294) {
											var35 = var11.method742(method136(var11), class248.field2079);
											if (null != var35) {
												var35.method877(var13, var14);
											} else if (class131.field1213) {
												method213(var11);
											}
										} else {
											if (var11.field1342 != -1) {
												var35 = class270.method1422(var11.field1342, var11.field1343, var11.field1252, var11.field1253, var11.field1273, false);
											} else {
												var35 = var11.method742(false, class248.field2079);
											}

											if (var35 == null) {
												if (class131.field1213) {
													method213(var11);
												}
											} else {
												var21 = var35.field1461;
												var22 = var35.field1462;
												if (!var11.field1251) {
													var23 = var11.field1229 * 4096 / var21;
													if (var11.field1250 != 0) {
														var35.method871(var11.field1229 / 2 + var13, var11.field1206 / 2 + var14, var11.field1250, var23);
													} else if (var15 != 0) {
														var35.method865(var13, var14, var11.field1229, var11.field1206, 256 - (var15 & 255));
													} else if (var11.field1229 == var21 && var22 == var11.field1206) {
														var35.method877(var13, var14);
													} else {
														var35.method879(var13, var14, var11.field1229, var11.field1206);
													}
												} else {
													class83.method555(var13, var14, var11.field1229 + var13, var14 + var11.field1206);
													var23 = (var11.field1229 + (var21 - 1)) / var21;
													var41 = (var22 - 1 + var11.field1206) / var22;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var41; ++var26) {
															if (var11.field1250 != 0) {
																var35.method871(var21 * var25 + var13 + var21 / 2, var14 + var22 * var26 + var22 / 2, var11.field1250, 4096);
															} else if (var15 != 0) {
																var35.method875(var21 * var25 + var13, var14 + var22 * var26, 256 - (var15 & 255));
															} else {
																var35.method877(var21 * var25 + var13, var14 + var22 * var26);
															}
														}
													}

													class83.method549(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var27;
										if (var11.field1216 == 6) {
											boolean var33 = method136(var11);
											if (var33) {
												var21 = var11.field1334;
											} else {
												var21 = var11.field1260;
											}

											class384 var36 = null;
											var23 = 0;
											if (var11.field1342 != -1) {
												class270 var38 = class270.method1424(var11.field1342);
												if (null != var38) {
													var38 = var38.method1410(var11.field1343);
													var36 = var38.method1409(1);
													if (null != var36) {
														var36.method2045();
														var23 = var36.field4095 / 2;
													} else {
														method213(var11);
													}
												}
											} else if (var11.field1256 == 5) {
												if (var11.field1257 == 0) {
													var36 = field313.method1136((class202)null, -1, (class202)null, -1);
												} else {
													var36 = class126.field1164.method2515();
												}
											} else if (var11.field1256 == 7) {
												var36 = var11.field1270.method1136((class202)null, -1, class202.method1149(class126.field1164.field1037), class126.field1164.field1031);
											} else {
												class395 var39 = null;
												class451 var40 = null;
												if (var11.field1256 == 6) {
													var26 = var11.field1257;
													if (var26 >= 0 && var26 < field87.length) {
														class412 var43 = field87[var26];
														if (null != var43) {
															var39 = var43.field3178;
															var40 = var43.method2179();
														}
													}
												}

												class202 var42 = null;
												var27 = -1;
												if (var21 != -1) {
													var42 = class202.method1149(var21);
													var27 = var11.field1344;
												}

												var36 = var11.method722(var42, var27, var33, class126.field1164.field3299, var39, var40);
												if (var36 == null && class131.field1213) {
													method213(var11);
												}
											}

											class276.method1464(var11.field1229 / 2 + var13, var11.field1206 / 2 + var14);
											var41 = var11.field1267 * class276.field2236[var11.field1264] >> 16;
											var25 = class276.field2234[var11.field1264] * var11.field1267 >> 16;
											if (null != var36) {
												if (!var11.field1294) {
													var36.method2051(0, var11.field1282, 0, var11.field1264, 0, var41, var25);
												} else {
													var36.method2045();
													if (var11.field1287) {
														var36.method2059(0, var11.field1282, var11.field1329, var11.field1264, var11.field1262, var11.field1336 + var41 + var23, var11.field1336 + var25, var11.field1267);
													} else {
														var36.method2051(0, var11.field1282, var11.field1329, var11.field1264, var11.field1262, var11.field1336 + var41 + var23, var25 + var11.field1336);
													}
												}
											}

											class276.method1455();
										} else {
											class258 var31;
											if (var11.field1216 == 8 && class106.field1017 == var11 && field191 == field190) {
												var20 = 0;
												var21 = 0;
												var31 = class256.field2112;
												String var34 = var11.field1274;

												String var24;
												for (var34 = method236(var34, var11); var34.length() > 0; var21 += var31.field2414 + 1) {
													var25 = var34.indexOf(class479.field3825);
													if (var25 != -1) {
														var24 = var34.substring(0, var25);
														var34 = var34.substring(var25 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var26 = var31.method1646(var24);
													if (var26 > var20) {
														var20 = var26;
													}
												}

												var20 += 6;
												var21 += 7;
												var25 = var13 + var11.field1229 - 5 - var20;
												var26 = var14 + var11.field1206 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var20 + var25 > var4) {
													var25 = var4 - var20;
												}

												if (var21 + var26 > var5) {
													var26 = var5 - var21;
												}

												class83.method542(var25, var26, var20, var21, 16777120);
												class83.method545(var25, var26, var20, var21, 0);
												var34 = var11.field1274;
												var27 = var26 + var31.field2414 + 2;

												for (var34 = method236(var34, var11); var34.length() > 0; var27 += var31.field2414 + 1) {
													int var28 = var34.indexOf(class479.field3825);
													if (var28 != -1) {
														var24 = var34.substring(0, var28);
														var34 = var34.substring(var28 + 4);
													} else {
														var24 = var34;
														var34 = "";
													}

													var31.method1674(var24, var25 + 3, var27, 0, -1);
												}
											}

											if (var11.field1216 == 9) {
												if (var11.field1246) {
													var20 = var13;
													var21 = var11.field1206 + var14;
													var22 = var11.field1229 + var13;
													var23 = var14;
												} else {
													var20 = var13;
													var21 = var14;
													var22 = var13 + var11.field1229;
													var23 = var11.field1206 + var14;
												}

												if (var11.field1245 == 1) {
													class83.method544(var20, var21, var22, var23, var11.field1237);
												} else {
													method260(var20, var21, var22, var23, var11.field1237, var11.field1245);
												}
											} else if (var11.field1216 == 12) {
												class4 var30 = var11.method751();
												class421 var32 = var11.method737();
												if (null != var30 && null != var32 && var30.method49()) {
													var31 = var11.method721();
													if (var31 != null) {
														field241.method2479(var13, var14, var11.field1229, var11.field1206, var30.method50(), var30.method75(), var30.method47(), var30.method48(), var30.method68());
														var23 = var11.field1204 ? var11.field1253 : -1;
														if (!var30.method45() && var30.method69().method1864()) {
															field241.method2480(var32.field3232, var23, var32.field3230, var32.field3231);
															field241.method2481(var30.method43(), var31, (byte)-101);
														} else {
															field241.method2480(var11.field1237, var23, var32.field3230, var32.field3231);
															field241.method2481(var30.method69(), var31, (byte)-117);
														}

														class83.method549(var2, var3, var4, var5);
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

	@ObfInfo(name = "lf", desc = "(IIIIIIB)V")
	static final void method260(int var0, int var1, int var2, int var3, int var4, int var5) {
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
			var0 -= class83.field875;
			var1 -= class83.field876;
			int var18 = var0 + var14;
			int var19 = var0 - var15;
			int var20 = var7 + var0 - var15;
			int var21 = var14 + var0 + var7;
			int var22 = var1 + var16;
			int var23 = var1 - var17;
			int var24 = var1 + var8 - var17;
			int var25 = var16 + var8 + var1;
			class276.method1456(var18, var19, var20);
			class276.method1466(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
			class276.method1456(var18, var20, var21);
			class276.method1466(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfInfo(name = "lq", desc = "(Ljava/lang/String;Lmi;B)Ljava/lang/String;")
	static String method236(String var0, class131 var1) {
		if (var0.indexOf("%") != -1) {
			for (int var3 = 1; var3 <= 5; ++var3) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					var0 = var0.substring(0, var4) + class69.method503(method172(var1, var3 - 1)) + var0.substring(var4 + 2);
				}
			}
		}

		return var0;
	}

	@ObfInfo(name = "lh", desc = "(IB)Ljava/lang/String;")
	static final String method229(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + class479.field3823 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + class479.method2443(65408) + var2.substring(0, var2.length() - 8) + class453.field3466 + " " + class479.field3819 + var2 + class479.field3821 + class479.field3826;
		} else {
			return var2.length() > 6 ? " " + class479.method2443(16777215) + var2.substring(0, var2.length() - 4) + class453.field3574 + " " + class479.field3819 + var2 + class479.field3821 + class479.field3826 : " " + class479.method2443(16776960) + var2 + class479.field3826;
		}
	}

	@ObfInfo(name = "lb", desc = "([Lmi;Lmi;ZI)V")
	static void method152(class131[] var0, class131 var1, boolean var2) {
		int var4 = var1.field1301 != 0 ? var1.field1301 : var1.field1229;
		int var5 = var1.field1236 != 0 ? var1.field1236 : var1.field1206;
		method133(var0, var1.field1214, var4, var5, var2);
		if (null != var1.field1346) {
			method133(var1.field1346, var1.field1214, var4, var5, var2);
		}

		class58 var6 = (class58)field48.method2129((long)var1.field1214);
		if (var6 != null) {
			int var7 = var6.field727;
			if (class131.method760(var7)) {
				method133(class121.field1142[var7], -1, var4, var5, var2);
			}
		}

		if (var1.field1240 == 1337) {
		}

	}

	@ObfInfo(name = "md", desc = "([Lmi;IIIZI)V")
	static void method133(class131[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class131 var7 = var0[var6];
			if (null != var7 && var7.field1231 == var1) {
				method258(var7, var2, var3, var4);
				method223(var7, var2, var3);
				if (var7.field1233 > var7.field1301 - var7.field1229) {
					var7.field1233 = var7.field1301 - var7.field1229;
				}

				if (var7.field1233 < 0) {
					var7.field1233 = 0;
				}

				if (var7.field1247 > var7.field1236 - var7.field1206) {
					var7.field1247 = var7.field1236 - var7.field1206;
				}

				if (var7.field1247 < 0) {
					var7.field1247 = 0;
				}

				if (var7.field1216 == 0) {
					method152(var0, var7, var4);
				}
			}
		}

	}

	@ObfInfo(name = "mh", desc = "(Lmi;IIZI)V")
	static void method258(class131 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field1229;
		int var6 = var0.field1206;
		if (var0.field1221 == 0) {
			var0.field1229 = var0.field1225;
		} else if (var0.field1221 == 1) {
			var0.field1229 = var1 - var0.field1225;
		} else if (var0.field1221 == 2) {
			var0.field1229 = var1 * var0.field1225 >> 14;
		}

		if (var0.field1222 == 0) {
			var0.field1206 = var0.field1226;
		} else if (var0.field1222 == 1) {
			var0.field1206 = var2 - var0.field1226;
		} else if (var0.field1222 == 2) {
			var0.field1206 = var2 * var0.field1226 >> 14;
		}

		if (var0.field1221 == 4) {
			var0.field1229 = var0.field1330 * var0.field1206 / var0.field1230;
		}

		if (var0.field1222 == 4) {
			var0.field1206 = var0.field1229 * var0.field1230 / var0.field1330;
		}

		if (var0.field1240 == 1337) {
			field320 = var0;
		}

		if (var0.field1216 == 12) {
			var0.method751().method11(var0.field1229, var0.field1206);
		}

		if (var3 && var0.field1208 != null && (var5 != var0.field1229 || var6 != var0.field1206)) {
			class20 var7 = new class20();
			var7.field377 = var0;
			var7.field380 = var0.field1208;
			field242.method631(var7);
		}

	}

	@ObfInfo(name = "mv", desc = "(Lmi;IIB)V")
	static void method223(class131 var0, int var1, int var2) {
		if (var0.field1219 == 0) {
			var0.field1215 = var0.field1223;
		} else if (var0.field1219 == 1) {
			var0.field1215 = (var1 - var0.field1229) / 2 + var0.field1223;
		} else if (var0.field1219 == 2) {
			var0.field1215 = var1 - var0.field1229 - var0.field1223;
		} else if (var0.field1219 == 3) {
			var0.field1215 = var0.field1223 * var1 >> 14;
		} else if (var0.field1219 == 4) {
			var0.field1215 = (var1 * var0.field1223 >> 14) + (var1 - var0.field1229) / 2;
		} else {
			var0.field1215 = var1 - var0.field1229 - (var1 * var0.field1223 >> 14);
		}

		if (var0.field1220 == 0) {
			var0.field1228 = var0.field1224;
		} else if (var0.field1220 == 1) {
			var0.field1228 = var0.field1224 + (var2 - var0.field1206) / 2;
		} else if (var0.field1220 == 2) {
			var0.field1228 = var2 - var0.field1206 - var0.field1224;
		} else if (var0.field1220 == 3) {
			var0.field1228 = var0.field1224 * var2 >> 14;
		} else if (var0.field1220 == 4) {
			var0.field1228 = (var0.field1224 * var2 >> 14) + (var2 - var0.field1206) / 2;
		} else {
			var0.field1228 = var2 - var0.field1206 - (var2 * var0.field1224 >> 14);
		}

	}

	@ObfInfo(name = "mg", desc = "(Lmi;IIIIIIB)V")
	static final void method267(class131 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (field112) {
			field231 = 32;
		} else {
			field231 = 0;
		}

		field112 = false;
		int var8;
		if (class166.field1570 == 1 || !class146.field1455 && class166.field1570 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field1247 -= 4;
				method213(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
				var0.field1247 += 4;
				method213(var0);
			} else if (var5 >= var1 - field231 && var5 < field231 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
				var8 = var3 * (var3 - 32) / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field1247 = var9 * (var4 - var3) / var10;
				method213(var0);
				field112 = true;
			}
		}

		if (field240 != 0) {
			var8 = var0.field1229;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field1247 += field240 * 45;
				method213(var0);
			}
		}

	}

	@ObfInfo(name = "mq", desc = "(IIIIII)V")
	static final void method198(int var0, int var1, int var2, int var3, int var4) {
		class151.field1468[0].method2115(var0, var1);
		class151.field1468[1].method2115(var0, var1 + var3 - 16);
		class83.method542(var0, var1 + 16, 16, var3 - 32, field108);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
		class83.method542(var0, var1 + 16 + var7, 16, var6, field219);
		class83.method548(var0, var7 + var1 + 16, var6, field298);
		class83.method548(var0 + 1, var1 + 16 + var7, var6, field298);
		class83.method553(var0, var1 + 16 + var7, 16, field298);
		class83.method553(var0, var1 + 17 + var7, 16, field298);
		class83.method548(var0 + 15, var1 + 16 + var7, var6, field110);
		class83.method548(var0 + 14, var7 + var1 + 17, var6 - 1, field110);
		class83.method553(var0, var6 + var1 + 15 + var7, 16, field110);
		class83.method553(var0 + 1, var7 + var1 + 14 + var6, 15, field110);
	}

	@ObfInfo(name = "mk", desc = "(Lmi;B)Z")
	static final boolean method136(class131 var0) {
		if (null == var0.field1349) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field1349.length; ++var2) {
				int var3 = method172(var0, var2);
				int var4 = var0.field1337[var2];
				if (var0.field1349[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field1349[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var0.field1349[var2] == 4) {
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

	@ObfInfo(name = "mr", desc = "(Lmi;IB)I")
	static final int method172(class131 var0, int var1) {
		if (var0.field1278 != null && var1 < var0.field1278.length) {
			try {
				int[] var3 = var0.field1278[var1];
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
						var8 = field171[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = field319[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = field322[var3[var5++]];
					}

					int var10;
					class131 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class131.method756(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class270.method1424(var12).field2174 || field54)) {
							for (var13 = 0; var13 < var11.field1340.length; ++var13) {
								if (var11.field1340[var13] == var12 + 1) {
									var8 += var11.field1341[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = class44.field559[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = class79.field834[field319[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = class44.field559[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = class126.field1164.field3304;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class79.field832[var10]) {
								var8 += field319[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class131.method756(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class270.method1424(var12).field2174 || field54)) {
							for (var13 = 0; var13 < var11.field1340.length; ++var13) {
								if (var11.field1340[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = field144;
					}

					if (var7 == 12) {
						var8 = field314;
					}

					if (var7 == 13) {
						var10 = class44.field559[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class44.method444(var10);
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
						var8 = class265.field2147 + (class126.field1164.field1061 >> 7);
					}

					if (var7 == 19) {
						var8 = class508.field4092 + (class126.field1164.field1032 >> 7);
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

	@ObfInfo(name = "me", desc = "(Lmi;B)V")
	static final void method190(class131 var0) {
		String var2;
		int var3;
		int var4;
		if (var0.field1217 == 1) {
			var2 = var0.field1265;
			var3 = var0.field1214;
			var4 = var0.field1342;
			method167(var2, "", 24, 0, 0, var3, var4, false);
		}

		int var5;
		String var12;
		if (var0.field1217 == 2 && !field119) {
			var2 = method239(var0);
			if (var2 != null) {
				var12 = class479.method2443(65280) + var0.field1322;
				var4 = var0.field1214;
				var5 = var0.field1342;
				method167(var2, var12, 25, 0, -1, var4, var5, false);
			}
		}

		if (var0.field1217 == 3) {
			method262(class453.field3642, "", 26, 0, 0, var0.field1214);
		}

		if (var0.field1217 == 4) {
			method262(var0.field1265, "", 28, 0, 0, var0.field1214);
		}

		if (var0.field1217 == 5) {
			method262(var0.field1265, "", 29, 0, 0, var0.field1214);
		}

		if (var0.field1217 == 6 && field204 == null) {
			method262(var0.field1265, "", 30, 0, -1, var0.field1214);
		}

		if (var0.field1294) {
			int var6;
			int var7;
			int var8;
			String var13;
			String var15;
			if (field119) {
				var3 = method209(var0);
				boolean var10 = (var3 >> 21 & 1) != 0;
				if (var10 && (class34.field485 & 32) == 32) {
					var13 = field210;
					var15 = field221 + " " + class479.field3824 + " " + var0.field1218;
					var6 = var0.field1333;
					var7 = var0.field1214;
					var8 = var0.field1342;
					method167(var13, var15, 58, 0, var6, var7, var8, false);
				}
			} else {
				for (int var11 = 9; var11 >= 5; --var11) {
					var5 = method209(var0);
					boolean var14 = (var5 >> var11 + 1 & 1) != 0;
					if (!var14 && null == var0.field1317) {
						var12 = null;
					} else if (null != var0.field1292 && var0.field1292.length > var11 && null != var0.field1292[var11] && var0.field1292[var11].trim().length() != 0) {
						var12 = var0.field1292[var11];
					} else {
						var12 = null;
					}

					if (null != var12) {
						var15 = var0.field1218;
						var6 = var11 + 1;
						var7 = var0.field1333;
						var8 = var0.field1214;
						int var9 = var0.field1342;
						method167(var12, var15, 1007, var6, var7, var8, var9, false);
					}
				}

				var2 = method239(var0);
				if (var2 != null) {
					var12 = var0.field1218;
					var4 = var0.field1333;
					var5 = var0.field1214;
					var6 = var0.field1342;
					method167(var2, var12, 25, 0, var4, var5, var6, false);
				}

				for (var3 = 4; var3 >= 0; --var3) {
					var6 = method209(var0);
					boolean var17 = (var6 >> var3 + 1 & 1) != 0;
					if (!var17 && var0.field1317 == null) {
						var13 = null;
					} else if (null != var0.field1292 && var0.field1292.length > var3 && null != var0.field1292[var3] && var0.field1292[var3].trim().length() != 0) {
						var13 = var0.field1292[var3];
					} else {
						var13 = null;
					}

					if (var13 != null) {
						method167(var13, var0.field1218, 57, var3 + 1, var0.field1333, var0.field1214, var0.field1342, var0.field1358);
					}
				}

				var4 = method209(var0);
				boolean var16 = (var4 & 1) != 0;
				if (var16) {
					method262(class453.field3403, "", 30, 0, var0.field1333, var0.field1214);
				}
			}
		}

	}

	@ObfInfo(name = "mz", desc = "(ZB)V")
	static void method127(boolean var0) {
		field160 = var0;
	}

	@ObfInfo(name = "mc", desc = "(B)Z")
	static boolean method141() {
		return field160;
	}

	@ObfInfo(name = "mf", desc = "(IIIIIIII)V")
	static final void method153(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class131.method760(var0)) {
			class312.method1729(class121.field1142[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfInfo(name = "mj", desc = "(IB)Z")
	static boolean method266(int var0) {
		for (int var2 = 0; var2 < field267; ++var2) {
			if (field269[var2] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfInfo(name = "mw", desc = "(III)V")
	static final void method263(int var0, int var1) {
		if (class131.method760(var0)) {
			method220(class121.field1142[var0], var1);
		}
	}

	@ObfInfo(name = "mp", desc = "([Lmi;IB)V")
	static final void method220(class131[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class131 var4 = var0[var3];
			if (var4 != null) {
				if (var4.field1216 == 0) {
					if (var4.field1346 != null) {
						method220(var4.field1346, var1);
					}

					class58 var5 = (class58)field48.method2129((long)var4.field1214);
					if (var5 != null) {
						method263(var5.field727, var1);
					}
				}

				class20 var6;
				if (var1 == 0 && null != var4.field1261) {
					var6 = new class20();
					var6.field377 = var4;
					var6.field380 = var4.field1261;
					class175.method1006(var6);
				}

				if (var1 == 1 && var4.field1293 != null) {
					if (var4.field1333 >= 0) {
						class131 var7 = class131.method756(var4.field1214);
						if (var7 == null || var7.field1346 == null || var4.field1333 >= var7.field1346.length || var7.field1346[var4.field1333] != var4) {
							continue;
						}
					}

					var6 = new class20();
					var6.field377 = var4;
					var6.field380 = var4.field1293;
					class175.method1006(var6);
				}
			}
		}

	}

	@ObfInfo(name = "mt", desc = "(Lmi;III)V")
	static final void method216(class131 var0, int var1, int var2) {
		if (null == field211 && !field140) {
			if (null != var0 && method221(var0) != null) {
				field211 = var0;
				field230 = method221(var0);
				field213 = var1;
				field286 = var2;
				class362.field2821 = 0;
				field222 = false;
				int var4 = field176 - 1;
				if (var4 != -1) {
					class312.field2539 = new class152();
					class312.field2539.field1470 = field177[var4];
					class312.field2539.field1473 = field178[var4];
					class312.field2539.field1471 = field220[var4];
					class312.field2539.field1472 = field180[var4];
					class312.field2539.field1469 = field181[var4];
					class312.field2539.field1474 = field182[var4];
					class312.field2539.field1475 = field301[var4];
				}

			}
		}
	}

	@ObfInfo(name = "mm", desc = "(IIB)V", opaqueValue = "18")
	static void method120(int var0, int var1) {
		class152 var3 = class312.field2539;
		if (null != var3) {
			method273(var3.field1470, var3.field1473, var3.field1471, var3.field1472, var3.field1469, var3.field1474, var3.field1475, var0, var1);
		}

		class312.field2539 = null;
	}

	@ObfInfo(name = "mi", desc = "(Lmi;I)V")
	public static void method213(class131 var0) {
		if (null != var0 && field248 == var0.field1354) {
			field37[var0.field1353] = true;
		}

	}

	@ObfInfo(name = "mn", desc = "(I)V")
	static void method179() {
		for (class58 var1 = (class58)field48.method2130(); var1 != null; var1 = (class58)field48.method2131()) {
			int var2 = var1.field727;
			if (class131.method760(var2)) {
				boolean var3 = true;
				class131[] var4 = class121.field1142[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (null != var4[var5]) {
						var3 = var4[var5].field1294;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field1483;
					class131 var6 = class131.method756(var5);
					if (var6 != null) {
						method213(var6);
					}
				}
			}
		}

	}

	@ObfInfo(name = "mx", desc = "(Lmi;I)Lmi;")
	static class131 method221(class131 var0) {
		class131 var2 = method171(var0);
		if (null == var2) {
			var2 = var0.field1313;
		}

		return var2;
	}

	@ObfInfo(name = "my", desc = "(II)V")
	static final void method122(int var0) {
		if (class131.method760(var0)) {
			class131[] var2 = class121.field1142[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				class131 var4 = var2[var3];
				if (null != var4) {
					var4.field1344 = 0;
					var4.field1345 = 0;
				}
			}

		}
	}

	@ObfInfo(name = "ma", desc = "(II)V")
	static final void method245(int var0) {
		if (class131.method760(var0)) {
			method193(class121.field1142[var0], -1);
		}
	}

	@ObfInfo(name = "mo", desc = "([Lmi;II)V")
	static final void method193(class131[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class131 var4 = var0[var3];
			if (null != var4 && var1 == var4.field1231 && (!var4.field1294 || !method186(var4))) {
				int var6;
				if (var4.field1216 == 0) {
					if (!var4.field1294 && method186(var4) && class220.field1934 != var4) {
						continue;
					}

					method193(var0, var4.field1214);
					if (var4.field1346 != null) {
						method193(var4.field1346, var4.field1214);
					}

					class58 var5 = (class58)field48.method2129((long)var4.field1214);
					if (null != var5) {
						var6 = var5.field727;
						if (class131.method760(var6)) {
							method193(class121.field1142[var6], -1);
						}
					}
				}

				if (var4.field1216 == 6) {
					if (var4.field1260 != -1 || var4.field1334 != -1) {
						boolean var9 = method136(var4);
						if (var9) {
							var6 = var4.field1334;
						} else {
							var6 = var4.field1260;
						}

						if (var6 != -1) {
							class202 var7 = class202.method1149(var6);
							if (!var7.method1148()) {
								for (var4.field1345 += field106; var4.field1345 > var7.field1850[var4.field1344]; method213(var4)) {
									var4.field1345 -= var7.field1850[var4.field1344];
									++var4.field1344;
									if (var4.field1344 >= var7.field1839.length) {
										var4.field1344 -= var7.field1843;
										if (var4.field1344 < 0 || var4.field1344 >= var7.field1839.length) {
											var4.field1344 = 0;
										}
									}
								}
							} else {
								var4.field1344 += field106;
								int var8 = var7.method1145();
								if (var4.field1344 >= var8) {
									var4.field1344 -= var7.field1843;
									if (var4.field1344 < 0 || var4.field1344 >= var8) {
										var4.field1344 = 0;
									}
								}

								method213(var4);
							}
						}
					}

					if (var4.field1305 != 0 && !var4.field1294) {
						int var10 = var4.field1305 >> 16;
						var6 = var4.field1305 << 16 >> 16;
						var10 *= field106;
						var6 *= field106;
						var4.field1264 = var4.field1264 + var10 & 2047;
						var4.field1282 = var6 + var4.field1282 & 2047;
						method213(var4);
					}
				}
			}
		}

	}

	@ObfInfo(name = "ms", desc = "(II)V")
	static final void method129(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + (float)var0 / 200.0F;
		method159((double)var2);
	}

	@ObfInfo(name = "nq", desc = "(B)I")
	static final int method254() {
		float var1 = 200.0F * ((float)class281.field2262.method1767() - 0.5F);
		return 100 - Math.round(var1);
	}

	@ObfInfo(name = "na", desc = "(D)V")
	static final void method159(double var0) {
		class276.method1443(var0);
		((class458)class276.field2238.field4225).method2385(var0);
		class270.method1423();
		class281.field2262.method1769(var0);
	}

	@ObfInfo(name = "nm", desc = "(II)V")
	static final void method234(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class281.field2262.method1746()) {
			label35: {
				if (class281.field2262.method1746() == 0) {
					boolean var2 = !class303.field2448.isEmpty();
					if (var2) {
						class505 var3 = class323.field2609;
						if (!class303.field2448.isEmpty()) {
							ArrayList var4 = new ArrayList();
							Iterator var5 = class303.field2448.iterator();

							while (var5.hasNext()) {
								class503 var6 = (class503)var5.next();
								var6.field4064 = false;
								var6.field4062 = false;
								var6.field4068 = false;
								var6.field4065 = false;
								var6.field4060 = var3;
								var6.field4059 = var0;
								var6.field4056 = 0.0F;
								var4.add(var6);
							}

							class303.method1677(var4, class303.field2451, class303.field2452, class303.field2453, class303.field2444, false);
						}

						field299 = false;
						break label35;
					}
				}

				if (var0 == 0) {
					class333.method1815(0, 0);
					field299 = false;
				} else {
					class354.method1937(var0, (byte)57);
				}
			}

			class281.field2262.method1752(var0);
		}

	}

	@ObfInfo(name = "nl", desc = "(IB)V")
	static final void method264(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class281.field2262.method1753(var0);
	}

	@ObfInfo(name = "nd", desc = "(II)V")
	static final void method128(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class281.field2262.method1773(var0);
	}

	@ObfInfo(name = "ng", desc = "(IB)V")
	static final void method235(int var0) {
		method179();

		for (class470 var2 = (class470)class470.field3790.method627(); var2 != null; var2 = (class470)class470.field3790.method629()) {
			if (var2.field3800 != null) {
				var2.method2412();
			}
		}

		int var4 = class135.method773(var0).field466;
		if (var4 != 0) {
			int var3 = class44.field559[var0];
			if (var4 == 1) {
				if (var3 == 1) {
					class276.method1443(0.9D);
					((class458)class276.field2238.field4225).method2385(0.9D);
					class270.method1423();
					class281.field2262.method1769(0.9D);
				}

				if (var3 == 2) {
					class276.method1443(0.8D);
					((class458)class276.field2238.field4225).method2385(0.8D);
					class270.method1423();
					class281.field2262.method1769(0.8D);
				}

				if (var3 == 3) {
					method159(0.7D);
				}

				if (var3 == 4) {
					method159(0.6D);
				}
			}

			if (var4 == 3) {
				if (var3 == 0) {
					method234(255);
				}

				if (var3 == 1) {
					method234(192);
				}

				if (var3 == 2) {
					method234(128);
				}

				if (var3 == 3) {
					method234(64);
				}

				if (var3 == 4) {
					method234(0);
				}
			}

			if (var4 == 4) {
				if (var3 == 0) {
					method264(127);
				}

				if (var3 == 1) {
					method264(96);
				}

				if (var3 == 2) {
					method264(64);
				}

				if (var3 == 3) {
					method264(32);
				}

				if (var3 == 4) {
					method264(0);
				}
			}

			if (var4 == 5) {
				field174 = var3 == 1;
			}

			if (var4 == 6) {
				field203 = var3;
			}

			if (var4 == 9) {
			}

			if (var4 == 10) {
				if (var3 == 0) {
					method128(127);
				}

				if (var3 == 1) {
					method128(96);
				}

				if (var3 == 2) {
					method128(64);
				}

				if (var3 == 3) {
					method128(32);
				}

				if (var3 == 4) {
					method128(0);
				}
			}

			if (var4 == 17) {
				field62 = var3 & 65535;
			}

			if (var4 == 18) {
				field56 = (class535)class216.method1198(class535.method2585(), var3);
				if (field56 == null) {
					field56 = class535.field4267;
				}
			}

			if (var4 == 19) {
				if (var3 == -1) {
					field166 = -1;
				} else {
					field166 = var3 & 2047;
				}
			}

			if (var4 == 22) {
				field57 = (class535)class216.method1198(class535.method2585(), var3);
				if (null == field57) {
					field57 = class535.field4267;
				}
			}

		}
	}

	@ObfInfo(name = "nt", desc = "(Lmi;B)V")
	static final void method206(class131 var0) {
		int var2 = var0.field1240;
		if (var2 == 324) {
			if (field133 == -1) {
				field133 = var0.field1300;
				field315 = var0.field1248;
			}

			if (field313.field1818 == 1) {
				var0.field1300 = field133;
			} else {
				var0.field1300 = field315;
			}

		} else if (var2 == 325) {
			if (field133 == -1) {
				field133 = var0.field1300;
				field315 = var0.field1248;
			}

			if (field313.field1818 == 1) {
				var0.field1300 = field315;
			} else {
				var0.field1300 = field133;
			}

		} else if (var2 == 327) {
			var0.field1264 = 150;
			var0.field1282 = (int)(Math.sin((double)field330 / 40.0D) * 256.0D) & 2047;
			var0.field1256 = 5;
			var0.field1257 = 0;
		} else if (var2 == 328) {
			var0.field1264 = 150;
			var0.field1282 = (int)(Math.sin((double)field330 / 40.0D) * 256.0D) & 2047;
			var0.field1256 = 5;
			var0.field1257 = 1;
		}
	}

	@ObfInfo(name = "nv", desc = "(B)V")
	static final void method230() {
		class121 var1 = class121.method689(class480.field3835, field92.field2665);
		field92.method1821(var1);
		class175.field1616 = true;

		for (class58 var2 = (class58)field48.method2130(); var2 != null; var2 = (class58)field48.method2131()) {
			if (var2.field725 == 0 || var2.field725 == 3) {
				method165(var2, true);
			}
		}

		if (field204 != null) {
			method213(field204);
			field204 = null;
		}

		class175.field1616 = false;
	}

	@ObfInfo(name = "nb", desc = "(IIII)Lds;")
	static final class58 method250(int var0, int var1, int var2) {
		class58 var4 = new class58();
		var4.field727 = var1;
		var4.field725 = var2;
		field48.method2132(var4, (long)var0);
		method122(var1);
		class131 var5 = class131.method756(var0);
		method213(var5);
		if (null != field204) {
			method213(field204);
			field204 = null;
		}

		method152(class121.field1142[var0 >> 16], var5, false);
		class175.method999(var1);
		if (field199 != -1) {
			method263(field199, 1);
		}

		return var4;
	}

	@ObfInfo(name = "ns", desc = "(Lds;ZI)V")
	static final void method165(class58 var0, boolean var1) {
		int var3 = var0.field727;
		int var4 = (int)var0.field1483;
		var0.method907();
		if (var1) {
			class131.method758(var3);
		}

		method251(var3);
		class131 var5 = class131.method756(var4);
		if (var5 != null) {
			method213(var5);
		}

		if (field199 != -1) {
			method263(field199, 1);
		}

	}

	@ObfInfo(name = "ne", desc = "(Lmi;IIIB)V")
	static final void method132(class131 var0, int var1, int var2, int var3) {
		method242();
		class356 var5 = var0.method723(false);
		if (var5 != null) {
			class83.method549(var1, var2, var1 + var5.field2810, var2 + var5.field2809);
			if (field280 != 2 && field280 != 5) {
				int var6 = field205 & 2047;
				int var7 = class126.field1164.field1061 / 32 + 48;
				int var8 = 464 - class126.field1164.field1032 / 32;
				class381.field2929.method870(var1, var2, var5.field2810, var5.field2809, var7, var8, var6, 256, var5.field2812, var5.field2811);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < field274; ++var9) {
					var10 = field275[var9] * 4 + 2 - class126.field1164.field1061 / 32;
					var11 = 2 + 4 * field276[var9] - class126.field1164.field1032 / 32;
					method211(var1, var2, var10, var11, field285[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						class113 var17 = field167[class401.field3120][var9][var10];
						if (var17 != null) {
							var12 = 2 + var9 * 4 - class126.field1164.field1061 / 32;
							var13 = 2 + var10 * 4 - class126.field1164.field1032 / 32;
							method211(var1, var2, var12, var13, class102.field989[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < field88; ++var9) {
					class412 var15 = field87[field26[var9]];
					if (var15 != null && var15.method634()) {
						class395 var18 = var15.field3178;
						if (null != var18 && null != var18.field3084) {
							var18 = var18.method2099();
						}

						if (null != var18 && var18.field3079 && var18.field3090) {
							var12 = var15.field1061 / 32 - class126.field1164.field1061 / 32;
							var13 = var15.field1032 / 32 - class126.field1164.field1032 / 32;
							method211(var1, var2, var12, var13, class102.field989[1], var5);
						}
					}
				}

				var9 = class183.field1652;
				int[] var16 = class183.field1653;

				for (var11 = 0; var11 < var9; ++var11) {
					class439 var19 = field200[var16[var11]];
					if (var19 != null && var19.method634() && !var19.field3318 && var19 != class126.field1164) {
						var13 = var19.field1061 / 32 - class126.field1164.field1061 / 32;
						int var14 = var19.field1032 / 32 - class126.field1164.field1032 / 32;
						if (var19.method2298()) {
							method211(var1, var2, var13, var14, class102.field989[3], var5);
						} else if (class126.field1164.field3325 != 0 && var19.field3325 != 0 && var19.field3325 == class126.field1164.field3325) {
							method211(var1, var2, var13, var14, class102.field989[4], var5);
						} else if (var19.method2301()) {
							method211(var1, var2, var13, var14, class102.field989[5], var5);
						} else if (var19.method2308()) {
							method211(var1, var2, var13, var14, class102.field989[6], var5);
						} else {
							method211(var1, var2, var13, var14, class102.field989[2], var5);
						}
					}
				}

				if (field105 != 0 && field330 % 20 < 10) {
					if (field105 == 1 && field49 >= 0 && field49 < field87.length) {
						class412 var20 = field87[field49];
						if (null != var20) {
							var12 = var20.field1061 / 32 - class126.field1164.field1061 / 32;
							var13 = var20.field1032 / 32 - class126.field1164.field1032 / 32;
							method268(var1, var2, var12, var13, class212.field1899[1], var5);
						}
					}

					if (field105 == 2) {
						var11 = field51 * 4 - class265.field2147 * 4 + 2 - class126.field1164.field1061 / 32;
						var12 = 2 + (field194 * 4 - class508.field4092 * 4) - class126.field1164.field1032 / 32;
						method268(var1, var2, var11, var12, class212.field1899[1], var5);
					}

					if (field105 == 10 && field68 >= 0 && field68 < field200.length) {
						class439 var21 = field200[field68];
						if (null != var21) {
							var12 = var21.field1061 / 32 - class126.field1164.field1061 / 32;
							var13 = var21.field1032 / 32 - class126.field1164.field1032 / 32;
							method268(var1, var2, var12, var13, class212.field1899[1], var5);
						}
					}
				}

				if (field278 != 0) {
					var11 = field278 * 4 + 2 - class126.field1164.field1061 / 32;
					var12 = field201 * 4 + 2 - class126.field1164.field1032 / 32;
					method211(var1, var2, var11, var12, class212.field1899[0], var5);
				}

				if (!class126.field1164.field3318) {
					class83.method542(var1 + var5.field2810 / 2 - 1, var2 + var5.field2809 / 2 - 1, 3, 3, 16777215);
				}
			} else {
				class83.method550(var1, var2, 0, var5.field2812, var5.field2811);
			}

			field250[var3] = true;
		}
	}

	@ObfInfo(name = "ni", desc = "(Lmi;IIII)V")
	static final void method126(class131 var0, int var1, int var2, int var3) {
		class356 var5 = var0.method723(false);
		if (var5 != null) {
			if (field280 < 3) {
				field107.method870(var1, var2, var5.field2810, var5.field2809, 25, 25, field205, 256, var5.field2812, var5.field2811);
			} else {
				class83.method550(var1, var2, 0, var5.field2812, var5.field2811);
			}

		}
	}

	@ObfInfo(name = "nr", desc = "(IIIILui;Lme;I)V")
	static final void method268(int var0, int var1, int var2, int var3, class150 var4, class356 var5) {
		int var7 = var2 * var2 + var3 * var3;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = field205 & 2047;
			int var9 = class276.field2236[var8];
			int var10 = class276.field2234[var8];
			int var11 = var9 * var3 + var2 * var10 >> 16;
			int var12 = var10 * var3 - var2 * var9 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field2810 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			byte var18 = 20;
			class427.field3237.method848(var16 + (var5.field2810 / 2 + var0 - var18 / 2), var1 + var5.field2809 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
		} else {
			method211(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfInfo(name = "np", desc = "(IIIILui;Lme;I)V")
	static final void method211(int var0, int var1, int var2, int var3, class150 var4, class356 var5) {
		if (null != var4) {
			int var7 = field205 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = class276.field2236[var7];
				int var10 = class276.field2234[var7];
				int var11 = var2 * var10 + var9 * var3 >> 16;
				int var12 = var3 * var10 - var9 * var2 >> 16;
				if (var8 > 2500) {
					var4.method869(var5.field2810 / 2 + var11 - var4.field1461 / 2, var5.field2809 / 2 - var12 - var4.field1462 / 2, var0, var1, var5.field2810, var5.field2809, var5.field2812, var5.field2811);
				} else {
					var4.method877(var0 + var5.field2810 / 2 + var11 - var4.field1461 / 2, var5.field2809 / 2 + var1 - var12 - var4.field1462 / 2);
				}

			}
		}
	}

	@ObfInfo(name = "nn", desc = "(I)V")
	static final void method272() {
		Iterator var1 = class159.field1504.iterator();

		while (var1.hasNext()) {
			class212 var2 = (class212)var1.next();
			var2.method1185();
		}

		if (null != class54.field716) {
			class54.field716.method1332((byte)-1);
		}

	}

	@ObfInfo(name = "nw", desc = "(I)V")
	static final void method180() {
		field233 = field29;
	}

	@ObfInfo(name = "nk", desc = "(Ljava/lang/String;B)V")
	static final void method189(String var0) {
		if (class54.field716 != null) {
			class121 var2 = class121.method689(class480.field3914, field92.field2665);
			var2.field1141.method1481(class280.method1555(var0));
			var2.field1141.method1484(var0);
			field92.method1821(var2);
		}
	}

	@ObfInfo(name = "nj", desc = "(Ljava/lang/String;I)V")
	static final void method177(String var0) {
		if (!var0.equals("")) {
			class121 var2 = class121.method689(class480.field3894, field92.field2665);
			var2.field1141.method1481(class280.method1555(var0));
			var2.field1141.method1484(var0);
			field92.method1821(var2);
		}
	}

	@ObfInfo(name = "nu", desc = "(I)V")
	static final void method156() {
		class121 var1 = class121.method689(class480.field3894, field92.field2665);
		var1.field1141.method1481(0);
		field92.method1821(var1);
	}

	@ObfInfo(name = "nf", desc = "(III)V")
	static final void method169(int var0, int var1) {
		class143 var3 = var0 >= 0 ? field272[var0] : class263.field2126;
		if (var3 != null && var1 >= 0 && var1 < var3.method834()) {
			class524 var4 = (class524)var3.field1434.get(var1);
			if (var4.field4199 == -1) {
				String var5 = var4.field4198.method1935();
				class121 var6 = class121.method689(class480.field3856, field92.field2665);
				var6.field1141.method1481(3 + class280.method1555(var5));
				var6.field1141.method1481(var0);
				var6.field1141.method1522(var1);
				var6.field1141.method1484(var5);
				field92.method1821(var6);
			}
		}
	}

	@ObfInfo(name = "no", desc = "(III)V")
	static final void method261(int var0, int var1) {
		if (field272[var0] != null) {
			if (var1 >= 0 && var1 < field272[var0].method834()) {
				class524 var3 = (class524)field272[var0].field1434.get(var1);
				if (var3.field4199 == -1) {
					class121 var4 = class121.method689(class480.field3847, field92.field2665);
					var4.field1141.method1481(3 + class280.method1555(var3.field4198.method1935()));
					var4.field1141.method1481(var0);
					var4.field1141.method1522(var1);
					var4.field1141.method1484(var3.field4198.method1935());
					field92.method1821(var4);
				}
			}
		}
	}

	@ObfInfo(name = "nh", desc = "(IB)V")
	static void method251(int var0) {
		for (class149 var2 = (class149)field246.method2130(); null != var2; var2 = (class149)field246.method2131()) {
			if ((var2.field1483 >> 48 & 65535L) == (long)var0) {
				var2.method907();
			}
		}

	}

	@ObfInfo(name = "nc", desc = "(Lmi;I)I")
	static int method209(class131 var0) {
		class149 var2 = (class149)field246.method2129((long)var0.field1333 + ((long)var0.field1214 << 32));
		return var2 != null ? var2.field1457 : var0.field1285;
	}

	@ObfInfo(name = "oa", desc = "(Lmi;I)Lmi;")
	static class131 method171(class131 var0) {
		int var2 = class200.method1124(method209(var0));
		if (var2 == 0) {
			return null;
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				var0 = class131.method756(var0.field1231);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}

	@ObfInfo(name = "om", desc = "(Lmi;B)Z")
	static boolean method186(class131 var0) {
		return var0.field1232;
	}

	@ObfInfo(name = "oz", desc = "(Lmi;B)Ljava/lang/String;")
	static String method239(class131 var0) {
		if (class200.method1122(method209(var0)) == 0) {
			return null;
		} else {
			return null != var0.field1296 && var0.field1296.trim().length() != 0 ? var0.field1296 : null;
		}
	}

	@ObfInfo(name = "oh", desc = "(Ljava/lang/String;ZB)Ljava/lang/String;")
	static String method207(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (field52 == 1) {
			var0 = var0 + "-wtrc";
		} else if (field52 == 2) {
			var0 = var0 + "-wtqa";
		} else if (field52 == 3) {
			var0 = var0 + "-wtwip";
		} else if (field52 == 5) {
			var0 = var0 + "-wti";
		} else if (field52 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (null != class277.field2242) {
			var4 = "/p=" + class277.field2242;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + class524.field4196 + "/a=" + class512.field4102 + var4 + "/";
	}

	@ObfInfo(name = "oy", desc = "(Ljava/lang/String;I)V")
	static void method144(String var0) {
		class277.field2242 = var0;

		try {
			String var2 = class51.field585.getParameter(Integer.toString(18));
			String var3 = class51.field585.getParameter(Integer.toString(13));
			String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
			String var6;
			if (var0.length() == 0) {
				var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var5 = var4 + "; Expires=";
				long var7 = class43.method443() + 94608000000L;
				class539.field4277.setTime(new Date(var7));
				int var9 = class539.field4277.get(7);
				int var10 = class539.field4277.get(5);
				int var11 = class539.field4277.get(2);
				int var12 = class539.field4277.get(1);
				int var13 = class539.field4277.get(11);
				int var14 = class539.field4277.get(12);
				int var15 = class539.field4277.get(13);
				var6 = class539.field4276[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class539.field4278[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
				var4 = var5 + var6 + "; Max-Age=" + 94608000L;
			}

			Client var17 = class51.field585;
			var6 = "document.cookie=\"" + var4 + "\"";
			JSObject.getWindow(var17).eval(var6);
		} catch (Throwable var16) {
		}

	}

	@ObfInfo(name = "od", desc = "(Ljava/lang/String;ZI)V")
	static void method203(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < class401.field3121; ++var5) {
			class270 var6 = class270.method1424(var5);
			if ((!var1 || var6.field2214) && var6.field2177 == -1 && var6.field2186.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					class310.field2524 = -1;
					class500.field4040 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[2 * var3.length];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		class500.field4040 = var3;
		class216.field1931 = 0;
		class310.field2524 = var4;
		String[] var9 = new String[class310.field2524];

		for (int var10 = 0; var10 < class310.field2524; ++var10) {
			var9[var10] = class270.method1424(var3[var10]).field2186;
		}

		short[] var11 = class500.field4040;
		class330.method1806(var9, var11, 0, var9.length - 1);
	}

	@ObfInfo(name = "og", desc = "(Ltm;II)V")
	static void method137(class280 var0, int var1) {
		byte[] var3 = var0.field2252;
		if (field310 == null) {
			field310 = new byte[24];
		}

		class80.method529(var3, var1, field310, 0, 24);
		class519.method2542(var0, var1);
	}

	@ObfInfo(name = "ob", desc = "(Ltm;S)V")
	static void method201(class280 var0) {
		if (field310 != null) {
			var0.method1486(field310, 0, field310.length);
		} else {
			byte[] var3 = new byte[24];

			try {
				class519.field4151.method346(0L);
				class519.field4151.method347(var3);

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

			var0.method1486(var3, 0, var3.length);
		}
	}

	@ObfInfo(name = "on", desc = "(IIIZB)V")
	public static void method164(int var0, int var1, int var2, boolean var3) {
		class121 var5 = class121.method689(class480.field3854, field92.field2665);
		var5.field1141.method1554(var2);
		var5.field1141.method1522(var1);
		var5.field1141.method1530(var3 ? field127 : 0);
		var5.field1141.method1544(var0);
		field92.method1821(var5);
	}

	@ObfInfo(name = "oe", desc = "(II)V")
	static void method240(int var0) {
		field120 = var0;
	}

	@ObfInfo(name = "oj", desc = "(S)V")
	static void method143() {
		field92.method1821(class121.method689(class480.field3902, field92.field2665));
		field120 = 0;
	}

	@ObfInfo(name = "os", desc = "(I)V")
	static void method225() {
		if (field120 == 1) {
			field128 = true;
		}

	}

	@ObfInfo(name = "ow", desc = "(I)V")
	static void method138() {
		if (field128 && null != class126.field1164) {
			int var1 = class126.field1164.field1106[0];
			int var2 = class126.field1164.field1103[0];
			if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
				return;
			}

			class47.field566 = class126.field1164.field1061;
			int var3 = method131(class126.field1164.field1061, class126.field1164.field1032, class401.field3120) - field121;
			if (var3 < class157.field1490) {
				class157.field1490 = var3;
			}

			class401.field3122 = class126.field1164.field1032;
			field128 = false;
		}

	}

	@ObfInfo(name = "ot", desc = "(Ljava/lang/String;I)Ljava/lang/String;")
	static String method208(String var0) {
		class314[] var2 = class314.method1733();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class314 var4 = var2[var3];
			if (var4.field2560 != -1 && var0.startsWith(class90.method580(var4.field2560))) {
				var0 = var0.substring(6 + Integer.toString(var4.field2560).length());
				break;
			}
		}

		return var0;
	}

	@ObfInfo(name = "ox", desc = "(S)V")
	static void method121() {
		class281.field2262.method1770(field32);
	}

	@ObfInfo(name = "ol", desc = "(IB)V")
	static void method246(int var0) {
		if (var0 != field63) {
			field63 = var0;
		}
	}

	@ObfInfo(name = "ou", desc = "(ZI)V")
	static void method146(boolean var0) {
		field174 = var0;
	}

	@ObfInfo(name = "oi", desc = "(II)Ltx;")
	static class328 method255(int var0) {
		class328 var2 = (class328)field223.method294((long)var0);
		if (null == var2) {
			var2 = new class328(class106.field1018, class316.method1738(var0), class316.method1739(var0));
			field223.method293(var2, (long)var0);
		}

		return var2;
	}

	@ObfInfo(name = "oq", desc = "(IS)Ltx;")
	static class328 method274(int var0) {
		class328 var2 = (class328)field113.method294((long)var0);
		if (null == var2) {
			var2 = new class328(class106.field1018, var0);
		}

		return var2;
	}

	@ObfInfo(name = "ov", desc = "(I)Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard method256() {
		return class51.field585.method1887();
	}

	@ObfInfo(name = "op", desc = "(IB)V")
	static void method283(int var0) {
		class202 var2 = class202.method1149(var0);
		if (var2.method1148()) {
			if (class318.method1771(var2.field1835, (byte)94) == 2) {
				field196.add(var2.field1835);
			}

		}
	}

	@ObfInfo(name = "or", desc = "(I)V")
	static void method195() {
		for (int var1 = 0; var1 < field196.size(); ++var1) {
			if (class318.method1771((Integer)field196.get(var1), (byte)-51) != 2) {
				field196.remove(var1);
				--var1;
			}
		}

	}
}
