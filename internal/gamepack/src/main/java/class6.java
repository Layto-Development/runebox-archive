import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class6 {
   static final class344 field43;
   static final class344 field44;
   static final class344 field91;
   boolean field67 = false;
   boolean field78 = true;
   boolean field83 = false;
   class143 field54;
   class298 field42;
   class298 field48;
   class298 field89;
   class425[] field80;
   class427 field90;
   class429 field53;
   class460 field46;
   class475 field52;
   class475 field60;
   class475 field69;
   class89 field66 = null;
   float field47;
   float field59;
   int field41 = 0;
   int field50 = -1;
   int field51;
   int field55 = 50;
   int field56;
   int field57 = -1;
   int field58 = -1;
   int field61 = -1;
   int field62 = -1;
   int field63 = -1;
   int field64 = -1;
   int field65 = 3;
   int field70 = -1;
   int field71 = -1;
   int field72 = -1;
   int field73 = -1;
   int field74 = -1;
   int field76;
   int field77;
   int field87;
   int field88 = -1;
   int field93 = -1;
   int field94 = -1;
   HashMap field82;
   HashMap field86;
   HashSet field39 = new HashSet();
   HashSet field49 = new HashSet();
   HashSet field68 = null;
   HashSet field79 = new HashSet();
   HashSet field81 = new HashSet();
   HashSet field84 = new HashSet();
   Iterator field45;
   List field85;
   long field75;
   final int[] field92 = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean field40 = false;

   static {
      field43 = class344.field2740;
      field44 = class344.field2746;
      field91 = class344.field2739;
   }

   public void method16(class298 var1, class298 var2, class298 var3, class460 var4, HashMap var5, class425[] var6) {
      this.field80 = var6;
      this.field89 = var1;
      this.field48 = var2;
      this.field42 = var3;
      this.field46 = var4;
      this.field86 = new HashMap();
      this.field86.put(class238.field2183, var5.get(field43));
      this.field86.put(class238.field2178, var5.get(field44));
      this.field86.put(class238.field2177, var5.get(field91));
      this.field54 = new class143(var1);
      int var8 = this.field89.method1654(class511.field3982.field3981);
      int[] var9 = this.field89.method1640(var8);
      int var10 = var9 == null ? 0 : var9.length;
      this.field82 = new HashMap(var10);

      for(int var11 = 0; var11 < var10; ++var11) {
         class184 var12 = new class184(this.field89.method1629(var8, var9[var11]));
         class475 var13 = new class475();
         var13.method2292(var12, var9[var11]);
         this.field82.put(var13.method2301(), var13);
         if (var13.method2295()) {
            this.field60 = var13;
         }
      }

      this.method29(this.field60);
      this.field52 = null;
   }

   public void method17() {
      class227.method1375();
   }

   public void method65(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field54.method917()) {
         this.method20();
         this.method21();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field59));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field59));
            List var11 = this.field53.method2064(this.field76 - var9 / 2 - 1, this.field56 - var10 / 2 - 1, var9 / 2 + this.field76 + 1, this.field56 + var10 / 2 + 1, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class373 var14;
            class208 var15;
            class64 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class18.method216(var15)) {
               var14 = (class373)var13.next();
               var12.add(var14);
               var15 = new class208();
               var16 = new class64(var14.method1871(), var14.field2923, var14.field2922);
               var15.method1263(new Object[]{var16, var1, var2});
               if (this.field84.contains(var14)) {
                  var15.method1261(17);
               } else {
                  var15.method1261(15);
               }
            }

            var13 = this.field84.iterator();

            while(var13.hasNext()) {
               var14 = (class373)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class208();
                  var16 = new class64(var14.method1871(), var14.field2923, var14.field2922);
                  var15.method1263(new Object[]{var16, var1, var2});
                  var15.method1261(16);
                  class18.method216(var15);
               }
            }

            this.field84 = var12;
         }
      }
   }

   public void method19(int var1, int var2, boolean var3, boolean var4) {
      long var6;
      label33: {
         var6 = class80.method713();
         this.method72(var1, var2, var4, var6);
         if (!this.method64() && (var4 || var3)) {
            boolean var8 = Client.field760 != null;
            if (!var8) {
               if (var4) {
                  this.field73 = var1;
                  this.field74 = var2;
                  this.field71 = this.field76;
                  this.field72 = this.field56;
               }

               if (this.field71 != -1) {
                  int var9 = var1 - this.field73;
                  int var10 = var2 - this.field74;
                  this.method32(this.field71 - (int)((float)var9 / this.field47), this.field72 + (int)((float)var10 / this.field47), false);
               }
               break label33;
            }
         }

         this.method68();
      }

      if (var4) {
         this.field75 = var6;
         this.field87 = var1;
         this.field51 = var2;
      }

   }

   void method72(int var1, int var2, boolean var3, long var4) {
      if (this.field69 != null) {
         int var6 = (int)((float)this.field76 + ((float)(var1 - this.field63) - (float)this.method45() * this.field59 / 2.0F) / this.field59);
         int var7 = (int)((float)this.field56 - ((float)(var2 - this.field64) - (float)this.method46() * this.field59 / 2.0F) / this.field59);
         this.field66 = this.field69.method2294(var6 + this.field69.method2300() * 64, var7 + this.field69.method2309() * 64);
         if (null != this.field66 && var3) {
            class17 var8 = Client.method504();
            boolean var9 = Client.field664 >= 2;
            if (var9 && var8.method171(82) && var8.method171(81)) {
               Client.method436(this.field66.field1273, this.field66.field1275, this.field66.field1274, false);
            } else {
               boolean var10 = true;
               if (this.field78) {
                  int var11 = var1 - this.field87;
                  int var12 = var2 - this.field51;
                  if (var4 - this.field75 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  class335 var13 = class335.method1773(class46.field1008, Client.field641.field2758);
                  var13.field2686.method1180(this.field66.method721());
                  Client.field641.method1797(var13);
                  this.field75 = 0L;
               }
            }
         }
      } else {
         this.field66 = null;
      }

   }

   void method20() {
      if (null != class318.field2587) {
         this.field59 = this.field47;
      } else {
         if (this.field59 < this.field47) {
            this.field59 = Math.min(this.field47, this.field59 / 30.0F + this.field59);
         }

         if (this.field59 > this.field47) {
            this.field59 = Math.max(this.field47, this.field59 - this.field59 / 30.0F);
         }

      }
   }

   void method21() {
      if (this.method64()) {
         int var2 = this.field57 - this.field76;
         int var3 = this.field50 - this.field56;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method32(this.field76 + var2, var3 + this.field56, true);
         if (this.field57 == this.field76 && this.field50 == this.field56) {
            this.field57 = -1;
            this.field50 = -1;
         }

      }
   }

   final void method32(int var1, int var2, boolean var3) {
      this.field76 = var1;
      this.field56 = var2;
      class80.method713();
      if (var3) {
         this.method68();
      }

   }

   final void method68() {
      this.field74 = -1;
      this.field73 = -1;
      this.field72 = -1;
      this.field71 = -1;
   }

   boolean method64() {
      return this.field57 != -1 && this.field50 != -1;
   }

   public class475 method24(int var1, int var2, int var3) {
      Iterator var5 = this.field82.values().iterator();

      class475 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class475)var5.next();
      } while(!var6.method2293(var1, var2, var3));

      return var6;
   }

   public void method22(int var1, int var2, int var3, boolean var4) {
      class475 var6 = this.method24(var1, var2, var3);
      if (null == var6) {
         if (!var4) {
            return;
         }

         var6 = this.field60;
      }

      boolean var7 = false;
      if (this.field52 != var6 || var4) {
         this.field52 = var6;
         this.method29(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method69(var1, var2, var3);
      }

   }

   public void method26(int var1) {
      class475 var3 = this.method61(var1);
      if (var3 != null) {
         this.method29(var3);
      }

   }

   public int method27() {
      return null == this.field69 ? -1 : this.field69.method2302();
   }

   public class475 method28() {
      return this.field69;
   }

   void method29(class475 var1) {
      if (this.field69 == null || this.field69 != var1) {
         this.method30(var1);
         this.method69(-1, -1, -1);
      }
   }

   void method30(class475 var1) {
      this.field69 = var1;
      this.field53 = new class429(this.field80, this.field86, this.field48, this.field42);
      this.field54.method915(this.field69 == null ? null : this.field69.method2301());
   }

   public void method31(class475 var1, class89 var2, class89 var3, boolean var4) {
      if (null != var1) {
         if (null == this.field69 || var1 != this.field69) {
            this.method30(var1);
         }

         if (!var4 && this.field69.method2293(var2.field1274, var2.field1273, var2.field1275)) {
            this.method69(var2.field1274, var2.field1273, var2.field1275);
         } else {
            this.method69(var3.field1274, var3.field1273, var3.field1275);
         }

      }
   }

   void method69(int var1, int var2, int var3) {
      if (null != this.field69) {
         int[] var5 = this.field69.method2306(var1, var2, var3);
         if (null == var5) {
            var5 = this.field69.method2306(this.field69.method2303(), this.field69.method2310(), this.field69.method2304());
         }

         this.method32(var5[0] - this.field69.method2300() * 64, var5[1] - this.field69.method2309() * 64, true);
         this.field57 = -1;
         this.field50 = -1;
         this.field59 = this.method36(this.field69.method2299());
         this.field47 = this.field59;
         this.field85 = null;
         this.field45 = null;
         this.field53.method2068();
      }
   }

   public void method73(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class156.method950(var7);
      class156.method961(var1, var2, var3 + var1, var4 + var2);
      class156.method954(var1, var2, var3, var4, -16777216);
      int var8 = this.field54.method918();
      if (var8 < 100) {
         this.method44(var1, var2, var3, var4, var8);
      } else {
         if (!this.field53.method2066()) {
            this.field53.method2060(this.field89, this.field69.method2301(), Client.field603);
            if (!this.field53.method2066()) {
               return;
            }
         }

         if (this.field68 != null) {
            ++this.field70;
            if (this.field70 % this.field55 == 0) {
               this.field70 = 0;
               ++this.field58;
            }

            if (this.field58 >= this.field65 && !this.field67) {
               this.field68 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field59));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field59));
         this.field53.method2061(this.field76 - var9 / 2, this.field56 - var10 / 2, this.field76 + var9 / 2, this.field56 + var10 / 2, var1, var2, var3 + var1, var2 + var4);
         boolean var11;
         if (!this.field83) {
            var11 = false;
            if (var5 - this.field41 > 100) {
               this.field41 = var5;
               var11 = true;
            }

            this.field53.method2062(this.field76 - var9 / 2, this.field56 - var10 / 2, this.field76 + var9 / 2, var10 / 2 + this.field56, var1, var2, var3 + var1, var4 + var2, this.field39, this.field68, this.field70, this.field55, var11);
         }

         this.method34(var1, var2, var3, var4, var9, var10);
         var11 = Client.field664 >= 2;
         if (var11 && this.field40 && null != this.field66) {
            this.field46.method1594("Coord: " + this.field66, class156.field1653 + 10, class156.field1654 + 20, 16776960, -1);
         }

         this.field61 = var9;
         this.field62 = var10;
         this.field63 = var1;
         this.field64 = var2;
         class156.method970(var7);
      }
   }

   boolean method70(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.field90) {
         return true;
      } else if (var1 == this.field90.field3237 && this.field90.field3233 == var2) {
         if (this.field77 != this.field53.field3259) {
            return true;
         } else if (Client.field699 != this.field94) {
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

   void method34(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != class318.field2587) {
         int var8 = 512 / (this.field53.field3259 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method43() - var5 / 2 - var8;
         int var13 = this.method66() - var6 / 2 - var8;
         int var14 = var1 - this.field53.field3259 * (var12 + var8 - this.field88);
         int var15 = var2 - (var8 - (var13 - this.field93)) * this.field53.field3259;
         if (this.method70(var9, var10, var14, var15, var3, var4)) {
            if (this.field90 != null && var9 == this.field90.field3237 && var10 == this.field90.field3233) {
               Arrays.fill(this.field90.field3236, 0);
            } else {
               this.field90 = new class427(var9, var10);
            }

            this.field88 = this.method43() - var5 / 2 - var8;
            this.field93 = this.method66() - var6 / 2 - var8;
            this.field77 = this.field53.field3259;
            class318.field2587.method2272(this.field88, this.field93, this.field90, (float)this.field77 / var11);
            this.field94 = Client.field699;
            var14 = var1 - this.field53.field3259 * (var8 + var12 - this.field88);
            var15 = var2 - this.field53.field3259 * (var8 - (var13 - this.field93));
         }

         class156.method953(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field90.method2036(var14, var15, 192);
         } else {
            this.field90.method2022(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
         }
      }

   }

   public void method63(int var1, int var2, int var3, int var4) {
      if (this.field54.method917()) {
         if (!this.field53.method2066()) {
            this.field53.method2060(this.field89, this.field69.method2301(), Client.field603);
            if (!this.field53.method2066()) {
               return;
            }
         }

         this.field53.method2063(var1, var2, var3, var4, this.field68, this.field70, this.field55);
      }
   }

   public void method35(int var1) {
      this.field47 = this.method36(var1);
   }

   void method44(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var3 / 2 + var1;
      int var9 = var2 + var4 / 2 - 18 - var7;
      class156.method954(var1, var2, var3, var4, -16777216);
      class156.method957(var8 - 152, var9, 304, 34, -65536);
      class156.method954(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field46.method1573(class27.field383, var8, var7 + var9, -1, -1);
   }

   float method36(int var1) {
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

   public int method37() {
      if ((double)this.field47 == 1.0) {
         return 25;
      } else if (1.5 == (double)this.field47) {
         return 37;
      } else if ((double)this.field47 == 2.0) {
         return 50;
      } else if (3.0 == (double)this.field47) {
         return 75;
      } else {
         return 4.0 == (double)this.field47 ? 100 : 200;
      }
   }

   public void method38() {
      this.field54.method916();
   }

   public boolean method67() {
      return this.field54.method917();
   }

   public class475 method61(int var1) {
      Iterator var3 = this.field82.values().iterator();

      class475 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class475)var3.next();
      } while(var4.method2302() != var1);

      return var4;
   }

   public void method39(int var1, int var2) {
      if (this.field69 != null && this.field69.method2296(var1, var2)) {
         this.field57 = var1 - this.field69.method2300() * 64;
         this.field50 = var2 - this.field69.method2309() * 64;
      }
   }

   public void method40(int var1, int var2) {
      if (this.field69 != null) {
         this.method32(var1 - this.field69.method2300() * 64, var2 - this.field69.method2309() * 64, true);
         this.field57 = -1;
         this.field50 = -1;
      }
   }

   public void method41(int var1, int var2, int var3) {
      if (this.field69 != null) {
         int[] var5 = this.field69.method2306(var1, var2, var3);
         if (null != var5) {
            this.method39(var5[0], var5[1]);
         }

      }
   }

   public void method42(int var1, int var2, int var3) {
      if (null != this.field69) {
         int[] var5 = this.field69.method2306(var1, var2, var3);
         if (null != var5) {
            this.method40(var5[0], var5[1]);
         }

      }
   }

   public int method43() {
      return null == this.field69 ? -1 : this.field76 + this.field69.method2300() * 64;
   }

   public int method66() {
      return this.field69 == null ? -1 : this.field56 + this.field69.method2309() * 64;
   }

   public class89 method23() {
      return null == this.field69 ? null : this.field69.method2294(this.method43(), this.method66());
   }

   public int method45() {
      return this.field61;
   }

   public int method46() {
      return this.field62;
   }

   public void method47(int var1) {
      if (var1 >= 1) {
         this.field65 = var1;
      }

   }

   public void method48() {
      this.field65 = 3;
   }

   public void method49(int var1) {
      if (var1 >= 1) {
         this.field55 = var1;
      }

   }

   public void method50() {
      this.field55 = 50;
   }

   public void method51(boolean var1) {
      this.field67 = var1;
   }

   public void method33(int var1) {
      this.field68 = new HashSet();
      this.field68.add(var1);
      this.field58 = 0;
      this.field70 = 0;
   }

   public void method52(int var1) {
      this.field68 = new HashSet();
      this.field58 = 0;
      this.field70 = 0;

      for(int var3 = 0; var3 < class444.field3364; ++var3) {
         if (class444.method2173(var3) != null && class444.method2173(var3).field3384 == var1) {
            this.field68.add(class444.method2173(var3).field3370);
         }
      }

   }

   public void method53() {
      this.field68 = null;
   }

   public void method54(boolean var1) {
      this.field83 = !var1;
   }

   public void method62(int var1, boolean var2) {
      if (!var2) {
         this.field79.add(var1);
      } else {
         this.field79.remove(var1);
      }

      this.method57();
   }

   public void method25(int var1, boolean var2) {
      if (!var2) {
         this.field49.add(var1);
      } else {
         this.field49.remove(var1);
      }

      for(int var4 = 0; var4 < class444.field3364; ++var4) {
         if (class444.method2173(var4) != null && class444.method2173(var4).field3384 == var1) {
            int var5 = class444.method2173(var4).field3370;
            if (!var2) {
               this.field81.add(var5);
            } else {
               this.field81.remove(var5);
            }
         }
      }

      this.method57();
   }

   public boolean method55() {
      return !this.field83;
   }

   public boolean method71(int var1) {
      return !this.field79.contains(var1);
   }

   public boolean method56(int var1) {
      return !this.field49.contains(var1);
   }

   void method57() {
      this.field39.clear();
      this.field39.addAll(this.field79);
      this.field39.addAll(this.field81);
   }

   public void method58(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field54.method917()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field59));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field59));
         List var10 = this.field53.method2064(this.field76 - var8 / 2 - 1, this.field56 - var9 / 2 - 1, var8 / 2 + this.field76 + 1, 1 + this.field56 + var9 / 2, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class373 var12 = (class373)var11.next();
               class444 var13 = class444.method2173(var12.method1871());
               var14 = false;

               for(int var15 = this.field92.length - 1; var15 >= 0; --var15) {
                  if (null != var13.field3374[var15]) {
                     Client.method534(var13.field3374[var15], var13.field3366, this.field92[var15], var12.method1871(), var12.field2923.method721(), var12.field2922.method721());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public class89 method59(int var1, class89 var2) {
      if (!this.field54.method917()) {
         return null;
      } else if (!this.field53.method2066()) {
         return null;
      } else if (!this.field69.method2296(var2.field1273, var2.field1275)) {
         return null;
      } else {
         HashMap var4 = this.field53.method2067();
         List var5 = (List)var4.get(var1);
         if (null != var5 && !var5.isEmpty()) {
            class373 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class373 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field2922;
                  }

                  var9 = (class373)var8.next();
                  int var10 = var9.field2922.field1273 - var2.field1273;
                  int var11 = var9.field2922.field1275 - var2.field1275;
                  var12 = var10 * var10 + var11 * var11;
                  if (var12 == 0) {
                     return var9.field2922;
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

   public void method74(int var1, int var2, class89 var3, class89 var4) {
      class208 var6 = new class208();
      class64 var7 = new class64(var2, var3, var4);
      var6.method1263(new Object[]{var7});
      switch (var1) {
         case 1008:
            var6.method1261(10);
            break;
         case 1009:
            var6.method1261(11);
            break;
         case 1010:
            var6.method1261(12);
            break;
         case 1011:
            var6.method1261(13);
            break;
         case 1012:
            var6.method1261(14);
      }

      class18.method216(var6);
   }

   public class373 method18() {
      if (!this.field54.method917()) {
         return null;
      } else if (!this.field53.method2066()) {
         return null;
      } else {
         HashMap var2 = this.field53.method2067();
         this.field85 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field85.addAll(var4);
         }

         this.field45 = this.field85.iterator();
         return this.method60();
      }
   }

   public class373 method60() {
      if (null == this.field45) {
         return null;
      } else {
         class373 var2;
         do {
            if (!this.field45.hasNext()) {
               return null;
            }

            var2 = (class373)this.field45.next();
         } while(var2.method1871() == -1);

         return var2;
      }
   }
}
