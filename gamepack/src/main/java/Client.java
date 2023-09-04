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

public final class Client extends class210 implements class161, OAuthApi, class285 {
   public static boolean field603 = false;
   public static class480 field760;
   public static int field576 = 1;
   public static int field664;
   public static int field699;
   public static int field758 = 216;
   public static final class348 field641;
   static boolean field580 = false;
   static boolean field587 = false;
   static boolean field589 = true;
   static boolean field595 = true;
   static boolean field616 = true;
   static boolean field630;
   static boolean field640;
   static boolean field643;
   static boolean field652;
   static boolean field661;
   static boolean field668;
   static boolean field677;
   static boolean field679;
   static boolean field689;
   static boolean field702;
   static boolean field709;
   static boolean field723;
   static boolean field734;
   static boolean field736;
   static boolean field765;
   static boolean field771;
   static boolean field807;
   static boolean field811 = false;
   static boolean field812;
   static boolean field814;
   static boolean field837;
   static boolean field838;
   static boolean field839;
   static boolean field840;
   static boolean field843;
   static boolean field848;
   static boolean field865;
   static boolean field872;
   static boolean[] field586;
   static boolean[] field713;
   static boolean[] field733;
   static boolean[] field799;
   static boolean[] field800;
   static boolean[] field844;
   static byte[] field859;
   static class126 field866;
   static class140 field621;
   static class158 field826;
   static class15[] field820;
   static class17 field724;
   static class177[] field854;
   static class201 field703;
   static class201 field717;
   static class201 field777;
   static class201 field791;
   static class201 field793;
   static class201 field830;
   static class201 field846;
   static class201[][][] field716;
   static class213 field815;
   static class221 field841;
   static class229 field862;
   static class277 field608;
   static class278[] field651;
   static class290[] field821;
   static class300 field605;
   static class300 field606;
   static class307 field721;
   static class354 field867;
   static class364 field662;
   static class364 field772;
   static class371 field631;
   static class404[] field620;
   static class427 field656;
   static class427[] field834;
   static class433[] field636;
   static class480 field753;
   static class480 field764;
   static class480 field779;
   static class480 field869;
   static class481 field644;
   static class522[] field749;
   static class540 field790;
   static class74 field632;
   static class74 field658;
   static class79 field597;
   static class79 field795;
   static int field577 = 0;
   static int field578;
   static int field579;
   static int field581 = -1;
   static int field582 = -1;
   static int field584;
   static int field588;
   static int field590;
   static int field591;
   static int field592 = -1;
   static int field593 = -1;
   static int field594 = -1;
   static int field596 = 0;
   static int field598 = 0;
   static int field600 = 0;
   static int field601 = 0;
   static int field607 = 0;
   static int field609;
   static int field610;
   static int field611;
   static int field612;
   static int field613;
   static int field614;
   static int field615;
   static int field617 = 0;
   static int field628;
   static int field629;
   static int field637;
   static int field642;
   static int field646;
   static int field647;
   static int field648;
   static int field649;
   static int field650;
   static int field654 = 0;
   static int field655;
   static int field657;
   static int field659;
   static int field660 = 0;
   static int field665;
   static int field666;
   static int field667;
   static int field669;
   static int field670;
   static int field671;
   static int field672;
   static int field673;
   static int field674;
   static int field675;
   static int field676;
   static int field678;
   static int field680;
   static int field681;
   static int field682;
   static int field686;
   static int field690;
   static int field693;
   static int field694;
   static int field695;
   static int field696;
   static int field697;
   static int field701;
   static int field704;
   static int field705;
   static int field707;
   static int field710;
   static int field714;
   static int field715;
   static int field718;
   static int field725;
   static int field732;
   static int field737;
   static int field738;
   static int field739;
   static int field740;
   static int field741;
   static int field743 = 0;
   static int field744;
   static int field746;
   static int field747;
   static int field748;
   static int field750;
   static int field751;
   static int field752;
   static int field754;
   static int field755;
   static int field756;
   static int field762;
   static int field763 = 0;
   static int field766;
   static int field767;
   static int field768;
   static int field774;
   static int field776;
   static int field778;
   static int field780;
   static int field781;
   static int field782;
   static int field783;
   static int field784;
   static int field785;
   static int field786;
   static int field789;
   static int field792;
   static int field796 = 0;
   static int field797;
   static int field805;
   static int field809;
   static int field810;
   static int field813;
   static int field816;
   static int field822;
   static int field823;
   static int field827;
   static int field829;
   static int field831;
   static int field835;
   static int field845;
   static int field847;
   static int field857;
   static int field858;
   static int field861;
   static int field863;
   static int field864;
   static int field870;
   static int field874;
   static int field875;
   static int field879 = 0;
   static int[] field575;
   static int[] field583;
   static int[] field602;
   static int[] field635;
   static int[] field638;
   static int[] field683;
   static int[] field684;
   static int[] field687;
   static int[] field688;
   static int[] field700;
   static int[] field708;
   static int[] field720;
   static int[] field726;
   static int[] field727;
   static int[] field729;
   static int[] field730;
   static int[] field757;
   static int[] field769;
   static int[] field773;
   static int[] field775;
   static int[] field787;
   static int[] field788;
   static int[] field794;
   static int[] field798;
   static int[] field801;
   static int[] field802;
   static int[] field803;
   static int[] field804;
   static int[] field808;
   static int[] field817;
   static int[] field818;
   static int[] field824;
   static int[] field825;
   static int[] field832;
   static int[] field833;
   static int[] field836;
   static int[] field842;
   static int[] field860;
   static int[] field868;
   static int[] field871;
   static int[] field877;
   static int[] field878;
   static int[][] field585;
   static int[][] field692;
   static int[][][] field653;
   static String field604;
   static String field742;
   static String field759;
   static String field770;
   static String[] field599;
   static String[] field691;
   static String[] field731;
   static String[] field850;
   static ArrayList field873;
   static HashMap field645;
   static List field745;
   static long field639 = -1L;
   static long field706;
   static long field719 = -1L;
   static long field806;
   static long field819;
   static long[] field722;
   static short field685;
   static short field735;
   static short field849;
   static short field851;
   static short field852;
   static short field853;
   static short field855;
   static short field856;
   static final class402 field876;
   static final int[] field711;
   static final int[] field761;
   static final String field712;
   static final String field828;
   boolean field623 = false;
   class184 field663;
   class248 field619;
   class310 field625;
   class310 field698;
   class403 field633;
   OtlTokenRequester field728;
   RefreshAccessTokenRequester field626;
   int field624 = 0;
   String field618;
   Future field622;
   Future field627;
   long field634 = -1L;

   static {
      field605 = class300.field2505;
      field606 = class300.field2505;
      field640 = false;
      field608 = class277.field2377;
      field609 = 0;
      field610 = 0;
      field756 = 0;
      field612 = 0;
      field591 = 0;
      field642 = 0;
      field714 = 0;
      field826 = class158.field1686;
      field621 = class140.field1586;
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

      String var0 = class303.method1663(var3, 0, var3.length);
      field828 = var0;
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

      var0 = class303.method1663(var3, 0, var3.length);
      field712 = var0;
      field630 = false;
      field631 = new class371();
      field859 = null;
      field636 = new class433[65536];
      field637 = 0;
      field575 = new int[65536];
      field690 = 0;
      field787 = new int[250];
      field641 = new class348();
      field629 = 0;
      field643 = false;
      field644 = new class481();
      field645 = new HashMap();
      field646 = 0;
      field680 = 1;
      field648 = 0;
      field649 = 1;
      field650 = 0;
      field651 = new class278[4];
      field652 = false;
      field653 = new int[4][13][13];
      field761 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field655 = 0;
      field657 = 2301979;
      field768 = 5063219;
      field659 = 3353893;
      field847 = 7759444;
      field661 = false;
      field780 = 0;
      field615 = 128;
      field754 = 0;
      field665 = 0;
      field666 = 0;
      field588 = 0;
      field732 = 0;
      field669 = 0;
      field670 = 50;
      field671 = 0;
      field672 = 0;
      field673 = 0;
      field674 = 12;
      field675 = 6;
      field676 = 0;
      field677 = false;
      field678 = 0;
      field679 = false;
      field718 = 0;
      field681 = 0;
      field613 = 50;
      field683 = new int[field613];
      field684 = new int[field613];
      field635 = new int[field613];
      field860 = new int[field613];
      field687 = new int[field613];
      field688 = new int[field613];
      field585 = new int[field613][];
      field836 = new int[field613];
      field691 = new String[field613];
      field692 = new int[104][104];
      field746 = 0;
      field694 = -1;
      field695 = -1;
      field696 = 0;
      field697 = 0;
      field755 = 0;
      field813 = 0;
      field865 = true;
      field701 = 0;
      field702 = true;
      field749 = new class522[2048];
      field704 = -1;
      field705 = 0;
      field706 = -1L;
      field814 = true;
      field579 = 0;
      field845 = 0;
      field602 = new int[1000];
      field711 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field599 = new String[8];
      field713 = new boolean[8];
      field757 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field715 = -1;
      field716 = new class201[4][104][104];
      field717 = new class201();
      field703 = new class201();
      field846 = new class201();
      field720 = new int[25];
      field868 = new int[25];
      field871 = new int[25];
      field723 = false;
      field689 = false;
      field725 = 0;
      field726 = new int[500];
      field727 = new int[500];
      field769 = new int[500];
      field729 = new int[500];
      field730 = new int[500];
      field731 = new String[500];
      field850 = new String[500];
      field733 = new boolean[500];
      field734 = false;
      field709 = false;
      field736 = true;
      field737 = -1;
      field738 = -1;
      field739 = 0;
      field740 = 50;
      field741 = 0;
      field742 = null;
      field668 = false;
      field744 = -1;
      field710 = -1;
      field759 = null;
      field770 = null;
      field748 = -1;
      field597 = new class79(8);
      field590 = 0;
      field751 = -1;
      field752 = 0;
      field753 = null;
      field693 = 0;
      field863 = 0;
      field664 = 0;
      field611 = -1;
      field872 = false;
      field869 = null;
      field760 = null;
      field779 = null;
      field762 = 0;
      field835 = 0;
      field764 = null;
      field765 = false;
      field766 = -1;
      field767 = -1;
      field812 = false;
      field614 = -1;
      field686 = -1;
      field771 = false;
      field578 = 1;
      field773 = new int[32];
      field774 = 0;
      field775 = new int[32];
      field776 = 0;
      field700 = new int[32];
      field778 = 0;
      field842 = new int[32];
      field707 = 0;
      field781 = 0;
      field782 = 0;
      field783 = 0;
      field784 = 0;
      field785 = 0;
      field786 = 0;
      field647 = 0;
      field628 = 0;
      field789 = 0;
      field790 = new class540();
      field791 = new class201();
      field777 = new class201();
      field793 = new class201();
      field830 = new class201();
      field795 = new class79(512);
      field747 = 0;
      field797 = -2;
      field586 = new boolean[100];
      field799 = new boolean[100];
      field800 = new boolean[100];
      field801 = new int[100];
      field802 = new int[100];
      field803 = new int[100];
      field804 = new int[100];
      field805 = 0;
      field806 = 0L;
      field807 = true;
      field808 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field809 = 0;
      field810 = 0;
      field604 = "";
      field722 = new long[100];
      field584 = 0;
      field724 = new class17();
      field815 = new class213();
      field816 = 0;
      field817 = new int[128];
      field818 = new int[128];
      field819 = -1L;
      field820 = new class15[4];
      field821 = new class290[4];
      field822 = -1;
      field823 = 0;
      field824 = new int[1000];
      field825 = new int[1000];
      field834 = new class427[1000];
      field827 = 0;
      field750 = 0;
      field829 = 0;
      field848 = false;
      field831 = 0;
      field832 = new int[50];
      field833 = new int[50];
      field788 = new int[50];
      field583 = new int[50];
      field620 = new class404[50];
      field837 = false;
      field838 = false;
      field839 = false;
      field840 = false;
      field841 = null;
      field632 = null;
      field658 = null;
      field843 = false;
      field844 = new boolean[5];
      field638 = new int[5];
      field798 = new int[5];
      field708 = new int[5];
      field794 = new int[5];
      field849 = 256;
      field735 = 205;
      field851 = 256;
      field852 = 320;
      field853 = 1;
      field685 = 32767;
      field855 = 1;
      field856 = 32767;
      field857 = 0;
      field858 = 0;
      field792 = 0;
      field667 = 0;
      field861 = 0;
      field862 = new class229();
      field682 = -1;
      field864 = -1;
      field721 = new class506();
      field854 = new class177[8];
      field866 = new class126();
      field867 = new class354(8, class260.field2282);
      field772 = new class364(64);
      field662 = new class364(64);
      field870 = -1;
      field699 = -1;
      field745 = new ArrayList();
      field873 = new ArrayList(10);
      field874 = 0;
      field875 = 0;
      field876 = new class402();
      field877 = new int[50];
      field878 = new int[50];
   }

   protected final void method1290() {
   }

   public final void init() {
      if (this.method1293()) {
         for(int var1 = 0; var1 <= 28; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               switch (var1) {
                  case 3:
                     if (var2.equalsIgnoreCase(class357.field2801)) {
                        field603 = true;
                     } else {
                        field603 = false;
                     }
                     break;
                  case 4:
                     if (field582 == -1) {
                        field582 = Integer.parseInt(var2);
                     }
                     break;
                  case 5:
                     field577 = Integer.parseInt(var2);
                     break;
                  case 6:
                     class219.field2034 = class121.method851(Integer.parseInt(var2));
                     break;
                  case 7:
                     int var4 = Integer.parseInt(var2);
                     class464[] var5 = class464.method2267();
                     int var6 = 0;

                     class464 var12;
                     while(true) {
                        if (var6 >= var5.length) {
                           var12 = null;
                           break;
                        }

                        class464 var7 = var5[var6];
                        if (var4 == var7.field3600) {
                           var12 = var7;
                           break;
                        }

                        ++var6;
                     }

                     class238.field2182 = var12;
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase(class357.field2801)) {
                     }
                     break;
                  case 9:
                     class267.field2298 = var2;
                     break;
                  case 10:
                     class442[] var11 = new class442[]{class442.field3351, class442.field3358, class442.field3352, class442.field3357, class442.field3353, class442.field3355};
                     class521.field4093 = (class442)class341.method1788(var11, Integer.parseInt(var2));
                     if (class442.field3355 == class521.field4093) {
                        class121.field1501 = class246.field2215;
                     } else {
                        class121.field1501 = class246.field2217;
                     }
                     break;
                  case 11:
                     class38.field922 = var2;
                     break;
                  case 12:
                     field576 = Integer.parseInt(var2);
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
                     class521.field4092 = Integer.parseInt(var2);
                     break;
                  case 15:
                     field601 = Integer.parseInt(var2);
                     break;
                  case 17:
                     class220.field2039 = var2;
                     break;
                  case 21:
                     field581 = Integer.parseInt(var2);
                     break;
                  case 25:
                     int var3 = var2.indexOf(".");
                     if (var3 == -1) {
                        field758 = Integer.parseInt(var2);
                     } else {
                        field758 = Integer.parseInt(var2.substring(0, var3));
                        Integer.parseInt(var2.substring(var3 + 1));
                     }
               }
            }
         }

         class175.field1768 = false;
         field580 = false;
         class381.field3055 = this.getCodeBase().getHost();
         class40.field923 = new class14();
         String var9 = class238.field2182.field3595;
         byte var10 = 0;
         if ((field577 & class38.field905.method1195()) != 0) {
            class462.field3591 = "beta";
         }

         try {
            class237.method1427("oldschool", class462.field3591, var9, var10, 22);
         } catch (Exception var8) {
            class194.method1208((String)null, var8);
         }

         class191.field1877 = this;
         class340.field2724 = field582;
         method402();
         if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field623 = true;
         }

         if (field594 == -1) {
            if (!this.method360() && !this.method383((byte)106)) {
               field594 = 0;
            } else {
               field594 = 5;
            }
         }

         this.method1285(765, 503, 216, 1);
      }
   }

   protected void finalize() throws Throwable {
      class228.method1380(this);
      super.finalize();
   }

   boolean method388() {
      return this.field624 == 1;
   }

   public void setClient(int var1) {
      this.field624 = var1;
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (null != var1) {
         this.field728 = var1;
         class534.method2543(10);
      }
   }

   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field626 = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return field660 == 10;
   }

   public long getAccountHash() {
      return this.field634;
   }

   boolean method360() {
      return null != class297.field2482 && !class297.field2482.trim().isEmpty() && class355.field2794 != null && !class355.field2794.trim().isEmpty();
   }

   boolean method383(byte var1) {
      boolean var10000;
      if (null != class343.field2736) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         if (!class343.field2736.trim().isEmpty()) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (class327.field2639 != null) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (!class327.field2639.trim().isEmpty()) {
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

   boolean method361() {
      return null != this.field728;
   }

   void method386(String var1) throws IOException {
      HashMap var3 = new HashMap();
      var3.put("grant_type", "refresh_token");
      var3.put("scope", "gamesso.token.create");
      var3.put("refresh_token", var1);
      URL var4 = new URL(class38.field922 + "shield/oauth/token" + (new class21(var3)).method239());
      class98 var5 = new class98();
      if (this.method388()) {
         var5.method736(field712);
      } else {
         var5.method736(field828);
      }

      var5.method735("Host", (new URL(class38.field922)).getHost());
      var5.method738(class509.field3973);
      class355 var6 = class355.field2787;
      RefreshAccessTokenRequester var7 = this.field626;
      if (null != var7) {
         this.field627 = var7.request(var6.method1823(), var4, var5.method734(), "");
      } else {
         class383 var8 = new class383(var4, var6, var5, this.field623);
         this.field625 = this.field619.method1452(var8);
      }
   }

   void method362(String var1) throws IOException {
      URL var3 = new URL(class38.field922 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      class98 var4 = new class98();
      var4.method745(var1);
      class355 var5 = class355.field2786;
      OtlTokenRequester var6 = this.field728;
      if (null != var6) {
         this.field622 = var6.request(var5.method1823(), var3, var4.method734(), "");
      } else {
         class383 var7 = new class383(var3, var5, var4, this.field623);
         this.field698 = this.field619.method1452(var7);
      }
   }

   void method382(String var1, String var2) throws IOException, JSONException {
      URL var4 = new URL(class38.field922 + "game-session/v1/tokens");
      class383 var5 = new class383(var4, class355.field2787, this.field623);
      var5.method1894().method745(var1);
      var5.method1894().method738(class509.field3973);
      JSONObject var6 = new JSONObject();
      var6.put("accountId", var2);
      var5.method1890(new class261(var6));
      this.field698 = this.field619.method1452(var5);
   }

   protected final void method1296() {
      class218.method1317(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      class91.field1287 = field601 == 0 ? '\uaa4a' : field576 + '\u9c40';
      class382.field3062 = field601 == 0 ? 443 : field576 + '\uc350';
      class245.field2206 = class91.field1287;
      class539.field4264 = class519.field4075;
      class527.field4149 = class519.field4078;
      class229.field2121 = class519.field4076;
      class229.field2128 = class519.field4077;
      class19.field209 = new class426(this.field623, 216);
      this.method1271();
      this.method1273();
      class317.field2583 = this.method1300();
      this.method1298(field815, 0);
      this.method1298(field724, 1);
      class222.field2041 = new class347(255, class237.field2172, class237.field2173, 500000);
      class472 var3 = null;
      class497 var4 = new class497();

      try {
         var3 = class237.method1426("", class521.field4093.field3356, false);
         byte[] var5 = new byte[(int)var3.method2282()];

         int var7;
         for(int var6 = 0; var6 < var5.length; var6 += var7) {
            var7 = var3.method2283(var5, var6, var5.length - var6);
            if (var7 == -1) {
               throw new IOException();
            }
         }

         var4 = new class497(new class184(var5));
      } catch (Exception var9) {
      }

      try {
         if (null != var3) {
            var3.method2284();
         }
      } catch (Exception var8) {
      }

      class4.field36 = var4;
      this.method1268();
      class352.method1811(this, class310.field2552);
      class353.method1816(class4.field36.method2420());
      class314.field2562 = new class258(class121.field1501);
      this.field619 = new class248("tokenRequest", 1, 1);
      if (!class228.field2108.contains(this)) {
         class228.field2108.add(this);
      }

      class377.field3054 = new class242[1];
      class459 var10 = class459.field3571;
      class377.field3054[0] = new class242(var10.field3573, var10.field3578);
   }

   protected final void method1297() {
      ++field879;
      this.method365();

      while(true) {
         class301 var2;
         synchronized(class407.field3146) {
            var2 = (class301)class407.field3144.method1234();
         }

         if (null == var2) {
            boolean var8 = class228.method1382();
            if (var8 && field848 && null != class209.field1963) {
               class209.field1963.method1758();
            }

            method514();
            field724.method166();
            this.method1272();
            synchronized(class441.field3346) {
               class441.field3339 = class441.field3335;
               class441.field3349 = class441.field3336;
               class441.field3332 = class441.field3337;
               class441.field3340 = class441.field3338;
               class441.field3343 = class441.field3341;
               class441.field3344 = class441.field3350;
               class441.field3345 = class441.field3348;
               class441.field3333 = class441.field3342;
               class441.field3341 = 0;
            }

            if (null != class317.field2583) {
               int var3 = class317.field2583.method2250();
               field789 = var3;
            }

            if (field660 == 0) {
               method482();
               class210.method1301();
            } else if (field660 == 5) {
               class534.method2556(this, class103.field1341, class253.field2234);
               method482();
               class210.method1301();
            } else if (field660 != 10 && field660 != 11) {
               if (field660 == 20) {
                  class534.method2556(this, class103.field1341, class253.field2234);
                  this.method366();
               } else if (field660 == 50) {
                  class534.method2556(this, class103.field1341, class253.field2234);
                  this.method366();
               } else if (field660 == 25) {
                  method531();
               }
            } else {
               class534.method2556(this, class103.field1341, class253.field2234);
            }

            if (field660 == 30) {
               this.method385();
            } else if (field660 == 40 || field660 == 45) {
               this.method366();
            }

            return;
         }

         var2.field2514.method254(var2.field2513, (int)var2.field1078, var2.field2511, false);
      }
   }

   protected final void method1286(boolean var1) {
      if ((field660 == 10 || field660 == 20 || field660 == 30) && 0L != field806 && class80.method713() > field806) {
         class353.method1816(method484());
      }

      int var3;
      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field586[var3] = true;
         }
      }

      if (field660 == 0) {
         this.method1283(class534.field4226, class534.field4227, var1);
      } else if (field660 == 5) {
         class178.method1103(class112.field1452, class103.field1341, class253.field2234);
      } else if (field660 != 10 && field660 != 11) {
         if (field660 == 20) {
            class178.method1103(class112.field1452, class103.field1341, class253.field2234);
         } else if (field660 == 50) {
            class178.method1103(class112.field1452, class103.field1341, class253.field2234);
         } else if (field660 == 25) {
            if (field650 == 1) {
               if (field646 > field680) {
                  field680 = field646;
               }

               var3 = (field680 * 50 - field646 * 50) / field680;
               method541(class27.field245 + class357.field2806 + class357.field2800 + var3 + "%" + class357.field2802, false);
            } else if (field650 == 2) {
               if (field648 > field649) {
                  field649 = field648;
               }

               var3 = 50 + (field649 * 50 - field648 * 50) / field649;
               method541(class27.field245 + class357.field2806 + class357.field2800 + var3 + "%" + class357.field2802, false);
            } else {
               method541(class27.field245, false);
            }
         } else if (field660 == 30) {
            this.method368();
         } else if (field660 == 40) {
            method541(class27.field246 + class357.field2806 + class27.field247, false);
         } else if (field660 == 45) {
            method541(class27.field506, false);
         }
      } else {
         class178.method1103(class112.field1452, class103.field1341, class253.field2234);
      }

      if (field660 == 30 && field805 == 0 && !var1 && !field807) {
         for(var3 = 0; var3 < field747; ++var3) {
            if (field799[var3]) {
               class300.field2508.method930(field801[var3], field802[var3], field803[var3], field804[var3]);
               field799[var3] = false;
            }
         }
      } else if (field660 > 0) {
         class300.field2508.method929(0, 0);

         for(var3 = 0; var3 < field747; ++var3) {
            field799[var3] = false;
         }
      }

   }

   protected final void method1267() {
      if (class113.field1463.method1721()) {
         class113.field1463.method1719();
      }

      if (class146.field1607 != null) {
         class146.field1607.field4085 = false;
      }

      class146.field1607 = null;
      field641.method1801();
      if (class441.field3346 != null) {
         synchronized(class441.field3346) {
            class441.field3346 = null;
         }
      }

      class317.field2583 = null;
      if (class209.field1963 != null) {
         class209.field1963.method1750();
      }

      class40.field923.method138();
      class407.method1979();
      if (class19.field209 != null) {
         class19.field209.method658();
         class19.field209 = null;
      }

      class237.method1429();
      this.field619.method1453();
   }

   void method365() {
      if (field660 != 1000) {
         boolean var2 = class40.field923.method137();
         if (!var2) {
            this.method381();
         }

      }
   }

   void method381() {
      if (class40.field923.field118 >= 4) {
         this.method1287("js5crc");
         method520(1000);
      } else {
         if (class40.field923.field141 >= 4) {
            if (field660 <= 5) {
               this.method1287("js5io");
               method520(1000);
               return;
            }

            field610 = 3000;
            class40.field923.field141 = 3;
         }

         if (--field610 + 1 <= 0) {
            try {
               if (field609 == 0) {
                  class146.field1612 = class210.field1969.method726(class381.field3055, class245.field2206);
                  ++field609;
               }

               if (field609 == 1) {
                  if (class146.field1612.field2473 == 2) {
                     this.method380(-1);
                     return;
                  }

                  if (class146.field1612.field2473 == 1) {
                     ++field609;
                  }
               }

               if (field609 == 2) {
                  Socket var3 = (Socket)class146.field1612.field2474;
                  class125 var2 = new class125(var3, 40000, 5000);
                  class112.field1450 = var2;
                  class184 var4 = new class184(5);
                  var4.method1114(15);
                  var4.method1180(216);
                  class112.field1450.method1015(var4.field1816, 0, 5);
                  ++field609;
                  class353.field2777 = class80.method713();
               }

               if (field609 == 3) {
                  if (class112.field1450.method1014() > 0) {
                     int var6 = class112.field1450.method1016();
                     if (var6 != 0) {
                        this.method380(var6);
                        return;
                     }

                     ++field609;
                  } else if (class80.method713() - class353.field2777 > 30000L) {
                     this.method380(-2);
                     return;
                  }
               }

               if (field609 == 4) {
                  class40.field923.method132(class112.field1450, field660 > 20);
                  class146.field1612 = null;
                  class112.field1450 = null;
                  field609 = 0;
                  field756 = 0;
               }
            } catch (IOException var5) {
               this.method380(-3);
            }

         }
      }
   }

   void method380(int var1) {
      class146.field1612 = null;
      class112.field1450 = null;
      field609 = 0;
      if (class245.field2206 == class91.field1287) {
         class245.field2206 = class382.field3062;
      } else {
         class245.field2206 = class91.field1287;
      }

      ++field756;
      if (field756 < 2 || var1 != 7 && var1 != 9) {
         if (field756 >= 2 && var1 == 6) {
            this.method1287("js5connect_outofdate");
            method520(1000);
         } else if (field756 >= 4) {
            if (field660 <= 5) {
               this.method1287("js5connect");
               method520(1000);
            } else {
               field610 = 3000;
            }
         }
      } else if (field660 <= 5) {
         this.method1287("js5connect_full");
         method520(1000);
      } else {
         field610 = 3000;
      }

   }

   final void method366() {
      Object var2 = field641.method1800();
      class164 var3 = field641.field2759;

      try {
         if (field612 == 0) {
            if (null == class493.field3877 && (field631.method1863() || field591 > 250)) {
               class493.field3877 = field631.method1864();
               field631.method1865();
               field631 = null;
            }

            if (null != class493.field3877) {
               if (var2 != null) {
                  ((class168)var2).method1017();
                  var2 = null;
               }

               class395.field3089 = null;
               field643 = false;
               field591 = 0;
               if (field621.method912()) {
                  if (this.method360()) {
                     try {
                        this.method386(class355.field2794);
                        method518(21);
                     } catch (Throwable var21) {
                        class194.method1208((String)null, var21);
                        class508.method2458(65);
                        return;
                     }
                  } else {
                     if (!this.method383((byte)6)) {
                        class508.method2458(65);
                        return;
                     }

                     try {
                        this.method382(class343.field2736, class327.field2639);
                        method518(20);
                     } catch (Exception var20) {
                        class194.method1208((String)null, var20);
                        class508.method2458(65);
                        return;
                     }
                  }
               } else {
                  method518(1);
               }
            }
         }

         class329 var23;
         if (field612 == 21) {
            if (null != this.field627) {
               if (!this.field627.isDone()) {
                  return;
               }

               if (this.field627.isCancelled()) {
                  class508.method2458(65);
                  this.field627 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field627.get();
                  if (!var4.isSuccess()) {
                     class508.method2458(65);
                     this.field627 = null;
                     return;
                  }

                  class297.field2482 = var4.getAccessToken();
                  class355.field2794 = var4.getRefreshToken();
                  this.field627 = null;
               } catch (Exception var19) {
                  class194.method1208((String)null, var19);
                  class508.method2458(65);
                  this.field627 = null;
                  return;
               }
            } else {
               if (null == this.field625) {
                  class508.method2458(65);
                  return;
               }

               if (!this.field625.method1675()) {
                  return;
               }

               if (this.field625.method1676()) {
                  class194.method1208(this.field625.method1678(), (Throwable)null);
                  class508.method2458(65);
                  this.field625 = null;
                  return;
               }

               var23 = this.field625.method1677();
               if (var23.method1727() != 200) {
                  class508.method2458(65);
                  this.field625 = null;
                  return;
               }

               field591 = 0;
               class261 var5 = new class261(var23.method1729());

               try {
                  class297.field2482 = var5.method1504().getString("access_token");
                  class355.field2794 = var5.method1504().getString("refresh_token");
               } catch (Exception var18) {
                  class194.method1208("Error parsing tokens", var18);
                  class508.method2458(65);
                  this.field625 = null;
                  return;
               }
            }

            this.method362(class297.field2482);
            method518(20);
         }

         if (field612 == 20) {
            if (this.field622 != null) {
               if (!this.field622.isDone()) {
                  return;
               }

               if (this.field622.isCancelled()) {
                  class508.method2458(65);
                  this.field622 = null;
                  return;
               }

               try {
                  OtlTokenResponse var24 = (OtlTokenResponse)this.field622.get();
                  if (!var24.isSuccess()) {
                     class508.method2458(65);
                     this.field622 = null;
                     return;
                  }

                  this.field618 = var24.getToken();
                  this.field622 = null;
               } catch (Exception var17) {
                  class194.method1208((String)null, var17);
                  class508.method2458(65);
                  this.field622 = null;
                  return;
               }
            } else {
               if (this.field698 == null) {
                  class508.method2458(65);
                  return;
               }

               if (!this.field698.method1675()) {
                  return;
               }

               if (this.field698.method1676()) {
                  class194.method1208(this.field698.method1678(), (Throwable)null);
                  class508.method2458(65);
                  this.field698 = null;
                  return;
               }

               var23 = this.field698.method1677();
               if (var23.method1727() != 200) {
                  class194.method1208("Response code: " + var23.method1727() + "Response body: " + var23.method1729(), (Throwable)null);
                  class508.method2458(65);
                  this.field698 = null;
                  return;
               }

               List var26 = (List)var23.method1728().get("Content-Type");
               if (var26 != null && var26.contains(class509.field3973.method2462())) {
                  try {
                     JSONObject var6 = new JSONObject(var23.method1729());
                     this.field618 = var6.getString("token");
                  } catch (JSONException var16) {
                     class194.method1208((String)null, var16);
                     class508.method2458(65);
                     this.field698 = null;
                     return;
                  }
               } else {
                  this.field618 = var23.method1729();
               }

               this.field698 = null;
            }

            field591 = 0;
            method518(1);
         }

         if (field612 == 1) {
            if (class395.field3089 == null) {
               class395.field3089 = class210.field1969.method726(class381.field3055, class245.field2206);
            }

            if (class395.field3089.field2473 == 2) {
               throw new IOException();
            }

            if (class395.field3089.field2473 == 1) {
               Socket var27 = (Socket)class395.field3089.field2474;
               class125 var25 = new class125(var27, 40000, 5000);
               var2 = var25;
               field641.method1798(var25);
               class395.field3089 = null;
               method518(2);
            }
         }

         class335 var29;
         if (field612 == 2) {
            field641.method1802();
            var29 = class315.method1687((byte)-1);
            var29.field2681 = null;
            var29.field2682 = 0;
            var29.field2686 = new class164(5000);
            var29.field2686.method1114(class211.field2007.field2005);
            field641.method1797(var29);
            field641.method1796();
            var3.field1818 = 0;
            method518(3);
         }

         int var28;
         if (field612 == 3) {
            if (class209.field1963 != null) {
               class209.field1963.method1749();
            }

            if (((class168)var2).method1012(1)) {
               var28 = ((class168)var2).method1016();
               if (null != class209.field1963) {
                  class209.field1963.method1749();
               }

               if (var28 != 0) {
                  class508.method2458(var28);
                  return;
               }

               var3.field1818 = 0;
               method518(4);
            }
         }

         if (field612 == 4) {
            if (var3.field1818 < 8) {
               var28 = ((class168)var2).method1014();
               if (var28 > 8 - var3.field1818) {
                  var28 = 8 - var3.field1818;
               }

               if (var28 > 0) {
                  ((class168)var2).method1013(var3.field1816, var3.field1818, var28);
                  var3.field1818 += var28;
               }
            }

            if (var3.field1818 == 8) {
               var3.field1818 = 0;
               class359.field2821 = var3.method1130();
               method518(5);
            }
         }

         if (field612 == 5) {
            field641.field2759.field1818 = 0;
            field641.method1802();
            class164 var34 = new class164(500);
            int[] var30 = new int[]{class493.field3877.nextInt(), class493.field3877.nextInt(), class493.field3877.nextInt(), class493.field3877.nextInt()};
            var34.field1818 = 0;
            var34.method1114(1);
            var34.method1180(var30[0]);
            var34.method1180(var30[1]);
            var34.method1180(var30[2]);
            var34.method1180(var30[3]);
            var34.method1151(class359.field2821);
            if (field660 == 40) {
               var34.method1180(class90.field1282[0]);
               var34.method1180(class90.field1282[1]);
               var34.method1180(class90.field1282[2]);
               var34.method1180(class90.field1282[3]);
            } else {
               if (field660 == 50) {
                  var34.method1114(class158.field1681.method1195());
                  var34.method1180(class205.field1938);
               } else {
                  var34.method1114(field826.method1195());
                  switch (field826.field1684) {
                     case 0:
                        var34.method1180(class4.field36.method2428(class534.field4243));
                     case 1:
                     default:
                        break;
                     case 2:
                     case 4:
                        var34.method1166(class13.field117);
                        ++var34.field1818;
                        break;
                     case 3:
                        var34.field1818 += 4;
                  }
               }

               if (field621.method912()) {
                  var34.method1114(class140.field1585.method1195());
                  var34.method1117(this.field618);
               } else {
                  var34.method1114(class140.field1586.method1195());
                  var34.method1117(class534.field4236);
               }
            }

            var34.method1158(class374.field2927, class374.field2928);
            class90.field1282 = var30;
            class335 var7 = class315.method1687((byte)-1);
            var7.field2681 = null;
            var7.field2682 = 0;
            var7.field2686 = new class164(5000);
            var7.field2686.field1818 = 0;
            if (field660 == 40) {
               var7.field2686.method1114(class211.field2002.field2005);
            } else {
               var7.field2686.method1114(class211.field2001.field2005);
            }

            var7.field2686.method1155(0);
            int var8 = var7.field2686.field1818;
            var7.field2686.method1180(216);
            var7.field2686.method1180(1);
            var7.field2686.method1114(field582);
            var7.field2686.method1114(field594);
            byte var9 = 0;
            var7.field2686.method1114(var9);
            var7.field2686.method1119(var34.field1816, 0, var34.field1818);
            int var10 = var7.field2686.field1818;
            var7.field2686.method1117(class534.field4243);
            var7.field2686.method1114((field807 ? 1 : 0) << 1 | (field580 ? 1 : 0));
            var7.field2686.method1155(class426.field3228);
            var7.field2686.method1155(class456.field3562);
            method473(var7.field2686);
            var7.field2686.method1117(class267.field2298);
            var7.field2686.method1180(class521.field4092);
            if (field758 > 213) {
               var7.field2686.method1114(0);
            }

            class184 var11 = new class184(class310.field2554.method1221());
            class310.field2554.method1220(var11);
            var7.field2686.method1119(var11.field1816, 0, var11.field1816.length);
            var7.field2686.method1114(field582);
            var7.field2686.method1180(0);
            var7.field2686.method1134(class9.field105.field2495);
            var7.field2686.method1134(class526.field4132.field2495);
            var7.field2686.method1134(class523.field4126.field2495);
            var7.field2686.method1134(class516.field3994.field2495);
            var7.field2686.method1134(class360.field2825.field2495);
            var7.field2686.method1163(class372.field2920.field2495);
            var7.field2686.method1180(class226.field2089.field2495);
            var7.field2686.method1162(class57.field1081.field2495);
            var7.field2686.method1180(class300.field2503.field2495);
            var7.field2686.method1134(class383.field3063.field2495);
            var7.field2686.method1134(0);
            var7.field2686.method1163(class219.field2035.field2495);
            var7.field2686.method1134(class522.field4124.field2495);
            var7.field2686.method1162(class43.field928.field2495);
            var7.field2686.method1134(class54.field1075.field2495);
            var7.field2686.method1163(class81.field1250.field2495);
            var7.field2686.method1162(class303.field2520.field2495);
            var7.field2686.method1180(class444.field3386.field2495);
            var7.field2686.method1162(class461.field3589.field2495);
            var7.field2686.method1163(class331.field2666.field2495);
            var7.field2686.method1180(class177.field1799.field2495);
            var7.field2686.method1168(var30, var10, var7.field2686.field1818);
            var7.field2686.method1122(var7.field2686.field1818 - var8);
            field641.method1797(var7);
            field641.method1796();
            field641.field2758 = new class152(var30);
            int[] var12 = new int[4];

            for(int var13 = 0; var13 < 4; ++var13) {
               var12[var13] = var30[var13] + 50;
            }

            var3.method997(var12);
            method518(6);
         }

         int var32;
         if (field612 == 6 && ((class168)var2).method1014() > 0) {
            var28 = ((class168)var2).method1016();
            if (var28 == 61) {
               var32 = ((class168)var2).method1014();
               class325.field2627 = var32 == 1 && ((class168)var2).method1016() == 1;
               method518(5);
            }

            if (var28 == 21 && field660 == 20) {
               method518(12);
            } else if (var28 == 2) {
               method518(14);
            } else if (var28 == 15 && field660 == 40) {
               field641.field2761 = -1;
               method518(19);
            } else if (var28 == 64) {
               method518(10);
            } else if (var28 == 23 && field642 < 1) {
               ++field642;
               method518(0);
            } else if (var28 == 29) {
               method518(17);
            } else {
               if (var28 != 69) {
                  class508.method2458(var28);
                  return;
               }

               method518(7);
            }
         }

         if (field612 == 7 && ((class168)var2).method1014() >= 2) {
            ((class168)var2).method1013(var3.field1816, 0, 2);
            var3.field1818 = 0;
            class317.field2581 = var3.method1174();
            method518(8);
         }

         if (field612 == 8 && ((class168)var2).method1014() >= class317.field2581) {
            var3.field1818 = 0;
            ((class168)var2).method1013(var3.field1816, var3.field1818, class317.field2581);
            class222 var38 = class222.method1323()[var3.method1125()];

            try {
               switch (var38.field2042) {
                  case 0:
                     class171 var35 = new class171();
                     this.field633 = new class403(var3, var35);
                     method518(9);
                     break;
                  default:
                     throw new IllegalArgumentException();
               }
            } catch (Exception var15) {
               class508.method2458(22);
               return;
            }
         }

         if (field612 == 9 && this.field633.method1972()) {
            this.field663 = this.field633.method1971();
            this.field633.method1969();
            this.field633 = null;
            if (this.field663 == null) {
               class508.method2458(22);
               return;
            }

            field641.method1802();
            var29 = class315.method1687((byte)-1);
            var29.field2681 = null;
            var29.field2682 = 0;
            var29.field2686 = new class164(5000);
            var29.field2686.method1114(class211.field2003.field2005);
            var29.field2686.method1155(this.field663.field1818);
            var29.field2686.method1120(this.field663);
            field641.method1797(var29);
            field641.method1796();
            this.field663 = null;
            method518(6);
         }

         if (field612 == 10 && ((class168)var2).method1014() > 0) {
            class113.field1456 = ((class168)var2).method1016();
            method518(11);
         }

         if (field612 == 11 && ((class168)var2).method1014() >= class113.field1456) {
            ((class168)var2).method1013(var3.field1816, 0, class113.field1456);
            var3.field1818 = 0;
            method518(6);
         }

         if (field612 == 12 && ((class168)var2).method1014() > 0) {
            field714 = (((class168)var2).method1016() + 3) * 60;
            method518(13);
         }

         if (field612 == 13) {
            field591 = 0;
            class534.method2555(class27.field277, class27.field278, field714 / 60 + class27.field457);
            if (--field714 <= 0) {
               method518(0);
            }

         } else {
            if (field612 == 14 && ((class168)var2).method1014() >= 1) {
               class437.field3324 = ((class168)var2).method1016();
               method518(15);
            }

            if (field612 == 15 && ((class168)var2).method1014() >= class437.field3324) {
               boolean var40 = ((class168)var2).method1016() == 1;
               ((class168)var2).method1013(var3.field1816, 0, 4);
               var3.field1818 = 0;
               boolean var39 = false;
               if (var40) {
                  var32 = var3.method999() << 24;
                  var32 |= var3.method999() << 16;
                  var32 |= var3.method999() << 8;
                  var32 |= var3.method999();
                  class4.field36.method2421(class534.field4243, var32);
               }

               if (field630) {
                  class4.field36.method2416(class534.field4243);
               } else {
                  class4.field36.method2416((String)null);
               }

               class497.method2434();
               field664 = ((class168)var2).method1016();
               field872 = ((class168)var2).method1016() == 1;
               field704 = ((class168)var2).method1016();
               field704 <<= 8;
               field704 += ((class168)var2).method1016();
               field705 = ((class168)var2).method1016();
               ((class168)var2).method1013(var3.field1816, 0, 8);
               var3.field1818 = 0;
               this.field634 = var3.method1130();
               ((class168)var2).method1013(var3.field1816, 0, 8);
               var3.field1818 = 0;
               field706 = var3.method1130();
               if (field758 >= 214) {
                  ((class168)var2).method1013(var3.field1816, 0, 8);
                  var3.field1818 = 0;
                  var3.method1130();
               }

               ((class168)var2).method1013(var3.field1816, 0, 1);
               var3.field1818 = 0;
               class375[] var31 = class375.method1878();
               int var37 = var3.method1003();
               if (var37 < 0 || var37 >= var31.length) {
                  throw new IOException(var37 + " " + var3.field1818);
               }

               field641.field2755 = var31[var37];
               field641.field2761 = field641.field2755.field3053;
               ((class168)var2).method1013(var3.field1816, 0, 2);
               var3.field1818 = 0;
               field641.field2761 = var3.method1174();

               try {
                  Client var41 = class191.field1877;
                  JSObject.getWindow(var41).call("zap", (Object[])null);
               } catch (Throwable var14) {
               }

               method518(16);
            }

            if (field612 != 16) {
               if (field612 == 17 && ((class168)var2).method1014() >= 2) {
                  var3.field1818 = 0;
                  ((class168)var2).method1013(var3.field1816, 0, 2);
                  var3.field1818 = 0;
                  class24.field229 = var3.method1174();
                  method518(18);
               }

               if (field612 == 18 && ((class168)var2).method1014() >= class24.field229) {
                  var3.field1818 = 0;
                  ((class168)var2).method1013(var3.field1816, 0, class24.field229);
                  var3.field1818 = 0;
                  String var45 = var3.method1133();
                  String var43 = var3.method1133();
                  String var36 = var3.method1133();
                  class534.method2555(var45, var43, var36);
                  method520(10);
                  if (field621.method912()) {
                     class534.method2543(9);
                  }
               }

               if (field612 == 19) {
                  if (field641.field2761 == -1) {
                     if (((class168)var2).method1014() < 2) {
                        return;
                     }

                     ((class168)var2).method1013(var3.field1816, 0, 2);
                     var3.field1818 = 0;
                     field641.field2761 = var3.method1174();
                  }

                  if (((class168)var2).method1014() >= field641.field2761) {
                     ((class168)var2).method1013(var3.field1816, 0, field641.field2761);
                     var3.field1818 = 0;
                     var28 = field641.field2761;
                     field644.method2360();
                     method442();
                     class190.method1198(var3);
                     if (var3.field1818 != var28) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field591;
                  if (field591 > 2000) {
                     if (field642 < 1) {
                        if (class91.field1287 == class245.field2206) {
                           class245.field2206 = class382.field3062;
                        } else {
                           class245.field2206 = class91.field1287;
                        }

                        ++field642;
                        method518(0);
                     } else {
                        class508.method2458(-3);
                     }
                  }
               }
            } else {
               if (((class168)var2).method1014() >= field641.field2761) {
                  var3.field1818 = 0;
                  ((class168)var2).method1013(var3.field1816, 0, field641.field2761);
                  field644.method2363();
                  field639 = -1L;
                  class146.field1607.field4081 = 0;
                  class163.field1694 = true;
                  field595 = true;
                  field819 = -1L;
                  class138.method906();
                  field641.method1802();
                  field641.field2759.field1818 = 0;
                  field641.field2755 = null;
                  field641.field2760 = null;
                  field641.field2766 = null;
                  field641.field2767 = null;
                  field641.field2761 = 0;
                  field641.field2765 = 0;
                  field596 = 0;
                  field629 = 0;
                  field654 = 0;
                  method498();
                  class441.method2160(0);
                  class194.method1211();
                  field741 = 0;
                  field668 = false;
                  field831 = 0;
                  field754 = 0;
                  field669 = 0;
                  class318.field2587 = null;
                  field829 = 0;
                  field822 = -1;
                  field827 = 0;
                  field750 = 0;
                  field605 = class300.field2505;
                  field606 = class300.field2505;
                  field637 = 0;
                  class190.field1866 = 0;

                  for(var28 = 0; var28 < 2048; ++var28) {
                     class190.field1874[var28] = null;
                     class190.field1864[var28] = class423.field3210;
                  }

                  for(var28 = 0; var28 < 2048; ++var28) {
                     field749[var28] = null;
                  }

                  for(var28 = 0; var28 < 65536; ++var28) {
                     field636[var28] = null;
                  }

                  field715 = -1;
                  field703.method1232();
                  field846.method1232();

                  for(var28 = 0; var28 < 4; ++var28) {
                     for(var32 = 0; var32 < 104; ++var32) {
                        for(int var33 = 0; var33 < 104; ++var33) {
                           field716[var28][var32][var33] = null;
                        }
                     }
                  }

                  field717 = new class201();
                  class314.field2562.method1480();

                  for(var28 = 0; var28 < class12.field112; ++var28) {
                     class12 var42 = class402.method1967(var28);
                     if (null != var42) {
                        class10.field109[var28] = 0;
                        class10.field107[var28] = 0;
                     }
                  }

                  class113.field1463.method1725();
                  field611 = -1;
                  if (field748 != -1) {
                     class480.method2357(field748);
                  }

                  for(class49 var44 = (class49)field597.method710(); null != var44; var44 = (class49)field597.method711()) {
                     method437(var44, true);
                  }

                  field748 = -1;
                  field597 = new class79(8);
                  field753 = null;
                  method498();
                  field862.method1394((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var28 = 0; var28 < 8; ++var28) {
                     field599[var28] = null;
                     field713[var28] = false;
                  }

                  class78.method706();
                  field589 = true;

                  for(var28 = 0; var28 < 100; ++var28) {
                     field586[var28] = true;
                  }

                  method422();
                  class59.field1089 = null;
                  class190.field1876 = null;
                  Arrays.fill(field820, (Object)null);
                  class132.field1563 = null;
                  Arrays.fill(field821, (Object)null);

                  for(var28 = 0; var28 < 8; ++var28) {
                     field854[var28] = new class177();
                  }

                  class489.field3859 = null;
                  field587 = false;
                  class190.method1198(var3);
                  class526.field4131 = -1;
                  method505(false, var3);
                  field641.field2755 = null;
               }

            }
         }
      } catch (IOException var22) {
         if (field642 < 1) {
            if (class91.field1287 == class245.field2206) {
               class245.field2206 = class382.field3062;
            } else {
               class245.field2206 = class91.field1287;
            }

            ++field642;
            method518(0);
         } else {
            class508.method2458(-2);
         }
      }
   }

   final void method385() {
      if (field596 > 1) {
         --field596;
      }

      if (field629 > 0) {
         --field629;
      }

      if (field643) {
         field643 = false;
         method486();
      } else {
         if (!field689) {
            method525();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method370(field641); ++var2) {
         }

         if (field660 == 30) {
            while(true) {
               class59 var3 = (class59)class138.field1582.method583();
               boolean var17;
               if (null == var3) {
                  var17 = false;
               } else {
                  var17 = true;
               }

               int var4;
               class335 var18;
               if (!var17) {
                  class335 var19;
                  int var20;
                  if (field644.field3825) {
                     var19 = class335.method1773(class46.field943, field641.field2758);
                     var19.field2686.method1114(0);
                     var20 = var19.field2686.field1818;
                     field644.method2365(var19.field2686);
                     var19.field2686.method1123(var19.field2686.field1818 - var20);
                     field641.method1797(var19);
                     field644.method2364();
                  }

                  int var5;
                  int var6;
                  synchronized(class146.field1607.field4080) {
                     if (!field616) {
                        class146.field1607.field4081 = 0;
                     } else if (class441.field3343 != 0 || class146.field1607.field4081 >= 40) {
                        var18 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        int var7 = 0;

                        int var8;
                        for(var8 = 0; var8 < class146.field1607.field4081 && (null == var18 || var18.field2686.field1818 - var4 < 246); ++var8) {
                           var5 = var8;
                           int var9 = class146.field1607.field4083[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           int var10 = class146.field1607.field4082[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (var10 != field592 || field593 != var9) {
                              if (null == var18) {
                                 var18 = class335.method1773(class46.field1003, field641.field2758);
                                 var18.field2686.method1114(0);
                                 var4 = var18.field2686.field1818;
                                 class164 var10000 = var18.field2686;
                                 var10000.field1818 += 2;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              int var11;
                              int var12;
                              int var13;
                              if (field719 != -1L) {
                                 var11 = var10 - field592;
                                 var12 = var9 - field593;
                                 var13 = (int)((class146.field1607.field4084[var8] - field719) / 20L);
                                 var6 = (int)((long)var6 + (class146.field1607.field4084[var8] - field719) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              field592 = var10;
                              field593 = var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var18.field2686.method1155((var13 << 12) + (var11 << 6) + var12);
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var18.field2686.method1114(var13 + 128);
                                 var18.field2686.method1155(var12 + (var11 << 8));
                              } else if (var13 < 32) {
                                 var18.field2686.method1114(var13 + 192);
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field2686.method1180(var10 | var9 << 16);
                                 } else {
                                    var18.field2686.method1180(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var18.field2686.method1155('\ue000' + (var13 & 8191));
                                 if (var10 != -1 && var9 != -1) {
                                    var18.field2686.method1180(var10 | var9 << 16);
                                 } else {
                                    var18.field2686.method1180(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              field719 = class146.field1607.field4084[var8];
                           }
                        }

                        if (null != var18) {
                           var18.field2686.method1123(var18.field2686.field1818 - var4);
                           var8 = var18.field2686.field1818;
                           var18.field2686.field1818 = var4;
                           var18.field2686.method1114(var6 / var7);
                           var18.field2686.method1114(var6 % var7);
                           var18.field2686.field1818 = var8;
                           field641.method1797(var18);
                        }

                        if (var5 >= class146.field1607.field4081) {
                           class146.field1607.field4081 = 0;
                        } else {
                           class520 var41 = class146.field1607;
                           var41.field4081 -= var5;
                           System.arraycopy(class146.field1607.field4082, var5, class146.field1607.field4082, 0, class146.field1607.field4081);
                           System.arraycopy(class146.field1607.field4083, var5, class146.field1607.field4083, 0, class146.field1607.field4081);
                           System.arraycopy(class146.field1607.field4084, var5, class146.field1607.field4084, 0, class146.field1607.field4081);
                        }
                     }
                  }

                  class335 var31;
                  if (class441.field3343 == 1 || !class136.field1574 && class441.field3343 == 4 || class441.field3343 == 2) {
                     long var21 = class441.field3333 - field639;
                     if (var21 > 32767L) {
                        var21 = 32767L;
                     }

                     field639 = class441.field3333;
                     var4 = class441.field3345;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > class456.field3562) {
                        var4 = class456.field3562;
                     }

                     var5 = class441.field3344;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > class426.field3228) {
                        var5 = class426.field3228;
                     }

                     var6 = (int)var21;
                     var31 = class335.method1773(class46.field969, field641.field2758);
                     var31.field2686.method1155((class441.field3343 == 2 ? 1 : 0) + (var6 << 1));
                     var31.field2686.method1155(var5);
                     var31.field2686.method1155(var4);
                     field641.method1797(var31);
                  }

                  if (field789 != 0) {
                     var19 = class335.method1773(class46.field1017, field641.field2758);
                     var19.field2686.method1155(field789);
                     field641.method1797(var19);
                  }

                  if (field724.field176 > 0) {
                     var19 = class335.method1773(class46.field931, field641.field2758);
                     var19.field2686.method1155(0);
                     var20 = var19.field2686.field1818;
                     long var22 = class80.method713();

                     for(var6 = 0; var6 < field724.field176; ++var6) {
                        long var34 = var22 - field819;
                        if (var34 > 16777215L) {
                           var34 = 16777215L;
                        }

                        field819 = var22;
                        var19.field2686.method1187(field724.field175[var6]);
                        var19.field2686.method1157((int)var34);
                     }

                     var19.field2686.method1122(var19.field2686.field1818 - var20);
                     field641.method1797(var19);
                  }

                  if (field678 > 0) {
                     --field678;
                  }

                  if (field724.method171(96) || field724.method171(97) || field724.method171(98) || field724.method171(99)) {
                     field679 = true;
                  }

                  if (field679 && field678 <= 0) {
                     field678 = 20;
                     field679 = false;
                     var19 = class335.method1773(class46.field954, field641.field2758);
                     var19.field2686.method1155(field754);
                     var19.field2686.method1150(field615);
                     field641.method1797(var19);
                  }

                  if (class163.field1694 && !field595) {
                     field595 = true;
                     var19 = class335.method1773(class46.field983, field641.field2758);
                     var19.field2686.method1114(1);
                     field641.method1797(var19);
                  }

                  if (!class163.field1694 && field595) {
                     field595 = false;
                     var19 = class335.method1773(class46.field983, field641.field2758);
                     var19.field2686.method1114(0);
                     field641.method1797(var19);
                  }

                  if (class477.field3650 != null) {
                     class477.field3650.method17();
                  }

                  if (class529.field4159) {
                     if (null != class59.field1089) {
                        class59.field1089.method2059();
                     }

                     for(var2 = 0; var2 < class190.field1866; ++var2) {
                        class522 var23 = field749[class190.field1867[var2]];
                        var23.method2481();
                     }

                     class529.field4159 = false;
                  }

                  method537();
                  method469();
                  if (field660 != 30) {
                     return;
                  }

                  method548();
                  class477.method2312();
                  ++field641.field2765;
                  if (field641.field2765 > 750) {
                     method486();
                     return;
                  }

                  var2 = class190.field1866;
                  int[] var24 = class190.field1867;

                  for(var4 = 0; var4 < var2; ++var4) {
                     class522 var25 = field749[var24[var4]];
                     if (null != var25) {
                        method515(var25, 1);
                     }
                  }

                  for(var2 = 0; var2 < field637; ++var2) {
                     var20 = field575[var2];
                     class433 var26 = field636[var20];
                     if (null != var26) {
                        method515(var26, var26.field3279.field3515);
                     }
                  }

                  method494();
                  ++field655;
                  if (field813 != 0) {
                     field755 += 20;
                     if (field755 >= 400) {
                        field813 = 0;
                     }
                  }

                  class480 var32 = class315.field2564;
                  class480 var27 = class254.field2235;
                  class315.field2564 = null;
                  class254.field2235 = null;
                  field764 = null;
                  field812 = false;
                  field765 = false;
                  field816 = 0;

                  while(field724.method172() && field816 < 128) {
                     if (field664 >= 2 && field724.method171(82) && field724.field186 == 66) {
                        StringBuilder var28 = new StringBuilder();

                        class461 var38;
                        for(Iterator var33 = class194.field1888.iterator(); var33.hasNext(); var28.append(var38.field3588).append('\n')) {
                           var38 = (class461)var33.next();
                           if (null != var38.field3583 && !var38.field3583.isEmpty()) {
                              var28.append(var38.field3583).append(':');
                           }
                        }

                        String var29 = var28.toString();
                        class191.field1877.method1269(var29);
                     } else if (field669 != 1 || field724.field173 <= 0) {
                        field818[field816] = field724.field186;
                        field817[field816] = field724.field173;
                        ++field816;
                     }
                  }

                  boolean var30 = field664 >= 2;
                  if (var30 && field724.method171(82) && field724.method171(81) && field789 != 0) {
                     var5 = class259.field2281.field4116 - field789;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > 3) {
                        var5 = 3;
                     }

                     if (var5 != class259.field2281.field4116) {
                        method436(class69.field1134 + class259.field2281.field4073[0], class478.field3659 + class259.field2281.field4070[0], var5, false);
                     }

                     field789 = 0;
                  }

                  if (class441.field3343 == 1) {
                     field815.method1307();
                  }

                  if (field748 != -1) {
                     method425(field748, 0, 0, class426.field3228, class456.field3562, 0, 0);
                  }

                  ++field578;

                  while(true) {
                     class480 var35;
                     class208 var36;
                     class480 var39;
                     do {
                        var36 = (class208)field777.method1234();
                        if (var36 == null) {
                           while(true) {
                              do {
                                 var36 = (class208)field793.method1234();
                                 if (null == var36) {
                                    while(true) {
                                       do {
                                          var36 = (class208)field791.method1234();
                                          if (null == var36) {
                                             while(true) {
                                                class166 var40 = (class166)field830.method1234();
                                                if (var40 == null) {
                                                   this.method371();
                                                   method509();
                                                   if (field760 != null) {
                                                      this.method376();
                                                   }

                                                   if (class175.method1052()) {
                                                      var5 = class175.field1765;
                                                      var6 = class175.field1766;
                                                      var31 = class335.method1773(class46.field937, field641.field2758);
                                                      var31.field2686.method1114(5);
                                                      var31.field2686.method1150(var5 + class69.field1134);
                                                      var31.field2686.method1177(class478.field3659 + var6);
                                                      var31.field2686.method1161(field724.method171(82) ? (field724.method171(81) ? 2 : 1) : 0);
                                                      field641.method1797(var31);
                                                      class175.method1075();
                                                      field696 = class441.field3344;
                                                      field697 = class441.field3345;
                                                      field813 = 1;
                                                      field755 = 0;
                                                      field827 = var5;
                                                      field750 = var6;
                                                   }

                                                   if (var32 != class315.field2564) {
                                                      if (null != var32) {
                                                         method485(var32);
                                                      }

                                                      if (class315.field2564 != null) {
                                                         method485(class315.field2564);
                                                      }
                                                   }

                                                   if (class254.field2235 != var27 && field739 == field740) {
                                                      if (null != var27) {
                                                         method485(var27);
                                                      }

                                                      if (null != class254.field2235) {
                                                         method485(class254.field2235);
                                                      }
                                                   }

                                                   if (null != class254.field2235) {
                                                      if (field739 < field740) {
                                                         ++field739;
                                                         if (field739 == field740) {
                                                            method485(class254.field2235);
                                                         }
                                                      }
                                                   } else if (field739 > 0) {
                                                      --field739;
                                                   }

                                                   method543();
                                                   if (field843) {
                                                      method450(class344.field2745, class113.field1457, class352.field2773);
                                                      class513.method2463(class502.field3955, class458.field3568);
                                                      if (class453.field3545 == class344.field2745 && class439.field3327 == class113.field1457 && class158.field1688 == class352.field2773 && class382.field3061 == class502.field3955 && class333.field2680 == class458.field3568) {
                                                         field843 = false;
                                                         field837 = false;
                                                         field838 = false;
                                                         field839 = false;
                                                         class51.field1058 = 0;
                                                         class259.field2278 = 0;
                                                         class84.field1267 = 0;
                                                         class180.field1809 = 0;
                                                         class444.field3385 = 0;
                                                         class441.field3347 = 0;
                                                         class262.field2287 = 0;
                                                         class190.field1862 = 0;
                                                         class180.field1807 = 0;
                                                         class12.field116 = 0;
                                                         field841 = null;
                                                         field658 = null;
                                                         field632 = null;
                                                      }
                                                   } else if (field837) {
                                                      method459();
                                                   }

                                                   for(var5 = 0; var5 < 5; ++var5) {
                                                      int var10002 = field794[var5]++;
                                                   }

                                                   class113.field1463.method1720();
                                                   var5 = class441.method2161();
                                                   var6 = class210.field1997.method811();
                                                   class335 var37;
                                                   if (var5 > 15000 && var6 > 15000) {
                                                      field629 = 250;
                                                      class441.method2160(14500);
                                                      var37 = class335.method1773(class46.field955, field641.field2758);
                                                      field641.method1797(var37);
                                                   }

                                                   class314.field2562.method1479();
                                                   method467();
                                                   ++field641.field2764;
                                                   if (field641.field2764 > 50) {
                                                      var37 = class335.method1773(class46.field971, field641.field2758);
                                                      field641.method1797(var37);
                                                   }

                                                   try {
                                                      field641.method1796();
                                                   } catch (IOException var15) {
                                                      method486();
                                                   }

                                                   return;
                                                }

                                                method472(var40);
                                             }
                                          }

                                          var35 = var36.field1951;
                                          if (var35.field3793 < 0) {
                                             break;
                                          }

                                          var39 = class480.method2355(var35.field3691);
                                       } while(null == var39 || var39.field3806 == null || var35.field3793 >= var39.field3806.length || var35 != var39.field3806[var35.field3793]);

                                       class18.method216(var36);
                                    }
                                 }

                                 var35 = var36.field1951;
                                 if (var35.field3793 < 0) {
                                    break;
                                 }

                                 var39 = class480.method2355(var35.field3691);
                              } while(null == var39 || var39.field3806 == null || var35.field3793 >= var39.field3806.length || var35 != var39.field3806[var35.field3793]);

                              class18.method216(var36);
                           }
                        }

                        var35 = var36.field1951;
                        if (var35.field3793 < 0) {
                           break;
                        }

                        var39 = class480.method2355(var35.field3691);
                     } while(null == var39 || null == var39.field3806 || var35.field3793 >= var39.field3806.length || var35 != var39.field3806[var35.field3793]);

                     class18.method216(var36);
                  }
               }

               var18 = class335.method1773(class46.field935, field641.field2758);
               var18.field2686.method1114(0);
               var4 = var18.field2686.field1818;
               class138.method905(var18.field2686);
               var18.field2686.method1123(var18.field2686.field1818 - var4);
               field641.method1797(var18);
            }
         }
      }
   }

   public void method1598(int var1, int var2) {
      if (null != field641 && null != field641.field2758) {
         if (var1 > -1 && class4.field36.method2406() > 0 && !field848) {
            class335 var4 = class335.method1773(class46.field1024, field641.field2758);
            var4.field2686.method1180(var1);
            field641.method1797(var4);
         }

      }
   }

   protected final void method1275() {
      field806 = class80.method713() + 500L;
      this.method367();
      if (field748 != -1) {
         this.method374(true);
      }

   }

   void method367() {
      int var2 = class426.field3228;
      int var3 = class456.field3562;
      if (super.field1982 < var2) {
         var2 = super.field1982;
      }

      if (super.field1988 < var3) {
         var3 = super.field1988;
      }

      if (class4.field36 != null) {
         try {
            class286.method1599(class191.field1877, "resize", new Object[]{method484()});
         } catch (Throwable var5) {
         }
      }

   }

   final void method368() {
      if (field748 != -1) {
         method517(field748);
      }

      int var2;
      for(var2 = 0; var2 < field747; ++var2) {
         if (field586[var2]) {
            field799[var2] = true;
         }

         field800[var2] = field586[var2];
         field586[var2] = false;
      }

      field797 = field879;
      field737 = -1;
      field738 = -1;
      if (field748 != -1) {
         field747 = 0;
         method411(field748, 0, 0, class426.field3228, class456.field3562, 0, 0, -1);
      }

      class156.method948();
      if (field865) {
         if (field813 == 1) {
            class465.field3603[field755 / 100].method2032(field696 - 8, field697 - 8);
         }

         if (field813 == 2) {
            class465.field3603[4 + field755 / 100].method2032(field696 - 8, field697 - 8);
         }
      }

      int var3;
      int var4;
      if (!field689) {
         if (field737 != -1) {
            var2 = field737;
            var3 = field738;
            if ((field725 >= 2 || field741 != 0 || field668) && field736) {
               var4 = field725 - 1;
               String var6;
               if (field741 == 1 && field725 < 2) {
                  var6 = class27.field398 + class27.field282 + field742 + " " + class357.field2805;
               } else if (field668 && field725 < 2) {
                  var6 = field759 + class27.field282 + field770 + " " + class357.field2805;
               } else {
                  var6 = method471(var4);
               }

               if (field725 > 2) {
                  var6 = var6 + class357.method1829(16777215) + " " + '/' + " " + (field725 - 2) + class27.field265;
               }

               class112.field1452.method1592(var6, var2 + 4, var3 + 15, 16777215, 0, field879 / 1000);
            }
         }
      } else {
         var2 = class317.field2582;
         var3 = class98.field1320;
         var4 = class484.field3839;
         int var5 = class185.field1823;
         int var14 = 6116423;
         class156.method954(var2, var3, var4, var5, var14);
         class156.method954(var2 + 1, var3 + 1, var4 - 2, 16, 0);
         class156.method957(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
         class112.field1452.method1594(class27.field401, var2 + 3, var3 + 14, var14, -1);
         int var7 = class441.field3349;
         int var8 = class441.field3332;

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < field725; ++var9) {
            var10 = 15 * (field725 - 1 - var9) + var3 + 31;
            var11 = 16777215;
            if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            class112.field1452.method1594(method471(var9), var2 + 3, var10, var11, 0);
         }

         var9 = class317.field2582;
         var10 = class98.field1320;
         var11 = class484.field3839;
         int var12 = class185.field1823;

         for(int var13 = 0; var13 < field747; ++var13) {
            if (field801[var13] + field803[var13] > var9 && field801[var13] < var9 + var11 && field802[var13] + field804[var13] > var10 && field802[var13] < var10 + var12) {
               field799[var13] = true;
            }
         }
      }

      if (field805 == 3) {
         for(var2 = 0; var2 < field747; ++var2) {
            if (field800[var2]) {
               class156.method953(field801[var2], field802[var2], field803[var2], field804[var2], 16711935, 128);
            } else if (field799[var2]) {
               class156.method953(field801[var2], field802[var2], field803[var2], field804[var2], 16711680, 128);
            }
         }
      }

      class372.method1867(class192.field1881, class259.field2281.field4028, class259.field2281.field3999, field655);
      field655 = 0;
   }

   boolean method389(class348 var1, int var2) {
      if (var1.field2761 == 0) {
         class59.field1089 = null;
      } else {
         if (null == class59.field1089) {
            class59.field1089 = new class19(class121.field1501, class191.field1877);
         }

         class59.field1089.method232(var1.field2759, var2);
      }

      field783 = field578;
      class529.field4159 = true;
      var1.field2755 = null;
      return true;
   }

   boolean method369(class348 var1) {
      if (class59.field1089 != null) {
         class59.field1089.method233(var1.field2759, (byte)-59);
      }

      field783 = field578;
      class529.field4159 = true;
      var1.field2755 = null;
      return true;
   }

   final boolean method370(class348 var1) {
      class168 var3 = var1.method1800();
      class164 var4 = var1.field2759;
      if (null == var3) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int var25;
            if (null == var1.field2755) {
               if (var1.field2762) {
                  if (!var3.method1012(1)) {
                     return false;
                  }

                  var3.method1013(var1.field2759.field1816, 0, 1);
                  var1.field2765 = 0;
                  var1.field2762 = false;
               }

               var4.field1818 = 0;
               if (var4.method1001()) {
                  if (!var3.method1012(1)) {
                     return false;
                  }

                  var3.method1013(var1.field2759.field1816, 1, 1);
                  var1.field2765 = 0;
               }

               var1.field2762 = true;
               class375[] var5 = class375.method1878();
               var25 = var4.method1003();
               if (var25 < 0 || var25 >= var5.length) {
                  throw new IOException(var25 + " " + var4.field1818);
               }

               var1.field2755 = var5[var25];
               var1.field2761 = var1.field2755.field3053;
            }

            if (var1.field2761 == -1) {
               if (!var3.method1012(1)) {
                  return false;
               }

               var1.method1800().method1013(var4.field1816, 0, 1);
               var1.field2761 = var4.field1816[0] & 255;
            }

            if (var1.field2761 == -2) {
               if (!var3.method1012(2)) {
                  return false;
               }

               var1.method1800().method1013(var4.field1816, 0, 2);
               var4.field1818 = 0;
               var1.field2761 = var4.method1174();
            }

            if (!var3.method1012(var1.field2761)) {
               return false;
            }

            var4.field1818 = 0;
            var3.method1013(var4.field1816, 0, var1.field2761);
            var1.field2765 = 0;
            field644.method2361();
            var1.field2767 = var1.field2766;
            var1.field2766 = var1.field2760;
            var1.field2760 = var1.field2755;
            if (class375.field2990 == var1.field2755) {
               class169.field1723 = class321.method1696(var4.method1125());
               var1.field2755 = null;
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
            if (class375.field3013 == var1.field2755) {
               var7 = var4.method1182();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var25;
               var10 = var4.method1147();
               var11 = var10 >> 2;
               var36 = var10 & 3;
               var46 = field761[var11];
               var14 = var4.method1174();
               if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                  if (var46 == 0) {
                     class450 var81 = class75.field1223.method1041(class192.field1881, var8, var9);
                     if (null != var81) {
                        var16 = class256.method1471(var81.field3492);
                        if (var11 == 2) {
                           var81.field3493 = new class50(var16, 2, var36 + 4, class192.field1881, var8, var9, var14, false, var81.field3493);
                           var81.field3491 = new class50(var16, 2, var36 + 1 & 3, class192.field1881, var8, var9, var14, false, var81.field3491);
                        } else {
                           var81.field3493 = new class50(var16, var11, var36, class192.field1881, var8, var9, var14, false, var81.field3493);
                        }
                     }
                  } else if (var46 == 1) {
                     class60 var80 = class75.field1223.method1042(class192.field1881, var8, var9);
                     if (null != var80) {
                        var16 = class256.method1471(var80.field1104);
                        if (var11 != 4 && var11 != 5) {
                           if (var11 == 6) {
                              var80.field1101 = new class50(var16, 4, var36 + 4, class192.field1881, var8, var9, var14, false, var80.field1101);
                           } else if (var11 == 7) {
                              var80.field1101 = new class50(var16, 4, (var36 + 2 & 3) + 4, class192.field1881, var8, var9, var14, false, var80.field1101);
                           } else if (var11 == 8) {
                              var80.field1101 = new class50(var16, 4, var36 + 4, class192.field1881, var8, var9, var14, false, var80.field1101);
                              var80.field1102 = new class50(var16, 4, 4 + (var36 + 2 & 3), class192.field1881, var8, var9, var14, false, var80.field1102);
                           }
                        } else {
                           var80.field1101 = new class50(var16, 4, var36, class192.field1881, var8, var9, var14, false, var80.field1101);
                        }
                     }
                  } else if (var46 == 2) {
                     class154 var77 = class75.field1223.method1079(class192.field1881, var8, var9);
                     if (var11 == 11) {
                        var11 = 10;
                     }

                     if (null != var77) {
                        var77.field1639 = new class50(class256.method1471(var77.field1644), var11, var36, class192.field1881, var8, var9, var14, false, var77.field1639);
                     }
                  } else if (var46 == 3) {
                     class189 var79 = class75.field1223.method1066(class192.field1881, var8, var9);
                     if (null != var79) {
                        var79.field1858 = new class50(class256.method1471(var79.field1857), 22, var36, class192.field1881, var8, var9, var14, false, var79.field1858);
                     }
                  }
               }

               var1.field2755 = null;
               return true;
            }

            class480 var85;
            if (var1.field2755 == class375.field2987) {
               var23 = var4.method1129();
               var85 = class480.method2355(var23);
               var85.field3716 = 3;
               var85.field3717 = class259.field2281.field4096.method1392();
               method485(var85);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3049) {
               field843 = false;
               field837 = false;
               field838 = false;
               field839 = false;
               class51.field1058 = 0;
               class259.field2278 = 0;
               class84.field1267 = 0;
               field840 = false;
               class180.field1809 = 0;
               class444.field3385 = 0;
               class441.field3347 = 0;
               class262.field2287 = 0;
               class190.field1862 = 0;
               class180.field1807 = 0;
               class12.field116 = 0;
               field841 = null;
               field658 = null;
               field632 = null;

               for(var23 = 0; var23 < 5; ++var23) {
                  field844[var23] = false;
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2981 == var1.field2755) {
               class158.field1687 = null;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3014) {
               var23 = var4.method1129();
               var25 = var4.method1129();
               var7 = class210.method1302();
               class335 var83 = class335.method1773(class46.field1013, field641.field2758);
               var83.field2686.method1114(class210.field1974);
               var83.field2686.method1134(var23);
               var83.field2686.method1163(var25);
               var83.field2686.method1145(var7);
               field641.method1797(var83);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2950) {
               method451();
               field863 = var4.method1127();
               field628 = field578;
               var1.field2755 = null;
               return true;
            }

            if (class375.field3000 == var1.field2755) {
               class230.method1400(class413.field3163);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2936) {
               var23 = var4.method1152();
               class78.method701(var23);
               field775[++field776 - 1 & 31] = var23 & 32767;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3042) {
               class230.method1400(class413.field3167);
               var1.field2755 = null;
               return true;
            }

            boolean var12;
            long var32;
            long var41;
            long var49;
            String var53;
            int var60;
            byte var76;
            if (class375.field3030 == var1.field2755) {
               var76 = var4.method1126();
               var49 = (long)var4.method1174();
               var32 = (long)var4.method1181();
               var41 = (var49 << 32) + var32;
               var12 = false;
               class290 var72 = var76 >= 0 ? field821[var76] : class132.field1563;
               if (null == var72) {
                  var12 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (field722[var14] == var41) {
                        var12 = true;
                        break;
                     }
                  }
               }

               if (!var12) {
                  field722[field584] = var41;
                  field584 = (1 + field584) % 100;
                  var53 = class68.method654(var4);
                  var60 = var76 >= 0 ? 43 : 46;
                  class194.method1216(var60, "", var53, var72.field2460);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2960) {
               class190.method1199(var4, var1.field2761);
               class418.method1990();
               var1.field2755 = null;
               return true;
            }

            if (class375.field2973 == var1.field2755) {
               field837 = true;
               field843 = false;
               field839 = true;
               class51.field1058 = var4.method1125();
               class259.field2278 = var4.method1125();
               class84.field1267 = var4.method1174();
               var23 = var4.method1174();
               var25 = var4.method1125();
               var7 = 64 + class51.field1058 * 128;
               var8 = 64 + class259.field2278 * 128;
               var9 = method403(var7, var8, class192.field1881) - class84.field1267;
               var10 = var7 - class453.field3545;
               var11 = var9 - class439.field3327;
               var36 = var8 - class158.field1688;
               double var68 = Math.sqrt((double)(var36 * var36 + var10 * var10));
               var60 = method438((int)(Math.atan2((double)var11, var68) * 325.9490051269531) & 2047);
               var16 = method397((int)(Math.atan2((double)var10, (double)var36) * -325.9490051269531) & 2047);
               field658 = new class74(class382.field3061, var60, var23, var25);
               field632 = new class74(class333.field2680, var16, var23, var25);
               var1.field2755 = null;
               return true;
            }

            long var52;
            class49 var78;
            if (var1.field2755 == class375.field3022) {
               var23 = var1.field2761 + var4.field1818;
               var25 = var4.method1174();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var7 = var4.method1174();
               if (field748 != var25) {
                  field748 = var25;
                  this.method374(false);
                  method394(field748);
                  class18.method209(field748);

                  for(var8 = 0; var8 < 100; ++var8) {
                     field586[var8] = true;
                  }
               }

               class49 var69;
               for(; var7-- > 0; var69.field1046 = true) {
                  var8 = var4.method1129();
                  var9 = var4.method1174();
                  var10 = var4.method1125();
                  var69 = (class49)field597.method709((long)var8);
                  if (null != var69 && var9 != var69.field1047) {
                     method437(var69, true);
                     var69 = null;
                  }

                  if (var69 == null) {
                     var69 = method522(var8, var9, var10);
                  }
               }

               for(var78 = (class49)field597.method710(); var78 != null; var78 = (class49)field597.method711()) {
                  if (var78.field1046) {
                     var78.field1046 = false;
                  } else {
                     method437(var78, true);
                  }
               }

               field795 = new class79(512);

               while(var4.field1818 < var23) {
                  var8 = var4.method1129();
                  var9 = var4.method1174();
                  var10 = var4.method1174();
                  var11 = var4.method1129();

                  for(var36 = var9; var36 <= var10; ++var36) {
                     var52 = ((long)var8 << 32) + (long)var36;
                     field795.method712(new class118(var11), var52);
                  }
               }

               var1.field2755 = null;
               return true;
            }

            class480 var65;
            if (var1.field2755 == class375.field3039) {
               var23 = var4.method1129();
               var25 = var4.method1170();
               class49 var88 = (class49)field597.method709((long)var25);
               var78 = (class49)field597.method709((long)var23);
               if (null != var78) {
                  method437(var78, var88 == null || var78.field1047 != var88.field1047);
               }

               if (null != var88) {
                  var88.method605();
                  field597.method712(var88, (long)var23);
               }

               var65 = class480.method2355(var25);
               if (var65 != null) {
                  method485(var65);
               }

               var65 = class480.method2355(var23);
               if (var65 != null) {
                  method485(var65);
                  method424(class335.field2687[var65.field3674 >>> 16], var65, true);
               }

               if (field748 != -1) {
                  method535(field748, 1);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2994) {
               class366.method1854();
               var76 = var4.method1126();
               if (var1.field2761 == 1) {
                  if (var76 >= 0) {
                     field820[var76] = null;
                  } else {
                     class190.field1876 = null;
                  }

                  var1.field2755 = null;
                  return true;
               }

               if (var76 >= 0) {
                  field820[var76] = new class15(var4);
               } else {
                  class190.field1876 = new class15(var4);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3007) {
               var23 = var4.method1129();
               class49 var90 = (class49)field597.method709((long)var23);
               if (null != var90) {
                  method437(var90, true);
               }

               if (null != field753) {
                  method485(field753);
                  field753 = null;
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3029) {
               var10 = var4.method1174();
               var7 = var4.method1182();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = var25 + (var7 & 7);
               var11 = var4.method1146();
               var36 = var4.method1153();
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var8 = 64 + var8 * 128;
                  var9 = var9 * 128 + 64;
                  class493 var61 = new class493(var10, class192.field1881, var8, var9, method403(var8, var9, class192.field1881) - var11, var36, field879);
                  field846.method1240(var61);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field3026 == var1.field2755) {
               field785 = field578;
               var76 = var4.method1126();
               if (var1.field2761 == 1) {
                  if (var76 >= 0) {
                     field821[var76] = null;
                  } else {
                     class132.field1563 = null;
                  }

                  var1.field2755 = null;
                  return true;
               }

               if (var76 >= 0) {
                  field821[var76] = new class290(var4);
               } else {
                  class132.field1563 = new class290(var4);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2941) {
               class230.method1400(class413.field3172);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3037) {
               class230.method1400(class413.field3173);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3045) {
               var23 = var4.method1152();
               var25 = var4.method1147();
               if (var23 == 65535) {
                  var23 = -1;
               }

               method554(class259.field2281, var23, var25);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3050 == var1.field2755) {
               method505(true, var1.field2759);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2970 == var1.field2755) {
               if (field748 != -1) {
                  method535(field748, 0);
               }

               var1.field2755 = null;
               return true;
            }

            class480 var34;
            if (var1.field2755 == class375.field2962) {
               var23 = var4.method1165();
               var25 = var4.method1154();
               var7 = var4.method1153();
               var34 = class480.method2355(var23);
               var34.field3765 = (var25 << 16) + var7;
               var1.field2755 = null;
               return true;
            }

            if (class375.field3019 == var1.field2755) {
               field829 = var4.method1125();
               var1.field2755 = null;
               return true;
            }

            int var17;
            String var67;
            if (class375.field3031 == var1.field2755) {
               var76 = var4.method1126();
               var6 = var4.method1133();
               long var86 = (long)var4.method1174();
               long var70 = (long)var4.method1181();
               class363 var62 = (class363)class341.method1788(class363.method1847(), var4.method1125());
               long var50 = (var86 << 32) + var70;
               boolean var56 = false;
               class290 var75 = null;
               var75 = var76 >= 0 ? field821[var76] : class132.field1563;
               if (null == var75) {
                  var56 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var62.field2833 && class314.field2562.method1482(new class251(var6, class121.field1501))) {
                           var56 = true;
                        }
                        break;
                     }

                     if (field722[var16] == var50) {
                        var56 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var56) {
                  field722[field584] = var50;
                  field584 = (1 + field584) % 100;
                  var67 = class282.method1579(class68.method654(var4));
                  var17 = var76 >= 0 ? 41 : 44;
                  if (var62.field2848 != -1) {
                     class194.method1216(var17, class369.method1860(var62.field2848) + var6, var67, var75.field2460);
                  } else {
                     class194.method1216(var17, var6, var67, var75.field2460);
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field3012 == var1.field2755) {
               var4.field1818 += 28;
               if (var4.method1144()) {
                  method409(var4, var4.field1818 - 28);
               }

               var1.field2755 = null;
               return true;
            }

            String var28;
            if (class375.field3025 == var1.field2755) {
               var28 = var4.method1133();
               var25 = var4.method1146();
               var7 = var4.method1147();
               if (var7 >= 1 && var7 <= 8) {
                  if (var28.equalsIgnoreCase(class27.field544)) {
                     var28 = null;
                  }

                  field599[var7 - 1] = var28;
                  field713[var7 - 1] = var25 == 0;
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2978) {
               var23 = var4.method1174();
               if (var23 == 65535) {
                  var23 = -1;
               }

               method510(var23);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3010 == var1.field2755) {
               var23 = var4.method1154();
               if (var23 == 65535) {
                  var23 = -1;
               }

               var25 = var4.method1178();
               method423(var23, var25);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2933) {
               method552();
               var1.field2755 = null;
               return false;
            }

            if (var1.field2755 == class375.field3024) {
               var23 = var4.method1164();
               var25 = var4.method1147();
               var7 = var4.method1154();
               var78 = (class49)field597.method709((long)var23);
               if (var78 != null) {
                  method437(var78, var7 != var78.field1047);
               }

               method522(var23, var7, var25);
               var1.field2755 = null;
               return true;
            }

            class480 var29;
            boolean var57;
            if (class375.field3002 == var1.field2755) {
               var57 = var4.method1185() == 1;
               var25 = var4.method1129();
               var29 = class480.method2355(var25);
               if (var57 != var29.field3692) {
                  var29.field3692 = var57;
                  method485(var29);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2934) {
               var23 = var4.method1154();
               var25 = var4.method1174();
               var7 = var4.method1165();
               var8 = var4.method1174();
               var65 = class480.method2355(var7);
               if (var8 != var65.field3724 || var65.field3742 != var23 || var25 != var65.field3727) {
                  var65.field3724 = var8;
                  var65.field3742 = var23;
                  var65.field3727 = var25;
                  method485(var65);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2935 == var1.field2755) {
               var23 = var4.method1153();
               var25 = var4.method1164();
               var29 = class480.method2355(var25);
               if (var29.field3716 != 1 || var29.field3717 != var23) {
                  var29.field3716 = 1;
                  var29.field3717 = var23;
                  method485(var29);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2930) {
               class230.method1400(class413.field3169);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2975) {
               var9 = var4.method1153();
               var7 = var4.method1152();
               var8 = var4.method1152();
               var23 = var4.method1154();
               var25 = var4.method1154();
               if (var23 == 65535) {
                  var23 = -1;
               }

               ArrayList var71 = new ArrayList();
               var71.add(var23);
               class343.method1790(var71, var25, var7, var8, var9);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2951 == var1.field2755) {
               class230.method1400(class413.field3162);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2949) {
               class314.field2562.method1478();
               field782 = field578;
               var1.field2755 = null;
               return true;
            }

            String var54;
            if (var1.field2755 == class375.field2980) {
               byte[] var91 = new byte[var1.field2761];
               var4.method1002(var91, 0, var91.length);
               class184 var87 = new class184(var91);
               var54 = var87.method1133();
               class352.method1812(var54, true, false);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3009) {
               class230 var89 = new class230();
               var89.field2136 = var4.method1133();
               var89.field2133 = var4.method1174();
               var25 = var4.method1129();
               var89.field2129 = var25;
               if (var89.method1398()) {
                  var89.field2140 = "beta";
               }

               method520(45);
               var3.method1017();
               var3 = null;
               class325.method1712(var89);
               var1.field2755 = null;
               return false;
            }

            if (var1.field2755 == class375.field2995) {
               field596 = var4.method1153() * 30;
               field628 = field578;
               var1.field2755 = null;
               return true;
            }

            if (class375.field2937 == var1.field2755) {
               var23 = var4.method1174();
               if (var23 == 65535) {
                  var23 = -1;
               }

               field748 = var23;
               this.method374(false);
               method394(var23);
               class18.method209(field748);

               for(var25 = 0; var25 < 100; ++var25) {
                  field586[var25] = true;
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field3036 == var1.field2755) {
               field837 = true;
               field843 = false;
               field838 = true;
               class190.field1862 = var4.method1125();
               class180.field1807 = var4.method1125();
               var23 = var4.method1174();
               var25 = var4.method1174();
               field840 = var4.method1132();
               var7 = var4.method1125();
               var8 = class190.field1862 * 128 + 64;
               var9 = 64 + class180.field1807 * 128;
               boolean var58 = false;
               boolean var55 = false;
               if (field840) {
                  var10 = class439.field3327;
                  var11 = method403(var8, var9, class192.field1881) - var23;
               } else {
                  var10 = method403(class453.field3545, class158.field1688, class192.field1881) - class439.field3327;
                  var11 = var23;
               }

               field841 = new class266(class453.field3545, class158.field1688, var10, var8, var9, var11, var25, var7);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2996) {
               method505(false, var1.field2759);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3035 == var1.field2755) {
               var23 = var4.method1170();
               var85 = class480.method2355(var23);

               for(var7 = 0; var7 < var85.field3800.length; ++var7) {
                  var85.field3800[var7] = -1;
                  var85.field3800[var7] = 0;
               }

               method485(var85);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3003) {
               var23 = var4.method1152();
               var25 = var4.method1170();
               var29 = class480.method2355(var25);
               if (var29 != null && var29.field3676 == 0) {
                  if (var23 > var29.field3696 - var29.field3666) {
                     var23 = var29.field3696 - var29.field3666;
                  }

                  if (var23 < 0) {
                     var23 = 0;
                  }

                  if (var29.field3707 != var23) {
                     var29.field3707 = var23;
                     method485(var29);
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3023) {
               field810 = var4.method1125();
               field809 = var4.method1146();
               var1.field2755 = null;
               return true;
            }

            if (class375.field3017 == var1.field2755) {
               field837 = true;
               field843 = false;
               field839 = false;
               class51.field1058 = var4.method1125();
               class259.field2278 = var4.method1125();
               class84.field1267 = var4.method1174();
               class180.field1809 = var4.method1125();
               class444.field3385 = var4.method1125();
               if (class444.field3385 >= 100) {
                  var23 = 64 + class51.field1058 * 128;
                  var25 = 64 + class259.field2278 * 128;
                  var7 = method403(var23, var25, class192.field1881) - class84.field1267;
                  var8 = var23 - class453.field3545;
                  var9 = var7 - class439.field3327;
                  var10 = var25 - class158.field1688;
                  var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8));
                  class382.field3061 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531) & 2047;
                  class333.field2680 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531) & 2047;
                  if (class382.field3061 < 128) {
                     class382.field3061 = 128;
                  }

                  if (class382.field3061 > 383) {
                     class382.field3061 = 383;
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2979) {
               return this.method389(var1, 1);
            }

            if (var1.field2755 == class375.field2988) {
               field654 = var4.method1125();
               if (field654 == 1) {
                  field598 = var4.method1174();
               }

               if (field654 >= 2 && field654 <= 6) {
                  if (field654 == 2) {
                     field763 = 64;
                     field796 = 64;
                  }

                  if (field654 == 3) {
                     field763 = 0;
                     field796 = 64;
                  }

                  if (field654 == 4) {
                     field763 = 128;
                     field796 = 64;
                  }

                  if (field654 == 5) {
                     field763 = 64;
                     field796 = 0;
                  }

                  if (field654 == 6) {
                     field763 = 64;
                     field796 = 128;
                  }

                  field654 = 2;
                  field600 = var4.method1174();
                  field743 = var4.method1174();
                  field607 = var4.method1125();
               }

               if (field654 == 10) {
                  field617 = var4.method1174();
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2946) {
               class366.method1854();
               var76 = var4.method1126();
               class315 var84 = new class315(var4);
               class15 var82;
               if (var76 >= 0) {
                  var82 = field820[var76];
               } else {
                  var82 = class190.field1876;
               }

               if (null == var82) {
                  this.method379(var76);
                  var1.field2755 = null;
                  return true;
               }

               if (var84.field2565 > var82.field162) {
                  this.method379(var76);
                  var1.field2755 = null;
                  return true;
               }

               if (var84.field2565 < var82.field162) {
                  var1.field2755 = null;
                  return true;
               }

               var84.method1685(var82);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3041) {
               class230.method1400(class413.field3168);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2965 == var1.field2755) {
               var23 = var4.method1128();
               var25 = var4.method1129();
               var7 = var4.method1127();
               var34 = class480.method2355(var25);
               if (var34.field3683 != var7 || var34.field3684 != var23 || var34.field3679 != 0 || var34.field3680 != 0) {
                  var34.field3683 = var7;
                  var34.field3684 = var23;
                  var34.field3679 = 0;
                  var34.field3680 = 0;
                  method485(var34);
                  this.method375(var34);
                  if (var34.field3676 == 0) {
                     method424(class335.field2687[var25 >> 16], var34, false);
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field3040 == var1.field2755) {
               var23 = var4.method1165();
               var25 = var4.method1164();
               var29 = class480.method2355(var25);
               class480.method2351(var29, var23);
               method485(var29);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3006 == var1.field2755) {
               var23 = var4.method1174();
               var25 = var4.method1170();
               var29 = class480.method2355(var25);
               if (var29.field3716 != 6 || var23 != var29.field3717) {
                  var29.field3716 = 6;
                  var29.field3717 = var23;
                  method485(var29);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2932 == var1.field2755) {
               byte var51 = var4.method1140();
               var60 = var4.method1185() * 4;
               byte var47 = var4.method1140();
               var46 = var4.method1153();
               var36 = var4.method1171();
               var17 = var4.method1152();
               var14 = var4.method1146() * 4;
               var16 = var4.method1154();
               var7 = var4.method1182();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = var25 + (var7 & 7);
               int var19 = var4.method1125();
               int var18 = var4.method1147();
               var10 = var51 + var8;
               var11 = var47 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var46 != 65535) {
                  var8 = var8 * 128 + 64;
                  var9 = 64 + var9 * 128;
                  var10 = var10 * 128 + 64;
                  var11 = 64 + var11 * 128;
                  class305 var20 = new class305(var46, class192.field1881, var8, var9, method403(var8, var9, class192.field1881) - var14, var16 + field879, field879 + var17, var18, var19, var36, var60);
                  var20.method1667(var10, var11, method403(var10, var11, class192.field1881) - var60, var16 + field879);
                  field703.method1240(var20);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3015) {
               class158.field1687 = new class525(class535.field4254);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2986) {
               class372.field2904 = var4.method1185();
               class359.field2820 = var4.method1147();
               var1.field2755 = null;
               return true;
            }

            if (class375.field3048 == var1.field2755) {
               for(var23 = 0; var23 < field749.length; ++var23) {
                  if (field749[var23] != null) {
                     field749[var23].field4043 = -1;
                  }
               }

               for(var23 = 0; var23 < field636.length; ++var23) {
                  if (field636[var23] != null) {
                     field636[var23].field4043 = -1;
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2974) {
               method499(false, var4);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2967 == var1.field2755) {
               class138.method903(var4, var1.field2761);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2942) {
               method499(true, var4);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2968) {
               var23 = var4.method1146();
               var25 = var4.method1146();
               var7 = var4.method1170();
               var34 = class480.method2355(var7);
               class480.method2354(var34, var25, var23);
               method485(var34);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2984 == var1.field2755) {
               var25 = var4.method1174();
               var23 = var4.method1152();
               class106.method792(var23, var25);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3033) {
               var57 = var4.method1132();
               if (var57) {
                  if (null == class318.field2587) {
                     class318.field2587 = new class470();
                  }
               } else {
                  class318.field2587 = null;
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3004) {
               field837 = true;
               field843 = false;
               field839 = true;
               var23 = method397(var4.method1127() & 2027);
               var25 = method438(var4.method1127() & 2027);
               var7 = var4.method1174();
               var8 = var4.method1125();
               field658 = new class74(class382.field3061, var25, var7, var8);
               field632 = new class74(class333.field2680, var23, var7, var8);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2966) {
               return this.method369(var1);
            }

            if (class375.field2945 == var1.field2755) {
               class230.method1400(class413.field3164);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2955 == var1.field2755) {
               var23 = var4.method1164();
               var25 = var4.method1174();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var7 = var4.method1165();
               var8 = var4.method1154();
               if (var8 == 65535) {
                  var8 = -1;
               }

               for(var9 = var8; var9 <= var25; ++var9) {
                  var41 = ((long)var7 << 32) + (long)var9;
                  class55 var48 = field795.method709(var41);
                  if (var48 != null) {
                     var48.method605();
                  }

                  field795.method712(new class118(var23), var41);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2971 == var1.field2755) {
               var8 = var4.method1153();
               var25 = var4.method1154();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var9 = var4.method1154();
               var7 = var4.method1152();
               var10 = var4.method1152();
               var23 = var4.method1153();
               if (var23 == 65535) {
                  var23 = -1;
               }

               ArrayList var42 = new ArrayList();
               var42.add(var23);
               var42.add(var25);
               class343.method1790(var42, var7, var8, var9, var10);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2976) {
               method451();
               var23 = var4.method1147();
               var25 = var4.method1146();
               var7 = var4.method1170();
               field871[var25] = var7;
               field720[var25] = var23;
               field868[var25] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (var7 >= class170.field1726[var8]) {
                     field868[var25] = var8 + 2;
                  }
               }

               field700[++field778 - 1 & 31] = var25;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3038) {
               var23 = var4.method1174();
               var25 = var4.method1125();
               var7 = var4.method1174();
               method407(var23, var25, var7);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2992 == var1.field2755) {
               var23 = var4.method1125();
               var25 = var4.method1165();
               var29 = class480.method2355(var25);
               class480.method2356(var29, class259.field2281.field4096.field2116, var23);
               method485(var29);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2961 == var1.field2755) {
               var23 = var4.method1165();
               var25 = var4.method1174();
               var29 = class480.method2355(var23);
               if (var29.field3716 != 2 || var29.field3717 != var25) {
                  var29.field3716 = 2;
                  var29.field3717 = var25;
                  method485(var29);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2931) {
               var23 = var4.method1125();
               class106.method791(var23);
               var1.field2755 = null;
               return false;
            }

            if (var1.field2755 == class375.field2947) {
               method451();
               field693 = var4.method1174();
               field628 = field578;
               var1.field2755 = null;
               return true;
            }

            boolean var59;
            if (var1.field2755 == class375.field3043) {
               var23 = var4.method1165();
               var59 = var4.method1125() == 1;
               var29 = class480.method2355(var23);
               class474.method2289(var29, class259.field2281.field4096, var59);
               method485(var29);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2972 == var1.field2755) {
               var76 = var4.method1148();
               var25 = var4.method1153();
               class10.field109[var25] = var76;
               if (class10.field107[var25] != var76) {
                  class10.field107[var25] = var76;
               }

               method507(var25);
               field773[++field774 - 1 & 31] = var25;
               var1.field2755 = null;
               return true;
            }

            boolean var13;
            if (class375.field2953 == var1.field2755) {
               var28 = var4.method1133();
               var49 = (long)var4.method1174();
               var32 = (long)var4.method1181();
               class363 var43 = (class363)class341.method1788(class363.method1847(), var4.method1125());
               long var39 = (var49 << 32) + var32;
               var13 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (var39 == field722[var14]) {
                     var13 = true;
                     break;
                  }
               }

               if (class314.field2562.method1482(new class251(var28, class121.field1501))) {
                  var13 = true;
               }

               if (!var13 && field701 == 0) {
                  field722[field584] = var39;
                  field584 = (field584 + 1) % 100;
                  var53 = class282.method1579(class330.method1733(class68.method654(var4)));
                  if (var43.field2849) {
                     var60 = 7;
                  } else {
                     var60 = 3;
                  }

                  if (var43.field2848 != -1) {
                     class194.method1209(var60, class369.method1860(var43.field2848) + var28, var53);
                  } else {
                     class194.method1209(var60, var28, var53);
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2977 == var1.field2755) {
               if (null == class158.field1687) {
                  class158.field1687 = new class525(class535.field4254);
               }

               class438 var74 = class535.field4254.method117(var4);
               class158.field1687.field4130.method1508(var74.field3326, var74.field3325);
               field842[++field707 - 1 & 31] = var74.field3326;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2991) {
               var1.field2755 = null;
               return true;
            }

            class433 var40;
            if (var1.field2755 == class375.field2956) {
               short var73 = (short)var4.method1128();
               var25 = var4.method1125();
               var7 = var4.method1174();
               var8 = var4.method1164();
               var40 = field636[var7];
               if (null != var40) {
                  var40.method2130(var25, var8, var73);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2969 == var1.field2755) {
               var23 = var4.method1129();
               if (field676 != var23) {
                  field676 = var23;
                  method497();
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field3001 == var1.field2755) {
               for(var23 = 0; var23 < class12.field112; ++var23) {
                  class12 var66 = class402.method1967(var23);
                  if (var66 != null) {
                     class10.field109[var23] = 0;
                     class10.field107[var23] = 0;
                  }
               }

               method451();
               field774 += 32;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3020) {
               var28 = var4.method1133();
               Object[] var63 = new Object[var28.length() + 1];

               for(var7 = var28.length() - 1; var7 >= 0; --var7) {
                  if (var28.charAt(var7) == 's') {
                     var63[var7 + 1] = var4.method1133();
                  } else {
                     var63[var7 + 1] = new Integer(var4.method1129());
                  }
               }

               var63[0] = new Integer(var4.method1129());
               class208 var64 = new class208();
               var64.field1954 = var63;
               class18.method216(var64);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3008 == var1.field2755) {
               var28 = var4.method1133();
               var6 = class282.method1579(class330.method1733(class68.method654(var4)));
               class194.method1209(6, var28, var6);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2929) {
               class314.field2562.field2272.method1917(var4, var1.field2761);
               method544();
               field782 = field578;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2952) {
               var23 = var4.method1172();
               var59 = var4.method1125() == 1;
               var54 = "";
               boolean var38 = false;
               if (var59) {
                  var54 = var4.method1133();
                  if (class314.field2562.method1482(new class251(var54, class121.field1501))) {
                     var38 = true;
                  }
               }

               String var44 = var4.method1133();
               if (!var38) {
                  class194.method1209(var23, var54, var44);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3011) {
               var57 = var4.method1125() == 1;
               if (var57) {
                  class236.field2168 = class80.method713() - var4.method1130();
                  class489.field3859 = new class504(var4, true);
               } else {
                  class489.field3859 = null;
               }

               field647 = field578;
               var1.field2755 = null;
               return true;
            }

            if (class375.field2989 == var1.field2755) {
               var23 = var4.method1153();
               var40 = field636[var23];
               var8 = var4.method1146();
               var7 = var4.method1153();
               var25 = var4.method1164();
               if (var40 != null) {
                  var40.method2468(var8, var7, var25 >> 16, var25 & '\uffff');
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2993) {
               var23 = var4.method1152();
               if (var23 == 65535) {
                  var23 = -1;
               }

               var25 = var4.method1129();
               var7 = var4.method1165();
               var34 = class480.method2355(var25);
               class71 var35;
               if (!var34.field3754) {
                  if (var23 == -1) {
                     var34.field3716 = 0;
                     var1.field2755 = null;
                     return true;
                  }

                  var35 = class71.method682(var23).method668(var7);
                  var34.field3716 = 4;
                  var34.field3717 = var23;
                  var34.field3724 = var35.field1136;
                  var34.field3742 = var35.field1152;
                  var34.field3727 = var35.field1159 * 100 / var7;
                  method485(var34);
               } else {
                  var34.field3802 = var23;
                  var34.field3803 = var7;
                  var35 = class71.method682(var23).method668(var7);
                  var34.field3724 = var35.field1136;
                  var34.field3742 = var35.field1152;
                  var34.field3789 = var35.field1138;
                  var34.field3722 = var35.field1137;
                  var34.field3796 = var35.field1154;
                  var34.field3727 = var35.field1159;
                  if (var35.field1155 == 1) {
                     var34.field3733 = 1;
                  } else {
                     var34.field3733 = 2;
                  }

                  if (var34.field3728 > 0) {
                     var34.field3727 = var34.field3727 * 32 / var34.field3728;
                  } else if (var34.field3685 > 0) {
                     var34.field3727 = var34.field3727 * 32 / var34.field3685;
                  }

                  method485(var34);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2964 == var1.field2755) {
               var25 = var4.method1154();
               var7 = var4.method1146();
               var23 = var4.method1152();
               if (var25 == 65535) {
                  var25 = -1;
               }

               class433 var33 = field636[var23];
               if (null != var33) {
                  if (var33.field4043 == var25 && var25 != -1) {
                     var9 = class157.method984(var25).field1678;
                     if (var9 == 1) {
                        var33.field4044 = 0;
                        var33.field4045 = 0;
                        var33.field4060 = var7;
                        var33.field4025 = 0;
                     } else if (var9 == 2) {
                        var33.field4025 = 0;
                     }
                  } else if (var25 == -1 || var33.field4043 == -1 || class157.method984(var25).field1671 >= class157.method984(var33.field4043).field1671) {
                     var33.field4043 = var25;
                     var33.field4044 = 0;
                     var33.field4045 = 0;
                     var33.field4060 = var7;
                     var33.field4025 = 0;
                     var33.field4062 = var33.field4046;
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2943) {
               var28 = var4.method1133();
               var49 = var4.method1130();
               var32 = (long)var4.method1174();
               var41 = (long)var4.method1181();
               class363 var45 = (class363)class341.method1788(class363.method1847(), var4.method1125());
               var52 = var41 + (var32 << 32);
               boolean var15 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (field722[var16] == var52) {
                     var15 = true;
                     break;
                  }
               }

               if (var45.field2833 && class314.field2562.method1482(new class251(var28, class121.field1501))) {
                  var15 = true;
               }

               if (!var15 && field701 == 0) {
                  field722[field584] = var52;
                  field584 = (1 + field584) % 100;
                  var67 = class282.method1579(class330.method1733(class68.method654(var4)));
                  if (var45.field2848 != -1) {
                     class194.method1216(9, class369.method1860(var45.field2848) + var28, var67, class360.method1837(var49));
                  } else {
                     class194.method1216(9, var28, var67, class360.method1837(var49));
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2998 == var1.field2755) {
               var23 = var4.method1125();
               method512(var23);
               var1.field2755 = null;
               return true;
            }

            if (class375.field2959 == var1.field2755) {
               var23 = var4.method1125();
               var25 = var4.method1125();
               var7 = var4.method1125();
               var8 = var4.method1125();
               field844[var23] = true;
               field638[var23] = var25;
               field798[var23] = var7;
               field708[var23] = var8;
               field794[var23] = 0;
               var1.field2755 = null;
               return true;
            }

            if (class375.field2982 == var1.field2755) {
               var23 = var4.method1129();
               var25 = var4.method1174();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var29 = class480.method2355(var23);
               } else {
                  var29 = null;
               }

               for(; var4.field1818 < var1.field2761; class78.method707(var25, var8, var9 - 1, var10)) {
                  var8 = var4.method1172();
                  var9 = var4.method1174();
                  var10 = 0;
                  if (var9 != 0) {
                     var10 = var4.method1125();
                     if (var10 == 255) {
                        var10 = var4.method1129();
                     }
                  }

                  if (var29 != null && var8 >= 0 && var8 < var29.field3800.length) {
                     var29.field3800[var8] = var9;
                     var29.field3801[var8] = var10;
                  }
               }

               if (null != var29) {
                  method485(var29);
               }

               method451();
               field775[++field776 - 1 & 31] = var25 & 32767;
               var1.field2755 = null;
               return true;
            }

            if (class375.field2938 == var1.field2755) {
               field837 = true;
               field843 = false;
               field839 = true;
               var23 = var4.method1127();
               var25 = var4.method1127();
               var7 = method438(class382.field3061 + var25 & 2027);
               var8 = class333.field2680 + var23;
               var9 = var4.method1174();
               var10 = var4.method1125();
               field658 = new class74(class382.field3061, var7, var9, var10);
               field632 = new class74(class333.field2680, var8, var9, var10);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3044) {
               var8 = var4.method1146();
               var7 = var4.method1164();
               var25 = var4.method1174();
               var23 = var4.method1152();
               class522 var30;
               if (var23 == field704) {
                  var30 = class259.field2281;
               } else {
                  var30 = field749[var23];
               }

               if (null != var30) {
                  var30.method2468(var8, var25, var7 >> 16, var7 & '\uffff');
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3016) {
               for(var23 = 0; var23 < class10.field107.length; ++var23) {
                  if (class10.field107[var23] != class10.field109[var23]) {
                     class10.field107[var23] = class10.field109[var23];
                     method507(var23);
                     field773[++field774 - 1 & 31] = var23;
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2948 == var1.field2755) {
               method416(var4.method1133());
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3028) {
               var23 = var4.method1165();
               var25 = var4.method1156();
               var29 = class480.method2355(var23);
               if (var25 != var29.field3720 || var25 == -1) {
                  var29.field3720 = var25;
                  var29.field3804 = 0;
                  var29.field3805 = 0;
                  method485(var29);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2997) {
               class372.field2904 = var4.method1125();
               class359.field2820 = var4.method1147();

               while(var4.field1818 < var1.field2761) {
                  var23 = var4.method1125();
                  class413 var31 = class413.method1989()[var23];
                  class230.method1400(var31);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2983) {
               var23 = var4.method1153();
               var25 = var4.method1154();
               var8 = var4.method1154();
               var7 = var4.method1152();
               class228.method1378(var23, var25, var7, var8);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2999) {
               field837 = true;
               field843 = false;
               field838 = true;
               class190.field1862 = var4.method1125();
               class180.field1807 = var4.method1125();
               var23 = var4.method1174();
               var25 = var4.method1125() * 128 + 64;
               var7 = var4.method1125() * 128 + 64;
               var8 = var4.method1174();
               field840 = var4.method1132();
               var9 = var4.method1125();
               var10 = class190.field1862 * 128 + 64;
               var11 = class180.field1807 * 128 + 64;
               var12 = false;
               var13 = false;
               if (field840) {
                  var36 = class439.field3327;
                  var46 = method403(var10, var11, class192.field1881) - var23;
               } else {
                  var36 = method403(class453.field3545, class158.field1688, class192.field1881) - class439.field3327;
                  var46 = var23;
               }

               field841 = new class73(class453.field3545, class158.field1688, var36, var10, var11, var46, var25, var7, var8, var9);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2939) {
               class314.field2562.method1489(var4, var1.field2761);
               field782 = field578;
               var1.field2755 = null;
               return true;
            }

            if (class375.field3005 == var1.field2755) {
               field837 = true;
               field843 = false;
               field838 = false;
               class190.field1862 = var4.method1125();
               class180.field1807 = var4.method1125();
               class12.field116 = var4.method1174();
               class262.field2287 = var4.method1125();
               class441.field3347 = var4.method1125();
               if (class441.field3347 >= 100) {
                  class453.field3545 = 64 + class190.field1862 * 128;
                  class158.field1688 = class180.field1807 * 128 + 64;
                  class439.field3327 = method403(class453.field3545, class158.field1688, class192.field1881) - class12.field116;
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3021) {
               var23 = var4.method1165();
               var25 = var4.method1153();
               var7 = var25 >> 10 & 31;
               var8 = var25 >> 5 & 31;
               var9 = var25 & 31;
               var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
               class480 var37 = class480.method2355(var23);
               if (var37.field3697 != var10) {
                  var37.field3697 = var10;
                  method485(var37);
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2985) {
               var28 = var4.method1133();
               var25 = var4.method1170();
               var29 = class480.method2355(var25);
               if (!var28.equals(var29.field3734)) {
                  var29.field3734 = var28;
                  method485(var29);
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field3034 == var1.field2755) {
               var23 = var4.method1129();
               var25 = var4.method1174();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var29 = class480.method2355(var23);
               } else {
                  var29 = null;
               }

               if (null != var29) {
                  for(var8 = 0; var8 < var29.field3800.length; ++var8) {
                     var29.field3800[var8] = 0;
                     var29.field3801[var8] = 0;
                  }
               }

               class78.method702(var25);
               var8 = var4.method1174();

               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var4.method1174();
                  var11 = var4.method1147();
                  if (var11 == 255) {
                     var11 = var4.method1170();
                  }

                  if (null != var29 && var9 < var29.field3800.length) {
                     var29.field3800[var9] = var10;
                     var29.field3801[var9] = var11;
                  }

                  class78.method707(var25, var9, var10 - 1, var11);
               }

               if (var29 != null) {
                  method485(var29);
               }

               method451();
               field775[++field776 - 1 & 31] = var25 & 32767;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2954) {
               var23 = var4.method1152();
               var25 = var4.method1170();
               class10.field109[var23] = var25;
               if (var25 != class10.field107[var23]) {
                  class10.field107[var23] = var25;
               }

               method507(var23);
               field773[++field774 - 1 & 31] = var23;
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2958) {
               class230.method1400(class413.field3165);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3046 == var1.field2755) {
               class230.method1400(class413.field3171);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3018) {
               class230.method1400(class413.field3170);
               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field3027) {
               var23 = var4.method1125();
               if (var4.method1125() == 0) {
                  field854[var23] = new class177();
                  var4.field1818 += 18;
               } else {
                  --var4.field1818;
                  field854[var23] = new class177(var4, false);
               }

               field786 = field578;
               var1.field2755 = null;
               return true;
            }

            if (class375.field2944 == var1.field2755 && field837) {
               field843 = true;
               field839 = false;
               field838 = false;

               for(var23 = 0; var23 < 5; ++var23) {
                  field844[var23] = false;
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2940) {
               class372.field2904 = var4.method1185();
               class359.field2820 = var4.method1147();

               for(var23 = class372.field2904; var23 < class372.field2904 + 8; ++var23) {
                  for(var25 = class359.field2820; var25 < class359.field2820 + 8; ++var25) {
                     if (field716[class192.field1881][var23][var25] != null) {
                        field716[class192.field1881][var23][var25] = null;
                        method453(var23, var25);
                     }
                  }
               }

               for(class51 var24 = (class51)field717.method1236(); var24 != null; var24 = (class51)field717.method1238()) {
                  if (var24.field1064 >= class372.field2904 && var24.field1064 < class372.field2904 + 8 && var24.field1070 >= class359.field2820 && var24.field1070 < 8 + class359.field2820 && class192.field1881 == var24.field1071) {
                     var24.field1069 = 0;
                  }
               }

               var1.field2755 = null;
               return true;
            }

            if (class375.field2963 == var1.field2755) {
               return this.method389(var1, 2);
            }

            if (var1.field2755 == class375.field3032) {
               field827 = var4.method1125();
               if (field827 == 255) {
                  field827 = 0;
               }

               field750 = var4.method1125();
               if (field750 == 255) {
                  field750 = 0;
               }

               var1.field2755 = null;
               return true;
            }

            if (var1.field2755 == class375.field2957) {
               field785 = field578;
               var23 = var4.method1126();
               class474 var26 = new class474(var4);
               class290 var27;
               if (var23 >= 0) {
                  var27 = field821[var23];
               } else {
                  var27 = class132.field1563;
               }

               if (var27 == null) {
                  this.method387(var23);
                  var1.field2755 = null;
                  return true;
               }

               if (var26.field3635 > var27.field2462) {
                  this.method387(var23);
                  var1.field2755 = null;
                  return true;
               }

               if (var26.field3635 < var27.field2462) {
                  var1.field2755 = null;
                  return true;
               }

               var26.method2288(var27);
               var1.field2755 = null;
               return true;
            }

            if (class375.field3051 == var1.field2755) {
               class230.method1400(class413.field3166);
               var1.field2755 = null;
               return true;
            }

            class194.method1208("" + (var1.field2755 != null ? -908169793 * var1.field2755.field3052 * 1400406591 : -1) + class357.field2804 + (var1.field2766 != null ? var1.field2766.field3052 : -1) + class357.field2804 + (null != var1.field2767 ? var1.field2767.field3052 : -1) + class357.field2804 + var1.field2761, (Throwable)null);
            method552();
         } catch (IOException var21) {
            method486();
         } catch (Exception var22) {
            var6 = "" + (null != var1.field2755 ? var1.field2755.field3052 : -1) + class357.field2804 + (var1.field2766 != null ? var1.field2766.field3052 : -1) + class357.field2804 + (null != var1.field2767 ? -908169793 * var1.field2767.field3052 * 1400406591 : -1) + class357.field2804 + var1.field2761 + class357.field2804 + (class69.field1134 + class259.field2281.field4073[0]) + class357.field2804 + (class478.field3659 + class259.field2281.field4070[0]) + class357.field2804;

            for(var7 = 0; var7 < var1.field2761 && var7 < 50; ++var7) {
               var6 = var6 + var4.field1816[var7] + class357.field2804;
            }

            class194.method1208(var6, var22);
            method552();
         }

         return true;
      }
   }

   final void method371() {
      boolean var2 = false;

      int var3;
      int var6;
      while(!var2) {
         var2 = true;

         for(var3 = 0; var3 < field725 - 1; ++var3) {
            if (field769[var3] < 1000 && field769[var3 + 1] > 1000) {
               String var4 = field850[var3];
               field850[var3] = field850[var3 + 1];
               field850[var3 + 1] = var4;
               String var5 = field731[var3];
               field731[var3] = field731[var3 + 1];
               field731[var3 + 1] = var5;
               var6 = field769[var3];
               field769[var3] = field769[var3 + 1];
               field769[var3 + 1] = var6;
               var6 = field726[var3];
               field726[var3] = field726[var3 + 1];
               field726[var3 + 1] = var6;
               var6 = field727[var3];
               field727[var3] = field727[var3 + 1];
               field727[var3 + 1] = var6;
               var6 = field729[var3];
               field729[var3] = field729[var3 + 1];
               field729[var3 + 1] = var6;
               var6 = field730[var3];
               field730[var3] = field730[var3 + 1];
               field730[var3 + 1] = var6;
               boolean var7 = field733[var3];
               field733[var3] = field733[var3 + 1];
               field733[var3 + 1] = var7;
               var2 = false;
            }
         }
      }

      if (null == field760) {
         int var16 = class441.field3343;
         int var8;
         int var9;
         int var18;
         int var19;
         if (field689) {
            int var17;
            if (var16 != 1 && (class136.field1574 || var16 != 4)) {
               var3 = class441.field3349;
               var17 = class441.field3332;
               if (var3 < class317.field2582 - 10 || var3 > class317.field2582 + class484.field3839 + 10 || var17 < class98.field1320 - 10 || var17 > class98.field1320 + class185.field1823 + 10) {
                  field689 = false;
                  var18 = class317.field2582;
                  var6 = class98.field1320;
                  var19 = class484.field3839;
                  var8 = class185.field1823;

                  for(var9 = 0; var9 < field747; ++var9) {
                     if (field803[var9] + field801[var9] > var18 && field801[var9] < var18 + var19 && field802[var9] + field804[var9] > var6 && field802[var9] < var6 + var8) {
                        field586[var9] = true;
                     }
                  }
               }
            }

            if (var16 == 1 || !class136.field1574 && var16 == 4) {
               var3 = class317.field2582;
               var17 = class98.field1320;
               var18 = class484.field3839;
               var6 = class441.field3344;
               var19 = class441.field3345;
               var8 = -1;

               int var10;
               for(var9 = 0; var9 < field725; ++var9) {
                  var10 = var17 + 31 + (field725 - 1 - var9) * 15;
                  if (var6 > var3 && var6 < var18 + var3 && var19 > var10 - 13 && var19 < var10 + 3) {
                     var8 = var9;
                  }
               }

               int var11;
               int var12;
               int var13;
               if (var8 != -1 && var8 >= 0) {
                  var9 = field726[var8];
                  var10 = field727[var8];
                  var11 = field769[var8];
                  var12 = field729[var8];
                  var13 = field730[var8];
                  String var14 = field731[var8];
                  String var15 = field850[var8];
                  method545(var9, var10, var11, var12, var13, var14, var15, class441.field3344, class441.field3345);
               }

               field689 = false;
               var9 = class317.field2582;
               var10 = class98.field1320;
               var11 = class484.field3839;
               var12 = class185.field1823;

               for(var13 = 0; var13 < field747; ++var13) {
                  if (field803[var13] + field801[var13] > var9 && field801[var13] < var9 + var11 && field804[var13] + field802[var13] > var10 && field802[var13] < var10 + var12) {
                     field586[var13] = true;
                  }
               }
            }
         } else {
            var3 = field725 - 1;
            if ((var16 == 1 || !class136.field1574 && var16 == 4) && this.method372((byte)-84)) {
               var16 = 2;
            }

            if ((var16 == 1 || !class136.field1574 && var16 == 4) && field725 > 0 && var3 >= 0) {
               var18 = field726[var3];
               var6 = field727[var3];
               var19 = field769[var3];
               var8 = field729[var3];
               var9 = field730[var3];
               String var20 = field731[var3];
               String var21 = field850[var3];
               method545(var18, var6, var19, var8, var9, var20, var21, class441.field3344, class441.field3345);
            }

            if (var16 == 2 && field725 > 0) {
               this.method373(class441.field3344, class441.field3345);
            }
         }

      }
   }

   final boolean method372(byte var1) {
      boolean var10000;
      label31: {
         int var2;
         label34: {
            var2 = field725 - 1;
            if (field723) {
               if (var1 >= -1) {
                  throw new IllegalStateException();
               }

               if (field725 > 2) {
                  break label34;
               }
            }

            if (!method419(var2)) {
               break label31;
            }

            if (var1 >= -1) {
               throw new IllegalStateException();
            }
         }

         if (!field733[var2]) {
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

   final void method373(int var1, int var2) {
      class24.method262(var1, var2);
      var1 -= field857;
      var2 -= field858;
      class75.field1223.method1051(class192.field1881, var1, var2, false);
      field689 = true;
   }

   final void method374(boolean var1) {
      int var3 = field748;
      int var4 = class426.field3228;
      int var5 = class456.field3562;
      if (class480.method2359(var3)) {
         method405(class335.field2687[var3], -1, var4, var5, var1);
      }

   }

   void method375(class480 var1) {
      class480 var3 = var1.field3691 == -1 ? null : class480.method2355(var1.field3691);
      int var4;
      int var5;
      if (var3 == null) {
         var4 = class426.field3228;
         var5 = class456.field3562;
      } else {
         var4 = var3.field3689;
         var5 = var3.field3666;
      }

      method530(var1, var4, var5, false);
      method495(var1, var4, var5);
   }

   final void method376() {
      method485(field760);
      ++class531.field4173;
      int var2;
      int var3;
      if (field812 && field765) {
         var2 = class441.field3349;
         var3 = class441.field3332;
         var2 -= field762;
         var3 -= field835;
         if (var2 < field766) {
            var2 = field766;
         }

         if (var2 + field760.field3689 > field779.field3689 + field766) {
            var2 = field779.field3689 + field766 - field760.field3689;
         }

         if (var3 < field767) {
            var3 = field767;
         }

         if (field760.field3666 + var3 > field767 + field779.field3666) {
            var3 = field767 + field779.field3666 - field760.field3666;
         }

         int var10 = var2 - field614;
         int var5 = var3 - field686;
         int var6 = field760.field3687;
         if (class531.field4173 > field760.field3729 && (var10 > var6 || var10 < -var6 || var5 > var6 || var5 < -var6)) {
            field771 = true;
         }

         int var7 = field779.field3693 + (var2 - field766);
         int var8 = field779.field3707 + (var3 - field767);
         class208 var9;
         if (null != field760.field3766 && field771) {
            var9 = new class208();
            var9.field1951 = field760;
            var9.field1952 = var7;
            var9.field1955 = var8;
            var9.field1954 = field760.field3766;
            class18.method216(var9);
         }

         if (class441.field3339 == 0) {
            if (field771) {
               if (null != field760.field3767) {
                  var9 = new class208();
                  var9.field1951 = field760;
                  var9.field1952 = var7;
                  var9.field1955 = var8;
                  var9.field1957 = field764;
                  var9.field1954 = field760.field3767;
                  class18.method216(var9);
               }

               if (null != field764 && method443(field760) != null) {
                  class335 var11 = class335.method1773(class46.field961, field641.field2758);
                  var11.field2686.method1162(field760.field3674);
                  var11.field2686.method1134(field764.field3674);
                  var11.field2686.method1155(field760.field3793);
                  var11.field2686.method1155(field764.field3802);
                  var11.field2686.method1177(field764.field3793);
                  var11.field2686.method1177(field760.field3802);
                  field641.method1797(var11);
               }
            } else if (this.method372((byte)-32)) {
               this.method373(field614 + field762, field686 + field835);
            } else if (field725 > 0) {
               method392(field762 + field614, field835 + field686);
            }

            field760 = null;
         }

      } else {
         if (class531.field4173 > 1) {
            if (!field771 && field725 > 0) {
               var2 = field762 + field614;
               var3 = field835 + field686;
               class468 var4 = class355.field2793;
               if (var4 != null) {
                  method545(var4.field3608, var4.field3611, var4.field3609, var4.field3610, var4.field3607, var4.field3612, var4.field3613, var2, var3);
               }

               class355.field2793 = null;
            }

            field760 = null;
         }

      }
   }

   public class251 method990() {
      return null != class259.field2281 ? class259.field2281.field4112 : null;
   }

   void method387(int var1) {
      if (field758 >= 216) {
         class335 var3 = class335.method1773(class46.field1027, field641.field2758);
         var3.field2686.method1114(var1);
         field641.method1797(var3);
      }

   }

   void method379(int var1) {
      if (field758 >= 216) {
         class335 var3 = class335.method1773(class46.field1028, field641.field2758);
         var3.field2686.method1114(var1);
         field641.method1797(var3);
      }

   }

   static class6 method487() {
      return class477.field3650;
   }

   static void method402() {
      class297.field2482 = System.getenv("JX_ACCESS_TOKEN");
      class355.field2794 = System.getenv("JX_REFRESH_TOKEN");
      class343.field2736 = System.getenv("JX_SESSION_ID");
      class327.field2639 = System.getenv("JX_CHARACTER_ID");
      class534.method2559(System.getenv("JX_DISPLAY_NAME"));
   }

   public static class17 method504() {
      return field724;
   }

   static void method542() {
      if (class113.field1463.method1721()) {
         class113.field1463.method1719();
      }

      if (class146.field1607 != null) {
         class146.field1607.field4085 = false;
      }

      class146.field1607 = null;
      field641.method1801();
      if (null != class210.field1969) {
         try {
            class210.field1969.method729();
         } catch (Exception var3) {
         }
      }

      class210.field1969 = null;
      method434();
      class54.field1075.method1644();
      class522.field4124.method1644();
      class523.field4126.method1644();
      class526.field4132.method1644();
      class383.field3063.method1644();
      class444.field3386.method1644();
      class219.field2035.method1644();
      class226.field2089.method1644();
      method421();
      class75.field1223.method1026();

      for(int var1 = 0; var1 < 4; ++var1) {
         field651[var1].method1537();
      }

      class477.field3650 = null;
      class106.method792(0, 0);
      class69.method661();
      field848 = false;
      class372.method1869();
      if (class209.field1963 != null) {
         class209.field1963.method1750();
      }

      class40.field923.method138();
      class407.method1979();
      if (null != class19.field209) {
         class19.field209.method658();
      }

      class237.method1429();
      class237.field2172 = null;
      class237.field2173 = null;
      class60.field1103 = null;
      class78.method700();
      class222.field2041 = null;
      field873.clear();
      field875 = 0;
      class40.field923 = new class14();
      class19.field209 = new class426(class191.field1877.field623, 216);

      try {
         class237.method1427("oldschool", class462.field3591, class238.field2182.field3595, 0, 22);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      class222.field2041 = new class347(255, class237.field2172, class237.field2173, 500000);
      class210.field1969 = new class93();
      class191.field1877.method1279();
      field608 = class277.field2377;
      method520(0);
   }

   static void method421() {
      field656 = null;
      class336.field2689 = null;
      class314.field2563 = null;
      class26.field233 = null;
      class247.field2218 = null;
      class181.field1814 = null;
      class461.field3590 = null;
      class465.field3603 = null;
      class451.field3497 = null;
      class126.field1525 = null;
      class48.field1044 = null;
   }

   static void method520(int var0) {
      if (field660 != var0) {
         if (field660 == 30) {
            field815.method1307();
         }

         if (field660 == 0) {
            class191.field1877.method1299();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            method518(0);
            field591 = 0;
            field642 = 0;
            field644.method2362(var0);
            if (var0 != 20) {
               method435(false);
            }
         }

         if (var0 != 20 && var0 != 40 && null != class168.field1714) {
            class168.field1714.method1017();
            class168.field1714 = null;
         }

         if (field660 == 25) {
            field650 = 0;
            field646 = 0;
            field680 = 1;
            field648 = 0;
            field649 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var4 = field660 == 11 ? 4 : 0;
               class534.method2557(class43.field928, class331.field2666, false, var4);
            } else if (var0 == 11) {
               class534.method2557(class43.field928, class331.field2666, false, 4);
            } else if (var0 == 50) {
               class534.method2555("", "Updating date of birth...", "");
               class534.method2557(class43.field928, class331.field2666, false, 7);
            } else if (class485.field3840) {
               class534.field4221 = null;
               class191.field1878 = null;
               class534.field4220 = null;
               class534.field4223 = null;
               class119.field1486 = null;
               class409.field3154 = null;
               class199.field1930 = null;
               class534.field4218 = null;
               class537.field4256 = null;
               class374.field2926 = null;
               class482.field3834 = null;
               class267.field2301 = null;
               class253.field2233 = null;
               class395.field3084 = null;
               class158.field1682.method2570();
               class106.method792(0, 100);
               class278.method1539().method133(true);
               class485.field3840 = false;
            }
         } else {
            boolean var2 = class4.field36.method2418() >= field581;
            int var3 = var2 ? 0 : 12;
            class534.method2557(class43.field928, class331.field2666, true, var3);
         }

         field660 = var0;
      }
   }

   static void method550(class22 var0, String var1) {
      class181 var3 = new class181(var0, var1);
      field873.add(var3);
      field875 += var3.field1812;
   }

   static boolean method429() {
      if (null != field873 && field874 < field873.size()) {
         while(field874 < field873.size()) {
            class181 var1 = (class181)field873.get(field874);
            if (!var1.method1110()) {
               return false;
            }

            ++field874;
         }

         return true;
      } else {
         return true;
      }
   }

   static int method420() {
      if (null != field873 && field874 < field873.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= field874; ++var2) {
            var1 += ((class181)field873.get(var2)).field1813;
         }

         return var1 * 10000 / field875;
      } else {
         return 10000;
      }
   }

   static int method476(int var0) {
      return var0 * 3 + 600;
   }

   static void method482() {
      int var30;
      if (field608 == class277.field2377) {
         class75.field1223 = new class175(4, 104, 104, class526.field4141);

         for(var30 = 0; var30 < 4; ++var30) {
            field651[var30] = new class278(104, 104);
         }

         class3.field28 = new class427(512, 512);
         class534.field4227 = class27.field248;
         class534.field4226 = 5;
         field608 = class277.field2368;
      } else if (class277.field2368 == field608) {
         class534.field4227 = class27.field249;
         class534.field4226 = 10;
         field608 = class277.field2376;
      } else if (class277.field2376 == field608) {
         class300.field2503 = method456(0, false, true, true, false);
         class81.field1250 = method456(1, false, true, true, false);
         class54.field1075 = method456(2, true, false, true, false);
         class372.field2920 = method456(3, false, true, true, false);
         class57.field1081 = method456(4, false, true, true, false);
         class9.field105 = method456(5, true, true, true, false);
         class303.field2520 = method456(6, true, true, true, false);
         class461.field3589 = method456(7, false, true, true, false);
         class331.field2666 = method456(8, false, true, true, false);
         class516.field3994 = method456(9, false, true, true, false);
         class43.field928 = method456(10, false, true, true, false);
         class360.field2825 = method456(11, false, true, true, false);
         class177.field1799 = method456(12, false, true, true, false);
         class522.field4124 = method456(13, true, false, true, false);
         class523.field4126 = method456(14, false, true, true, false);
         class526.field4132 = method456(15, false, true, true, false);
         class383.field3063 = method456(17, true, true, true, false);
         class444.field3386 = method456(18, false, true, true, false);
         class219.field2035 = method456(19, false, true, true, false);
         class226.field2089 = method456(20, false, true, true, false);
         class254.field2236 = method456(21, false, true, true, true);
         class534.field4227 = class27.field274;
         class534.field4226 = 20;
         field608 = class277.field2370;
      } else if (class277.field2370 == field608) {
         byte var50 = 0;
         var30 = var50 + class300.field2503.method242() * 4 / 100;
         var30 += class81.field1250.method242() * 4 / 100;
         var30 += class54.field1075.method242() * 2 / 100;
         var30 += class372.field2920.method242() * 2 / 100;
         var30 += class57.field1081.method242() * 6 / 100;
         var30 += class9.field105.method242() * 4 / 100;
         var30 += class303.field2520.method242() * 2 / 100;
         var30 += class461.field3589.method242() * 55 / 100;
         var30 += class331.field2666.method242() * 2 / 100;
         var30 += class516.field3994.method242() * 2 / 100;
         var30 += class43.field928.method242() * 2 / 100;
         var30 += class360.field2825.method242() * 2 / 100;
         var30 += class177.field1799.method242() * 2 / 100;
         var30 += class522.field4124.method242() * 2 / 100;
         var30 += class523.field4126.method242() * 2 / 100;
         var30 += class526.field4132.method242() * 2 / 100;
         var30 += class219.field2035.method242() / 100;
         var30 += class444.field3386.method242() / 100;
         var30 += class226.field2089.method242() / 100;
         var30 += class254.field2236.method242() / 100;
         var30 += class383.field3063.method251() && class383.field3063.method1634() ? 1 : 0;
         if (var30 != 100) {
            if (var30 != 0) {
               class534.field4227 = class27.field251 + var30 + "%";
            }

            class534.field4226 = 30;
         } else {
            method550(class300.field2503, "Animations");
            method550(class81.field1250, "Skeletons");
            method550(class57.field1081, "Sound FX");
            method550(class9.field105, "Maps");
            method550(class303.field2520, "Music Tracks");
            method550(class461.field3589, "Models");
            method550(class331.field2666, "Sprites");
            method550(class360.field2825, "Music Jingles");
            method550(class523.field4126, "Music Samples");
            method550(class526.field4132, "Music Patches");
            method550(class219.field2035, "World Map");
            method550(class444.field3386, "World Map Geography");
            method550(class226.field2089, "World Map Ground");
            class508.field3972 = new class405();
            class508.field3972.method1977(class383.field3063);
            class534.field4227 = class27.field252;
            class534.field4226 = 30;
            field608 = class277.field2371;
         }
      } else {
         int var3;
         class22 var33;
         class22 var35;
         if (class277.field2371 == field608) {
            class331.method1764(22050, !field580, 2);
            ArrayList var48 = new ArrayList(3);
            class209.field1963 = class331.method1763(class210.field1969, 0, 2048);
            class514.field3985 = new class272();
            class272 var32 = new class272();
            var32.method1525(class514.field3985);

            for(var3 = 0; var3 < 3; ++var3) {
               class448 var39 = new class448();
               var39.method2195(9, 128);
               var32.method1525(var39);
               var48.add(var39);
            }

            class209.field1963.method1747(var32);
            var33 = class526.field4132;
            var35 = class523.field4126;
            class22 var41 = class57.field1081;
            class228.field2100 = var33;
            class228.field2101 = var35;
            class228.field2104 = var41;
            class228.field2103 = var48;
            class519.field4079 = new class186(22050, class331.field2655);
            class534.field4227 = class27.field253;
            class534.field4226 = 35;
            field608 = class277.field2375;
            class335.field2688 = new class31(class331.field2666, class522.field4124);
         } else {
            int var2;
            if (field608 == class277.field2375) {
               class344[] var47 = new class344[]{class344.field2746, class344.field2740, class344.field2739, class344.field2744, class344.field2742, class344.field2741};
               var2 = var47.length;
               class31 var34 = class335.field2688;
               class344[] var38 = new class344[]{class344.field2746, class344.field2740, class344.field2739, class344.field2744, class344.field2742, class344.field2741};
               field645 = var34.method358(var38);
               if (field645.size() < var2) {
                  class534.field4227 = class27.field446 + field645.size() * 100 / var2 + "%";
                  class534.field4226 = 40;
               } else {
                  class103.field1341 = (class460)field645.get(class344.field2742);
                  class253.field2234 = (class460)field645.get(class344.field2741);
                  class112.field1452 = (class460)field645.get(class344.field2744);
                  class310.field2554 = field721.method1670();
                  class534.field4227 = class27.field255;
                  class534.field4226 = 40;
                  field608 = class277.field2373;
               }
            } else {
               int var4;
               class22 var6;
               class22 var31;
               if (field608 == class277.field2373) {
                  var31 = class43.field928;
                  var33 = class331.field2666;
                  var4 = 0;
                  String[] var37 = class534.field4231;

                  int var40;
                  String var42;
                  for(var40 = 0; var40 < var37.length; ++var40) {
                     var42 = var37[var40];
                     if (var31.method1649(var42, "")) {
                        ++var4;
                     }
                  }

                  var37 = class534.field4250;

                  for(var40 = 0; var40 < var37.length; ++var40) {
                     var42 = var37[var40];
                     if (var33.method1649(var42, "")) {
                        ++var4;
                     }
                  }

                  var37 = class534.field4253;

                  for(var40 = 0; var40 < var37.length; ++var40) {
                     var42 = var37[var40];
                     if (var33.method1654(var42) != -1 && var33.method1649(var42, "")) {
                        ++var4;
                     }
                  }

                  var6 = class331.field2666;
                  int var43 = class534.field4231.length + class534.field4250.length;
                  String[] var44 = class534.field4253;

                  for(int var45 = 0; var45 < var44.length; ++var45) {
                     String var49 = var44[var45];
                     if (var6.method1654(var49) != -1) {
                        ++var43;
                     }
                  }

                  if (var4 < var43) {
                     class534.field4227 = class27.field256 + var4 * 100 / var43 + "%";
                     class534.field4226 = 50;
                  } else {
                     class534.field4227 = class27.field257;
                     class534.field4226 = 50;
                     method520(5);
                     field608 = class277.field2374;
                  }
               } else if (class277.field2374 == field608) {
                  if (!class54.field1075.method1634()) {
                     class534.field4227 = class27.field258 + class54.field1075.method253() + "%";
                     class534.field4226 = 60;
                  } else if (!class254.field2236.method1634()) {
                     class534.field4227 = class27.field258 + (80 + class177.field1799.method253() / 6) + "%";
                     class534.field4226 = 60;
                  } else {
                     class451.method2226(class54.field1075);
                     class179.method1108(class54.field1075);
                     class22 var46 = class54.field1075;
                     var31 = class461.field3589;
                     class396.field3090 = var46;
                     class396.field3091 = var31;
                     class396.field3093 = class396.field3090.method1655(3);
                     var33 = class54.field1075;
                     var35 = class461.field3589;
                     boolean var36 = field580;
                     class449.field3438 = var33;
                     class449.field3436 = var35;
                     class449.field3484 = var36;
                     var6 = class54.field1075;
                     class22 var7 = class461.field3589;
                     class453.field3509 = var6;
                     class453.field3510 = var7;
                     class22 var8 = class54.field1075;
                     class135.field1569 = var8;
                     class22 var9 = class54.field1075;
                     class22 var10 = class461.field3589;
                     boolean var11 = field603;
                     class460 var12 = class103.field1341;
                     class162.field1690 = var9;
                     class71.field1139 = var10;
                     class71.field1140 = var11;
                     class192.field1882 = class162.field1690.method1655(10);
                     class241.field2192 = var12;
                     class157.method986(class54.field1075, class300.field2503, class81.field1250);
                     class22 var13 = class54.field1075;
                     class22 var14 = class461.field3589;
                     class529.field4166 = var13;
                     class529.field4153 = var14;
                     class259.method1500(class54.field1075);
                     class12.method128(class54.field1075);
                     class22 var15 = class372.field2920;
                     class22 var16 = class461.field3589;
                     class22 var17 = class331.field2666;
                     class22 var18 = class522.field4124;
                     int var19 = 0;
                     if (null != var15) {
                        class186.field1839 = var15;
                        class478.field3658 = var16;
                        class121.field1492 = var17;
                        class212.field2011 = var18;
                        var19 = class186.field1839.method1641();
                     }

                     class335.field2687 = new class480[var19][];
                     class484.field3838 = new boolean[var19];
                     class58.method615(class54.field1075);
                     class22 var51 = class54.field1075;
                     class101.field1336 = var51;
                     class22 var20 = class54.field1075;
                     class395.field3088 = var20;
                     class22 var21 = class54.field1075;
                     class206.method1259(class54.field1075);
                     class145.method919(class54.field1075);
                     class116.method823(class54.field1075);
                     class478.field3657 = new class299(class521.field4093, 54, class219.field2034, class54.field1075);
                     class535.field4254 = new class299(class521.field4093, 47, class219.field2034, class54.field1075);
                     class113.field1463 = new class327();
                     class22 var22 = class54.field1075;
                     class22 var23 = class331.field2666;
                     class22 var24 = class522.field4124;
                     class337.field2710 = var22;
                     class337.field2693 = var23;
                     class337.field2695 = var24;
                     class316.method1692(class54.field1075, class331.field2666);
                     class22 var25 = class54.field1075;
                     class22 var26 = class331.field2666;
                     class444.field3375 = var26;
                     if (var25.method1634()) {
                        class444.field3364 = var25.method1655(35);
                        class444.field3363 = new class444[class444.field3364];

                        for(int var27 = 0; var27 < class444.field3364; ++var27) {
                           byte[] var28 = var25.method1629(35, var27);
                           class444.field3363[var27] = new class444(var27);
                           if (var28 != null) {
                              class444.field3363[var27].method2166(new class184(var28));
                              class444.field3363[var27].method2168();
                           }
                        }
                     }

                     class534.field4227 = class27.field451;
                     class534.field4226 = 60;
                     field608 = class277.field2367;
                  }
               } else if (field608 == class277.field2367) {
                  var30 = 0;
                  if (field656 == null) {
                     field656 = class526.method2492(class331.field2666, class508.field3972.field3135, 0);
                  } else {
                     ++var30;
                  }

                  if (class336.field2689 == null) {
                     class336.field2689 = class526.method2492(class331.field2666, class508.field3972.field3125, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class314.field2563) {
                     class314.field2563 = class398.method1920(class331.field2666, class508.field3972.field3128, 0);
                  } else {
                     ++var30;
                  }

                  if (class26.field233 == null) {
                     class26.field233 = class398.method1931(class331.field2666, class508.field3972.field3127, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class247.field2218) {
                     class247.field2218 = class398.method1931(class331.field2666, class508.field3972.field3133, 0);
                  } else {
                     ++var30;
                  }

                  if (class181.field1814 == null) {
                     class181.field1814 = class398.method1931(class331.field2666, class508.field3972.field3124, 0);
                  } else {
                     ++var30;
                  }

                  if (class461.field3590 == null) {
                     class461.field3590 = class398.method1931(class331.field2666, class508.field3972.field3130, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class465.field3603) {
                     class465.field3603 = class398.method1931(class331.field2666, class508.field3972.field3131, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class451.field3497) {
                     class451.field3497 = class398.method1931(class331.field2666, class508.field3972.field3132, 0);
                  } else {
                     ++var30;
                  }

                  if (class126.field1525 == null) {
                     class126.field1525 = class398.method1920(class331.field2666, class508.field3972.field3129, 0);
                  } else {
                     ++var30;
                  }

                  if (null == class48.field1044) {
                     class48.field1044 = class398.method1920(class331.field2666, class508.field3972.field3134, 0);
                  } else {
                     ++var30;
                  }

                  if (var30 < 11) {
                     class534.field4227 = class27.field260 + var30 * 100 / 12 + "%";
                     class534.field4226 = 70;
                  } else {
                     class282.field2419 = class48.field1044;
                     class336.field2689.method2007();
                     var2 = (int)(Math.random() * 21.0) - 10;
                     var3 = (int)(Math.random() * 21.0) - 10;
                     var4 = (int)(Math.random() * 21.0) - 10;
                     int var5 = (int)(Math.random() * 41.0) - 20;
                     class314.field2563[0].method1996(var5 + var2, var3 + var5, var5 + var4);
                     class534.field4227 = class27.field261;
                     class534.field4226 = 70;
                     field608 = class277.field2381;
                  }
               } else if (field608 == class277.field2381) {
                  if (!class516.field3994.method1634()) {
                     class534.field4227 = class27.field262 + "0%";
                     class534.field4226 = 90;
                  } else {
                     class382.field3060 = new class167(class516.field3994, class331.field2666, 20, class4.field36.method2427(), field580 ? 64 : 128);
                     class399.method1933(class382.field3060);
                     class399.method1934(class4.field36.method2427());
                     field608 = class277.field2382;
                  }
               } else if (class277.field2382 == field608) {
                  var30 = class382.field3060.method1008();
                  if (var30 < 100) {
                     class534.field4227 = class27.field262 + var30 + "%";
                     class534.field4226 = 90;
                  } else {
                     class534.field4227 = class27.field540;
                     class534.field4226 = 90;
                     field608 = class277.field2379;
                  }
               } else if (field608 == class277.field2379) {
                  class146.field1607 = new class520();
                  class210.field1969.method727(class146.field1607, 10);
                  class534.field4227 = class27.field368;
                  class534.field4226 = 92;
                  field608 = class277.field2378;
               } else if (class277.field2378 == field608) {
                  if (!class43.field928.method1649("huffman", "")) {
                     class534.field4227 = class27.field287 + 0 + "%";
                     class534.field4226 = 94;
                  } else {
                     class173 var29 = new class173(class43.field928.method1648("huffman", ""));
                     class68.method651(var29);
                     class534.field4227 = class27.field266;
                     class534.field4226 = 94;
                     field608 = class277.field2372;
                  }
               } else if (class277.field2372 == field608) {
                  if (!class372.field2920.method1634()) {
                     class534.field4227 = class27.field267 + class372.field2920.method253() * 4 / 5 + "%";
                     class534.field4226 = 96;
                  } else if (!class177.field1799.method1634()) {
                     class534.field4227 = class27.field267 + (80 + class177.field1799.method253() / 6) + "%";
                     class534.field4226 = 96;
                  } else if (!class522.field4124.method1634()) {
                     class534.field4227 = class27.field267 + (96 + class522.field4124.method253() / 50) + "%";
                     class534.field4226 = 96;
                  } else {
                     class534.field4227 = class27.field268;
                     class534.field4226 = 98;
                     if (class177.field1799.method1651("version.dat", "")) {
                        class184 var1 = new class184(class177.field1799.method1648("version.dat", ""));
                        var1.method1174();
                     }

                     field608 = class277.field2380;
                  }
               } else if (field608 == class277.field2380) {
                  class534.field4226 = 100;
                  if (class219.field2035.method1641() > 0 && !class219.field2035.method1650(class511.field3982.field3981)) {
                     class534.field4227 = class27.field269 + class219.field2035.method1656(class511.field3982.field3981) / 10 + "%";
                  } else {
                     if (null == class477.field3650) {
                        class477.field3650 = new class6();
                        class477.field3650.method16(class219.field2035, class444.field3386, class226.field2089, class112.field1452, field645, class314.field2563);
                     }

                     class534.field4227 = class27.field369;
                     field608 = class277.field2369;
                  }
               } else {
                  if (class277.field2369 == field608) {
                     method520(10);
                  }

               }
            }
         }
      }
   }

   static class22 method456(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      class347 var6 = null;
      if (null != class237.field2172) {
         var6 = new class347(var0, class237.field2172, class60.field1103[var0], 1000000);
      }

      return new class22(var6, class222.field2041, class40.field923, var0, var1, var2, var3, var4);
   }

   static void method442() {
      field641.method1802();
      field641.field2759.field1818 = 0;
      field641.field2755 = null;
      field641.field2760 = null;
      field641.field2766 = null;
      field641.field2767 = null;
      field641.field2761 = 0;
      field641.field2765 = 0;
      field596 = 0;
      method498();
      field829 = 0;
      field827 = 0;

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         field749[var1] = null;
      }

      class259.field2281 = null;

      for(var1 = 0; var1 < field636.length; ++var1) {
         class433 var2 = field636[var1];
         if (var2 != null) {
            var2.field4033 = -1;
            var2.field4003 = false;
         }
      }

      class78.method706();
      method520(30);

      for(var1 = 0; var1 < 100; ++var1) {
         field586[var1] = true;
      }

      method422();
   }

   static final void method552() {
      field641.method1801();
      method434();
      class75.field1223.method1026();

      for(int var1 = 0; var1 < 4; ++var1) {
         field651[var1].method1537();
      }

      field815.method1307();
      System.gc();
      class106.method792(0, 0);
      class69.method661();
      field848 = false;
      class372.method1869();
      method520(10);
   }

   static long method447() {
      return field706;
   }

   static final void method434() {
      class451.method2225();
      class179.field1801.method1848();
      class396.method1914();
      class35.method558();
      class453.field3511.method1848();
      class453.field3517.method1848();
      class71.field1141.method1848();
      class71.field1186.method1848();
      class71.field1143.method1848();
      class157.field1666.method1848();
      class157.field1657.method1848();
      class157.field1665.method1848();
      class529.field4154.method1848();
      class529.field4155.method1848();
      class259.field2275.method1848();
      class12.field113.method1848();
      class478.field3657.method1658();
      class535.field4254.method1658();
      class337.method1785();
      class316.field2569.method1848();
      class316.field2570.method1848();
      class135.field1570.method1848();
      class206.method1258();
      class444.field3365.method1848();
      class150.method937();
      class116.method821();
      field772.method1848();
      field662.method1848();
      class229.field2124.method1848();
      class480.method2358();
      ((class167)class399.field3111.field2239).method1011();
      class106.field1420.method1848();
      field867.method1817();
      class300.field2503.method1644();
      class81.field1250.method1644();
      class372.field2920.method1644();
      class57.field1081.method1644();
      class9.field105.method1644();
      class303.field2520.method1644();
      class461.field3589.method1644();
      class331.field2666.method1644();
      class516.field3994.method1644();
      class43.field928.method1644();
      class360.field2825.method1644();
      class177.field1799.method1644();
      class254.field2236.method1644();
   }

   static final void method486() {
      if (field629 > 0) {
         method552();
      } else {
         field644.method2366();
         method520(40);
         class168.field1714 = field641.method1800();
         field641.method1799();
      }
   }

   static final void method435(boolean var0) {
      if (var0) {
         field826 = class534.field4240 ? class158.field1680 : class158.field1679;
      } else {
         field826 = class4.field36.method2422(class534.field4243) ? class158.field1683 : class158.field1686;
      }

   }

   static final void method514() {
      if (class209.field1963 != null) {
         class209.field1963.method1759();
      }

   }

   static void method466(class157 var0, int var1, int var2, int var3) {
      if (field831 < 50 && class4.field36.method2432() != 0) {
         if (null != var0.field1658 && var1 < var0.field1658.length) {
            method406(var0.field1658[var1], var2, var3);
         }
      }
   }

   static void method474(class157 var0, int var1, int var2, int var3) {
      if (field831 < 50 && class4.field36.method2432() != 0) {
         if (null != var0.field1672 && var0.field1672.containsKey(var1)) {
            method406((Integer)var0.field1672.get(var1), var2, var3);
         }
      }
   }

   static void method406(int var0, int var1, int var2) {
      if (var0 != 0) {
         int var4 = var0 >> 8;
         int var5 = var0 >> 4 & 7;
         int var6 = var0 & 15;
         field832[field831] = var4;
         field833[field831] = var5;
         field788[field831] = 0;
         field620[field831] = null;
         int var7 = (var1 - 64) / 128;
         int var8 = (var2 - 64) / 128;
         field583[field831] = (var7 << 16) + (var8 << 8) + var6;
         ++field831;
      }
   }

   static void method407(int var0, int var1, int var2) {
      if (class4.field36.method2414() != 0 && var1 != 0 && field831 < 50) {
         field832[field831] = var0;
         field833[field831] = var1;
         field788[field831] = var2;
         field620[field831] = null;
         field583[field831] = 0;
         ++field831;
      }

   }

   static void method510(int var0) {
      if (var0 == -1 && !field848) {
         class106.method792(0, 0);
      } else if (var0 != -1 && !class228.method1379(var0) && class4.field36.method2406() != 0) {
         ArrayList var2 = new ArrayList();
         var2.add(new class131(class303.field2520, var0, 0, class4.field36.method2406(), false));
         if (field848) {
            class228.field2106.clear();
            class228.field2106.addAll(var2);
            class228.method1383(0, 100, 100, 0);
         } else {
            class228.method1377(var2, 0, 100, 100, 0, false);
         }
      }

   }

   static void method423(int var0, int var1) {
      if (class4.field36.method2406() != 0 && var0 != -1) {
         ArrayList var3 = new ArrayList();
         var3.add(new class131(class360.field2825, var0, 0, class4.field36.method2406(), false));
         class228.method1377(var3, 0, 0, 0, 0, true);
         field848 = true;
      }

   }

   static final void method537() {
      if (class108.field1440) {
         for(int var1 = 0; var1 < class190.field1866; ++var1) {
            class522 var2 = field749[class190.field1867[var1]];
            var2.method2489();
         }

         class108.field1440 = false;
      }

   }

   static final void method469() {
      if (field822 != class192.field1881) {
         field822 = class192.field1881;
         method396(class192.field1881);
      }

   }

   static final void method529(class480 var0, int var1, int var2) {
      if (field829 == 0 || field829 == 3) {
         if (!field689 && (class441.field3343 == 1 || !class136.field1574 && class441.field3343 == 4)) {
            class288 var4 = var0.method2322(true);
            if (var4 == null) {
               return;
            }

            int var5 = class441.field3344 - var1;
            int var6 = class441.field3345 - var2;
            if (var4.method1601(var5, var6)) {
               var5 -= var4.field2447 / 2;
               var6 -= var4.field2446 / 2;
               int var7 = field754 & 2047;
               int var8 = class399.field3109[var7];
               int var9 = class399.field3107[var7];
               int var10 = var9 * var5 + var8 * var6 >> 11;
               int var11 = var9 * var6 - var8 * var5 >> 11;
               int var12 = class259.field2281.field4028 + var10 >> 7;
               int var13 = class259.field2281.field3999 - var11 >> 7;
               class335 var14 = class335.method1773(class46.field972, field641.field2758);
               var14.field2686.method1114(18);
               var14.field2686.method1150(class69.field1134 + var12);
               var14.field2686.method1177(var13 + class478.field3659);
               var14.field2686.method1161(field724.method171(82) ? (field724.method171(81) ? 2 : 1) : 0);
               var14.field2686.method1114(var5);
               var14.field2686.method1114(var6);
               var14.field2686.method1155(field754);
               var14.field2686.method1114(57);
               var14.field2686.method1114(0);
               var14.field2686.method1114(0);
               var14.field2686.method1114(89);
               var14.field2686.method1155(class259.field2281.field4028);
               var14.field2686.method1155(class259.field2281.field3999);
               var14.field2686.method1114(63);
               field641.method1797(var14);
               field827 = var12;
               field750 = var13;
            }
         }

      }
   }

   static final void method494() {
      int[] var1 = class190.field1867;

      int var2;
      for(var2 = 0; var2 < class190.field1866; ++var2) {
         class522 var3 = field749[var1[var2]];
         if (var3 != null && var3.field4022 > 0) {
            --var3.field4022;
            if (var3.field4022 == 0) {
               var3.field4069 = null;
            }
         }
      }

      for(var2 = 0; var2 < field637; ++var2) {
         int var5 = field575[var2];
         class433 var4 = field636[var5];
         if (var4 != null && var4.field4022 > 0) {
            --var4.field4022;
            if (var4.field4022 == 0) {
               var4.field4069 = null;
            }
         }
      }

   }

   static final int method438(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }

   static final int method397(int var0) {
      return Math.abs(var0 - class333.field2680) > 1024 ? var0 + 2048 * (var0 < class333.field2680 ? 1 : -1) : var0;
   }

   static final void method450(int var0, int var1, int var2) {
      if (class453.field3545 < var0) {
         class453.field3545 += class262.field2287 + class441.field3347 * (var0 - class453.field3545) / 1000;
         if (class453.field3545 > var0) {
            class453.field3545 = var0;
         }
      }

      if (class453.field3545 > var0) {
         class453.field3545 -= class262.field2287 + class441.field3347 * (class453.field3545 - var0) / 1000;
         if (class453.field3545 < var0) {
            class453.field3545 = var0;
         }
      }

      if (class439.field3327 < var1) {
         class439.field3327 += class262.field2287 + (var1 - class439.field3327) * class441.field3347 / 1000;
         if (class439.field3327 > var1) {
            class439.field3327 = var1;
         }
      }

      if (class439.field3327 > var1) {
         class439.field3327 -= (class439.field3327 - var1) * class441.field3347 / 1000 + class262.field2287;
         if (class439.field3327 < var1) {
            class439.field3327 = var1;
         }
      }

      if (class158.field1688 < var2) {
         class158.field1688 += class262.field2287 + (var2 - class158.field1688) * class441.field3347 / 1000;
         if (class158.field1688 > var2) {
            class158.field1688 = var2;
         }
      }

      if (class158.field1688 > var2) {
         class158.field1688 -= (class158.field1688 - var2) * class441.field3347 / 1000 + class262.field2287;
         if (class158.field1688 < var2) {
            class158.field1688 = var2;
         }
      }

   }

   static final void method459() {
      int var1;
      int var2;
      int var3;
      if (!field838) {
         var1 = 64 + class190.field1862 * 128;
         var2 = class180.field1807 * 128 + 64;
         var3 = method403(var1, var2, class192.field1881) - class12.field116;
         method450(var1, var3, var2);
      } else if (null != field841) {
         class453.field3545 = field841.method1320();
         class158.field1688 = field841.method1321();
         if (field840) {
            class439.field3327 = field841.method1322();
         } else {
            class439.field3327 = method403(class453.field3545, class158.field1688, class192.field1881) - field841.method1322();
         }

         field841.method723();
      }

      if (!field839) {
         var1 = 64 + class51.field1058 * 128;
         var2 = class259.field2278 * 128 + 64;
         var3 = method403(var1, var2, class192.field1881) - class84.field1267;
         int var4 = var1 - class453.field3545;
         int var5 = var3 - class439.field3327;
         int var6 = var2 - class158.field1688;
         int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
         int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.9490051269531) & 2047;
         int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.9490051269531) & 2047;
         class513.method2463(var8, var9);
      } else {
         if (field658 != null) {
            class382.field3061 = field658.method686();
            class382.field3061 = Math.min(Math.max(class382.field3061, 128), 383);
            field658.method723();
         }

         if (field632 != null) {
            class333.field2680 = field632.method686() & 2047;
            field632.method723();
         }
      }

   }

   static final void method543() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if (field669 == 0) {
         var1 = class259.field2281.field4028;
         var2 = class259.field2281.field3999;
         if (class105.field1418 - var1 < -500 || class105.field1418 - var1 > 500 || class192.field1883 - var2 < -500 || class192.field1883 - var2 > 500) {
            class105.field1418 = var1;
            class192.field1883 = var2;
         }

         if (class105.field1418 != var1) {
            class105.field1418 += (var1 - class105.field1418) / 16;
         }

         if (class192.field1883 != var2) {
            class192.field1883 += (var2 - class192.field1883) / 16;
         }

         var3 = class105.field1418 >> 7;
         var4 = class192.field1883 >> 7;
         var5 = method403(class105.field1418, class192.field1883, class192.field1881);
         var6 = 0;
         int var7;
         if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               for(int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                  int var9 = class192.field1881;
                  if (var9 < 3 && (class526.field4143[1][var7][var8] & 2) == 2) {
                     ++var9;
                  }

                  int var10 = var5 - class526.field4141[var9][var7][var8];
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

         if (var7 > field718) {
            field718 += (var7 - field718) / 24;
         } else if (var7 < field718) {
            field718 += (var7 - field718) / 80;
         }

         class359.field2815 = method403(class259.field2281.field4028, class259.field2281.field3999, class192.field1881) - field670;
      } else if (field669 == 1) {
         method410();
         short var11 = -1;
         if (field724.method171(33)) {
            var11 = 0;
         } else if (field724.method171(49)) {
            var11 = 1024;
         }

         if (field724.method171(48)) {
            if (var11 == 0) {
               var11 = 1792;
            } else if (var11 == 1024) {
               var11 = 1280;
            } else {
               var11 = 1536;
            }
         } else if (field724.method171(50)) {
            if (var11 == 0) {
               var11 = 256;
            } else if (var11 == 1024) {
               var11 = 768;
            } else {
               var11 = 512;
            }
         }

         byte var12 = 0;
         if (field724.method171(35)) {
            var12 = -1;
         } else if (field724.method171(51)) {
            var12 = 1;
         }

         var3 = 0;
         if (var11 >= 0 || var12 != 0) {
            var3 = field724.method171(81) ? field675 : field674;
            var3 *= 16;
            field672 = var11;
            field673 = var12;
         }

         if (field671 < var3) {
            field671 += var3 / 8;
            if (field671 > var3) {
               field671 = var3;
            }
         } else if (field671 > var3) {
            field671 = field671 * 9 / 10;
         }

         if (field671 > 0) {
            var4 = field671 / 16;
            if (field672 >= 0) {
               var1 = field672 - class333.field2680 & 2047;
               var5 = class399.field3109[var1];
               var6 = class399.field3107[var1];
               class105.field1418 += var5 * var4 / 65536;
               class192.field1883 += var6 * var4 / 65536;
            }

            if (field673 != 0) {
               class359.field2815 += field673 * var4;
               if (class359.field2815 > 0) {
                  class359.field2815 = 0;
               }
            }
         } else {
            field672 = -1;
            field673 = -1;
         }

         if (field724.method171(13)) {
            method415();
         }
      }

      if (class441.field3339 == 4 && class136.field1574) {
         var1 = class441.field3332 - field732;
         field666 = var1 * 2;
         field732 = var1 != -1 && var1 != 1 ? (field732 + class441.field3332) / 2 : class441.field3332;
         var2 = field588 - class441.field3349;
         field665 = var2 * 2;
         field588 = var2 != -1 && var2 != 1 ? (class441.field3349 + field588) / 2 : class441.field3349;
      } else {
         if (field724.method171(96)) {
            field665 += (-24 - field665) / 2;
         } else if (field724.method171(97)) {
            field665 += (24 - field665) / 2;
         } else {
            field665 /= 2;
         }

         if (field724.method171(98)) {
            field666 += (12 - field666) / 2;
         } else if (field724.method171(99)) {
            field666 += (-12 - field666) / 2;
         } else {
            field666 /= 2;
         }

         field732 = class441.field3332;
         field588 = class441.field3349;
      }

      field754 = field665 / 2 + field754 & 2047;
      field615 += field666 / 2;
      if (field615 < 128) {
         field615 = 128;
      }

      if (field615 > 383) {
         field615 = 383;
      }

   }

   static final void method515(class518 var0, int var1) {
      if (var0.field4054 >= field879) {
         method521(var0);
      } else {
         int var5;
         int var6;
         int var8;
         int var9;
         int var13;
         if (var0.field4055 >= field879) {
            boolean var3 = field879 == var0.field4055 || var0.field4043 == -1 || var0.field4060 != 0;
            if (!var3) {
               class157 var4 = class157.method984(var0.field4043);
               if (var4 != null && !var4.method983()) {
                  var3 = var0.field4045 + 1 > var4.field1674[var0.field4044];
               } else {
                  var3 = true;
               }
            }

            if (var3) {
               var13 = var0.field4055 - var0.field4054;
               var5 = field879 - var0.field4054;
               var6 = var0.field4002 * 64 + var0.field4050 * 128;
               int var7 = var0.field4002 * 64 + var0.field4052 * 128;
               var8 = var0.field4048 * 128 + var0.field4002 * 64;
               var9 = var0.field4002 * 64 + var0.field4018 * 128;
               var0.field4028 = ((var13 - var5) * var6 + var5 * var8) / var13;
               var0.field3999 = (var5 * var9 + var7 * (var13 - var5)) / var13;
            }

            var0.field4072 = 0;
            var0.field4039 = var0.field4056;
            var0.field4000 = var0.field4039;
         } else {
            var0.field4011 = var0.field4004;
            if (var0.field4046 == 0) {
               var0.field4072 = 0;
            } else {
               label297: {
                  if (var0.field4043 != -1 && var0.field4060 == 0) {
                     class157 var12 = class157.method984(var0.field4043);
                     if (var0.field4062 > 0 && var12.field1676 == 0) {
                        ++var0.field4072;
                        break label297;
                     }

                     if (var0.field4062 <= 0 && var12.field1677 == 0) {
                        ++var0.field4072;
                        break label297;
                     }
                  }

                  int var14 = var0.field4028;
                  var13 = var0.field3999;
                  var5 = 128 * var0.field4073[var0.field4046 - 1] + var0.field4002 * 64;
                  var6 = var0.field4002 * 64 + 128 * var0.field4070[var0.field4046 - 1];
                  if (var14 < var5) {
                     if (var13 < var6) {
                        var0.field4039 = 1280;
                     } else if (var13 > var6) {
                        var0.field4039 = 1792;
                     } else {
                        var0.field4039 = 1536;
                     }
                  } else if (var14 > var5) {
                     if (var13 < var6) {
                        var0.field4039 = 768;
                     } else if (var13 > var6) {
                        var0.field4039 = 256;
                     } else {
                        var0.field4039 = 512;
                     }
                  } else if (var13 < var6) {
                     var0.field4039 = 1024;
                  } else if (var13 > var6) {
                     var0.field4039 = 0;
                  }

                  class423 var15 = var0.field4071[var0.field4046 - 1];
                  if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
                     var8 = var0.field4039 - var0.field4000 & 2047;
                     if (var8 > 1024) {
                        var8 -= 2048;
                     }

                     var9 = var0.field4008;
                     if (var8 >= -256 && var8 <= 256) {
                        var9 = var0.field4007;
                     } else if (var8 >= 256 && var8 < 768) {
                        var9 = var0.field4057;
                     } else if (var8 >= -768 && var8 <= -256) {
                        var9 = var0.field4009;
                     }

                     if (var9 == -1) {
                        var9 = var0.field4007;
                     }

                     var0.field4011 = var9;
                     int var10 = 4;
                     boolean var11 = true;
                     if (var0 instanceof class433) {
                        var11 = ((class433)var0).field3279.field3508;
                     }

                     if (var11) {
                        if (var0.field4039 != var0.field4000 && var0.field4033 == -1 && var0.field4067 != 0) {
                           var10 = 2;
                        }

                        if (var0.field4046 > 2) {
                           var10 = 6;
                        }

                        if (var0.field4046 > 3) {
                           var10 = 8;
                        }

                        if (var0.field4072 > 0 && var0.field4046 > 1) {
                           var10 = 8;
                           --var0.field4072;
                        }
                     } else {
                        if (var0.field4046 > 1) {
                           var10 = 6;
                        }

                        if (var0.field4046 > 2) {
                           var10 = 8;
                        }

                        if (var0.field4072 > 0 && var0.field4046 > 1) {
                           var10 = 8;
                           --var0.field4072;
                        }
                     }

                     if (var15 == class423.field3207) {
                        var10 <<= 1;
                     } else if (var15 == class423.field3206) {
                        var10 >>= 1;
                     }

                     if (var10 >= 8) {
                        if (var0.field4011 == var0.field4007 && var0.field4068 != -1) {
                           var0.field4011 = var0.field4068;
                        } else if (var0.field4008 == var0.field4011 && var0.field4012 != -1) {
                           var0.field4011 = var0.field4012;
                        } else if (var0.field4011 == var0.field4009 && var0.field4053 != -1) {
                           var0.field4011 = var0.field4053;
                        } else if (var0.field4057 == var0.field4011 && var0.field4014 != -1) {
                           var0.field4011 = var0.field4014;
                        }
                     } else if (var10 <= 2) {
                        if (var0.field4011 == var0.field4007 && var0.field4015 != -1) {
                           var0.field4011 = var0.field4015;
                        } else if (var0.field4011 == var0.field4008 && var0.field4016 != -1) {
                           var0.field4011 = var0.field4016;
                        } else if (var0.field4009 == var0.field4011 && var0.field4017 != -1) {
                           var0.field4011 = var0.field4017;
                        } else if (var0.field4057 == var0.field4011 && var0.field4047 != -1) {
                           var0.field4011 = var0.field4047;
                        }
                     }

                     if (var5 != var14 || var6 != var13) {
                        if (var14 < var5) {
                           var0.field4028 += var10;
                           if (var0.field4028 > var5) {
                              var0.field4028 = var5;
                           }
                        } else if (var14 > var5) {
                           var0.field4028 -= var10;
                           if (var0.field4028 < var5) {
                              var0.field4028 = var5;
                           }
                        }

                        if (var13 < var6) {
                           var0.field3999 += var10;
                           if (var0.field3999 > var6) {
                              var0.field3999 = var6;
                           }
                        } else if (var13 > var6) {
                           var0.field3999 -= var10;
                           if (var0.field3999 < var6) {
                              var0.field3999 = var6;
                           }
                        }
                     }

                     if (var5 == var0.field4028 && var0.field3999 == var6) {
                        --var0.field4046;
                        if (var0.field4062 > 0) {
                           --var0.field4062;
                        }
                     }
                  } else {
                     var0.field4028 = var5;
                     var0.field3999 = var6;
                     --var0.field4046;
                     if (var0.field4062 > 0) {
                        --var0.field4062;
                     }
                  }
               }
            }
         }
      }

      if (var0.field4028 < 128 || var0.field3999 < 128 || var0.field4028 >= 13184 || var0.field3999 >= 13184) {
         var0.field4043 = -1;
         var0.field4054 = 0;
         var0.field4055 = 0;
         var0.method2473();
         var0.field4028 = 128 * var0.field4073[0] + var0.field4002 * 64;
         var0.field3999 = var0.field4070[0] * 128 + var0.field4002 * 64;
         var0.method2466();
      }

      if (var0 == class259.field2281 && (var0.field4028 < 1536 || var0.field3999 < 1536 || var0.field4028 >= 11776 || var0.field3999 >= 11776)) {
         var0.field4043 = -1;
         var0.field4054 = 0;
         var0.field4055 = 0;
         var0.method2473();
         var0.field4028 = 128 * var0.field4073[0] + var0.field4002 * 64;
         var0.field3999 = var0.field4070[0] * 128 + var0.field4002 * 64;
         var0.method2466();
      }

      class219.method1319(var0);
      class97.method732(var0);
   }

   static final void method521(class518 var0) {
      int var2 = Math.max(1, var0.field4054 - field879);
      int var3 = var0.field4050 * 128 + var0.field4002 * 64;
      int var4 = var0.field4002 * 64 + var0.field4052 * 128;
      var0.field4028 += (var3 - var0.field4028) / var2;
      var0.field3999 += (var4 - var0.field3999) / var2;
      var0.field4072 = 0;
      var0.field4039 = var0.field4056;
   }

   static void method509() {
      if (null != class477.field3650) {
         class477.field3650.method22(class192.field1881, class69.field1134 + (class259.field2281.field4028 >> 7), class478.field3659 + (class259.field2281.field3999 >> 7), false);
         class477.field3650.method38();
      }

   }

   static void method554(class522 var0, int var1, int var2) {
      if (var1 == var0.field4043 && var1 != -1) {
         int var4 = class157.method984(var1).field1678;
         if (var4 == 1) {
            var0.field4044 = 0;
            var0.field4045 = 0;
            var0.field4060 = var2;
            var0.field4025 = 0;
         }

         if (var4 == 2) {
            var0.field4025 = 0;
         }
      } else if (var1 == -1 || var0.field4043 == -1 || class157.method984(var1).field1671 >= class157.method984(var0.field4043).field1671) {
         var0.field4043 = var1;
         var0.field4044 = 0;
         var0.field4045 = 0;
         var0.field4060 = var2;
         var0.field4025 = 0;
         var0.field4062 = var0.field4046;
      }

   }

   static int method484() {
      return field807 ? 2 : 1;
   }

   static void method422() {
      class335 var1 = class335.method1773(class46.field1021, field641.field2758);
      var1.field2686.method1114(method484());
      var1.field2686.method1155(class426.field3228);
      var1.field2686.method1155(class456.field3562);
      field641.method1797(var1);
   }

   static final void method541(String var0, boolean var1) {
      if (field702) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class253.field2234.method1589(var0, 250);
         int var7 = class253.field2234.method1568(var0, 250) * 13;
         class156.method954(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
         class156.method957(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
         class253.field2234.method1565(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         int var8 = var4 - var3;
         int var9 = var5 - var3;
         int var10 = var3 + var6 + var3;
         int var11 = var3 + var7 + var3;

         for(int var12 = 0; var12 < field747; ++var12) {
            if (field801[var12] + field803[var12] > var8 && field801[var12] < var10 + var8 && field802[var12] + field804[var12] > var9 && field802[var12] < var11 + var9) {
               field586[var12] = true;
            }
         }

         if (var1) {
            class300.field2508.method929(0, 0);
         } else {
            method395(var4, var5, var6, var7);
         }

      }
   }

   static final void method460(int var0, int var1, int var2, int var3) {
      ++field746;
      if (field827 == class259.field2281.field4028 >> 7 && field750 == class259.field2281.field3999 >> 7) {
         field827 = 0;
      }

      method491();
      method433();
      method500(true);
      method464();
      method500(false);

      int var7;
      for(class305 var5 = (class305)field703.method1236(); null != var5; var5 = (class305)field703.method1238()) {
         if (var5.field2523 == class192.field1881 && field879 <= var5.field2532) {
            if (field879 >= var5.field2547) {
               class433 var6;
               class522 var38;
               if (!var5.field2524 && var5.field2538 != 0) {
                  if (var5.field2538 > 0) {
                     var6 = field636[var5.field2538 - 1];
                     if (null != var6 && var6.field4028 >= 0 && var6.field4028 < 13312 && var6.field3999 >= 0 && var6.field3999 < 13312) {
                        var5.field2533 = var6.field4028;
                        var5.field2522 = var6.field3999;
                        var5.method1667(var5.field2528, var5.field2529, var5.field2530, field879);
                     }
                  } else {
                     var7 = -var5.field2538 - 1;
                     if (field704 == var7) {
                        var38 = class259.field2281;
                     } else {
                        var38 = field749[var7];
                     }

                     if (var38 != null && var38.field4028 >= 0 && var38.field4028 < 13312 && var38.field3999 >= 0 && var38.field3999 < 13312) {
                        var5.field2533 = var38.field4028;
                        var5.field2522 = var38.field3999;
                        var5.method1667(var5.field2528, var5.field2529, var5.field2530, field879);
                     }
                  }
               }

               if (var5.field2536 > 0) {
                  var6 = field636[var5.field2536 - 1];
                  if (var6 != null && var6.field4028 >= 0 && var6.field4028 < 13312 && var6.field3999 >= 0 && var6.field3999 < 13312) {
                     var5.method1667(var6.field4028, var6.field3999, method403(var6.field4028, var6.field3999, var5.field2523) - var5.field2527, field879);
                  }
               }

               if (var5.field2536 < 0) {
                  var7 = -var5.field2536 - 1;
                  if (var7 == field704) {
                     var38 = class259.field2281;
                  } else {
                     var38 = field749[var7];
                  }

                  if (null != var38 && var38.field4028 >= 0 && var38.field4028 < 13312 && var38.field3999 >= 0 && var38.field3999 < 13312) {
                     var5.method1667(var38.field4028, var38.field3999, method403(var38.field4028, var38.field3999, var5.field2523) - var5.field2527, field879);
                  }
               }

               var5.method1668(field655);
               class75.field1223.method1034(class192.field1881, (int)var5.field2546, (int)var5.field2539, (int)var5.field2540, 60, var5, var5.field2526, -1L, false);
            }
         } else {
            var5.method605();
         }
      }

      class336.method1774();
      class126.method877(var0, var1, var2, var3, true);
      var0 = field857;
      var1 = field858;
      var2 = field792;
      var3 = field667;
      class156.method961(var0, var1, var2 + var0, var1 + var3);
      class399.method1944();
      class156.method963();
      int var37 = field615;
      if (field718 / 256 > var37) {
         var37 = field718 / 256;
      }

      if (field844[4] && field798[4] + 128 > var37) {
         var37 = field798[4] + 128;
      }

      int var39 = field754 & 2047;
      var7 = class105.field1418;
      int var8 = class359.field2815;
      int var9 = class192.field1883;
      int var10 = method476(var37);
      int var12 = var3 - 334;
      if (var12 < 0) {
         var12 = 0;
      } else if (var12 > 100) {
         var12 = 100;
      }

      int var13 = field851 + (field852 - field851) * var12 / 100;
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
         var17 = class399.field3109[var12];
         var18 = class399.field3107[var12];
         var19 = var18 * var15 - var17 * var11 >> 16;
         var16 = var18 * var11 + var17 * var15 >> 16;
         var15 = var19;
      }

      if (var13 != 0) {
         var17 = class399.field3109[var13];
         var18 = class399.field3107[var13];
         var19 = var17 * var16 + var14 * var18 >> 16;
         var16 = var18 * var16 - var14 * var17 >> 16;
         var14 = var19;
      }

      if (field837) {
         class344.field2745 = var7 - var14;
         class113.field1457 = var8 - var15;
         class352.field2773 = var9 - var16;
         class502.field3955 = var37;
         class458.field3568 = var39;
      } else {
         class453.field3545 = var7 - var14;
         class439.field3327 = var8 - var15;
         class158.field1688 = var9 - var16;
         class382.field3061 = var37;
         class333.field2680 = var39;
      }

      if (field669 == 1 && field664 >= 2 && field879 % 50 == 0 && (class259.field2281.field4028 >> 7 != class105.field1418 >> 7 || class192.field1883 >> 7 != class259.field2281.field3999 >> 7)) {
         var17 = class259.field2281.field4116;
         var18 = (class105.field1418 >> 7) + class69.field1134;
         var19 = class478.field3659 + (class192.field1883 >> 7);
         method436(var18, var19, var17, true);
      }

      int var21;
      if (!field837) {
         if (class4.field36.method2405()) {
            var12 = class192.field1881;
         } else {
            label554: {
               var13 = 3;
               if (class382.field3061 < 310) {
                  label546: {
                     if (field669 == 1) {
                        var14 = class105.field1418 >> 7;
                        var15 = class192.field1883 >> 7;
                     } else {
                        var14 = class259.field2281.field4028 >> 7;
                        var15 = class259.field2281.field3999 >> 7;
                     }

                     var16 = class453.field3545 >> 7;
                     var17 = class158.field1688 >> 7;
                     if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                        if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                           if ((class526.field4143[class192.field1881][var16][var17] & 4) != 0) {
                              var13 = class192.field1881;
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

                                 if ((class526.field4143[class192.field1881][var16][var17] & 4) != 0) {
                                    var13 = class192.field1881;
                                 }

                                 var21 += var20;
                                 if (var21 >= 65536) {
                                    var21 -= 65536;
                                    if (var17 < var15) {
                                       ++var17;
                                    } else if (var17 > var15) {
                                       --var17;
                                    }

                                    if ((class526.field4143[class192.field1881][var16][var17] & 4) != 0) {
                                       var13 = class192.field1881;
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

                                    if ((class526.field4143[class192.field1881][var16][var17] & 4) != 0) {
                                       var13 = class192.field1881;
                                    }

                                    var21 += var20;
                                    if (var21 >= 65536) {
                                       var21 -= 65536;
                                       if (var16 < var14) {
                                          ++var16;
                                       } else if (var16 > var14) {
                                          --var16;
                                       }

                                       if ((class526.field4143[class192.field1881][var16][var17] & 4) != 0) {
                                          var13 = class192.field1881;
                                       }
                                    }
                                 }
                              }
                              break label546;
                           }
                        }

                        var12 = class192.field1881;
                        break label554;
                     }

                     var12 = class192.field1881;
                     break label554;
                  }
               }

               if (class259.field2281.field4028 >= 0 && class259.field2281.field3999 >= 0 && class259.field2281.field4028 < 13312 && class259.field2281.field3999 < 13312) {
                  if ((class526.field4143[class192.field1881][class259.field2281.field4028 >> 7][class259.field2281.field3999 >> 7] & 4) != 0) {
                     var13 = class192.field1881;
                  }

                  var12 = var13;
               } else {
                  var12 = class192.field1881;
               }
            }
         }

         var11 = var12;
      } else {
         var11 = method477();
      }

      var12 = class453.field3545;
      var13 = class439.field3327;
      var14 = class158.field1688;
      var15 = class382.field3061;
      var16 = class333.field2680;

      for(var17 = 0; var17 < 5; ++var17) {
         if (field844[var17]) {
            var18 = (int)(Math.random() * (double)(field638[var17] * 2 + 1) - (double)field638[var17] + Math.sin((double)field708[var17] / 100.0 * (double)field794[var17]) * (double)field798[var17]);
            if (var17 == 0) {
               class453.field3545 += var18;
            }

            if (var17 == 1) {
               class439.field3327 += var18;
            }

            if (var17 == 2) {
               class158.field1688 += var18;
            }

            if (var17 == 3) {
               class333.field2680 = class333.field2680 + var18 & 2047;
            }

            if (var17 == 4) {
               class382.field3061 += var18;
               if (class382.field3061 < 128) {
                  class382.field3061 = 128;
               }

               if (class382.field3061 > 383) {
                  class382.field3061 = 383;
               }
            }
         }
      }

      var17 = class441.field3349;
      var18 = class441.field3332;
      if (class441.field3343 != 0) {
         var17 = class441.field3344;
         var18 = class441.field3345;
      }

      if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
         class256.method1468(var17 - var0, var18 - var1);
      } else {
         class256.method1469();
      }

      method514();
      class156.method954(var0, var1, var2, var3, 0);
      method514();
      var19 = class399.method1941();
      class399.method1945(class191.field1877.field1984);
      class399.field3111.field2240 = field861;
      class75.field1223.method1054(class453.field3545, class439.field3327, class158.field1688, class382.field3061, class333.field2680, var11);
      class399.method1945(false);
      if (field640) {
         class156.method964();
      }

      class399.field3111.field2240 = var19;
      method514();
      class75.field1223.method1073();
      field681 = 0;
      boolean var40 = false;
      var21 = -1;
      int var22 = -1;
      int var23 = class190.field1866;
      int[] var24 = class190.field1867;

      int var25;
      for(var25 = 0; var25 < field637 + var23; ++var25) {
         Object var26;
         if (var25 < var23) {
            var26 = field749[var24[var25]];
            if (field715 == var24[var25]) {
               var40 = true;
               var21 = var25;
               continue;
            }

            if (var26 == class259.field2281) {
               var22 = var25;
               continue;
            }
         } else {
            var26 = field636[field575[var25 - var23]];
         }

         class331.method1761((class518)var26, var25, var0, var1, var2, var3, (byte)-53);
      }

      if (field814 && var22 != -1) {
         class331.method1761(class259.field2281, var22, var0, var1, var2, var3, (byte)1);
      }

      if (var40) {
         class331.method1761(field749[field715], var21, var0, var1, var2, var3, (byte)56);
      }

      for(var25 = 0; var25 < field681; ++var25) {
         int var41 = field683[var25];
         int var27 = field684[var25];
         int var28 = field860[var25];
         int var29 = field635[var25];
         boolean var30 = true;

         while(var30) {
            var30 = false;

            for(int var31 = 0; var31 < var25; ++var31) {
               if (var27 + 2 > field684[var31] - field635[var31] && var27 - var29 < 2 + field684[var31] && var41 - var28 < field860[var31] + field683[var31] && var41 + var28 > field683[var31] - field860[var31] && field684[var31] - field635[var31] < var27) {
                  var27 = field684[var31] - field635[var31];
                  var30 = true;
               }
            }
         }

         field694 = field683[var25];
         field695 = field684[var25] = var27;
         String var42 = field691[var25];
         if (field752 == 0) {
            int var32 = 16776960;
            if (field687[var25] < 6) {
               var32 = field808[field687[var25]];
            }

            if (field687[var25] == 6) {
               var32 = field746 % 20 < 10 ? 16711680 : 16776960;
            }

            if (field687[var25] == 7) {
               var32 = field746 % 20 < 10 ? 255 : '\uffff';
            }

            if (field687[var25] == 8) {
               var32 = field746 % 20 < 10 ? '\ub000' : 8454016;
            }

            int var33;
            if (field687[var25] == 9) {
               var33 = 150 - field836[var25];
               if (var33 < 50) {
                  var32 = 16711680 + var33 * 1280;
               } else if (var33 < 100) {
                  var32 = 16776960 - 327680 * (var33 - 50);
               } else if (var33 < 150) {
                  var32 = '\uff00' + 5 * (var33 - 100);
               }
            }

            if (field687[var25] == 10) {
               var33 = 150 - field836[var25];
               if (var33 < 50) {
                  var32 = var33 * 5 + 16711680;
               } else if (var33 < 100) {
                  var32 = 16711935 - 327680 * (var33 - 50);
               } else if (var33 < 150) {
                  var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
               }
            }

            if (field687[var25] == 11) {
               var33 = 150 - field836[var25];
               if (var33 < 50) {
                  var32 = 16777215 - var33 * 327685;
               } else if (var33 < 100) {
                  var32 = '\uff00' + (var33 - 50) * 327685;
               } else if (var33 < 150) {
                  var32 = 16777215 - 327680 * (var33 - 100);
               }
            }

            int var34;
            if (field687[var25] == 12 && field585[var25] == null) {
               var33 = var42.length();
               field585[var25] = new int[var33];

               for(var34 = 0; var34 < var33; ++var34) {
                  int var35 = (int)(64.0F * ((float)var34 / (float)var33));
                  int var36 = var35 << 10 | 896 | 64;
                  field585[var25][var34] = class393.field3078[var36];
               }
            }

            if (field688[var25] == 0) {
               class112.field1452.method1577(var42, var0 + field694, field695 + var1, var32, 0, field585[var25]);
            }

            if (field688[var25] == 1) {
               class112.field1452.method1588(var42, field694 + var0, field695 + var1, var32, 0, field746, field585[var25]);
            }

            if (field688[var25] == 2) {
               class112.field1452.method1576(var42, field694 + var0, var1 + field695, var32, 0, field746, field585[var25]);
            }

            if (field688[var25] == 3) {
               class112.field1452.method1590(var42, var0 + field694, field695 + var1, var32, 0, field746, 150 - field836[var25], field585[var25]);
            }

            if (field688[var25] == 4) {
               var33 = (150 - field836[var25]) * (class112.field1452.method1566(var42) + 100) / 150;
               class156.method967(field694 + var0 - 50, var1, field694 + var0 + 50, var1 + var3);
               class112.field1452.method1591(var42, 50 + var0 + field694 - var33, var1 + field695, var32, 0, field585[var25]);
               class156.method961(var0, var1, var2 + var0, var1 + var3);
            }

            if (field688[var25] == 5) {
               var33 = 150 - field836[var25];
               var34 = 0;
               if (var33 < 25) {
                  var34 = var33 - 25;
               } else if (var33 > 125) {
                  var34 = var33 - 125;
               }

               class156.method967(var0, field695 + var1 - class112.field1452.field2423 - 1, var0 + var2, 5 + field695 + var1);
               class112.field1452.method1577(var42, var0 + field694, var1 + field695 + var34, var32, 0, field585[var25]);
               class156.method961(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class112.field1452.method1573(var42, var0 + field694, field695 + var1, 16776960, 0);
         }
      }

      method426(var0, var1);
      ((class167)class399.field3111.field2239).method1010(field655);
      method463(var0, var1, var2, var3);
      class453.field3545 = var12;
      class439.field3327 = var13;
      class158.field1688 = var14;
      class382.field3061 = var15;
      class333.field2680 = var16;
      if (field589 && class40.field923.method140(true, false) == 0) {
         field589 = false;
      }

      if (field589) {
         class156.method954(var0, var1, var2, var3, 0);
         method541(class27.field245, false);
      }

   }

   static void method491() {
      if (field814) {
         class277.method1528(class259.field2281, false);
      }

   }

   static void method433() {
      if (field715 >= 0 && null != field749[field715]) {
         class277.method1528(field749[field715], false);
      }

   }

   static void method464() {
      int var1 = class190.field1866;
      int[] var2 = class190.field1867;

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var2[var3] != field715 && field704 != var2[var3]) {
            class277.method1528(field749[var2[var3]], true);
         }
      }

   }

   static final void method500(boolean var0) {
      for(int var2 = 0; var2 < field637; ++var2) {
         class433 var3 = field636[field575[var2]];
         if (null != var3 && var3.method2465() && var0 == var3.field3279.field3541 && var3.field3279.method2236()) {
            int var4 = var3.field4028 >> 7;
            int var5 = var3.field3999 >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (var3.field4002 == 1 && (var3.field4028 & 127) == 64 && (var3.field3999 & 127) == 64) {
                  if (field692[var4][var5] == field746) {
                     continue;
                  }

                  field692[var4][var5] = field746;
               }

               long var6 = class256.method1473(0, 0, 1, !var3.field3279.field3548, field575[var2]);
               var3.field4034 = field879;
               class75.field1223.method1034(class192.field1881, var3.field4028, var3.field3999, method403(var3.field4002 * 64 - 64 + var3.field4028, var3.field4002 * 64 - 64 + var3.field3999, class192.field1881), var3.field4002 * 64 - 64 + 60, var3, var3.field4000, var6, var3.field4006);
            }
         }
      }

   }

   static final int method477() {
      if (class4.field36.method2405()) {
         return class192.field1881;
      } else {
         int var1 = method403(class453.field3545, class158.field1688, class192.field1881);
         return var1 - class439.field3327 < 800 && (class526.field4143[class192.field1881][class453.field3545 >> 7][class158.field1688 >> 7] & 4) != 0 ? class192.field1881 : 3;
      }
   }

   static final void method426(int var0, int var1) {
      if (field654 == 2) {
         method430(field763 + (field600 - class69.field1134 << 7), field796 + (field743 - class478.field3659 << 7), field607 * 2);
         if (field694 > -1 && field879 % 20 < 10) {
            class181.field1814[0].method2032(field694 + var0 - 12, var1 + field695 - 28);
         }

      }
   }

   public static class201 method412() {
      return field791;
   }

   static void method556() {
      for(class166 var1 = (class166)field830.method1236(); var1 != null; var1 = (class166)field830.method1238()) {
         var1.method605();
      }

   }

   static void method472(class166 var0) {
      if (null != var0 && var0.field1706 != null) {
         if (var0.field1706.field3793 >= 0) {
            class480 var2 = class480.method2355(var0.field1706.field3691);
            if (null == var2 || null == var2.field3806 || var2.field3806.length == 0 || var0.field1706.field3793 >= var2.field3806.length || var2.field3806[var0.field1706.field3793] != var0.field1706) {
               return;
            }
         }

         if (var0.field1706.field3676 == 11 && var0.field1703 == 0) {
            if (var0.field1706.method2328(var0.field1704, var0.field1705, 0, 0)) {
               switch (var0.field1706.method2331()) {
                  case 0:
                     class352.method1812(var0.field1706.method2333(), true, false);
                     break;
                  case 1:
                     int var3 = method481(var0.field1706);
                     boolean var7 = (var3 >> 22 & 1) != 0;
                     if (var7) {
                        int[] var4 = var0.field1706.method2340();
                        if (null != var4) {
                           class335 var5 = class335.method1773(class46.field948, field641.field2758);
                           var5.field2686.method1162(var4[1]);
                           var5.field2686.method1163(var0.field1706.field3674);
                           var5.field2686.method1183(var0.field1706.field3793);
                           var5.field2686.method1180(var0.field1706.method2332());
                           var5.field2686.method1163(var4[2]);
                           var5.field2686.method1163(var4[0]);
                           field641.method1797(var5);
                        }
                     }
               }
            }
         } else if (var0.field1706.field3676 == 12) {
            class28 var6 = var0.field1706.method2350();
            if (null != var6 && var6.method309()) {
               switch (var0.field1703) {
                  case 0:
                     field815.method1308(var0.field1706);
                     var6.method270(true);
                     var6.method345(var0.field1704, var0.field1705, field724.method171(82), field724.method171(81));
                     break;
                  case 1:
                     var6.method328(var0.field1704, var0.field1705);
               }
            }
         }

      }
   }

   static boolean method440() {
      return (field579 & 4) != 0;
   }

   static boolean method448() {
      return (field579 & 2) != 0;
   }

   static boolean method496(class522 var0) {
      if (field579 == 0) {
         return false;
      } else {
         boolean var2;
         if (class259.field2281 == var0) {
            var2 = (field579 & 8) != 0;
            return var2;
         } else {
            var2 = method440();
            if (!var2) {
               boolean var3 = (field579 & 1) != 0;
               var2 = var3 && var0.method2477();
            }

            return var2 || method448() && var0.method2480();
         }
      }
   }

   static final void method463(int var0, int var1, int var2, int var3) {
      field701 = 0;
      int var5 = (class259.field2281.field4028 >> 7) + class69.field1134;
      int var6 = class478.field3659 + (class259.field2281.field3999 >> 7);
      if (var5 >= 3053 && var5 <= 3156 && var6 >= 3056 && var6 <= 3136) {
         field701 = 1;
      }

      if (var5 >= 3072 && var5 <= 3118 && var6 >= 9492 && var6 <= 9535) {
         field701 = 1;
      }

      if (field701 == 1 && var5 >= 3139 && var5 <= 3199 && var6 >= 3008 && var6 <= 3062) {
         field701 = 0;
      }

   }

   static final void method417(class518 var0, int var1) {
      method430(var0.field4028, var0.field3999, var1);
   }

   static final void method430(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = method403(var0, var1, class192.field1881) - var2;
         var0 -= class453.field3545;
         var4 -= class439.field3327;
         var1 -= class158.field1688;
         int var5 = class399.field3109[class382.field3061];
         int var6 = class399.field3107[class382.field3061];
         int var7 = class399.field3109[class333.field2680];
         int var8 = class399.field3107[class333.field2680];
         int var9 = var0 * var8 + var1 * var7 >> 16;
         var1 = var1 * var8 - var7 * var0 >> 16;
         var0 = var9;
         var9 = var6 * var4 - var5 * var1 >> 16;
         var1 = var1 * var6 + var4 * var5 >> 16;
         if (var1 >= 50) {
            field694 = var0 * field861 / var1 + field792 / 2;
            field695 = field861 * var9 / var1 + field667 / 2;
         } else {
            field694 = -1;
            field695 = -1;
         }

      } else {
         field694 = -1;
         field695 = -1;
      }
   }

   static final int method403(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && (class526.field4143[1][var4][var5] & 2) == 2) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = class526.field4141[var6][var4 + 1][var5] * var7 + (128 - var7) * class526.field4141[var6][var4][var5] >> 7;
         int var10 = (128 - var7) * class526.field4141[var6][var4][var5 + 1] + class526.field4141[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var10 * var8 + (128 - var8) * var9 >> 7;
      } else {
         return 0;
      }
   }

   static final void method505(boolean var0, class164 var1) {
      field652 = var0;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (!field652) {
         int var3 = var1.method1174();
         var4 = var1.method1154();
         var5 = var1.method1174();
         class340.field2725 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class340.field2725[var6][var7] = var1.method1129();
            }
         }

         class83.field1258 = new int[var5];
         class112.field1453 = new int[var5];
         class136.field1571 = new int[var5];
         class97.field1316 = new byte[var5][];
         class406.field3143 = new byte[var5][];
         var5 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               class83.field1258[var5] = var8;
               class112.field1453[var5] = class9.field105.method1654("m" + var6 + "_" + var7);
               class136.field1571[var5] = class9.field105.method1654("l" + var6 + "_" + var7);
               ++var5;
            }
         }

         method516(var3, var4, true);
      } else {
         boolean var16 = var1.method1125() == 1;
         var4 = var1.method1174();
         var5 = var1.method1174();
         var6 = var1.method1174();
         var1.method1006();

         int var9;
         int var10;
         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = var1.method1004(1);
                  if (var10 == 1) {
                     field653[var7][var8][var9] = var1.method1004(26);
                  } else {
                     field653[var7][var8][var9] = -1;
                  }
               }
            }
         }

         var1.method1007();
         class340.field2725 = new int[var6][4];

         for(var7 = 0; var7 < var6; ++var7) {
            for(var8 = 0; var8 < 4; ++var8) {
               class340.field2725[var7][var8] = var1.method1129();
            }
         }

         class83.field1258 = new int[var6];
         class112.field1453 = new int[var6];
         class136.field1571 = new int[var6];
         class97.field1316 = new byte[var6][];
         class406.field3143 = new byte[var6][];
         var6 = 0;

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = field653[var7][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < var6; ++var14) {
                        if (class83.field1258[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class83.field1258[var6] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class112.field1453[var6] = class9.field105.method1654("m" + var14 + "_" + var15);
                        class136.field1571[var6] = class9.field105.method1654("l" + var14 + "_" + var15);
                        ++var6;
                     }
                  }
               }
            }
         }

         method516(var5, var4, !var16);
      }

   }

   static final void method516(int var0, int var1, boolean var2) {
      if (!var2 || class526.field4131 != var0 || class520.field4086 != var1) {
         class526.field4131 = var0;
         class520.field4086 = var1;
         method520(25);
         method541(class27.field245, true);
         int var4 = class69.field1134;
         int var5 = class478.field3659;
         class69.field1134 = (var0 - 6) * 8;
         class478.field3659 = (var1 - 6) * 8;
         int var6 = class69.field1134 - var4;
         int var7 = class478.field3659 - var5;
         var4 = class69.field1134;
         var5 = class478.field3659;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 65536; ++var8) {
            class433 var9 = field636[var8];
            if (var9 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var9.field4073;
                  var10000[var10] -= var6;
                  var10000 = var9.field4070;
                  var10000[var10] -= var7;
               }

               var9.field4028 -= var6 * 128;
               var9.field3999 -= var7 * 128;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            class522 var20 = field749[var8];
            if (null != var20) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var20.field4073;
                  var10000[var10] -= var6;
                  var10000 = var20.field4070;
                  var10000[var10] -= var7;
               }

               var20.field4028 -= var6 * 128;
               var20.field3999 -= var7 * 128;
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
                     field716[var18][var14][var15] = field716[var18][var16][var17];
                  } else {
                     field716[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class51 var23 = (class51)field717.method1236(); null != var23; var23 = (class51)field717.method1238()) {
            var23.field1064 -= var6;
            var23.field1070 -= var7;
            if (var23.field1064 < 0 || var23.field1070 < 0 || var23.field1064 >= 104 || var23.field1070 >= 104) {
               var23.method605();
            }
         }

         if (field827 != 0) {
            field827 -= var6;
            field750 -= var7;
         }

         field831 = 0;
         field837 = false;
         class453.field3545 -= var6 << 7;
         class158.field1688 -= var7 << 7;
         class105.field1418 -= var6 << 7;
         class192.field1883 -= var7 << 7;
         field822 = -1;
         field846.method1232();
         field703.method1232();

         for(var15 = 0; var15 < 4; ++var15) {
            field651[var15].method1537();
         }

      }
   }

   static final void method445(boolean var0) {
      method514();
      ++field641.field2764;
      if (field641.field2764 >= 50 || var0) {
         field641.field2764 = 0;
         if (!field643 && field641.method1800() != null) {
            class335 var2 = class335.method1773(class46.field971, field641.field2758);
            field641.method1797(var2);

            try {
               field641.method1796();
            } catch (IOException var4) {
               field643 = true;
            }
         }

      }
   }

   static final void method531() {
      method445(false);
      field646 = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < class97.field1316.length; ++var2) {
         if (class112.field1453[var2] != -1 && class97.field1316[var2] == null) {
            class97.field1316[var2] = class9.field105.method1629(class112.field1453[var2], 0);
            if (null == class97.field1316[var2]) {
               var1 = false;
               ++field646;
            }
         }

         if (class136.field1571[var2] != -1 && class406.field3143[var2] == null) {
            class406.field3143[var2] = class9.field105.method1630(class136.field1571[var2], 0, class340.field2725[var2]);
            if (null == class406.field3143[var2]) {
               var1 = false;
               ++field646;
            }
         }
      }

      if (!var1) {
         field650 = 1;
      } else {
         field648 = 0;
         var1 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < class97.field1316.length; ++var2) {
            byte[] var3 = class406.field3143[var2];
            if (var3 != null) {
               var4 = (class83.field1258[var2] >> 8) * 64 - class69.field1134;
               var5 = 64 * (class83.field1258[var2] & 255) - class478.field3659;
               if (field652) {
                  var4 = 10;
                  var5 = 10;
               }

               var1 &= class526.method2501(var3, var4, var5);
            }
         }

         if (!var1) {
            field650 = 2;
         } else {
            if (field650 != 0) {
               method541(class27.field245 + class357.field2806 + class357.field2800 + 100 + "%" + class357.field2802, true);
            }

            method514();
            class75.field1223.method1026();

            for(var2 = 0; var2 < 4; ++var2) {
               field651[var2].method1537();
            }

            int var16;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var16 = 0; var16 < 104; ++var16) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     class526.field4143[var2][var16][var4] = 0;
                  }
               }
            }

            method514();
            class526.method2508();
            var2 = class97.field1316.length;
            class372.method1869();
            method445(true);
            int var18;
            if (!field652) {
               byte[] var6;
               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = 64 * (class83.field1258[var16] >> 8) - class69.field1134;
                  var5 = 64 * (class83.field1258[var16] & 255) - class478.field3659;
                  var6 = class97.field1316[var16];
                  if (null != var6) {
                     method514();
                     class526.method2504(var6, var4, var5, class526.field4131 * 8 - 48, class520.field4086 * 8 - 48, field651);
                  }
               }

               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = (class83.field1258[var16] >> 8) * 64 - class69.field1134;
                  var5 = (class83.field1258[var16] & 255) * 64 - class478.field3659;
                  var6 = class97.field1316[var16];
                  if (null == var6 && class520.field4086 < 800) {
                     method514();
                     class526.method2494(var4, var5, 64, 64);
                  }
               }

               method445(true);

               for(var16 = 0; var16 < var2; ++var16) {
                  byte[] var17 = class406.field3143[var16];
                  if (var17 != null) {
                     var5 = (class83.field1258[var16] >> 8) * 64 - class69.field1134;
                     var18 = (class83.field1258[var16] & 255) * 64 - class478.field3659;
                     method514();
                     class526.method2509(var17, var5, var18, class75.field1223, field651);
                  }
               }
            }

            int var7;
            int var8;
            int var9;
            if (field652) {
               int var10;
               int var11;
               int var12;
               for(var16 = 0; var16 < 4; ++var16) {
                  method514();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var19 = false;
                        var7 = field653[var16][var4][var5];
                        if (var7 != -1) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = (var10 / 8 << 8) + var11 / 8;

                           for(int var13 = 0; var13 < class83.field1258.length; ++var13) {
                              if (var12 == class83.field1258[var13] && class97.field1316[var13] != null) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 class236.method1423(class97.field1316[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, field651);
                                 var19 = true;
                                 break;
                              }
                           }
                        }

                        if (!var19) {
                           class526.method2507(var16, var4 * 8, var5 * 8);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < 13; ++var16) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = field653[0][var16][var4];
                     if (var5 == -1) {
                        class526.method2494(var16 * 8, var4 * 8, 8, 8);
                     }
                  }
               }

               method445(true);

               for(var16 = 0; var16 < 4; ++var16) {
                  method514();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var18 = field653[var16][var4][var5];
                        if (var18 != -1) {
                           var7 = var18 >> 24 & 3;
                           var8 = var18 >> 1 & 3;
                           var9 = var18 >> 14 & 1023;
                           var10 = var18 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class83.field1258.length; ++var12) {
                              if (var11 == class83.field1258[var12] && class406.field3143[var12] != null) {
                                 class526.method2491(class406.field3143[var12], var16, var4 * 8, var5 * 8, var7, (var9 & 7) * 8, 8 * (var10 & 7), var8, class75.field1223, field651);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            method445(true);
            method514();
            class526.method2499(class75.field1223, field651);
            method445(true);
            var16 = class526.field4133;
            if (var16 > class192.field1881) {
               var16 = class192.field1881;
            }

            if (var16 < class192.field1881 - 1) {
               var16 = class192.field1881 - 1;
            }

            if (field580) {
               class75.field1223.method1027(class526.field4133);
            } else {
               class75.field1223.method1027(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  method453(var4, var5);
               }
            }

            method514();
            method468();
            class449.field3464.method1848();
            class335 var20;
            if (class191.field1877.method1291()) {
               var20 = class335.method1773(class46.field956, field641.field2758);
               var20.field2686.method1180(1057001181);
               field641.method1797(var20);
            }

            if (!field652) {
               var4 = (class526.field4131 - 6) / 8;
               var5 = (6 + class526.field4131) / 8;
               var18 = (class520.field4086 - 6) / 8;
               var7 = (class520.field4086 + 6) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                        class9.field105.method1653("m" + var8 + "_" + var9);
                        class9.field105.method1653("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            method520(30);
            method514();
            class526.method2495();
            var20 = class335.method1773(class46.field977, field641.field2758);
            field641.method1797(var20);
            class210.method1301();
         }
      }
   }

   static final void method396(int var0) {
      int[] var2 = class3.field28.field3236;
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
            if ((class526.field4143[var0][var6][var4] & 24) == 0) {
               class75.field1223.method1049(var2, var5, 512, var0, var6, var4);
            }

            if (var0 < 3 && (class526.field4143[var0 + 1][var6][var4] & 8) != 0) {
               class75.field1223.method1049(var2, var5, 512, var0 + 1, var6, var4);
            }

            var5 += 4;
         }
      }

      var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
      var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
      class3.field28.method2006();

      int var7;
      for(var6 = 1; var6 < 103; ++var6) {
         for(var7 = 1; var7 < 103; ++var7) {
            if ((class526.field4143[var0][var7][var6] & 24) == 0) {
               method427(var0, var7, var6, var4, var5);
            }

            if (var0 < 3 && (class526.field4143[var0 + 1][var7][var6] & 8) != 0) {
               method427(var0 + 1, var7, var6, var4, var5);
            }
         }
      }

      field823 = 0;

      for(var6 = 0; var6 < 104; ++var6) {
         for(var7 = 0; var7 < 104; ++var7) {
            long var8 = class75.field1223.method1076(class192.field1881, var6, var7);
            if (0L != var8) {
               int var10 = class256.method1471(var8);
               int var11 = class444.method2172(var10, (byte)46).field3469;
               if (var11 >= 0 && class444.method2173(var11).field3373) {
                  field834[field823] = class444.method2173(var11).method2169(false);
                  field824[field823] = var6;
                  field825[field823] = var7;
                  ++field823;
               }
            }
         }
      }

      class300.field2508.method932();
   }

   static final void method427(int var0, int var1, int var2, int var3, int var4) {
      long var6 = class75.field1223.method1062(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var15;
      int var24;
      if (0L != var6) {
         var8 = class75.field1223.method1044(var0, var1, var2, var6);
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

         int[] var23 = class3.field28.field3236;
         var24 = (103 - var2) * 2048 + 24624 + var1 * 4;
         var15 = class256.method1471(var6);
         class449 var16 = class444.method2172(var15, (byte)8);
         if (var16.field3468 != -1) {
            class425 var17 = class314.field2563[var16.field3468];
            if (null != var17) {
               int var18 = (var16.field3450 * 4 - var17.field3222) / 2;
               int var19 = (var16.field3435 * 4 - var17.field3223) / 2;
               var17.method2000(var18 + var1 * 4 + 48, var19 + 48 + 4 * (104 - var2 - var16.field3435));
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

      var6 = class75.field1223.method1043(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class75.field1223.method1044(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class256.method1471(var6);
         class449 var12 = class444.method2172(var11, (byte)17);
         if (var12.field3468 != -1) {
            class425 var25 = class314.field2563[var12.field3468];
            if (null != var25) {
               var24 = (var12.field3450 * 4 - var25.field3222) / 2;
               var15 = (var12.field3435 * 4 - var25.field3223) / 2;
               var25.method2000(var24 + 48 + var1 * 4, var15 + 4 * (104 - var2 - var12.field3435) + 48);
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

            int[] var29 = class3.field28.field3236;
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

      var6 = class75.field1223.method1076(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class256.method1471(var6);
         class449 var20 = class444.method2172(var8, (byte)35);
         if (var20.field3468 != -1) {
            class425 var21 = class314.field2563[var20.field3468];
            if (var21 != null) {
               var11 = (var20.field3450 * 4 - var21.field3222) / 2;
               int var22 = (var20.field3435 * 4 - var21.field3223) / 2;
               var21.method2000(var11 + var1 * 4 + 48, 4 * (104 - var2 - var20.field3435) + 48 + var22);
            }
         }
      }

   }

   static final void method432(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class51 var11 = null;

      for(class51 var12 = (class51)field717.method1236(); var12 != null; var12 = (class51)field717.method1238()) {
         if (var12.field1071 == var0 && var12.field1064 == var1 && var12.field1070 == var2 && var3 == var12.field1057) {
            var11 = var12;
            break;
         }
      }

      if (null == var11) {
         var11 = new class51();
         var11.field1071 = var0;
         var11.field1057 = var3;
         var11.field1064 = var1;
         var11.field1070 = var2;
         var11.field1066 = -1;
         method446(var11);
         field717.method1240(var11);
      }

      var11.field1063 = var4;
      var11.field1059 = var5;
      var11.field1065 = var6;
      var11.field1068 = var8;
      var11.field1069 = var9;
      var11.method600(var7);
   }

   static final boolean method549(int var0, int var1, int var2, int var3, int var4) {
      class51 var6 = null;

      for(class51 var7 = (class51)field717.method1236(); var7 != null; var7 = (class51)field717.method1238()) {
         if (var0 == var7.field1071 && var1 == var7.field1064 && var2 == var7.field1070 && var3 == var7.field1057) {
            var6 = var7;
            break;
         }
      }

      if (null != var6) {
         var6.field1066 = var4;
         return true;
      } else {
         return false;
      }
   }

   static final void method468() {
      for(class51 var1 = (class51)field717.method1236(); null != var1; var1 = (class51)field717.method1238()) {
         if (var1.field1069 == -1) {
            var1.field1068 = 0;
            method446(var1);
         } else {
            var1.method605();
         }
      }

   }

   static final void method446(class51 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (var0.field1057 == 0) {
         var2 = class75.field1223.method1062(var0.field1071, var0.field1064, var0.field1070);
      }

      if (var0.field1057 == 1) {
         var2 = class75.field1223.method1067(var0.field1071, var0.field1064, var0.field1070);
      }

      if (var0.field1057 == 2) {
         var2 = class75.field1223.method1043(var0.field1071, var0.field1064, var0.field1070);
      }

      if (var0.field1057 == 3) {
         var2 = class75.field1223.method1076(var0.field1071, var0.field1064, var0.field1070);
      }

      if (var2 != 0L) {
         int var7 = class75.field1223.method1044(var0.field1071, var0.field1064, var0.field1070, var2);
         var4 = class256.method1471(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field1060 = var4;
      var0.field1062 = var5;
      var0.field1061 = var6;
   }

   static final void method548() {
      for(class51 var1 = (class51)field717.method1236(); var1 != null; var1 = (class51)field717.method1238()) {
         if (var1.field1069 > 0) {
            --var1.field1069;
         }

         boolean var2;
         int var3;
         int var4;
         class449 var5;
         if (var1.field1069 == 0) {
            if (var1.field1060 >= 0) {
               var3 = var1.field1060;
               var4 = var1.field1062;
               var5 = class444.method2172(var3, (byte)-69);
               if (var4 == 11) {
                  var4 = 10;
               }

               if (var4 >= 5 && var4 <= 8) {
                  var4 = 4;
               }

               var2 = var5.method2210(var4);
               if (!var2) {
                  continue;
               }
            }

            method553(var1.field1071, var1.field1057, var1.field1064, var1.field1070, var1.field1060, var1.field1061, var1.field1062, var1.field1066);
            var1.method605();
         } else {
            if (var1.field1068 > 0) {
               --var1.field1068;
            }

            if (var1.field1068 == 0 && var1.field1064 >= 1 && var1.field1070 >= 1 && var1.field1064 <= 102 && var1.field1070 <= 102) {
               if (var1.field1063 >= 0) {
                  var3 = var1.field1063;
                  var4 = var1.field1059;
                  var5 = class444.method2172(var3, (byte)-10);
                  if (var4 == 11) {
                     var4 = 10;
                  }

                  if (var4 >= 5 && var4 <= 8) {
                     var4 = 4;
                  }

                  var2 = var5.method2210(var4);
                  if (!var2) {
                     continue;
                  }
               }

               method553(var1.field1071, var1.field1057, var1.field1064, var1.field1070, var1.field1063, var1.field1065, var1.field1059, var1.field1066);
               var1.field1068 = -1;
               if (var1.field1063 == var1.field1060 && var1.field1060 == -1) {
                  var1.method605();
               } else if (var1.field1063 == var1.field1060 && var1.field1065 == var1.field1061 && var1.field1062 == var1.field1059) {
                  var1.method605();
               }
            }
         }
      }

   }

   static final void method553(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (field580 && var0 != class192.field1881) {
            return;
         }

         long var9 = 0L;
         boolean var11 = true;
         boolean var12 = false;
         boolean var13 = false;
         if (var1 == 0) {
            var9 = class75.field1223.method1062(var0, var2, var3);
         }

         if (var1 == 1) {
            var9 = class75.field1223.method1067(var0, var2, var3);
         }

         if (var1 == 2) {
            var9 = class75.field1223.method1043(var0, var2, var3);
         }

         if (var1 == 3) {
            var9 = class75.field1223.method1076(var0, var2, var3);
         }

         int var14;
         if (var9 != 0L) {
            var14 = class75.field1223.method1044(var0, var2, var3, var9);
            int var38 = class256.method1471(var9);
            int var39 = var14 & 31;
            int var40 = var14 >> 6 & 3;
            class449 var15;
            if (var1 == 0) {
               class75.field1223.method1069(var0, var2, var3);
               var15 = class444.method2172(var38, (byte)10);
               if (var15.field3452 != 0) {
                  field651[var0].method1534(var2, var3, var39, var40, var15.field3453);
               }
            }

            if (var1 == 1) {
               class75.field1223.method1037(var0, var2, var3);
            }

            if (var1 == 2) {
               class75.field1223.method1070(var0, var2, var3);
               var15 = class444.method2172(var38, (byte)26);
               if (var2 + var15.field3450 > 103 || var3 + var15.field3450 > 103 || var15.field3435 + var2 > 103 || var3 + var15.field3435 > 103) {
                  return;
               }

               if (var15.field3452 != 0) {
                  field651[var0].method1538(var2, var3, var15.field3450, var15.field3435, var40, var15.field3453);
               }
            }

            if (var1 == 3) {
               class75.field1223.method1039(var0, var2, var3);
               var15 = class444.method2172(var38, (byte)17);
               if (var15.field3452 == 1) {
                  field651[var0].method1536(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var14 = var0;
            if (var0 < 3 && (class526.field4143[1][var2][var3] & 2) == 2) {
               var14 = var0 + 1;
            }

            class175 var41 = class75.field1223;
            class278 var16 = field651[var0];
            class449 var17 = class444.method2172(var4, (byte)76);
            int var18 = var7 >= 0 ? var7 : var17.field3462;
            int var19;
            int var20;
            if (var5 != 1 && var5 != 3) {
               var19 = var17.field3450;
               var20 = var17.field3435;
            } else {
               var19 = var17.field3435;
               var20 = var17.field3450;
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

            int[][] var25 = class526.field4141[var14];
            int var26 = var25[var22][var23] + var25[var21][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
            int var27 = (var19 << 6) + (var2 << 7);
            int var28 = (var3 << 7) + (var20 << 6);
            long var29 = class256.method1473(var2, var3, 2, var17.field3459 == 0, var4);
            int var31 = (var5 << 6) + var6;
            if (var17.field3475 == 1) {
               var31 += 256;
            }

            Object var32;
            if (var6 == 22) {
               if (var18 == -1 && var17.field3476 == null) {
                  var32 = var17.method2214(22, var5, var25, var27, var26, var28);
               } else {
                  var32 = new class50(var4, 22, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
               }

               var41.method1031(var0, var2, var3, var26, (class496)var32, var29, var31);
               if (var17.field3452 == 1) {
                  var16.method1533(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var18 == -1 && null == var17.field3476) {
                     var32 = var17.method2214(var6, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class50(var4, var6, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                  }

                  var41.method1033(var0, var2, var3, var26, 1, 1, (class496)var32, 0, var29, var31);
                  if (var17.field3452 != 0) {
                     var16.method1531(var2, var3, var19, var20, var17.field3453);
                  }
               } else if (var6 == 0) {
                  if (var18 == -1 && null == var17.field3476) {
                     var32 = var17.method2214(0, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class50(var4, 0, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                  }

                  var41.method1053(var0, var2, var3, var26, (class496)var32, (class496)null, class526.field4136[var5], 0, var29, var31);
                  if (var17.field3452 != 0) {
                     var16.method1530(var2, var3, var6, var5, var17.field3453);
                  }
               } else if (var6 == 1) {
                  if (var18 == -1 && var17.field3476 == null) {
                     var32 = var17.method2214(1, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class50(var4, 1, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                  }

                  var41.method1053(var0, var2, var3, var26, (class496)var32, (class496)null, class526.field4137[var5], 0, var29, var31);
                  if (var17.field3452 != 0) {
                     var16.method1530(var2, var3, var6, var5, var17.field3453);
                  }
               } else {
                  int var44;
                  if (var6 == 2) {
                     var44 = var5 + 1 & 3;
                     Object var33;
                     Object var34;
                     if (var18 == -1 && var17.field3476 == null) {
                        var33 = var17.method2214(2, var5 + 4, var25, var27, var26, var28);
                        var34 = var17.method2214(2, var44, var25, var27, var26, var28);
                     } else {
                        var33 = new class50(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field3467, (class496)null);
                        var34 = new class50(var4, 2, var44, var14, var2, var3, var18, var17.field3467, (class496)null);
                     }

                     var41.method1053(var0, var2, var3, var26, (class496)var33, (class496)var34, class526.field4136[var5], class526.field4136[var44], var29, var31);
                     if (var17.field3452 != 0) {
                        var16.method1530(var2, var3, var6, var5, var17.field3453);
                     }
                  } else if (var6 == 3) {
                     if (var18 == -1 && null == var17.field3476) {
                        var32 = var17.method2214(3, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class50(var4, 3, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                     }

                     var41.method1053(var0, var2, var3, var26, (class496)var32, (class496)null, class526.field4137[var5], 0, var29, var31);
                     if (var17.field3452 != 0) {
                        var16.method1530(var2, var3, var6, var5, var17.field3453);
                     }
                  } else if (var6 == 9) {
                     if (var18 == -1 && var17.field3476 == null) {
                        var32 = var17.method2214(var6, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class50(var4, var6, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                     }

                     var41.method1033(var0, var2, var3, var26, 1, 1, (class496)var32, 0, var29, var31);
                     if (var17.field3452 != 0) {
                        var16.method1531(var2, var3, var19, var20, var17.field3453);
                     }
                  } else if (var6 == 4) {
                     if (var18 == -1 && null == var17.field3476) {
                        var32 = var17.method2214(4, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class50(var4, 4, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                     }

                     var41.method1068(var0, var2, var3, var26, (class496)var32, (class496)null, class526.field4136[var5], 0, 0, 0, var29, var31);
                  } else {
                     Object var35;
                     long var42;
                     if (var6 == 5) {
                        var44 = 16;
                        var42 = var41.method1062(var0, var2, var3);
                        if (var42 != 0L) {
                           var44 = class444.method2172(class256.method1471(var42), (byte)-62).field3456;
                        }

                        if (var18 == -1 && null == var17.field3476) {
                           var35 = var17.method2214(4, var5, var25, var27, var26, var28);
                        } else {
                           var35 = new class50(var4, 4, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
                        }

                        var41.method1068(var0, var2, var3, var26, (class496)var35, (class496)null, class526.field4136[var5], 0, class526.field4138[var5] * var44, var44 * class526.field4139[var5], var29, var31);
                     } else if (var6 == 6) {
                        var44 = 8;
                        var42 = var41.method1062(var0, var2, var3);
                        if (var42 != 0L) {
                           var44 = class444.method2172(class256.method1471(var42), (byte)-48).field3456 / 2;
                        }

                        if (var18 == -1 && var17.field3476 == null) {
                           var35 = var17.method2214(4, var5 + 4, var25, var27, var26, var28);
                        } else {
                           var35 = new class50(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field3467, (class496)null);
                        }

                        var41.method1068(var0, var2, var3, var26, (class496)var35, (class496)null, 256, var5, var44 * class526.field4144[var5], class526.field4142[var5] * var44, var29, var31);
                     } else if (var6 == 7) {
                        int var43 = var5 + 2 & 3;
                        if (var18 == -1 && var17.field3476 == null) {
                           var32 = var17.method2214(4, var43 + 4, var25, var27, var26, var28);
                        } else {
                           var32 = new class50(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field3467, (class496)null);
                        }

                        var41.method1068(var0, var2, var3, var26, (class496)var32, (class496)null, 256, var43, 0, 0, var29, var31);
                     } else if (var6 == 8) {
                        var44 = 8;
                        var42 = var41.method1062(var0, var2, var3);
                        if (0L != var42) {
                           var44 = class444.method2172(class256.method1471(var42), (byte)-82).field3456 / 2;
                        }

                        int var37 = var5 + 2 & 3;
                        Object var36;
                        if (var18 == -1 && var17.field3476 == null) {
                           var35 = var17.method2214(4, var5 + 4, var25, var27, var26, var28);
                           var36 = var17.method2214(4, var37 + 4, var25, var27, var26, var28);
                        } else {
                           var35 = new class50(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field3467, (class496)null);
                           var36 = new class50(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field3467, (class496)null);
                        }

                        var41.method1068(var0, var2, var3, var26, (class496)var35, (class496)var36, 256, var5, var44 * class526.field4144[var5], var44 * class526.field4142[var5], var29, var31);
                     }
                  }
               }
            } else {
               if (var18 == -1 && null == var17.field3476) {
                  var32 = var17.method2214(10, var5, var25, var27, var26, var28);
               } else {
                  var32 = new class50(var4, 10, var5, var14, var2, var3, var18, var17.field3467, (class496)null);
               }

               if (var32 != null) {
                  var41.method1033(var0, var2, var3, var26, var19, var20, (class496)var32, var6 == 11 ? 256 : 0, var29, var31);
               }

               if (var17.field3452 != 0) {
                  var16.method1531(var2, var3, var19, var20, var17.field3453);
               }
            }
         }
      }

   }

   static final void method453(int var0, int var1) {
      class201 var3 = field716[class192.field1881][var0][var1];
      if (null == var3) {
         class75.field1223.method1040(class192.field1881, var0, var1);
      } else {
         long var4 = -99999999L;
         class443 var6 = null;

         class443 var7;
         for(var7 = (class443)var3.method1236(); var7 != null; var7 = (class443)var3.method1238()) {
            class71 var8 = class71.method682(var7.field3359);
            long var9 = (long)var8.field1156;
            if (var8.field1155 == 1) {
               var9 *= var7.field3360 < Integer.MAX_VALUE ? (long)(var7.field3360 + 1) : (long)var7.field3360;
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (var6 == null) {
            class75.field1223.method1040(class192.field1881, var0, var1);
         } else {
            var3.method1241(var6);
            class443 var12 = null;
            class443 var13 = null;

            for(var7 = (class443)var3.method1236(); var7 != null; var7 = (class443)var3.method1238()) {
               if (var7.field3359 != var6.field3359) {
                  if (var12 == null) {
                     var12 = var7;
                  }

                  if (var7.field3359 != var12.field3359 && null == var13) {
                     var13 = var7;
                  }
               }
            }

            long var10 = class256.method1473(var0, var1, 3, false, 0);
            class75.field1223.method1032(class192.field1881, var0, var1, method403(var0 * 128 + 64, 64 + var1 * 128, class192.field1881), var6, var10, var12, var13);
         }
      }
   }

   static final void method499(boolean var0, class164 var1) {
      field845 = 0;
      field690 = 0;
      var1.method1006();
      int var3 = var1.method1004(8);
      int var4;
      if (var3 < field637) {
         for(var4 = var3; var4 < field637; ++var4) {
            field602[++field845 - 1] = field575[var4];
         }
      }

      if (var3 > field637) {
         throw new RuntimeException("");
      } else {
         field637 = 0;

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = field575[var4];
            class433 var6 = field636[var5];
            int var7 = var1.method1004(1);
            if (var7 == 0) {
               field575[++field637 - 1] = var5;
               var6.field4063 = field879;
            } else {
               int var8 = var1.method1004(2);
               if (var8 == 0) {
                  field575[++field637 - 1] = var5;
                  var6.field4063 = field879;
                  field787[++field690 - 1] = var5;
               } else {
                  int var9;
                  int var10;
                  if (var8 == 1) {
                     field575[++field637 - 1] = var5;
                     var6.field4063 = field879;
                     var9 = var1.method1004(3);
                     var6.method2116(var9, class423.field3210);
                     var10 = var1.method1004(1);
                     if (var10 == 1) {
                        field787[++field690 - 1] = var5;
                     }
                  } else if (var8 == 2) {
                     field575[++field637 - 1] = var5;
                     var6.field4063 = field879;
                     if (var1.method1004(1) == 1) {
                        var9 = var1.method1004(3);
                        var6.method2116(var9, class423.field3207);
                        var10 = var1.method1004(3);
                        var6.method2116(var10, class423.field3207);
                     } else {
                        var9 = var1.method1004(3);
                        var6.method2116(var9, class423.field3206);
                     }

                     var9 = var1.method1004(1);
                     if (var9 == 1) {
                        field787[++field690 - 1] = var5;
                     }
                  } else if (var8 == 3) {
                     field602[++field845 - 1] = var5;
                  }
               }
            }
         }

         method524(var0, var1);
         method457(var1);

         for(var3 = 0; var3 < field845; ++var3) {
            var4 = field602[var3];
            if (field636[var4].field4063 != field879) {
               field636[var4].field3279 = null;
               field636[var4] = null;
            }
         }

         if (var1.field1818 != field641.field2761) {
            throw new RuntimeException(var1.field1818 + class357.field2804 + field641.field2761);
         } else {
            for(var3 = 0; var3 < field637; ++var3) {
               if (null == field636[field575[var3]]) {
                  throw new RuntimeException(var3 + class357.field2804 + field637);
               }
            }

         }
      }
   }

   static final void method524(boolean var0, class164 var1) {
      while(true) {
         byte var3 = 16;
         int var4 = 1 << var3;
         if (var1.method1005(field641.field2761) >= var3 + 12) {
            int var5 = var1.method1004(var3);
            if (var5 != var4 - 1) {
               boolean var6 = false;
               if (null == field636[var5]) {
                  field636[var5] = new class433();
                  var6 = true;
               }

               class433 var7 = field636[var5];
               field575[++field637 - 1] = var5;
               var7.field4063 = field879;
               int var9;
               if (var0) {
                  var9 = var1.method1004(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method1004(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               boolean var11 = var1.method1004(1) == 1;
               if (var11) {
                  var1.method1004(32);
               }

               int var8 = var1.method1004(1);
               int var12 = field757[var1.method1004(3)];
               if (var6) {
                  var7.field4039 = var7.field4000 = var12;
               }

               var7.field3279 = class453.method2242(var1.method1004(14));
               int var13 = var1.method1004(1);
               if (var13 == 1) {
                  field787[++field690 - 1] = var5;
               }

               int var10;
               if (var0) {
                  var10 = var1.method1004(8);
                  if (var10 > 127) {
                     var10 -= 256;
                  }
               } else {
                  var10 = var1.method1004(5);
                  if (var10 > 15) {
                     var10 -= 32;
                  }
               }

               method489(var7);
               if (var7.field4067 == 0) {
                  var7.field4000 = 0;
               }

               var7.method2117(class259.field2281.field4073[0] + var9, class259.field2281.field4070[0] + var10, var8 == 1);
               continue;
            }
         }

         var1.method1007();
         return;
      }
   }

   static final void method457(class164 var0) {
      for(int var2 = 0; var2 < field690; ++var2) {
         int var3 = field787[var2];
         class433 var4 = field636[var3];
         int var5 = var0.method1125();
         int var6;
         if ((var5 & 8) != 0) {
            var6 = var0.method1125();
            var5 += var6 << 8;
         }

         if ((var5 & 2048) != 0) {
            var6 = var0.method1125();
            var5 += var6 << 16;
         }

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         if ((var5 & 128) != 0) {
            var6 = var0.method1185();
            int var12;
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var0.method1172();
                  if (var8 == 32767) {
                     var8 = var0.method1172();
                     var10 = var0.method1172();
                     var9 = var0.method1172();
                     var11 = var0.method1172();
                  } else if (var8 != 32766) {
                     var10 = var0.method1172();
                  } else {
                     var8 = -1;
                  }

                  var12 = var0.method1172();
                  var4.method2471(var8, var10, var9, var11, field879, var12);
               }
            }

            var7 = var0.method1147();
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var0.method1172();
                  var10 = var0.method1172();
                  if (var10 != 32767) {
                     var11 = var0.method1172();
                     var12 = var0.method1185();
                     int var13 = var10 > 0 ? var0.method1185() : var12;
                     var4.method2467(var9, field879, var10, var11, var12, var13);
                  } else {
                     var4.method2472(var9);
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
            var6 = var0.method1125();
            if ((var6 & 1) == 1) {
               var4.method2123();
            } else {
               var14 = null;
               if ((var6 & 2) == 2) {
                  var8 = var0.method1146();
                  var14 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method1154();
                     var10 = var10 == 65535 ? -1 : var10;
                     var14[var9] = var10;
                  }
               }

               var15 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (null != var4.field3279.field3533) {
                     var9 = var4.field3279.field3533.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method1153();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (null != var4.field3279.field3529) {
                     var10 = var4.field3279.field3529.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method1153();
                  }
               }

               var18 = false;
               if ((var6 & 16) != 0) {
                  var18 = var0.method1147() == 1;
               }

               var17 = (long)(++class433.field3285 - 1);
               var4.method2128(new class90(var17, var14, var15, var16, var18));
            }
         }

         if ((var5 & 32) != 0) {
            var6 = var0.method1153();
            var7 = var0.method1174();
            var4.field4038 = var0.method1185() == 1;
            if (field758 >= 212) {
               var4.field4036 = var6;
               var4.field4037 = var7;
            } else {
               var8 = var4.field4028 - 64 * (var6 - class69.field1134 - class69.field1134);
               var9 = var4.field3999 - (var7 - class478.field3659 - class478.field3659) * 64;
               if (var8 != 0 || var9 != 0) {
                  var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167) & 2047;
                  var4.field4035 = var11;
               }
            }
         }

         if ((var5 & 64) != 0) {
            var6 = var0.method1174();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var0.method1147();
            if (var4.field4043 == var6 && var6 != -1) {
               var8 = class157.method984(var6).field1678;
               if (var8 == 1) {
                  var4.field4044 = 0;
                  var4.field4045 = 0;
                  var4.field4060 = var7;
                  var4.field4025 = 0;
               }

               if (var8 == 2) {
                  var4.field4025 = 0;
               }
            } else if (var6 == -1 || var4.field4043 == -1 || class157.method984(var6).field1671 >= class157.method984(var4.field4043).field1671) {
               var4.field4043 = var6;
               var4.field4044 = 0;
               var4.field4045 = 0;
               var4.field4060 = var7;
               var4.field4025 = 0;
               var4.field4062 = var4.field4046;
            }
         }

         if ((var5 & 131072) != 0) {
            var6 = var0.method1185();

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var0.method1147();
               var9 = var0.method1154();
               var10 = var0.method1170();
               var4.method2468(var8, var9, var10 >> 16, var10 & '\uffff');
            }
         }

         if ((var5 & 4) != 0) {
            var4.field3279 = class453.method2242(var0.method1174());
            method489(var4);
            var4.method2122();
         }

         if ((var5 & 16) != 0) {
            var4.field4033 = var0.method1152();
            var4.field4033 += var0.method1147() << 16;
            var6 = 16777215;
            if (var6 == var4.field4033) {
               var4.field4033 = -1;
            }
         }

         if ((var5 & 4096) != 0) {
            var4.field4050 = var0.method1149();
            var4.field4052 = var0.method1149();
            var4.field4048 = var0.method1148();
            var4.field4018 = var0.method1140();
            var4.field4054 = var0.method1152() + field879;
            var4.field4055 = var0.method1174() + field879;
            var4.field4056 = var0.method1154();
            var4.field4046 = 1;
            var4.field4062 = 0;
            var4.field4050 += var4.field4073[0];
            var4.field4052 += var4.field4070[0];
            var4.field4048 += var4.field4073[0];
            var4.field4018 += var4.field4070[0];
         }

         if ((var5 & 65536) != 0) {
            var6 = var0.method1165();
            var4.field4005 = (var6 & 1) != 0 ? var0.method1154() : 1686120851 * var4.field3279.field3519 * -1670226789;
            var4.field4066 = (var6 & 2) != 0 ? var0.method1153() : 821598169 * var4.field3279.field3520 * -1405323159;
            var4.field4007 = (var6 & 4) != 0 ? var0.method1152() : var4.field3279.field3535;
            var4.field4008 = (var6 & 8) != 0 ? var0.method1154() : 129510829 * var4.field3279.field3522 * 1271381541;
            var4.field4009 = (var6 & 16) != 0 ? var0.method1153() : -1909691015 * var4.field3279.field3523 * 799501513;
            var4.field4057 = (var6 & 32) != 0 ? var0.method1153() : var4.field3279.field3524;
            var4.field4068 = (var6 & 64) != 0 ? var0.method1154() : -1380991387 * var4.field3279.field3525 * -725499027;
            var4.field4012 = (var6 & 128) != 0 ? var0.method1154() : var4.field3279.field3526;
            var4.field4053 = (var6 & 256) != 0 ? var0.method1152() : var4.field3279.field3527;
            var4.field4014 = (var6 & 512) != 0 ? var0.method1154() : var4.field3279.field3552;
            var4.field4015 = (var6 & 1024) != 0 ? var0.method1152() : var4.field3279.field3521;
            var4.field4016 = (var6 & 2048) != 0 ? var0.method1154() : -2089336141 * var4.field3279.field3530 * -1708442501;
            var4.field4017 = (var6 & 4096) != 0 ? var0.method1152() : 2098030227 * var4.field3279.field3536 * -1815894117;
            var4.field4047 = (var6 & 8192) != 0 ? var0.method1153() : var4.field3279.field3553;
            var4.field4004 = (var6 & 16384) != 0 ? var0.method1152() : var4.field3279.field3518;
         }

         if ((var5 & 262144) != 0) {
            var6 = var0.method1125();
            var14 = new int[8];
            var15 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if ((var6 & 1 << var9) != 0) {
                  var14[var9] = var0.method1173();
                  var15[var9] = (short)var0.method1137();
               } else {
                  var14[var9] = -1;
                  var15[var9] = -1;
               }
            }

            var4.method2121(var14, var15);
         }

         if ((var5 & '\u8000') != 0) {
            var4.method2112(var0.method1133());
         }

         if ((var5 & 2) != 0) {
            var0.method1174();
            var0.method1129();
         }

         if ((var5 & 1) != 0) {
            var4.field4069 = var0.method1133();
            var4.field4022 = 100;
         }

         if ((var5 & 8192) != 0) {
            var4.field4059 = field879 + var0.method1174();
            var4.field4001 = field879 + var0.method1174();
            var4.field4061 = var0.method1148();
            var4.field4019 = var0.method1148();
            var4.field4013 = var0.method1148();
            var4.field4051 = (byte)var0.method1125();
         }

         if ((var5 & 256) != 0) {
            var6 = var0.method1146();
            if ((var6 & 1) == 1) {
               var4.method2126();
            } else {
               var14 = null;
               if ((var6 & 2) == 2) {
                  var8 = var0.method1146();
                  var14 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method1153();
                     var10 = var10 == 65535 ? -1 : var10;
                     var14[var9] = var10;
                  }
               }

               var15 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var4.field3279.field3533 != null) {
                     var9 = var4.field3279.field3533.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method1153();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var4.field3279.field3529 != null) {
                     var10 = var4.field3279.field3529.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method1152();
                  }
               }

               var18 = false;
               if ((var6 & 16) != 0) {
                  var18 = var0.method1147() == 1;
               }

               var17 = (long)(++class433.field3278 - 1);
               var4.method2125(new class90(var17, var14, var15, var16, var18));
            }
         }

         if ((var5 & 16384) != 0) {
            var4.method2113(var0.method1146());
         }

         if ((var5 & 1024) != 0) {
            var4.field4074 = var0.method1129();
         }
      }

   }

   static void method489(class433 var0) {
      var0.field4002 = var0.field3279.field3515;
      var0.field4067 = var0.field3279.field3544;
      var0.field4007 = var0.field3279.field3535;
      var0.field4008 = var0.field3279.field3522;
      var0.field4009 = var0.field3279.field3523;
      var0.field4057 = var0.field3279.field3524;
      var0.field4004 = var0.field3279.field3518;
      var0.field4005 = var0.field3279.field3519;
      var0.field4066 = var0.field3279.field3520;
      var0.field4068 = var0.field3279.field3525;
      var0.field4012 = var0.field3279.field3526;
      var0.field4053 = var0.field3279.field3527;
      var0.field4014 = var0.field3279.field3552;
      var0.field4015 = var0.field3279.field3521;
      var0.field4016 = var0.field3279.field3530;
      var0.field4017 = var0.field3279.field3536;
      var0.field4047 = var0.field3279.field3553;
   }

   static class326 method513(int var0, int var1) {
      field876.field2631 = var0;
      field876.field2630 = var1;
      field876.field2632 = 1;
      field876.field2633 = 1;
      return field876;
   }

   static void method498() {
      field725 = 0;
      field689 = false;
   }

   static void method525() {
      method498();
      field731[0] = class27.field477;
      field850[0] = "";
      field769[0] = 1006;
      field733[0] = false;
      field725 = 1;
   }

   static final boolean method547() {
      return field689;
   }

   static final void method395(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < field747; ++var5) {
         if (field803[var5] + field801[var5] > var0 && field801[var5] < var2 + var0 && field804[var5] + field802[var5] > var1 && field802[var5] < var3 + var1) {
            field799[var5] = true;
         }
      }

   }

   static final boolean method419(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var2 = field769[var0];
         if (var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }

   static final void method545(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class433 var10;
      class335 var11;
      if (var2 == 9) {
         var10 = field636[var3];
         if (null != var10) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field1020, field641.field2758);
            var11.field2686.method1145(field724.method171(82) ? 1 : 0);
            var11.field2686.method1177(var3);
            field641.method1797(var11);
         }
      }

      if (var2 == 12) {
         var10 = field636[var3];
         if (var10 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field990, field641.field2758);
            var11.field2686.method1145(field724.method171(82) ? 1 : 0);
            var11.field2686.method1155(var3);
            field641.method1797(var11);
         }
      }

      class522 var13;
      if (var2 == 45) {
         var13 = field749[var3];
         if (null != var13) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field982, field641.field2758);
            var11.field2686.method1150(var3);
            var11.field2686.method1114(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 47) {
         var13 = field749[var3];
         if (var13 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field997, field641.field2758);
            var11.field2686.method1177(var3);
            var11.field2686.method1187(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      class480 var14;
      if (var2 == 57 || var2 == 1007) {
         var14 = class480.method2352(var1, var0);
         if (null != var14) {
            method414(var3, var1, var0, var4, var6);
         }
      }

      class335 var15;
      if (var2 == 19) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field981, field641.field2758);
         var15.field2686.method1155(var1 + class478.field3659);
         var15.field2686.method1150(class69.field1134 + var0);
         var15.field2686.method1145(field724.method171(82) ? 1 : 0);
         var15.field2686.method1183(var3);
         field641.method1797(var15);
      }

      if (var2 == 1) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field949, field641.field2758);
         var15.field2686.method1177(class343.field2738);
         var15.field2686.method1180(class328.field2651);
         var15.field2686.method1155(class475.field3649);
         var15.field2686.method1150(var3);
         var15.field2686.method1177(var1 + class478.field3659);
         var15.field2686.method1177(class69.field1134 + var0);
         var15.field2686.method1114(field724.method171(82) ? 1 : 0);
         field641.method1797(var15);
      }

      if (var2 == 13) {
         var10 = field636[var3];
         if (var10 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field976, field641.field2758);
            var11.field2686.method1161(field724.method171(82) ? 1 : 0);
            var11.field2686.method1183(var3);
            field641.method1797(var11);
         }
      }

      if (var2 == 14) {
         var13 = field749[var3];
         if (var13 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field942, field641.field2758);
            var11.field2686.method1134(class328.field2651);
            var11.field2686.method1177(class343.field2738);
            var11.field2686.method1177(class475.field3649);
            var11.field2686.method1177(var3);
            var11.field2686.method1114(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 1002) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         var15 = class335.method1773(class46.field995, field641.field2758);
         var15.field2686.method1150(var3);
         field641.method1797(var15);
      }

      if (var2 == 10) {
         var10 = field636[var3];
         if (null != var10) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field984, field641.field2758);
            var11.field2686.method1114(field724.method171(82) ? 1 : 0);
            var11.field2686.method1183(var3);
            field641.method1797(var11);
         }
      }

      if (var2 == 1001) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field967, field641.field2758);
         var15.field2686.method1150(class478.field3659 + var1);
         var15.field2686.method1183(class69.field1134 + var0);
         var15.field2686.method1114(field724.method171(82) ? 1 : 0);
         var15.field2686.method1177(var3);
         field641.method1797(var15);
      }

      if (var2 == 26) {
         method502();
      }

      if (var2 == 8) {
         var10 = field636[var3];
         if (null != var10) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field1009, field641.field2758);
            var11.field2686.method1161(field724.method171(82) ? 1 : 0);
            var11.field2686.method1177(var3);
            var11.field2686.method1183(field710);
            var11.field2686.method1163(class325.field2628);
            var11.field2686.method1150(field744);
            field641.method1797(var11);
         }
      }

      if (var2 == 18) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field959, field641.field2758);
         var15.field2686.method1177(var3);
         var15.field2686.method1150(class69.field1134 + var0);
         var15.field2686.method1145(field724.method171(82) ? 1 : 0);
         var15.field2686.method1155(var1 + class478.field3659);
         field641.method1797(var15);
      }

      if (var2 == 23) {
         if (field689) {
            class75.field1223.method1072();
         } else {
            class75.field1223.method1051(class192.field1881, var0, var1, true);
         }
      }

      class335 var12;
      if (var2 == 24) {
         var14 = class480.method2355(var1);
         if (var14 != null) {
            boolean var17 = true;
            if (var14.field3700 > 0) {
               var17 = class119.method832(var14);
            }

            if (var17) {
               var12 = class335.method1773(class46.field946, field641.field2758);
               var12.field2686.method1180(var1);
               field641.method1797(var12);
            }
         }
      }

      if (var2 == 11) {
         var10 = field636[var3];
         if (null != var10) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field1012, field641.field2758);
            var11.field2686.method1150(var3);
            var11.field2686.method1114(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 49) {
         var13 = field749[var3];
         if (null != var13) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field979, field641.field2758);
            var11.field2686.method1177(var3);
            var11.field2686.method1161(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 16) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field985, field641.field2758);
         var15.field2686.method1150(class343.field2738);
         var15.field2686.method1183(var3);
         var15.field2686.method1114(field724.method171(82) ? 1 : 0);
         var15.field2686.method1177(class475.field3649);
         var15.field2686.method1183(class69.field1134 + var0);
         var15.field2686.method1177(class478.field3659 + var1);
         var15.field2686.method1162(class328.field2651);
         field641.method1797(var15);
      }

      if (var2 == 2) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field993, field641.field2758);
         var15.field2686.method1150(var3);
         var15.field2686.method1177(var0 + class69.field1134);
         var15.field2686.method1155(class478.field3659 + var1);
         var15.field2686.method1150(field744);
         var15.field2686.method1161(field724.method171(82) ? 1 : 0);
         var15.field2686.method1150(field710);
         var15.field2686.method1134(class325.field2628);
         field641.method1797(var15);
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
         class477.field3650.method74(var2, var3, new class89(var0), new class89(var1));
      }

      if (var2 == 6) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field1004, field641.field2758);
         var15.field2686.method1114(field724.method171(82) ? 1 : 0);
         var15.field2686.method1177(var1 + class478.field3659);
         var15.field2686.method1155(var3);
         var15.field2686.method1183(class69.field1134 + var0);
         field641.method1797(var15);
      }

      if (var2 == 21) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field975, field641.field2758);
         var15.field2686.method1114(field724.method171(82) ? 1 : 0);
         var15.field2686.method1183(class69.field1134 + var0);
         var15.field2686.method1177(class478.field3659 + var1);
         var15.field2686.method1183(var3);
         field641.method1797(var15);
      }

      if (var2 == 30 && field753 == null) {
         method551(var1, var0);
         field753 = class480.method2352(var1, var0);
         method485(field753);
      }

      if (var2 == 15) {
         var13 = field749[var3];
         if (var13 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field989, field641.field2758);
            var11.field2686.method1150(field744);
            var11.field2686.method1183(field710);
            var11.field2686.method1163(class325.field2628);
            var11.field2686.method1183(var3);
            var11.field2686.method1145(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      int var16;
      class480 var18;
      if (var2 == 28) {
         var15 = class335.method1773(class46.field946, field641.field2758);
         var15.field2686.method1180(var1);
         field641.method1797(var15);
         var18 = class480.method2355(var1);
         if (null != var18 && null != var18.field3738 && var18.field3738[0][0] == 5) {
            var16 = var18.field3738[0][1];
            class10.field107[var16] = 1 - class10.field107[var16];
            method507(var16);
         }
      }

      if (var2 == 48) {
         var13 = field749[var3];
         if (null != var13) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field944, field641.field2758);
            var11.field2686.method1177(var3);
            var11.field2686.method1161(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 4) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field934, field641.field2758);
         var15.field2686.method1155(class69.field1134 + var0);
         var15.field2686.method1155(class478.field3659 + var1);
         var15.field2686.method1183(var3);
         var15.field2686.method1187(field724.method171(82) ? 1 : 0);
         field641.method1797(var15);
      }

      if (var2 == 29) {
         var15 = class335.method1773(class46.field946, field641.field2758);
         var15.field2686.method1180(var1);
         field641.method1797(var15);
         var18 = class480.method2355(var1);
         if (null != var18 && var18.field3738 != null && var18.field3738[0][0] == 5) {
            var16 = var18.field3738[0][1];
            if (var18.field3797[0] != class10.field107[var16]) {
               class10.field107[var16] = var18.field3797[0];
               method507(var16);
            }
         }
      }

      if (var2 == 1003) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         var10 = field636[var3];
         if (null != var10) {
            class453 var19 = var10.field3279;
            if (null != var19.field3542) {
               var19 = var19.method2232();
            }

            if (null != var19) {
               var12 = class335.method1773(class46.field996, field641.field2758);
               var12.field2686.method1177(var19.field3513);
               field641.method1797(var12);
            }
         }
      }

      if (var2 == 44) {
         var13 = field749[var3];
         if (null != var13) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field941, field641.field2758);
            var11.field2686.method1150(var3);
            var11.field2686.method1161(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 1004) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         var15 = class335.method1773(class46.field974, field641.field2758);
         var15.field2686.method1155(class69.field1134 + var0);
         var15.field2686.method1150(var3);
         var15.field2686.method1183(class478.field3659 + var1);
         field641.method1797(var15);
      }

      if (var2 == 46) {
         var13 = field749[var3];
         if (var13 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field994, field641.field2758);
            var11.field2686.method1183(var3);
            var11.field2686.method1114(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 22) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field1002, field641.field2758);
         var15.field2686.method1150(var0 + class69.field1134);
         var15.field2686.method1155(var1 + class478.field3659);
         var15.field2686.method1145(field724.method171(82) ? 1 : 0);
         var15.field2686.method1155(var3);
         field641.method1797(var15);
      }

      if (var2 == 58) {
         var14 = class480.method2352(var1, var0);
         if (var14 != null) {
            if (null != var14.field3778) {
               class208 var20 = new class208();
               var20.field1951 = var14;
               var20.field1956 = var3;
               var20.field1960 = var6;
               var20.field1954 = var14.field3778;
               class18.method216(var20);
            }

            var11 = class335.method1773(class46.field945, field641.field2758);
            var11.field2686.method1177(field710);
            var11.field2686.method1155(var0);
            var11.field2686.method1150(field744);
            var11.field2686.method1155(var4);
            var11.field2686.method1163(class325.field2628);
            var11.field2686.method1162(var1);
            field641.method1797(var11);
         }
      }

      if (var2 == 5) {
         field696 = var7;
         field697 = var8;
         field813 = 2;
         field755 = 0;
         field827 = var0;
         field750 = var1;
         var15 = class335.method1773(class46.field970, field641.field2758);
         var15.field2686.method1155(var3);
         var15.field2686.method1150(class69.field1134 + var0);
         var15.field2686.method1145(field724.method171(82) ? 1 : 0);
         var15.field2686.method1155(class478.field3659 + var1);
         field641.method1797(var15);
      }

      if (var2 == 50) {
         var13 = field749[var3];
         if (var13 != null) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var11 = class335.method1773(class46.field1030, field641.field2758);
            var11.field2686.method1183(var3);
            var11.field2686.method1114(field724.method171(82) ? 1 : 0);
            field641.method1797(var11);
         }
      }

      if (var2 == 25) {
         var14 = class480.method2352(var1, var0);
         if (null != var14) {
            class58.method613();
            method519(var1, var0, class392.method1898(method481(var14)), var4);
            field741 = 0;
            field759 = method511(var14);
            if (null == field759) {
               field759 = class27.field544;
            }

            if (var14.field3754) {
               field770 = var14.field3678 + class357.method1829(16777215);
            } else {
               field770 = class357.method1829(65280) + var14.field3782 + class357.method1829(16777215);
            }
         }

      } else {
         if (var2 == 17) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var15 = class335.method1773(class46.field1023, field641.field2758);
            var15.field2686.method1183(var0 + class69.field1134);
            var15.field2686.method1145(field724.method171(82) ? 1 : 0);
            var15.field2686.method1177(field710);
            var15.field2686.method1150(field744);
            var15.field2686.method1163(class325.field2628);
            var15.field2686.method1177(var1 + class478.field3659);
            var15.field2686.method1177(var3);
            field641.method1797(var15);
         }

         if (var2 == 20) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var15 = class335.method1773(class46.field965, field641.field2758);
            var15.field2686.method1183(var1 + class478.field3659);
            var15.field2686.method1145(field724.method171(82) ? 1 : 0);
            var15.field2686.method1150(var3);
            var15.field2686.method1183(var0 + class69.field1134);
            field641.method1797(var15);
         }

         if (var2 == 3) {
            field696 = var7;
            field697 = var8;
            field813 = 2;
            field755 = 0;
            field827 = var0;
            field750 = var1;
            var15 = class335.method1773(class46.field1010, field641.field2758);
            var15.field2686.method1155(class69.field1134 + var0);
            var15.field2686.method1183(class478.field3659 + var1);
            var15.field2686.method1114(field724.method171(82) ? 1 : 0);
            var15.field2686.method1150(var3);
            field641.method1797(var15);
         }

         if (var2 == 51) {
            var13 = field749[var3];
            if (var13 != null) {
               field696 = var7;
               field697 = var8;
               field813 = 2;
               field755 = 0;
               field827 = var0;
               field750 = var1;
               var11 = class335.method1773(class46.field1026, field641.field2758);
               var11.field2686.method1114(field724.method171(82) ? 1 : 0);
               var11.field2686.method1177(var3);
               field641.method1797(var11);
            }
         }

         if (var2 == 7) {
            var10 = field636[var3];
            if (null != var10) {
               field696 = var7;
               field697 = var8;
               field813 = 2;
               field755 = 0;
               field827 = var0;
               field750 = var1;
               var11 = class335.method1773(class46.field1000, field641.field2758);
               var11.field2686.method1183(class475.field3649);
               var11.field2686.method1183(class343.field2738);
               var11.field2686.method1134(class328.field2651);
               var11.field2686.method1183(var3);
               var11.field2686.method1145(field724.method171(82) ? 1 : 0);
               field641.method1797(var11);
            }
         }

         if (field741 != 0) {
            field741 = 0;
            method485(class480.method2355(class328.field2651));
         }

         if (field668) {
            class58.method613();
         }

      }
   }

   static void method519(int var0, int var1, int var2, int var3) {
      class480 var5 = class480.method2352(var0, var1);
      if (var5 != null && null != var5.field3768) {
         class208 var6 = new class208();
         var6.field1951 = var5;
         var6.field1954 = var5.field3768;
         class18.method216(var6);
      }

      field710 = var3;
      field668 = true;
      class325.field2628 = var0;
      field744 = var1;
      class477.field3652 = var2;
      method485(var5);
   }

   static void method551(int var0, int var1) {
      class335 var3 = class335.method1773(class46.field987, field641.field2758);
      var3.field2686.method1134(var0);
      var3.field2686.method1183(var1);
      field641.method1797(var3);
   }

   static void method414(int var0, int var1, int var2, int var3, String var4) {
      class480 var6 = class480.method2352(var1, var2);
      if (null != var6) {
         if (var6.field3777 != null) {
            class208 var7 = new class208();
            var7.field1951 = var6;
            var7.field1956 = var0;
            var7.field1960 = var4;
            var7.field1954 = var6.field3777;
            class18.method216(var7);
         }

         boolean var12 = true;
         if (var6.field3700 > 0) {
            var12 = class119.method832(var6);
         }

         if (var12) {
            int var9 = method481(var6);
            int var10 = var0 - 1;
            boolean var8 = (var9 >> var10 + 1 & 1) != 0;
            if (var8) {
               class335 var11;
               if (var0 == 1) {
                  var11 = class335.method1773(class46.field957, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 2) {
                  var11 = class335.method1773(class46.field947, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 3) {
                  var11 = class335.method1773(class46.field999, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 4) {
                  var11 = class335.method1773(class46.field964, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 5) {
                  var11 = class335.method1773(class46.field980, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 6) {
                  var11 = class335.method1773(class46.field936, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 7) {
                  var11 = class335.method1773(class46.field978, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 8) {
                  var11 = class335.method1773(class46.field932, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 9) {
                  var11 = class335.method1773(class46.field1007, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

               if (var0 == 10) {
                  var11 = class335.method1773(class46.field963, field641.field2758);
                  var11.field2686.method1180(var1);
                  var11.field2686.method1155(var2);
                  var11.field2686.method1155(var3);
                  field641.method1797(var11);
               }

            }
         }
      }
   }

   public static final void method534(String var0, String var1, int var2, int var3, int var4, int var5) {
      method439(var0, var1, var2, var3, var4, var5, -1, false);
   }

   static final void method439(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!field689) {
         if (field725 < 500) {
            field731[field725] = var0;
            field850[field725] = var1;
            field769[field725] = var2;
            field729[field725] = var3;
            field726[field725] = var4;
            field727[field725] = var5;
            field730[field725] = var6;
            field733[field725] = var7;
            ++field725;
         }

      }
   }

   static String method471(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return field850[var0].length() > 0 ? field731[var0] + class27.field282 + field850[var0] : field731[var0];
      }
   }

   static final void method455(int var0, int var1, int var2, int var3) {
      if (field741 == 0 && !field668) {
         method534(class27.field403, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;
      int var9 = 0;

      while(true) {
         int var11 = class256.field2259;
         if (var9 >= var11) {
            if (var5 != -1L) {
               var9 = (int)(var5 >>> 0 & 127L);
               var11 = (int)(var5 >>> 7 & 127L);
               class522 var13 = field749[field715];
               method490(var13, field715, var9, var11);
            }

            return;
         }

         long var12 = class256.method1472(var9);
         if (var7 != var12) {
            label306: {
               var7 = var12;
               int var14 = class256.method1466(var9);
               int var15 = class256.method1465(var9);
               int var16 = class256.method1470(class256.field2261[var9]);
               int var18 = class256.method1471(class256.field2261[var9]);
               int var19 = var18;
               int var23;
               int var24;
               if (var16 == 2 && class75.field1223.method1044(class192.field1881, var14, var15, var12) >= 0) {
                  class449 var20 = class444.method2172(var18, (byte)-22);
                  if (var20.field3476 != null) {
                     var20 = var20.method2215();
                  }

                  if (var20 == null) {
                     break label306;
                  }

                  class51 var21 = null;

                  for(class51 var22 = (class51)field717.method1236(); null != var22; var22 = (class51)field717.method1238()) {
                     if (class192.field1881 == var22.field1071 && var22.field1064 == var14 && var22.field1070 == var15 && var22.field1063 == var19) {
                        var21 = var22;
                        break;
                     }
                  }

                  if (field741 == 1) {
                     method534(class27.field398, field742 + " " + class357.field2805 + " " + class357.method1829(65535) + var20.field3445, 1, var19, var14, var15);
                  } else if (field668) {
                     if ((class477.field3652 & 4) == 4) {
                        method534(field759, field770 + " " + class357.field2805 + " " + class357.method1829(65535) + var20.field3445, 2, var19, var14, var15);
                     }
                  } else {
                     String[] var30 = var20.field3454;
                     if (null != var30) {
                        for(var23 = 4; var23 >= 0; --var23) {
                           if ((var21 == null || var21.method601(var23)) && null != var30[var23]) {
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

                              method534(var30[var23], class357.method1829(65535) + var20.field3445, var24, var19, var14, var15);
                           }
                        }
                     }

                     method534(class27.field399, class357.method1829(65535) + var20.field3445, 1002, var20.field3442, var14, var15);
                  }
               }

               int var29;
               class433 var31;
               int[] var32;
               class522 var36;
               if (var16 == 1) {
                  class433 var26 = field636[var19];
                  if (var26 == null) {
                     break label306;
                  }

                  if (var26.field3279.field3515 == 1 && (var26.field4028 & 127) == 64 && (var26.field3999 & 127) == 64) {
                     for(var29 = 0; var29 < field637; ++var29) {
                        var31 = field636[field575[var29]];
                        if (null != var31 && var26 != var31 && var31.field3279.field3515 == 1 && var26.field4028 == var31.field4028 && var31.field3999 == var26.field3999) {
                           method503(var31, field575[var29], var14, var15);
                        }
                     }

                     var29 = class190.field1866;
                     var32 = class190.field1867;

                     for(var23 = 0; var23 < var29; ++var23) {
                        var36 = field749[var32[var23]];
                        if (var36 != null && var26.field4028 == var36.field4028 && var36.field3999 == var26.field3999) {
                           method490(var36, var32[var23], var14, var15);
                        }
                     }
                  }

                  method503(var26, var19, var14, var15);
               }

               if (var16 == 0) {
                  class522 var27 = field749[var19];
                  if (var27 == null) {
                     break label306;
                  }

                  if ((var27.field4028 & 127) == 64 && (var27.field3999 & 127) == 64) {
                     for(var29 = 0; var29 < field637; ++var29) {
                        var31 = field636[field575[var29]];
                        if (null != var31 && var31.field3279.field3515 == 1 && var31.field4028 == var27.field4028 && var31.field3999 == var27.field3999) {
                           method503(var31, field575[var29], var14, var15);
                        }
                     }

                     var29 = class190.field1866;
                     var32 = class190.field1867;

                     for(var23 = 0; var23 < var29; ++var23) {
                        var36 = field749[var32[var23]];
                        if (var36 != null && var27 != var36 && var27.field4028 == var36.field4028 && var36.field3999 == var27.field3999) {
                           method490(var36, var32[var23], var14, var15);
                        }
                     }
                  }

                  if (field715 != var19) {
                     method490(var27, var19, var14, var15);
                  } else {
                     var5 = var12;
                  }
               }

               if (var16 == 3) {
                  class201 var28 = field716[class192.field1881][var14][var15];
                  if (null != var28) {
                     for(class443 var33 = (class443)var28.method1237(); null != var33; var33 = (class443)var28.method1242()) {
                        class71 var34 = class71.method682(var33.field3359);
                        if (field741 == 1) {
                           method534(class27.field398, field742 + " " + class357.field2805 + " " + class357.method1829(16748608) + var34.field1160, 16, var33.field3359, var14, var15);
                        } else if (field668) {
                           if ((class477.field3652 & 1) == 1) {
                              method534(field759, field770 + " " + class357.field2805 + " " + class357.method1829(16748608) + var34.field1160, 17, var33.field3359, var14, var15);
                           }
                        } else {
                           String[] var35 = var34.field1161;

                           for(var24 = 4; var24 >= 0; --var24) {
                              if (var33.method2163(var24)) {
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

                                    method534(var35[var24], class357.method1829(16748608) + var34.field1160, var25, var33.field3359, var14, var15);
                                 } else if (var24 == 2) {
                                    method534(class27.field397, class357.method1829(16748608) + var34.field1160, 20, var33.field3359, var14, var15);
                                 }
                              }
                           }

                           method534(class27.field399, class357.method1829(16748608) + var34.field1160, 1004, var33.field3359, var14, var15);
                        }
                     }
                  }
               }
            }
         }

         ++var9;
      }
   }

   static final void method503(class433 var0, int var1, int var2, int var3) {
      class453 var5 = var0.field3279;
      if (field725 < 400) {
         if (null != var5.field3542) {
            var5 = var5.method2232();
         }

         if (var5 != null) {
            if (var5.field3548) {
               if (!var5.field3550 || var1 == field611) {
                  String var6 = var0.method2115();
                  int var7;
                  if (var5.field3538 != 0 && var0.field4074 != 0) {
                     var7 = var0.field4074 != -1 ? var0.field4074 : var5.field3538;
                     var6 = var6 + class248.method1455(var7, class259.field2281.field4101) + " " + class357.field2800 + class27.field244 + var7 + class357.field2802;
                  }

                  if (var5.field3550 && field734) {
                     method534(class27.field399, class357.method1829(16776960) + var6, 1003, var1, var2, var3);
                  }

                  if (field741 == 1) {
                     method534(class27.field398, field742 + " " + class357.field2805 + " " + class357.method1829(16776960) + var6, 7, var1, var2, var3);
                  } else if (field668) {
                     if ((class477.field3652 & 2) == 2) {
                        method534(field759, field770 + " " + class357.field2805 + " " + class357.method1829(16776960) + var6, 8, var1, var2, var3);
                     }
                  } else {
                     var7 = var5.field3550 && field734 ? 2000 : 0;
                     String[] var8 = var5.field3512;
                     int var9;
                     int var10;
                     if (var8 != null) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method2114(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class27.field400)) {
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

                              method534(var8[var9], class357.method1829(16776960) + var6, var10, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var8) {
                        for(var9 = 4; var9 >= 0; --var9) {
                           if (var0.method2114(var9) && null != var8[var9] && var8[var9].equalsIgnoreCase(class27.field400)) {
                              short var11 = 0;
                              if (class300.field2505 != field606) {
                                 if (class300.field2504 == field606 || field606 == class300.field2509 && var5.field3538 > class259.field2281.field4101) {
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

                                 method534(var8[var9], class357.method1829(16776960) + var6, var10, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var5.field3550 || !field734) {
                        method534(class27.field399, class357.method1829(16776960) + var6, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   static final void method490(class522 var0, int var1, int var2, int var3) {
      if (class259.field2281 != var0) {
         if (field725 < 400) {
            String var5;
            if (var0.field4109 == 0) {
               var5 = var0.field4099[0] + var0.field4112 + var0.field4099[1] + class248.method1455(var0.field4101, class259.field2281.field4101) + " " + class357.field2800 + class27.field244 + var0.field4101 + class357.field2802 + var0.field4099[2];
            } else {
               var5 = var0.field4099[0] + var0.field4112 + var0.field4099[1] + " " + class357.field2800 + class27.field408 + var0.field4109 + class357.field2802 + var0.field4099[2];
            }

            int var6;
            if (field741 == 1) {
               method534(class27.field398, field742 + " " + class357.field2805 + " " + class357.method1829(16777215) + var5, 14, var1, var2, var3);
            } else if (field668) {
               if ((class477.field3652 & 8) == 8) {
                  method534(field759, field770 + " " + class357.field2805 + " " + class357.method1829(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var6 = 7; var6 >= 0; --var6) {
                  if (null != field599[var6]) {
                     short var7 = 0;
                     if (field599[var6].equalsIgnoreCase(class27.field400)) {
                        if (class300.field2505 == field605) {
                           continue;
                        }

                        if (class300.field2504 == field605 || field605 == class300.field2509 && var0.field4101 > class259.field2281.field4101) {
                           var7 = 2000;
                        }

                        if (class259.field2281.field4122 != 0 && var0.field4122 != 0) {
                           if (class259.field2281.field4122 == var0.field4122) {
                              var7 = 2000;
                           } else {
                              var7 = 0;
                           }
                        } else if (field605 == class300.field2506 && var0.method2486()) {
                           var7 = 2000;
                        }
                     } else if (field713[var6]) {
                        var7 = 2000;
                     }

                     boolean var8 = false;
                     int var9 = var7 + field711[var6];
                     method534(field599[var6], class357.method1829(16777215) + var5, var9, var1, var2, var3);
                  }
               }
            }

            for(var6 = 0; var6 < field725; ++var6) {
               if (field769[var6] == 23) {
                  field850[var6] = class357.method1829(16777215) + var5;
                  break;
               }
            }

         }
      }
   }

   static final void method411(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class480.method2359(var0)) {
         class514.field3987 = null;
         method454(class335.field2687[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != class514.field3987) {
            method454(class514.field3987, -1412584499, var1, var2, var3, var4, class95.field1314, class388.field3074, var7);
            class514.field3987 = null;
         }

      } else {
         if (var7 != -1) {
            field586[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               field586[var9] = true;
            }
         }

      }
   }

   static final void method454(class480[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class156.method961(var2, var3, var4, var5);
      class399.method1944();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class480 var11 = var0[var10];
         if (null != var11 && (var11.field3691 == var1 || var1 == -1412584499 && field760 == var11)) {
            int var12;
            if (var8 == -1) {
               field801[field747] = var11.field3675 + var6;
               field802[field747] = var7 + var11.field3688;
               field803[field747] = var11.field3689;
               field804[field747] = var11.field3666;
               var12 = ++field747 - 1;
            } else {
               var12 = var8;
            }

            var11.field3813 = var12;
            var11.field3814 = field879;
            if (!var11.field3754 || !method458(var11)) {
               if (var11.field3700 > 0) {
                  method478(var11);
               }

               int var13 = var11.field3675 + var6;
               int var14 = var11.field3688 + var7;
               int var15 = var11.field3695;
               int var16;
               int var17;
               if (var11 == field760) {
                  if (var1 != -1412584499 && !var11.field3755) {
                     class514.field3987 = var0;
                     class95.field1314 = var6;
                     class388.field3074 = var7;
                     continue;
                  }

                  if (field771 && field765) {
                     var16 = class441.field3349;
                     var17 = class441.field3332;
                     var16 -= field762;
                     var17 -= field835;
                     if (var16 < field766) {
                        var16 = field766;
                     }

                     if (var16 + var11.field3689 > field766 + field779.field3689) {
                        var16 = field779.field3689 + field766 - var11.field3689;
                     }

                     if (var17 < field767) {
                        var17 = field767;
                     }

                     if (var17 + var11.field3666 > field767 + field779.field3666) {
                        var17 = field767 + field779.field3666 - var11.field3666;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field3755) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (var11.field3676 == 9) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var11.field3689 + var13;
                  var23 = var14 + var11.field3666;
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
                  var20 = var13 + var11.field3689;
                  var21 = var14 + var11.field3666;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field3754 || var16 < var18 && var17 < var19) {
                  if (var11.field3700 != 0) {
                     if (var11.field3700 == 1336) {
                        if (class4.field36.method2415()) {
                           var14 += 15;
                           class253.field2234.method1572("Fps:" + class210.field1974, var13 + var11.field3689, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var45 = Runtime.getRuntime();
                           var21 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !field580) {
                              var22 = 16711680;
                           }

                           class253.field2234.method1572("Mem:" + var21 + "k", var11.field3689 + var13, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.field3700 == 1337) {
                        field737 = var13;
                        field738 = var14;
                        method460(var13, var14, var11.field3689, var11.field3666);
                        field586[var11.field3813] = true;
                        class156.method961(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field3700 == 1338) {
                        method404(var11, var13, var14, var12);
                        class156.method961(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field3700 == 1339) {
                        method398(var11, var13, var14, var12);
                        class156.method961(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field3700 == 1400) {
                        class477.field3650.method73(var13, var14, var11.field3689, var11.field3666, field879);
                     }

                     if (var11.field3700 == 1401) {
                        class477.field3650.method63(var13, var14, var11.field3689, var11.field3666);
                     }

                     if (var11.field3700 == 1402) {
                        class158.field1682.method2577(var13, field879);
                     }
                  }

                  if (var11.field3676 == 0) {
                     if (!var11.field3754 && method458(var11) && class315.field2564 != var11) {
                        continue;
                     }

                     if (!var11.field3754) {
                        if (var11.field3707 > var11.field3696 - var11.field3666) {
                           var11.field3707 = var11.field3696 - var11.field3666;
                        }

                        if (var11.field3707 < 0) {
                           var11.field3707 = 0;
                        }
                     }

                     method454(var0, var11.field3674, var16, var17, var18, var19, var13 - var11.field3693, var14 - var11.field3707, var12);
                     if (null != var11.field3806) {
                        method454(var11.field3806, var11.field3674, var16, var17, var18, var19, var13 - var11.field3693, var14 - var11.field3707, var12);
                     }

                     class49 var29 = (class49)field597.method709((long)var11.field3674);
                     if (null != var29) {
                        method411(var29.field1047, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class156.method961(var2, var3, var4, var5);
                     class399.method1944();
                  } else if (var11.field3676 == 11) {
                     if (method458(var11) && var11 != class315.field2564) {
                        continue;
                     }

                     if (var11.field3806 != null) {
                        method454(var11.field3806, var11.field3674, var16, var17, var18, var19, var13 - var11.field3693, var14 - var11.field3707, var12);
                     }

                     class156.method961(var2, var3, var4, var5);
                     class399.method1944();
                  }

                  if (field807 || field800[var12] || field805 > 1) {
                     if (var11.field3676 == 0 && !var11.field3754 && var11.field3696 > var11.field3666) {
                        method470(var13 + var11.field3689, var14, var11.field3707, var11.field3666, var11.field3696);
                     }

                     if (var11.field3676 != 1) {
                        if (var11.field3676 == 3) {
                           if (method408(var11)) {
                              var20 = var11.field3698;
                              if (var11 == class315.field2564 && var11.field3744 != 0) {
                                 var20 = var11.field3744;
                              }
                           } else {
                              var20 = var11.field3697;
                              if (class315.field2564 == var11 && var11.field3701 != 0) {
                                 var20 = var11.field3701;
                              }
                           }

                           if (var11.field3736) {
                              switch (var11.field3702.field168) {
                                 case 1:
                                    class156.method955(var13, var14, var11.field3689, var11.field3666, var11.field3697, var11.field3698);
                                    break;
                                 case 2:
                                    class156.method968(var13, var14, var11.field3689, var11.field3666, var11.field3697, var11.field3698, 255 - (var11.field3695 & 255), 255 - (var11.field3704 & 255));
                                    break;
                                 default:
                                    if (var15 == 0) {
                                       class156.method954(var13, var14, var11.field3689, var11.field3666, var20);
                                    } else {
                                       class156.method953(var13, var14, var11.field3689, var11.field3666, var20, 256 - (var15 & 255));
                                    }
                              }
                           } else if (var15 == 0) {
                              class156.method957(var13, var14, var11.field3689, var11.field3666, var20);
                           } else {
                              class156.method958(var13, var14, var11.field3689, var11.field3666, var20, 256 - (var15 & 255));
                           }
                        } else if (var11.field3676 == 4) {
                           class460 var37 = var11.method2320();
                           if (var37 == null) {
                              if (class480.field3673) {
                                 method485(var11);
                              }
                           } else {
                              String var44 = var11.field3734;
                              if (method408(var11)) {
                                 var21 = var11.field3698;
                                 if (var11 == class315.field2564 && var11.field3744 != 0) {
                                    var21 = var11.field3744;
                                 }

                                 if (var11.field3662.length() > 0) {
                                    var44 = var11.field3662;
                                 }
                              } else {
                                 var21 = var11.field3697;
                                 if (class315.field2564 == var11 && var11.field3701 != 0) {
                                    var21 = var11.field3701;
                                 }
                              }

                              if (var11.field3754 && var11.field3802 != -1) {
                                 class71 var46 = class71.method682(var11.field3802);
                                 var44 = var46.field1160;
                                 if (null == var44) {
                                    var44 = class27.field544;
                                 }

                                 if ((var46.field1155 == 1 || var11.field3803 != 1) && var11.field3803 != -1) {
                                    var44 = class357.method1829(16748608) + var44 + class357.field2807 + " " + 'x' + method501(var11.field3803);
                                 }
                              }

                              if (field753 == var11) {
                                 var44 = class27.field506;
                                 var21 = var11.field3697;
                              }

                              if (!var11.field3754) {
                                 var44 = method508(var44, var11);
                              }

                              var37.method1574(var44, var13, var14, var11.field3689, var11.field3666, var21, var11.field3664 ? 0 : -1, class393.method1902(var11.field3695), var11.field3737, var11.field3795, var11.field3770);
                           }
                        } else {
                           int var25;
                           int var26;
                           int var41;
                           if (var11.field3676 == 5) {
                              class427 var35;
                              if (!var11.field3754) {
                                 var35 = var11.method2341(method408(var11), class19.field209);
                                 if (null != var35) {
                                    var35.method2032(var13, var14);
                                 } else if (class480.field3673) {
                                    method485(var11);
                                 }
                              } else {
                                 if (var11.field3802 != -1) {
                                    var35 = class71.method680(var11.field3802, var11.field3803, var11.field3712, var11.field3713, var11.field3733, false);
                                 } else {
                                    var35 = var11.method2341(false, class19.field209);
                                 }

                                 if (var35 == null) {
                                    if (class480.field3673) {
                                       method485(var11);
                                    }
                                 } else {
                                    var21 = var35.field3234;
                                    var22 = var35.field3235;
                                    if (!var11.field3711) {
                                       var23 = var11.field3689 * 4096 / var21;
                                       if (var11.field3710 != 0) {
                                          var35.method2026(var11.field3689 / 2 + var13, var11.field3666 / 2 + var14, var11.field3710, var23);
                                       } else if (var15 != 0) {
                                          var35.method2020(var13, var14, var11.field3689, var11.field3666, 256 - (var15 & 255));
                                       } else if (var11.field3689 == var21 && var22 == var11.field3666) {
                                          var35.method2032(var13, var14);
                                       } else {
                                          var35.method2034(var13, var14, var11.field3689, var11.field3666);
                                       }
                                    } else {
                                       class156.method967(var13, var14, var11.field3689 + var13, var14 + var11.field3666);
                                       var23 = (var11.field3689 + (var21 - 1)) / var21;
                                       var41 = (var22 - 1 + var11.field3666) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var41; ++var26) {
                                             if (var11.field3710 != 0) {
                                                var35.method2026(var21 * var25 + var13 + var21 / 2, var14 + var22 * var26 + var22 / 2, var11.field3710, 4096);
                                             } else if (var15 != 0) {
                                                var35.method2030(var21 * var25 + var13, var14 + var22 * var26, 256 - (var15 & 255));
                                             } else {
                                                var35.method2032(var21 * var25 + var13, var14 + var22 * var26);
                                             }
                                          }
                                       }

                                       class156.method961(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              int var27;
                              if (var11.field3676 == 6) {
                                 boolean var33 = method408(var11);
                                 if (var33) {
                                    var21 = var11.field3794;
                                 } else {
                                    var21 = var11.field3720;
                                 }

                                 class104 var36 = null;
                                 var23 = 0;
                                 if (var11.field3802 != -1) {
                                    class71 var38 = class71.method682(var11.field3802);
                                    if (null != var38) {
                                       var38 = var38.method668(var11.field3803);
                                       var36 = var38.method667(1);
                                       if (null != var36) {
                                          var36.method758();
                                          var23 = var36.field3926 / 2;
                                       } else {
                                          method485(var11);
                                       }
                                    }
                                 } else if (var11.field3716 == 5) {
                                    if (var11.field3717 == 0) {
                                       var36 = field862.method1396((class157)null, -1, (class157)null, -1);
                                    } else {
                                       var36 = class259.field2281.method2401();
                                    }
                                 } else if (var11.field3716 == 7) {
                                    var36 = var11.field3730.method1396((class157)null, -1, class157.method984(class259.field2281.field4004), class259.field2281.field3998);
                                 } else {
                                    class453 var39 = null;
                                    class90 var40 = null;
                                    if (var11.field3716 == 6) {
                                       var26 = var11.field3717;
                                       if (var26 >= 0 && var26 < field636.length) {
                                          class433 var43 = field636[var26];
                                          if (null != var43) {
                                             var39 = var43.field3279;
                                             var40 = var43.method2124();
                                          }
                                       }
                                    }

                                    class157 var42 = null;
                                    var27 = -1;
                                    if (var21 != -1) {
                                       var42 = class157.method984(var21);
                                       var27 = var11.field3804;
                                    }

                                    var36 = var11.method2321(var42, var27, var33, class259.field2281.field4096, var39, var40);
                                    if (var36 == null && class480.field3673) {
                                       method485(var11);
                                    }
                                 }

                                 class399.method1955(var11.field3689 / 2 + var13, var11.field3666 / 2 + var14);
                                 var41 = var11.field3727 * class399.field3109[var11.field3724] >> 16;
                                 var25 = class399.field3107[var11.field3724] * var11.field3727 >> 16;
                                 if (null != var36) {
                                    if (!var11.field3754) {
                                       var36.method764(0, var11.field3742, 0, var11.field3724, 0, var41, var25);
                                    } else {
                                       var36.method758();
                                       if (var11.field3747) {
                                          var36.method772(0, var11.field3742, var11.field3789, var11.field3724, var11.field3722, var11.field3796 + var41 + var23, var11.field3796 + var25, var11.field3727);
                                       } else {
                                          var36.method764(0, var11.field3742, var11.field3789, var11.field3724, var11.field3722, var11.field3796 + var41 + var23, var25 + var11.field3796);
                                       }
                                    }
                                 }

                                 class399.method1946();
                              } else {
                                 class460 var31;
                                 if (var11.field3676 == 8 && class254.field2235 == var11 && field740 == field739) {
                                    var20 = 0;
                                    var21 = 0;
                                    var31 = class253.field2234;
                                    String var34 = var11.field3734;

                                    String var24;
                                    for(var34 = method508(var34, var11); var34.length() > 0; var21 += var31.field2423 + 1) {
                                       var25 = var34.indexOf(class357.field2806);
                                       if (var25 != -1) {
                                          var24 = var34.substring(0, var25);
                                          var34 = var34.substring(var25 + 4);
                                       } else {
                                          var24 = var34;
                                          var34 = "";
                                       }

                                       var26 = var31.method1566(var24);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.field3689 - 5 - var20;
                                    var26 = var14 + var11.field3666 + 5;
                                    if (var25 < var13 + 5) {
                                       var25 = var13 + 5;
                                    }

                                    if (var20 + var25 > var4) {
                                       var25 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class156.method954(var25, var26, var20, var21, 16777120);
                                    class156.method957(var25, var26, var20, var21, 0);
                                    var34 = var11.field3734;
                                    var27 = var26 + var31.field2423 + 2;

                                    for(var34 = method508(var34, var11); var34.length() > 0; var27 += var31.field2423 + 1) {
                                       int var28 = var34.indexOf(class357.field2806);
                                       if (var28 != -1) {
                                          var24 = var34.substring(0, var28);
                                          var34 = var34.substring(var28 + 4);
                                       } else {
                                          var24 = var34;
                                          var34 = "";
                                       }

                                       var31.method1594(var24, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (var11.field3676 == 9) {
                                    if (var11.field3706) {
                                       var20 = var13;
                                       var21 = var11.field3666 + var14;
                                       var22 = var11.field3689 + var13;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var13 + var11.field3689;
                                       var23 = var11.field3666 + var14;
                                    }

                                    if (var11.field3705 == 1) {
                                       class156.method956(var20, var21, var22, var23, var11.field3697);
                                    } else {
                                       method532(var20, var21, var22, var23, var11.field3697, var11.field3705);
                                    }
                                 } else if (var11.field3676 == 12) {
                                    class28 var30 = var11.method2350();
                                    class200 var32 = var11.method2336();
                                    if (null != var30 && null != var32 && var30.method312()) {
                                       var31 = var11.method2320();
                                       if (var31 != null) {
                                          field790.method2566(var13, var14, var11.field3689, var11.field3666, var30.method313(), var30.method338(), var30.method310(), var30.method311(), var30.method331());
                                          var23 = var11.field3664 ? var11.field3713 : -1;
                                          if (!var30.method308() && var30.method332().method112()) {
                                             field790.method2567(var32.field1933, var23, var32.field1931, var32.field1932);
                                             field790.method2568(var30.method306(), var31, (byte)-101);
                                          } else {
                                             field790.method2567(var11.field3697, var23, var32.field1931, var32.field1932);
                                             field790.method2568(var30.method332(), var31, (byte)-117);
                                          }

                                          class156.method961(var2, var3, var4, var5);
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

   static final void method532(int var0, int var1, int var2, int var3, int var4, int var5) {
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
         var0 -= class156.field1653;
         var1 -= class156.field1654;
         int var18 = var0 + var14;
         int var19 = var0 - var15;
         int var20 = var7 + var0 - var15;
         int var21 = var14 + var0 + var7;
         int var22 = var1 + var16;
         int var23 = var1 - var17;
         int var24 = var1 + var8 - var17;
         int var25 = var16 + var8 + var1;
         class399.method1947(var18, var19, var20);
         class399.method1957(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
         class399.method1947(var18, var20, var21);
         class399.method1957(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
      }
   }

   static String method508(String var0, class480 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               var0 = var0.substring(0, var4) + class263.method1507(method444(var1, var3 - 1)) + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }

   static final String method501(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class357.field2804 + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class357.method1829(65408) + var2.substring(0, var2.length() - 8) + class27.field303 + " " + class357.field2800 + var2 + class357.field2802 + class357.field2807;
      } else {
         return var2.length() > 6 ? " " + class357.method1829(16777215) + var2.substring(0, var2.length() - 4) + class27.field411 + " " + class357.field2800 + var2 + class357.field2802 + class357.field2807 : " " + class357.method1829(16776960) + var2 + class357.field2807;
      }
   }

   static void method424(class480[] var0, class480 var1, boolean var2) {
      int var4 = var1.field3761 != 0 ? var1.field3761 : var1.field3689;
      int var5 = var1.field3696 != 0 ? var1.field3696 : var1.field3666;
      method405(var0, var1.field3674, var4, var5, var2);
      if (null != var1.field3806) {
         method405(var1.field3806, var1.field3674, var4, var5, var2);
      }

      class49 var6 = (class49)field597.method709((long)var1.field3674);
      if (var6 != null) {
         int var7 = var6.field1047;
         if (class480.method2359(var7)) {
            method405(class335.field2687[var7], -1, var4, var5, var2);
         }
      }

      if (var1.field3700 == 1337) {
      }

   }

   static void method405(class480[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class480 var7 = var0[var6];
         if (null != var7 && var7.field3691 == var1) {
            method530(var7, var2, var3, var4);
            method495(var7, var2, var3);
            if (var7.field3693 > var7.field3761 - var7.field3689) {
               var7.field3693 = var7.field3761 - var7.field3689;
            }

            if (var7.field3693 < 0) {
               var7.field3693 = 0;
            }

            if (var7.field3707 > var7.field3696 - var7.field3666) {
               var7.field3707 = var7.field3696 - var7.field3666;
            }

            if (var7.field3707 < 0) {
               var7.field3707 = 0;
            }

            if (var7.field3676 == 0) {
               method424(var0, var7, var4);
            }
         }
      }

   }

   static void method530(class480 var0, int var1, int var2, boolean var3) {
      int var5 = var0.field3689;
      int var6 = var0.field3666;
      if (var0.field3681 == 0) {
         var0.field3689 = var0.field3685;
      } else if (var0.field3681 == 1) {
         var0.field3689 = var1 - var0.field3685;
      } else if (var0.field3681 == 2) {
         var0.field3689 = var1 * var0.field3685 >> 14;
      }

      if (var0.field3682 == 0) {
         var0.field3666 = var0.field3686;
      } else if (var0.field3682 == 1) {
         var0.field3666 = var2 - var0.field3686;
      } else if (var0.field3682 == 2) {
         var0.field3666 = var2 * var0.field3686 >> 14;
      }

      if (var0.field3681 == 4) {
         var0.field3689 = var0.field3790 * var0.field3666 / var0.field3690;
      }

      if (var0.field3682 == 4) {
         var0.field3666 = var0.field3689 * var0.field3690 / var0.field3790;
      }

      if (var0.field3700 == 1337) {
         field869 = var0;
      }

      if (var0.field3676 == 12) {
         var0.method2350().method274(var0.field3689, var0.field3666);
      }

      if (var3 && var0.field3668 != null && (var5 != var0.field3689 || var6 != var0.field3666)) {
         class208 var7 = new class208();
         var7.field1951 = var0;
         var7.field1954 = var0.field3668;
         field791.method1240(var7);
      }

   }

   static void method495(class480 var0, int var1, int var2) {
      if (var0.field3679 == 0) {
         var0.field3675 = var0.field3683;
      } else if (var0.field3679 == 1) {
         var0.field3675 = (var1 - var0.field3689) / 2 + var0.field3683;
      } else if (var0.field3679 == 2) {
         var0.field3675 = var1 - var0.field3689 - var0.field3683;
      } else if (var0.field3679 == 3) {
         var0.field3675 = var0.field3683 * var1 >> 14;
      } else if (var0.field3679 == 4) {
         var0.field3675 = (var1 * var0.field3683 >> 14) + (var1 - var0.field3689) / 2;
      } else {
         var0.field3675 = var1 - var0.field3689 - (var1 * var0.field3683 >> 14);
      }

      if (var0.field3680 == 0) {
         var0.field3688 = var0.field3684;
      } else if (var0.field3680 == 1) {
         var0.field3688 = var0.field3684 + (var2 - var0.field3666) / 2;
      } else if (var0.field3680 == 2) {
         var0.field3688 = var2 - var0.field3666 - var0.field3684;
      } else if (var0.field3680 == 3) {
         var0.field3688 = var0.field3684 * var2 >> 14;
      } else if (var0.field3680 == 4) {
         var0.field3688 = (var0.field3684 * var2 >> 14) + (var2 - var0.field3666) / 2;
      } else {
         var0.field3688 = var2 - var0.field3666 - (var2 * var0.field3684 >> 14);
      }

   }

   static final void method539(class480 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (field661) {
         field780 = 32;
      } else {
         field780 = 0;
      }

      field661 = false;
      int var8;
      if (class441.field3339 == 1 || !class136.field1574 && class441.field3339 == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field3707 -= 4;
            method485(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var2 + var3) {
            var0.field3707 += 4;
            method485(var0);
         } else if (var5 >= var1 - field780 && var5 < field780 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
            var8 = var3 * (var3 - 32) / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field3707 = var9 * (var4 - var3) / var10;
            method485(var0);
            field661 = true;
         }
      }

      if (field789 != 0) {
         var8 = var0.field3689;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field3707 += field789 * 45;
            method485(var0);
         }
      }

   }

   static final void method470(int var0, int var1, int var2, int var3, int var4) {
      class126.field1525[0].method2000(var0, var1);
      class126.field1525[1].method2000(var0, var1 + var3 - 16);
      class156.method954(var0, var1 + 16, 16, var3 - 32, field657);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
      class156.method954(var0, var1 + 16 + var7, 16, var6, field768);
      class156.method960(var0, var7 + var1 + 16, var6, field847);
      class156.method960(var0 + 1, var1 + 16 + var7, var6, field847);
      class156.method965(var0, var1 + 16 + var7, 16, field847);
      class156.method965(var0, var1 + 17 + var7, 16, field847);
      class156.method960(var0 + 15, var1 + 16 + var7, var6, field659);
      class156.method960(var0 + 14, var7 + var1 + 17, var6 - 1, field659);
      class156.method965(var0, var6 + var1 + 15 + var7, 16, field659);
      class156.method965(var0 + 1, var7 + var1 + 14 + var6, 15, field659);
   }

   static final boolean method408(class480 var0) {
      if (null == var0.field3809) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field3809.length; ++var2) {
            int var3 = method444(var0, var2);
            int var4 = var0.field3797[var2];
            if (var0.field3809[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.field3809[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var0.field3809[var2] == 4) {
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

   static final int method444(class480 var0, int var1) {
      if (var0.field3738 != null && var1 < var0.field3738.length) {
         try {
            int[] var3 = var0.field3738[var1];
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
                  var8 = field720[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = field868[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = field871[var3[var5++]];
               }

               int var10;
               class480 var11;
               int var12;
               int var13;
               if (var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class480.method2355(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class71.method682(var12).field1148 || field603)) {
                     for(var13 = 0; var13 < var11.field3800.length; ++var13) {
                        if (var11.field3800[var13] == var12 + 1) {
                           var8 += var11.field3801[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = class10.field107[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class170.field1726[field868[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class10.field107[var3[var5++]] * 100 / '\ub71b';
               }

               if (var7 == 8) {
                  var8 = class259.field2281.field4101;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class170.field1724[var10]) {
                        var8 += field868[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = class480.method2355(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class71.method682(var12).field1148 || field603)) {
                     for(var13 = 0; var13 < var11.field3800.length; ++var13) {
                        if (var11.field3800[var13] == var12 + 1) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = field693;
               }

               if (var7 == 12) {
                  var8 = field863;
               }

               if (var7 == 13) {
                  var10 = class10.field107[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class10.method123(var10);
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
                  var8 = class69.field1134 + (class259.field2281.field4028 >> 7);
               }

               if (var7 == 19) {
                  var8 = class478.field3659 + (class259.field2281.field3999 >> 7);
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

   static final void method462(class480 var0) {
      String var2;
      int var3;
      int var4;
      if (var0.field3677 == 1) {
         var2 = var0.field3725;
         var3 = var0.field3674;
         var4 = var0.field3802;
         method439(var2, "", 24, 0, 0, var3, var4, false);
      }

      int var5;
      String var12;
      if (var0.field3677 == 2 && !field668) {
         var2 = method511(var0);
         if (var2 != null) {
            var12 = class357.method1829(65280) + var0.field3782;
            var4 = var0.field3674;
            var5 = var0.field3802;
            method439(var2, var12, 25, 0, -1, var4, var5, false);
         }
      }

      if (var0.field3677 == 3) {
         method534(class27.field479, "", 26, 0, 0, var0.field3674);
      }

      if (var0.field3677 == 4) {
         method534(var0.field3725, "", 28, 0, 0, var0.field3674);
      }

      if (var0.field3677 == 5) {
         method534(var0.field3725, "", 29, 0, 0, var0.field3674);
      }

      if (var0.field3677 == 6 && field753 == null) {
         method534(var0.field3725, "", 30, 0, -1, var0.field3674);
      }

      if (var0.field3754) {
         int var6;
         int var7;
         int var8;
         String var13;
         String var15;
         if (field668) {
            var3 = method481(var0);
            boolean var10 = (var3 >> 21 & 1) != 0;
            if (var10 && (class477.field3652 & 32) == 32) {
               var13 = field759;
               var15 = field770 + " " + class357.field2805 + " " + var0.field3678;
               var6 = var0.field3793;
               var7 = var0.field3674;
               var8 = var0.field3802;
               method439(var13, var15, 58, 0, var6, var7, var8, false);
            }
         } else {
            for(int var11 = 9; var11 >= 5; --var11) {
               var5 = method481(var0);
               boolean var14 = (var5 >> var11 + 1 & 1) != 0;
               if (!var14 && null == var0.field3777) {
                  var12 = null;
               } else if (null != var0.field3752 && var0.field3752.length > var11 && null != var0.field3752[var11] && var0.field3752[var11].trim().length() != 0) {
                  var12 = var0.field3752[var11];
               } else {
                  var12 = null;
               }

               if (null != var12) {
                  var15 = var0.field3678;
                  var6 = var11 + 1;
                  var7 = var0.field3793;
                  var8 = var0.field3674;
                  int var9 = var0.field3802;
                  method439(var12, var15, 1007, var6, var7, var8, var9, false);
               }
            }

            var2 = method511(var0);
            if (var2 != null) {
               var12 = var0.field3678;
               var4 = var0.field3793;
               var5 = var0.field3674;
               var6 = var0.field3802;
               method439(var2, var12, 25, 0, var4, var5, var6, false);
            }

            for(var3 = 4; var3 >= 0; --var3) {
               var6 = method481(var0);
               boolean var17 = (var6 >> var3 + 1 & 1) != 0;
               if (!var17 && var0.field3777 == null) {
                  var13 = null;
               } else if (null != var0.field3752 && var0.field3752.length > var3 && null != var0.field3752[var3] && var0.field3752[var3].trim().length() != 0) {
                  var13 = var0.field3752[var3];
               } else {
                  var13 = null;
               }

               if (var13 != null) {
                  method439(var13, var0.field3678, 57, var3 + 1, var0.field3793, var0.field3674, var0.field3802, var0.field3818);
               }
            }

            var4 = method481(var0);
            boolean var16 = (var4 & 1) != 0;
            if (var16) {
               method534(class27.field240, "", 30, 0, var0.field3793, var0.field3674);
            }
         }
      }

   }

   static void method399(boolean var0) {
      field709 = var0;
   }

   static boolean method413() {
      return field709;
   }

   static final void method425(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class480.method2359(var0)) {
         class355.method1826(class335.field2687[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }

   static boolean method538(int var0) {
      for(int var2 = 0; var2 < field816; ++var2) {
         if (field818[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   static final void method535(int var0, int var1) {
      if (class480.method2359(var0)) {
         method492(class335.field2687[var0], var1);
      }
   }

   static final void method492(class480[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class480 var4 = var0[var3];
         if (var4 != null) {
            if (var4.field3676 == 0) {
               if (var4.field3806 != null) {
                  method492(var4.field3806, var1);
               }

               class49 var5 = (class49)field597.method709((long)var4.field3674);
               if (var5 != null) {
                  method535(var5.field1047, var1);
               }
            }

            class208 var6;
            if (var1 == 0 && null != var4.field3721) {
               var6 = new class208();
               var6.field1951 = var4;
               var6.field1954 = var4.field3721;
               class18.method216(var6);
            }

            if (var1 == 1 && var4.field3753 != null) {
               if (var4.field3793 >= 0) {
                  class480 var7 = class480.method2355(var4.field3674);
                  if (var7 == null || var7.field3806 == null || var4.field3793 >= var7.field3806.length || var7.field3806[var4.field3793] != var4) {
                     continue;
                  }
               }

               var6 = new class208();
               var6.field1951 = var4;
               var6.field1954 = var4.field3753;
               class18.method216(var6);
            }
         }
      }

   }

   static final void method488(class480 var0, int var1, int var2) {
      if (null == field760 && !field689) {
         if (null != var0 && method493(var0) != null) {
            field760 = var0;
            field779 = method493(var0);
            field762 = var1;
            field835 = var2;
            class531.field4173 = 0;
            field771 = false;
            int var4 = field725 - 1;
            if (var4 != -1) {
               class355.field2793 = new class468();
               class355.field2793.field3608 = field726[var4];
               class355.field2793.field3611 = field727[var4];
               class355.field2793.field3609 = field769[var4];
               class355.field2793.field3610 = field729[var4];
               class355.field2793.field3607 = field730[var4];
               class355.field2793.field3612 = field731[var4];
               class355.field2793.field3613 = field850[var4];
            }

         }
      }
   }

   static void method392(int var0, int var1) {
      class468 var3 = class355.field2793;
      if (null != var3) {
         method545(var3.field3608, var3.field3611, var3.field3609, var3.field3610, var3.field3607, var3.field3612, var3.field3613, var0, var1);
      }

      class355.field2793 = null;
   }

   public static void method485(class480 var0) {
      if (null != var0 && field797 == var0.field3814) {
         field586[var0.field3813] = true;
      }

   }

   static void method451() {
      for(class49 var1 = (class49)field597.method710(); var1 != null; var1 = (class49)field597.method711()) {
         int var2 = var1.field1047;
         if (class480.method2359(var2)) {
            boolean var3 = true;
            class480[] var4 = class335.field2687[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (null != var4[var5]) {
                  var3 = var4[var5].field3754;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field1078;
               class480 var6 = class480.method2355(var5);
               if (var6 != null) {
                  method485(var6);
               }
            }
         }
      }

   }

   static class480 method493(class480 var0) {
      class480 var2 = method443(var0);
      if (null == var2) {
         var2 = var0.field3773;
      }

      return var2;
   }

   static final void method394(int var0) {
      if (class480.method2359(var0)) {
         class480[] var2 = class335.field2687[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class480 var4 = var2[var3];
            if (null != var4) {
               var4.field3804 = 0;
               var4.field3805 = 0;
            }
         }

      }
   }

   static final void method517(int var0) {
      if (class480.method2359(var0)) {
         method465(class335.field2687[var0], -1);
      }
   }

   static final void method465(class480[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class480 var4 = var0[var3];
         if (null != var4 && var1 == var4.field3691 && (!var4.field3754 || !method458(var4))) {
            int var6;
            if (var4.field3676 == 0) {
               if (!var4.field3754 && method458(var4) && class315.field2564 != var4) {
                  continue;
               }

               method465(var0, var4.field3674);
               if (var4.field3806 != null) {
                  method465(var4.field3806, var4.field3674);
               }

               class49 var5 = (class49)field597.method709((long)var4.field3674);
               if (null != var5) {
                  var6 = var5.field1047;
                  if (class480.method2359(var6)) {
                     method465(class335.field2687[var6], -1);
                  }
               }
            }

            if (var4.field3676 == 6) {
               if (var4.field3720 != -1 || var4.field3794 != -1) {
                  boolean var9 = method408(var4);
                  if (var9) {
                     var6 = var4.field3794;
                  } else {
                     var6 = var4.field3720;
                  }

                  if (var6 != -1) {
                     class157 var7 = class157.method984(var6);
                     if (!var7.method983()) {
                        for(var4.field3805 += field655; var4.field3805 > var7.field1674[var4.field3804]; method485(var4)) {
                           var4.field3805 -= var7.field1674[var4.field3804];
                           ++var4.field3804;
                           if (var4.field3804 >= var7.field1663.length) {
                              var4.field3804 -= var7.field1667;
                              if (var4.field3804 < 0 || var4.field3804 >= var7.field1663.length) {
                                 var4.field3804 = 0;
                              }
                           }
                        }
                     } else {
                        var4.field3804 += field655;
                        int var8 = var7.method980();
                        if (var4.field3804 >= var8) {
                           var4.field3804 -= var7.field1667;
                           if (var4.field3804 < 0 || var4.field3804 >= var8) {
                              var4.field3804 = 0;
                           }
                        }

                        method485(var4);
                     }
                  }
               }

               if (var4.field3765 != 0 && !var4.field3754) {
                  int var10 = var4.field3765 >> 16;
                  var6 = var4.field3765 << 16 >> 16;
                  var10 *= field655;
                  var6 *= field655;
                  var4.field3724 = var4.field3724 + var10 & 2047;
                  var4.field3742 = var6 + var4.field3742 & 2047;
                  method485(var4);
               }
            }
         }
      }

   }

   static final void method401(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var2 = 0.5F + (float)var0 / 200.0F;
      method431((double)var2);
   }

   static final int method526() {
      float var1 = 200.0F * ((float)class4.field36.method2427() - 0.5F);
      return 100 - Math.round(var1);
   }

   static final void method431(double var0) {
      class399.method1934(var0);
      ((class167)class399.field3111.field2239).method1009(var0);
      class71.method681();
      class4.field36.method2429(var0);
   }

   static final void method506(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != class4.field36.method2406()) {
         label35: {
            if (class4.field36.method2406() == 0) {
               boolean var2 = !class228.field2106.isEmpty();
               if (var2) {
                  class22 var3 = class303.field2520;
                  if (!class228.field2106.isEmpty()) {
                     ArrayList var4 = new ArrayList();
                     Iterator var5 = class228.field2106.iterator();

                     while(var5.hasNext()) {
                        class131 var6 = (class131)var5.next();
                        var6.field1552 = false;
                        var6.field1550 = false;
                        var6.field1556 = false;
                        var6.field1553 = false;
                        var6.field1548 = var3;
                        var6.field1547 = var0;
                        var6.field1544 = 0.0F;
                        var4.add(var6);
                     }

                     class228.method1377(var4, class228.field2109, class228.field2110, class228.field2111, class228.field2102, false);
                  }

                  field848 = false;
                  break label35;
               }
            }

            if (var0 == 0) {
               class106.method792(0, 0);
               field848 = false;
            } else {
               class401.method1966(var0, (byte)57);
            }
         }

         class4.field36.method2412(var0);
      }

   }

   static final void method536(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class4.field36.method2413(var0);
   }

   static final void method400(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class4.field36.method2433(var0);
   }

   static final void method507(int var0) {
      method451();

      for(class372 var2 = (class372)class372.field2907.method1236(); var2 != null; var2 = (class372)class372.field2907.method1238()) {
         if (var2.field2917 != null) {
            var2.method1866();
         }
      }

      int var4 = class402.method1967(var0).field111;
      if (var4 != 0) {
         int var3 = class10.field107[var0];
         if (var4 == 1) {
            if (var3 == 1) {
               class399.method1934(0.9);
               ((class167)class399.field3111.field2239).method1009(0.9);
               class71.method681();
               class4.field36.method2429(0.9);
            }

            if (var3 == 2) {
               class399.method1934(0.8);
               ((class167)class399.field3111.field2239).method1009(0.8);
               class71.method681();
               class4.field36.method2429(0.8);
            }

            if (var3 == 3) {
               method431(0.7);
            }

            if (var3 == 4) {
               method431(0.6);
            }
         }

         if (var4 == 3) {
            if (var3 == 0) {
               method506(255);
            }

            if (var3 == 1) {
               method506(192);
            }

            if (var3 == 2) {
               method506(128);
            }

            if (var3 == 3) {
               method506(64);
            }

            if (var3 == 4) {
               method506(0);
            }
         }

         if (var4 == 4) {
            if (var3 == 0) {
               method536(127);
            }

            if (var3 == 1) {
               method536(96);
            }

            if (var3 == 2) {
               method536(64);
            }

            if (var3 == 3) {
               method536(32);
            }

            if (var3 == 4) {
               method536(0);
            }
         }

         if (var4 == 5) {
            field723 = var3 == 1;
         }

         if (var4 == 6) {
            field752 = var3;
         }

         if (var4 == 9) {
         }

         if (var4 == 10) {
            if (var3 == 0) {
               method400(127);
            }

            if (var3 == 1) {
               method400(96);
            }

            if (var3 == 2) {
               method400(64);
            }

            if (var3 == 3) {
               method400(32);
            }

            if (var3 == 4) {
               method400(0);
            }
         }

         if (var4 == 17) {
            field611 = var3 & '\uffff';
         }

         if (var4 == 18) {
            field605 = (class300)class341.method1788(class300.method1660(), var3);
            if (field605 == null) {
               field605 = class300.field2509;
            }
         }

         if (var4 == 19) {
            if (var3 == -1) {
               field715 = -1;
            } else {
               field715 = var3 & 2047;
            }
         }

         if (var4 == 22) {
            field606 = (class300)class341.method1788(class300.method1660(), var3);
            if (null == field606) {
               field606 = class300.field2509;
            }
         }

      }
   }

   static final void method478(class480 var0) {
      int var2 = var0.field3700;
      if (var2 == 324) {
         if (field682 == -1) {
            field682 = var0.field3760;
            field864 = var0.field3708;
         }

         if (field862.field2116 == 1) {
            var0.field3760 = field682;
         } else {
            var0.field3760 = field864;
         }

      } else if (var2 == 325) {
         if (field682 == -1) {
            field682 = var0.field3760;
            field864 = var0.field3708;
         }

         if (field862.field2116 == 1) {
            var0.field3760 = field864;
         } else {
            var0.field3760 = field682;
         }

      } else if (var2 == 327) {
         var0.field3724 = 150;
         var0.field3742 = (int)(Math.sin((double)field879 / 40.0) * 256.0) & 2047;
         var0.field3716 = 5;
         var0.field3717 = 0;
      } else if (var2 == 328) {
         var0.field3724 = 150;
         var0.field3742 = (int)(Math.sin((double)field879 / 40.0) * 256.0) & 2047;
         var0.field3716 = 5;
         var0.field3717 = 1;
      }
   }

   static final void method502() {
      class335 var1 = class335.method1773(class46.field939, field641.field2758);
      field641.method1797(var1);
      class18.field195 = true;

      for(class49 var2 = (class49)field597.method710(); var2 != null; var2 = (class49)field597.method711()) {
         if (var2.field1045 == 0 || var2.field1045 == 3) {
            method437(var2, true);
         }
      }

      if (field753 != null) {
         method485(field753);
         field753 = null;
      }

      class18.field195 = false;
   }

   static final class49 method522(int var0, int var1, int var2) {
      class49 var4 = new class49();
      var4.field1047 = var1;
      var4.field1045 = var2;
      field597.method712(var4, (long)var0);
      method394(var1);
      class480 var5 = class480.method2355(var0);
      method485(var5);
      if (null != field753) {
         method485(field753);
         field753 = null;
      }

      method424(class335.field2687[var0 >> 16], var5, false);
      class18.method209(var1);
      if (field748 != -1) {
         method535(field748, 1);
      }

      return var4;
   }

   static final void method437(class49 var0, boolean var1) {
      int var3 = var0.field1047;
      int var4 = (int)var0.field1078;
      var0.method605();
      if (var1) {
         class480.method2357(var3);
      }

      method523(var3);
      class480 var5 = class480.method2355(var4);
      if (var5 != null) {
         method485(var5);
      }

      if (field748 != -1) {
         method535(field748, 1);
      }

   }

   static final void method404(class480 var0, int var1, int var2, int var3) {
      method514();
      class288 var5 = var0.method2322(false);
      if (var5 != null) {
         class156.method961(var1, var2, var1 + var5.field2447, var2 + var5.field2446);
         if (field829 != 2 && field829 != 5) {
            int var6 = field754 & 2047;
            int var7 = class259.field2281.field4028 / 32 + 48;
            int var8 = 464 - class259.field2281.field3999 / 32;
            class3.field28.method2025(var1, var2, var5.field2447, var5.field2446, var7, var8, var6, 256, var5.field2449, var5.field2448);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < field823; ++var9) {
               var10 = field824[var9] * 4 + 2 - class259.field2281.field4028 / 32;
               var11 = 2 + 4 * field825[var9] - class259.field2281.field3999 / 32;
               method483(var1, var2, var10, var11, field834[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class201 var17 = field716[class192.field1881][var9][var10];
                  if (var17 != null) {
                     var12 = 2 + var9 * 4 - class259.field2281.field4028 / 32;
                     var13 = 2 + var10 * 4 - class259.field2281.field3999 / 32;
                     method483(var1, var2, var12, var13, class451.field3497[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < field637; ++var9) {
               class433 var15 = field636[field575[var9]];
               if (var15 != null && var15.method2465()) {
                  class453 var18 = var15.field3279;
                  if (null != var18 && null != var18.field3542) {
                     var18 = var18.method2232();
                  }

                  if (null != var18 && var18.field3537 && var18.field3548) {
                     var12 = var15.field4028 / 32 - class259.field2281.field4028 / 32;
                     var13 = var15.field3999 / 32 - class259.field2281.field3999 / 32;
                     method483(var1, var2, var12, var13, class451.field3497[1], var5);
                  }
               }
            }

            var9 = class190.field1866;
            int[] var16 = class190.field1867;

            for(var11 = 0; var11 < var9; ++var11) {
               class522 var19 = field749[var16[var11]];
               if (var19 != null && var19.method2465() && !var19.field4115 && var19 != class259.field2281) {
                  var13 = var19.field4028 / 32 - class259.field2281.field4028 / 32;
                  int var14 = var19.field3999 / 32 - class259.field2281.field3999 / 32;
                  if (var19.method2477()) {
                     method483(var1, var2, var13, var14, class451.field3497[3], var5);
                  } else if (class259.field2281.field4122 != 0 && var19.field4122 != 0 && var19.field4122 == class259.field2281.field4122) {
                     method483(var1, var2, var13, var14, class451.field3497[4], var5);
                  } else if (var19.method2480()) {
                     method483(var1, var2, var13, var14, class451.field3497[5], var5);
                  } else if (var19.method2486()) {
                     method483(var1, var2, var13, var14, class451.field3497[6], var5);
                  } else {
                     method483(var1, var2, var13, var14, class451.field3497[2], var5);
                  }
               }
            }

            if (field654 != 0 && field879 % 20 < 10) {
               if (field654 == 1 && field598 >= 0 && field598 < field636.length) {
                  class433 var20 = field636[field598];
                  if (null != var20) {
                     var12 = var20.field4028 / 32 - class259.field2281.field4028 / 32;
                     var13 = var20.field3999 / 32 - class259.field2281.field3999 / 32;
                     method540(var1, var2, var12, var13, class461.field3590[1], var5);
                  }
               }

               if (field654 == 2) {
                  var11 = field600 * 4 - class69.field1134 * 4 + 2 - class259.field2281.field4028 / 32;
                  var12 = 2 + (field743 * 4 - class478.field3659 * 4) - class259.field2281.field3999 / 32;
                  method540(var1, var2, var11, var12, class461.field3590[1], var5);
               }

               if (field654 == 10 && field617 >= 0 && field617 < field749.length) {
                  class522 var21 = field749[field617];
                  if (null != var21) {
                     var12 = var21.field4028 / 32 - class259.field2281.field4028 / 32;
                     var13 = var21.field3999 / 32 - class259.field2281.field3999 / 32;
                     method540(var1, var2, var12, var13, class461.field3590[1], var5);
                  }
               }
            }

            if (field827 != 0) {
               var11 = field827 * 4 + 2 - class259.field2281.field4028 / 32;
               var12 = field750 * 4 + 2 - class259.field2281.field3999 / 32;
               method483(var1, var2, var11, var12, class461.field3590[0], var5);
            }

            if (!class259.field2281.field4115) {
               class156.method954(var1 + var5.field2447 / 2 - 1, var2 + var5.field2446 / 2 - 1, 3, 3, 16777215);
            }
         } else {
            class156.method962(var1, var2, 0, var5.field2449, var5.field2448);
         }

         field799[var3] = true;
      }
   }

   static final void method398(class480 var0, int var1, int var2, int var3) {
      class288 var5 = var0.method2322(false);
      if (var5 != null) {
         if (field829 < 3) {
            field656.method2025(var1, var2, var5.field2447, var5.field2446, 25, 25, field754, 256, var5.field2449, var5.field2448);
         } else {
            class156.method962(var1, var2, 0, var5.field2449, var5.field2448);
         }

      }
   }

   static final void method540(int var0, int var1, int var2, int var3, class427 var4, class288 var5) {
      int var7 = var2 * var2 + var3 * var3;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = field754 & 2047;
         int var9 = class399.field3109[var8];
         int var10 = class399.field3107[var8];
         int var11 = var9 * var3 + var2 * var10 >> 16;
         int var12 = var10 * var3 - var2 * var9 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field2447 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class336.field2689.method2003(var16 + (var5.field2447 / 2 + var0 - var18 / 2), var1 + var5.field2446 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         method483(var0, var1, var2, var3, var4, var5);
      }

   }

   static final void method483(int var0, int var1, int var2, int var3, class427 var4, class288 var5) {
      if (null != var4) {
         int var7 = field754 & 2047;
         int var8 = var2 * var2 + var3 * var3;
         if (var8 <= 6400) {
            int var9 = class399.field3109[var7];
            int var10 = class399.field3107[var7];
            int var11 = var2 * var10 + var9 * var3 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if (var8 > 2500) {
               var4.method2024(var5.field2447 / 2 + var11 - var4.field3234 / 2, var5.field2446 / 2 - var12 - var4.field3235 / 2, var0, var1, var5.field2447, var5.field2446, var5.field2449, var5.field2448);
            } else {
               var4.method2032(var0 + var5.field2447 / 2 + var11 - var4.field3234 / 2, var5.field2446 / 2 + var1 - var12 - var4.field3235 / 2);
            }

         }
      }
   }

   static final void method544() {
      Iterator var1 = class194.field1888.iterator();

      while(var1.hasNext()) {
         class461 var2 = (class461)var1.next();
         var2.method2257();
      }

      if (null != class59.field1089) {
         class59.field1089.method229((byte)-1);
      }

   }

   static final void method452() {
      field782 = field578;
   }

   static final void method461(String var0) {
      if (class59.field1089 != null) {
         class335 var2 = class335.method1773(class46.field1018, field641.field2758);
         var2.field2686.method1114(class184.method1188(var0));
         var2.field2686.method1117(var0);
         field641.method1797(var2);
      }
   }

   static final void method449(String var0) {
      if (!var0.equals("")) {
         class335 var2 = class335.method1773(class46.field998, field641.field2758);
         var2.field2686.method1114(class184.method1188(var0));
         var2.field2686.method1117(var0);
         field641.method1797(var2);
      }
   }

   static final void method428() {
      class335 var1 = class335.method1773(class46.field998, field641.field2758);
      var1.field2686.method1114(0);
      field641.method1797(var1);
   }

   static final void method441(int var0, int var1) {
      class290 var3 = var0 >= 0 ? field821[var0] : class132.field1563;
      if (var3 != null && var1 >= 0 && var1 < var3.method1604()) {
         class219 var4 = (class219)var3.field2457.get(var1);
         if (var4.field2037 == -1) {
            String var5 = var4.field2036.method1458();
            class335 var6 = class335.method1773(class46.field960, field641.field2758);
            var6.field2686.method1114(3 + class184.method1188(var5));
            var6.field2686.method1114(var0);
            var6.field2686.method1155(var1);
            var6.field2686.method1117(var5);
            field641.method1797(var6);
         }
      }
   }

   static final void method533(int var0, int var1) {
      if (field821[var0] != null) {
         if (var1 >= 0 && var1 < field821[var0].method1604()) {
            class219 var3 = (class219)field821[var0].field2457.get(var1);
            if (var3.field2037 == -1) {
               class335 var4 = class335.method1773(class46.field951, field641.field2758);
               var4.field2686.method1114(3 + class184.method1188(var3.field2036.method1458()));
               var4.field2686.method1114(var0);
               var4.field2686.method1155(var1);
               var4.field2686.method1117(var3.field2036.method1458());
               field641.method1797(var4);
            }
         }
      }
   }

   static void method523(int var0) {
      for(class118 var2 = (class118)field795.method710(); null != var2; var2 = (class118)field795.method711()) {
         if ((var2.field1078 >> 48 & 65535L) == (long)var0) {
            var2.method605();
         }
      }

   }

   static int method481(class480 var0) {
      class118 var2 = (class118)field795.method709((long)var0.field3793 + ((long)var0.field3674 << 32));
      return var2 != null ? var2.field1481 : var0.field3745;
   }

   static class480 method443(class480 var0) {
      int var2 = class392.method1900(method481(var0));
      if (var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = class480.method2355(var0.field3691);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   static boolean method458(class480 var0) {
      return var0.field3692;
   }

   static String method511(class480 var0) {
      if (class392.method1898(method481(var0)) == 0) {
         return null;
      } else {
         return null != var0.field3756 && var0.field3756.trim().length() != 0 ? var0.field3756 : null;
      }
   }

   static String method479(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (field601 == 1) {
         var0 = var0 + "-wtrc";
      } else if (field601 == 2) {
         var0 = var0 + "-wtqa";
      } else if (field601 == 3) {
         var0 = var0 + "-wtwip";
      } else if (field601 == 5) {
         var0 = var0 + "-wti";
      } else if (field601 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (null != class267.field2298) {
         var4 = "/p=" + class267.field2298;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class219.field2034 + "/a=" + class521.field4092 + var4 + "/";
   }

   static void method416(String var0) {
      class267.field2298 = var0;

      try {
         String var2 = class191.field1877.getParameter(Integer.toString(18));
         String var3 = class191.field1877.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         String var6;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String var5 = var4 + "; Expires=";
            long var7 = class80.method713() + 94608000000L;
            class87.field1271.setTime(new Date(var7));
            int var9 = class87.field1271.get(7);
            int var10 = class87.field1271.get(5);
            int var11 = class87.field1271.get(2);
            int var12 = class87.field1271.get(1);
            int var13 = class87.field1271.get(11);
            int var14 = class87.field1271.get(12);
            int var15 = class87.field1271.get(13);
            var6 = class87.field1270[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class87.field1272[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
            var4 = var5 + var6 + "; Max-Age=" + 94608000L;
         }

         Client var17 = class191.field1877;
         var6 = "document.cookie=\"" + var4 + "\"";
         JSObject.getWindow(var17).eval(var6);
      } catch (Throwable var16) {
      }

   }

   static void method475(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class192.field1882; ++var5) {
         class71 var6 = class71.method682(var5);
         if ((!var1 || var6.field1188) && var6.field1151 == -1 && var6.field1160.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class57.field1082 = -1;
               class235.field2147 = null;
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

      class235.field2147 = var3;
      class341.field2728 = 0;
      class57.field1082 = var4;
      String[] var9 = new String[class57.field1082];

      for(int var10 = 0; var10 < class57.field1082; ++var10) {
         var9[var10] = class71.method682(var3[var10]).field1160;
      }

      short[] var11 = class235.field2147;
      class379.method1885(var9, var11, 0, var9.length - 1);
   }

   static void method409(class184 var0, int var1) {
      byte[] var3 = var0.field1816;
      if (field859 == null) {
         field859 = new byte[24];
      }

      class324.method1709(var3, var1, field859, 0, 24);
      class237.method1424(var0, var1);
   }

   static void method473(class184 var0) {
      if (field859 != null) {
         var0.method1119(field859, 0, field859.length);
      } else {
         byte[] var3 = new byte[24];

         try {
            class237.field2171.method856(0L);
            class237.field2171.method857(var3);

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

         var0.method1119(var3, 0, var3.length);
      }
   }

   public static void method436(int var0, int var1, int var2, boolean var3) {
      class335 var5 = class335.method1773(class46.field958, field641.field2758);
      var5.field2686.method1187(var2);
      var5.field2686.method1155(var1);
      var5.field2686.method1163(var3 ? field676 : 0);
      var5.field2686.method1177(var0);
      field641.method1797(var5);
   }

   static void method512(int var0) {
      field669 = var0;
   }

   static void method415() {
      field641.method1797(class335.method1773(class46.field1006, field641.field2758));
      field669 = 0;
   }

   static void method497() {
      if (field669 == 1) {
         field677 = true;
      }

   }

   static void method410() {
      if (field677 && null != class259.field2281) {
         int var1 = class259.field2281.field4073[0];
         int var2 = class259.field2281.field4070[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         class105.field1418 = class259.field2281.field4028;
         int var3 = method403(class259.field2281.field4028, class259.field2281.field3999, class192.field1881) - field670;
         if (var3 < class359.field2815) {
            class359.field2815 = var3;
         }

         class192.field1883 = class259.field2281.field3999;
         field677 = false;
      }

   }

   static String method480(String var0) {
      class363[] var2 = class363.method1847();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class363 var4 = var2[var3];
         if (var4.field2848 != -1 && var0.startsWith(class369.method1860(var4.field2848))) {
            var0 = var0.substring(6 + Integer.toString(var4.field2848).length());
            break;
         }
      }

      return var0;
   }

   static void method393() {
      class4.field36.method2430(field581);
   }

   static void method518(int var0) {
      if (var0 != field612) {
         field612 = var0;
      }
   }

   static void method418(boolean var0) {
      field723 = var0;
   }

   static class270 method527(int var0) {
      class270 var2 = (class270)field772.method1851((long)var0);
      if (null == var2) {
         var2 = new class270(class254.field2236, class463.method2264(var0), class463.method2265(var0));
         field772.method1850(var2, (long)var0);
      }

      return var2;
   }

   static class270 method546(int var0) {
      class270 var2 = (class270)field662.method1851((long)var0);
      if (null == var2) {
         var2 = new class270(class254.field2236, var0);
      }

      return var2;
   }

   public static Clipboard method528() {
      return class191.field1877.method1270();
   }

   static void method555(int var0) {
      class157 var2 = class157.method984(var0);
      if (var2.method983()) {
         if (class497.method2431(var2.field1659, (byte)94) == 2) {
            field745.add(var2.field1659);
         }

      }
   }

   static void method467() {
      for(int var1 = 0; var1 < field745.size(); ++var1) {
         if (class497.method2431((Integer)field745.get(var1), (byte)-51) != 2) {
            field745.remove(var1);
            --var1;
         }
      }

   }
}
