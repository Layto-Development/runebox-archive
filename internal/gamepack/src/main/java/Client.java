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

public final class Client extends class535 implements class263, OAuthApi, class122 {
   public static boolean field1143 = false;
   public static class322 field1300;
   public static int field1116 = 1;
   public static int field1204;
   public static int field1239;
   public static int field1298 = 216;
   public static final class479 field1181;
   static boolean field1120 = false;
   static boolean field1127 = false;
   static boolean field1129 = true;
   static boolean field1135 = true;
   static boolean field1156 = true;
   static boolean field1170;
   static boolean field1180;
   static boolean field1183;
   static boolean field1192;
   static boolean field1201;
   static boolean field1208;
   static boolean field1217;
   static boolean field1219;
   static boolean field1229;
   static boolean field1242;
   static boolean field1249;
   static boolean field1263;
   static boolean field1274;
   static boolean field1276;
   static boolean field1305;
   static boolean field1311;
   static boolean field1347;
   static boolean field1351 = false;
   static boolean field1352;
   static boolean field1354;
   static boolean field1377;
   static boolean field1378;
   static boolean field1379;
   static boolean field1380;
   static boolean field1383;
   static boolean field1388;
   static boolean field1405;
   static boolean field1412;
   static boolean[] field1126;
   static boolean[] field1253;
   static boolean[] field1273;
   static boolean[] field1339;
   static boolean[] field1340;
   static boolean[] field1384;
   static byte[] field1399;
   static class13 field1330;
   static class143 field1145;
   static class143 field1146;
   static class172 field1407;
   static class206 field1402;
   static class226 field1261;
   static class230 field1172;
   static class230 field1198;
   static class241 field1406;
   static class245 field1202;
   static class245 field1312;
   static class256 field1161;
   static class285 field1381;
   static class296 field1196;
   static class296[] field1374;
   static class303 field1264;
   static class313 field1137;
   static class313 field1335;
   static class314[] field1160;
   static class322 field1293;
   static class322 field1304;
   static class322 field1319;
   static class322 field1409;
   static class354 field1171;
   static class378[] field1191;
   static class400 field1355;
   static class417[] field1361;
   static class426 field1184;
   static class429 field1243;
   static class429 field1257;
   static class429 field1317;
   static class429 field1331;
   static class429 field1333;
   static class429 field1370;
   static class429 field1386;
   static class429[][][] field1256;
   static class436 field1148;
   static class443[] field1289;
   static class517[] field1394;
   static class84 field1366;
   static class86[] field1176;
   static class8[] field1360;
   static int field1117 = 0;
   static int field1118;
   static int field1119;
   static int field1121 = -1;
   static int field1122 = -1;
   static int field1124;
   static int field1128;
   static int field1130;
   static int field1131;
   static int field1132 = -1;
   static int field1133 = -1;
   static int field1134 = -1;
   static int field1136 = 0;
   static int field1138 = 0;
   static int field1140 = 0;
   static int field1141 = 0;
   static int field1147 = 0;
   static int field1149;
   static int field1150;
   static int field1151;
   static int field1152;
   static int field1153;
   static int field1154;
   static int field1155;
   static int field1157 = 0;
   static int field1168;
   static int field1169;
   static int field1177;
   static int field1182;
   static int field1186;
   static int field1187;
   static int field1188;
   static int field1189;
   static int field1190;
   static int field1194 = 0;
   static int field1195;
   static int field1197;
   static int field1199;
   static int field1200 = 0;
   static int field1205;
   static int field1206;
   static int field1207;
   static int field1209;
   static int field1210;
   static int field1211;
   static int field1212;
   static int field1213;
   static int field1214;
   static int field1215;
   static int field1216;
   static int field1218;
   static int field1220;
   static int field1221;
   static int field1222;
   static int field1226;
   static int field1230;
   static int field1233;
   static int field1234;
   static int field1235;
   static int field1236;
   static int field1237;
   static int field1241;
   static int field1244;
   static int field1245;
   static int field1247;
   static int field1250;
   static int field1254;
   static int field1255;
   static int field1258;
   static int field1265;
   static int field1272;
   static int field1277;
   static int field1278;
   static int field1279;
   static int field1280;
   static int field1281;
   static int field1283 = 0;
   static int field1284;
   static int field1286;
   static int field1287;
   static int field1288;
   static int field1290;
   static int field1291;
   static int field1292;
   static int field1294;
   static int field1295;
   static int field1296;
   static int field1302;
   static int field1303 = 0;
   static int field1306;
   static int field1307;
   static int field1308;
   static int field1314;
   static int field1316;
   static int field1318;
   static int field1320;
   static int field1321;
   static int field1322;
   static int field1323;
   static int field1324;
   static int field1325;
   static int field1326;
   static int field1329;
   static int field1332;
   static int field1336 = 0;
   static int field1337;
   static int field1345;
   static int field1349;
   static int field1350;
   static int field1353;
   static int field1356;
   static int field1362;
   static int field1363;
   static int field1367;
   static int field1369;
   static int field1371;
   static int field1375;
   static int field1385;
   static int field1387;
   static int field1397;
   static int field1398;
   static int field1401;
   static int field1403;
   static int field1404;
   static int field1410;
   static int field1414;
   static int field1415;
   static int field1419 = 0;
   static int[] field1115;
   static int[] field1123;
   static int[] field1142;
   static int[] field1175;
   static int[] field1178;
   static int[] field1223;
   static int[] field1224;
   static int[] field1227;
   static int[] field1228;
   static int[] field1240;
   static int[] field1248;
   static int[] field1260;
   static int[] field1266;
   static int[] field1267;
   static int[] field1269;
   static int[] field1270;
   static int[] field1297;
   static int[] field1309;
   static int[] field1313;
   static int[] field1315;
   static int[] field1327;
   static int[] field1328;
   static int[] field1334;
   static int[] field1338;
   static int[] field1341;
   static int[] field1342;
   static int[] field1343;
   static int[] field1344;
   static int[] field1348;
   static int[] field1357;
   static int[] field1358;
   static int[] field1364;
   static int[] field1365;
   static int[] field1372;
   static int[] field1373;
   static int[] field1376;
   static int[] field1382;
   static int[] field1400;
   static int[] field1408;
   static int[] field1411;
   static int[] field1417;
   static int[] field1418;
   static int[][] field1125;
   static int[][] field1232;
   static int[][][] field1193;
   static String field1144;
   static String field1282;
   static String field1299;
   static String field1310;
   static String[] field1139;
   static String[] field1231;
   static String[] field1271;
   static String[] field1390;
   static ArrayList field1413;
   static HashMap field1185;
   static List field1285;
   static long field1179 = -1L;
   static long field1246;
   static long field1259 = -1L;
   static long field1346;
   static long field1359;
   static long[] field1262;
   static short field1225;
   static short field1275;
   static short field1389;
   static short field1391;
   static short field1392;
   static short field1393;
   static short field1395;
   static short field1396;
   static final class412 field1416;
   static final int[] field1251;
   static final int[] field1301;
   static final String field1252;
   static final String field1368;
   boolean field1163 = false;
   class151 field1159;
   class295 field1173;
   class366 field1203;
   class446 field1165;
   class446 field1238;
   OtlTokenRequester field1268;
   RefreshAccessTokenRequester field1166;
   int field1164 = 0;
   String field1158;
   Future field1162;
   Future field1167;
   long field1174 = -1L;

   static {
      field1145 = class143.field896;
      field1146 = class143.field896;
      field1180 = false;
      field1148 = class436.field3465;
      field1149 = 0;
      field1150 = 0;
      field1296 = 0;
      field1152 = 0;
      field1131 = 0;
      field1182 = 0;
      field1254 = 0;
      field1366 = class84.field570;
      field1161 = class256.field1846;
      int var2 = "com_jagex_auth_desktop_osrs:public".length();
      byte[] var3 = new byte[var2];

      int var4;
      char var5;
      for(var4 = 0; var4 < var2; ++var4) {
         var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
         if (var5 > 127) {
            var3[var4] = 63;
         } else {
            var3[var4] = (byte)var5;
         }
      }

      String var0 = class339.method1584(var3, 0, var3.length);
      field1368 = var0;
      var2 = "com_jagex_auth_desktop_runelite:public".length();
      var3 = new byte[var2];

      for(var4 = 0; var4 < var2; ++var4) {
         var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
         if (var5 > 127) {
            var3[var4] = 63;
         } else {
            var3[var4] = (byte)var5;
         }
      }

      var0 = class339.method1584(var3, 0, var3.length);
      field1252 = var0;
      field1170 = false;
      field1171 = new class354();
      field1399 = null;
      field1176 = new class86[65536];
      field1177 = 0;
      field1115 = new int[65536];
      field1230 = 0;
      field1327 = new int[250];
      field1181 = new class479();
      field1169 = 0;
      field1183 = false;
      field1184 = new class426();
      field1185 = new HashMap();
      field1186 = 0;
      field1220 = 1;
      field1188 = 0;
      field1189 = 1;
      field1190 = 0;
      field1191 = new class378[4];
      field1192 = false;
      field1193 = new int[4][13][13];
      field1301 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field1195 = 0;
      field1197 = 2301979;
      field1308 = 5063219;
      field1199 = 3353893;
      field1387 = 7759444;
      field1201 = false;
      field1320 = 0;
      field1155 = 128;
      field1294 = 0;
      field1205 = 0;
      field1206 = 0;
      field1128 = 0;
      field1272 = 0;
      field1209 = 0;
      field1210 = 50;
      field1211 = 0;
      field1212 = 0;
      field1213 = 0;
      field1214 = 12;
      field1215 = 6;
      field1216 = 0;
      field1217 = false;
      field1218 = 0;
      field1219 = false;
      field1258 = 0;
      field1221 = 0;
      field1153 = 50;
      field1223 = new int[field1153];
      field1224 = new int[field1153];
      field1175 = new int[field1153];
      field1400 = new int[field1153];
      field1227 = new int[field1153];
      field1228 = new int[field1153];
      field1125 = new int[field1153][];
      field1376 = new int[field1153];
      field1231 = new String[field1153];
      field1232 = new int[104][104];
      field1286 = 0;
      field1234 = -1;
      field1235 = -1;
      field1236 = 0;
      field1237 = 0;
      field1295 = 0;
      field1353 = 0;
      field1405 = true;
      field1241 = 0;
      field1242 = true;
      field1289 = new class443[2048];
      field1244 = -1;
      field1245 = 0;
      field1246 = -1L;
      field1354 = true;
      field1119 = 0;
      field1385 = 0;
      field1142 = new int[1000];
      field1251 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field1139 = new String[8];
      field1253 = new boolean[8];
      field1297 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field1255 = -1;
      field1256 = new class429[4][104][104];
      field1257 = new class429();
      field1243 = new class429();
      field1386 = new class429();
      field1260 = new int[25];
      field1408 = new int[25];
      field1411 = new int[25];
      field1263 = false;
      field1229 = false;
      field1265 = 0;
      field1266 = new int[500];
      field1267 = new int[500];
      field1309 = new int[500];
      field1269 = new int[500];
      field1270 = new int[500];
      field1271 = new String[500];
      field1390 = new String[500];
      field1273 = new boolean[500];
      field1274 = false;
      field1249 = false;
      field1276 = true;
      field1277 = -1;
      field1278 = -1;
      field1279 = 0;
      field1280 = 50;
      field1281 = 0;
      field1282 = null;
      field1208 = false;
      field1284 = -1;
      field1250 = -1;
      field1299 = null;
      field1310 = null;
      field1288 = -1;
      field1137 = new class313(8);
      field1130 = 0;
      field1291 = -1;
      field1292 = 0;
      field1293 = null;
      field1233 = 0;
      field1403 = 0;
      field1204 = 0;
      field1151 = -1;
      field1412 = false;
      field1409 = null;
      field1300 = null;
      field1319 = null;
      field1302 = 0;
      field1375 = 0;
      field1304 = null;
      field1305 = false;
      field1306 = -1;
      field1307 = -1;
      field1352 = false;
      field1154 = -1;
      field1226 = -1;
      field1311 = false;
      field1118 = 1;
      field1313 = new int[32];
      field1314 = 0;
      field1315 = new int[32];
      field1316 = 0;
      field1240 = new int[32];
      field1318 = 0;
      field1382 = new int[32];
      field1247 = 0;
      field1321 = 0;
      field1322 = 0;
      field1323 = 0;
      field1324 = 0;
      field1325 = 0;
      field1326 = 0;
      field1187 = 0;
      field1168 = 0;
      field1329 = 0;
      field1330 = new class13();
      field1331 = new class429();
      field1317 = new class429();
      field1333 = new class429();
      field1370 = new class429();
      field1335 = new class313(512);
      field1287 = 0;
      field1337 = -2;
      field1126 = new boolean[100];
      field1339 = new boolean[100];
      field1340 = new boolean[100];
      field1341 = new int[100];
      field1342 = new int[100];
      field1343 = new int[100];
      field1344 = new int[100];
      field1345 = 0;
      field1346 = 0L;
      field1347 = true;
      field1348 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field1349 = 0;
      field1350 = 0;
      field1144 = "";
      field1262 = new long[100];
      field1124 = 0;
      field1264 = new class303();
      field1355 = new class400();
      field1356 = 0;
      field1357 = new int[128];
      field1358 = new int[128];
      field1359 = -1L;
      field1360 = new class8[4];
      field1361 = new class417[4];
      field1362 = -1;
      field1363 = 0;
      field1364 = new int[1000];
      field1365 = new int[1000];
      field1374 = new class296[1000];
      field1367 = 0;
      field1290 = 0;
      field1369 = 0;
      field1388 = false;
      field1371 = 0;
      field1372 = new int[50];
      field1373 = new int[50];
      field1328 = new int[50];
      field1123 = new int[50];
      field1160 = new class314[50];
      field1377 = false;
      field1378 = false;
      field1379 = false;
      field1380 = false;
      field1381 = null;
      field1172 = null;
      field1198 = null;
      field1383 = false;
      field1384 = new boolean[5];
      field1178 = new int[5];
      field1338 = new int[5];
      field1248 = new int[5];
      field1334 = new int[5];
      field1389 = 256;
      field1275 = 205;
      field1391 = 256;
      field1392 = 320;
      field1393 = 1;
      field1225 = 32767;
      field1395 = 1;
      field1396 = 32767;
      field1397 = 0;
      field1398 = 0;
      field1332 = 0;
      field1207 = 0;
      field1401 = 0;
      field1402 = new class206();
      field1222 = -1;
      field1404 = -1;
      field1261 = new class386();
      field1394 = new class517[8];
      field1406 = new class241();
      field1407 = new class172(8, class418.field2939);
      field1312 = new class245(64);
      field1202 = new class245(64);
      field1410 = -1;
      field1239 = -1;
      field1285 = new ArrayList();
      field1413 = new ArrayList(10);
      field1414 = 0;
      field1415 = 0;
      field1416 = new class412();
      field1417 = new int[50];
      field1418 = new int[50];
   }

   protected final void method2560() {
   }

   public final void init() {
      if (this.method2563()) {
         for(int var1 = 0; var1 <= 28; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               switch (var1) {
                  case 3:
                     if (var2.equalsIgnoreCase(class389.field2746)) {
                        field1143 = true;
                     } else {
                        field1143 = false;
                     }
                     break;
                  case 4:
                     if (-1 == field1122) {
                        field1122 = Integer.parseInt(var2);
                     }
                     break;
                  case 5:
                     field1117 = Integer.parseInt(var2);
                     break;
                  case 6:
                     class367.field2654 = class103.method382(Integer.parseInt(var2));
                     break;
                  case 7:
                     int var4 = Integer.parseInt(var2);
                     class330[] var5 = class330.method1555();
                     int var6 = 0;

                     class330 var12;
                     while(true) {
                        if (var6 >= var5.length) {
                           var12 = null;
                           break;
                        }

                        class330 var7 = var5[var6];
                        if (var4 == var7.field2497) {
                           var12 = var7;
                           break;
                        }

                        ++var6;
                     }

                     class315.field2131 = var12;
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase(class389.field2746)) {
                     }
                     break;
                  case 9:
                     class500.field3998 = var2;
                     break;
                  case 10:
                     class31[] var11 = new class31[]{class31.field296, class31.field303, class31.field297, class31.field302, class31.field298, class31.field300};
                     class376.field2687 = (class31)class1.method2(var11, Integer.parseInt(var2));
                     if (class31.field300 == class376.field2687) {
                        class103.field694 = class516.field4132;
                     } else {
                        class103.field694 = class516.field4134;
                     }
                     break;
                  case 11:
                     class145.field935 = var2;
                     break;
                  case 12:
                     field1116 = Integer.parseInt(var2);
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
                     class376.field2686 = Integer.parseInt(var2);
                     break;
                  case 15:
                     field1141 = Integer.parseInt(var2);
                     break;
                  case 17:
                     class52.field429 = var2;
                     break;
                  case 21:
                     field1121 = Integer.parseInt(var2);
                     break;
                  case 25:
                     int var3 = var2.indexOf(".");
                     if (var3 == -1) {
                        field1298 = Integer.parseInt(var2);
                     } else {
                        field1298 = Integer.parseInt(var2.substring(0, var3));
                        Integer.parseInt(var2.substring(var3 + 1));
                     }
               }
            }
         }

         class408.field2852 = false;
         field1120 = false;
         class80.field555 = this.getCodeBase().getHost();
         class215.field1651 = new class29();
         String var9 = class315.field2131.field2492;
         byte var10 = 0;
         if ((field1117 & class145.field918.method180()) != 0) {
            class298.field2033 = "beta";
         }

         try {
            class269.method1221("oldschool", class298.field2033, var9, var10, 22);
         } catch (Exception var8) {
            class431.method2006((String)null, var8);
         }

         class530.field4182 = this;
         class425.field3316 = field1122;
         method786();
         if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field1163 = true;
         }

         if (field1134 == -1) {
            if (!this.method745() && !this.method768((byte)106)) {
               field1134 = 0;
            } else {
               field1134 = 5;
            }
         }

         this.method2555(765, 503, 216, 1);
      }
   }

   protected void finalize() throws Throwable {
      class469.method2209(this);
      super.finalize();
   }

   boolean method773() {
      return this.field1164 == 1;
   }

   public void setClient(int var1) {
      this.field1164 = var1;
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (null != var1) {
         this.field1268 = var1;
         class292.method1316(10);
      }
   }

   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field1166 = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return 10 == field1200;
   }

   public long getAccountHash() {
      return this.field1174;
   }

   boolean method745() {
      return null != class166.field1061 && !class166.field1061.trim().isEmpty() && class299.field2044 != null && !class299.field2044.trim().isEmpty();
   }

   boolean method768(byte var1) {
      boolean var10000;
      if (null != class175.field1426) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         if (!class175.field1426.trim().isEmpty()) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (class338.field2526 != null) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (!class338.field2526.trim().isEmpty()) {
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

   boolean method746() {
      return null != this.field1268;
   }

   void method771(String var1) throws IOException {
      HashMap var3 = new HashMap();
      var3.put("grant_type", "refresh_token");
      var3.put("scope", "gamesso.token.create");
      var3.put("refresh_token", var1);
      URL var4 = new URL(class145.field935 + "shield/oauth/token" + (new class220(var3)).method1108());
      class233 var5 = new class233();
      if (this.method773()) {
         var5.method1131(field1252);
      } else {
         var5.method1131(field1368);
      }

      var5.method1130("Host", (new URL(class145.field935)).getHost());
      var5.method1133(class181.field1454);
      class299 var6 = class299.field2037;
      RefreshAccessTokenRequester var7 = this.field1166;
      if (null != var7) {
         this.field1167 = var7.request(var6.method1375(), var4, var5.method1129(), "");
      } else {
         class133 var8 = new class133(var4, var6, var5, this.field1163);
         this.field1165 = this.field1159.method572(var8);
      }
   }

   void method747(String var1) throws IOException {
      URL var3 = new URL(class145.field935 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      class233 var4 = new class233();
      var4.method1140(var1);
      class299 var5 = class299.field2036;
      OtlTokenRequester var6 = this.field1268;
      if (null != var6) {
         this.field1162 = var6.request(var5.method1375(), var3, var4.method1129(), "");
      } else {
         class133 var7 = new class133(var3, var5, var4, this.field1163);
         this.field1238 = this.field1159.method572(var7);
      }
   }

   void method767(String var1, String var2) throws IOException, JSONException {
      URL var4 = new URL(class145.field935 + "game-session/v1/tokens");
      class133 var5 = new class133(var4, class299.field2037, this.field1163);
      var5.method489().method1140(var1);
      var5.method489().method1133(class181.field1454);
      JSONObject var6 = new JSONObject();
      var6.put("accountId", var2);
      var5.method485(new class180(var6));
      this.field1238 = this.field1159.method572(var5);
   }

   protected final void method2566() {
      class159.method611(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      class12.field183 = 0 == field1141 ? '\uaa4a' : field1116 + '\u9c40';
      class249.field1797 = 0 == field1141 ? 443 : field1116 + '\uc350';
      class136.field853 = class12.field183;
      class208.field1605 = class193.field1512;
      class343.field2556 = class193.field1515;
      class206.field1588 = class193.field1513;
      class206.field1595 = class193.field1514;
      class234.field1727 = new class114(this.field1163, 216);
      this.method2541();
      this.method2543();
      class268.field1879 = this.method2570();
      this.method2568(field1355, 0);
      this.method2568(field1264, 1);
      class288.field1974 = new class340(255, class269.field1884, class269.field1885, 500000);
      class390 var3 = null;
      class142 var4 = new class142();

      try {
         var3 = class269.method1220("", class376.field2687.field301, false);
         byte[] var5 = new byte[(int)var3.method1781()];

         int var7;
         for(int var6 = 0; var6 < var5.length; var6 += var7) {
            var7 = var3.method1782(var5, var6, var5.length - var6);
            if (var7 == -1) {
               throw new IOException();
            }
         }

         var4 = new class142(new class366(var5));
      } catch (Exception var9) {
      }

      try {
         if (null != var3) {
            var3.method1783();
         }
      } catch (Exception var8) {
      }

      class158.field1004 = var4;
      this.method2538();
      class410.method1893(this, class446.field3539);
      class37.method158(class158.field1004.method524());
      class290.field1979 = new class146(class103.field694);
      this.field1159 = new class151("tokenRequest", 1, 1);
      if (!class469.field3719.contains(this)) {
         class469.field3719.add(this);
      }

      class391.field2756 = new class167[1];
      class441 var10 = class441.field3482;
      class391.field2756[0] = new class167(var10.field3484, var10.field3489);
   }

   protected final void method2567() {
      ++field1419;
      this.method750();

      while(true) {
         class437 var2;
         synchronized(class160.field1020) {
            var2 = (class437)class160.field1018.method1989();
         }

         if (null == var2) {
            boolean var8 = class469.method2211();
            if (var8 && field1388 && null != class432.field3372) {
               class432.field3372.method275();
            }

            method898();
            field1264.method1381();
            this.method2542();
            synchronized(class496.field3974) {
               class496.field3967 = class496.field3963;
               class496.field3977 = class496.field3964;
               class496.field3960 = class496.field3965;
               class496.field3968 = class496.field3966;
               class496.field3971 = class496.field3969;
               class496.field3972 = class496.field3978;
               class496.field3973 = class496.field3976;
               class496.field3961 = class496.field3970;
               class496.field3969 = 0;
            }

            if (null != class268.field1879) {
               int var3 = class268.field1879.method185();
               field1329 = var3;
            }

            if (0 == field1200) {
               method866();
               class535.method2571();
            } else if (5 == field1200) {
               class292.method1329(this, class174.field1423, class502.field4012);
               method866();
               class535.method2571();
            } else if (field1200 != 10 && field1200 != 11) {
               if (20 == field1200) {
                  class292.method1329(this, class174.field1423, class502.field4012);
                  this.method751();
               } else if (field1200 == 50) {
                  class292.method1329(this, class174.field1423, class502.field4012);
                  this.method751();
               } else if (25 == field1200) {
                  method915();
               }
            } else {
               class292.method1329(this, class174.field1423, class502.field4012);
            }

            if (field1200 == 30) {
               this.method770();
            } else if (40 == field1200 || 45 == field1200) {
               this.method751();
            }

            return;
         }

         var2.field3474.method2535(var2.field3473, (int)var2.field531, var2.field3471, false);
      }
   }

   protected final void method2556(boolean var1) {
      if ((field1200 == 10 || 20 == field1200 || 30 == field1200) && 0L != field1346 && class123.method471() > field1346) {
         class37.method158(method868());
      }

      int var3;
      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field1126[var3] = true;
         }
      }

      if (field1200 == 0) {
         this.method2553(class292.field1990, class292.field1991, var1);
      } else if (field1200 == 5) {
         class440.method2043(class274.field1923, class174.field1423, class502.field4012);
      } else if (field1200 != 10 && field1200 != 11) {
         if (20 == field1200) {
            class440.method2043(class274.field1923, class174.field1423, class502.field4012);
         } else if (field1200 == 50) {
            class440.method2043(class274.field1923, class174.field1423, class502.field4012);
         } else if (field1200 == 25) {
            if (field1190 == 1) {
               if (field1186 > field1220) {
                  field1220 = field1186;
               }

               var3 = (field1220 * 50 - field1186 * 50) / field1220;
               method925(class424.field3012 + class389.field2751 + class389.field2745 + var3 + "%" + class389.field2747, false);
            } else if (2 == field1190) {
               if (field1188 > field1189) {
                  field1189 = field1188;
               }

               var3 = 50 + (field1189 * 50 - field1188 * 50) / field1189;
               method925(class424.field3012 + class389.field2751 + class389.field2745 + var3 + "%" + class389.field2747, false);
            } else {
               method925(class424.field3012, false);
            }
         } else if (30 == field1200) {
            this.method753();
         } else if (40 == field1200) {
            method925(class424.field3013 + class389.field2751 + class424.field3014, false);
         } else if (field1200 == 45) {
            method925(class424.field3273, false);
         }
      } else {
         class440.method2043(class274.field1923, class174.field1423, class502.field4012);
      }

      if (30 == field1200 && field1345 == 0 && !var1 && !field1347) {
         for(var3 = 0; var3 < field1287; ++var3) {
            if (field1339[var3]) {
               class143.field899.method1443(field1341[var3], field1342[var3], field1343[var3], field1344[var3]);
               field1339[var3] = false;
            }
         }
      } else if (field1200 > 0) {
         class143.field899.method1442(0, 0);

         for(var3 = 0; var3 < field1287; ++var3) {
            field1339[var3] = false;
         }
      }

   }

   protected final void method2537() {
      if (class238.field1742.method1578()) {
         class238.field1742.method1576();
      }

      if (class129.field806 != null) {
         class129.field806.field724 = false;
      }

      class129.field806 = null;
      field1181.method2258();
      if (class496.field3974 != null) {
         synchronized(class496.field3974) {
            class496.field3974 = null;
         }
      }

      class268.field1879 = null;
      if (class432.field3372 != null) {
         class432.field3372.method267();
      }

      class215.field1651.method131();
      class160.method614();
      if (class234.field1727 != null) {
         class234.field1727.method153();
         class234.field1727 = null;
      }

      class269.method1223();
      this.field1159.method573();
   }

   void method750() {
      if (field1200 != 1000) {
         boolean var2 = class215.field1651.method130();
         if (!var2) {
            this.method766();
         }

      }
   }

   void method766() {
      if (class215.field1651.field271 >= 4) {
         this.method2557("js5crc");
         method904(1000);
      } else {
         if (class215.field1651.field294 >= 4) {
            if (field1200 <= 5) {
               this.method2557("js5io");
               method904(1000);
               return;
            }

            field1150 = 3000;
            class215.field1651.field294 = 3;
         }

         if (--field1150 + 1 <= 0) {
            try {
               if (field1149 == 0) {
                  class129.field811 = class535.field4242.method1190(class80.field555, class136.field853);
                  ++field1149;
               }

               if (field1149 == 1) {
                  if (class129.field811.field2739 == 2) {
                     this.method765(-1);
                     return;
                  }

                  if (class129.field811.field2739 == 1) {
                     ++field1149;
                  }
               }

               if (2 == field1149) {
                  Socket var3 = (Socket)class129.field811.field2740;
                  class490 var2 = new class490(var3, 40000, 5000);
                  class274.field1921 = var2;
                  class366 var4 = new class366(5);
                  var4.method1643(15);
                  var4.method1709(216);
                  class274.field1921.method1559(var4.field2650, 0, 5);
                  ++field1149;
                  class37.field318 = class123.method471();
               }

               if (field1149 == 3) {
                  if (class274.field1921.method1558() > 0) {
                     int var6 = class274.field1921.method1560();
                     if (var6 != 0) {
                        this.method765(var6);
                        return;
                     }

                     ++field1149;
                  } else if (class123.method471() - class37.field318 > 30000L) {
                     this.method765(-2);
                     return;
                  }
               }

               if (field1149 == 4) {
                  class215.field1651.method125(class274.field1921, field1200 > 20);
                  class129.field811 = null;
                  class274.field1921 = null;
                  field1149 = 0;
                  field1296 = 0;
               }
            } catch (IOException var5) {
               this.method765(-3);
            }

         }
      }
   }

   void method765(int var1) {
      class129.field811 = null;
      class274.field1921 = null;
      field1149 = 0;
      if (class136.field853 == class12.field183) {
         class136.field853 = class249.field1797;
      } else {
         class136.field853 = class12.field183;
      }

      ++field1296;
      if (field1296 < 2 || var1 != 7 && var1 != 9) {
         if (field1296 >= 2 && var1 == 6) {
            this.method2557("js5connect_outofdate");
            method904(1000);
         } else if (field1296 >= 4) {
            if (field1200 <= 5) {
               this.method2557("js5connect");
               method904(1000);
            } else {
               field1150 = 3000;
            }
         }
      } else if (field1200 <= 5) {
         this.method2557("js5connect_full");
         method904(1000);
      } else {
         field1150 = 3000;
      }

   }

   final void method751() {
      Object var2 = field1181.method2257();
      class435 var3 = field1181.field3782;

      try {
         if (field1152 == 0) {
            if (null == class149.field958 && (field1171.method1606() || field1131 > 250)) {
               class149.field958 = field1171.method1607();
               field1171.method1608();
               field1171 = null;
            }

            if (null != class149.field958) {
               if (var2 != null) {
                  ((class331)var2).method1561();
                  var2 = null;
               }

               class333.field2507 = null;
               field1183 = false;
               field1131 = 0;
               if (field1161.method1199()) {
                  if (this.method745()) {
                     try {
                        this.method771(class299.field2044);
                        method902(21);
                     } catch (Throwable var21) {
                        class431.method2006((String)null, var21);
                        class336.method1567(65);
                        return;
                     }
                  } else {
                     if (!this.method768((byte)6)) {
                        class336.method1567(65);
                        return;
                     }

                     try {
                        this.method767(class175.field1426, class338.field2526);
                        method902(20);
                     } catch (Exception var20) {
                        class431.method2006((String)null, var20);
                        class336.method1567(65);
                        return;
                     }
                  }
               } else {
                  method902(1);
               }
            }
         }

         class406 var23;
         if (21 == field1152) {
            if (null != this.field1167) {
               if (!this.field1167.isDone()) {
                  return;
               }

               if (this.field1167.isCancelled()) {
                  class336.method1567(65);
                  this.field1167 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field1167.get();
                  if (!var4.isSuccess()) {
                     class336.method1567(65);
                     this.field1167 = null;
                     return;
                  }

                  class166.field1061 = var4.getAccessToken();
                  class299.field2044 = var4.getRefreshToken();
                  this.field1167 = null;
               } catch (Exception var19) {
                  class431.method2006((String)null, var19);
                  class336.method1567(65);
                  this.field1167 = null;
                  return;
               }
            } else {
               if (null == this.field1165) {
                  class336.method1567(65);
                  return;
               }

               if (!this.field1165.method2074()) {
                  return;
               }

               if (this.field1165.method2075()) {
                  class431.method2006(this.field1165.method2077(), (Throwable)null);
                  class336.method1567(65);
                  this.field1165 = null;
                  return;
               }

               var23 = this.field1165.method2076();
               if (var23.method1830() != 200) {
                  class336.method1567(65);
                  this.field1165 = null;
                  return;
               }

               field1131 = 0;
               class180 var5 = new class180(var23.method1832());

               try {
                  class166.field1061 = var5.method963().getString("access_token");
                  class299.field2044 = var5.method963().getString("refresh_token");
               } catch (Exception var18) {
                  class431.method2006("Error parsing tokens", var18);
                  class336.method1567(65);
                  this.field1165 = null;
                  return;
               }
            }

            this.method747(class166.field1061);
            method902(20);
         }

         if (field1152 == 20) {
            if (this.field1162 != null) {
               if (!this.field1162.isDone()) {
                  return;
               }

               if (this.field1162.isCancelled()) {
                  class336.method1567(65);
                  this.field1162 = null;
                  return;
               }

               try {
                  OtlTokenResponse var24 = (OtlTokenResponse)this.field1162.get();
                  if (!var24.isSuccess()) {
                     class336.method1567(65);
                     this.field1162 = null;
                     return;
                  }

                  this.field1158 = var24.getToken();
                  this.field1162 = null;
               } catch (Exception var17) {
                  class431.method2006((String)null, var17);
                  class336.method1567(65);
                  this.field1162 = null;
                  return;
               }
            } else {
               if (this.field1238 == null) {
                  class336.method1567(65);
                  return;
               }

               if (!this.field1238.method2074()) {
                  return;
               }

               if (this.field1238.method2075()) {
                  class431.method2006(this.field1238.method2077(), (Throwable)null);
                  class336.method1567(65);
                  this.field1238 = null;
                  return;
               }

               var23 = this.field1238.method2076();
               if (var23.method1830() != 200) {
                  class431.method2006("Response code: " + var23.method1830() + "Response body: " + var23.method1832(), (Throwable)null);
                  class336.method1567(65);
                  this.field1238 = null;
                  return;
               }

               List var26 = (List)var23.method1831().get("Content-Type");
               if (var26 != null && var26.contains(class181.field1454.method965())) {
                  try {
                     JSONObject var6 = new JSONObject(var23.method1832());
                     this.field1158 = var6.getString("token");
                  } catch (JSONException var16) {
                     class431.method2006((String)null, var16);
                     class336.method1567(65);
                     this.field1238 = null;
                     return;
                  }
               } else {
                  this.field1158 = var23.method1832();
               }

               this.field1238 = null;
            }

            field1131 = 0;
            method902(1);
         }

         if (field1152 == 1) {
            if (class333.field2507 == null) {
               class333.field2507 = class535.field4242.method1190(class80.field555, class136.field853);
            }

            if (class333.field2507.field2739 == 2) {
               throw new IOException();
            }

            if (class333.field2507.field2739 == 1) {
               Socket var27 = (Socket)class333.field2507.field2740;
               class490 var25 = new class490(var27, 40000, 5000);
               var2 = var25;
               field1181.method2255(var25);
               class333.field2507 = null;
               method902(2);
            }
         }

         class53 var29;
         if (field1152 == 2) {
            field1181.method2259();
            var29 = class207.method1085((byte)-1);
            var29.field430 = null;
            var29.field431 = 0;
            var29.field435 = new class435(5000);
            var29.field435.method1643(class25.field261.field259);
            field1181.method2254(var29);
            field1181.method2253();
            var3.field2652 = 0;
            method902(3);
         }

         int var28;
         if (field1152 == 3) {
            if (class432.field3372 != null) {
               class432.field3372.method266();
            }

            if (((class331)var2).method1556(1)) {
               var28 = ((class331)var2).method1560();
               if (null != class432.field3372) {
                  class432.field3372.method266();
               }

               if (var28 != 0) {
                  class336.method1567(var28);
                  return;
               }

               var3.field2652 = 0;
               method902(4);
            }
         }

         if (field1152 == 4) {
            if (var3.field2652 < 8) {
               var28 = ((class331)var2).method1558();
               if (var28 > 8 - var3.field2652) {
                  var28 = 8 - var3.field2652;
               }

               if (var28 > 0) {
                  ((class331)var2).method1557(var3.field2650, var3.field2652, var28);
                  var3.field2652 += var28;
               }
            }

            if (var3.field2652 == 8) {
               var3.field2652 = 0;
               class203.field1571 = var3.method1659();
               method902(5);
            }
         }

         if (field1152 == 5) {
            field1181.field3782.field2652 = 0;
            field1181.method2259();
            class435 var34 = new class435(500);
            int[] var30 = new int[]{class149.field958.nextInt(), class149.field958.nextInt(), class149.field958.nextInt(), class149.field958.nextInt()};
            var34.field2652 = 0;
            var34.method1643(1);
            var34.method1709(var30[0]);
            var34.method1709(var30[1]);
            var34.method1709(var30[2]);
            var34.method1709(var30[3]);
            var34.method1680(class203.field1571);
            if (40 == field1200) {
               var34.method1709(class350.field2575[0]);
               var34.method1709(class350.field2575[1]);
               var34.method1709(class350.field2575[2]);
               var34.method1709(class350.field2575[3]);
            } else {
               if (50 == field1200) {
                  var34.method1643(class84.field565.method180());
                  var34.method1709(class332.field2499);
               } else {
                  var34.method1643(field1366.method180());
                  switch (field1366.field568) {
                     case 0:
                        var34.method1709(class158.field1004.method532(class292.field2007));
                     case 1:
                     default:
                        break;
                     case 2:
                     case 4:
                        var34.method1695(class182.field1457);
                        ++var34.field2652;
                        break;
                     case 3:
                        var34.field2652 += 4;
                  }
               }

               if (field1161.method1199()) {
                  var34.method1643(class256.field1845.method180());
                  var34.method1646(this.field1158);
               } else {
                  var34.method1643(class256.field1846.method180());
                  var34.method1646(class292.field2000);
               }
            }

            var34.method1687(class154.field974, class154.field975);
            class350.field2575 = var30;
            class53 var7 = class207.method1085((byte)-1);
            var7.field430 = null;
            var7.field431 = 0;
            var7.field435 = new class435(5000);
            var7.field435.field2652 = 0;
            if (field1200 == 40) {
               var7.field435.method1643(class25.field256.field259);
            } else {
               var7.field435.method1643(class25.field255.field259);
            }

            var7.field435.method1684(0);
            int var8 = var7.field435.field2652;
            var7.field435.method1709(216);
            var7.field435.method1709(1);
            var7.field435.method1643(field1122);
            var7.field435.method1643(field1134);
            byte var9 = 0;
            var7.field435.method1643(var9);
            var7.field435.method1648(var34.field2650, 0, var34.field2652);
            int var10 = var7.field435.field2652;
            var7.field435.method1646(class292.field2007);
            var7.field435.method1643((field1347 ? 1 : 0) << 1 | (field1120 ? 1 : 0));
            var7.field435.method1684(class114.field730);
            var7.field435.method1684(class394.field2761);
            method857(var7.field435);
            var7.field435.method1646(class500.field3998);
            var7.field435.method1709(class376.field2686);
            if (field1298 > 213) {
               var7.field435.method1643(0);
            }

            class366 var11 = new class366(class446.field3541.method2517());
            class446.field3541.method2516(var11);
            var7.field435.method1648(var11.field2650, 0, var11.field2650.length);
            var7.field435.method1643(field1122);
            var7.field435.method1709(0);
            var7.field435.method1663(class258.field1852.field4074);
            var7.field435.method1663(class513.field4089.field4074);
            var7.field435.method1663(class529.field4181.field4074);
            var7.field435.method1663(class540.field4291.field4074);
            var7.field435.method1663(class520.field4158.field4074);
            var7.field435.method1692(class307.field2086.field4074);
            var7.field435.method1709(class242.field1767.field4074);
            var7.field435.method1691(class150.field960.field4074);
            var7.field435.method1709(class143.field894.field4074);
            var7.field435.method1663(class133.field837.field4074);
            var7.field435.method1663(0);
            var7.field435.method1692(class367.field2655.field4074);
            var7.field435.method1663(class443.field3522.field4074);
            var7.field435.method1691(class189.field1494.field4074);
            var7.field435.method1663(class85.field574.field4074);
            var7.field435.method1692(class40.field338.field4074);
            var7.field435.method1691(class339.field2531.field4074);
            var7.field435.method1709(class430.field3365.field4074);
            var7.field435.method1691(class243.field1777.field4074);
            var7.field435.method1692(class62.field492.field4074);
            var7.field435.method1709(class517.field4141.field4074);
            var7.field435.method1697(var30, var10, var7.field435.field2652);
            var7.field435.method1651(var7.field435.field2652 - var8);
            field1181.method2254(var7);
            field1181.method2253();
            field1181.field3781 = new class421(var30);
            int[] var12 = new int[4];

            for(int var13 = 0; var13 < 4; ++var13) {
               var12[var13] = var30[var13] + 50;
            }

            var3.method2029(var12);
            method902(6);
         }

         int var32;
         if (field1152 == 6 && ((class331)var2).method1558() > 0) {
            var28 = ((class331)var2).method1560();
            if (var28 == 61) {
               var32 = ((class331)var2).method1558();
               class451.field3572 = var32 == 1 && ((class331)var2).method1560() == 1;
               method902(5);
            }

            if (var28 == 21 && field1200 == 20) {
               method902(12);
            } else if (var28 == 2) {
               method902(14);
            } else if (var28 == 15 && field1200 == 40) {
               field1181.field3784 = -1;
               method902(19);
            } else if (var28 == 64) {
               method902(10);
            } else if (var28 == 23 && field1182 < 1) {
               ++field1182;
               method902(0);
            } else if (var28 == 29) {
               method902(17);
            } else {
               if (var28 != 69) {
                  class336.method1567(var28);
                  return;
               }

               method902(7);
            }
         }

         if (field1152 == 7 && ((class331)var2).method1558() >= 2) {
            ((class331)var2).method1557(var3.field2650, 0, 2);
            var3.field2652 = 0;
            class268.field1877 = var3.method1703();
            method902(8);
         }

         if (field1152 == 8 && ((class331)var2).method1558() >= class268.field1877) {
            var3.field2652 = 0;
            ((class331)var2).method1557(var3.field2650, var3.field2652, class268.field1877);
            class288 var38 = class288.method1311()[var3.method1654()];

            try {
               switch (var38.field1975) {
                  case 0:
                     class76 var35 = new class76();
                     this.field1173 = new class295(var3, var35);
                     method902(9);
                     break;
                  default:
                     throw new IllegalArgumentException();
               }
            } catch (Exception var15) {
               class336.method1567(22);
               return;
            }
         }

         if (field1152 == 9 && this.field1173.method1336()) {
            this.field1203 = this.field1173.method1335();
            this.field1173.method1333();
            this.field1173 = null;
            if (this.field1203 == null) {
               class336.method1567(22);
               return;
            }

            field1181.method2259();
            var29 = class207.method1085((byte)-1);
            var29.field430 = null;
            var29.field431 = 0;
            var29.field435 = new class435(5000);
            var29.field435.method1643(class25.field257.field259);
            var29.field435.method1684(this.field1203.field2652);
            var29.field435.method1649(this.field1203);
            field1181.method2254(var29);
            field1181.method2253();
            this.field1203 = null;
            method902(6);
         }

         if (field1152 == 10 && ((class331)var2).method1558() > 0) {
            class238.field1735 = ((class331)var2).method1560();
            method902(11);
         }

         if (11 == field1152 && ((class331)var2).method1558() >= class238.field1735) {
            ((class331)var2).method1557(var3.field2650, 0, class238.field1735);
            var3.field2652 = 0;
            method902(6);
         }

         if (field1152 == 12 && ((class331)var2).method1558() > 0) {
            field1254 = (((class331)var2).method1560() + 3) * 60;
            method902(13);
         }

         if (field1152 == 13) {
            field1131 = 0;
            class292.method1328(class424.field3044, class424.field3045, field1254 / 60 + class424.field3224);
            if (--field1254 <= 0) {
               method902(0);
            }

         } else {
            if (14 == field1152 && ((class331)var2).method1558() >= 1) {
               class61.field480 = ((class331)var2).method1560();
               method902(15);
            }

            if (field1152 == 15 && ((class331)var2).method1558() >= class61.field480) {
               boolean var40 = ((class331)var2).method1560() == 1;
               ((class331)var2).method1557(var3.field2650, 0, 4);
               var3.field2652 = 0;
               boolean var39 = false;
               if (var40) {
                  var32 = var3.method2031() << 24;
                  var32 |= var3.method2031() << 16;
                  var32 |= var3.method2031() << 8;
                  var32 |= var3.method2031();
                  class158.field1004.method525(class292.field2007, var32);
               }

               if (field1170) {
                  class158.field1004.method520(class292.field2007);
               } else {
                  class158.field1004.method520((String)null);
               }

               class142.method538();
               field1204 = ((class331)var2).method1560();
               field1412 = ((class331)var2).method1560() == 1;
               field1244 = ((class331)var2).method1560();
               field1244 <<= 8;
               field1244 += ((class331)var2).method1560();
               field1245 = ((class331)var2).method1560();
               ((class331)var2).method1557(var3.field2650, 0, 8);
               var3.field2652 = 0;
               this.field1174 = var3.method1659();
               ((class331)var2).method1557(var3.field2650, 0, 8);
               var3.field2652 = 0;
               field1246 = var3.method1659();
               if (field1298 >= 214) {
                  ((class331)var2).method1557(var3.field2650, 0, 8);
                  var3.field2652 = 0;
                  var3.method1659();
               }

               ((class331)var2).method1557(var3.field2650, 0, 1);
               var3.field2652 = 0;
               class324[] var31 = class324.method1493();
               int var37 = var3.method2035();
               if (var37 < 0 || var37 >= var31.length) {
                  throw new IOException(var37 + " " + var3.field2652);
               }

               field1181.field3778 = var31[var37];
               field1181.field3784 = field1181.field3778.field2429;
               ((class331)var2).method1557(var3.field2650, 0, 2);
               var3.field2652 = 0;
               field1181.field3784 = var3.method1703();

               try {
                  Client var41 = class530.field4182;
                  JSObject.getWindow(var41).call("zap", (Object[])null);
               } catch (Throwable var14) {
               }

               method902(16);
            }

            if (field1152 != 16) {
               if (field1152 == 17 && ((class331)var2).method1558() >= 2) {
                  var3.field2652 = 0;
                  ((class331)var2).method1557(var3.field2650, 0, 2);
                  var3.field2652 = 0;
                  class302.field2051 = var3.method1703();
                  method902(18);
               }

               if (field1152 == 18 && ((class331)var2).method1558() >= class302.field2051) {
                  var3.field2652 = 0;
                  ((class331)var2).method1557(var3.field2650, 0, class302.field2051);
                  var3.field2652 = 0;
                  String var45 = var3.method1662();
                  String var43 = var3.method1662();
                  String var36 = var3.method1662();
                  class292.method1328(var45, var43, var36);
                  method904(10);
                  if (field1161.method1199()) {
                     class292.method1316(9);
                  }
               }

               if (field1152 == 19) {
                  if (field1181.field3784 == -1) {
                     if (((class331)var2).method1558() < 2) {
                        return;
                     }

                     ((class331)var2).method1557(var3.field2650, 0, 2);
                     var3.field2652 = 0;
                     field1181.field3784 = var3.method1703();
                  }

                  if (((class331)var2).method1558() >= field1181.field3784) {
                     ((class331)var2).method1557(var3.field2650, 0, field1181.field3784);
                     var3.field2652 = 0;
                     var28 = field1181.field3784;
                     field1184.method1953();
                     method826();
                     class470.method2216(var3);
                     if (var3.field2652 != var28) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field1131;
                  if (field1131 > 2000) {
                     if (field1182 < 1) {
                        if (class12.field183 == class136.field853) {
                           class136.field853 = class249.field1797;
                        } else {
                           class136.field853 = class12.field183;
                        }

                        ++field1182;
                        method902(0);
                     } else {
                        class336.method1567(-3);
                     }
                  }
               }
            } else {
               if (((class331)var2).method1558() >= field1181.field3784) {
                  var3.field2652 = 0;
                  ((class331)var2).method1557(var3.field2650, 0, field1181.field3784);
                  field1184.method1956();
                  field1179 = -1L;
                  class129.field806.field720 = 0;
                  class28.field268 = true;
                  field1135 = true;
                  field1359 = -1L;
                  class177.method952();
                  field1181.method2259();
                  field1181.field3782.field2652 = 0;
                  field1181.field3778 = null;
                  field1181.field3783 = null;
                  field1181.field3789 = null;
                  field1181.field3790 = null;
                  field1181.field3784 = 0;
                  field1181.field3788 = 0;
                  field1136 = 0;
                  field1169 = 0;
                  field1194 = 0;
                  method882();
                  class496.method2344(0);
                  class431.method2009();
                  field1281 = 0;
                  field1208 = false;
                  field1371 = 0;
                  field1294 = 0;
                  field1209 = 0;
                  class294.field2020 = null;
                  field1369 = 0;
                  field1362 = -1;
                  field1367 = 0;
                  field1290 = 0;
                  field1145 = class143.field896;
                  field1146 = class143.field896;
                  field1177 = 0;
                  class470.field3728 = 0;

                  for(var28 = 0; var28 < 2048; ++var28) {
                     class470.field3736[var28] = null;
                     class470.field3726[var28] = class82.field561;
                  }

                  for(var28 = 0; var28 < 2048; ++var28) {
                     field1289[var28] = null;
                  }

                  for(var28 = 0; var28 < 65536; ++var28) {
                     field1176[var28] = null;
                  }

                  field1255 = -1;
                  field1243.method1987();
                  field1386.method1987();

                  for(var28 = 0; var28 < 4; ++var28) {
                     for(var32 = 0; var32 < 104; ++var32) {
                        for(int var33 = 0; var33 < 104; ++var33) {
                           field1256[var28][var32][var33] = null;
                        }
                     }
                  }

                  field1257 = new class429();
                  class290.field1979.method544();

                  for(var28 = 0; var28 < class107.field700; ++var28) {
                     class107 var42 = class412.method1897(var28);
                     if (null != var42) {
                        class486.field3909[var28] = 0;
                        class486.field3907[var28] = 0;
                     }
                  }

                  class238.field1742.method1582();
                  field1151 = -1;
                  if (field1288 != -1) {
                     class322.method1490(field1288);
                  }

                  for(class127 var44 = (class127)field1137.method1432(); null != var44; var44 = (class127)field1137.method1433()) {
                     method821(var44, true);
                  }

                  field1288 = -1;
                  field1137 = new class313(8);
                  field1293 = null;
                  method882();
                  field1402.method1080((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var28 = 0; var28 < 8; ++var28) {
                     field1139[var28] = null;
                     field1253[var28] = false;
                  }

                  class532.method2524();
                  field1129 = true;

                  for(var28 = 0; var28 < 100; ++var28) {
                     field1126[var28] = true;
                  }

                  method806();
                  class498.field3983 = null;
                  class470.field3738 = null;
                  Arrays.fill(field1360, (Object)null);
                  class422.field2979 = null;
                  Arrays.fill(field1361, (Object)null);

                  for(var28 = 0; var28 < 8; ++var28) {
                     field1394[var28] = new class517();
                  }

                  class351.field2581 = null;
                  field1127 = false;
                  class470.method2216(var3);
                  class513.field4088 = -1;
                  method889(false, var3);
                  field1181.field3778 = null;
               }

            }
         }
      } catch (IOException var22) {
         if (field1182 < 1) {
            if (class12.field183 == class136.field853) {
               class136.field853 = class249.field1797;
            } else {
               class136.field853 = class12.field183;
            }

            ++field1182;
            method902(0);
         } else {
            class336.method1567(-2);
         }
      }
   }

   final void method770() {
      if (field1136 > 1) {
         --field1136;
      }

      if (field1169 > 0) {
         --field1169;
      }

      if (field1183) {
         field1183 = false;
         method870();
      } else {
         if (!field1229) {
            method909();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method755(field1181); ++var2) {
         }

         if (30 == field1200) {
            while(true) {
               class498 var3 = (class498)class177.field1433.method2144();
               boolean var17;
               if (null == var3) {
                  var17 = false;
               } else {
                  var17 = true;
               }

               int var4;
               class53 var18;
               if (!var17) {
                  class53 var19;
                  int var20;
                  if (field1184.field3325) {
                     var19 = class53.method226(class10.field91, field1181.field3781);
                     var19.field435.method1643(0);
                     var20 = var19.field435.field2652;
                     field1184.method1958(var19.field435);
                     var19.field435.method1652(var19.field435.field2652 - var20);
                     field1181.method2254(var19);
                     field1184.method1957();
                  }

                  int var5;
                  int var6;
                  synchronized(class129.field806.field719) {
                     if (!field1156) {
                        class129.field806.field720 = 0;
                     } else if (0 != class496.field3971 || class129.field806.field720 >= 40) {
                        var18 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        int var7 = 0;

                        int var8;
                        for(var8 = 0; var8 < class129.field806.field720 && (null == var18 || var18.field435.field2652 - var4 < 246); ++var8) {
                           var5 = var8;
                           int var9 = class129.field806.field722[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           int var10 = class129.field806.field721[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (var10 != field1132 || field1133 != var9) {
                              if (null == var18) {
                                 var18 = class53.method226(class10.field151, field1181.field3781);
                                 var18.field435.method1643(0);
                                 var4 = var18.field435.field2652;
                                 class435 var10000 = var18.field435;
                                 var10000.field2652 += 2;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              int var11;
                              int var12;
                              int var13;
                              if (field1259 != -1L) {
                                 var11 = var10 - field1132;
                                 var12 = var9 - field1133;
                                 var13 = (int)((class129.field806.field723[var8] - field1259) / 20L);
                                 var6 = (int)((long)var6 + (class129.field806.field723[var8] - field1259) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              field1132 = var10;
                              field1133 = var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var18.field435.method1684((var13 << 12) + (var11 << 6) + var12);
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var18.field435.method1643(var13 + 128);
                                 var18.field435.method1684(var12 + (var11 << 8));
                              } else if (var13 < 32) {
                                 var18.field435.method1643(var13 + 192);
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field435.method1709(var10 | var9 << 16);
                                 } else {
                                    var18.field435.method1709(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var18.field435.method1684('\ue000' + (var13 & 8191));
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field435.method1709(var10 | var9 << 16);
                                 } else {
                                    var18.field435.method1709(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              field1259 = class129.field806.field723[var8];
                           }
                        }

                        if (null != var18) {
                           var18.field435.method1652(var18.field435.field2652 - var4);
                           var8 = var18.field435.field2652;
                           var18.field435.field2652 = var4;
                           var18.field435.method1643(var6 / var7);
                           var18.field435.method1643(var6 % var7);
                           var18.field435.field2652 = var8;
                           field1181.method2254(var18);
                        }

                        if (var5 >= class129.field806.field720) {
                           class129.field806.field720 = 0;
                        } else {
                           class112 var41 = class129.field806;
                           var41.field720 -= var5;
                           System.arraycopy(class129.field806.field721, var5, class129.field806.field721, 0, class129.field806.field720);
                           System.arraycopy(class129.field806.field722, var5, class129.field806.field722, 0, class129.field806.field720);
                           System.arraycopy(class129.field806.field723, var5, class129.field806.field723, 0, class129.field806.field720);
                        }
                     }
                  }

                  class53 var31;
                  if (class496.field3971 == 1 || !class301.field2050 && class496.field3971 == 4 || 2 == class496.field3971) {
                     long var21 = class496.field3961 - field1179;
                     if (var21 > 32767L) {
                        var21 = 32767L;
                     }

                     field1179 = class496.field3961;
                     var4 = class496.field3973;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > class394.field2761) {
                        var4 = class394.field2761;
                     }

                     var5 = class496.field3972;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > class114.field730) {
                        var5 = class114.field730;
                     }

                     var6 = (int)var21;
                     var31 = class53.method226(class10.field117, field1181.field3781);
                     var31.field435.method1684((class496.field3971 == 2 ? 1 : 0) + (var6 << 1));
                     var31.field435.method1684(var5);
                     var31.field435.method1684(var4);
                     field1181.method2254(var31);
                  }

                  if (0 != field1329) {
                     var19 = class53.method226(class10.field165, field1181.field3781);
                     var19.field435.method1684(field1329);
                     field1181.method2254(var19);
                  }

                  if (field1264.field2055 > 0) {
                     var19 = class53.method226(class10.field79, field1181.field3781);
                     var19.field435.method1684(0);
                     var20 = var19.field435.field2652;
                     long var22 = class123.method471();

                     for(var6 = 0; var6 < field1264.field2055; ++var6) {
                        long var34 = var22 - field1359;
                        if (var34 > 16777215L) {
                           var34 = 16777215L;
                        }

                        field1359 = var22;
                        var19.field435.method1716(field1264.field2054[var6]);
                        var19.field435.method1686((int)var34);
                     }

                     var19.field435.method1651(var19.field435.field2652 - var20);
                     field1181.method2254(var19);
                  }

                  if (field1218 > 0) {
                     --field1218;
                  }

                  if (field1264.method1385(96) || field1264.method1385(97) || field1264.method1385(98) || field1264.method1385(99)) {
                     field1219 = true;
                  }

                  if (field1219 && field1218 <= 0) {
                     field1218 = 20;
                     field1219 = false;
                     var19 = class53.method226(class10.field102, field1181.field3781);
                     var19.field435.method1684(field1294);
                     var19.field435.method1679(field1155);
                     field1181.method2254(var19);
                  }

                  if (class28.field268 && !field1135) {
                     field1135 = true;
                     var19 = class53.method226(class10.field131, field1181.field3781);
                     var19.field435.method1643(1);
                     field1181.method2254(var19);
                  }

                  if (!class28.field268 && field1135) {
                     field1135 = false;
                     var19 = class53.method226(class10.field131, field1181.field3781);
                     var19.field435.method1643(0);
                     field1181.method2254(var19);
                  }

                  if (class512.field4083 != null) {
                     class512.field4083.method412();
                  }

                  if (class163.field1040) {
                     if (null != class498.field3983) {
                        class498.field3983.method1815();
                     }

                     for(var2 = 0; var2 < class470.field3728; ++var2) {
                        class443 var23 = field1289[class470.field3729[var2]];
                        var23.method2054();
                     }

                     class163.field1040 = false;
                  }

                  method921();
                  method853();
                  if (field1200 != 30) {
                     return;
                  }

                  method932();
                  class512.method2452();
                  ++field1181.field3788;
                  if (field1181.field3788 > 750) {
                     method870();
                     return;
                  }

                  var2 = class470.field3728;
                  int[] var24 = class470.field3729;

                  for(var4 = 0; var4 < var2; ++var4) {
                     class443 var25 = field1289[var24[var4]];
                     if (null != var25) {
                        method899(var25, 1);
                     }
                  }

                  for(var2 = 0; var2 < field1177; ++var2) {
                     var20 = field1115[var2];
                     class86 var26 = field1176[var20];
                     if (null != var26) {
                        method899(var26, var26.field577.field617);
                     }
                  }

                  method878();
                  ++field1195;
                  if (field1353 != 0) {
                     field1295 += 20;
                     if (field1295 >= 400) {
                        field1353 = 0;
                     }
                  }

                  class322 var32 = class207.field1596;
                  class322 var27 = class405.field2812;
                  class207.field1596 = null;
                  class405.field2812 = null;
                  field1304 = null;
                  field1352 = false;
                  field1305 = false;
                  field1356 = 0;

                  while(field1264.method1386() && field1356 < 128) {
                     if (field1204 >= 2 && field1264.method1385(82) && field1264.field2065 == 66) {
                        StringBuilder var28 = new StringBuilder();

                        class243 var38;
                        for(Iterator var33 = class431.field3368.iterator(); var33.hasNext(); var28.append(var38.field1776).append('\n')) {
                           var38 = (class243)var33.next();
                           if (null != var38.field1771 && !var38.field1771.isEmpty()) {
                              var28.append(var38.field1771).append(':');
                           }
                        }

                        String var29 = var28.toString();
                        class530.field4182.method2539(var29);
                     } else if (field1209 != 1 || field1264.field2052 <= 0) {
                        field1358[field1356] = field1264.field2065;
                        field1357[field1356] = field1264.field2052;
                        ++field1356;
                     }
                  }

                  boolean var30 = field1204 >= 2;
                  if (var30 && field1264.method1385(82) && field1264.method1385(81) && 0 != field1329) {
                     var5 = class266.field1874.field3514 - field1329;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > 3) {
                        var5 = 3;
                     }

                     if (var5 != class266.field1874.field3514) {
                        method820(class36.field314 + class266.field1874.field3448[0], class525.field4175 + class266.field1874.field3445[0], var5, false);
                     }

                     field1329 = 0;
                  }

                  if (1 == class496.field3971) {
                     field1355.method1825();
                  }

                  if (-1 != field1288) {
                     method809(field1288, 0, 0, class114.field730, class394.field2761, 0, 0);
                  }

                  ++field1118;

                  while(true) {
                     class322 var35;
                     class64 var36;
                     class322 var39;
                     do {
                        var36 = (class64)field1317.method1989();
                        if (var36 == null) {
                           while(true) {
                              do {
                                 var36 = (class64)field1333.method1989();
                                 if (null == var36) {
                                    while(true) {
                                       do {
                                          var36 = (class64)field1331.method1989();
                                          if (null == var36) {
                                             while(true) {
                                                class55 var40 = (class55)field1370.method1989();
                                                if (var40 == null) {
                                                   this.method756();
                                                   method893();
                                                   if (field1300 != null) {
                                                      this.method761();
                                                   }

                                                   if (class408.method1861()) {
                                                      var5 = class408.field2849;
                                                      var6 = class408.field2850;
                                                      var31 = class53.method226(class10.field85, field1181.field3781);
                                                      var31.field435.method1643(5);
                                                      var31.field435.method1679(var5 + class36.field314);
                                                      var31.field435.method1706(class525.field4175 + var6);
                                                      var31.field435.method1690(field1264.method1385(82) ? (field1264.method1385(81) ? 2 : 1) : 0);
                                                      field1181.method2254(var31);
                                                      class408.method1884();
                                                      field1236 = class496.field3972;
                                                      field1237 = class496.field3973;
                                                      field1353 = 1;
                                                      field1295 = 0;
                                                      field1367 = var5;
                                                      field1290 = var6;
                                                   }

                                                   if (var32 != class207.field1596) {
                                                      if (null != var32) {
                                                         method869(var32);
                                                      }

                                                      if (class207.field1596 != null) {
                                                         method869(class207.field1596);
                                                      }
                                                   }

                                                   if (class405.field2812 != var27 && field1279 == field1280) {
                                                      if (null != var27) {
                                                         method869(var27);
                                                      }

                                                      if (null != class405.field2812) {
                                                         method869(class405.field2812);
                                                      }
                                                   }

                                                   if (null != class405.field2812) {
                                                      if (field1279 < field1280) {
                                                         ++field1279;
                                                         if (field1279 == field1280) {
                                                            method869(class405.field2812);
                                                         }
                                                      }
                                                   } else if (field1279 > 0) {
                                                      --field1279;
                                                   }

                                                   method927();
                                                   if (field1383) {
                                                      method834(class467.field3696, class238.field1736, class410.field2890);
                                                      class170.method656(class16.field200, class363.field2615);
                                                      if (class90.field647 == class467.field3696 && class291.field1981 == class238.field1736 && class84.field572 == class410.field2890 && class249.field1796 == class16.field200 && class455.field3578 == class363.field2615) {
                                                         field1383 = false;
                                                         field1377 = false;
                                                         field1378 = false;
                                                         field1379 = false;
                                                         class415.field2917 = 0;
                                                         class266.field1871 = 0;
                                                         class38.field327 = 0;
                                                         class79.field553 = 0;
                                                         class430.field3364 = 0;
                                                         class496.field3975 = 0;
                                                         class482.field3801 = 0;
                                                         class470.field3724 = 0;
                                                         class79.field551 = 0;
                                                         class107.field704 = 0;
                                                         field1381 = null;
                                                         field1198 = null;
                                                         field1172 = null;
                                                      }
                                                   } else if (field1377) {
                                                      method843();
                                                   }

                                                   for(var5 = 0; var5 < 5; ++var5) {
                                                      int var10002 = field1334[var5]++;
                                                   }

                                                   class238.field1742.method1577();
                                                   var5 = class496.method2345();
                                                   var6 = class535.field4270.method1160();
                                                   class53 var37;
                                                   if (var5 > 15000 && var6 > 15000) {
                                                      field1169 = 250;
                                                      class496.method2344(14500);
                                                      var37 = class53.method226(class10.field103, field1181.field3781);
                                                      field1181.method2254(var37);
                                                   }

                                                   class290.field1979.method543();
                                                   method851();
                                                   ++field1181.field3787;
                                                   if (field1181.field3787 > 50) {
                                                      var37 = class53.method226(class10.field119, field1181.field3781);
                                                      field1181.method2254(var37);
                                                   }

                                                   try {
                                                      field1181.method2253();
                                                   } catch (IOException var15) {
                                                      method870();
                                                   }

                                                   return;
                                                }

                                                method856(var40);
                                             }
                                          }

                                          var35 = var36.field504;
                                          if (var35.field2277 < 0) {
                                             break;
                                          }

                                          var39 = class322.method1488(var35.field2175);
                                       } while(null == var39 || var39.field2290 == null || var35.field2277 >= var39.field2290.length || var35 != var39.field2290[var35.field2277]);

                                       class197.method1038(var36);
                                    }
                                 }

                                 var35 = var36.field504;
                                 if (var35.field2277 < 0) {
                                    break;
                                 }

                                 var39 = class322.method1488(var35.field2175);
                              } while(null == var39 || var39.field2290 == null || var35.field2277 >= var39.field2290.length || var35 != var39.field2290[var35.field2277]);

                              class197.method1038(var36);
                           }
                        }

                        var35 = var36.field504;
                        if (var35.field2277 < 0) {
                           break;
                        }

                        var39 = class322.method1488(var35.field2175);
                     } while(null == var39 || null == var39.field2290 || var35.field2277 >= var39.field2290.length || var35 != var39.field2290[var35.field2277]);

                     class197.method1038(var36);
                  }
               }

               var18 = class53.method226(class10.field83, field1181.field3781);
               var18.field435.method1643(0);
               var4 = var18.field435.field2652;
               class177.method951(var18.field435);
               var18.field435.method1652(var18.field435.field2652 - var4);
               field1181.method2254(var18);
            }
         }
      }
   }

   public void method470(int var1, int var2) {
      if (null != field1181 && null != field1181.field3781) {
         if (var1 > -1 && class158.field1004.method510() > 0 && !field1388) {
            class53 var4 = class53.method226(class10.field172, field1181.field3781);
            var4.field435.method1709(var1);
            field1181.method2254(var4);
         }

      }
   }

   protected final void method2545() {
      field1346 = class123.method471() + 500L;
      this.method752();
      if (-1 != field1288) {
         this.method759(true);
      }

   }

   void method752() {
      int var2 = class114.field730;
      int var3 = class394.field2761;
      if (super.field4255 < var2) {
         var2 = super.field4255;
      }

      if (super.field4261 < var3) {
         var3 = super.field4261;
      }

      if (class158.field1004 != null) {
         try {
            class507.method2421(class530.field4182, "resize", new Object[]{method868()});
         } catch (Throwable var5) {
         }
      }

   }

   final void method753() {
      if (-1 != field1288) {
         method901(field1288);
      }

      int var2;
      for(var2 = 0; var2 < field1287; ++var2) {
         if (field1126[var2]) {
            field1339[var2] = true;
         }

         field1340[var2] = field1126[var2];
         field1126[var2] = false;
      }

      field1337 = field1419;
      field1277 = -1;
      field1278 = -1;
      if (-1 != field1288) {
         field1287 = 0;
         method795(field1288, 0, 0, class114.field730, class394.field2761, 0, 0, -1);
      }

      class427.method1962();
      if (field1405) {
         if (1 == field1353) {
            class2.field4[field1295 / 100].method1366(field1236 - 8, field1237 - 8);
         }

         if (2 == field1353) {
            class2.field4[4 + field1295 / 100].method1366(field1236 - 8, field1237 - 8);
         }
      }

      int var3;
      int var4;
      if (!field1229) {
         if (field1277 != -1) {
            var2 = field1277;
            var3 = field1278;
            if ((field1265 >= 2 || 0 != field1281 || field1208) && field1276) {
               var4 = field1265 - 1;
               String var6;
               if (field1281 == 1 && field1265 < 2) {
                  var6 = class424.field3165 + class424.field3049 + field1282 + " " + class389.field2750;
               } else if (field1208 && field1265 < 2) {
                  var6 = field1299 + class424.field3049 + field1310 + " " + class389.field2750;
               } else {
                  var6 = method855(var4);
               }

               if (field1265 > 2) {
                  var6 = var6 + class389.method1778(16777215) + " " + '/' + " " + (field1265 - 2) + class424.field3032;
               }

               class274.field1923.method1941(var6, var2 + 4, var3 + 15, 16777215, 0, field1419 / 1000);
            }
         }
      } else {
         var2 = class268.field1878;
         var3 = class233.field1719;
         var4 = class364.field2617;
         int var5 = class414.field2900;
         int var14 = 6116423;
         class427.method1968(var2, var3, var4, var5, var14);
         class427.method1968(var2 + 1, var3 + 1, var4 - 2, 16, 0);
         class427.method1971(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
         class274.field1923.method1943(class424.field3168, var2 + 3, var3 + 14, var14, -1);
         int var7 = class496.field3977;
         int var8 = class496.field3960;

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < field1265; ++var9) {
            var10 = 15 * (field1265 - 1 - var9) + var3 + 31;
            var11 = 16777215;
            if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            class274.field1923.method1943(method855(var9), var2 + 3, var10, var11, 0);
         }

         var9 = class268.field1878;
         var10 = class233.field1719;
         var11 = class364.field2617;
         int var12 = class414.field2900;

         for(int var13 = 0; var13 < field1287; ++var13) {
            if (field1341[var13] + field1343[var13] > var9 && field1341[var13] < var9 + var11 && field1342[var13] + field1344[var13] > var10 && field1342[var13] < var10 + var12) {
               field1339[var13] = true;
            }
         }
      }

      if (field1345 == 3) {
         for(var2 = 0; var2 < field1287; ++var2) {
            if (field1340[var2]) {
               class427.method1967(field1341[var2], field1342[var2], field1343[var2], field1344[var2], 16711935, 128);
            } else if (field1339[var2]) {
               class427.method1967(field1341[var2], field1342[var2], field1343[var2], field1344[var2], 16711680, 128);
            }
         }
      }

      class307.method1408(class156.field980, class266.field1874.field3403, class266.field1874.field3374, field1195);
      field1195 = 0;
   }

   boolean method774(class479 var1, int var2) {
      if (var1.field3784 == 0) {
         class498.field3983 = null;
      } else {
         if (null == class498.field3983) {
            class498.field3983 = new class234(class103.field694, class530.field4182);
         }

         class498.field3983.method1144(var1.field3782, var2);
      }

      field1323 = field1118;
      class163.field1040 = true;
      var1.field3778 = null;
      return true;
   }

   boolean method754(class479 var1) {
      if (class498.field3983 != null) {
         class498.field3983.method1145(var1.field3782, (byte)-59);
      }

      field1323 = field1118;
      class163.field1040 = true;
      var1.field3778 = null;
      return true;
   }

   final boolean method755(class479 var1) {
      class331 var3 = var1.method2257();
      class435 var4 = var1.field3782;
      if (null == var3) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int var25;
            if (null == var1.field3778) {
               if (var1.field3785) {
                  if (!var3.method1556(1)) {
                     return false;
                  }

                  var3.method1557(var1.field3782.field2650, 0, 1);
                  var1.field3788 = 0;
                  var1.field3785 = false;
               }

               var4.field2652 = 0;
               if (var4.method2033()) {
                  if (!var3.method1556(1)) {
                     return false;
                  }

                  var3.method1557(var1.field3782.field2650, 1, 1);
                  var1.field3788 = 0;
               }

               var1.field3785 = true;
               class324[] var5 = class324.method1493();
               var25 = var4.method2035();
               if (var25 < 0 || var25 >= var5.length) {
                  throw new IOException(var25 + " " + var4.field2652);
               }

               var1.field3778 = var5[var25];
               var1.field3784 = var1.field3778.field2429;
            }

            if (-1 == var1.field3784) {
               if (!var3.method1556(1)) {
                  return false;
               }

               var1.method2257().method1557(var4.field2650, 0, 1);
               var1.field3784 = var4.field2650[0] & 255;
            }

            if (-2 == var1.field3784) {
               if (!var3.method1556(2)) {
                  return false;
               }

               var1.method2257().method1557(var4.field2650, 0, 2);
               var4.field2652 = 0;
               var1.field3784 = var4.method1703();
            }

            if (!var3.method1556(var1.field3784)) {
               return false;
            }

            var4.field2652 = 0;
            var3.method1557(var4.field2650, 0, var1.field3784);
            var1.field3788 = 0;
            field1184.method1954();
            var1.field3790 = var1.field3789;
            var1.field3789 = var1.field3783;
            var1.field3783 = var1.field3778;
            if (class324.field2366 == var1.field3778) {
               class108.field713 = class375.method1741(var4.method1654());
               var1.field3778 = null;
               return true;
            }

            int var8;
            int var9;
            int var10;
            int var11;
            int var14;
            int var16;
            int var23;
            int var36;
            int var46;
            if (class324.field2389 == var1.field3778) {
               var7 = var4.method1711();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var25;
               var10 = var4.method1676();
               var11 = var10 >> 2;
               var36 = var10 & 3;
               var46 = field1301[var11];
               var14 = var4.method1703();
               if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                  if (var46 == 0) {
                     class71 var81 = class137.field875.method1850(class156.field980, var8, var9);
                     if (null != var81) {
                        var16 = class463.method2185(var81.field539);
                        if (var11 == 2) {
                           var81.field540 = new class359(var16, 2, var36 + 4, class156.field980, var8, var9, var14, false, var81.field540);
                           var81.field538 = new class359(var16, 2, var36 + 1 & 3, class156.field980, var8, var9, var14, false, var81.field538);
                        } else {
                           var81.field540 = new class359(var16, var11, var36, class156.field980, var8, var9, var14, false, var81.field540);
                        }
                     }
                  } else if (var46 == 1) {
                     class385 var80 = class137.field875.method1851(class156.field980, var8, var9);
                     if (null != var80) {
                        var16 = class463.method2185(var80.field2731);
                        if (var11 != 4 && var11 != 5) {
                           if (var11 == 6) {
                              var80.field2728 = new class359(var16, 4, var36 + 4, class156.field980, var8, var9, var14, false, var80.field2728);
                           } else if (var11 == 7) {
                              var80.field2728 = new class359(var16, 4, (var36 + 2 & 3) + 4, class156.field980, var8, var9, var14, false, var80.field2728);
                           } else if (var11 == 8) {
                              var80.field2728 = new class359(var16, 4, var36 + 4, class156.field980, var8, var9, var14, false, var80.field2728);
                              var80.field2729 = new class359(var16, 4, 4 + (var36 + 2 & 3), class156.field980, var8, var9, var14, false, var80.field2729);
                           }
                        } else {
                           var80.field2728 = new class359(var16, 4, var36, class156.field980, var8, var9, var14, false, var80.field2728);
                        }
                     }
                  } else if (var46 == 2) {
                     class276 var77 = class137.field875.method1888(class156.field980, var8, var9);
                     if (var11 == 11) {
                        var11 = 10;
                     }

                     if (null != var77) {
                        var77.field1935 = new class359(class463.method2185(var77.field1940), var11, var36, class156.field980, var8, var9, var14, false, var77.field1935);
                     }
                  } else if (var46 == 3) {
                     class514 var79 = class137.field875.method1875(class156.field980, var8, var9);
                     if (null != var79) {
                        var79.field4106 = new class359(class463.method2185(var79.field4105), 22, var36, class156.field980, var8, var9, var14, false, var79.field4106);
                     }
                  }
               }

               var1.field3778 = null;
               return true;
            }

            class322 var85;
            if (var1.field3778 == class324.field2363) {
               var23 = var4.method1658();
               var85 = class322.method1488(var23);
               var85.field2200 = 3;
               var85.field2201 = class266.field1874.field3494.method1078();
               method869(var85);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2425) {
               field1383 = false;
               field1377 = false;
               field1378 = false;
               field1379 = false;
               class415.field2917 = 0;
               class266.field1871 = 0;
               class38.field327 = 0;
               field1380 = false;
               class79.field553 = 0;
               class430.field3364 = 0;
               class496.field3975 = 0;
               class482.field3801 = 0;
               class470.field3724 = 0;
               class79.field551 = 0;
               class107.field704 = 0;
               field1381 = null;
               field1198 = null;
               field1172 = null;

               for(var23 = 0; var23 < 5; ++var23) {
                  field1384[var23] = false;
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2357 == var1.field3778) {
               class84.field571 = null;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2390) {
               var23 = var4.method1658();
               var25 = var4.method1658();
               var7 = class535.method2572();
               class53 var83 = class53.method226(class10.field161, field1181.field3781);
               var83.field435.method1643(class535.field4247);
               var83.field435.method1663(var23);
               var83.field435.method1692(var25);
               var83.field435.method1674(var7);
               field1181.method2254(var83);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2326) {
               method835();
               field1403 = var4.method1656();
               field1168 = field1118;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2376 == var1.field3778) {
               class518.method2483(class473.field3747);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2312) {
               var23 = var4.method1681();
               class532.method2519(var23);
               field1315[++field1316 - 1 & 31] = var23 & 32767;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2418) {
               class518.method2483(class473.field3751);
               var1.field3778 = null;
               return true;
            }

            boolean var12;
            long var32;
            long var41;
            long var49;
            String var53;
            int var62;
            byte var76;
            if (class324.field2406 == var1.field3778) {
               var76 = var4.method1655();
               var49 = (long)var4.method1703();
               var32 = (long)var4.method1710();
               var41 = (var49 << 32) + var32;
               var12 = false;
               class417 var72 = var76 >= 0 ? field1361[var76] : class422.field2979;
               if (null == var72) {
                  var12 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (field1262[var14] == var41) {
                        var12 = true;
                        break;
                     }
                  }
               }

               if (!var12) {
                  field1262[field1124] = var41;
                  field1124 = (1 + field1124) % 100;
                  var53 = class453.method2111(var4);
                  var62 = var76 >= 0 ? 43 : 46;
                  class431.method2014(var62, "", var53, var72.field2936);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2336) {
               class470.method2217(var4, var1.field3784);
               class106.method388();
               var1.field3778 = null;
               return true;
            }

            if (class324.field2349 == var1.field3778) {
               field1377 = true;
               field1383 = false;
               field1379 = true;
               class415.field2917 = var4.method1654();
               class266.field1871 = var4.method1654();
               class38.field327 = var4.method1703();
               var23 = var4.method1703();
               var25 = var4.method1654();
               var7 = 64 + class415.field2917 * 128;
               var8 = 64 + class266.field1871 * 128;
               var9 = method787(var7, var8, class156.field980) - class38.field327;
               var10 = var7 - class90.field647;
               var11 = var9 - class291.field1981;
               var36 = var8 - class84.field572;
               double var69 = Math.sqrt((double)(var36 * var36 + var10 * var10));
               var62 = method822((int)(Math.atan2((double)var11, var69) * 325.9490051269531) & 2047);
               var16 = method781((int)(Math.atan2((double)var10, (double)var36) * -325.9490051269531) & 2047);
               field1198 = new class230(class249.field1796, var62, var23, var25);
               field1172 = new class230(class455.field3578, var16, var23, var25);
               var1.field3778 = null;
               return true;
            }

            long var52;
            class127 var78;
            if (var1.field3778 == class324.field2398) {
               var23 = var1.field3784 + var4.field2652;
               var25 = var4.method1703();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var7 = var4.method1703();
               if (field1288 != var25) {
                  field1288 = var25;
                  this.method759(false);
                  method778(field1288);
                  class197.method1031(field1288);

                  for(var8 = 0; var8 < 100; ++var8) {
                     field1126[var8] = true;
                  }
               }

               class127 var68;
               for(; var7-- > 0; var68.field802 = true) {
                  var8 = var4.method1658();
                  var9 = var4.method1703();
                  var10 = var4.method1654();
                  var68 = (class127)field1137.method1431((long)var8);
                  if (null != var68 && var9 != var68.field803) {
                     method821(var68, true);
                     var68 = null;
                  }

                  if (var68 == null) {
                     var68 = method906(var8, var9, var10);
                  }
               }

               for(var78 = (class127)field1137.method1432(); var78 != null; var78 = (class127)field1137.method1433()) {
                  if (var78.field802) {
                     var78.field802 = false;
                  } else {
                     method821(var78, true);
                  }
               }

               field1335 = new class313(512);

               while(var4.field2652 < var23) {
                  var8 = var4.method1658();
                  var9 = var4.method1703();
                  var10 = var4.method1703();
                  var11 = var4.method1658();

                  for(var36 = var9; var36 <= var10; ++var36) {
                     var52 = ((long)var8 << 32) + (long)var36;
                     field1335.method1434(new class323(var11), var52);
                  }
               }

               var1.field3778 = null;
               return true;
            }

            class322 var65;
            if (var1.field3778 == class324.field2415) {
               var23 = var4.method1658();
               var25 = var4.method1699();
               class127 var88 = (class127)field1137.method1431((long)var25);
               var78 = (class127)field1137.method1431((long)var23);
               if (null != var78) {
                  method821(var78, var88 == null || var78.field803 != var88.field803);
               }

               if (null != var88) {
                  var88.method295();
                  field1137.method1434(var88, (long)var23);
               }

               var65 = class322.method1488(var25);
               if (var65 != null) {
                  method869(var65);
               }

               var65 = class322.method1488(var23);
               if (var65 != null) {
                  method869(var65);
                  method808(class53.field436[var65.field2158 >>> 16], var65, true);
               }

               if (-1 != field1288) {
                  method919(field1288, 1);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2370) {
               class487.method2326();
               var76 = var4.method1655();
               if (var1.field3784 == 1) {
                  if (var76 >= 0) {
                     field1360[var76] = null;
                  } else {
                     class470.field3738 = null;
                  }

                  var1.field3778 = null;
                  return true;
               }

               if (var76 >= 0) {
                  field1360[var76] = new class8(var4);
               } else {
                  class470.field3738 = new class8(var4);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2383) {
               var23 = var4.method1658();
               class127 var90 = (class127)field1137.method1431((long)var23);
               if (null != var90) {
                  method821(var90, true);
               }

               if (null != field1293) {
                  method869(field1293);
                  field1293 = null;
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2405) {
               var10 = var4.method1703();
               var7 = var4.method1711();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = var25 + (var7 & 7);
               var11 = var4.method1675();
               var36 = var4.method1682();
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var8 = 64 + var8 * 128;
                  var9 = var9 * 128 + 64;
                  class149 var60 = new class149(var10, class156.field980, var8, var9, method787(var8, var9, class156.field980) - var11, var36, field1419);
                  field1386.method1995(var60);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2402 == var1.field3778) {
               field1325 = field1118;
               var76 = var4.method1655();
               if (1 == var1.field3784) {
                  if (var76 >= 0) {
                     field1361[var76] = null;
                  } else {
                     class422.field2979 = null;
                  }

                  var1.field3778 = null;
                  return true;
               }

               if (var76 >= 0) {
                  field1361[var76] = new class417(var4);
               } else {
                  class422.field2979 = new class417(var4);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2317) {
               class518.method2483(class473.field3756);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2413) {
               class518.method2483(class473.field3757);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2421) {
               var23 = var4.method1681();
               var25 = var4.method1676();
               if (var23 == 65535) {
                  var23 = -1;
               }

               method938(class266.field1874, var23, var25);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2426 == var1.field3778) {
               method889(true, var1.field3782);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2346 == var1.field3778) {
               if (field1288 != -1) {
                  method919(field1288, 0);
               }

               var1.field3778 = null;
               return true;
            }

            class322 var34;
            if (var1.field3778 == class324.field2338) {
               var23 = var4.method1694();
               var25 = var4.method1683();
               var7 = var4.method1682();
               var34 = class322.method1488(var23);
               var34.field2249 = (var25 << 16) + var7;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2395 == var1.field3778) {
               field1369 = var4.method1654();
               var1.field3778 = null;
               return true;
            }

            int var17;
            String var67;
            if (class324.field2407 == var1.field3778) {
               var76 = var4.method1655();
               var6 = var4.method1662();
               long var86 = (long)var4.method1703();
               long var70 = (long)var4.method1710();
               class132 var61 = (class132)class1.method2(class132.method484(), var4.method1654());
               long var50 = (var86 << 32) + var70;
               boolean var56 = false;
               class417 var74 = null;
               var74 = var76 >= 0 ? field1361[var76] : class422.field2979;
               if (null == var74) {
                  var56 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var61.field819 && class290.field1979.method546(new class349(var6, class103.field694))) {
                           var56 = true;
                        }
                        break;
                     }

                     if (field1262[var16] == var50) {
                        var56 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var56) {
                  field1262[field1124] = var50;
                  field1124 = (1 + field1124) % 100;
                  var67 = class419.method1928(class453.method2111(var4));
                  var17 = var76 >= 0 ? 41 : 44;
                  if (var61.field834 != -1) {
                     class431.method2014(var17, class402.method1827(var61.field834) + var6, var67, var74.field2936);
                  } else {
                     class431.method2014(var17, var6, var67, var74.field2936);
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2388 == var1.field3778) {
               var4.field2652 += 28;
               if (var4.method1673()) {
                  method793(var4, var4.field2652 - 28);
               }

               var1.field3778 = null;
               return true;
            }

            String var28;
            if (class324.field2401 == var1.field3778) {
               var28 = var4.method1662();
               var25 = var4.method1675();
               var7 = var4.method1676();
               if (var7 >= 1 && var7 <= 8) {
                  if (var28.equalsIgnoreCase(class424.field3311)) {
                     var28 = null;
                  }

                  field1139[var7 - 1] = var28;
                  field1253[var7 - 1] = var25 == 0;
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2354) {
               var23 = var4.method1703();
               if (var23 == 65535) {
                  var23 = -1;
               }

               method894(var23);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2386 == var1.field3778) {
               var23 = var4.method1683();
               if (var23 == 65535) {
                  var23 = -1;
               }

               var25 = var4.method1707();
               method807(var23, var25);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2309) {
               method936();
               var1.field3778 = null;
               return false;
            }

            if (var1.field3778 == class324.field2400) {
               var23 = var4.method1693();
               var25 = var4.method1676();
               var7 = var4.method1683();
               var78 = (class127)field1137.method1431((long)var23);
               if (var78 != null) {
                  method821(var78, var7 != var78.field803);
               }

               method906(var23, var7, var25);
               var1.field3778 = null;
               return true;
            }

            class322 var29;
            boolean var57;
            if (class324.field2378 == var1.field3778) {
               var57 = var4.method1714() == 1;
               var25 = var4.method1658();
               var29 = class322.method1488(var25);
               if (var57 != var29.field2176) {
                  var29.field2176 = var57;
                  method869(var29);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2310) {
               var23 = var4.method1683();
               var25 = var4.method1703();
               var7 = var4.method1694();
               var8 = var4.method1703();
               var65 = class322.method1488(var7);
               if (var8 != var65.field2208 || var65.field2226 != var23 || var25 != var65.field2211) {
                  var65.field2208 = var8;
                  var65.field2226 = var23;
                  var65.field2211 = var25;
                  method869(var65);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2311 == var1.field3778) {
               var23 = var4.method1682();
               var25 = var4.method1693();
               var29 = class322.method1488(var25);
               if (1 != var29.field2200 || var29.field2201 != var23) {
                  var29.field2200 = 1;
                  var29.field2201 = var23;
                  method869(var29);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2306) {
               class518.method2483(class473.field3753);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2351) {
               var9 = var4.method1682();
               var7 = var4.method1681();
               var8 = var4.method1681();
               var23 = var4.method1683();
               var25 = var4.method1683();
               if (var23 == 65535) {
                  var23 = -1;
               }

               ArrayList var71 = new ArrayList();
               var71.add(var23);
               class175.method944(var71, var25, var7, var8, var9);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2327 == var1.field3778) {
               class518.method2483(class473.field3746);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2325) {
               class290.field1979.method542();
               field1322 = field1118;
               var1.field3778 = null;
               return true;
            }

            String var54;
            if (var1.field3778 == class324.field2356) {
               byte[] var91 = new byte[var1.field3784];
               var4.method2034(var91, 0, var91.length);
               class366 var87 = new class366(var91);
               var54 = var87.method1662();
               class410.method1894(var54, true, false);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2385) {
               class518 var89 = new class518();
               var89.field4149 = var4.method1662();
               var89.field4146 = var4.method1703();
               var25 = var4.method1658();
               var89.field4142 = var25;
               if (var89.method2481()) {
                  var89.field4153 = "beta";
               }

               method904(45);
               var3.method1561();
               var3 = null;
               class451.method2106(var89);
               var1.field3778 = null;
               return false;
            }

            if (var1.field3778 == class324.field2371) {
               field1136 = var4.method1682() * 30;
               field1168 = field1118;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2313 == var1.field3778) {
               var23 = var4.method1703();
               if (var23 == 65535) {
                  var23 = -1;
               }

               field1288 = var23;
               this.method759(false);
               method778(var23);
               class197.method1031(field1288);

               for(var25 = 0; var25 < 100; ++var25) {
                  field1126[var25] = true;
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2412 == var1.field3778) {
               field1377 = true;
               field1383 = false;
               field1378 = true;
               class470.field3724 = var4.method1654();
               class79.field551 = var4.method1654();
               var23 = var4.method1703();
               var25 = var4.method1703();
               field1380 = var4.method1661();
               var7 = var4.method1654();
               var8 = class470.field3724 * 128 + 64;
               var9 = 64 + class79.field551 * 128;
               boolean var58 = false;
               boolean var55 = false;
               if (field1380) {
                  var10 = class291.field1981;
                  var11 = method787(var8, var9, class156.field980) - var23;
               } else {
                  var10 = method787(class90.field647, class84.field572, class156.field980) - class291.field1981;
                  var11 = var23;
               }

               field1381 = new class201(class90.field647, class84.field572, var10, var8, var9, var11, var25, var7);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2372) {
               method889(false, var1.field3782);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2411 == var1.field3778) {
               var23 = var4.method1699();
               var85 = class322.method1488(var23);

               for(var7 = 0; var7 < var85.field2284.length; ++var7) {
                  var85.field2284[var7] = -1;
                  var85.field2284[var7] = 0;
               }

               method869(var85);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2379) {
               var23 = var4.method1681();
               var25 = var4.method1699();
               var29 = class322.method1488(var25);
               if (var29 != null && 0 == var29.field2160) {
                  if (var23 > var29.field2180 - var29.field2150) {
                     var23 = var29.field2180 - var29.field2150;
                  }

                  if (var23 < 0) {
                     var23 = 0;
                  }

                  if (var29.field2191 != var23) {
                     var29.field2191 = var23;
                     method869(var29);
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2399) {
               field1350 = var4.method1654();
               field1349 = var4.method1675();
               var1.field3778 = null;
               return true;
            }

            if (class324.field2393 == var1.field3778) {
               field1377 = true;
               field1383 = false;
               field1379 = false;
               class415.field2917 = var4.method1654();
               class266.field1871 = var4.method1654();
               class38.field327 = var4.method1703();
               class79.field553 = var4.method1654();
               class430.field3364 = var4.method1654();
               if (class430.field3364 >= 100) {
                  var23 = 64 + class415.field2917 * 128;
                  var25 = 64 + class266.field1871 * 128;
                  var7 = method787(var23, var25, class156.field980) - class38.field327;
                  var8 = var23 - class90.field647;
                  var9 = var7 - class291.field1981;
                  var10 = var25 - class84.field572;
                  var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
                  class249.field1796 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531) & 2047;
                  class455.field3578 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531) & 2047;
                  if (class249.field1796 < 128) {
                     class249.field1796 = 128;
                  }

                  if (class249.field1796 > 383) {
                     class249.field1796 = 383;
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2355) {
               return this.method774(var1, 1);
            }

            if (var1.field3778 == class324.field2364) {
               field1194 = var4.method1654();
               if (1 == field1194) {
                  field1138 = var4.method1703();
               }

               if (field1194 >= 2 && field1194 <= 6) {
                  if (field1194 == 2) {
                     field1303 = 64;
                     field1336 = 64;
                  }

                  if (field1194 == 3) {
                     field1303 = 0;
                     field1336 = 64;
                  }

                  if (field1194 == 4) {
                     field1303 = 128;
                     field1336 = 64;
                  }

                  if (field1194 == 5) {
                     field1303 = 64;
                     field1336 = 0;
                  }

                  if (field1194 == 6) {
                     field1303 = 64;
                     field1336 = 128;
                  }

                  field1194 = 2;
                  field1140 = var4.method1703();
                  field1283 = var4.method1703();
                  field1147 = var4.method1654();
               }

               if (field1194 == 10) {
                  field1157 = var4.method1703();
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2322) {
               class487.method2326();
               var76 = var4.method1655();
               class207 var84 = new class207(var4);
               class8 var82;
               if (var76 >= 0) {
                  var82 = field1360[var76];
               } else {
                  var82 = class470.field3738;
               }

               if (null == var82) {
                  this.method764(var76);
                  var1.field3778 = null;
                  return true;
               }

               if (var84.field1597 > var82.field72) {
                  this.method764(var76);
                  var1.field3778 = null;
                  return true;
               }

               if (var84.field1597 < var82.field72) {
                  var1.field3778 = null;
                  return true;
               }

               var84.method1083(var82);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2417) {
               class518.method2483(class473.field3752);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2341 == var1.field3778) {
               var23 = var4.method1657();
               var25 = var4.method1658();
               var7 = var4.method1656();
               var34 = class322.method1488(var25);
               if (var34.field2167 != var7 || var34.field2168 != var23 || var34.field2163 != 0 || 0 != var34.field2164) {
                  var34.field2167 = var7;
                  var34.field2168 = var23;
                  var34.field2163 = 0;
                  var34.field2164 = 0;
                  method869(var34);
                  this.method760(var34);
                  if (var34.field2160 == 0) {
                     method808(class53.field436[var25 >> 16], var34, false);
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2416 == var1.field3778) {
               var23 = var4.method1694();
               var25 = var4.method1693();
               var29 = class322.method1488(var25);
               class322.method1484(var29, var23);
               method869(var29);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2382 == var1.field3778) {
               var23 = var4.method1703();
               var25 = var4.method1699();
               var29 = class322.method1488(var25);
               if (6 != var29.field2200 || var23 != var29.field2201) {
                  var29.field2200 = 6;
                  var29.field2201 = var23;
                  method869(var29);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2308 == var1.field3778) {
               byte var51 = var4.method1669();
               var62 = var4.method1714() * 4;
               byte var47 = var4.method1669();
               var46 = var4.method1682();
               var36 = var4.method1700();
               var17 = var4.method1681();
               var14 = var4.method1675() * 4;
               var16 = var4.method1683();
               var7 = var4.method1711();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = var25 + (var7 & 7);
               int var19 = var4.method1654();
               int var18 = var4.method1676();
               var10 = var51 + var8;
               var11 = var47 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var46 != 65535) {
                  var8 = var8 * 128 + 64;
                  var9 = 64 + var9 * 128;
                  var10 = var10 * 128 + 64;
                  var11 = 64 + var11 * 128;
                  class484 var20 = new class484(var46, class156.field980, var8, var9, method787(var8, var9, class156.field980) - var14, var16 + field1419, field1419 + var17, var18, var19, var36, var62);
                  var20.method2287(var10, var11, method787(var10, var11, class156.field980) - var62, var16 + field1419);
                  field1243.method1995(var20);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2391) {
               class84.field571 = new class65(class320.field2144);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2362) {
               class307.field2070 = var4.method1714();
               class203.field1570 = var4.method1676();
               var1.field3778 = null;
               return true;
            }

            if (class324.field2424 == var1.field3778) {
               for(var23 = 0; var23 < field1289.length; ++var23) {
                  if (field1289[var23] != null) {
                     field1289[var23].field3418 = -1;
                  }
               }

               for(var23 = 0; var23 < field1176.length; ++var23) {
                  if (field1176[var23] != null) {
                     field1176[var23].field3418 = -1;
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2350) {
               method883(false, var4);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2343 == var1.field3778) {
               class177.method949(var4, var1.field3784);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2318) {
               method883(true, var4);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2344) {
               var23 = var4.method1675();
               var25 = var4.method1675();
               var7 = var4.method1699();
               var34 = class322.method1488(var7);
               class322.method1487(var34, var25, var23);
               method869(var34);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2360 == var1.field3778) {
               var25 = var4.method1703();
               var23 = var4.method1681();
               class283.method1299(var23, var25);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2409) {
               var57 = var4.method1661();
               if (var57) {
                  if (null == class294.field2020) {
                     class294.field2020 = new class95();
                  }
               } else {
                  class294.field2020 = null;
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2380) {
               field1377 = true;
               field1383 = false;
               field1379 = true;
               var23 = method781(var4.method1656() & 2027);
               var25 = method822(var4.method1656() & 2027);
               var7 = var4.method1703();
               var8 = var4.method1654();
               field1198 = new class230(class249.field1796, var25, var7, var8);
               field1172 = new class230(class455.field3578, var23, var7, var8);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2342) {
               return this.method754(var1);
            }

            if (class324.field2321 == var1.field3778) {
               class518.method2483(class473.field3748);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2331 == var1.field3778) {
               var23 = var4.method1693();
               var25 = var4.method1703();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var7 = var4.method1694();
               var8 = var4.method1683();
               if (var8 == 65535) {
                  var8 = -1;
               }

               for(var9 = var8; var9 <= var25; ++var9) {
                  var41 = ((long)var7 << 32) + (long)var9;
                  class70 var48 = field1335.method1431(var41);
                  if (var48 != null) {
                     var48.method295();
                  }

                  field1335.method1434(new class323(var23), var41);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2347 == var1.field3778) {
               var8 = var4.method1682();
               var25 = var4.method1683();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var9 = var4.method1683();
               var7 = var4.method1681();
               var10 = var4.method1681();
               var23 = var4.method1682();
               if (var23 == 65535) {
                  var23 = -1;
               }

               ArrayList var43 = new ArrayList();
               var43.add(var23);
               var43.add(var25);
               class175.method944(var43, var7, var8, var9, var10);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2352) {
               method835();
               var23 = var4.method1676();
               var25 = var4.method1675();
               var7 = var4.method1699();
               field1411[var25] = var7;
               field1260[var25] = var23;
               field1408[var25] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (var7 >= class472.field3745[var8]) {
                     field1408[var25] = var8 + 2;
                  }
               }

               field1240[++field1318 - 1 & 31] = var25;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2414) {
               var23 = var4.method1703();
               var25 = var4.method1654();
               var7 = var4.method1703();
               method791(var23, var25, var7);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2368 == var1.field3778) {
               var23 = var4.method1654();
               var25 = var4.method1694();
               var29 = class322.method1488(var25);
               class322.method1489(var29, class266.field1874.field3494.field1583, var23);
               method869(var29);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2337 == var1.field3778) {
               var23 = var4.method1694();
               var25 = var4.method1703();
               var29 = class322.method1488(var23);
               if (var29.field2200 != 2 || var29.field2201 != var25) {
                  var29.field2200 = 2;
                  var29.field2201 = var25;
                  method869(var29);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2307) {
               var23 = var4.method1654();
               class283.method1298(var23);
               var1.field3778 = null;
               return false;
            }

            if (var1.field3778 == class324.field2323) {
               method835();
               field1233 = var4.method1703();
               field1168 = field1118;
               var1.field3778 = null;
               return true;
            }

            boolean var59;
            if (var1.field3778 == class324.field2419) {
               var23 = var4.method1694();
               var59 = var4.method1654() == 1;
               var29 = class322.method1488(var23);
               class398.method1818(var29, class266.field1874.field3494, var59);
               method869(var29);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2348 == var1.field3778) {
               var76 = var4.method1677();
               var25 = var4.method1682();
               class486.field3909[var25] = var76;
               if (class486.field3907[var25] != var76) {
                  class486.field3907[var25] = var76;
               }

               method891(var25);
               field1313[++field1314 - 1 & 31] = var25;
               var1.field3778 = null;
               return true;
            }

            boolean var13;
            if (class324.field2329 == var1.field3778) {
               var28 = var4.method1662();
               var49 = (long)var4.method1703();
               var32 = (long)var4.method1710();
               class132 var42 = (class132)class1.method2(class132.method484(), var4.method1654());
               long var39 = (var49 << 32) + var32;
               var13 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (var39 == field1262[var14]) {
                     var13 = true;
                     break;
                  }
               }

               if (class290.field1979.method546(new class349(var28, class103.field694))) {
                  var13 = true;
               }

               if (!var13 && 0 == field1241) {
                  field1262[field1124] = var39;
                  field1124 = (field1124 + 1) % 100;
                  var53 = class419.method1928(class447.method2080(class453.method2111(var4)));
                  if (var42.field835) {
                     var62 = 7;
                  } else {
                     var62 = 3;
                  }

                  if (-1 != var42.field834) {
                     class431.method2007(var62, class402.method1827(var42.field834) + var28, var53);
                  } else {
                     class431.method2007(var62, var28, var53);
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2353 == var1.field3778) {
               if (null == class84.field571) {
                  class84.field571 = new class65(class320.field2144);
               }

               class374 var75 = class320.field2144.method311(var4);
               class84.field571.field516.method1371(var75.field2676, var75.field2675);
               field1382[++field1247 - 1 & 31] = var75.field2676;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2367) {
               var1.field3778 = null;
               return true;
            }

            class86 var40;
            if (var1.field3778 == class324.field2332) {
               short var73 = (short)var4.method1657();
               var25 = var4.method1654();
               var7 = var4.method1703();
               var8 = var4.method1693();
               var40 = field1176[var7];
               if (null != var40) {
                  var40.method333(var25, var8, var73);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2345 == var1.field3778) {
               var23 = var4.method1658();
               if (field1216 != var23) {
                  field1216 = var23;
                  method881();
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2377 == var1.field3778) {
               for(var23 = 0; var23 < class107.field700; ++var23) {
                  class107 var66 = class412.method1897(var23);
                  if (var66 != null) {
                     class486.field3909[var23] = 0;
                     class486.field3907[var23] = 0;
                  }
               }

               method835();
               field1314 += 32;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2396) {
               var28 = var4.method1662();
               Object[] var63 = new Object[var28.length() + 1];

               for(var7 = var28.length() - 1; var7 >= 0; --var7) {
                  if (var28.charAt(var7) == 's') {
                     var63[var7 + 1] = var4.method1662();
                  } else {
                     var63[var7 + 1] = new Integer(var4.method1658());
                  }
               }

               var63[0] = new Integer(var4.method1658());
               class64 var64 = new class64();
               var64.field507 = var63;
               class197.method1038(var64);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2384 == var1.field3778) {
               var28 = var4.method1662();
               var6 = class419.method1928(class447.method2080(class453.method2111(var4)));
               class431.method2007(6, var28, var6);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2305) {
               class290.field1979.field938.method1282(var4, var1.field3784);
               method928();
               field1322 = field1118;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2328) {
               var23 = var4.method1701();
               var59 = var4.method1654() == 1;
               var54 = "";
               boolean var38 = false;
               if (var59) {
                  var54 = var4.method1662();
                  if (class290.field1979.method546(new class349(var54, class103.field694))) {
                     var38 = true;
                  }
               }

               String var44 = var4.method1662();
               if (!var38) {
                  class431.method2007(var23, var54, var44);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2387) {
               var57 = var4.method1654() == 1;
               if (var57) {
                  class423.field3000 = class123.method471() - var4.method1659();
                  class351.field2581 = new class337(var4, true);
               } else {
                  class351.field2581 = null;
               }

               field1187 = field1118;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2365 == var1.field3778) {
               var23 = var4.method1682();
               var40 = field1176[var23];
               var8 = var4.method1675();
               var7 = var4.method1682();
               var25 = var4.method1693();
               if (var40 != null) {
                  var40.method2020(var8, var7, var25 >> 16, var25 & '\uffff');
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2369) {
               var23 = var4.method1681();
               if (var23 == 65535) {
                  var23 = -1;
               }

               var25 = var4.method1658();
               var7 = var4.method1694();
               var34 = class322.method1488(var25);
               class47 var35;
               if (!var34.field2238) {
                  if (var23 == -1) {
                     var34.field2200 = 0;
                     var1.field3778 = null;
                     return true;
                  }

                  var35 = class47.method213(var23).method199(var7);
                  var34.field2200 = 4;
                  var34.field2201 = var23;
                  var34.field2208 = var35.field356;
                  var34.field2226 = var35.field372;
                  var34.field2211 = var35.field379 * 100 / var7;
                  method869(var34);
               } else {
                  var34.field2286 = var23;
                  var34.field2287 = var7;
                  var35 = class47.method213(var23).method199(var7);
                  var34.field2208 = var35.field356;
                  var34.field2226 = var35.field372;
                  var34.field2273 = var35.field358;
                  var34.field2206 = var35.field357;
                  var34.field2280 = var35.field374;
                  var34.field2211 = var35.field379;
                  if (var35.field375 == 1) {
                     var34.field2217 = 1;
                  } else {
                     var34.field2217 = 2;
                  }

                  if (var34.field2212 > 0) {
                     var34.field2211 = var34.field2211 * 32 / var34.field2212;
                  } else if (var34.field2169 > 0) {
                     var34.field2211 = var34.field2211 * 32 / var34.field2169;
                  }

                  method869(var34);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2340 == var1.field3778) {
               var25 = var4.method1683();
               var7 = var4.method1675();
               var23 = var4.method1681();
               if (var25 == 65535) {
                  var25 = -1;
               }

               class86 var33 = field1176[var23];
               if (null != var33) {
                  if (var33.field3418 == var25 && var25 != -1) {
                     var9 = class464.method2200(var25).field3689;
                     if (var9 == 1) {
                        var33.field3419 = 0;
                        var33.field3420 = 0;
                        var33.field3435 = var7;
                        var33.field3400 = 0;
                     } else if (var9 == 2) {
                        var33.field3400 = 0;
                     }
                  } else if (var25 == -1 || -1 == var33.field3418 || class464.method2200(var25).field3682 >= class464.method2200(var33.field3418).field3682) {
                     var33.field3418 = var25;
                     var33.field3419 = 0;
                     var33.field3420 = 0;
                     var33.field3435 = var7;
                     var33.field3400 = 0;
                     var33.field3437 = var33.field3421;
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2319) {
               var28 = var4.method1662();
               var49 = var4.method1659();
               var32 = (long)var4.method1703();
               var41 = (long)var4.method1710();
               class132 var45 = (class132)class1.method2(class132.method484(), var4.method1654());
               var52 = var41 + (var32 << 32);
               boolean var15 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (field1262[var16] == var52) {
                     var15 = true;
                     break;
                  }
               }

               if (var45.field819 && class290.field1979.method546(new class349(var28, class103.field694))) {
                  var15 = true;
               }

               if (!var15 && field1241 == 0) {
                  field1262[field1124] = var52;
                  field1124 = (1 + field1124) % 100;
                  var67 = class419.method1928(class447.method2080(class453.method2111(var4)));
                  if (var45.field834 != -1) {
                     class431.method2014(9, class402.method1827(var45.field834) + var28, var67, class520.method2505(var49));
                  } else {
                     class431.method2014(9, var28, var67, class520.method2505(var49));
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2374 == var1.field3778) {
               var23 = var4.method1654();
               method896(var23);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2335 == var1.field3778) {
               var23 = var4.method1654();
               var25 = var4.method1654();
               var7 = var4.method1654();
               var8 = var4.method1654();
               field1384[var23] = true;
               field1178[var23] = var25;
               field1338[var23] = var7;
               field1248[var23] = var8;
               field1334[var23] = 0;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2358 == var1.field3778) {
               var23 = var4.method1658();
               var25 = var4.method1703();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var29 = class322.method1488(var23);
               } else {
                  var29 = null;
               }

               for(; var4.field2652 < var1.field3784; class532.method2525(var25, var8, var9 - 1, var10)) {
                  var8 = var4.method1701();
                  var9 = var4.method1703();
                  var10 = 0;
                  if (var9 != 0) {
                     var10 = var4.method1654();
                     if (var10 == 255) {
                        var10 = var4.method1658();
                     }
                  }

                  if (var29 != null && var8 >= 0 && var8 < var29.field2284.length) {
                     var29.field2284[var8] = var9;
                     var29.field2285[var8] = var10;
                  }
               }

               if (null != var29) {
                  method869(var29);
               }

               method835();
               field1315[++field1316 - 1 & 31] = var25 & 32767;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2314 == var1.field3778) {
               field1377 = true;
               field1383 = false;
               field1379 = true;
               var23 = var4.method1656();
               var25 = var4.method1656();
               var7 = method822(class249.field1796 + var25 & 2027);
               var8 = class455.field3578 + var23;
               var9 = var4.method1703();
               var10 = var4.method1654();
               field1198 = new class230(class249.field1796, var7, var9, var10);
               field1172 = new class230(class455.field3578, var8, var9, var10);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2420) {
               var8 = var4.method1675();
               var7 = var4.method1693();
               var25 = var4.method1703();
               var23 = var4.method1681();
               class443 var30;
               if (var23 == field1244) {
                  var30 = class266.field1874;
               } else {
                  var30 = field1289[var23];
               }

               if (null != var30) {
                  var30.method2020(var8, var25, var7 >> 16, var7 & '\uffff');
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2392) {
               for(var23 = 0; var23 < class486.field3907.length; ++var23) {
                  if (class486.field3907[var23] != class486.field3909[var23]) {
                     class486.field3907[var23] = class486.field3909[var23];
                     method891(var23);
                     field1313[++field1314 - 1 & 31] = var23;
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2324 == var1.field3778) {
               method800(var4.method1662());
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2404) {
               var23 = var4.method1694();
               var25 = var4.method1685();
               var29 = class322.method1488(var23);
               if (var25 != var29.field2204 || var25 == -1) {
                  var29.field2204 = var25;
                  var29.field2288 = 0;
                  var29.field2289 = 0;
                  method869(var29);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2373) {
               class307.field2070 = var4.method1654();
               class203.field1570 = var4.method1676();

               while(var4.field2652 < var1.field3784) {
                  var23 = var4.method1654();
                  class473 var31 = class473.method2229()[var23];
                  class518.method2483(var31);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2359) {
               var23 = var4.method1682();
               var25 = var4.method1683();
               var8 = var4.method1683();
               var7 = var4.method1681();
               class469.method2207(var23, var25, var7, var8);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2375) {
               field1377 = true;
               field1383 = false;
               field1378 = true;
               class470.field3724 = var4.method1654();
               class79.field551 = var4.method1654();
               var23 = var4.method1703();
               var25 = var4.method1654() * 128 + 64;
               var7 = var4.method1654() * 128 + 64;
               var8 = var4.method1703();
               field1380 = var4.method1661();
               var9 = var4.method1654();
               var10 = class470.field3724 * 128 + 64;
               var11 = class79.field551 * 128 + 64;
               var12 = false;
               var13 = false;
               if (field1380) {
                  var36 = class291.field1981;
                  var46 = method787(var10, var11, class156.field980) - var23;
               } else {
                  var36 = method787(class90.field647, class84.field572, class156.field980) - class291.field1981;
                  var46 = var23;
               }

               field1381 = new class119(class90.field647, class84.field572, var36, var10, var11, var46, var25, var7, var8, var9);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2315) {
               class290.field1979.method553(var4, var1.field3784);
               field1322 = field1118;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2381 == var1.field3778) {
               field1377 = true;
               field1383 = false;
               field1378 = false;
               class470.field3724 = var4.method1654();
               class79.field551 = var4.method1654();
               class107.field704 = var4.method1703();
               class482.field3801 = var4.method1654();
               class496.field3975 = var4.method1654();
               if (class496.field3975 >= 100) {
                  class90.field647 = 64 + class470.field3724 * 128;
                  class84.field572 = class79.field551 * 128 + 64;
                  class291.field1981 = method787(class90.field647, class84.field572, class156.field980) - class107.field704;
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2397) {
               var23 = var4.method1694();
               var25 = var4.method1682();
               var7 = var25 >> 10 & 31;
               var8 = var25 >> 5 & 31;
               var9 = var25 & 31;
               var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
               class322 var37 = class322.method1488(var23);
               if (var37.field2181 != var10) {
                  var37.field2181 = var10;
                  method869(var37);
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2361) {
               var28 = var4.method1662();
               var25 = var4.method1699();
               var29 = class322.method1488(var25);
               if (!var28.equals(var29.field2218)) {
                  var29.field2218 = var28;
                  method869(var29);
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2410 == var1.field3778) {
               var23 = var4.method1658();
               var25 = var4.method1703();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var29 = class322.method1488(var23);
               } else {
                  var29 = null;
               }

               if (null != var29) {
                  for(var8 = 0; var8 < var29.field2284.length; ++var8) {
                     var29.field2284[var8] = 0;
                     var29.field2285[var8] = 0;
                  }
               }

               class532.method2520(var25);
               var8 = var4.method1703();

               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var4.method1703();
                  var11 = var4.method1676();
                  if (var11 == 255) {
                     var11 = var4.method1699();
                  }

                  if (null != var29 && var9 < var29.field2284.length) {
                     var29.field2284[var9] = var10;
                     var29.field2285[var9] = var11;
                  }

                  class532.method2525(var25, var9, var10 - 1, var11);
               }

               if (var29 != null) {
                  method869(var29);
               }

               method835();
               field1315[++field1316 - 1 & 31] = var25 & 32767;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2330) {
               var23 = var4.method1681();
               var25 = var4.method1699();
               class486.field3909[var23] = var25;
               if (var25 != class486.field3907[var23]) {
                  class486.field3907[var23] = var25;
               }

               method891(var23);
               field1313[++field1314 - 1 & 31] = var23;
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2334) {
               class518.method2483(class473.field3749);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2422 == var1.field3778) {
               class518.method2483(class473.field3755);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2394) {
               class518.method2483(class473.field3754);
               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2403) {
               var23 = var4.method1654();
               if (var4.method1654() == 0) {
                  field1394[var23] = new class517();
                  var4.field2652 += 18;
               } else {
                  --var4.field2652;
                  field1394[var23] = new class517(var4, false);
               }

               field1326 = field1118;
               var1.field3778 = null;
               return true;
            }

            if (class324.field2320 == var1.field3778 && field1377) {
               field1383 = true;
               field1379 = false;
               field1378 = false;

               for(var23 = 0; var23 < 5; ++var23) {
                  field1384[var23] = false;
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2316) {
               class307.field2070 = var4.method1714();
               class203.field1570 = var4.method1676();

               for(var23 = class307.field2070; var23 < class307.field2070 + 8; ++var23) {
                  for(var25 = class203.field1570; var25 < class203.field1570 + 8; ++var25) {
                     if (field1256[class156.field980][var23][var25] != null) {
                        field1256[class156.field980][var23][var25] = null;
                        method837(var23, var25);
                     }
                  }
               }

               for(class415 var24 = (class415)field1257.method1991(); var24 != null; var24 = (class415)field1257.method1993()) {
                  if (var24.field2923 >= class307.field2070 && var24.field2923 < class307.field2070 + 8 && var24.field2929 >= class203.field1570 && var24.field2929 < 8 + class203.field1570 && class156.field980 == var24.field2930) {
                     var24.field2928 = 0;
                  }
               }

               var1.field3778 = null;
               return true;
            }

            if (class324.field2339 == var1.field3778) {
               return this.method774(var1, 2);
            }

            if (var1.field3778 == class324.field2408) {
               field1367 = var4.method1654();
               if (255 == field1367) {
                  field1367 = 0;
               }

               field1290 = var4.method1654();
               if (255 == field1290) {
                  field1290 = 0;
               }

               var1.field3778 = null;
               return true;
            }

            if (var1.field3778 == class324.field2333) {
               field1325 = field1118;
               var23 = var4.method1655();
               class398 var26 = new class398(var4);
               class417 var27;
               if (var23 >= 0) {
                  var27 = field1361[var23];
               } else {
                  var27 = class422.field2979;
               }

               if (var27 == null) {
                  this.method772(var23);
                  var1.field3778 = null;
                  return true;
               }

               if (var26.field2772 > var27.field2938) {
                  this.method772(var23);
                  var1.field3778 = null;
                  return true;
               }

               if (var26.field2772 < var27.field2938) {
                  var1.field3778 = null;
                  return true;
               }

               var26.method1817(var27);
               var1.field3778 = null;
               return true;
            }

            if (class324.field2427 == var1.field3778) {
               class518.method2483(class473.field3750);
               var1.field3778 = null;
               return true;
            }

            class431.method2006("" + (var1.field3778 != null ? -908169793 * var1.field3778.field2428 * 1400406591 : -1) + class389.field2749 + (var1.field3789 != null ? var1.field3789.field2428 : -1) + class389.field2749 + (null != var1.field3790 ? var1.field3790.field2428 : -1) + class389.field2749 + var1.field3784, (Throwable)null);
            method936();
         } catch (IOException var21) {
            method870();
         } catch (Exception var22) {
            var6 = "" + (null != var1.field3778 ? var1.field3778.field2428 : -1) + class389.field2749 + (var1.field3789 != null ? var1.field3789.field2428 : -1) + class389.field2749 + (null != var1.field3790 ? -908169793 * var1.field3790.field2428 * 1400406591 : -1) + class389.field2749 + var1.field3784 + class389.field2749 + (class36.field314 + class266.field1874.field3448[0]) + class389.field2749 + (class525.field4175 + class266.field1874.field3445[0]) + class389.field2749;

            for(var7 = 0; var7 < var1.field3784 && var7 < 50; ++var7) {
               var6 = var6 + var4.field2650[var7] + class389.field2749;
            }

            class431.method2006(var6, var22);
            method936();
         }

         return true;
      }
   }

   final void method756() {
      boolean var2 = false;

      int var3;
      int var6;
      while(!var2) {
         var2 = true;

         for(var3 = 0; var3 < field1265 - 1; ++var3) {
            if (field1309[var3] < 1000 && field1309[var3 + 1] > 1000) {
               String var4 = field1390[var3];
               field1390[var3] = field1390[var3 + 1];
               field1390[var3 + 1] = var4;
               String var5 = field1271[var3];
               field1271[var3] = field1271[var3 + 1];
               field1271[var3 + 1] = var5;
               var6 = field1309[var3];
               field1309[var3] = field1309[var3 + 1];
               field1309[var3 + 1] = var6;
               var6 = field1266[var3];
               field1266[var3] = field1266[var3 + 1];
               field1266[var3 + 1] = var6;
               var6 = field1267[var3];
               field1267[var3] = field1267[var3 + 1];
               field1267[var3 + 1] = var6;
               var6 = field1269[var3];
               field1269[var3] = field1269[var3 + 1];
               field1269[var3 + 1] = var6;
               var6 = field1270[var3];
               field1270[var3] = field1270[var3 + 1];
               field1270[var3 + 1] = var6;
               boolean var7 = field1273[var3];
               field1273[var3] = field1273[var3 + 1];
               field1273[var3 + 1] = var7;
               var2 = false;
            }
         }
      }

      if (null == field1300) {
         int var16 = class496.field3971;
         int var8;
         int var9;
         int var18;
         int var19;
         if (field1229) {
            int var17;
            if (var16 != 1 && (class301.field2050 || var16 != 4)) {
               var3 = class496.field3977;
               var17 = class496.field3960;
               if (var3 < class268.field1878 - 10 || var3 > class268.field1878 + class364.field2617 + 10 || var17 < class233.field1719 - 10 || var17 > class233.field1719 + class414.field2900 + 10) {
                  field1229 = false;
                  var18 = class268.field1878;
                  var6 = class233.field1719;
                  var19 = class364.field2617;
                  var8 = class414.field2900;

                  for(var9 = 0; var9 < field1287; ++var9) {
                     if (field1343[var9] + field1341[var9] > var18 && field1341[var9] < var18 + var19 && field1342[var9] + field1344[var9] > var6 && field1342[var9] < var6 + var8) {
                        field1126[var9] = true;
                     }
                  }
               }
            }

            if (var16 == 1 || !class301.field2050 && var16 == 4) {
               var3 = class268.field1878;
               var17 = class233.field1719;
               var18 = class364.field2617;
               var6 = class496.field3972;
               var19 = class496.field3973;
               var8 = -1;

               int var10;
               for(var9 = 0; var9 < field1265; ++var9) {
                  var10 = var17 + 31 + (field1265 - 1 - var9) * 15;
                  if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
                     var8 = var9;
                  }
               }

               int var11;
               int var12;
               int var13;
               if (var8 != -1 && var8 >= 0) {
                  var9 = field1266[var8];
                  var10 = field1267[var8];
                  var11 = field1309[var8];
                  var12 = field1269[var8];
                  var13 = field1270[var8];
                  String var14 = field1271[var8];
                  String var15 = field1390[var8];
                  method929(var9, var10, var11, var12, var13, var14, var15, class496.field3972, class496.field3973);
               }

               field1229 = false;
               var9 = class268.field1878;
               var10 = class233.field1719;
               var11 = class364.field2617;
               var12 = class414.field2900;

               for(var13 = 0; var13 < field1287; ++var13) {
                  if (field1343[var13] + field1341[var13] > var9 && field1341[var13] < var9 + var11 && field1344[var13] + field1342[var13] > var10 && field1342[var13] < var10 + var12) {
                     field1126[var13] = true;
                  }
               }
            }
         } else {
            var3 = field1265 - 1;
            if ((var16 == 1 || !class301.field2050 && var16 == 4) && this.method757((byte)-84)) {
               var16 = 2;
            }

            if ((var16 == 1 || !class301.field2050 && var16 == 4) && field1265 > 0 && var3 >= 0) {
               var18 = field1266[var3];
               var6 = field1267[var3];
               var19 = field1309[var3];
               var8 = field1269[var3];
               var9 = field1270[var3];
               String var20 = field1271[var3];
               String var21 = field1390[var3];
               method929(var18, var6, var19, var8, var9, var20, var21, class496.field3972, class496.field3973);
            }

            if (var16 == 2 && field1265 > 0) {
               this.method758(class496.field3972, class496.field3973);
            }
         }

      }
   }

   final boolean method757(byte var1) {
      boolean var10000;
      label31: {
         int var2;
         label34: {
            var2 = field1265 - 1;
            if (field1263) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               if (field1265 > 2) {
                  break label34;
               }
            }

            if (!method803(var2)) {
               break label31;
            }

            if (var1 >= -1) {
               throw new IllegalStateException();
            }
         }

         if (!field1273[var2]) {
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

   final void method758(int var1, int var2) {
      class302.method1379(var1, var2);
      var1 -= field1397;
      var2 -= field1398;
      class137.field875.method1860(class156.field980, var1, var2, false);
      field1229 = true;
   }

   final void method759(boolean var1) {
      int var3 = field1288;
      int var4 = class114.field730;
      int var5 = class394.field2761;
      if (class322.method1492(var3)) {
         method789(class53.field436[var3], -1, var4, var5, var1);
      }

   }

   void method760(class322 var1) {
      class322 var3 = var1.field2175 == -1 ? null : class322.method1488(var1.field2175);
      int var4;
      int var5;
      if (var3 == null) {
         var4 = class114.field730;
         var5 = class394.field2761;
      } else {
         var4 = var3.field2173;
         var5 = var3.field2150;
      }

      method914(var1, var4, var5, false);
      method879(var1, var4, var5);
   }

   final void method761() {
      method869(field1300);
      ++class124.field797;
      int var2;
      int var3;
      if (field1352 && field1305) {
         var2 = class496.field3977;
         var3 = class496.field3960;
         var2 -= field1302;
         var3 -= field1375;
         if (var2 < field1306) {
            var2 = field1306;
         }

         if (var2 + field1300.field2173 > field1319.field2173 + field1306) {
            var2 = field1319.field2173 + field1306 - field1300.field2173;
         }

         if (var3 < field1307) {
            var3 = field1307;
         }

         if (field1300.field2150 + var3 > field1307 + field1319.field2150) {
            var3 = field1307 + field1319.field2150 - field1300.field2150;
         }

         int var10 = var2 - field1154;
         int var5 = var3 - field1226;
         int var6 = field1300.field2171;
         if (class124.field797 > field1300.field2213 && (var10 > var6 || var10 < -var6 || var5 > var6 || var5 < -var6)) {
            field1311 = true;
         }

         int var7 = field1319.field2177 + (var2 - field1306);
         int var8 = field1319.field2191 + (var3 - field1307);
         class64 var9;
         if (null != field1300.field2250 && field1311) {
            var9 = new class64();
            var9.field504 = field1300;
            var9.field505 = var7;
            var9.field508 = var8;
            var9.field507 = field1300.field2250;
            class197.method1038(var9);
         }

         if (class496.field3967 == 0) {
            if (field1311) {
               if (null != field1300.field2251) {
                  var9 = new class64();
                  var9.field504 = field1300;
                  var9.field505 = var7;
                  var9.field508 = var8;
                  var9.field510 = field1304;
                  var9.field507 = field1300.field2251;
                  class197.method1038(var9);
               }

               if (null != field1304 && method827(field1300) != null) {
                  class53 var11 = class53.method226(class10.field109, field1181.field3781);
                  var11.field435.method1691(field1300.field2158);
                  var11.field435.method1663(field1304.field2158);
                  var11.field435.method1684(field1300.field2277);
                  var11.field435.method1684(field1304.field2286);
                  var11.field435.method1706(field1304.field2277);
                  var11.field435.method1706(field1300.field2286);
                  field1181.method2254(var11);
               }
            } else if (this.method757((byte)-32)) {
               this.method758(field1154 + field1302, field1226 + field1375);
            } else if (field1265 > 0) {
               method776(field1302 + field1154, field1375 + field1226);
            }

            field1300 = null;
         }

      } else {
         if (class124.field797 > 1) {
            if (!field1311 && field1265 > 0) {
               var2 = field1302 + field1154;
               var3 = field1375 + field1226;
               class474 var4 = class299.field2043;
               if (var4 != null) {
                  method929(var4.field3759, var4.field3762, var4.field3760, var4.field3761, var4.field3758, var4.field3763, var4.field3764, var2, var3);
               }

               class299.field2043 = null;
            }

            field1300 = null;
         }

      }
   }

   public class349 method1209() {
      return null != class266.field1874 ? class266.field1874.field3510 : null;
   }

   void method772(int var1) {
      if (field1298 >= 216) {
         class53 var3 = class53.method226(class10.field175, field1181.field3781);
         var3.field435.method1643(var1);
         field1181.method2254(var3);
      }

   }

   void method764(int var1) {
      if (field1298 >= 216) {
         class53 var3 = class53.method226(class10.field176, field1181.field3781);
         var3.field435.method1643(var1);
         field1181.method2254(var3);
      }

   }

   static class121 method871() {
      return class512.field4083;
   }

   static void method786() {
      class166.field1061 = System.getenv("JX_ACCESS_TOKEN");
      class299.field2044 = System.getenv("JX_REFRESH_TOKEN");
      class175.field1426 = System.getenv("JX_SESSION_ID");
      class338.field2526 = System.getenv("JX_CHARACTER_ID");
      class292.method1332(System.getenv("JX_DISPLAY_NAME"));
   }

   public static class303 method888() {
      return field1264;
   }

   static void method926() {
      if (class238.field1742.method1578()) {
         class238.field1742.method1576();
      }

      if (class129.field806 != null) {
         class129.field806.field724 = false;
      }

      class129.field806 = null;
      field1181.method2258();
      if (null != class535.field4242) {
         try {
            class535.field4242.method1193();
         } catch (Exception var3) {
         }
      }

      class535.field4242 = null;
      method818();
      class85.field574.method2437();
      class443.field3522.method2437();
      class529.field4181.method2437();
      class513.field4089.method2437();
      class133.field837.method2437();
      class430.field3365.method2437();
      class367.field2655.method2437();
      class242.field1767.method2437();
      method805();
      class137.field875.method1835();

      for(int var1 = 0; var1 < 4; ++var1) {
         field1191[var1].method1754();
      }

      class512.field4083 = null;
      class283.method1299(0, 0);
      class36.method156();
      field1388 = false;
      class307.method1410();
      if (class432.field3372 != null) {
         class432.field3372.method267();
      }

      class215.field1651.method131();
      class160.method614();
      if (null != class234.field1727) {
         class234.field1727.method153();
      }

      class269.method1223();
      class269.field1884 = null;
      class269.field1885 = null;
      class385.field2730 = null;
      class532.method2518();
      class288.field1974 = null;
      field1413.clear();
      field1415 = 0;
      class215.field1651 = new class29();
      class234.field1727 = new class114(class530.field4182.field1163, 216);

      try {
         class269.method1221("oldschool", class298.field2033, class315.field2131.field2492, 0, 22);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      class288.field1974 = new class340(255, class269.field1884, class269.field1885, 500000);
      class535.field4242 = new class250();
      class530.field4182.method2549();
      field1148 = class436.field3465;
      method904(0);
   }

   static void method805() {
      field1196 = null;
      class270.field1889 = null;
      class290.field1980 = null;
      class267.field1876 = null;
      class377.field2689 = null;
      class184.field1483 = null;
      class243.field1778 = null;
      class2.field4 = null;
      class223.field1668 = null;
      class241.field1763 = null;
      class179.field1451 = null;
   }

   static void method904(int var0) {
      if (field1200 != var0) {
         if (field1200 == 30) {
            field1355.method1825();
         }

         if (field1200 == 0) {
            class530.field4182.method2569();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            method902(0);
            field1131 = 0;
            field1182 = 0;
            field1184.method1955(var0);
            if (var0 != 20) {
               method819(false);
            }
         }

         if (var0 != 20 && var0 != 40 && null != class331.field2498) {
            class331.field2498.method1561();
            class331.field2498 = null;
         }

         if (field1200 == 25) {
            field1190 = 0;
            field1186 = 0;
            field1220 = 1;
            field1188 = 0;
            field1189 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var4 = 11 == field1200 ? 4 : 0;
               class292.method1330(class189.field1494, class62.field492, false, var4);
            } else if (var0 == 11) {
               class292.method1330(class189.field1494, class62.field492, false, 4);
            } else if (var0 == 50) {
               class292.method1328("", "Updating date of birth...", "");
               class292.method1330(class189.field1494, class62.field492, false, 7);
            } else if (class287.field1972) {
               class292.field1985 = null;
               class530.field4183 = null;
               class292.field1984 = null;
               class292.field1987 = null;
               class205.field1579 = null;
               class35.field308 = null;
               class128.field805 = null;
               class292.field1982 = null;
               class413.field2896 = null;
               class154.field973 = null;
               class41.field345 = null;
               class500.field4001 = null;
               class502.field4011 = null;
               class333.field2502 = null;
               class84.field566.method2065();
               class283.method1299(0, 100);
               class378.method1756().method126(true);
               class287.field1972 = false;
            }
         } else {
            boolean var2 = class158.field1004.method522() >= field1121;
            int var3 = var2 ? 0 : 12;
            class292.method1330(class189.field1494, class62.field492, true, var3);
         }

         field1200 = var0;
      }
   }

   static void method934(class534 var0, String var1) {
      class184 var3 = new class184(var0, var1);
      field1413.add(var3);
      field1415 += var3.field1481;
   }

   static boolean method813() {
      if (null != field1413 && field1414 < field1413.size()) {
         while(field1414 < field1413.size()) {
            class184 var1 = (class184)field1413.get(field1414);
            if (!var1.method980()) {
               return false;
            }

            ++field1414;
         }

         return true;
      } else {
         return true;
      }
   }

   static int method804() {
      if (null != field1413 && field1414 < field1413.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= field1414; ++var2) {
            var1 += ((class184)field1413.get(var2)).field1482;
         }

         return var1 * 10000 / field1415;
      } else {
         return 10000;
      }
   }

   static int method860(int var0) {
      return var0 * 3 + 600;
   }

   static void method866() {
      int var30;
      if (field1148 == class436.field3465) {
         class137.field875 = new class408(4, 104, 104, class513.field4098);

         for(var30 = 0; var30 < 4; ++var30) {
            field1191[var30] = new class378(104, 104);
         }

         class434.field3450 = new class296(512, 512);
         class292.field1991 = class424.field3015;
         class292.field1990 = 5;
         field1148 = class436.field3456;
      } else if (class436.field3456 == field1148) {
         class292.field1991 = class424.field3016;
         class292.field1990 = 10;
         field1148 = class436.field3464;
      } else if (class436.field3464 == field1148) {
         class143.field894 = method840(0, false, true, true, false);
         class40.field338 = method840(1, false, true, true, false);
         class85.field574 = method840(2, true, false, true, false);
         class307.field2086 = method840(3, false, true, true, false);
         class150.field960 = method840(4, false, true, true, false);
         class258.field1852 = method840(5, true, true, true, false);
         class339.field2531 = method840(6, true, true, true, false);
         class243.field1777 = method840(7, false, true, true, false);
         class62.field492 = method840(8, false, true, true, false);
         class540.field4291 = method840(9, false, true, true, false);
         class189.field1494 = method840(10, false, true, true, false);
         class520.field4158 = method840(11, false, true, true, false);
         class517.field4141 = method840(12, false, true, true, false);
         class443.field3522 = method840(13, true, false, true, false);
         class529.field4181 = method840(14, false, true, true, false);
         class513.field4089 = method840(15, false, true, true, false);
         class133.field837 = method840(17, true, true, true, false);
         class430.field3365 = method840(18, false, true, true, false);
         class367.field2655 = method840(19, false, true, true, false);
         class242.field1767 = method840(20, false, true, true, false);
         class405.field2813 = method840(21, false, true, true, true);
         class292.field1991 = class424.field3041;
         class292.field1990 = 20;
         field1148 = class436.field3458;
      } else if (class436.field3458 == field1148) {
         byte var50 = 0;
         var30 = var50 + class143.field894.method2526() * 4 / 100;
         var30 += class40.field338.method2526() * 4 / 100;
         var30 += class85.field574.method2526() * 2 / 100;
         var30 += class307.field2086.method2526() * 2 / 100;
         var30 += class150.field960.method2526() * 6 / 100;
         var30 += class258.field1852.method2526() * 4 / 100;
         var30 += class339.field2531.method2526() * 2 / 100;
         var30 += class243.field1777.method2526() * 55 / 100;
         var30 += class62.field492.method2526() * 2 / 100;
         var30 += class540.field4291.method2526() * 2 / 100;
         var30 += class189.field1494.method2526() * 2 / 100;
         var30 += class520.field4158.method2526() * 2 / 100;
         var30 += class517.field4141.method2526() * 2 / 100;
         var30 += class443.field3522.method2526() * 2 / 100;
         var30 += class529.field4181.method2526() * 2 / 100;
         var30 += class513.field4089.method2526() * 2 / 100;
         var30 += class367.field2655.method2526() / 100;
         var30 += class430.field3365.method2526() / 100;
         var30 += class242.field1767.method2526() / 100;
         var30 += class405.field2813.method2526() / 100;
         var30 += class133.field837.method2532() && class133.field837.method2427() ? 1 : 0;
         if (var30 != 100) {
            if (var30 != 0) {
               class292.field1991 = class424.field3018 + var30 + "%";
            }

            class292.field1990 = 30;
         } else {
            method934(class143.field894, "Animations");
            method934(class40.field338, "Skeletons");
            method934(class150.field960, "Sound FX");
            method934(class258.field1852, "Maps");
            method934(class339.field2531, "Music Tracks");
            method934(class243.field1777, "Models");
            method934(class62.field492, "Sprites");
            method934(class520.field4158, "Music Jingles");
            method934(class529.field4181, "Music Samples");
            method934(class513.field4089, "Music Patches");
            method934(class367.field2655, "World Map");
            method934(class430.field3365, "World Map Geography");
            method934(class242.field1767, "World Map Ground");
            class336.field2515 = new class169();
            class336.field2515.method655(class133.field837);
            class292.field1991 = class424.field3019;
            class292.field1990 = 30;
            field1148 = class436.field3459;
         }
      } else {
         int var3;
         class534 var33;
         class534 var35;
         if (class436.field3459 == field1148) {
            class62.method281(22050, !field1120, 2);
            ArrayList var48 = new ArrayList(3);
            class432.field3372 = class62.method280(class535.field4242, 0, 2048);
            class262.field1860 = new class153();
            class153 var32 = new class153();
            var32.method586(class262.field1860);

            for(var3 = 0; var3 < 3; ++var3) {
               class5 var39 = new class5();
               var39.method33(9, 128);
               var32.method586(var39);
               var48.add(var39);
            }

            class432.field3372.method264(var32);
            var33 = class513.field4089;
            var35 = class529.field4181;
            class534 var41 = class150.field960;
            class469.field3711 = var33;
            class469.field3712 = var35;
            class469.field3715 = var41;
            class469.field3714 = var48;
            class193.field1516 = new class399(22050, class62.field481);
            class292.field1991 = class424.field3020;
            class292.field1990 = 35;
            field1148 = class436.field3463;
            class53.field437 = new class488(class62.field492, class443.field3522);
         } else {
            int var2;
            if (field1148 == class436.field3463) {
               class467[] var47 = new class467[]{class467.field3697, class467.field3691, class467.field3690, class467.field3695, class467.field3693, class467.field3692};
               var2 = var47.length;
               class488 var34 = class53.field437;
               class467[] var38 = new class467[]{class467.field3697, class467.field3691, class467.field3690, class467.field3695, class467.field3693, class467.field3692};
               field1185 = var34.method2327(var38);
               if (field1185.size() < var2) {
                  class292.field1991 = class424.field3213 + field1185.size() * 100 / var2 + "%";
                  class292.field1990 = 40;
               } else {
                  class174.field1423 = (class396)field1185.get(class467.field3693);
                  class502.field4012 = (class396)field1185.get(class467.field3692);
                  class274.field1923 = (class396)field1185.get(class467.field3695);
                  class446.field3541 = field1261.method1123();
                  class292.field1991 = class424.field3022;
                  class292.field1990 = 40;
                  field1148 = class436.field3461;
               }
            } else {
               int var4;
               class534 var6;
               class534 var31;
               if (field1148 == class436.field3461) {
                  var31 = class189.field1494;
                  var33 = class62.field492;
                  var4 = 0;
                  String[] var37 = class292.field1995;

                  int var40;
                  String var42;
                  for(var40 = 0; var40 < var37.length; ++var40) {
                     var42 = var37[var40];
                     if (var31.method2442(var42, "")) {
                        ++var4;
                     }
                  }

                  var37 = class292.field2014;

                  for(var40 = 0; var40 < var37.length; ++var40) {
                     var42 = var37[var40];
                     if (var33.method2442(var42, "")) {
                        ++var4;
                     }
                  }

                  var37 = class292.field2017;

                  for(var40 = 0; var40 < var37.length; ++var40) {
                     var42 = var37[var40];
                     if (var33.method2447(var42) != -1 && var33.method2442(var42, "")) {
                        ++var4;
                     }
                  }

                  var6 = class62.field492;
                  int var43 = class292.field1995.length + class292.field2014.length;
                  String[] var44 = class292.field2017;

                  for(int var45 = 0; var45 < var44.length; ++var45) {
                     String var49 = var44[var45];
                     if (var6.method2447(var49) != -1) {
                        ++var43;
                     }
                  }

                  if (var4 < var43) {
                     class292.field1991 = class424.field3023 + var4 * 100 / var43 + "%";
                     class292.field1990 = 50;
                  } else {
                     class292.field1991 = class424.field3024;
                     class292.field1990 = 50;
                     method904(5);
                     field1148 = class436.field3462;
                  }
               } else if (class436.field3462 == field1148) {
                  if (!class85.field574.method2427()) {
                     class292.field1991 = class424.field3025 + class85.field574.method2534() + "%";
                     class292.field1990 = 60;
                  } else if (!class405.field2813.method2427()) {
                     class292.field1991 = class424.field3025 + (80 + class517.field4141.method2534() / 6) + "%";
                     class292.field1990 = 60;
                  } else {
                     class223.method1117(class85.field574);
                     class356.method1614(class85.field574);
                     class534 var46 = class85.field574;
                     var31 = class243.field1777;
                     class21.field215 = var46;
                     class21.field216 = var31;
                     class21.field218 = class21.field215.method2448(3);
                     var33 = class85.field574;
                     var35 = class243.field1777;
                     boolean var36 = field1120;
                     class458.field3598 = var33;
                     class458.field3596 = var35;
                     class458.field3644 = var36;
                     var6 = class85.field574;
                     class534 var7 = class243.field1777;
                     class90.field611 = var6;
                     class90.field612 = var7;
                     class534 var8 = class85.field574;
                     class235.field1730 = var8;
                     class534 var9 = class85.field574;
                     class534 var10 = class243.field1777;
                     boolean var11 = field1143;
                     class396 var12 = class174.field1423;
                     class459.field3646 = var9;
                     class47.field359 = var10;
                     class47.field360 = var11;
                     class156.field981 = class459.field3646.method2448(10);
                     class439.field3478 = var12;
                     class464.method2202(class85.field574, class143.field894, class40.field338);
                     class534 var13 = class85.field574;
                     class534 var14 = class243.field1777;
                     class163.field1047 = var13;
                     class163.field1034 = var14;
                     class266.method1214(class85.field574);
                     class107.method391(class85.field574);
                     class534 var15 = class307.field2086;
                     class534 var16 = class243.field1777;
                     class534 var17 = class62.field492;
                     class534 var18 = class443.field3522;
                     int var19 = 0;
                     if (null != var15) {
                        class399.field2774 = var15;
                        class525.field4174 = var16;
                        class103.field685 = var17;
                        class279.field1952 = var18;
                        var19 = class399.field2774.method2434();
                     }

                     class53.field436 = new class322[var19][];
                     class364.field2616 = new boolean[var19];
                     class519.method2504(class85.field574);
                     class534 var51 = class85.field574;
                     class342.field2551 = var51;
                     class534 var20 = class85.field574;
                     class333.field2506 = var20;
                     class534 var21 = class85.field574;
                     class58.method252(class85.field574);
                     class373.method1735(class85.field574);
                     class537.method2580(class85.field574);
                     class525.field4173 = new class483(class376.field2687, 54, class367.field2654, class85.field574);
                     class320.field2144 = new class483(class376.field2687, 47, class367.field2654, class85.field574);
                     class238.field1742 = new class338();
                     class534 var22 = class85.field574;
                     class534 var23 = class62.field492;
                     class534 var24 = class443.field3522;
                     class183.field1475 = var22;
                     class183.field1458 = var23;
                     class183.field1460 = var24;
                     class225.method1122(class85.field574, class62.field492);
                     class534 var25 = class85.field574;
                     class534 var26 = class62.field492;
                     class430.field3354 = var26;
                     if (var25.method2427()) {
                        class430.field3343 = var25.method2448(35);
                        class430.field3342 = new class430[class430.field3343];

                        for(int var27 = 0; var27 < class430.field3343; ++var27) {
                           byte[] var28 = var25.method2422(35, var27);
                           class430.field3342[var27] = new class430(var27);
                           if (var28 != null) {
                              class430.field3342[var27].method1998(new class366(var28));
                              class430.field3342[var27].method2000();
                           }
                        }
                     }

                     class292.field1991 = class424.field3218;
                     class292.field1990 = 60;
                     field1148 = class436.field3455;
                  }
               } else if (field1148 == class436.field3455) {
                  var30 = 0;
                  if (field1196 == null) {
                     field1196 = class513.method2454(class62.field492, class336.field2515.field1080, 0);
                  } else {
                     ++var30;
                  }

                  if (class270.field1889 == null) {
                     class270.field1889 = class513.method2454(class62.field492, class336.field2515.field1070, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class290.field1980) {
                     class290.field1980 = class382.method1760(class62.field492, class336.field2515.field1073, 0);
                  } else {
                     ++var30;
                  }

                  if (class267.field1876 == null) {
                     class267.field1876 = class382.method1771(class62.field492, class336.field2515.field1072, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class377.field2689) {
                     class377.field2689 = class382.method1771(class62.field492, class336.field2515.field1078, 0);
                  } else {
                     ++var30;
                  }

                  if (class184.field1483 == null) {
                     class184.field1483 = class382.method1771(class62.field492, class336.field2515.field1069, 0);
                  } else {
                     ++var30;
                  }

                  if (class243.field1778 == null) {
                     class243.field1778 = class382.method1771(class62.field492, class336.field2515.field1075, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class2.field4) {
                     class2.field4 = class382.method1771(class62.field492, class336.field2515.field1076, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class223.field1668) {
                     class223.field1668 = class382.method1771(class62.field492, class336.field2515.field1077, 0);
                  } else {
                     ++var30;
                  }

                  if (class241.field1763 == null) {
                     class241.field1763 = class382.method1760(class62.field492, class336.field2515.field1074, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class179.field1451) {
                     class179.field1451 = class382.method1760(class62.field492, class336.field2515.field1079, 0);
                  } else {
                     ++var30;
                  }

                  if (var30 < 11) {
                     class292.field1991 = class424.field3027 + var30 * 100 / 12 + "%";
                     class292.field1990 = 70;
                  } else {
                     class419.field2942 = class179.field1451;
                     class270.field1889.method1341();
                     var2 = (int)(Math.random() * 21.0) - 10;
                     var3 = (int)(Math.random() * 21.0) - 10;
                     var4 = (int)(Math.random() * 21.0) - 10;
                     int var5 = (int)(Math.random() * 41.0) - 20;
                     class290.field1980[0].method2390(var5 + var2, var3 + var5, var5 + var4);
                     class292.field1991 = class424.field3028;
                     class292.field1990 = 70;
                     field1148 = class436.field3469;
                  }
               } else if (field1148 == class436.field3469) {
                  if (!class540.field4291.method2427()) {
                     class292.field1991 = class424.field3029 + "0%";
                     class292.field1990 = 90;
                  } else {
                     class249.field1795 = new class477(class540.field4291, class62.field492, 20, class158.field1004.method531(), field1120 ? 64 : 128);
                     class480.method2260(class249.field1795);
                     class480.method2261(class158.field1004.method531());
                     field1148 = class436.field3470;
                  }
               } else if (class436.field3470 == field1148) {
                  var30 = class249.field1795.method2249();
                  if (var30 < 100) {
                     class292.field1991 = class424.field3029 + var30 + "%";
                     class292.field1990 = 90;
                  } else {
                     class292.field1991 = class424.field3307;
                     class292.field1990 = 90;
                     field1148 = class436.field3467;
                  }
               } else if (field1148 == class436.field3467) {
                  class129.field806 = new class112();
                  class535.field4242.method1191(class129.field806, 10);
                  class292.field1991 = class424.field3135;
                  class292.field1990 = 92;
                  field1148 = class436.field3466;
               } else if (class436.field3466 == field1148) {
                  if (!class189.field1494.method2442("huffman", "")) {
                     class292.field1991 = class424.field3054 + 0 + "%";
                     class292.field1990 = 94;
                  } else {
                     class4 var29 = new class4(class189.field1494.method2441("huffman", ""));
                     class453.method2108(var29);
                     class292.field1991 = class424.field3033;
                     class292.field1990 = 94;
                     field1148 = class436.field3460;
                  }
               } else if (class436.field3460 == field1148) {
                  if (!class307.field2086.method2427()) {
                     class292.field1991 = class424.field3034 + class307.field2086.method2534() * 4 / 5 + "%";
                     class292.field1990 = 96;
                  } else if (!class517.field4141.method2427()) {
                     class292.field1991 = class424.field3034 + (80 + class517.field4141.method2534() / 6) + "%";
                     class292.field1990 = 96;
                  } else if (!class443.field3522.method2427()) {
                     class292.field1991 = class424.field3034 + (96 + class443.field3522.method2534() / 50) + "%";
                     class292.field1990 = 96;
                  } else {
                     class292.field1991 = class424.field3035;
                     class292.field1990 = 98;
                     if (class517.field4141.method2444("version.dat", "")) {
                        class366 var1 = new class366(class517.field4141.method2441("version.dat", ""));
                        var1.method1703();
                     }

                     field1148 = class436.field3468;
                  }
               } else if (field1148 == class436.field3468) {
                  class292.field1990 = 100;
                  if (class367.field2655.method2434() > 0 && !class367.field2655.method2443(class75.field550.field549)) {
                     class292.field1991 = class424.field3036 + class367.field2655.method2449(class75.field550.field549) / 10 + "%";
                  } else {
                     if (null == class512.field4083) {
                        class512.field4083 = new class121();
                        class512.field4083.method411(class367.field2655, class430.field3365, class242.field1767, class274.field1923, field1185, class290.field1980);
                     }

                     class292.field1991 = class424.field3136;
                     field1148 = class436.field3457;
                  }
               } else {
                  if (class436.field3457 == field1148) {
                     method904(10);
                  }

               }
            }
         }
      }
   }

   static class534 method840(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      class340 var6 = null;
      if (null != class269.field1884) {
         var6 = new class340(var0, class269.field1884, class385.field2730[var0], 1000000);
      }

      return new class534(var6, class288.field1974, class215.field1651, var0, var1, var2, var3, var4);
   }

   static void method826() {
      field1181.method2259();
      field1181.field3782.field2652 = 0;
      field1181.field3778 = null;
      field1181.field3783 = null;
      field1181.field3789 = null;
      field1181.field3790 = null;
      field1181.field3784 = 0;
      field1181.field3788 = 0;
      field1136 = 0;
      method882();
      field1369 = 0;
      field1367 = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         field1289[var1] = null;
      }

      class266.field1874 = null;

      for(var1 = 0; var1 < field1176.length; ++var1) {
         class86 var2 = field1176[var1];
         if (var2 != null) {
            var2.field3408 = -1;
            var2.field3378 = false;
         }
      }

      class532.method2524();
      method904(30);

      for(var1 = 0; var1 < 100; ++var1) {
         field1126[var1] = true;
      }

      method806();
   }

   static final void method936() {
      field1181.method2258();
      method818();
      class137.field875.method1835();

      for(int var1 = 0; var1 < 4; ++var1) {
         field1191[var1].method1754();
      }

      field1355.method1825();
      System.gc();
      class283.method1299(0, 0);
      class36.method156();
      field1388 = false;
      class307.method1410();
      method904(10);
   }

   static long method831() {
      return field1246;
   }

   static final void method818() {
      class223.method1116();
      class356.field2585.method1180();
      class21.method116();
      class280.method1293();
      class90.field613.method1180();
      class90.field619.method1180();
      class47.field361.method1180();
      class47.field406.method1180();
      class47.field363.method1180();
      class464.field3677.method1180();
      class464.field3668.method1180();
      class464.field3676.method1180();
      class163.field1035.method1180();
      class163.field1036.method1180();
      class266.field1868.method1180();
      class107.field701.method1180();
      class525.field4173.method2285();
      class320.field2144.method2285();
      class183.method979();
      class225.field1680.method1180();
      class225.field1681.method1180();
      class235.field1731.method1180();
      class58.method251();
      class430.field3344.method1180();
      class449.method2099();
      class537.method2578();
      field1312.method1180();
      field1202.method1180();
      class206.field1591.method1180();
      class322.method1491();
      ((class477)class480.field3797.field4112).method2252();
      class283.field1955.method1180();
      field1407.method657();
      class143.field894.method2437();
      class40.field338.method2437();
      class307.field2086.method2437();
      class150.field960.method2437();
      class258.field1852.method2437();
      class339.field2531.method2437();
      class243.field1777.method2437();
      class62.field492.method2437();
      class540.field4291.method2437();
      class189.field1494.method2437();
      class520.field4158.method2437();
      class517.field4141.method2437();
      class405.field2813.method2437();
   }

   static final void method870() {
      if (field1169 > 0) {
         method936();
      } else {
         field1184.method1959();
         method904(40);
         class331.field2498 = field1181.method2257();
         field1181.method2256();
      }
   }

   static final void method819(boolean var0) {
      if (var0) {
         field1366 = class292.field2004 ? class84.field564 : class84.field563;
      } else {
         field1366 = class158.field1004.method526(class292.field2007) ? class84.field567 : class84.field570;
      }

   }

   static final void method898() {
      if (class432.field3372 != null) {
         class432.field3372.method276();
      }

   }

   static void method850(class464 var0, int var1, int var2, int var3) {
      if (field1371 < 50 && class158.field1004.method536() != 0) {
         if (null != var0.field3669 && var1 < var0.field3669.length) {
            method790(var0.field3669[var1], var2, var3);
         }
      }
   }

   static void method858(class464 var0, int var1, int var2, int var3) {
      if (field1371 < 50 && class158.field1004.method536() != 0) {
         if (null != var0.field3683 && var0.field3683.containsKey(var1)) {
            method790((Integer)var0.field3683.get(var1), var2, var3);
         }
      }
   }

   static void method790(int var0, int var1, int var2) {
      if (var0 != 0) {
         int var4 = var0 >> 8;
         int var5 = var0 >> 4 & 7;
         int var6 = var0 & 15;
         field1372[field1371] = var4;
         field1373[field1371] = var5;
         field1328[field1371] = 0;
         field1160[field1371] = null;
         int var7 = (var1 - 64) / 128;
         int var8 = (var2 - 64) / 128;
         field1123[field1371] = (var7 << 16) + (var8 << 8) + var6;
         ++field1371;
      }
   }

   static void method791(int var0, int var1, int var2) {
      if (class158.field1004.method518() != 0 && var1 != 0 && field1371 < 50) {
         field1372[field1371] = var0;
         field1373[field1371] = var1;
         field1328[field1371] = var2;
         field1160[field1371] = null;
         field1123[field1371] = 0;
         ++field1371;
      }

   }

   static void method894(int var0) {
      if (var0 == -1 && !field1388) {
         class283.method1299(0, 0);
      } else if (var0 != -1 && !class469.method2208(var0) && class158.field1004.method510() != 0) {
         ArrayList var2 = new ArrayList();
         var2.add(new class468(class339.field2531, var0, 0, class158.field1004.method510(), false));
         if (field1388) {
            class469.field3717.clear();
            class469.field3717.addAll(var2);
            class469.method2212(0, 100, 100, 0);
         } else {
            class469.method2206(var2, 0, 100, 100, 0, false);
         }
      }

   }

   static void method807(int var0, int var1) {
      if (class158.field1004.method510() != 0 && var0 != -1) {
         ArrayList var3 = new ArrayList();
         var3.add(new class468(class520.field4158, var0, 0, class158.field1004.method510(), false));
         class469.method2206(var3, 0, 0, 0, 0, true);
         field1388 = true;
      }

   }

   static final void method921() {
      if (class178.field1438) {
         for(int var1 = 0; var1 < class470.field3728; ++var1) {
            class443 var2 = field1289[class470.field3729[var1]];
            var2.method2062();
         }

         class178.field1438 = false;
      }

   }

   static final void method853() {
      if (field1362 != class156.field980) {
         field1362 = class156.field980;
         method780(class156.field980);
      }

   }

   static final void method913(class322 var0, int var1, int var2) {
      if (field1369 == 0 || field1369 == 3) {
         if (!field1229 && (class496.field3971 == 1 || !class301.field2050 && 4 == class496.field3971)) {
            class536 var4 = var0.method1455(true);
            if (var4 == null) {
               return;
            }

            int var5 = class496.field3972 - var1;
            int var6 = class496.field3973 - var2;
            if (var4.method2573(var5, var6)) {
               var5 -= var4.field4275 / 2;
               var6 -= var4.field4274 / 2;
               int var7 = field1294 & 2047;
               int var8 = class480.field3795[var7];
               int var9 = class480.field3793[var7];
               int var10 = var9 * var5 + var8 * var6 >> 11;
               int var11 = var9 * var6 - var8 * var5 >> 11;
               int var12 = class266.field1874.field3403 + var10 >> 7;
               int var13 = class266.field1874.field3374 - var11 >> 7;
               class53 var14 = class53.method226(class10.field120, field1181.field3781);
               var14.field435.method1643(18);
               var14.field435.method1679(class36.field314 + var12);
               var14.field435.method1706(var13 + class525.field4175);
               var14.field435.method1690(field1264.method1385(82) ? (field1264.method1385(81) ? 2 : 1) : 0);
               var14.field435.method1643(var5);
               var14.field435.method1643(var6);
               var14.field435.method1684(field1294);
               var14.field435.method1643(57);
               var14.field435.method1643(0);
               var14.field435.method1643(0);
               var14.field435.method1643(89);
               var14.field435.method1684(class266.field1874.field3403);
               var14.field435.method1684(class266.field1874.field3374);
               var14.field435.method1643(63);
               field1181.method2254(var14);
               field1367 = var12;
               field1290 = var13;
            }
         }

      }
   }

   static final void method878() {
      int[] var1 = class470.field3729;

      int var2;
      for(var2 = 0; var2 < class470.field3728; ++var2) {
         class443 var3 = field1289[var1[var2]];
         if (var3 != null && var3.field3397 > 0) {
            --var3.field3397;
            if (0 == var3.field3397) {
               var3.field3444 = null;
            }
         }
      }

      for(var2 = 0; var2 < field1177; ++var2) {
         int var5 = field1115[var2];
         class86 var4 = field1176[var5];
         if (var4 != null && var4.field3397 > 0) {
            --var4.field3397;
            if (0 == var4.field3397) {
               var4.field3444 = null;
            }
         }
      }

   }

   static final int method822(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }

   static final int method781(int var0) {
      return Math.abs(var0 - class455.field3578) > 1024 ? var0 + 2048 * (var0 < class455.field3578 ? 1 : -1) : var0;
   }

   static final void method834(int var0, int var1, int var2) {
      if (class90.field647 < var0) {
         class90.field647 += class482.field3801 + class496.field3975 * (var0 - class90.field647) / 1000;
         if (class90.field647 > var0) {
            class90.field647 = var0;
         }
      }

      if (class90.field647 > var0) {
         class90.field647 -= class482.field3801 + class496.field3975 * (class90.field647 - var0) / 1000;
         if (class90.field647 < var0) {
            class90.field647 = var0;
         }
      }

      if (class291.field1981 < var1) {
         class291.field1981 += class482.field3801 + (var1 - class291.field1981) * class496.field3975 / 1000;
         if (class291.field1981 > var1) {
            class291.field1981 = var1;
         }
      }

      if (class291.field1981 > var1) {
         class291.field1981 -= (class291.field1981 - var1) * class496.field3975 / 1000 + class482.field3801;
         if (class291.field1981 < var1) {
            class291.field1981 = var1;
         }
      }

      if (class84.field572 < var2) {
         class84.field572 += class482.field3801 + (var2 - class84.field572) * class496.field3975 / 1000;
         if (class84.field572 > var2) {
            class84.field572 = var2;
         }
      }

      if (class84.field572 > var2) {
         class84.field572 -= (class84.field572 - var2) * class496.field3975 / 1000 + class482.field3801;
         if (class84.field572 < var2) {
            class84.field572 = var2;
         }
      }

   }

   static final void method843() {
      int var1;
      int var2;
      int var3;
      if (!field1378) {
         var1 = 64 + class470.field3724 * 128;
         var2 = class79.field551 * 128 + 64;
         var3 = method787(var1, var2, class156.field980) - class107.field704;
         method834(var1, var3, var2);
      } else if (null != field1381) {
         class90.field647 = field1381.method1305();
         class84.field572 = field1381.method1306();
         if (field1380) {
            class291.field1981 = field1381.method1307();
         } else {
            class291.field1981 = method787(class90.field647, class84.field572, class156.field980) - field1381.method1307();
         }

         field1381.method78();
      }

      if (!field1379) {
         var1 = 64 + class415.field2917 * 128;
         var2 = class266.field1871 * 128 + 64;
         var3 = method787(var1, var2, class156.field980) - class38.field327;
         int var4 = var1 - class90.field647;
         int var5 = var3 - class291.field1981;
         int var6 = var2 - class84.field572;
         int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
         int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.9490051269531) & 2047;
         int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.9490051269531) & 2047;
         class170.method656(var8, var9);
      } else {
         if (field1198 != null) {
            class249.field1796 = field1198.method1125();
            class249.field1796 = Math.min(Math.max(class249.field1796, 128), 383);
            field1198.method78();
         }

         if (field1172 != null) {
            class455.field3578 = field1172.method1125() & 2047;
            field1172.method78();
         }
      }

   }

   static final void method927() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if (0 == field1209) {
         var1 = class266.field1874.field3403;
         var2 = class266.field1874.field3374;
         if (class278.field1947 - var1 < -500 || class278.field1947 - var1 > 500 || class156.field982 - var2 < -500 || class156.field982 - var2 > 500) {
            class278.field1947 = var1;
            class156.field982 = var2;
         }

         if (class278.field1947 != var1) {
            class278.field1947 += (var1 - class278.field1947) / 16;
         }

         if (class156.field982 != var2) {
            class156.field982 += (var2 - class156.field982) / 16;
         }

         var3 = class278.field1947 >> 7;
         var4 = class156.field982 >> 7;
         var5 = method787(class278.field1947, class156.field982, class156.field980);
         var6 = 0;
         int var7;
         if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               for(int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                  int var9 = class156.field980;
                  if (var9 < 3 && 2 == (class513.field4100[1][var7][var8] & 2)) {
                     ++var9;
                  }

                  int var10 = var5 - class513.field4098[var9][var7][var8];
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

         if (var7 > field1258) {
            field1258 += (var7 - field1258) / 24;
         } else if (var7 < field1258) {
            field1258 += (var7 - field1258) / 80;
         }

         class203.field1565 = method787(class266.field1874.field3403, class266.field1874.field3374, class156.field980) - field1210;
      } else if (field1209 == 1) {
         method794();
         short var11 = -1;
         if (field1264.method1385(33)) {
            var11 = 0;
         } else if (field1264.method1385(49)) {
            var11 = 1024;
         }

         if (field1264.method1385(48)) {
            if (var11 == 0) {
               var11 = 1792;
            } else if (var11 == 1024) {
               var11 = 1280;
            } else {
               var11 = 1536;
            }
         } else if (field1264.method1385(50)) {
            if (var11 == 0) {
               var11 = 256;
            } else if (var11 == 1024) {
               var11 = 768;
            } else {
               var11 = 512;
            }
         }

         byte var12 = 0;
         if (field1264.method1385(35)) {
            var12 = -1;
         } else if (field1264.method1385(51)) {
            var12 = 1;
         }

         var3 = 0;
         if (var11 >= 0 || var12 != 0) {
            var3 = field1264.method1385(81) ? field1215 : field1214;
            var3 *= 16;
            field1212 = var11;
            field1213 = var12;
         }

         if (field1211 < var3) {
            field1211 += var3 / 8;
            if (field1211 > var3) {
               field1211 = var3;
            }
         } else if (field1211 > var3) {
            field1211 = field1211 * 9 / 10;
         }

         if (field1211 > 0) {
            var4 = field1211 / 16;
            if (field1212 >= 0) {
               var1 = field1212 - class455.field3578 & 2047;
               var5 = class480.field3795[var1];
               var6 = class480.field3793[var1];
               class278.field1947 += var5 * var4 / 65536;
               class156.field982 += var6 * var4 / 65536;
            }

            if (field1213 != 0) {
               class203.field1565 += field1213 * var4;
               if (class203.field1565 > 0) {
                  class203.field1565 = 0;
               }
            }
         } else {
            field1212 = -1;
            field1213 = -1;
         }

         if (field1264.method1385(13)) {
            method799();
         }
      }

      if (4 == class496.field3967 && class301.field2050) {
         var1 = class496.field3960 - field1272;
         field1206 = var1 * 2;
         field1272 = var1 != -1 && var1 != 1 ? (field1272 + class496.field3960) / 2 : class496.field3960;
         var2 = field1128 - class496.field3977;
         field1205 = var2 * 2;
         field1128 = var2 != -1 && var2 != 1 ? (class496.field3977 + field1128) / 2 : class496.field3977;
      } else {
         if (field1264.method1385(96)) {
            field1205 += (-24 - field1205) / 2;
         } else if (field1264.method1385(97)) {
            field1205 += (24 - field1205) / 2;
         } else {
            field1205 /= 2;
         }

         if (field1264.method1385(98)) {
            field1206 += (12 - field1206) / 2;
         } else if (field1264.method1385(99)) {
            field1206 += (-12 - field1206) / 2;
         } else {
            field1206 /= 2;
         }

         field1272 = class496.field3960;
         field1128 = class496.field3977;
      }

      field1294 = field1205 / 2 + field1294 & 2047;
      field1155 += field1206 / 2;
      if (field1155 < 128) {
         field1155 = 128;
      }

      if (field1155 > 383) {
         field1155 = 383;
      }

   }

   static final void method899(class433 var0, int var1) {
      if (var0.field3429 >= field1419) {
         method905(var0);
      } else {
         int var5;
         int var6;
         int var8;
         int var9;
         int var13;
         if (var0.field3430 >= field1419) {
            boolean var3 = field1419 == var0.field3430 || -1 == var0.field3418 || 0 != var0.field3435;
            if (!var3) {
               class464 var4 = class464.method2200(var0.field3418);
               if (var4 != null && !var4.method2199()) {
                  var3 = var0.field3420 + 1 > var4.field3685[var0.field3419];
               } else {
                  var3 = true;
               }
            }

            if (var3) {
               var13 = var0.field3430 - var0.field3429;
               var5 = field1419 - var0.field3429;
               var6 = var0.field3377 * 64 + var0.field3425 * 128;
               int var7 = var0.field3377 * 64 + var0.field3427 * 128;
               var8 = var0.field3423 * 128 + var0.field3377 * 64;
               var9 = var0.field3377 * 64 + var0.field3393 * 128;
               var0.field3403 = ((var13 - var5) * var6 + var5 * var8) / var13;
               var0.field3374 = (var5 * var9 + var7 * (var13 - var5)) / var13;
            }

            var0.field3447 = 0;
            var0.field3414 = var0.field3431;
            var0.field3375 = var0.field3414;
         } else {
            var0.field3386 = var0.field3379;
            if (var0.field3421 == 0) {
               var0.field3447 = 0;
            } else {
               label297: {
                  if (var0.field3418 != -1 && 0 == var0.field3435) {
                     class464 var12 = class464.method2200(var0.field3418);
                     if (var0.field3437 > 0 && var12.field3687 == 0) {
                        ++var0.field3447;
                        break label297;
                     }

                     if (var0.field3437 <= 0 && var12.field3688 == 0) {
                        ++var0.field3447;
                        break label297;
                     }
                  }

                  int var14 = var0.field3403;
                  var13 = var0.field3374;
                  var5 = 128 * var0.field3448[var0.field3421 - 1] + var0.field3377 * 64;
                  var6 = var0.field3377 * 64 + 128 * var0.field3445[var0.field3421 - 1];
                  if (var14 < var5) {
                     if (var13 < var6) {
                        var0.field3414 = 1280;
                     } else if (var13 > var6) {
                        var0.field3414 = 1792;
                     } else {
                        var0.field3414 = 1536;
                     }
                  } else if (var14 > var5) {
                     if (var13 < var6) {
                        var0.field3414 = 768;
                     } else if (var13 > var6) {
                        var0.field3414 = 256;
                     } else {
                        var0.field3414 = 512;
                     }
                  } else if (var13 < var6) {
                     var0.field3414 = 1024;
                  } else if (var13 > var6) {
                     var0.field3414 = 0;
                  }

                  class82 var15 = var0.field3446[var0.field3421 - 1];
                  if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
                     var8 = var0.field3414 - var0.field3375 & 2047;
                     if (var8 > 1024) {
                        var8 -= 2048;
                     }

                     var9 = var0.field3383;
                     if (var8 >= -256 && var8 <= 256) {
                        var9 = var0.field3382;
                     } else if (var8 >= 256 && var8 < 768) {
                        var9 = var0.field3432;
                     } else if (var8 >= -768 && var8 <= -256) {
                        var9 = var0.field3384;
                     }

                     if (var9 == -1) {
                        var9 = var0.field3382;
                     }

                     var0.field3386 = var9;
                     int var10 = 4;
                     boolean var11 = true;
                     if (var0 instanceof class86) {
                        var11 = ((class86)var0).field577.field610;
                     }

                     if (var11) {
                        if (var0.field3414 != var0.field3375 && var0.field3408 == -1 && 0 != var0.field3442) {
                           var10 = 2;
                        }

                        if (var0.field3421 > 2) {
                           var10 = 6;
                        }

                        if (var0.field3421 > 3) {
                           var10 = 8;
                        }

                        if (var0.field3447 > 0 && var0.field3421 > 1) {
                           var10 = 8;
                           --var0.field3447;
                        }
                     } else {
                        if (var0.field3421 > 1) {
                           var10 = 6;
                        }

                        if (var0.field3421 > 2) {
                           var10 = 8;
                        }

                        if (var0.field3447 > 0 && var0.field3421 > 1) {
                           var10 = 8;
                           --var0.field3447;
                        }
                     }

                     if (var15 == class82.field558) {
                        var10 <<= 1;
                     } else if (var15 == class82.field557) {
                        var10 >>= 1;
                     }

                     if (var10 >= 8) {
                        if (var0.field3386 == var0.field3382 && var0.field3443 != -1) {
                           var0.field3386 = var0.field3443;
                        } else if (var0.field3383 == var0.field3386 && var0.field3387 != -1) {
                           var0.field3386 = var0.field3387;
                        } else if (var0.field3386 == var0.field3384 && -1 != var0.field3428) {
                           var0.field3386 = var0.field3428;
                        } else if (var0.field3432 == var0.field3386 && -1 != var0.field3389) {
                           var0.field3386 = var0.field3389;
                        }
                     } else if (var10 <= 2) {
                        if (var0.field3386 == var0.field3382 && var0.field3390 != -1) {
                           var0.field3386 = var0.field3390;
                        } else if (var0.field3386 == var0.field3383 && var0.field3391 != -1) {
                           var0.field3386 = var0.field3391;
                        } else if (var0.field3384 == var0.field3386 && var0.field3392 != -1) {
                           var0.field3386 = var0.field3392;
                        } else if (var0.field3432 == var0.field3386 && var0.field3422 != -1) {
                           var0.field3386 = var0.field3422;
                        }
                     }

                     if (var5 != var14 || var6 != var13) {
                        if (var14 < var5) {
                           var0.field3403 += var10;
                           if (var0.field3403 > var5) {
                              var0.field3403 = var5;
                           }
                        } else if (var14 > var5) {
                           var0.field3403 -= var10;
                           if (var0.field3403 < var5) {
                              var0.field3403 = var5;
                           }
                        }

                        if (var13 < var6) {
                           var0.field3374 += var10;
                           if (var0.field3374 > var6) {
                              var0.field3374 = var6;
                           }
                        } else if (var13 > var6) {
                           var0.field3374 -= var10;
                           if (var0.field3374 < var6) {
                              var0.field3374 = var6;
                           }
                        }
                     }

                     if (var5 == var0.field3403 && var0.field3374 == var6) {
                        --var0.field3421;
                        if (var0.field3437 > 0) {
                           --var0.field3437;
                        }
                     }
                  } else {
                     var0.field3403 = var5;
                     var0.field3374 = var6;
                     --var0.field3421;
                     if (var0.field3437 > 0) {
                        --var0.field3437;
                     }
                  }
               }
            }
         }
      }

      if (var0.field3403 < 128 || var0.field3374 < 128 || var0.field3403 >= 13184 || var0.field3374 >= 13184) {
         var0.field3418 = -1;
         var0.field3429 = 0;
         var0.field3430 = 0;
         var0.method2025();
         var0.field3403 = 128 * var0.field3448[0] + var0.field3377 * 64;
         var0.field3374 = var0.field3445[0] * 128 + var0.field3377 * 64;
         var0.method2018();
      }

      if (var0 == class266.field1874 && (var0.field3403 < 1536 || var0.field3374 < 1536 || var0.field3403 >= 11776 || var0.field3374 >= 11776)) {
         var0.field3418 = -1;
         var0.field3429 = 0;
         var0.field3430 = 0;
         var0.method2025();
         var0.field3403 = 128 * var0.field3448[0] + var0.field3377 * 64;
         var0.field3374 = var0.field3445[0] * 128 + var0.field3377 * 64;
         var0.method2018();
      }

      class367.method1718(var0);
      class476.method2248(var0);
   }

   static final void method905(class433 var0) {
      int var2 = Math.max(1, var0.field3429 - field1419);
      int var3 = var0.field3425 * 128 + var0.field3377 * 64;
      int var4 = var0.field3377 * 64 + var0.field3427 * 128;
      var0.field3403 += (var3 - var0.field3403) / var2;
      var0.field3374 += (var4 - var0.field3374) / var2;
      var0.field3447 = 0;
      var0.field3414 = var0.field3431;
   }

   static void method893() {
      if (null != class512.field4083) {
         class512.field4083.method417(class156.field980, class36.field314 + (class266.field1874.field3403 >> 7), class525.field4175 + (class266.field1874.field3374 >> 7), false);
         class512.field4083.method433();
      }

   }

   static void method938(class443 var0, int var1, int var2) {
      if (var1 == var0.field3418 && var1 != -1) {
         int var4 = class464.method2200(var1).field3689;
         if (var4 == 1) {
            var0.field3419 = 0;
            var0.field3420 = 0;
            var0.field3435 = var2;
            var0.field3400 = 0;
         }

         if (var4 == 2) {
            var0.field3400 = 0;
         }
      } else if (var1 == -1 || -1 == var0.field3418 || class464.method2200(var1).field3682 >= class464.method2200(var0.field3418).field3682) {
         var0.field3418 = var1;
         var0.field3419 = 0;
         var0.field3420 = 0;
         var0.field3435 = var2;
         var0.field3400 = 0;
         var0.field3437 = var0.field3421;
      }

   }

   static int method868() {
      return field1347 ? 2 : 1;
   }

   static void method806() {
      class53 var1 = class53.method226(class10.field169, field1181.field3781);
      var1.field435.method1643(method868());
      var1.field435.method1684(class114.field730);
      var1.field435.method1684(class394.field2761);
      field1181.method2254(var1);
   }

   static final void method925(String var0, boolean var1) {
      if (field1242) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class502.field4012.method1938(var0, 250);
         int var7 = class502.field4012.method1917(var0, 250) * 13;
         class427.method1968(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
         class427.method1971(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
         class502.field4012.method1914(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         int var8 = var4 - var3;
         int var9 = var5 - var3;
         int var10 = var3 + var6 + var3;
         int var11 = var3 + var7 + var3;

         for(int var12 = 0; var12 < field1287; ++var12) {
            if (field1341[var12] + field1343[var12] > var8 && field1341[var12] < var10 + var8 && field1342[var12] + field1344[var12] > var9 && field1342[var12] < var11 + var9) {
               field1126[var12] = true;
            }
         }

         if (var1) {
            class143.field899.method1442(0, 0);
         } else {
            method779(var4, var5, var6, var7);
         }

      }
   }

   static final void method844(int var0, int var1, int var2, int var3) {
      ++field1286;
      if (field1367 == class266.field1874.field3403 >> 7 && field1290 == class266.field1874.field3374 >> 7) {
         field1367 = 0;
      }

      method875();
      method817();
      method884(true);
      method848();
      method884(false);

      int var7;
      for(class484 var5 = (class484)field1243.method1991(); null != var5; var5 = (class484)field1243.method1993()) {
         if (var5.field3806 == class156.field980 && field1419 <= var5.field3815) {
            if (field1419 >= var5.field3830) {
               class86 var6;
               class443 var38;
               if (!var5.field3807 && 0 != var5.field3821) {
                  if (var5.field3821 > 0) {
                     var6 = field1176[var5.field3821 - 1];
                     if (null != var6 && var6.field3403 >= 0 && var6.field3403 < 13312 && var6.field3374 >= 0 && var6.field3374 < 13312) {
                        var5.field3816 = var6.field3403;
                        var5.field3805 = var6.field3374;
                        var5.method2287(var5.field3811, var5.field3812, var5.field3813, field1419);
                     }
                  } else {
                     var7 = -var5.field3821 - 1;
                     if (field1244 == var7) {
                        var38 = class266.field1874;
                     } else {
                        var38 = field1289[var7];
                     }

                     if (var38 != null && var38.field3403 >= 0 && var38.field3403 < 13312 && var38.field3374 >= 0 && var38.field3374 < 13312) {
                        var5.field3816 = var38.field3403;
                        var5.field3805 = var38.field3374;
                        var5.method2287(var5.field3811, var5.field3812, var5.field3813, field1419);
                     }
                  }
               }

               if (var5.field3819 > 0) {
                  var6 = field1176[var5.field3819 - 1];
                  if (var6 != null && var6.field3403 >= 0 && var6.field3403 < 13312 && var6.field3374 >= 0 && var6.field3374 < 13312) {
                     var5.method2287(var6.field3403, var6.field3374, method787(var6.field3403, var6.field3374, var5.field3806) - var5.field3810, field1419);
                  }
               }

               if (var5.field3819 < 0) {
                  var7 = -var5.field3819 - 1;
                  if (var7 == field1244) {
                     var38 = class266.field1874;
                  } else {
                     var38 = field1289[var7];
                  }

                  if (null != var38 && var38.field3403 >= 0 && var38.field3403 < 13312 && var38.field3374 >= 0 && var38.field3374 < 13312) {
                     var5.method2287(var38.field3403, var38.field3374, method787(var38.field3403, var38.field3374, var5.field3806) - var5.field3810, field1419);
                  }
               }

               var5.method2288(field1195);
               class137.field875.method1843(class156.field980, (int)var5.field3829, (int)var5.field3822, (int)var5.field3823, 60, var5, var5.field3809, -1L, false);
            }
         } else {
            var5.method295();
         }
      }

      class270.method1226();
      class241.method1164(var0, var1, var2, var3, true);
      var0 = field1397;
      var1 = field1398;
      var2 = field1332;
      var3 = field1207;
      class427.method1975(var0, var1, var2 + var0, var1 + var3);
      class480.method2271();
      class427.method1977();
      int var37 = field1155;
      if (field1258 / 256 > var37) {
         var37 = field1258 / 256;
      }

      if (field1384[4] && field1338[4] + 128 > var37) {
         var37 = field1338[4] + 128;
      }

      int var39 = field1294 & 2047;
      var7 = class278.field1947;
      int var8 = class203.field1565;
      int var9 = class156.field982;
      int var10 = method860(var37);
      int var12 = var3 - 334;
      if (var12 < 0) {
         var12 = 0;
      } else if (var12 > 100) {
         var12 = 100;
      }

      int var13 = field1391 + (field1392 - field1391) * var12 / 100;
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
         var17 = class480.field3795[var12];
         var18 = class480.field3793[var12];
         var19 = var18 * var15 - var17 * var11 >> 16;
         var16 = var18 * var11 + var17 * var15 >> 16;
         var15 = var19;
      }

      if (var13 != 0) {
         var17 = class480.field3795[var13];
         var18 = class480.field3793[var13];
         var19 = var17 * var16 + var14 * var18 >> 16;
         var16 = var18 * var16 - var14 * var17 >> 16;
         var14 = var19;
      }

      if (field1377) {
         class467.field3696 = var7 - var14;
         class238.field1736 = var8 - var15;
         class410.field2890 = var9 - var16;
         class16.field200 = var37;
         class363.field2615 = var39;
      } else {
         class90.field647 = var7 - var14;
         class291.field1981 = var8 - var15;
         class84.field572 = var9 - var16;
         class249.field1796 = var37;
         class455.field3578 = var39;
      }

      if (field1209 == 1 && field1204 >= 2 && field1419 % 50 == 0 && (class266.field1874.field3403 >> 7 != class278.field1947 >> 7 || class156.field982 >> 7 != class266.field1874.field3374 >> 7)) {
         var17 = class266.field1874.field3514;
         var18 = (class278.field1947 >> 7) + class36.field314;
         var19 = class525.field4175 + (class156.field982 >> 7);
         method820(var18, var19, var17, true);
      }

      int var21;
      if (!field1377) {
         if (class158.field1004.method509()) {
            var12 = class156.field980;
         } else {
            label554: {
               var13 = 3;
               if (class249.field1796 < 310) {
                  label546: {
                     if (1 == field1209) {
                        var14 = class278.field1947 >> 7;
                        var15 = class156.field982 >> 7;
                     } else {
                        var14 = class266.field1874.field3403 >> 7;
                        var15 = class266.field1874.field3374 >> 7;
                     }

                     var16 = class90.field647 >> 7;
                     var17 = class84.field572 >> 7;
                     if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                        if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                           if (0 != (class513.field4100[class156.field980][var16][var17] & 4)) {
                              var13 = class156.field980;
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

                              while(true) {
                                 if (var16 == var14) {
                                    break label546;
                                 }

                                 if (var16 < var14) {
                                    ++var16;
                                 } else if (var16 > var14) {
                                    --var16;
                                 }

                                 if (0 != (class513.field4100[class156.field980][var16][var17] & 4)) {
                                    var13 = class156.field980;
                                 }

                                 var21 += var20;
                                 if (var21 >= 65536) {
                                    var21 -= 65536;
                                    if (var17 < var15) {
                                       ++var17;
                                    } else if (var17 > var15) {
                                       --var17;
                                    }

                                    if (0 != (class513.field4100[class156.field980][var16][var17] & 4)) {
                                       var13 = class156.field980;
                                    }
                                 }
                              }
                           } else {
                              if (var19 > 0) {
                                 var20 = var18 * 65536 / var19;
                                 var21 = 32768;

                                 while(var15 != var17) {
                                    if (var17 < var15) {
                                       ++var17;
                                    } else if (var17 > var15) {
                                       --var17;
                                    }

                                    if (0 != (class513.field4100[class156.field980][var16][var17] & 4)) {
                                       var13 = class156.field980;
                                    }

                                    var21 += var20;
                                    if (var21 >= 65536) {
                                       var21 -= 65536;
                                       if (var16 < var14) {
                                          ++var16;
                                       } else if (var16 > var14) {
                                          --var16;
                                       }

                                       if ((class513.field4100[class156.field980][var16][var17] & 4) != 0) {
                                          var13 = class156.field980;
                                       }
                                    }
                                 }
                              }
                              break label546;
                           }
                        }

                        var12 = class156.field980;
                        break label554;
                     }

                     var12 = class156.field980;
                     break label554;
                  }
               }

               if (class266.field1874.field3403 >= 0 && class266.field1874.field3374 >= 0 && class266.field1874.field3403 < 13312 && class266.field1874.field3374 < 13312) {
                  if ((class513.field4100[class156.field980][class266.field1874.field3403 >> 7][class266.field1874.field3374 >> 7] & 4) != 0) {
                     var13 = class156.field980;
                  }

                  var12 = var13;
               } else {
                  var12 = class156.field980;
               }
            }
         }

         var11 = var12;
      } else {
         var11 = method861();
      }

      var12 = class90.field647;
      var13 = class291.field1981;
      var14 = class84.field572;
      var15 = class249.field1796;
      var16 = class455.field3578;

      for(var17 = 0; var17 < 5; ++var17) {
         if (field1384[var17]) {
            var18 = (int)(Math.random() * (double)(field1178[var17] * 2 + 1) - (double)field1178[var17] + Math.sin((double)field1248[var17] / 100.0 * (double)field1334[var17]) * (double)field1338[var17]);
            if (var17 == 0) {
               class90.field647 += var18;
            }

            if (var17 == 1) {
               class291.field1981 += var18;
            }

            if (var17 == 2) {
               class84.field572 += var18;
            }

            if (var17 == 3) {
               class455.field3578 = class455.field3578 + var18 & 2047;
            }

            if (var17 == 4) {
               class249.field1796 += var18;
               if (class249.field1796 < 128) {
                  class249.field1796 = 128;
               }

               if (class249.field1796 > 383) {
                  class249.field1796 = 383;
               }
            }
         }
      }

      var17 = class496.field3977;
      var18 = class496.field3960;
      if (0 != class496.field3971) {
         var17 = class496.field3972;
         var18 = class496.field3973;
      }

      if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
         class463.method2182(var17 - var0, var18 - var1);
      } else {
         class463.method2183();
      }

      method898();
      class427.method1968(var0, var1, var2, var3, 0);
      method898();
      var19 = class480.method2268();
      class480.method2272(class530.field4182.field4257);
      class480.field3797.field4113 = field1401;
      class137.field875.method1863(class90.field647, class291.field1981, class84.field572, class249.field1796, class455.field3578, var11);
      class480.method2272(false);
      if (field1180) {
         class427.method1978();
      }

      class480.field3797.field4113 = var19;
      method898();
      class137.field875.method1882();
      field1221 = 0;
      boolean var40 = false;
      var21 = -1;
      int var22 = -1;
      int var23 = class470.field3728;
      int[] var24 = class470.field3729;

      int var25;
      for(var25 = 0; var25 < field1177 + var23; ++var25) {
         Object var26;
         if (var25 < var23) {
            var26 = field1289[var24[var25]];
            if (field1255 == var24[var25]) {
               var40 = true;
               var21 = var25;
               continue;
            }

            if (var26 == class266.field1874) {
               var22 = var25;
               continue;
            }
         } else {
            var26 = field1176[field1115[var25 - var23]];
         }

         class62.method278((class433)var26, var25, var0, var1, var2, var3, (byte)-53);
      }

      if (field1354 && var22 != -1) {
         class62.method278(class266.field1874, var22, var0, var1, var2, var3, (byte)1);
      }

      if (var40) {
         class62.method278(field1289[field1255], var21, var0, var1, var2, var3, (byte)56);
      }

      for(var25 = 0; var25 < field1221; ++var25) {
         int var41 = field1223[var25];
         int var27 = field1224[var25];
         int var28 = field1400[var25];
         int var29 = field1175[var25];
         boolean var30 = true;

         while(var30) {
            var30 = false;

            for(int var31 = 0; var31 < var25; ++var31) {
               if (var27 + 2 > field1224[var31] - field1175[var31] && var27 - var29 < 2 + field1224[var31] && var41 - var28 < field1400[var31] + field1223[var31] && var41 + var28 > field1223[var31] - field1400[var31] && field1224[var31] - field1175[var31] < var27) {
                  var27 = field1224[var31] - field1175[var31];
                  var30 = true;
               }
            }
         }

         field1234 = field1223[var25];
         field1235 = field1224[var25] = var27;
         String var42 = field1231[var25];
         if (0 == field1292) {
            int var32 = 16776960;
            if (field1227[var25] < 6) {
               var32 = field1348[field1227[var25]];
            }

            if (field1227[var25] == 6) {
               var32 = field1286 % 20 < 10 ? 16711680 : 16776960;
            }

            if (7 == field1227[var25]) {
               var32 = field1286 % 20 < 10 ? 255 : '\uffff';
            }

            if (field1227[var25] == 8) {
               var32 = field1286 % 20 < 10 ? '\ub000' : 8454016;
            }

            int var33;
            if (9 == field1227[var25]) {
               var33 = 150 - field1376[var25];
               if (var33 < 50) {
                  var32 = 16711680 + var33 * 1280;
               } else if (var33 < 100) {
                  var32 = 16776960 - 327680 * (var33 - 50);
               } else if (var33 < 150) {
                  var32 = '\uff00' + 5 * (var33 - 100);
               }
            }

            if (field1227[var25] == 10) {
               var33 = 150 - field1376[var25];
               if (var33 < 50) {
                  var32 = var33 * 5 + 16711680;
               } else if (var33 < 100) {
                  var32 = 16711935 - 327680 * (var33 - 50);
               } else if (var33 < 150) {
                  var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
               }
            }

            if (11 == field1227[var25]) {
               var33 = 150 - field1376[var25];
               if (var33 < 50) {
                  var32 = 16777215 - var33 * 327685;
               } else if (var33 < 100) {
                  var32 = '\uff00' + (var33 - 50) * 327685;
               } else if (var33 < 150) {
                  var32 = 16777215 - 327680 * (var33 - 100);
               }
            }

            int var34;
            if (field1227[var25] == 12 && field1125[var25] == null) {
               var33 = var42.length();
               field1125[var25] = new int[var33];

               for(var34 = 0; var34 < var33; ++var34) {
                  int var35 = (int)(64.0F * ((float)var34 / (float)var33));
                  int var36 = var35 << 10 | 896 | 64;
                  field1125[var25][var34] = class56.field456[var36];
               }
            }

            if (0 == field1228[var25]) {
               class274.field1923.method1926(var42, var0 + field1234, field1235 + var1, var32, 0, field1125[var25]);
            }

            if (field1228[var25] == 1) {
               class274.field1923.method1937(var42, field1234 + var0, field1235 + var1, var32, 0, field1286, field1125[var25]);
            }

            if (2 == field1228[var25]) {
               class274.field1923.method1925(var42, field1234 + var0, var1 + field1235, var32, 0, field1286, field1125[var25]);
            }

            if (3 == field1228[var25]) {
               class274.field1923.method1939(var42, var0 + field1234, field1235 + var1, var32, 0, field1286, 150 - field1376[var25], field1125[var25]);
            }

            if (4 == field1228[var25]) {
               var33 = (150 - field1376[var25]) * (class274.field1923.method1915(var42) + 100) / 150;
               class427.method1981(field1234 + var0 - 50, var1, field1234 + var0 + 50, var1 + var3);
               class274.field1923.method1940(var42, 50 + var0 + field1234 - var33, var1 + field1235, var32, 0, field1125[var25]);
               class427.method1975(var0, var1, var2 + var0, var1 + var3);
            }

            if (field1228[var25] == 5) {
               var33 = 150 - field1376[var25];
               var34 = 0;
               if (var33 < 25) {
                  var34 = var33 - 25;
               } else if (var33 > 125) {
                  var34 = var33 - 125;
               }

               class427.method1981(var0, field1235 + var1 - class274.field1923.field2946 - 1, var0 + var2, 5 + field1235 + var1);
               class274.field1923.method1926(var42, var0 + field1234, var1 + field1235 + var34, var32, 0, field1125[var25]);
               class427.method1975(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class274.field1923.method1922(var42, var0 + field1234, field1235 + var1, 16776960, 0);
         }
      }

      method810(var0, var1);
      ((class477)class480.field3797.field4112).method2251(field1195);
      method847(var0, var1, var2, var3);
      class90.field647 = var12;
      class291.field1981 = var13;
      class84.field572 = var14;
      class249.field1796 = var15;
      class455.field3578 = var16;
      if (field1129 && class215.field1651.method133(true, false) == 0) {
         field1129 = false;
      }

      if (field1129) {
         class427.method1968(var0, var1, var2, var3, 0);
         method925(class424.field3012, false);
      }

   }

   static void method875() {
      if (field1354) {
         class436.method2040(class266.field1874, false);
      }

   }

   static void method817() {
      if (field1255 >= 0 && null != field1289[field1255]) {
         class436.method2040(field1289[field1255], false);
      }

   }

   static void method848() {
      int var1 = class470.field3728;
      int[] var2 = class470.field3729;

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var2[var3] != field1255 && field1244 != var2[var3]) {
            class436.method2040(field1289[var2[var3]], true);
         }
      }

   }

   static final void method884(boolean var0) {
      for(int var2 = 0; var2 < field1177; ++var2) {
         class86 var3 = field1176[field1115[var2]];
         if (null != var3 && var3.method2017() && var0 == var3.field577.field643 && var3.field577.method353()) {
            int var4 = var3.field3403 >> 7;
            int var5 = var3.field3374 >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (1 == var3.field3377 && (var3.field3403 & 127) == 64 && (var3.field3374 & 127) == 64) {
                  if (field1232[var4][var5] == field1286) {
                     continue;
                  }

                  field1232[var4][var5] = field1286;
               }

               long var6 = class463.method2187(0, 0, 1, !var3.field577.field650, field1115[var2]);
               var3.field3409 = field1419;
               class137.field875.method1843(class156.field980, var3.field3403, var3.field3374, method787(var3.field3377 * 64 - 64 + var3.field3403, var3.field3377 * 64 - 64 + var3.field3374, class156.field980), var3.field3377 * 64 - 64 + 60, var3, var3.field3375, var6, var3.field3381);
            }
         }
      }

   }

   static final int method861() {
      if (class158.field1004.method509()) {
         return class156.field980;
      } else {
         int var1 = method787(class90.field647, class84.field572, class156.field980);
         return var1 - class291.field1981 < 800 && 0 != (class513.field4100[class156.field980][class90.field647 >> 7][class84.field572 >> 7] & 4) ? class156.field980 : 3;
      }
   }

   static final void method810(int var0, int var1) {
      if (field1194 == 2) {
         method814(field1303 + (field1140 - class36.field314 << 7), field1336 + (field1283 - class525.field4175 << 7), field1147 * 2);
         if (field1234 > -1 && field1419 % 20 < 10) {
            class184.field1483[0].method1366(field1234 + var0 - 12, var1 + field1235 - 28);
         }

      }
   }

   public static class429 method796() {
      return field1331;
   }

   static void method940() {
      for(class55 var1 = (class55)field1370.method1991(); var1 != null; var1 = (class55)field1370.method1993()) {
         var1.method295();
      }

   }

   static void method856(class55 var0) {
      if (null != var0 && var0.field455 != null) {
         if (var0.field455.field2277 >= 0) {
            class322 var2 = class322.method1488(var0.field455.field2175);
            if (null == var2 || null == var2.field2290 || 0 == var2.field2290.length || var0.field455.field2277 >= var2.field2290.length || var2.field2290[var0.field455.field2277] != var0.field455) {
               return;
            }
         }

         if (11 == var0.field455.field2160 && 0 == var0.field452) {
            if (var0.field455.method1461(var0.field453, var0.field454, 0, 0)) {
               switch (var0.field455.method1464()) {
                  case 0:
                     class410.method1894(var0.field455.method1466(), true, false);
                     break;
                  case 1:
                     int var3 = method865(var0.field455);
                     boolean var7 = 0 != (var3 >> 22 & 1);
                     if (var7) {
                        int[] var4 = var0.field455.method1473();
                        if (null != var4) {
                           class53 var5 = class53.method226(class10.field96, field1181.field3781);
                           var5.field435.method1691(var4[1]);
                           var5.field435.method1692(var0.field455.field2158);
                           var5.field435.method1712(var0.field455.field2277);
                           var5.field435.method1709(var0.field455.method1465());
                           var5.field435.method1692(var4[2]);
                           var5.field435.method1692(var4[0]);
                           field1181.method2254(var5);
                        }
                     }
               }
            }
         } else if (12 == var0.field455.field2160) {
            class173 var6 = var0.field455.method1483();
            if (null != var6 && var6.method703()) {
               switch (var0.field452) {
                  case 0:
                     field1355.method1826(var0.field455);
                     var6.method664(true);
                     var6.method739(var0.field453, var0.field454, field1264.method1385(82), field1264.method1385(81));
                     break;
                  case 1:
                     var6.method722(var0.field453, var0.field454);
               }
            }
         }

      }
   }

   static boolean method824() {
      return 0 != (field1119 & 4);
   }

   static boolean method832() {
      return (field1119 & 2) != 0;
   }

   static boolean method880(class443 var0) {
      if (0 == field1119) {
         return false;
      } else {
         boolean var2;
         if (class266.field1874 == var0) {
            var2 = 0 != (field1119 & 8);
            return var2;
         } else {
            var2 = method824();
            if (!var2) {
               boolean var3 = (field1119 & 1) != 0;
               var2 = var3 && var0.method2050();
            }

            return var2 || method832() && var0.method2053();
         }
      }
   }

   static final void method847(int var0, int var1, int var2, int var3) {
      field1241 = 0;
      int var5 = (class266.field1874.field3403 >> 7) + class36.field314;
      int var6 = class525.field4175 + (class266.field1874.field3374 >> 7);
      if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
         field1241 = 1;
      }

      if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
         field1241 = 1;
      }

      if (1 == field1241 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
         field1241 = 0;
      }

   }

   static final void method801(class433 var0, int var1) {
      method814(var0.field3403, var0.field3374, var1);
   }

   static final void method814(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = method787(var0, var1, class156.field980) - var2;
         var0 -= class90.field647;
         var4 -= class291.field1981;
         var1 -= class84.field572;
         int var5 = class480.field3795[class249.field1796];
         int var6 = class480.field3793[class249.field1796];
         int var7 = class480.field3795[class455.field3578];
         int var8 = class480.field3793[class455.field3578];
         int var9 = var0 * var8 + var1 * var7 >> 16;
         var1 = var1 * var8 - var7 * var0 >> 16;
         var0 = var9;
         var9 = var6 * var4 - var5 * var1 >> 16;
         var1 = var1 * var6 + var4 * var5 >> 16;
         if (var1 >= 50) {
            field1234 = var0 * field1401 / var1 + field1332 / 2;
            field1235 = field1401 * var9 / var1 + field1207 / 2;
         } else {
            field1234 = -1;
            field1235 = -1;
         }

      } else {
         field1234 = -1;
         field1235 = -1;
      }
   }

   static final int method787(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && 2 == (class513.field4100[1][var4][var5] & 2)) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = class513.field4098[var6][var4 + 1][var5] * var7 + (128 - var7) * class513.field4098[var6][var4][var5] >> 7;
         int var10 = (128 - var7) * class513.field4098[var6][var4][var5 + 1] + class513.field4098[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var10 * var8 + (128 - var8) * var9 >> 7;
      } else {
         return 0;
      }
   }

   static final void method889(boolean var0, class435 var1) {
      field1192 = var0;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (!field1192) {
         int var3 = var1.method1703();
         var4 = var1.method1683();
         var5 = var1.method1703();
         class425.field3317 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class425.field3317[var6][var7] = var1.method1658();
            }
         }

         class24.field253 = new int[var5];
         class274.field1924 = new int[var5];
         class301.field2047 = new int[var5];
         class476.field3769 = new byte[var5][];
         class135.field852 = new byte[var5][];
         var5 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               class24.field253[var5] = var8;
               class274.field1924[var5] = class258.field1852.method2447("m" + var6 + "_" + var7);
               class301.field2047[var5] = class258.field1852.method2447("l" + var6 + "_" + var7);
               ++var5;
            }
         }

         method900(var3, var4, true);
      } else {
         boolean var16 = var1.method1654() == 1;
         var4 = var1.method1703();
         var5 = var1.method1703();
         var6 = var1.method1703();
         var1.method2038();

         int var9;
         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method2036(1);
                  if (var10 == 1) {
                     field1193[var7][var8][var9] = var1.method2036(26);
                  } else {
                     field1193[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method2039();
         class425.field3317 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class425.field3317[var7][var8] = var1.method1658();
            }
         }

         class24.field253 = new int[var6];
         class274.field1924 = new int[var6];
         class301.field2047 = new int[var6];
         class476.field3769 = new byte[var6][];
         class135.field852 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = field1193[var7][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (class24.field253[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class24.field253[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class274.field1924[var6] = class258.field1852.method2447("m" + var14 + "_" + var15);
                        class301.field2047[var6] = class258.field1852.method2447("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         method900(var5, var4, !var16);
      }

   }

   static final void method900(int var0, int var1, boolean var2) {
      if (!var2 || class513.field4088 != var0 || class112.field725 != var1) {
         class513.field4088 = var0;
         class112.field725 = var1;
         method904(25);
         method925(class424.field3012, true);
         int var4 = class36.field314;
         int var5 = class525.field4175;
         class36.field314 = (var0 - 6) * 8;
         class525.field4175 = (var1 - 6) * 8;
         int var6 = class36.field314 - var4;
         int var7 = class525.field4175 - var5;
         var4 = class36.field314;
         var5 = class525.field4175;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 65536; ++var8) {
            class86 var9 = field1176[var8];
            if (var9 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var9.field3448;
                  var10000[var10] -= var6;
                  var10000 = var9.field3445;
                  var10000[var10] -= var7;
               }

               var9.field3403 -= var6 * 128;
               var9.field3374 -= var7 * 128;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            class443 var20 = field1289[var8];
            if (null != var20) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var20.field3448;
                  var10000[var10] -= var6;
                  var10000 = var20.field3445;
                  var10000[var10] -= var7;
               }

               var20.field3403 -= var6 * 128;
               var20.field3374 -= var7 * 128;
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
         for(int var14 = var19; var14 != var21; var14 += var22) {
            for(var15 = var11; var15 != var12; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var7 + var15;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     field1256[var18][var14][var15] = field1256[var18][var16][var17];
                  } else {
                     field1256[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class415 var23 = (class415)field1257.method1991(); null != var23; var23 = (class415)field1257.method1993()) {
            var23.field2923 -= var6;
            var23.field2929 -= var7;
            if (var23.field2923 < 0 || var23.field2929 < 0 || var23.field2923 >= 104 || var23.field2929 >= 104) {
               var23.method295();
            }
         }

         if (field1367 != 0) {
            field1367 -= var6;
            field1290 -= var7;
         }

         field1371 = 0;
         field1377 = false;
         class90.field647 -= var6 << 7;
         class84.field572 -= var7 << 7;
         class278.field1947 -= var6 << 7;
         class156.field982 -= var7 << 7;
         field1362 = -1;
         field1386.method1987();
         field1243.method1987();

         for(var15 = 0; var15 < 4; ++var15) {
            field1191[var15].method1754();
         }

      }
   }

   static final void method829(boolean var0) {
      method898();
      ++field1181.field3787;
      if (field1181.field3787 >= 50 || var0) {
         field1181.field3787 = 0;
         if (!field1183 && field1181.method2257() != null) {
            class53 var2 = class53.method226(class10.field119, field1181.field3781);
            field1181.method2254(var2);

            try {
               field1181.method2253();
            } catch (IOException var4) {
               field1183 = true;
            }
         }

      }
   }

   static final void method915() {
      method829(false);
      field1186 = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < class476.field3769.length; ++var2) {
         if (class274.field1924[var2] != -1 && class476.field3769[var2] == null) {
            class476.field3769[var2] = class258.field1852.method2422(class274.field1924[var2], 0);
            if (null == class476.field3769[var2]) {
               var1 = false;
               ++field1186;
            }
         }

         if (-1 != class301.field2047[var2] && class135.field852[var2] == null) {
            class135.field852[var2] = class258.field1852.method2423(class301.field2047[var2], 0, class425.field3317[var2]);
            if (null == class135.field852[var2]) {
               var1 = false;
               ++field1186;
            }
         }
      }

      if (!var1) {
         field1190 = 1;
      } else {
         field1188 = 0;
         var1 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < class476.field3769.length; ++var2) {
            byte[] var3 = class135.field852[var2];
            if (var3 != null) {
               var4 = (class24.field253[var2] >> 8) * 64 - class36.field314;
               var5 = 64 * (class24.field253[var2] & 255) - class525.field4175;
               if (field1192) {
                  var4 = 10;
                  var5 = 10;
               }

               var1 &= class513.method2463(var3, var4, var5);
            }
         }

         if (!var1) {
            field1190 = 2;
         } else {
            if (0 != field1190) {
               method925(class424.field3012 + class389.field2751 + class389.field2745 + 100 + "%" + class389.field2747, true);
            }

            method898();
            class137.field875.method1835();

            for(var2 = 0; var2 < 4; ++var2) {
               field1191[var2].method1754();
            }

            int var16;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var16 = 0; var16 < 104; ++var16) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     class513.field4100[var2][var16][var4] = 0;
                  }
               }
            }

            method898();
            class513.method2470();
            var2 = class476.field3769.length;
            class307.method1410();
            method829(true);
            int var18;
            if (!field1192) {
               byte[] var6;
               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = 64 * (class24.field253[var16] >> 8) - class36.field314;
                  var5 = 64 * (class24.field253[var16] & 255) - class525.field4175;
                  var6 = class476.field3769[var16];
                  if (null != var6) {
                     method898();
                     class513.method2466(var6, var4, var5, class513.field4088 * 8 - 48, class112.field725 * 8 - 48, field1191);
                  }
               }

               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = (class24.field253[var16] >> 8) * 64 - class36.field314;
                  var5 = (class24.field253[var16] & 255) * 64 - class525.field4175;
                  var6 = class476.field3769[var16];
                  if (null == var6 && class112.field725 < 800) {
                     method898();
                     class513.method2456(var4, var5, 64, 64);
                  }
               }

               method829(true);

               for(var16 = 0; var16 < var2; ++var16) {
                  byte[] var17 = class135.field852[var16];
                  if (var17 != null) {
                     var5 = (class24.field253[var16] >> 8) * 64 - class36.field314;
                     var18 = (class24.field253[var16] & 255) * 64 - class525.field4175;
                     method898();
                     class513.method2471(var17, var5, var18, class137.field875, field1191);
                  }
               }
            }

            int var7;
            int var8;
            int var9;
            if (field1192) {
               int var10;
               int var11;
               int var12;
               for(var16 = 0; var16 < 4; ++var16) {
                  method898();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var19 = false;
                        var7 = field1193[var16][var4][var5];
                        if (var7 != -1) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(int var13 = 0; var13 < class24.field253.length; ++var13) {
                              if (var12 == class24.field253[var13] && class476.field3769[var13] != null) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 class423.method1951(class476.field3769[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, field1191);
                                 var19 = true;
                                 break;
                              }
                           }
                        }

                        if (!var19) {
                           class513.method2469(var16, var4 * 8, var5 * 8);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < 13; ++var16) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = field1193[0][var16][var4];
                     if (var5 == -1) {
                        class513.method2456(var16 * 8, var4 * 8, 8, 8);
                     }
                  }
               }

               method829(true);

               for(var16 = 0; var16 < 4; ++var16) {
                  method898();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var18 = field1193[var16][var4][var5];
                        if (var18 != -1) {
                           var7 = var18 >> 24 & 3;
                           var8 = var18 >> 1 & 3;
                           var9 = var18 >> 14 & 1023;
                           var10 = var18 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class24.field253.length; ++var12) {
                              if (var11 == class24.field253[var12] && class135.field852[var12] != null) {
                                 class513.method2453(class135.field852[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, 8 * (var10 & 7), var8, class137.field875, field1191);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            method829(true);
            method898();
            class513.method2461(class137.field875, field1191);
            method829(true);
            var16 = class513.field4090;
            if (var16 > class156.field980) {
               var16 = class156.field980;
            }

            if (var16 < class156.field980 - 1) {
               var16 = class156.field980 - 1;
            }

            if (field1120) {
               class137.field875.method1836(class513.field4090);
            } else {
               class137.field875.method1836(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  method837(var4, var5);
               }
            }

            method898();
            method852();
            class458.field3624.method1180();
            class53 var20;
            if (class530.field4182.method2561()) {
               var20 = class53.method226(class10.field104, field1181.field3781);
               var20.field435.method1709(1057001181);
               field1181.method2254(var20);
            }

            if (!field1192) {
               var4 = (class513.field4088 - 6) / 8;
               var5 = (6 + class513.field4088) / 8;
               var18 = (class112.field725 - 6) / 8;
               var7 = (class112.field725 + 6) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                        class258.field1852.method2446("m" + var8 + "_" + var9);
                        class258.field1852.method2446("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            method904(30);
            method898();
            class513.method2457();
            var20 = class53.method226(class10.field125, field1181.field3781);
            field1181.method2254(var20);
            class535.method2571();
         }
      }
   }

   static final void method780(int var0) {
      int[] var2 = class434.field3450.field2031;
      int var3 = var2.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         var2[var4] = 0;
      }

      int var5;
      int var6;
      for(var4 = 1; var4 < 103; ++var4) {
         var5 = 2048 * (103 - var4) + 24628;

         for(var6 = 1; var6 < 103; ++var6) {
            if ((class513.field4100[var0][var6][var4] & 24) == 0) {
               class137.field875.method1858(var2, var5, 512, var0, var6, var4);
            }

            if (var0 < 3 && 0 != (class513.field4100[var0 + 1][var6][var4] & 8)) {
               class137.field875.method1858(var2, var5, 512, var0 + 1, var6, var4);
            }

            var5 += 4;
         }
      }

      var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
      var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
      class434.field3450.method1340();

      int var7;
      for(var6 = 1; var6 < 103; ++var6) {
         for(var7 = 1; var7 < 103; ++var7) {
            if (0 == (class513.field4100[var0][var7][var6] & 24)) {
               method811(var0, var7, var6, var4, var5);
            }

            if (var0 < 3 && (class513.field4100[var0 + 1][var7][var6] & 8) != 0) {
               method811(var0 + 1, var7, var6, var4, var5);
            }
         }
      }

      field1363 = 0;

      for(var6 = 0; var6 < 104; ++var6) {
         for(var7 = 0; var7 < 104; ++var7) {
            long var8 = class137.field875.method1885(class156.field980, var6, var7);
            if (0L != var8) {
               int var10 = class463.method2185(var8);
               int var11 = class430.method2004(var10, (byte)46).field3629;
               if (var11 >= 0 && class430.method2005(var11).field3352) {
                  field1374[field1363] = class430.method2005(var11).method2001(false);
                  field1364[field1363] = var6;
                  field1365[field1363] = var7;
                  ++field1363;
               }
            }
         }
      }

      class143.field899.method1445();
   }

   static final void method811(int var0, int var1, int var2, int var3, int var4) {
      long var6 = class137.field875.method1871(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var15;
      int var24;
      if (0L != var6) {
         var8 = class137.field875.method1853(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         boolean var13 = 0L != var6;
         if (var13) {
            boolean var14 = 1 == (int)(var6 >>> 16 & 1L);
            var13 = !var14;
         }

         if (var13) {
            var11 = var4;
         }

         int[] var23 = class434.field3450.field2031;
         var24 = (103 - var2) * 2048 + 24624 + var1 * 4;
         var15 = class463.method2185(var6);
         class458 var16 = class430.method2004(var15, (byte)8);
         if (var16.field3628 != -1) {
            class501 var17 = class290.field1980[var16.field3628];
            if (null != var17) {
               int var18 = (var16.field3610 * 4 - var17.field4005) / 2;
               int var19 = (var16.field3595 * 4 - var17.field4006) / 2;
               var17.method2394(var18 + var1 * 4 + 48, var19 + 48 + 4 * (104 - var2 - var16.field3595));
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

      var6 = class137.field875.method1852(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class137.field875.method1853(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class463.method2185(var6);
         class458 var12 = class430.method2004(var11, (byte)17);
         if (var12.field3628 != -1) {
            class501 var25 = class290.field1980[var12.field3628];
            if (null != var25) {
               var24 = (var12.field3610 * 4 - var25.field4005) / 2;
               var15 = (var12.field3595 * 4 - var25.field4006) / 2;
               var25.method2394(var24 + 48 + var1 * 4, var15 + 4 * (104 - var2 - var12.field3595) + 48);
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

            int[] var29 = class434.field3450.field2031;
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

      var6 = class137.field875.method1885(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class463.method2185(var6);
         class458 var20 = class430.method2004(var8, (byte)35);
         if (-1 != var20.field3628) {
            class501 var21 = class290.field1980[var20.field3628];
            if (var21 != null) {
               var11 = (var20.field3610 * 4 - var21.field4005) / 2;
               int var22 = (var20.field3595 * 4 - var21.field4006) / 2;
               var21.method2394(var11 + var1 * 4 + 48, 4 * (104 - var2 - var20.field3595) + 48 + var22);
            }
         }
      }

   }

   static final void method816(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class415 var11 = null;

      for(class415 var12 = (class415)field1257.method1991(); var12 != null; var12 = (class415)field1257.method1993()) {
         if (var12.field2930 == var0 && var12.field2923 == var1 && var12.field2929 == var2 && var3 == var12.field2916) {
            var11 = var12;
            break;
         }
      }

      if (null == var11) {
         var11 = new class415();
         var11.field2930 = var0;
         var11.field2916 = var3;
         var11.field2923 = var1;
         var11.field2929 = var2;
         var11.field2925 = -1;
         method830(var11);
         field1257.method1995(var11);
      }

      var11.field2922 = var4;
      var11.field2918 = var5;
      var11.field2924 = var6;
      var11.field2927 = var8;
      var11.field2928 = var9;
      var11.method1900(var7);
   }

   static final boolean method933(int var0, int var1, int var2, int var3, int var4) {
      class415 var6 = null;

      for(class415 var7 = (class415)field1257.method1991(); var7 != null; var7 = (class415)field1257.method1993()) {
         if (var0 == var7.field2930 && var1 == var7.field2923 && var2 == var7.field2929 && var3 == var7.field2916) {
            var6 = var7;
            break;
         }
      }

      if (null != var6) {
         var6.field2925 = var4;
         return true;
      } else {
         return false;
      }
   }

   static final void method852() {
      for(class415 var1 = (class415)field1257.method1991(); null != var1; var1 = (class415)field1257.method1993()) {
         if (-1 == var1.field2928) {
            var1.field2927 = 0;
            method830(var1);
         } else {
            var1.method295();
         }
      }

   }

   static final void method830(class415 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (var0.field2916 == 0) {
         var2 = class137.field875.method1871(var0.field2930, var0.field2923, var0.field2929);
      }

      if (1 == var0.field2916) {
         var2 = class137.field875.method1876(var0.field2930, var0.field2923, var0.field2929);
      }

      if (2 == var0.field2916) {
         var2 = class137.field875.method1852(var0.field2930, var0.field2923, var0.field2929);
      }

      if (3 == var0.field2916) {
         var2 = class137.field875.method1885(var0.field2930, var0.field2923, var0.field2929);
      }

      if (var2 != 0L) {
         int var7 = class137.field875.method1853(var0.field2930, var0.field2923, var0.field2929, var2);
         var4 = class463.method2185(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field2919 = var4;
      var0.field2921 = var5;
      var0.field2920 = var6;
   }

   static final void method932() {
      for(class415 var1 = (class415)field1257.method1991(); var1 != null; var1 = (class415)field1257.method1993()) {
         if (var1.field2928 > 0) {
            --var1.field2928;
         }

         boolean var2;
         int var3;
         int var4;
         class458 var5;
         if (var1.field2928 == 0) {
            if (var1.field2919 >= 0) {
               var3 = var1.field2919;
               var4 = var1.field2921;
               var5 = class430.method2004(var3, (byte)-69);
               if (var4 == 11) {
                  var4 = 10;
               }

               if (var4 >= 5 && var4 <= 8) {
                  var4 = 4;
               }

               var2 = var5.method2150(var4);
               if (!var2) {
                  continue;
               }
            }

            method937(var1.field2930, var1.field2916, var1.field2923, var1.field2929, var1.field2919, var1.field2920, var1.field2921, var1.field2925);
            var1.method295();
         } else {
            if (var1.field2927 > 0) {
               --var1.field2927;
            }

            if (0 == var1.field2927 && var1.field2923 >= 1 && var1.field2929 >= 1 && var1.field2923 <= 102 && var1.field2929 <= 102) {
               if (var1.field2922 >= 0) {
                  var3 = var1.field2922;
                  var4 = var1.field2918;
                  var5 = class430.method2004(var3, (byte)-10);
                  if (var4 == 11) {
                     var4 = 10;
                  }

                  if (var4 >= 5 && var4 <= 8) {
                     var4 = 4;
                  }

                  var2 = var5.method2150(var4);
                  if (!var2) {
                     continue;
                  }
               }

               method937(var1.field2930, var1.field2916, var1.field2923, var1.field2929, var1.field2922, var1.field2924, var1.field2918, var1.field2925);
               var1.field2927 = -1;
               if (var1.field2922 == var1.field2919 && -1 == var1.field2919) {
                  var1.method295();
               } else if (var1.field2922 == var1.field2919 && var1.field2924 == var1.field2920 && var1.field2921 == var1.field2918) {
                  var1.method295();
               }
            }
         }
      }

   }

   static final void method937(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (field1120 && var0 != class156.field980) {
            return;
         }

         long var9 = 0L;
         boolean var11 = true;
         boolean var12 = false;
         boolean var13 = false;
         if (var1 == 0) {
            var9 = class137.field875.method1871(var0, var2, var3);
         }

         if (var1 == 1) {
            var9 = class137.field875.method1876(var0, var2, var3);
         }

         if (var1 == 2) {
            var9 = class137.field875.method1852(var0, var2, var3);
         }

         if (var1 == 3) {
            var9 = class137.field875.method1885(var0, var2, var3);
         }

         int var14;
         if (var9 != 0L) {
            var14 = class137.field875.method1853(var0, var2, var3, var9);
            int var38 = class463.method2185(var9);
            int var39 = var14 & 31;
            int var40 = var14 >> 6 & 3;
            class458 var15;
            if (var1 == 0) {
               class137.field875.method1878(var0, var2, var3);
               var15 = class430.method2004(var38, (byte)10);
               if (var15.field3612 != 0) {
                  field1191[var0].method1751(var2, var3, var39, var40, var15.field3613);
               }
            }

            if (var1 == 1) {
               class137.field875.method1846(var0, var2, var3);
            }

            if (var1 == 2) {
               class137.field875.method1879(var0, var2, var3);
               var15 = class430.method2004(var38, (byte)26);
               if (var2 + var15.field3610 > 103 || var3 + var15.field3610 > 103 || var15.field3595 + var2 > 103 || var3 + var15.field3595 > 103) {
                  return;
               }

               if (0 != var15.field3612) {
                  field1191[var0].method1755(var2, var3, var15.field3610, var15.field3595, var40, var15.field3613);
               }
            }

            if (var1 == 3) {
               class137.field875.method1848(var0, var2, var3);
               var15 = class430.method2004(var38, (byte)17);
               if (1 == var15.field3612) {
                  field1191[var0].method1753(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var14 = var0;
            if (var0 < 3 && 2 == (class513.field4100[1][var2][var3] & 2)) {
               var14 = var0 + 1;
            }

            class408 var41 = class137.field875;
            class378 var16 = field1191[var0];
            class458 var17 = class430.method2004(var4, (byte)76);
            int var18 = var7 >= 0 ? var7 : var17.field3622;
            int var19;
            int var20;
            if (var5 != 1 && var5 != 3) {
               var19 = var17.field3610;
               var20 = var17.field3595;
            } else {
               var19 = var17.field3595;
               var20 = var17.field3610;
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

            int[][] var25 = class513.field4098[var14];
            int var26 = var25[var22][var23] + var25[var21][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
            int var27 = (var19 << 6) + (var2 << 7);
            int var28 = (var3 << 7) + (var20 << 6);
            long var29 = class463.method2187(var2, var3, 2, 0 == var17.field3619, var4);
            int var31 = (var5 << 6) + var6;
            if (var17.field3635 == 1) {
               var31 += 256;
            }

            Object var32;
            if (var6 == 22) {
               if (var18 == -1 && var17.field3636 == null) {
                  var32 = var17.method2154(22, var5, var25, var27, var26, var28);
               } else {
                  var32 = new class359(var4, 22, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
               }

               var41.method1840(var0, var2, var3, var26, (class165)var32, var29, var31);
               if (1 == var17.field3612) {
                  var16.method1750(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var18 == -1 && null == var17.field3636) {
                     var32 = var17.method2154(var6, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class359(var4, var6, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                  }

                  var41.method1842(var0, var2, var3, var26, 1, 1, (class165)var32, 0, var29, var31);
                  if (var17.field3612 != 0) {
                     var16.method1748(var2, var3, var19, var20, var17.field3613);
                  }
               } else if (var6 == 0) {
                  if (var18 == -1 && null == var17.field3636) {
                     var32 = var17.method2154(0, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class359(var4, 0, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                  }

                  var41.method1862(var0, var2, var3, var26, (class165)var32, (class165)null, class513.field4093[var5], 0, var29, var31);
                  if (0 != var17.field3612) {
                     var16.method1747(var2, var3, var6, var5, var17.field3613);
                  }
               } else if (var6 == 1) {
                  if (var18 == -1 && var17.field3636 == null) {
                     var32 = var17.method2154(1, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class359(var4, 1, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                  }

                  var41.method1862(var0, var2, var3, var26, (class165)var32, (class165)null, class513.field4094[var5], 0, var29, var31);
                  if (0 != var17.field3612) {
                     var16.method1747(var2, var3, var6, var5, var17.field3613);
                  }
               } else {
                  int var44;
                  if (var6 == 2) {
                     var44 = var5 + 1 & 3;
                     Object var33;
                     Object var34;
                     if (var18 == -1 && var17.field3636 == null) {
                        var33 = var17.method2154(2, var5 + 4, var25, var27, var26, var28);
                        var34 = var17.method2154(2, var44, var25, var27, var26, var28);
                     } else {
                        var33 = new class359(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field3627, (class165)null);
                        var34 = new class359(var4, 2, var44, var14, var2, var3, var18, var17.field3627, (class165)null);
                     }

                     var41.method1862(var0, var2, var3, var26, (class165)var33, (class165)var34, class513.field4093[var5], class513.field4093[var44], var29, var31);
                     if (var17.field3612 != 0) {
                        var16.method1747(var2, var3, var6, var5, var17.field3613);
                     }
                  } else if (var6 == 3) {
                     if (var18 == -1 && null == var17.field3636) {
                        var32 = var17.method2154(3, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class359(var4, 3, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                     }

                     var41.method1862(var0, var2, var3, var26, (class165)var32, (class165)null, class513.field4094[var5], 0, var29, var31);
                     if (0 != var17.field3612) {
                        var16.method1747(var2, var3, var6, var5, var17.field3613);
                     }
                  } else if (var6 == 9) {
                     if (var18 == -1 && var17.field3636 == null) {
                        var32 = var17.method2154(var6, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class359(var4, var6, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                     }

                     var41.method1842(var0, var2, var3, var26, 1, 1, (class165)var32, 0, var29, var31);
                     if (var17.field3612 != 0) {
                        var16.method1748(var2, var3, var19, var20, var17.field3613);
                     }
                  } else if (var6 == 4) {
                     if (var18 == -1 && null == var17.field3636) {
                        var32 = var17.method2154(4, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class359(var4, 4, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                     }

                     var41.method1877(var0, var2, var3, var26, (class165)var32, (class165)null, class513.field4093[var5], 0, 0, 0, var29, var31);
                  } else {
                     Object var35;
                     long var42;
                     if (var6 == 5) {
                        var44 = 16;
                        var42 = var41.method1871(var0, var2, var3);
                        if (var42 != 0L) {
                           var44 = class430.method2004(class463.method2185(var42), (byte)-62).field3616;
                        }

                        if (var18 == -1 && null == var17.field3636) {
                           var35 = var17.method2154(4, var5, var25, var27, var26, var28);
                        } else {
                           var35 = new class359(var4, 4, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
                        }

                        var41.method1877(var0, var2, var3, var26, (class165)var35, (class165)null, class513.field4093[var5], 0, class513.field4095[var5] * var44, var44 * class513.field4096[var5], var29, var31);
                     } else if (var6 == 6) {
                        var44 = 8;
                        var42 = var41.method1871(var0, var2, var3);
                        if (var42 != 0L) {
                           var44 = class430.method2004(class463.method2185(var42), (byte)-48).field3616 / 2;
                        }

                        if (var18 == -1 && var17.field3636 == null) {
                           var35 = var17.method2154(4, var5 + 4, var25, var27, var26, var28);
                        } else {
                           var35 = new class359(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field3627, (class165)null);
                        }

                        var41.method1877(var0, var2, var3, var26, (class165)var35, (class165)null, 256, var5, var44 * class513.field4101[var5], class513.field4099[var5] * var44, var29, var31);
                     } else if (var6 == 7) {
                        int var43 = var5 + 2 & 3;
                        if (var18 == -1 && var17.field3636 == null) {
                           var32 = var17.method2154(4, var43 + 4, var25, var27, var26, var28);
                        } else {
                           var32 = new class359(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field3627, (class165)null);
                        }

                        var41.method1877(var0, var2, var3, var26, (class165)var32, (class165)null, 256, var43, 0, 0, var29, var31);
                     } else if (var6 == 8) {
                        var44 = 8;
                        var42 = var41.method1871(var0, var2, var3);
                        if (0L != var42) {
                           var44 = class430.method2004(class463.method2185(var42), (byte)-82).field3616 / 2;
                        }

                        int var37 = var5 + 2 & 3;
                        Object var36;
                        if (var18 == -1 && var17.field3636 == null) {
                           var35 = var17.method2154(4, var5 + 4, var25, var27, var26, var28);
                           var36 = var17.method2154(4, var37 + 4, var25, var27, var26, var28);
                        } else {
                           var35 = new class359(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field3627, (class165)null);
                           var36 = new class359(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field3627, (class165)null);
                        }

                        var41.method1877(var0, var2, var3, var26, (class165)var35, (class165)var36, 256, var5, var44 * class513.field4101[var5], var44 * class513.field4099[var5], var29, var31);
                     }
                  }
               }
            } else {
               if (var18 == -1 && null == var17.field3636) {
                  var32 = var17.method2154(10, var5, var25, var27, var26, var28);
               } else {
                  var32 = new class359(var4, 10, var5, var14, var2, var3, var18, var17.field3627, (class165)null);
               }

               if (var32 != null) {
                  var41.method1842(var0, var2, var3, var26, var19, var20, (class165)var32, var6 == 11 ? 256 : 0, var29, var31);
               }

               if (0 != var17.field3612) {
                  var16.method1748(var2, var3, var19, var20, var17.field3613);
               }
            }
         }
      }

   }

   static final void method837(int var0, int var1) {
      class429 var3 = field1256[class156.field980][var0][var1];
      if (null == var3) {
         class137.field875.method1849(class156.field980, var0, var1);
      } else {
         long var4 = -99999999L;
         class18 var6 = null;

         class18 var7;
         for(var7 = (class18)var3.method1991(); var7 != null; var7 = (class18)var3.method1993()) {
            class47 var8 = class47.method213(var7.field207);
            long var9 = (long)var8.field376;
            if (var8.field375 == 1) {
               var9 *= var7.field208 < Integer.MAX_VALUE ? (long)(var7.field208 + 1) : (long)var7.field208;
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (var6 == null) {
            class137.field875.method1849(class156.field980, var0, var1);
         } else {
            var3.method1996(var6);
            class18 var12 = null;
            class18 var13 = null;

            for(var7 = (class18)var3.method1991(); var7 != null; var7 = (class18)var3.method1993()) {
               if (var7.field207 != var6.field207) {
                  if (var12 == null) {
                     var12 = var7;
                  }

                  if (var7.field207 != var12.field207 && null == var13) {
                     var13 = var7;
                  }
               }
            }

            long var10 = class463.method2187(var0, var1, 3, false, 0);
            class137.field875.method1841(class156.field980, var0, var1, method787(var0 * 128 + 64, 64 + var1 * 128, class156.field980), var6, var10, var12, var13);
         }
      }
   }

   static final void method883(boolean var0, class435 var1) {
      field1385 = 0;
      field1230 = 0;
      var1.method2038();
      int var3 = var1.method2036(8);
      int var4;
      if (var3 < field1177) {
         for(var4 = var3; var4 < field1177; ++var4) {
            field1142[++field1385 - 1] = field1115[var4];
         }
      }

      if (var3 > field1177) {
         throw new RuntimeException("");
      } else {
         field1177 = 0;

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = field1115[var4];
            class86 var6 = field1176[var5];
            int var7 = var1.method2036(1);
            if (var7 == 0) {
               field1115[++field1177 - 1] = var5;
               var6.field3438 = field1419;
            } else {
               int var8 = var1.method2036(2);
               if (var8 == 0) {
                  field1115[++field1177 - 1] = var5;
                  var6.field3438 = field1419;
                  field1327[++field1230 - 1] = var5;
               } else {
                  int var9;
                  int var10;
                  if (var8 == 1) {
                     field1115[++field1177 - 1] = var5;
                     var6.field3438 = field1419;
                     var9 = var1.method2036(3);
                     var6.method319(var9, class82.field561);
                     var10 = var1.method2036(1);
                     if (var10 == 1) {
                        field1327[++field1230 - 1] = var5;
                     }
                  } else if (var8 == 2) {
                     field1115[++field1177 - 1] = var5;
                     var6.field3438 = field1419;
                     if (var1.method2036(1) == 1) {
                        var9 = var1.method2036(3);
                        var6.method319(var9, class82.field558);
                        var10 = var1.method2036(3);
                        var6.method319(var10, class82.field558);
                     } else {
                        var9 = var1.method2036(3);
                        var6.method319(var9, class82.field557);
                     }

                     var9 = var1.method2036(1);
                     if (var9 == 1) {
                        field1327[++field1230 - 1] = var5;
                     }
                  } else if (var8 == 3) {
                     field1142[++field1385 - 1] = var5;
                  }
               }
            }
         }

         method908(var0, var1);
         method841(var1);

         for(var3 = 0; var3 < field1385; ++var3) {
            var4 = field1142[var3];
            if (field1176[var4].field3438 != field1419) {
               field1176[var4].field577 = null;
               field1176[var4] = null;
            }
         }

         if (var1.field2652 != field1181.field3784) {
            throw new RuntimeException(var1.field2652 + class389.field2749 + field1181.field3784);
         } else {
            for(var3 = 0; var3 < field1177; ++var3) {
               if (null == field1176[field1115[var3]]) {
                  throw new RuntimeException(var3 + class389.field2749 + field1177);
               }
            }

         }
      }
   }

   static final void method908(boolean var0, class435 var1) {
      while(true) {
         byte var3 = 16;
         int var4 = 1 << var3;
         if (var1.method2037(field1181.field3784) >= var3 + 12) {
            int var5 = var1.method2036(var3);
            if (var5 != var4 - 1) {
               boolean var6 = false;
               if (null == field1176[var5]) {
                  field1176[var5] = new class86();
                  var6 = true;
               }

               class86 var7 = field1176[var5];
               field1115[++field1177 - 1] = var5;
               var7.field3438 = field1419;
               int var9;
               if (var0) {
                  var9 = var1.method2036(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method2036(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               boolean var11 = var1.method2036(1) == 1;
               if (var11) {
                  var1.method2036(32);
               }

               int var8 = var1.method2036(1);
               int var12 = field1297[var1.method2036(3)];
               if (var6) {
                  var7.field3414 = var7.field3375 = var12;
               }

               var7.field577 = class90.method359(var1.method2036(14));
               int var13 = var1.method2036(1);
               if (var13 == 1) {
                  field1327[++field1230 - 1] = var5;
               }

               int var10;
               if (var0) {
                  var10 = var1.method2036(8);
                  if (var10 > 127) {
                     var10 -= 256;
                  }
               } else {
                  var10 = var1.method2036(5);
                  if (var10 > 15) {
                     var10 -= 32;
                  }
               }

               method873(var7);
               if (0 == var7.field3442) {
                  var7.field3375 = 0;
               }

               var7.method320(class266.field1874.field3448[0] + var9, class266.field1874.field3445[0] + var10, var8 == 1);
               continue;
            }
         }

         var1.method2039();
         return;
      }
   }

   static final void method841(class435 var0) {
      for(int var2 = 0; var2 < field1230; ++var2) {
         int var3 = field1327[var2];
         class86 var4 = field1176[var3];
         int var5 = var0.method1654();
         int var6;
         if (0 != (var5 & 8)) {
            var6 = var0.method1654();
            var5 += var6 << 8;
         }

         if ((var5 & 2048) != 0) {
            var6 = var0.method1654();
            var5 += var6 << 16;
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         if (0 != (var5 & 128)) {
            var6 = var0.method1714();
            int var12;
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var0.method1701();
                  if (var8 == 32767) {
                     var8 = var0.method1701();
                     var10 = var0.method1701();
                     var9 = var0.method1701();
                     var11 = var0.method1701();
                  } else if (var8 != 32766) {
                     var10 = var0.method1701();
                  } else {
                     var8 = -1;
                  }

                  var12 = var0.method1701();
                  var4.method2023(var8, var10, var9, var11, field1419, var12);
               }
            }

            var7 = var0.method1676();
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var0.method1701();
                  var10 = var0.method1701();
                  if (var10 != 32767) {
                     var11 = var0.method1701();
                     var12 = var0.method1714();
                     int var13 = var10 > 0 ? var0.method1714() : var12;
                     var4.method2019(var9, field1419, var10, var11, var12, var13);
                  } else {
                     var4.method2024(var9);
                  }
               }
            }
         }

         int[] var14;
         short[] var15;
         short[] var16;
         long var17;
         boolean var18;
         if (0 != (var5 & 512)) {
            var6 = var0.method1654();
            if ((var6 & 1) == 1) {
               var4.method326();
            } else {
               var14 = null;
               if (2 == (var6 & 2)) {
                  var8 = var0.method1675();
                  var14 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method1683();
                     var10 = var10 == 65535 ? -1 : var10;
                     var14[var9] = var10;
                  }
               }

               var15 = null;
               if (4 == (var6 & 4)) {
                  var9 = 0;
                  if (null != var4.field577.field635) {
                     var9 = var4.field577.field635.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method1682();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (null != var4.field577.field631) {
                     var10 = var4.field577.field631.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method1682();
                  }
               }

               var18 = false;
               if ((var6 & 16) != 0) {
                  var18 = var0.method1676() == 1;
               }

               var17 = (long)(++class86.field583 - 1);
               var4.method331(new class350(var17, var14, var15, var16, var18));
            }
         }

         if (0 != (var5 & 32)) {
            var6 = var0.method1682();
            var7 = var0.method1703();
            var4.field3413 = var0.method1714() == 1;
            if (field1298 >= 212) {
               var4.field3411 = var6;
               var4.field3412 = var7;
            } else {
               var8 = var4.field3403 - 64 * (var6 - class36.field314 - class36.field314);
               var9 = var4.field3374 - (var7 - class525.field4175 - class525.field4175) * 64;
               if (var8 != 0 || var9 != 0) {
                  var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167) & 2047;
                  var4.field3410 = var11;
               }
            }
         }

         if (0 != (var5 & 64)) {
            var6 = var0.method1703();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var0.method1676();
            if (var4.field3418 == var6 && var6 != -1) {
               var8 = class464.method2200(var6).field3689;
               if (var8 == 1) {
                  var4.field3419 = 0;
                  var4.field3420 = 0;
                  var4.field3435 = var7;
                  var4.field3400 = 0;
               }

               if (var8 == 2) {
                  var4.field3400 = 0;
               }
            } else if (var6 == -1 || -1 == var4.field3418 || class464.method2200(var6).field3682 >= class464.method2200(var4.field3418).field3682) {
               var4.field3418 = var6;
               var4.field3419 = 0;
               var4.field3420 = 0;
               var4.field3435 = var7;
               var4.field3400 = 0;
               var4.field3437 = var4.field3421;
            }
         }

         if ((var5 & 131072) != 0) {
            var6 = var0.method1714();

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var0.method1676();
               var9 = var0.method1683();
               var10 = var0.method1699();
               var4.method2020(var8, var9, var10 >> 16, var10 & '\uffff');
            }
         }

         if ((var5 & 4) != 0) {
            var4.field577 = class90.method359(var0.method1703());
            method873(var4);
            var4.method325();
         }

         if ((var5 & 16) != 0) {
            var4.field3408 = var0.method1681();
            var4.field3408 += var0.method1676() << 16;
            var6 = 16777215;
            if (var6 == var4.field3408) {
               var4.field3408 = -1;
            }
         }

         if (0 != (var5 & 4096)) {
            var4.field3425 = var0.method1678();
            var4.field3427 = var0.method1678();
            var4.field3423 = var0.method1677();
            var4.field3393 = var0.method1669();
            var4.field3429 = var0.method1681() + field1419;
            var4.field3430 = var0.method1703() + field1419;
            var4.field3431 = var0.method1683();
            var4.field3421 = 1;
            var4.field3437 = 0;
            var4.field3425 += var4.field3448[0];
            var4.field3427 += var4.field3445[0];
            var4.field3423 += var4.field3448[0];
            var4.field3393 += var4.field3445[0];
         }

         if (0 != (var5 & 65536)) {
            var6 = var0.method1694();
            var4.field3380 = (var6 & 1) != 0 ? var0.method1683() : 1686120851 * var4.field577.field621 * -1670226789;
            var4.field3441 = 0 != (var6 & 2) ? var0.method1682() : 821598169 * var4.field577.field622 * -1405323159;
            var4.field3382 = (var6 & 4) != 0 ? var0.method1681() : var4.field577.field637;
            var4.field3383 = 0 != (var6 & 8) ? var0.method1683() : 129510829 * var4.field577.field624 * 1271381541;
            var4.field3384 = 0 != (var6 & 16) ? var0.method1682() : -1909691015 * var4.field577.field625 * 799501513;
            var4.field3432 = (var6 & 32) != 0 ? var0.method1682() : var4.field577.field626;
            var4.field3443 = (var6 & 64) != 0 ? var0.method1683() : -1380991387 * var4.field577.field627 * -725499027;
            var4.field3387 = 0 != (var6 & 128) ? var0.method1683() : var4.field577.field628;
            var4.field3428 = (var6 & 256) != 0 ? var0.method1681() : var4.field577.field629;
            var4.field3389 = (var6 & 512) != 0 ? var0.method1683() : var4.field577.field654;
            var4.field3390 = 0 != (var6 & 1024) ? var0.method1681() : var4.field577.field623;
            var4.field3391 = 0 != (var6 & 2048) ? var0.method1683() : -2089336141 * var4.field577.field632 * -1708442501;
            var4.field3392 = (var6 & 4096) != 0 ? var0.method1681() : 2098030227 * var4.field577.field638 * -1815894117;
            var4.field3422 = 0 != (var6 & 8192) ? var0.method1682() : var4.field577.field655;
            var4.field3379 = 0 != (var6 & 16384) ? var0.method1681() : var4.field577.field620;
         }

         if (0 != (var5 & 262144)) {
            var6 = var0.method1654();
            var14 = new int[8];
            var15 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if (0 != (var6 & 1 << var9)) {
                  var14[var9] = var0.method1702();
                  var15[var9] = (short)var0.method1666();
               } else {
                  var14[var9] = -1;
                  var15[var9] = -1;
               }
            }

            var4.method324(var14, var15);
         }

         if ((var5 & '\u8000') != 0) {
            var4.method315(var0.method1662());
         }

         if (0 != (var5 & 2)) {
            var0.method1703();
            var0.method1658();
         }

         if ((var5 & 1) != 0) {
            var4.field3444 = var0.method1662();
            var4.field3397 = 100;
         }

         if ((var5 & 8192) != 0) {
            var4.field3434 = field1419 + var0.method1703();
            var4.field3376 = field1419 + var0.method1703();
            var4.field3436 = var0.method1677();
            var4.field3394 = var0.method1677();
            var4.field3388 = var0.method1677();
            var4.field3426 = (byte)var0.method1654();
         }

         if (0 != (var5 & 256)) {
            var6 = var0.method1675();
            if ((var6 & 1) == 1) {
               var4.method329();
            } else {
               var14 = null;
               if (2 == (var6 & 2)) {
                  var8 = var0.method1675();
                  var14 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method1682();
                     var10 = var10 == 65535 ? -1 : var10;
                     var14[var9] = var10;
                  }
               }

               var15 = null;
               if (4 == (var6 & 4)) {
                  var9 = 0;
                  if (var4.field577.field635 != null) {
                     var9 = var4.field577.field635.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method1682();
                  }
               }

               var16 = null;
               if (8 == (var6 & 8)) {
                  var10 = 0;
                  if (var4.field577.field631 != null) {
                     var10 = var4.field577.field631.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method1681();
                  }
               }

               var18 = false;
               if (0 != (var6 & 16)) {
                  var18 = var0.method1676() == 1;
               }

               var17 = (long)(++class86.field576 - 1);
               var4.method328(new class350(var17, var14, var15, var16, var18));
            }
         }

         if (0 != (var5 & 16384)) {
            var4.method316(var0.method1675());
         }

         if ((var5 & 1024) != 0) {
            var4.field3449 = var0.method1658();
         }
      }

   }

   static void method873(class86 var0) {
      var0.field3377 = var0.field577.field617;
      var0.field3442 = var0.field577.field646;
      var0.field3382 = var0.field577.field637;
      var0.field3383 = var0.field577.field624;
      var0.field3384 = var0.field577.field625;
      var0.field3432 = var0.field577.field626;
      var0.field3379 = var0.field577.field620;
      var0.field3380 = var0.field577.field621;
      var0.field3441 = var0.field577.field622;
      var0.field3443 = var0.field577.field627;
      var0.field3387 = var0.field577.field628;
      var0.field3428 = var0.field577.field629;
      var0.field3389 = var0.field577.field654;
      var0.field3390 = var0.field577.field623;
      var0.field3391 = var0.field577.field632;
      var0.field3392 = var0.field577.field638;
      var0.field3422 = var0.field577.field655;
   }

   static class308 method897(int var0, int var1) {
      field1416.field2089 = var0;
      field1416.field2088 = var1;
      field1416.field2090 = 1;
      field1416.field2091 = 1;
      return field1416;
   }

   static void method882() {
      field1265 = 0;
      field1229 = false;
   }

   static void method909() {
      method882();
      field1271[0] = class424.field3244;
      field1390[0] = "";
      field1309[0] = 1006;
      field1273[0] = false;
      field1265 = 1;
   }

   static final boolean method931() {
      return field1229;
   }

   static final void method779(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < field1287; ++var5) {
         if (field1343[var5] + field1341[var5] > var0 && field1341[var5] < var2 + var0 && field1344[var5] + field1342[var5] > var1 && field1342[var5] < var3 + var1) {
            field1339[var5] = true;
         }
      }

   }

   static final boolean method803(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var2 = field1309[var0];
         if (var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }

   static final void method929(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class86 var10;
      class53 var11;
      if (var2 == 9) {
         var10 = field1176[var3];
         if (null != var10) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field168, field1181.field3781);
            var11.field435.method1674(field1264.method1385(82) ? 1 : 0);
            var11.field435.method1706(var3);
            field1181.method2254(var11);
         }
      }

      if (var2 == 12) {
         var10 = field1176[var3];
         if (var10 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field138, field1181.field3781);
            var11.field435.method1674(field1264.method1385(82) ? 1 : 0);
            var11.field435.method1684(var3);
            field1181.method2254(var11);
         }
      }

      class443 var13;
      if (var2 == 45) {
         var13 = field1289[var3];
         if (null != var13) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field130, field1181.field3781);
            var11.field435.method1679(var3);
            var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 47) {
         var13 = field1289[var3];
         if (var13 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field145, field1181.field3781);
            var11.field435.method1706(var3);
            var11.field435.method1716(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      class322 var14;
      if (var2 == 57 || var2 == 1007) {
         var14 = class322.method1485(var1, var0);
         if (null != var14) {
            method798(var3, var1, var0, var4, var6);
         }
      }

      class53 var15;
      if (var2 == 19) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field129, field1181.field3781);
         var15.field435.method1684(var1 + class525.field4175);
         var15.field435.method1679(class36.field314 + var0);
         var15.field435.method1674(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1712(var3);
         field1181.method2254(var15);
      }

      if (var2 == 1) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field97, field1181.field3781);
         var15.field435.method1706(class175.field1428);
         var15.field435.method1709(class228.field1707);
         var15.field435.method1684(class456.field3591);
         var15.field435.method1679(var3);
         var15.field435.method1706(var1 + class525.field4175);
         var15.field435.method1706(class36.field314 + var0);
         var15.field435.method1643(field1264.method1385(82) ? 1 : 0);
         field1181.method2254(var15);
      }

      if (var2 == 13) {
         var10 = field1176[var3];
         if (var10 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field124, field1181.field3781);
            var11.field435.method1690(field1264.method1385(82) ? 1 : 0);
            var11.field435.method1712(var3);
            field1181.method2254(var11);
         }
      }

      if (var2 == 14) {
         var13 = field1289[var3];
         if (var13 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field90, field1181.field3781);
            var11.field435.method1663(class228.field1707);
            var11.field435.method1706(class175.field1428);
            var11.field435.method1706(class456.field3591);
            var11.field435.method1706(var3);
            var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 1002) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         var15 = class53.method226(class10.field143, field1181.field3781);
         var15.field435.method1679(var3);
         field1181.method2254(var15);
      }

      if (var2 == 10) {
         var10 = field1176[var3];
         if (null != var10) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field132, field1181.field3781);
            var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
            var11.field435.method1712(var3);
            field1181.method2254(var11);
         }
      }

      if (var2 == 1001) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field115, field1181.field3781);
         var15.field435.method1679(class525.field4175 + var1);
         var15.field435.method1712(class36.field314 + var0);
         var15.field435.method1643(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1706(var3);
         field1181.method2254(var15);
      }

      if (var2 == 26) {
         method886();
      }

      if (var2 == 8) {
         var10 = field1176[var3];
         if (null != var10) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field157, field1181.field3781);
            var11.field435.method1690(field1264.method1385(82) ? 1 : 0);
            var11.field435.method1706(var3);
            var11.field435.method1712(field1250);
            var11.field435.method1692(class451.field3573);
            var11.field435.method1679(field1284);
            field1181.method2254(var11);
         }
      }

      if (var2 == 18) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field107, field1181.field3781);
         var15.field435.method1706(var3);
         var15.field435.method1679(class36.field314 + var0);
         var15.field435.method1674(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1684(var1 + class525.field4175);
         field1181.method2254(var15);
      }

      if (var2 == 23) {
         if (field1229) {
            class137.field875.method1881();
         } else {
            class137.field875.method1860(class156.field980, var0, var1, true);
         }
      }

      class53 var12;
      if (var2 == 24) {
         var14 = class322.method1488(var1);
         if (var14 != null) {
            boolean var17 = true;
            if (var14.field2184 > 0) {
               var17 = class205.method1069(var14);
            }

            if (var17) {
               var12 = class53.method226(class10.field94, field1181.field3781);
               var12.field435.method1709(var1);
               field1181.method2254(var12);
            }
         }
      }

      if (var2 == 11) {
         var10 = field1176[var3];
         if (null != var10) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field160, field1181.field3781);
            var11.field435.method1679(var3);
            var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 49) {
         var13 = field1289[var3];
         if (null != var13) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field127, field1181.field3781);
            var11.field435.method1706(var3);
            var11.field435.method1690(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 16) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field133, field1181.field3781);
         var15.field435.method1679(class175.field1428);
         var15.field435.method1712(var3);
         var15.field435.method1643(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1706(class456.field3591);
         var15.field435.method1712(class36.field314 + var0);
         var15.field435.method1706(class525.field4175 + var1);
         var15.field435.method1691(class228.field1707);
         field1181.method2254(var15);
      }

      if (var2 == 2) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field141, field1181.field3781);
         var15.field435.method1679(var3);
         var15.field435.method1706(var0 + class36.field314);
         var15.field435.method1684(class525.field4175 + var1);
         var15.field435.method1679(field1284);
         var15.field435.method1690(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1679(field1250);
         var15.field435.method1663(class451.field3573);
         field1181.method2254(var15);
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
         class512.field4083.method469(var2, var3, new class113(var0), new class113(var1));
      }

      if (var2 == 6) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field152, field1181.field3781);
         var15.field435.method1643(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1706(var1 + class525.field4175);
         var15.field435.method1684(var3);
         var15.field435.method1712(class36.field314 + var0);
         field1181.method2254(var15);
      }

      if (var2 == 21) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field123, field1181.field3781);
         var15.field435.method1643(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1712(class36.field314 + var0);
         var15.field435.method1706(class525.field4175 + var1);
         var15.field435.method1712(var3);
         field1181.method2254(var15);
      }

      if (var2 == 30 && field1293 == null) {
         method935(var1, var0);
         field1293 = class322.method1485(var1, var0);
         method869(field1293);
      }

      if (var2 == 15) {
         var13 = field1289[var3];
         if (var13 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field137, field1181.field3781);
            var11.field435.method1679(field1284);
            var11.field435.method1712(field1250);
            var11.field435.method1692(class451.field3573);
            var11.field435.method1712(var3);
            var11.field435.method1674(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      int var16;
      class322 var18;
      if (var2 == 28) {
         var15 = class53.method226(class10.field94, field1181.field3781);
         var15.field435.method1709(var1);
         field1181.method2254(var15);
         var18 = class322.method1488(var1);
         if (null != var18 && null != var18.field2222 && 5 == var18.field2222[0][0]) {
            var16 = var18.field2222[0][1];
            class486.field3907[var16] = 1 - class486.field3907[var16];
            method891(var16);
         }
      }

      if (var2 == 48) {
         var13 = field1289[var3];
         if (null != var13) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field92, field1181.field3781);
            var11.field435.method1706(var3);
            var11.field435.method1690(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 4) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field82, field1181.field3781);
         var15.field435.method1684(class36.field314 + var0);
         var15.field435.method1684(class525.field4175 + var1);
         var15.field435.method1712(var3);
         var15.field435.method1716(field1264.method1385(82) ? 1 : 0);
         field1181.method2254(var15);
      }

      if (var2 == 29) {
         var15 = class53.method226(class10.field94, field1181.field3781);
         var15.field435.method1709(var1);
         field1181.method2254(var15);
         var18 = class322.method1488(var1);
         if (null != var18 && var18.field2222 != null && var18.field2222[0][0] == 5) {
            var16 = var18.field2222[0][1];
            if (var18.field2281[0] != class486.field3907[var16]) {
               class486.field3907[var16] = var18.field2281[0];
               method891(var16);
            }
         }
      }

      if (var2 == 1003) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         var10 = field1176[var3];
         if (null != var10) {
            class90 var19 = var10.field577;
            if (null != var19.field644) {
               var19 = var19.method349();
            }

            if (null != var19) {
               var12 = class53.method226(class10.field144, field1181.field3781);
               var12.field435.method1706(var19.field615);
               field1181.method2254(var12);
            }
         }
      }

      if (var2 == 44) {
         var13 = field1289[var3];
         if (null != var13) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field89, field1181.field3781);
            var11.field435.method1679(var3);
            var11.field435.method1690(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 1004) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         var15 = class53.method226(class10.field122, field1181.field3781);
         var15.field435.method1684(class36.field314 + var0);
         var15.field435.method1679(var3);
         var15.field435.method1712(class525.field4175 + var1);
         field1181.method2254(var15);
      }

      if (var2 == 46) {
         var13 = field1289[var3];
         if (var13 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field142, field1181.field3781);
            var11.field435.method1712(var3);
            var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 22) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field150, field1181.field3781);
         var15.field435.method1679(var0 + class36.field314);
         var15.field435.method1684(var1 + class525.field4175);
         var15.field435.method1674(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1684(var3);
         field1181.method2254(var15);
      }

      if (var2 == 58) {
         var14 = class322.method1485(var1, var0);
         if (var14 != null) {
            if (null != var14.field2262) {
               class64 var20 = new class64();
               var20.field504 = var14;
               var20.field509 = var3;
               var20.field513 = var6;
               var20.field507 = var14.field2262;
               class197.method1038(var20);
            }

            var11 = class53.method226(class10.field93, field1181.field3781);
            var11.field435.method1706(field1250);
            var11.field435.method1684(var0);
            var11.field435.method1679(field1284);
            var11.field435.method1684(var4);
            var11.field435.method1692(class451.field3573);
            var11.field435.method1691(var1);
            field1181.method2254(var11);
         }
      }

      if (var2 == 5) {
         field1236 = var7;
         field1237 = var8;
         field1353 = 2;
         field1295 = 0;
         field1367 = var0;
         field1290 = var1;
         var15 = class53.method226(class10.field118, field1181.field3781);
         var15.field435.method1684(var3);
         var15.field435.method1679(class36.field314 + var0);
         var15.field435.method1674(field1264.method1385(82) ? 1 : 0);
         var15.field435.method1684(class525.field4175 + var1);
         field1181.method2254(var15);
      }

      if (var2 == 50) {
         var13 = field1289[var3];
         if (var13 != null) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var11 = class53.method226(class10.field178, field1181.field3781);
            var11.field435.method1712(var3);
            var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
            field1181.method2254(var11);
         }
      }

      if (var2 == 25) {
         var14 = class322.method1485(var1, var0);
         if (null != var14) {
            class519.method2502();
            method903(var1, var0, class125.method474(method865(var14)), var4);
            field1281 = 0;
            field1299 = method895(var14);
            if (null == field1299) {
               field1299 = class424.field3311;
            }

            if (var14.field2238) {
               field1310 = var14.field2162 + class389.method1778(16777215);
            } else {
               field1310 = class389.method1778(65280) + var14.field2266 + class389.method1778(16777215);
            }
         }

      } else {
         if (var2 == 17) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var15 = class53.method226(class10.field171, field1181.field3781);
            var15.field435.method1712(var0 + class36.field314);
            var15.field435.method1674(field1264.method1385(82) ? 1 : 0);
            var15.field435.method1706(field1250);
            var15.field435.method1679(field1284);
            var15.field435.method1692(class451.field3573);
            var15.field435.method1706(var1 + class525.field4175);
            var15.field435.method1706(var3);
            field1181.method2254(var15);
         }

         if (var2 == 20) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var15 = class53.method226(class10.field113, field1181.field3781);
            var15.field435.method1712(var1 + class525.field4175);
            var15.field435.method1674(field1264.method1385(82) ? 1 : 0);
            var15.field435.method1679(var3);
            var15.field435.method1712(var0 + class36.field314);
            field1181.method2254(var15);
         }

         if (var2 == 3) {
            field1236 = var7;
            field1237 = var8;
            field1353 = 2;
            field1295 = 0;
            field1367 = var0;
            field1290 = var1;
            var15 = class53.method226(class10.field158, field1181.field3781);
            var15.field435.method1684(class36.field314 + var0);
            var15.field435.method1712(class525.field4175 + var1);
            var15.field435.method1643(field1264.method1385(82) ? 1 : 0);
            var15.field435.method1679(var3);
            field1181.method2254(var15);
         }

         if (var2 == 51) {
            var13 = field1289[var3];
            if (var13 != null) {
               field1236 = var7;
               field1237 = var8;
               field1353 = 2;
               field1295 = 0;
               field1367 = var0;
               field1290 = var1;
               var11 = class53.method226(class10.field174, field1181.field3781);
               var11.field435.method1643(field1264.method1385(82) ? 1 : 0);
               var11.field435.method1706(var3);
               field1181.method2254(var11);
            }
         }

         if (var2 == 7) {
            var10 = field1176[var3];
            if (null != var10) {
               field1236 = var7;
               field1237 = var8;
               field1353 = 2;
               field1295 = 0;
               field1367 = var0;
               field1290 = var1;
               var11 = class53.method226(class10.field148, field1181.field3781);
               var11.field435.method1712(class456.field3591);
               var11.field435.method1712(class175.field1428);
               var11.field435.method1663(class228.field1707);
               var11.field435.method1712(var3);
               var11.field435.method1674(field1264.method1385(82) ? 1 : 0);
               field1181.method2254(var11);
            }
         }

         if (field1281 != 0) {
            field1281 = 0;
            method869(class322.method1488(class228.field1707));
         }

         if (field1208) {
            class519.method2502();
         }

      }
   }

   static void method903(int var0, int var1, int var2, int var3) {
      class322 var5 = class322.method1485(var0, var1);
      if (var5 != null && null != var5.field2252) {
         class64 var6 = new class64();
         var6.field504 = var5;
         var6.field507 = var5.field2252;
         class197.method1038(var6);
      }

      field1250 = var3;
      field1208 = true;
      class451.field3573 = var0;
      field1284 = var1;
      class512.field4085 = var2;
      method869(var5);
   }

   static void method935(int var0, int var1) {
      class53 var3 = class53.method226(class10.field135, field1181.field3781);
      var3.field435.method1663(var0);
      var3.field435.method1712(var1);
      field1181.method2254(var3);
   }

   static void method798(int var0, int var1, int var2, int var3, String var4) {
      class322 var6 = class322.method1485(var1, var2);
      if (null != var6) {
         if (var6.field2261 != null) {
            class64 var7 = new class64();
            var7.field504 = var6;
            var7.field509 = var0;
            var7.field513 = var4;
            var7.field507 = var6.field2261;
            class197.method1038(var7);
         }

         boolean var12 = true;
         if (var6.field2184 > 0) {
            var12 = class205.method1069(var6);
         }

         if (var12) {
            int var9 = method865(var6);
            int var10 = var0 - 1;
            boolean var8 = (var9 >> var10 + 1 & 1) != 0;
            if (var8) {
               class53 var11;
               if (var0 == 1) {
                  var11 = class53.method226(class10.field105, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 2) {
                  var11 = class53.method226(class10.field95, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 3) {
                  var11 = class53.method226(class10.field147, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 4) {
                  var11 = class53.method226(class10.field112, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 5) {
                  var11 = class53.method226(class10.field128, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 6) {
                  var11 = class53.method226(class10.field84, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 7) {
                  var11 = class53.method226(class10.field126, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 8) {
                  var11 = class53.method226(class10.field80, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 9) {
                  var11 = class53.method226(class10.field155, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

               if (var0 == 10) {
                  var11 = class53.method226(class10.field111, field1181.field3781);
                  var11.field435.method1709(var1);
                  var11.field435.method1684(var2);
                  var11.field435.method1684(var3);
                  field1181.method2254(var11);
               }

            }
         }
      }
   }

   public static final void method918(String var0, String var1, int var2, int var3, int var4, int var5) {
      method823(var0, var1, var2, var3, var4, var5, -1, false);
   }

   static final void method823(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!field1229) {
         if (field1265 < 500) {
            field1271[field1265] = var0;
            field1390[field1265] = var1;
            field1309[field1265] = var2;
            field1269[field1265] = var3;
            field1266[field1265] = var4;
            field1267[field1265] = var5;
            field1270[field1265] = var6;
            field1273[field1265] = var7;
            ++field1265;
         }

      }
   }

   static String method855(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return field1390[var0].length() > 0 ? field1271[var0] + class424.field3049 + field1390[var0] : field1271[var0];
      }
   }

   static final void method839(int var0, int var1, int var2, int var3) {
      if (field1281 == 0 && !field1208) {
         method918(class424.field3170, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;
      int var9 = 0;

      while(true) {
         int var11 = class463.field3663;
         if (var9 >= var11) {
            if (var5 != -1L) {
               var9 = (int)(var5 >>> 0 & 127L);
               var11 = (int)(var5 >>> 7 & 127L);
               class443 var13 = field1289[field1255];
               method874(var13, field1255, var9, var11);
            }

            return;
         }

         long var12 = class463.method2186(var9);
         if (var7 != var12) {
            label306: {
               var7 = var12;
               int var14 = class463.method2180(var9);
               int var15 = class463.method2179(var9);
               int var16 = class463.method2184(class463.field3665[var9]);
               int var18 = class463.method2185(class463.field3665[var9]);
               int var19 = var18;
               int var23;
               int var24;
               if (var16 == 2 && class137.field875.method1853(class156.field980, var14, var15, var12) >= 0) {
                  class458 var20 = class430.method2004(var18, (byte)-22);
                  if (var20.field3636 != null) {
                     var20 = var20.method2155();
                  }

                  if (var20 == null) {
                     break label306;
                  }

                  class415 var21 = null;

                  for(class415 var22 = (class415)field1257.method1991(); null != var22; var22 = (class415)field1257.method1993()) {
                     if (class156.field980 == var22.field2930 && var22.field2923 == var14 && var22.field2929 == var15 && var22.field2922 == var19) {
                        var21 = var22;
                        break;
                     }
                  }

                  if (field1281 == 1) {
                     method918(class424.field3165, field1282 + " " + class389.field2750 + " " + class389.method1778(65535) + var20.field3605, 1, var19, var14, var15);
                  } else if (field1208) {
                     if (4 == (class512.field4085 & 4)) {
                        method918(field1299, field1310 + " " + class389.field2750 + " " + class389.method1778(65535) + var20.field3605, 2, var19, var14, var15);
                     }
                  } else {
                     String[] var30 = var20.field3614;
                     if (null != var30) {
                        for(var23 = 4; var23 >= 0; --var23) {
                           if ((var21 == null || var21.method1901(var23)) && null != var30[var23]) {
                              var24 = 0;
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

                              method918(var30[var23], class389.method1778(65535) + var20.field3605, var24, var19, var14, var15);
                           }
                        }
                     }

                     method918(class424.field3166, class389.method1778(65535) + var20.field3605, 1002, var20.field3602, var14, var15);
                  }
               }

               int var29;
               class86 var31;
               int[] var32;
               class443 var36;
               if (var16 == 1) {
                  class86 var26 = field1176[var19];
                  if (var26 == null) {
                     break label306;
                  }

                  if (1 == var26.field577.field617 && 64 == (var26.field3403 & 127) && (var26.field3374 & 127) == 64) {
                     for(var29 = 0; var29 < field1177; ++var29) {
                        var31 = field1176[field1115[var29]];
                        if (null != var31 && var26 != var31 && 1 == var31.field577.field617 && var26.field3403 == var31.field3403 && var31.field3374 == var26.field3374) {
                           method887(var31, field1115[var29], var14, var15);
                        }
                     }

                     var29 = class470.field3728;
                     var32 = class470.field3729;

                     for(var23 = 0; var23 < var29; ++var23) {
                        var36 = field1289[var32[var23]];
                        if (var36 != null && var26.field3403 == var36.field3403 && var36.field3374 == var26.field3374) {
                           method874(var36, var32[var23], var14, var15);
                        }
                     }
                  }

                  method887(var26, var19, var14, var15);
               }

               if (var16 == 0) {
                  class443 var27 = field1289[var19];
                  if (var27 == null) {
                     break label306;
                  }

                  if (64 == (var27.field3403 & 127) && (var27.field3374 & 127) == 64) {
                     for(var29 = 0; var29 < field1177; ++var29) {
                        var31 = field1176[field1115[var29]];
                        if (null != var31 && 1 == var31.field577.field617 && var31.field3403 == var27.field3403 && var31.field3374 == var27.field3374) {
                           method887(var31, field1115[var29], var14, var15);
                        }
                     }

                     var29 = class470.field3728;
                     var32 = class470.field3729;

                     for(var23 = 0; var23 < var29; ++var23) {
                        var36 = field1289[var32[var23]];
                        if (var36 != null && var27 != var36 && var27.field3403 == var36.field3403 && var36.field3374 == var27.field3374) {
                           method874(var36, var32[var23], var14, var15);
                        }
                     }
                  }

                  if (field1255 != var19) {
                     method874(var27, var19, var14, var15);
                  } else {
                     var5 = var12;
                  }
               }

               if (var16 == 3) {
                  class429 var28 = field1256[class156.field980][var14][var15];
                  if (null != var28) {
                     for(class18 var33 = (class18)var28.method1992(); null != var33; var33 = (class18)var28.method1997()) {
                        class47 var34 = class47.method213(var33.field207);
                        if (field1281 == 1) {
                           method918(class424.field3165, field1282 + " " + class389.field2750 + " " + class389.method1778(16748608) + var34.field380, 16, var33.field207, var14, var15);
                        } else if (field1208) {
                           if ((class512.field4085 & 1) == 1) {
                              method918(field1299, field1310 + " " + class389.field2750 + " " + class389.method1778(16748608) + var34.field380, 17, var33.field207, var14, var15);
                           }
                        } else {
                           String[] var35 = var34.field381;

                           for(var24 = 4; var24 >= 0; --var24) {
                              if (var33.method104(var24)) {
                                 if (var35 != null && var35[var24] != null) {
                                    byte var25 = 0;
                                    if (var24 == 0) {
                                       var25 = 18;
                                    }

                                    if (var24 == 1) {
                                       var25 = 19;
                                    }

                                    if (var24 == 2) {
                                       var25 = 20;
                                    }

                                    if (var24 == 3) {
                                       var25 = 21;
                                    }

                                    if (var24 == 4) {
                                       var25 = 22;
                                    }

                                    method918(var35[var24], class389.method1778(16748608) + var34.field380, var25, var33.field207, var14, var15);
                                 } else if (var24 == 2) {
                                    method918(class424.field3164, class389.method1778(16748608) + var34.field380, 20, var33.field207, var14, var15);
                                 }
                              }
                           }

                           method918(class424.field3166, class389.method1778(16748608) + var34.field380, 1004, var33.field207, var14, var15);
                        }
                     }
                  }
               }
            }
         }

         ++var9;
      }
   }

   static final void method887(class86 var0, int var1, int var2, int var3) {
      class90 var5 = var0.field577;
      if (field1265 < 400) {
         if (null != var5.field644) {
            var5 = var5.method349();
         }

         if (var5 != null) {
            if (var5.field650) {
               if (!var5.field652 || var1 == field1151) {
                  String var6 = var0.method318();
                  int var7;
                  if (0 != var5.field640 && 0 != var0.field3449) {
                     var7 = -1 != var0.field3449 ? var0.field3449 : var5.field640;
                     var6 = var6 + class151.method575(var7, class266.field1874.field3499) + " " + class389.field2745 + class424.field3011 + var7 + class389.field2747;
                  }

                  if (var5.field652 && field1274) {
                     method918(class424.field3166, class389.method1778(16776960) + var6, 1003, var1, var2, var3);
                  }

                  if (field1281 == 1) {
                     method918(class424.field3165, field1282 + " " + class389.field2750 + " " + class389.method1778(16776960) + var6, 7, var1, var2, var3);
                  } else if (field1208) {
                     if (2 == (class512.field4085 & 2)) {
                        method918(field1299, field1310 + " " + class389.field2750 + " " + class389.method1778(16776960) + var6, 8, var1, var2, var3);
                     }
                  } else {
                     var7 = var5.field652 && field1274 ? 2000 : 0;
                     String[] var8 = var5.field614;
                     int var9;
                     int var10;
                     if (var8 != null) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method317(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class424.field3167)) {
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

                              method918(var8[var9], class389.method1778(16776960) + var6, var10, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method317(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class424.field3167)) {
                              short var11 = 0;
                              if (class143.field896 != field1146) {
                                 if (class143.field895 == field1146 || field1146 == class143.field900 && var5.field640 > class266.field1874.field3499) {
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

                                 method918(var8[var9], class389.method1778(16776960) + var6, var10, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var5.field652 || !field1274) {
                        method918(class424.field3166, class389.method1778(16776960) + var6, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   static final void method874(class443 var0, int var1, int var2, int var3) {
      if (class266.field1874 != var0) {
         if (field1265 < 400) {
            String var5;
            if (var0.field3507 == 0) {
               var5 = var0.field3497[0] + var0.field3510 + var0.field3497[1] + class151.method575(var0.field3499, class266.field1874.field3499) + " " + class389.field2745 + class424.field3011 + var0.field3499 + class389.field2747 + var0.field3497[2];
            } else {
               var5 = var0.field3497[0] + var0.field3510 + var0.field3497[1] + " " + class389.field2745 + class424.field3175 + var0.field3507 + class389.field2747 + var0.field3497[2];
            }

            int var6;
            if (1 == field1281) {
               method918(class424.field3165, field1282 + " " + class389.field2750 + " " + class389.method1778(16777215) + var5, 14, var1, var2, var3);
            } else if (field1208) {
               if ((class512.field4085 & 8) == 8) {
                  method918(field1299, field1310 + " " + class389.field2750 + " " + class389.method1778(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var6 = 7; var6 >= 0; --var6) {
                  if (null != field1139[var6]) {
                     short var7 = 0;
                     if (field1139[var6].equalsIgnoreCase(class424.field3167)) {
                        if (class143.field896 == field1145) {
                           continue;
                        }

                        if (class143.field895 == field1145 || field1145 == class143.field900 && var0.field3499 > class266.field1874.field3499) {
                           var7 = 2000;
                        }

                        if (0 != class266.field1874.field3520 && var0.field3520 != 0) {
                           if (class266.field1874.field3520 == var0.field3520) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        } else if (field1145 == class143.field897 && var0.method2059()) {
                           var7 = 2000;
                        }
                     } else if (field1253[var6]) {
                        var7 = 2000;
                     }

                     boolean var8 = false;
                     int var9 = var7 + field1251[var6];
                     method918(field1139[var6], class389.method1778(16777215) + var5, var9, var1, var2, var3);
                  }
               }
            }

            for(var6 = 0; var6 < field1265; ++var6) {
               if (field1309[var6] == 23) {
                  field1390[var6] = class389.method1778(16777215) + var5;
                  break;
               }
            }

         }
      }
   }

   static final void method795(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class322.method1492(var0)) {
         class262.field1862 = null;
         method838(class53.field436[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != class262.field1862) {
            method838(class262.field1862, -1412584499, var1, var2, var3, var4, class527.field4177, class259.field1855, var7);
            class262.field1862 = null;
         }

      } else {
         if (var7 != -1) {
            field1126[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               field1126[var9] = true;
            }
         }

      }
   }

   static final void method838(class322[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class427.method1975(var2, var3, var4, var5);
      class480.method2271();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class322 var11 = var0[var10];
         if (null != var11 && (var11.field2175 == var1 || var1 == -1412584499 && field1300 == var11)) {
            int var12;
            if (var8 == -1) {
               field1341[field1287] = var11.field2159 + var6;
               field1342[field1287] = var7 + var11.field2172;
               field1343[field1287] = var11.field2173;
               field1344[field1287] = var11.field2150;
               var12 = ++field1287 - 1;
            } else {
               var12 = var8;
            }

            var11.field2297 = var12;
            var11.field2298 = field1419;
            if (!var11.field2238 || !method842(var11)) {
               if (var11.field2184 > 0) {
                  method862(var11);
               }

               int var13 = var11.field2159 + var6;
               int var14 = var11.field2172 + var7;
               int var15 = var11.field2179;
               int var16;
               int var17;
               if (var11 == field1300) {
                  if (var1 != -1412584499 && !var11.field2239) {
                     class262.field1862 = var0;
                     class527.field4177 = var6;
                     class259.field1855 = var7;
                     continue;
                  }

                  if (field1311 && field1305) {
                     var16 = class496.field3977;
                     var17 = class496.field3960;
                     var16 -= field1302;
                     var17 -= field1375;
                     if (var16 < field1306) {
                        var16 = field1306;
                     }

                     if (var16 + var11.field2173 > field1306 + field1319.field2173) {
                        var16 = field1319.field2173 + field1306 - var11.field2173;
                     }

                     if (var17 < field1307) {
                        var17 = field1307;
                     }

                     if (var17 + var11.field2150 > field1307 + field1319.field2150) {
                        var17 = field1307 + field1319.field2150 - var11.field2150;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field2239) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (9 == var11.field2160) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var11.field2173 + var13;
                  var23 = var14 + var11.field2150;
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
                  var20 = var13 + var11.field2173;
                  var21 = var14 + var11.field2150;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field2238 || var16 < var18 && var17 < var19) {
                  if (0 != var11.field2184) {
                     if (1336 == var11.field2184) {
                        if (class158.field1004.method519()) {
                           var14 += 15;
                           class502.field4012.method1921("Fps:" + class535.field4247, var13 + var11.field2173, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var45 = Runtime.getRuntime();
                           var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !field1120) {
                              var22 = 16711680;
                           }

                           class502.field4012.method1921("Mem:" + var21 + "k", var11.field2173 + var13, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (1337 == var11.field2184) {
                        field1277 = var13;
                        field1278 = var14;
                        method844(var13, var14, var11.field2173, var11.field2150);
                        field1126[var11.field2297] = true;
                        class427.method1975(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2184 == 1338) {
                        method788(var11, var13, var14, var12);
                        class427.method1975(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field2184 == 1339) {
                        method782(var11, var13, var14, var12);
                        class427.method1975(var2, var3, var4, var5);
                        continue;
                     }

                     if (1400 == var11.field2184) {
                        class512.field4083.method468(var13, var14, var11.field2173, var11.field2150, field1419);
                     }

                     if (1401 == var11.field2184) {
                        class512.field4083.method458(var13, var14, var11.field2173, var11.field2150);
                     }

                     if (1402 == var11.field2184) {
                        class84.field566.method2072(var13, field1419);
                     }
                  }

                  if (0 == var11.field2160) {
                     if (!var11.field2238 && method842(var11) && class207.field1596 != var11) {
                        continue;
                     }

                     if (!var11.field2238) {
                        if (var11.field2191 > var11.field2180 - var11.field2150) {
                           var11.field2191 = var11.field2180 - var11.field2150;
                        }

                        if (var11.field2191 < 0) {
                           var11.field2191 = 0;
                        }
                     }

                     method838(var0, var11.field2158, var16, var17, var18, var19, var13 - var11.field2177, var14 - var11.field2191, var12);
                     if (null != var11.field2290) {
                        method838(var11.field2290, var11.field2158, var16, var17, var18, var19, var13 - var11.field2177, var14 - var11.field2191, var12);
                     }

                     class127 var29 = (class127)field1137.method1431((long)var11.field2158);
                     if (null != var29) {
                        method795(var29.field803, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class427.method1975(var2, var3, var4, var5);
                     class480.method2271();
                  } else if (11 == var11.field2160) {
                     if (method842(var11) && var11 != class207.field1596) {
                        continue;
                     }

                     if (var11.field2290 != null) {
                        method838(var11.field2290, var11.field2158, var16, var17, var18, var19, var13 - var11.field2177, var14 - var11.field2191, var12);
                     }

                     class427.method1975(var2, var3, var4, var5);
                     class480.method2271();
                  }

                  if (field1347 || field1340[var12] || field1345 > 1) {
                     if (var11.field2160 == 0 && !var11.field2238 && var11.field2180 > var11.field2150) {
                        method854(var13 + var11.field2173, var14, var11.field2191, var11.field2150, var11.field2180);
                     }

                     if (var11.field2160 != 1) {
                        if (var11.field2160 == 3) {
                           if (method792(var11)) {
                              var20 = var11.field2182;
                              if (var11 == class207.field1596 && var11.field2228 != 0) {
                                 var20 = var11.field2228;
                              }
                           } else {
                              var20 = var11.field2181;
                              if (class207.field1596 == var11 && 0 != var11.field2185) {
                                 var20 = var11.field2185;
                              }
                           }

                           if (var11.field2220) {
                              switch (var11.field2186.field3543) {
                                 case 1:
                                    class427.method1969(var13, var14, var11.field2173, var11.field2150, var11.field2181, var11.field2182);
                                    break;
                                 case 2:
                                    class427.method1982(var13, var14, var11.field2173, var11.field2150, var11.field2181, var11.field2182, 255 - (var11.field2179 & 255), 255 - (var11.field2188 & 255));
                                    break;
                                 default:
                                    if (var15 == 0) {
                                       class427.method1968(var13, var14, var11.field2173, var11.field2150, var20);
                                    } else {
                                       class427.method1967(var13, var14, var11.field2173, var11.field2150, var20, 256 - (var15 & 255));
                                    }
                              }
                           } else if (var15 == 0) {
                              class427.method1971(var13, var14, var11.field2173, var11.field2150, var20);
                           } else {
                              class427.method1972(var13, var14, var11.field2173, var11.field2150, var20, 256 - (var15 & 255));
                           }
                        } else if (4 == var11.field2160) {
                           class396 var37 = var11.method1453();
                           if (var37 == null) {
                              if (class322.field2157) {
                                 method869(var11);
                              }
                           } else {
                              String var44 = var11.field2218;
                              if (method792(var11)) {
                                 var21 = var11.field2182;
                                 if (var11 == class207.field1596 && 0 != var11.field2228) {
                                    var21 = var11.field2228;
                                 }

                                 if (var11.field2146.length() > 0) {
                                    var44 = var11.field2146;
                                 }
                              } else {
                                 var21 = var11.field2181;
                                 if (class207.field1596 == var11 && var11.field2185 != 0) {
                                    var21 = var11.field2185;
                                 }
                              }

                              if (var11.field2238 && var11.field2286 != -1) {
                                 class47 var46 = class47.method213(var11.field2286);
                                 var44 = var46.field380;
                                 if (null == var44) {
                                    var44 = class424.field3311;
                                 }

                                 if ((var46.field375 == 1 || var11.field2287 != 1) && -1 != var11.field2287) {
                                    var44 = class389.method1778(16748608) + var44 + class389.field2752 + " " + 'x' + method885(var11.field2287);
                                 }
                              }

                              if (field1293 == var11) {
                                 var44 = class424.field3273;
                                 var21 = var11.field2181;
                              }

                              if (!var11.field2238) {
                                 var44 = method892(var44, var11);
                              }

                              var37.method1923(var44, var13, var14, var11.field2173, var11.field2150, var21, var11.field2148 ? 0 : -1, class56.method239(var11.field2179), var11.field2221, var11.field2279, var11.field2254);
                           }
                        } else {
                           int var25;
                           int var26;
                           int var41;
                           if (5 == var11.field2160) {
                              class296 var35;
                              if (!var11.field2238) {
                                 var35 = var11.method1474(method792(var11), class234.field1727);
                                 if (null != var35) {
                                    var35.method1366(var13, var14);
                                 } else if (class322.field2157) {
                                    method869(var11);
                                 }
                              } else {
                                 if (-1 != var11.field2286) {
                                    var35 = class47.method211(var11.field2286, var11.field2287, var11.field2196, var11.field2197, var11.field2217, false);
                                 } else {
                                    var35 = var11.method1474(false, class234.field1727);
                                 }

                                 if (var35 == null) {
                                    if (class322.field2157) {
                                       method869(var11);
                                    }
                                 } else {
                                    var21 = var35.field2029;
                                    var22 = var35.field2030;
                                    if (!var11.field2195) {
                                       var23 = var11.field2173 * 4096 / var21;
                                       if (var11.field2194 != 0) {
                                          var35.method1360(var11.field2173 / 2 + var13, var11.field2150 / 2 + var14, var11.field2194, var23);
                                       } else if (var15 != 0) {
                                          var35.method1354(var13, var14, var11.field2173, var11.field2150, 256 - (var15 & 255));
                                       } else if (var11.field2173 == var21 && var22 == var11.field2150) {
                                          var35.method1366(var13, var14);
                                       } else {
                                          var35.method1368(var13, var14, var11.field2173, var11.field2150);
                                       }
                                    } else {
                                       class427.method1981(var13, var14, var11.field2173 + var13, var14 + var11.field2150);
                                       var23 = (var11.field2173 + (var21 - 1)) / var21;
                                       var41 = (var22 - 1 + var11.field2150) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var41; ++var26) {
                                             if (var11.field2194 != 0) {
                                                var35.method1360(var21 * var25 + var13 + var21 / 2, var14 + var22 * var26 + var22 / 2, var11.field2194, 4096);
                                             } else if (var15 != 0) {
                                                var35.method1364(var21 * var25 + var13, var14 + var22 * var26, 256 - (var15 & 255));
                                             } else {
                                                var35.method1366(var21 * var25 + var13, var14 + var22 * var26);
                                             }
                                          }
                                       }

                                       class427.method1975(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              int var27;
                              if (6 == var11.field2160) {
                                 boolean var33 = method792(var11);
                                 if (var33) {
                                    var21 = var11.field2278;
                                 } else {
                                    var21 = var11.field2204;
                                 }

                                 class485 var36 = null;
                                 var23 = 0;
                                 if (var11.field2286 != -1) {
                                    class47 var38 = class47.method213(var11.field2286);
                                    if (null != var38) {
                                       var38 = var38.method199(var11.field2287);
                                       var36 = var38.method198(1);
                                       if (null != var36) {
                                          var36.method2293();
                                          var23 = var36.field1058 / 2;
                                       } else {
                                          method869(var11);
                                       }
                                    }
                                 } else if (5 == var11.field2200) {
                                    if (var11.field2201 == 0) {
                                       var36 = field1402.method1082((class464)null, -1, (class464)null, -1);
                                    } else {
                                       var36 = class266.field1874.method632();
                                    }
                                 } else if (7 == var11.field2200) {
                                    var36 = var11.field2214.method1082((class464)null, -1, class464.method2200(class266.field1874.field3379), class266.field1874.field3373);
                                 } else {
                                    class90 var39 = null;
                                    class350 var40 = null;
                                    if (var11.field2200 == 6) {
                                       var26 = var11.field2201;
                                       if (var26 >= 0 && var26 < field1176.length) {
                                          class86 var43 = field1176[var26];
                                          if (null != var43) {
                                             var39 = var43.field577;
                                             var40 = var43.method327();
                                          }
                                       }
                                    }

                                    class464 var42 = null;
                                    var27 = -1;
                                    if (var21 != -1) {
                                       var42 = class464.method2200(var21);
                                       var27 = var11.field2288;
                                    }

                                    var36 = var11.method1454(var42, var27, var33, class266.field1874.field3494, var39, var40);
                                    if (var36 == null && class322.field2157) {
                                       method869(var11);
                                    }
                                 }

                                 class480.method2282(var11.field2173 / 2 + var13, var11.field2150 / 2 + var14);
                                 var41 = var11.field2211 * class480.field3795[var11.field2208] >> 16;
                                 var25 = class480.field3793[var11.field2208] * var11.field2211 >> 16;
                                 if (null != var36) {
                                    if (!var11.field2238) {
                                       var36.method2299(0, var11.field2226, 0, var11.field2208, 0, var41, var25);
                                    } else {
                                       var36.method2293();
                                       if (var11.field2231) {
                                          var36.method2307(0, var11.field2226, var11.field2273, var11.field2208, var11.field2206, var11.field2280 + var41 + var23, var11.field2280 + var25, var11.field2211);
                                       } else {
                                          var36.method2299(0, var11.field2226, var11.field2273, var11.field2208, var11.field2206, var11.field2280 + var41 + var23, var25 + var11.field2280);
                                       }
                                    }
                                 }

                                 class480.method2273();
                              } else {
                                 class396 var31;
                                 if (8 == var11.field2160 && class405.field2812 == var11 && field1280 == field1279) {
                                    var20 = 0;
                                    var21 = 0;
                                    var31 = class502.field4012;
                                    String var34 = var11.field2218;

                                    String var24;
                                    for(var34 = method892(var34, var11); var34.length() > 0; var21 += var31.field2946 + 1) {
                                       var25 = var34.indexOf(class389.field2751);
                                       if (var25 != -1) {
                                          var24 = var34.substring(0, var25);
                                          var34 = var34.substring(var25 + 4);
                                       } else {
                                          var24 = var34;
                                          var34 = "";
                                       }

                                       var26 = var31.method1915(var24);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.field2173 - 5 - var20;
                                    var26 = var14 + var11.field2150 + 5;
                                    if (var25 < var13 + 5) {
                                       var25 = var13 + 5;
                                    }

                                    if (var20 + var25 > var4) {
                                       var25 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class427.method1968(var25, var26, var20, var21, 16777120);
                                    class427.method1971(var25, var26, var20, var21, 0);
                                    var34 = var11.field2218;
                                    var27 = var26 + var31.field2946 + 2;

                                    for(var34 = method892(var34, var11); var34.length() > 0; var27 += var31.field2946 + 1) {
                                       int var28 = var34.indexOf(class389.field2751);
                                       if (var28 != -1) {
                                          var24 = var34.substring(0, var28);
                                          var34 = var34.substring(var28 + 4);
                                       } else {
                                          var24 = var34;
                                          var34 = "";
                                       }

                                       var31.method1943(var24, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (var11.field2160 == 9) {
                                    if (var11.field2190) {
                                       var20 = var13;
                                       var21 = var11.field2150 + var14;
                                       var22 = var11.field2173 + var13;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var13 + var11.field2173;
                                       var23 = var11.field2150 + var14;
                                    }

                                    if (1 == var11.field2189) {
                                       class427.method1970(var20, var21, var22, var23, var11.field2181);
                                    } else {
                                       method916(var20, var21, var22, var23, var11.field2181, var11.field2189);
                                    }
                                 } else if (var11.field2160 == 12) {
                                    class173 var30 = var11.method1483();
                                    class326 var32 = var11.method1469();
                                    if (null != var30 && null != var32 && var30.method706()) {
                                       var31 = var11.method1453();
                                       if (var31 != null) {
                                          field1330.method80(var13, var14, var11.field2173, var11.field2150, var30.method707(), var30.method732(), var30.method704(), var30.method705(), var30.method725());
                                          var23 = var11.field2148 ? var11.field2197 : -1;
                                          if (!var30.method702() && var30.method726().method2383()) {
                                             field1330.method81(var32.field2436, var23, var32.field2434, var32.field2435);
                                             field1330.method82(var30.method700(), var31, (byte)-101);
                                          } else {
                                             field1330.method81(var11.field2181, var23, var32.field2434, var32.field2435);
                                             field1330.method82(var30.method726(), var31, (byte)-117);
                                          }

                                          class427.method1975(var2, var3, var4, var5);
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

   static final void method916(int var0, int var1, int var2, int var3, int var4, int var5) {
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
         var0 -= class427.field3336;
         var1 -= class427.field3337;
         int var18 = var0 + var14;
         int var19 = var0 - var15;
         int var20 = var7 + var0 - var15;
         int var21 = var14 + var0 + var7;
         int var22 = var1 + var16;
         int var23 = var1 - var17;
         int var24 = var1 + var8 - var17;
         int var25 = var16 + var8 + var1;
         class480.method2274(var18, var19, var20);
         class480.method2284(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
         class480.method2274(var18, var20, var21);
         class480.method2284(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
      }
   }

   static String method892(String var0, class322 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               var0 = var0.substring(0, var4) + class27.method124(method828(var1, var3 - 1)) + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }

   static final String method885(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class389.field2749 + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class389.method1778(65408) + var2.substring(0, var2.length() - 8) + class424.field3070 + " " + class389.field2745 + var2 + class389.field2747 + class389.field2752;
      } else {
         return var2.length() > 6 ? " " + class389.method1778(16777215) + var2.substring(0, var2.length() - 4) + class424.field3178 + " " + class389.field2745 + var2 + class389.field2747 + class389.field2752 : " " + class389.method1778(16776960) + var2 + class389.field2752;
      }
   }

   static void method808(class322[] var0, class322 var1, boolean var2) {
      int var4 = var1.field2245 != 0 ? var1.field2245 : var1.field2173;
      int var5 = var1.field2180 != 0 ? var1.field2180 : var1.field2150;
      method789(var0, var1.field2158, var4, var5, var2);
      if (null != var1.field2290) {
         method789(var1.field2290, var1.field2158, var4, var5, var2);
      }

      class127 var6 = (class127)field1137.method1431((long)var1.field2158);
      if (var6 != null) {
         int var7 = var6.field803;
         if (class322.method1492(var7)) {
            method789(class53.field436[var7], -1, var4, var5, var2);
         }
      }

      if (1337 == var1.field2184) {
      }

   }

   static void method789(class322[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class322 var7 = var0[var6];
         if (null != var7 && var7.field2175 == var1) {
            method914(var7, var2, var3, var4);
            method879(var7, var2, var3);
            if (var7.field2177 > var7.field2245 - var7.field2173) {
               var7.field2177 = var7.field2245 - var7.field2173;
            }

            if (var7.field2177 < 0) {
               var7.field2177 = 0;
            }

            if (var7.field2191 > var7.field2180 - var7.field2150) {
               var7.field2191 = var7.field2180 - var7.field2150;
            }

            if (var7.field2191 < 0) {
               var7.field2191 = 0;
            }

            if (0 == var7.field2160) {
               method808(var0, var7, var4);
            }
         }
      }

   }

   static void method914(class322 var0, int var1, int var2, boolean var3) {
      int var5 = var0.field2173;
      int var6 = var0.field2150;
      if (var0.field2165 == 0) {
         var0.field2173 = var0.field2169;
      } else if (var0.field2165 == 1) {
         var0.field2173 = var1 - var0.field2169;
      } else if (var0.field2165 == 2) {
         var0.field2173 = var1 * var0.field2169 >> 14;
      }

      if (0 == var0.field2166) {
         var0.field2150 = var0.field2170;
      } else if (1 == var0.field2166) {
         var0.field2150 = var2 - var0.field2170;
      } else if (var0.field2166 == 2) {
         var0.field2150 = var2 * var0.field2170 >> 14;
      }

      if (var0.field2165 == 4) {
         var0.field2173 = var0.field2274 * var0.field2150 / var0.field2174;
      }

      if (var0.field2166 == 4) {
         var0.field2150 = var0.field2173 * var0.field2174 / var0.field2274;
      }

      if (var0.field2184 == 1337) {
         field1409 = var0;
      }

      if (var0.field2160 == 12) {
         var0.method1483().method668(var0.field2173, var0.field2150);
      }

      if (var3 && var0.field2152 != null && (var5 != var0.field2173 || var6 != var0.field2150)) {
         class64 var7 = new class64();
         var7.field504 = var0;
         var7.field507 = var0.field2152;
         field1331.method1995(var7);
      }

   }

   static void method879(class322 var0, int var1, int var2) {
      if (var0.field2163 == 0) {
         var0.field2159 = var0.field2167;
      } else if (1 == var0.field2163) {
         var0.field2159 = (var1 - var0.field2173) / 2 + var0.field2167;
      } else if (var0.field2163 == 2) {
         var0.field2159 = var1 - var0.field2173 - var0.field2167;
      } else if (var0.field2163 == 3) {
         var0.field2159 = var0.field2167 * var1 >> 14;
      } else if (var0.field2163 == 4) {
         var0.field2159 = (var1 * var0.field2167 >> 14) + (var1 - var0.field2173) / 2;
      } else {
         var0.field2159 = var1 - var0.field2173 - (var1 * var0.field2167 >> 14);
      }

      if (var0.field2164 == 0) {
         var0.field2172 = var0.field2168;
      } else if (1 == var0.field2164) {
         var0.field2172 = var0.field2168 + (var2 - var0.field2150) / 2;
      } else if (2 == var0.field2164) {
         var0.field2172 = var2 - var0.field2150 - var0.field2168;
      } else if (var0.field2164 == 3) {
         var0.field2172 = var0.field2168 * var2 >> 14;
      } else if (var0.field2164 == 4) {
         var0.field2172 = (var0.field2168 * var2 >> 14) + (var2 - var0.field2150) / 2;
      } else {
         var0.field2172 = var2 - var0.field2150 - (var2 * var0.field2168 >> 14);
      }

   }

   static final void method923(class322 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (field1201) {
         field1320 = 32;
      } else {
         field1320 = 0;
      }

      field1201 = false;
      int var8;
      if (1 == class496.field3967 || !class301.field2050 && 4 == class496.field3967) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2191 -= 4;
            method869(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
            var0.field2191 += 4;
            method869(var0);
         } else if (var5 >= var1 - field1320 && var5 < field1320 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field2191 = var9 * (var4 - var3) / var10;
            method869(var0);
            field1201 = true;
         }
      }

      if (0 != field1329) {
         var8 = var0.field2173;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2191 += field1329 * 45;
            method869(var0);
         }
      }

   }

   static final void method854(int var0, int var1, int var2, int var3, int var4) {
      class241.field1763[0].method2394(var0, var1);
      class241.field1763[1].method2394(var0, var1 + var3 - 16);
      class427.method1968(var0, var1 + 16, 16, var3 - 32, field1197);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
      class427.method1968(var0, var1 + 16 + var7, 16, var6, field1308);
      class427.method1974(var0, var7 + var1 + 16, var6, field1387);
      class427.method1974(var0 + 1, var1 + 16 + var7, var6, field1387);
      class427.method1979(var0, var1 + 16 + var7, 16, field1387);
      class427.method1979(var0, var1 + 17 + var7, 16, field1387);
      class427.method1974(var0 + 15, var1 + 16 + var7, var6, field1199);
      class427.method1974(var0 + 14, var7 + var1 + 17, var6 - 1, field1199);
      class427.method1979(var0, var6 + var1 + 15 + var7, 16, field1199);
      class427.method1979(var0 + 1, var7 + var1 + 14 + var6, 15, field1199);
   }

   static final boolean method792(class322 var0) {
      if (null == var0.field2293) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field2293.length; ++var2) {
            int var3 = method828(var0, var2);
            int var4 = var0.field2281[var2];
            if (2 == var0.field2293[var2]) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (3 == var0.field2293[var2]) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (4 == var0.field2293[var2]) {
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

   static final int method828(class322 var0, int var1) {
      if (var0.field2222 != null && var1 < var0.field2222.length) {
         try {
            int[] var3 = var0.field2222[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = field1260[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = field1408[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = field1411[var3[var5++]];
               }

               int var10;
               class322 var11;
               int var12;
               int var13;
               if (var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class322.method1488(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class47.method213(var12).field368 || field1143)) {
                     for(var13 = 0; var13 < var11.field2284.length; ++var13) {
                        if (var11.field2284[var13] == var12 + 1) {
                           var8 += var11.field2285[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = class486.field3907[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class472.field3745[field1408[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class486.field3907[var3[var5++]] * 100 / '\ub71b';
               }

               if (var7 == 8) {
                  var8 = class266.field1874.field3499;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class472.field3743[var10]) {
                        var8 += field1408[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class322.method1488(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class47.method213(var12).field368 || field1143)) {
                     for(var13 = 0; var13 < var11.field2284.length; ++var13) {
                        if (var11.field2284[var13] == var12 + 1) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = field1233;
               }

               if (var7 == 12) {
                  var8 = field1403;
               }

               if (var7 == 13) {
                  var10 = class486.field3907[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = 0 != (var10 & 1 << var15) ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class486.method2324(var10);
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
                  var8 = class36.field314 + (class266.field1874.field3403 >> 7);
               }

               if (var7 == 19) {
                  var8 = class525.field4175 + (class266.field1874.field3374 >> 7);
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

   static final void method846(class322 var0) {
      String var2;
      int var3;
      int var4;
      if (1 == var0.field2161) {
         var2 = var0.field2209;
         var3 = var0.field2158;
         var4 = var0.field2286;
         method823(var2, "", 24, 0, 0, var3, var4, false);
      }

      int var5;
      String var12;
      if (2 == var0.field2161 && !field1208) {
         var2 = method895(var0);
         if (var2 != null) {
            var12 = class389.method1778(65280) + var0.field2266;
            var4 = var0.field2158;
            var5 = var0.field2286;
            method823(var2, var12, 25, 0, -1, var4, var5, false);
         }
      }

      if (var0.field2161 == 3) {
         method918(class424.field3246, "", 26, 0, 0, var0.field2158);
      }

      if (var0.field2161 == 4) {
         method918(var0.field2209, "", 28, 0, 0, var0.field2158);
      }

      if (5 == var0.field2161) {
         method918(var0.field2209, "", 29, 0, 0, var0.field2158);
      }

      if (6 == var0.field2161 && field1293 == null) {
         method918(var0.field2209, "", 30, 0, -1, var0.field2158);
      }

      if (var0.field2238) {
         int var6;
         int var7;
         int var8;
         String var13;
         String var15;
         if (field1208) {
            var3 = method865(var0);
            boolean var10 = (var3 >> 21 & 1) != 0;
            if (var10 && 32 == (class512.field4085 & 32)) {
               var13 = field1299;
               var15 = field1310 + " " + class389.field2750 + " " + var0.field2162;
               var6 = var0.field2277;
               var7 = var0.field2158;
               var8 = var0.field2286;
               method823(var13, var15, 58, 0, var6, var7, var8, false);
            }
         } else {
            for(int var11 = 9; var11 >= 5; --var11) {
               var5 = method865(var0);
               boolean var14 = (var5 >> var11 + 1 & 1) != 0;
               if (!var14 && null == var0.field2261) {
                  var12 = null;
               } else if (null != var0.field2236 && var0.field2236.length > var11 && null != var0.field2236[var11] && var0.field2236[var11].trim().length() != 0) {
                  var12 = var0.field2236[var11];
               } else {
                  var12 = null;
               }

               if (null != var12) {
                  var15 = var0.field2162;
                  var6 = var11 + 1;
                  var7 = var0.field2277;
                  var8 = var0.field2158;
                  int var9 = var0.field2286;
                  method823(var12, var15, 1007, var6, var7, var8, var9, false);
               }
            }

            var2 = method895(var0);
            if (var2 != null) {
               var12 = var0.field2162;
               var4 = var0.field2277;
               var5 = var0.field2158;
               var6 = var0.field2286;
               method823(var2, var12, 25, 0, var4, var5, var6, false);
            }

            for(var3 = 4; var3 >= 0; --var3) {
               var6 = method865(var0);
               boolean var17 = (var6 >> var3 + 1 & 1) != 0;
               if (!var17 && var0.field2261 == null) {
                  var13 = null;
               } else if (null != var0.field2236 && var0.field2236.length > var3 && null != var0.field2236[var3] && var0.field2236[var3].trim().length() != 0) {
                  var13 = var0.field2236[var3];
               } else {
                  var13 = null;
               }

               if (var13 != null) {
                  method823(var13, var0.field2162, 57, var3 + 1, var0.field2277, var0.field2158, var0.field2286, var0.field2302);
               }
            }

            var4 = method865(var0);
            boolean var16 = 0 != (var4 & 1);
            if (var16) {
               method918(class424.field3007, "", 30, 0, var0.field2277, var0.field2158);
            }
         }
      }

   }

   static void method783(boolean var0) {
      field1249 = var0;
   }

   static boolean method797() {
      return field1249;
   }

   static final void method809(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class322.method1492(var0)) {
         class299.method1378(class53.field436[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }

   static boolean method922(int var0) {
      for(int var2 = 0; var2 < field1356; ++var2) {
         if (field1358[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   static final void method919(int var0, int var1) {
      if (class322.method1492(var0)) {
         method876(class53.field436[var0], var1);
      }
   }

   static final void method876(class322[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class322 var4 = var0[var3];
         if (var4 != null) {
            if (0 == var4.field2160) {
               if (var4.field2290 != null) {
                  method876(var4.field2290, var1);
               }

               class127 var5 = (class127)field1137.method1431((long)var4.field2158);
               if (var5 != null) {
                  method919(var5.field803, var1);
               }
            }

            class64 var6;
            if (var1 == 0 && null != var4.field2205) {
               var6 = new class64();
               var6.field504 = var4;
               var6.field507 = var4.field2205;
               class197.method1038(var6);
            }

            if (var1 == 1 && var4.field2237 != null) {
               if (var4.field2277 >= 0) {
                  class322 var7 = class322.method1488(var4.field2158);
                  if (var7 == null || var7.field2290 == null || var4.field2277 >= var7.field2290.length || var7.field2290[var4.field2277] != var4) {
                     continue;
                  }
               }

               var6 = new class64();
               var6.field504 = var4;
               var6.field507 = var4.field2237;
               class197.method1038(var6);
            }
         }
      }

   }

   static final void method872(class322 var0, int var1, int var2) {
      if (null == field1300 && !field1229) {
         if (null != var0 && method877(var0) != null) {
            field1300 = var0;
            field1319 = method877(var0);
            field1302 = var1;
            field1375 = var2;
            class124.field797 = 0;
            field1311 = false;
            int var4 = field1265 - 1;
            if (var4 != -1) {
               class299.field2043 = new class474();
               class299.field2043.field3759 = field1266[var4];
               class299.field2043.field3762 = field1267[var4];
               class299.field2043.field3760 = field1309[var4];
               class299.field2043.field3761 = field1269[var4];
               class299.field2043.field3758 = field1270[var4];
               class299.field2043.field3763 = field1271[var4];
               class299.field2043.field3764 = field1390[var4];
            }

         }
      }
   }

   static void method776(int var0, int var1) {
      class474 var3 = class299.field2043;
      if (null != var3) {
         method929(var3.field3759, var3.field3762, var3.field3760, var3.field3761, var3.field3758, var3.field3763, var3.field3764, var0, var1);
      }

      class299.field2043 = null;
   }

   public static void method869(class322 var0) {
      if (null != var0 && field1337 == var0.field2298) {
         field1126[var0.field2297] = true;
      }

   }

   static void method835() {
      for(class127 var1 = (class127)field1137.method1432(); var1 != null; var1 = (class127)field1137.method1433()) {
         int var2 = var1.field803;
         if (class322.method1492(var2)) {
            boolean var3 = true;
            class322[] var4 = class53.field436[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (null != var4[var5]) {
                  var3 = var4[var5].field2238;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field531;
               class322 var6 = class322.method1488(var5);
               if (var6 != null) {
                  method869(var6);
               }
            }
         }
      }

   }

   static class322 method877(class322 var0) {
      class322 var2 = method827(var0);
      if (null == var2) {
         var2 = var0.field2257;
      }

      return var2;
   }

   static final void method778(int var0) {
      if (class322.method1492(var0)) {
         class322[] var2 = class53.field436[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class322 var4 = var2[var3];
            if (null != var4) {
               var4.field2288 = 0;
               var4.field2289 = 0;
            }
         }

      }
   }

   static final void method901(int var0) {
      if (class322.method1492(var0)) {
         method849(class53.field436[var0], -1);
      }
   }

   static final void method849(class322[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class322 var4 = var0[var3];
         if (null != var4 && var1 == var4.field2175 && (!var4.field2238 || !method842(var4))) {
            int var6;
            if (var4.field2160 == 0) {
               if (!var4.field2238 && method842(var4) && class207.field1596 != var4) {
                  continue;
               }

               method849(var0, var4.field2158);
               if (var4.field2290 != null) {
                  method849(var4.field2290, var4.field2158);
               }

               class127 var5 = (class127)field1137.method1431((long)var4.field2158);
               if (null != var5) {
                  var6 = var5.field803;
                  if (class322.method1492(var6)) {
                     method849(class53.field436[var6], -1);
                  }
               }
            }

            if (6 == var4.field2160) {
               if (var4.field2204 != -1 || -1 != var4.field2278) {
                  boolean var9 = method792(var4);
                  if (var9) {
                     var6 = var4.field2278;
                  } else {
                     var6 = var4.field2204;
                  }

                  if (var6 != -1) {
                     class464 var7 = class464.method2200(var6);
                     if (!var7.method2199()) {
                        for(var4.field2289 += field1195; var4.field2289 > var7.field3685[var4.field2288]; method869(var4)) {
                           var4.field2289 -= var7.field3685[var4.field2288];
                           ++var4.field2288;
                           if (var4.field2288 >= var7.field3674.length) {
                              var4.field2288 -= var7.field3678;
                              if (var4.field2288 < 0 || var4.field2288 >= var7.field3674.length) {
                                 var4.field2288 = 0;
                              }
                           }
                        }
                     } else {
                        var4.field2288 += field1195;
                        int var8 = var7.method2196();
                        if (var4.field2288 >= var8) {
                           var4.field2288 -= var7.field3678;
                           if (var4.field2288 < 0 || var4.field2288 >= var8) {
                              var4.field2288 = 0;
                           }
                        }

                        method869(var4);
                     }
                  }
               }

               if (0 != var4.field2249 && !var4.field2238) {
                  int var10 = var4.field2249 >> 16;
                  var6 = var4.field2249 << 16 >> 16;
                  var10 *= field1195;
                  var6 *= field1195;
                  var4.field2208 = var4.field2208 + var10 & 2047;
                  var4.field2226 = var6 + var4.field2226 & 2047;
                  method869(var4);
               }
            }
         }
      }

   }

   static final void method785(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var2 = 0.5F + (float)var0 / 200.0F;
      method815((double)var2);
   }

   static final int method910() {
      float var1 = 200.0F * ((float)class158.field1004.method531() - 0.5F);
      return 100 - Math.round(var1);
   }

   static final void method815(double var0) {
      class480.method2261(var0);
      ((class477)class480.field3797.field4112).method2250(var0);
      class47.method212();
      class158.field1004.method533(var0);
   }

   static final void method890(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class158.field1004.method510()) {
         label35: {
            if (class158.field1004.method510() == 0) {
               boolean var2 = !class469.field3717.isEmpty();
               if (var2) {
                  class534 var3 = class339.field2531;
                  if (!class469.field3717.isEmpty()) {
                     ArrayList var4 = new ArrayList();
                     Iterator var5 = class469.field3717.iterator();

                     while(var5.hasNext()) {
                        class468 var6 = (class468)var5.next();
                        var6.field3706 = false;
                        var6.field3704 = false;
                        var6.field3710 = false;
                        var6.field3707 = false;
                        var6.field3702 = var3;
                        var6.field3701 = var0;
                        var6.field3698 = 0.0F;
                        var4.add(var6);
                     }

                     class469.method2206(var4, class469.field3720, class469.field3721, class469.field3722, class469.field3713, false);
                  }

                  field1388 = false;
                  break label35;
               }
            }

            if (var0 == 0) {
               class283.method1299(0, 0);
               field1388 = false;
            } else {
               class15.method95(var0, (byte)57);
            }
         }

         class158.field1004.method516(var0);
      }

   }

   static final void method920(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class158.field1004.method517(var0);
   }

   static final void method784(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class158.field1004.method537(var0);
   }

   static final void method891(int var0) {
      method835();

      for(class307 var2 = (class307)class307.field2073.method1991(); var2 != null; var2 = (class307)class307.field2073.method1993()) {
         if (var2.field2083 != null) {
            var2.method1407();
         }
      }

      int var4 = class412.method1897(var0).field699;
      if (var4 != 0) {
         int var3 = class486.field3907[var0];
         if (var4 == 1) {
            if (var3 == 1) {
               class480.method2261(0.9);
               ((class477)class480.field3797.field4112).method2250(0.9);
               class47.method212();
               class158.field1004.method533(0.9);
            }

            if (var3 == 2) {
               class480.method2261(0.8);
               ((class477)class480.field3797.field4112).method2250(0.8);
               class47.method212();
               class158.field1004.method533(0.8);
            }

            if (var3 == 3) {
               method815(0.7);
            }

            if (var3 == 4) {
               method815(0.6);
            }
         }

         if (var4 == 3) {
            if (var3 == 0) {
               method890(255);
            }

            if (var3 == 1) {
               method890(192);
            }

            if (var3 == 2) {
               method890(128);
            }

            if (var3 == 3) {
               method890(64);
            }

            if (var3 == 4) {
               method890(0);
            }
         }

         if (var4 == 4) {
            if (var3 == 0) {
               method920(127);
            }

            if (var3 == 1) {
               method920(96);
            }

            if (var3 == 2) {
               method920(64);
            }

            if (var3 == 3) {
               method920(32);
            }

            if (var3 == 4) {
               method920(0);
            }
         }

         if (var4 == 5) {
            field1263 = var3 == 1;
         }

         if (var4 == 6) {
            field1292 = var3;
         }

         if (var4 == 9) {
         }

         if (var4 == 10) {
            if (var3 == 0) {
               method784(127);
            }

            if (var3 == 1) {
               method784(96);
            }

            if (var3 == 2) {
               method784(64);
            }

            if (var3 == 3) {
               method784(32);
            }

            if (var3 == 4) {
               method784(0);
            }
         }

         if (var4 == 17) {
            field1151 = var3 & '\uffff';
         }

         if (var4 == 18) {
            field1145 = (class143)class1.method2(class143.method539(), var3);
            if (field1145 == null) {
               field1145 = class143.field900;
            }
         }

         if (var4 == 19) {
            if (var3 == -1) {
               field1255 = -1;
            } else {
               field1255 = var3 & 2047;
            }
         }

         if (var4 == 22) {
            field1146 = (class143)class1.method2(class143.method539(), var3);
            if (null == field1146) {
               field1146 = class143.field900;
            }
         }

      }
   }

   static final void method862(class322 var0) {
      int var2 = var0.field2184;
      if (var2 == 324) {
         if (-1 == field1222) {
            field1222 = var0.field2244;
            field1404 = var0.field2192;
         }

         if (1 == field1402.field1583) {
            var0.field2244 = field1222;
         } else {
            var0.field2244 = field1404;
         }

      } else if (var2 == 325) {
         if (field1222 == -1) {
            field1222 = var0.field2244;
            field1404 = var0.field2192;
         }

         if (1 == field1402.field1583) {
            var0.field2244 = field1404;
         } else {
            var0.field2244 = field1222;
         }

      } else if (var2 == 327) {
         var0.field2208 = 150;
         var0.field2226 = (int)(Math.sin((double)field1419 / 40.0) * 256.0) & 2047;
         var0.field2200 = 5;
         var0.field2201 = 0;
      } else if (var2 == 328) {
         var0.field2208 = 150;
         var0.field2226 = (int)(Math.sin((double)field1419 / 40.0) * 256.0) & 2047;
         var0.field2200 = 5;
         var0.field2201 = 1;
      }
   }

   static final void method886() {
      class53 var1 = class53.method226(class10.field87, field1181.field3781);
      field1181.method2254(var1);
      class197.field1532 = true;

      for(class127 var2 = (class127)field1137.method1432(); var2 != null; var2 = (class127)field1137.method1433()) {
         if (var2.field801 == 0 || 3 == var2.field801) {
            method821(var2, true);
         }
      }

      if (field1293 != null) {
         method869(field1293);
         field1293 = null;
      }

      class197.field1532 = false;
   }

   static final class127 method906(int var0, int var1, int var2) {
      class127 var4 = new class127();
      var4.field803 = var1;
      var4.field801 = var2;
      field1137.method1434(var4, (long)var0);
      method778(var1);
      class322 var5 = class322.method1488(var0);
      method869(var5);
      if (null != field1293) {
         method869(field1293);
         field1293 = null;
      }

      method808(class53.field436[var0 >> 16], var5, false);
      class197.method1031(var1);
      if (-1 != field1288) {
         method919(field1288, 1);
      }

      return var4;
   }

   static final void method821(class127 var0, boolean var1) {
      int var3 = var0.field803;
      int var4 = (int)var0.field531;
      var0.method295();
      if (var1) {
         class322.method1490(var3);
      }

      method907(var3);
      class322 var5 = class322.method1488(var4);
      if (var5 != null) {
         method869(var5);
      }

      if (-1 != field1288) {
         method919(field1288, 1);
      }

   }

   static final void method788(class322 var0, int var1, int var2, int var3) {
      method898();
      class536 var5 = var0.method1455(false);
      if (var5 != null) {
         class427.method1975(var1, var2, var1 + var5.field4275, var2 + var5.field4274);
         if (2 != field1369 && field1369 != 5) {
            int var6 = field1294 & 2047;
            int var7 = class266.field1874.field3403 / 32 + 48;
            int var8 = 464 - class266.field1874.field3374 / 32;
            class434.field3450.method1359(var1, var2, var5.field4275, var5.field4274, var7, var8, var6, 256, var5.field4277, var5.field4276);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < field1363; ++var9) {
               var10 = field1364[var9] * 4 + 2 - class266.field1874.field3403 / 32;
               var11 = 2 + 4 * field1365[var9] - class266.field1874.field3374 / 32;
               method867(var1, var2, var10, var11, field1374[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class429 var17 = field1256[class156.field980][var9][var10];
                  if (var17 != null) {
                     var12 = 2 + var9 * 4 - class266.field1874.field3403 / 32;
                     var13 = 2 + var10 * 4 - class266.field1874.field3374 / 32;
                     method867(var1, var2, var12, var13, class223.field1668[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < field1177; ++var9) {
               class86 var15 = field1176[field1115[var9]];
               if (var15 != null && var15.method2017()) {
                  class90 var18 = var15.field577;
                  if (null != var18 && null != var18.field644) {
                     var18 = var18.method349();
                  }

                  if (null != var18 && var18.field639 && var18.field650) {
                     var12 = var15.field3403 / 32 - class266.field1874.field3403 / 32;
                     var13 = var15.field3374 / 32 - class266.field1874.field3374 / 32;
                     method867(var1, var2, var12, var13, class223.field1668[1], var5);
                  }
               }
            }

            var9 = class470.field3728;
            int[] var16 = class470.field3729;

            for(var11 = 0; var11 < var9; ++var11) {
               class443 var19 = field1289[var16[var11]];
               if (var19 != null && var19.method2017() && !var19.field3513 && var19 != class266.field1874) {
                  var13 = var19.field3403 / 32 - class266.field1874.field3403 / 32;
                  int var14 = var19.field3374 / 32 - class266.field1874.field3374 / 32;
                  if (var19.method2050()) {
                     method867(var1, var2, var13, var14, class223.field1668[3], var5);
                  } else if (0 != class266.field1874.field3520 && 0 != var19.field3520 && var19.field3520 == class266.field1874.field3520) {
                     method867(var1, var2, var13, var14, class223.field1668[4], var5);
                  } else if (var19.method2053()) {
                     method867(var1, var2, var13, var14, class223.field1668[5], var5);
                  } else if (var19.method2059()) {
                     method867(var1, var2, var13, var14, class223.field1668[6], var5);
                  } else {
                     method867(var1, var2, var13, var14, class223.field1668[2], var5);
                  }
               }
            }

            if (field1194 != 0 && field1419 % 20 < 10) {
               if (1 == field1194 && field1138 >= 0 && field1138 < field1176.length) {
                  class86 var20 = field1176[field1138];
                  if (null != var20) {
                     var12 = var20.field3403 / 32 - class266.field1874.field3403 / 32;
                     var13 = var20.field3374 / 32 - class266.field1874.field3374 / 32;
                     method924(var1, var2, var12, var13, class243.field1778[1], var5);
                  }
               }

               if (field1194 == 2) {
                  var11 = field1140 * 4 - class36.field314 * 4 + 2 - class266.field1874.field3403 / 32;
                  var12 = 2 + (field1283 * 4 - class525.field4175 * 4) - class266.field1874.field3374 / 32;
                  method924(var1, var2, var11, var12, class243.field1778[1], var5);
               }

               if (10 == field1194 && field1157 >= 0 && field1157 < field1289.length) {
                  class443 var21 = field1289[field1157];
                  if (null != var21) {
                     var12 = var21.field3403 / 32 - class266.field1874.field3403 / 32;
                     var13 = var21.field3374 / 32 - class266.field1874.field3374 / 32;
                     method924(var1, var2, var12, var13, class243.field1778[1], var5);
                  }
               }
            }

            if (field1367 != 0) {
               var11 = field1367 * 4 + 2 - class266.field1874.field3403 / 32;
               var12 = field1290 * 4 + 2 - class266.field1874.field3374 / 32;
               method867(var1, var2, var11, var12, class243.field1778[0], var5);
            }

            if (!class266.field1874.field3513) {
               class427.method1968(var1 + var5.field4275 / 2 - 1, var2 + var5.field4274 / 2 - 1, 3, 3, 16777215);
            }
         } else {
            class427.method1976(var1, var2, 0, var5.field4277, var5.field4276);
         }

         field1339[var3] = true;
      }
   }

   static final void method782(class322 var0, int var1, int var2, int var3) {
      class536 var5 = var0.method1455(false);
      if (var5 != null) {
         if (field1369 < 3) {
            field1196.method1359(var1, var2, var5.field4275, var5.field4274, 25, 25, field1294, 256, var5.field4277, var5.field4276);
         } else {
            class427.method1976(var1, var2, 0, var5.field4277, var5.field4276);
         }

      }
   }

   static final void method924(int var0, int var1, int var2, int var3, class296 var4, class536 var5) {
      int var7 = var2 * var2 + var3 * var3;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = field1294 & 2047;
         int var9 = class480.field3795[var8];
         int var10 = class480.field3793[var8];
         int var11 = var9 * var3 + var2 * var10 >> 16;
         int var12 = var10 * var3 - var2 * var9 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field4275 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class270.field1889.method1337(var16 + (var5.field4275 / 2 + var0 - var18 / 2), var1 + var5.field4274 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         method867(var0, var1, var2, var3, var4, var5);
      }

   }

   static final void method867(int var0, int var1, int var2, int var3, class296 var4, class536 var5) {
      if (null != var4) {
         int var7 = field1294 & 2047;
         int var8 = var2 * var2 + var3 * var3;
         if (var8 <= 6400) {
            int var9 = class480.field3795[var7];
            int var10 = class480.field3793[var7];
            int var11 = var2 * var10 + var9 * var3 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if (var8 > 2500) {
               var4.method1358(var5.field4275 / 2 + var11 - var4.field2029 / 2, var5.field4274 / 2 - var12 - var4.field2030 / 2, var0, var1, var5.field4275, var5.field4274, var5.field4277, var5.field4276);
            } else {
               var4.method1366(var0 + var5.field4275 / 2 + var11 - var4.field2029 / 2, var5.field4274 / 2 + var1 - var12 - var4.field2030 / 2);
            }

         }
      }
   }

   static final void method928() {
      Iterator var1 = class431.field3368.iterator();

      while(var1.hasNext()) {
         class243 var2 = (class243)var1.next();
         var2.method1176();
      }

      if (null != class498.field3983) {
         class498.field3983.method1141((byte)-1);
      }

   }

   static final void method836() {
      field1322 = field1118;
   }

   static final void method845(String var0) {
      if (class498.field3983 != null) {
         class53 var2 = class53.method226(class10.field166, field1181.field3781);
         var2.field435.method1643(class366.method1717(var0));
         var2.field435.method1646(var0);
         field1181.method2254(var2);
      }
   }

   static final void method833(String var0) {
      if (!var0.equals("")) {
         class53 var2 = class53.method226(class10.field146, field1181.field3781);
         var2.field435.method1643(class366.method1717(var0));
         var2.field435.method1646(var0);
         field1181.method2254(var2);
      }
   }

   static final void method812() {
      class53 var1 = class53.method226(class10.field146, field1181.field3781);
      var1.field435.method1643(0);
      field1181.method2254(var1);
   }

   static final void method825(int var0, int var1) {
      class417 var3 = var0 >= 0 ? field1361[var0] : class422.field2979;
      if (var3 != null && var1 >= 0 && var1 < var3.method1907()) {
         class367 var4 = (class367)var3.field2933.get(var1);
         if (var4.field2657 == -1) {
            String var5 = var4.field2656.method1598();
            class53 var6 = class53.method226(class10.field108, field1181.field3781);
            var6.field435.method1643(3 + class366.method1717(var5));
            var6.field435.method1643(var0);
            var6.field435.method1684(var1);
            var6.field435.method1646(var5);
            field1181.method2254(var6);
         }
      }
   }

   static final void method917(int var0, int var1) {
      if (field1361[var0] != null) {
         if (var1 >= 0 && var1 < field1361[var0].method1907()) {
            class367 var3 = (class367)field1361[var0].field2933.get(var1);
            if (var3.field2657 == -1) {
               class53 var4 = class53.method226(class10.field99, field1181.field3781);
               var4.field435.method1643(3 + class366.method1717(var3.field2656.method1598()));
               var4.field435.method1643(var0);
               var4.field435.method1684(var1);
               var4.field435.method1646(var3.field2656.method1598());
               field1181.method2254(var4);
            }
         }
      }
   }

   static void method907(int var0) {
      for(class323 var2 = (class323)field1335.method1432(); null != var2; var2 = (class323)field1335.method1433()) {
         if ((var2.field531 >> 48 & 65535L) == (long)var0) {
            var2.method295();
         }
      }

   }

   static int method865(class322 var0) {
      class323 var2 = (class323)field1335.method1431((long)var0.field2277 + ((long)var0.field2158 << 32));
      return var2 != null ? var2.field2304 : var0.field2229;
   }

   static class322 method827(class322 var0) {
      int var2 = class125.method476(method865(var0));
      if (var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = class322.method1488(var0.field2175);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   static boolean method842(class322 var0) {
      return var0.field2176;
   }

   static String method895(class322 var0) {
      if (class125.method474(method865(var0)) == 0) {
         return null;
      } else {
         return null != var0.field2240 && var0.field2240.trim().length() != 0 ? var0.field2240 : null;
      }
   }

   static String method863(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (field1141 == 1) {
         var0 = var0 + "-wtrc";
      } else if (2 == field1141) {
         var0 = var0 + "-wtqa";
      } else if (3 == field1141) {
         var0 = var0 + "-wtwip";
      } else if (5 == field1141) {
         var0 = var0 + "-wti";
      } else if (field1141 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (null != class500.field3998) {
         var4 = "/p=" + class500.field3998;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class367.field2654 + "/a=" + class376.field2686 + var4 + "/";
   }

   static void method800(String var0) {
      class500.field3998 = var0;

      try {
         String var2 = class530.field4182.getParameter(Integer.toString(18));
         String var3 = class530.field4182.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         String var6;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String var5 = var4 + "; Expires=";
            long var7 = class123.method471() + 94608000000L;
            class218.field1662.setTime(new Date(var7));
            int var9 = class218.field1662.get(7);
            int var10 = class218.field1662.get(5);
            int var11 = class218.field1662.get(2);
            int var12 = class218.field1662.get(1);
            int var13 = class218.field1662.get(11);
            int var14 = class218.field1662.get(12);
            int var15 = class218.field1662.get(13);
            var6 = class218.field1661[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class218.field1663[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
            var4 = var5 + var6 + "; Max-Age=" + 94608000L;
         }

         Client var17 = class530.field4182;
         var6 = "document.cookie=\"" + var4 + "\"";
         JSObject.getWindow(var17).eval(var6);
      } catch (Throwable var16) {
      }

   }

   static void method859(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class156.field981; ++var5) {
         class47 var6 = class47.method213(var5);
         if ((!var1 || var6.field408) && -1 == var6.field371 && var6.field380.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class150.field961 = -1;
               class539.field4290 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[2 * var3.length];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class539.field4290 = var3;
      class1.field1 = 0;
      class150.field961 = var4;
      String[] var9 = new String[class150.field961];

      for(int var10 = 0; var10 < class150.field961; ++var10) {
         var9[var10] = class47.method213(var3[var10]).field380;
      }

      short[] var11 = class539.field4290;
      class134.method490(var9, var11, 0, var9.length - 1);
   }

   static void method793(class366 var0, int var1) {
      byte[] var3 = var0.field2650;
      if (field1399 == null) {
         field1399 = new byte[24];
      }

      class6.method48(var3, var1, field1399, 0, 24);
      class269.method1218(var0, var1);
   }

   static void method857(class366 var0) {
      if (field1399 != null) {
         var0.method1648(field1399, 0, field1399.length);
      } else {
         byte[] var3 = new byte[24];

         try {
            class269.field1883.method2332(0L);
            class269.field1883.method2333(var3);

            int var4;
            for(var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
            }

            if (var4 >= 24) {
               throw new IOException();
            }
         } catch (Exception var6) {
            for(int var5 = 0; var5 < 24; ++var5) {
               var3[var5] = -1;
            }
         }

         var0.method1648(var3, 0, var3.length);
      }
   }

   public static void method820(int var0, int var1, int var2, boolean var3) {
      class53 var5 = class53.method226(class10.field106, field1181.field3781);
      var5.field435.method1716(var2);
      var5.field435.method1684(var1);
      var5.field435.method1692(var3 ? field1216 : 0);
      var5.field435.method1706(var0);
      field1181.method2254(var5);
   }

   static void method896(int var0) {
      field1209 = var0;
   }

   static void method799() {
      field1181.method2254(class53.method226(class10.field154, field1181.field3781));
      field1209 = 0;
   }

   static void method881() {
      if (1 == field1209) {
         field1217 = true;
      }

   }

   static void method794() {
      if (field1217 && null != class266.field1874) {
         int var1 = class266.field1874.field3448[0];
         int var2 = class266.field1874.field3445[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         class278.field1947 = class266.field1874.field3403;
         int var3 = method787(class266.field1874.field3403, class266.field1874.field3374, class156.field980) - field1210;
         if (var3 < class203.field1565) {
            class203.field1565 = var3;
         }

         class156.field982 = class266.field1874.field3374;
         field1217 = false;
      }

   }

   static String method864(String var0) {
      class132[] var2 = class132.method484();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class132 var4 = var2[var3];
         if (-1 != var4.field834 && var0.startsWith(class402.method1827(var4.field834))) {
            var0 = var0.substring(6 + Integer.toString(var4.field834).length());
            break;
         }
      }

      return var0;
   }

   static void method777() {
      class158.field1004.method534(field1121);
   }

   static void method902(int var0) {
      if (var0 != field1152) {
         field1152 = var0;
      }
   }

   static void method802(boolean var0) {
      field1263 = var0;
   }

   static class522 method911(int var0) {
      class522 var2 = (class522)field1312.method1183((long)var0);
      if (null == var2) {
         var2 = new class522(class405.field2813, class211.method1092(var0), class211.method1093(var0));
         field1312.method1182(var2, (long)var0);
      }

      return var2;
   }

   static class522 method930(int var0) {
      class522 var2 = (class522)field1202.method1183((long)var0);
      if (null == var2) {
         var2 = new class522(class405.field2813, var0);
      }

      return var2;
   }

   public static Clipboard method912() {
      return class530.field4182.method2540();
   }

   static void method939(int var0) {
      class464 var2 = class464.method2200(var0);
      if (var2.method2199()) {
         if (class142.method535(var2.field3670, (byte)94) == 2) {
            field1285.add(var2.field3670);
         }

      }
   }

   static void method851() {
      for(int var1 = 0; var1 < field1285.size(); ++var1) {
         if (class142.method535((Integer)field1285.get(var1), (byte)-51) != 2) {
            field1285.remove(var1);
            --var1;
         }
      }

   }
}
