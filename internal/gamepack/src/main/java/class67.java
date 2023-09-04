public class class67 extends class308 {
   int field1123 = 0;
   int field1124 = 256;
   int field1126 = 1;
   int field1128;
   long field1125 = class80.method713();
   long[] field1127 = new long[10];

   public class67() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1127[var1] = this.field1125;
      }

   }

   public void method1671() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field1127[var2] = 0L;
      }

   }

   public int method1672(int var1, int var2) {
      int var4 = this.field1124;
      int var5 = this.field1126;
      this.field1124 = 300;
      this.field1126 = 1;
      this.field1125 = class80.method713();
      if (0L == this.field1127[this.field1128]) {
         this.field1124 = var4;
         this.field1126 = var5;
      } else if (this.field1125 > this.field1127[this.field1128]) {
         this.field1124 = (int)((long)(var1 * 2560) / (this.field1125 - this.field1127[this.field1128]));
      }

      if (this.field1124 < 25) {
         this.field1124 = 25;
      }

      if (this.field1124 > 256) {
         this.field1124 = 256;
         this.field1126 = (int)((long)var1 - (this.field1125 - this.field1127[this.field1128]) / 10L);
      }

      if (this.field1126 > var1) {
         this.field1126 = var1;
      }

      this.field1127[this.field1128] = this.field1125;
      this.field1128 = (1 + this.field1128) % 10;
      int var6;
      if (this.field1126 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (0L != this.field1127[var6]) {
               this.field1127[var6] += (long)this.field1126;
            }
         }
      }

      if (this.field1126 < var2) {
         this.field1126 = var2;
      }

      class51.method602((long)this.field1126);

      for(var6 = 0; this.field1123 < 256; this.field1123 += this.field1124) {
         ++var6;
      }

      this.field1123 &= 255;
      return var6;
   }
}
