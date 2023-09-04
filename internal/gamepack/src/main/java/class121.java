import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class121 {
   static final class467 field744;
   static final class467 field745;
   static final class467 field792;
   boolean field768 = false;
   boolean field779 = true;
   boolean field784 = false;
   class100 field755;
   class113 field767 = null;
   class296 field791;
   class312 field754;
   class396 field747;
   class456 field753;
   class456 field761;
   class456 field770;
   class501[] field781;
   class509 field743;
   class509 field749;
   class509 field790;
   float field748;
   float field760;
   int field742 = 0;
   int field751 = -1;
   int field752;
   int field756 = 50;
   int field757;
   int field758 = -1;
   int field759 = -1;
   int field762 = -1;
   int field763 = -1;
   int field764 = -1;
   int field765 = -1;
   int field766 = 3;
   int field771 = -1;
   int field772 = -1;
   int field773 = -1;
   int field774 = -1;
   int field775 = -1;
   int field777;
   int field778;
   int field788;
   int field789 = -1;
   int field794 = -1;
   int field795 = -1;
   HashMap field783;
   HashMap field787;
   HashSet field740 = new HashSet();
   HashSet field750 = new HashSet();
   HashSet field769 = null;
   HashSet field780 = new HashSet();
   HashSet field782 = new HashSet();
   HashSet field785 = new HashSet();
   Iterator field746;
   List field786;
   long field776;
   final int[] field793 = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean field741 = false;

   static {
      field744 = class467.field3691;
      field745 = class467.field3697;
      field792 = class467.field3690;
   }

   public void method411(class509 var1, class509 var2, class509 var3, class396 var4, HashMap var5, class501[] var6) {
      this.field781 = var6;
      this.field790 = var1;
      this.field749 = var2;
      this.field743 = var3;
      this.field747 = var4;
      this.field787 = new HashMap();
      this.field787.put(class315.field2132, var5.get(field744));
      this.field787.put(class315.field2127, var5.get(field745));
      this.field787.put(class315.field2126, var5.get(field792));
      this.field755 = new class100(var1);
      int var8 = this.field790.method2447(class75.field550.field549);
      int[] var9 = this.field790.method2433(var8);
      int var10 = var9 == null ? 0 : var9.length;
      this.field783 = new HashMap(var10);

      for(int var11 = 0; var11 < var10; ++var11) {
         class366 var12 = new class366(this.field790.method2422(var8, var9[var11]));
         class456 var13 = new class456();
         var13.method2117(var12, var9[var11]);
         this.field783.put(var13.method2126(), var13);
         if (var13.method2120()) {
            this.field761 = var13;
         }
      }

      this.method424(this.field761);
      this.field753 = null;
   }

   public void method412() {
      class328.method1553();
   }

   public void method460(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field755.method377()) {
         this.method415();
         this.method416();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field760));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field760));
            List var11 = this.field754.method1423(this.field777 - var9 / 2 - 1, this.field757 - var10 / 2 - 1, var9 / 2 + this.field777 + 1, this.field757 + var10 / 2 + 1, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class368 var14;
            class64 var15;
            class192 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class197.method1038(var15)) {
               var14 = (class368)var13.next();
               var12.add(var14);
               var15 = new class64();
               var16 = new class192(var14.method1720(), var14.field2660, var14.field2659);
               var15.method285(new Object[]{var16, var1, var2});
               if (this.field785.contains(var14)) {
                  var15.method283(17);
               } else {
                  var15.method283(15);
               }
            }

            var13 = this.field785.iterator();

            while(var13.hasNext()) {
               var14 = (class368)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class64();
                  var16 = new class192(var14.method1720(), var14.field2660, var14.field2659);
                  var15.method285(new Object[]{var16, var1, var2});
                  var15.method283(16);
                  class197.method1038(var15);
               }
            }

            this.field785 = var12;
         }
      }
   }

   public void method414(int var1, int var2, boolean var3, boolean var4) {
      long var6;
      label33: {
         var6 = class123.method471();
         this.method467(var1, var2, var4, var6);
         if (!this.method459() && (var4 || var3)) {
            boolean var8 = Client.field1300 != null;
            if (!var8) {
               if (var4) {
                  this.field774 = var1;
                  this.field775 = var2;
                  this.field772 = this.field777;
                  this.field773 = this.field757;
               }

               if (-1 != this.field772) {
                  int var9 = var1 - this.field774;
                  int var10 = var2 - this.field775;
                  this.method427(this.field772 - (int)((float)var9 / this.field748), this.field773 + (int)((float)var10 / this.field748), false);
               }
               break label33;
            }
         }

         this.method463();
      }

      if (var4) {
         this.field776 = var6;
         this.field788 = var1;
         this.field752 = var2;
      }

   }

   void method467(int var1, int var2, boolean var3, long var4) {
      if (this.field770 != null) {
         int var6 = (int)((float)this.field777 + ((float)(var1 - this.field764) - (float)this.method440() * this.field760 / 2.0F) / this.field760);
         int var7 = (int)((float)this.field757 - ((float)(var2 - this.field765) - (float)this.method441() * this.field760 / 2.0F) / this.field760);
         this.field767 = this.field770.method2119(var6 + this.field770.method2125() * 64, var7 + this.field770.method2134() * 64);
         if (null != this.field767 && var3) {
            class303 var8 = Client.method888();
            boolean var9 = Client.field1204 >= 2;
            if (var9 && var8.method1385(82) && var8.method1385(81)) {
               Client.method820(this.field767.field726, this.field767.field728, this.field767.field727, false);
            } else {
               boolean var10 = true;
               if (this.field779) {
                  int var11 = var1 - this.field788;
                  int var12 = var2 - this.field752;
                  if (var4 - this.field776 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  class53 var13 = class53.method226(class10.field156, Client.field1181.field3781);
                  var13.field435.method1709(this.field767.method403());
                  Client.field1181.method2254(var13);
                  this.field776 = 0L;
               }
            }
         }
      } else {
         this.field767 = null;
      }

   }

   void method415() {
      if (null != class294.field2020) {
         this.field760 = this.field748;
      } else {
         if (this.field760 < this.field748) {
            this.field760 = Math.min(this.field748, this.field760 / 30.0F + this.field760);
         }

         if (this.field760 > this.field748) {
            this.field760 = Math.max(this.field748, this.field760 - this.field760 / 30.0F);
         }

      }
   }

   void method416() {
      if (this.method459()) {
         int var2 = this.field758 - this.field777;
         int var3 = this.field751 - this.field757;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method427(this.field777 + var2, var3 + this.field757, true);
         if (this.field758 == this.field777 && this.field751 == this.field757) {
            this.field758 = -1;
            this.field751 = -1;
         }

      }
   }

   final void method427(int var1, int var2, boolean var3) {
      this.field777 = var1;
      this.field757 = var2;
      class123.method471();
      if (var3) {
         this.method463();
      }

   }

   final void method463() {
      this.field775 = -1;
      this.field774 = -1;
      this.field773 = -1;
      this.field772 = -1;
   }

   boolean method459() {
      return this.field758 != -1 && this.field751 != -1;
   }

   public class456 method419(int var1, int var2, int var3) {
      Iterator var5 = this.field783.values().iterator();

      class456 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class456)var5.next();
      } while(!var6.method2118(var1, var2, var3));

      return var6;
   }

   public void method417(int var1, int var2, int var3, boolean var4) {
      class456 var6 = this.method419(var1, var2, var3);
      if (null == var6) {
         if (!var4) {
            return;
         }

         var6 = this.field761;
      }

      boolean var7 = false;
      if (this.field753 != var6 || var4) {
         this.field753 = var6;
         this.method424(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method464(var1, var2, var3);
      }

   }

   public void method421(int var1) {
      class456 var3 = this.method456(var1);
      if (var3 != null) {
         this.method424(var3);
      }

   }

   public int method422() {
      return null == this.field770 ? -1 : this.field770.method2127();
   }

   public class456 method423() {
      return this.field770;
   }

   void method424(class456 var1) {
      if (this.field770 == null || this.field770 != var1) {
         this.method425(var1);
         this.method464(-1, -1, -1);
      }
   }

   void method425(class456 var1) {
      this.field770 = var1;
      this.field754 = new class312(this.field781, this.field787, this.field749, this.field743);
      this.field755.method375(this.field770 == null ? null : this.field770.method2126());
   }

   public void method426(class456 var1, class113 var2, class113 var3, boolean var4) {
      if (null != var1) {
         if (null == this.field770 || var1 != this.field770) {
            this.method425(var1);
         }

         if (!var4 && this.field770.method2118(var2.field727, var2.field726, var2.field728)) {
            this.method464(var2.field727, var2.field726, var2.field728);
         } else {
            this.method464(var3.field727, var3.field726, var3.field728);
         }

      }
   }

   void method464(int var1, int var2, int var3) {
      if (null != this.field770) {
         int[] var5 = this.field770.method2131(var1, var2, var3);
         if (null == var5) {
            var5 = this.field770.method2131(this.field770.method2128(), this.field770.method2135(), this.field770.method2129());
         }

         this.method427(var5[0] - this.field770.method2125() * 64, var5[1] - this.field770.method2134() * 64, true);
         this.field758 = -1;
         this.field751 = -1;
         this.field760 = this.method431(this.field770.method2124());
         this.field748 = this.field760;
         this.field786 = null;
         this.field746 = null;
         this.field754.method1427();
      }
   }

   public void method468(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class427.method1964(var7);
      class427.method1975(var1, var2, var3 + var1, var4 + var2);
      class427.method1968(var1, var2, var3, var4, -16777216);
      int var8 = this.field755.method378();
      if (var8 < 100) {
         this.method439(var1, var2, var3, var4, var8);
      } else {
         if (!this.field754.method1425()) {
            this.field754.method1419(this.field790, this.field770.method2126(), Client.field1143);
            if (!this.field754.method1425()) {
               return;
            }
         }

         if (this.field769 != null) {
            ++this.field771;
            if (0 == this.field771 % this.field756) {
               this.field771 = 0;
               ++this.field759;
            }

            if (this.field759 >= this.field766 && !this.field768) {
               this.field769 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field760));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field760));
         this.field754.method1420(this.field777 - var9 / 2, this.field757 - var10 / 2, this.field777 + var9 / 2, this.field757 + var10 / 2, var1, var2, var3 + var1, var2 + var4);
         boolean var11;
         if (!this.field784) {
            var11 = false;
            if (var5 - this.field742 > 100) {
               this.field742 = var5;
               var11 = true;
            }

            this.field754.method1421(this.field777 - var9 / 2, this.field757 - var10 / 2, this.field777 + var9 / 2, var10 / 2 + this.field757, var1, var2, var3 + var1, var4 + var2, this.field740, this.field769, this.field771, this.field756, var11);
         }

         this.method429(var1, var2, var3, var4, var9, var10);
         var11 = Client.field1204 >= 2;
         if (var11 && this.field741 && null != this.field767) {
            this.field747.method1943("Coord: " + this.field767, class427.field3336 + 10, class427.field3337 + 20, 16776960, -1);
         }

         this.field762 = var9;
         this.field763 = var10;
         this.field764 = var1;
         this.field765 = var2;
         class427.method1984(var7);
      }
   }

   boolean method465(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.field791) {
         return true;
      } else if (var1 == this.field791.field2032 && this.field791.field2028 == var2) {
         if (this.field778 != this.field754.field2117) {
            return true;
         } else if (Client.field1239 != this.field795) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method429(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != class294.field2020) {
         int var8 = 512 / (this.field754.field2117 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method438() - var5 / 2 - var8;
         int var13 = this.method461() - var6 / 2 - var8;
         int var14 = var1 - this.field754.field2117 * (var12 + var8 - this.field789);
         int var15 = var2 - (var8 - (var13 - this.field794)) * this.field754.field2117;
         if (this.method465(var9, var10, var14, var15, var3, var4)) {
            if (this.field791 != null && var9 == this.field791.field2032 && var10 == this.field791.field2028) {
               Arrays.fill(this.field791.field2031, 0);
            } else {
               this.field791 = new class296(var9, var10);
            }

            this.field789 = this.method438() - var5 / 2 - var8;
            this.field794 = this.method461() - var6 / 2 - var8;
            this.field778 = this.field754.field2117;
            class294.field2020.method368(this.field789, this.field794, this.field791, (float)this.field778 / var11);
            this.field795 = Client.field1239;
            var14 = var1 - this.field754.field2117 * (var8 + var12 - this.field789);
            var15 = var2 - this.field754.field2117 * (var8 - (var13 - this.field794));
         }

         class427.method1967(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field791.method1370(var14, var15, 192);
         } else {
            this.field791.method1356(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public void method458(int var1, int var2, int var3, int var4) {
      if (this.field755.method377()) {
         if (!this.field754.method1425()) {
            this.field754.method1419(this.field790, this.field770.method2126(), Client.field1143);
            if (!this.field754.method1425()) {
               return;
            }
         }

         this.field754.method1422(var1, var2, var3, var4, this.field769, this.field771, this.field756);
      }
   }

   public void method430(int var1) {
      this.field748 = this.method431(var1);
   }

   void method439(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var3 / 2 + var1;
      int var9 = var2 + var4 / 2 - 18 - var7;
      class427.method1968(var1, var2, var3, var4, -16777216);
      class427.method1971(var8 - 152, var9, 304, 34, -65536);
      class427.method1968(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field747.method1922(class424.field3150, var8, var7 + var9, -1, -1);
   }

   float method431(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public int method432() {
      if ((double)this.field748 == 1.0) {
         return 25;
      } else if (1.5 == (double)this.field748) {
         return 37;
      } else if ((double)this.field748 == 2.0) {
         return 50;
      } else if (3.0 == (double)this.field748) {
         return 75;
      } else {
         return 4.0 == (double)this.field748 ? 100 : 200;
      }
   }

   public void method433() {
      this.field755.method376();
   }

   public boolean method462() {
      return this.field755.method377();
   }

   public class456 method456(int var1) {
      Iterator var3 = this.field783.values().iterator();

      class456 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class456)var3.next();
      } while(var4.method2127() != var1);

      return var4;
   }

   public void method434(int var1, int var2) {
      if (this.field770 != null && this.field770.method2121(var1, var2)) {
         this.field758 = var1 - this.field770.method2125() * 64;
         this.field751 = var2 - this.field770.method2134() * 64;
      }
   }

   public void method435(int var1, int var2) {
      if (this.field770 != null) {
         this.method427(var1 - this.field770.method2125() * 64, var2 - this.field770.method2134() * 64, true);
         this.field758 = -1;
         this.field751 = -1;
      }
   }

   public void method436(int var1, int var2, int var3) {
      if (this.field770 != null) {
         int[] var5 = this.field770.method2131(var1, var2, var3);
         if (null != var5) {
            this.method434(var5[0], var5[1]);
         }

      }
   }

   public void method437(int var1, int var2, int var3) {
      if (null != this.field770) {
         int[] var5 = this.field770.method2131(var1, var2, var3);
         if (null != var5) {
            this.method435(var5[0], var5[1]);
         }

      }
   }

   public int method438() {
      return null == this.field770 ? -1 : this.field777 + this.field770.method2125() * 64;
   }

   public int method461() {
      return this.field770 == null ? -1 : this.field757 + this.field770.method2134() * 64;
   }

   public class113 method418() {
      return null == this.field770 ? null : this.field770.method2119(this.method438(), this.method461());
   }

   public int method440() {
      return this.field762;
   }

   public int method441() {
      return this.field763;
   }

   public void method442(int var1) {
      if (var1 >= 1) {
         this.field766 = var1;
      }

   }

   public void method443() {
      this.field766 = 3;
   }

   public void method444(int var1) {
      if (var1 >= 1) {
         this.field756 = var1;
      }

   }

   public void method445() {
      this.field756 = 50;
   }

   public void method446(boolean var1) {
      this.field768 = var1;
   }

   public void method428(int var1) {
      this.field769 = new HashSet();
      this.field769.add(var1);
      this.field759 = 0;
      this.field771 = 0;
   }

   public void method447(int var1) {
      this.field769 = new HashSet();
      this.field759 = 0;
      this.field771 = 0;

      for(int var3 = 0; var3 < class430.field3343; ++var3) {
         if (class430.method2005(var3) != null && class430.method2005(var3).field3363 == var1) {
            this.field769.add(class430.method2005(var3).field3349);
         }
      }

   }

   public void method448() {
      this.field769 = null;
   }

   public void method449(boolean var1) {
      this.field784 = !var1;
   }

   public void method457(int var1, boolean var2) {
      if (!var2) {
         this.field780.add(var1);
      } else {
         this.field780.remove(var1);
      }

      this.method452();
   }

   public void method420(int var1, boolean var2) {
      if (!var2) {
         this.field750.add(var1);
      } else {
         this.field750.remove(var1);
      }

      for(int var4 = 0; var4 < class430.field3343; ++var4) {
         if (class430.method2005(var4) != null && class430.method2005(var4).field3363 == var1) {
            int var5 = class430.method2005(var4).field3349;
            if (!var2) {
               this.field782.add(var5);
            } else {
               this.field782.remove(var5);
            }
         }
      }

      this.method452();
   }

   public boolean method450() {
      return !this.field784;
   }

   public boolean method466(int var1) {
      return !this.field780.contains(var1);
   }

   public boolean method451(int var1) {
      return !this.field750.contains(var1);
   }

   void method452() {
      this.field740.clear();
      this.field740.addAll(this.field780);
      this.field740.addAll(this.field782);
   }

   public void method453(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field755.method377()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field760));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field760));
         List var10 = this.field754.method1423(this.field777 - var8 / 2 - 1, this.field757 - var9 / 2 - 1, var8 / 2 + this.field777 + 1, 1 + this.field757 + var9 / 2, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class368 var12 = (class368)var11.next();
               class430 var13 = class430.method2005(var12.method1720());
               var14 = false;

               for(int var15 = this.field793.length - 1; var15 >= 0; --var15) {
                  if (null != var13.field3353[var15]) {
                     Client.method918(var13.field3353[var15], var13.field3345, this.field793[var15], var12.method1720(), var12.field2660.method403(), var12.field2659.method403());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public class113 method454(int var1, class113 var2) {
      if (!this.field755.method377()) {
         return null;
      } else if (!this.field754.method1425()) {
         return null;
      } else if (!this.field770.method2121(var2.field726, var2.field728)) {
         return null;
      } else {
         HashMap var4 = this.field754.method1426();
         List var5 = (List)var4.get(var1);
         if (null != var5 && !var5.isEmpty()) {
            class368 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class368 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field2659;
                  }

                  var9 = (class368)var8.next();
                  int var10 = var9.field2659.field726 - var2.field726;
                  int var11 = var9.field2659.field728 - var2.field728;
                  var12 = var10 * var10 + var11 * var11;
                  if (var12 == 0) {
                     return var9.field2659;
                  }
               } while(var12 >= var7 && null != var6);

               var6 = var9;
               var7 = var12;
            }
         } else {
            return null;
         }
      }
   }

   public void method469(int var1, int var2, class113 var3, class113 var4) {
      class64 var6 = new class64();
      class192 var7 = new class192(var2, var3, var4);
      var6.method285(new Object[]{var7});
      switch (var1) {
         case 1008:
            var6.method283(10);
            break;
         case 1009:
            var6.method283(11);
            break;
         case 1010:
            var6.method283(12);
            break;
         case 1011:
            var6.method283(13);
            break;
         case 1012:
            var6.method283(14);
      }

      class197.method1038(var6);
   }

   public class368 method413() {
      if (!this.field755.method377()) {
         return null;
      } else if (!this.field754.method1425()) {
         return null;
      } else {
         HashMap var2 = this.field754.method1426();
         this.field786 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field786.addAll(var4);
         }

         this.field746 = this.field786.iterator();
         return this.method455();
      }
   }

   public class368 method455() {
      if (null == this.field746) {
         return null;
      } else {
         class368 var2;
         do {
            if (!this.field746.hasNext()) {
               return null;
            }

            var2 = (class368)this.field746.next();
         } while(var2.method1720() == -1);

         return var2;
      }
   }
}
