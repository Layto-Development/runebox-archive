import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class class495 extends class151 {
   public static ThreadPoolExecutor field3921;
   static int field3920;
   boolean field3925;
   class75[][] field3917 = (class75[][])null;
   int field3919 = 0;
   int field3924;
   List field3916;
   Future field3922;
   public class370 field3918;
   public class75[][] field3923 = (class75[][])null;

   public class495(class298 var1, class298 var2, int var3, boolean var4) {
      this.field3924 = var3;
      byte[] var5 = var1.method1629(this.field3924 >> 16 & '\uffff', this.field3924 & '\uffff');
      class184 var6 = new class184(var5);
      int var7 = var6.method1125();
      int var8 = var6.method1174();
      byte[] var9;
      if (var4) {
         var9 = var2.method1637(0, var8);
      } else {
         var9 = var2.method1637(var8, 0);
      }

      this.field3918 = new class370(var8, var9);
      this.field3916 = new ArrayList();
      this.field3922 = field3921.submit(new class95(this, var6, var7));
   }

   void method2393(class184 var1, int var2) {
      var1.method1174();
      var1.method1174();
      this.field3919 = var1.method1125();
      int var4 = var1.method1174();
      this.field3917 = new class75[this.field3918.method1861().method1335()][];
      this.field3923 = new class75[this.field3918.method1862()][];
      class382[] var5 = new class382[var4];

      int var6;
      int var8;
      int var10;
      for(var6 = 0; var6 < var4; ++var6) {
         var8 = var1.method1125();
         class424 var9 = (class424)class341.method1788(class424.method1994(), var8);
         if (var9 == null) {
            var9 = class424.field3216;
         }

         var10 = var1.method1136();
         int var12 = var1.method1125();
         class236[] var13 = new class236[]{class236.field2153, class236.field2149, class236.field2150, class236.field2151, class236.field2157, class236.field2167, class236.field2154, class236.field2155, class236.field2165, class236.field2159, class236.field2158, class236.field2156, class236.field2160, class236.field2152, class236.field2161, class236.field2162, class236.field2163};
         class236 var14 = (class236)class341.method1788(var13, var12);
         if (var14 == null) {
            var14 = class236.field2153;
         }

         class75 var19 = new class75();
         var19.method688(var1, var2, (byte)-47);
         var5[var6] = new class382(this, var19, var9, var14, var10);
         int var15 = var9.method1993();
         class75[][] var16;
         if (class424.field3219 == var9) {
            var16 = this.field3917;
         } else {
            var16 = this.field3923;
         }

         if (null == var16[var10]) {
            var16[var10] = new class75[var15];
         }

         if (var9 == class424.field3215) {
            this.field3925 = true;
         }
      }

      var6 = var4 / class264.field2291;
      int var7 = var4 % class264.field2291;
      int var17 = 0;

      for(var10 = 0; var10 < class264.field2291; ++var10) {
         var8 = var17;
         var17 += var6;
         if (var7 > 0) {
            ++var17;
            --var7;
         }

         if (var17 == var8) {
            break;
         }

         this.field3916.add(field3921.submit(new class70(this, var8, var17, var5)));
      }

   }

   public boolean method2399() {
      if (null == this.field3922 && null == this.field3916) {
         return true;
      } else {
         if (this.field3922 != null) {
            if (!this.field3922.isDone()) {
               return false;
            }

            this.field3922 = null;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3916.size(); ++var3) {
            if (!((Future)this.field3916.get(var3)).isDone()) {
               var2 = false;
            } else {
               this.field3916.remove(var3);
               --var3;
            }
         }

         if (!var2) {
            return false;
         } else {
            this.field3916 = null;
            return true;
         }
      }
   }

   public int method2394() {
      return this.field3919;
   }

   public boolean method2395() {
      return this.field3925;
   }

   public void method2396(int var1, class322 var2, int var3, int var4) {
      class120 var6;
      synchronized(class120.field1487) {
         if (class261.field2286 == 0) {
            var6 = new class120();
         } else {
            class120.field1487[--class261.field2286].method837();
            var6 = class120.field1487[class261.field2286];
         }
      }

      this.method2392(var6, var3, var2, var1);
      this.method2398(var6, var3, var2, var1);
      this.method2397(var6, var3, var2, var1);
      var2.method1701(var6);
      var6.method846();
   }

   void method2392(class120 var1, int var2, class322 var3, int var4) {
      float[] var6 = var3.method1704(this.field3919);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.field3917[var2] != null) {
         class75 var10 = this.field3917[var2][0];
         class75 var11 = this.field3917[var2][1];
         class75 var12 = this.field3917[var2][2];
         if (null != var10) {
            var7 = var10.method690(var4);
         }

         if (var11 != null) {
            var8 = var11.method690(var4);
         }

         if (null != var12) {
            var9 = var12.method690(var4);
         }
      }

      class4 var18 = class4.method12();
      var18.method8(1.0F, 0.0F, 0.0F, var7);
      class4 var19 = class4.method12();
      var19.method8(0.0F, 1.0F, 0.0F, var8);
      class4 var20 = class4.method12();
      var20.method8(0.0F, 0.0F, 1.0F, var9);
      class4 var13 = class4.method12();
      var13.method10(var20);
      var13.method10(var18);
      var13.method10(var19);
      class120 var14;
      synchronized(class120.field1487) {
         if (class261.field2286 == 0) {
            var14 = new class120();
         } else {
            class120.field1487[--class261.field2286].method837();
            var14 = class120.field1487[class261.field2286];
         }
      }

      var14.method848(var13);
      var1.method847(var14);
      var18.method11();
      var19.method11();
      var20.method11();
      var13.method11();
      var14.method846();
   }

   void method2397(class120 var1, int var2, class322 var3, int var4) {
      float[] var6 = var3.method1705(this.field3919);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.field3917[var2] != null) {
         class75 var10 = this.field3917[var2][3];
         class75 var11 = this.field3917[var2][4];
         class75 var12 = this.field3917[var2][5];
         if (var10 != null) {
            var7 = var10.method690(var4);
         }

         if (null != var11) {
            var8 = var11.method690(var4);
         }

         if (null != var12) {
            var9 = var12.method690(var4);
         }
      }

      var1.field1488[12] = var7;
      var1.field1488[13] = var8;
      var1.field1488[14] = var9;
   }

   void method2398(class120 var1, int var2, class322 var3, int var4) {
      float[] var6 = var3.method1706(this.field3919);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.field3917[var2] != null) {
         class75 var10 = this.field3917[var2][6];
         class75 var11 = this.field3917[var2][7];
         class75 var12 = this.field3917[var2][8];
         if (var10 != null) {
            var7 = var10.method690(var4);
         }

         if (var11 != null) {
            var8 = var11.method690(var4);
         }

         if (var12 != null) {
            var9 = var12.method690(var4);
         }
      }

      class120 var15;
      synchronized(class120.field1487) {
         if (class261.field2286 == 0) {
            var15 = new class120();
         } else {
            class120.field1487[--class261.field2286].method837();
            var15 = class120.field1487[class261.field2286];
         }
      }

      var15.method840(var7, var8, var9);
      var1.method847(var15);
      var15.method846();
   }
}
