public class class404 {
   class434[] field3121 = new class434[10];
   int field3122;
   int field3123;

   class404(class184 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.readUnsignedByte();
         if (var3 != 0) {
            --var1.field1818;
            this.field3121[var2] = new class434();
            this.field3121[var2].method2132(var1);
         }
      }

      this.field3122 = var1.method1174();
      this.field3123 = var1.method1174();
   }

   public class408 method1973() {
      byte[] var1 = this.method1976();
      return new class408(22050, var1, this.field3122 * 22050 / 1000, this.field3123 * 22050 / 1000);
   }

   public final int method1974() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field3121[var2] != null && this.field3121[var2].field3301 / 20 < var1) {
            var1 = this.field3121[var2].field3301 / 20;
         }
      }

      if (this.field3122 < this.field3123 && this.field3122 / 20 < var1) {
         var1 = this.field3122 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field3121[var2] != null) {
               class434 var10000 = this.field3121[var2];
               var10000.field3301 -= var1 * 20;
            }
         }

         if (this.field3122 < this.field3123) {
            this.field3122 -= var1 * 20;
            this.field3123 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method1976() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field3121[var2] != null && this.field3121[var2].field3293 + this.field3121[var2].field3301 > var1) {
            var1 = this.field3121[var2].field3293 + this.field3121[var2].field3301;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field3121[var4] != null) {
               int var5 = this.field3121[var4].field3293 * 22050 / 1000;
               int var6 = this.field3121[var4].field3301 * 22050 / 1000;
               int[] var7 = this.field3121[var4].method2131(var5, this.field3121[var4].field3293);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static class404 method1975(class298 var0, int var1, int var2) {
      byte[] var3 = var0.method1629(var1, var2);
      return var3 == null ? null : new class404(new class184(var3));
   }
}
