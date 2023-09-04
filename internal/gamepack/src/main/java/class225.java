public class class225 {
   byte[] field2084 = null;
   int field2083 = 0;
   int field2085 = 0;

   class225() {
   }

   int method1332(int var1) {
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var1 >= 8 - this.field2085; var1 -= var5) {
         var5 = 8 - this.field2085;
         int var6 = (1 << var5) - 1;
         var3 += (this.field2084[this.field2083] >> this.field2085 & var6) << var4;
         this.field2085 = 0;
         ++this.field2083;
         var4 += var5;
      }

      if (var1 > 0) {
         var5 = (1 << var1) - 1;
         var3 += (this.field2084[this.field2083] >> this.field2085 & var5) << var4;
         this.field2085 += var1;
      }

      return var3;
   }

   int method1333() {
      int var2 = this.field2084[this.field2083] >> this.field2085 & 1;
      ++this.field2085;
      this.field2083 += this.field2085 >> 3;
      this.field2085 &= 7;
      return var2;
   }

   void method1334(byte[] var1, int var2) {
      this.field2084 = var1;
      this.field2083 = var2;
      this.field2085 = 0;
   }
}
