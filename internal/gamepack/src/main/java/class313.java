public final class class313 {
   class70 field2120;
   class70 field2121;
   class70[] field2119;
   int field2118 = 0;
   int field2122;

   public class313(int var1) {
      this.field2122 = var1;
      this.field2119 = new class70[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class70 var3 = this.field2119[var2] = new class70();
         var3.field530 = var3;
         var3.field532 = var3;
      }

   }

   public class70 method1431(long var1) {
      class70 var3 = this.field2119[(int)(var1 & (long)(this.field2122 - 1))];

      for(this.field2120 = var3.field530; this.field2120 != var3; this.field2120 = this.field2120.field530) {
         if (this.field2120.field531 == var1) {
            class70 var4 = this.field2120;
            this.field2120 = this.field2120.field530;
            return var4;
         }
      }

      this.field2120 = null;
      return null;
   }

   public int method1430() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.field2122; ++var2) {
         class70 var3 = this.field2119[var2];

         for(class70 var4 = var3.field530; var4 != var3; var4 = var4.field530) {
            ++var1;
         }
      }

      return var1;
   }

   public void method1434(class70 var1, long var2) {
      if (var1.field532 != null) {
         var1.method295();
      }

      class70 var4 = this.field2119[(int)(var2 & (long)(this.field2122 - 1))];
      var1.field532 = var4.field532;
      var1.field530 = var4;
      var1.field532.field530 = var1;
      var1.field530.field532 = var1;
      var1.field531 = var2;
   }

   public class70 method1432() {
      this.field2118 = 0;
      return this.method1433();
   }

   public class70 method1433() {
      class70 var1;
      if (this.field2118 > 0 && this.field2121 != this.field2119[this.field2118 - 1]) {
         var1 = this.field2121;
         this.field2121 = var1.field530;
         return var1;
      } else {
         do {
            if (this.field2118 >= this.field2122) {
               return null;
            }

            var1 = this.field2119[this.field2118++].field530;
         } while(var1 == this.field2119[this.field2118 - 1]);

         this.field2121 = var1.field530;
         return var1;
      }
   }
}
