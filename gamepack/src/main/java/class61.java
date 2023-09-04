public class class61 {
   static final byte[] field1113 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   class184 field1111 = new class184((byte[])null);
   int field1107;
   int field1114;
   int[] field1108;
   int[] field1109;
   int[] field1110;
   int[] field1112;
   long field1106;

   class61() {
   }

   void method629(byte[] var1) {
      this.field1111.field1816 = var1;
      this.field1111.field1818 = 10;
      int var2 = this.field1111.method1174();
      this.field1107 = this.field1111.method1174();
      this.field1114 = 500000;
      this.field1112 = new int[var2];

      class184 var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.field1818 += var5) {
         int var4 = this.field1111.method1129();
         var5 = this.field1111.method1129();
         if (var4 == 1297379947) {
            this.field1112[var3] = this.field1111.field1818;
            ++var3;
         }

         var10000 = this.field1111;
      }

      this.field1106 = 0L;
      this.field1109 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field1109[var3] = this.field1112[var3];
      }

      this.field1110 = new int[var2];
      this.field1108 = new int[var2];
   }

   void method616() {
      this.field1111.field1816 = null;
      this.field1112 = null;
      this.field1109 = null;
      this.field1110 = null;
      this.field1108 = null;
   }

   boolean method630() {
      return this.field1111.field1816 != null;
   }

   int method617() {
      return this.field1109.length;
   }

   void method618(int var1) {
      this.field1111.field1818 = this.field1109[var1];
   }

   void method619(int var1) {
      this.field1109[var1] = this.field1111.field1818;
   }

   void method620() {
      this.field1111.field1818 = -1;
   }

   void method621(int var1) {
      int var2 = this.field1111.method1112();
      int[] var10000 = this.field1110;
      var10000[var1] += var2;
   }

   int method622(int var1) {
      int var2 = this.method623(var1);
      return var2;
   }

   int method623(int var1) {
      int var2 = this.field1111.field1816[this.field1111.field1818];
      if (var2 < 0) {
         var2 &= 255;
         this.field1108[var1] = var2;
         ++this.field1111.field1818;
      } else {
         var2 = this.field1108[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method624(var1, var2);
      } else {
         int var3 = this.field1111.method1112();
         if (var2 == 247 && var3 > 0) {
            int var4 = this.field1111.field1816[this.field1111.field1818] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field1111.field1818;
               this.field1108[var1] = var4;
               return this.method624(var1, var4);
            }
         }

         class184 var10000 = this.field1111;
         var10000.field1818 += var3;
         return 0;
      }
   }

   int method624(int var1, int var2) {
      int var3;
      int var4;
      if (var2 == 255) {
         var3 = this.field1111.method1125();
         var4 = this.field1111.method1112();
         class184 var10000;
         if (var3 == 47) {
            var10000 = this.field1111;
            var10000.field1818 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field1111.method1181();
            var4 -= 3;
            int var6 = this.field1110[var1];
            this.field1106 += (long)var6 * (long)(this.field1114 - var5);
            this.field1114 = var5;
            var10000 = this.field1111;
            var10000.field1818 += var4;
            return 2;
         } else {
            var10000 = this.field1111;
            var10000.field1818 += var4;
            return 3;
         }
      } else {
         var3 = field1113[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field1111.method1125() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field1111.method1125() << 16;
         }

         return var4;
      }
   }

   long method628(int var1) {
      return this.field1106 + (long)var1 * (long)this.field1114;
   }

   int method625() {
      int var1 = this.field1109.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field1109[var4] >= 0 && this.field1110[var4] < var3) {
            var2 = var4;
            var3 = this.field1110[var4];
         }
      }

      return var2;
   }

   boolean method626() {
      int var1 = this.field1109.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field1109[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method627(long var1) {
      this.field1106 = var1;
      int var3 = this.field1109.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field1110[var4] = 0;
         this.field1108[var4] = 0;
         this.field1111.field1818 = this.field1112[var4];
         this.method621(var4);
         this.field1109[var4] = this.field1111.field1818;
      }

   }
}
