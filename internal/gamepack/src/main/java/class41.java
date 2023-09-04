public class class41 {
   static class501[] field345;
   static int field341;
   class313 field343;
   class509 field342;
   class509 field344;

   public class41(class509 var1, class509 var2) {
      new class313(256);
      this.field343 = new class313(256);
      this.field344 = var1;
      this.field342 = var2;
   }

   class404 method175(int var1, int var2, int[] var3) {
      long var5 = this.method179(var1, var2, false);
      class202 var7 = (class202)this.field343.method1431(var5);
      if (null != var7) {
         return var7.method1058();
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class314 var8 = class314.method1437(this.field344, var1, var2);
         if (null == var8) {
            return null;
         } else {
            class404 var9 = var8.method1435();
            this.field343.method1434(new class202(var9), var5);
            if (var3 != null) {
               var3[0] -= var9.field2808.length;
            }

            return var9;
         }
      }
   }

   class202 method174(int var1, int var2) {
      long var4 = this.method179(var1, var2, true);
      class202 var6 = (class202)this.field343.method1431(var4);
      if (var6 != null) {
         return var6;
      } else {
         class365 var7 = class365.method1637(this.field342, var1, var2);
         if (var7 == null) {
            return new class202();
         } else {
            class202 var8 = new class202(var7);
            this.field343.method1434(var8, var4);
            return var8;
         }
      }
   }

   class404 method176(int var1, int[] var2) {
      if (this.field344.method2434() == 1) {
         return this.method175(0, var1, var2);
      } else if (this.field344.method2448(var1) == 1) {
         return this.method175(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class202 method177(int var1) {
      if (this.field342.method2434() == 1) {
         return this.method174(0, var1);
      } else if (this.field342.method2448(var1) == 1) {
         return this.method174(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public class404 method178(int var1) {
      return this.method176(var1, (int[])null);
   }

   long method179(int var1, int var2, boolean var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >> 12);
      var5 |= var1 << 16;
      return var3 ? (long)var5 ^ 4294967296L : (long)var5;
   }
}
