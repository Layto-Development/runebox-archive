public class class39 {
   static final byte[] field336 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   class366 field334 = new class366((byte[])null);
   int field330;
   int field337;
   int[] field331;
   int[] field332;
   int[] field333;
   int[] field335;
   long field329;

   class39() {
   }

   void method172(byte[] var1) {
      this.field334.field2650 = var1;
      this.field334.field2652 = 10;
      int var2 = this.field334.method1703();
      this.field330 = this.field334.method1703();
      this.field337 = 500000;
      this.field335 = new int[var2];

      class366 var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.field2652 += var5) {
         int var4 = this.field334.method1658();
         var5 = this.field334.method1658();
         if (var4 == 1297379947) {
            this.field335[var3] = this.field334.field2652;
            ++var3;
         }

         var10000 = this.field334;
      }

      this.field329 = 0L;
      this.field332 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field332[var3] = this.field335[var3];
      }

      this.field333 = new int[var2];
      this.field331 = new int[var2];
   }

   void method159() {
      this.field334.field2650 = null;
      this.field335 = null;
      this.field332 = null;
      this.field333 = null;
      this.field331 = null;
   }

   boolean method173() {
      return this.field334.field2650 != null;
   }

   int method160() {
      return this.field332.length;
   }

   void method161(int var1) {
      this.field334.field2652 = this.field332[var1];
   }

   void method162(int var1) {
      this.field332[var1] = this.field334.field2652;
   }

   void method163() {
      this.field334.field2652 = -1;
   }

   void method164(int var1) {
      int var2 = this.field334.method1641();
      int[] var10000 = this.field333;
      var10000[var1] += var2;
   }

   int method165(int var1) {
      int var2 = this.method166(var1);
      return var2;
   }

   int method166(int var1) {
      int var2 = this.field334.field2650[this.field334.field2652];
      if (var2 < 0) {
         var2 &= 255;
         this.field331[var1] = var2;
         ++this.field334.field2652;
      } else {
         var2 = this.field331[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method167(var1, var2);
      } else {
         int var3 = this.field334.method1641();
         if (var2 == 247 && var3 > 0) {
            int var4 = this.field334.field2650[this.field334.field2652] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field334.field2652;
               this.field331[var1] = var4;
               return this.method167(var1, var4);
            }
         }

         class366 var10000 = this.field334;
         var10000.field2652 += var3;
         return 0;
      }
   }

   int method167(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.field334.method1654();
         var4 = this.field334.method1641();
         class366 var10000;
         if (var3 == 47) {
            var10000 = this.field334;
            var10000.field2652 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field334.method1710();
            var4 -= 3;
            int var6 = this.field333[var1];
            this.field329 += (long)var6 * (long)(this.field337 - var5);
            this.field337 = var5;
            var10000 = this.field334;
            var10000.field2652 += var4;
            return 2;
         } else {
            var10000 = this.field334;
            var10000.field2652 += var4;
            return 3;
         }
      } else {
         var3 = field336[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field334.method1654() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field334.method1654() << 16;
         }

         return var4;
      }
   }

   long method171(int var1) {
      return this.field329 + (long)var1 * (long)this.field337;
   }

   int method168() {
      int var1 = this.field332.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field332[var4] >= 0 && this.field333[var4] < var3) {
            var2 = var4;
            var3 = this.field333[var4];
         }
      }

      return var2;
   }

   boolean method169() {
      int var1 = this.field332.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field332[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method170(long var1) {
      this.field329 = var1;
      int var3 = this.field332.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field333[var4] = 0;
         this.field331[var4] = 0;
         this.field334.field2652 = this.field335[var4];
         this.method164(var4);
         this.field332[var4] = this.field334.field2652;
      }

   }
}
