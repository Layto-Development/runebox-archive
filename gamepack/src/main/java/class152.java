public final class class152 {
   int field1626;
   int field1627;
   int field1628;
   int field1631;
   int[] field1629 = new int[256];
   int[] field1630 = new int[256];

   public class152(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field1629[var2] = var1[var2];
      }

      this.method942();
   }

   public final int method939() {
      if (this.field1628 == 0) {
         this.method941();
         this.field1628 = 256;
      }

      return this.field1629[--this.field1628];
   }

   public final int method940() {
      if (this.field1628 == 0) {
         this.method941();
         this.field1628 = 256;
      }

      return this.field1629[this.field1628 - 1];
   }

   final void method941() {
      this.field1626 += ++this.field1627;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.field1630[var2];
         if ((var2 & 2) == 0) {
            if ((var2 & 1) == 0) {
               this.field1631 ^= this.field1631 << 13;
            } else {
               this.field1631 ^= this.field1631 >>> 6;
            }
         } else if ((var2 & 1) == 0) {
            this.field1631 ^= this.field1631 << 2;
         } else {
            this.field1631 ^= this.field1631 >>> 16;
         }

         this.field1631 += this.field1630[var2 + 128 & 255];
         int var4;
         this.field1630[var2] = var4 = this.field1626 + this.field1630[(var3 & 1020) >> 2] + this.field1631;
         this.field1629[var2] = this.field1626 = this.field1630[(var4 >> 8 & 1020) >> 2] + var3;
      }

   }

   final void method942() {
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
         var3 += this.field1629[var2];
         var4 += this.field1629[var2 + 1];
         var5 += this.field1629[var2 + 2];
         var6 += this.field1629[var2 + 3];
         var7 += this.field1629[var2 + 4];
         var8 += this.field1629[var2 + 5];
         var9 += this.field1629[var2 + 6];
         var10 += this.field1629[var2 + 7];
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
         this.field1630[var2] = var3;
         this.field1630[var2 + 1] = var4;
         this.field1630[var2 + 2] = var5;
         this.field1630[var2 + 3] = var6;
         this.field1630[var2 + 4] = var7;
         this.field1630[var2 + 5] = var8;
         this.field1630[var2 + 6] = var9;
         this.field1630[var2 + 7] = var10;
      }

      for(var2 = 0; var2 < 256; var2 += 8) {
         var3 += this.field1630[var2];
         var4 += this.field1630[var2 + 1];
         var5 += this.field1630[var2 + 2];
         var6 += this.field1630[var2 + 3];
         var7 += this.field1630[var2 + 4];
         var8 += this.field1630[var2 + 5];
         var9 += this.field1630[var2 + 6];
         var10 += this.field1630[var2 + 7];
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
         this.field1630[var2] = var3;
         this.field1630[var2 + 1] = var4;
         this.field1630[var2 + 2] = var5;
         this.field1630[var2 + 3] = var6;
         this.field1630[var2 + 4] = var7;
         this.field1630[var2 + 5] = var8;
         this.field1630[var2 + 6] = var9;
         this.field1630[var2 + 7] = var10;
      }

      this.method941();
      this.field1628 = 256;
   }
}
