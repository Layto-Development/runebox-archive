import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class class272 extends class306 {
   public static ThreadPoolExecutor field1913;
   static int field1912;
   boolean field1917;
   class137[][] field1909 = (class137[][])null;
   int field1911 = 0;
   int field1916;
   List field1908;
   Future field1914;
   public class137[][] field1915 = (class137[][])null;
   public class344 field1910;

   public class272(class509 var1, class509 var2, int var3, boolean var4) {
      this.field1916 = var3;
      byte[] var5 = var1.method2422(this.field1916 >> 16 & '\uffff', this.field1916 & '\uffff');
      class366 var6 = new class366(var5);
      int var7 = var6.method1654();
      int var8 = var6.method1703();
      byte[] var9;
      if (var4) {
         var9 = var2.method2430(0, var8);
      } else {
         var9 = var2.method2430(var8, 0);
      }

      this.field1910 = new class344(var8, var9);
      this.field1908 = new ArrayList();
      this.field1914 = field1913.submit(new class527(this, var6, var7));
   }

   void method1274(class366 var1, int var2) {
      var1.method1703();
      var1.method1703();
      this.field1911 = var1.method1654();
      int var4 = var1.method1703();
      this.field1909 = new class137[this.field1910.method1592().method1166()][];
      this.field1915 = new class137[this.field1910.method1593()][];
      class249[] var5 = new class249[var4];

      int var6;
      int var8;
      int var10;
      for(var6 = 0; var6 < var4; ++var6) {
         var8 = var1.method1654();
         class506 var9 = (class506)class1.method2(class506.method2420(), var8);
         if (var9 == null) {
            var9 = class506.field4058;
         }

         var10 = var1.method1665();
         int var12 = var1.method1654();
         class423[] var13 = new class423[]{class423.field2985, class423.field2981, class423.field2982, class423.field2983, class423.field2989, class423.field2999, class423.field2986, class423.field2987, class423.field2997, class423.field2991, class423.field2990, class423.field2988, class423.field2992, class423.field2984, class423.field2993, class423.field2994, class423.field2995};
         class423 var14 = (class423)class1.method2(var13, var12);
         if (var14 == null) {
            var14 = class423.field2985;
         }

         class137 var19 = new class137();
         var19.method494(var1, var2, (byte)-47);
         var5[var6] = new class249(this, var19, var9, var14, var10);
         int var15 = var9.method2419();
         class137[][] var16;
         if (class506.field4061 == var9) {
            var16 = this.field1909;
         } else {
            var16 = this.field1915;
         }

         if (null == var16[var10]) {
            var16[var10] = new class137[var15];
         }

         if (var9 == class506.field4057) {
            this.field1917 = true;
         }
      }

      var6 = var4 / class346.field2564;
      int var7 = var4 % class346.field2564;
      int var17 = 0;

      for(var10 = 0; var10 < class346.field2564; ++var10) {
         var8 = var17;
         var17 += var6;
         if (var7 > 0) {
            ++var17;
            --var7;
         }

         if (var17 == var8) {
            break;
         }

         this.field1908.add(field1913.submit(new class300(this, var8, var17, var5)));
      }

   }

   public boolean method1280() {
      if (null == this.field1914 && null == this.field1908) {
         return true;
      } else {
         if (this.field1914 != null) {
            if (!this.field1914.isDone()) {
               return false;
            }

            this.field1914 = null;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < this.field1908.size(); ++var3) {
            if (!((Future)this.field1908.get(var3)).isDone()) {
               var2 = false;
            } else {
               this.field1908.remove(var3);
               --var3;
            }
         }

         if (!var2) {
            return false;
         } else {
            this.field1908 = null;
            return true;
         }
      }
   }

   public int method1275() {
      return this.field1911;
   }

   public boolean method1276() {
      return this.field1917;
   }

   public void method1277(int var1, class54 var2, int var3, int var4) {
      class475 var6;
      synchronized(class475.field3765) {
         if (class180.field1453 == 0) {
            var6 = new class475();
         } else {
            class475.field3765[--class180.field1453].method2233();
            var6 = class475.field3765[class180.field1453];
         }
      }

      this.method1273(var6, var3, var2, var1);
      this.method1279(var6, var3, var2, var1);
      this.method1278(var6, var3, var2, var1);
      var2.method230(var6);
      var6.method2242();
   }

   void method1273(class475 var1, int var2, class54 var3, int var4) {
      float[] var6 = var3.method233(this.field1911);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.field1909[var2] != null) {
         class137 var10 = this.field1909[var2][0];
         class137 var11 = this.field1909[var2][1];
         class137 var12 = this.field1909[var2][2];
         if (null != var10) {
            var7 = var10.method496(var4);
         }

         if (var11 != null) {
            var8 = var11.method496(var4);
         }

         if (null != var12) {
            var9 = var12.method496(var4);
         }
      }

      class158 var18 = class158.method606();
      var18.method602(1.0F, 0.0F, 0.0F, var7);
      class158 var19 = class158.method606();
      var19.method602(0.0F, 1.0F, 0.0F, var8);
      class158 var20 = class158.method606();
      var20.method602(0.0F, 0.0F, 1.0F, var9);
      class158 var13 = class158.method606();
      var13.method604(var20);
      var13.method604(var18);
      var13.method604(var19);
      class475 var14;
      synchronized(class475.field3765) {
         if (class180.field1453 == 0) {
            var14 = new class475();
         } else {
            class475.field3765[--class180.field1453].method2233();
            var14 = class475.field3765[class180.field1453];
         }
      }

      var14.method2244(var13);
      var1.method2243(var14);
      var18.method605();
      var19.method605();
      var20.method605();
      var13.method605();
      var14.method2242();
   }

   void method1278(class475 var1, int var2, class54 var3, int var4) {
      float[] var6 = var3.method234(this.field1911);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.field1909[var2] != null) {
         class137 var10 = this.field1909[var2][3];
         class137 var11 = this.field1909[var2][4];
         class137 var12 = this.field1909[var2][5];
         if (var10 != null) {
            var7 = var10.method496(var4);
         }

         if (null != var11) {
            var8 = var11.method496(var4);
         }

         if (null != var12) {
            var9 = var12.method496(var4);
         }
      }

      var1.field3766[12] = var7;
      var1.field3766[13] = var8;
      var1.field3766[14] = var9;
   }

   void method1279(class475 var1, int var2, class54 var3, int var4) {
      float[] var6 = var3.method235(this.field1911);
      float var7 = var6[0];
      float var8 = var6[1];
      float var9 = var6[2];
      if (this.field1909[var2] != null) {
         class137 var10 = this.field1909[var2][6];
         class137 var11 = this.field1909[var2][7];
         class137 var12 = this.field1909[var2][8];
         if (var10 != null) {
            var7 = var10.method496(var4);
         }

         if (var11 != null) {
            var8 = var11.method496(var4);
         }

         if (var12 != null) {
            var9 = var12.method496(var4);
         }
      }

      class475 var15;
      synchronized(class475.field3765) {
         if (0 == class180.field1453) {
            var15 = new class475();
         } else {
            class475.field3765[--class180.field1453].method2233();
            var15 = class475.field3765[class180.field1453];
         }
      }

      var15.method2236(var7, var8, var9);
      var1.method2243(var15);
      var15.method2242();
   }
}
