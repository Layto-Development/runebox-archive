public class class216 {
   byte[] field1653 = null;
   int field1652 = 0;
   int field1654 = 0;

   class216() {
   }

   int method1100(int var1) {
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var1 >= 8 - this.field1654; var1 -= var5) {
         var5 = 8 - this.field1654;
         int var6 = (1 << var5) - 1;
         var3 += (this.field1653[this.field1652] >> this.field1654 & var6) << var4;
         this.field1654 = 0;
         ++this.field1652;
         var4 += var5;
      }

      if (var1 > 0) {
         var5 = (1 << var1) - 1;
         var3 += (this.field1653[this.field1652] >> this.field1654 & var5) << var4;
         this.field1654 += var1;
      }

      return var3;
   }

   int method1101() {
      int var2 = this.field1653[this.field1652] >> this.field1654 & 1;
      ++this.field1654;
      this.field1652 += this.field1654 >> 3;
      this.field1654 &= 7;
      return var2;
   }

   void method1102(byte[] var1, int var2) {
      this.field1653 = var1;
      this.field1652 = var2;
      this.field1654 = 0;
   }
}
