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

public class class292 {
   static boolean field1988;
   static boolean field2004;
   static boolean field2008;
   static boolean field2011;
   static class296 field1987;
   static class501 field1982;
   static class501 field1985;
   static class501 field1986;
   static class501[] field1984;
   static int field1983 = 0;
   static int field1989;
   static int field1990;
   static int field1992;
   static int field1993;
   static int field1994;
   static int field1999;
   static int field2005;
   static int field2009;
   static int field2010;
   static int field2015;
   static String field1991;
   static String field1996;
   static String field1997;
   static String field1998;
   static String field2000;
   static String field2001;
   static String field2006;
   static String field2007;
   static String field2012;
   static String field2016;
   static String[] field1995;
   static String[] field2002;
   static String[] field2014;
   static String[] field2017;
   static long field2003;
   static long field2013;

   static {
      field1989 = field1983 + 202;
      field1990 = 10;
      field1991 = "";
      field1992 = -1;
      field1993 = 1;
      field1994 = 0;
      field2016 = "";
      field1998 = "";
      field1996 = "";
      field1997 = "";
      field2007 = "";
      field2000 = "";
      field1999 = 0;
      field2002 = new String[8];
      field2001 = "";
      field1988 = false;
      field2011 = false;
      field2004 = true;
      field2005 = 0;
      field2006 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef\u00bf\u00bd$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
      field2012 = "1234567890";
      field2008 = false;
      field2009 = -1;
      field2010 = 0;
      field2015 = 0;
      new DecimalFormat("##0.00");
      new class291();
      field2003 = -1L;
      field2013 = -1L;
      field1995 = new String[]{"title.jpg"};
      field2014 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field2017 = new String[]{"logo_speedrunning"};
   }

   class292() throws Throwable {
   }

   static void method1330(class509 var0, class509 var1, boolean var2, int var3) {
      if (class287.field1972) {
         if (var3 == 4) {
            method1316(4);
         }

      } else {
         if (var3 == 0) {
            class494.method2341(var2);
         } else {
            method1316(var3);
         }

         class427.method1965();
         byte[] var5 = var0.method2441("title.jpg", "");
         field1987 = class298.method1374(var5);
         class205.field1579 = field1987.method1338();
         int var6 = Client.field1117;
         if ((var6 & class145.field931.method180()) != 0) {
            class35.field308 = class382.method1766(var1, "logo_deadman_mode", "");
         } else if ((var6 & class145.field932.method180()) != 0) {
            class35.field308 = class382.method1766(var1, "logo_seasonal_mode", "");
         } else if ((var6 & class145.field910.method180()) != 0) {
            class35.field308 = class382.method1766(var1, "logo_speedrunning", "");
         } else {
            class35.field308 = class382.method1766(var1, "logo", "");
         }

         field1985 = class382.method1766(var1, "titlebox", "");
         class530.field4183 = class382.method1766(var1, "titlebutton", "");
         field1986 = class382.method1766(var1, "titlebutton_large", "");
         class532.field4213 = class382.method1766(var1, "play_now_text", "");
         class382.method1766(var1, "titlebutton_wide42,1", "");
         field1984 = class382.method1768(var1, "runes", "");
         class128.field805 = class382.method1768(var1, "title_mute", "");
         field1982 = class382.method1766(var1, "options_radio_buttons,0", "");
         class472.field3744 = class382.method1766(var1, "options_radio_buttons,4", "");
         class413.field2896 = class382.method1766(var1, "options_radio_buttons,2", "");
         class422.field2978 = class382.method1766(var1, "options_radio_buttons,6", "");
         class300.field2046 = field1982.field4005;
         class57.field462 = field1982.field4006;
         class84.field566 = new class445(field1984);
         if (var2) {
            field2007 = "";
            field2000 = "";
            field2002 = new String[8];
            field1999 = 0;
         }

         class182.field1457 = 0;
         class95.field666 = "";
         field2004 = true;
         field2008 = false;
         if (!class158.field1004.method529()) {
            ArrayList var7 = new ArrayList();
            var7.add(new class468(class339.field2531, "scape main", "", 255, false));
            class469.method2206(var7, 0, 0, 0, 100, false);
         } else {
            class283.method1299(0, 0);
         }

         class36.method156();
         class378.method1756().method126(false);
         class287.field1972 = true;
         field1983 = (class114.field730 - 765) / 2;
         field1989 = 202 + field1983;
         class439.field3479 = 180 + field1989;
         field1987.method1346(field1983, 0);
         class205.field1579.method1346(382 + field1983, 0);
         class35.field308.method2394(field1983 + 382 - class35.field308.field4005 / 2, 18);
      }
   }

   static String method1323() {
      String var1;
      if (class158.field1004.method513()) {
         String var3 = field2007;
         String var2 = class447.method2091('*', var3.length());
         var1 = var2;
      } else {
         var1 = field2007;
      }

      return var1;
   }

   static void method1322() {
      if (Client.field1170 && field2007 != null && field2007.length() > 0) {
         field2005 = 1;
      } else {
         field2005 = 0;
      }

   }

   static void method1329(class535 var0, class396 var1, class396 var2) {
      int var6;
      int var7;
      int var8;
      boolean var31;
      boolean var47;
      if (field2008) {
         class303 var27 = Client.method888();

         while(true) {
            if (!var27.method1386()) {
               if (class496.field3971 != 1 && (class301.field2050 || class496.field3971 != 4)) {
                  break;
               }

               int var5 = field1983 + 280;
               if (class496.field3972 >= var5 && class496.field3972 <= var5 + 14 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(0, 0);
                  break;
               }

               if (class496.field3972 >= var5 + 15 && class496.field3972 <= var5 + 80 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(0, 1);
                  break;
               }

               var6 = field1983 + 390;
               if (class496.field3972 >= var6 && class496.field3972 <= var6 + 14 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(1, 0);
                  break;
               }

               if (class496.field3972 >= var6 + 15 && class496.field3972 <= var6 + 80 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(1, 1);
                  break;
               }

               var7 = field1983 + 500;
               if (class496.field3972 >= var7 && class496.field3972 <= var7 + 14 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(2, 0);
                  break;
               }

               if (class496.field3972 >= var7 + 15 && class496.field3972 <= var7 + 80 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(2, 1);
                  break;
               }

               var8 = 610 + field1983;
               if (class496.field3972 >= var8 && class496.field3972 <= var8 + 14 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(3, 0);
                  break;
               }

               if (class496.field3972 >= var8 + 15 && class496.field3972 <= var8 + 80 && class496.field3973 >= 4 && class496.field3973 <= 18) {
                  class518.method2497(3, 1);
                  break;
               }

               if (class496.field3972 >= 708 + field1983 && class496.field3973 >= 4 && class496.field3972 <= 50 + 708 + field1983 && class496.field3973 <= 20) {
                  method1324();
                  break;
               }

               if (field2009 != -1) {
                  class518 var29 = class27.field263[field2009];
                  if (var29.method2481()) {
                     var29.field4153 = "beta";
                  }

                  var47 = false;
                  if (var29.field4142 != Client.field1117) {
                     boolean var46 = (Client.field1117 & class145.field918.method180()) != 0;
                     var31 = var29.method2481();
                     if (var46 && !var31 || !var46 && var31) {
                        var47 = true;
                     }
                  }

                  class451.method2106(var29);
                  method1324();
                  if (var47) {
                     Client.method926();
                  }
               } else {
                  if (field2010 > 0 && null != class204.field1574 && class496.field3972 >= 0 && class496.field3972 <= class204.field1574.field4005 && class496.field3973 >= class394.field2761 / 2 - 50 && class496.field3973 <= class394.field2761 / 2 + 50) {
                     --field2010;
                  }

                  if (field2010 < field2015 && null != class344.field2563 && class496.field3972 >= class114.field730 - class344.field2563.field4005 - 5 && class496.field3972 <= class114.field730 && class496.field3973 >= class394.field2761 / 2 - 50 && class496.field3973 <= class394.field2761 / 2 + 50) {
                     ++field2010;
                  }
               }
               break;
            }

            if (13 == var27.field2065) {
               method1324();
               break;
            }

            if (96 == var27.field2065) {
               if (field2010 > 0 && null != class204.field1574) {
                  --field2010;
               }
            } else if (97 == var27.field2065 && field2010 < field2015 && null != class344.field2563) {
               ++field2010;
            }
         }

      } else {
         if ((1 == class496.field3971 || !class301.field2050 && class496.field3971 == 4) && class496.field3972 >= field1983 + 765 - 50 && class496.field3973 >= 453) {
            class158.field1004.method528(!class158.field1004.method529());
            if (!class158.field1004.method529()) {
               ArrayList var4 = new ArrayList();
               var4.add(new class468(class339.field2531, "scape main", "", 255, false));
               class469.method2206(var4, 0, 0, 0, 100, false);
            } else {
               class283.method1299(0, 0);
            }

            class36.method156();
         }

         if (5 != Client.field1200) {
            if (-1L == field2003) {
               field2003 = class123.method471() + 1000L;
            }

            long var26 = class123.method471();
            if (Client.method813() && -1L == field2013) {
               field2013 = var26;
               if (field2013 > field2003) {
                  field2003 = field2013;
               }
            }

            if (10 == Client.field1200 || Client.field1200 == 11) {
               if (class367.field2654 == class103.field690) {
                  if (class496.field3971 == 1 || !class301.field2050 && 4 == class496.field3971) {
                     var6 = 5 + field1983;
                     var7 = 463;
                     var8 = 100;
                     byte var9 = 35;
                     if (class496.field3972 >= var6 && class496.field3972 <= var8 + var6 && class496.field3973 >= var7 && class496.field3973 <= var9 + var7) {
                        if (class518.method2494()) {
                           field2008 = true;
                           field2010 = 0;
                           field2015 = 0;
                        }

                        return;
                     }
                  }

                  if (class315.field2133 != null) {
                     method1317();
                  }
               }

               var6 = class496.field3971;
               var7 = class496.field3972;
               var8 = class496.field3973;
               if (var6 == 0) {
                  var7 = class496.field3977;
                  var8 = class496.field3960;
               }

               if (!class301.field2050 && var6 == 4) {
                  var6 = 1;
               }

               class303 var28 = Client.method888();
               int var11;
               short var32;
               if (0 == field1994) {
                  var47 = false;

                  while(var28.method1386()) {
                     if (var28.field2065 == 84) {
                        var47 = true;
                     }
                  }

                  var11 = class439.field3479 - 80;
                  var32 = 291;
                  if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                     class410.method1894(Client.method863("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var11 = 80 + class439.field3479;
                  if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20 || var47) {
                     if ((Client.field1117 & class145.field927.method180()) != 0) {
                        field2016 = "";
                        field1998 = class424.field3234;
                        field1996 = class424.field3225;
                        field1997 = class424.field3226;
                        method1316(1);
                        method1322();
                     } else if ((Client.field1117 & class145.field912.method180()) != 0) {
                        if ((Client.field1117 & class145.field933.method180()) != 0) {
                           field1998 = class424.field3221;
                           field1996 = class424.field3222;
                           field1997 = class424.field3223;
                        } else {
                           field1998 = class424.field3215;
                           field1996 = class424.field3216;
                           field1997 = class424.field3017;
                        }

                        field2016 = class424.field3030;
                        method1316(1);
                        method1322();
                     } else if ((Client.field1117 & class145.field933.method180()) != 0) {
                        field1998 = class424.field3306;
                        field1996 = class424.field3240;
                        field1997 = class424.field3300;
                        field2016 = class424.field3030;
                        method1316(1);
                        method1322();
                     } else {
                        class494.method2342(false);
                     }
                  }
               } else {
                  int var10;
                  short var33;
                  if (1 == field1994) {
                     while(true) {
                        if (!var28.method1386()) {
                           var10 = class439.field3479 - 80;
                           var33 = 321;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                              class494.method2342(false);
                           }

                           var10 = class439.field3479 + 80;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                              method1316(0);
                           }
                           break;
                        }

                        if (84 == var28.field2065) {
                           class494.method2342(false);
                        } else if (13 == var28.field2065) {
                           method1316(0);
                        }
                     }
                  } else {
                     int var15;
                     int var16;
                     short var30;
                     boolean var34;
                     if (field1994 == 2) {
                        var30 = 201;
                        var10 = var30 + 52;
                        if (var6 == 1 && var8 >= var10 - 12 && var8 < var10 + 2) {
                           field2005 = 0;
                        }

                        var10 += 15;
                        if (var6 == 1 && var8 >= var10 - 12 && var8 < var10 + 2) {
                           field2005 = 1;
                        }

                        var10 += 15;
                        var30 = 361;
                        if (class194.field1517 != null) {
                           var11 = class194.field1517.field1577 / 2;
                           if (var6 == 1 && var7 >= class194.field1517.field1578 - var11 && var7 <= var11 + class194.field1517.field1578 && var8 >= var30 - 15 && var8 < var30) {
                              switch (field1993) {
                                 case 1:
                                    class410.method1894(class424.field3195, true, false);
                                    return;
                                 case 2:
                                    class410.method1894("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var11 = class439.field3479 - 80;
                        var32 = 321;
                        if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                           field2007 = field2007.trim();
                           if (field2007.length() == 0) {
                              method1328(class424.field3122, class424.field3037, class424.field3124);
                              return;
                           }

                           if (field2000.length() == 0) {
                              method1328(class424.field3125, class424.field3126, class424.field3050);
                              return;
                           }

                           method1328(class424.field3228, class424.field3229, class424.field3214);
                           Client.method819(false);
                           Client.method904(20);
                           return;
                        }

                        var11 = 80 + 180 + field1989;
                        if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                           method1316(0);
                           field2007 = "";
                           field2000 = "";
                           class182.field1457 = 0;
                           class95.field666 = "";
                           field2004 = true;
                        }

                        var11 = -117 + class439.field3479;
                        var32 = 277;
                        field1988 = var7 >= var11 && var7 < class300.field2046 + var11 && var8 >= var32 && var8 < var32 + class57.field462;
                        if (var6 == 1 && field1988) {
                           Client.field1170 = !Client.field1170;
                           if (!Client.field1170 && class158.field1004.method521() != null) {
                              class158.field1004.method520((String)null);
                           }
                        }

                        var11 = 24 + class439.field3479;
                        var32 = 277;
                        field2011 = var7 >= var11 && var7 < var11 + class300.field2046 && var8 >= var32 && var8 < class57.field462 + var32;
                        if (var6 == 1 && field2011) {
                           class158.field1004.method530(!class158.field1004.method513());
                           if (!class158.field1004.method513()) {
                              field2007 = "";
                              class158.field1004.method520((String)null);
                              method1322();
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
                                       while(var28.method1386()) {
                                          if (var28.field2065 != 13) {
                                             if (field2005 != 0) {
                                                continue label1169;
                                             }

                                             method1320(var28.field2052);
                                             if (85 == var28.field2065 && field2007.length() > 0) {
                                                field2007 = field2007.substring(0, field2007.length() - 1);
                                             }

                                             if (84 == var28.field2065 || 80 == var28.field2065) {
                                                field2005 = 1;
                                             }

                                             if (method1321(var28.field2052) && field2007.length() < 320) {
                                                field2007 = field2007 + var28.field2052;
                                             }
                                          } else {
                                             method1316(0);
                                             field2007 = "";
                                             field2000 = "";
                                             class182.field1457 = 0;
                                             class95.field666 = "";
                                             field2004 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(field2005 != 1);

                                 if (var28.field2065 == 85 && field2000.length() > 0) {
                                    field2000 = field2000.substring(0, field2000.length() - 1);
                                 } else if (84 == var28.field2065 || var28.field2065 == 80) {
                                    field2005 = 0;
                                    if (84 == var28.field2065) {
                                       field2007 = field2007.trim();
                                       if (field2007.length() == 0) {
                                          method1328(class424.field3122, class424.field3037, class424.field3124);
                                          return;
                                       }

                                       if (field2000.length() == 0) {
                                          method1328(class424.field3125, class424.field3126, class424.field3050);
                                          return;
                                       }

                                       method1328(class424.field3228, class424.field3229, class424.field3214);
                                       Client.method819(false);
                                       Client.method904(20);
                                       return;
                                    }
                                 }

                                 if ((var28.method1385(82) || var28.method1385(87)) && 67 == var28.field2065) {
                                    Clipboard var43 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var44 = var43.getContents(class530.field4182);
                                    var15 = 20 - field2000.length();
                                    break;
                                 }

                                 char var41 = var28.field2052;
                                 if (var41 >= ' ' && var41 < 127 || var41 > 127 && var41 < 160 || var41 > 160 && var41 <= 255) {
                                    var34 = true;
                                 } else {
                                    label1408: {
                                       if (var41 != 0) {
                                          char[] var42 = class459.field3647;

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

                                 if (var34 && method1321(var28.field2052) && field2000.length() < 20) {
                                    field2000 = field2000 + var28.field2052;
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
                                          char[] var21 = class459.field3647;

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

                                 if (!var19 || !method1321(var45.charAt(var18))) {
                                    method1316(3);
                                    return;
                                 }
                              }

                              field2000 = field2000 + var45.substring(0, var17);
                           } catch (UnsupportedFlavorException var24) {
                           } catch (IOException var25) {
                           }
                        }
                     } else {
                        class205 var12;
                        if (3 == field1994) {
                           var10 = field1989 + 180;
                           var11 = 241;
                           var12 = var1.method1919(25, class424.field3249.length() - 34, class424.field3249, var10, var11);
                           if (var6 == 1 && var12.method1064(var7, var8, (byte)-32)) {
                              class410.method1894(class424.field3310, true, false);
                           }

                           var10 = 180 + field1989;
                           var11 = 276;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                              class494.method2341(false);
                           }

                           var10 = 180 + field1989;
                           var11 = 326;
                           if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                              class410.method1894(class424.field3195, true, false);
                              return;
                           }
                        } else {
                           int var13;
                           if (field1994 == 4) {
                              var10 = 180 + field1989 - 80;
                              var11 = 321;
                              if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                 class95.field666.trim();
                                 if (class95.field666.length() != 6) {
                                    method1328(class424.field3158, class424.field3042, class424.field3121);
                                    return;
                                 }

                                 class182.field1457 = Integer.parseInt(class95.field666);
                                 class95.field666 = "";
                                 Client.method819(true);
                                 method1328(class424.field3228, class424.field3229, class424.field3214);
                                 Client.method904(20);
                                 return;
                              }

                              if (var6 == 1 && var7 >= field1989 + 180 - 9 && var7 <= 130 + 180 + field1989 && var8 >= 263 && var8 <= 296) {
                                 field2004 = !field2004;
                              }

                              if (var6 == 1 && var7 >= 180 + field1989 - 34 && var7 <= 34 + 180 + field1989 && var8 >= 351 && var8 <= 363) {
                                 class410.method1894(class424.field3195, true, false);
                              }

                              var10 = 180 + field1989 + 80;
                              if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                 method1316(0);
                                 field2007 = "";
                                 field2000 = "";
                                 class182.field1457 = 0;
                                 class95.field666 = "";
                              }

                              while(var28.method1386()) {
                                 var31 = false;

                                 for(var13 = 0; var13 < field2012.length(); ++var13) {
                                    if (var28.field2052 == field2012.charAt(var13)) {
                                       var31 = true;
                                       break;
                                    }
                                 }

                                 if (var28.field2065 == 13) {
                                    method1316(0);
                                    field2007 = "";
                                    field2000 = "";
                                    class182.field1457 = 0;
                                    class95.field666 = "";
                                 } else {
                                    if (85 == var28.field2065 && class95.field666.length() > 0) {
                                       class95.field666 = class95.field666.substring(0, class95.field666.length() - 1);
                                    }

                                    if (84 == var28.field2065) {
                                       class95.field666.trim();
                                       if (class95.field666.length() != 6) {
                                          method1328(class424.field3158, class424.field3042, class424.field3121);
                                          return;
                                       }

                                       class182.field1457 = Integer.parseInt(class95.field666);
                                       class95.field666 = "";
                                       Client.method819(true);
                                       method1328(class424.field3228, class424.field3229, class424.field3214);
                                       Client.method904(20);
                                       return;
                                    }

                                    if (var31 && class95.field666.length() < 6) {
                                       class95.field666 = class95.field666 + var28.field2052;
                                    }
                                 }
                              }
                           } else {
                              int var14;
                              if (5 == field1994) {
                                 var10 = 180 + field1989 - 80;
                                 var11 = 321;
                                 if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                    method1319();
                                    return;
                                 }

                                 var10 = 80 + 180 + field1989;
                                 if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                    class494.method2342(true);
                                 }

                                 var32 = 361;
                                 if (null != class67.field520) {
                                    var13 = class67.field520.field1577 / 2;
                                    if (var6 == 1 && var7 >= class67.field520.field1578 - var13 && var7 <= class67.field520.field1578 + var13 && var8 >= var32 - 15 && var8 < var32) {
                                       class410.method1894(Client.method863("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                    }
                                 }

                                 while(var28.method1386()) {
                                    var34 = false;

                                    for(var14 = 0; var14 < field2006.length(); ++var14) {
                                       if (var28.field2052 == field2006.charAt(var14)) {
                                          var34 = true;
                                          break;
                                       }
                                    }

                                    if (13 == var28.field2065) {
                                       class494.method2342(true);
                                    } else {
                                       if (85 == var28.field2065 && field2007.length() > 0) {
                                          field2007 = field2007.substring(0, field2007.length() - 1);
                                       }

                                       if (84 == var28.field2065) {
                                          method1319();
                                          return;
                                       }

                                       if (var34 && field2007.length() < 320) {
                                          field2007 = field2007 + var28.field2052;
                                       }
                                    }
                                 }
                              } else if (field1994 != 6) {
                                 if (7 == field1994) {
                                    if (class451.field3572 && !Client.field1351) {
                                       var10 = class439.field3479 - 150;
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

                                          field1999 = var14;
                                       }

                                       var14 = 180 + field1989 - 80;
                                       short var36 = 321;
                                       boolean var40;
                                       if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var36 - 20 && var8 <= var36 + 20) {
                                          var40 = method1318();
                                          if (var40) {
                                             Client.method904(50);
                                             return;
                                          }
                                       }

                                       var14 = field1989 + 180 + 80;
                                       if (var6 == 1 && var7 >= var14 - 75 && var7 <= var14 + 75 && var8 >= var36 - 20 && var8 <= var36 + 20) {
                                          field2002 = new String[8];
                                          class494.method2342(true);
                                       }

                                       while(var28.method1386()) {
                                          if (var28.field2065 == 101) {
                                             field2002[field1999] = null;
                                          }

                                          if (85 == var28.field2065) {
                                             if (field2002[field1999] == null && field1999 > 0) {
                                                --field1999;
                                             }

                                             field2002[field1999] = null;
                                          }

                                          if (var28.field2052 >= '0' && var28.field2052 <= '9') {
                                             field2002[field1999] = "" + var28.field2052;
                                             if (field1999 < 7) {
                                                ++field1999;
                                             }
                                          }

                                          if (var28.field2065 == 84) {
                                             var40 = method1318();
                                             if (var40) {
                                                Client.method904(50);
                                             }

                                             return;
                                          }
                                       }
                                    } else {
                                       var10 = 180 + field1989 - 80;
                                       var11 = 321;
                                       if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                          class410.method1894(Client.method863("secure", true) + "m=dob/set_dob.ws", true, false);
                                          method1328(class424.field3259, class424.field3260, class424.field3144);
                                          method1316(6);
                                          return;
                                       }

                                       var10 = 80 + field1989 + 180;
                                       if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                                          class494.method2342(true);
                                       }
                                    }
                                 } else if (field1994 == 8) {
                                    var10 = 180 + field1989 - 80;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class410.method1894("https://www.jagex.com/terms/privacy", true, false);
                                       method1328(class424.field3259, class424.field3260, class424.field3144);
                                       method1316(6);
                                       return;
                                    }

                                    var10 = field1989 + 180 + 80;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class494.method2342(true);
                                    }
                                 } else if (field1994 == 9) {
                                    var10 = 180 + field1989;
                                    var33 = 311;
                                    if (var28.field2065 == 84 || 13 == var28.field2065 || var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class494.method2341(false);
                                    }
                                 } else if (10 == field1994) {
                                    var10 = 180 + field1989;
                                    var33 = 209;
                                    if (var28.field2065 == 84 || var6 == 1 && var7 >= var10 - 109 && var7 <= var10 + 109 && var8 >= var33 && var8 <= var33 + 68) {
                                       method1328(class424.field3228, class424.field3229, class424.field3214);
                                       Client.field1161 = class256.field1845;
                                       Client.method819(false);
                                       Client.method904(20);
                                    }
                                 } else if (field1994 == 12) {
                                    var10 = class439.field3479;
                                    var33 = 233;
                                    var12 = var2.method1919(0, 30, class424.field3291, var10, var33);
                                    class205 var35 = var2.method1919(32, 32, class424.field3291, var10, var33);
                                    class205 var37 = var2.method1919(70, 34, class424.field3291, var10, var33);
                                    var11 = var33 + 17;
                                    class205 var38 = var2.method1919(0, 34, class424.field3292, var10, var11);
                                    if (var6 == 1) {
                                       if (var12.method1064(var7, var8, (byte)-43)) {
                                          class410.method1894("https://www.jagex.com/terms", true, false);
                                       } else if (var35.method1064(var7, var8, (byte)-50)) {
                                          class410.method1894("https://www.jagex.com/terms/privacy", true, false);
                                       } else if (var37.method1064(var7, var8, (byte)-15) || var38.method1064(var7, var8, (byte)-15)) {
                                          class410.method1894("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                       }
                                    }

                                    var10 = class439.field3479 - 80;
                                    var33 = 311;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       Client.method777();
                                       class494.method2341(true);
                                    }

                                    var10 = class439.field3479 + 80;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       field1994 = 13;
                                    }
                                 } else if (field1994 == 13) {
                                    var10 = class439.field3479;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class494.method2341(true);
                                    }
                                 } else if (field1994 == 14) {
                                    String var39 = "";
                                    switch (field1992) {
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
                                          class494.method2342(false);
                                    }

                                    var11 = field1989 + 180;
                                    var32 = 276;
                                    if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                                       class410.method1894(var39, true, false);
                                       method1328(class424.field3259, class424.field3260, class424.field3144);
                                       method1316(6);
                                       return;
                                    }

                                    var11 = 180 + field1989;
                                    var32 = 326;
                                    if (var6 == 1 && var7 >= var11 - 75 && var7 <= var11 + 75 && var8 >= var32 - 20 && var8 <= var32 + 20) {
                                       class494.method2342(false);
                                    }
                                 } else if (field1994 == 24) {
                                    var10 = field1989 + 180;
                                    var33 = 301;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class494.method2341(false);
                                    }
                                 } else if (field1994 == 32) {
                                    var10 = field1989 + 180 - 80;
                                    var33 = 321;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class410.method1894(Client.method863("secure", true) + "m=dob/set_dob.ws", true, false);
                                       method1328(class424.field3259, class424.field3260, class424.field3144);
                                       method1316(6);
                                       return;
                                    }

                                    var10 = 80 + 180 + field1989;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class494.method2342(true);
                                    }
                                 } else if (33 == field1994) {
                                    var10 = field1989 + 180;
                                    var33 = 276;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class410.method1894(class424.field3310, true, false);
                                    }

                                    var10 = field1989 + 180;
                                    var33 = 326;
                                    if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var8 >= var33 - 20 && var8 <= var33 + 20) {
                                       class494.method2342(true);
                                    }
                                 }
                              } else {
                                 while(true) {
                                    do {
                                       if (!var28.method1386()) {
                                          var30 = 321;
                                          if (var6 == 1 && var8 >= var30 - 20 && var8 <= var30 + 20) {
                                             class494.method2342(true);
                                          }

                                          return;
                                       }
                                    } while(84 != var28.field2065 && var28.field2065 != 13);

                                    class494.method2342(true);
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

   static boolean method1318() {
      Date var1;
      try {
         var1 = class163.method624();
      } catch (ParseException var5) {
         method1326("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
         return false;
      }

      if (var1 == null) {
         return false;
      } else {
         boolean var2 = method1325(var1);
         Date var4 = method1327();
         boolean var3 = var1.after(var4);
         if (!var3) {
            method1316(7);
            method1328("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
         } else {
            if (!var2) {
               class332.field2499 = 8388607;
            } else {
               class332.field2499 = (int)(var1.getTime() / 86400000L - 11745L);
            }

            return true;
         }
      }
   }

   static Date method1327() {
      Calendar var1 = Calendar.getInstance();
      var1.set(2, 0);
      var1.set(5, 1);
      var1.set(1, 1900);
      return var1.getTime();
   }

   static boolean method1325(Date var0) {
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

   static void method1326(String var0, String var1, String var2) {
      method1316(7);
      method1328(var0, var1, var2);
   }

   static boolean method1320(char var0) {
      for(int var2 = 0; var2 < field2006.length(); ++var2) {
         if (var0 == field2006.charAt(var2)) {
            return true;
         }
      }

      return false;
   }

   static boolean method1321(char var0) {
      return field2006.indexOf(var0) != -1;
   }

   static void method1319() {
      field2007 = field2007.trim();
      if (field2007.length() == 0) {
         method1328(class424.field3262, class424.field3263, class424.field3264);
      } else {
         long var2;
         try {
            URL var4 = new URL(Client.method863("services", false) + "m=accountappeal/login.ws");
            URLConnection var5 = var4.openConnection();
            var5.setRequestProperty("connection", "close");
            var5.setDoInput(true);
            var5.setDoOutput(true);
            var5.setConnectTimeout(5000);
            OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
            var6.write("data1=req");
            var6.flush();
            InputStream var7 = var5.getInputStream();
            class366 var8 = new class366(new byte[1000]);

            while(true) {
               int var9 = var7.read(var8.field2650, var8.field2652, 1000 - var8.field2652);
               if (var9 == -1) {
                  var8.field2652 = 0;
                  long var12 = var8.method1659();
                  var2 = var12;
                  break;
               }

               var8.field2652 += var9;
               if (var8.field2652 >= 1000) {
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
            var1 = class332.method1563(var2, field2007);
         }

         switch (var1) {
            case 2:
               method1328(class424.field3265, class424.field3266, class424.field3267);
               method1316(6);
               break;
            case 3:
               method1328(class424.field3299, class424.field3269, class424.field3074);
               break;
            case 4:
               method1328(class424.field3271, class424.field3272, class424.field3256);
               break;
            case 5:
               method1328(class424.field3274, class424.field3275, class424.field3268);
               break;
            case 6:
               method1328(class424.field3277, class424.field3038, class424.field3141);
               break;
            case 7:
               method1328(class424.field3006, class424.field3281, class424.field3105);
         }

      }
   }

   static void method1328(String var0, String var1, String var2) {
      field1998 = var0;
      field1996 = var1;
      field1997 = var2;
   }

   static void method1317() {
      if (class518.method2494()) {
         field2008 = true;
         field2010 = 0;
         field2015 = 0;
      }

   }

   static void method1324() {
      field2008 = false;
      field1987.method1346(field1983, 0);
      class205.field1579.method1346(field1983 + 382, 0);
      class35.field308.method2394(382 + field1983 - class35.field308.field4005 / 2, 18);
   }

   static void method1331() {
      method1316(24);
      method1328(class424.field3248, class424.field3235, class424.field3236);
   }

   static void method1316(int var0) {
      if (var0 != field1994) {
         field1994 = var0;
      }
   }

   static void method1332(String var0) {
      field2001 = class462.method2176(var0);
   }
}
