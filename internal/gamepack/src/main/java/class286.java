public class class286 extends class454 {
   int field1966 = 0;
   int field1967 = 256;
   int field1969 = 1;
   int field1971;
   long field1968 = class123.method471();
   long[] field1970 = new long[10];

   public class286() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1970[var1] = this.field1968;
      }

   }

   public void method2112() {
      for(int var2 = 0; var2 < 10; ++var2) {
         this.field1970[var2] = 0L;
      }

   }

   public int method2113(int var1, int var2) {
      int var4 = this.field1967;
      int var5 = this.field1969;
      this.field1967 = 300;
      this.field1969 = 1;
      this.field1968 = class123.method471();
      if (0L == this.field1970[this.field1971]) {
         this.field1967 = var4;
         this.field1969 = var5;
      } else if (this.field1968 > this.field1970[this.field1971]) {
         this.field1967 = (int)((long)(var1 * 2560) / (this.field1968 - this.field1970[this.field1971]));
      }

      if (this.field1967 < 25) {
         this.field1967 = 25;
      }

      if (this.field1967 > 256) {
         this.field1967 = 256;
         this.field1969 = (int)((long)var1 - (this.field1968 - this.field1970[this.field1971]) / 10L);
      }

      if (this.field1969 > var1) {
         this.field1969 = var1;
      }

      this.field1970[this.field1971] = this.field1968;
      this.field1971 = (1 + this.field1971) % 10;
      int var6;
      if (this.field1969 > 1) {
         for(var6 = 0; var6 < 10; ++var6) {
            if (0L != this.field1970[var6]) {
               this.field1970[var6] += (long)this.field1969;
            }
         }
      }

      if (this.field1969 < var2) {
         this.field1969 = var2;
      }

      class415.method1902((long)this.field1969);

      for(var6 = 0; this.field1966 < 256; this.field1966 += this.field1967) {
         ++var6;
      }

      this.field1966 &= 255;
      return var6;
   }
}
