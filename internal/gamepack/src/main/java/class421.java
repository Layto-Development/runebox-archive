public final class class421 {
   int field2967;
   int field2968;
   int field2969;
   int field2972;
   int[] field2970 = new int[256];
   int[] field2971 = new int[256];

   public class421(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field2970[var2] = var1[var2];
      }

      this.method1948();
   }

   public final int method1945() {
      if (0 == this.field2969) {
         this.method1947();
         this.field2969 = 256;
      }

      return this.field2970[--this.field2969];
   }

   public final int method1946() {
      if (this.field2969 == 0) {
         this.method1947();
         this.field2969 = 256;
      }

      return this.field2970[this.field2969 - 1];
   }

   final void method1947() {
      this.field2967 += ++this.field2968;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field2971[var2];
         if ((var2 & 2) == 0) {
            if (0 == (var2 & 1)) {
               this.field2972 ^= this.field2972 << 13;
            } else {
               this.field2972 ^= this.field2972 >>> 6;
            }
         } else if (0 == (var2 & 1)) {
            this.field2972 ^= this.field2972 << 2;
         } else {
            this.field2972 ^= this.field2972 >>> 16;
         }

         this.field2972 += this.field2971[var2 + 128 & 255];
         int var4;
         this.field2971[var2] = var4 = this.field2967 + this.field2971[(var3 & 1020) >> 2] + this.field2972;
         this.field2970[var2] = this.field2967 = this.field2971[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   final void method1948() {
      int var10 = -1640531527;
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;

      int var2;
      for(var2 = 0; var2 < 4; ++var2) {
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field2970[var2];
         var4 += this.field2970[var2 + 1];
         var5 += this.field2970[var2 + 2];
         var6 += this.field2970[var2 + 3];
         var7 += this.field2970[var2 + 4];
         var8 += this.field2970[var2 + 5];
         var9 += this.field2970[var2 + 6];
         var10 += this.field2970[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field2971[var2] = var3;
         this.field2971[var2 + 1] = var4;
         this.field2971[var2 + 2] = var5;
         this.field2971[var2 + 3] = var6;
         this.field2971[var2 + 4] = var7;
         this.field2971[var2 + 5] = var8;
         this.field2971[var2 + 6] = var9;
         this.field2971[var2 + 7] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field2971[var2];
         var4 += this.field2971[var2 + 1];
         var5 += this.field2971[var2 + 2];
         var6 += this.field2971[var2 + 3];
         var7 += this.field2971[var2 + 4];
         var8 += this.field2971[var2 + 5];
         var9 += this.field2971[var2 + 6];
         var10 += this.field2971[var2 + 7];
         var3 ^= var4 << 11;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 >>> 2;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 << 8;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 >>> 16;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 << 10;
         var10 += var7;
         var8 += var9;
         var8 ^= var9 >>> 4;
         var3 += var8;
         var9 += var10;
         var9 ^= var10 << 8;
         var4 += var9;
         var10 += var3;
         var10 ^= var3 >>> 9;
         var5 += var10;
         var3 += var4;
         this.field2971[var2] = var3;
         this.field2971[var2 + 1] = var4;
         this.field2971[var2 + 2] = var5;
         this.field2971[var2 + 3] = var6;
         this.field2971[var2 + 4] = var7;
         this.field2971[var2 + 5] = var8;
         this.field2971[var2 + 6] = var9;
         this.field2971[var2 + 7] = var10;
      }

      this.method1947();
      this.field2969 = 256;
   }
}
