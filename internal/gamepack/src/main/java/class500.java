public class class500 extends class460 {
   static class501[] field4001;
   static String field3998;
   class153 field4000 = new class153();
   class429 field4002 = new class429();
   class5 field3999;

   class500(class5 var1) {
      this.field3999 = var1;
   }

   protected class460 method2169() {
      class251 var1 = (class251)this.field4002.method1991();
      if (var1 == null) {
         return null;
      } else {
         return (class460)(var1.field1811 != null ? var1.field1811 : this.method2170());
      }
   }

   protected class460 method2170() {
      class251 var1;
      do {
         var1 = (class251)this.field4002.method1993();
         if (var1 == null) {
            return null;
         }
      } while(null == var1.field1811);

      return var1.field1811;
   }

   protected int method2167() {
      return 0;
   }

   protected void method2172(int[] var1, int var2, int var3) {
      this.field4000.method2172(var1, var2, var3);

      for(class251 var6 = (class251)this.field4002.method1991(); null != var6; var6 = (class251)this.field4002.method1993()) {
         if (!this.field3999.method46(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field1822) {
                  this.method2387(var6, var1, var4, var5, var5 + var4);
                  var6.field1822 -= var5;
                  break;
               }

               this.method2387(var6, var1, var4, var6.field1822, var4 + var5);
               var4 += var6.field1822;
               var5 -= var6.field1822;
            } while(!this.field3999.method36(var6, var1, var4, var5));
         }
      }

   }

   protected void method2171(int var1) {
      this.field4000.method2171(var1);

      for(class251 var3 = (class251)this.field4002.method1991(); var3 != null; var3 = (class251)this.field4002.method1993()) {
         if (!this.field3999.method46(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field1822) {
                  this.method2388(var3, var2);
                  var3.field1822 -= var2;
                  break;
               }

               this.method2388(var3, var3.field1822);
               var2 -= var3.field1822;
            } while(!this.field3999.method36(var3, (int[])null, 0, var2));
         }
      }

   }

   void method2387(class251 var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.field3999.field11[var1.field1813] & 4) && var1.field1817 < 0) {
         int var7 = this.field3999.field38[var1.field1813] / class62.field481;

         while(true) {
            int var8 = (var7 + 1048575 - var1.field1823) / var7;
            if (var8 > var4) {
               var1.field1823 += var7 * var4;
               break;
            }

            var1.field1811.method2172(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.field1823 += var8 * var7 - 1048576;
            int var9 = class62.field481 / 100;
            int var10 = 262144 / var7;
            if (var10 < var9) {
               var9 = var10;
            }

            class271 var11 = var1.field1811;
            if (this.field3999.field13[var1.field1813] == 0) {
               var1.field1811 = class271.method1231(var1.field1805, var11.method1241(), var11.method1235(), var11.method1236());
            } else {
               var1.field1811 = class271.method1231(var1.field1805, var11.method1241(), 0, var11.method1236());
               this.field3999.method29(var1, var1.field1804.field1026[var1.field1808] < 0);
               var1.field1811.method1264(var9, var11.method1235());
            }

            if (var1.field1804.field1026[var1.field1808] < 0) {
               var1.field1811.method1232(-1);
            }

            var11.method1239(var9);
            var11.method2172(var2, var3, var5 - var3);
            if (var11.method1243()) {
               this.field4000.method586(var11);
            }
         }
      }

      var1.field1811.method2172(var2, var3, var4);
   }

   void method2388(class251 var1, int var2) {
      if ((this.field3999.field11[var1.field1813] & 4) != 0 && var1.field1817 < 0) {
         int var4 = this.field3999.field38[var1.field1813] / class62.field481;
         int var5 = (var4 + 1048575 - var1.field1823) / var4;
         var1.field1823 = var2 * var4 + var1.field1823 & 1048575;
         if (var5 <= var2) {
            if (0 == this.field3999.field13[var1.field1813]) {
               var1.field1811 = class271.method1231(var1.field1805, var1.field1811.method1241(), var1.field1811.method1235(), var1.field1811.method1236());
            } else {
               var1.field1811 = class271.method1231(var1.field1805, var1.field1811.method1241(), 0, var1.field1811.method1236());
               this.field3999.method29(var1, var1.field1804.field1026[var1.field1808] < 0);
            }

            if (var1.field1804.field1026[var1.field1808] < 0) {
               var1.field1811.method1232(-1);
            }

            var2 = var1.field1823 / var4;
         }
      }

      var1.field1811.method2171(var2);
   }
}
