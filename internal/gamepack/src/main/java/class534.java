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

public class class534 {
   static boolean field4224;
   static boolean field4240;
   static boolean field4244;
   static boolean field4247;
   static class425 field4218;
   static class425 field4221;
   static class425 field4222;
   static class425[] field4220;
   static class427 field4223;
   static int field4219 = 0;
   static int field4225;
   static int field4226;
   static int field4228;
   static int field4229;
   static int field4230;
   static int field4235;
   static int field4241;
   static int field4245;
   static int field4246;
   static int field4251;
   static String field4227;
   static String field4232;
   static String field4233;
   static String field4234;
   static String field4236;
   static String field4237;
   static String field4242;
   static String field4243;
   static String field4248;
   static String field4252;
   static String[] field4231;
   static String[] field4238;
   static String[] field4250;
   static String[] field4253;
   static long field4239;
   static long field4249;

   static {
      field4225 = field4219 + 202;
      field4226 = 10;
      field4227 = "";
      field4228 = -1;
      field4229 = 1;
      field4230 = 0;
      field4252 = "";
      field4234 = "";
      field4232 = "";
      field4233 = "";
      field4243 = "";
      field4236 = "";
      field4235 = 0;
      field4238 = new String[8];
      field4237 = "";
      field4224 = false;
      field4247 = false;
      field4240 = true;
      field4241 = 0;
      field4242 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      field4248 = "1234567890";
      field4244 = false;
      field4245 = -1;
      field4246 = 0;
      field4251 = 0;
      new DecimalFormat("##0.00");
      new class439();
      field4239 = -1L;
      field4249 = -1L;
      field4231 = new String[]{"title.jpg"};
      field4250 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field4253 = new String[]{"logo_speedrunning"};
   }

   class534() throws Throwable {
   }

   static void method2557(class298 var0, class298 var1, boolean var2, int var3) {
      if (class485.field3840) {
         if (var3 == 4) {
            method2543(4);
         }

      } else {
         if (var3 == 0) {
            class268.method1514(var2);
         } else {
            method2543(var3);
         }

         class156.method951();
         byte[] var5 = var0.method1648("title.jpg", "");
         field4223 = class462.method2262(var5);
         class119.field1486 = field4223.method2004();
         int var6 = Client.field577;
         if ((var6 & class38.field918.method1195()) != 0) {
            class409.field3154 = class398.method1926(var1, "logo_deadman_mode", "");
         } else if ((var6 & class38.field919.method1195()) != 0) {
            class409.field3154 = class398.method1926(var1, "logo_seasonal_mode", "");
         } else if ((var6 & class38.field897.method1195()) != 0) {
            class409.field3154 = class398.method1926(var1, "logo_speedrunning", "");
         } else {
            class409.field3154 = class398.method1926(var1, "logo", "");
         }

         field4221 = class398.method1926(var1, "titlebox", "");
         class191.field1878 = class398.method1926(var1, "titlebutton", "");
         field4222 = class398.method1926(var1, "titlebutton_large", "");
         class78.field1243 = class398.method1926(var1, "play_now_text", "");
         class398.method1926(var1, "titlebutton_wide42,1", "");
         field4220 = class398.method1928(var1, "runes", "");
         class199.field1930 = class398.method1928(var1, "title_mute", "");
         field4218 = class398.method1926(var1, "options_radio_buttons,0", "");
         class170.field1725 = class398.method1926(var1, "options_radio_buttons,4", "");
         class537.field4256 = class398.method1926(var1, "options_radio_buttons,2", "");
         class132.field1562 = class398.method1926(var1, "options_radio_buttons,6", "");
         class70.field1135 = field4218.field3222;
         class332.field2678 = field4218.field3223;
         class158.field1682 = new class541(field4220);
         if (var2) {
            field4243 = "";
            field4236 = "";
            field4238 = new String[8];
            field4235 = 0;
         }

         class13.field117 = 0;
         class470.field3619 = "";
         field4240 = true;
         field4244 = false;
         if (!class4.field36.method2425()) {
            ArrayList var7 = new ArrayList();
            var7.add(new class131(class303.field2520, "scape main", "", 255, false));
            class228.method1377(var7, 0, 0, 0, 100, false);
         } else {
            class106.method792(0, 0);
         }

         class69.method661();
         class278.method1539().method133(false);
         class485.field3840 = true;
         field4219 = (class426.field3228 - 765) / 2;
         field4225 = 202 + field4219;
         class241.field2193 = 180 + field4225;
         field4223.method2012(field4219, 0);
         class119.field1486.method2012(382 + field4219, 0);
         class409.field3154.method2000(field4219 + 382 - class409.field3154.field3222 / 2, 18);
      }
   }

   static String method2550() {
      String var1;
      if (class4.field36.method2409()) {
         String var3 = field4243;
         String var2 = class330.method1744('*', var3.length());
         var1 = var2;
      } else {
         var1 = field4243;
      }

      return var1;
   }

   static void method2549() {
      if (Client.field630 && field4243 != null && field4243.length() > 0) {
         field4241 = 1;
      } else {
         field4241 = 0;
      }

   }

   static void method2556(class210 var0, class460 var1, class460 var2) {
      int var6;
      int var7;
      int var8;
      boolean var31;
      boolean var47;
      if (field4244) {
         class17 var27 = Client.method504();

         while(true) {
            if (!var27.method172()) {
               if (class441.field3343 != 1 && (class136.field1574 || class441.field3343 != 4)) {
                  break;
               }

               int var5 = field4219 + 280;
               if (class441.field3344 >= var5 && class441.field3344 <= var5 + 14 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(0, 0);
                  break;
               }

               if (class441.field3344 >= var5 + 15 && class441.field3344 <= var5 + 80 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(0, 1);
                  break;
               }

               var6 = field4219 + 390;
               if (class441.field3344 >= var6 && class441.field3344 <= var6 + 14 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(1, 0);
                  break;
               }

               if (class441.field3344 >= var6 + 15 && class441.field3344 <= var6 + 80 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(1, 1);
                  break;
               }

               var7 = field4219 + 500;
               if (class441.field3344 >= var7 && class441.field3344 <= var7 + 14 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(2, 0);
                  break;
               }

               if (class441.field3344 >= var7 + 15 && class441.field3344 <= var7 + 80 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(2, 1);
                  break;
               }

               var8 = 610 + field4219;
               if (class441.field3344 >= var8 && class441.field3344 <= var8 + 14 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(3, 0);
                  break;
               }

               if (class441.field3344 >= var8 + 15 && class441.field3344 <= var8 + 80 && class441.field3345 >= 4 && class441.field3345 <= 18) {
                  class230.method1414(3, 1);
                  break;
               }

               if (class441.field3344 >= 708 + field4219 && class441.field3345 >= 4 && class441.field3344 <= 50 + 708 + field4219 && class441.field3345 <= 20) {
                  method2551();
                  break;
               }

               if (field4245 != -1) {
                  class230 var29 = class263.field2288[field4245];
                  if (var29.method1398()) {
                     var29.field2140 = "beta";
                  }

                  var47 = false;
                  if (var29.field2129 != Client.field577) {
                     boolean var46 = (Client.field577 & class38.field905.method1195()) != 0;
                     var31 = var29.method1398();
                     if (var46 && !var31 || !var46 && var31) {
                        var47 = true;
                     }
                  }

                  class325.method1712(var29);
                  method2551();
                  if (var47) {
                     Client.method542();
                  }
               } else {
                  if (field4246 > 0 && null != class52.field1073 && class441.field3344 >= 0 && class441.field3344 <= class52.field1073.field3222 && class441.field3345 >= class456.field3562 / 2 - 50 && class441.field3345 <= class456.field3562 / 2 + 50) {
                     --field4246;
                  }

                  if (field4246 < field4251 && null != class370.field2901 && class441.field3344 >= class426.field3228 - class370.field2901.field3222 - 5 && class441.field3344 <= class426.field3228 && class441.field3345 >= class456.field3562 / 2 - 50 && class441.field3345 <= class456.field3562 / 2 + 50) {
                     ++field4246;
                  }
               }
               break;
            }

            if (var27.field186 == 13) {
               method2551();
               break;
            }

            if (var27.field186 == 96) {
               if (field4246 > 0 && null != class52.field1073) {
                  --field4246;
               }
            } else if (var27.field186 == 97 && field4246 < field4251 && null != class370.field2901) {
               ++field4246;
            }
         }

      } else {
         if ((class441.field3343 == 1 || !class136.field1574 && class441.field3343 == 4) && class441.field3344 >= field4219 + 765 - 50 && class441.field3345 >= 453) {
            class4.field36.method2424(!class4.field36.method2425());
            if (!class4.field36.method2425()) {
               ArrayList var4 = new ArrayList();
               var4.add(new class131(class303.field2520, "scape main", "", 255, false));
               class228.method1377(var4, 0, 0, 0, 100, false);
            } else {
               class106.method792(0, 0);
            }

            class69.method661();
         }

         if (Client.field660 != 5) {
            if (-1L == field4239) {
               field4239 = class80.method713() + 1000L;
            }

            long var26 = class80.method713();
            if (Client.method429() && -1L == field4249) {
               field4249 = var26;
               if (field4249 > field4239) {
                  field4239 = field4249;
               }
            }

            if (Client.field660 == 10 || Client.field660 == 11) {
               if (class219.field2034 == class121.field1497) {
                  if (class441.field3343 == 1 || !class136.field1574 && class441.field3343 == 4) {
                     var6 = 5 + field4219;
                     var7 = 463;
                     var8 = 100;
                     byte var9 = 35;
                     if (class441.field3344 >= var6 && class441.field3344 <= var8 + var6 && class441.field3345 >= var7 && class441.field3345 <= var9 + var7) {
                        if (class230.method1411()) {
                           field4244 = true;
                           field4246 = 0;
                           field4251 = 0;
                        }

                        return;
                     }
                  }

                  if (class238.field2184 != null) {
                     method2544();
                  }
               }

               var6 = class441.field3343;
               var7 = class441.field3344;
               var8 = class441.field3345;
               if (var6 == 0) {
                  var7 = class441.field3349;
                  var8 = class441.field3332;
               }

               if (!class136.field1574 && var6 == 4) {
                  var6 = 1;
               }

               class17 var28 = Client.method504();
               int var11;
               short var32;
               if (field4230 == 0) {
                  var47 = false;

                  while(var28.method172()) {
                     if (var28.field186 == 84) {
                        var47 = true;
                     }
                  }

                  var11 = class241.field2193 - 80;
                  var32 = 291;
                  if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                     class352.method1812(Client.method479("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var11 = 80 + class241.field2193;
                  if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20 || var47) {
                     if ((Client.field577 & class38.field914.method1195()) != 0) {
                        field4252 = "";
                        field4234 = class27.field467;
                        field4232 = class27.field458;
                        field4233 = class27.field459;
                        method2543(1);
                        method2549();
                     } else if ((Client.field577 & class38.field899.method1195()) != 0) {
                        if ((Client.field577 & class38.field920.method1195()) != 0) {
                           field4234 = class27.field454;
                           field4232 = class27.field455;
                           field4233 = class27.field456;
                        } else {
                           field4234 = class27.field448;
                           field4232 = class27.field449;
                           field4233 = class27.field250;
                        }

                        field4252 = class27.field263;
                        method2543(1);
                        method2549();
                     } else if ((Client.field577 & class38.field920.method1195()) != 0) {
                        field4234 = class27.field539;
                        field4232 = class27.field473;
                        field4233 = class27.field533;
                        field4252 = class27.field263;
                        method2543(1);
                        method2549();
                     } else {
                        class268.method1515(false);
                     }
                  }
               } else {
                  int var10;
                  short var33;
                  if (field4230 == 1) {
                     while(true) {
                        if (!var28.method172()) {
                           var10 = class241.field2193 - 80;
                           var33 = 321;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                              class268.method1515(false);
                           }

                           var10 = class241.field2193 + 80;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                              method2543(0);
                           }
                           break;
                        }

                        if (var28.field186 == 84) {
                           class268.method1515(false);
                        } else if (var28.field186 == 13) {
                           method2543(0);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var30;
                     boolean var34;
                     if (field4230 == 2) {
                        var30 = 201;
                        var10 = var30 + 52;
                        if (var6 == 1 && var8 >= var10 - 12 && var8 < var10 + 2) {
                           field4241 = 0;
                        }

                        var10 += 15;
                        if (var6 == 1 && var8 >= var10 - 12 && var8 < var10 + 2) {
                           field4241 = 1;
                        }

                        var10 += 15;
                        var30 = 361;
                        if (class291.field2463 != null) {
                           var11 = class291.field2463.field1484 / 2;
                           if (var6 == 1 && var7 >= class291.field2463.field1485 - var11 && var7 <= var11 + class291.field2463.field1485 && var8 >= var30 - 15 && var8 < var30) {
                              switch (field4229) {
                                 case 1:
                                    class352.method1812(class27.field428, true, false);
                                    return;
                                 case 2:
                                    class352.method1812("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var11 = class241.field2193 - 80;
                        var32 = 321;
                        if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                           field4243 = field4243.trim();
                           if (field4243.length() == 0) {
                              method2555(class27.field355, class27.field270, class27.field357);
                              return;
                           }

                           if (field4236.length() == 0) {
                              method2555(class27.field358, class27.field359, class27.field283);
                              return;
                           }

                           method2555(class27.field461, class27.field462, class27.field447);
                           Client.method435(false);
                           Client.method520(20);
                           return;
                        }

                        var11 = 80 + 180 + field4225;
                        if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                           method2543(0);
                           field4243 = "";
                           field4236 = "";
                           class13.field117 = 0;
                           class470.field3619 = "";
                           field4240 = true;
                        }

                        var11 = -117 + class241.field2193;
                        var32 = 277;
                        field4224 = var7 >= var11 && var7 < class70.field1135 + var11 && var8 >= var32 && var8 < var32 + class332.field2678;
                        if (var6 == 1 && field4224) {
                           Client.field630 = !Client.field630;
                           if (!Client.field630 && class4.field36.method2417() != null) {
                              class4.field36.method2416((String)null);
                           }
                        }

                        var11 = 24 + class241.field2193;
                        var32 = 277;
                        field4247 = var7 >= var11 && var7 < var11 + class70.field1135 && var8 >= var32 && var8 < class332.field2678 + var32;
                        if (var6 == 1 && field4247) {
                           class4.field36.method2426(!class4.field36.method2409());
                           if (!class4.field36.method2409()) {
                              field4243 = "";
                              class4.field36.method2416((String)null);
                              method2549();
                           }
                        }

                        while(true) {
                           int var17;
                           Transferable var44;
                           do {
                              while(true) {
                                 label1169:
                                 do {
                                    while(true) {
                                       while(var28.method172()) {
                                          if (var28.field186 != 13) {
                                             if (field4241 != 0) {
                                                continue label1169;
                                             }

                                             method2547(var28.field173);
                                             if (var28.field186 == 85 && field4243.length() > 0) {
                                                field4243 = field4243.substring(0, field4243.length() - 1);
                                             }

                                             if (var28.field186 == 84 || var28.field186 == 80) {
                                                field4241 = 1;
                                             }

                                             if (method2548(var28.field173) && field4243.length() < 320) {
                                                field4243 = field4243 + var28.field173;
                                             }
                                          } else {
                                             method2543(0);
                                             field4243 = "";
                                             field4236 = "";
                                             class13.field117 = 0;
                                             class470.field3619 = "";
                                             field4240 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(field4241 != 1);

                                 if (var28.field186 == 85 && field4236.length() > 0) {
                                    field4236 = field4236.substring(0, field4236.length() - 1);
                                 } else if (var28.field186 == 84 || var28.field186 == 80) {
                                    field4241 = 0;
                                    if (var28.field186 == 84) {
                                       field4243 = field4243.trim();
                                       if (field4243.length() == 0) {
                                          method2555(class27.field355, class27.field270, class27.field357);
                                          return;
                                       }

                                       if (field4236.length() == 0) {
                                          method2555(class27.field358, class27.field359, class27.field283);
                                          return;
                                       }

                                       method2555(class27.field461, class27.field462, class27.field447);
                                       Client.method435(false);
                                       Client.method520(20);
                                       return;
                                    }
                                 }

                                 if ((var28.method171(82) || var28.method171(87)) && var28.field186 == 67) {
                                    Clipboard var43 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var44 = var43.getContents(class191.field1877);
                                    var15 = 20 - field4236.length();
                                    break;
                                 }

                                 char var41 = var28.field173;
                                 if (var41 >= ' ' && var41 < 127 || var41 > 127 && var41 < 160 || var41 > 160 && var41 <= 255) {
                                    var34 = true;
                                 } else {
                                    label1408: {
                                       if (var41 != 0) {
                                          char[] var42 = class162.field1691;

                                          for(var16 = 0; var16 < var42.length; ++var16) {
                                             var17 = var42[var16];
                                             if (var17 == var41) {
                                                var34 = true;
                                                break label1408;
                                             }
                                          }
                                       }

                                       var34 = false;
                                    }
                                 }

                                 if (var34 && method2548(var28.field173) && field4236.length() < 20) {
                                    field4236 = field4236 + var28.field173;
                                 }
                              }
                           } while(var15 <= 0);

                           try {
                              String var45 = (String)var44.getTransferData(DataFlavor.stringFlavor);
                              var17 = Math.min(var15, var45.length());

                              for(int var18 = 0; var18 < var17; ++var18) {
                                 char var20 = var45.charAt(var18);
                                 boolean var19;
                                 if ((var20 < ' ' || var20 >= 127) && (var20 <= 127 || var20 >= 160) && (var20 <= 160 || var20 > 255)) {
                                    label1388: {
                                       if (var20 != 0) {
                                          char[] var21 = class162.field1691;

                                          for(int var22 = 0; var22 < var21.length; ++var22) {
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

                                 if (!var19 || !method2548(var45.charAt(var18))) {
                                    method2543(3);
                                    return;
                                 }
                              }

                              field4236 = field4236 + var45.substring(0, var17);
                           } catch (UnsupportedFlavorException var24) {
                           } catch (IOException var25) {
                           }
                        }
                     } else {
                        class119 var12;
                        if (field4230 == 3) {
                           var10 = field4225 + 180;
                           var11 = 241;
                           var12 = var1.method1570(25, class27.field482.length() - 34, class27.field482, var10, var11);
                           if (var6 == 1 && var12.method827(var7, var8, (byte)-32)) {
                              class352.method1812(class27.field543, true, false);
                           }

                           var10 = 180 + field4225;
                           var11 = 276;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                              class268.method1514(false);
                           }

                           var10 = 180 + field4225;
                           var11 = 326;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                              class352.method1812(class27.field428, true, false);
                              return;
                           }
                        } else {
                           int var13;
                           if (field4230 == 4) {
                              var10 = 180 + field4225 - 80;
                              var11 = 321;
                              if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                 class470.field3619.trim();
                                 if (class470.field3619.length() != 6) {
                                    method2555(class27.field391, class27.field275, class27.field354);
                                    return;
                                 }

                                 class13.field117 = Integer.parseInt(class470.field3619);
                                 class470.field3619 = "";
                                 Client.method435(true);
                                 method2555(class27.field461, class27.field462, class27.field447);
                                 Client.method520(20);
                                 return;
                              }

                              if (var6 == 1 && var7 >= field4225 + 180 - 9 && var7 <= 130 + 180 + field4225 && var8 >= 263 && var8 <= 296) {
                                 field4240 = !field4240;
                              }

                              if (var6 == 1 && var7 >= 180 + field4225 - 34 && var7 <= 34 + 180 + field4225 && var8 >= 351 && var8 <= 363) {
                                 class352.method1812(class27.field428, true, false);
                              }

                              var10 = 180 + field4225 + 80;
                              if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                 method2543(0);
                                 field4243 = "";
                                 field4236 = "";
                                 class13.field117 = 0;
                                 class470.field3619 = "";
                              }

                              while(var28.method172()) {
                                 var31 = false;

                                 for(var13 = 0; var13 < field4248.length(); ++var13) {
                                    if (var28.field173 == field4248.charAt(var13)) {
                                       var31 = true;
                                       break;
                                    }
                                 }

                                 if (var28.field186 == 13) {
                                    method2543(0);
                                    field4243 = "";
                                    field4236 = "";
                                    class13.field117 = 0;
                                    class470.field3619 = "";
                                 } else {
                                    if (var28.field186 == 85 && class470.field3619.length() > 0) {
                                       class470.field3619 = class470.field3619.substring(0, class470.field3619.length() - 1);
                                    }

                                    if (var28.field186 == 84) {
                                       class470.field3619.trim();
                                       if (class470.field3619.length() != 6) {
                                          method2555(class27.field391, class27.field275, class27.field354);
                                          return;
                                       }

                                       class13.field117 = Integer.parseInt(class470.field3619);
                                       class470.field3619 = "";
                                       Client.method435(true);
                                       method2555(class27.field461, class27.field462, class27.field447);
                                       Client.method520(20);
                                       return;
                                    }

                                    if (var31 && class470.field3619.length() < 6) {
                                       class470.field3619 = class470.field3619 + var28.field173;
                                    }
                                 }
                              }
                           } else {
                              int var14;
                              if (field4230 == 5) {
                                 var10 = 180 + field4225 - 80;
                                 var11 = 321;
                                 if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                    method2546();
                                    return;
                                 }

                                 var10 = 80 + 180 + field4225;
                                 if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                    class268.method1515(true);
                                 }

                                 var32 = 361;
                                 if (null != class76.field1226) {
                                    var13 = class76.field1226.field1484 / 2;
                                    if (var6 == 1 && var7 >= class76.field1226.field1485 - var13 && var7 <= class76.field1226.field1485 + var13 && var8 >= var32 - 15 && var8 < var32) {
                                       class352.method1812(Client.method479("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                    }
                                 }

                                 while(var28.method172()) {
                                    var34 = false;

                                    for(var14 = 0; var14 < field4242.length(); ++var14) {
                                       if (var28.field173 == field4242.charAt(var14)) {
                                          var34 = true;
                                          break;
                                       }
                                    }

                                    if (var28.field186 == 13) {
                                       class268.method1515(true);
                                    } else {
                                       if (var28.field186 == 85 && field4243.length() > 0) {
                                          field4243 = field4243.substring(0, field4243.length() - 1);
                                       }

                                       if (var28.field186 == 84) {
                                          method2546();
                                          return;
                                       }

                                       if (var34 && field4243.length() < 320) {
                                          field4243 = field4243 + var28.field173;
                                       }
                                    }
                                 }
                              } else if (field4230 != 6) {
                                 if (field4230 == 7) {
                                    if (class325.field2627 && !Client.field811) {
                                       var10 = class241.field2193 - 150;
                                       var11 = var10 + 240 + 25 + 40;
                                       var32 = 231;
                                       var13 = var32 + 40;
                                       if (var6 == 1 && var7 >= var10 && var7 <= var11 && var8 >= var32 && var8 <= var13) {
                                          var15 = var10;
                                          var16 = 0;

                                          while(true) {
                                             if (var16 >= 8) {
                                                var14 = 0;
                                                break;
                                             }

                                             if (var7 <= var15 + 30) {
                                                var14 = var16;
                                                break;
                                             }

                                             var15 += 30;
                                             var15 += var16 != 1 && var16 != 3 ? 5 : 20;
                                             ++var16;
                                          }

                                          field4235 = var14;
                                       }

                                       var14 = 180 + field4225 - 80;
                                       short var36 = 321;
                                       boolean var40;
                                       if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var36 - 20 && var8 <= var36 + 20) {
                                          var40 = method2545();
                                          if (var40) {
                                             Client.method520(50);
                                             return;
                                          }
                                       }

                                       var14 = field4225 + 180 + 80;
                                       if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var36 - 20 && var8 <= var36 + 20) {
                                          field4238 = new String[8];
                                          class268.method1515(true);
                                       }

                                       while(var28.method172()) {
                                          if (var28.field186 == 101) {
                                             field4238[field4235] = null;
                                          }

                                          if (var28.field186 == 85) {
                                             if (field4238[field4235] == null && field4235 > 0) {
                                                --field4235;
                                             }

                                             field4238[field4235] = null;
                                          }

                                          if (var28.field173 >= '0' && var28.field173 <= '9') {
                                             field4238[field4235] = "" + var28.field173;
                                             if (field4235 < 7) {
                                                ++field4235;
                                             }
                                          }

                                          if (var28.field186 == 84) {
                                             var40 = method2545();
                                             if (var40) {
                                                Client.method520(50);
                                             }

                                             return;
                                          }
                                       }
                                    } else {
                                       var10 = 180 + field4225 - 80;
                                       var11 = 321;
                                       if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                          class352.method1812(Client.method479("secure", true) + "m=dob/set_dob.ws", true, false);
                                          method2555(class27.field492, class27.field493, class27.field377);
                                          method2543(6);
                                          return;
                                       }

                                       var10 = 80 + field4225 + 180;
                                       if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                          class268.method1515(true);
                                       }
                                    }
                                 } else if (field4230 == 8) {
                                    var10 = 180 + field4225 - 80;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class352.method1812("https://www.jagex.com/terms/privacy", true, false);
                                       method2555(class27.field492, class27.field493, class27.field377);
                                       method2543(6);
                                       return;
                                    }

                                    var10 = field4225 + 180 + 80;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class268.method1515(true);
                                    }
                                 } else if (field4230 == 9) {
                                    var10 = 180 + field4225;
                                    var33 = 311;
                                    if (var28.field186 == 84 || var28.field186 == 13 || var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class268.method1514(false);
                                    }
                                 } else if (field4230 == 10) {
                                    var10 = 180 + field4225;
                                    var33 = 209;
                                    if (var28.field186 == 84 || var6 == 1 && var7 >= var10 - 109 && var7 <= var10 + 109 && var8 >= var33 && var8 <= var33 + 68) {
                                       method2555(class27.field461, class27.field462, class27.field447);
                                       Client.field621 = class140.field1585;
                                       Client.method435(false);
                                       Client.method520(20);
                                    }
                                 } else if (field4230 == 12) {
                                    var10 = class241.field2193;
                                    var33 = 233;
                                    var12 = var2.method1570(0, 30, class27.field524, var10, var33);
                                    class119 var35 = var2.method1570(32, 32, class27.field524, var10, var33);
                                    class119 var37 = var2.method1570(70, 34, class27.field524, var10, var33);
                                    var11 = var33 + 17;
                                    class119 var38 = var2.method1570(0, 34, class27.field525, var10, var11);
                                    if (var6 == 1) {
                                       if (var12.method827(var7, var8, (byte)-43)) {
                                          class352.method1812("https://www.jagex.com/terms", true, false);
                                       } else if (var35.method827(var7, var8, (byte)-50)) {
                                          class352.method1812("https://www.jagex.com/terms/privacy", true, false);
                                       } else if (var37.method827(var7, var8, (byte)-15) || var38.method827(var7, var8, (byte)-15)) {
                                          class352.method1812("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                       }
                                    }

                                    var10 = class241.field2193 - 80;
                                    var33 = 311;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       Client.method393();
                                       class268.method1514(true);
                                    }

                                    var10 = class241.field2193 + 80;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       field4230 = 13;
                                    }
                                 } else if (field4230 == 13) {
                                    var10 = class241.field2193;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class268.method1514(true);
                                    }
                                 } else if (field4230 == 14) {
                                    String var39 = "";
                                    switch (field4228) {
                                       case 0:
                                          var39 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                          break;
                                       case 1:
                                          var39 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                          break;
                                       case 2:
                                          var39 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                          break;
                                       default:
                                          class268.method1515(false);
                                    }

                                    var11 = field4225 + 180;
                                    var32 = 276;
                                    if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                                       class352.method1812(var39, true, false);
                                       method2555(class27.field492, class27.field493, class27.field377);
                                       method2543(6);
                                       return;
                                    }

                                    var11 = 180 + field4225;
                                    var32 = 326;
                                    if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                                       class268.method1515(false);
                                    }
                                 } else if (field4230 == 24) {
                                    var10 = field4225 + 180;
                                    var33 = 301;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class268.method1514(false);
                                    }
                                 } else if (field4230 == 32) {
                                    var10 = field4225 + 180 - 80;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class352.method1812(Client.method479("secure", true) + "m=dob/set_dob.ws", true, false);
                                       method2555(class27.field492, class27.field493, class27.field377);
                                       method2543(6);
                                       return;
                                    }

                                    var10 = 80 + 180 + field4225;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class268.method1515(true);
                                    }
                                 } else if (field4230 == 33) {
                                    var10 = field4225 + 180;
                                    var33 = 276;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class352.method1812(class27.field543, true, false);
                                    }

                                    var10 = field4225 + 180;
                                    var33 = 326;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class268.method1515(true);
                                    }
                                 }
                              } else {
                                 while(true) {
                                    do {
                                       if (!var28.method172()) {
                                          var30 = 321;
                                          if (var6 == 1 && var8 >= var30 - 20 && var8 <= var30 + 20) {
                                             class268.method1515(true);
                                          }

                                          return;
                                       }
                                    } while(var28.field186 != 84 && var28.field186 != 13);

                                    class268.method1515(true);
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

   static boolean method2545() {
      Date var1;
      try {
         var1 = class529.method2514();
      } catch (ParseException var5) {
         method2553("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
         return false;
      }

      if (var1 == null) {
         return false;
      } else {
         boolean var2 = method2552(var1);
         Date var4 = method2554();
         boolean var3 = var1.after(var4);
         if (!var3) {
            method2543(7);
            method2555("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
         } else {
            if (!var2) {
               class205.field1938 = 8388607;
            } else {
               class205.field1938 = (int)(var1.getTime() / 86400000L - 11745L);
            }

            return true;
         }
      }
   }

   static Date method2554() {
      Calendar var1 = Calendar.getInstance();
      var1.set(2, 0);
      var1.set(5, 1);
      var1.set(1, 1900);
      return var1.getTime();
   }

   static boolean method2552(Date var0) {
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

   static void method2553(String var0, String var1, String var2) {
      method2543(7);
      method2555(var0, var1, var2);
   }

   static boolean method2547(char var0) {
      for(int var2 = 0; var2 < field4242.length(); ++var2) {
         if (var0 == field4242.charAt(var2)) {
            return true;
         }
      }

      return false;
   }

   static boolean method2548(char var0) {
      return field4242.indexOf(var0) != -1;
   }

   static void method2546() {
      field4243 = field4243.trim();
      if (field4243.length() == 0) {
         method2555(class27.field495, class27.field496, class27.field497);
      } else {
         long var2;
         try {
            URL var4 = new URL(Client.method479("services", false) + "m=accountappeal/login.ws");
            URLConnection var5 = var4.openConnection();
            var5.setRequestProperty("connection", "close");
            var5.setDoInput(true);
            var5.setDoOutput(true);
            var5.setConnectTimeout(5000);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            var6.flush();
            InputStream var7 = var5.getInputStream();
            class184 var8 = new class184(new byte[1000]);

            while(true) {
               int var9 = var7.read(var8.field1816, var8.field1818, 1000 - var8.field1818);
               if (var9 == -1) {
                  var8.field1818 = 0;
                  long var12 = var8.method1130();
                  var2 = var12;
                  break;
               }

               var8.field1818 += var9;
               if (var8.field1818 >= 1000) {
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
            var1 = class205.method1253(var2, field4243);
         }

         switch (var1) {
            case 2:
               method2555(class27.field498, class27.field499, class27.field500);
               method2543(6);
               break;
            case 3:
               method2555(class27.field532, class27.field502, class27.field307);
               break;
            case 4:
               method2555(class27.field504, class27.field505, class27.field489);
               break;
            case 5:
               method2555(class27.field507, class27.field508, class27.field501);
               break;
            case 6:
               method2555(class27.field510, class27.field271, class27.field374);
               break;
            case 7:
               method2555(class27.field239, class27.field514, class27.field338);
         }

      }
   }

   static void method2555(String var0, String var1, String var2) {
      field4234 = var0;
      field4232 = var1;
      field4233 = var2;
   }

   static void method2544() {
      if (class230.method1411()) {
         field4244 = true;
         field4246 = 0;
         field4251 = 0;
      }

   }

   static void method2551() {
      field4244 = false;
      field4223.method2012(field4219, 0);
      class119.field1486.method2012(field4219 + 382, 0);
      class409.field3154.method2000(382 + field4219 - class409.field3154.field3222 / 2, 18);
   }

   static void method2558() {
      method2543(24);
      method2555(class27.field481, class27.field468, class27.field469);
   }

   static void method2543(int var0) {
      if (var0 != field4230) {
         field4230 = var0;
      }
   }

   static void method2559(String var0) {
      field4237 = class311.method1681(var0);
   }
}
