public class class482 {
   static class425[] field3834;
   static int field3830;
   class298 field3831;
   class298 field3833;
   class79 field3832;

   public class482(class298 var1, class298 var2) {
      new class79(256);
      this.field3832 = new class79(256);
      this.field3833 = var1;
      this.field3831 = var2;
   }

   class408 method2369(int var1, int var2, int[] var3) {
      long var5 = this.method2373(var1, var2, false);
      class139 var7 = (class139)this.field3832.method709(var5);
      if (null != var7) {
         return var7.method909();
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class404 var8 = class404.method1975(this.field3833, var1, var2);
         if (null == var8) {
            return null;
         } else {
            class408 var9 = var8.method1973();
            this.field3832.method712(new class139(var9), var5);
            if (var3 != null) {
               var3[0] -= var9.field3150.length;
            }

            return var9;
         }
      }
   }

   class139 method2368(int var1, int var2) {
      long var4 = this.method2373(var1, var2, true);
      class139 var6 = (class139)this.field3832.method709(var4);
      if (var6 != null) {
         return var6;
      } else {
         class223 var7 = class223.method1328(this.field3831, var1, var2);
         if (var7 == null) {
            return new class139();
         } else {
            class139 var8 = new class139(var7);
            this.field3832.method712(var8, var4);
            return var8;
         }
      }
   }

   class408 method2370(int var1, int[] var2) {
      if (this.field3833.method1641() == 1) {
         return this.method2369(0, var1, var2);
      } else if (this.field3833.method1655(var1) == 1) {
         return this.method2369(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class139 method2371(int var1) {
      if (this.field3831.method1641() == 1) {
         return this.method2368(0, var1);
      } else if (this.field3831.method1655(var1) == 1) {
         return this.method2368(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public class408 method2372(int var1) {
      return this.method2370(var1, (int[])null);
   }

   long method2373(int var1, int var2, boolean var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >> 12);
      var5 |= var1 << 16;
      return var3 ? (long)var5 ^ 4294967296L : (long)var5;
   }
}
